package SistemaBiblioteca;

import java.util.ArrayList;

public class Usuario {
	
	private String nome;
	private Integer idUsuario;
	private ArrayList<ItemBiblioteca> itensEmprestados
			=new ArrayList<ItemBiblioteca>();
	
	public boolean emprestarItem(ItemBiblioteca item) {
		return true;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
 	

}
