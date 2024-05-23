package com.zing.zalo;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class SensitiveExtraData implements Parcelable {
    public static final C6916a CREATOR = new C6916a(null);

    /* renamed from: p */
    private final JSONObject f37898p;

    /* renamed from: com.zing.zalo.SensitiveExtraData$a */
    /* loaded from: classes.dex */
    public static final class C6916a implements Parcelable.Creator {
        private C6916a() {
        }

        public /* synthetic */ C6916a(AbstractC19060k abstractC19060k) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SensitiveExtraData createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new SensitiveExtraData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SensitiveExtraData[] newArray(int i11) {
            return new SensitiveExtraData[i11];
        }
    }

    public SensitiveExtraData() {
        this.f37898p = new JSONObject();
    }

    /* renamed from: a */
    private final void m35532a(String str, Object obj) {
        if (!this.f37898p.has(str) && this.f37898p.length() >= 100) {
            return;
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.length() > 100) {
                obj = str2.substring(0, 100);
                AbstractC19074t.m100207e(obj, "this as java.lang.String…ing(startIndex, endIndex)");
            }
        }
        this.f37898p.put(str, obj);
    }

    /* renamed from: b */
    public final JSONObject m35533b() {
        return this.f37898p;
    }

    /* renamed from: c */
    public final void m35534c(String str, Object obj) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(obj, "value");
        m35532a(str, obj);
    }

    /* renamed from: d */
    public final void m35535d(String str, String str2) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(str2, "value");
        m35532a(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final void m35536e(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "key");
        m35532a(str, Boolean.valueOf(z11));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "parcel");
        parcel.writeString(this.f37898p.toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SensitiveExtraData(Parcel parcel) {
        this();
        AbstractC19074t.m100208f(parcel, "parcel");
        String readString = parcel.readString();
        JSONObject jSONObject = new JSONObject(readString == null ? "" : readString);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            this.f37898p.put(next, jSONObject.get(next));
        }
    }
}
