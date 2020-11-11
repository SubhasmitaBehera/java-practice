package packageAndClassWithVisibility;



    public class ClassA {
        private int a;
        protected int b;
        public int c;
        int d;

        private void show1() {
            System.out.println("private Method..");
        }

        protected void show2() {
            System.out.println("protected Method..");
        }

        public void show3() {
//        show1();
            System.out.println("Public Method..");
        }

        void show4() {
            System.out.println("default Method..");
        }

        public static void main(String[] args) {
            ClassA obj = new ClassA();

            System.out.println(obj.a);
            System.out.println(obj.b);
            System.out.println(obj.c);
            System.out.println(obj.d);

            obj.show1();
            obj.show2();
            obj.show3();
            obj.show4();
        }


        class ClassC {
            ClassA obj = new ClassA();
//        obj.show1();

        }
    }


