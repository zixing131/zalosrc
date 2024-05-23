package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import p013a7.AbstractC0638a;
import p193h0.AbstractC19694b;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;
import p599w6.AbstractC28774c;
import p706z6.C31689h;
import p706z6.C31694m;
import p706z6.C31695n;
import p706z6.InterfaceC31697p;

/* loaded from: classes3.dex */
public class ShapeableImageView extends AppCompatImageView implements InterfaceC31697p {

    /* renamed from: H */
    private static final int f35411H = AbstractC23586k.Widget_MaterialComponents_ShapeableImageView;

    /* renamed from: A */
    private int f35412A;

    /* renamed from: B */
    private int f35413B;

    /* renamed from: C */
    private int f35414C;

    /* renamed from: D */
    private int f35415D;

    /* renamed from: E */
    private int f35416E;

    /* renamed from: F */
    private int f35417F;

    /* renamed from: G */
    private boolean f35418G;

    /* renamed from: p */
    private final C31695n f35419p;

    /* renamed from: q */
    private final RectF f35420q;

    /* renamed from: r */
    private final RectF f35421r;

    /* renamed from: s */
    private final Paint f35422s;

    /* renamed from: t */
    private final Paint f35423t;

    /* renamed from: u */
    private final Path f35424u;

    /* renamed from: v */
    private ColorStateList f35425v;

    /* renamed from: w */
    private C31689h f35426w;

    /* renamed from: x */
    private C31694m f35427x;

    /* renamed from: y */
    private float f35428y;

    /* renamed from: z */
    private Path f35429z;

    /* renamed from: com.google.android.material.imageview.ShapeableImageView$a */
    /* loaded from: classes3.dex */
    class C6326a extends ViewOutlineProvider {

        /* renamed from: a */
        private final Rect f35430a = new Rect();

        C6326a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f35427x == null) {
                return;
            }
            if (ShapeableImageView.this.f35426w == null) {
                ShapeableImageView.this.f35426w = new C31689h(ShapeableImageView.this.f35427x);
            }
            ShapeableImageView.this.f35420q.round(this.f35430a);
            ShapeableImageView.this.f35426w.setBounds(this.f35430a);
            ShapeableImageView.this.f35426w.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: j */
    private void m32446j(Canvas canvas) {
        if (this.f35425v == null) {
            return;
        }
        this.f35422s.setStrokeWidth(this.f35428y);
        int colorForState = this.f35425v.getColorForState(getDrawableState(), this.f35425v.getDefaultColor());
        if (this.f35428y > 0.0f && colorForState != 0) {
            this.f35422s.setColor(colorForState);
            canvas.drawPath(this.f35424u, this.f35422s);
        }
    }

    /* renamed from: k */
    private boolean m32447k() {
        return (this.f35416E == Integer.MIN_VALUE && this.f35417F == Integer.MIN_VALUE) ? false : true;
    }

    /* renamed from: l */
    private boolean m32448l() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private void m32449m(int i11, int i12) {
        this.f35420q.set(getPaddingLeft(), getPaddingTop(), i11 - getPaddingRight(), i12 - getPaddingBottom());
        this.f35419p.m152544d(this.f35427x, 1.0f, this.f35420q, this.f35424u);
        this.f35429z.rewind();
        this.f35429z.addPath(this.f35424u);
        this.f35421r.set(0.0f, 0.0f, i11, i12);
        this.f35429z.addRect(this.f35421r, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f35415D;
    }

    public final int getContentPaddingEnd() {
        int i11 = this.f35417F;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (m32448l()) {
            return this.f35412A;
        }
        return this.f35414C;
    }

    public int getContentPaddingLeft() {
        int i11;
        int i12;
        if (m32447k()) {
            if (m32448l() && (i12 = this.f35417F) != Integer.MIN_VALUE) {
                return i12;
            }
            if (!m32448l() && (i11 = this.f35416E) != Integer.MIN_VALUE) {
                return i11;
            }
        }
        return this.f35412A;
    }

    public int getContentPaddingRight() {
        int i11;
        int i12;
        if (m32447k()) {
            if (m32448l() && (i12 = this.f35416E) != Integer.MIN_VALUE) {
                return i12;
            }
            if (!m32448l() && (i11 = this.f35417F) != Integer.MIN_VALUE) {
                return i11;
            }
        }
        return this.f35414C;
    }

    public final int getContentPaddingStart() {
        int i11 = this.f35416E;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (m32448l()) {
            return this.f35414C;
        }
        return this.f35412A;
    }

    public int getContentPaddingTop() {
        return this.f35413B;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public C31694m getShapeAppearanceModel() {
        return this.f35427x;
    }

    public ColorStateList getStrokeColor() {
        return this.f35425v;
    }

    public float getStrokeWidth() {
        return this.f35428y;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        setLayerType(0, null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f35429z, this.f35423t);
        m32446j(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (this.f35418G || !isLayoutDirectionResolved()) {
            return;
        }
        this.f35418G = true;
        if (!isPaddingRelative() && !m32447k()) {
            setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
        } else {
            setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        m32449m(i11, i12);
    }

    @Override // android.view.View
    public void setPadding(int i11, int i12, int i13, int i14) {
        super.setPadding(i11 + getContentPaddingLeft(), i12 + getContentPaddingTop(), i13 + getContentPaddingRight(), i14 + getContentPaddingBottom());
    }

    @Override // android.view.View
    public void setPaddingRelative(int i11, int i12, int i13, int i14) {
        super.setPaddingRelative(i11 + getContentPaddingStart(), i12 + getContentPaddingTop(), i13 + getContentPaddingEnd(), i14 + getContentPaddingBottom());
    }

    @Override // p706z6.InterfaceC31697p
    public void setShapeAppearanceModel(C31694m c31694m) {
        this.f35427x = c31694m;
        C31689h c31689h = this.f35426w;
        if (c31689h != null) {
            c31689h.setShapeAppearanceModel(c31694m);
        }
        m32449m(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f35425v = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i11) {
        setStrokeColor(AbstractC19694b.m103335c(getContext(), i11));
    }

    public void setStrokeWidth(float f11) {
        if (this.f35428y != f11) {
            this.f35428y = f11;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i11) {
        setStrokeWidth(getResources().getDimensionPixelSize(i11));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ShapeableImageView(Context context, AttributeSet attributeSet, int i11) {
        super(AbstractC0638a.m909c(context, attributeSet, i11, r0), attributeSet, i11);
        int i12 = f35411H;
        this.f35419p = C31695n.m152540k();
        this.f35424u = new Path();
        this.f35418G = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f35423t = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f35420q = new RectF();
        this.f35421r = new RectF();
        this.f35429z = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC23587l.ShapeableImageView, i11, i12);
        this.f35425v = AbstractC28774c.m143973a(context2, obtainStyledAttributes, AbstractC23587l.ShapeableImageView_strokeColor);
        this.f35428y = obtainStyledAttributes.getDimensionPixelSize(AbstractC23587l.ShapeableImageView_strokeWidth, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(AbstractC23587l.ShapeableImageView_contentPadding, 0);
        this.f35412A = dimensionPixelSize;
        this.f35413B = dimensionPixelSize;
        this.f35414C = dimensionPixelSize;
        this.f35415D = dimensionPixelSize;
        this.f35412A = obtainStyledAttributes.getDimensionPixelSize(AbstractC23587l.ShapeableImageView_contentPaddingLeft, dimensionPixelSize);
        this.f35413B = obtainStyledAttributes.getDimensionPixelSize(AbstractC23587l.ShapeableImageView_contentPaddingTop, dimensionPixelSize);
        this.f35414C = obtainStyledAttributes.getDimensionPixelSize(AbstractC23587l.ShapeableImageView_contentPaddingRight, dimensionPixelSize);
        this.f35415D = obtainStyledAttributes.getDimensionPixelSize(AbstractC23587l.ShapeableImageView_contentPaddingBottom, dimensionPixelSize);
        this.f35416E = obtainStyledAttributes.getDimensionPixelSize(AbstractC23587l.ShapeableImageView_contentPaddingStart, Integer.MIN_VALUE);
        this.f35417F = obtainStyledAttributes.getDimensionPixelSize(AbstractC23587l.ShapeableImageView_contentPaddingEnd, Integer.MIN_VALUE);
        obtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f35422s = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f35427x = C31694m.m152475e(context2, attributeSet, i11, i12).m152519m();
        setOutlineProvider(new C6326a());
    }
}
