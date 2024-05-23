package com.zing.zalo.config;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.Serializable;
import me0.AbstractC23121k5;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class VideoNativeCompressConfig implements Parcelable, Serializable {
    public static final Parcelable.Creator<VideoNativeCompressConfig> CREATOR = new C7863a();

    /* renamed from: p */
    private String f42311p;

    /* renamed from: q */
    private String f42312q;

    /* renamed from: r */
    private String f42313r;

    /* renamed from: s */
    private String f42314s;

    /* renamed from: t */
    private String f42315t;

    /* renamed from: u */
    private String f42316u;

    /* renamed from: com.zing.zalo.config.VideoNativeCompressConfig$a */
    /* loaded from: classes.dex */
    public static final class C7863a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VideoNativeCompressConfig createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new VideoNativeCompressConfig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final VideoNativeCompressConfig[] newArray(int i11) {
            return new VideoNativeCompressConfig[i11];
        }
    }

    public VideoNativeCompressConfig() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* renamed from: e */
    private final String m40326e(JSONObject jSONObject, String str, String str2) {
        String optString = jSONObject.optString(str, str2);
        AbstractC19074t.m100207e(optString, "value");
        if (optString.length() != 0 && !AbstractC19074t.m100204b("null", optString)) {
            str2 = optString;
        }
        AbstractC19074t.m100207e(str2, "value");
        return str2;
    }

    /* renamed from: p */
    private final void m40327p() {
        if (!AbstractC19074t.m100204b(this.f42311p, "360p") && !AbstractC19074t.m100204b(this.f42311p, "480p") && !AbstractC19074t.m100204b(this.f42311p, "720p") && !AbstractC19074t.m100204b(this.f42311p, "1080p") && !AbstractC19074t.m100204b(this.f42311p, "manual")) {
            this.f42311p = "480p";
        }
        this.f42312q = String.valueOf(AbstractC23121k5.m118605c(600000, 3000000, Integer.parseInt(this.f42312q)));
        this.f42313r = String.valueOf(AbstractC23121k5.m118605c(600000, 3000000, Integer.parseInt(this.f42313r)));
        if (!AbstractC19074t.m100204b(this.f42314s, "24") && !AbstractC19074t.m100204b(this.f42314s, "60") && !AbstractC19074t.m100204b(this.f42314s, "30")) {
            this.f42314s = "30";
        }
        if (!AbstractC19074t.m100204b(this.f42315t, "baseline") && !AbstractC19074t.m100204b(this.f42315t, "main") && !AbstractC19074t.m100204b(this.f42315t, "high")) {
            this.f42315t = "baseline";
        }
        if (!AbstractC19074t.m100204b(this.f42316u, "auto") && !AbstractC19074t.m100204b(this.f42316u, "fast")) {
            this.f42316u = "auto";
        }
    }

    /* renamed from: a */
    public final String m40328a() {
        return this.f42312q;
    }

    /* renamed from: b */
    public final String m40329b() {
        return this.f42313r;
    }

    /* renamed from: c */
    public final String m40330c() {
        return this.f42314s;
    }

    /* renamed from: d */
    public final int m40331d() {
        String str = this.f42314s;
        if (AbstractC19074t.m100204b(str, "24")) {
            return 24;
        }
        if (AbstractC19074t.m100204b(str, "60")) {
            return 60;
        }
        return 30;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoNativeCompressConfig)) {
            return false;
        }
        VideoNativeCompressConfig videoNativeCompressConfig = (VideoNativeCompressConfig) obj;
        return AbstractC19074t.m100204b(this.f42311p, videoNativeCompressConfig.f42311p) && AbstractC19074t.m100204b(this.f42312q, videoNativeCompressConfig.f42312q) && AbstractC19074t.m100204b(this.f42313r, videoNativeCompressConfig.f42313r) && AbstractC19074t.m100204b(this.f42314s, videoNativeCompressConfig.f42314s) && AbstractC19074t.m100204b(this.f42315t, videoNativeCompressConfig.f42315t) && AbstractC19074t.m100204b(this.f42316u, videoNativeCompressConfig.f42316u);
    }

    /* renamed from: f */
    public final String m40332f() {
        return this.f42316u;
    }

    /* renamed from: g */
    public final String m40333g() {
        return this.f42315t;
    }

    /* renamed from: h */
    public final String m40334h() {
        return this.f42311p;
    }

    public int hashCode() {
        return (((((((((this.f42311p.hashCode() * 31) + this.f42312q.hashCode()) * 31) + this.f42313r.hashCode()) * 31) + this.f42314s.hashCode()) * 31) + this.f42315t.hashCode()) * 31) + this.f42316u.hashCode();
    }

    /* renamed from: i */
    public final float m40335i() {
        String str = this.f42311p;
        if (AbstractC19074t.m100204b(str, "360p")) {
            return 360.0f;
        }
        if (AbstractC19074t.m100204b(str, "720p")) {
            return 720.0f;
        }
        return 480.0f;
    }

    /* renamed from: j */
    public final void m40336j(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f42312q = str;
    }

    /* renamed from: k */
    public final void m40337k(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f42313r = str;
    }

    /* renamed from: l */
    public final void m40338l(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f42314s = str;
    }

    /* renamed from: m */
    public final void m40339m(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f42316u = str;
    }

    /* renamed from: n */
    public final void m40340n(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f42315t = str;
    }

    /* renamed from: o */
    public final void m40341o(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f42311p = str;
    }

    /* renamed from: q */
    public final void m40342q(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            this.f42311p = m40326e(jSONObject, "resolution", "480p");
            this.f42312q = m40326e(jSONObject, "bitrate", "1300000");
            this.f42313r = m40326e(jSONObject, "bitrateBlend", "1300000");
            this.f42314s = m40326e(jSONObject, "frameRate", "30");
            this.f42315t = m40326e(jSONObject, "profile", "baseline");
            this.f42316u = m40326e(jSONObject, "preset", "auto");
            m40327p();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public String toString() {
        return "VideoNativeCompressConfig(resolution=" + this.f42311p + ", bitrate=" + this.f42312q + ", bitrateBlend=" + this.f42313r + ", frameRate=" + this.f42314s + ", profile=" + this.f42315t + ", preset=" + this.f42316u + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f42311p);
        parcel.writeString(this.f42312q);
        parcel.writeString(this.f42313r);
        parcel.writeString(this.f42314s);
        parcel.writeString(this.f42315t);
        parcel.writeString(this.f42316u);
    }

    public VideoNativeCompressConfig(String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC19074t.m100208f(str, "resolution");
        AbstractC19074t.m100208f(str2, "bitrate");
        AbstractC19074t.m100208f(str3, "bitrateBlend");
        AbstractC19074t.m100208f(str4, "frameRate");
        AbstractC19074t.m100208f(str5, "profile");
        AbstractC19074t.m100208f(str6, "preset");
        this.f42311p = str;
        this.f42312q = str2;
        this.f42313r = str3;
        this.f42314s = str4;
        this.f42315t = str5;
        this.f42316u = str6;
    }

    public /* synthetic */ VideoNativeCompressConfig(String str, String str2, String str3, String str4, String str5, String str6, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "480p" : str, (i11 & 2) != 0 ? "1300000" : str2, (i11 & 4) == 0 ? str3 : "1300000", (i11 & 8) != 0 ? "30" : str4, (i11 & 16) != 0 ? "baseline" : str5, (i11 & 32) != 0 ? "auto" : str6);
    }
}
