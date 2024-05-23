package p369ns;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import com.zing.zalo.MainApplication;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p594w1.C28685a;

/* renamed from: ns.a */
/* loaded from: classes4.dex */
public abstract class AbstractC23933a {

    /* renamed from: a */
    private static final HashSet f115861a = new HashSet();

    /* renamed from: a */
    private static boolean m125286a() {
        if (f115861a.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m125287b(Context context, String str, boolean z11) {
        if (!z11) {
            synchronized (f115861a) {
                try {
                    if (!m125286a()) {
                        m125290e(context);
                    }
                } finally {
                }
            }
        }
        return f115861a.contains(str);
    }

    /* renamed from: c */
    public static boolean m125288c(String str) {
        if (!m125286a()) {
            return m125287b(MainApplication.getAppContext(), str, false);
        }
        return f115861a.contains(str);
    }

    /* renamed from: d */
    public static void m125289d(Context context) {
        m125287b(context, "", false);
    }

    /* renamed from: e */
    private static void m125290e(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        List<ApplicationInfo> installedApplications = context.getPackageManager().getInstalledApplications(64);
        if (installedApplications == null) {
            return;
        }
        Iterator<ApplicationInfo> it = installedApplications.iterator();
        while (it.hasNext()) {
            if (!it.next().enabled) {
                it.remove();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("query application done in ");
        sb2.append(currentTimeMillis2);
        if (installedApplications.size() > 0) {
            f115861a.clear();
            ArrayList arrayList = new ArrayList(installedApplications.size());
            for (ApplicationInfo applicationInfo : installedApplications) {
                arrayList.add(applicationInfo.packageName);
                f115861a.add(applicationInfo.packageName);
            }
            C28685a.m143693b(context).m143696d(new Intent("com.zing.zalo.ACTION_APPLICATION_LOADED"));
        }
    }

    /* renamed from: f */
    public static void m125291f() {
        m125292g();
        m125289d(MainApplication.getAppContext());
    }

    /* renamed from: g */
    private static void m125292g() {
        HashSet hashSet = f115861a;
        synchronized (hashSet) {
            hashSet.clear();
        }
    }
}
