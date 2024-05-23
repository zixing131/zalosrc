package vn0;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import un0.AbstractC27323a;

/* renamed from: vn0.l0 */
/* loaded from: classes7.dex */
final class C28329l0 extends AbstractC28312d {

    /* renamed from: f */
    private final ArrayList f132064f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28329l0(AbstractC27323a abstractC27323a, InterfaceC18505l interfaceC18505l) {
        super(abstractC27323a, interfaceC18505l, null);
        AbstractC19074t.m100208f(abstractC27323a, "json");
        AbstractC19074t.m100208f(interfaceC18505l, "nodeConsumer");
        this.f132064f = new ArrayList();
    }

    @Override // vn0.AbstractC28312d, tn0.AbstractC26825r0
    /* renamed from: a0 */
    protected String mo137951a0(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return String.valueOf(i11);
    }

    @Override // vn0.AbstractC28312d
    /* renamed from: q0 */
    public JsonElement mo142691q0() {
        return new JsonArray(this.f132064f);
    }

    @Override // vn0.AbstractC28312d
    /* renamed from: u0 */
    public void mo142693u0(String str, JsonElement jsonElement) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(jsonElement, "element");
        this.f132064f.add(Integer.parseInt(str), jsonElement);
    }
}
