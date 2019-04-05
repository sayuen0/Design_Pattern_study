package prototype.crystals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//import java.awt.print.Paper;

public class Teacher {
	public Paper[] createManyCrystals(String name, int lng) {
		Paper prototype = new Paper(name);
		drawCrystal(prototype);
		cutAccordanceWithLine(prototype);


		Paper[] papers = new Paper[lng];
		papers[0] = prototype;

		for (int i = 1; i < papers.length; i++) {
			papers[i] = (Paper)prototype.createClone();
			System.out.println((i+1)+"個目の雪の結晶を作った。コピーしたので楽チンだ。");
		}
		return papers;
	}
	private void drawCrystal(Paper paper) {
		System.out.println(paper.getName()+"の絵を描いた。時間がかかった");
	}
	private void cutAccordanceWithLine(Paper paper) {
		System.out.println(paper.getName()+"の形に切り取った。時間がかかった");
	}

	public static void main(String[] args) {
		PrototypeKeeper keeper = new PrototypeKeeper();
		String snow = "雪の結晶";
		keeper.addCloneable(snow, new Paper(snow));
		List<Paper> papers = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			papers.add((Paper)keeper.getClone(snow));
		}
		for (Iterator iterator = papers.iterator(); iterator.hasNext();) {
			Paper paper = (Paper) iterator.next();
			System.out.println(paper.getName());
		}
	}
}
