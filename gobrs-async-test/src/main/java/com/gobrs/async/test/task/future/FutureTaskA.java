package com.gobrs.async.test.task.future;

import com.gobrs.async.core.TaskSupport;
import com.gobrs.async.core.anno.Task;
import com.gobrs.async.core.task.AsyncTask;

/**
 * The type A service.
 *
 * @program: gobrs -async-starter
 * @ClassName AService
 * @description:
 * @author: sizegang
 * @create: 2022 -03-20
 */
@Task
public class FutureTaskA extends AsyncTask {

    /**
     * The .
     */
    int i = 10000;

    @Override
    public void prepare(Object o) {


    }

    @Override
    public String task(Object o, TaskSupport support) {

        try {
            System.out.println("FutureTaskA Begin");
            Thread.sleep(3000);
            for (int i1 = 0; i1 < i; i1++) {
                i1 += i1;
            }
            System.out.println("FutureTaskA Finish");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "FutureTaskA Result";
    }

    @Override
    public boolean necessary(Object o, TaskSupport support) {
        return true;
    }


    @Override
    public void onSuccess(TaskSupport support) {

    }

}
