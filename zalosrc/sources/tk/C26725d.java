package tk;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: tk.d */
/* loaded from: classes3.dex */
public final class C26725d {

    /* renamed from: a */
    private Object f126751a;

    /* renamed from: b */
    private String f126752b;

    /* renamed from: c */
    private long f126753c;

    public C26725d(Object obj, String str, long j11) {
        AbstractC19074t.m100208f(str, "query");
        this.f126751a = obj;
        this.f126752b = str;
        this.f126753c = j11;
    }

    /* renamed from: a */
    public final Object m137454a() {
        return this.f126751a;
    }

    /* renamed from: b */
    public final String m137455b() {
        return this.f126752b;
    }

    /* renamed from: c */
    public final long m137456c() {
        return this.f126753c;
    }

    /* renamed from: d */
    public final void m137457d(Object obj) {
        this.f126751a = obj;
    }

    /* renamed from: e */
    public final void m137458e(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f126752b = str;
    }

    /* renamed from: f */
    public final void m137459f(long j11) {
        this.f126753c = j11;
    }

    public /* synthetic */ C26725d(Object obj, String str, long j11, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? null : obj, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? 0L : j11);
    }
}
