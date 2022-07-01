package tarefa006;
import java.util.Scanner;

public class Questao1Sonarlint {
	
	public static void main(String[] args) {
		
        int anos;
        int meses;
        int dias;
        int idadeDias;
        
        Scanner s = new Scanner( System.in );
        
        System.out.println( "Digite sua idade em anos, meses e dias:");
        anos = s.nextInt();
        meses = s.nextInt();
        dias = s.nextInt();
        idadeDias = dias + meses*30 + anos*365;

        System.out.println( "A sua idade em dias é: " + idadeDias );
    }

}