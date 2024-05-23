package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.gms.common.internal.AbstractC4205o;

/* renamed from: com.google.android.gms.common.e */
/* loaded from: classes2.dex */
public class C4155e {

    /* renamed from: c */
    private static C4155e f16505c;

    /* renamed from: a */
    private final Context f16506a;

    /* renamed from: b */
    private volatile String f16507b;

    public C4155e(Context context) {
        this.f16506a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C4155e m19594a(Context context) {
        AbstractC4205o.m19722k(context);
        synchronized (C4155e.class) {
            try {
                if (f16505c == null) {
                    AbstractC4253r.m19848d(context);
                    f16505c = new C4155e(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f16505c;
    }

    /* renamed from: d */
    static final AbstractBinderC4249n m19595d(PackageInfo packageInfo, AbstractBinderC4249n... abstractBinderC4249nArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        BinderC4250o binderC4250o = new BinderC4250o(packageInfo.signatures[0].toByteArray());
        for (int i11 = 0; i11 < abstractBinderC4249nArr.length; i11++) {
            if (abstractBinderC4249nArr[i11].equals(binderC4250o)) {
                return abstractBinderC4249nArr[i11];
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final boolean m19596e(PackageInfo packageInfo, boolean z11) {
        AbstractBinderC4249n m19595d;
        if (z11 && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null || (applicationInfo.flags & 129) == 0) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if (z11) {
                m19595d = m19595d(packageInfo, AbstractC4252q.f16722a);
            } else {
                m19595d = m19595d(packageInfo, AbstractC4252q.f16722a[0]);
            }
            if (m19595d != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private final C4268w m19597f(String str, boolean z11, boolean z12) {
        C4268w m19885c;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return C4268w.m19885c("null pkg");
        }
        if (!str.equals(this.f16507b)) {
            if (AbstractC4253r.m19849e()) {
                m19885c = AbstractC4253r.m19846b(str, AbstractC4150d.m19583g(this.f16506a), false, false);
            } else {
                try {
                    PackageInfo packageInfo = this.f16506a.getPackageManager().getPackageInfo(str, 64);
                    boolean m19583g = AbstractC4150d.m19583g(this.f16506a);
                    if (packageInfo == null) {
                        m19885c = C4268w.m19885c("null pkg");
                    } else {
                        Signature[] signatureArr = packageInfo.signatures;
                        if (signatureArr != null && signatureArr.length == 1) {
                            BinderC4250o binderC4250o = new BinderC4250o(packageInfo.signatures[0].toByteArray());
                            String str2 = packageInfo.packageName;
                            C4268w m19845a = AbstractC4253r.m19845a(str2, binderC4250o, m19583g, false);
                            if (m19845a.f16786a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0 && AbstractC4253r.m19845a(str2, binderC4250o, false, true).f16786a) {
                                m19885c = C4268w.m19885c("debuggable release cert app rejected");
                            } else {
                                m19885c = m19845a;
                            }
                        } else {
                            m19885c = C4268w.m19885c("single cert required");
                        }
                    }
                } catch (PackageManager.NameNotFoundException e11) {
                    return C4268w.m19886d("no pkg ".concat(str), e11);
                }
            }
            if (m19885c.f16786a) {
                this.f16507b = str;
            }
            return m19885c;
        }
        return C4268w.m19884b();
    }

    /* renamed from: b */
    public boolean m19598b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m19596e(packageInfo, false)) {
            return true;
        }
        if (!m19596e(packageInfo, true) || !AbstractC4150d.m19583g(this.f16506a)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean m19599c(int i11) {
        C4268w m19885c;
        int length;
        String[] packagesForUid = this.f16506a.getPackageManager().getPackagesForUid(i11);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            m19885c = null;
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    m19885c = m19597f(packagesForUid[i12], false, false);
                    if (m19885c.f16786a) {
                        break;
                    }
                    i12++;
                } else {
                    AbstractC4205o.m19722k(m19885c);
                    break;
                }
            }
        } else {
            m19885c = C4268w.m19885c("no pkgs");
        }
        m19885c.m19889e();
        return m19885c.f16786a;
    }
}
