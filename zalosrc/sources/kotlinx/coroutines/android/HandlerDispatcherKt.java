package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import fn0.AbstractC19074t;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Dispatchers;
import pm0.AbstractC24862s;
import pm0.C24861r;

/* loaded from: classes7.dex */
public final class HandlerDispatcherKt {

    /* renamed from: a */
    public static final HandlerDispatcher f105969a;
    private static volatile Choreographer choreographer;

    static {
        Object m129218b;
        Object obj = null;
        byte b11 = 0;
        byte b12 = 0;
        try {
            C24861r.a aVar = C24861r.f119264q;
            m129218b = C24861r.m129218b(new HandlerContext(m112895c(Looper.getMainLooper(), true), b12 == true ? 1 : 0, 2, b11 == true ? 1 : 0));
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        if (!C24861r.m129223g(m129218b)) {
            obj = m129218b;
        }
        f105969a = (HandlerDispatcher) obj;
    }

    /* renamed from: c */
    public static final Handler m112895c(Looper looper, boolean z11) {
        if (z11) {
            if (Build.VERSION.SDK_INT >= 28) {
                Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
                AbstractC19074t.m100206d(invoke, "null cannot be cast to non-null type android.os.Handler");
                return (Handler) invoke;
            }
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    /* renamed from: d */
    private static final void m112896d(Choreographer choreographer2, final CancellableContinuation cancellableContinuation) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: kotlinx.coroutines.android.b
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j11) {
                HandlerDispatcherKt.m112897e(CancellableContinuation.this, j11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m112897e(CancellableContinuation cancellableContinuation, long j11) {
        cancellableContinuation.mo112542D(Dispatchers.m112681c(), Long.valueOf(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m112898f(CancellableContinuation cancellableContinuation) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            AbstractC19074t.m100205c(choreographer2);
            choreographer = choreographer2;
        }
        m112896d(choreographer2, cancellableContinuation);
    }
}
