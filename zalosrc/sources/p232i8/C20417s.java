package p232i8;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.C6576e;
import java.util.concurrent.Executor;
import p153f8.C18821f;
import p342m6.AbstractC22888j;
import p342m6.C22890k;

/* renamed from: i8.s */
/* loaded from: classes.dex */
public class C20417s {

    /* renamed from: a */
    private final SharedPreferences f100558a;

    /* renamed from: b */
    private final C6576e f100559b;

    /* renamed from: c */
    private final Object f100560c;

    /* renamed from: d */
    C22890k f100561d;

    /* renamed from: e */
    boolean f100562e;

    /* renamed from: f */
    private boolean f100563f;

    /* renamed from: g */
    private Boolean f100564g;

    /* renamed from: h */
    private final C22890k f100565h;

    public C20417s(C6576e c6576e) {
        Object obj = new Object();
        this.f100560c = obj;
        this.f100561d = new C22890k();
        this.f100562e = false;
        this.f100563f = false;
        this.f100565h = new C22890k();
        Context m33612j = c6576e.m33612j();
        this.f100559b = c6576e;
        this.f100558a = AbstractC20395h.m106223s(m33612j);
        Boolean m106388b = m106388b();
        this.f100564g = m106388b == null ? m106387a(m33612j) : m106388b;
        synchronized (obj) {
            try {
                if (m106393d()) {
                    this.f100561d.m117598e(null);
                    this.f100562e = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: a */
    private Boolean m106387a(Context context) {
        Boolean m106390f = m106390f(context);
        if (m106390f == null) {
            this.f100563f = false;
            return null;
        }
        this.f100563f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(m106390f));
    }

    /* renamed from: b */
    private Boolean m106388b() {
        if (this.f100558a.contains("firebase_crashlytics_collection_enabled")) {
            this.f100563f = false;
            return Boolean.valueOf(this.f100558a.getBoolean("firebase_crashlytics_collection_enabled", true));
        }
        return null;
    }

    /* renamed from: e */
    private void m106389e(boolean z11) {
        String str;
        String str2;
        if (z11) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f100564g == null) {
            str2 = "global Firebase setting";
        } else if (this.f100563f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        C18821f.m98795f().m98796b(String.format("Crashlytics automatic data collection %s by %s.", str, str2));
    }

    /* renamed from: f */
    private static Boolean m106390f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            }
            return null;
        } catch (PackageManager.NameNotFoundException e11) {
            C18821f.m98795f().m98799e("Could not read data collection permission from manifest", e11);
            return null;
        }
    }

    /* renamed from: h */
    private static void m106391h(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (bool != null) {
            edit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            edit.remove("firebase_crashlytics_collection_enabled");
        }
        edit.apply();
    }

    /* renamed from: c */
    public void m106392c(boolean z11) {
        if (z11) {
            this.f100565h.m117598e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    /* renamed from: d */
    public synchronized boolean m106393d() {
        boolean m33616s;
        try {
            Boolean bool = this.f100564g;
            if (bool != null) {
                m33616s = bool.booleanValue();
            } else {
                m33616s = this.f100559b.m33616s();
            }
            m106389e(m33616s);
        } catch (Throwable th2) {
            throw th2;
        }
        return m33616s;
    }

    /* renamed from: g */
    public synchronized void m106394g(Boolean bool) {
        Boolean m106387a;
        if (bool != null) {
            try {
                this.f100563f = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bool != null) {
            m106387a = bool;
        } else {
            m106387a = m106387a(this.f100559b.m33612j());
        }
        this.f100564g = m106387a;
        m106391h(this.f100558a, bool);
        synchronized (this.f100560c) {
            try {
                if (m106393d()) {
                    if (!this.f100562e) {
                        this.f100561d.m117598e(null);
                        this.f100562e = true;
                    }
                } else if (this.f100562e) {
                    this.f100561d = new C22890k();
                    this.f100562e = false;
                }
            } finally {
            }
        }
    }

    /* renamed from: i */
    public AbstractC22888j m106395i() {
        AbstractC22888j m117594a;
        synchronized (this.f100560c) {
            m117594a = this.f100561d.m117594a();
        }
        return m117594a;
    }

    /* renamed from: j */
    public AbstractC22888j m106396j(Executor executor) {
        return AbstractC20418s0.m106410n(executor, this.f100565h.m117594a(), m106395i());
    }
}
