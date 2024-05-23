package wg0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.content.AbstractC1388a;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.work.C2149h0;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.zalocloud.home.ZCloudHomeView;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zalocloud.configs.MigrationConfig;
import com.zing.zalo.zalocloud.onboarding.ZaloCloudOnboardingForegroundService;
import com.zing.zalocore.CoreUtility;
import dg0.AbstractC17927b;
import dh0.C17933b;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import gu.AbstractC19601a;
import hn0.AbstractC20104d;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import me0.AbstractC23088h5;
import me0.AbstractC23152n3;
import p297kd.C21688c;
import p348mi.AbstractC23306f;
import p363nh.AbstractC23775p0;
import p363nh.C23744a;
import p363nh.C23750d;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import si.C26263i;
import tg0.C26676b;
import ug0.C27259n;
import vm0.AbstractC28298d;
import wg0.AbstractC28981d;
import wg0.C28989l;
import wm0.AbstractC29104l;

/* renamed from: wg0.k */
/* loaded from: classes7.dex */
public final class C28988k extends AbstractC28996s {

    /* renamed from: p */
    public static final C28988k f134117p = new C28988k();

    /* renamed from: q */
    private static final Set f134118q = Collections.synchronizedSet(new HashSet());

    /* renamed from: r */
    private static AbstractC28981d f134119r;

    /* renamed from: wg0.k$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final a f134120q = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m144722a(C2149h0 c2149h0) {
            String str;
            if (c2149h0 != null) {
                str = c2149h0.toString();
            } else {
                str = null;
            }
            C26676b.m136957g("SMLZCloudOnboardingForegroundUpdater", "onWorkerStateChanged(): workInfo=" + str, null, 4, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m144722a((C2149h0) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: wg0.k$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final b f134121q = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m144723a(C2149h0 c2149h0) {
            C28988k.f134117p.m144721u();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m144723a((C2149h0) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: wg0.k$c */
    /* loaded from: classes7.dex */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f134122a;

        static {
            int[] iArr = new int[EnumC28993p.values().length];
            try {
                iArr[EnumC28993p.f134266p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC28993p.f134267q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC28993p.f134268r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f134122a = iArr;
        }
    }

    /* renamed from: wg0.k$d */
    /* loaded from: classes7.dex */
    public static final class d implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f134123p;

        d(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f134123p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f134123p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f134123p.mo205i9(obj);
        }
    }

    /* renamed from: wg0.k$e */
    /* loaded from: classes7.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f134124t;

        e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            boolean z11;
            boolean z12;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f134124t;
            boolean z13 = true;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                this.f134124t = 1;
                if (DelayKt.m112666b(200L, this) == m142578e) {
                    return m142578e;
                }
            }
            String str = CoreUtility.f89233i;
            if (str != null && str.length() != 0) {
                List m139507e = C27259n.f128166a.m139507e();
                if (!(m139507e instanceof Collection) || !m139507e.isEmpty()) {
                    Iterator it = m139507e.iterator();
                    while (it.hasNext()) {
                        if (((C2149h0.c) it.next()) == C2149h0.c.RUNNING) {
                            z11 = true;
                            break;
                        }
                    }
                }
                z11 = false;
                C26263i m135055u = C26263i.m135055u();
                if (!m135055u.m135069I() && (m135055u.m135068G(18) || m135055u.m135068G(19))) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z11 && !z12) {
                    z13 = false;
                }
                C28989l.a aVar = C28989l.Companion;
                AbstractC19074t.m100205c(str);
                AbstractC28981d m144764q = aVar.m144770b(str).m144764q();
                C26676b.m136960j("SMLZCloudOnboardingForegroundUpdater", "isRunning=" + z13 + ", jobState=" + m144764q);
                if (z13 && (m144764q instanceof AbstractC28981d.b)) {
                    C28988k c28988k = C28988k.f134117p;
                    c28988k.m144717i();
                    Notification mo6879e = c28988k.m144708h(m144764q).mo6879e();
                    AbstractC19074t.m100207e(mo6879e, "build(...)");
                    c28988k.m144716s(mo6879e);
                    return C24848g0.f119245a;
                }
                C26676b.m136960j("SMLZCloudOnboardingForegroundUpdater", "Nothing is running, stop foreground");
                C28988k c28988k2 = C28988k.f134117p;
                c28988k2.m144720t();
                c28988k2.m144718p(m144764q);
                c28988k2.m144719q(m144764q);
                return C24848g0.f119245a;
            }
            C26676b.m136962l("SMLZCloudOnboardingForegroundUpdater", "Logging out, stop foreground");
            C28988k.f134117p.m144720t();
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    static {
        AbstractC17927b.Companion.m94536b().mo94528b(new Runnable() { // from class: wg0.j
            @Override // java.lang.Runnable
            public final void run() {
                C28988k.m144705e();
            }
        });
    }

    private C28988k() {
    }

    /* renamed from: e */
    public static final void m144705e() {
        C27259n c27259n = C27259n.f128166a;
        c27259n.m139510i("cloud_media_migration").m9220k(new d(a.f134120q));
        c27259n.m139508f().m9220k(new d(b.f134121q));
    }

    /* renamed from: h */
    public final C23750d m144708h(AbstractC28981d abstractC28981d) {
        String string;
        String string2;
        String str;
        int m104529e;
        String str2;
        Context m35500c = MainApplication.Companion.m35500c();
        boolean z11 = abstractC28981d instanceof AbstractC28981d.b;
        if (abstractC28981d instanceof AbstractC28981d.e) {
            string = m35500c.getString(AbstractC8020f0.str_zcloud_migration_success_title);
            AbstractC19074t.m100207e(string, "getString(...)");
            string2 = m35500c.getString(AbstractC8020f0.str_zcloud_migration_success_notif_subtitle);
            AbstractC19074t.m100207e(string2, "getString(...)");
        } else if (z11) {
            string = m35500c.getString(AbstractC8020f0.str_zcloud_migration_progressing_notif);
            AbstractC19074t.m100207e(string, "getString(...)");
            string2 = "";
        } else if (abstractC28981d instanceof AbstractC28981d.a) {
            string = m35500c.getString(AbstractC8020f0.str_zcloud_migration_pause, C16805b.Companion.m89811a().m89800f());
            AbstractC19074t.m100207e(string, "getString(...)");
            int i11 = c.f134122a[((AbstractC28981d.a) abstractC28981d).m144699f().ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        string2 = m35500c.getString(AbstractC8020f0.str_zcloud_migration_tap_to_learn_more);
                        AbstractC19074t.m100207e(string2, "getString(...)");
                    } else {
                        string2 = m35500c.getString(AbstractC8020f0.str_zcloud_migration_drive_error_notif_subtitle);
                        AbstractC19074t.m100207e(string2, "getString(...)");
                    }
                } else {
                    string2 = m35500c.getString(AbstractC8020f0.str_zcloud_migration_network_error);
                    AbstractC19074t.m100207e(string2, "getString(...)");
                }
            } else {
                string2 = m35500c.getString(AbstractC8020f0.str_zcloud_migration_battery_error);
                AbstractC19074t.m100207e(string2, "getString(...)");
            }
        } else {
            string = m35500c.getString(AbstractC8020f0.str_zcloud_migration_pause, C16805b.Companion.m89811a().m89800f());
            AbstractC19074t.m100207e(string, "getString(...)");
            string2 = m35500c.getString(AbstractC8020f0.str_zcloud_migration_tap_to_learn_more);
            AbstractC19074t.m100207e(string2, "getString(...)");
        }
        Intent m119012O = AbstractC23152n3.m119012O(ZCloudHomeView.class, new Bundle());
        AbstractC19074t.m100207e(m119012O, "makeIntentShowZaloView(...)");
        PendingIntent activity = PendingIntent.getActivity(m35500c, 0, m119012O, AbstractC19601a.Companion.m102573a(134217728));
        C23750d c23750d = new C23750d(m35500c);
        if (z11) {
            str = "db";
        } else {
            str = "zalo_cloud_onboarding_job";
        }
        c23750d.m124165v0(str);
        c23750d.m6893u(activity);
        c23750d.mo6895w(string);
        c23750d.mo6894v(string2);
        c23750d.mo6860M(z11);
        if (z11) {
            m104529e = AbstractC20104d.m104529e(abstractC28981d.m144695b() * 100);
            c23750d.m6863P(100, m104529e, false);
            if (string2.length() == 0) {
                str2 = m104529e + "%";
            } else {
                str2 = string2 + "... " + m104529e + "%";
            }
            c23750d.mo6894v(str2);
        }
        c23750d.m6870W(m35500c.getString(AbstractC8020f0.app_name));
        c23750d.m6888p("progress");
        c23750d.m6866S(AbstractC16803z.ic_stat_notify_zalo);
        c23750d.m6875a0(System.currentTimeMillis());
        return c23750d;
    }

    /* renamed from: j */
    private final Intent m144709j(Context context, Notification notification) {
        Intent intent = new Intent(context, (Class<?>) ZaloCloudOnboardingForegroundService.class);
        intent.setAction("com.zing.zalo.zcloud.intent.action.ACTION_NOTIFY_FOREGROUND");
        intent.putExtra("KEY_NOTIFICATION_ID", f134117p.m144714o());
        intent.putExtra("KEY_NOTIFICATION", notification);
        return intent;
    }

    /* renamed from: k */
    private final Intent m144710k(Context context, Notification notification) {
        Intent intent = new Intent(context, (Class<?>) ZaloCloudOnboardingForegroundService.class);
        intent.setAction("com.zing.zalo.zcloud.intent.action.ACTION_START_FOREGROUND");
        intent.putExtra("KEY_NOTIFICATION_ID", f134117p.m144714o());
        intent.putExtra("KEY_NOTIFICATION", notification);
        return intent;
    }

    /* renamed from: l */
    private final Intent m144711l(Context context) {
        Intent intent = new Intent(context, (Class<?>) ZaloCloudOnboardingForegroundService.class);
        intent.setAction("com.zing.zalo.zcloud.intent.action.ACTION_STOP_FOREGROUND");
        return intent;
    }

    /* renamed from: m */
    private final Context m144712m() {
        return MainApplication.Companion.m35500c();
    }

    /* renamed from: n */
    private final MigrationConfig m144713n() {
        return AbstractC23306f.m120633X1().m89801i();
    }

    /* renamed from: o */
    private final int m144714o() {
        return AbstractC23088h5.m118423d("zalo_cloud_onboarding_job", "");
    }

    /* renamed from: r */
    private final void m144715r(int i11) {
        Set set = f134118q;
        if (set.contains(Integer.valueOf(i11))) {
            return;
        }
        C26676b.m136952b("SMLZCloudOnboardingForegroundUpdater", "postEvent(): id=" + i11);
        C23744a.Companion.m124119a().m124116d(i11, new Object[0]);
        set.add(Integer.valueOf(i11));
    }

    /* renamed from: s */
    public final void m144716s(Notification notification) {
        try {
            AbstractC1388a.m6975q(m144712m(), m144710k(m144712m(), notification));
            m144712m().startService(m144709j(m144712m(), notification));
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudOnboardingForegroundUpdater", e11);
        }
    }

    @Override // wg0.AbstractC28996s
    /* renamed from: a */
    public boolean mo144690a(C21688c.b bVar) {
        AbstractC19074t.m100208f(bVar, "message");
        int m111856g = bVar.m111856g();
        if (m111856g != 18 && m111856g != 19) {
            return false;
        }
        return true;
    }

    @Override // wg0.AbstractC28996s
    /* renamed from: b */
    public void mo144691b(AbstractC28997t abstractC28997t) {
        AbstractC19074t.m100208f(abstractC28997t, "state");
        m144721u();
    }

    /* renamed from: i */
    public final void m144717i() {
        AbstractC23775p0.m124197b("zalo_cloud_onboarding_job");
        f134118q.clear();
        f134119r = null;
    }

    /* renamed from: p */
    public final void m144718p(AbstractC28981d abstractC28981d) {
        AbstractC19074t.m100208f(abstractC28981d, "state");
        if (m144713n().m89768d() == 0 || AbstractC3489d.m17506n() || AbstractC19074t.m100204b(abstractC28981d, AbstractC28981d.f.f134110d) || (abstractC28981d instanceof AbstractC28981d.b) || !AbstractC28982e.m144700a(abstractC28981d, f134119r)) {
            return;
        }
        f134119r = abstractC28981d;
        m144708h(abstractC28981d).m124147b0();
    }

    /* renamed from: q */
    public final void m144719q(AbstractC28981d abstractC28981d) {
        AbstractC19074t.m100208f(abstractC28981d, "state");
        if (abstractC28981d instanceof AbstractC28981d.e) {
            if (abstractC28981d.m144696c() == -1 || abstractC28981d.m144696c() == 3) {
                m144715r(150808);
            }
        }
    }

    /* renamed from: t */
    public final void m144720t() {
        try {
            m144712m().startService(m144711l(m144712m()));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: u */
    public final void m144721u() {
        BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), null, null, new e(null), 3, null);
    }
}
