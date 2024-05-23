package ti0;

import android.content.res.ColorStateList;
import android.text.TextUtils;
import com.zing.zalo.p077ui.widget.C13694n1;
import fn0.AbstractC19074t;

/* renamed from: ti0.b */
/* loaded from: classes7.dex */
public final class C26703b {

    /* renamed from: a */
    private final Boolean f126594a;

    /* renamed from: b */
    private final ColorStateList f126595b;

    /* renamed from: c */
    private final ColorStateList f126596c;

    /* renamed from: d */
    private final ColorStateList f126597d;

    /* renamed from: e */
    private final Float f126598e;

    /* renamed from: f */
    private final Float f126599f;

    /* renamed from: g */
    private final Float f126600g;

    /* renamed from: h */
    private final Float f126601h;

    /* renamed from: i */
    private final Float f126602i;

    /* renamed from: j */
    private final Boolean f126603j;

    /* renamed from: k */
    private final Integer f126604k;

    /* renamed from: l */
    private final Integer f126605l;

    /* renamed from: m */
    private final Boolean f126606m;

    /* renamed from: n */
    private final TextUtils.TruncateAt f126607n;

    /* renamed from: o */
    private final Integer f126608o;

    /* renamed from: p */
    private final Float f126609p;

    /* renamed from: q */
    private final Float f126610q;

    /* renamed from: r */
    private final Float f126611r;

    /* renamed from: s */
    private final C13694n1 f126612s;

    public C26703b(Boolean bool, ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, Float f11, Float f12, Float f13, Float f14, Float f15, Boolean bool2, Integer num, Integer num2, Boolean bool3, TextUtils.TruncateAt truncateAt, Integer num3, Float f16, Float f17, Float f18, C13694n1 c13694n1) {
        this.f126594a = bool;
        this.f126595b = colorStateList;
        this.f126596c = colorStateList2;
        this.f126597d = colorStateList3;
        this.f126598e = f11;
        this.f126599f = f12;
        this.f126600g = f13;
        this.f126601h = f14;
        this.f126602i = f15;
        this.f126603j = bool2;
        this.f126604k = num;
        this.f126605l = num2;
        this.f126606m = bool3;
        this.f126607n = truncateAt;
        this.f126608o = num3;
        this.f126609p = f16;
        this.f126610q = f17;
        this.f126611r = f18;
        this.f126612s = c13694n1;
    }

    /* renamed from: a */
    public final TextUtils.TruncateAt m137274a() {
        return this.f126607n;
    }

    /* renamed from: b */
    public final Boolean m137275b() {
        return this.f126603j;
    }

    /* renamed from: c */
    public final Float m137276c() {
        return this.f126602i;
    }

    /* renamed from: d */
    public final Float m137277d() {
        return this.f126599f;
    }

    /* renamed from: e */
    public final Float m137278e() {
        return this.f126600g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26703b)) {
            return false;
        }
        C26703b c26703b = (C26703b) obj;
        return AbstractC19074t.m100204b(this.f126594a, c26703b.f126594a) && AbstractC19074t.m100204b(this.f126595b, c26703b.f126595b) && AbstractC19074t.m100204b(this.f126596c, c26703b.f126596c) && AbstractC19074t.m100204b(this.f126597d, c26703b.f126597d) && AbstractC19074t.m100204b(this.f126598e, c26703b.f126598e) && AbstractC19074t.m100204b(this.f126599f, c26703b.f126599f) && AbstractC19074t.m100204b(this.f126600g, c26703b.f126600g) && AbstractC19074t.m100204b(this.f126601h, c26703b.f126601h) && AbstractC19074t.m100204b(this.f126602i, c26703b.f126602i) && AbstractC19074t.m100204b(this.f126603j, c26703b.f126603j) && AbstractC19074t.m100204b(this.f126604k, c26703b.f126604k) && AbstractC19074t.m100204b(this.f126605l, c26703b.f126605l) && AbstractC19074t.m100204b(this.f126606m, c26703b.f126606m) && this.f126607n == c26703b.f126607n && AbstractC19074t.m100204b(this.f126608o, c26703b.f126608o) && AbstractC19074t.m100204b(this.f126609p, c26703b.f126609p) && AbstractC19074t.m100204b(this.f126610q, c26703b.f126610q) && AbstractC19074t.m100204b(this.f126611r, c26703b.f126611r) && AbstractC19074t.m100204b(this.f126612s, c26703b.f126612s);
    }

    /* renamed from: f */
    public final Float m137279f() {
        return this.f126601h;
    }

    /* renamed from: g */
    public final Integer m137280g() {
        return this.f126605l;
    }

    /* renamed from: h */
    public final Integer m137281h() {
        return this.f126604k;
    }

    public int hashCode() {
        Boolean bool = this.f126594a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        ColorStateList colorStateList = this.f126595b;
        int hashCode2 = (hashCode + (colorStateList == null ? 0 : colorStateList.hashCode())) * 31;
        ColorStateList colorStateList2 = this.f126596c;
        int hashCode3 = (hashCode2 + (colorStateList2 == null ? 0 : colorStateList2.hashCode())) * 31;
        ColorStateList colorStateList3 = this.f126597d;
        int hashCode4 = (hashCode3 + (colorStateList3 == null ? 0 : colorStateList3.hashCode())) * 31;
        Float f11 = this.f126598e;
        int hashCode5 = (hashCode4 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Float f12 = this.f126599f;
        int hashCode6 = (hashCode5 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Float f13 = this.f126600g;
        int hashCode7 = (hashCode6 + (f13 == null ? 0 : f13.hashCode())) * 31;
        Float f14 = this.f126601h;
        int hashCode8 = (hashCode7 + (f14 == null ? 0 : f14.hashCode())) * 31;
        Float f15 = this.f126602i;
        int hashCode9 = (hashCode8 + (f15 == null ? 0 : f15.hashCode())) * 31;
        Boolean bool2 = this.f126603j;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.f126604k;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f126605l;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool3 = this.f126606m;
        int hashCode13 = (hashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        TextUtils.TruncateAt truncateAt = this.f126607n;
        int hashCode14 = (hashCode13 + (truncateAt == null ? 0 : truncateAt.hashCode())) * 31;
        Integer num3 = this.f126608o;
        int hashCode15 = (hashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f16 = this.f126609p;
        int hashCode16 = (hashCode15 + (f16 == null ? 0 : f16.hashCode())) * 31;
        Float f17 = this.f126610q;
        int hashCode17 = (hashCode16 + (f17 == null ? 0 : f17.hashCode())) * 31;
        Float f18 = this.f126611r;
        int hashCode18 = (hashCode17 + (f18 == null ? 0 : f18.hashCode())) * 31;
        C13694n1 c13694n1 = this.f126612s;
        return hashCode18 + (c13694n1 != null ? c13694n1.hashCode() : 0);
    }

    /* renamed from: i */
    public final C13694n1 m137282i() {
        return this.f126612s;
    }

    /* renamed from: j */
    public final Integer m137283j() {
        return this.f126608o;
    }

    /* renamed from: k */
    public final Float m137284k() {
        return this.f126609p;
    }

    /* renamed from: l */
    public final Float m137285l() {
        return this.f126610q;
    }

    /* renamed from: m */
    public final Float m137286m() {
        return this.f126611r;
    }

    /* renamed from: n */
    public final Boolean m137287n() {
        return this.f126606m;
    }

    /* renamed from: o */
    public final Boolean m137288o() {
        return this.f126594a;
    }

    /* renamed from: p */
    public final ColorStateList m137289p() {
        return this.f126595b;
    }

    /* renamed from: q */
    public final ColorStateList m137290q() {
        return this.f126596c;
    }

    /* renamed from: r */
    public final ColorStateList m137291r() {
        return this.f126597d;
    }

    /* renamed from: s */
    public final Float m137292s() {
        return this.f126598e;
    }

    public String toString() {
        return "TextAppearance(textAllCaps=" + this.f126594a + ", textColor=" + this.f126595b + ", textColorHint=" + this.f126596c + ", textColorLink=" + this.f126597d + ", textSize=" + this.f126598e + ", lineHeight=" + this.f126599f + ", lineSpacingExtra=" + this.f126600g + ", lineSpacingMultiplier=" + this.f126601h + ", letterSpacing=" + this.f126602i + ", includeFontPadding=" + this.f126603j + ", minLines=" + this.f126604k + ", maxLines=" + this.f126605l + ", singleLine=" + this.f126606m + ", ellipsize=" + this.f126607n + ", shadowColor=" + this.f126608o + ", shadowDx=" + this.f126609p + ", shadowDy=" + this.f126610q + ", shadowRadius=" + this.f126611r + ", robotoAttribute=" + this.f126612s + ')';
    }
}
