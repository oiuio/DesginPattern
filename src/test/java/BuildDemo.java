import builder.Meal;
import builder.MealBuilder;

import java.util.ArrayList;
import java.util.List;

public class BuildTest {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		Meal meal = mealBuilder.prepareVegMeal();
		meal.showItems();
		meal.getCost();




		LaptopBuild laptopBuild = new LaptopBuild();
		Laptop laptop = laptopBuild.buildAMDLaptop();
		laptop.showDetail();

		laptop = laptopBuild.buildIntelLaptop();
		laptop.showDetail();
	}
}

class Laptop {
	private List<Component> components = new ArrayList<>();

	public Laptop addComponent(Component component) {
		this.components.add(component);
		return this;
	}

	public void showDetail() {
		for (Component component : components) {
			System.out.println(component.name + " : " + component.price);
		}
	}
}

class LaptopBuild {
	public Laptop buildIntelLaptop() {
		Laptop laptop = new Laptop();
		laptop.addComponent(new IntelCPU());
		laptop.addComponent(new DDR3());
		laptop.addComponent(new NVIDIA());
		return laptop;
	}

	public Laptop buildAMDLaptop() {
		Laptop laptop = new Laptop();
		laptop.addComponent(new AMDCPU());
		laptop.addComponent(new DDR4());
		laptop.addComponent(new AMD());
		return laptop;
	}
}


abstract class Component {
	String name;
	float price;
}

abstract class CPU extends Component {

}

class IntelCPU extends CPU {
	public IntelCPU() {
		this.name = "IntelCPU";
		this.price = 200;
	}
}

class AMDCPU extends CPU {
	public AMDCPU() {
		this.name = "AMDCPU";
		this.price = 100;
	}
}

abstract class Memory extends Component {

}

class DDR3 extends Memory {
	public DDR3() {
		this.name = "DDR3";
		this.price = 100;
	}
}

class DDR4 extends Memory {
	public DDR4() {
		this.name = "DDR4";
		this.price = 150;
	}
}

abstract class GraphicsCard extends Component {

}

class NVIDIA extends GraphicsCard {
	public NVIDIA() {
		this.name = "NVIDIA";
		this.price = 200;
	}
}

class AMD extends GraphicsCard {
	public AMD() {
		this.name = "AMD";
		this.price = 150;
	}

}