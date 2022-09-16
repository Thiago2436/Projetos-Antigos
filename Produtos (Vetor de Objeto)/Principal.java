 ListaAimport javax.swing.JOptionPane;

public class Principal {

	public static int menu()
	{
		int op = Integer.parseInt(JOptionPane.showInputDialog("1. Cadastrar"
				+ "\n2. Listar"
				+ "\n3. Sair"));
		return op;
	}
	
	public static int cadastrar(Produto lista[], int qt)
	{
		int i;
		String c, d;
		float p;
		if (qt==10)
			JOptionPane.showMessageDialog(null, "Lista cheia!!");
		else
		{
			c = JOptionPane.showInputDialog("Informe o código do produto");
			d = JOptionPane.showInputDialog("Informe a descrição");
			p = Float.parseFloat(JOptionPane.showInputDialog("Preço"));		
			lista[qt++] = new Produto(c,d,p);
		}
		return qt;
	}
	
	public static void listar(Produto lista[], int qt)
	{
		int i;
		for (i=0;i<qt;i++)
			JOptionPane.showMessageDialog(null, lista[i].exibir());
	}
	
	public static void main(String args[])
	{	
		int opcao, pos=0;
		Produto listaProd[] = new Produto[10];
		do
		{
			opcao=menu();
			switch (opcao)
			{
			case 1: pos=cadastrar(listaProd, pos); break;
			case 2: listar(listaProd, pos); break;
			case 3: JOptionPane.showMessageDialog(null, "Fim de programa"); break;
			default: JOptionPane.showMessageDialog(null, "Opção inválida, escolha entre 1 e 4");
			}
			
		} while (opcao!=3);
	}
}
