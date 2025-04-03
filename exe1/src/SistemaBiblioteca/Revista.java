package SistemaBiblioteca;

public class Revista extends ItemBiblioteca {
	
	
	private String periodicidade;
	private String editora;
	private Integer numero;
	
	public String detalhes() {
		return " Periodiciade: " + this.periodicidade + " Editora: " + this.editora + " Numero: " + this.numero; 
	}
	
	public String getPeriodicidade() {
		return periodicidade;
	}
	public void setPeriodicidade(String periodicidade) {
		this.periodicidade = periodicidade;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	

}
