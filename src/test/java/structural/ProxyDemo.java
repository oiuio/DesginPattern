package structural;

import structural.proxy.*;

public class ProxyDemo {
	public static void main(String[] args) {
		//static proxy
		System.out.println("***** Static Proxy *****");
		StaticProxy.main(null);
		//dynamic proxy
		System.out.println("\n***** Dynamic Proxy *****");
		IUserDao target = new UserDao();
		System.out.println(target.getClass());
		IUserDao proxy = (IUserDao) new ProxyFactory().bind(target);
		System.out.println(proxy.getClass());
		proxy.insert();
		//cglib proxy
		System.out.println("\n***** Cglib Proxy *****");
		UserDao2 target2 = new UserDao2();
		UserDao2 cglibProxy = (UserDao2) new CglibProxyFactory(target2).getProxyInstance();
		cglibProxy.save();

	}
}
