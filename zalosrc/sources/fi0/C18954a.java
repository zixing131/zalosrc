package fi0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import fn0.AbstractC19074t;

/* renamed from: fi0.a */
/* loaded from: classes7.dex */
public final class C18954a {

    /* renamed from: a */
    private final Integer f94625a;

    /* renamed from: b */
    private final Integer f94626b;

    /* renamed from: c */
    private final Integer f94627c;

    /* renamed from: d */
    private final Integer f94628d;

    /* renamed from: e */
    private final Integer f94629e;

    /* renamed from: f */
    private final Integer f94630f;

    /* renamed from: g */
    private final Integer f94631g;

    /* renamed from: h */
    private final Integer f94632h;

    /* renamed from: i */
    private final Drawable f94633i;

    /* renamed from: j */
    private final Drawable f94634j;

    /* renamed from: k */
    private final ColorStateList f94635k;

    /* renamed from: l */
    private final int f94636l;

    /* renamed from: m */
    private final int f94637m;

    /* renamed from: n */
    private final Integer f94638n;

    /* renamed from: o */
    private final int f94639o;

    /* renamed from: p */
    private final int f94640p;

    /* renamed from: q */
    private final int f94641q;

    public C18954a(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Drawable drawable, Drawable drawable2, ColorStateList colorStateList, int i11, int i12, Integer num9, int i13, int i14, int i15) {
        this.f94625a = num;
        this.f94626b = num2;
        this.f94627c = num3;
        this.f94628d = num4;
        this.f94629e = num5;
        this.f94630f = num6;
        this.f94631g = num7;
        this.f94632h = num8;
        this.f94633i = drawable;
        this.f94634j = drawable2;
        this.f94635k = colorStateList;
        this.f94636l = i11;
        this.f94637m = i12;
        this.f94638n = num9;
        this.f94639o = i13;
        this.f94640p = i14;
        this.f94641q = i15;
    }

    /* renamed from: a */
    public final Drawable m99450a() {
        return this.f94633i;
    }

    /* renamed from: b */
    public final int m99451b() {
        return this.f94640p;
    }

    /* renamed from: c */
    public final int m99452c() {
        return this.f94641q;
    }

    /* renamed from: d */
    public final Integer m99453d() {
        return this.f94626b;
    }

    /* renamed from: e */
    public final Integer m99454e() {
        return this.f94625a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18954a)) {
            return false;
        }
        C18954a c18954a = (C18954a) obj;
        return AbstractC19074t.m100204b(this.f94625a, c18954a.f94625a) && AbstractC19074t.m100204b(this.f94626b, c18954a.f94626b) && AbstractC19074t.m100204b(this.f94627c, c18954a.f94627c) && AbstractC19074t.m100204b(this.f94628d, c18954a.f94628d) && AbstractC19074t.m100204b(this.f94629e, c18954a.f94629e) && AbstractC19074t.m100204b(this.f94630f, c18954a.f94630f) && AbstractC19074t.m100204b(this.f94631g, c18954a.f94631g) && AbstractC19074t.m100204b(this.f94632h, c18954a.f94632h) && AbstractC19074t.m100204b(this.f94633i, c18954a.f94633i) && AbstractC19074t.m100204b(this.f94634j, c18954a.f94634j) && AbstractC19074t.m100204b(this.f94635k, c18954a.f94635k) && this.f94636l == c18954a.f94636l && this.f94637m == c18954a.f94637m && AbstractC19074t.m100204b(this.f94638n, c18954a.f94638n) && this.f94639o == c18954a.f94639o && this.f94640p == c18954a.f94640p && this.f94641q == c18954a.f94641q;
    }

    /* renamed from: f */
    public final Integer m99455f() {
        return this.f94628d;
    }

    /* renamed from: g */
    public final Integer m99456g() {
        return this.f94627c;
    }

    /* renamed from: h */
    public final Integer m99457h() {
        return this.f94632h;
    }

    public int hashCode() {
        Integer num = this.f94625a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f94626b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f94627c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f94628d;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f94629e;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f94630f;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f94631g;
        int hashCode7 = (hashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.f94632h;
        int hashCode8 = (hashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Drawable drawable = this.f94633i;
        int hashCode9 = (hashCode8 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.f94634j;
        int hashCode10 = (hashCode9 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        ColorStateList colorStateList = this.f94635k;
        int hashCode11 = (((((hashCode10 + (colorStateList == null ? 0 : colorStateList.hashCode())) * 31) + this.f94636l) * 31) + this.f94637m) * 31;
        Integer num9 = this.f94638n;
        return ((((((hashCode11 + (num9 != null ? num9.hashCode() : 0)) * 31) + this.f94639o) * 31) + this.f94640p) * 31) + this.f94641q;
    }

    /* renamed from: i */
    public final Integer m99458i() {
        return this.f94629e;
    }

    /* renamed from: j */
    public final Integer m99459j() {
        return this.f94631g;
    }

    /* renamed from: k */
    public final Integer m99460k() {
        return this.f94630f;
    }

    /* renamed from: l */
    public final Drawable m99461l() {
        return this.f94634j;
    }

    /* renamed from: m */
    public final int m99462m() {
        return this.f94637m;
    }

    /* renamed from: n */
    public final Integer m99463n() {
        return this.f94638n;
    }

    /* renamed from: o */
    public final int m99464o() {
        return this.f94639o;
    }

    /* renamed from: p */
    public final int m99465p() {
        return this.f94636l;
    }

    /* renamed from: q */
    public final ColorStateList m99466q() {
        return this.f94635k;
    }

    public String toString() {
        return "ButtonStyle(layoutWidth=" + this.f94625a + ", layoutHeight=" + this.f94626b + ", minWidth=" + this.f94627c + ", minHeight=" + this.f94628d + ", paddingLeft=" + this.f94629e + ", paddingTop=" + this.f94630f + ", paddingRight=" + this.f94631g + ", paddingBottom=" + this.f94632h + ", background=" + this.f94633i + ", supportiveIcon=" + this.f94634j + ", supportiveIconTintColor=" + this.f94635k + ", supportiveIconSize=" + this.f94636l + ", supportiveIconPadding=" + this.f94637m + ", supportiveIconPaddingNoText=" + this.f94638n + ", supportiveIconPos=" + this.f94639o + ", btnFixHeight=" + this.f94640p + ", btnType=" + this.f94641q + ')';
    }
}
