public class Student {
    private Integer idl;
    private String age;
    private String name;

    public void Student(Integer idl,String age,String name) {
        this.idl = idl;
        this.age = age;
        this.name = name;
    }

    public void print(String name){
        System.out.println(name);
    };
    public Integer getIdl() {
        return idl;
    }

    public void setIdl(Integer idl) {
        this.idl = idl;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idl=" + idl +
                ", age='" + age + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
