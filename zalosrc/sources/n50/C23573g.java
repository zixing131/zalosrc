package n50;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: n50.g */
/* loaded from: classes5.dex */
public final class C23573g {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f114394a;

    /* renamed from: b */
    private final int f114395b;

    /* renamed from: n50.g$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C23573g(String str, int i11) {
        AbstractC19074t.m100208f(str, "content");
        this.f114394a = str;
        this.f114395b = i11;
    }

    /* renamed from: b */
    public static /* synthetic */ C23573g m123673b(C23573g c23573g, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = c23573g.f114394a;
        }
        if ((i12 & 2) != 0) {
            i11 = c23573g.f114395b;
        }
        return c23573g.m123674a(str, i11);
    }

    /* renamed from: a */
    public final C23573g m123674a(String str, int i11) {
        AbstractC19074t.m100208f(str, "content");
        return new C23573g(str, i11);
    }

    /* renamed from: c */
    public final String m123675c() {
        return this.f114394a;
    }

    /* renamed from: d */
    public final int m123676d() {
        return this.f114395b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23573g)) {
            return false;
        }
        C23573g c23573g = (C23573g) obj;
        return AbstractC19074t.m100204b(this.f114394a, c23573g.f114394a) && this.f114395b == c23573g.f114395b;
    }

    public int hashCode() {
        return (this.f114394a.hashCode() * 31) + this.f114395b;
    }

    public String toString() {
        return "RingtoneKeywordSearch(content=" + this.f114394a + ", stateSearch=" + this.f114395b + ")";
    }
}
