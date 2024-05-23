package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;

/* renamed from: com.google.android.gms.internal.ads.bp */
/* loaded from: classes2.dex */
public final class C4362bp {

    /* renamed from: a */
    private final ChoreographerFrameCallbackC4325ap f17932a;

    /* renamed from: b */
    private final boolean f17933b;

    /* renamed from: c */
    private final long f17934c;

    /* renamed from: d */
    private final long f17935d;

    /* renamed from: e */
    private long f17936e;

    /* renamed from: f */
    private long f17937f;

    /* renamed from: g */
    private long f17938g;

    /* renamed from: h */
    private boolean f17939h;

    /* renamed from: i */
    private long f17940i;

    /* renamed from: j */
    private long f17941j;

    /* renamed from: k */
    private long f17942k;

    private C4362bp(double d11) {
        long j11;
        boolean z11 = d11 != -1.0d;
        this.f17933b = z11;
        if (z11) {
            this.f17932a = ChoreographerFrameCallbackC4325ap.m20204a();
            long j12 = (long) (1.0E9d / d11);
            this.f17934c = j12;
            j11 = (j12 * 80) / 100;
        } else {
            this.f17932a = null;
            j11 = -1;
            this.f17934c = -1L;
        }
        this.f17935d = j11;
    }

    /* renamed from: d */
    private final boolean m20638d(long j11, long j12) {
        if (Math.abs((j12 - this.f17940i) - (j11 - this.f17941j)) > 20000000) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m20639a(long j11, long j12) {
        long j13;
        long j14;
        ChoreographerFrameCallbackC4325ap choreographerFrameCallbackC4325ap;
        long j15;
        long j16 = 1000 * j11;
        if (this.f17939h) {
            if (j11 != this.f17936e) {
                this.f17942k++;
                this.f17937f = this.f17938g;
            }
            long j17 = this.f17942k;
            if (j17 >= 6) {
                j14 = this.f17937f + ((j16 - this.f17941j) / j17);
                if (m20638d(j14, j12)) {
                    this.f17939h = false;
                } else {
                    j13 = (this.f17940i + j14) - this.f17941j;
                    if (!this.f17939h) {
                        this.f17941j = j16;
                        this.f17940i = j12;
                        this.f17942k = 0L;
                        this.f17939h = true;
                    }
                    this.f17936e = j11;
                    this.f17938g = j14;
                    choreographerFrameCallbackC4325ap = this.f17932a;
                    if (choreographerFrameCallbackC4325ap == null && choreographerFrameCallbackC4325ap.f17210p != 0) {
                        long j18 = this.f17932a.f17210p;
                        long j19 = this.f17934c;
                        long j21 = j18 + (((j13 - j18) / j19) * j19);
                        if (j13 <= j21) {
                            j15 = j21 - j19;
                        } else {
                            j21 = j19 + j21;
                            j15 = j21;
                        }
                        if (j21 - j13 >= j13 - j15) {
                            j21 = j15;
                        }
                        return j21 - this.f17935d;
                    }
                    return j13;
                }
            } else if (m20638d(j16, j12)) {
                this.f17939h = false;
            }
        }
        j13 = j12;
        j14 = j16;
        if (!this.f17939h) {
        }
        this.f17936e = j11;
        this.f17938g = j14;
        choreographerFrameCallbackC4325ap = this.f17932a;
        if (choreographerFrameCallbackC4325ap == null) {
        }
        return j13;
    }

    /* renamed from: b */
    public final void m20640b() {
        if (this.f17933b) {
            this.f17932a.m20206c();
        }
    }

    /* renamed from: c */
    public final void m20641c() {
        this.f17939h = false;
        if (this.f17933b) {
            this.f17932a.m20205b();
        }
    }

    public C4362bp(Context context) {
        this(((WindowManager) context.getSystemService("window")).getDefaultDisplay() != null ? r3.getDefaultDisplay().getRefreshRate() : -1.0d);
    }
}
