package tarefa006;
import java.util.Scanner;

public class Questao3Sonarlint {
	
	public static void main(String[] args) {
		
        Scanner s = new Scanner( System.in );
        double saldo;
        double reajuste15;

        System.out.println( "Digite o saldo: ");
        saldo = s.nextDouble();

        reajuste15 = saldo * 1.15;

        System.out.println( "Saldo com reajuste de 15% �: " + reajuste15);
    }
}
