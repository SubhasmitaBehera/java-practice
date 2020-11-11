package packageAndClassWithVisibility2;

import packageAndClassWithVisibility.ClassA;

class ClassE{  // It a example that we can Only access the "Public Members or fields" of "other package"
    public static void main(String[] args) {
        ClassA obj = new ClassA();
        obj.show3();
    }
}

class ClassD extends ClassA {
    public static void main(String[] args) {
        ClassD obj = new ClassD();  // Here we have to create the Object of the extended class i.e ClassD
        obj.show2();                // Can access Public and Protected Methods and Fields
    }
}
