package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p229i5.AbstractC20295p;
import p289k5.C21472e;

/* loaded from: classes2.dex */
public final class hk0 {

    /* renamed from: a */
    private final Object f21802a = new Object();

    /* renamed from: b */
    private final zzj f21803b;

    /* renamed from: c */
    private final lk0 f21804c;

    /* renamed from: d */
    private boolean f21805d;

    /* renamed from: e */
    private Context f21806e;

    /* renamed from: f */
    private zzcgv f21807f;

    /* renamed from: g */
    private C4738lx f21808g;

    /* renamed from: h */
    private Boolean f21809h;

    /* renamed from: i */
    private final AtomicInteger f21810i;

    /* renamed from: j */
    private final gk0 f21811j;

    /* renamed from: k */
    private final Object f21812k;

    /* renamed from: l */
    private tc3 f21813l;

    /* renamed from: m */
    private final AtomicBoolean f21814m;

    public hk0() {
        zzj zzjVar = new zzj();
        this.f21803b = zzjVar;
        this.f21804c = new lk0(zzaw.zzd(), zzjVar);
        this.f21805d = false;
        this.f21808g = null;
        this.f21809h = null;
        this.f21810i = new AtomicInteger(0);
        this.f21811j = new gk0(null);
        this.f21812k = new Object();
        this.f21814m = new AtomicBoolean();
    }

    /* renamed from: a */
    public final int m22931a() {
        return this.f21810i.get();
    }

    /* renamed from: c */
    public final Context m22932c() {
        return this.f21806e;
    }

    /* renamed from: d */
    public final Resources m22933d() {
        if (this.f21807f.f32033s) {
            return this.f21806e.getResources();
        }
        try {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21435y8)).booleanValue()) {
                return bl0.m20568a(this.f21806e).getResources();
            }
            bl0.m20568a(this.f21806e).getResources();
            return null;
        } catch (zzcgs e11) {
            yk0.zzk("Cannot load resource from dynamite apk or local jar", e11);
            return null;
        }
    }

    /* renamed from: f */
    public final C4738lx m22934f() {
        C4738lx c4738lx;
        synchronized (this.f21802a) {
            c4738lx = this.f21808g;
        }
        return c4738lx;
    }

    /* renamed from: g */
    public final lk0 m22935g() {
        return this.f21804c;
    }

    /* renamed from: h */
    public final zzg m22936h() {
        zzj zzjVar;
        synchronized (this.f21802a) {
            zzjVar = this.f21803b;
        }
        return zzjVar;
    }

    /* renamed from: j */
    public final tc3 m22937j() {
        if (this.f21806e != null) {
            if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21299l2)).booleanValue()) {
                synchronized (this.f21812k) {
                    try {
                        tc3 tc3Var = this.f21813l;
                        if (tc3Var != null) {
                            return tc3Var;
                        }
                        tc3 mo21339R = kl0.f23363a.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.ck0
                            public /* synthetic */ ck0() {
                            }

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return hk0.this.m22939m();
                            }
                        });
                        this.f21813l = mo21339R;
                        return mo21339R;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        return kc3.m23877i(new ArrayList());
    }

    /* renamed from: k */
    public final Boolean m22938k() {
        Boolean bool;
        synchronized (this.f21802a) {
            bool = this.f21809h;
        }
        return bool;
    }

    /* renamed from: m */
    public final /* synthetic */ ArrayList m22939m() {
        Context m20113a = ag0.m20113a(this.f21806e);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo m111064f = C21472e.m111067a(m20113a).m111064f(m20113a.getApplicationInfo().packageName, 4096);
            if (m111064f.requestedPermissions != null && m111064f.requestedPermissionsFlags != null) {
                int i11 = 0;
                while (true) {
                    String[] strArr = m111064f.requestedPermissions;
                    if (i11 >= strArr.length) {
                        break;
                    }
                    if ((m111064f.requestedPermissionsFlags[i11] & 2) != 0) {
                        arrayList.add(strArr[i11]);
                    }
                    i11++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    /* renamed from: o */
    public final void m22940o() {
        this.f21811j.m22463a();
    }

    /* renamed from: p */
    public final void m22941p() {
        this.f21810i.decrementAndGet();
    }

    /* renamed from: q */
    public final void m22942q() {
        this.f21810i.incrementAndGet();
    }

    /* renamed from: r */
    public final void m22943r(Context context, zzcgv zzcgvVar) {
        C4738lx c4738lx;
        synchronized (this.f21802a) {
            try {
                if (!this.f21805d) {
                    this.f21806e = context.getApplicationContext();
                    this.f21807f = zzcgvVar;
                    zzt.zzb().m24016c(this.f21804c);
                    this.f21803b.zzr(this.f21806e);
                    se0.m26288d(this.f21806e, this.f21807f);
                    zzt.zze();
                    if (!((Boolean) AbstractC5000sy.f28058c.m24091e()).booleanValue()) {
                        zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        c4738lx = null;
                    } else {
                        c4738lx = new C4738lx();
                    }
                    this.f21808g = c4738lx;
                    if (c4738lx != null) {
                        nl0.m24944a(new dk0(this).zzb(), "AppState.registerCsiReporter");
                    }
                    if (AbstractC20295p.m105955i()) {
                        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21304l7)).booleanValue()) {
                            ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new ek0(this));
                        }
                    }
                    this.f21805d = true;
                    m22937j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzt.zzp().zzc(context, zzcgvVar.f32030p);
    }

    /* renamed from: s */
    public final void m22944s(Throwable th2, String str) {
        se0.m26288d(this.f21806e, this.f21807f).mo26289a(th2, str, ((Double) AbstractC4593hz.f21972g.m24091e()).floatValue());
    }

    /* renamed from: t */
    public final void m22945t(Throwable th2, String str) {
        se0.m26288d(this.f21806e, this.f21807f).mo26290b(th2, str);
    }

    /* renamed from: u */
    public final void m22946u(Boolean bool) {
        synchronized (this.f21802a) {
            this.f21809h = bool;
        }
    }

    /* renamed from: v */
    public final boolean m22947v(Context context) {
        if (AbstractC20295p.m105955i()) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21304l7)).booleanValue()) {
                return this.f21814m.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }
}
