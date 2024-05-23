package com.zing.zalo.lottie;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public final class LottieConfig implements Parcelable {

    /* renamed from: p */
    private final String f48161p;

    /* renamed from: q */
    private final String f48162q;

    /* renamed from: r */
    private final String f48163r;

    /* renamed from: s */
    private final float f48164s;

    /* renamed from: t */
    private final float f48165t;

    /* renamed from: u */
    private final float f48166u;

    /* renamed from: v */
    private final int f48167v;

    /* renamed from: w */
    private final boolean f48168w;

    /* renamed from: x */
    private final int f48169x;
    public static final C9000b Companion = new C9000b(null);
    public static final Parcelable.Creator<LottieConfig> CREATOR = new C9001c();

    /* renamed from: com.zing.zalo.lottie.LottieConfig$a */
    /* loaded from: classes4.dex */
    public static final class C8999a {

        /* renamed from: d */
        private float f48173d;

        /* renamed from: e */
        private float f48174e;

        /* renamed from: h */
        private boolean f48177h;

        /* renamed from: a */
        private String f48170a = "freestyle";

        /* renamed from: b */
        private String f48171b = "center_center";

        /* renamed from: c */
        private String f48172c = "center_center";

        /* renamed from: f */
        private float f48175f = 1.0f;

        /* renamed from: g */
        private int f48176g = -1;

        /* renamed from: i */
        private int f48178i = -1;

        /* renamed from: a */
        public final LottieConfig m48107a() {
            return new LottieConfig(this.f48170a, this.f48171b, this.f48172c, this.f48173d, this.f48174e, this.f48175f, this.f48176g, this.f48177h, this.f48178i);
        }

        /* renamed from: b */
        public final C8999a m48108b(int i11) {
            this.f48176g = i11;
            return this;
        }

        /* renamed from: c */
        public final C8999a m48109c(String str) {
            AbstractC19074t.m100208f(str, "decorAnchor");
            this.f48171b = str;
            return this;
        }

        /* renamed from: d */
        public final C8999a m48110d(boolean z11) {
            this.f48177h = z11;
            return this;
        }

        /* renamed from: e */
        public final C8999a m48111e(float f11) {
            this.f48175f = f11;
            return this;
        }

        /* renamed from: f */
        public final C8999a m48112f(String str) {
            AbstractC19074t.m100208f(str, "scaleType");
            this.f48170a = str;
            return this;
        }

        /* renamed from: g */
        public final C8999a m48113g(String str) {
            AbstractC19074t.m100208f(str, "screenAnchor");
            this.f48172c = str;
            return this;
        }

        /* renamed from: h */
        public final C8999a m48114h(int i11) {
            this.f48178i = i11;
            return this;
        }

        /* renamed from: i */
        public final C8999a m48115i(float f11) {
            this.f48173d = f11;
            return this;
        }

        /* renamed from: j */
        public final C8999a m48116j(float f11) {
            this.f48174e = f11;
            return this;
        }
    }

    /* renamed from: com.zing.zalo.lottie.LottieConfig$b */
    /* loaded from: classes4.dex */
    public static final class C9000b {
        private C9000b() {
        }

        public /* synthetic */ C9000b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.lottie.LottieConfig$c */
    /* loaded from: classes4.dex */
    public static final class C9001c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LottieConfig createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new LottieConfig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LottieConfig[] newArray(int i11) {
            return new LottieConfig[i11];
        }
    }

    public LottieConfig(String str, String str2, String str3, float f11, float f12, float f13, int i11, boolean z11, int i12) {
        AbstractC19074t.m100208f(str, "scaleType");
        AbstractC19074t.m100208f(str2, "decorAnchor");
        AbstractC19074t.m100208f(str3, "screenAnchor");
        this.f48161p = str;
        this.f48162q = str2;
        this.f48163r = str3;
        this.f48164s = f11;
        this.f48165t = f12;
        this.f48166u = f13;
        this.f48167v = i11;
        this.f48168w = z11;
        this.f48169x = i12;
    }

    /* renamed from: a */
    public final int m48098a() {
        return this.f48167v;
    }

    /* renamed from: b */
    public final String m48099b() {
        return this.f48162q;
    }

    /* renamed from: c */
    public final float m48100c() {
        return this.f48166u;
    }

    /* renamed from: d */
    public final String m48101d() {
        return this.f48161p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m48102e() {
        return this.f48163r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieConfig)) {
            return false;
        }
        LottieConfig lottieConfig = (LottieConfig) obj;
        return AbstractC19074t.m100204b(this.f48161p, lottieConfig.f48161p) && AbstractC19074t.m100204b(this.f48162q, lottieConfig.f48162q) && AbstractC19074t.m100204b(this.f48163r, lottieConfig.f48163r) && Float.compare(this.f48164s, lottieConfig.f48164s) == 0 && Float.compare(this.f48165t, lottieConfig.f48165t) == 0 && Float.compare(this.f48166u, lottieConfig.f48166u) == 0 && this.f48167v == lottieConfig.f48167v && this.f48168w == lottieConfig.f48168w && this.f48169x == lottieConfig.f48169x;
    }

    /* renamed from: f */
    public final int m48103f() {
        return this.f48169x;
    }

    /* renamed from: g */
    public final float m48104g() {
        return this.f48164s;
    }

    /* renamed from: h */
    public final float m48105h() {
        return this.f48165t;
    }

    public int hashCode() {
        return (((((((((((((((this.f48161p.hashCode() * 31) + this.f48162q.hashCode()) * 31) + this.f48163r.hashCode()) * 31) + Float.floatToIntBits(this.f48164s)) * 31) + Float.floatToIntBits(this.f48165t)) * 31) + Float.floatToIntBits(this.f48166u)) * 31) + this.f48167v) * 31) + AbstractC2144f.m11520a(this.f48168w)) * 31) + this.f48169x;
    }

    /* renamed from: i */
    public final boolean m48106i() {
        return this.f48168w;
    }

    public String toString() {
        return "LottieConfig(scaleType=" + this.f48161p + ", decorAnchor=" + this.f48162q + ", screenAnchor=" + this.f48163r + ", translateX=" + this.f48164s + ", translateY=" + this.f48165t + ", scale=" + this.f48166u + ", animLoopCount=" + this.f48167v + ", isPlaySound=" + this.f48168w + ", soundLoopCount=" + this.f48169x + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f48161p);
        parcel.writeString(this.f48162q);
        parcel.writeString(this.f48163r);
        parcel.writeFloat(this.f48164s);
        parcel.writeFloat(this.f48165t);
        parcel.writeFloat(this.f48166u);
        parcel.writeInt(this.f48167v);
        parcel.writeInt(this.f48168w ? 1 : 0);
        parcel.writeInt(this.f48169x);
    }
}
