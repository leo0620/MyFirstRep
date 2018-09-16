package com.shengsiyuan2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest2
{
	public static void main(String[] args)
	{
		TreeSet set = new TreeSet(new PersonComparator());  //TreeSet的带参数的构造方法

		Person p1 = new Person(10);
		Person p2 = new Person(20);
		Person p3 = new Person(30);
		Person p4 = new Person(40);

		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
//      Iterator()是TreeSet里面的方法，可以取出里面的内容，返回值为Iterator类型
//		Itertor()方法调用返回一个迭代器在此set升序排列元素
		for(Iterator iter = set.iterator(); iter.hasNext();)//hasNext()是指向下一个
		{
			Person p = (Person)iter.next();
			System.out.println(p.score);
		}

	}
}

class Person
{
	int score;

	public Person(int score)
	{
		this.score = score;
	}

	public String toString()
	{
		return String.valueOf(this.score);
	}
}

class PersonComparator implements Comparator
{
	//返回值小于零:arg0排在argue的前面；返回值大于零:arg0排在argue的后面
	public int compare(Object arg0, Object arg1)
	{
		Person p1 = (Person) arg0;
		Person p2 = (Person) arg1;
		//分数按倒序排
		return p2.score - p1.score;  //相减就会产生三种情况：1、等于零  2、大于零  3、小于零
	}
}

