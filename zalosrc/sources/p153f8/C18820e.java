package p153f8;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import p232i8.AbstractC20395h;

/* renamed from: f8.e */
/* loaded from: classes.dex */
public class C18820e {

    /* renamed from: a */
    private final Context f94101a;

    /* renamed from: b */
    private b f94102b = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f8.e$b */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a */
        private final String f94103a;

        /* renamed from: b */
        private final String f94104b;

        private b() {
            int m106222r = AbstractC20395h.m106222r(C18820e.this.f94101a, "com.google.firebase.crashlytics.unity_version", "string");
            if (m106222r != 0) {
                this.f94103a = "Unity";
                String string = C18820e.this.f94101a.getResources().getString(m106222r);
                this.f94104b = string;
                C18821f.m98795f().m98802i("Unity Editor version is: " + string);
                return;
            }
            if (!C18820e.this.m98787c("flutter_assets/NOTICES.Z")) {
                this.f94103a = null;
                this.f94104b = null;
            } else {
                this.f94103a = "Flutter";
                this.f94104b = null;
                C18821f.m98795f().m98802i("Development platform is: Flutter");
            }
        }
    }

    public C18820e(Context context) {
        this.f94101a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public boolean m98787c(String str) {
        if (this.f94101a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.f94101a.getAssets().open(str);
            if (open != null) {
                open.close();
                return true;
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: f */
    private b m98788f() {
        if (this.f94102b == null) {
            this.f94102b = new b();
        }
        return this.f94102b;
    }

    /* renamed from: g */
    public static boolean m98789g(Context context) {
        if (AbstractC20395h.m106222r(context, "com.google.firebase.crashlytics.unity_version", "string") != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public String m98790d() {
        return m98788f().f94103a;
    }

    /* renamed from: e */
    public String m98791e() {
        return m98788f().f94104b;
    }
}
