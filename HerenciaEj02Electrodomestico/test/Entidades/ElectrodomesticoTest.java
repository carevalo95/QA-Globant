/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author 57312
 */
public class ElectrodomesticoTest {
    
    public ElectrodomesticoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of comprobarConsumoEnergetico method, of class Electrodomestico.
     */
    @Test
    public void testComprobarConsumoEnergetico() {
        System.out.println("comprobarConsumoEnergetico");
        char letraConsumo = 'a';
        Electrodomestico instance = new Electrodomestico();
        char expResult = 'A';
        char result = instance.comprobarConsumoEnergetico(letraConsumo);
        assertEquals(expResult, result);
    }

    /**
     * Test of comprobarColor method, of class Electrodomestico.
     */
    @Test
    public void testComprobarColor() {
        System.out.println("comprobarColor");
        String color = "Rosa";
        Electrodomestico instance = new Electrodomestico();
        String expResult = "Blanco";
        String result = instance.comprobarColor(color);
        assertEquals(expResult, result);
    }

    /**
     * Test of crearElectrodomestico method, of class Electrodomestico.
     */
    @Ignore
    @Test
    public void testCrearElectrodomestico() {
        System.out.println("crearElectrodomestico");
        Electrodomestico instance = new Electrodomestico();
        instance.crearElectrodomestico();
        assertNotNull(instance);
    }

    /**
     * Test of precioFinal method, of class Electrodomestico.
     */
    @Test
    public void testPrecioFinal() {
        System.out.println("precioFinal");
        Electrodomestico instance = new Electrodomestico("Blanco",'B', 50);
        instance.precioFinal();
        assertEquals(2600, instance.getPrecio(),0);
    }

    /**
     * Test of buscarPrecioConsumo method, of class Electrodomestico.
     */
    @Test
    public void testBuscarPrecioConsumo() {
        System.out.println("buscarPrecioConsumo");
        char consumo = 'A';
        Electrodomestico instance = new Electrodomestico();
        double expResult = 1000.0;
        double result = instance.buscarPrecioConsumo(consumo);
        assertEquals(expResult, result, 0.0);
    }
    
}
