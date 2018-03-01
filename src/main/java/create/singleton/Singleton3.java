package create.singleton;

/**
 * 双重锁
 */
public class Singleton3 {

	private static Singleton3 singeleton;

	private Singleton3() {

	}

	//不锁方法
	public static Singleton3 getInstance() {
		if (singeleton == null) {
			synchronized (Singleton3.class) {
				if (singeleton == null) {
					singeleton = new Singleton3();
				}
			}
		}
		return singeleton;

	}
}
