package p097db;

import com.vng.zing.vn.zrtc.CallCallback;
import org.webrtc.Logging;
import org.webrtc.TextureViewRenderer;
import org.webrtc.videofilter.ZVideoFilter;
import org.webrtc.voiceengine.WebRtcAudioUtils;

/* renamed from: db.b */
/* loaded from: classes3.dex */
public class C17843b {

    /* renamed from: c */
    private static volatile C17843b f90140c;

    /* renamed from: a */
    private final String f90141a = "CallManager";

    /* renamed from: b */
    private volatile C17850i f90142b = null;

    private C17843b() {
    }

    /* renamed from: o */
    public static C17843b m94137o() {
        C17843b c17843b = f90140c;
        if (c17843b == null) {
            synchronized (C17843b.class) {
                try {
                    c17843b = f90140c;
                    if (c17843b == null) {
                        c17843b = new C17843b();
                        f90140c = c17843b;
                    }
                } finally {
                }
            }
        }
        return c17843b;
    }

    /* renamed from: A */
    public boolean m94138A(C17842a c17842a, String str) {
        if (this.f90142b != null && c17842a != null) {
            return this.f90142b.m94308B(c17842a, str);
        }
        return false;
    }

    /* renamed from: B */
    public void m94139B(boolean z11) {
        if (this.f90142b == null) {
            return;
        }
        this.f90142b.m94309C(z11);
    }

    /* renamed from: C */
    public void m94140C(boolean z11) {
        if (this.f90142b != null) {
            this.f90142b.m94310D(z11);
        }
    }

    /* renamed from: D */
    public void m94141D(boolean z11) {
        if (this.f90142b != null) {
            this.f90142b.m94311E(z11);
        }
    }

    /* renamed from: E */
    public void m94142E(boolean z11, int i11) {
        if (this.f90142b == null) {
            return;
        }
        this.f90142b.m94312F(z11, i11);
    }

    /* renamed from: F */
    public int m94143F(byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, long j11) {
        if (this.f90142b == null) {
            return EnumC17862u.NOT_SET_APP_CONTEXT.m94384b();
        }
        this.f90142b.m94313G(bArr, i11, i12, i13, i14, i15, i16, j11);
        return EnumC17862u.SUCCESS.m94384b();
    }

    /* renamed from: G */
    public int m94144G(byte[] bArr, int i11, int i12, int i13, long j11) {
        if (this.f90142b == null) {
            return EnumC17862u.NOT_SET_APP_CONTEXT.m94384b();
        }
        this.f90142b.m94314H(bArr, i11, i12, i13, j11);
        return EnumC17862u.SUCCESS.m94384b();
    }

    /* renamed from: H */
    public int m94145H(int i11, int i12, int i13, float[] fArr, int i14, long j11, int i15) {
        if (this.f90142b == null) {
            return EnumC17862u.NOT_SET_APP_CONTEXT.m94384b();
        }
        this.f90142b.m94315I(i11, i12, i13, fArr, i14, j11, i15);
        return EnumC17862u.SUCCESS.m94384b();
    }

    /* renamed from: I */
    public void m94146I(int i11) {
        if (this.f90142b != null) {
            this.f90142b.m94316J(i11);
        }
    }

    /* renamed from: J */
    public void m94147J(int i11, int i12, String str) {
        if (this.f90142b != null) {
            this.f90142b.m94317K(i11, i12, str);
        }
    }

    /* renamed from: K */
    public boolean m94148K() {
        if (this.f90142b == null) {
            return false;
        }
        return this.f90142b.m94318L();
    }

    /* renamed from: L */
    public void m94149L(int i11, int i12, String str) {
        if (this.f90142b != null) {
            this.f90142b.m94319M(i11, i12, str);
        }
    }

    /* renamed from: M */
    public void m94150M(int i11) {
        if (this.f90142b == null) {
            return;
        }
        this.f90142b.m94320N(i11);
    }

    /* renamed from: N */
    public void m94151N(int i11, int i12, String str) {
        if (this.f90142b != null) {
            this.f90142b.m94321O(i11, i12, str);
        }
    }

    /* renamed from: O */
    public void m94152O(int i11, String str) {
        if (this.f90142b != null) {
            this.f90142b.m94322P(i11, str);
        }
    }

    /* renamed from: P */
    public boolean m94153P(String str) {
        if (this.f90142b == null) {
            return false;
        }
        return this.f90142b.m94323Q(str);
    }

    /* renamed from: Q */
    public void m94154Q(CallCallback callCallback) {
        if (this.f90142b != null) {
            this.f90142b.m94324R(callCallback);
        }
    }

    /* renamed from: R */
    public void m94155R() {
        if (this.f90142b == null) {
            return;
        }
        this.f90142b.m94325S();
    }

    /* renamed from: S */
    public boolean m94156S(String str) {
        if (this.f90142b != null) {
            return this.f90142b.m94326T(str);
        }
        return false;
    }

    /* renamed from: T */
    public boolean m94157T(String str) {
        if (this.f90142b != null) {
            return this.f90142b.m94327U(str);
        }
        return false;
    }

    /* renamed from: U */
    public void m94158U(int i11) {
        if (this.f90142b != null) {
            this.f90142b.m94328V(i11);
        }
    }

    /* renamed from: V */
    public void m94159V(int i11) {
        if (this.f90142b != null) {
            this.f90142b.m94329W(i11);
        }
    }

    /* renamed from: W */
    public void m94160W(int i11) {
        if (this.f90142b != null) {
            this.f90142b.m94330X(i11);
        }
    }

    /* renamed from: X */
    public void m94161X(int i11) {
        if (this.f90142b != null) {
            this.f90142b.m94331Y(i11);
        }
    }

    /* renamed from: Y */
    public int m94162Y(Object obj) {
        if (this.f90142b == null) {
            this.f90142b = new C17850i();
        }
        return this.f90142b.m94332Z(obj);
    }

    /* renamed from: Z */
    public void m94163Z(int i11) {
        if (this.f90142b != null) {
            WebRtcAudioUtils.setDefaultSampleRateHz(i11);
        }
    }

    /* renamed from: a */
    public void m94164a(String str, String[] strArr, String[] strArr2) {
        if (this.f90142b != null) {
            this.f90142b.m94335b(str, strArr, strArr2);
        }
    }

    /* renamed from: a0 */
    public void m94165a0(int i11) {
        if (this.f90142b == null) {
            return;
        }
        this.f90142b.m94334a0(i11);
    }

    /* renamed from: b */
    public int m94166b() {
        if (this.f90142b == null) {
            return 0;
        }
        return this.f90142b.m94357m();
    }

    /* renamed from: b0 */
    public void m94167b0(String str) {
        if (this.f90142b == null) {
            return;
        }
        this.f90142b.m94336b0(str);
    }

    /* renamed from: c */
    public String m94168c() {
        if (this.f90142b == null) {
            return "";
        }
        return this.f90142b.m94367r();
    }

    /* renamed from: c0 */
    public int m94169c0(Object obj) {
        if (this.f90142b == null) {
            return EnumC17862u.CONFIG_NOT_SET.m94384b();
        }
        return this.f90142b.m94338c0(obj);
    }

    /* renamed from: d */
    public void m94170d(boolean z11) {
        if (this.f90142b == null) {
            return;
        }
        this.f90142b.m94339d(z11);
    }

    /* renamed from: d0 */
    public void m94171d0() {
        if (this.f90142b == null) {
            return;
        }
        this.f90142b.m94340d0();
    }

    /* renamed from: e */
    public String m94172e() {
        if (this.f90142b == null) {
            return "";
        }
        return this.f90142b.m94341e();
    }

    /* renamed from: e0 */
    public int m94173e0(Object obj) {
        Logging.m127853d("CallManager", "setLocalRenderWnd");
        if (this.f90142b == null) {
            return EnumC17862u.NOT_SET_APP_CONTEXT.m94384b();
        }
        this.f90142b.m94342e0(obj);
        if (obj != null) {
            ((TextureViewRenderer) obj).setRole(true);
        }
        return EnumC17862u.SUCCESS.m94384b();
    }

    /* renamed from: f */
    public int m94174f() {
        if (this.f90142b != null) {
            return this.f90142b.m94343f();
        }
        return 0;
    }

    /* renamed from: f0 */
    public void m94175f0(int i11) {
        if (this.f90142b != null) {
            this.f90142b.m94344f0(i11);
        }
    }

    /* renamed from: g */
    public int m94176g() {
        if (this.f90142b != null) {
            return this.f90142b.m94345g();
        }
        return 0;
    }

    /* renamed from: g0 */
    public void m94177g0(int i11) {
        if (this.f90142b != null) {
            this.f90142b.m94346g0(i11);
        }
    }

    /* renamed from: h */
    public int m94178h() {
        if (this.f90142b != null) {
            return this.f90142b.m94347h();
        }
        return 0;
    }

    /* renamed from: h0 */
    public void m94179h0(int i11, int i12) {
        if (this.f90142b == null) {
            return;
        }
        this.f90142b.m94348h0(i11, i12);
    }

    /* renamed from: i */
    public int m94180i() {
        if (this.f90142b != null) {
            return this.f90142b.m94349i();
        }
        return -1;
    }

    /* renamed from: i0 */
    public int m94181i0(Object obj) {
        if (this.f90142b == null) {
            return EnumC17862u.NOT_SET_APP_CONTEXT.m94384b();
        }
        this.f90142b.m94333a(0, obj);
        return EnumC17862u.SUCCESS.m94384b();
    }

    /* renamed from: j */
    public int m94182j() {
        if (this.f90142b != null) {
            return this.f90142b.m94351j();
        }
        return -1;
    }

    /* renamed from: j0 */
    public void m94183j0(boolean z11) {
        if (this.f90142b == null) {
            return;
        }
        this.f90142b.m94350i0(z11);
    }

    /* renamed from: k */
    public String m94184k() {
        if (this.f90142b == null) {
            return "";
        }
        return this.f90142b.m94353k();
    }

    /* renamed from: k0 */
    public void m94185k0(boolean z11, String str) {
        if (this.f90142b != null) {
            this.f90142b.m94352j0(z11, str);
        }
    }

    /* renamed from: l */
    public String m94186l(int i11, int i12) {
        if (this.f90142b != null) {
            return this.f90142b.m94355l(i11, i12);
        }
        return "";
    }

    /* renamed from: l0 */
    public void m94187l0(boolean z11, int i11) {
        if (this.f90142b == null) {
            return;
        }
        this.f90142b.m94354k0(z11, i11);
    }

    /* renamed from: m */
    public String m94188m() {
        if (this.f90142b == null) {
            return "";
        }
        return this.f90142b.m94359n();
    }

    /* renamed from: m0 */
    public void m94189m0() {
        if (this.f90142b != null) {
            this.f90142b.m94356l0();
        }
    }

    /* renamed from: n */
    public String m94190n() {
        if (this.f90142b == null) {
            return "";
        }
        return this.f90142b.m94361o();
    }

    /* renamed from: n0 */
    public void m94191n0() {
        if (this.f90142b == null) {
            return;
        }
        this.f90142b.m94358m0();
    }

    /* renamed from: o0 */
    public int m94192o0(boolean z11, String str) {
        if (this.f90142b == null) {
            return -1;
        }
        return this.f90142b.m94360n0(z11, str);
    }

    /* renamed from: p */
    public String m94193p(int i11, int i12, String str) {
        if (this.f90142b == null) {
            return "";
        }
        return this.f90142b.m94363p(i11, i12, str);
    }

    /* renamed from: p0 */
    public int m94194p0(boolean z11) {
        if (this.f90142b == null) {
            return -1;
        }
        return this.f90142b.m94362o0(z11);
    }

    /* renamed from: q */
    public int m94195q() {
        if (this.f90142b != null) {
            return this.f90142b.m94365q();
        }
        return -1;
    }

    /* renamed from: q0 */
    public void m94196q0(boolean z11) {
        if (this.f90142b == null) {
            return;
        }
        this.f90142b.m94364p0(Boolean.valueOf(z11));
    }

    /* renamed from: r */
    public int m94197r() {
        if (this.f90142b != null) {
            return this.f90142b.m94369s();
        }
        return 0;
    }

    /* renamed from: r0 */
    public void m94198r0() {
        if (this.f90142b != null) {
            this.f90142b.m94366q0();
        }
    }

    /* renamed from: s */
    public boolean m94199s(String[] strArr) {
        if (this.f90142b != null) {
            return this.f90142b.m94371t(strArr);
        }
        return false;
    }

    /* renamed from: s0 */
    public boolean m94200s0(boolean z11) {
        if (this.f90142b != null) {
            return this.f90142b.m94368r0(z11);
        }
        return false;
    }

    /* renamed from: t */
    public void m94201t(boolean z11, boolean z12) {
        if (this.f90142b == null) {
            return;
        }
        this.f90142b.m94373u(z11, z12);
    }

    /* renamed from: t0 */
    public void m94202t0(int i11) {
        if (this.f90142b == null) {
            return;
        }
        this.f90142b.m94370s0(i11);
    }

    /* renamed from: u */
    public boolean m94203u(C17842a c17842a, C17848g c17848g, String str, String str2, String str3) {
        if (this.f90142b != null && c17842a != null) {
            return this.f90142b.m94375v(c17842a, c17848g, str, str2, str3);
        }
        return false;
    }

    /* renamed from: u0 */
    public boolean m94204u0(String str) {
        if (this.f90142b == null) {
            return false;
        }
        return this.f90142b.m94372t0(str);
    }

    /* renamed from: v */
    public boolean m94205v(String str) {
        if (this.f90142b == null) {
            return false;
        }
        return this.f90142b.m94377w(str);
    }

    /* renamed from: v0 */
    public boolean m94206v0(C17848g c17848g, String str) {
        if (this.f90142b == null) {
            return false;
        }
        return this.f90142b.m94374u0(c17848g, str);
    }

    /* renamed from: w */
    public int m94207w() {
        if (this.f90142b == null) {
            return ZVideoFilter.SupportType.UNKNOWN.getValue();
        }
        return this.f90142b.m94379x();
    }

    /* renamed from: w0 */
    public boolean m94208w0(String str) {
        if (this.f90142b == null) {
            return false;
        }
        return this.f90142b.m94376v0(str);
    }

    /* renamed from: x */
    public boolean m94209x() {
        if (this.f90142b == null) {
            return false;
        }
        return this.f90142b.m94381y();
    }

    /* renamed from: x0 */
    public boolean m94210x0(String str) {
        if (this.f90142b == null) {
            return false;
        }
        return this.f90142b.m94378w0(str);
    }

    /* renamed from: y */
    public boolean m94211y() {
        if (this.f90142b == null) {
            return false;
        }
        return this.f90142b.m94382z();
    }

    /* renamed from: y0 */
    public boolean m94212y0(String str) {
        if (this.f90142b == null) {
            return false;
        }
        return this.f90142b.m94380x0(str);
    }

    /* renamed from: z */
    public boolean m94213z() {
        if (this.f90142b != null) {
            return this.f90142b.m94307A();
        }
        return false;
    }
}
