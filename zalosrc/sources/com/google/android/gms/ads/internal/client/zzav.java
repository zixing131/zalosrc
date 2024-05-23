package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.AbstractC4150d;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.AbstractC4593hz;
import com.google.android.gms.internal.ads.AbstractC5037ty;
import com.google.android.gms.internal.ads.rk0;
import com.google.android.gms.internal.ads.yk0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzav {
    private static final zzcc zza;

    static {
        zzcc zzcaVar;
        zzcc zzccVar = null;
        try {
            Object newInstance = zzau.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                yk0.zzj("ClientApi class is not an instance of IBinder.");
            } else {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    if (queryLocalInterface instanceof zzcc) {
                        zzcaVar = (zzcc) queryLocalInterface;
                    } else {
                        zzcaVar = new zzca(iBinder);
                    }
                    zzccVar = zzcaVar;
                }
            }
        } catch (Exception unused) {
            yk0.zzj("Failed to instantiate ClientApi class.");
        }
        zza = zzccVar;
    }

    private final Object zze() {
        zzcc zzccVar = zza;
        if (zzccVar != null) {
            try {
                return zzb(zzccVar);
            } catch (RemoteException e11) {
                yk0.zzk("Cannot invoke local loader using ClientApi class.", e11);
                return null;
            }
        }
        yk0.zzj("ClientApi class cannot be loaded.");
        return null;
    }

    private final Object zzf() {
        try {
            return zzc();
        } catch (RemoteException e11) {
            yk0.zzk("Cannot invoke remote loader.", e11);
            return null;
        }
    }

    protected abstract Object zza();

    protected abstract Object zzb(zzcc zzccVar) throws RemoteException;

    protected abstract Object zzc() throws RemoteException;

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzd(Context context, boolean z11) {
        boolean z12;
        boolean z13;
        Object zze;
        if (!z11) {
            zzaw.zzb();
            if (!rk0.m26110t(context, AbstractC4150d.f16480a)) {
                yk0.zze("Google Play Services is not available.");
                z11 = true;
            }
        }
        boolean z14 = false;
        if (DynamiteModule.m19918a(context, ModuleDescriptor.MODULE_ID) > DynamiteModule.m19919c(context, ModuleDescriptor.MODULE_ID)) {
            z12 = false;
        } else {
            z12 = true;
        }
        boolean z15 = z11 | (!z12);
        AbstractC4554gx.m22622c(context);
        if (!((Boolean) AbstractC5037ty.f28651a.m24091e()).booleanValue()) {
            if (((Boolean) AbstractC5037ty.f28652b.m24091e()).booleanValue()) {
                z13 = true;
                z14 = true;
                if (!z14) {
                    zze = zze();
                    if (zze == null && !z13) {
                        zze = zzf();
                    }
                } else {
                    Object zzf = zzf();
                    if (zzf == null) {
                        if (zzaw.zze().nextInt(((Long) AbstractC4593hz.f21966a.m24091e()).intValue()) == 0) {
                            Bundle bundle = new Bundle();
                            bundle.putString("action", "dynamite_load");
                            bundle.putInt("is_missing", 1);
                            zzaw.zzb().m26124o(context, zzaw.zzc().f32030p, "gmob-apps", bundle, true);
                        }
                    }
                    zze = zzf == null ? zze() : zzf;
                }
                if (zze != null) {
                    return zza();
                }
                return zze;
            }
            z14 = z15;
        }
        z13 = false;
        if (!z14) {
        }
        if (zze != null) {
        }
    }
}
