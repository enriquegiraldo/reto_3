package com.example.agendacontacts.service;

import com.example.agendacontacts.entity.Contact;
import com.example.agendacontacts.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    @Override
    public List<Contact> getContactsByGender(String gender) {
        return contactRepository.findByGender(gender);
    }

    @Override
    public List<Contact> getContactsByInitialLetter(String prefix) {
        return contactRepository.findByNameStartingWith(prefix);
    }
}
