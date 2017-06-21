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
		TestedCase = controller.getTableauValue(CaseX,CaseY-1);
		if(TestedCase == 'G' || TestedCase == 'R')
		{
		 TestedCase = controller.getTableauValue(CaseX,CaseY);
		 TestedCase1 = controller.getTableauValue(CaseX,CaseY);
		 if(TestedCase == 'V' && TestedCase1 == 'V')
		 	{
			 
		 	}
		}
		}
 }
}