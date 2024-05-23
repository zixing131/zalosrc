package com.zing.zalo.biometric;

import android.hardware.biometrics.BiometricPrompt;
import javax.crypto.Mac;

/* renamed from: com.zing.zalo.biometric.i */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC7331i {
    /* renamed from: a */
    public static /* synthetic */ BiometricPrompt.CryptoObject m37338a(Mac mac) {
        return new BiometricPrompt.CryptoObject(mac);
    }
}
