package pack2;

public class Indentation implements AffichageStrat {
    @Override
    public void drawStrat(Dessin dessin) {
        drawWithIndentation(dessin, 0);
    }

    private void drawWithIndentation(Dessin dessin, int level) {
        printIndented(dessin.getName(), level);

        if (dessin instanceof DessinClass) {
            DessinClass composite = (DessinClass) dessin;
            for (Dessin component : composite) {
                drawWithIndentation(component, level + 1);
            }
        }
    }

    private void printIndented(String name, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("    "); 
        }
        System.out.println(name);
    }
}
//IMPORTANT : pour afficher on utilise name et nom draw()
