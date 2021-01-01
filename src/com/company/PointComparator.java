package com.company;

import java.util.Comparator;

public class PointComparator  implements Comparator<SportsClub> {

    @Override
    public int compare(SportsClub o1, SportsClub o2) {

        int point = o1.getCurrent_points() - (o2.getCurrent_points());
        if (point != point) {
            return o1.getCurrent_points() - (o2.getCurrent_points());
        }
        else {
            int rg = o1.getRecieved_goals() - (o2.getRecieved_goals());
            if (rg != rg) {
                return o1.getRecieved_goals() - o2.getRecieved_goals();
            }
            else {
                int sg = (o1.getScored_goals()-o2.getScored_goals());
                if (sg != sg){
                    return o2.getScored_goals()-o1.getScored_goals();
                }
            }

    /*            int s = (o1.getVarious_statictics()-o2.getVarious_statictics());
                if (s != s){
                    return o1.getVarious_statictics()-o2.getVarious_statictics();
                }*/


        return o1.getCurrent_points() - (o2.getCurrent_points());

    }
    }
}
/*
        int point = o1.getCurrent_points() - (o2.getCurrent_points());
        if (point != point) {
            return o1.getCurrent_points() - (o2.getCurrent_points());
        }
        else if (point == point) {
            return (o1.getRecieved_goals() - o2.getRecieved_goals());
        }
        int rg = o1.getRecieved_goals() - (o2.getRecieved_goals());
        if (rg != rg) {
            return (o1.getRecieved_goals() - o2.getRecieved_goals());
        }
            return (o1.getScored_goals()-o2.getScored_goals());*/
        // return o1.getCurrent_points() - (o2.getCurrent_points());





/*        int rg = o1.getRecieved_goals()-o1.getScored_goals()-(o2.getRecieved_goals()-o2.getScored_goals());
        if (rg == rg) {
           // return (o1.getScored_goals()- o2.getScored_goals();*/

/*
        return ((o1.getCurrent_points() - o2.getCurrent_points())
                - (o1.getRecieved_goals() - o2.getRecieved_goals()));*/
             //   - (o1.getScored_goals() - o2.getScored_goals());


        // return o1.getCurrent_points() - o2.getCurrent_points();
/*        int cmp0 = a.getAttributeX().compareTo(b.getAttributeX());
        if (cmp0 != 0) {
            return cmp0;
        }
        int cmp1 = a.getSomething().getSubValue().compareTo(b.getSomething().getSubValue());
        if (cmp1 != 0) {
            return cmp1;
        }*/

        // return o1.getRecieved_goals() - o2.getRecieved_goals();

        //return o1.getClub_name().compareTo(o2.getClub_name());

        //   }


