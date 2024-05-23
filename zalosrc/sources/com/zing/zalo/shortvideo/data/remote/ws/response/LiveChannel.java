package com.zing.zalo.shortvideo.data.remote.ws.response;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26810m0;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class LiveChannel implements Parcelable {

    /* renamed from: p */
    private final Long f50301p;

    /* renamed from: q */
    private final Long f50302q;

    /* renamed from: r */
    private final String f50303r;

    /* renamed from: s */
    private final String f50304s;

    /* renamed from: t */
    private final String f50305t;

    /* renamed from: u */
    private final String f50306u;

    /* renamed from: v */
    private final String f50307v;

    /* renamed from: w */
    private final String f50308w;

    /* renamed from: x */
    private final Long f50309x;

    /* renamed from: y */
    private final Long f50310y;

    /* renamed from: z */
    private final Stat f50311z;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LiveChannel> CREATOR = new C9456a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return LiveChannel$$serializer.INSTANCE;
        }
    }

    @InterfaceC25392g
    /* loaded from: classes5.dex */
    public static final class Stat implements Parcelable {

        /* renamed from: p */
        private final Long f50312p;

        /* renamed from: q */
        private final Long f50313q;

        /* renamed from: r */
        private final Long f50314r;

        /* renamed from: s */
        private final Long f50315s;

        /* renamed from: t */
        private final Long f50316t;

        /* renamed from: u */
        private final Long f50317u;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Stat> CREATOR = new C9455a();

        /* loaded from: classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
                this();
            }

            public final KSerializer serializer() {
                return LiveChannel$Stat$$serializer.INSTANCE;
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.data.remote.ws.response.LiveChannel$Stat$a */
        /* loaded from: classes5.dex */
        public static final class C9455a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Stat createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                return new Stat(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Stat[] newArray(int i11) {
                return new Stat[i11];
            }
        }

        public /* synthetic */ Stat(int i11, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, AbstractC26805k1 abstractC26805k1) {
            if ((i11 & 1) == 0) {
                this.f50312p = null;
            } else {
                this.f50312p = l11;
            }
            if ((i11 & 2) == 0) {
                this.f50313q = null;
            } else {
                this.f50313q = l12;
            }
            if ((i11 & 4) == 0) {
                this.f50314r = null;
            } else {
                this.f50314r = l13;
            }
            if ((i11 & 8) == 0) {
                this.f50315s = null;
            } else {
                this.f50315s = l14;
            }
            if ((i11 & 16) == 0) {
                this.f50316t = null;
            } else {
                this.f50316t = l15;
            }
            if ((i11 & 32) == 0) {
                this.f50317u = null;
            } else {
                this.f50317u = l16;
            }
        }

        /* renamed from: d */
        public static final /* synthetic */ void m51676d(Stat stat, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
            if (interfaceC21886d.mo114019A(serialDescriptor, 0) || stat.f50312p != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 0, C26810m0.f127024a, stat.f50312p);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 1) || stat.f50313q != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 1, C26810m0.f127024a, stat.f50313q);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 2) || stat.f50314r != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 2, C26810m0.f127024a, stat.f50314r);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 3) || stat.f50315s != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 3, C26810m0.f127024a, stat.f50315s);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 4) || stat.f50316t != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 4, C26810m0.f127024a, stat.f50316t);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 5) || stat.f50317u != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 5, C26810m0.f127024a, stat.f50317u);
            }
        }

        /* renamed from: a */
        public final Long m51677a() {
            return this.f50313q;
        }

        /* renamed from: b */
        public final Long m51678b() {
            return this.f50314r;
        }

        /* renamed from: c */
        public final Long m51679c() {
            return this.f50312p;
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
            return AbstractC19074t.m100204b(this.f50312p, stat.f50312p) && AbstractC19074t.m100204b(this.f50313q, stat.f50313q) && AbstractC19074t.m100204b(this.f50314r, stat.f50314r) && AbstractC19074t.m100204b(this.f50315s, stat.f50315s) && AbstractC19074t.m100204b(this.f50316t, stat.f50316t) && AbstractC19074t.m100204b(this.f50317u, stat.f50317u);
        }

        public int hashCode() {
            Long l11 = this.f50312p;
            int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
            Long l12 = this.f50313q;
            int hashCode2 = (hashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.f50314r;
            int hashCode3 = (hashCode2 + (l13 == null ? 0 : l13.hashCode())) * 31;
            Long l14 = this.f50315s;
            int hashCode4 = (hashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
            Long l15 = this.f50316t;
            int hashCode5 = (hashCode4 + (l15 == null ? 0 : l15.hashCode())) * 31;
            Long l16 = this.f50317u;
            return hashCode5 + (l16 != null ? l16.hashCode() : 0);
        }

        public String toString() {
            return "Stat(videos=" + this.f50312p + ", followers=" + this.f50313q + ", likes=" + this.f50314r + ", views=" + this.f50315s + ", shares=" + this.f50316t + ", cmts=" + this.f50317u + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            AbstractC19074t.m100208f(parcel, "out");
            Long l11 = this.f50312p;
            if (l11 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l11.longValue());
            }
            Long l12 = this.f50313q;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l12.longValue());
            }
            Long l13 = this.f50314r;
            if (l13 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l13.longValue());
            }
            Long l14 = this.f50315s;
            if (l14 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l14.longValue());
            }
            Long l15 = this.f50316t;
            if (l15 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l15.longValue());
            }
            Long l16 = this.f50317u;
            if (l16 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l16.longValue());
            }
        }

        public Stat(Long l11, Long l12, Long l13, Long l14, Long l15, Long l16) {
            this.f50312p = l11;
            this.f50313q = l12;
            this.f50314r = l13;
            this.f50315s = l14;
            this.f50316t = l15;
            this.f50317u = l16;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.remote.ws.response.LiveChannel$a */
    /* loaded from: classes5.dex */
    public static final class C9456a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LiveChannel createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new LiveChannel(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Stat.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LiveChannel[] newArray(int i11) {
            return new LiveChannel[i11];
        }
    }

    public /* synthetic */ LiveChannel(int i11, Long l11, Long l12, String str, String str2, String str3, String str4, String str5, String str6, Long l13, Long l14, Stat stat, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f50301p = null;
        } else {
            this.f50301p = l11;
        }
        if ((i11 & 2) == 0) {
            this.f50302q = null;
        } else {
            this.f50302q = l12;
        }
        if ((i11 & 4) == 0) {
            this.f50303r = null;
        } else {
            this.f50303r = str;
        }
        if ((i11 & 8) == 0) {
            this.f50304s = null;
        } else {
            this.f50304s = str2;
        }
        if ((i11 & 16) == 0) {
            this.f50305t = null;
        } else {
            this.f50305t = str3;
        }
        if ((i11 & 32) == 0) {
            this.f50306u = null;
        } else {
            this.f50306u = str4;
        }
        if ((i11 & 64) == 0) {
            this.f50307v = null;
        } else {
            this.f50307v = str5;
        }
        if ((i11 & 128) == 0) {
            this.f50308w = null;
        } else {
            this.f50308w = str6;
        }
        if ((i11 & 256) == 0) {
            this.f50309x = null;
        } else {
            this.f50309x = l13;
        }
        if ((i11 & 512) == 0) {
            this.f50310y = null;
        } else {
            this.f50310y = l14;
        }
        if ((i11 & 1024) == 0) {
            this.f50311z = null;
        } else {
            this.f50311z = stat;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ void m51674b(LiveChannel liveChannel, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || liveChannel.f50301p != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26810m0.f127024a, liveChannel.f50301p);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || liveChannel.f50302q != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26810m0.f127024a, liveChannel.f50302q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || liveChannel.f50303r != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26814n1.f127034a, liveChannel.f50303r);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || liveChannel.f50304s != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, C26814n1.f127034a, liveChannel.f50304s);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || liveChannel.f50305t != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 4, C26814n1.f127034a, liveChannel.f50305t);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || liveChannel.f50306u != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 5, C26814n1.f127034a, liveChannel.f50306u);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || liveChannel.f50307v != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 6, C26814n1.f127034a, liveChannel.f50307v);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || liveChannel.f50308w != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 7, C26814n1.f127034a, liveChannel.f50308w);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 8) || liveChannel.f50309x != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 8, C26810m0.f127024a, liveChannel.f50309x);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 9) || liveChannel.f50310y != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 9, C26810m0.f127024a, liveChannel.f50310y);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 10) || liveChannel.f50311z != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 10, LiveChannel$Stat$$serializer.INSTANCE, liveChannel.f50311z);
        }
    }

    /* renamed from: a */
    public final Stat m51675a() {
        return this.f50311z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveChannel)) {
            return false;
        }
        LiveChannel liveChannel = (LiveChannel) obj;
        return AbstractC19074t.m100204b(this.f50301p, liveChannel.f50301p) && AbstractC19074t.m100204b(this.f50302q, liveChannel.f50302q) && AbstractC19074t.m100204b(this.f50303r, liveChannel.f50303r) && AbstractC19074t.m100204b(this.f50304s, liveChannel.f50304s) && AbstractC19074t.m100204b(this.f50305t, liveChannel.f50305t) && AbstractC19074t.m100204b(this.f50306u, liveChannel.f50306u) && AbstractC19074t.m100204b(this.f50307v, liveChannel.f50307v) && AbstractC19074t.m100204b(this.f50308w, liveChannel.f50308w) && AbstractC19074t.m100204b(this.f50309x, liveChannel.f50309x) && AbstractC19074t.m100204b(this.f50310y, liveChannel.f50310y) && AbstractC19074t.m100204b(this.f50311z, liveChannel.f50311z);
    }

    public int hashCode() {
        Long l11 = this.f50301p;
        int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        Long l12 = this.f50302q;
        int hashCode2 = (hashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str = this.f50303r;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f50304s;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f50305t;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f50306u;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f50307v;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f50308w;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l13 = this.f50309x;
        int hashCode9 = (hashCode8 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.f50310y;
        int hashCode10 = (hashCode9 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Stat stat = this.f50311z;
        return hashCode10 + (stat != null ? stat.hashCode() : 0);
    }

    public String toString() {
        return "LiveChannel(channelId=" + this.f50301p + ", userId=" + this.f50302q + ", name=" + this.f50303r + ", alias=" + this.f50304s + ", avatar=" + this.f50305t + ", bio=" + this.f50306u + ", shareURL=" + this.f50307v + ", reportURL=" + this.f50308w + ", createdTime=" + this.f50309x + ", attributes=" + this.f50310y + ", stat=" + this.f50311z + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        Long l11 = this.f50301p;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l11.longValue());
        }
        Long l12 = this.f50302q;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l12.longValue());
        }
        parcel.writeString(this.f50303r);
        parcel.writeString(this.f50304s);
        parcel.writeString(this.f50305t);
        parcel.writeString(this.f50306u);
        parcel.writeString(this.f50307v);
        parcel.writeString(this.f50308w);
        Long l13 = this.f50309x;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l13.longValue());
        }
        Long l14 = this.f50310y;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l14.longValue());
        }
        Stat stat = this.f50311z;
        if (stat == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stat.writeToParcel(parcel, i11);
        }
    }

    public LiveChannel(Long l11, Long l12, String str, String str2, String str3, String str4, String str5, String str6, Long l13, Long l14, Stat stat) {
        this.f50301p = l11;
        this.f50302q = l12;
        this.f50303r = str;
        this.f50304s = str2;
        this.f50305t = str3;
        this.f50306u = str4;
        this.f50307v = str5;
        this.f50308w = str6;
        this.f50309x = l13;
        this.f50310y = l14;
        this.f50311z = stat;
    }
}
