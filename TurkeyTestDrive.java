
public class TurkeyTestDrive {
	public static void main(String[] args) {
		
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		
		Turkey duckAdapter = new DuckAdapter(duck);
		
		System.out.println("\nThe DuckAdapter says:");
		testTurkey(duckAdapter);
		
		
	}
	static void testTurkey(Turkey turkey) {
		turkey.gobble();
		turkey.fly();
	}

}
