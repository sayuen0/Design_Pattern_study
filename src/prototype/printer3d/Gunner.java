package prototype.printer3d;

public class Gunner {
	public static void main(String[] args) {
		Printer printer = new Printer();
		Gun gun1 = new Gun("ワルサーp38");
		Gun gun2 = new Gun("マジカルマスケット銃");
		printer.register("ルパンの愛機", gun1);
		printer.register("マミさんの愛機", gun2);

		Gun cloneGun1 = (Gun)printer.clone("ルパンの愛機");
		cloneGun1.use(2);
		Gun cloneGun2 = (Gun)printer.clone("マミさんの愛機");
		cloneGun2.use(6);
	}

}
