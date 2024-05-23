package bp0;

import android.content.Context;
import android.graphics.RectF;
import androidx.core.graphics.C1421e;
import com.zing.zalo.p077ui.widget.liveemoji.LiveEmojiButton;
import com.zing.zalo.zview.AbstractC17484n;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;

/* renamed from: bp0.p */
/* loaded from: classes7.dex */
public abstract class AbstractC3104p {

    /* renamed from: a */
    public static int f13184a = 0;

    /* renamed from: b */
    public static int f13185b = 0;

    /* renamed from: c */
    public static int f13186c = 0;

    /* renamed from: d */
    public static int f13187d = 0;

    /* renamed from: e */
    public static int f13188e = 0;

    /* renamed from: f */
    private static float f13189f = 1.0f;

    /* renamed from: g */
    public static int f13190g;

    /* renamed from: h */
    public static int f13191h;

    /* renamed from: i */
    public static C1421e f13192i;

    /* renamed from: A */
    public static int m15624A() {
        int i11;
        C1421e c1421e = f13192i;
        if (c1421e != null) {
            i11 = c1421e.f6230a;
        } else {
            i11 = 0;
        }
        if (i11 > 0) {
            return i11 + AbstractC23222t7.f112566j;
        }
        return AbstractC23222t7.f112586t;
    }

    /* renamed from: B */
    public static int m15625B() {
        int i11;
        C1421e c1421e = f13192i;
        if (c1421e != null && (i11 = c1421e.f6232c) > 0) {
            return i11 + m15650a(8.0f);
        }
        return m15650a(16.0f);
    }

    /* renamed from: C */
    public static int m15626C() {
        return m15655c0() + m15650a(12.0f);
    }

    /* renamed from: D */
    public static int m15627D() {
        return Math.max(m15650a(24.0f), m15653b0());
    }

    /* renamed from: E */
    public static int m15628E() {
        return (int) (m15657d0() * 0.1d);
    }

    /* renamed from: F */
    public static int m15629F() {
        return (int) (m15659e0() * 0.15f);
    }

    /* renamed from: G */
    public static int m15630G() {
        return LiveEmojiButton.f70635g0 + m15697z() + LiveEmojiButton.f70634f0;
    }

    /* renamed from: H */
    public static int m15631H() {
        return (m15679o0() * 4) / 3;
    }

    /* renamed from: I */
    public static int m15632I() {
        return f13186c / 2;
    }

    /* renamed from: J */
    public static int m15633J() {
        return (m15681p0() * 4) / 3;
    }

    /* renamed from: K */
    public static int m15634K() {
        return m15682q() + m15668j();
    }

    /* renamed from: L */
    public static int m15635L() {
        return (int) (m15657d0() / 4.5d);
    }

    /* renamed from: M */
    public static int m15636M(boolean z11) {
        return (m15687s0(z11) * 4) / 3;
    }

    /* renamed from: N */
    public static int m15637N() {
        return m15650a(14.0f);
    }

    /* renamed from: O */
    public static int m15638O() {
        return m15657d0() / 3;
    }

    /* renamed from: P */
    public static int m15639P() {
        return m15650a(7.0f);
    }

    /* renamed from: Q */
    public static int m15640Q() {
        return m15650a(10.0f) + AbstractC17484n.Companion.m92931b();
    }

    /* renamed from: R */
    public static int m15641R() {
        return m15626C() + m15642S() + m15644U();
    }

    /* renamed from: S */
    public static int m15642S() {
        return AbstractC23136l9.m118742r(50.0f);
    }

    /* renamed from: T */
    public static int m15643T() {
        return m15626C() + m15663g0() + m15644U();
    }

    /* renamed from: U */
    public static int m15644U() {
        return m15650a(5.0f);
    }

    /* renamed from: V */
    public static int m15645V() {
        int m15650a = m15650a(6.0f);
        if (m15650a % 2 != 0) {
            return m15650a - 1;
        }
        return m15650a;
    }

    /* renamed from: W */
    public static int m15646W() {
        return m15650a(16.0f);
    }

    /* renamed from: X */
    public static int m15647X() {
        return m15650a(6.0f);
    }

    /* renamed from: Y */
    public static int m15648Y() {
        return m15650a(5.0f);
    }

    /* renamed from: Z */
    public static int m15649Z() {
        return m15650a(9.0f);
    }

    /* renamed from: a */
    public static int m15650a(float f11) {
        return (int) Math.ceil(f13189f * f11);
    }

    /* renamed from: a0 */
    public static RectF m15651a0() {
        RectF rectF = new RectF();
        rectF.left = -((m15659e0() - m15685r0()) - (m15678o() * 2));
        rectF.top = 0.0f;
        rectF.right = 0.0f;
        rectF.bottom = (((f13186c - m15635L()) - m15643T()) - m15630G()) - m15639P();
        return rectF;
    }

    /* renamed from: b */
    public static float m15652b(float f11) {
        return f13189f * f11;
    }

    /* renamed from: b0 */
    public static int m15653b0() {
        C1421e c1421e = f13192i;
        if (c1421e != null) {
            return c1421e.f6233d;
        }
        return 0;
    }

    /* renamed from: c */
    public static int m15654c() {
        return ((int) (m15657d0() * 0.15d)) + f13188e;
    }

    /* renamed from: c0 */
    public static int m15655c0() {
        C1421e c1421e = f13192i;
        if (c1421e != null) {
            return c1421e.f6231b;
        }
        return 0;
    }

    /* renamed from: d */
    public static int m15656d() {
        return m15658e() / 2;
    }

    /* renamed from: d0 */
    public static int m15657d0() {
        return f13185b;
    }

    /* renamed from: e */
    public static int m15658e() {
        return (int) (Math.min(m15659e0(), m15657d0()) * 0.386d);
    }

    /* renamed from: e0 */
    public static int m15659e0() {
        return f13184a;
    }

    /* renamed from: f */
    public static int m15660f() {
        int m15650a = m15650a(4.0f);
        if (m15650a % 2 != 0) {
            return m15650a - 1;
        }
        return m15650a;
    }

    /* renamed from: f0 */
    public static int m15661f0() {
        return m15650a(16.0f);
    }

    /* renamed from: g */
    public static int m15662g() {
        return m15650a(2.0f);
    }

    /* renamed from: g0 */
    public static int m15663g0() {
        return m15650a(48.0f);
    }

    /* renamed from: h */
    public static int m15664h() {
        return (int) (m15636M(false) * 0.05d);
    }

    /* renamed from: h0 */
    public static int m15665h0() {
        return (int) Math.min(AbstractC23136l9.m118742r(72.0f), m15657d0() * 0.096f);
    }

    /* renamed from: i */
    public static int m15666i() {
        return (int) (m15659e0() * 0.03d);
    }

    /* renamed from: i0 */
    public static int m15667i0() {
        return Math.max(m15650a(16.0f), m15653b0() + m15650a(8.0f));
    }

    /* renamed from: j */
    public static int m15668j() {
        return (int) Math.min(m15659e0() * 0.18d, m15650a(72.0f));
    }

    /* renamed from: j0 */
    public static int m15669j0(int i11) {
        return (((f13186c - m15635L()) - m15643T()) - m15639P()) - i11;
    }

    /* renamed from: k */
    public static int m15670k() {
        return (int) Math.min(Math.min(f13187d, f13186c) * 0.17d, m15650a(72.0f));
    }

    /* renamed from: k0 */
    public static RectF m15671k0(int i11, int i12, boolean z11, boolean z12) {
        int i13;
        int m15677n0;
        int m15629F;
        RectF rectF = new RectF();
        int i14 = 0;
        if (z12 && !z11) {
            i13 = m15695x();
        } else {
            i13 = 0;
        }
        rectF.left = -i13;
        rectF.top = (m15692v() * 0.1f) + 0.0f;
        if (z11) {
            m15677n0 = m15687s0(z12);
        } else {
            m15677n0 = m15677n0();
        }
        int i15 = i12 - m15677n0;
        if (z12 && !z11) {
            i14 = m15695x();
        }
        rectF.right = i15 + i14;
        if (z11) {
            m15629F = m15636M(z12);
        } else {
            m15629F = m15629F();
        }
        rectF.bottom = (i11 - m15629F) - (m15692v() * 0.1f);
        return rectF;
    }

    /* renamed from: l */
    public static int m15672l() {
        return (int) (m15687s0(false) * 0.27d);
    }

    /* renamed from: l0 */
    public static int m15673l0() {
        return m15663g0() + m15644U();
    }

    /* renamed from: m */
    public static int m15674m() {
        return m15650a(36.0f);
    }

    /* renamed from: m0 */
    public static int m15675m0() {
        return m15650a(6.0f);
    }

    /* renamed from: n */
    public static int m15676n() {
        return m15650a(24.0f);
    }

    /* renamed from: n0 */
    public static int m15677n0() {
        return (int) (Math.min(f13187d, f13186c) * 0.35f);
    }

    /* renamed from: o */
    public static int m15678o() {
        return m15650a(12.0f);
    }

    /* renamed from: o0 */
    public static int m15679o0() {
        return (int) (m15659e0() * 0.4d);
    }

    /* renamed from: p */
    public static int[] m15680p(boolean z11) {
        if (z11) {
            return new int[]{m15685r0(), m15635L()};
        }
        int min = Math.min(m15659e0(), m15657d0());
        return new int[]{min / 3, min / 4};
    }

    /* renamed from: p0 */
    public static int m15681p0() {
        return (int) (m15687s0(false) * 0.4d);
    }

    /* renamed from: q */
    public static int m15682q() {
        return (int) ((m15657d0() * 0.1d) + m15653b0());
    }

    /* renamed from: q0 */
    public static int m15683q0() {
        return m15662g() - 1;
    }

    /* renamed from: r */
    public static int m15684r() {
        return AbstractC23222t7.f112566j + m15653b0();
    }

    /* renamed from: r0 */
    public static int m15685r0() {
        return (m15635L() * 3) / 4;
    }

    /* renamed from: s */
    public static int m15686s() {
        return (m15670k() / 2) + m15653b0();
    }

    /* renamed from: s0 */
    public static int m15687s0(boolean z11) {
        float f11;
        float min = Math.min(f13187d, f13186c);
        if (z11) {
            f11 = 0.2f;
        } else {
            f11 = 0.4f;
        }
        return (int) (min * f11);
    }

    /* renamed from: t */
    public static int m15688t() {
        return m15650a(8.0f);
    }

    /* renamed from: t0 */
    public static int m15689t0(int i11) {
        return (int) ((i11 - (m15692v() * 0.1f)) + ((m15692v() * 1.0f) / 6.0f));
    }

    /* renamed from: u */
    public static int m15690u() {
        return m15650a(4.0f);
    }

    /* renamed from: u0 */
    public static int m15691u0() {
        return m15626C() + m15674m() + m15650a(10.0f);
    }

    /* renamed from: v */
    public static int m15692v() {
        return f13191h;
    }

    /* renamed from: v0 */
    public static void m15693v0(Context context) {
        try {
            f13189f = context.getResources().getDisplayMetrics().density;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: w */
    public static int m15694w() {
        return f13190g;
    }

    /* renamed from: x */
    public static int m15695x() {
        return (m15677n0() - m15629F()) - m15650a(4.0f);
    }

    /* renamed from: y */
    public static int m15696y() {
        int i11;
        C1421e c1421e = f13192i;
        if (c1421e != null && (i11 = c1421e.f6233d) > 0) {
            return i11 + m15650a(8.0f);
        }
        return m15650a(16.0f);
    }

    /* renamed from: z */
    public static int m15697z() {
        return Math.max(m15650a(18.0f), m15653b0() + m15650a(5.0f));
    }
}
