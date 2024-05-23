package vn0;

import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.JsonException;
import qm0.AbstractC25332a0;
import qm0.AbstractC25363p0;
import sn0.AbstractC26342i;
import un0.AbstractC27323a;
import un0.AbstractC27345w;
import un0.InterfaceC27339q;
import un0.InterfaceC27340r;
import vn0.C28354y;

/* renamed from: vn0.c0 */
/* loaded from: classes7.dex */
public abstract class AbstractC28311c0 {

    /* renamed from: a */
    private static final C28354y.a f132025a = new C28354y.a();

    /* renamed from: b */
    private static final C28354y.a f132026b = new C28354y.a();

    /* renamed from: vn0.c0$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ SerialDescriptor f132027q;

        /* renamed from: r */
        final /* synthetic */ AbstractC27323a f132028r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(SerialDescriptor serialDescriptor, AbstractC27323a abstractC27323a) {
            super(0);
            this.f132027q = serialDescriptor;
            this.f132028r = abstractC27323a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Map mo12V4() {
            return AbstractC28311c0.m142665b(this.f132027q, this.f132028r);
        }
    }

    /* renamed from: b */
    public static final Map m142665b(SerialDescriptor serialDescriptor, AbstractC27323a abstractC27323a) {
        Map m131404i;
        Object m131174B0;
        String[] names;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m142674k(serialDescriptor, abstractC27323a);
        int mo113949e = serialDescriptor.mo113949e();
        for (int i11 = 0; i11 < mo113949e; i11++) {
            List mo113951g = serialDescriptor.mo113951g(i11);
            ArrayList arrayList = new ArrayList();
            for (Object obj : mo113951g) {
                if (obj instanceof InterfaceC27339q) {
                    arrayList.add(obj);
                }
            }
            m131174B0 = AbstractC25332a0.m131174B0(arrayList);
            InterfaceC27339q interfaceC27339q = (InterfaceC27339q) m131174B0;
            if (interfaceC27339q != null && (names = interfaceC27339q.names()) != null) {
                for (String str : names) {
                    m142666c(linkedHashMap, serialDescriptor, str, i11);
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            m131404i = AbstractC25363p0.m131404i();
            return m131404i;
        }
        return linkedHashMap;
    }

    /* renamed from: c */
    private static final void m142666c(Map map, SerialDescriptor serialDescriptor, String str, int i11) {
        Object m131405j;
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i11));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("The suggested name '");
        sb2.append(str);
        sb2.append("' for property ");
        sb2.append(serialDescriptor.mo113950f(i11));
        sb2.append(" is already one of the names for property ");
        m131405j = AbstractC25363p0.m131405j(map, str);
        sb2.append(serialDescriptor.mo113950f(((Number) m131405j).intValue()));
        sb2.append(" in ");
        sb2.append(serialDescriptor);
        throw new JsonException(sb2.toString());
    }

    /* renamed from: d */
    public static final Map m142667d(AbstractC27323a abstractC27323a, SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(abstractC27323a, "<this>");
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return (Map) AbstractC27345w.m139954a(abstractC27323a).m142799b(serialDescriptor, f132025a, new a(serialDescriptor, abstractC27323a));
    }

    /* renamed from: e */
    public static final C28354y.a m142668e() {
        return f132025a;
    }

    /* renamed from: f */
    public static final String m142669f(SerialDescriptor serialDescriptor, AbstractC27323a abstractC27323a, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "<this>");
        AbstractC19074t.m100208f(abstractC27323a, "json");
        m142674k(serialDescriptor, abstractC27323a);
        return serialDescriptor.mo113950f(i11);
    }

    /* renamed from: g */
    public static final int m142670g(SerialDescriptor serialDescriptor, AbstractC27323a abstractC27323a, String str) {
        AbstractC19074t.m100208f(serialDescriptor, "<this>");
        AbstractC19074t.m100208f(abstractC27323a, "json");
        AbstractC19074t.m100208f(str, "name");
        m142674k(serialDescriptor, abstractC27323a);
        int mo113947c = serialDescriptor.mo113947c(str);
        if (mo113947c != -3) {
            return mo113947c;
        }
        if (!abstractC27323a.m139869f().m139894k()) {
            return mo113947c;
        }
        return m142671h(abstractC27323a, serialDescriptor, str);
    }

    /* renamed from: h */
    private static final int m142671h(AbstractC27323a abstractC27323a, SerialDescriptor serialDescriptor, String str) {
        Integer num = (Integer) m142667d(abstractC27323a, serialDescriptor).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* renamed from: i */
    public static final int m142672i(SerialDescriptor serialDescriptor, AbstractC27323a abstractC27323a, String str, String str2) {
        AbstractC19074t.m100208f(serialDescriptor, "<this>");
        AbstractC19074t.m100208f(abstractC27323a, "json");
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(str2, "suffix");
        int m142670g = m142670g(serialDescriptor, abstractC27323a, str);
        if (m142670g != -3) {
            return m142670g;
        }
        throw new SerializationException(serialDescriptor.mo113953i() + " does not contain element with name '" + str + '\'' + str2);
    }

    /* renamed from: j */
    public static /* synthetic */ int m142673j(SerialDescriptor serialDescriptor, AbstractC27323a abstractC27323a, String str, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        return m142672i(serialDescriptor, abstractC27323a, str, str2);
    }

    /* renamed from: k */
    public static final InterfaceC27340r m142674k(SerialDescriptor serialDescriptor, AbstractC27323a abstractC27323a) {
        AbstractC19074t.m100208f(serialDescriptor, "<this>");
        AbstractC19074t.m100208f(abstractC27323a, "json");
        if (AbstractC19074t.m100204b(serialDescriptor.mo113948d(), AbstractC26342i.a.f125056a)) {
            abstractC27323a.m139869f().m139891h();
            return null;
        }
        return null;
    }
}
