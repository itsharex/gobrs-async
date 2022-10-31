package com.gobrs.async.test.task.sence.caseone;

import com.gobrs.async.core.TaskSupport;
import com.gobrs.async.core.anno.AsyncTask;

/**
 * @program: gobrs-async
 * @ClassName CaseOneTaskD
 * @description:
 * @author: sizegang
 * @create: 2022-10-31
 **/
@AsyncTask
public class CaseOneTaskD extends com.gobrs.async.core.task.AsyncTask {

    @Override
    public Object task(Object o, TaskSupport support) {
        System.out.println("D任务执行");
        return "DResult";
    }
}
