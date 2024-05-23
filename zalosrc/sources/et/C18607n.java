package et;

import ag.AbstractC0791k;
import ag.C0788h;
import ag.C0789i;
import ag.InterfaceC0796p;
import am.AbstractC0924m0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.view.MotionEvent;
import com.zing.zalo.cameradecor.filter.ColorFilterConfig;
import com.zing.zalo.zmedia.view.AbstractC17358g;
import ho0.AbstractC20110a;
import im.C20612c;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import lt.AbstractC22646b;
import lt.AbstractC22647c;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p041bu.C3142a;
import p169fu.AbstractC19146a;
import p227i3.AbstractC20216t;
import p276jt.AbstractC21351f;
import p276jt.C21349d;
import p276jt.C21350e;
import p276jt.C21354i;
import p276jt.C21357l;
import p276jt.C21358m;
import p276jt.C21362q;
import p276jt.InterfaceC21360o;
import p403ot.C24551c;
import p403ot.C24552d;
import p546uf.InterfaceC27243b;
import p643xf.AbstractC29608a;
import p643xf.C29617j;
import p714zf.InterfaceC31818i;
import pt.C24908a;
import se0.AbstractC26236a;
import se0.AbstractC26237b;
import zh0.AbstractC32212c;

/* renamed from: et.n */
/* loaded from: classes4.dex */
public class C18607n extends C0788h implements GLSurfaceView.Renderer, InterfaceC31818i {

    /* renamed from: Q0 */
    private static final C21362q f93504Q0 = new C21362q(0.0d, 0.0d, 1.0d, 1.0d);

    /* renamed from: A0 */
    private ByteBuffer f93505A0;

    /* renamed from: B0 */
    private AtomicBoolean f93506B0;

    /* renamed from: C0 */
    private Runnable f93507C0;

    /* renamed from: D0 */
    private int f93508D0;

    /* renamed from: E0 */
    private boolean f93509E0;

    /* renamed from: F0 */
    private boolean f93510F0;

    /* renamed from: G0 */
    private boolean f93511G0;

    /* renamed from: H0 */
    private String f93512H0;

    /* renamed from: I0 */
    private String f93513I0;

    /* renamed from: J0 */
    private Bitmap f93514J0;

    /* renamed from: K0 */
    private final Context f93515K0;

    /* renamed from: L0 */
    private C24552d f93516L0;

    /* renamed from: M0 */
    private C24551c f93517M0;

    /* renamed from: N0 */
    private C21357l f93518N0;

    /* renamed from: O */
    private final Object f93519O;

    /* renamed from: O0 */
    private boolean f93520O0;

    /* renamed from: P */
    public final Object f93521P;

    /* renamed from: P0 */
    private boolean f93522P0;

    /* renamed from: Q */
    private final C21350e f93523Q;

    /* renamed from: R */
    private C21358m f93524R;

    /* renamed from: S */
    private final float[] f93525S;

    /* renamed from: T */
    private final float[] f93526T;

    /* renamed from: U */
    private final float[] f93527U;

    /* renamed from: V */
    private a f93528V;

    /* renamed from: W */
    private final List f93529W;

    /* renamed from: X */
    private AbstractC22647c f93530X;

    /* renamed from: Y */
    private boolean f93531Y;

    /* renamed from: Z */
    private C0789i f93532Z;

    /* renamed from: a0 */
    private final FloatBuffer f93533a0;

    /* renamed from: b0 */
    private final FloatBuffer f93534b0;

    /* renamed from: c0 */
    private C18610q f93535c0;

    /* renamed from: d0 */
    private int f93536d0;

    /* renamed from: e0 */
    private int f93537e0;

    /* renamed from: f0 */
    private int f93538f0;

    /* renamed from: g0 */
    private int f93539g0;

    /* renamed from: h0 */
    private double f93540h0;

    /* renamed from: i0 */
    private double f93541i0;

    /* renamed from: j0 */
    private double f93542j0;

    /* renamed from: k0 */
    private double f93543k0;

    /* renamed from: l0 */
    private double f93544l0;

    /* renamed from: m0 */
    private double f93545m0;

    /* renamed from: n0 */
    private double f93546n0;

    /* renamed from: o0 */
    public int f93547o0;

    /* renamed from: p0 */
    public int f93548p0;

    /* renamed from: q0 */
    private boolean f93549q0;

    /* renamed from: r0 */
    public boolean f93550r0;

    /* renamed from: s0 */
    private final C21362q f93551s0;

    /* renamed from: t0 */
    private C21362q f93552t0;

    /* renamed from: u0 */
    private boolean f93553u0;

    /* renamed from: v0 */
    private long f93554v0;

    /* renamed from: w0 */
    private long f93555w0;

    /* renamed from: x0 */
    private int f93556x0;

    /* renamed from: y0 */
    private final int f93557y0;

    /* renamed from: z0 */
    private int f93558z0;

    /* renamed from: et.n$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo39768a();

        /* renamed from: b */
        void mo39770b();

        /* renamed from: c */
        void mo39772c();
    }

    public C18607n(Context context, InterfaceC0796p interfaceC0796p, C0788h.a aVar) {
        super(context, interfaceC0796p, aVar);
        this.f93519O = new Object();
        this.f93521P = new Object();
        this.f93523Q = new C21350e();
        this.f93525S = new float[16];
        this.f93526T = new float[16];
        this.f93527U = new float[16];
        this.f93531Y = true;
        this.f93536d0 = 0;
        this.f93537e0 = 0;
        this.f93547o0 = 0;
        this.f93548p0 = 0;
        this.f93549q0 = false;
        this.f93550r0 = false;
        this.f93551s0 = AbstractC26237b.m134921f();
        this.f93552t0 = AbstractC26237b.m134921f();
        this.f93554v0 = 0L;
        this.f93555w0 = 0L;
        this.f93556x0 = 0;
        this.f93557y0 = 0;
        this.f93558z0 = 1;
        this.f93508D0 = 0;
        this.f93509E0 = false;
        this.f93510F0 = false;
        this.f93511G0 = true;
        this.f93512H0 = "";
        this.f93513I0 = "";
        this.f93520O0 = false;
        this.f93522P0 = false;
        this.f93515K0 = context;
        this.f93533a0 = AbstractC26237b.m134918c(AbstractC26237b.f124626a);
        this.f93534b0 = AbstractC26237b.m134917b(AbstractC26237b.f124630e.length);
        this.f93529W = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A1 */
    public /* synthetic */ void m98221A1() {
        C21358m c21358m = this.f93524R;
        if (c21358m != null) {
            c21358m.m110684a0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B1 */
    public /* synthetic */ void m98223B1() {
        synchronized (this.f93519O) {
            try {
                Iterator it = this.f93529W.iterator();
                while (it.hasNext()) {
                    ((AbstractC21351f) it.next()).destroy();
                }
                this.f93529W.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D1 */
    public /* synthetic */ void m98227D1() {
        mo1956Z(m1949M(), m1948L());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E1 */
    public /* synthetic */ void m98229E1(C21358m c21358m) {
        synchronized (this.f93519O) {
            m98254e2(this.f93524R);
            this.f93513I0 = "";
            this.f93524R = c21358m;
            m98257y1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F1 */
    public /* synthetic */ void m98230F1(AbstractC22647c abstractC22647c) {
        abstractC22647c.m1995x();
        abstractC22647c.mo1956Z(this.f93538f0, this.f93539g0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G1 */
    public /* synthetic */ void m98231G1(String str, Bitmap bitmap, C29617j.a aVar) {
        Bitmap bitmap2;
        Bitmap bitmap3;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("setupImageBackground(");
            sb2.append(str);
            sb2.append(")");
            if (!this.f93549q0 && this.f93511G0) {
                this.f93540h0 = bitmap.getWidth();
                this.f93541i0 = bitmap.getHeight();
            }
            boolean z11 = false;
            if (bitmap.getWidth() % 2 == 1) {
                bitmap2 = Bitmap.createBitmap(bitmap.getWidth() + 1, bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap2);
                canvas.drawARGB(0, 0, 0, 0);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            } else {
                bitmap2 = null;
            }
            m98236L0();
            if (bitmap2 != null) {
                bitmap3 = bitmap2;
            } else {
                bitmap3 = bitmap;
            }
            C29617j c29617j = new C29617j(this.f93515K0, bitmap3, this.f93533a0, this.f93534b0, aVar);
            if (!m1978n0() && this.f2708x) {
                z11 = true;
            }
            c29617j.m1954X(z11);
            c29617j.m147205c0(!m1978n0());
            m1984v0(c29617j);
            Bitmap bitmap4 = this.f93514J0;
            if (bitmap4 != null && !bitmap4.isRecycled()) {
                this.f93514J0.recycle();
                this.f93514J0 = null;
            }
            if (str == null) {
                str = "";
            }
            this.f93512H0 = str;
            if (m98314s1()) {
                m98258y2(m98253e1());
            } else {
                m98258y2(this.f93512H0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: I1 */
    private void m98232I1(float[] fArr, int i11, int i12) {
        float f11;
        float m92489b = AbstractC17358g.m92489b(this.f93515K0, 16.0f);
        float f12 = (float) (this.f93545m0 * 0.13d);
        if (this.f93518N0.m110657H0()) {
            double d11 = i11;
            double d12 = this.f93544l0;
            double d13 = m92489b;
            m98243T0(fArr, new float[]{(float) (((d11 - d12) / 2.0d) + d13), 0.0f, (float) (((d11 - d12) / 2.0d) + d13), i12});
        }
        if (this.f93518N0.m110658I0()) {
            double d14 = i11;
            double d15 = this.f93544l0;
            double d16 = m92489b;
            m98243T0(fArr, new float[]{(float) (((d14 + d15) / 2.0d) - d16), 0.0f, (float) (((d14 + d15) / 2.0d) - d16), i12});
        }
        if (this.f93518N0.m110660K0()) {
            float f13 = i11 / 2.0f;
            f11 = 0.0f;
            m98243T0(fArr, new float[]{f13, 0.0f, f13, i12});
        } else {
            f11 = 0.0f;
        }
        if (this.f93518N0.m110656G0()) {
            float f14 = i12 / 2.0f;
            m98243T0(fArr, new float[]{f11, f14, i11, f14});
        }
        if (this.f93518N0.m110659J0()) {
            double d17 = i12;
            double d18 = this.f93545m0;
            double d19 = f12;
            m98243T0(fArr, new float[]{0.0f, (float) (((d17 + d18) / 2.0d) - d19), i11, (float) (((d17 + d18) / 2.0d) - d19)});
        }
        if (this.f93518N0.m110655F0()) {
            double d21 = i12;
            double d22 = this.f93545m0;
            double d23 = f12;
            m98243T0(fArr, new float[]{0.0f, (float) (((d21 - d22) / 2.0d) + d23), i11, (float) (((d21 - d22) / 2.0d) + d23)});
        }
    }

    /* renamed from: J1 */
    private void m98233J1() {
        boolean z11;
        int i11 = (int) (this.f93544l0 + 0.5d);
        int i12 = (int) (this.f93545m0 + 0.5d);
        if ((i11 < i12 && this.f93538f0 > this.f93539g0) || (i11 > i12 && this.f93538f0 < this.f93539g0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f93553u0 = z11;
        if (z11) {
            m98250b2(90);
        }
        super.mo1909R();
        m98237L1(this.f93553u0, this.f93538f0, this.f93539g0);
        ByteBuffer byteBuffer = this.f93505A0;
        if (byteBuffer == null || byteBuffer.capacity() < this.f93538f0 * this.f93539g0) {
            this.f93505A0 = ByteBuffer.allocateDirect(this.f93538f0 * this.f93539g0 * 4);
        }
        this.f93505A0.rewind();
        GLES20.glReadPixels(0, 0, this.f93538f0, this.f93539g0, 6408, 5121, this.f93505A0);
        if (this.f93553u0) {
            m98250b2(-90);
        }
    }

    /* renamed from: K0 */
    private float m98234K0(float f11, float f12) {
        return f11 == 0.0f ? f12 : 1.0f - f12;
    }

    /* renamed from: K1 */
    private void m98235K1() {
        int i11;
        if (this.f93544l0 != 0.0d) {
            double d11 = this.f93545m0;
            if (d11 != 0.0d) {
                int i12 = this.f93539g0;
                if (d11 < i12) {
                    i11 = (int) (((i12 - d11) / 2.0d) + 0.5d);
                    this.f93523Q.m110599h(0, i11, this.f93538f0, 0);
                    this.f93523Q.m110597f(this.f93527U, this.f93535c0);
                    C21350e c21350e = this.f93523Q;
                    int i13 = this.f93539g0;
                    c21350e.m110599h(0, i13, this.f93538f0, i13 - i11);
                    this.f93523Q.m110597f(this.f93527U, this.f93535c0);
                } else {
                    i11 = 0;
                }
                double d12 = this.f93544l0;
                int i14 = this.f93538f0;
                if (d12 < i14) {
                    int i15 = (int) (((i14 - d12) / 2.0d) + 0.5d);
                    this.f93523Q.m110599h(0, this.f93539g0 - i11, i15, i11);
                    this.f93523Q.m110597f(this.f93527U, this.f93535c0);
                    C21350e c21350e2 = this.f93523Q;
                    int i16 = this.f93538f0;
                    c21350e2.m110599h(i16 - i15, this.f93539g0 - i11, i16, i11);
                    this.f93523Q.m110597f(this.f93527U, this.f93535c0);
                }
            }
        }
    }

    /* renamed from: L0 */
    private void m98236L0() {
        double d11;
        double d12;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("adjustImageScaling: output width=");
        sb2.append(this.f93538f0);
        sb2.append("; output height = ");
        sb2.append(this.f93539g0);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Image before scaling: width=");
        sb3.append(this.f93540h0);
        sb3.append("; height = ");
        sb3.append(this.f93541i0);
        try {
            boolean z11 = true;
            if (this.f93558z0 == 1) {
                int i11 = this.f93538f0;
                this.f93544l0 = i11;
                int i12 = this.f93539g0;
                this.f93545m0 = i12;
                double max = Math.max(i11 / this.f93540h0, i12 / this.f93541i0);
                this.f93540h0 = Math.round(this.f93540h0 * max);
                this.f93541i0 = Math.round(this.f93541i0 * max);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Image after scaling: width=");
                sb4.append(this.f93540h0);
                sb4.append("; height = ");
                sb4.append(this.f93541i0);
                float f11 = (1.0f - (1.0f / ((float) (this.f93540h0 / this.f93538f0)))) / 2.0f;
                float f12 = (1.0f - (1.0f / ((float) (this.f93541i0 / this.f93539g0)))) / 2.0f;
                float[] m134922g = AbstractC26237b.m134922g(0, false, false);
                float[] fArr = {m98234K0(m134922g[0], f11), m98234K0(m134922g[1], f12), m98234K0(m134922g[2], f11), m98234K0(m134922g[3], f12), m98234K0(m134922g[4], f11), m98234K0(m134922g[5], f12), m98234K0(m134922g[6], f11), m98234K0(m134922g[7], f12)};
                this.f93534b0.clear();
                this.f93534b0.put(fArr).position(0);
                int i13 = this.f93538f0;
                double d13 = i13;
                this.f93542j0 = d13;
                this.f93544l0 = d13;
                int i14 = this.f93539g0;
                double d14 = i14;
                this.f93543k0 = d14;
                this.f93545m0 = d14;
                this.f93536d0 = i13;
                this.f93537e0 = i14;
                m98305n2(i13, i14);
            } else if (this.f93511G0) {
                this.f93511G0 = false;
                if (this.f93550r0 == AbstractC32212c.m155335e(this.f93515K0)) {
                    z11 = false;
                }
                boolean z12 = this.f93549q0;
                if (z12 && !z11) {
                    this.f93534b0.clear();
                    this.f93534b0.put(AbstractC26237b.m134923h(this.f93552t0, this.f93547o0)).position(0);
                    m98305n2(this.f93536d0, this.f93537e0);
                    this.f93549q0 = false;
                } else {
                    if (z12) {
                        this.f93549q0 = false;
                    }
                    double d15 = this.f93540h0;
                    double d16 = this.f93541i0;
                    double d17 = d15 / d16;
                    this.f93546n0 = d17;
                    int i15 = this.f93538f0;
                    int i16 = this.f93539g0;
                    if (d17 > i15 / i16) {
                        double d18 = (i15 * d16) / d15;
                        this.f93541i0 = d18;
                        this.f93540h0 = i15;
                        double d19 = d18 / i16;
                        this.f93546n0 = d19;
                        d12 = ((1.0d / d19) - 1.0d) / 2.0d;
                        d11 = 0.0d;
                    } else {
                        double d21 = (i16 * d15) / d16;
                        this.f93540h0 = d21;
                        this.f93541i0 = i16;
                        double d22 = i15 / d21;
                        this.f93546n0 = d22;
                        d11 = (d22 - 1.0d) / 2.0d;
                        d12 = 0.0d;
                    }
                    double d23 = this.f93540h0;
                    this.f93542j0 = d23;
                    this.f93544l0 = d23;
                    double d24 = this.f93541i0;
                    this.f93543k0 = d24;
                    this.f93545m0 = d24;
                    this.f93552t0 = new C21362q(0.0d - d11, 0.0d - d12, d11 + 1.0d, d12 + 1.0d);
                    this.f93534b0.clear();
                    this.f93534b0.put(AbstractC26237b.m134923h(this.f93552t0, this.f93547o0)).position(0);
                    int i17 = (int) this.f93542j0;
                    this.f93536d0 = i17;
                    int i18 = (int) this.f93543k0;
                    this.f93537e0 = i18;
                    m98305n2(i17, i18);
                    int i19 = this.f93548p0;
                    if (i19 > 0) {
                        m98290f2(i19);
                        this.f93548p0 = 0;
                    } else {
                        a aVar = this.f93528V;
                        if (aVar != null) {
                            aVar.mo39768a();
                        }
                    }
                }
            }
            this.f93533a0.clear();
            this.f93533a0.put(AbstractC26237b.f124626a).position(0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: L1 */
    private void m98237L1(boolean z11, int i11, int i12) {
        boolean z12;
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        if (this.f93531Y) {
            C21358m c21358m = this.f93524R;
            if (c21358m != null) {
                if (this.f93558z0 == 1) {
                    c21358m.m110691j0(this.f93535c0, null, i11, i12);
                } else {
                    c21358m.m110691j0(this.f93535c0, this.f93534b0, i11, i12);
                }
            }
            if (this.f93518N0 != null) {
                if (this.f93520O0) {
                    m98232I1(this.f93527U, i11, i12);
                }
                if (this.f93522P0) {
                    m98239N1(this.f93527U, i11, i12);
                }
            }
            synchronized (this.f93519O) {
                try {
                    z12 = false;
                    for (AbstractC21351f abstractC21351f : this.f93529W) {
                        if (!(abstractC21351f instanceof AbstractC22646b) && !(abstractC21351f instanceof InterfaceC21360o)) {
                            if (this.f93530X != null && (abstractC21351f instanceof C24908a)) {
                                m98242Q1(Boolean.valueOf(z11));
                                abstractC21351f.m110603b0(this.f93527U, this.f93535c0);
                                z12 = true;
                            } else {
                                abstractC21351f.m110603b0(this.f93527U, this.f93535c0);
                            }
                        }
                    }
                } finally {
                }
            }
            if (z12) {
                return;
            }
        }
        m98242Q1(Boolean.valueOf(z11));
    }

    /* renamed from: M1 */
    private void m98238M1() {
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        synchronized (this.f93519O) {
            try {
                for (AbstractC21351f abstractC21351f : this.f93529W) {
                    if (abstractC21351f instanceof InterfaceC21360o) {
                        abstractC21351f.m110603b0(this.f93527U, this.f93535c0);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        GLES20.glDisable(3042);
    }

    /* renamed from: N1 */
    private void m98239N1(float[] fArr, int i11, int i12) {
        float m110607g0;
        float f11;
        if (this.f93518N0.m110604c0() % 180.0f == 0.0f) {
            m98244U0(fArr, new float[]{0.0f, this.f93518N0.m110607g0(), i11, this.f93518N0.m110607g0()}, 0);
            return;
        }
        if (this.f93518N0.m110604c0() % 90.0f == 0.0f) {
            m98244U0(fArr, new float[]{this.f93518N0.m110606f0(), 0.0f, this.f93518N0.m110606f0(), i12}, 1);
            return;
        }
        if (this.f93518N0.m110604c0() % 45.0f == 0.0f) {
            if (this.f93518N0.m110604c0() % 180.0f == 45.0f) {
                m110607g0 = this.f93518N0.m110607g0() - this.f93518N0.m110606f0();
                f11 = i11 + m110607g0;
            } else {
                m110607g0 = this.f93518N0.m110607g0() + this.f93518N0.m110606f0();
                f11 = m110607g0 - i11;
            }
            m98244U0(fArr, new float[]{0.0f, m110607g0, i11, f11}, 0);
        }
    }

    /* renamed from: O0 */
    private void m98240O0(AbstractC21351f abstractC21351f, C21362q c21362q, double d11) {
        abstractC21351f.mo97628p0((float) (abstractC21351f.m110605e0() * d11));
        double m110606f0 = (((abstractC21351f.m110606f0() * this.f93552t0.m110713h()) / this.f93538f0) + this.f93552t0.f104140a) - c21362q.f104140a;
        double m110607g0 = (((abstractC21351f.m110607g0() * this.f93552t0.m110707b()) / this.f93539g0) + (1.0d - this.f93552t0.f104143d)) - (1.0d - c21362q.f104143d);
        abstractC21351f.mo110614r0((float) (m110606f0 * this.f93542j0));
        abstractC21351f.m110615s0((float) (m110607g0 * this.f93543k0));
    }

    /* renamed from: P0 */
    private void m98241P0(AbstractC22647c abstractC22647c, C21362q c21362q, double d11) {
        double m110713h = (this.f93542j0 * this.f93552t0.m110713h()) / this.f93538f0;
        double d12 = this.f93542j0;
        C21362q c21362q2 = this.f93552t0;
        abstractC22647c.mo1906C0(d11, m110713h, d12 * (c21362q2.f104140a - c21362q.f104140a), (this.f93543k0 * c21362q2.m110707b()) / this.f93539g0, this.f93543k0 * ((1.0d - this.f93552t0.f104143d) - (1.0d - c21362q.f104143d)));
    }

    /* renamed from: Q1 */
    private void m98242Q1(Boolean bool) {
        AbstractC22647c abstractC22647c;
        if (this.f93508D0 != 1 && (abstractC22647c = this.f93530X) != null) {
            abstractC22647c.m117225M0(bool.booleanValue());
            this.f93530X.m117226N0((int) this.f93544l0, (int) this.f93545m0);
            this.f93530X.m117224D0(this.f93527U, this.f93535c0, (int) this.f93544l0, (int) this.f93545m0, this.f93538f0, this.f93539g0, bool.booleanValue());
            this.f93530X.m117225M0(false);
        }
    }

    /* renamed from: T0 */
    private void m98243T0(float[] fArr, float[] fArr2) {
        this.f93516L0.m127923g(fArr2);
        this.f93516L0.m127922f(fArr);
    }

    /* renamed from: U0 */
    private void m98244U0(float[] fArr, float[] fArr2, int i11) {
        this.f93517M0.m127921h(fArr2);
        this.f93517M0.m127920g(i11);
        this.f93517M0.m127919f(fArr);
    }

    /* renamed from: W0 */
    private boolean m98245W0(AbstractC21351f abstractC21351f) {
        Iterator it = this.f93529W.iterator();
        while (it.hasNext()) {
            if (((AbstractC21351f) it.next()) == abstractC21351f) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: W1 */
    private void m98246W1() {
        C21358m c21358m = this.f93524R;
        if (c21358m != null && c21358m.mo1997z()) {
            this.f93524R.m110694o0();
        }
    }

    /* renamed from: Z0 */
    private Bitmap m98247Z0() {
        int i11;
        int i12;
        Bitmap m98277T1 = m98277T1();
        if (m98277T1 == null) {
            return null;
        }
        Bitmap m100465d = AbstractC19146a.m100465d(AbstractC19146a.m100468g(m98277T1, 0.5f), 25);
        Bitmap bitmap = this.f93514J0;
        if (bitmap != null) {
            i11 = bitmap.getWidth();
        } else {
            i11 = (int) this.f93542j0;
        }
        Bitmap bitmap2 = this.f93514J0;
        if (bitmap2 != null) {
            i12 = bitmap2.getHeight();
        } else {
            i12 = (int) this.f93543k0;
        }
        if (m100465d.getWidth() != i11 || m100465d.getHeight() != i12) {
            return Bitmap.createScaledBitmap(m100465d, i11, i12, false);
        }
        return m100465d;
    }

    /* renamed from: Z1 */
    private JSONObject m98248Z1(AbstractC21351f abstractC21351f, C21362q c21362q, double d11) {
        double m110606f0 = (((abstractC21351f.m110606f0() * this.f93552t0.m110713h()) / this.f93538f0) + this.f93552t0.f104140a) - c21362q.f104140a;
        double m110607g0 = (((abstractC21351f.m110607g0() * this.f93552t0.m110707b()) / this.f93539g0) + (1.0d - this.f93552t0.f104143d)) - (1.0d - c21362q.f104143d);
        JSONObject mo110584d0 = abstractC21351f.mo110584d0();
        mo110584d0.put(AbstractC20216t.f99969a, abstractC21351f.getClass().getSimpleName());
        mo110584d0.put("x", (float) (m110606f0 * this.f93542j0 * d11));
        mo110584d0.put("y", (float) (m110607g0 * this.f93543k0 * d11));
        mo110584d0.put("sc", (float) (abstractC21351f.m110605e0() * d11));
        return mo110584d0;
    }

    /* renamed from: a1 */
    private Bitmap m98249a1() {
        AbstractC29608a m1975k0 = m1975k0();
        if (m1975k0 instanceof C29617j) {
            Bitmap m147204b0 = ((C29617j) m1975k0).m147204b0();
            int width = m147204b0.getWidth();
            int height = m147204b0.getHeight();
            Bitmap m100465d = AbstractC19146a.m100465d(AbstractC19146a.m100468g(m147204b0, 0.5f), 25);
            if (m100465d.getWidth() != width || m100465d.getHeight() != height) {
                return Bitmap.createScaledBitmap(m100465d, width, height, false);
            }
            return m100465d;
        }
        return null;
    }

    /* renamed from: b2 */
    private void m98250b2(int i11) {
        int i12 = ((i11 + 360) % 360) / 90;
        C21362q c21362q = new C21362q(this.f93551s0);
        m98290f2(0);
        for (int i13 = 0; i13 < i12; i13++) {
            c21362q.m110710e(c21362q.f104141b, 1.0d - c21362q.f104142c, c21362q.f104143d, 1.0d - c21362q.f104140a);
            m98285a2(0);
        }
        m98269N0(c21362q, 0, 0);
    }

    /* renamed from: c2 */
    private void m98251c2(AbstractC21351f abstractC21351f, double d11) {
        abstractC21351f.m110611n0(abstractC21351f.m110604c0() + 90.0f);
        abstractC21351f.mo97628p0((float) (abstractC21351f.m110605e0() * d11));
        float m110607g0 = (float) (((this.f93542j0 - (abstractC21351f.m110607g0() - ((this.f93539g0 - this.f93542j0) / 2.0d))) * d11) + ((this.f93538f0 - this.f93544l0) / 2.0d));
        float m110606f0 = (float) (((abstractC21351f.m110606f0() - ((this.f93538f0 - this.f93543k0) / 2.0d)) * d11) + ((this.f93539g0 - this.f93545m0) / 2.0d));
        abstractC21351f.mo110614r0(m110607g0);
        abstractC21351f.m110615s0(m110606f0);
    }

    /* renamed from: d2 */
    private void m98252d2(AbstractC22647c abstractC22647c, double d11) {
        double d12 = -d11;
        int i11 = this.f93539g0;
        double d13 = (i11 + this.f93542j0) * d11;
        int i12 = this.f93538f0;
        abstractC22647c.mo1908L0(90.0d, d11, d12, ((d13 + i12) - this.f93544l0) / 2.0d, d11, ((((i12 - this.f93543k0) * d12) + i11) - this.f93545m0) / 2.0d);
    }

    /* renamed from: e1 */
    private String m98253e1() {
        if (m1976l0() != null) {
            String str = this.f93512H0;
            if (m98286b1() != null) {
                return str + "_" + m98286b1().mo98211f();
            }
            return str;
        }
        return "";
    }

    /* renamed from: e2 */
    private void m98254e2(final AbstractC0791k abstractC0791k) {
        if (abstractC0791k != null) {
            Runnable runnable = new Runnable() { // from class: et.l
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC0791k.this.destroy();
                }
            };
            if (m1992u()) {
                runnable.run();
            } else {
                m1952U(runnable);
            }
        }
    }

    /* renamed from: n1 */
    private float m98255n1() {
        if (AbstractC0924m0.m3567X8()) {
            return 1.0f;
        }
        return 1.3333334f;
    }

    /* renamed from: y1 */
    private void m98257y1() {
        if (m1980p0()) {
            m98305n2(m1949M(), m1948L());
        } else {
            m98305n2(this.f93536d0, this.f93537e0);
        }
    }

    /* renamed from: y2 */
    private void m98258y2(String str) {
        Bitmap m15818b;
        if (!this.f93510F0 || this.f93513I0.equals(str)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updateBlurImageBackground(");
        sb2.append(str);
        sb2.append(")");
        if (str.equals(this.f93512H0)) {
            m15818b = this.f93514J0;
            if (m15818b == null || m15818b.isRecycled()) {
                m15818b = m98249a1();
                if (m15818b == null) {
                    return;
                } else {
                    this.f93514J0 = m15818b;
                }
            }
        } else {
            m15818b = C3142a.m15817c().m15818b(str);
            if (m15818b == null || m15818b.isRecycled()) {
                m15818b = m98247Z0();
                if (m15818b != null && !AbstractC19146a.m100464c(m15818b)) {
                    C3142a.m15817c().m15820e(str, m15818b);
                } else {
                    return;
                }
            }
        }
        C21358m c21358m = this.f93524R;
        if (c21358m != null) {
            c21358m.m110696q0(this.f93515K0, m15818b, this.f93533a0, this.f93534b0);
            this.f93513I0 = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.C0788h, ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: A */
    public void mo1905A() {
        super.mo1905A();
        this.f93513I0 = "";
        this.f93535c0.m98342a();
        this.f93523Q.m110596e();
        C0789i c0789i = this.f93532Z;
        if (c0789i != null) {
            c0789i.destroy();
        }
        C21358m c21358m = this.f93524R;
        if (c21358m != null) {
            c21358m.destroy();
        }
        AbstractC22647c abstractC22647c = this.f93530X;
        if (abstractC22647c != null) {
            abstractC22647c.destroy();
        }
        synchronized (this.f93519O) {
            try {
                Iterator it = this.f93529W.iterator();
                while (it.hasNext()) {
                    ((AbstractC21351f) it.next()).destroy();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: A2 */
    public void m98260A2(C21362q c21362q) {
        this.f93552t0.m110712g(c21362q);
        this.f93534b0.clear();
        this.f93534b0.put(AbstractC26237b.m134923h(this.f93552t0, 0)).position(0);
    }

    /* renamed from: B2 */
    public void m98261B2(C20612c c20612c) {
        try {
            c20612c.m107276R((int) this.f93544l0);
            c20612c.m107260B((int) this.f93545m0);
            C21358m c21358m = this.f93524R;
            if (c21358m != null) {
                c21358m.m110683A0(c20612c);
            }
            synchronized (this.f93519O) {
                try {
                    for (AbstractC21351f abstractC21351f : this.f93529W) {
                        if (abstractC21351f.m110610j0()) {
                            abstractC21351f.mo110587v0(c20612c);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: D */
    public void mo1889D() {
        super.mo1889D();
        C18610q c18610q = new C18610q();
        this.f93535c0 = c18610q;
        c18610q.m98344c();
        this.f93516L0 = new C24552d();
        this.f93517M0 = new C24551c();
        synchronized (this.f93519O) {
            try {
                Iterator it = this.f93529W.iterator();
                while (it.hasNext()) {
                    ((AbstractC21351f) it.next()).m1995x();
                }
                C21358m c21358m = this.f93524R;
                if (c21358m != null) {
                    c21358m.m1995x();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        AbstractC22647c abstractC22647c = this.f93530X;
        if (abstractC22647c != null) {
            abstractC22647c.m1995x();
        }
    }

    /* renamed from: F0 */
    public void m98262F0(C21349d c21349d) {
        synchronized (this.f93519O) {
            try {
                if (this.f93532Z == null && c21349d.m110588w0() != null) {
                    this.f93532Z = new C0789i(c21349d.m110588w0());
                }
                c21349d.m110590y0(this.f93532Z);
                this.f93529W.add(c21349d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: G0 */
    public void m98263G0(AbstractC22646b abstractC22646b) {
        synchronized (this.f93519O) {
            try {
                if (!m98245W0(abstractC22646b)) {
                    this.f93529W.add(abstractC22646b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: H0 */
    public void m98264H0(AbstractC21351f abstractC21351f) {
        synchronized (this.f93519O) {
            this.f93529W.add(abstractC21351f);
        }
    }

    /* renamed from: H1 */
    public void m98265H1(double d11, double d12) {
        this.f93544l0 = d11;
        this.f93545m0 = d12;
        a aVar = this.f93528V;
        if (aVar != null) {
            aVar.mo39768a();
        }
        if (mo1997z()) {
            m1996y();
        }
    }

    /* renamed from: I0 */
    public void m98266I0(C21357l c21357l, Context context) {
        synchronized (this.f93519O) {
            c21357l.m110671X0(context);
            this.f93529W.add(c21357l);
        }
    }

    /* renamed from: J0 */
    public void m98267J0(AbstractC21351f abstractC21351f) {
        synchronized (this.f93519O) {
            int i11 = 0;
            while (i11 < this.f93529W.size() && !(this.f93529W.get(i11) instanceof InterfaceC21360o)) {
                try {
                    i11++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f93529W.add(i11, abstractC21351f);
        }
    }

    /* renamed from: M0 */
    public void m98268M0() {
        m1952U(new Runnable() { // from class: et.i
            @Override // java.lang.Runnable
            public final void run() {
                C18607n.this.m98221A1();
            }
        });
    }

    /* renamed from: N0 */
    public void m98269N0(C21362q c21362q, int i11, int i12) {
        int i13;
        try {
            C21362q c21362q2 = this.f93551s0;
            if (c21362q == c21362q2) {
                c21362q = new C21362q(c21362q2);
            } else {
                c21362q2.m110712g(c21362q);
            }
            if (c21362q.m110713h() / c21362q.m110707b() > this.f93546n0) {
                double m110713h = ((c21362q.m110713h() / this.f93546n0) - c21362q.m110707b()) / 2.0d;
                c21362q.f104141b -= m110713h;
                c21362q.f104143d += m110713h;
            } else {
                double m110707b = ((c21362q.m110707b() * this.f93546n0) - c21362q.m110713h()) / 2.0d;
                c21362q.f104140a -= m110707b;
                c21362q.f104142c += m110707b;
            }
            double m110707b2 = 1.0d / c21362q.m110707b();
            if (i12 > 0) {
                i13 = i12;
            } else {
                i13 = this.f93539g0;
            }
            double d11 = m110707b2 * i13;
            double d12 = this.f93543k0;
            double d13 = d11 / d12;
            this.f93542j0 *= d13;
            this.f93543k0 = d12 * d13;
            synchronized (this.f93519O) {
                try {
                    Iterator it = this.f93529W.iterator();
                    while (it.hasNext()) {
                        m98240O0((AbstractC21351f) it.next(), c21362q, d13);
                    }
                } finally {
                }
            }
            AbstractC22647c abstractC22647c = this.f93530X;
            if (abstractC22647c != null) {
                m98241P0(abstractC22647c, c21362q, d13);
            }
            if (i11 <= 0) {
                i11 = this.f93538f0;
            }
            this.f93544l0 = (i11 * this.f93551s0.m110709d()) / c21362q.m110713h();
            if (i12 <= 0) {
                i12 = this.f93539g0;
            }
            this.f93545m0 = (i12 * this.f93551s0.m110708c()) / c21362q.m110707b();
            this.f93534b0.clear();
            this.f93534b0.put(AbstractC26237b.m134923h(c21362q, this.f93547o0)).position(0);
            this.f93552t0.m110712g(c21362q);
            a aVar = this.f93528V;
            if (aVar != null) {
                aVar.mo39768a();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: O1 */
    public void m98270O1(int i11, int i12, boolean z11, int i13) {
        try {
            double d11 = this.f93540h0;
            double d12 = this.f93541i0;
            double d13 = d11 / d12;
            this.f93546n0 = d13;
            double d14 = i11;
            double d15 = i12;
            if (d13 > d14 / d15) {
                double d16 = (d12 * d14) / d11;
                this.f93541i0 = d16;
                this.f93540h0 = d14;
                this.f93546n0 = d16 / d15;
            } else {
                double d17 = (d11 * d15) / d12;
                this.f93540h0 = d17;
                this.f93541i0 = d15;
                this.f93546n0 = d14 / d17;
            }
            C21362q c21362q = this.f93551s0;
            if (z11) {
                c21362q = new C21362q();
                double d18 = (i12 - i13) / this.f93541i0;
                if (d18 < 1.0d) {
                    double d19 = ((1.0d / d18) - 1.0d) / 2.0d;
                    c21362q.f104140a -= d19;
                    c21362q.f104141b -= d19;
                    c21362q.f104142c += d19;
                    c21362q.f104143d += d19;
                }
            }
            m98269N0(c21362q, i11, i12);
            if (z11) {
                this.f93544l0 = this.f93542j0;
                this.f93545m0 = this.f93543k0;
                a aVar = this.f93528V;
                if (aVar != null) {
                    aVar.mo39768a();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: P1 */
    public void m98271P1(int i11, int i12) {
        double d11 = i11;
        try {
            this.f93544l0 = d11;
            this.f93542j0 = d11;
            double d12 = i12;
            this.f93545m0 = d12;
            this.f93543k0 = d12;
            double d13 = d11 / this.f93538f0;
            this.f93552t0.m110710e(0.0d, 0.0d, 1.0d, 1.0d);
            C21362q c21362q = this.f93552t0;
            synchronized (this.f93519O) {
                try {
                    Iterator it = this.f93529W.iterator();
                    while (it.hasNext()) {
                        m98240O0((AbstractC21351f) it.next(), c21362q, d13);
                    }
                } finally {
                }
            }
            AbstractC22647c abstractC22647c = this.f93530X;
            if (abstractC22647c != null) {
                m98241P0(abstractC22647c, c21362q, d13);
            }
            a aVar = this.f93528V;
            if (aVar != null) {
                aVar.mo39768a();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Q0 */
    public void m98272Q0() {
        m98254e2(this.f93524R);
        this.f93524R = null;
        this.f93513I0 = "";
        m98254e2(this.f93530X);
        this.f93530X = null;
        m1952U(new Runnable() { // from class: et.e
            @Override // java.lang.Runnable
            public final void run() {
                C18607n.this.m98223B1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.C0788h, ag.AbstractC0784d
    /* renamed from: R */
    public void mo1909R() {
        try {
            if (!this.f93509E0) {
                return;
            }
            if (m1977m0()) {
                GLES20.glViewport(0, 0, this.f93538f0, this.f93539g0);
                GLES20.glEnable(3042);
                GLES20.glBlendFunc(770, 771);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16640);
                int i11 = this.f93508D0;
                if (i11 == 3) {
                    m98233J1();
                    AtomicBoolean atomicBoolean = this.f93506B0;
                    if (atomicBoolean != null) {
                        atomicBoolean.set(true);
                    }
                    Runnable runnable = this.f93507C0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    i11 = 0;
                }
                if (i11 == 1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("glReadPixels - drawBackground: ");
                    sb2.append(i11);
                    m1973i0();
                    m98327z2();
                } else if (i11 != 4) {
                    super.mo1909R();
                }
                m98237L1(false, this.f93538f0, this.f93539g0);
                if (i11 != 2) {
                    m98235K1();
                }
                m98238M1();
                if (i11 != 0 && i11 != 1) {
                    m98327z2();
                    return;
                }
                return;
            }
            super.mo1909R();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: R0 */
    public void m98273R0(final AbstractC21351f abstractC21351f) {
        m1952U(new Runnable() { // from class: et.f
            @Override // java.lang.Runnable
            public final void run() {
                C18607n.this.m98225C1(abstractC21351f);
            }
        });
    }

    /* renamed from: R1 */
    public double[] m98274R1(int i11, boolean z11) {
        C21362q m134921f;
        if (this.f93542j0 > 0.0d && this.f93543k0 > 0.0d) {
            double[] dArr = new double[6];
            if (z11) {
                m134921f = new C21362q(this.f93551s0);
            } else {
                m134921f = AbstractC26237b.m134921f();
            }
            if (i11 > 0) {
                double d11 = i11 / this.f93541i0;
                if (d11 < 1.0d) {
                    double d12 = ((1.0d / d11) - 1.0d) / 2.0d;
                    m134921f.f104140a -= d12;
                    m134921f.f104141b -= d12;
                    m134921f.f104142c += d12;
                    m134921f.f104143d += d12;
                }
            }
            if (m134921f.m110713h() / m134921f.m110707b() > this.f93546n0) {
                double m110713h = ((m134921f.m110713h() / this.f93546n0) - m134921f.m110707b()) / 2.0d;
                m134921f.f104141b -= m110713h;
                m134921f.f104143d += m110713h;
            } else {
                double m110707b = ((m134921f.m110707b() * this.f93546n0) - m134921f.m110713h()) / 2.0d;
                m134921f.f104140a -= m110707b;
                m134921f.f104142c += m110707b;
            }
            dArr[0] = (this.f93538f0 * m134921f.m110709d()) / m134921f.m110713h();
            dArr[1] = (this.f93539g0 * m134921f.m110708c()) / m134921f.m110707b();
            dArr[2] = m134921f.f104140a;
            dArr[3] = m134921f.f104141b;
            dArr[4] = m134921f.f104142c;
            dArr[5] = m134921f.f104143d;
            return dArr;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.C0788h, ag.AbstractC0784d
    /* renamed from: S */
    public void mo1897S(boolean z11) {
        super.mo1897S(z11);
        this.f93538f0 = this.f2704t;
        this.f93539g0 = this.f2705u;
        synchronized (this.f93521P) {
            this.f93521P.notifyAll();
        }
        GLES20.glViewport(0, 0, this.f93538f0, this.f93539g0);
        Matrix.orthoM(this.f93525S, 0, 0.0f, this.f93538f0, 0.0f, this.f93539g0, 0.0f, 100.0f);
        Matrix.setLookAtM(this.f93526T, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f93527U, 0, this.f93525S, 0, this.f93526T, 0);
        a aVar = this.f93528V;
        if (aVar != null) {
            aVar.mo39770b();
        }
        AbstractC22647c abstractC22647c = this.f93530X;
        if (abstractC22647c != null) {
            abstractC22647c.mo1956Z(this.f93538f0, this.f93539g0);
        }
    }

    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public void m98225C1(AbstractC21351f abstractC21351f) {
        AbstractC22647c abstractC22647c;
        synchronized (this.f93519O) {
            try {
                if (!this.f93529W.remove(abstractC21351f) && (abstractC22647c = this.f93530X) != null) {
                    abstractC22647c.mo1907K0(abstractC21351f);
                    AbstractC22647c abstractC22647c2 = this.f93530X;
                    if (abstractC21351f != abstractC22647c2) {
                        if (abstractC22647c2.mo1893G0()) {
                        }
                    }
                    this.f93530X.destroy();
                    this.f93530X = null;
                    a aVar = this.f93528V;
                    if (aVar != null) {
                        aVar.mo39772c();
                    }
                }
                abstractC21351f.destroy();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: S1 */
    public void m98276S1(JSONObject jSONObject) {
        try {
            jSONObject.put("bw", this.f93536d0);
            jSONObject.put("bh", this.f93537e0);
            jSONObject.put("rw", this.f93542j0);
            jSONObject.put("rh", this.f93543k0);
            jSONObject.put("nw", this.f93544l0);
            jSONObject.put("nh", this.f93545m0);
            jSONObject.put("sw", this.f93538f0);
            jSONObject.put("sh", this.f93539g0);
            jSONObject.put("iw", this.f93540h0);
            jSONObject.put("ih", this.f93541i0);
            jSONObject.put("ratio", this.f93546n0);
            jSONObject.put("angle", this.f93547o0);
            jSONObject.put("crrl", this.f93551s0.f104140a);
            jSONObject.put("crrt", this.f93551s0.f104141b);
            jSONObject.put("crrr", this.f93551s0.f104142c);
            jSONObject.put("crrb", this.f93551s0.f104143d);
            jSONObject.put("crsl", this.f93552t0.f104140a);
            jSONObject.put("crst", this.f93552t0.f104141b);
            jSONObject.put("crsr", this.f93552t0.f104142c);
            jSONObject.put("crsb", this.f93552t0.f104143d);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: T1 */
    public Bitmap m98277T1() {
        if (AbstractC26237b.m134924i(this.f93551s0)) {
            return AbstractC26236a.m134912s((int) this.f93542j0, (int) this.f93543k0, this.f2704t, this.f2705u, this.f93553u0);
        }
        C21362q c21362q = new C21362q(this.f93551s0);
        m98269N0(AbstractC26237b.m134921f(), 0, 0);
        super.mo1909R();
        Bitmap m134912s = AbstractC26236a.m134912s((int) this.f93542j0, (int) this.f93543k0, this.f2704t, this.f2705u, this.f93553u0);
        m98269N0(c21362q, 0, 0);
        super.mo1909R();
        return m134912s;
    }

    /* renamed from: U1 */
    public void m98278U1() {
        m1952U(new Runnable() { // from class: et.m
            @Override // java.lang.Runnable
            public final void run() {
                C18607n.this.m98227D1();
            }
        });
    }

    /* renamed from: V0 */
    public void m98279V0(MotionEvent motionEvent) {
        try {
            if (motionEvent.getPointerCount() <= 1 && this.f93524R != null) {
                double x11 = ((motionEvent.getX() * this.f93552t0.m110713h()) / this.f93538f0) + this.f93552t0.f104140a;
                double y11 = ((motionEvent.getY() * this.f93552t0.m110707b()) / this.f93539g0) + this.f93552t0.f104141b;
                int i11 = this.f93547o0;
                if (i11 == 90) {
                    double d11 = 1.0d - y11;
                    y11 = x11;
                    x11 = d11;
                } else if (i11 == 180) {
                    x11 = 1.0d - x11;
                    y11 = 1.0d - y11;
                } else if (i11 == 270) {
                    double d12 = 1.0d - x11;
                    x11 = y11;
                    y11 = d12;
                }
                this.f93524R.m110692k0(motionEvent, (float) x11, (float) y11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: V1 */
    public void m98280V1() {
        this.f93507C0 = null;
        this.f93508D0 = 0;
        this.f93506B0 = null;
    }

    /* renamed from: X0 */
    public AbstractC21351f m98281X0(float f11, float f12, int i11) {
        AbstractC21351f mo1891E0;
        synchronized (this.f93519O) {
            try {
                if (!this.f93531Y) {
                    return null;
                }
                AbstractC22647c abstractC22647c = this.f93530X;
                if (abstractC22647c != null && (mo1891E0 = abstractC22647c.mo1891E0(f11, f12)) != null) {
                    return mo1891E0;
                }
                for (int size = this.f93529W.size() - 1; size > -1; size--) {
                    if (!(this.f93529W.get(size) instanceof C21354i) && ((AbstractC21351f) this.f93529W.get(size)).m110610j0() && ((AbstractC21351f) this.f93529W.get(size)).mo110602a0(f11, f12, 0)) {
                        return (AbstractC21351f) this.f93529W.get(size);
                    }
                }
                for (int size2 = this.f93529W.size() - 1; size2 > -1; size2--) {
                    if ((this.f93529W.get(size2) instanceof C21354i) && ((AbstractC21351f) this.f93529W.get(size2)).m110610j0() && ((AbstractC21351f) this.f93529W.get(size2)).mo110602a0(f11, f12, 0)) {
                        return (AbstractC21351f) this.f93529W.get(size2);
                    }
                }
                for (int size3 = this.f93529W.size() - 1; size3 > -1; size3--) {
                    if (!(this.f93529W.get(size3) instanceof C21354i) && ((AbstractC21351f) this.f93529W.get(size3)).m110610j0() && ((AbstractC21351f) this.f93529W.get(size3)).mo110602a0(f11, f12, i11)) {
                        return (AbstractC21351f) this.f93529W.get(size3);
                    }
                }
                for (int size4 = this.f93529W.size() - 1; size4 > -1; size4--) {
                    if ((this.f93529W.get(size4) instanceof C21354i) && ((AbstractC21351f) this.f93529W.get(size4)).m110610j0() && ((AbstractC21351f) this.f93529W.get(size4)).mo110602a0(f11, f12, i11)) {
                        return (AbstractC21351f) this.f93529W.get(size4);
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: X1 */
    public void m98282X1() {
        this.f93547o0 = 0;
        this.f93552t0.m110710e(0.0d, 0.0d, 1.0d, 1.0d);
        this.f93551s0.m110710e(0.0d, 0.0d, 1.0d, 1.0d);
    }

    /* renamed from: Y0 */
    public AbstractC21351f m98283Y0(float f11, float f12, int i11) {
        AbstractC21351f mo1891E0;
        synchronized (this.f93519O) {
            try {
                if (!this.f93531Y) {
                    return null;
                }
                AbstractC22647c abstractC22647c = this.f93530X;
                if (abstractC22647c != null && (mo1891E0 = abstractC22647c.mo1891E0(f11, f12)) != null) {
                    return mo1891E0;
                }
                List list = this.f93529W;
                if (list != null && list.size() > 0) {
                    for (int size = this.f93529W.size() - 1; size >= 0; size--) {
                        AbstractC21351f abstractC21351f = (AbstractC21351f) this.f93529W.get(size);
                        if (((abstractC21351f instanceof C21354i) || (abstractC21351f instanceof C21349d) || (abstractC21351f instanceof C21357l)) && abstractC21351f.mo110602a0(f11, f12, i11)) {
                            return abstractC21351f;
                        }
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: Y1 */
    public void m98284Y1(JSONObject jSONObject) {
        try {
            this.f93536d0 = jSONObject.optInt("bw");
            this.f93537e0 = jSONObject.optInt("bh");
            this.f93542j0 = jSONObject.optDouble("rw");
            this.f93543k0 = jSONObject.optDouble("rh");
            this.f93544l0 = jSONObject.optDouble("nw");
            this.f93545m0 = jSONObject.optDouble("nh");
            this.f93538f0 = jSONObject.optInt("sw");
            this.f93539g0 = jSONObject.optInt("sh");
            this.f93540h0 = jSONObject.optDouble("iw");
            this.f93541i0 = jSONObject.optDouble("ih");
            this.f93546n0 = jSONObject.optDouble("ratio");
            this.f93547o0 = jSONObject.optInt("angle");
            this.f93551s0.f104140a = jSONObject.optDouble("crrl");
            this.f93551s0.f104141b = jSONObject.optDouble("crrt");
            this.f93551s0.f104142c = jSONObject.optDouble("crrr");
            this.f93551s0.f104143d = jSONObject.optDouble("crrb");
            this.f93552t0.f104140a = jSONObject.optDouble("crsl");
            this.f93552t0.f104141b = jSONObject.optDouble("crst");
            this.f93552t0.f104142c = jSONObject.optDouble("crsr");
            this.f93552t0.f104143d = jSONObject.optDouble("crsb");
            this.f93549q0 = jSONObject.optBoolean("is_restoring");
            this.f93550r0 = jSONObject.optBoolean("is_landscape");
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: a2 */
    public void m98285a2(int i11) {
        double d11;
        double d12;
        double d13;
        double d14 = this.f93542j0;
        double d15 = this.f93543k0;
        this.f93542j0 = d15;
        this.f93543k0 = d14;
        double d16 = this.f93540h0;
        double d17 = this.f93541i0;
        this.f93540h0 = d17;
        double d18 = (int) d16;
        this.f93541i0 = d18;
        double d19 = ((float) d17) / d18;
        this.f93546n0 = d19;
        int i12 = this.f93538f0;
        int i13 = this.f93539g0;
        if (d19 > i12 / i13) {
            d11 = i12 / d15;
            double d21 = (i12 * d18) / d17;
            this.f93541i0 = d21;
            this.f93540h0 = i12;
            double d22 = d21 / i13;
            this.f93546n0 = d22;
            d13 = ((1.0d / d22) - 1.0d) / 2.0d;
            d12 = 0.0d;
        } else {
            d11 = i13 / d14;
            double d23 = (i13 * d17) / d18;
            this.f93540h0 = d23;
            this.f93541i0 = i13;
            double d24 = i12 / d23;
            this.f93546n0 = d24;
            d12 = (d24 - 1.0d) / 2.0d;
            d13 = 0.0d;
        }
        this.f93544l0 = this.f93540h0;
        this.f93545m0 = this.f93541i0;
        C21362q c21362q = new C21362q(0.0d - d12, 0.0d - d13, d12 + 1.0d, d13 + 1.0d);
        this.f93552t0 = c21362q;
        if (i11 > 0) {
            double d25 = i11 / this.f93541i0;
            if (d25 < 1.0d) {
                d11 *= d25;
                double d26 = ((1.0d / d25) - 1.0d) / 2.0d;
                c21362q.f104140a -= d26;
                c21362q.f104141b -= d26;
                c21362q.f104142c += d26;
                c21362q.f104143d += d26;
                this.f93544l0 *= d25;
                this.f93545m0 *= d25;
            }
        }
        if (c21362q.m110713h() / this.f93552t0.m110707b() > this.f93546n0) {
            double m110713h = ((this.f93552t0.m110713h() / this.f93546n0) - this.f93552t0.m110707b()) / 2.0d;
            C21362q c21362q2 = this.f93552t0;
            c21362q2.f104141b -= m110713h;
            c21362q2.f104143d += m110713h;
        } else {
            double m110707b = ((this.f93552t0.m110707b() * this.f93546n0) - this.f93552t0.m110713h()) / 2.0d;
            C21362q c21362q3 = this.f93552t0;
            c21362q3.f104140a -= m110707b;
            c21362q3.f104142c += m110707b;
        }
        synchronized (this.f93519O) {
            try {
                Iterator it = this.f93529W.iterator();
                while (it.hasNext()) {
                    m98251c2((AbstractC21351f) it.next(), d11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        AbstractC22647c abstractC22647c = this.f93530X;
        if (abstractC22647c != null) {
            m98252d2(abstractC22647c, d11);
        }
        this.f93542j0 = this.f93544l0;
        this.f93543k0 = this.f93545m0;
        this.f93547o0 = (this.f93547o0 + 90) % 360;
        this.f93534b0.clear();
        this.f93534b0.put(AbstractC26237b.m134923h(this.f93552t0, this.f93547o0)).position(0);
        a aVar = this.f93528V;
        if (aVar != null) {
            aVar.mo39768a();
        }
    }

    /* renamed from: b1 */
    public InterfaceC27243b m98286b1() {
        if (m1976l0() != null) {
            return m1976l0().mo147191h0();
        }
        return null;
    }

    /* renamed from: c1 */
    public ColorFilterConfig m98287c1() {
        if (m1976l0() != null) {
            return m1976l0().mo147192i0();
        }
        return null;
    }

    /* renamed from: d1 */
    public C21362q m98288d1() {
        return this.f93551s0;
    }

    /* renamed from: f1 */
    public String m98289f1() {
        String jSONArray;
        synchronized (this.f93519O) {
            JSONArray jSONArray2 = new JSONArray();
            for (AbstractC21351f abstractC21351f : this.f93529W) {
                try {
                    if (abstractC21351f.m110609i0() && !(abstractC21351f instanceof AbstractC22646b)) {
                        jSONArray2.put(abstractC21351f.mo110584d0());
                    }
                } catch (JSONException e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
            jSONArray = jSONArray2.toString();
        }
        return jSONArray;
    }

    /* renamed from: f2 */
    public void m98290f2(int i11) {
        if (this.f93542j0 > 0.0d && this.f93543k0 > 0.0d) {
            C21362q m134921f = AbstractC26237b.m134921f();
            if (i11 > 0) {
                double d11 = i11 / this.f93541i0;
                if (d11 < 1.0d) {
                    double d12 = ((1.0d / d11) - 1.0d) / 2.0d;
                    m134921f.f104140a -= d12;
                    m134921f.f104141b -= d12;
                    m134921f.f104142c += d12;
                    m134921f.f104143d += d12;
                }
            }
            m98269N0(m134921f, 0, 0);
            this.f93544l0 = this.f93542j0;
            this.f93545m0 = this.f93543k0;
            a aVar = this.f93528V;
            if (aVar != null) {
                aVar.mo39768a();
            }
        }
    }

    /* renamed from: g1 */
    public C21358m m98291g1() {
        return this.f93524R;
    }

    /* renamed from: g2 */
    public void m98292g2(final C21358m c21358m) {
        m1952U(new Runnable() { // from class: et.g
            @Override // java.lang.Runnable
            public final void run() {
                C18607n.this.m98229E1(c21358m);
            }
        });
    }

    /* renamed from: h1 */
    public int m98293h1() {
        return this.f93539g0;
    }

    /* renamed from: h2 */
    public void m98294h2(boolean z11) {
        this.f93520O0 = z11;
    }

    /* renamed from: i1 */
    public int m98295i1() {
        return this.f93538f0;
    }

    /* renamed from: i2 */
    public void m98296i2(AtomicBoolean atomicBoolean, int i11, Runnable runnable) {
        this.f93507C0 = runnable;
        this.f93508D0 = i11;
        this.f93506B0 = atomicBoolean;
    }

    /* renamed from: j1 */
    public int m98297j1() {
        return (int) (this.f93545m0 + 0.5d);
    }

    /* renamed from: j2 */
    public void m98298j2(boolean z11) {
        this.f93510F0 = z11;
    }

    /* renamed from: k1 */
    public int m98299k1() {
        return (int) (this.f93544l0 + 0.5d);
    }

    /* renamed from: k2 */
    public void m98300k2(boolean z11) {
        this.f93509E0 = z11;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setEnableDrawing:");
        sb2.append(z11);
    }

    /* renamed from: l1 */
    public JSONArray m98301l1() {
        JSONArray jSONArray;
        C21362q c21362q = new C21362q(f93504Q0);
        if (c21362q.m110713h() / c21362q.m110707b() > this.f93546n0) {
            double m110713h = ((c21362q.m110713h() / this.f93546n0) - c21362q.m110707b()) / 2.0d;
            c21362q.f104141b -= m110713h;
            c21362q.f104143d += m110713h;
        } else {
            double m110707b = ((c21362q.m110707b() * this.f93546n0) - c21362q.m110713h()) / 2.0d;
            c21362q.f104140a -= m110707b;
            c21362q.f104142c += m110707b;
        }
        double m110707b2 = ((1.0d / c21362q.m110707b()) * this.f93539g0) / this.f93543k0;
        synchronized (this.f93519O) {
            jSONArray = new JSONArray();
            for (AbstractC21351f abstractC21351f : this.f93529W) {
                try {
                    if (!(abstractC21351f instanceof AbstractC22646b)) {
                        jSONArray.put(m98248Z1(abstractC21351f, c21362q, m110707b2));
                    }
                } catch (JSONException e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: l2 */
    public void m98302l2() {
        this.f93511G0 = true;
        this.f93549q0 = false;
    }

    /* renamed from: m1 */
    public ByteBuffer m98303m1() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("glReadPixels - getOutBuffer: ");
        sb2.append(this.f93508D0);
        return this.f93505A0;
    }

    /* renamed from: m2 */
    public void m98304m2(C21357l c21357l) {
        this.f93518N0 = c21357l;
    }

    /* renamed from: n2 */
    public void m98305n2(int i11, int i12) {
        C21358m c21358m = this.f93524R;
        if (c21358m != null) {
            c21358m.m110690g0(i11, i12);
        }
    }

    /* renamed from: o1 */
    public C21362q m98306o1() {
        return this.f93552t0;
    }

    /* renamed from: o2 */
    public void m98307o2(a aVar) {
        this.f93528V = aVar;
    }

    /* renamed from: p1 */
    public int m98308p1() {
        return this.f93547o0;
    }

    /* renamed from: p2 */
    public void m98309p2(final AbstractC22647c abstractC22647c) {
        final AbstractC22647c abstractC22647c2 = this.f93530X;
        if (abstractC22647c2 != null) {
            Objects.requireNonNull(abstractC22647c2);
            m1952U(new Runnable() { // from class: et.j
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC22647c.this.destroy();
                }
            });
        }
        this.f93530X = abstractC22647c;
        if (abstractC22647c != null) {
            m1952U(new Runnable() { // from class: et.k
                @Override // java.lang.Runnable
                public final void run() {
                    C18607n.this.m98230F1(abstractC22647c);
                }
            });
        }
    }

    /* renamed from: q1 */
    public void m98310q1() {
        if (!this.f93510F0 || !m98316t1() || !(m1975k0() instanceof C29617j) || this.f93513I0.equals(this.f93512H0)) {
            return;
        }
        m98258y2(this.f93512H0);
        m98246W1();
    }

    /* renamed from: q2 */
    public void m98311q2(boolean z11) {
        this.f93549q0 = z11;
    }

    /* renamed from: r1 */
    public void m98312r1() {
        if (this.f93510F0 && (m1975k0() instanceof C29617j)) {
            String m98253e1 = m98253e1();
            if (this.f93513I0.equals(m98253e1)) {
                return;
            }
            m98258y2(m98253e1);
            if (m98316t1()) {
                m98246W1();
            }
        }
    }

    /* renamed from: r2 */
    public void m98313r2(boolean z11) {
        this.f93522P0 = z11;
    }

    /* renamed from: s1 */
    public boolean m98314s1() {
        if (m1976l0() != null && m1976l0().mo147193j0()) {
            return true;
        }
        return false;
    }

    /* renamed from: s2 */
    public void m98315s2(int i11) {
        this.f93558z0 = i11;
    }

    /* renamed from: t1 */
    public boolean m98316t1() {
        C21358m c21358m = this.f93524R;
        if (c21358m != null && c21358m.m110688e0()) {
            return true;
        }
        return false;
    }

    /* renamed from: t2 */
    public void m98317t2(int i11, int i12) {
        double d11 = i11;
        this.f93540h0 = d11;
        this.f93542j0 = d11;
        double d12 = i12;
        this.f93541i0 = d12;
        this.f93543k0 = d12;
        this.f93546n0 = 1.0d;
    }

    /* renamed from: u1 */
    public boolean m98318u1() {
        synchronized (this.f93519O) {
            try {
                Iterator it = this.f93529W.iterator();
                while (it.hasNext()) {
                    if (((AbstractC21351f) it.next()) instanceof C21349d) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: u2 */
    public void m98319u2(AbstractC21351f abstractC21351f) {
        synchronized (this.f93519O) {
            if (abstractC21351f != null) {
                try {
                    this.f93529W.remove(abstractC21351f);
                    this.f93529W.add(abstractC21351f);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: v1 */
    public boolean m98320v1() {
        synchronized (this.f93519O) {
            try {
                Iterator it = this.f93529W.iterator();
                while (it.hasNext()) {
                    if (((AbstractC21351f) it.next()) instanceof C21354i) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: v2 */
    public void m98321v2() {
        if (this.f93510F0 && (m1975k0() instanceof C29617j)) {
            if (m98314s1()) {
                m98258y2(m98253e1());
            } else {
                m98258y2(this.f93512H0);
            }
        }
    }

    /* renamed from: w1 */
    public boolean m98322w1() {
        synchronized (this.f93519O) {
            try {
                Iterator it = this.f93529W.iterator();
                while (it.hasNext()) {
                    if (((AbstractC21351f) it.next()) instanceof C21357l) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: w2 */
    public void m98323w2(final Bitmap bitmap, final String str, final C29617j.a aVar) {
        if (bitmap == null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: et.h
            @Override // java.lang.Runnable
            public final void run() {
                C18607n.this.m98231G1(str, bitmap, aVar);
            }
        };
        if (m1992u()) {
            runnable.run();
        } else {
            m1952U(runnable);
        }
    }

    /* renamed from: x1 */
    public void m98324x1() {
        this.f93531Y = false;
    }

    /* renamed from: x2 */
    public void m98325x2() {
        this.f93531Y = true;
    }

    /* renamed from: z1 */
    public boolean m98326z1() {
        double d11 = this.f93544l0;
        if (d11 == 0.0d) {
            return false;
        }
        double d12 = this.f93545m0;
        if (d12 == 0.0d || d12 / d11 >= m98255n1()) {
            return false;
        }
        return true;
    }

    /* renamed from: z2 */
    void m98327z2() {
        ByteBuffer byteBuffer = this.f93505A0;
        if (byteBuffer == null || byteBuffer.capacity() < this.f93538f0 * this.f93539g0 * 4) {
            this.f93505A0 = ByteBuffer.allocateDirect(this.f93538f0 * this.f93539g0 * 4);
        }
        this.f93505A0.rewind();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("glReadPixels: ");
        sb2.append(this.f93508D0);
        GLES20.glReadPixels(0, 0, this.f93538f0, this.f93539g0, 6408, 5121, this.f93505A0);
        AtomicBoolean atomicBoolean = this.f93506B0;
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
        }
        Runnable runnable = this.f93507C0;
        if (runnable != null) {
            runnable.run();
        }
    }
}
