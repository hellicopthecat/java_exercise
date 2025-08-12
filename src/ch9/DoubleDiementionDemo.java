package ch9;

public class DoubleDiementionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] interests = { { 3.2, 3.1, 3.2, 3.0 }, { 2.9, 2.8, 2.7, 2.6 }, { 2.7, 2.6, 2.5, 2.7 } };
		double[] sum1 = { 0.0, 0.0, 0.0 };
		double sum2 = 0.0;

		for (int i = 0; i < sum1.length; i++) {

		}

		for (double[] interes : interests) {
			for (double sum : sum1) {
				for (double value : interes) {
					sum += value;
				}
				System.out.println(sum);
			}
		}

	}
}