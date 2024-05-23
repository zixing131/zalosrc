package p154f9;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.AbstractC1388a;
import p636x8.InterfaceC29473c;

/* renamed from: f9.a */
/* loaded from: classes.dex */
public class C18825a {

    /* renamed from: a */
    private final Context f94111a;

    /* renamed from: b */
    private final SharedPreferences f94112b;

    /* renamed from: c */
    private final InterfaceC29473c f94113c;

    /* renamed from: d */
    private boolean f94114d;

    public C18825a(Context context, String str, InterfaceC29473c interfaceC29473c) {
        Context m98808a = m98808a(context);
        this.f94111a = m98808a;
        this.f94112b = m98808a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f94113c = interfaceC29473c;
        this.f94114d = m98809c();
    }

    /* renamed from: a */
    private static Context m98808a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return context;
        }
        return AbstractC1388a.m6960b(context);
    }

    /* renamed from: c */
    private boolean m98809c() {
        if (this.f94112b.contains("firebase_data_collection_default_enabled")) {
            return this.f94112b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return m98810d();
    }

    /* renamed from: d */
    private boolean m98810d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f94111a.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.f94111a.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public synchronized boolean m98811b() {
        return this.f94114d;
    }
}
