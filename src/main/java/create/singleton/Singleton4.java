package create.singleton;

/**
 * 匿名类
 */
public class Singleton4 {

	private Singleton4() {
	}

	public static Singleton4 getInstace() {
		return InnerSingle.singleton;
	}

	private static class InnerSingle {
		static final Singleton4 singleton = new Singleton4();
	}

}
