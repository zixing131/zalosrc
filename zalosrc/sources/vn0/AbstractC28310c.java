package vn0;

import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import on0.AbstractC24344y;
import qn0.InterfaceC25386a;
import sn0.AbstractC26337d;
import sn0.AbstractC26338e;
import sn0.AbstractC26341h;
import sn0.AbstractC26342i;
import tn0.AbstractC26822q0;
import un0.AbstractC27323a;
import un0.AbstractC27331i;
import un0.C27328f;
import un0.C27337o;
import un0.InterfaceC27329g;
import wn0.AbstractC29112b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: vn0.c */
/* loaded from: classes7.dex */
public abstract class AbstractC28310c extends AbstractC26822q0 implements InterfaceC27329g {

    /* renamed from: c */
    private final AbstractC27323a f132022c;

    /* renamed from: d */
    private final JsonElement f132023d;

    /* renamed from: e */
    protected final C27328f f132024e;

    public /* synthetic */ AbstractC28310c(AbstractC27323a abstractC27323a, JsonElement jsonElement, AbstractC19060k abstractC19060k) {
        this(abstractC27323a, jsonElement);
    }

    /* renamed from: d0 */
    private final C27337o m142647d0(JsonPrimitive jsonPrimitive, String str) {
        C27337o c27337o;
        if (jsonPrimitive instanceof C27337o) {
            c27337o = (C27337o) jsonPrimitive;
        } else {
            c27337o = null;
        }
        if (c27337o != null) {
            return c27337o;
        }
        throw AbstractC28309b0.m142640e(-1, "Unexpected 'null' when " + str + " was expected");
    }

    /* renamed from: f0 */
    private final JsonElement m142648f0() {
        JsonElement mo142650e0;
        String str = (String) m137905U();
        if (str == null || (mo142650e0 = mo142650e0(str)) == null) {
            return mo142663s0();
        }
        return mo142650e0;
    }

    /* renamed from: t0 */
    private final Void m142649t0(String str) {
        throw AbstractC28309b0.m142641f(-1, "Failed to parse '" + str + '\'', m142648f0().toString());
    }

    @Override // tn0.AbstractC26817o1, kotlinx.serialization.encoding.Decoder
    /* renamed from: E */
    public boolean mo113966E() {
        return !(m142648f0() instanceof JsonNull);
    }

    @Override // tn0.AbstractC26822q0
    /* renamed from: Z */
    protected String mo137936Z(String str, String str2) {
        AbstractC19074t.m100208f(str, "parentName");
        AbstractC19074t.m100208f(str2, "childName");
        return str2;
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: a */
    public AbstractC29112b mo114036a() {
        return mo139897d().mo131586a();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: b */
    public InterfaceC21885c mo113968b(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        JsonElement m142648f0 = m142648f0();
        AbstractC26341h mo113948d = serialDescriptor.mo113948d();
        if (AbstractC19074t.m100204b(mo113948d, AbstractC26342i.b.f125057a) || (mo113948d instanceof AbstractC26337d)) {
            AbstractC27323a mo139897d = mo139897d();
            if (m142648f0 instanceof JsonArray) {
                return new C28327k0(mo139897d, (JsonArray) m142648f0);
            }
            throw AbstractC28309b0.m142640e(-1, "Expected " + AbstractC19061k0.m100169b(JsonArray.class) + " as the serialized body of " + serialDescriptor.mo113953i() + ", but had " + AbstractC19061k0.m100169b(m142648f0.getClass()));
        }
        if (AbstractC19074t.m100204b(mo113948d, AbstractC26342i.c.f125058a)) {
            AbstractC27323a mo139897d2 = mo139897d();
            SerialDescriptor m142632a = AbstractC28307a1.m142632a(serialDescriptor.mo113952h(0), mo139897d2.mo131586a());
            AbstractC26341h mo113948d2 = m142632a.mo113948d();
            if (!(mo113948d2 instanceof AbstractC26338e) && !AbstractC19074t.m100204b(mo113948d2, AbstractC26341h.b.f125055a)) {
                if (mo139897d2.m139869f().m139885b()) {
                    AbstractC27323a mo139897d3 = mo139897d();
                    if (m142648f0 instanceof JsonArray) {
                        return new C28327k0(mo139897d3, (JsonArray) m142648f0);
                    }
                    throw AbstractC28309b0.m142640e(-1, "Expected " + AbstractC19061k0.m100169b(JsonArray.class) + " as the serialized body of " + serialDescriptor.mo113953i() + ", but had " + AbstractC19061k0.m100169b(m142648f0.getClass()));
                }
                throw AbstractC28309b0.m142639d(m142632a);
            }
            AbstractC27323a mo139897d4 = mo139897d();
            if (m142648f0 instanceof JsonObject) {
                return new C28331m0(mo139897d4, (JsonObject) m142648f0);
            }
            throw AbstractC28309b0.m142640e(-1, "Expected " + AbstractC19061k0.m100169b(JsonObject.class) + " as the serialized body of " + serialDescriptor.mo113953i() + ", but had " + AbstractC19061k0.m100169b(m142648f0.getClass()));
        }
        AbstractC27323a mo139897d5 = mo139897d();
        if (m142648f0 instanceof JsonObject) {
            return new C28323i0(mo139897d5, (JsonObject) m142648f0, null, null, 12, null);
        }
        throw AbstractC28309b0.m142640e(-1, "Expected " + AbstractC19061k0.m100169b(JsonObject.class) + " as the serialized body of " + serialDescriptor.mo113953i() + ", but had " + AbstractC19061k0.m100169b(m142648f0.getClass()));
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: c */
    public void mo114009c(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
    }

    @Override // un0.InterfaceC27329g
    /* renamed from: d */
    public AbstractC27323a mo139897d() {
        return this.f132022c;
    }

    /* renamed from: e0 */
    protected abstract JsonElement mo142650e0(String str);

    @Override // un0.InterfaceC27329g
    /* renamed from: g */
    public JsonElement mo139898g() {
        return m142648f0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26817o1
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public boolean mo137894J(String str) {
        AbstractC19074t.m100208f(str, "tag");
        JsonPrimitive m142662r0 = m142662r0(str);
        if (!mo139897d().m139869f().m139896m() && m142647d0(m142662r0, "boolean").m139943g()) {
            throw AbstractC28309b0.m142641f(-1, "Boolean literal for key '" + str + "' should be unquoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", m142648f0().toString());
        }
        try {
            Boolean m139909f = AbstractC27331i.m139909f(m142662r0);
            if (m139909f != null) {
                return m139909f.booleanValue();
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException unused) {
            m142649t0("boolean");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26817o1
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public byte mo137895K(String str) {
        Byte b11;
        AbstractC19074t.m100208f(str, "tag");
        try {
            int m139914k = AbstractC27331i.m139914k(m142662r0(str));
            if (-128 <= m139914k && m139914k <= 127) {
                b11 = Byte.valueOf((byte) m139914k);
            } else {
                b11 = null;
            }
            if (b11 != null) {
                return b11.byteValue();
            }
            m142649t0("byte");
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            m142649t0("byte");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26817o1
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public char mo137896L(String str) {
        char m127210i1;
        AbstractC19074t.m100208f(str, "tag");
        try {
            m127210i1 = AbstractC24344y.m127210i1(m142662r0(str).mo114124d());
            return m127210i1;
        } catch (IllegalArgumentException unused) {
            m142649t0("char");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26817o1
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public double mo137897M(String str) {
        AbstractC19074t.m100208f(str, "tag");
        try {
            double m139911h = AbstractC27331i.m139911h(m142662r0(str));
            if (!mo139897d().m139869f().m139884a() && (Double.isInfinite(m139911h) || Double.isNaN(m139911h))) {
                throw AbstractC28309b0.m142636a(Double.valueOf(m139911h), str, m142648f0().toString());
            }
            return m139911h;
        } catch (IllegalArgumentException unused) {
            m142649t0("double");
            throw new KotlinNothingValueException();
        }
    }

    @Override // tn0.AbstractC26817o1, kotlinx.serialization.encoding.Decoder
    /* renamed from: k */
    public Object mo113972k(InterfaceC25386a interfaceC25386a) {
        AbstractC19074t.m100208f(interfaceC25386a, "deserializer");
        return AbstractC28339q0.m142765d(this, interfaceC25386a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26817o1
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public int mo137898N(String str, SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(serialDescriptor, "enumDescriptor");
        return AbstractC28311c0.m142673j(serialDescriptor, mo139897d(), m142662r0(str).mo114124d(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26817o1
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public float mo137899O(String str) {
        AbstractC19074t.m100208f(str, "tag");
        try {
            float m139913j = AbstractC27331i.m139913j(m142662r0(str));
            if (!mo139897d().m139869f().m139884a() && (Float.isInfinite(m139913j) || Float.isNaN(m139913j))) {
                throw AbstractC28309b0.m142636a(Float.valueOf(m139913j), str, m142648f0().toString());
            }
            return m139913j;
        } catch (IllegalArgumentException unused) {
            m142649t0("float");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26817o1
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public Decoder mo137900P(String str, SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(serialDescriptor, "inlineDescriptor");
        if (AbstractC28347u0.m142787b(serialDescriptor)) {
            return new C28356z(new C28349v0(m142662r0(str).mo114124d()), mo139897d());
        }
        return super.mo137900P(str, serialDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26817o1
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public int mo137901Q(String str) {
        AbstractC19074t.m100208f(str, "tag");
        try {
            return AbstractC27331i.m139914k(m142662r0(str));
        } catch (IllegalArgumentException unused) {
            m142649t0("int");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26817o1
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public long mo137902R(String str) {
        AbstractC19074t.m100208f(str, "tag");
        try {
            return AbstractC27331i.m139919p(m142662r0(str));
        } catch (IllegalArgumentException unused) {
            m142649t0("long");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26817o1
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public short mo137903S(String str) {
        Short sh2;
        AbstractC19074t.m100208f(str, "tag");
        try {
            int m139914k = AbstractC27331i.m139914k(m142662r0(str));
            if (-32768 <= m139914k && m139914k <= 32767) {
                sh2 = Short.valueOf((short) m139914k);
            } else {
                sh2 = null;
            }
            if (sh2 != null) {
                return sh2.shortValue();
            }
            m142649t0("short");
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            m142649t0("short");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26817o1
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public String mo137904T(String str) {
        AbstractC19074t.m100208f(str, "tag");
        JsonPrimitive m142662r0 = m142662r0(str);
        if (!mo139897d().m139869f().m139896m() && !m142647d0(m142662r0, "string").m139943g()) {
            throw AbstractC28309b0.m142641f(-1, "String literal for key '" + str + "' should be quoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", m142648f0().toString());
        }
        if (!(m142662r0 instanceof JsonNull)) {
            return m142662r0.mo114124d();
        }
        throw AbstractC28309b0.m142641f(-1, "Unexpected 'null' value instead of string literal", m142648f0().toString());
    }

    @Override // tn0.AbstractC26817o1, kotlinx.serialization.encoding.Decoder
    /* renamed from: r */
    public Decoder mo113974r(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        if (m137905U() != null) {
            return super.mo113974r(serialDescriptor);
        }
        return new C28315e0(mo139897d(), mo142663s0()).mo113974r(serialDescriptor);
    }

    /* renamed from: r0 */
    protected final JsonPrimitive m142662r0(String str) {
        JsonPrimitive jsonPrimitive;
        AbstractC19074t.m100208f(str, "tag");
        JsonElement mo142650e0 = mo142650e0(str);
        if (mo142650e0 instanceof JsonPrimitive) {
            jsonPrimitive = (JsonPrimitive) mo142650e0;
        } else {
            jsonPrimitive = null;
        }
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        throw AbstractC28309b0.m142641f(-1, "Expected JsonPrimitive at " + str + ", found " + mo142650e0, m142648f0().toString());
    }

    /* renamed from: s0 */
    public abstract JsonElement mo142663s0();

    private AbstractC28310c(AbstractC27323a abstractC27323a, JsonElement jsonElement) {
        this.f132022c = abstractC27323a;
        this.f132023d = jsonElement;
        this.f132024e = mo139897d().m139869f();
    }
}
