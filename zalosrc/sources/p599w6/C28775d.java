package p599w6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.core.content.res.AbstractC1401h;
import p357n6.AbstractC23587l;

/* renamed from: w6.d */
/* loaded from: classes3.dex */
public class C28775d {

    /* renamed from: a */
    public final ColorStateList f133362a;

    /* renamed from: b */
    public final ColorStateList f133363b;

    /* renamed from: c */
    public final ColorStateList f133364c;

    /* renamed from: d */
    public final ColorStateList f133365d;

    /* renamed from: e */
    public final String f133366e;

    /* renamed from: f */
    public final int f133367f;

    /* renamed from: g */
    public final int f133368g;

    /* renamed from: h */
    public final boolean f133369h;

    /* renamed from: i */
    public final float f133370i;

    /* renamed from: j */
    public final float f133371j;

    /* renamed from: k */
    public final float f133372k;

    /* renamed from: l */
    public final boolean f133373l;

    /* renamed from: m */
    public final float f133374m;

    /* renamed from: n */
    public float f133375n;

    /* renamed from: o */
    private final int f133376o;

    /* renamed from: p */
    private boolean f133377p = false;

    /* renamed from: q */
    private Typeface f133378q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w6.d$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC1401h.e {

        /* renamed from: a */
        final /* synthetic */ AbstractC28777f f133379a;

        a(AbstractC28777f abstractC28777f) {
            this.f133379a = abstractC28777f;
        }

        @Override // androidx.core.content.res.AbstractC1401h.e
        /* renamed from: h */
        public void m7098f(int i11) {
            C28775d.this.f133377p = true;
            this.f133379a.mo32057a(i11);
        }

        @Override // androidx.core.content.res.AbstractC1401h.e
        /* renamed from: i */
        public void m7099g(Typeface typeface) {
            C28775d c28775d = C28775d.this;
            c28775d.f133378q = Typeface.create(typeface, c28775d.f133367f);
            C28775d.this.f133377p = true;
            this.f133379a.mo32058b(C28775d.this.f133378q, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w6.d$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC28777f {

        /* renamed from: a */
        final /* synthetic */ TextPaint f133381a;

        /* renamed from: b */
        final /* synthetic */ AbstractC28777f f133382b;

        b(TextPaint textPaint, AbstractC28777f abstractC28777f) {
            this.f133381a = textPaint;
            this.f133382b = abstractC28777f;
        }

        @Override // p599w6.AbstractC28777f
        /* renamed from: a */
        public void mo32057a(int i11) {
            this.f133382b.mo32057a(i11);
        }

        @Override // p599w6.AbstractC28777f
        /* renamed from: b */
        public void mo32058b(Typeface typeface, boolean z11) {
            C28775d.this.m143992l(this.f133381a, typeface);
            this.f133382b.mo32058b(typeface, z11);
        }
    }

    public C28775d(Context context, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, AbstractC23587l.TextAppearance);
        this.f133375n = obtainStyledAttributes.getDimension(AbstractC23587l.TextAppearance_android_textSize, 0.0f);
        this.f133362a = AbstractC28774c.m143973a(context, obtainStyledAttributes, AbstractC23587l.TextAppearance_android_textColor);
        this.f133363b = AbstractC28774c.m143973a(context, obtainStyledAttributes, AbstractC23587l.TextAppearance_android_textColorHint);
        this.f133364c = AbstractC28774c.m143973a(context, obtainStyledAttributes, AbstractC23587l.TextAppearance_android_textColorLink);
        this.f133367f = obtainStyledAttributes.getInt(AbstractC23587l.TextAppearance_android_textStyle, 0);
        this.f133368g = obtainStyledAttributes.getInt(AbstractC23587l.TextAppearance_android_typeface, 1);
        int m143977e = AbstractC28774c.m143977e(obtainStyledAttributes, AbstractC23587l.TextAppearance_fontFamily, AbstractC23587l.TextAppearance_android_fontFamily);
        this.f133376o = obtainStyledAttributes.getResourceId(m143977e, 0);
        this.f133366e = obtainStyledAttributes.getString(m143977e);
        this.f133369h = obtainStyledAttributes.getBoolean(AbstractC23587l.TextAppearance_textAllCaps, false);
        this.f133365d = AbstractC28774c.m143973a(context, obtainStyledAttributes, AbstractC23587l.TextAppearance_android_shadowColor);
        this.f133370i = obtainStyledAttributes.getFloat(AbstractC23587l.TextAppearance_android_shadowDx, 0.0f);
        this.f133371j = obtainStyledAttributes.getFloat(AbstractC23587l.TextAppearance_android_shadowDy, 0.0f);
        this.f133372k = obtainStyledAttributes.getFloat(AbstractC23587l.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i11, AbstractC23587l.MaterialTextAppearance);
        this.f133373l = obtainStyledAttributes2.hasValue(AbstractC23587l.MaterialTextAppearance_android_letterSpacing);
        this.f133374m = obtainStyledAttributes2.getFloat(AbstractC23587l.MaterialTextAppearance_android_letterSpacing, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: d */
    private void m143984d() {
        String str;
        if (this.f133378q == null && (str = this.f133366e) != null) {
            this.f133378q = Typeface.create(str, this.f133367f);
        }
        if (this.f133378q == null) {
            int i11 = this.f133368g;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        this.f133378q = Typeface.DEFAULT;
                    } else {
                        this.f133378q = Typeface.MONOSPACE;
                    }
                } else {
                    this.f133378q = Typeface.SERIF;
                }
            } else {
                this.f133378q = Typeface.SANS_SERIF;
            }
            this.f133378q = Typeface.create(this.f133378q, this.f133367f);
        }
    }

    /* renamed from: i */
    private boolean m143985i(Context context) {
        Typeface typeface;
        if (AbstractC28776e.m143993a()) {
            return true;
        }
        int i11 = this.f133376o;
        if (i11 != 0) {
            typeface = AbstractC1401h.m7079c(context, i11);
        } else {
            typeface = null;
        }
        if (typeface != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public Typeface m143986e() {
        m143984d();
        return this.f133378q;
    }

    /* renamed from: f */
    public Typeface m143987f(Context context) {
        if (this.f133377p) {
            return this.f133378q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface m7083g = AbstractC1401h.m7083g(context, this.f133376o);
                this.f133378q = m7083g;
                if (m7083g != null) {
                    this.f133378q = Typeface.create(m7083g, this.f133367f);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception unused2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error loading font ");
                sb2.append(this.f133366e);
            }
        }
        m143984d();
        this.f133377p = true;
        return this.f133378q;
    }

    /* renamed from: g */
    public void m143988g(Context context, TextPaint textPaint, AbstractC28777f abstractC28777f) {
        m143992l(textPaint, m143986e());
        m143989h(context, new b(textPaint, abstractC28777f));
    }

    /* renamed from: h */
    public void m143989h(Context context, AbstractC28777f abstractC28777f) {
        if (m143985i(context)) {
            m143987f(context);
        } else {
            m143984d();
        }
        int i11 = this.f133376o;
        if (i11 == 0) {
            this.f133377p = true;
        }
        if (this.f133377p) {
            abstractC28777f.mo32058b(this.f133378q, true);
            return;
        }
        try {
            AbstractC1401h.m7085i(context, i11, new a(abstractC28777f), null);
        } catch (Resources.NotFoundException unused) {
            this.f133377p = true;
            abstractC28777f.mo32057a(1);
        } catch (Exception unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error loading font ");
            sb2.append(this.f133366e);
            this.f133377p = true;
            abstractC28777f.mo32057a(-3);
        }
    }

    /* renamed from: j */
    public void m143990j(Context context, TextPaint textPaint, AbstractC28777f abstractC28777f) {
        int i11;
        int i12;
        m143991k(context, textPaint, abstractC28777f);
        ColorStateList colorStateList = this.f133362a;
        if (colorStateList != null) {
            i11 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i11 = -16777216;
        }
        textPaint.setColor(i11);
        float f11 = this.f133372k;
        float f12 = this.f133370i;
        float f13 = this.f133371j;
        ColorStateList colorStateList2 = this.f133365d;
        if (colorStateList2 != null) {
            i12 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i12 = 0;
        }
        textPaint.setShadowLayer(f11, f12, f13, i12);
    }

    /* renamed from: k */
    public void m143991k(Context context, TextPaint textPaint, AbstractC28777f abstractC28777f) {
        if (m143985i(context)) {
            m143992l(textPaint, m143987f(context));
        } else {
            m143988g(context, textPaint, abstractC28777f);
        }
    }

    /* renamed from: l */
    public void m143992l(TextPaint textPaint, Typeface typeface) {
        boolean z11;
        float f11;
        textPaint.setTypeface(typeface);
        int i11 = (~typeface.getStyle()) & this.f133367f;
        if ((i11 & 1) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        textPaint.setFakeBoldText(z11);
        if ((i11 & 2) != 0) {
            f11 = -0.25f;
        } else {
            f11 = 0.0f;
        }
        textPaint.setTextSkewX(f11);
        textPaint.setTextSize(this.f133375n);
        if (this.f133373l) {
            textPaint.setLetterSpacing(this.f133374m);
        }
    }
}
