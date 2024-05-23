package wa0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import bi0.AbstractC2808b;
import com.zing.zalo.uidrawing.C16719g;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;

/* renamed from: wa0.y */
/* loaded from: classes6.dex */
public final class C28899y {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C16719g f133777a;

    /* renamed from: b */
    private int f133778b;

    /* renamed from: c */
    private int f133779c;

    /* renamed from: d */
    private int f133780d;

    /* renamed from: e */
    private int f133781e;

    /* renamed from: f */
    private int f133782f;

    /* renamed from: g */
    private boolean f133783g;

    /* renamed from: h */
    private RectF[] f133784h;

    /* renamed from: i */
    private Handler f133785i;

    /* renamed from: j */
    private Runnable f133786j;

    /* renamed from: k */
    private int f133787k;

    /* renamed from: l */
    private int f133788l;

    /* renamed from: m */
    private int f133789m;

    /* renamed from: n */
    private int[] f133790n;

    /* renamed from: o */
    private boolean[] f133791o;

    /* renamed from: p */
    private Paint f133792p;

    /* renamed from: wa0.y$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C28899y(C16719g c16719g) {
        AbstractC19074t.m100208f(c16719g, "parentView");
        this.f133777a = c16719g;
        this.f133778b = AbstractC23136l9.m118742r(0.0f);
        int m118742r = AbstractC23136l9.m118742r(28.0f);
        this.f133779c = m118742r;
        this.f133780d = m118742r - AbstractC23136l9.m118742r(6.0f);
        this.f133781e = AbstractC23136l9.m118742r(5.0f);
        this.f133782f = AbstractC23136l9.m118742r(2.0f);
        this.f133784h = new RectF[3];
        this.f133790n = new int[3];
        this.f133791o = new boolean[3];
        this.f133787k = AbstractC23136l9.m118742r(5.0f);
        this.f133788l = this.f133778b + AbstractC23136l9.m118742r(10.0f);
        this.f133789m = this.f133779c - AbstractC23136l9.m118742r(3.0f);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(AbstractC23136l9.m118639A(AbstractC2808b.f150821b60));
        this.f133792p = paint;
        this.f133783g = false;
        this.f133785i = new Handler(Looper.getMainLooper());
        this.f133786j = new Runnable() { // from class: wa0.x
            @Override // java.lang.Runnable
            public final void run() {
                C28899y.m144348b(C28899y.this);
            }
        };
        c16719g.invalidate();
        m144349d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m144348b(C28899y c28899y) {
        Handler handler;
        AbstractC19074t.m100208f(c28899y, "this$0");
        try {
            c28899y.m144352i();
            c28899y.f133777a.invalidate();
            Runnable runnable = c28899y.f133786j;
            if (runnable != null && (handler = c28899y.f133785i) != null) {
                handler.postDelayed(runnable, 7L);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLToolStorageVoicePlayer", e11);
        }
    }

    /* renamed from: d */
    private final void m144349d() {
        this.f133790n = r1;
        int[] iArr = {AbstractC23136l9.m118742r(12.0f)};
        this.f133790n[1] = AbstractC23136l9.m118742r(5.0f);
        this.f133790n[2] = AbstractC23136l9.m118742r(18.0f);
        this.f133791o = r1;
        boolean[] zArr = {false, true, false};
        this.f133784h = new RectF[3];
        for (int i11 = 0; i11 < 3; i11++) {
            this.f133784h[i11] = new RectF((this.f133787k + AbstractC23136l9.m118742r(2.0f)) * i11, this.f133789m - this.f133790n[i11], this.f133788l + ((this.f133787k + AbstractC23136l9.m118742r(2.0f)) * i11) + this.f133787k, this.f133789m);
        }
    }

    /* renamed from: f */
    private final void m144350f() {
        Handler handler;
        Runnable runnable = this.f133786j;
        if (runnable != null && (handler = this.f133785i) != null) {
            handler.postDelayed(runnable, 7L);
        }
    }

    /* renamed from: h */
    private final void m144351h() {
        Handler handler;
        Runnable runnable = this.f133786j;
        if (runnable != null && (handler = this.f133785i) != null) {
            handler.removeCallbacks(runnable);
        }
    }

    /* renamed from: i */
    private final void m144352i() {
        int length = this.f133790n.length;
        for (int i11 = 0; i11 < length; i11++) {
            boolean[] zArr = this.f133791o;
            if (zArr[i11]) {
                int[] iArr = this.f133790n;
                int i12 = iArr[i11] + 1;
                iArr[i11] = i12;
                if (i12 == this.f133780d) {
                    zArr[i11] = false;
                }
            } else {
                int[] iArr2 = this.f133790n;
                int i13 = iArr2[i11] - 1;
                iArr2[i11] = i13;
                if (i13 == this.f133781e) {
                    zArr[i11] = true;
                }
            }
        }
    }

    /* renamed from: c */
    public final void m144353c(Canvas canvas) {
        int length = this.f133790n.length;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < length; i11++) {
            RectF rectF = this.f133784h[i11];
            if (rectF != null) {
                rectF.set(f11, r4 - this.f133790n[i11], this.f133787k + f11, this.f133789m);
            }
            f11 += AbstractC23136l9.m118742r(2.0f) + this.f133787k;
            RectF rectF2 = this.f133784h[i11];
            if (rectF2 != null && canvas != null) {
                int i12 = this.f133782f;
                canvas.drawRoundRect(rectF2, i12, i12, this.f133792p);
            }
        }
    }

    /* renamed from: e */
    public final void m144354e() {
        Handler handler;
        if (!this.f133783g) {
            this.f133783g = true;
            Runnable runnable = this.f133786j;
            if (runnable != null && (handler = this.f133785i) != null) {
                handler.removeCallbacks(runnable);
            }
            m144350f();
        }
    }

    /* renamed from: g */
    public final void m144355g() {
        this.f133783g = false;
        m144351h();
        m144349d();
    }
}
