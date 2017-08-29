package com.tiy;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TelematicsService {

    void report(VehicleInfo vehicleInfo) {

        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(vehicleInfo);
            System.out.println(json);
            File file = new File((vehicleInfo.getVin().toString()) + ".json");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(json);
            fileWriter.close();

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        File file = new File(".");
        for (File f: file.listFiles()) {
            if(f.getName().endsWith(".json")) {
                try {
                    Scanner sc = new Scanner(f);

                    while(sc.hasNextLine()) {
                        String i = sc.next();
                        System.out.println(i);
                    }
                    sc.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}