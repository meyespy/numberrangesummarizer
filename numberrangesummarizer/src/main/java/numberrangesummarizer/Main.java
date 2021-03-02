package numberrangesummarizer;

import java.util.Scanner;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean done = false;

        System.out.println("[Q]/[q] = quit ");

        while (!done) {

            System.out.println();
            System.out.print("Provide string: ");
            String string = input.next();

            if (string.equalsIgnoreCase("Q")) {
                
                done = true;
                input.close();

            } else {

                Implementation implementation = new Implementation();
                System.out.println();
                Collection<Integer> inputCollection = implementation.collect(string);
                System.out.println("collected input: " + inputCollection);

                System.out.println();
                String output = implementation.summarizeCollection(inputCollection);
                System.out.println("output: " + output);

            }
            
        }
        System.exit(0);
        
    }

}
