package ch12;

public class Map2Demo {

	public static void main(String[] args) {
		// Nation.nations 리스트를 스트림으로 생성한 후
		// 나라이름만을 가지고 스트림으로 변환하고
		// 그중 4개의 나라이름만 ()로 감싸서 출력
		Nation.nations.stream().map(c -> c.getName()).skip(4).forEach(Util::printWithParenthesis);
		// Nation.nations 리스트를 스트림으로 생성후.
		// 각 나라의 인수수만을 가지고 스트림으로 변환하고
		// 인구수를 ()로 감싸기
		Nation.nations.stream().map(c -> c.getPopulation()).forEach(Util::printWithParenthesis);

		// Nation.nations 리스트를 스트림으로 생성후
		// 각나라의 gdp rank만을 가지고 스트림으로 변환하고
		// gdp를 ()로 감싸기

		Nation.nations.stream().mapToInt(n -> n.getGdpRank()).forEach(Util::printWithParenthesis);

	}

}
