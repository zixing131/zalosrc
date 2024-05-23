package p409oz;

import ag0.AbstractC0837p0;
import com.zing.zalo.report_v2.model.ReportInfoCollected;
import com.zing.zalo.report_v2.model.ReportMessageAttachment;
import com.zing.zalocore.connection.socket.AbstractC17522a;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hu.C20131e;
import in.C20627a;
import in.InterfaceC20630d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jm0.C21294d;
import km0.AbstractC21767b;
import km0.InterfaceC21766a;
import km0.InterfaceC21769d;
import me0.AbstractC23041d2;
import me0.AbstractC23238v2;
import me0.C23055e5;
import mm0.AbstractC23350e;
import mz.C23493c;
import nz.AbstractC23968e;
import nz.C23964a;
import nz.C23965b;
import nz.C23966c;
import nz.C23967d;
import org.json.JSONObject;
import p405ov.C24561c;
import p409oz.C24585b;
import p431pz.C24955a;
import p609wh.AbstractC29039u0;
import pm0.AbstractC24856m;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import qm0.AbstractC25363p0;
import su.AbstractC26389c;

/* renamed from: oz.b */
/* loaded from: classes4.dex */
public final class C24585b {
    public static final b Companion = new b(null);

    /* renamed from: g */
    private static final InterfaceC24854k f118318g;

    /* renamed from: a */
    private final C24955a f118319a;

    /* renamed from: b */
    private volatile boolean f118320b;

    /* renamed from: c */
    private volatile String f118321c;

    /* renamed from: d */
    private volatile boolean f118322d;

    /* renamed from: e */
    private e f118323e;

    /* renamed from: f */
    private List f118324f;

    /* renamed from: oz.b$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f118325q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24585b mo12V4() {
            return c.f118326a.m128050a();
        }
    }

    /* renamed from: oz.b$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C24585b m128049a() {
            return (C24585b) C24585b.f118318g.getValue();
        }
    }

    /* renamed from: oz.b$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f118326a = new c();

        /* renamed from: b */
        private static final C24585b f118327b = new C24585b(new C24955a());

        private c() {
        }

        /* renamed from: a */
        public final C24585b m128050a() {
            return f118327b;
        }
    }

    /* renamed from: oz.b$d */
    /* loaded from: classes4.dex */
    public interface d {
        /* renamed from: l */
        void mo50383l();
    }

    /* renamed from: oz.b$e */
    /* loaded from: classes4.dex */
    public static final class e {

        /* renamed from: a */
        private final String f118328a;

        /* renamed from: b */
        private final ReportInfoCollected f118329b;

        /* renamed from: c */
        private final ReportInfoCollected f118330c;

        /* renamed from: d */
        private final int f118331d;

        public e(String str, ReportInfoCollected reportInfoCollected, ReportInfoCollected reportInfoCollected2, int i11) {
            AbstractC19074t.m100208f(str, "reportSessionId");
            AbstractC19074t.m100208f(reportInfoCollected, "reportInfoSessionOrigin");
            AbstractC19074t.m100208f(reportInfoCollected2, "reportInfoSessionAttachment");
            this.f118328a = str;
            this.f118329b = reportInfoCollected;
            this.f118330c = reportInfoCollected2;
            this.f118331d = i11;
        }

        /* renamed from: a */
        public final ReportInfoCollected m128051a() {
            return this.f118330c;
        }

        /* renamed from: b */
        public final ReportInfoCollected m128052b() {
            return this.f118329b;
        }

        /* renamed from: c */
        public final int m128053c() {
            return this.f118331d;
        }
    }

    /* renamed from: oz.b$f */
    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC20630d {

        /* renamed from: b */
        final /* synthetic */ String f118333b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC18505l f118334c;

        f(String str, InterfaceC18505l interfaceC18505l) {
            this.f118333b = str;
            this.f118334c = interfaceC18505l;
        }

        @Override // in.InterfaceC20630d
        /* renamed from: a */
        public void mo91783a(String str, boolean z11) {
            C24585b.this.m128015J(str, this.f118333b, this.f118334c);
        }

        @Override // in.InterfaceC20630d
        /* renamed from: b */
        public void mo91784b(int i11, boolean z11) {
            C24585b.this.m128014I(i11, this.f118334c);
        }

        @Override // in.InterfaceC20630d
        /* renamed from: c */
        public void mo91785c(long j11, String str) {
        }
    }

    /* renamed from: oz.b$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ d f118336r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(d dVar) {
            super(1);
            this.f118336r = dVar;
        }

        /* renamed from: a */
        public final void m128054a(boolean z11) {
            C24585b.this.m128012G(z11, this.f118336r, true);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m128054a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f118325q);
        f118318g = m129210a;
    }

    public C24585b(C24955a c24955a) {
        AbstractC19074t.m100208f(c24955a, "localDataSource");
        this.f118319a = c24955a;
        this.f118321c = "";
        this.f118322d = true;
    }

    /* renamed from: C */
    public static final void m128009C(C24585b c24585b, d dVar) {
        AbstractC19074t.m100208f(c24585b, "this$0");
        AbstractC19074t.m100208f(dVar, "$listener");
        c24585b.m128029F(dVar);
    }

    /* renamed from: D */
    private final boolean m128010D(String str) {
        String m128024l;
        File file;
        boolean z11 = false;
        try {
            m128024l = m128024l();
            file = new File(m128024l);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ReportRepository", e11);
        }
        if (!file.exists()) {
            return false;
        }
        if (AbstractC19074t.m100204b(AbstractC26389c.m135988d(m128024l), str)) {
            C23493c c23493c = C23493c.f114055a;
            c23493c.m123323m("loadConfigFromFile: match checksum");
            String m128016K = m128016K(file);
            if (m128016K.length() > 0) {
                C23964a.m125397h(C23964a.f115975a, new JSONObject(m128016K), false, 2, null);
                c23493c.m123323m("loadConfigFromFile: success checksum=" + str);
                this.f118321c = str;
                z11 = true;
            } else {
                c23493c.m123323m("loadConfigFromFile: empty");
            }
        }
        return z11;
    }

    /* renamed from: E */
    private final synchronized void m128011E(String str, String str2, InterfaceC18505l interfaceC18505l) {
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ReportRepository", e11);
            this.f118320b = false;
            interfaceC18505l.mo205i9(Boolean.FALSE);
        }
        if (!C23055e5.m118273h(false, 1, null)) {
            interfaceC18505l.mo205i9(Boolean.FALSE);
            return;
        }
        C23493c.f114055a.m123323m("loadConfigFromRemote: link=" + str + ", checksum=" + str2);
        this.f118320b = true;
        String m128024l = m128024l();
        AbstractC23041d2.m118208g(m128024l);
        C20627a c20627a = new C20627a(false);
        c20627a.m107419g0(new f(str2, interfaceC18505l));
        c20627a.m107416d0(false);
        c20627a.m107420h0(m128024l);
        c20627a.m107488m(str);
    }

    /* renamed from: G */
    public final synchronized void m128012G(boolean z11, d dVar, boolean z12) {
        List list;
        if (!z11) {
            try {
                C23493c.f114055a.m123323m("loadConfig: in DEFAULT");
                C23964a.f115975a.m125405i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        dVar.mo50383l();
        if (z12 && (list = this.f118324f) != null) {
            synchronized (list) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((d) it.next()).mo50383l();
                    }
                    list.clear();
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
        }
    }

    /* renamed from: H */
    static /* synthetic */ void m128013H(C24585b c24585b, boolean z11, d dVar, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        c24585b.m128012G(z11, dVar, z12);
    }

    /* renamed from: I */
    public final synchronized void m128014I(int i11, InterfaceC18505l interfaceC18505l) {
        Boolean bool;
        try {
            try {
                C23493c.f114055a.m123323m("loadConfig: in REMOTE error=" + i11);
                this.f118320b = false;
                bool = Boolean.FALSE;
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ReportRepository", e11);
                this.f118320b = false;
                bool = Boolean.FALSE;
            }
            interfaceC18505l.mo205i9(bool);
        } catch (Throwable th2) {
            this.f118320b = false;
            interfaceC18505l.mo205i9(Boolean.FALSE);
            throw th2;
        }
    }

    /* renamed from: J */
    public final synchronized void m128015J(String str, String str2, InterfaceC18505l interfaceC18505l) {
        Boolean bool;
        boolean z11;
        try {
            try {
                C23493c.f114055a.m123323m("loadConfig: in REMOTE success");
            } catch (Throwable th2) {
                this.f118320b = false;
                interfaceC18505l.mo205i9(Boolean.FALSE);
                throw th2;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ReportRepository", e11);
            this.f118320b = false;
            bool = Boolean.FALSE;
        }
        if (str != null && str.length() != 0) {
            z11 = m128010D(str2);
            this.f118320b = false;
            bool = Boolean.valueOf(z11);
            interfaceC18505l.mo205i9(bool);
        }
        z11 = false;
        this.f118320b = false;
        bool = Boolean.valueOf(z11);
        interfaceC18505l.mo205i9(bool);
    }

    /* renamed from: K */
    private final String m128016K(File file) {
        String m119725j;
        byte[] m119724i = AbstractC23238v2.m119724i(file);
        if (m119724i != null && (m119725j = AbstractC23238v2.m119725j(m119724i)) != null) {
            return m119725j;
        }
        return "";
    }

    /* renamed from: f */
    private final boolean m128022f() {
        return this.f118322d;
    }

    /* renamed from: i */
    private final String m128023i(Map map) {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            sb2.append(((String) entry.getKey()) + "=" + ((String) entry.getValue()) + ";");
        }
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: l */
    private final String m128024l() {
        return m128026q() + "json_config_report";
    }

    /* renamed from: m */
    public static final C24585b m128025m() {
        return Companion.m128049a();
    }

    /* renamed from: q */
    private final String m128026q() {
        File file = new File(C20131e.f99303a.m104950e0(), "report_config");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getPath() + File.separator;
    }

    /* renamed from: A */
    public final boolean m128027A() {
        if (m128037o() <= 0 && m128038p() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    public final void m128028B(d dVar) {
        AbstractC19074t.m100208f(dVar, "listener");
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: oz.a

            /* renamed from: q */
            public final /* synthetic */ C24585b.d f118317q;

            public /* synthetic */ RunnableC24584a(C24585b.d dVar2) {
                r2 = dVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C24585b.m128009C(C24585b.this, r2);
            }
        });
    }

    /* renamed from: F */
    public final synchronized void m128029F(d dVar) {
        try {
            AbstractC19074t.m100208f(dVar, "listener");
            try {
                String m128034j = m128034j();
                if (C23964a.f115975a.m125403f() && AbstractC19074t.m100204b(this.f118321c, m128034j)) {
                    C23493c.f114055a.m123323m("loadConfig: in MEM");
                    m128013H(this, true, dVar, false, 4, null);
                } else {
                    boolean z11 = this.f118320b;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("loadConfig isDownloading=");
                    sb2.append(z11);
                    if (this.f118320b) {
                        if (this.f118324f == null) {
                            this.f118324f = new ArrayList();
                        }
                        List list = this.f118324f;
                        if (list != null) {
                            list.add(dVar);
                        }
                        return;
                    }
                    if (m128010D(m128034j)) {
                        C23493c.f114055a.m123323m("loadConfig: in FILE");
                        m128013H(this, true, dVar, false, 4, null);
                    } else {
                        if (m128022f()) {
                            String m128036n = m128036n();
                            if (m128036n.length() != 0 && m128034j.length() != 0) {
                                m128011E(m128036n, m128034j, new g(dVar));
                            }
                            C23493c.f114055a.m123323m("linkJsonConfig || checksumLatestConfig empty");
                            m128013H(this, false, dVar, false, 4, null);
                            return;
                        }
                        m128013H(this, false, dVar, false, 4, null);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ReportRepository", e11);
                m128013H(this, false, dVar, false, 4, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: L */
    public final void m128030L(String str, ReportInfoCollected reportInfoCollected, ReportInfoCollected reportInfoCollected2, int i11) {
        AbstractC19074t.m100208f(str, "reportSessionId");
        AbstractC19074t.m100208f(reportInfoCollected, "reportInfoOrigin");
        AbstractC19074t.m100208f(reportInfoCollected2, "reportInfoAttachment");
        this.f118323e = new e(str, reportInfoCollected, reportInfoCollected2, i11);
    }

    /* renamed from: M */
    public final void m128031M(ReportInfoCollected reportInfoCollected, HashMap hashMap, InterfaceC21769d interfaceC21769d, int i11) {
        C24848g0 c24848g0;
        Map m131407l;
        int i12;
        boolean z11;
        AbstractC19074t.m100208f(reportInfoCollected, "reportInfoCollected");
        AbstractC19074t.m100208f(interfaceC21769d, "networkListener");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C24848g0 c24848g02 = null;
        int i13 = 0;
        if (hashMap != null) {
            byteArrayOutputStream.write(AbstractC17522a.m93345h(hashMap.size()));
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                C23967d c23967d = (C23967d) ((Map.Entry) it.next()).getValue();
                AbstractC23238v2.m119729n(byteArrayOutputStream, c23967d.m125428b());
                AbstractC23238v2.m119729n(byteArrayOutputStream, c23967d.m125429c());
                byteArrayOutputStream.write(AbstractC17522a.m93344g(c23967d.m125427a().length));
                if (c23967d.m125427a().length == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    byteArrayOutputStream.write(c23967d.m125427a());
                }
            }
            c24848g0 = C24848g0.f119245a;
        } else {
            c24848g0 = null;
        }
        if (c24848g0 == null) {
            byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
        }
        List<ReportMessageAttachment> m50179b = reportInfoCollected.m50179b();
        if (m50179b != null) {
            byteArrayOutputStream.write(AbstractC17522a.m93345h(m50179b.size()));
            for (ReportMessageAttachment reportMessageAttachment : m50179b) {
                byteArrayOutputStream.write(AbstractC17522a.m93346i(reportMessageAttachment.m50194a()));
                AbstractC23238v2.m119728m(byteArrayOutputStream, reportMessageAttachment.m50195b());
            }
            c24848g02 = C24848g0.f119245a;
        }
        if (c24848g02 == null) {
            byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
        }
        String m145033a = AbstractC29039u0.m145033a(AbstractC29039u0.b.ZALO_REPORT_V2_URL);
        C24860q[] c24860qArr = new C24860q[6];
        c24860qArr[0] = AbstractC24866w.m129235a("uidto", reportInfoCollected.m50184g());
        c24860qArr[1] = AbstractC24866w.m129235a("objectid", reportInfoCollected.m50182e());
        String m50183f = reportInfoCollected.m50183f();
        if (m50183f == null) {
            m50183f = "";
        }
        c24860qArr[2] = AbstractC24866w.m129235a("reason", m50183f);
        c24860qArr[3] = AbstractC24866w.m129235a("message", reportInfoCollected.m50181d());
        c24860qArr[4] = AbstractC24866w.m129235a("content", reportInfoCollected.m50178a());
        c24860qArr[5] = AbstractC24866w.m129235a("sourceAction", String.valueOf(i11));
        m131407l = AbstractC25363p0.m131407l(c24860qArr);
        List m50179b2 = reportInfoCollected.m50179b();
        if (m50179b2 != null) {
            i12 = m50179b2.size();
        } else {
            i12 = 0;
        }
        if (hashMap != null) {
            i13 = hashMap.size();
        }
        C24561c.m127942b("ReportRepository", "Report info: cnt_msg=" + i12 + ", cnt_photo=" + i13 + ", params=" + m128023i(m131407l));
        InterfaceC21766a m112296a = AbstractC21767b.f105718a.m112296a();
        C21294d c21294d = new C21294d("imgMsgBin", "filename", "application/octet-stream", byteArrayOutputStream.toByteArray());
        AbstractC19074t.m100205c(m145033a);
        m112296a.mo1369e(m145033a, 12124, false, m131407l, c21294d, null, interfaceC21769d);
    }

    /* renamed from: g */
    public final void m128032g() {
        this.f118321c = "";
        this.f118323e = null;
        this.f118324f = null;
    }

    /* renamed from: h */
    public final void m128033h() {
        this.f118323e = null;
    }

    /* renamed from: j */
    public String m128034j() {
        return this.f118319a.m129666a();
    }

    /* renamed from: k */
    public final C23966c m128035k(String str) {
        return C23964a.f115975a.m125401d(str);
    }

    /* renamed from: n */
    public String m128036n() {
        return this.f118319a.m129667b();
    }

    /* renamed from: o */
    public int m128037o() {
        return this.f118319a.m129668c();
    }

    /* renamed from: p */
    public int m128038p() {
        return this.f118319a.m129669d();
    }

    /* renamed from: r */
    public String m128039r() {
        return this.f118319a.m129670e();
    }

    /* renamed from: s */
    public final C23965b m128040s(String str) {
        AbstractC19074t.m100208f(str, "followAction");
        return C23964a.f115975a.m125400c(str);
    }

    /* renamed from: t */
    public final ReportInfoCollected m128041t() {
        e eVar = this.f118323e;
        if (eVar != null) {
            return eVar.m128051a();
        }
        return null;
    }

    /* renamed from: u */
    public final ReportInfoCollected m128042u() {
        e eVar = this.f118323e;
        if (eVar != null) {
            return eVar.m128052b();
        }
        return null;
    }

    /* renamed from: v */
    public int m128043v() {
        return this.f118319a.m129671f();
    }

    /* renamed from: w */
    public int m128044w() {
        return this.f118319a.m129672g();
    }

    /* renamed from: x */
    public final AbstractC23968e m128045x(String str) {
        return C23964a.f115975a.m125402e(str);
    }

    /* renamed from: y */
    public final int m128046y() {
        e eVar = this.f118323e;
        if (eVar != null) {
            return eVar.m128053c();
        }
        return 0;
    }

    /* renamed from: z */
    public int m128047z() {
        return this.f118319a.m129673h();
    }
}
