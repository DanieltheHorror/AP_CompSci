

public class StepTracker {
    
    int minSteps;
    int totalSteps;
    int days;
    int activeDays;
    
    public StepTracker(int minSteps) {
        this.minSteps = minSteps;
        totalSteps = 0;
        days = 0;
        activeDays = 0;
    }
    
    public void addDailySteps(int steps) {
        days++;
        totalSteps += steps;
        if (steps >= minSteps) {
            activeDays++;
        }
    }
    
    public int activeDays() {
        return activeDays;
    }
    
    public double averageSteps() {
        if (days == 0) {
            return 0;
        }
        return (double)(steps / days);
    }
}