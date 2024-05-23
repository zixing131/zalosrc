package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public class zzt extends zzaz {
    public static final Parcelable.Creator<zzt> CREATOR = new C4023d();

    /* renamed from: w */
    private static final HashMap f15943w;

    /* renamed from: p */
    private final Set f15944p;

    /* renamed from: q */
    private final int f15945q;

    /* renamed from: r */
    private String f15946r;

    /* renamed from: s */
    private int f15947s;

    /* renamed from: t */
    private byte[] f15948t;

    /* renamed from: u */
    private PendingIntent f15949u;

    /* renamed from: v */
    private DeviceMetaData f15950v;

    static {
        HashMap hashMap = new HashMap();
        f15943w = hashMap;
        hashMap.put("accountType", FastJsonResponse.Field.m19864M("accountType", 2));
        hashMap.put("status", FastJsonResponse.Field.m19863K("status", 3));
        hashMap.put("transferBytes", FastJsonResponse.Field.m19867t("transferBytes", 4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzt(Set set, int i11, String str, int i12, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.f15944p = set;
        this.f15945q = i11;
        this.f15946r = str;
        this.f15947s = i12;
        this.f15948t = bArr;
        this.f15949u = pendingIntent;
        this.f15950v = deviceMetaData;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public /* synthetic */ Map mo19034a() {
        return f15943w;
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
                        return this.f15948t;
                    }
                    int m19873Z2 = field.m19873Z();
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Unknown SafeParcelable id=");
                    sb2.append(m19873Z2);
                    throw new IllegalStateException(sb2.toString());
                }
                return Integer.valueOf(this.f15947s);
            }
            return this.f15946r;
        }
        return Integer.valueOf(this.f15945q);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: d */
    public boolean mo19036d(FastJsonResponse.Field field) {
        return this.f15944p.contains(Integer.valueOf(field.m19873Z()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        Set set = this.f15944p;
        if (set.contains(1)) {
            AbstractC2552a.m12924m(parcel, 1, this.f15945q);
        }
        if (set.contains(2)) {
            AbstractC2552a.m12934w(parcel, 2, this.f15946r, true);
        }
        if (set.contains(3)) {
            AbstractC2552a.m12924m(parcel, 3, this.f15947s);
        }
        if (set.contains(4)) {
            AbstractC2552a.m12918g(parcel, 4, this.f15948t, true);
        }
        if (set.contains(5)) {
            AbstractC2552a.m12932u(parcel, 5, this.f15949u, i11, true);
        }
        if (set.contains(6)) {
            AbstractC2552a.m12932u(parcel, 6, this.f15950v, i11, true);
        }
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
