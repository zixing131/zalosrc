package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p628x0.AbstractC29276a;
import p628x0.AbstractC29277b;
import p628x0.AbstractC29278c;
import p628x0.AbstractC29279d;

/* loaded from: classes2.dex */
public class CardView extends FrameLayout {

    /* renamed from: w */
    private static final int[] f4819w = {R.attr.colorBackground};

    /* renamed from: x */
    private static final InterfaceC1242c f4820x;

    /* renamed from: p */
    private boolean f4821p;

    /* renamed from: q */
    private boolean f4822q;

    /* renamed from: r */
    int f4823r;

    /* renamed from: s */
    int f4824s;

    /* renamed from: t */
    final Rect f4825t;

    /* renamed from: u */
    final Rect f4826u;

    /* renamed from: v */
    private final InterfaceC1241b f4827v;

    /* renamed from: androidx.cardview.widget.CardView$a */
    /* loaded from: classes2.dex */
    class C1239a implements InterfaceC1241b {

        /* renamed from: a */
        private Drawable f4828a;

        C1239a() {
        }

        @Override // androidx.cardview.widget.InterfaceC1241b
        /* renamed from: a */
        public void mo5863a(int i11, int i12, int i13, int i14) {
            CardView.this.f4826u.set(i11, i12, i13, i14);
            CardView cardView = CardView.this;
            Rect rect = cardView.f4825t;
            CardView.super.setPadding(i11 + rect.left, i12 + rect.top, i13 + rect.right, i14 + rect.bottom);
        }

        @Override // androidx.cardview.widget.InterfaceC1241b
        /* renamed from: b */
        public void mo5864b(Drawable drawable) {
            this.f4828a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.InterfaceC1241b
        /* renamed from: c */
        public boolean mo5865c() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.InterfaceC1241b
        /* renamed from: d */
        public Drawable mo5866d() {
            return this.f4828a;
        }

        @Override // androidx.cardview.widget.InterfaceC1241b
        /* renamed from: e */
        public boolean mo5867e() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.InterfaceC1241b
        /* renamed from: f */
        public View mo5868f() {
            return CardView.this;
        }
    }

    static {
        C1240a c1240a = new C1240a();
        f4820x = c1240a;
        c1240a.mo5881l();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC29276a.cardViewStyle);
    }

    /* renamed from: f */
    public void m5862f(int i11, int i12, int i13, int i14) {
        this.f4825t.set(i11, i12, i13, i14);
        f4820x.mo5880k(this.f4827v);
    }

    public ColorStateList getCardBackgroundColor() {
        return f4820x.mo5874e(this.f4827v);
    }

    public float getCardElevation() {
        return f4820x.mo5878i(this.f4827v);
    }

    public int getContentPaddingBottom() {
        return this.f4825t.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f4825t.left;
    }

    public int getContentPaddingRight() {
        return this.f4825t.right;
    }

    public int getContentPaddingTop() {
        return this.f4825t.top;
    }

    public float getMaxCardElevation() {
        return f4820x.mo5873d(this.f4827v);
    }

    public boolean getPreventCornerOverlap() {
        return this.f4822q;
    }

    public float getRadius() {
        return f4820x.mo5871b(this.f4827v);
    }

    public boolean getUseCompatPadding() {
        return this.f4821p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        if (!(f4820x instanceof C1240a)) {
            int mode = View.MeasureSpec.getMode(i11);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.mo5882m(this.f4827v)), View.MeasureSpec.getSize(i11)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i12);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i12 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.mo5875f(this.f4827v)), View.MeasureSpec.getSize(i12)), mode2);
            }
            super.onMeasure(i11, i12);
            return;
        }
        super.onMeasure(i11, i12);
    }

    public void setCardBackgroundColor(int i11) {
        f4820x.mo5883n(this.f4827v, ColorStateList.valueOf(i11));
    }

    public void setCardElevation(float f11) {
        f4820x.mo5872c(this.f4827v, f11);
    }

    public void setMaxCardElevation(float f11) {
        f4820x.mo5884o(this.f4827v, f11);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i11) {
        this.f4824s = i11;
        super.setMinimumHeight(i11);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i11) {
        this.f4823r = i11;
        super.setMinimumWidth(i11);
    }

    @Override // android.view.View
    public void setPadding(int i11, int i12, int i13, int i14) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i11, int i12, int i13, int i14) {
    }

    public void setPreventCornerOverlap(boolean z11) {
        if (z11 != this.f4822q) {
            this.f4822q = z11;
            f4820x.mo5876g(this.f4827v);
        }
    }

    public void setRadius(float f11) {
        f4820x.mo5870a(this.f4827v, f11);
    }

    public void setUseCompatPadding(boolean z11) {
        if (this.f4821p != z11) {
            this.f4821p = z11;
            f4820x.mo5879j(this.f4827v);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f4825t = rect;
        this.f4826u = new Rect();
        C1239a c1239a = new C1239a();
        this.f4827v = c1239a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC29279d.CardView, i11, AbstractC29278c.CardView);
        if (obtainStyledAttributes.hasValue(AbstractC29279d.CardView_cardBackgroundColor)) {
            valueOf = obtainStyledAttributes.getColorStateList(AbstractC29279d.CardView_cardBackgroundColor);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f4819w);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(AbstractC29277b.cardview_light_background);
            } else {
                color = getResources().getColor(AbstractC29277b.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(AbstractC29279d.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(AbstractC29279d.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(AbstractC29279d.CardView_cardMaxElevation, 0.0f);
        this.f4821p = obtainStyledAttributes.getBoolean(AbstractC29279d.CardView_cardUseCompatPadding, false);
        this.f4822q = obtainStyledAttributes.getBoolean(AbstractC29279d.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(AbstractC29279d.CardView_contentPadding, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(AbstractC29279d.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(AbstractC29279d.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(AbstractC29279d.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(AbstractC29279d.CardView_contentPaddingBottom, dimensionPixelSize);
        float f11 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f4823r = obtainStyledAttributes.getDimensionPixelSize(AbstractC29279d.CardView_android_minWidth, 0);
        this.f4824s = obtainStyledAttributes.getDimensionPixelSize(AbstractC29279d.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        f4820x.mo5877h(c1239a, context, colorStateList, dimension, dimension2, f11);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f4820x.mo5883n(this.f4827v, colorStateList);
    }
}
