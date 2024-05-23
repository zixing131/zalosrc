package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.w0 */
/* loaded from: classes.dex */
public final class C6651w0 {

    /* renamed from: d */
    private static WeakReference f36722d;

    /* renamed from: a */
    private final SharedPreferences f36723a;

    /* renamed from: b */
    private C6643s0 f36724b;

    /* renamed from: c */
    private final Executor f36725c;

    private C6651w0(SharedPreferences sharedPreferences, Executor executor) {
        this.f36725c = executor;
        this.f36723a = sharedPreferences;
    }

    /* renamed from: a */
    public static synchronized C6651w0 m33969a(Context context, Executor executor) {
        C6651w0 c6651w0;
        synchronized (C6651w0.class) {
            try {
                WeakReference weakReference = f36722d;
                if (weakReference != null) {
                    c6651w0 = (C6651w0) weakReference.get();
                } else {
                    c6651w0 = null;
                }
                if (c6651w0 == null) {
                    c6651w0 = new C6651w0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                    c6651w0.m33970c();
                    f36722d = new WeakReference(c6651w0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6651w0;
    }

    /* renamed from: c */
    private synchronized void m33970c() {
        this.f36724b = C6643s0.m33940c(this.f36723a, "topic_operation_queue", ",", this.f36725c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized C6649v0 m33971b() {
        return C6649v0.m33963a(this.f36724b.m33944e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized boolean m33972d(C6649v0 c6649v0) {
        return this.f36724b.m33945f(c6649v0.m33967e());
    }
}
