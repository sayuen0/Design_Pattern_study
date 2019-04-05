package prototype.printer3d;

import java.util.*;

public class Printer {
	Map<String, Cloneable> protoMap = new HashMap<String, Cloneable>();

	public void register(String name,Cloneable prototype) {
		protoMap.put(name,prototype );
	}

	public Product clone(String protoname) {
		Product product = (Product)protoMap.get(protoname);
		return product.createClone();

	}

}
