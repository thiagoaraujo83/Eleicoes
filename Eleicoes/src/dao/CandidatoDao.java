package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import Util.ConnectionUtil;
import model.Candidato;

public class CandidatoDao{
	
	private static CandidatoDao instance;
	private Connection con = ConnectionUtil.getConnection();
	
	
	/*
	 * Singleton
	 */
	
	public static CandidatoDao getInstance() {
	if (instance == null) {
		instance = new CandidatoDao();
	}
	return instance;
}
	
		
	public void salvar (Candidato t) throws SQLException{
		try {
			String sql = "insert into candidato (nomeCandidato, partido_candidato) values (?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, t.getNomeCandidato());
			pstmt.setString(2,t.getPartido_candidato());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
	}
	public void atualizar(Candidato t) throws SQLException {
		try {
			String sql = "update candidato set nomeCandidato= ?, partido_candidato= ?, wherw id =?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, t.getNomeCandidato());
			pstmt.setString(2,t.getPartido_candidato());
			pstmt.setInt(3, t.getIdCandidato());
			pstmt.executeUpdate();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
	}
	public void excluir(int idCandidato) throws SQLException {
		try {
			String sql = "delete from candidato wherw id =?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idCandidato);
			pstmt.executeUpdate();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Candidato> listar()throws Exception {
		List<Candidato> listaCandidatos = new ArrayList<Candidato>();
		try {
			String sql = "select from candidato";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Candidato c = new Candidato(rs.getInt("idCandidato"), rs.getString("nomeCandidato"), rs.getString("partido_candidato"), rs.getBoolean("fichalimpa"));
				
				
				listaCandidatos.add(c);
				
			}
			}catch (SQLException e) {
			e.printStackTrace();
				
			}
			return listaCandidatos;
		
			}
		
}

