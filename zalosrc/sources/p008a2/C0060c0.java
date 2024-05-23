package p008a2;

import androidx.lifecycle.LiveData;
import fn0.AbstractC19074t;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p008a2.C0080q;
import p351n0.C23504c;

/* renamed from: a2.c0 */
/* loaded from: classes2.dex */
public final class C0060c0 extends LiveData {

    /* renamed from: l */
    private final AbstractC0086w f220l;

    /* renamed from: m */
    private final C0078o f221m;

    /* renamed from: n */
    private final boolean f222n;

    /* renamed from: o */
    private final Callable f223o;

    /* renamed from: p */
    private final C0080q.c f224p;

    /* renamed from: q */
    private final AtomicBoolean f225q;

    /* renamed from: r */
    private final AtomicBoolean f226r;

    /* renamed from: s */
    private final AtomicBoolean f227s;

    /* renamed from: t */
    private final Runnable f228t;

    /* renamed from: u */
    private final Runnable f229u;

    /* renamed from: a2.c0$a */
    /* loaded from: classes2.dex */
    public static final class a extends C0080q.c {

        /* renamed from: b */
        final /* synthetic */ C0060c0 f230b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String[] strArr, C0060c0 c0060c0) {
            super(strArr);
            this.f230b = c0060c0;
        }

        @Override // p008a2.C0080q.c
        /* renamed from: c */
        public void mo185c(Set set) {
            AbstractC19074t.m100208f(set, "tables");
            C23504c.m123373h().m123381b(this.f230b.m183t());
        }
    }

    public C0060c0(AbstractC0086w abstractC0086w, C0078o c0078o, boolean z11, Callable callable, String[] strArr) {
        AbstractC19074t.m100208f(abstractC0086w, "database");
        AbstractC19074t.m100208f(c0078o, "container");
        AbstractC19074t.m100208f(callable, "computeFunction");
        AbstractC19074t.m100208f(strArr, "tableNames");
        this.f220l = abstractC0086w;
        this.f221m = c0078o;
        this.f222n = z11;
        this.f223o = callable;
        this.f224p = new a(strArr, this);
        this.f225q = new AtomicBoolean(true);
        this.f226r = new AtomicBoolean(false);
        this.f227s = new AtomicBoolean(false);
        this.f228t = new Runnable() { // from class: a2.a0
            @Override // java.lang.Runnable
            public final void run() {
                C0060c0.m180w(C0060c0.this);
            }
        };
        this.f229u = new Runnable() { // from class: a2.b0
            @Override // java.lang.Runnable
            public final void run() {
                C0060c0.m179v(C0060c0.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m179v(C0060c0 c0060c0) {
        AbstractC19074t.m100208f(c0060c0, "this$0");
        boolean m9217h = c0060c0.m9217h();
        if (c0060c0.f225q.compareAndSet(false, true) && m9217h) {
            c0060c0.m184u().execute(c0060c0.f228t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final void m180w(C0060c0 c0060c0) {
        AbstractC19074t.m100208f(c0060c0, "this$0");
        if (c0060c0.f227s.compareAndSet(false, true)) {
            c0060c0.f220l.m351n().m282c(c0060c0.f224p);
        }
        while (c0060c0.f226r.compareAndSet(false, true)) {
            Object obj = null;
            boolean z11 = false;
            while (c0060c0.f225q.compareAndSet(true, false)) {
                try {
                    try {
                        obj = c0060c0.f223o.call();
                        z11 = true;
                    } catch (Exception e11) {
                        throw new RuntimeException("Exception while computing database live data.", e11);
                    }
                } finally {
                    c0060c0.f226r.set(false);
                }
            }
            if (z11) {
                c0060c0.mo9221n(obj);
            }
            if (!z11 || !c0060c0.f225q.get()) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    /* renamed from: l */
    public void mo181l() {
        super.mo181l();
        C0078o c0078o = this.f221m;
        AbstractC19074t.m100206d(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        c0078o.m274b(this);
        m184u().execute(this.f228t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    /* renamed from: m */
    public void mo182m() {
        super.mo182m();
        C0078o c0078o = this.f221m;
        AbstractC19074t.m100206d(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        c0078o.m275c(this);
    }

    /* renamed from: t */
    public final Runnable m183t() {
        return this.f229u;
    }

    /* renamed from: u */
    public final Executor m184u() {
        if (this.f222n) {
            return this.f220l.m356s();
        }
        return this.f220l.m353p();
    }
}
