package com.zing.zalo.cameradecor.view;

import ag.C0788h;
import ag.C0790j;
import ag.InterfaceC0796p;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.graphics.Rect;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.zing.zalo.C8937j0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.cameradecor.filter.ColorFilterConfig;
import com.zing.zalo.cameradecor.view.ImageDecorView;
import com.zing.zalo.zmedia.view.AbstractC17358g;
import et.C18607n;
import ho0.AbstractC20110a;
import im.C20611b;
import im.C20612c;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import lt.AbstractC22646b;
import lt.AbstractC22647c;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import p239ih.C20556f;
import p276jt.AbstractC21351f;
import p276jt.C21349d;
import p276jt.C21354i;
import p276jt.C21357l;
import p276jt.InterfaceC21359n;
import p460qt.C25491a;
import p471r3.C25630b;
import p493rt.C25977a;
import p575vf.C28000c;
import p643xf.C29611d;
import p643xf.C29617j;
import p643xf.C29618k;
import p679yf.C30922b;
import p679yf.C30923c;
import p679yf.InterfaceC30926f;
import p714zf.AbstractC31817h;
import p714zf.C31811b;
import p714zf.InterfaceC31818i;
import se0.AbstractC26236a;
import tf.C26646a;
import th.AbstractC26689j;
import xh0.InterfaceC29634a;
import xh0.InterfaceC29636b;
import xh0.InterfaceC29653k;

/* loaded from: classes3.dex */
public class ImageDecorView extends EGLSharedSurfaceView implements C18607n.a, InterfaceC0796p, C0788h.a {

    /* renamed from: A0 */
    private InterfaceC7828c f41909A0;

    /* renamed from: B0 */
    private InterfaceC7827b f41910B0;

    /* renamed from: C0 */
    private final C21357l.a f41911C0;

    /* renamed from: D0 */
    Runnable f41912D0;

    /* renamed from: E0 */
    Runnable f41913E0;

    /* renamed from: F */
    private EGLContext f41914F;

    /* renamed from: F0 */
    Handler f41915F0;

    /* renamed from: G */
    private float f41916G;

    /* renamed from: G0 */
    RunnableC7829d f41917G0;

    /* renamed from: H */
    private float f41918H;

    /* renamed from: H0 */
    boolean f41919H0;

    /* renamed from: I */
    private int f41920I;

    /* renamed from: I0 */
    int f41921I0;

    /* renamed from: J */
    private float f41922J;

    /* renamed from: K */
    private float f41923K;

    /* renamed from: L */
    private float f41924L;

    /* renamed from: M */
    private float f41925M;

    /* renamed from: N */
    private int f41926N;

    /* renamed from: O */
    private int f41927O;

    /* renamed from: P */
    private C0790j f41928P;

    /* renamed from: Q */
    private final C18607n f41929Q;

    /* renamed from: R */
    private Bitmap f41930R;

    /* renamed from: S */
    private boolean f41931S;

    /* renamed from: T */
    private boolean f41932T;

    /* renamed from: U */
    private boolean f41933U;

    /* renamed from: V */
    private final PointF f41934V;

    /* renamed from: W */
    private final PointF f41935W;

    /* renamed from: a0 */
    private final PointF f41936a0;

    /* renamed from: b0 */
    private AbstractC21351f f41937b0;

    /* renamed from: c0 */
    private boolean f41938c0;

    /* renamed from: d0 */
    private boolean f41939d0;

    /* renamed from: e0 */
    private boolean f41940e0;

    /* renamed from: f0 */
    private float f41941f0;

    /* renamed from: g0 */
    private float f41942g0;

    /* renamed from: h0 */
    private int f41943h0;

    /* renamed from: i0 */
    private float f41944i0;

    /* renamed from: j0 */
    private float f41945j0;

    /* renamed from: k0 */
    private float f41946k0;

    /* renamed from: l0 */
    private float f41947l0;

    /* renamed from: m0 */
    float f41948m0;

    /* renamed from: n0 */
    float f41949n0;

    /* renamed from: o0 */
    float f41950o0;

    /* renamed from: p0 */
    private boolean f41951p0;

    /* renamed from: q0 */
    private long f41952q0;

    /* renamed from: r0 */
    private long f41953r0;

    /* renamed from: s0 */
    private double f41954s0;

    /* renamed from: t0 */
    private double f41955t0;

    /* renamed from: u0 */
    private final Rect f41956u0;

    /* renamed from: v0 */
    private Rect f41957v0;

    /* renamed from: w0 */
    private AbstractC31817h f41958w0;

    /* renamed from: x0 */
    private AbstractC31817h.b f41959x0;

    /* renamed from: y0 */
    private InterfaceC29634a f41960y0;

    /* renamed from: z0 */
    private InterfaceC7826a f41961z0;

    /* renamed from: com.zing.zalo.cameradecor.view.ImageDecorView$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC7826a {
        /* renamed from: a */
        void mo39114a();

        /* renamed from: b */
        void mo39115b();

        /* renamed from: c */
        void mo39116c();

        /* renamed from: d */
        void mo39117d(float f11, boolean z11);

        void onConfigurationChanged(Configuration configuration);
    }

    /* renamed from: com.zing.zalo.cameradecor.view.ImageDecorView$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC7827b {
        /* renamed from: a */
        void mo39793a();
    }

    /* renamed from: com.zing.zalo.cameradecor.view.ImageDecorView$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC7828c {
        /* renamed from: c */
        void mo39102c();

        /* renamed from: d */
        void mo39103d(AbstractC21351f abstractC21351f);

        /* renamed from: e */
        void mo39104e(boolean z11);

        /* renamed from: f */
        void mo39105f(AbstractC21351f abstractC21351f);

        /* renamed from: g */
        void mo39106g(boolean z11);

        /* renamed from: h */
        void mo39107h(AbstractC21351f abstractC21351f);

        /* renamed from: i */
        void mo39108i();

        /* renamed from: j */
        void mo39109j(boolean z11);

        /* renamed from: k */
        void mo39110k(AbstractC21351f abstractC21351f);

        /* renamed from: l */
        void mo39111l(MotionEvent motionEvent);
    }

    /* renamed from: com.zing.zalo.cameradecor.view.ImageDecorView$d */
    /* loaded from: classes3.dex */
    class RunnableC7829d implements Runnable {

        /* renamed from: p */
        AbstractC21351f f41962p;

        RunnableC7829d() {
        }

        /* renamed from: a */
        public void m39794a(AbstractC21351f abstractC21351f) {
            this.f41962p = abstractC21351f;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC21351f abstractC21351f = this.f41962p;
            if (abstractC21351f != null) {
                ImageDecorView.this.setToFront(abstractC21351f);
            }
        }
    }

    public ImageDecorView(Context context) {
        this(context, null);
    }

    /* renamed from: Z */
    private float m39740Z(float f11) {
        View rootView;
        if (m39774d0() && (rootView = getRootView()) != null) {
            return f11 + ((rootView.getHeight() - getNewHeight()) / 2.0f);
        }
        return f11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ void m39741e0(AtomicBoolean atomicBoolean) {
        synchronized (atomicBoolean) {
            atomicBoolean.notify();
            this.f41929Q.m98280V1();
            this.f41929Q.onDrawFrame(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public /* synthetic */ void m39742f0(C20556f c20556f, Bitmap bitmap, C29617j.a aVar) {
        m39786t0(bitmap, c20556f.m106842o(), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public /* synthetic */ void m39743g0(int i11, InterfaceC29636b interfaceC29636b, InterfaceC29653k.a aVar, SensitiveData sensitiveData) {
        C29611d c29611d = new C29611d(getContext(), i11, m39731w(), interfaceC29636b, aVar, this, sensitiveData);
        c29611d.m1954X(this.f41929Q.m1950N());
        this.f41929Q.m1984v0(c29611d);
        this.f41929Q.m98265H1(getWidth(), getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public /* synthetic */ void m39744h0(String str, C30923c c30923c, InterfaceC30926f interfaceC30926f, C30922b.c cVar) {
        C29618k c29618k = new C29618k(getContext(), str, c30923c, interfaceC30926f, cVar, this);
        c29618k.m1954X(this.f41929Q.m1950N());
        this.f41929Q.m1984v0(c29618k);
        this.f41929Q.m98305n2(this.f41926N, this.f41927O);
    }

    @Override // com.zing.zalo.cameradecor.view.EGLSharedSurfaceView
    /* renamed from: A */
    public void mo39729A() {
        super.mo39729A();
        this.f41929Q.m1994w();
    }

    /* renamed from: A0 */
    public C25977a m39745A0(String str, int i11, SensitiveData sensitiveData) {
        C25977a m39767Y = m39767Y(i11);
        if (!this.f41919H0) {
            try {
                if (this.f41958w0 == null) {
                    m39757O(str, 0L, this.f41959x0, m39767Y, this.f41929Q);
                }
                C8937j0.m47660i().m49661d(sensitiveData);
                this.f41958w0.m152858m();
                this.f41919H0 = true;
            } catch (Exception e11) {
                e11.printStackTrace();
                AbstractC31817h.b bVar = this.f41959x0;
                if (bVar != null) {
                    bVar.mo38629a(null);
                }
            }
        }
        return m39767Y;
    }

    /* renamed from: B0 */
    public void m39746B0() {
        try {
            if (this.f41919H0 && this.f41958w0 != null) {
                C8937j0.m47660i().m49660b();
                this.f41958w0.m152859n();
                this.f41919H0 = false;
                this.f41958w0 = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: C0 */
    public void m39747C0(C20612c c20612c, boolean z11) {
        if (!z11) {
            try {
                if (this.f41960y0 != null) {
                    C20611b c20611b = new C20611b();
                    c20611b.m107258d(this.f41960y0.mo147377h());
                    int mo147385p = this.f41960y0.mo147385p();
                    if (mo147385p == 2) {
                        c20611b.m107257c(1);
                    } else if (mo147385p == 1) {
                        c20611b.m107257c(2);
                    } else {
                        c20611b.m107257c(0);
                    }
                    c20612c.m107301y(c20611b);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: F */
    public void m39748F(AbstractC21351f abstractC21351f) {
        if (abstractC21351f instanceof C21357l) {
            this.f41929Q.m98266I0((C21357l) abstractC21351f, getContext());
        } else if (abstractC21351f instanceof AbstractC22646b) {
            this.f41929Q.m98263G0((AbstractC22646b) abstractC21351f);
        } else if (abstractC21351f instanceof C21349d) {
            this.f41929Q.m98262F0((C21349d) abstractC21351f);
        } else {
            this.f41929Q.m98264H0(abstractC21351f);
        }
        mo39680s();
    }

    /* renamed from: G */
    public void m39749G(C25630b c25630b, Bitmap bitmap, String str, int i11, int i12) {
        if (bitmap == null) {
            return;
        }
        m39748F(new C21354i(c25630b.m132429g(), c25630b.m132427f(), (int) (((((c25630b.m132437o() * 1.0f) / i11) - 0.5f) * getNewWidth()) + (getWidth() >> 1)), (int) ((getHeight() >> 1) - ((((c25630b.m132438p() * 1.0f) / i12) - 0.5f) * getNewHeight())), Math.min(getNewWidth(), getNewHeight()) / (bitmap.getWidth() * 4.0f), bitmap, str));
    }

    /* renamed from: H */
    public void m39750H(AbstractC21351f abstractC21351f) {
        this.f41929Q.m98267J0(abstractC21351f);
        mo39680s();
    }

    /* renamed from: I */
    void m39751I(PointF pointF, MotionEvent motionEvent) {
        pointF.x = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
        pointF.y = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
    }

    /* renamed from: J */
    float m39752J(MotionEvent motionEvent) {
        return (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
    }

    /* renamed from: K */
    float m39753K(MotionEvent motionEvent) {
        return (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
    }

    /* renamed from: L */
    public void m39754L(AbstractC21351f abstractC21351f) {
        this.f41956u0.set(0, 0, getNewWidth(), getNewHeight());
        this.f41956u0.offset((getWidth() - getNewWidth()) / 2, (getHeight() - getNewHeight()) / 2);
        float m110606f0 = abstractC21351f.m110606f0();
        float m110607g0 = abstractC21351f.m110607g0();
        int i11 = this.f41956u0.left;
        if (m110606f0 < i11) {
            abstractC21351f.mo110614r0(i11);
        }
        int i12 = this.f41956u0.right;
        if (m110606f0 > i12) {
            abstractC21351f.mo110614r0(i12);
        }
        int i13 = this.f41956u0.top;
        if (m110607g0 < i13) {
            abstractC21351f.m110615s0(i13);
        }
        int i14 = this.f41956u0.bottom;
        if (m110607g0 > i14) {
            abstractC21351f.m110615s0(i14);
        }
    }

    /* renamed from: M */
    public void m39755M() {
        this.f41931S = false;
    }

    /* renamed from: N */
    public void m39756N() {
        this.f41933U = false;
    }

    /* renamed from: O */
    public void m39757O(String str, long j11, AbstractC31817h.b bVar, C25977a c25977a, InterfaceC31818i interfaceC31818i) {
        AbstractC31817h abstractC31817h = this.f41958w0;
        if (abstractC31817h != null) {
            abstractC31817h.m152859n();
        } else {
            this.f41958w0 = new C31811b(str, j11, bVar, interfaceC31818i, this.f41914F, c25977a, this.f41954s0, this.f41955t0);
        }
    }

    /* renamed from: P */
    public void m39758P() {
        this.f41929Q.m98272Q0();
    }

    /* renamed from: Q */
    public void m39759Q() {
        try {
            Bitmap bitmap = this.f41930R;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f41930R = null;
            mo39680s();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: R */
    public void m39760R(AbstractC21351f abstractC21351f) {
        this.f41929Q.m98273R0(abstractC21351f);
    }

    /* renamed from: S */
    public void m39761S(AbstractC21351f abstractC21351f) {
        this.f41929Q.m98225C1(abstractC21351f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: T */
    public void m39762T(float f11, float f12) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        AbstractC21351f abstractC21351f = this.f41937b0;
        if (!(abstractC21351f instanceof C21357l)) {
            return;
        }
        C21357l c21357l = (C21357l) abstractC21351f;
        float[] m110652C0 = c21357l.m110652C0();
        float m110606f0 = c21357l.m110606f0() - m110652C0[0];
        float m110606f02 = c21357l.m110606f0() + m110652C0[1];
        float m110607g0 = c21357l.m110607g0() + m110652C0[2];
        float m110607g02 = c21357l.m110607g0() - m110652C0[3];
        float f13 = (this.f41934V.x + f11) - this.f41949n0;
        if (Math.abs(f13) > 8.0f) {
            if (!c21357l.m110657H0() && !c21357l.m110658I0() && !c21357l.m110660K0()) {
                c21357l.mo110614r0(((int) this.f41936a0.x) + f11);
            } else {
                c21357l.mo110614r0(((int) c21357l.m110606f0()) + f13);
                this.f41936a0.x = c21357l.m110606f0();
                this.f41934V.x += f11;
            }
            c21357l.m110667T0(false);
            c21357l.m110668U0(false);
            c21357l.m110670W0(false);
        } else {
            float f14 = this.f41922J;
            float f15 = this.f41916G;
            int i11 = this.f41920I;
            if (m110606f0 >= (f14 + f15) - i11 && m110606f0 <= f14 + f15 + i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            float f16 = this.f41923K;
            if (m110606f02 >= (f16 - f15) - i11 && m110606f02 <= (f16 - f15) + i11) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.f41936a0.x + f11 >= (getWidth() / 2.0f) - this.f41920I && this.f41936a0.x + f11 <= (getWidth() / 2.0f) + this.f41920I) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c21357l.m110606f0() >= (getWidth() / 2.0f) - this.f41920I && c21357l.m110606f0() <= (getWidth() / 2.0f) + this.f41920I) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z11 && !z12 && !z14) {
                if (z13) {
                    c21357l.mo110614r0(getWidth() / 2.0f);
                } else {
                    c21357l.mo110614r0(this.f41936a0.x + f11);
                }
                c21357l.m110667T0(false);
                c21357l.m110668U0(false);
                c21357l.m110670W0(false);
            } else if (!c21357l.m110660K0() && !c21357l.m110657H0() && !c21357l.m110658I0()) {
                InterfaceC7828c interfaceC7828c = this.f41909A0;
                if (interfaceC7828c != null) {
                    interfaceC7828c.mo39108i();
                }
                if (z14) {
                    c21357l.m110670W0(true);
                } else if (z11) {
                    c21357l.m110667T0(true);
                } else {
                    c21357l.m110668U0(true);
                }
            }
        }
        float f17 = (this.f41934V.y + f12) - this.f41950o0;
        if (Math.abs(f17) > 8.0f) {
            if (!c21357l.m110656G0() && !c21357l.m110659J0() && !c21357l.m110655F0()) {
                c21357l.m110615s0(this.f41936a0.y - f12);
                if (c21357l instanceof InterfaceC21359n) {
                    ((InterfaceC21359n) c21357l).mo97620d(this.f41936a0.y - f12);
                }
            } else {
                c21357l.m110615s0(c21357l.m110607g0() - f17);
                if (c21357l instanceof InterfaceC21359n) {
                    ((InterfaceC21359n) c21357l).mo97620d(c21357l.m110607g0() - f17);
                }
                this.f41936a0.y = c21357l.m110607g0();
                this.f41934V.y += f12;
            }
            c21357l.m110666S0(false);
            c21357l.m110669V0(false);
            c21357l.m110665R0(false);
            return;
        }
        float f18 = this.f41925M;
        float f19 = this.f41918H;
        int i12 = this.f41920I;
        if (m110607g0 >= (f18 - f19) - i12 && m110607g0 <= (f18 - f19) + i12) {
            z15 = true;
        } else {
            z15 = false;
        }
        float f21 = this.f41924L;
        if (m110607g02 >= (f21 + f19) - i12 && m110607g02 <= f21 + f19 + i12) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (this.f41936a0.y - f12 >= (getHeight() / 2.0f) - this.f41920I && this.f41936a0.y - f12 <= (getHeight() / 2.0f) + this.f41920I) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (c21357l.m110607g0() >= (getHeight() / 2.0f) - this.f41920I && c21357l.m110607g0() <= (getHeight() / 2.0f) + this.f41920I) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (!z15 && !z16 && !z18) {
            if (z17) {
                c21357l.m110615s0(getHeight() / 2.0f);
                if (c21357l instanceof InterfaceC21359n) {
                    ((InterfaceC21359n) c21357l).mo97620d(getHeight() / 2.0f);
                }
            } else {
                c21357l.m110615s0(this.f41936a0.y - f12);
                if (c21357l instanceof InterfaceC21359n) {
                    ((InterfaceC21359n) c21357l).mo97620d(this.f41936a0.y - f12);
                }
            }
            c21357l.m110666S0(false);
            c21357l.m110669V0(false);
            c21357l.m110665R0(false);
            return;
        }
        if (!c21357l.m110656G0() && !c21357l.m110659J0() && !c21357l.m110655F0()) {
            InterfaceC7828c interfaceC7828c2 = this.f41909A0;
            if (interfaceC7828c2 != null) {
                interfaceC7828c2.mo39108i();
            }
            if (z18) {
                c21357l.m110666S0(true);
            } else if (z15) {
                c21357l.m110669V0(true);
            } else {
                c21357l.m110665R0(true);
            }
        }
    }

    /* renamed from: U */
    AbstractC21351f m39763U(float f11, float f12) {
        return this.f41929Q.m98281X0(f11, f12, getWidth() / 14);
    }

    /* renamed from: V */
    AbstractC21351f m39764V(float f11, float f12) {
        return this.f41929Q.m98283Y0(f11, f12, getWidth() / 14);
    }

    /* renamed from: W */
    public Bitmap m39765W(boolean z11) {
        Bitmap bitmap;
        if (z11) {
            bitmap = getCurrentLoadedImage();
        } else {
            bitmap = null;
        }
        return m39766X(1, bitmap);
    }

    /* renamed from: X */
    public Bitmap m39766X(int i11, Bitmap bitmap) {
        try {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.f41929Q.m98296i2(atomicBoolean, i11, new Runnable() { // from class: dg.d
                @Override // java.lang.Runnable
                public final void run() {
                    ImageDecorView.this.m39741e0(atomicBoolean);
                }
            });
            mo39680s();
            try {
                try {
                    synchronized (atomicBoolean) {
                        try {
                            if (!atomicBoolean.get()) {
                                atomicBoolean.wait(2000L);
                            }
                        } finally {
                        }
                    }
                    this.f41929Q.m98280V1();
                } catch (InterruptedException e11) {
                    e11.printStackTrace();
                    this.f41929Q.m98280V1();
                }
                mo39680s();
                int m1949M = this.f41929Q.m1949M();
                int m1948L = this.f41929Q.m1948L();
                int m98299k1 = this.f41929Q.m98299k1();
                int m98297j1 = this.f41929Q.m98297j1();
                ByteBuffer m98303m1 = this.f41929Q.m98303m1();
                if (m98303m1 == null) {
                    return null;
                }
                if (bitmap != null) {
                    if (bitmap.isMutable()) {
                        if (bitmap.getWidth() == m1949M) {
                            if (bitmap.getHeight() != m1948L) {
                            }
                            Bitmap m134910q = AbstractC26236a.m134910q(bitmap, m98303m1, m98299k1, m98297j1, m1949M, m1948L, false);
                            m98303m1.rewind();
                            return m134910q;
                        }
                    }
                }
                bitmap = Bitmap.createBitmap(m98299k1, m98297j1, Bitmap.Config.ARGB_8888);
                Bitmap m134910q2 = AbstractC26236a.m134910q(bitmap, m98303m1, m98299k1, m98297j1, m1949M, m1948L, false);
                m98303m1.rewind();
                return m134910q2;
            } catch (Throwable th2) {
                this.f41929Q.m98280V1();
                mo39680s();
                throw th2;
            }
        } catch (Exception | OutOfMemoryError e12) {
            AbstractC23350e.m122776f("EditorDecorView", e12);
            AbstractC20110a.m104538g("%s#getBitmap(). %s", "EditorDecorView", e12);
            return null;
        }
    }

    /* renamed from: Y */
    public C25977a m39767Y(int i11) {
        return C25977a.m133806c(this.f41926N, this.f41927O, AbstractC26689j.m137077D(i11), AbstractC26689j.m137106o(i11).m40328a());
    }

    @Override // et.C18607n.a
    /* renamed from: a */
    public void mo39768a() {
        InterfaceC7826a interfaceC7826a = this.f41961z0;
        if (interfaceC7826a != null) {
            interfaceC7826a.mo39114a();
        }
    }

    /* renamed from: a0 */
    public boolean m39769a0() {
        return this.f41929Q.m98314s1();
    }

    @Override // et.C18607n.a
    /* renamed from: b */
    public void mo39770b() {
        InterfaceC7826a interfaceC7826a = this.f41961z0;
        if (interfaceC7826a != null) {
            interfaceC7826a.mo39115b();
        }
    }

    /* renamed from: b0 */
    public void m39771b0() {
        this.f41929Q.m98324x1();
    }

    @Override // et.C18607n.a
    /* renamed from: c */
    public void mo39772c() {
        InterfaceC7828c interfaceC7828c = this.f41909A0;
        if (interfaceC7828c != null) {
            interfaceC7828c.mo39102c();
        }
    }

    /* renamed from: c0 */
    public boolean m39773c0() {
        return this.f41929Q.m98326z1();
    }

    @Override // ag.C0788h.a
    /* renamed from: d */
    public void mo1986d() {
        this.f41929Q.m98310q1();
    }

    /* renamed from: d0 */
    public boolean m39774d0() {
        return this.f41929Q.m1980p0();
    }

    @Override // ag.InterfaceC0795o
    /* renamed from: f */
    public void mo2009f(int i11) {
        if (i11 == 0) {
            setRenderMode(0);
        } else {
            setRenderMode(1);
        }
    }

    @Override // ag.C0788h.a
    /* renamed from: g */
    public void mo1987g() {
        this.f41929Q.m98312r1();
    }

    public ColorFilterConfig getColorFilterConfig() {
        return this.f41929Q.m98287c1();
    }

    public Bitmap getCurrentLoadedImage() {
        return this.f41930R;
    }

    public String getDecorObjectDataToSave() {
        return this.f41929Q.m98289f1();
    }

    public Bitmap getDecorOnlyBitmap() {
        return m39766X(4, null);
    }

    public InterfaceC7826a getEventListener() {
        return this.f41961z0;
    }

    public int getNewHeight() {
        return this.f41929Q.m98297j1();
    }

    public int getNewWidth() {
        return this.f41929Q.m98299k1();
    }

    public C18607n getRender() {
        return this.f41929Q;
    }

    public Bitmap getScreenBitmap() {
        return m39766X(2, null);
    }

    @Override // ag.InterfaceC0796p
    /* renamed from: h */
    public void mo2010h() {
        this.f41914F = EGL14.eglGetCurrentContext();
    }

    @Override // ag.InterfaceC0796p
    /* renamed from: i */
    public void mo2011i(int i11, int i12) {
        this.f41926N = i11;
        this.f41927O = i12;
        Runnable runnable = this.f41912D0;
        if (runnable != null) {
            m39679r(runnable);
            this.f41912D0 = null;
        }
        Runnable runnable2 = this.f41913E0;
        if (runnable2 != null) {
            m39679r(runnable2);
            this.f41913E0 = null;
        }
        C0790j c0790j = this.f41928P;
        if (c0790j != null) {
            c0790j.m1990b(i11, i12);
        }
    }

    /* renamed from: i0 */
    void m39775i0(float f11, float f12) {
        if (Math.abs(f11) > 30.0f || Math.abs(f12) > 30.0f) {
            this.f41938c0 = false;
        }
        AbstractC21351f abstractC21351f = this.f41937b0;
        if ((abstractC21351f instanceof C21357l) && this.f41943h0 == 200 && !((C21357l) abstractC21351f).f104092r0) {
            m39762T(f11, f12);
        } else {
            abstractC21351f.mo110614r0((int) (this.f41936a0.x + f11));
            this.f41937b0.m110615s0((int) (this.f41936a0.y - f12));
            Object obj = this.f41937b0;
            if (obj instanceof InterfaceC21359n) {
                ((InterfaceC21359n) obj).mo97620d((int) (this.f41936a0.y - f12));
            }
        }
        mo39680s();
    }

    /* renamed from: j0 */
    public void m39776j0() {
        this.f41931S = true;
    }

    /* renamed from: k0 */
    public void m39777k0() {
        this.f41933U = true;
    }

    /* renamed from: l0 */
    public void m39778l0() {
        final C18607n c18607n = this.f41929Q;
        Objects.requireNonNull(c18607n);
        m39679r(new Runnable() { // from class: dg.h
            @Override // java.lang.Runnable
            public final void run() {
                C18607n.this.m1982t0();
            }
        });
    }

    /* renamed from: m0 */
    public void m39779m0() {
        try {
            m39755M();
            this.f41929Q.m98282X1();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: n0 */
    public void m39780n0() {
        try {
            AbstractC31817h abstractC31817h = this.f41958w0;
            if (abstractC31817h != null) {
                abstractC31817h.m152857l();
                this.f41958w0 = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: o0 */
    public void m39781o0(String str) {
        JSONArray jSONArray = new JSONArray(str);
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            AbstractC21351f m110601l0 = AbstractC21351f.m110601l0(jSONArray.getJSONObject(i11));
            if (m110601l0 != null) {
                if (m110601l0 instanceof C21354i) {
                    C21354i c21354i = (C21354i) m110601l0;
                    String m110643x0 = c21354i.m110643x0();
                    InputStream m106838k = new C20556f(m110643x0).m106838k();
                    c21354i.m110641A0(BitmapFactory.decodeStream(m106838k), m110643x0);
                    if (m106838k != null) {
                        try {
                            m106838k.close();
                        } catch (Exception e11) {
                            AbstractC20110a.m104538g("%s#restoreData(). %s", "EditorDecorView", e11);
                        }
                    }
                }
                m39748F(m110601l0);
            }
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        InterfaceC7826a interfaceC7826a = this.f41961z0;
        if (interfaceC7826a != null) {
            interfaceC7826a.onConfigurationChanged(configuration);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        this.f41916G = AbstractC17358g.m92489b(getContext(), 16.0f);
        this.f41918H = this.f41929Q.m98297j1() * 0.13f;
        this.f41920I = AbstractC17358g.m92489b(getContext(), 1.0f);
        this.f41922J = (getWidth() - this.f41929Q.m98299k1()) / 2.0f;
        this.f41923K = (getWidth() + this.f41929Q.m98299k1()) / 2.0f;
        this.f41924L = (getHeight() - this.f41929Q.m98297j1()) / 2.0f;
        this.f41925M = (getHeight() + this.f41929Q.m98297j1()) / 2.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:            if (r2 != 6) goto L150;     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC7828c interfaceC7828c;
        InterfaceC7827b interfaceC7827b;
        Rect rect;
        AbstractC21351f m39764V;
        InterfaceC7828c interfaceC7828c2;
        if (!this.f41939d0 || this.f41919H0) {
            return false;
        }
        if (this.f41937b0 == null && this.f41921I0 == 0 && (interfaceC7828c2 = this.f41909A0) != null) {
            interfaceC7828c2.mo39111l(motionEvent);
        }
        if (!this.f41939d0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action == 5) {
                            if (this.f41940e0) {
                                InterfaceC7828c interfaceC7828c3 = this.f41909A0;
                                if (interfaceC7828c3 != null) {
                                    interfaceC7828c3.mo39104e(false);
                                }
                                this.f41932T = true;
                                this.f41915F0.removeCallbacks(this.f41917G0);
                                long currentTimeMillis = System.currentTimeMillis();
                                this.f41953r0 = currentTimeMillis;
                                if ((currentTimeMillis - this.f41952q0 < 80 || this.f41937b0 == null || this.f41921I0 == 0) && (m39764V = m39764V(m39752J(motionEvent), getHeight() - m39753K(motionEvent))) != null) {
                                    this.f41937b0 = m39764V;
                                    if (this.f41953r0 - this.f41952q0 < 80) {
                                        setToFront(m39764V);
                                    }
                                    InterfaceC7828c interfaceC7828c4 = this.f41909A0;
                                    if (interfaceC7828c4 != null) {
                                        interfaceC7828c4.mo39109j(true);
                                    }
                                }
                                this.f41951p0 = true;
                                this.f41943h0 = 300;
                                this.f41938c0 = false;
                                InterfaceC7826a interfaceC7826a = this.f41961z0;
                                if (interfaceC7826a != null) {
                                    interfaceC7826a.mo39117d(-1.0f, true);
                                }
                            }
                        }
                    }
                } else if (this.f41937b0 != null) {
                    float x11 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    AbstractC21351f abstractC21351f = this.f41937b0;
                    if (abstractC21351f != null && (abstractC21351f instanceof C21357l)) {
                        this.f41929Q.m98304m2((C21357l) abstractC21351f);
                        this.f41929Q.m98294h2(true);
                    }
                    int i11 = this.f41943h0;
                    if (i11 == 200) {
                        AbstractC21351f abstractC21351f2 = this.f41937b0;
                        if ((abstractC21351f2 instanceof C21357l) && ((C21357l) abstractC21351f2).m110663N0()) {
                            ((C21357l) this.f41937b0).m110677z0(this.f41911C0);
                        }
                        if (this.f41951p0) {
                            this.f41936a0.x = this.f41937b0.m110606f0();
                            this.f41936a0.y = this.f41937b0.m110607g0();
                            PointF pointF = this.f41934V;
                            pointF.x = x11;
                            pointF.y = y11;
                            this.f41949n0 = x11;
                            this.f41950o0 = y11;
                            this.f41951p0 = false;
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("move DecorObject to: ");
                            sb2.append(x11);
                            sb2.append(" ");
                            sb2.append(y11);
                            PointF pointF2 = this.f41934V;
                            m39775i0(x11 - pointF2.x, y11 - pointF2.y);
                            this.f41949n0 = x11;
                            this.f41950o0 = y11;
                            if (this.f41909A0 != null && (rect = this.f41957v0) != null) {
                                if (rect.contains((int) x11, (int) m39740Z(y11))) {
                                    this.f41937b0.mo1953W(0.4f);
                                    this.f41909A0.mo39106g(true);
                                } else {
                                    this.f41937b0.mo1953W(1.0f);
                                    this.f41909A0.mo39106g(false);
                                }
                            }
                        }
                    } else if (i11 == 300) {
                        if (this.f41951p0) {
                            this.f41936a0.x = this.f41937b0.m110606f0();
                            this.f41936a0.y = this.f41937b0.m110607g0();
                            this.f41941f0 = this.f41937b0.m110605e0();
                            this.f41942g0 = this.f41937b0.m110604c0();
                            this.f41944i0 = m39792z0(motionEvent);
                            float m39784r0 = m39784r0(motionEvent);
                            this.f41946k0 = m39784r0;
                            this.f41948m0 = m39784r0;
                            m39751I(this.f41934V, motionEvent);
                            PointF pointF3 = this.f41934V;
                            this.f41949n0 = pointF3.x;
                            this.f41950o0 = pointF3.y;
                            this.f41951p0 = false;
                        } else {
                            float m39792z0 = m39792z0(motionEvent);
                            this.f41945j0 = m39792z0;
                            m39785s0(m39792z0 / this.f41944i0);
                            float m39784r02 = m39784r0(motionEvent);
                            this.f41947l0 = m39784r02;
                            AbstractC21351f abstractC21351f3 = this.f41937b0;
                            if (abstractC21351f3 instanceof C21357l) {
                                ((C21357l) abstractC21351f3).m110664Q0();
                                m39782p0(this.f41947l0 - this.f41946k0);
                                this.f41948m0 = this.f41947l0;
                            } else {
                                m39783q0(m39784r02 - this.f41946k0);
                            }
                            m39751I(this.f41935W, motionEvent);
                            PointF pointF4 = this.f41935W;
                            float f11 = pointF4.x;
                            PointF pointF5 = this.f41934V;
                            m39775i0(f11 - pointF5.x, pointF4.y - pointF5.y);
                            PointF pointF6 = this.f41935W;
                            this.f41949n0 = pointF6.x;
                            this.f41950o0 = pointF6.y;
                        }
                    }
                } else if (this.f41943h0 == 300) {
                    if (this.f41951p0) {
                        this.f41944i0 = m39792z0(motionEvent);
                        this.f41951p0 = false;
                    } else {
                        float m39792z02 = m39792z0(motionEvent);
                        this.f41945j0 = m39792z02;
                        InterfaceC7826a interfaceC7826a2 = this.f41961z0;
                        if (interfaceC7826a2 != null) {
                            interfaceC7826a2.mo39117d(m39792z02, false);
                        }
                    }
                }
            }
            if (this.f41909A0 != null) {
                float x12 = motionEvent.getX();
                float y12 = motionEvent.getY();
                long currentTimeMillis2 = System.currentTimeMillis();
                this.f41953r0 = currentTimeMillis2;
                AbstractC21351f abstractC21351f4 = this.f41937b0;
                if (abstractC21351f4 != null && this.f41938c0 && currentTimeMillis2 - this.f41952q0 < 300) {
                    if (abstractC21351f4 instanceof C21357l) {
                        this.f41909A0.mo39103d(abstractC21351f4);
                    }
                } else {
                    Rect rect2 = this.f41957v0;
                    if (rect2 != null && abstractC21351f4 != null && rect2.contains((int) x12, (int) m39740Z(y12))) {
                        this.f41937b0.mo1953W(0.4f);
                        this.f41909A0.mo39107h(this.f41937b0);
                        this.f41909A0.mo39106g(false);
                        m39760R(this.f41937b0);
                        this.f41909A0.mo39105f(this.f41937b0);
                        mo39680s();
                    }
                }
                AbstractC21351f abstractC21351f5 = this.f41937b0;
                if (abstractC21351f5 != null) {
                    if ((abstractC21351f5 instanceof C21357l) && ((C21357l) abstractC21351f5).m110663N0()) {
                        ((C21357l) this.f41937b0).m110677z0(this.f41911C0);
                    }
                    this.f41909A0.mo39109j(false);
                    if (this.f41938c0 && this.f41953r0 - this.f41952q0 < 300) {
                        this.f41909A0.mo39110k(this.f41937b0);
                    }
                }
                this.f41909A0.mo39104e(true);
            }
            if ((this.f41938c0 || this.f41931S) && (interfaceC7827b = this.f41910B0) != null) {
                interfaceC7827b.mo39793a();
            }
            this.f41937b0 = null;
            this.f41932T = false;
            this.f41929Q.m98294h2(false);
            this.f41929Q.m98313r2(false);
            mo39680s();
            this.f41951p0 = true;
            this.f41943h0 = 200;
            this.f41945j0 = 1.0f;
            this.f41944i0 = 1.0f;
            this.f41938c0 = false;
            if (motionEvent.getPointerCount() < 3) {
                this.f41929Q.m98313r2(false);
            }
        } else {
            InterfaceC7826a interfaceC7826a3 = this.f41961z0;
            if (interfaceC7826a3 != null) {
                interfaceC7826a3.mo39116c();
            }
            if (!this.f41931S && this.f41921I0 == 0) {
                AbstractC21351f m39763U = m39763U(motionEvent.getX(), getHeight() - motionEvent.getY());
                this.f41937b0 = m39763U;
                if (m39763U != null) {
                    this.f41915F0.removeCallbacks(this.f41917G0);
                    this.f41917G0.m39794a(this.f41937b0);
                    this.f41915F0.postDelayed(this.f41917G0, 80L);
                    this.f41943h0 = 200;
                    InterfaceC7828c interfaceC7828c5 = this.f41909A0;
                    if (interfaceC7828c5 != null) {
                        interfaceC7828c5.mo39109j(true);
                    }
                    this.f41938c0 = true;
                }
            }
            this.f41952q0 = System.currentTimeMillis();
        }
        if (this.f41931S && !this.f41932T) {
            InterfaceC7828c interfaceC7828c6 = this.f41909A0;
            if (interfaceC7828c6 != null) {
                interfaceC7828c6.mo39104e(false);
            }
            this.f41929Q.m98279V0(motionEvent);
            mo39680s();
            return true;
        }
        if (!this.f41933U || (interfaceC7828c = this.f41909A0) == null) {
            return true;
        }
        interfaceC7828c.mo39104e(false);
        return true;
    }

    /* renamed from: p0 */
    void m39782p0(float f11) {
        float m110604c0 = this.f41937b0.m110604c0() - ((this.f41946k0 + f11) - this.f41948m0);
        if (m110604c0 < 0.0f) {
            m110604c0 += 360.0f;
        }
        float f12 = m110604c0 % 45.0f;
        if (f12 >= 1.0f && f12 <= 44.0f) {
            this.f41937b0.m110611n0(m110604c0);
            this.f41929Q.m98313r2(true);
            return;
        }
        if (this.f41909A0 != null && this.f41937b0.m110604c0() % 45.0f > 1.0f && this.f41937b0.m110604c0() % 45.0f < 44.0f) {
            this.f41909A0.mo39108i();
        }
        if (f12 <= 1.0f) {
            this.f41937b0.m110611n0(((int) (m110604c0 / 45.0f)) * 45);
        }
        if (f12 >= 44.0f) {
            this.f41937b0.m110611n0(((int) ((m110604c0 / 45.0f) + 1.0f)) * 45);
        }
    }

    @Override // com.zing.zalo.cameradecor.gl.ZGLSurfaceView
    /* renamed from: q */
    public void mo39678q() {
        super.mo39678q();
        C0790j c0790j = this.f41928P;
        if (c0790j != null) {
            c0790j.m1989a();
        }
    }

    /* renamed from: q0 */
    void m39783q0(float f11) {
        this.f41937b0.m110611n0(this.f41942g0 - f11);
    }

    /* renamed from: r0 */
    float m39784r0(MotionEvent motionEvent) {
        return (float) Math.toDegrees(Math.atan2(motionEvent.getY(0) - motionEvent.getY(1), motionEvent.getX(0) - motionEvent.getX(1)));
    }

    @Override // com.zing.zalo.cameradecor.gl.ZGLSurfaceView
    /* renamed from: s */
    public void mo39680s() {
        super.mo39680s();
    }

    /* renamed from: s0 */
    void m39785s0(float f11) {
        float f12 = f11 * this.f41941f0;
        AbstractC21351f abstractC21351f = this.f41937b0;
        if ((abstractC21351f instanceof C21354i) && ((C21354i) abstractC21351f).m110642w0() != null) {
            float width = ((C21354i) this.f41937b0).m110642w0().getWidth();
            if (f12 * width < getWidth() / 14) {
                f12 = (getWidth() / 14) / width;
                this.f41937b0.mo97628p0(f12);
            }
        }
        this.f41937b0.mo97628p0(f12);
        Object obj = this.f41937b0;
        if (obj instanceof InterfaceC21359n) {
            ((InterfaceC21359n) obj).mo97622f(f12);
        }
    }

    public void setCameraController(InterfaceC29634a interfaceC29634a) {
        this.f41960y0 = interfaceC29634a;
    }

    public void setDeleteArea(Rect rect) {
        this.f41957v0 = rect;
    }

    public void setEventListener(InterfaceC7826a interfaceC7826a) {
        this.f41961z0 = interfaceC7826a;
    }

    public void setExtractBitmapCallback(InterfaceC7827b interfaceC7827b) {
        this.f41910B0 = interfaceC7827b;
    }

    public void setHandleDecorObjectListener(InterfaceC7828c interfaceC7828c) {
        this.f41909A0 = interfaceC7828c;
    }

    public void setLocationFilter(AbstractC22647c abstractC22647c) {
        this.f41929Q.m98309p2(abstractC22647c);
        mo39680s();
    }

    public void setOnRecordListener(AbstractC31817h.b bVar) {
        this.f41959x0 = bVar;
    }

    public void setScaleType(int i11) {
        this.f41929Q.m98315s2(i11);
        this.f41930R = null;
        mo39680s();
    }

    public void setSupportFadeInAnimation(boolean z11) {
        this.f41929Q.m1954X(z11);
    }

    public void setToFront(AbstractC21351f abstractC21351f) {
        if (!(abstractC21351f instanceof AbstractC22646b)) {
            this.f41929Q.m98319u2(abstractC21351f);
            mo39680s();
        }
    }

    public void setTouchEnable(boolean z11) {
        this.f41939d0 = z11;
    }

    /* renamed from: t0 */
    public void m39786t0(Bitmap bitmap, String str, C29617j.a aVar) {
        this.f41930R = bitmap;
        this.f41929Q.m98323w2(bitmap, str, aVar);
        mo39680s();
    }

    /* renamed from: u0 */
    public void m39787u0(final C20556f c20556f, int i11, int i12, C29617j.a aVar) {
        new C25491a(this.f41929Q, i11, i12, c20556f, aVar, new C25491a.a() { // from class: dg.i
            @Override // p460qt.C25491a.a
            /* renamed from: a */
            public final void mo94522a(Bitmap bitmap, C29617j.a aVar2) {
                ImageDecorView.this.m39742f0(c20556f, bitmap, aVar2);
            }
        }).m139138c(new Void[0]);
    }

    /* renamed from: v0 */
    public void m39788v0(double d11, double d12) {
        this.f41954s0 = d11;
        this.f41955t0 = d12;
    }

    /* renamed from: w0 */
    public void m39789w0(final int i11, final InterfaceC29636b interfaceC29636b, final InterfaceC29653k.a aVar, final SensitiveData sensitiveData) {
        Runnable runnable = new Runnable() { // from class: dg.f
            @Override // java.lang.Runnable
            public final void run() {
                ImageDecorView.this.m39743g0(i11, interfaceC29636b, aVar, sensitiveData);
            }
        };
        if (this.f41926N != 0 && this.f41927O != 0) {
            this.f41929Q.m1952U(runnable);
            this.f41912D0 = null;
        } else {
            this.f41912D0 = runnable;
        }
    }

    @Override // com.zing.zalo.cameradecor.view.EGLSharedSurfaceView
    /* renamed from: x */
    public void mo39732x() {
        super.mo39732x();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onEGLContextCreated(). Thread: ");
        sb2.append(Thread.currentThread().getName());
        C28000c.m141116b().m141117a();
    }

    /* renamed from: x0 */
    public void m39790x0(final String str, final C30923c c30923c, final InterfaceC30926f interfaceC30926f, final C30922b.c cVar) {
        Runnable runnable = new Runnable() { // from class: dg.g
            @Override // java.lang.Runnable
            public final void run() {
                ImageDecorView.this.m39744h0(str, c30923c, interfaceC30926f, cVar);
            }
        };
        if (this.f41926N != 0 && this.f41927O != 0) {
            this.f41929Q.m1952U(runnable);
            this.f41913E0 = null;
        } else {
            this.f41913E0 = runnable;
        }
    }

    @Override // com.zing.zalo.cameradecor.view.EGLSharedSurfaceView
    /* renamed from: y */
    public void mo39728y() {
        super.mo39728y();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onEGLContextDestroyed(). Thread: ");
        sb2.append(Thread.currentThread().getName());
        this.f41929Q.destroy();
        AbstractC31817h abstractC31817h = this.f41958w0;
        if (abstractC31817h != null) {
            abstractC31817h.m152859n();
            this.f41919H0 = false;
            this.f41958w0.mo152841h();
            this.f41958w0 = null;
        }
        C28000c.m141116b().m141117a();
    }

    /* renamed from: y0 */
    public void m39791y0() {
        this.f41929Q.m98325x2();
    }

    @Override // com.zing.zalo.cameradecor.view.EGLSharedSurfaceView
    /* renamed from: z */
    public void mo39733z() {
        super.mo39733z();
        this.f41929Q.m1993v();
    }

    /* renamed from: z0 */
    float m39792z0(MotionEvent motionEvent) {
        float f11;
        float f12;
        if (motionEvent != null && motionEvent.getPointerCount() > 1) {
            f11 = motionEvent.getX(0) - motionEvent.getX(1);
            f12 = motionEvent.getY(0) - motionEvent.getY(1);
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        return (float) Math.sqrt((f11 * f11) + (f12 * f12));
    }

    public ImageDecorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41931S = false;
        this.f41932T = false;
        this.f41933U = false;
        this.f41934V = new PointF();
        this.f41935W = new PointF();
        this.f41936a0 = new PointF();
        this.f41938c0 = false;
        this.f41939d0 = true;
        this.f41940e0 = true;
        this.f41943h0 = 100;
        this.f41951p0 = true;
        this.f41956u0 = new Rect();
        this.f41911C0 = new C21357l.a() { // from class: dg.e
            @Override // p276jt.C21357l.a
            /* renamed from: a */
            public final void mo39668a() {
                ImageDecorView.this.mo39680s();
            }
        };
        this.f41915F0 = new Handler();
        this.f41917G0 = new RunnableC7829d();
        this.f41919H0 = false;
        this.f41921I0 = 0;
        if (AbstractC26236a.m134913t(context)) {
            C18607n c18607n = new C18607n(getContext().getApplicationContext(), this, this);
            this.f41929Q = c18607n;
            c18607n.m98307o2(this);
            setPreserveEGLContextOnPause(C26646a.f126111c);
            setRenderer(c18607n);
            mo39680s();
            if (C26646a.f126110b) {
                this.f41928P = new C0790j(context.getApplicationContext());
                return;
            }
            return;
        }
        throw new IllegalStateException("OpenGL ES 2.0 is not supported on this phone.");
    }
}
