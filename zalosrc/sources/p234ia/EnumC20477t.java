package p234ia;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ia.t */
/* loaded from: classes3.dex */
public enum EnumC20477t implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler;
        handler = C20460g.m106488a().f100664a;
        handler.post(runnable);
    }
}
