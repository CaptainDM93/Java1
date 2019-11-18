package org.ldv.sio;

public class Main {

  public static void main(String[] args) {
    Adresse un = new Adresse("3 rue du clocher", "Melun", "77000");
    Adresse deux = new Adresse("2 rue du cimetière", "Paris", "75001");
    Adresse trois = new Adresse("1 rue du cinema", "Marseille", "13001");

    Client c = new Client("Dijkstra", "Edsger",un,"edsger@dijstra.org"/*,null*/);
    Client d = new Client("Kernighan","Brian",deux,"brian@kernighan.org"/*,un*/);
    Client e = new Client ("Knuth", "Donald",trois,"knuth@donald.org");

    Client Mr_Capuozzo = new Client ("Capuozzo", "Olivier", deux, "olivier.capuozzo@gmail.com");

    System.out.println(c.toString());
    System.out.println(d.toString());
    System.out.println(e.toString());

    System.out.println(Mr_Capuozzo.toString());
  }
}