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
				System.out.print("| " + frase.charAt(letras)+ " : " + count + " ");
				caracteresMostrados += frase.charAt(letras);
			}
		}
		
    }

}
