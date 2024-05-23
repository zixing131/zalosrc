package vn0;

import fn0.AbstractC19074t;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import un0.AbstractC27323a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: vn0.e0 */
/* loaded from: classes7.dex */
public final class C28315e0 extends AbstractC28310c {

    /* renamed from: f */
    private final JsonElement f132044f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28315e0(AbstractC27323a abstractC27323a, JsonElement jsonElement) {
        super(abstractC27323a, jsonElement, null);
        AbstractC19074t.m100208f(abstractC27323a, "json");
        AbstractC19074t.m100208f(jsonElement, "value");
        this.f132044f = jsonElement;
        m137908X("primitive");
    }

    @Override // vn0.AbstractC28310c
    /* renamed from: e0 */
    protected JsonElement mo142650e0(String str) {
        AbstractC19074t.m100208f(str, "tag");
        if (str == "primitive") {
            return mo142663s0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag".toString());
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: p */
    public int mo114037p(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return 0;
    }

    @Override // vn0.AbstractC28310c
    /* renamed from: s0 */
    public JsonElement mo142663s0() {
        return this.f132044f;
    }
}
