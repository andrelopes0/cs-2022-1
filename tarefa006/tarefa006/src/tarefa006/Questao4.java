package tarefa006;
import java.util.Scanner;

public class Questao4 {
		
		private static class Pe�a{
			int codigo;
			double valor;
			int quantidade;
		}

	   	static Pe�a pe�a1 = new Pe�a();
	    static Pe�a pe�a2 = new Pe�a();
	    
	    public static void main(String[] args) {
	        Scanner s = new Scanner( System.in );

	        pe�a1.codigo = 0;
	        pe�a2.codigo = 0;
	        double ipi, valorTotal;

	        System.out.println( "Digite valor do IPI: ");
	        ipi = s.nextDouble();

	        System.out.println( "Digite c�digo da pe�a 1: ");
	        pe�a1.codigo = s.nextInt();

	        System.out.println( "Digite valor da pe�a 1: ");
	        pe�a1.valor = s.nextDouble();

	        System.out.println( "Digite quantidade da pe�a 1: ");
	        pe�a1.quantidade = s.nextInt();

	        System.out.println( "Digite c�digo da pe�a 2: ");
	        pe�a2.codigo = s.nextInt();

	        System.out.println( "Digite valor da pe�a 2: ");
	        pe�a2.valor = s.nextDouble();

	        System.out.println( "Digite quantidade da pe�a 2: ");
	        pe�a2.quantidade = s.nextInt();

	        valorTotal = (pe�a1.valor*pe�a1.quantidade + pe�a2.valor* pe�a2.quantidade)*((ipi/100) + 1);

	        System.out.println("O valor a ser pago �: R$ " + valorTotal);

	    }

}
