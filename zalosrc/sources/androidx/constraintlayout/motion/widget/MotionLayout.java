package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.C1276p;
import androidx.constraintlayout.widget.AbstractC1298f;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.C1294b;
import androidx.constraintlayout.widget.C1295c;
import androidx.constraintlayout.widget.C1300h;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.core.view.InterfaceC1543e0;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p007a1.C0023d;
import p045c1.AbstractC3194m;
import p045c1.C3182a;
import p045c1.C3186e;
import p045c1.C3187f;
import p045c1.C3188g;
import p045c1.C3189h;
import p045c1.C3191j;
import p045c1.C3193l;
import p045c1.InterfaceC3190i;
import p118e1.C18159b;
import p664y.AbstractC30228a;

/* loaded from: classes2.dex */
public class MotionLayout extends ConstraintLayout implements InterfaceC1543e0 {

    /* renamed from: r1 */
    public static boolean f4934r1;

    /* renamed from: A0 */
    float f4935A0;

    /* renamed from: B0 */
    long f4936B0;

    /* renamed from: C0 */
    float f4937C0;

    /* renamed from: D0 */
    private boolean f4938D0;

    /* renamed from: E0 */
    private ArrayList f4939E0;

    /* renamed from: F0 */
    private ArrayList f4940F0;

    /* renamed from: G0 */
    private ArrayList f4941G0;

    /* renamed from: H0 */
    private CopyOnWriteArrayList f4942H0;

    /* renamed from: I0 */
    private int f4943I0;

    /* renamed from: J0 */
    private long f4944J0;

    /* renamed from: K0 */
    private float f4945K0;

    /* renamed from: L0 */
    private int f4946L0;

    /* renamed from: M0 */
    private float f4947M0;

    /* renamed from: N */
    C1276p f4948N;

    /* renamed from: N0 */
    boolean f4949N0;

    /* renamed from: O */
    Interpolator f4950O;

    /* renamed from: O0 */
    protected boolean f4951O0;

    /* renamed from: P */
    Interpolator f4952P;

    /* renamed from: P0 */
    int f4953P0;

    /* renamed from: Q */
    float f4954Q;

    /* renamed from: Q0 */
    int f4955Q0;

    /* renamed from: R */
    private int f4956R;

    /* renamed from: R0 */
    int f4957R0;

    /* renamed from: S */
    int f4958S;

    /* renamed from: S0 */
    int f4959S0;

    /* renamed from: T */
    private int f4960T;

    /* renamed from: T0 */
    int f4961T0;

    /* renamed from: U */
    private int f4962U;

    /* renamed from: U0 */
    int f4963U0;

    /* renamed from: V */
    private int f4964V;

    /* renamed from: V0 */
    float f4965V0;

    /* renamed from: W */
    private boolean f4966W;

    /* renamed from: W0 */
    private C0023d f4967W0;

    /* renamed from: X0 */
    private boolean f4968X0;

    /* renamed from: Y0 */
    private C1258i f4969Y0;

    /* renamed from: Z0 */
    private Runnable f4970Z0;

    /* renamed from: a0 */
    HashMap f4971a0;

    /* renamed from: a1 */
    private int[] f4972a1;

    /* renamed from: b0 */
    private long f4973b0;

    /* renamed from: b1 */
    int f4974b1;

    /* renamed from: c0 */
    private float f4975c0;

    /* renamed from: c1 */
    private boolean f4976c1;

    /* renamed from: d0 */
    float f4977d0;

    /* renamed from: d1 */
    int f4978d1;

    /* renamed from: e0 */
    float f4979e0;

    /* renamed from: e1 */
    HashMap f4980e1;

    /* renamed from: f0 */
    private long f4981f0;

    /* renamed from: f1 */
    private int f4982f1;

    /* renamed from: g0 */
    float f4983g0;

    /* renamed from: g1 */
    private int f4984g1;

    /* renamed from: h0 */
    private boolean f4985h0;

    /* renamed from: h1 */
    private int f4986h1;

    /* renamed from: i0 */
    boolean f4987i0;

    /* renamed from: i1 */
    Rect f4988i1;

    /* renamed from: j0 */
    boolean f4989j0;

    /* renamed from: j1 */
    private boolean f4990j1;

    /* renamed from: k0 */
    private InterfaceC1259j f4991k0;

    /* renamed from: k1 */
    EnumC1260k f4992k1;

    /* renamed from: l0 */
    private float f4993l0;

    /* renamed from: l1 */
    C1255f f4994l1;

    /* renamed from: m0 */
    private float f4995m0;

    /* renamed from: m1 */
    private boolean f4996m1;

    /* renamed from: n0 */
    int f4997n0;

    /* renamed from: n1 */
    private RectF f4998n1;

    /* renamed from: o0 */
    C1254e f4999o0;

    /* renamed from: o1 */
    private View f5000o1;

    /* renamed from: p0 */
    private boolean f5001p0;

    /* renamed from: p1 */
    private Matrix f5002p1;

    /* renamed from: q0 */
    private C18159b f5003q0;

    /* renamed from: q1 */
    ArrayList f5004q1;

    /* renamed from: r0 */
    private C1253d f5005r0;

    /* renamed from: s0 */
    private C1262b f5006s0;

    /* renamed from: t0 */
    boolean f5007t0;

    /* renamed from: u0 */
    int f5008u0;

    /* renamed from: v0 */
    int f5009v0;

    /* renamed from: w0 */
    int f5010w0;

    /* renamed from: x0 */
    int f5011x0;

    /* renamed from: y0 */
    boolean f5012y0;

    /* renamed from: z0 */
    float f5013z0;

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$a */
    /* loaded from: classes2.dex */
    class RunnableC1250a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ View f5014p;

        RunnableC1250a(View view) {
            this.f5014p = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5014p.setNestedScrollingEnabled(true);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$b */
    /* loaded from: classes2.dex */
    class RunnableC1251b implements Runnable {
        RunnableC1251b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.f4969Y0.m6049a();
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$c */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C1252c {

        /* renamed from: a */
        static final /* synthetic */ int[] f5017a;

        static {
            int[] iArr = new int[EnumC1260k.values().length];
            f5017a = iArr;
            try {
                iArr[EnumC1260k.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5017a[EnumC1260k.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5017a[EnumC1260k.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5017a[EnumC1260k.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$d */
    /* loaded from: classes2.dex */
    public class C1253d extends AbstractInterpolatorC1274n {

        /* renamed from: a */
        float f5018a = 0.0f;

        /* renamed from: b */
        float f5019b = 0.0f;

        /* renamed from: c */
        float f5020c;

        C1253d() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractInterpolatorC1274n
        /* renamed from: a */
        public float mo6019a() {
            return MotionLayout.this.f4954Q;
        }

        /* renamed from: b */
        public void m6020b(float f11, float f12, float f13) {
            this.f5018a = f11;
            this.f5019b = f12;
            this.f5020c = f13;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            float f12;
            float f13;
            float f14 = this.f5018a;
            if (f14 > 0.0f) {
                float f15 = this.f5020c;
                if (f14 / f15 < f11) {
                    f11 = f14 / f15;
                }
                MotionLayout.this.f4954Q = f14 - (f15 * f11);
                f12 = (f14 * f11) - (((f15 * f11) * f11) / 2.0f);
                f13 = this.f5019b;
            } else {
                float f16 = this.f5020c;
                if ((-f14) / f16 < f11) {
                    f11 = (-f14) / f16;
                }
                MotionLayout.this.f4954Q = (f16 * f11) + f14;
                f12 = (f14 * f11) + (((f16 * f11) * f11) / 2.0f);
                f13 = this.f5019b;
            }
            return f12 + f13;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$e */
    /* loaded from: classes2.dex */
    private class C1254e {

        /* renamed from: a */
        float[] f5022a;

        /* renamed from: b */
        int[] f5023b;

        /* renamed from: c */
        float[] f5024c;

        /* renamed from: d */
        Path f5025d;

        /* renamed from: e */
        Paint f5026e;

        /* renamed from: f */
        Paint f5027f;

        /* renamed from: g */
        Paint f5028g;

        /* renamed from: h */
        Paint f5029h;

        /* renamed from: i */
        Paint f5030i;

        /* renamed from: j */
        private float[] f5031j;

        /* renamed from: p */
        DashPathEffect f5037p;

        /* renamed from: q */
        int f5038q;

        /* renamed from: t */
        int f5041t;

        /* renamed from: k */
        final int f5032k = -21965;

        /* renamed from: l */
        final int f5033l = -2067046;

        /* renamed from: m */
        final int f5034m = -13391360;

        /* renamed from: n */
        final int f5035n = 1996488704;

        /* renamed from: o */
        final int f5036o = 10;

        /* renamed from: r */
        Rect f5039r = new Rect();

        /* renamed from: s */
        boolean f5040s = false;

        public C1254e() {
            this.f5041t = 1;
            Paint paint = new Paint();
            this.f5026e = paint;
            paint.setAntiAlias(true);
            this.f5026e.setColor(-21965);
            this.f5026e.setStrokeWidth(2.0f);
            Paint paint2 = this.f5026e;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.f5027f = paint3;
            paint3.setAntiAlias(true);
            this.f5027f.setColor(-2067046);
            this.f5027f.setStrokeWidth(2.0f);
            this.f5027f.setStyle(style);
            Paint paint4 = new Paint();
            this.f5028g = paint4;
            paint4.setAntiAlias(true);
            this.f5028g.setColor(-13391360);
            this.f5028g.setStrokeWidth(2.0f);
            this.f5028g.setStyle(style);
            Paint paint5 = new Paint();
            this.f5029h = paint5;
            paint5.setAntiAlias(true);
            this.f5029h.setColor(-13391360);
            this.f5029h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f5031j = new float[8];
            Paint paint6 = new Paint();
            this.f5030i = paint6;
            paint6.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f5037p = dashPathEffect;
            this.f5028g.setPathEffect(dashPathEffect);
            this.f5024c = new float[100];
            this.f5023b = new int[50];
            if (this.f5040s) {
                this.f5026e.setStrokeWidth(8.0f);
                this.f5030i.setStrokeWidth(8.0f);
                this.f5027f.setStrokeWidth(8.0f);
                this.f5041t = 4;
            }
        }

        /* renamed from: c */
        private void m6021c(Canvas canvas) {
            canvas.drawLines(this.f5022a, this.f5026e);
        }

        /* renamed from: d */
        private void m6022d(Canvas canvas) {
            boolean z11 = false;
            boolean z12 = false;
            for (int i11 = 0; i11 < this.f5038q; i11++) {
                int i12 = this.f5023b[i11];
                if (i12 == 1) {
                    z11 = true;
                }
                if (i12 == 0) {
                    z12 = true;
                }
            }
            if (z11) {
                m6025g(canvas);
            }
            if (z12) {
                m6023e(canvas);
            }
        }

        /* renamed from: e */
        private void m6023e(Canvas canvas) {
            float[] fArr = this.f5022a;
            float f11 = fArr[0];
            float f12 = fArr[1];
            float f13 = fArr[fArr.length - 2];
            float f14 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f11, f13), Math.max(f12, f14), Math.max(f11, f13), Math.max(f12, f14), this.f5028g);
            canvas.drawLine(Math.min(f11, f13), Math.min(f12, f14), Math.min(f11, f13), Math.max(f12, f14), this.f5028g);
        }

        /* renamed from: f */
        private void m6024f(Canvas canvas, float f11, float f12) {
            float[] fArr = this.f5022a;
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = fArr[fArr.length - 2];
            float f16 = fArr[fArr.length - 1];
            float min = Math.min(f13, f15);
            float max = Math.max(f14, f16);
            float min2 = f11 - Math.min(f13, f15);
            float max2 = Math.max(f14, f16) - f12;
            String str = "" + (((int) (((min2 * 100.0f) / Math.abs(f15 - f13)) + 0.5d)) / 100.0f);
            m6032l(str, this.f5029h);
            canvas.drawText(str, ((min2 / 2.0f) - (this.f5039r.width() / 2)) + min, f12 - 20.0f, this.f5029h);
            canvas.drawLine(f11, f12, Math.min(f13, f15), f12, this.f5028g);
            String str2 = "" + (((int) (((max2 * 100.0f) / Math.abs(f16 - f14)) + 0.5d)) / 100.0f);
            m6032l(str2, this.f5029h);
            canvas.drawText(str2, f11 + 5.0f, max - ((max2 / 2.0f) - (this.f5039r.height() / 2)), this.f5029h);
            canvas.drawLine(f11, f12, f11, Math.max(f14, f16), this.f5028g);
        }

        /* renamed from: g */
        private void m6025g(Canvas canvas) {
            float[] fArr = this.f5022a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f5028g);
        }

        /* renamed from: h */
        private void m6026h(Canvas canvas, float f11, float f12) {
            float[] fArr = this.f5022a;
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = fArr[fArr.length - 2];
            float f16 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot(f13 - f15, f14 - f16);
            float f17 = f15 - f13;
            float f18 = f16 - f14;
            float f19 = (((f11 - f13) * f17) + ((f12 - f14) * f18)) / (hypot * hypot);
            float f21 = f13 + (f17 * f19);
            float f22 = f14 + (f19 * f18);
            Path path = new Path();
            path.moveTo(f11, f12);
            path.lineTo(f21, f22);
            float hypot2 = (float) Math.hypot(f21 - f11, f22 - f12);
            String str = "" + (((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
            m6032l(str, this.f5029h);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - (this.f5039r.width() / 2), -20.0f, this.f5029h);
            canvas.drawLine(f11, f12, f21, f22, this.f5028g);
        }

        /* renamed from: i */
        private void m6027i(Canvas canvas, float f11, float f12, int i11, int i12) {
            String str = "" + (((int) ((((f11 - (i11 / 2)) * 100.0f) / (MotionLayout.this.getWidth() - i11)) + 0.5d)) / 100.0f);
            m6032l(str, this.f5029h);
            canvas.drawText(str, ((f11 / 2.0f) - (this.f5039r.width() / 2)) + 0.0f, f12 - 20.0f, this.f5029h);
            canvas.drawLine(f11, f12, Math.min(0.0f, 1.0f), f12, this.f5028g);
            String str2 = "" + (((int) ((((f12 - (i12 / 2)) * 100.0f) / (MotionLayout.this.getHeight() - i12)) + 0.5d)) / 100.0f);
            m6032l(str2, this.f5029h);
            canvas.drawText(str2, f11 + 5.0f, 0.0f - ((f12 / 2.0f) - (this.f5039r.height() / 2)), this.f5029h);
            canvas.drawLine(f11, f12, f11, Math.max(0.0f, 1.0f), this.f5028g);
        }

        /* renamed from: j */
        private void m6028j(Canvas canvas, C1273m c1273m) {
            this.f5025d.reset();
            for (int i11 = 0; i11 <= 50; i11++) {
                c1273m.m6145e(i11 / 50, this.f5031j, 0);
                Path path = this.f5025d;
                float[] fArr = this.f5031j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f5025d;
                float[] fArr2 = this.f5031j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f5025d;
                float[] fArr3 = this.f5031j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f5025d;
                float[] fArr4 = this.f5031j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f5025d.close();
            }
            this.f5026e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f5025d, this.f5026e);
            canvas.translate(-2.0f, -2.0f);
            this.f5026e.setColor(-65536);
            canvas.drawPath(this.f5025d, this.f5026e);
        }

        /* renamed from: k */
        private void m6029k(Canvas canvas, int i11, int i12, C1273m c1273m) {
            int i13;
            int i14;
            float f11;
            float f12;
            View view = c1273m.f5156b;
            if (view != null) {
                i13 = view.getWidth();
                i14 = c1273m.f5156b.getHeight();
            } else {
                i13 = 0;
                i14 = 0;
            }
            for (int i15 = 1; i15 < i12 - 1; i15++) {
                if (i11 != 4 || this.f5023b[i15 - 1] != 0) {
                    float[] fArr = this.f5024c;
                    int i16 = i15 * 2;
                    float f13 = fArr[i16];
                    float f14 = fArr[i16 + 1];
                    this.f5025d.reset();
                    this.f5025d.moveTo(f13, f14 + 10.0f);
                    this.f5025d.lineTo(f13 + 10.0f, f14);
                    this.f5025d.lineTo(f13, f14 - 10.0f);
                    this.f5025d.lineTo(f13 - 10.0f, f14);
                    this.f5025d.close();
                    int i17 = i15 - 1;
                    c1273m.m6155q(i17);
                    if (i11 == 4) {
                        int i18 = this.f5023b[i17];
                        if (i18 == 1) {
                            m6026h(canvas, f13 - 0.0f, f14 - 0.0f);
                        } else if (i18 == 0) {
                            m6024f(canvas, f13 - 0.0f, f14 - 0.0f);
                        } else if (i18 == 2) {
                            f11 = f14;
                            f12 = f13;
                            m6027i(canvas, f13 - 0.0f, f14 - 0.0f, i13, i14);
                            canvas.drawPath(this.f5025d, this.f5030i);
                        }
                        f11 = f14;
                        f12 = f13;
                        canvas.drawPath(this.f5025d, this.f5030i);
                    } else {
                        f11 = f14;
                        f12 = f13;
                    }
                    if (i11 == 2) {
                        m6026h(canvas, f12 - 0.0f, f11 - 0.0f);
                    }
                    if (i11 == 3) {
                        m6024f(canvas, f12 - 0.0f, f11 - 0.0f);
                    }
                    if (i11 == 6) {
                        m6027i(canvas, f12 - 0.0f, f11 - 0.0f, i13, i14);
                    }
                    canvas.drawPath(this.f5025d, this.f5030i);
                }
            }
            float[] fArr2 = this.f5022a;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f5027f);
                float[] fArr3 = this.f5022a;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f5027f);
            }
        }

        /* renamed from: a */
        public void m6030a(Canvas canvas, HashMap hashMap, int i11, int i12) {
            if (hashMap != null && hashMap.size() != 0) {
                canvas.save();
                if (!MotionLayout.this.isInEditMode() && (i12 & 1) == 2) {
                    String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.f4960T) + ":" + MotionLayout.this.getProgress();
                    canvas.drawText(str, 10.0f, MotionLayout.this.getHeight() - 30, this.f5029h);
                    canvas.drawText(str, 11.0f, MotionLayout.this.getHeight() - 29, this.f5026e);
                }
                for (C1273m c1273m : hashMap.values()) {
                    int m6152m = c1273m.m6152m();
                    if (i12 > 0 && m6152m == 0) {
                        m6152m = 1;
                    }
                    if (m6152m != 0) {
                        this.f5038q = c1273m.m6143c(this.f5024c, this.f5023b);
                        if (m6152m >= 1) {
                            int i13 = i11 / 16;
                            float[] fArr = this.f5022a;
                            if (fArr == null || fArr.length != i13 * 2) {
                                this.f5022a = new float[i13 * 2];
                                this.f5025d = new Path();
                            }
                            int i14 = this.f5041t;
                            canvas.translate(i14, i14);
                            this.f5026e.setColor(1996488704);
                            this.f5030i.setColor(1996488704);
                            this.f5027f.setColor(1996488704);
                            this.f5028g.setColor(1996488704);
                            c1273m.m6144d(this.f5022a, i13);
                            m6031b(canvas, m6152m, this.f5038q, c1273m);
                            this.f5026e.setColor(-21965);
                            this.f5027f.setColor(-2067046);
                            this.f5030i.setColor(-2067046);
                            this.f5028g.setColor(-13391360);
                            int i15 = this.f5041t;
                            canvas.translate(-i15, -i15);
                            m6031b(canvas, m6152m, this.f5038q, c1273m);
                            if (m6152m == 5) {
                                m6028j(canvas, c1273m);
                            }
                        }
                    }
                }
                canvas.restore();
            }
        }

        /* renamed from: b */
        public void m6031b(Canvas canvas, int i11, int i12, C1273m c1273m) {
            if (i11 == 4) {
                m6022d(canvas);
            }
            if (i11 == 2) {
                m6025g(canvas);
            }
            if (i11 == 3) {
                m6023e(canvas);
            }
            m6021c(canvas);
            m6029k(canvas, i11, i12, c1273m);
        }

        /* renamed from: l */
        void m6032l(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f5039r);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$f */
    /* loaded from: classes2.dex */
    public class C1255f {

        /* renamed from: a */
        C3187f f5043a = new C3187f();

        /* renamed from: b */
        C3187f f5044b = new C3187f();

        /* renamed from: c */
        C1295c f5045c = null;

        /* renamed from: d */
        C1295c f5046d = null;

        /* renamed from: e */
        int f5047e;

        /* renamed from: f */
        int f5048f;

        C1255f() {
        }

        /* renamed from: b */
        private void m6033b(int i11, int i12) {
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            MotionLayout motionLayout = MotionLayout.this;
            if (motionLayout.f4958S == motionLayout.getStartState()) {
                MotionLayout motionLayout2 = MotionLayout.this;
                C3187f c3187f = this.f5044b;
                C1295c c1295c = this.f5046d;
                if (c1295c != null && c1295c.f5635d != 0) {
                    i16 = i12;
                } else {
                    i16 = i11;
                }
                if (c1295c != null && c1295c.f5635d != 0) {
                    i17 = i11;
                } else {
                    i17 = i12;
                }
                motionLayout2.m6386x(c3187f, optimizationLevel, i16, i17);
                C1295c c1295c2 = this.f5045c;
                if (c1295c2 != null) {
                    MotionLayout motionLayout3 = MotionLayout.this;
                    C3187f c3187f2 = this.f5043a;
                    int i19 = c1295c2.f5635d;
                    if (i19 == 0) {
                        i18 = i11;
                    } else {
                        i18 = i12;
                    }
                    if (i19 == 0) {
                        i11 = i12;
                    }
                    motionLayout3.m6386x(c3187f2, optimizationLevel, i18, i11);
                    return;
                }
                return;
            }
            C1295c c1295c3 = this.f5045c;
            if (c1295c3 != null) {
                MotionLayout motionLayout4 = MotionLayout.this;
                C3187f c3187f3 = this.f5043a;
                int i21 = c1295c3.f5635d;
                if (i21 == 0) {
                    i14 = i11;
                } else {
                    i14 = i12;
                }
                if (i21 == 0) {
                    i15 = i12;
                } else {
                    i15 = i11;
                }
                motionLayout4.m6386x(c3187f3, optimizationLevel, i14, i15);
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            C3187f c3187f4 = this.f5044b;
            C1295c c1295c4 = this.f5046d;
            if (c1295c4 != null && c1295c4.f5635d != 0) {
                i13 = i12;
            } else {
                i13 = i11;
            }
            if (c1295c4 == null || c1295c4.f5635d == 0) {
                i11 = i12;
            }
            motionLayout5.m6386x(c3187f4, optimizationLevel, i13, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: j */
        private void m6034j(C3187f c3187f, C1295c c1295c) {
            SparseArray sparseArray = new SparseArray();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, c3187f);
            sparseArray.put(MotionLayout.this.getId(), c3187f);
            if (c1295c != null && c1295c.f5635d != 0) {
                MotionLayout motionLayout = MotionLayout.this;
                motionLayout.m6386x(this.f5044b, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824));
            }
            Iterator it = c3187f.m16264u1().iterator();
            while (it.hasNext()) {
                C3186e c3186e = (C3186e) it.next();
                sparseArray.put(((View) c3186e.m16123u()).getId(), c3186e);
            }
            Iterator it2 = c3187f.m16264u1().iterator();
            while (it2.hasNext()) {
                C3186e c3186e2 = (C3186e) it2.next();
                View view = (View) c3186e2.m16123u();
                c1295c.m6453l(view.getId(), layoutParams);
                c3186e2.m16106n1(c1295c.m6441C(view.getId()));
                c3186e2.m16053O0(c1295c.m6461x(view.getId()));
                if (view instanceof ConstraintHelper) {
                    c1295c.m6451j((ConstraintHelper) view, c3186e2, layoutParams, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).m6368x();
                    }
                }
                layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.m6378d(false, view, c3186e2, layoutParams, sparseArray);
                if (c1295c.m6440B(view.getId()) == 1) {
                    c3186e2.m16104m1(view.getVisibility());
                } else {
                    c3186e2.m16104m1(c1295c.m6439A(view.getId()));
                }
            }
            Iterator it3 = c3187f.m16264u1().iterator();
            while (it3.hasNext()) {
                C3186e c3186e3 = (C3186e) it3.next();
                if (c3186e3 instanceof AbstractC3194m) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) c3186e3.m16123u();
                    InterfaceC3190i interfaceC3190i = (InterfaceC3190i) c3186e3;
                    constraintHelper.mo5948w(c3187f, interfaceC3190i, sparseArray);
                    ((AbstractC3194m) interfaceC3190i).m16260x1();
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0123 A[SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m6035a() {
            String str;
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.f4971a0.clear();
            SparseArray sparseArray = new SparseArray();
            int[] iArr = new int[childCount];
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = MotionLayout.this.getChildAt(i11);
                C1273m c1273m = new C1273m(childAt);
                int id2 = childAt.getId();
                iArr[i11] = id2;
                sparseArray.put(id2, c1273m);
                MotionLayout.this.f4971a0.put(childAt, c1273m);
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = MotionLayout.this.getChildAt(i12);
                C1273m c1273m2 = (C1273m) MotionLayout.this.f4971a0.get(childAt2);
                if (c1273m2 != null) {
                    if (this.f5045c != null) {
                        C3186e m6037d = m6037d(this.f5043a, childAt2);
                        if (m6037d != null) {
                            c1273m2.m6136F(MotionLayout.this.m5957C0(m6037d), this.f5045c, MotionLayout.this.getWidth(), MotionLayout.this.getHeight());
                        } else if (MotionLayout.this.f4997n0 != 0) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(AbstractC1261a.m6058b());
                            sb2.append("no widget for  ");
                            sb2.append(AbstractC1261a.m6060d(childAt2));
                            sb2.append(" (");
                            sb2.append(childAt2.getClass().getName());
                            sb2.append(")");
                        }
                    } else if (MotionLayout.this.f4976c1) {
                        AbstractC30228a.m149044a(MotionLayout.this.f4980e1.get(childAt2));
                        MotionLayout motionLayout = MotionLayout.this;
                        str = "no widget for  ";
                        c1273m2.m6137G(null, childAt2, motionLayout.f4978d1, motionLayout.f4982f1, MotionLayout.this.f4984g1);
                        if (this.f5046d != null) {
                            C3186e m6037d2 = m6037d(this.f5044b, childAt2);
                            if (m6037d2 != null) {
                                c1273m2.m6133C(MotionLayout.this.m5957C0(m6037d2), this.f5046d, MotionLayout.this.getWidth(), MotionLayout.this.getHeight());
                            } else if (MotionLayout.this.f4997n0 != 0) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(AbstractC1261a.m6058b());
                                sb3.append(str);
                                sb3.append(AbstractC1261a.m6060d(childAt2));
                                sb3.append(" (");
                                sb3.append(childAt2.getClass().getName());
                                sb3.append(")");
                            }
                        }
                    }
                    str = "no widget for  ";
                    if (this.f5046d != null) {
                    }
                }
            }
            for (int i13 = 0; i13 < childCount; i13++) {
                C1273m c1273m3 = (C1273m) sparseArray.get(iArr[i13]);
                int m6147h = c1273m3.m6147h();
                if (m6147h != -1) {
                    c1273m3.m6140J((C1273m) sparseArray.get(m6147h));
                }
            }
        }

        /* renamed from: c */
        void m6036c(C3187f c3187f, C3187f c3187f2) {
            C3186e c3186e;
            ArrayList m16264u1 = c3187f.m16264u1();
            HashMap hashMap = new HashMap();
            hashMap.put(c3187f, c3187f2);
            c3187f2.m16264u1().clear();
            c3187f2.mo15986n(c3187f, hashMap);
            Iterator it = m16264u1.iterator();
            while (it.hasNext()) {
                C3186e c3186e2 = (C3186e) it.next();
                if (c3186e2 instanceof C3182a) {
                    c3186e = new C3182a();
                } else if (c3186e2 instanceof C3189h) {
                    c3186e = new C3189h();
                } else if (c3186e2 instanceof C3188g) {
                    c3186e = new C3188g();
                } else if (c3186e2 instanceof C3193l) {
                    c3186e = new C3193l();
                } else if (c3186e2 instanceof InterfaceC3190i) {
                    c3186e = new C3191j();
                } else {
                    c3186e = new C3186e();
                }
                c3187f2.m16263a(c3186e);
                hashMap.put(c3186e2, c3186e);
            }
            Iterator it2 = m16264u1.iterator();
            while (it2.hasNext()) {
                C3186e c3186e3 = (C3186e) it2.next();
                ((C3186e) hashMap.get(c3186e3)).mo15986n(c3186e3, hashMap);
            }
        }

        /* renamed from: d */
        C3186e m6037d(C3187f c3187f, View view) {
            if (c3187f.m16123u() == view) {
                return c3187f;
            }
            ArrayList m16264u1 = c3187f.m16264u1();
            int size = m16264u1.size();
            for (int i11 = 0; i11 < size; i11++) {
                C3186e c3186e = (C3186e) m16264u1.get(i11);
                if (c3186e.m16123u() == view) {
                    return c3186e;
                }
            }
            return null;
        }

        /* renamed from: e */
        void m6038e(C3187f c3187f, C1295c c1295c, C1295c c1295c2) {
            this.f5045c = c1295c;
            this.f5046d = c1295c2;
            this.f5043a = new C3187f();
            this.f5044b = new C3187f();
            this.f5043a.m16159Y1(((ConstraintLayout) MotionLayout.this).f5478r.m16148L1());
            this.f5044b.m16159Y1(((ConstraintLayout) MotionLayout.this).f5478r.m16148L1());
            this.f5043a.m16266x1();
            this.f5044b.m16266x1();
            m6036c(((ConstraintLayout) MotionLayout.this).f5478r, this.f5043a);
            m6036c(((ConstraintLayout) MotionLayout.this).f5478r, this.f5044b);
            if (MotionLayout.this.f4979e0 > 0.5d) {
                if (c1295c != null) {
                    m6034j(this.f5043a, c1295c);
                }
                m6034j(this.f5044b, c1295c2);
            } else {
                m6034j(this.f5044b, c1295c2);
                if (c1295c != null) {
                    m6034j(this.f5043a, c1295c);
                }
            }
            this.f5043a.m16162b2(MotionLayout.this.m6384p());
            this.f5043a.m16164d2();
            this.f5044b.m16162b2(MotionLayout.this.m6384p());
            this.f5044b.m16164d2();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    C3187f c3187f2 = this.f5043a;
                    C3186e.b bVar = C3186e.b.WRAP_CONTENT;
                    c3187f2.m16059S0(bVar);
                    this.f5044b.m16059S0(bVar);
                }
                if (layoutParams.height == -2) {
                    C3187f c3187f3 = this.f5043a;
                    C3186e.b bVar2 = C3186e.b.WRAP_CONTENT;
                    c3187f3.m16095j1(bVar2);
                    this.f5044b.m16095j1(bVar2);
                }
            }
        }

        /* renamed from: f */
        public boolean m6039f(int i11, int i12) {
            return (i11 == this.f5047e && i12 == this.f5048f) ? false : true;
        }

        /* renamed from: g */
        public void m6040g(int i11, int i12) {
            boolean z11;
            boolean z12;
            boolean z13;
            int mode = View.MeasureSpec.getMode(i11);
            int mode2 = View.MeasureSpec.getMode(i12);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.f4961T0 = mode;
            motionLayout.f4963U0 = mode2;
            motionLayout.getOptimizationLevel();
            m6033b(i11, i12);
            if (!(MotionLayout.this.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
                m6033b(i11, i12);
                MotionLayout.this.f4953P0 = this.f5043a.m16070Y();
                MotionLayout.this.f4955Q0 = this.f5043a.m16133z();
                MotionLayout.this.f4957R0 = this.f5044b.m16070Y();
                MotionLayout.this.f4959S0 = this.f5044b.m16133z();
                MotionLayout motionLayout2 = MotionLayout.this;
                if (motionLayout2.f4953P0 == motionLayout2.f4957R0 && motionLayout2.f4955Q0 == motionLayout2.f4959S0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                motionLayout2.f4951O0 = z11;
            }
            MotionLayout motionLayout3 = MotionLayout.this;
            int i13 = motionLayout3.f4953P0;
            int i14 = motionLayout3.f4955Q0;
            int i15 = motionLayout3.f4961T0;
            if (i15 == Integer.MIN_VALUE || i15 == 0) {
                i13 = (int) (i13 + (motionLayout3.f4965V0 * (motionLayout3.f4957R0 - i13)));
            }
            int i16 = i13;
            int i17 = motionLayout3.f4963U0;
            if (i17 == Integer.MIN_VALUE || i17 == 0) {
                i14 = (int) (i14 + (motionLayout3.f4965V0 * (motionLayout3.f4959S0 - i14)));
            }
            int i18 = i14;
            if (!this.f5043a.m16156T1() && !this.f5044b.m16156T1()) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!this.f5043a.m16154R1() && !this.f5044b.m16154R1()) {
                z13 = false;
            } else {
                z13 = true;
            }
            MotionLayout.this.m6385w(i11, i12, i16, i18, z12, z13);
        }

        /* renamed from: h */
        public void m6041h() {
            m6040g(MotionLayout.this.f4962U, MotionLayout.this.f4964V);
            MotionLayout.this.m5956B0();
        }

        /* renamed from: i */
        public void m6042i(int i11, int i12) {
            this.f5047e = i11;
            this.f5048f = i12;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$g */
    /* loaded from: classes2.dex */
    public interface InterfaceC1256g {
        /* renamed from: a */
        void mo6043a(MotionEvent motionEvent);

        /* renamed from: b */
        float mo6044b();

        /* renamed from: c */
        float mo6045c();

        /* renamed from: d */
        void mo6046d();

        /* renamed from: e */
        void mo6047e(int i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$h */
    /* loaded from: classes2.dex */
    public static class C1257h implements InterfaceC1256g {

        /* renamed from: b */
        private static C1257h f5050b = new C1257h();

        /* renamed from: a */
        VelocityTracker f5051a;

        private C1257h() {
        }

        /* renamed from: f */
        public static C1257h m6048f() {
            f5050b.f5051a = VelocityTracker.obtain();
            return f5050b;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC1256g
        /* renamed from: a */
        public void mo6043a(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f5051a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC1256g
        /* renamed from: b */
        public float mo6044b() {
            VelocityTracker velocityTracker = this.f5051a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC1256g
        /* renamed from: c */
        public float mo6045c() {
            VelocityTracker velocityTracker = this.f5051a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC1256g
        /* renamed from: d */
        public void mo6046d() {
            VelocityTracker velocityTracker = this.f5051a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f5051a = null;
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC1256g
        /* renamed from: e */
        public void mo6047e(int i11) {
            VelocityTracker velocityTracker = this.f5051a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i11);
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$i */
    /* loaded from: classes2.dex */
    public class C1258i {

        /* renamed from: a */
        float f5052a = Float.NaN;

        /* renamed from: b */
        float f5053b = Float.NaN;

        /* renamed from: c */
        int f5054c = -1;

        /* renamed from: d */
        int f5055d = -1;

        /* renamed from: e */
        final String f5056e = "motion.progress";

        /* renamed from: f */
        final String f5057f = "motion.velocity";

        /* renamed from: g */
        final String f5058g = "motion.StartState";

        /* renamed from: h */
        final String f5059h = "motion.EndState";

        C1258i() {
        }

        /* renamed from: a */
        void m6049a() {
            int i11 = this.f5054c;
            if (i11 != -1 || this.f5055d != -1) {
                if (i11 == -1) {
                    MotionLayout.this.m5997H0(this.f5055d);
                } else {
                    int i12 = this.f5055d;
                    if (i12 == -1) {
                        MotionLayout.this.m6018z0(i11, -1, -1);
                    } else {
                        MotionLayout.this.m5992A0(i11, i12);
                    }
                }
                MotionLayout.this.setState(EnumC1260k.SETUP);
            }
            if (Float.isNaN(this.f5053b)) {
                if (Float.isNaN(this.f5052a)) {
                    return;
                }
                MotionLayout.this.setProgress(this.f5052a);
            } else {
                MotionLayout.this.m6017y0(this.f5052a, this.f5053b);
                this.f5052a = Float.NaN;
                this.f5053b = Float.NaN;
                this.f5054c = -1;
                this.f5055d = -1;
            }
        }

        /* renamed from: b */
        public Bundle m6050b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f5052a);
            bundle.putFloat("motion.velocity", this.f5053b);
            bundle.putInt("motion.StartState", this.f5054c);
            bundle.putInt("motion.EndState", this.f5055d);
            return bundle;
        }

        /* renamed from: c */
        public void m6051c() {
            this.f5055d = MotionLayout.this.f4960T;
            this.f5054c = MotionLayout.this.f4956R;
            this.f5053b = MotionLayout.this.getVelocity();
            this.f5052a = MotionLayout.this.getProgress();
        }

        /* renamed from: d */
        public void m6052d(int i11) {
            this.f5055d = i11;
        }

        /* renamed from: e */
        public void m6053e(float f11) {
            this.f5052a = f11;
        }

        /* renamed from: f */
        public void m6054f(int i11) {
            this.f5054c = i11;
        }

        /* renamed from: g */
        public void m6055g(Bundle bundle) {
            this.f5052a = bundle.getFloat("motion.progress");
            this.f5053b = bundle.getFloat("motion.velocity");
            this.f5054c = bundle.getInt("motion.StartState");
            this.f5055d = bundle.getInt("motion.EndState");
        }

        /* renamed from: h */
        public void m6056h(float f11) {
            this.f5053b = f11;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$j */
    /* loaded from: classes2.dex */
    public interface InterfaceC1259j {
        /* renamed from: a */
        void mo5930a(MotionLayout motionLayout, int i11, int i12, float f11);

        /* renamed from: b */
        void mo5931b(MotionLayout motionLayout, int i11);

        /* renamed from: c */
        void mo5954c(MotionLayout motionLayout, int i11, int i12);
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$k */
    /* loaded from: classes2.dex */
    public enum EnumC1260k {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4952P = null;
        this.f4954Q = 0.0f;
        this.f4956R = -1;
        this.f4958S = -1;
        this.f4960T = -1;
        this.f4962U = 0;
        this.f4964V = 0;
        this.f4966W = true;
        this.f4971a0 = new HashMap();
        this.f4973b0 = 0L;
        this.f4975c0 = 1.0f;
        this.f4977d0 = 0.0f;
        this.f4979e0 = 0.0f;
        this.f4983g0 = 0.0f;
        this.f4987i0 = false;
        this.f4989j0 = false;
        this.f4997n0 = 0;
        this.f5001p0 = false;
        this.f5003q0 = new C18159b();
        this.f5005r0 = new C1253d();
        this.f5007t0 = true;
        this.f5012y0 = false;
        this.f4938D0 = false;
        this.f4939E0 = null;
        this.f4940F0 = null;
        this.f4941G0 = null;
        this.f4942H0 = null;
        this.f4943I0 = 0;
        this.f4944J0 = -1L;
        this.f4945K0 = 0.0f;
        this.f4946L0 = 0;
        this.f4947M0 = 0.0f;
        this.f4949N0 = false;
        this.f4951O0 = false;
        this.f4967W0 = new C0023d();
        this.f4968X0 = false;
        this.f4970Z0 = null;
        this.f4972a1 = null;
        this.f4974b1 = 0;
        this.f4976c1 = false;
        this.f4978d1 = 0;
        this.f4980e1 = new HashMap();
        this.f4988i1 = new Rect();
        this.f4990j1 = false;
        this.f4992k1 = EnumC1260k.UNDEFINED;
        this.f4994l1 = new C1255f();
        this.f4996m1 = false;
        this.f4998n1 = new RectF();
        this.f5000o1 = null;
        this.f5002p1 = null;
        this.f5004q1 = new ArrayList();
        m5990s0(attributeSet);
    }

    /* renamed from: B0 */
    public void m5956B0() {
        float f11;
        float f12;
        int childCount = getChildCount();
        this.f4994l1.m6035a();
        boolean z11 = true;
        this.f4987i0 = true;
        SparseArray sparseArray = new SparseArray();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            sparseArray.put(childAt.getId(), (C1273m) this.f4971a0.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int m6220j = this.f4948N.m6220j();
        if (m6220j != -1) {
            for (int i13 = 0; i13 < childCount; i13++) {
                C1273m c1273m = (C1273m) this.f4971a0.get(getChildAt(i13));
                if (c1273m != null) {
                    c1273m.m6134D(m6220j);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.f4971a0.size()];
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            C1273m c1273m2 = (C1273m) this.f4971a0.get(getChildAt(i15));
            if (c1273m2.m6147h() != -1) {
                sparseBooleanArray.put(c1273m2.m6147h(), true);
                iArr[i14] = c1273m2.m6147h();
                i14++;
            }
        }
        if (this.f4941G0 != null) {
            for (int i16 = 0; i16 < i14; i16++) {
                C1273m c1273m3 = (C1273m) this.f4971a0.get(findViewById(iArr[i16]));
                if (c1273m3 != null) {
                    this.f4948N.m6229t(c1273m3);
                }
            }
            Iterator it = this.f4941G0.iterator();
            while (it.hasNext()) {
                ((MotionHelper) it.next()).mo5946E(this, this.f4971a0);
            }
            for (int i17 = 0; i17 < i14; i17++) {
                C1273m c1273m4 = (C1273m) this.f4971a0.get(findViewById(iArr[i17]));
                if (c1273m4 != null) {
                    c1273m4.m6139I(width, height, this.f4975c0, getNanoTime());
                }
            }
        } else {
            for (int i18 = 0; i18 < i14; i18++) {
                C1273m c1273m5 = (C1273m) this.f4971a0.get(findViewById(iArr[i18]));
                if (c1273m5 != null) {
                    this.f4948N.m6229t(c1273m5);
                    c1273m5.m6139I(width, height, this.f4975c0, getNanoTime());
                }
            }
        }
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = getChildAt(i19);
            C1273m c1273m6 = (C1273m) this.f4971a0.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && c1273m6 != null) {
                this.f4948N.m6229t(c1273m6);
                c1273m6.m6139I(width, height, this.f4975c0, getNanoTime());
            }
        }
        float m6201E = this.f4948N.m6201E();
        if (m6201E != 0.0f) {
            if (m6201E >= 0.0d) {
                z11 = false;
            }
            float abs = Math.abs(m6201E);
            float f13 = -3.4028235E38f;
            float f14 = Float.MAX_VALUE;
            float f15 = Float.MAX_VALUE;
            float f16 = -3.4028235E38f;
            for (int i21 = 0; i21 < childCount; i21++) {
                C1273m c1273m7 = (C1273m) this.f4971a0.get(getChildAt(i21));
                if (!Float.isNaN(c1273m7.f5167m)) {
                    for (int i22 = 0; i22 < childCount; i22++) {
                        C1273m c1273m8 = (C1273m) this.f4971a0.get(getChildAt(i22));
                        if (!Float.isNaN(c1273m8.f5167m)) {
                            f14 = Math.min(f14, c1273m8.f5167m);
                            f13 = Math.max(f13, c1273m8.f5167m);
                        }
                    }
                    while (i11 < childCount) {
                        C1273m c1273m9 = (C1273m) this.f4971a0.get(getChildAt(i11));
                        if (!Float.isNaN(c1273m9.f5167m)) {
                            c1273m9.f5169o = 1.0f / (1.0f - abs);
                            if (z11) {
                                c1273m9.f5168n = abs - (((f13 - c1273m9.f5167m) / (f13 - f14)) * abs);
                            } else {
                                c1273m9.f5168n = abs - (((c1273m9.f5167m - f14) * abs) / (f13 - f14));
                            }
                        }
                        i11++;
                    }
                    return;
                }
                float m6153n = c1273m7.m6153n();
                float m6154o = c1273m7.m6154o();
                if (z11) {
                    f12 = m6154o - m6153n;
                } else {
                    f12 = m6154o + m6153n;
                }
                f15 = Math.min(f15, f12);
                f16 = Math.max(f16, f12);
            }
            while (i11 < childCount) {
                C1273m c1273m10 = (C1273m) this.f4971a0.get(getChildAt(i11));
                float m6153n2 = c1273m10.m6153n();
                float m6154o2 = c1273m10.m6154o();
                if (z11) {
                    f11 = m6154o2 - m6153n2;
                } else {
                    f11 = m6154o2 + m6153n2;
                }
                c1273m10.f5169o = 1.0f / (1.0f - abs);
                c1273m10.f5168n = abs - (((f11 - f15) * abs) / (f16 - f15));
                i11++;
            }
        }
    }

    /* renamed from: C0 */
    public Rect m5957C0(C3186e c3186e) {
        this.f4988i1.top = c3186e.m16074a0();
        this.f4988i1.left = c3186e.m16072Z();
        Rect rect = this.f4988i1;
        int m16070Y = c3186e.m16070Y();
        Rect rect2 = this.f4988i1;
        rect.right = m16070Y + rect2.left;
        int m16133z = c3186e.m16133z();
        Rect rect3 = this.f4988i1;
        rect2.bottom = m16133z + rect3.top;
        return rect3;
    }

    /* renamed from: M0 */
    private static boolean m5968M0(float f11, float f12, float f13) {
        if (f11 > 0.0f) {
            float f14 = f11 / f13;
            return f12 + ((f11 * f14) - (((f13 * f14) * f14) / 2.0f)) > 1.0f;
        }
        float f15 = (-f11) / f13;
        return f12 + ((f11 * f15) + (((f13 * f15) * f15) / 2.0f)) < 0.0f;
    }

    /* renamed from: c0 */
    private boolean m5982c0(View view, MotionEvent motionEvent, float f11, float f12) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f11, f12);
            boolean onTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f11, -f12);
            return onTouchEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(f11, f12);
        if (this.f5002p1 == null) {
            this.f5002p1 = new Matrix();
        }
        matrix.invert(this.f5002p1);
        obtain.transform(this.f5002p1);
        boolean onTouchEvent2 = view.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent2;
    }

    /* renamed from: d0 */
    private void m5983d0() {
        C1276p c1276p = this.f4948N;
        if (c1276p == null) {
            return;
        }
        int m6202F = c1276p.m6202F();
        C1276p c1276p2 = this.f4948N;
        m5984e0(m6202F, c1276p2.m6222l(c1276p2.m6202F()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator it = this.f4948N.m6225o().iterator();
        while (it.hasNext()) {
            C1276p.b bVar = (C1276p.b) it.next();
            C1276p.b bVar2 = this.f4948N.f5204c;
            m5985f0(bVar);
            int m6256A = bVar.m6256A();
            int m6267y = bVar.m6267y();
            String m6059c = AbstractC1261a.m6059c(getContext(), m6256A);
            String m6059c2 = AbstractC1261a.m6059c(getContext(), m6267y);
            if (sparseIntArray.get(m6256A) == m6267y) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("CHECK: two transitions with the same start and end ");
                sb2.append(m6059c);
                sb2.append("->");
                sb2.append(m6059c2);
            }
            if (sparseIntArray2.get(m6267y) == m6256A) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("CHECK: you can't have reverse transitions");
                sb3.append(m6059c);
                sb3.append("->");
                sb3.append(m6059c2);
            }
            sparseIntArray.put(m6256A, m6267y);
            sparseIntArray2.put(m6267y, m6256A);
            if (this.f4948N.m6222l(m6256A) == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(" no such constraintSetStart ");
                sb4.append(m6059c);
            }
            if (this.f4948N.m6222l(m6267y) == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(" no such constraintSetEnd ");
                sb5.append(m6059c);
            }
        }
    }

    /* renamed from: e0 */
    private void m5984e0(int i11, C1295c c1295c) {
        String m6059c = AbstractC1261a.m6059c(getContext(), i11);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            int id2 = childAt.getId();
            if (id2 == -1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("CHECK: ");
                sb2.append(m6059c);
                sb2.append(" ALL VIEWS SHOULD HAVE ID's ");
                sb2.append(childAt.getClass().getName());
                sb2.append(" does not!");
            }
            if (c1295c.m6460w(id2) == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("CHECK: ");
                sb3.append(m6059c);
                sb3.append(" NO CONSTRAINTS for ");
                sb3.append(AbstractC1261a.m6060d(childAt));
            }
        }
        int[] m6462y = c1295c.m6462y();
        for (int i13 = 0; i13 < m6462y.length; i13++) {
            int i14 = m6462y[i13];
            String m6059c2 = AbstractC1261a.m6059c(getContext(), i14);
            if (findViewById(m6462y[i13]) == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("CHECK: ");
                sb4.append(m6059c);
                sb4.append(" NO View matches id ");
                sb4.append(m6059c2);
            }
            if (c1295c.m6461x(i14) == -1) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("CHECK: ");
                sb5.append(m6059c);
                sb5.append("(");
                sb5.append(m6059c2);
                sb5.append(") no LAYOUT_HEIGHT");
            }
            if (c1295c.m6441C(i14) == -1) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("CHECK: ");
                sb6.append(m6059c);
                sb6.append("(");
                sb6.append(m6059c2);
                sb6.append(") no LAYOUT_HEIGHT");
            }
        }
    }

    /* renamed from: f0 */
    private void m5985f0(C1276p.b bVar) {
        bVar.m6256A();
        bVar.m6267y();
    }

    /* renamed from: g0 */
    private void m5986g0() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            C1273m c1273m = (C1273m) this.f4971a0.get(childAt);
            if (c1273m != null) {
                c1273m.m6135E(childAt);
            }
        }
    }

    /* renamed from: j0 */
    private void m5987j0() {
        float f11;
        boolean z11;
        float signum = Math.signum(this.f4983g0 - this.f4979e0);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.f4950O;
        if (!(interpolator instanceof C18159b)) {
            f11 = ((((float) (nanoTime - this.f4981f0)) * signum) * 1.0E-9f) / this.f4975c0;
        } else {
            f11 = 0.0f;
        }
        float f12 = this.f4979e0 + f11;
        if (this.f4985h0) {
            f12 = this.f4983g0;
        }
        if ((signum > 0.0f && f12 >= this.f4983g0) || (signum <= 0.0f && f12 <= this.f4983g0)) {
            f12 = this.f4983g0;
            z11 = true;
        } else {
            z11 = false;
        }
        if (interpolator != null && !z11) {
            if (this.f5001p0) {
                f12 = interpolator.getInterpolation(((float) (nanoTime - this.f4973b0)) * 1.0E-9f);
            } else {
                f12 = interpolator.getInterpolation(f12);
            }
        }
        if ((signum > 0.0f && f12 >= this.f4983g0) || (signum <= 0.0f && f12 <= this.f4983g0)) {
            f12 = this.f4983g0;
        }
        this.f4965V0 = f12;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.f4952P;
        if (interpolator2 != null) {
            f12 = interpolator2.getInterpolation(f12);
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            C1273m c1273m = (C1273m) this.f4971a0.get(childAt);
            if (c1273m != null) {
                c1273m.m6160x(childAt, f12, nanoTime2, this.f4967W0);
            }
        }
        if (this.f4951O0) {
            requestLayout();
        }
    }

    /* renamed from: k0 */
    private void m5988k0() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if ((this.f4991k0 != null || ((copyOnWriteArrayList = this.f4942H0) != null && !copyOnWriteArrayList.isEmpty())) && this.f4947M0 != this.f4977d0) {
            if (this.f4946L0 != -1) {
                InterfaceC1259j interfaceC1259j = this.f4991k0;
                if (interfaceC1259j != null) {
                    interfaceC1259j.mo5954c(this, this.f4956R, this.f4960T);
                }
                CopyOnWriteArrayList copyOnWriteArrayList2 = this.f4942H0;
                if (copyOnWriteArrayList2 != null) {
                    Iterator it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1259j) it.next()).mo5954c(this, this.f4956R, this.f4960T);
                    }
                }
                this.f4949N0 = true;
            }
            this.f4946L0 = -1;
            float f11 = this.f4977d0;
            this.f4947M0 = f11;
            InterfaceC1259j interfaceC1259j2 = this.f4991k0;
            if (interfaceC1259j2 != null) {
                interfaceC1259j2.mo5930a(this, this.f4956R, this.f4960T, f11);
            }
            CopyOnWriteArrayList copyOnWriteArrayList3 = this.f4942H0;
            if (copyOnWriteArrayList3 != null) {
                Iterator it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1259j) it2.next()).mo5930a(this, this.f4956R, this.f4960T, this.f4977d0);
                }
            }
            this.f4949N0 = true;
        }
    }

    /* renamed from: r0 */
    private boolean m5989r0(float f11, float f12, View view, MotionEvent motionEvent) {
        boolean z11;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (m5989r0((r3.getLeft() + f11) - view.getScrollX(), (r3.getTop() + f12) - view.getScrollY(), viewGroup.getChildAt(childCount), motionEvent)) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (!z11) {
            this.f4998n1.set(f11, f12, (view.getRight() + f11) - view.getLeft(), (view.getBottom() + f12) - view.getTop());
            if ((motionEvent.getAction() != 0 || this.f4998n1.contains(motionEvent.getX(), motionEvent.getY())) && m5982c0(view, motionEvent, -f11, -f12)) {
                return true;
            }
        }
        return z11;
    }

    /* renamed from: s0 */
    private void m5990s0(AttributeSet attributeSet) {
        C1276p c1276p;
        int i11;
        f4934r1 = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1298f.MotionLayout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z11 = true;
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = obtainStyledAttributes.getIndex(i12);
                if (index == AbstractC1298f.MotionLayout_layoutDescription) {
                    this.f4948N = new C1276p(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == AbstractC1298f.MotionLayout_currentState) {
                    this.f4958S = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == AbstractC1298f.MotionLayout_motionProgress) {
                    this.f4983g0 = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.f4987i0 = true;
                } else if (index == AbstractC1298f.MotionLayout_applyMotionScene) {
                    z11 = obtainStyledAttributes.getBoolean(index, z11);
                } else if (index == AbstractC1298f.MotionLayout_showPaths) {
                    if (this.f4997n0 == 0) {
                        if (obtainStyledAttributes.getBoolean(index, false)) {
                            i11 = 2;
                        } else {
                            i11 = 0;
                        }
                        this.f4997n0 = i11;
                    }
                } else if (index == AbstractC1298f.MotionLayout_motionDebug) {
                    this.f4997n0 = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (!z11) {
                this.f4948N = null;
            }
        }
        if (this.f4997n0 != 0) {
            m5983d0();
        }
        if (this.f4958S == -1 && (c1276p = this.f4948N) != null) {
            this.f4958S = c1276p.m6202F();
            this.f4956R = this.f4948N.m6202F();
            this.f4960T = this.f4948N.m6227q();
        }
    }

    /* renamed from: w0 */
    private void m5991w0() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if (this.f4991k0 == null && ((copyOnWriteArrayList = this.f4942H0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.f4949N0 = false;
        Iterator it = this.f5004q1.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            InterfaceC1259j interfaceC1259j = this.f4991k0;
            if (interfaceC1259j != null) {
                interfaceC1259j.mo5931b(this, num.intValue());
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.f4942H0;
            if (copyOnWriteArrayList2 != null) {
                Iterator it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1259j) it2.next()).mo5931b(this, num.intValue());
                }
            }
        }
        this.f5004q1.clear();
    }

    /* renamed from: A0 */
    public void m5992A0(int i11, int i12) {
        if (!isAttachedToWindow()) {
            if (this.f4969Y0 == null) {
                this.f4969Y0 = new C1258i();
            }
            this.f4969Y0.m6054f(i11);
            this.f4969Y0.m6052d(i12);
            return;
        }
        C1276p c1276p = this.f4948N;
        if (c1276p != null) {
            this.f4956R = i11;
            this.f4960T = i12;
            c1276p.m6212X(i11, i12);
            this.f4994l1.m6038e(this.f5478r, this.f4948N.m6222l(i11), this.f4948N.m6222l(i12));
            m6016x0();
            this.f4979e0 = 0.0f;
            m5996G0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:            if (r10 != 7) goto L74;     */
    /* renamed from: D0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m5993D0(int i11, float f11, float f12) {
        if (this.f4948N == null || this.f4979e0 == f11) {
            return;
        }
        this.f5001p0 = true;
        this.f4973b0 = getNanoTime();
        this.f4975c0 = this.f4948N.m6226p() / 1000.0f;
        this.f4983g0 = f11;
        this.f4987i0 = true;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            if (i11 != 4) {
                if (i11 != 5) {
                    if (i11 != 6) {
                    }
                } else if (m5968M0(f12, this.f4979e0, this.f4948N.m6230u())) {
                    this.f5005r0.m6020b(f12, this.f4979e0, this.f4948N.m6230u());
                    this.f4950O = this.f5005r0;
                } else {
                    this.f5003q0.m96456b(this.f4979e0, f11, f12, this.f4975c0, this.f4948N.m6230u(), this.f4948N.m6231v());
                    this.f4954Q = 0.0f;
                    int i12 = this.f4958S;
                    this.f4983g0 = f11;
                    this.f4958S = i12;
                    this.f4950O = this.f5003q0;
                }
            } else {
                this.f5005r0.m6020b(f12, this.f4979e0, this.f4948N.m6230u());
                this.f4950O = this.f5005r0;
            }
            this.f4985h0 = false;
            this.f4973b0 = getNanoTime();
            invalidate();
        }
        if (i11 != 1 && i11 != 7) {
            if (i11 == 2 || i11 == 6) {
                f11 = 1.0f;
            }
        } else {
            f11 = 0.0f;
        }
        if (this.f4948N.m6221k() == 0) {
            this.f5003q0.m96456b(this.f4979e0, f11, f12, this.f4975c0, this.f4948N.m6230u(), this.f4948N.m6231v());
        } else {
            this.f5003q0.m96458d(this.f4979e0, f11, f12, this.f4948N.m6198B(), this.f4948N.m6199C(), this.f4948N.m6197A(), this.f4948N.m6200D(), this.f4948N.m6234z());
        }
        int i13 = this.f4958S;
        this.f4983g0 = f11;
        this.f4958S = i13;
        this.f4950O = this.f5003q0;
        this.f4985h0 = false;
        this.f4973b0 = getNanoTime();
        invalidate();
    }

    /* renamed from: E0 */
    public void m5994E0() {
        m6002a0(1.0f);
        this.f4970Z0 = null;
    }

    /* renamed from: F0 */
    public void m5995F0(Runnable runnable) {
        m6002a0(1.0f);
        this.f4970Z0 = runnable;
    }

    /* renamed from: G0 */
    public void m5996G0() {
        m6002a0(0.0f);
    }

    /* renamed from: H0 */
    public void m5997H0(int i11) {
        if (!isAttachedToWindow()) {
            if (this.f4969Y0 == null) {
                this.f4969Y0 = new C1258i();
            }
            this.f4969Y0.m6052d(i11);
            return;
        }
        m5998I0(i11, -1, -1);
    }

    /* renamed from: I0 */
    public void m5998I0(int i11, int i12, int i13) {
        m5999J0(i11, i12, i13, -1);
    }

    /* renamed from: J0 */
    public void m5999J0(int i11, int i12, int i13, int i14) {
        C1300h c1300h;
        int m6489a;
        C1276p c1276p = this.f4948N;
        if (c1276p != null && (c1300h = c1276p.f5203b) != null && (m6489a = c1300h.m6489a(this.f4958S, i11, i12, i13)) != -1) {
            i11 = m6489a;
        }
        int i15 = this.f4958S;
        if (i15 == i11) {
            return;
        }
        if (this.f4956R == i11) {
            m6002a0(0.0f);
            if (i14 > 0) {
                this.f4975c0 = i14 / 1000.0f;
                return;
            }
            return;
        }
        if (this.f4960T == i11) {
            m6002a0(1.0f);
            if (i14 > 0) {
                this.f4975c0 = i14 / 1000.0f;
                return;
            }
            return;
        }
        this.f4960T = i11;
        if (i15 != -1) {
            m5992A0(i15, i11);
            m6002a0(1.0f);
            this.f4979e0 = 0.0f;
            m5994E0();
            if (i14 > 0) {
                this.f4975c0 = i14 / 1000.0f;
                return;
            }
            return;
        }
        this.f5001p0 = false;
        this.f4983g0 = 1.0f;
        this.f4977d0 = 0.0f;
        this.f4979e0 = 0.0f;
        this.f4981f0 = getNanoTime();
        this.f4973b0 = getNanoTime();
        this.f4985h0 = false;
        this.f4950O = null;
        if (i14 == -1) {
            this.f4975c0 = this.f4948N.m6226p() / 1000.0f;
        }
        this.f4956R = -1;
        this.f4948N.m6212X(-1, this.f4960T);
        SparseArray sparseArray = new SparseArray();
        if (i14 == 0) {
            this.f4975c0 = this.f4948N.m6226p() / 1000.0f;
        } else if (i14 > 0) {
            this.f4975c0 = i14 / 1000.0f;
        }
        int childCount = getChildCount();
        this.f4971a0.clear();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            this.f4971a0.put(childAt, new C1273m(childAt));
            sparseArray.put(childAt.getId(), (C1273m) this.f4971a0.get(childAt));
        }
        this.f4987i0 = true;
        this.f4994l1.m6038e(this.f5478r, null, this.f4948N.m6222l(i11));
        m6016x0();
        this.f4994l1.m6035a();
        m5986g0();
        int width = getWidth();
        int height = getHeight();
        if (this.f4941G0 != null) {
            for (int i17 = 0; i17 < childCount; i17++) {
                C1273m c1273m = (C1273m) this.f4971a0.get(getChildAt(i17));
                if (c1273m != null) {
                    this.f4948N.m6229t(c1273m);
                }
            }
            Iterator it = this.f4941G0.iterator();
            while (it.hasNext()) {
                ((MotionHelper) it.next()).mo5946E(this, this.f4971a0);
            }
            for (int i18 = 0; i18 < childCount; i18++) {
                C1273m c1273m2 = (C1273m) this.f4971a0.get(getChildAt(i18));
                if (c1273m2 != null) {
                    c1273m2.m6139I(width, height, this.f4975c0, getNanoTime());
                }
            }
        } else {
            for (int i19 = 0; i19 < childCount; i19++) {
                C1273m c1273m3 = (C1273m) this.f4971a0.get(getChildAt(i19));
                if (c1273m3 != null) {
                    this.f4948N.m6229t(c1273m3);
                    c1273m3.m6139I(width, height, this.f4975c0, getNanoTime());
                }
            }
        }
        float m6201E = this.f4948N.m6201E();
        if (m6201E != 0.0f) {
            float f11 = Float.MAX_VALUE;
            float f12 = -3.4028235E38f;
            for (int i21 = 0; i21 < childCount; i21++) {
                C1273m c1273m4 = (C1273m) this.f4971a0.get(getChildAt(i21));
                float m6154o = c1273m4.m6154o() + c1273m4.m6153n();
                f11 = Math.min(f11, m6154o);
                f12 = Math.max(f12, m6154o);
            }
            for (int i22 = 0; i22 < childCount; i22++) {
                C1273m c1273m5 = (C1273m) this.f4971a0.get(getChildAt(i22));
                float m6153n = c1273m5.m6153n();
                float m6154o2 = c1273m5.m6154o();
                c1273m5.f5169o = 1.0f / (1.0f - m6201E);
                c1273m5.f5168n = m6201E - ((((m6153n + m6154o2) - f11) * m6201E) / (f12 - f11));
            }
        }
        this.f4977d0 = 0.0f;
        this.f4979e0 = 0.0f;
        this.f4987i0 = true;
        invalidate();
    }

    /* renamed from: K0 */
    public void m6000K0() {
        this.f4994l1.m6038e(this.f5478r, this.f4948N.m6222l(this.f4956R), this.f4948N.m6222l(this.f4960T));
        m6016x0();
    }

    /* renamed from: L0 */
    public void m6001L0(int i11, C1295c c1295c) {
        C1276p c1276p = this.f4948N;
        if (c1276p != null) {
            c1276p.m6209U(i11, c1295c);
        }
        m6000K0();
        if (this.f4958S == i11) {
            c1295c.m6450i(this);
        }
    }

    /* renamed from: a0 */
    void m6002a0(float f11) {
        if (this.f4948N == null) {
            return;
        }
        float f12 = this.f4979e0;
        float f13 = this.f4977d0;
        if (f12 != f13 && this.f4985h0) {
            this.f4979e0 = f13;
        }
        float f14 = this.f4979e0;
        if (f14 == f11) {
            return;
        }
        this.f5001p0 = false;
        this.f4983g0 = f11;
        this.f4975c0 = r0.m6226p() / 1000.0f;
        setProgress(this.f4983g0);
        this.f4950O = null;
        this.f4952P = this.f4948N.m6228s();
        this.f4985h0 = false;
        this.f4973b0 = getNanoTime();
        this.f4987i0 = true;
        this.f4977d0 = f14;
        this.f4979e0 = f14;
        invalidate();
    }

    /* renamed from: b0 */
    public boolean m6003b0(int i11, C1273m c1273m) {
        C1276p c1276p = this.f4948N;
        if (c1276p != null) {
            return c1276p.m6217g(i11, c1273m);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        String m6061e;
        C1280t c1280t;
        ArrayList arrayList = this.f4941G0;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((MotionHelper) it.next()).m5952D(canvas);
            }
        }
        m6005i0(false);
        C1276p c1276p = this.f4948N;
        if (c1276p != null && (c1280t = c1276p.f5220s) != null) {
            c1280t.m6321c();
        }
        super.dispatchDraw(canvas);
        if (this.f4948N == null) {
            return;
        }
        if ((this.f4997n0 & 1) == 1 && !isInEditMode()) {
            this.f4943I0++;
            long nanoTime = getNanoTime();
            long j11 = this.f4944J0;
            if (j11 != -1) {
                if (nanoTime - j11 > 200000000) {
                    this.f4945K0 = ((int) ((this.f4943I0 / (((float) r5) * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f4943I0 = 0;
                    this.f4944J0 = nanoTime;
                }
            } else {
                this.f4944J0 = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            String str = this.f4945K0 + " fps " + AbstractC1261a.m6061e(this, this.f4956R) + " -> ";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(AbstractC1261a.m6061e(this, this.f4960T));
            sb2.append(" (progress: ");
            sb2.append(((int) (getProgress() * 1000.0f)) / 10.0f);
            sb2.append(" ) state=");
            int i11 = this.f4958S;
            if (i11 == -1) {
                m6061e = AdError.UNDEFINED_DOMAIN;
            } else {
                m6061e = AbstractC1261a.m6061e(this, i11);
            }
            sb2.append(m6061e);
            String sb3 = sb2.toString();
            paint.setColor(-16777216);
            canvas.drawText(sb3, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(sb3, 10.0f, getHeight() - 30, paint);
        }
        if (this.f4997n0 > 1) {
            if (this.f4999o0 == null) {
                this.f4999o0 = new C1254e();
            }
            this.f4999o0.m6030a(canvas, this.f4971a0, this.f4948N.m6226p(), this.f4997n0);
        }
        ArrayList arrayList2 = this.f4941G0;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((MotionHelper) it2.next()).m5951C(canvas);
            }
        }
    }

    public int[] getConstraintSetIds() {
        C1276p c1276p = this.f4948N;
        if (c1276p == null) {
            return null;
        }
        return c1276p.m6224n();
    }

    public int getCurrentState() {
        return this.f4958S;
    }

    public ArrayList<C1276p.b> getDefinedTransitions() {
        C1276p c1276p = this.f4948N;
        if (c1276p == null) {
            return null;
        }
        return c1276p.m6225o();
    }

    public C1262b getDesignTool() {
        if (this.f5006s0 == null) {
            this.f5006s0 = new C1262b(this);
        }
        return this.f5006s0;
    }

    public int getEndState() {
        return this.f4960T;
    }

    protected long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f4979e0;
    }

    public C1276p getScene() {
        return this.f4948N;
    }

    public int getStartState() {
        return this.f4956R;
    }

    public float getTargetPosition() {
        return this.f4983g0;
    }

    public Bundle getTransitionState() {
        if (this.f4969Y0 == null) {
            this.f4969Y0 = new C1258i();
        }
        this.f4969Y0.m6051c();
        return this.f4969Y0.m6050b();
    }

    public long getTransitionTimeMs() {
        if (this.f4948N != null) {
            this.f4975c0 = r0.m6226p() / 1000.0f;
        }
        return this.f4975c0 * 1000.0f;
    }

    public float getVelocity() {
        return this.f4954Q;
    }

    /* renamed from: h0 */
    public void m6004h0(boolean z11) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            C1273m c1273m = (C1273m) this.f4971a0.get(getChildAt(i11));
            if (c1273m != null) {
                c1273m.m6146f(z11);
            }
        }
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: i */
    public void mo5176i(View view, View view2, int i11, int i12) {
        this.f4936B0 = getNanoTime();
        this.f4937C0 = 0.0f;
        this.f5013z0 = 0.0f;
        this.f4935A0 = 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0175  */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m6005i0(boolean z11) {
        float f11;
        boolean z12;
        char c11;
        int childCount;
        Interpolator interpolator;
        float interpolation;
        Interpolator interpolator2;
        int i11;
        boolean z13;
        int i12;
        if (this.f4981f0 == -1) {
            this.f4981f0 = getNanoTime();
        }
        float f12 = this.f4979e0;
        if (f12 > 0.0f && f12 < 1.0f) {
            this.f4958S = -1;
        }
        boolean z14 = true;
        boolean z15 = false;
        if (this.f4938D0 || (this.f4987i0 && (z11 || this.f4983g0 != f12))) {
            float signum = Math.signum(this.f4983g0 - f12);
            long nanoTime = getNanoTime();
            Interpolator interpolator3 = this.f4950O;
            if (!(interpolator3 instanceof AbstractInterpolatorC1274n)) {
                f11 = ((((float) (nanoTime - this.f4981f0)) * signum) * 1.0E-9f) / this.f4975c0;
            } else {
                f11 = 0.0f;
            }
            float f13 = this.f4979e0 + f11;
            if (this.f4985h0) {
                f13 = this.f4983g0;
            }
            if ((signum > 0.0f && f13 >= this.f4983g0) || (signum <= 0.0f && f13 <= this.f4983g0)) {
                f13 = this.f4983g0;
                this.f4987i0 = false;
                z12 = true;
            } else {
                z12 = false;
            }
            this.f4979e0 = f13;
            this.f4977d0 = f13;
            this.f4981f0 = nanoTime;
            if (interpolator3 != null && !z12) {
                if (this.f5001p0) {
                    float interpolation2 = interpolator3.getInterpolation(((float) (nanoTime - this.f4973b0)) * 1.0E-9f);
                    Interpolator interpolator4 = this.f4950O;
                    C18159b c18159b = this.f5003q0;
                    if (interpolator4 == c18159b) {
                        if (c18159b.m96457c()) {
                            c11 = 2;
                        } else {
                            c11 = 1;
                        }
                    } else {
                        c11 = 0;
                    }
                    this.f4979e0 = interpolation2;
                    this.f4981f0 = nanoTime;
                    Interpolator interpolator5 = this.f4950O;
                    if (interpolator5 instanceof AbstractInterpolatorC1274n) {
                        float mo6019a = ((AbstractInterpolatorC1274n) interpolator5).mo6019a();
                        this.f4954Q = mo6019a;
                        if (Math.abs(mo6019a) * this.f4975c0 <= 1.0E-5f && c11 == 2) {
                            this.f4987i0 = false;
                        }
                        if (mo6019a > 0.0f && interpolation2 >= 1.0f) {
                            this.f4979e0 = 1.0f;
                            this.f4987i0 = false;
                            interpolation2 = 1.0f;
                        }
                        if (mo6019a < 0.0f && interpolation2 <= 0.0f) {
                            this.f4979e0 = 0.0f;
                            this.f4987i0 = false;
                            f13 = 0.0f;
                            if (Math.abs(this.f4954Q) > 1.0E-5f) {
                                setState(EnumC1260k.MOVING);
                            }
                            if (c11 != 1) {
                                if ((signum > 0.0f && f13 >= this.f4983g0) || (signum <= 0.0f && f13 <= this.f4983g0)) {
                                    f13 = this.f4983g0;
                                    this.f4987i0 = false;
                                }
                                if (f13 >= 1.0f || f13 <= 0.0f) {
                                    this.f4987i0 = false;
                                    setState(EnumC1260k.FINISHED);
                                }
                            }
                            childCount = getChildCount();
                            this.f4938D0 = false;
                            long nanoTime2 = getNanoTime();
                            this.f4965V0 = f13;
                            interpolator = this.f4952P;
                            if (interpolator == null) {
                                interpolation = f13;
                            } else {
                                interpolation = interpolator.getInterpolation(f13);
                            }
                            interpolator2 = this.f4952P;
                            if (interpolator2 != null) {
                                float interpolation3 = interpolator2.getInterpolation((signum / this.f4975c0) + f13);
                                this.f4954Q = interpolation3;
                                this.f4954Q = interpolation3 - this.f4952P.getInterpolation(f13);
                            }
                            for (i11 = 0; i11 < childCount; i11++) {
                                View childAt = getChildAt(i11);
                                C1273m c1273m = (C1273m) this.f4971a0.get(childAt);
                                if (c1273m != null) {
                                    this.f4938D0 = c1273m.m6160x(childAt, interpolation, nanoTime2, this.f4967W0) | this.f4938D0;
                                }
                            }
                            if ((signum <= 0.0f && f13 >= this.f4983g0) || (signum <= 0.0f && f13 <= this.f4983g0)) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (!this.f4938D0 && !this.f4987i0 && z13) {
                                setState(EnumC1260k.FINISHED);
                            }
                            if (this.f4951O0) {
                                requestLayout();
                            }
                            this.f4938D0 = (!z13) | this.f4938D0;
                            if (f13 <= 0.0f && (i12 = this.f4956R) != -1 && this.f4958S != i12) {
                                this.f4958S = i12;
                                this.f4948N.m6222l(i12).m6448g(this);
                                setState(EnumC1260k.FINISHED);
                                z15 = true;
                            }
                            if (f13 >= 1.0d) {
                                int i13 = this.f4958S;
                                int i14 = this.f4960T;
                                if (i13 != i14) {
                                    this.f4958S = i14;
                                    this.f4948N.m6222l(i14).m6448g(this);
                                    setState(EnumC1260k.FINISHED);
                                    z15 = true;
                                }
                            }
                            if (this.f4938D0 && !this.f4987i0) {
                                if ((signum > 0.0f && f13 == 1.0f) || (signum < 0.0f && f13 == 0.0f)) {
                                    setState(EnumC1260k.FINISHED);
                                }
                            } else {
                                invalidate();
                            }
                            if (!this.f4938D0 && !this.f4987i0 && ((signum > 0.0f && f13 == 1.0f) || (signum < 0.0f && f13 == 0.0f))) {
                                m6015v0();
                            }
                        }
                    }
                    f13 = interpolation2;
                    if (Math.abs(this.f4954Q) > 1.0E-5f) {
                    }
                    if (c11 != 1) {
                    }
                    childCount = getChildCount();
                    this.f4938D0 = false;
                    long nanoTime22 = getNanoTime();
                    this.f4965V0 = f13;
                    interpolator = this.f4952P;
                    if (interpolator == null) {
                    }
                    interpolator2 = this.f4952P;
                    if (interpolator2 != null) {
                    }
                    while (i11 < childCount) {
                    }
                    if (signum <= 0.0f) {
                    }
                    z13 = false;
                    if (!this.f4938D0) {
                        setState(EnumC1260k.FINISHED);
                    }
                    if (this.f4951O0) {
                    }
                    this.f4938D0 = (!z13) | this.f4938D0;
                    if (f13 <= 0.0f) {
                        this.f4958S = i12;
                        this.f4948N.m6222l(i12).m6448g(this);
                        setState(EnumC1260k.FINISHED);
                        z15 = true;
                    }
                    if (f13 >= 1.0d) {
                    }
                    if (this.f4938D0) {
                    }
                    invalidate();
                    if (!this.f4938D0) {
                        m6015v0();
                    }
                } else {
                    float interpolation4 = interpolator3.getInterpolation(f13);
                    Interpolator interpolator6 = this.f4950O;
                    if (interpolator6 instanceof AbstractInterpolatorC1274n) {
                        this.f4954Q = ((AbstractInterpolatorC1274n) interpolator6).mo6019a();
                    } else {
                        this.f4954Q = ((interpolator6.getInterpolation(f13 + f11) - interpolation4) * signum) / f11;
                    }
                    f13 = interpolation4;
                }
            } else {
                this.f4954Q = f11;
            }
            c11 = 0;
            if (Math.abs(this.f4954Q) > 1.0E-5f) {
            }
            if (c11 != 1) {
            }
            childCount = getChildCount();
            this.f4938D0 = false;
            long nanoTime222 = getNanoTime();
            this.f4965V0 = f13;
            interpolator = this.f4952P;
            if (interpolator == null) {
            }
            interpolator2 = this.f4952P;
            if (interpolator2 != null) {
            }
            while (i11 < childCount) {
            }
            if (signum <= 0.0f) {
            }
            z13 = false;
            if (!this.f4938D0) {
            }
            if (this.f4951O0) {
            }
            this.f4938D0 = (!z13) | this.f4938D0;
            if (f13 <= 0.0f) {
            }
            if (f13 >= 1.0d) {
            }
            if (this.f4938D0) {
            }
            invalidate();
            if (!this.f4938D0) {
            }
        }
        float f14 = this.f4979e0;
        if (f14 >= 1.0f) {
            int i15 = this.f4958S;
            int i16 = this.f4960T;
            if (i15 == i16) {
                z14 = z15;
            }
            this.f4958S = i16;
        } else {
            if (f14 <= 0.0f) {
                int i17 = this.f4958S;
                int i18 = this.f4956R;
                if (i17 == i18) {
                    z14 = z15;
                }
                this.f4958S = i18;
            }
            this.f4996m1 |= z15;
            if (z15 && !this.f4968X0) {
                requestLayout();
            }
            this.f4977d0 = this.f4979e0;
        }
        z15 = z14;
        this.f4996m1 |= z15;
        if (z15) {
            requestLayout();
        }
        this.f4977d0 = this.f4979e0;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: j */
    public void mo5177j(View view, int i11) {
        C1276p c1276p = this.f4948N;
        if (c1276p != null) {
            float f11 = this.f4937C0;
            if (f11 != 0.0f) {
                c1276p.m6206Q(this.f5013z0 / f11, this.f4935A0 / f11);
            }
        }
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: k */
    public void mo5178k(View view, int i11, int i12, int[] iArr, int i13) {
        C1276p.b bVar;
        C1277q m6257B;
        int m6289q;
        C1276p c1276p = this.f4948N;
        if (c1276p != null && (bVar = c1276p.f5204c) != null && bVar.m6258C()) {
            int i14 = -1;
            if (bVar.m6258C() && (m6257B = bVar.m6257B()) != null && (m6289q = m6257B.m6289q()) != -1 && view.getId() != m6289q) {
                return;
            }
            if (c1276p.m6232w()) {
                C1277q m6257B2 = bVar.m6257B();
                if (m6257B2 != null && (m6257B2.m6277e() & 4) != 0) {
                    i14 = i12;
                }
                float f11 = this.f4977d0;
                if ((f11 == 1.0f || f11 == 0.0f) && view.canScrollVertically(i14)) {
                    return;
                }
            }
            if (bVar.m6257B() != null && (bVar.m6257B().m6277e() & 1) != 0) {
                float m6233x = c1276p.m6233x(i11, i12);
                float f12 = this.f4979e0;
                if ((f12 <= 0.0f && m6233x < 0.0f) || (f12 >= 1.0f && m6233x > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new RunnableC1250a(view));
                    return;
                }
            }
            float f13 = this.f4977d0;
            long nanoTime = getNanoTime();
            float f14 = i11;
            this.f5013z0 = f14;
            float f15 = i12;
            this.f4935A0 = f15;
            this.f4937C0 = (float) ((nanoTime - this.f4936B0) * 1.0E-9d);
            this.f4936B0 = nanoTime;
            c1276p.m6205P(f14, f15);
            if (f13 != this.f4977d0) {
                iArr[0] = i11;
                iArr[1] = i12;
            }
            m6005i0(false);
            if (iArr[0] != 0 || iArr[1] != 0) {
                this.f5012y0 = true;
            }
        }
    }

    /* renamed from: l0 */
    protected void m6006l0() {
        int i11;
        CopyOnWriteArrayList copyOnWriteArrayList;
        if ((this.f4991k0 != null || ((copyOnWriteArrayList = this.f4942H0) != null && !copyOnWriteArrayList.isEmpty())) && this.f4946L0 == -1) {
            this.f4946L0 = this.f4958S;
            if (!this.f5004q1.isEmpty()) {
                ArrayList arrayList = this.f5004q1;
                i11 = ((Integer) arrayList.get(arrayList.size() - 1)).intValue();
            } else {
                i11 = -1;
            }
            int i12 = this.f4958S;
            if (i11 != i12 && i12 != -1) {
                this.f5004q1.add(Integer.valueOf(i12));
            }
        }
        m5991w0();
        Runnable runnable = this.f4970Z0;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.f4972a1;
        if (iArr != null && this.f4974b1 > 0) {
            m5997H0(iArr[0]);
            int[] iArr2 = this.f4972a1;
            System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
            this.f4974b1--;
        }
    }

    /* renamed from: m0 */
    public void m6007m0(int i11, float f11, float f12, float f13, float[] fArr) {
        String resourceName;
        HashMap hashMap = this.f4971a0;
        View m6382l = m6382l(i11);
        C1273m c1273m = (C1273m) hashMap.get(m6382l);
        if (c1273m != null) {
            c1273m.m6151l(f11, f12, f13, fArr);
            float y11 = m6382l.getY();
            this.f4993l0 = f11;
            this.f4995m0 = y11;
            return;
        }
        if (m6382l == null) {
            resourceName = "" + i11;
        } else {
            resourceName = m6382l.getContext().getResources().getResourceName(i11);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("WARNING could not find view id ");
        sb2.append(resourceName);
    }

    /* renamed from: n0 */
    public C1295c m6008n0(int i11) {
        C1276p c1276p = this.f4948N;
        if (c1276p == null) {
            return null;
        }
        return c1276p.m6222l(i11);
    }

    /* renamed from: o0 */
    public C1273m m6009o0(int i11) {
        return (C1273m) this.f4971a0.get(findViewById(i11));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        C1276p.b bVar;
        int i11;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.f4986h1 = display.getRotation();
        }
        C1276p c1276p = this.f4948N;
        if (c1276p != null && (i11 = this.f4958S) != -1) {
            C1295c m6222l = c1276p.m6222l(i11);
            this.f4948N.m6208T(this);
            ArrayList arrayList = this.f4941G0;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((MotionHelper) it.next()).m5950B(this);
                }
            }
            if (m6222l != null) {
                m6222l.m6450i(this);
            }
            this.f4956R = this.f4958S;
        }
        m6015v0();
        C1258i c1258i = this.f4969Y0;
        if (c1258i != null) {
            if (this.f4990j1) {
                post(new RunnableC1251b());
                return;
            } else {
                c1258i.m6049a();
                return;
            }
        }
        C1276p c1276p2 = this.f4948N;
        if (c1276p2 != null && (bVar = c1276p2.f5204c) != null && bVar.m6266x() == 4) {
            m5994E0();
            setState(EnumC1260k.SETUP);
            setState(EnumC1260k.MOVING);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C1277q m6257B;
        int m6289q;
        RectF m6288p;
        C1276p c1276p = this.f4948N;
        if (c1276p != null && this.f4966W) {
            C1280t c1280t = c1276p.f5220s;
            if (c1280t != null) {
                c1280t.m6325h(motionEvent);
            }
            C1276p.b bVar = this.f4948N.f5204c;
            if (bVar != null && bVar.m6258C() && (m6257B = bVar.m6257B()) != null && ((motionEvent.getAction() != 0 || (m6288p = m6257B.m6288p(this, new RectF())) == null || m6288p.contains(motionEvent.getX(), motionEvent.getY())) && (m6289q = m6257B.m6289q()) != -1)) {
                View view = this.f5000o1;
                if (view == null || view.getId() != m6289q) {
                    this.f5000o1 = findViewById(m6289q);
                }
                if (this.f5000o1 != null) {
                    this.f4998n1.set(r0.getLeft(), this.f5000o1.getTop(), this.f5000o1.getRight(), this.f5000o1.getBottom());
                    if (this.f4998n1.contains(motionEvent.getX(), motionEvent.getY()) && !m5989r0(this.f5000o1.getLeft(), this.f5000o1.getTop(), this.f5000o1, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        this.f4968X0 = true;
        try {
            if (this.f4948N == null) {
                super.onLayout(z11, i11, i12, i13, i14);
                return;
            }
            int i15 = i13 - i11;
            int i16 = i14 - i12;
            if (this.f5010w0 != i15 || this.f5011x0 != i16) {
                m6016x0();
                m6005i0(true);
            }
            this.f5010w0 = i15;
            this.f5011x0 = i16;
            this.f5008u0 = i15;
            this.f5009v0 = i16;
        } finally {
            this.f4968X0 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        boolean z11;
        if (this.f4948N == null) {
            super.onMeasure(i11, i12);
            return;
        }
        boolean z12 = false;
        if (this.f4962U == i11 && this.f4964V == i12) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.f4996m1) {
            this.f4996m1 = false;
            m6015v0();
            m5991w0();
            z11 = true;
        }
        if (this.f5483w) {
            z11 = true;
        }
        this.f4962U = i11;
        this.f4964V = i12;
        int m6202F = this.f4948N.m6202F();
        int m6227q = this.f4948N.m6227q();
        if ((z11 || this.f4994l1.m6039f(m6202F, m6227q)) && this.f4956R != -1) {
            super.onMeasure(i11, i12);
            this.f4994l1.m6038e(this.f5478r, this.f4948N.m6222l(m6202F), this.f4948N.m6222l(m6227q));
            this.f4994l1.m6041h();
            this.f4994l1.m6042i(m6202F, m6227q);
        } else {
            if (z11) {
                super.onMeasure(i11, i12);
            }
            z12 = true;
        }
        if (this.f4951O0 || z12) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int m16070Y = this.f5478r.m16070Y() + getPaddingLeft() + getPaddingRight();
            int m16133z = this.f5478r.m16133z() + paddingTop;
            int i13 = this.f4961T0;
            if (i13 == Integer.MIN_VALUE || i13 == 0) {
                m16070Y = (int) (this.f4953P0 + (this.f4965V0 * (this.f4957R0 - r8)));
                requestLayout();
            }
            int i14 = this.f4963U0;
            if (i14 == Integer.MIN_VALUE || i14 == 0) {
                m16133z = (int) (this.f4955Q0 + (this.f4965V0 * (this.f4959S0 - r8)));
                requestLayout();
            }
            setMeasuredDimension(m16070Y, m16133z);
        }
        m5987j0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f11, float f12) {
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i11) {
        C1276p c1276p = this.f4948N;
        if (c1276p != null) {
            c1276p.m6211W(m6384p());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C1276p c1276p = this.f4948N;
        if (c1276p != null && this.f4966W && c1276p.m6215b0()) {
            C1276p.b bVar = this.f4948N.f5204c;
            if (bVar != null && !bVar.m6258C()) {
                return super.onTouchEvent(motionEvent);
            }
            this.f4948N.m6207R(motionEvent, getCurrentState(), this);
            if (this.f4948N.f5204c.m6259D(4)) {
                return this.f4948N.f5204c.m6257B().m6290r();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f4942H0 == null) {
                this.f4942H0 = new CopyOnWriteArrayList();
            }
            this.f4942H0.add(motionHelper);
            if (motionHelper.m5949A()) {
                if (this.f4939E0 == null) {
                    this.f4939E0 = new ArrayList();
                }
                this.f4939E0.add(motionHelper);
            }
            if (motionHelper.m5955z()) {
                if (this.f4940F0 == null) {
                    this.f4940F0 = new ArrayList();
                }
                this.f4940F0.add(motionHelper);
            }
            if (motionHelper.mo5947y()) {
                if (this.f4941G0 == null) {
                    this.f4941G0 = new ArrayList();
                }
                this.f4941G0.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList arrayList = this.f4939E0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList arrayList2 = this.f4940F0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    /* renamed from: p0 */
    public C1276p.b m6010p0(int i11) {
        return this.f4948N.m6203G(i11);
    }

    /* renamed from: q0 */
    public void m6011q0(View view, float f11, float f12, float[] fArr, int i11) {
        float f13;
        float f14 = this.f4954Q;
        float f15 = this.f4979e0;
        if (this.f4950O != null) {
            float signum = Math.signum(this.f4983g0 - f15);
            float interpolation = this.f4950O.getInterpolation(this.f4979e0 + 1.0E-5f);
            f13 = this.f4950O.getInterpolation(this.f4979e0);
            f14 = (signum * ((interpolation - f13) / 1.0E-5f)) / this.f4975c0;
        } else {
            f13 = f15;
        }
        Interpolator interpolator = this.f4950O;
        if (interpolator instanceof AbstractInterpolatorC1274n) {
            f14 = ((AbstractInterpolatorC1274n) interpolator).mo6019a();
        }
        C1273m c1273m = (C1273m) this.f4971a0.get(view);
        if ((i11 & 1) == 0) {
            c1273m.m6156r(f13, view.getWidth(), view.getHeight(), f11, f12, fArr);
        } else {
            c1273m.m6151l(f13, f11, f12, fArr);
        }
        if (i11 < 2) {
            fArr[0] = fArr[0] * f14;
            fArr[1] = fArr[1] * f14;
        }
    }

    @Override // androidx.core.view.InterfaceC1543e0
    /* renamed from: r */
    public void mo5182r(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        if (this.f5012y0 || i11 != 0 || i12 != 0) {
            iArr[0] = iArr[0] + i13;
            iArr[1] = iArr[1] + i14;
        }
        this.f5012y0 = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        C1276p c1276p;
        C1276p.b bVar;
        if (!this.f4951O0 && this.f4958S == -1 && (c1276p = this.f4948N) != null && (bVar = c1276p.f5204c) != null) {
            int m6268z = bVar.m6268z();
            if (m6268z == 0) {
                return;
            }
            if (m6268z == 2) {
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    ((C1273m) this.f4971a0.get(getChildAt(i11))).m6161z();
                }
                return;
            }
        }
        super.requestLayout();
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: s */
    public void mo5183s(View view, int i11, int i12, int i13, int i14, int i15) {
    }

    public void setDebugMode(int i11) {
        this.f4997n0 = i11;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z11) {
        this.f4990j1 = z11;
    }

    public void setInteractionEnabled(boolean z11) {
        this.f4966W = z11;
    }

    public void setInterpolatedProgress(float f11) {
        if (this.f4948N != null) {
            setState(EnumC1260k.MOVING);
            Interpolator m6228s = this.f4948N.m6228s();
            if (m6228s != null) {
                setProgress(m6228s.getInterpolation(f11));
                return;
            }
        }
        setProgress(f11);
    }

    public void setOnHide(float f11) {
        ArrayList arrayList = this.f4940F0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((MotionHelper) this.f4940F0.get(i11)).setProgress(f11);
            }
        }
    }

    public void setOnShow(float f11) {
        ArrayList arrayList = this.f4939E0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((MotionHelper) this.f4939E0.get(i11)).setProgress(f11);
            }
        }
    }

    public void setProgress(float f11) {
        if (f11 >= 0.0f) {
            int i11 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
        }
        if (!isAttachedToWindow()) {
            if (this.f4969Y0 == null) {
                this.f4969Y0 = new C1258i();
            }
            this.f4969Y0.m6053e(f11);
            return;
        }
        if (f11 <= 0.0f) {
            if (this.f4979e0 == 1.0f && this.f4958S == this.f4960T) {
                setState(EnumC1260k.MOVING);
            }
            this.f4958S = this.f4956R;
            if (this.f4979e0 == 0.0f) {
                setState(EnumC1260k.FINISHED);
            }
        } else if (f11 >= 1.0f) {
            if (this.f4979e0 == 0.0f && this.f4958S == this.f4956R) {
                setState(EnumC1260k.MOVING);
            }
            this.f4958S = this.f4960T;
            if (this.f4979e0 == 1.0f) {
                setState(EnumC1260k.FINISHED);
            }
        } else {
            this.f4958S = -1;
            setState(EnumC1260k.MOVING);
        }
        if (this.f4948N == null) {
            return;
        }
        this.f4985h0 = true;
        this.f4983g0 = f11;
        this.f4977d0 = f11;
        this.f4981f0 = -1L;
        this.f4973b0 = -1L;
        this.f4950O = null;
        this.f4987i0 = true;
        invalidate();
    }

    public void setScene(C1276p c1276p) {
        this.f4948N = c1276p;
        c1276p.m6211W(m6384p());
        m6016x0();
    }

    void setStartState(int i11) {
        if (!isAttachedToWindow()) {
            if (this.f4969Y0 == null) {
                this.f4969Y0 = new C1258i();
            }
            this.f4969Y0.m6054f(i11);
            this.f4969Y0.m6052d(i11);
            return;
        }
        this.f4958S = i11;
    }

    public void setState(EnumC1260k enumC1260k) {
        EnumC1260k enumC1260k2 = EnumC1260k.FINISHED;
        if (enumC1260k == enumC1260k2 && this.f4958S == -1) {
            return;
        }
        EnumC1260k enumC1260k3 = this.f4992k1;
        this.f4992k1 = enumC1260k;
        EnumC1260k enumC1260k4 = EnumC1260k.MOVING;
        if (enumC1260k3 == enumC1260k4 && enumC1260k == enumC1260k4) {
            m5988k0();
        }
        int i11 = C1252c.f5017a[enumC1260k3.ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 == 3 && enumC1260k == enumC1260k2) {
                m6006l0();
                return;
            }
            return;
        }
        if (enumC1260k == enumC1260k4) {
            m5988k0();
        }
        if (enumC1260k == enumC1260k2) {
            m6006l0();
        }
    }

    public void setTransition(int i11) {
        if (this.f4948N != null) {
            C1276p.b m6010p0 = m6010p0(i11);
            this.f4956R = m6010p0.m6256A();
            this.f4960T = m6010p0.m6267y();
            if (!isAttachedToWindow()) {
                if (this.f4969Y0 == null) {
                    this.f4969Y0 = new C1258i();
                }
                this.f4969Y0.m6054f(this.f4956R);
                this.f4969Y0.m6052d(this.f4960T);
                return;
            }
            int i12 = this.f4958S;
            float f11 = i12 == this.f4956R ? 0.0f : i12 == this.f4960T ? 1.0f : Float.NaN;
            this.f4948N.m6213Y(m6010p0);
            this.f4994l1.m6038e(this.f5478r, this.f4948N.m6222l(this.f4956R), this.f4948N.m6222l(this.f4960T));
            m6016x0();
            if (this.f4979e0 != f11) {
                if (f11 == 0.0f) {
                    m6004h0(true);
                    this.f4948N.m6222l(this.f4956R).m6450i(this);
                } else if (f11 == 1.0f) {
                    m6004h0(false);
                    this.f4948N.m6222l(this.f4960T).m6450i(this);
                }
            }
            this.f4979e0 = Float.isNaN(f11) ? 0.0f : f11;
            if (Float.isNaN(f11)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(AbstractC1261a.m6058b());
                sb2.append(" transitionToStart ");
                m5996G0();
                return;
            }
            setProgress(f11);
        }
    }

    public void setTransitionDuration(int i11) {
        C1276p c1276p = this.f4948N;
        if (c1276p == null) {
            return;
        }
        c1276p.m6210V(i11);
    }

    public void setTransitionListener(InterfaceC1259j interfaceC1259j) {
        this.f4991k0 = interfaceC1259j;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f4969Y0 == null) {
            this.f4969Y0 = new C1258i();
        }
        this.f4969Y0.m6055g(bundle);
        if (isAttachedToWindow()) {
            this.f4969Y0.m6049a();
        }
    }

    /* renamed from: t0 */
    public boolean m6012t0() {
        return this.f4966W;
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return AbstractC1261a.m6059c(context, this.f4956R) + "->" + AbstractC1261a.m6059c(context, this.f4960T) + " (pos:" + this.f4979e0 + " Dpos/Dt:" + this.f4954Q;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    /* renamed from: u */
    protected void mo6013u(int i11) {
        this.f5486z = null;
    }

    /* renamed from: u0 */
    public InterfaceC1256g m6014u0() {
        return C1257h.m6048f();
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: v */
    public boolean mo5184v(View view, View view2, int i11, int i12) {
        C1276p.b bVar;
        C1276p c1276p = this.f4948N;
        if (c1276p != null && (bVar = c1276p.f5204c) != null && bVar.m6257B() != null && (this.f4948N.f5204c.m6257B().m6277e() & 2) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v0 */
    public void m6015v0() {
        C1276p c1276p = this.f4948N;
        if (c1276p == null) {
            return;
        }
        if (c1276p.m6218h(this, this.f4958S)) {
            requestLayout();
            return;
        }
        int i11 = this.f4958S;
        if (i11 != -1) {
            this.f4948N.m6216f(this, i11);
        }
        if (this.f4948N.m6215b0()) {
            this.f4948N.m6214Z();
        }
    }

    /* renamed from: x0 */
    public void m6016x0() {
        this.f4994l1.m6041h();
        invalidate();
    }

    /* renamed from: y0 */
    public void m6017y0(float f11, float f12) {
        if (!isAttachedToWindow()) {
            if (this.f4969Y0 == null) {
                this.f4969Y0 = new C1258i();
            }
            this.f4969Y0.m6053e(f11);
            this.f4969Y0.m6056h(f12);
            return;
        }
        setProgress(f11);
        setState(EnumC1260k.MOVING);
        this.f4954Q = f12;
        float f13 = 1.0f;
        if (f12 != 0.0f) {
            if (f12 <= 0.0f) {
                f13 = 0.0f;
            }
            m6002a0(f13);
        } else if (f11 != 0.0f && f11 != 1.0f) {
            if (f11 <= 0.5f) {
                f13 = 0.0f;
            }
            m6002a0(f13);
        }
    }

    /* renamed from: z0 */
    public void m6018z0(int i11, int i12, int i13) {
        setState(EnumC1260k.SETUP);
        this.f4958S = i11;
        this.f4956R = -1;
        this.f4960T = -1;
        C1294b c1294b = this.f5486z;
        if (c1294b != null) {
            c1294b.m6415d(i11, i12, i13);
            return;
        }
        C1276p c1276p = this.f4948N;
        if (c1276p != null) {
            c1276p.m6222l(i11).m6450i(this);
        }
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f4952P = null;
        this.f4954Q = 0.0f;
        this.f4956R = -1;
        this.f4958S = -1;
        this.f4960T = -1;
        this.f4962U = 0;
        this.f4964V = 0;
        this.f4966W = true;
        this.f4971a0 = new HashMap();
        this.f4973b0 = 0L;
        this.f4975c0 = 1.0f;
        this.f4977d0 = 0.0f;
        this.f4979e0 = 0.0f;
        this.f4983g0 = 0.0f;
        this.f4987i0 = false;
        this.f4989j0 = false;
        this.f4997n0 = 0;
        this.f5001p0 = false;
        this.f5003q0 = new C18159b();
        this.f5005r0 = new C1253d();
        this.f5007t0 = true;
        this.f5012y0 = false;
        this.f4938D0 = false;
        this.f4939E0 = null;
        this.f4940F0 = null;
        this.f4941G0 = null;
        this.f4942H0 = null;
        this.f4943I0 = 0;
        this.f4944J0 = -1L;
        this.f4945K0 = 0.0f;
        this.f4946L0 = 0;
        this.f4947M0 = 0.0f;
        this.f4949N0 = false;
        this.f4951O0 = false;
        this.f4967W0 = new C0023d();
        this.f4968X0 = false;
        this.f4970Z0 = null;
        this.f4972a1 = null;
        this.f4974b1 = 0;
        this.f4976c1 = false;
        this.f4978d1 = 0;
        this.f4980e1 = new HashMap();
        this.f4988i1 = new Rect();
        this.f4990j1 = false;
        this.f4992k1 = EnumC1260k.UNDEFINED;
        this.f4994l1 = new C1255f();
        this.f4996m1 = false;
        this.f4998n1 = new RectF();
        this.f5000o1 = null;
        this.f5002p1 = null;
        this.f5004q1 = new ArrayList();
        m5990s0(attributeSet);
    }

    public void setTransition(C1276p.b bVar) {
        this.f4948N.m6213Y(bVar);
        setState(EnumC1260k.SETUP);
        if (this.f4958S == this.f4948N.m6227q()) {
            this.f4979e0 = 1.0f;
            this.f4977d0 = 1.0f;
            this.f4983g0 = 1.0f;
        } else {
            this.f4979e0 = 0.0f;
            this.f4977d0 = 0.0f;
            this.f4983g0 = 0.0f;
        }
        this.f4981f0 = bVar.m6259D(1) ? -1L : getNanoTime();
        int m6202F = this.f4948N.m6202F();
        int m6227q = this.f4948N.m6227q();
        if (m6202F == this.f4956R && m6227q == this.f4960T) {
            return;
        }
        this.f4956R = m6202F;
        this.f4960T = m6227q;
        this.f4948N.m6212X(m6202F, m6227q);
        this.f4994l1.m6038e(this.f5478r, this.f4948N.m6222l(this.f4956R), this.f4948N.m6222l(this.f4960T));
        this.f4994l1.m6042i(this.f4956R, this.f4960T);
        this.f4994l1.m6041h();
        m6016x0();
    }
}
