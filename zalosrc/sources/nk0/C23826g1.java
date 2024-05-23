package nk0;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.zing.zalo.zinstant.utils.AbstractC17201m;
import com.zing.zalo.zinstant.utils.C17189a;
import com.zing.zalo.zinstant.utils.C17206r;
import com.zing.zalo.zinstant.zom.properties.ZOMBackground;
import com.zing.zalo.zinstant.zom.text.ZOMTextSpan;
import fn0.AbstractC19074t;
import vj0.AbstractC28270d;
import vj0.AbstractC28274h;
import vj0.C28273g;

/* renamed from: nk0.g1 */
/* loaded from: classes7.dex */
public final class C23826g1 extends SpannableStringBuilder {

    /* renamed from: A */
    private int f115126A;

    /* renamed from: B */
    private int f115127B;

    /* renamed from: C */
    private final a f115128C;

    /* renamed from: D */
    private CharSequence f115129D;

    /* renamed from: E */
    private int f115130E;

    /* renamed from: p */
    private final ZOMTextSpan f115131p;

    /* renamed from: q */
    private String f115132q;

    /* renamed from: r */
    private float f115133r;

    /* renamed from: s */
    private boolean f115134s;

    /* renamed from: t */
    private boolean f115135t;

    /* renamed from: u */
    private int f115136u;

    /* renamed from: v */
    private int f115137v;

    /* renamed from: w */
    private int f115138w;

    /* renamed from: x */
    private Typeface f115139x;

    /* renamed from: y */
    private float f115140y;

    /* renamed from: z */
    private int f115141z;

    /* renamed from: nk0.g1$a */
    /* loaded from: classes7.dex */
    public static final class a extends MetricAffectingSpan {

        /* renamed from: p */
        private final C23826g1 f115142p;

        /* renamed from: q */
        private boolean f115143q;

        public a(C23826g1 c23826g1) {
            AbstractC19074t.m100208f(c23826g1, "textSpan");
            this.f115142p = c23826g1;
        }

        /* renamed from: a */
        public final boolean m124547a() {
            if (this.f115142p.m124542j() != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final ZOMTextSpan m124548b() {
            return this.f115142p.m124544l();
        }

        /* renamed from: c */
        public final void m124549c() {
            this.f115143q = true;
        }

        /* renamed from: d */
        public final void m124550d() {
            this.f115143q = false;
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "textPaint");
            textPaint.setTextSize(this.f115142p.f115133r);
            textPaint.setColor(this.f115142p.f115141z);
            textPaint.setStrikeThruText(this.f115142p.f115135t);
            textPaint.setUnderlineText(this.f115142p.f115134s);
            textPaint.setTypeface(this.f115142p.f115139x);
            if (m124547a() && this.f115143q) {
                textPaint.bgColor = this.f115142p.f115127B;
            } else {
                textPaint.bgColor = this.f115142p.f115126A;
            }
        }

        @Override // android.text.style.MetricAffectingSpan
        public void updateMeasureState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            textPaint.setTextSize(this.f115142p.f115133r);
            textPaint.setTypeface(this.f115142p.f115139x);
        }
    }

    public C23826g1(ZOMTextSpan zOMTextSpan) {
        AbstractC19074t.m100208f(zOMTextSpan, "zomTextSpan");
        this.f115131p = zOMTextSpan;
        this.f115132q = "";
        this.f115133r = -1.0f;
        this.f115140y = 1.0f;
        a aVar = new a(this);
        m124537w(this, aVar, 0, 2, null);
        this.f115128C = aVar;
    }

    /* renamed from: m */
    private final void m124528m(ZOMTextSpan zOMTextSpan) {
        int i11;
        if (zOMTextSpan.isClickable()) {
            i11 = 1;
        } else if (zOMTextSpan.isLongClickable()) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        this.f115130E = i11;
    }

    /* renamed from: n */
    private final void m124529n() {
        this.f115126A = C17189a.f87752a.m91796b(this.f115140y, this.f115137v);
    }

    /* renamed from: o */
    private final void m124530o() {
        this.f115141z = C17189a.f87752a.m91796b(this.f115140y, this.f115136u);
    }

    /* renamed from: p */
    private final void m124531p() {
        m124530o();
        m124529n();
        m124532q();
    }

    /* renamed from: q */
    private final void m124532q() {
        this.f115127B = C17189a.f87752a.m91796b(this.f115140y, this.f115138w);
    }

    /* renamed from: r */
    private final C23826g1 m124533r(int i11) {
        if (this.f115137v == i11) {
            return this;
        }
        this.f115137v = i11;
        m124529n();
        return this;
    }

    /* renamed from: s */
    private final C23826g1 m124534s() {
        int i11;
        m124528m(this.f115131p);
        ZOMBackground zOMBackground = this.f115131p.mBackground;
        if (zOMBackground != null) {
            i11 = zOMBackground.mPressedColor;
        } else {
            i11 = 0;
        }
        m124535u(i11);
        return this;
    }

    /* renamed from: u */
    private final C23826g1 m124535u(int i11) {
        if (this.f115138w == i11) {
            return this;
        }
        this.f115138w = i11;
        m124532q();
        return this;
    }

    /* renamed from: v */
    private final void m124536v(Object obj, int i11) {
        setSpan(obj, 0, length(), i11);
    }

    /* renamed from: w */
    static /* synthetic */ void m124537w(C23826g1 c23826g1, Object obj, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        c23826g1.m124536v(obj, i11);
    }

    /* renamed from: x */
    private final C23826g1 m124538x(String str) {
        if (AbstractC19074t.m100204b(this.f115132q, str)) {
            return this;
        }
        this.f115132q = str;
        replace(0, length(), (CharSequence) this.f115132q);
        return this;
    }

    /* renamed from: y */
    private final C23826g1 m124539y(int i11) {
        if (this.f115136u == i11) {
            return this;
        }
        this.f115136u = i11;
        m124530o();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final /* bridge */ char charAt(int i11) {
        return m124540h(i11);
    }

    /* renamed from: h */
    public /* bridge */ char m124540h(int i11) {
        return super.charAt(i11);
    }

    /* renamed from: i */
    public /* bridge */ int m124541i() {
        return super.length();
    }

    /* renamed from: j */
    public final int m124542j() {
        return this.f115130E;
    }

    /* renamed from: k */
    public final CharSequence m124543k() {
        this.f115129D = this;
        if (this.f115131p.emoticonEnabled && AbstractC28270d.m142428a() != null) {
            this.f115129D = AbstractC28270d.m142428a().mo18128b(this.f115129D);
        }
        return this.f115129D;
    }

    /* renamed from: l */
    public final ZOMTextSpan m124544l() {
        return this.f115131p;
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final /* bridge */ int length() {
        return m124541i();
    }

    /* renamed from: t */
    public final C23826g1 m124545t(float f11) {
        if (C17206r.m91844b(this.f115140y, f11, 0.0d, 4, null)) {
            return this;
        }
        this.f115140y = f11;
        m124531p();
        return this;
    }

    /* renamed from: z */
    public final void m124546z() {
        int i11;
        String str = this.f115131p.text;
        AbstractC19074t.m100207e(str, "zomTextSpan.text");
        m124538x(str);
        int i12 = this.f115131p.textColor;
        if (i12 == 0) {
            i12 = AbstractC28274h.m142461a();
        }
        m124539y(i12);
        this.f115133r = AbstractC17201m.m91828t(this.f115131p.textSize);
        this.f115139x = C28273g.m142439i().m142458x(this.f115131p);
        ZOMTextSpan zOMTextSpan = this.f115131p;
        this.f115134s = zOMTextSpan.underline;
        this.f115135t = zOMTextSpan.strikeThrough;
        ZOMBackground zOMBackground = zOMTextSpan.mBackground;
        if (zOMBackground != null) {
            i11 = zOMBackground.mColor;
        } else {
            i11 = 0;
        }
        m124533r(i11);
        m124534s();
        m124545t(this.f115131p.getOpacity());
        m124537w(this, this.f115128C, 0, 2, null);
    }
}
