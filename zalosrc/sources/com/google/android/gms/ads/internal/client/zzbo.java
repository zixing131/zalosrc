package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.j10;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.p10;
import com.google.android.gms.internal.ads.s10;
import com.google.android.gms.internal.ads.v60;
import com.google.android.gms.internal.ads.w10;
import com.google.android.gms.internal.ads.z10;
import com.google.android.gms.internal.ads.zzbls;
import com.google.android.gms.internal.ads.zzbsc;

/* loaded from: classes2.dex */
public interface zzbo extends IInterface {
    zzbl zze() throws RemoteException;

    void zzf(j10 j10Var) throws RemoteException;

    void zzg(m10 m10Var) throws RemoteException;

    void zzh(String str, s10 s10Var, p10 p10Var) throws RemoteException;

    void zzi(v60 v60Var) throws RemoteException;

    void zzj(w10 w10Var, zzq zzqVar) throws RemoteException;

    void zzk(z10 z10Var) throws RemoteException;

    void zzl(zzbf zzbfVar) throws RemoteException;

    void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void zzn(zzbsc zzbscVar) throws RemoteException;

    void zzo(zzbls zzblsVar) throws RemoteException;

    void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void zzq(zzcd zzcdVar) throws RemoteException;
}
