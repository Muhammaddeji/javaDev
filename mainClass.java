import java.util.Scanner;
public class mainClass {
        public static void main(String [] args)
        {
                Scanner myInput = new Scanner(System.in);
		while (true)
		{
		 try {
                        System.out.println("How many integers do you want to input");
                        System.out.print("Enter 2 for two integers, While 3 for three integers: ");
                        int num = myInput.nextInt();
			if (num == 2)
                        {
                                try {
                                System.out.println("Write a simple arithmetic of 2 integers");

				int a = myInput.nextInt();
                                char op1 = myInput.next().charAt(0);
                                int b = myInput.nextInt();

				twoIntegers twoInt = new twoIntegers(a, op1, b);

				twoInt.twoIntegerLogic(a, op1, b);
				} catch (Throwable t) {
                                        System.out.println("INVALID INPUT");
                                        System.exit(0);
                                }
			}
			else if (num == 3)
			{
				try {
                                System.out.println("Write a simple arithmetic of 3 integers");

                                int a = myInput.nextInt();
                                char op1 = myInput.next().charAt(0);
                                int b = myInput.nextInt();
                                char op2 = myInput.next().charAt(0);
                                int c = myInput.nextInt();

				threeIntegers threeInt = new threeIntegers(a, op1, b, op2, c);

				threeInt.threeIntegerLogic(a, op1, b, op2, c);
				} catch (Throwable t) {
                                        System.out.println("INVALID INPUT");
                                        System.exit(0);
				}
			}
			else
                                System.out.println("Sorry! This calculator only supports 2 or 3 integers");
		 } catch (Throwable t) {
			 System.out.println("INVALID INPUT");
			 System.exit(0);
		 }
	}

	}
}

