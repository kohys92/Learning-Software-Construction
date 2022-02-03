package ca.ubc.cs.cpsc210.integerset.model;

public class ChattyIntegerSet extends HighVolumeIntegerSet{
    @Override
    public void insert(Integer num) {
        //data.add(num); not what we do here
        System.out.println("Insert " + num);
        super.insert(num);
    }
}
