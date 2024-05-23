package com.zing.zalo.social.controls;

import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.control.ContactProfile;
import ho0.AbstractC20110a;
import java.io.Serializable;
import org.json.JSONObject;
import p304ks.AbstractC21935u;

/* loaded from: classes5.dex */
public class LikeContactItem implements Serializable, Parcelable {
    public static final Parcelable.Creator<LikeContactItem> CREATOR = new C10860a();

    /* renamed from: p */
    private String f54781p;

    /* renamed from: q */
    private String f54782q;

    /* renamed from: r */
    private String f54783r;

    /* renamed from: s */
    private int f54784s;

    /* renamed from: com.zing.zalo.social.controls.LikeContactItem$a */
    /* loaded from: classes5.dex */
    class C10860a implements Parcelable.Creator {
        C10860a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LikeContactItem createFromParcel(Parcel parcel) {
            return new LikeContactItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public LikeContactItem[] newArray(int i11) {
            return new LikeContactItem[i11];
        }
    }

    public LikeContactItem(Parcel parcel) {
        try {
            this.f54781p = parcel.readString();
            this.f54782q = parcel.readString();
            this.f54783r = parcel.readString();
            this.f54784s = parcel.readInt();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: a */
    public String m56330a() {
        return this.f54783r;
    }

    /* renamed from: b */
    public String m56331b() {
        return AbstractC21935u.m114542i(this.f54781p, this.f54782q);
    }

    /* renamed from: c */
    public int m56332c() {
        return this.f54784s;
    }

    /* renamed from: d */
    public String m56333d() {
        return this.f54781p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public JSONObject m56334e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uid", this.f54781p);
            jSONObject.put("dpn", this.f54782q);
            jSONObject.put("avt", this.f54783r);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        try {
            parcel.writeString(this.f54781p);
            parcel.writeString(this.f54782q);
            parcel.writeString(this.f54783r);
            parcel.writeInt(this.f54784s);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    public LikeContactItem(String str, String str2, String str3) {
        this.f54781p = str;
        this.f54782q = str2;
        this.f54783r = str3;
    }

    public LikeContactItem(JSONObject jSONObject) {
        this.f54781p = "";
        this.f54782q = "";
        this.f54783r = "";
        this.f54784s = 0;
        try {
            if (jSONObject.has("uid")) {
                this.f54781p = jSONObject.getString("uid");
            }
            if (jSONObject.has("dpn")) {
                this.f54782q = jSONObject.getString("dpn");
            }
            if (jSONObject.has("avt")) {
                this.f54783r = jSONObject.getString("avt");
            }
            if (jSONObject.has("reaction_info")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("reaction_info");
                if (jSONObject2.has("id")) {
                    this.f54784s = jSONObject2.getInt("id");
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    public LikeContactItem(ContactProfile contactProfile) {
        if (contactProfile != null) {
            this.f54781p = contactProfile.f42434r;
            this.f54782q = contactProfile.f42437s;
            this.f54783r = contactProfile.f42446v;
        }
    }
}
