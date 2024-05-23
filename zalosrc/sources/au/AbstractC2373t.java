package au;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.zing.zalo.C8937j0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalo.utils.cryptology.Utils;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.utils.cryptology.CoreUtils;
import gm0.AbstractC19512f;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import me0.AbstractC23044d5;
import p248iy.AbstractC20887g;

/* renamed from: au.t */
/* loaded from: classes.dex */
public abstract class AbstractC2373t {

    /* renamed from: a */
    private static String f9917a;

    /* renamed from: b */
    private static String f9918b;

    /* renamed from: c */
    private static String f9919c;

    /* renamed from: d */
    private static String f9920d;

    /* renamed from: a */
    private static String m12403a(Context context) {
        try {
            if (!C8937j0.m47663l("ads_id_get_info_on_create_zcid")) {
                return "0";
            }
            String id2 = AbstractC2339c.m12299c(context, new SensitiveData("ads_id_get_info_on_create_zcid", "ads_id")).getId();
            if (id2 == null) {
                return "0";
            }
            return id2;
        } catch (Throwable th2) {
            AbstractC20110a.m104539h(th2);
            return "0";
        }
    }

    /* renamed from: b */
    public static String m12404b(Context context) {
        String str = null;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                str = telephonyManager.getDeviceId();
            }
        } catch (Throwable th2) {
            AbstractC20110a.m104539h(th2);
        }
        if (str == null) {
            return "0";
        }
        return str;
    }

    /* renamed from: c */
    public static String m12405c() {
        m12409g();
        return f9920d;
    }

    /* renamed from: d */
    public static String m12406d() {
        String str = Build.MODEL;
        if (str == null) {
            return "0";
        }
        return str.replace(',', ' ');
    }

    /* renamed from: e */
    public static String m12407e(Context context) {
        String str;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                str = null;
            } else {
                str = telephonyManager.getSimSerialNumber();
            }
        } catch (Throwable th2) {
            AbstractC20110a.m104539h(th2);
            str = Build.SERIAL;
        }
        if (str == null) {
            return "0";
        }
        return str;
    }

    /* renamed from: f */
    public static String m12408f() {
        m12409g();
        return f9919c;
    }

    /* renamed from: g */
    public static String m12409g() {
        String str = f9918b;
        if (str != null) {
            return str;
        }
        try {
            String m12410h = m12410h();
            if (m12410h == null) {
                m12410h = "null";
            }
            f9920d = m12410h;
            SecretKeySpec secretKeySpec = new SecretKeySpec(Utils.m89297a(3), "AES/CBC/PKCS5Padding");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, new IvParameterSpec(CoreUtils.m93448c()));
            f9919c = AbstractC19512f.m101985d(cipher.doFinal(m12410h.getBytes(StandardCharsets.UTF_8)));
            f9918b = "1_" + f9919c;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return f9918b;
    }

    /* renamed from: h */
    public static synchronized String m12410h() {
        String str;
        synchronized (AbstractC2373t.class) {
            if (f9917a == null) {
                File m93450e = CoreUtils.m93450e();
                try {
                    if (!m93450e.exists()) {
                        m12413k(m93450e);
                    }
                    try {
                        f9917a = m12411i(m93450e);
                    } catch (IOException e11) {
                        AbstractC20110a.m104539h(e11);
                        if (m93450e.delete()) {
                            m12413k(m93450e);
                            f9917a = m12411i(m93450e);
                        }
                    }
                } catch (Throwable th2) {
                    AbstractC20110a.m104539h(th2);
                    try {
                        m93450e.delete();
                    } catch (Exception e12) {
                        AbstractC20110a.m104539h(e12);
                    }
                    AbstractC20887g.m109240r(123500, th2.toString());
                }
            }
            str = f9917a;
        }
        return str;
    }

    /* renamed from: i */
    private static String m12411i(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr);
            String str = new String(bArr, StandardCharsets.UTF_8);
            randomAccessFile.close();
            return str;
        } catch (Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: j */
    public static void m12412j() {
        try {
            File m93450e = CoreUtils.m93450e();
            m93450e.delete();
            m93450e.deleteOnExit();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        f9917a = null;
        f9920d = null;
        f9919c = null;
        f9918b = null;
    }

    /* renamed from: k */
    private static void m12413k(File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write((m12404b(CoreUtility.getAppContext()) + "," + m12407e(CoreUtility.getAppContext()) + "," + m12406d() + "," + System.currentTimeMillis() + "," + m12403a(CoreUtility.getAppContext())).getBytes(StandardCharsets.UTF_8));
            fileOutputStream.close();
            AbstractC23044d5.m118231d(CoreUtility.getAppContext(), EnumC16739a.f84885b0);
            CoreUtils.m93452g(file.getPath());
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
