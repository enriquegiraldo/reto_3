package com.example.agendacontacts.controller;

import com.example.agendacontacts.entity.Contact;
import com.example.agendacontacts.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/agenda")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/getContacts")
    public ResponseEntity<List<Contact>> getAllContacts() {
        List<Contact> contacts = contactService.getAllContacts();
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @GetMapping("/getContactsByGender/{gender}")
    public ResponseEntity<List<Contact>> getContactsByGender(@PathVariable String gender) {
        List<Contact> contacts = contactService.getContactsByGender(gender);
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @GetMapping("/getContactsByInitLetter/{prefix}")
    public ResponseEntity<List<Contact>> getContactsByInitialLetter(@PathVariable String prefix) {
        List<Contact> contacts = contactService.getContactsByInitialLetter(prefix);
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }
}