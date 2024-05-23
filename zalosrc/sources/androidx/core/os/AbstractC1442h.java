package androidx.core.os;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.core.os.h */
/* loaded from: classes.dex */
public abstract class AbstractC1442h {

    /* renamed from: androidx.core.os.h$a */
    /* loaded from: classes.dex */
    private static class a {
        /* renamed from: a */
        public static Handler m7350a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: a */
    public static Handler m7349a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m7350a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }
}
