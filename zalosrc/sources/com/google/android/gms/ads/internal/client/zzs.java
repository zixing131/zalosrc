package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final long zzd;

    public zzs(int i11, int i12, String str, long j11) {
        this.zza = i11;
        this.zzb = i12;
        this.zzc = str;
        this.zzd = j11;
    }

    public static zzs zza(JSONObject jSONObject) throws JSONException {
        return new zzs(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.zza);
        AbstractC2552a.m12924m(parcel, 2, this.zzb);
        AbstractC2552a.m12934w(parcel, 3, this.zzc, false);
        AbstractC2552a.m12929r(parcel, 4, this.zzd);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
