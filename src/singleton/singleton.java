package singleton;

public class singleton {

    static singleton instance;

    private singleton(){

    }

    public static singleton getInstance(){
        if (instance == null){
            return new singleton();
        }else{
            return instance;
        }
    }


}
