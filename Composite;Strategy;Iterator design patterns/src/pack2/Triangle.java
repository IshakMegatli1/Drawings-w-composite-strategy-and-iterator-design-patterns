package pack2;

public class Triangle implements Dessin {
    private String name;

    public Triangle(String name) {
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
 