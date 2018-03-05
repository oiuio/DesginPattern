package create.singleton;

/**
 * 内部匿名类
 */
public class Singleton4 {

	private Singleton4() {
	}

	public static Singleton4 getInstance() {
		return InnerSingle.singleton;
	}

	private static class InnerSingle {
		static final Singleton4 singleton = new Singleton4();
	}

}
