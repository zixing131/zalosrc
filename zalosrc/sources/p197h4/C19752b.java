package p197h4;

import java.util.Map;
import p288k4.InterfaceC21460a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: h4.b */
/* loaded from: classes.dex */
public final class C19752b extends AbstractC19756f {

    /* renamed from: a */
    private final InterfaceC21460a f97852a;

    /* renamed from: b */
    private final Map f97853b;

    public C19752b(InterfaceC21460a interfaceC21460a, Map map) {
        if (interfaceC21460a != null) {
            this.f97852a = interfaceC21460a;
            if (map != null) {
                this.f97853b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p197h4.AbstractC19756f
    /* renamed from: e */
    public InterfaceC21460a mo103467e() {
        return this.f97852a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC19756f)) {
            return false;
        }
        AbstractC19756f abstractC19756f = (AbstractC19756f) obj;
        if (this.f97852a.equals(abstractC19756f.mo103467e()) && this.f97853b.equals(abstractC19756f.mo103468h())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p197h4.AbstractC19756f
    /* renamed from: h */
    public Map mo103468h() {
        return this.f97853b;
    }

    public int hashCode() {
        return ((this.f97852a.hashCode() ^ 1000003) * 1000003) ^ this.f97853b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f97852a + ", values=" + this.f97853b + "}";
    }
}
