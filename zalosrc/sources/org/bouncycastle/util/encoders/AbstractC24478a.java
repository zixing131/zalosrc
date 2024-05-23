package org.bouncycastle.util.encoders;

import do0.C18037b;
import do0.InterfaceC18036a;
import java.io.ByteArrayOutputStream;

/* renamed from: org.bouncycastle.util.encoders.a */
/* loaded from: classes7.dex */
public abstract class AbstractC24478a {

    /* renamed from: a */
    private static final InterfaceC18036a f118032a = new C18037b();

    /* renamed from: a */
    public static byte[] m127816a(byte[] bArr) {
        return m127817b(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static byte[] m127817b(byte[] bArr, int i11, int i12) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f118032a.mo95893a(bArr, i11, i12, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e11) {
            throw new EncoderException("exception encoding Hex string: " + e11.getMessage(), e11);
        }
    }
}
