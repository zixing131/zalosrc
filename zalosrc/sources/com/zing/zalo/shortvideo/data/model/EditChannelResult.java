package com.zing.zalo.shortvideo.data.model;

import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonObject;
import qn0.InterfaceC25392g;
import sn0.AbstractC26340g;
import un0.AbstractC27331i;
import un0.InterfaceC27329g;

@InterfaceC25392g(with = C9395a.class)
/* loaded from: classes5.dex */
public final class EditChannelResult {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f49837a;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return new C9395a();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.EditChannelResult$a */
    /* loaded from: classes5.dex */
    public static final class C9395a implements KSerializer {

        /* renamed from: a */
        private final SerialDescriptor f49838a;

        public C9395a() {
            String name = EditChannelResult.class.getName();
            AbstractC19074t.m100207e(name, "getName(...)");
            this.f49838a = AbstractC26340g.m135541c(name, new SerialDescriptor[0], null, 4, null);
        }

        @Override // qn0.InterfaceC25386a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public EditChannelResult deserialize(Decoder decoder) {
            InterfaceC27329g interfaceC27329g;
            AbstractC19074t.m100208f(decoder, "decoder");
            if (decoder instanceof InterfaceC27329g) {
                interfaceC27329g = (InterfaceC27329g) decoder;
            } else {
                interfaceC27329g = null;
            }
            if (interfaceC27329g != null) {
                return m50920b(AbstractC27331i.m139916m(interfaceC27329g.mo139898g()));
            }
            throw new IllegalStateException("Can be deserialized only by JSON".toString());
        }

        /* renamed from: b */
        public final EditChannelResult m50920b(JsonObject jsonObject) {
            AbstractC19074t.m100208f(jsonObject, "json");
            return new EditChannelResult(AbstractC9465b.m51742w(jsonObject, new String[]{"msg"}, null, 2, null));
        }

        @Override // qn0.InterfaceC25393h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(Encoder encoder, EditChannelResult editChannelResult) {
            AbstractC19074t.m100208f(encoder, "encoder");
            AbstractC19074t.m100208f(editChannelResult, "value");
            throw new IllegalStateException("Serialization is not supported".toString());
        }

        @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
        public SerialDescriptor getDescriptor() {
            return this.f49838a;
        }
    }

    public EditChannelResult(String str) {
        AbstractC19074t.m100208f(str, "msg");
        this.f49837a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EditChannelResult) && AbstractC19074t.m100204b(this.f49837a, ((EditChannelResult) obj).f49837a);
    }

    public int hashCode() {
        return this.f49837a.hashCode();
    }

    public String toString() {
        return "EditChannelResult(msg=" + this.f49837a + ")";
    }
}
