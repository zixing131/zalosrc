package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.RemoteCreator;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class m20 extends RemoteCreator {
    public m20() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    /* renamed from: a */
    public final u00 m24448a(View view, HashMap hashMap, HashMap hashMap2) {
        u00 s00Var;
        try {
            IBinder mo27109a0 = ((x00) getRemoteCreatorInstance(view.getContext())).mo27109a0(BinderC4273d.m19913I3(view), BinderC4273d.m19913I3(hashMap), BinderC4273d.m19913I3(hashMap2));
            if (mo27109a0 == null) {
                return null;
            }
            IInterface queryLocalInterface = mo27109a0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            if (queryLocalInterface instanceof u00) {
                s00Var = (u00) queryLocalInterface;
            } else {
                s00Var = new s00(mo27109a0);
            }
            return s00Var;
        } catch (RemoteException e11) {
            e = e11;
            yk0.zzk("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e12) {
            e = e12;
            yk0.zzk("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        if (queryLocalInterface instanceof x00) {
            return (x00) queryLocalInterface;
        }
        return new v00(iBinder);
    }
}
