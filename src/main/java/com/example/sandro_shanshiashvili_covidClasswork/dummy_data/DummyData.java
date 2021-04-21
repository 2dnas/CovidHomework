package com.example.sandro_shanshiashvili_covidClasswork.dummy_data;

import com.example.sandro_shanshiashvili_covidClasswork.model.Covid;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DummyData {

   public List<Covid> getCovidList() {
       List<Covid> list = new ArrayList<Covid>();

       Covid covidSpain = new Covid("Spain", 2313, 231 ,3321);
       Covid covidGeorgia = new Covid("Georgia", 1231, 312 ,3141);
       Covid covidRussia = new Covid("Russia", 99999, 99998 ,0);
       Covid covidUS = new Covid("US", 1314, 6445 ,264346);
       Covid covidCanada = new Covid("Canada", 12314, 123415 ,5123214);
       list.add(covidSpain);
       list.add(covidGeorgia);
       list.add(covidRussia);
       list.add(covidUS);
       list.add(covidCanada);
       return list;
    }

}
