package pack2;

public class AffichageService {
    private Dessin dessinStrat;
    private AffichageStrat strategy;

    public void dessinerAvecStrat(String choixUser) {
        if (strategy != null) {
            strategy.drawStrat(dessinStrat);
        }
    }

    public void setDessinStrat(Dessin dessinStrat) {
        this.dessinStrat = dessinStrat;
    }

    public void setStrategy(AffichageStrat strategy) {
        this.strategy = strategy;
    }
}

