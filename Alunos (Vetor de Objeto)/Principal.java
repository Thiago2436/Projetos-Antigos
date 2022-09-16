import javax.swing.JOptionPane;

public class Principal {
	
	public static int menu()
	{
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("1. Inserir"
				+ "\n2. Listar"
				+ "\n3. Consultar"
				+ "\n4. Média da sala"
				+ "\n5. Aluno com a maior média"
				+ "\n6. Sair"));
		return escolha;
	}
	
	public static int inserir(Aluno l[], int fim)
	{
		if (fim<100)
		{
			String ra = JOptionPane.showInputDialog("RA");
			String nome = JOptionPane.showInputDialog("Nome");
			float n1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
			float n2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
			l[fim++] = new Aluno(ra, nome, n1, n2);
		}
		else
			JOptionPane.showMessageDialog(null, "Lista cheia!!");
		return fim;
	}
	
	public static void exibir(Aluno l[], int fim)
	{
		for (int i=0; i<fim; i++)
			JOptionPane.showMessageDialog(null,l[i].imprimir());
	}
	
	public static String consultar(Aluno l[], int fim)
	{
		String n = JOptionPane.showInputDialog("Informe o nome do aluno para busca");
		for (int i=0; i<fim; i++)
		{
			if (l[i].nome.equalsIgnoreCase(n))
				return l[i].imprimir();
		}
		return "Aluno não cadastrado";
	}
		
	public static float calcMedia (Aluno l[], int fim)
	{
		float mediaSala = 0;
		for (int i=0; i<fim; i++)
			mediaSala += l[i].media;
		return mediaSala/fim;
	}
	
	public static String maiorMedia (Aluno l[], int fim)
	{
		int posMaior = 0;
		for (int i=1; i<fim; i++)
		{
			if (l[i].media > l[posMaior].media)
				posMaior = i;
		}
		return "O aluno com a maior média ("+l[posMaior].media+") é "+l[posMaior].nome;
	}

	public static void main(String[] args) {
		Aluno listaAlunos[] = new Aluno[100];
		int op, pos = 0;
		
		do
		{
			op = menu();
			switch (op)
			{
			case 1: pos=inserir(listaAlunos, pos); 
					break;
			case 2: exibir(listaAlunos, pos); 
					break;
			case 3: JOptionPane.showMessageDialog(null, consultar(listaAlunos,pos)); 
					break;
			case 4: JOptionPane.showMessageDialog(null, "Média da sala = "
			        +calcMedia(listaAlunos, pos)); 
					break;
			case 5: JOptionPane.showMessageDialog(null, maiorMedia(listaAlunos, pos));
			        break;
			case 6: JOptionPane.showMessageDialog(null, "FIM"); 
					break;
			default: JOptionPane.showMessageDialog(null, "Opção inválida!!");
			}
			
		} while (op!=6);
	}

}
