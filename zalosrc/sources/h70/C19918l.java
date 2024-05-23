package h70;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: h70.l */
/* loaded from: classes5.dex */
public final class C19918l {

    /* renamed from: a */
    private final boolean f98180a;

    /* renamed from: b */
    private final int f98181b;

    /* renamed from: c */
    private final String f98182c;

    public C19918l(boolean z11, int i11, String str) {
        AbstractC19074t.m100208f(str, "errorMessage");
        this.f98180a = z11;
        this.f98181b = i11;
        this.f98182c = str;
    }

    /* renamed from: a */
    public final String m103691a() {
        return this.f98182c;
    }

    /* renamed from: b */
    public final boolean m103692b() {
        return this.f98180a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19918l)) {
            return false;
        }
        C19918l c19918l = (C19918l) obj;
        return this.f98180a == c19918l.f98180a && this.f98181b == c19918l.f98181b && AbstractC19074t.m100204b(this.f98182c, c19918l.f98182c);
    }

    public int hashCode() {
        return (((AbstractC2144f.m11520a(this.f98180a) * 31) + this.f98181b) * 31) + this.f98182c.hashCode();
    }

    public String toString() {
        return "PollPinState(processing=" + this.f98180a + ", errorCode=" + this.f98181b + ", errorMessage=" + this.f98182c + ")";
    }

    public /* synthetic */ C19918l(boolean z11, int i11, String str, int i12, AbstractC19060k abstractC19060k) {
        this(z11, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? "" : str);
    }
}
