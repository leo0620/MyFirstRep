package com.shengsiyuan2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest2
{
	public static void main(String[] args)
	{
		TreeSet set = new TreeSet(new PersonComparator());  //TreeSet�Ĵ������Ĺ��췽��

		Person p1 = new Person(10);
		Person p2 = new Person(20);
		Person p3 = new Person(30);
		Person p4 = new Person(40);

		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
//      Iterator()��TreeSet����ķ���������ȡ����������ݣ�����ֵΪIterator����
//		Itertor()�������÷���һ���������ڴ�set��������Ԫ��
		for(Iterator iter = set.iterator(); iter.hasNext();)//hasNext()��ָ����һ��
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
	//����ֵС����:arg0����argue��ǰ�棻����ֵ������:arg0����argue�ĺ���
	public int compare(Object arg0, Object arg1)
	{
		Person p1 = (Person) arg0;
		Person p2 = (Person) arg1;
		//������������
		return p2.score - p1.score;  //����ͻ�������������1��������  2��������  3��С����
	}
}
