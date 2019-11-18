package org.ldv.sio;

import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class ClientTest {

    private Client c;
    private Adresse d;

    @Before
    public void initializeEachTest() {
        this.d = new Adresse("3 rue du clocher", "Melun", "77000");
        this.c = new Client("Dijkstra", "Edsger",d,null);
    }

    @Override
    public int hashCode() {
        return Objects.hash(c, d);
    }

    //@Test
    //public void getAdresseLivraison() {
    //     assertEquals("rue : 3 rue du clocher, ville : Melun, code postal : 77000", this.c.getAdresseLivraison());
    //}

    @Test
    public void getNom() {
        assertEquals("Dijkstra", this.c.getNom());
    }

    @Test
    public void setNom() {
        this.c.setNom(this.c.getNom().toUpperCase());
        assertEquals("DIJKSTRA", this.c.getNom());
    }

    @Test
    public void getPrenom() {
        assertEquals("Edsger", this.c.getPrenom());
    }

    @Test
    public void setPrenom() {
        this.c.setPrenom(this.c.getPrenom().toUpperCase());
        assertEquals("EDSGER", this.c.getPrenom());
    }
}