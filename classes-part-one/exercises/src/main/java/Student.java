public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.
        public String getName(){
                return name;
        }
        public int getStudentId() {
                return studentId;
        }
        public int getNumberOfCredits(){
                return numberOfCredits;
        }
        public double getGpa(){
                return gpa;
        }
        protected void setName(String aName){
                this.name = aName;
        }
        protected void setStudentId(int aStudentId){
                this.studentId = aStudentId;
        }
        protected void setNumberOfCredits(int aNumberOfCredits){
                this.numberOfCredits = aNumberOfCredits;
        }
        protected void setGpa(double aGpa){
                this.gpa = aGpa;
        }
}
