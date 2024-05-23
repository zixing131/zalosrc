package lo0;

import com.zing.zalo.AbstractC8020f0;
import com.zing.zalocore.CoreUtility;
import gp0.C19577z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import jo0.C21334l;
import me0.AbstractC23136l9;
import p348mi.AbstractC23304d;
import ro0.C25942f;

/* renamed from: lo0.c */
/* loaded from: classes7.dex */
public class C22592c {

    /* renamed from: A */
    private int f110576A;

    /* renamed from: G */
    private String f110582G;

    /* renamed from: M */
    int f110588M;

    /* renamed from: b */
    private int f110598b;

    /* renamed from: c */
    private int f110599c;

    /* renamed from: d */
    private int f110600d;

    /* renamed from: e */
    private int f110601e;

    /* renamed from: f */
    private int f110602f;

    /* renamed from: g */
    private String f110603g;

    /* renamed from: h */
    private String f110604h;

    /* renamed from: i */
    private String f110605i;

    /* renamed from: j */
    private String f110606j;

    /* renamed from: z */
    private int f110622z;

    /* renamed from: a */
    private int f110597a = 0;

    /* renamed from: k */
    private long f110607k = 0;

    /* renamed from: l */
    private long f110608l = 0;

    /* renamed from: m */
    private int f110609m = 0;

    /* renamed from: n */
    private boolean f110610n = false;

    /* renamed from: o */
    private boolean f110611o = false;

    /* renamed from: p */
    private int f110612p = -1;

    /* renamed from: q */
    private boolean f110613q = false;

    /* renamed from: r */
    private boolean f110614r = false;

    /* renamed from: s */
    private boolean f110615s = false;

    /* renamed from: t */
    private int f110616t = 0;

    /* renamed from: u */
    private int f110617u = 1;

    /* renamed from: v */
    private int f110618v = -1;

    /* renamed from: w */
    private boolean f110619w = false;

    /* renamed from: x */
    private boolean f110620x = false;

    /* renamed from: y */
    private int f110621y = 0;

    /* renamed from: B */
    private boolean f110577B = false;

    /* renamed from: C */
    private boolean f110578C = true;

    /* renamed from: D */
    private int f110579D = 0;

    /* renamed from: E */
    private boolean f110580E = true;

    /* renamed from: F */
    private List f110581F = new ArrayList();

    /* renamed from: H */
    private int f110583H = 0;

    /* renamed from: I */
    private long f110584I = 0;

    /* renamed from: J */
    private boolean f110585J = false;

    /* renamed from: K */
    HashSet f110586K = new HashSet();

    /* renamed from: L */
    List f110587L = new ArrayList();

    /* renamed from: N */
    private boolean f110589N = false;

    /* renamed from: O */
    private boolean f110590O = false;

    /* renamed from: P */
    private boolean f110591P = false;

    /* renamed from: Q */
    private boolean f110592Q = false;

    /* renamed from: R */
    private boolean f110593R = false;

    /* renamed from: S */
    private boolean f110594S = false;

    /* renamed from: T */
    private boolean f110595T = false;

    /* renamed from: U */
    private boolean f110596U = false;

    /* renamed from: A */
    public boolean m116836A() {
        return this.f110590O && this.f110588M == 1 && !this.f110591P;
    }

    /* renamed from: A0 */
    public void m116837A0(boolean z11) {
        this.f110614r = z11;
    }

    /* renamed from: B */
    public boolean m116838B() {
        int i11 = this.f110588M;
        return i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 7;
    }

    /* renamed from: B0 */
    public void m116839B0(String str) {
        this.f110604h = str;
    }

    /* renamed from: C */
    public boolean m116840C() {
        return this.f110620x;
    }

    /* renamed from: C0 */
    public void m116841C0(String str) {
        this.f110603g = str;
    }

    /* renamed from: D */
    public boolean m116842D() {
        return this.f110590O;
    }

    /* renamed from: D0 */
    public void m116843D0() {
        this.f110579D++;
    }

    /* renamed from: E */
    public boolean m116844E() {
        int i11;
        return this.f110590O && ((i11 = this.f110588M) == 1 || i11 == 2) && this.f110616t < 2;
    }

    /* renamed from: E0 */
    public void m116845E0(boolean z11) {
        this.f110595T = z11;
    }

    /* renamed from: F */
    public boolean m116846F() {
        return this.f110590O && this.f110588M == 2 && this.f110616t >= 2;
    }

    /* renamed from: F0 */
    public void m116847F0(boolean z11) {
        this.f110596U = z11;
    }

    /* renamed from: G */
    public boolean m116848G() {
        return this.f110613q;
    }

    /* renamed from: G0 */
    public void m116849G0(boolean z11) {
        this.f110592Q = z11;
    }

    /* renamed from: H */
    public boolean m116850H() {
        int i11 = this.f110612p;
        return i11 == 0 || i11 == 2;
    }

    /* renamed from: H0 */
    public boolean m116851H0(int i11) {
        if (i11 <= this.f110616t) {
            return false;
        }
        this.f110616t = i11;
        return true;
    }

    /* renamed from: I */
    public boolean m116852I() {
        return this.f110585J;
    }

    /* renamed from: I0 */
    public void m116853I0(int i11) {
        this.f110618v = i11;
    }

    /* renamed from: J */
    public boolean m116854J() {
        return this.f110588M == 5;
    }

    /* renamed from: J0 */
    public void m116855J0(boolean z11) {
        this.f110591P = z11;
    }

    /* renamed from: K */
    public boolean m116856K() {
        return this.f110619w;
    }

    /* renamed from: K0 */
    public void m116857K0() {
        this.f110579D += AbstractC23304d.f113331T1;
    }

    /* renamed from: L */
    public boolean m116858L() {
        return this.f110593R;
    }

    /* renamed from: L0 */
    public void m116859L0(boolean z11) {
        this.f110610n = z11;
    }

    /* renamed from: M */
    public boolean m116860M() {
        if (this.f110602f == Integer.parseInt(CoreUtility.f89233i)) {
            return true;
        }
        return false;
    }

    /* renamed from: M0 */
    public void m116861M0(int i11) {
        this.f110609m = i11;
    }

    /* renamed from: N */
    public boolean m116862N() {
        return this.f110611o;
    }

    /* renamed from: N0 */
    public boolean m116863N0() {
        int i11;
        return !this.f110590O && ((i11 = this.f110588M) == 3 || i11 == 4 || i11 == 7);
    }

    /* renamed from: O */
    public boolean m116864O() {
        return this.f110577B;
    }

    /* renamed from: O0 */
    public boolean m116865O0() {
        return this.f110596U;
    }

    /* renamed from: P */
    public boolean m116866P() {
        return this.f110578C;
    }

    /* renamed from: Q */
    public boolean m116867Q() {
        return this.f110594S;
    }

    /* renamed from: R */
    public boolean m116868R() {
        return this.f110595T;
    }

    /* renamed from: S */
    public boolean m116869S() {
        return this.f110592Q;
    }

    /* renamed from: T */
    public boolean m116870T() {
        return this.f110591P;
    }

    /* renamed from: U */
    public boolean m116871U() {
        return this.f110610n;
    }

    /* renamed from: V */
    public void m116872V(boolean z11) {
        this.f110621y = 0;
        this.f110598b = 0;
        this.f110599c = 0;
        this.f110600d = 0;
        this.f110601e = 0;
        this.f110602f = 0;
        this.f110603g = "";
        this.f110604h = "";
        this.f110605i = "";
        this.f110606j = "";
        this.f110590O = false;
        this.f110608l = 0L;
        this.f110615s = false;
        this.f110582G = null;
        this.f110592Q = false;
        this.f110593R = false;
        this.f110597a = 0;
        m116879b();
        List list = this.f110581F;
        if (list != null) {
            list.clear();
        }
        if (!z11) {
            this.f110588M = 0;
            this.f110589N = false;
            this.f110590O = false;
            this.f110583H = 0;
            this.f110591P = false;
            this.f110580E = true;
        }
        this.f110616t = 0;
        this.f110608l = 0L;
        this.f110584I = 0L;
        this.f110607k = 0L;
        this.f110610n = false;
        this.f110611o = false;
        this.f110609m = 0;
        this.f110613q = false;
        this.f110612p = -1;
        this.f110585J = false;
        this.f110614r = false;
        this.f110594S = false;
        this.f110619w = false;
        this.f110620x = false;
        this.f110595T = false;
        this.f110622z = 0;
        this.f110576A = 0;
        this.f110596U = false;
        this.f110577B = false;
        this.f110578C = true;
        this.f110579D = 0;
        this.f110617u = 1;
        C21334l.f103899A.m110501b();
    }

    /* renamed from: W */
    public void m116873W(boolean z11) {
        this.f110589N = z11;
    }

    /* renamed from: X */
    public void m116874X(long j11) {
        this.f110607k = j11;
    }

    /* renamed from: Y */
    public void m116875Y(int i11) {
        this.f110600d = i11;
    }

    /* renamed from: Z */
    public void m116876Z(int i11) {
        this.f110588M = i11;
    }

    /* renamed from: a */
    public boolean m116877a() {
        return this.f110580E;
    }

    /* renamed from: a0 */
    public void m116878a0(long j11) {
        this.f110608l = j11;
    }

    /* renamed from: b */
    public void m116879b() {
        this.f110586K.clear();
        this.f110587L.clear();
    }

    /* renamed from: b0 */
    public void m116880b0(boolean z11) {
        this.f110620x = z11;
    }

    /* renamed from: c */
    public long m116881c() {
        return this.f110607k;
    }

    /* renamed from: c0 */
    public void m116882c0(boolean z11) {
        this.f110590O = z11;
    }

    /* renamed from: d */
    public int m116883d() {
        return this.f110600d;
    }

    /* renamed from: d0 */
    public void m116884d0(int i11) {
        this.f110598b = i11;
    }

    /* renamed from: e */
    public int m116885e() {
        return this.f110588M;
    }

    /* renamed from: e0 */
    public void m116886e0(boolean z11) {
        this.f110613q = z11;
    }

    /* renamed from: f */
    public int m116887f() {
        return this.f110598b;
    }

    /* renamed from: f0 */
    public void m116888f0(boolean z11) {
        this.f110580E = z11;
    }

    /* renamed from: g */
    public long m116889g() {
        return this.f110584I;
    }

    /* renamed from: g0 */
    public void m116890g0(boolean z11) {
        this.f110585J = z11;
    }

    /* renamed from: h */
    public int m116891h() {
        return this.f110597a;
    }

    /* renamed from: h0 */
    public void m116892h0(long j11) {
        this.f110584I = j11;
    }

    /* renamed from: i */
    public int m116893i() {
        int i11 = this.f110576A;
        if (i11 < 4) {
            return 4;
        }
        return Math.min(i11, 6);
    }

    /* renamed from: i0 */
    public void m116894i0(boolean z11) {
        this.f110619w = z11;
    }

    /* renamed from: j */
    public String m116895j() {
        return this.f110606j;
    }

    /* renamed from: j0 */
    public void m116896j0(int i11) {
        this.f110597a = i11;
    }

    /* renamed from: k */
    public int m116897k() {
        return this.f110601e;
    }

    /* renamed from: k0 */
    public void m116898k0(boolean z11) {
        this.f110593R = z11;
    }

    /* renamed from: l */
    public String m116899l() {
        return this.f110605i;
    }

    /* renamed from: l0 */
    public void m116900l0(int i11) {
        this.f110583H = i11;
    }

    /* renamed from: m */
    public int m116901m() {
        return this.f110602f;
    }

    /* renamed from: m0 */
    public void m116902m0(int i11) {
        this.f110576A = i11;
    }

    /* renamed from: n */
    public int m116903n() {
        return this.f110621y;
    }

    /* renamed from: n0 */
    public void m116904n0(String str) {
        this.f110606j = str;
    }

    /* renamed from: o */
    public List m116905o() {
        return this.f110581F;
    }

    /* renamed from: o0 */
    public void m116906o0(int i11) {
        this.f110601e = i11;
    }

    /* renamed from: p */
    public int m116907p() {
        return this.f110612p;
    }

    /* renamed from: p0 */
    public void m116908p0(String str) {
        this.f110605i = str;
    }

    /* renamed from: q */
    public String m116909q() {
        int m116885e = m116885e();
        if (m116885e != 1 && m116885e != 2) {
            if (m116885e != 3) {
                if (m116885e != 4) {
                    if (m116885e != 6) {
                        if (m116885e == 7) {
                            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_groupcall_join_call_status);
                        }
                    } else {
                        return AbstractC23136l9.m118743r0(AbstractC8020f0.call_state_disconnected);
                    }
                } else {
                    return AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_accept_view_status);
                }
            } else {
                C25942f c25942f = (C25942f) C19577z.m102341J().m102392S().get(Integer.valueOf(this.f110598b));
                if (c25942f != null) {
                    return String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_groupcall_incoming_call_status), c25942f.m133657g(10));
                }
            }
        } else {
            int i11 = this.f110616t;
            if (i11 == 1) {
                return AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_groupcall_dial_call_status);
            }
            if (i11 >= 2) {
                return AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_groupcall_ring_call_status);
            }
            if (i11 < 1) {
                return AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_groupcall_connect_call_status);
            }
        }
        return "";
    }

    /* renamed from: q0 */
    public void m116910q0(int i11) {
        this.f110602f = i11;
    }

    /* renamed from: r */
    public int m116911r() {
        return this.f110617u;
    }

    /* renamed from: r0 */
    public void m116912r0(boolean z11) {
        this.f110611o = z11;
    }

    /* renamed from: s */
    public int m116913s() {
        return this.f110622z;
    }

    /* renamed from: s0 */
    public void m116914s0(boolean z11) {
        this.f110577B = z11;
    }

    /* renamed from: t */
    public String m116915t() {
        return this.f110604h;
    }

    /* renamed from: t0 */
    public void m116916t0(int i11) {
        this.f110621y = i11;
    }

    /* renamed from: u */
    public String m116917u() {
        return this.f110603g;
    }

    /* renamed from: u0 */
    public void m116918u0(List list) {
        this.f110581F = new ArrayList(list);
    }

    /* renamed from: v */
    public int m116919v() {
        return this.f110579D;
    }

    /* renamed from: v0 */
    public void m116920v0(int i11) {
        this.f110612p = i11;
    }

    /* renamed from: w */
    public int m116921w() {
        return this.f110616t;
    }

    /* renamed from: w0 */
    public void m116922w0(int i11) {
        this.f110617u = i11;
    }

    /* renamed from: x */
    public int m116923x() {
        return this.f110618v;
    }

    /* renamed from: x0 */
    public void m116924x0(boolean z11) {
        this.f110578C = z11;
    }

    /* renamed from: y */
    public boolean m116925y() {
        return this.f110589N;
    }

    /* renamed from: y0 */
    public void m116926y0(boolean z11) {
        this.f110594S = z11;
    }

    /* renamed from: z */
    public boolean m116927z() {
        int i11 = this.f110588M;
        return i11 == 6 || i11 == 0;
    }

    /* renamed from: z0 */
    public void m116928z0(int i11) {
        this.f110622z = i11;
    }
}
