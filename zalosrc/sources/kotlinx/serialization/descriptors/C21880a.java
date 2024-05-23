package kotlinx.serialization.descriptors;

import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ln0.AbstractC22543l;
import ln0.C22537f;
import pm0.AbstractC24856m;
import pm0.AbstractC24866w;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25358n;
import qm0.AbstractC25363p0;
import qm0.AbstractC25370t;
import qm0.C25345g0;
import sn0.AbstractC26341h;
import sn0.C26334a;
import tn0.AbstractC26778b1;
import tn0.AbstractC26849z0;
import tn0.InterfaceC26803k;

/* renamed from: kotlinx.serialization.descriptors.a */
/* loaded from: classes7.dex */
public final class C21880a implements SerialDescriptor, InterfaceC26803k {

    /* renamed from: a */
    private final String f107626a;

    /* renamed from: b */
    private final AbstractC26341h f107627b;

    /* renamed from: c */
    private final int f107628c;

    /* renamed from: d */
    private final List f107629d;

    /* renamed from: e */
    private final Set f107630e;

    /* renamed from: f */
    private final String[] f107631f;

    /* renamed from: g */
    private final SerialDescriptor[] f107632g;

    /* renamed from: h */
    private final List[] f107633h;

    /* renamed from: i */
    private final boolean[] f107634i;

    /* renamed from: j */
    private final Map f107635j;

    /* renamed from: k */
    private final SerialDescriptor[] f107636k;

    /* renamed from: l */
    private final InterfaceC24854k f107637l;

    /* renamed from: kotlinx.serialization.descriptors.a$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {
        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            C21880a c21880a = C21880a.this;
            return Integer.valueOf(AbstractC26778b1.m137806a(c21880a, c21880a.f107636k));
        }
    }

    /* renamed from: kotlinx.serialization.descriptors.a$b */
    /* loaded from: classes7.dex */
    static final class b extends AbstractC19075u implements InterfaceC18505l {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence m113964a(int i11) {
            return C21880a.this.mo113950f(i11) + ": " + C21880a.this.mo113952h(i11).mo113953i();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            return m113964a(((Number) obj).intValue());
        }
    }

    public C21880a(String str, AbstractC26341h abstractC26341h, int i11, List list, C26334a c26334a) {
        HashSet m131183K0;
        boolean[] m131181I0;
        Iterable<C25345g0> m131385g0;
        int m131511r;
        Map m131413r;
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(str, "serialName");
        AbstractC19074t.m100208f(abstractC26341h, "kind");
        AbstractC19074t.m100208f(list, "typeParameters");
        AbstractC19074t.m100208f(c26334a, "builder");
        this.f107626a = str;
        this.f107627b = abstractC26341h;
        this.f107628c = i11;
        this.f107629d = c26334a.m135526c();
        m131183K0 = AbstractC25332a0.m131183K0(c26334a.m135529f());
        this.f107630e = m131183K0;
        String[] strArr = (String[]) c26334a.m135529f().toArray(new String[0]);
        this.f107631f = strArr;
        this.f107632g = AbstractC26849z0.m138015b(c26334a.m135528e());
        this.f107633h = (List[]) c26334a.m135527d().toArray(new List[0]);
        m131181I0 = AbstractC25332a0.m131181I0(c26334a.m135530g());
        this.f107634i = m131181I0;
        m131385g0 = AbstractC25358n.m131385g0(strArr);
        m131511r = AbstractC25370t.m131511r(m131385g0, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        for (C25345g0 c25345g0 : m131385g0) {
            arrayList.add(AbstractC24866w.m129235a(c25345g0.m131264b(), Integer.valueOf(c25345g0.m131263a())));
        }
        m131413r = AbstractC25363p0.m131413r(arrayList);
        this.f107635j = m131413r;
        this.f107636k = AbstractC26849z0.m138015b(list);
        m129210a = AbstractC24856m.m129210a(new a());
        this.f107637l = m129210a;
    }

    /* renamed from: n */
    private final int m113961n() {
        return ((Number) this.f107637l.getValue()).intValue();
    }

    @Override // tn0.InterfaceC26803k
    /* renamed from: a */
    public Set mo113962a() {
        return this.f107630e;
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
        Integer num = (Integer) this.f107635j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: d */
    public AbstractC26341h mo113948d() {
        return this.f107627b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: e */
    public int mo113949e() {
        return this.f107628c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21880a) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (AbstractC19074t.m100204b(mo113953i(), serialDescriptor.mo113953i()) && Arrays.equals(this.f107636k, ((C21880a) obj).f107636k) && mo113949e() == serialDescriptor.mo113949e()) {
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
        return this.f107631f[i11];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: g */
    public List mo113951g(int i11) {
        return this.f107633h[i11];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: h */
    public SerialDescriptor mo113952h(int i11) {
        return this.f107632g[i11];
    }

    public int hashCode() {
        return m113961n();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i */
    public String mo113953i() {
        return this.f107626a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: j */
    public List mo113954j() {
        return this.f107629d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: k */
    public boolean mo113955k() {
        return SerialDescriptor.C21879a.m113958b(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: l */
    public boolean mo113956l(int i11) {
        return this.f107634i[i11];
    }

    public String toString() {
        C22537f m116593p;
        String m131214n0;
        m116593p = AbstractC22543l.m116593p(0, mo113949e());
        m131214n0 = AbstractC25332a0.m131214n0(m116593p, ", ", mo113953i() + '(', ")", 0, null, new b(), 24, null);
        return m131214n0;
    }
}
