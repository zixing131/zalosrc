package androidx.core.util;

/* renamed from: androidx.core.util.e */
/* loaded from: classes2.dex */
public class C1483e {

    /* renamed from: a */
    public final Object f6374a;

    /* renamed from: b */
    public final Object f6375b;

    public C1483e(Object obj, Object obj2) {
        this.f6374a = obj;
        this.f6375b = obj2;
    }

    /* renamed from: a */
    public static C1483e m7482a(Object obj, Object obj2) {
        return new C1483e(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1483e)) {
            return false;
        }
        C1483e c1483e = (C1483e) obj;
        if (!AbstractC1482d.m7475a(c1483e.f6374a, this.f6374a) || !AbstractC1482d.m7475a(c1483e.f6375b, this.f6375b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        Object obj = this.f6374a;
        int i11 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f6375b;
        if (obj2 != null) {
            i11 = obj2.hashCode();
        }
        return hashCode ^ i11;
    }

    public String toString() {
        return "Pair{" + this.f6374a + " " + this.f6375b + "}";
    }
}
