package com.example.agendacontacts.repository;

import com.example.agendacontacts.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    List<Contact> findByGender(String gender);
    List<Contact> findByNameStartingWith(String prefix);
}

