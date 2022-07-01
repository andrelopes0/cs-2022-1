package tarefa006;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao5 {
	
	public static void main(String[] args) {
		
        Scanner s = new Scanner( System.in );
        double salarioMinimo, salarioUsuario, quantidade;
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println( "Digite o valor do salário mínimo: ");
        salarioMinimo = s.nextDouble();

        System.out.println( "Digite o valor do salário do usuário: ");
        salarioUsuario = s.nextDouble();

        quantidade = salarioUsuario/salarioMinimo;
        
        System.out.println( "Quantidade de salários mínimos que usuário ganha é: " + df.format(quantidade));
    }

}
