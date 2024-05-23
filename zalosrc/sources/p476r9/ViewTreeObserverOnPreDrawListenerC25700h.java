package p476r9;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: r9.h */
/* loaded from: classes3.dex */
public class ViewTreeObserverOnPreDrawListenerC25700h implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: p */
    private final Handler f122711p = new Handler(Looper.getMainLooper());

    /* renamed from: q */
    private final AtomicReference f122712q;

    /* renamed from: r */
    private final Runnable f122713r;

    /* renamed from: s */
    private final Runnable f122714s;

    private ViewTreeObserverOnPreDrawListenerC25700h(View view, Runnable runnable, Runnable runnable2) {
        this.f122712q = new AtomicReference(view);
        this.f122713r = runnable;
        this.f122714s = runnable2;
    }

    /* renamed from: a */
    public static void m132614a(View view, Runnable runnable, Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC25700h(view, runnable, runnable2));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        View view = (View) this.f122712q.getAndSet(null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f122711p.post(this.f122713r);
        this.f122711p.postAtFrontOfQueue(this.f122714s);
        return true;
    }
}
