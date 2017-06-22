package controller;

public class StrategyDecider {
	private Strategy Strat;

	public void ChangeStrategy(Strategy NewStrat) {
		this.Strat = NewStrat;
	}

	public void DefineStrategyFromContext(int CaseX, int CaseY, Controller controller) {
		char TestedCase = controller.getTableauValue(CaseX, CaseY);
		char TestedCaseOrigin = TestedCase;
		char TestedCase1;
		if (TestedCase == 'G' || TestedCase == 'R') {
			// BeginCheckTumbling
			TestedCase = controller.getTableauValue(CaseX, CaseY - 1);
			if (TestedCase == 'G' || TestedCase == 'R') {
				TestedCase = controller.getTableauValue(CaseX - 1, CaseY);
				TestedCase1 = controller.getTableauValue(CaseX - 1, CaseY - 1);
				if (TestedCase == 'V' && TestedCase1 == 'V') {
					controller.setTableauValue(CaseX, CaseY, 'V');
					if (TestedCaseOrigin == 'G') {
						this.ChangeStrategy(new Tumbling(true, 'G'));
						this.Strat.AlterMap(CaseX, CaseY, controller);
					} else {
						this.ChangeStrategy(new Tumbling(true, 'R'));
						this.Strat.AlterMap(CaseX, CaseY, controller);
					}
				} else {
					TestedCase = controller.getTableauValue(CaseX + 1, CaseY);
					TestedCase1 = controller.getTableauValue(CaseX + 1, CaseY - 1);
					if (TestedCase == 'V' && TestedCase1 == 'V') {
						controller.setTableauValue(CaseX, CaseY, 'V');
						if (TestedCaseOrigin == 'G') {
							this.ChangeStrategy(new Tumbling(false, 'G'));
							this.Strat.AlterMap(CaseX, CaseY, controller);
						} else {
							this.ChangeStrategy(new Tumbling(false, 'R'));
							this.Strat.AlterMap(CaseX, CaseY, controller);
						}
					}
				}
				// End Tumbling Test
			}
			// Begin the Simple System-Gravity checks
			if (TestedCase == 'V' || TestedCase == 'M' || TestedCase == 'P') {
				this.ChangeStrategy(new Fall(TestedCaseOrigin, TestedCase));
				this.Strat.AlterMap(CaseX, CaseY, controller);
			}

			if (TestedCase == 'B') {
				this.ChangeStrategy(new DiamondMonsterKill());
				this.Strat.AlterMap(CaseX, CaseY, controller);
			}

		}
		
	}
}