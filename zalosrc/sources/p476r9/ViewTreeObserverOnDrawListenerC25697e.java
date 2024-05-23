package p476r9;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: r9.e */
/* loaded from: classes3.dex */
public class ViewTreeObserverOnDrawListenerC25697e implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a */
    private final Handler f122704a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final AtomicReference f122705b;

    /* renamed from: c */
    private final Runnable f122706c;

    /* renamed from: r9.e$a */
    /* loaded from: classes3.dex */
    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnDrawListener(ViewTreeObserverOnDrawListenerC25697e.this);
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    private ViewTreeObserverOnDrawListenerC25697e(View view, Runnable runnable) {
        this.f122705b = new AtomicReference(view);
        this.f122706c = runnable;
    }

    /* renamed from: b */
    private static boolean m132600b(View view) {
        if (view.getViewTreeObserver().isAlive() && m132601c(view)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m132601c(View view) {
        return view.isAttachedToWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m132602d(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    /* renamed from: e */
    public static void m132603e(View view, Runnable runnable) {
        ViewTreeObserverOnDrawListenerC25697e viewTreeObserverOnDrawListenerC25697e = new ViewTreeObserverOnDrawListenerC25697e(view, runnable);
        if (Build.VERSION.SDK_INT < 26 && !m132600b(view)) {
            view.addOnAttachStateChangeListener(new a());
        } else {
            view.getViewTreeObserver().addOnDrawListener(viewTreeObserverOnDrawListenerC25697e);
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View view = (View) this.f122705b.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: r9.d
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ViewTreeObserverOnDrawListenerC25697e.this.m132602d(view);
            }
        });
        this.f122704a.postAtFrontOfQueue(this.f122706c);
    }
}
