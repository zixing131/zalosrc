package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import p229i5.AbstractC20289j;
import p289k5.C21472e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ai2 implements sh2 {

    /* renamed from: a */
    private final uc3 f17060a;

    /* renamed from: b */
    private final Context f17061b;

    public ai2(uc3 uc3Var, Context context) {
        this.f17060a = uc3Var;
        this.f17061b = context;
    }

    /* renamed from: b */
    private static ResolveInfo m20123b(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(22:1|(1:3)(1:60)|4|(1:6)(1:59)|7|(3:9|(1:12)|13)|14|(3:53|54|(14:56|17|18|19|(9:21|22|23|(1:25)(2:36|(3:39|(3:42|(2:45|46)(1:44)|40)|47))|26|27|(1:35)(1:31)|32|33)|49|23|(0)(0)|26|27|(1:29)|35|32|33))|16|17|18|19|(0)|49|23|(0)(0)|26|27|(0)|35|32|33) */
    /* JADX WARN: Incorrect condition in loop: B:11:0x0055 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa A[Catch: Exception -> 0x00c3, TRY_LEAVE, TryCatch #1 {Exception -> 0x00c3, blocks: (B:19:0x009c, B:21:0x00aa), top: B:18:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ xh2 m20124a() {
        boolean z11;
        boolean z12;
        ActivityInfo activityInfo;
        PackageInfo m111064f;
        String str;
        String str2;
        String str3;
        boolean equals;
        boolean z13;
        PackageInfo m111064f2;
        LocaleList localeList;
        int size;
        Locale locale;
        PackageManager packageManager = this.f17061b.getPackageManager();
        Locale locale2 = Locale.getDefault();
        if (m20123b(packageManager, "geo:0,0?q=donuts") != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m20123b(packageManager, "http://www.google.com") != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        String country = locale2.getCountry();
        zzt.zzp();
        zzaw.zzb();
        boolean m26109s = rk0.m26109s();
        boolean m105929c = AbstractC20289j.m105929c(this.f17061b);
        boolean m105930d = AbstractC20289j.m105930d(this.f17061b);
        String language = locale2.getLanguage();
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            localeList = LocaleList.getDefault();
            for (int i11 = 0; i11 < size; i11++) {
                locale = localeList.get(i11);
                arrayList.add(locale.getLanguage());
            }
        }
        Context context = this.f17061b;
        ResolveInfo m20123b = m20123b(packageManager, "market://details?id=com.google.android.gms.ads");
        if (m20123b != null && (activityInfo = m20123b.activityInfo) != null) {
            try {
                m111064f = C21472e.m111067a(context).m111064f(activityInfo.packageName, 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (m111064f != null) {
                str = m111064f.versionCode + "." + activityInfo.packageName;
                m111064f2 = C21472e.m111067a(this.f17061b).m111064f("com.android.vending", 128);
                if (m111064f2 != null) {
                    str2 = m111064f2.versionCode + "." + m111064f2.packageName;
                    String str4 = Build.FINGERPRINT;
                    Context context2 = this.f17061b;
                    if (packageManager == null) {
                        str3 = str4;
                    } else {
                        str3 = str4;
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
                        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                        if (queryIntentActivities != null && resolveActivity != null) {
                            for (int i12 = 0; i12 < queryIntentActivities.size(); i12++) {
                                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i12).activityInfo.name)) {
                                    equals = resolveActivity.activityInfo.packageName.equals(x04.m27799a(context2));
                                    break;
                                }
                            }
                        }
                    }
                    equals = false;
                    zzt.zzp();
                    long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                    if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21110R8)).booleanValue() && AbstractC20289j.m105928b(this.f17061b)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    return new xh2(z11, z12, country, m26109s, m105929c, m105930d, language, arrayList, str, str2, str3, equals, Build.MODEL, availableBytes, z13);
                }
                str2 = null;
                String str42 = Build.FINGERPRINT;
                Context context22 = this.f17061b;
                if (packageManager == null) {
                }
                equals = false;
                zzt.zzp();
                long availableBytes2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21110R8)).booleanValue()) {
                }
                z13 = false;
                return new xh2(z11, z12, country, m26109s, m105929c, m105930d, language, arrayList, str, str2, str3, equals, Build.MODEL, availableBytes2, z13);
            }
        }
        str = null;
        m111064f2 = C21472e.m111067a(this.f17061b).m111064f("com.android.vending", 128);
        if (m111064f2 != null) {
        }
        str2 = null;
        String str422 = Build.FINGERPRINT;
        Context context222 = this.f17061b;
        if (packageManager == null) {
        }
        equals = false;
        zzt.zzp();
        long availableBytes22 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21110R8)).booleanValue()) {
        }
        z13 = false;
        return new xh2(z11, z12, country, m26109s, m105929c, m105930d, language, arrayList, str, str2, str3, equals, Build.MODEL, availableBytes22, z13);
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 38;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return this.f17060a.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.yh2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ai2.this.m20124a();
            }
        });
    }
}
