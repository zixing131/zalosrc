package vn0;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import qn0.InterfaceC25393h;
import un0.AbstractC27323a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: vn0.j0 */
/* loaded from: classes7.dex */
public class C28325j0 extends AbstractC28312d {

    /* renamed from: f */
    private final Map f132055f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28325j0(AbstractC27323a abstractC27323a, InterfaceC18505l interfaceC18505l) {
        super(abstractC27323a, interfaceC18505l, null);
        AbstractC19074t.m100208f(abstractC27323a, "json");
        AbstractC19074t.m100208f(interfaceC18505l, "nodeConsumer");
        this.f132055f = new LinkedHashMap();
    }

    @Override // tn0.AbstractC26820p1, kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: h */
    public void mo114028h(SerialDescriptor serialDescriptor, int i11, InterfaceC25393h interfaceC25393h, Object obj) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        AbstractC19074t.m100208f(interfaceC25393h, "serializer");
        if (obj != null || this.f132031d.m139889f()) {
            super.mo114028h(serialDescriptor, i11, interfaceC25393h, obj);
        }
    }

    @Override // vn0.AbstractC28312d
    /* renamed from: q0 */
    public JsonElement mo142691q0() {
        return new JsonObject(this.f132055f);
    }

    @Override // vn0.AbstractC28312d
    /* renamed from: u0 */
    public void mo142693u0(String str, JsonElement jsonElement) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(jsonElement, "element");
        this.f132055f.put(str, jsonElement);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v0 */
    public final Map m142722v0() {
        return this.f132055f;
    }
}
