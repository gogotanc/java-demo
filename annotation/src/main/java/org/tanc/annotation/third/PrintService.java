package org.tanc.annotation.third;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 服务实现类
 * Created by tanc on 2017/4/15.
 */
@Scope("prototype")
@Component
public class PrintService implements IService {
    @Override
    public void show() {
        System.out.println(this.hashCode());
    }
}
