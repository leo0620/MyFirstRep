package com.shengsiyuan3;

public class Client
{
	public static void main(String[] args)
	{
		AddStrategy addStrategy = new AddStrategy();

		Environment environment = new Environment(addStrategy);//指定想要实现的策略

		System.out.println(environment.calculate(3, 4));

		SubtractStrategy subtractStrategy = new SubtractStrategy();

		environment.setStrategy(subtractStrategy);//set可以重新指定策略方法

		System.out.println(environment.calculate(3, 4));

		MultiplyStrategy multiplyStrategy = new MultiplyStrategy();

		environment.setStrategy(multiplyStrategy);

		System.out.println(environment.calculate(3, 4));

		DivideStrategy divideStrategy = new DivideStrategy();

		environment.setStrategy(divideStrategy);

		System.out.println(environment.calculate(3, 4));

	}
}
