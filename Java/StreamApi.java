import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
//		🔥 What is Stream API?
//		Java Stream API is used to process collections (like List, Set) in a declarative and functional style. It allows 
//			filtering, mapping, sorting, and collecting data efficiently.

//		1. Creating Streams

//		List<String> names = Arrays.asList("John", "Jane", "Jack");

		// Stream from collection
//		Stream<String> stream = names.stream();

		// Stream from array
//		Stream<Integer> arrayStream = Stream.of(1, 2, 3, 4, 5);

//		 2. forEach()
//		Performs an action for each element.
//		names.stream().forEach(x -> System.out.println(x));

//		 3. filter()
//		 Filters elements based on condition.
//		List<String> res = names.stream().filter(x -> x.startsWith("Ja")).collect(Collectors.toList());
//		System.out.println(res);

//		 4. map()
//		Transforms each element.
//		List<Integer> len = names.stream().map(String::length).collect(Collectors.toList());
//		System.out.println(len);

//		5. sorted()
//		List<String> sortedList = names.stream().sorted().collect(Collectors.toList());
//		System.out.println(sortedList);

//		 6. collect()
//		 Terminal operation to gather result.
//		String joined = names.stream().collect(Collectors.joining(",, "));
//		System.out.println(joined);

//		7. distinct()
//		Removes duplicates.
//		List<Integer> list1 = Arrays.asList(1,2,2,3,4,5,6,6);
//		List<Integer> distinct = list1.stream().distinct().collect(Collectors.toList());
//		System.out.println(distinct);

//		8. limit() & skip()
//		List<Integer> limit =  list1.stream().limit(2).collect(Collectors.toList());
//		System.out.println(limit);
//		
//		List<Integer> skip =  list1.stream().skip(2).collect(Collectors.toList());
//		System.out.println(skip);

//		🔄 Intermediate Operations
//		Operation	Description
//		.filter()	Filters elements
//		.map()	Transforms each element
//		.sorted()	Sorts the stream
//		.distinct()	Removes duplicates
//		.limit(n)	Limits the number of elements
//		.skip(n)	Skips first n elements
//
//		🎯 Terminal Operations
//		Operation	Description
//		.collect()	Converts stream to list, set, map, etc
//		.forEach()	Iterates and performs action
//		.count()	Returns count of elements
//		.reduce()	Reduces elements to a single value
//		.anyMatch(), .allMatch()	Checks condition match

//		9. reduce()
//		Combines elements to single result.
//		int reduce = Arrays.asList(1,2,3,4,5).stream().reduce(0, (a, b) -> a+b);
//		System.out.println(reduce);

//		List<Integer> numbers = Arrays.asList(5, 10, 15);
//		int sum = numbers.stream().reduce(0, Integer::sum);
//		System.out.println("Sum = " + sum);

//		10. anyMatch(), allMatch(), noneMatch()
//		boolean anyEven =  Arrays.asList(1,2,3,4,5).stream().anyMatch(x -> x%2 ==0);
//		System.out.println(anyEven);
//		
//		boolean allEven =  Arrays.asList(1,2,3,4,5).stream().allMatch(x -> x%2 ==0);
//		System.out.println(allEven);
//		
//		boolean noneEven =  Arrays.asList(1,2,3,4,5).stream().noneMatch(x -> x%2 ==0);
//		System.out.println(noneEven);

//		Map<Integer, Long> countByLength = Arrays.asList("Sonali", "Sejal", "Snehal").stream()
//				.collect(Collectors.groupingBy(String::length, Collectors.counting()));
//		System.out.println(countByLength);
//		
//		Map<String, Long> grpByLength = Arrays.asList("Sonali", "Sejal", "Snehal", "Sonali").stream()
//		        .collect(Collectors.groupingBy(String::toString, Collectors.counting()));
//		System.out.println(grpByLength); 

//		🧠 Practice Task Ideas
//		Find even numbers from a list.
//		List<Integer> evenNumbers = Arrays.asList(1,2,3,4,5,6).stream().filter(x -> x%2 == 0).toList();
//		System.out.println(evenNumbers);
//		System.out.println( Arrays.asList(1,2,3,4,5,6).stream().filter(x -> x%2 == 0).collect(Collectors.toSet()));

//		Convert list of strings to uppercase.
//		List<String> uppercaseStrings = Arrays.asList("Developer", "Tester", "Devopsengineer")
//				.stream().map(String::toUpperCase).toList();
//		System.out.println(uppercaseStrings);

//		Remove duplicates from a list.
//		List<Integer> distinceElements = Arrays.asList(23, 45,67,45,34,43,67).stream().distinct().toList();
//		System.out.println(distinceElements);

//		Sort a list of integers in descending order.
//		List<Integer> descendingOrder = Arrays.asList(12,45,6,8,0,8,33,22,123).stream()
//				.sorted((a,b) -> b.compareTo(a)).toList();
//		System.out.println(descendingOrder);

//		List<Integer> descendingOrder = Arrays.asList(12,45,6,8,0,8,33,22,123).stream()
//				.sorted((a,b) -> b - a).toList();
//		System.out.println(descendingOrder);

//		Count how many strings start with a particular letter.
//		long startWithS =  Arrays.asList("Sonali", "Sejal", "Rani", "Karn").stream().filter(x -> x.startsWith("S")).count();
//		System.out.println(startWithS);

//		Group strings by their length.
//		Map<Integer, Long> grpStrByLength = Arrays.asList("Sona", "Sonali", "Rani", "Snehal", "Sejal", "Mom", "Dad")
//				.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
//		System.out.println(grpStrByLength);

//		List<String> list = Arrays.asList("hi", "java", "sun", "jio", "cloud");
//        Map<Integer, List<String>> grouped = list.stream()
//                .collect(Collectors.groupingBy(String::length));
//        System.out.println(grouped);
		
//		List<String> names = List.of("Sonali", "Snehal", "Sam");
//		Map<Integer, List<String>> grouped = names.stream()
//		    .collect(Collectors.groupingBy(name -> name.length()));
//		System.out.println(grouped);

//		Join names with comma.
//		String joinByComma = Arrays.asList("Sona", "Sonali", "Rani", "Snehal", "Sejal", "Mom", "Dad")
//				.stream().collect(Collectors.joining(", "));
//		System.out.println(joinByComma);

//		Check if all strings are non-empty.
//		Boolean allNonEmpty = Arrays.asList(" ", "Sonali", "Rani", "Snehal", "Sejal", "Mom", "Dad")
//				.stream().allMatch(x -> !x.isEmpty());
//		System.out.println(allNonEmpty);

//		Multiply all elements using reduce.
//		Integer multiplication =  Arrays.asList(1,2,3,4,5).stream().reduce(1, (a,b) -> a*b);
//		System.out.println(multiplication);

//		Create a map of word and its length.
//		Map<String, Integer> map = Arrays.asList("Sonali", "Sejal", "Rani", "Karn").stream().
//				collect(Collectors.toMap(String::toString, String::length));
//		System.out.println(map);

//		Map<String, Integer> map = Arrays.asList("Sonali", "Sejal", "Rani", "Karn").stream()
//				.collect(Collectors.toMap(x -> x, x -> x.length()));
//		System.out.println(map);

//		Find Max Element from List
//		List<Integer> nums = Arrays.asList(1, 9, 3, 7);
//        int max = nums.stream()
//                .max(Integer::compare)
//                .orElseThrow();
//        System.out.println("Max = " + max);

//		 Find Duplicate Elements in a List
//		List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 3);
//        Set<Integer> set = new HashSet<>();
//        Set<Integer> duplicates = list.stream()
//                .filter(n -> !set.add(n))
//                .collect(Collectors.toSet());
//        System.out.println("Duplicates: " + duplicates);

//		FlatMap: Flatten List of Lists
//		List<List<String>> nestedList = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d"));
//		List<String> flatList = nestedList.stream().flatMap(List::stream).collect(Collectors.toList());
//		System.out.println(flatList);
		
//		💡 Summary Table
//		Concept	Method Used
//		Filter	filter()
//		Transform	map()
//		Reduce	reduce()
//		Count	count()
//		Max/Min	max(), min()
//		Sorting	sorted()
//		Find Duplicates	filter() + Set
//		To Map	Collectors.toMap()
//		Flatten	flatMap()
//		Grouping	Collectors.groupingBy()
		
//		✅ 1. Find first element starting with 'A'
//		Optional<String> startWithA =  Arrays.asList("Sonali", "Sejal", "Rani", "Karn", "Ajay", "Amit").stream()
//				.filter(x -> x.startsWith("A")).findFirst();
//		System.out.println(startWithA);
//		startWithA.ifPresent(System.out::println);
		
//		 2. Sort a list of strings in reverse order
//		Arrays.asList("Sonali", "Sejal", "Rani", "Karn", "Ajay", "Amit", "Raj").stream()
//		.sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
//		✅ 3. Sum all numbers in a list
//		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
//		int sum = numbers.stream()
//		    .reduce(0, Integer::sum);
//		System.out.println(sum); // Output: 15
		
//		✅ 2. Partition list into even and odd
//		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
//		Map<Boolean, List<Integer>> partitioned = numbers.stream()
//		    .collect(Collectors.partitioningBy(n -> n % 2 == 0));
//		System.out.println("Even: " + partitioned.get(true));
//		System.out.println("Odd: " + partitioned.get(false));
		
//		✅ 4. Find employee with max salary

//		class Emp {
//		    String name;
//		    double salary;
//
//		    Emp(String name, double salary) {
//		        this.name = name;
//		        this.salary = salary;
//		    }
//
//		    public String toString() {
//		        return name + " - " + salary;
//		    }
//		}
//
//		List<Emp> emps = List.of(
//		    new Emp("Alice", 50000),
//		    new Emp("Bob", 55000),
//		    new Emp("Charlie", 55000)
//		);

//		Optional<Emp> maxSalEmp = emps.stream()
//		    .max(Comparator.comparing(e -> e.salary));
//
//		maxSalEmp.ifPresent(System.out::println); // Output: Bob - 60000.0
		
		//grpbysalary
//		Map<Double, List<Emp>> grpbysalary = emps.stream().collect(Collectors.groupingBy(e -> e.salary));
//		System.out.println(grpbysalary);
//		
//		Map<Double, List<Emp>> groupedByDept = emps.stream()
//			    .collect(Collectors.groupingBy(e -> e.salary));
//
//			System.out.println(groupedByDept);
		
		
		
		
//		✅ Parallel Stream in Java:
//			parallelStream() is a feature of the Java Stream API that allows stream operations to be executed in parallel—across multiple threads—using the ForkJoinPool under the hood.
//
//			🔹 Usage Example:

			     List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
			     int sum = numbers.parallelStream()
			                         .mapToInt(i -> i * 2)
			                         .sum();
			      System.out.println("Sum: " + sum);
			
//			✅ Advantages / Uses of Parallel Streams:
//			Advantage	Explanation
//			Performance	Can significantly reduce processing time for large collections by leveraging multiple cores.
//			Simplicity	Enables parallel processing without manual thread management.
//			Declarative Syntax	Same syntax as normal streams—easy to switch from stream() to parallelStream() or use .parallel().

//			⚠️ Drawbacks / Limitations of Parallel Streams:
//			Drawback	Explanation
//			Overhead for small data	For small collections, parallel streams may be slower due to thread creation & context switching.
//			Thread-safety required	Must ensure operations inside stream are thread-safe; mutable shared state can cause issues.
//			Unpredictable order	Output order is not guaranteed unless .forEachOrdered() is used.
//			Debugging difficulty	Harder to debug due to multiple threads executing in parallel.
//			ForkJoinPool sharing	All parallel streams share the same common ForkJoinPool, which can lead to thread starvation in complex apps.

//			🔍 When to Use Parallel Stream:
//			✅ Use when:
//			You work with large collections.
//			Stream operations are stateless and independent.
//			Computation is CPU-intensive (not IO-bound).
//			Order of processing is not critical.
//
//			❌ Avoid when:
//			Dataset is small.
//			Operation is IO-bound (e.g., reading files, database).
//			You rely on side effects or order of execution.
		
		
		

	}

}
