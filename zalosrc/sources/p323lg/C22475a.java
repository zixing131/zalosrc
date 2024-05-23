package p323lg;

import ag0.AbstractRunnableC0823i0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p391og.AbstractC24249a;

/* renamed from: lg.a */
/* loaded from: classes3.dex */
public final class C22475a extends AbstractRunnableC0823i0 {
    public static final a Companion = new a(null);

    /* renamed from: q */
    private final long f109915q;

    /* renamed from: r */
    private int f109916r;

    /* renamed from: lg.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C22475a m116220a(Runnable runnable, InterfaceC18494a interfaceC18494a) {
            AbstractC19074t.m100208f(runnable, "targetTask");
            AbstractC19074t.m100208f(interfaceC18494a, "processBlock");
            C22475a c22475a = new C22475a(interfaceC18494a);
            if (runnable instanceof AbstractC24249a) {
                c22475a.m116219c(((AbstractC24249a) runnable).m126587d());
            }
            return c22475a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22475a(InterfaceC18494a interfaceC18494a) {
        super(interfaceC18494a);
        AbstractC19074t.m100208f(interfaceC18494a, "processBlock");
        this.f109915q = System.currentTimeMillis();
        this.f109916r = 1;
    }

    /* renamed from: a */
    public final long m116217a() {
        return this.f109915q;
    }

    /* renamed from: b */
    public final int m116218b() {
        return this.f109916r;
    }

    /* renamed from: c */
    public final void m116219c(int i11) {
        this.f109916r = i11;
    }
}
