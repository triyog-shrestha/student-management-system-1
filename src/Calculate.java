public class Calculate {

    public void calculateAverage(StoreData s) {
        float avg = (s.getMark1() + s.getMark2() + s.getMark3()) / 3;
        s.setAverage(avg);
    }

    public void calculateGrade(StoreData s1) {
        char grade;
        if (s1.getAverage() >= 80)
            grade = 'A';
        else if (s1.getAverage() >= 60)
            grade = 'B';
        else if (s1.getAverage() >= 40)
            grade = 'C';
        else if (s1.getAverage() >= 20)
            grade = 'D';
        else
            grade = 'F';

        s1.setGrade(grade);
    }

}
