package tn0;

import fn0.AbstractC19074t;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import sn0.AbstractC26341h;
import sn0.AbstractC26342i;

/* renamed from: tn0.t0 */
/* loaded from: classes7.dex */
public final class C26831t0 implements SerialDescriptor {

    /* renamed from: a */
    public static final C26831t0 f127078a = new C26831t0();

    /* renamed from: b */
    private static final AbstractC26341h f127079b = AbstractC26342i.d.f125059a;

    /* renamed from: c */
    private static final String f127080c = "kotlin.Nothing";

    private C26831t0() {
    }

    /* renamed from: a */
    private final Void m137964a() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
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
        m137964a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: d */
    public AbstractC26341h mo113948d() {
        return f127079b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: e */
    public int mo113949e() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: f */
    public String mo113950f(int i11) {
        m137964a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: g */
    public List mo113951g(int i11) {
        m137964a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: h */
    public SerialDescriptor mo113952h(int i11) {
        m137964a();
        throw new KotlinNothingValueException();
    }

    public int hashCode() {
        return mo113953i().hashCode() + (mo113948d().hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i */
    public String mo113953i() {
        return f127080c;
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
        m137964a();
        throw new KotlinNothingValueException();
    }

    public String toString() {
        return "NothingSerialDescriptor";
    }
}
