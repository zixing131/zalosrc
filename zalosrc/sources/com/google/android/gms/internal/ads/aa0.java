package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
import com.zing.zalo.zinstant.zom.node.ZOM;

/* loaded from: classes2.dex */
public abstract class aa0 extends AbstractBinderC4833og implements ba0 {
    public aa0() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* renamed from: N */
    public static ba0 m20041N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if (queryLocalInterface instanceof ba0) {
            return (ba0) queryLocalInterface;
        }
        return new z90(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        switch (i11) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int readInt = parcel.readInt();
                AbstractC4871pg.m25456c(parcel);
                mo20448b(readInt);
                break;
            case 4:
                zzn();
                break;
            case 5:
                zzp();
                break;
            case 6:
                zzo();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof fa0) {
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                mo20453q4(readString, readString2);
                break;
            case 10:
                d10.m21246N(parcel.readStrongBinder());
                parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                break;
            case 11:
                zzv();
                break;
            case 12:
                parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                break;
            case 13:
                mo20451k();
                break;
            case 14:
                zzcce zzcceVar = (zzcce) AbstractC4871pg.m25454a(parcel, zzcce.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                mo20443B0(zzcceVar);
                break;
            case 15:
                mo20449g();
                break;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                rg0 m25706N = qg0.m25706N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                mo20446N3(m25706N);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                AbstractC4871pg.m25456c(parcel);
                mo20444D(readInt2);
                break;
            case 18:
                mo20447a();
                break;
            case 19:
                AbstractC4871pg.m25456c(parcel);
                break;
            case 20:
                zzx();
                break;
            case 21:
                String readString3 = parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                mo20454x(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                mo20450g0(readInt3, readString4);
                break;
            case 23:
                zze zzeVar = (zze) AbstractC4871pg.m25454a(parcel, zze.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                mo20452o0(zzeVar);
                break;
            case 24:
                zze zzeVar2 = (zze) AbstractC4871pg.m25454a(parcel, zze.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                mo20455z(zzeVar2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
