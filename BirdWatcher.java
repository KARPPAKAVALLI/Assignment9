
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getLastWeek() method");
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getToday() method");
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.incrementTodaysCount() method");
        birdsPerDay[birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.hasDayWithoutBirds() method");
        for(int i:birdsPerDay){
            if(i==0)
                return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getCountForFirstDays() method");
        int count=0;
        if(numberOfDays>birdsPerDay.length)
            numberOfDays=birdsPerDay.length;
        for(int i=0;i<numberOfDays;i++){
            count+=birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getBusyDays() method");
        int count=0;
        for(int i:birdsPerDay){
            if(i>=5)
                count++;
        }
        return count;
    }
}
