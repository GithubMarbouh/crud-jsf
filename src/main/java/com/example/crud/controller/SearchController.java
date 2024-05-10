package com.example.crud.controller;

import com.example.crud.model.Contact;
import com.example.crud.service.ServiceContact;
import com.example.crud.service.ServiceContactImp;

import java.util.ArrayList;
import java.util.List;

public class SearchController {
private String motCle;
private Boolean isSearch;
private ServiceContact serviceContact = new ServiceContactImp();

    public SearchController() {
        serviceContact = new ServiceContactImp();
        isSearch = false;
    }
   public SearchController(String motCle) {
        this.motCle = motCle;
    }
    public String getMotCle() {
        return motCle;
    }

    public void setMotCle(String motCle) {
        this.motCle = motCle;
    }

    public Boolean getIsSearch() {
        return isSearch;
    }

    public void setIsSearch(Boolean search) {
       this.isSearch = search;
    }

    public List<Contact> SearchContact(String motCle){
        List<Contact> result = null;
        if (!motCle.isEmpty()) {
            result = serviceContact.searchContact(motCle);

        }
        return result;
    }
    public String ChangeIsSearch() {
        isSearch = !isSearch;
        return "";
    }

}
