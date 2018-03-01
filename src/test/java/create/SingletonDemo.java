package create;

import create.singleton.Singleton1;
import create.singleton.Singleton2;
import create.singleton.Singleton3;
import create.singleton.Singleton4;

public class SingletonDemo {
	public static void main(String[] args) {

		Singleton1 singleton1 = Singleton1.getInstance();

		Singleton2 singleton2 = Singleton2.getInstance();

		Singleton3 singleton3 = Singleton3.getInstance();

		Singleton4 singleton4 = Singleton4.getInstace();
	}
}
