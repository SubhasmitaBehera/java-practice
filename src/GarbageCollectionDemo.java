public class GarbageCollectionDemo {

    {
        System.out.println("Statement inside non-static block...");
    }
    protected void finalize(){
        System.out.println("Garbage collection done...");
    }

    public static void main(String[] args) {
        //finalize() will only clear the objects thart are unreferenced. Here the automatic clean-up will not be done
        GarbageCollectionDemo o1 = new GarbageCollectionDemo();
        o1 = null;
        GarbageCollectionDemo obj = new GarbageCollectionDemo();
        System.out.println(obj.hashCode());
        GarbageCollectionDemo o2 = new GarbageCollectionDemo();
        GarbageCollectionDemo o3 = new GarbageCollectionDemo();
        o2 = o3;

        new GarbageCollectionDemo(); //anonymous object

//        finalize() - under Object Class
//        gc() - under Systerm and Runtime classes
        System.gc();
    }
}
