public class Monkey {

    private String color;
    private String sex;
    public Monkey(String color,String sex) {
        this.color = color;
        this.sex = sex;
    }
    public Monkey(String color) {
        this.color = color;
        this.sex = "公";
    }
    public Monkey(){}
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public int add(int p1,int p2,int p3) {
        return p1+p2+p3;
    }
    public int add(int p1,int p2) {
        return p1+p2;
    }
}

public class Zoo {
    public static void main(String[] args) {
        Monkey g = new Monkey("黑");
        Monkey l = new Monkey("红","母");
        int p1 = g.add(1, 2);
        int p2 = l.add(1, 2, 3);
        System.out.println(g.getSex()+":"+p1);
        System.out.println(l.getSex()+":"+p2);
    }

}