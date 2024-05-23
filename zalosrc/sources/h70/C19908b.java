package h70;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: h70.b */
/* loaded from: classes5.dex */
public final class C19908b {

    /* renamed from: a */
    private final boolean f98104a;

    /* renamed from: b */
    private final int f98105b;

    /* renamed from: c */
    private final String f98106c;

    public C19908b(boolean z11, int i11, String str) {
        AbstractC19074t.m100208f(str, "errorMessage");
        this.f98104a = z11;
        this.f98105b = i11;
        this.f98106c = str;
    }

    /* renamed from: a */
    public final String m103594a() {
        return this.f98106c;
    }

    /* renamed from: b */
    public final boolean m103595b() {
        return this.f98104a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19908b)) {
            return false;
        }
        C19908b c19908b = (C19908b) obj;
        return this.f98104a == c19908b.f98104a && this.f98105b == c19908b.f98105b && AbstractC19074t.m100204b(this.f98106c, c19908b.f98106c);
    }

    public int hashCode() {
        return (((AbstractC2144f.m11520a(this.f98104a) * 31) + this.f98105b) * 31) + this.f98106c.hashCode();
    }

    public String toString() {
        return "PollCloseState(processing=" + this.f98104a + ", errorCode=" + this.f98105b + ", errorMessage=" + this.f98106c + ")";
    }

    public /* synthetic */ C19908b(boolean z11, int i11, String str, int i12, AbstractC19060k abstractC19060k) {
        this(z11, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? "" : str);
    }
}
