public class StoreData {
    private String name;
    private int rollNO;
    private float mark1;
    private float mark2;
    private float mark3;
    private float average;
    private char grade;

    StoreData(){
        this.name = null;
        this.rollNO = 0;
        this.mark1 = 0;
        this.mark2 = 0;
        this.mark3 = 0;
    }

    StoreData(String name, int rollNO, float mark1, float mark2, float mark3){
        this.name = name;
        this.rollNO = rollNO;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    String getName(){
        return this.name;
    }
    int getRollNO(){
        return this.rollNO;
    }
    float getMark1(){
        return this.mark1;
    }
    float getMark2(){
        return this.mark2;
    }
    float getMark3(){
        return this.mark3;
    }

    void setAverage(float average){
        this.average = average;
    }

    float getAverage(){
        return this.average;
    }

    void setGrade(char grade){
        this.grade = grade;
    }


    void getDetails() {
        System.out.printf("%-15s %-8s %-8s %-8s %-8s %-10s %-5s\n",
                "Name", "RollNo", "Mark1", "Mark2", "Mark3", "Average", "Grade");
        System.out.printf("%-15s %-8d %-8.2f %-8.2f %-8.2f %-10.2f %-5c\n",
                this.name, this.rollNO, this.mark1, this.mark2, this.mark3, this.average, this.grade);
    }


}
