package com.zing.zalo.shortvideo.data.remote.common;

import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import un0.AbstractC27331i;
import un0.InterfaceC27329g;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class UploadResult {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f50199a;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return UploadResult$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.remote.common.UploadResult$a */
    /* loaded from: classes5.dex */
    public static final class C9446a implements KSerializer {

        /* renamed from: a */
        private final SerialDescriptor f50200a = UploadResult.Companion.serializer().getDescriptor();

        @Override // qn0.InterfaceC25386a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public UploadResult deserialize(Decoder decoder) {
            InterfaceC27329g interfaceC27329g;
            AbstractC19074t.m100208f(decoder, "decoder");
            if (decoder instanceof InterfaceC27329g) {
                interfaceC27329g = (InterfaceC27329g) decoder;
            } else {
                interfaceC27329g = null;
            }
            if (interfaceC27329g != null) {
                return new UploadResult(AbstractC9465b.m51740u(AbstractC27331i.m139916m(interfaceC27329g.mo139898g()), "zmcId", "id"));
            }
            throw new IllegalStateException("Can be deserialized only by JSON".toString());
        }

        @Override // qn0.InterfaceC25393h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(Encoder encoder, UploadResult uploadResult) {
            AbstractC19074t.m100208f(encoder, "encoder");
            if (uploadResult != null) {
                encoder.mo113987j(UploadResult.Companion.serializer(), uploadResult);
            }
        }

        @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
        public SerialDescriptor getDescriptor() {
            return this.f50200a;
        }
    }

    public /* synthetic */ UploadResult(int i11, String str, AbstractC26805k1 abstractC26805k1) {
        if (1 != (i11 & 1)) {
            AbstractC26774a1.m137800b(i11, 1, UploadResult$$serializer.INSTANCE.getDescriptor());
        }
        this.f50199a = str;
    }

    /* renamed from: a */
    public final String m51541a() {
        return this.f50199a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UploadResult) && AbstractC19074t.m100204b(this.f50199a, ((UploadResult) obj).f50199a);
    }

    public int hashCode() {
        return this.f50199a.hashCode();
    }

    public String toString() {
        return "UploadResult(zmcId=" + this.f50199a + ")";
    }

    public UploadResult(String str) {
        AbstractC19074t.m100208f(str, "zmcId");
        this.f50199a = str;
    }
}
