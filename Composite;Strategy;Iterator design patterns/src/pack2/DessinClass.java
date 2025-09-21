package pack2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DessinClass implements Dessin, Iterable<Dessin> {
    private List<Dessin> components = new ArrayList<>();
    private String name;

    public DessinClass(String name) {
        this.name = name;
    }

    public void addComponent(Dessin component) {
        components.add(component);
    }

    @Override
    public void draw(String path) {
    	 String currentPath = path.isEmpty() ? name : path + "." + name;
         System.out.println(currentPath);
         for (Dessin component : components) {
             component.draw(currentPath);
         }
    }

    @Override
    public Iterator<Dessin> iterator() {
        return components.iterator();
    }

    @Override
    public String getName() {
        return name;
    }
}