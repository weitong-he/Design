package singleton;
/*
一、特点：
1、单例类只能有一个实例。
2、单例类必须自己创建自己的唯一实例。
3、单例类必须给所有其他对象提供这一实例。
单例模式确保某个类只有一个实例，而且自行实例化并向整个系统提供这个实例。
* */
public class LazySingleton {
    private LazySingleton(){

    }
    private static LazySingleton ls=null;
    public static LazySingleton getInstance(){
        if(ls == null){
            ls = new LazySingleton();
        }
        return ls;
    }
    public void showmessage(){
        System.out.println("hello");
    }
}

