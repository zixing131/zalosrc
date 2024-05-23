package p674y9;

import ca.C3382c;
import com.google.gson.AbstractC6745f;
import java.io.Writer;
import p709z9.AbstractC31725l;

/* renamed from: y9.l */
/* loaded from: classes3.dex */
public abstract class AbstractC30855l {
    /* renamed from: a */
    public static void m149993a(AbstractC6745f abstractC6745f, C3382c c3382c) {
        AbstractC31725l.f145743X.mo34535d(c3382c, abstractC6745f);
    }

    /* renamed from: b */
    public static Writer m149994b(Appendable appendable) {
        if (appendable instanceof Writer) {
            return (Writer) appendable;
        }
        return new a(appendable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y9.l$a */
    /* loaded from: classes3.dex */
    public static final class a extends Writer {

        /* renamed from: p */
        private final Appendable f142378p;

        /* renamed from: q */
        private final C33051a f142379q = new C33051a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: y9.l$a$a */
        /* loaded from: classes3.dex */
        public static class C33051a implements CharSequence {

            /* renamed from: p */
            char[] f142380p;

            C33051a() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i11) {
                return this.f142380p[i11];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f142380p.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i11, int i12) {
                return new String(this.f142380p, i11, i12 - i11);
            }
        }

        a(Appendable appendable) {
            this.f142378p = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i11, int i12) {
            C33051a c33051a = this.f142379q;
            c33051a.f142380p = cArr;
            this.f142378p.append(c33051a, i11, i12 + i11);
        }

        @Override // java.io.Writer
        public void write(int i11) {
            this.f142378p.append((char) i11);
        }
    }
}
