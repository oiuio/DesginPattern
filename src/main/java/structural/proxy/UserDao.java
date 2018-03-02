package structural.proxy;


public class UserDao implements IUserDao {

	@Override
	public void save() {
		System.out.println("== save() ==");
	}

	@Override
	public void insert() {
		System.out.println("== insert() ==");
	}
}

