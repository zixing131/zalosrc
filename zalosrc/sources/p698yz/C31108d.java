package p698yz;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19074t;

/* renamed from: yz.d */
/* loaded from: classes4.dex */
public final class C31108d {

    /* renamed from: a */
    private final boolean f143347a;

    /* renamed from: b */
    private final String f143348b;

    public C31108d(boolean z11, String str) {
        AbstractC19074t.m100208f(str, "filePath");
        this.f143347a = z11;
        this.f143348b = str;
    }

    /* renamed from: a */
    public final String m151118a() {
        return this.f143348b;
    }

    /* renamed from: b */
    public final boolean m151119b() {
        return this.f143347a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31108d)) {
            return false;
        }
        C31108d c31108d = (C31108d) obj;
        return this.f143347a == c31108d.f143347a && AbstractC19074t.m100204b(this.f143348b, c31108d.f143348b);
    }

    public int hashCode() {
        return (AbstractC2144f.m11520a(this.f143347a) * 31) + this.f143348b.hashCode();
    }

    public String toString() {
        return "ChatFileValidationResult(validFile=" + this.f143347a + ", filePath=" + this.f143348b + ")";
    }
}
