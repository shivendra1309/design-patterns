package creational.singleton;

public class StaticBlockInitialization {
    private static StaticBlockInitialization instance;

    private StaticBlockInitialization(){

    }
    //creates instance even if before it is being used similar to eager initialization -- not a good practice
    static{
        try{
            instance = new StaticBlockInitialization();
        }catch(Exception e){
            throw new RuntimeException("Exception occurred in creating singleton instance by static block initialization");
        }
    }

    public static StaticBlockInitialization getInstance(){
        return instance;
    }
}
