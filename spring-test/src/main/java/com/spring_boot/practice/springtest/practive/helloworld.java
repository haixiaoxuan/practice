package com.spring_boot.practice.springtest.practive;

import com.spring_boot.practice.springtest.bean.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {


    @RequestMapping(value = "/hello")
    public String sayHelloWorld(){

        return "hello world !!";
    }

    @RequestMapping(value = "/person")
    public Person sayPerson(){
        Person person = new Person();
        person.setAge(21);
        person.setName("效玄");
        return(person);
    }



}
