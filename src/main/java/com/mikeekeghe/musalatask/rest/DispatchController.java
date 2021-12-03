package com.mikeekeghe.musalatask.rest;

import com.mikeekeghe.musalatask.models.Drone;
import com.mikeekeghe.musalatask.models.Medication;
import com.mikeekeghe.musalatask.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class DispatchController {

    @Autowired
    private CheckAvailableDrones availableDrones;

    @Autowired
    private CheckDroneBatteryLevel batteryLevel;

    @Autowired
    private CheckLoadedMedication loadedMedication;

    @Autowired
    private LoadDrone loadDrone;

    @Autowired
    private RegisterDrone regDrone;

    @RequestMapping(value = "/available", method = RequestMethod.GET)
    public ArrayList<Drone> getAvailableDrones(){

        return availableDrones.getAvailableDrones();

    }



    @RequestMapping(value = "/battery", method = RequestMethod.GET)
    public Double getDroneBatteryLevel(){

        return batteryLevel.getDroneBatteryLevel();

    }


    @RequestMapping(value = "/load", method = RequestMethod.GET)
    public Drone loadDrone(){

        return loadDrone.loadDrone();

    }


    @RequestMapping(value = "/load_medic", method = RequestMethod.GET)
    public ArrayList<Medication> medicationLoaded(){

        return loadedMedication.medicationLoaded();

    }


    @RequestMapping(value = "/reg", method = RequestMethod.GET)
    public ArrayList<Drone> addDrone(Drone aDrone){

        Drone drone = null;
        return regDrone.addDrone(drone);

    }

}
