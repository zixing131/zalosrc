package me0;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import bn0.AbstractC2933b;
import com.zing.zalo.MainApplication;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Objects;
import on0.AbstractC24341v;
import on0.C24329j;
import p248iy.C20882b;
import p361nb.AbstractC23647d;
import p371nv.C23952g;
import pm0.AbstractC24856m;
import pm0.C24860q;
import pm0.InterfaceC24854k;

/* renamed from: me0.r0 */
/* loaded from: classes.dex */
public abstract class AbstractC23193r0 {

    /* renamed from: a */
    private static final InterfaceC24854k f112430a;

    /* renamed from: b */
    private static final InterfaceC24854k f112431b;

    /* renamed from: c */
    private static final InterfaceC24854k f112432c;

    /* renamed from: d */
    private static final FileFilter f112433d;

    /* renamed from: me0.r0$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f112434q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Boolean mo12V4() {
            boolean z11;
            if (AbstractC23193r0.m119505n() > 1024 && AbstractC23193r0.m119500i() >= 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* renamed from: me0.r0$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f112435q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Integer mo12V4() {
            return Integer.valueOf(Runtime.getRuntime().availableProcessors());
        }
    }

    /* renamed from: me0.r0$c */
    /* loaded from: classes.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f112436q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Long mo12V4() {
            Object systemService = MainApplication.Companion.m35500c().getSystemService("activity");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
            return Long.valueOf(memoryInfo.totalMem);
        }
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        m129210a = AbstractC24856m.m129210a(b.f112435q);
        f112430a = m129210a;
        m129210a2 = AbstractC24856m.m129210a(a.f112434q);
        f112431b = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(c.f112436q);
        f112432c = m129210a3;
        f112433d = new FileFilter() { // from class: me0.q0
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                boolean m119493b;
                m119493b = AbstractC23193r0.m119493b(file);
                return m119493b;
            }
        };
    }

    /* renamed from: b */
    public static final boolean m119493b(File file) {
        boolean m127120J;
        AbstractC19074t.m100208f(file, "pathname");
        String name = file.getName();
        AbstractC19074t.m100205c(name);
        m127120J = AbstractC24341v.m127120J(name, "cpu", false, 2, null);
        if (!m127120J) {
            return false;
        }
        for (int i11 = 3; i11 < name.length(); i11++) {
            if (AbstractC19074t.m100209g(name.charAt(i11), 48) < 0 || AbstractC19074t.m100209g(name.charAt(i11), 57) > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static final String m119494c(Context context) {
        AbstractC19074t.m100208f(context, "context");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        AbstractC19074t.m100207e(string, "getString(...)");
        return string;
    }

    /* renamed from: d */
    public static final int m119495d(Context context) {
        AbstractC19074t.m100208f(context, "appContext");
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    /* renamed from: e */
    public static final C24860q m119496e(Context context) {
        AbstractC19074t.m100208f(context, "appContext");
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        return new C24860q(Integer.valueOf(packageInfo.versionCode), packageInfo.versionName);
    }

    /* renamed from: f */
    public static final String m119497f() {
        return m119498g(true);
    }

    /* renamed from: g */
    public static final String m119498g(boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" ");
        String str = Build.MANUFACTURER;
        if (str != null && str.length() != 0) {
            sb2.append(str);
            sb2.append(" ");
        }
        String str2 = Build.MODEL;
        if (str2 != null && str2.length() != 0) {
            sb2.append(str2);
            sb2.append(" ");
        }
        if (z11) {
            String m119502k = m119502k();
            if (m119502k.length() > 0) {
                sb2.append("v.");
                sb2.append(m119502k);
            }
        }
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: h */
    public static final int m119499h(Context context) {
        AbstractC19074t.m100208f(context, "appContext");
        Object systemService = context.getSystemService("activity");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        return ((ActivityManager) systemService).getLargeMemoryClass();
    }

    /* renamed from: i */
    public static final int m119500i() {
        return ((Number) f112430a.getValue()).intValue();
    }

    /* renamed from: j */
    public static final int m119501j() {
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(f112433d);
            Objects.requireNonNull(listFiles);
            return listFiles.length;
        } catch (NullPointerException | SecurityException unused) {
            return 1;
        }
    }

    /* renamed from: k */
    private static final String m119502k() {
        return m119510s(String.valueOf(Build.VERSION.SDK_INT), null, 2, null);
    }

    /* renamed from: l */
    public static final String m119503l(Context context, int i11) {
        AbstractC19074t.m100208f(context, "context");
        try {
            Object systemService = context.getSystemService("activity");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) systemService).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == i11) {
                    String str = runningAppProcessInfo.processName;
                    AbstractC19074t.m100207e(str, "processName");
                    return str;
                }
            }
        } catch (Throwable th2) {
            AbstractC20110a.f98889a.mo104552e(th2);
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + i11 + "/cmdline")));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    int read = bufferedReader.read();
                    if (read > 0) {
                        sb2.append((char) read);
                    } else {
                        String sb3 = sb2.toString();
                        AbstractC19074t.m100207e(sb3, "toString(...)");
                        AbstractC2933b.m13890a(bufferedReader, null);
                        return sb3;
                    }
                }
            } finally {
            }
        } catch (Throwable th3) {
            AbstractC20110a.f98889a.mo104552e(th3);
            return "";
        }
    }

    /* renamed from: m */
    private static final long m119504m() {
        return ((Number) f112432c.getValue()).longValue();
    }

    /* renamed from: n */
    public static final long m119505n() {
        long j11 = 1024;
        return (m119504m() / j11) / j11;
    }

    /* renamed from: o */
    public static final boolean m119506o() {
        return ((Boolean) f112431b.getValue()).booleanValue();
    }

    /* renamed from: p */
    public static final void m119507p() {
        AbstractC20110a.f98889a.mo104556o(8, "kill app", new Object[0]);
        Process.killProcess(Process.myPid());
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    /* renamed from: q */
    public static final void m119508q() {
        AbstractC20110a.f98889a.mo104556o(8, "flush qos, action, log to file and kill app", new Object[0]);
        C20882b.Companion.m109143a();
        AbstractC23647d.m123902l();
        C23952g.m125341f(3000L);
        Process.killProcess(Process.myPid());
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    /* renamed from: r */
    private static final String m119509r(String str, String str2) {
        if (str.length() == 0) {
            str = str2;
        }
        String m127019g = new C24329j("\\s").m127019g(str, "");
        if (m127019g.length() != 0) {
            return m127019g;
        }
        return str2;
    }

    /* renamed from: s */
    static /* synthetic */ String m119510s(String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "unknown";
        }
        return m119509r(str, str2);
    }
}
