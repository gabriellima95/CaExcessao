
public class CalculatorEngine {
	double value;
	double keep;
	char toDo;
	
	void binaryOperation(char op) {
		keep = value;
		value = 0;
		toDo = op;
	}
	
	
	void add()	{binaryOperation('+');}
	void subtract()	{binaryOperation('-');}
	void multiply()	{binaryOperation('*');}
	void divide()	{binaryOperation('/');}
	
	void compute()	{
		if (toDo=='+')
			value=value+keep;
		else if (toDo=='-')
			value=keep-value;
		else if (toDo=='*')
			value=value*keep;
		else if (toDo=='/')
			value=keep/value;
		keep=0;
		System.out.println("" + keep);
		System.out.println(" " + value);
	}
	void clear() {
		value=0;
		keep=0;
	}
	void digit(int x) {
		value=value*10+x;
		System.out.println("" + value);
	}
	double display() {
		return(value);
	}
	CalculatorEngine() { clear(); }
}
