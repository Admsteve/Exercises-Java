package Main;

import java.util.Scanner;

public class main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Digite os caracteres: ");
		
		String frase = input.nextLine();
		char letras;
		frase = frase.toLowerCase().replaceAll(" ", "");
		String caracteresMostrados = "";
		int maior = 0;
		char caracterMaior = 0;
		
		
		for(letras = 0; letras <= frase.length()-1; letras++)
		{
			int count = 0;
			
			if(caracteresMostrados.indexOf(frase.charAt(letras)) == -1)
			{
				for(int i = 0; i < frase.length(); i++)
				{
					if(frase.charAt(i) == frase.charAt(letras))
					{
						count++;
					}
				}
				System.out.println("| " + frase.charAt(letras)+ " : " + count + " ");
				caracteresMostrados += frase.charAt(letras);
				
			}
			if(maior < count)
			{
				maior = count;
				caracterMaior = frase.charAt(letras);
			}
		}
		System.out.println("O caractere que se repete mais vezes é o: " + caracterMaior + " (" + maior + " vezes)");
		
    }

}