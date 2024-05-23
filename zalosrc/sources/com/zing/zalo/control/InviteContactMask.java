package com.zing.zalo.control;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class InviteContactMask implements Parcelable {
    public static final Parcelable.Creator<InviteContactMask> CREATOR = new C7879a();

    /* renamed from: p */
    public boolean f42534p;

    /* renamed from: q */
    public String f42535q;

    /* renamed from: r */
    public CharSequence f42536r;

    /* renamed from: s */
    public int f42537s;

    /* renamed from: com.zing.zalo.control.InviteContactMask$a */
    /* loaded from: classes3.dex */
    class C7879a implements Parcelable.Creator {
        C7879a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InviteContactMask createFromParcel(Parcel parcel) {
            return new InviteContactMask(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InviteContactMask[] newArray(int i11) {
            return new InviteContactMask[i11];
        }
    }

    public InviteContactMask(int i11, String str) {
        this.f42534p = true;
        this.f42535q = str;
        this.f42537s = i11;
    }

    /* renamed from: a */
    public JSONObject m40481a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isMasked", this.f42534p);
            jSONObject.put("searchText", this.f42535q);
            jSONObject.put("maskedText", this.f42536r);
            jSONObject.put("maskType", this.f42537s);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f42534p ? 1 : 0);
        parcel.writeString(this.f42535q);
        parcel.writeString(String.valueOf(this.f42536r));
        parcel.writeInt(this.f42537s);
    }

    public InviteContactMask(Parcel parcel) {
        this.f42534p = true;
        this.f42537s = 1;
        this.f42534p = parcel.readInt() == 1;
        this.f42535q = parcel.readString();
        this.f42536r = parcel.readString();
        this.f42537s = parcel.readInt();
    }

    public InviteContactMask(JSONObject jSONObject) {
        this.f42534p = true;
        this.f42537s = 1;
        if (jSONObject != null) {
            this.f42534p = jSONObject.optBoolean("isMasked", true);
            this.f42535q = jSONObject.optString("searchText");
            this.f42536r = jSONObject.optString("maskedText");
            this.f42537s = jSONObject.optInt("maskType", 1);
        }
    }
}
