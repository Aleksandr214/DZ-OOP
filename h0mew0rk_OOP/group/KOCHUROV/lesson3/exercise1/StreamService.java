package group.KOCHUROV.lesson3.exercise1;

import java.util.List;

public class StreamService {
    private List<Stream> listStreams;

    public StreamService(List<Stream> listStreams) {
        this.listStreams = listStreams;
    }

    public void sortStudentsStreamBySize(){
        listStreams.sort(new StreamComparator());
    }
    
}
