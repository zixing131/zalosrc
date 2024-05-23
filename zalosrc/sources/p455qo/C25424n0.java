package p455qo;

import bo.C3000l0;
import bo.C3003l3;
import bo.C3020p0;
import com.zing.zalo.control.ItemAlbumMobile;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import on0.AbstractC24340u;
import p185gc.AbstractC19383g;
import p363nh.C23744a;
import p398oo.C24371m0;
import p455qo.C25422m0;

/* renamed from: qo.n0 */
/* loaded from: classes4.dex */
public final class C25424n0 extends AbstractC19383g {

    /* renamed from: a */
    private final C24371m0 f121722a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qo.n0$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ ItemAlbumMobile f121723q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ItemAlbumMobile itemAlbumMobile) {
            super(2);
            this.f121723q = itemAlbumMobile;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo240pC(C3020p0 c3020p0, C3000l0 c3000l0) {
            boolean z11;
            AbstractC19074t.m100208f(c3020p0, "feedItem");
            AbstractC19074t.m100208f(c3000l0, "<anonymous parameter 1>");
            if (c3020p0.f12059r.f11956a != this.f121723q.m40501J()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                c3020p0.f12059r = new C3003l3(this.f121723q.m40502K());
            }
            return Boolean.valueOf(z11);
        }
    }

    public C25424n0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: d */
    private final void m131702d(ItemAlbumMobile itemAlbumMobile) {
        C24371m0 c24371m0 = this.f121722a;
        String str = itemAlbumMobile.f42599t;
        AbstractC19074t.m100207e(str, "feedid");
        c24371m0.m127481s(str, new a(itemAlbumMobile));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(ItemAlbumMobile itemAlbumMobile) {
        Integer m127107m;
        int i11;
        AbstractC19074t.m100208f(itemAlbumMobile, "params");
        String str = itemAlbumMobile.f42599t;
        AbstractC19074t.m100207e(str, "feedid");
        if (str.length() == 0) {
            return;
        }
        C25422m0 c25422m0 = new C25422m0(null, null, 3, null);
        String str2 = itemAlbumMobile.f42599t;
        AbstractC19074t.m100207e(str2, "feedid");
        String str3 = itemAlbumMobile.f42560K;
        AbstractC19074t.m100207e(str3, "total_like");
        m127107m = AbstractC24340u.m127107m(str3);
        if (m127107m != null) {
            i11 = m127107m.intValue();
        } else {
            i11 = 0;
        }
        c25422m0.m101508a(new C25422m0.a(str2, i11, AbstractC19074t.m100204b(itemAlbumMobile.f42552E, "1"), itemAlbumMobile.f42562M, itemAlbumMobile.f42563N, false, false));
        m131702d(itemAlbumMobile);
        C23744a.Companion.m124119a().m124116d(6014, itemAlbumMobile.f42599t);
    }

    public C25424n0(C24371m0 c24371m0) {
        AbstractC19074t.m100208f(c24371m0, "timelineRepo");
        this.f121722a = c24371m0;
    }

    public /* synthetic */ C25424n0(C24371m0 c24371m0, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24371m0.Companion.m127483a() : c24371m0);
    }
}
