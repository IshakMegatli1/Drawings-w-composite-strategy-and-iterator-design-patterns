package pack2;

public class Cercle implements Dessin {
    private String name;

    public Cercle(String name) {
        this.name = name;
    }

    @Override
    public void draw(String path) {
        System.out.println(path + "." + name);
    }

    @Override
    public String getName() {
        return name;
    }
}




