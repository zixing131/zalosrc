package gp0;

import ag0.AbstractC0837p0;
import android.os.Build;
import android.text.TextUtils;
import bp0.AbstractC3082b0;
import bp0.AbstractC3096i0;
import bp0.AbstractC3103o;
import bp0.C3084c0;
import bp0.C3091g;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7962g;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalocore.CoreUtility;
import dg0.AbstractC17930e;
import ho0.AbstractC20110a;
import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import je.C21228a;
import lo0.AbstractC22623r0;
import lo0.C22600g;
import lo0.C22602h;
import lo0.C22604i;
import lo0.C22621q0;
import lo0.C22625s0;
import lo0.C22626t;
import lo0.C22627u;
import lo0.C22628v;
import me0.C23055e5;
import nh0.C23793c;
import org.json.JSONObject;
import org.webrtc.EglBase;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
import p097db.AbstractC17849h;
import p097db.C17842a;
import p097db.C17843b;
import p097db.C17848g;
import p097db.EnumC17852k;
import p135em.C18489c;
import p304ks.AbstractC21935u;
import p321le.C22454e;
import p348mi.AbstractC23304d;
import p428pu.AbstractC24910b;
import p445qe.C25244a;
import qo0.C25447g;
import ro0.AbstractRunnableC25943g;
import ro0.C25947k;
import vg.C28203u6;
import zm.voip.service.AbstractC32273e3;
import zm.voip.service.BatteryInfoHelper;
import zm.voip.service.C32246a;
import zm.voip.service.C32252b;
import zm.voip.service.C32257b4;
import zm.voip.service.C32299k;
import zm.voip.service.C32318n3;
import zm.voip.service.C32319o;
import zm.voip.service.C32354v;
import zm.voip.service.HandlerC32324p;
import zm.voip.service.VoipAudioHelper;

/* renamed from: gp0.o0 */
/* loaded from: classes7.dex */
public class C19561o0 extends AbstractC19573v {

    /* renamed from: A */
    private int f97098A;

    /* renamed from: B */
    private JSONObject f97099B;

    /* renamed from: C */
    private boolean f97100C;

    /* renamed from: D */
    private boolean f97101D;

    /* renamed from: E */
    private boolean f97102E;

    /* renamed from: F */
    private int f97103F;

    /* renamed from: O */
    private String f97112O;

    /* renamed from: P */
    private String f97113P;

    /* renamed from: T */
    private int f97117T;

    /* renamed from: d */
    private ScheduledFuture f97121d;

    /* renamed from: e */
    private ScheduledFuture f97122e;

    /* renamed from: f */
    private ScheduledFuture f97123f;

    /* renamed from: g */
    private ScheduledFuture f97124g;

    /* renamed from: h */
    private ScheduledFuture f97125h;

    /* renamed from: u */
    private long f97138u;

    /* renamed from: v */
    private long f97139v;

    /* renamed from: z */
    private int f97143z;

    /* renamed from: c */
    private int f97120c = 0;

    /* renamed from: i */
    private String f97126i = null;

    /* renamed from: j */
    private String f97127j = null;

    /* renamed from: k */
    private String f97128k = null;

    /* renamed from: l */
    private int f97129l = 0;

    /* renamed from: m */
    private int f97130m = 0;

    /* renamed from: n */
    private int f97131n = 0;

    /* renamed from: o */
    private int f97132o = 0;

    /* renamed from: p */
    private boolean f97133p = false;

    /* renamed from: q */
    private int f97134q = 0;

    /* renamed from: r */
    private String f97135r = "";

    /* renamed from: s */
    private volatile boolean f97136s = false;

    /* renamed from: t */
    private boolean f97137t = false;

    /* renamed from: w */
    private long f97140w = 0;

    /* renamed from: x */
    private long f97141x = 0;

    /* renamed from: y */
    private long f97142y = -1;

    /* renamed from: G */
    private boolean f97104G = false;

    /* renamed from: H */
    private int f97105H = 0;

    /* renamed from: I */
    protected int f97106I = 0;

    /* renamed from: J */
    protected long f97107J = -1;

    /* renamed from: K */
    private boolean f97108K = false;

    /* renamed from: L */
    protected int f97109L = (int) System.currentTimeMillis();

    /* renamed from: M */
    protected long f97110M = 0;

    /* renamed from: N */
    private C25947k f97111N = null;

    /* renamed from: Q */
    private Object f97114Q = null;

    /* renamed from: R */
    private Object f97115R = null;

    /* renamed from: S */
    private int f97116S = 0;

    /* renamed from: U */
    private boolean f97118U = false;

    /* renamed from: b */
    private final Object f97119b = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gp0.o0$a */
    /* loaded from: classes7.dex */
    public class a extends AbstractRunnableC25943g {

        /* renamed from: p */
        final /* synthetic */ C19548i f97144p;

        a(C19548i c19548i) {
            this.f97144p = c19548i;
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            C19561o0.this.m102202G0(this.f97144p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gp0.o0$b */
    /* loaded from: classes7.dex */
    public class b extends AbstractRunnableC25943g {

        /* renamed from: p */
        final /* synthetic */ C19568s f97146p;

        b(C19568s c19568s) {
            this.f97146p = c19568s;
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            if (C19561o0.this.m102265m0(this.f97146p, false)) {
                C19561o0.this.m102202G0(this.f97146p);
            }
        }
    }

    /* renamed from: gp0.o0$c */
    /* loaded from: classes7.dex */
    class c extends AbstractRunnableC25943g {

        /* renamed from: p */
        final /* synthetic */ C19568s f97148p;

        /* renamed from: q */
        final /* synthetic */ boolean f97149q;

        c(C19568s c19568s, boolean z11) {
            this.f97148p = c19568s;
            this.f97149q = z11;
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            if (C19561o0.this.m102265m0(this.f97148p, this.f97149q)) {
                C19561o0.this.m102202G0(this.f97148p);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gp0.o0$d */
    /* loaded from: classes7.dex */
    public class d extends AbstractRunnableC25943g {
        d() {
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            C19561o0.this.m102279w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gp0.o0$e */
    /* loaded from: classes7.dex */
    public class e extends AbstractRunnableC25943g {
        e() {
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            C19561o0.this.m102233X();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gp0.o0$f */
    /* loaded from: classes7.dex */
    public static class f {

        /* renamed from: a */
        public static final C19561o0 f97153a = new C19561o0();
    }

    /* renamed from: gp0.o0$g */
    /* loaded from: classes7.dex */
    public static class g {
        /* renamed from: a */
        public static String m102286a(int i11) {
            if (i11 == 0) {
                return "READY_TO_CALL";
            }
            switch (i11) {
                case 2:
                    return "READY_OUTGOING_CALL";
                case 3:
                    return "INCOMING_CALL";
                case 4:
                    return "INCOMING_CALL_ANSWERING";
                case 5:
                    return "OUTGOING_CALL";
                case 6:
                    return "OUTGOING_CALL_CANCELING";
                case 7:
                    return "IN_CALL";
                default:
                    return "NOT_DEFINED";
            }
        }
    }

    C19561o0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0 */
    public /* synthetic */ void m102159A0(long j11, long j12) {
        int i11;
        AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "CallerCheckSent416Timer timer timeout!!!");
        synchronized (this) {
            try {
                if (m102247d0() && j11 == this.f97109L && j12 == this.f97107J && (((i11 = this.f97120c) <= 2 || i11 == 5) && !C32257b4.m155726m().m155737l().m117017D0())) {
                    AbstractC32273e3.m155748Q().m155895l1(1, AbstractC8020f0.init_zrtp_caller_failed);
                    mo102340h(-3, "Session timed out!");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B0 */
    public /* synthetic */ void m102160B0(int i11) {
        AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "Session timer timeout!!!");
        synchronized (this) {
            try {
                C22626t m155737l = C32257b4.m155726m().m155737l();
                int m117157s = m155737l.m117157s();
                if (!m102247d0() && m117157s != 163) {
                    if (m117157s == 161) {
                        m155737l.m117180z1(162);
                    } else if (m117157s == 158) {
                        m155737l.m117180z1(159);
                        m102161L().m102204H0(new C19534b(m102161L().m102216O(), 402, i11, 6));
                    } else if (m117157s == 156) {
                        m155737l.m117180z1(157);
                        m102161L().m102204H0(new C19534b(m102161L().m102216O(), 402, i11, 6));
                    }
                }
                mo102340h(-4, "Session timed out!");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: L */
    public static C19561o0 m102161L() {
        return f.f97153a;
    }

    /* renamed from: W */
    private void m102162W() {
        try {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: gp0.k0
                @Override // java.lang.Runnable
                public final void run() {
                    C19561o0.this.m102175r0();
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public /* synthetic */ void m102171p0() {
        try {
            try {
                AbstractC3082b0.m15424f(AbstractC19573v.f97206a, "Dismiss call screen calleeZaloId = " + this.f97107J);
                AbstractC32273e3.m155748Q().m155913r1();
            } catch (Exception e11) {
                AbstractC3082b0.m15423e(AbstractC19573v.f97206a, "dismissCallScreen: " + e11.getMessage(), e11);
            }
        } finally {
            AbstractC3096i0.m15510Q0(false);
            m102161L().m102258i1(false);
            m102161L().m102285z1();
            AbstractC3096i0.f13160d = false;
            C32257b4.m155726m().m155737l().m117056Q0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0 */
    public static /* synthetic */ int m102173q0(File file, File file2) {
        return Long.compare(file2.lastModified(), file.lastModified());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public /* synthetic */ void m102175r0() {
        File[] m102185y;
        if (C17843b.m94137o().m94213z() && (m102185y = m102185y()) != null) {
            int length = m102185y.length;
            int i11 = AbstractC23304d.f113275F1;
            if (length > i11) {
                while (i11 < m102185y.length) {
                    File file = m102185y[i11];
                    if (file.exists()) {
                        file.delete();
                    }
                    i11++;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public static /* synthetic */ void m102177s0() {
        C32319o.m156293t().m156324m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0 */
    public static /* synthetic */ void m102179t0() {
        C32319o.m156293t().m156324m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0 */
    public static /* synthetic */ void m102181u0() {
        m102161L().m102233X();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public static /* synthetic */ void m102182v0(C22626t c22626t, C21228a c21228a, String str) {
        if (c21228a.m110002b().equals(String.valueOf(c22626t.m117028H()))) {
            c22626t.m117078X1(c21228a);
            AbstractC32273e3.m155748Q().mo155940y1(c21228a.m110002b(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public static /* synthetic */ void m102183w0() {
        AbstractC32273e3.m155748Q().m155910q1();
        AbstractC3096i0.m15510Q0(false);
        m102161L().m102258i1(false);
        m102161L().m102285z1();
        AbstractC3096i0.f13160d = false;
        C32257b4.m155726m().m155737l().m117056Q0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public /* synthetic */ void m102184x0() {
        AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "CalleePreConnect timer timeout!!!");
        synchronized (this) {
            try {
                if (!m102247d0() && this.f97120c == 4) {
                    C32319o.m156293t().m156308W();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: y */
    private File[] m102185y() {
        File m15493I;
        File[] fileArr = new File[0];
        try {
            m15493I = AbstractC3096i0.m15493I(AbstractC3096i0.m15574y());
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        if (m15493I == null) {
            return fileArr;
        }
        fileArr = m15493I.listFiles();
        if (fileArr == null) {
            return null;
        }
        Arrays.sort(fileArr, new Comparator() { // from class: gp0.d0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m102173q0;
                m102173q0 = C19561o0.m102173q0((File) obj, (File) obj2);
                return m102173q0;
            }
        });
        return fileArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public /* synthetic */ void m102186y0() {
        AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "CallerCheckInCall timer timeout!!!");
        synchronized (this) {
            try {
                if (m102247d0() && !m102253g0()) {
                    mo102340h(-4, "Session timed out!");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public /* synthetic */ void m102187z0() {
        AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "CallerCheckRingring timer timeout!!!");
        synchronized (this) {
            try {
                if (m102247d0() && m102249e0(5) && !C32257b4.m155726m().m155737l().m117008A0()) {
                    mo102340h(-4, "Session timed out!");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: A */
    public JSONObject m102188A() {
        return this.f97099B;
    }

    /* renamed from: A1 */
    public void m102189A1(C22626t c22626t) {
        if (c22626t != null) {
            c22626t.m117095c1(this.f97108K);
            c22626t.m117060R1(this.f97107J);
            c22626t.m117140n2(this.f97109L);
            c22626t.m117074W0(m102195D());
        }
    }

    /* renamed from: B */
    public int m102190B() {
        return this.f97109L;
    }

    /* renamed from: B1 */
    public void m102191B1(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str3)) {
            this.f97126i = str3;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f97127j = str;
            this.f97128k = str2;
        }
    }

    /* renamed from: C */
    public String m102192C() {
        return this.f97113P;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:2:0x0000, B:5:0x000e, B:7:0x0012, B:8:0x0027, B:10:0x002b, B:12:0x002f, B:13:0x0036, B:15:0x003a, B:16:0x0040, B:20:0x001b, B:22:0x001f), top: B:1:0x0000 }] */
    /* renamed from: C0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m102193C0() {
        String str;
        Object obj;
        try {
            String m94168c = C17843b.m94137o().m94168c();
            Object obj2 = this.f97114Q;
            String str2 = "";
            if (obj2 != null) {
                if (obj2 instanceof TextureViewRenderer) {
                    str = ((TextureViewRenderer) obj2).getErrorTrace();
                } else if (obj2 instanceof SurfaceViewRenderer) {
                    str = ((SurfaceViewRenderer) obj2).getErrorTrace();
                }
                obj = this.f97115R;
                if (obj != null) {
                    if (obj instanceof TextureViewRenderer) {
                        str2 = ((TextureViewRenderer) obj).getErrorTrace();
                    } else if (obj instanceof SurfaceViewRenderer) {
                        str2 = ((SurfaceViewRenderer) obj).getErrorTrace();
                    }
                }
                String str3 = "nativeLogTrace = " + m94168c + " captureViewLog = " + str + " renderViewLog = " + str2;
                AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "DebugFreeze: " + str3);
            }
            str = "";
            obj = this.f97115R;
            if (obj != null) {
            }
            String str32 = "nativeLogTrace = " + m94168c + " captureViewLog = " + str + " renderViewLog = " + str2;
            AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "DebugFreeze: " + str32);
        } catch (Exception e11) {
            AbstractC3082b0.m15424f(AbstractC19573v.f97206a, "logDebugStackTrace fail " + e11.toString());
        }
    }

    /* renamed from: C1 */
    void m102194C1() {
        try {
            C22626t m155737l = C32257b4.m155726m().m155737l();
            if (C17843b.m94137o().m94199s(new String[100]) && this.f97111N != null) {
                int m117013C = (int) m155737l.m117013C();
                int m117097d = (int) m155737l.m117097d();
                int m117055Q = m155737l.m117055Q();
                String m97849k = C18489c.m97849k(C7962g.c.a.QOS_TALK_S);
                AbstractC32273e3.m155748Q().mo155847S2(m97849k + this.f97111N.f123735h, m117055Q, m102161L().m102214N(), m117013C, m117097d, AbstractC3096i0.m15572x());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: D */
    public int m102195D() {
        return 3;
    }

    /* renamed from: D0 */
    public C22626t m102196D0() {
        C22626t c22626t = new C22626t();
        m102189A1(c22626t);
        return c22626t;
    }

    /* renamed from: E */
    public String m102197E() {
        return this.f97112O;
    }

    /* renamed from: E0 */
    boolean m102198E0(AbstractC19542f abstractC19542f) {
        boolean z11;
        if (AbstractC19573v.m102338f(415, abstractC19542f)) {
            int m102330e = ((C19568s) abstractC19542f).m102330e();
            AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "Partner receive incoming from " + m102330e);
            if (m102330e == 1) {
                C32257b4.m155726m().m155737l().m117112g2(2);
                C17843b.m94137o().m94150M(EnumC17852k.RECEIVED_415_SOCKET.ordinal());
            } else {
                C32257b4.m155726m().m155737l().m117112g2(3);
                C17843b.m94137o().m94150M(EnumC17852k.RECEIVED_415_NOTI.ordinal());
            }
            AbstractC32273e3.m155748Q().mo155898m1();
            m102278v1(AbstractC32273e3.m155748Q().f148910x);
            AbstractC32273e3.m155748Q().mo155902n2();
        } else {
            if (AbstractC19573v.m102338f(407, abstractC19542f)) {
                if (C32257b4.m155726m().m155737l().m117037K() < 4) {
                    C32257b4.m155726m().m155737l().m117112g2(4);
                    C17843b.m94137o().m94150M(EnumC17852k.RECEIVED_407.ordinal());
                    AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "Changing state from CALLING TO RINGING");
                }
                if (abstractC19542f instanceof C19570t) {
                    C17843b.m94137o().m94210x0(((C19570t) abstractC19542f).m102332g());
                }
                return true;
            }
            if (abstractC19542f instanceof C19540e) {
                C19540e c19540e = (C19540e) abstractC19542f;
                int m102330e2 = c19540e.m102330e();
                C22626t m155737l = C32257b4.m155726m().m155737l();
                if (1 != m102330e2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                m155737l.m117066T1(z11);
                AbstractC3082b0.m15424f(AbstractC19573v.f97206a, "AnswerCallResponse responseCode: " + m102330e2);
                if (m102330e2 != 0) {
                    if (m102330e2 != 1 && m102330e2 != 3 && m102330e2 != 5 && m102330e2 != 6) {
                        return false;
                    }
                    AbstractC22623r0.m117005b(AbstractC3096i0.m15574y(), 403, m102330e2);
                    if (m102330e2 == 1) {
                        C32257b4.m155726m().m155737l().m117180z1(-3);
                    } else if (m102330e2 == 5) {
                        C32257b4.m155726m().m155737l().m117180z1(-5);
                    } else if (m102330e2 == 6) {
                        C32257b4.m155726m().m155737l().m117180z1(-16);
                        C17843b.m94137o().m94150M(EnumC17852k.CANCEL_TIMEOUT.ordinal());
                    } else {
                        C32257b4.m155726m().m155737l().m117180z1(-4);
                    }
                    if (m102330e2 == 1 || m102330e2 == 3) {
                        C32319o.m156293t().m156311Z();
                    }
                    mo102242b(false);
                    return true;
                }
                AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "Changing state from RINGING TO CONNECTING");
                m102200F0(c19540e);
                return true;
            }
            if (AbstractC19573v.m102337e(408, 4080, abstractC19542f)) {
                return true;
            }
            if (AbstractC19573v.m102337e(408, -4080, abstractC19542f)) {
                this.f97131n++;
                if (AbstractC32273e3.m155748Q().mo155794E(this.f97131n)) {
                    AbstractC32273e3.m155748Q().mo155813I2((int) this.f97107J, this.f97109L, 0);
                }
                return true;
            }
            if (AbstractC19573v.m102336d(409, abstractC19542f)) {
                this.f97120c = 6;
                AbstractC3082b0.m15424f(AbstractC19573v.f97206a, "END CALL!!!");
                mo102242b(false);
                return true;
            }
            if (AbstractC19573v.m102338f(409, abstractC19542f)) {
                AbstractC3082b0.m15424f(AbstractC19573v.f97206a, "END CALL by receiving VOICE_END_CALL!!!");
                mo102242b(false);
                return true;
            }
            if (AbstractC19573v.m102337e(416, 4160, abstractC19542f)) {
                if ((abstractC19542f instanceof C19568s) && ((C19568s) abstractC19542f).mo102120f() == 1) {
                    C32257b4.m155726m().m155737l().m117180z1(114);
                }
                C32257b4.m155726m().m155737l().m117112g2(1);
                C17843b.m94137o().m94150M(EnumC17852k.SEND_416_SUCCESS.ordinal());
                AbstractC32273e3.m155748Q().mo155898m1();
                m102280w1(AbstractC32273e3.m155748Q().f148909w);
                AbstractC32273e3.m155748Q().mo155902n2();
                return true;
            }
            if (AbstractC19573v.m102337e(416, -4160, abstractC19542f)) {
                this.f97129l++;
                if (AbstractC32273e3.m155748Q().mo155798F(this.f97129l)) {
                    AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "voiceRequestZRTPRetryTimes " + this.f97129l);
                    AbstractC32273e3.m155748Q().mo155842Q2((int) this.f97107J, this.f97109L, m102212M(), this.f97127j, this.f97128k, this.f97126i, m102201G(), m102267n0(), m102222R());
                } else {
                    AbstractC3082b0.m15422d(AbstractC19573v.f97206a, "VOICE_REQUEST_CALL_ZRTP_FAILED full retry");
                    if (C23055e5.m118270e()) {
                        AbstractC32273e3.m155748Q().m155895l1(1, AbstractC8020f0.call_416_wifi_connect_error);
                    } else {
                        AbstractC32273e3.m155748Q().m155895l1(1, AbstractC8020f0.call_416_3g_connect_error);
                    }
                    mo102242b(false);
                }
                return true;
            }
            if (AbstractC19573v.m102338f(300, abstractC19542f)) {
                m102281x(true);
                return true;
            }
        }
        return false;
    }

    /* renamed from: F */
    public int m102199F() {
        return this.f97105H;
    }

    /* renamed from: F0 */
    boolean m102200F0(C19540e c19540e) {
        try {
            m102241a1(c19540e.m102116i());
            C17848g c17848g = new C17848g();
            c17848g.m94290c(c19540e.m102115h());
            c17848g.m94291d(c19540e.m102114g());
            C32319o.m156293t().m156319h0();
            C32319o.m156293t().m156316e0();
            if (C17843b.m94137o().m94206v0(c17848g, "")) {
                m102281x(true);
            } else {
                AbstractC3082b0.m15422d(AbstractC19573v.f97206a, "Codec negotiation failed. No accepted codec found!");
                mo102242b(false);
            }
            return true;
        } catch (Exception e11) {
            AbstractC3082b0.m15423e(AbstractC19573v.f97206a, "outgoingToConnecting: " + e11.getMessage(), e11);
            return false;
        }
    }

    /* renamed from: G */
    String m102201G() {
        return C17843b.m94137o().m94188m();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: G0 */
    boolean m102202G0(AbstractC19542f abstractC19542f) {
        boolean z11;
        AbstractC3082b0.m15421c(AbstractC19573v.f97206a, g.m102286a(this.f97120c) + ": processing " + AbstractC19573v.m102339g(abstractC19542f) + ", Zalo id = " + this.f97106I + ", Peer id = " + this.f97107J + ", Call id = " + this.f97109L + ", Session id = " + this.f97126i + ", Rtp address = " + this.f97127j);
        synchronized (this.f97119b) {
            z11 = false;
            try {
                try {
                    switch (this.f97120c) {
                        case 0:
                            boolean m102210K0 = m102210K0(abstractC19542f);
                            if (!m102210K0) {
                                try {
                                    mo102242b(false);
                                } catch (Exception e11) {
                                    z11 = m102210K0;
                                    e = e11;
                                    AbstractC3082b0.m15423e(AbstractC19573v.f97206a, "process BaseEvent : " + e.getMessage(), e);
                                    return z11;
                                }
                            }
                            z11 = m102210K0;
                        case 1:
                            z11 = m102211L0(abstractC19542f);
                            break;
                        case 2:
                            z11 = m102213M0(abstractC19542f);
                            break;
                        case 3:
                            z11 = m102240a0(abstractC19542f);
                            break;
                        case 4:
                            z11 = m102243b0(abstractC19542f);
                            break;
                        case 5:
                            z11 = m102198E0(abstractC19542f);
                            break;
                        case 7:
                            z11 = m102237Z(abstractC19542f);
                            break;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            } finally {
            }
        }
        return z11;
    }

    /* renamed from: H */
    String m102203H() {
        return C17843b.m94137o().m94190n();
    }

    /* renamed from: H0 */
    public void m102204H0(C19548i c19548i) {
        HandlerC32324p.m156351d(new a(c19548i));
    }

    /* renamed from: I */
    public String m102205I() {
        return this.f97135r;
    }

    /* renamed from: I0 */
    public void m102206I0(C19568s c19568s) {
        if (m102265m0(c19568s, false)) {
            HandlerC32324p.m156351d(new b(c19568s));
        }
    }

    /* renamed from: J */
    public long m102207J() {
        return this.f97141x;
    }

    /* renamed from: J0 */
    public void m102208J0(C19568s c19568s, boolean z11) {
        if (m102265m0(c19568s, z11)) {
            HandlerC32324p.m156351d(new c(c19568s, z11));
        }
    }

    /* renamed from: K */
    public long m102209K() {
        return this.f97140w;
    }

    /* renamed from: K0 */
    boolean m102210K0(AbstractC19542f abstractC19542f) {
        JSONObject jSONObject;
        C25447g c25447g;
        boolean z11 = false;
        if (AbstractC19573v.m102336d(401, abstractC19542f)) {
            if (((C19548i) abstractC19542f).f97038r == 1) {
                z11 = true;
            }
            AbstractC3082b0.m15424f(AbstractC19573v.f97206a, "readyForCall VOICE_REQUEST_CALL");
            this.f97120c = 1;
            C32252b.m155705e().m155712g();
            AbstractC32273e3.m155748Q().mo155909q0(z11);
            C17843b.m94137o().m94169c0(AbstractC32273e3.m155748Q().m155829N().getEglBaseContext());
            return C17843b.m94137o().m94205v("");
        }
        if (abstractC19542f instanceof C19552k) {
            this.f97120c = 3;
            C19552k c19552k = (C19552k) abstractC19542f;
            if (this.f97107J == -1) {
                AbstractC3082b0.m15422d(AbstractC19573v.f97206a, "IncomingCallCommand Invalid peerId");
                m102285z1();
                m102215N0();
                return false;
            }
            this.f97126i = c19552k.m102130l();
            this.f97127j = c19552k.m102128j();
            this.f97128k = c19552k.m102127i();
            m102283y1(c19552k.m102132n());
            C32252b.m155705e().m155712g();
            try {
                AbstractC3082b0.m15424f(AbstractC19573v.f97206a, "Calling onIncomingCall with CallID=" + this.f97109L + " ZaloID=" + this.f97106I + " PeerID=" + this.f97107J);
                C17842a c17842a = new C17842a();
                c17842a.m94127m(3);
                c17842a.m94125k((int) this.f97107J);
                c17842a.m94129o(this.f97126i);
                c17842a.m94132r(this.f97106I);
                c17842a.m94134t(this.f97109L);
                c17842a.m94131q(this.f97104G);
                c17842a.m94133s(m102267n0());
                c17842a.m94121g(c19552k.m102124f());
                c17842a.m94119e(false);
                try {
                    if (c19552k.m102131m() != null && c19552k.m102134p()) {
                        c19552k.m102131m().put("isSlowEncode", 1);
                        c19552k.m102131m().put("resSlowEncode", c19552k.m102126h());
                    }
                } catch (Exception e11) {
                    AbstractC3082b0.m15423e(AbstractC19573v.f97206a, "readyForCall: " + e11.getMessage(), e11);
                }
                c17842a.m94118d(AbstractC3096i0.m15501M(c19552k.m102131m()));
                m102232W0(c17842a, abstractC19542f);
                c17842a.m94135u(AbstractC3096i0.m15501M(c19552k.m102133o()));
                c17842a.m94124j(AbstractC3103o.m15614c());
                c17842a.m94117c(AbstractC32273e3.m155748Q().m155821L());
                c17842a.m94136v(AbstractC3096i0.m15491H(AbstractC3096i0.m15574y(), AbstractC24910b.m129570a(C23793c.m124316k().mo124310e(), "HH_mm_ss_dd_MM_yyyy")));
                this.f97112O = "";
                if (this.f97117T == 1) {
                    String m15483D = AbstractC3096i0.m15483D(AbstractC3096i0.m15574y(), String.valueOf(this.f97109L), String.valueOf(this.f97106I), String.valueOf(this.f97107J));
                    this.f97112O = m15483D;
                    c17842a.m94122h(m15483D);
                }
                c17842a.m94126l(C32257b4.m155726m().m155737l().m117085a());
                C17848g c17848g = new C17848g();
                c17848g.m94290c(c19552k.m102122d());
                c17848g.m94291d(c19552k.m102123e());
                C17843b.m94137o().m94169c0(AbstractC32273e3.m155748Q().m155829N().getEglBaseContext());
                C17843b.m94137o().m94163Z(c19552k.m102129k());
                C32257b4.m155726m().m155737l().m117180z1(154);
                boolean m94203u = C17843b.m94137o().m94203u(c17842a, c17848g, this.f97127j, this.f97128k, c19552k.m102125g());
                if (!m94203u) {
                    AbstractC3082b0.m15422d(AbstractC19573v.f97206a, "Cannot negotiate call");
                    if (m102161L().m102230V() == 1) {
                        C22626t m102196D0 = m102196D0();
                        m102196D0.m117180z1(-154);
                        m102196D0.m117095c1(false);
                        m102236Y0(C17843b.m94137o().m94193p(0, 0, new JSONObject().toString()));
                        AbstractC32273e3.m155748Q().mo155858X1(new C22621q0(m102196D0));
                    }
                    m102285z1();
                    m102215N0();
                } else {
                    if (c19552k.m102133o() != null) {
                        jSONObject = c19552k.m102133o().optJSONObject("vidFilter");
                        AbstractC32273e3.m155748Q().mo155923u(jSONObject);
                    } else {
                        jSONObject = null;
                    }
                    EglBase.Context eglBaseContext = AbstractC32273e3.m155748Q().m155829N().getEglBaseContext();
                    if (jSONObject != null) {
                        c25447g = C25447g.m131799b(jSONObject);
                    } else {
                        c25447g = new C25447g(2, 1.0700000524520874d, 66);
                    }
                    if (eglBaseContext != null) {
                        AbstractC32273e3.m155748Q().mo155935x0(eglBaseContext, CoreUtility.getAppContext(), c25447g);
                    }
                    this.f97105H = C17843b.m94137o().m94211y() ? 1 : 0;
                    m102162W();
                    if (!C32257b4.m155726m().m155737l().m117085a() && m102267n0()) {
                        AbstractC32273e3.m155748Q().mo155781A2("Blocked", 15);
                    }
                }
                AbstractC3082b0.m15424f(AbstractC19573v.f97206a, "Call IncomingCall finish with res = " + m94203u);
            } catch (Exception e12) {
                AbstractC3082b0.m15423e(AbstractC19573v.f97206a, "readyForCall IncomingCallCommand: " + e12.getMessage(), e12);
                m102285z1();
                m102215N0();
            }
            return true;
        }
        if (!AbstractC19573v.m102336d(409, abstractC19542f) || m102216O() == -1) {
            return false;
        }
        AbstractC3082b0.m15424f(AbstractC19573v.f97206a, "VOICE_END_CALL in readyForCall: end call normally!");
        int m102119b = ((C19548i) abstractC19542f).m102119b();
        C22626t m102196D02 = m102196D0();
        m102196D02.m117180z1(m102119b);
        AbstractC32273e3.m155748Q().mo155858X1(new C22621q0(m102196D02));
        if (m102119b == -2) {
            z11 = true;
        }
        mo102242b(z11);
        return true;
    }

    /* renamed from: L0 */
    boolean m102211L0(AbstractC19542f abstractC19542f) {
        boolean z11;
        boolean z12;
        boolean z13;
        C25447g c25447g;
        boolean z14 = false;
        if (abstractC19542f instanceof C19564q) {
            AbstractC3082b0.m15424f(AbstractC19573v.f97206a, "readyForCall makeCallCommand");
            if (this.f97107J == -1) {
                AbstractC3082b0.m15422d(AbstractC19573v.f97206a, "Invalid peer Zalo Id!!! -> RETURN");
                return false;
            }
            C19564q c19564q = (C19564q) abstractC19542f;
            this.f97126i = c19564q.m102314s();
            if (!TextUtils.isEmpty(c19564q.m102310o()) && !TextUtils.isEmpty(this.f97126i)) {
                this.f97120c = 2;
                try {
                    AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "Calling makeCall to : " + this.f97107J);
                    C17842a c17842a = new C17842a();
                    c17842a.m94127m(3);
                    c17842a.m94125k((int) this.f97107J);
                    c17842a.m94129o(this.f97126i);
                    c17842a.m94132r(this.f97106I);
                    c17842a.m94134t(this.f97109L);
                    c17842a.m94131q(this.f97104G);
                    c17842a.m94133s(m102267n0());
                    c17842a.m94121g(c19564q.m102309n());
                    c17842a.m94119e(c19564q.m102320y());
                    try {
                        if (c19564q.m102315t() != null && c19564q.m102301B()) {
                            c19564q.m102315t().put("isSlowEncode", 1);
                            c19564q.m102315t().put("resSlowEncode", c19564q.m102311p());
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    c17842a.m94118d(AbstractC3096i0.m15501M(c19564q.m102315t()));
                    c17842a.m94135u(AbstractC3096i0.m15501M(c19564q.m102317v()));
                    c17842a.m94124j(AbstractC3103o.m15614c());
                    c17842a.m94117c(AbstractC32273e3.m155748Q().m155821L());
                    c17842a.m94120f(c19564q.m102308m());
                    c17842a.m94128n(0);
                    c17842a.m94123i(0);
                    c17842a.m94136v(AbstractC3096i0.m15491H(AbstractC3096i0.m15574y(), AbstractC24910b.m129570a(C23793c.m124316k().mo124310e(), "HH_mm_ss_dd_MM_yyyy")));
                    m102232W0(c17842a, abstractC19542f);
                    this.f97112O = "";
                    if (this.f97117T == 1) {
                        String m15483D = AbstractC3096i0.m15483D(AbstractC3096i0.m15574y(), String.valueOf(this.f97109L), String.valueOf(this.f97106I), String.valueOf(this.f97107J));
                        this.f97112O = m15483D;
                        c17842a.m94122h(m15483D);
                    }
                    c17842a.m94126l(C32257b4.m155726m().m155737l().m117085a());
                    C17843b.m94137o().m94163Z(c19564q.m102313r());
                    final C22626t m155737l = C32257b4.m155726m().m155737l();
                    m155737l.f110923f0 = true;
                    m155737l.m117091b1(c19564q.m102318w());
                    if (c19564q.m102316u() != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    m155737l.m117131l1(z11);
                    if (c19564q.m102307l() != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    m155737l.m117147p1(z12);
                    if (c19564q.m102306k() != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    m155737l.m117143o1(z13);
                    if (c19564q.m102304i() == 1) {
                        z14 = true;
                    }
                    m155737l.m117135m1(z14);
                    m155737l.m117108f2(c19564q.m102300A());
                    m155737l.m117042L1(c19564q.m102321z());
                    m155737l.m117077X0(c19564q.m102303h());
                    m155737l.m117148p2(c19564q.m102305j());
                    m155737l.m117144o2(c19564q.m102302g());
                    m155737l.m117139n1(c19564q.m102319x());
                    C17843b.m94137o().m94138A(c17842a, c19564q.m102310o());
                    if (!C32257b4.m155726m().m155737l().m117085a() && m102267n0()) {
                        AbstractC32273e3.m155748Q().mo155781A2("Blocked", 15);
                    }
                    C32246a.m155641D().m155687U(m102188A());
                    m155737l.m117081Y1(c19564q.m102312q());
                    JSONObject jSONObject = null;
                    if (c19564q.m102312q() > 0) {
                        new C22454e().m101508a(new C22454e.b(c19564q.m102312q(), new C22454e.a() { // from class: gp0.c0
                            @Override // p321le.C22454e.a
                            /* renamed from: a */
                            public final void mo102111a(C21228a c21228a, String str) {
                                C19561o0.m102182v0(C22626t.this, c21228a, str);
                            }
                        }));
                    } else {
                        m155737l.m117078X1(null);
                    }
                    if (m102267n0()) {
                        AbstractC17849h.m94303l(true);
                        C17843b.m94137o().m94150M(102);
                        if (this.f97114Q != null) {
                            C17843b.m94137o().m94173e0(this.f97114Q);
                        }
                        if (this.f97115R != null) {
                            C17843b.m94137o().m94181i0(this.f97115R);
                        }
                    }
                    m102162W();
                    if (c19564q.m102317v() != null) {
                        jSONObject = c19564q.m102317v().optJSONObject("vidFilter");
                        AbstractC32273e3.m155748Q().mo155923u(jSONObject);
                    }
                    EglBase.Context eglBaseContext = AbstractC32273e3.m155748Q().m155829N().getEglBaseContext();
                    if (jSONObject != null) {
                        c25447g = C25447g.m131799b(jSONObject);
                    } else {
                        c25447g = new C25447g(2, 1.0700000524520874d, 66);
                    }
                    if (eglBaseContext != null) {
                        AbstractC32273e3.m155748Q().mo155935x0(eglBaseContext, CoreUtility.getAppContext(), c25447g);
                    }
                    AbstractC32273e3.m155748Q().mo155898m1();
                } catch (Exception e12) {
                    AbstractC3082b0.m15423e(AbstractC19573v.f97206a, "readyForCall: " + e12.getMessage(), e12);
                }
                return true;
            }
            AbstractC3082b0.m15422d(AbstractC19573v.f97206a, "Invalid session or listserver : " + TextUtils.isEmpty(this.f97126i));
            return false;
        }
        if (!AbstractC19573v.m102336d(409, abstractC19542f) || m102216O() == -1) {
            return false;
        }
        AbstractC3082b0.m15424f(AbstractC19573v.f97206a, "VOICE_END_CALL in readyForCall: end call normally!");
        int m102119b = ((C19548i) abstractC19542f).m102119b();
        C22626t m102196D0 = m102196D0();
        m102196D0.m117180z1(m102119b);
        AbstractC32273e3.m155748Q().mo155858X1(new C22621q0(m102196D0));
        if (m102119b == -2) {
            z14 = true;
        }
        mo102242b(z14);
        return true;
    }

    /* renamed from: M */
    public String m102212M() {
        return C17843b.m94137o().m94172e();
    }

    /* renamed from: M0 */
    boolean m102213M0(AbstractC19542f abstractC19542f) {
        boolean z11 = false;
        if (AbstractC19573v.m102336d(409, abstractC19542f)) {
            AbstractC3082b0.m15424f(AbstractC19573v.f97206a, "VOICE_END_CALL in readyForCall - isZRTPProtocol: end call normally!");
            if (((C19548i) abstractC19542f).m102119b() == -2) {
                z11 = true;
            }
            mo102242b(z11);
            return true;
        }
        if (AbstractC19573v.m102336d(416, abstractC19542f)) {
            this.f97120c = 5;
            AbstractC32273e3.m155748Q().mo155842Q2((int) this.f97107J, this.f97109L, m102212M(), this.f97127j, this.f97128k, this.f97126i, m102201G(), m102267n0(), m102222R());
            return true;
        }
        if (!(abstractC19542f instanceof C19569s0)) {
            return false;
        }
        C19569s0 c19569s0 = (C19569s0) abstractC19542f;
        if (c19569s0.m102119b() == 5) {
            C32257b4.m155726m().m155737l().m117177y1(true);
            C32257b4.m155726m().m155737l().m117180z1(c19569s0.m102331c());
            C32319o.m156293t().m156305T(3);
            AbstractC32273e3.m155748Q().m155895l1(1, AbstractC8020f0.init_zrtp_caller_failed);
            mo102242b(false);
        }
        return true;
    }

    /* renamed from: N */
    public int m102214N() {
        return this.f97106I;
    }

    /* renamed from: N0 */
    public void m102215N0() {
        mo102239a();
        AbstractC3082b0.m15424f(AbstractC19573v.f97206a, "Reset");
        this.f97107J = -1L;
        this.f97120c = 0;
        this.f97126i = null;
        this.f97127j = null;
        this.f97128k = null;
        this.f97104G = false;
        this.f97105H = 0;
        this.f97130m = 0;
        this.f97131n = 0;
        this.f97129l = 0;
        this.f97132o = 0;
        m102262k1(0);
        this.f97114Q = null;
        this.f97115R = null;
        this.f97134q = 0;
        this.f97135r = "";
        this.f97143z = 0;
        this.f97098A = 0;
        this.f97138u = 0L;
        this.f97139v = 0L;
        this.f97100C = false;
        this.f97101D = false;
        this.f97102E = false;
        this.f97103F = 0;
        this.f97111N = null;
        m102258i1(false);
        m102250e1(0L);
        this.f97141x = 0L;
    }

    /* renamed from: O */
    public long m102216O() {
        return this.f97107J;
    }

    /* renamed from: O0 */
    public void m102217O0() {
        this.f97113P = "";
    }

    /* renamed from: P */
    public String m102218P(int i11, int i12) {
        return C17843b.m94137o().m94186l(i11, i12);
    }

    /* renamed from: P0 */
    public void m102219P0() {
        this.f97133p = false;
    }

    /* renamed from: Q */
    public String m102220Q() {
        return this.f97126i;
    }

    /* renamed from: Q0 */
    public void m102221Q0() {
        AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "resetWhenStartNewCall");
        this.f97133p = false;
        this.f97110M = 0L;
        this.f97113P = "";
        this.f97116S = 0;
        this.f97114Q = null;
        this.f97115R = null;
    }

    /* renamed from: R */
    public int m102222R() {
        return this.f97134q;
    }

    /* renamed from: R0 */
    public void m102223R0(boolean z11, int i11, int i12, boolean z12) {
        try {
            String m94168c = C17843b.m94137o().m94168c();
            if (z11) {
                m102236Y0(String.format("{%s,\"weird\":%d,\"callState\":%d,\"reset\":%d}", m94168c, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(z12 ? 1 : 0)));
            } else {
                m102236Y0(String.format("{%s}", m94168c));
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: S */
    public int m102224S() {
        return this.f97120c;
    }

    /* renamed from: S0 */
    public void m102225S0(int i11) {
        this.f97103F = i11;
    }

    /* renamed from: T */
    public long m102226T() {
        return this.f97138u;
    }

    /* renamed from: T0 */
    public void m102227T0(boolean z11) {
        this.f97102E = z11;
    }

    /* renamed from: U */
    public long m102228U() {
        return this.f97139v;
    }

    /* renamed from: U0 */
    public void m102229U0(JSONObject jSONObject) {
        this.f97099B = jSONObject;
    }

    /* renamed from: V */
    public int m102230V() {
        return this.f97098A;
    }

    /* renamed from: V0 */
    public void m102231V0(long j11) {
        this.f97110M = j11;
    }

    /* renamed from: W0 */
    void m102232W0(C17842a c17842a, AbstractC19542f abstractC19542f) {
        int i11;
        int i12;
        int i13;
        boolean z11;
        if (abstractC19542f instanceof C19564q) {
            C19564q c19564q = (C19564q) abstractC19542f;
            i11 = c19564q.f97198q;
            this.f97111N = new C25947k(c19564q.m102317v());
        } else if (abstractC19542f instanceof C19552k) {
            C19552k c19552k = (C19552k) abstractC19542f;
            i11 = c19552k.m102121c();
            AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "ZrtcCfg IncomingCallCommand: " + AbstractC3096i0.m15501M(c19552k.m102133o()));
            this.f97111N = new C25947k(c19552k.m102133o());
        } else {
            i11 = 0;
        }
        C25947k c25947k = this.f97111N;
        if (c25947k == null) {
            return;
        }
        if (c25947k.f123728a) {
            i12 = c25947k.f123730c;
        } else {
            i12 = 0;
        }
        if (c25947k.f123729b) {
            i13 = c25947k.f123731d;
        } else {
            i13 = 0;
        }
        int i14 = i12 + i13;
        File file = new File(AbstractC3096i0.m15572x());
        if (!file.exists()) {
            z11 = file.mkdirs();
        } else {
            z11 = true;
        }
        if (i14 > 0 && z11) {
            String[] strArr = new String[i14];
            for (int i15 = 0; i15 < i14; i15++) {
                strArr[i15] = AbstractC3096i0.m15572x() + File.separator + i11 + "_" + i15 + ".jpg";
            }
            c17842a.m94130p(strArr);
        }
    }

    /* renamed from: X */
    public void m102233X() {
        boolean z11;
        boolean z12;
        AbstractC3082b0.m15424f(AbstractC19573v.f97206a, "immediatehangup ");
        try {
            try {
                if (!AbstractC3096i0.m15511R()) {
                    AbstractC32273e3.m155748Q().mo155914r2();
                }
                AbstractC32273e3.m155748Q().mo155802G();
                AbstractC32273e3.m155748Q().mo155796E1();
                m102285z1();
                C32252b.m155705e().m155710c();
                BatteryInfoHelper.f148742a.m155525h(AbstractC3096i0.m15574y());
                if (!m102247d0() && this.f97107J != -1) {
                    if (m102249e0(3) && C32257b4.m155726m().m155737l().m117157s() != 160 && C32257b4.m155726m().m155737l().m117157s() != 165) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    C32299k.f149103a.m156156g(z12, String.valueOf(this.f97107J));
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    C32354v.m156388e();
                }
                C3084c0.m15434b();
                if (C17843b.m94137o().m94209x()) {
                    if (m102249e0(1)) {
                        C17843b.m94137o().m94170d(false);
                        m102279w();
                    } else {
                        C22626t m155737l = C32257b4.m155726m().m155737l();
                        if (this.f97118U && this.f97120c == 3 && !m155737l.m117170w0()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        boolean m117076X = m155737l.m117076X();
                        m102236Y0(C17843b.m94137o().m94193p(this.f97116S, C23055e5.m118267a(AbstractC3096i0.m15574y()), C3091g.m15473d().toString()));
                        C32257b4.m155726m().m155739x();
                        C17843b.m94137o().m94170d(false);
                        AbstractC3082b0.m15424f(AbstractC19573v.f97206a, "native endCall success ");
                        if (m117076X && AbstractC3096i0.f13167k == 3 && m155737l.m117035J0()) {
                            m102275t1();
                        } else if (z11 && !AbstractC3096i0.f13165i) {
                            HandlerC32324p.m156352e(new d(), ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
                        }
                    }
                } else {
                    m102279w();
                }
            } catch (Exception e11) {
                AbstractC3082b0.m15422d(AbstractC19573v.f97206a, "immediatehangup failed: " + e11.toString());
            }
            AbstractC3096i0.f13164h = true;
            AbstractC32273e3.m155748Q().mo155788C1();
            AbstractC32273e3.m155748Q().m155800F1();
            AbstractC32273e3.m155748Q().mo155804G1();
            m102215N0();
            AbstractC3096i0.m15510Q0(false);
            m102161L().m102285z1();
            m102161L().m102258i1(false);
            AbstractC3096i0.f13160d = false;
            AbstractC32273e3.m155748Q().mo155806H(AbstractC3096i0.m15574y());
            AbstractC3082b0.m15424f(AbstractC19573v.f97206a, "End call");
            AbstractC3096i0.f13164h = false;
        } catch (Throwable th2) {
            AbstractC3096i0.f13164h = true;
            AbstractC32273e3.m155748Q().mo155788C1();
            AbstractC32273e3.m155748Q().m155800F1();
            AbstractC32273e3.m155748Q().mo155804G1();
            m102215N0();
            AbstractC3096i0.m15510Q0(false);
            m102161L().m102285z1();
            m102161L().m102258i1(false);
            AbstractC3096i0.f13160d = false;
            AbstractC32273e3.m155748Q().mo155806H(AbstractC3096i0.m15574y());
            AbstractC3082b0.m15424f(AbstractC19573v.f97206a, "End call");
            AbstractC3096i0.f13164h = false;
            throw th2;
        }
    }

    /* renamed from: X0 */
    public void m102234X0(int i11) {
        this.f97109L = i11;
    }

    /* renamed from: Y */
    void m102235Y(int i11) {
        AbstractC3082b0.m15424f(AbstractC19573v.f97206a, "immediatehangup with call delay: " + i11);
        HandlerC32324p.m156352e(new e(), i11);
    }

    /* renamed from: Y0 */
    public void m102236Y0(String str) {
        this.f97113P = str;
    }

    /* renamed from: Z */
    boolean m102237Z(AbstractC19542f abstractC19542f) {
        String m114540g;
        int i11;
        boolean z11 = true;
        if (AbstractC19573v.m102336d(409, abstractC19542f)) {
            this.f97120c = 8;
            C22626t m155737l = C32257b4.m155726m().m155737l();
            C19548i c19548i = (C19548i) abstractC19542f;
            if (c19548i.m102119b() == -17) {
                if (m155737l != null && m155737l.m117032I0()) {
                    C32257b4.m155726m().m155737l().f110960y = 1;
                }
                i11 = 2;
            } else {
                i11 = 0;
            }
            if (m155737l != null && !m155737l.m117035J0()) {
                if (m155737l.m117076X()) {
                    AbstractC3096i0.m15516T0(AbstractC8020f0.str_toast_hang_up_unstable_connection);
                }
            } else if (AbstractC3096i0.f13167k != 3 && m155737l != null && m155737l.m117076X()) {
                AbstractC3096i0.m15516T0(AbstractC8020f0.str_call_drop_call_toast);
            }
            AbstractC32273e3.m155748Q().mo155828M2(this.f97106I, (int) this.f97107J, i11, this.f97109L, this.f97126i, this.f97127j, "", c19548i.f97038r);
            m102194C1();
            mo102242b(false);
            return true;
        }
        if (AbstractC19573v.m102338f(409, abstractC19542f)) {
            C22626t m155737l2 = C32257b4.m155726m().m155737l();
            String m117010B = m155737l2.m117010B();
            ContactProfile m141811g = C28203u6.f131407a.m141811g(String.valueOf(m155737l2.m117013C()));
            if (m141811g == null) {
                m114540g = AbstractC21935u.m114542i(String.valueOf(m155737l2.m117013C()), m117010B);
            } else {
                m114540g = AbstractC21935u.m114540g(m141811g.f42455y, String.valueOf(m155737l2.m117013C()), m141811g.f42437s, true);
            }
            if (m114540g.length() > 10) {
                m114540g = m114540g.substring(0, 10) + "...";
            }
            if (!m155737l2.m117086a0()) {
                AbstractC3096i0.m15518U0(String.format(AbstractC3096i0.m15574y().getString(AbstractC8020f0.str_call_other_hangup_toast), m114540g));
            }
            if (((C19550j) abstractC19542f).mo102120f() == 2) {
                if (m155737l2.m117032I0()) {
                    C32257b4.m155726m().m155737l().f110960y = 2;
                    if (AbstractC3096i0.f13167k != 3 && AbstractC3096i0.f13167k != 4) {
                        AbstractC32273e3.m155748Q().mo155893k2();
                    }
                }
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: gp0.g0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C19561o0.m102177s0();
                    }
                });
            }
            m102194C1();
            mo102242b(false);
            return true;
        }
        if (!AbstractC19573v.m102336d(411, abstractC19542f) && !AbstractC19573v.m102336d(413, abstractC19542f)) {
            if (!AbstractC19573v.m102338f(411, abstractC19542f) && !AbstractC19573v.m102338f(413, abstractC19542f)) {
                if (AbstractC19573v.m102338f(405, abstractC19542f)) {
                    C32257b4.m155726m().m155737l().m117069U1(true);
                    mo102242b(false);
                    return true;
                }
                if (!AbstractC19573v.m102338f(418, abstractC19542f) && !AbstractC19573v.m102338f(419, abstractC19542f)) {
                    if (abstractC19542f instanceof C19563p0) {
                        C19563p0 c19563p0 = (C19563p0) abstractC19542f;
                        if (c19563p0.m102299g()) {
                            String m102296d = c19563p0.m102296d();
                            String m102295c = c19563p0.m102295c();
                            String m102297e = c19563p0.m102297e();
                            if (TextUtils.isEmpty(m102296d) || TextUtils.isEmpty(m102295c) || TextUtils.isEmpty(m102297e)) {
                                return false;
                            }
                            m102191B1(m102296d, m102295c, m102297e);
                            if (!c19563p0.m102298f()) {
                                AbstractC32273e3.m155748Q().mo155824L2((int) this.f97107J, this.f97109L, m102297e, m102296d, m102295c);
                            }
                        } else if (c19563p0.m102298f()) {
                            AbstractC32273e3.m155748Q().mo116929a(0, 13);
                        }
                        return true;
                    }
                    if (AbstractC19573v.m102338f(421, abstractC19542f)) {
                        C19556m c19556m = (C19556m) abstractC19542f;
                        C17843b.m94137o().m94179h0(c19556m.m102330e(), c19556m.f97076v);
                    } else if (AbstractC19573v.m102338f(443, abstractC19542f)) {
                        int m102330e = ((C19566r) abstractC19542f).m102330e();
                        C22626t m155737l3 = C32257b4.m155726m().m155737l();
                        if (m102330e != 1) {
                            z11 = false;
                        }
                        m155737l3.f110945q0 = z11;
                        AbstractC32273e3.m155748Q().m155885h1(443);
                    } else if (AbstractC19573v.m102338f(444, abstractC19542f)) {
                        C22600g c22600g = (C22600g) abstractC19542f;
                        AbstractC32273e3.m155748Q().mo155892k1(c22600g.m116934h(), c22600g.m116933g(), c22600g.m116935i());
                    } else if (AbstractC19573v.m102338f(412, abstractC19542f)) {
                        AbstractC32273e3.m155748Q().mo155900n0((C22602h) abstractC19542f);
                    } else if (AbstractC19573v.m102338f(447, abstractC19542f)) {
                        AbstractC32273e3.m155748Q().mo155916s0((C22604i) abstractC19542f);
                    } else if (AbstractC19573v.m102338f(432, abstractC19542f)) {
                        AbstractC32273e3.m155748Q().mo155897m0((C22628v) abstractC19542f);
                    } else if (AbstractC19573v.m102338f(448, abstractC19542f)) {
                        if (abstractC19542f instanceof C22627u) {
                            C22627u c22627u = (C22627u) abstractC19542f;
                            AbstractC32273e3.m155748Q().mo155929v1(c22627u.m117182g().m116939c(), c22627u.m117182g().m116938b());
                        }
                    } else if (AbstractC19573v.m102338f(449, abstractC19542f) && (abstractC19542f instanceof C22625s0)) {
                        AbstractC32273e3.m155748Q().mo155903o0((C22625s0) abstractC19542f);
                    }
                    return false;
                }
                C19565q0 c19565q0 = (C19565q0) abstractC19542f;
                String m102324i = c19565q0.m102324i();
                List m102323h = c19565q0.m102323h();
                List m102322g = c19565q0.m102322g();
                if (m102323h == null || m102323h.size() == 0 || m102322g == null || m102322g.size() == 0 || m102324i == null || m102324i.length() == 0) {
                    return false;
                }
                C17843b.m94137o().m94164a(m102324i, (String[]) m102323h.toArray(new String[0]), (String[]) m102322g.toArray(new String[0]));
                return true;
            }
            if (C32257b4.m155726m().m155737l().m117032I0()) {
                C32257b4.m155726m().m155737l().f110960y = 2;
            }
            AbstractC32273e3.m155748Q().mo116929a(3, 12);
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: gp0.h0
                @Override // java.lang.Runnable
                public final void run() {
                    C19561o0.m102179t0();
                }
            });
            return true;
        }
        C22626t m155737l4 = C32257b4.m155726m().m155737l();
        int m102118a = ((C19548i) abstractC19542f).m102118a();
        if (m102118a == 413 && m155737l4.m117167v0()) {
            C17843b.m94137o().m94201t(false, true);
        } else if (m102118a == 411 && !m155737l4.m117154r0()) {
            C17843b.m94137o().m94201t(true, true);
        }
        return true;
    }

    /* renamed from: Z0 */
    public void m102238Z0(int i11) {
        this.f97105H = i11;
    }

    @Override // gp0.AbstractC19573v
    /* renamed from: a */
    void mo102239a() {
        try {
            try {
                AbstractC3082b0.m15424f(AbstractC19573v.f97206a, "cancelSessionTimer");
                if (this.f97121d != null) {
                    AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "Cancel session timer");
                    this.f97121d.cancel(true);
                    this.f97121d = null;
                }
                if (this.f97122e != null) {
                    AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "Cancel CalleePreConnect timer");
                    this.f97122e.cancel(true);
                    this.f97122e = null;
                }
                if (this.f97123f != null) {
                    AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "Cancel CallerCheckRingRing timer");
                    this.f97123f.cancel(true);
                    this.f97123f = null;
                }
                if (this.f97124g != null) {
                    AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "Cancel CallerCheckInCall timer");
                    this.f97124g.cancel(true);
                    this.f97124g = null;
                }
                if (this.f97125h != null) {
                    AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "Cancel CallerCheckSent416Timer timer");
                    this.f97125h.cancel(true);
                    this.f97125h = null;
                }
            } catch (Exception e11) {
                AbstractC3082b0.m15423e(AbstractC19573v.f97206a, "cancelSessionTimer: " + e11.getMessage(), e11);
            }
            AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "cancelSessionTimer- Done");
        } catch (Throwable th2) {
            AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "cancelSessionTimer- Done");
            throw th2;
        }
    }

    /* renamed from: a0 */
    boolean m102240a0(AbstractC19542f abstractC19542f) {
        int i11;
        boolean z11 = true;
        if (abstractC19542f instanceof C19534b) {
            C19534b c19534b = (C19534b) abstractC19542f;
            if (c19534b.m102118a() == 402) {
                AbstractC32273e3.m155748Q().mo155840P2((int) this.f97107J, c19534b.m102119b(), this.f97109L, this.f97126i, this.f97127j, "", m102212M(), m102201G(), 0);
                if (c19534b.m102119b() == 0) {
                    this.f97120c = 4;
                    C32257b4.m155726m().m155737l().m117180z1(161);
                    C32319o.m156293t().m156328q0();
                    m102276u1(ZAbstractBase.ZVU_PROCESS_FLUSH);
                    C17843b.m94137o().m94165a0(4);
                }
                return true;
            }
        } else {
            if (AbstractC19573v.m102336d(407, abstractC19542f)) {
                int m117145p = C32257b4.m155726m().m155737l().m117145p();
                m102258i1(false);
                AbstractC32273e3.m155748Q().mo155820K2((int) this.f97107J, this.f97109L, 0, m117145p, m102203H());
                return true;
            }
            if (AbstractC19573v.m102337e(407, 4070, abstractC19542f)) {
                C17843b.m94137o().m94150M(EnumC17852k.SEND_407_SUCCESS.ordinal());
                C17843b.m94137o().m94165a0(3);
                return true;
            }
            if (AbstractC19573v.m102337e(407, -4070, abstractC19542f)) {
                this.f97132o++;
                if (AbstractC32273e3.m155748Q().mo155790D(this.f97132o)) {
                    AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "voiceRingRingRetryTimes " + this.f97132o);
                    AbstractC32273e3.m155748Q().mo155820K2((int) this.f97107J, this.f97109L, 0, C32257b4.m155726m().m155737l().m117145p(), m102203H());
                    return true;
                }
            } else {
                if (AbstractC19573v.m102336d(409, abstractC19542f)) {
                    C32257b4.m155726m().m155737l().f110919d0 = true;
                    C32257b4.m155726m().m155737l().m117180z1(160);
                    AbstractC32273e3.m155748Q().mo155836O2((int) this.f97107J, 3, this.f97109L, this.f97126i, this.f97127j, "", m102212M());
                    if ((abstractC19542f instanceof C19548i) && ((C19548i) abstractC19542f).f97038r == 1) {
                        C25244a.m130617E(String.valueOf(this.f97107J));
                    }
                    mo102242b(false);
                    return true;
                }
                if (abstractC19542f instanceof C19546h) {
                    C32257b4.m155726m().m155737l().m117069U1(true);
                    if (C32257b4.m155726m().m155737l().m117113h() == 3 && (abstractC19542f instanceof C19568s) && ((i11 = ((C19568s) abstractC19542f).f97200s) == 4 || i11 == 5)) {
                        AbstractC3096i0.m15516T0(AbstractC8020f0.str_toast_cancel_call);
                    }
                    if (((C19546h) abstractC19542f).m102117g() == 1) {
                        C32257b4.m155726m().m155737l().m117180z1(165);
                    }
                    m102235Y(0);
                    return true;
                }
                if (AbstractC19573v.m102338f(443, abstractC19542f)) {
                    int m102330e = ((C19566r) abstractC19542f).m102330e();
                    C22626t m155737l = C32257b4.m155726m().m155737l();
                    if (m102330e != 1) {
                        z11 = false;
                    }
                    m155737l.f110945q0 = z11;
                } else if (abstractC19542f instanceof C19569s0) {
                    C19569s0 c19569s0 = (C19569s0) abstractC19542f;
                    if (c19569s0.m102119b() == 5) {
                        AbstractC32273e3.m155748Q().mo155836O2((int) this.f97107J, 5, this.f97109L, this.f97126i, this.f97127j, "", m102212M());
                        C22626t m155737l2 = C32257b4.m155726m().m155737l();
                        m155737l2.m117177y1(true);
                        m155737l2.m117180z1(c19569s0.m102331c());
                        mo102242b(false);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a1 */
    public void m102241a1(int i11) {
        this.f97143z = i11;
    }

    @Override // gp0.AbstractC19573v
    /* renamed from: b */
    void mo102242b(boolean z11) {
        if (z11 && m102247d0()) {
            this.f97142y = this.f97107J;
            m102272q1();
        }
        m102233X();
    }

    /* renamed from: b0 */
    boolean m102243b0(AbstractC19542f abstractC19542f) {
        if (AbstractC19573v.m102338f(408, abstractC19542f)) {
            C32257b4.m155726m().m155737l().m117180z1(163);
            m102281x(false);
            return true;
        }
        if (AbstractC19573v.m102336d(409, abstractC19542f)) {
            AbstractC32273e3.m155748Q().mo155828M2(this.f97106I, (int) this.f97107J, 0, this.f97109L, this.f97126i, this.f97127j, "", ((C19548i) abstractC19542f).f97038r);
            mo102242b(false);
            return true;
        }
        if (AbstractC19573v.m102338f(405, abstractC19542f)) {
            C32257b4.m155726m().m155737l().m117069U1(true);
            mo102242b(false);
            return true;
        }
        if (AbstractC19573v.m102337e(402, -4020, abstractC19542f)) {
            this.f97130m++;
            if (AbstractC32273e3.m155748Q().mo155786C(this.f97130m)) {
                AbstractC32273e3.m155748Q().mo155840P2((int) this.f97107J, 0, this.f97109L, this.f97126i, this.f97127j, "", m102212M(), m102201G(), 0);
            } else {
                mo102242b(false);
            }
            return true;
        }
        if (abstractC19542f instanceof C19572u) {
            C19572u c19572u = (C19572u) abstractC19542f;
            if (c19572u.mo102120f() == -1) {
                HandlerC32324p.m156351d(new Runnable() { // from class: gp0.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C19561o0.m102181u0();
                    }
                });
                if (!TextUtils.isEmpty(c19572u.m102334g())) {
                    AbstractC3096i0.m15518U0(c19572u.m102334g());
                }
            }
            return true;
        }
        if (AbstractC19573v.m102337e(407, 4070, abstractC19542f)) {
            C17843b.m94137o().m94150M(EnumC17852k.SEND_407_SUCCESS.ordinal());
        }
        return false;
    }

    /* renamed from: b1 */
    public void m102244b1(String str) {
        this.f97135r = str;
    }

    /* renamed from: c0 */
    public boolean m102245c0() {
        return this.f97102E;
    }

    /* renamed from: c1 */
    public void m102246c1(boolean z11) {
        this.f97100C = z11;
    }

    /* renamed from: d0 */
    public boolean m102247d0() {
        return this.f97108K;
    }

    /* renamed from: d1 */
    public void m102248d1(long j11) {
        this.f97141x = j11;
    }

    /* renamed from: e0 */
    public boolean m102249e0(int i11) {
        return this.f97120c == i11;
    }

    /* renamed from: e1 */
    public void m102250e1(long j11) {
        this.f97140w = j11;
    }

    /* renamed from: f0 */
    public boolean m102251f0(int i11) {
        return this.f97107J == ((long) i11) && this.f97120c == 3;
    }

    /* renamed from: f1 */
    public void m102252f1(boolean z11) {
        this.f97108K = z11;
    }

    /* renamed from: g0 */
    public boolean m102253g0() {
        return this.f97120c == 7;
    }

    /* renamed from: g1 */
    public void m102254g1(int i11) {
        this.f97106I = i11;
    }

    /* renamed from: h0 */
    public boolean m102255h0() {
        return this.f97136s;
    }

    /* renamed from: h1 */
    public void m102256h1(int i11) {
        this.f97107J = i11;
    }

    /* renamed from: i0 */
    public boolean m102257i0(int i11) {
        return ((long) i11) == this.f97107J;
    }

    /* renamed from: i1 */
    public void m102258i1(boolean z11) {
        this.f97136s = z11;
    }

    /* renamed from: j0 */
    public boolean m102259j0(int i11) {
        AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "old platform " + this.f97143z + " new platform " + i11);
        if (this.f97143z == i11) {
            return true;
        }
        return false;
    }

    /* renamed from: j1 */
    public void m102260j1(boolean z11) {
        this.f97101D = z11;
    }

    /* renamed from: k0 */
    public boolean m102261k0() {
        return this.f97118U;
    }

    /* renamed from: k1 */
    public void m102262k1(int i11) {
        this.f97117T = i11;
    }

    /* renamed from: l0 */
    public boolean m102263l0() {
        return this.f97133p;
    }

    /* renamed from: l1 */
    public void m102264l1(boolean z11) {
        this.f97118U = z11;
    }

    /* renamed from: m0 */
    public boolean m102265m0(C19568s c19568s, boolean z11) {
        if (this.f97107J != c19568s.mo102113b() && (z11 || this.f97107J != -1)) {
            AbstractC3082b0.m15422d(AbstractC19573v.f97206a, "mPeerZaloId is different than in response event - ensureInCall " + z11);
            return false;
        }
        if (this.f97109L != c19568s.m102327a()) {
            AbstractC3082b0.m15422d(AbstractC19573v.f97206a, "mCallId is different than in response event");
            return false;
        }
        return true;
    }

    /* renamed from: m1 */
    public void m102266m1(int i11) {
        this.f97134q = i11;
    }

    /* renamed from: n0 */
    public boolean m102267n0() {
        return this.f97105H == 1;
    }

    /* renamed from: n1 */
    public void m102268n1(boolean z11) {
        this.f97104G = z11;
    }

    /* renamed from: o0 */
    public boolean m102269o0() {
        int m94166b = C17843b.m94137o().m94166b();
        if (m94166b != 0 && m94166b != 19) {
            return true;
        }
        return false;
    }

    /* renamed from: o1 */
    public void m102270o1(long j11) {
        this.f97138u = j11;
    }

    /* renamed from: p1 */
    public void m102271p1(long j11) {
        this.f97139v = j11;
    }

    /* renamed from: q1 */
    public void m102272q1() {
        this.f97133p = true;
    }

    /* renamed from: r1 */
    public void m102273r1(int i11) {
        this.f97098A = i11;
    }

    /* renamed from: s1 */
    public void m102274s1(Object obj, boolean z11) {
        Object obj2;
        String str = AbstractC19573v.f97206a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setWindowView isCapture = ");
        sb2.append(z11);
        sb2.append(" window = ");
        if (obj != null) {
            obj2 = obj;
        } else {
            obj2 = "null";
        }
        sb2.append(obj2);
        AbstractC3082b0.m15424f(str, sb2.toString());
        if (z11) {
            this.f97114Q = obj;
            C17843b.m94137o().m94173e0(obj);
        } else {
            this.f97115R = obj;
            C17843b.m94137o().m94181i0(obj);
        }
        AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "setWindowView isCapture = " + z11 + " done");
    }

    /* renamed from: t1 */
    public void m102275t1() {
        AbstractC32273e3.m155748Q().m155827M1(new Runnable() { // from class: gp0.j0
            @Override // java.lang.Runnable
            public final void run() {
                C19561o0.m102183w0();
            }
        });
    }

    /* renamed from: u1 */
    public void m102276u1(int i11) {
        if (i11 > 0 && this.f97122e == null) {
            AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "CalleePreConnect timer start with timeout = " + i11);
            this.f97122e = AbstractC17930e.m94545d().mo94531e(new Runnable() { // from class: gp0.l0
                @Override // java.lang.Runnable
                public final void run() {
                    C19561o0.this.m102184x0();
                }
            }, (long) i11);
        }
    }

    /* renamed from: v */
    public boolean m102277v() {
        int i11 = this.f97120c;
        return i11 == 0 || i11 == 2 || i11 == 5;
    }

    /* renamed from: v1 */
    public void m102278v1(int i11) {
        if (i11 > 0 && this.f97124g == null) {
            AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "CallerCheckInCall timer start with timeout = " + i11);
            this.f97124g = AbstractC17930e.m94544c().mo94531e(new Runnable() { // from class: gp0.m0
                @Override // java.lang.Runnable
                public final void run() {
                    C19561o0.this.m102186y0();
                }
            }, (long) i11);
        }
    }

    /* renamed from: w */
    public void m102279w() {
        AbstractC32273e3.m155748Q().m155827M1(new Runnable() { // from class: gp0.i0
            @Override // java.lang.Runnable
            public final void run() {
                C19561o0.this.m102171p0();
            }
        });
    }

    /* renamed from: w1 */
    public void m102280w1(int i11) {
        if (i11 > 0 && this.f97123f == null) {
            AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "CallerCheckRingring timer start with timeout = " + i11);
            this.f97123f = AbstractC17930e.m94544c().mo94531e(new Runnable() { // from class: gp0.f0
                @Override // java.lang.Runnable
                public final void run() {
                    C19561o0.this.m102187z0();
                }
            }, (long) i11);
        }
    }

    /* renamed from: x */
    void m102281x(boolean z11) {
        this.f97120c = 7;
        if (z11) {
            this.f97105H = C17843b.m94137o().m94211y() ? 1 : 0;
            AbstractC32273e3.m155748Q().mo155813I2((int) this.f97107J, this.f97109L, 0);
        }
        C3084c0.m15437e("UPDATE_CAMERA_TASK_KEY");
        if (C32257b4.m155726m().m155737l().f110947r0) {
            AbstractC32273e3.m155748Q().mo116932d(true);
        }
        this.f97116S = C23055e5.m118267a(AbstractC3096i0.m15574y());
        mo102239a();
        AbstractC3082b0.m15424f(AbstractC19573v.f97206a, "Change to CONFIRMED to establish call");
        try {
            C32319o.m156293t().m156331s();
            VoipAudioHelper.f148751a.m155635F(AbstractC3096i0.m15574y());
            C17843b.m94137o().m94165a0(5);
            BatteryInfoHelper.f148742a.m155524g(AbstractC3096i0.m15574y());
            if (Build.VERSION.SDK_INT >= 29) {
                C32354v.m156387d(AbstractC3096i0.m15574y());
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15423e(AbstractC19573v.f97206a, "establishCall: " + e11.getMessage(), e11);
        }
    }

    /* renamed from: x1 */
    public void m102282x1(int i11) {
        if (i11 > 0 && this.f97107J != -1 && this.f97125h == null) {
            AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "CallerCheckSent416Timer timer start with timeout = " + i11);
            final long j11 = (long) this.f97109L;
            final long j12 = this.f97107J;
            this.f97125h = AbstractC17930e.m94544c().mo94531e(new Runnable() { // from class: gp0.e0
                @Override // java.lang.Runnable
                public final void run() {
                    C19561o0.this.m102159A0(j11, j12);
                }
            }, (long) i11);
        }
    }

    /* renamed from: y1 */
    public void m102283y1(final int i11) {
        if (i11 > 0) {
            AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "Calling timer start with timeout = " + i11);
            if (this.f97121d == null) {
                AbstractC3082b0.m15421c(AbstractC19573v.f97206a, "Session timer start with timeout = " + i11);
                this.f97121d = AbstractC17930e.m94544c().mo94531e(new Runnable() { // from class: gp0.n0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C19561o0.this.m102160B0(i11);
                    }
                }, (long) i11);
            }
        }
    }

    /* renamed from: z */
    public int m102284z() {
        return this.f97103F;
    }

    /* renamed from: z1 */
    public void m102285z1() {
        C32318n3.m156214E().m156261t();
        C32319o.m156293t().m156326o0();
    }
}
