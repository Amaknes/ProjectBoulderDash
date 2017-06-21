package controller;


public class StrategyDecider {
 private Strategy Strat;
 public void ChangeStrategy(Strategy NewStrat)
 {
	 this.Strat= NewStrat;
 }
 public void DefineStrategyFromContext(int CaseX,int CaseY, Controller controller)
 {
	char TestedCase = controller.getTableauValue(CaseX,CaseY);
	if(TestedCase == 'G' || TestedCase == 'R') 
	{
		
	}
 }
}