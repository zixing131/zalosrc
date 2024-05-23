package com.zing.zalo.biometric;

import android.hardware.biometrics.BiometricPrompt;
import java.security.Signature;

/* renamed from: com.zing.zalo.biometric.h */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC7329h {
    /* renamed from: a */
    public static /* synthetic */ BiometricPrompt.CryptoObject m37337a(Signature signature) {
        return new BiometricPrompt.CryptoObject(signature);
    }
}
