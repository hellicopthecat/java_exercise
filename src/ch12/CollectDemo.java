package ch12;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Nation> ns = Nation.nations.stream();
		Double collect = ns.collect(Collectors.averagingDouble(n -> n.getPopulation()));
		System.out.println(collect);

		ns = Nation.nations.stream();

		Long collect2 = ns.collect(Collectors.counting());
		System.out.println("나라수 : " + collect2);

		// 4개의 나를 추출해서 나라이름 - 연결해서 string으로 반환하가
		ns = Nation.nations.stream();
		String collect3 = ns.limit(4).map(Nation::getName).collect(Collectors.joining("-"));
		System.out.println(collect3);

		// 4개의 나라를 추출해서 나라이름 + 연결해서 stiring으로 반환하기
		ns = Nation.nations.stream();
		String collect4 = ns.limit(4).collect(Collectors.mapping(Nation::getName, Collectors.joining("+")));
		System.out.println(collect4);

		// 인구수가 가장 많은 나라의 인구수를 출력하기 Collectors.maxBy
		ns = Nation.nations.stream();
		Optional<Double> collect5 = ns.map(Nation::getPopulation).collect(Collectors.maxBy(Double::compare));
		System.out.println(collect5.get());
	}

}
