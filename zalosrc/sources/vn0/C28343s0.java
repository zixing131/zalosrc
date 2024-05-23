package vn0;

import fn0.AbstractC19074t;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC21883a;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.json.JsonElement;
import on0.AbstractC24342w;
import qn0.InterfaceC25386a;
import sn0.AbstractC26341h;
import tn0.AbstractC26776b;
import un0.AbstractC27323a;
import un0.C27328f;
import un0.InterfaceC27329g;
import wn0.AbstractC29112b;

/* renamed from: vn0.s0 */
/* loaded from: classes7.dex */
public class C28343s0 extends AbstractC21883a implements InterfaceC27329g {

    /* renamed from: a */
    private final AbstractC27323a f132089a;

    /* renamed from: b */
    private final EnumC28357z0 f132090b;

    /* renamed from: c */
    public final AbstractC28305a f132091c;

    /* renamed from: d */
    private final AbstractC29112b f132092d;

    /* renamed from: e */
    private int f132093e;

    /* renamed from: f */
    private a f132094f;

    /* renamed from: g */
    private final C27328f f132095g;

    /* renamed from: h */
    private final C28306a0 f132096h;

    /* renamed from: vn0.s0$a */
    /* loaded from: classes7.dex */
    public static final class a {

        /* renamed from: a */
        public String f132097a;

        public a(String str) {
            this.f132097a = str;
        }
    }

    /* renamed from: vn0.s0$b */
    /* loaded from: classes7.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f132098a;

        static {
            int[] iArr = new int[EnumC28357z0.values().length];
            try {
                iArr[EnumC28357z0.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC28357z0.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC28357z0.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC28357z0.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f132098a = iArr;
        }
    }

    public C28343s0(AbstractC27323a abstractC27323a, EnumC28357z0 enumC28357z0, AbstractC28305a abstractC28305a, SerialDescriptor serialDescriptor, a aVar) {
        C28306a0 c28306a0;
        AbstractC19074t.m100208f(abstractC27323a, "json");
        AbstractC19074t.m100208f(enumC28357z0, "mode");
        AbstractC19074t.m100208f(abstractC28305a, "lexer");
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        this.f132089a = abstractC27323a;
        this.f132090b = enumC28357z0;
        this.f132091c = abstractC28305a;
        this.f132092d = abstractC27323a.mo131586a();
        this.f132093e = -1;
        this.f132094f = aVar;
        C27328f m139869f = abstractC27323a.m139869f();
        this.f132095g = m139869f;
        if (m139869f.m139889f()) {
            c28306a0 = null;
        } else {
            c28306a0 = new C28306a0(serialDescriptor);
        }
        this.f132096h = c28306a0;
    }

    /* renamed from: K */
    private final void m142775K() {
        if (this.f132091c.m142599E() != 4) {
            return;
        }
        AbstractC28305a.m142595y(this.f132091c, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: L */
    private final boolean m142776L(SerialDescriptor serialDescriptor, int i11) {
        String m142600F;
        AbstractC27323a abstractC27323a = this.f132089a;
        SerialDescriptor mo113952h = serialDescriptor.mo113952h(i11);
        if (!mo113952h.mo113946b() && this.f132091c.m142606M(true)) {
            return true;
        }
        if (!AbstractC19074t.m100204b(mo113952h.mo113948d(), AbstractC26341h.b.f125055a) || ((mo113952h.mo113946b() && this.f132091c.m142606M(false)) || (m142600F = this.f132091c.m142600F(this.f132095g.m139896m())) == null || AbstractC28311c0.m142670g(mo113952h, abstractC27323a, m142600F) != -3)) {
            return false;
        }
        this.f132091c.m142618q();
        return true;
    }

    /* renamed from: M */
    private final int m142777M() {
        boolean mo142605L = this.f132091c.mo142605L();
        if (this.f132091c.mo142609f()) {
            int i11 = this.f132093e;
            if (i11 != -1 && !mo142605L) {
                AbstractC28305a.m142595y(this.f132091c, "Expected end of the array or comma", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            int i12 = i11 + 1;
            this.f132093e = i12;
            return i12;
        }
        if (!mo142605L) {
            return -1;
        }
        AbstractC28305a.m142595y(this.f132091c, "Unexpected trailing comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: N */
    private final int m142778N() {
        boolean z11;
        int i11;
        int i12;
        int i13 = this.f132093e;
        boolean z12 = false;
        if (i13 % 2 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (i13 != -1) {
                z12 = this.f132091c.mo142605L();
            }
        } else {
            this.f132091c.mo142616o(':');
        }
        if (this.f132091c.mo142609f()) {
            if (z11) {
                if (this.f132093e == -1) {
                    AbstractC28305a abstractC28305a = this.f132091c;
                    boolean z13 = !z12;
                    i12 = abstractC28305a.f132016a;
                    if (!z13) {
                        AbstractC28305a.m142595y(abstractC28305a, "Unexpected trailing comma", i12, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    AbstractC28305a abstractC28305a2 = this.f132091c;
                    i11 = abstractC28305a2.f132016a;
                    if (!z12) {
                        AbstractC28305a.m142595y(abstractC28305a2, "Expected comma after the key-value pair", i11, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                }
            }
            int i14 = this.f132093e + 1;
            this.f132093e = i14;
            return i14;
        }
        if (!z12) {
            return -1;
        }
        AbstractC28305a.m142595y(this.f132091c, "Expected '}', but had ',' instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: O */
    private final int m142779O(SerialDescriptor serialDescriptor) {
        boolean z11;
        boolean mo142605L = this.f132091c.mo142605L();
        while (this.f132091c.mo142609f()) {
            String m142780P = m142780P();
            this.f132091c.mo142616o(':');
            int m142670g = AbstractC28311c0.m142670g(serialDescriptor, this.f132089a, m142780P);
            boolean z12 = false;
            if (m142670g != -3) {
                if (this.f132095g.m139887d() && m142776L(serialDescriptor, m142670g)) {
                    z11 = this.f132091c.mo142605L();
                } else {
                    C28306a0 c28306a0 = this.f132096h;
                    if (c28306a0 != null) {
                        c28306a0.m142629c(m142670g);
                    }
                    return m142670g;
                }
            } else {
                z11 = false;
                z12 = true;
            }
            if (z12) {
                mo142605L = m142781Q(m142780P);
            } else {
                mo142605L = z11;
            }
        }
        if (!mo142605L) {
            C28306a0 c28306a02 = this.f132096h;
            if (c28306a02 != null) {
                return c28306a02.m142630d();
            }
            return -1;
        }
        AbstractC28305a.m142595y(this.f132091c, "Unexpected trailing comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: P */
    private final String m142780P() {
        if (this.f132095g.m139896m()) {
            return this.f132091c.m142621t();
        }
        return this.f132091c.mo142612k();
    }

    /* renamed from: Q */
    private final boolean m142781Q(String str) {
        if (!this.f132095g.m139890g() && !m142783S(this.f132094f, str)) {
            this.f132091c.m142596A(str);
        } else {
            this.f132091c.m142602H(this.f132095g.m139896m());
        }
        return this.f132091c.mo142605L();
    }

    /* renamed from: R */
    private final void m142782R(SerialDescriptor serialDescriptor) {
        do {
        } while (mo114037p(serialDescriptor) != -1);
    }

    /* renamed from: S */
    private final boolean m142783S(a aVar, String str) {
        if (aVar == null || !AbstractC19074t.m100204b(aVar.f132097a, str)) {
            return false;
        }
        aVar.f132097a = null;
        return true;
    }

    @Override // kotlinx.serialization.encoding.AbstractC21883a, kotlinx.serialization.encoding.Decoder
    /* renamed from: A */
    public String mo113965A() {
        if (this.f132095g.m139896m()) {
            return this.f132091c.m142621t();
        }
        return this.f132091c.m142618q();
    }

    @Override // kotlinx.serialization.encoding.AbstractC21883a, kotlinx.serialization.encoding.Decoder
    /* renamed from: E */
    public boolean mo113966E() {
        C28306a0 c28306a0 = this.f132096h;
        if ((c28306a0 != null && c28306a0.m142628b()) || AbstractC28305a.m142586N(this.f132091c, false, 1, null)) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.serialization.encoding.AbstractC21883a, kotlinx.serialization.encoding.Decoder
    /* renamed from: H */
    public byte mo113967H() {
        long m142617p = this.f132091c.m142617p();
        byte b11 = (byte) m142617p;
        if (m142617p == b11) {
            return b11;
        }
        AbstractC28305a.m142595y(this.f132091c, "Failed to parse byte for input '" + m142617p + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: a */
    public AbstractC29112b mo114036a() {
        return this.f132092d;
    }

    @Override // kotlinx.serialization.encoding.AbstractC21883a, kotlinx.serialization.encoding.Decoder
    /* renamed from: b */
    public InterfaceC21885c mo113968b(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        EnumC28357z0 m142633b = AbstractC28307a1.m142633b(this.f132089a, serialDescriptor);
        this.f132091c.f132017b.m142699c(serialDescriptor);
        this.f132091c.mo142616o(m142633b.f132124p);
        m142775K();
        int i11 = b.f132098a[m142633b.ordinal()];
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            if (this.f132090b == m142633b && this.f132089a.m139869f().m139889f()) {
                return this;
            }
            return new C28343s0(this.f132089a, m142633b, this.f132091c, serialDescriptor, this.f132094f);
        }
        return new C28343s0(this.f132089a, m142633b, this.f132091c, serialDescriptor, this.f132094f);
    }

    @Override // kotlinx.serialization.encoding.AbstractC21883a, kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: c */
    public void mo114009c(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        if (this.f132089a.m139869f().m139890g() && serialDescriptor.mo113949e() == 0) {
            m142782R(serialDescriptor);
        }
        this.f132091c.mo142616o(this.f132090b.f132125q);
        this.f132091c.f132017b.m142698b();
    }

    @Override // un0.InterfaceC27329g
    /* renamed from: d */
    public final AbstractC27323a mo139897d() {
        return this.f132089a;
    }

    @Override // kotlinx.serialization.encoding.AbstractC21883a, kotlinx.serialization.encoding.Decoder
    /* renamed from: e */
    public int mo113969e(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "enumDescriptor");
        return AbstractC28311c0.m142672i(serialDescriptor, this.f132089a, mo113965A(), " at path " + this.f132091c.f132017b.m142697a());
    }

    @Override // un0.InterfaceC27329g
    /* renamed from: g */
    public JsonElement mo139898g() {
        return new C28335o0(this.f132089a.m139869f(), this.f132091c).m142758e();
    }

    @Override // kotlinx.serialization.encoding.AbstractC21883a, kotlinx.serialization.encoding.Decoder
    /* renamed from: h */
    public int mo113970h() {
        long m142617p = this.f132091c.m142617p();
        int i11 = (int) m142617p;
        if (m142617p == i11) {
            return i11;
        }
        AbstractC28305a.m142595y(this.f132091c, "Failed to parse int for input '" + m142617p + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractC21883a, kotlinx.serialization.encoding.Decoder
    /* renamed from: j */
    public Void mo113971j() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.AbstractC21883a, kotlinx.serialization.encoding.Decoder
    /* renamed from: k */
    public Object mo113972k(InterfaceC25386a interfaceC25386a) {
        boolean m127149O;
        InterfaceC25386a interfaceC25386a2;
        AbstractC19074t.m100208f(interfaceC25386a, "deserializer");
        try {
            if ((interfaceC25386a instanceof AbstractC26776b) && !this.f132089a.m139869f().m139895l()) {
                String m142764c = AbstractC28339q0.m142764c(interfaceC25386a.getDescriptor(), this.f132089a);
                String mo142613l = this.f132091c.mo142613l(m142764c, this.f132095g.m139896m());
                if (mo142613l != null) {
                    interfaceC25386a2 = ((AbstractC26776b) interfaceC25386a).mo131581c(this, mo142613l);
                } else {
                    interfaceC25386a2 = null;
                }
                if (interfaceC25386a2 == null) {
                    return AbstractC28339q0.m142765d(this, interfaceC25386a);
                }
                this.f132094f = new a(m142764c);
                return interfaceC25386a2.deserialize(this);
            }
            return interfaceC25386a.deserialize(this);
        } catch (MissingFieldException e11) {
            String message = e11.getMessage();
            AbstractC19074t.m100205c(message);
            m127149O = AbstractC24342w.m127149O(message, "at path", false, 2, null);
            if (m127149O) {
                throw e11;
            }
            throw new MissingFieldException(e11.m113945a(), e11.getMessage() + " at path: " + this.f132091c.f132017b.m142697a(), e11);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC21883a, kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: l */
    public Object mo114012l(SerialDescriptor serialDescriptor, int i11, InterfaceC25386a interfaceC25386a, Object obj) {
        boolean z11;
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        AbstractC19074t.m100208f(interfaceC25386a, "deserializer");
        if (this.f132090b == EnumC28357z0.MAP && (i11 & 1) == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f132091c.f132017b.m142700d();
        }
        Object mo114012l = super.mo114012l(serialDescriptor, i11, interfaceC25386a, obj);
        if (z11) {
            this.f132091c.f132017b.m142701f(mo114012l);
        }
        return mo114012l;
    }

    @Override // kotlinx.serialization.encoding.AbstractC21883a, kotlinx.serialization.encoding.Decoder
    /* renamed from: n */
    public long mo113973n() {
        return this.f132091c.m142617p();
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: p */
    public int mo114037p(SerialDescriptor serialDescriptor) {
        int m142778N;
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        int i11 = b.f132098a[this.f132090b.ordinal()];
        if (i11 != 2) {
            if (i11 != 4) {
                m142778N = m142777M();
            } else {
                m142778N = m142779O(serialDescriptor);
            }
        } else {
            m142778N = m142778N();
        }
        if (this.f132090b != EnumC28357z0.MAP) {
            this.f132091c.f132017b.m142702g(m142778N);
        }
        return m142778N;
    }

    @Override // kotlinx.serialization.encoding.AbstractC21883a, kotlinx.serialization.encoding.Decoder
    /* renamed from: r */
    public Decoder mo113974r(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        if (AbstractC28347u0.m142787b(serialDescriptor)) {
            return new C28356z(this.f132091c, this.f132089a);
        }
        return super.mo113974r(serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.AbstractC21883a, kotlinx.serialization.encoding.Decoder
    /* renamed from: t */
    public short mo113975t() {
        long m142617p = this.f132091c.m142617p();
        short s7 = (short) m142617p;
        if (m142617p == s7) {
            return s7;
        }
        AbstractC28305a.m142595y(this.f132091c, "Failed to parse short for input '" + m142617p + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractC21883a, kotlinx.serialization.encoding.Decoder
    /* renamed from: u */
    public float mo113976u() {
        AbstractC28305a abstractC28305a = this.f132091c;
        String m142620s = abstractC28305a.m142620s();
        try {
            float parseFloat = Float.parseFloat(m142620s);
            if (!this.f132089a.m139869f().m139884a() && (Float.isInfinite(parseFloat) || Float.isNaN(parseFloat))) {
                AbstractC28309b0.m142645j(this.f132091c, Float.valueOf(parseFloat));
                throw new KotlinNothingValueException();
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            AbstractC28305a.m142595y(abstractC28305a, "Failed to parse type 'float' for input '" + m142620s + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC21883a, kotlinx.serialization.encoding.Decoder
    /* renamed from: w */
    public double mo113977w() {
        AbstractC28305a abstractC28305a = this.f132091c;
        String m142620s = abstractC28305a.m142620s();
        try {
            double parseDouble = Double.parseDouble(m142620s);
            if (!this.f132089a.m139869f().m139884a() && (Double.isInfinite(parseDouble) || Double.isNaN(parseDouble))) {
                AbstractC28309b0.m142645j(this.f132091c, Double.valueOf(parseDouble));
                throw new KotlinNothingValueException();
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            AbstractC28305a.m142595y(abstractC28305a, "Failed to parse type 'double' for input '" + m142620s + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC21883a, kotlinx.serialization.encoding.Decoder
    /* renamed from: y */
    public boolean mo113978y() {
        if (this.f132095g.m139896m()) {
            return this.f132091c.m142611i();
        }
        return this.f132091c.m142610g();
    }

    @Override // kotlinx.serialization.encoding.AbstractC21883a, kotlinx.serialization.encoding.Decoder
    /* renamed from: z */
    public char mo113979z() {
        String m142620s = this.f132091c.m142620s();
        if (m142620s.length() == 1) {
            return m142620s.charAt(0);
        }
        AbstractC28305a.m142595y(this.f132091c, "Expected single char, but got '" + m142620s + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }
}
