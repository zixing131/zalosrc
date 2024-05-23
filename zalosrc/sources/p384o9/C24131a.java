package p384o9;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import p345m9.C22961h;

/* renamed from: o9.a */
/* loaded from: classes3.dex */
public final class C24131a extends InputStream {

    /* renamed from: p */
    private final InputStream f116650p;

    /* renamed from: q */
    private final C22961h f116651q;

    /* renamed from: r */
    private final Timer f116652r;

    /* renamed from: t */
    private long f116654t;

    /* renamed from: s */
    private long f116653s = -1;

    /* renamed from: u */
    private long f116655u = -1;

    public C24131a(InputStream inputStream, C22961h c22961h, Timer timer) {
        this.f116652r = timer;
        this.f116650p = inputStream;
        this.f116651q = c22961h;
        this.f116654t = c22961h.m117698e();
    }

    @Override // java.io.InputStream
    public int available() {
        try {
            return this.f116650p.available();
        } catch (IOException e11) {
            this.f116651q.m117708t(this.f116652r.m34292c());
            AbstractC24137g.m126110d(this.f116651q);
            throw e11;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long m34292c = this.f116652r.m34292c();
        if (this.f116655u == -1) {
            this.f116655u = m34292c;
        }
        try {
            this.f116650p.close();
            long j11 = this.f116653s;
            if (j11 != -1) {
                this.f116651q.m117706p(j11);
            }
            long j12 = this.f116654t;
            if (j12 != -1) {
                this.f116651q.m117709u(j12);
            }
            this.f116651q.m117708t(this.f116655u);
            this.f116651q.m117696b();
        } catch (IOException e11) {
            this.f116651q.m117708t(this.f116652r.m34292c());
            AbstractC24137g.m126110d(this.f116651q);
            throw e11;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i11) {
        this.f116650p.mark(i11);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f116650p.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            int read = this.f116650p.read();
            long m34292c = this.f116652r.m34292c();
            if (this.f116654t == -1) {
                this.f116654t = m34292c;
            }
            if (read == -1 && this.f116655u == -1) {
                this.f116655u = m34292c;
                this.f116651q.m117708t(m34292c);
                this.f116651q.m117696b();
            } else {
                long j11 = this.f116653s + 1;
                this.f116653s = j11;
                this.f116651q.m117706p(j11);
            }
            return read;
        } catch (IOException e11) {
            this.f116651q.m117708t(this.f116652r.m34292c());
            AbstractC24137g.m126110d(this.f116651q);
            throw e11;
        }
    }

    @Override // java.io.InputStream
    public void reset() {
        try {
            this.f116650p.reset();
        } catch (IOException e11) {
            this.f116651q.m117708t(this.f116652r.m34292c());
            AbstractC24137g.m126110d(this.f116651q);
            throw e11;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j11) {
        try {
            long skip = this.f116650p.skip(j11);
            long m34292c = this.f116652r.m34292c();
            if (this.f116654t == -1) {
                this.f116654t = m34292c;
            }
            if (skip == -1 && this.f116655u == -1) {
                this.f116655u = m34292c;
                this.f116651q.m117708t(m34292c);
            } else {
                long j12 = this.f116653s + skip;
                this.f116653s = j12;
                this.f116651q.m117706p(j12);
            }
            return skip;
        } catch (IOException e11) {
            this.f116651q.m117708t(this.f116652r.m34292c());
            AbstractC24137g.m126110d(this.f116651q);
            throw e11;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        try {
            int read = this.f116650p.read(bArr, i11, i12);
            long m34292c = this.f116652r.m34292c();
            if (this.f116654t == -1) {
                this.f116654t = m34292c;
            }
            if (read == -1 && this.f116655u == -1) {
                this.f116655u = m34292c;
                this.f116651q.m117708t(m34292c);
                this.f116651q.m117696b();
            } else {
                long j11 = this.f116653s + read;
                this.f116653s = j11;
                this.f116651q.m117706p(j11);
            }
            return read;
        } catch (IOException e11) {
            this.f116651q.m117708t(this.f116652r.m34292c());
            AbstractC24137g.m126110d(this.f116651q);
            throw e11;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            int read = this.f116650p.read(bArr);
            long m34292c = this.f116652r.m34292c();
            if (this.f116654t == -1) {
                this.f116654t = m34292c;
            }
            if (read == -1 && this.f116655u == -1) {
                this.f116655u = m34292c;
                this.f116651q.m117708t(m34292c);
                this.f116651q.m117696b();
            } else {
                long j11 = this.f116653s + read;
                this.f116653s = j11;
                this.f116651q.m117706p(j11);
            }
            return read;
        } catch (IOException e11) {
            this.f116651q.m117708t(this.f116652r.m34292c());
            AbstractC24137g.m126110d(this.f116651q);
            throw e11;
        }
    }
}
