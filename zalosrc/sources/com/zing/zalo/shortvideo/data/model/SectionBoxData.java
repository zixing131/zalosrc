package com.zing.zalo.shortvideo.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.shortvideo.data.model.LivestreamData;
import com.zing.zalo.shortvideo.data.model.VideoData;
import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.C19071q;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import qm0.AbstractC25332a0;
import qm0.AbstractC25370t;
import qn0.C25388c;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26788f;
import un0.AbstractC27331i;
import un0.InterfaceC27329g;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class SectionBoxData implements Parcelable {

    /* renamed from: p */
    private final String f49972p;

    /* renamed from: q */
    private final int f49973q;

    /* renamed from: r */
    private final List f49974r;

    /* renamed from: s */
    private final List f49975s;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SectionBoxData> CREATOR = new C9426a();

    /* renamed from: t */
    private static final KSerializer[] f49971t = {null, null, new C26788f(C26783d0.f126989a), new C26788f(new C25388c(AbstractC19061k0.m100169b(Parcelable.class), new Annotation[0]))};

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return SectionBoxData$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.SectionBoxData$a */
    /* loaded from: classes5.dex */
    public static final class C9426a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SectionBoxData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            AbstractC19074t.m100208f(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                for (int i11 = 0; i11 != readInt2; i11++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                for (int i12 = 0; i12 != readInt3; i12++) {
                    arrayList2.add(parcel.readParcelable(SectionBoxData.class.getClassLoader()));
                }
            }
            return new SectionBoxData(readString, readInt, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SectionBoxData[] newArray(int i11) {
            return new SectionBoxData[i11];
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.SectionBoxData$b */
    /* loaded from: classes5.dex */
    public static final class C9427b implements KSerializer {
        public static final a Companion = new a(null);

        /* renamed from: com.zing.zalo.shortvideo.data.model.SectionBoxData$b$a */
        /* loaded from: classes5.dex */
        public static final class a {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.data.model.SectionBoxData$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public /* synthetic */ class C32722a extends C19071q implements InterfaceC18505l {
                C32722a(Object obj) {
                    super(1, obj, VideoData.C9437b.a.class, "deserialize", "deserialize(Lkotlinx/serialization/json/JsonObject;)Lcom/zing/zalo/shortvideo/data/model/VideoData;", 0);
                }

                @Override // en0.InterfaceC18505l
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public final VideoData mo205i9(JsonObject jsonObject) {
                    AbstractC19074t.m100208f(jsonObject, "p0");
                    return ((VideoData.C9437b.a) this.f94922q).m51386a(jsonObject);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.data.model.SectionBoxData$b$a$b */
            /* loaded from: classes5.dex */
            public /* synthetic */ class b extends C19071q implements InterfaceC18505l {
                b(Object obj) {
                    super(1, obj, LivestreamData.C9405b.a.class, "deserialize", "deserialize(Lkotlinx/serialization/json/JsonObject;)Lcom/zing/zalo/shortvideo/data/model/LivestreamData;", 0);
                }

                @Override // en0.InterfaceC18505l
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public final LivestreamData mo205i9(JsonObject jsonObject) {
                    AbstractC19074t.m100208f(jsonObject, "p0");
                    return ((LivestreamData.C9405b.a) this.f94922q).m51040a(jsonObject);
                }
            }

            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final SectionBoxData m51192a(JsonObject jsonObject) {
                ArrayList m51720a;
                int m131511r;
                ArrayList arrayList;
                List list;
                JsonArray m51731l;
                AbstractC19074t.m100208f(jsonObject, "json");
                List list2 = null;
                int m51728i = AbstractC9465b.m51728i(jsonObject, new String[]{"objectType"}, 0, 2, null);
                if (m51728i != 3) {
                    if (m51728i == 70 && (m51731l = AbstractC9465b.m51731l(jsonObject, "items")) != null) {
                        arrayList = AbstractC9465b.m51720a(m51731l, new b(LivestreamData.C9405b.Companion));
                    }
                    arrayList = null;
                } else {
                    JsonArray m51731l2 = AbstractC9465b.m51731l(jsonObject, "items");
                    if (m51731l2 != null && (m51720a = AbstractC9465b.m51720a(m51731l2, new C32722a(VideoData.C9437b.Companion))) != null) {
                        m131511r = AbstractC25370t.m131511r(m51720a, 10);
                        ArrayList arrayList2 = new ArrayList(m131511r);
                        Iterator it = m51720a.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new Video((VideoData) it.next()));
                        }
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((Video) it2.next()).m52878Y0(1);
                        }
                        arrayList = arrayList2;
                    }
                    arrayList = null;
                }
                String m51740u = AbstractC9465b.m51740u(jsonObject, "boxId");
                if (arrayList != null) {
                    list = AbstractC25332a0.m131187O0(arrayList);
                } else {
                    list = null;
                }
                JsonArray m51731l3 = AbstractC9465b.m51731l(jsonObject, "positions");
                if (m51731l3 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<JsonElement> it3 = m51731l3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(Integer.valueOf(AbstractC9465b.m51726g(it3.next())));
                    }
                    list2 = AbstractC25332a0.m131187O0(arrayList3);
                }
                return new SectionBoxData(m51740u, m51728i, list2, list);
            }
        }

        @Override // qn0.InterfaceC25386a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SectionBoxData deserialize(Decoder decoder) {
            InterfaceC27329g interfaceC27329g;
            AbstractC19074t.m100208f(decoder, "decoder");
            if (decoder instanceof InterfaceC27329g) {
                interfaceC27329g = (InterfaceC27329g) decoder;
            } else {
                interfaceC27329g = null;
            }
            if (interfaceC27329g != null) {
                return Companion.m51192a(AbstractC27331i.m139916m(interfaceC27329g.mo139898g()));
            }
            throw new IllegalStateException("Can be deserialized only by JSON".toString());
        }

        @Override // qn0.InterfaceC25393h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(Encoder encoder, SectionBoxData sectionBoxData) {
            AbstractC19074t.m100208f(encoder, "encoder");
            AbstractC19074t.m100208f(sectionBoxData, "value");
            throw new IllegalStateException("Serialization is not supported".toString());
        }

        @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
        public SerialDescriptor getDescriptor() {
            return SectionBoxData.Companion.serializer().getDescriptor();
        }
    }

    public /* synthetic */ SectionBoxData(int i11, String str, int i12, List list, List list2, AbstractC26805k1 abstractC26805k1) {
        if (3 != (i11 & 3)) {
            AbstractC26774a1.m137800b(i11, 3, SectionBoxData$$serializer.INSTANCE.getDescriptor());
        }
        this.f49972p = str;
        this.f49973q = i12;
        if ((i11 & 4) == 0) {
            this.f49974r = null;
        } else {
            this.f49974r = list;
        }
        if ((i11 & 8) == 0) {
            this.f49975s = null;
        } else {
            this.f49975s = list2;
        }
    }

    /* renamed from: e */
    public static final /* synthetic */ void m51184e(SectionBoxData sectionBoxData, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f49971t;
        interfaceC21886d.mo114035z(serialDescriptor, 0, sectionBoxData.f49972p);
        interfaceC21886d.mo114033x(serialDescriptor, 1, sectionBoxData.f49973q);
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || sectionBoxData.f49974r != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, kSerializerArr[2], sectionBoxData.f49974r);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || sectionBoxData.f49975s != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, kSerializerArr[3], sectionBoxData.f49975s);
        }
    }

    /* renamed from: b */
    public final List m51185b() {
        return this.f49975s;
    }

    /* renamed from: c */
    public final int m51186c() {
        return this.f49973q;
    }

    /* renamed from: d */
    public final List m51187d() {
        return this.f49974r;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionBoxData)) {
            return false;
        }
        SectionBoxData sectionBoxData = (SectionBoxData) obj;
        return AbstractC19074t.m100204b(this.f49972p, sectionBoxData.f49972p) && this.f49973q == sectionBoxData.f49973q && AbstractC19074t.m100204b(this.f49974r, sectionBoxData.f49974r) && AbstractC19074t.m100204b(this.f49975s, sectionBoxData.f49975s);
    }

    public int hashCode() {
        int hashCode = ((this.f49972p.hashCode() * 31) + this.f49973q) * 31;
        List list = this.f49974r;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f49975s;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final boolean isValid() {
        int i11 = this.f49973q;
        return i11 == 3 || i11 == 70;
    }

    public String toString() {
        return "SectionBoxData(boxId=" + this.f49972p + ", objectType=" + this.f49973q + ", position=" + this.f49974r + ", items=" + this.f49975s + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f49972p);
        parcel.writeInt(this.f49973q);
        List list = this.f49974r;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeInt(((Number) it.next()).intValue());
            }
        }
        List list2 = this.f49975s;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable((Parcelable) it2.next(), i11);
        }
    }

    public SectionBoxData(String str, int i11, List list, List list2) {
        AbstractC19074t.m100208f(str, "boxId");
        this.f49972p = str;
        this.f49973q = i11;
        this.f49974r = list;
        this.f49975s = list2;
    }
}
