package Utils;

import java.util.Date;

public class SpendTime {
    private Date start;
    private Date end;
    public SpendTime(boolean ...flag){
        if(flag.length != 0)
            start = new Date();
    };
    public void clockUp(){
        start = new Date();
    }
    public void clockOver(){
        end = new Date();
        System.out.println(end.getTime() - start.getTime() + " ms");
    }

}
