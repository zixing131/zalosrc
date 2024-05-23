package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.InterfaceC4258a {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new C4256b();

    /* renamed from: p */
    final int f16733p;

    /* renamed from: q */
    private final HashMap f16734q = new HashMap();

    /* renamed from: r */
    private final SparseArray f16735r = new SparseArray();

    /* JADX INFO: Access modifiers changed from: package-private */
    public StringToIntConverter(int i11, ArrayList arrayList) {
        this.f16733p = i11;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            zac zacVar = (zac) arrayList.get(i12);
            m19854t(zacVar.f16739q, zacVar.f16740r);
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.InterfaceC4258a
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo19853d(Object obj) {
        String str = (String) this.f16735r.get(((Integer) obj).intValue());
        if (str == null && this.f16734q.containsKey("gms_unknown")) {
            return "gms_unknown";
        }
        return str;
    }

    /* renamed from: t */
    public StringToIntConverter m19854t(String str, int i11) {
        this.f16734q.put(str, Integer.valueOf(i11));
        this.f16735r.put(i11, str);
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f16733p);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f16734q.keySet()) {
            arrayList.add(new zac(str, ((Integer) this.f16734q.get(str)).intValue()));
        }
        AbstractC2552a.m12907A(parcel, 2, arrayList, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
