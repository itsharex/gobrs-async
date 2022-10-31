package com.gobrs.async.test.task.sence.casetwo;

import com.gobrs.async.core.TaskSupport;
import com.gobrs.async.core.anno.AsyncTask;

/**
 * @program: gobrs-async
 * @ClassName CaseOneTaskC
 * @description:
 * @author: sizegang
 * @create: 2022-10-31
 **/
@AsyncTask
public class CaseTwoTaskC extends com.gobrs.async.core.task.AsyncTask {


    @Override
    public Object task(Object o, TaskSupport support) {
        System.out.println("C任务执行");
        return "CResult";
    }
}
