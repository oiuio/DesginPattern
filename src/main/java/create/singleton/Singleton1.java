package create.singleton;

/**
 * 懒汉式
 */
public class Singleton1 {

	private static Singleton1 singleton;

	//通过私有构造器防止外部创建对象
	private Singleton1() {
	}

	//提供获取实例方法 synchronized加锁影响效率
	public static synchronized Singleton1 getInstance() {
		if (singleton == null) {
			singleton = new Singleton1();
		}
		return singleton;
	}

}