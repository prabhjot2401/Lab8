package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }
    @Test
    public void hasCityTest(){
        list=MockCityList();
        list.addCity(new City("Estevan", "SK"));
        list.addCity(new City("Red Deer", "AB"));
        boolean has_city=list.hasCity(new City("Estevan", "SK"));
        assertTrue(has_city);
    }
    @Test
    public void deleteCityTest(){
        list=MockCityList();
        list.addCity(new City("Estevan", "SK"));
        list.addCity(new City("Red Deer", "AB"));
        boolean del_city=list.deleteCity(new City("Estevan", "SK"));
        assertTrue(del_city);
    }
    @Test
    public void countCityTest(){
        list=MockCityList();
        list.addCity(new City("Estevan", "SK"));
        list.addCity(new City("Red Deer", "AB"));
        int count_city=list.countCities();
        assertEquals(count_city,2);
    }
}
