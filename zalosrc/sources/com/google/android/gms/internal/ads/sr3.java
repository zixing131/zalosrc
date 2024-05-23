package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class sr3 {

    /* renamed from: a */
    private final ECPublicKey f27828a;

    public sr3(ECPublicKey eCPublicKey) {
        this.f27828a = eCPublicKey;
    }

    /* renamed from: a */
    public final rr3 m26391a(String str, byte[] bArr, byte[] bArr2, int i11, int i12) {
        KeyPair m26719c = tr3.m26719c(this.f27828a.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) m26719c.getPublic();
        byte[] m26723g = tr3.m26723g((ECPrivateKey) m26719c.getPrivate(), this.f27828a);
        byte[] m26728l = tr3.m26728l(eCPublicKey.getParams().getCurve(), i12, eCPublicKey.getW());
        int i13 = 1;
        byte[] m23728c = jr3.m23728c(m26728l, m26723g);
        Mac mac = (Mac) vr3.f29468f.m27341a(str);
        if (i11 <= mac.getMacLength() * 255) {
            if (bArr != null && bArr.length != 0) {
                mac.init(new SecretKeySpec(bArr, str));
            } else {
                mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
            }
            byte[] doFinal = mac.doFinal(m23728c);
            byte[] bArr3 = new byte[i11];
            mac.init(new SecretKeySpec(doFinal, str));
            byte[] bArr4 = new byte[0];
            int i14 = 0;
            while (true) {
                mac.update(bArr4);
                mac.update(bArr2);
                mac.update((byte) i13);
                bArr4 = mac.doFinal();
                int length = bArr4.length;
                int i15 = i14 + length;
                if (i15 < i11) {
                    System.arraycopy(bArr4, 0, bArr3, i14, length);
                    i13++;
                    i14 = i15;
                } else {
                    System.arraycopy(bArr4, 0, bArr3, i14, i11 - i14);
                    return new rr3(m26728l, bArr3);
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }
}
