package p042bx;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bx.b */
/* loaded from: classes4.dex */
public abstract class AbstractC3147b {

    /* renamed from: b */
    protected long f13288b;

    /* renamed from: c */
    protected long f13289c;

    /* renamed from: d */
    Context f13290d;

    /* renamed from: a */
    protected AtomicBoolean f13287a = new AtomicBoolean(false);

    /* renamed from: e */
    int f13291e = 0;

    /* renamed from: f */
    int f13292f = 0;

    /* renamed from: g */
    private int f13293g = 0;

    /* renamed from: h */
    Handler f13294h = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    Runnable f13295i = new a();

    /* renamed from: j */
    Runnable f13296j = new b();

    /* renamed from: k */
    Runnable f13297k = new Runnable() { // from class: bx.a
        @Override // java.lang.Runnable
        public final void run() {
            AbstractC3147b.this.m15833e();
        }
    };

    /* renamed from: l */
    Runnable f13298l = new c();

    /* renamed from: bx.b$a */
    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC3147b abstractC3147b = AbstractC3147b.this;
            abstractC3147b.mo15835f(abstractC3147b.f13290d);
            if (AbstractC3147b.this.f13287a.get()) {
                Handler m15869b = AbstractC3152g.m15869b();
                AbstractC3147b abstractC3147b2 = AbstractC3147b.this;
                m15869b.postDelayed(abstractC3147b2.f13295i, abstractC3147b2.f13288b);
            }
        }
    }

    /* renamed from: bx.b$b */
    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC3147b abstractC3147b = AbstractC3147b.this;
            abstractC3147b.mo15835f(abstractC3147b.f13290d);
            AbstractC3147b abstractC3147b2 = AbstractC3147b.this;
            abstractC3147b2.mo15839j(abstractC3147b2.f13292f, abstractC3147b2.f13291e, abstractC3147b2.f13293g);
            if (AbstractC3147b.this.f13287a.get()) {
                Handler m15870c = AbstractC3152g.m15870c();
                AbstractC3147b abstractC3147b3 = AbstractC3147b.this;
                m15870c.postDelayed(abstractC3147b3.f13296j, abstractC3147b3.f13289c);
            }
        }
    }

    /* renamed from: bx.b$c */
    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC3147b.this.f13293g = 0;
            AbstractC3152g.m15869b().postDelayed(AbstractC3147b.this.f13298l, 20000L);
        }
    }

    public AbstractC3147b(long j11, long j12, Context context) {
        this.f13290d = context;
        j11 = 0 == j11 ? 300L : j11;
        if (0 == this.f13288b) {
            this.f13289c = 5000L;
        }
        this.f13289c = j12;
        this.f13288b = j11;
        AbstractC3152g.m15869b().removeCallbacks(this.f13298l);
        AbstractC3152g.m15869b().postDelayed(this.f13298l, 20000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m15833e() {
        this.f13291e = (this.f13291e + 1) % Integer.MAX_VALUE;
    }

    /* renamed from: d */
    public int m15834d() {
        return this.f13293g;
    }

    /* renamed from: f */
    abstract void mo15835f(Context context);

    /* renamed from: g */
    public void m15836g(int i11) {
        this.f13293g = i11;
    }

    /* renamed from: h */
    public void m15837h() {
        if (this.f13287a.get()) {
            return;
        }
        this.f13287a.set(true);
        AbstractC3152g.m15869b().removeCallbacks(this.f13295i);
        AbstractC3152g.m15869b().postDelayed(this.f13295i, C3150e.m15857g().m15865h());
        this.f13292f = this.f13291e;
        this.f13294h.postDelayed(this.f13297k, C3150e.m15857g().m15865h());
        AbstractC3152g.m15870c().removeCallbacks(this.f13296j);
        AbstractC3152g.m15870c().postDelayed(this.f13296j, this.f13289c);
    }

    /* renamed from: i */
    public void m15838i() {
        if (!this.f13287a.get()) {
            return;
        }
        this.f13287a.set(false);
        this.f13294h.removeCallbacks(this.f13297k);
        AbstractC3152g.m15869b().removeCallbacks(this.f13295i);
        AbstractC3152g.m15870c().removeCallbacks(this.f13296j);
    }

    /* renamed from: j */
    abstract void mo15839j(int i11, int i12, int i13);
}
