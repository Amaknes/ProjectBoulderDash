package controller;

public class Tumbling implements Strategy {
	private boolean Side;
	private char CharToUse;
	Tumbling(boolean Side,char ChartoUse)
	{
	this.Side = Side;
	this.CharToUse = ChartoUse;
	}
	@Override
	public void AlterMap(int CaseX,int CaseY,Controller controller) {
		// TODO Auto-generated method stub
		controller.setTableauValue(CaseX, CaseY,'V');
		if(this.Side == true)
		{
			//Left Side
			controller.setTableauValue(CaseX-1, CaseY-1,this.CharToUse);
		}
		else
		{
			//RightSide
			controller.setTableauValue(CaseX+1, CaseY-1,this.CharToUse);
		}
	}

}
