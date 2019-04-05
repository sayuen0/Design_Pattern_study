package prototype.product.entity;

import prototype.product.frameworks.Manager;
import prototype.product.frameworks.Product;

public class Main {
	public static void main(String[] args) {
		Manager manager = new Manager();
		UnderLinePen linePen = new UnderLinePen('~');
		MessageBox mbox = new MessageBox('*');
		MessageBox sbox = new MessageBox('/');
		manager.register("強調メッセージ", linePen);
		manager.register("警告ボックス",mbox);
		manager.register("斜めボックス	", sbox);

//		生成
		Product p1 = manager.create("強調メッセージ");
		p1.use("Hello world");
		Product p2 = manager.create("警告ボックス");
		p2.use("Hello world");
		Product p3 = manager.create("斜めボックス	");
		p3.use("Hello world");
	}
}
