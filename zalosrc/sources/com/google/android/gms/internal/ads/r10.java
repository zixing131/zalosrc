package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class r10 extends AbstractBinderC4833og implements s10 {
    public r10() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    /* renamed from: N */
    public static s10 m25937N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        if (queryLocalInterface instanceof s10) {
            return (s10) queryLocalInterface;
        }
        return new q10(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        e10 c10Var;
        if (i11 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                c10Var = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                if (queryLocalInterface instanceof e10) {
                    c10Var = (e10) queryLocalInterface;
                } else {
                    c10Var = new c10(readStrongBinder);
                }
            }
            AbstractC4871pg.m25456c(parcel);
            mo25628y4(c10Var);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
