package controller;

public class Fall implements Strategy {
	private char CharToUse;
	Fall(char CharToUse)
	{
		this.CharToUse=CharToUse;
	}
	@Override
	public void AlterMap(int CaseX, int CaseY, Controller controller) {
		// TODO Auto-generated method stub
		controller.setTableauValue(CaseX, CaseY,'V');
		controller.setTableauValue(CaseX, CaseY-1,CharToUse);
		//A rajouter,Tuer le joueur Ici
	}

}
