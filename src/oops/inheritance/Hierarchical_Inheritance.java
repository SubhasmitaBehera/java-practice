package oops.inheritance;


class Onee
{
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}

class Twoo extends Onee
{
    public void print_for()
    {
        System.out.println("for");
    }

}

class Threee extends Onee
{
    /*............*/
}


public class Hierarchical_Inheritance
{
    public static void main(String[] args)
    {
        Threee g = new Threee();
        g.print_geek();
        Twoo t = new Twoo();
        t.print_for();
        g.print_geek();
    }
}

