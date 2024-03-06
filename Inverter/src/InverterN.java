import java.util.Scanner;

public class InverterN {
    public static void main(String[] args) {
    	
    	 System.out.println("Escreva uma frase que gostaria de inverter");
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	
        String stringO = scanner.nextLine();
        String stringI = inverterString(stringO);
        
        System.out.println("Inversão: " + stringI);
    }
    
    public static String inverterString(String s) {
        char[] caracteres = s.toCharArray(); 
        int tamanho = caracteres.length;
        char[] caracteresI = new char[tamanho]; 
        
        for (int i = 0; i < tamanho; i++) {
            caracteresI[i] = caracteres[tamanho - 1 - i]; 
        }
        
        return new String(caracteresI);
    }
}