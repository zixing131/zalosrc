package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.Map;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new C4262d();

    /* renamed from: p */
    final int f16759p;

    /* renamed from: q */
    final String f16760q;

    /* renamed from: r */
    final ArrayList f16761r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zal(int i11, String str, ArrayList arrayList) {
        this.f16759p = i11;
        this.f16760q = str;
        this.f16761r = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f16759p);
        AbstractC2552a.m12934w(parcel, 2, this.f16760q, false);
        AbstractC2552a.m12907A(parcel, 3, this.f16761r, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zal(String str, Map map) {
        ArrayList arrayList;
        this.f16759p = 1;
        this.f16760q = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, (FastJsonResponse.Field) map.get(str2)));
            }
        }
        this.f16761r = arrayList;
    }
}
