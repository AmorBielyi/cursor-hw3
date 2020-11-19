package org.romanbielyi;

public class Car {

    private boolean isEngineRunning;
    private float speed;
    private String model;

    public Car(String model){
        this.model = model;
    }

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

    public void increaseSpeed(float v) {

        if (!isEngineRunning)
            System.out.println("Can't increase speed. The engine is turned off");

        if (v > 180)
            System.out.println("The speed value must be <= 180");
        else if (v <= 0)
            System.out.println("Cant't increase speed by zero or negative value. Please provide a valid value");

        this.speed += v;

        if (speed > 180) {
            System.out.println("Maximum speed exceeded!");
            speed = 180;
        }

    }

    public void decreaseSpeed(float v){
        if (!isEngineRunning)
            System.out.println("Can't decrease speed. The engine is turned off");
        if (v > 180)
            System.out.println("Maximum speed exceeded!! The speed value must be <= 180");
        else if (v <= 0)
            System.out.println("Can't decrease speed by zero or negative value. Please provide a valid value");
        if (speed != 0.0f )
            this.speed -= v;
        if (speed < 0){
            speed = 0.0f;
        }
    }

    public void stop() {
        if (isEngineRunning) {
            if (speed != 0.0f) {
                speed = 0.0f;
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
                System.out.printf("%s is stopped\n", model);
                return;
            }
            System.out.printf("The %s is moving now with speed %.3f km/h\n", model, speed);

        } else
            System.out.printf("The %s is not started now\n", model);

    }


}
