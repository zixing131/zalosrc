package tn0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import ln0.AbstractC22543l;
import ln0.C22535d;
import ln0.C22537f;
import qm0.AbstractC25363p0;
import sn0.AbstractC26338e;

/* renamed from: tn0.p0 */
/* loaded from: classes7.dex */
public abstract class AbstractC26819p0 extends AbstractC26772a {

    /* renamed from: a */
    private final KSerializer f127050a;

    /* renamed from: b */
    private final KSerializer f127051b;

    public /* synthetic */ AbstractC26819p0(KSerializer kSerializer, KSerializer kSerializer2, AbstractC19060k abstractC19060k) {
        this(kSerializer, kSerializer2);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public abstract SerialDescriptor getDescriptor();

    /* renamed from: m */
    public final KSerializer m137911m() {
        return this.f127050a;
    }

    /* renamed from: n */
    public final KSerializer m137912n() {
        return this.f127051b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void mo137797g(InterfaceC21885c interfaceC21885c, Map map, int i11, int i12) {
        C22537f m116593p;
        C22535d m116592o;
        AbstractC19074t.m100208f(interfaceC21885c, "decoder");
        AbstractC19074t.m100208f(map, "builder");
        if (i12 >= 0) {
            m116593p = AbstractC22543l.m116593p(0, i12 * 2);
            m116592o = AbstractC22543l.m116592o(m116593p, 2);
            int m116547d = m116592o.m116547d();
            int m116548e = m116592o.m116548e();
            int m116549g = m116592o.m116549g();
            if ((m116549g <= 0 || m116547d > m116548e) && (m116549g >= 0 || m116548e > m116547d)) {
                return;
            }
            while (true) {
                mo114054h(interfaceC21885c, i11 + m116547d, map, false);
                if (m116547d != m116548e) {
                    m116547d += m116549g;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void mo114054h(InterfaceC21885c interfaceC21885c, int i11, Map map, boolean z11) {
        int i12;
        Object m114040c;
        Object m131405j;
        AbstractC19074t.m100208f(interfaceC21885c, "decoder");
        AbstractC19074t.m100208f(map, "builder");
        Object m114040c2 = InterfaceC21885c.a.m114040c(interfaceC21885c, getDescriptor(), i11, this.f127050a, null, 8, null);
        if (z11) {
            i12 = interfaceC21885c.mo114037p(getDescriptor());
            if (i12 != i11 + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i11 + ", returned index for value: " + i12).toString());
            }
        } else {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (map.containsKey(m114040c2) && !(this.f127051b.getDescriptor().mo113948d() instanceof AbstractC26338e)) {
            SerialDescriptor descriptor = getDescriptor();
            KSerializer kSerializer = this.f127051b;
            m131405j = AbstractC25363p0.m131405j(map, m114040c2);
            m114040c = interfaceC21885c.mo114012l(descriptor, i13, kSerializer, m131405j);
        } else {
            m114040c = InterfaceC21885c.a.m114040c(interfaceC21885c, getDescriptor(), i13, this.f127051b, null, 8, null);
        }
        map.put(m114040c2, m114040c);
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, Object obj) {
        AbstractC19074t.m100208f(encoder, "encoder");
        int mo114053e = mo114053e(obj);
        SerialDescriptor descriptor = getDescriptor();
        InterfaceC21886d mo113988k = encoder.mo113988k(descriptor, mo114053e);
        Iterator mo137795d = mo137795d(obj);
        int i11 = 0;
        while (mo137795d.hasNext()) {
            Map.Entry entry = (Map.Entry) mo137795d.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i12 = i11 + 1;
            mo113988k.mo114029i(getDescriptor(), i11, m137911m(), key);
            i11 += 2;
            mo113988k.mo114029i(getDescriptor(), i12, m137912n(), value);
        }
        mo113988k.mo114026c(descriptor);
    }

    private AbstractC26819p0(KSerializer kSerializer, KSerializer kSerializer2) {
        super(null);
        this.f127050a = kSerializer;
        this.f127051b = kSerializer2;
    }
}
