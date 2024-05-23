package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ag0.C0824j;
import am.AbstractC0939u;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.C1919l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c30.C3245i;
import c30.C3247j;
import c30.C3262u;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.zviews.StickerManageView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import me0.AbstractC23080g8;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import p038bl.C2834f;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p379o3.AbstractC24006q;
import p588vw.C28644j;
import vg.C28020b3;
import zc0.C31784b;
import zc0.C31787e;
import zc0.InterfaceC31786d;

/* loaded from: classes6.dex */
public class StickerManageView extends SlidableZaloView implements C23744a.c, InterfaceC17463d.d, InterfaceC0733x {

    /* renamed from: g1 */
    public static String f77866g1 = "EXTRA_STICKER_MANAGER_DELEGATE";

    /* renamed from: h1 */
    public static String f77867h1 = "EXTRA_STICKER_SELECTED_ID";

    /* renamed from: i1 */
    public static String f77868i1 = "EXTRA_ENABLE_SELECTED";

    /* renamed from: j1 */
    public static String f77869j1 = "EXTRA_STICKER_DOWNLOAD_SOURCE";

    /* renamed from: k1 */
    public static String f77870k1 = "EXTRA_NEED_RELOAD_PANEL";

    /* renamed from: Q0 */
    RecyclerView f77872Q0;

    /* renamed from: R0 */
    LinearLayoutManager f77873R0;

    /* renamed from: S0 */
    LinearLayout f77874S0;

    /* renamed from: T0 */
    MultiStateView f77875T0;

    /* renamed from: U0 */
    ArrayList f77876U0;

    /* renamed from: V0 */
    C3245i f77877V0;

    /* renamed from: W0 */
    C3262u f77878W0;

    /* renamed from: X0 */
    C1919l f77879X0;

    /* renamed from: Y0 */
    C23528a f77880Y0;

    /* renamed from: Z0 */
    C8009j f77881Z0;

    /* renamed from: c1 */
    View f77884c1;

    /* renamed from: e1 */
    private HashSet f77886e1;

    /* renamed from: P0 */
    int f77871P0 = -1;

    /* renamed from: a1 */
    Handler f77882a1 = new Handler(Looper.getMainLooper());

    /* renamed from: b1 */
    boolean f77883b1 = false;

    /* renamed from: d1 */
    Intent f77885d1 = null;

    /* renamed from: f1 */
    private int f77887f1 = 0;

    /* renamed from: com.zing.zalo.ui.zviews.StickerManageView$a */
    /* loaded from: classes6.dex */
    public class C15090a extends AbstractC0939u {
        C15090a() {
        }

        /* renamed from: d */
        public /* synthetic */ void m84507d() {
            C3262u c3262u;
            int m16598T;
            StickerManageView.this.m84500mM();
            StickerManageView stickerManageView = StickerManageView.this;
            if (stickerManageView.f77872Q0 != null && (c3262u = stickerManageView.f77878W0) != null && (m16598T = c3262u.m16598T(c3262u.f13974E)) != -1) {
                LinearLayoutManager linearLayoutManager = StickerManageView.this.f77873R0;
                linearLayoutManager.m9721B2(m16598T, (linearLayoutManager.getHeight() / 2) - AbstractC23136l9.m118742r(52.0f));
            }
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            StickerManageView.this.m84503tM();
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.fm0
                public /* synthetic */ fm0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    StickerManageView.C15090a.this.m84507d();
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StickerManageView$b */
    /* loaded from: classes6.dex */
    public class C15091b implements InterfaceC31786d {
        C15091b() {
        }

        @Override // zc0.InterfaceC31786d
        /* renamed from: a */
        public void mo79461a() {
            StickerManageView stickerManageView = StickerManageView.this;
            if (stickerManageView.f77883b1) {
                stickerManageView.m84504uM();
                StickerManageView.this.m84505vM();
            }
        }

        @Override // zc0.InterfaceC31786d
        /* renamed from: b */
        public void mo79462b(int i11, int i12) {
            StickerManageView stickerManageView = StickerManageView.this;
            stickerManageView.f77883b1 = true;
            stickerManageView.f77876U0 = new ArrayList(StickerManageView.this.f77878W0.m16599U());
        }

        @Override // zc0.InterfaceC31786d
        /* renamed from: c */
        public void mo79463c(RecyclerView.AbstractC1876c0 abstractC1876c0) {
            C1919l c1919l = StickerManageView.this.f77879X0;
            if (c1919l != null) {
                c1919l.m10566H(abstractC1876c0);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StickerManageView$c */
    /* loaded from: classes6.dex */
    public class C15092c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ int f77890a;

        C15092c(int i11) {
            this.f77890a = i11;
        }

        /* renamed from: d */
        public /* synthetic */ void m84509d(int i11) {
            try {
                StickerManageView.this.m84500mM();
                StickerManageView.this.f77886e1.add(Integer.valueOf(i11));
                StickerManageView.this.f72421L0.mo49315c4();
            } catch (Exception e11) {
                e11.printStackTrace();
                StickerManageView.this.f72421L0.mo49315c4();
            }
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            int i11;
            try {
                ArrayList arrayList = StickerManageView.this.f77876U0;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i12 = 0; i12 < StickerManageView.this.f77876U0.size(); i12++) {
                        if (((C3245i) StickerManageView.this.f77876U0.get(i12)).m16463e() != -2) {
                            if (size < i12) {
                                i11 = i12;
                            } else {
                                i11 = i12 + 1;
                            }
                            if (((C3245i) StickerManageView.this.f77876U0.get(i12)).f13854b == 0) {
                                AbstractC23309i.m121618Xu(i11);
                            } else {
                                if (((C3245i) StickerManageView.this.f77876U0.get(i12)).m16463e() == this.f77890a) {
                                    size = i12;
                                }
                                C7960e.m41971c6().m42344ae(((C3245i) StickerManageView.this.f77876U0.get(i12)).f13854b, i11);
                            }
                            C28644j.m143238c1(((C3245i) StickerManageView.this.f77876U0.get(i12)).f13854b, i11);
                        }
                    }
                }
                if (this.f77890a == 0) {
                    AbstractC23309i.m122629yu(true);
                    C28020b3.f130648a.m141196k(this.f77890a, false);
                    SparseArray sparseArray = AbstractC23304d.f113265D;
                    C3245i c3245i = (C3245i) sparseArray.get(this.f77890a);
                    if (c3245i != null) {
                        AbstractC23304d.f113261C.remove(c3245i);
                        sparseArray.remove(c3245i.m16463e());
                    }
                } else {
                    Iterator it = C7960e.m41971c6().m42273T6(this.f77890a + "").iterator();
                    while (it.hasNext()) {
                        C3247j c3247j = (C3247j) it.next();
                        C28020b3.f130648a.m141197l(c3247j.f13890c);
                        AbstractC24006q.m125840K1(c3247j.m16499a());
                    }
                    C28020b3 c28020b3 = C28020b3.f130648a;
                    c28020b3.m141199n(this.f77890a);
                    if (this.f77890a == 39) {
                        AbstractC20887g.m109230h(1000000, "delete on manage view");
                    }
                    c28020b3.m141196k(this.f77890a, false);
                    SparseArray sparseArray2 = AbstractC23304d.f113265D;
                    C3245i c3245i2 = (C3245i) sparseArray2.get(this.f77890a);
                    if (c3245i2 != null) {
                        AbstractC23304d.f113261C.remove(c3245i2);
                        sparseArray2.remove(c3245i2.m16463e());
                    }
                }
                StickerManageView.this.f77876U0.clear();
                StickerManageView.this.m84503tM();
                StickerManageView.this.m84504uM();
                AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.gm0

                    /* renamed from: q */
                    public final /* synthetic */ int f80480q;

                    public /* synthetic */ gm0(int i13) {
                        r2 = i13;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        StickerManageView.C15092c.this.m84509d(r2);
                    }
                });
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                AbstractC19444a.m101695c(StickerManageView.this.f72832G0);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StickerManageView$d */
    /* loaded from: classes6.dex */
    public interface InterfaceC15093d {
        /* renamed from: a */
        void mo84510a(C3245i c3245i);
    }

    /* renamed from: pM */
    public /* synthetic */ void m84495pM() {
        try {
            m84500mM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: qM */
    public /* synthetic */ void m84496qM(C3245i c3245i) {
        this.f77877V0 = c3245i;
        if (c3245i != null) {
            this.f72421L0.removeDialog(0);
            this.f72421L0.showDialog(0);
        }
    }

    /* renamed from: rM */
    public /* synthetic */ void m84497rM(RecyclerView recyclerView, int i11, View view) {
        try {
            AbstractC23647d.m123906p("9602");
            C3262u c3262u = this.f77878W0;
            if (c3262u != null) {
                c3262u.m16600Z();
            }
            C3245i c3245i = (C3245i) this.f77876U0.get(i11);
            this.f77877V0 = c3245i;
            if (c3245i != null) {
                if (c3245i.m16463e() == 0) {
                    return;
                }
                if (this.f77883b1) {
                    int i12 = 0;
                    while (i12 < this.f77876U0.size()) {
                        if (((C3245i) this.f77876U0.get(i12)).m16463e() == 0) {
                            AbstractC23309i.m121618Xu(i12 + 1);
                        } else {
                            C7960e.m41971c6().m42344ae(((C3245i) this.f77876U0.get(i12)).m16463e(), i12 + 1);
                        }
                        int m16463e = ((C3245i) this.f77876U0.get(i12)).m16463e();
                        i12++;
                        C28644j.m143238c1(m16463e, i12);
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean(f77866g1, true);
                AbstractC23152n3.m119068s0(this.f72421L0.m92676n2(), this.f77877V0.f13854b, "", 255, "", bundle, -1, this.f77887f1);
            }
            AbstractC23647d.m123893c();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: sM */
    public /* synthetic */ boolean m84498sM(RecyclerView recyclerView, int i11, View view) {
        C3262u c3262u = this.f77878W0;
        if (c3262u != null) {
            c3262u.m16597S();
            this.f77878W0.m16600Z();
            return true;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f77880Y0 = new C23528a(this.f72421L0.m92648SI());
        if (bundle != null) {
            this.f77883b1 = bundle.getBoolean("isDataChanged", false);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 0) {
            return null;
        }
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43159h(1).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_stickercategory_askdelete)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), this);
        return aVar.m43152a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f77884c1 = layoutInflater.inflate(AbstractC7409c0.sticker_category_view, viewGroup, false);
        m84502oM();
        m84501nM();
        m92637BK(true);
        if (m92642L3() != null && this.f77878W0 != null) {
            Bundle m92642L3 = m92642L3();
            this.f77871P0 = m92642L3.getInt(f77867h1, -1);
            if (m92642L3.getBoolean(f77868i1, false)) {
                this.f77878W0.f13974E = this.f77871P0;
            }
            this.f77887f1 = m92642L3.getInt(f77869j1, 0);
        }
        return this.f77884c1;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            if (interfaceC17463d.mo92862f() == 0 && i11 == -1) {
                try {
                    C3245i c3245i = this.f77877V0;
                    if (c3245i != null) {
                        this.f77883b1 = true;
                        int i12 = c3245i.f13854b;
                        if (i12 == -2) {
                            C7960e.m41971c6().m42517r3();
                        } else {
                            m84499lM(i12);
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                interfaceC17463d.dismiss();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 20);
        C23744a.m124114c().m124117e(this, 8002);
        C23744a.m124114c().m124117e(this, 8004);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 1) {
            return true;
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        if (this.f77883b1) {
            HashSet hashSet = this.f77886e1;
            if (hashSet != null && !hashSet.isEmpty()) {
                C2834f.f11325a.m13688i(this.f77886e1);
            } else {
                C2834f.f11325a.m13686e();
            }
        }
        super.mo13886RJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        if (bundle != null) {
            bundle.putBoolean("isDataChanged", this.f77883b1);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.more_title_sticker));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C8009j c8009j = this.f77881Z0;
        if (c8009j != null && c8009j.m92868m()) {
            this.f77881Z0.dismiss();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "StickerManageView";
    }

    /* renamed from: lM */
    public void m84499lM(int i11) {
        try {
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            if (this.f77886e1 == null) {
                this.f77886e1 = new HashSet();
            }
            C0824j.m2153b(new C15092c(i11));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: mM */
    void m84500mM() {
        try {
            int i11 = 0;
            if (this.f77876U0.size() > 0) {
                this.f77872Q0.setVisibility(0);
                MultiStateView multiStateView = this.f77875T0;
                if (multiStateView != null) {
                    multiStateView.setVisibility(8);
                }
                LinearLayout linearLayout = this.f77874S0;
                if (this.f77876U0.size() <= 1) {
                    i11 = 8;
                }
                linearLayout.setVisibility(i11);
            } else {
                MultiStateView multiStateView2 = this.f77875T0;
                if (multiStateView2 != null) {
                    multiStateView2.setVisibility(0);
                    this.f77875T0.setState(MultiStateView.EnumC15914e.EMPTY);
                    this.f77875T0.setEmptyViewString(AbstractC23136l9.m118743r0(AbstractC8020f0.empty_list));
                }
                this.f77872Q0.setVisibility(8);
                this.f77874S0.setVisibility(8);
            }
            this.f77878W0.m16603c0(this.f77876U0);
            this.f77878W0.m10008p();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: nM */
    void m84501nM() {
        try {
            this.f77885d1 = null;
            this.f77876U0 = new ArrayList();
            this.f77878W0 = new C3262u(this.f72421L0.m92676n2(), this.f77880Y0, new C15091b(), new InterfaceC15093d() { // from class: com.zing.zalo.ui.zviews.bm0
                public /* synthetic */ bm0() {
                }

                @Override // com.zing.zalo.p077ui.zviews.StickerManageView.InterfaceC15093d
                /* renamed from: a */
                public final void mo84510a(C3245i c3245i) {
                    StickerManageView.this.m84496qM(c3245i);
                }
            }, this.f77887f1);
            C31784b.m152808a(this.f77872Q0).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.cm0
                public /* synthetic */ cm0() {
                }

                @Override // zc0.C31784b.d
                /* renamed from: i0 */
                public final void mo17458i0(RecyclerView recyclerView, int i11, View view) {
                    StickerManageView.this.m84497rM(recyclerView, i11, view);
                }
            });
            C31784b.m152808a(this.f77872Q0).m152810c(new C31784b.e() { // from class: com.zing.zalo.ui.zviews.dm0
                public /* synthetic */ dm0() {
                }

                @Override // zc0.C31784b.e
                /* renamed from: T3 */
                public final boolean mo81113T3(RecyclerView recyclerView, int i11, View view) {
                    boolean m84498sM;
                    m84498sM = StickerManageView.this.m84498sM(recyclerView, i11, view);
                    return m84498sM;
                }
            });
            this.f77878W0.m16602b0(true);
            this.f77878W0.m16601a0(true);
            C1919l c1919l = new C1919l(new C31787e(this.f77878W0));
            this.f77879X0 = c1919l;
            c1919l.m10568m(this.f77872Q0);
            this.f77872Q0.setAdapter(this.f77878W0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: oM */
    void m84502oM() {
        this.f77874S0 = (LinearLayout) this.f77884c1.findViewById(AbstractC6918a0.layoutTutorial);
        this.f77875T0 = (MultiStateView) this.f77884c1.findViewById(AbstractC6918a0.multi_state);
        this.f77873R0 = new LinearLayoutManager(this.f72421L0.m92648SI(), 1, false);
        RecyclerView recyclerView = (RecyclerView) this.f77884c1.findViewById(AbstractC6918a0.rvCateList);
        this.f77872Q0 = recyclerView;
        recyclerView.setLayoutManager(this.f77873R0);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        try {
            C0824j.m2153b(new C15090a());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: tM */
    void m84503tM() {
        ArrayList arrayList = this.f77876U0;
        if (arrayList == null || arrayList.isEmpty()) {
            this.f77876U0 = (ArrayList) AbstractC23080g8.m118400e(false, false);
        }
    }

    /* renamed from: uM */
    void m84504uM() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f77876U0.iterator();
        while (it.hasNext()) {
            int i11 = ((C3245i) it.next()).f13854b;
            if (i11 >= 0) {
                arrayList.add(Integer.valueOf(i11));
            }
        }
        C28644j.m143233Y().m143293Y0(arrayList);
    }

    /* renamed from: vM */
    public void m84505vM() {
        int i11 = 0;
        while (i11 < this.f77876U0.size()) {
            try {
                if (((C3245i) this.f77876U0.get(i11)).m16463e() == 0) {
                    AbstractC23309i.m121618Xu(i11 + 1);
                } else {
                    C7960e.m41971c6().m42344ae(((C3245i) this.f77876U0.get(i11)).f13854b, i11 + 1);
                }
                int m16463e = ((C3245i) this.f77876U0.get(i11)).m16463e();
                i11++;
                C28644j.m143238c1(m16463e, i11);
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (this.f77885d1 == null) {
            Intent intent = new Intent();
            this.f77885d1 = intent;
            intent.putExtra(f77870k1, true);
        }
        this.f72421L0.mo50035CK(-1, this.f77885d1);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 20 || i11 == 8002 || i11 == 8004) {
            this.f77876U0.clear();
            m84503tM();
            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.em0
                public /* synthetic */ em0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    StickerManageView.this.m84495pM();
                }
            });
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 20);
        C23744a.m124114c().m124115b(this, 8002);
        C23744a.m124114c().m124115b(this, 8004);
    }
}
