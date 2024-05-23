package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.cardview.widget.d */
/* loaded from: classes2.dex */
class C1243d extends Drawable {

    /* renamed from: a */
    private float f4830a;

    /* renamed from: c */
    private final RectF f4832c;

    /* renamed from: d */
    private final Rect f4833d;

    /* renamed from: e */
    private float f4834e;

    /* renamed from: h */
    private ColorStateList f4837h;

    /* renamed from: i */
    private PorterDuffColorFilter f4838i;

    /* renamed from: j */
    private ColorStateList f4839j;

    /* renamed from: f */
    private boolean f4835f = false;

    /* renamed from: g */
    private boolean f4836g = true;

    /* renamed from: k */
    private PorterDuff.Mode f4840k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private final Paint f4831b = new Paint(5);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1243d(ColorStateList colorStateList, float f11) {
        this.f4830a = f11;
        m5886e(colorStateList);
        this.f4832c = new RectF();
        this.f4833d = new Rect();
    }

    /* renamed from: a */
    private PorterDuffColorFilter m5885a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    /* renamed from: e */
    private void m5886e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f4837h = colorStateList;
        this.f4831b.setColor(colorStateList.getColorForState(getState(), this.f4837h.getDefaultColor()));
    }

    /* renamed from: i */
    private void m5887i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f4832c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f4833d.set(rect);
        if (this.f4835f) {
            this.f4833d.inset((int) Math.ceil(AbstractC1244e.m5894a(this.f4834e, this.f4830a, this.f4836g)), (int) Math.ceil(AbstractC1244e.m5895b(this.f4834e, this.f4830a, this.f4836g)));
            this.f4832c.set(this.f4833d);
        }
    }

    /* renamed from: b */
    public ColorStateList m5888b() {
        return this.f4837h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public float m5889c() {
        return this.f4834e;
    }

    /* renamed from: d */
    public float m5890d() {
        return this.f4830a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z11;
        Paint paint = this.f4831b;
        if (this.f4838i != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.f4838i);
            z11 = true;
        } else {
            z11 = false;
        }
        RectF rectF = this.f4832c;
        float f11 = this.f4830a;
        canvas.drawRoundRect(rectF, f11, f11, paint);
        if (z11) {
            paint.setColorFilter(null);
        }
    }

    /* renamed from: f */
    public void m5891f(ColorStateList colorStateList) {
        m5886e(colorStateList);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m5892g(float f11, boolean z11, boolean z12) {
        if (f11 == this.f4834e && this.f4835f == z11 && this.f4836g == z12) {
            return;
        }
        this.f4834e = f11;
        this.f4835f = z11;
        this.f4836g = z12;
        m5887i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f4833d, this.f4830a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m5893h(float f11) {
        if (f11 == this.f4830a) {
            return;
        }
        this.f4830a = f11;
        m5887i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f4839j;
        if ((colorStateList2 != null && colorStateList2.isStateful()) || (((colorStateList = this.f4837h) != null && colorStateList.isStateful()) || super.isStateful())) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m5887i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z11;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f4837h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState != this.f4831b.getColor()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f4831b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f4839j;
        if (colorStateList2 != null && (mode = this.f4840k) != null) {
            this.f4838i = m5885a(colorStateList2, mode);
            return true;
        }
        return z11;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f4831b.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f4831b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f4839j = colorStateList;
        this.f4838i = m5885a(colorStateList, this.f4840k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f4840k = mode;
        this.f4838i = m5885a(this.f4839j, mode);
        invalidateSelf();
    }
}
