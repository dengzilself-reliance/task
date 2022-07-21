package ArryayList;

public class Student {  //学生类
    private String Studentid; // 学生编号
    private String name;  // 学生名字
    private int age;  //年龄
    private String grade; // 班级名

    /**
     * 无参数构造器
     */
    public Student() {
    }

    /**
     * 有参数构造器 添加 学生属性
     * @param studentid 学生编号
     * @param name  名字
     * @param age 年龄
     * @param grade 班级
     */
    public Student(String studentid, String name, int age, String grade) {
        Studentid = studentid;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    /**
     *
     * @return 返回 学生ID
     */
    public String getStudentid() {
        return Studentid;
    }

    /**
     * 设置 学生ID
     * @param studentid 学生ID
     */
    public void setStudentid(String studentid) {
        Studentid = studentid;
    }

    /**
     *
     * @return 返回 学生名字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名字
     * @param name 名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return 返回年龄
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置 年龄
     * @param age 年龄
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return 返回 班级名
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 设置 班级名
     * @param grade 班级名
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }
}
