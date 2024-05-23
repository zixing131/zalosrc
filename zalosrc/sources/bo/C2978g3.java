package bo;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: bo.g3 */
/* loaded from: classes4.dex */
public final class C2978g3 {

    /* renamed from: a */
    private final List f11780a;

    /* renamed from: b */
    private boolean f11781b;

    /* renamed from: c */
    private boolean f11782c;

    public C2978g3(List list, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(list, "albums");
        this.f11780a = list;
        this.f11781b = z11;
        this.f11782c = z12;
    }

    /* renamed from: a */
    public final List m14132a() {
        return this.f11780a;
    }

    /* renamed from: b */
    public final boolean m14133b() {
        return this.f11782c;
    }

    /* renamed from: c */
    public final boolean m14134c() {
        return this.f11781b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2978g3)) {
            return false;
        }
        C2978g3 c2978g3 = (C2978g3) obj;
        return AbstractC19074t.m100204b(this.f11780a, c2978g3.f11780a) && this.f11781b == c2978g3.f11781b && this.f11782c == c2978g3.f11782c;
    }

    public int hashCode() {
        return (((this.f11780a.hashCode() * 31) + AbstractC2144f.m11520a(this.f11781b)) * 31) + AbstractC2144f.m11520a(this.f11782c);
    }

    public String toString() {
        return "SuggestAlbumData(albums=" + this.f11780a + ", enableShowPrivacy=" + this.f11781b + ", enableShowCreateAlbum=" + this.f11782c + ")";
    }
}
