package tn0;

import fn0.AbstractC19074t;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import sn0.AbstractC26338e;

/* renamed from: tn0.g1 */
/* loaded from: classes7.dex */
public final class C26793g1 implements SerialDescriptor {

    /* renamed from: a */
    private final String f126998a;

    /* renamed from: b */
    private final AbstractC26338e f126999b;

    public C26793g1(String str, AbstractC26338e abstractC26338e) {
        AbstractC19074t.m100208f(str, "serialName");
        AbstractC19074t.m100208f(abstractC26338e, "kind");
        this.f126998a = str;
        this.f126999b = abstractC26338e;
    }

    /* renamed from: a */
    private final Void m137837a() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
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
        m137837a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: e */
    public int mo113949e() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26793g1)) {
            return false;
        }
        C26793g1 c26793g1 = (C26793g1) obj;
        if (AbstractC19074t.m100204b(mo113953i(), c26793g1.mo113953i()) && AbstractC19074t.m100204b(mo113948d(), c26793g1.mo113948d())) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: f */
    public String mo113950f(int i11) {
        m137837a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: g */
    public List mo113951g(int i11) {
        m137837a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: h */
    public SerialDescriptor mo113952h(int i11) {
        m137837a();
        throw new KotlinNothingValueException();
    }

    public int hashCode() {
        return mo113953i().hashCode() + (mo113948d().hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i */
    public String mo113953i() {
        return this.f126998a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: j */
    public List mo113954j() {
        return SerialDescriptor.C21879a.m113957a(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: k */
    public boolean mo113955k() {
        return SerialDescriptor.C21879a.m113958b(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: l */
    public boolean mo113956l(int i11) {
        m137837a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC26338e mo113948d() {
        return this.f126999b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + mo113953i() + ')';
    }
}
