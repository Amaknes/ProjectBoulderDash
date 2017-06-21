package controller;

public class StrategyDecider {
	private Strategy Strat;

	public void ChangeStrategy(Strategy NewStrat) {
		this.Strat = NewStrat;
	}

	public void DefineStrategyFromContext(int CaseX,int CaseY, Controller controller)
 {
	char TestedCase = controller.getTableauValue(CaseX,CaseY);
	char TestedCaseOrigin = TestedCase;
	char TestedCase1;
	if(TestedCase == 'G' || TestedCase == 'R') 
	{
		//BeginCheckTumbling
		TestedCase = controller.getTableauValue(CaseX,CaseY-1);
		if(TestedCase == 'G' || TestedCase == 'R')
		{
		 TestedCase = controller.getTableauValue(CaseX-1,CaseY);
		 TestedCase1 = controller.getTableauValue(CaseX-1,CaseY-1);
		 if(TestedCase == 'V' && TestedCase1 == 'V')
		 	{
			 	controller.setTableauValue(CaseX, CaseY, 'V');
			 	if(TestedCaseOrigin == 'D')
			 		{
			 		this.ChangeStrategy(new Tumbling(true,'G'));
			 		}
				else
			 		{
					this.ChangeStrategy(new Tumbling(true,'R'));
			 		}
		 	}
		 else
		 	{
			 TestedCase = controller.getTableauValue(CaseX+1,CaseY);
			 TestedCase1 = controller.getTableauValue(CaseX+1,CaseY-1);
			 if(TestedCase == 'V' && TestedCase1 == 'V')
			 	{
				 	controller.setTableauValue(CaseX, CaseY, 'V');
				 	if(TestedCaseOrigin == 'D')
				 		{
				 		this.ChangeStrategy(new Tumbling(false,'G'));
				 		}
					else
				 		{
						this.ChangeStrategy(new Tumbling(false,'R'));
				 		}
			 	}
		 	}
		 //End Tumbling Test
		}
		//Begin the Simple System-Gravity checks
		 if(TestedCase == 'V')
		 {
			 
		 }
	}
 }
}