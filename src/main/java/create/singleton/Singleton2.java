package create.singleton;

/**
 * 饿汉式
 */
public class Singleton2 {
	//基于 classloder 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化
	private static Singleton2 singleton = new Singleton2();

	private Singleton2() {
	}

	public static Singleton2 getInstance() {
		return singleton;
	}
}
