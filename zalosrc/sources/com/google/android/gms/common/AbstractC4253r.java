package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.gms.common.internal.AbstractBinderC4227v0;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.InterfaceC4230w0;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import p229i5.AbstractC20280a;
import p229i5.AbstractC20290k;

/* renamed from: com.google.android.gms.common.r */
/* loaded from: classes2.dex */
public abstract class AbstractC4253r {

    /* renamed from: e */
    private static volatile InterfaceC4230w0 f16727e;

    /* renamed from: g */
    private static Context f16729g;

    /* renamed from: a */
    static final AbstractBinderC4251p f16723a = new BinderC4240j(AbstractBinderC4249n.m19843Q("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b */
    static final AbstractBinderC4251p f16724b = new BinderC4241k(AbstractBinderC4249n.m19843Q("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c */
    static final AbstractBinderC4251p f16725c = new BinderC4242l(AbstractBinderC4249n.m19843Q("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d */
    static final AbstractBinderC4251p f16726d = new BinderC4243m(AbstractBinderC4249n.m19843Q("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f */
    private static final Object f16728f = new Object();

    /* renamed from: a */
    public static C4268w m19845a(String str, AbstractBinderC4249n abstractBinderC4249n, boolean z11, boolean z12) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m19850f(str, abstractBinderC4249n, z11, z12);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: b */
    public static C4268w m19846b(String str, boolean z11, boolean z12, boolean z13) {
        return m19851g(str, z11, false, false, true);
    }

    /* renamed from: c */
    public static /* synthetic */ String m19847c(boolean z11, String str, AbstractBinderC4249n abstractBinderC4249n) {
        String str2;
        if (!z11 && m19850f(str, abstractBinderC4249n, true, false).f16786a) {
            str2 = "debug cert rejected";
        } else {
            str2 = "not allowed";
        }
        MessageDigest m105898b = AbstractC20280a.m105898b("SHA-256");
        AbstractC4205o.m19722k(m105898b);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, AbstractC20290k.m105936a(m105898b.digest(abstractBinderC4249n.mo19844I3())), Boolean.valueOf(z11), "12451000.false");
    }

    /* renamed from: d */
    public static synchronized void m19848d(Context context) {
        synchronized (AbstractC4253r.class) {
            if (f16729g == null) {
                if (context != null) {
                    f16729g = context.getApplicationContext();
                }
            }
        }
    }

    /* renamed from: e */
    public static boolean m19849e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            m19852h();
            boolean zzi = f16727e.zzi();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return zzi;
        } catch (RemoteException | DynamiteModule.LoadingException unused) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
    }

    /* renamed from: f */
    private static C4268w m19850f(String str, AbstractBinderC4249n abstractBinderC4249n, boolean z11, boolean z12) {
        try {
            m19852h();
            AbstractC4205o.m19722k(f16729g);
            try {
                if (f16727e.mo19802S2(new zzs(str, abstractBinderC4249n, z11, z12), BinderC4273d.m19913I3(f16729g.getPackageManager()))) {
                    return C4268w.m19884b();
                }
                return new C4267v(new Callable() { // from class: com.google.android.gms.common.i

                    /* renamed from: a */
                    public final /* synthetic */ boolean f16510a;

                    /* renamed from: b */
                    public final /* synthetic */ String f16511b;

                    /* renamed from: c */
                    public final /* synthetic */ AbstractBinderC4249n f16512c;

                    public /* synthetic */ CallableC4159i(boolean z112, String str2, AbstractBinderC4249n abstractBinderC4249n2) {
                        r1 = z112;
                        r2 = str2;
                        r3 = abstractBinderC4249n2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return AbstractC4253r.m19847c(r1, r2, r3);
                    }
                }, null);
            } catch (RemoteException e11) {
                return C4268w.m19886d("module call", e11);
            }
        } catch (DynamiteModule.LoadingException e12) {
            return C4268w.m19886d("module init: ".concat(String.valueOf(e12.getMessage())), e12);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.dynamic.b, android.os.IBinder] */
    /* renamed from: g */
    private static C4268w m19851g(String str, boolean z11, boolean z12, boolean z13, boolean z14) {
        C4268w m19886d;
        zzq mo19803U3;
        PackageManager.NameNotFoundException nameNotFoundException;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            AbstractC4205o.m19722k(f16729g);
            try {
                m19852h();
                zzo zzoVar = new zzo(str, z11, false, BinderC4273d.m19913I3(f16729g), false);
                try {
                    if (z14) {
                        mo19803U3 = f16727e.mo19801D3(zzoVar);
                    } else {
                        mo19803U3 = f16727e.mo19803U3(zzoVar);
                    }
                    if (mo19803U3.m19891F()) {
                        m19886d = C4268w.m19887f(mo19803U3.m19892J());
                    } else {
                        String m19894t = mo19803U3.m19894t();
                        if (mo19803U3.m19893K() == 4) {
                            nameNotFoundException = new PackageManager.NameNotFoundException();
                        } else {
                            nameNotFoundException = null;
                        }
                        if (m19894t == null) {
                            m19894t = "error checking package certificate";
                        }
                        m19886d = C4268w.m19888g(mo19803U3.m19892J(), mo19803U3.m19893K(), m19894t, nameNotFoundException);
                    }
                } catch (RemoteException e11) {
                    m19886d = C4268w.m19886d("module call", e11);
                }
            } catch (DynamiteModule.LoadingException e12) {
                m19886d = C4268w.m19886d("module init: ".concat(String.valueOf(e12.getMessage())), e12);
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return m19886d;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
    }

    /* renamed from: h */
    private static void m19852h() {
        if (f16727e != null) {
            return;
        }
        AbstractC4205o.m19722k(f16729g);
        synchronized (f16728f) {
            try {
                if (f16727e == null) {
                    f16727e = AbstractBinderC4227v0.m19808N(DynamiteModule.m19920e(f16729g, DynamiteModule.f16819f, "com.google.android.gms.googlecertificates").m19929d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
