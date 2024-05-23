package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.C4148b;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p289k5.C21472e;

/* loaded from: classes2.dex */
public final class se0 implements ue0 {

    /* renamed from: f */
    private static final Object f27644f = new Object();

    /* renamed from: g */
    static ue0 f27645g;

    /* renamed from: h */
    static ue0 f27646h;

    /* renamed from: b */
    private final Context f27648b;

    /* renamed from: d */
    private final ExecutorService f27650d;

    /* renamed from: e */
    private final zzcgv f27651e;

    /* renamed from: a */
    private final Object f27647a = new Object();

    /* renamed from: c */
    private final WeakHashMap f27649c = new WeakHashMap();

    protected se0(Context context, zzcgv zzcgvVar) {
        l23.m24108a();
        this.f27650d = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.f27648b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f27651e = zzcgvVar;
    }

    /* renamed from: c */
    public static ue0 m26287c(Context context) {
        synchronized (f27644f) {
            try {
                if (f27645g == null) {
                    if (((Boolean) AbstractC4593hz.f21970e.m24091e()).booleanValue()) {
                        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21008H6)).booleanValue()) {
                            f27645g = new se0(context, zzcgv.m28720t());
                        }
                    }
                    f27645g = new te0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f27645g;
    }

    /* renamed from: d */
    public static ue0 m26288d(Context context, zzcgv zzcgvVar) {
        synchronized (f27644f) {
            if (f27646h == null) {
                if (((Boolean) AbstractC4593hz.f21970e.m24091e()).booleanValue()) {
                    if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21008H6)).booleanValue()) {
                        se0 se0Var = new se0(context, zzcgvVar);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (se0Var.f27647a) {
                                se0Var.f27649c.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new re0(se0Var, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new qe0(se0Var, Thread.getDefaultUncaughtExceptionHandler()));
                        f27646h = se0Var;
                    }
                }
                f27646h = new te0();
            }
        }
        return f27646h;
    }

    @Override // com.google.android.gms.internal.ads.ue0
    /* renamed from: a */
    public final void mo26289a(Throwable th2, String str, float f11) {
        int i11;
        boolean z11;
        String str2;
        String str3;
        if (rk0.m26105h(th2) == null) {
            return;
        }
        String name = th2.getClass().getName();
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        double d11 = f11;
        double random = Math.random();
        if (f11 > 0.0f) {
            i11 = (int) (1.0f / f11);
        } else {
            i11 = 1;
        }
        if (random < d11) {
            ArrayList arrayList = new ArrayList();
            try {
                z11 = C21472e.m111067a(this.f27648b).m111065g();
            } catch (Throwable th3) {
                yk0.zzh("Error fetching instant app info", th3);
                z11 = false;
            }
            try {
                str2 = this.f27648b.getPackageName();
            } catch (Throwable unused) {
                yk0.zzj("Cannot obtain package name, proceeding.");
                str2 = "unknown";
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z11)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str4 = Build.MANUFACTURER;
            String str5 = Build.MODEL;
            if (!str5.startsWith(str4)) {
                str5 = str4 + " " + str5;
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", str5).appendQueryParameter("js", this.f27651e.f32030p).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", stringWriter2).appendQueryParameter("eids", TextUtils.join(",", AbstractC4554gx.m22620a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "474357726").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i11)).appendQueryParameter("pb_tm", String.valueOf(AbstractC4593hz.f21968c.m24091e())).appendQueryParameter("gmscv", String.valueOf(C4148b.m19567h().m19569b(this.f27648b)));
            if (true != this.f27651e.f32034t) {
                str3 = "0";
            } else {
                str3 = "1";
            }
            arrayList.add(appendQueryParameter2.appendQueryParameter("lite", str3).toString());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f27650d.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.pe0

                    /* renamed from: q */
                    public final /* synthetic */ String f26187q;

                    public /* synthetic */ pe0(String str6) {
                        r2 = str6;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cl0.this.zza(r2);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ue0
    /* renamed from: b */
    public final void mo26290b(Throwable th2, String str) {
        mo26289a(th2, str, 1.0f);
    }

    /* renamed from: e */
    public final void m26291e(Thread thread, Throwable th2) {
        if (th2 != null) {
            boolean z11 = false;
            boolean z12 = false;
            for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
                for (StackTraceElement stackTraceElement : th3.getStackTrace()) {
                    z11 |= rk0.m26106p(stackTraceElement.getClassName());
                    z12 |= se0.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (z11 && !z12) {
                mo26289a(th2, "", 1.0f);
            }
        }
    }
}
