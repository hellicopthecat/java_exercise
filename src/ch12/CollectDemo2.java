package ch12;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Nation> ns = Nation.nations.stream();
		ns.map(n -> n.getName()).limit(3).collect(Collectors.toList()).forEach(System.out::println);

		ns = Nation.nations.stream();
		ns.map(Nation::getName).limit(3).collect(Collectors.toSet());

		ns = Nation.nations.stream();
		ns.filter(Nation::isIsland).collect(Collectors.toMap(Nation::getName, Nation::getPopulation));
	}

}
