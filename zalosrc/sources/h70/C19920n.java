package h70;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: h70.n */
/* loaded from: classes5.dex */
public final class C19920n {

    /* renamed from: a */
    private final boolean f98184a;

    /* renamed from: b */
    private final int f98185b;

    /* renamed from: c */
    private final String f98186c;

    public C19920n(boolean z11, int i11, String str) {
        AbstractC19074t.m100208f(str, "errorMessage");
        this.f98184a = z11;
        this.f98185b = i11;
        this.f98186c = str;
    }

    /* renamed from: a */
    public final String m103693a() {
        return this.f98186c;
    }

    /* renamed from: b */
    public final boolean m103694b() {
        return this.f98184a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19920n)) {
            return false;
        }
        C19920n c19920n = (C19920n) obj;
        return this.f98184a == c19920n.f98184a && this.f98185b == c19920n.f98185b && AbstractC19074t.m100204b(this.f98186c, c19920n.f98186c);
    }

    public int hashCode() {
        return (((AbstractC2144f.m11520a(this.f98184a) * 31) + this.f98185b) * 31) + this.f98186c.hashCode();
    }

    public String toString() {
        return "PollSaveState(processing=" + this.f98184a + ", errorCode=" + this.f98185b + ", errorMessage=" + this.f98186c + ")";
    }

    public /* synthetic */ C19920n(boolean z11, int i11, String str, int i12, AbstractC19060k abstractC19060k) {
        this(z11, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? "" : str);
    }
}
