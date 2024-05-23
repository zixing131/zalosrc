package com.zing.zalo.shortvideo.p072ui.component.bts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.os.AbstractC1438d;
import com.zing.zalo.shortvideo.data.model.config.BottomSheetItem;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.List;
import p021an.AbstractC0955d;
import p483rh.InterfaceC25792a;
import pm0.AbstractC24856m;
import pm0.AbstractC24866w;
import pm0.InterfaceC24854k;
import q10.C25007g;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import s20.AbstractC26101c;
import w00.AbstractC28684a;
import w10.C28686a;
import w10.C28688c;

/* loaded from: classes5.dex */
public final class ChannelActionBottomSheet extends BaseBottomSheetView implements C28688c.a {
    public static final C9495b Companion = new C9495b(null);

    /* renamed from: M0 */
    private C28688c f50429M0;

    /* renamed from: N0 */
    private final InterfaceC24854k f50430N0;

    /* renamed from: O0 */
    private InterfaceC9494a f50431O0;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.ChannelActionBottomSheet$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC9494a {
        /* renamed from: a */
        List mo51845a();

        /* renamed from: c */
        void mo51846c();

        /* renamed from: d */
        void mo51847d(String str);

        /* renamed from: e */
        void mo51848e();

        /* renamed from: f */
        void mo51849f();

        /* renamed from: g */
        void mo51850g();

        /* renamed from: h */
        void mo51851h(String str);
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.ChannelActionBottomSheet$b */
    /* loaded from: classes5.dex */
    public static final class C9495b {
        private C9495b() {
        }

        public /* synthetic */ C9495b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final ChannelActionBottomSheet m51852a(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, String str) {
            ChannelActionBottomSheet channelActionBottomSheet = new ChannelActionBottomSheet();
            channelActionBottomSheet.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("CAN_SHARE", Boolean.valueOf(z11)), AbstractC24866w.m129235a("CAN_BLOCK", Boolean.valueOf(z12)), AbstractC24866w.m129235a("CAN_UNBLOCK", Boolean.valueOf(z13)), AbstractC24866w.m129235a("CAN_REPORT", Boolean.valueOf(z14)), AbstractC24866w.m129235a("CAN_ANALYTIC", Boolean.valueOf(z15)), AbstractC24866w.m129235a("CAN_EDIT", Boolean.valueOf(z16)), AbstractC24866w.m129235a("BTS_ID", str)));
            return channelActionBottomSheet;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.ChannelActionBottomSheet$c */
    /* loaded from: classes5.dex */
    static final class C9496c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9496c f50432q = new C9496c();

        C9496c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C28686a mo12V4() {
            return AbstractC28684a.Companion.m143680n();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.ChannelActionBottomSheet$d */
    /* loaded from: classes5.dex */
    static final class C9497d extends AbstractC19075u implements InterfaceC18505l {
        C9497d() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo205i9(List list) {
            AbstractC19074t.m100208f(list, "it");
            return AbstractC26101c.m134305f(ChannelActionBottomSheet.this, list);
        }
    }

    public ChannelActionBottomSheet() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(C9496c.f50432q);
        this.f50430N0 = m129210a;
    }

    /* renamed from: iL */
    private final C28686a m51815iL() {
        return (C28686a) this.f50430N0.getValue();
    }

    /* renamed from: jL */
    private final List m51816jL() {
        ArrayList m131500h;
        List m131202b0;
        m131500h = AbstractC25368s.m131500h(AbstractC26101c.m134320u(this), AbstractC26101c.m134302c(this), AbstractC26101c.m134323x(this), AbstractC26101c.m134317r(this), AbstractC26101c.m134300a(this), AbstractC26101c.m134311l(this));
        m131202b0 = AbstractC25332a0.m131202b0(m131500h);
        return m131202b0;
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
        AbstractC19074t.m100208f(bottomSheetItem, "bts");
        InterfaceC9494a interfaceC9494a = this.f50431O0;
        if (interfaceC9494a != null) {
            interfaceC9494a.mo51846c();
        }
        dismiss();
    }

    @Override // w10.C28688c.a
    /* renamed from: Gm */
    public void mo51819Gm(BottomSheetItem bottomSheetItem) {
        AbstractC19074t.m100208f(bottomSheetItem, "bts");
        InterfaceC9494a interfaceC9494a = this.f50431O0;
        if (interfaceC9494a != null) {
            interfaceC9494a.mo51849f();
        }
        dismiss();
    }

    @Override // w10.C28688c.a
    /* renamed from: II */
    public void mo51820II(BottomSheetItem bottomSheetItem) {
        AbstractC19074t.m100208f(bottomSheetItem, "bts");
        InterfaceC9494a interfaceC9494a = this.f50431O0;
        if (interfaceC9494a != null) {
            interfaceC9494a.mo51850g();
        }
        dismiss();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        C28688c c28688c = this.f50429M0;
        if (c28688c != null) {
            c28688c.m143709f(null);
        }
        this.f50429M0 = null;
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
        InterfaceC9494a interfaceC9494a = this.f50431O0;
        if (interfaceC9494a == null || (r0 = interfaceC9494a.mo51845a()) == null || arrayList == null) {
            arrayList = new ArrayList();
        }
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            str = m92642L3.getString("BTS_ID");
        } else {
            str = null;
        }
        List m143702e = m51815iL().m143702e(str, arrayList, new C9497d());
        List list = m143702e;
        if (list != null && !list.isEmpty()) {
            C28688c.m143706d(c28688c, m143702e, false, 2, null);
        } else {
            C28688c.m143706d(c28688c, m51816jL(), false, 2, null);
        }
        c28688c.m143709f(this);
        this.f50429M0 = c28688c;
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
        AbstractC19074t.m100208f(bottomSheetItem, "bts");
        InterfaceC9494a interfaceC9494a = this.f50431O0;
        if (interfaceC9494a != null) {
            interfaceC9494a.mo51847d(bottomSheetItem.m51414d());
        }
        dismiss();
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
    public final void m51832kL(InterfaceC9494a interfaceC9494a) {
        this.f50431O0 = interfaceC9494a;
    }

    @Override // w10.C28688c.a
    /* renamed from: lh */
    public void mo51833lh(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143727q(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: mC */
    public void mo51834mC(BottomSheetItem bottomSheetItem) {
        AbstractC19074t.m100208f(bottomSheetItem, "bts");
        InterfaceC9494a interfaceC9494a = this.f50431O0;
        if (interfaceC9494a != null) {
            interfaceC9494a.mo51851h(bottomSheetItem.m51414d());
        }
        dismiss();
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
        AbstractC19074t.m100208f(bottomSheetItem, "bts");
        InterfaceC9494a interfaceC9494a = this.f50431O0;
        if (interfaceC9494a != null) {
            interfaceC9494a.mo51848e();
        }
        dismiss();
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
        C28688c.a.C33019a.m143718h(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: zy */
    public void mo51844zy(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143714d(this, bottomSheetItem);
    }
}
