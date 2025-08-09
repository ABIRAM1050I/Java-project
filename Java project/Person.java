class Person {
    //This class represents a genaral person
    private String name;
    private int age;

    void setName(String name){
        this.name=name;
    }

    void setAge(int age) {
        this.age = age;
    }

    String isMinor(){
        if(age>0 && age<18){
            return "Student is a minor";
        }
        else{
            return "Student is not a minor";
        }
    }
    int getAge(){
        return age;
    }

    String getName(){
        return name;
    }
    public Person(String name, int age) {
    this.name = name;
    setAge(age);
}


    void displayBasicDetails(){
        System.out.println("Name\t\t: "+name);
        System.out.println("Age\t\t: "+age);
       
    }

    }
