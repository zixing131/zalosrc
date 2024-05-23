package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.RemoteCreator;

/* loaded from: classes2.dex */
public final class l20 extends RemoteCreator {
    public l20() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    /* renamed from: a */
    public final o00 m24107a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        o00 m00Var;
        try {
            IBinder mo25367i2 = ((r00) getRemoteCreatorInstance(context)).mo25367i2(BinderC4273d.m19913I3(context), BinderC4273d.m19913I3(frameLayout), BinderC4273d.m19913I3(frameLayout2), 223104000);
            if (mo25367i2 == null) {
                return null;
            }
            IInterface queryLocalInterface = mo25367i2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            if (queryLocalInterface instanceof o00) {
                m00Var = (o00) queryLocalInterface;
            } else {
                m00Var = new m00(mo25367i2);
            }
            return m00Var;
        } catch (RemoteException e11) {
            e = e11;
            yk0.zzk("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e12) {
            e = e12;
            yk0.zzk("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (queryLocalInterface instanceof r00) {
            return (r00) queryLocalInterface;
        }
        return new p00(iBinder);
    }
}
