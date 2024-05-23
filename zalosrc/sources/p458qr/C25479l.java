package p458qr;

import fn0.AbstractC19074t;

/* renamed from: qr.l */
/* loaded from: classes4.dex */
public final class C25479l {

    /* renamed from: a */
    private final String f122066a;

    /* renamed from: b */
    private final int f122067b;

    /* renamed from: c */
    private final String f122068c;

    /* renamed from: d */
    private final int f122069d;

    public C25479l(String str, int i11, String str2, int i12) {
        AbstractC19074t.m100208f(str, "descriptionText");
        AbstractC19074t.m100208f(str2, "actionText");
        this.f122066a = str;
        this.f122067b = i11;
        this.f122068c = str2;
        this.f122069d = i12;
    }

    /* renamed from: a */
    public final int m131963a() {
        return this.f122069d;
    }

    /* renamed from: b */
    public final String m131964b() {
        return this.f122068c;
    }

    /* renamed from: c */
    public final String m131965c() {
        return this.f122066a;
    }

    /* renamed from: d */
    public final int m131966d() {
        return this.f122067b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25479l)) {
            return false;
        }
        C25479l c25479l = (C25479l) obj;
        return AbstractC19074t.m100204b(this.f122066a, c25479l.f122066a) && this.f122067b == c25479l.f122067b && AbstractC19074t.m100204b(this.f122068c, c25479l.f122068c) && this.f122069d == c25479l.f122069d;
    }

    public int hashCode() {
        return (((((this.f122066a.hashCode() * 31) + this.f122067b) * 31) + this.f122068c.hashCode()) * 31) + this.f122069d;
    }

    public String toString() {
        return "SnackBarData(descriptionText=" + this.f122066a + ", length=" + this.f122067b + ", actionText=" + this.f122068c + ", actionId=" + this.f122069d + ")";
    }
}
