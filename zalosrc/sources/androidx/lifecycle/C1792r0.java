package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.AbstractC1785o;
import fn0.AbstractC19074t;

/* renamed from: androidx.lifecycle.r0 */
/* loaded from: classes2.dex */
public class C1792r0 {

    /* renamed from: a */
    private final C1805y f7387a;

    /* renamed from: b */
    private final Handler f7388b;

    /* renamed from: c */
    private a f7389c;

    /* renamed from: androidx.lifecycle.r0$a */
    /* loaded from: classes2.dex */
    public static final class a implements Runnable {

        /* renamed from: p */
        private final C1805y f7390p;

        /* renamed from: q */
        private final AbstractC1785o.a f7391q;

        /* renamed from: r */
        private boolean f7392r;

        public a(C1805y c1805y, AbstractC1785o.a aVar) {
            AbstractC19074t.m100208f(c1805y, "registry");
            AbstractC19074t.m100208f(aVar, "event");
            this.f7390p = c1805y;
            this.f7391q = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f7392r) {
                this.f7390p.m9400i(this.f7391q);
                this.f7392r = true;
            }
        }
    }

    public C1792r0(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "provider");
        this.f7387a = new C1805y(interfaceC1801w);
        this.f7388b = new Handler();
    }

    /* renamed from: f */
    private final void m9357f(AbstractC1785o.a aVar) {
        a aVar2 = this.f7389c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f7387a, aVar);
        this.f7389c = aVar3;
        Handler handler = this.f7388b;
        AbstractC19074t.m100205c(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }

    /* renamed from: a */
    public AbstractC1785o m9358a() {
        return this.f7387a;
    }

    /* renamed from: b */
    public void m9359b() {
        m9357f(AbstractC1785o.a.ON_START);
    }

    /* renamed from: c */
    public void m9360c() {
        m9357f(AbstractC1785o.a.ON_CREATE);
    }

    /* renamed from: d */
    public void m9361d() {
        m9357f(AbstractC1785o.a.ON_STOP);
        m9357f(AbstractC1785o.a.ON_DESTROY);
    }

    /* renamed from: e */
    public void m9362e() {
        m9357f(AbstractC1785o.a.ON_START);
    }
}
