package me0;

import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17522a;
import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: me0.l0 */
/* loaded from: classes4.dex */
public abstract class AbstractC23127l0 {
    /* renamed from: a */
    public static byte[] m118630a(byte[] bArr, byte[] bArr2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            UUID m118021b = AbstractC23020b3.m118021b(CoreUtility.getAppContext());
            messageDigest.update(m118021b.toString().getBytes());
            messageDigest.update(bArr2);
            long leastSignificantBits = m118021b.getLeastSignificantBits() ^ m118021b.getMostSignificantBits();
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, cipher.getBlockSize());
            if (leastSignificantBits == AbstractC17522a.m93341d(bArr, copyOfRange.length)) {
                cipher.init(2, new SecretKeySpec(messageDigest.digest(), "AES/CBC/PKCS5Padding"), new IvParameterSpec(copyOfRange));
                int length = copyOfRange.length + 8;
                return cipher.doFinal(bArr, length, bArr.length - length);
            }
            throw new InvalidKeyException("application key changed");
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m118631b(byte[] bArr, byte[] bArr2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            UUID m118021b = AbstractC23020b3.m118021b(CoreUtility.getAppContext());
            messageDigest.update(m118021b.toString().getBytes());
            messageDigest.update(bArr2);
            long leastSignificantBits = m118021b.getLeastSignificantBits() ^ m118021b.getMostSignificantBits();
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            SecureRandom secureRandom = new SecureRandom();
            byte[] bArr3 = new byte[cipher.getBlockSize()];
            secureRandom.nextBytes(bArr3);
            cipher.init(1, new SecretKeySpec(messageDigest.digest(), "AES/CBC/PKCS5Padding"), new IvParameterSpec(bArr3));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(bArr3);
            byteArrayOutputStream.write(AbstractC17522a.m93346i(leastSignificantBits));
            byteArrayOutputStream.write(cipher.doFinal(bArr));
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }
}
