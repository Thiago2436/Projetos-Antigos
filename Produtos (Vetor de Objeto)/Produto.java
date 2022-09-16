
public class Produto {
	public String codigo, descricao;
	public float preco;
	
	public Produto(String codigo, String descricao, float preco) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public String exibir()
	{
		return "Produto: "+descricao+" ("+codigo+")\n\nPreço: R$ "+preco;
	}
	
		
}
