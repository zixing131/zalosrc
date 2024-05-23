package me0;

import ag0.C0815e1;
import android.os.SystemClock;
import android.text.TextUtils;
import org.cocos2dx.lib.Cocos2dxRenderer;

/* renamed from: me0.z3 */
/* loaded from: classes4.dex */
public abstract class AbstractC23279z3 {

    /* renamed from: a */
    private static long f113016a = -1;

    /* renamed from: b */
    private static boolean f113017b = false;

    /* renamed from: c */
    private static String f113018c = "";

    /* renamed from: a */
    public static void m120287a(String str) {
        if (f113016a > 0 && !TextUtils.isEmpty(str) && TextUtils.equals(f113018c, str)) {
            if (Cocos2dxRenderer.dismissEffectActive == 0 && !Cocos2dxRenderer.isReceiveActionCloseFromNative) {
                Cocos2dxRenderer.dismissEffectActive = 1;
            }
            C0815e1.m2075D().m2099U(3, 1, 17, String.valueOf(SystemClock.uptimeMillis() - f113016a), String.valueOf(Cocos2dxRenderer.dismissEffectActive), String.valueOf(f113017b ? 1 : 0), String.valueOf(0), f113018c);
        }
        f113016a = -1L;
        f113018c = "";
        f113017b = false;
        Cocos2dxRenderer.dismissEffectActive = 0;
        Cocos2dxRenderer.isReceiveActionCloseFromNative = false;
    }

    /* renamed from: b */
    public static void m120288b(String str, boolean z11) {
        if (!TextUtils.isEmpty(str)) {
            f113018c = str;
            f113017b = z11;
            f113016a = SystemClock.uptimeMillis();
        }
    }
}
