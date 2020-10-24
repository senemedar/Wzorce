package Drzewo;

public class Tree {
	private TreeAppearance treeAppearance;
	
	public Tree() {
	}
	
	public void setTreeAppearance(TreeAppearance treeAppearance) {
		this.treeAppearance = treeAppearance;
	}
	
	public void showTree() {
		treeAppearance.showTree();
	}
}
