package demo;

public class GettersClass {

    public static void main(String[] args) {

        GettersClass obj = new GettersClass();

       obj.setId(2);
        obj.setName("johnet");

        System.out.println("ID : " + obj.getId());
        System.out.println("NAME : " + obj.getName());


    }

    private int id = 1;
    private String name = "john";



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


}
