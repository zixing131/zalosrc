package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.C4534gd;
import com.google.android.gms.internal.ads.C4793nd;
import com.google.android.gms.internal.ads.InterfaceC4681kd;
import com.google.android.gms.internal.ads.a13;
import com.google.android.gms.internal.ads.kl0;
import com.google.android.gms.internal.ads.o13;
import com.google.android.gms.internal.ads.rk0;
import com.google.android.gms.internal.ads.xz2;
import com.google.android.gms.internal.ads.yk0;
import com.google.android.gms.internal.ads.zzcgv;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzi implements Runnable, InterfaceC4681kd {
    protected boolean zza;
    private final boolean zzf;
    private final boolean zzg;
    private final Executor zzh;
    private final xz2 zzi;
    private Context zzj;
    private final Context zzk;
    private zzcgv zzl;
    private final zzcgv zzm;
    private final boolean zzn;
    private int zzo;
    private final List zzc = new Vector();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    final CountDownLatch zzb = new CountDownLatch(1);

    public zzi(Context context, zzcgv zzcgvVar) {
        this.zzj = context;
        this.zzk = context;
        this.zzl = zzcgvVar;
        this.zzm = zzcgvVar;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.zzh = newCachedThreadPool;
        boolean booleanValue = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21143V1)).booleanValue();
        this.zzn = booleanValue;
        this.zzi = xz2.m28090a(context, newCachedThreadPool, booleanValue);
        this.zzf = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21103R1)).booleanValue();
        this.zzg = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21152W1)).booleanValue();
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21133U1)).booleanValue()) {
            this.zzo = 2;
        } else {
            this.zzo = 1;
        }
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20984F2)).booleanValue()) {
            this.zza = zzc();
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21429y2)).booleanValue()) {
            kl0.f23363a.execute(this);
            return;
        }
        zzaw.zzb();
        if (rk0.m26112v()) {
            kl0.f23363a.execute(this);
        } else {
            run();
        }
    }

    private final InterfaceC4681kd zzj() {
        if (zzi() == 2) {
            return (InterfaceC4681kd) this.zze.get();
        }
        return (InterfaceC4681kd) this.zzd.get();
    }

    private final void zzm() {
        InterfaceC4681kd zzj = zzj();
        if (!this.zzc.isEmpty() && zzj != null) {
            for (Object[] objArr : this.zzc) {
                int length = objArr.length;
                if (length == 1) {
                    zzj.zzk((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    zzj.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.zzc.clear();
        }
    }

    private final void zzo(boolean z11) {
        this.zzd.set(C4793nd.m24886q(this.zzl.f32030p, zzp(this.zzj), z11, this.zzo));
    }

    private static final Context zzp(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return context;
        }
        return applicationContext;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20984F2)).booleanValue()) {
                this.zza = zzc();
            }
            boolean z11 = this.zzl.f32033s;
            final boolean z12 = false;
            if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21092Q0)).booleanValue() && z11) {
                z12 = true;
            }
            if (zzi() == 1) {
                zzo(z12);
                if (this.zzo == 2) {
                    this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzg
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzi.this.zzb(z12);
                        }
                    });
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    C4534gd m22414a = C4534gd.m22414a(this.zzl.f32030p, zzp(this.zzj), z12, this.zzn);
                    this.zze.set(m22414a);
                    if (this.zzg && !m22414a.m22425j()) {
                        this.zzo = 1;
                        zzo(z12);
                    }
                } catch (NullPointerException e11) {
                    this.zzo = 1;
                    zzo(z12);
                    this.zzi.m28094c(2031, System.currentTimeMillis() - currentTimeMillis, e11);
                }
            }
            this.zzb.countDown();
            this.zzj = null;
            this.zzl = null;
        } catch (Throwable th2) {
            this.zzb.countDown();
            this.zzj = null;
            this.zzl = null;
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(boolean z11) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C4534gd.m22414a(this.zzm.f32030p, zzp(this.zzk), z11, this.zzn).m22424h();
        } catch (NullPointerException e11) {
            this.zzi.m28094c(2027, System.currentTimeMillis() - currentTimeMillis, e11);
        }
    }

    protected final boolean zzc() {
        Context context = this.zzj;
        xz2 xz2Var = this.zzi;
        zzh zzhVar = new zzh(this);
        return new o13(this.zzj, a13.m19957b(context, xz2Var), zzhVar, ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21113S1)).booleanValue()).m25066d(1);
    }

    public final boolean zzd() {
        try {
            this.zzb.await();
            return true;
        } catch (InterruptedException e11) {
            yk0.zzk("Interrupted during GADSignals creation.", e11);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4681kd
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4681kd
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (zzd()) {
            InterfaceC4681kd zzj = zzj();
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21365r8)).booleanValue()) {
                zzt.zzp();
                com.google.android.gms.ads.internal.util.zzs.zzF(view, 4, null);
            }
            if (zzj != null) {
                zzm();
                return zzj.zzf(zzp(context), str, view, activity);
            }
            return "";
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4681kd
    public final String zzg(Context context) {
        InterfaceC4681kd zzj;
        if (zzd() && (zzj = zzj()) != null) {
            zzm();
            return zzj.zzg(zzp(context));
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4681kd
    public final String zzh(Context context, View view, Activity activity) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21355q8)).booleanValue()) {
            if (zzd()) {
                InterfaceC4681kd zzj = zzj();
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21365r8)).booleanValue()) {
                    zzt.zzp();
                    com.google.android.gms.ads.internal.util.zzs.zzF(view, 2, null);
                }
                if (zzj != null) {
                    return zzj.zzh(context, view, activity);
                }
                return "";
            }
            return "";
        }
        InterfaceC4681kd zzj2 = zzj();
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21365r8)).booleanValue()) {
            zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzF(view, 2, null);
        }
        if (zzj2 != null) {
            return zzj2.zzh(context, view, activity);
        }
        return "";
    }

    protected final int zzi() {
        if (!this.zzf || this.zza) {
            return this.zzo;
        }
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4681kd
    public final void zzk(MotionEvent motionEvent) {
        InterfaceC4681kd zzj = zzj();
        if (zzj != null) {
            zzm();
            zzj.zzk(motionEvent);
        } else {
            this.zzc.add(new Object[]{motionEvent});
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4681kd
    public final void zzl(int i11, int i12, int i13) {
        InterfaceC4681kd zzj = zzj();
        if (zzj != null) {
            zzm();
            zzj.zzl(i11, i12, i13);
        } else {
            this.zzc.add(new Object[]{Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)});
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4681kd
    public final void zzn(View view) {
        InterfaceC4681kd zzj = zzj();
        if (zzj != null) {
            zzj.zzn(view);
        }
    }
}
