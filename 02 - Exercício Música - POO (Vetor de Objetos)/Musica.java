
public class Musica {
	public String codigo, nome, autor;
		
	public Musica(String codigo, String nome, String autor) {	
		this.codigo = codigo;
		this.nome = nome;
		this.autor = autor;
	}

	public String imprimir()
	{
		return "C�digo: "+codigo+"\nNome da m�sica: "+nome+"\nAutor: "+autor;
	}
	
}
