package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzcj;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class vr2 {

    /* renamed from: d */
    private static vr2 f29460d;

    /* renamed from: a */
    private final Context f29461a;

    /* renamed from: b */
    private final zzcj f29462b;

    /* renamed from: c */
    private final AtomicReference f29463c = new AtomicReference();

    vr2(Context context, zzcj zzcjVar) {
        this.f29461a = context;
        this.f29462b = zzcjVar;
    }

    /* renamed from: a */
    static zzcj m27335a(Context context) {
        try {
            return zzci.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e11) {
            yk0.zzh("Failed to retrieve lite SDK info.", e11);
            return null;
        }
    }

    /* renamed from: d */
    public static vr2 m27336d(Context context) {
        synchronized (vr2.class) {
            try {
                vr2 vr2Var = f29460d;
                if (vr2Var != null) {
                    return vr2Var;
                }
                Context applicationContext = context.getApplicationContext();
                long longValue = ((Long) AbstractC4335az.f17494b.m24091e()).longValue();
                zzcj zzcjVar = null;
                if (longValue > 0 && longValue <= 223104600) {
                    zzcjVar = m27335a(applicationContext);
                }
                vr2 vr2Var2 = new vr2(applicationContext, zzcjVar);
                f29460d = vr2Var2;
                return vr2Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final v90 m27337b() {
        return (v90) this.f29463c.get();
    }

    /* renamed from: c */
    public final zzcgv m27338c(int i11, boolean z11, int i12) {
        zzt.zzp();
        boolean zzA = zzs.zzA(this.f29461a);
        zzcgv zzcgvVar = new zzcgv(223104000, i12, true, zzA);
        if (((Boolean) AbstractC4335az.f17495c.m24091e()).booleanValue()) {
            zzcj zzcjVar = this.f29462b;
            zzeh zzehVar = null;
            if (zzcjVar != null) {
                try {
                    zzehVar = zzcjVar.getLiteSdkVersion();
                } catch (RemoteException unused) {
                }
            }
            if (zzehVar == null) {
                return zzcgvVar;
            }
            return new zzcgv(223104000, zzehVar.zza(), true, zzA);
        }
        return zzcgvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m27339e(v90 v90Var) {
        v90 adapterCreator;
        if (((Boolean) AbstractC4335az.f17493a.m24091e()).booleanValue()) {
            zzcj zzcjVar = this.f29462b;
            if (zzcjVar != null) {
                try {
                    adapterCreator = zzcjVar.getAdapterCreator();
                } catch (RemoteException unused) {
                }
                AtomicReference atomicReference = this.f29463c;
                if (adapterCreator != null) {
                    v90Var = adapterCreator;
                }
                ur2.m27046a(atomicReference, null, v90Var);
                return;
            }
            adapterCreator = null;
            AtomicReference atomicReference2 = this.f29463c;
            if (adapterCreator != null) {
            }
            ur2.m27046a(atomicReference2, null, v90Var);
            return;
        }
        ur2.m27046a(this.f29463c, null, v90Var);
    }
}
