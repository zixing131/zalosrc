package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzl extends zzaz {
    public static final Parcelable.Creator<zzl> CREATOR = new C4020a();

    /* renamed from: u */
    private static final HashMap f15923u;

    /* renamed from: p */
    private final Set f15924p;

    /* renamed from: q */
    private final int f15925q;

    /* renamed from: r */
    private ArrayList f15926r;

    /* renamed from: s */
    private int f15927s;

    /* renamed from: t */
    private zzo f15928t;

    static {
        HashMap hashMap = new HashMap();
        f15923u = hashMap;
        hashMap.put("authenticatorData", FastJsonResponse.Field.m19862J("authenticatorData", 2, zzr.class));
        hashMap.put("progress", FastJsonResponse.Field.m19861F("progress", 4, zzo.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzl(Set set, int i11, ArrayList arrayList, int i12, zzo zzoVar) {
        this.f15924p = set;
        this.f15925q = i11;
        this.f15926r = arrayList;
        this.f15927s = i12;
        this.f15928t = zzoVar;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public final /* synthetic */ Map mo19034a() {
        return f15923u;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: b */
    public final Object mo19035b(FastJsonResponse.Field field) {
        int m19873Z = field.m19873Z();
        if (m19873Z != 1) {
            if (m19873Z != 2) {
                if (m19873Z == 4) {
                    return this.f15928t;
                }
                int m19873Z2 = field.m19873Z();
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Unknown SafeParcelable id=");
                sb2.append(m19873Z2);
                throw new IllegalStateException(sb2.toString());
            }
            return this.f15926r;
        }
        return Integer.valueOf(this.f15925q);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: d */
    public final boolean mo19036d(FastJsonResponse.Field field) {
        return this.f15924p.contains(Integer.valueOf(field.m19873Z()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        Set set = this.f15924p;
        if (set.contains(1)) {
            AbstractC2552a.m12924m(parcel, 1, this.f15925q);
        }
        if (set.contains(2)) {
            AbstractC2552a.m12907A(parcel, 2, this.f15926r, true);
        }
        if (set.contains(3)) {
            AbstractC2552a.m12924m(parcel, 3, this.f15927s);
        }
        if (set.contains(4)) {
            AbstractC2552a.m12932u(parcel, 4, this.f15928t, i11, true);
        }
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
