package org.romanbielyi;

public class InstanceCounter {

    private static int count;

    public InstanceCounter(){
        count++;
    }
    public static int getCounter(){
        return count;
    }
}
