package structural.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyFactory implements MethodInterceptor {

	private Object target;

	public CglibProxyFactory(Object target) {
		this.target = target;
	}

	public Object getProxyInstance() {
		Enhancer enhancer = new Enhancer();
		//需要指定父类
		enhancer.setSuperclass(target.getClass());
		//以及回调函数
		enhancer.setCallback(this);

		return enhancer.create();
	}

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("== start transaction ==");
		Object returnValue = method.invoke(target, objects);
		System.out.println("== commit transaction ==");
		return returnValue;
	}
}
