package com.zing.zalo.shortvideo.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.shortvideo.data.model.BreakSlot;
import com.zing.zalo.shortvideo.data.model.SectionBoxData;
import com.zing.zalo.shortvideo.data.model.VideoData;
import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import com.zing.zalo.shortvideo.p072ui.model.Video;
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
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import qm0.AbstractC25370t;
import qn0.InterfaceC25392g;
import sn0.AbstractC26340g;
import un0.AbstractC27331i;
import un0.InterfaceC27329g;

@InterfaceC25392g(with = C9402b.class)
/* loaded from: classes5.dex */
public final class FriendData implements Parcelable {

    /* renamed from: p */
    private Section f49854p;

    /* renamed from: q */
    private List f49855q;

    /* renamed from: r */
    private List f49856r;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<FriendData> CREATOR = new C9401a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return new C9402b();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.FriendData$a */
    /* loaded from: classes5.dex */
    public static final class C9401a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FriendData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            AbstractC19074t.m100208f(parcel, "parcel");
            Section section = (Section) parcel.readParcelable(FriendData.class.getClassLoader());
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
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                for (int i12 = 0; i12 != readInt2; i12++) {
                    arrayList2.add(SectionBoxData.CREATOR.createFromParcel(parcel));
                }
            }
            return new FriendData(section, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FriendData[] newArray(int i11) {
            return new FriendData[i11];
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.FriendData$b */
    /* loaded from: classes5.dex */
    public static final class C9402b implements KSerializer {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final SerialDescriptor f49857a;

        /* renamed from: com.zing.zalo.shortvideo.data.model.FriendData$b$a */
        /* loaded from: classes5.dex */
        public static final class a {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.data.model.FriendData$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public /* synthetic */ class C32721a extends C19071q implements InterfaceC18505l {
                C32721a(Object obj) {
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
            /* renamed from: com.zing.zalo.shortvideo.data.model.FriendData$b$a$b */
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
            /* renamed from: com.zing.zalo.shortvideo.data.model.FriendData$b$a$c */
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
            public final FriendData m50962a(JsonObject jsonObject) {
                int m131511r;
                ArrayList arrayList;
                ArrayList m51720a;
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
                if (jsonElement != null) {
                    arrayList = AbstractC9465b.m51720a(jsonElement, new C32721a(BreakSlot.C9379b.Companion));
                } else {
                    arrayList = null;
                }
                JsonElement jsonElement2 = (JsonElement) jsonObject.get("boxes");
                if (jsonElement2 != null && (m51720a = AbstractC9465b.m51720a(jsonElement2, new b(SectionBoxData.C9427b.Companion))) != null) {
                    arrayList3 = new ArrayList();
                    for (Object obj : m51720a) {
                        if (((SectionBoxData) obj).isValid()) {
                            arrayList3.add(obj);
                        }
                    }
                }
                return new FriendData(section, arrayList, arrayList3);
            }
        }

        public C9402b() {
            String name = FriendData.class.getName();
            AbstractC19074t.m100207e(name, "getName(...)");
            this.f49857a = AbstractC26340g.m135541c(name, new SerialDescriptor[0], null, 4, null);
        }

        @Override // qn0.InterfaceC25386a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FriendData deserialize(Decoder decoder) {
            InterfaceC27329g interfaceC27329g;
            AbstractC19074t.m100208f(decoder, "decoder");
            if (decoder instanceof InterfaceC27329g) {
                interfaceC27329g = (InterfaceC27329g) decoder;
            } else {
                interfaceC27329g = null;
            }
            if (interfaceC27329g != null) {
                return Companion.m50962a(AbstractC27331i.m139916m(interfaceC27329g.mo139898g()));
            }
            throw new IllegalStateException("Can be deserialized only by JSON".toString());
        }

        @Override // qn0.InterfaceC25393h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(Encoder encoder, FriendData friendData) {
            AbstractC19074t.m100208f(encoder, "encoder");
            AbstractC19074t.m100208f(friendData, "value");
            throw new IllegalStateException("Serialization is not supported".toString());
        }

        @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
        public SerialDescriptor getDescriptor() {
            return this.f49857a;
        }
    }

    public FriendData(Section section, List list, List list2) {
        AbstractC19074t.m100208f(section, "section");
        this.f49854p = section;
        this.f49855q = list;
        this.f49856r = list2;
    }

    /* renamed from: a */
    public final List m50955a() {
        return this.f49856r;
    }

    /* renamed from: b */
    public final List m50956b() {
        return this.f49855q;
    }

    /* renamed from: c */
    public final Section m50957c() {
        return this.f49854p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendData)) {
            return false;
        }
        FriendData friendData = (FriendData) obj;
        return AbstractC19074t.m100204b(this.f49854p, friendData.f49854p) && AbstractC19074t.m100204b(this.f49855q, friendData.f49855q) && AbstractC19074t.m100204b(this.f49856r, friendData.f49856r);
    }

    public int hashCode() {
        int hashCode = this.f49854p.hashCode() * 31;
        List list = this.f49855q;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f49856r;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "FriendData(section=" + this.f49854p + ", breakSlots=" + this.f49855q + ", boxes=" + this.f49856r + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeParcelable(this.f49854p, i11);
        List list = this.f49855q;
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
        List list2 = this.f49856r;
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
}
