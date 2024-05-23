package pe0;

import android.text.TextUtils;
import com.zing.zalo.utils.cryptology.Utils;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.utils.cryptology.CoreUtils;
import gm0.AbstractC19512f;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: pe0.a */
/* loaded from: classes.dex */
public abstract class AbstractC24743a {

    /* renamed from: a */
    private static String f118819a;

    /* renamed from: a */
    public static void m128499a() {
        synchronized (AbstractC24743a.class) {
            f118819a = null;
        }
    }

    /* renamed from: b */
    public static String m128500b() {
        try {
            synchronized (AbstractC24743a.class) {
                try {
                    if (f118819a == null && !TextUtils.isEmpty(CoreUtility.f89233i)) {
                        SecretKeySpec secretKeySpec = new SecretKeySpec(Utils.m89297a(3), "AES/CBC/PKCS5Padding");
                        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                        cipher.init(1, secretKeySpec, new IvParameterSpec(CoreUtils.m93448c()));
                        f118819a = AbstractC19512f.m101985d(cipher.doFinal(CoreUtility.f89233i.getBytes("utf-8")));
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return f118819a;
    }
}
