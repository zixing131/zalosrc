package com.zing.zalo.utils.cryptology;

import android.content.Context;
import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalocore.CoreUtility;
import gm0.AbstractC19512f;
import me0.AbstractC23044d5;

/* loaded from: classes.dex */
public class Utils {
    /* renamed from: a */
    public static byte[] m89297a(int i11) {
        try {
            AbstractC23044d5.m118231d(CoreUtility.getAppContext(), EnumC16739a.f84885b0);
            return getStaticValue(CoreUtility.getAppContext(), i11, AbstractC19512f.m101984c(CoreUtility.f89225a));
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    private static native byte[] getStaticValue(Context context, int i11, byte[] bArr);
}
