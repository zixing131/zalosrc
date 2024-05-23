package me0;

import ag0.AbstractC0837p0;
import ag0.AbstractC0852x;
import ag0.C0809c1;
import ag0.C0824j;
import am.AbstractC0939u;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.text.TextUtils;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.p077ui.MessagePopupActivity;
import com.zing.zalo.p077ui.MissCallActivity;
import com.zing.zalo.p077ui.RetryMsgPopupActivity;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalocore.CoreUtility;
import d60.C17799h;
import fn0.AbstractC19074t;
import gw.C19669z;
import ho0.AbstractC20110a;
import im0.AbstractC20626a;
import java.util.List;
import li.AbstractC22490a;
import p161fg.C18922m;
import p266jg.AbstractC21244b;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.C23665v;
import p361nb.C23669z;
import p420pb.C24709a;
import p645xh.C29628e;
import p681yh.C30981a;
import p716zh.C31948ha;
import p716zh.C31967j;
import pm0.C24848g0;
import rh0.C25795c;
import rh0.C25796d;
import rh0.C25798f;
import tg.C26664o;
import vg.C28023b6;
import zm.voip.p721ui.incall.GroupCallActivity;
import zm.voip.p721ui.incall.ZmInCallActivity;

/* renamed from: me0.p3 */
/* loaded from: classes.dex */
public abstract class AbstractC23174p3 {

    /* renamed from: me0.p3$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C23665v f112363a;

        /* renamed from: b */
        final /* synthetic */ boolean f112364b;

        a(C23665v c23665v, boolean z11) {
            this.f112363a = c23665v;
            this.f112364b = z11;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                MainApplication.C6895a c6895a = MainApplication.Companion;
                C24709a.m128299t(c6895a.m35500c()).m128303G(this.f112363a);
                if (this.f112364b) {
                    List list = AbstractC23304d.f113293K;
                    AbstractC19074t.m100207e(list, "timeOnAppInfoArr");
                    synchronized (list) {
                        AbstractC23304d.f113293K = C24709a.m128299t(c6895a.m35500c()).m128313o(50L);
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: me0.p3$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C23669z f112365a;

        b(C23669z c23669z) {
            this.f112365a = c23669z;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MainApplication.Companion.m35500c()).m128305K(this.f112365a);
        }
    }

    /* renamed from: b */
    public static final boolean m119377b() {
        long currentTimeMillis;
        StringBuilder sb2;
        MainApplication.C6895a c6895a;
        Object systemService;
        long currentTimeMillis2;
        StringBuilder sb3;
        ComponentName componentName;
        long currentTimeMillis3 = System.currentTimeMillis();
        try {
            try {
                c6895a = MainApplication.Companion;
                systemService = c6895a.m35500c().getSystemService("activity");
                AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            } catch (Exception e11) {
                e11.printStackTrace();
                String str = AbstractC23059e9.f112067a;
                currentTimeMillis = System.currentTimeMillis() - currentTimeMillis3;
                sb2 = new StringBuilder();
            }
            try {
                List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) systemService).getRunningTasks(1);
                List<ActivityManager.RunningTaskInfo> list = runningTasks;
                if (list != null && !list.isEmpty()) {
                    ActivityManager.RunningTaskInfo runningTaskInfo = runningTasks.get(0);
                    if (runningTaskInfo != null) {
                        componentName = runningTaskInfo.topActivity;
                    } else {
                        componentName = null;
                    }
                    if (componentName != null) {
                        try {
                            if (!AbstractC19074t.m100204b(componentName.getPackageName(), c6895a.m35500c().getPackageName())) {
                                return true;
                            }
                        } catch (Exception unused) {
                            String str2 = AbstractC23059e9.f112067a;
                            currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis3;
                            sb3 = new StringBuilder();
                            sb3.append("top app TimeEXE: ");
                            sb3.append(currentTimeMillis2);
                            return false;
                        }
                    }
                }
                String str3 = AbstractC23059e9.f112067a;
                currentTimeMillis = System.currentTimeMillis() - currentTimeMillis3;
                sb2 = new StringBuilder();
                sb2.append("top app TimeEXE: ");
                sb2.append(currentTimeMillis);
                return false;
            } catch (Exception unused2) {
                String str4 = AbstractC23059e9.f112067a;
                currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis3;
                sb3 = new StringBuilder();
            }
        } finally {
            String str5 = AbstractC23059e9.f112067a;
            long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("top app TimeEXE: ");
            sb4.append(currentTimeMillis4);
        }
    }

    /* renamed from: c */
    public static final synchronized boolean m119378c() {
        ComponentName componentName;
        synchronized (AbstractC23174p3.class) {
            MainApplication.C6895a c6895a = MainApplication.Companion;
            Object systemService = c6895a.m35500c().getSystemService("activity");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            try {
                List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) systemService).getRunningTasks(1);
                List<ActivityManager.RunningTaskInfo> list = runningTasks;
                if (list != null && !list.isEmpty()) {
                    ActivityManager.RunningTaskInfo runningTaskInfo = runningTasks.get(0);
                    if (runningTaskInfo != null) {
                        componentName = runningTaskInfo.topActivity;
                    } else {
                        componentName = null;
                    }
                    if (componentName != null) {
                        try {
                            if (!AbstractC19074t.m100204b(componentName.getPackageName(), c6895a.m35500c().getPackageName())) {
                                return true;
                            }
                        } catch (Exception unused) {
                            return false;
                        }
                    }
                }
                return false;
            } catch (Exception unused2) {
                return false;
            }
        }
    }

    /* renamed from: d */
    public static final boolean m119379d(String str) {
        MainApplication.C6895a c6895a;
        ActivityManager activityManager;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        try {
            c6895a = MainApplication.Companion;
            Object systemService = c6895a.m35500c().getSystemService("activity");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            activityManager = (ActivityManager) systemService;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
            List<ActivityManager.RunningTaskInfo> list = runningTasks;
            if (list != null && !list.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null) {
                componentName = runningTaskInfo.topActivity;
                if (componentName != null) {
                    try {
                        if (AbstractC19074t.m100204b(componentName.getPackageName(), c6895a.m35500c().getPackageName()) && AbstractC19074t.m100204b(componentName.getClassName(), str)) {
                            return true;
                        }
                    } catch (Exception unused) {
                        return false;
                    }
                }
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses != null && (!runningAppProcesses.isEmpty())) {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = runningAppProcesses.get(0);
                    if (AbstractC19074t.m100204b(runningAppProcessInfo.processName, c6895a.m35500c().getPackageName())) {
                        if (runningAppProcessInfo.importance != 100) {
                        }
                    }
                    return true;
                }
            }
            return false;
        } catch (Exception unused2) {
            return false;
        }
    }

    /* renamed from: e */
    public static final synchronized String m119380e() {
        ComponentName componentName;
        synchronized (AbstractC23174p3.class) {
            MainApplication.C6895a c6895a = MainApplication.Companion;
            Object systemService = c6895a.m35500c().getSystemService("activity");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            try {
                List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) systemService).getRunningTasks(1);
                List<ActivityManager.RunningTaskInfo> list = runningTasks;
                if (list != null && !list.isEmpty()) {
                    ActivityManager.RunningTaskInfo runningTaskInfo = runningTasks.get(0);
                    if (runningTaskInfo != null) {
                        componentName = runningTaskInfo.topActivity;
                    } else {
                        componentName = null;
                    }
                    if (componentName != null) {
                        try {
                            String packageName = componentName.getPackageName();
                            AbstractC19074t.m100207e(packageName, "getPackageName(...)");
                            String className = componentName.getClassName();
                            AbstractC19074t.m100207e(className, "getClassName(...)");
                            if (AbstractC19074t.m100204b(packageName, c6895a.m35500c().getPackageName())) {
                                return className;
                            }
                        } catch (Exception unused) {
                            return "";
                        }
                    }
                }
                return "";
            } catch (Exception unused2) {
                return "";
            }
        }
    }

    /* renamed from: f */
    private static final void m119381f(Activity activity, long j11) {
        long j12 = AbstractC23304d.f113318Q0;
        if (j12 == 0 || j12 == -1) {
            AbstractC23304d.f113318Q0 = System.currentTimeMillis();
        }
        AbstractC23304d.f113322R0 = j11;
        AbstractC20110a.f98889a.mo104548a("START track time to use app " + j11, new Object[0]);
        if (!(activity instanceof ZaloLauncherActivity)) {
            AbstractC23304d.f113408l2 = false;
        }
        AbstractC23304d.f113330T0 = false;
        C30981a.f142933e = 0L;
        AbstractC22490a.m116283f("app_stopped", String.valueOf(AbstractC23304d.f113330T0));
        C17799h.m94029a().f90038m = 4;
        C18922m.m99141t().m99147Q(false);
        C18922m.m99141t().m99143L();
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: me0.o3
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC23174p3.m119382g();
            }
        });
    }

    /* renamed from: g */
    public static final void m119382g() {
        AbstractC21244b.m110056f();
        C28023b6.m141250h0().m141306P();
        if (AbstractC23309i.m121086Jg()) {
            AbstractC23309i.m122335qw(false);
            AbstractC23309i.m122626yr(0L);
            AbstractC0852x.m2338O(new SensitiveData("phonebook_auto_scan_on_startup", "phonebook_auto_scan", null, 4, null));
        }
        if (AbstractC23309i.m121049Ig()) {
            AbstractC23309i.m122298pw(false);
            AbstractC23059e9.m118320I();
        }
    }

    /* renamed from: h */
    public static final void m119383h(int i11, Activity activity, long j11) {
        if (activity != null) {
            try {
                if (i11 != 2) {
                    if (i11 == 5) {
                        m119384i(activity, j11);
                    }
                } else {
                    m119381f(activity, j11);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x010f, code lost:            r0 = -1;     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m119384i(Activity activity, long j11) {
        boolean z11;
        int i11;
        boolean z12;
        C25796d m132952b;
        AbstractC23304d.f113326S0 = j11;
        String canonicalName = activity.getClass().getCanonicalName();
        if (!m119378c() && !m119379d(canonicalName)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            C26664o.m136836a().m136844i("");
            if ((activity instanceof ZaloLauncherActivity) && (((ZaloLauncherActivity) activity).mo35579p().m93012K0() instanceof MainTabView)) {
                AbstractC23304d.f113408l2 = true;
            }
            if (C31948ha.m153587d().m153595i() || C31948ha.m153587d().m153596j()) {
                C31948ha.m153587d().m153602p();
            }
            if (C31967j.m153687a().m153690d(0) || C31967j.m153687a().m153689c(0) || C31967j.m153687a().m153690d(1) || C31967j.m153687a().m153689c(1) || C31967j.m153687a().m153690d(2) || C31967j.m153687a().m153689c(2)) {
                C31967j.m153687a().m153695i();
            }
        }
        if (AbstractC23304d.f113322R0 == AbstractC23304d.f113326S0 && z11) {
            AbstractC23304d.f113330T0 = true;
            AbstractC22490a.m116283f("app_stopped", String.valueOf(AbstractC23304d.f113330T0));
            C30981a.f142933e = 0L;
            C17799h.m94029a().f90038m = 5;
            C18922m.m99141t().m99147Q(true);
            if (AbstractC23304d.f113318Q0 > 0 && !TextUtils.isEmpty(CoreUtility.f89233i)) {
                try {
                    m132952b = C25798f.m132949c().m132952b();
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    i11 = -1;
                }
                if (m132952b != null) {
                    i11 = m132952b.m132943f();
                } else if (activity instanceof MessagePopupActivity) {
                    i11 = 6;
                } else if (activity instanceof MissCallActivity) {
                    i11 = 8;
                } else if (activity instanceof RetryMsgPopupActivity) {
                    i11 = 9;
                } else if (activity instanceof ZmInCallActivity) {
                    i11 = 10;
                } else {
                    if (activity instanceof GroupCallActivity) {
                        i11 = 14;
                    }
                    i11 = -1;
                }
                long currentTimeMillis = System.currentTimeMillis() - AbstractC23304d.f113318Q0;
                AbstractC23304d.f113318Q0 = -1L;
                if (currentTimeMillis > 1000) {
                    int m107387c = AbstractC20626a.m107387c();
                    boolean m93432x = C29628e.m147249E0().m93432x();
                    C23665v c23665v = new C23665v(0, currentTimeMillis, m107387c, m93432x ? 1 : 0, i11, C25795c.f122999c, System.currentTimeMillis());
                    AbstractC20110a.f98889a.mo104548a("TimeOnAppInfo: " + c23665v + " - actId: " + j11 + " - name: " + canonicalName, new Object[0]);
                    if (AbstractC23309i.m122562x0() == 1) {
                        List list = AbstractC23304d.f113293K;
                        AbstractC19074t.m100207e(list, "timeOnAppInfoArr");
                        synchronized (list) {
                            try {
                                if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
                                    AbstractC23304d.f113293K.add(c23665v);
                                }
                                if (AbstractC23304d.f113293K.size() >= 50) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                C24848g0 c24848g0 = C24848g0.f119245a;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        C0824j.m2153b(new a(c23665v, z12));
                    }
                    if (AbstractC23309i.m120962G3(2) == 1) {
                        C23665v c23665v2 = new C23665v(1, currentTimeMillis, m107387c, m93432x ? 1 : 0, i11, C25795c.f122999c, System.currentTimeMillis());
                        c23665v2.f114654a = 2;
                        c23665v2.f114655b = 1;
                        C0809c1.m2050b(new b(c23665v2));
                    }
                }
            }
            if ((!C19669z.f97579a0.isEmpty()) && !AbstractC23304d.f113379e1) {
                AbstractC23059e9.m118321J();
            } else {
                AbstractC23304d.f113379e1 = false;
            }
            AbstractC20110a.f98889a.mo104548a("END track time to use app " + j11 + " background", new Object[0]);
            return;
        }
        AbstractC20110a.f98889a.mo104548a("END track time to use app " + j11 + " foreground", new Object[0]);
    }
}
