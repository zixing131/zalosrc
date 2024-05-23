package com.zing.zalo.shortvideo.p072ui.component.bts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.os.AbstractC1438d;
import com.zing.zalo.shortvideo.data.model.config.BottomSheetItem;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.VideoLayout;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g20.C19205a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p021an.AbstractC0955d;
import p227i3.C20218v;
import p483rh.InterfaceC25792a;
import pm0.AbstractC24856m;
import pm0.AbstractC24866w;
import pm0.InterfaceC24854k;
import q10.C25007g;
import qm0.AbstractC25332a0;
import qm0.AbstractC25361o0;
import qm0.AbstractC25368s;
import s20.AbstractC26101c;
import s20.AbstractC26102d;
import v00.AbstractC27413h;
import w00.AbstractC28684a;
import w10.C28686a;
import w10.C28688c;

/* loaded from: classes5.dex */
public final class VideoActionBottomSheet extends BaseBottomSheetView implements C28688c.a {
    public static final C9527b Companion = new C9527b(null);

    /* renamed from: M0 */
    private C28688c f50483M0;

    /* renamed from: N0 */
    private final InterfaceC24854k f50484N0;

    /* renamed from: O0 */
    private InterfaceC9526a f50485O0;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.VideoActionBottomSheet$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC9526a {
        /* renamed from: a */
        List mo51945a();

        /* renamed from: b */
        void mo51946b();

        /* renamed from: c */
        void mo51947c();

        /* renamed from: d */
        void mo51948d(String str);

        /* renamed from: e */
        void mo51949e();

        /* renamed from: f */
        void mo51950f();

        /* renamed from: g */
        void mo51951g(boolean z11);

        /* renamed from: h */
        void mo51952h();

        /* renamed from: i */
        void mo51953i(boolean z11);

        /* renamed from: j */
        void mo51954j();
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.VideoActionBottomSheet$b */
    /* loaded from: classes5.dex */
    public static final class C9527b {
        private C9527b() {
        }

        public /* synthetic */ C9527b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final VideoActionBottomSheet m51955a(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, Boolean bool, String str) {
            VideoActionBottomSheet videoActionBottomSheet = new VideoActionBottomSheet();
            Bundle m7341b = AbstractC1438d.m7341b(AbstractC24866w.m129235a("CAN_SHARE", Boolean.valueOf(z11)), AbstractC24866w.m129235a("CAN_UNINTERESTED", Boolean.valueOf(z12)), AbstractC24866w.m129235a("CAN_REPORT", Boolean.valueOf(z13)), AbstractC24866w.m129235a("CAN_PIN", Boolean.valueOf(z14)), AbstractC24866w.m129235a("CAN_UNPIN", Boolean.valueOf(z15)), AbstractC24866w.m129235a("CAN_DELETE", Boolean.valueOf(z16)), AbstractC24866w.m129235a("BOOKMARK", Boolean.valueOf(z17)), AbstractC24866w.m129235a("BTS_ID", str));
            if (bool != null) {
                AbstractC26102d.m134326a(m7341b, "LOCK_COMMENT", Boolean.valueOf(bool.booleanValue()));
            }
            videoActionBottomSheet.mo60305zK(m7341b);
            return videoActionBottomSheet;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.VideoActionBottomSheet$c */
    /* loaded from: classes5.dex */
    public static final class C9528c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9528c f50486q = new C9528c();

        C9528c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C28686a mo12V4() {
            return AbstractC28684a.Companion.m143680n();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.VideoActionBottomSheet$d */
    /* loaded from: classes5.dex */
    static final class C9529d extends AbstractC19075u implements InterfaceC18505l {
        C9529d() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final List mo205i9(List list) {
            AbstractC19074t.m100208f(list, "it");
            return AbstractC26101c.m134305f(VideoActionBottomSheet.this, list);
        }
    }

    public VideoActionBottomSheet() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(C9528c.f50486q);
        this.f50484N0 = m129210a;
    }

    /* renamed from: iL */
    private final C28686a m51942iL() {
        return (C28686a) this.f50484N0.getValue();
    }

    /* renamed from: jL */
    private final List m51943jL(boolean z11) {
        ArrayList m131500h;
        List m131202b0;
        ArrayList m131500h2;
        List m131202b02;
        if (z11) {
            m131500h2 = AbstractC25368s.m131500h(AbstractC26101c.m134321v(this), AbstractC26101c.m134325z(this), AbstractC26101c.m134319t(this));
            m131202b02 = AbstractC25332a0.m131202b0(m131500h2);
            return m131202b02;
        }
        m131500h = AbstractC25368s.m131500h(AbstractC26101c.m134303d(this), AbstractC26101c.m134321v(this), AbstractC26101c.m134301b(this, VideoLayout.Companion.m52630a()), AbstractC26101c.m134324y(this), AbstractC26101c.m134325z(this), AbstractC26101c.m134319t(this), AbstractC26101c.m134313n(this), AbstractC26101c.m134315p(this), AbstractC26101c.m134299B(this), AbstractC26101c.m134310k(this));
        m131202b0 = AbstractC25332a0.m131202b0(m131500h);
        return m131202b0;
    }

    @Override // w10.C28688c.a
    /* renamed from: BF */
    public void mo51817BF(BottomSheetItem bottomSheetItem) {
        AbstractC19074t.m100208f(bottomSheetItem, "bts");
        InterfaceC9526a interfaceC9526a = this.f50485O0;
        if (interfaceC9526a != null) {
            interfaceC9526a.mo51954j();
        }
        dismiss();
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

    @Override // com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        C28688c c28688c = this.f50483M0;
        if (c28688c != null) {
            c28688c.m143709f(null);
        }
        this.f50483M0 = null;
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
        AbstractC19074t.m100208f(bottomSheetItem, "bts");
        InterfaceC9526a interfaceC9526a = this.f50485O0;
        if (interfaceC9526a != null) {
            interfaceC9526a.mo51952h();
        }
        dismiss();
    }

    @Override // w10.C28688c.a
    /* renamed from: Mt */
    public void mo51824Mt(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143710A(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: Ok */
    public void mo51825Ok(BottomSheetItem bottomSheetItem) {
        Boolean bool;
        AbstractC19074t.m100208f(bottomSheetItem, "bts");
        if (bottomSheetItem.m51414d() != null) {
            bool = Boolean.valueOf(Boolean.parseBoolean(bottomSheetItem.m51414d()));
        } else {
            bool = null;
        }
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            InterfaceC9526a interfaceC9526a = this.f50485O0;
            if (interfaceC9526a != null) {
                interfaceC9526a.mo51953i(booleanValue);
            }
        }
        dismiss();
    }

    @Override // w10.C28688c.a
    /* renamed from: Uq */
    public void mo51826Uq(BottomSheetItem bottomSheetItem) {
        boolean z11;
        AbstractC19074t.m100208f(bottomSheetItem, "bts");
        if (Boolean.parseBoolean(bottomSheetItem.m51414d())) {
            z11 = true;
        } else {
            z11 = false;
        }
        InterfaceC9526a interfaceC9526a = this.f50485O0;
        if (interfaceC9526a != null) {
            interfaceC9526a.mo51951g(!z11);
        }
        dismiss();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:            r7 = qm0.AbstractC25332a0.m131187O0(r7);     */
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
        InterfaceC9526a interfaceC9526a = this.f50485O0;
        if (interfaceC9526a == null || (r7 = interfaceC9526a.mo51945a()) == null || arrayList == null) {
            arrayList = new ArrayList();
        }
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            str = m92642L3.getString("BTS_ID");
        } else {
            str = null;
        }
        boolean m100204b = AbstractC19074t.m100204b(str, "9");
        List m143702e = m51942iL().m143702e(str, arrayList, new C9529d());
        List list = m143702e;
        if (list != null && !list.isEmpty()) {
            c28688c.m143708c(m143702e, m100204b);
        } else {
            c28688c.m143708c(m51943jL(m100204b), m100204b);
        }
        c28688c.m143709f(this);
        this.f50483M0 = c28688c;
        return root;
    }

    @Override // w10.C28688c.a
    /* renamed from: cA */
    public void mo51827cA(View view, BottomSheetItem bottomSheetItem) {
        boolean z11;
        Map m131401f;
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        AbstractC19074t.m100208f(bottomSheetItem, "bts");
        if (Boolean.parseBoolean(bottomSheetItem.m51414d())) {
            z11 = true;
        } else {
            z11 = false;
        }
        VideoLayout.C9752a c9752a = VideoLayout.Companion;
        c9752a.m52631b(!z11);
        dismiss();
        C19205a c19205a = C19205a.f95429a;
        String m92652XI = m92652XI(AbstractC27413h.zch_action_key_auto_swipe_toggle);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("change_to", Integer.valueOf(c9752a.m52630a() ? 1 : 0)));
        c19205a.m100713L(m92652XI, m131401f);
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
        AbstractC19074t.m100208f(bottomSheetItem, "bts");
        InterfaceC9526a interfaceC9526a = this.f50485O0;
        if (interfaceC9526a != null) {
            interfaceC9526a.mo51946b();
        }
        dismiss();
    }

    @Override // w10.C28688c.a
    /* renamed from: kI */
    public void mo51831kI(BottomSheetItem bottomSheetItem) {
        AbstractC19074t.m100208f(bottomSheetItem, "bts");
        InterfaceC9526a interfaceC9526a = this.f50485O0;
        if (interfaceC9526a != null) {
            interfaceC9526a.mo51950f();
        }
        dismiss();
    }

    /* renamed from: kL */
    public final void m51944kL(InterfaceC9526a interfaceC9526a) {
        this.f50485O0 = interfaceC9526a;
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
        boolean z11;
        AbstractC19074t.m100208f(bottomSheetItem, "bts");
        if (Boolean.parseBoolean(bottomSheetItem.m51414d())) {
            z11 = true;
        } else {
            z11 = false;
        }
        InterfaceC9526a interfaceC9526a = this.f50485O0;
        if (interfaceC9526a != null) {
            interfaceC9526a.mo51951g(!z11);
        }
        dismiss();
    }

    @Override // w10.C28688c.a
    /* renamed from: rq */
    public void mo51837rq(BottomSheetItem bottomSheetItem) {
        AbstractC19074t.m100208f(bottomSheetItem, "bts");
        InterfaceC9526a interfaceC9526a = this.f50485O0;
        if (interfaceC9526a != null) {
            interfaceC9526a.mo51948d(bottomSheetItem.m51414d());
        }
        dismiss();
    }

    @Override // w10.C28688c.a
    /* renamed from: sx */
    public void mo51838sx(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143735y(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: u5 */
    public void mo51839u5(BottomSheetItem bottomSheetItem) {
        AbstractC19074t.m100208f(bottomSheetItem, "bts");
        InterfaceC9526a interfaceC9526a = this.f50485O0;
        if (interfaceC9526a != null) {
            interfaceC9526a.mo51949e();
        }
        dismiss();
    }

    @Override // w10.C28688c.a
    /* renamed from: wd */
    public void mo51840wd(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143731u(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: wu */
    public void mo51841wu(BottomSheetItem bottomSheetItem) {
        AbstractC19074t.m100208f(bottomSheetItem, "bts");
        InterfaceC9526a interfaceC9526a = this.f50485O0;
        if (interfaceC9526a != null) {
            interfaceC9526a.mo51947c();
        }
        dismiss();
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
        C28688c.a.C33019a.m143718h(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: zy */
    public void mo51844zy(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143714d(this, bottomSheetItem);
    }
}
