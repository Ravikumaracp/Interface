interface Computer
{
    abstract public void code();
}

class Laptop implements Computer
{
    public void code(){
        System.out.println("code, Run, Compile..");
    }
}

class Desktop implements Computer
{
    public void code(){
        System.out.println("code, Run, Compile : faster..");
    }
}

class Devolper
{
    public void onDev(Computer desk){
        desk.code();
    }
}

public class Ex2 {
    public static void main(String[] args){
        Computer lap=new Laptop();
        Computer desk=new Desktop();
        Devolper ravi=new Devolper();
        ravi.onDev(desk);
    }

}
