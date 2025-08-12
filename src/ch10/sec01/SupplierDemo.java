package ch10.sec01;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<String> s = () -> new String("Bello");
		System.out.println(s.get());

		DoubleSupplier ds = () -> Math.PI;
		System.out.println(ds.getAsDouble());

		IntSupplier is = () -> (int) Math.pow(2, 5);
		System.out.println(is.getAsInt());
	}

}
