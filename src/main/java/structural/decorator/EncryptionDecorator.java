package structural.decorator;

import java.util.Base64;

public class EncryptionDecorator extends DataSourceDecorator{

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encrypt(data));
    }

    @Override
    public String readData() {
        return decrypt(super.readData());
    }

    private String encrypt(String data){
        byte[] result = data.getBytes();
        for(int i = 0; i < result.length; i++){
            result[i] += (byte)1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    private String decrypt(String data){
        byte[] result = Base64.getDecoder().decode(data);
        for(int i=0; i< result.length ; i++){
            result[i] -= (byte)1;
        }
        return new String(result);
    }
}
