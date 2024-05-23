package qn0;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import mn0.InterfaceC23364b;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.EnumC24858o;
import pm0.InterfaceC24854k;
import qm0.AbstractC25356m;
import qm0.AbstractC25358n;
import qm0.AbstractC25361o0;
import qm0.AbstractC25363p0;
import qm0.AbstractC25368s;
import qm0.InterfaceC25343f0;
import rn0.AbstractC25935a;
import sn0.AbstractC26337d;
import sn0.AbstractC26340g;
import sn0.AbstractC26341h;
import sn0.C26334a;
import tn0.AbstractC26776b;

/* renamed from: qn0.e */
/* loaded from: classes7.dex */
public final class C25390e extends AbstractC26776b {

    /* renamed from: a */
    private final InterfaceC23364b f121575a;

    /* renamed from: b */
    private List f121576b;

    /* renamed from: c */
    private final InterfaceC24854k f121577c;

    /* renamed from: d */
    private final Map f121578d;

    /* renamed from: e */
    private final Map f121579e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qn0.e$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f121580q;

        /* renamed from: r */
        final /* synthetic */ C25390e f121581r;

        /* renamed from: qn0.e$a$a */
        /* loaded from: classes7.dex */
        public static final class C32953a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C25390e f121582q;

            /* renamed from: qn0.e$a$a$a */
            /* loaded from: classes7.dex */
            public static final class C32954a extends AbstractC19075u implements InterfaceC18505l {

                /* renamed from: q */
                final /* synthetic */ C25390e f121583q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32954a(C25390e c25390e) {
                    super(1);
                    this.f121583q = c25390e;
                }

                /* renamed from: a */
                public final void m131585a(C26334a c26334a) {
                    AbstractC19074t.m100208f(c26334a, "$this$buildSerialDescriptor");
                    for (Map.Entry entry : this.f121583q.f121579e.entrySet()) {
                        C26334a.m135524b(c26334a, (String) entry.getKey(), ((KSerializer) entry.getValue()).getDescriptor(), null, false, 12, null);
                    }
                }

                @Override // en0.InterfaceC18505l
                /* renamed from: i9 */
                public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                    m131585a((C26334a) obj);
                    return C24848g0.f119245a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32953a(C25390e c25390e) {
                super(1);
                this.f121582q = c25390e;
            }

            /* renamed from: a */
            public final void m131584a(C26334a c26334a) {
                AbstractC19074t.m100208f(c26334a, "$this$buildSerialDescriptor");
                C26334a.m135524b(c26334a, ZinstantMetaConstant.IMPRESSION_META_TYPE, AbstractC25935a.m133603D(C19067n0.f94947a).getDescriptor(), null, false, 12, null);
                C26334a.m135524b(c26334a, "value", AbstractC26340g.m135542d("kotlinx.serialization.Sealed<" + this.f121582q.mo131574e().mo100163c() + '>', AbstractC26341h.a.f125054a, new SerialDescriptor[0], new C32954a(this.f121582q)), null, false, 12, null);
                c26334a.m135531h(this.f121582q.f121576b);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m131584a((C26334a) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, C25390e c25390e) {
            super(0);
            this.f121580q = str;
            this.f121581r = c25390e;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final SerialDescriptor mo12V4() {
            return AbstractC26340g.m135542d(this.f121580q, AbstractC26337d.b.f125036a, new SerialDescriptor[0], new C32953a(this.f121581r));
        }
    }

    /* renamed from: qn0.e$b */
    /* loaded from: classes7.dex */
    public static final class b implements InterfaceC25343f0 {

        /* renamed from: a */
        final /* synthetic */ Iterable f121584a;

        public b(Iterable iterable) {
            this.f121584a = iterable;
        }

        @Override // qm0.InterfaceC25343f0
        /* renamed from: a */
        public Object mo131261a(Object obj) {
            return ((KSerializer) ((Map.Entry) obj).getValue()).getDescriptor().mo113953i();
        }

        @Override // qm0.InterfaceC25343f0
        /* renamed from: b */
        public Iterator mo131262b() {
            return this.f121584a.iterator();
        }
    }

    public C25390e(String str, InterfaceC23364b interfaceC23364b, InterfaceC23364b[] interfaceC23364bArr, KSerializer[] kSerializerArr) {
        List m131502j;
        InterfaceC24854k m129211b;
        List m131386h0;
        Map m131413r;
        int m131400e;
        AbstractC19074t.m100208f(str, "serialName");
        AbstractC19074t.m100208f(interfaceC23364b, "baseClass");
        AbstractC19074t.m100208f(interfaceC23364bArr, "subclasses");
        AbstractC19074t.m100208f(kSerializerArr, "subclassSerializers");
        this.f121575a = interfaceC23364b;
        m131502j = AbstractC25368s.m131502j();
        this.f121576b = m131502j;
        m129211b = AbstractC24856m.m129211b(EnumC24858o.f119258q, new a(str, this));
        this.f121577c = m129211b;
        if (interfaceC23364bArr.length == kSerializerArr.length) {
            m131386h0 = AbstractC25358n.m131386h0(interfaceC23364bArr, kSerializerArr);
            m131413r = AbstractC25363p0.m131413r(m131386h0);
            this.f121578d = m131413r;
            b bVar = new b(m131413r.entrySet());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator mo131262b = bVar.mo131262b();
            while (mo131262b.hasNext()) {
                Object next = mo131262b.next();
                Object mo131261a = bVar.mo131261a(next);
                Object obj = linkedHashMap.get(mo131261a);
                if (obj == null) {
                    linkedHashMap.containsKey(mo131261a);
                }
                Map.Entry entry = (Map.Entry) next;
                Map.Entry entry2 = (Map.Entry) obj;
                String str2 = (String) mo131261a;
                if (entry2 != null) {
                    throw new IllegalStateException(("Multiple sealed subclasses of '" + mo131574e() + "' have the same serial name '" + str2 + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
                }
                linkedHashMap.put(mo131261a, entry);
            }
            m131400e = AbstractC25361o0.m131400e(linkedHashMap.size());
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(m131400e);
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
            }
            this.f121579e = linkedHashMap2;
            return;
        }
        throw new IllegalArgumentException("All subclasses of sealed class " + mo131574e().mo100163c() + " should be marked @Serializable");
    }

    @Override // tn0.AbstractC26776b
    /* renamed from: c */
    public InterfaceC25386a mo131581c(InterfaceC21885c interfaceC21885c, String str) {
        AbstractC19074t.m100208f(interfaceC21885c, "decoder");
        KSerializer kSerializer = (KSerializer) this.f121579e.get(str);
        if (kSerializer == null) {
            return super.mo131581c(interfaceC21885c, str);
        }
        return kSerializer;
    }

    @Override // tn0.AbstractC26776b
    /* renamed from: d */
    public InterfaceC25393h mo131582d(Encoder encoder, Object obj) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(obj, "value");
        InterfaceC25393h interfaceC25393h = (KSerializer) this.f121578d.get(AbstractC19061k0.m100169b(obj.getClass()));
        if (interfaceC25393h == null) {
            interfaceC25393h = super.mo131582d(encoder, obj);
        }
        if (interfaceC25393h == null) {
            return null;
        }
        return interfaceC25393h;
    }

    @Override // tn0.AbstractC26776b
    /* renamed from: e */
    public InterfaceC23364b mo131574e() {
        return this.f121575a;
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f121577c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25390e(String str, InterfaceC23364b interfaceC23364b, InterfaceC23364b[] interfaceC23364bArr, KSerializer[] kSerializerArr, Annotation[] annotationArr) {
        this(str, interfaceC23364b, interfaceC23364bArr, kSerializerArr);
        List m131320c;
        AbstractC19074t.m100208f(str, "serialName");
        AbstractC19074t.m100208f(interfaceC23364b, "baseClass");
        AbstractC19074t.m100208f(interfaceC23364bArr, "subclasses");
        AbstractC19074t.m100208f(kSerializerArr, "subclassSerializers");
        AbstractC19074t.m100208f(annotationArr, "classAnnotations");
        m131320c = AbstractC25356m.m131320c(annotationArr);
        this.f121576b = m131320c;
    }
}
