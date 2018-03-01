package structural.proxy;

/**
 * 静态代理
 */
public class StaticProxy {

	public static void main(String[] args) {
		UserDaoProxy userDaoProxy = new UserDaoProxy(new UserDao());
		userDaoProxy.insert();
		userDaoProxy.save();
	}

}

interface IUserDao {
	void save();

	void insert();
}

class UserDao implements IUserDao {

	@Override
	public void save() {
		System.out.println("==== save() ====");
	}

	@Override
	public void insert() {
		System.out.println("==== insert() ====");
	}
}

class UserDaoProxy implements IUserDao {

	private IUserDao userDao;

	public UserDaoProxy(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void save() {
		System.out.println("==== start transaction ====");
		this.userDao.save();
		System.out.println("==== commit transaction ====");
	}

	@Override
	public void insert() {
		System.out.println("==== start transaction ====");
		this.userDao.insert();
		System.out.println("==== commit transaction ====");
	}
}