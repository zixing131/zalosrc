package u20;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import fn0.AbstractC19074t;

/* renamed from: u20.k */
/* loaded from: classes5.dex */
public abstract class AbstractC26990k extends AbstractC26992m {

    /* renamed from: r */
    private final Handler f127629r = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m139102d(AbstractC26990k abstractC26990k, View view) {
        AbstractC19074t.m100208f(abstractC26990k, "this$0");
        AbstractC19074t.m100208f(view, "$widget");
        abstractC26990k.mo52096e(view);
    }

    /* renamed from: c */
    public final void m139103c(final View view, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(view, "widget");
        AbstractC19074t.m100208f(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f127629r.removeCallbacksAndMessages(null);
                    return;
                }
                return;
            } else {
                if (this.f127629r.hasMessages(0)) {
                    this.f127629r.removeCallbacksAndMessages(null);
                    onClick(view);
                    return;
                }
                return;
            }
        }
        this.f127629r.postDelayed(new Runnable() { // from class: u20.j
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC26990k.m139102d(AbstractC26990k.this, view);
            }
        }, ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: e */
    public abstract void mo52096e(View view);
}
