package com.Daniel.es.单例模式.工厂设计模式.简单工厂;

public class PETeacher {



//    PETeacher(String  suggest){
//       Sport sport =null;
//       if (suggest.equals("力量")){
//           return new PowerSport();
//       }if (suggest.equals("综合")){
//           return new ComprehensiveSport();
//       }if (suggest.equals("对抗")){
//           return new FightSport();
//       }
//       return sport;
//    }

    public  Sport teach(String  suggest){
        Sport sport =null;
        if (suggest.equals("力量")){
            return new PowerSport();
        }if (suggest.equals("综合")){
            return new ComprehensiveSport();
        }if (suggest.equals("对抗")){
            return new FightSport();
        }
        return sport;
    }
}
