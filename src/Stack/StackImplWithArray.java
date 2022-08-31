package Stack;

import java.util.ArrayList;

public class StackImplWithArray {

    private ArrayList<String> top;


    StackImplWithArray(){
        top = new ArrayList<>();

    }

    //push
    public void push(String data){
        top.add(data);
    }
    //pop
    public String pop(){
        int length = this.top.size();
        String topData = top.get(length-1);
        top.remove(length-1);

        return topData;
    }
    //peek
    public String peek(){
        String topData = top.get( this.top.size()-1);
        return topData;
    }
    //isEmpty
    public boolean isEmpty(){
        return  this.top.size() == 0;
    }

}
