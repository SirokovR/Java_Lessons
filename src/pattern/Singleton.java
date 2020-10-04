package pattern;

//public final class Singleton {
//    private static Singleton instance = new Singleton();
//
//    private  Singleton(){
//
//    }
//
//
//    public  static  Singleton getInstance(){
//        return  instance;
//    }
//




public final class Singleton {
    private static Singleton instance;  //во время статической инициализаии он стал  null

    private  Singleton(){

    }

    // синхронайзед нужен для безопасности многопоточности

    public synchronized static  Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return  instance;
    }










}
