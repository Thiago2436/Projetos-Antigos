import javax.swing.JOptionPane;

public class Principal {

	
		public static int menu()
		{
			int escolha = Integer.parseInt(JOptionPane.showInputDialog("1. Inserir\n2. Listar\n3. Sair"));
			return escolha;
		}
		
		public static int inserir(Musica l[], int fim)
		{
			if (fim<100)
			{
				String codigo = JOptionPane.showInputDialog("Código");
				String nome = JOptionPane.showInputDialog("Nome");
				String autor = JOptionPane.showInputDialog("Autor");
				l[fim++] = new Musica(codigo, nome, autor);
			}
			else
				JOptionPane.showMessageDialog(null, "Lista cheia!!");
			return fim;
		}
		
		public static void exibir(Musica l[], int fim)
		{
			for (int i=0; i<fim; i++)
				JOptionPane.showMessageDialog(null,l[i].imprimir());
		}

		public static void main(String[] args) {
			Musica listaMusica[] = new Musica[100];
			int op, pos = 0;
			
			do
			{
				op = menu();
				switch (op)
				{
				case 1: pos=inserir(listaMusica, pos); break;
				case 2: exibir(listaMusica, pos); break;
				case 3: JOptionPane.showMessageDialog(null, "FIM"); break;
				default: JOptionPane.showMessageDialog(null, "Opção inválida!!");
				}
				
			} while (op!=3);


	}

}
