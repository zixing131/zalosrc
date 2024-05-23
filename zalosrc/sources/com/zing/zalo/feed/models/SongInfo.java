package com.zing.zalo.feed.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class SongInfo implements Parcelable {
    public static final Parcelable.Creator<SongInfo> CREATOR = new C8472a();

    /* renamed from: p */
    private String f45990p;

    /* renamed from: q */
    private String f45991q;

    /* renamed from: r */
    private boolean f45992r;

    /* renamed from: com.zing.zalo.feed.models.SongInfo$a */
    /* loaded from: classes4.dex */
    public static final class C8472a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SongInfo createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new SongInfo(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SongInfo[] newArray(int i11) {
            return new SongInfo[i11];
        }
    }

    public SongInfo(String str, String str2, boolean z11) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "name");
        this.f45990p = str;
        this.f45991q = str2;
        this.f45992r = z11;
    }

    /* renamed from: b */
    public static /* synthetic */ SongInfo m45179b(SongInfo songInfo, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = songInfo.f45990p;
        }
        if ((i11 & 2) != 0) {
            str2 = songInfo.f45991q;
        }
        if ((i11 & 4) != 0) {
            z11 = songInfo.f45992r;
        }
        return songInfo.m45180a(str, str2, z11);
    }

    /* renamed from: a */
    public final SongInfo m45180a(String str, String str2, boolean z11) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "name");
        return new SongInfo(str, str2, z11);
    }

    /* renamed from: c */
    public final boolean m45181c() {
        return this.f45992r;
    }

    /* renamed from: d */
    public final String m45182d() {
        return this.f45990p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m45183e() {
        return this.f45991q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SongInfo)) {
            return false;
        }
        SongInfo songInfo = (SongInfo) obj;
        return AbstractC19074t.m100204b(this.f45990p, songInfo.f45990p) && AbstractC19074t.m100204b(this.f45991q, songInfo.f45991q) && this.f45992r == songInfo.f45992r;
    }

    /* renamed from: f */
    public final void m45184f(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f45990p = str;
    }

    /* renamed from: g */
    public final void m45185g(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f45991q = str;
    }

    /* renamed from: h */
    public final JSONObject m45186h() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.f45990p);
        jSONObject.put("name", this.f45991q);
        jSONObject.put("show_lyr", this.f45992r ? 1 : 0);
        return jSONObject;
    }

    public int hashCode() {
        return (((this.f45990p.hashCode() * 31) + this.f45991q.hashCode()) * 31) + AbstractC2144f.m11520a(this.f45992r);
    }

    public String toString() {
        return "SongInfo(id=" + this.f45990p + ", name=" + this.f45991q + ", enableLyric=" + this.f45992r + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f45990p);
        parcel.writeString(this.f45991q);
        parcel.writeInt(this.f45992r ? 1 : 0);
    }

    public /* synthetic */ SongInfo(String str, String str2, boolean z11, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? true : z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SongInfo(JSONObject jSONObject) {
        this(null, null, false, 7, null);
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        try {
            String optString = jSONObject.optString("id");
            AbstractC19074t.m100207e(optString, "optString(...)");
            this.f45990p = optString;
            String optString2 = jSONObject.optString("name");
            AbstractC19074t.m100207e(optString2, "optString(...)");
            this.f45991q = optString2;
            boolean z11 = true;
            if (jSONObject.optInt("show_lyr", 1) != 1) {
                z11 = false;
            }
            this.f45992r = z11;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
