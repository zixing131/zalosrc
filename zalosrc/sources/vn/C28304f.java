package vn;

import android.view.View;
import fn0.AbstractC19074t;

/* renamed from: vn.f */
/* loaded from: classes4.dex */
public final class C28304f {

    /* renamed from: a */
    private final View f132013a;

    /* renamed from: b */
    private boolean f132014b;

    /* renamed from: c */
    private final Runnable f132015c;

    public C28304f(View view) {
        boolean z11;
        AbstractC19074t.m100208f(view, "viewToHide");
        this.f132013a = view;
        if (view.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f132014b = z11;
        this.f132015c = new Runnable() { // from class: vn.e
            @Override // java.lang.Runnable
            public final void run() {
                C28304f.m142580c(C28304f.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m142580c(C28304f c28304f) {
        AbstractC19074t.m100208f(c28304f, "this$0");
        c28304f.f132013a.setVisibility(0);
        c28304f.f132014b = true;
    }

    /* renamed from: b */
    public final boolean m142581b() {
        return this.f132014b;
    }

    /* renamed from: d */
    public final void m142582d() {
        this.f132013a.removeCallbacks(this.f132015c);
        this.f132013a.setVisibility(8);
        this.f132014b = false;
    }

    /* renamed from: e */
    public final void m142583e(long j11) {
        this.f132013a.removeCallbacks(this.f132015c);
        this.f132014b = true;
        this.f132013a.postDelayed(this.f132015c, j11);
    }
}
