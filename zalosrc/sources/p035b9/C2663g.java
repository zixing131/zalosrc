package p035b9;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: b9.g */
/* loaded from: classes.dex */
public class C2663g {

    /* renamed from: a */
    private static final byte f10660a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    private static final byte f10661b = Byte.parseByte("00001111", 2);

    /* renamed from: b */
    private static String m13079b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: c */
    private static byte[] m13080c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    /* renamed from: a */
    public String m13081a() {
        byte[] m13080c = m13080c(UUID.randomUUID(), new byte[17]);
        byte b11 = m13080c[0];
        m13080c[16] = b11;
        m13080c[0] = (byte) ((b11 & f10661b) | f10660a);
        return m13079b(m13080c);
    }
}
