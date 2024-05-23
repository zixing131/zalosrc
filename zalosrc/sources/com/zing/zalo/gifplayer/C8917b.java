package com.zing.zalo.gifplayer;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.zing.zalo.gifplayer.b */
/* loaded from: classes.dex */
public class C8917b extends Drawable implements Animatable {

    /* renamed from: U */
    public static boolean f47664U = true;

    /* renamed from: V */
    public static boolean f47665V = true;

    /* renamed from: W */
    public static int f47666W = 3686400;

    /* renamed from: X */
    public static int f47667X = 2073600;

    /* renamed from: Y */
    public static int f47668Y = 2073600;

    /* renamed from: Z */
    public static boolean f47669Z = true;

    /* renamed from: A */
    GifInfoHandle f47670A;

    /* renamed from: C */
    PorterDuffColorFilter f47672C;

    /* renamed from: D */
    PorterDuff.Mode f47673D;

    /* renamed from: F */
    Rect f47675F;

    /* renamed from: G */
    ScheduledFuture f47676G;

    /* renamed from: H */
    int f47677H;

    /* renamed from: I */
    int f47678I;

    /* renamed from: M */
    volatile boolean f47682M;

    /* renamed from: N */
    volatile boolean f47683N;

    /* renamed from: O */
    int f47684O;

    /* renamed from: s */
    public String f47693s;

    /* renamed from: v */
    Paint f47696v;

    /* renamed from: y */
    Bitmap f47699y;

    /* renamed from: z */
    public Bitmap f47700z;

    /* renamed from: q */
    volatile boolean f47691q = false;

    /* renamed from: r */
    long f47692r = -1;

    /* renamed from: t */
    final Rect f47694t = new Rect();

    /* renamed from: u */
    protected final Paint f47695u = new Paint(6);

    /* renamed from: w */
    float f47697w = 0.0f;

    /* renamed from: x */
    int f47698x = 0;

    /* renamed from: B */
    ColorStateList f47671B = ColorStateList.valueOf(0);

    /* renamed from: J */
    float f47679J = 0.0f;

    /* renamed from: K */
    final RectF f47680K = new RectF();

    /* renamed from: L */
    public volatile WeakReference f47681L = null;

    /* renamed from: P */
    int f47685P = 0;

    /* renamed from: Q */
    boolean[] f47686Q = {false, false, false, false};

    /* renamed from: R */
    final RectF f47687R = new RectF();

    /* renamed from: S */
    Runnable f47688S = new a();

    /* renamed from: T */
    Runnable f47689T = new Runnable() { // from class: com.zing.zalo.gifplayer.a
        @Override // java.lang.Runnable
        public final void run() {
            C8917b.this.m47602h();
        }
    };

    /* renamed from: p */
    ScheduledThreadPoolExecutor f47690p = C8920e.m47621a();

    /* renamed from: E */
    HandlerC8921f f47674E = new HandlerC8921f(this);

    /* renamed from: com.zing.zalo.gifplayer.b$a */
    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GifInfoHandle gifInfoHandle = C8917b.this.f47670A;
            if (gifInfoHandle != null && gifInfoHandle.m47596f()) {
                C8917b.this.start();
            }
        }
    }

    public C8917b(File file, int i11) {
        this.f47684O = f47667X;
        this.f47684O = i11;
        this.f47693s = file.getPath();
    }

    /* renamed from: c */
    public static boolean m47599c(boolean[] zArr) {
        for (boolean z11 : zArr) {
            if (z11) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m47600e() {
        return f47665V;
    }

    /* renamed from: f */
    public static boolean m47601f() {
        return f47664U;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m47602h() {
        if (!m47609g()) {
            m47610i();
        }
    }

    /* renamed from: l */
    public static void m47603l(boolean z11) {
        f47665V = z11;
    }

    /* renamed from: m */
    public static void m47604m(boolean z11) {
        f47664U = z11;
    }

    /* renamed from: n */
    public static void m47605n(int i11) {
        f47666W = i11;
    }

    /* renamed from: o */
    public static void m47606o(int i11) {
        f47667X = i11;
    }

    /* renamed from: p */
    public static void m47607p(int i11) {
        f47668Y = i11;
    }

    /* renamed from: d */
    void m47608d() {
        try {
            this.f47670A = new GifInfoHandle(this.f47693s, false, this.f47684O);
            this.f47683N = true;
            this.f47699y = Bitmap.createBitmap(this.f47670A.m47592b(), this.f47670A.m47591a(), Bitmap.Config.ARGB_8888);
            this.f47675F = new Rect(0, 0, this.f47670A.m47592b(), this.f47670A.m47591a());
            this.f47677H = this.f47670A.m47592b();
            this.f47678I = this.f47670A.m47591a();
            m47613q(0);
        } catch (OutOfMemoryError e11) {
            e11.printStackTrace();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z11;
        if (this.f47700z != null) {
            if (this.f47691q && this.f47672C != null && this.f47695u.getColorFilter() == null) {
                this.f47695u.setColorFilter(this.f47672C);
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f47695u.getShader() == null) {
                canvas.drawBitmap(this.f47699y, (Rect) null, this.f47694t, this.f47695u);
            } else {
                RectF rectF = this.f47680K;
                float f11 = this.f47679J;
                canvas.drawRoundRect(rectF, f11, f11, this.f47695u);
            }
            if (this.f47697w > 0.0f) {
                RectF rectF2 = this.f47680K;
                float f12 = this.f47679J;
                canvas.drawRoundRect(rectF2, f12, f12, this.f47696v);
            }
            m47611j(canvas);
            m47612k(canvas);
            if (z11) {
                this.f47695u.setColorFilter(null);
            }
        }
        if (this.f47691q && !this.f47682M) {
            long j11 = this.f47692r;
            if (j11 != -2147483648L) {
                long max = Math.max(j11 - System.currentTimeMillis(), 0L);
                this.f47692r = -2147483648L;
                this.f47690p.remove(this.f47689T);
                this.f47676G = this.f47690p.schedule(this.f47689T, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: g */
    public boolean m47609g() {
        GifInfoHandle gifInfoHandle = this.f47670A;
        if (gifInfoHandle != null) {
            return gifInfoHandle.m47593c();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f47695u.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f47695u.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f47678I;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f47677H;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* renamed from: i */
    void m47610i() {
        Bitmap bitmap;
        if (this.f47691q) {
            if (!this.f47683N && this.f47685P != 2) {
                m47608d();
            }
            GifInfoHandle gifInfoHandle = this.f47670A;
            if (gifInfoHandle != null && (bitmap = this.f47699y) != null) {
                try {
                    long min = Math.min(gifInfoHandle.m47595e(bitmap), 2000L);
                    if (min < 0) {
                        min = 200;
                    }
                    if (min >= 0) {
                        this.f47700z = this.f47699y;
                        this.f47692r = System.currentTimeMillis() + min;
                    } else {
                        this.f47692r = -2147483648L;
                        this.f47691q = false;
                    }
                } catch (OutOfMemoryError e11) {
                    e11.printStackTrace();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
            if (this.f47691q) {
                this.f47674E.sendEmptyMessage(1);
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f47691q;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        if (!super.isStateful() && ((colorStateList = this.f47671B) == null || !colorStateList.isStateful())) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    void m47611j(Canvas canvas) {
        if (m47599c(this.f47686Q) || this.f47679J == 0.0f) {
            return;
        }
        RectF rectF = this.f47680K;
        float f11 = rectF.left;
        float f12 = rectF.top;
        float width = rectF.width() + f11;
        float height = this.f47680K.height() + f12;
        float f13 = this.f47679J;
        if (!this.f47686Q[0]) {
            this.f47687R.set(f11, f12, f11 + f13, f12 + f13);
            canvas.drawRect(this.f47687R, this.f47695u);
        }
        if (!this.f47686Q[1]) {
            this.f47687R.set(width - f13, f12, width, f13);
            canvas.drawRect(this.f47687R, this.f47695u);
        }
        if (!this.f47686Q[2]) {
            this.f47687R.set(width - f13, height - f13, width, height);
            canvas.drawRect(this.f47687R, this.f47695u);
        }
        if (!this.f47686Q[3]) {
            this.f47687R.set(f11, height - f13, f13 + f11, height);
            canvas.drawRect(this.f47687R, this.f47695u);
        }
    }

    /* renamed from: k */
    void m47612k(Canvas canvas) {
        float f11;
        if (this.f47697w <= 0.0f || this.f47696v == null || m47599c(this.f47686Q) || this.f47679J == 0.0f) {
            return;
        }
        RectF rectF = this.f47680K;
        float f12 = rectF.left;
        float f13 = rectF.top;
        float width = rectF.width() + f12;
        float height = f13 + this.f47680K.height();
        float f14 = this.f47679J;
        float f15 = this.f47697w / 2.0f;
        if (!this.f47686Q[0]) {
            canvas.drawLine(f12 - f15, f13, f12 + f14, f13, this.f47696v);
            canvas.drawLine(f12, f13 - f15, f12, f13 + f14, this.f47696v);
        }
        if (!this.f47686Q[1]) {
            canvas.drawLine((width - f14) - f15, f13, width, f13, this.f47696v);
            canvas.drawLine(width, f13 - f15, width, f13 + f14, this.f47696v);
        }
        if (!this.f47686Q[2]) {
            f11 = f14;
            canvas.drawLine((width - f14) - f15, height, width + f15, height, this.f47696v);
            canvas.drawLine(width, height - f11, width, height, this.f47696v);
        } else {
            f11 = f14;
        }
        if (!this.f47686Q[3]) {
            canvas.drawLine(f12 - f15, height, f12 + f11, height, this.f47696v);
            canvas.drawLine(f12, height - f11, f12, height, this.f47696v);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f47694t.set(rect);
        this.f47680K.set(this.f47694t);
        Shader shader = this.f47695u.getShader();
        if (shader != null) {
            Matrix matrix = new Matrix();
            RectF rectF = this.f47680K;
            matrix.setTranslate(rectF.left, rectF.top);
            matrix.preScale(this.f47680K.width() / this.f47699y.getWidth(), this.f47680K.height() / this.f47699y.getHeight());
            shader.setLocalMatrix(matrix);
            this.f47695u.setShader(shader);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f47671B;
        if (colorStateList != null && (mode = this.f47673D) != null) {
            this.f47672C = m47616t(colorStateList, mode);
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public void m47613q(int i11) {
        GifInfoHandle gifInfoHandle = this.f47670A;
        if (gifInfoHandle != null) {
            gifInfoHandle.m47597g(i11);
        }
    }

    /* renamed from: r */
    public void m47614r(InterfaceC8919d interfaceC8919d) {
        this.f47681L = new WeakReference(interfaceC8919d);
    }

    /* renamed from: s */
    void m47615s() {
        m47617u();
        this.f47676G = this.f47690p.schedule(this.f47689T, 0L, TimeUnit.MILLISECONDS);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f47695u.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f47695u.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z11) {
        this.f47695u.setDither(z11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z11) {
        this.f47695u.setFilterBitmap(z11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f47671B = colorStateList;
        this.f47672C = m47616t(colorStateList, this.f47673D);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f47673D = mode;
        this.f47672C = m47616t(this.f47671B, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        synchronized (this) {
            try {
                if (this.f47691q) {
                    return;
                }
                this.f47691q = true;
                this.f47682M = false;
                m47615s();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        synchronized (this) {
            try {
                if (!this.f47691q) {
                    return;
                }
                this.f47691q = false;
                m47617u();
                this.f47700z = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: t */
    PorterDuffColorFilter m47616t(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    /* renamed from: u */
    void m47617u() {
        try {
            this.f47674E.removeMessages(1);
            ScheduledFuture scheduledFuture = this.f47676G;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
