package dm0;

import android.graphics.Rect;
import fn0.AbstractC19074t;
import java.util.Arrays;

/* renamed from: dm0.a */
/* loaded from: classes7.dex */
public final class C18028a {

    /* renamed from: a */
    private final String f91291a;

    /* renamed from: b */
    private final float f91292b;

    /* renamed from: c */
    private final Rect f91293c;

    /* renamed from: d */
    private final float[] f91294d;

    public C18028a(String str, float f11, Rect rect, float[] fArr) {
        AbstractC19074t.m100208f(str, "text");
        AbstractC19074t.m100208f(rect, "boundingBox");
        AbstractC19074t.m100208f(fArr, "cornerPoints");
        this.f91291a = str;
        this.f91292b = f11;
        this.f91293c = rect;
        this.f91294d = fArr;
    }

    /* renamed from: a */
    public final float[] m95863a() {
        return this.f91294d;
    }

    /* renamed from: b */
    public final String m95864b() {
        return this.f91291a;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC19074t.m100204b(C18028a.class, cls)) {
            return false;
        }
        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.zvision.mlkit.text.Line");
        C18028a c18028a = (C18028a) obj;
        if (AbstractC19074t.m100204b(this.f91291a, c18028a.f91291a) && this.f91292b == c18028a.f91292b && AbstractC19074t.m100204b(this.f91293c, c18028a.f91293c) && Arrays.equals(this.f91294d, c18028a.f91294d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f91291a.hashCode() * 31) + Float.floatToIntBits(this.f91292b)) * 31) + this.f91293c.hashCode()) * 31) + Arrays.hashCode(this.f91294d);
    }

    public String toString() {
        return "Line(text=" + this.f91291a + ", confidentScore=" + this.f91292b + ", boundingBox=" + this.f91293c + ", cornerPoints=" + Arrays.toString(this.f91294d) + ')';
    }
}
