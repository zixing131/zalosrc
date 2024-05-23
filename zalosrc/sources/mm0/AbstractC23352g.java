package mm0;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: mm0.g */
/* loaded from: classes.dex */
public abstract class AbstractC23352g {
    /* renamed from: a */
    public static String m122785a(File file) {
        try {
            return m122786b(new FileInputStream(file));
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m122786b(InputStream inputStream) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[8192];
            while (true) {
                try {
                    try {
                        int read = inputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        messageDigest.update(bArr, 0, read);
                    } catch (IOException e11) {
                        throw new RuntimeException("Unable to process file for MD5", e11);
                    }
                } catch (Throwable th2) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                    throw th2;
                }
            }
            String replace = String.format("%32s", new BigInteger(1, messageDigest.digest()).toString(16)).replace(' ', '0');
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
            return replace;
        } catch (NoSuchAlgorithmException unused3) {
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m122787c(String str, File file) {
        String m122785a;
        if (str == null || str.length() == 0 || file == null || (m122785a = m122785a(file)) == null) {
            return false;
        }
        return m122785a.equalsIgnoreCase(str);
    }

    /* renamed from: d */
    public static String m122788d(String str) {
        String str2 = "";
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            for (byte b11 : digest) {
                String hexString = Integer.toHexString(b11 & 255);
                if (hexString.length() == 1) {
                    str2 = str2 + "0" + hexString;
                } else {
                    str2 = str2 + hexString;
                }
            }
        } catch (NoSuchAlgorithmException unused) {
        }
        return str2;
    }
}
