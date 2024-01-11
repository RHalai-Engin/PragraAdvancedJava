package SaturdayJan06.FunctionalInterface;

@FunctionalInterface
public interface Mobile {
    void call();

    //Public/protected/private/ default ---these are access modifiers/keywords
    default void show(){
        System.out.println("default show method");
    }

    static void test(){

    }
}

//Single abstract method -- SAM
//remember concept - an interface called a functional interface if and only if it has only single abstract method
//SPA - Single Page Application --react, angular
