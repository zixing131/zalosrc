package p289k5;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import androidx.core.util.C1483e;
import p229i5.AbstractC20295p;

/* renamed from: k5.d */
/* loaded from: classes.dex */
public class C21471d {

    /* renamed from: a */
    protected final Context f104484a;

    public C21471d(Context context) {
        this.f104484a = context;
    }

    /* renamed from: a */
    public int m111059a(String str) {
        return this.f104484a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: b */
    public int m111060b(String str, String str2) {
        return this.f104484a.getPackageManager().checkPermission(str, str2);
    }

    /* renamed from: c */
    public ApplicationInfo m111061c(String str, int i11) {
        return this.f104484a.getPackageManager().getApplicationInfo(str, i11);
    }

    /* renamed from: d */
    public CharSequence m111062d(String str) {
        return this.f104484a.getPackageManager().getApplicationLabel(this.f104484a.getPackageManager().getApplicationInfo(str, 0));
    }

    /* renamed from: e */
    public C1483e m111063e(String str) {
        ApplicationInfo applicationInfo = this.f104484a.getPackageManager().getApplicationInfo(str, 0);
        return C1483e.m7482a(this.f104484a.getPackageManager().getApplicationLabel(applicationInfo), this.f104484a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    /* renamed from: f */
    public PackageInfo m111064f(String str, int i11) {
        return this.f104484a.getPackageManager().getPackageInfo(str, i11);
    }

    /* renamed from: g */
    public boolean m111065g() {
        String nameForUid;
        boolean isInstantApp;
        if (Binder.getCallingUid() == Process.myUid()) {
            return AbstractC21469b.m111057a(this.f104484a);
        }
        if (AbstractC20295p.m105955i() && (nameForUid = this.f104484a.getPackageManager().getNameForUid(Binder.getCallingUid())) != null) {
            isInstantApp = this.f104484a.getPackageManager().isInstantApp(nameForUid);
            return isInstantApp;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m111066h(int i11, String str) {
        if (AbstractC20295p.m105950d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f104484a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i11, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f104484a.getPackageManager().getPackagesForUid(i11);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
