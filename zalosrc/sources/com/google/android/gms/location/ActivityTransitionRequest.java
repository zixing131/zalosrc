package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import p031b5.AbstractC2552a;
import p093d6.C17767f0;

/* loaded from: classes2.dex */
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new C17767f0();

    /* renamed from: t */
    public static final Comparator f33472t = new C5889j();

    /* renamed from: p */
    private final List f33473p;

    /* renamed from: q */
    private final String f33474q;

    /* renamed from: r */
    private final List f33475r;

    /* renamed from: s */
    private String f33476s;

    public ActivityTransitionRequest(List list, String str, List list2, String str2) {
        boolean z11;
        List unmodifiableList;
        AbstractC4205o.m19723l(list, "transitions can't be null");
        if (list.size() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4205o.m19713b(z11, "transitions can't be empty.");
        AbstractC4205o.m19722k(list);
        TreeSet treeSet = new TreeSet(f33472t);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActivityTransition activityTransition = (ActivityTransition) it.next();
            AbstractC4205o.m19713b(treeSet.add(activityTransition), String.format("Found duplicated transition: %s.", activityTransition));
        }
        this.f33473p = Collections.unmodifiableList(list);
        this.f33474q = str;
        if (list2 == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list2);
        }
        this.f33475r = unmodifiableList;
        this.f33476s = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (AbstractC4199m.m19701a(this.f33473p, activityTransitionRequest.f33473p) && AbstractC4199m.m19701a(this.f33474q, activityTransitionRequest.f33474q) && AbstractC4199m.m19701a(this.f33476s, activityTransitionRequest.f33476s) && AbstractC4199m.m19701a(this.f33475r, activityTransitionRequest.f33475r)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i11;
        int i12;
        int hashCode = this.f33473p.hashCode() * 31;
        String str = this.f33474q;
        int i13 = 0;
        if (str != null) {
            i11 = str.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (hashCode + i11) * 31;
        List list = this.f33475r;
        if (list != null) {
            i12 = list.hashCode();
        } else {
            i12 = 0;
        }
        int i15 = (i14 + i12) * 31;
        String str2 = this.f33476s;
        if (str2 != null) {
            i13 = str2.hashCode();
        }
        return i15 + i13;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f33473p);
        String str = this.f33474q;
        String valueOf2 = String.valueOf(this.f33475r);
        String str2 = this.f33476s;
        int length = valueOf.length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 79 + length2 + valueOf2.length() + String.valueOf(str2).length());
        sb2.append("ActivityTransitionRequest [mTransitions=");
        sb2.append(valueOf);
        sb2.append(", mTag='");
        sb2.append(str);
        sb2.append("', mClients=");
        sb2.append(valueOf2);
        sb2.append(", mAttributionTag=");
        sb2.append(str2);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC4205o.m19722k(parcel);
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12907A(parcel, 1, this.f33473p, false);
        AbstractC2552a.m12934w(parcel, 2, this.f33474q, false);
        AbstractC2552a.m12907A(parcel, 3, this.f33475r, false);
        AbstractC2552a.m12934w(parcel, 4, this.f33476s, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
