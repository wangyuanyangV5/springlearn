package springmybatis.myenum;


/**
 * Created by dell on 2019/1/17.
 */

public enum  StateEnum {

    ONLINE(1,"在线"),
    OFFICELINE(2,"离线");

    private int id;
    private String des;
    private static StateEnum[] stateEnums = StateEnum.values();

    StateEnum(int id, String des) {
        this.id = id;
        this.des = des;
    }


    public static StateEnum getById(int i){
        for (StateEnum stateEnum : stateEnums){
            if(stateEnum.id == i){
                return stateEnum;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public static StateEnum getByDes(String des){
        for(StateEnum stateEnum : stateEnums){
            if(stateEnum.des.equals(des))
                return stateEnum;
        }
        return null;
    }

}
