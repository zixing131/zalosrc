package com.zing.zalo.zinstant.view;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.lang.ref.WeakReference;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: com.zing.zalo.zinstant.view.d */
/* loaded from: classes7.dex */
public abstract class AbstractC17227d {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final WeakReference f87874a;

    /* renamed from: b */
    private final int[] f87875b;

    /* renamed from: c */
    private final int[] f87876c;

    /* renamed from: d */
    private boolean f87877d;

    /* renamed from: e */
    private boolean f87878e;

    /* renamed from: f */
    private final InterfaceC24854k f87879f;

    /* renamed from: g */
    private final Runnable f87880g;

    /* renamed from: h */
    private final ViewTreeObserver.OnScrollChangedListener f87881h;

    /* renamed from: com.zing.zalo.zinstant.view.d$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.zinstant.view.d$b */
    /* loaded from: classes7.dex */
    public static final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View m92049j = AbstractC17227d.this.m92049j();
            if (m92049j != null) {
                AbstractC17227d abstractC17227d = AbstractC17227d.this;
                m92049j.getLocationOnScreen(abstractC17227d.f87875b);
                if (abstractC17227d.f87876c[0] != abstractC17227d.f87875b[0] || abstractC17227d.f87876c[1] != abstractC17227d.f87875b[1]) {
                    abstractC17227d.f87878e = true;
                    abstractC17227d.f87876c[0] = abstractC17227d.f87875b[0];
                    abstractC17227d.f87876c[1] = abstractC17227d.f87875b[1];
                    abstractC17227d.m92048i().postDelayed(this, 100L);
                    return;
                }
                if (abstractC17227d.f87878e) {
                    abstractC17227d.m92048i().removeCallbacks(this);
                    abstractC17227d.mo91522l(true);
                }
                abstractC17227d.f87877d = false;
                abstractC17227d.f87878e = false;
            }
        }
    }

    /* renamed from: com.zing.zalo.zinstant.view.d$c */
    /* loaded from: classes7.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f87883q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler mo12V4() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public AbstractC17227d(View view) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(view, "view");
        this.f87875b = new int[2];
        this.f87876c = new int[2];
        m129210a = AbstractC24856m.m129210a(c.f87883q);
        this.f87879f = m129210a;
        this.f87880g = new b();
        this.f87881h = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.zing.zalo.zinstant.view.c
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AbstractC17227d.m92050k(AbstractC17227d.this);
            }
        };
        this.f87874a = new WeakReference(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final Handler m92048i() {
        return (Handler) this.f87879f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final View m92049j() {
        return (View) this.f87874a.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m92050k(AbstractC17227d abstractC17227d) {
        AbstractC19074t.m100208f(abstractC17227d, "this$0");
        View m92049j = abstractC17227d.m92049j();
        if (m92049j != null && !abstractC17227d.f87877d && m92049j.isShown()) {
            m92049j.getLocationOnScreen(abstractC17227d.f87875b);
            int[] iArr = abstractC17227d.f87876c;
            int i11 = iArr[0];
            int[] iArr2 = abstractC17227d.f87875b;
            if (i11 != iArr2[0] || iArr[1] != iArr2[1]) {
                abstractC17227d.f87877d = true;
                abstractC17227d.f87878e = false;
                abstractC17227d.mo91522l(false);
                abstractC17227d.m92048i().postDelayed(abstractC17227d.f87880g, 100L);
            }
        }
    }

    /* renamed from: l */
    protected abstract void mo91522l(boolean z11);

    /* renamed from: m */
    public final void m92051m() {
        ViewTreeObserver viewTreeObserver;
        try {
            View m92049j = m92049j();
            if (m92049j != null) {
                viewTreeObserver = m92049j.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnScrollChangedListener(this.f87881h);
                viewTreeObserver.addOnScrollChangedListener(this.f87881h);
            }
        } catch (Throwable th2) {
            AbstractC20110a.f98889a.mo104552e(th2);
        }
    }

    /* renamed from: n */
    public final void m92052n() {
        ViewTreeObserver viewTreeObserver;
        try {
            this.f87877d = false;
            this.f87878e = false;
            int[] iArr = this.f87876c;
            iArr[0] = 0;
            iArr[1] = 0;
            int[] iArr2 = this.f87875b;
            iArr2[0] = 0;
            iArr2[1] = 0;
            View m92049j = m92049j();
            if (m92049j != null) {
                viewTreeObserver = m92049j.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnScrollChangedListener(this.f87881h);
            }
            m92048i().removeCallbacksAndMessages(null);
        } catch (Throwable th2) {
            AbstractC20110a.f98889a.mo104552e(th2);
        }
    }
}
