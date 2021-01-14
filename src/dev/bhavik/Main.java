package dev.bhavik;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Singleton Design Pattern !!");
        SingletonEager instance = SingletonEager.getInstance();
        System.out.println(instance);
        SingletonEager instance1 = SingletonEager.getInstance();
        System.out.println(instance1);
        System.out.println("is it a same instance let me compare it -"+ (instance == instance1) );
        System.out.println("============================================================");
        SingletonLazyInitialization lazyinstance = SingletonLazyInitialization.getInstance();
        System.out.println(lazyinstance);
        SingletonLazyInitialization lazyinstance1 = SingletonLazyInitialization.getInstance();
        System.out.println(lazyinstance1);
        System.out.println("is it a same instance let me compare it -"+ (lazyinstance == lazyinstance1) );
        System.out.println("============================================================");
        SingletonThreadSafe threadSafe = SingletonThreadSafe.getInstance();
        System.out.println(threadSafe);
        SingletonThreadSafe threadSafe1 = SingletonThreadSafe.getInstance();
        System.out.println(threadSafe1);
        System.out.println("is it a same instance let me compare it -"+ (threadSafe == threadSafe1) );
        System.out.println("============================================================");
        SingletonSynchronizedBlock sycSynchronizedBlock =SingletonSynchronizedBlock.getInstance();
        System.out.println(sycSynchronizedBlock);
        SingletonSynchronizedBlock sycSynchronizedBlock1 =SingletonSynchronizedBlock.getInstance();
        System.out.println(sycSynchronizedBlock1);
        System.out.println("is it a same instance let me compare it -"+ (sycSynchronizedBlock == sycSynchronizedBlock1) );

    }
}
