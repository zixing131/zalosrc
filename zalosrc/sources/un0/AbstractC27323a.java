package un0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.json.JsonElement;
import qn0.InterfaceC25386a;
import qn0.InterfaceC25393h;
import qn0.InterfaceC25396k;
import vn0.AbstractC28319g0;
import vn0.AbstractC28353x0;
import vn0.AbstractC28355y0;
import vn0.C28321h0;
import vn0.C28343s0;
import vn0.C28349v0;
import vn0.C28354y;
import vn0.EnumC28357z0;
import wn0.AbstractC29112b;
import wn0.AbstractC29113c;

/* renamed from: un0.a */
/* loaded from: classes7.dex */
public abstract class AbstractC27323a implements InterfaceC25396k {

    /* renamed from: d */
    public static final a f128573d = new a(null);

    /* renamed from: a */
    private final C27328f f128574a;

    /* renamed from: b */
    private final AbstractC29112b f128575b;

    /* renamed from: c */
    private final C28354y f128576c;

    /* renamed from: un0.a$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC27323a {
        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        private a() {
            super(new C27328f(false, false, false, false, false, false, null, false, false, null, false, false, null, 8191, null), AbstractC29113c.m145365a(), null);
        }
    }

    public /* synthetic */ AbstractC27323a(C27328f c27328f, AbstractC29112b abstractC29112b, AbstractC19060k abstractC19060k) {
        this(c27328f, abstractC29112b);
    }

    @Override // qn0.InterfaceC25391f
    /* renamed from: a */
    public AbstractC29112b mo131586a() {
        return this.f128575b;
    }

    @Override // qn0.InterfaceC25396k
    /* renamed from: b */
    public final String mo131597b(InterfaceC25393h interfaceC25393h, Object obj) {
        AbstractC19074t.m100208f(interfaceC25393h, "serializer");
        C28321h0 c28321h0 = new C28321h0();
        try {
            AbstractC28319g0.m142706a(this, c28321h0, interfaceC25393h, obj);
            return c28321h0.toString();
        } finally {
            c28321h0.m142715h();
        }
    }

    /* renamed from: c */
    public final Object m139866c(InterfaceC25386a interfaceC25386a, JsonElement jsonElement) {
        AbstractC19074t.m100208f(interfaceC25386a, "deserializer");
        AbstractC19074t.m100208f(jsonElement, "element");
        return AbstractC28353x0.m142796a(this, jsonElement, interfaceC25386a);
    }

    /* renamed from: d */
    public final Object m139867d(InterfaceC25386a interfaceC25386a, String str) {
        AbstractC19074t.m100208f(interfaceC25386a, "deserializer");
        AbstractC19074t.m100208f(str, "string");
        C28349v0 c28349v0 = new C28349v0(str);
        Object mo113972k = new C28343s0(this, EnumC28357z0.OBJ, c28349v0, interfaceC25386a.getDescriptor(), null).mo113972k(interfaceC25386a);
        c28349v0.m142623w();
        return mo113972k;
    }

    /* renamed from: e */
    public final JsonElement m139868e(InterfaceC25393h interfaceC25393h, Object obj) {
        AbstractC19074t.m100208f(interfaceC25393h, "serializer");
        return AbstractC28355y0.m142803c(this, obj, interfaceC25393h);
    }

    /* renamed from: f */
    public final C27328f m139869f() {
        return this.f128574a;
    }

    /* renamed from: g */
    public final C28354y m139870g() {
        return this.f128576c;
    }

    /* renamed from: h */
    public final JsonElement m139871h(String str) {
        AbstractC19074t.m100208f(str, "string");
        return (JsonElement) m139867d(C27332j.f128609a, str);
    }

    private AbstractC27323a(C27328f c27328f, AbstractC29112b abstractC29112b) {
        this.f128574a = c27328f;
        this.f128575b = abstractC29112b;
        this.f128576c = new C28354y();
    }
}
