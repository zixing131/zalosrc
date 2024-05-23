package nk0;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.zing.zalo.zinstant.utils.AbstractC17201m;
import com.zing.zalo.zinstant.zom.text.ZOMTextSpan;
import fn0.AbstractC19074t;
import vj0.AbstractC28270d;
import vj0.C28273g;

/* renamed from: nk0.h1 */
/* loaded from: classes7.dex */
public final class C23829h1 extends SpannableStringBuilder {

    /* renamed from: p */
    private final ZOMTextSpan f115147p;

    /* renamed from: q */
    private String f115148q;

    /* renamed from: r */
    private float f115149r;

    /* renamed from: s */
    private Typeface f115150s;

    /* renamed from: t */
    private a f115151t;

    /* renamed from: u */
    private CharSequence f115152u;

    /* renamed from: nk0.h1$a */
    /* loaded from: classes7.dex */
    public static final class a extends MetricAffectingSpan {

        /* renamed from: p */
        private final C23829h1 f115153p;

        public a(C23829h1 c23829h1) {
            AbstractC19074t.m100208f(c23829h1, "textSpan");
            this.f115153p = c23829h1;
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "textPaint");
            textPaint.setTextSize(this.f115153p.f115149r);
            textPaint.setTypeface(this.f115153p.f115150s);
        }

        @Override // android.text.style.MetricAffectingSpan
        public void updateMeasureState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            textPaint.setTextSize(this.f115153p.f115149r);
            textPaint.setTypeface(this.f115153p.f115150s);
        }
    }

    public C23829h1(ZOMTextSpan zOMTextSpan) {
        AbstractC19074t.m100208f(zOMTextSpan, "zomTextSpan");
        this.f115147p = zOMTextSpan;
        this.f115148q = "";
        this.f115149r = -1.0f;
        a aVar = new a(this);
        m124557g(this, aVar, 0, 2, null);
        this.f115151t = aVar;
    }

    /* renamed from: f */
    private final void m124556f(Object obj, int i11) {
        setSpan(obj, 0, length(), i11);
    }

    /* renamed from: g */
    static /* synthetic */ void m124557g(C23829h1 c23829h1, Object obj, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        c23829h1.m124556f(obj, i11);
    }

    /* renamed from: h */
    private final C23829h1 m124558h(String str) {
        if (AbstractC19074t.m100204b(this.f115148q, str)) {
            return this;
        }
        this.f115148q = str;
        replace(0, length(), (CharSequence) this.f115148q);
        return this;
    }

    /* renamed from: i */
    private final void m124559i() {
        String str = this.f115147p.text;
        AbstractC19074t.m100207e(str, "zomTextSpan.text");
        m124558h(str);
        this.f115149r = AbstractC17201m.m91828t(this.f115147p.textSize);
        this.f115150s = C28273g.m142439i().m142458x(this.f115147p);
        m124557g(this, this.f115151t, 0, 2, null);
    }

    /* renamed from: c */
    public /* bridge */ char m124560c(int i11) {
        return super.charAt(i11);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final /* bridge */ char charAt(int i11) {
        return m124560c(i11);
    }

    /* renamed from: d */
    public /* bridge */ int m124561d() {
        return super.length();
    }

    /* renamed from: e */
    public final CharSequence m124562e() {
        m124559i();
        this.f115152u = this;
        if (this.f115147p.emoticonEnabled && AbstractC28270d.m142428a() != null) {
            this.f115152u = AbstractC28270d.m142428a().mo18128b(this.f115152u);
        }
        return this.f115152u;
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final /* bridge */ int length() {
        return m124561d();
    }
}
