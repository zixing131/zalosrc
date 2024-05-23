package org.bouncycastle.asn1;

import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import eo0.AbstractC18530a;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import zn0.C32515b;

/* renamed from: org.bouncycastle.asn1.d */
/* loaded from: classes7.dex */
public class C24428d extends FilterInputStream {

    /* renamed from: p */
    private final int f117947p;

    /* renamed from: q */
    private final boolean f117948q;

    /* renamed from: r */
    private final byte[][] f117949r;

    public C24428d(InputStream inputStream) {
        this(inputStream, AbstractC24439g1.m127765c(inputStream));
    }

    /* renamed from: d */
    public static AbstractC24444j m127727d(int i11, C24424b1 c24424b1, byte[][] bArr) {
        switch (i11) {
            case 1:
                return C24419a.m127712m(m127729h(c24424b1, bArr));
            case 2:
                return new C24431e(c24424b1.m127720c(), false);
            case 3:
                return C24426c0.m127721m(c24424b1.mo127719a(), c24424b1);
            case 4:
                return new C24447k0(c24424b1.m127720c());
            case 5:
                return C24443i0.f117974a;
            case 6:
                return C24437g.m127753o(m127729h(c24424b1, bArr));
            case 7:
            case 8:
            case 9:
            case 11:
            case 13:
            case 14:
            case 15:
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
            case 17:
            case 21:
            case 25:
            case 29:
            default:
                throw new IOException("unknown tag " + i11 + " encountered");
            case 10:
                return C24422b.m127717m(m127729h(c24424b1, bArr));
            case 12:
                return new C24467u0(c24424b1.m127720c());
            case 18:
                return new C24445j0(c24424b1.m127720c());
            case 19:
                return new C24453n0(c24424b1.m127720c());
            case 20:
                return new C24463s0(c24424b1.m127720c());
            case 22:
                return new C24441h0(c24424b1.m127720c());
            case 23:
                return new C24454o(c24424b1.m127720c());
            case 24:
                return new C24425c(c24424b1.m127720c());
            case 26:
                return new C24471w0(c24424b1.m127720c());
            case 27:
                return new C24438g0(c24424b1.m127720c());
            case 28:
                return new C24469v0(c24424b1.m127720c());
            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                return new C24423b0(m127728f(c24424b1));
        }
    }

    /* renamed from: f */
    private static char[] m127728f(C24424b1 c24424b1) {
        int read;
        int mo127719a = c24424b1.mo127719a() / 2;
        char[] cArr = new char[mo127719a];
        for (int i11 = 0; i11 < mo127719a; i11++) {
            int read2 = c24424b1.read();
            if (read2 < 0 || (read = c24424b1.read()) < 0) {
                break;
            }
            cArr[i11] = (char) ((read2 << 8) | (read & 255));
        }
        return cArr;
    }

    /* renamed from: h */
    private static byte[] m127729h(C24424b1 c24424b1, byte[][] bArr) {
        int mo127719a = c24424b1.mo127719a();
        if (c24424b1.mo127719a() >= bArr.length) {
            return c24424b1.m127720c();
        }
        byte[] bArr2 = bArr[mo127719a];
        if (bArr2 == null) {
            bArr2 = new byte[mo127719a];
            bArr[mo127719a] = bArr2;
        }
        AbstractC18530a.m97920c(c24424b1, bArr2);
        return bArr2;
    }

    /* renamed from: q */
    public static int m127730q(InputStream inputStream, int i11) {
        int read = inputStream.read();
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (read == 128) {
            return -1;
        }
        if (read <= 127) {
            return read;
        }
        int i12 = read & 127;
        if (i12 > 4) {
            throw new IOException("DER length more than 4 bytes: " + i12);
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            int read2 = inputStream.read();
            if (read2 < 0) {
                throw new EOFException("EOF found reading length");
            }
            i13 = (i13 << 8) + read2;
        }
        if (i13 < 0) {
            throw new IOException("corrupted stream - negative length found");
        }
        if (i13 < i11) {
            return i13;
        }
        throw new IOException("corrupted stream - out of bounds length found");
    }

    /* renamed from: s */
    public static int m127731s(InputStream inputStream, int i11) {
        int i12 = i11 & 31;
        if (i12 != 31) {
            return i12;
        }
        int read = inputStream.read();
        if ((read & 127) == 0) {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        int i13 = 0;
        while (read >= 0 && (read & 128) != 0) {
            i13 = ((read & 127) | i13) << 7;
            read = inputStream.read();
        }
        if (read >= 0) {
            return i13 | (read & 127);
        }
        throw new EOFException("EOF found inside tag value.");
    }

    /* renamed from: a */
    C32515b m127732a(C24424b1 c24424b1) {
        return new C24428d(c24424b1).m127733b();
    }

    /* renamed from: b */
    C32515b m127733b() {
        C32515b c32515b = new C32515b();
        while (true) {
            AbstractC24444j m127737r = m127737r();
            if (m127737r == null) {
                return c32515b;
            }
            c32515b.m157478a(m127737r);
        }
    }

    /* renamed from: c */
    protected AbstractC24444j m127734c(int i11, int i12, int i13) {
        boolean z11 = (i11 & 32) != 0;
        C24424b1 c24424b1 = new C24424b1(this, i13);
        if ((i11 & 64) != 0) {
            return new C24420a0(z11, i12, c24424b1.m127720c());
        }
        if ((i11 & 128) != 0) {
            return new C24450m(c24424b1).m127796c(z11, i12);
        }
        if (!z11) {
            return m127727d(i12, c24424b1, this.f117949r);
        }
        if (i12 == 4) {
            C32515b m127732a = m127732a(c24424b1);
            int m157480c = m127732a.m157480c();
            AbstractC24440h[] abstractC24440hArr = new AbstractC24440h[m157480c];
            for (int i14 = 0; i14 != m157480c; i14++) {
                abstractC24440hArr[i14] = (AbstractC24440h) m127732a.m157479b(i14);
            }
            return new C24460r(abstractC24440hArr);
        }
        if (i12 == 8) {
            return new C24429d0(m127732a(c24424b1));
        }
        if (i12 == 16) {
            return this.f117948q ? new C24433e1(c24424b1.m127720c()) : AbstractC24435f0.m127749a(m127732a(c24424b1));
        }
        if (i12 == 17) {
            return AbstractC24435f0.m127750b(m127732a(c24424b1));
        }
        throw new IOException("unknown tag " + i12 + " encountered");
    }

    /* renamed from: i */
    public int m127735i() {
        return this.f117947p;
    }

    /* renamed from: o */
    protected int m127736o() {
        return m127730q(this, this.f117947p);
    }

    /* renamed from: r */
    public AbstractC24444j m127737r() {
        int read = read();
        if (read <= 0) {
            if (read != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int m127731s = m127731s(this, read);
        boolean z11 = (read & 32) != 0;
        int m127736o = m127736o();
        if (m127736o >= 0) {
            try {
                return m127734c(read, m127731s, m127736o);
            } catch (IllegalArgumentException e11) {
                throw new ASN1Exception("corrupted stream detected", e11);
            }
        }
        if (!z11) {
            throw new IOException("indefinite length primitive encoding encountered");
        }
        C24450m c24450m = new C24450m(new C24427c1(this, this.f117947p), this.f117947p);
        if ((read & 64) != 0) {
            return new C24456p(m127731s, c24450m).mo127742b();
        }
        if ((read & 128) != 0) {
            return new C24474y(true, m127731s, c24450m).mo127742b();
        }
        if (m127731s == 4) {
            return new C24462s(c24450m).mo127742b();
        }
        if (m127731s == 8) {
            return new C24432e0(c24450m).mo127742b();
        }
        if (m127731s == 16) {
            return new C24466u(c24450m).mo127742b();
        }
        if (m127731s == 17) {
            return new C24470w(c24450m).mo127742b();
        }
        throw new IOException("unknown BER object encountered");
    }

    public C24428d(InputStream inputStream, int i11) {
        this(inputStream, i11, false);
    }

    public C24428d(InputStream inputStream, int i11, boolean z11) {
        super(inputStream);
        this.f117947p = i11;
        this.f117948q = z11;
        this.f117949r = new byte[11];
    }

    public C24428d(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public C24428d(byte[] bArr, boolean z11) {
        this(new ByteArrayInputStream(bArr), bArr.length, z11);
    }
}
