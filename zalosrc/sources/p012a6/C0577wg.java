package p012a6;

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

/* renamed from: a6.wg */
/* loaded from: classes2.dex */
public final class C0577wg implements InterfaceC0237eg {

    /* renamed from: a */
    private InterfaceC0662b f2034a;

    /* renamed from: b */
    private final InterfaceC0662b f2035b;

    /* renamed from: c */
    private final AbstractC0275gg f2036c;

    public C0577wg(Context context, AbstractC0275gg abstractC0275gg) {
        this.f2036c = abstractC0275gg;
        C3994a c3994a = C3994a.f15795g;
        C0128u.m563f(context);
        final InterfaceC30281g m565g = C0128u.m561c().m565g(c3994a);
        if (c3994a.mo528b().contains(C30276b.m149414b("json"))) {
            this.f2034a = new C3358u(new InterfaceC0662b() { // from class: a6.tg
                @Override // p015a9.InterfaceC0662b
                public final Object get() {
                    return InterfaceC30281g.this.mo552a("FIREBASE_ML_SDK", byte[].class, C30276b.m149414b("json"), new InterfaceC30279e() { // from class: a6.vg
                        @Override // p668y3.InterfaceC30279e
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f2035b = new C3358u(new InterfaceC0662b() { // from class: a6.ug
            @Override // p015a9.InterfaceC0662b
            public final Object get() {
                return InterfaceC30281g.this.mo552a("FIREBASE_ML_SDK", byte[].class, C30276b.m149414b("proto"), new InterfaceC30279e() { // from class: a6.sg
                    @Override // p668y3.InterfaceC30279e
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    /* renamed from: b */
    static AbstractC30277c m894b(AbstractC0275gg abstractC0275gg, InterfaceC0218dg interfaceC0218dg) {
        int mo650a = abstractC0275gg.mo650a();
        if (interfaceC0218dg.zza() != 0) {
            return AbstractC30277c.m149416d(interfaceC0218dg.mo656a(mo650a, false));
        }
        return AbstractC30277c.m149417e(interfaceC0218dg.mo656a(mo650a, false));
    }

    @Override // p012a6.InterfaceC0237eg
    /* renamed from: a */
    public final void mo693a(InterfaceC0218dg interfaceC0218dg) {
        if (this.f2036c.mo650a() == 0) {
            InterfaceC0662b interfaceC0662b = this.f2034a;
            if (interfaceC0662b != null) {
                ((InterfaceC30280f) interfaceC0662b.get()).mo557b(m894b(this.f2036c, interfaceC0218dg));
                return;
            }
            return;
        }
        ((InterfaceC30280f) this.f2035b.get()).mo557b(m894b(this.f2036c, interfaceC0218dg));
    }
}
