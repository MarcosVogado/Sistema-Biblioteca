package SistemaBiblioteca;

public class ItemBiblioteca {
	
	private String titulo;
	private Integer ano;
	private boolean disponivel;
	
	public void emprestar() {
		
	}
	
	public void devolver() {
		
	}
	
	public String detalhes() {
		return "";
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	

}
