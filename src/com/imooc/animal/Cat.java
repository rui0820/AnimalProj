package com.imooc.animal;

public class Cat extends Animal {
	private double weight;//体重
	public static int st3 = 44;

	static {
		System.out.println("我是子类的静态代码块");
	}
	{
		System.out.println("我是子类的构造代码块");
	}
	
	public Cat() {
		System.out.println("我是子类的无参构造方法");
	}
	public Cat(String name,int month) {
		//子类构造默认调用父类无参构造方法
		super(name,month);//super语句调用指定父类构造方法（不调用无参构造）
		System.out.println("我是子类的带参构造方法");
	}
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//跑动的方法
	public void run() {
		System.out.println(this.getName() + "是一只" + this.getSpecies() + "在快乐的跑步");
	}

}
