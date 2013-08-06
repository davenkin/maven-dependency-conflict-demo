package projectC;

import projectcommon.HelloWorld;

/**
 * Created with IntelliJ IDEA.
 * User: davenkin
 * Date: 8/7/13
 * Time: 12:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class GoodByeAdapter {
    private HelloWorld helloWorld;

    public GoodByeAdapter(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public String sayGoodByeAdaptToHelloWorld() {
        return helloWorld.sayGoodBye();
    }
}
