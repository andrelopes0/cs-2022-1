package tarefa006;
import java.util.Scanner;

public class Questao4Sonarlint {
		
		private static class Pe�a{
			int codigo;
			double valor;
			int quantidade;
		}

	   	static Pe�a peca1 = new Pe�a();
	    static Pe�a peca2 = new Pe�a();
	    
	    public static void main(String[] args) {
	        Scanner s = new Scanner( System.in );

	        peca1.codigo = 0;
	        peca2.codigo = 0;
	        double ipi;
	        double valorTotal;

	        System.out.println( "Digite valor do IPI: ");
	        ipi = s.nextDouble();

	        System.out.println( "Digite c�digo da pe�a 1: ");
	        peca1.codigo = s.nextInt();

	        System.out.println( "Digite valor da pe�a 1: ");
	        peca1.valor = s.nextDouble();

	        System.out.println( "Digite quantidade da pe�a 1: ");
	        peca1.quantidade = s.nextInt();

	        System.out.println( "Digite c�digo da pe�a 2: ");
	        peca2.codigo = s.nextInt();

	        System.out.println( "Digite valor da pe�a 2: ");
	        peca2.valor = s.nextDouble();

	        System.out.println( "Digite quantidade da pe�a 2: ");
	        peca2.quantidade = s.nextInt();

	        valorTotal = (peca1.valor*peca1.quantidade + peca2.valor* peca2.quantidade)*((ipi/100) + 1);

	        System.out.println("O valor a ser pago �: R$ " + valorTotal);

	    }

}
