package controller;

public class StrategyDecider {
	private Strategy Strat;

	public void ChangeStrategy(Strategy NewStrat) {
		this.Strat = NewStrat;
	}

	public void DefineStrategyFromContext(int CaseX,int CaseY, Controller controller)
 {
	char TestedCase = controller.getTableauValue(CaseX,CaseY);
	char TestedCase1;
	if(TestedCase == 'G' || TestedCase == 'R') 
	{
		//DébutCheckTumbling
		TestedCase = controller.getTableauValue(CaseX,CaseY-1);
		if(TestedCase == 'G' || TestedCase == 'R')
		{
		 //DébutCheckTumblingLeft
		 TestedCase = controller.getTableauValue(CaseX-1,CaseY);
		 TestedCase1 = controller.getTableauValue(CaseX-1,CaseY-1);
		 if(TestedCase == 'V' && TestedCase1 == 'V')
		 	{
			 controller.setTableauValue(CaseX, CaseY, 'V');
			 if(TestedCase == 'V' && TestedCase1 == 'V')
			 	{
				 
			 	}
		 	}
		}
		}
 }
}