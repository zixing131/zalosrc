package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.AbstractBinderC4833og;
import com.google.android.gms.internal.ads.AbstractC4871pg;
import com.google.android.gms.internal.ads.i10;
import com.google.android.gms.internal.ads.j10;
import com.google.android.gms.internal.ads.l10;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.o10;
import com.google.android.gms.internal.ads.p10;
import com.google.android.gms.internal.ads.r10;
import com.google.android.gms.internal.ads.s10;
import com.google.android.gms.internal.ads.u60;
import com.google.android.gms.internal.ads.v10;
import com.google.android.gms.internal.ads.v60;
import com.google.android.gms.internal.ads.w10;
import com.google.android.gms.internal.ads.y10;
import com.google.android.gms.internal.ads.z10;
import com.google.android.gms.internal.ads.zzbls;
import com.google.android.gms.internal.ads.zzbsc;

/* loaded from: classes2.dex */
public abstract class zzbn extends AbstractBinderC4833og implements zzbo {
    public zzbn() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        zzbf zzbfVar = null;
        zzcd zzcdVar = null;
        switch (i11) {
            case 1:
                zzbl zze = zze();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zze);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof zzbf) {
                        zzbfVar = (zzbf) queryLocalInterface;
                    } else {
                        zzbfVar = new zzbd(readStrongBinder);
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                zzl(zzbfVar);
                parcel2.writeNoException();
                return true;
            case 3:
                j10 m23107N = i10.m23107N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzf(m23107N);
                parcel2.writeNoException();
                return true;
            case 4:
                m10 m24103N = l10.m24103N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzg(m24103N);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                s10 m25937N = r10.m25937N(parcel.readStrongBinder());
                p10 m25053N = o10.m25053N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzh(readString, m25937N, m25053N);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbls zzblsVar = (zzbls) AbstractC4871pg.m25454a(parcel, zzbls.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                zzo(zzblsVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface2 instanceof zzcd) {
                        zzcdVar = (zzcd) queryLocalInterface2;
                    } else {
                        zzcdVar = new zzcd(readStrongBinder2);
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                zzq(zzcdVar);
                parcel2.writeNoException();
                return true;
            case 8:
                w10 m27120N = v10.m27120N(parcel.readStrongBinder());
                zzq zzqVar = (zzq) AbstractC4871pg.m25454a(parcel, zzq.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                zzj(m27120N, zzqVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) AbstractC4871pg.m25454a(parcel, PublisherAdViewOptions.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                zzp(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                z10 m28106N = y10.m28106N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzk(m28106N);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbsc zzbscVar = (zzbsc) AbstractC4871pg.m25454a(parcel, zzbsc.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                zzn(zzbscVar);
                parcel2.writeNoException();
                return true;
            case 14:
                v60 m26861N = u60.m26861N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzi(m26861N);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) AbstractC4871pg.m25454a(parcel, AdManagerAdViewOptions.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                zzm(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
