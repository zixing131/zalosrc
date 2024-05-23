package kotlinx.serialization.internal;

import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ln0.AbstractC22543l;
import ln0.C22537f;
import pm0.AbstractC24856m;
import pm0.EnumC24858o;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25363p0;
import qm0.AbstractC25368s;
import sn0.AbstractC26341h;
import sn0.AbstractC26342i;
import tn0.AbstractC26778b1;
import tn0.AbstractC26781c1;
import tn0.AbstractC26849z0;
import tn0.InterfaceC26803k;
import tn0.InterfaceC26842x;

/* loaded from: classes7.dex */
public class PluginGeneratedSerialDescriptor implements SerialDescriptor, InterfaceC26803k {

    /* renamed from: a */
    private final String f107640a;

    /* renamed from: b */
    private final InterfaceC26842x f107641b;

    /* renamed from: c */
    private final int f107642c;

    /* renamed from: d */
    private int f107643d;

    /* renamed from: e */
    private final String[] f107644e;

    /* renamed from: f */
    private final List[] f107645f;

    /* renamed from: g */
    private List f107646g;

    /* renamed from: h */
    private final boolean[] f107647h;

    /* renamed from: i */
    private Map f107648i;

    /* renamed from: j */
    private final InterfaceC24854k f107649j;

    /* renamed from: k */
    private final InterfaceC24854k f107650k;

    /* renamed from: l */
    private final InterfaceC24854k f107651l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$a */
    /* loaded from: classes7.dex */
    public static final class C21887a extends AbstractC19075u implements InterfaceC18494a {
        C21887a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Integer mo12V4() {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = PluginGeneratedSerialDescriptor.this;
            return Integer.valueOf(AbstractC26778b1.m137806a(pluginGeneratedSerialDescriptor, pluginGeneratedSerialDescriptor.m114048r()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$b */
    /* loaded from: classes7.dex */
    public static final class C21888b extends AbstractC19075u implements InterfaceC18494a {
        C21888b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final KSerializer[] mo12V4() {
            KSerializer[] childSerializers;
            InterfaceC26842x interfaceC26842x = PluginGeneratedSerialDescriptor.this.f107641b;
            if (interfaceC26842x == null || (childSerializers = interfaceC26842x.childSerializers()) == null) {
                return AbstractC26781c1.f126988a;
            }
            return childSerializers;
        }
    }

    /* renamed from: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$c */
    /* loaded from: classes7.dex */
    static final class C21889c extends AbstractC19075u implements InterfaceC18505l {
        C21889c() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence m114051a(int i11) {
            return PluginGeneratedSerialDescriptor.this.mo113950f(i11) + ": " + PluginGeneratedSerialDescriptor.this.mo113952h(i11).mo113953i();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            return m114051a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$d */
    /* loaded from: classes7.dex */
    public static final class C21890d extends AbstractC19075u implements InterfaceC18494a {
        C21890d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final SerialDescriptor[] mo12V4() {
            ArrayList arrayList;
            KSerializer[] typeParametersSerializers;
            InterfaceC26842x interfaceC26842x = PluginGeneratedSerialDescriptor.this.f107641b;
            if (interfaceC26842x != null && (typeParametersSerializers = interfaceC26842x.typeParametersSerializers()) != null) {
                arrayList = new ArrayList(typeParametersSerializers.length);
                for (KSerializer kSerializer : typeParametersSerializers) {
                    arrayList.add(kSerializer.getDescriptor());
                }
            } else {
                arrayList = null;
            }
            return AbstractC26849z0.m138015b(arrayList);
        }
    }

    public PluginGeneratedSerialDescriptor(String str, InterfaceC26842x interfaceC26842x, int i11) {
        Map m131404i;
        InterfaceC24854k m129211b;
        InterfaceC24854k m129211b2;
        InterfaceC24854k m129211b3;
        AbstractC19074t.m100208f(str, "serialName");
        this.f107640a = str;
        this.f107641b = interfaceC26842x;
        this.f107642c = i11;
        this.f107643d = -1;
        String[] strArr = new String[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            strArr[i12] = "[UNINITIALIZED]";
        }
        this.f107644e = strArr;
        int i13 = this.f107642c;
        this.f107645f = new List[i13];
        this.f107647h = new boolean[i13];
        m131404i = AbstractC25363p0.m131404i();
        this.f107648i = m131404i;
        EnumC24858o enumC24858o = EnumC24858o.f119258q;
        m129211b = AbstractC24856m.m129211b(enumC24858o, new C21888b());
        this.f107649j = m129211b;
        m129211b2 = AbstractC24856m.m129211b(enumC24858o, new C21890d());
        this.f107650k = m129211b2;
        m129211b3 = AbstractC24856m.m129211b(enumC24858o, new C21887a());
        this.f107651l = m129211b3;
    }

    /* renamed from: o */
    public static /* synthetic */ void m114043o(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, String str, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            pluginGeneratedSerialDescriptor.m114047n(str, z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
    }

    /* renamed from: p */
    private final Map m114044p() {
        HashMap hashMap = new HashMap();
        int length = this.f107644e.length;
        for (int i11 = 0; i11 < length; i11++) {
            hashMap.put(this.f107644e[i11], Integer.valueOf(i11));
        }
        return hashMap;
    }

    /* renamed from: q */
    private final KSerializer[] m114045q() {
        return (KSerializer[]) this.f107649j.getValue();
    }

    /* renamed from: s */
    private final int m114046s() {
        return ((Number) this.f107651l.getValue()).intValue();
    }

    @Override // tn0.InterfaceC26803k
    /* renamed from: a */
    public Set mo113962a() {
        return this.f107648i.keySet();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: b */
    public boolean mo113946b() {
        return SerialDescriptor.C21879a.m113959c(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: c */
    public int mo113947c(String str) {
        AbstractC19074t.m100208f(str, "name");
        Integer num = (Integer) this.f107648i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: d */
    public AbstractC26341h mo113948d() {
        return AbstractC26342i.a.f125056a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: e */
    public final int mo113949e() {
        return this.f107642c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PluginGeneratedSerialDescriptor) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (AbstractC19074t.m100204b(mo113953i(), serialDescriptor.mo113953i()) && Arrays.equals(m114048r(), ((PluginGeneratedSerialDescriptor) obj).m114048r()) && mo113949e() == serialDescriptor.mo113949e()) {
                int mo113949e = mo113949e();
                for (int i11 = 0; i11 < mo113949e; i11++) {
                    if (AbstractC19074t.m100204b(mo113952h(i11).mo113953i(), serialDescriptor.mo113952h(i11).mo113953i()) && AbstractC19074t.m100204b(mo113952h(i11).mo113948d(), serialDescriptor.mo113952h(i11).mo113948d())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: f */
    public String mo113950f(int i11) {
        return this.f107644e[i11];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: g */
    public List mo113951g(int i11) {
        List m131502j;
        List list = this.f107645f[i11];
        if (list == null) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        return list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: h */
    public SerialDescriptor mo113952h(int i11) {
        return m114045q()[i11].getDescriptor();
    }

    public int hashCode() {
        return m114046s();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i */
    public String mo113953i() {
        return this.f107640a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: j */
    public List mo113954j() {
        List m131502j;
        List list = this.f107646g;
        if (list == null) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        return list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: k */
    public boolean mo113955k() {
        return SerialDescriptor.C21879a.m113958b(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: l */
    public boolean mo113956l(int i11) {
        return this.f107647h[i11];
    }

    /* renamed from: n */
    public final void m114047n(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "name");
        String[] strArr = this.f107644e;
        int i11 = this.f107643d + 1;
        this.f107643d = i11;
        strArr[i11] = str;
        this.f107647h[i11] = z11;
        this.f107645f[i11] = null;
        if (i11 == this.f107642c - 1) {
            this.f107648i = m114044p();
        }
    }

    /* renamed from: r */
    public final SerialDescriptor[] m114048r() {
        return (SerialDescriptor[]) this.f107650k.getValue();
    }

    public String toString() {
        C22537f m116593p;
        String m131214n0;
        m116593p = AbstractC22543l.m116593p(0, this.f107642c);
        m131214n0 = AbstractC25332a0.m131214n0(m116593p, ", ", mo113953i() + '(', ")", 0, null, new C21889c(), 24, null);
        return m131214n0;
    }

    public /* synthetic */ PluginGeneratedSerialDescriptor(String str, InterfaceC26842x interfaceC26842x, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(str, (i12 & 2) != 0 ? null : interfaceC26842x, i11);
    }
}
