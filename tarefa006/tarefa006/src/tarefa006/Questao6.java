package tarefa006;
import java.util.Scanner;

public class Questao6 {
	
	 public static void main(String[] args) {
		 
	        int numero, antecessor, sucessor;

	        Scanner s = new Scanner( System.in );
	        
	        System.out.println( "Digite um n�mero: ");
	        numero = s.nextInt();
	        antecessor = numero - 1;
	        sucessor = numero + 1;

	        System.out.printf("O n�mero digitado foi %d e seu antecessor � %d.\n", numero, antecessor);
	        System.out.printf("O n�mero digitado foi %d e seu sucessor � %d.", numero, sucessor);
	        
	 }

}
