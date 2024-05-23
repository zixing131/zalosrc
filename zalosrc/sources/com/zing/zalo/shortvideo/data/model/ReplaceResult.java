package com.zing.zalo.shortvideo.data.model;

import com.zing.zalo.shortvideo.data.model.VideoData;
import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonObject;
import qn0.InterfaceC25392g;
import sn0.AbstractC26340g;
import un0.AbstractC27331i;
import un0.InterfaceC27329g;

@InterfaceC25392g(with = C9418a.class)
/* loaded from: classes5.dex */
public final class ReplaceResult {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final List f49948a;

    /* renamed from: b */
    private final List f49949b;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return new C9418a();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.ReplaceResult$a */
    /* loaded from: classes5.dex */
    public static final class C9418a implements KSerializer {

        /* renamed from: a */
        private final SerialDescriptor f49950a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.data.model.ReplaceResult$a$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final a f49951q = new a();

            a() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ReplaceEntry mo205i9(JsonObject jsonObject) {
                AbstractC19074t.m100208f(jsonObject, "it");
                return new ReplaceEntry(AbstractC9465b.m51740u(jsonObject, "videoId"), AbstractC9465b.m51743x(jsonObject, "src"));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.data.model.ReplaceResult$a$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final b f49952q = new b();

            b() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final VideoData mo205i9(JsonObject jsonObject) {
                AbstractC19074t.m100208f(jsonObject, "it");
                return VideoData.C9437b.Companion.m51386a(jsonObject);
            }
        }

        public C9418a() {
            String name = ReplaceResult.class.getName();
            AbstractC19074t.m100207e(name, "getName(...)");
            this.f49950a = AbstractC26340g.m135541c(name, new SerialDescriptor[0], null, 4, null);
        }

        @Override // qn0.InterfaceC25386a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ReplaceResult deserialize(Decoder decoder) {
            InterfaceC27329g interfaceC27329g;
            AbstractC19074t.m100208f(decoder, "decoder");
            if (decoder instanceof InterfaceC27329g) {
                interfaceC27329g = (InterfaceC27329g) decoder;
            } else {
                interfaceC27329g = null;
            }
            if (interfaceC27329g != null) {
                JsonObject m139916m = AbstractC27331i.m139916m(interfaceC27329g.mo139898g());
                return new ReplaceResult(AbstractC9465b.m51720a(AbstractC9465b.m51730k(m139916m, "items"), b.f49952q), AbstractC9465b.m51720a(AbstractC9465b.m51730k(m139916m, "replace"), a.f49951q));
            }
            throw new IllegalStateException("Can be deserialized only by JSON".toString());
        }

        @Override // qn0.InterfaceC25393h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(Encoder encoder, ReplaceResult replaceResult) {
            AbstractC19074t.m100208f(encoder, "encoder");
            AbstractC19074t.m100208f(replaceResult, "value");
            throw new IllegalStateException("Serialization is not supported".toString());
        }

        @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
        public SerialDescriptor getDescriptor() {
            return this.f49950a;
        }
    }

    public ReplaceResult(List list, List list2) {
        AbstractC19074t.m100208f(list, "replaceBy");
        AbstractC19074t.m100208f(list2, "candidates");
        this.f49948a = list;
        this.f49949b = list2;
    }

    /* renamed from: a */
    public final List m51127a() {
        return this.f49949b;
    }

    /* renamed from: b */
    public final List m51128b() {
        return this.f49948a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplaceResult)) {
            return false;
        }
        ReplaceResult replaceResult = (ReplaceResult) obj;
        return AbstractC19074t.m100204b(this.f49948a, replaceResult.f49948a) && AbstractC19074t.m100204b(this.f49949b, replaceResult.f49949b);
    }

    public int hashCode() {
        return (this.f49948a.hashCode() * 31) + this.f49949b.hashCode();
    }

    public String toString() {
        return "ReplaceResult(replaceBy=" + this.f49948a + ", candidates=" + this.f49949b + ")";
    }
}
