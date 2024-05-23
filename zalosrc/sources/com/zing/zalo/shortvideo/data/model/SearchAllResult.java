package com.zing.zalo.shortvideo.data.model;

import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.SearchHashTag;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.model.VideoData;
import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonObject;
import qm0.AbstractC25370t;
import qn0.InterfaceC25392g;
import sn0.AbstractC26340g;
import un0.AbstractC27331i;
import un0.InterfaceC27329g;
import v00.C27417l;

@InterfaceC25392g(with = C9420a.class)
/* loaded from: classes5.dex */
public final class SearchAllResult {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final Section f49954a;

    /* renamed from: b */
    private final Section f49955b;

    /* renamed from: c */
    private final Section f49956c;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return new C9420a();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.SearchAllResult$a */
    /* loaded from: classes5.dex */
    public static final class C9420a implements KSerializer {

        /* renamed from: a */
        private final SerialDescriptor f49957a;

        public C9420a() {
            String name = SearchAllResult.class.getName();
            AbstractC19074t.m100207e(name, "getName(...)");
            this.f49957a = AbstractC26340g.m135541c(name, new SerialDescriptor[0], null, 4, null);
        }

        @Override // qn0.InterfaceC25386a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SearchAllResult deserialize(Decoder decoder) {
            InterfaceC27329g interfaceC27329g;
            int m131511r;
            AbstractC19074t.m100208f(decoder, "decoder");
            if (decoder instanceof InterfaceC27329g) {
                interfaceC27329g = (InterfaceC27329g) decoder;
            } else {
                interfaceC27329g = null;
            }
            if (interfaceC27329g != null) {
                JsonObject m139916m = AbstractC27331i.m139916m(interfaceC27329g.mo139898g());
                JsonObject m51733n = AbstractC9465b.m51733n(m139916m, "channels");
                JsonObject m51733n2 = AbstractC9465b.m51733n(m139916m, "videos");
                JsonObject m51733n3 = AbstractC9465b.m51733n(m139916m, "hashtags");
                C27417l c27417l = C27417l.f129055a;
                Section section = (Section) c27417l.m140384h().m139867d(new Section.C9424a(new Channel.C9382b()), String.valueOf(m51733n));
                Section section2 = (Section) c27417l.m140384h().m139867d(new Section.C9424a(new VideoData.C9437b()), String.valueOf(m51733n2));
                Section section3 = (Section) c27417l.m140384h().m139867d(new Section.C9424a(new SearchHashTag.C9422b()), String.valueOf(m51733n3));
                List m51168m = section2.m51168m();
                m131511r = AbstractC25370t.m131511r(m51168m, 10);
                ArrayList arrayList = new ArrayList(m131511r);
                Iterator it = m51168m.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Video((VideoData) it.next()));
                }
                return new SearchAllResult(section, new Section(arrayList, section2.m51170o(), section2.m51169n()), section3);
            }
            throw new IllegalStateException("Can be deserialized only by JSON".toString());
        }

        @Override // qn0.InterfaceC25393h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(Encoder encoder, SearchAllResult searchAllResult) {
            AbstractC19074t.m100208f(encoder, "encoder");
            AbstractC19074t.m100208f(searchAllResult, "value");
            throw new IllegalStateException("Serialization is not supported".toString());
        }

        @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
        public SerialDescriptor getDescriptor() {
            return this.f49957a;
        }
    }

    public SearchAllResult(Section section, Section section2, Section section3) {
        this.f49954a = section;
        this.f49955b = section2;
        this.f49956c = section3;
    }

    /* renamed from: a */
    public final Section m51137a() {
        return this.f49954a;
    }

    /* renamed from: b */
    public final Section m51138b() {
        return this.f49956c;
    }

    /* renamed from: c */
    public final Section m51139c() {
        return this.f49955b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchAllResult)) {
            return false;
        }
        SearchAllResult searchAllResult = (SearchAllResult) obj;
        return AbstractC19074t.m100204b(this.f49954a, searchAllResult.f49954a) && AbstractC19074t.m100204b(this.f49955b, searchAllResult.f49955b) && AbstractC19074t.m100204b(this.f49956c, searchAllResult.f49956c);
    }

    public int hashCode() {
        Section section = this.f49954a;
        int hashCode = (section == null ? 0 : section.hashCode()) * 31;
        Section section2 = this.f49955b;
        int hashCode2 = (hashCode + (section2 == null ? 0 : section2.hashCode())) * 31;
        Section section3 = this.f49956c;
        return hashCode2 + (section3 != null ? section3.hashCode() : 0);
    }

    public String toString() {
        return "SearchAllResult(channelSection=" + this.f49954a + ", videoSection=" + this.f49955b + ", hashTagSection=" + this.f49956c + ")";
    }
}
