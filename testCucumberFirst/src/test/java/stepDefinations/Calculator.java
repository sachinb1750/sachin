package stepDefinations;

public class Calculator {
	public int arg1;
	public int arg2;
	public float result;
	public void add(int arg1,int arg2) {
		this.result = arg1+arg2;
	}
	public float getResult(Calculator c) {
		// TODO Auto-generated method stub
		return c.result;
	}
	public void subtract(int arg12, int arg22) {
		// TODO Auto-generated method stub
		this.result = arg12-arg22;
	}
	public void Multiply(int arg12, int arg22) {
		// TODO Auto-generated method stub
		this.result = arg12*arg22;
	}
}
