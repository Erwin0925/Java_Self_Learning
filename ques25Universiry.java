public class ques25Universiry {
    static class Department{

        private String department;
        private int memberCount;

        public Department(String department, int memberCount){
            this.department = department;
            this.memberCount = memberCount;
        }

        public void displayInfo(){
            System.out.println("Department Name : " + department);
            System.out.println("Number of faculty member : " + memberCount);     
        }
    }
}
