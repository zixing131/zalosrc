package p030b4;

import android.content.Context;
import p288k4.InterfaceC21460a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b4.c */
/* loaded from: classes.dex */
public final class C2509c extends AbstractC2514h {

    /* renamed from: a */
    private final Context f10213a;

    /* renamed from: b */
    private final InterfaceC21460a f10214b;

    /* renamed from: c */
    private final InterfaceC21460a f10215c;

    /* renamed from: d */
    private final String f10216d;

    public C2509c(Context context, InterfaceC21460a interfaceC21460a, InterfaceC21460a interfaceC21460a2, String str) {
        if (context != null) {
            this.f10213a = context;
            if (interfaceC21460a != null) {
                this.f10214b = interfaceC21460a;
                if (interfaceC21460a2 != null) {
                    this.f10215c = interfaceC21460a2;
                    if (str != null) {
                        this.f10216d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    @Override // p030b4.AbstractC2514h
    /* renamed from: b */
    public Context mo12595b() {
        return this.f10213a;
    }

    @Override // p030b4.AbstractC2514h
    /* renamed from: c */
    public String mo12596c() {
        return this.f10216d;
    }

    @Override // p030b4.AbstractC2514h
    /* renamed from: d */
    public InterfaceC21460a mo12597d() {
        return this.f10215c;
    }

    @Override // p030b4.AbstractC2514h
    /* renamed from: e */
    public InterfaceC21460a mo12598e() {
        return this.f10214b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2514h)) {
            return false;
        }
        AbstractC2514h abstractC2514h = (AbstractC2514h) obj;
        if (this.f10213a.equals(abstractC2514h.mo12595b()) && this.f10214b.equals(abstractC2514h.mo12598e()) && this.f10215c.equals(abstractC2514h.mo12597d()) && this.f10216d.equals(abstractC2514h.mo12596c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f10213a.hashCode() ^ 1000003) * 1000003) ^ this.f10214b.hashCode()) * 1000003) ^ this.f10215c.hashCode()) * 1000003) ^ this.f10216d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f10213a + ", wallClock=" + this.f10214b + ", monotonicClock=" + this.f10215c + ", backendName=" + this.f10216d + "}";
    }
}
