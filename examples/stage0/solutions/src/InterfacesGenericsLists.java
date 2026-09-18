/*
 * Copyright 2026 FRCSoftware
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

public interface Sensor {

    public String getSensorType();

}

void main() {

    // Create a ColorSensor class that implements the Sensor interface given at the top of the file.
    // Next, inside of the ColorSensor class, implement the getSensorType() function so it returns the string "Color Sensor".
    // Then, outside the ColorSensor class, create a sensor variable of type Sensor and 
    // give it the value of an instance of the ColorSensor class.
    // Finally print out the value of "I am a: " + sensor.getSensorType()

    class ColorSensor implements Sensor {
        @Override 
        public String getSensorType() {
            return "Color Sensor";
        }
    }

    Sensor sensor = new ColorSensor();
    System.out.println("I am a: " + sensor.getSensorType());


    



}