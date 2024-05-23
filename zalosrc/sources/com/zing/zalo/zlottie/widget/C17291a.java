package com.zing.zalo.zlottie.widget;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.zing.zalo.zlottie.jni.AbstractC17288a;
import com.zing.zalo.zlottie.jni.ZLottieJNI;
import com.zing.zalo.zlottie.widget.C17291a;
import com.zing.zalocore.CoreUtility;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;
import nl0.AbstractC23880j;
import nl0.C23874d;
import ol0.C24304b;
import ol0.InterfaceC24305c;

/* renamed from: com.zing.zalo.zlottie.widget.a */
/* loaded from: classes7.dex */
public final class C17291a extends BitmapDrawable implements Animatable {

    /* renamed from: l0 */
    private static final Handler f88057l0;

    /* renamed from: m0 */
    private static final InterfaceC24305c f88058m0;

    /* renamed from: A */
    private File f88059A;

    /* renamed from: B */
    private g f88060B;

    /* renamed from: C */
    private int f88061C;

    /* renamed from: D */
    private int f88062D;

    /* renamed from: E */
    private long f88063E;

    /* renamed from: F */
    private volatile boolean f88064F;

    /* renamed from: G */
    private Runnable f88065G;

    /* renamed from: H */
    private Runnable f88066H;

    /* renamed from: I */
    private volatile Bitmap f88067I;

    /* renamed from: J */
    private volatile Bitmap f88068J;

    /* renamed from: K */
    private volatile Bitmap f88069K;

    /* renamed from: L */
    private boolean f88070L;

    /* renamed from: M */
    private boolean f88071M;

    /* renamed from: N */
    private boolean f88072N;

    /* renamed from: O */
    private AtomicInteger f88073O;

    /* renamed from: P */
    private boolean f88074P;

    /* renamed from: Q */
    private float f88075Q;

    /* renamed from: R */
    private float f88076R;

    /* renamed from: S */
    private boolean f88077S;

    /* renamed from: T */
    private final Rect f88078T;

    /* renamed from: U */
    private volatile boolean f88079U;

    /* renamed from: V */
    private volatile boolean f88080V;

    /* renamed from: W */
    private volatile long f88081W;

    /* renamed from: X */
    private boolean f88082X;

    /* renamed from: Y */
    private boolean f88083Y;

    /* renamed from: Z */
    private f f88084Z;

    /* renamed from: a0 */
    private h f88085a0;

    /* renamed from: b0 */
    private boolean f88086b0;

    /* renamed from: c0 */
    private Paint f88087c0;

    /* renamed from: d0 */
    private int f88088d0;

    /* renamed from: e0 */
    private volatile int f88089e0;

    /* renamed from: f0 */
    private boolean f88090f0;

    /* renamed from: g0 */
    private final Runnable f88091g0;

    /* renamed from: h0 */
    private final Runnable f88092h0;

    /* renamed from: i0 */
    private final Runnable f88093i0;

    /* renamed from: j0 */
    private final Runnable f88094j0;

    /* renamed from: k0 */
    private final Runnable f88095k0;

    /* renamed from: p */
    private final int f88096p;

    /* renamed from: q */
    private final int f88097q;

    /* renamed from: r */
    private volatile int f88098r;

    /* renamed from: s */
    private volatile int f88099s;

    /* renamed from: t */
    private int f88100t;

    /* renamed from: u */
    private int f88101u;

    /* renamed from: v */
    private final int[] f88102v;

    /* renamed from: w */
    private int f88103w;

    /* renamed from: x */
    private String f88104x;

    /* renamed from: y */
    private final boolean f88105y;

    /* renamed from: z */
    private InputStream f88106z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zlottie.widget.a$a */
    /* loaded from: classes7.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C17291a.this.f88066H = null;
            C17291a.this.m92175I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zlottie.widget.a$b */
    /* loaded from: classes7.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C17291a.this.f88065G = null;
            C17291a.this.m92175I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zlottie.widget.a$c */
    /* loaded from: classes7.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!C17291a.this.f88072N && C17291a.this.f88085a0 != null) {
                C17291a.this.f88085a0.mo92221a();
            }
            C17291a.this.f88072N = true;
            C17291a.this.m92180N();
            C17291a.this.m92175I();
        }
    }

    /* renamed from: com.zing.zalo.zlottie.widget.a$d */
    /* loaded from: classes7.dex */
    public class d implements Runnable {
        d() {
        }

        /* renamed from: b */
        public /* synthetic */ void m92220b() {
            if (C17291a.this.f88065G == null) {
                return;
            }
            ZLottieJNI.m92126b(C17291a.this.f88081W, C17291a.this.f88098r, C17291a.this.f88099s);
            C17291a.f88057l0.post(C17291a.this.f88092h0);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!C17291a.this.f88080V && !C17291a.this.f88070L && C17291a.this.f88081W != 0) {
                C23874d.m124915i().m124921h().mo126933b(C17291a.this.f88065G = new Runnable() { // from class: com.zing.zalo.zlottie.widget.b
                    public /* synthetic */ RunnableC17292b() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C17291a.d.this.m92220b();
                    }
                });
            }
            C17291a.this.m92175I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zlottie.widget.a$e */
    /* loaded from: classes7.dex */
    public class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C17291a.this.f88080V) {
                return;
            }
            if (C17291a.this.f88081W == 0) {
                C17291a.f88057l0.post(C17291a.this.f88091g0);
                return;
            }
            if (C17291a.this.f88069K == null) {
                try {
                    C17291a c17291a = C17291a.this;
                    c17291a.f88069K = Bitmap.createBitmap(c17291a.f88098r, C17291a.this.f88099s, Bitmap.Config.ARGB_8888);
                } catch (Throwable unused) {
                }
            }
            if (C17291a.this.f88069K != null) {
                try {
                    if (ZLottieJNI.m92129e(C17291a.this.f88081W, C17291a.this.f88073O.get(), C17291a.this.f88069K, C17291a.this.f88098r, C17291a.this.f88099s, C17291a.this.f88069K.getRowBytes()) == -1) {
                        C17291a.f88057l0.post(C17291a.this.f88091g0);
                        return;
                    }
                    int i11 = 2;
                    boolean z11 = false;
                    if (C17291a.this.f88102v[2] != 0) {
                        C17291a.f88057l0.post(C17291a.this.f88094j0);
                        C17291a.this.f88102v[2] = 0;
                    }
                    C17291a c17291a2 = C17291a.this;
                    c17291a2.f88068J = c17291a2.f88069K;
                    if (C17291a.this.f88083Y) {
                        C17291a.this.f88064F = true;
                    } else {
                        if (!C17291a.this.f88074P) {
                            i11 = 1;
                        }
                        int i12 = i11 + C17291a.this.f88089e0;
                        if (C17291a.this.f88073O.get() + i12 < C17291a.this.f88102v[0]) {
                            C17291a.this.f88073O.set(C17291a.this.f88073O.get() + i12);
                            C17291a.this.f88064F = false;
                        } else if (C17291a.this.f88060B == g.INFINITE) {
                            C17291a.this.f88073O.set(0);
                            C17291a.this.f88064F = false;
                        } else if (C17291a.this.f88060B != g.LIMIT) {
                            C17291a.this.f88064F = true;
                        } else {
                            C17291a.this.f88073O.set(0);
                            C17291a.m92206v(C17291a.this);
                            C17291a c17291a3 = C17291a.this;
                            if (c17291a3.f88061C >= C17291a.this.f88062D) {
                                z11 = true;
                            }
                            c17291a3.f88064F = z11;
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            C17291a.f88057l0.post(C17291a.this.f88093i0);
        }
    }

    /* renamed from: com.zing.zalo.zlottie.widget.a$f */
    /* loaded from: classes7.dex */
    public interface f {
        /* renamed from: a */
        void mo55123a();

        /* renamed from: b */
        void mo55124b();
    }

    /* renamed from: com.zing.zalo.zlottie.widget.a$g */
    /* loaded from: classes7.dex */
    public enum g {
        DISABLE,
        INFINITE,
        LIMIT
    }

    /* renamed from: com.zing.zalo.zlottie.widget.a$h */
    /* loaded from: classes7.dex */
    public interface h {
        /* renamed from: a */
        void mo92221a();
    }

    static {
        AbstractC17288a.m92133c();
        f88057l0 = new Handler(Looper.getMainLooper());
        f88058m0 = new C24304b(4, AbstractC0837p0.m2224e());
    }

    private C17291a(String str, int i11, int i12, boolean z11, boolean z12) {
        this.f88102v = new int[5];
        this.f88104x = "";
        this.f88060B = g.INFINITE;
        this.f88062D = 1;
        this.f88073O = new AtomicInteger(0);
        this.f88075Q = 1.0f;
        this.f88076R = 1.0f;
        this.f88078T = new Rect();
        this.f88082X = false;
        this.f88083Y = false;
        this.f88086b0 = false;
        this.f88090f0 = false;
        this.f88091g0 = new a();
        this.f88092h0 = new b();
        this.f88093i0 = new c();
        this.f88094j0 = new d();
        this.f88095k0 = new e();
        m92185a0(str);
        this.f88096p = i11;
        this.f88097q = i12;
        this.f88074P = z12;
        this.f88105y = z11;
        this.f88104x = str;
    }

    /* renamed from: G */
    private void m92173G() {
        if (this.f88065G != null && C23874d.m124915i().m124921h().mo126932a(this.f88065G)) {
            this.f88065G = null;
        }
        if (this.f88068J != null && this.f88066H != null) {
            this.f88066H = null;
            this.f88068J = null;
        }
    }

    /* renamed from: H */
    private void m92174H() {
        Context appContext;
        String str;
        if (this.f88059A != null) {
            if (this.f88105y) {
                str = C23874d.m124915i().m124920g();
            } else {
                str = "";
            }
            this.f88081W = ZLottieJNI.m92125a(this.f88059A.getAbsolutePath(), this.f88104x, this.f88096p, this.f88097q, this.f88102v, this.f88105y, str, this.f88074P);
            return;
        }
        InputStream inputStream = this.f88106z;
        if (inputStream != null) {
            this.f88081W = ZLottieJNI.m92127c(AbstractC23880j.m124940g(inputStream), this.f88104x, this.f88102v, this.f88074P);
        } else if (this.f88088d0 != 0 && (appContext = CoreUtility.getAppContext()) != null) {
            this.f88081W = ZLottieJNI.m92127c(AbstractC23880j.m124940g(appContext.getResources().openRawResource(this.f88088d0)), this.f88104x, this.f88102v, this.f88074P);
        }
    }

    /* renamed from: I */
    public void m92175I() {
        if (this.f88070L) {
            m92173G();
            if (this.f88066H == null && this.f88065G == null && this.f88081W != 0) {
                ZLottieJNI.m92128d(this.f88081W);
                this.f88081W = 0L;
            }
        }
        if (this.f88081W == 0) {
            m92182Q();
        } else {
            m92183S();
        }
    }

    /* renamed from: J */
    private void m92176J() {
        f fVar = this.f88084Z;
        if (fVar != null) {
            fVar.mo55123a();
        }
    }

    /* renamed from: K */
    private void m92177K() {
        f fVar = this.f88084Z;
        if (fVar != null) {
            fVar.mo55124b();
        }
    }

    /* renamed from: L */
    private void m92178L() {
        if (this.f88087c0 == null) {
            Paint paint = new Paint();
            this.f88087c0 = paint;
            paint.setColor(-65536);
            this.f88087c0.setStyle(Paint.Style.STROKE);
            this.f88087c0.setStrokeWidth(8.0f);
        }
    }

    /* renamed from: M */
    private void m92179M() {
        if (this.f88081W != 0) {
            return;
        }
        m92174H();
        if (this.f88081W != 0) {
            m92181O();
        }
    }

    /* renamed from: N */
    public void m92180N() {
        if (getCallback() != null) {
            invalidateSelf();
        }
    }

    /* renamed from: O */
    private void m92181O() {
        int i11;
        Paint paint = getPaint();
        if (paint != null) {
            paint.setFlags(2);
        }
        if (this.f88074P && this.f88102v[1] < 60) {
            this.f88074P = false;
        }
        int[] iArr = this.f88102v;
        int i12 = iArr[3];
        this.f88100t = i12;
        int i13 = iArr[4];
        this.f88101u = i13;
        float f11 = i12 / i13;
        int i14 = this.f88096p;
        int i15 = this.f88097q;
        if (i14 < i15) {
            this.f88098r = i14;
            this.f88099s = (int) (this.f88098r / f11);
        } else {
            this.f88099s = i15;
            this.f88098r = (int) (this.f88099s * f11);
        }
        if (this.f88074P) {
            i11 = 33;
        } else {
            i11 = 16;
        }
        this.f88103w = Math.max(i11, (int) (1000.0f / this.f88102v[1]));
    }

    /* renamed from: Q */
    private void m92182Q() {
        if (this.f88067I != null) {
            this.f88067I.recycle();
            this.f88067I = null;
        }
        if (this.f88069K != null) {
            this.f88069K.recycle();
            this.f88069K = null;
        }
    }

    /* renamed from: S */
    private void m92183S() {
        if (this.f88066H == null && this.f88068J == null && this.f88081W != 0 && !this.f88070L) {
            if (!this.f88079U) {
                boolean z11 = this.f88071M;
                if (z11) {
                    if (z11 && this.f88072N) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (this.f88102v[0] != 1 || !this.f88072N) {
                InterfaceC24305c interfaceC24305c = f88058m0;
                Runnable runnable = this.f88095k0;
                this.f88066H = runnable;
                interfaceC24305c.mo126933b(runnable);
            }
        }
    }

    /* renamed from: W */
    private void m92184W(long j11, long j12, long j13) {
        if (!this.f88090f0) {
            int i11 = (int) ((j12 / j13) - 1);
            if (i11 >= 1) {
                if (this.f88074P) {
                    i11 *= 2;
                }
                this.f88089e0 = i11;
            } else {
                this.f88089e0 = 0;
            }
        } else {
            this.f88090f0 = false;
            this.f88089e0 = 0;
        }
        this.f88069K = this.f88067I;
        this.f88067I = this.f88068J;
        this.f88068J = null;
        if (this.f88064F) {
            stop();
        }
        this.f88066H = null;
        this.f88072N = true;
        this.f88063E = j11;
        m92183S();
    }

    /* renamed from: a0 */
    private void m92185a0(String str) {
        if (AbstractC23880j.m124939f(str)) {
        } else {
            throw new IllegalArgumentException("Unique name must only contains letters, numbers, underscores(\"_\"), points(\".\") and dashes(\"-\")");
        }
    }

    /* renamed from: v */
    static /* synthetic */ int m92206v(C17291a c17291a) {
        int i11 = c17291a.f88061C;
        c17291a.f88061C = i11 + 1;
        return i11;
    }

    /* renamed from: P */
    public void m92211P() {
        this.f88079U = false;
        this.f88082X = true;
        this.f88080V = true;
        m92173G();
        if (this.f88066H == null && this.f88065G == null) {
            if (this.f88081W != 0) {
                ZLottieJNI.m92128d(this.f88081W);
                this.f88081W = 0L;
            }
            m92182Q();
            return;
        }
        this.f88070L = true;
    }

    /* renamed from: R */
    public void m92212R() {
        this.f88073O.set(0);
        this.f88061C = 0;
        start();
    }

    /* renamed from: T */
    public void m92213T(boolean z11) {
        this.f88071M = z11;
        if (z11) {
            m92183S();
        }
    }

    /* renamed from: U */
    public void m92214U(f fVar) {
        this.f88084Z = fVar;
    }

    /* renamed from: V */
    public void m92215V(g gVar) {
        this.f88060B = gVar;
    }

    /* renamed from: X */
    public void m92216X(boolean z11) {
        this.f88086b0 = z11;
        m92180N();
    }

    /* renamed from: Y */
    public void m92217Y(int i11) {
        this.f88062D = i11;
    }

    /* renamed from: Z */
    public void m92218Z(h hVar) {
        this.f88085a0 = hVar;
        if (this.f88072N && hVar != null) {
            hVar.mo92221a();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f88081W != 0 && !this.f88070L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - this.f88063E);
            if (this.f88079U) {
                if (!this.f88083Y) {
                    if (this.f88067I == null && this.f88068J == null) {
                        m92183S();
                    } else if (this.f88068J != null && (this.f88067I == null || abs >= this.f88103w)) {
                        m92184W(elapsedRealtime, abs, this.f88103w);
                    }
                } else {
                    m92184W(elapsedRealtime, abs, this.f88103w);
                }
            } else if (this.f88071M && abs >= this.f88103w && this.f88068J != null) {
                m92184W(elapsedRealtime, abs, this.f88103w);
            }
            if (this.f88067I != null) {
                if (this.f88077S) {
                    this.f88078T.set(getBounds());
                    this.f88075Q = this.f88078T.width() / this.f88098r;
                    this.f88076R = this.f88078T.height() / this.f88099s;
                    this.f88077S = false;
                }
                canvas.save();
                Rect rect = this.f88078T;
                canvas.translate(rect.left, rect.top);
                canvas.scale(this.f88075Q, this.f88076R);
                canvas.drawBitmap(this.f88067I, 0.0f, 0.0f, getPaint());
                if (this.f88079U && (this.f88102v[0] > 1 || !this.f88072N)) {
                    m92180N();
                }
                canvas.restore();
            }
            if (this.f88086b0) {
                m92178L();
                canvas.drawRect(this.f88078T, this.f88087c0);
            }
        }
    }

    protected void finalize() {
        try {
            m92211P();
        } finally {
            super.finalize();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f88099s;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f88098r;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f88079U;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f88077S = true;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f88083Y = false;
        if (!this.f88079U) {
            if (this.f88060B != g.LIMIT || this.f88061C < this.f88062D) {
                this.f88090f0 = true;
                this.f88082X = false;
                this.f88079U = true;
                m92177K();
                m92183S();
                m92180N();
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f88079U = false;
        if (!this.f88082X) {
            this.f88082X = true;
            m92176J();
        }
    }

    public C17291a(File file, String str, int i11, int i12, boolean z11, boolean z12) {
        this(str, i11, i12, z11, z12);
        this.f88059A = file;
        m92179M();
    }

    public C17291a(InputStream inputStream, String str, int i11, int i12, boolean z11) {
        this(str, i11, i12, false, z11);
        this.f88106z = inputStream;
        m92179M();
    }

    public C17291a(int i11, String str, int i12, int i13, boolean z11) {
        this(str, i12, i13, false, z11);
        this.f88088d0 = i11;
        m92179M();
    }
}
