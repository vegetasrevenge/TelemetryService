
package com.tiy;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        VehicleInfo vehicleInfo = new VehicleInfo();

        System.out.println("Enter your VIN");
        String userVIN = sc.nextLine();
        vehicleInfo.setVin(userVIN);
        System.out.println("Your VIN is " + vehicleInfo.getVin());

        System.out.println("Enter your odometer reading, in miles.");
        Double userOdometer = sc.nextDouble();
        vehicleInfo.setOdometer(userOdometer);
        System.out.println("Your odometer reading is " + vehicleInfo.getOdometer());

        System.out.println("Enter the gallons of gas consumed.");
        Double userGasConsumed = sc.nextDouble();
        vehicleInfo.setGalGasConsumed(userGasConsumed);
        System.out.println("The vehicle consumed  " + vehicleInfo.getGalGasConsumed() + " gallons of gas." );

        System.out.println("What was the mileage at your last oil change?");
        Double userLastOilOdometer = sc.nextDouble();
        vehicleInfo.setLastOilOdometer(userLastOilOdometer);
        System.out.println("The odometer read " + vehicleInfo.getLastOilOdometer() + "mi at the last oil change." );

        System.out.println("What is the engine size, in liters?");
        Double userEngineSize = sc.nextDouble();
        vehicleInfo.setEngineSize(userEngineSize);
        System.out.println("The vehicle's engine size is " + vehicleInfo.getEngineSize());

        TelematicsService telematicsService = new TelematicsService();

        telematicsService.report(vehicleInfo);






    }
}
