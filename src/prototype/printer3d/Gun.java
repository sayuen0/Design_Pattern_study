package prototype.printer3d;

public class Gun implements Product {
	private String name;
	public Gun(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void use(int bullets) {
		System.out.println(name+"で"+bullets+"発打った");
	}

	@Override
	public Product createClone() {
		Product product = null;
		try {
			product = (Product) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return product;
	}



}
