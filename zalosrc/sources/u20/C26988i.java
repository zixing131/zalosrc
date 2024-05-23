package u20;

import android.os.Handler;
import android.os.Looper;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: u20.i */
/* loaded from: classes5.dex */
public final class C26988i {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private InterfaceC18494a f127624a;

    /* renamed from: b */
    private InterfaceC18494a f127625b;

    /* renamed from: c */
    private Handler f127626c;

    /* renamed from: u20.i$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C26988i(InterfaceC18494a interfaceC18494a, InterfaceC18494a interfaceC18494a2) {
        this.f127624a = interfaceC18494a;
        this.f127625b = interfaceC18494a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m139097e(C26988i c26988i) {
        AbstractC19074t.m100208f(c26988i, "this$0");
        InterfaceC18494a interfaceC18494a = c26988i.f127624a;
        if (interfaceC18494a != null) {
            interfaceC18494a.mo12V4();
        }
    }

    /* renamed from: b */
    public final void m139098b() {
        Handler handler = this.f127626c;
        if (handler != null) {
            if (handler != null && handler.hasMessages(0)) {
                Handler handler2 = this.f127626c;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages(null);
                }
            } else {
                InterfaceC18494a interfaceC18494a = this.f127625b;
                if (interfaceC18494a != null) {
                    interfaceC18494a.mo12V4();
                }
            }
            this.f127626c = null;
        }
    }

    /* renamed from: c */
    public final boolean m139099c() {
        return this.f127626c != null;
    }

    /* renamed from: d */
    public final void m139100d() {
        if (this.f127626c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            handler.postDelayed(new Runnable() { // from class: u20.h
                @Override // java.lang.Runnable
                public final void run() {
                    C26988i.m139097e(C26988i.this);
                }
            }, 1000L);
            this.f127626c = handler;
        }
    }
}
