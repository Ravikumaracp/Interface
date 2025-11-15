//Interface
/*interface in java is a blueprint of a class or part of a class
when class having a only abstract methods then that time we will creats interface
by defalut all methods in interface are public abstract, if mention also no problem
once if you  creates concrete class you must implement abstract method, if you fail by default concrete class will be abstract
we can create variables in interface but the condition is everytype variable is final and static by default.
that means we need to defines the value to that variable and we can't mofify the variable.
if we implenets we will get only methods not a variables from parent class

Reason for we can't create a non static variable in interface is we are creating object or creating space inmemory for child class not for parent class if the memory is not there then how we can declare non static variable.
 */

interface A
{
    int age=23;
    void run();
    void config();

}

class B implements A{
    @Override
    public void run() {
        System.out.println("run...");
    }

    @Override
    public void config() {
        System.out.println("config..");
    }
}
class Main{
    public static void main(String[] args){

        A odj=new B();
        odj.run();
        odj.config();
        System.out.println(A.age);
    }
}