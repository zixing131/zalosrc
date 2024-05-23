package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.view.AbstractC1579n0;
import com.google.android.material.internal.AbstractC6359z;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23587l;
import p439q6.AbstractC25136a;
import p599w6.AbstractC28774c;
import p634x6.AbstractC29387b;
import p634x6.C29386a;
import p706z6.C31689h;
import p706z6.C31694m;
import p706z6.InterfaceC31697p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.button.a */
/* loaded from: classes3.dex */
public class C6272a {

    /* renamed from: t */
    private static final boolean f35063t = true;

    /* renamed from: a */
    private final MaterialButton f35064a;

    /* renamed from: b */
    private C31694m f35065b;

    /* renamed from: c */
    private int f35066c;

    /* renamed from: d */
    private int f35067d;

    /* renamed from: e */
    private int f35068e;

    /* renamed from: f */
    private int f35069f;

    /* renamed from: g */
    private int f35070g;

    /* renamed from: h */
    private int f35071h;

    /* renamed from: i */
    private PorterDuff.Mode f35072i;

    /* renamed from: j */
    private ColorStateList f35073j;

    /* renamed from: k */
    private ColorStateList f35074k;

    /* renamed from: l */
    private ColorStateList f35075l;

    /* renamed from: m */
    private Drawable f35076m;

    /* renamed from: n */
    private boolean f35077n = false;

    /* renamed from: o */
    private boolean f35078o = false;

    /* renamed from: p */
    private boolean f35079p = false;

    /* renamed from: q */
    private boolean f35080q;

    /* renamed from: r */
    private LayerDrawable f35081r;

    /* renamed from: s */
    private int f35082s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6272a(MaterialButton materialButton, C31694m c31694m) {
        this.f35064a = materialButton;
        this.f35065b = c31694m;
    }

    /* renamed from: E */
    private void m31930E(int i11, int i12) {
        int m7820K = AbstractC1579n0.m7820K(this.f35064a);
        int paddingTop = this.f35064a.getPaddingTop();
        int m7818J = AbstractC1579n0.m7818J(this.f35064a);
        int paddingBottom = this.f35064a.getPaddingBottom();
        int i13 = this.f35068e;
        int i14 = this.f35069f;
        this.f35069f = i12;
        this.f35068e = i11;
        if (!this.f35078o) {
            m31931F();
        }
        AbstractC1579n0.m7837S0(this.f35064a, m7820K, (paddingTop + i11) - i13, m7818J, (paddingBottom + i12) - i14);
    }

    /* renamed from: F */
    private void m31931F() {
        this.f35064a.setInternalBackground(m31935a());
        C31689h m31947f = m31947f();
        if (m31947f != null) {
            m31947f.m152441b0(this.f35082s);
        }
    }

    /* renamed from: G */
    private void m31932G(C31694m c31694m) {
        if (m31947f() != null) {
            m31947f().setShapeAppearanceModel(c31694m);
        }
        if (m31937n() != null) {
            m31937n().setShapeAppearanceModel(c31694m);
        }
        if (m31946e() != null) {
            m31946e().setShapeAppearanceModel(c31694m);
        }
    }

    /* renamed from: I */
    private void m31933I() {
        int i11;
        C31689h m31947f = m31947f();
        C31689h m31937n = m31937n();
        if (m31947f != null) {
            m31947f.m152453l0(this.f35071h, this.f35074k);
            if (m31937n != null) {
                float f11 = this.f35071h;
                if (this.f35077n) {
                    i11 = AbstractC25136a.m130294d(this.f35064a, AbstractC23577b.colorSurface);
                } else {
                    i11 = 0;
                }
                m31937n.m152451k0(f11, i11);
            }
        }
    }

    /* renamed from: J */
    private InsetDrawable m31934J(Drawable drawable) {
        return new InsetDrawable(drawable, this.f35066c, this.f35068e, this.f35067d, this.f35069f);
    }

    /* renamed from: a */
    private Drawable m31935a() {
        int i11;
        C31689h c31689h = new C31689h(this.f35065b);
        c31689h.m152435R(this.f35064a.getContext());
        AbstractC1414a.m7197o(c31689h, this.f35073j);
        PorterDuff.Mode mode = this.f35072i;
        if (mode != null) {
            AbstractC1414a.m7198p(c31689h, mode);
        }
        c31689h.m152453l0(this.f35071h, this.f35074k);
        C31689h c31689h2 = new C31689h(this.f35065b);
        c31689h2.setTint(0);
        float f11 = this.f35071h;
        if (this.f35077n) {
            i11 = AbstractC25136a.m130294d(this.f35064a, AbstractC23577b.colorSurface);
        } else {
            i11 = 0;
        }
        c31689h2.m152451k0(f11, i11);
        if (f35063t) {
            C31689h c31689h3 = new C31689h(this.f35065b);
            this.f35076m = c31689h3;
            AbstractC1414a.m7196n(c31689h3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(AbstractC29387b.m146554d(this.f35075l), m31934J(new LayerDrawable(new Drawable[]{c31689h2, c31689h})), this.f35076m);
            this.f35081r = rippleDrawable;
            return rippleDrawable;
        }
        C29386a c29386a = new C29386a(this.f35065b);
        this.f35076m = c29386a;
        AbstractC1414a.m7197o(c29386a, AbstractC29387b.m146554d(this.f35075l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c31689h2, c31689h, this.f35076m});
        this.f35081r = layerDrawable;
        return m31934J(layerDrawable);
    }

    /* renamed from: g */
    private C31689h m31936g(boolean z11) {
        LayerDrawable layerDrawable = this.f35081r;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 0) {
            if (f35063t) {
                return (C31689h) ((LayerDrawable) ((InsetDrawable) this.f35081r.getDrawable(0)).getDrawable()).getDrawable(!z11 ? 1 : 0);
            }
            return (C31689h) this.f35081r.getDrawable(!z11 ? 1 : 0);
        }
        return null;
    }

    /* renamed from: n */
    private C31689h m31937n() {
        return m31936g(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void m31938A(ColorStateList colorStateList) {
        if (this.f35074k != colorStateList) {
            this.f35074k = colorStateList;
            m31933I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m31939B(int i11) {
        if (this.f35071h != i11) {
            this.f35071h = i11;
            m31933I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public void m31940C(ColorStateList colorStateList) {
        if (this.f35073j != colorStateList) {
            this.f35073j = colorStateList;
            if (m31947f() != null) {
                AbstractC1414a.m7197o(m31947f(), this.f35073j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public void m31941D(PorterDuff.Mode mode) {
        if (this.f35072i != mode) {
            this.f35072i = mode;
            if (m31947f() != null && this.f35072i != null) {
                AbstractC1414a.m7198p(m31947f(), this.f35072i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public void m31942H(int i11, int i12) {
        Drawable drawable = this.f35076m;
        if (drawable != null) {
            drawable.setBounds(this.f35066c, this.f35068e, i12 - this.f35067d, i11 - this.f35069f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m31943b() {
        return this.f35070g;
    }

    /* renamed from: c */
    public int m31944c() {
        return this.f35069f;
    }

    /* renamed from: d */
    public int m31945d() {
        return this.f35068e;
    }

    /* renamed from: e */
    public InterfaceC31697p m31946e() {
        LayerDrawable layerDrawable = this.f35081r;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 1) {
            if (this.f35081r.getNumberOfLayers() > 2) {
                return (InterfaceC31697p) this.f35081r.getDrawable(2);
            }
            return (InterfaceC31697p) this.f35081r.getDrawable(1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C31689h m31947f() {
        return m31936g(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public ColorStateList m31948h() {
        return this.f35075l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C31694m m31949i() {
        return this.f35065b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList m31950j() {
        return this.f35074k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m31951k() {
        return this.f35071h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public ColorStateList m31952l() {
        return this.f35073j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public PorterDuff.Mode m31953m() {
        return this.f35072i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean m31954o() {
        return this.f35078o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean m31955p() {
        return this.f35080q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m31956q(TypedArray typedArray) {
        this.f35066c = typedArray.getDimensionPixelOffset(AbstractC23587l.MaterialButton_android_insetLeft, 0);
        this.f35067d = typedArray.getDimensionPixelOffset(AbstractC23587l.MaterialButton_android_insetRight, 0);
        this.f35068e = typedArray.getDimensionPixelOffset(AbstractC23587l.MaterialButton_android_insetTop, 0);
        this.f35069f = typedArray.getDimensionPixelOffset(AbstractC23587l.MaterialButton_android_insetBottom, 0);
        if (typedArray.hasValue(AbstractC23587l.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(AbstractC23587l.MaterialButton_cornerRadius, -1);
            this.f35070g = dimensionPixelSize;
            m31964y(this.f35065b.m152493w(dimensionPixelSize));
            this.f35079p = true;
        }
        this.f35071h = typedArray.getDimensionPixelSize(AbstractC23587l.MaterialButton_strokeWidth, 0);
        this.f35072i = AbstractC6359z.m32654i(typedArray.getInt(AbstractC23587l.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f35073j = AbstractC28774c.m143973a(this.f35064a.getContext(), typedArray, AbstractC23587l.MaterialButton_backgroundTint);
        this.f35074k = AbstractC28774c.m143973a(this.f35064a.getContext(), typedArray, AbstractC23587l.MaterialButton_strokeColor);
        this.f35075l = AbstractC28774c.m143973a(this.f35064a.getContext(), typedArray, AbstractC23587l.MaterialButton_rippleColor);
        this.f35080q = typedArray.getBoolean(AbstractC23587l.MaterialButton_android_checkable, false);
        this.f35082s = typedArray.getDimensionPixelSize(AbstractC23587l.MaterialButton_elevation, 0);
        int m7820K = AbstractC1579n0.m7820K(this.f35064a);
        int paddingTop = this.f35064a.getPaddingTop();
        int m7818J = AbstractC1579n0.m7818J(this.f35064a);
        int paddingBottom = this.f35064a.getPaddingBottom();
        if (typedArray.hasValue(AbstractC23587l.MaterialButton_android_background)) {
            m31958s();
        } else {
            m31931F();
        }
        AbstractC1579n0.m7837S0(this.f35064a, m7820K + this.f35066c, paddingTop + this.f35068e, m7818J + this.f35067d, paddingBottom + this.f35069f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m31957r(int i11) {
        if (m31947f() != null) {
            m31947f().setTint(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m31958s() {
        this.f35078o = true;
        this.f35064a.setSupportBackgroundTintList(this.f35073j);
        this.f35064a.setSupportBackgroundTintMode(this.f35072i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m31959t(boolean z11) {
        this.f35080q = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m31960u(int i11) {
        if (!this.f35079p || this.f35070g != i11) {
            this.f35070g = i11;
            this.f35079p = true;
            m31964y(this.f35065b.m152493w(i11));
        }
    }

    /* renamed from: v */
    public void m31961v(int i11) {
        m31930E(this.f35068e, i11);
    }

    /* renamed from: w */
    public void m31962w(int i11) {
        m31930E(i11, this.f35069f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m31963x(ColorStateList colorStateList) {
        if (this.f35075l != colorStateList) {
            this.f35075l = colorStateList;
            boolean z11 = f35063t;
            if (z11 && (this.f35064a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f35064a.getBackground()).setColor(AbstractC29387b.m146554d(colorStateList));
            } else if (!z11 && (this.f35064a.getBackground() instanceof C29386a)) {
                ((C29386a) this.f35064a.getBackground()).setTintList(AbstractC29387b.m146554d(colorStateList));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m31964y(C31694m c31694m) {
        this.f35065b = c31694m;
        m31932G(c31694m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m31965z(boolean z11) {
        this.f35077n = z11;
        m31933I();
    }
}
