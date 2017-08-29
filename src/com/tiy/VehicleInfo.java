package com.tiy;

public class VehicleInfo {
    private String vin;
    private double odometer;
    private double galGasConsumed;
    private double lastOilOdometer;
    private double engineSize;

    public VehicleInfo() {
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public double getOdometer() {
        return odometer;
    }

    public void setOdometer(double odometer) {
        this.odometer = odometer;
    }

    public double getGalGasConsumed() {
        return galGasConsumed;
    }

    public void setGalGasConsumed(double galGasConsumed) {
        this.galGasConsumed = galGasConsumed;
    }

    public double getLastOilOdometer() {
        return lastOilOdometer;
    }

    public void setLastOilOdometer(double lastOilOdometer) {
        this.lastOilOdometer = lastOilOdometer;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }
}
