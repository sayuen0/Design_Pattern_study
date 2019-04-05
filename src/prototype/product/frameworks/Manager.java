package prototype.product.frameworks;

import java.util.HashMap;

public class Manager {

	private HashMap<String, Cloneable> showcase = new HashMap<>();
	public void register(String name, Cloneable prototype) {
		showcase.put(name, prototype);
	}

	public Product create(String protoname) {
		Product p = (Product)showcase.get(protoname);
		return p.createClone();
	}

}
