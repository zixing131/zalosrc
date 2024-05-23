package vn0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import qm0.AbstractC25363p0;
import qm0.AbstractC25379x0;
import qm0.AbstractC25381y0;
import sn0.AbstractC26337d;
import sn0.AbstractC26341h;
import tn0.AbstractC26786e0;
import un0.AbstractC27323a;
import un0.AbstractC27331i;
import un0.AbstractC27345w;

/* renamed from: vn0.i0 */
/* loaded from: classes7.dex */
public class C28323i0 extends AbstractC28310c {

    /* renamed from: f */
    private final JsonObject f132049f;

    /* renamed from: g */
    private final String f132050g;

    /* renamed from: h */
    private final SerialDescriptor f132051h;

    /* renamed from: i */
    private int f132052i;

    /* renamed from: j */
    private boolean f132053j;

    public /* synthetic */ C28323i0(AbstractC27323a abstractC27323a, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor, int i11, AbstractC19060k abstractC19060k) {
        this(abstractC27323a, jsonObject, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : serialDescriptor);
    }

    /* renamed from: u0 */
    private final boolean m142717u0(SerialDescriptor serialDescriptor, int i11) {
        boolean z11;
        if (!mo139897d().m139869f().m139889f() && !serialDescriptor.mo113956l(i11) && serialDescriptor.mo113952h(i11).mo113946b()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f132053j = z11;
        return z11;
    }

    /* renamed from: v0 */
    private final boolean m142718v0(SerialDescriptor serialDescriptor, int i11, String str) {
        JsonPrimitive jsonPrimitive;
        AbstractC27323a mo139897d = mo139897d();
        SerialDescriptor mo113952h = serialDescriptor.mo113952h(i11);
        if (!mo113952h.mo113946b() && (mo142650e0(str) instanceof JsonNull)) {
            return true;
        }
        if (AbstractC19074t.m100204b(mo113952h.mo113948d(), AbstractC26341h.b.f125055a) && (!mo113952h.mo113946b() || !(mo142650e0(str) instanceof JsonNull))) {
            JsonElement mo142650e0 = mo142650e0(str);
            String str2 = null;
            if (mo142650e0 instanceof JsonPrimitive) {
                jsonPrimitive = (JsonPrimitive) mo142650e0;
            } else {
                jsonPrimitive = null;
            }
            if (jsonPrimitive != null) {
                str2 = AbstractC27331i.m139910g(jsonPrimitive);
            }
            if (str2 != null && AbstractC28311c0.m142670g(mo113952h, mo139897d, str2) == -3) {
                return true;
            }
        }
        return false;
    }

    @Override // vn0.AbstractC28310c, tn0.AbstractC26817o1, kotlinx.serialization.encoding.Decoder
    /* renamed from: E */
    public boolean mo113966E() {
        if (!this.f132053j && super.mo113966E()) {
            return true;
        }
        return false;
    }

    @Override // tn0.AbstractC26822q0
    /* renamed from: a0 */
    protected String mo137937a0(SerialDescriptor serialDescriptor, int i11) {
        Object obj;
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        AbstractC28311c0.m142674k(serialDescriptor, mo139897d());
        String mo113950f = serialDescriptor.mo113950f(i11);
        if (!this.f132024e.m139894k()) {
            return mo113950f;
        }
        if (mo142663s0().keySet().contains(mo113950f)) {
            return mo113950f;
        }
        Map m142667d = AbstractC28311c0.m142667d(mo139897d(), serialDescriptor);
        Iterator<T> it = mo142663s0().keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Integer num = (Integer) m142667d.get((String) obj);
                if (num != null && num.intValue() == i11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        String str = (String) obj;
        if (str != null) {
            return str;
        }
        return mo113950f;
    }

    @Override // vn0.AbstractC28310c, kotlinx.serialization.encoding.Decoder
    /* renamed from: b */
    public InterfaceC21885c mo113968b(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        if (serialDescriptor == this.f132051h) {
            return this;
        }
        return super.mo113968b(serialDescriptor);
    }

    @Override // vn0.AbstractC28310c, kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: c */
    public void mo114009c(SerialDescriptor serialDescriptor) {
        Set set;
        Set m131565k;
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        if (!this.f132024e.m139890g() && !(serialDescriptor.mo113948d() instanceof AbstractC26337d)) {
            AbstractC28311c0.m142674k(serialDescriptor, mo139897d());
            if (!this.f132024e.m139894k()) {
                m131565k = AbstractC26786e0.m137817a(serialDescriptor);
            } else {
                Set m137817a = AbstractC26786e0.m137817a(serialDescriptor);
                Map map = (Map) AbstractC27345w.m139954a(mo139897d()).m142798a(serialDescriptor, AbstractC28311c0.m142668e());
                if (map != null) {
                    set = map.keySet();
                } else {
                    set = null;
                }
                if (set == null) {
                    set = AbstractC25379x0.m131551e();
                }
                m131565k = AbstractC25381y0.m131565k(m137817a, set);
            }
            for (String str : mo142663s0().keySet()) {
                if (!m131565k.contains(str) && !AbstractC19074t.m100204b(str, this.f132050g)) {
                    throw AbstractC28309b0.m142642g(str, mo142663s0().toString());
                }
            }
        }
    }

    @Override // vn0.AbstractC28310c
    /* renamed from: e0 */
    protected JsonElement mo142650e0(String str) {
        Object m131405j;
        AbstractC19074t.m100208f(str, "tag");
        m131405j = AbstractC25363p0.m131405j(mo142663s0(), str);
        return (JsonElement) m131405j;
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: p */
    public int mo114037p(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        while (this.f132052i < serialDescriptor.mo113949e()) {
            int i11 = this.f132052i;
            this.f132052i = i11 + 1;
            String mo137906V = mo137906V(serialDescriptor, i11);
            int i12 = this.f132052i - 1;
            this.f132053j = false;
            if (mo142663s0().containsKey(mo137906V) || m142717u0(serialDescriptor, i12)) {
                if (!this.f132024e.m139887d() || !m142718v0(serialDescriptor, i12, mo137906V)) {
                    return i12;
                }
            }
        }
        return -1;
    }

    @Override // vn0.AbstractC28310c
    /* renamed from: w0 */
    public JsonObject mo142663s0() {
        return this.f132049f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28323i0(AbstractC27323a abstractC27323a, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor) {
        super(abstractC27323a, jsonObject, null);
        AbstractC19074t.m100208f(abstractC27323a, "json");
        AbstractC19074t.m100208f(jsonObject, "value");
        this.f132049f = jsonObject;
        this.f132050g = str;
        this.f132051h = serialDescriptor;
    }
}
