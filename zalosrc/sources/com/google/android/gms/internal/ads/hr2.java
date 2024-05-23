package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class hr2 {
    /* renamed from: a */
    public static zzq m23005a(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jq2 jq2Var = (jq2) it.next();
            if (jq2Var.f22954c) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(jq2Var.f22952a, jq2Var.f22953b));
            }
        }
        return new zzq(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    /* renamed from: b */
    public static jq2 m23006b(List list, jq2 jq2Var) {
        return (jq2) list.get(0);
    }

    /* renamed from: c */
    public static jq2 m23007c(zzq zzqVar) {
        return zzqVar.zzi ? new jq2(-3, 0, true) : new jq2(zzqVar.zze, zzqVar.zzb, false);
    }
}
