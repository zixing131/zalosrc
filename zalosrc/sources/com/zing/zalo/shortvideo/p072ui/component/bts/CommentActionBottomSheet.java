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
public final class CommentActionBottomSheet extends BaseBottomSheetView implements C28688c.a {
    public static final C9500b Companion = new C9500b(null);

    /* renamed from: M0 */
    private C28688c f50434M0;

    /* renamed from: N0 */
    private final InterfaceC24854k f50435N0;

    /* renamed from: O0 */
    private InterfaceC9499a f50436O0;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.CommentActionBottomSheet$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC9499a {

        /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.CommentActionBottomSheet$a$a */
        /* loaded from: classes5.dex */
        public static final class a {
            /* renamed from: a */
            public static void m51864a(InterfaceC9499a interfaceC9499a, boolean z11) {
            }

            /* renamed from: b */
            public static void m51865b(InterfaceC9499a interfaceC9499a) {
            }

            /* renamed from: c */
            public static void m51866c(InterfaceC9499a interfaceC9499a) {
            }
        }

        /* renamed from: a */
        List mo51859a();

        /* renamed from: b */
        void mo51860b();

        /* renamed from: c */
        void mo51861c(boolean z11);

        /* renamed from: d */
        void mo51862d();

        /* renamed from: e */
        void mo51863e();
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.CommentActionBottomSheet$b */
    /* loaded from: classes5.dex */
    public static final class C9500b {
        private C9500b() {
        }

        public /* synthetic */ C9500b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ CommentActionBottomSheet m51867b(C9500b c9500b, boolean z11, boolean z12, boolean z13, String str, String str2, int i11, Object obj) {
            boolean z14;
            boolean z15;
            boolean z16;
            if ((i11 & 1) != 0) {
                z14 = false;
            } else {
                z14 = z11;
            }
            if ((i11 & 2) != 0) {
                z15 = false;
            } else {
                z15 = z12;
            }
            if ((i11 & 4) != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            if ((i11 & 16) != 0) {
                str2 = "null";
            }
            return c9500b.m51868a(z14, z15, z16, str, str2);
        }

        /* renamed from: a */
        public final CommentActionBottomSheet m51868a(boolean z11, boolean z12, boolean z13, String str, String str2) {
            CommentActionBottomSheet commentActionBottomSheet = new CommentActionBottomSheet();
            commentActionBottomSheet.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("CAN_COPY", Boolean.valueOf(z11)), AbstractC24866w.m129235a("CAN_REPORT", Boolean.valueOf(z12)), AbstractC24866w.m129235a("CAN_DELETE", Boolean.valueOf(z13)), AbstractC24866w.m129235a("CAN_PIN_COMMENT", str2), AbstractC24866w.m129235a("BTS_ID", str)));
            return commentActionBottomSheet;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.CommentActionBottomSheet$c */
    /* loaded from: classes5.dex */
    static final class C9501c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9501c f50437q = new C9501c();

        C9501c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C28686a mo12V4() {
            return AbstractC28684a.Companion.m143680n();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.CommentActionBottomSheet$d */
    /* loaded from: classes5.dex */
    static final class C9502d extends AbstractC19075u implements InterfaceC18505l {
        C9502d() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo205i9(List list) {
            AbstractC19074t.m100208f(list, "it");
            return AbstractC26101c.m134305f(CommentActionBottomSheet.this, list);
        }
    }

    public CommentActionBottomSheet() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(C9501c.f50437q);
        this.f50435N0 = m129210a;
    }

    /* renamed from: iL */
    private final C28686a m51856iL() {
        return (C28686a) this.f50435N0.getValue();
    }

    /* renamed from: jL */
    private final List m51857jL() {
        ArrayList m131500h;
        List m131202b0;
        m131500h = AbstractC25368s.m131500h(AbstractC26101c.m134314o(this), AbstractC26101c.m134298A(this), AbstractC26101c.m134304e(this), AbstractC26101c.m134318s(this), AbstractC26101c.m134309j(this));
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
        C28688c c28688c = this.f50434M0;
        if (c28688c != null) {
            c28688c.m143709f(null);
        }
        this.f50434M0 = null;
    }

    @Override // w10.C28688c.a
    /* renamed from: Ju */
    public void mo51821Ju(BottomSheetItem bottomSheetItem) {
        C28688c.a.C33019a.m143724n(this, bottomSheetItem);
    }

    @Override // w10.C28688c.a
    /* renamed from: Lc */
    public void mo51822Lc(BottomSheetItem bottomSheetItem) {
        AbstractC19074t.m100208f(bottomSheetItem, "bts");
        InterfaceC9499a interfaceC9499a = this.f50436O0;
        if (interfaceC9499a != null) {
            interfaceC9499a.mo51862d();
        }
        dismiss();
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

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:            r2 = qm0.AbstractC25332a0.m131187O0(r2);     */
    @Override // com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView
    /* renamed from: WK */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View mo51752WK(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        List arrayList;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        LinearLayout root = C25007g.m129816c(layoutInflater, viewGroup, false).getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        C28688c c28688c = new C28688c(root);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            str = m92642L3.getString("BTS_ID");
        } else {
            str = null;
        }
        InterfaceC9499a interfaceC9499a = this.f50436O0;
        if (interfaceC9499a == null || (r2 = interfaceC9499a.mo51859a()) == null || arrayList == null) {
            arrayList = new ArrayList();
        }
        List m143702e = m51856iL().m143702e(str, arrayList, new C9502d());
        List list = m143702e;
        if (list != null && !list.isEmpty()) {
            C28688c.m143706d(c28688c, m143702e, false, 2, null);
        } else {
            C28688c.m143706d(c28688c, m51857jL(), false, 2, null);
        }
        c28688c.m143709f(this);
        this.f50434M0 = c28688c;
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
        AbstractC19074t.m100208f(bottomSheetItem, "bts");
        InterfaceC9499a interfaceC9499a = this.f50436O0;
        if (interfaceC9499a != null) {
            interfaceC9499a.mo51861c(true);
        }
        dismiss();
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
    public final void m51858kL(InterfaceC9499a interfaceC9499a) {
        this.f50436O0 = interfaceC9499a;
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
        AbstractC19074t.m100208f(bottomSheetItem, "bts");
        InterfaceC9499a interfaceC9499a = this.f50436O0;
        if (interfaceC9499a != null) {
            interfaceC9499a.mo51860b();
        }
        dismiss();
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
        AbstractC19074t.m100208f(bottomSheetItem, "bts");
        InterfaceC9499a interfaceC9499a = this.f50436O0;
        if (interfaceC9499a != null) {
            interfaceC9499a.mo51861c(false);
        }
        dismiss();
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
        AbstractC19074t.m100208f(bottomSheetItem, "bts");
        InterfaceC9499a interfaceC9499a = this.f50436O0;
        if (interfaceC9499a != null) {
            interfaceC9499a.mo51863e();
        }
        dismiss();
    }
}
