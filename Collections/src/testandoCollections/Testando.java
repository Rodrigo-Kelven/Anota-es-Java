package testandoCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Testando {
	public static void main(String[] args) {

		// List, Set, Map sao Generics: generics sao recursos do Java onde pode-se criar
		// classes, metodos e interfaces de forma flexivel "com todos os tipos de dados"

		// List
		List<String> lista = new ArrayList<>();
		lista.add("Maçã");
		lista.add("Banana");
		lista.add("Maçã"); // duplicata permitida
		System.out.println(lista.get(0)); // imprime "Banana"

		// Set
		Set<String> conjunto = new HashSet<>();
		conjunto.add("Maçã");
		conjunto.add("Banana");
		conjunto.add("Maçã"); // duplicata ignorada
		System.out.println(conjunto.size()); // imprime 2

		// Map
		Map<String, String> mapa = new HashMap<>();
		mapa.put("chave1", "valor1");
		mapa.put("chave2", "valor2");
		System.out.println(mapa.get("chave1")); // imprime "valor1"

		
		// caso queria usar dados heterogeneos
		
		// List
		List<Object> listaDois = new ArrayList<>();
		listaDois.add("Banana");
		listaDois.add(false);
		listaDois.add(1995); // duplicata permitida
		System.out.println(listaDois.get(0)); // imprime "Banana"

		// Set
		Set<Object> conjuntoDois = new HashSet<>();
		conjuntoDois.add("Maçã");
		conjuntoDois.add(1);
		conjuntoDois.add(3); // duplicata ignorada
		System.out.println(conjuntoDois.size()); // imprime 2

		// Map
		Map<Integer, String> mapaDois = new HashMap<>();
		mapaDois.put(1, "valor1");
		mapaDois.put(2, "valor2");
		System.out.println(mapaDois.get(1)); // imprime "valor1"
		
		System.out.println();
		
		try {
		    int resultado = 10 / 0; // gera ArithmeticException
		} catch (ArithmeticException e) {
		    System.out.println("Erro: divisão por zero!");
		} finally {
		    System.out.println("Bloco finally executado.");
		}


	}
}
