package vn0;

import fn0.AbstractC19074t;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import qm0.AbstractC25332a0;
import qm0.AbstractC25363p0;
import un0.AbstractC27323a;
import un0.AbstractC27331i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: vn0.m0 */
/* loaded from: classes7.dex */
public final class C28331m0 extends C28323i0 {

    /* renamed from: k */
    private final JsonObject f132067k;

    /* renamed from: l */
    private final List f132068l;

    /* renamed from: m */
    private final int f132069m;

    /* renamed from: n */
    private int f132070n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28331m0(AbstractC27323a abstractC27323a, JsonObject jsonObject) {
        super(abstractC27323a, jsonObject, null, null, 12, null);
        List m131185M0;
        AbstractC19074t.m100208f(abstractC27323a, "json");
        AbstractC19074t.m100208f(jsonObject, "value");
        this.f132067k = jsonObject;
        m131185M0 = AbstractC25332a0.m131185M0(mo142663s0().keySet());
        this.f132068l = m131185M0;
        this.f132069m = m131185M0.size() * 2;
        this.f132070n = -1;
    }

    @Override // vn0.C28323i0, tn0.AbstractC26822q0
    /* renamed from: a0 */
    protected String mo137937a0(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return (String) this.f132068l.get(i11 / 2);
    }

    @Override // vn0.C28323i0, vn0.AbstractC28310c, kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: c */
    public void mo114009c(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
    }

    @Override // vn0.C28323i0, vn0.AbstractC28310c
    /* renamed from: e0 */
    protected JsonElement mo142650e0(String str) {
        Object m131405j;
        AbstractC19074t.m100208f(str, "tag");
        if (this.f132070n % 2 != 0) {
            m131405j = AbstractC25363p0.m131405j(mo142663s0(), str);
            return (JsonElement) m131405j;
        }
        return AbstractC27331i.m139906c(str);
    }

    @Override // vn0.C28323i0, kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: p */
    public int mo114037p(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        int i11 = this.f132070n;
        if (i11 >= this.f132069m - 1) {
            return -1;
        }
        int i12 = i11 + 1;
        this.f132070n = i12;
        return i12;
    }

    @Override // vn0.C28323i0, vn0.AbstractC28310c
    /* renamed from: w0 */
    public JsonObject mo142663s0() {
        return this.f132067k;
    }
}
