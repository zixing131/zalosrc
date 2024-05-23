package p258j7;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p291k7.C21536q1;

/* renamed from: j7.s0 */
/* loaded from: classes3.dex */
public final class C20975s0 {

    /* renamed from: c */
    private static final C21536q1 f102886c = new C21536q1("SplitInstallInfoProvider");

    /* renamed from: d */
    public static final /* synthetic */ int f102887d = 0;

    /* renamed from: a */
    private final Context f102888a;

    /* renamed from: b */
    private final String f102889b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C20975s0(Context context) {
        this.f102888a = context;
        this.f102889b = context.getPackageName();
    }

    /* renamed from: b */
    public static String m109507b(String str) {
        if (str.startsWith("config.")) {
            return "";
        }
        return str.split("\\.config\\.", 2)[0];
    }

    /* renamed from: e */
    public static boolean m109508e(String str) {
        if (!str.startsWith("config.") && !str.contains(".config.")) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final Set m109509f(PackageInfo packageInfo) {
        HashSet hashSet = new HashSet();
        for (String str : m109511h(packageInfo)) {
            if (!m109508e(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    /* renamed from: g */
    private final PackageInfo m109510g() {
        try {
            return this.f102888a.getPackageManager().getPackageInfo(this.f102889b, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            f102886c.m111195b("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    /* renamed from: h */
    private static final Set m109511h(PackageInfo packageInfo) {
        Bundle bundle = packageInfo.applicationInfo.metaData;
        HashSet hashSet = new HashSet();
        if (bundle != null) {
            String string = bundle.getString("com.android.dynamic.apk.fused.modules");
            if (string != null && !string.isEmpty()) {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
                hashSet.remove("base");
            } else {
                f102886c.m111194a("App has no fused modules.", new Object[0]);
            }
        }
        String[] strArr = packageInfo.splitNames;
        if (strArr != null) {
            f102886c.m111194a("Adding splits from package manager: %s", Arrays.toString(strArr));
            Collections.addAll(hashSet, strArr);
        } else {
            f102886c.m111194a("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        InterfaceC20971q0 m109505a = AbstractC20973r0.m109505a();
        if (m109505a != null) {
            hashSet.addAll(m109505a.zza());
        }
        return hashSet;
    }

    /* renamed from: a */
    public final C20959k0 m109512a(Bundle bundle) {
        if (bundle == null) {
            f102886c.m111198e("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i11 = bundle.getInt("com.android.vending.splits");
        if (i11 == 0) {
            f102886c.m111198e("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            C20959k0 m109465a = AbstractC20941b0.m109465a(this.f102888a.getResources().getXml(i11), new C20955i0());
            if (m109465a == null) {
                f102886c.m111198e("Can't parse languages metadata.", new Object[0]);
            }
            return m109465a;
        } catch (Resources.NotFoundException unused) {
            f102886c.m111198e("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    public final Set m109513c() {
        PackageInfo m109510g = m109510g();
        if (m109510g != null && m109510g.applicationInfo != null) {
            return m109509f(m109510g);
        }
        return new HashSet();
    }

    /* renamed from: d */
    public final Set m109514d() {
        ApplicationInfo applicationInfo;
        PackageInfo m109510g = m109510g();
        HashSet hashSet = null;
        if (m109510g != null && (applicationInfo = m109510g.applicationInfo) != null) {
            C20959k0 m109512a = m109512a(applicationInfo.metaData);
            if (m109512a == null) {
                return null;
            }
            hashSet = new HashSet();
            Set m109511h = m109511h(m109510g);
            m109511h.add("");
            Set m109509f = m109509f(m109510g);
            m109509f.add("");
            for (Map.Entry entry : m109512a.m109501a(m109509f).entrySet()) {
                if (m109511h.containsAll((Collection) entry.getValue())) {
                    hashSet.add((String) entry.getKey());
                }
            }
        }
        return hashSet;
    }
}
