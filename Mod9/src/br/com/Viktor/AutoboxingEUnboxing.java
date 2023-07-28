package br.com.Viktor;

public class AutoboxingEUnboxing {  // Mais para estudo, no dia-a-dia não é relevante.
	
	public static void main (String[] args) {
		
		//Boxing
		
		Boolean status = true;
		
		Character c = 'a';
		
		Integer idade = 10;
		 
		Long cpf = 1234l;
		
		//Unboxing  
		
		boolean status2 = Boolean.TRUE;
		
		char letra = Character.valueOf('A');
		
		int idade2 = Integer.valueOf(12);
		
		long cpf3 = Long.valueOf(12344);		
	}
	
}
