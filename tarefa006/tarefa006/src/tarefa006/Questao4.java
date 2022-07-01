package tarefa006;
import java.util.Scanner;

public class Questao4 {
		
		private static class Peça{
			int codigo;
			double valor;
			int quantidade;
		}

	   	static Peça peça1 = new Peça();
	    static Peça peça2 = new Peça();
	    
	    public static void main(String[] args) {
	        Scanner s = new Scanner( System.in );

	        peça1.codigo = 0;
	        peça2.codigo = 0;
	        double ipi, valorTotal;

	        System.out.println( "Digite valor do IPI: ");
	        ipi = s.nextDouble();

	        System.out.println( "Digite código da peça 1: ");
	        peça1.codigo = s.nextInt();

	        System.out.println( "Digite valor da peça 1: ");
	        peça1.valor = s.nextDouble();

	        System.out.println( "Digite quantidade da peça 1: ");
	        peça1.quantidade = s.nextInt();

	        System.out.println( "Digite código da peça 2: ");
	        peça2.codigo = s.nextInt();

	        System.out.println( "Digite valor da peça 2: ");
	        peça2.valor = s.nextDouble();

	        System.out.println( "Digite quantidade da peça 2: ");
	        peça2.quantidade = s.nextInt();

	        valorTotal = (peça1.valor*peça1.quantidade + peça2.valor* peça2.quantidade)*((ipi/100) + 1);

	        System.out.println("O valor a ser pago é: R$ " + valorTotal);

	    }

}
