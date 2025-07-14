package introToObjectOriantedProgramming;

public class BiNumbers {
	int numberOne;
	int numberTwo;

	BiNumbers(int numberOne, int numberTwo) {
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
	}

	public int Add() {
		return this.numberOne + this.numberTwo;
	}

	public int Multiply() {
		return this.numberOne * this.numberTwo;
	}

	public void Double() {
		this.numberOne = this.numberOne * 2;
		this.numberTwo = this.numberTwo * 2;
	}

	public int GetNumberOne() {
		return this.numberOne;
	}

	public int GetNumberTwo() {
		return this.numberTwo;
	}

}
