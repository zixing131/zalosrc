package u20;

import android.os.Handler;
import android.os.Looper;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import v00.C27417l;

/* renamed from: u20.g */
/* loaded from: classes5.dex */
public final class C26986g {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private InterfaceC18494a f127616a;

    /* renamed from: b */
    private InterfaceC18494a f127617b;

    /* renamed from: c */
    private InterfaceC18505l f127618c;

    /* renamed from: d */
    private Handler f127619d;

    /* renamed from: e */
    private final Handler f127620e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private long f127621f;

    /* renamed from: g */
    private long f127622g;

    /* renamed from: u20.g$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C26986g(InterfaceC18494a interfaceC18494a, InterfaceC18494a interfaceC18494a2, InterfaceC18505l interfaceC18505l) {
        this.f127616a = interfaceC18494a;
        this.f127617b = interfaceC18494a2;
        this.f127618c = interfaceC18505l;
    }

    /* renamed from: e */
    private final void m139087e() {
        long m130131a = this.f127622g + (C27417l.f129055a.m140382f().m130131a() - this.f127621f);
        this.f127622g = m130131a;
        InterfaceC18505l interfaceC18505l = this.f127618c;
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(Long.valueOf(m130131a));
        }
        m139091k();
    }

    /* renamed from: f */
    private final void m139088f() {
        this.f127620e.postDelayed(new Runnable() { // from class: u20.f
            @Override // java.lang.Runnable
            public final void run() {
                C26986g.m139089g(C26986g.this);
            }
        }, 6000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m139089g(C26986g c26986g) {
        AbstractC19074t.m100208f(c26986g, "this$0");
        c26986g.m139088f();
        c26986g.m139087e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m139090i(C26986g c26986g) {
        AbstractC19074t.m100208f(c26986g, "this$0");
        InterfaceC18494a interfaceC18494a = c26986g.f127616a;
        if (interfaceC18494a != null) {
            interfaceC18494a.mo12V4();
        }
        c26986g.m139091k();
        c26986g.m139088f();
    }

    /* renamed from: k */
    private final void m139091k() {
        this.f127621f = C27417l.f129055a.m140382f().m130131a();
    }

    /* renamed from: c */
    public final void m139092c() {
        Handler handler = this.f127619d;
        if (handler != null) {
            if (handler != null && handler.hasMessages(0)) {
                Handler handler2 = this.f127619d;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages(null);
                }
            } else {
                InterfaceC18494a interfaceC18494a = this.f127617b;
                if (interfaceC18494a != null) {
                    interfaceC18494a.mo12V4();
                }
            }
            this.f127619d = null;
            m139095j();
        }
    }

    /* renamed from: d */
    public final boolean m139093d() {
        return this.f127619d != null;
    }

    /* renamed from: h */
    public final void m139094h() {
        if (this.f127619d == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            handler.postDelayed(new Runnable() { // from class: u20.e
                @Override // java.lang.Runnable
                public final void run() {
                    C26986g.m139090i(C26986g.this);
                }
            }, 500L);
            this.f127619d = handler;
        }
    }

    /* renamed from: j */
    public final void m139095j() {
        this.f127622g = 0L;
        this.f127620e.removeCallbacksAndMessages(null);
    }
}
