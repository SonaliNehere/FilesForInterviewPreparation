import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@FunctionalInterface
interface Area{
	public void area();
}

public class LambdaExpression {

	public static void main(String[] args) {
		
//	A lambda expression is a shorter way to write anonymous functions — it's used primarily to implement functional 
//		interfaces (interfaces with only one abstract method).	
		
		// Traditional way
//		Runnable r1 = new Runnable() {
//		    public void run() {
//		        System.out.println("Running...");
//		    }
//		};
//		r1.run();
		
//		Runnable r = () -> System.out.println("Running...");
//		r.run();
		
//		Area areaOfSquare = () -> System.out.println(4*4);
//		Area areaOfCircle = () -> System.out.println(3.14 * 4 * 4);
//		areaOfSquare.area();
//		areaOfCircle.area();
		
//		List<String> names = Arrays.asList("Sonali", "Snehal", "Sejal");
//		names.forEach(name -> System.out.print(name + " "));
//		System.out.println();
		
//		names.sort((a, b) -> a.compareTo(b));
//		names.forEach(name -> System.out.print(name + " "));
//		System.out.println();
		
//		List<Integer> numbers =Arrays.asList(1,2,3,4,5,6);
//		numbers.stream().filter(x -> x%2 == 0).forEach(System.out::println);
		
//		List<Integer> square = numbers.stream().map(x -> x*x).collect(Collectors.toList());
//		System.out.println(square);
		
//		List<String> uppercase = Arrays.asList("Sonali", "Sejal", "Snehal").stream().map(x -> x.toUpperCase()).toList();
//		System.out.println(uppercase);
//		
//		List<String> uppercase1 = Arrays.asList("Sonali", "Sejal", "Snehal").stream().map(String::toUpperCase).toList();
//		System.out.println(uppercase1);
		
//		Predicate<String> isShort = s -> s.length()<5;
//		System.out.println(isShort.test("Sona"));
		
//		Function<String, Integer> findLength = s -> s.length();
//		System.out.println(findLength.apply("Sonali"));
		
		
		
		
		

	}

}
