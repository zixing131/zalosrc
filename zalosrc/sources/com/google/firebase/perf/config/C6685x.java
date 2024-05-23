package com.google.firebase.perf.config;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.C6576e;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p319l9.C22152a;
import p476r9.C25699g;

/* renamed from: com.google.firebase.perf.config.x */
/* loaded from: classes3.dex */
public class C6685x {

    /* renamed from: c */
    private static final C22152a f36810c = C22152a.m115524e();

    /* renamed from: d */
    private static C6685x f36811d;

    /* renamed from: a */
    private volatile SharedPreferences f36812a;

    /* renamed from: b */
    private final ExecutorService f36813b;

    public C6685x(ExecutorService executorService) {
        this.f36813b = executorService;
    }

    /* renamed from: c */
    private Context m34119c() {
        try {
            C6576e.m33601k();
            return C6576e.m33601k().m33612j();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static synchronized C6685x m34120e() {
        C6685x c6685x;
        synchronized (C6685x.class) {
            try {
                if (f36811d == null) {
                    f36811d = new C6685x(Executors.newSingleThreadExecutor());
                }
                c6685x = f36811d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6685x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m34121h(Context context) {
        if (this.f36812a == null && context != null) {
            this.f36812a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
        }
    }

    /* renamed from: b */
    public C25699g m34122b(String str) {
        if (str == null) {
            f36810c.m115525a("Key is null when getting boolean value on device cache.");
            return C25699g.m132609a();
        }
        if (this.f36812a == null) {
            m34126i(m34119c());
            if (this.f36812a == null) {
                return C25699g.m132609a();
            }
        }
        if (!this.f36812a.contains(str)) {
            return C25699g.m132609a();
        }
        try {
            return C25699g.m132611e(Boolean.valueOf(this.f36812a.getBoolean(str, false)));
        } catch (ClassCastException e11) {
            f36810c.m115526b("Key %s from sharedPreferences has type other than long: %s", str, e11.getMessage());
            return C25699g.m132609a();
        }
    }

    /* renamed from: d */
    public C25699g m34123d(String str) {
        if (str == null) {
            f36810c.m115525a("Key is null when getting float value on device cache.");
            return C25699g.m132609a();
        }
        if (this.f36812a == null) {
            m34126i(m34119c());
            if (this.f36812a == null) {
                return C25699g.m132609a();
            }
        }
        if (!this.f36812a.contains(str)) {
            return C25699g.m132609a();
        }
        try {
            return C25699g.m132611e(Float.valueOf(this.f36812a.getFloat(str, 0.0f)));
        } catch (ClassCastException e11) {
            f36810c.m115526b("Key %s from sharedPreferences has type other than float: %s", str, e11.getMessage());
            return C25699g.m132609a();
        }
    }

    /* renamed from: f */
    public C25699g m34124f(String str) {
        if (str == null) {
            f36810c.m115525a("Key is null when getting long value on device cache.");
            return C25699g.m132609a();
        }
        if (this.f36812a == null) {
            m34126i(m34119c());
            if (this.f36812a == null) {
                return C25699g.m132609a();
            }
        }
        if (!this.f36812a.contains(str)) {
            return C25699g.m132609a();
        }
        try {
            return C25699g.m132611e(Long.valueOf(this.f36812a.getLong(str, 0L)));
        } catch (ClassCastException e11) {
            f36810c.m115526b("Key %s from sharedPreferences has type other than long: %s", str, e11.getMessage());
            return C25699g.m132609a();
        }
    }

    /* renamed from: g */
    public C25699g m34125g(String str) {
        if (str == null) {
            f36810c.m115525a("Key is null when getting String value on device cache.");
            return C25699g.m132609a();
        }
        if (this.f36812a == null) {
            m34126i(m34119c());
            if (this.f36812a == null) {
                return C25699g.m132609a();
            }
        }
        if (!this.f36812a.contains(str)) {
            return C25699g.m132609a();
        }
        try {
            return C25699g.m132611e(this.f36812a.getString(str, ""));
        } catch (ClassCastException e11) {
            f36810c.m115526b("Key %s from sharedPreferences has type other than String: %s", str, e11.getMessage());
            return C25699g.m132609a();
        }
    }

    /* renamed from: i */
    public synchronized void m34126i(final Context context) {
        if (this.f36812a == null && context != null) {
            this.f36813b.execute(new Runnable() { // from class: com.google.firebase.perf.config.w
                @Override // java.lang.Runnable
                public final void run() {
                    C6685x.this.m34121h(context);
                }
            });
        }
    }

    /* renamed from: j */
    public boolean m34127j(String str, float f11) {
        if (str == null) {
            f36810c.m115525a("Key is null when setting float value on device cache.");
            return false;
        }
        if (this.f36812a == null) {
            m34126i(m34119c());
            if (this.f36812a == null) {
                return false;
            }
        }
        this.f36812a.edit().putFloat(str, f11).apply();
        return true;
    }

    /* renamed from: k */
    public boolean m34128k(String str, long j11) {
        if (str == null) {
            f36810c.m115525a("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.f36812a == null) {
            m34126i(m34119c());
            if (this.f36812a == null) {
                return false;
            }
        }
        this.f36812a.edit().putLong(str, j11).apply();
        return true;
    }

    /* renamed from: l */
    public boolean m34129l(String str, String str2) {
        if (str == null) {
            f36810c.m115525a("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.f36812a == null) {
            m34126i(m34119c());
            if (this.f36812a == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.f36812a.edit().remove(str).apply();
            return true;
        }
        this.f36812a.edit().putString(str, str2).apply();
        return true;
    }

    /* renamed from: m */
    public boolean m34130m(String str, boolean z11) {
        if (str == null) {
            f36810c.m115525a("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.f36812a == null) {
            m34126i(m34119c());
            if (this.f36812a == null) {
                return false;
            }
        }
        this.f36812a.edit().putBoolean(str, z11).apply();
        return true;
    }
}
