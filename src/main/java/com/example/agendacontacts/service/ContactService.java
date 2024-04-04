package com.example.agendacontacts.service;

import com.example.agendacontacts.entity.Contact;

import java.util.List;

public interface ContactService {
    List<Contact> getAllContacts();
    List<Contact> getContactsByGender(String gender);
    List<Contact> getContactsByInitialLetter(String prefix);
}