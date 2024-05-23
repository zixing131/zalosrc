package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class ef0 extends AbstractBinderC4833og implements ff0 {
    public ef0() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        jf0 jf0Var = null;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        if (i11 != 6) {
                            if (i11 != 7) {
                                return false;
                            }
                            String readString = parcel.readString();
                            IBinder readStrongBinder = parcel.readStrongBinder();
                            if (readStrongBinder != null) {
                                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                                if (queryLocalInterface instanceof jf0) {
                                    jf0Var = (jf0) queryLocalInterface;
                                } else {
                                    jf0Var = new hf0(readStrongBinder);
                                }
                            }
                            AbstractC4871pg.m25456c(parcel);
                            mo21364S3(readString, jf0Var);
                            parcel2.writeNoException();
                        } else {
                            zzcbc zzcbcVar = (zzcbc) AbstractC4871pg.m25454a(parcel, zzcbc.CREATOR);
                            IBinder readStrongBinder2 = parcel.readStrongBinder();
                            if (readStrongBinder2 != null) {
                                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                                if (queryLocalInterface2 instanceof jf0) {
                                    jf0Var = (jf0) queryLocalInterface2;
                                } else {
                                    jf0Var = new hf0(readStrongBinder2);
                                }
                            }
                            AbstractC4871pg.m25456c(parcel);
                            mo21363B2(zzcbcVar, jf0Var);
                            parcel2.writeNoException();
                        }
                    } else {
                        zzcbc zzcbcVar2 = (zzcbc) AbstractC4871pg.m25454a(parcel, zzcbc.CREATOR);
                        IBinder readStrongBinder3 = parcel.readStrongBinder();
                        if (readStrongBinder3 != null) {
                            IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                            if (queryLocalInterface3 instanceof jf0) {
                                jf0Var = (jf0) queryLocalInterface3;
                            } else {
                                jf0Var = new hf0(readStrongBinder3);
                            }
                        }
                        AbstractC4871pg.m25456c(parcel);
                        mo21366y3(zzcbcVar2, jf0Var);
                        parcel2.writeNoException();
                    }
                } else {
                    zzcbc zzcbcVar3 = (zzcbc) AbstractC4871pg.m25454a(parcel, zzcbc.CREATOR);
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                        if (queryLocalInterface4 instanceof jf0) {
                            jf0Var = (jf0) queryLocalInterface4;
                        } else {
                            jf0Var = new hf0(readStrongBinder4);
                        }
                    }
                    AbstractC4871pg.m25456c(parcel);
                    mo21365j3(zzcbcVar3, jf0Var);
                    parcel2.writeNoException();
                }
            } else {
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (queryLocalInterface5 instanceof gf0) {
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                parcel2.writeNoException();
            }
        } else {
            AbstractC4871pg.m25456c(parcel);
            parcel2.writeNoException();
            AbstractC4871pg.m25459f(parcel2, null);
        }
        return true;
    }
}
