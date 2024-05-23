package si;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import android.text.TextUtils;
import b50.C2556d;
import ch0.AbstractC3489d;
import com.zing.zalo.client.AESUtils;
import com.zing.zalo.data.backuprestore.model.C7924a;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.zadb.InterfaceC7968a;
import com.zing.zalocore.CoreUtility;
import dg0.AbstractC17930e;
import dg0.InterfaceC17929d;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import f40.C18719a;
import fg0.ThreadFactoryC18928a;
import gm0.AbstractC19512f;
import gm0.AbstractC19513g;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import il.C20604a;
import java.io.File;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import me0.AbstractC23195r2;
import me0.C23055e5;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p128ed.C18390e;
import p248iy.AbstractC20887g;
import p297kd.C21688c;
import p320ld.C22436h;
import p320ld.C22438j;
import p320ld.C22440l;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p363nh.AbstractC23775p0;
import p363nh.C23744a;
import p387oc.C24213q;
import p387oc.HandlerThreadC24218v;
import p421pc.C24720a;
import p484ri.C25804a;
import p484ri.C25806c;
import p543uc.C27230h;
import p543uc.InterfaceC27227e;
import p586vt.C28624i;
import p716zh.C31986k3;
import pm0.C24848g0;
import sc.C26220b;
import si.C26263i;

/* renamed from: si.i */
/* loaded from: classes3.dex */
public class C26263i {

    /* renamed from: o */
    private static volatile boolean f124687o = false;

    /* renamed from: a */
    private final ThreadPoolExecutor f124688a;

    /* renamed from: b */
    private HandlerThreadC24218v f124689b;

    /* renamed from: c */
    private volatile int f124690c;

    /* renamed from: d */
    private final Object f124691d;

    /* renamed from: e */
    private volatile C7924a f124692e;

    /* renamed from: f */
    private final Object f124693f;

    /* renamed from: g */
    public String f124694g;

    /* renamed from: h */
    private long f124695h;

    /* renamed from: i */
    private boolean f124696i;

    /* renamed from: j */
    private final C25806c f124697j;

    /* renamed from: k */
    private final C25804a f124698k;

    /* renamed from: l */
    private final C24720a f124699l;

    /* renamed from: m */
    private final C24213q f124700m;

    /* renamed from: n */
    private final C20604a f124701n;

    /* renamed from: si.i$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC20094a {
        a() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C26263i.f124687o = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            if (obj instanceof JSONObject) {
                C26263i.m135055u().m135075c0((JSONObject) obj);
            }
            C26220b.m134822e("getTimeDeleteBackupMsg success, time=" + AbstractC0924m0.m4309w6());
            if (AbstractC0924m0.m4309w6() == -1) {
                AbstractC0924m0.m3941jp(0L);
            }
            C26263i.f124687o = false;
        }
    }

    /* renamed from: si.i$b */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: p */
        public int f124702p;

        /* synthetic */ b(C26263i c26263i, AbstractC26266l abstractC26266l) {
            this();
        }

        /* renamed from: c */
        public /* synthetic */ C24848g0 m135095c(C24848g0 c24848g0) {
            C26263i.m135055u().m135092z0(null, "");
            AbstractC23306f.m120688m().m132982A("", -1);
            C26263i.this.f124697j.m133036P("");
            AbstractC23306f.m120668h().m132688g();
            C26263i.this.f124699l.m128407Y(-5);
            C26263i.this.f124697j.m133027F();
            AbstractC0924m0.m3941jp(C23793c.m124316k().mo124314i());
            C26263i.this.f124697j.m133037R(null);
            C22436h.f109760a.m115926z(3);
            try {
                Thread.currentThread();
                Thread.sleep(1000L);
            } catch (Exception e11) {
                C26220b.m134821d("SMLBackupRestoreChatDB", e11);
            }
            C26263i.this.m135043i0(20);
            C26263i.this.m135043i0(22);
            C26263i.this.m135043i0(0);
            m135097e();
            C2556d.m12981o().m13007x(2);
            return null;
        }

        /* renamed from: d */
        public /* synthetic */ C24848g0 m135096d(Integer num, String str) {
            try {
                Thread.currentThread();
                Thread.sleep(1000L);
            } catch (Exception e11) {
                C26220b.m134821d("SMLBackupRestoreChatDB", e11);
            }
            C26263i.this.m135043i0(21);
            C26263i.this.m135043i0(22);
            C26263i.this.m135043i0(0);
            m135097e();
            return null;
        }

        /* renamed from: e */
        private void m135097e() {
            if (AbstractC3489d.m17514v()) {
                C23744a.m124114c().m124116d(150809, new Object[0]);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C26263i.this.f124699l.m128395L() && C22447s.m116057s(C26263i.m135058w())) {
                String m132993i = AbstractC23306f.m120688m().m132993i();
                if (!TextUtils.isEmpty(m132993i)) {
                    C26263i.this.m135043i0(18);
                    try {
                        InterfaceC27227e m135061z = C26263i.m135061z(m132993i);
                        if (m135061z != null) {
                            m135061z.mo139335c(m135061z.mo98986a());
                        }
                    } catch (Exception e11) {
                        C26220b.m134821d("SMLBackupRestoreChatDB", e11);
                    }
                }
            }
            C26263i.this.m135043i0(19);
            C26263i.this.f124699l.m128406X(false);
            C26263i.this.f124697j.m133045d(this.f124702p, new InterfaceC18505l() { // from class: si.j
                public /* synthetic */ C26264j() {
                }

                @Override // en0.InterfaceC18505l
                /* renamed from: i9 */
                public final Object mo205i9(Object obj) {
                    C24848g0 m135095c;
                    m135095c = C26263i.b.this.m135095c((C24848g0) obj);
                    return m135095c;
                }
            }, new InterfaceC18509p() { // from class: si.k
                public /* synthetic */ C26265k() {
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: pC */
                public final Object mo240pC(Object obj, Object obj2) {
                    C24848g0 m135096d;
                    m135096d = C26263i.b.this.m135096d((Integer) obj, (String) obj2);
                    return m135096d;
                }
            });
        }

        private b() {
        }
    }

    /* renamed from: si.i$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        static final C26263i f124704a = new C26263i(AbstractC23306f.m120692n(), AbstractC23306f.m120688m(), AbstractC23306f.m120676j(), AbstractC23306f.m120696o(), AbstractC23306f.m120591J1());
    }

    /* synthetic */ C26263i(C25806c c25806c, C25804a c25804a, C24720a c24720a, C24213q c24213q, C20604a c20604a, AbstractC26267m abstractC26267m) {
        this(c25806c, c25804a, c24720a, c24213q, c20604a);
    }

    /* renamed from: A */
    public static void m135010A() {
        try {
            if (AbstractC0924m0.m4309w6() != -1 || f124687o || m135058w() != null || !C23055e5.m118271f()) {
                return;
            }
            C26220b.m134822e("getTimeDeleteBackupMsg");
            f124687o = true;
            AbstractC23306f.m120692n().m133059u(new a());
        } catch (Exception e11) {
            C26220b.m134819b(e11);
        }
    }

    /* renamed from: D0 */
    public static boolean m135011D0(int i11, TargetBackupInfo targetBackupInfo) {
        String str;
        if ((C22447s.m116018T() && m135053s()) || !m135016J(i11) || !m135013E0(i11)) {
            return false;
        }
        try {
            str = AbstractC23306f.m120692n().m133058t();
        } catch (Exception e11) {
            C26220b.m134821d("SMLBackupRestoreChatDB", e11);
            str = "";
        }
        if (targetBackupInfo == null) {
            return true;
        }
        if (!str.equals(targetBackupInfo.m40949e())) {
            return C22438j.m115946n(i11);
        }
        if (targetBackupInfo.m40953i() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public static boolean m135012E() {
        TargetBackupInfo m135058w = m135058w();
        if (m135058w == null || m135058w.m40948d() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: E0 */
    private static boolean m135013E0(int i11) {
        JSONArray jSONArray;
        if (AbstractC23306f.m120676j().m128429y() != 1 || !AbstractC23309i.m121640Yf()) {
            return false;
        }
        String m128428x = AbstractC23306f.m120676j().m128428x();
        if (!TextUtils.isEmpty(m128428x)) {
            try {
                jSONArray = new JSONArray(m128428x);
            } catch (JSONException e11) {
                AbstractC23350e.m122776f("SMLBackupRestoreChatDB", e11);
                jSONArray = null;
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                int length = jSONArray.length();
                for (int i12 = 0; i12 < length; i12++) {
                    if (jSONArray.optInt(i12, -1) == i11) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: F */
    public static boolean m135014F(String str) {
        int m121889f1 = AbstractC23309i.m121889f1();
        if (m121889f1 <= 0 || m121889f1 >= 17 || !m135016J(AbstractC23309i.m120897Ec())) {
            return false;
        }
        C26220b.m134823f("SMLBackupRestoreChatDB", str + " Restart from interrupted: fromPhase=" + m121889f1);
        return true;
    }

    /* renamed from: H */
    public static boolean m135015H(int i11) {
        return i11 == 10 || i11 == 11 || i11 == 12;
    }

    /* renamed from: J */
    public static boolean m135016J(int i11) {
        return (i11 == 1 || i11 == 6) ? false : true;
    }

    /* renamed from: L */
    public static boolean m135017L(TargetBackupInfo targetBackupInfo) {
        if (targetBackupInfo.m40954j() == 0 || targetBackupInfo.m40954j() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public /* synthetic */ void m135018P() {
        synchronized (this.f124691d) {
            try {
                if (this.f124690c > 0 && this.f124690c < 17) {
                    return;
                }
                if (m135014F("[checkInterruptTask]")) {
                    m135055u().m135085r0(AbstractC23309i.m120897Ec());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: Q */
    public static /* synthetic */ void m135019Q() {
        C28624i.m143158d().m143159c();
    }

    /* renamed from: R */
    public static /* synthetic */ void m135020R() {
        AbstractC23775p0.m124197b("pc_request_sync");
        AbstractC23309i.m121464To();
        AbstractC23309i.m122209nh("");
    }

    /* renamed from: S */
    public static /* synthetic */ C24848g0 m135021S(Object obj) {
        return C24848g0.f119245a;
    }

    /* renamed from: T */
    public static /* synthetic */ C24848g0 m135022T(Integer num, String str) {
        return C24848g0.f119245a;
    }

    /* renamed from: U */
    public static /* synthetic */ C24848g0 m135023U(Object obj) {
        return C24848g0.f119245a;
    }

    /* renamed from: V */
    public static /* synthetic */ C24848g0 m135024V(Integer num, String str) {
        return C24848g0.f119245a;
    }

    /* renamed from: W */
    public static /* synthetic */ void m135025W(String str) {
        C28624i.m143158d().m143165j(str, false);
    }

    /* renamed from: X */
    public static void m135026X(int i11, int i12, String str) {
        int i13;
        switch (i11) {
            case 0:
                i13 = 18852;
                break;
            case 1:
                i13 = 18853;
                break;
            case 2:
                i13 = 18854;
                break;
            case 3:
                i13 = 18855;
                break;
            case 4:
                i13 = 18856;
                break;
            case 5:
                i13 = 18857;
                break;
            case 6:
                i13 = 18858;
                break;
            default:
                i13 = -1;
                break;
        }
        if (i13 > -1) {
            AbstractC20887g.m109240r(i13, i11 + "." + i12 + "." + str);
        }
    }

    /* renamed from: Y */
    private void m135027Y(int i11, String str) {
        C26220b.m134823f("SMLBackupRestoreChatDB", "Skipped! Code: " + i11 + ", message: " + str);
    }

    /* renamed from: Z */
    public static void m135028Z(boolean z11) {
        if (z11) {
            C22436h c22436h = C22436h.f109760a;
            if (c22436h.m115923s() || c22436h.m115922r()) {
                c22436h.m115926z(3);
            }
        }
    }

    /* renamed from: a0 */
    private void m135030a0() {
        AbstractC0924m0.m4385yo(0);
        C22436h.f109760a.m115914F();
    }

    /* renamed from: d0 */
    public static void m135034d0(String str) {
        C26220b.m134823f("SMLBackupRestoreChatDB", str);
    }

    /* renamed from: e0 */
    public static void m135036e0() {
        m135040g0();
        m135038f0();
        AbstractC0924m0.m4210so(0L);
        AbstractC0924m0.m4269uo(0L);
        m135055u().m135078k0(0L);
        AbstractC0924m0.m4376yf(0L);
    }

    /* renamed from: f0 */
    public static void m135038f0() {
        AbstractC0924m0.m4318wf(0L);
    }

    /* renamed from: g0 */
    public static void m135040g0() {
        AbstractC0924m0.m4347xf(0L);
    }

    /* renamed from: i0 */
    public void m135043i0(int i11) {
        C21688c.m111827j().m111842E(i11, 0, null);
    }

    /* renamed from: n0 */
    public static boolean m135047n0(int i11, TargetBackupInfo targetBackupInfo) {
        String str;
        if (i11 == 6 || i11 == 0 || i11 == 10 || i11 == 11 || i11 == 12 || targetBackupInfo == null || !targetBackupInfo.isValid() || targetBackupInfo.m40953i() == 0) {
            return false;
        }
        if (i11 == 18) {
            return true;
        }
        try {
            str = AbstractC23306f.m120692n().m133058t();
        } catch (Exception e11) {
            C26220b.m134821d("SMLBackupRestoreChatDB", e11);
            str = "";
        }
        boolean m132682Y = AbstractC23306f.m120668h().m132682Y();
        if (str.equals(targetBackupInfo.m40949e())) {
            return !m132682Y;
        }
        if (!m132682Y) {
            return true;
        }
        if ((i11 != 3 && i11 != 14 && i11 != 15) || !m135055u().m135084o0()) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public static void m135048p(int i11) {
        m135050q(i11, m135055u().m135091y(), 100L);
    }

    /* renamed from: p0 */
    public static boolean m135049p0() {
        return AbstractC23195r2.m119525l(m135055u().m135087t());
    }

    /* renamed from: q */
    public static void m135050q(int i11, long j11, long j12) {
        long currentTimeMillis = System.currentTimeMillis() - j11;
        if (i11 > 1) {
            currentTimeMillis += j12;
        }
        if (i11 < 9) {
            AbstractC0924m0.m4347xf(AbstractC0924m0.m2979D0() + currentTimeMillis);
        } else {
            AbstractC0924m0.m4318wf(AbstractC0924m0.m2950C0() + currentTimeMillis);
        }
    }

    /* renamed from: q0 */
    public static void m135051q0() {
        synchronized (C26263i.class) {
            c.f124704a.m135092z0(null, "");
        }
    }

    /* renamed from: r */
    public static long m135052r(int i11) {
        long currentTimeMillis = System.currentTimeMillis() - m135055u().m135091y();
        C18390e.m97411s("Phase " + C18390e.m97408m(i11) + ", Time=" + currentTimeMillis + " ms");
        AbstractC0924m0.m4376yf(AbstractC0924m0.m3008E0() + currentTimeMillis);
        return currentTimeMillis;
    }

    /* renamed from: s */
    public static boolean m135053s() {
        C7924a m135087t = m135055u().m135087t();
        if (m135087t != null && m135087t.m40976e()) {
            return true;
        }
        return false;
    }

    /* renamed from: t0 */
    public static void m135054t0(int i11) {
        C18390e.m97411s("Start Phase " + C18390e.m97408m(i11));
        m135055u().m135078k0(System.currentTimeMillis());
    }

    /* renamed from: u */
    public static C26263i m135055u() {
        return c.f124704a;
    }

    /* renamed from: u0 */
    public static void m135056u0(int i11) {
        m135055u().m135078k0(System.currentTimeMillis());
    }

    /* renamed from: v */
    public static String m135057v() {
        String m41670u1 = C7959d.m41670u1();
        String lowerCase = AbstractC19512f.m101985d(AESUtils.m39916b(CoreUtility.f89225a, AbstractC19513g.m101988b(CoreUtility.f89233i))).toLowerCase();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m41670u1);
        String str = File.separator;
        sb2.append(str);
        sb2.append("sync");
        sb2.append(str);
        sb2.append(lowerCase);
        return sb2.toString();
    }

    /* renamed from: w */
    public static TargetBackupInfo m135058w() {
        return m135059x(m135055u().m135087t());
    }

    /* renamed from: x */
    public static TargetBackupInfo m135059x(C7924a c7924a) {
        if (c7924a != null) {
            return c7924a.f42886u;
        }
        return null;
    }

    /* renamed from: y0 */
    private void m135060y0() {
        C26220b.m134823f("SMLBackupRestoreChatDB", "Stop sync task when logout");
        m135090x0();
        AbstractC23306f.m120692n().m133036P("");
        AbstractC23306f.m120688m().m132987F(true);
        C21688c.m111827j().m111850w();
    }

    /* renamed from: z */
    public static InterfaceC27227e m135061z(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String m132994k = AbstractC23306f.m120688m().m132994k();
                if (!TextUtils.isEmpty(m132994k)) {
                    return C27230h.m139346b(m132994k);
                }
                return null;
            } catch (Exception e11) {
                C26220b.m134821d("SMLBackupRestoreChatDB", e11);
                return null;
            }
        }
        throw new Exception("Backup account must not null when get Handler");
    }

    /* renamed from: A0 */
    public void m135062A0(C7924a c7924a, String str, long j11, long j12, long j13) {
        if (c7924a != null && c7924a.f42886u != null && c7924a.m40975d()) {
            c7924a.m40979i(str, j11, j12);
            AbstractC23306f.m120692n().m133028G(str, j13);
            String m121291P = AbstractC23309i.m121291P();
            if (!TextUtils.isEmpty(m121291P)) {
                try {
                    JSONObject jSONObject = new JSONObject(m121291P);
                    if (TextUtils.isEmpty(str)) {
                        jSONObject.remove("cloud_info");
                    } else {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("email", str);
                        jSONObject2.put("media_size", j12);
                        jSONObject2.put("time", j11);
                        jSONObject.put("cloud_info", jSONObject2.toString());
                    }
                    AbstractC23309i.m121568Wh(jSONObject.toString());
                } catch (JSONException e11) {
                    C26220b.m134821d("SMLBackupRestoreChatDB", e11);
                }
            }
        }
    }

    /* renamed from: B */
    public void m135063B(long j11) {
    }

    /* renamed from: B0 */
    public void m135064B0(int i11, String str) {
        try {
            if (m135071M() && this.f124690c == 9) {
                C21688c.m111827j().m111852y(i11, str, this.f124689b.m126301N());
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("updateProgressExportBackup IGNORE, mSyncState=");
            sb2.append(this.f124690c);
        } catch (Exception e11) {
            C26220b.m134819b(e11);
        }
    }

    /* renamed from: C */
    public void m135065C(String str, String str2, String str3, boolean z11) {
        boolean z12;
        C26220b.m134829l("SMLBackupRestoreChatDB", String.format("handleUserResponseRequestSync: action: %s - pcName: %s - syncSession: %s", str, str2, str3));
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: si.a
            @Override // java.lang.Runnable
            public final void run() {
                C26263i.m135020R();
            }
        });
        if ("com.zing.zalo.intent.action.NOTIFICATION_PC_REQUEST_SYNC_ACCEPT".equals(str)) {
            AbstractC20887g.m109245w(18840);
            C26220b.m134822e("handleUserResponseRequestSync");
            this.f124694g = str3;
            z12 = true;
        } else {
            if ("com.zing.zalo.intent.action.NOTIFICATION_PC_REQUEST_SYNC_DISMISS".equals(str)) {
                AbstractC23775p0.m124197b("db");
                AbstractC20887g.m109245w(18841);
            }
            z12 = false;
        }
        this.f124701n.m107233c(z12, str3, str2, new InterfaceC18505l() { // from class: si.b
            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public final Object mo205i9(Object obj) {
                C24848g0 m135021S;
                m135021S = C26263i.m135021S(obj);
                return m135021S;
            }
        }, new InterfaceC18509p() { // from class: si.c
            @Override // en0.InterfaceC18509p
            /* renamed from: pC */
            public final Object mo240pC(Object obj, Object obj2) {
                C24848g0 m135022T;
                m135022T = C26263i.m135022T((Integer) obj, (String) obj2);
                return m135022T;
            }
        });
    }

    /* renamed from: C0 */
    public void m135066C0(InterfaceC7968a.a aVar, String str, String str2) {
        try {
            if (m135071M() && this.f124690c == 4) {
                C21688c.m111827j().m111853z(aVar, str, str2, this.f124689b.m126301N());
                return;
            }
            AbstractC23350e.m122772b("SMLBackupRestoreChatDB", "updateProgressRestoreDecodeAndInsertData(): IGNORE, mSyncState=%s", Integer.valueOf(this.f124690c));
        } catch (Exception e11) {
            C26220b.m134819b(e11);
        }
    }

    /* renamed from: D */
    public void m135067D(int i11, String str, String str2) {
        this.f124701n.m107234d(i11, str, str2, new InterfaceC18505l() { // from class: si.g
            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public final Object mo205i9(Object obj) {
                C24848g0 m135023U;
                m135023U = C26263i.m135023U(obj);
                return m135023U;
            }
        }, new InterfaceC18509p() { // from class: si.h
            @Override // en0.InterfaceC18509p
            /* renamed from: pC */
            public final Object mo240pC(Object obj, Object obj2) {
                C24848g0 m135024V;
                m135024V = C26263i.m135024V((Integer) obj, (String) obj2);
                return m135024V;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0018, code lost:            if (r1.isAlive() != false) goto L40;     */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m135068G(int i11) {
        boolean z11;
        synchronized (this.f124691d) {
            try {
                if (this.f124690c > 0) {
                    if (this.f124690c >= 17) {
                    }
                    if (this.f124689b.m126301N().f105269f == i11) {
                        z11 = true;
                    }
                    z11 = false;
                }
                HandlerThreadC24218v handlerThreadC24218v = this.f124689b;
                if (handlerThreadC24218v != null) {
                }
                z11 = false;
            } finally {
            }
        }
        return z11;
    }

    /* renamed from: I */
    public boolean m135069I() {
        return AbstractC0924m0.m4373yc();
    }

    /* renamed from: K */
    public boolean m135070K() {
        boolean z11;
        HandlerThreadC24218v handlerThreadC24218v;
        synchronized (this.f124691d) {
            try {
                if (C22447s.m116033f0(this.f124690c) && (handlerThreadC24218v = this.f124689b) != null && C22438j.m115948p(handlerThreadC24218v.m126301N().f105269f)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } finally {
            }
        }
        return z11;
    }

    /* renamed from: M */
    public boolean m135071M() {
        boolean z11;
        synchronized (this.f124691d) {
            try {
                if (this.f124690c > 0 && this.f124690c < 17) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } finally {
            }
        }
        return z11;
    }

    /* renamed from: N */
    public boolean m135072N() {
        boolean z11;
        synchronized (this.f124691d) {
            try {
                if (this.f124690c > 0) {
                    if (this.f124690c >= 17) {
                    }
                    z11 = true;
                }
                HandlerThreadC24218v handlerThreadC24218v = this.f124689b;
                if (handlerThreadC24218v == null || !handlerThreadC24218v.isAlive()) {
                    z11 = false;
                }
                z11 = true;
            } finally {
            }
        }
        return z11;
    }

    /* renamed from: O */
    public boolean m135073O() {
        return !TextUtils.isEmpty(this.f124698k.m132993i());
    }

    /* renamed from: b0 */
    public boolean m135074b0(JSONObject jSONObject) {
        try {
            C7924a c7924a = new C7924a(jSONObject);
            AbstractC23306f.m120692n().m133036P("");
            if (!c7924a.m40975d()) {
                return false;
            }
            C22447s.m116065x0(jSONObject);
            TargetBackupInfo targetBackupInfo = c7924a.f42886u;
            if (targetBackupInfo != null) {
                this.f124697j.m133031K(targetBackupInfo.m40945a());
                if (C31986k3.f147083a.m154111U1()) {
                    this.f124697j.m133031K(1);
                }
            }
            m135092z0(c7924a, jSONObject.toString());
            return true;
        } catch (Exception e11) {
            C26220b.m134821d("SMLBackupRestoreChatDB", e11);
            return false;
        }
    }

    /* renamed from: c0 */
    public void m135075c0(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                long optLong = optJSONObject.optLong("last_time_delete_backup", 0L);
                if (AbstractC0924m0.m4309w6() < optLong) {
                    AbstractC0924m0.m3941jp(optLong);
                }
            }
        } catch (Exception e11) {
            C26220b.m134819b(e11);
        }
    }

    /* renamed from: h0 */
    public void m135076h0() {
        if (AbstractC0924m0.m4373yc()) {
            AbstractC0924m0.m3003Do(false);
        }
    }

    /* renamed from: j0 */
    public void m135077j0(boolean z11) {
        this.f124696i = z11;
    }

    /* renamed from: k0 */
    public void m135078k0(long j11) {
        this.f124695h = j11;
    }

    /* renamed from: l0 */
    public void m135079l0() {
        AbstractC0924m0.m3003Do(true);
    }

    /* renamed from: m */
    public void m135080m() {
        RunnableC26258d runnableC26258d = new Runnable() { // from class: si.d
            public /* synthetic */ RunnableC26258d() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C26263i.this.m135018P();
            }
        };
        InterfaceC17929d m94545d = AbstractC17930e.m94545d();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        m94545d.mo94531e(runnableC26258d, timeUnit.toMillis(20L));
        AbstractC17930e.m94545d().mo94531e(new Runnable() { // from class: si.e
            @Override // java.lang.Runnable
            public final void run() {
                C26263i.m135019Q();
            }
        }, timeUnit.toMillis(10L));
    }

    /* renamed from: m0 */
    public void m135081m0(int i11, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setSyncState(): ");
        sb2.append(i11);
        synchronized (this.f124691d) {
            try {
                this.f124690c = i11;
                AbstractC23309i.m122285pj(i11);
                if (!TextUtils.isEmpty(str)) {
                    AbstractC23309i.m121695Zx(str);
                } else {
                    AbstractC23309i.m121695Zx("");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: n */
    public void m135082n() {
        int i11;
        C7924a m135087t = m135087t();
        if (m135087t != null && m135087t.m40976e()) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        m135055u().m135083o(i11);
    }

    /* renamed from: o */
    public void m135083o(int i11) {
        b bVar = new b();
        bVar.f124702p = i11;
        try {
            this.f124688a.execute(bVar);
        } catch (Exception e11) {
            C26220b.m134821d("SMLBackupRestoreChatDB", e11);
        }
    }

    /* renamed from: o0 */
    public boolean m135084o0() {
        return this.f124696i;
    }

    /* renamed from: r0 */
    public boolean m135085r0(int i11) {
        return m135086s0(i11, false);
    }

    /* renamed from: s0 */
    public boolean m135086s0(int i11, boolean z11) {
        if (AbstractC23306f.m120585H1().m16678A()) {
            C26220b.m134823f("SMLBackupRestoreChatDB", "Request sync msg from entry point " + i11 + " while transferring data");
            C18719a.m98717j("3");
            if (m135016J(i11)) {
                this.f124700m.m126200L();
            }
            return false;
        }
        synchronized (this.f124691d) {
            try {
                if (this.f124690c > 0 && this.f124690c < 17) {
                    m135027Y(-1, "Already running!");
                    return false;
                }
                if (!AbstractC23306f.m120684l().m126160n(i11)) {
                    return false;
                }
                HandlerThreadC24218v handlerThreadC24218v = this.f124689b;
                if (handlerThreadC24218v != null && handlerThreadC24218v.isAlive()) {
                    try {
                        if (!TextUtils.isEmpty(this.f124689b.m126299K()) && this.f124689b.m126299K().equals(CoreUtility.f89233i)) {
                            C26220b.m134820c("Another sync session of other uid is running");
                        }
                    } catch (Exception e11) {
                        C26220b.m134821d("SMLBackupRestoreChatDB", e11);
                    }
                    C26220b.m134820c("Another sync session is running. Can't sync until it's finish");
                    return false;
                }
                this.f124689b = new HandlerThreadC24218v("SyncHandlerThread", CoreUtility.f89233i);
                AbstractC23309i.m121547Vx(i11);
                C21688c.m111827j().m111844e();
                this.f124689b.m126300K0(z11);
                this.f124690c = 1;
                AbstractC0924m0.m3003Do(false);
                AbstractC0924m0.m3433Sj(System.currentTimeMillis());
                m135030a0();
                this.f124689b.start();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: t */
    public C7924a m135087t() {
        if (this.f124692e == null) {
            synchronized (this.f124693f) {
                try {
                    if (this.f124692e == null) {
                        this.f124692e = C7924a.m40972b();
                    }
                } finally {
                }
            }
        }
        return this.f124692e;
    }

    /* renamed from: v0 */
    public void m135088v0() {
        m135089w0("SYNC_MES", "PC_TRANSFER");
    }

    /* renamed from: w0 */
    public void m135089w0(String... strArr) {
        for (String str : strArr) {
            if ("SYNC_MES".equals(str)) {
                m135060y0();
            }
            if ("PC_TRANSFER".equals(str)) {
                C28624i.m143158d().m143164i("PC_TRANSFER");
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: si.f

                    /* renamed from: p */
                    public final /* synthetic */ String f124686p;

                    public /* synthetic */ RunnableC26260f(String str2) {
                        r1 = str2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C26263i.m135025W(r1);
                    }
                });
            }
        }
    }

    /* renamed from: x0 */
    public void m135090x0() {
        try {
            if (this.f124690c >= 1 && this.f124690c < 17) {
                HandlerThreadC24218v handlerThreadC24218v = this.f124689b;
                if (handlerThreadC24218v != null && handlerThreadC24218v.isAlive()) {
                    C26220b.m134823f("SMLBackupRestoreChatDB", "Stop sync message task");
                    m135079l0();
                } else {
                    C26220b.m134823f("SMLBackupRestoreChatDB", "InterruptedException not thrown because syncTask is not alive");
                }
                C21688c.m111827j().m111842E(0, 0, this.f124689b.m126301N());
                m135081m0(0, null);
                C21688c.m111827j().m111845f();
                this.f124700m.m126199K();
                C22440l.m115973c().m115980b();
                return;
            }
            C26220b.m134823f("SMLBackupRestoreChatDB", "InterruptedException not thrown because sync state = " + this.f124690c);
        } catch (Exception e11) {
            C26220b.m134821d("SMLBackupRestoreChatDB", e11);
        }
    }

    /* renamed from: y */
    public long m135091y() {
        return this.f124695h;
    }

    /* renamed from: z0 */
    public void m135092z0(C7924a c7924a, String str) {
        this.f124692e = c7924a;
        AbstractC23309i.m121568Wh(str);
    }

    private C26263i(C25806c c25806c, C25804a c25804a, C24720a c24720a, C24213q c24213q, C20604a c20604a) {
        this.f124690c = 0;
        this.f124691d = new Object();
        this.f124692e = null;
        this.f124693f = new Object();
        this.f124695h = 0L;
        this.f124696i = false;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC18928a("BackupRestoreChatDB"));
        this.f124688a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f124697j = c25806c;
        this.f124698k = c25804a;
        this.f124699l = c24720a;
        this.f124700m = c24213q;
        this.f124701n = c20604a;
    }
}
