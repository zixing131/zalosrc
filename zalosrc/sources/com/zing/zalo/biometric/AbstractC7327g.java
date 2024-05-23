package com.zing.zalo.biometric;

import android.hardware.biometrics.BiometricPrompt;
import javax.crypto.Cipher;

/* renamed from: com.zing.zalo.biometric.g */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC7327g {
    /* renamed from: a */
    public static /* synthetic */ BiometricPrompt.CryptoObject m37336a(Cipher cipher) {
        return new BiometricPrompt.CryptoObject(cipher);
    }
}
