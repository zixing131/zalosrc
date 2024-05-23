package p705z5;

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

/* renamed from: z5.cc */
/* loaded from: classes2.dex */
public final class C31336cc implements InterfaceC31517pb {

    /* renamed from: a */
    private InterfaceC0662b f144426a;

    /* renamed from: b */
    private final InterfaceC0662b f144427b;

    /* renamed from: c */
    private final AbstractC31545rb f144428c;

    public C31336cc(Context context, AbstractC31545rb abstractC31545rb) {
        this.f144428c = abstractC31545rb;
        C3994a c3994a = C3994a.f15795g;
        C0128u.m563f(context);
        final InterfaceC30281g m565g = C0128u.m561c().m565g(c3994a);
        if (c3994a.mo528b().contains(C30276b.m149414b("json"))) {
            this.f144426a = new C3358u(new InterfaceC0662b() { // from class: z5.zb
                @Override // p015a9.InterfaceC0662b
                public final Object get() {
                    return InterfaceC30281g.this.mo552a("FIREBASE_ML_SDK", byte[].class, C30276b.m149414b("json"), new InterfaceC30279e() { // from class: z5.bc
                        @Override // p668y3.InterfaceC30279e
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f144427b = new C3358u(new InterfaceC0662b() { // from class: z5.ac
            @Override // p015a9.InterfaceC0662b
            public final Object get() {
                return InterfaceC30281g.this.mo552a("FIREBASE_ML_SDK", byte[].class, C30276b.m149414b("proto"), new InterfaceC30279e() { // from class: z5.yb
                    @Override // p668y3.InterfaceC30279e
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    /* renamed from: b */
    static AbstractC30277c m152218b(AbstractC31545rb abstractC31545rb, InterfaceC31503ob interfaceC31503ob) {
        return AbstractC30277c.m149417e(interfaceC31503ob.mo152327a(abstractC31545rb.mo152323a(), false));
    }

    @Override // p705z5.InterfaceC31517pb
    /* renamed from: a */
    public final void mo152219a(InterfaceC31503ob interfaceC31503ob) {
        if (this.f144428c.mo152323a() == 0) {
            InterfaceC0662b interfaceC0662b = this.f144426a;
            if (interfaceC0662b != null) {
                ((InterfaceC30280f) interfaceC0662b.get()).mo557b(m152218b(this.f144428c, interfaceC31503ob));
                return;
            }
            return;
        }
        ((InterfaceC30280f) this.f144427b.get()).mo557b(m152218b(this.f144428c, interfaceC31503ob));
    }
}
