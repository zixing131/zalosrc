package sx;

import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.zinstant.C17244x0;
import dj.C17945a0;
import dj.C17969i0;
import dj.C17979l1;
import java.util.List;
import org.json.JSONObject;
import p386ob.EnumC24194e;
import p471r3.C25630b;
import p559uv.C27373c;
import p716zh.C31986k3;
import p716zh.C32027n;
import p716zh.C32094r9;
import tj.C26713e;

/* renamed from: sx.f */
/* loaded from: classes4.dex */
public class C26404f {

    /* renamed from: A */
    private String f125419A;

    /* renamed from: B */
    public double f125420B;

    /* renamed from: C */
    public double f125421C;

    /* renamed from: D */
    public String f125422D;

    /* renamed from: E */
    public String f125423E;

    /* renamed from: F */
    public String f125424F;

    /* renamed from: G */
    public String f125425G;

    /* renamed from: H */
    public String f125426H;

    /* renamed from: I */
    public boolean f125427I;

    /* renamed from: J */
    public boolean f125428J;

    /* renamed from: K */
    public int f125429K;

    /* renamed from: L */
    private String f125430L;

    /* renamed from: M */
    public List f125431M;

    /* renamed from: N */
    public boolean f125432N;

    /* renamed from: O */
    public boolean f125433O;

    /* renamed from: P */
    public List f125434P;

    /* renamed from: Q */
    public String f125435Q;

    /* renamed from: R */
    public long f125436R;

    /* renamed from: S */
    public long f125437S;

    /* renamed from: T */
    public String f125438T;

    /* renamed from: U */
    public long f125439U;

    /* renamed from: V */
    public JSONObject f125440V;

    /* renamed from: W */
    public C17244x0 f125441W;

    /* renamed from: X */
    public List f125442X;

    /* renamed from: Y */
    public C32027n f125443Y;

    /* renamed from: Z */
    public boolean f125444Z;

    /* renamed from: a */
    private int f125445a;

    /* renamed from: b */
    private String f125446b;

    /* renamed from: c */
    private String f125447c;

    /* renamed from: d */
    private String f125448d;

    /* renamed from: e */
    private C26405g f125449e;

    /* renamed from: f */
    private C27373c f125450f;

    /* renamed from: g */
    public C17969i0 f125451g;

    /* renamed from: h */
    public C17945a0 f125452h;

    /* renamed from: i */
    public boolean f125453i;

    /* renamed from: j */
    public boolean f125454j;

    /* renamed from: k */
    public boolean f125455k;

    /* renamed from: l */
    public ContactProfile f125456l;

    /* renamed from: m */
    private C17979l1 f125457m;

    /* renamed from: n */
    public C26713e f125458n;

    /* renamed from: o */
    private List f125459o;

    /* renamed from: p */
    public boolean f125460p;

    /* renamed from: q */
    public C26399a f125461q;

    /* renamed from: r */
    public boolean f125462r;

    /* renamed from: s */
    public String f125463s;

    /* renamed from: t */
    public C25630b f125464t;

    /* renamed from: u */
    public String f125465u;

    /* renamed from: v */
    public String f125466v;

    /* renamed from: w */
    public int f125467w;

    /* renamed from: x */
    public int f125468x;

    /* renamed from: y */
    public String f125469y;

    /* renamed from: z */
    public String f125470z;

    public C26404f(int i11) {
        this.f125456l = null;
        this.f125460p = false;
        this.f125461q = new C26399a();
        this.f125462r = false;
        this.f125420B = 0.0d;
        this.f125421C = 0.0d;
        this.f125427I = false;
        this.f125429K = -1;
        this.f125430L = "";
        this.f125445a = i11;
        this.f125446b = "";
        this.f125447c = "";
        this.f125448d = "";
        this.f125449e = null;
        this.f125450f = null;
        this.f125453i = false;
        this.f125454j = false;
    }

    /* renamed from: a */
    public C26404f m136148a() {
        C26404f c26404f = new C26404f(this.f125445a);
        c26404f.m136172y(m136160m());
        c26404f.m136168u(m136155h());
        c26404f.m136170w(m136157j());
        c26404f.m136162o(m136149b());
        c26404f.f125444Z = this.f125444Z;
        c26404f.f125427I = this.f125427I;
        c26404f.f125458n = this.f125458n;
        c26404f.m136167t(m136154g());
        return c26404f;
    }

    /* renamed from: b */
    public String m136149b() {
        return this.f125446b;
    }

    /* renamed from: c */
    public String m136150c() {
        return this.f125444Z ? "share_outapp" : this.f125427I ? "chat_forward" : "chat_send";
    }

    /* renamed from: d */
    public String m136151d() {
        return this.f125419A;
    }

    /* renamed from: e */
    public List m136152e() {
        return this.f125459o;
    }

    /* renamed from: f */
    public List m136153f() {
        return this.f125431M;
    }

    /* renamed from: g */
    public C17979l1 m136154g() {
        return this.f125457m;
    }

    /* renamed from: h */
    public String m136155h() {
        return this.f125447c;
    }

    /* renamed from: i */
    public String m136156i() {
        return this.f125430L;
    }

    /* renamed from: j */
    public C26405g m136157j() {
        return this.f125449e;
    }

    /* renamed from: k */
    public EnumC24194e m136158k() {
        String str;
        C17945a0 c17945a0 = this.f125452h;
        if (c17945a0 != null) {
            str = c17945a0.mo95039W2();
        } else {
            List list = this.f125459o;
            if (list != null && !list.isEmpty() && this.f125459o.get(0) != null) {
                str = ((C17945a0) this.f125459o.get(0)).mo95039W2();
            } else {
                C32027n c32027n = this.f125443Y;
                if (c32027n != null) {
                    str = c32027n.m154462c();
                } else {
                    str = "";
                }
            }
        }
        if (str.isEmpty()) {
            return EnumC24194e.f116776q;
        }
        return C32094r9.m154848q(C31986k3.f147083a.m154105P1(str));
    }

    /* renamed from: l */
    public int m136159l() {
        return this.f125445a;
    }

    /* renamed from: m */
    public String m136160m() {
        return this.f125448d;
    }

    /* renamed from: n */
    public C27373c m136161n() {
        return this.f125450f;
    }

    /* renamed from: o */
    public void m136162o(String str) {
        this.f125446b = str;
    }

    /* renamed from: p */
    public void m136163p(String str) {
        this.f125419A = str;
    }

    /* renamed from: q */
    public void m136164q(List list) {
        this.f125442X = list;
    }

    /* renamed from: r */
    public void m136165r(C26713e c26713e) {
        this.f125458n = c26713e;
    }

    /* renamed from: s */
    public void m136166s(List list) {
        this.f125459o = list;
        this.f125427I = true;
    }

    /* renamed from: t */
    public void m136167t(C17979l1 c17979l1) {
        this.f125457m = c17979l1;
    }

    /* renamed from: u */
    public void m136168u(String str) {
        this.f125447c = str;
    }

    /* renamed from: v */
    public void m136169v(String str) {
        this.f125430L = str;
    }

    /* renamed from: w */
    public void m136170w(C26405g c26405g) {
        this.f125449e = c26405g;
    }

    /* renamed from: x */
    public void m136171x(int i11) {
        this.f125445a = i11;
    }

    /* renamed from: y */
    public void m136172y(String str) {
        this.f125448d = str;
    }

    /* renamed from: z */
    public void m136173z(C27373c c27373c) {
        this.f125450f = c27373c;
    }

    public C26404f(List list) {
        this(16);
        this.f125431M = list;
    }
}
