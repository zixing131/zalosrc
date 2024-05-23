package okio;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

/* renamed from: okio.a */
/* loaded from: classes7.dex */
public final class C24291a implements InterfaceC24292b, Closeable, Flushable, WritableByteChannel, Cloneable, ByteChannel {

    /* renamed from: r */
    private static final byte[] f117277r = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: p */
    C24294d f117278p;

    /* renamed from: q */
    long f117279q;

    /* renamed from: A */
    public C24291a m126798A(byte[] bArr, int i11, int i12) {
        if (bArr != null) {
            long j11 = i12;
            AbstractC24297g.m126839b(bArr.length, i11, j11);
            int i13 = i12 + i11;
            while (i11 < i13) {
                C24294d m126815v = m126815v(1);
                int min = Math.min(i13 - i11, 8192 - m126815v.f117287c);
                System.arraycopy(bArr, i11, m126815v.f117285a, m126815v.f117287c, min);
                i11 += min;
                m126815v.f117287c += min;
            }
            this.f117279q += j11;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: E */
    public C24291a m126799E(int i11) {
        C24294d m126815v = m126815v(1);
        byte[] bArr = m126815v.f117285a;
        int i12 = m126815v.f117287c;
        m126815v.f117287c = i12 + 1;
        bArr[i12] = (byte) i11;
        this.f117279q++;
        return this;
    }

    /* renamed from: G */
    public C24291a m126800G(long j11) {
        if (j11 == 0) {
            return m126799E(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j11)) / 4) + 1;
        C24294d m126815v = m126815v(numberOfTrailingZeros);
        byte[] bArr = m126815v.f117285a;
        int i11 = m126815v.f117287c;
        for (int i12 = (i11 + numberOfTrailingZeros) - 1; i12 >= i11; i12--) {
            bArr[i12] = f117277r[(int) (15 & j11)];
            j11 >>>= 4;
        }
        m126815v.f117287c += numberOfTrailingZeros;
        this.f117279q += numberOfTrailingZeros;
        return this;
    }

    /* renamed from: L */
    public C24291a m126801L(String str, int i11, int i12, Charset charset) {
        if (str != null) {
            if (i11 >= 0) {
                if (i12 >= i11) {
                    if (i12 <= str.length()) {
                        if (charset != null) {
                            if (charset.equals(AbstractC24297g.f117296a)) {
                                return m126803O(str, i11, i12);
                            }
                            byte[] bytes = str.substring(i11, i12).getBytes(charset);
                            return m126798A(bytes, 0, bytes.length);
                        }
                        throw new IllegalArgumentException("charset == null");
                    }
                    throw new IllegalArgumentException("endIndex > string.length: " + i12 + " > " + str.length());
                }
                throw new IllegalArgumentException("endIndex < beginIndex: " + i12 + " < " + i11);
            }
            throw new IllegalAccessError("beginIndex < 0: " + i11);
        }
        throw new IllegalArgumentException("string == null");
    }

    /* renamed from: N */
    public C24291a m126802N(String str) {
        return m126803O(str, 0, str.length());
    }

    /* renamed from: O */
    public C24291a m126803O(String str, int i11, int i12) {
        char c11;
        if (str != null) {
            if (i11 >= 0) {
                if (i12 >= i11) {
                    if (i12 <= str.length()) {
                        while (i11 < i12) {
                            char charAt = str.charAt(i11);
                            if (charAt < 128) {
                                C24294d m126815v = m126815v(1);
                                byte[] bArr = m126815v.f117285a;
                                int i13 = m126815v.f117287c - i11;
                                int min = Math.min(i12, 8192 - i13);
                                int i14 = i11 + 1;
                                bArr[i11 + i13] = (byte) charAt;
                                while (i14 < min) {
                                    char charAt2 = str.charAt(i14);
                                    if (charAt2 >= 128) {
                                        break;
                                    }
                                    bArr[i14 + i13] = (byte) charAt2;
                                    i14++;
                                }
                                int i15 = m126815v.f117287c;
                                int i16 = (i13 + i14) - i15;
                                m126815v.f117287c = i15 + i16;
                                this.f117279q += i16;
                                i11 = i14;
                            } else {
                                if (charAt < 2048) {
                                    m126799E((charAt >> 6) | 192);
                                    m126799E((charAt & '?') | 128);
                                } else if (charAt >= 55296 && charAt <= 57343) {
                                    int i17 = i11 + 1;
                                    if (i17 < i12) {
                                        c11 = str.charAt(i17);
                                    } else {
                                        c11 = 0;
                                    }
                                    if (charAt <= 56319 && c11 >= 56320 && c11 <= 57343) {
                                        int i18 = (((charAt & 10239) << 10) | (9215 & c11)) + 65536;
                                        m126799E((i18 >> 18) | 240);
                                        m126799E(((i18 >> 12) & 63) | 128);
                                        m126799E(((i18 >> 6) & 63) | 128);
                                        m126799E((i18 & 63) | 128);
                                        i11 += 2;
                                    } else {
                                        m126799E(63);
                                        i11 = i17;
                                    }
                                } else {
                                    m126799E((charAt >> '\f') | 224);
                                    m126799E(((charAt >> 6) & 63) | 128);
                                    m126799E((charAt & '?') | 128);
                                }
                                i11++;
                            }
                        }
                        return this;
                    }
                    throw new IllegalArgumentException("endIndex > string.length: " + i12 + " > " + str.length());
                }
                throw new IllegalArgumentException("endIndex < beginIndex: " + i12 + " < " + i11);
            }
            throw new IllegalArgumentException("beginIndex < 0: " + i11);
        }
        throw new IllegalArgumentException("string == null");
    }

    /* renamed from: P */
    public C24291a m126804P(int i11) {
        if (i11 < 128) {
            m126799E(i11);
        } else if (i11 < 2048) {
            m126799E((i11 >> 6) | 192);
            m126799E((i11 & 63) | 128);
        } else if (i11 < 65536) {
            if (i11 >= 55296 && i11 <= 57343) {
                m126799E(63);
            } else {
                m126799E((i11 >> 12) | 224);
                m126799E(((i11 >> 6) & 63) | 128);
                m126799E((i11 & 63) | 128);
            }
        } else if (i11 <= 1114111) {
            m126799E((i11 >> 18) | 240);
            m126799E(((i11 >> 12) & 63) | 128);
            m126799E(((i11 >> 6) & 63) | 128);
            m126799E((i11 & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i11));
        }
        return this;
    }

    /* renamed from: a */
    public C24291a clone() {
        C24291a c24291a = new C24291a();
        if (this.f117279q == 0) {
            return c24291a;
        }
        C24294d m126831c = this.f117278p.m126831c();
        c24291a.f117278p = m126831c;
        m126831c.f117291g = m126831c;
        m126831c.f117290f = m126831c;
        C24294d c24294d = this.f117278p;
        while (true) {
            c24294d = c24294d.f117290f;
            if (c24294d != this.f117278p) {
                c24291a.f117278p.f117291g.m126830b(c24294d.m126831c());
            } else {
                c24291a.f117279q = this.f117279q;
                return c24291a;
            }
        }
    }

    /* renamed from: b */
    public boolean m126806b() {
        return this.f117279q == 0;
    }

    /* renamed from: c */
    public int m126807c(byte[] bArr, int i11, int i12) {
        AbstractC24297g.m126839b(bArr.length, i11, i12);
        C24294d c24294d = this.f117278p;
        if (c24294d == null) {
            return -1;
        }
        int min = Math.min(i12, c24294d.f117287c - c24294d.f117286b);
        System.arraycopy(c24294d.f117285a, c24294d.f117286b, bArr, i11, min);
        int i13 = c24294d.f117286b + min;
        c24294d.f117286b = i13;
        this.f117279q -= min;
        if (i13 == c24294d.f117287c) {
            this.f117278p = c24294d.m126829a();
            AbstractC24295e.m126832a(c24294d);
        }
        return min;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24291a)) {
            return false;
        }
        C24291a c24291a = (C24291a) obj;
        long j11 = this.f117279q;
        if (j11 != c24291a.f117279q) {
            return false;
        }
        long j12 = 0;
        if (j11 == 0) {
            return true;
        }
        C24294d c24294d = this.f117278p;
        C24294d c24294d2 = c24291a.f117278p;
        int i11 = c24294d.f117286b;
        int i12 = c24294d2.f117286b;
        while (j12 < this.f117279q) {
            long min = Math.min(c24294d.f117287c - i11, c24294d2.f117287c - i12);
            int i13 = 0;
            while (i13 < min) {
                int i14 = i11 + 1;
                int i15 = i12 + 1;
                if (c24294d.f117285a[i11] != c24294d2.f117285a[i12]) {
                    return false;
                }
                i13++;
                i11 = i14;
                i12 = i15;
            }
            if (i11 == c24294d.f117287c) {
                c24294d = c24294d.f117290f;
                i11 = c24294d.f117286b;
            }
            if (i12 == c24294d2.f117287c) {
                c24294d2 = c24294d2.f117290f;
                i12 = c24294d2.f117286b;
            }
            j12 += min;
        }
        return true;
    }

    /* renamed from: f */
    public byte m126808f() {
        long j11 = this.f117279q;
        if (j11 != 0) {
            C24294d c24294d = this.f117278p;
            int i11 = c24294d.f117286b;
            int i12 = c24294d.f117287c;
            int i13 = i11 + 1;
            byte b11 = c24294d.f117285a[i11];
            this.f117279q = j11 - 1;
            if (i13 == i12) {
                this.f117278p = c24294d.m126829a();
                AbstractC24295e.m126832a(c24294d);
            } else {
                c24294d.f117286b = i13;
            }
            return b11;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    /* renamed from: h */
    public byte[] m126809h(long j11) {
        AbstractC24297g.m126839b(this.f117279q, 0L, j11);
        if (j11 <= 2147483647L) {
            byte[] bArr = new byte[(int) j11];
            m126810i(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j11);
    }

    public int hashCode() {
        C24294d c24294d = this.f117278p;
        if (c24294d == null) {
            return 0;
        }
        int i11 = 1;
        do {
            int i12 = c24294d.f117287c;
            for (int i13 = c24294d.f117286b; i13 < i12; i13++) {
                i11 = (i11 * 31) + c24294d.f117285a[i13];
            }
            c24294d = c24294d.f117290f;
        } while (c24294d != this.f117278p);
        return i11;
    }

    /* renamed from: i */
    public void m126810i(byte[] bArr) {
        int i11 = 0;
        while (i11 < bArr.length) {
            int m126807c = m126807c(bArr, i11, bArr.length - i11);
            if (m126807c != -1) {
                i11 += m126807c;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    /* renamed from: o */
    public String m126811o(long j11, Charset charset) {
        AbstractC24297g.m126839b(this.f117279q, 0L, j11);
        if (charset != null) {
            if (j11 <= 2147483647L) {
                if (j11 == 0) {
                    return "";
                }
                C24294d c24294d = this.f117278p;
                int i11 = c24294d.f117286b;
                if (i11 + j11 > c24294d.f117287c) {
                    return new String(m126809h(j11), charset);
                }
                String str = new String(c24294d.f117285a, i11, (int) j11, charset);
                int i12 = (int) (c24294d.f117286b + j11);
                c24294d.f117286b = i12;
                this.f117279q -= j11;
                if (i12 == c24294d.f117287c) {
                    this.f117278p = c24294d.m126829a();
                    AbstractC24295e.m126832a(c24294d);
                }
                return str;
            }
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j11);
        }
        throw new IllegalArgumentException("charset == null");
    }

    /* renamed from: q */
    public String m126812q() {
        try {
            return m126811o(this.f117279q, AbstractC24297g.f117296a);
        } catch (EOFException e11) {
            throw new AssertionError(e11);
        }
    }

    /* renamed from: r */
    public final C24293c m126813r() {
        long j11 = this.f117279q;
        if (j11 <= 2147483647L) {
            return m126814s((int) j11);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f117279q);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        C24294d c24294d = this.f117278p;
        if (c24294d == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), c24294d.f117287c - c24294d.f117286b);
        byteBuffer.put(c24294d.f117285a, c24294d.f117286b, min);
        int i11 = c24294d.f117286b + min;
        c24294d.f117286b = i11;
        this.f117279q -= min;
        if (i11 == c24294d.f117287c) {
            this.f117278p = c24294d.m126829a();
            AbstractC24295e.m126832a(c24294d);
        }
        return min;
    }

    /* renamed from: s */
    public final C24293c m126814s(int i11) {
        if (i11 == 0) {
            return C24293c.f117281t;
        }
        return new C24296f(this, i11);
    }

    public String toString() {
        return m126813r().toString();
    }

    /* renamed from: v */
    C24294d m126815v(int i11) {
        if (i11 >= 1 && i11 <= 8192) {
            C24294d c24294d = this.f117278p;
            if (c24294d == null) {
                C24294d m126833b = AbstractC24295e.m126833b();
                this.f117278p = m126833b;
                m126833b.f117291g = m126833b;
                m126833b.f117290f = m126833b;
                return m126833b;
            }
            C24294d c24294d2 = c24294d.f117291g;
            if (c24294d2.f117287c + i11 > 8192 || !c24294d2.f117289e) {
                return c24294d2.m126830b(AbstractC24295e.m126833b());
            }
            return c24294d2;
        }
        throw new IllegalArgumentException();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i11 = remaining;
            while (i11 > 0) {
                C24294d m126815v = m126815v(1);
                int min = Math.min(i11, 8192 - m126815v.f117287c);
                byteBuffer.get(m126815v.f117285a, m126815v.f117287c, min);
                i11 -= min;
                m126815v.f117287c += min;
            }
            this.f117279q += remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: y */
    public C24291a m126816y(byte[] bArr) {
        if (bArr != null) {
            return m126798A(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }
}
