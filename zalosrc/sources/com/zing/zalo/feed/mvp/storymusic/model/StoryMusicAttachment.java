package com.zing.zalo.feed.mvp.storymusic.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import org.json.JSONObject;
import p133ek.AbstractC18459b;

/* loaded from: classes4.dex */
public final class StoryMusicAttachment implements Parcelable {

    /* renamed from: p */
    private String f47042p;

    /* renamed from: q */
    private int f47043q;

    /* renamed from: r */
    private int f47044r;

    /* renamed from: s */
    private double f47045s;

    /* renamed from: t */
    private double f47046t;

    /* renamed from: u */
    private double f47047u;

    /* renamed from: v */
    private double f47048v;
    public static final C8769a Companion = new C8769a(null);
    public static final Parcelable.Creator<StoryMusicAttachment> CREATOR = new C8770b();

    /* renamed from: com.zing.zalo.feed.mvp.storymusic.model.StoryMusicAttachment$a */
    /* loaded from: classes4.dex */
    public static final class C8769a {
        private C8769a() {
        }

        public /* synthetic */ C8769a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final StoryMusicAttachment m46937a(String str, JSONObject jSONObject) {
            AbstractC19074t.m100208f(str, "songId");
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            try {
                return new StoryMusicAttachment(str, jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE), jSONObject.optInt("typo_id"), jSONObject.optDouble("translation_x"), jSONObject.optDouble("translation_y"), jSONObject.optDouble("rotation"), jSONObject.optDouble("scale"));
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return new StoryMusicAttachment(str, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 126, null);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.storymusic.model.StoryMusicAttachment$b */
    /* loaded from: classes4.dex */
    public static final class C8770b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StoryMusicAttachment createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new StoryMusicAttachment(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final StoryMusicAttachment[] newArray(int i11) {
            return new StoryMusicAttachment[i11];
        }
    }

    public StoryMusicAttachment() {
        this(null, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 127, null);
    }

    /* renamed from: a */
    public final String m46923a() {
        return this.f47042p;
    }

    /* renamed from: b */
    public final int m46924b() {
        return this.f47043q;
    }

    /* renamed from: c */
    public final int m46925c() {
        return this.f47044r;
    }

    /* renamed from: d */
    public final double m46926d() {
        return this.f47047u;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final double m46927e() {
        return this.f47048v;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryMusicAttachment)) {
            return false;
        }
        StoryMusicAttachment storyMusicAttachment = (StoryMusicAttachment) obj;
        return AbstractC19074t.m100204b(this.f47042p, storyMusicAttachment.f47042p) && this.f47043q == storyMusicAttachment.f47043q && this.f47044r == storyMusicAttachment.f47044r && Double.compare(this.f47045s, storyMusicAttachment.f47045s) == 0 && Double.compare(this.f47046t, storyMusicAttachment.f47046t) == 0 && Double.compare(this.f47047u, storyMusicAttachment.f47047u) == 0 && Double.compare(this.f47048v, storyMusicAttachment.f47048v) == 0;
    }

    /* renamed from: f */
    public final double m46928f() {
        return this.f47045s;
    }

    /* renamed from: g */
    public final double m46929g() {
        return this.f47046t;
    }

    /* renamed from: h */
    public final void m46930h(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f47042p = str;
    }

    public int hashCode() {
        return (((((((((((this.f47042p.hashCode() * 31) + this.f47043q) * 31) + this.f47044r) * 31) + AbstractC18459b.m97786a(this.f47045s)) * 31) + AbstractC18459b.m97786a(this.f47046t)) * 31) + AbstractC18459b.m97786a(this.f47047u)) * 31) + AbstractC18459b.m97786a(this.f47048v);
    }

    /* renamed from: i */
    public final void m46931i(int i11) {
        this.f47043q = i11;
    }

    /* renamed from: j */
    public final void m46932j(double d11) {
        this.f47047u = d11;
    }

    /* renamed from: k */
    public final void m46933k(double d11) {
        this.f47048v = d11;
    }

    /* renamed from: l */
    public final void m46934l(double d11) {
        this.f47045s = d11;
    }

    /* renamed from: m */
    public final void m46935m(double d11) {
        this.f47046t = d11;
    }

    /* renamed from: n */
    public final JSONObject m46936n() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f47043q);
        jSONObject.put("typo_id", this.f47044r);
        jSONObject.put("translation_x", this.f47045s);
        jSONObject.put("translation_y", this.f47046t);
        jSONObject.put("rotation", this.f47047u);
        jSONObject.put("scale", this.f47048v);
        return jSONObject;
    }

    public String toString() {
        return "StoryMusicAttachment(songId=" + this.f47042p + ", typeVisual=" + this.f47043q + ", typoID=" + this.f47044r + ", visualTranslationX=" + this.f47045s + ", visualTranslationY=" + this.f47046t + ", visualRotation=" + this.f47047u + ", visualScale=" + this.f47048v + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f47042p);
        parcel.writeInt(this.f47043q);
        parcel.writeInt(this.f47044r);
        parcel.writeDouble(this.f47045s);
        parcel.writeDouble(this.f47046t);
        parcel.writeDouble(this.f47047u);
        parcel.writeDouble(this.f47048v);
    }

    public StoryMusicAttachment(String str, int i11, int i12, double d11, double d12, double d13, double d14) {
        AbstractC19074t.m100208f(str, "songId");
        this.f47042p = str;
        this.f47043q = i11;
        this.f47044r = i12;
        this.f47045s = d11;
        this.f47046t = d12;
        this.f47047u = d13;
        this.f47048v = d14;
    }

    public /* synthetic */ StoryMusicAttachment(String str, int i11, int i12, double d11, double d12, double d13, double d14, int i13, AbstractC19060k abstractC19060k) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) == 0 ? i12 : 0, (i13 & 8) != 0 ? 0.0d : d11, (i13 & 16) != 0 ? 0.0d : d12, (i13 & 32) != 0 ? 0.0d : d13, (i13 & 64) == 0 ? d14 : 0.0d);
    }
}
