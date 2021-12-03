package com.mikeekeghe.musalatask.services;

import com.mikeekeghe.musalatask.models.Drone;
import com.mikeekeghe.musalatask.models.Medication;

import java.util.ArrayList;

public class ServiceImpl implements CheckAvailableDrones, CheckLoadedMedication,
        CheckDroneBatteryLevel, LoadDrone, RegisterDrone{

    @Override
    public Double getDroneBatteryLevel() {
        return null;
    }

    @Override
    public ArrayList<Medication> medicationLoaded() {
        return null;
    }

    @Override
    public Drone loadDrone() {
        return null;
    }

    @Override
    public ArrayList<Drone> addDrone(Drone aDrone) {
        return null;
    }

    @Override
    public ArrayList<Drone> getAvailableDrones() {
        return null;
    }
}
