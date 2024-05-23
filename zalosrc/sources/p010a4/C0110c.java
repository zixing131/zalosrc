package p010a4;

import p010a4.AbstractC0122o;
import p668y3.AbstractC30277c;
import p668y3.C30276b;
import p668y3.InterfaceC30279e;

/* renamed from: a4.c */
/* loaded from: classes.dex */
final class C0110c extends AbstractC0122o {

    /* renamed from: a */
    private final AbstractC0123p f662a;

    /* renamed from: b */
    private final String f663b;

    /* renamed from: c */
    private final AbstractC30277c f664c;

    /* renamed from: d */
    private final InterfaceC30279e f665d;

    /* renamed from: e */
    private final C30276b f666e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a4.c$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC0122o.a {

        /* renamed from: a */
        private AbstractC0123p f667a;

        /* renamed from: b */
        private String f668b;

        /* renamed from: c */
        private AbstractC30277c f669c;

        /* renamed from: d */
        private InterfaceC30279e f670d;

        /* renamed from: e */
        private C30276b f671e;

        @Override // p010a4.AbstractC0122o.a
        /* renamed from: a */
        public AbstractC0122o mo507a() {
            String str = "";
            if (this.f667a == null) {
                str = " transportContext";
            }
            if (this.f668b == null) {
                str = str + " transportName";
            }
            if (this.f669c == null) {
                str = str + " event";
            }
            if (this.f670d == null) {
                str = str + " transformer";
            }
            if (this.f671e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C0110c(this.f667a, this.f668b, this.f669c, this.f670d, this.f671e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p010a4.AbstractC0122o.a
        /* renamed from: b */
        public AbstractC0122o.a mo508b(C30276b c30276b) {
            if (c30276b != null) {
                this.f671e = c30276b;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p010a4.AbstractC0122o.a
        /* renamed from: c */
        public AbstractC0122o.a mo509c(AbstractC30277c abstractC30277c) {
            if (abstractC30277c != null) {
                this.f669c = abstractC30277c;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p010a4.AbstractC0122o.a
        /* renamed from: d */
        public AbstractC0122o.a mo510d(InterfaceC30279e interfaceC30279e) {
            if (interfaceC30279e != null) {
                this.f670d = interfaceC30279e;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        @Override // p010a4.AbstractC0122o.a
        /* renamed from: e */
        public AbstractC0122o.a mo511e(AbstractC0123p abstractC0123p) {
            if (abstractC0123p != null) {
                this.f667a = abstractC0123p;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        @Override // p010a4.AbstractC0122o.a
        /* renamed from: f */
        public AbstractC0122o.a mo512f(String str) {
            if (str != null) {
                this.f668b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    /* synthetic */ C0110c(AbstractC0123p abstractC0123p, String str, AbstractC30277c abstractC30277c, InterfaceC30279e interfaceC30279e, C30276b c30276b, a aVar) {
        this(abstractC0123p, str, abstractC30277c, interfaceC30279e, c30276b);
    }

    @Override // p010a4.AbstractC0122o
    /* renamed from: b */
    public C30276b mo502b() {
        return this.f666e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p010a4.AbstractC0122o
    /* renamed from: c */
    public AbstractC30277c mo503c() {
        return this.f664c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p010a4.AbstractC0122o
    /* renamed from: e */
    public InterfaceC30279e mo504e() {
        return this.f665d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0122o)) {
            return false;
        }
        AbstractC0122o abstractC0122o = (AbstractC0122o) obj;
        if (this.f662a.equals(abstractC0122o.mo505f()) && this.f663b.equals(abstractC0122o.mo506g()) && this.f664c.equals(abstractC0122o.mo503c()) && this.f665d.equals(abstractC0122o.mo504e()) && this.f666e.equals(abstractC0122o.mo502b())) {
            return true;
        }
        return false;
    }

    @Override // p010a4.AbstractC0122o
    /* renamed from: f */
    public AbstractC0123p mo505f() {
        return this.f662a;
    }

    @Override // p010a4.AbstractC0122o
    /* renamed from: g */
    public String mo506g() {
        return this.f663b;
    }

    public int hashCode() {
        return ((((((((this.f662a.hashCode() ^ 1000003) * 1000003) ^ this.f663b.hashCode()) * 1000003) ^ this.f664c.hashCode()) * 1000003) ^ this.f665d.hashCode()) * 1000003) ^ this.f666e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f662a + ", transportName=" + this.f663b + ", event=" + this.f664c + ", transformer=" + this.f665d + ", encoding=" + this.f666e + "}";
    }

    private C0110c(AbstractC0123p abstractC0123p, String str, AbstractC30277c abstractC30277c, InterfaceC30279e interfaceC30279e, C30276b c30276b) {
        this.f662a = abstractC0123p;
        this.f663b = str;
        this.f664c = abstractC30277c;
        this.f665d = interfaceC30279e;
        this.f666e = c30276b;
    }
}
