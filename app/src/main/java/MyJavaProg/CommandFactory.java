package MyJavaProg;

import java.util.Arrays;
import java.util.LinkedList;

public class CommandFactory {
    static private final String sTextPleaseInsertANumber = "\tPlease insert a number:";
    static private final String sExitMessage = "Program closed!";



    static public LinkedList<ICommand> returnCommandList() {
        LinkedList<ICommand> list = new LinkedList<ICommand>();
        list.add(createExitCommand());
        list.add(createEuclidSubtractionRecursive());
        list.add(createEuclidSubtractionIterative());
        list.add(createEuclidDivisionRestRecursive());
        list.add(createEuclidDivisionRestIterative());
        list.add(createSieveOfEratosthenes());

        return list;
    }

    static private ICommand createEuclidSubtractionRecursive() {
        return new ICommand() {
            @Override
            public String execute() {
                GCD GCD = new GCD();
                int x = Console.readIntegerFromStdIn(sTextPleaseInsertANumber);
                int y = Console.readIntegerFromStdIn(sTextPleaseInsertANumber);
                int result = GCD.calcEuclidSubtractionRecursive(x, y);
                return System.lineSeparator() + "GCD is: " + result + System.lineSeparator();
            }

            @Override
            public String description() {
                return "Greatest Common Divisor (GCD) - (Recursive) Euclid's algorithm subtraction.";
            }
        };
    }

    static private ICommand createEuclidSubtractionIterative() {
        return new ICommand() {
            @Override
            public String execute() {
                GCD GCD = new GCD();
                int x = Console.readIntegerFromStdIn(sTextPleaseInsertANumber);
                int y = Console.readIntegerFromStdIn(sTextPleaseInsertANumber);
                int result = GCD.calcEuclidSubtractionIterative(x, y);
                return System.lineSeparator() + "GCD is: " + result + System.lineSeparator();
            }

            @Override
            public String description() {
                return "Greatest Common Divisor (GCD) - (Iterative) Euclid's algorithm subtraction.";
            }
        };
    }

    static private ICommand createEuclidDivisionRestRecursive() {
        return new ICommand() {
            @Override
            public String execute() {
                GCD GCD = new GCD();
                int x = Console.readIntegerFromStdIn(sTextPleaseInsertANumber);
                int y = Console.readIntegerFromStdIn(sTextPleaseInsertANumber);
                int result =  GCD.calcEuclidDivisionRestRecursive(x, y);
                return System.lineSeparator() + "GCD is: " + result + System.lineSeparator();
            }

            @Override
            public String description() {
                return "Greatest Common Divisor (GCD) - (Recursive) Euclid's algorithm division rest.";
            }
        };
    }

    static private ICommand createEuclidDivisionRestIterative() {
        return new ICommand() {
            @Override
            public String execute() {
                GCD GCD = new GCD();
                int x = Console.readIntegerFromStdIn(sTextPleaseInsertANumber);
                int y = Console.readIntegerFromStdIn(sTextPleaseInsertANumber);
                int result = GCD.calcEuclidDivisionRestIterative(x, y);
                return System.lineSeparator() + "GCD is: " + result + System.lineSeparator();
            }

            @Override
            public String description() {
                return "Greatest Common Divisor (GCD) - (Iterative) Euclid's algorithm division rest.";
            }
        };
    }

    static private ICommand createSieveOfEratosthenes(){
        return new ICommand(){
            @Override
            public String execute(){
                SieveOfEratosthenes sieve = new SieveOfEratosthenes();
                int max = Console.readIntegerFromStdIn(sTextPleaseInsertANumber);
                int[] result = sieve.calcSieveOfEratosthenes(max);
                String resultString = Arrays.toString(result);
                return System.lineSeparator() + "Prime Numbers are " + resultString + System.lineSeparator();
            }
            @Override
            public String description(){
                return "Sieve of Eratosthenes";
            }
        };
    }




    private static ICommand createExitCommand() {
        return new ICommand() {
            @Override
            public String execute() {
                System.out.println(sExitMessage);
                System.exit(0);
                return null;
            }

            @Override
            public String description() {
                return "Exit";
            }
        };
    }
}
