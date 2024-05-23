package p633x5;

import android.content.Context;
import com.google.android.datatransport.cct.C3994a;
import p010a4.C0128u;
import p015a9.InterfaceC0662b;
import p052c8.C3358u;
import p668y3.C30276b;
import p668y3.InterfaceC30279e;
import p668y3.InterfaceC30281g;

/* renamed from: x5.s0 */
/* loaded from: classes2.dex */
public final class C29369s0 implements InterfaceC29347h0 {

    /* renamed from: a */
    private InterfaceC0662b f135861a;

    /* renamed from: b */
    private final InterfaceC0662b f135862b;

    /* renamed from: c */
    private final AbstractC29351j0 f135863c;

    public C29369s0(Context context, AbstractC29351j0 abstractC29351j0) {
        this.f135863c = abstractC29351j0;
        C3994a c3994a = C3994a.f15795g;
        C0128u.m563f(context);
        final InterfaceC30281g m565g = C0128u.m561c().m565g(c3994a);
        if (c3994a.mo528b().contains(C30276b.m149414b("json"))) {
            this.f135861a = new C3358u(new InterfaceC0662b() { // from class: x5.p0
                @Override // p015a9.InterfaceC0662b
                public final Object get() {
                    return InterfaceC30281g.this.mo552a("FIREBASE_ML_SDK", byte[].class, C30276b.m149414b("json"), new InterfaceC30279e() { // from class: x5.r0
                        @Override // p668y3.InterfaceC30279e
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f135862b = new C3358u(new InterfaceC0662b() { // from class: x5.q0
            @Override // p015a9.InterfaceC0662b
            public final Object get() {
                return InterfaceC30281g.this.mo552a("FIREBASE_ML_SDK", byte[].class, C30276b.m149414b("proto"), new InterfaceC30279e() { // from class: x5.o0
                    @Override // p668y3.InterfaceC30279e
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }
}
