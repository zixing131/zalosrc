package p709z9;

import ca.C3382c;
import com.google.gson.AbstractC6745f;
import com.google.gson.C6744e;
import com.google.gson.C6746g;
import com.google.gson.C6747h;
import com.google.gson.C6748i;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: z9.e */
/* loaded from: classes3.dex */
public final class C31718e extends C3382c {

    /* renamed from: D */
    private static final Writer f145682D = new a();

    /* renamed from: E */
    private static final C6748i f145683E = new C6748i("closed");

    /* renamed from: A */
    private final List f145684A;

    /* renamed from: B */
    private String f145685B;

    /* renamed from: C */
    private AbstractC6745f f145686C;

    /* renamed from: z9.e$a */
    /* loaded from: classes3.dex */
    class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i11, int i12) {
            throw new AssertionError();
        }
    }

    public C31718e() {
        super(f145682D);
        this.f145684A = new ArrayList();
        this.f145686C = C6746g.f37130p;
    }

    /* renamed from: c0 */
    private AbstractC6745f m152602c0() {
        return (AbstractC6745f) this.f145684A.get(r0.size() - 1);
    }

    /* renamed from: d0 */
    private void m152603d0(AbstractC6745f abstractC6745f) {
        if (this.f145685B != null) {
            if (!abstractC6745f.m34552k() || m17039o()) {
                ((C6747h) m152602c0()).m34555n(this.f145685B, abstractC6745f);
            }
            this.f145685B = null;
            return;
        }
        if (this.f145684A.isEmpty()) {
            this.f145686C = abstractC6745f;
            return;
        }
        AbstractC6745f m152602c0 = m152602c0();
        if (m152602c0 instanceof C6744e) {
            ((C6744e) m152602c0).m34547n(abstractC6745f);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // ca.C3382c
    /* renamed from: N */
    public C3382c mo17030N(long j11) {
        m152603d0(new C6748i(Long.valueOf(j11)));
        return this;
    }

    @Override // ca.C3382c
    /* renamed from: O */
    public C3382c mo17031O(Boolean bool) {
        if (bool == null) {
            return mo17043v();
        }
        m152603d0(new C6748i(bool));
        return this;
    }

    @Override // ca.C3382c
    /* renamed from: P */
    public C3382c mo17032P(Number number) {
        if (number == null) {
            return mo17043v();
        }
        if (!m17041r()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m152603d0(new C6748i(number));
        return this;
    }

    @Override // ca.C3382c
    /* renamed from: Q */
    public C3382c mo17033Q(String str) {
        if (str == null) {
            return mo17043v();
        }
        m152603d0(new C6748i(str));
        return this;
    }

    @Override // ca.C3382c
    /* renamed from: R */
    public C3382c mo17034R(boolean z11) {
        m152603d0(new C6748i(Boolean.valueOf(z11)));
        return this;
    }

    /* renamed from: Z */
    public AbstractC6745f m152604Z() {
        if (this.f145684A.isEmpty()) {
            return this.f145686C;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f145684A);
    }

    @Override // ca.C3382c
    /* renamed from: c */
    public C3382c mo17035c() {
        C6744e c6744e = new C6744e();
        m152603d0(c6744e);
        this.f145684A.add(c6744e);
        return this;
    }

    @Override // ca.C3382c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f145684A.isEmpty()) {
            this.f145684A.add(f145683E);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // ca.C3382c
    /* renamed from: d */
    public C3382c mo17036d() {
        C6747h c6747h = new C6747h();
        m152603d0(c6747h);
        this.f145684A.add(c6747h);
        return this;
    }

    @Override // ca.C3382c, java.io.Flushable
    public void flush() {
    }

    @Override // ca.C3382c
    /* renamed from: h */
    public C3382c mo17037h() {
        if (!this.f145684A.isEmpty() && this.f145685B == null) {
            if (m152602c0() instanceof C6744e) {
                this.f145684A.remove(r0.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // ca.C3382c
    /* renamed from: i */
    public C3382c mo17038i() {
        if (!this.f145684A.isEmpty() && this.f145685B == null) {
            if (m152602c0() instanceof C6747h) {
                this.f145684A.remove(r0.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // ca.C3382c
    /* renamed from: s */
    public C3382c mo17042s(String str) {
        if (!this.f145684A.isEmpty() && this.f145685B == null) {
            if (m152602c0() instanceof C6747h) {
                this.f145685B = str;
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // ca.C3382c
    /* renamed from: v */
    public C3382c mo17043v() {
        m152603d0(C6746g.f37130p);
        return this;
    }
}
