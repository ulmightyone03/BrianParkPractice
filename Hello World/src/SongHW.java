public class SongHW {

/*
 * This assignment triggers me
 * Don't delete this time
 * Let's do this~
 */
	public static void main(String[] args) {
		printVerse1();
		printVerse2();
		printVerse3();
		printVerse4();
		printVerse5();
		printVerse6();
		printVerse7();
	}
	
	// This is to print out the initial verse
	public static void printVerse1() {
		System.out.println("There was an old woman who swallowed a fly.");
		printFly();
		System.out.println("");
	}
	
	public static void printFly() {
		System.out.println("I don't know why she swallowed that fly,");
		System.out.println("Perhaps she'll die.");
	}
	
	public static void printVerse2() {
		System.out.println("There was an old woman who swallowed a spider,");
		System.out.println("That wriggled and iggled and jiggled inside her.");
		printSpider();
		printFly();
		System.out.println("");
	}
	
	public static void printSpider() {
		System.out.println("She swallowed the spider to catch the fly,");
	}
	
	public static void printVerse3() {
		System.out.println("There was an old woman who swallowed a bird,");
		System.out.println("How absurd to swallow a bird.");
		printBird();
		printSpider();
		printFly();
		System.out.println("");
	}
	
	public static void printBird() {
		System.out.println("She swallowed the bird to catch the spider,");
	}
	
	public static void printVerse4() {
		System.out.println("There was an old woman who swallowed a cat,");
		System.out.println("Imagine that to swallow a cat.");
		printCat();
		printBird();
		printSpider();
		printFly();
		System.out.println("");
	}
	
	public static void printCat() {
		System.out.println("She swallowed the cat to catch the bird,");
	}
	
	public static void printVerse5() {
		System.out.println("There was an old woman who swallowed a dog,");
		System.out.println("What a hog to swallow a dog.");
		printDog();
		printCat();
		printBird();
		printSpider();
		printFly();
		System.out.println("");
	}
	
	public static void printDog() {
		System.out.println("She swallowed the dog to catch the cat,");
	}
	
	public static void printVerse6() {
		System.out.println("There was an old lady who swallowed your MOM,");
		System.out.println("What a baller to swallow your MOM.");
		printMOM();
		printDog();
		printCat();
		printBird();
		printSpider();
		printFly();
		System.out.println("");
	}
	
	public static void printMOM() {
		System.out.println("She swallowed your MOM to catch to dog,");
	}
	
	public static void printVerse7() {
		System.out.println("There was an old woman who swallowed a horse,");
		System.out.println("She died of course.");
	}
}