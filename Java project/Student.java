public class Student extends Person{
    private double grade1;
    private double grade2;
    private double grade3;   

public void setGrade1(double grade1){
    if(grade1>=0 && grade1<=100){
        this.grade1=grade1;
    }else{
        System.out.println("Invalied Grade");
    }}

    public double getGrade1(){
        return grade1;
    }

public void setGrade2(double grade2){
    if(grade2>=0 && grade2<=100){
        this.grade2=grade2;
    }else{
        System.out.println("Invalied Grade");
    }}

    public double getGrade2(){
        return grade2;
    }

    public void setGrade3(double grade3){
    if(grade3>=0 && grade3<=100){
        this.grade3=grade3;
    }else{
        System.out.println("Invalied Grade");
    }}

    public double getGrade3(){
        return grade3;
    }

// represnts a student
public Student(String name, int age, double grade1, double grade2, double grade3){
super(name, age);
setGrade1(grade1);
setGrade2(grade2);
setGrade3(grade3);

}

public double calculateAverage(){
    return(grade1 + grade2 + grade3)/3.0;
}

public double getHighestGrade(){
    double highest=grade1;

    if(grade2>highest){
        highest=grade2;
    }

    if(grade3> highest){
        highest=grade3;
    }
    return highest;
}
public String hasPassed(){
    if(calculateAverage() >=50){
        return "Passed";
    }
    else{
        return "Failed";
    }
    
}

public void displayStudentDetails(){
    displayBasicDetails();
    System.out.println("Grades\t\t:"+grade1+", "+grade2+", "+grade3);
    System.out.println("Average\t\t:"+calculateAverage());
    System.out.println("Highest Grade\t:"+getHighestGrade());
    System.out.println("Status\t\t:"+hasPassed());
    System.out.println("Note\t\t:"+isMinor());

}
}



