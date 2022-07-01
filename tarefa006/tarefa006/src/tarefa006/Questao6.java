package tarefa006;
import java.util.Scanner;

public class Questao6 {
	
	 public static void main(String[] args) {
		 
	        int numero, antecessor, sucessor;

	        Scanner s = new Scanner( System.in );
	        
	        System.out.println( "Digite um número: ");
	        numero = s.nextInt();
	        antecessor = numero - 1;
	        sucessor = numero + 1;

	        System.out.printf("O número digitado foi %d e seu antecessor é %d.\n", numero, antecessor);
	        System.out.printf("O número digitado foi %d e seu sucessor é %d.", numero, sucessor);
	        
	 }

}
