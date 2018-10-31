package com.spring_boot.practice.springtest;

import com.spring_boot.practice.springtest.bean.Cat;
import com.spring_boot.practice.springtest.bean.Dog;
import com.spring_boot.practice.springtest.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringTestApplicationTests {

//	@Autowired
////	Person person;
////	@Autowired
////	Dog dog;
	@Autowired
	Cat cat;
	@Test
	public void contextLoads() {
//		System.out.println(person.getName()+person.getAge());
//		System.out.println(dog.getName()+dog.getAge());

		System.out.println(cat.getName()+cat.getAge());

	}

}
