package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.play.core.install.InstallException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p051c7.AbstractC3304c;
import p051c7.AbstractC3311f0;
import p051c7.AbstractC3320o;
import p051c7.C3309e0;
import p051c7.C3325t;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p342m6.C22890k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.appupdate.w */
/* loaded from: classes.dex */
public final class C6497w {

    /* renamed from: e */
    private static final C3325t f36312e = new C3325t("AppUpdateService");

    /* renamed from: f */
    private static final Intent f36313f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    C3309e0 f36314a;

    /* renamed from: b */
    private final String f36315b;

    /* renamed from: c */
    private final Context f36316c;

    /* renamed from: d */
    private final C6499y f36317d;

    public C6497w(Context context, C6499y c6499y) {
        this.f36315b = context.getPackageName();
        this.f36316c = context;
        this.f36317d = c6499y;
        if (AbstractC3304c.m16752a(context)) {
            this.f36314a = new C3309e0(AbstractC3311f0.m16779a(context), f36312e, "AppUpdateService", f36313f, C6491q.f36300a, null);
        }
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ Bundle m33354b(C6497w c6497w, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        bundle.putAll(m33359i());
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(c6497w.f36316c.getPackageManager().getPackageInfo(c6497w.f36316c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f36312e.m16798b("The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    /* renamed from: f */
    public static /* bridge */ /* synthetic */ C6470a m33356f(C6497w c6497w, Bundle bundle, String str) {
        Integer valueOf;
        int i11 = bundle.getInt("version.code", -1);
        int i12 = bundle.getInt("update.availability");
        int i13 = bundle.getInt("install.status", 0);
        if (bundle.getInt("client.version.staleness", -1) == -1) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(bundle.getInt("client.version.staleness"));
        }
        Integer num = valueOf;
        int i14 = bundle.getInt("in.app.update.priority", 0);
        long j11 = bundle.getLong("bytes.downloaded");
        long j12 = bundle.getLong("total.bytes.to.download");
        long j13 = bundle.getLong("additional.size.required");
        long m33365a = c6497w.f36317d.m33365a();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("blocking.intent");
        PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("nonblocking.intent");
        PendingIntent pendingIntent3 = (PendingIntent) bundle.getParcelable("blocking.destructive.intent");
        PendingIntent pendingIntent4 = (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent");
        HashMap hashMap = new HashMap();
        hashMap.put("blocking.destructive.intent", m33361k(bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent")));
        hashMap.put("nonblocking.destructive.intent", m33361k(bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent")));
        hashMap.put("blocking.intent", m33361k(bundle.getIntegerArrayList("update.precondition.failures:blocking.intent")));
        hashMap.put("nonblocking.intent", m33361k(bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent")));
        return C6470a.m33323g(str, i11, i12, i13, num, i14, j11, j12, j13, m33365a, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, hashMap);
    }

    /* renamed from: i */
    public static Bundle m33359i() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Map m16789a = AbstractC3320o.m16789a("app_update");
        bundle2.putInt("playcore_version_code", ((Integer) m16789a.get("java")).intValue());
        if (m16789a.containsKey("native")) {
            bundle2.putInt("playcore_native_version", ((Integer) m16789a.get("native")).intValue());
        }
        if (m16789a.containsKey("unity")) {
            bundle2.putInt("playcore_unity_version", ((Integer) m16789a.get("unity")).intValue());
        }
        bundle.putAll(bundle2);
        bundle.putInt("playcore.version.code", 11004);
        return bundle;
    }

    /* renamed from: j */
    private static AbstractC22888j m33360j() {
        f36312e.m16798b("onError(%d)", -9);
        return AbstractC22894m.m117603e(new InstallException(-9));
    }

    /* renamed from: k */
    private static HashSet m33361k(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        return hashSet;
    }

    /* renamed from: d */
    public final AbstractC22888j m33362d(String str) {
        if (this.f36314a == null) {
            return m33360j();
        }
        f36312e.m16800d("completeUpdate(%s)", str);
        C22890k c22890k = new C22890k();
        this.f36314a.m16775s(new C6493s(this, c22890k, c22890k, str), c22890k);
        return c22890k.m117594a();
    }

    /* renamed from: e */
    public final AbstractC22888j m33363e(String str) {
        if (this.f36314a == null) {
            return m33360j();
        }
        f36312e.m16800d("requestUpdateInfo(%s)", str);
        C22890k c22890k = new C22890k();
        this.f36314a.m16775s(new C6492r(this, c22890k, str, c22890k), c22890k);
        return c22890k.m117594a();
    }
}
