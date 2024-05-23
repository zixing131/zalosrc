package fn0;

/* renamed from: fn0.z */
/* loaded from: classes7.dex */
public final class C19080z implements InterfaceC19054h {

    /* renamed from: a */
    private final Class f94953a;

    /* renamed from: b */
    private final String f94954b;

    public C19080z(Class cls, String str) {
        AbstractC19074t.m100208f(cls, "jClass");
        AbstractC19074t.m100208f(str, "moduleName");
        this.f94953a = cls;
        this.f94954b = str;
    }

    @Override // fn0.InterfaceC19054h
    /* renamed from: b */
    public Class mo100159b() {
        return this.f94953a;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C19080z) && AbstractC19074t.m100204b(mo100159b(), ((C19080z) obj).mo100159b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return mo100159b().hashCode();
    }

    public String toString() {
        return mo100159b().toString() + " (Kotlin reflection is not available)";
    }
}
