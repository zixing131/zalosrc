package com.google.android.material.floatingactionbutton;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.AbstractC1409d;
import p706z6.C31694m;
import p706z6.C31695n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.floatingactionbutton.c */
/* loaded from: classes3.dex */
public class C6322c extends Drawable {

    /* renamed from: b */
    private final Paint f35338b;

    /* renamed from: h */
    float f35344h;

    /* renamed from: i */
    private int f35345i;

    /* renamed from: j */
    private int f35346j;

    /* renamed from: k */
    private int f35347k;

    /* renamed from: l */
    private int f35348l;

    /* renamed from: m */
    private int f35349m;

    /* renamed from: o */
    private C31694m f35351o;

    /* renamed from: p */
    private ColorStateList f35352p;

    /* renamed from: a */
    private final C31695n f35337a = C31695n.m152540k();

    /* renamed from: c */
    private final Path f35339c = new Path();

    /* renamed from: d */
    private final Rect f35340d = new Rect();

    /* renamed from: e */
    private final RectF f35341e = new RectF();

    /* renamed from: f */
    private final RectF f35342f = new RectF();

    /* renamed from: g */
    private final b f35343g = new b();

    /* renamed from: n */
    private boolean f35350n = true;

    /* renamed from: com.google.android.material.floatingactionbutton.c$b */
    /* loaded from: classes3.dex */
    private class b extends Drawable.ConstantState {
        private b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return C6322c.this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6322c(C31694m c31694m) {
        this.f35351o = c31694m;
        Paint paint = new Paint(1);
        this.f35338b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    private Shader m32371a() {
        copyBounds(this.f35340d);
        float height = this.f35344h / r0.height();
        return new LinearGradient(0.0f, r0.top, 0.0f, r0.bottom, new int[]{AbstractC1409d.m7142k(this.f35345i, this.f35349m), AbstractC1409d.m7142k(this.f35346j, this.f35349m), AbstractC1409d.m7142k(AbstractC1409d.m7147p(this.f35346j, 0), this.f35349m), AbstractC1409d.m7142k(AbstractC1409d.m7147p(this.f35348l, 0), this.f35349m), AbstractC1409d.m7142k(this.f35348l, this.f35349m), AbstractC1409d.m7142k(this.f35347k, this.f35349m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    /* renamed from: b */
    protected RectF m32372b() {
        this.f35342f.set(getBounds());
        return this.f35342f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m32373c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f35349m = colorStateList.getColorForState(getState(), this.f35349m);
        }
        this.f35352p = colorStateList;
        this.f35350n = true;
        invalidateSelf();
    }

    /* renamed from: d */
    public void m32374d(float f11) {
        if (this.f35344h != f11) {
            this.f35344h = f11;
            this.f35338b.setStrokeWidth(f11 * 1.3333f);
            this.f35350n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f35350n) {
            this.f35338b.setShader(m32371a());
            this.f35350n = false;
        }
        float strokeWidth = this.f35338b.getStrokeWidth() / 2.0f;
        copyBounds(this.f35340d);
        this.f35341e.set(this.f35340d);
        float min = Math.min(this.f35351o.m152488r().mo152392a(m32372b()), this.f35341e.width() / 2.0f);
        if (this.f35351o.m152491u(m32372b())) {
            this.f35341e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f35341e, min, min, this.f35338b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m32375e(int i11, int i12, int i13, int i14) {
        this.f35345i = i11;
        this.f35346j = i12;
        this.f35347k = i13;
        this.f35348l = i14;
    }

    /* renamed from: f */
    public void m32376f(C31694m c31694m) {
        this.f35351o = c31694m;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f35343g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f35344h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f35351o.m152491u(m32372b())) {
            outline.setRoundRect(getBounds(), this.f35351o.m152488r().mo152392a(m32372b()));
            return;
        }
        copyBounds(this.f35340d);
        this.f35341e.set(this.f35340d);
        this.f35337a.m152544d(this.f35351o, 1.0f, this.f35341e, this.f35339c);
        if (this.f35339c.isConvex()) {
            outline.setConvexPath(this.f35339c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (this.f35351o.m152491u(m32372b())) {
            int round = Math.round(this.f35344h);
            rect.set(round, round, round, round);
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f35352p;
        if ((colorStateList != null && colorStateList.isStateful()) || super.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f35350n = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f35352p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f35349m)) != this.f35349m) {
            this.f35350n = true;
            this.f35349m = colorForState;
        }
        if (this.f35350n) {
            invalidateSelf();
        }
        return this.f35350n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f35338b.setAlpha(i11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f35338b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
