package me0;

import au.AbstractC2371s;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import on0.C24321d;
import org.json.JSONObject;

/* renamed from: me0.u4 */
/* loaded from: classes4.dex */
public abstract class AbstractC23230u4 {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final JSONObject m119711b(File file, String str) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            AbstractC19074t.m100205c(str);
            byte[] bytes = str.getBytes(C24321d.f117408b);
            AbstractC19074t.m100207e(bytes, "getBytes(...)");
            cipher.init(2, new SecretKeySpec(bytes, "AES/CBC/PKCS5Padding"), new IvParameterSpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
            FileInputStream fileInputStream = new FileInputStream(file);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new CipherInputStream(fileInputStream, cipher));
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = gZIPInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    gZIPInputStream.close();
                    fileInputStream.close();
                    AbstractC2371s.m12396a(byteArray);
                    AbstractC19074t.m100205c(byteArray);
                    Charset charset = StandardCharsets.UTF_8;
                    AbstractC19074t.m100207e(charset, "UTF_8");
                    String str2 = new String(byteArray, charset);
                    AbstractC20110a.f98889a.mo104548a("MappingDomain read from local: %s", str2);
                    return new JSONObject(str2);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return null;
        }
    }
}
