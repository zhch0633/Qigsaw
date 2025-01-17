package com.google.android.play.core.tasks;

import android.support.annotation.RestrictTo;

import static android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP;

@RestrictTo(LIBRARY_GROUP)
public class TaskWrapper<TResult> {

    private final TaskImpl<TResult> mTask = new TaskImpl<>();

    public final Task<TResult> getTask() {
        return mTask;
    }

    public final boolean setException(Exception exception) {
        return mTask.setException(exception);
    }

    public final boolean setResult(TResult result) {
        return mTask.setResult(result);
    }

}
