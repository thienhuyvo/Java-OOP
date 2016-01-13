class Student {
  private String name;
  private int age;
  private String address;
  private String id;
  
  public Student(String name, int age, String address, String id) {
    this.name = name;
    this.age = age;
    this.address = address;
    this.id = id;
  }
  
  public void show() {
    System.out.println(this.name + "\n" + this.age + "\n" + this.address + "\n" + this.id);
  }
  
  public static void main(String[] args) {
    Student huy = new Student("Huy Vo", 20, "L.A", "514*****");
    huy.show();
  }
}
