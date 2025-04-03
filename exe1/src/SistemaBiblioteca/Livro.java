package SistemaBiblioteca;

public class Livro extends ItemBiblioteca {

	private String autor;
	private String isbn;
	private Integer numeroPaginas;
	
	
	// Metódo construtor da classe Livro
	public  Livro(String autor, String isbn) {
		this.autor = autor;
		this.isbn = isbn;
	}
	
	public Livro() {
		
	}
	
	public String detalhes( ) {
		return " Autor: " + autor + " ISBN: " + isbn + " Páginas: " + numeroPaginas;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	
}
