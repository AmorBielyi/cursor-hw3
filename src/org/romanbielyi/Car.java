package org.romanbielyi;

public class Car {

    private boolean isEngineRunning;
    private float speed;
    private boolean isReverse;

    public void turnOnCarEngine() {
        if (!isEngineRunning) {
            isEngineRunning = true;
            System.out.println("The engine has been started and is now running");
        } else
            System.out.println("The engine is already running, no need to start it again");

    }

    public void turnOffCarEngine() {
        if (isEngineRunning) {
            isEngineRunning = false;
            speed = 0.0f;
            System.out.println("The engine has been turned off");
        }
    }

    public void setSpeed(float speed, boolean reverse) {

        if (!isEngineRunning)
            System.out.println("Can't increase speed. The engine is turned off");


        if (speed > 180)
            System.out.println("Maximum speed exceeded!!! The speed value must be <= 180");
        else if (speed <= 0)
            System.out.println("Cant't increase speed by zero or negative value. Please provide a valid value");

        this.speed = speed;
        this.isReverse = reverse;
    }

    public void stop() {
        if (isEngineRunning) {
            if (speed != 0.0f) {
                speed = 0.0f;
                System.out.println("The car is stopped");
            } else {
                System.out.println("Can't stop. The car is stopped now");
            }

        } else {
            System.out.println("Can't stop. The engine is turned off");
        }

    }

    public void showCarStatus() {
        if (isEngineRunning) {
            if (speed == 0.0f) {
                System.out.println("The car is stopped");
                return;
            }
            if (!isReverse)
                System.out.printf("The car is moving forward now with speed %.3f km/h\n", speed);
            else
                System.out.printf("The car is moving backward now with speed %.3f km/h\n", speed);

        } else
            System.out.println("The car is not started now");

    }


}
