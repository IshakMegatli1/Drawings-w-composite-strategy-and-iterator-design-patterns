package pack2;

public class Rectangle implements Dessin {
    private String name;

    public Rectangle(String name) {
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
