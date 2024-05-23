package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.RemoteCreator;

/* loaded from: classes2.dex */
public final class kd0 extends RemoteCreator {
    public kd0() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    /* renamed from: a */
    public final od0 m23888a(Activity activity) {
        od0 md0Var;
        try {
            IBinder zze = ((rd0) getRemoteCreatorInstance(activity)).zze(BinderC4273d.m19913I3(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface instanceof od0) {
                md0Var = (od0) queryLocalInterface;
            } else {
                md0Var = new md0(zze);
            }
            return md0Var;
        } catch (RemoteException e11) {
            yk0.zzk("Could not create remote AdOverlay.", e11);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e12) {
            yk0.zzk("Could not create remote AdOverlay.", e12);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof rd0) {
            return (rd0) queryLocalInterface;
        }
        return new pd0(iBinder);
    }
}
