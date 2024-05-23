package sn0;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import kotlinx.serialization.descriptors.C21880a;
import kotlinx.serialization.descriptors.SerialDescriptor;
import on0.AbstractC24341v;
import pm0.C24848g0;
import qm0.AbstractC25358n;
import sn0.AbstractC26342i;
import tn0.AbstractC26796h1;

/* renamed from: sn0.g */
/* loaded from: classes7.dex */
public abstract class AbstractC26340g {

    /* renamed from: sn0.g$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final a f125052q = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m135544a(C26334a c26334a) {
            AbstractC19074t.m100208f(c26334a, "$this$null");
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m135544a((C26334a) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: sn0.g$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final b f125053q = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m135545a(C26334a c26334a) {
            AbstractC19074t.m100208f(c26334a, "$this$null");
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m135545a((C26334a) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: a */
    public static final SerialDescriptor m135539a(String str, AbstractC26338e abstractC26338e) {
        boolean m127128x;
        AbstractC19074t.m100208f(str, "serialName");
        AbstractC19074t.m100208f(abstractC26338e, "kind");
        m127128x = AbstractC24341v.m127128x(str);
        if (!m127128x) {
            return AbstractC26796h1.m137848a(str, abstractC26338e);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    /* renamed from: b */
    public static final SerialDescriptor m135540b(String str, SerialDescriptor[] serialDescriptorArr, InterfaceC18505l interfaceC18505l) {
        boolean m127128x;
        List m131381c0;
        AbstractC19074t.m100208f(str, "serialName");
        AbstractC19074t.m100208f(serialDescriptorArr, "typeParameters");
        AbstractC19074t.m100208f(interfaceC18505l, "builderAction");
        m127128x = AbstractC24341v.m127128x(str);
        if (!m127128x) {
            C26334a c26334a = new C26334a(str);
            interfaceC18505l.mo205i9(c26334a);
            AbstractC26342i.a aVar = AbstractC26342i.a.f125056a;
            int size = c26334a.m135529f().size();
            m131381c0 = AbstractC25358n.m131381c0(serialDescriptorArr);
            return new C21880a(str, aVar, size, m131381c0, c26334a);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    /* renamed from: c */
    public static /* synthetic */ SerialDescriptor m135541c(String str, SerialDescriptor[] serialDescriptorArr, InterfaceC18505l interfaceC18505l, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            interfaceC18505l = a.f125052q;
        }
        return m135540b(str, serialDescriptorArr, interfaceC18505l);
    }

    /* renamed from: d */
    public static final SerialDescriptor m135542d(String str, AbstractC26341h abstractC26341h, SerialDescriptor[] serialDescriptorArr, InterfaceC18505l interfaceC18505l) {
        boolean m127128x;
        List m131381c0;
        AbstractC19074t.m100208f(str, "serialName");
        AbstractC19074t.m100208f(abstractC26341h, "kind");
        AbstractC19074t.m100208f(serialDescriptorArr, "typeParameters");
        AbstractC19074t.m100208f(interfaceC18505l, "builder");
        m127128x = AbstractC24341v.m127128x(str);
        if (!m127128x) {
            if (!AbstractC19074t.m100204b(abstractC26341h, AbstractC26342i.a.f125056a)) {
                C26334a c26334a = new C26334a(str);
                interfaceC18505l.mo205i9(c26334a);
                int size = c26334a.m135529f().size();
                m131381c0 = AbstractC25358n.m131381c0(serialDescriptorArr);
                return new C21880a(str, abstractC26341h, size, m131381c0, c26334a);
            }
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    /* renamed from: e */
    public static /* synthetic */ SerialDescriptor m135543e(String str, AbstractC26341h abstractC26341h, SerialDescriptor[] serialDescriptorArr, InterfaceC18505l interfaceC18505l, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            interfaceC18505l = b.f125053q;
        }
        return m135542d(str, abstractC26341h, serialDescriptorArr, interfaceC18505l);
    }
}
