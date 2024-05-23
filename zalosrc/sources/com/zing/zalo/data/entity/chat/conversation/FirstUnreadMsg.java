package com.zing.zalo.data.entity.chat.conversation;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class FirstUnreadMsg implements Parcelable {

    /* renamed from: p */
    private final long f42902p;

    /* renamed from: q */
    private final long f42903q;
    public static final C7928a Companion = new C7928a(null);
    public static final Parcelable.Creator<FirstUnreadMsg> CREATOR = new C7929b();

    /* renamed from: com.zing.zalo.data.entity.chat.conversation.FirstUnreadMsg$a */
    /* loaded from: classes3.dex */
    public static final class C7928a {
        private C7928a() {
        }

        public /* synthetic */ C7928a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final FirstUnreadMsg m41025a(String str) {
            if (str == null || str.length() == 0 || TextUtils.isDigitsOnly(str)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                long optLong = jSONObject.optLong("globalMsgId", -1L);
                long optLong2 = jSONObject.optLong("timestamp", -1L);
                if (optLong != -1 && optLong != 0 && optLong2 != -1 && optLong2 != 0) {
                    return new FirstUnreadMsg(optLong, optLong2);
                }
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
            }
            return null;
        }
    }

    /* renamed from: com.zing.zalo.data.entity.chat.conversation.FirstUnreadMsg$b */
    /* loaded from: classes3.dex */
    public static final class C7929b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FirstUnreadMsg createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new FirstUnreadMsg(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FirstUnreadMsg[] newArray(int i11) {
            return new FirstUnreadMsg[i11];
        }
    }

    public FirstUnreadMsg(long j11, long j12) {
        this.f42902p = j11;
        this.f42903q = j12;
    }

    /* renamed from: a */
    public final long m41022a() {
        return this.f42902p;
    }

    /* renamed from: b */
    public final long m41023b() {
        return this.f42903q;
    }

    /* renamed from: c */
    public final String m41024c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("globalMsgId", this.f42902p);
            jSONObject.put("timestamp", this.f42903q);
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirstUnreadMsg)) {
            return false;
        }
        FirstUnreadMsg firstUnreadMsg = (FirstUnreadMsg) obj;
        return this.f42902p == firstUnreadMsg.f42902p && this.f42903q == firstUnreadMsg.f42903q;
    }

    public int hashCode() {
        return (AbstractC2147g0.m11521a(this.f42902p) * 31) + AbstractC2147g0.m11521a(this.f42903q);
    }

    public String toString() {
        return "FirstUnreadMsg(globalMsgId=" + this.f42902p + ", indexTimestamp=" + this.f42903q + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeLong(this.f42902p);
        parcel.writeLong(this.f42903q);
    }
}
