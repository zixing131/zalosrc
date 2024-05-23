package tt;

import am.AbstractC0924m0;
import b40.C2544s;
import ch0.AbstractC3489d;
import com.zing.zalo.MainApplication;
import com.zing.zalo.nativecommon.NetworkHelper;
import com.zing.zalo.service.TaskNonStickyExecutor;
import com.zing.zalocore.CoreUtility;
import d60.C17793b;
import fh0.AbstractC18942g;
import ho0.AbstractC20110a;
import nh0.C23793c;
import p173fz.C19172a;
import p263jc.C21216s;
import p348mi.AbstractC23306f;
import p399op.C24390b;
import p405ov.C24561c;
import p509sp.C26356e;
import p616wo.C29116a;
import p645xh.C29628e;
import r30.AbstractC25636f;
import tg0.C26676b;
import ug0.C27255j;

/* renamed from: tt.b */
/* loaded from: classes.dex */
public final class C26895b {
    /* renamed from: b */
    private final void m138605b() {
        try {
            if (!AbstractC3489d.m17501i()) {
                return;
            }
            C27255j.m139459c(C27255j.f128107a, 0L, 1, null);
        } catch (Exception e11) {
            C26676b.m136953c(e11);
        }
    }

    /* renamed from: c */
    private final void m138606c() {
        try {
            if (!AbstractC3489d.m17501i()) {
                return;
            }
            C27255j.m139460e(C27255j.f128107a, 0L, 1, null);
        } catch (Exception e11) {
            C26676b.m136953c(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m138607e() {
        try {
            if (!CoreUtility.f89239o && C19172a.m100600k("zalosdk@preload@wakeup@wakeup_on_enter_background", 1) == 1 && AbstractC0924m0.m3310Oc()) {
                AbstractC18942g.m99261q(MainApplication.Companion.m35500c());
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: g */
    private final void m138608g() {
        C29116a.f134962a.mo117211b(false);
        C26356e.f125201a.mo117211b(false);
        C24390b.f117764a.m127575f(false);
    }

    /* renamed from: h */
    private final void m138609h() {
        try {
            if (C29628e.m147250K0() && C29628e.m147249E0().m93434z()) {
                C29628e.m147249E0().m93399a0();
            }
            if (NetworkHelper.m48303l()) {
                NetworkHelper.m48302k().m48314n();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: d */
    public final void m138610d() {
        C24561c.m127942b("MainApplication", "ENTER BACKGROUND ──────────────────────────────");
        m138608g();
        CoreUtility.f89239o = false;
        CoreUtility.f89235k.set(true);
        MainApplication.Companion.m35506i(C23793c.Companion.m124321a().mo124319c());
        m138609h();
        AbstractC25636f.m132474d();
        AbstractC23306f.m120585H1().m16682H(2);
        C2544s.f10353a.m12809w();
        C17793b.Companion.m93939a().m93937r(false);
        m138605b();
        TaskNonStickyExecutor.m50450b().m50454e(new Runnable() { // from class: tt.a
            @Override // java.lang.Runnable
            public final void run() {
                C26895b.m138607e();
            }
        }, 15000L);
    }

    /* renamed from: f */
    public final void m138611f() {
        C24561c.m127942b("MainApplication", "ENTER FOREGROUND ──────────────────────────────");
        CoreUtility.f89239o = true;
        CoreUtility.f89235k.set(false);
        m138609h();
        ((C21216s) C21216s.Companion.m122672a()).m109858L();
        AbstractC23306f.m120585H1().m16682H(1);
        m138606c();
    }
}
