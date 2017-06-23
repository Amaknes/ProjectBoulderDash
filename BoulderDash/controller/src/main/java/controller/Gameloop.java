package controller;

import java.sql.SQLException;

public class Gameloop {
	public void SummonGravity(Controller Controller) 
	{
		StrategyDecider SD = new StrategyDecider();
	       int i=0;
	       int e=0;
	       for(i=0;i<=25;i++)
	       {
	           for(e=0;e<=25;e++)
	           {
	           SD.DefineStrategyFromContext(i,e, Controller);
	           }
	       }
	}
}
