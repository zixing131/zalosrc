package com.google.android.material.card;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.view.AbstractC1579n0;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23581f;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;
import p439q6.AbstractC25136a;
import p599w6.AbstractC28774c;
import p634x6.AbstractC29387b;
import p706z6.AbstractC31685d;
import p706z6.C31686e;
import p706z6.C31689h;
import p706z6.C31693l;
import p706z6.C31694m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.card.b */
/* loaded from: classes3.dex */
public class C6275b {

    /* renamed from: t */
    private static final int[] f35091t = {R.attr.state_checked};

    /* renamed from: u */
    private static final double f35092u = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    private final MaterialCardView f35093a;

    /* renamed from: c */
    private final C31689h f35095c;

    /* renamed from: d */
    private final C31689h f35096d;

    /* renamed from: e */
    private int f35097e;

    /* renamed from: f */
    private int f35098f;

    /* renamed from: g */
    private int f35099g;

    /* renamed from: h */
    private Drawable f35100h;

    /* renamed from: i */
    private Drawable f35101i;

    /* renamed from: j */
    private ColorStateList f35102j;

    /* renamed from: k */
    private ColorStateList f35103k;

    /* renamed from: l */
    private C31694m f35104l;

    /* renamed from: m */
    private ColorStateList f35105m;

    /* renamed from: n */
    private Drawable f35106n;

    /* renamed from: o */
    private LayerDrawable f35107o;

    /* renamed from: p */
    private C31689h f35108p;

    /* renamed from: q */
    private C31689h f35109q;

    /* renamed from: s */
    private boolean f35111s;

    /* renamed from: b */
    private final Rect f35094b = new Rect();

    /* renamed from: r */
    private boolean f35110r = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.card.b$a */
    /* loaded from: classes3.dex */
    public class a extends InsetDrawable {
        a(Drawable drawable, int i11, int i12, int i13, int i14) {
            super(drawable, i11, i12, i13, i14);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    public C6275b(MaterialCardView materialCardView, AttributeSet attributeSet, int i11, int i12) {
        this.f35093a = materialCardView;
        C31689h c31689h = new C31689h(materialCardView.getContext(), attributeSet, i11, i12);
        this.f35095c = c31689h;
        c31689h.m152435R(materialCardView.getContext());
        c31689h.m152449i0(-12303292);
        C31694m.b m152492v = c31689h.m152427F().m152492v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, AbstractC23587l.CardView, i11, AbstractC23586k.CardView);
        if (obtainStyledAttributes.hasValue(AbstractC23587l.CardView_cardCornerRadius)) {
            m152492v.m152520o(obtainStyledAttributes.getDimension(AbstractC23587l.CardView_cardCornerRadius, 0.0f));
        }
        this.f35096d = new C31689h();
        m32004R(m152492v.m152519m());
        obtainStyledAttributes.recycle();
    }

    /* renamed from: B */
    private Drawable m31972B(Drawable drawable) {
        int i11;
        int i12;
        if (this.f35093a.getUseCompatPadding()) {
            i12 = (int) Math.ceil(m31980d());
            i11 = (int) Math.ceil(m31978c());
        } else {
            i11 = 0;
            i12 = 0;
        }
        return new a(drawable, i11, i12, i11, i12);
    }

    /* renamed from: V */
    private boolean m31973V() {
        if (this.f35093a.getPreventCornerOverlap() && !m31981e()) {
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m31974W() {
        if (this.f35093a.getPreventCornerOverlap() && m31981e() && this.f35093a.getUseCompatPadding()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private float m31975a() {
        return Math.max(Math.max(m31977b(this.f35104l.m152487q(), this.f35095c.m152431K()), m31977b(this.f35104l.m152489s(), this.f35095c.m152432L())), Math.max(m31977b(this.f35104l.m152482k(), this.f35095c.m152458v()), m31977b(this.f35104l.m152480i(), this.f35095c.m152457u())));
    }

    /* renamed from: a0 */
    private void m31976a0(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 && (this.f35093a.getForeground() instanceof InsetDrawable)) {
            ((InsetDrawable) this.f35093a.getForeground()).setDrawable(drawable);
        } else {
            this.f35093a.setForeground(m31972B(drawable));
        }
    }

    /* renamed from: b */
    private float m31977b(AbstractC31685d abstractC31685d, float f11) {
        if (abstractC31685d instanceof C31693l) {
            return (float) ((1.0d - f35092u) * f11);
        }
        if (abstractC31685d instanceof C31686e) {
            return f11 / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: c */
    private float m31978c() {
        float f11;
        float maxCardElevation = this.f35093a.getMaxCardElevation();
        if (m31974W()) {
            f11 = m31975a();
        } else {
            f11 = 0.0f;
        }
        return maxCardElevation + f11;
    }

    /* renamed from: c0 */
    private void m31979c0() {
        Drawable drawable;
        if (AbstractC29387b.f135923a && (drawable = this.f35106n) != null) {
            ((RippleDrawable) drawable).setColor(this.f35102j);
            return;
        }
        C31689h c31689h = this.f35108p;
        if (c31689h != null) {
            c31689h.m152442c0(this.f35102j);
        }
    }

    /* renamed from: d */
    private float m31980d() {
        float f11;
        float maxCardElevation = this.f35093a.getMaxCardElevation() * 1.5f;
        if (m31974W()) {
            f11 = m31975a();
        } else {
            f11 = 0.0f;
        }
        return maxCardElevation + f11;
    }

    /* renamed from: e */
    private boolean m31981e() {
        return this.f35095c.m152437U();
    }

    /* renamed from: f */
    private Drawable m31982f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable = this.f35101i;
        if (drawable != null) {
            stateListDrawable.addState(f35091t, drawable);
        }
        return stateListDrawable;
    }

    /* renamed from: g */
    private Drawable m31983g() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        C31689h m31985i = m31985i();
        this.f35108p = m31985i;
        m31985i.m152442c0(this.f35102j);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, this.f35108p);
        return stateListDrawable;
    }

    /* renamed from: h */
    private Drawable m31984h() {
        if (AbstractC29387b.f135923a) {
            this.f35109q = m31985i();
            return new RippleDrawable(this.f35102j, null, this.f35109q);
        }
        return m31983g();
    }

    /* renamed from: i */
    private C31689h m31985i() {
        return new C31689h(this.f35104l);
    }

    /* renamed from: r */
    private Drawable m31986r() {
        if (this.f35106n == null) {
            this.f35106n = m31984h();
        }
        if (this.f35107o == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f35106n, this.f35096d, m31982f()});
            this.f35107o = layerDrawable;
            layerDrawable.setId(2, AbstractC23581f.mtrl_card_checked_layer_id);
        }
        return this.f35107o;
    }

    /* renamed from: t */
    private float m31987t() {
        if (this.f35093a.getPreventCornerOverlap() && this.f35093a.getUseCompatPadding()) {
            return (float) ((1.0d - f35092u) * this.f35093a.getCardViewRadius());
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public Rect m31988A() {
        return this.f35094b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean m31989C() {
        return this.f35110r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean m31990D() {
        return this.f35111s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void m31991E(TypedArray typedArray) {
        Drawable drawable;
        ColorStateList m143973a = AbstractC28774c.m143973a(this.f35093a.getContext(), typedArray, AbstractC23587l.MaterialCardView_strokeColor);
        this.f35105m = m143973a;
        if (m143973a == null) {
            this.f35105m = ColorStateList.valueOf(-1);
        }
        this.f35099g = typedArray.getDimensionPixelSize(AbstractC23587l.MaterialCardView_strokeWidth, 0);
        boolean z11 = typedArray.getBoolean(AbstractC23587l.MaterialCardView_android_checkable, false);
        this.f35111s = z11;
        this.f35093a.setLongClickable(z11);
        this.f35103k = AbstractC28774c.m143973a(this.f35093a.getContext(), typedArray, AbstractC23587l.MaterialCardView_checkedIconTint);
        m31997K(AbstractC28774c.m143976d(this.f35093a.getContext(), typedArray, AbstractC23587l.MaterialCardView_checkedIcon));
        m31999M(typedArray.getDimensionPixelSize(AbstractC23587l.MaterialCardView_checkedIconSize, 0));
        m31998L(typedArray.getDimensionPixelSize(AbstractC23587l.MaterialCardView_checkedIconMargin, 0));
        ColorStateList m143973a2 = AbstractC28774c.m143973a(this.f35093a.getContext(), typedArray, AbstractC23587l.MaterialCardView_rippleColor);
        this.f35102j = m143973a2;
        if (m143973a2 == null) {
            this.f35102j = ColorStateList.valueOf(AbstractC25136a.m130294d(this.f35093a, AbstractC23577b.colorControlHighlight));
        }
        m31995I(AbstractC28774c.m143973a(this.f35093a.getContext(), typedArray, AbstractC23587l.MaterialCardView_cardForegroundColor));
        m31979c0();
        m32010Z();
        m32012d0();
        this.f35093a.setBackgroundInternal(m31972B(this.f35095c));
        if (this.f35093a.isClickable()) {
            drawable = m31986r();
        } else {
            drawable = this.f35096d;
        }
        this.f35100h = drawable;
        this.f35093a.setForeground(m31972B(drawable));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public void m31992F(int i11, int i12) {
        int i13;
        int i14;
        if (this.f35107o != null) {
            int i15 = this.f35097e;
            int i16 = this.f35098f;
            int i17 = (i11 - i15) - i16;
            int i18 = (i12 - i15) - i16;
            if (this.f35093a.getUseCompatPadding()) {
                i18 -= (int) Math.ceil(m31980d() * 2.0f);
                i17 -= (int) Math.ceil(m31978c() * 2.0f);
            }
            int i19 = i18;
            int i21 = this.f35097e;
            if (AbstractC1579n0.m7812G(this.f35093a) == 1) {
                i14 = i17;
                i13 = i21;
            } else {
                i13 = i17;
                i14 = i21;
            }
            this.f35107o.setLayerInset(2, i13, this.f35097e, i14, i19);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m31993G(boolean z11) {
        this.f35110r = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public void m31994H(ColorStateList colorStateList) {
        this.f35095c.m152442c0(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m31995I(ColorStateList colorStateList) {
        C31689h c31689h = this.f35096d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        c31689h.m152442c0(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m31996J(boolean z11) {
        this.f35111s = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public void m31997K(Drawable drawable) {
        this.f35101i = drawable;
        if (drawable != null) {
            Drawable m7200r = AbstractC1414a.m7200r(drawable.mutate());
            this.f35101i = m7200r;
            AbstractC1414a.m7197o(m7200r, this.f35103k);
        }
        if (this.f35107o != null) {
            this.f35107o.setDrawableByLayerId(AbstractC23581f.mtrl_card_checked_layer_id, m31982f());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public void m31998L(int i11) {
        this.f35097e = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public void m31999M(int i11) {
        this.f35098f = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public void m32000N(ColorStateList colorStateList) {
        this.f35103k = colorStateList;
        Drawable drawable = this.f35101i;
        if (drawable != null) {
            AbstractC1414a.m7197o(drawable, colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public void m32001O(float f11) {
        m32004R(this.f35104l.m152493w(f11));
        this.f35100h.invalidateSelf();
        if (m31974W() || m31973V()) {
            m32009Y();
        }
        if (m31974W()) {
            m32011b0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public void m32002P(float f11) {
        this.f35095c.m152443d0(f11);
        C31689h c31689h = this.f35096d;
        if (c31689h != null) {
            c31689h.m152443d0(f11);
        }
        C31689h c31689h2 = this.f35109q;
        if (c31689h2 != null) {
            c31689h2.m152443d0(f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public void m32003Q(ColorStateList colorStateList) {
        this.f35102j = colorStateList;
        m31979c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public void m32004R(C31694m c31694m) {
        this.f35104l = c31694m;
        this.f35095c.setShapeAppearanceModel(c31694m);
        this.f35095c.m152448h0(!r0.m152437U());
        C31689h c31689h = this.f35096d;
        if (c31689h != null) {
            c31689h.setShapeAppearanceModel(c31694m);
        }
        C31689h c31689h2 = this.f35109q;
        if (c31689h2 != null) {
            c31689h2.setShapeAppearanceModel(c31694m);
        }
        C31689h c31689h3 = this.f35108p;
        if (c31689h3 != null) {
            c31689h3.setShapeAppearanceModel(c31694m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public void m32005S(ColorStateList colorStateList) {
        if (this.f35105m == colorStateList) {
            return;
        }
        this.f35105m = colorStateList;
        m32012d0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public void m32006T(int i11) {
        if (i11 == this.f35099g) {
            return;
        }
        this.f35099g = i11;
        m32012d0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public void m32007U(int i11, int i12, int i13, int i14) {
        this.f35094b.set(i11, i12, i13, i14);
        m32009Y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public void m32008X() {
        Drawable drawable;
        Drawable drawable2 = this.f35100h;
        if (this.f35093a.isClickable()) {
            drawable = m31986r();
        } else {
            drawable = this.f35096d;
        }
        this.f35100h = drawable;
        if (drawable2 != drawable) {
            m31976a0(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public void m32009Y() {
        float m31975a;
        if (!m31973V() && !m31974W()) {
            m31975a = 0.0f;
        } else {
            m31975a = m31975a();
        }
        int m31987t = (int) (m31975a - m31987t());
        MaterialCardView materialCardView = this.f35093a;
        Rect rect = this.f35094b;
        materialCardView.m31970k(rect.left + m31987t, rect.top + m31987t, rect.right + m31987t, rect.bottom + m31987t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z */
    public void m32010Z() {
        this.f35095c.m152441b0(this.f35093a.getCardElevation());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void m32011b0() {
        if (!m31989C()) {
            this.f35093a.setBackgroundInternal(m31972B(this.f35095c));
        }
        this.f35093a.setForeground(m31972B(this.f35100h));
    }

    /* renamed from: d0 */
    void m32012d0() {
        this.f35096d.m152453l0(this.f35099g, this.f35105m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m32013j() {
        Drawable drawable = this.f35106n;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i11 = bounds.bottom;
            this.f35106n.setBounds(bounds.left, bounds.top, bounds.right, i11 - 1);
            this.f35106n.setBounds(bounds.left, bounds.top, bounds.right, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public C31689h m32014k() {
        return this.f35095c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public ColorStateList m32015l() {
        return this.f35095c.m152461z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public ColorStateList m32016m() {
        return this.f35096d.m152461z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public Drawable m32017n() {
        return this.f35101i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public int m32018o() {
        return this.f35097e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public int m32019p() {
        return this.f35098f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public ColorStateList m32020q() {
        return this.f35103k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public float m32021s() {
        return this.f35095c.m152431K();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public float m32022u() {
        return this.f35095c.m152422A();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public ColorStateList m32023v() {
        return this.f35102j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public C31694m m32024w() {
        return this.f35104l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public int m32025x() {
        ColorStateList colorStateList = this.f35105m;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public ColorStateList m32026y() {
        return this.f35105m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public int m32027z() {
        return this.f35099g;
    }
}
