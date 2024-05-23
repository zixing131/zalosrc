package com.zing.zalo.p077ui.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import com.androidquery.util.C3979l;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.zimageutil.ZBitmap;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import me0.AbstractC23136l9;
import me0.C23278z2;

/* loaded from: classes6.dex */
public class MaskableImageView extends RecyclingImageView {

    /* renamed from: J */
    public static final HashMap f69376J = new HashMap();

    /* renamed from: K */
    static final int f69377K = AbstractC23136l9.m118713h0() / 8;

    /* renamed from: L */
    private static final Paint f69378L;

    /* renamed from: M */
    private static final Paint f69379M;

    /* renamed from: N */
    private static final Paint f69380N;

    /* renamed from: A */
    float f69381A;

    /* renamed from: B */
    float f69382B;

    /* renamed from: C */
    int f69383C;

    /* renamed from: D */
    int f69384D;

    /* renamed from: E */
    float f69385E;

    /* renamed from: F */
    float f69386F;

    /* renamed from: G */
    float f69387G;

    /* renamed from: H */
    float f69388H;

    /* renamed from: I */
    ValueAnimator f69389I;

    /* renamed from: p */
    Bitmap f69390p;

    /* renamed from: q */
    Canvas f69391q;

    /* renamed from: r */
    int f69392r;

    /* renamed from: s */
    int f69393s;

    /* renamed from: t */
    Bitmap f69394t;

    /* renamed from: u */
    Bitmap f69395u;

    /* renamed from: v */
    Matrix f69396v;

    /* renamed from: w */
    int f69397w;

    /* renamed from: x */
    int f69398x;

    /* renamed from: y */
    int f69399y;

    /* renamed from: z */
    int f69400z;

    static {
        Paint paint = new Paint();
        f69379M = paint;
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Paint paint2 = new Paint();
        f69380N = paint2;
        paint2.setAntiAlias(true);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        Paint paint3 = new Paint();
        f69378L = paint3;
        paint3.setAntiAlias(true);
    }

    public MaskableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69392r = AbstractC16803z.heart01_shape;
        this.f69393s = AbstractC16803z.heart01_frame;
        this.f69396v = new Matrix();
        this.f69386F = 0.0f;
        m75792m(context);
    }

    /* renamed from: k */
    public static C3979l m75788k(Bitmap bitmap, int i11, int i12, Context context) {
        Bitmap bitmap2;
        Bitmap bitmap3;
        Bitmap bitmap4;
        Matrix matrix = new Matrix();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        HashMap hashMap = f69376J;
        synchronized (hashMap) {
            try {
                WeakReference weakReference = (WeakReference) hashMap.get(Integer.valueOf(i11));
                Bitmap bitmap5 = null;
                if (weakReference != null) {
                    bitmap2 = (Bitmap) weakReference.get();
                } else {
                    bitmap2 = null;
                }
                if (bitmap2 == null) {
                    bitmap2 = BitmapFactory.decodeResource(context.getResources(), i11);
                    hashMap.put(Integer.valueOf(i11), new WeakReference(bitmap2));
                }
                bitmap3 = bitmap2;
                WeakReference weakReference2 = (WeakReference) hashMap.get(Integer.valueOf(i12));
                if (weakReference2 != null) {
                    bitmap5 = (Bitmap) weakReference2.get();
                }
                if (bitmap5 == null) {
                    Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i12);
                    hashMap.put(Integer.valueOf(i12), new WeakReference(decodeResource));
                    bitmap4 = decodeResource;
                } else {
                    bitmap4 = bitmap5;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        float min = Math.min(bitmap.getWidth() / bitmap3.getWidth(), bitmap.getHeight() / bitmap3.getHeight());
        matrix.setScale(min, min);
        int width2 = (width - ((int) (bitmap3.getWidth() * min))) / 2;
        int height2 = (height - ((int) (bitmap3.getHeight() * min))) / 2;
        Paint paint = f69378L;
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        if (height2 > 0) {
            float f11 = width;
            Paint paint2 = f69379M;
            canvas.drawRect(0.0f, 0.0f, f11, height2, paint2);
            canvas.drawRect(0.0f, height - height2, f11, height, paint2);
        } else if (width2 > 0) {
            float f12 = height;
            Paint paint3 = f69379M;
            canvas.drawRect(0.0f, 0.0f, width2, f12, paint3);
            canvas.drawRect(width - width2, 0.0f, width, f12, paint3);
        }
        canvas.save();
        canvas.translate(width2, height2);
        canvas.drawBitmap(bitmap3, matrix, f69380N);
        canvas.drawBitmap(bitmap4, matrix, paint);
        canvas.restore();
        return new C3979l(createBitmap, C23278z2.m120110a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m75789n(ValueAnimator valueAnimator) {
        this.f69386F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i11 = 0;
        while (true) {
            int i12 = this.f69400z;
            if (i11 <= i12) {
                int i13 = this.f69383C;
                int i14 = this.f69384D;
                int i15 = f69377K;
                int i16 = (i11 * i15) + i14;
                float f11 = this.f69386F * 2.0f;
                int i17 = this.f69397w;
                int i18 = (int) ((f11 * i17) - (((i11 * 1.0f) / i12) * i17));
                i11++;
                m75790j(i13, i16, i18, i14 + (i15 * i11));
            } else {
                invalidate();
                return;
            }
        }
    }

    /* renamed from: j */
    void m75790j(int i11, int i12, int i13, int i14) {
        if (this.f69390p != null) {
            int max = Math.max(i13, 0);
            int max2 = Math.max(i14, 0);
            ZBitmap.m91414c(this.f69390p, true, i11, i12, Math.min(this.f69397w, max), Math.min(this.f69398x, max2));
        }
    }

    /* renamed from: l */
    void m75791l(Context context) {
        HashMap hashMap = f69376J;
        synchronized (hashMap) {
            try {
                WeakReference weakReference = (WeakReference) hashMap.get(Integer.valueOf(this.f69392r));
                if (weakReference != null) {
                    this.f69394t = (Bitmap) weakReference.get();
                }
                if (this.f69394t == null) {
                    this.f69394t = BitmapFactory.decodeResource(context.getResources(), this.f69392r);
                    hashMap.put(Integer.valueOf(this.f69392r), new WeakReference(this.f69394t));
                }
                WeakReference weakReference2 = (WeakReference) hashMap.get(Integer.valueOf(this.f69393s));
                if (weakReference2 != null) {
                    this.f69395u = (Bitmap) weakReference2.get();
                }
                if (this.f69395u == null) {
                    this.f69395u = BitmapFactory.decodeResource(context.getResources(), this.f69393s);
                    hashMap.put(Integer.valueOf(this.f69393s), new WeakReference(this.f69395u));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: m */
    void m75792m(Context context) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f69389I = ofFloat;
        ofFloat.setDuration(500L);
        this.f69389I.setInterpolator(new DecelerateInterpolator());
        this.f69389I.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.widget.x0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MaskableImageView.this.m75789n(valueAnimator);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidquery.util.RecyclingImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.drawBitmap(this.f69390p, 0.0f, 0.0f, f69378L);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        float f11;
        float f12;
        super.onSizeChanged(i11, i12, i13, i14);
        this.f69397w = i11;
        this.f69398x = i12;
        this.f69390p = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
        this.f69391q = new Canvas(this.f69390p);
        float f13 = this.f69387G / this.f69388H;
        int i15 = this.f69397w;
        int i16 = this.f69398x;
        if (f13 > i15 / i16) {
            f11 = i15;
            f12 = (int) (i15 / f13);
        } else {
            f11 = (int) (i16 * f13);
            f12 = i16;
        }
        if (this.f69394t != null) {
            int i17 = f69377K;
            this.f69399y = ((int) f11) / i17;
            this.f69400z = ((int) f12) / i17;
            float min = Math.min(f11 / r4.getWidth(), f12 / this.f69394t.getHeight());
            this.f69385E = min;
            this.f69396v.setScale(min, min);
            this.f69381A = (this.f69397w - (this.f69394t.getWidth() * this.f69385E)) / 2.0f;
            this.f69382B = (this.f69398x - (this.f69394t.getHeight() * this.f69385E)) / 2.0f;
            this.f69383C = (int) ((this.f69397w - f11) / 2.0f);
            this.f69384D = (int) ((this.f69398x - f12) / 2.0f);
        }
        this.f69391q.drawARGB(0, 0, 0, 0);
        if (getDrawable() != null) {
            getDrawable().setBounds(0, 0, this.f69397w, this.f69398x);
            getDrawable().draw(this.f69391q);
        }
        this.f69391q.save();
        this.f69391q.translate(this.f69381A, this.f69382B);
        Bitmap bitmap = this.f69394t;
        if (bitmap != null) {
            this.f69391q.drawBitmap(bitmap, this.f69396v, f69379M);
        }
        Bitmap bitmap2 = this.f69395u;
        if (bitmap2 != null) {
            this.f69391q.drawBitmap(bitmap2, this.f69396v, f69378L);
        }
        this.f69391q.restore();
    }

    /* renamed from: p */
    public void m75793p() {
        this.f69390p = null;
        this.f69391q = null;
        ValueAnimator valueAnimator = this.f69389I;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    /* renamed from: q */
    public void m75794q(int i11, int i12) {
        this.f69387G = i11;
        this.f69388H = i12;
    }

    /* renamed from: r */
    public void m75795r(int i11, int i12) {
        this.f69392r = i11;
        this.f69393s = i12;
        m75791l(getContext());
        invalidate();
    }

    /* renamed from: s */
    public void m75796s() {
        this.f69386F = 0.0f;
        ValueAnimator valueAnimator = this.f69389I;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
