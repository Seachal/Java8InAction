package lambdasinaction.chap3.test3_2;

import java.util.ArrayList;
import java.util.List;

/**  验证对于接口实现类来说，如果他的父亲（接口）没有实现它爷爷（接口）的方法，那么到他就需要实现这个方法。
 * @program: lambdasinaction
 * @description: s
 * @author: zhangxc
 * @create: 2018-09-20 16:24
 **/
public class AmartAdderImpl implements SmartAdder {

    @Override
    public int add(double a, double b) {
        return 0;
//        List<String>  sl = new ArrayList<>();
//        sl.add();
    }

    @Override
    public int add(int a, int b) {
        return 0;
    }
}
