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
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.zviews.ManageOACategoryDetailView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ge.C19410b;
import ge.C19422n;
import ge.C19423o;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import me0.AbstractC23136l9;
import on0.AbstractC24341v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p354n3.C23528a;
import p649xl.C30030s5;
import p716zh.C31982k;

/* loaded from: classes6.dex */
public final class ManageOACategoryDetailView extends SlidableZaloView {
    public static final C14569a Companion = new C14569a(null);

    /* renamed from: P0 */
    public C23528a f74998P0;

    /* renamed from: Q0 */
    private C19423o f74999Q0;

    /* renamed from: W0 */
    private ManageCalendarCateEventInfoAdapter f75005W0;

    /* renamed from: Y0 */
    private int f75007Y0;

    /* renamed from: a1 */
    private boolean f75009a1;

    /* renamed from: b1 */
    public LinearLayoutManager f75010b1;

    /* renamed from: c1 */
    private int f75011c1;

    /* renamed from: d1 */
    private int f75012d1;

    /* renamed from: f1 */
    private C19410b f75014f1;

    /* renamed from: g1 */
    private byte f75015g1;

    /* renamed from: h1 */
    private byte f75016h1;

    /* renamed from: i1 */
    private int f75017i1;

    /* renamed from: j1 */
    private int f75018j1;

    /* renamed from: k1 */
    private boolean f75019k1;

    /* renamed from: l1 */
    private int f75020l1;

    /* renamed from: m1 */
    public C30030s5 f75021m1;

    /* renamed from: R0 */
    private ArrayList f75000R0 = new ArrayList();

    /* renamed from: S0 */
    private ArrayList f75001S0 = new ArrayList();

    /* renamed from: T0 */
    private ArrayList f75002T0 = new ArrayList();

    /* renamed from: U0 */
    private HashMap f75003U0 = new HashMap();

    /* renamed from: V0 */
    private HashMap f75004V0 = new HashMap();

    /* renamed from: X0 */
    private int f75006X0 = -1;

    /* renamed from: Z0 */
    private boolean f75008Z0 = true;

    /* renamed from: e1 */
    private int f75013e1 = 2;

    /* renamed from: com.zing.zalo.ui.zviews.ManageOACategoryDetailView$a */
    /* loaded from: classes6.dex */
    public static final class C14569a {
        private C14569a() {
        }

        public /* synthetic */ C14569a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ManageOACategoryDetailView$b */
    /* loaded from: classes6.dex */
    public static final class C14570b implements InterfaceC20094a {
        C14570b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m81609e(ManageOACategoryDetailView manageOACategoryDetailView) {
            AbstractC19074t.m100208f(manageOACategoryDetailView, "this$0");
            C30030s5 m81592lM = manageOACategoryDetailView.m81592lM();
            m81592lM.f139292r.setVisibility(0);
            m81592lM.f139291q.setVisibility(8);
            ManageCalendarCateEventInfoAdapter m81596pM = manageOACategoryDetailView.m81596pM();
            if (m81596pM != null) {
                m81596pM.m35724Q(manageOACategoryDetailView.m81568AM());
                m81596pM.m10008p();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m81610f(ManageOACategoryDetailView manageOACategoryDetailView, C20096c c20096c) {
            int i11;
            MultiStateView.EnumC15915f enumC15915f;
            AbstractC19074t.m100208f(manageOACategoryDetailView, "this$0");
            AbstractC19074t.m100208f(c20096c, "$errorMessage");
            C30030s5 m81592lM = manageOACategoryDetailView.m81592lM();
            m81592lM.f139291q.setVisibility(8);
            if (manageOACategoryDetailView.m81568AM().size() > 0 && ((C31982k) manageOACategoryDetailView.m81568AM().get(manageOACategoryDetailView.m81568AM().size() - 1)).f147039a == 5) {
                manageOACategoryDetailView.m81568AM().remove(manageOACategoryDetailView.m81568AM().size() - 1);
                ManageCalendarCateEventInfoAdapter m81596pM = manageOACategoryDetailView.m81596pM();
                if (m81596pM != null) {
                    m81596pM.m35724Q(manageOACategoryDetailView.m81568AM());
                    m81596pM.m10008p();
                }
            }
            if (manageOACategoryDetailView.m81568AM().size() == 0) {
                m81592lM.f139292r.setVisibility(8);
                if (c20096c.m104491c() == 50001) {
                    i11 = AbstractC8020f0.empty_text_network_error;
                } else {
                    i11 = AbstractC8020f0.unknown_error;
                }
                String m118743r0 = AbstractC23136l9.m118743r0(i11);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                MultiStateView multiStateView = m81592lM.f139291q;
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
                if (buttonRetry != null) {
                    AbstractC19074t.m100205c(buttonRetry);
                    buttonRetry.setBackground(AbstractC23136l9.m118665N(buttonRetry.getContext(), AbstractC16803z.bg_btn_type1_medium));
                    buttonRetry.setTextColor(AbstractC23136l9.m118641B(buttonRetry.getContext(), AbstractC16801x.white));
                    buttonRetry.setMinimumWidth(AbstractC23136l9.m118742r(150.0f));
                }
                multiStateView.setVisibility(0);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            final ManageOACategoryDetailView manageOACategoryDetailView = ManageOACategoryDetailView.this;
            manageOACategoryDetailView.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.dx
                @Override // java.lang.Runnable
                public final void run() {
                    ManageOACategoryDetailView.C14570b.m81610f(ManageOACategoryDetailView.this, c20096c);
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
                ManageOACategoryDetailView manageOACategoryDetailView = ManageOACategoryDetailView.this;
                manageOACategoryDetailView.m81583TM(optJSONObject.optInt("lastCateId"));
                if (optJSONObject.optInt("hasMore") == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                manageOACategoryDetailView.m81581RM(z11);
                manageOACategoryDetailView.m81578OM(manageOACategoryDetailView.m81598rM() + 1);
                JSONArray optJSONArray = optJSONObject.optJSONArray("eventCates");
                if (optJSONArray != null) {
                    ManageOACategoryDetailView manageOACategoryDetailView2 = ManageOACategoryDetailView.this;
                    int length = optJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject optJSONObject2 = optJSONArray.optJSONObject(i11);
                        AbstractC19074t.m100207e(optJSONObject2, "optJSONObject(...)");
                        C19410b c19410b = new C19410b(optJSONObject2);
                        if (!manageOACategoryDetailView2.m81602vM().containsKey(Integer.valueOf(c19410b.f96252a))) {
                            manageOACategoryDetailView2.m81606zM().add(c19410b);
                            manageOACategoryDetailView2.m81602vM().put(Integer.valueOf(c19410b.f96252a), c19410b);
                        }
                    }
                }
            }
            ManageOACategoryDetailView manageOACategoryDetailView3 = ManageOACategoryDetailView.this;
            manageOACategoryDetailView3.m81584UM(manageOACategoryDetailView3.m81591kM(manageOACategoryDetailView3.m81606zM()));
            final ManageOACategoryDetailView manageOACategoryDetailView4 = ManageOACategoryDetailView.this;
            manageOACategoryDetailView4.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ex
                @Override // java.lang.Runnable
                public final void run() {
                    ManageOACategoryDetailView.C14570b.m81609e(ManageOACategoryDetailView.this);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ManageOACategoryDetailView$c */
    /* loaded from: classes6.dex */
    public static final class C14571c extends RecyclerView.AbstractC1892s {
        C14571c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            ManageCalendarCateEventInfoAdapter.InterfaceC6972g interfaceC6972g;
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo10176d(recyclerView, i11, i12);
            ManageOACategoryDetailView manageOACategoryDetailView = ManageOACategoryDetailView.this;
            manageOACategoryDetailView.m81588YM(manageOACategoryDetailView.m81594nM().m10127i());
            ManageOACategoryDetailView manageOACategoryDetailView2 = ManageOACategoryDetailView.this;
            manageOACategoryDetailView2.m81575LM(manageOACategoryDetailView2.m81594nM().m9745c2());
            if (ManageOACategoryDetailView.this.m81601uM() && !ManageOACategoryDetailView.this.m81604xM() && ManageOACategoryDetailView.this.m81573GM() <= ManageOACategoryDetailView.this.m81593mM() + ManageOACategoryDetailView.this.m81571DM()) {
                ManageCalendarCateEventInfoAdapter m81596pM = ManageOACategoryDetailView.this.m81596pM();
                if (m81596pM != null && (interfaceC6972g = m81596pM.f38115v) != null) {
                    interfaceC6972g.mo35735a();
                }
                ManageOACategoryDetailView.this.m81582SM(true);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ManageOACategoryDetailView$d */
    /* loaded from: classes6.dex */
    public static final class C14572d extends ManageCalendarCateEventInfoAdapter.C6971f {
        C14572d() {
        }

        @Override // com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter.C6971f
        /* renamed from: a */
        public void mo35733a(C19410b c19410b) {
            int parseInt;
            byte b11;
            AbstractC19074t.m100208f(c19410b, "eventInfo");
            if (!c19410b.f96255d) {
                ArrayList arrayList = new ArrayList();
                int i11 = c19410b.f96252a;
                ManageOACategoryDetailView manageOACategoryDetailView = ManageOACategoryDetailView.this;
                if (manageOACategoryDetailView.m81603wM()) {
                    parseInt = ManageOACategoryDetailView.this.m81600tM();
                } else {
                    String str = CoreUtility.f89233i;
                    AbstractC19074t.m100207e(str, "currentUserUid");
                    parseInt = Integer.parseInt(str);
                }
                manageOACategoryDetailView.m81580QM(parseInt);
                ManageOACategoryDetailView manageOACategoryDetailView2 = ManageOACategoryDetailView.this;
                byte b12 = 2;
                if (manageOACategoryDetailView2.m81603wM()) {
                    b11 = 2;
                } else {
                    b11 = 1;
                }
                manageOACategoryDetailView2.m81586WM(b11);
                ManageOACategoryDetailView manageOACategoryDetailView3 = ManageOACategoryDetailView.this;
                if (!manageOACategoryDetailView3.m81603wM()) {
                    b12 = 1;
                }
                manageOACategoryDetailView3.m81585VM(b12);
                arrayList.add(new C19422n(ManageOACategoryDetailView.this.m81570CM(), ManageOACategoryDetailView.this.m81599sM(), ManageOACategoryDetailView.this.m81569BM(), (byte) 1));
                ManageOACategoryDetailView.this.m81589ZM(i11, arrayList);
            }
        }

        @Override // com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter.C6971f
        /* renamed from: b */
        public void mo35734b(C19410b c19410b) {
            byte b11;
            byte b12;
            int parseInt;
            AbstractC19074t.m100208f(c19410b, "eventInfo");
            ManageOACategoryDetailView.this.m81579PM(c19410b);
            ManageOACategoryDetailView manageOACategoryDetailView = ManageOACategoryDetailView.this;
            if (manageOACategoryDetailView.m81603wM()) {
                b11 = 2;
            } else {
                b11 = 1;
            }
            manageOACategoryDetailView.m81585VM(b11);
            ManageOACategoryDetailView manageOACategoryDetailView2 = ManageOACategoryDetailView.this;
            if (manageOACategoryDetailView2.m81603wM()) {
                b12 = 2;
            } else {
                b12 = 1;
            }
            manageOACategoryDetailView2.m81586WM(b12);
            ManageOACategoryDetailView manageOACategoryDetailView3 = ManageOACategoryDetailView.this;
            if (manageOACategoryDetailView3.m81603wM()) {
                parseInt = ManageOACategoryDetailView.this.m81600tM();
            } else {
                String str = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str, "currentUserUid");
                parseInt = Integer.parseInt(str);
            }
            manageOACategoryDetailView3.m81580QM(parseInt);
            if (ManageOACategoryDetailView.this.m81603wM()) {
                ManageOACategoryDetailView.this.f72421L0.showDialog(2);
            } else {
                ManageOACategoryDetailView.this.f72421L0.showDialog(1);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ManageOACategoryDetailView$e */
    /* loaded from: classes6.dex */
    public static final class C14573e implements ManageCalendarCateEventInfoAdapter.InterfaceC6972g {
        C14573e() {
        }

        @Override // com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter.InterfaceC6972g
        /* renamed from: a */
        public void mo35735a() {
            if (ManageOACategoryDetailView.this.m81601uM()) {
                ManageOACategoryDetailView manageOACategoryDetailView = ManageOACategoryDetailView.this;
                C19423o m81597qM = manageOACategoryDetailView.m81597qM();
                AbstractC19074t.m100205c(m81597qM);
                manageOACategoryDetailView.m81572EM(m81597qM.f96364a, ManageOACategoryDetailView.this.m81598rM(), ManageOACategoryDetailView.this.m81605yM());
                return;
            }
            ManageOACategoryDetailView.this.m81582SM(false);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ManageOACategoryDetailView$f */
    /* loaded from: classes6.dex */
    public static final class C14574f implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ int f75027b;

        C14574f(int i11) {
            this.f75027b = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m81613e(ManageOACategoryDetailView manageOACategoryDetailView, C19410b c19410b) {
            AbstractC19074t.m100208f(manageOACategoryDetailView, "this$0");
            AbstractC19074t.m100208f(c19410b, "$this_apply");
            ManageCalendarCateEventInfoAdapter m81596pM = manageOACategoryDetailView.m81596pM();
            if (m81596pM != null) {
                m81596pM.m35724Q(manageOACategoryDetailView.m81568AM());
                m81596pM.m10008p();
            }
            if (c19410b.f96255d) {
                if (manageOACategoryDetailView.m81603wM()) {
                    ToastUtils.m89268p(AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_msg_follow_event_cate_success_mode_group));
                    return;
                } else {
                    ToastUtils.m89268p(AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_msg_follow_personal_cate_success));
                    return;
                }
            }
            if (manageOACategoryDetailView.m81603wM()) {
                ToastUtils.m89268p(AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_msg_unfollow_group_cate_by_group_success));
            } else {
                ToastUtils.m89268p(AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_msg_unfollow_personal_cate_success));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m81614f(ManageOACategoryDetailView manageOACategoryDetailView, C20096c c20096c) {
            String m127114D;
            AbstractC19074t.m100208f(manageOACategoryDetailView, "this$0");
            AbstractC19074t.m100208f(c20096c, "$errorMessage");
            ManageCalendarCateEventInfoAdapter m81596pM = manageOACategoryDetailView.m81596pM();
            if (m81596pM != null) {
                m81596pM.m35724Q(manageOACategoryDetailView.m81568AM());
                m81596pM.m10008p();
            }
            String m104492d = c20096c.m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            m127114D = AbstractC24341v.m127114D(m104492d, "(" + c20096c.m104491c() + ")", "", false, 4, null);
            ToastUtils.m89268p(m127114D);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            ManageOACategoryDetailView.this.mo49315c4();
            if (c20096c.m104491c() == -20026 || c20096c.m104491c() == -20027) {
                Iterator it = ManageOACategoryDetailView.this.m81568AM().iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    C31982k c31982k = (C31982k) it.next();
                    C19410b c19410b = c31982k.f147041c;
                    if (c19410b != null) {
                        int i12 = this.f75027b;
                        ManageOACategoryDetailView manageOACategoryDetailView = ManageOACategoryDetailView.this;
                        if (c19410b.f96252a == i12) {
                            c19410b.f96255d = !c19410b.f96255d;
                            manageOACategoryDetailView.m81568AM().set(i11, c31982k);
                            manageOACategoryDetailView.m81590aN(c19410b);
                            manageOACategoryDetailView.m81587XM();
                        }
                    }
                    i11++;
                }
            }
            final ManageOACategoryDetailView manageOACategoryDetailView2 = ManageOACategoryDetailView.this;
            manageOACategoryDetailView2.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.fx
                @Override // java.lang.Runnable
                public final void run() {
                    ManageOACategoryDetailView.C14574f.m81614f(ManageOACategoryDetailView.this, c20096c);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            ManageOACategoryDetailView.this.mo49315c4();
            Iterator it = ManageOACategoryDetailView.this.m81568AM().iterator();
            int i11 = 0;
            while (it.hasNext()) {
                C31982k c31982k = (C31982k) it.next();
                final C19410b c19410b = c31982k.f147041c;
                if (c19410b != null) {
                    int i12 = this.f75027b;
                    final ManageOACategoryDetailView manageOACategoryDetailView = ManageOACategoryDetailView.this;
                    if (c19410b.f96252a == i12) {
                        c19410b.f96255d = !c19410b.f96255d;
                        manageOACategoryDetailView.m81568AM().set(i11, c31982k);
                        manageOACategoryDetailView.m81590aN(c19410b);
                        manageOACategoryDetailView.m81587XM();
                        manageOACategoryDetailView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.gx
                            @Override // java.lang.Runnable
                            public final void run() {
                                ManageOACategoryDetailView.C14574f.m81613e(ManageOACategoryDetailView.this, c19410b);
                            }
                        });
                    }
                }
                i11++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public static final void m81560FM(ManageOACategoryDetailView manageOACategoryDetailView) {
        AbstractC19074t.m100208f(manageOACategoryDetailView, "this$0");
        manageOACategoryDetailView.f75000R0.add(new C31982k(5, null, null, ""));
        ManageCalendarCateEventInfoAdapter manageCalendarCateEventInfoAdapter = manageOACategoryDetailView.f75005W0;
        if (manageCalendarCateEventInfoAdapter != null) {
            manageCalendarCateEventInfoAdapter.m35724Q(manageOACategoryDetailView.f75000R0);
            manageCalendarCateEventInfoAdapter.m10008p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public static final void m81561HM(ManageOACategoryDetailView manageOACategoryDetailView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(manageOACategoryDetailView, "this$0");
        ArrayList arrayList = new ArrayList();
        C19410b c19410b = manageOACategoryDetailView.f75014f1;
        AbstractC19074t.m100205c(c19410b);
        int i12 = c19410b.f96252a;
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC17463d.dismiss();
                return;
            }
        } else {
            arrayList.add(new C19422n(manageOACategoryDetailView.f75016h1, manageOACategoryDetailView.f75017i1, manageOACategoryDetailView.f75015g1, (byte) 0));
        }
        manageOACategoryDetailView.m81589ZM(i12, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public static final void m81562IM(ManageOACategoryDetailView manageOACategoryDetailView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(manageOACategoryDetailView, "this$0");
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC17463d.dismiss();
                return;
            }
            return;
        }
        interfaceC17463d.dismiss();
        C19410b c19410b = manageOACategoryDetailView.f75014f1;
        AbstractC19074t.m100205c(c19410b);
        int i12 = c19410b.f96252a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C19422n(manageOACategoryDetailView.f75016h1, manageOACategoryDetailView.f75017i1, manageOACategoryDetailView.f75015g1, (byte) 0));
        manageOACategoryDetailView.m81589ZM(i12, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public static final void m81563JM(ManageOACategoryDetailView manageOACategoryDetailView) {
        AbstractC19074t.m100208f(manageOACategoryDetailView, "this$0");
        C19423o c19423o = manageOACategoryDetailView.f74999Q0;
        AbstractC19074t.m100205c(c19423o);
        manageOACategoryDetailView.m81572EM(c19423o.f96364a, manageOACategoryDetailView.f75007Y0, manageOACategoryDetailView.f75006X0);
    }

    /* renamed from: AM */
    public final ArrayList m81568AM() {
        return this.f75000R0;
    }

    /* renamed from: BM */
    public final byte m81569BM() {
        return this.f75015g1;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String string;
        super.mo37111CJ(bundle);
        m81577NM(new C23528a(this.f72421L0.m92648SI()));
        try {
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null) {
                if (m92642L3.containsKey("oaSuggest") && (string = m92642L3.getString("oaSuggest")) != null) {
                    this.f74999Q0 = new C19423o(new JSONObject(string));
                }
                if (m92642L3.containsKey("extra_group_id")) {
                    String string2 = m92642L3.getString("extra_group_id");
                    if (TextUtils.isEmpty(string2)) {
                        string2 = "0";
                    }
                    AbstractC19074t.m100205c(string2);
                    this.f75018j1 = Integer.parseInt(string2);
                    this.f75019k1 = true;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: CM */
    public final byte m81570CM() {
        return this.f75016h1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                return null;
            }
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_category_group_event_title));
            aVar.m43160i(new String[]{AbstractC23136l9.m118743r0(AbstractC8020f0.str_unfollow_group_OA_for_group_text), AbstractC23136l9.m118743r0(AbstractC8020f0.close)}, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.cx
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    ManageOACategoryDetailView.m81561HM(ManageOACategoryDetailView.this, interfaceC17463d, i12);
                }
            });
            C8009j m43152a = aVar.m43152a();
            m43152a.m92873y(true);
            return m43152a;
        }
        C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
        aVar2.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_category_event_title));
        aVar2.m43160i(new String[]{AbstractC23136l9.m118743r0(AbstractC8020f0.str_unfollow_OA_personal_text), AbstractC23136l9.m118743r0(AbstractC8020f0.close)}, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.bx
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                ManageOACategoryDetailView.m81562IM(ManageOACategoryDetailView.this, interfaceC17463d, i12);
            }
        });
        C8009j m43152a2 = aVar2.m43152a();
        m43152a2.m92873y(true);
        return m43152a2;
    }

    /* renamed from: DM */
    public final int m81571DM() {
        return this.f75013e1;
    }

    /* renamed from: EM */
    public final void m81572EM(int i11, int i12, int i13) {
        if (this.f75007Y0 == 0) {
            C30030s5 m81592lM = m81592lM();
            m81592lM.f139292r.setVisibility(8);
            m81592lM.f139291q.setVisibility(0);
            m81592lM.f139291q.setState(MultiStateView.EnumC15914e.LOADING);
        } else {
            this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ax
                @Override // java.lang.Runnable
                public final void run() {
                    ManageOACategoryDetailView.m81560FM(ManageOACategoryDetailView.this);
                }
            });
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14570b());
        c0766k.mo1619d6(i11, i12, i13, this.f75019k1, this.f75018j1);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        m81576MM(new LinearLayoutManager(this.f72421L0.getContext()));
        C30030s5 m148481c = C30030s5.m148481c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148481c, "inflate(...)");
        m148481c.f139291q.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.zw
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                ManageOACategoryDetailView.m81563JM(ManageOACategoryDetailView.this);
            }
        });
        RecyclerView recyclerView = m148481c.f139292r;
        recyclerView.setLayoutManager(m81594nM());
        recyclerView.m9826E(new C14571c());
        m81574KM(m148481c);
        LinearLayout root = m81592lM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: GM */
    public final int m81573GM() {
        return this.f75011c1;
    }

    /* renamed from: KM */
    public final void m81574KM(C30030s5 c30030s5) {
        AbstractC19074t.m100208f(c30030s5, "<set-?>");
        this.f75021m1 = c30030s5;
    }

    /* renamed from: LM */
    public final void m81575LM(int i11) {
        this.f75012d1 = i11;
    }

    /* renamed from: MM */
    public final void m81576MM(LinearLayoutManager linearLayoutManager) {
        AbstractC19074t.m100208f(linearLayoutManager, "<set-?>");
        this.f75010b1 = linearLayoutManager;
    }

    /* renamed from: NM */
    public final void m81577NM(C23528a c23528a) {
        AbstractC19074t.m100208f(c23528a, "<set-?>");
        this.f74998P0 = c23528a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        C19423o c19423o;
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null && (c19423o = this.f74999Q0) != null) {
            String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_title_screen_detail_oa_event_suggest, c19423o.f96365b);
            AbstractC19074t.m100207e(m118746s0, "getString(...)");
            m87077NK.setMiddleTitle(m118746s0);
        }
    }

    /* renamed from: OM */
    public final void m81578OM(int i11) {
        this.f75007Y0 = i11;
    }

    /* renamed from: PM */
    public final void m81579PM(C19410b c19410b) {
        this.f75014f1 = c19410b;
    }

    /* renamed from: QM */
    public final void m81580QM(int i11) {
        this.f75017i1 = i11;
    }

    /* renamed from: RM */
    public final void m81581RM(boolean z11) {
        this.f75008Z0 = z11;
    }

    /* renamed from: SM */
    public final void m81582SM(boolean z11) {
        this.f75009a1 = z11;
    }

    /* renamed from: TM */
    public final void m81583TM(int i11) {
        this.f75006X0 = i11;
    }

    /* renamed from: UM */
    public final void m81584UM(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "<set-?>");
        this.f75000R0 = arrayList;
    }

    /* renamed from: VM */
    public final void m81585VM(byte b11) {
        this.f75015g1 = b11;
    }

    /* renamed from: WM */
    public final void m81586WM(byte b11) {
        this.f75016h1 = b11;
    }

    /* renamed from: XM */
    public final void m81587XM() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f75002T0.iterator();
        while (it.hasNext()) {
            C19410b c19410b = (C19410b) it.next();
            if (c19410b != null) {
                jSONArray.put(c19410b.m101525a());
            }
        }
        Intent intent = new Intent();
        intent.putExtra("resultEventSuggest", jSONArray.toString());
        this.f72421L0.mo50035CK(1, intent);
    }

    /* renamed from: YM */
    public final void m81588YM(int i11) {
        this.f75011c1 = i11;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        Context m92689tK = this.f72421L0.m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        ManageCalendarCateEventInfoAdapter manageCalendarCateEventInfoAdapter = new ManageCalendarCateEventInfoAdapter(m92689tK, m81595oM());
        manageCalendarCateEventInfoAdapter.m35725R(new C14572d());
        manageCalendarCateEventInfoAdapter.m35726S(new C14573e());
        this.f75005W0 = manageCalendarCateEventInfoAdapter;
        m81592lM().f139292r.setAdapter(this.f75005W0);
        if (this.f75008Z0) {
            C19423o c19423o = this.f74999Q0;
            AbstractC19074t.m100205c(c19423o);
            m81572EM(c19423o.f96364a, this.f75007Y0, this.f75006X0);
        }
    }

    /* renamed from: ZM */
    public final void m81589ZM(int i11, ArrayList arrayList) {
        mo49282B8(AbstractC23136l9.m118743r0(AbstractC8020f0.loading), true);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14574f(i11));
        JSONObject jSONObject = new JSONObject();
        try {
            int i12 = this.f75020l1;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            jSONObject.put("srcType", 4);
                        }
                    } else {
                        jSONObject.put("srcType", 3);
                    }
                } else {
                    jSONObject.put("srcType", 2);
                }
            } else {
                jSONObject.put("srcType", 1);
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
            mo49315c4();
        }
        c0766k.mo1740t4(i11, arrayList, jSONObject.toString());
    }

    /* renamed from: aN */
    public final void m81590aN(C19410b c19410b) {
        AbstractC19074t.m100208f(c19410b, "calendarCateEventInfo");
        if (!this.f75003U0.containsKey(Integer.valueOf(c19410b.f96252a))) {
            this.f75002T0.add(c19410b);
            this.f75003U0.put(Integer.valueOf(c19410b.f96252a), c19410b);
            return;
        }
        int size = this.f75002T0.size();
        for (int i11 = 0; i11 < size; i11++) {
            C19410b c19410b2 = (C19410b) this.f75002T0.get(i11);
            if (c19410b2 != null && c19410b2.f96252a == c19410b.f96252a) {
                this.f75002T0.remove(i11);
                this.f75002T0.add(c19410b);
                return;
            }
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ManageOACategoryDetailView";
    }

    /* renamed from: kM */
    public final ArrayList m81591kM(ArrayList arrayList) {
        int i11;
        AbstractC19074t.m100208f(arrayList, "listEventCate");
        ArrayList arrayList2 = new ArrayList();
        if (this.f75019k1) {
            i11 = AbstractC8020f0.str_intro_add_event_group;
        } else {
            i11 = AbstractC8020f0.str_intro_add_event_personal;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(i11);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        arrayList2.add(new C31982k(0, null, null, m118743r0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C31982k(3, null, (C19410b) it.next(), ""));
        }
        return arrayList2;
    }

    /* renamed from: lM */
    public final C30030s5 m81592lM() {
        C30030s5 c30030s5 = this.f75021m1;
        if (c30030s5 != null) {
            return c30030s5;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: mM */
    public final int m81593mM() {
        return this.f75012d1;
    }

    /* renamed from: nM */
    public final LinearLayoutManager m81594nM() {
        LinearLayoutManager linearLayoutManager = this.f75010b1;
        if (linearLayoutManager != null) {
            return linearLayoutManager;
        }
        AbstractC19074t.m100223u("linearLayoutManager");
        return null;
    }

    /* renamed from: oM */
    public final C23528a m81595oM() {
        C23528a c23528a = this.f74998P0;
        if (c23528a != null) {
            return c23528a;
        }
        AbstractC19074t.m100223u("mAQ");
        return null;
    }

    /* renamed from: pM */
    public final ManageCalendarCateEventInfoAdapter m81596pM() {
        return this.f75005W0;
    }

    /* renamed from: qM */
    public final C19423o m81597qM() {
        return this.f74999Q0;
    }

    /* renamed from: rM */
    public final int m81598rM() {
        return this.f75007Y0;
    }

    /* renamed from: sM */
    public final int m81599sM() {
        return this.f75017i1;
    }

    /* renamed from: tM */
    public final int m81600tM() {
        return this.f75018j1;
    }

    /* renamed from: uM */
    public final boolean m81601uM() {
        return this.f75008Z0;
    }

    /* renamed from: vM */
    public final HashMap m81602vM() {
        return this.f75004V0;
    }

    /* renamed from: wM */
    public final boolean m81603wM() {
        return this.f75019k1;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f75020l1 = m92642L3.getInt("INT_EXTRA_TRACKING_SOURCE", 0);
        }
    }

    /* renamed from: xM */
    public final boolean m81604xM() {
        return this.f75009a1;
    }

    /* renamed from: yM */
    public final int m81605yM() {
        return this.f75006X0;
    }

    /* renamed from: zM */
    public final ArrayList m81606zM() {
        return this.f75001S0;
    }
}
