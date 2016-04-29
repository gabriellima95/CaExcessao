
public class CalculatorEngine {
	int value;
	int keep;
	char toDo;
	int dividezero=0;
	
	void binaryOperation(char op) {
		keep = value;
		value = 0;
		toDo = op;
	}
	int dividezero(){
		if (dividezero==1)
			return 1;
		else {return 0;}

	}
	
	void add()	{binaryOperation('+');}
	void subtract()	{binaryOperation('-');}
	void multiply()	{binaryOperation('*');}
	void divide()	{binaryOperation('/');}
	
	void compute()	{
		dividezero = 0;
		if (toDo=='+')
			value=value+keep;
		else if (toDo=='-')
			value=keep-value;
		else if (toDo=='*')
			value=value*keep;
		else if (toDo=='/')
			try{value=keep/value;}
		catch(ArithmeticException excecao){
		dividezero=1;}
		keep=0;
	}
	void clear() {
		value=0;
		keep=0;
	}
	void digit(int x) {
		value=value*10+x;
	}
	int display() {
		return(value);
	}
	CalculatorEngine() { clear(); }
}
