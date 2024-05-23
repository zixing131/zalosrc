package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* loaded from: classes2.dex */
public abstract class tr3 {
    /* renamed from: a */
    public static int m26717a(EllipticCurve ellipticCurve) {
        return (m26718b(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    /* renamed from: b */
    public static BigInteger m26718b(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    /* renamed from: c */
    public static KeyPair m26719c(ECParameterSpec eCParameterSpec) {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) vr3.f29472j.m27341a("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m26720d(ECPoint eCPoint, EllipticCurve ellipticCurve) {
        BigInteger m26718b = m26718b(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX != null && affineY != null) {
            if (affineX.signum() != -1 && affineX.compareTo(m26718b) < 0) {
                if (affineY.signum() != -1 && affineY.compareTo(m26718b) < 0) {
                    if (affineY.multiply(affineY).mod(m26718b).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(m26718b))) {
                        return;
                    } else {
                        throw new GeneralSecurityException("Point is not on curve");
                    }
                }
                throw new GeneralSecurityException("y is out of range");
            }
            throw new GeneralSecurityException("x is out of range");
        }
        throw new GeneralSecurityException("point is at infinity");
    }

    /* renamed from: e */
    public static void m26721e(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) {
        m26722f(eCPublicKey, eCPrivateKey);
        m26720d(eCPublicKey.getW(), eCPrivateKey.getParams().getCurve());
    }

    /* renamed from: f */
    static void m26722f(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) {
        try {
            ECParameterSpec params = eCPublicKey.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            if (params.getCurve().equals(params2.getCurve()) && params.getGenerator().equals(params2.getGenerator()) && params.getOrder().equals(params2.getOrder()) && params.getCofactor() == params2.getCofactor()) {
            } else {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException e11) {
            e = e11;
            throw new GeneralSecurityException(e);
        } catch (NullPointerException e12) {
            e = e12;
            throw new GeneralSecurityException(e);
        }
    }

    /* renamed from: g */
    public static byte[] m26723g(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        m26722f(eCPublicKey, eCPrivateKey);
        ECPoint w11 = eCPublicKey.getW();
        m26720d(w11, eCPrivateKey.getParams().getCurve());
        PublicKey generatePublic = ((KeyFactory) vr3.f29473k.m27341a("EC")).generatePublic(new ECPublicKeySpec(w11, eCPrivateKey.getParams()));
        KeyAgreement keyAgreement = (KeyAgreement) vr3.f29471i.m27341a("ECDH");
        keyAgreement.init(eCPrivateKey);
        try {
            keyAgreement.doPhase(generatePublic, true);
            byte[] generateSecret = keyAgreement.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, generateSecret);
            if (bigInteger.signum() != -1 && bigInteger.compareTo(m26718b(curve)) < 0) {
                BigInteger m26718b = m26718b(curve);
                BigInteger mod = bigInteger.multiply(bigInteger).add(curve.getA()).multiply(bigInteger).add(curve.getB()).mod(m26718b);
                if (m26718b.signum() == 1) {
                    BigInteger mod2 = mod.mod(m26718b);
                    BigInteger bigInteger2 = BigInteger.ZERO;
                    if (!mod2.equals(bigInteger2)) {
                        if (m26718b.testBit(0) && m26718b.testBit(1)) {
                            bigInteger2 = mod2.modPow(m26718b.add(BigInteger.ONE).shiftRight(2), m26718b);
                        } else if (m26718b.testBit(0) && !m26718b.testBit(1)) {
                            bigInteger2 = BigInteger.ONE;
                            BigInteger shiftRight = m26718b.subtract(bigInteger2).shiftRight(1);
                            int i11 = 0;
                            while (true) {
                                BigInteger mod3 = bigInteger2.multiply(bigInteger2).subtract(mod2).mod(m26718b);
                                if (mod3.equals(BigInteger.ZERO)) {
                                    break;
                                }
                                BigInteger modPow = mod3.modPow(shiftRight, m26718b);
                                BigInteger bigInteger3 = BigInteger.ONE;
                                if (modPow.add(bigInteger3).equals(m26718b)) {
                                    BigInteger shiftRight2 = m26718b.add(bigInteger3).shiftRight(1);
                                    BigInteger bigInteger4 = bigInteger2;
                                    for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                        BigInteger multiply = bigInteger4.multiply(bigInteger3);
                                        bigInteger4 = bigInteger4.multiply(bigInteger4).add(bigInteger3.multiply(bigInteger3).mod(m26718b).multiply(mod3)).mod(m26718b);
                                        bigInteger3 = multiply.add(multiply).mod(m26718b);
                                        if (shiftRight2.testBit(bitLength)) {
                                            BigInteger mod4 = bigInteger4.multiply(bigInteger2).add(bigInteger3.multiply(mod3)).mod(m26718b);
                                            bigInteger3 = bigInteger2.multiply(bigInteger3).add(bigInteger4).mod(m26718b);
                                            bigInteger4 = mod4;
                                        }
                                    }
                                    bigInteger2 = bigInteger4;
                                } else if (modPow.equals(bigInteger3)) {
                                    bigInteger2 = bigInteger2.add(bigInteger3);
                                    i11++;
                                    if (i11 == 128 && !m26718b.isProbablePrime(80)) {
                                        throw new InvalidAlgorithmParameterException("p is not prime");
                                    }
                                } else {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                            }
                        } else {
                            bigInteger2 = null;
                        }
                        if (bigInteger2 != null && bigInteger2.multiply(bigInteger2).mod(m26718b).compareTo(mod2) != 0) {
                            throw new GeneralSecurityException("Could not find a modular square root");
                        }
                    }
                    if (!bigInteger2.testBit(0)) {
                        m26718b.subtract(bigInteger2).mod(m26718b);
                    }
                    return generateSecret;
                }
                throw new InvalidAlgorithmParameterException("p must be positive");
            }
            throw new GeneralSecurityException("shared secret is out of range");
        } catch (IllegalStateException e11) {
            throw new GeneralSecurityException(e11);
        }
    }

    /* renamed from: h */
    public static ECPrivateKey m26724h(int i11, byte[] bArr) {
        return (ECPrivateKey) ((KeyFactory) vr3.f29473k.m27341a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), m26727k(i11)));
    }

    /* renamed from: i */
    public static ECPublicKey m26725i(int i11, byte[] bArr, byte[] bArr2) {
        ECParameterSpec m26727k = m26727k(i11);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        m26720d(eCPoint, m26727k.getCurve());
        return (ECPublicKey) ((KeyFactory) vr3.f29473k.m27341a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, m26727k));
    }

    /* renamed from: j */
    public static ECPublicKey m26726j(ECParameterSpec eCParameterSpec, int i11, byte[] bArr) {
        EllipticCurve curve = eCParameterSpec.getCurve();
        int m26717a = m26717a(curve);
        int length = bArr.length;
        if (length == m26717a + m26717a + 1) {
            if (bArr[0] == 4) {
                int i12 = m26717a + 1;
                ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i12)), new BigInteger(1, Arrays.copyOfRange(bArr, i12, length)));
                m26720d(eCPoint, curve);
                return (ECPublicKey) ((KeyFactory) vr3.f29473k.m27341a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpec));
            }
            throw new GeneralSecurityException("invalid point format");
        }
        throw new GeneralSecurityException("invalid point size");
    }

    /* renamed from: k */
    public static ECParameterSpec m26727k(int i11) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 1) {
                return m26729m("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
            }
            return m26729m("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
        }
        return m26729m("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
    }

    /* renamed from: l */
    public static byte[] m26728l(EllipticCurve ellipticCurve, int i11, ECPoint eCPoint) {
        m26720d(eCPoint, ellipticCurve);
        int m26717a = m26717a(ellipticCurve);
        int i12 = i11 - 1;
        if (i12 != 0) {
            byte b11 = 2;
            if (i12 != 2) {
                int i13 = m26717a + 1;
                byte[] bArr = new byte[i13];
                byte[] byteArray = eCPoint.getAffineX().toByteArray();
                int length = byteArray.length;
                System.arraycopy(byteArray, 0, bArr, i13 - length, length);
                if (true == eCPoint.getAffineY().testBit(0)) {
                    b11 = 3;
                }
                bArr[0] = b11;
                return bArr;
            }
            int i14 = m26717a + m26717a;
            byte[] bArr2 = new byte[i14];
            byte[] byteArray2 = eCPoint.getAffineX().toByteArray();
            int length2 = byteArray2.length;
            if (length2 > m26717a) {
                byteArray2 = Arrays.copyOfRange(byteArray2, length2 - m26717a, length2);
            }
            byte[] byteArray3 = eCPoint.getAffineY().toByteArray();
            int length3 = byteArray3.length;
            if (length3 > m26717a) {
                byteArray3 = Arrays.copyOfRange(byteArray3, length3 - m26717a, length3);
            }
            int length4 = byteArray3.length;
            System.arraycopy(byteArray3, 0, bArr2, i14 - length4, length4);
            int length5 = byteArray2.length;
            System.arraycopy(byteArray2, 0, bArr2, m26717a - length5, length5);
            return bArr2;
        }
        int i15 = m26717a + m26717a + 1;
        byte[] bArr3 = new byte[i15];
        byte[] byteArray4 = eCPoint.getAffineX().toByteArray();
        byte[] byteArray5 = eCPoint.getAffineY().toByteArray();
        int length6 = byteArray5.length;
        System.arraycopy(byteArray5, 0, bArr3, i15 - length6, length6);
        int length7 = byteArray4.length;
        System.arraycopy(byteArray4, 0, bArr3, (m26717a + 1) - length7, length7);
        bArr3[0] = 4;
        return bArr3;
    }

    /* renamed from: m */
    private static ECParameterSpec m26729m(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }
}
