package p479rc;

import am.AbstractC0924m0;
import ch0.AbstractC3489d;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import on0.AbstractC24341v;
import p320ld.AbstractC22431c;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p685yl.C31017a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qg0.AbstractC25269d;
import sc.C26220b;
import sg0.AbstractC26246b;
import sg0.C26245a;
import si.C26263i;
import su.AbstractC26389c;

/* renamed from: rc.a */
/* loaded from: classes3.dex */
public final class C25724a {
    public static final b Companion = new b(null);

    /* renamed from: c */
    private static final InterfaceC24854k f122768c;

    /* renamed from: a */
    private final InterfaceC24854k f122769a;

    /* renamed from: b */
    private final InterfaceC24854k f122770b;

    /* renamed from: rc.a$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f122771q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25724a mo12V4() {
            return c.f122772a.m132701a();
        }
    }

    /* renamed from: rc.a$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C25724a m132700a() {
            return (C25724a) C25724a.f122768c.getValue();
        }
    }

    /* renamed from: rc.a$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f122772a = new c();

        /* renamed from: b */
        private static final C25724a f122773b = new C25724a();

        private c() {
        }

        /* renamed from: a */
        public final C25724a m132701a() {
            return f122773b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rc.a$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f122774q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C31017a mo12V4() {
            return AbstractC23306f.m120646b1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rc.a$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f122775q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final AbstractC25269d mo12V4() {
            return AbstractC23306f.m120683k2();
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f122771q);
        f122768c = m129210a;
    }

    public C25724a() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(d.f122774q);
        this.f122769a = m129210a;
        m129210a2 = AbstractC24856m.m129210a(e.f122775q);
        this.f122770b = m129210a2;
    }

    /* renamed from: B */
    public static final C25724a m132648B() {
        return Companion.m132700a();
    }

    /* renamed from: C */
    private final C31017a m132649C() {
        return (C31017a) this.f122769a.getValue();
    }

    /* renamed from: E */
    private final AbstractC25269d m132650E() {
        return (AbstractC25269d) this.f122770b.getValue();
    }

    /* renamed from: H */
    private final void m132651H() {
        C26220b.m134826i("SMLBackupEncryption", "Start migrate Hardware Keystore to Backup Key", null, 4, null);
        m132658r();
        m132659s();
    }

    /* renamed from: L */
    private final void m132652L(int i11) {
        C26220b.m134826i("SMLBackupEncryption", "setBackupKeyType(" + i11 + ")", null, 4, null);
        AbstractC0924m0.m3660ae(i11);
    }

    /* renamed from: S */
    private final void m132653S(int i11) {
        C26220b.m134826i("SMLBackupEncryption", "setDataProtectionType(" + i11 + ")", null, 4, null);
        AbstractC0924m0.m3661af(i11);
    }

    /* renamed from: X */
    private final boolean m132654X(String str, String str2) {
        return AbstractC19074t.m100204b(AbstractC26389c.m135989e(m132649C().m150813f(str2, 1)), str);
    }

    /* renamed from: i */
    public static /* synthetic */ byte[] m132656i(C25724a c25724a, byte[] bArr, C25725b c25725b, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c25725b = null;
        }
        return c25724a.m132689h(bArr, c25725b);
    }

    /* renamed from: k */
    public static /* synthetic */ byte[] m132657k(C25724a c25724a, byte[] bArr, C25725b c25725b, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c25725b = null;
        }
        return c25724a.m132690j(bArr, c25725b);
    }

    /* renamed from: r */
    private final byte[] m132658r() {
        String m4394z4 = AbstractC0924m0.m4394z4();
        AbstractC19074t.m100205c(m4394z4);
        if (m4394z4.length() > 0) {
            return AbstractC26246b.m134964c(m4394z4);
        }
        String m4273v = AbstractC0924m0.m4273v();
        AbstractC19074t.m100205c(m4273v);
        if (m4273v.length() > 0) {
            byte[] mo130732c = m132650E().mo130732c(AbstractC26246b.m134964c(m4273v));
            C26220b.m134826i("SMLBackupEncryption", "Migrate hardware backup PIN -> raw backup PIN", null, 4, null);
            AbstractC0924m0.m3908im(AbstractC26246b.m134963b(mo130732c));
            return mo130732c;
        }
        return new byte[0];
    }

    /* renamed from: s */
    private final byte[] m132659s() {
        String m4365y4 = AbstractC0924m0.m4365y4();
        AbstractC19074t.m100205c(m4365y4);
        if (m4365y4.length() > 0) {
            return AbstractC26246b.m134964c(m4365y4);
        }
        String m4244u = AbstractC0924m0.m4244u();
        AbstractC19074t.m100205c(m4244u);
        if (m4244u.length() > 0) {
            byte[] mo130732c = m132650E().mo130732c(AbstractC26246b.m134964c(m4244u));
            C26220b.m134826i("SMLBackupEncryption", "Migrate hardware backup PASSPHRASE -> raw backup PASSPHRASE", null, 4, null);
            AbstractC0924m0.m3878hm(AbstractC26246b.m134963b(mo130732c));
            return mo130732c;
        }
        return new byte[0];
    }

    /* renamed from: t */
    private final String m132660t() {
        String m121638Yd = AbstractC23309i.m121638Yd();
        AbstractC19074t.m100207e(m121638Yd, "getUserBackupMessagePass(...)");
        return m121638Yd;
    }

    /* renamed from: u */
    private final String m132661u() {
        String m4394z4 = AbstractC0924m0.m4394z4();
        if (m4394z4.length() == 0) {
            String m4273v = AbstractC0924m0.m4273v();
            AbstractC19074t.m100205c(m4273v);
            if (m4273v.length() > 0) {
                return AbstractC26246b.m134963b(m132650E().mo130732c(AbstractC26246b.m134964c(m4273v)));
            }
            return "";
        }
        AbstractC19074t.m100207e(m4394z4, "ifEmpty(...)");
        return m4394z4;
    }

    /* renamed from: v */
    private final String m132662v() {
        String m4365y4 = AbstractC0924m0.m4365y4();
        if (m4365y4.length() == 0) {
            String m4244u = AbstractC0924m0.m4244u();
            AbstractC19074t.m100205c(m4244u);
            if (m4244u.length() > 0) {
                return AbstractC26246b.m134963b(m132650E().mo130732c(AbstractC26246b.m134964c(m4244u)));
            }
            return "";
        }
        AbstractC19074t.m100207e(m4365y4, "ifEmpty(...)");
        return m4365y4;
    }

    /* renamed from: y */
    private final byte[] m132663y() {
        String m4006m0 = AbstractC0924m0.m4006m0();
        AbstractC19074t.m100205c(m4006m0);
        if (m4006m0.length() > 0) {
            return AbstractC26246b.m134964c(m4006m0);
        }
        return new byte[0];
    }

    /* renamed from: z */
    private final byte[] m132664z() {
        String m3976l0 = AbstractC0924m0.m3976l0();
        AbstractC19074t.m100205c(m3976l0);
        if (m3976l0.length() > 0) {
            return AbstractC26246b.m134964c(m3976l0);
        }
        return new byte[0];
    }

    /* renamed from: A */
    public final int m132665A() {
        return AbstractC0924m0.m4036n0();
    }

    /* renamed from: D */
    public final String m132666D(int i11) {
        return m132649C().m150813f(m132660t(), i11);
    }

    /* renamed from: F */
    public final boolean m132667F() {
        return AbstractC19074t.m100204b(m132694o().m132706c(), m132697w().m132706c());
    }

    /* renamed from: G */
    public final boolean m132668G() {
        TargetBackupInfo m135058w = C26263i.m135058w();
        if (m135058w == null || !AbstractC22431c.m115870a(m135058w) || m135058w.m40953i() == 1) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    public final void m132669I() {
        C26220b.m134826i("SMLBackupEncryption", "Start migrate Backup Key -> Protection Code", null, 4, null);
        int m132696q = m132696q();
        if (m132649C().m150816m(m132696q)) {
            C26220b.m134826i("SMLBackupEncryption", "Migrate type (" + m132696q + ")", null, 4, null);
            AbstractC0924m0.m3631Ze(m132661u());
            AbstractC0924m0.m3602Ye(m132662v());
            m132653S(m132696q);
            return;
        }
        m132653S(0);
    }

    /* renamed from: J */
    public final void m132670J() {
        C26220b.m134826i("SMLBackupEncryption", "Start migrate Protection Code -> Backup Key", null, 4, null);
        int m132665A = m132665A();
        if (m132649C().m150816m(m132665A)) {
            C26220b.m134826i("SMLBackupEncryption", "Migrate type (" + m132665A + ")", null, 4, null);
            AbstractC0924m0.m3908im(AbstractC0924m0.m4006m0());
            AbstractC0924m0.m3878hm(AbstractC0924m0.m3976l0());
            m132652L(m132665A);
            return;
        }
        m132652L(0);
    }

    /* renamed from: K */
    public final void m132671K(String str, int i11) {
        AbstractC19074t.m100208f(str, "backupKey");
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    m132673N(str);
                    return;
                }
                throw new IllegalArgumentException("setBackupKey(): Invalid type (" + i11 + ")");
            }
            m132672M(str);
            return;
        }
        m132674O(str);
    }

    /* renamed from: M */
    public final void m132672M(String str) {
        AbstractC19074t.m100208f(str, "pin");
        C26220b.m134826i("SMLBackupEncryption", "setBackupPIN(): " + C26245a.f124654a.m134956q(str), null, 4, null);
        AbstractC0924m0.m3908im(AbstractC26246b.m134963b(m132649C().m150817n(str)));
        m132652L(2);
    }

    /* renamed from: N */
    public final void m132673N(String str) {
        AbstractC19074t.m100208f(str, "passphrase");
        C26220b.m134826i("SMLBackupEncryption", "setBackupPassphrase(): " + C26245a.f124654a.m134956q(str), null, 4, null);
        AbstractC0924m0.m3878hm(AbstractC26246b.m134963b(m132649C().m150817n(str)));
        m132652L(3);
    }

    /* renamed from: O */
    public final void m132674O(String str) {
        AbstractC19074t.m100208f(str, "pwd");
        C26220b.m134826i("SMLBackupEncryption", "setBackupPassword(): " + C26245a.f124654a.m134956q(str), null, 4, null);
        AbstractC23309i.m120994Gz(str);
        m132652L(1);
    }

    /* renamed from: P */
    public final void m132675P(String str, int i11) {
        AbstractC19074t.m100208f(str, "protectionCode");
        if (i11 != 2) {
            if (i11 == 3) {
                m132677R(str);
            } else {
                throw new IllegalArgumentException("setDataProtectionCode(): Invalid type (" + i11 + ")");
            }
        } else {
            m132676Q(str);
        }
        if (m132685d()) {
            m132671K(str, i11);
        }
    }

    /* renamed from: Q */
    public final void m132676Q(String str) {
        AbstractC19074t.m100208f(str, "pin");
        C26220b.m134826i("SMLBackupEncryption", "setDataProtectionPIN(): " + C26245a.f124654a.m134956q(str), null, 4, null);
        AbstractC0924m0.m3631Ze(AbstractC26246b.m134963b(m132649C().m150817n(str)));
        m132653S(2);
        if (m132685d()) {
            m132672M(str);
        }
    }

    /* renamed from: R */
    public final void m132677R(String str) {
        AbstractC19074t.m100208f(str, "passphrase");
        C26220b.m134826i("SMLBackupEncryption", "setDataProtectionPassphrase(): " + C26245a.f124654a.m134956q(str), null, 4, null);
        AbstractC0924m0.m3602Ye(AbstractC26246b.m134963b(m132649C().m150817n(str)));
        m132653S(3);
        if (m132685d()) {
            m132673N(str);
        }
    }

    /* renamed from: T */
    public final void m132678T(String str) {
        AbstractC19074t.m100208f(str, "pwd");
        C26220b.m134826i("SMLBackupEncryption", "Set [legacy password of backup info has db_format = 0] -> to cache!", null, 4, null);
        AbstractC23309i.m120994Gz(str);
    }

    /* renamed from: U */
    public final void m132679U() {
        boolean z11;
        if (AbstractC3489d.m17514v() && !AbstractC3489d.m17512t()) {
            C26220b.m134827j("validateBackupKeyBeforeBackupForPaidUser()", null, 2, null);
            C25725b m132694o = m132694o();
            if (m132694o.m132707d() != 2 && m132694o.m132707d() != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!m132667F() || z11) {
                m132670J();
            }
        }
    }

    /* renamed from: V */
    public final boolean m132680V(TargetBackupInfo targetBackupInfo, String str, int i11) {
        AbstractC19074t.m100208f(targetBackupInfo, "backupInfo");
        AbstractC19074t.m100208f(str, "backupKey");
        try {
            String m40956l = targetBackupInfo.m40956l();
            if (m40956l.length() == 0) {
                return false;
            }
            return AbstractC19074t.m100204b(m132684c(str, i11), m40956l);
        } catch (Exception e11) {
            C26220b.m134821d("SMLBackupEncryption", e11);
            return false;
        }
    }

    /* renamed from: W */
    public final boolean m132681W(String str, int i11) {
        TargetBackupInfo m135058w;
        AbstractC19074t.m100208f(str, "backupKey");
        try {
            if (!C26263i.m135053s() || (m135058w = C26263i.m135058w()) == null) {
                return false;
            }
            if (m135058w.m40954j() == 1) {
                return m132680V(m135058w, str, i11);
            }
            return m132654X(m135058w.m40956l(), str);
        } catch (Exception e11) {
            C26220b.m134821d("SMLBackupEncryption", e11);
            return false;
        }
    }

    /* renamed from: Y */
    public final boolean m132682Y() {
        TargetBackupInfo m135058w;
        try {
            if (!C26263i.m135053s() || (m135058w = C26263i.m135058w()) == null) {
                return false;
            }
            C25725b m132694o = m132694o();
            if (m135058w.m40956l().length() <= 0) {
                return false;
            }
            if (!AbstractC19074t.m100204b(m132694o.m132706c(), m135058w.m40956l())) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            C26220b.m134821d("SMLBackupEncryption", e11);
            return false;
        }
    }

    /* renamed from: b */
    public final C25725b m132683b(String str, int i11) {
        AbstractC19074t.m100208f(str, "backupKey");
        return m132649C().m150809b(str, i11);
    }

    /* renamed from: c */
    public final String m132684c(String str, int i11) {
        AbstractC19074t.m100208f(str, "backupKey");
        return m132649C().m150812e(str, i11);
    }

    /* renamed from: d */
    public final boolean m132685d() {
        if ((AbstractC3489d.m17513u() || AbstractC3489d.m17512t()) && C22447s.f109797a.m116077t0()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m132686e() {
        if (AbstractC3489d.m17513u() && C22447s.f109797a.m116077t0() && m132668G()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void m132687f() {
        if (!AbstractC0924m0.m3509V8()) {
            if (m132665A() == -1) {
                m132669I();
            }
            C26220b.m134826i("SMLBackupEncryption", "Mark Data Protection MIGRATED", null, 4, null);
            AbstractC0924m0.m3573Xe(true);
        }
        if (!AbstractC0924m0.m3337Pa()) {
            m132651H();
            C26220b.m134826i("SMLBackupEncryption", "Mark Hardware Keystore MIGRATED", null, 4, null);
            AbstractC0924m0.m3844gi(true);
        }
    }

    /* renamed from: g */
    public final void m132688g() {
        if (m132686e()) {
            C26220b.m134826i("SMLBackupEncryption", "clearAllLocalBackupKeys(): Skipped!", null, 4, null);
            return;
        }
        C26220b.m134826i("SMLBackupEncryption", "clearAllLocalBackupKeys()", null, 4, null);
        m132652L(0);
        AbstractC23309i.m120994Gz("");
        AbstractC0924m0.m3720ce("");
        AbstractC0924m0.m3690be("");
    }

    /* renamed from: h */
    public final byte[] m132689h(byte[] bArr, C25725b c25725b) {
        AbstractC19074t.m100208f(bArr, "encryptedData");
        C31017a m132649C = m132649C();
        if (c25725b == null) {
            c25725b = m132694o();
        }
        return m132649C.m150814h(bArr, c25725b);
    }

    /* renamed from: j */
    public final byte[] m132690j(byte[] bArr, C25725b c25725b) {
        AbstractC19074t.m100208f(bArr, "encryptedData");
        C31017a m132649C = m132649C();
        if (c25725b == null) {
            c25725b = m132697w();
        }
        return m132649C.m150814h(bArr, c25725b);
    }

    /* renamed from: l */
    public final void m132691l() {
        String m127130z;
        String str;
        String m127130z2;
        int m132665A = m132665A();
        m127130z = AbstractC24341v.m127130z("─", 30);
        if (m132649C().m150816m(m132665A)) {
            str = "Data Protection code: " + m132697w() + "\n";
        } else {
            str = "Data Protection code: EMPTY\n";
        }
        int m132696q = m132696q();
        C25725b m132694o = m132694o();
        m127130z2 = AbstractC24341v.m127130z("─", 50);
        AbstractC20110a.f98889a.m104564x("SMLBackupEncryption").mo104556o(8, m127130z + "\nData Protection type: " + m132665A + "\n" + str + "Backup Key type: " + m132696q + "\nBackup Key: " + m132694o + "\n" + m127130z2, new Object[0]);
    }

    /* renamed from: m */
    public final byte[] m132692m(byte[] bArr) {
        AbstractC19074t.m100208f(bArr, "data");
        return m132649C().m150815j(bArr, m132694o());
    }

    /* renamed from: n */
    public final byte[] m132693n(byte[] bArr) {
        AbstractC19074t.m100208f(bArr, "data");
        return m132649C().m150815j(bArr, m132697w());
    }

    /* renamed from: o */
    public final C25725b m132694o() {
        return m132695p(m132696q());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C25725b m132695p(int i11) {
        String str;
        C25725b c25725b;
        if (i11 == 0) {
            return m132649C().m150810c();
        }
        byte[] bArr = new byte[0];
        if (i11 == 1) {
            String m132660t = m132660t();
            if (m132660t.length() == 0) {
                C26220b.m134826i("SMLBackupEncryption", "Backup PASSWORD is empty!", null, 4, null);
            } else {
                C25725b m150811d = m132649C().m150811d(m132660t);
                byte[] m132705b = m150811d.m132705b();
                str = m150811d.m132706c();
                bArr = m132705b;
                if (i11 == 2) {
                    byte[] m132658r = m132658r();
                    if (m132658r.length == 0) {
                        C26220b.m134826i("SMLBackupEncryption", "Backup PIN is empty!", null, 4, null);
                    } else {
                        str = C26245a.m134942u(C26245a.f124654a, m132658r, 0, 2, null);
                        bArr = m132658r;
                    }
                }
                if (i11 == 3) {
                    byte[] m132659s = m132659s();
                    if (m132659s.length == 0) {
                        C26220b.m134826i("SMLBackupEncryption", "Backup PASSPHRASE is empty!", null, 4, null);
                    } else {
                        str = C26245a.m134942u(C26245a.f124654a, m132659s, 0, 2, null);
                        bArr = m132659s;
                    }
                }
                c25725b = new C25725b(i11, bArr, str);
                if (!c25725b.m132708e()) {
                    return c25725b;
                }
                throw new IllegalStateException("getBackupKey(" + i11 + "): FAILED!");
            }
        }
        str = "";
        if (i11 == 2) {
        }
        if (i11 == 3) {
        }
        c25725b = new C25725b(i11, bArr, str);
        if (!c25725b.m132708e()) {
        }
    }

    /* renamed from: q */
    public final int m132696q() {
        return AbstractC0924m0.m4185s();
    }

    /* renamed from: w */
    public final C25725b m132697w() {
        return m132698x(m132665A());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C25725b m132698x(int i11) {
        String str;
        C25725b c25725b;
        if (i11 == 0) {
            return m132649C().m150810c();
        }
        byte[] bArr = new byte[0];
        if (i11 == 2) {
            byte[] m132663y = m132663y();
            if (m132663y.length == 0) {
                C26220b.m134826i("SMLBackupEncryption", "Protection PIN is empty!", null, 4, null);
            } else {
                str = C26245a.m134942u(C26245a.f124654a, m132663y, 0, 2, null);
                bArr = m132663y;
                if (i11 == 3) {
                    byte[] m132664z = m132664z();
                    if (m132664z.length == 0) {
                        C26220b.m134826i("SMLBackupEncryption", "Protection PASSPHRASE is empty!", null, 4, null);
                    } else {
                        str = C26245a.m134942u(C26245a.f124654a, m132664z, 0, 2, null);
                        bArr = m132664z;
                    }
                }
                c25725b = new C25725b(i11, bArr, str);
                if (!c25725b.m132708e()) {
                    return c25725b;
                }
                throw new IllegalStateException("getDataProtectionCode(" + i11 + "): FAILED!");
            }
        }
        str = "";
        if (i11 == 3) {
        }
        c25725b = new C25725b(i11, bArr, str);
        if (!c25725b.m132708e()) {
        }
    }
}
