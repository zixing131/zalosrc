package p668y3;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y3.a */
/* loaded from: classes.dex */
public final class C30275a extends AbstractC30277c {

    /* renamed from: a */
    private final Integer f140649a;

    /* renamed from: b */
    private final Object f140650b;

    /* renamed from: c */
    private final EnumC30278d f140651c;

    public C30275a(Integer num, Object obj, EnumC30278d enumC30278d) {
        this.f140649a = num;
        if (obj != null) {
            this.f140650b = obj;
            if (enumC30278d != null) {
                this.f140651c = enumC30278d;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    @Override // p668y3.AbstractC30277c
    /* renamed from: a */
    public Integer mo149411a() {
        return this.f140649a;
    }

    @Override // p668y3.AbstractC30277c
    /* renamed from: b */
    public Object mo149412b() {
        return this.f140650b;
    }

    @Override // p668y3.AbstractC30277c
    /* renamed from: c */
    public EnumC30278d mo149413c() {
        return this.f140651c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC30277c)) {
            return false;
        }
        AbstractC30277c abstractC30277c = (AbstractC30277c) obj;
        Integer num = this.f140649a;
        if (num != null ? num.equals(abstractC30277c.mo149411a()) : abstractC30277c.mo149411a() == null) {
            if (this.f140650b.equals(abstractC30277c.mo149412b()) && this.f140651c.equals(abstractC30277c.mo149413c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.f140649a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return ((((hashCode ^ 1000003) * 1000003) ^ this.f140650b.hashCode()) * 1000003) ^ this.f140651c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f140649a + ", payload=" + this.f140650b + ", priority=" + this.f140651c + "}";
    }
}
