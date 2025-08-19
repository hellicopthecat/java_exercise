package ch12;

import java.util.Optional;
import java.util.stream.Stream;

public class MatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean anyMatch = Stream.of("a1", "b1", "c1").anyMatch(s -> s.startsWith("c"));
		System.out.println(anyMatch);

		// 모든 국가의 인구수가 1억이 넘는다
		boolean populationMatch = Nation.nations.stream().allMatch(n -> n.getPopulation() == 100000000);
		System.out.println(populationMatch);

		// 모든 국가는 섬은 아니다.
		boolean anyMatch2 = Nation.nations.stream().anyMatch(n -> n.isIsland() == false);
		System.out.println(anyMatch2);

		// 모든국가의 이름은 일본이 아니다.
		boolean noneMatch = Nation.nations.stream().noneMatch(n -> n.getName().toLowerCase() == "japan");
		System.out.println(noneMatch);

		// 국가 리스트 중에서 섬인 나라 중에서 가장 처음에 찾은 나라를 출력하라
		Optional<Nation> first = Nation.nations.stream().filter(Nation::isIsland).findFirst();
		System.out.println(first.get());

		// 국가 리스트 중에서 섬이 아닌 나라 중에 아무나라나 찾아라
		Optional<Nation> any = Nation.nations.stream().filter((n) -> !n.isIsland()).findAny();
		System.out.println(any);

		// 인구수가 10억이 넘고, gdp가 1위인 나라를 찾아라
		Optional<Nation> any2 = Nation.nations.stream()
				.filter((n) -> n.getPopulation() == 1000000000 && n.getGdpRank() == 1).findAny();
		System.out.println(any2);
	}

}
