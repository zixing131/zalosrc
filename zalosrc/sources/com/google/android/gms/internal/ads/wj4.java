package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class wj4 {

    /* renamed from: d */
    public static final rj4 f29946d = new rj4(0, -9223372036854775807L, null);

    /* renamed from: e */
    public static final rj4 f29947e = new rj4(1, -9223372036854775807L, null);

    /* renamed from: f */
    public static final rj4 f29948f = new rj4(2, -9223372036854775807L, null);

    /* renamed from: g */
    public static final rj4 f29949g = new rj4(3, -9223372036854775807L, null);

    /* renamed from: a */
    private final ExecutorService f29950a = g92.m22359q("ExoPlayer:Loader:ProgressiveMediaPeriod");

    /* renamed from: b */
    private sj4 f29951b;

    /* renamed from: c */
    private IOException f29952c;

    public wj4(String str) {
    }

    /* renamed from: b */
    public static rj4 m27627b(boolean z11, long j11) {
        return new rj4(z11 ? 1 : 0, j11, null);
    }

    /* renamed from: a */
    public final long m27632a(tj4 tj4Var, pj4 pj4Var, int i11) {
        Looper myLooper = Looper.myLooper();
        v71.m27171b(myLooper);
        this.f29952c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new sj4(this, myLooper, tj4Var, pj4Var, i11, elapsedRealtime).m26343c(0L);
        return elapsedRealtime;
    }

    /* renamed from: g */
    public final void m27633g() {
        sj4 sj4Var = this.f29951b;
        v71.m27171b(sj4Var);
        sj4Var.m26341a(false);
    }

    /* renamed from: h */
    public final void m27634h() {
        this.f29952c = null;
    }

    /* renamed from: i */
    public final void m27635i(int i11) {
        IOException iOException = this.f29952c;
        if (iOException == null) {
            sj4 sj4Var = this.f29951b;
            if (sj4Var != null) {
                sj4Var.m26342b(i11);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: j */
    public final void m27636j(uj4 uj4Var) {
        sj4 sj4Var = this.f29951b;
        if (sj4Var != null) {
            sj4Var.m26341a(true);
        }
        this.f29950a.execute(new vj4(uj4Var));
        this.f29950a.shutdown();
    }

    /* renamed from: k */
    public final boolean m27637k() {
        return this.f29952c != null;
    }

    /* renamed from: l */
    public final boolean m27638l() {
        return this.f29951b != null;
    }
}
