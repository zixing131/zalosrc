package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzd;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.android.gms.ads.nonagon.signalgeneration.zzc;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public abstract class vs0 implements fy0 {

    /* renamed from: a */
    private static vs0 f29475a;

    /* renamed from: d */
    private static synchronized vs0 m27342d(Context context, v90 v90Var, int i11, boolean z11, int i12, yt0 yt0Var) {
        synchronized (vs0.class) {
            try {
                vs0 vs0Var = f29475a;
                if (vs0Var != null) {
                    return vs0Var;
                }
                AbstractC4554gx.m22622c(context);
                vr2 m27336d = vr2.m27336d(context);
                zzcgv m27338c = m27336d.m27338c(223104000, false, i12);
                m27336d.m27339e(v90Var);
                iv0 iv0Var = new iv0(null);
                ws0 ws0Var = new ws0();
                ws0Var.m27710d(m27338c);
                ws0Var.m27709c(context);
                iv0Var.m23425b(new ys0(ws0Var, null));
                iv0Var.m23426c(new ww0(yt0Var, null));
                vs0 m23424a = iv0Var.m23424a();
                zzt.zzo().m22943r(context, m27338c);
                zzt.zzc().m27995i(context);
                zzt.zzp().zzj(context);
                zzt.zzp().zzi(context);
                zzd.zza(context);
                zzt.zzb().m24017d(context);
                zzt.zzv().zzb(context);
                ej0.m21727d(context);
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21312m5)).booleanValue()) {
                    if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21367s0)).booleanValue()) {
                        C4808ns c4808ns = new C4808ns(new C5031ts(context));
                        i12 i12Var = new i12(new e12(context), m23424a.mo22591C());
                        zzt.zzp();
                        new f22(context, m27338c, c4808ns, i12Var, UUID.randomUUID().toString(), m23424a.mo22589A()).m21869b(zzt.zzo().m22936h().zzP());
                    }
                }
                f29475a = m23424a;
                return m23424a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public static vs0 m27343e(Context context, v90 v90Var, int i11) {
        return m27342d(context, v90Var, 223104000, false, i11, new yt0());
    }

    /* renamed from: A */
    public abstract rv2 mo22589A();

    /* renamed from: B */
    public abstract xw2 mo22590B();

    /* renamed from: C */
    public abstract uc3 mo22591C();

    @Override // com.google.android.gms.internal.ads.fy0
    /* renamed from: a */
    public final li2 mo22252a(zzcbc zzcbcVar, int i11) {
        return mo22608t(new zj2(zzcbcVar, i11));
    }

    /* renamed from: b */
    public abstract Executor mo22592b();

    /* renamed from: c */
    public abstract ScheduledExecutorService mo22593c();

    /* renamed from: f */
    public abstract hx0 mo22594f();

    /* renamed from: g */
    public abstract t01 mo22595g();

    /* renamed from: h */
    public abstract e11 mo22596h();

    /* renamed from: i */
    public abstract o21 mo22597i();

    /* renamed from: j */
    public abstract na1 mo22598j();

    /* renamed from: k */
    public abstract kh1 mo22599k();

    /* renamed from: l */
    public abstract gi1 mo22600l();

    /* renamed from: m */
    public abstract rp1 mo22601m();

    /* renamed from: n */
    public abstract mu1 mo22602n();

    /* renamed from: o */
    public abstract cw1 mo22603o();

    /* renamed from: p */
    public abstract v22 mo22604p();

    /* renamed from: q */
    public abstract zzc mo22605q();

    /* renamed from: r */
    public abstract zzg mo22606r();

    /* renamed from: s */
    public abstract zzaa mo22607s();

    /* renamed from: t */
    protected abstract li2 mo22608t(zj2 zj2Var);

    /* renamed from: u */
    public abstract zk2 mo22609u();

    /* renamed from: v */
    public abstract om2 mo22610v();

    /* renamed from: w */
    public abstract lo2 mo22611w();

    /* renamed from: x */
    public abstract bq2 mo22612x();

    /* renamed from: y */
    public abstract or2 mo22613y();

    /* renamed from: z */
    public abstract zr2 mo22614z();
}
