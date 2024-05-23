package com.zing.zalo.shortvideo.data.remote.ws.call;

import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.remote.ws.response.LiveChannel;
import com.zing.zalo.shortvideo.data.remote.ws.response.StreamData;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import p10.AbstractC24599c;
import p10.C24606j;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26794h;
import tn0.C26810m0;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class LiveChanelStats implements Parcelable {

    /* renamed from: p */
    private String f50232p;

    /* renamed from: q */
    private Boolean f50233q;

    /* renamed from: r */
    private Long f50234r;

    /* renamed from: s */
    private Long f50235s;

    /* renamed from: t */
    private Long f50236t;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LiveChanelStats> CREATOR = new C9448a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final LiveChanelStats m51609a(Channel channel) {
            AbstractC19074t.m100208f(channel, "channelFromApi");
            long m50782t = channel.m50782t();
            return new LiveChanelStats((String) null, (Boolean) null, Long.valueOf(channel.m50779q()), Long.valueOf(m50782t), Long.valueOf(channel.m50777p()), 3, (AbstractC19060k) null);
        }

        public final KSerializer serializer() {
            return LiveChanelStats$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.remote.ws.call.LiveChanelStats$a */
    /* loaded from: classes5.dex */
    public static final class C9448a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LiveChanelStats createFromParcel(Parcel parcel) {
            Boolean valueOf;
            AbstractC19074t.m100208f(parcel, "parcel");
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new LiveChanelStats(readString, valueOf, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LiveChanelStats[] newArray(int i11) {
            return new LiveChanelStats[i11];
        }
    }

    public /* synthetic */ LiveChanelStats(int i11, String str, Boolean bool, Long l11, Long l12, Long l13, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f50232p = null;
        } else {
            this.f50232p = str;
        }
        if ((i11 & 2) == 0) {
            this.f50233q = null;
        } else {
            this.f50233q = bool;
        }
        if ((i11 & 4) == 0) {
            this.f50234r = null;
        } else {
            this.f50234r = l11;
        }
        if ((i11 & 8) == 0) {
            this.f50235s = null;
        } else {
            this.f50235s = l12;
        }
        if ((i11 & 16) == 0) {
            this.f50236t = null;
        } else {
            this.f50236t = l13;
        }
    }

    /* renamed from: k */
    public static final /* synthetic */ void m51598k(LiveChanelStats liveChanelStats, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || liveChanelStats.f50232p != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26814n1.f127034a, liveChanelStats.f50232p);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || liveChanelStats.f50233q != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26794h.f127000a, liveChanelStats.f50233q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || liveChanelStats.f50234r != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26810m0.f127024a, liveChanelStats.f50234r);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || liveChanelStats.f50235s != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, C26810m0.f127024a, liveChanelStats.f50235s);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || liveChanelStats.f50236t != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 4, C26810m0.f127024a, liveChanelStats.f50236t);
        }
    }

    /* renamed from: a */
    public final void m51599a() {
        this.f50233q = null;
        this.f50234r = null;
        this.f50235s = null;
        this.f50236t = null;
        this.f50232p = null;
    }

    /* renamed from: b */
    public final Long m51600b() {
        return this.f50236t;
    }

    /* renamed from: c */
    public final Long m51601c() {
        return this.f50234r;
    }

    /* renamed from: d */
    public final String m51602d() {
        return this.f50232p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Long m51603e() {
        return this.f50235s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveChanelStats)) {
            return false;
        }
        LiveChanelStats liveChanelStats = (LiveChanelStats) obj;
        return AbstractC19074t.m100204b(this.f50232p, liveChanelStats.f50232p) && AbstractC19074t.m100204b(this.f50233q, liveChanelStats.f50233q) && AbstractC19074t.m100204b(this.f50234r, liveChanelStats.f50234r) && AbstractC19074t.m100204b(this.f50235s, liveChanelStats.f50235s) && AbstractC19074t.m100204b(this.f50236t, liveChanelStats.f50236t);
    }

    /* renamed from: f */
    public final boolean m51604f() {
        return (this.f50234r == null || this.f50235s == null || this.f50236t == null) ? false : true;
    }

    /* renamed from: g */
    public final Boolean m51605g() {
        return this.f50233q;
    }

    /* renamed from: h */
    public final void m51606h(StreamData streamData) {
        String str;
        Long l11;
        Long l12;
        LiveChannel.Stat m51675a;
        LiveChannel.Stat m51675a2;
        LiveChannel.Stat m51675a3;
        if (streamData == null) {
            return;
        }
        Long m51689e = streamData.m51689e();
        Long l13 = null;
        if (m51689e != null) {
            str = m51689e.toString();
        } else {
            str = null;
        }
        this.f50232p = str;
        LiveChannel m51686b = streamData.m51686b();
        if (m51686b != null && (m51675a3 = m51686b.m51675a()) != null) {
            l11 = m51675a3.m51678b();
        } else {
            l11 = null;
        }
        LiveChannel m51686b2 = streamData.m51686b();
        if (m51686b2 != null && (m51675a2 = m51686b2.m51675a()) != null) {
            l12 = m51675a2.m51679c();
        } else {
            l12 = null;
        }
        LiveChannel m51686b3 = streamData.m51686b();
        if (m51686b3 != null && (m51675a = m51686b3.m51675a()) != null) {
            l13 = m51675a.m51677a();
        }
        if (l11 != null) {
            this.f50234r = l11;
        }
        if (l12 != null) {
            this.f50235s = l12;
        }
        if (l13 != null) {
            this.f50236t = l13;
        }
    }

    public int hashCode() {
        String str = this.f50232p;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f50233q;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l11 = this.f50234r;
        int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f50235s;
        int hashCode4 = (hashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f50236t;
        return hashCode4 + (l13 != null ? l13.hashCode() : 0);
    }

    /* renamed from: i */
    public final void m51607i(String str, boolean z11) {
        if (AbstractC19074t.m100204b(str, this.f50232p)) {
            this.f50233q = Boolean.valueOf(z11);
        }
    }

    /* renamed from: j */
    public final void m51608j(AbstractC24599c abstractC24599c) {
        String str;
        Long m51689e;
        AbstractC19074t.m100208f(abstractC24599c, "event");
        if (abstractC24599c instanceof C24606j) {
            StreamData m128097c = ((C24606j) abstractC24599c).m128097c();
            String str2 = this.f50232p;
            if (m128097c != null && (m51689e = m128097c.m51689e()) != null) {
                str = m51689e.toString();
            } else {
                str = null;
            }
            if (AbstractC19074t.m100204b(str2, str)) {
                m51606h(m128097c);
            }
        }
    }

    public String toString() {
        return "LiveChanelStats(liveId=" + this.f50232p + ", isFollow=" + this.f50233q + ", likes=" + this.f50234r + ", videos=" + this.f50235s + ", followers=" + this.f50236t + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f50232p);
        Boolean bool = this.f50233q;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Long l11 = this.f50234r;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l11.longValue());
        }
        Long l12 = this.f50235s;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l12.longValue());
        }
        Long l13 = this.f50236t;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l13.longValue());
        }
    }

    public LiveChanelStats(String str, Boolean bool, Long l11, Long l12, Long l13) {
        this.f50232p = str;
        this.f50233q = bool;
        this.f50234r = l11;
        this.f50235s = l12;
        this.f50236t = l13;
    }

    public /* synthetic */ LiveChanelStats(String str, Boolean bool, Long l11, Long l12, Long l13, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : l11, (i11 & 8) != 0 ? null : l12, (i11 & 16) != 0 ? null : l13);
    }
}
