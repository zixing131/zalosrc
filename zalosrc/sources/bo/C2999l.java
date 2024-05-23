package bo;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19074t;

/* renamed from: bo.l */
/* loaded from: classes4.dex */
public final class C2999l {

    /* renamed from: a */
    private int f11847a;

    /* renamed from: b */
    private String f11848b;

    /* renamed from: c */
    private String f11849c;

    /* renamed from: d */
    private final boolean f11850d;

    public C2999l(int i11, String str, String str2, boolean z11) {
        AbstractC19074t.m100208f(str, "thumbURL");
        AbstractC19074t.m100208f(str2, "title");
        this.f11847a = i11;
        this.f11848b = str;
        this.f11849c = str2;
        this.f11850d = z11;
    }

    /* renamed from: a */
    public final int m14237a() {
        return this.f11847a;
    }

    /* renamed from: b */
    public final String m14238b() {
        return this.f11848b;
    }

    /* renamed from: c */
    public final String m14239c() {
        return this.f11849c;
    }

    /* renamed from: d */
    public final boolean m14240d() {
        return this.f11850d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2999l)) {
            return false;
        }
        C2999l c2999l = (C2999l) obj;
        return this.f11847a == c2999l.f11847a && AbstractC19074t.m100204b(this.f11848b, c2999l.f11848b) && AbstractC19074t.m100204b(this.f11849c, c2999l.f11849c) && this.f11850d == c2999l.f11850d;
    }

    public int hashCode() {
        return (((((this.f11847a * 31) + this.f11848b.hashCode()) * 31) + this.f11849c.hashCode()) * 31) + AbstractC2144f.m11520a(this.f11850d);
    }

    public String toString() {
        return "AlbumRowPreviewThemeData(idTheme=" + this.f11847a + ", thumbURL=" + this.f11848b + ", title=" + this.f11849c + ", isSelected=" + this.f11850d + ")";
    }
}
