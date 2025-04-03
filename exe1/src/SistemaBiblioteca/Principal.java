package SistemaBiblioteca;

public class Principal {

	public static void main(String[] args) {
		
		Livro l1 = new Livro("José da Silva", "1234567");
		l1.setTitulo("Java 2 para web");
		l1.setAno(2016);
		l1.setNumeroPaginas(50);
		l1.detalhes();
		System.out.println(l1.detalhes());
		
		Revista r1 = new Revista();
		r1.setTitulo("Veja");
		r1.setPeriodicidade("Semanal");
		r1.setEditora("Abril");
		r1.setNumero(4);
		r1.setAno(2018);
		r1.detalhes();
		System.out.println(r1.detalhes());
		
		Usuario u1 = new Usuario();
		u1.setNome("Molina");
		u1.setIdUsuario(1);
		
		u1.emprestarItem(r1);
		u1.emprestarItem(l1);
	}
	
	
}
