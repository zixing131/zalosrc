package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: com.google.android.gms.internal.measurement.w5 */
/* loaded from: classes.dex */
public abstract class AbstractC5659w5 {

    /* renamed from: a */
    private static UserManager f32882a;

    /* renamed from: b */
    private static volatile boolean f32883b = !m29981b();

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:            if (r4.isUserRunning(android.os.Process.myUserHandle()) == false) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:            r7 = true;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m29980a(Context context) {
        int i11;
        boolean z11;
        boolean isUserUnlocked;
        Object systemService;
        if (m29981b() && !f32883b) {
            synchronized (AbstractC5659w5.class) {
                try {
                    if (!f32883b) {
                        i11 = 1;
                        while (true) {
                            if (i11 <= 2) {
                                if (f32882a == null) {
                                    systemService = context.getSystemService((Class<Object>) UserManager.class);
                                    f32882a = (UserManager) systemService;
                                }
                                UserManager userManager = f32882a;
                                if (userManager != null) {
                                    isUserUnlocked = userManager.isUserUnlocked();
                                    if (isUserUnlocked) {
                                        break;
                                    }
                                } else {
                                    z11 = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        z11 = false;
                        if (z11) {
                            f32882a = null;
                        }
                        if (z11) {
                            f32883b = true;
                        }
                        if (!z11) {
                            return true;
                        }
                    }
                } catch (NullPointerException unused) {
                    f32882a = null;
                    i11++;
                } finally {
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m29981b() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
