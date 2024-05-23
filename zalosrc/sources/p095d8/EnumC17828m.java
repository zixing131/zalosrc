package p095d8;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: d8.m */
/* loaded from: classes.dex */
public enum EnumC17828m implements Executor {
    INSTANCE;


    /* renamed from: q */
    private static final Handler f90089q = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f90089q.post(runnable);
    }
}
