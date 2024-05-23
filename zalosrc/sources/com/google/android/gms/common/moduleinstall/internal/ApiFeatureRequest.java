package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import p031b5.AbstractC2552a;
import p122e5.C18203d;
import p150f5.C18722c;
import p669y4.InterfaceC30285b;

/* loaded from: classes2.dex */
public class ApiFeatureRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new C18722c();

    /* renamed from: t */
    private static final Comparator f16710t = new Comparator() { // from class: f5.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Feature feature = (Feature) obj;
            Feature feature2 = (Feature) obj2;
            Parcelable.Creator<ApiFeatureRequest> creator = ApiFeatureRequest.CREATOR;
            if (!feature.m19191t().equals(feature2.m19191t())) {
                return feature.m19191t().compareTo(feature2.m19191t());
            }
            return (feature.m19190F() > feature2.m19190F() ? 1 : (feature.m19190F() == feature2.m19190F() ? 0 : -1));
        }
    };

    /* renamed from: p */
    private final List f16711p;

    /* renamed from: q */
    private final boolean f16712q;

    /* renamed from: r */
    private final String f16713r;

    /* renamed from: s */
    private final String f16714s;

    public ApiFeatureRequest(List list, boolean z11, String str, String str2) {
        AbstractC4205o.m19722k(list);
        this.f16711p = list;
        this.f16712q = z11;
        this.f16713r = str;
        this.f16714s = str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public static ApiFeatureRequest m19835J(List list, boolean z11) {
        TreeSet treeSet = new TreeSet(f16710t);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((InterfaceC30285b) it.next()).mo34569b());
        }
        return new ApiFeatureRequest(new ArrayList(treeSet), z11, null, null);
    }

    /* renamed from: t */
    public static ApiFeatureRequest m19836t(C18203d c18203d) {
        return m19835J(c18203d.m97007a(), true);
    }

    /* renamed from: F */
    public List m19837F() {
        return this.f16711p;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        if (this.f16712q != apiFeatureRequest.f16712q || !AbstractC4199m.m19701a(this.f16711p, apiFeatureRequest.f16711p) || !AbstractC4199m.m19701a(this.f16713r, apiFeatureRequest.f16713r) || !AbstractC4199m.m19701a(this.f16714s, apiFeatureRequest.f16714s)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC4199m.m19702b(Boolean.valueOf(this.f16712q), this.f16711p, this.f16713r, this.f16714s);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12907A(parcel, 1, m19837F(), false);
        AbstractC2552a.m12914c(parcel, 2, this.f16712q);
        AbstractC2552a.m12934w(parcel, 3, this.f16713r, false);
        AbstractC2552a.m12934w(parcel, 4, this.f16714s, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
