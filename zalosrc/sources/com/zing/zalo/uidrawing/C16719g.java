package com.zing.zalo.uidrawing;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import hd0.AbstractC20004b;
import id0.C20516b;
import java.util.Iterator;
import jd0.AbstractC21227a;
import p193h0.AbstractC19694b;

/* renamed from: com.zing.zalo.uidrawing.g */
/* loaded from: classes4.dex */
public class C16719g implements Drawable.Callback {

    /* renamed from: C0 */
    static Paint f84733C0 = null;

    /* renamed from: t0 */
    public static boolean f84734t0 = false;

    /* renamed from: A */
    private int f84741A;

    /* renamed from: B */
    private int f84742B;

    /* renamed from: C */
    protected int f84743C;

    /* renamed from: D */
    protected int f84744D;

    /* renamed from: E */
    protected int f84745E;

    /* renamed from: F */
    protected int f84746F;

    /* renamed from: G */
    protected int f84747G;

    /* renamed from: H */
    protected int f84748H;

    /* renamed from: I */
    protected int f84749I;

    /* renamed from: J */
    protected int f84750J;

    /* renamed from: K */
    protected int f84751K;

    /* renamed from: L */
    protected int f84752L;

    /* renamed from: M */
    protected int f84753M;

    /* renamed from: N */
    protected int f84754N;

    /* renamed from: O */
    boolean f84755O;

    /* renamed from: P */
    boolean f84756P;

    /* renamed from: Q */
    boolean f84757Q;

    /* renamed from: R */
    private int f84758R;

    /* renamed from: S */
    private int f84759S;

    /* renamed from: T */
    private Drawable f84760T;

    /* renamed from: U */
    private int f84761U;

    /* renamed from: V */
    private Bitmap f84762V;

    /* renamed from: W */
    private int f84763W;

    /* renamed from: X */
    private C16715c f84764X;

    /* renamed from: Y */
    private long f84765Y;

    /* renamed from: Z */
    protected C20516b f84766Z;

    /* renamed from: a0 */
    protected int f84767a0;

    /* renamed from: b0 */
    protected int f84768b0;

    /* renamed from: m0 */
    private c f84779m0;

    /* renamed from: n0 */
    private d f84780n0;

    /* renamed from: o0 */
    private e f84781o0;

    /* renamed from: p */
    protected int f84782p;

    /* renamed from: p0 */
    private boolean f84783p0;

    /* renamed from: q */
    protected ViewGroup f84784q;

    /* renamed from: r */
    protected Context f84786r;

    /* renamed from: r0 */
    private Handler f84787r0;

    /* renamed from: s */
    private InterfaceC16721i f84788s;

    /* renamed from: t */
    private int f84790t;

    /* renamed from: u */
    private Object f84791u;

    /* renamed from: v */
    private SparseArray f84792v;

    /* renamed from: w */
    private int f84793w;

    /* renamed from: x */
    protected int[] f84794x;

    /* renamed from: y */
    private b f84795y;

    /* renamed from: u0 */
    private static final int[] f84735u0 = new int[0];

    /* renamed from: v0 */
    private static final int[] f84736v0 = {R.attr.state_pressed};

    /* renamed from: w0 */
    private static final int[] f84737w0 = {R.attr.state_enabled};

    /* renamed from: x0 */
    private static final int[] f84738x0 = {R.attr.state_checked};

    /* renamed from: y0 */
    private static final int[] f84739y0 = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: z0 */
    private static final int[] f84740z0 = {R.attr.state_checked, R.attr.state_enabled};

    /* renamed from: A0 */
    private static final int[] f84731A0 = {R.attr.state_pressed, R.attr.state_checked};

    /* renamed from: B0 */
    private static final int[] f84732B0 = {R.attr.state_enabled, R.attr.state_pressed, R.attr.state_checked};

    /* renamed from: c0 */
    protected float f84769c0 = 1.0f;

    /* renamed from: d0 */
    protected float f84770d0 = 1.0f;

    /* renamed from: e0 */
    protected float f84771e0 = 1.0f;

    /* renamed from: f0 */
    protected float f84772f0 = 1.0f;

    /* renamed from: g0 */
    protected float f84773g0 = 1.0f;

    /* renamed from: h0 */
    protected int f84774h0 = 0;

    /* renamed from: i0 */
    protected int f84775i0 = 0;

    /* renamed from: j0 */
    protected int f84776j0 = 0;

    /* renamed from: k0 */
    protected boolean f84777k0 = true;

    /* renamed from: l0 */
    private boolean f84778l0 = true;

    /* renamed from: q0 */
    private boolean f84785q0 = false;

    /* renamed from: s0 */
    private Runnable f84789s0 = new a();

    /* renamed from: z */
    private C16718f f84796z = new C16718f(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uidrawing.g$a */
    /* loaded from: classes4.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C16719g.this.m89155v0();
            if (C16719g.this.f84788s != null) {
                C16719g.this.f84788s.mo88988c();
            } else {
                C16719g.this.m89142j();
            }
        }
    }

    /* renamed from: com.zing.zalo.uidrawing.g$b */
    /* loaded from: classes4.dex */
    public interface b {
        /* renamed from: a */
        void mo945a(C16719g c16719g, boolean z11);
    }

    /* renamed from: com.zing.zalo.uidrawing.g$c */
    /* loaded from: classes4.dex */
    public interface c {
        /* renamed from: y */
        void mo929y(C16719g c16719g);
    }

    /* renamed from: com.zing.zalo.uidrawing.g$d */
    /* loaded from: classes4.dex */
    public interface d {
        /* renamed from: f */
        void mo942f(C16719g c16719g);
    }

    /* renamed from: com.zing.zalo.uidrawing.g$e */
    /* loaded from: classes4.dex */
    public interface e {
        /* renamed from: a */
        boolean mo16937a(C16719g c16719g, MotionEvent motionEvent);
    }

    public C16719g(Context context) {
        this.f84786r = context;
        mo89099H0(true);
        this.f84784q = null;
    }

    /* renamed from: R */
    private int m89074R(int i11) {
        int i12 = this.f84746F;
        if (i12 == Integer.MIN_VALUE) {
            i12 = i11 - this.f84796z.f84723s;
        }
        int i13 = this.f84744D;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f84796z.f84721q;
        }
        int i14 = i12 - i13;
        C16718f c16718f = this.f84796z;
        int i15 = (i14 - c16718f.f84717m) - c16718f.f84719o;
        if (i15 <= 0) {
            return 0;
        }
        return i15;
    }

    /* renamed from: S */
    private int m89075S(int i11) {
        int i12 = this.f84745E;
        if (i12 == Integer.MIN_VALUE) {
            i12 = i11 - this.f84796z.f84722r;
        }
        int i13 = this.f84743C;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f84796z.f84720p;
        }
        int i14 = i12 - i13;
        C16718f c16718f = this.f84796z;
        int i15 = (i14 - c16718f.f84718n) - c16718f.f84716l;
        if (i15 <= 0) {
            return 0;
        }
        return i15;
    }

    /* renamed from: a0 */
    private static int[] m89076a0(int i11) {
        int i12 = i11 & 273;
        return i12 != 1 ? i12 != 16 ? i12 != 17 ? i12 != 256 ? i12 != 257 ? i12 != 272 ? i12 != 273 ? f84735u0 : f84732B0 : f84731A0 : f84740z0 : f84738x0 : f84739y0 : f84736v0 : f84737w0;
    }

    /* renamed from: d1 */
    private void m89077d1() {
        if (this.f84787r0 == null && this.f84786r == null) {
            return;
        }
        m89082k();
        if (this.f84787r0 == null) {
            this.f84787r0 = new Handler();
        }
        this.f84787r0.removeCallbacks(this.f84789s0);
        this.f84787r0.postDelayed(this.f84789s0, 500L);
    }

    /* renamed from: e1 */
    private void m89078e1() {
        this.f84773g0 = this.f84772f0 * this.f84771e0;
        if (mo89008r0()) {
            invalidate();
        }
    }

    /* renamed from: f1 */
    private void m89079f1(int i11, int i12) {
        if (m89106L().f84726v > 0.0f) {
            i12 = (((int) (((m89106L().f84716l + i11) + m89106L().f84718n) * m89106L().f84726v)) - m89106L().f84717m) - m89106L().f84719o;
        } else if (m89106L().f84725u > 0.0f) {
            i11 = (((int) ((m89106L().f84717m + i12) + (m89106L().f84719o * m89106L().f84725u))) - m89106L().f84716l) - m89106L().f84718n;
        }
        int m89016r = C16718f.m89016r(i11, m89106L().m89057j(), m89106L().m89053h());
        int m89016r2 = C16718f.m89016r(i12, m89106L().m89055i(), m89106L().m89051g());
        if (this.f84741A == Integer.MIN_VALUE) {
            int i13 = this.f84743C;
            if (i13 == Integer.MIN_VALUE && this.f84745E == Integer.MIN_VALUE) {
                C16718f c16718f = this.f84796z;
                int i14 = m89016r + c16718f.f84716l + c16718f.f84718n;
                this.f84741A = i14;
                int i15 = c16718f.f84720p + c16718f.f84706b;
                this.f84743C = i15;
                this.f84745E = i15 + i14;
            } else if (i13 == Integer.MIN_VALUE) {
                C16718f c16718f2 = this.f84796z;
                int i16 = m89016r + c16718f2.f84716l + c16718f2.f84718n;
                this.f84741A = i16;
                this.f84743C = this.f84745E - i16;
            } else if (this.f84745E == Integer.MIN_VALUE) {
                C16718f c16718f3 = this.f84796z;
                int i17 = m89016r + c16718f3.f84716l + c16718f3.f84718n;
                this.f84741A = i17;
                this.f84745E = i13 + i17;
            }
        }
        if (this.f84742B == Integer.MIN_VALUE) {
            int i18 = this.f84744D;
            if (i18 == Integer.MIN_VALUE && this.f84746F == Integer.MIN_VALUE) {
                C16718f c16718f4 = this.f84796z;
                int i19 = m89016r2 + c16718f4.f84717m + c16718f4.f84719o;
                this.f84742B = i19;
                int i21 = c16718f4.f84721q + c16718f4.f84707c;
                this.f84744D = i21;
                this.f84746F = i21 + i19;
                return;
            }
            if (i18 == Integer.MIN_VALUE) {
                C16718f c16718f5 = this.f84796z;
                int i22 = m89016r2 + c16718f5.f84717m + c16718f5.f84719o;
                this.f84742B = i22;
                this.f84744D = this.f84746F - i22;
                return;
            }
            if (this.f84746F == Integer.MIN_VALUE) {
                C16718f c16718f6 = this.f84796z;
                int i23 = m89016r2 + c16718f6.f84717m + c16718f6.f84719o;
                this.f84742B = i23;
                this.f84746F = i18 + i23;
            }
        }
    }

    /* renamed from: h0 */
    private void m89081h0() {
        if (f84734t0 && f84733C0 == null) {
            Paint paint = new Paint();
            f84733C0 = paint;
            paint.setStyle(Paint.Style.STROKE);
            f84733C0.setStrokeWidth(1.0f);
            f84733C0.setColor(-65536);
        }
    }

    /* renamed from: k */
    private void m89082k() {
        Handler handler = this.f84787r0;
        if (handler != null) {
            handler.removeCallbacks(this.f84789s0);
        }
    }

    /* renamed from: p */
    private void m89083p() {
        if (this.f84741A > 0 && this.f84742B > 0 && this.f84747G > 0 && this.f84748H > 0) {
            this.f84753M = 0;
            this.f84754N = 0;
            int i11 = this.f84796z.f84724t;
            if (!AbstractC20004b.m103812c(i11)) {
                if (AbstractC20004b.m103811b(i11)) {
                    this.f84753M = -this.f84749I;
                } else if (AbstractC20004b.m103813d(i11)) {
                    this.f84753M = (this.f84741A - ((this.f84747G + m89106L().f84716l) + m89106L().f84718n)) - this.f84749I;
                } else if (AbstractC20004b.m103810a(i11)) {
                    this.f84753M = ((this.f84741A - ((this.f84747G + m89106L().f84716l) + m89106L().f84718n)) / 2) - this.f84749I;
                }
            }
            if (!AbstractC20004b.m103816g(i11)) {
                if (AbstractC20004b.m103817h(i11)) {
                    this.f84754N = -this.f84750J;
                } else if (AbstractC20004b.m103814e(i11)) {
                    this.f84754N = (this.f84742B - ((this.f84748H + m89106L().f84717m) + m89106L().f84719o)) - this.f84750J;
                } else if (AbstractC20004b.m103815f(i11)) {
                    this.f84754N = ((this.f84742B - ((this.f84748H + m89106L().f84717m) + m89106L().f84719o)) / 2) - this.f84750J;
                }
            }
        }
    }

    /* renamed from: A */
    public float m89084A() {
        return this.f84773g0;
    }

    /* renamed from: A0 */
    public void m89085A0(Drawable drawable) {
        if (drawable != this.f84760T) {
            m89145l();
            if (drawable == null) {
                return;
            }
            this.f84760T = drawable;
            drawable.setState(this.f84794x);
            this.f84760T.setCallback(this);
            invalidate();
        }
    }

    /* renamed from: B */
    public final int m89086B() {
        float f11 = this.f84773g0;
        if (f11 >= 1.0f) {
            return 255;
        }
        if (f11 <= 0.0f) {
            return 0;
        }
        return (int) (f11 * 255.0f);
    }

    /* renamed from: B0 */
    public void m89087B0(int i11) {
        Drawable drawable;
        if (i11 != this.f84761U) {
            if (i11 != 0) {
                drawable = AbstractC19694b.m103336d(getContext(), i11);
            } else {
                drawable = null;
            }
            m89085A0(drawable);
            this.f84761U = i11;
            return;
        }
        if (i11 == 0) {
            m89145l();
        }
    }

    /* renamed from: C */
    public int m89088C() {
        return m89106L().f84716l + this.f84753M;
    }

    /* renamed from: C0 */
    public void m89089C0(int i11, int i12, int i13, int i14) {
        this.f84743C = i11;
        this.f84744D = i12;
        this.f84745E = i13;
        this.f84746F = i14;
        int i15 = Integer.MIN_VALUE;
        if (i11 == -2147483647 || i13 == -2147483647) {
            this.f84741A = -2147483647;
        } else {
            this.f84741A = (i11 == Integer.MIN_VALUE || i13 == Integer.MIN_VALUE) ? Integer.MIN_VALUE : i13 - i11;
        }
        if (i12 == -2147483647 || i14 == -2147483647) {
            this.f84742B = -2147483647;
            return;
        }
        if (i12 != Integer.MIN_VALUE && i14 != Integer.MIN_VALUE) {
            i15 = i14 - i12;
        }
        this.f84742B = i15;
    }

    /* renamed from: D */
    public int m89090D() {
        return m89106L().f84717m + this.f84754N;
    }

    /* renamed from: D0 */
    public void mo89091D0(boolean z11) {
        int i11;
        if (z11) {
            i11 = this.f84793w | 256;
        } else {
            i11 = this.f84793w & (-257);
        }
        m89127X0(i11);
    }

    /* renamed from: E */
    public float m89092E() {
        return this.f84771e0;
    }

    /* renamed from: E0 */
    public void mo89093E0(boolean z11) {
        this.f84777k0 = z11;
    }

    /* renamed from: F */
    public Drawable m89094F() {
        return this.f84760T;
    }

    /* renamed from: F0 */
    public final void m89095F0(int i11, int i12, int i13, int i14) {
        this.f84749I = i11;
        this.f84750J = i12;
        this.f84751K = i13;
        this.f84752L = i14;
        this.f84747G = Math.max(i13 - i11, 0);
        this.f84748H = Math.max(i14 - i12, 0);
    }

    /* renamed from: G */
    public int m89096G() {
        return this.f84758R + this.f84767a0;
    }

    /* renamed from: G0 */
    public void m89097G0(int i11, int i12) {
        m89095F0(0, 0, i11, i12);
    }

    /* renamed from: H */
    public int m89098H() {
        return this.f84759S + this.f84768b0;
    }

    /* renamed from: H0 */
    public void mo89099H0(boolean z11) {
        int i11;
        if (z11) {
            i11 = this.f84793w | 1;
        } else {
            i11 = this.f84793w & (-2);
        }
        m89127X0(i11);
    }

    /* renamed from: I */
    public C16715c m89100I() {
        if (this.f84764X == null) {
            this.f84764X = new C16715c(this);
        }
        return this.f84764X;
    }

    /* renamed from: I0 */
    public void m89101I0(int i11) {
        this.f84790t = i11;
    }

    /* renamed from: J */
    public int m89102J() {
        return this.f84790t;
    }

    /* renamed from: J0 */
    public void m89103J0(boolean z11) {
        this.f84785q0 = z11;
    }

    /* renamed from: K */
    public boolean m89104K() {
        return this.f84785q0;
    }

    /* renamed from: K0 */
    public void m89105K0(boolean z11) {
        this.f84778l0 = z11;
    }

    /* renamed from: L */
    public C16718f m89106L() {
        return this.f84796z;
    }

    /* renamed from: L0 */
    public void mo89107L0(b bVar) {
        this.f84795y = bVar;
    }

    /* renamed from: M */
    public int m89108M() {
        return this.f84748H;
    }

    /* renamed from: M0 */
    public void mo89109M0(c cVar) {
        this.f84779m0 = cVar;
    }

    /* renamed from: N */
    public int m89110N() {
        return this.f84747G;
    }

    /* renamed from: N0 */
    public void m89111N0(d dVar) {
        this.f84780n0 = dVar;
    }

    /* renamed from: O */
    public int m89112O() {
        return this.f84742B;
    }

    /* renamed from: O0 */
    public void m89113O0(e eVar) {
        this.f84781o0 = eVar;
    }

    /* renamed from: P */
    public int m89114P() {
        return this.f84741A;
    }

    /* renamed from: P0 */
    public void m89115P0(InterfaceC16721i interfaceC16721i) {
        this.f84788s = interfaceC16721i;
        if (interfaceC16721i != null) {
            mo89118S0(interfaceC16721i.getRoot());
        } else {
            mo89147m();
        }
        if (interfaceC16721i instanceof C16716d) {
            m89117R0(((C16716d) interfaceC16721i).m89084A());
        }
    }

    /* renamed from: Q */
    public InterfaceC16721i m89116Q() {
        return this.f84788s;
    }

    /* renamed from: Q0 */
    public void mo89000Q0(boolean z11) {
        int i11;
        if (z11) {
            i11 = this.f84793w | 16;
        } else {
            i11 = this.f84793w & (-17);
        }
        m89127X0(i11);
    }

    /* renamed from: R0 */
    public void m89117R0(float f11) {
        if (this.f84772f0 != f11) {
            this.f84772f0 = f11;
            m89078e1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: S0 */
    public void mo89118S0(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        if (this.f84784q == null) {
            this.f84784q = viewGroup;
        }
        if (this instanceof InterfaceC16721i) {
            Iterator it = ((InterfaceC16721i) this).getModules().iterator();
            while (it.hasNext()) {
                ((C16719g) it.next()).mo89118S0(viewGroup);
            }
        }
    }

    /* renamed from: T */
    public ViewGroup m89119T() {
        return this.f84784q;
    }

    /* renamed from: T0 */
    public void m89120T0(int i11) {
        if (i11 != this.f84774h0) {
            this.f84774h0 = i11;
            invalidate();
        }
    }

    /* renamed from: U */
    public int m89121U() {
        return this.f84774h0;
    }

    /* renamed from: U0 */
    public void m89122U0(int i11) {
        if (i11 != this.f84775i0) {
            this.f84775i0 = i11;
            invalidate();
        }
    }

    /* renamed from: V */
    public int m89123V() {
        return this.f84775i0;
    }

    /* renamed from: V0 */
    public void mo89124V0(float f11) {
        if (f11 != this.f84769c0) {
            this.f84769c0 = f11;
            invalidate();
        }
    }

    /* renamed from: W */
    public int m89125W() {
        return this.f84776j0;
    }

    /* renamed from: W0 */
    public void mo89126W0(float f11) {
        if (f11 != this.f84770d0) {
            this.f84770d0 = f11;
            invalidate();
        }
    }

    /* renamed from: X0 */
    public void m89127X0(int i11) {
        if (i11 != this.f84793w) {
            int[] m89076a0 = m89076a0(i11);
            int i12 = this.f84793w;
            int[] iArr = this.f84794x;
            this.f84793w = i11;
            if (m89076a0 != iArr) {
                this.f84794x = m89076a0;
                mo89151s0(i12, iArr, i11, m89076a0);
            }
        }
    }

    /* renamed from: Y */
    public float m89128Y() {
        return this.f84769c0;
    }

    /* renamed from: Y0 */
    public void m89129Y0(Object obj) {
        this.f84791u = obj;
    }

    /* renamed from: Z */
    public float m89130Z() {
        return this.f84770d0;
    }

    /* renamed from: Z0 */
    public void m89131Z0(int i11) {
        if (this.f84767a0 != i11) {
            this.f84767a0 = i11;
            invalidate();
        }
    }

    /* renamed from: a1 */
    public void m89132a1(int i11) {
        if (this.f84768b0 != i11) {
            this.f84768b0 = i11;
            invalidate();
        }
    }

    /* renamed from: b0 */
    public Object m89133b0() {
        return this.f84791u;
    }

    /* renamed from: b1 */
    public void mo44614b1(int i11) {
        boolean z11;
        int i12 = this.f84782p;
        if (i12 != i11) {
            if (i11 != 8 && i12 != 8) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f84782p = i11;
            ViewGroup viewGroup = this.f84784q;
            if (viewGroup != null) {
                if (z11) {
                    viewGroup.requestLayout();
                } else {
                    viewGroup.invalidate();
                }
            }
        }
    }

    /* renamed from: c0 */
    public int m89134c0() {
        return this.f84768b0;
    }

    /* renamed from: c1 */
    public void m89135c1(C20516b c20516b) {
        if (this.f84766Z != null) {
            mo89140i();
        }
        this.f84766Z = c20516b;
        m89139g0(c20516b);
        invalidate();
    }

    /* renamed from: d0 */
    public int m89136d0() {
        return this.f84782p;
    }

    /* renamed from: e0 */
    public void mo89137e0() {
        this.f84741A = 0;
        this.f84742B = 0;
        int i11 = this.f84743C;
        if (i11 == Integer.MIN_VALUE && this.f84745E == Integer.MIN_VALUE) {
            int i12 = this.f84796z.f84706b;
            this.f84743C = i12;
            this.f84745E = i12;
        } else if (i11 == Integer.MIN_VALUE) {
            this.f84743C = this.f84745E;
        } else if (this.f84745E == Integer.MIN_VALUE) {
            this.f84745E = i11;
        }
        int i13 = this.f84744D;
        if (i13 == Integer.MIN_VALUE && this.f84746F == Integer.MIN_VALUE) {
            int i14 = this.f84796z.f84707c;
            this.f84744D = i14;
            this.f84746F = i14;
        } else if (i13 == Integer.MIN_VALUE) {
            this.f84744D = this.f84746F;
        } else if (this.f84746F == Integer.MIN_VALUE) {
            this.f84746F = i13;
        }
    }

    /* renamed from: f0 */
    protected boolean m89138f0(MotionEvent motionEvent) {
        e eVar = this.f84781o0;
        if (eVar != null) {
            return eVar.mo16937a(this, motionEvent);
        }
        return false;
    }

    /* renamed from: g0 */
    protected void m89139g0(C20516b c20516b) {
        if (c20516b != null) {
            this.f84765Y = System.currentTimeMillis();
            c20516b.mo106592h(this);
        } else {
            this.f84765Y = 0L;
        }
    }

    public Context getContext() {
        return this.f84786r;
    }

    public Object getTag(int i11) {
        SparseArray sparseArray = this.f84792v;
        if (sparseArray != null) {
            return sparseArray.get(i11);
        }
        return null;
    }

    /* renamed from: i */
    public void mo89140i() {
        this.f84766Z = null;
        this.f84765Y = 0L;
    }

    /* renamed from: i0 */
    public boolean m89141i0() {
        return (this.f84793w & 256) != 0;
    }

    public void invalidate() {
        ViewGroup viewGroup;
        if (this.f84782p == 0 && (viewGroup = this.f84784q) != null) {
            if ((viewGroup instanceof ModulesView) && ((ModulesView) viewGroup).f84668C) {
                return;
            }
            viewGroup.invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.f84782p == 0) {
            invalidate();
        }
    }

    public boolean isShown() {
        Object obj;
        C16719g c16719g = this;
        while (c16719g.f84782p == 0 && (obj = c16719g.f84788s) != null) {
            if (obj instanceof View) {
                return ((View) obj).isShown();
            }
            c16719g = (C16719g) obj;
        }
        return false;
    }

    /* renamed from: j */
    void m89142j() {
        this.f84783p0 = false;
        if (mo89149n() || m89148m0()) {
            mo89000Q0(false);
        }
        m89082k();
    }

    /* renamed from: j0 */
    public boolean m89143j0() {
        return (this.f84793w & 1) != 0;
    }

    /* renamed from: k0 */
    public boolean m89144k0() {
        return this.f84782p == 0;
    }

    /* renamed from: l */
    public void m89145l() {
        Drawable drawable = this.f84760T;
        if (drawable != null) {
            drawable.setCallback(null);
            this.f84760T = null;
            this.f84761U = 0;
            this.f84762V = null;
            this.f84763W = 0;
            invalidate();
        }
    }

    /* renamed from: l0 */
    public final void m89146l0(int i11, int i12, int i13, int i14) {
        int i15;
        m89083p();
        int i16 = 0;
        if (m89116Q() != null) {
            i15 = m89116Q().getChildCoordinateX();
        } else {
            i15 = 0;
        }
        if (m89116Q() != null) {
            i16 = m89116Q().getChildCoordinateY();
        }
        int i17 = this.f84743C;
        this.f84758R = i15 + i17;
        int i18 = this.f84744D;
        this.f84759S = i16 + i18;
        mo44848p0(i17, i18, this.f84745E, this.f84746F);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public void mo89147m() {
        this.f84784q = null;
        if (this instanceof InterfaceC16721i) {
            Iterator it = ((InterfaceC16721i) this).getModules().iterator();
            while (it.hasNext()) {
                ((C16719g) it.next()).mo89147m();
            }
        }
    }

    /* renamed from: m0 */
    public boolean m89148m0() {
        if (this.f84778l0 && m89143j0() && this.f84780n0 != null) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public boolean mo89149n() {
        if (this.f84777k0 && m89143j0() && this.f84779m0 != null) {
            return true;
        }
        return false;
    }

    /* renamed from: n0 */
    public final void m89150n0(int i11, int i12, int i13, int i14) {
        int i15;
        boolean z11;
        int i16;
        int i17;
        int i18;
        this.f84796z.m89062n();
        int i19 = this.f84741A;
        if (i19 != -2147483647 && (i15 = this.f84742B) != -2147483647) {
            int i21 = Integer.MIN_VALUE;
            if (i19 != Integer.MIN_VALUE && i15 != Integer.MIN_VALUE) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (this.f84782p == 8) {
                mo89137e0();
            } else {
                int i22 = 1073741824;
                if (i19 == Integer.MIN_VALUE) {
                    i16 = m89075S(i11);
                    if (i12 == 0) {
                        i17 = 0;
                    } else {
                        i17 = Integer.MIN_VALUE;
                    }
                } else {
                    C16718f c16718f = this.f84796z;
                    i16 = (i19 - c16718f.f84716l) - c16718f.f84718n;
                    i17 = 1073741824;
                }
                int i23 = this.f84742B;
                if (i23 == Integer.MIN_VALUE) {
                    i18 = m89074R(i13);
                    if (i14 == 0) {
                        i21 = 0;
                    }
                    i22 = i21;
                } else {
                    C16718f c16718f2 = this.f84796z;
                    i18 = (i23 - c16718f2.f84717m) - c16718f2.f84719o;
                }
                mo44180q0(i16, i17, i18, i22);
                if (z11) {
                    m89079f1(this.f84747G, this.f84748H);
                }
            }
            this.f84756P = false;
            if (this.f84796z.m89059k() && this.f84741A >= 0) {
                if (this.f84796z.m89043a()) {
                    this.f84796z.m89064p();
                } else {
                    this.f84756P = true;
                }
            }
            this.f84757Q = false;
            if (this.f84796z.m89061l() && this.f84742B >= 0) {
                if (this.f84796z.m89045b()) {
                    this.f84796z.m89065q();
                } else {
                    this.f84757Q = true;
                }
            }
        }
    }

    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
    }

    /* renamed from: p0 */
    public void mo44848p0(int i11, int i12, int i13, int i14) {
    }

    public void postInvalidate() {
        ViewGroup viewGroup;
        if (this.f84782p == 0 && (viewGroup = this.f84784q) != null) {
            if ((viewGroup instanceof ModulesView) && ((ModulesView) viewGroup).f84668C) {
                return;
            }
            viewGroup.postInvalidate();
        }
    }

    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        if (i12 != 1073741824) {
            i11 = 0;
        }
        if (i14 != 1073741824) {
            i13 = 0;
        }
        m89097G0(i11, i13);
    }

    /* renamed from: r */
    public void mo88812r() {
    }

    /* renamed from: r0 */
    public boolean mo89008r0() {
        return this.f84760T != null;
    }

    public void requestLayout() {
        ViewGroup viewGroup;
        if (this.f84782p != 8 && (viewGroup = this.f84784q) != null) {
            viewGroup.invalidate();
            this.f84784q.requestLayout();
        }
    }

    /* renamed from: s */
    public void mo44179s(Canvas canvas) {
    }

    /* renamed from: s0 */
    public void mo89151s0(int i11, int[] iArr, int i12, int[] iArr2) {
        Drawable drawable = this.f84760T;
        if (drawable != null) {
            drawable.setState(iArr2);
        }
        C16715c c16715c = this.f84764X;
        if (c16715c != null) {
            c16715c.m88998b(iArr2);
        }
        b bVar = this.f84795y;
        if (bVar != null && ((i11 ^ i12) & 256) != 0) {
            bVar.mo945a(this, m89141i0());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
    }

    public void setTag(int i11, Object obj) {
        if (this.f84792v == null) {
            this.f84792v = new SparseArray(2);
        }
        this.f84792v.put(i11, obj);
    }

    /* renamed from: t0 */
    public boolean mo65871t0(MotionEvent motionEvent) {
        boolean z11;
        if (!m89143j0()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && this.f84783p0) {
                        m89142j();
                    }
                } else if (this.f84783p0 && (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > m89114P() || motionEvent.getY() > m89112O())) {
                    m89142j();
                }
            } else if (this.f84783p0) {
                m89142j();
                z11 = mo89149n();
                if (mo89149n()) {
                    mo89153u0();
                }
            }
            z11 = false;
        } else {
            if (mo89149n() || m89148m0()) {
                this.f84783p0 = true;
                mo89000Q0(true);
            }
            if (!mo89149n() && !m89148m0()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (m89148m0()) {
                m89077d1();
            }
        }
        if (!m89138f0(motionEvent) && !z11) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public final void m89152u(Canvas canvas) {
        int i11;
        boolean z11;
        boolean z12;
        if (m89114P() > 0 && m89112O() > 0) {
            mo88812r();
            C20516b c20516b = this.f84766Z;
            int i12 = this.f84767a0 + this.f84743C;
            int i13 = this.f84768b0 + this.f84744D;
            float m89128Y = m89128Y();
            float m89130Z = m89130Z();
            int m89121U = m89121U();
            int m89123V = m89123V();
            int m89125W = m89125W();
            int i14 = this.f84753M;
            int i15 = this.f84754N;
            if (c20516b != null) {
                i11 = i15;
                if (!c20516b.mo106585a(this, System.currentTimeMillis() - this.f84765Y)) {
                    c20516b.mo106586b(this);
                    mo89140i();
                }
            } else {
                i11 = i15;
            }
            boolean z13 = true;
            if (i12 == 0 && i13 == 0) {
                z11 = false;
            } else {
                canvas.save();
                canvas.translate(i12, i13);
                z11 = true;
            }
            if (m89128Y != 1.0f || m89130Z != 1.0f) {
                if (!z11) {
                    canvas.save();
                    z11 = true;
                }
                canvas.scale(m89128Y, m89130Z, m89114P() / 2.0f, m89112O() / 2.0f);
            }
            if (m89121U != 0 || m89123V != 0 || m89125W != 0) {
                if (!z11) {
                    canvas.save();
                    z11 = true;
                }
                canvas.concat(AbstractC21227a.m110000a((int) ((m89114P() / 2.0f) + 0.5f), (int) ((m89112O() / 2.0f) + 0.5f), m89121U, m89123V, m89125W, -9.765625E-4f));
            }
            m89154v(canvas);
            if (i14 == 0 && i11 == 0) {
                z12 = z11;
            } else {
                if (!z11) {
                    canvas.save();
                } else {
                    z13 = z11;
                }
                canvas.translate(i14, i11);
                z12 = z13;
            }
            mo44775o0(canvas);
            mo44179s(canvas);
            m89160z(canvas);
            if (f84734t0) {
                m89081h0();
                if (this.f84741A > 0 && this.f84742B > 0) {
                    canvas.translate(-this.f84753M, -this.f84754N);
                    float strokeWidth = (int) ((f84733C0.getStrokeWidth() / 2.0f) + 0.5d);
                    canvas.drawRect(strokeWidth, strokeWidth, this.f84741A - r1, this.f84742B - r1, f84733C0);
                }
            }
            if (z12) {
                canvas.restore();
            }
        }
    }

    /* renamed from: u0 */
    public void mo89153u0() {
        c cVar = this.f84779m0;
        if (cVar != null) {
            cVar.mo929y(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    /* renamed from: v */
    void m89154v(Canvas canvas) {
        Drawable drawable = this.f84760T;
        int i11 = this.f84741A;
        int i12 = this.f84742B;
        if (canvas != null && drawable != null && i11 > 0 && i12 > 0) {
            m89156w(canvas, drawable, 0, 0, i11, i12, false);
        }
    }

    /* renamed from: v0 */
    public void m89155v0() {
        d dVar = this.f84780n0;
        if (dVar != null) {
            dVar.mo942f(this);
        }
    }

    /* renamed from: w */
    final void m89156w(Canvas canvas, Drawable drawable, int i11, int i12, int i13, int i14, boolean z11) {
        ModulesView modulesView;
        boolean z12;
        if (m89119T() instanceof ModulesView) {
            modulesView = (ModulesView) m89119T();
        } else {
            modulesView = null;
        }
        boolean z13 = true;
        if (modulesView != null) {
            z12 = modulesView.f84668C;
            modulesView.f84668C = true;
        } else {
            z12 = false;
        }
        drawable.setBounds(i11, i12, i13, i14);
        drawable.setAlpha(m89086B());
        if (modulesView != null) {
            modulesView.f84668C = z12;
        }
        if (z11) {
            canvas.save();
            canvas.clipRect(i11, i12, i13, i14);
        } else {
            z13 = false;
        }
        drawable.draw(canvas);
        if (z13) {
            canvas.restore();
        }
    }

    /* renamed from: w0 */
    public void m89157w0() {
        if (this.f84796z.m89059k() && this.f84756P && this.f84741A >= 0) {
            this.f84796z.m89064p();
            this.f84756P = false;
        }
        if (this.f84796z.m89061l() && this.f84757Q && this.f84742B >= 0) {
            this.f84796z.m89065q();
            this.f84757Q = false;
        }
    }

    /* renamed from: x0 */
    public void mo89158x0(float f11) {
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (this.f84771e0 != f11) {
            this.f84771e0 = f11;
            m89078e1();
        }
    }

    /* renamed from: y0 */
    public void m89159y0(Bitmap bitmap) {
        if (bitmap != this.f84762V) {
            BitmapDrawable bitmapDrawable = null;
            if (bitmap != null) {
                bitmapDrawable = new BitmapDrawable((Resources) null, bitmap);
            }
            m89085A0(bitmapDrawable);
            this.f84762V = bitmap;
            return;
        }
        if (bitmap == null) {
            m89145l();
        }
    }

    /* renamed from: z */
    void m89160z(Canvas canvas) {
        int i11;
        int i12;
        int i13;
        int i14;
        C16715c c16715c = this.f84764X;
        if (canvas != null && c16715c != null && c16715c.f84690b != null && c16715c.f84694f && m89114P() > 0 && m89112O() > 0) {
            Drawable drawable = c16715c.f84690b;
            boolean z11 = c16715c.f84691c;
            boolean z12 = c16715c.f84692d;
            int m89114P = m89114P();
            int m89112O = m89112O();
            if (z11) {
                int i15 = m89106L().f84716l;
                int i16 = m89106L().f84717m;
                int i17 = m89114P - m89106L().f84718n;
                i11 = i17;
                i13 = i15;
                i12 = m89112O - m89106L().f84719o;
                i14 = i16;
            } else {
                i11 = m89114P;
                i12 = m89112O;
                i13 = 0;
                i14 = 0;
            }
            m89156w(canvas, drawable, i13, i14, i11, i12, z12);
        }
    }

    /* renamed from: z0 */
    public void mo89161z0(int i11) {
        ColorDrawable colorDrawable;
        if (i11 != this.f84763W) {
            if (i11 != 0) {
                colorDrawable = new ColorDrawable(i11);
            } else {
                colorDrawable = null;
            }
            m89085A0(colorDrawable);
            this.f84763W = i11;
            return;
        }
        if (i11 == 0) {
            m89145l();
        }
    }
}
