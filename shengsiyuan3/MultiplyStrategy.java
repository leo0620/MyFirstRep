package com.shengsiyuan3;

public class MultiplyStrategy implements Strategy
{

	@Override
	public int calculate(int a, int b)
	{
		return a * b;
	}

}
