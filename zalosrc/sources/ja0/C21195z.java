package ja0;

import android.content.Context;
import android.view.ViewGroup;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import ea0.C18333g1;
import ea0.InterfaceC18319c;
import fn0.AbstractC19074t;
import ia0.AbstractC20484a;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23139m1;
import p354n3.C23528a;
import p612wk.AbstractC29069a;
import p612wk.AbstractC29080l;
import p716zh.C32058p1;
import q80.C25182u;

/* renamed from: ja0.z */
/* loaded from: classes6.dex */
public final class C21195z extends AbstractC20484a {

    /* renamed from: J */
    private AbstractC29069a.k f103345J;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C21195z(ViewGroup viewGroup, C23528a c23528a, final InterfaceC18319c interfaceC18319c) {
        super(viewGroup, new C25182u(r1, c23528a));
        AbstractC19074t.m100208f(viewGroup, "parent");
        AbstractC19074t.m100208f(c23528a, "aQ");
        Context context = viewGroup.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        ((C25182u) m106522i0()).mo89109M0(new C16719g.c() { // from class: ja0.y
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                C21195z.m109752k0(InterfaceC18319c.this, this, c16719g);
            }
        });
    }

    /* renamed from: k0 */
    public static final void m109752k0(InterfaceC18319c interfaceC18319c, C21195z c21195z, C16719g c16719g) {
        AbstractC19074t.m100208f(c21195z, "this$0");
        if (interfaceC18319c != null) {
        }
    }

    /* renamed from: m0 */
    public static /* synthetic */ void m109753m0(C21195z c21195z, AbstractC29069a.k kVar, AbstractC29080l abstractC29080l, boolean z11, Object obj, int i11, Object obj2) {
        if ((i11 & 8) != 0) {
            obj = null;
        }
        c21195z.m109757l0(kVar, abstractC29080l, z11, obj);
    }

    /* renamed from: n0 */
    private final void m109754n0(C25182u c25182u, String str, String str2, String str3, C32058p1 c32058p1, boolean z11) {
        c25182u.m130349r1().f108931U0 = z11;
        if (c32058p1 != null) {
            c25182u.m130349r1().m115437u1(c32058p1.m154671e());
        } else {
            c25182u.m130349r1().m115435s1(str, str2, str3);
        }
    }

    /* renamed from: o0 */
    private final void m109755o0(C25182u c25182u, AbstractC29069a.k kVar) {
        int i11;
        boolean m145171a = AbstractC29069a.Companion.m145171a(kVar.m145190b(), ZVideoUtilMetadata.FF_PROFILE_H264_INTRA);
        if (m145171a) {
            c25182u.m130353v1().m111959G1(kVar.m145188d().f147411b.f42436r1);
            c25182u.m130356y1().m111959G1(kVar.m145188d().f147411b.m40383Q(true, false));
        } else {
            c25182u.m130353v1().m111959G1(kVar.m145188d().f147411b.m40383Q(true, false));
            c25182u.m130356y1().m111959G1(kVar.m145188d().f147411b.f42436r1);
        }
        C22126c0 m130344D1 = c25182u.m130344D1();
        m130344D1.m111959G1(kVar.m145191c());
        if (kVar.m145191c().length() == 0) {
            i11 = 8;
        } else {
            i11 = 4;
        }
        m130344D1.mo44614b1(i11);
        if (m145171a) {
            m109756p0(c25182u, 14.0f);
        } else {
            m109756p0(c25182u, 13.0f);
        }
    }

    /* renamed from: p0 */
    private final void m109756p0(C25182u c25182u, float f11) {
        c25182u.m130356y1().mo111964L1(AbstractC23136l9.m118742r(f11));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0053 A[Catch: Exception -> 0x0012, TRY_LEAVE, TryCatch #0 {Exception -> 0x0012, blocks: (B:15:0x0009, B:5:0x0053, B:3:0x0014), top: B:14:0x0009 }] */
    /* renamed from: l0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m109757l0(AbstractC29069a.k kVar, AbstractC29080l abstractC29080l, boolean z11, Object obj) {
        AbstractC19074t.m100208f(kVar, "data");
        this.f103345J = kVar;
        if (obj != null) {
            try {
                if (AbstractC19074t.m100204b(obj, "PAYLOAD_SCROLL_STATE_CHANGED")) {
                }
                if (obj != null) {
                    m109755o0((C25182u) m106522i0(), kVar);
                    C18333g1.f92667a.m97293j(((C25182u) m106522i0()).m130347p1(), ((C25182u) m106522i0()).m130352u1(), kVar, abstractC29080l);
                    return;
                }
                return;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        C25182u c25182u = (C25182u) m106522i0();
        String m154394a = kVar.m145188d().m154394a();
        AbstractC19074t.m100207e(m154394a, "getUid(...)");
        String str = kVar.m145188d().f147411b.f42446v;
        AbstractC19074t.m100207e(str, "avt");
        C23139m1 c23139m1 = C23139m1.f112256a;
        ContactProfile contactProfile = kVar.m145188d().f147411b;
        AbstractC19074t.m100207e(contactProfile, "profileData");
        m109754n0(c25182u, m154394a, str, c23139m1.m118800q(contactProfile), kVar.m145188d().f147419j, z11);
        if (obj != null) {
        }
    }
}
