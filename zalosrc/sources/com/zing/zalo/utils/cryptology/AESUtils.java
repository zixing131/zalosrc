package com.zing.zalo.utils.cryptology;

import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalocore.CoreUtility;
import gm0.AbstractC19512f;
import gm0.C19508b;
import gm0.InterfaceC19510d;
import java.util.Arrays;
import me0.AbstractC23044d5;

/* loaded from: classes.dex */
public class AESUtils {
    /* renamed from: a */
    public static byte[] m89287a(String str, byte[] bArr) {
        InterfaceC19510d m101976m = C19508b.m101976m(AbstractC19512f.m101984c(str));
        int length = bArr.length;
        if (length % 16 != 0) {
            return null;
        }
        byte[] bArr2 = new byte[length];
        int i11 = 0;
        while (true) {
            int i12 = i11 + 16;
            if (i12 <= length) {
                m101976m.m101980b(bArr, i11, bArr2, i11);
                i11 = i12;
            } else {
                return m89289c(bArr2, length);
            }
        }
    }

    /* renamed from: b */
    public static String m89288b(int i11) {
        try {
            AbstractC23044d5.m118231d(CoreUtility.getAppContext(), EnumC16739a.f84885b0);
            return getStaticValue(i11);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    static byte[] m89289c(byte[] bArr, int i11) {
        return Arrays.copyOfRange(bArr, 0, i11 - bArr[i11 - 1]);
    }

    private static native String getStaticValue(int i11);
}
