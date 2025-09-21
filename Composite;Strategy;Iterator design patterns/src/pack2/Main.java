package pack2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        Cercle cercle1 = new Cercle("Cercle1");
        Cercle cercle2 = new Cercle("Cercle2");
        Cercle cercle3 = new Cercle("Cercle3");
        Triangle triangle1 = new Triangle("Triangle1");
        Triangle triangle2 = new Triangle("Triangle2");
        Rectangle rectangle1 = new Rectangle("Rectangle1");

       
        DessinClass dessin1 = new DessinClass("Dessin1");

      
        DessinClass dessin2 = new DessinClass("Dessin2");
        DessinClass dessin3 = new DessinClass("Dessin3");
        DessinClass dessin4 = new DessinClass("Dessin4");
        
        Scanner clavier = new Scanner(System.in);
       
    	
    	System.out.println("Entrez le dessin à tester :\n"+"1- Dessin avec trois niveaux\n"
        +"2- Dessin avec deux niveaux\n"+ "3- Dessin avec un niveaux (une forme seulement)\n");
        String choixTest = clavier.nextLine();
        if (choixTest.equals("1")) {
           
            dessin2.addComponent(dessin3);
            dessin3.addComponent(cercle2);
            dessin3.addComponent(cercle3);
            
            dessin4.addComponent(triangle1);
            dessin4.addComponent(triangle2);
            dessin2.addComponent(dessin4);
            dessin2.addComponent(rectangle1);
            dessin1.addComponent(cercle1);
            dessin1.addComponent(dessin2);
        }
        else if (choixTest.equals("2")) {
        	dessin1.addComponent(cercle1);
        	dessin1.addComponent(dessin2);
        	dessin2.addComponent(rectangle1);
        }
        else if (choixTest.equals("3")) {
        	dessin1.addComponent(cercle1);
        }
        
        
        System.out.println("Entrez la strategie d'affichage à utiliser :\n" +"1- Indentation\n2- Chemin complet");
        choixTest = clavier.nextLine();
    	
    	
        AffichageService service = new AffichageService();
        service.setDessinStrat(dessin1);
    	
        if(choixTest.equals("1")) {
        	
            System.out.println("\nIndentation:");
            service.setStrategy(new Indentation());
            service.dessinerAvecStrat("");
        	
        }
        else if (choixTest.equals("2")) {
        	System.out.println("CheminComplet:");
            service.setStrategy(new CheminComplet());
            service.dessinerAvecStrat("");
        }
        
       
        

    }
}