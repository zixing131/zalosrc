package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.io.IOException;
import p229i5.InterfaceC20285f;

/* loaded from: classes2.dex */
public final class tp0 extends kp0 implements vm0 {

    /* renamed from: s */
    private wm0 f28456s;

    /* renamed from: t */
    private String f28457t;

    /* renamed from: u */
    private boolean f28458u;

    /* renamed from: v */
    private boolean f28459v;

    /* renamed from: w */
    private bp0 f28460w;

    /* renamed from: x */
    private long f28461x;

    /* renamed from: y */
    private long f28462y;

    public tp0(fn0 fn0Var, en0 en0Var) {
        super(fn0Var);
        wm0 oo0Var;
        Context context = fn0Var.getContext();
        if (en0Var.f19711m) {
            oo0Var = new mq0(context, en0Var, (fn0) this.f23423r.get());
        } else {
            oo0Var = new oo0(context, en0Var, (fn0) this.f23423r.get());
        }
        this.f28456s = oo0Var;
        oo0Var.mo24673M(this);
    }

    /* renamed from: x */
    protected static final String m26639x(String str) {
        return "cache:".concat(String.valueOf(rk0.m26104g(str)));
    }

    /* renamed from: y */
    private static String m26640y(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    /* renamed from: z */
    private final void m26641z(long j11) {
        zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.rp0
            public /* synthetic */ rp0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                tp0.this.m26648w();
            }
        }, j11);
    }

    @Override // com.google.android.gms.internal.ads.vm0
    /* renamed from: a */
    public final void mo26642a(int i11, int i12) {
    }

    @Override // com.google.android.gms.internal.ads.vm0
    /* renamed from: b */
    public final void mo26643b(int i11) {
    }

    @Override // com.google.android.gms.internal.ads.vm0
    /* renamed from: c */
    public final void mo26644c(String str, Exception exc) {
        yk0.zzk("Precache exception", exc);
        zzt.zzo().m22944s(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.vm0
    /* renamed from: f */
    public final void mo26645f(boolean z11, long j11) {
        fn0 fn0Var = (fn0) this.f23423r.get();
        if (fn0Var != null) {
            kl0.f23367e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.sp0

                /* renamed from: q */
                public final /* synthetic */ boolean f27815q;

                /* renamed from: r */
                public final /* synthetic */ long f27816r;

                public /* synthetic */ sp0(boolean z112, long j112) {
                    r2 = z112;
                    r3 = j112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    fn0.this.mo22094b0(r2, r3);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.vm0
    /* renamed from: g */
    public final void mo26646g(String str, Exception exc) {
        yk0.zzk("Precache error", exc);
        zzt.zzo().m22944s(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.kp0
    /* renamed from: i */
    public final void mo23993i() {
        synchronized (this) {
            this.f28458u = true;
            notify();
            release();
        }
        String str = this.f28457t;
        if (str != null) {
            m23994j(this.f28457t, m26639x(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.kp0
    /* renamed from: o */
    public final void mo23999o(int i11) {
        this.f28456s.mo24671K(i11);
    }

    @Override // com.google.android.gms.internal.ads.kp0
    /* renamed from: p */
    public final void mo24000p(int i11) {
        this.f28456s.mo24672L(i11);
    }

    @Override // com.google.android.gms.internal.ads.kp0
    /* renamed from: q */
    public final void mo24001q(int i11) {
        this.f28456s.mo24674N(i11);
    }

    @Override // com.google.android.gms.internal.ads.kp0
    /* renamed from: r */
    public final void mo24002r(int i11) {
        this.f28456s.mo24675O(i11);
    }

    @Override // com.google.android.gms.internal.ads.kp0, p669y4.InterfaceC30288e
    public final void release() {
        wm0 wm0Var = this.f28456s;
        if (wm0Var != null) {
            wm0Var.mo24673M(null);
            this.f28456s.mo24669I();
        }
    }

    @Override // com.google.android.gms.internal.ads.kp0
    /* renamed from: s */
    public final boolean mo24003s(String str) {
        return mo24004t(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [int] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // com.google.android.gms.internal.ads.kp0
    /* renamed from: t */
    public final boolean mo24004t(String str, String[] strArr) {
        String str2;
        String str3;
        tp0 tp0Var;
        long j11;
        long j12;
        String str4;
        ?? r52;
        long j13;
        long j14;
        String str5;
        long j15;
        boolean z11;
        long j16;
        long j17;
        long j18;
        long j19;
        tp0 tp0Var2 = this;
        String str6 = str;
        tp0Var2.f28457t = str6;
        String m26639x = m26639x(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i11 = 0; i11 < strArr.length; i11++) {
                uriArr[i11] = Uri.parse(strArr[i11]);
            }
            tp0Var2.f28456s.mo24667G(uriArr, tp0Var2.f23422q);
            fn0 fn0Var = (fn0) tp0Var2.f23423r.get();
            if (fn0Var != null) {
                fn0Var.mo22097q(m26639x, tp0Var2);
            }
            InterfaceC20285f zzB = zzt.zzB();
            long mo105913a = zzB.mo105913a();
            long longValue = ((Long) zzay.zzc().m21823b(AbstractC4554gx.f21406w)).longValue();
            long longValue2 = ((Long) zzay.zzc().m21823b(AbstractC4554gx.f21396v)).longValue() * 1000;
            long intValue = ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21386u)).intValue();
            boolean booleanValue = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20963D1)).booleanValue();
            long j21 = -1;
            ?? r62 = intValue;
            while (true) {
                synchronized (this) {
                    try {
                        if (zzB.mo105913a() - mo105913a <= longValue2) {
                            if (!tp0Var2.f28458u) {
                                if (tp0Var2.f28459v) {
                                    break;
                                }
                                if (tp0Var2.f28456s.mo24682V()) {
                                    long mo24689e0 = tp0Var2.f28456s.mo24689e0();
                                    if (mo24689e0 > 0) {
                                        long mo24685a0 = tp0Var2.f28456s.mo24685a0();
                                        if (mo24685a0 != j21) {
                                            if (mo24685a0 > 0) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            if (booleanValue) {
                                                j16 = tp0Var2.f28456s.mo24665E();
                                            } else {
                                                j16 = -1;
                                            }
                                            if (booleanValue) {
                                                j17 = tp0Var2.f28456s.mo24687c0();
                                            } else {
                                                j17 = -1;
                                            }
                                            if (booleanValue) {
                                                j18 = tp0Var2.f28456s.mo24666F();
                                            } else {
                                                j18 = -1;
                                            }
                                            try {
                                                j11 = r62;
                                                j19 = mo24689e0;
                                                j12 = longValue2;
                                                j14 = longValue;
                                                str5 = m26639x;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                str5 = m26639x;
                                            }
                                            try {
                                                m23998n(str, m26639x, mo24685a0, j19, z11, j16, j17, j18, wm0.m27656X(), wm0.m27657Z());
                                                j21 = mo24685a0;
                                                j15 = mo24689e0;
                                                str4 = j19;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                tp0Var = this;
                                                str2 = str;
                                                str3 = str5;
                                                try {
                                                    throw th;
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    yk0.zzj("Failed to preload url " + str2 + " Exception: " + e.getMessage());
                                                    zzt.zzo().m22944s(e, "VideoStreamExoPlayerCache.preload");
                                                    release();
                                                    tp0Var.m23994j(str2, str3, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, m26640y(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, e));
                                                    return false;
                                                }
                                            }
                                        } else {
                                            j11 = r62;
                                            j12 = longValue2;
                                            j14 = longValue;
                                            str5 = m26639x;
                                            j15 = mo24689e0;
                                            str4 = r62;
                                        }
                                        r52 = (mo24685a0 > j15 ? 1 : (mo24685a0 == j15 ? 0 : -1));
                                        if (r52 >= 0) {
                                            m23996l(str, str5, j15);
                                        } else {
                                            try {
                                                tp0 tp0Var3 = this;
                                                str4 = str;
                                                str3 = str5;
                                                if (tp0Var3.f28456s.mo24686b0() < j11 || mo24685a0 <= 0) {
                                                    j13 = j14;
                                                    r52 = tp0Var3;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                tp0Var = r52;
                                                str2 = str4;
                                                throw th;
                                            }
                                        }
                                    } else {
                                        j11 = r62;
                                        j12 = longValue2;
                                        str4 = str6;
                                        str3 = m26639x;
                                        r52 = tp0Var2;
                                        j13 = longValue;
                                    }
                                    try {
                                        r52.wait(j13);
                                    } catch (InterruptedException unused) {
                                        throw new IOException("Wait interrupted.");
                                    }
                                } else {
                                    throw new IOException("ExoPlayer was released during preloading.");
                                }
                            } else {
                                throw new IOException("Abort requested before buffering finished. ");
                            }
                        } else {
                            throw new IOException("Timeout reached. Limit: " + longValue2 + " ms");
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        str2 = str6;
                        str3 = m26639x;
                        tp0Var = tp0Var2;
                    }
                }
                longValue = j13;
                tp0Var2 = r52;
                str6 = str4;
                m26639x = str3;
                r62 = j11;
                longValue2 = j12;
            }
            return true;
        } catch (Exception e12) {
            e = e12;
            str2 = str6;
            str3 = m26639x;
            tp0Var = tp0Var2;
        }
    }

    @Override // com.google.android.gms.internal.ads.kp0
    /* renamed from: u */
    public final boolean mo24005u(String str, String[] strArr, bp0 bp0Var) {
        this.f28457t = str;
        this.f28460w = bp0Var;
        String m26639x = m26639x(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i11 = 0; i11 < strArr.length; i11++) {
                uriArr[i11] = Uri.parse(strArr[i11]);
            }
            this.f28456s.mo24667G(uriArr, this.f23422q);
            fn0 fn0Var = (fn0) this.f23423r.get();
            if (fn0Var != null) {
                fn0Var.mo22097q(m26639x, this);
            }
            this.f28461x = zzt.zzB().mo105913a();
            this.f28462y = -1L;
            m26641z(0L);
            return true;
        } catch (Exception e11) {
            yk0.zzj("Failed to preload url " + str + " Exception: " + e11.getMessage());
            zzt.zzo().m22944s(e11, "VideoStreamExoPlayerCache.preload");
            release();
            m23994j(str, m26639x, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, m26640y(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, e11));
            return false;
        }
    }

    /* renamed from: v */
    public final wm0 m26647v() {
        synchronized (this) {
            this.f28459v = true;
            notify();
        }
        this.f28456s.mo24673M(null);
        wm0 wm0Var = this.f28456s;
        this.f28456s = null;
        return wm0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w */
    public final /* synthetic */ void m26648w() {
        String str;
        tp0 tp0Var;
        tp0 tp0Var2;
        long longValue;
        long intValue;
        boolean booleanValue;
        tp0 tp0Var3;
        long j11;
        long j12;
        String str2;
        tp0 tp0Var4;
        long j13;
        boolean z11;
        String str3;
        long j14;
        long j15;
        long j16;
        long j17;
        String m26639x = m26639x(this.f28457t);
        try {
            longValue = ((Long) zzay.zzc().m21823b(AbstractC4554gx.f21396v)).longValue() * 1000;
            intValue = ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21386u)).intValue();
            booleanValue = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20963D1)).booleanValue();
        } catch (Exception e11) {
            e = e11;
            str = m26639x;
            tp0Var = this;
        }
        try {
            synchronized (this) {
                try {
                    if (zzt.zzB().mo105913a() - this.f28461x <= longValue) {
                        if (!this.f28458u) {
                            if (this.f28459v) {
                                tp0Var2 = this;
                            } else {
                                if (this.f28456s.mo24682V()) {
                                    long mo24689e0 = this.f28456s.mo24689e0();
                                    if (mo24689e0 > 0) {
                                        long mo24685a0 = this.f28456s.mo24685a0();
                                        if (mo24685a0 != this.f28462y) {
                                            if (mo24685a0 > 0) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            try {
                                                str3 = this.f28457t;
                                                if (booleanValue != 0) {
                                                    j14 = this.f28456s.mo24665E();
                                                } else {
                                                    j14 = -1;
                                                }
                                                if (booleanValue != 0) {
                                                    j15 = this.f28456s.mo24687c0();
                                                } else {
                                                    j15 = -1;
                                                }
                                                if (booleanValue != 0) {
                                                    j16 = this.f28456s.mo24666F();
                                                } else {
                                                    j16 = -1;
                                                }
                                                j17 = j14;
                                                j12 = intValue;
                                                str2 = m26639x;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                str2 = m26639x;
                                                tp0Var4 = this;
                                            }
                                            try {
                                                m23998n(str3, m26639x, mo24685a0, mo24689e0, z11, j17, j15, j16, wm0.m27656X(), wm0.m27657Z());
                                                tp0Var4 = this;
                                                j11 = mo24685a0;
                                                try {
                                                    tp0Var4.f28462y = j11;
                                                    j13 = mo24689e0;
                                                    tp0Var4 = tp0Var4;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    str = str2;
                                                    tp0Var = tp0Var4;
                                                    try {
                                                        throw th;
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        yk0.zzj("Failed to preload url " + tp0Var.f28457t + " Exception: " + e.getMessage());
                                                        zzt.zzo().m22944s(e, "VideoStreamExoPlayerCache.preload");
                                                        release();
                                                        tp0Var.m23994j(tp0Var.f28457t, str, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, m26640y(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, e));
                                                        tp0Var2 = tp0Var;
                                                        zzt.zzy().m20980g(tp0Var2.f28460w);
                                                        return;
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                tp0Var4 = this;
                                                str = str2;
                                                tp0Var = tp0Var4;
                                                throw th;
                                            }
                                        } else {
                                            j11 = mo24685a0;
                                            j12 = intValue;
                                            str2 = m26639x;
                                            tp0Var4 = this;
                                            j13 = mo24689e0;
                                        }
                                        if (j11 >= j13) {
                                            tp0Var4.m23996l(tp0Var4.f28457t, str2, j13);
                                            tp0Var2 = tp0Var4;
                                        } else {
                                            long mo24686b0 = tp0Var4.f28456s.mo24686b0();
                                            tp0Var3 = tp0Var4;
                                            if (mo24686b0 >= j12) {
                                                tp0Var3 = tp0Var4;
                                                if (j11 > 0) {
                                                    tp0Var2 = tp0Var4;
                                                }
                                            }
                                        }
                                    } else {
                                        tp0Var3 = this;
                                    }
                                    tp0Var3.m26641z(((Long) zzay.zzc().m21823b(AbstractC4554gx.f21406w)).longValue());
                                    return;
                                }
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            zzt.zzy().m20980g(tp0Var2.f28460w);
                            return;
                        }
                        throw new IOException("Abort requested before buffering finished. ");
                    }
                    throw new IOException("Timeout reached. Limit: " + longValue + " ms");
                } catch (Throwable th5) {
                    th = th5;
                    str = m26639x;
                    tp0Var = this;
                }
            }
        } catch (Throwable th6) {
            th = th6;
            tp0Var = booleanValue;
        }
    }

    @Override // com.google.android.gms.internal.ads.vm0
    public final void zzv() {
        yk0.zzj("Precache onRenderedFirstFrame");
    }
}
