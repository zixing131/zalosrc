package p438q5;

import android.util.Base64;
import java.util.Random;

/* renamed from: q5.b */
/* loaded from: classes2.dex */
public abstract class AbstractC25122b {

    /* renamed from: a */
    private static final Random f120650a = new Random();

    /* renamed from: a */
    public static String m130215a() {
        byte[] bArr = new byte[16];
        f120650a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
