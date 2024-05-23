package p670y5;

import android.content.Context;
import com.google.android.datatransport.cct.C3994a;
import p010a4.C0128u;
import p015a9.InterfaceC0662b;
import p052c8.C3358u;
import p668y3.AbstractC30277c;
import p668y3.C30276b;
import p668y3.InterfaceC30279e;
import p668y3.InterfaceC30280f;
import p668y3.InterfaceC30281g;

/* renamed from: y5.vg */
/* loaded from: classes2.dex */
public final class C30713vg implements InterfaceC30371dg {

    /* renamed from: a */
    private InterfaceC0662b f141944a;

    /* renamed from: b */
    private final InterfaceC0662b f141945b;

    /* renamed from: c */
    private final AbstractC30409fg f141946c;

    public C30713vg(Context context, AbstractC30409fg abstractC30409fg) {
        this.f141946c = abstractC30409fg;
        C3994a c3994a = C3994a.f15795g;
        C0128u.m563f(context);
        final InterfaceC30281g m565g = C0128u.m561c().m565g(c3994a);
        if (c3994a.mo528b().contains(C30276b.m149414b("json"))) {
            this.f141944a = new C3358u(new InterfaceC0662b() { // from class: y5.sg
                @Override // p015a9.InterfaceC0662b
                public final Object get() {
                    return InterfaceC30281g.this.mo552a("FIREBASE_ML_SDK", byte[].class, C30276b.m149414b("json"), new InterfaceC30279e() { // from class: y5.ug
                        @Override // p668y3.InterfaceC30279e
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f141945b = new C3358u(new InterfaceC0662b() { // from class: y5.tg
            @Override // p015a9.InterfaceC0662b
            public final Object get() {
                return InterfaceC30281g.this.mo552a("FIREBASE_ML_SDK", byte[].class, C30276b.m149414b("proto"), new InterfaceC30279e() { // from class: y5.rg
                    @Override // p668y3.InterfaceC30279e
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    /* renamed from: b */
    static AbstractC30277c m149681b(AbstractC30409fg abstractC30409fg, InterfaceC30352cg interfaceC30352cg) {
        int mo149458a = abstractC30409fg.mo149458a();
        if (interfaceC30352cg.zza() != 0) {
            return AbstractC30277c.m149416d(interfaceC30352cg.mo149472a(mo149458a, false));
        }
        return AbstractC30277c.m149417e(interfaceC30352cg.mo149472a(mo149458a, false));
    }

    @Override // p670y5.InterfaceC30371dg
    /* renamed from: a */
    public final void mo149479a(InterfaceC30352cg interfaceC30352cg) {
        if (this.f141946c.mo149458a() == 0) {
            InterfaceC0662b interfaceC0662b = this.f141944a;
            if (interfaceC0662b != null) {
                ((InterfaceC30280f) interfaceC0662b.get()).mo557b(m149681b(this.f141946c, interfaceC30352cg));
                return;
            }
            return;
        }
        ((InterfaceC30280f) this.f141945b.get()).mo557b(m149681b(this.f141946c, interfaceC30352cg));
    }
}
