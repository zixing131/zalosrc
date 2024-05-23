package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC4273d;

/* loaded from: classes2.dex */
public final class gh0 {
    /* renamed from: a */
    public static final ug0 m22437a(Context context, String str, v90 v90Var) {
        ug0 sg0Var;
        try {
            IBinder zze = ((yg0) bl0.m20569b(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new al0() { // from class: com.google.android.gms.internal.ads.fh0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.al0
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    if (queryLocalInterface instanceof yg0) {
                        return (yg0) queryLocalInterface;
                    }
                    return new yg0(obj);
                }
            })).zze(BinderC4273d.m19913I3(context), str, v90Var, 223104000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            if (queryLocalInterface instanceof ug0) {
                sg0Var = (ug0) queryLocalInterface;
            } else {
                sg0Var = new sg0(zze);
            }
            return sg0Var;
        } catch (RemoteException e11) {
            e = e11;
            yk0.zzl("#007 Could not call remote method.", e);
            return null;
        } catch (zzcgs e12) {
            e = e12;
            yk0.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
