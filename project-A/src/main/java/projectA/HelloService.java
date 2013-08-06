package projectA;

import projectcommon.HelloWorld;

/**
 * Created with IntelliJ IDEA.
 * User: davenkin
 * Date: 8/7/13
 * Time: 12:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class HelloService {
    private HelloWorld helloWorld;

    public HelloService(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public String sayHello() {
        return helloWorld.sayHello();
    }
}
