package ejercicio31;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Ticket {

    private int id;
    private List<Item> items;
    private Date fecha;

    public Ticket(int id, Date fecha) {
        this.id = id;
        this.fecha = fecha;
        items = new ArrayList<>();
    }

    public void agregarItem(Item item){
        items.add(item);
    }

    public void removerItem(Item item){
        items.remove(item);
    }

    public boolean contieneItem(Item item){
        return items.contains(item);
    }

    public List<Item> buscarPorProducto(String producto){
        return items.stream()
                .filter(i -> i.getNombre().equals(producto))
                .collect(Collectors.toList());
    }
}
