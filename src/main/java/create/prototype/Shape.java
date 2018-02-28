package create.prototype;

public abstract class Shape implements Cloneable {
	private String id;
	protected String type;

	abstract void draw();

	public String getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public Shape setId(String id) {
		this.id = id;
		return this;
	}

	@Override
	protected Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
