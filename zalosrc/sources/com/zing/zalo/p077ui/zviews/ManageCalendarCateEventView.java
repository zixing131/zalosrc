package com.zing.zalo.p077ui.zviews;

import ae.C0766k;
import am.C0927o;
import am.C0943w;
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
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.zviews.ManageCalendarCateEventView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import ee.C18408p;
import ee.C18415w;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ge.C19410b;
import ge.C19422n;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import me0.AbstractC23136l9;
import me0.AbstractC23178p7;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p354n3.C23528a;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import p649xl.C30013r5;
import p716zh.C31973j5;
import p716zh.C31982k;
import zc0.C31784b;

/* loaded from: classes6.dex */
public final class ManageCalendarCateEventView extends SlidableZaloView implements C23744a.c {
    public static final C14555a Companion = new C14555a(null);

    /* renamed from: P0 */
    private int f74904P0;

    /* renamed from: Q0 */
    public C23528a f74905Q0;

    /* renamed from: U0 */
    private ManageCalendarCateEventInfoAdapter f74909U0;

    /* renamed from: W0 */
    private int f74911W0;

    /* renamed from: Y0 */
    private boolean f74913Y0;

    /* renamed from: a1 */
    public LinearLayoutManager f74915a1;

    /* renamed from: b1 */
    private int f74916b1;

    /* renamed from: c1 */
    private int f74917c1;

    /* renamed from: d1 */
    private C19410b f74918d1;

    /* renamed from: e1 */
    private byte f74919e1;

    /* renamed from: f1 */
    private byte f74920f1;

    /* renamed from: g1 */
    private int f74921g1;

    /* renamed from: h1 */
    private boolean f74922h1;

    /* renamed from: i1 */
    private int f74923i1;

    /* renamed from: j1 */
    private C31973j5 f74924j1;

    /* renamed from: k1 */
    public C30013r5 f74925k1;

    /* renamed from: l1 */
    private boolean f74926l1;

    /* renamed from: m1 */
    private boolean f74927m1;

    /* renamed from: R0 */
    private ArrayList f74906R0 = new ArrayList();

    /* renamed from: S0 */
    private ArrayList f74907S0 = new ArrayList();

    /* renamed from: T0 */
    private HashMap f74908T0 = new HashMap();

    /* renamed from: V0 */
    private int f74910V0 = -1;

    /* renamed from: X0 */
    private boolean f74912X0 = true;

    /* renamed from: Z0 */
    private int f74914Z0 = 2;

    /* renamed from: com.zing.zalo.ui.zviews.ManageCalendarCateEventView$a */
    /* loaded from: classes6.dex */
    public static final class C14555a {
        private C14555a() {
        }

        public /* synthetic */ C14555a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ManageCalendarCateEventView$b */
    /* loaded from: classes6.dex */
    public static final class C14556b implements InterfaceC20094a {
        C14556b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static final void m81485g(C19410b c19410b) {
            AbstractC19074t.m100208f(c19410b, "$this_apply");
            ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_toast_msg_unfollow_group_cate_by_group_success, c19410b.f96253b));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public static final void m81486h() {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_msg_unfollow_personal_cate_success));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public static final void m81487i(C19410b c19410b) {
            int i11;
            AbstractC19074t.m100208f(c19410b, "$this_apply");
            if (c19410b.f96255d) {
                i11 = AbstractC8020f0.str_toast_msg_follow_group_cate_by_personal_success;
            } else {
                i11 = AbstractC8020f0.str_toast_msg_unfollow_group_cate_by_personal_success;
            }
            ToastUtils.showMess(AbstractC23136l9.m118743r0(i11));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public static final void m81488j(ManageCalendarCateEventView manageCalendarCateEventView) {
            AbstractC19074t.m100208f(manageCalendarCateEventView, "this$0");
            ManageCalendarCateEventInfoAdapter m81476vM = manageCalendarCateEventView.m81476vM();
            if (m81476vM != null) {
                m81476vM.m35724Q(manageCalendarCateEventView.m81453GM());
                m81476vM.m10008p();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            ManageCalendarCateEventView.this.mo49315c4();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            ManageCalendarCateEventView.this.mo49315c4();
            final C19410b m81479yM = ManageCalendarCateEventView.this.m81479yM();
            if (m81479yM != null) {
                ManageCalendarCateEventView manageCalendarCateEventView = ManageCalendarCateEventView.this;
                int size = manageCalendarCateEventView.m81452FM().size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    if (m81479yM.f96252a == ((C19410b) manageCalendarCateEventView.m81452FM().get(i11)).f96252a) {
                        if (manageCalendarCateEventView.m81477wM()) {
                            manageCalendarCateEventView.m81448BM().remove(Integer.valueOf(((C19410b) manageCalendarCateEventView.m81452FM().get(i11)).f96252a));
                            manageCalendarCateEventView.m81452FM().remove(i11);
                            if (manageCalendarCateEventView.m81449CM()) {
                                manageCalendarCateEventView.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.gw
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ManageCalendarCateEventView.C14556b.m81485g(C19410b.this);
                                    }
                                });
                            } else {
                                manageCalendarCateEventView.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.hw
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ManageCalendarCateEventView.C14556b.m81486h();
                                    }
                                });
                            }
                        } else {
                            ((C19410b) manageCalendarCateEventView.m81452FM().get(i11)).f96255d = m81479yM.f96255d;
                            if (manageCalendarCateEventView.m81449CM()) {
                                manageCalendarCateEventView.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.iw
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ManageCalendarCateEventView.C14556b.m81487i(C19410b.this);
                                    }
                                });
                            }
                        }
                    } else {
                        i11++;
                    }
                }
            }
            ManageCalendarCateEventView manageCalendarCateEventView2 = ManageCalendarCateEventView.this;
            manageCalendarCateEventView2.m81468eN(manageCalendarCateEventView2.m81445pM(manageCalendarCateEventView2.m81452FM()));
            final ManageCalendarCateEventView manageCalendarCateEventView3 = ManageCalendarCateEventView.this;
            manageCalendarCateEventView3.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.jw
                @Override // java.lang.Runnable
                public final void run() {
                    ManageCalendarCateEventView.C14556b.m81488j(ManageCalendarCateEventView.this);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ManageCalendarCateEventView$c */
    /* loaded from: classes6.dex */
    public static final class C14557c implements InterfaceC20094a {
        C14557c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m81491e(ManageCalendarCateEventView manageCalendarCateEventView) {
            AbstractC19074t.m100208f(manageCalendarCateEventView, "this$0");
            SwipeRefreshLayout swipeRefreshLayout = manageCalendarCateEventView.m81472rM().f139207s;
            swipeRefreshLayout.setRefreshing(false);
            swipeRefreshLayout.setVisibility(0);
            ManageCalendarCateEventInfoAdapter m81476vM = manageCalendarCateEventView.m81476vM();
            if (m81476vM != null) {
                m81476vM.m35724Q(manageCalendarCateEventView.m81453GM());
                m81476vM.m10008p();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m81492f(ManageCalendarCateEventView manageCalendarCateEventView, C20096c c20096c) {
            int i11;
            MultiStateView.EnumC15915f enumC15915f;
            AbstractC19074t.m100208f(manageCalendarCateEventView, "this$0");
            AbstractC19074t.m100208f(c20096c, "$errorMessage");
            C30013r5 m81472rM = manageCalendarCateEventView.m81472rM();
            m81472rM.f139207s.setRefreshing(false);
            m81472rM.f139205q.setVisibility(8);
            if (manageCalendarCateEventView.m81453GM().size() > 0 && ((C31982k) manageCalendarCateEventView.m81453GM().get(manageCalendarCateEventView.m81453GM().size() - 1)).f147039a == 5) {
                manageCalendarCateEventView.m81453GM().remove(manageCalendarCateEventView.m81453GM().size() - 1);
                ManageCalendarCateEventInfoAdapter m81476vM = manageCalendarCateEventView.m81476vM();
                if (m81476vM != null) {
                    m81476vM.m35724Q(manageCalendarCateEventView.m81453GM());
                    m81476vM.m10008p();
                }
            }
            if (manageCalendarCateEventView.m81452FM().size() == 0) {
                m81472rM.f139207s.setVisibility(8);
                if (c20096c.m104491c() == 50001) {
                    i11 = AbstractC8020f0.empty_text_network_error;
                } else {
                    i11 = AbstractC8020f0.unknown_error;
                }
                String m118743r0 = AbstractC23136l9.m118743r0(i11);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                MultiStateView multiStateView = m81472rM.f139205q;
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
            final ManageCalendarCateEventView manageCalendarCateEventView = ManageCalendarCateEventView.this;
            manageCalendarCateEventView.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.lw
                @Override // java.lang.Runnable
                public final void run() {
                    ManageCalendarCateEventView.C14557c.m81492f(ManageCalendarCateEventView.this, c20096c);
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
                ManageCalendarCateEventView manageCalendarCateEventView = ManageCalendarCateEventView.this;
                manageCalendarCateEventView.m81467dN(optJSONObject.optInt("lastCateId"));
                if (optJSONObject.optInt("hasMore") == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                manageCalendarCateEventView.m81465bN(z11);
                manageCalendarCateEventView.m81462YM(manageCalendarCateEventView.m81478xM() + 1);
                JSONArray optJSONArray = optJSONObject.optJSONArray("eventCates");
                if (optJSONArray != null) {
                    ManageCalendarCateEventView manageCalendarCateEventView2 = ManageCalendarCateEventView.this;
                    int length = optJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject optJSONObject2 = optJSONArray.optJSONObject(i11);
                        AbstractC19074t.m100207e(optJSONObject2, "optJSONObject(...)");
                        C19410b c19410b = new C19410b(optJSONObject2);
                        if (!manageCalendarCateEventView2.m81448BM().containsKey(Integer.valueOf(c19410b.f96252a))) {
                            manageCalendarCateEventView2.m81452FM().add(c19410b);
                            manageCalendarCateEventView2.m81448BM().put(Integer.valueOf(c19410b.f96252a), c19410b);
                        }
                    }
                }
            }
            ManageCalendarCateEventView manageCalendarCateEventView3 = ManageCalendarCateEventView.this;
            manageCalendarCateEventView3.m81468eN(manageCalendarCateEventView3.m81445pM(manageCalendarCateEventView3.m81452FM()));
            final ManageCalendarCateEventView manageCalendarCateEventView4 = ManageCalendarCateEventView.this;
            manageCalendarCateEventView4.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.kw
                @Override // java.lang.Runnable
                public final void run() {
                    ManageCalendarCateEventView.C14557c.m81491e(ManageCalendarCateEventView.this);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ManageCalendarCateEventView$d */
    /* loaded from: classes6.dex */
    public static final class C14558d extends RecyclerView.AbstractC1892s {
        C14558d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            ManageCalendarCateEventInfoAdapter.InterfaceC6972g interfaceC6972g;
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo10176d(recyclerView, i11, i12);
            ManageCalendarCateEventView manageCalendarCateEventView = ManageCalendarCateEventView.this;
            manageCalendarCateEventView.m81471hN(manageCalendarCateEventView.m81474tM().m10127i());
            ManageCalendarCateEventView manageCalendarCateEventView2 = ManageCalendarCateEventView.this;
            manageCalendarCateEventView2.m81459VM(manageCalendarCateEventView2.m81474tM().m9745c2());
            if (ManageCalendarCateEventView.this.m81447AM() && !ManageCalendarCateEventView.this.m81450DM() && ManageCalendarCateEventView.this.m81457LM() <= ManageCalendarCateEventView.this.m81473sM() + ManageCalendarCateEventView.this.m81455IM()) {
                ManageCalendarCateEventInfoAdapter m81476vM = ManageCalendarCateEventView.this.m81476vM();
                if (m81476vM != null && (interfaceC6972g = m81476vM.f38115v) != null) {
                    interfaceC6972g.mo35735a();
                }
                ManageCalendarCateEventView.this.m81466cN(true);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ManageCalendarCateEventView$e */
    /* loaded from: classes6.dex */
    public static final class C14559e extends ManageCalendarCateEventInfoAdapter.C6971f {
        C14559e() {
        }

        @Override // com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter.C6971f
        /* renamed from: b */
        public void mo35734b(C19410b c19410b) {
            byte b11;
            byte b12;
            int parseInt;
            AbstractC19074t.m100208f(c19410b, "eventInfo");
            ManageCalendarCateEventView.this.m81463ZM(c19410b);
            ManageCalendarCateEventView manageCalendarCateEventView = ManageCalendarCateEventView.this;
            if (manageCalendarCateEventView.m81449CM()) {
                b11 = 2;
            } else {
                b11 = 1;
            }
            manageCalendarCateEventView.m81469fN(b11);
            ManageCalendarCateEventView manageCalendarCateEventView2 = ManageCalendarCateEventView.this;
            if (manageCalendarCateEventView2.m81449CM()) {
                b12 = 2;
            } else {
                b12 = 1;
            }
            manageCalendarCateEventView2.m81470gN(b12);
            ManageCalendarCateEventView manageCalendarCateEventView3 = ManageCalendarCateEventView.this;
            if (manageCalendarCateEventView3.m81449CM()) {
                parseInt = ManageCalendarCateEventView.this.m81480zM();
            } else {
                String str = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str, "currentUserUid");
                parseInt = Integer.parseInt(str);
            }
            manageCalendarCateEventView3.m81464aN(parseInt);
            if (ManageCalendarCateEventView.this.m81454HM() == 1) {
                ManageCalendarCateEventView.this.f72421L0.showDialog(1);
            } else if (ManageCalendarCateEventView.this.m81454HM() == 2) {
                ManageCalendarCateEventView.this.showDialog(2);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ManageCalendarCateEventView$f */
    /* loaded from: classes6.dex */
    public static final class C14560f implements ManageCalendarCateEventInfoAdapter.InterfaceC6972g {
        C14560f() {
        }

        @Override // com.zing.zalo.adapters.ManageCalendarCateEventInfoAdapter.InterfaceC6972g
        /* renamed from: a */
        public void mo35735a() {
            if (ManageCalendarCateEventView.this.m81447AM()) {
                ManageCalendarCateEventView manageCalendarCateEventView = ManageCalendarCateEventView.this;
                manageCalendarCateEventView.m81456JM(manageCalendarCateEventView.m81478xM(), ManageCalendarCateEventView.this.m81451EM(), ManageCalendarCateEventView.this.m81449CM(), ManageCalendarCateEventView.this.m81480zM());
            } else {
                ManageCalendarCateEventView.this.m81466cN(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public static final void m81427KM(ManageCalendarCateEventView manageCalendarCateEventView) {
        AbstractC19074t.m100208f(manageCalendarCateEventView, "this$0");
        manageCalendarCateEventView.f74906R0.add(new C31982k(5, null, null, ""));
        ManageCalendarCateEventInfoAdapter manageCalendarCateEventInfoAdapter = manageCalendarCateEventView.f74909U0;
        if (manageCalendarCateEventInfoAdapter != null) {
            manageCalendarCateEventInfoAdapter.m35724Q(manageCalendarCateEventView.f74906R0);
            manageCalendarCateEventInfoAdapter.m10008p();
        }
    }

    /* renamed from: MM */
    private final void m81428MM() {
        Intent intent = new Intent();
        intent.putExtra("isRefreshView", true);
        this.f72421L0.mo50035CK(3, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NM */
    public static final void m81429NM(ManageCalendarCateEventView manageCalendarCateEventView) {
        AbstractC19074t.m100208f(manageCalendarCateEventView, "this$0");
        ArrayList m81445pM = manageCalendarCateEventView.m81445pM(manageCalendarCateEventView.f74907S0);
        manageCalendarCateEventView.f74906R0 = m81445pM;
        if (m81445pM.size() > 0) {
            ManageCalendarCateEventInfoAdapter manageCalendarCateEventInfoAdapter = manageCalendarCateEventView.f74909U0;
            if (manageCalendarCateEventInfoAdapter != null) {
                manageCalendarCateEventInfoAdapter.m35724Q(manageCalendarCateEventView.f74906R0);
                manageCalendarCateEventInfoAdapter.m10008p();
                return;
            }
            return;
        }
        manageCalendarCateEventView.f72421L0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OM */
    public static final void m81430OM(ManageCalendarCateEventView manageCalendarCateEventView) {
        AbstractC19074t.m100208f(manageCalendarCateEventView, "this$0");
        ArrayList m81445pM = manageCalendarCateEventView.m81445pM(manageCalendarCateEventView.f74907S0);
        manageCalendarCateEventView.f74906R0 = m81445pM;
        if (m81445pM.size() > 0) {
            ManageCalendarCateEventInfoAdapter manageCalendarCateEventInfoAdapter = manageCalendarCateEventView.f74909U0;
            if (manageCalendarCateEventInfoAdapter != null) {
                manageCalendarCateEventInfoAdapter.m35724Q(manageCalendarCateEventView.f74906R0);
                manageCalendarCateEventInfoAdapter.m10008p();
                return;
            }
            return;
        }
        manageCalendarCateEventView.f72421L0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PM */
    public static final void m81431PM(ManageCalendarCateEventView manageCalendarCateEventView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(manageCalendarCateEventView, "this$0");
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC17463d.dismiss();
                return;
            }
            return;
        }
        manageCalendarCateEventView.f74926l1 = true;
        interfaceC17463d.dismiss();
        C19410b c19410b = manageCalendarCateEventView.f74918d1;
        AbstractC19074t.m100205c(c19410b);
        int i12 = c19410b.f96252a;
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        int parseInt = Integer.parseInt(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C19422n((byte) 1, parseInt, (byte) 1, (byte) 0));
        manageCalendarCateEventView.m81446qM(i12, arrayList);
        manageCalendarCateEventView.m81428MM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QM */
    public static final void m81432QM(ManageCalendarCateEventView manageCalendarCateEventView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(manageCalendarCateEventView, "this$0");
        ArrayList arrayList = new ArrayList();
        C19410b c19410b = manageCalendarCateEventView.f74918d1;
        AbstractC19074t.m100205c(c19410b);
        int i12 = c19410b.f96252a;
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC17463d.dismiss();
            }
        } else {
            manageCalendarCateEventView.f74926l1 = true;
            arrayList.add(new C19422n((byte) 2, manageCalendarCateEventView.f74923i1, (byte) 2, (byte) 0));
            manageCalendarCateEventView.m81428MM();
        }
        manageCalendarCateEventView.m81446qM(i12, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RM */
    public static final void m81433RM(ManageCalendarCateEventView manageCalendarCateEventView) {
        AbstractC19074t.m100208f(manageCalendarCateEventView, "this$0");
        manageCalendarCateEventView.m81456JM(manageCalendarCateEventView.f74911W0, manageCalendarCateEventView.f74910V0, manageCalendarCateEventView.f74922h1, manageCalendarCateEventView.f74923i1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SM */
    public static final void m81434SM(ManageCalendarCateEventView manageCalendarCateEventView, RecyclerView recyclerView, int i11, View view) {
        C31982k m35720M;
        AbstractC19074t.m100208f(manageCalendarCateEventView, "this$0");
        ManageCalendarCateEventInfoAdapter manageCalendarCateEventInfoAdapter = manageCalendarCateEventView.f74909U0;
        if (manageCalendarCateEventInfoAdapter != null && (m35720M = manageCalendarCateEventInfoAdapter.m35720M(i11)) != null) {
            int i12 = m35720M.f147039a;
            if (i12 != 1) {
                if (i12 != 6) {
                    if (i12 != 7) {
                        if (i12 == 8) {
                            manageCalendarCateEventView.showDialog(5);
                            return;
                        }
                        return;
                    }
                    Bundle bundle = new Bundle();
                    if (manageCalendarCateEventView.f74922h1) {
                        int i13 = manageCalendarCateEventView.f74923i1;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i13);
                        bundle.putString("extra_group_id", sb2.toString());
                    }
                    bundle.putInt("INT_EXTRA_TRACKING_SOURCE", manageCalendarCateEventView.f74904P0);
                    InterfaceC27218a m92676n2 = manageCalendarCateEventView.f72421L0.m92676n2();
                    if (m92676n2 != null) {
                        m92676n2.mo35581q(ManageOACategoryView.class, bundle, 1, 1, true);
                        return;
                    }
                    return;
                }
                int i14 = ((ManageCalendarCateEventInfoAdapter.C6973h) m35720M).f38148e;
                if (i14 != 1) {
                    if (i14 == 2) {
                        AbstractC23178p7.m119403b(manageCalendarCateEventView.f72421L0.m92676n2());
                        return;
                    }
                    return;
                } else {
                    C18408p.a aVar = C18408p.Companion;
                    if (aVar.m97553s()) {
                        aVar.m97550o().m97530m0();
                        return;
                    } else {
                        manageCalendarCateEventView.showDialog(4);
                        return;
                    }
                }
            }
            manageCalendarCateEventView.f74918d1 = m35720M.f147041c;
            if (manageCalendarCateEventView.f74922h1) {
                manageCalendarCateEventView.f72421L0.showDialog(2);
            } else {
                manageCalendarCateEventView.f72421L0.showDialog(1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TM */
    public static final void m81435TM(ManageCalendarCateEventView manageCalendarCateEventView) {
        AbstractC19074t.m100208f(manageCalendarCateEventView, "this$0");
        manageCalendarCateEventView.f74911W0 = 0;
        manageCalendarCateEventView.f74910V0 = -1;
        manageCalendarCateEventView.f74908T0.clear();
        manageCalendarCateEventView.f74907S0.clear();
        manageCalendarCateEventView.m81456JM(manageCalendarCateEventView.f74911W0, manageCalendarCateEventView.f74910V0, manageCalendarCateEventView.f74922h1, manageCalendarCateEventView.f74923i1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public final synchronized ArrayList m81445pM(ArrayList arrayList) {
        ArrayList arrayList2;
        int i11;
        try {
            arrayList2 = new ArrayList();
            if (!this.f74922h1) {
                arrayList2.add(new ManageCalendarCateEventInfoAdapter.C6969d(AbstractC23136l9.m118743r0(AbstractC8020f0.str_other_setting_personal), false));
                arrayList2.add(new ManageCalendarCateEventInfoAdapter.C6973h(1, false));
                arrayList2.add(new ManageCalendarCateEventInfoAdapter.C6970e(1));
                arrayList2.add(new ManageCalendarCateEventInfoAdapter.C6973h(2, false));
            }
            if (this.f74922h1) {
                C31973j5 c31973j5 = this.f74924j1;
                if (c31973j5 != null && c31973j5.m153747Y()) {
                    i11 = AbstractC8020f0.str_oa_event_following_title_community;
                } else {
                    i11 = AbstractC8020f0.str_oa_event_following_title_group;
                }
            } else {
                i11 = AbstractC8020f0.str_oa_event_following_title;
            }
            arrayList2.add(new ManageCalendarCateEventInfoAdapter.C6969d(AbstractC23136l9.m118743r0(i11), !this.f74922h1));
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_add_oa_event);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            arrayList2.add(new C31982k(7, null, null, m118743r0));
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                arrayList2.add(new C31982k(1, null, (C19410b) arrayList.get(i12), ""));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList2;
    }

    /* renamed from: qM */
    private final void m81446qM(int i11, ArrayList arrayList) {
        mo49282B8(AbstractC23136l9.m118743r0(AbstractC8020f0.loading), true);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14556b());
        JSONObject jSONObject = new JSONObject();
        try {
            int i12 = this.f74904P0;
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
            AbstractC23350e.m122778h(e11);
        }
        c0766k.mo1740t4(i11, arrayList, jSONObject.toString());
    }

    /* renamed from: AM */
    public final boolean m81447AM() {
        return this.f74912X0;
    }

    /* renamed from: BM */
    public final HashMap m81448BM() {
        return this.f74908T0;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m81461XM(new C23528a(this.f72421L0.m92648SI()));
        try {
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null && m92642L3.containsKey("extra_group_id")) {
                String string = m92642L3.getString("extra_group_id");
                if (TextUtils.isEmpty(string)) {
                    string = "0";
                }
                C31973j5 m4472f = C0943w.f3447a.m4472f(string);
                this.f74924j1 = m4472f;
                if (m4472f != null) {
                    this.f74922h1 = true;
                    AbstractC19074t.m100205c(string);
                    this.f74923i1 = Integer.parseInt(string);
                } else {
                    this.f74922h1 = false;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: CM */
    public final boolean m81449CM() {
        return this.f74922h1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        return null;
                    }
                    C8009j.a aVar = new C8009j.a(m92648SI());
                    aVar.m43177z(LayoutInflater.from(m92648SI()).inflate(AbstractC7409c0.calendar_instruction_learn_more_mute_thread, (ViewGroup) null));
                    aVar.m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), null);
                    aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_instruction_calendar_hide_thread_title));
                    aVar.m43173v(3);
                    return aVar.m43152a();
                }
                return C18415w.m97593f(getContext());
            }
            C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
            aVar2.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_category_group_event_title));
            aVar2.m43160i(new String[]{AbstractC23136l9.m118743r0(AbstractC8020f0.str_unfollow_group_OA_for_group_text), AbstractC23136l9.m118743r0(AbstractC8020f0.close)}, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.zv
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    ManageCalendarCateEventView.m81432QM(ManageCalendarCateEventView.this, interfaceC17463d, i12);
                }
            });
            C8009j m43152a = aVar2.m43152a();
            m43152a.m92873y(true);
            return m43152a;
        }
        this.f74926l1 = false;
        C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
        aVar3.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_category_event_title));
        aVar3.m43160i(new String[]{AbstractC23136l9.m118743r0(AbstractC8020f0.str_unfollow_OA_personal_text), AbstractC23136l9.m118743r0(AbstractC8020f0.close)}, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.yv
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                ManageCalendarCateEventView.m81431PM(ManageCalendarCateEventView.this, interfaceC17463d, i12);
            }
        });
        C8009j m43152a2 = aVar3.m43152a();
        m43152a2.m92873y(true);
        return m43152a2;
    }

    /* renamed from: DM */
    public final boolean m81450DM() {
        return this.f74913Y0;
    }

    /* renamed from: EM */
    public final int m81451EM() {
        return this.f74910V0;
    }

    /* renamed from: FM */
    public final ArrayList m81452FM() {
        return this.f74907S0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        this.f74906R0 = m81445pM(this.f74907S0);
        m81460WM(new LinearLayoutManager(this.f72421L0.getContext()));
        C30013r5 m148438a = C30013r5.m148438a(layoutInflater.inflate(AbstractC7409c0.layout_manage_oa_cate_event_view, (ViewGroup) null, false));
        AbstractC19074t.m100207e(m148438a, "bind(...)");
        m148438a.f139205q.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.dw
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                ManageCalendarCateEventView.m81433RM(ManageCalendarCateEventView.this);
            }
        });
        RecyclerView recyclerView = m148438a.f139206r;
        recyclerView.setLayoutManager(m81474tM());
        C31784b.m152808a(recyclerView).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.ew
            @Override // zc0.C31784b.d
            /* renamed from: i0 */
            public final void mo17458i0(RecyclerView recyclerView2, int i11, View view) {
                ManageCalendarCateEventView.m81434SM(ManageCalendarCateEventView.this, recyclerView2, i11, view);
            }
        });
        recyclerView.m9826E(new C14558d());
        SwipeRefreshLayout swipeRefreshLayout = m148438a.f139207s;
        swipeRefreshLayout.setColorSchemeColors(AbstractC23136l9.m118641B(swipeRefreshLayout.getContext(), AbstractC16801x.primary_blue_color));
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: com.zing.zalo.ui.zviews.fw
            @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
            /* renamed from: a */
            public final void mo12137a() {
                ManageCalendarCateEventView.m81435TM(ManageCalendarCateEventView.this);
            }
        });
        m81458UM(m148438a);
        LinearLayout root = m81472rM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: GM */
    public final ArrayList m81453GM() {
        return this.f74906R0;
    }

    /* renamed from: HM */
    public final byte m81454HM() {
        return this.f74919e1;
    }

    /* renamed from: IM */
    public final int m81455IM() {
        return this.f74914Z0;
    }

    /* renamed from: JM */
    public final void m81456JM(int i11, int i12, boolean z11, int i13) {
        if (this.f74911W0 > 0) {
            this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.cw
                @Override // java.lang.Runnable
                public final void run() {
                    ManageCalendarCateEventView.m81427KM(ManageCalendarCateEventView.this);
                }
            });
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14557c());
        c0766k.mo1683l9(i11, i12, z11, i13);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.Companion.m124119a().m124117e(this, 3053);
    }

    /* renamed from: LM */
    public final int m81457LM() {
        return this.f74916b1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        C31973j5 c31973j5;
        String m153793y;
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            String str = "";
            if (this.f74922h1 && (c31973j5 = this.f74924j1) != null && (m153793y = c31973j5.m153793y()) != null) {
                str = m153793y;
            }
            m87077NK.setMiddleSubtitle(str);
        }
    }

    /* renamed from: UM */
    public final void m81458UM(C30013r5 c30013r5) {
        AbstractC19074t.m100208f(c30013r5, "<set-?>");
        this.f74925k1 = c30013r5;
    }

    /* renamed from: VM */
    public final void m81459VM(int i11) {
        this.f74917c1 = i11;
    }

    /* renamed from: WM */
    public final void m81460WM(LinearLayoutManager linearLayoutManager) {
        AbstractC19074t.m100208f(linearLayoutManager, "<set-?>");
        this.f74915a1 = linearLayoutManager;
    }

    /* renamed from: XM */
    public final void m81461XM(C23528a c23528a) {
        AbstractC19074t.m100208f(c23528a, "<set-?>");
        this.f74905Q0 = c23528a;
    }

    /* renamed from: YM */
    public final void m81462YM(int i11) {
        this.f74911W0 = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:            if (r3.m153778p0() == false) goto L8;     */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        if (this.f74922h1) {
            C31973j5 c31973j5 = this.f74924j1;
            if (c31973j5 != null) {
                AbstractC19074t.m100205c(c31973j5);
            }
            m81472rM().f139207s.setVisibility(8);
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_not_perform_action);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            MultiStateView multiStateView = m81472rM().f139205q;
            multiStateView.setErrorTitleString(m118743r0);
            multiStateView.setState(MultiStateView.EnumC15914e.ERROR);
            multiStateView.setErrorType(MultiStateView.EnumC15915f.UNKNOWN_ERROR);
            multiStateView.setErrorImageResource(AbstractC16803z.watermark_network_error);
            multiStateView.getButtonRetry().setVisibility(8);
            multiStateView.setVisibility(0);
            return;
        }
        Context m92689tK = this.f72421L0.m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        ManageCalendarCateEventInfoAdapter manageCalendarCateEventInfoAdapter = new ManageCalendarCateEventInfoAdapter(m92689tK, m81475uM());
        manageCalendarCateEventInfoAdapter.m35725R(new C14559e());
        manageCalendarCateEventInfoAdapter.m35726S(new C14560f());
        manageCalendarCateEventInfoAdapter.m35724Q(this.f74906R0);
        this.f74909U0 = manageCalendarCateEventInfoAdapter;
        m81472rM().f139206r.setAdapter(this.f74909U0);
        if (this.f74912X0) {
            m81456JM(this.f74911W0, this.f74910V0, this.f74922h1, this.f74923i1);
        }
    }

    /* renamed from: ZM */
    public final void m81463ZM(C19410b c19410b) {
        this.f74918d1 = c19410b;
    }

    /* renamed from: aN */
    public final void m81464aN(int i11) {
        this.f74921g1 = i11;
    }

    /* renamed from: bN */
    public final void m81465bN(boolean z11) {
        this.f74912X0 = z11;
    }

    /* renamed from: cN */
    public final void m81466cN(boolean z11) {
        this.f74913Y0 = z11;
    }

    /* renamed from: dN */
    public final void m81467dN(int i11) {
        this.f74910V0 = i11;
    }

    /* renamed from: eN */
    public final void m81468eN(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "<set-?>");
        this.f74906R0 = arrayList;
    }

    /* renamed from: fN */
    public final void m81469fN(byte b11) {
        this.f74919e1 = b11;
    }

    /* renamed from: gN */
    public final void m81470gN(byte b11) {
        this.f74920f1 = b11;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ManageCalendarCateEventView";
    }

    /* renamed from: hN */
    public final void m81471hN(int i11) {
        this.f74916b1 = i11;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 1 && intent != null) {
            int i13 = 0;
            if (intent.hasExtra("resultEventFollowing")) {
                try {
                    String stringExtra = intent.getStringExtra("resultEventFollowing");
                    if (stringExtra != null) {
                        C19410b c19410b = new C19410b(new JSONObject(stringExtra));
                        Iterator it = this.f74907S0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((C19410b) it.next()).f96252a == c19410b.f96252a) {
                                if (c19410b.f96255d) {
                                    this.f74907S0.set(i13, c19410b);
                                } else {
                                    this.f74907S0.remove(i13);
                                    this.f74908T0.remove(Integer.valueOf(c19410b.f96252a));
                                }
                            } else {
                                i13++;
                            }
                        }
                        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.aw
                            @Override // java.lang.Runnable
                            public final void run() {
                                ManageCalendarCateEventView.m81429NM(ManageCalendarCateEventView.this);
                            }
                        });
                        m81428MM();
                        return;
                    }
                    return;
                } catch (JSONException e11) {
                    AbstractC23350e.m122778h(e11);
                    return;
                }
            }
            if (intent.hasExtra("resultEventSuggest")) {
                try {
                    String stringExtra2 = intent.getStringExtra("resultEventSuggest");
                    if (stringExtra2 != null) {
                        JSONArray jSONArray = new JSONArray(stringExtra2);
                        int length = jSONArray.length();
                        for (int i14 = 0; i14 < length; i14++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i14);
                            AbstractC19074t.m100207e(jSONObject, "getJSONObject(...)");
                            C19410b c19410b2 = new C19410b(jSONObject);
                            if (!this.f74908T0.containsKey(Integer.valueOf(c19410b2.f96252a))) {
                                if (c19410b2.f96255d) {
                                    this.f74907S0.add(0, c19410b2);
                                    this.f74908T0.put(Integer.valueOf(c19410b2.f96252a), c19410b2);
                                }
                            } else {
                                int size = this.f74907S0.size();
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= size) {
                                        break;
                                    }
                                    if (((C19410b) this.f74907S0.get(i15)).f96252a == c19410b2.f96252a) {
                                        if (c19410b2.f96255d) {
                                            this.f74907S0.set(i15, c19410b2);
                                        } else {
                                            this.f74907S0.remove(i15);
                                            this.f74908T0.remove(Integer.valueOf(c19410b2.f96252a));
                                        }
                                    } else {
                                        i15++;
                                    }
                                }
                            }
                        }
                        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.bw
                            @Override // java.lang.Runnable
                            public final void run() {
                                ManageCalendarCateEventView.m81430OM(ManageCalendarCateEventView.this);
                            }
                        });
                        m81428MM();
                    }
                } catch (JSONException e12) {
                    AbstractC23350e.m122778h(e12);
                }
            }
        }
    }

    /* renamed from: rM */
    public final C30013r5 m81472rM() {
        C30013r5 c30013r5 = this.f74925k1;
        if (c30013r5 != null) {
            return c30013r5;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: sM */
    public final int m81473sM() {
        return this.f74917c1;
    }

    /* renamed from: tM */
    public final LinearLayoutManager m81474tM() {
        LinearLayoutManager linearLayoutManager = this.f74915a1;
        if (linearLayoutManager != null) {
            return linearLayoutManager;
        }
        AbstractC19074t.m100223u("linearLayoutManager");
        return null;
    }

    /* renamed from: uM */
    public final C23528a m81475uM() {
        C23528a c23528a = this.f74905Q0;
        if (c23528a != null) {
            return c23528a;
        }
        AbstractC19074t.m100223u("mAQ");
        return null;
    }

    /* renamed from: vM */
    public final ManageCalendarCateEventInfoAdapter m81476vM() {
        return this.f74909U0;
    }

    /* renamed from: wM */
    public final boolean m81477wM() {
        return this.f74926l1;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 3053) {
            try {
                Object obj = objArr[0];
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue != this.f74927m1) {
                    this.f74927m1 = booleanValue;
                    ManageCalendarCateEventInfoAdapter manageCalendarCateEventInfoAdapter = this.f74909U0;
                    if (manageCalendarCateEventInfoAdapter != null) {
                        manageCalendarCateEventInfoAdapter.m10008p();
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f74904P0 = m92642L3.getInt("INT_EXTRA_TRACKING_SOURCE", 0);
        }
    }

    /* renamed from: xM */
    public final int m81478xM() {
        return this.f74911W0;
    }

    /* renamed from: yM */
    public final C19410b m81479yM() {
        return this.f74918d1;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.Companion.m124119a().m124115b(this, 3053);
        this.f74927m1 = C18408p.Companion.m97553s();
    }

    /* renamed from: zM */
    public final int m81480zM() {
        return this.f74923i1;
    }
}
