package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
final class wh3 {

    /* renamed from: a */
    private final String f29929a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public wh3(String str) {
        this.f29929a = str;
    }

    /* renamed from: f */
    private final byte[] m27609f(byte[] bArr, byte[] bArr2, int i11) {
        Mac mac = (Mac) vr3.f29468f.m27341a(this.f29929a);
        if (i11 <= mac.getMacLength() * 255) {
            byte[] bArr3 = new byte[i11];
            mac.init(new SecretKeySpec(bArr, this.f29929a));
            byte[] bArr4 = new byte[0];
            int i12 = 1;
            int i13 = 0;
            while (true) {
                mac.update(bArr4);
                mac.update(bArr2);
                mac.update((byte) i12);
                bArr4 = mac.doFinal();
                int length = bArr4.length;
                int i14 = i13 + length;
                if (i14 < i11) {
                    System.arraycopy(bArr4, 0, bArr3, i13, length);
                    i12++;
                    i13 = i14;
                } else {
                    System.arraycopy(bArr4, 0, bArr3, i13, i11 - i13);
                    return bArr3;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }

    /* renamed from: g */
    private final byte[] m27610g(byte[] bArr, byte[] bArr2) {
        Mac mac = (Mac) vr3.f29468f.m27341a(this.f29929a);
        if (bArr2 != null && bArr2.length != 0) {
            mac.init(new SecretKeySpec(bArr2, this.f29929a));
        } else {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], this.f29929a));
        }
        return mac.doFinal(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final int m27611a() {
        return Mac.getInstance(this.f29929a).getMacLength();
    }

    /* renamed from: b */
    public final byte[] m27612b(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, byte[] bArr4, int i11) {
        return m27609f(m27610g(li3.m24301e("eae_prk", bArr2, bArr4), null), li3.m24302f("shared_secret", bArr3, bArr4, i11), i11);
    }

    /* renamed from: c */
    public final byte[] m27613c() {
        char c11;
        String str = this.f29929a;
        int hashCode = str.hashCode();
        if (hashCode != 984523022) {
            if (hashCode != 984524074) {
                if (hashCode == 984525777 && str.equals("HmacSha512")) {
                    c11 = 2;
                }
                c11 = 65535;
            } else {
                if (str.equals("HmacSha384")) {
                    c11 = 1;
                }
                c11 = 65535;
            }
        } else {
            if (str.equals("HmacSha256")) {
                c11 = 0;
            }
            c11 = 65535;
        }
        if (c11 != 0) {
            if (c11 != 1) {
                if (c11 == 2) {
                    return li3.f23939h;
                }
                throw new GeneralSecurityException("Could not determine HPKE KDF ID");
            }
            return li3.f23938g;
        }
        return li3.f23937f;
    }

    /* renamed from: d */
    public final byte[] m27614d(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i11) {
        return m27609f(bArr, li3.m24302f(str, bArr2, bArr3, i11), i11);
    }

    /* renamed from: e */
    public final byte[] m27615e(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return m27610g(li3.m24301e(str, bArr2, bArr3), bArr);
    }
}
