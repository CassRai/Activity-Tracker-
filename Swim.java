package co1105.cw2.ce150;

public class Swim extends Activity {
    public int poolSize;
    public int numLenghts;
    public int distance;

    public Swim(int psize, int num, int t) {
        super(t);
        poolSize = psize;
        numLenghts = num;
        time = t;
        distance = psize * num;
        effort = (double) (20 * distance) / t;
    }

    public int getDistance() {//getter
        return distance;
    }

    public int getPoolSize() {//getter
        return poolSize;
    }

    public int getLengths() {//getter
        return numLenghts;
    }

    @Override
    public String toString(){
        double new_time = (double) time / 60;
        return "S" + String.format("%02d", activityId) + ": effort score " + String.format("%.1f", effort) +  " (" + numLenghts + " x " + poolSize + "m " +  "in " + String.format("%.1f", new_time) + "minutes" + ")";
    }




}
