package com.zing.zalo.shortvideo.data.model;

import com.zing.zalo.shortvideo.data.remote.common.AuthInfo;
import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonObject;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import un0.AbstractC27331i;
import un0.InterfaceC27329g;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class LogResultInfo {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final int f49903a;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return LogResultInfo$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.LogResultInfo$a */
    /* loaded from: classes5.dex */
    public static final class C9406a implements KSerializer {

        /* renamed from: a */
        private final SerialDescriptor f49904a = AuthInfo.Companion.serializer().getDescriptor();

        @Override // qn0.InterfaceC25386a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LogResultInfo deserialize(Decoder decoder) {
            InterfaceC27329g interfaceC27329g;
            AbstractC19074t.m100208f(decoder, "decoder");
            if (decoder instanceof InterfaceC27329g) {
                interfaceC27329g = (InterfaceC27329g) decoder;
            } else {
                interfaceC27329g = null;
            }
            if (interfaceC27329g != null) {
                return m51044b(AbstractC27331i.m139916m(interfaceC27329g.mo139898g()));
            }
            throw new IllegalStateException("Can be deserialized only by JSON".toString());
        }

        /* renamed from: b */
        public final LogResultInfo m51044b(JsonObject jsonObject) {
            AbstractC19074t.m100208f(jsonObject, "json");
            return new LogResultInfo(AbstractC9465b.m51728i(jsonObject, new String[]{"batch"}, 0, 2, null));
        }

        @Override // qn0.InterfaceC25393h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(Encoder encoder, LogResultInfo logResultInfo) {
            AbstractC19074t.m100208f(encoder, "encoder");
            AbstractC19074t.m100208f(logResultInfo, "value");
            throw new IllegalStateException("Serialization is not supported".toString());
        }

        @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
        public SerialDescriptor getDescriptor() {
            return this.f49904a;
        }
    }

    public LogResultInfo(int i11) {
        this.f49903a = i11;
    }

    /* renamed from: a */
    public final int m51042a() {
        return this.f49903a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LogResultInfo) && this.f49903a == ((LogResultInfo) obj).f49903a;
    }

    public int hashCode() {
        return this.f49903a;
    }

    public String toString() {
        return "LogResultInfo(batch=" + this.f49903a + ")";
    }

    public /* synthetic */ LogResultInfo(int i11, int i12, AbstractC26805k1 abstractC26805k1) {
        if (1 != (i11 & 1)) {
            AbstractC26774a1.m137800b(i11, 1, LogResultInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.f49903a = i12;
    }
}
