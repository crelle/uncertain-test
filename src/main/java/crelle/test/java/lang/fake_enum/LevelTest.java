package crelle.test.java.lang.fake_enum;

 enum Level {
    /**
     * 第一层
     */
    One(1),
    /**
     * 第二层
     */
    Two(2),
    /**
     * 第三层
     */
    Three(3),
    /**
     * 第四层
     */
    Four(4),
    /**
     * 第五层
     */
    Five(5);

    private int value;

    Level(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public static Boolean isValidateLevel(int level) {
        Level[] value = Level.values();
        boolean falg = false;
        for (Level pl : value){
            if(pl.value == level){
                falg = true;
            }
        }
        return falg;
    }
}

public class LevelTest{
     public static void main(String[] args){
         System.out.println("楼层："+Level.Three);
         System.out.println("楼层："+Level.Three.name());
         System.out.println("楼层："+Level.Three.toString());
         System.out.println("楼层："+Level.Three.value());

     }
}


