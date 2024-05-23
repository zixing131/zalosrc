package vj0;

import java.nio.charset.StandardCharsets;

/* renamed from: vj0.b */
/* loaded from: classes7.dex */
public abstract class AbstractC28268b {
    /* renamed from: a */
    public static String m142406a(String str) {
        if (str == null) {
            return "";
        }
        try {
            return new String(str.getBytes(StandardCharsets.UTF_8));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m142407b(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            return new String(bArr, StandardCharsets.UTF_8);
        } catch (Exception unused) {
            return null;
        }
    }
}
