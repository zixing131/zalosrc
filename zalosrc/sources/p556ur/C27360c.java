package p556ur;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p619wr.InterfaceC29195b;

/* renamed from: ur.c */
/* loaded from: classes4.dex */
public final class C27360c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f128888a;

    /* renamed from: b */
    private final InterfaceC29195b f128889b;

    /* renamed from: ur.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C27360c(int i11, InterfaceC29195b interfaceC29195b) {
        AbstractC19074t.m100208f(interfaceC29195b, "data");
        this.f128888a = i11;
        this.f128889b = interfaceC29195b;
    }

    /* renamed from: a */
    public final InterfaceC29195b m140157a() {
        return this.f128889b;
    }

    /* renamed from: b */
    public final int m140158b() {
        return this.f128888a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27360c)) {
            return false;
        }
        C27360c c27360c = (C27360c) obj;
        return this.f128888a == c27360c.f128888a && AbstractC19074t.m100204b(this.f128889b, c27360c.f128889b);
    }

    public int hashCode() {
        return (this.f128888a * 31) + this.f128889b.hashCode();
    }

    public String toString() {
        return "FeedReactionAdapterData(rowType=" + this.f128888a + ", data=" + this.f128889b + ")";
    }
}
