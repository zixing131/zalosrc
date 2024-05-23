package com.zing.zalo.shortvideo.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2144f;
import com.zing.zalo.shortvideo.data.model.BreakSlot;
import com.zing.zalo.shortvideo.data.model.SectionBoxData;
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
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import qm0.AbstractC25370t;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26788f;
import un0.AbstractC27331i;
import un0.InterfaceC27329g;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class FollowingData implements Parcelable {

    /* renamed from: p */
    private Section f49840p;

    /* renamed from: q */
    private List f49841q;

    /* renamed from: r */
    private boolean f49842r;

    /* renamed from: s */
    private List f49843s;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<FollowingData> CREATOR = new C9396a();

    /* renamed from: t */
    private static final KSerializer[] f49839t = {Section.CREATOR.serializer(Video$$serializer.INSTANCE), new C26788f(BreakSlot$$serializer.INSTANCE), null, new C26788f(SectionBoxData$$serializer.INSTANCE)};

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return FollowingData$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.FollowingData$a */
    /* loaded from: classes5.dex */
    public static final class C9396a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FollowingData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            AbstractC19074t.m100208f(parcel, "parcel");
            Section section = (Section) parcel.readParcelable(FollowingData.class.getClassLoader());
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(BreakSlot.CREATOR.createFromParcel(parcel));
                }
            }
            boolean z11 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                for (int i12 = 0; i12 != readInt2; i12++) {
                    arrayList3.add(SectionBoxData.CREATOR.createFromParcel(parcel));
                }
                arrayList2 = arrayList3;
            }
            return new FollowingData(section, arrayList, z11, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FollowingData[] newArray(int i11) {
            return new FollowingData[i11];
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.FollowingData$b */
    /* loaded from: classes5.dex */
    public static final class C9397b implements KSerializer {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final SerialDescriptor f49844a = FollowingData.Companion.serializer().getDescriptor();

        /* renamed from: com.zing.zalo.shortvideo.data.model.FollowingData$b$a */
        /* loaded from: classes5.dex */
        public static final class a {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.data.model.FollowingData$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public /* synthetic */ class C32719a extends C19071q implements InterfaceC18505l {
                C32719a(Object obj) {
                    super(1, obj, BreakSlot.C9379b.a.class, "deserialize", "deserialize(Lkotlinx/serialization/json/JsonObject;)Lcom/zing/zalo/shortvideo/data/model/BreakSlot;", 0);
                }

                @Override // en0.InterfaceC18505l
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public final BreakSlot mo205i9(JsonObject jsonObject) {
                    AbstractC19074t.m100208f(jsonObject, "p0");
                    return ((BreakSlot.C9379b.a) this.f94922q).m50711a(jsonObject);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.data.model.FollowingData$b$a$b */
            /* loaded from: classes5.dex */
            public /* synthetic */ class b extends C19071q implements InterfaceC18505l {
                b(Object obj) {
                    super(1, obj, SectionBoxData.C9427b.a.class, "deserialize", "deserialize(Lkotlinx/serialization/json/JsonObject;)Lcom/zing/zalo/shortvideo/data/model/SectionBoxData;", 0);
                }

                @Override // en0.InterfaceC18505l
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public final SectionBoxData mo205i9(JsonObject jsonObject) {
                    AbstractC19074t.m100208f(jsonObject, "p0");
                    return ((SectionBoxData.C9427b.a) this.f94922q).m51192a(jsonObject);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.data.model.FollowingData$b$a$c */
            /* loaded from: classes5.dex */
            public /* synthetic */ class c extends C19071q implements InterfaceC18505l {
                c(Object obj) {
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
            public final FollowingData m50932a(JsonObject jsonObject) {
                int m131511r;
                ArrayList arrayList;
                ArrayList m51720a;
                ArrayList m51720a2;
                AbstractC19074t.m100208f(jsonObject, "json");
                Section m51738s = AbstractC9465b.m51738s(jsonObject, new c(VideoData.C9437b.Companion));
                List m51168m = m51738s.m51168m();
                m131511r = AbstractC25370t.m131511r(m51168m, 10);
                ArrayList arrayList2 = new ArrayList(m131511r);
                Iterator it = m51168m.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new Video((VideoData) it.next()));
                }
                Section section = new Section(arrayList2, m51738s.m51170o(), m51738s.m51169n());
                JsonElement jsonElement = (JsonElement) jsonObject.get("slots");
                ArrayList arrayList3 = null;
                if (jsonElement != null && (m51720a2 = AbstractC9465b.m51720a(jsonElement, new C32719a(BreakSlot.C9379b.Companion))) != null) {
                    arrayList = new ArrayList();
                    for (Object obj : m51720a2) {
                        if (BreakSlot.C9380c.f49730a.m50714a(((BreakSlot) obj).m50690k())) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    arrayList = null;
                }
                boolean m51723d = AbstractC9465b.m51723d(jsonObject, new String[]{"showExploreView"}, false, 2, null);
                JsonElement jsonElement2 = (JsonElement) jsonObject.get("boxes");
                if (jsonElement2 != null && (m51720a = AbstractC9465b.m51720a(jsonElement2, new b(SectionBoxData.C9427b.Companion))) != null) {
                    arrayList3 = new ArrayList();
                    for (Object obj2 : m51720a) {
                        if (((SectionBoxData) obj2).isValid()) {
                            arrayList3.add(obj2);
                        }
                    }
                }
                return new FollowingData(section, arrayList, m51723d, arrayList3);
            }
        }

        @Override // qn0.InterfaceC25386a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FollowingData deserialize(Decoder decoder) {
            InterfaceC27329g interfaceC27329g;
            AbstractC19074t.m100208f(decoder, "decoder");
            if (decoder instanceof InterfaceC27329g) {
                interfaceC27329g = (InterfaceC27329g) decoder;
            } else {
                interfaceC27329g = null;
            }
            if (interfaceC27329g != null) {
                return Companion.m50932a(AbstractC27331i.m139916m(interfaceC27329g.mo139898g()));
            }
            throw new IllegalStateException("Can be deserialized only by JSON".toString());
        }

        @Override // qn0.InterfaceC25393h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(Encoder encoder, FollowingData followingData) {
            AbstractC19074t.m100208f(encoder, "encoder");
            AbstractC19074t.m100208f(followingData, "value");
            throw new IllegalStateException("Serialization is not supported".toString());
        }

        @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
        public SerialDescriptor getDescriptor() {
            return this.f49844a;
        }
    }

    public /* synthetic */ FollowingData(int i11, Section section, List list, boolean z11, List list2, AbstractC26805k1 abstractC26805k1) {
        this.f49840p = (i11 & 1) == 0 ? new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null) : section;
        if ((i11 & 2) == 0) {
            this.f49841q = null;
        } else {
            this.f49841q = list;
        }
        if ((i11 & 4) == 0) {
            this.f49842r = false;
        } else {
            this.f49842r = z11;
        }
        if ((i11 & 8) == 0) {
            this.f49843s = null;
        } else {
            this.f49843s = list2;
        }
    }

    /* renamed from: f */
    public static final /* synthetic */ void m50923f(FollowingData followingData, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f49839t;
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || !AbstractC19074t.m100204b(followingData.f49840p, new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null))) {
            interfaceC21886d.mo114029i(serialDescriptor, 0, kSerializerArr[0], followingData.f49840p);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || followingData.f49841q != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, kSerializerArr[1], followingData.f49841q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || followingData.f49842r) {
            interfaceC21886d.mo114034y(serialDescriptor, 2, followingData.f49842r);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || followingData.f49843s != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, kSerializerArr[3], followingData.f49843s);
        }
    }

    /* renamed from: b */
    public final List m50924b() {
        return this.f49843s;
    }

    /* renamed from: c */
    public final List m50925c() {
        return this.f49841q;
    }

    /* renamed from: d */
    public final Section m50926d() {
        return this.f49840p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean m50927e() {
        return this.f49842r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowingData)) {
            return false;
        }
        FollowingData followingData = (FollowingData) obj;
        return AbstractC19074t.m100204b(this.f49840p, followingData.f49840p) && AbstractC19074t.m100204b(this.f49841q, followingData.f49841q) && this.f49842r == followingData.f49842r && AbstractC19074t.m100204b(this.f49843s, followingData.f49843s);
    }

    public int hashCode() {
        int hashCode = this.f49840p.hashCode() * 31;
        List list = this.f49841q;
        int hashCode2 = (((hashCode + (list == null ? 0 : list.hashCode())) * 31) + AbstractC2144f.m11520a(this.f49842r)) * 31;
        List list2 = this.f49843s;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "FollowingData(section=" + this.f49840p + ", breakSlots=" + this.f49841q + ", showExplore=" + this.f49842r + ", boxes=" + this.f49843s + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeParcelable(this.f49840p, i11);
        List list = this.f49841q;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((BreakSlot) it.next()).writeToParcel(parcel, i11);
            }
        }
        parcel.writeInt(this.f49842r ? 1 : 0);
        List list2 = this.f49843s;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((SectionBoxData) it2.next()).writeToParcel(parcel, i11);
        }
    }

    public FollowingData(Section section, List list, boolean z11, List list2) {
        AbstractC19074t.m100208f(section, "section");
        this.f49840p = section;
        this.f49841q = list;
        this.f49842r = z11;
        this.f49843s = list2;
    }
}
