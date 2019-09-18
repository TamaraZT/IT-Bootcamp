package domaci;

import domaci.Utils;

public class Glavni {

	public static void main(String[] args) {
		Utils.setExcell("Data (DOM).xls");
		Utils.setWorkSheet(0);
		System.out.println(Utils.getDataAt(0, 12));
		Utils.setDataAt(0,13, 14);
		Utils.closeExcell();

	}
}