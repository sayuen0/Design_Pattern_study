package prototype.printer3d;

public interface Product extends Cloneable {
	public void use(int count);
	public abstract Product createClone();

}
