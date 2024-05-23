package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.sd */
/* loaded from: classes2.dex */
public final class C4979sd {

    /* renamed from: a */
    private static Cipher f27625a;

    /* renamed from: b */
    private static final Object f27626b = new Object();

    /* renamed from: c */
    private static final Object f27627c = new Object();

    public C4979sd(SecureRandom secureRandom) {
    }

    /* renamed from: c */
    private static final Cipher m26274c() {
        Cipher cipher;
        synchronized (f27627c) {
            try {
                if (f27625a == null) {
                    f27625a = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f27625a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cipher;
    }

    /* renamed from: a */
    public final String m26275a(byte[] bArr, byte[] bArr2) {
        byte[] doFinal;
        byte[] iv2;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f27626b) {
                m26274c().init(1, secretKeySpec, (SecureRandom) null);
                doFinal = m26274c().doFinal(bArr2);
                iv2 = m26274c().getIV();
            }
            int length2 = doFinal.length + iv2.length;
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(iv2).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length2];
            allocate.get(bArr3);
            return AbstractC5163xb.m27875a(bArr3, false);
        } catch (InvalidKeyException e11) {
            throw new zzapj(this, e11);
        } catch (NoSuchAlgorithmException e12) {
            throw new zzapj(this, e12);
        } catch (BadPaddingException e13) {
            throw new zzapj(this, e13);
        } catch (IllegalBlockSizeException e14) {
            throw new zzapj(this, e14);
        } catch (NoSuchPaddingException e15) {
            throw new zzapj(this, e15);
        }
    }

    /* renamed from: b */
    public final byte[] m26276b(byte[] bArr, String str) {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] m27876b = AbstractC5163xb.m27876b(str, false);
            int length2 = m27876b.length;
            if (length2 > 16) {
                ByteBuffer allocate = ByteBuffer.allocate(length2);
                allocate.put(m27876b);
                allocate.flip();
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[length2 - 16];
                allocate.get(bArr2);
                allocate.get(bArr3);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (f27626b) {
                    m26274c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                    doFinal = m26274c().doFinal(bArr3);
                }
                return doFinal;
            }
            throw new zzapj(this);
        } catch (IllegalArgumentException e11) {
            throw new zzapj(this, e11);
        } catch (InvalidAlgorithmParameterException e12) {
            throw new zzapj(this, e12);
        } catch (InvalidKeyException e13) {
            throw new zzapj(this, e13);
        } catch (NoSuchAlgorithmException e14) {
            throw new zzapj(this, e14);
        } catch (BadPaddingException e15) {
            throw new zzapj(this, e15);
        } catch (IllegalBlockSizeException e16) {
            throw new zzapj(this, e16);
        } catch (NoSuchPaddingException e17) {
            throw new zzapj(this, e17);
        }
    }
}
