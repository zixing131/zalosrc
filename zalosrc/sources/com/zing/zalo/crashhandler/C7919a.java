package com.zing.zalo.crashhandler;

import ac.C0708i;
import ac.C0711j0;
import ac.C0722p;
import ac.C0732w;
import ag0.AbstractC0837p0;
import android.os.Looper;
import android.os.Process;
import com.zing.zalo.MainApplication;
import com.zing.zalo.crashhandler.C7919a;
import ho0.AbstractC20110a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import ki.C21732d;
import ki.EnumC21730b;
import li.AbstractC22490a;
import me0.AbstractC23193r0;
import mm0.AbstractC23350e;
import p248iy.AbstractC20887g;
import p248iy.C20882b;
import p361nb.AbstractC23647d;
import p371nv.C23952g;

/* renamed from: com.zing.zalo.crashhandler.a */
/* loaded from: classes.dex */
public class C7919a implements Thread.UncaughtExceptionHandler {

    /* renamed from: f */
    public static final String f42840f = "a";

    /* renamed from: g */
    private static C7919a f42841g;

    /* renamed from: h */
    private static long f42842h;

    /* renamed from: a */
    private EnumC21730b f42843a;

    /* renamed from: b */
    private Integer f42844b = null;

    /* renamed from: c */
    Thread f42845c;

    /* renamed from: d */
    Throwable f42846d;

    /* renamed from: e */
    private final Thread.UncaughtExceptionHandler f42847e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7919a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f42847e = uncaughtExceptionHandler;
        f42841g = this;
    }

    /* renamed from: d */
    private String m40923d(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        while (th2 != null) {
            th2.printStackTrace(printWriter);
            th2 = th2.getCause();
        }
        String obj = stringWriter.toString();
        printWriter.close();
        return obj;
    }

    /* renamed from: g */
    private void m40924g(Throwable th2) {
        m40930e(th2, EnumC21730b.f105515p, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m40925h() {
        try {
            Looper.prepare();
            C21732d.m112156a(MainApplication.getAppContext(), m40932i(), 1);
            Looper.loop();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: l */
    public static void m40926l(Throwable th2) {
        m40927m(th2, false);
    }

    /* renamed from: m */
    public static void m40927m(Throwable th2, boolean z11) {
        if (!z11) {
            try {
                if (Math.abs(System.currentTimeMillis() - f42842h) <= 300000) {
                    return;
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
                return;
            }
        }
        C7919a c7919a = f42841g;
        if (c7919a != null) {
            c7919a.m40924g(th2);
            f42842h = System.currentTimeMillis();
        }
    }

    /* renamed from: b */
    void m40928b() {
        if (this.f42843a == EnumC21730b.f105516q && this.f42844b.intValue() == 0) {
            AbstractC20110a.m104543l(f42840f).mo104559s("TOAST mode: you have to define the resToastText parameter first", new Object[0]);
        }
    }

    /* renamed from: c */
    void m40929c() {
        if (this.f42843a == EnumC21730b.f105515p) {
            if (this.f42847e != null) {
                this.f42847e.uncaughtException(this.f42845c, this.f42846d);
                return;
            }
            return;
        }
        AbstractC23350e.m122775e(f42840f, MainApplication.getAppContext().getPackageName() + " fatal error : " + this.f42846d.getMessage(), this.f42846d);
        if (MainApplication.f37852R) {
            AbstractC23193r0.m119507p();
        } else {
            Process.killProcess(Process.myPid());
            System.exit(0);
        }
    }

    /* renamed from: e */
    void m40930e(Throwable th2, EnumC21730b enumC21730b, boolean z11) {
        if (m40932i() != 0 && enumC21730b == EnumC21730b.f105516q) {
            AbstractC0837p0.m2227h().mo2040a(new Runnable() { // from class: ki.a
                @Override // java.lang.Runnable
                public final void run() {
                    C7919a.this.m40925h();
                }
            });
        } else {
            AbstractC22490a.m116282e(th2);
        }
        C20882b.m109134j();
        AbstractC23647d.m123902l();
        C23952g.m125341f(3000L);
        if (z11) {
            m40929c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a8, code lost:            if (r0.exists() == false) goto L10;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00aa, code lost:            r0.delete();     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b1, code lost:            if (r1.exists() == false) goto L13;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b3, code lost:            r1.delete();     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ba, code lost:            if (r2.exists() == false) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00bc, code lost:            r2.delete();     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0059, code lost:            ho0.AbstractC20110a.m104538g("workaround for Google Maps SDK is crashing - https://issuetracker.google.com/issues/154855417", new java.lang.Object[0]);        r0 = new java.io.File(com.zing.zalo.MainApplication.getAppContext().getFilesDir(), "ZoomTables.data");        r1 = new java.io.File(com.zing.zalo.MainApplication.getAppContext().getFilesDir(), "SavedClientParameters.data.cs");        r2 = new java.io.File(com.zing.zalo.MainApplication.getAppContext().getFilesDir(), "DATA_ServerControlledParametersManager.data.v1." + com.zing.zalo.MainApplication.getAppContext().getPackageName());     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m40931f(Thread thread, Throwable th2) {
        C0708i c0708i = new C0708i();
        c0708i.m1075f("info", m40923d(th2));
        C0732w.Companion.m1189a().m1187q("app_exception", "", c0708i, null);
        C0711j0.Companion.m1104a().m1094k(C0722p.a.CRASH);
        AbstractC20887g.m109237o(120011);
        AbstractC20110a.m104542k(8, "Java crash event!", new Object[0]);
        th2.printStackTrace();
        AbstractC23350e.m122774d(f42840f, th2.toString());
        try {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            int length = stackTrace.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                } else if (stackTrace[i11].getClassName().startsWith("com.google.maps.api.android.lib6.gmm6.vector")) {
                    break;
                } else {
                    i11++;
                }
            }
        } catch (Exception unused) {
        }
        this.f42845c = thread;
        this.f42846d = th2;
        AbstractC23350e.m122775e(f42840f, "CustomCrashHandler caught a " + th2.getClass().getSimpleName() + " for " + MainApplication.getAppContext().getPackageName(), th2);
        m40930e(th2, this.f42843a, true);
    }

    /* renamed from: i */
    public int m40932i() {
        m40928b();
        Integer num = this.f42844b;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: j */
    public void m40933j(EnumC21730b enumC21730b) {
        this.f42843a = enumC21730b;
    }

    /* renamed from: k */
    public void m40934k(int i11) {
        this.f42844b = Integer.valueOf(i11);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        try {
            try {
                m40931f(thread, th2);
            } catch (Exception e11) {
                e11.printStackTrace();
                if (this.f42847e != null) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f42847e;
                }
            }
        } finally {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f42847e;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th2);
            }
        }
    }
}
