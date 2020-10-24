package Drzewo;

public class Main {
	public static void main(String[] args) {
		TreeAppearance year[] = new TreeAppearance[] {new Spring(), new Summer(), new Autumn(), new Winter()};
		Tree bartek = new Tree();
		
		for (int i = 0; i < 4; i++) {
			bartek.setTreeAppearance(year[i]);
			bartek.showTree();
			System.out.println("------");
			
		}
	}
}
