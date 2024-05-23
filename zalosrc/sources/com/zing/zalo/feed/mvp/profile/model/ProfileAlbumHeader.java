package com.zing.zalo.feed.mvp.profile.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.mvp.profile.model.SmartCropInfo;
import com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class ProfileAlbumHeader implements Parcelable {
    public static final Parcelable.Creator<ProfileAlbumHeader> CREATOR = new C8663a();

    /* renamed from: A */
    private int f46684A;

    /* renamed from: B */
    private int f46685B;

    /* renamed from: C */
    private int f46686C;

    /* renamed from: D */
    private boolean f46687D;

    /* renamed from: E */
    private PrivacyInfo f46688E;

    /* renamed from: F */
    private ThemeItem f46689F;

    /* renamed from: G */
    private SmartCropInfo f46690G;

    /* renamed from: p */
    private long f46691p;

    /* renamed from: q */
    private int f46692q;

    /* renamed from: r */
    private String f46693r;

    /* renamed from: s */
    private String f46694s;

    /* renamed from: t */
    private String f46695t;

    /* renamed from: u */
    private String f46696u;

    /* renamed from: v */
    private long f46697v;

    /* renamed from: w */
    private long f46698w;

    /* renamed from: x */
    private boolean f46699x;

    /* renamed from: y */
    private int f46700y;

    /* renamed from: z */
    private int f46701z;

    /* renamed from: com.zing.zalo.feed.mvp.profile.model.ProfileAlbumHeader$a */
    /* loaded from: classes4.dex */
    public static final class C8663a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final ProfileAlbumHeader createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new ProfileAlbumHeader(parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, (PrivacyInfo) parcel.readParcelable(ProfileAlbumHeader.class.getClassLoader()), (ThemeItem) parcel.readParcelable(ProfileAlbumHeader.class.getClassLoader()), SmartCropInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final ProfileAlbumHeader[] newArray(int i11) {
            return new ProfileAlbumHeader[i11];
        }
    }

    public ProfileAlbumHeader(long j11, int i11, String str, String str2, String str3, String str4, long j12, long j13, boolean z11, int i12, int i13, int i14, int i15, int i16, boolean z12, PrivacyInfo privacyInfo, ThemeItem themeItem, SmartCropInfo smartCropInfo) {
        AbstractC19074t.m100208f(str, "cover");
        AbstractC19074t.m100208f(str2, "title");
        AbstractC19074t.m100208f(str3, "desc");
        AbstractC19074t.m100208f(str4, "textPrivacy");
        AbstractC19074t.m100208f(privacyInfo, "privacy");
        AbstractC19074t.m100208f(themeItem, "themeInfo");
        AbstractC19074t.m100208f(smartCropInfo, "smartCropInfo");
        this.f46691p = j11;
        this.f46692q = i11;
        this.f46693r = str;
        this.f46694s = str2;
        this.f46695t = str3;
        this.f46696u = str4;
        this.f46697v = j12;
        this.f46698w = j13;
        this.f46699x = z11;
        this.f46700y = i12;
        this.f46701z = i13;
        this.f46684A = i14;
        this.f46685B = i15;
        this.f46686C = i16;
        this.f46687D = z12;
        this.f46688E = privacyInfo;
        this.f46689F = themeItem;
        this.f46690G = smartCropInfo;
    }

    /* renamed from: B */
    public final void m46269B(PrivacyInfo privacyInfo) {
        AbstractC19074t.m100208f(privacyInfo, "<set-?>");
        this.f46688E = privacyInfo;
    }

    /* renamed from: C */
    public final void m46270C(ThemeItem themeItem) {
        AbstractC19074t.m100208f(themeItem, "<set-?>");
        this.f46689F = themeItem;
    }

    /* renamed from: D */
    public final void m46271D(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f46694s = str;
    }

    /* renamed from: F */
    public final void m46272F(int i11) {
        this.f46701z = i11;
    }

    /* renamed from: a */
    public final String m46273a() {
        return this.f46693r;
    }

    /* renamed from: b */
    public final String m46274b() {
        return this.f46695t;
    }

    /* renamed from: c */
    public final boolean m46275c() {
        return this.f46687D;
    }

    /* renamed from: d */
    public final boolean m46276d() {
        return this.f46699x;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final long m46277e() {
        return this.f46691p;
    }

    /* renamed from: f */
    public final long m46278f() {
        return this.f46697v;
    }

    /* renamed from: g */
    public final long m46279g() {
        return this.f46698w;
    }

    /* renamed from: h */
    public final int m46280h() {
        return this.f46686C;
    }

    /* renamed from: i */
    public final int m46281i() {
        return Math.max(0, this.f46701z - this.f46684A);
    }

    /* renamed from: j */
    public final PrivacyInfo m46282j() {
        return this.f46688E;
    }

    /* renamed from: k */
    public final int m46283k() {
        return this.f46685B;
    }

    /* renamed from: l */
    public final SmartCropInfo m46284l() {
        return this.f46690G;
    }

    /* renamed from: m */
    public final ThemeItem m46285m() {
        return this.f46689F;
    }

    /* renamed from: n */
    public final String m46286n() {
        return this.f46694s;
    }

    /* renamed from: o */
    public final int m46287o() {
        return this.f46701z;
    }

    /* renamed from: p */
    public final int m46288p() {
        return this.f46692q;
    }

    /* renamed from: q */
    public final int m46289q() {
        return this.f46684A;
    }

    /* renamed from: t */
    public final void m46290t(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f46693r = str;
    }

    /* renamed from: u */
    public final void m46291u(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f46695t = str;
    }

    /* renamed from: w */
    public final void m46292w(boolean z11) {
        this.f46699x = z11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeLong(this.f46691p);
        parcel.writeInt(this.f46692q);
        parcel.writeString(this.f46693r);
        parcel.writeString(this.f46694s);
        parcel.writeString(this.f46695t);
        parcel.writeString(this.f46696u);
        parcel.writeLong(this.f46697v);
        parcel.writeLong(this.f46698w);
        parcel.writeInt(this.f46699x ? 1 : 0);
        parcel.writeInt(this.f46700y);
        parcel.writeInt(this.f46701z);
        parcel.writeInt(this.f46684A);
        parcel.writeInt(this.f46685B);
        parcel.writeInt(this.f46686C);
        parcel.writeInt(this.f46687D ? 1 : 0);
        parcel.writeParcelable(this.f46688E, i11);
        parcel.writeParcelable(this.f46689F, i11);
        this.f46690G.writeToParcel(parcel, i11);
    }

    /* renamed from: x */
    public final void m46293x(long j11) {
        this.f46697v = j11;
    }

    /* renamed from: y */
    public final void m46294y(long j11) {
        this.f46698w = j11;
    }

    /* renamed from: z */
    public final void m46295z(int i11) {
        this.f46686C = i11;
    }

    public /* synthetic */ ProfileAlbumHeader(long j11, int i11, String str, String str2, String str3, String str4, long j12, long j13, boolean z11, int i12, int i13, int i14, int i15, int i16, boolean z12, PrivacyInfo privacyInfo, ThemeItem themeItem, SmartCropInfo smartCropInfo, int i17, AbstractC19060k abstractC19060k) {
        this((i17 & 1) != 0 ? 0L : j11, (i17 & 2) != 0 ? 0 : i11, (i17 & 4) != 0 ? "" : str, (i17 & 8) != 0 ? "" : str2, (i17 & 16) != 0 ? "" : str3, (i17 & 32) == 0 ? str4 : "", (i17 & 64) != 0 ? 0L : j12, (i17 & 128) == 0 ? j13 : 0L, (i17 & 256) != 0 ? false : z11, (i17 & 512) != 0 ? 0 : i12, (i17 & 1024) != 0 ? 0 : i13, (i17 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? 0 : i14, (i17 & 4096) != 0 ? 0 : i15, (i17 & 8192) != 0 ? 0 : i16, (i17 & 16384) != 0 ? true : z12, (i17 & 32768) != 0 ? new PrivacyInfo() : privacyInfo, (i17 & 65536) != 0 ? ThemeItem.Companion.m46365a() : themeItem, (i17 & 131072) != 0 ? new SmartCropInfo(0, 0, 0, 0, 15, (AbstractC19060k) null) : smartCropInfo);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfileAlbumHeader(JSONObject jSONObject) {
        this(0L, 0, null, null, null, null, 0L, 0L, false, 0, 0, 0, 0, 0, false, null, null, null, 262143, null);
        AbstractC19074t.m100208f(jSONObject, "json");
        try {
        } catch (Exception e11) {
            e = e11;
        }
        try {
            this.f46691p = jSONObject.optLong("id");
            String optString = jSONObject.optString("cover");
            AbstractC19074t.m100207e(optString, "optString(...)");
            this.f46693r = optString;
            String optString2 = jSONObject.optString("title");
            AbstractC19074t.m100207e(optString2, "optString(...)");
            this.f46694s = optString2;
            String optString3 = jSONObject.optString("desc");
            AbstractC19074t.m100207e(optString3, "optString(...)");
            this.f46695t = optString3;
            String optString4 = jSONObject.optString("textPrivacy");
            AbstractC19074t.m100207e(optString4, "optString(...)");
            this.f46696u = optString4;
            this.f46697v = jSONObject.optLong("lastAlbumId");
            this.f46698w = jSONObject.optLong("lastPhotoId");
            boolean z11 = true;
            if (jSONObject.optInt("hasMore") != 1) {
                z11 = false;
            }
            this.f46699x = z11;
            this.f46700y = jSONObject.optInt("dataSize");
            this.f46701z = jSONObject.optInt("totalSize");
            this.f46684A = jSONObject.optInt("videoSize");
            this.f46686C = jSONObject.optInt("page");
            this.f46692q = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
            this.f46685B = jSONObject.optInt("remain", 1000);
            this.f46687D = jSONObject.optBoolean("enableEditPrivacy");
            this.f46688E.f45973p = jSONObject.optInt("privacy");
            JSONObject optJSONObject = jSONObject.optJSONObject("theme");
            if (optJSONObject != null) {
                AbstractC19074t.m100205c(optJSONObject);
                ThemeItem.C8684b c8684b = ThemeItem.Companion;
                String jSONObject2 = optJSONObject.toString();
                AbstractC19074t.m100207e(jSONObject2, "toString(...)");
                this.f46689F = c8684b.m46366b(jSONObject2);
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("smart_crop");
            if (optJSONObject2 != null) {
                AbstractC19074t.m100205c(optJSONObject2);
                SmartCropInfo.Companion companion = SmartCropInfo.Companion;
                String jSONObject3 = optJSONObject2.toString();
                AbstractC19074t.m100207e(jSONObject3, "toString(...)");
                this.f46690G = companion.m46324a(jSONObject3);
            }
        } catch (Exception e12) {
            e = e12;
            AbstractC20110a.f98889a.mo104552e(e);
        }
    }
}
