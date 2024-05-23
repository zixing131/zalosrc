package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzb extends LinkedHashMap {
    final /* synthetic */ zzc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzb(zzc zzcVar) {
        this.zza = zzcVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        int i11;
        ArrayDeque arrayDeque;
        int i12;
        synchronized (this.zza) {
            try {
                int size = size();
                zzc zzcVar = this.zza;
                i11 = zzcVar.zza;
                boolean z11 = false;
                if (size <= i11) {
                    return false;
                }
                arrayDeque = zzcVar.zzf;
                arrayDeque.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                int size2 = size();
                i12 = this.zza.zza;
                if (size2 > i12) {
                    z11 = true;
                }
                return z11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
