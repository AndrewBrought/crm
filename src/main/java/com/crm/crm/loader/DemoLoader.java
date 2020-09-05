package com.crm.crm.loader;

import com.crm.crm.model.Contact;
import com.crm.crm.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoLoader implements CommandLineRunner {

   private final ContactRepository contactDao;

   @Autowired
   public DemoLoader(ContactRepository contactDao){
       this.contactDao = contactDao;
   }

    @Override
    public void run(String... args) throws Exception {
        this.contactDao.save(new Contact("Wolfie", "Zart", "wcat@gmail.com"));
    }
}
