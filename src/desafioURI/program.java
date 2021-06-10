package desafioURI;

import java.io.IOException;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class program {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		SortedMap<Integer, Integer> contaQuant = new TreeMap<>();

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int numeros = sc.nextInt();

			if (contaQuant.containsKey(numeros))
				contaQuant.replace(numeros, contaQuant.get(numeros) + 1);

			else
				contaQuant.put(numeros, 1);
		}

		contaQuant.entrySet().forEach(entry -> {
			System.out.printf(entry.getKey() + " aparece " + entry.getValue() + " vez(es)\n ");
		});

	}

}
