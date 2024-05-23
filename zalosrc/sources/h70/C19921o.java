package h70;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: h70.o */
/* loaded from: classes5.dex */
public final class C19921o {

    /* renamed from: a */
    private final boolean f98187a;

    /* renamed from: b */
    private final int f98188b;

    /* renamed from: c */
    private final String f98189c;

    public C19921o(boolean z11, int i11, String str) {
        AbstractC19074t.m100208f(str, "errorMessage");
        this.f98187a = z11;
        this.f98188b = i11;
        this.f98189c = str;
    }

    /* renamed from: a */
    public final String m103695a() {
        return this.f98189c;
    }

    /* renamed from: b */
    public final boolean m103696b() {
        return this.f98187a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19921o)) {
            return false;
        }
        C19921o c19921o = (C19921o) obj;
        return this.f98187a == c19921o.f98187a && this.f98188b == c19921o.f98188b && AbstractC19074t.m100204b(this.f98189c, c19921o.f98189c);
    }

    public int hashCode() {
        return (((AbstractC2144f.m11520a(this.f98187a) * 31) + this.f98188b) * 31) + this.f98189c.hashCode();
    }

    public String toString() {
        return "PollSendState(processing=" + this.f98187a + ", errorCode=" + this.f98188b + ", errorMessage=" + this.f98189c + ")";
    }

    public /* synthetic */ C19921o(boolean z11, int i11, String str, int i12, AbstractC19060k abstractC19060k) {
        this(z11, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? "" : str);
    }
}
