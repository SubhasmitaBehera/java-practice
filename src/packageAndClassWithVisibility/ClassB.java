package packageAndClassWithVisibility;

class ClassB extends ClassA{
    public static void main(String[] args) {
        ClassA obj = new ClassA();

        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);

//        obj.show1(); // Error
    }
}
