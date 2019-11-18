package org.ldv.sio;

public class AdresseEtendu {
    private String email;

    public AdresseEtendu(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return email;
    }
}
