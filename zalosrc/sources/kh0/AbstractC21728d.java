package kh0;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;
import java.util.zip.GZIPInputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: kh0.d */
/* loaded from: classes7.dex */
abstract class AbstractC21728d {

    /* renamed from: a */
    private static String f105512a = "ZALO";

    /* renamed from: b */
    private static String f105513b = "zalo@123";

    /* renamed from: a */
    private static byte[] m112147a(byte[] bArr) {
        return m112151e(new GZIPInputStream(new ByteArrayInputStream(bArr))).toByteArray();
    }

    /* renamed from: b */
    private static byte[] m112148b(String str, String str2, String str3) {
        String str4 = str3 + str2;
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(str4.getBytes());
        SecretKeySpec secretKeySpec = new SecretKeySpec(messageDigest.digest(), "AES");
        byte[] m112150d = m112150d(str);
        Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
        cipher.init(2, secretKeySpec);
        return cipher.doFinal(m112150d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m112149c(String str) {
        return new String(m112147a(m112148b(str, f105512a, f105513b)));
    }

    /* renamed from: d */
    private static byte[] m112150d(String str) {
        if (str != null && str.length() % 2 == 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i11 = 0;
            while (i11 < str.length()) {
                int i12 = i11 + 2;
                byteArrayOutputStream.write((byte) Integer.parseInt(str.substring(i11, i12), 16));
                i11 = i12;
            }
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalArgumentException("Invalid hex string :" + str);
    }

    /* renamed from: e */
    private static ByteArrayOutputStream m112151e(GZIPInputStream gZIPInputStream) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = gZIPInputStream.read(bArr);
            if (read > 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                gZIPInputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream;
            }
        }
    }
}
