package fd0;

import fn0.AbstractC19074t;

/* renamed from: fd0.b */
/* loaded from: classes4.dex */
public final class C18882b {

    /* renamed from: a */
    private final EnumC18887g f94261a;

    /* renamed from: b */
    private final EnumC18886f f94262b;

    public C18882b(EnumC18887g enumC18887g, EnumC18886f enumC18886f) {
        AbstractC19074t.m100208f(enumC18887g, "task");
        AbstractC19074t.m100208f(enumC18886f, "entryPoint");
        this.f94261a = enumC18887g;
        this.f94262b = enumC18886f;
    }

    /* renamed from: a */
    public final EnumC18886f m99002a() {
        return this.f94262b;
    }

    /* renamed from: b */
    public final EnumC18887g m99003b() {
        return this.f94261a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18882b)) {
            return false;
        }
        C18882b c18882b = (C18882b) obj;
        return this.f94261a == c18882b.f94261a && this.f94262b == c18882b.f94262b;
    }

    public int hashCode() {
        return (this.f94261a.hashCode() * 31) + this.f94262b.hashCode();
    }

    public String toString() {
        return "OnCompleteTask(task=" + this.f94261a + ", entryPoint=" + this.f94262b + ")";
    }

    public C18882b() {
        this(EnumC18887g.f94279p, EnumC18886f.f94270p);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18882b(EnumC18887g enumC18887g) {
        this(enumC18887g, EnumC18886f.f94270p);
        AbstractC19074t.m100208f(enumC18887g, "task");
    }
}
