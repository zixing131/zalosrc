package vj0;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import fn0.AbstractC19074t;

/* renamed from: vj0.a */
/* loaded from: classes7.dex */
public final class C28267a {

    /* renamed from: a */
    private CharSequence f131820a;

    /* renamed from: b */
    private TextPaint f131821b;

    /* renamed from: c */
    private int f131822c;

    /* renamed from: d */
    private int f131823d;

    /* renamed from: e */
    private Layout.Alignment f131824e;

    /* renamed from: f */
    private float f131825f;

    /* renamed from: g */
    private float f131826g;

    /* renamed from: h */
    private boolean f131827h;

    /* renamed from: i */
    private TextUtils.TruncateAt f131828i;

    /* renamed from: j */
    private int f131829j;

    /* renamed from: k */
    private int f131830k;

    /* renamed from: l */
    private int f131831l;

    /* renamed from: m */
    private BoringLayout.Metrics f131832m;

    public C28267a(CharSequence charSequence, TextPaint textPaint, int i11, int i12, Layout.Alignment alignment, float f11, float f12, boolean z11, TextUtils.TruncateAt truncateAt, int i13, int i14, int i15, BoringLayout.Metrics metrics) {
        AbstractC19074t.m100208f(charSequence, "source");
        AbstractC19074t.m100208f(textPaint, "paint");
        AbstractC19074t.m100208f(alignment, "align");
        AbstractC19074t.m100208f(truncateAt, "ellipsize");
        this.f131820a = charSequence;
        this.f131821b = textPaint;
        this.f131822c = i11;
        this.f131823d = i12;
        this.f131824e = alignment;
        this.f131825f = f11;
        this.f131826g = f12;
        this.f131827h = z11;
        this.f131828i = truncateAt;
        this.f131829j = i13;
        this.f131830k = i14;
        this.f131831l = i15;
        this.f131832m = metrics;
    }

    /* renamed from: a */
    public final Layout.Alignment m142391a() {
        return this.f131824e;
    }

    /* renamed from: b */
    public final int m142392b() {
        return this.f131831l;
    }

    /* renamed from: c */
    public final int m142393c() {
        return this.f131829j;
    }

    /* renamed from: d */
    public final TextUtils.TruncateAt m142394d() {
        return this.f131828i;
    }

    /* renamed from: e */
    public final boolean m142395e() {
        return this.f131827h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28267a)) {
            return false;
        }
        C28267a c28267a = (C28267a) obj;
        return AbstractC19074t.m100204b(this.f131820a, c28267a.f131820a) && AbstractC19074t.m100204b(this.f131821b, c28267a.f131821b) && this.f131822c == c28267a.f131822c && this.f131823d == c28267a.f131823d && this.f131824e == c28267a.f131824e && AbstractC19074t.m100204b(Float.valueOf(this.f131825f), Float.valueOf(c28267a.f131825f)) && AbstractC19074t.m100204b(Float.valueOf(this.f131826g), Float.valueOf(c28267a.f131826g)) && this.f131827h == c28267a.f131827h && this.f131828i == c28267a.f131828i && this.f131829j == c28267a.f131829j && this.f131830k == c28267a.f131830k && this.f131831l == c28267a.f131831l && AbstractC19074t.m100204b(this.f131832m, c28267a.f131832m);
    }

    /* renamed from: f */
    public final int m142396f() {
        return this.f131830k;
    }

    /* renamed from: g */
    public final int m142397g() {
        return this.f131823d;
    }

    /* renamed from: h */
    public final int m142398h() {
        return this.f131822c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((this.f131820a.hashCode() * 31) + this.f131821b.hashCode()) * 31) + this.f131822c) * 31) + this.f131823d) * 31) + this.f131824e.hashCode()) * 31) + Float.floatToIntBits(this.f131825f)) * 31) + Float.floatToIntBits(this.f131826g)) * 31;
        boolean z11 = this.f131827h;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int hashCode2 = (((((((((hashCode + i11) * 31) + this.f131828i.hashCode()) * 31) + this.f131829j) * 31) + this.f131830k) * 31) + this.f131831l) * 31;
        BoringLayout.Metrics metrics = this.f131832m;
        return hashCode2 + (metrics == null ? 0 : metrics.hashCode());
    }

    /* renamed from: i */
    public final TextPaint m142399i() {
        return this.f131821b;
    }

    /* renamed from: j */
    public final CharSequence m142400j() {
        return this.f131820a;
    }

    /* renamed from: k */
    public final float m142401k() {
        return this.f131826g;
    }

    /* renamed from: l */
    public final float m142402l() {
        return this.f131825f;
    }

    /* renamed from: m */
    public final BoringLayout.Metrics m142403m() {
        return this.f131832m;
    }

    /* renamed from: n */
    public final void m142404n(int i11) {
        this.f131830k = i11;
    }

    /* renamed from: o */
    public final void m142405o(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "<set-?>");
        this.f131820a = charSequence;
    }

    public String toString() {
        return "LayoutParam(source=" + ((Object) this.f131820a) + ", paint=" + this.f131821b + ", outerWidth=" + this.f131822c + ", outerHeight=" + this.f131823d + ", align=" + this.f131824e + ", spacingMult=" + this.f131825f + ", spacingAdd=" + this.f131826g + ", includePad=" + this.f131827h + ", ellipsize=" + this.f131828i + ", ellipsisWidth=" + this.f131829j + ", maxLines=" + this.f131830k + ", breakStrategy=" + this.f131831l + ", isBoring=" + this.f131832m + ')';
    }
}
