package com.zing.zalo.p077ui.widget.imageview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import com.androidquery.util.RecyclingImageView;

/* loaded from: classes6.dex */
public class CircleImageView extends RecyclingImageView {

    /* renamed from: J */
    private static final ImageView.ScaleType f70419J = ImageView.ScaleType.CENTER_CROP;

    /* renamed from: K */
    private static final Bitmap.Config f70420K = Bitmap.Config.ARGB_8888;

    /* renamed from: A */
    private Canvas f70421A;

    /* renamed from: B */
    private float f70422B;

    /* renamed from: C */
    private float f70423C;

    /* renamed from: D */
    private ColorFilter f70424D;

    /* renamed from: E */
    private boolean f70425E;

    /* renamed from: F */
    private boolean f70426F;

    /* renamed from: G */
    private boolean f70427G;

    /* renamed from: H */
    private boolean f70428H;

    /* renamed from: I */
    private boolean f70429I;

    /* renamed from: p */
    private final RectF f70430p;

    /* renamed from: q */
    private final RectF f70431q;

    /* renamed from: r */
    private final Matrix f70432r;

    /* renamed from: s */
    private final Paint f70433s;

    /* renamed from: t */
    private final Paint f70434t;

    /* renamed from: u */
    private final Paint f70435u;

    /* renamed from: v */
    private int f70436v;

    /* renamed from: w */
    private int f70437w;

    /* renamed from: x */
    private int f70438x;

    /* renamed from: y */
    private int f70439y;

    /* renamed from: z */
    private Bitmap f70440z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.widget.imageview.CircleImageView$a */
    /* loaded from: classes6.dex */
    public class C13651a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (CircleImageView.this.f70429I) {
                ViewOutlineProvider.BACKGROUND.getOutline(view, outline);
                return;
            }
            Rect rect = new Rect();
            CircleImageView.this.f70431q.roundOut(rect);
            outline.setRoundRect(rect, rect.width() / 2.0f);
        }

        private C13651a() {
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: k */
    private RectF m76277k() {
        int min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        float paddingLeft = getPaddingLeft() + ((r0 - min) / 2.0f);
        float paddingTop = getPaddingTop() + ((r1 - min) / 2.0f);
        float f11 = min;
        return new RectF(paddingLeft, paddingTop, paddingLeft + f11, f11 + paddingTop);
    }

    /* renamed from: l */
    private Bitmap m76278l(Drawable drawable) {
        Bitmap createBitmap;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            if (drawable instanceof ColorDrawable) {
                createBitmap = Bitmap.createBitmap(2, 2, f70420K);
            } else {
                createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f70420K);
            }
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: m */
    private boolean m76279m(float f11, float f12) {
        if (this.f70431q.isEmpty() || Math.pow(f11 - this.f70431q.centerX(), 2.0d) + Math.pow(f12 - this.f70431q.centerY(), 2.0d) <= Math.pow(this.f70423C, 2.0d)) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private void m76280n() {
        this.f70425E = true;
        super.setScaleType(f70419J);
        this.f70433s.setAntiAlias(true);
        this.f70433s.setDither(true);
        this.f70433s.setFilterBitmap(true);
        this.f70433s.setAlpha(this.f70439y);
        this.f70433s.setColorFilter(this.f70424D);
        this.f70434t.setStyle(Paint.Style.STROKE);
        this.f70434t.setAntiAlias(true);
        this.f70434t.setColor(this.f70436v);
        this.f70434t.setStrokeWidth(this.f70437w);
        this.f70435u.setStyle(Paint.Style.FILL);
        this.f70435u.setAntiAlias(true);
        this.f70435u.setColor(this.f70438x);
        setOutlineProvider(new C13651a());
    }

    /* renamed from: p */
    private void m76281p() {
        Bitmap m76278l = m76278l(getDrawable());
        this.f70440z = m76278l;
        if (m76278l != null && m76278l.isMutable()) {
            this.f70421A = new Canvas(this.f70440z);
        } else {
            this.f70421A = null;
        }
        if (!this.f70425E) {
            return;
        }
        if (this.f70440z != null) {
            m76283r();
        } else {
            this.f70433s.setShader(null);
        }
    }

    /* renamed from: q */
    private void m76282q() {
        int i11;
        this.f70431q.set(m76277k());
        this.f70423C = Math.min((this.f70431q.height() - this.f70437w) / 2.0f, (this.f70431q.width() - this.f70437w) / 2.0f);
        this.f70430p.set(this.f70431q);
        if (!this.f70428H && (i11 = this.f70437w) > 0) {
            this.f70430p.inset(i11 - 1.0f, i11 - 1.0f);
        }
        this.f70422B = Math.min(this.f70430p.height() / 2.0f, this.f70430p.width() / 2.0f);
        m76283r();
    }

    /* renamed from: r */
    private void m76283r() {
        float width;
        float height;
        if (this.f70440z == null) {
            return;
        }
        this.f70432r.set(null);
        int height2 = this.f70440z.getHeight();
        float width2 = this.f70440z.getWidth();
        float f11 = height2;
        float f12 = 0.0f;
        if (this.f70430p.height() * width2 > this.f70430p.width() * f11) {
            width = this.f70430p.height() / f11;
            f12 = (this.f70430p.width() - (width2 * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = this.f70430p.width() / width2;
            height = (this.f70430p.height() - (f11 * width)) * 0.5f;
        }
        this.f70432r.setScale(width, width);
        Matrix matrix = this.f70432r;
        RectF rectF = this.f70430p;
        matrix.postTranslate(((int) (f12 + 0.5f)) + rectF.left, ((int) (height + 0.5f)) + rectF.top);
        this.f70426F = true;
    }

    public int getBorderColor() {
        return this.f70436v;
    }

    public int getBorderWidth() {
        return this.f70437w;
    }

    public int getCircleBackgroundColor() {
        return this.f70438x;
    }

    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
        return this.f70424D;
    }

    @Override // android.widget.ImageView
    public int getImageAlpha() {
        return this.f70439y;
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        this.f70427G = true;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidquery.util.RecyclingImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f70429I) {
            super.onDraw(canvas);
            return;
        }
        if (this.f70438x != 0) {
            canvas.drawCircle(this.f70430p.centerX(), this.f70430p.centerY(), this.f70422B, this.f70435u);
        }
        if (this.f70440z != null) {
            if (this.f70427G && this.f70421A != null) {
                this.f70427G = false;
                Drawable drawable = getDrawable();
                drawable.setBounds(0, 0, this.f70421A.getWidth(), this.f70421A.getHeight());
                drawable.draw(this.f70421A);
            }
            if (this.f70426F) {
                this.f70426F = false;
                Bitmap bitmap = this.f70440z;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                bitmapShader.setLocalMatrix(this.f70432r);
                this.f70433s.setShader(bitmapShader);
            }
            canvas.drawCircle(this.f70430p.centerX(), this.f70430p.centerY(), this.f70422B, this.f70433s);
        }
        if (this.f70437w > 0) {
            canvas.drawCircle(this.f70431q.centerX(), this.f70431q.centerY(), this.f70423C, this.f70434t);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        m76282q();
        invalidate();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f70429I) {
            return super.onTouchEvent(motionEvent);
        }
        if (m76279m(motionEvent.getX(), motionEvent.getY()) && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z11) {
        if (!z11) {
        } else {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(int i11) {
        if (i11 == this.f70436v) {
            return;
        }
        this.f70436v = i11;
        this.f70434t.setColor(i11);
        invalidate();
    }

    public void setBorderOverlay(boolean z11) {
        if (z11 == this.f70428H) {
            return;
        }
        this.f70428H = z11;
        m76282q();
        invalidate();
    }

    public void setBorderWidth(int i11) {
        if (i11 == this.f70437w) {
            return;
        }
        this.f70437w = i11;
        this.f70434t.setStrokeWidth(i11);
        m76282q();
        invalidate();
    }

    public void setCircleBackgroundColor(int i11) {
        if (i11 == this.f70438x) {
            return;
        }
        this.f70438x = i11;
        this.f70435u.setColor(i11);
        invalidate();
    }

    @Deprecated
    public void setCircleBackgroundColorResource(int i11) {
        setCircleBackgroundColor(getContext().getResources().getColor(i11));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.f70424D) {
            return;
        }
        this.f70424D = colorFilter;
        if (this.f70425E) {
            this.f70433s.setColorFilter(colorFilter);
            invalidate();
        }
    }

    public void setDisableCircularTransformation(boolean z11) {
        if (z11 == this.f70429I) {
            return;
        }
        this.f70429I = z11;
        if (z11) {
            this.f70440z = null;
            this.f70421A = null;
            this.f70433s.setShader(null);
        } else {
            m76281p();
        }
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setImageAlpha(int i11) {
        int i12 = i11 & 255;
        if (i12 == this.f70439y) {
            return;
        }
        this.f70439y = i12;
        if (this.f70425E) {
            this.f70433s.setAlpha(i12);
            invalidate();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m76281p();
        invalidate();
    }

    @Override // com.androidquery.util.RecyclingImageView, androidx.appcompat.widget.ZAppCompatImageView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m76281p();
        invalidate();
    }

    @Override // com.androidquery.util.RecyclingImageView, androidx.appcompat.widget.ZAppCompatImageView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i11) {
        super.setImageResource(i11);
        m76281p();
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m76281p();
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i11, int i12, int i13, int i14) {
        super.setPadding(i11, i12, i13, i14);
        m76282q();
        invalidate();
    }

    @Override // android.view.View
    public void setPaddingRelative(int i11, int i12, int i13, int i14) {
        super.setPaddingRelative(i11, i12, i13, i14);
        m76282q();
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == f70419J) {
        } else {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f70430p = new RectF();
        this.f70431q = new RectF();
        this.f70432r = new Matrix();
        this.f70433s = new Paint();
        this.f70434t = new Paint();
        this.f70435u = new Paint();
        this.f70439y = 255;
        this.f70437w = 0;
        this.f70436v = -16777216;
        this.f70428H = false;
        this.f70438x = 0;
        m76280n();
    }
}
