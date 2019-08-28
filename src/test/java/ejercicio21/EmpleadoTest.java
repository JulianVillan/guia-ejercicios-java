package ejercicio21;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.testng.Assert.*;

public class EmpleadoTest {

    private List<Empleado> empleados;

    @BeforeTest
    public void setup(){
        empleados = new LinkedList<>();

        Empleado vendedor1 = new Vendedor(
                "11", "vendedor1", "A",
                "va@mail", 1000f,
                10.f, 100);

        Empleado vendedor2 = new Vendedor(
                "22", "vendedor2", "B",
                "vb@mail",2000f, 20.f, 2000 );

        Empleado administrativo1 = new Administrativo(
                "33", "admin1", "C",
                "ac@gmail", 4000f, 50, 200);

        empleados.add(vendedor1);
        empleados.add(vendedor2);
        empleados.add(administrativo1);
    }

    @Test
    public void test1(){
        empleados.stream().forEach( e -> System.out.println(e.getSueldo()));
    }
}