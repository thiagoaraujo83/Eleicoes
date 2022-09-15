package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Util.ConnectionUtil;
import model.Candidato;

public class CandidatoDao{
	
	private static CandidatoDao instance;
	private List<Candidato> listaCandidatos = new ArrayList<>();
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
	
		
	public void salvar (Candidato t) {
		try {
			String sql = "insert into candidato (nomeCandidato, partido_candidato, fichalimpa) values (?, ?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, t.getNomeCandidato());
			pstmt.setString(2,t.getPartido_candidato());
			pstmt.setBoolean(3, t.getFichalimpa());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
	}
	public void atualizar(Candidato t)  {
		try {
			String sql = "update candidato set nomeCandidato= ?, partido_candidato= ?, fichalimpa=?, wherw id =?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, t.getNomeCandidato());
			pstmt.setString(2,t.getPartido_candidato());
			pstmt.setBoolean(3, t.getFichalimpa());
			pstmt.setInt(4, t.getIdCandidato());
			pstmt.executeUpdate();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
	}
	public void excluir(int idCandidato)  {
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


	public List<Candidato> getListaCandidatos() {
		return listaCandidatos;
	}


	public void setListaCandidatos(List<Candidato> listaCandidatos) {
		this.listaCandidatos = listaCandidatos;
	}
		
}

