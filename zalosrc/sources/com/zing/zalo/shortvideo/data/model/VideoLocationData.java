package com.zing.zalo.shortvideo.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.shortvideo.data.model.VideoData;
import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.model.Video$$serializer;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19071q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.json.JsonObject;
import qm0.AbstractC25370t;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import tn0.C26814n1;
import un0.AbstractC27331i;
import un0.InterfaceC27329g;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class VideoLocationData implements Parcelable {

    /* renamed from: p */
    private Section f50087p;

    /* renamed from: q */
    private String f50088q;

    /* renamed from: r */
    private String f50089r;

    /* renamed from: s */
    private String f50090s;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<VideoLocationData> CREATOR = new C9438a();

    /* renamed from: t */
    private static final KSerializer[] f50086t = {Section.CREATOR.serializer(Video$$serializer.INSTANCE), null, null, null};

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return VideoLocationData$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.VideoLocationData$a */
    /* loaded from: classes5.dex */
    public static final class C9438a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VideoLocationData createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new VideoLocationData((Section) parcel.readParcelable(VideoLocationData.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final VideoLocationData[] newArray(int i11) {
            return new VideoLocationData[i11];
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.VideoLocationData$b */
    /* loaded from: classes5.dex */
    public static final class C9439b implements KSerializer {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final SerialDescriptor f50091a = VideoLocationData.Companion.serializer().getDescriptor();

        /* renamed from: com.zing.zalo.shortvideo.data.model.VideoLocationData$b$a */
        /* loaded from: classes5.dex */
        public static final class a {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.data.model.VideoLocationData$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public /* synthetic */ class C32723a extends C19071q implements InterfaceC18505l {
                C32723a(Object obj) {
                    super(1, obj, VideoData.C9437b.a.class, "deserialize", "deserialize(Lkotlinx/serialization/json/JsonObject;)Lcom/zing/zalo/shortvideo/data/model/VideoData;", 0);
                }

                @Override // en0.InterfaceC18505l
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public final VideoData mo205i9(JsonObject jsonObject) {
                    AbstractC19074t.m100208f(jsonObject, "p0");
                    return ((VideoData.C9437b.a) this.f94922q).m51386a(jsonObject);
                }
            }

            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final VideoLocationData m51397a(JsonObject jsonObject) {
                int m131511r;
                AbstractC19074t.m100208f(jsonObject, "json");
                Section m51738s = AbstractC9465b.m51738s(AbstractC9465b.m51732m(jsonObject, "videos"), new C32723a(VideoData.C9437b.Companion));
                List m51168m = m51738s.m51168m();
                m131511r = AbstractC25370t.m131511r(m51168m, 10);
                ArrayList arrayList = new ArrayList(m131511r);
                Iterator it = m51168m.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Video((VideoData) it.next()));
                }
                return new VideoLocationData(new Section(arrayList, m51738s.m51170o(), m51738s.m51169n()), AbstractC9465b.m51743x(jsonObject, "title"), AbstractC9465b.m51743x(jsonObject, "desc"), AbstractC9465b.m51743x(jsonObject, "shareURL"));
            }
        }

        @Override // qn0.InterfaceC25386a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public VideoLocationData deserialize(Decoder decoder) {
            InterfaceC27329g interfaceC27329g;
            AbstractC19074t.m100208f(decoder, "decoder");
            if (decoder instanceof InterfaceC27329g) {
                interfaceC27329g = (InterfaceC27329g) decoder;
            } else {
                interfaceC27329g = null;
            }
            if (interfaceC27329g != null) {
                return Companion.m51397a(AbstractC27331i.m139916m(interfaceC27329g.mo139898g()));
            }
            throw new IllegalStateException("Can be deserialized only by JSON".toString());
        }

        @Override // qn0.InterfaceC25393h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(Encoder encoder, VideoLocationData videoLocationData) {
            AbstractC19074t.m100208f(encoder, "encoder");
            AbstractC19074t.m100208f(videoLocationData, "value");
            throw new IllegalStateException("Serialization is not supported".toString());
        }

        @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
        public SerialDescriptor getDescriptor() {
            return this.f50091a;
        }
    }

    public /* synthetic */ VideoLocationData(int i11, Section section, String str, String str2, String str3, AbstractC26805k1 abstractC26805k1) {
        if (14 != (i11 & 14)) {
            AbstractC26774a1.m137800b(i11, 14, VideoLocationData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.f50087p = new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null);
        } else {
            this.f50087p = section;
        }
        this.f50088q = str;
        this.f50089r = str2;
        this.f50090s = str3;
    }

    /* renamed from: f */
    public static final /* synthetic */ void m51388f(VideoLocationData videoLocationData, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f50086t;
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || !AbstractC19074t.m100204b(videoLocationData.f50087p, new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null))) {
            interfaceC21886d.mo114029i(serialDescriptor, 0, kSerializerArr[0], videoLocationData.f50087p);
        }
        C26814n1 c26814n1 = C26814n1.f127034a;
        interfaceC21886d.mo114028h(serialDescriptor, 1, c26814n1, videoLocationData.f50088q);
        interfaceC21886d.mo114028h(serialDescriptor, 2, c26814n1, videoLocationData.f50089r);
        interfaceC21886d.mo114028h(serialDescriptor, 3, c26814n1, videoLocationData.f50090s);
    }

    /* renamed from: b */
    public final String m51389b() {
        return this.f50089r;
    }

    /* renamed from: c */
    public final Section m51390c() {
        return this.f50087p;
    }

    /* renamed from: d */
    public final String m51391d() {
        return this.f50090s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m51392e() {
        return this.f50088q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoLocationData)) {
            return false;
        }
        VideoLocationData videoLocationData = (VideoLocationData) obj;
        return AbstractC19074t.m100204b(this.f50087p, videoLocationData.f50087p) && AbstractC19074t.m100204b(this.f50088q, videoLocationData.f50088q) && AbstractC19074t.m100204b(this.f50089r, videoLocationData.f50089r) && AbstractC19074t.m100204b(this.f50090s, videoLocationData.f50090s);
    }

    public int hashCode() {
        int hashCode = this.f50087p.hashCode() * 31;
        String str = this.f50088q;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f50089r;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f50090s;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "VideoLocationData(section=" + this.f50087p + ", title=" + this.f50088q + ", desc=" + this.f50089r + ", shareUrl=" + this.f50090s + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeParcelable(this.f50087p, i11);
        parcel.writeString(this.f50088q);
        parcel.writeString(this.f50089r);
        parcel.writeString(this.f50090s);
    }

    public VideoLocationData(Section section, String str, String str2, String str3) {
        AbstractC19074t.m100208f(section, "section");
        this.f50087p = section;
        this.f50088q = str;
        this.f50089r = str2;
        this.f50090s = str3;
    }
}
