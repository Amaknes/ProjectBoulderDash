package controller;

public class Fall implements Strategy {

	@Override
	public void AlterMap(int CaseX, int CaseY, Controller controller) {
		// TODO Auto-generated method stub
		controller.setTableauValue(CaseX, CaseY,'V');
		controller.setTableauValue(CaseX, CaseY-1,'R');
	}

}
