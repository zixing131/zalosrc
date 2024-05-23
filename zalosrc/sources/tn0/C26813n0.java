package tn0;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gn0.InterfaceC19517a;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pm0.C24848g0;
import sn0.AbstractC26340g;
import sn0.AbstractC26342i;
import sn0.C26334a;

/* renamed from: tn0.n0 */
/* loaded from: classes7.dex */
public final class C26813n0 extends AbstractC26789f0 {

    /* renamed from: c */
    private final SerialDescriptor f127029c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tn0.n0$a */
    /* loaded from: classes7.dex */
    public static final class a implements Map.Entry, InterfaceC19517a {

        /* renamed from: p */
        private final Object f127030p;

        /* renamed from: q */
        private final Object f127031q;

        public a(Object obj, Object obj2) {
            this.f127030p = obj;
            this.f127031q = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f127030p, aVar.f127030p) && AbstractC19074t.m100204b(this.f127031q, aVar.f127031q);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f127030p;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f127031q;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f127030p;
            int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Object obj2 = this.f127031q;
            return hashCode + (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + this.f127030p + ", value=" + this.f127031q + ')';
        }
    }

    /* renamed from: tn0.n0$b */
    /* loaded from: classes7.dex */
    static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ KSerializer f127032q;

        /* renamed from: r */
        final /* synthetic */ KSerializer f127033r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(KSerializer kSerializer, KSerializer kSerializer2) {
            super(1);
            this.f127032q = kSerializer;
            this.f127033r = kSerializer2;
        }

        /* renamed from: a */
        public final void m137887a(C26334a c26334a) {
            AbstractC19074t.m100208f(c26334a, "$this$buildSerialDescriptor");
            C26334a.m135524b(c26334a, "key", this.f127032q.getDescriptor(), null, false, 12, null);
            C26334a.m135524b(c26334a, "value", this.f127033r.getDescriptor(), null, false, 12, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m137887a((C26334a) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26813n0(KSerializer kSerializer, KSerializer kSerializer2) {
        super(kSerializer, kSerializer2, null);
        AbstractC19074t.m100208f(kSerializer, "keySerializer");
        AbstractC19074t.m100208f(kSerializer2, "valueSerializer");
        this.f127029c = AbstractC26340g.m135542d("kotlin.collections.Map.Entry", AbstractC26342i.c.f125058a, new SerialDescriptor[0], new b(kSerializer, kSerializer2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26789f0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object mo137825a(Map.Entry entry) {
        AbstractC19074t.m100208f(entry, "<this>");
        return entry.getKey();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26789f0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object mo137827c(Map.Entry entry) {
        AbstractC19074t.m100208f(entry, "<this>");
        return entry.getValue();
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return this.f127029c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26789f0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Map.Entry mo137829e(Object obj, Object obj2) {
        return new a(obj, obj2);
    }
}
