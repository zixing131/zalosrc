package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ea4 {

    /* renamed from: a */
    private final ca4 f19574a;

    /* renamed from: b */
    private int f19575b;

    /* renamed from: c */
    private long f19576c;

    /* renamed from: d */
    private long f19577d;

    /* renamed from: e */
    private long f19578e;

    /* renamed from: f */
    private long f19579f;

    public ea4(AudioTrack audioTrack) {
        int i11 = g92.f20474a;
        this.f19574a = new ca4(audioTrack);
        m21654h(0);
    }

    /* renamed from: h */
    private final void m21654h(int i11) {
        this.f19575b = i11;
        long j11 = 10000;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    j11 = 500000;
                } else {
                    j11 = 10000000;
                }
            } else {
                this.f19577d = 10000L;
                return;
            }
        } else {
            this.f19578e = 0L;
            this.f19579f = -1L;
            this.f19576c = System.nanoTime() / 1000;
        }
        this.f19577d = j11;
    }

    /* renamed from: a */
    public final long m21655a() {
        return this.f19574a.m20850a();
    }

    /* renamed from: b */
    public final long m21656b() {
        return this.f19574a.m20851b();
    }

    /* renamed from: c */
    public final void m21657c() {
        if (this.f19575b == 4) {
            m21654h(0);
        }
    }

    /* renamed from: d */
    public final void m21658d() {
        m21654h(4);
    }

    /* renamed from: e */
    public final void m21659e() {
        m21654h(0);
    }

    /* renamed from: f */
    public final boolean m21660f() {
        return this.f19575b == 2;
    }

    /* renamed from: g */
    public final boolean m21661g(long j11) {
        ca4 ca4Var = this.f19574a;
        if (j11 - this.f19578e < this.f19577d) {
            return false;
        }
        this.f19578e = j11;
        boolean m20852c = ca4Var.m20852c();
        int i11 = this.f19575b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        if (!m20852c) {
                            return false;
                        }
                        m21654h(0);
                        return true;
                    }
                } else {
                    if (m20852c) {
                        return true;
                    }
                    m21654h(0);
                    return false;
                }
            } else if (m20852c) {
                if (this.f19574a.m20850a() > this.f19579f) {
                    m21654h(2);
                    return true;
                }
            } else {
                m21654h(0);
            }
        } else {
            if (m20852c) {
                if (this.f19574a.m20851b() < this.f19576c) {
                    return false;
                }
                this.f19579f = this.f19574a.m20850a();
                m21654h(1);
                return true;
            }
            if (j11 - this.f19576c > 500000) {
                m21654h(3);
                return false;
            }
        }
        return m20852c;
    }
}
