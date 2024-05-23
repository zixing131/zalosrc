package androidx.core.util;

import java.io.Writer;

/* renamed from: androidx.core.util.c */
/* loaded from: classes2.dex */
public class C1481c extends Writer {

    /* renamed from: p */
    private final String f6372p;

    /* renamed from: q */
    private StringBuilder f6373q = new StringBuilder(128);

    public C1481c(String str) {
        this.f6372p = str;
    }

    /* renamed from: a */
    private void m7474a() {
        if (this.f6373q.length() > 0) {
            this.f6373q.toString();
            StringBuilder sb2 = this.f6373q;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m7474a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m7474a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            char c11 = cArr[i11 + i13];
            if (c11 == '\n') {
                m7474a();
            } else {
                this.f6373q.append(c11);
            }
        }
    }
}
