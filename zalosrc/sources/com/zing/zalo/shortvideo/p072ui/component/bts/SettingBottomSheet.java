package com.zing.zalo.shortvideo.p072ui.component.bts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.os.AbstractC1438d;
import com.zing.zalo.shortvideo.data.model.config.BottomSheetItem;
import com.zing.zalo.shortvideo.p072ui.view.FeedBackView;
import com.zing.zalo.shortvideo.p072ui.view.OnboardingPageView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g20.C19205a;
import java.util.ArrayList;
import java.util.List;
import p021an.AbstractC0955d;
import p483rh.InterfaceC25792a;
import p542ub.InterfaceC27218a;
import pm0.AbstractC24856m;
import pm0.AbstractC24866w;
import pm0.InterfaceC24854k;
import q10.C25007g;
import qm0.AbstractC25368s;
import s20.AbstractC26101c;
import v00.AbstractC27413h;
import v00.C27417l;
import w00.AbstractC28684a;
import w10.C28686a;
import w10.C28688c;

/* loaded from: classes5.dex */
public final class SettingBottomSheet extends BaseBottomSheetView implements C28688c.a {
    public static final C9512a Companion = new C9512a(null);

    /* renamed from: M0 */
    private InterfaceC9513b f50451M0;

    /* renamed from: N0 */
    private C28688c f50452N0;

    /* renamed from: O0 */
    private final InterfaceC24854k f50453O0;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.SettingBottomSheet$a */
    /* loaded from: classes5.dex */
    public static final class C9512a {
        private C9512a() {
        }

        public /* synthetic */ C9512a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final SettingBottomSheet m51900a(String str) {
            SettingBottomSheet settingBottomSheet = new SettingBottomSheet();
            settingBottomSheet.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("BTS_ID", str)));
            return settingBottomSheet;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.SettingBottomSheet$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC9513b {
        /* renamed from: a */
        List mo51901a();
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.SettingBottomSheet$c */
    /* loaded from: classes5.dex */
    static final class C9514c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9514c f50454q = new C9514c();

        C9514c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C28686a mo12V4() {
            return AbstractC28684a.Companion.m143680n();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.SettingBottomSheet$d */
    /* loaded from: classes5.dex */
    static final class C9515d extends AbstractC19075u implements InterfaceC18505l {
        C9515d() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo205i9(List list) {
            AbstractC19074t.m100208f(list, "it");
            return AbstractC26101c.m134305f(SettingBottomSheet.this, list);
        }
    }

    public SettingBottomSheet() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(C9514c.f50454q);
        this.f50453O0 = m129210a;
    }

    /* renamed from: iL */
    private final C28686a m51897iL() {
        return (C28686a) this.f50453O0.getValue();
    }

    /* renamed from: jL */
    private final List m51898jL() {
        ArrayList m131500h;
        m131500h = AbstractC25368s.m131500h(AbstractC26101c.m134322w(this), AbstractC26101c.m134312m(this), AbstractC26101c.m134316q(this, C27417l.f129055a.m140378b().m51240m()));
        return m131500h;
    }

    @Override // w10.C28688c.a
    /* renamed from: BF */
    public void mo51817BF(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143733w(this, bottomSheetItem);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m51753XK(true);
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

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        this.f50451M0 = null;
        C28688c c28688c = this.f50452N0;
        if (c28688c != null) {
            c28688c.m143709f(null);
        }
        this.f50452N0 = null;
    }

    @Override // w10.C28688c.a
    /* renamed from: Ju */
    public void mo51821Ju(BottomSheetItem bottomSheetItem) {
        AbstractC19074t.m100208f(bottomSheetItem, "bts");
        InterfaceC25792a interfaceC25792a = (InterfaceC25792a) AbstractC0955d.m4496a(getContext(), AbstractC19061k0.m100169b(InterfaceC25792a.class));
        if (interfaceC25792a != null) {
            InterfaceC27218a m92676n2 = m92676n2();
            String m51414d = bottomSheetItem.m51414d();
            if (m51414d == null) {
                m51414d = C27417l.f129055a.m140378b().m51240m();
            }
            InterfaceC25792a.a.m132931a(interfaceC25792a, "action.open.inapp", 0, m92676n2, m51414d, this, null, null, null, null, 480, null);
        }
        C19205a c19205a = C19205a.f95429a;
        String m92652XI = m92652XI(AbstractC27413h.zch_action_key_setting_tnc);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        C19205a.m100675M(c19205a, m92652XI, null, 2, null);
        dismiss();
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
        AbstractC19074t.m100208f(bottomSheetItem, "bts");
        m55551QK(new OnboardingPageView());
        C19205a c19205a = C19205a.f95429a;
        String m92652XI = m92652XI(AbstractC27413h.zch_action_key_setting_onboarding);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        C19205a.m100675M(c19205a, m92652XI, null, 2, null);
        dismiss();
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

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:            r0 = qm0.AbstractC25332a0.m131187O0(r0);     */
    @Override // com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView
    /* renamed from: WK */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View mo51752WK(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        List arrayList;
        String str;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        LinearLayout root = C25007g.m129816c(layoutInflater, viewGroup, false).getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        C28688c c28688c = new C28688c(root);
        InterfaceC9513b interfaceC9513b = this.f50451M0;
        if (interfaceC9513b == null || (r0 = interfaceC9513b.mo51901a()) == null || arrayList == null) {
            arrayList = new ArrayList();
        }
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            str = m92642L3.getString("BTS_ID");
        } else {
            str = null;
        }
        List m143702e = m51897iL().m143702e(str, arrayList, new C9515d());
        List list = m143702e;
        if (list != null && !list.isEmpty()) {
            C28688c.m143706d(c28688c, m143702e, false, 2, null);
        } else {
            C28688c.m143706d(c28688c, m51898jL(), false, 2, null);
        }
        c28688c.m143709f(this);
        this.f50452N0 = c28688c;
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

    @Override // w10.C28688c.a
    /* renamed from: kI */
    public void mo51831kI(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143734x(this, bottomSheetItem);
    }

    /* renamed from: kL */
    public final void m51899kL(InterfaceC9513b interfaceC9513b) {
        this.f50451M0 = interfaceC9513b;
    }

    @Override // w10.C28688c.a
    /* renamed from: lh */
    public void mo51833lh(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143727q(this, bottomSheetItem);
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
        AbstractC19074t.m100208f(bottomSheetItem, "bts");
        String m51414d = bottomSheetItem.m51414d();
        if (m51414d != null && m51414d.length() != 0) {
            InterfaceC25792a interfaceC25792a = (InterfaceC25792a) AbstractC0955d.m4496a(getContext(), AbstractC19061k0.m100169b(InterfaceC25792a.class));
            if (interfaceC25792a != null) {
                InterfaceC25792a.a.m132931a(interfaceC25792a, "action.open.inapp", 0, m92676n2(), bottomSheetItem.m51414d(), this, null, null, null, null, 480, null);
            }
            dismiss();
        }
    }

    @Override // w10.C28688c.a
    /* renamed from: yx */
    public void mo51843yx(BottomSheetItem bottomSheetItem) {
        AbstractC19074t.m100208f(bottomSheetItem, "bts");
        m55551QK(new FeedBackView());
        C19205a c19205a = C19205a.f95429a;
        String m92652XI = m92652XI(AbstractC27413h.zch_action_key_setting_feedback);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        C19205a.m100675M(c19205a, m92652XI, null, 2, null);
        dismiss();
    }

    @Override // w10.C28688c.a
    /* renamed from: zy */
    public void mo51844zy(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143714d(this, bottomSheetItem);
    }
}
