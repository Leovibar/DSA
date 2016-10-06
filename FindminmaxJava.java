
package findminmax.java;

public class FindminmaxJava {

    public static void main(String[] args) {
       int[] numbers = { 95, 45, 22, 15, 70, 160 };
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int v = 0; v < numbers.length; v++) {
			if (numbers[v] < min)
				min = numbers[v];
			if (numbers[v] > max)
				max = numbers[v];
    }
                System.out.println("Smallest number is " + min);
		System.out.println("Lagest number is " + max);
    
}
}
