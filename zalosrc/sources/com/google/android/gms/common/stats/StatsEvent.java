package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* loaded from: classes2.dex */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    /* renamed from: t */
    public abstract String mo19882t();

    public final String toString() {
        return zzc() + "\t" + zza() + "\t" + zzb() + mo19882t();
    }

    public abstract int zza();

    public abstract long zzb();

    public abstract long zzc();
}
