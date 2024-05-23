package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ga4 {

    /* renamed from: A */
    private long f20491A;

    /* renamed from: B */
    private long f20492B;

    /* renamed from: C */
    private long f20493C;

    /* renamed from: D */
    private boolean f20494D;

    /* renamed from: E */
    private long f20495E;

    /* renamed from: F */
    private long f20496F;

    /* renamed from: a */
    private final fa4 f20497a;

    /* renamed from: b */
    private final long[] f20498b;

    /* renamed from: c */
    private AudioTrack f20499c;

    /* renamed from: d */
    private int f20500d;

    /* renamed from: e */
    private int f20501e;

    /* renamed from: f */
    private ea4 f20502f;

    /* renamed from: g */
    private int f20503g;

    /* renamed from: h */
    private boolean f20504h;

    /* renamed from: i */
    private long f20505i;

    /* renamed from: j */
    private float f20506j;

    /* renamed from: k */
    private boolean f20507k;

    /* renamed from: l */
    private long f20508l;

    /* renamed from: m */
    private long f20509m;

    /* renamed from: n */
    private Method f20510n;

    /* renamed from: o */
    private long f20511o;

    /* renamed from: p */
    private boolean f20512p;

    /* renamed from: q */
    private boolean f20513q;

    /* renamed from: r */
    private long f20514r;

    /* renamed from: s */
    private long f20515s;

    /* renamed from: t */
    private long f20516t;

    /* renamed from: u */
    private long f20517u;

    /* renamed from: v */
    private int f20518v;

    /* renamed from: w */
    private int f20519w;

    /* renamed from: x */
    private long f20520x;

    /* renamed from: y */
    private long f20521y;

    /* renamed from: z */
    private long f20522z;

    public ga4(fa4 fa4Var) {
        this.f20497a = fa4Var;
        int i11 = g92.f20474a;
        try {
            this.f20510n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f20498b = new long[10];
    }

    /* renamed from: l */
    private final long m22382l(long j11) {
        return (j11 * 1000000) / this.f20503g;
    }

    /* renamed from: m */
    private final long m22383m() {
        AudioTrack audioTrack = this.f20499c;
        audioTrack.getClass();
        if (this.f20520x != -9223372036854775807L) {
            return Math.min(this.f20491A, this.f20522z + ((((SystemClock.elapsedRealtime() * 1000) - this.f20520x) * this.f20503g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        long j11 = 0;
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.f20504h) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.f20517u = this.f20515s;
                }
                playState = 2;
            }
            playbackHeadPosition += this.f20517u;
        }
        if (g92.f20474a <= 29) {
            if (playbackHeadPosition == 0) {
                if (this.f20515s > 0 && playState == 3) {
                    if (this.f20521y == -9223372036854775807L) {
                        this.f20521y = SystemClock.elapsedRealtime();
                    }
                    return this.f20515s;
                }
            } else {
                j11 = playbackHeadPosition;
            }
            this.f20521y = -9223372036854775807L;
            playbackHeadPosition = j11;
        }
        if (this.f20515s > playbackHeadPosition) {
            this.f20516t++;
        }
        this.f20515s = playbackHeadPosition;
        return playbackHeadPosition + (this.f20516t << 32);
    }

    /* renamed from: n */
    private final void m22384n() {
        this.f20508l = 0L;
        this.f20519w = 0;
        this.f20518v = 0;
        this.f20509m = 0L;
        this.f20493C = 0L;
        this.f20496F = 0L;
        this.f20507k = false;
    }

    /* renamed from: a */
    public final int m22385a(long j11) {
        return this.f20501e - ((int) (j11 - (m22383m() * this.f20500d)));
    }

    /* renamed from: b */
    public final long m22386b(boolean z11) {
        long j11;
        aa4 aa4Var;
        aa4 aa4Var2;
        y94 y94Var;
        Method method;
        long m25135s;
        long m25136t;
        long m25135s2;
        long m25136t2;
        ga4 ga4Var = this;
        AudioTrack audioTrack = ga4Var.f20499c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long m22382l = ga4Var.m22382l(m22383m());
            if (m22382l != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - ga4Var.f20509m >= 30000) {
                    long[] jArr = ga4Var.f20498b;
                    int i11 = ga4Var.f20518v;
                    jArr[i11] = m22382l - nanoTime;
                    ga4Var.f20518v = (i11 + 1) % 10;
                    int i12 = ga4Var.f20519w;
                    if (i12 < 10) {
                        ga4Var.f20519w = i12 + 1;
                    }
                    ga4Var.f20509m = nanoTime;
                    ga4Var.f20508l = 0L;
                    int i13 = 0;
                    while (true) {
                        int i14 = ga4Var.f20519w;
                        if (i13 >= i14) {
                            break;
                        }
                        ga4Var.f20508l += ga4Var.f20498b[i13] / i14;
                        i13++;
                    }
                }
                if (!ga4Var.f20504h) {
                    ea4 ea4Var = ga4Var.f20502f;
                    ea4Var.getClass();
                    if (ea4Var.m21661g(nanoTime)) {
                        long m21656b = ea4Var.m21656b();
                        long m21655a = ea4Var.m21655a();
                        if (Math.abs(m21656b - nanoTime) > 5000000) {
                            eb4 eb4Var = (eb4) ga4Var.f20497a;
                            m25135s2 = eb4Var.f19582a.m25135s();
                            m25136t2 = eb4Var.f19582a.m25136t();
                            lr1.m24356e("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + m21655a + ", " + m21656b + ", " + nanoTime + ", " + m22382l + ", " + m25135s2 + ", " + m25136t2);
                            ea4Var.m21658d();
                        } else if (Math.abs(ga4Var.m22382l(m21655a) - m22382l) > 5000000) {
                            eb4 eb4Var2 = (eb4) ga4Var.f20497a;
                            m25135s = eb4Var2.f19582a.m25135s();
                            m25136t = eb4Var2.f19582a.m25136t();
                            lr1.m24356e("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + m21655a + ", " + m21656b + ", " + nanoTime + ", " + m22382l + ", " + m25135s + ", " + m25136t);
                            ea4Var.m21658d();
                        } else {
                            ea4Var.m21657c();
                        }
                        ga4Var = this;
                    }
                    if (ga4Var.f20513q && (method = ga4Var.f20510n) != null && nanoTime - ga4Var.f20514r >= 500000) {
                        try {
                            AudioTrack audioTrack2 = ga4Var.f20499c;
                            audioTrack2.getClass();
                            Integer num = (Integer) method.invoke(audioTrack2, new Object[0]);
                            int i15 = g92.f20474a;
                            long intValue = (num.intValue() * 1000) - ga4Var.f20505i;
                            ga4Var.f20511o = intValue;
                            long max = Math.max(intValue, 0L);
                            ga4Var.f20511o = max;
                            if (max > 5000000) {
                                lr1.m24356e("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                                ga4Var.f20511o = 0L;
                            }
                        } catch (Exception unused) {
                            ga4Var.f20510n = null;
                        }
                        ga4Var.f20514r = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        ea4 ea4Var2 = ga4Var.f20502f;
        ea4Var2.getClass();
        boolean m21660f = ea4Var2.m21660f();
        if (m21660f) {
            j11 = ga4Var.m22382l(ea4Var2.m21655a()) + g92.m22338c0(nanoTime2 - ea4Var2.m21656b(), ga4Var.f20506j);
        } else {
            if (ga4Var.f20519w == 0) {
                j11 = ga4Var.m22382l(m22383m());
            } else {
                j11 = ga4Var.f20508l + nanoTime2;
            }
            if (!z11) {
                j11 = Math.max(0L, j11 - ga4Var.f20511o);
            }
        }
        if (ga4Var.f20494D != m21660f) {
            ga4Var.f20496F = ga4Var.f20493C;
            ga4Var.f20495E = ga4Var.f20492B;
        }
        long j12 = nanoTime2 - ga4Var.f20496F;
        if (j12 < 1000000) {
            long j13 = (j12 * 1000) / 1000000;
            j11 = ((j11 * j13) + ((1000 - j13) * (ga4Var.f20495E + g92.m22338c0(j12, ga4Var.f20506j)))) / 1000;
        }
        if (!ga4Var.f20507k) {
            long j14 = ga4Var.f20492B;
            if (j11 > j14) {
                ga4Var.f20507k = true;
                long currentTimeMillis = System.currentTimeMillis() - g92.m22352j0(g92.m22342e0(g92.m22352j0(j11 - j14), ga4Var.f20506j));
                ob4 ob4Var = ((eb4) ga4Var.f20497a).f19582a;
                aa4Var = ob4Var.f25573n;
                if (aa4Var != null) {
                    aa4Var2 = ob4Var.f25573n;
                    y94Var = ((tb4) aa4Var2).f28283a.f29257C0;
                    y94Var.m28160r(currentTimeMillis);
                }
            }
        }
        ga4Var.f20493C = nanoTime2;
        ga4Var.f20492B = j11;
        ga4Var.f20494D = m21660f;
        return j11;
    }

    /* renamed from: c */
    public final void m22387c(long j11) {
        this.f20522z = m22383m();
        this.f20520x = SystemClock.elapsedRealtime() * 1000;
        this.f20491A = j11;
    }

    /* renamed from: d */
    public final void m22388d() {
        m22384n();
        this.f20499c = null;
        this.f20502f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m22389e(AudioTrack audioTrack, boolean z11, int i11, int i12, int i13) {
        boolean z12;
        boolean m22364v;
        long j11;
        this.f20499c = audioTrack;
        this.f20500d = i12;
        this.f20501e = i13;
        this.f20502f = new ea4(audioTrack);
        this.f20503g = audioTrack.getSampleRate();
        if (z11 && g92.f20474a < 23) {
            z12 = true;
            if (i11 != 5) {
                if (i11 == 6) {
                    i11 = 6;
                }
            }
            this.f20504h = z12;
            m22364v = g92.m22364v(i11);
            this.f20513q = m22364v;
            if (!m22364v) {
                j11 = m22382l(i13 / i12);
            } else {
                j11 = -9223372036854775807L;
            }
            this.f20505i = j11;
            this.f20515s = 0L;
            this.f20516t = 0L;
            this.f20517u = 0L;
            this.f20512p = false;
            this.f20520x = -9223372036854775807L;
            this.f20521y = -9223372036854775807L;
            this.f20514r = 0L;
            this.f20511o = 0L;
            this.f20506j = 1.0f;
        }
        z12 = false;
        this.f20504h = z12;
        m22364v = g92.m22364v(i11);
        this.f20513q = m22364v;
        if (!m22364v) {
        }
        this.f20505i = j11;
        this.f20515s = 0L;
        this.f20516t = 0L;
        this.f20517u = 0L;
        this.f20512p = false;
        this.f20520x = -9223372036854775807L;
        this.f20521y = -9223372036854775807L;
        this.f20514r = 0L;
        this.f20511o = 0L;
        this.f20506j = 1.0f;
    }

    /* renamed from: f */
    public final void m22390f() {
        ea4 ea4Var = this.f20502f;
        ea4Var.getClass();
        ea4Var.m21659e();
    }

    /* renamed from: g */
    public final boolean m22391g(long j11) {
        if (j11 <= m22383m()) {
            if (this.f20504h) {
                AudioTrack audioTrack = this.f20499c;
                audioTrack.getClass();
                if (audioTrack.getPlayState() != 2 || m22383m() != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean m22392h() {
        AudioTrack audioTrack = this.f20499c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m22393i(long j11) {
        if (this.f20521y != -9223372036854775807L && j11 > 0 && SystemClock.elapsedRealtime() - this.f20521y >= 200) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m22394j(long j11) {
        aa4 aa4Var;
        long j12;
        aa4 aa4Var2;
        y94 y94Var;
        AudioTrack audioTrack = this.f20499c;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.f20504h) {
            if (playState == 2) {
                this.f20512p = false;
                return false;
            }
            if (playState == 1) {
                if (m22383m() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z11 = this.f20512p;
        boolean m22391g = m22391g(j11);
        this.f20512p = m22391g;
        if (z11 && !m22391g && playState != 1) {
            fa4 fa4Var = this.f20497a;
            int i11 = this.f20501e;
            long m22352j0 = g92.m22352j0(this.f20505i);
            eb4 eb4Var = (eb4) fa4Var;
            aa4Var = eb4Var.f19582a.f25573n;
            if (aa4Var != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ob4 ob4Var = eb4Var.f19582a;
                j12 = ob4Var.f25556S;
                aa4Var2 = ob4Var.f25573n;
                y94Var = ((tb4) aa4Var2).f28283a.f29257C0;
                y94Var.m28162t(i11, m22352j0, elapsedRealtime - j12);
            }
        }
        return true;
    }

    /* renamed from: k */
    public final boolean m22395k() {
        m22384n();
        if (this.f20520x == -9223372036854775807L) {
            ea4 ea4Var = this.f20502f;
            ea4Var.getClass();
            ea4Var.m21659e();
            return true;
        }
        return false;
    }
}
