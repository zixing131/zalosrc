package com.zing.zalo.perf.presentation.batterymonitor.core;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.CharBuffer;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public class ProcFileReader {

    /* renamed from: a */
    private final String f48394a;

    /* renamed from: b */
    private final byte[] f48395b;

    /* renamed from: c */
    private RandomAccessFile f48396c;

    /* renamed from: d */
    private int f48397d;

    /* renamed from: e */
    private int f48398e;

    /* renamed from: f */
    private char f48399f;

    /* renamed from: g */
    private char f48400g;

    /* renamed from: h */
    private boolean f48401h;

    /* renamed from: i */
    private boolean f48402i;

    /* loaded from: classes4.dex */
    public static class ParseException extends RuntimeException {
        public ParseException(String str) {
            super(str);
        }
    }

    public ProcFileReader(String str) {
        this(str, 512);
    }

    /* renamed from: d */
    private void m48320d() {
        if (m48323b()) {
            int i11 = this.f48397d + 1;
            this.f48397d = i11;
            this.f48400g = this.f48399f;
            this.f48399f = (char) this.f48395b[i11];
            this.f48402i = false;
            return;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: h */
    private void m48321h() {
        if (!this.f48402i) {
            this.f48397d--;
            this.f48399f = this.f48400g;
            this.f48402i = true;
            return;
        }
        throw new ParseException("Can only rewind one step!");
    }

    /* renamed from: a */
    public void m48322a() {
        RandomAccessFile randomAccessFile = this.f48396c;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            } catch (Throwable th2) {
                this.f48396c = null;
                throw th2;
            }
            this.f48396c = null;
        }
    }

    /* renamed from: b */
    public boolean m48323b() {
        RandomAccessFile randomAccessFile;
        if (this.f48401h && (randomAccessFile = this.f48396c) != null) {
            int i11 = this.f48397d;
            int i12 = this.f48398e;
            if (i11 <= i12 - 1) {
                if (i11 < i12 - 1) {
                    return true;
                }
                try {
                    this.f48398e = randomAccessFile.read(this.f48395b);
                    this.f48397d = -1;
                } catch (IOException unused) {
                    this.f48401h = false;
                    m48322a();
                }
                return m48323b();
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean m48324c() {
        return this.f48401h;
    }

    /* renamed from: e */
    public long m48325e() {
        long j11 = 0;
        boolean z11 = true;
        while (true) {
            if (!m48323b()) {
                break;
            }
            m48320d();
            if (Character.isDigit(this.f48399f)) {
                j11 = (j11 * 10) + (this.f48399f - '0');
                z11 = false;
            } else if (!z11) {
                m48321h();
            } else {
                throw new ParseException("Couldn't read number!");
            }
        }
        if (!z11) {
            return j11;
        }
        throw new ParseException("Couldn't read number because the file ended!");
    }

    /* renamed from: f */
    public CharBuffer m48326f(CharBuffer charBuffer) {
        charBuffer.clear();
        boolean z11 = true;
        while (true) {
            if (!m48323b()) {
                break;
            }
            m48320d();
            if (!Character.isWhitespace(this.f48399f)) {
                if (!charBuffer.hasRemaining()) {
                    CharBuffer allocate = CharBuffer.allocate(charBuffer.capacity() * 2);
                    charBuffer.flip();
                    allocate.put(charBuffer);
                    charBuffer = allocate;
                }
                charBuffer.put(this.f48399f);
                z11 = false;
            } else if (!z11) {
                m48321h();
            } else {
                throw new ParseException("Couldn't read string!");
            }
        }
        if (!z11) {
            charBuffer.flip();
            return charBuffer;
        }
        throw new ParseException("Couldn't read string because file ended!");
    }

    protected void finalize() {
        m48322a();
    }

    /* renamed from: g */
    public ProcFileReader m48327g() {
        this.f48401h = true;
        RandomAccessFile randomAccessFile = this.f48396c;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.seek(0L);
            } catch (IOException unused) {
                m48322a();
            }
        }
        if (this.f48396c == null) {
            try {
                this.f48396c = new RandomAccessFile(this.f48394a, "r");
            } catch (IOException unused2) {
                this.f48401h = false;
                m48322a();
            }
        }
        if (this.f48401h) {
            this.f48397d = -1;
            this.f48398e = 0;
            this.f48399f = (char) 0;
            this.f48400g = (char) 0;
            this.f48402i = false;
        }
        return this;
    }

    /* renamed from: i */
    public void m48328i() {
        m48329j('\n');
    }

    /* renamed from: j */
    public void m48329j(char c11) {
        boolean z11 = false;
        while (m48323b()) {
            m48320d();
            if (this.f48399f == c11) {
                z11 = true;
            } else if (z11) {
                m48321h();
                return;
            }
        }
    }

    /* renamed from: k */
    public void m48330k() {
        m48329j(' ');
    }

    public ProcFileReader(String str, int i11) {
        this.f48397d = -1;
        this.f48401h = true;
        this.f48402i = false;
        this.f48394a = str;
        this.f48395b = new byte[i11];
    }
}
