package p384o9;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.OutputStream;
import p345m9.C22961h;

/* renamed from: o9.b */
/* loaded from: classes3.dex */
public final class C24132b extends OutputStream {

    /* renamed from: p */
    private final OutputStream f116656p;

    /* renamed from: q */
    private final Timer f116657q;

    /* renamed from: r */
    C22961h f116658r;

    /* renamed from: s */
    long f116659s = -1;

    public C24132b(OutputStream outputStream, C22961h c22961h, Timer timer) {
        this.f116656p = outputStream;
        this.f116658r = c22961h;
        this.f116657q = timer;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j11 = this.f116659s;
        if (j11 != -1) {
            this.f116658r.m117703m(j11);
        }
        this.f116658r.m117707q(this.f116657q.m34292c());
        try {
            this.f116656p.close();
        } catch (IOException e11) {
            this.f116658r.m117708t(this.f116657q.m34292c());
            AbstractC24137g.m126110d(this.f116658r);
            throw e11;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        try {
            this.f116656p.flush();
        } catch (IOException e11) {
            this.f116658r.m117708t(this.f116657q.m34292c());
            AbstractC24137g.m126110d(this.f116658r);
            throw e11;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i11) {
        try {
            this.f116656p.write(i11);
            long j11 = this.f116659s + 1;
            this.f116659s = j11;
            this.f116658r.m117703m(j11);
        } catch (IOException e11) {
            this.f116658r.m117708t(this.f116657q.m34292c());
            AbstractC24137g.m126110d(this.f116658r);
            throw e11;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        try {
            this.f116656p.write(bArr);
            long length = this.f116659s + bArr.length;
            this.f116659s = length;
            this.f116658r.m117703m(length);
        } catch (IOException e11) {
            this.f116658r.m117708t(this.f116657q.m34292c());
            AbstractC24137g.m126110d(this.f116658r);
            throw e11;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) {
        try {
            this.f116656p.write(bArr, i11, i12);
            long j11 = this.f116659s + i12;
            this.f116659s = j11;
            this.f116658r.m117703m(j11);
        } catch (IOException e11) {
            this.f116658r.m117708t(this.f116657q.m34292c());
            AbstractC24137g.m126110d(this.f116658r);
            throw e11;
        }
    }
}
