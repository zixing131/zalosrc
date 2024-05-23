package com.zing.zalo.control;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import bo.C3043u0;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import org.json.JSONArray;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p716zh.C31869c6;
import p716zh.C32107s8;

/* loaded from: classes3.dex */
public class LinkAttachment implements Parcelable {
    public static final Parcelable.Creator<LinkAttachment> CREATOR = new C7885a();

    /* renamed from: p */
    public String f42624p;

    /* renamed from: q */
    public String f42625q;

    /* renamed from: r */
    public String f42626r;

    /* renamed from: s */
    public String f42627s;

    /* renamed from: t */
    public String f42628t;

    /* renamed from: u */
    public C3043u0 f42629u;

    /* renamed from: v */
    public C31869c6 f42630v;

    /* renamed from: w */
    public int f42631w;

    /* renamed from: x */
    public int f42632x;

    /* renamed from: y */
    public int f42633y;

    /* renamed from: z */
    public String f42634z;

    /* renamed from: com.zing.zalo.control.LinkAttachment$a */
    /* loaded from: classes3.dex */
    class C7885a implements Parcelable.Creator {
        C7885a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public LinkAttachment createFromParcel(Parcel parcel) {
            return new LinkAttachment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public LinkAttachment[] newArray(int i11) {
            return new LinkAttachment[i11];
        }
    }

    public LinkAttachment() {
        this.f42631w = 0;
        this.f42628t = "";
        this.f42627s = "";
        this.f42626r = "";
        this.f42625q = "";
        this.f42624p = "";
    }

    /* renamed from: a */
    public JSONObject m40547a() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f42624p;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            jSONObject.put(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, str);
            String str3 = this.f42625q;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("title", str3);
            JSONArray jSONArray = new JSONArray();
            if (!TextUtils.isEmpty(this.f42626r)) {
                jSONArray.put(this.f42626r);
            }
            jSONObject.put("thumbs", jSONArray);
            String str4 = this.f42627s;
            if (str4 == null) {
                str4 = "";
            }
            jSONObject.put("link_desc", str4);
            String str5 = this.f42628t;
            if (str5 != null) {
                str2 = str5;
            }
            jSONObject.put("src", str2);
            C3043u0 c3043u0 = this.f42629u;
            if (c3043u0 != null) {
                jSONObject.put("footerv2", c3043u0.m14623h());
            }
            C31869c6 c31869c6 = this.f42630v;
            if (c31869c6 != null) {
                jSONObject.put("media", c31869c6.m153174b());
            }
            jSONObject.put("tType", this.f42631w);
            jSONObject.put("tWidth", this.f42632x);
            jSONObject.put("tHeight", this.f42633y);
            String str6 = this.f42634z;
            if (str6 != null) {
                jSONObject.put("icon", str6);
            }
        } catch (Exception e11) {
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
        String str;
        parcel.writeString(this.f42624p);
        parcel.writeString(this.f42625q);
        parcel.writeString(this.f42626r);
        parcel.writeString(this.f42627s);
        parcel.writeString(this.f42628t);
        parcel.writeInt(this.f42631w);
        parcel.writeInt(this.f42632x);
        parcel.writeInt(this.f42633y);
        parcel.writeString(this.f42634z);
        C3043u0 c3043u0 = this.f42629u;
        String str2 = "";
        if (c3043u0 == null) {
            str = "";
        } else {
            str = c3043u0.m14623h().toString();
        }
        parcel.writeString(str);
        C31869c6 c31869c6 = this.f42630v;
        if (c31869c6 != null) {
            str2 = c31869c6.m153174b().toString();
        }
        parcel.writeString(str2);
    }

    public LinkAttachment(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        this.f42631w = 0;
        try {
            this.f42624p = jSONObject.isNull(ZMediaPlayer.OnNativeInvokeListener.ARG_URL) ? "" : jSONObject.getString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            this.f42625q = jSONObject.isNull("title") ? "" : jSONObject.getString("title");
            this.f42627s = jSONObject.isNull("link_desc") ? "" : jSONObject.getString("link_desc");
            this.f42628t = jSONObject.isNull("src") ? "" : jSONObject.getString("src");
            this.f42626r = "";
            if (jSONObject.has("thumbs")) {
                JSONArray jSONArray = jSONObject.getJSONArray("thumbs");
                if (jSONArray.length() > 0) {
                    this.f42626r = jSONArray.getString(0);
                }
            }
            if (jSONObject.has("footerv2") && (optJSONObject2 = jSONObject.optJSONObject("footerv2")) != null) {
                this.f42629u = new C3043u0(optJSONObject2);
            }
            if (jSONObject.has("media") && (optJSONObject = jSONObject.optJSONObject("media")) != null) {
                C31869c6 c31869c6 = new C31869c6(optJSONObject);
                this.f42630v = c31869c6;
                C32107s8 c32107s8 = c31869c6.f146358d;
                if (c32107s8 != null) {
                    c32107s8.f148013c = this.f42628t;
                }
            }
            if (jSONObject.has("tType")) {
                this.f42631w = AbstractC18069a.m96085d(jSONObject, "tType");
            }
            if (jSONObject.has("tWidth")) {
                this.f42632x = AbstractC18069a.m96085d(jSONObject, "tWidth");
            }
            if (jSONObject.has("tHeight")) {
                this.f42633y = AbstractC18069a.m96085d(jSONObject, "tHeight");
            }
            if (jSONObject.has("icon")) {
                this.f42634z = AbstractC18069a.m96089h(jSONObject, "icon");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    protected LinkAttachment(Parcel parcel) {
        this.f42631w = 0;
        this.f42624p = parcel.readString();
        this.f42625q = parcel.readString();
        this.f42626r = parcel.readString();
        this.f42627s = parcel.readString();
        this.f42628t = parcel.readString();
        this.f42631w = parcel.readInt();
        this.f42632x = parcel.readInt();
        this.f42633y = parcel.readInt();
        this.f42634z = parcel.readString();
        try {
            String readString = parcel.readString();
            if (!TextUtils.isEmpty(readString)) {
                this.f42629u = new C3043u0(new JSONObject(readString));
            }
            String readString2 = parcel.readString();
            if (TextUtils.isEmpty(readString2)) {
                return;
            }
            this.f42630v = new C31869c6(new JSONObject(readString2));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
