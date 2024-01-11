public class threeIntegers {
	int a;
	char op1;
	int b;
	char op2;
	int c;

	// a constructor
	public threeIntegers(int a, char op1, int b, char op2, int c) {
		this.a = 0;
		this.op1 = '+';
		this.b = 0;
		this.op2 = '+';
		this.c = 0;
	}

	// a logic method
	public static void threeIntegerLogic(int a, char op1, int b, char op2, int c)
	{
		if (a <= 10 && b <= 10 && c <= 10)
                                {

                                        if (op1 == '+' && op2 == '+')
                                                System.out.println(a + b + c);
                                        else if (op1 == '-' && op2 == '-')
                                                System.out.println(a - b - c);
                                        else if (op1 == '*' && op2 == '*')
                                                System.out.println(a * b * c);
                                        else if (op1 == '/' && op2 =='/')
                                                System.out.println(a / b / c);
                                        else if (op1 == '+' && op2 == '-')
                                                System.out.println(a + b - c);
                                        else if (op1 == '+' && op2 == '*')
                                                System.out.println(a + b * c);
                                        else if (op1 == '+' && op2 == '/')
                                                System.out.println(a + b / c);
                                        else if (op1 == '-' && op2 == '+')
                                                System.out.println(a - b + c);
                                        else if (op1 == '-' && op2 == '*')
                                                System.out.println(a - b * c);
                                        else if (op1 == '-' && op2 == '/')
                                                System.out.println(a - b / c);
                                        else if (op1 == '*' && op2 == '+')
                                                System.out.println(a * b + c);
                                        else if (op1 == '*' && op2 == '-')
                                                System.out.println(a * b - c);
                                        else if (op1 == '*' && op2 == '/')
                                                System.out.println(a * b / c);
                                        else if (op1 == '/' && op2 == '+')
                                                System.out.println(a / b + c);
                                        else if (op1 == '/' && op2 == '-')
                                                System.out.println(a / b - c);
                                        else if (op1 == '/' && op2 == '*')
                                                System.out.println(a / b * c);
                                        else
                                        {
                                                System.out.println("Sorry! The accepted arithmetic operators are: +, -, * and /");
                                                System.exit(0);
                                        }
                                } else {
                                        System.out.println("Sorry! This calculator only supports values from 1 to 10");
					System.exit(0);
				}
	}

}
