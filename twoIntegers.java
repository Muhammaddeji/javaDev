public class twoIntegers {
	int a;
	char op1;
	int b;

	// a constructor
	public twoIntegers(int a, char op1, int b) {
		this.a = 0;
		this.op1 = '+';
		this.b = 0;
	}

	// a logic method
	public static void twoIntegerLogic(int a, char op1, int b)
	{
		if (a <= 10 && b <= 10)
		{
			if (op1 == '+')
				System.out.println( a + b);
			else if (op1 == '-')
				System.out.println(a - b);
			else if (op1 == '*')
				System.out.println(a * b);
			else if (op1 == '/')
				System.out.println(a / b);
			else
			{
				System.out.println("Sorry! The accepted arithmetic operators are: +, -, * and /");
				System.exit(0);
			}
		}
		else
		{
			System.out.println("Sorry! This calculator only supports values from 1 to 10");
			System.exit(0);
		}
	}

}
