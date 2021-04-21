package com.example.sandro_shanshiashvili_covidClasswork.services;

import com.example.sandro_shanshiashvili_covidClasswork.dummy_data.DummyData;
import com.example.sandro_shanshiashvili_covidClasswork.model.Covid;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class CovidServices {
    List<Covid> covidList = new DummyData().getCovidList();

    @WebMethod
    public List<Covid> getStatistic() {
        return covidList;
    }

    @WebMethod
    public Covid countryStatistic(String country) {

        for (Covid covid : covidList) {
            if (covid.getCountry().equals(country)) {
                return covid;
            }
        }
        return null;
    }


    @WebMethod
    public int totalConfirmed() {
        int totalNumber = 0;
        for (Covid covid : covidList) {
            totalNumber += covid.getConfirmed();
        }
        return totalNumber;
    }

    @WebMethod
    public int totalDeathsGet() {
        int totalNumber = 0;
        for (Covid covid : covidList) {
            totalNumber += covid.getDeaths();
        }
        return totalNumber;
    }

    @WebMethod
    public int TotalRecoveredGet() {
        int totalNumber = 0;
        for (Covid covid : covidList) {
            totalNumber += covid.getRecovered();
        }
        return totalNumber;
    }
}



