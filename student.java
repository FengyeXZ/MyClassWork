class student {
    private String name;
    private String studentid;
    private int height;
    private int weight;
    
    public student (String setName, String setStudentid, int setHeight, int setWeight) {
        name = setName;
        studentid = setStudentid;
        height = setHeight;
        weight = setWeight;
    }

    public String getName () {
        return name;
    }

    public String changeid (String newId) {
        studentid = newId;
        return studentid;
    }

    public void printInfo () {
        System.out.println("Name: " + name);
        System.out.println("Id: " + studentid);
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
    }

    public void cheakheightandweight (){
        if (250 < height + weight) {
            System.out.println("You need to take PE classes three times a week.");
        } else {
            System.out.println("You need to take PE class once a week.");
        }
    }
}
