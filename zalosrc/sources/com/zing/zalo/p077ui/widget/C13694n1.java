package com.zing.zalo.p077ui.widget;

import fn0.AbstractC19074t;

/* renamed from: com.zing.zalo.ui.widget.n1 */
/* loaded from: classes.dex */
public final class C13694n1 {

    /* renamed from: a */
    private final int f70741a;

    /* renamed from: b */
    private final int f70742b;

    /* renamed from: c */
    private final String f70743c;

    /* renamed from: d */
    private final boolean f70744d;

    /* renamed from: e */
    private final float f70745e;

    /* renamed from: f */
    private final float f70746f;

    /* renamed from: g */
    private final int f70747g;

    /* renamed from: h */
    private final int f70748h;

    public C13694n1(int i11, int i12, String str, boolean z11, float f11, float f12, int i13, int i14) {
        this.f70741a = i11;
        this.f70742b = i12;
        this.f70743c = str;
        this.f70744d = z11;
        this.f70745e = f11;
        this.f70746f = f12;
        this.f70747g = i13;
        this.f70748h = i14;
    }

    /* renamed from: a */
    public final boolean m76439a() {
        return this.f70744d;
    }

    /* renamed from: b */
    public final String m76440b() {
        return this.f70743c;
    }

    /* renamed from: c */
    public final int m76441c() {
        return this.f70747g;
    }

    /* renamed from: d */
    public final float m76442d() {
        return this.f70745e;
    }

    /* renamed from: e */
    public final int m76443e() {
        return this.f70748h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13694n1)) {
            return false;
        }
        C13694n1 c13694n1 = (C13694n1) obj;
        return this.f70741a == c13694n1.f70741a && this.f70742b == c13694n1.f70742b && AbstractC19074t.m100204b(this.f70743c, c13694n1.f70743c) && this.f70744d == c13694n1.f70744d && Float.compare(this.f70745e, c13694n1.f70745e) == 0 && Float.compare(this.f70746f, c13694n1.f70746f) == 0 && this.f70747g == c13694n1.f70747g && this.f70748h == c13694n1.f70748h;
    }

    /* renamed from: f */
    public final float m76444f() {
        return this.f70746f;
    }

    /* renamed from: g */
    public final int m76445g() {
        return this.f70741a;
    }

    /* renamed from: h */
    public final int m76446h() {
        return this.f70742b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i11 = ((this.f70741a * 31) + this.f70742b) * 31;
        String str = this.f70743c;
        int hashCode = (i11 + (str == null ? 0 : str.hashCode())) * 31;
        boolean z11 = this.f70744d;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        return ((((((((hashCode + i12) * 31) + Float.floatToIntBits(this.f70745e)) * 31) + Float.floatToIntBits(this.f70746f)) * 31) + this.f70747g) * 31) + this.f70748h;
    }

    public String toString() {
        return "RobotoAttribute(textClass=" + this.f70741a + ", typeface=" + this.f70742b + ", fstyle=" + this.f70743c + ", disableScaleTextSize=" + this.f70744d + ", maxScaledTextSize=" + this.f70745e + ", minScaledTextSize=" + this.f70746f + ", maxScaledTextRatioIndex=" + this.f70747g + ", minScaledTextRatioIndex=" + this.f70748h + ')';
    }
}
