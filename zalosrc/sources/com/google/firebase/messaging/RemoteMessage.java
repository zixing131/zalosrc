package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.messaging.AbstractC6611e;
import java.util.Map;

/* loaded from: classes3.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new C6633n0();

    /* renamed from: p */
    Bundle f36591p;

    /* renamed from: q */
    private Map f36592q;

    public RemoteMessage(Bundle bundle) {
        this.f36591p = bundle;
    }

    /* renamed from: F */
    private int m33751F(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        if ("normal".equals(str)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: J */
    public int m33752J() {
        String string = this.f36591p.getString("google.original_priority");
        if (string == null) {
            string = this.f36591p.getString("google.priority");
        }
        return m33751F(string);
    }

    /* renamed from: K */
    public int m33753K() {
        String string = this.f36591p.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(this.f36591p.getString("google.priority_reduced"))) {
                return 2;
            }
            string = this.f36591p.getString("google.priority");
        }
        return m33751F(string);
    }

    /* renamed from: M */
    public long m33754M() {
        Object obj = this.f36591p.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof String) {
            try {
                return Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid sent time: ");
                sb2.append(obj);
                return 0L;
            }
        }
        return 0L;
    }

    /* renamed from: t */
    public Map m33755t() {
        if (this.f36592q == null) {
            this.f36592q = AbstractC6611e.a.m33814a(this.f36591p);
        }
        return this.f36592q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        C6633n0.m33922c(this, parcel, i11);
    }
}
