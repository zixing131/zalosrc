package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.measurement.C5656w2;
import com.google.firebase.installations.C6584c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p230i6.InterfaceC20330v;
import p342m6.AbstractC22894m;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: b */
    private static volatile FirebaseAnalytics f36383b;

    /* renamed from: a */
    private final C5656w2 f36384a;

    public FirebaseAnalytics(C5656w2 c5656w2) {
        AbstractC4205o.m19722k(c5656w2);
        this.f36384a = c5656w2;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f36383b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f36383b == null) {
                        f36383b = new FirebaseAnalytics(C5656w2.m29823t(context, null, null, null, null));
                    }
                } finally {
                }
            }
        }
        return f36383b;
    }

    @Keep
    public static InterfaceC20330v getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C5656w2 m29823t = C5656w2.m29823t(context, null, null, null, bundle);
        if (m29823t == null) {
            return null;
        }
        return new C6537a(m29823t);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) AbstractC22894m.m117600b(C6584c.m33655q().mo13077f(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e11) {
            throw new IllegalStateException(e11);
        } catch (ExecutionException e12) {
            throw new IllegalStateException(e12.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f36384a.m29835e(activity, str, str2);
    }
}
