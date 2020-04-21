package com.senliang.design.singleton;

public class Singleton02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton instance01 = Singleton.getInstance();
		Singleton instance02 = Singleton.getInstance();
		System.out.println(instance01==instance02);
		System.out.println(instance01.getClass().hashCode());
		System.out.println(instance02.getClass().hashCode());

	}


}

//饿汉式（静态常量）
class Singleton{
	//构造器私有化，外部不能new
	private Singleton(){
	}
	//静态常量，本类内部创建对象
	private final static Singleton instance = new Singleton();
	//提供一个公有的静态方法，返回实例对象
	public static Singleton getInstance() {
		return instance;
	}
}
