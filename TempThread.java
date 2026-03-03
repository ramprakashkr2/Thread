public class TempThread extends Thread{
    int id;
    int c;
    public TempThread(int id,int c)
    {
        this.id=id;
        this.c=c;
    }
    public void run()
    {
        invoke();
    }
    public void invoke()
    {
        for(int i=1;i<=c;i++)
        {
            System.out.println("id: "+id+" count: "+i);
        }
    }
}
