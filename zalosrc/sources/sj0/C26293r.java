package sj0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.zing.zalo.zinstant.AbstractC17158i1;
import com.zing.zalo.zinstant.exception.ZinstantException;
import com.zing.zalo.zinstant.utils.AbstractC17192d;
import com.zing.zalo.zinstant.utils.AbstractC17201m;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zinstant.zom.properties.ZOMBackground;
import com.zing.zalo.zinstant.zom.properties.ZOMConditionParam;
import com.zing.zalo.zinstant.zom.properties.ZOMConditional;
import com.zing.zalo.zinstant.zom.properties.ZOMValue;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import nk0.AbstractC23825g0;
import ok0.C24287d;
import ok0.InterfaceC24285b;
import ok0.InterfaceC24286c;
import ok0.InterfaceC24288e;
import pk0.InterfaceC24808g;
import sj0.AbstractC26278c;
import sj0.C26293r;
import tk0.C26730b;

/* renamed from: sj0.r */
/* loaded from: classes7.dex */
public class C26293r extends Drawable {

    /* renamed from: c0 */
    private static final int f124847c0 = (int) AbstractC17201m.m91828t(30.0f);

    /* renamed from: A */
    private final AtomicBoolean f124848A;

    /* renamed from: B */
    private final AtomicBoolean f124849B;

    /* renamed from: C */
    private final AtomicInteger f124850C;

    /* renamed from: D */
    private final Object f124851D;

    /* renamed from: E */
    private final Object f124852E;

    /* renamed from: F */
    private final AtomicBoolean f124853F;

    /* renamed from: G */
    private final Object f124854G;

    /* renamed from: H */
    private Drawable f124855H;

    /* renamed from: I */
    private final Drawable f124856I;

    /* renamed from: J */
    private final Drawable f124857J;

    /* renamed from: K */
    private C26279d f124858K;

    /* renamed from: L */
    private boolean f124859L;

    /* renamed from: M */
    private final AtomicInteger f124860M;

    /* renamed from: N */
    private int f124861N;

    /* renamed from: O */
    private int f124862O;

    /* renamed from: P */
    private final AbstractC23825g0 f124863P;

    /* renamed from: Q */
    private final ZOM f124864Q;

    /* renamed from: R */
    public boolean f124865R;

    /* renamed from: S */
    private boolean f124866S;

    /* renamed from: T */
    private InterfaceC24285b f124867T;

    /* renamed from: U */
    private int f124868U;

    /* renamed from: V */
    private final C26296u f124869V;

    /* renamed from: W */
    private final InterfaceC24288e f124870W;

    /* renamed from: X */
    private final InterfaceC24286c f124871X;

    /* renamed from: Y */
    private ZOMValue f124872Y;

    /* renamed from: Z */
    private ZOMValue f124873Z;

    /* renamed from: a */
    public Drawable f124874a;

    /* renamed from: a0 */
    private ZOMValue f124875a0;

    /* renamed from: b */
    int f124876b;

    /* renamed from: b0 */
    private ZOMValue f124877b0;

    /* renamed from: c */
    int f124878c;

    /* renamed from: e */
    C26276a f124880e;

    /* renamed from: f */
    Bitmap f124881f;

    /* renamed from: h */
    boolean f124883h;

    /* renamed from: i */
    Bitmap f124884i;

    /* renamed from: k */
    public ImageView.ScaleType f124886k;

    /* renamed from: l */
    private int f124887l;

    /* renamed from: m */
    public boolean f124888m;

    /* renamed from: n */
    public boolean f124889n;

    /* renamed from: o */
    public String f124890o;

    /* renamed from: p */
    private final boolean f124891p;

    /* renamed from: q */
    public int f124892q;

    /* renamed from: r */
    private int f124893r;

    /* renamed from: s */
    private int f124894s;

    /* renamed from: t */
    private boolean f124895t;

    /* renamed from: u */
    private boolean f124896u;

    /* renamed from: v */
    private boolean f124897v;

    /* renamed from: w */
    private int f124898w;

    /* renamed from: x */
    private Bitmap f124899x;

    /* renamed from: y */
    private final Rect f124900y;

    /* renamed from: z */
    private final Path f124901z;

    /* renamed from: d */
    String f124879d = C26293r.class.getSimpleName();

    /* renamed from: g */
    AtomicBoolean f124882g = new AtomicBoolean(true);

    /* renamed from: j */
    public int f124885j = 0;

    /* renamed from: sj0.r$a */
    /* loaded from: classes7.dex */
    class a implements InterfaceC24288e {
        a() {
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Bitmap bitmap) {
            try {
                synchronized (C26293r.this.f124851D) {
                    try {
                        int i11 = 0;
                        C26293r.this.f124848A.set(false);
                        if (C26293r.this.m135294K(bitmap)) {
                            return;
                        }
                        C26293r.this.f124860M.set(1);
                        C26293r.this.f124849B.set(true);
                        Bitmap bitmap2 = C26293r.this.f124881f;
                        if (bitmap2 != null && !bitmap2.isRecycled() && bitmap != null && !bitmap.isRecycled() && C26293r.this.f124881f.sameAs(bitmap)) {
                            return;
                        }
                        Bitmap bitmap3 = C26293r.this.f124881f;
                        Objects.requireNonNull(bitmap);
                        C26293r.this.f124881f = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                        C26293r c26293r = C26293r.this;
                        if (c26293r.f124885j != 1) {
                            c26293r.m135328s0(bitmap3);
                            C26293r.this.m135303Y();
                            C26293r.this.m135342W();
                        } else {
                            AbstractC26278c.b m135218d = AbstractC26278c.m135218d(c26293r.f124881f);
                            if (m135218d != null) {
                                if (m135218d.f124762a.size() > 0 && m135218d.f124763b.size() > 0) {
                                    i11 = AbstractC26278c.m135216b(bitmap.getWidth(), bitmap.getHeight(), m135218d);
                                }
                                C26293r.this.f124884i = AbstractC26278c.m135219e(bitmap, 1);
                                if (i11 > 0) {
                                    C26293r.this.f124874a = AbstractC26278c.m135215a(AbstractC17158i1.m91742a().getResources(), C26293r.this.f124884i, m135218d, i11);
                                }
                                if (C26293r.this.f124874a == null) {
                                    C26276a c26276a = new C26276a(C26293r.this.f124884i);
                                    C26293r c26293r2 = C26293r.this;
                                    c26293r2.f124874a = c26276a;
                                    ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                                    c26293r2.f124886k = scaleType;
                                    c26276a.m135182y(scaleType);
                                }
                                C26293r.this.m135342W();
                            }
                        }
                        C26293r c26293r3 = C26293r.this;
                        int i12 = c26293r3.f124892q;
                        if (i12 != 0) {
                            c26293r3.f124874a.setColorFilter(i12, PorterDuff.Mode.SRC_ATOP);
                        }
                        C26293r c26293r4 = C26293r.this;
                        c26293r4.f124874a.setAlpha(c26293r4.f124868U);
                    } finally {
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104543l(C26293r.this.f124879d).mo104552e(e11);
                C26293r.this.m135343a0();
                C26293r c26293r5 = C26293r.this;
                Bitmap bitmap4 = c26293r5.f124881f;
                if (c26293r5.f124874a == null) {
                    bitmap4.recycle();
                    C26293r.this.f124881f = null;
                }
            }
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            synchronized (C26293r.this.f124851D) {
                try {
                    if ((exc instanceof ZinstantException) && ((ZinstantException) exc).m91676a() == 500) {
                        C26293r.this.f124850C.decrementAndGet();
                    }
                    C26293r.this.f124848A.set(false);
                    C26293r.this.f124860M.set(-1);
                    C26293r.this.f124882g.set(true);
                    C26293r.this.m135309c0();
                    C26293r.this.m135342W();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: sj0.r$b */
    /* loaded from: classes7.dex */
    class b implements InterfaceC24286c {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ void m135364e(C24287d c24287d) {
            C26293r.m135334w0(c24287d.m126793a());
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            synchronized (C26293r.this.f124851D) {
                C26293r.this.f124848A.set(false);
                C26293r.this.f124860M.set(-1);
                C26293r.this.f124882g.set(true);
                C26293r.this.m135309c0();
                C26293r.this.m135342W();
            }
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final C24287d c24287d) {
            try {
                synchronized (C26293r.this.f124851D) {
                    try {
                        C26293r.this.f124848A.set(false);
                        C26293r.this.f124860M.set(1);
                        if (TextUtils.equals(c24287d.m126794b(), C26293r.this.f124890o) && !C26293r.this.f124849B.get()) {
                            C26293r.this.f124849B.set(true);
                            final InterfaceC24285b interfaceC24285b = C26293r.this.f124867T;
                            if (interfaceC24285b != null) {
                                AbstractC19444a.m101695c(new Runnable() { // from class: sj0.s
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C26293r.m135318j(InterfaceC24285b.this);
                                    }
                                });
                            }
                            C26293r.this.f124867T = c24287d.m126793a();
                            C26293r.this.f124874a = c24287d.m126793a().mo101823d();
                            C26293r c26293r = C26293r.this;
                            Bitmap bitmap = c26293r.f124881f;
                            C26276a c26276a = c26293r.f124880e;
                            if (c26276a != null && c26276a.m135178u() != bitmap) {
                                C26293r.this.m135307b0(bitmap);
                            }
                            C26293r c26293r2 = C26293r.this;
                            c26293r2.f124881f = null;
                            c26293r2.m135302X();
                            C26293r c26293r3 = C26293r.this;
                            int i11 = c26293r3.f124892q;
                            if (i11 != 0) {
                                c26293r3.f124874a.setColorFilter(i11, PorterDuff.Mode.SRC_ATOP);
                            }
                            C26293r c26293r4 = C26293r.this;
                            c26293r4.f124874a.setAlpha(c26293r4.f124868U);
                            C26293r.this.m135342W();
                        } else if (c24287d.m126793a() != C26293r.this.f124867T) {
                            AbstractC19444a.m101695c(new Runnable() { // from class: sj0.t
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C26293r.b.m135364e(C24287d.this);
                                }
                            });
                        }
                    } finally {
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104543l(C26293r.this.f124879d).mo104552e(e11);
                C26293r.this.m135343a0();
            }
        }
    }

    public C26293r(AbstractC23825g0 abstractC23825g0, boolean z11) {
        this.f124880e = null;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        this.f124886k = scaleType;
        this.f124887l = 1;
        this.f124888m = false;
        this.f124889n = true;
        this.f124890o = "";
        this.f124892q = 0;
        this.f124893r = 0;
        this.f124894s = 0;
        this.f124895t = false;
        this.f124896u = true;
        this.f124897v = true;
        this.f124898w = 0;
        this.f124899x = null;
        this.f124900y = new Rect();
        this.f124901z = new Path();
        this.f124848A = new AtomicBoolean(false);
        this.f124849B = new AtomicBoolean(false);
        this.f124850C = new AtomicInteger(0);
        this.f124851D = new Object();
        this.f124852E = new Object();
        this.f124853F = new AtomicBoolean(false);
        this.f124854G = new Object();
        this.f124855H = null;
        this.f124856I = AbstractC17158i1.m91744c();
        this.f124857J = AbstractC17158i1.m91743b();
        this.f124858K = null;
        this.f124859L = false;
        this.f124860M = new AtomicInteger(0);
        this.f124861N = f124847c0;
        this.f124862O = 0;
        this.f124865R = false;
        this.f124866S = false;
        this.f124868U = 255;
        this.f124870W = new a();
        this.f124871X = new b();
        this.f124872Y = null;
        this.f124873Z = null;
        this.f124875a0 = null;
        this.f124877b0 = null;
        this.f124863P = abstractC23825g0;
        ZOM m131007J = abstractC23825g0.m131007J();
        this.f124864Q = m131007J;
        if (this.f124880e == null) {
            C26276a c26276a = new C26276a(AbstractC17158i1.m91745d());
            this.f124880e = c26276a;
            float f11 = m131007J.mRadius;
            boolean[] zArr = m131007J.mCornersToggle;
            c26276a.m135234m(f11, zArr[0], zArr[1], zArr[2], zArr[3]);
            this.f124880e.m135182y(scaleType);
        }
        this.f124891p = z11;
        this.f124883h = m135293I(m131007J.mRadius, m131007J.mCornersToggle);
        this.f124869V = new C26296u();
    }

    /* renamed from: A */
    private void m135285A(Bitmap bitmap, ZOMBackground zOMBackground, Canvas canvas, boolean z11) {
        if (!z11 && Objects.equals(this.f124872Y, zOMBackground.mHorizontalPosition) && Objects.equals(this.f124873Z, zOMBackground.mVerticalPosition)) {
            canvas.translate(this.f124893r, this.f124894s);
            return;
        }
        ZOMValue zOMValue = zOMBackground.mHorizontalPosition;
        this.f124872Y = zOMValue;
        this.f124873Z = zOMBackground.mVerticalPosition;
        this.f124893r = 0;
        this.f124894s = 0;
        if (zOMValue != null) {
            int i11 = zOMValue.mType;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 4) {
                        this.f124893r = (int) m135335x(50.0f, bitmap.getWidth(), this.f124876b);
                    }
                } else {
                    this.f124893r = (int) zOMValue.mValue;
                }
            } else {
                this.f124893r = (int) m135335x(zOMValue.mValue, bitmap.getWidth(), this.f124876b);
            }
        }
        ZOMValue zOMValue2 = this.f124873Z;
        if (zOMValue2 != null) {
            int i12 = zOMValue2.mType;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 4) {
                        this.f124894s = (int) m135335x(50.0f, bitmap.getHeight(), this.f124878c);
                    }
                } else {
                    this.f124894s = (int) zOMValue2.mValue;
                }
            } else {
                this.f124894s = (int) m135335x(zOMValue2.mValue, bitmap.getHeight(), this.f124878c);
            }
        }
        canvas.translate(this.f124893r, this.f124894s);
        if (this.f124873Z != null || this.f124872Y != null) {
            this.f124895t = true;
        }
        this.f124897v = true;
    }

    /* renamed from: B */
    private Bitmap m135286B(C26276a c26276a, Bitmap bitmap, Canvas canvas, boolean z11) {
        int i11 = this.f124898w;
        Bitmap bitmap2 = null;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    c26276a.m135237q(tileMode);
                    c26276a.m135238r(tileMode);
                    if (!this.f124895t) {
                        this.f124900y.set(0, 0, this.f124876b, this.f124878c);
                    } else if (!this.f124883h) {
                        this.f124900y.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    } else {
                        canvas.translate(-this.f124893r, -this.f124894s);
                        if (z11 || this.f124897v) {
                            bitmap2 = m135327s(bitmap);
                            this.f124897v = false;
                        }
                        this.f124900y.set(0, 0, this.f124876b, this.f124878c);
                    }
                } else {
                    c26276a.m135238r(Shader.TileMode.REPEAT);
                    this.f124900y.set(0, -this.f124894s, bitmap.getWidth(), this.f124878c - this.f124894s);
                }
            } else {
                c26276a.m135237q(Shader.TileMode.REPEAT);
                Rect rect = this.f124900y;
                int i12 = this.f124893r;
                rect.set(-i12, 0, this.f124876b - i12, bitmap.getHeight());
            }
        } else {
            Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
            c26276a.m135237q(tileMode2);
            c26276a.m135238r(tileMode2);
            Rect rect2 = this.f124900y;
            int i13 = this.f124893r;
            int i14 = this.f124894s;
            rect2.set(-i13, -i14, this.f124876b - i13, this.f124878c - i14);
        }
        c26276a.setBounds(this.f124900y);
        return bitmap2;
    }

    /* renamed from: C */
    private Bitmap m135287C(Bitmap bitmap, ZOMBackground zOMBackground, boolean z11) {
        ZOMValue zOMValue;
        ZOMValue zOMValue2;
        ZOMValue zOMValue3;
        Bitmap bitmap2 = null;
        if (!z11 && Objects.equals(this.f124875a0, zOMBackground.mWidth) && Objects.equals(this.f124877b0, zOMBackground.mHeight)) {
            return null;
        }
        ZOMValue zOMValue4 = zOMBackground.mWidth;
        this.f124875a0 = zOMValue4;
        ZOMValue zOMValue5 = zOMBackground.mHeight;
        this.f124877b0 = zOMValue5;
        if (zOMValue4 == null && zOMValue5 == null) {
            return bitmap;
        }
        int m135333w = (int) m135333w(zOMValue4, this.f124876b);
        int m135333w2 = (int) m135333w(this.f124877b0, this.f124878c);
        ZOMValue zOMValue6 = this.f124875a0;
        if (zOMValue6 != null && (zOMValue3 = this.f124877b0) != null && zOMValue6.mType != 4 && zOMValue3.mType != 4) {
            bitmap2 = m135313e0(bitmap, m135333w, m135333w2);
        }
        ZOMValue zOMValue7 = this.f124875a0;
        if (zOMValue7 != null && zOMValue7.mType != 4 && ((zOMValue2 = this.f124877b0) == null || zOMValue2.mType == 4)) {
            bitmap2 = m135311d0(bitmap, m135333w(zOMValue7, this.f124876b) / bitmap.getWidth());
        }
        ZOMValue zOMValue8 = this.f124877b0;
        if (zOMValue8 != null && zOMValue8.mType != 4 && ((zOMValue = this.f124875a0) == null || zOMValue.mType == 4)) {
            bitmap2 = m135311d0(bitmap, m135333w(zOMValue8, this.f124878c) / bitmap.getHeight());
        }
        this.f124895t = true;
        this.f124897v = true;
        return bitmap2;
    }

    /* renamed from: D */
    private void m135288D(Canvas canvas, Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof C26282g) {
                C26282g c26282g = (C26282g) drawable;
                m135359z(drawable, this.f124885j);
                m135336y((C26276a) c26282g.m135248f(), canvas);
                m135336y((C26276a) c26282g.m135247e(), canvas);
                c26282g.setCallback(getCallback());
                c26282g.draw(canvas);
                return;
            }
            if (drawable instanceof C26276a) {
                m135359z(drawable, this.f124885j);
                m135336y((C26276a) drawable, canvas);
                drawable.draw(canvas);
            } else {
                if (drawable instanceof NinePatchDrawable) {
                    drawable.setBounds(0, 0, this.f124876b, this.f124878c);
                    drawable.draw(canvas);
                    return;
                }
                InterfaceC24285b interfaceC24285b = this.f124867T;
                if (interfaceC24285b != null && interfaceC24285b.mo101823d() == drawable) {
                    m135301V();
                    drawable.setBounds(0, 0, this.f124876b, this.f124878c);
                    drawable.draw(canvas);
                }
            }
        }
    }

    /* renamed from: E */
    private void m135289E(Canvas canvas) {
        float f11 = this.f124861N / 2.0f;
        if (this.f124857J != null) {
            canvas.save();
            canvas.translate((this.f124876b / 2.0f) - f11, (this.f124878c / 2.0f) - f11);
            Drawable drawable = this.f124857J;
            int i11 = this.f124861N;
            drawable.setBounds(0, 0, i11, i11);
            this.f124857J.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: F */
    private boolean m135290F(Canvas canvas) {
        Drawable drawable = this.f124855H;
        if (drawable == null) {
            return false;
        }
        drawable.setBounds(0, 0, this.f124876b, this.f124878c);
        m135359z(this.f124855H, this.f124885j);
        this.f124855H.draw(canvas);
        return true;
    }

    /* renamed from: G */
    private void m135291G(Canvas canvas) {
        int i11 = this.f124861N;
        float f11 = i11 / 2.0f;
        Drawable drawable = this.f124856I;
        if (drawable != null) {
            drawable.setBounds(0, 0, i11, i11);
            if (this.f124858K == null) {
                this.f124858K = new C26279d(this.f124856I);
            }
            canvas.save();
            canvas.translate((this.f124876b / 2.0f) - f11, (this.f124878c / 2.0f) - f11);
            this.f124858K.m135221a(canvas);
            canvas.restore();
            invalidateSelf();
        }
    }

    /* renamed from: H */
    private void m135292H(Canvas canvas) {
        C26276a c26276a = this.f124880e;
        if (c26276a != null) {
            m135359z(c26276a, 0);
            this.f124880e.setBounds(0, 0, this.f124876b, this.f124878c);
            this.f124880e.draw(canvas);
        }
    }

    /* renamed from: I */
    private boolean m135293I(float f11, boolean[] zArr) {
        if (f11 == 0.0f) {
            return false;
        }
        if (!zArr[0] && !zArr[1] && !zArr[2] && !zArr[3]) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public boolean m135294K(Object obj) {
        return obj == null;
    }

    /* renamed from: M */
    private boolean m135295M() {
        int i11 = this.f124885j;
        return i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void m135296N(InterfaceC24285b interfaceC24285b) {
        if (this.f124866S && interfaceC24285b != null) {
            m135331u0(interfaceC24285b, this.f124863P.m131031z());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public void m135298P() {
        boolean z11;
        int m91800b;
        boolean m124518x1;
        String str = this.f124890o;
        if (m135304Z(str)) {
            this.f124860M.set(1);
            return;
        }
        if (this.f124885j != 6 && !AbstractC17201m.m91821m(str)) {
            this.f124860M.set(-1);
            synchronized (this.f124851D) {
                m135309c0();
            }
            return;
        }
        if (this.f124885j == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            m91800b = 0;
        } else {
            m91800b = AbstractC17192d.m91800b(this.f124864Q.mWidth);
        }
        this.f124860M.set(0);
        this.f124849B.set(false);
        this.f124848A.set(true);
        int i11 = this.f124885j;
        if (i11 != 2 && i11 != 3 && i11 != 4 && i11 != 5) {
            if (i11 != 6) {
                m124518x1 = this.f124863P.m124519y1(str, this.f124870W, m91800b, z11);
            } else {
                m124518x1 = this.f124863P.m124520z1(i11, str, this.f124870W);
            }
        } else {
            m124518x1 = this.f124863P.m124518x1(i11, str, this.f124871X);
        }
        if (!m124518x1) {
            this.f124850C.decrementAndGet();
            this.f124860M.set(-1);
            this.f124848A.set(false);
            this.f124882g.set(true);
        }
    }

    /* renamed from: S */
    private void m135299S() {
        Drawable drawable = this.f124874a;
        if (drawable != null) {
            drawable.setAlpha(this.f124868U);
        }
        C26276a c26276a = this.f124880e;
        if (c26276a != null) {
            c26276a.setAlpha(this.f124868U);
        }
        Drawable drawable2 = this.f124855H;
        if (drawable2 != null) {
            drawable2.setAlpha(this.f124868U);
        }
    }

    /* renamed from: U */
    private int m135300U(int i11, int i12) {
        int alpha = Color.alpha(i11);
        int alpha2 = Color.alpha(i12);
        int m135332v = m135332v(Color.red(i11), Color.red(i12), alpha, alpha2);
        int m135332v2 = m135332v(Color.blue(i11), Color.blue(i12), alpha, alpha2);
        return Color.argb(m135330u(alpha, alpha2), m135332v, m135332v(Color.green(i11), Color.green(i12), alpha, alpha2), m135332v2);
    }

    /* renamed from: V */
    private void m135301V() {
        InterfaceC24285b interfaceC24285b = this.f124867T;
        if (interfaceC24285b != null && interfaceC24285b.mo101820a()) {
            m135302X();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public void m135302X() {
        final InterfaceC24285b interfaceC24285b = this.f124867T;
        AbstractC19444a.m101695c(new Runnable() { // from class: sj0.q
            @Override // java.lang.Runnable
            public final void run() {
                C26293r.this.m135296N(interfaceC24285b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public void m135303Y() {
        final InterfaceC24285b interfaceC24285b = this.f124867T;
        if (interfaceC24285b != null) {
            AbstractC19444a.m101695c(new Runnable() { // from class: sj0.o
                @Override // java.lang.Runnable
                public final void run() {
                    C26293r.m135334w0(InterfaceC24285b.this);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0060 A[Catch: all -> 0x004e, Exception -> 0x0097, TryCatch #0 {Exception -> 0x0097, blocks: (B:16:0x0023, B:18:0x0029, B:20:0x002c, B:22:0x0030, B:24:0x0034, B:26:0x0039, B:28:0x0043, B:33:0x0060, B:35:0x0064, B:36:0x0069, B:38:0x006d, B:39:0x0076, B:42:0x007a, B:44:0x007e, B:45:0x0083, B:52:0x0050), top: B:15:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094 A[SYNTHETIC] */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m135304Z(String str) {
        Object mo91642a;
        if (!TextUtils.isEmpty(str) && this.f124865R && this.f124855H == null && !this.f124853F.get() && !this.f124853F.get()) {
            synchronized (this.f124854G) {
                try {
                    try {
                        ZOMConditional[] zOMConditionalArr = this.f124864Q.mCondition;
                        if (zOMConditionalArr != null && zOMConditionalArr.length > 0) {
                            for (ZOMConditional zOMConditional : zOMConditionalArr) {
                                if (zOMConditional != null && zOMConditional.mType == 1) {
                                    ZOMConditionParam zOMConditionParam = (ZOMConditionParam) zOMConditional;
                                    C26730b m130997C = this.f124863P.m130997C();
                                    if (m130997C != null && !m130997C.m137486c(zOMConditionParam.action)) {
                                        mo91642a = null;
                                        if (mo91642a == null) {
                                            continue;
                                        } else {
                                            if (mo91642a instanceof Drawable) {
                                                this.f124855H = (Drawable) mo91642a;
                                            }
                                            if (mo91642a instanceof Bitmap) {
                                                this.f124855H = new C26276a((Bitmap) mo91642a);
                                            }
                                            Drawable drawable = this.f124855H;
                                            if (drawable != null) {
                                                int i11 = this.f124892q;
                                                if (i11 != 0) {
                                                    drawable.setColorFilter(i11, PorterDuff.Mode.SRC_ATOP);
                                                }
                                                this.f124855H.setAlpha(this.f124868U);
                                                this.f124853F.set(true);
                                                m135342W();
                                                return true;
                                            }
                                        }
                                    }
                                    mo91642a = this.f124863P.m131030y().mo91642a(zOMConditionParam.action, zOMConditionParam.data, str);
                                    if (mo91642a == null) {
                                    }
                                }
                            }
                        }
                    } finally {
                    }
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public void m135307b0(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public void m135309c0() {
        this.f124874a = null;
        this.f124867T = null;
        m135307b0(this.f124881f);
        this.f124881f = null;
        this.f124869V.m135369d(null, this.f124860M.get());
    }

    /* renamed from: d0 */
    private Bitmap m135311d0(Bitmap bitmap, float f11) {
        return m135313e0(bitmap, bitmap.getWidth() * f11, bitmap.getHeight() * f11);
    }

    /* renamed from: e0 */
    private Bitmap m135313e0(Bitmap bitmap, float f11, float f12) {
        return Bitmap.createScaledBitmap(bitmap, (int) f11, (int) f12, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static /* synthetic */ void m135318j(InterfaceC24285b interfaceC24285b) {
        m135334w0(interfaceC24285b);
    }

    /* renamed from: s */
    private Bitmap m135327s(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(this.f124876b, this.f124878c, bitmap.getConfig());
        new Canvas(createBitmap).drawBitmap(bitmap, this.f124893r, this.f124894s, (Paint) null);
        return createBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public void m135328s0(Bitmap bitmap) {
        C26276a c26276a;
        if (this.f124887l == 0) {
            this.f124874a = new C26276a(this.f124881f);
            return;
        }
        if (bitmap != null && this.f124889n) {
            c26276a = this.f124869V.m135367b();
        } else {
            if (!this.f124888m) {
                this.f124874a = new C26282g(null, new C26276a(this.f124881f));
                return;
            }
            C26276a c26276a2 = new C26276a(this.f124880e.m135178u().copy(Bitmap.Config.ARGB_8888, false));
            ZOM zom = this.f124864Q;
            float f11 = zom.mRadius;
            boolean[] zArr = zom.mCornersToggle;
            c26276a2.m135234m(f11, zArr[0], zArr[1], zArr[2], zArr[3]);
            c26276a2.m135182y(ImageView.ScaleType.CENTER_CROP);
            c26276a = c26276a2;
        }
        C26276a c26276a3 = new C26276a(this.f124881f);
        c26276a3.m135182y(this.f124886k);
        ZOM zom2 = this.f124864Q;
        float f12 = zom2.mRadius;
        boolean[] zArr2 = zom2.mCornersToggle;
        c26276a3.m135234m(f12, zArr2[0], zArr2[1], zArr2[2], zArr2[3]);
        this.f124874a = new C26282g(c26276a, c26276a3);
    }

    /* renamed from: t */
    private void m135329t(Canvas canvas) {
        this.f124901z.reset();
        ZOM zom = this.f124864Q;
        int i11 = ((int) zom.mRadius) >> 1;
        boolean[] zArr = zom.mCornersToggle;
        boolean z11 = zArr[0];
        if (z11 && zArr[1] && zArr[2] && zArr[3]) {
            float f11 = i11 * 2;
            this.f124901z.addRoundRect(0.0f, 0.0f, this.f124876b, this.f124878c, f11, f11, Path.Direction.CW);
        } else {
            if (z11) {
                float f12 = i11;
                this.f124901z.moveTo(0.0f, f12);
                this.f124901z.quadTo(0.0f, 0.0f, f12, 0.0f);
            } else {
                this.f124901z.moveTo(0.0f, 0.0f);
            }
            if (this.f124864Q.mCornersToggle[1]) {
                this.f124901z.lineTo(this.f124876b - i11, 0.0f);
                Path path = this.f124901z;
                int i12 = this.f124876b;
                path.quadTo(i12, 0.0f, i12, i11);
            } else {
                this.f124901z.lineTo(this.f124876b, 0.0f);
            }
            if (this.f124864Q.mCornersToggle[2]) {
                this.f124901z.lineTo(this.f124876b, this.f124878c - i11);
                Path path2 = this.f124901z;
                int i13 = this.f124876b;
                int i14 = this.f124878c;
                path2.quadTo(i13, i14, i13 - i11, i14);
            } else {
                this.f124901z.lineTo(this.f124876b, this.f124878c);
            }
            if (this.f124864Q.mCornersToggle[3]) {
                this.f124901z.lineTo(i11, this.f124878c);
                this.f124901z.quadTo(0.0f, this.f124878c, 0.0f, r5 - i11);
            } else {
                this.f124901z.lineTo(0.0f, this.f124878c);
            }
            if (this.f124864Q.mCornersToggle[0]) {
                this.f124901z.lineTo(0.0f, i11);
            } else {
                this.f124901z.lineTo(0.0f, 0.0f);
            }
        }
        canvas.clipPath(this.f124901z);
    }

    /* renamed from: u */
    private int m135330u(int i11, int i12) {
        float f11 = i12 / 255.0f;
        return (int) ((f11 + ((i11 / 255.0f) * (1.0f - f11))) * 255.0f);
    }

    /* renamed from: u0 */
    private static void m135331u0(InterfaceC24285b interfaceC24285b, Drawable.Callback callback) {
        if (interfaceC24285b.mo101823d().getCallback() != callback) {
            interfaceC24285b.mo101821b();
            interfaceC24285b.mo101823d().setCallback(callback);
        }
        if (interfaceC24285b.mo101820a()) {
            interfaceC24285b.mo101822c();
        }
    }

    /* renamed from: v */
    private int m135332v(int i11, int i12, int i13, int i14) {
        float f11 = i13 / 255.0f;
        float f12 = i14 / 255.0f;
        float f13 = 1.0f - f12;
        return (int) (((i12 * f12) + ((i11 * f11) * f13)) / (f12 + (f11 * f13)));
    }

    /* renamed from: w */
    private float m135333w(ZOMValue zOMValue, float f11) {
        if (zOMValue == null) {
            return 1.0f;
        }
        int i11 = zOMValue.mType;
        float f12 = zOMValue.mValue;
        if (i11 == 0) {
            return (f12 * f11) / 100.0f;
        }
        return f12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public static void m135334w0(InterfaceC24285b interfaceC24285b) {
        if (!interfaceC24285b.mo101820a()) {
            interfaceC24285b.mo101821b();
        }
        interfaceC24285b.mo101823d().setCallback(null);
    }

    /* renamed from: x */
    private float m135335x(float f11, float f12, float f13) {
        return ((f13 - f12) * f11) / 100.0f;
    }

    /* renamed from: y */
    private void m135336y(C26276a c26276a, Canvas canvas) {
        Bitmap bitmap;
        if (c26276a == null) {
            return;
        }
        if (this.f124891p) {
            ZOMBackground zOMBackground = this.f124864Q.mBackground;
            Bitmap bitmap2 = this.f124881f;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                Bitmap m135178u = c26276a.m135178u();
                Bitmap m135287C = m135287C(this.f124881f, zOMBackground, this.f124896u);
                if (m135287C == null) {
                    m135287C = m135178u;
                }
                if (m135287C != null && !m135287C.isRecycled()) {
                    m135285A(m135287C, zOMBackground, canvas, this.f124896u);
                    Bitmap m135286B = m135286B(c26276a, m135287C, canvas, this.f124896u);
                    this.f124896u = false;
                    if (m135286B != null) {
                        if (m135287C != m135178u) {
                            m135307b0(m135287C);
                        }
                        Bitmap bitmap3 = this.f124899x;
                        if (m135178u == bitmap3) {
                            m135307b0(bitmap3);
                        }
                        this.f124899x = m135286B;
                        c26276a.m135181x(m135286B);
                        return;
                    }
                    if (m135287C != m135178u && (bitmap = this.f124899x) != m135287C) {
                        m135307b0(bitmap);
                        this.f124899x = m135287C;
                        c26276a.m135181x(m135287C);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        c26276a.setBounds(0, 0, this.f124876b, this.f124878c);
    }

    /* renamed from: J */
    public Drawable m135337J() {
        return this;
    }

    /* renamed from: L */
    public void m135338L(int i11, String str, ImageView.ScaleType scaleType, boolean z11, int i12, int i13, boolean z12, int i14, boolean z13, boolean z14) {
        m135353o0(str);
        m135347i0(i11);
        m135352n0(scaleType);
        m135348j0(z11);
        m135355q0(i12);
        m135351m0(i13);
        m135349k0(z12);
        m135356r0(i14);
        m135350l0(z13);
        m135346h0(z14);
        if (this.f124859L && this.f124856I != null && this.f124857J != null) {
            ZOM zom = this.f124864Q;
            m135354p0(Math.min(Math.min(zom.mWidth, zom.mHeight), f124847c0));
        }
        this.f124850C.set(0);
    }

    /* renamed from: Q */
    public void m135339Q() {
        if (!m135340R()) {
            return;
        }
        if (this.f124865R && this.f124855H != null && this.f124853F.get()) {
            return;
        }
        if (!this.f124865R && TextUtils.equals(this.f124890o, ".")) {
            this.f124860M.set(-1);
            synchronized (this.f124851D) {
                m135309c0();
            }
            return;
        }
        if (this.f124850C.get() > this.f124863P.m130999D().mo128872d()) {
            return;
        }
        this.f124850C.getAndIncrement();
        if (!this.f124889n) {
            synchronized (this.f124851D) {
                m135309c0();
            }
        }
        this.f124882g.set(false);
        this.f124863P.m131028w().m116441l(new Runnable() { // from class: sj0.p
            @Override // java.lang.Runnable
            public final void run() {
                C26293r.this.m135298P();
            }
        }, Integer.valueOf(hashCode()));
    }

    /* renamed from: R */
    public boolean m135340R() {
        if ((this.f124874a != null || this.f124848A.get()) && !this.f124882g.get() && (!m135295M() || this.f124867T != null || this.f124848A.get())) {
            return false;
        }
        return true;
    }

    /* renamed from: T */
    public void m135341T() {
        this.f124850C.set(0);
    }

    /* renamed from: W */
    protected void m135342W() {
        Drawable.Callback callback = getCallback();
        if (callback instanceof InterfaceC24808g) {
            ((InterfaceC24808g) callback).postInvalidate();
        }
    }

    /* renamed from: a0 */
    public void m135343a0() {
        synchronized (this.f124851D) {
            try {
                Bitmap bitmap = this.f124884i;
                if (bitmap != null && !bitmap.isRecycled()) {
                    this.f124884i.recycle();
                    this.f124884i = null;
                }
                Bitmap bitmap2 = this.f124899x;
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    this.f124899x.recycle();
                }
                m135303Y();
                this.f124867T = null;
                this.f124899x = null;
                this.f124848A.set(false);
                this.f124849B.set(false);
                this.f124895t = false;
                this.f124896u = true;
                this.f124882g.set(true);
                this.f124850C.set(0);
            } finally {
            }
        }
        synchronized (this.f124854G) {
            try {
                this.f124853F.set(false);
                Drawable drawable = this.f124855H;
                if (drawable instanceof C26276a) {
                    ((C26276a) drawable).m135180w();
                }
                this.f124855H = null;
            } finally {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Integer num = null;
        try {
            synchronized (this.f124851D) {
                try {
                    num = Integer.valueOf(canvas.save());
                    m135329t(canvas);
                    Drawable drawable = this.f124874a;
                    if (drawable == null) {
                        if (this.f124889n && this.f124860M.get() == 0) {
                            int m135368c = this.f124869V.m135368c();
                            if (m135368c != -1) {
                                if (m135368c != 0) {
                                    m135288D(canvas, this.f124869V.m135366a());
                                } else {
                                    if (this.f124888m) {
                                        m135292H(canvas);
                                    }
                                    if (this.f124859L) {
                                        m135291G(canvas);
                                    }
                                }
                            } else {
                                if (this.f124888m) {
                                    m135292H(canvas);
                                }
                                if (this.f124859L) {
                                    m135289E(canvas);
                                }
                            }
                        } else if (!m135290F(canvas)) {
                            if (this.f124888m) {
                                m135292H(canvas);
                            }
                            if (this.f124859L) {
                                if (this.f124860M.get() == 0) {
                                    m135291G(canvas);
                                } else if (this.f124860M.get() == -1) {
                                    m135289E(canvas);
                                }
                            }
                        }
                    } else {
                        m135288D(canvas, drawable);
                    }
                    canvas.restore();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104543l(this.f124879d).mo104552e(e11);
            if (num != null) {
                canvas.restoreToCount(num.intValue());
            }
        }
    }

    /* renamed from: f0 */
    public void m135344f0(int i11) {
        if (this.f124874a != null) {
            synchronized (this.f124852E) {
                try {
                    this.f124862O = i11;
                    int i12 = this.f124892q;
                    if (i12 != 0) {
                        this.f124874a.setColorFilter(m135300U(i12, i11), PorterDuff.Mode.SRC_ATOP);
                    } else {
                        this.f124874a.setColorFilter(i11, PorterDuff.Mode.SRC_ATOP);
                    }
                } finally {
                }
            }
        }
        if (this.f124855H != null) {
            synchronized (this.f124852E) {
                try {
                    this.f124862O = i11;
                    int i13 = this.f124892q;
                    if (i13 != 0) {
                        this.f124855H.setColorFilter(m135300U(i13, i11), PorterDuff.Mode.SRC_ATOP);
                    } else {
                        this.f124855H.setColorFilter(i11, PorterDuff.Mode.SRC_ATOP);
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: g0 */
    public void m135345g0(int i11, String str, ImageView.ScaleType scaleType, boolean z11, int i12, int i13, boolean z12, int i14, boolean z13, boolean z14) {
        m135338L(i11, str, scaleType, z11, i12, i13, z12, i14, z13, z14);
        m135339Q();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f124874a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return 0;
    }

    /* renamed from: h0 */
    void m135346h0(boolean z11) {
        this.f124865R = z11;
    }

    /* renamed from: i0 */
    void m135347i0(int i11) {
        if (this.f124885j == i11) {
            return;
        }
        this.f124885j = i11;
        this.f124882g.set(true);
    }

    /* renamed from: j0 */
    void m135348j0(boolean z11) {
        if (this.f124888m == z11) {
            return;
        }
        this.f124888m = z11;
        this.f124882g.set(true);
    }

    /* renamed from: k0 */
    void m135349k0(boolean z11) {
        if (this.f124859L == z11) {
            return;
        }
        this.f124859L = z11;
    }

    /* renamed from: l0 */
    void m135350l0(boolean z11) {
        if (this.f124889n == z11) {
            return;
        }
        this.f124889n = z11;
    }

    /* renamed from: m0 */
    void m135351m0(int i11) {
        if (this.f124898w == i11) {
            return;
        }
        this.f124898w = i11;
    }

    /* renamed from: n0 */
    void m135352n0(ImageView.ScaleType scaleType) {
        if (this.f124886k == scaleType || this.f124885j == 1) {
            return;
        }
        this.f124886k = scaleType;
    }

    /* renamed from: o0 */
    void m135353o0(String str) {
        String str2 = this.f124890o;
        if (str2 == null && str == null) {
            return;
        }
        if (str2 != null && str2.equals(str)) {
            return;
        }
        this.f124890o = str;
        this.f124882g.set(true);
        this.f124869V.m135369d(this.f124874a, this.f124860M.get());
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f124876b = rect.width();
        this.f124878c = rect.height();
    }

    /* renamed from: p0 */
    void m135354p0(int i11) {
        if (this.f124861N == i11) {
            return;
        }
        this.f124861N = i11;
    }

    /* renamed from: q0 */
    void m135355q0(int i11) {
        if (this.f124892q == i11) {
            return;
        }
        synchronized (this.f124852E) {
            this.f124892q = i11;
            m135344f0(this.f124862O);
        }
    }

    /* renamed from: r0 */
    void m135356r0(int i11) {
        if (this.f124887l == i11) {
            return;
        }
        this.f124887l = i11;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (this.f124868U != i11) {
            this.f124868U = i11;
            m135299S();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f124874a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f124855H;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    /* renamed from: t0 */
    public void m135357t0() {
        if (this.f124866S) {
            return;
        }
        this.f124866S = true;
        InterfaceC24285b interfaceC24285b = this.f124867T;
        if (interfaceC24285b != null) {
            m135331u0(interfaceC24285b, this.f124863P.m131031z());
        }
    }

    /* renamed from: v0 */
    public void m135358v0() {
        if (!this.f124866S) {
            return;
        }
        this.f124866S = false;
        InterfaceC24285b interfaceC24285b = this.f124867T;
        if (interfaceC24285b != null) {
            m135334w0(interfaceC24285b);
        }
    }

    /* renamed from: z */
    void m135359z(Drawable drawable, int i11) {
        if (drawable instanceof C26276a) {
            if (i11 != 1) {
                ((C26276a) drawable).m135182y(this.f124886k);
            }
            C26276a c26276a = (C26276a) drawable;
            ZOM zom = this.f124864Q;
            float f11 = zom.mRadius;
            boolean[] zArr = zom.mCornersToggle;
            c26276a.m135234m(f11, zArr[0], zArr[1], zArr[2], zArr[3]);
            return;
        }
        if (drawable instanceof C26282g) {
            C26282g c26282g = (C26282g) drawable;
            Drawable m135248f = c26282g.m135248f();
            Drawable m135247e = c26282g.m135247e();
            m135359z(m135248f, 0);
            m135359z(m135247e, 0);
        }
    }
}
