package fh0;

import android.app.Application;
import android.content.Context;

/* renamed from: fh0.c */
/* loaded from: classes.dex */
public class C18938c {

    /* renamed from: a */
    private static final Object f94465a = new Object();

    /* renamed from: b */
    private static C18938c f94466b;

    /* renamed from: c */
    private static Application f94467c;

    private C18938c() {
    }

    /* renamed from: b */
    public static C18938c m99237b() {
        C18938c c18938c;
        synchronized (f94465a) {
            try {
                if (f94466b == null) {
                    f94466b = new C18938c();
                }
                c18938c = f94466b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c18938c;
    }

    /* renamed from: c */
    public static void m99238c(Application application) {
        f94467c = application;
    }

    /* renamed from: a */
    public Context m99239a() {
        return f94467c.getApplicationContext();
    }
}
