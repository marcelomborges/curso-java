package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Alura";
		// String outro = new String("Alura");
		System.out.println(nome);
		
		//char c = 'A';
		//char d = 'a';
		
		//String outra = nome.replace("A","a");
		//String outra = nome.replace("Al","aL");
		//String outra = nome.replace(c,d);
		
		//String outra = nome.toLowerCase();
		//String outra = nome.toUpperCase();
		
		//System.out.println(outra);
		
		//char c = nome.charAt(2);
		//System.out.println(c);
		
		//int pos = nome.indexOf("ur");
		//System.out.println(pos);
		
		//String sub = nome.substring(1);
		//System.out.println(sub);
		
//		System.out.println(nome.length());
//		for(int i = 0; i < nome.length(); i++)
//		{
//			System.out.println(nome.charAt(i));
//		}
		
//		String vazio = "";
//		System.out.println(vazio.isEmpty());
		
//		String vazio = "  Alura  ";
//		System.out.println(vazio);
//		
//		String outroVazio = vazio.trim();
//		System.out.println(outroVazio);
		
//		String vazio = "  Alura  ";
//		System.out.println(vazio.contains("Alu"));
		
		String s = "split;test;alura";
		String[] split = s.split(";");

		for(int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		
	}

}
