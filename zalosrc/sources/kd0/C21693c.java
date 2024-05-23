package kd0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.zing.zalo.uidrawing.C16719g;
import id0.AbstractC20521g;
import id0.C20516b;
import id0.C20518d;
import java.util.Objects;
import p193h0.AbstractC19694b;

/* renamed from: kd0.c */
/* loaded from: classes4.dex */
public class C21693c extends C16719g {

    /* renamed from: V0 */
    private static final Bitmap.Config f105297V0 = Bitmap.Config.ARGB_8888;

    /* renamed from: D0 */
    d f105298D0;

    /* renamed from: E0 */
    d f105299E0;

    /* renamed from: F0 */
    private boolean f105300F0;

    /* renamed from: G0 */
    int f105301G0;

    /* renamed from: H0 */
    int f105302H0;

    /* renamed from: I0 */
    private Bitmap f105303I0;

    /* renamed from: J0 */
    private Drawable f105304J0;

    /* renamed from: K0 */
    private int f105305K0;

    /* renamed from: L0 */
    private int f105306L0;

    /* renamed from: M0 */
    private boolean f105307M0;

    /* renamed from: N0 */
    private float f105308N0;

    /* renamed from: O0 */
    private float f105309O0;

    /* renamed from: P0 */
    private float f105310P0;

    /* renamed from: Q0 */
    private float f105311Q0;

    /* renamed from: R0 */
    private float[] f105312R0;

    /* renamed from: S0 */
    private boolean f105313S0;

    /* renamed from: T0 */
    private ColorFilter f105314T0;

    /* renamed from: U0 */
    private boolean f105315U0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kd0.c$c */
    /* loaded from: classes4.dex */
    public static class c implements d {

        /* renamed from: a */
        private Drawable f105324a;

        /* renamed from: b */
        int f105325b;

        /* renamed from: c */
        int f105326c;

        /* renamed from: d */
        int f105327d;

        /* renamed from: e */
        int f105328e;

        /* renamed from: f */
        private int f105329f;

        /* renamed from: g */
        private int f105330g;

        /* renamed from: h */
        private boolean f105331h;

        public c(Drawable drawable) {
            this.f105324a = drawable;
        }

        @Override // kd0.C21693c.d
        /* renamed from: a */
        public void mo111930a(ColorFilter colorFilter) {
            Drawable drawable = this.f105324a;
            if (drawable != null && !Objects.equals(drawable.getColorFilter(), colorFilter)) {
                Drawable mutate = this.f105324a.mutate();
                this.f105324a = mutate;
                mutate.setColorFilter(colorFilter);
            }
        }

        @Override // kd0.C21693c.d
        /* renamed from: b */
        public void mo111931b(int i11, int i12, int i13) {
            boolean z11;
            int i14;
            int i15;
            float min;
            float f11;
            float f12;
            float f13;
            float f14;
            Drawable drawable = this.f105324a;
            if (drawable == null) {
                return;
            }
            this.f105329f = i11;
            this.f105330g = i12;
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.f105324a.getIntrinsicHeight();
            if (i11 > 0 && i12 > 0) {
                boolean z12 = true;
                if (intrinsicWidth > 0 && intrinsicHeight > 0 && (i11 != intrinsicWidth || i12 != intrinsicHeight)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (3 == i13 || z11) {
                    intrinsicWidth = i11;
                    intrinsicHeight = i12;
                } else {
                    if (i13 == 4) {
                        i14 = (int) ((i11 - intrinsicWidth) * 0.5f);
                        i15 = (int) ((i12 - intrinsicHeight) * 0.5f);
                    } else {
                        if (i13 == 5) {
                            if (intrinsicWidth * i12 > i11 * intrinsicHeight) {
                                f13 = i12;
                                f14 = intrinsicHeight;
                            } else {
                                f13 = i11;
                                f14 = intrinsicWidth;
                            }
                            float f15 = f13 / f14;
                            f11 = intrinsicWidth * f15;
                            i14 = Math.round((i11 - f11) * 0.5f);
                            f12 = intrinsicHeight * f15;
                            i15 = Math.round((i12 - f12) * 0.5f);
                        } else if (i13 == 6) {
                            if (intrinsicWidth <= i11 && intrinsicHeight <= i12) {
                                min = 1.0f;
                            } else {
                                min = Math.min(i11 / intrinsicWidth, i12 / intrinsicHeight);
                            }
                            f11 = intrinsicWidth * min;
                            i14 = Math.round((i11 - f11) * 0.5f);
                            f12 = intrinsicHeight * min;
                            i15 = Math.round((i12 - f12) * 0.5f);
                        } else if (i13 != 0 && i13 != 1 && i13 != 2) {
                            i14 = 0;
                            i15 = 0;
                            intrinsicWidth = 0;
                            intrinsicHeight = 0;
                        } else {
                            float f16 = intrinsicWidth;
                            float f17 = intrinsicHeight;
                            float min2 = Math.min(i11 / f16, i12 / f17);
                            intrinsicWidth = (int) (f16 * min2);
                            intrinsicHeight = (int) (f17 * min2);
                            if (i13 != 0) {
                                if (i13 != 1 && i13 == 2) {
                                    i14 = Math.round(i11 - intrinsicWidth);
                                    i15 = Math.round(i12 - intrinsicHeight);
                                }
                            } else {
                                i14 = Math.round((i11 - intrinsicWidth) * 0.5f);
                                i15 = Math.round((i12 - intrinsicHeight) * 0.5f);
                            }
                        }
                        intrinsicHeight = (int) f12;
                        intrinsicWidth = (int) f11;
                    }
                    this.f105325b = i14;
                    this.f105326c = i15;
                    this.f105327d = intrinsicWidth + i14;
                    this.f105328e = intrinsicHeight + i15;
                    if (i14 >= 0 && i15 >= 0) {
                        z12 = false;
                    }
                    this.f105331h = z12;
                }
                i14 = 0;
                i15 = 0;
                this.f105325b = i14;
                this.f105326c = i15;
                this.f105327d = intrinsicWidth + i14;
                this.f105328e = intrinsicHeight + i15;
                if (i14 >= 0) {
                    z12 = false;
                }
                this.f105331h = z12;
            }
        }

        @Override // kd0.C21693c.d
        /* renamed from: c */
        public void mo111932c(int i11) {
            Drawable drawable = this.f105324a;
            if (drawable != null) {
                drawable.setAlpha(i11);
            }
        }

        @Override // kd0.C21693c.d
        /* renamed from: d */
        public void mo111933d(Canvas canvas) {
            if (this.f105324a != null) {
                boolean z11 = false;
                if (this.f105331h) {
                    canvas.save();
                    canvas.clipRect(0, 0, this.f105329f, this.f105330g);
                    z11 = true;
                }
                this.f105324a.setBounds(this.f105325b, this.f105326c, this.f105327d, this.f105328e);
                this.f105324a.draw(canvas);
                if (z11) {
                    canvas.restore();
                }
            }
        }

        @Override // kd0.C21693c.d
        public boolean isValid() {
            Drawable drawable = this.f105324a;
            if (drawable != null && (!(drawable instanceof BitmapDrawable) || (((BitmapDrawable) drawable).getBitmap() != null && !((BitmapDrawable) this.f105324a).getBitmap().isRecycled()))) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: kd0.c$d */
    /* loaded from: classes4.dex */
    public interface d {
        /* renamed from: a */
        void mo111930a(ColorFilter colorFilter);

        /* renamed from: b */
        void mo111931b(int i11, int i12, int i13);

        /* renamed from: c */
        void mo111932c(int i11);

        /* renamed from: d */
        void mo111933d(Canvas canvas);

        boolean isValid();
    }

    /* renamed from: kd0.c$e */
    /* loaded from: classes4.dex */
    public static class e extends AbstractC20521g {
        @Override // id0.AbstractC20521g
        /* renamed from: f */
        public Float mo106578a(float f11) {
            Object obj = this.f100807a;
            if (obj != null && this.f100808b != null) {
                return Float.valueOf(((Float) obj).floatValue() + ((((Float) this.f100808b).floatValue() - ((Float) this.f100807a).floatValue()) * f11));
            }
            return Float.valueOf(f11);
        }

        @Override // id0.AbstractC20521g
        /* renamed from: g */
        public Float mo106579c(C16719g c16719g) {
            return Float.valueOf(c16719g.m89092E());
        }

        @Override // id0.AbstractC20521g
        /* renamed from: h */
        public boolean mo106580d(C16719g c16719g, Float f11) {
            boolean z11 = false;
            if (!(c16719g instanceof C21693c) || f11 == null) {
                return false;
            }
            C21693c c21693c = (C21693c) c16719g;
            d dVar = c21693c.f105299E0;
            if (dVar != null && dVar.isValid()) {
                c21693c.f105299E0.mo111932c((int) (c21693c.m89086B() * (1.0f - f11.floatValue())));
                c21693c.invalidate();
                z11 = true;
            }
            d dVar2 = c21693c.f105298D0;
            if (dVar2 != null) {
                dVar2.mo111932c((int) (c21693c.m89086B() * f11.floatValue()));
                c21693c.invalidate();
                return true;
            }
            return z11;
        }
    }

    public C21693c(Context context) {
        super(context);
    }

    /* renamed from: A1 */
    private boolean m111909A1() {
        if ((!this.f105307M0 && this.f105308N0 == 0.0f && this.f105309O0 == 0.0f && this.f105310P0 == 0.0f && this.f105311Q0 == 0.0f) || (this.f105303I0 == null && !(this.f105304J0 instanceof BitmapDrawable))) {
            return false;
        }
        return true;
    }

    /* renamed from: i1 */
    private void m111912i1() {
        this.f105300F0 = false;
        if (m89106L().f84708d != -2 && m89106L().f84709e != -2) {
            invalidate();
        } else {
            requestLayout();
        }
    }

    /* renamed from: p1 */
    private boolean m111913p1(Drawable drawable) {
        return drawable instanceof Animatable;
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: i */
    public void mo89140i() {
        super.mo89140i();
        this.f105299E0 = null;
    }

    /* renamed from: j1 */
    public void mo111914j1() {
        if (this.f105304J0 != null || this.f105303I0 != null) {
            this.f105298D0 = null;
            this.f105299E0 = null;
            this.f105304J0 = null;
            this.f105303I0 = null;
            this.f105305K0 = 0;
            m111912i1();
        }
    }

    /* renamed from: k1 */
    public void m111915k1() {
        this.f105300F0 = false;
        invalidate();
    }

    /* renamed from: l1 */
    public int m111916l1() {
        Bitmap bitmap = this.f105303I0;
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        Drawable drawable = this.f105304J0;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return 0;
    }

    /* renamed from: m1 */
    public int m111917m1() {
        Bitmap bitmap = this.f105303I0;
        if (bitmap != null) {
            return bitmap.getWidth();
        }
        Drawable drawable = this.f105304J0;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return 0;
    }

    /* renamed from: n1 */
    public int m111918n1() {
        return this.f105306L0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057 A[Catch: Exception -> 0x0049, TRY_LEAVE, TryCatch #0 {Exception -> 0x0049, blocks: (B:2:0x0000, B:4:0x0019, B:15:0x0031, B:18:0x0037, B:20:0x003d, B:22:0x0045, B:23:0x0052, B:25:0x0057, B:29:0x004b, B:30:0x0028), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b A[Catch: Exception -> 0x0049, TryCatch #0 {Exception -> 0x0049, blocks: (B:2:0x0000, B:4:0x0019, B:15:0x0031, B:18:0x0037, B:20:0x003d, B:22:0x0045, B:23:0x0052, B:25:0x0057, B:29:0x004b, B:30:0x0028), top: B:1:0x0000 }] */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo44775o0(Canvas canvas) {
        boolean z11;
        try {
            d dVar = this.f105298D0;
            d dVar2 = this.f105299E0;
            C20516b c20516b = this.f84766Z;
            int i11 = m89106L().f84716l;
            int i12 = m89106L().f84717m;
            super.mo44775o0(canvas);
            if (this.f105301G0 <= 0 || this.f105302H0 <= 0 || dVar == null) {
                return;
            }
            if (i11 == 0 && i12 == 0) {
                z11 = false;
                if (!(c20516b instanceof C20518d)) {
                    if (dVar2 != null && dVar2.isValid() && !((C20518d) c20516b).m106601q()) {
                        dVar2.mo111933d(canvas);
                    }
                } else {
                    dVar.mo111932c(m89086B());
                }
                dVar.mo111933d(canvas);
                if (!z11) {
                    canvas.restore();
                    return;
                }
                return;
            }
            canvas.save();
            canvas.translate(i11, i12);
            z11 = true;
            if (!(c20516b instanceof C20518d)) {
            }
            dVar.mo111933d(canvas);
            if (!z11) {
            }
        } catch (Exception e11) {
            if (m89119T() == null) {
                return;
            }
            throw new RuntimeException("recycled bitmap " + m89119T().getClass().getName(), e11);
        }
    }

    /* renamed from: o1 */
    public boolean m111919o1() {
        return this.f105313S0;
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        int intrinsicWidth;
        int intrinsicHeight;
        int i15;
        int i16;
        Bitmap bitmap = this.f105303I0;
        Drawable drawable = this.f105304J0;
        int i17 = this.f105306L0;
        if (bitmap == null && drawable == null) {
            super.mo44180q0(i11, i12, i13, i14);
            return;
        }
        if (bitmap != null) {
            intrinsicWidth = bitmap.getWidth();
        } else {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        if (bitmap != null) {
            intrinsicHeight = bitmap.getHeight();
        } else {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        if (i12 == 1073741824) {
            i15 = i11;
        } else if (i12 == Integer.MIN_VALUE) {
            i15 = Math.min(i11, intrinsicWidth);
        } else {
            i15 = intrinsicWidth;
        }
        if (i14 == 1073741824) {
            i16 = i13;
        } else if (i14 == Integer.MIN_VALUE) {
            i16 = Math.min(i13, intrinsicHeight);
        } else {
            i16 = intrinsicHeight;
        }
        if (m111919o1()) {
            if (i12 == 1073741824 && i14 != 1073741824) {
                if (i17 != 4 && (i17 != 6 || intrinsicWidth >= i11)) {
                    if (intrinsicWidth == 0) {
                        intrinsicHeight = 0;
                    } else {
                        intrinsicHeight = (int) ((intrinsicHeight / intrinsicWidth) * i15);
                    }
                }
                if (i14 == Integer.MIN_VALUE) {
                    i16 = Math.min(i13, intrinsicHeight);
                } else {
                    i16 = intrinsicHeight;
                }
            } else if (i12 != 1073741824 && i14 == 1073741824) {
                if (i17 != 4 && (i17 != 6 || intrinsicHeight >= i13)) {
                    if (intrinsicHeight == 0) {
                        intrinsicWidth = 0;
                    } else {
                        intrinsicWidth = (int) ((intrinsicWidth / intrinsicHeight) * i16);
                    }
                }
                if (i12 == Integer.MIN_VALUE) {
                    i15 = Math.min(intrinsicWidth, i11);
                } else {
                    i15 = intrinsicWidth;
                }
            }
        }
        m89097G0(i15, i16);
    }

    /* renamed from: q1 */
    public boolean m111920q1() {
        return (this.f105303I0 == null && this.f105304J0 == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: r */
    public void mo88812r() {
        boolean z11;
        super.mo88812r();
        Bitmap bitmap = this.f105303I0;
        Drawable drawable = this.f105304J0;
        int m89110N = m89110N();
        int m89108M = m89108M();
        boolean z12 = this.f105315U0;
        ColorFilter colorFilter = this.f105314T0;
        boolean z13 = this.f105307M0;
        float[] fArr = this.f105312R0;
        if (this.f105300F0 && this.f105301G0 == m89110N && this.f105302H0 == m89108M) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f105300F0 = z11;
        if (z11) {
            return;
        }
        this.f105300F0 = true;
        if (m89110N > 0 && m89108M > 0) {
            c cVar = null;
            if (m111909A1()) {
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
                if (bitmap != null) {
                    b bVar = new b();
                    bVar.m111934e(bitmap);
                    bVar.f105322g = z13;
                    bVar.f105323h = fArr;
                    cVar = bVar;
                }
            } else {
                if (drawable == null && bitmap != null) {
                    drawable = new BitmapDrawable(getContext().getResources(), bitmap);
                }
                if (drawable != null) {
                    cVar = new c(drawable);
                }
            }
            if (cVar != null) {
                if (z12) {
                    cVar.mo111930a(colorFilter);
                }
                cVar.mo111931b(m89110N, m89108M, m111918n1());
            }
            this.f105298D0 = cVar;
            this.f105301G0 = m89110N;
            this.f105302H0 = m89108M;
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: r0 */
    public boolean mo89008r0() {
        return true;
    }

    /* renamed from: r1 */
    public void m111921r1(boolean z11) {
        if (z11 != this.f105313S0) {
            this.f105313S0 = z11;
            if (m89106L().f84708d == -2 || m89106L().f84709e == -2) {
                requestLayout();
            }
        }
    }

    /* renamed from: s1 */
    public void m111922s1(int i11, PorterDuff.Mode mode) {
        m111923t1(new PorterDuffColorFilter(i11, mode));
    }

    /* renamed from: t1 */
    public void m111923t1(ColorFilter colorFilter) {
        if (Objects.equals(this.f105314T0, colorFilter)) {
            return;
        }
        this.f105314T0 = colorFilter;
        this.f105315U0 = true;
        d dVar = this.f105298D0;
        if (dVar != null) {
            dVar.mo111930a(colorFilter);
        }
        d dVar2 = this.f105299E0;
        if (dVar2 != null) {
            dVar2.mo111930a(this.f105314T0);
        }
        invalidate();
    }

    /* renamed from: u1 */
    public void mo111924u1(Bitmap bitmap) {
        if (bitmap != this.f105303I0) {
            d dVar = this.f105298D0;
            mo111914j1();
            this.f105303I0 = bitmap;
            this.f105299E0 = dVar;
            m111912i1();
            return;
        }
        if (bitmap == null) {
            mo111914j1();
        }
    }

    /* renamed from: v1 */
    public void mo111925v1(Drawable drawable) {
        if (drawable != this.f105304J0) {
            d dVar = this.f105298D0;
            mo111914j1();
            if (m111913p1(this.f105304J0)) {
                this.f105304J0.setCallback(null);
            }
            this.f105304J0 = drawable;
            if (m111913p1(drawable)) {
                this.f105304J0.setCallback(this);
            }
            this.f105299E0 = dVar;
            m111912i1();
            return;
        }
        if (drawable == null) {
            mo111914j1();
        }
    }

    /* renamed from: w1 */
    public void mo111926w1(int i11) {
        Drawable m103336d;
        if (i11 != this.f105305K0) {
            this.f105305K0 = i11;
            if (i11 == 0) {
                m103336d = null;
            } else {
                m103336d = AbstractC19694b.m103336d(getContext(), i11);
            }
            mo111925v1(m103336d);
            return;
        }
        if (i11 == 0) {
            mo111914j1();
        }
    }

    /* renamed from: x1 */
    public void mo111927x1(float f11) {
        m111928y1(f11, f11, f11, f11);
    }

    /* renamed from: y1 */
    public void m111928y1(float f11, float f12, float f13, float f14) {
        if (this.f105308N0 == f11 && this.f105309O0 == f12) {
            float f15 = this.f105310P0;
            if (f15 == f15 && this.f105311Q0 == f14) {
                return;
            }
        }
        this.f105308N0 = f11;
        this.f105309O0 = f12;
        this.f105310P0 = f13;
        this.f105311Q0 = f14;
        this.f105312R0 = new float[]{f11, f11, f12, f12, f13, f13, f14, f14};
        if (!this.f105307M0) {
            m111915k1();
        }
    }

    /* renamed from: z1 */
    public void m111929z1(int i11) {
        if (this.f105306L0 != i11) {
            this.f105306L0 = i11;
            m111912i1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kd0.c$b */
    /* loaded from: classes4.dex */
    public static class b implements d {

        /* renamed from: a */
        private Bitmap f105316a;

        /* renamed from: b */
        private BitmapShader f105317b;

        /* renamed from: c */
        private Paint f105318c;

        /* renamed from: d */
        private Matrix f105319d;

        /* renamed from: e */
        private Path f105320e;

        /* renamed from: f */
        private RectF f105321f;

        /* renamed from: g */
        public boolean f105322g;

        /* renamed from: h */
        public float[] f105323h;

        private b() {
            this.f105318c = new Paint(1);
            this.f105319d = new Matrix();
            this.f105320e = new Path();
            this.f105321f = new RectF();
        }

        @Override // kd0.C21693c.d
        /* renamed from: a */
        public void mo111930a(ColorFilter colorFilter) {
            this.f105318c.setColorFilter(colorFilter);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0144  */
        @Override // kd0.C21693c.d
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo111931b(int i11, int i12, int i13) {
            boolean z11;
            int round;
            int i14;
            float min;
            float f11;
            float f12;
            Bitmap bitmap = this.f105316a;
            if (bitmap == null) {
                return;
            }
            int width = bitmap.getWidth();
            int height = this.f105316a.getHeight();
            if (width > 0 && height > 0 && i11 > 0 && i12 > 0) {
                this.f105319d.reset();
                int i15 = 0;
                if (i11 == width && i12 == height) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (3 == i13) {
                    this.f105319d.setScale(i11 / width, i12 / height);
                } else if (!z11) {
                    if (i13 == 4) {
                        int min2 = Math.min(i11, width);
                        int min3 = Math.min(i12, height);
                        i15 = (int) ((i11 - min2) * 0.5f);
                        i14 = (int) ((i12 - min3) * 0.5f);
                        this.f105319d.postTranslate((i11 - width) * 0.5f, (i12 - height) * 0.5f);
                        i11 = min2;
                        i12 = min3;
                    } else if (i13 == 5) {
                        float f13 = 0.0f;
                        if (width * i12 > i11 * height) {
                            f11 = i12 / height;
                            f13 = (i11 - (width * f11)) * 0.5f;
                            f12 = 0.0f;
                        } else {
                            f11 = i11 / width;
                            f12 = (i12 - (height * f11)) * 0.5f;
                        }
                        this.f105319d.setScale(f11, f11);
                        this.f105319d.postTranslate(f13, f12);
                    } else if (i13 == 6) {
                        if (width <= i11 && height <= i12) {
                            min = 1.0f;
                        } else {
                            min = Math.min(i11 / width, i12 / height);
                        }
                        float f14 = width * min;
                        float round2 = Math.round((i11 - f14) * 0.5f);
                        float f15 = height * min;
                        float round3 = Math.round((i12 - f15) * 0.5f);
                        this.f105319d.setScale(min, min);
                        this.f105319d.postTranslate(round2, round3);
                        i15 = (int) round2;
                        i14 = (int) round3;
                        i11 = (int) f14;
                        i12 = (int) f15;
                    } else if (i13 != 0 && i13 != 1 && i13 != 2) {
                        i11 = 0;
                        i12 = 0;
                    } else {
                        float f16 = width;
                        float f17 = height;
                        float min4 = Math.min(i11 / f16, i12 / f17);
                        int i16 = (int) (f16 * min4);
                        int i17 = (int) (f17 * min4);
                        if (i13 != 0) {
                            if (i13 == 1 || i13 != 2) {
                                round = 0;
                            } else {
                                i15 = Math.round(i11 - i16);
                                round = Math.round(i12 - i17);
                            }
                        } else {
                            i15 = Math.round((i11 - i16) * 0.5f);
                            round = Math.round((i12 - i17) * 0.5f);
                        }
                        this.f105319d.setScale(min4, min4);
                        this.f105319d.postTranslate(i15, round);
                        i14 = round;
                        i11 = i16;
                        i12 = i17;
                    }
                    this.f105317b.setLocalMatrix(this.f105319d);
                    this.f105320e.reset();
                    if (!this.f105322g) {
                        float f18 = i11 / 2.0f;
                        float f19 = i12 / 2.0f;
                        this.f105320e.addCircle(i15 + f18, i14 + f19, Math.min(f18, f19), Path.Direction.CW);
                        return;
                    }
                    if (this.f105323h != null) {
                        this.f105321f.set(i15, i14, i15 + i11, i14 + i12);
                        this.f105320e.addRoundRect(this.f105321f, this.f105323h, Path.Direction.CW);
                        return;
                    } else {
                        this.f105321f.set(i15, i14, i15 + i11, i14 + i12);
                        this.f105320e.addRect(this.f105321f, Path.Direction.CW);
                        return;
                    }
                }
                i14 = 0;
                this.f105317b.setLocalMatrix(this.f105319d);
                this.f105320e.reset();
                if (!this.f105322g) {
                }
            }
        }

        @Override // kd0.C21693c.d
        /* renamed from: c */
        public void mo111932c(int i11) {
            this.f105318c.setAlpha(i11);
        }

        @Override // kd0.C21693c.d
        /* renamed from: d */
        public void mo111933d(Canvas canvas) {
            if (this.f105316a != null) {
                canvas.drawPath(this.f105320e, this.f105318c);
            }
        }

        /* renamed from: e */
        public void m111934e(Bitmap bitmap) {
            this.f105316a = bitmap;
            if (bitmap != null) {
                Bitmap bitmap2 = this.f105316a;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                this.f105317b = bitmapShader;
                this.f105318c.setShader(bitmapShader);
                return;
            }
            this.f105317b = null;
            this.f105318c.setShader(null);
        }

        @Override // kd0.C21693c.d
        public boolean isValid() {
            Bitmap bitmap = this.f105316a;
            if (bitmap != null && !bitmap.isRecycled()) {
                return true;
            }
            return false;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }
}
