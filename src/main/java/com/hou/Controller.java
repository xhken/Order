package com.hou;

import com.hou.service.LongTimeAsyncCallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

/**
 * Created by Ken on 2018/9/26.
 */
@RestController
public class Controller {


    @Autowired
    LongTimeAsyncCallService
    longTimeAsyncCallService;

    private Random random = new Random();

    @RequestMapping("/hi")
    public DeferredResult<String>  sayHello() {
        DeferredResult<String> deferredResult = new DeferredResult<>();
        System.out.println("开始：thread id is : " + Thread.currentThread().getId());
        longTimeAsyncCallService.makeRemoteCallAndUnknownWhenFinish((Object object) -> {
            System.out.println("结束 thread id is : " + Thread.currentThread().getId());
            deferredResult.setResult("result--" + random.nextInt());
        });
        return deferredResult;
    }
}
