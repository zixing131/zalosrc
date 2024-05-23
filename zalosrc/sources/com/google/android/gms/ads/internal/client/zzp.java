package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.internal.ads.rk0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzp {
    public static final zzp zza = new zzp();

    protected zzp() {
    }

    public final zzl zza(Context context, zzdr zzdrVar) {
        long j11;
        Context context2;
        List list;
        zzc zzcVar;
        zzfb zzfbVar;
        String str;
        String str2;
        Date zzo = zzdrVar.zzo();
        if (zzo != null) {
            j11 = zzo.getTime();
        } else {
            j11 = -1;
        }
        long j12 = j11;
        String zzl = zzdrVar.zzl();
        int zza2 = zzdrVar.zza();
        Set zzr = zzdrVar.zzr();
        if (!zzr.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(zzr));
            context2 = context;
        } else {
            context2 = context;
            list = null;
        }
        boolean zzt = zzdrVar.zzt(context2);
        Bundle zzf = zzdrVar.zzf(AdMobAdapter.class);
        AdInfo zzi = zzdrVar.zzi();
        if (zzi != null) {
            QueryInfo queryInfo = zzi.getQueryInfo();
            if (queryInfo != null) {
                str2 = queryInfo.zza().zzc();
            } else {
                str2 = "";
            }
            zzcVar = new zzc(zzdrVar.zzi().getAdString(), str2);
        } else {
            zzcVar = null;
        }
        String zzm = zzdrVar.zzm();
        SearchAdRequest zzj = zzdrVar.zzj();
        if (zzj != null) {
            zzfbVar = new zzfb(zzj);
        } else {
            zzfbVar = null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzaw.zzb();
            str = rk0.m26108r(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean zzs = zzdrVar.zzs();
        RequestConfiguration zzc = zzed.zzf().zzc();
        return new zzl(8, j12, zzf, zza2, list, zzt, Math.max(zzdrVar.zzc(), zzc.getTagForChildDirectedTreatment()), false, zzm, zzfbVar, null, zzl, zzdrVar.zzg(), zzdrVar.zze(), Collections.unmodifiableList(new ArrayList(zzdrVar.zzq())), zzdrVar.zzn(), str, zzs, zzcVar, Math.max(-1, zzc.getTagForUnderAgeOfConsent()), (String) Collections.max(Arrays.asList(null, zzc.getMaxAdContentRating()), new Comparator() { // from class: com.google.android.gms.ads.internal.client.zzo
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list2 = RequestConfiguration.zza;
                return list2.indexOf((String) obj) - list2.indexOf((String) obj2);
            }
        }), zzdrVar.zzp(), zzdrVar.zzb(), zzdrVar.zzk());
    }
}
