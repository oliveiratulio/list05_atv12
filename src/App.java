import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class App {
	
	public static String[] letras;
	
	public static Scanner sc = new Scanner(System.in);
	
	public static Random random = new Random();
	
	public static ArrayList<String> arrayList = new ArrayList<String>();
	
	
	public static void main(String[] args) {
		try {
			System.out.print("Digite a palavra: ");
			String palavra = sc.nextLine().toUpperCase().trim();
			
			defineLetras(palavra);
			
			letras = arrayList.toArray(new String[arrayList.size()]);
			
			letras = embaralhar(letras);
			
			exibePalavra(letras);
			
		} catch(Exception e) {
			System.out.println("Falha: " + e.getMessage());
		}
	}
	
	public static void defineLetras(String palavra) {
		for(int i=0; i < palavra.length(); i++) {
			arrayList.add(String.valueOf(palavra.charAt(i)));
		}
	}
	
	public static String[] embaralhar(String[] param) {
		int index = 0;
		String s = "";
		
		for(int i=param.length-1; i > 0; i--) {
			index = random.nextInt(i+1);
			s = param[index];
			param[index] = param[i];
			param[i] = s;
		}
		return param;
	}
	
	public static void exibePalavra(String[] letras) {
		String novaPalavra = "";
		for(String letra : letras) {
			novaPalavra = novaPalavra + letra;
		}
		System.out.println("\nPalavra embaralhada: "+novaPalavra);
	}
}