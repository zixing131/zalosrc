package p291k7;

import android.util.Pair;
import com.google.android.play.core.splitinstall.internal.zzf;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: k7.e1 */
/* loaded from: classes3.dex */
public abstract class AbstractC21500e1 {
    /* renamed from: a */
    public static X509Certificate[][] m111110a(String str) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair m111125c = AbstractC21503f1.m111125c(randomAccessFile);
            if (m111125c != null) {
                ByteBuffer byteBuffer = (ByteBuffer) m111125c.first;
                long longValue = ((Long) m111125c.second).longValue();
                long j11 = (-20) + longValue;
                if (j11 >= 0) {
                    randomAccessFile.seek(j11);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new zzf("ZIP64 APK not supported");
                    }
                }
                long m111123a = AbstractC21503f1.m111123a(byteBuffer);
                if (m111123a < longValue) {
                    if (AbstractC21503f1.m111124b(byteBuffer) + m111123a == longValue) {
                        if (m111123a >= 32) {
                            ByteBuffer allocate = ByteBuffer.allocate(24);
                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                            allocate.order(byteOrder);
                            randomAccessFile.seek(m111123a - allocate.capacity());
                            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                            if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                                int i11 = 0;
                                long j12 = allocate.getLong(0);
                                if (j12 >= allocate.capacity() && j12 <= 2147483639) {
                                    int i12 = (int) (8 + j12);
                                    long j13 = m111123a - i12;
                                    if (j13 >= 0) {
                                        ByteBuffer allocate2 = ByteBuffer.allocate(i12);
                                        allocate2.order(byteOrder);
                                        randomAccessFile.seek(j13);
                                        randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                                        long j14 = allocate2.getLong(0);
                                        if (j14 == j12) {
                                            Pair create = Pair.create(allocate2, Long.valueOf(j13));
                                            ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                                            long longValue2 = ((Long) create.second).longValue();
                                            if (byteBuffer2.order() == byteOrder) {
                                                int capacity = byteBuffer2.capacity() - 24;
                                                if (capacity >= 8) {
                                                    int capacity2 = byteBuffer2.capacity();
                                                    if (capacity <= byteBuffer2.capacity()) {
                                                        int limit = byteBuffer2.limit();
                                                        int position = byteBuffer2.position();
                                                        try {
                                                            byteBuffer2.position(0);
                                                            byteBuffer2.limit(capacity);
                                                            byteBuffer2.position(8);
                                                            ByteBuffer slice = byteBuffer2.slice();
                                                            slice.order(byteBuffer2.order());
                                                            while (slice.hasRemaining()) {
                                                                i11++;
                                                                if (slice.remaining() >= 8) {
                                                                    long j15 = slice.getLong();
                                                                    if (j15 >= 4 && j15 <= 2147483647L) {
                                                                        int i13 = (int) j15;
                                                                        int position2 = slice.position() + i13;
                                                                        if (i13 <= slice.remaining()) {
                                                                            if (slice.getInt() == 1896449818) {
                                                                                X509Certificate[][] m111121l = m111121l(randomAccessFile.getChannel(), new C21491b1(m111114e(slice, i13 - 4), longValue2, m111123a, longValue, byteBuffer, null));
                                                                                randomAccessFile.close();
                                                                                try {
                                                                                    randomAccessFile.close();
                                                                                } catch (IOException unused) {
                                                                                }
                                                                                return m111121l;
                                                                            }
                                                                            slice.position(position2);
                                                                        } else {
                                                                            throw new zzf("APK Signing Block entry #" + i11 + " size out of range: " + i13 + ", available: " + slice.remaining());
                                                                        }
                                                                    } else {
                                                                        throw new zzf("APK Signing Block entry #" + i11 + " size out of range: " + j15);
                                                                    }
                                                                } else {
                                                                    throw new zzf("Insufficient data to read size of APK Signing Block entry #" + i11);
                                                                }
                                                            }
                                                            throw new zzf("No APK Signature Scheme v2 block in APK Signing Block");
                                                        } finally {
                                                            byteBuffer2.position(0);
                                                            byteBuffer2.limit(limit);
                                                            byteBuffer2.position(position);
                                                        }
                                                    }
                                                    throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
                                                }
                                                throw new IllegalArgumentException("end < start: " + capacity + " < 8");
                                            }
                                            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                                        }
                                        throw new zzf("APK Signing Block sizes in header and footer do not match: " + j14 + " vs " + j12);
                                    }
                                    throw new zzf("APK Signing Block offset out of range: " + j13);
                                }
                                throw new zzf("APK Signing Block size out of range: " + j12);
                            }
                            throw new zzf("No APK Signing Block before ZIP Central Directory");
                        }
                        throw new zzf("APK too small for APK Signing Block. ZIP Central Directory offset: " + m111123a);
                    }
                    throw new zzf("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                throw new zzf("ZIP Central Directory offset out of range: " + m111123a + ". ZIP End of Central Directory offset: " + longValue);
            }
            throw new zzf("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
        } catch (Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th2;
        }
    }

    /* renamed from: b */
    private static int m111111b(int i11) {
        if (i11 != 1) {
            if (i11 == 2) {
                return 64;
            }
            throw new IllegalArgumentException("Unknown content digest algorthm: " + i11);
        }
        return 32;
    }

    /* renamed from: c */
    private static int m111112c(int i11) {
        if (i11 != 513) {
            if (i11 != 514) {
                if (i11 != 769) {
                    switch (i11) {
                        case 257:
                        case 259:
                            return 1;
                        case 258:
                        case 260:
                            return 2;
                        default:
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i11))));
                    }
                }
                return 1;
            }
            return 2;
        }
        return 1;
    }

    /* renamed from: d */
    private static String m111113d(int i11) {
        if (i11 != 1) {
            if (i11 == 2) {
                return "SHA-512";
            }
            throw new IllegalArgumentException("Unknown content digest algorthm: " + i11);
        }
        return "SHA-256";
    }

    /* renamed from: e */
    private static ByteBuffer m111114e(ByteBuffer byteBuffer, int i11) {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (i12 >= position && i12 <= limit) {
            byteBuffer.limit(i12);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i12);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        }
        throw new BufferUnderflowException();
    }

    /* renamed from: f */
    private static ByteBuffer m111115f(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= 4) {
            int i11 = byteBuffer.getInt();
            if (i11 >= 0) {
                if (i11 <= byteBuffer.remaining()) {
                    return m111114e(byteBuffer, i11);
                }
                throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i11 + ", remaining: " + byteBuffer.remaining());
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
    }

    /* renamed from: g */
    private static void m111116g(int i11, byte[] bArr, int i12) {
        bArr[1] = (byte) (i11 & 255);
        bArr[2] = (byte) ((i11 >>> 8) & 255);
        bArr[3] = (byte) ((i11 >>> 16) & 255);
        bArr[4] = (byte) (i11 >> 24);
    }

    /* renamed from: h */
    private static void m111117h(Map map, FileChannel fileChannel, long j11, long j12, long j13, ByteBuffer byteBuffer) {
        if (!map.isEmpty()) {
            C21555x0 c21555x0 = new C21555x0(fileChannel, 0L, j11);
            C21555x0 c21555x02 = new C21555x0(fileChannel, j12, j13 - j12);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            AbstractC21503f1.m111126d(duplicate, j11);
            C21486a c21486a = new C21486a(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            Iterator it = map.keySet().iterator();
            int i11 = 0;
            while (it.hasNext()) {
                iArr[i11] = ((Integer) it.next()).intValue();
                i11++;
            }
            try {
                byte[][] m111120k = m111120k(iArr, new InterfaceC21493c0[]{c21555x0, c21555x02, c21486a});
                for (int i12 = 0; i12 < size; i12++) {
                    int i13 = iArr[i12];
                    if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i13)), m111120k[i12])) {
                        throw new SecurityException(m111113d(i13).concat(" digest of contents did not verify"));
                    }
                }
                return;
            } catch (DigestException e11) {
                throw new SecurityException("Failed to compute digest(s) of contents", e11);
            }
        }
        throw new SecurityException("No digests provided");
    }

    /* renamed from: i */
    private static byte[] m111118i(ByteBuffer byteBuffer) {
        int i11 = byteBuffer.getInt();
        if (i11 >= 0) {
            if (i11 <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i11];
                byteBuffer.get(bArr);
                return bArr;
            }
            throw new IOException("Underflow while reading length-prefixed value. Length: " + i11 + ", available: " + byteBuffer.remaining());
        }
        throw new IOException("Negative length");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:            r11 = m111112c(r6);        r12 = m111112c(r7);     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:            if (r11 == 1) goto L144;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:            if (r12 == 1) goto L141;     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static X509Certificate[] m111119j(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) {
        String str;
        Pair create;
        ByteBuffer m111115f = m111115f(byteBuffer);
        ByteBuffer m111115f2 = m111115f(byteBuffer);
        byte[] m111118i = m111118i(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        byte[] bArr2 = null;
        int i11 = -1;
        int i12 = 0;
        while (m111115f2.hasRemaining()) {
            i12++;
            try {
                ByteBuffer m111115f3 = m111115f(m111115f2);
                if (m111115f3.remaining() >= 8) {
                    int i13 = m111115f3.getInt();
                    arrayList.add(Integer.valueOf(i13));
                    if (i13 != 513 && i13 != 514 && i13 != 769) {
                        switch (i13) {
                            case 257:
                            case 258:
                            case 259:
                            case 260:
                                break;
                            default:
                                continue;
                        }
                    }
                    bArr2 = m111118i(m111115f3);
                    i11 = i13;
                } else {
                    throw new SecurityException("Signature record too short");
                }
            } catch (IOException e11) {
                e = e11;
                throw new SecurityException("Failed to parse signature record #" + i12, e);
            } catch (BufferUnderflowException e12) {
                e = e12;
                throw new SecurityException("Failed to parse signature record #" + i12, e);
            }
        }
        if (i11 == -1) {
            if (i12 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i11 != 513 && i11 != 514) {
            if (i11 != 769) {
                switch (i11) {
                    case 257:
                    case 258:
                    case 259:
                    case 260:
                        str = "RSA";
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i11))));
                }
            } else {
                str = "DSA";
            }
        } else {
            str = "EC";
        }
        if (i11 != 513) {
            if (i11 != 514) {
                if (i11 != 769) {
                    switch (i11) {
                        case 257:
                            create = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                            break;
                        case 258:
                            create = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                            break;
                        case 259:
                            create = Pair.create("SHA256withRSA", null);
                            break;
                        case 260:
                            create = Pair.create("SHA512withRSA", null);
                            break;
                        default:
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i11))));
                    }
                } else {
                    create = Pair.create("SHA256withDSA", null);
                }
            } else {
                create = Pair.create("SHA512withECDSA", null);
            }
        } else {
            create = Pair.create("SHA256withECDSA", null);
        }
        String str2 = (String) create.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) create.second;
        try {
            PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(m111118i));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(generatePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(m111115f);
            if (signature.verify(bArr2)) {
                m111115f.clear();
                ByteBuffer m111115f4 = m111115f(m111115f);
                ArrayList arrayList2 = new ArrayList();
                int i14 = 0;
                while (m111115f4.hasRemaining()) {
                    i14++;
                    try {
                        ByteBuffer m111115f5 = m111115f(m111115f4);
                        if (m111115f5.remaining() >= 8) {
                            int i15 = m111115f5.getInt();
                            arrayList2.add(Integer.valueOf(i15));
                            if (i15 == i11) {
                                bArr = m111118i(m111115f5);
                            }
                        } else {
                            throw new IOException("Record too short");
                        }
                    } catch (IOException e13) {
                        e = e13;
                        throw new IOException("Failed to parse digest record #" + i14, e);
                    } catch (BufferUnderflowException e14) {
                        e = e14;
                        throw new IOException("Failed to parse digest record #" + i14, e);
                    }
                }
                if (arrayList.equals(arrayList2)) {
                    int m111112c = m111112c(i11);
                    byte[] bArr3 = (byte[]) map.put(Integer.valueOf(m111112c), bArr);
                    if (bArr3 != null && !MessageDigest.isEqual(bArr3, bArr)) {
                        throw new SecurityException(m111113d(m111112c).concat(" contents digest does not match the digest specified by a preceding signer"));
                    }
                    ByteBuffer m111115f6 = m111115f(m111115f);
                    ArrayList arrayList3 = new ArrayList();
                    int i16 = 0;
                    while (m111115f6.hasRemaining()) {
                        i16++;
                        byte[] m111118i2 = m111118i(m111115f6);
                        try {
                            arrayList3.add(new C21494c1((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(m111118i2)), m111118i2));
                        } catch (CertificateException e15) {
                            throw new SecurityException("Failed to decode certificate #" + i16, e15);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        if (Arrays.equals(m111118i, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                            return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
                        }
                        throw new SecurityException("Public key mismatch between certificate and signature record");
                    }
                    throw new SecurityException("No certificates listed");
                }
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
        } catch (InvalidAlgorithmParameterException e16) {
            e = e16;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (InvalidKeyException e17) {
            e = e17;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (NoSuchAlgorithmException e18) {
            e = e18;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (SignatureException e19) {
            e = e19;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (InvalidKeySpecException e21) {
            e = e21;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        }
    }

    /* renamed from: k */
    private static byte[][] m111120k(int[] iArr, InterfaceC21493c0[] interfaceC21493c0Arr) {
        long j11;
        int i11;
        int length;
        int i12 = 0;
        long j12 = 0;
        long j13 = 0;
        int i13 = 0;
        while (true) {
            j11 = 1048576;
            if (i13 >= 3) {
                break;
            }
            j13 += (interfaceC21493c0Arr[i13].zza() + 1048575) / 1048576;
            i13++;
        }
        if (j13 < 2097151) {
            byte[][] bArr = new byte[iArr.length];
            int i14 = 0;
            while (true) {
                length = iArr.length;
                if (i14 >= length) {
                    break;
                }
                int i15 = (int) j13;
                byte[] bArr2 = new byte[(m111111b(iArr[i14]) * i15) + 5];
                bArr2[0] = 90;
                m111116g(i15, bArr2, 1);
                bArr[i14] = bArr2;
                i14++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            for (int i16 = 0; i16 < iArr.length; i16++) {
                String m111113d = m111113d(iArr[i16]);
                try {
                    messageDigestArr[i16] = MessageDigest.getInstance(m111113d);
                } catch (NoSuchAlgorithmException e11) {
                    throw new RuntimeException(m111113d.concat(" digest not supported"), e11);
                }
            }
            int i17 = 0;
            int i18 = 0;
            for (i11 = 3; i17 < i11; i11 = 3) {
                InterfaceC21493c0 interfaceC21493c0 = interfaceC21493c0Arr[i17];
                long j14 = j12;
                long zza = interfaceC21493c0.zza();
                while (zza > j12) {
                    int min = (int) Math.min(zza, j11);
                    m111116g(min, bArr3, 1);
                    for (int i19 = 0; i19 < length; i19++) {
                        messageDigestArr[i19].update(bArr3);
                    }
                    long j15 = j14;
                    try {
                        interfaceC21493c0.mo111099a(messageDigestArr, j15, min);
                        byte[] bArr4 = bArr3;
                        int i21 = 0;
                        while (i21 < iArr.length) {
                            int i22 = iArr[i21];
                            InterfaceC21493c0 interfaceC21493c02 = interfaceC21493c0;
                            byte[] bArr5 = bArr[i21];
                            int m111111b = m111111b(i22);
                            int i23 = length;
                            MessageDigest messageDigest = messageDigestArr[i21];
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigest.digest(bArr5, (i18 * m111111b) + 5, m111111b);
                            if (digest == m111111b) {
                                i21++;
                                interfaceC21493c0 = interfaceC21493c02;
                                length = i23;
                                messageDigestArr = messageDigestArr2;
                            } else {
                                throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                            }
                        }
                        long j16 = min;
                        long j17 = j15 + j16;
                        zza -= j16;
                        i18++;
                        j12 = 0;
                        j11 = 1048576;
                        bArr3 = bArr4;
                        j14 = j17;
                        messageDigestArr = messageDigestArr;
                    } catch (IOException e12) {
                        throw new DigestException("Failed to digest chunk #" + i18 + " of section #" + i12, e12);
                    }
                }
                i12++;
                i17++;
                j12 = 0;
                j11 = 1048576;
            }
            byte[][] bArr6 = new byte[iArr.length];
            for (int i24 = 0; i24 < iArr.length; i24++) {
                int i25 = iArr[i24];
                byte[] bArr7 = bArr[i24];
                String m111113d2 = m111113d(i25);
                try {
                    bArr6[i24] = MessageDigest.getInstance(m111113d2).digest(bArr7);
                } catch (NoSuchAlgorithmException e13) {
                    throw new RuntimeException(m111113d2.concat(" digest not supported"), e13);
                }
            }
            return bArr6;
        }
        throw new DigestException("Too many chunks: " + j13);
    }

    /* renamed from: l */
    private static X509Certificate[][] m111121l(FileChannel fileChannel, C21491b1 c21491b1) {
        ByteBuffer byteBuffer;
        long j11;
        long j12;
        long j13;
        ByteBuffer byteBuffer2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                byteBuffer = c21491b1.f104518a;
                ByteBuffer m111115f = m111115f(byteBuffer);
                int i11 = 0;
                while (m111115f.hasRemaining()) {
                    i11++;
                    try {
                        arrayList.add(m111119j(m111115f(m111115f), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e11) {
                        throw new SecurityException("Failed to parse/verify signer #" + i11 + " block", e11);
                    }
                }
                if (i11 > 0) {
                    if (!hashMap.isEmpty()) {
                        j11 = c21491b1.f104519b;
                        j12 = c21491b1.f104520c;
                        j13 = c21491b1.f104521d;
                        byteBuffer2 = c21491b1.f104522e;
                        m111117h(hashMap, fileChannel, j11, j12, j13, byteBuffer2);
                        return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                    }
                    throw new SecurityException("No content digests found");
                }
                throw new SecurityException("No signers found");
            } catch (IOException e12) {
                throw new SecurityException("Failed to read list of signers", e12);
            }
        } catch (CertificateException e13) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e13);
        }
    }
}
