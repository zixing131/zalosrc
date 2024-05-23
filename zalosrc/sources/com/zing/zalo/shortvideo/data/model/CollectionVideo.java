package com.zing.zalo.shortvideo.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.model.VideoData;
import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.model.Video$$serializer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
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
import sn0.AbstractC26340g;
import tn0.AbstractC26805k1;
import tn0.C26814n1;
import un0.AbstractC27331i;
import un0.InterfaceC27329g;
import v00.C27417l;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class CollectionVideo implements Parcelable {

    /* renamed from: p */
    private final Section f49779p;

    /* renamed from: q */
    private final String f49780q;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CollectionVideo> CREATOR = new C9383a();

    /* renamed from: r */
    private static final KSerializer[] f49778r = {Section.CREATOR.serializer(Video$$serializer.INSTANCE), null};

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return CollectionVideo$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.CollectionVideo$a */
    /* loaded from: classes5.dex */
    public static final class C9383a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CollectionVideo createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new CollectionVideo((Section) parcel.readParcelable(CollectionVideo.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CollectionVideo[] newArray(int i11) {
            return new CollectionVideo[i11];
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.CollectionVideo$b */
    /* loaded from: classes5.dex */
    public static final class C9384b implements KSerializer {

        /* renamed from: a */
        private final boolean f49781a;

        /* renamed from: b */
        private final SerialDescriptor f49782b;

        public C9384b(boolean z11) {
            this.f49781a = z11;
            String name = CollectionVideo.class.getName();
            AbstractC19074t.m100207e(name, "getName(...)");
            this.f49782b = AbstractC26340g.m135541c(name, new SerialDescriptor[0], null, 4, null);
        }

        @Override // qn0.InterfaceC25386a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CollectionVideo deserialize(Decoder decoder) {
            InterfaceC27329g interfaceC27329g;
            int m131511r;
            int m131511r2;
            AbstractC19074t.m100208f(decoder, "decoder");
            if (decoder instanceof InterfaceC27329g) {
                interfaceC27329g = (InterfaceC27329g) decoder;
            } else {
                interfaceC27329g = null;
            }
            if (interfaceC27329g != null) {
                JsonObject m139916m = AbstractC27331i.m139916m(interfaceC27329g.mo139898g());
                String m51743x = AbstractC9465b.m51743x(m139916m, "title");
                if (this.f49781a) {
                    Section section = (Section) C27417l.f129055a.m140384h().m139867d(new Section.C9424a(new VideoData.C9437b()), m139916m.toString());
                    List m51168m = section.m51168m();
                    m131511r2 = AbstractC25370t.m131511r(m51168m, 10);
                    ArrayList arrayList = new ArrayList(m131511r2);
                    Iterator it = m51168m.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Video((VideoData) it.next()));
                    }
                    return new CollectionVideo(new Section(arrayList, section.m51170o(), section.m51169n()), m51743x);
                }
                Section section2 = (Section) C27417l.f129055a.m140384h().m139867d(new Section.C9424a(new VideoData.C9437b()), String.valueOf(AbstractC9465b.m51733n(m139916m, "videos")));
                List m51168m2 = section2.m51168m();
                m131511r = AbstractC25370t.m131511r(m51168m2, 10);
                ArrayList arrayList2 = new ArrayList(m131511r);
                Iterator it2 = m51168m2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new Video((VideoData) it2.next()));
                }
                return new CollectionVideo(new Section(arrayList2, section2.m51170o(), section2.m51169n()), m51743x);
            }
            throw new IllegalStateException("Can be deserialized only by JSON".toString());
        }

        @Override // qn0.InterfaceC25393h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void serialize(Encoder encoder, CollectionVideo collectionVideo) {
            AbstractC19074t.m100208f(encoder, "encoder");
            AbstractC19074t.m100208f(collectionVideo, "value");
            throw new IllegalStateException("Serialization is not supported".toString());
        }

        @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
        public SerialDescriptor getDescriptor() {
            return this.f49782b;
        }
    }

    public /* synthetic */ CollectionVideo(int i11, Section section, String str, AbstractC26805k1 abstractC26805k1) {
        this.f49779p = (i11 & 1) == 0 ? new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null) : section;
        if ((i11 & 2) == 0) {
            this.f49780q = null;
        } else {
            this.f49780q = str;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m50802d(CollectionVideo collectionVideo, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f49778r;
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || !AbstractC19074t.m100204b(collectionVideo.f49779p, new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null))) {
            interfaceC21886d.mo114029i(serialDescriptor, 0, kSerializerArr[0], collectionVideo.f49779p);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || collectionVideo.f49780q != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26814n1.f127034a, collectionVideo.f49780q);
        }
    }

    /* renamed from: b */
    public final Section m50803b() {
        return this.f49779p;
    }

    /* renamed from: c */
    public final String m50804c() {
        return this.f49780q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionVideo)) {
            return false;
        }
        CollectionVideo collectionVideo = (CollectionVideo) obj;
        return AbstractC19074t.m100204b(this.f49779p, collectionVideo.f49779p) && AbstractC19074t.m100204b(this.f49780q, collectionVideo.f49780q);
    }

    public int hashCode() {
        int hashCode = this.f49779p.hashCode() * 31;
        String str = this.f49780q;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "CollectionVideo(sectionVideo=" + this.f49779p + ", title=" + this.f49780q + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeParcelable(this.f49779p, i11);
        parcel.writeString(this.f49780q);
    }

    public CollectionVideo(Section section, String str) {
        AbstractC19074t.m100208f(section, "sectionVideo");
        this.f49779p = section;
        this.f49780q = str;
    }
}
