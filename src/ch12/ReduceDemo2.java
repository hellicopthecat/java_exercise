package ch12;

import java.util.stream.Stream;

public class ReduceDemo2 {

	public static void main(String[] args) {
		// Nation의 nations를 스트림
		Stream<Nation> stream = Nation.nations.stream();
		// GDP가 20위 이내인 나라들의 인구 총합 (단위 : 백만명)
		double reduce = stream.filter(n -> n.getGdpRank() <= 20).mapToDouble(n -> n.getPopulation()).reduce(0,
				(a, b) -> a + b);
		System.out.println(reduce);
		// 섬나라에 사는 인구 총합을 구하라 (단위 : 백만명)
		stream = Nation.nations.stream();
		double reduce2 = stream.filter(n -> n.isIsland()).mapToDouble(n -> n.getPopulation()).reduce(0,
				(a, b) -> a + b);
		System.out.println(reduce2);
	}

}
