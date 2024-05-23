package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.zing.zalo.zinstant.zom.node.ZOM;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class ConnectionResult extends AbstractSafeParcelable {

    /* renamed from: p */
    final int f16137p;

    /* renamed from: q */
    private final int f16138q;

    /* renamed from: r */
    private final PendingIntent f16139r;

    /* renamed from: s */
    private final String f16140s;

    /* renamed from: t */
    public static final ConnectionResult f16136t = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new C4157g();

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConnectionResult(int i11, int i12, PendingIntent pendingIntent, String str) {
        this.f16137p = i11;
        this.f16138q = i12;
        this.f16139r = pendingIntent;
        this.f16140s = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public static String m19183Q(int i11) {
        if (i11 != 99) {
            if (i11 != 1500) {
                switch (i11) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i11) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            default:
                                return "UNKNOWN_ERROR_CODE(" + i11 + ")";
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    /* renamed from: F */
    public String m19184F() {
        return this.f16140s;
    }

    /* renamed from: J */
    public PendingIntent m19185J() {
        return this.f16139r;
    }

    /* renamed from: K */
    public boolean m19186K() {
        return (this.f16138q == 0 || this.f16139r == null) ? false : true;
    }

    /* renamed from: M */
    public boolean m19187M() {
        return this.f16138q == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        if (this.f16138q == connectionResult.f16138q && AbstractC4199m.m19701a(this.f16139r, connectionResult.f16139r) && AbstractC4199m.m19701a(this.f16140s, connectionResult.f16140s)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(Integer.valueOf(this.f16138q), this.f16139r, this.f16140s);
    }

    /* renamed from: t */
    public int m19188t() {
        return this.f16138q;
    }

    public String toString() {
        AbstractC4199m.a m19703c = AbstractC4199m.m19703c(this);
        m19703c.m19704a("statusCode", m19183Q(this.f16138q));
        m19703c.m19704a("resolution", this.f16139r);
        m19703c.m19704a("message", this.f16140s);
        return m19703c.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f16137p);
        AbstractC2552a.m12924m(parcel, 2, m19188t());
        AbstractC2552a.m12932u(parcel, 3, m19185J(), i11, false);
        AbstractC2552a.m12934w(parcel, 4, m19184F(), false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    public ConnectionResult(int i11) {
        this(i11, null, null);
    }

    public ConnectionResult(int i11, PendingIntent pendingIntent) {
        this(i11, pendingIntent, null);
    }

    public ConnectionResult(int i11, PendingIntent pendingIntent, String str) {
        this(1, i11, pendingIntent, str);
    }
}
