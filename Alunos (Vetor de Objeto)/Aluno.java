
public class Aluno {
	public String RA, nome;
	float N1, N2, media;
	
	public Aluno(String rA, String nome, float n1, float n2) {
		RA = rA;
		this.nome = nome;
		N1 = n1;
		N2 = n2;
		media = (N1+N2)/2;
	}
	
	public String imprimir()
	{
		return "Aluno: "+nome+" - RA: "+RA+"\nN1 = "+N1+"\nN2 = "+N2+"\nMedía = "+media;
	}
	
}
