package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new C4261c();

    /* renamed from: p */
    final int f16765p;

    /* renamed from: q */
    private final HashMap f16766q;

    /* renamed from: r */
    private final String f16767r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zan(int i11, ArrayList arrayList, String str) {
        this.f16765p = i11;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            zal zalVar = (zal) arrayList.get(i12);
            String str2 = zalVar.f16760q;
            HashMap hashMap2 = new HashMap();
            int size2 = ((ArrayList) AbstractC4205o.m19722k(zalVar.f16761r)).size();
            for (int i13 = 0; i13 < size2; i13++) {
                zam zamVar = (zam) zalVar.f16761r.get(i13);
                hashMap2.put(zamVar.f16763q, zamVar.f16764r);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f16766q = hashMap;
        this.f16767r = (String) AbstractC4205o.m19722k(str);
        m19880J();
    }

    /* renamed from: F */
    public final Map m19879F(String str) {
        return (Map) this.f16766q.get(str);
    }

    /* renamed from: J */
    public final void m19880J() {
        Iterator it = this.f16766q.keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) this.f16766q.get((String) it.next());
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                ((FastJsonResponse.Field) map.get((String) it2.next())).m19871G0(this);
            }
        }
    }

    /* renamed from: t */
    public final String m19881t() {
        return this.f16767r;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (String str : this.f16766q.keySet()) {
            sb2.append(str);
            sb2.append(":\n");
            Map map = (Map) this.f16766q.get(str);
            for (String str2 : map.keySet()) {
                sb2.append("  ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(map.get(str2));
            }
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f16765p);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f16766q.keySet()) {
            arrayList.add(new zal(str, (Map) this.f16766q.get(str)));
        }
        AbstractC2552a.m12907A(parcel, 2, arrayList, false);
        AbstractC2552a.m12934w(parcel, 3, this.f16767r, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
