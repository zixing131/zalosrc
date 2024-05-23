package xj0;

import android.graphics.Typeface;
import com.zing.zalo.zinstant.utils.AbstractC17201m;
import com.zing.zalo.zinstant.zom.node.ZOMText;
import com.zing.zalo.zinstant.zom.properties.ZOMInputText;
import com.zing.zalo.zinstant.zom.text.ZOMTextSpan;
import fn0.AbstractC19074t;
import ln0.AbstractC22543l;
import pm0.C24848g0;
import qm0.AbstractC25358n;
import vj0.AbstractC28274h;
import vj0.C28273g;

/* renamed from: xj0.c */
/* loaded from: classes7.dex */
public final class C29684c {

    /* renamed from: a */
    private Typeface f137119a;

    /* renamed from: b */
    private String f137120b;

    /* renamed from: c */
    private String f137121c;

    /* renamed from: d */
    private int f137122d;

    /* renamed from: e */
    private int f137123e;

    /* renamed from: f */
    private float f137124f;

    /* renamed from: g */
    private float f137125g;

    /* renamed from: h */
    private float f137126h;

    /* renamed from: i */
    private float f137127i;

    /* renamed from: j */
    private int f137128j;

    /* renamed from: k */
    private int f137129k;

    /* renamed from: l */
    private boolean f137130l;

    /* renamed from: m */
    private boolean f137131m;

    /* renamed from: n */
    private String f137132n;

    /* renamed from: o */
    private boolean f137133o;

    /* renamed from: p */
    private int f137134p;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C29684c(ZOMInputText zOMInputText) {
        int m142461a;
        ZOMText zOMText;
        int m142462b;
        ZOMTextSpan[] zOMTextSpanArr;
        Object m131357E;
        ZOMTextSpan zOMTextSpan;
        Object m131357E2;
        AbstractC19074t.m100208f(zOMInputText, "zomInputText");
        Typeface typeface = Typeface.DEFAULT;
        AbstractC19074t.m100207e(typeface, "DEFAULT");
        this.f137119a = typeface;
        this.f137120b = "";
        this.f137121c = "";
        this.f137123e = 1;
        this.f137127i = AbstractC17201m.m91829u(14.0f);
        ZOMTextSpan[] zOMTextSpanArr2 = zOMInputText.value.mParagraph;
        if (zOMTextSpanArr2 != null) {
            m131357E2 = AbstractC25358n.m131357E(zOMTextSpanArr2);
            ZOMTextSpan zOMTextSpan2 = (ZOMTextSpan) m131357E2;
            if (zOMTextSpan2 != null) {
                m142461a = zOMTextSpan2.textColor;
                this.f137128j = m142461a;
                zOMText = zOMInputText.holder;
                if (zOMText != null && (zOMTextSpanArr = zOMText.mParagraph) != null) {
                    m131357E = AbstractC25358n.m131357E(zOMTextSpanArr);
                    zOMTextSpan = (ZOMTextSpan) m131357E;
                    if (zOMTextSpan != null) {
                        m142462b = zOMTextSpan.textColor;
                        this.f137129k = m142462b;
                        this.f137132n = zOMInputText.mask;
                        this.f137133o = zOMInputText.isAutoComplete;
                        this.f137134p = zOMInputText.maxLength;
                        m147622n(zOMInputText);
                    }
                }
                m142462b = AbstractC28274h.m142462b();
                this.f137129k = m142462b;
                this.f137132n = zOMInputText.mask;
                this.f137133o = zOMInputText.isAutoComplete;
                this.f137134p = zOMInputText.maxLength;
                m147622n(zOMInputText);
            }
        }
        m142461a = AbstractC28274h.m142461a();
        this.f137128j = m142461a;
        zOMText = zOMInputText.holder;
        if (zOMText != null) {
            m131357E = AbstractC25358n.m131357E(zOMTextSpanArr);
            zOMTextSpan = (ZOMTextSpan) m131357E;
            if (zOMTextSpan != null) {
            }
        }
        m142462b = AbstractC28274h.m142462b();
        this.f137129k = m142462b;
        this.f137132n = zOMInputText.mask;
        this.f137133o = zOMInputText.isAutoComplete;
        this.f137134p = zOMInputText.maxLength;
        m147622n(zOMInputText);
    }

    /* renamed from: n */
    private final void m147622n(ZOMInputText zOMInputText) {
        int m116580c;
        Object m131357E;
        Object m131357E2;
        ZOMText zOMText = zOMInputText.value;
        AbstractC19074t.m100207e(zOMText, "zomInputText.value");
        String plainText = zOMText.getPlainText();
        if (plainText == null) {
            plainText = "";
        }
        this.f137120b = plainText;
        this.f137122d = zOMText.mTextAlignment;
        m116580c = AbstractC22543l.m116580c(zOMText.mMaxLines, 1);
        this.f137123e = m116580c;
        this.f137124f = zOMText.mTextSpacingAdd;
        this.f137125g = zOMText.mTextSpacingMult;
        this.f137126h = zOMText.mTextLetterSpacing;
        ZOMTextSpan[] zOMTextSpanArr = zOMText.mParagraph;
        if (zOMTextSpanArr != null) {
            m131357E2 = AbstractC25358n.m131357E(zOMTextSpanArr);
            ZOMTextSpan zOMTextSpan = (ZOMTextSpan) m131357E2;
            if (zOMTextSpan != null) {
                this.f137127i = AbstractC17201m.m91828t(zOMTextSpan.textSize);
                int i11 = zOMTextSpan.textColor;
                if (i11 == 0) {
                    i11 = AbstractC28274h.m142461a();
                }
                this.f137128j = i11;
                this.f137130l = zOMTextSpan.underline;
                this.f137131m = zOMTextSpan.strikeThrough;
                Typeface m142458x = C28273g.m142439i().m142458x(zOMTextSpan);
                AbstractC19074t.m100207e(m142458x, "getInstance().requestTypeFace(this)");
                this.f137119a = m142458x;
            }
        }
        ZOMText zOMText2 = zOMInputText.holder;
        C24848g0 c24848g0 = null;
        if (zOMText2 != null) {
            String plainText2 = zOMText2.getPlainText();
            if (plainText2 == null) {
                plainText2 = "";
            } else {
                AbstractC19074t.m100207e(plainText2, "it.plainText ?: \"\"");
            }
            this.f137121c = plainText2;
            ZOMTextSpan[] zOMTextSpanArr2 = zOMText2.mParagraph;
            if (zOMTextSpanArr2 != null) {
                AbstractC19074t.m100207e(zOMTextSpanArr2, "mParagraph");
                m131357E = AbstractC25358n.m131357E(zOMTextSpanArr2);
                ZOMTextSpan zOMTextSpan2 = (ZOMTextSpan) m131357E;
                if (zOMTextSpan2 != null) {
                    this.f137129k = zOMTextSpan2.textColor;
                    c24848g0 = C24848g0.f119245a;
                }
            }
            if (c24848g0 == null) {
                this.f137129k = AbstractC28274h.m142462b();
            }
            c24848g0 = C24848g0.f119245a;
        }
        if (c24848g0 == null) {
            this.f137121c = "";
        }
        this.f137132n = zOMInputText.mask;
        this.f137133o = zOMInputText.isAutoComplete;
        this.f137134p = zOMInputText.maxLength;
    }

    /* renamed from: a */
    public final int m147623a() {
        return this.f137122d;
    }

    /* renamed from: b */
    public final String m147624b() {
        return this.f137121c;
    }

    /* renamed from: c */
    public final float m147625c() {
        return this.f137126h;
    }

    /* renamed from: d */
    public final String m147626d() {
        return this.f137132n;
    }

    /* renamed from: e */
    public final int m147627e() {
        return this.f137134p;
    }

    /* renamed from: f */
    public final int m147628f() {
        return this.f137123e;
    }

    /* renamed from: g */
    public final float m147629g() {
        return this.f137124f;
    }

    /* renamed from: h */
    public final float m147630h() {
        return this.f137125g;
    }

    /* renamed from: i */
    public final int m147631i() {
        return this.f137128j;
    }

    /* renamed from: j */
    public final int m147632j() {
        return this.f137129k;
    }

    /* renamed from: k */
    public final float m147633k() {
        return this.f137127i;
    }

    /* renamed from: l */
    public final Typeface m147634l() {
        return this.f137119a;
    }

    /* renamed from: m */
    public final String m147635m() {
        return this.f137120b;
    }

    /* renamed from: o */
    public final boolean m147636o() {
        return this.f137131m;
    }

    /* renamed from: p */
    public final boolean m147637p() {
        return this.f137130l;
    }

    /* renamed from: q */
    public final void m147638q(ZOMInputText zOMInputText) {
        AbstractC19074t.m100208f(zOMInputText, "zomInputText");
        m147622n(zOMInputText);
    }
}
