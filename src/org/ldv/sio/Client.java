package org.ldv.sio;

public class Client{
  private String nom;
  private String prenom;
  //private Adresse adresseLivraison;
  private Adresse adresseDomicile;
  private String adresseEtendu;

  public Client(String nom, String prenom, Adresse adresseDomicile, String adresseEtendu/*,Adresse adresseLivraison*/) {
    this.nom = nom;
    this.prenom = prenom;
    //this.adresseLivraison = adresseLivraison;
    this.adresseDomicile = adresseDomicile;
    this.adresseEtendu = adresseEtendu;

    //if (adresseLivraison == null){
    // this.adresseLivraison = adresseDomicile;
    //   }
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  //public Adresse getAdresseLivraison() {
  //  return adresseLivraison;
  // }

   //public void setAdresseLivraison(Adresse adresseLivraison) {
   //   this.adresseLivraison = adresseLivraison;
   //}

    public Adresse getAdresseDomicile() {
        return adresseDomicile;
    }

  public void setAdresseDomicile(Adresse adresseDomicile) {
    this.adresseDomicile = adresseDomicile;
  }


  @Override
  public String toString() {
    return "Client \n" +
            "nom = '" + nom + "'\n" +
            "prenom ='" + prenom + "'\n" +
            "adresseDomicile = " + adresseDomicile + "\n" +
            "email = " + adresseEtendu + "\n";
  }
}