package vn0;

import fn0.AbstractC19074t;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import un0.AbstractC27323a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: vn0.k0 */
/* loaded from: classes7.dex */
public final class C28327k0 extends AbstractC28310c {

    /* renamed from: f */
    private final JsonArray f132058f;

    /* renamed from: g */
    private final int f132059g;

    /* renamed from: h */
    private int f132060h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28327k0(AbstractC27323a abstractC27323a, JsonArray jsonArray) {
        super(abstractC27323a, jsonArray, null);
        AbstractC19074t.m100208f(abstractC27323a, "json");
        AbstractC19074t.m100208f(jsonArray, "value");
        this.f132058f = jsonArray;
        this.f132059g = mo142663s0().size();
        this.f132060h = -1;
    }

    @Override // tn0.AbstractC26822q0
    /* renamed from: a0 */
    protected String mo137937a0(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return String.valueOf(i11);
    }

    @Override // vn0.AbstractC28310c
    /* renamed from: e0 */
    protected JsonElement mo142650e0(String str) {
        AbstractC19074t.m100208f(str, "tag");
        return mo142663s0().get(Integer.parseInt(str));
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: p */
    public int mo114037p(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        int i11 = this.f132060h;
        if (i11 >= this.f132059g - 1) {
            return -1;
        }
        int i12 = i11 + 1;
        this.f132060h = i12;
        return i12;
    }

    @Override // vn0.AbstractC28310c
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public JsonArray mo142663s0() {
        return this.f132058f;
    }
}
