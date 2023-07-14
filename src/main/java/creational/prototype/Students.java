package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Students implements Cloneable {
    private List<String> stuNameList;

    public Students(){
        stuNameList = new ArrayList<>();
    }

    public Students(List<String> names){
        this.stuNameList = names;
    }

    public void loadNames(){
        stuNameList.add("Shiv");
        stuNameList.add("Ankit");
        stuNameList.add("Nidhin");
        stuNameList.add("Bhargava");
    }

    public List<String> getStuNameList() {
        return stuNameList;
    }
    public Students clone(){
        List<String> temp = new ArrayList<>();
        for(String name:this.getStuNameList()){
            temp.add(name);
        }
        return new Students(temp);
    }
}
