package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;
import p669y4.AbstractC30284a;
import p669y4.InterfaceC30289f;

/* loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements InterfaceC30289f, ReflectedParcelable {

    /* renamed from: p */
    final int f16172p;

    /* renamed from: q */
    private final int f16173q;

    /* renamed from: r */
    private final String f16174r;

    /* renamed from: s */
    private final PendingIntent f16175s;

    /* renamed from: t */
    private final ConnectionResult f16176t;

    /* renamed from: u */
    public static final Status f16166u = new Status(-1);

    /* renamed from: v */
    public static final Status f16167v = new Status(0);

    /* renamed from: w */
    public static final Status f16168w = new Status(14);

    /* renamed from: x */
    public static final Status f16169x = new Status(8);

    /* renamed from: y */
    public static final Status f16170y = new Status(15);

    /* renamed from: z */
    public static final Status f16171z = new Status(16);

    /* renamed from: B */
    public static final Status f16165B = new Status(17);

    /* renamed from: A */
    public static final Status f16164A = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new C4075e();

    public Status(int i11, int i12, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f16172p = i11;
        this.f16173q = i12;
        this.f16174r = str;
        this.f16175s = pendingIntent;
        this.f16176t = connectionResult;
    }

    /* renamed from: F */
    public int m19220F() {
        return this.f16173q;
    }

    /* renamed from: J */
    public String m19221J() {
        return this.f16174r;
    }

    /* renamed from: K */
    public boolean m19222K() {
        return this.f16175s != null;
    }

    /* renamed from: M */
    public boolean m19223M() {
        return this.f16173q <= 0;
    }

    /* renamed from: Q */
    public final String m19224Q() {
        String str = this.f16174r;
        if (str != null) {
            return str;
        }
        return AbstractC30284a.m149433a(this.f16173q);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f16172p != status.f16172p || this.f16173q != status.f16173q || !AbstractC4199m.m19701a(this.f16174r, status.f16174r) || !AbstractC4199m.m19701a(this.f16175s, status.f16175s) || !AbstractC4199m.m19701a(this.f16176t, status.f16176t)) {
            return false;
        }
        return true;
    }

    @Override // p669y4.InterfaceC30289f
    public Status getStatus() {
        return this;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(Integer.valueOf(this.f16172p), Integer.valueOf(this.f16173q), this.f16174r, this.f16175s, this.f16176t);
    }

    /* renamed from: t */
    public ConnectionResult m19225t() {
        return this.f16176t;
    }

    public String toString() {
        AbstractC4199m.a m19703c = AbstractC4199m.m19703c(this);
        m19703c.m19704a("statusCode", m19224Q());
        m19703c.m19704a("resolution", this.f16175s);
        return m19703c.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, m19220F());
        AbstractC2552a.m12934w(parcel, 2, m19221J(), false);
        AbstractC2552a.m12932u(parcel, 3, this.f16175s, i11, false);
        AbstractC2552a.m12932u(parcel, 4, m19225t(), i11, false);
        AbstractC2552a.m12924m(parcel, 1000, this.f16172p);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    public Status(int i11) {
        this(i11, (String) null);
    }

    public Status(int i11, String str) {
        this(1, i11, str, null, null);
    }

    public Status(int i11, String str, PendingIntent pendingIntent) {
        this(1, i11, str, pendingIntent, null);
    }

    public Status(ConnectionResult connectionResult, String str) {
        this(connectionResult, str, 17);
    }

    public Status(ConnectionResult connectionResult, String str, int i11) {
        this(1, i11, str, connectionResult.m19185J(), connectionResult);
    }
}
