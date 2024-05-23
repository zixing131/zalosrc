package p320ld;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.core.app.AbstractC1364q;
import c50.C3297h;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.backuprestore.service.BackupRestoreService;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.zalocloud.home.ZCloudHomeView;
import com.zing.zalo.zinstant.zom.node.ZOM;
import dg0.AbstractC17930e;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gu.AbstractC19601a;
import ho0.AbstractC20110a;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import mg0.AbstractC23291c;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import p297kd.C21688c;
import p297kd.C21690e;
import p363nh.AbstractC23775p0;
import p363nh.C23750d;
import p479rc.C25727d;
import p586vt.AbstractC28618c;
import p586vt.AbstractC28626k;
import p586vt.AbstractC28627l;
import p586vt.InterfaceC28625j;
import sc.C26220b;
import si.C26263i;
import vg.C28023b6;

/* renamed from: ld.l */
/* loaded from: classes3.dex */
public final class C22440l implements InterfaceC28625j {

    /* renamed from: p */
    public static final C22440l f109789p = new C22440l();

    /* renamed from: q */
    private static PendingIntent f109790q;

    /* renamed from: r */
    private static PendingIntent f109791r;

    /* renamed from: s */
    private static PendingIntent f109792s;

    static {
        AbstractC23775p0.m124197b("db");
        AbstractC23775p0.m124197b("pc_request_sync");
    }

    private C22440l() {
    }

    /* renamed from: c */
    public static final C22440l m115973c() {
        return f109789p;
    }

    /* renamed from: d */
    private final PendingIntent m115974d() {
        if (f109791r == null) {
            Intent m119014P = AbstractC23152n3.m119014P(MainTabView.class, null, true);
            AbstractC19074t.m100207e(m119014P, "makeIntentShowZaloView(...)");
            f109791r = PendingIntent.getActivity(MainApplication.Companion.m35500c(), 0, m119014P, AbstractC19601a.Companion.m102574b(134217728));
        }
        return f109791r;
    }

    /* renamed from: e */
    private final PendingIntent m115975e() {
        if (f109790q == null) {
            f109790q = PendingIntent.getActivity(MainApplication.Companion.m35500c(), 0, C22438j.m115951s(null, false, 3, null), AbstractC19601a.Companion.m102574b(134217728));
        }
        return f109790q;
    }

    /* renamed from: f */
    private final PendingIntent m115976f() {
        if (f109792s == null) {
            Intent m119014P = AbstractC23152n3.m119014P(ZCloudHomeView.class, null, true);
            AbstractC19074t.m100207e(m119014P, "makeIntentShowZaloView(...)");
            f109792s = PendingIntent.getActivity(MainApplication.Companion.m35500c(), 0, m119014P, AbstractC19601a.Companion.m102574b(134217728));
        }
        return f109792s;
    }

    /* renamed from: g */
    private final void m115977g(C21688c.b bVar) {
        int i11 = bVar.f132722a;
        if (i11 > 0 && i11 <= 17 && BackupRestoreService.m37270a()) {
            switch (i11) {
                case 12:
                case 13:
                case 15:
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                case 17:
                    return;
                case 14:
                default:
                    int i12 = bVar.f105263d;
                    int m111856g = bVar.m111856g();
                    boolean m116072X = C22447s.f109797a.m116072X(m111856g);
                    C23750d c23750d = new C23750d(MainApplication.Companion.m35500c());
                    c23750d.m124165v0("db");
                    c23750d.m6866S(AbstractC16803z.ic_stat_notify_zalo);
                    if (m116072X) {
                        c23750d.m6893u(m115976f());
                    } else {
                        c23750d.m6893u(m115975e());
                    }
                    c23750d.mo6860M(true);
                    AbstractC28626k m143178a = bVar.m143178a();
                    if (m143178a != null) {
                        m111856g = C22447s.m115991A((C21690e) m143178a, m111856g);
                    }
                    if (m116072X) {
                        C19067n0 c19067n0 = C19067n0.f94947a;
                        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_change_pass_progressing);
                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{""}, 1));
                        AbstractC19074t.m100207e(format, "format(...)");
                        c23750d.mo6895w(format);
                    } else {
                        String m115989e = C22442n.m115989e(bVar.f132722a, m111856g, bVar.f105265f);
                        AbstractC20110a.f98889a.mo104548a("updateSyncStatus phase= " + i11 + ", phaseName=" + m115989e + ", syncProgress=" + i12, new Object[0]);
                        c23750d.mo6895w(m115989e);
                    }
                    if (m116072X) {
                        C25727d.c cVar = C25727d.Companion;
                        c23750d.mo6894v(((AbstractC23291c) cVar.m132783f().getValue()).mo120404a() + "%");
                        c23750d.m6863P(100, ((AbstractC23291c) cVar.m132783f().getValue()).mo120404a(), false);
                    } else {
                        if (i12 >= 0) {
                            c23750d.mo6894v(i12 + "%");
                        } else {
                            c23750d.mo6894v("");
                        }
                        c23750d.m6863P(100, i12, false);
                    }
                    C28023b6.m141256k2(c23750d);
                    c23750d.m124147b0();
                    C28023b6.m141262r2();
                    return;
            }
        }
        m115980b();
    }

    /* renamed from: h */
    private final void m115978h(C21688c.c cVar) {
        int i11 = cVar.f132722a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("showNotiForTransferProgress(): ");
        sb2.append(i11);
        int i12 = cVar.f132722a;
        if (i12 != 0) {
            if (i12 == 1 || i12 == 2 || i12 == 3 || i12 == 4) {
                C23750d c23750d = new C23750d(MainApplication.Companion.m35500c());
                c23750d.m124165v0("db");
                c23750d.m6866S(AbstractC16803z.ic_stat_notify_zalo);
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.transfer_message_in_progress);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                c23750d.m6869V(new AbstractC1364q.d().m6828h(m118743r0));
                c23750d.mo6894v(m118743r0);
                c23750d.mo6895w(AbstractC23136l9.m118743r0(AbstractC8020f0.transfer_message_title));
                c23750d.m6863P(100, 0, true);
                c23750d.m6893u(m115974d());
                C28023b6.m141256k2(c23750d);
                c23750d.m124147b0();
                C28023b6.m141262r2();
                return;
            }
            return;
        }
        final AbstractC28626k m143178a = cVar.m143178a();
        if (m143178a == null) {
            AbstractC23775p0.m124197b("db");
            C26263i.m135034d0("Handle notification of transfer message type none with job result null");
        } else {
            AbstractC17930e.Companion.m94551d().mo94531e(new Runnable() { // from class: ld.k
                @Override // java.lang.Runnable
                public final void run() {
                    C22440l.m115979i(AbstractC28626k.this);
                }
            }, TimeUnit.SECONDS.toMillis(1L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m115979i(AbstractC28626k abstractC28626k) {
        String m127114D;
        if (abstractC28626k.m143172f()) {
            MainApplication.C6895a c6895a = MainApplication.Companion;
            C23750d c23750d = new C23750d(c6895a.m35500c());
            c23750d.m124165v0("db");
            c23750d.m6866S(AbstractC16803z.ic_stat_notify_zalo);
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.transfer_message_success);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            c23750d.m6869V(new AbstractC1364q.d().m6828h(m118743r0));
            c23750d.mo6894v(m118743r0);
            c23750d.mo6895w(AbstractC23136l9.m118743r0(AbstractC8020f0.transfer_message_title));
            c23750d.m6863P(0, 0, false);
            Intent m119014P = AbstractC23152n3.m119014P(MainTabView.class, null, true);
            AbstractC19074t.m100207e(m119014P, "makeIntentShowZaloView(...)");
            c23750d.m6893u(PendingIntent.getActivity(c6895a.m35500c(), 0, m119014P, AbstractC19601a.Companion.m102574b(134217728)));
            C28023b6.m141256k2(c23750d);
            c23750d.m124147b0();
            C28023b6.m141262r2();
            return;
        }
        MainApplication.C6895a c6895a2 = MainApplication.Companion;
        C23750d c23750d2 = new C23750d(c6895a2.m35500c());
        c23750d2.m124165v0("db");
        c23750d2.m6866S(AbstractC16803z.ic_stat_notify_zalo);
        if (abstractC28626k.m143169b() != null) {
            AbstractC28618c m143169b = abstractC28626k.m143169b();
            AbstractC19074t.m100205c(m143169b);
            if (m143169b.mo97004e()) {
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.transfer_message_error_network);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                m127114D = AbstractC24341v.m127114D(m118743r02, "#x#", " ", false, 4, null);
                c23750d2.m6869V(new AbstractC1364q.d().m6828h(m127114D));
                c23750d2.mo6894v(m127114D);
                c23750d2.mo6895w(AbstractC23136l9.m118743r0(AbstractC8020f0.transfer_message_title));
                c23750d2.m6863P(0, 0, false);
                Intent m119014P2 = AbstractC23152n3.m119014P(MainTabView.class, null, true);
                AbstractC19074t.m100207e(m119014P2, "makeIntentShowZaloView(...)");
                c23750d2.m6893u(PendingIntent.getActivity(c6895a2.m35500c(), 0, m119014P2, AbstractC19601a.Companion.m102574b(134217728)));
                C28023b6.m141256k2(c23750d2);
                c23750d2.m124147b0();
                C28023b6.m141262r2();
            }
        }
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.transfer_message_error);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        m127114D = AbstractC24341v.m127114D(m118743r03, "#x#", " ", false, 4, null);
        c23750d2.m6869V(new AbstractC1364q.d().m6828h(m127114D));
        c23750d2.mo6894v(m127114D);
        c23750d2.mo6895w(AbstractC23136l9.m118743r0(AbstractC8020f0.transfer_message_title));
        c23750d2.m6863P(0, 0, false);
        Intent m119014P22 = AbstractC23152n3.m119014P(MainTabView.class, null, true);
        AbstractC19074t.m100207e(m119014P22, "makeIntentShowZaloView(...)");
        c23750d2.m6893u(PendingIntent.getActivity(c6895a2.m35500c(), 0, m119014P22, AbstractC19601a.Companion.m102574b(134217728)));
        C28023b6.m141256k2(c23750d2);
        c23750d2.m124147b0();
        C28023b6.m141262r2();
    }

    /* renamed from: b */
    public final void m115980b() {
        f109790q = null;
        AbstractC23775p0.m124197b("db");
        AbstractC23775p0.m124197b("pc_request_sync");
    }

    /* renamed from: j */
    public final void m115981j(C21690e c21690e) {
        PendingIntent activity;
        boolean m127149O;
        boolean m127149O2;
        String m16738h;
        String m118743r0;
        AbstractC19074t.m100208f(c21690e, "syncSessionInfo");
        try {
            if (C22447s.m116054q0(false, 1, null) && !C22447s.f109797a.m116076s0()) {
                boolean m111900z = c21690e.m111900z();
                MainApplication.C6895a c6895a = MainApplication.Companion;
                C23750d c23750d = new C23750d(c6895a.m35500c());
                c23750d.m124165v0("db");
                c23750d.m6866S(AbstractC16803z.ic_stat_notify_zalo);
                if (m111900z) {
                    activity = m115976f();
                } else {
                    activity = PendingIntent.getActivity(c6895a.m35500c(), 0, C22438j.m115951s(null, false, 3, null), AbstractC19601a.Companion.m102574b(134217728));
                }
                c23750d.m6893u(activity);
                c23750d.m6863P(0, 0, false);
                if (m111900z) {
                    if (C25727d.Companion.m132787j()) {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_change_pass_success);
                    } else {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_change_pass_pause);
                    }
                    c23750d.mo6895w(m118743r0);
                } else {
                    c23750d.mo6895w(AbstractC23136l9.m118743r0(AbstractC8020f0.str_syncmes_sync_title));
                }
                int i11 = c21690e.f105269f;
                if (m111900z) {
                    if (C25727d.Companion.m132787j()) {
                        m16738h = "";
                    } else {
                        m16738h = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_tap_to_learn_more);
                        AbstractC19074t.m100205c(m16738h);
                    }
                } else if (c21690e.m143172f()) {
                    m16738h = C22442n.m115985a(c21690e);
                } else {
                    int m115997D = C22447s.m115997D(c21690e);
                    if (m115997D == 0) {
                        C26220b.m134826i("SMLSyncDBNoti", "syncCodeContent is UNKNOWN", null, 4, null);
                        return;
                    }
                    String m115988d = C22442n.m115988d(C22447s.m115993B(i11), m115997D, 2, C22447s.m115991A(c21690e, c21690e.f105269f), c21690e.m111869G());
                    m127149O = AbstractC24342w.m127149O(m115988d, "#x#", false, 2, null);
                    if (m127149O) {
                        m115988d = AbstractC24341v.m127114D(m115988d, "#x#", "", false, 4, null);
                    } else {
                        m127149O2 = AbstractC24342w.m127149O(m115988d, "#xx#", false, 2, null);
                        if (m127149O2) {
                            m115988d = AbstractC24341v.m127114D(m115988d, "#xx#", "", false, 4, null);
                        }
                    }
                    m16738h = C3297h.m16738h(m115988d, c21690e);
                }
                c23750d.mo6894v(m16738h);
                c23750d.m6869V(new AbstractC1364q.d().m6828h(m16738h));
                C28023b6.m141256k2(c23750d);
                c23750d.m124147b0();
                C28023b6.m141262r2();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // p586vt.InterfaceC28625j
    /* renamed from: lk */
    public void mo57172lk(AbstractC28627l abstractC28627l) {
        try {
            if (abstractC28627l instanceof C21688c.b) {
                m115977g((C21688c.b) abstractC28627l);
            } else if (abstractC28627l instanceof C21688c.c) {
                m115978h((C21688c.c) abstractC28627l);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
