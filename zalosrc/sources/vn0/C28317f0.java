package vn0;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import kotlinx.serialization.json.JsonElement;
import un0.AbstractC27323a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: vn0.f0 */
/* loaded from: classes7.dex */
public final class C28317f0 extends AbstractC28312d {

    /* renamed from: f */
    private JsonElement f132045f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28317f0(AbstractC27323a abstractC27323a, InterfaceC18505l interfaceC18505l) {
        super(abstractC27323a, interfaceC18505l, null);
        AbstractC19074t.m100208f(abstractC27323a, "json");
        AbstractC19074t.m100208f(interfaceC18505l, "nodeConsumer");
        m137933Y("primitive");
    }

    @Override // vn0.AbstractC28312d
    /* renamed from: q0 */
    public JsonElement mo142691q0() {
        JsonElement jsonElement = this.f132045f;
        if (jsonElement != null) {
            return jsonElement;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?".toString());
    }

    @Override // vn0.AbstractC28312d
    /* renamed from: u0 */
    public void mo142693u0(String str, JsonElement jsonElement) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(jsonElement, "element");
        if (str == "primitive") {
            if (this.f132045f == null) {
                this.f132045f = jsonElement;
                m142692r0().mo205i9(jsonElement);
                return;
            }
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?".toString());
        }
        throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag".toString());
    }
}
