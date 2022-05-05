package co1105.cw2.ce150;

public class Run extends Activity{
    public int distance;

    public Run(int d, int t) {
        super(t);
        distance = d;
        time = t;
        effort = (double) (4 * d) / t;
    }

    public int getDistance() {//getter
        return distance;
}


    @Override
    public String toString(){
        double new_distance = (double) distance / 1000;
        double new_time = (double) time / 60;
        return "R" + String.format("%02d", activityId) + ": effort score " + String.format("%.1f", effort)  +  " (" + String.format("%.1f", new_distance) + " km in " + String.format("%.1f", new_time) + "minutes" + ")";
    }

}


