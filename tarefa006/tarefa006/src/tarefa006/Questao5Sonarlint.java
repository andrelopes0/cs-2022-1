package tarefa006;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao5Sonarlint {
	
	public static void main(String[] args) {
		
        Scanner s = new Scanner( System.in );
        double salarioMinimo;
        double salarioUsuario;
        double quantidade;
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println( "Digite o valor do sal�rio m�nimo: ");
        salarioMinimo = s.nextDouble();

        System.out.println( "Digite o valor do sal�rio do usu�rio: ");
        salarioUsuario = s.nextDouble();

        quantidade = salarioUsuario/salarioMinimo;
        
        System.out.println( "Quantidade de sal�rios m�nimos que usu�rio ganha �: " + df.format(quantidade));
    }

}
