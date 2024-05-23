package p441q9;

import p015a9.InterfaceC0662b;
import p319l9.C22152a;
import p507s9.C26192i;
import p668y3.AbstractC30277c;
import p668y3.C30276b;
import p668y3.InterfaceC30279e;
import p668y3.InterfaceC30280f;
import p668y3.InterfaceC30281g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q9.b */
/* loaded from: classes3.dex */
public final class C25188b {

    /* renamed from: d */
    private static final C22152a f120870d = C22152a.m115524e();

    /* renamed from: a */
    private final String f120871a;

    /* renamed from: b */
    private final InterfaceC0662b f120872b;

    /* renamed from: c */
    private InterfaceC30280f f120873c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C25188b(InterfaceC0662b interfaceC0662b, String str) {
        this.f120871a = str;
        this.f120872b = interfaceC0662b;
    }

    /* renamed from: a */
    private boolean m130381a() {
        if (this.f120873c == null) {
            InterfaceC30281g interfaceC30281g = (InterfaceC30281g) this.f120872b.get();
            if (interfaceC30281g != null) {
                this.f120873c = interfaceC30281g.mo552a(this.f120871a, C26192i.class, C30276b.m149414b("proto"), new InterfaceC30279e() { // from class: q9.a
                    @Override // p668y3.InterfaceC30279e
                    public final Object apply(Object obj) {
                        return ((C26192i) obj).m34715p();
                    }
                });
            } else {
                f120870d.m115533j("Flg TransportFactory is not available at the moment");
            }
        }
        if (this.f120873c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m130382b(C26192i c26192i) {
        if (!m130381a()) {
            f120870d.m115533j("Unable to dispatch event because Flg Transport is not available");
        } else {
            this.f120873c.mo557b(AbstractC30277c.m149416d(c26192i));
        }
    }
}
