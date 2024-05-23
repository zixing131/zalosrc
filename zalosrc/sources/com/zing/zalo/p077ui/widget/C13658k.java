package com.zing.zalo.p077ui.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;

/* renamed from: com.zing.zalo.ui.widget.k */
/* loaded from: classes6.dex */
public class C13658k {

    /* renamed from: E */
    private static final String f70521E = "k";

    /* renamed from: F */
    private static RoundRectShape f70522F;

    /* renamed from: G */
    public static final int f70523G;

    /* renamed from: A */
    private Bitmap f70524A;

    /* renamed from: B */
    private Canvas f70525B;

    /* renamed from: C */
    private Matrix f70526C;

    /* renamed from: a */
    private Paint f70528a;

    /* renamed from: b */
    private Paint f70529b;

    /* renamed from: d */
    private int f70531d;

    /* renamed from: e */
    private int f70532e;

    /* renamed from: f */
    private int f70533f;

    /* renamed from: g */
    private int f70534g;

    /* renamed from: h */
    private final View f70535h;

    /* renamed from: i */
    protected Bitmap f70536i;

    /* renamed from: j */
    protected Drawable f70537j;

    /* renamed from: k */
    private int f70538k;

    /* renamed from: l */
    private int f70539l;

    /* renamed from: m */
    protected int f70540m;

    /* renamed from: n */
    protected int f70541n;

    /* renamed from: o */
    protected int f70542o;

    /* renamed from: p */
    protected int f70543p;

    /* renamed from: q */
    protected int f70544q;

    /* renamed from: r */
    protected int f70545r;

    /* renamed from: s */
    protected boolean f70546s;

    /* renamed from: u */
    private final Paint f70548u;

    /* renamed from: v */
    private boolean f70549v;

    /* renamed from: w */
    protected Drawable f70550w;

    /* renamed from: y */
    private Bitmap f70552y;

    /* renamed from: z */
    private Bitmap f70553z;

    /* renamed from: c */
    private int f70530c = 0;

    /* renamed from: t */
    protected boolean f70547t = false;

    /* renamed from: x */
    private boolean f70551x = false;

    /* renamed from: D */
    private int f70527D = -1;

    static {
        int m118742r = AbstractC23136l9.m118742r(5.0f);
        f70523G = m118742r;
        try {
            f70522F = new RoundRectShape(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}, new RectF(0.1f, 0.1f, 0.1f, 0.1f), new float[]{m118742r, m118742r, m118742r, m118742r, m118742r, m118742r, m118742r, m118742r});
        } catch (NoSuchMethodError e11) {
            AbstractC23350e.m122776f(f70521E, e11);
        }
    }

    public C13658k(View view) {
        this.f70535h = view;
        m76341t(0, AbstractC11531v0.m62210V2(view.getContext()) - AbstractC23136l9.m118742r(1.0f));
        this.f70548u = new Paint(1);
        this.f70549v = true;
        this.f70546s = false;
        int i11 = this.f70531d;
        this.f70540m = i11;
        this.f70541n = i11;
    }

    /* renamed from: b */
    private void m76322b(Canvas canvas) {
        this.f70548u.setColor(this.f70527D);
        RoundRectShape roundRectShape = f70522F;
        if (roundRectShape != null) {
            roundRectShape.resize(this.f70540m, this.f70541n);
        }
        canvas.save();
        int i11 = f70523G;
        canvas.clipRect(0, 0, i11, i11);
        RoundRectShape roundRectShape2 = f70522F;
        if (roundRectShape2 != null) {
            roundRectShape2.draw(canvas, this.f70548u);
        }
        canvas.restore();
        canvas.save();
        int i12 = this.f70540m;
        canvas.clipRect(i12 - i11, 0, i12, i11);
        RoundRectShape roundRectShape3 = f70522F;
        if (roundRectShape3 != null) {
            roundRectShape3.draw(canvas, this.f70548u);
        }
        canvas.restore();
        canvas.save();
        int i13 = this.f70541n;
        canvas.clipRect(0, i13 - i11, i11, i13);
        RoundRectShape roundRectShape4 = f70522F;
        if (roundRectShape4 != null) {
            roundRectShape4.draw(canvas, this.f70548u);
        }
        canvas.restore();
        canvas.save();
        int i14 = this.f70540m;
        int i15 = this.f70541n;
        canvas.clipRect(i14 - i11, i15 - i11, i14, i15);
        RoundRectShape roundRectShape5 = f70522F;
        if (roundRectShape5 != null) {
            roundRectShape5.draw(canvas, this.f70548u);
        }
        canvas.restore();
    }

    /* renamed from: k */
    private void m76323k() {
        if (this.f70552y != null) {
            Bitmap bitmap = this.f70524A;
            if (bitmap == null || bitmap.getWidth() != this.f70540m || this.f70524A.getHeight() != this.f70541n) {
                this.f70524A = Bitmap.createBitmap(this.f70540m, this.f70541n, Bitmap.Config.ARGB_8888);
                this.f70525B = new Canvas(this.f70524A);
            }
            float max = Math.max(this.f70540m / this.f70552y.getWidth(), this.f70541n / this.f70552y.getHeight());
            this.f70526C.setScale(max, max);
        }
    }

    /* renamed from: l */
    private void m76324l() {
        Bitmap bitmap = this.f70536i;
        if (bitmap != null && !this.f70547t) {
            this.f70547t = true;
            this.f70544q = bitmap.getWidth();
            int height = this.f70536i.getHeight();
            this.f70545r = height;
            double max = Math.max(this.f70540m / this.f70544q, this.f70541n / height);
            int i11 = (int) (this.f70544q * max);
            this.f70544q = i11;
            int i12 = (int) (this.f70545r * max);
            this.f70545r = i12;
            this.f70542o = (i11 - this.f70540m) / 2;
            this.f70543p = (i12 - this.f70541n) / 2;
        }
    }

    /* renamed from: a */
    public void m76325a(Canvas canvas) {
        if (!this.f70546s) {
            m76324l();
        }
        canvas.save();
        canvas.translate(this.f70538k, this.f70539l);
        canvas.clipRect(0, 0, this.f70540m, this.f70541n);
        if (this.f70551x) {
            Canvas canvas2 = this.f70525B;
            if (canvas2 != null) {
                canvas2.drawARGB(0, 0, 0, 0);
                Drawable drawable = this.f70537j;
                if (drawable != null) {
                    int i11 = this.f70542o;
                    int i12 = this.f70543p;
                    drawable.setBounds(-i11, -i12, (-i11) + this.f70544q, (-i12) + this.f70545r);
                    this.f70537j.draw(this.f70525B);
                }
                this.f70525B.drawBitmap(this.f70552y, this.f70526C, this.f70528a);
                this.f70525B.drawBitmap(this.f70553z, this.f70526C, this.f70529b);
            }
            canvas.drawARGB(0, 0, 0, 0);
            Bitmap bitmap = this.f70524A;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f70529b);
            }
        } else {
            Drawable drawable2 = this.f70537j;
            if (drawable2 != null) {
                int i13 = this.f70542o;
                int i14 = this.f70543p;
                drawable2.setBounds(-i13, -i14, (-i13) + this.f70544q, (-i14) + this.f70545r);
                this.f70537j.draw(canvas);
            }
            if (this.f70549v) {
                m76322b(canvas);
            }
        }
        canvas.restore();
    }

    /* renamed from: c */
    public int m76326c() {
        return this.f70541n;
    }

    /* renamed from: d */
    public int m76327d() {
        return this.f70538k;
    }

    /* renamed from: e */
    public int m76328e() {
        return this.f70539l;
    }

    /* renamed from: f */
    public int m76329f() {
        return this.f70540m;
    }

    /* renamed from: g */
    public void m76330g() {
        this.f70543p = 0;
        this.f70542o = 0;
        int i11 = this.f70531d;
        this.f70540m = i11;
        int i12 = this.f70530c;
        if (i12 == 2) {
            this.f70541n = (int) (i11 * 0.6399999856948853d);
        } else if (i12 == 4) {
            this.f70541n = this.f70532e;
        } else {
            this.f70541n = i11;
        }
        this.f70544q = i11;
        this.f70545r = this.f70541n;
    }

    /* renamed from: h */
    public void m76331h() {
        try {
            if (this.f70550w == null) {
                ColorDrawable colorDrawable = new ColorDrawable(AbstractC11531v0.m62256f3());
                this.f70550w = colorDrawable;
                colorDrawable.setBounds(0, 0, this.f70540m, this.f70541n);
            }
            this.f70536i = null;
            this.f70537j = this.f70550w;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: i */
    public void m76332i() {
        int i11 = this.f70531d;
        this.f70540m = i11;
        int i12 = this.f70530c;
        if (i12 == 2) {
            this.f70541n = (int) (i11 * 0.6399999856948853d);
        } else {
            if (i12 != 4) {
                this.f70541n = i11;
                return;
            }
            int i13 = this.f70532e;
            this.f70540m = i13;
            this.f70541n = i13;
        }
    }

    /* renamed from: j */
    protected void m76333j() {
        double d11 = this.f70545r / this.f70544q;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ratio ");
        sb2.append(d11);
        this.f70542o = 0;
        this.f70543p = 0;
        int i11 = this.f70530c;
        if (i11 == 3) {
            int i12 = this.f70531d;
            this.f70540m = i12;
            int i13 = (this.f70545r * i12) / this.f70544q;
            this.f70541n = i13;
            this.f70544q = i12;
            this.f70545r = i13;
            return;
        }
        if (i11 == 2) {
            if (d11 > 0.6399999856948853d) {
                int i14 = this.f70531d;
                this.f70540m = i14;
                int i15 = (int) (i14 * 0.6399999856948853d);
                this.f70541n = i15;
                double d12 = i14;
                int i16 = this.f70544q;
                double d13 = d12 / i16;
                this.f70544q = (int) (i16 * d13);
                int i17 = (int) (this.f70545r * d13);
                this.f70545r = i17;
                this.f70543p = (i17 - i15) / 2;
                return;
            }
            int i18 = this.f70532e;
            this.f70541n = i18;
            int i19 = this.f70545r;
            double d14 = i18 / i19;
            this.f70545r = (int) (i19 * d14);
            int i21 = (int) (this.f70544q * d14);
            this.f70544q = i21;
            this.f70542o = (i21 - this.f70540m) / 2;
            return;
        }
        if (i11 == 4) {
            if (0.25d <= d11 && d11 <= 1.5d) {
                int i22 = this.f70532e;
                this.f70541n = i22;
                int i23 = (this.f70544q * i22) / this.f70545r;
                this.f70540m = i23;
                this.f70544q = i23;
                this.f70545r = i22;
                int i24 = this.f70531d;
                if (i23 > i24) {
                    this.f70542o = (i23 - i23) / 2;
                    this.f70540m = i24;
                    return;
                }
                return;
            }
            if (d11 < 0.25d) {
                int i25 = this.f70534g;
                this.f70541n = i25;
                int i26 = this.f70545r;
                double d15 = i25 / i26;
                this.f70545r = (int) (i26 * d15);
                int i27 = (int) (this.f70544q * d15);
                this.f70544q = i27;
                int min = Math.min(this.f70531d, i27);
                this.f70540m = min;
                this.f70542o = (this.f70544q - min) / 2;
                return;
            }
            int i28 = this.f70533f;
            this.f70540m = i28;
            int i29 = this.f70544q;
            double d16 = i28 / i29;
            this.f70544q = (int) (i29 * d16);
            int i31 = (int) (this.f70545r * d16);
            this.f70545r = i31;
            int i32 = this.f70532e;
            this.f70541n = i32;
            this.f70543p = (i31 - i32) / 2;
            return;
        }
        if (0.25d <= d11 && d11 <= 1.5d) {
            int i33 = this.f70531d;
            this.f70540m = i33;
            int i34 = (this.f70545r * i33) / this.f70544q;
            this.f70541n = i34;
            this.f70544q = i33;
            this.f70545r = i34;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f70540m);
            sb3.append(", ");
            sb3.append(this.f70541n);
            return;
        }
        if (d11 < 0.25d) {
            int i35 = this.f70534g;
            this.f70541n = i35;
            int i36 = this.f70545r;
            double d17 = i35 / i36;
            int i37 = (int) (i36 * d17);
            this.f70545r = i37;
            int i38 = (int) (this.f70544q * d17);
            this.f70544q = i38;
            int min2 = Math.min(this.f70531d, (i35 * i38) / i37);
            this.f70540m = min2;
            this.f70542o = (this.f70544q - min2) / 2;
            return;
        }
        int i39 = this.f70533f;
        this.f70540m = i39;
        int i41 = this.f70544q;
        double d18 = i39 / i41;
        int i42 = (int) (i41 * d18);
        this.f70544q = i42;
        int i43 = (int) (this.f70545r * d18);
        this.f70545r = i43;
        int min3 = Math.min(this.f70532e, (i39 * i43) / i42);
        this.f70541n = min3;
        this.f70543p = (this.f70545r - min3) / 2;
    }

    /* renamed from: m */
    public void m76334m(Bitmap bitmap, boolean z11) {
        m76335n(bitmap, z11, 200);
    }

    /* renamed from: n */
    public void m76335n(Bitmap bitmap, boolean z11, int i11) {
        Drawable drawable;
        if (this.f70536i != bitmap) {
            if (z11) {
                if (this.f70536i != null) {
                    drawable = new BitmapDrawable(this.f70535h.getResources(), this.f70536i);
                } else {
                    drawable = this.f70550w;
                }
                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, new BitmapDrawable(this.f70535h.getResources(), bitmap)});
                this.f70537j = transitionDrawable;
                transitionDrawable.setCallback(this.f70535h);
                ((TransitionDrawable) this.f70537j).setCrossFadeEnabled(true);
                ((TransitionDrawable) this.f70537j).startTransition(i11);
            } else {
                this.f70537j = new BitmapDrawable(this.f70535h.getContext().getResources(), bitmap);
            }
            this.f70536i = bitmap;
            this.f70547t = false;
        }
    }

    /* renamed from: o */
    public void m76336o(int i11, int i12) {
        this.f70544q = i11;
        this.f70545r = i12;
        this.f70546s = true;
        m76333j();
    }

    /* renamed from: p */
    public void m76337p(int i11, int i12) {
        this.f70546s = false;
        this.f70543p = 0;
        this.f70542o = 0;
        this.f70540m = i11;
        this.f70541n = i12;
        this.f70544q = i11;
        this.f70545r = i12;
    }

    /* renamed from: q */
    public void m76338q(boolean z11, int i11, int i12) {
        this.f70551x = z11;
        if (z11) {
            Paint paint = new Paint();
            this.f70528a = paint;
            paint.setAntiAlias(true);
            this.f70528a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            Paint paint2 = new Paint();
            this.f70529b = paint2;
            paint2.setAntiAlias(true);
            this.f70526C = new Matrix();
            HashMap hashMap = MaskableImageView.f69376J;
            synchronized (hashMap) {
                try {
                    WeakReference weakReference = (WeakReference) hashMap.get(Integer.valueOf(i11));
                    if (weakReference != null) {
                        this.f70552y = (Bitmap) weakReference.get();
                    }
                    if (this.f70552y == null) {
                        this.f70552y = BitmapFactory.decodeResource(this.f70535h.getResources(), i11);
                        hashMap.put(Integer.valueOf(i11), new WeakReference(this.f70552y));
                    }
                    WeakReference weakReference2 = (WeakReference) hashMap.get(Integer.valueOf(i12));
                    if (weakReference2 != null) {
                        this.f70553z = (Bitmap) weakReference2.get();
                    }
                    if (this.f70553z == null) {
                        this.f70553z = BitmapFactory.decodeResource(this.f70535h.getResources(), i12);
                        hashMap.put(Integer.valueOf(i12), new WeakReference(this.f70553z));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            m76323k();
        }
    }

    /* renamed from: r */
    public void m76339r(int i11, int i12) {
        this.f70538k = i11;
        this.f70539l = i12;
    }

    /* renamed from: s */
    public void m76340s(int i11) {
        this.f70527D = i11;
    }

    /* renamed from: t */
    public void m76341t(int i11, int i12) {
        if (this.f70530c == i11 && (this.f70531d == i12 || this.f70532e == i12)) {
            return;
        }
        this.f70530c = i11;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        this.f70531d = i12;
                        double d11 = i12;
                        this.f70533f = (int) (d11 / 1.5d);
                        this.f70534g = (int) (0.25d * d11);
                        this.f70532e = (int) (d11 * 1.3333333730697632d);
                    } else {
                        this.f70532e = i12;
                        this.f70534g = i12;
                        double d12 = i12;
                        this.f70531d = (int) (d12 / 0.25d);
                        this.f70533f = (int) (d12 / 1.5d);
                    }
                } else {
                    this.f70531d = i12;
                    this.f70533f = i12;
                    this.f70534g = i12;
                    this.f70532e = i12;
                }
            } else {
                this.f70531d = i12;
                int i13 = (int) (i12 * 0.6399999856948853d);
                this.f70532e = i13;
                this.f70533f = i12;
                this.f70534g = i13;
            }
        } else {
            this.f70531d = i12;
            this.f70533f = i12;
            double d13 = i12;
            this.f70534g = (int) (0.25d * d13);
            this.f70532e = (int) (d13 * 1.3333333730697632d);
        }
        m76330g();
        if (this.f70551x) {
            m76323k();
        }
    }

    /* renamed from: u */
    public void m76342u(boolean z11) {
        this.f70546s = z11;
        m76332i();
    }

    /* renamed from: v */
    public void m76343v(boolean z11) {
        this.f70549v = z11;
    }
}
