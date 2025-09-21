package pack2;

public class CheminComplet implements AffichageStrat{

	@Override
	public void drawStrat(Dessin dessin) {
		drawWithPath(dessin, "");
	}
	
	private void drawWithPath(Dessin dessin, String path) {
        String currentPath = path.isEmpty() ? dessin.getName() : path + "." + dessin.getName();
        System.out.println(currentPath);
       // dessin.draw(currentPath);

        if (dessin instanceof DessinClass) {
        	DessinClass composite = (DessinClass) dessin;
            for (Dessin component : composite) {
            	 //dessin.draw(currentPath);
            	drawWithPath(component, currentPath);
            }
        }
    }

}

//path permet de se rapeller du chemin de chaque component (formes comme le cercle) 
//qui compose un Dessin "composite"