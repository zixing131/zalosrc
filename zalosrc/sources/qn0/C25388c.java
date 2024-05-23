package qn0;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mn0.InterfaceC23364b;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.EnumC24858o;
import pm0.InterfaceC24854k;
import qm0.AbstractC25356m;
import qm0.AbstractC25368s;
import rn0.AbstractC25935a;
import sn0.AbstractC26335b;
import sn0.AbstractC26337d;
import sn0.AbstractC26340g;
import sn0.AbstractC26341h;
import sn0.C26334a;
import tn0.AbstractC26776b;

/* renamed from: qn0.c */
/* loaded from: classes7.dex */
public final class C25388c extends AbstractC26776b {

    /* renamed from: a */
    private final InterfaceC23364b f121570a;

    /* renamed from: b */
    private List f121571b;

    /* renamed from: c */
    private final InterfaceC24854k f121572c;

    /* renamed from: qn0.c$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: qn0.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public static final class C32952a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C25388c f121574q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32952a(C25388c c25388c) {
                super(1);
                this.f121574q = c25388c;
            }

            /* renamed from: a */
            public final void m131576a(C26334a c26334a) {
                AbstractC19074t.m100208f(c26334a, "$this$buildSerialDescriptor");
                C26334a.m135524b(c26334a, ZinstantMetaConstant.IMPRESSION_META_TYPE, AbstractC25935a.m133603D(C19067n0.f94947a).getDescriptor(), null, false, 12, null);
                C26334a.m135524b(c26334a, "value", AbstractC26340g.m135543e("kotlinx.serialization.Polymorphic<" + this.f121574q.mo131574e().mo100163c() + '>', AbstractC26341h.a.f125054a, new SerialDescriptor[0], null, 8, null), null, false, 12, null);
                c26334a.m135531h(this.f121574q.f121571b);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m131576a((C26334a) obj);
                return C24848g0.f119245a;
            }
        }

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SerialDescriptor mo12V4() {
            return AbstractC26335b.m135534c(AbstractC26340g.m135542d("kotlinx.serialization.Polymorphic", AbstractC26337d.a.f125035a, new SerialDescriptor[0], new C32952a(C25388c.this)), C25388c.this.mo131574e());
        }
    }

    public C25388c(InterfaceC23364b interfaceC23364b) {
        List m131502j;
        InterfaceC24854k m129211b;
        AbstractC19074t.m100208f(interfaceC23364b, "baseClass");
        this.f121570a = interfaceC23364b;
        m131502j = AbstractC25368s.m131502j();
        this.f121571b = m131502j;
        m129211b = AbstractC24856m.m129211b(EnumC24858o.f119258q, new a());
        this.f121572c = m129211b;
    }

    @Override // tn0.AbstractC26776b
    /* renamed from: e */
    public InterfaceC23364b mo131574e() {
        return this.f121570a;
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f121572c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + mo131574e() + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25388c(InterfaceC23364b interfaceC23364b, Annotation[] annotationArr) {
        this(interfaceC23364b);
        List m131320c;
        AbstractC19074t.m100208f(interfaceC23364b, "baseClass");
        AbstractC19074t.m100208f(annotationArr, "classAnnotations");
        m131320c = AbstractC25356m.m131320c(annotationArr);
        this.f121571b = m131320c;
    }
}
