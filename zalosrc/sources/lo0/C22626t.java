package lo0;

import am.AbstractC0924m0;
import android.content.Context;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.data.entity.chat.message.MessageId;
import je.C21228a;
import me0.AbstractC23136l9;
import org.json.JSONArray;
import org.webrtc.EglRenderer;
import p097db.EnumC17856o;
import p097db.EnumC17860s;
import p304ks.AbstractC21935u;

/* renamed from: lo0.t */
/* loaded from: classes7.dex */
public class C22626t {

    /* renamed from: A */
    private int f110870A;

    /* renamed from: A0 */
    private String f110871A0;

    /* renamed from: B */
    private int f110872B;

    /* renamed from: B0 */
    private String f110873B0;

    /* renamed from: C */
    private int f110874C;

    /* renamed from: C0 */
    private String f110875C0;

    /* renamed from: D */
    private int f110876D;

    /* renamed from: D0 */
    private boolean f110877D0;

    /* renamed from: E */
    private int f110878E;

    /* renamed from: E0 */
    private boolean f110879E0;

    /* renamed from: F */
    private int f110880F;

    /* renamed from: F0 */
    private boolean f110881F0;

    /* renamed from: G */
    private boolean f110882G;

    /* renamed from: G0 */
    private boolean f110883G0;

    /* renamed from: H */
    private int f110884H;

    /* renamed from: H0 */
    private boolean f110885H0;

    /* renamed from: I */
    private int f110886I;

    /* renamed from: I0 */
    private C21228a f110887I0;

    /* renamed from: J */
    private int f110888J;

    /* renamed from: J0 */
    private int f110889J0;

    /* renamed from: K */
    private int f110890K;

    /* renamed from: K0 */
    private b f110891K0;

    /* renamed from: L */
    private int f110892L;

    /* renamed from: L0 */
    private JSONArray f110893L0;

    /* renamed from: M */
    private int f110894M;

    /* renamed from: M0 */
    private MessageId f110895M0;

    /* renamed from: N */
    private boolean f110896N;

    /* renamed from: N0 */
    private int f110897N0;

    /* renamed from: O */
    private int f110898O;

    /* renamed from: O0 */
    private boolean f110899O0;

    /* renamed from: P */
    private long f110900P;

    /* renamed from: P0 */
    private boolean f110901P0;

    /* renamed from: Q */
    private int f110902Q;

    /* renamed from: R */
    private int f110903R;

    /* renamed from: S */
    private int f110904S;

    /* renamed from: T */
    private int f110905T;

    /* renamed from: U */
    private int f110906U;

    /* renamed from: V */
    private long f110907V;

    /* renamed from: W */
    private long f110908W;

    /* renamed from: X */
    private int f110909X;

    /* renamed from: Y */
    public boolean f110910Y;

    /* renamed from: Z */
    private boolean f110911Z;

    /* renamed from: a */
    private long f110912a;

    /* renamed from: a0 */
    private boolean f110913a0;

    /* renamed from: b */
    private int f110914b;

    /* renamed from: b0 */
    private boolean f110915b0;

    /* renamed from: c */
    private int f110916c;

    /* renamed from: c0 */
    private boolean f110917c0;

    /* renamed from: d */
    private long f110918d;

    /* renamed from: d0 */
    public boolean f110919d0;

    /* renamed from: e */
    private int f110920e;

    /* renamed from: e0 */
    public boolean f110921e0;

    /* renamed from: f */
    public EglRenderer.RenderMode f110922f;

    /* renamed from: f0 */
    public boolean f110923f0;

    /* renamed from: g */
    private String f110924g;

    /* renamed from: g0 */
    public boolean f110925g0;

    /* renamed from: h */
    private String f110926h;

    /* renamed from: h0 */
    private boolean f110927h0;

    /* renamed from: i */
    private String f110928i;

    /* renamed from: i0 */
    private boolean f110929i0;

    /* renamed from: j */
    public String f110930j;

    /* renamed from: j0 */
    public boolean f110931j0;

    /* renamed from: k */
    private String f110932k;

    /* renamed from: k0 */
    private boolean f110933k0;

    /* renamed from: l */
    private String f110934l;

    /* renamed from: l0 */
    private boolean f110935l0;

    /* renamed from: m */
    private String f110936m;

    /* renamed from: m0 */
    private boolean f110937m0;

    /* renamed from: n */
    private String f110938n;

    /* renamed from: n0 */
    private boolean f110939n0;

    /* renamed from: o */
    private String f110940o;

    /* renamed from: o0 */
    private boolean f110941o0;

    /* renamed from: p */
    private String f110942p;

    /* renamed from: p0 */
    private boolean f110943p0;

    /* renamed from: q */
    private int f110944q;

    /* renamed from: q0 */
    public boolean f110945q0;

    /* renamed from: r */
    private int f110946r;

    /* renamed from: r0 */
    public boolean f110947r0;

    /* renamed from: s */
    private long f110948s;

    /* renamed from: s0 */
    private boolean f110949s0;

    /* renamed from: t */
    private int f110950t;

    /* renamed from: t0 */
    private boolean f110951t0;

    /* renamed from: u */
    private int f110952u;

    /* renamed from: u0 */
    private boolean f110953u0;

    /* renamed from: v */
    private long f110954v;

    /* renamed from: v0 */
    private boolean f110955v0;

    /* renamed from: w */
    private int f110956w;

    /* renamed from: w0 */
    private boolean f110957w0;

    /* renamed from: x */
    private int f110958x;

    /* renamed from: x0 */
    private boolean f110959x0;

    /* renamed from: y */
    public int f110960y;

    /* renamed from: y0 */
    private boolean f110961y0;

    /* renamed from: z */
    private int f110962z;

    /* renamed from: z0 */
    private boolean f110963z0;

    /* renamed from: lo0.t$a */
    /* loaded from: classes7.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f110964a;

        static {
            int[] iArr = new int[EnumC17860s.values().length];
            f110964a = iArr;
            try {
                iArr[EnumC17860s.NO_VOICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f110964a[EnumC17860s.VERY_POOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f110964a[EnumC17860s.POOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f110964a[EnumC17860s.NORMAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f110964a[EnumC17860s.EXCELLENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: lo0.t$b */
    /* loaded from: classes7.dex */
    public enum b {
        INVALID,
        SET,
        PREPARED,
        PLAYED
    }

    public C22626t() {
        this.f110912a = 0L;
        this.f110914b = 0;
        this.f110916c = EnumC17856o.ACTIVE.ordinal();
        this.f110918d = 0L;
        this.f110920e = 0;
        this.f110922f = EglRenderer.RenderMode.AspectScaleToFill;
        this.f110924g = "";
        this.f110926h = "";
        this.f110928i = "";
        this.f110930j = "";
        this.f110932k = "";
        this.f110934l = "";
        this.f110936m = "";
        this.f110938n = "";
        this.f110940o = "";
        this.f110942p = "";
        this.f110944q = EnumC17860s.EXCELLENT.ordinal();
        this.f110946r = 0;
        this.f110948s = 0L;
        this.f110950t = 0;
        this.f110952u = 0;
        this.f110954v = -1L;
        this.f110956w = 0;
        this.f110958x = 0;
        this.f110960y = 0;
        this.f110962z = 0;
        this.f110870A = 0;
        this.f110872B = 0;
        this.f110874C = 0;
        this.f110876D = 0;
        this.f110878E = 0;
        this.f110880F = -1;
        this.f110882G = false;
        this.f110884H = 0;
        this.f110886I = 0;
        this.f110888J = 0;
        this.f110890K = 0;
        this.f110892L = 0;
        this.f110894M = 0;
        this.f110896N = false;
        this.f110898O = 0;
        this.f110900P = 0L;
        this.f110902Q = -1;
        this.f110903R = -1;
        this.f110904S = -1;
        this.f110905T = 1;
        this.f110906U = 0;
        this.f110907V = 0L;
        this.f110908W = 0L;
        this.f110909X = -1;
        this.f110910Y = false;
        this.f110911Z = false;
        this.f110913a0 = false;
        this.f110915b0 = false;
        this.f110917c0 = false;
        this.f110919d0 = false;
        this.f110921e0 = false;
        this.f110923f0 = false;
        this.f110925g0 = false;
        this.f110927h0 = false;
        this.f110929i0 = false;
        this.f110931j0 = false;
        this.f110933k0 = false;
        this.f110935l0 = false;
        this.f110937m0 = false;
        this.f110939n0 = false;
        this.f110941o0 = false;
        this.f110943p0 = false;
        this.f110945q0 = false;
        this.f110947r0 = false;
        this.f110949s0 = false;
        this.f110951t0 = false;
        this.f110953u0 = false;
        this.f110955v0 = false;
        this.f110957w0 = true;
        this.f110959x0 = true;
        this.f110961y0 = true;
        this.f110963z0 = false;
        this.f110871A0 = "";
        this.f110873B0 = "";
        this.f110875C0 = "";
        this.f110877D0 = false;
        this.f110879E0 = false;
        this.f110881F0 = false;
        this.f110883G0 = false;
        this.f110885H0 = false;
        this.f110887I0 = null;
        this.f110891K0 = b.INVALID;
        this.f110893L0 = new JSONArray();
        this.f110895M0 = null;
        this.f110897N0 = 0;
        this.f110899O0 = false;
        this.f110901P0 = true;
    }

    /* renamed from: A */
    public String m117007A() {
        if (m117086a0() && !TextUtils.isEmpty(m117058R())) {
            return m117058R();
        }
        return this.f110926h;
    }

    /* renamed from: A0 */
    public boolean m117008A0() {
        return this.f110876D > 1;
    }

    /* renamed from: A1 */
    public void m117009A1(int i11) {
        this.f110906U = i11;
    }

    /* renamed from: B */
    public String m117010B() {
        if (m117086a0() && !TextUtils.isEmpty(m117061S())) {
            return m117061S();
        }
        return this.f110924g;
    }

    /* renamed from: B0 */
    public boolean m117011B0() {
        return this.f110913a0;
    }

    /* renamed from: B1 */
    public void m117012B1(long j11) {
        this.f110907V = j11;
    }

    /* renamed from: C */
    public long m117013C() {
        return this.f110954v;
    }

    /* renamed from: C0 */
    public boolean m117014C0() {
        if (m117126k0() && this.f110916c == EnumC17856o.REMOTE_HOLD.ordinal()) {
            return true;
        }
        return false;
    }

    /* renamed from: C1 */
    public void m117015C1(long j11) {
        this.f110908W = j11;
    }

    /* renamed from: D */
    public int m117016D() {
        if (!m117126k0()) {
            return -12397172;
        }
        int i11 = a.f110964a[m117125k().ordinal()];
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            if (i11 != 4) {
                return -12397172;
            }
            return -1;
        }
        return -678365;
    }

    /* renamed from: D0 */
    public boolean m117017D0() {
        return this.f110876D >= 1;
    }

    /* renamed from: D1 */
    public void m117018D1(int i11) {
        this.f110903R = i11;
    }

    /* renamed from: E */
    public int m117019E() {
        return this.f110884H;
    }

    /* renamed from: E0 */
    public boolean m117020E0() {
        return this.f110937m0;
    }

    /* renamed from: E1 */
    public void m117021E1(int i11) {
        this.f110904S = i11;
    }

    /* renamed from: F */
    public int m117022F() {
        return this.f110886I;
    }

    /* renamed from: F0 */
    public int m117023F0() {
        return this.f110897N0;
    }

    /* renamed from: F1 */
    public void m117024F1(int i11) {
        this.f110874C = i11;
    }

    /* renamed from: G */
    public C21228a m117025G() {
        return this.f110887I0;
    }

    /* renamed from: G0 */
    public boolean m117026G0() {
        return this.f110877D0;
    }

    /* renamed from: G1 */
    public void m117027G1(int i11) {
        this.f110916c = i11;
    }

    /* renamed from: H */
    public int m117028H() {
        return this.f110889J0;
    }

    /* renamed from: H0 */
    public boolean m117029H0() {
        if (m117113h() == 3) {
            return true;
        }
        if (m117113h() == 1 && m117008A0()) {
            return true;
        }
        return false;
    }

    /* renamed from: H1 */
    public void m117030H1(int i11) {
        this.f110905T = i11;
    }

    /* renamed from: I */
    public int m117031I() {
        return this.f110888J;
    }

    /* renamed from: I0 */
    public boolean m117032I0() {
        return !m117086a0();
    }

    /* renamed from: I1 */
    public void m117033I1(String str) {
        this.f110928i = str;
    }

    /* renamed from: J */
    public int m117034J() {
        return this.f110890K;
    }

    /* renamed from: J0 */
    public boolean m117035J0() {
        if (AbstractC0924m0.m3626Z9() && !m117086a0()) {
            return true;
        }
        return false;
    }

    /* renamed from: J1 */
    public void m117036J1(boolean z11) {
        this.f110929i0 = z11;
    }

    /* renamed from: K */
    public int m117037K() {
        return this.f110876D;
    }

    /* renamed from: K0 */
    public boolean m117038K0() {
        return this.f110883G0;
    }

    /* renamed from: K1 */
    public void m117039K1(boolean z11) {
        this.f110896N = z11;
    }

    /* renamed from: L */
    public String m117040L(Context context) {
        int i11;
        if (m117067U()) {
            i11 = AbstractC22623r0.m117004a(m117157s());
            if (m117141o() != 0) {
                i11 = m117141o();
            }
        } else if (m117082Z()) {
            if (!m117090b0()) {
                if (m117113h() == 4) {
                    i11 = AbstractC8020f0.str_call_accept_call_status;
                } else if (m117047N0()) {
                    i11 = AbstractC8020f0.str_call_video_incoming_call_status;
                } else {
                    i11 = AbstractC8020f0.str_call_audio_incoming_call_status;
                }
            } else if (m117113h() == 1) {
                i11 = AbstractC8020f0.str_call_connect_call_status;
                if (m117029H0()) {
                    i11 = AbstractC8020f0.str_call_ring_call_status;
                } else if (m117017D0()) {
                    return String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_dial_call_status), m117049O(context, 10));
                }
            } else {
                i11 = AbstractC8020f0.str_call_ring_call_status;
            }
        } else {
            if (m117126k0()) {
                if (m117020E0()) {
                    i11 = AbstractC8020f0.incall_info_reconnecting_roaming;
                } else if (m117161t0()) {
                    i11 = AbstractC8020f0.str_signal_roaming;
                } else {
                    if (m117014C0()) {
                        return String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.on_remote_hold), m117049O(context, 10));
                    }
                    if (m117167v0()) {
                        i11 = AbstractC8020f0.on_hold;
                    }
                }
            }
            i11 = -1;
        }
        if (context == null || i11 == -1 || !TextUtils.isEmpty("")) {
            return "";
        }
        return context.getString(i11);
    }

    /* renamed from: L0 */
    public boolean m117041L0() {
        return this.f110885H0;
    }

    /* renamed from: L1 */
    public void m117042L1(boolean z11) {
        this.f110881F0 = z11;
    }

    /* renamed from: M */
    public String m117043M(Context context) {
        switch (this.f110914b) {
            case 1:
            case 3:
                return context.getString(AbstractC8020f0.str_call_connect_call_status);
            case 2:
                return context.getString(AbstractC8020f0.call_state_incoming);
            case 4:
                return context.getString(AbstractC8020f0.str_call_ring_call_status);
            case 5:
                return context.getString(AbstractC8020f0.call_state_confirmed);
            case 6:
                return context.getString(AbstractC8020f0.str_call_end_call_status);
            default:
                return "";
        }
    }

    /* renamed from: M0 */
    public boolean m117044M0() {
        if ((m117126k0() && m117047N0()) || !m117047N0()) {
            return true;
        }
        return false;
    }

    /* renamed from: M1 */
    public void m117045M1(int i11) {
        this.f110946r = i11;
    }

    /* renamed from: N */
    public int m117046N() {
        return this.f110872B;
    }

    /* renamed from: N0 */
    public boolean m117047N0() {
        return this.f110958x == 1;
    }

    /* renamed from: N1 */
    public void m117048N1(int i11) {
        this.f110902Q = i11;
    }

    /* renamed from: O */
    public String m117049O(Context context, int i11) {
        String m117010B = m117010B();
        if (TextUtils.isEmpty(m117010B) && context != null) {
            return context.getResources().getString(AbstractC8020f0.unknown_user);
        }
        if (m117010B.length() > i11) {
            return m117010B.substring(0, i11) + "...";
        }
        return m117010B;
    }

    /* renamed from: O0 */
    public boolean m117050O0() {
        return this.f110927h0;
    }

    /* renamed from: O1 */
    public void m117051O1(int i11) {
        this.f110909X = i11;
    }

    /* renamed from: P */
    public String m117052P(String str, int i11) {
        String m117010B = m117010B();
        if (!TextUtils.isEmpty(m117010B)) {
            str = m117010B;
        }
        if (str.length() > i11) {
            return str.substring(0, i11) + "...";
        }
        return str;
    }

    /* renamed from: P0 */
    public void m117053P0(boolean z11) {
        if (!z11) {
            this.f110914b = 0;
            this.f110953u0 = false;
            this.f110958x = 0;
            this.f110935l0 = false;
            this.f110924g = "";
            this.f110926h = "";
            this.f110928i = "";
            this.f110954v = -1L;
            this.f110956w = 0;
            this.f110878E = 0;
            this.f110923f0 = false;
            this.f110955v0 = false;
            this.f110957w0 = true;
            this.f110959x0 = true;
            this.f110961y0 = true;
            this.f110963z0 = false;
            this.f110877D0 = false;
            this.f110879E0 = false;
            this.f110871A0 = "";
            this.f110881F0 = false;
            this.f110873B0 = "";
            this.f110875C0 = "";
            this.f110892L = 0;
            this.f110887I0 = null;
            this.f110889J0 = 0;
            this.f110891K0 = b.INVALID;
            this.f110893L0 = new JSONArray();
            this.f110920e = 0;
            this.f110900P = 0L;
            this.f110899O0 = false;
            this.f110901P0 = true;
        }
        this.f110912a = 0L;
        this.f110916c = EnumC17856o.ACTIVE.ordinal();
        this.f110918d = 0L;
        this.f110944q = EnumC17860s.EXCELLENT.ordinal();
        this.f110946r = 0;
        this.f110948s = 0L;
        this.f110950t = 0;
        this.f110902Q = -1;
        this.f110903R = -1;
        this.f110952u = 0;
        this.f110870A = 0;
        this.f110872B = 0;
        this.f110874C = 0;
        this.f110876D = 0;
        this.f110962z = 0;
        this.f110960y = 0;
        this.f110922f = EglRenderer.RenderMode.AspectScaleToFill;
        this.f110880F = -1;
        this.f110882G = false;
        this.f110884H = 0;
        this.f110886I = 0;
        this.f110888J = 0;
        this.f110890K = 0;
        this.f110894M = 0;
        this.f110896N = false;
        this.f110898O = 0;
        this.f110907V = 0L;
        this.f110908W = 0L;
        this.f110906U = 0;
        this.f110904S = -1;
        this.f110909X = -1;
        this.f110927h0 = false;
        this.f110937m0 = false;
        this.f110939n0 = false;
        this.f110949s0 = false;
        this.f110951t0 = false;
        this.f110945q0 = false;
        this.f110947r0 = false;
        this.f110929i0 = false;
        this.f110943p0 = false;
        this.f110941o0 = false;
        this.f110910Y = false;
        this.f110883G0 = false;
        this.f110885H0 = false;
        this.f110897N0 = 0;
        this.f110895M0 = null;
        this.f110915b0 = false;
        this.f110917c0 = false;
        this.f110919d0 = false;
        this.f110921e0 = false;
        this.f110925g0 = false;
        this.f110931j0 = false;
        this.f110933k0 = false;
        this.f110911Z = false;
        this.f110913a0 = false;
        this.f110932k = "";
        this.f110934l = "";
        this.f110936m = "";
        this.f110938n = "";
        this.f110940o = "";
        this.f110942p = "";
    }

    /* renamed from: P1 */
    public void m117054P1(String str) {
        this.f110926h = str;
    }

    /* renamed from: Q */
    public int m117055Q() {
        return this.f110956w;
    }

    /* renamed from: Q0 */
    public void m117056Q0(boolean z11) {
        this.f110953u0 = z11;
    }

    /* renamed from: Q1 */
    public void m117057Q1(String str) {
        this.f110924g = str;
    }

    /* renamed from: R */
    public String m117058R() {
        return this.f110875C0;
    }

    /* renamed from: R0 */
    public void m117059R0(boolean z11) {
        this.f110899O0 = z11;
    }

    /* renamed from: R1 */
    public void m117060R1(long j11) {
        this.f110954v = j11;
    }

    /* renamed from: S */
    public String m117061S() {
        return this.f110873B0;
    }

    /* renamed from: S0 */
    public void m117062S0(int i11) {
        this.f110880F = i11;
    }

    /* renamed from: S1 */
    public void m117063S1(int i11) {
        this.f110897N0 = i11;
    }

    /* renamed from: T */
    public boolean m117064T() {
        return this.f110953u0;
    }

    /* renamed from: T0 */
    public void m117065T0(int i11) {
        this.f110870A = i11;
    }

    /* renamed from: T1 */
    public void m117066T1(boolean z11) {
        this.f110913a0 = z11;
    }

    /* renamed from: U */
    public boolean m117067U() {
        int i11 = this.f110914b;
        return i11 == 6 || i11 == 0;
    }

    /* renamed from: U0 */
    public void m117068U0(boolean z11) {
        this.f110943p0 = z11;
    }

    /* renamed from: U1 */
    public void m117069U1(boolean z11) {
        this.f110911Z = z11;
    }

    /* renamed from: V */
    public boolean m117070V() {
        return this.f110899O0;
    }

    /* renamed from: V0 */
    public void m117071V0(int i11) {
        if (i11 > 0) {
            this.f110948s = i11;
        }
    }

    /* renamed from: V1 */
    public void m117072V1(int i11) {
        this.f110884H = i11;
    }

    /* renamed from: W */
    public boolean m117073W() {
        return this.f110958x == 0;
    }

    /* renamed from: W0 */
    public void m117074W0(int i11) {
        this.f110950t = i11;
    }

    /* renamed from: W1 */
    public void m117075W1(int i11) {
        this.f110886I = i11;
    }

    /* renamed from: X */
    public boolean m117076X() {
        return this.f110943p0;
    }

    /* renamed from: X0 */
    public void m117077X0(String str) {
        this.f110871A0 = str;
    }

    /* renamed from: X1 */
    public void m117078X1(C21228a c21228a) {
        this.f110887I0 = c21228a;
    }

    /* renamed from: Y */
    public boolean m117079Y() {
        return this.f110914b == 1 && !this.f110929i0;
    }

    /* renamed from: Y0 */
    public void m117080Y0(long j11) {
        this.f110912a = j11;
    }

    /* renamed from: Y1 */
    public void m117081Y1(int i11) {
        this.f110889J0 = i11;
    }

    /* renamed from: Z */
    public boolean m117082Z() {
        int i11 = this.f110914b;
        return i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4;
    }

    /* renamed from: Z0 */
    public void m117083Z0(int i11) {
        this.f110914b = i11;
    }

    /* renamed from: Z1 */
    public void m117084Z1(boolean z11) {
        this.f110937m0 = z11;
    }

    /* renamed from: a */
    public boolean m117085a() {
        return this.f110901P0;
    }

    /* renamed from: a0 */
    public boolean m117086a0() {
        return this.f110955v0;
    }

    /* renamed from: a1 */
    public void m117087a1(int i11) {
        this.f110958x = i11;
    }

    /* renamed from: a2 */
    public void m117088a2(int i11) {
        this.f110888J = i11;
    }

    /* renamed from: b */
    public int m117089b() {
        return this.f110880F;
    }

    /* renamed from: b0 */
    public boolean m117090b0() {
        return this.f110935l0;
    }

    /* renamed from: b1 */
    public void m117091b1(boolean z11) {
        this.f110955v0 = z11;
    }

    /* renamed from: b2 */
    public void m117092b2(int i11) {
        this.f110890K = i11;
    }

    /* renamed from: c */
    public int m117093c() {
        return this.f110870A;
    }

    /* renamed from: c0 */
    public boolean m117094c0() {
        return this.f110917c0;
    }

    /* renamed from: c1 */
    public void m117095c1(boolean z11) {
        this.f110935l0 = z11;
    }

    /* renamed from: c2 */
    public void m117096c2(String str) {
        this.f110934l = str;
    }

    /* renamed from: d */
    public long m117097d() {
        return this.f110948s;
    }

    /* renamed from: d0 */
    public boolean m117098d0() {
        int i11;
        if (!m117102e0() && (i11 = this.f110914b) != 3 && i11 != 4) {
            return false;
        }
        return true;
    }

    /* renamed from: d1 */
    public void m117099d1(boolean z11) {
        this.f110917c0 = z11;
    }

    /* renamed from: d2 */
    public void m117100d2(String str) {
        this.f110932k = str;
    }

    /* renamed from: e */
    public int m117101e() {
        return this.f110950t;
    }

    /* renamed from: e0 */
    public boolean m117102e0() {
        return this.f110914b == 1 && this.f110929i0;
    }

    /* renamed from: e1 */
    public void m117103e1(boolean z11) {
        this.f110941o0 = z11;
    }

    /* renamed from: e2 */
    public void m117104e2(String str) {
        this.f110936m = str;
    }

    /* renamed from: f */
    public String m117105f() {
        return this.f110871A0;
    }

    /* renamed from: f0 */
    public boolean m117106f0() {
        if (m117047N0()) {
            if (this.f110914b == 1) {
                return true;
            }
            if (m117090b0() && this.f110914b == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f1 */
    public void m117107f1(boolean z11) {
        this.f110901P0 = z11;
    }

    /* renamed from: f2 */
    public void m117108f2(boolean z11) {
        this.f110877D0 = z11;
    }

    /* renamed from: g */
    public long m117109g() {
        return this.f110912a;
    }

    /* renamed from: g0 */
    public boolean m117110g0() {
        return this.f110941o0;
    }

    /* renamed from: g1 */
    public void m117111g1(boolean z11) {
        this.f110949s0 = z11;
    }

    /* renamed from: g2 */
    public void m117112g2(int i11) {
        if (i11 > this.f110876D) {
            this.f110876D = i11;
        }
    }

    /* renamed from: h */
    public int m117113h() {
        return this.f110914b;
    }

    /* renamed from: h0 */
    public boolean m117114h0() {
        int i11 = this.f110903R;
        return i11 == 0 || i11 == 2;
    }

    /* renamed from: h1 */
    public void m117115h1(boolean z11) {
        this.f110933k0 = z11;
    }

    /* renamed from: h2 */
    public void m117116h2(boolean z11) {
        this.f110883G0 = z11;
    }

    /* renamed from: i */
    public int m117117i() {
        return this.f110898O;
    }

    /* renamed from: i0 */
    public boolean m117118i0() {
        return this.f110949s0;
    }

    /* renamed from: i1 */
    public void m117119i1(long j11) {
        this.f110918d = j11;
    }

    /* renamed from: i2 */
    public void m117120i2(boolean z11) {
        this.f110885H0 = z11;
    }

    /* renamed from: j */
    public long m117121j() {
        return this.f110918d;
    }

    /* renamed from: j0 */
    public boolean m117122j0() {
        return this.f110933k0;
    }

    /* renamed from: j1 */
    public void m117123j1(int i11) {
        this.f110944q = i11;
    }

    /* renamed from: j2 */
    public void m117124j2(long j11) {
        this.f110900P = j11;
    }

    /* renamed from: k */
    public EnumC17860s m117125k() {
        int i11 = this.f110944q;
        EnumC17860s enumC17860s = EnumC17860s.NO_VOICE;
        if (i11 == enumC17860s.ordinal()) {
            return enumC17860s;
        }
        int i12 = this.f110944q;
        EnumC17860s enumC17860s2 = EnumC17860s.VERY_POOR;
        if (i12 == enumC17860s2.ordinal()) {
            return enumC17860s2;
        }
        int i13 = this.f110944q;
        EnumC17860s enumC17860s3 = EnumC17860s.POOR;
        if (i13 == enumC17860s3.ordinal()) {
            return enumC17860s3;
        }
        int i14 = this.f110944q;
        EnumC17860s enumC17860s4 = EnumC17860s.NORMAL;
        if (i14 == enumC17860s4.ordinal()) {
            return enumC17860s4;
        }
        return EnumC17860s.EXCELLENT;
    }

    /* renamed from: k0 */
    public boolean m117126k0() {
        return this.f110914b == 5;
    }

    /* renamed from: k1 */
    public void m117127k1(b bVar) {
        this.f110891K0 = bVar;
    }

    /* renamed from: k2 */
    public void m117128k2(int i11) {
        this.f110872B = i11;
    }

    /* renamed from: l */
    public b m117129l() {
        return this.f110891K0;
    }

    /* renamed from: l0 */
    public boolean m117130l0() {
        return this.f110902Q == 4;
    }

    /* renamed from: l1 */
    public void m117131l1(boolean z11) {
        this.f110957w0 = z11;
    }

    /* renamed from: l2 */
    public void m117132l2(boolean z11) {
        this.f110927h0 = z11;
    }

    /* renamed from: m */
    public JSONArray m117133m() {
        return this.f110893L0;
    }

    /* renamed from: m0 */
    public boolean m117134m0() {
        return this.f110957w0;
    }

    /* renamed from: m1 */
    public void m117135m1(boolean z11) {
        this.f110963z0 = z11;
    }

    /* renamed from: m2 */
    public void m117136m2(int i11) {
        this.f110952u = i11;
    }

    /* renamed from: n */
    public String m117137n(Context context, int i11) {
        String m117049O = m117049O(context, i11);
        String valueOf = String.valueOf(this.f110954v);
        if (!AbstractC21935u.m114554u(valueOf) && !TextUtils.isEmpty(valueOf) && !m117086a0()) {
            m117049O = String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_dpn_miss_call_stranger), m117049O);
        }
        if (m117049O.length() > i11) {
            return m117049O.substring(0, i11) + "...";
        }
        return m117049O;
    }

    /* renamed from: n0 */
    public boolean m117138n0() {
        if (this.f110963z0 && m117086a0()) {
            return true;
        }
        return false;
    }

    /* renamed from: n1 */
    public void m117139n1(boolean z11) {
        this.f110879E0 = z11;
    }

    /* renamed from: n2 */
    public void m117140n2(int i11) {
        this.f110956w = i11;
    }

    /* renamed from: o */
    public int m117141o() {
        return this.f110962z;
    }

    /* renamed from: o0 */
    public boolean m117142o0() {
        return this.f110879E0;
    }

    /* renamed from: o1 */
    public void m117143o1(boolean z11) {
        this.f110959x0 = z11;
    }

    /* renamed from: o2 */
    public void m117144o2(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f110875C0 = str;
    }

    /* renamed from: p */
    public int m117145p() {
        return this.f110878E;
    }

    /* renamed from: p0 */
    public boolean m117146p0() {
        return this.f110959x0;
    }

    /* renamed from: p1 */
    public void m117147p1(boolean z11) {
        this.f110961y0 = z11;
    }

    /* renamed from: p2 */
    public void m117148p2(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f110873B0 = str;
    }

    /* renamed from: q */
    public int m117149q() {
        return this.f110894M;
    }

    /* renamed from: q0 */
    public boolean m117150q0() {
        return this.f110961y0;
    }

    /* renamed from: q1 */
    public void m117151q1(String str) {
        this.f110942p = str;
    }

    /* renamed from: q2 */
    public boolean m117152q2() {
        int i11;
        return !this.f110935l0 && ((i11 = this.f110914b) == 2 || i11 == 3);
    }

    /* renamed from: r */
    public int m117153r() {
        return this.f110892L;
    }

    /* renamed from: r0 */
    public boolean m117154r0() {
        if (m117126k0() && (this.f110916c == EnumC17856o.LOCAL_HOLD.ordinal() || this.f110916c == EnumC17856o.REMOTE_HOLD.ordinal())) {
            return true;
        }
        return false;
    }

    /* renamed from: r1 */
    public void m117155r1(String str) {
        this.f110940o = str;
    }

    /* renamed from: r2 */
    public boolean m117156r2() {
        if (this.f110876D != 4 && !m117008A0()) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public int m117157s() {
        return this.f110920e;
    }

    /* renamed from: s0 */
    public boolean m117158s0() {
        return this.f110960y != 0;
    }

    /* renamed from: s1 */
    public void m117159s1(String str) {
        this.f110938n = str;
    }

    /* renamed from: t */
    public int m117160t() {
        return this.f110906U;
    }

    /* renamed from: t0 */
    public boolean m117161t0() {
        return this.f110939n0;
    }

    /* renamed from: t1 */
    public void m117162t1(int i11) {
        this.f110878E = i11;
    }

    /* renamed from: u */
    public int m117163u() {
        return this.f110903R;
    }

    /* renamed from: u0 */
    public boolean m117164u0() {
        return this.f110882G;
    }

    /* renamed from: u1 */
    public void m117165u1(int i11) {
        this.f110894M = i11;
    }

    /* renamed from: v */
    public int m117166v() {
        return this.f110874C;
    }

    /* renamed from: v0 */
    public boolean m117167v0() {
        if (m117126k0() && this.f110916c == EnumC17856o.LOCAL_HOLD.ordinal()) {
            return true;
        }
        return false;
    }

    /* renamed from: v1 */
    public void m117168v1(int i11) {
        this.f110892L = i11;
    }

    /* renamed from: w */
    public String m117169w() {
        return this.f110928i;
    }

    /* renamed from: w0 */
    public boolean m117170w0() {
        return this.f110929i0;
    }

    /* renamed from: w1 */
    public void m117171w1(boolean z11) {
        this.f110939n0 = z11;
    }

    /* renamed from: x */
    public int m117172x() {
        return this.f110946r;
    }

    /* renamed from: x0 */
    public boolean m117173x0() {
        return this.f110881F0;
    }

    /* renamed from: x1 */
    public void m117174x1(boolean z11) {
        this.f110882G = z11;
    }

    /* renamed from: y */
    public int m117175y() {
        return this.f110902Q;
    }

    /* renamed from: y0 */
    public boolean m117176y0() {
        int i11 = this.f110902Q;
        return i11 == 0 || i11 == 2;
    }

    /* renamed from: y1 */
    public void m117177y1(boolean z11) {
        this.f110915b0 = z11;
    }

    /* renamed from: z */
    public int m117178z() {
        return this.f110909X;
    }

    /* renamed from: z0 */
    public boolean m117179z0() {
        int i11 = this.f110909X;
        return i11 == 1 || i11 == 2 || i11 == 3 || i11 == 9 || i11 == 14;
    }

    /* renamed from: z1 */
    public void m117180z1(int i11) {
        this.f110920e = i11;
    }

    public C22626t(C22626t c22626t) {
        this.f110912a = 0L;
        this.f110914b = 0;
        this.f110916c = EnumC17856o.ACTIVE.ordinal();
        this.f110918d = 0L;
        this.f110920e = 0;
        this.f110922f = EglRenderer.RenderMode.AspectScaleToFill;
        this.f110924g = "";
        this.f110926h = "";
        this.f110928i = "";
        this.f110930j = "";
        this.f110932k = "";
        this.f110934l = "";
        this.f110936m = "";
        this.f110938n = "";
        this.f110940o = "";
        this.f110942p = "";
        this.f110944q = EnumC17860s.EXCELLENT.ordinal();
        this.f110946r = 0;
        this.f110948s = 0L;
        this.f110950t = 0;
        this.f110952u = 0;
        this.f110954v = -1L;
        this.f110956w = 0;
        this.f110958x = 0;
        this.f110960y = 0;
        this.f110962z = 0;
        this.f110870A = 0;
        this.f110872B = 0;
        this.f110874C = 0;
        this.f110876D = 0;
        this.f110878E = 0;
        this.f110880F = -1;
        this.f110882G = false;
        this.f110884H = 0;
        this.f110886I = 0;
        this.f110888J = 0;
        this.f110890K = 0;
        this.f110892L = 0;
        this.f110894M = 0;
        this.f110896N = false;
        this.f110898O = 0;
        this.f110900P = 0L;
        this.f110902Q = -1;
        this.f110903R = -1;
        this.f110904S = -1;
        this.f110905T = 1;
        this.f110906U = 0;
        this.f110907V = 0L;
        this.f110908W = 0L;
        this.f110909X = -1;
        this.f110910Y = false;
        this.f110911Z = false;
        this.f110913a0 = false;
        this.f110915b0 = false;
        this.f110917c0 = false;
        this.f110919d0 = false;
        this.f110921e0 = false;
        this.f110923f0 = false;
        this.f110925g0 = false;
        this.f110927h0 = false;
        this.f110929i0 = false;
        this.f110931j0 = false;
        this.f110933k0 = false;
        this.f110935l0 = false;
        this.f110937m0 = false;
        this.f110939n0 = false;
        this.f110941o0 = false;
        this.f110943p0 = false;
        this.f110945q0 = false;
        this.f110947r0 = false;
        this.f110949s0 = false;
        this.f110951t0 = false;
        this.f110953u0 = false;
        this.f110955v0 = false;
        this.f110957w0 = true;
        this.f110959x0 = true;
        this.f110961y0 = true;
        this.f110963z0 = false;
        this.f110871A0 = "";
        this.f110873B0 = "";
        this.f110875C0 = "";
        this.f110877D0 = false;
        this.f110879E0 = false;
        this.f110881F0 = false;
        this.f110883G0 = false;
        this.f110885H0 = false;
        this.f110887I0 = null;
        this.f110891K0 = b.INVALID;
        this.f110893L0 = new JSONArray();
        this.f110895M0 = null;
        this.f110897N0 = 0;
        this.f110899O0 = false;
        this.f110901P0 = true;
        this.f110916c = c22626t.f110916c;
        this.f110920e = c22626t.f110920e;
        this.f110918d = c22626t.f110918d;
        this.f110914b = c22626t.f110914b;
        this.f110924g = c22626t.f110924g;
        this.f110926h = c22626t.f110926h;
        this.f110928i = c22626t.f110928i;
        this.f110944q = c22626t.f110944q;
        this.f110948s = c22626t.f110948s;
        this.f110946r = c22626t.f110946r;
        this.f110950t = c22626t.f110950t;
        this.f110927h0 = c22626t.f110927h0;
        this.f110929i0 = c22626t.f110929i0;
        this.f110954v = c22626t.f110954v;
        this.f110943p0 = c22626t.f110943p0;
        this.f110956w = c22626t.f110956w;
        this.f110912a = c22626t.f110912a;
        this.f110958x = c22626t.f110958x;
        this.f110941o0 = c22626t.f110941o0;
        this.f110937m0 = c22626t.f110937m0;
        this.f110939n0 = c22626t.f110939n0;
        this.f110935l0 = c22626t.f110935l0;
        this.f110949s0 = c22626t.f110949s0;
        this.f110951t0 = c22626t.f110951t0;
        this.f110938n = c22626t.f110938n;
        this.f110940o = c22626t.f110940o;
        this.f110870A = c22626t.f110870A;
        this.f110874C = c22626t.f110874C;
        this.f110872B = c22626t.f110872B;
        this.f110953u0 = c22626t.f110953u0;
        this.f110942p = c22626t.f110942p;
        this.f110962z = c22626t.f110962z;
        this.f110878E = c22626t.f110878E;
        this.f110960y = c22626t.f110960y;
        this.f110945q0 = c22626t.f110945q0;
        this.f110947r0 = c22626t.f110947r0;
        this.f110922f = c22626t.f110922f;
        this.f110880F = c22626t.f110880F;
        this.f110955v0 = c22626t.f110955v0;
        this.f110957w0 = c22626t.f110957w0;
        this.f110959x0 = c22626t.f110959x0;
        this.f110961y0 = c22626t.f110961y0;
        this.f110963z0 = c22626t.f110963z0;
        this.f110877D0 = c22626t.f110877D0;
        this.f110879E0 = c22626t.f110879E0;
        this.f110871A0 = c22626t.f110871A0;
        this.f110873B0 = c22626t.f110873B0;
        this.f110875C0 = c22626t.f110875C0;
        this.f110881F0 = c22626t.f110881F0;
        this.f110882G = c22626t.f110882G;
        this.f110884H = c22626t.f110884H;
        this.f110886I = c22626t.f110886I;
        this.f110888J = c22626t.f110888J;
        this.f110890K = c22626t.f110890K;
        this.f110883G0 = c22626t.f110883G0;
        this.f110885H0 = c22626t.f110885H0;
        this.f110892L = c22626t.f110892L;
        this.f110894M = c22626t.f110894M;
        this.f110896N = c22626t.f110896N;
        this.f110898O = c22626t.f110898O;
        this.f110900P = c22626t.f110900P;
        this.f110952u = c22626t.f110952u;
        this.f110903R = c22626t.f110903R;
        this.f110902Q = c22626t.f110902Q;
        this.f110933k0 = c22626t.f110933k0;
        this.f110911Z = c22626t.f110911Z;
        this.f110913a0 = c22626t.f110913a0;
        this.f110876D = c22626t.f110876D;
        this.f110915b0 = c22626t.f110915b0;
        this.f110917c0 = c22626t.f110917c0;
        this.f110919d0 = c22626t.f110919d0;
        this.f110921e0 = c22626t.f110921e0;
        this.f110925g0 = c22626t.f110925g0;
        this.f110923f0 = c22626t.f110923f0;
        this.f110904S = c22626t.f110904S;
        this.f110909X = c22626t.f110909X;
        this.f110887I0 = c22626t.f110887I0;
        this.f110889J0 = c22626t.f110889J0;
        this.f110891K0 = c22626t.f110891K0;
        this.f110893L0 = c22626t.f110893L0;
        this.f110897N0 = c22626t.f110897N0;
        this.f110895M0 = c22626t.f110895M0;
        this.f110899O0 = c22626t.f110899O0;
    }
}
