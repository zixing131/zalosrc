package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.lang.reflect.Array;
import java.util.List;
import p031b5.AbstractC2552a;
import p093d6.C17763d0;

/* loaded from: classes2.dex */
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new C17763d0();

    /* renamed from: p */
    List f33462p;

    /* renamed from: q */
    long f33463q;

    /* renamed from: r */
    long f33464r;

    /* renamed from: s */
    int f33465s;

    /* renamed from: t */
    Bundle f33466t;

    public ActivityRecognitionResult(List list, long j11, long j12, int i11, Bundle bundle) {
        boolean z11;
        if (list != null && list.size() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4205o.m19713b(z11, "Must have at least 1 detected activity");
        AbstractC4205o.m19713b(j11 > 0 && j12 > 0, "Must set times");
        this.f33462p = list;
        this.f33463q = j11;
        this.f33464r = j12;
        this.f33465s = i11;
        this.f33466t = bundle;
    }

    /* renamed from: t */
    private static boolean m30591t(Bundle bundle, Bundle bundle2) {
        int length;
        if (bundle == null) {
            if (bundle2 == null) {
                return true;
            }
            return false;
        }
        if (bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj == null) {
                if (obj2 != null) {
                    return false;
                }
            } else if (obj instanceof Bundle) {
                if (!m30591t(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else {
                if (obj.getClass().isArray()) {
                    if (obj2 != null && obj2.getClass().isArray() && (length = Array.getLength(obj)) == Array.getLength(obj2)) {
                        for (int i11 = 0; i11 < length; i11++) {
                            if (AbstractC4199m.m19701a(Array.get(obj, i11), Array.get(obj2, i11))) {
                            }
                        }
                    }
                    return false;
                }
                if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            if (this.f33463q == activityRecognitionResult.f33463q && this.f33464r == activityRecognitionResult.f33464r && this.f33465s == activityRecognitionResult.f33465s && AbstractC4199m.m19701a(this.f33462p, activityRecognitionResult.f33462p) && m30591t(this.f33466t, activityRecognitionResult.f33466t)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC4199m.m19702b(Long.valueOf(this.f33463q), Long.valueOf(this.f33464r), Integer.valueOf(this.f33465s), this.f33462p, this.f33466t);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f33462p);
        long j11 = this.f33463q;
        long j12 = this.f33464r;
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 124);
        sb2.append("ActivityRecognitionResult [probableActivities=");
        sb2.append(valueOf);
        sb2.append(", timeMillis=");
        sb2.append(j11);
        sb2.append(", elapsedRealtimeMillis=");
        sb2.append(j12);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12907A(parcel, 1, this.f33462p, false);
        AbstractC2552a.m12929r(parcel, 2, this.f33463q);
        AbstractC2552a.m12929r(parcel, 3, this.f33464r);
        AbstractC2552a.m12924m(parcel, 4, this.f33465s);
        AbstractC2552a.m12916e(parcel, 5, this.f33466t, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
