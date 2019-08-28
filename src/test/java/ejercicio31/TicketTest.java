package ejercicio31;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.testng.Assert.*;

public class TicketTest {

    private Ticket ticket;

    @BeforeTest
    public void setup(){
        ticket = new Ticket(1, new Date());
    }

    @Test
    public void testAgregarQuitarItem(){
        Item item = new Item("coca", 1, 100);
        Item item2 = new Item ("pepsi", 2, 150);
        ticket.agregarItem(item);
        ticket.agregarItem(item2);
        ticket.removerItem(item2);

        assertTrue(ticket.contieneItem(item));
        assertFalse(ticket.contieneItem(item2));
    }

    @Test
    public void testBuscarProducto(){
        Item item = new Item("coca", 1, 100);
        Item item2 = new Item ("pepsi", 2, 150);
        ticket.agregarItem(item);
        ticket.agregarItem(item2);

        List<Item> items = ticket.buscarPorProducto("coca");
        List<Item> itemsEsperados = Arrays.asList(item, item2);

        assertEquals(items, itemsEsperados);

    }
}