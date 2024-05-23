package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: androidx.core.view.j0 */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnPreDrawListenerC1563j0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: p */
    private final View f6498p;

    /* renamed from: q */
    private ViewTreeObserver f6499q;

    /* renamed from: r */
    private final Runnable f6500r;

    private ViewTreeObserverOnPreDrawListenerC1563j0(View view, Runnable runnable) {
        this.f6498p = view;
        this.f6499q = view.getViewTreeObserver();
        this.f6500r = runnable;
    }

    /* renamed from: a */
    public static ViewTreeObserverOnPreDrawListenerC1563j0 m7780a(View view, Runnable runnable) {
        if (view != null) {
            if (runnable != null) {
                ViewTreeObserverOnPreDrawListenerC1563j0 viewTreeObserverOnPreDrawListenerC1563j0 = new ViewTreeObserverOnPreDrawListenerC1563j0(view, runnable);
                view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1563j0);
                view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC1563j0);
                return viewTreeObserverOnPreDrawListenerC1563j0;
            }
            throw new NullPointerException("runnable == null");
        }
        throw new NullPointerException("view == null");
    }

    /* renamed from: b */
    public void m7781b() {
        if (this.f6499q.isAlive()) {
            this.f6499q.removeOnPreDrawListener(this);
        } else {
            this.f6498p.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f6498p.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m7781b();
        this.f6500r.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f6499q = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m7781b();
    }
}
