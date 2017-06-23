package controller;

public class MonsterMove {
	boolean SkipNext = false;

	public void AlterMap(int CaseX, int CaseY, Controller controller) {
		char TestedCase = controller.getTableauValue(CaseX, CaseY);
		if (this.SkipNext = false) {
			if (TestedCase == 'B' || TestedCase == 'M') {
				if(TestedCase == 'B')
				{
					
				}
				else
				{
					
				}
			}
		}
		else
		{
			this.SkipNext = false;
		}
	}

}
