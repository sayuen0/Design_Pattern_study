package prototype.product.frameworks;

public interface Product extends Cloneable{
	public abstract void use(String s);
	public abstract Product createClone();

}
