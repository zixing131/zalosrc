package p406ow;

import java.util.NoSuchElementException;

/* renamed from: ow.a */
/* loaded from: classes4.dex */
class C24565a {

    /* renamed from: a */
    private byte[] f118260a;

    /* renamed from: b */
    private int f118261b;

    /* renamed from: c */
    private int f118262c;

    /* renamed from: d */
    private char f118263d;

    /* renamed from: e */
    private boolean f118264e;

    /* renamed from: a */
    private int m127963a() {
        m127967i();
        m127966h();
        int i11 = this.f118262c;
        int i12 = this.f118261b;
        if (i11 > i12) {
            int m127964b = m127964b(this.f118260a, i12, i11, this.f118263d);
            if (m127964b == -1) {
                int i13 = this.f118262c;
                int i14 = i13 - this.f118261b;
                this.f118261b = i13;
                return i14;
            }
            int i15 = m127964b - this.f118261b;
            this.f118261b = m127964b + 1;
            return i15;
        }
        throw new NoSuchElementException("Reading past end of input stream at " + this.f118261b + ".");
    }

    /* renamed from: b */
    private static int m127964b(byte[] bArr, int i11, int i12, char c11) {
        while (i11 < i12) {
            if (bArr[i11] == c11) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* renamed from: e */
    private static int m127965e(byte[] bArr, int i11, int i12) {
        int i13 = 0;
        while (i11 < i12) {
            int i14 = i11 + 1;
            int i15 = bArr[i11] - 48;
            if (i15 >= 0 && i15 <= 9) {
                i13 = (i13 * 10) + i15;
                i11 = i14;
            } else {
                throw new NumberFormatException("Invalid int in buffer at " + i11 + ".");
            }
        }
        return i13;
    }

    /* renamed from: h */
    private void m127966h() {
        if (this.f118264e) {
        } else {
            throw new IllegalStateException("Must call useDelimiter first");
        }
    }

    /* renamed from: i */
    private void m127967i() {
        if (this.f118260a != null) {
        } else {
            throw new IllegalStateException("Must call reset first");
        }
    }

    /* renamed from: c */
    public int m127968c() {
        m127967i();
        m127966h();
        int i11 = this.f118261b;
        return m127965e(this.f118260a, i11, m127963a() + i11);
    }

    /* renamed from: d */
    public boolean m127969d(String str) {
        int i11 = this.f118261b;
        if (str.length() != m127963a()) {
            return false;
        }
        for (int i12 = 0; i12 < str.length(); i12++) {
            if (str.charAt(i12) != this.f118260a[i11]) {
                return false;
            }
            i11++;
        }
        return true;
    }

    /* renamed from: f */
    public C24565a m127970f(byte[] bArr, int i11) {
        this.f118260a = bArr;
        this.f118261b = 0;
        this.f118262c = i11;
        this.f118264e = false;
        return this;
    }

    /* renamed from: g */
    public void m127971g() {
        m127967i();
        m127966h();
        m127963a();
    }

    /* renamed from: j */
    public C24565a m127972j(char c11) {
        m127967i();
        this.f118263d = c11;
        this.f118264e = true;
        return this;
    }
}
