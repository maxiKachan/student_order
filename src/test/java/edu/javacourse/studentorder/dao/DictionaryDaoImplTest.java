package edu.javacourse.studentorder.dao;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class DictionaryDaoImplTest {

    @Test
    public void testExample1(){
        System.out.println("TEST1");
    }

    @Test
    @Ignore
    public void testExample2(){
        System.out.println("TEST2");
    }

    @Test
    public void testExample3(){
        System.out.println("TEST3");
        throw new RuntimeException("BAD RESULT");
    }
}