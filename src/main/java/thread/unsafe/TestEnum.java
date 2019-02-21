package thread.unsafe;

/**
 * Created by dell on 2019/2/21.
 */
public enum  TestEnum {
    ASD("asd",1),
    ZXC("rty",1);
    String dec;
    int id;
    TestEnum(String dec,int id){
        this.dec = dec;
        this.id = id;
    }
}
