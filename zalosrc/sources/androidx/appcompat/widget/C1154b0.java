package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.content.res.AbstractC1401h;
import androidx.core.view.AbstractC1579n0;
import androidx.core.widget.AbstractC1640l;
import androidx.core.widget.InterfaceC1630b;
import java.lang.ref.WeakReference;
import java.util.Locale;
import p175g0.AbstractC19187j;

/* renamed from: androidx.appcompat.widget.b0 */
/* loaded from: classes.dex */
public class C1154b0 {

    /* renamed from: a */
    private final TextView f4586a;

    /* renamed from: b */
    private C1205r1 f4587b;

    /* renamed from: c */
    private C1205r1 f4588c;

    /* renamed from: d */
    private C1205r1 f4589d;

    /* renamed from: e */
    private C1205r1 f4590e;

    /* renamed from: f */
    private C1205r1 f4591f;

    /* renamed from: g */
    private C1205r1 f4592g;

    /* renamed from: h */
    private C1205r1 f4593h;

    /* renamed from: i */
    private final C1195o0 f4594i;

    /* renamed from: j */
    private int f4595j = 0;

    /* renamed from: k */
    private int f4596k = -1;

    /* renamed from: l */
    private Typeface f4597l;

    /* renamed from: m */
    private boolean f4598m;

    /* renamed from: androidx.appcompat.widget.b0$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC1401h.e {

        /* renamed from: a */
        final /* synthetic */ int f4599a;

        /* renamed from: b */
        final /* synthetic */ int f4600b;

        /* renamed from: c */
        final /* synthetic */ WeakReference f4601c;

        a(int i11, int i12, WeakReference weakReference) {
            this.f4599a = i11;
            this.f4600b = i12;
            this.f4601c = weakReference;
        }

        @Override // androidx.core.content.res.AbstractC1401h.e
        /* renamed from: h */
        public void m7098f(int i11) {
        }

        @Override // androidx.core.content.res.AbstractC1401h.e
        /* renamed from: i */
        public void m7099g(Typeface typeface) {
            int i11;
            boolean z11;
            if (Build.VERSION.SDK_INT >= 28 && (i11 = this.f4599a) != -1) {
                if ((this.f4600b & 2) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                typeface = Typeface.create(typeface, i11, z11);
            }
            C1154b0.this.m5478n(this.f4601c, typeface);
        }
    }

    public C1154b0(TextView textView) {
        this.f4586a = textView;
        this.f4594i = new C1195o0(textView);
    }

    /* renamed from: A */
    private void m5461A(int i11, float f11) {
        this.f4594i.m5650v(i11, f11);
    }

    /* renamed from: B */
    private void m5462B(Context context, C1211t1 c1211t1) {
        int i11;
        String m5731o;
        Typeface create;
        boolean z11;
        boolean z12;
        Typeface create2;
        this.f4595j = c1211t1.m5727k(AbstractC19187j.TextAppearance_android_textStyle, this.f4595j);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            int m5727k = c1211t1.m5727k(AbstractC19187j.TextAppearance_android_textFontWeight, -1);
            this.f4596k = m5727k;
            if (m5727k != -1) {
                this.f4595j &= 2;
            }
        }
        boolean z13 = true;
        if (!c1211t1.m5735s(AbstractC19187j.TextAppearance_android_fontFamily) && !c1211t1.m5735s(AbstractC19187j.TextAppearance_fontFamily)) {
            if (c1211t1.m5735s(AbstractC19187j.TextAppearance_android_typeface)) {
                this.f4598m = false;
                int m5727k2 = c1211t1.m5727k(AbstractC19187j.TextAppearance_android_typeface, 1);
                if (m5727k2 != 1) {
                    if (m5727k2 != 2) {
                        if (m5727k2 == 3) {
                            this.f4597l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f4597l = Typeface.SERIF;
                    return;
                }
                this.f4597l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f4597l = null;
        if (c1211t1.m5735s(AbstractC19187j.TextAppearance_fontFamily)) {
            i11 = AbstractC19187j.TextAppearance_fontFamily;
        } else {
            i11 = AbstractC19187j.TextAppearance_android_fontFamily;
        }
        int i13 = this.f4596k;
        int i14 = this.f4595j;
        if (!context.isRestricted()) {
            try {
                Typeface m5726j = c1211t1.m5726j(i11, this.f4595j, new a(i13, i14, new WeakReference(this.f4586a)));
                if (m5726j != null) {
                    if (i12 >= 28 && this.f4596k != -1) {
                        Typeface create3 = Typeface.create(m5726j, 0);
                        int i15 = this.f4596k;
                        if ((this.f4595j & 2) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        create2 = Typeface.create(create3, i15, z12);
                        this.f4597l = create2;
                    } else {
                        this.f4597l = m5726j;
                    }
                }
                if (this.f4597l == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f4598m = z11;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f4597l == null && (m5731o = c1211t1.m5731o(i11)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f4596k != -1) {
                Typeface create4 = Typeface.create(m5731o, 0);
                int i16 = this.f4596k;
                if ((this.f4595j & 2) == 0) {
                    z13 = false;
                }
                create = Typeface.create(create4, i16, z13);
                this.f4597l = create;
                return;
            }
            this.f4597l = Typeface.create(m5731o, this.f4595j);
        }
    }

    /* renamed from: a */
    private void m5463a(Drawable drawable, C1205r1 c1205r1) {
        if (drawable != null && c1205r1 != null) {
            C1167f.m5531i(drawable, c1205r1, this.f4586a.getDrawableState());
        }
    }

    /* renamed from: d */
    private static C1205r1 m5464d(Context context, C1167f c1167f, int i11) {
        ColorStateList m5534f = c1167f.m5534f(context, i11);
        if (m5534f != null) {
            C1205r1 c1205r1 = new C1205r1();
            c1205r1.f4718d = true;
            c1205r1.f4715a = m5534f;
            return c1205r1;
        }
        return null;
    }

    /* renamed from: x */
    private void m5465x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] compoundDrawablesRelative = this.f4586a.getCompoundDrawablesRelative();
                Drawable drawable7 = compoundDrawablesRelative[0];
                if (drawable7 == null && compoundDrawablesRelative[2] == null) {
                    Drawable[] compoundDrawables = this.f4586a.getCompoundDrawables();
                    TextView textView = this.f4586a;
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                    return;
                }
                TextView textView2 = this.f4586a;
                if (drawable2 == null) {
                    drawable2 = compoundDrawablesRelative[1];
                }
                Drawable drawable8 = compoundDrawablesRelative[2];
                if (drawable4 == null) {
                    drawable4 = compoundDrawablesRelative[3];
                }
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                return;
            }
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f4586a.getCompoundDrawablesRelative();
        TextView textView3 = this.f4586a;
        if (drawable5 == null) {
            drawable5 = compoundDrawablesRelative2[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawablesRelative2[1];
        }
        if (drawable6 == null) {
            drawable6 = compoundDrawablesRelative2[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawablesRelative2[3];
        }
        textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
    }

    /* renamed from: y */
    private void m5466y() {
        C1205r1 c1205r1 = this.f4593h;
        this.f4587b = c1205r1;
        this.f4588c = c1205r1;
        this.f4589d = c1205r1;
        this.f4590e = c1205r1;
        this.f4591f = c1205r1;
        this.f4592g = c1205r1;
    }

    /* renamed from: b */
    public void m5467b() {
        if (this.f4587b != null || this.f4588c != null || this.f4589d != null || this.f4590e != null) {
            Drawable[] compoundDrawables = this.f4586a.getCompoundDrawables();
            m5463a(compoundDrawables[0], this.f4587b);
            m5463a(compoundDrawables[1], this.f4588c);
            m5463a(compoundDrawables[2], this.f4589d);
            m5463a(compoundDrawables[3], this.f4590e);
        }
        if (this.f4591f != null || this.f4592g != null) {
            Drawable[] compoundDrawablesRelative = this.f4586a.getCompoundDrawablesRelative();
            m5463a(compoundDrawablesRelative[0], this.f4591f);
            m5463a(compoundDrawablesRelative[2], this.f4592g);
        }
    }

    /* renamed from: c */
    public void m5468c() {
        this.f4594i.m5637a();
    }

    /* renamed from: e */
    public int m5469e() {
        return this.f4594i.m5639h();
    }

    /* renamed from: f */
    public int m5470f() {
        return this.f4594i.m5640i();
    }

    /* renamed from: g */
    public int m5471g() {
        return this.f4594i.m5641j();
    }

    /* renamed from: h */
    public int[] m5472h() {
        return this.f4594i.m5642k();
    }

    /* renamed from: i */
    public int m5473i() {
        return this.f4594i.m5643l();
    }

    /* renamed from: j */
    public ColorStateList m5474j() {
        C1205r1 c1205r1 = this.f4593h;
        if (c1205r1 != null) {
            return c1205r1.f4715a;
        }
        return null;
    }

    /* renamed from: k */
    public PorterDuff.Mode m5475k() {
        C1205r1 c1205r1 = this.f4593h;
        if (c1205r1 != null) {
            return c1205r1.f4716b;
        }
        return null;
    }

    /* renamed from: l */
    public boolean m5476l() {
        return this.f4594i.m5645p();
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0118  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m5477m(AttributeSet attributeSet, int i11) {
        String str;
        String str2;
        ColorStateList colorStateList;
        boolean z11;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        boolean z12;
        int i12;
        C1167f c1167f;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int i13;
        int autoSizeStepGranularity;
        LocaleList forLanguageTags;
        Context context = this.f4586a.getContext();
        C1167f m5528b = C1167f.m5528b();
        C1211t1 m5716v = C1211t1.m5716v(context, attributeSet, AbstractC19187j.AppCompatTextHelper, i11, 0);
        TextView textView = this.f4586a;
        AbstractC1579n0.m7912y0(textView, textView.getContext(), AbstractC19187j.AppCompatTextHelper, attributeSet, m5716v.m5734r(), i11, 0);
        int m5730n = m5716v.m5730n(AbstractC19187j.AppCompatTextHelper_android_textAppearance, -1);
        if (m5716v.m5735s(AbstractC19187j.AppCompatTextHelper_android_drawableLeft)) {
            this.f4587b = m5464d(context, m5528b, m5716v.m5730n(AbstractC19187j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (m5716v.m5735s(AbstractC19187j.AppCompatTextHelper_android_drawableTop)) {
            this.f4588c = m5464d(context, m5528b, m5716v.m5730n(AbstractC19187j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (m5716v.m5735s(AbstractC19187j.AppCompatTextHelper_android_drawableRight)) {
            this.f4589d = m5464d(context, m5528b, m5716v.m5730n(AbstractC19187j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (m5716v.m5735s(AbstractC19187j.AppCompatTextHelper_android_drawableBottom)) {
            this.f4590e = m5464d(context, m5528b, m5716v.m5730n(AbstractC19187j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        int i14 = Build.VERSION.SDK_INT;
        if (m5716v.m5735s(AbstractC19187j.AppCompatTextHelper_android_drawableStart)) {
            this.f4591f = m5464d(context, m5528b, m5716v.m5730n(AbstractC19187j.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (m5716v.m5735s(AbstractC19187j.AppCompatTextHelper_android_drawableEnd)) {
            this.f4592g = m5464d(context, m5528b, m5716v.m5730n(AbstractC19187j.AppCompatTextHelper_android_drawableEnd, 0));
        }
        m5716v.m5736w();
        boolean z13 = this.f4586a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (m5730n != -1) {
            C1211t1 m5714t = C1211t1.m5714t(context, m5730n, AbstractC19187j.TextAppearance);
            if (!z13 && m5714t.m5735s(AbstractC19187j.TextAppearance_textAllCaps)) {
                z11 = m5714t.m5717a(AbstractC19187j.TextAppearance_textAllCaps, false);
                z12 = true;
            } else {
                z11 = false;
                z12 = false;
            }
            m5462B(context, m5714t);
            if (i14 < 23) {
                if (m5714t.m5735s(AbstractC19187j.TextAppearance_android_textColor)) {
                    colorStateList = m5714t.m5719c(AbstractC19187j.TextAppearance_android_textColor);
                } else {
                    colorStateList = null;
                }
                if (m5714t.m5735s(AbstractC19187j.TextAppearance_android_textColorHint)) {
                    colorStateList2 = m5714t.m5719c(AbstractC19187j.TextAppearance_android_textColorHint);
                } else {
                    colorStateList2 = null;
                }
                if (m5714t.m5735s(AbstractC19187j.TextAppearance_android_textColorLink)) {
                    colorStateList3 = m5714t.m5719c(AbstractC19187j.TextAppearance_android_textColorLink);
                    if (!m5714t.m5735s(AbstractC19187j.TextAppearance_textLocale)) {
                        str2 = m5714t.m5731o(AbstractC19187j.TextAppearance_textLocale);
                    } else {
                        str2 = null;
                    }
                    if (i14 < 26 && m5714t.m5735s(AbstractC19187j.TextAppearance_fontVariationSettings)) {
                        str = m5714t.m5731o(AbstractC19187j.TextAppearance_fontVariationSettings);
                    } else {
                        str = null;
                    }
                    m5714t.m5736w();
                }
            } else {
                colorStateList = null;
                colorStateList2 = null;
            }
            colorStateList3 = null;
            if (!m5714t.m5735s(AbstractC19187j.TextAppearance_textLocale)) {
            }
            if (i14 < 26) {
            }
            str = null;
            m5714t.m5736w();
        } else {
            str = null;
            str2 = null;
            colorStateList = null;
            z11 = false;
            colorStateList2 = null;
            colorStateList3 = null;
            z12 = false;
        }
        C1211t1 m5716v2 = C1211t1.m5716v(context, attributeSet, AbstractC19187j.TextAppearance, i11, 0);
        if (!z13 && m5716v2.m5735s(AbstractC19187j.TextAppearance_textAllCaps)) {
            z11 = m5716v2.m5717a(AbstractC19187j.TextAppearance_textAllCaps, false);
            i12 = 23;
            z12 = true;
        } else {
            i12 = 23;
        }
        if (i14 < i12) {
            if (m5716v2.m5735s(AbstractC19187j.TextAppearance_android_textColor)) {
                colorStateList = m5716v2.m5719c(AbstractC19187j.TextAppearance_android_textColor);
            }
            if (m5716v2.m5735s(AbstractC19187j.TextAppearance_android_textColorHint)) {
                colorStateList2 = m5716v2.m5719c(AbstractC19187j.TextAppearance_android_textColorHint);
            }
            if (m5716v2.m5735s(AbstractC19187j.TextAppearance_android_textColorLink)) {
                colorStateList3 = m5716v2.m5719c(AbstractC19187j.TextAppearance_android_textColorLink);
            }
        }
        if (m5716v2.m5735s(AbstractC19187j.TextAppearance_textLocale)) {
            str2 = m5716v2.m5731o(AbstractC19187j.TextAppearance_textLocale);
        }
        if (i14 >= 26 && m5716v2.m5735s(AbstractC19187j.TextAppearance_fontVariationSettings)) {
            str = m5716v2.m5731o(AbstractC19187j.TextAppearance_fontVariationSettings);
        }
        if (i14 >= 28 && m5716v2.m5735s(AbstractC19187j.TextAppearance_android_textSize)) {
            c1167f = m5528b;
            if (m5716v2.m5722f(AbstractC19187j.TextAppearance_android_textSize, -1) == 0) {
                this.f4586a.setTextSize(0, 0.0f);
            }
        } else {
            c1167f = m5528b;
        }
        m5462B(context, m5716v2);
        m5716v2.m5736w();
        if (colorStateList != null) {
            this.f4586a.setTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            this.f4586a.setHintTextColor(colorStateList2);
        }
        if (colorStateList3 != null) {
            this.f4586a.setLinkTextColor(colorStateList3);
        }
        if (!z13 && z12) {
            m5482r(z11);
        }
        Typeface typeface = this.f4597l;
        if (typeface != null) {
            if (this.f4596k == -1) {
                this.f4586a.setTypeface(typeface, this.f4595j);
            } else {
                this.f4586a.setTypeface(typeface);
            }
        }
        if (str != null) {
            this.f4586a.setFontVariationSettings(str);
        }
        if (str2 != null) {
            if (i14 >= 24) {
                TextView textView2 = this.f4586a;
                forLanguageTags = LocaleList.forLanguageTags(str2);
                textView2.setTextLocales(forLanguageTags);
            } else {
                this.f4586a.setTextLocale(Locale.forLanguageTag(str2.substring(0, str2.indexOf(44))));
            }
        }
        this.f4594i.m5646q(attributeSet, i11);
        if (InterfaceC1630b.f6665a && this.f4594i.m5643l() != 0) {
            int[] m5642k = this.f4594i.m5642k();
            if (m5642k.length > 0) {
                autoSizeStepGranularity = this.f4586a.getAutoSizeStepGranularity();
                if (autoSizeStepGranularity != -1.0f) {
                    this.f4586a.setAutoSizeTextTypeUniformWithConfiguration(this.f4594i.m5640i(), this.f4594i.m5639h(), this.f4594i.m5641j(), 0);
                } else {
                    this.f4586a.setAutoSizeTextTypeUniformWithPresetSizes(m5642k, 0);
                }
            }
        }
        C1211t1 m5715u = C1211t1.m5715u(context, attributeSet, AbstractC19187j.AppCompatTextView);
        int m5730n2 = m5715u.m5730n(AbstractC19187j.AppCompatTextView_drawableLeftCompat, -1);
        C1167f c1167f2 = c1167f;
        if (m5730n2 != -1) {
            drawable = c1167f2.m5532c(context, m5730n2);
        } else {
            drawable = null;
        }
        int m5730n3 = m5715u.m5730n(AbstractC19187j.AppCompatTextView_drawableTopCompat, -1);
        if (m5730n3 != -1) {
            drawable2 = c1167f2.m5532c(context, m5730n3);
        } else {
            drawable2 = null;
        }
        int m5730n4 = m5715u.m5730n(AbstractC19187j.AppCompatTextView_drawableRightCompat, -1);
        if (m5730n4 != -1) {
            drawable3 = c1167f2.m5532c(context, m5730n4);
        } else {
            drawable3 = null;
        }
        int m5730n5 = m5715u.m5730n(AbstractC19187j.AppCompatTextView_drawableBottomCompat, -1);
        if (m5730n5 != -1) {
            drawable4 = c1167f2.m5532c(context, m5730n5);
        } else {
            drawable4 = null;
        }
        int m5730n6 = m5715u.m5730n(AbstractC19187j.AppCompatTextView_drawableStartCompat, -1);
        if (m5730n6 != -1) {
            drawable5 = c1167f2.m5532c(context, m5730n6);
        } else {
            drawable5 = null;
        }
        int m5730n7 = m5715u.m5730n(AbstractC19187j.AppCompatTextView_drawableEndCompat, -1);
        if (m5730n7 != -1) {
            drawable6 = c1167f2.m5532c(context, m5730n7);
        } else {
            drawable6 = null;
        }
        m5465x(drawable, drawable2, drawable3, drawable4, drawable5, drawable6);
        if (m5715u.m5735s(AbstractC19187j.AppCompatTextView_drawableTint)) {
            AbstractC1640l.m8417h(this.f4586a, m5715u.m5719c(AbstractC19187j.AppCompatTextView_drawableTint));
        }
        if (m5715u.m5735s(AbstractC19187j.AppCompatTextView_drawableTintMode)) {
            i13 = -1;
            AbstractC1640l.m8418i(this.f4586a, AbstractC1225y0.m5773e(m5715u.m5727k(AbstractC19187j.AppCompatTextView_drawableTintMode, -1), null));
        } else {
            i13 = -1;
        }
        int m5722f = m5715u.m5722f(AbstractC19187j.AppCompatTextView_firstBaselineToTopHeight, i13);
        int m5722f2 = m5715u.m5722f(AbstractC19187j.AppCompatTextView_lastBaselineToBottomHeight, i13);
        int m5722f3 = m5715u.m5722f(AbstractC19187j.AppCompatTextView_lineHeight, i13);
        m5715u.m5736w();
        if (m5722f != i13) {
            AbstractC1640l.m8420k(this.f4586a, m5722f);
        }
        if (m5722f2 != i13) {
            AbstractC1640l.m8421l(this.f4586a, m5722f2);
        }
        if (m5722f3 != i13) {
            AbstractC1640l.m8422m(this.f4586a, m5722f3);
        }
    }

    /* renamed from: n */
    void m5478n(WeakReference weakReference, Typeface typeface) {
        if (this.f4598m) {
            this.f4597l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f4595j);
            }
        }
    }

    /* renamed from: o */
    public void m5479o(boolean z11, int i11, int i12, int i13, int i14) {
        if (!InterfaceC1630b.f6665a) {
            m5468c();
        }
    }

    /* renamed from: p */
    public void m5480p() {
        m5467b();
    }

    /* renamed from: q */
    public void m5481q(Context context, int i11) {
        String m5731o;
        ColorStateList m5719c;
        C1211t1 m5714t = C1211t1.m5714t(context, i11, AbstractC19187j.TextAppearance);
        if (m5714t.m5735s(AbstractC19187j.TextAppearance_textAllCaps)) {
            m5482r(m5714t.m5717a(AbstractC19187j.TextAppearance_textAllCaps, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 23 && m5714t.m5735s(AbstractC19187j.TextAppearance_android_textColor) && (m5719c = m5714t.m5719c(AbstractC19187j.TextAppearance_android_textColor)) != null) {
            this.f4586a.setTextColor(m5719c);
        }
        if (m5714t.m5735s(AbstractC19187j.TextAppearance_android_textSize) && m5714t.m5722f(AbstractC19187j.TextAppearance_android_textSize, -1) == 0) {
            this.f4586a.setTextSize(0, 0.0f);
        }
        m5462B(context, m5714t);
        if (i12 >= 26 && m5714t.m5735s(AbstractC19187j.TextAppearance_fontVariationSettings) && (m5731o = m5714t.m5731o(AbstractC19187j.TextAppearance_fontVariationSettings)) != null) {
            this.f4586a.setFontVariationSettings(m5731o);
        }
        m5714t.m5736w();
        Typeface typeface = this.f4597l;
        if (typeface != null) {
            this.f4586a.setTypeface(typeface, this.f4595j);
        }
    }

    /* renamed from: r */
    public void m5482r(boolean z11) {
        this.f4586a.setAllCaps(z11);
    }

    /* renamed from: s */
    public void m5483s(int i11, int i12, int i13, int i14) {
        this.f4594i.m5647r(i11, i12, i13, i14);
    }

    /* renamed from: t */
    public void m5484t(int[] iArr, int i11) {
        this.f4594i.m5648s(iArr, i11);
    }

    /* renamed from: u */
    public void m5485u(int i11) {
        this.f4594i.m5649t(i11);
    }

    /* renamed from: v */
    public void m5486v(ColorStateList colorStateList) {
        boolean z11;
        if (this.f4593h == null) {
            this.f4593h = new C1205r1();
        }
        C1205r1 c1205r1 = this.f4593h;
        c1205r1.f4715a = colorStateList;
        if (colorStateList != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        c1205r1.f4718d = z11;
        m5466y();
    }

    /* renamed from: w */
    public void m5487w(PorterDuff.Mode mode) {
        boolean z11;
        if (this.f4593h == null) {
            this.f4593h = new C1205r1();
        }
        C1205r1 c1205r1 = this.f4593h;
        c1205r1.f4716b = mode;
        if (mode != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        c1205r1.f4717c = z11;
        m5466y();
    }

    /* renamed from: z */
    public void m5488z(int i11, float f11) {
        if (!InterfaceC1630b.f6665a && !m5476l()) {
            m5461A(i11, f11);
        }
    }
}
