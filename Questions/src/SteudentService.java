public class SteudentService implements Interface1{
    @Override
    public void getStudentById(int id) {
        System.out.println("get student by id");

    }

    @Override
    public void getAllStudent() {
        System.out.println("get all student");

    }

    @Override
    public void getStudentMarksById(int id) {
        System.out.println("get student by marksbyid");

    }

    public static void main(String[] args) {

        Interface1 i=null;

    }
}
