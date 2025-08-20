package ch12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ch12.Nation.Type;

public class GroupByDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Nation> ns = Nation.nations.stream();
		Map<Type, List<Nation>> collect = ns.collect(Collectors.groupingBy(Nation::getType));

		ns = Nation.nations.stream();
		Map<Type, Long> collect2 = ns.collect(Collectors.groupingBy(Nation::getType, Collectors.counting()));

		ns = Nation.nations.stream();
		Map<Boolean, List<Nation>> collect3 = ns
				.collect(Collectors.partitioningBy(n -> n.getType() == Nation.Type.LAND));

		ns = Nation.nations.stream();
		Map<Boolean, Long> collect4 = ns.collect(Collectors.partitioningBy(n -> n.getType() == Nation.Type.LAND, Collectors.counting()));

	}

}
