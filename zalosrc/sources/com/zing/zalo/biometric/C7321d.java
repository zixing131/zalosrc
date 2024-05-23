package com.zing.zalo.biometric;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.os.Build;
import androidx.core.hardware.fingerprint.C1433a;

/* renamed from: com.zing.zalo.biometric.d */
/* loaded from: classes3.dex */
public class C7321d {

    /* renamed from: a */
    private final C1433a f40062a;

    /* renamed from: b */
    private final BiometricManager f40063b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.biometric.d$a */
    /* loaded from: classes3.dex */
    public static class a {
        /* renamed from: a */
        static int m37308a(BiometricManager biometricManager) {
            int canAuthenticate;
            canAuthenticate = biometricManager.canAuthenticate();
            return canAuthenticate;
        }

        /* renamed from: b */
        static BiometricManager m37309b(Context context) {
            Object systemService;
            systemService = context.getSystemService((Class<Object>) AbstractC7316b.m37302a());
            return AbstractC7319c.m37304a(systemService);
        }
    }

    /* renamed from: com.zing.zalo.biometric.d$b */
    /* loaded from: classes3.dex */
    private static class b {
        /* renamed from: a */
        static int m37310a(BiometricManager biometricManager, int i11) {
            int canAuthenticate;
            canAuthenticate = biometricManager.canAuthenticate(i11);
            return canAuthenticate;
        }
    }

    private C7321d(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f40063b = a.m37309b(context);
        } else {
            this.f40063b = null;
        }
        this.f40062a = C1433a.m7309b(context);
    }

    /* renamed from: c */
    public static C7321d m37305c(Context context) {
        return new C7321d(context);
    }

    /* renamed from: a */
    public int m37306a(boolean z11) {
        if (!z11 && Build.VERSION.SDK_INT >= 29) {
            return a.m37308a(this.f40063b);
        }
        if (!this.f40062a.m7316e()) {
            return 12;
        }
        if (!this.f40062a.m7315d()) {
            return 11;
        }
        return 0;
    }

    /* renamed from: b */
    public int m37307b(int i11) {
        if (Build.VERSION.SDK_INT >= 30) {
            return b.m37310a(this.f40063b, i11);
        }
        return m37306a(false);
    }
}
