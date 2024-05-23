package com.zing.zalo.p077ui.zviews;

import ae.C0766k;
import am.C0927o;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter;
import com.zing.zalo.p077ui.zviews.ManageOACategoryView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ge.C19410b;
import ge.C19423o;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.HashMap;
import me0.AbstractC23136l9;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p354n3.C23528a;
import p542ub.InterfaceC27218a;
import p649xl.C30047t5;
import p716zh.C31982k;
import zc0.C31784b;

/* loaded from: classes6.dex */
public final class ManageOACategoryView extends SlidableZaloView {
    public static final C14575a Companion = new C14575a(null);

    /* renamed from: P0 */
    public C23528a f75028P0;

    /* renamed from: V0 */
    private ManageCalendarCateEventInfoAdapter f75034V0;

    /* renamed from: X0 */
    private int f75036X0;

    /* renamed from: Z0 */
    private boolean f75038Z0;

    /* renamed from: b1 */
    public LinearLayoutManager f75040b1;

    /* renamed from: c1 */
    private int f75041c1;

    /* renamed from: d1 */
    private int f75042d1;

    /* renamed from: e1 */
    private int f75043e1;

    /* renamed from: f1 */
    private boolean f75044f1;

    /* renamed from: g1 */
    private int f75045g1;

    /* renamed from: h1 */
    public C30047t5 f75046h1;

    /* renamed from: Q0 */
    private ArrayList f75029Q0 = new ArrayList();

    /* renamed from: R0 */
    private ArrayList f75030R0 = new ArrayList();

    /* renamed from: S0 */
    private JSONArray f75031S0 = new JSONArray();

    /* renamed from: T0 */
    private HashMap f75032T0 = new HashMap();

    /* renamed from: U0 */
    private HashMap f75033U0 = new HashMap();

    /* renamed from: W0 */
    private int f75035W0 = -1;

    /* renamed from: Y0 */
    private boolean f75037Y0 = true;

    /* renamed from: a1 */
    private int f75039a1 = 2;

    /* renamed from: com.zing.zalo.ui.zviews.ManageOACategoryView$a */
    /* loaded from: classes6.dex */
    public static final class C14575a {
        private C14575a() {
        }

        public /* synthetic */ C14575a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ManageOACategoryView$b */
    /* loaded from: classes6.dex */
    public static final class C14576b implements InterfaceC20094a {
        C14576b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m81650e(ManageOACategoryView manageOACategoryView) {
            AbstractC19074t.m100208f(manageOACategoryView, "this$0");
            C30047t5 m81634lM = manageOACategoryView.m81634lM();
            m81634lM.f139388r.setVisibility(0);
            m81634lM.f139387q.setVisibility(8);
            ManageCalendarCateEventInfoAdapter m81638pM = manageOACategoryView.m81638pM();
            if (m81638pM != null) {
                m81638pM.m35724Q(manageOACategoryView.m81644vM());
                m81638pM.m10008p();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m81651f(ManageOACategoryView manageOACategoryView, C20096c c20096c) {
            int i11;
            MultiStateView.EnumC15915f enumC15915f;
            AbstractC19074t.m100208f(manageOACategoryView, "this$0");
            AbstractC19074t.m100208f(c20096c, "$errorMessage");
            C30047t5 m81634lM = manageOACategoryView.m81634lM();
            m81634lM.f139387q.setVisibility(8);
            if (manageOACategoryView.m81644vM().size() > 0 && ((C31982k) manageOACategoryView.m81644vM().get(manageOACategoryView.m81644vM().size() - 1)).f147039a == 5) {
                manageOACategoryView.m81644vM().remove(manageOACategoryView.m81644vM().size() - 1);
                ManageCalendarCateEventInfoAdapter m81638pM = manageOACategoryView.m81638pM();
                if (m81638pM != null) {
                    m81638pM.m35724Q(manageOACategoryView.m81644vM());
                    m81638pM.m10008p();
                }
            }
            if (manageOACategoryView.m81644vM().size() == 0) {
                m81634lM.f139388r.setVisibility(8);
                if (c20096c.m104491c() == 50001) {
                    i11 = AbstractC8020f0.empty_text_network_error;
                } else {
                    i11 = AbstractC8020f0.unknown_error;
                }
                String m118743r0 = AbstractC23136l9.m118743r0(i11);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                MultiStateView multiStateView = m81634lM.f139387q;
                multiStateView.setErrorTitleString(m118743r0);
                multiStateView.setState(MultiStateView.EnumC15914e.ERROR);
                if (c20096c.m104491c() == 50001) {
                    enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                } else {
                    enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                }
                multiStateView.setErrorType(enumC15915f);
                if (c20096c.m104491c() != 50001) {
                    multiStateView.setErrorImageResource(AbstractC16803z.watermark_network_error);
                }
                Button buttonRetry = multiStateView.getButtonRetry();
                buttonRetry.setBackground(AbstractC23136l9.m118665N(buttonRetry.getContext(), AbstractC16803z.bg_btn_type1_medium));
                buttonRetry.setTextColor(AbstractC23136l9.m118641B(buttonRetry.getContext(), AbstractC16801x.white));
                buttonRetry.setMinimumWidth(AbstractC23136l9.m118742r(150.0f));
                multiStateView.setVisibility(0);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            final ManageOACategoryView manageOACategoryView = ManageOACategoryView.this;
            manageOACategoryView.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.lx
                @Override // java.lang.Runnable
                public final void run() {
                    ManageOACategoryView.C14576b.m81651f(ManageOACategoryView.this, c20096c);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11;
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
            if (optJSONObject != null) {
                ManageOACategoryView manageOACategoryView = ManageOACategoryView.this;
                manageOACategoryView.m81631KM(optJSONObject.optInt("lastOaId"));
                if (optJSONObject.optInt("hasMore") == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                manageOACategoryView.m81629IM(z11);
                manageOACategoryView.m81628HM(manageOACategoryView.m81639qM() + 1);
                JSONArray optJSONArray = optJSONObject.optJSONArray("oaList");
                if (optJSONArray != null) {
                    ManageOACategoryView manageOACategoryView2 = ManageOACategoryView.this;
                    int length = optJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        C19423o c19423o = new C19423o(optJSONArray.optJSONObject(i11));
                        if (!manageOACategoryView2.m81641sM().containsKey(Integer.valueOf(c19423o.f96364a))) {
                            manageOACategoryView2.m81645wM().add(c19423o);
                            manageOACategoryView2.m81641sM().put(Integer.valueOf(c19423o.f96364a), c19423o);
                        }
                    }
                }
            }
            ManageOACategoryView manageOACategoryView3 = ManageOACategoryView.this;
            manageOACategoryView3.m81632LM(manageOACategoryView3.m81621kM(manageOACategoryView3.m81645wM()));
            final ManageOACategoryView manageOACategoryView4 = ManageOACategoryView.this;
            manageOACategoryView4.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.kx
                @Override // java.lang.Runnable
                public final void run() {
                    ManageOACategoryView.C14576b.m81650e(ManageOACategoryView.this);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ManageOACategoryView$c */
    /* loaded from: classes6.dex */
    public static final class C14577c extends RecyclerView.AbstractC1892s {
        C14577c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            ManageCalendarCateEventInfoAdapter.InterfaceC6972g interfaceC6972g;
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo10176d(recyclerView, i11, i12);
            ManageOACategoryView manageOACategoryView = ManageOACategoryView.this;
            manageOACategoryView.m81633MM(manageOACategoryView.m81636nM().m10127i());
            ManageOACategoryView manageOACategoryView2 = ManageOACategoryView.this;
            manageOACategoryView2.m81625EM(manageOACategoryView2.m81636nM().m9745c2());
            if (ManageOACategoryView.this.m81640rM() && !ManageOACategoryView.this.m81642tM() && ManageOACategoryView.this.m81623AM() <= ManageOACategoryView.this.m81635mM() + ManageOACategoryView.this.m81646xM()) {
                ManageCalendarCateEventInfoAdapter m81638pM = ManageOACategoryView.this.m81638pM();
                if (m81638pM != null && (interfaceC6972g = m81638pM.f38115v) != null) {
                    interfaceC6972g.mo35735a();
                }
                ManageOACategoryView.this.m81630JM(true);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ManageOACategoryView$d */
    /* loaded from: classes6.dex */
    public static final class C14578d implements ManageCalendarCateEventInfoAdapter.InterfaceC6972g {
        C14578d() {
        }

        @Override // com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter.InterfaceC6972g
        /* renamed from: a */
        public void mo35735a() {
            if (ManageOACategoryView.this.m81640rM()) {
                ManageOACategoryView manageOACategoryView = ManageOACategoryView.this;
                manageOACategoryView.m81647yM(manageOACategoryView.m81639qM(), ManageOACategoryView.this.m81643uM());
            } else {
                ManageOACategoryView.this.m81630JM(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public static final void m81615BM(ManageOACategoryView manageOACategoryView) {
        AbstractC19074t.m100208f(manageOACategoryView, "this$0");
        manageOACategoryView.m81647yM(manageOACategoryView.f75036X0, manageOACategoryView.f75035W0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public static final void m81616CM(ManageOACategoryView manageOACategoryView, RecyclerView recyclerView, int i11, View view) {
        AbstractC19074t.m100208f(manageOACategoryView, "this$0");
        Bundle bundle = new Bundle();
        C19423o c19423o = ((C31982k) manageOACategoryView.f75029Q0.get(i11)).f147040b;
        AbstractC19074t.m100205c(c19423o);
        bundle.putString("oaSuggest", c19423o.m101568a().toString());
        if (manageOACategoryView.f75044f1) {
            int i12 = manageOACategoryView.f75043e1;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i12);
            bundle.putString("extra_group_id", sb2.toString());
        }
        bundle.putInt("INT_EXTRA_TRACKING_SOURCE", manageOACategoryView.f75045g1);
        InterfaceC27218a m92676n2 = manageOACategoryView.f72421L0.m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35581q(ManageOACategoryDetailView.class, bundle, 1, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kM */
    public final ArrayList m81621kM(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList2.add(new C31982k(2, (C19423o) arrayList.get(i11), null, ""));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public static final void m81622zM(ManageOACategoryView manageOACategoryView) {
        AbstractC19074t.m100208f(manageOACategoryView, "this$0");
        manageOACategoryView.f75029Q0.add(new C31982k(5, null, null, ""));
        ManageCalendarCateEventInfoAdapter manageCalendarCateEventInfoAdapter = manageOACategoryView.f75034V0;
        if (manageCalendarCateEventInfoAdapter != null) {
            manageCalendarCateEventInfoAdapter.m35724Q(manageOACategoryView.f75029Q0);
            manageCalendarCateEventInfoAdapter.m10008p();
        }
    }

    /* renamed from: AM */
    public final int m81623AM() {
        return this.f75041c1;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m81627GM(new C23528a(this.f72421L0.m92648SI()));
        try {
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null && m92642L3.containsKey("extra_group_id")) {
                String string = m92642L3.getString("extra_group_id");
                if (TextUtils.isEmpty(string)) {
                    string = "0";
                }
                AbstractC19074t.m100205c(string);
                this.f75043e1 = Integer.parseInt(string);
                this.f75044f1 = true;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: DM */
    public final void m81624DM(C30047t5 c30047t5) {
        AbstractC19074t.m100208f(c30047t5, "<set-?>");
        this.f75046h1 = c30047t5;
    }

    /* renamed from: EM */
    public final void m81625EM(int i11) {
        this.f75042d1 = i11;
    }

    /* renamed from: FM */
    public final void m81626FM(LinearLayoutManager linearLayoutManager) {
        AbstractC19074t.m100208f(linearLayoutManager, "<set-?>");
        this.f75040b1 = linearLayoutManager;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_manage_oa_category_info_view, (ViewGroup) null, false);
        m81626FM(new LinearLayoutManager(this.f72421L0.getContext()));
        C30047t5 m148522a = C30047t5.m148522a(inflate);
        AbstractC19074t.m100207e(m148522a, "bind(...)");
        m148522a.f139387q.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.ix
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                ManageOACategoryView.m81615BM(ManageOACategoryView.this);
            }
        });
        RecyclerView recyclerView = m148522a.f139388r;
        recyclerView.setLayoutManager(m81636nM());
        C31784b.m152808a(recyclerView).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.jx
            @Override // zc0.C31784b.d
            /* renamed from: i0 */
            public final void mo17458i0(RecyclerView recyclerView2, int i11, View view) {
                ManageOACategoryView.m81616CM(ManageOACategoryView.this, recyclerView2, i11, view);
            }
        });
        recyclerView.m9826E(new C14577c());
        m81624DM(m148522a);
        LinearLayout root = m81634lM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: GM */
    public final void m81627GM(C23528a c23528a) {
        AbstractC19074t.m100208f(c23528a, "<set-?>");
        this.f75028P0 = c23528a;
    }

    /* renamed from: HM */
    public final void m81628HM(int i11) {
        this.f75036X0 = i11;
    }

    /* renamed from: IM */
    public final void m81629IM(boolean z11) {
        this.f75037Y0 = z11;
    }

    /* renamed from: JM */
    public final void m81630JM(boolean z11) {
        this.f75038Z0 = z11;
    }

    /* renamed from: KM */
    public final void m81631KM(int i11) {
        this.f75035W0 = i11;
    }

    /* renamed from: LM */
    public final void m81632LM(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "<set-?>");
        this.f75029Q0 = arrayList;
    }

    /* renamed from: MM */
    public final void m81633MM(int i11) {
        this.f75041c1 = i11;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        Context m92689tK = this.f72421L0.m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        ManageCalendarCateEventInfoAdapter manageCalendarCateEventInfoAdapter = new ManageCalendarCateEventInfoAdapter(m92689tK, m81637oM());
        manageCalendarCateEventInfoAdapter.m35726S(new C14578d());
        this.f75034V0 = manageCalendarCateEventInfoAdapter;
        m81634lM().f139388r.setAdapter(this.f75034V0);
        if (this.f75037Y0) {
            m81647yM(this.f75036X0, this.f75035W0);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ManageOACategoryView";
    }

    /* renamed from: lM */
    public final C30047t5 m81634lM() {
        C30047t5 c30047t5 = this.f75046h1;
        if (c30047t5 != null) {
            return c30047t5;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: mM */
    public final int m81635mM() {
        return this.f75042d1;
    }

    /* renamed from: nM */
    public final LinearLayoutManager m81636nM() {
        LinearLayoutManager linearLayoutManager = this.f75040b1;
        if (linearLayoutManager != null) {
            return linearLayoutManager;
        }
        AbstractC19074t.m100223u("linearLayoutManager");
        return null;
    }

    /* renamed from: oM */
    public final C23528a m81637oM() {
        C23528a c23528a = this.f75028P0;
        if (c23528a != null) {
            return c23528a;
        }
        AbstractC19074t.m100223u("mAQ");
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 1 && intent != null) {
            try {
                JSONArray jSONArray = new JSONArray(intent.getStringExtra("resultEventSuggest"));
                int length = jSONArray.length();
                for (int i13 = 0; i13 < length; i13++) {
                    Object obj = jSONArray.get(i13);
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    C19410b c19410b = new C19410b((JSONObject) obj);
                    if (!this.f75032T0.containsKey(Integer.valueOf(c19410b.f96252a))) {
                        this.f75031S0.put(jSONArray.get(i13));
                        this.f75032T0.put(Integer.valueOf(c19410b.f96252a), Integer.valueOf(c19410b.f96252a));
                    } else {
                        int length2 = this.f75031S0.length();
                        int i14 = 0;
                        while (true) {
                            if (i14 < length2) {
                                Object obj2 = this.f75031S0.get(i14);
                                AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                                if (c19410b.f96252a == new C19410b((JSONObject) obj2).f96252a) {
                                    this.f75031S0.remove(i14);
                                    this.f75031S0.put(jSONArray.get(i13));
                                    break;
                                }
                                i14++;
                            }
                        }
                    }
                }
                intent.putExtra("resultEventSuggest", this.f75031S0.toString());
                this.f72421L0.mo50035CK(1, intent);
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: pM */
    public final ManageCalendarCateEventInfoAdapter m81638pM() {
        return this.f75034V0;
    }

    /* renamed from: qM */
    public final int m81639qM() {
        return this.f75036X0;
    }

    /* renamed from: rM */
    public final boolean m81640rM() {
        return this.f75037Y0;
    }

    /* renamed from: sM */
    public final HashMap m81641sM() {
        return this.f75033U0;
    }

    /* renamed from: tM */
    public final boolean m81642tM() {
        return this.f75038Z0;
    }

    /* renamed from: uM */
    public final int m81643uM() {
        return this.f75035W0;
    }

    /* renamed from: vM */
    public final ArrayList m81644vM() {
        return this.f75029Q0;
    }

    /* renamed from: wM */
    public final ArrayList m81645wM() {
        return this.f75030R0;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f75045g1 = m92642L3.getInt("INT_EXTRA_TRACKING_SOURCE", 0);
        }
    }

    /* renamed from: xM */
    public final int m81646xM() {
        return this.f75039a1;
    }

    /* renamed from: yM */
    public final void m81647yM(int i11, int i12) {
        if (this.f75036X0 == 0) {
            C30047t5 m81634lM = m81634lM();
            m81634lM.f139388r.setVisibility(8);
            m81634lM.f139387q.setVisibility(0);
            m81634lM.f139387q.setState(MultiStateView.EnumC15914e.LOADING);
        } else {
            this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.hx
                @Override // java.lang.Runnable
                public final void run() {
                    ManageOACategoryView.m81622zM(ManageOACategoryView.this);
                }
            });
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14576b());
        c0766k.mo1656hb(i11, i12);
    }
}
