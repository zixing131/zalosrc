package e40;

import ag0.C0815e1;
import am.AbstractC0924m0;
import c40.C3282k;
import com.zing.zalo.MainApplication;
import com.zing.zalo.client.AESUtils;
import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p062db.zadb.wrapper.ZdbApiCode;
import com.zing.zalo.transfermsg.exception.TransferDataException;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import f40.C18719a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import g40.C19226a;
import gm0.AbstractC19512f;
import gm0.AbstractC19513g;
import il.C20604a;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import me0.AbstractC23008a2;
import me0.AbstractC23041d2;
import me0.C23055e5;
import nh0.C23793c;
import org.json.JSONException;
import org.json.JSONObject;
import p248iy.AbstractC20887g;
import p301kl.C21757a;
import p301kl.C21758b;
import p348mi.AbstractC23306f;
import p586vt.AbstractC28617b;
import p586vt.AbstractC28618c;
import p586vt.AbstractC28626k;
import pm0.C24848g0;

/* renamed from: e40.a */
/* loaded from: classes5.dex */
public final class C18198a extends AbstractC28617b {
    public static final a Companion = new a(null);

    /* renamed from: j */
    private final String f92375j;

    /* renamed from: k */
    private final String f92376k;

    /* renamed from: l */
    private long f92377l;

    /* renamed from: m */
    private final long f92378m;

    /* renamed from: n */
    private final String f92379n;

    /* renamed from: o */
    private int f92380o;

    /* renamed from: p */
    private boolean f92381p;

    /* renamed from: q */
    public JSONObject f92382q;

    /* renamed from: r */
    private int f92383r;

    /* renamed from: s */
    private String f92384s;

    /* renamed from: t */
    private String f92385t;

    /* renamed from: u */
    private long f92386u;

    /* renamed from: e40.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: e40.a$b */
    /* loaded from: classes5.dex */
    public static final class b implements AbstractC28617b.a {
        @Override // p586vt.AbstractC28617b.a
        /* renamed from: c */
        public C18198a mo96991a(String str) {
            if (str != null) {
                try {
                    if (str.length() != 0) {
                        JSONObject jSONObject = new JSONObject(str);
                        String optString = jSONObject.optString("cuid");
                        String optString2 = jSONObject.optString("public_key");
                        long optLong = jSONObject.optLong("from_seqid");
                        long optLong2 = jSONObject.optLong("min_seqid");
                        String optString3 = jSONObject.optString("pc_name", "fakePcName");
                        int optInt = jSONObject.optInt("retry_source", 0);
                        AbstractC19074t.m100205c(optString);
                        AbstractC19074t.m100205c(optString3);
                        AbstractC19074t.m100205c(optString2);
                        C18198a c18198a = new C18198a(optString, optString3, optString2, optLong, optLong2);
                        c18198a.m96984I(optInt);
                        return c18198a;
                    }
                    return null;
                } catch (JSONException e11) {
                    C18719a.m98710c("SMLTransferMsg", e11);
                    return null;
                }
            }
            return null;
        }

        @Override // p586vt.AbstractC28617b.a
        /* renamed from: d */
        public c mo96992b(boolean z11, boolean z12, String str) {
            return new c(z11, z12, str);
        }
    }

    /* renamed from: e40.a$d */
    /* loaded from: classes5.dex */
    static final class d extends AbstractC19075u implements InterfaceC18505l {
        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m96998a(Object obj) {
            AbstractC19074t.m100208f(obj, "it");
            C18198a.this.m96979x();
            C18198a.this.m96974H(new c(true, null));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m96998a(obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: e40.a$e */
    /* loaded from: classes5.dex */
    static final class e extends AbstractC19075u implements InterfaceC18509p {
        e() {
            super(2);
        }

        /* renamed from: a */
        public final void m96999a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMessage");
            if (C23055e5.m118273h(false, 1, null)) {
                C18198a.this.m96974H(new c(false, new C18199b(4, 9, i11, str)));
            } else {
                C18198a.this.m96974H(new c(false, new C18199b(4, 11, 502, "Network error when upload")));
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m96999a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e40.a$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final f f92389q = new f();

        f() {
            super(1);
        }

        /* renamed from: a */
        public final void m97000a(Object obj) {
            AbstractC19074t.m100208f(obj, "it");
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m97000a(obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e40.a$g */
    /* loaded from: classes5.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final g f92390q = new g();

        g() {
            super(2);
        }

        /* renamed from: a */
        public final void m97001a(int i11, String str) {
            AbstractC19074t.m100208f(str, "<anonymous parameter 1>");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m97001a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: e40.a$h */
    /* loaded from: classes5.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final h f92391q = new h();

        h() {
            super(1);
        }

        /* renamed from: a */
        public final void m97002a(Object obj) {
            AbstractC19074t.m100208f(obj, "it");
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m97002a(obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: e40.a$i */
    /* loaded from: classes5.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final i f92392q = new i();

        i() {
            super(2);
        }

        /* renamed from: a */
        public final void m97003a(int i11, String str) {
            AbstractC19074t.m100208f(str, "<anonymous parameter 1>");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m97003a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    public C18198a(String str, String str2, String str3, long j11, long j12) {
        AbstractC19074t.m100208f(str, "currentUserUid");
        AbstractC19074t.m100208f(str2, "pcName");
        AbstractC19074t.m100208f(str3, "publicKey");
        this.f92375j = str2;
        this.f92381p = true;
        this.f92385t = "";
        m143133n(str3);
        this.f92379n = str;
        this.f92376k = str3;
        this.f92377l = j11;
        m143139t(str);
        this.f92378m = j12;
    }

    /* renamed from: A */
    private final float m96970A() {
        int m3125I1 = AbstractC0924m0.m3125I1();
        if (m3125I1 == -1) {
            m3125I1 = AbstractC0924m0.m3590Y2();
        }
        return m3125I1 / 100.0f;
    }

    /* renamed from: C */
    private final String m96971C(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "" : "UPLOAD" : "ENCRYPT" : "COMPRESS" : "EXPORT" : Image.SCALE_TYPE_NONE;
    }

    /* renamed from: E */
    private final void m96972E(int i11) {
        if (!m143130i()) {
            m96973F(i11, null);
            return;
        }
        throw new TransferDataException(-1234, "Job canceled while " + m96971C(i11));
    }

    /* renamed from: F */
    private final void m96973F(int i11, AbstractC28626k abstractC28626k) {
        try {
            Thread.sleep(300L);
        } catch (Exception e11) {
            C18719a.m98710c("SMLTransferMsg", e11);
        }
        this.f92383r = i11;
        AbstractC23306f.m120585H1().m16680F(this.f92379n, i11, abstractC28626k);
    }

    /* renamed from: H */
    public final void m96974H(AbstractC28626k abstractC28626k) {
        Integer num = null;
        C18719a.m98713f("FINISH Transfer flow: jobResult=" + abstractC28626k, null, 2, null);
        m143137r(abstractC28626k);
        long currentTimeMillis = System.currentTimeMillis() - this.f92386u;
        try {
            if (!abstractC28626k.m143172f()) {
                AbstractC28618c m143169b = abstractC28626k.m143169b();
                if (m143169b != null) {
                    num = Integer.valueOf(m143169b.m143140a());
                }
                int m96980y = m96980y(this.f92383r);
                C19067n0 c19067n0 = C19067n0.f94947a;
                String format = String.format("Error %d", Arrays.copyOf(new Object[]{num}, 1));
                AbstractC19074t.m100207e(format, "format(...)");
                AbstractC20887g.m109240r(m96980y, format);
                String format2 = String.format("TimeError: %d", Arrays.copyOf(new Object[]{Long.valueOf(currentTimeMillis)}, 1));
                AbstractC19074t.m100207e(format2, "format(...)");
                AbstractC20887g.m109240r(19910, format2);
            } else {
                C19067n0 c19067n02 = C19067n0.f94947a;
                String format3 = String.format("TimeSuccess: %d", Arrays.copyOf(new Object[]{Long.valueOf(currentTimeMillis)}, 1));
                AbstractC19074t.m100207e(format3, "format(...)");
                AbstractC20887g.m109248z(19909, format3);
            }
        } catch (Exception e11) {
            C18719a.m98710c("SMLTransferMsg", e11);
        }
        AbstractC23306f.m120696o().m126199K();
        m96973F(0, abstractC28626k);
        m96975K(this.f92375j, this.f92376k, abstractC28626k);
        m96978w();
    }

    /* renamed from: K */
    private final void m96975K(String str, String str2, AbstractC28626k abstractC28626k) {
        int i11;
        String str3;
        String str4;
        C20604a m120591J1 = AbstractC23306f.m120591J1();
        AbstractC19074t.m100207e(m120591J1, "provideTransferMsgRepo(...)");
        if (abstractC28626k.m143172f()) {
            i11 = 0;
        } else {
            i11 = -1;
        }
        if (abstractC28626k.m143172f()) {
            str3 = "Transfer message success";
        } else {
            str3 = "Transfer message error";
        }
        if (!abstractC28626k.m143172f()) {
            if (abstractC28626k.m143169b() != null) {
                AbstractC28618c m143169b = abstractC28626k.m143169b();
                AbstractC19074t.m100205c(m143169b);
                i11 = m143169b.m143140a();
                AbstractC28618c m143169b2 = abstractC28626k.m143169b();
                AbstractC19074t.m100205c(m143169b2);
                str3 = m143169b2.m143141b();
            } else {
                throw new IllegalArgumentException("Job failure without error data");
            }
        }
        m120591J1.m107236g(new C21758b(str, str2, -1, i11, str3, true), h.f92391q, i.f92392q);
        try {
            if (abstractC28626k.m143172f()) {
                C0815e1.m2075D().m2105c(12, 1, 0, "1");
                return;
            }
            C0815e1 m2075D = C0815e1.m2075D();
            String[] strArr = new String[2];
            strArr[0] = "0";
            AbstractC28618c m143169b3 = abstractC28626k.m143169b();
            if (m143169b3 != null) {
                str4 = m143169b3.m143141b();
            } else {
                str4 = null;
            }
            strArr[1] = str4;
            m2075D.m2105c(12, 1, 0, strArr);
        } catch (Exception e11) {
            C18719a.m98710c("SMLTransferMsg", e11);
        }
    }

    /* renamed from: w */
    private final void m96978w() {
        try {
            C18719a.m98713f("Clear files after transfer message completed: " + this.f92385t, null, 2, null);
            AbstractC23041d2.m118207f(new File(this.f92385t));
        } catch (Exception e11) {
            C18719a.m98710c("SMLTransferMsg", e11);
        }
    }

    /* renamed from: x */
    public final void m96979x() {
        C3282k m120585H1 = AbstractC23306f.m120585H1();
        if (m120585H1.m16687z()) {
            m120585H1.m16685p();
            m120585H1.m16684o();
            m120585H1.m16683n();
        }
    }

    /* renamed from: y */
    private final int m96980y(int i11) {
        if (i11 == 0) {
            return 19902;
        }
        if (i11 == 1) {
            return 19904;
        }
        if (i11 == 2 || i11 == 3) {
            return 19906;
        }
        return i11 != 4 ? 19910 : 19908;
    }

    /* renamed from: B */
    public final String m96981B() {
        return this.f92375j;
    }

    /* renamed from: D */
    public final String m96982D() {
        return this.f92376k;
    }

    /* renamed from: G */
    public final void m96983G(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "<set-?>");
        this.f92382q = jSONObject;
    }

    /* renamed from: I */
    public final void m96984I(int i11) {
        this.f92380o = i11;
    }

    /* renamed from: J */
    public final void m96985J(int i11) {
        AbstractC23306f.m120591J1().m107236g(new C21758b(this.f92375j, this.f92376k, i11, 0, "", false), f.f92389q, g.f92390q);
    }

    @Override // p586vt.AbstractC28617b
    /* renamed from: b */
    public String mo96986b() {
        return "PcTransferMessage";
    }

    @Override // p586vt.AbstractC28617b
    /* renamed from: d */
    public String mo96987d() {
        return "PC_TRANSFER";
    }

    @Override // p586vt.AbstractC28617b
    /* renamed from: k */
    protected void mo96988k() {
        byte[] bArr;
        File file;
        boolean z11;
        try {
            C18719a.m98713f("START Transfer flow", null, 2, null);
            this.f92386u = System.currentTimeMillis();
            AbstractC20887g.m109217D(19901, null, 2, null);
            AbstractC23306f.m120696o().m126201o(mo96987d());
            m96972E(1);
            String path = MainApplication.Companion.m35500c().getFilesDir().getPath();
            String m101985d = AbstractC19512f.m101985d(AESUtils.m39916b(CoreUtility.f89225a, AbstractC19513g.m101988b(this.f92379n)));
            AbstractC19074t.m100207e(m101985d, "toHex(...)");
            Locale locale = Locale.getDefault();
            AbstractC19074t.m100207e(locale, "getDefault(...)");
            String lowerCase = m101985d.toLowerCase(locale);
            AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
            this.f92385t = path + "/pc_transfer/" + lowerCase;
            File file2 = new File(this.f92385t);
            if (!file2.exists() && !file2.mkdirs()) {
                throw new TransferDataException(1, "Failed to create temp dir to create backup");
            }
            AbstractC20887g.m109217D(19903, null, 2, null);
            File file3 = new File(file2, (lowerCase + ".db") + ".crypt");
            String absolutePath = file3.getAbsolutePath();
            AbstractC19074t.m100207e(absolutePath, "getAbsolutePath(...)");
            this.f92384s = absolutePath;
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            C19226a c19226a = new C19226a();
            byte[] m100879b = c19226a.m100879b();
            String m101985d2 = AbstractC19512f.m101985d(m100879b);
            long m93891c = AbstractC23306f.m120594K1().m93891c();
            float m96970A = m96970A();
            float m128411f = AbstractC23306f.m120676j().m128411f() / 100.0f;
            int m128412g = AbstractC23306f.m120676j().m128412g();
            C18719a.m98713f("Prepare Transfer DB: (fromSeqId=" + this.f92377l + ", minSeqId=" + this.f92378m + "), (oldCompressRatio=" + m96970A + ", compressLevel=" + m128412g + ", bonusCompressRatio=" + m128411f + ", limitSize=" + m93891c + ")", null, 2, null);
            C7956b m41573b = C7956b.Companion.m41573b();
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            int parseInt = Integer.parseInt(str);
            int[] iArr = new int[0];
            boolean[] zArr = new boolean[0];
            String str2 = this.f92385t;
            String str3 = this.f92384s;
            if (str3 == null) {
                AbstractC19074t.m100223u("encryptFilePath");
                bArr = m100879b;
                file = file3;
                str3 = null;
            } else {
                bArr = m100879b;
                file = file3;
            }
            String m41540g = m41573b.m41540g(parseInt, iArr, zArr, str2, str3, m101985d2, m128412g, m93891c, m96970A, m128411f, this.f92377l, this.f92378m, zdbApiCode);
            AbstractC23008a2.m117942k(zdbApiCode, "backupDBTask", "TransferMsg");
            if (zdbApiCode.error_code == 0) {
                long mo124311f = C23793c.Companion.m124321a().mo124311f();
                try {
                    JSONObject jSONObject = new JSONObject(m41540g);
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("msg_total", jSONObject.optLong("noMsgs"));
                    jSONObject3.put("msg_thread", jSONObject.optInt("noUids"));
                    jSONObject2.put("backup_db", jSONObject3);
                    jSONObject2.put("db_format", 1);
                    m96983G(jSONObject2);
                    long optLong = jSONObject.optLong("fromTs", this.f92377l);
                    this.f92377l = optLong;
                    if (optLong <= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f92381p = z11;
                    long optLong2 = jSONObject.optLong("backupFileSize");
                    long optLong3 = jSONObject.optLong("totalUncompressSize");
                    if (optLong3 > 0) {
                        AbstractC0924m0.m3084Gi((int) Math.ceil((optLong2 * 100) / optLong3));
                    }
                } catch (Exception e11) {
                    C18719a.m98710c("SMLTransferMsg", e11);
                }
                if (file.exists()) {
                    C18719a.m98713f("Encrypt DB key using Public Key PC: " + this.f92376k, null, 2, null);
                    C19226a.a aVar = C19226a.Companion;
                    String m100881b = aVar.m100881b(c19226a.m100878a(aVar.m100880a(this.f92376k), bArr));
                    m96972E(4);
                    AbstractC20887g.m109217D(19907, null, 2, null);
                    if (!C23055e5.m118273h(false, 1, null)) {
                        m96974H(new c(false, new C18199b(4, 10, 502, "Network not connected when upload")));
                        return;
                    } else {
                        AbstractC23306f.m120591J1().m107237h(new C21757a(file, mo124311f, this.f92377l, this.f92376k, m100881b, this.f92380o, this.f92381p, m96990z()), new d(), new e());
                        return;
                    }
                }
                throw new TransferDataException(8, "Export success but file not exist");
            }
            throw new TransferDataException(9, "Backup db to file error");
        } catch (TransferDataException e12) {
            C18719a.m98710c("SMLTransferMsg", e12);
            m96974H(new c(false, new C18199b(this.f92383r, 12, e12.m56658a(), e12.m56659b())));
        } catch (Exception e13) {
            C18719a.m98710c("SMLTransferMsg", e13);
            m96974H(new c(false, new C18199b(this.f92383r, -1, -1, e13.getLocalizedMessage())));
        }
    }

    @Override // p586vt.AbstractC28617b
    /* renamed from: m */
    public String mo96989m() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cuid", this.f92379n);
            jSONObject.put("public_key", this.f92376k);
            jSONObject.put("from_seqid", this.f92377l);
            jSONObject.put("min_seqid", this.f92378m);
            jSONObject.put("pc_name", this.f92375j);
            jSONObject.put("retry_source", this.f92380o);
        } catch (JSONException e11) {
            C18719a.m98710c("SMLTransferMsg", e11);
        }
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    /* renamed from: z */
    public final JSONObject m96990z() {
        JSONObject jSONObject = this.f92382q;
        if (jSONObject != null) {
            return jSONObject;
        }
        AbstractC19074t.m100223u("infoObject");
        return null;
    }

    /* renamed from: e40.a$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC28626k {
        public c(boolean z11, C18199b c18199b) {
            super(z11, c18199b);
            m143176k(true);
            m143174i(System.currentTimeMillis());
        }

        @Override // p586vt.AbstractC28626k
        /* renamed from: c */
        public boolean mo96995c() {
            AbstractC28618c m143169b = m143169b();
            if (m143169b == null || m143169b.m143140a() != -1234) {
                return false;
            }
            return true;
        }

        @Override // p586vt.AbstractC28626k
        /* renamed from: g */
        public String mo96996g() {
            Integer num;
            Integer num2;
            Integer num3;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("event_time", m143168a());
                if (m143169b() != null) {
                    AbstractC28618c m143169b = m143169b();
                    String str = null;
                    if (m143169b != null) {
                        num = Integer.valueOf(m143169b.m143142c());
                    } else {
                        num = null;
                    }
                    jSONObject.put("error_phase", num);
                    AbstractC28618c m143169b2 = m143169b();
                    if (m143169b2 != null) {
                        num2 = Integer.valueOf(m143169b2.m143143d());
                    } else {
                        num2 = null;
                    }
                    jSONObject.put("error_pos", num2);
                    AbstractC28618c m143169b3 = m143169b();
                    if (m143169b3 != null) {
                        num3 = Integer.valueOf(m143169b3.m143140a());
                    } else {
                        num3 = null;
                    }
                    jSONObject.put("error_code", num3);
                    AbstractC28618c m143169b4 = m143169b();
                    if (m143169b4 != null) {
                        str = m143169b4.m143141b();
                    }
                    jSONObject.put("error_mes", str);
                }
            } catch (JSONException e11) {
                C18719a.m98710c("SMLTransferMsg", e11);
            }
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            return jSONObject2;
        }

        /* renamed from: m */
        public void m96997m(String str) {
            if (str != null && str.length() != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    m143174i(jSONObject.optLong("event_time"));
                    if (jSONObject.has("error_phase") && jSONObject.has("error_pos") && jSONObject.has("error_code")) {
                        m143175j(new C18199b(jSONObject.optInt("error_phase"), jSONObject.optInt("error_pos"), jSONObject.optInt("error_code"), jSONObject.optString("error_mes")));
                    }
                } catch (JSONException e11) {
                    C18719a.m98710c("SMLTransferMsg", e11);
                }
            }
        }

        public c(boolean z11, boolean z12, String str) {
            super(z11);
            m143176k(z12);
            m96997m(str);
        }
    }
}
