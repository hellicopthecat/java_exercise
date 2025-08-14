package ch11.exs;

import java.util.HashMap;
import java.util.Map;

public class HashmapTaskDemo {

	public static void main(String[] args) {
		Map<String, String> animal = new HashMap<>();
		animal.put("호랑이", "tiger");
		animal.put("표범", "leopard");
		animal.put("사자", "lion");
		animal.replaceAll((x, y) -> y.toUpperCase());
		System.out.println(animal);

	}

}
