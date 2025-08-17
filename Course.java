 class Course {
    //static variable
     static int maxCapacity = 100;

     //instance variable
     String courseName;
     int enrollments;

     String[] enrolledStudents;

     //constructor
     Course(String courseName) {
         this.courseName = courseName;
         this.enrollments = 0;
         this.enrolledStudents = new String[maxCapacity];
     }

     //static method
     static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
     }

     //instance method
     void enrollStudent(String studentName){
        enrolledStudents[enrollments] = studentName;
        enrollments++;

     }
     void unenrollStudent(String studentName){
         System.out.println("Student removed");
         enrollments--;
     }

     }
