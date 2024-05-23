package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class m12 {

    /* renamed from: a */
    private long f24332a = 0;

    /* renamed from: b */
    private int f24333b = 0;

    /* renamed from: c */
    private long f24334c = 0;

    /* renamed from: d */
    private long f24335d = 0;

    /* renamed from: e */
    private long f24336e = 0;

    /* renamed from: f */
    private final Object f24337f = new Object();

    /* renamed from: g */
    private final Object f24338g = new Object();

    /* renamed from: h */
    private final Object f24339h = new Object();

    /* renamed from: i */
    private final Object f24340i = new Object();

    /* renamed from: j */
    private final Object f24341j = new Object();

    /* renamed from: a */
    public final int m24435a() {
        int i11;
        synchronized (this.f24338g) {
            i11 = this.f24333b;
        }
        return i11;
    }

    /* renamed from: b */
    public final synchronized long m24436b() {
        long j11;
        synchronized (this.f24341j) {
            j11 = this.f24336e;
        }
        return j11;
    }

    /* renamed from: c */
    public final synchronized long m24437c() {
        long j11;
        synchronized (this.f24340i) {
            j11 = this.f24335d;
        }
        return j11;
    }

    /* renamed from: d */
    public final synchronized long m24438d() {
        long j11;
        synchronized (this.f24337f) {
            j11 = this.f24332a;
        }
        return j11;
    }

    /* renamed from: e */
    public final long m24439e() {
        long j11;
        synchronized (this.f24339h) {
            j11 = this.f24334c;
        }
        return j11;
    }

    /* renamed from: f */
    public final synchronized void m24440f(long j11) {
        synchronized (this.f24341j) {
            this.f24336e = j11;
        }
    }

    /* renamed from: g */
    public final synchronized void m24441g(long j11) {
        synchronized (this.f24340i) {
            this.f24335d = j11;
        }
    }

    /* renamed from: h */
    public final synchronized void m24442h(long j11) {
        synchronized (this.f24337f) {
            this.f24332a = j11;
        }
    }

    /* renamed from: i */
    public final void m24443i(int i11) {
        synchronized (this.f24338g) {
            this.f24333b = i11;
        }
    }

    /* renamed from: j */
    public final void m24444j(long j11) {
        synchronized (this.f24339h) {
            this.f24334c = j11;
        }
    }
}
