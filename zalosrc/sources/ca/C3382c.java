package ca;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* renamed from: ca.c */
/* loaded from: classes3.dex */
public class C3382c implements Closeable, Flushable {

    /* renamed from: y */
    private static final String[] f14302y = new String[128];

    /* renamed from: z */
    private static final String[] f14303z;

    /* renamed from: p */
    private final Writer f14304p;

    /* renamed from: q */
    private int[] f14305q = new int[32];

    /* renamed from: r */
    private int f14306r = 0;

    /* renamed from: s */
    private String f14307s;

    /* renamed from: t */
    private String f14308t;

    /* renamed from: u */
    private boolean f14309u;

    /* renamed from: v */
    private boolean f14310v;

    /* renamed from: w */
    private String f14311w;

    /* renamed from: x */
    private boolean f14312x;

    static {
        for (int i11 = 0; i11 <= 31; i11++) {
            f14302y[i11] = String.format("\\u%04x", Integer.valueOf(i11));
        }
        String[] strArr = f14302y;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f14303z = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C3382c(Writer writer) {
        m17017E(6);
        this.f14308t = ":";
        this.f14312x = true;
        if (writer != null) {
            this.f14304p = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    /* renamed from: A */
    private int m17016A() {
        int i11 = this.f14306r;
        if (i11 != 0) {
            return this.f14305q[i11 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: E */
    private void m17017E(int i11) {
        int i12 = this.f14306r;
        int[] iArr = this.f14305q;
        if (i12 == iArr.length) {
            this.f14305q = Arrays.copyOf(iArr, i12 * 2);
        }
        int[] iArr2 = this.f14305q;
        int i13 = this.f14306r;
        this.f14306r = i13 + 1;
        iArr2[i13] = i11;
    }

    /* renamed from: F */
    private void m17018F(int i11) {
        this.f14305q[this.f14306r - 1] = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m17019M(String str) {
        String[] strArr;
        String str2;
        if (this.f14310v) {
            strArr = f14303z;
        } else {
            strArr = f14302y;
        }
        this.f14304p.write(34);
        int length = str.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            char charAt = str.charAt(i12);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
                if (i11 < i12) {
                    this.f14304p.write(str, i11, i12 - i11);
                }
                this.f14304p.write(str2);
                i11 = i12 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i11 < i12) {
                }
                this.f14304p.write(str2);
                i11 = i12 + 1;
            }
        }
        if (i11 < length) {
            this.f14304p.write(str, i11, length - i11);
        }
        this.f14304p.write(34);
    }

    /* renamed from: T */
    private void m17020T() {
        if (this.f14311w != null) {
            m17021a();
            m17019M(this.f14311w);
            this.f14311w = null;
        }
    }

    /* renamed from: a */
    private void m17021a() {
        int m17016A = m17016A();
        if (m17016A == 5) {
            this.f14304p.write(44);
        } else if (m17016A != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m17024t();
        m17018F(4);
    }

    /* renamed from: b */
    private void m17022b() {
        int m17016A = m17016A();
        if (m17016A != 1) {
            if (m17016A != 2) {
                if (m17016A != 4) {
                    if (m17016A != 6) {
                        if (m17016A == 7) {
                            if (!this.f14309u) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    m17018F(7);
                    return;
                }
                this.f14304p.append((CharSequence) this.f14308t);
                m17018F(5);
                return;
            }
            this.f14304p.append(',');
            m17024t();
            return;
        }
        m17018F(2);
        m17024t();
    }

    /* renamed from: f */
    private C3382c m17023f(int i11, int i12, char c11) {
        int m17016A = m17016A();
        if (m17016A != i12 && m17016A != i11) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f14311w == null) {
            this.f14306r--;
            if (m17016A == i12) {
                m17024t();
            }
            this.f14304p.write(c11);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.f14311w);
    }

    /* renamed from: t */
    private void m17024t() {
        if (this.f14307s == null) {
            return;
        }
        this.f14304p.write(10);
        int i11 = this.f14306r;
        for (int i12 = 1; i12 < i11; i12++) {
            this.f14304p.write(this.f14307s);
        }
    }

    /* renamed from: y */
    private C3382c m17025y(int i11, char c11) {
        m17022b();
        m17017E(i11);
        this.f14304p.write(c11);
        return this;
    }

    /* renamed from: G */
    public final void m17026G(boolean z11) {
        this.f14310v = z11;
    }

    /* renamed from: J */
    public final void m17027J(String str) {
        if (str.length() == 0) {
            this.f14307s = null;
            this.f14308t = ":";
        } else {
            this.f14307s = str;
            this.f14308t = ": ";
        }
    }

    /* renamed from: K */
    public final void m17028K(boolean z11) {
        this.f14309u = z11;
    }

    /* renamed from: L */
    public final void m17029L(boolean z11) {
        this.f14312x = z11;
    }

    /* renamed from: N */
    public C3382c mo17030N(long j11) {
        m17020T();
        m17022b();
        this.f14304p.write(Long.toString(j11));
        return this;
    }

    /* renamed from: O */
    public C3382c mo17031O(Boolean bool) {
        String str;
        if (bool == null) {
            return mo17043v();
        }
        m17020T();
        m17022b();
        Writer writer = this.f14304p;
        if (bool.booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
        return this;
    }

    /* renamed from: P */
    public C3382c mo17032P(Number number) {
        if (number == null) {
            return mo17043v();
        }
        m17020T();
        String obj = number.toString();
        if (!this.f14309u && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        m17022b();
        this.f14304p.append((CharSequence) obj);
        return this;
    }

    /* renamed from: Q */
    public C3382c mo17033Q(String str) {
        if (str == null) {
            return mo17043v();
        }
        m17020T();
        m17022b();
        m17019M(str);
        return this;
    }

    /* renamed from: R */
    public C3382c mo17034R(boolean z11) {
        String str;
        m17020T();
        m17022b();
        Writer writer = this.f14304p;
        if (z11) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
        return this;
    }

    /* renamed from: c */
    public C3382c mo17035c() {
        m17020T();
        return m17025y(1, '[');
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f14304p.close();
        int i11 = this.f14306r;
        if (i11 <= 1 && (i11 != 1 || this.f14305q[i11 - 1] == 7)) {
            this.f14306r = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: d */
    public C3382c mo17036d() {
        m17020T();
        return m17025y(3, '{');
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f14306r != 0) {
            this.f14304p.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: h */
    public C3382c mo17037h() {
        return m17023f(1, 2, ']');
    }

    /* renamed from: i */
    public C3382c mo17038i() {
        return m17023f(3, 5, '}');
    }

    /* renamed from: o */
    public final boolean m17039o() {
        return this.f14312x;
    }

    /* renamed from: q */
    public final boolean m17040q() {
        return this.f14310v;
    }

    /* renamed from: r */
    public boolean m17041r() {
        return this.f14309u;
    }

    /* renamed from: s */
    public C3382c mo17042s(String str) {
        if (str != null) {
            if (this.f14311w == null) {
                if (this.f14306r != 0) {
                    this.f14311w = str;
                    return this;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    /* renamed from: v */
    public C3382c mo17043v() {
        if (this.f14311w != null) {
            if (this.f14312x) {
                m17020T();
            } else {
                this.f14311w = null;
                return this;
            }
        }
        m17022b();
        this.f14304p.write("null");
        return this;
    }
}
