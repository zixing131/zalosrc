package p387oc;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import bg0.C2797c;
import ch0.AbstractC3489d;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import dg0.AbstractC17930e;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.concurrent.TimeUnit;
import me0.AbstractC23057e7;
import me0.AbstractC23138m0;
import me0.C23055e5;
import nh0.C23793c;
import nh0.InterfaceC23792b;
import p297kd.C21689d;
import p297kd.C21690e;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p421pc.C24720a;
import p484ri.C25804a;
import p484ri.C25806c;
import p605wc.RunnableC28909a;
import p645xh.C29628e;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import sc.C26220b;
import si.C26263i;
import si.C26268n;

/* renamed from: oc.c */
/* loaded from: classes3.dex */
public final class C24199c {
    public static final b Companion = new b(null);

    /* renamed from: h */
    private static final InterfaceC24854k f116802h;

    /* renamed from: a */
    private final C25806c f116803a;

    /* renamed from: b */
    private final C25804a f116804b;

    /* renamed from: c */
    private final C26268n f116805c;

    /* renamed from: d */
    private final C24720a f116806d;

    /* renamed from: e */
    private final InterfaceC23792b f116807e;

    /* renamed from: f */
    private final C2797c f116808f;

    /* renamed from: g */
    private long f116809g;

    /* renamed from: oc.c$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f116810q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24199c mo12V4() {
            return c.f116811a.m126163a();
        }
    }

    /* renamed from: oc.c$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C24199c m126162a() {
            return (C24199c) C24199c.f116802h.getValue();
        }
    }

    /* renamed from: oc.c$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f116811a = new c();

        /* renamed from: b */
        private static final C24199c f116812b;

        static {
            C25806c m120692n = AbstractC23306f.m120692n();
            AbstractC19074t.m100207e(m120692n, "provideBackupRestoreRepo(...)");
            C25804a m120688m = AbstractC23306f.m120688m();
            AbstractC19074t.m100207e(m120688m, "provideBackupRestoreMediaRepo(...)");
            C26268n m120680k = AbstractC23306f.m120680k();
            AbstractC19074t.m100207e(m120680k, "provideBackupRestoreDB(...)");
            C24720a m120676j = AbstractC23306f.m120676j();
            AbstractC19074t.m100207e(m120676j, "provideBackupRestoreConfigs(...)");
            InterfaceC23792b m120579F1 = AbstractC23306f.m120579F1();
            AbstractC19074t.m100207e(m120579F1, "provideTimeProvider(...)");
            f116812b = new C24199c(m120692n, m120688m, m120680k, m120676j, m120579F1);
        }

        private c() {
        }

        /* renamed from: a */
        public final C24199c m126163a() {
            return f116812b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f116810q);
        f116802h = m129210a;
    }

    public C24199c(C25806c c25806c, C25804a c25804a, C26268n c26268n, C24720a c24720a, InterfaceC23792b interfaceC23792b) {
        AbstractC19074t.m100208f(c25806c, "backupRestoreRepo");
        AbstractC19074t.m100208f(c25804a, "backupRestoreMediaRepo");
        AbstractC19074t.m100208f(c26268n, "backupRestoreDB");
        AbstractC19074t.m100208f(c24720a, "backupRestoreConfigs");
        AbstractC19074t.m100208f(interfaceC23792b, "timeProvider");
        this.f116803a = c25806c;
        this.f116804b = c25804a;
        this.f116805c = c26268n;
        this.f116806d = c24720a;
        this.f116807e = interfaceC23792b;
        this.f116808f = new C2797c(AbstractC0837p0.Companion.m2237f());
    }

    /* renamed from: f */
    public static final void m126148f() {
        try {
            C26263i.m135055u().m135085r0(1);
        } catch (Exception e11) {
            C26220b.m134821d("SMLBackupRestoreManager", e11);
        }
    }

    /* renamed from: h */
    public static final void m126149h(C24199c c24199c) {
        int i11;
        AbstractC19074t.m100208f(c24199c, "this$0");
        try {
            C21690e m133053o = c24199c.f116803a.m133053o();
            if (m133053o != null && m133053o.m111867E() && !m133053o.mo96995c() && C26263i.m135055u().m135073O()) {
                C21689d m111895u = m133053o.m111895u();
                if (m111895u != null) {
                    i11 = m111895u.m143140a();
                } else {
                    i11 = ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP;
                }
                if (i11 == 2004 || i11 == 2006) {
                    C26263i.m135055u().m135086s0(AbstractC23309i.m120897Ec(), true);
                }
            }
        } catch (Exception e11) {
            C26220b.m134821d("SMLBackupRestoreManager", e11);
        }
    }

    /* renamed from: k */
    public static final C24199c m126150k() {
        return Companion.m126162a();
    }

    /* renamed from: m */
    private final boolean m126151m() {
        if (!this.f116806d.m128392I()) {
            m126152o(-21, "User OFF feature");
            return false;
        }
        if (!C23055e5.m118273h(false, 1, null)) {
            m126152o(-22, "Network not available");
            return false;
        }
        if (AbstractC23309i.m121678Zg() && !C23055e5.m118270e()) {
            m126152o(-23, "Not connected to Wifi");
            return false;
        }
        if (!this.f116806d.m128404U()) {
            m126152o(-24, "Server OFF config Auto Backup");
            return false;
        }
        long mo124314i = this.f116807e.mo124314i() - this.f116803a.m133054p();
        long m128410e = this.f116806d.m128410e();
        if (mo124314i < m128410e) {
            m126152o(-25, "Not reach auto-backup time interval: timeOffset=" + mo124314i + ", interval=" + m128410e);
            return false;
        }
        long m133048h = this.f116803a.m133048h();
        if (this.f116807e.mo124314i() <= m133048h) {
            m126152o(-26, "Not reach Backup Division pending time: pendingTime=" + m133048h);
            return false;
        }
        int m118294a = AbstractC23057e7.m118294a();
        if (m118294a < 20) {
            m126152o(-27, "Device is low battery: batteryLevel=" + m118294a);
            return false;
        }
        if (!m126159l()) {
            m126152o(-28, "User doesn't restore backup yet!");
        }
        return true;
    }

    /* renamed from: o */
    private final void m126152o(int i11, String str) {
        C26220b.m134827j("Skipped! (" + i11 + ") " + str, null, 2, null);
    }

    /* renamed from: p */
    private final boolean m126153p() {
        long mo124314i = this.f116807e.mo124314i();
        long m133048h = this.f116803a.m133048h();
        if (m133048h != -1 && mo124314i >= m133048h) {
            this.f116803a.m133029I(-1L);
            return true;
        }
        if (Math.abs(mo124314i - this.f116803a.m133055q()) >= 3600000) {
            this.f116803a.m133033M(this.f116807e.mo124314i());
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void m126154d(InterfaceC18494a interfaceC18494a) {
        TargetBackupInfo m135058w;
        AbstractC19074t.m100208f(interfaceC18494a, "onAccept");
        if (C24720a.Companion.m128432a().m128400Q() && (m135058w = C26263i.m135058w()) != null && m135058w.isValid() && C23793c.Companion.m124321a().mo124314i() - m135058w.m40950f() <= AbstractC0924m0.m3890i4()) {
            interfaceC18494a.mo12V4();
        }
    }

    /* renamed from: e */
    public final void m126155e() {
        if (!m126153p()) {
            return;
        }
        if (!this.f116806d.m128392I()) {
            C26220b.m134826i("SMLBackupRestoreManager", "Skip auto sync. User turn off", null, 4, null);
            C2797c c2797c = this.f116808f;
            RunnableC28909a m120571D = AbstractC23306f.m120571D();
            AbstractC19074t.m100207e(m120571D, "provideCheckValidGoogleAuthTask(...)");
            c2797c.mo13474a(m120571D);
            return;
        }
        C26220b.m134826i("SMLBackupRestoreManager", "checkTriggerAutoBackup()", null, 4, null);
        AbstractC17930e.Companion.m94551d().mo94531e(new Runnable() { // from class: oc.a
            @Override // java.lang.Runnable
            public final void run() {
                C24199c.m126148f();
            }
        }, TimeUnit.SECONDS.toMillis(30L));
    }

    /* renamed from: g */
    public final void m126156g() {
        if (!C23055e5.m118270e() || Math.abs(this.f116807e.mo124314i() - this.f116809g) <= 60000) {
            return;
        }
        this.f116809g = this.f116807e.mo124314i();
        AbstractC17930e.Companion.m94551d().mo94531e(new Runnable() { // from class: oc.b
            public /* synthetic */ RunnableC24198b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C24199c.m126149h(C24199c.this);
            }
        }, TimeUnit.SECONDS.toMillis(3L));
    }

    /* renamed from: i */
    public final void m126157i() {
        C26220b.m134826i("SMLBackupRestoreManager", "clearAllMemCache()", null, 4, null);
    }

    /* renamed from: j */
    public final void m126158j() {
    }

    /* renamed from: l */
    public final boolean m126159l() {
        return !C22447s.m116047m0(C26263i.m135058w(), false, 2, null);
    }

    /* renamed from: n */
    public final boolean m126160n(int i11) {
        if (!AbstractC23138m0.Companion.m118777d()) {
            m126152o(-1, "User logged out");
            return false;
        }
        if (!AbstractC23306f.m120676j().m128396M()) {
            m126152o(-2, "Server OFF config");
            return false;
        }
        if (i11 == 1 && !m126151m()) {
            return false;
        }
        if (C29628e.m147249E0().m147261M0()) {
            m126152o(-3, "Socket locked");
            return false;
        }
        if (AbstractC23309i.m122243oe()) {
            m126152o(-4, "Waiting for login success");
            return false;
        }
        if (AbstractC0924m0.m4373yc()) {
            m126152o(-5, "Sync interrupt flag still on");
            return false;
        }
        if (!AbstractC3489d.m17515w()) {
            return true;
        }
        m126152o(-6, "Paid User opt-out backup!");
        return false;
    }
}
