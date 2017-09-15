package model;

import java.io.Serializable;

public class Address implements Serializable {

        private Long id;
        private String first;
        private String last;
        private String email;

    public Address() {
        }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getMail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
