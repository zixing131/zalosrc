package com.zing.zalo.data.entity.chat.message;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class LastDeliveredSeenData implements Parcelable {

    /* renamed from: p */
    private long f42904p;

    /* renamed from: q */
    private long f42905q;
    public static final C7930a Companion = new C7930a(null);
    public static final Parcelable.Creator<LastDeliveredSeenData> CREATOR = new C7931b();

    /* renamed from: com.zing.zalo.data.entity.chat.message.LastDeliveredSeenData$a */
    /* loaded from: classes3.dex */
    public static final class C7930a {
        private C7930a() {
        }

        public /* synthetic */ C7930a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final LastDeliveredSeenData m41031a(String str) {
            if (str != null && str.length() != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new LastDeliveredSeenData(jSONObject.optLong("deliveredTS", -1L), jSONObject.optLong("seenTs", -1L));
                } catch (JSONException e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
            return null;
        }
    }

    /* renamed from: com.zing.zalo.data.entity.chat.message.LastDeliveredSeenData$b */
    /* loaded from: classes3.dex */
    public static final class C7931b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LastDeliveredSeenData createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new LastDeliveredSeenData(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LastDeliveredSeenData[] newArray(int i11) {
            return new LastDeliveredSeenData[i11];
        }
    }

    public LastDeliveredSeenData(long j11, long j12) {
        this.f42904p = j11;
        this.f42905q = j12;
    }

    /* renamed from: a */
    public final long m41028a() {
        return this.f42904p;
    }

    /* renamed from: b */
    public final long m41029b() {
        return this.f42905q;
    }

    /* renamed from: c */
    public final String m41030c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deliveredTS", this.f42904p);
            jSONObject.put("seenTs", this.f42905q);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100205c(jSONObject2);
            return jSONObject2;
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
            return "";
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LastDeliveredSeenData)) {
            return false;
        }
        LastDeliveredSeenData lastDeliveredSeenData = (LastDeliveredSeenData) obj;
        return this.f42904p == lastDeliveredSeenData.f42904p && this.f42905q == lastDeliveredSeenData.f42905q;
    }

    public int hashCode() {
        return (AbstractC2147g0.m11521a(this.f42904p) * 31) + AbstractC2147g0.m11521a(this.f42905q);
    }

    public String toString() {
        return "LastDeliveredSeenData(deliveredTS=" + this.f42904p + ", seenTs=" + this.f42905q + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeLong(this.f42904p);
        parcel.writeLong(this.f42905q);
    }
}
