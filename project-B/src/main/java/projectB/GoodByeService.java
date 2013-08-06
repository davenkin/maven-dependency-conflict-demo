package projectB;

import projectC.GoodByeAdapter;

/**
 * Created with IntelliJ IDEA.
 * User: davenkin
 * Date: 8/7/13
 * Time: 12:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class GoodByeService {
    private GoodByeAdapter goodByeAdapter;

    public GoodByeService(GoodByeAdapter goodByeAdapter) {
        this.goodByeAdapter = goodByeAdapter;
    }

    public String sayGoodBye() {
        return goodByeAdapter.sayGoodByeAdaptToHelloWorld();
    }
}
