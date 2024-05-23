package com.zing.zalo.shortvideo.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.shortvideo.data.model.VideoAdsData;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import pm0.C24848g0;
import qm0.AbstractC25368s;
import qn0.InterfaceC25392g;
import rn0.AbstractC25935a;
import sn0.AbstractC26340g;
import sn0.C26334a;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import tn0.C26794h;
import tn0.C26810m0;
import tn0.C26814n1;

@InterfaceC25392g(with = C9390b.class)
/* loaded from: classes5.dex */
public final class ComplexAds implements Parcelable {

    /* renamed from: p */
    private final Section f49814p;

    /* renamed from: q */
    private final Config f49815q;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ComplexAds> CREATOR = new C9389a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return new C9390b();
        }
    }

    @InterfaceC25392g
    /* loaded from: classes5.dex */
    public static final class Config implements Parcelable {

        /* renamed from: p */
        private final int f49816p;

        /* renamed from: q */
        private final int f49817q;

        /* renamed from: r */
        private final int f49818r;

        /* renamed from: s */
        private final long f49819s;

        /* renamed from: t */
        private final int f49820t;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Config> CREATOR = new C9388a();

        /* loaded from: classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
                this();
            }

            public final KSerializer serializer() {
                return ComplexAds$Config$$serializer.INSTANCE;
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.data.model.ComplexAds$Config$a */
        /* loaded from: classes5.dex */
        public static final class C9388a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final Config createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                return new Config(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final Config[] newArray(int i11) {
                return new Config[i11];
            }
        }

        public /* synthetic */ Config(int i11, int i12, int i13, int i14, long j11, int i15, AbstractC26805k1 abstractC26805k1) {
            if (31 != (i11 & 31)) {
                AbstractC26774a1.m137800b(i11, 31, ComplexAds$Config$$serializer.INSTANCE.getDescriptor());
            }
            this.f49816p = i12;
            this.f49817q = i13;
            this.f49818r = i14;
            this.f49819s = j11;
            this.f49820t = i15;
        }

        /* renamed from: f */
        public static final /* synthetic */ void m50880f(Config config, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
            interfaceC21886d.mo114033x(serialDescriptor, 0, config.f49816p);
            interfaceC21886d.mo114033x(serialDescriptor, 1, config.f49817q);
            interfaceC21886d.mo114033x(serialDescriptor, 2, config.f49818r);
            interfaceC21886d.mo114022E(serialDescriptor, 3, config.f49819s);
            interfaceC21886d.mo114033x(serialDescriptor, 4, config.f49820t);
        }

        /* renamed from: a */
        public final int m50881a() {
            return this.f49817q;
        }

        /* renamed from: b */
        public final int m50882b() {
            return this.f49820t;
        }

        /* renamed from: c */
        public final int m50883c() {
            return this.f49816p;
        }

        /* renamed from: d */
        public final int m50884d() {
            return this.f49818r;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final long m50885e() {
            return this.f49819s;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.f49816p == config.f49816p && this.f49817q == config.f49817q && this.f49818r == config.f49818r && this.f49819s == config.f49819s && this.f49820t == config.f49820t;
        }

        public int hashCode() {
            return (((((((this.f49816p * 31) + this.f49817q) * 31) + this.f49818r) * 31) + AbstractC2147g0.m11521a(this.f49819s)) * 31) + this.f49820t;
        }

        public String toString() {
            return "Config(minAdsInsertStep=" + this.f49816p + ", forceAdsInsertStep=" + this.f49817q + ", satisfiedItemCount=" + this.f49818r + ", satisfiedWatchTime=" + this.f49819s + ", loadAdsStep=" + this.f49820t + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            AbstractC19074t.m100208f(parcel, "out");
            parcel.writeInt(this.f49816p);
            parcel.writeInt(this.f49817q);
            parcel.writeInt(this.f49818r);
            parcel.writeLong(this.f49819s);
            parcel.writeInt(this.f49820t);
        }

        public Config(int i11, int i12, int i13, long j11, int i14) {
            this.f49816p = i11;
            this.f49817q = i12;
            this.f49818r = i13;
            this.f49819s = j11;
            this.f49820t = i14;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.ComplexAds$a */
    /* loaded from: classes5.dex */
    public static final class C9389a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final ComplexAds createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new ComplexAds((Section) parcel.readParcelable(ComplexAds.class.getClassLoader()), parcel.readInt() == 0 ? null : Config.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final ComplexAds[] newArray(int i11) {
            return new ComplexAds[i11];
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.ComplexAds$b */
    /* loaded from: classes5.dex */
    public static final class C9390b implements KSerializer {

        /* renamed from: a */
        private final SerialDescriptor f49821a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.data.model.ComplexAds$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final a f49822q = new a();

            a() {
                super(1);
            }

            /* renamed from: a */
            public final void m50892a(C26334a c26334a) {
                List m131502j;
                List m131502j2;
                List m131502j3;
                List m131502j4;
                List m131502j5;
                List m131502j6;
                List m131502j7;
                AbstractC19074t.m100208f(c26334a, "$this$buildClassSerialDescriptor");
                C26334a.m135524b(c26334a, "items", AbstractC25935a.m133617h(new VideoAdsData.C9435b()).getDescriptor(), null, false, 12, null);
                m131502j = AbstractC25368s.m131502j();
                c26334a.m135525a("total", C26810m0.f127024a.getDescriptor(), m131502j, false);
                m131502j2 = AbstractC25368s.m131502j();
                c26334a.m135525a("hasMore", C26794h.f127000a.getDescriptor(), m131502j2, false);
                m131502j3 = AbstractC25368s.m131502j();
                C26814n1 c26814n1 = C26814n1.f127034a;
                c26334a.m135525a("lastId", c26814n1.getDescriptor(), m131502j3, false);
                m131502j4 = AbstractC25368s.m131502j();
                c26334a.m135525a("lastIndex", c26814n1.getDescriptor(), m131502j4, false);
                m131502j5 = AbstractC25368s.m131502j();
                c26334a.m135525a("moreLink", c26814n1.getDescriptor(), m131502j5, false);
                m131502j6 = AbstractC25368s.m131502j();
                c26334a.m135525a("pagingExt", c26814n1.getDescriptor(), m131502j6, false);
                m131502j7 = AbstractC25368s.m131502j();
                c26334a.m135525a("config", Config.Companion.serializer().getDescriptor(), m131502j7, false);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m50892a((C26334a) obj);
                return C24848g0.f119245a;
            }
        }

        public C9390b() {
            String name = ComplexAds.class.getName();
            AbstractC19074t.m100207e(name, "getName(...)");
            this.f49821a = AbstractC26340g.m135540b(name, new SerialDescriptor[0], a.f49822q);
        }

        @Override // qn0.InterfaceC25386a
        /* renamed from: a */
        public ComplexAds deserialize(Decoder decoder) {
            Object m131502j;
            AbstractC19074t.m100208f(decoder, "decoder");
            m131502j = AbstractC25368s.m131502j();
            SerialDescriptor descriptor = getDescriptor();
            InterfaceC21885c mo113968b = decoder.mo113968b(descriptor);
            PagingLoadMoreInfo pagingLoadMoreInfo = null;
            long j11 = 0;
            String str = "";
            String str2 = str;
            String str3 = str2;
            String str4 = str3;
            Object obj = null;
            boolean z11 = false;
            while (true) {
                int mo114037p = mo113968b.mo114037p(getDescriptor());
                switch (mo114037p) {
                    case -1:
                        C24848g0 c24848g0 = C24848g0.f119245a;
                        mo113968b.mo114009c(descriptor);
                        List list = (List) m131502j;
                        if (z11) {
                            pagingLoadMoreInfo = new PagingLoadMoreInfo(z11, str, str2, str3, str4);
                        }
                        return new ComplexAds(new Section(list, j11, pagingLoadMoreInfo), (Config) obj);
                    case 0:
                        m131502j = InterfaceC21885c.a.m114040c(mo113968b, getDescriptor(), 0, AbstractC25935a.m133617h(new VideoAdsData.C9435b()), null, 8, null);
                        break;
                    case 1:
                        j11 = mo113968b.mo114010f(getDescriptor(), 1);
                        break;
                    case 2:
                        z11 = mo113968b.mo114004D(getDescriptor(), 2);
                        break;
                    case 3:
                        str = mo113968b.mo114014o(getDescriptor(), 3);
                        break;
                    case 4:
                        str2 = mo113968b.mo114014o(getDescriptor(), 4);
                        break;
                    case 5:
                        str3 = mo113968b.mo114014o(getDescriptor(), 5);
                        break;
                    case 6:
                        str4 = mo113968b.mo114014o(getDescriptor(), 6);
                        break;
                    case 7:
                        obj = InterfaceC21885c.a.m114040c(mo113968b, getDescriptor(), 7, Config.Companion.serializer(), null, 8, null);
                        break;
                    default:
                        throw new IllegalStateException(("Unexpected index: " + mo114037p).toString());
                }
            }
        }

        @Override // qn0.InterfaceC25393h
        /* renamed from: b */
        public void serialize(Encoder encoder, ComplexAds complexAds) {
            AbstractC19074t.m100208f(encoder, "encoder");
            AbstractC19074t.m100208f(complexAds, "value");
            throw new IllegalStateException("Serialization is not supported".toString());
        }

        @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
        public SerialDescriptor getDescriptor() {
            return this.f49821a;
        }
    }

    public ComplexAds(Section section, Config config) {
        AbstractC19074t.m100208f(section, "ads");
        this.f49814p = section;
        this.f49815q = config;
    }

    /* renamed from: a */
    public final Section m50878a() {
        return this.f49814p;
    }

    /* renamed from: b */
    public final Config m50879b() {
        return this.f49815q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComplexAds)) {
            return false;
        }
        ComplexAds complexAds = (ComplexAds) obj;
        return AbstractC19074t.m100204b(this.f49814p, complexAds.f49814p) && AbstractC19074t.m100204b(this.f49815q, complexAds.f49815q);
    }

    public int hashCode() {
        int hashCode = this.f49814p.hashCode() * 31;
        Config config = this.f49815q;
        return hashCode + (config == null ? 0 : config.hashCode());
    }

    public String toString() {
        return "ComplexAds(ads=" + this.f49814p + ", cfg=" + this.f49815q + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeParcelable(this.f49814p, i11);
        Config config = this.f49815q;
        if (config == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            config.writeToParcel(parcel, i11);
        }
    }
}
