package p334lz;

import com.zing.zalo.leveldb.exception.LevelDBException;
import fn0.AbstractC19074t;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: lz.a */
/* loaded from: classes4.dex */
public abstract class AbstractC22689a {
    /* renamed from: a */
    public static final byte[] m117353a(boolean z11) {
        return new byte[]{1, z11 ? (byte) 1 : (byte) 0};
    }

    /* renamed from: b */
    public static final byte[] m117354b(double d11) {
        long doubleToRawLongBits = Double.doubleToRawLongBits(d11);
        return new byte[]{5, (byte) (doubleToRawLongBits & 255), (byte) ((doubleToRawLongBits >>> 8) & 255), (byte) ((doubleToRawLongBits >>> 16) & 255), (byte) ((doubleToRawLongBits >>> 24) & 255), (byte) ((doubleToRawLongBits >>> 32) & 255), (byte) ((doubleToRawLongBits >>> 40) & 255), (byte) ((doubleToRawLongBits >>> 48) & 255), (byte) ((doubleToRawLongBits >>> 56) & 255)};
    }

    /* renamed from: c */
    public static final byte[] m117355c(int i11) {
        return new byte[]{2, (byte) (i11 & 255), (byte) ((i11 >>> 8) & 255), (byte) ((i11 >>> 16) & 255), (byte) ((i11 >>> 24) & 255)};
    }

    /* renamed from: d */
    public static final byte[] m117356d(long j11) {
        return new byte[]{3, (byte) (j11 & 255), (byte) ((j11 >>> 8) & 255), (byte) ((j11 >>> 16) & 255), (byte) ((j11 >>> 24) & 255), (byte) ((j11 >>> 32) & 255), (byte) ((j11 >>> 40) & 255), (byte) ((j11 >>> 48) & 255), (byte) ((j11 >>> 56) & 255)};
    }

    /* renamed from: e */
    public static final byte[] m117357e(String str) {
        AbstractC19074t.m100208f(str, "value");
        Charset charset = StandardCharsets.UTF_8;
        AbstractC19074t.m100207e(charset, "UTF_8");
        byte[] bytes = str.getBytes(charset);
        AbstractC19074t.m100207e(bytes, "this as java.lang.String).getBytes(charset)");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(4);
        try {
            byteArrayOutputStream.write(bytes);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            AbstractC19074t.m100207e(byteArray, "{\n        bos.write(utf8Data)\n        bos.toByteArray()\n    }");
            return byteArray;
        } catch (IOException e11) {
            AbstractC22691c.m117366c(e11);
            throw new LevelDBException("io exception");
        }
    }
}
