package co1105.cw2.ce150;

public abstract class Activity {
    private static int activityCounter = 0;
    protected final int activityId;
    protected double effort;
    protected int time;


    public Activity(int t) {
       // throws InvalidActivityException;
        time = t;
        activityId =++ activityCounter;
    }

    public int getId() { //getter
        return activityId;
    }

    public double getEffort() { //getter
        return effort;
    }

    public int getTime() { //getter
        return time;
    }

    public abstract String toString();

   // public abstract boolean equals(Object o);

    //public abstract int hashCode();

}


