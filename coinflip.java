
public class coinflip

{
    public void toss()
    {
        double rand = Math.random();

        if(rand <= 0.5)
        {
            System.out.println("Heads");
        }
        else
        {
            System.out.println("Tails");
        }
    }
}
