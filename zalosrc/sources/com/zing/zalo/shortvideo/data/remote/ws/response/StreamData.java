package com.zing.zalo.shortvideo.data.remote.ws.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26810m0;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class StreamData implements Parcelable {

    /* renamed from: A */
    private final Long f50318A;

    /* renamed from: B */
    private final Long f50319B;

    /* renamed from: C */
    private final Long f50320C;

    /* renamed from: D */
    private final Long f50321D;

    /* renamed from: E */
    private final String f50322E;

    /* renamed from: F */
    private final LiveChannel f50323F;

    /* renamed from: G */
    private final Stat f50324G;

    /* renamed from: H */
    private final float f50325H;

    /* renamed from: I */
    private final float f50326I;

    /* renamed from: J */
    private final String f50327J;

    /* renamed from: K */
    private final long f50328K;

    /* renamed from: L */
    private final Long f50329L;

    /* renamed from: p */
    private final Long f50330p;

    /* renamed from: q */
    private final Long f50331q;

    /* renamed from: r */
    private final Long f50332r;

    /* renamed from: s */
    private final Long f50333s;

    /* renamed from: t */
    private final String f50334t;

    /* renamed from: u */
    private final String f50335u;

    /* renamed from: v */
    private final String f50336v;

    /* renamed from: w */
    private final String f50337w;

    /* renamed from: x */
    private final Long f50338x;

    /* renamed from: y */
    private final Long f50339y;

    /* renamed from: z */
    private final Integer f50340z;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<StreamData> CREATOR = new C9458a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return StreamData$$serializer.INSTANCE;
        }
    }

    @InterfaceC25392g
    /* loaded from: classes5.dex */
    public static final class Stat implements Parcelable {

        /* renamed from: p */
        private final Long f50341p;

        /* renamed from: q */
        private final Long f50342q;

        /* renamed from: r */
        private final Long f50343r;

        /* renamed from: s */
        private final Long f50344s;

        /* renamed from: t */
        private final Long f50345t;

        /* renamed from: u */
        private final Long f50346u;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Stat> CREATOR = new C9457a();

        /* loaded from: classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
                this();
            }

            public final KSerializer serializer() {
                return StreamData$Stat$$serializer.INSTANCE;
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.data.remote.ws.response.StreamData$Stat$a */
        /* loaded from: classes5.dex */
        public static final class C9457a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final Stat createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                return new Stat(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final Stat[] newArray(int i11) {
                return new Stat[i11];
            }
        }

        public /* synthetic */ Stat(int i11, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, AbstractC26805k1 abstractC26805k1) {
            if (62 != (i11 & 62)) {
                AbstractC26774a1.m137800b(i11, 62, StreamData$Stat$$serializer.INSTANCE.getDescriptor());
            }
            if ((i11 & 1) == 0) {
                this.f50341p = null;
            } else {
                this.f50341p = l11;
            }
            this.f50342q = l12;
            this.f50343r = l13;
            this.f50344s = l14;
            this.f50345t = l15;
            this.f50346u = l16;
        }

        /* renamed from: c */
        public static final /* synthetic */ void m51698c(Stat stat, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
            if (interfaceC21886d.mo114019A(serialDescriptor, 0) || stat.f50341p != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 0, C26810m0.f127024a, stat.f50341p);
            }
            C26810m0 c26810m0 = C26810m0.f127024a;
            interfaceC21886d.mo114028h(serialDescriptor, 1, c26810m0, stat.f50342q);
            interfaceC21886d.mo114028h(serialDescriptor, 2, c26810m0, stat.f50343r);
            interfaceC21886d.mo114028h(serialDescriptor, 3, c26810m0, stat.f50344s);
            interfaceC21886d.mo114028h(serialDescriptor, 4, c26810m0, stat.f50345t);
            interfaceC21886d.mo114028h(serialDescriptor, 5, c26810m0, stat.f50346u);
        }

        /* renamed from: a */
        public final Long m51699a() {
            return this.f50344s;
        }

        /* renamed from: b */
        public final Long m51700b() {
            return this.f50343r;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Stat)) {
                return false;
            }
            Stat stat = (Stat) obj;
            return AbstractC19074t.m100204b(this.f50341p, stat.f50341p) && AbstractC19074t.m100204b(this.f50342q, stat.f50342q) && AbstractC19074t.m100204b(this.f50343r, stat.f50343r) && AbstractC19074t.m100204b(this.f50344s, stat.f50344s) && AbstractC19074t.m100204b(this.f50345t, stat.f50345t) && AbstractC19074t.m100204b(this.f50346u, stat.f50346u);
        }

        public int hashCode() {
            Long l11 = this.f50341p;
            int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
            Long l12 = this.f50342q;
            int hashCode2 = (hashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.f50343r;
            int hashCode3 = (hashCode2 + (l13 == null ? 0 : l13.hashCode())) * 31;
            Long l14 = this.f50344s;
            int hashCode4 = (hashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
            Long l15 = this.f50345t;
            int hashCode5 = (hashCode4 + (l15 == null ? 0 : l15.hashCode())) * 31;
            Long l16 = this.f50346u;
            return hashCode5 + (l16 != null ? l16.hashCode() : 0);
        }

        public String toString() {
            return "Stat(liveId=" + this.f50341p + ", views=" + this.f50342q + ", likes=" + this.f50343r + ", currentViewer=" + this.f50344s + ", shares=" + this.f50345t + ", cmts=" + this.f50346u + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            AbstractC19074t.m100208f(parcel, "out");
            Long l11 = this.f50341p;
            if (l11 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l11.longValue());
            }
            Long l12 = this.f50342q;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l12.longValue());
            }
            Long l13 = this.f50343r;
            if (l13 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l13.longValue());
            }
            Long l14 = this.f50344s;
            if (l14 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l14.longValue());
            }
            Long l15 = this.f50345t;
            if (l15 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l15.longValue());
            }
            Long l16 = this.f50346u;
            if (l16 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l16.longValue());
            }
        }

        public Stat(Long l11, Long l12, Long l13, Long l14, Long l15, Long l16) {
            this.f50341p = l11;
            this.f50342q = l12;
            this.f50343r = l13;
            this.f50344s = l14;
            this.f50345t = l15;
            this.f50346u = l16;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.remote.ws.response.StreamData$a */
    /* loaded from: classes5.dex */
    public static final class C9458a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final StreamData createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new StreamData(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : LiveChannel.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Stat.CREATOR.createFromParcel(parcel), parcel.readFloat(), parcel.readFloat(), parcel.readString(), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final StreamData[] newArray(int i11) {
            return new StreamData[i11];
        }
    }

    public /* synthetic */ StreamData(int i11, Long l11, Long l12, Long l13, Long l14, String str, String str2, String str3, String str4, Long l15, Long l16, Integer num, Long l17, Long l18, Long l19, Long l21, String str5, LiveChannel liveChannel, Stat stat, float f11, float f12, String str6, long j11, Long l22, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f50330p = null;
        } else {
            this.f50330p = l11;
        }
        if ((i11 & 2) == 0) {
            this.f50331q = null;
        } else {
            this.f50331q = l12;
        }
        if ((i11 & 4) == 0) {
            this.f50332r = null;
        } else {
            this.f50332r = l13;
        }
        if ((i11 & 8) == 0) {
            this.f50333s = null;
        } else {
            this.f50333s = l14;
        }
        if ((i11 & 16) == 0) {
            this.f50334t = null;
        } else {
            this.f50334t = str;
        }
        if ((i11 & 32) == 0) {
            this.f50335u = null;
        } else {
            this.f50335u = str2;
        }
        if ((i11 & 64) == 0) {
            this.f50336v = null;
        } else {
            this.f50336v = str3;
        }
        if ((i11 & 128) == 0) {
            this.f50337w = null;
        } else {
            this.f50337w = str4;
        }
        if ((i11 & 256) == 0) {
            this.f50338x = null;
        } else {
            this.f50338x = l15;
        }
        if ((i11 & 512) == 0) {
            this.f50339y = null;
        } else {
            this.f50339y = l16;
        }
        if ((i11 & 1024) == 0) {
            this.f50340z = null;
        } else {
            this.f50340z = num;
        }
        if ((i11 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) == 0) {
            this.f50318A = null;
        } else {
            this.f50318A = l17;
        }
        if ((i11 & 4096) == 0) {
            this.f50319B = null;
        } else {
            this.f50319B = l18;
        }
        if ((i11 & 8192) == 0) {
            this.f50320C = null;
        } else {
            this.f50320C = l19;
        }
        if ((i11 & 16384) == 0) {
            this.f50321D = null;
        } else {
            this.f50321D = l21;
        }
        if ((32768 & i11) == 0) {
            this.f50322E = null;
        } else {
            this.f50322E = str5;
        }
        if ((65536 & i11) == 0) {
            this.f50323F = null;
        } else {
            this.f50323F = liveChannel;
        }
        if ((131072 & i11) == 0) {
            this.f50324G = null;
        } else {
            this.f50324G = stat;
        }
        if ((262144 & i11) == 0) {
            this.f50325H = 1.0f;
        } else {
            this.f50325H = f11;
        }
        if ((524288 & i11) == 0) {
            this.f50326I = 1.0f;
        } else {
            this.f50326I = f12;
        }
        if ((1048576 & i11) == 0) {
            this.f50327J = null;
        } else {
            this.f50327J = str6;
        }
        this.f50328K = (2097152 & i11) == 0 ? 0L : j11;
        if ((i11 & 4194304) == 0) {
            this.f50329L = null;
        } else {
            this.f50329L = l22;
        }
    }

    /* renamed from: n */
    public static final /* synthetic */ void m51684n(StreamData streamData, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || streamData.f50330p != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26810m0.f127024a, streamData.f50330p);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || streamData.f50331q != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26810m0.f127024a, streamData.f50331q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || streamData.f50332r != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26810m0.f127024a, streamData.f50332r);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || streamData.f50333s != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, C26810m0.f127024a, streamData.f50333s);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || streamData.f50334t != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 4, C26814n1.f127034a, streamData.f50334t);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || streamData.f50335u != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 5, C26814n1.f127034a, streamData.f50335u);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || streamData.f50336v != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 6, C26814n1.f127034a, streamData.f50336v);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || streamData.f50337w != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 7, C26814n1.f127034a, streamData.f50337w);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 8) || streamData.f50338x != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 8, C26810m0.f127024a, streamData.f50338x);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 9) || streamData.f50339y != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 9, C26810m0.f127024a, streamData.f50339y);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 10) || streamData.f50340z != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 10, C26783d0.f126989a, streamData.f50340z);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 11) || streamData.f50318A != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 11, C26810m0.f127024a, streamData.f50318A);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 12) || streamData.f50319B != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 12, C26810m0.f127024a, streamData.f50319B);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 13) || streamData.f50320C != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 13, C26810m0.f127024a, streamData.f50320C);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 14) || streamData.f50321D != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 14, C26810m0.f127024a, streamData.f50321D);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 15) || streamData.f50322E != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 15, C26814n1.f127034a, streamData.f50322E);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 16) || streamData.f50323F != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 16, LiveChannel$$serializer.INSTANCE, streamData.f50323F);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 17) || streamData.f50324G != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 17, StreamData$Stat$$serializer.INSTANCE, streamData.f50324G);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 18) || Float.compare(streamData.f50325H, 1.0f) != 0) {
            interfaceC21886d.mo114032t(serialDescriptor, 18, streamData.f50325H);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 19) || Float.compare(streamData.f50326I, 1.0f) != 0) {
            interfaceC21886d.mo114032t(serialDescriptor, 19, streamData.f50326I);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 20) || streamData.f50327J != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 20, C26814n1.f127034a, streamData.f50327J);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 21) || streamData.f50328K != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 21, streamData.f50328K);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 22) || streamData.f50329L != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 22, C26810m0.f127024a, streamData.f50329L);
        }
    }

    /* renamed from: a */
    public final Long m51685a() {
        return this.f50329L;
    }

    /* renamed from: b */
    public final LiveChannel m51686b() {
        return this.f50323F;
    }

    /* renamed from: c */
    public final Long m51687c() {
        return this.f50333s;
    }

    /* renamed from: d */
    public final Long m51688d() {
        return this.f50321D;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Long m51689e() {
        return this.f50330p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamData)) {
            return false;
        }
        StreamData streamData = (StreamData) obj;
        return AbstractC19074t.m100204b(this.f50330p, streamData.f50330p) && AbstractC19074t.m100204b(this.f50331q, streamData.f50331q) && AbstractC19074t.m100204b(this.f50332r, streamData.f50332r) && AbstractC19074t.m100204b(this.f50333s, streamData.f50333s) && AbstractC19074t.m100204b(this.f50334t, streamData.f50334t) && AbstractC19074t.m100204b(this.f50335u, streamData.f50335u) && AbstractC19074t.m100204b(this.f50336v, streamData.f50336v) && AbstractC19074t.m100204b(this.f50337w, streamData.f50337w) && AbstractC19074t.m100204b(this.f50338x, streamData.f50338x) && AbstractC19074t.m100204b(this.f50339y, streamData.f50339y) && AbstractC19074t.m100204b(this.f50340z, streamData.f50340z) && AbstractC19074t.m100204b(this.f50318A, streamData.f50318A) && AbstractC19074t.m100204b(this.f50319B, streamData.f50319B) && AbstractC19074t.m100204b(this.f50320C, streamData.f50320C) && AbstractC19074t.m100204b(this.f50321D, streamData.f50321D) && AbstractC19074t.m100204b(this.f50322E, streamData.f50322E) && AbstractC19074t.m100204b(this.f50323F, streamData.f50323F) && AbstractC19074t.m100204b(this.f50324G, streamData.f50324G) && Float.compare(this.f50325H, streamData.f50325H) == 0 && Float.compare(this.f50326I, streamData.f50326I) == 0 && AbstractC19074t.m100204b(this.f50327J, streamData.f50327J) && this.f50328K == streamData.f50328K && AbstractC19074t.m100204b(this.f50329L, streamData.f50329L);
    }

    /* renamed from: f */
    public final Long m51690f() {
        return this.f50331q;
    }

    /* renamed from: g */
    public final Long m51691g() {
        return this.f50319B;
    }

    /* renamed from: h */
    public final Long m51692h() {
        return this.f50318A;
    }

    public int hashCode() {
        Long l11 = this.f50330p;
        int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        Long l12 = this.f50331q;
        int hashCode2 = (hashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f50332r;
        int hashCode3 = (hashCode2 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.f50333s;
        int hashCode4 = (hashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str = this.f50334t;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f50335u;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f50336v;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f50337w;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l15 = this.f50338x;
        int hashCode9 = (hashCode8 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.f50339y;
        int hashCode10 = (hashCode9 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Integer num = this.f50340z;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        Long l17 = this.f50318A;
        int hashCode12 = (hashCode11 + (l17 == null ? 0 : l17.hashCode())) * 31;
        Long l18 = this.f50319B;
        int hashCode13 = (hashCode12 + (l18 == null ? 0 : l18.hashCode())) * 31;
        Long l19 = this.f50320C;
        int hashCode14 = (hashCode13 + (l19 == null ? 0 : l19.hashCode())) * 31;
        Long l21 = this.f50321D;
        int hashCode15 = (hashCode14 + (l21 == null ? 0 : l21.hashCode())) * 31;
        String str5 = this.f50322E;
        int hashCode16 = (hashCode15 + (str5 == null ? 0 : str5.hashCode())) * 31;
        LiveChannel liveChannel = this.f50323F;
        int hashCode17 = (hashCode16 + (liveChannel == null ? 0 : liveChannel.hashCode())) * 31;
        Stat stat = this.f50324G;
        int hashCode18 = (((((hashCode17 + (stat == null ? 0 : stat.hashCode())) * 31) + Float.floatToIntBits(this.f50325H)) * 31) + Float.floatToIntBits(this.f50326I)) * 31;
        String str6 = this.f50327J;
        int hashCode19 = (((hashCode18 + (str6 == null ? 0 : str6.hashCode())) * 31) + AbstractC2147g0.m11521a(this.f50328K)) * 31;
        Long l22 = this.f50329L;
        return hashCode19 + (l22 != null ? l22.hashCode() : 0);
    }

    /* renamed from: i */
    public final Long m51693i() {
        return this.f50320C;
    }

    /* renamed from: j */
    public final Stat m51694j() {
        return this.f50324G;
    }

    /* renamed from: k */
    public final Long m51695k() {
        return this.f50332r;
    }

    /* renamed from: l */
    public final Integer m51696l() {
        return this.f50340z;
    }

    /* renamed from: m */
    public final String m51697m() {
        return this.f50336v;
    }

    public String toString() {
        return "StreamData(id=" + this.f50330p + ", liveIntervalMillis=" + this.f50331q + ", statIntervalMillis=" + this.f50332r + ", cmtIntervalMillis=" + this.f50333s + ", title=" + this.f50334t + ", shareURL=" + this.f50335u + ", streamURL=" + this.f50336v + ", reportURL=" + this.f50337w + ", createdTime=" + this.f50338x + ", channelId=" + this.f50339y + ", status=" + this.f50340z + ", scheduledStartTime=" + this.f50318A + ", scheduledEndTime=" + this.f50319B + ", startTime=" + this.f50320C + ", endTime=" + this.f50321D + ", thumbnail=" + this.f50322E + ", channel=" + this.f50323F + ", stat=" + this.f50324G + ", volume=" + this.f50325H + ", ratio=" + this.f50326I + ", firstFrame=" + this.f50327J + ", duration=" + this.f50328K + ", attributes=" + this.f50329L + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        Long l11 = this.f50330p;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l11.longValue());
        }
        Long l12 = this.f50331q;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l12.longValue());
        }
        Long l13 = this.f50332r;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l13.longValue());
        }
        Long l14 = this.f50333s;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l14.longValue());
        }
        parcel.writeString(this.f50334t);
        parcel.writeString(this.f50335u);
        parcel.writeString(this.f50336v);
        parcel.writeString(this.f50337w);
        Long l15 = this.f50338x;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l15.longValue());
        }
        Long l16 = this.f50339y;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l16.longValue());
        }
        Integer num = this.f50340z;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l17 = this.f50318A;
        if (l17 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l17.longValue());
        }
        Long l18 = this.f50319B;
        if (l18 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l18.longValue());
        }
        Long l19 = this.f50320C;
        if (l19 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l19.longValue());
        }
        Long l21 = this.f50321D;
        if (l21 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l21.longValue());
        }
        parcel.writeString(this.f50322E);
        LiveChannel liveChannel = this.f50323F;
        if (liveChannel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            liveChannel.writeToParcel(parcel, i11);
        }
        Stat stat = this.f50324G;
        if (stat == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stat.writeToParcel(parcel, i11);
        }
        parcel.writeFloat(this.f50325H);
        parcel.writeFloat(this.f50326I);
        parcel.writeString(this.f50327J);
        parcel.writeLong(this.f50328K);
        Long l22 = this.f50329L;
        if (l22 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l22.longValue());
        }
    }

    public StreamData(Long l11, Long l12, Long l13, Long l14, String str, String str2, String str3, String str4, Long l15, Long l16, Integer num, Long l17, Long l18, Long l19, Long l21, String str5, LiveChannel liveChannel, Stat stat, float f11, float f12, String str6, long j11, Long l22) {
        this.f50330p = l11;
        this.f50331q = l12;
        this.f50332r = l13;
        this.f50333s = l14;
        this.f50334t = str;
        this.f50335u = str2;
        this.f50336v = str3;
        this.f50337w = str4;
        this.f50338x = l15;
        this.f50339y = l16;
        this.f50340z = num;
        this.f50318A = l17;
        this.f50319B = l18;
        this.f50320C = l19;
        this.f50321D = l21;
        this.f50322E = str5;
        this.f50323F = liveChannel;
        this.f50324G = stat;
        this.f50325H = f11;
        this.f50326I = f12;
        this.f50327J = str6;
        this.f50328K = j11;
        this.f50329L = l22;
    }

    public /* synthetic */ StreamData(Long l11, Long l12, Long l13, Long l14, String str, String str2, String str3, String str4, Long l15, Long l16, Integer num, Long l17, Long l18, Long l19, Long l21, String str5, LiveChannel liveChannel, Stat stat, float f11, float f12, String str6, long j11, Long l22, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? null : l11, (i11 & 2) != 0 ? null : l12, (i11 & 4) != 0 ? null : l13, (i11 & 8) != 0 ? null : l14, (i11 & 16) != 0 ? null : str, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : str3, (i11 & 128) != 0 ? null : str4, (i11 & 256) != 0 ? null : l15, (i11 & 512) != 0 ? null : l16, (i11 & 1024) != 0 ? null : num, (i11 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? null : l17, (i11 & 4096) != 0 ? null : l18, (i11 & 8192) != 0 ? null : l19, (i11 & 16384) != 0 ? null : l21, (i11 & 32768) != 0 ? null : str5, (i11 & 65536) != 0 ? null : liveChannel, (i11 & 131072) != 0 ? null : stat, (i11 & 262144) != 0 ? 1.0f : f11, (i11 & 524288) == 0 ? f12 : 1.0f, (i11 & ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE) != 0 ? null : str6, (i11 & 2097152) != 0 ? 0L : j11, (i11 & 4194304) != 0 ? null : l22);
    }
}
