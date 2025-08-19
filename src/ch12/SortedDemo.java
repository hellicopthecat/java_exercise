package ch12;

import java.util.Comparator;

public class SortedDemo {

	public static void main(String[] args) {
		// 문자열을 스트림으로 변환하고, 문자열을 정렬해서 출력하라.

		// 국가 이름 순서대로 출력하라
		Nation.nations.stream().sorted(Comparator.comparing(Nation::getName)).forEach(Util::print);
		System.out.println();
		// gdp순서대로 출력
		Nation.nations.stream().sorted(Comparator.comparing(Nation::getGdpRank)).forEach(Util::printWithParenthesis);
		System.out.println();
		// 인구수 대로 출력 내림차순
		Nation.nations.stream().sorted(Comparator.comparing(Nation::getPopulation).reversed())
				.forEach(Util::printWithParenthesis);

	}

}
