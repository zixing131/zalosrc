package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* loaded from: classes2.dex */
public final class js3 implements cl3 {

    /* renamed from: a */
    private final ThreadLocal f22981a;

    /* renamed from: b */
    private final String f22982b;

    /* renamed from: c */
    private final Key f22983c;

    /* renamed from: d */
    private final int f22984d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public js3(String str, Key key) {
        char c11;
        int i11;
        is3 is3Var = new is3(this);
        this.f22981a = is3Var;
        if (yg3.m28203a(2)) {
            this.f22982b = str;
            this.f22983c = key;
            if (key.getEncoded().length >= 16) {
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            c11 = 0;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            c11 = 1;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 392315118:
                        if (str.equals("HMACSHA256")) {
                            c11 = 2;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            c11 = 3;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            c11 = 4;
                            break;
                        }
                        c11 = 65535;
                        break;
                    default:
                        c11 = 65535;
                        break;
                }
                if (c11 != 0) {
                    if (c11 != 1) {
                        if (c11 != 2) {
                            if (c11 != 3) {
                                if (c11 == 4) {
                                    i11 = 64;
                                } else {
                                    throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
                                }
                            } else {
                                i11 = 48;
                            }
                        } else {
                            i11 = 32;
                        }
                    } else {
                        i11 = 28;
                    }
                    this.f22984d = i11;
                } else {
                    this.f22984d = 20;
                }
                is3Var.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // com.google.android.gms.internal.ads.cl3
    /* renamed from: a */
    public final byte[] mo20934a(byte[] bArr, int i11) {
        if (i11 <= this.f22984d) {
            ((Mac) this.f22981a.get()).update(bArr);
            return Arrays.copyOf(((Mac) this.f22981a.get()).doFinal(), i11);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
