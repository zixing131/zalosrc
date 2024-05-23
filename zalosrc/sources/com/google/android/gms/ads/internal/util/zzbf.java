package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbf {
    private final String[] zza;
    private final double[] zzb;
    private final double[] zzc;
    private final int[] zzd;
    private int zze;

    public /* synthetic */ zzbf(zzbd zzbdVar, zzbe zzbeVar) {
        List list;
        List list2;
        List list3;
        List list4;
        list = zzbdVar.zzb;
        int size = list.size();
        list2 = zzbdVar.zza;
        this.zza = (String[]) list2.toArray(new String[size]);
        list3 = zzbdVar.zzb;
        this.zzb = zzc(list3);
        list4 = zzbdVar.zzc;
        this.zzc = zzc(list4);
        this.zzd = new int[size];
        this.zze = 0;
    }

    private static final double[] zzc(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i11 = 0; i11 < size; i11++) {
            dArr[i11] = ((Double) list.get(i11)).doubleValue();
        }
        return dArr;
    }

    public final List zza() {
        ArrayList arrayList = new ArrayList(this.zza.length);
        int i11 = 0;
        while (true) {
            String[] strArr = this.zza;
            if (i11 < strArr.length) {
                String str = strArr[i11];
                double d11 = this.zzc[i11];
                double d12 = this.zzb[i11];
                int i12 = this.zzd[i11];
                arrayList.add(new zzbc(str, d11, d12, i12 / this.zze, i12));
                i11++;
            } else {
                return arrayList;
            }
        }
    }

    public final void zzb(double d11) {
        this.zze++;
        int i11 = 0;
        while (true) {
            double[] dArr = this.zzc;
            if (i11 < dArr.length) {
                double d12 = dArr[i11];
                if (d12 <= d11 && d11 < this.zzb[i11]) {
                    int[] iArr = this.zzd;
                    iArr[i11] = iArr[i11] + 1;
                }
                if (d11 >= d12) {
                    i11++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
