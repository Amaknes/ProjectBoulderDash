package controller;

public class DiamondMonsterKill implements Strategy {

	@Override
	public void AlterMap(int CaseX, int CaseY, Controller controller) {
		// TODO Auto-generated method stub
		controller.setTableauValue(CaseX, CaseY,'G');
	}
	
}
