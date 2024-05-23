package p218hv;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19074t;
import java.io.Serializable;

/* renamed from: hv.a */
/* loaded from: classes4.dex */
public final class C20132a implements Serializable {

    /* renamed from: p */
    private final String f99431p;

    /* renamed from: q */
    private final int f99432q;

    /* renamed from: r */
    private int f99433r;

    /* renamed from: s */
    private boolean f99434s;

    public C20132a(String str, int i11, int i12, boolean z11) {
        AbstractC19074t.m100208f(str, "h5Action");
        this.f99431p = str;
        this.f99432q = i11;
        this.f99433r = i12;
        this.f99434s = z11;
    }

    /* renamed from: a */
    public final boolean m105058a() {
        return this.f99434s;
    }

    /* renamed from: b */
    public final int m105059b() {
        return this.f99432q;
    }

    /* renamed from: c */
    public final int m105060c() {
        return this.f99433r;
    }

    /* renamed from: d */
    public final void m105061d(int i11) {
        this.f99433r = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20132a)) {
            return false;
        }
        C20132a c20132a = (C20132a) obj;
        return AbstractC19074t.m100204b(this.f99431p, c20132a.f99431p) && this.f99432q == c20132a.f99432q && this.f99433r == c20132a.f99433r && this.f99434s == c20132a.f99434s;
    }

    public int hashCode() {
        return (((((this.f99431p.hashCode() * 31) + this.f99432q) * 31) + this.f99433r) * 31) + AbstractC2144f.m11520a(this.f99434s);
    }

    public String toString() {
        return "DynamicAPI(h5Action=" + this.f99431p + ", limitRequest=" + this.f99432q + ", requestPerformed=" + this.f99433r + ", clientHandle=" + this.f99434s + ")";
    }
}
