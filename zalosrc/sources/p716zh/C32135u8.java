package p716zh;

import androidx.work.AbstractC2147g0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: zh.u8 */
/* loaded from: classes3.dex */
public final class C32135u8 {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private long f148220a;

    /* renamed from: b */
    private long f148221b;

    /* renamed from: c */
    private long f148222c;

    /* renamed from: d */
    private int f148223d;

    /* renamed from: zh.u8$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m155114a(C32135u8 c32135u8, InterfaceC18494a interfaceC18494a) {
            AbstractC19074t.m100208f(interfaceC18494a, "timestamp");
            if (c32135u8 != null) {
                c32135u8.m155110e(((Number) interfaceC18494a.mo12V4()).longValue());
            }
        }

        /* renamed from: b */
        public final void m155115b(C32135u8 c32135u8, int i11) {
            if (c32135u8 != null) {
                c32135u8.m155111g(i11);
            }
        }

        /* renamed from: c */
        public final void m155116c(C32135u8 c32135u8, InterfaceC18494a interfaceC18494a) {
            AbstractC19074t.m100208f(interfaceC18494a, "timestamp");
            if (c32135u8 != null) {
                c32135u8.m155112i(((Number) interfaceC18494a.mo12V4()).longValue());
            }
        }

        /* renamed from: d */
        public final void m155117d(C32135u8 c32135u8, InterfaceC18494a interfaceC18494a) {
            AbstractC19074t.m100208f(interfaceC18494a, "timestamp");
            if (c32135u8 != null) {
                c32135u8.m155113k(((Number) interfaceC18494a.mo12V4()).longValue());
            }
        }
    }

    public C32135u8(long j11, long j12, long j13, int i11) {
        this.f148220a = j11;
        this.f148221b = j12;
        this.f148222c = j13;
        this.f148223d = i11;
    }

    /* renamed from: f */
    public static final void m155102f(C32135u8 c32135u8, InterfaceC18494a interfaceC18494a) {
        Companion.m155114a(c32135u8, interfaceC18494a);
    }

    /* renamed from: h */
    public static final void m155103h(C32135u8 c32135u8, int i11) {
        Companion.m155115b(c32135u8, i11);
    }

    /* renamed from: j */
    public static final void m155104j(C32135u8 c32135u8, InterfaceC18494a interfaceC18494a) {
        Companion.m155116c(c32135u8, interfaceC18494a);
    }

    /* renamed from: l */
    public static final void m155105l(C32135u8 c32135u8, InterfaceC18494a interfaceC18494a) {
        Companion.m155117d(c32135u8, interfaceC18494a);
    }

    /* renamed from: a */
    public final long m155106a() {
        return this.f148221b;
    }

    /* renamed from: b */
    public final int m155107b() {
        return this.f148223d;
    }

    /* renamed from: c */
    public final long m155108c() {
        return this.f148222c;
    }

    /* renamed from: d */
    public final long m155109d() {
        return this.f148220a;
    }

    /* renamed from: e */
    public final void m155110e(long j11) {
        this.f148221b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32135u8)) {
            return false;
        }
        C32135u8 c32135u8 = (C32135u8) obj;
        return this.f148220a == c32135u8.f148220a && this.f148221b == c32135u8.f148221b && this.f148222c == c32135u8.f148222c && this.f148223d == c32135u8.f148223d;
    }

    /* renamed from: g */
    public final void m155111g(int i11) {
        this.f148223d = i11;
    }

    public int hashCode() {
        return (((((AbstractC2147g0.m11521a(this.f148220a) * 31) + AbstractC2147g0.m11521a(this.f148221b)) * 31) + AbstractC2147g0.m11521a(this.f148222c)) * 31) + this.f148223d;
    }

    /* renamed from: i */
    public final void m155112i(long j11) {
        this.f148222c = j11;
    }

    /* renamed from: k */
    public final void m155113k(long j11) {
        this.f148220a = j11;
    }

    public String toString() {
        return "ResponseExecuteInfo(startTime=" + this.f148220a + ", endTime=" + this.f148221b + ", executeTime=" + this.f148222c + ", errorCode=" + this.f148223d + ")";
    }

    public /* synthetic */ C32135u8(long j11, long j12, long j13, int i11, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? 0L : j11, (i12 & 2) != 0 ? 0L : j12, (i12 & 4) == 0 ? j13 : 0L, (i12 & 8) != 0 ? 0 : i11);
    }
}
