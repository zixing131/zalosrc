package y60;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.AbstractC1409d;
import com.zing.zalo.AbstractC16781w;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* renamed from: y60.a */
/* loaded from: classes5.dex */
public class C30799a extends Drawable {

    /* renamed from: A */
    private static final int f142168A = AbstractC23136l9.m118742r(0.5f);

    /* renamed from: B */
    private static final int f142169B = AbstractC23136l9.m118742r(2.0f);

    /* renamed from: C */
    private static final float f142170C;

    /* renamed from: D */
    private static final float[] f142171D;

    /* renamed from: E */
    public static final float[] f142172E;

    /* renamed from: F */
    private static final float[] f142173F;

    /* renamed from: G */
    private static int f142174G;

    /* renamed from: H */
    private static int f142175H;

    /* renamed from: I */
    private static int f142176I;

    /* renamed from: J */
    private static int f142177J;

    /* renamed from: K */
    private static int f142178K;

    /* renamed from: L */
    private static int f142179L;

    /* renamed from: M */
    private static int f142180M;

    /* renamed from: N */
    private static int f142181N;

    /* renamed from: O */
    private static int f142182O;

    /* renamed from: P */
    private static int f142183P;

    /* renamed from: Q */
    private static int f142184Q;

    /* renamed from: R */
    private static int f142185R;

    /* renamed from: S */
    private static int f142186S;

    /* renamed from: T */
    private static int f142187T;

    /* renamed from: U */
    private static int f142188U;

    /* renamed from: V */
    private static int f142189V;

    /* renamed from: W */
    private static int f142190W;

    /* renamed from: X */
    private static int f142191X;

    /* renamed from: Y */
    private static int f142192Y;

    /* renamed from: Z */
    private static int f142193Z;

    /* renamed from: a0 */
    private static int f142194a0;

    /* renamed from: b0 */
    private static int f142195b0;

    /* renamed from: c0 */
    private static int f142196c0;

    /* renamed from: d0 */
    private static int f142197d0;

    /* renamed from: e0 */
    private static int f142198e0;

    /* renamed from: f0 */
    private static int f142199f0;

    /* renamed from: g0 */
    private static int f142200g0;

    /* renamed from: h0 */
    private static int f142201h0;

    /* renamed from: i0 */
    private static int f142202i0;

    /* renamed from: g */
    private float[] f142209g;

    /* renamed from: h */
    private float[] f142210h;

    /* renamed from: i */
    private float[] f142211i;

    /* renamed from: j */
    private final RectF f142212j;

    /* renamed from: k */
    private final RectF f142213k;

    /* renamed from: l */
    private final RectF f142214l;

    /* renamed from: m */
    private DashPathEffect f142215m;

    /* renamed from: r */
    private float f142220r;

    /* renamed from: t */
    private float f142222t;

    /* renamed from: u */
    private boolean f142223u;

    /* renamed from: w */
    private boolean f142225w;

    /* renamed from: x */
    private int f142226x;

    /* renamed from: y */
    private int f142227y;

    /* renamed from: z */
    private boolean f142228z;

    /* renamed from: a */
    private final Paint f142203a = new Paint(1);

    /* renamed from: b */
    private final Path f142204b = new Path();

    /* renamed from: c */
    private final Path f142205c = new Path();

    /* renamed from: e */
    private final Path f142207e = new Path();

    /* renamed from: f */
    private final Path f142208f = new Path();

    /* renamed from: d */
    private final Path f142206d = new Path();

    /* renamed from: n */
    private int f142216n = -1;

    /* renamed from: o */
    private int f142217o = -1;

    /* renamed from: p */
    private int f142218p = -1;

    /* renamed from: q */
    private int f142219q = -1;

    /* renamed from: s */
    private int f142221s = -1;

    /* renamed from: v */
    private int f142224v = -1;

    static {
        float m118742r = AbstractC23136l9.m118742r(10.0f);
        f142170C = m118742r;
        f142171D = new float[]{m118742r, m118742r, m118742r, m118742r, m118742r, m118742r, m118742r, m118742r};
        f142172E = new float[]{m118742r, m118742r, m118742r, m118742r, 0.0f, 0.0f, 0.0f, 0.0f};
        f142173F = new float[]{0.0f, 0.0f, 0.0f, 0.0f, m118742r, m118742r, m118742r, m118742r};
        f142174G = -1;
        f142175H = -1;
        f142176I = -1;
        f142177J = -1;
        f142178K = -1;
        f142179L = -1;
        f142180M = -1;
        f142181N = -1;
        f142182O = -1;
        f142183P = -1;
        f142184Q = -1;
        f142185R = -1;
        f142186S = -1;
        f142187T = -1;
        f142188U = -1;
        f142189V = -1;
        f142190W = -1;
        f142191X = -1;
        f142192Y = -1;
        f142193Z = -1;
        f142194a0 = -1;
        f142195b0 = -1;
        f142196c0 = -1;
        f142197d0 = -1;
        f142198e0 = -1;
        f142199f0 = -1;
        f142200g0 = -1;
        f142201h0 = -1;
        f142202i0 = -1;
    }

    public C30799a() {
        float[] fArr = f142171D;
        this.f142209g = fArr;
        this.f142210h = fArr;
        this.f142211i = fArr;
        this.f142212j = new RectF();
        this.f142213k = new RectF();
        this.f142214l = new RectF();
        this.f142220r = 0.0f;
        this.f142222t = 0.0f;
        this.f142228z = false;
    }

    /* renamed from: b */
    public static void m149844b() {
        f142174G = -1;
        f142175H = -1;
        f142176I = -1;
        f142177J = -1;
        f142178K = -1;
        f142179L = -1;
        f142180M = -1;
        f142183P = -1;
        f142184Q = -1;
        f142181N = -1;
        f142182O = -1;
        f142185R = -1;
        f142186S = -1;
        f142187T = -1;
        f142188U = -1;
    }

    /* renamed from: d */
    private void m149845d() {
        if (f142179L == -1) {
            int m119606n = C23212s8.m119606n(AbstractC16781w.ReceiverBubbleChatAdmin);
            f142179L = m119606n;
            f142199f0 = AbstractC1409d.m7147p(m119606n, (Color.alpha(m119606n) * 20) / 100);
        }
        if (f142180M == -1) {
            int m119606n2 = C23212s8.m119606n(AbstractC16781w.ReceiverBubbleChatBorderAdmin);
            f142180M = m119606n2;
            f142200g0 = AbstractC1409d.m7147p(m119606n2, (Color.alpha(m119606n2) * 20) / 100);
        }
    }

    /* renamed from: e */
    private void m149846e() {
        if (f142177J == -1) {
            int m119606n = C23212s8.m119606n(AbstractC16781w.SenderBubbleChatAdmin);
            f142177J = m119606n;
            f142201h0 = AbstractC1409d.m7147p(m119606n, (Color.alpha(m119606n) * 20) / 100);
        }
        if (f142178K == -1) {
            int m119606n2 = C23212s8.m119606n(AbstractC16781w.SenderBubbleChatBorderAdmin);
            f142178K = m119606n2;
            f142202i0 = AbstractC1409d.m7147p(m119606n2, (Color.alpha(m119606n2) * 20) / 100);
        }
    }

    /* renamed from: f */
    private void m149847f() {
        if (f142175H == -1) {
            int m119606n = C23212s8.m119606n(AbstractC16781w.SenderBubbleChatPressed);
            f142175H = m119606n;
            f142192Y = AbstractC1409d.m7147p(m119606n, (Color.alpha(m119606n) * 20) / 100);
        }
        if (f142176I == -1) {
            int m119606n2 = C23212s8.m119606n(AbstractC16781w.ReceiverBubbleChatPressed);
            f142176I = m119606n2;
            f142189V = AbstractC1409d.m7147p(m119606n2, (Color.alpha(m119606n2) * 20) / 100);
        }
        if (f142174G == -1) {
            f142174G = C23212s8.m119606n(AbstractC16781w.ReceiverBubbleChatBorderHighlight);
        }
    }

    /* renamed from: g */
    private void m149848g() {
        if (f142187T == -1) {
            int m119606n = C23212s8.m119606n(AbstractC16781w.ReceiverBubbleChatNormal);
            f142187T = m119606n;
            f142190W = AbstractC1409d.m7147p(m119606n, (Color.alpha(m119606n) * 20) / 100);
        }
        if (f142188U == -1) {
            int m119606n2 = C23212s8.m119606n(AbstractC16781w.ReceiverBubbleChatBorderNormal);
            f142188U = m119606n2;
            f142191X = AbstractC1409d.m7147p(m119606n2, (Color.alpha(m119606n2) * 20) / 100);
        }
    }

    /* renamed from: h */
    private void m149849h() {
        if (f142185R == -1) {
            int m119606n = C23212s8.m119606n(AbstractC16781w.SenderBubbleChatNormal);
            f142185R = m119606n;
            f142193Z = AbstractC1409d.m7147p(m119606n, (Color.alpha(m119606n) * 20) / 100);
        }
        if (f142186S == -1) {
            int m119606n2 = C23212s8.m119606n(AbstractC16781w.SenderBubbleChatBorderNormal);
            f142186S = m119606n2;
            f142194a0 = AbstractC1409d.m7147p(m119606n2, (Color.alpha(m119606n2) * 20) / 100);
        }
    }

    /* renamed from: i */
    private void m149850i(int i11) {
        int i12 = i11 & 1;
        int i13 = i11 & 4;
        int i14 = i11 & 2;
        if (i12 == 1) {
            m149846e();
            if (i14 == 2) {
                m149858q(i13);
                return;
            } else {
                m149859r(i13);
                return;
            }
        }
        m149845d();
        if (i14 == 2) {
            m149854m(i13);
        } else {
            m149855n(i13);
        }
    }

    /* renamed from: j */
    private void m149851j(int i11) {
        int i12 = i11 & 8;
        int i13 = i11 & 4;
        if (i12 != 8 || i13 == 4) {
            this.f142222t = 0.0f;
            return;
        }
        this.f142221s = f142174G;
        this.f142222t = f142169B;
        this.f142211i = f142171D;
    }

    /* renamed from: k */
    private void m149852k(int i11) {
        int i12 = i11 & 1;
        int i13 = i11 & 4;
        int i14 = i11 & 2;
        if (i12 == 1) {
            m149849h();
            if (i14 == 2) {
                m149860s(i13);
                return;
            } else {
                m149861t(i13);
                return;
            }
        }
        m149848g();
        if (i14 == 2) {
            m149856o(i13);
        } else {
            m149857p(i13);
        }
    }

    /* renamed from: l */
    private void m149853l(int i11, int i12) {
        m149847f();
        if (i11 != 0) {
            m149852k(i12);
        } else {
            m149850i(i12);
        }
        m149851j(i12);
        m149862v(i12);
    }

    /* renamed from: m */
    private void m149854m(int i11) {
        this.f142209g = f142172E;
        this.f142210h = f142173F;
        if (i11 == 4) {
            this.f142216n = f142176I;
            this.f142217o = f142189V;
        } else {
            this.f142216n = f142179L;
            this.f142217o = f142199f0;
        }
        this.f142220r = f142168A;
        this.f142218p = f142180M;
        this.f142219q = f142200g0;
    }

    /* renamed from: n */
    private void m149855n(int i11) {
        this.f142209g = f142171D;
        if (i11 == 4) {
            this.f142216n = f142176I;
        } else {
            this.f142216n = f142179L;
        }
        this.f142220r = f142168A;
        this.f142218p = f142180M;
    }

    /* renamed from: o */
    private void m149856o(int i11) {
        this.f142209g = f142172E;
        this.f142210h = f142173F;
        if (i11 == 4) {
            this.f142216n = f142176I;
            this.f142217o = f142189V;
            this.f142220r = 0.0f;
        } else {
            this.f142216n = f142187T;
            this.f142217o = f142190W;
            this.f142220r = f142168A;
            this.f142218p = f142188U;
            this.f142219q = f142191X;
        }
    }

    /* renamed from: p */
    private void m149857p(int i11) {
        this.f142209g = f142171D;
        if (i11 == 4) {
            this.f142220r = 0.0f;
            this.f142216n = f142176I;
        } else {
            this.f142220r = f142168A;
            this.f142216n = f142187T;
            this.f142218p = f142188U;
        }
    }

    /* renamed from: q */
    private void m149858q(int i11) {
        this.f142209g = f142172E;
        this.f142210h = f142173F;
        if (i11 == 4) {
            this.f142216n = f142175H;
            this.f142217o = f142192Y;
            this.f142220r = 0.0f;
        } else {
            this.f142216n = f142177J;
            this.f142217o = f142201h0;
            this.f142220r = f142168A;
            this.f142218p = f142178K;
            this.f142219q = f142202i0;
        }
    }

    /* renamed from: r */
    private void m149859r(int i11) {
        this.f142209g = f142171D;
        if (i11 == 4) {
            this.f142216n = f142175H;
            this.f142220r = 0.0f;
        } else {
            this.f142216n = f142177J;
            this.f142220r = f142168A;
            this.f142218p = f142178K;
        }
    }

    /* renamed from: s */
    private void m149860s(int i11) {
        this.f142209g = f142172E;
        this.f142210h = f142173F;
        if (i11 == 4) {
            this.f142216n = f142175H;
            this.f142217o = f142192Y;
            this.f142220r = 0.0f;
        } else {
            this.f142216n = f142185R;
            this.f142217o = f142193Z;
            this.f142220r = f142168A;
            this.f142218p = f142186S;
            this.f142219q = f142194a0;
        }
    }

    /* renamed from: t */
    private void m149861t(int i11) {
        this.f142209g = f142171D;
        if (i11 == 4) {
            this.f142220r = 0.0f;
            this.f142216n = f142175H;
        } else {
            this.f142220r = f142168A;
            this.f142216n = f142185R;
            this.f142218p = f142186S;
        }
    }

    /* renamed from: v */
    private void m149862v(int i11) {
        this.f142223u = (i11 & 16) != 0;
    }

    /* renamed from: a */
    public void m149863a(int i11, int i12) {
        this.f142226x = i11;
        this.f142227y = i12;
        m149853l(i11, i12);
        invalidateSelf();
    }

    /* renamed from: c */
    public int m149864c() {
        return this.f142216n;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f142203a.setStyle(Paint.Style.FILL);
        this.f142203a.setStrokeWidth(0.0f);
        this.f142203a.setColor(this.f142216n);
        canvas.drawPath(this.f142204b, this.f142203a);
        if (this.f142225w) {
            this.f142203a.setColor(this.f142217o);
            canvas.drawPath(this.f142205c, this.f142203a);
        }
        if (this.f142220r != 0.0f) {
            this.f142203a.setStyle(Paint.Style.STROKE);
            this.f142203a.setStrokeWidth(this.f142220r);
            if (this.f142223u) {
                if (this.f142215m == null) {
                    this.f142215m = new DashPathEffect(new float[]{AbstractC23136l9.m118742r(2.0f), AbstractC23136l9.m118742r(3.0f)}, 0.0f);
                }
                this.f142203a.setPathEffect(this.f142215m);
            } else {
                this.f142203a.setPathEffect(null);
            }
            this.f142203a.setColor(this.f142218p);
            canvas.drawPath(this.f142207e, this.f142203a);
            if (this.f142225w) {
                this.f142203a.setColor(this.f142219q);
                canvas.drawPath(this.f142208f, this.f142203a);
            }
            if (this.f142223u) {
                this.f142203a.setPathEffect(null);
            }
        }
        if (this.f142222t != 0.0f) {
            this.f142203a.setStyle(Paint.Style.STROKE);
            this.f142203a.setStrokeWidth(this.f142222t);
            this.f142203a.setColor(this.f142221s);
            canvas.drawPath(this.f142206d, this.f142203a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f142214l.set(rect);
        this.f142206d.reset();
        Path path = this.f142206d;
        RectF rectF = this.f142214l;
        float f11 = rectF.left;
        float f12 = rectF.top;
        float f13 = rectF.right;
        float f14 = rectF.bottom;
        float[] fArr = this.f142211i;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(f11, f12, f13, f14, fArr, direction);
        this.f142212j.set(rect.left, rect.top, rect.right, r3 + this.f142224v);
        this.f142204b.reset();
        this.f142204b.addRoundRect(this.f142212j, this.f142209g, direction);
        this.f142207e.reset();
        Path path2 = this.f142207e;
        RectF rectF2 = this.f142212j;
        path2.addRoundRect(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, this.f142209g, direction);
        this.f142213k.set(rect.left, rect.top + this.f142224v, rect.right, rect.bottom);
        this.f142205c.reset();
        this.f142205c.addRoundRect(this.f142213k, this.f142210h, direction);
        this.f142208f.reset();
        Path path3 = this.f142208f;
        RectF rectF3 = this.f142213k;
        path3.addRoundRect(rectF3.left, rectF3.top, rectF3.right, rectF3.bottom, this.f142210h, direction);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f142203a.setAlpha(i11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        this.f142224v = rect.bottom - rect.top;
        this.f142225w = false;
        super.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: u */
    public void m149865u(int i11, int i12, int i13, int i14, int i15) {
        boolean z11;
        if (i15 != 0 && i12 + i15 <= i14) {
            this.f142224v = i15;
        } else {
            this.f142224v = i14 - i12;
        }
        if (this.f142224v != i14 - i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f142225w = z11;
        super.setBounds(i11, i12, i13, i14);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i11, int i12, int i13, int i14) {
        this.f142224v = i14 - i12;
        this.f142225w = false;
        super.setBounds(i11, i12, i13, i14);
    }
}
