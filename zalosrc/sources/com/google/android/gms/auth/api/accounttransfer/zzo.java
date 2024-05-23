package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.List;
import java.util.Map;
import p031b5.AbstractC2552a;
import p665y0.C30239a;

/* loaded from: classes2.dex */
public class zzo extends zzaz {
    public static final Parcelable.Creator<zzo> CREATOR = new C4021b();

    /* renamed from: v */
    private static final C30239a f15929v;

    /* renamed from: p */
    private final int f15930p;

    /* renamed from: q */
    private List f15931q;

    /* renamed from: r */
    private List f15932r;

    /* renamed from: s */
    private List f15933s;

    /* renamed from: t */
    private List f15934t;

    /* renamed from: u */
    private List f15935u;

    static {
        C30239a c30239a = new C30239a();
        f15929v = c30239a;
        c30239a.put("registered", FastJsonResponse.Field.m19865Q("registered", 2));
        c30239a.put("in_progress", FastJsonResponse.Field.m19865Q("in_progress", 3));
        c30239a.put("success", FastJsonResponse.Field.m19865Q("success", 4));
        c30239a.put("failed", FastJsonResponse.Field.m19865Q("failed", 5));
        c30239a.put("escrowed", FastJsonResponse.Field.m19865Q("escrowed", 6));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(int i11, List list, List list2, List list3, List list4, List list5) {
        this.f15930p = i11;
        this.f15931q = list;
        this.f15932r = list2;
        this.f15933s = list3;
        this.f15934t = list4;
        this.f15935u = list5;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public Map mo19034a() {
        return f15929v;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: b */
    public Object mo19035b(FastJsonResponse.Field field) {
        switch (field.m19873Z()) {
            case 1:
                return Integer.valueOf(this.f15930p);
            case 2:
                return this.f15931q;
            case 3:
                return this.f15932r;
            case 4:
                return this.f15933s;
            case 5:
                return this.f15934t;
            case 6:
                return this.f15935u;
            default:
                int m19873Z = field.m19873Z();
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Unknown SafeParcelable id=");
                sb2.append(m19873Z);
                throw new IllegalStateException(sb2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: d */
    public boolean mo19036d(FastJsonResponse.Field field) {
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f15930p);
        AbstractC2552a.m12936y(parcel, 2, this.f15931q, false);
        AbstractC2552a.m12936y(parcel, 3, this.f15932r, false);
        AbstractC2552a.m12936y(parcel, 4, this.f15933s, false);
        AbstractC2552a.m12936y(parcel, 5, this.f15934t, false);
        AbstractC2552a.m12936y(parcel, 6, this.f15935u, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
