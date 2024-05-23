package com.zing.zalo.biometric;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* renamed from: com.zing.zalo.biometric.b1 */
/* loaded from: classes3.dex */
public abstract class AbstractC7318b1 {
    /* renamed from: a */
    public static void m37303a(Context context) {
        VibrationEffect createOneShot;
        try {
            Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
            if (Build.VERSION.SDK_INT >= 26) {
                createOneShot = VibrationEffect.createOneShot(100, -1);
                vibrator.vibrate(createOneShot);
            } else {
                vibrator.vibrate(100);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
