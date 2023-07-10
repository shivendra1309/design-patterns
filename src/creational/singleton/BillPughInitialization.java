package creational.singleton;

public class BillPughInitialization {
    private BillPughInitialization(){

    }

    private static class SingletonHelper{
        private static final BillPughInitialization INSTANCE =  new BillPughInitialization();
    }

    public static BillPughInitialization getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
//since before java 5 some threads might be hidden hence this was used inplace of doublecheckedlocking