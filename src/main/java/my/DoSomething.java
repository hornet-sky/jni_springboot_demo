package my;

// 注意本地方法所在包名、类名要和dll、so库里函数名规则相匹配
public class DoSomething {
    {
        //System.loadLibrary("haha");
    }
    public native String sayHelloTo(String name);
}
