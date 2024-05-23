package com.zing.zalo.shortvideo.p072ui.component.bts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b10.EnumC2485d;
import com.zing.zalo.shortvideo.data.model.config.BottomSheetItem;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import q10.C25007g;
import qm0.AbstractC25368s;
import w10.C28688c;

/* loaded from: classes5.dex */
public final class LivestreamBottomSheet extends BaseBottomSheetView implements C28688c.a {
    public static final C9508b Companion = new C9508b(null);

    /* renamed from: M0 */
    private C28688c f50441M0;

    /* renamed from: N0 */
    private InterfaceC9507a f50442N0;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.LivestreamBottomSheet$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC9507a {
        /* renamed from: a */
        void mo51882a();
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.LivestreamBottomSheet$b */
    /* loaded from: classes5.dex */
    public static final class C9508b {
        private C9508b() {
        }

        public /* synthetic */ C9508b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final LivestreamBottomSheet m51883a() {
            return new LivestreamBottomSheet();
        }
    }

    /* renamed from: iL */
    private final List m51880iL() {
        List m131506n;
        m131506n = AbstractC25368s.m131506n(new BottomSheetItem(Integer.valueOf(EnumC2485d.f10157Q.m12552c()), (String) null, (String) null, (String) null, 14, (AbstractC19060k) null));
        return m131506n;
    }

    @Override // w10.C28688c.a
    /* renamed from: BF */
    public void mo51817BF(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143733w(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: Cb */
    public void mo51818Cb(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143729s(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: Gm */
    public void mo51819Gm(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143720j(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: II */
    public void mo51820II(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143717g(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: Ju */
    public void mo51821Ju(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143724n(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: Lc */
    public void mo51822Lc(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143726p(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: Mc */
    public void mo51823Mc(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143722l(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: Mt */
    public void mo51824Mt(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143710A(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: Ok */
    public void mo51825Ok(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143721k(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: Uq */
    public void mo51826Uq(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143732v(this, bottomSheetItem);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView
    /* renamed from: WK */
    public View mo51752WK(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        LinearLayout root = C25007g.m129816c(layoutInflater, viewGroup, false).getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        C28688c c28688c = new C28688c(root);
        C28688c.m143706d(c28688c, m51880iL(), false, 2, null);
        c28688c.m143709f(this);
        this.f50441M0 = c28688c;
        return root;
    }

    @Override // w10.C28688c.a
    /* renamed from: cA */
    public void mo51827cA(View view, BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143712b(this, view, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: gx */
    public void mo51828gx(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143723m(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: hb */
    public void mo51829hb(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143725o(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: hc */
    public void mo51830hc(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143715e(this, bottomSheetItem);
    }

    /* renamed from: jL */
    public final void m51881jL(InterfaceC9507a interfaceC9507a) {
        this.f50442N0 = interfaceC9507a;
    }

    @Override // w10.C28688c.a
    /* renamed from: kI */
    public void mo51831kI(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143734x(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: lh */
    public void mo51833lh(BottomSheetItem bottomSheetItem) {
        AbstractC19074t.m100208f(bottomSheetItem, "bts");
        InterfaceC9507a interfaceC9507a = this.f50442N0;
        if (interfaceC9507a != null) {
            interfaceC9507a.mo51882a();
        }
        dismiss();
    }

    @Override // w10.C28688c.a
    /* renamed from: mC */
    public void mo51834mC(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143711a(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: o6 */
    public void mo51835o6(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143716f(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: oh */
    public void mo51836oh(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143713c(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: rq */
    public void mo51837rq(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143728r(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: sx */
    public void mo51838sx(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143735y(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: u5 */
    public void mo51839u5(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143736z(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: wd */
    public void mo51840wd(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143731u(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: wu */
    public void mo51841wu(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143730t(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: x8 */
    public void mo51842x8(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143719i(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: yx */
    public void mo51843yx(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143718h(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: zy */
    public void mo51844zy(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143714d(this, bottomSheetItem);
    }
}
