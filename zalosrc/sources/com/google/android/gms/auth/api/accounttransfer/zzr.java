package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public class zzr extends zzaz {
    public static final Parcelable.Creator<zzr> CREATOR = new C4022c();

    /* renamed from: v */
    private static final HashMap f15936v;

    /* renamed from: p */
    private final Set f15937p;

    /* renamed from: q */
    private final int f15938q;

    /* renamed from: r */
    private zzt f15939r;

    /* renamed from: s */
    private String f15940s;

    /* renamed from: t */
    private String f15941t;

    /* renamed from: u */
    private String f15942u;

    static {
        HashMap hashMap = new HashMap();
        f15936v = hashMap;
        hashMap.put("authenticatorInfo", FastJsonResponse.Field.m19861F("authenticatorInfo", 2, zzt.class));
        hashMap.put("signature", FastJsonResponse.Field.m19864M("signature", 3));
        hashMap.put("package", FastJsonResponse.Field.m19864M("package", 4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzr(Set set, int i11, zzt zztVar, String str, String str2, String str3) {
        this.f15937p = set;
        this.f15938q = i11;
        this.f15939r = zztVar;
        this.f15940s = str;
        this.f15941t = str2;
        this.f15942u = str3;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public /* synthetic */ Map mo19034a() {
        return f15936v;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: b */
    public Object mo19035b(FastJsonResponse.Field field) {
        int m19873Z = field.m19873Z();
        if (m19873Z != 1) {
            if (m19873Z != 2) {
                if (m19873Z != 3) {
                    if (m19873Z == 4) {
                        return this.f15941t;
                    }
                    int m19873Z2 = field.m19873Z();
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Unknown SafeParcelable id=");
                    sb2.append(m19873Z2);
                    throw new IllegalStateException(sb2.toString());
                }
                return this.f15940s;
            }
            return this.f15939r;
        }
        return Integer.valueOf(this.f15938q);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: d */
    public boolean mo19036d(FastJsonResponse.Field field) {
        return this.f15937p.contains(Integer.valueOf(field.m19873Z()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        Set set = this.f15937p;
        if (set.contains(1)) {
            AbstractC2552a.m12924m(parcel, 1, this.f15938q);
        }
        if (set.contains(2)) {
            AbstractC2552a.m12932u(parcel, 2, this.f15939r, i11, true);
        }
        if (set.contains(3)) {
            AbstractC2552a.m12934w(parcel, 3, this.f15940s, true);
        }
        if (set.contains(4)) {
            AbstractC2552a.m12934w(parcel, 4, this.f15941t, true);
        }
        if (set.contains(5)) {
            AbstractC2552a.m12934w(parcel, 5, this.f15942u, true);
        }
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
