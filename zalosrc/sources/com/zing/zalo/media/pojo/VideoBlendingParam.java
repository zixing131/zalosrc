package com.zing.zalo.media.pojo;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.cameradecor.filter.ColorFilterConfig;
import com.zing.zalo.config.VideoNativeCompressConfig;
import ho0.AbstractC20110a;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;
import p559uv.AbstractC27371a;

/* loaded from: classes4.dex */
public class VideoBlendingParam implements Parcelable, Serializable {
    public static final Parcelable.Creator<VideoBlendingParam> CREATOR = new C9011a();

    /* renamed from: A */
    public float f48249A;

    /* renamed from: B */
    public int f48250B;

    /* renamed from: C */
    public boolean f48251C;

    /* renamed from: D */
    public boolean f48252D;

    /* renamed from: E */
    public String f48253E;

    /* renamed from: F */
    public boolean f48254F;

    /* renamed from: G */
    public int f48255G;

    /* renamed from: H */
    public String f48256H;

    /* renamed from: I */
    public boolean f48257I;

    /* renamed from: J */
    public boolean f48258J;

    /* renamed from: K */
    public boolean f48259K;

    /* renamed from: L */
    public boolean f48260L;

    /* renamed from: M */
    public boolean f48261M;

    /* renamed from: N */
    public float f48262N;

    /* renamed from: O */
    private boolean f48263O;

    /* renamed from: P */
    public int f48264P;

    /* renamed from: Q */
    public int f48265Q;

    /* renamed from: R */
    public int f48266R;

    /* renamed from: S */
    public float f48267S;

    /* renamed from: T */
    public float f48268T;

    /* renamed from: U */
    public int f48269U;

    /* renamed from: V */
    public boolean f48270V;

    /* renamed from: W */
    public transient Bitmap f48271W;

    /* renamed from: X */
    public transient Bitmap f48272X;

    /* renamed from: Y */
    public ColorFilterConfig f48273Y;

    /* renamed from: Z */
    public VideoNativeCompressConfig f48274Z;

    /* renamed from: a0 */
    public boolean f48275a0;

    /* renamed from: p */
    public int f48276p;

    /* renamed from: q */
    public String f48277q;

    /* renamed from: r */
    public String f48278r;

    /* renamed from: s */
    public String f48279s;

    /* renamed from: t */
    public String f48280t;

    /* renamed from: u */
    public String f48281u;

    /* renamed from: v */
    public int f48282v;

    /* renamed from: w */
    public int f48283w;

    /* renamed from: x */
    public String f48284x;

    /* renamed from: y */
    public float f48285y;

    /* renamed from: z */
    public int f48286z;

    /* renamed from: com.zing.zalo.media.pojo.VideoBlendingParam$a */
    /* loaded from: classes4.dex */
    class C9011a implements Parcelable.Creator {
        C9011a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public VideoBlendingParam createFromParcel(Parcel parcel) {
            return new VideoBlendingParam(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public VideoBlendingParam[] newArray(int i11) {
            return new VideoBlendingParam[i11];
        }
    }

    /* synthetic */ VideoBlendingParam(Parcel parcel, AbstractC27371a abstractC27371a) {
        this(parcel);
    }

    /* renamed from: a */
    public static VideoBlendingParam m48165a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        VideoBlendingParam videoBlendingParam = new VideoBlendingParam();
        videoBlendingParam.f48276p = jSONObject.optInt("videoMode", 0);
        videoBlendingParam.f48277q = jSONObject.optString("inputPath", "");
        videoBlendingParam.f48278r = jSONObject.optString("outputPath", "");
        videoBlendingParam.f48279s = jSONObject.optString("overlayBitmapUrl", "");
        videoBlendingParam.f48280t = jSONObject.optString("decorData", "");
        videoBlendingParam.f48281u = jSONObject.optString("filterTypeName", "");
        videoBlendingParam.f48282v = jSONObject.optInt("videoWidth", 0);
        videoBlendingParam.f48283w = jSONObject.optInt("videoHeight", 0);
        videoBlendingParam.f48284x = jSONObject.optString("videoBitrate", "1300000");
        videoBlendingParam.f48285y = (float) jSONObject.optDouble("motionLevel", 2.0d);
        videoBlendingParam.f48286z = jSONObject.optInt("frameRate", 30);
        videoBlendingParam.f48250B = jSONObject.optInt("rotation", 0);
        videoBlendingParam.f48251C = jSONObject.optBoolean("needDeleteInputFile", false);
        videoBlendingParam.f48252D = jSONObject.optBoolean("needFlipping", false);
        videoBlendingParam.f48253E = jSONObject.optString("thumbBitmapUrl", "");
        videoBlendingParam.f48254F = jSONObject.optBoolean("isAddToGallery", false);
        videoBlendingParam.f48255G = jSONObject.optInt("videoDuration", 0);
        videoBlendingParam.f48256H = jSONObject.optString("videoThumbPath", "");
        videoBlendingParam.f48257I = jSONObject.optBoolean("needToGenThumb", false);
        videoBlendingParam.f48258J = jSONObject.optBoolean("isCompressedRawVideo", false);
        videoBlendingParam.f48262N = (float) jSONObject.optDouble("videoSpeed", 0.0d);
        videoBlendingParam.f48269U = jSONObject.optInt("loopCount", 0);
        videoBlendingParam.f48263O = jSONObject.optBoolean("convertToIFrames", false);
        videoBlendingParam.f48264P = jSONObject.optInt("trimStart", 0);
        videoBlendingParam.f48265Q = jSONObject.optInt("trimDuration", 0);
        videoBlendingParam.f48273Y = ColorFilterConfig.m39671a(jSONObject.optJSONObject("colorFilterConfig"));
        videoBlendingParam.f48266R = jSONObject.optInt("recyclerViewScrollPosition");
        videoBlendingParam.f48267S = jSONObject.optInt("seekBarLeftProgress");
        videoBlendingParam.f48268T = jSONObject.optInt("seekBarRightProgress");
        videoBlendingParam.f48259K = jSONObject.optBoolean("needBlending", false);
        videoBlendingParam.f48260L = jSONObject.optBoolean("needCompressing", false);
        videoBlendingParam.f48261M = jSONObject.optBoolean("alwaysGenThumb", false);
        videoBlendingParam.f48270V = jSONObject.optBoolean("isMuted", false);
        JSONObject optJSONObject = jSONObject.optJSONObject("nativeCompressConfig");
        if (optJSONObject != null) {
            videoBlendingParam.f48274Z.m40341o(optJSONObject.optString("resolution", "480p"));
            videoBlendingParam.f48274Z.m40336j(optJSONObject.optString("bitrate", "1300000"));
            videoBlendingParam.f48274Z.m40338l(optJSONObject.optString("frameRate", "30"));
            videoBlendingParam.f48274Z.m40340n(optJSONObject.optString("profile", "baseline"));
            videoBlendingParam.f48274Z.m40339m(optJSONObject.optString("preset", "auto"));
        }
        videoBlendingParam.f48275a0 = jSONObject.optBoolean("isNativeCompressEnable", true);
        return videoBlendingParam;
    }

    /* renamed from: b */
    public JSONObject m48166b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("videoMode", this.f48276p);
            jSONObject.put("inputPath", this.f48277q);
            jSONObject.put("outputPath", this.f48278r);
            jSONObject.put("overlayBitmapUrl", this.f48279s);
            jSONObject.put("decorData", this.f48280t);
            jSONObject.put("filterTypeName", this.f48281u);
            jSONObject.put("videoWidth", this.f48282v);
            jSONObject.put("videoHeight", this.f48283w);
            jSONObject.put("videoBitrate", this.f48284x);
            jSONObject.put("motionLevel", this.f48285y);
            jSONObject.put("frameRate", this.f48286z);
            jSONObject.put("standardWidth", this.f48249A);
            jSONObject.put("rotation", this.f48250B);
            jSONObject.put("needDeleteInputFile", this.f48251C);
            jSONObject.put("needFlipping", this.f48252D);
            jSONObject.put("thumbBitmapUrl", this.f48253E);
            jSONObject.put("isAddToGallery", this.f48254F);
            jSONObject.put("videoDuration", this.f48255G);
            jSONObject.put("videoThumbPath", this.f48256H);
            jSONObject.put("needToGenThumb", this.f48257I);
            jSONObject.put("isCompressedRawVideo", this.f48258J);
            jSONObject.put("videoSpeed", this.f48262N);
            jSONObject.put("loopCount", this.f48269U);
            jSONObject.put("convertToIFrames", this.f48263O);
            jSONObject.put("trimStart", this.f48264P);
            jSONObject.put("trimDuration", this.f48265Q);
            ColorFilterConfig colorFilterConfig = this.f48273Y;
            if (colorFilterConfig != null) {
                jSONObject.put("colorFilterConfig", colorFilterConfig.m39672b());
            }
            jSONObject.put("recyclerViewScrollPosition", this.f48266R);
            jSONObject.put("seekBarLeftProgress", this.f48267S);
            jSONObject.put("seekBarRightProgress", this.f48268T);
            jSONObject.put("needBlending", this.f48259K);
            jSONObject.put("needCompressing", this.f48260L);
            jSONObject.put("alwaysGenThumb", this.f48261M);
            jSONObject.put("isMuted", this.f48270V);
            if (this.f48274Z != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("resolution", this.f48274Z.m40334h());
                jSONObject2.put("bitrate", this.f48274Z.m40328a());
                jSONObject2.put("frameRate", this.f48274Z.m40330c());
                jSONObject2.put("profile", this.f48274Z.m40333g());
                jSONObject2.put("preset", this.f48274Z.m40332f());
                jSONObject.put("nativeCompressConfig", jSONObject2);
            }
            jSONObject.put("isNativeCompressEnable", this.f48275a0);
        } catch (JSONException e11) {
            AbstractC20110a.m104539h(e11);
        }
        return jSONObject;
    }

    /* renamed from: c */
    public JSONObject m48167c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("videoMode", this.f48276p);
            jSONObject.put("inputPath", this.f48277q);
            if (this.f48259K) {
                jSONObject.put("decorData", this.f48280t);
                jSONObject.put("videoWidth", this.f48282v);
                jSONObject.put("videoHeight", this.f48283w);
                jSONObject.put("rotation", this.f48250B);
            }
            jSONObject.put("motionLevel", this.f48285y);
            jSONObject.put("frameRate", this.f48286z);
            jSONObject.put("videoBitrate", this.f48284x);
            jSONObject.put("standardWidth", this.f48249A);
            jSONObject.put("needFlipping", this.f48252D);
            jSONObject.put("videoDuration", this.f48255G);
            jSONObject.put("videoSpeed", this.f48262N);
            jSONObject.put("loopCount", this.f48269U);
            jSONObject.put("trimStart", this.f48264P);
            jSONObject.put("trimDuration", this.f48265Q);
            ColorFilterConfig colorFilterConfig = this.f48273Y;
            if (colorFilterConfig != null) {
                jSONObject.put("colorFilterConfig", colorFilterConfig.m39672b());
            }
            if (this.f48259K) {
                jSONObject.put("isMuted", this.f48270V);
            }
        } catch (JSONException e11) {
            AbstractC20110a.m104539h(e11);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f48276p);
        parcel.writeString(this.f48277q);
        parcel.writeString(this.f48278r);
        parcel.writeString(this.f48279s);
        parcel.writeString(this.f48280t);
        parcel.writeString(this.f48281u);
        parcel.writeInt(this.f48282v);
        parcel.writeInt(this.f48283w);
        parcel.writeString(this.f48284x);
        parcel.writeFloat(this.f48285y);
        parcel.writeInt(this.f48286z);
        parcel.writeFloat(this.f48249A);
        parcel.writeInt(this.f48250B);
        parcel.writeInt(this.f48251C ? 1 : 0);
        parcel.writeInt(this.f48252D ? 1 : 0);
        parcel.writeString(this.f48253E);
        parcel.writeInt(this.f48254F ? 1 : 0);
        parcel.writeInt(this.f48255G);
        parcel.writeString(this.f48256H);
        parcel.writeInt(this.f48257I ? 1 : 0);
        parcel.writeInt(this.f48258J ? 1 : 0);
        parcel.writeFloat(this.f48262N);
        parcel.writeInt(this.f48269U);
        parcel.writeInt(this.f48263O ? 1 : 0);
        parcel.writeInt(this.f48264P);
        parcel.writeInt(this.f48265Q);
        parcel.writeParcelable(this.f48273Y, i11);
        parcel.writeInt(this.f48266R);
        parcel.writeFloat(this.f48267S);
        parcel.writeFloat(this.f48268T);
        parcel.writeInt(this.f48259K ? 1 : 0);
        parcel.writeInt(this.f48260L ? 1 : 0);
        parcel.writeInt(this.f48261M ? 1 : 0);
        parcel.writeInt(this.f48270V ? 1 : 0);
        parcel.writeParcelable(this.f48274Z, i11);
        parcel.writeInt(this.f48275a0 ? 1 : 0);
    }

    public VideoBlendingParam() {
        this.f48276p = 0;
        this.f48284x = "1300000";
        this.f48285y = 2.0f;
        this.f48286z = 30;
        this.f48249A = 480.0f;
        this.f48250B = 0;
        this.f48251C = false;
        this.f48254F = false;
        this.f48257I = false;
        this.f48258J = false;
        this.f48259K = false;
        this.f48260L = false;
        this.f48261M = false;
        this.f48262N = 1.0f;
        this.f48263O = false;
        this.f48264P = 0;
        this.f48265Q = 0;
        this.f48266R = 0;
        this.f48267S = 0.0f;
        this.f48268T = 1.0f;
        this.f48269U = 0;
        this.f48270V = false;
        this.f48274Z = new VideoNativeCompressConfig();
        this.f48275a0 = true;
    }

    private VideoBlendingParam(Parcel parcel) {
        this.f48276p = 0;
        this.f48284x = "1300000";
        this.f48285y = 2.0f;
        this.f48286z = 30;
        this.f48249A = 480.0f;
        this.f48250B = 0;
        this.f48251C = false;
        this.f48254F = false;
        this.f48257I = false;
        this.f48258J = false;
        this.f48259K = false;
        this.f48260L = false;
        this.f48261M = false;
        this.f48262N = 1.0f;
        this.f48263O = false;
        this.f48264P = 0;
        this.f48265Q = 0;
        this.f48266R = 0;
        this.f48267S = 0.0f;
        this.f48268T = 1.0f;
        this.f48269U = 0;
        this.f48270V = false;
        this.f48274Z = new VideoNativeCompressConfig();
        this.f48275a0 = true;
        this.f48276p = parcel.readInt();
        this.f48277q = parcel.readString();
        this.f48278r = parcel.readString();
        this.f48279s = parcel.readString();
        this.f48280t = parcel.readString();
        this.f48281u = parcel.readString();
        this.f48282v = parcel.readInt();
        this.f48283w = parcel.readInt();
        this.f48284x = parcel.readString();
        this.f48285y = parcel.readFloat();
        this.f48286z = parcel.readInt();
        this.f48249A = parcel.readFloat();
        this.f48250B = parcel.readInt();
        this.f48251C = parcel.readInt() == 1;
        this.f48252D = parcel.readInt() == 1;
        this.f48253E = parcel.readString();
        this.f48254F = parcel.readInt() == 1;
        this.f48255G = parcel.readInt();
        this.f48256H = parcel.readString();
        this.f48257I = parcel.readInt() == 1;
        this.f48258J = parcel.readInt() == 1;
        this.f48262N = parcel.readFloat();
        this.f48269U = parcel.readInt();
        this.f48263O = parcel.readInt() == 1;
        this.f48264P = parcel.readInt();
        this.f48265Q = parcel.readInt();
        this.f48273Y = (ColorFilterConfig) parcel.readParcelable(ColorFilterConfig.class.getClassLoader());
        this.f48266R = parcel.readInt();
        this.f48267S = parcel.readFloat();
        this.f48268T = parcel.readFloat();
        this.f48259K = parcel.readInt() == 1;
        this.f48260L = parcel.readInt() == 1;
        this.f48261M = parcel.readInt() == 1;
        this.f48270V = parcel.readInt() == 1;
        this.f48274Z = (VideoNativeCompressConfig) parcel.readParcelable(VideoNativeCompressConfig.class.getClassLoader());
        this.f48275a0 = parcel.readInt() == 1;
    }
}
