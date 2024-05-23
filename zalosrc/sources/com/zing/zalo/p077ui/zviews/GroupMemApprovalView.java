package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.C0815e1;
import am.C0943w;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2364o0;
import au.AbstractC2379w;
import c70.C3334c;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7145n;
import com.zing.zalo.adapters.GroupMemApprovalAdapter;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.GroupMemApprovalView;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.uicontrol.SimpleMenuListPopupView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import ed0.AbstractC18391a;
import gw.C19637j;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import i70.C20379a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kd0.C21696f;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.AbstractC23184q2;
import me0.AbstractC23211s7;
import me0.AbstractC23244v8;
import me0.C23212s8;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p656xs.AbstractC30200a;
import p716zh.C31973j5;
import p716zh.C32002l4;
import p716zh.C32174x5;

@SuppressLint({"NotifyDataSetChanged"})
/* loaded from: classes6.dex */
public class GroupMemApprovalView extends SlidableZaloView implements C23744a.c, GroupMemApprovalAdapter.InterfaceC6957h, InterfaceC0733x {

    /* renamed from: g1 */
    static int f73828g1 = 500;

    /* renamed from: P0 */
    View f73829P0;

    /* renamed from: Q0 */
    GroupMemApprovalAdapter f73830Q0;

    /* renamed from: R0 */
    RecyclerView f73831R0;

    /* renamed from: S0 */
    LinearLayoutManager f73832S0;

    /* renamed from: T0 */
    C23528a f73833T0;

    /* renamed from: U0 */
    String f73834U0;

    /* renamed from: Y0 */
    SwipeRefreshLayout f73838Y0;

    /* renamed from: V0 */
    int f73835V0 = 0;

    /* renamed from: W0 */
    int f73836W0 = 0;

    /* renamed from: X0 */
    boolean f73837X0 = false;

    /* renamed from: Z0 */
    final ArrayList f73839Z0 = new ArrayList();

    /* renamed from: a1 */
    final HashSet f73840a1 = new HashSet();

    /* renamed from: b1 */
    String f73841b1 = "";

    /* renamed from: c1 */
    boolean f73842c1 = false;

    /* renamed from: d1 */
    boolean f73843d1 = false;

    /* renamed from: e1 */
    int f73844e1 = 0;

    /* renamed from: f1 */
    boolean f73845f1 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupMemApprovalView$a */
    /* loaded from: classes6.dex */
    public class C14368a extends RecyclerView.AbstractC1892s {
        C14368a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            try {
                if (i11 == 0) {
                    GroupMemApprovalAdapter groupMemApprovalAdapter = GroupMemApprovalView.this.f73830Q0;
                    groupMemApprovalAdapter.f38062t = false;
                    groupMemApprovalAdapter.m10008p();
                } else {
                    GroupMemApprovalView.this.f73830Q0.f38062t = true;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            super.mo10176d(recyclerView, i11, i12);
            try {
                if (GroupMemApprovalView.this.f73832S0.m9740Y1() + GroupMemApprovalView.this.f73832S0.m10110a() >= GroupMemApprovalView.this.f73832S0.m10127i()) {
                    GroupMemApprovalView groupMemApprovalView = GroupMemApprovalView.this;
                    if (groupMemApprovalView.f73837X0 && !groupMemApprovalView.f73843d1) {
                        GroupMemApprovalAdapter groupMemApprovalAdapter = groupMemApprovalView.f73830Q0;
                        if (groupMemApprovalAdapter.f38068z != 2) {
                            groupMemApprovalView.f73835V0++;
                            groupMemApprovalAdapter.f38068z = 1;
                            groupMemApprovalAdapter.m10008p();
                            GroupMemApprovalView.this.m80222mM();
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupMemApprovalView$b */
    /* loaded from: classes6.dex */
    public class C14369b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ArrayList f73847a;

        C14369b(ArrayList arrayList) {
            this.f73847a = arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m80234d(boolean z11) {
            int i11;
            int i12;
            int i13;
            Integer num;
            C3334c c3334c = C3334c.f14156a;
            Context context = GroupMemApprovalView.this.getContext();
            int i14 = AbstractC8020f0.str_popup_title_unable_approve_to_group;
            if (z11) {
                i11 = AbstractC8020f0.str_popup_subtitle_limit_members_to_upgrade_community;
            } else {
                i11 = AbstractC8020f0.f43861x7f3f1748;
            }
            if (z11) {
                i12 = AbstractC23322a.zds_il_community_upgrade_spot_1_1;
            } else {
                i12 = AbstractC23322a.zds_il_community_error_spot_1_1;
            }
            if (z11) {
                i13 = AbstractC8020f0.str_popup_btn_upgrade_to_community;
            } else {
                i13 = AbstractC8020f0.str_popup_btn_close;
            }
            if (z11) {
                num = Integer.valueOf(AbstractC8020f0.str_popup_btn_close);
            } else {
                num = null;
            }
            Integer num2 = num;
            GroupMemApprovalView groupMemApprovalView = GroupMemApprovalView.this;
            c3334c.m16810d(context, i14, i11, i12, i13, num2, groupMemApprovalView.f73834U0, groupMemApprovalView.f72421L0, null, "gr_member_approval");
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            int i11;
            boolean z11;
            String str;
            int m104491c = c20096c.m104491c();
            if (m104491c != 17033) {
                if (m104491c != 18002) {
                    if (m104491c != 18004) {
                        if (m104491c != 19530) {
                            if (m104491c != 19516) {
                                if (m104491c != 19517) {
                                    if (m104491c != 19521 && m104491c != 19522) {
                                        i11 = 2;
                                    } else {
                                        i11 = 9;
                                    }
                                } else {
                                    i11 = 7;
                                }
                            } else {
                                i11 = 8;
                            }
                        } else {
                            i11 = 12;
                        }
                    } else {
                        i11 = 3;
                    }
                } else {
                    i11 = 5;
                }
            } else {
                i11 = 4;
            }
            Iterator it = this.f73847a.iterator();
            while (true) {
                z11 = true;
                if (!it.hasNext()) {
                    break;
                }
                C32174x5 c32174x5 = (C32174x5) it.next();
                if (c32174x5.f148365j != 1) {
                    c32174x5.f148365j = i11;
                    if (!TextUtils.isEmpty(c20096c.m104492d())) {
                        c32174x5.f148366k = c20096c.m104492d();
                    } else {
                        c32174x5.f148366k = "";
                    }
                }
            }
            AbstractC2364o0.m12369l(GroupMemApprovalView.this.f72421L0.m92676n2(), GroupMemApprovalView.this.f73830Q0);
            C31973j5 m4472f = C0943w.m4462l().m4472f(GroupMemApprovalView.this.f73834U0);
            final boolean z12 = false;
            if (c20096c.m104491c() == 19530 && AbstractC30200a.m148947f()) {
                if (m4472f != null && m4472f.m153778p0()) {
                    z12 = true;
                }
                GroupMemApprovalView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.xk
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupMemApprovalView.C14369b.this.m80234d(z12);
                    }
                });
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("gid", GroupMemApprovalView.this.f73834U0);
                    if (z12) {
                        str = "ow";
                    } else {
                        str = "ad";
                    }
                    jSONObject.put("member_role", str);
                } catch (JSONException e11) {
                    AbstractC23350e.m122776f("CommonZaloview", e11);
                }
                C20379a.f100400a.m106159a("gr_member_approval", 1, "limit_100_mem", jSONObject.toString());
                return;
            }
            if (m4472f == null || !m4472f.m153747Y()) {
                z11 = false;
            }
            AbstractC23161o1.m119321f(c20096c, z11);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
            if (optJSONObject != null) {
                GroupMemApprovalView.this.m80231vM(optJSONObject);
                if (GroupMemApprovalView.this.m80232wM(optJSONObject, this.f73847a)) {
                    Intent intent = new Intent();
                    intent.putExtra("maxUsers", GroupMemApprovalView.f73828g1);
                    GroupMemApprovalView.this.mo50035CK(1001, intent);
                    GroupMemApprovalView.this.finish();
                    return;
                }
            }
            AbstractC2364o0.m12369l(GroupMemApprovalView.this.f72421L0.m92676n2(), GroupMemApprovalView.this.f73830Q0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupMemApprovalView$c */
    /* loaded from: classes6.dex */
    public class C14370c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ArrayList f73849a;

        C14370c(ArrayList arrayList) {
            this.f73849a = arrayList;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
            if (optJSONObject != null) {
                GroupMemApprovalView.this.m80231vM(optJSONObject);
                GroupMemApprovalView.this.m80232wM(optJSONObject, this.f73849a);
                HashMap hashMap = new HashMap();
                if (optJSONObject.has("wrongMembers")) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("wrongMembers");
                        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                            JSONArray jSONArray2 = jSONArray.getJSONObject(i11).getJSONArray("uIds");
                            for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                                hashMap.put(jSONArray2.getString(i12), jSONArray2.getString(i12));
                            }
                        }
                    } catch (JSONException e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                }
                Iterator it = this.f73849a.iterator();
                while (it.hasNext()) {
                    C32174x5 c32174x5 = (C32174x5) it.next();
                    if (!hashMap.containsKey(c32174x5.f148356a)) {
                        GroupMemApprovalView.this.f73839Z0.remove(c32174x5);
                    }
                }
                GroupMemApprovalView groupMemApprovalView = GroupMemApprovalView.this;
                groupMemApprovalView.f73830Q0.m35676P(groupMemApprovalView.f73839Z0, 0);
                C23744a.m124114c().m124116d(62, new Object[0]);
                AbstractC2364o0.m12369l(GroupMemApprovalView.this.f72421L0.m92676n2(), GroupMemApprovalView.this.f73830Q0);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupMemApprovalView$d */
    /* loaded from: classes6.dex */
    class C14371d extends C7145n.g {
        C14371d() {
        }

        @Override // com.zing.zalo.adapters.C7145n.g, com.zing.zalo.adapters.C7145n.a
        /* renamed from: a */
        public void mo36357a(int i11) {
            GroupMemApprovalView.this.m80221jM();
            if (i11 == AbstractC8020f0.str_menu_approve_all) {
                AbstractC23647d.m123897g("1591039");
                GroupMemApprovalView.this.mo35692yj(new ArrayList(GroupMemApprovalView.this.f73839Z0));
            } else if (i11 == AbstractC8020f0.str_menu_decline_all) {
                AbstractC23647d.m123897g("1591040");
                GroupMemApprovalView.this.mo35689jz(new ArrayList(GroupMemApprovalView.this.f73839Z0));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupMemApprovalView$e */
    /* loaded from: classes6.dex */
    public class C14372e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ boolean f73852a;

        C14372e(boolean z11) {
            this.f73852a = z11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            boolean z11;
            C31973j5 m4472f = C0943w.m4462l().m4472f(GroupMemApprovalView.this.f73834U0);
            if (m4472f != null && m4472f.m153747Y()) {
                z11 = true;
            } else {
                z11 = false;
            }
            ToastUtils.m89261i(c20096c, z11);
            GroupMemApprovalView.this.f72421L0.mo49315c4();
            GroupMemApprovalView.this.f73842c1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                if (!this.f73852a) {
                    C19637j.f97466a.m102865r0(GroupMemApprovalView.this.f73834U0, 0);
                    C23744a.m124114c().m124116d(62, new Object[0]);
                    GroupMemApprovalView.this.m80220iM();
                }
                GroupMemApprovalView.this.f72421L0.mo49315c4();
                GroupMemApprovalView.this.m80229tM(0);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            GroupMemApprovalView.this.f73842c1 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupMemApprovalView$f */
    /* loaded from: classes6.dex */
    public class C14373f implements InterfaceC20094a {
        C14373f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m80237e() {
            GroupMemApprovalView groupMemApprovalView = GroupMemApprovalView.this;
            groupMemApprovalView.f73830Q0.m35676P(groupMemApprovalView.f73839Z0, 0);
            GroupMemApprovalAdapter groupMemApprovalAdapter = GroupMemApprovalView.this.f73830Q0;
            groupMemApprovalAdapter.f38068z = 0;
            groupMemApprovalAdapter.m10008p();
            GroupMemApprovalView.this.f73838Y0.setRefreshing(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m80238f(C20096c c20096c) {
            try {
                GroupMemApprovalView groupMemApprovalView = GroupMemApprovalView.this;
                if (groupMemApprovalView.f73835V0 == 0) {
                    groupMemApprovalView.f73839Z0.clear();
                    GroupMemApprovalView.this.f73840a1.clear();
                    GroupMemApprovalView groupMemApprovalView2 = GroupMemApprovalView.this;
                    groupMemApprovalView2.f73830Q0.m35676P(groupMemApprovalView2.f73839Z0, c20096c.m104491c());
                } else {
                    groupMemApprovalView.f73830Q0.f38068z = 2;
                }
                GroupMemApprovalView.this.f73830Q0.m10008p();
                GroupMemApprovalView.this.f73838Y0.setRefreshing(false);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            GroupMemApprovalView groupMemApprovalView = GroupMemApprovalView.this;
            groupMemApprovalView.f73843d1 = false;
            groupMemApprovalView.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.zk
                @Override // java.lang.Runnable
                public final void run() {
                    GroupMemApprovalView.C14373f.this.m80238f(c20096c);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            Handler handler;
            Runnable runnable;
            try {
                try {
                    JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                    if (optJSONObject != null) {
                        GroupMemApprovalView groupMemApprovalView = GroupMemApprovalView.this;
                        boolean z11 = true;
                        if (optJSONObject.optInt("loadMore") != 1) {
                            z11 = false;
                        }
                        groupMemApprovalView.f73837X0 = z11;
                        GroupMemApprovalView.this.m80231vM(optJSONObject);
                        JSONArray jSONArray = optJSONObject.getJSONArray("lstRequestUser");
                        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                            C32174x5 c32174x5 = new C32174x5(jSONArray.getJSONObject(i11));
                            if (!GroupMemApprovalView.this.f73840a1.contains(c32174x5.f148356a)) {
                                GroupMemApprovalView.this.f73839Z0.add(c32174x5);
                                GroupMemApprovalView.this.f73840a1.add(c32174x5.f148356a);
                                GroupMemApprovalView.this.f73836W0 = Integer.parseInt(c32174x5.f148356a);
                            }
                        }
                    }
                    handler = GroupMemApprovalView.this.f72827B0;
                    runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.yk
                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupMemApprovalView.C14373f.this.m80237e();
                        }
                    };
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    handler = GroupMemApprovalView.this.f72827B0;
                    runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.yk
                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupMemApprovalView.C14373f.this.m80237e();
                        }
                    };
                }
                handler.post(runnable);
                GroupMemApprovalView.this.f73843d1 = false;
            } catch (Throwable th2) {
                GroupMemApprovalView.this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.yk
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupMemApprovalView.C14373f.this.m80237e();
                    }
                });
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupMemApprovalView$g */
    /* loaded from: classes6.dex */
    public class C14374g implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f73855a;

        C14374g(String str) {
            this.f73855a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            GroupMemApprovalView.this.f72421L0.mo49315c4();
            ToastUtils.showMess(c20096c.m104492d());
            GroupMemApprovalView.this.f73845f1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            GroupMemApprovalView.this.f72421L0.mo49315c4();
            C31973j5 m4472f = C0943w.m4462l().m4472f(GroupMemApprovalView.this.f73834U0);
            if (m4472f != null) {
                m4472f.m153719H0(this.f73855a);
            }
            GroupMemApprovalView.this.m80229tM(0);
            GroupMemApprovalView.this.f73845f1 = false;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupMemApprovalView$h */
    /* loaded from: classes6.dex */
    public class C14375h extends DialogView {

        /* renamed from: H0 */
        GroupMemApprovalView f73857H0;

        /* renamed from: I0 */
        CustomEditText f73858I0;

        /* renamed from: J0 */
        KeyEventCallbackC17462c f73859J0;

        /* renamed from: com.zing.zalo.ui.zviews.GroupMemApprovalView$h$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC18391a {

            /* renamed from: p */
            final /* synthetic */ Button f73861p;

            /* renamed from: q */
            final /* synthetic */ String f73862q;

            /* renamed from: r */
            final /* synthetic */ RobotoTextView f73863r;

            a(Button button, String str, RobotoTextView robotoTextView) {
                this.f73861p = button;
                this.f73862q = str;
                this.f73863r = robotoTextView;
            }

            @Override // ed0.AbstractC18391a, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                try {
                    String obj = editable.toString();
                    Button button = this.f73861p;
                    if (button != null) {
                        button.setEnabled(!this.f73862q.equals(obj));
                    }
                    this.f73863r.setText(obj.length() + "/250");
                    if (obj.length() > 250) {
                        ToastUtils.showMess(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_poll_max_chars_input), 250));
                        C14375h.this.f73858I0.setText(obj.substring(0, 250));
                        C14375h.this.f73858I0.setSelection(250);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }

        /* renamed from: com.zing.zalo.ui.zviews.GroupMemApprovalView$h$b */
        /* loaded from: classes6.dex */
        class b extends AbstractC18391a {

            /* renamed from: p */
            final /* synthetic */ RobotoTextView f73865p;

            b(RobotoTextView robotoTextView) {
                this.f73865p = robotoTextView;
            }

            @Override // ed0.AbstractC18391a, android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
                int m118764y0 = AbstractC23136l9.m118764y0(this.f73865p.getPaint(), this.f73865p.getText().toString());
                CustomEditText customEditText = C14375h.this.f73858I0;
                customEditText.setPadding(0, customEditText.getPaddingTop(), m118764y0 + AbstractC23136l9.m118742r(4.0f), C14375h.this.f73858I0.getPaddingBottom());
            }
        }

        public C14375h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: aL */
        public /* synthetic */ void m80243aL(InterfaceC17463d interfaceC17463d, int i11) {
            GroupMemApprovalView groupMemApprovalView = GroupMemApprovalView.this;
            groupMemApprovalView.m80230uM(groupMemApprovalView.f73834U0, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: bL */
        public /* synthetic */ boolean m80244bL(TextView textView, int i11, KeyEvent keyEvent) {
            if (i11 == 6) {
                AbstractC2379w.m12430d(this.f73858I0);
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: dL */
        public /* synthetic */ void m80246dL(KeyEventCallbackC17462c keyEventCallbackC17462c, View view) {
            String str;
            Editable text = this.f73858I0.getText();
            if (text != null) {
                str = text.toString();
            } else {
                str = "";
            }
            String m119732B = AbstractC23244v8.m119732B(str);
            GroupMemApprovalView groupMemApprovalView = GroupMemApprovalView.this;
            groupMemApprovalView.m80228sM(groupMemApprovalView.f73834U0, m119732B);
            keyEventCallbackC17462c.dismiss();
        }

        @Override // com.zing.zalo.zview.DialogView
        /* renamed from: LK */
        public KeyEventCallbackC17462c mo13885LK(Bundle bundle) {
            int i11;
            String m153785t;
            this.f73859J0 = null;
            try {
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            if (this.f73857H0 != null && bundle == null) {
                Bundle m92642L3 = m92642L3();
                if (m92642L3 != null) {
                    i11 = m92642L3.getInt("id");
                } else {
                    i11 = -1;
                }
                if (i11 != 1000) {
                    if (i11 == 1001) {
                        C8009j.a aVar = new C8009j.a(m92648SI());
                        View inflate = LayoutInflater.from(m92648SI()).inflate(AbstractC7409c0.custom_edittext_dialog_layout, (ViewGroup) null);
                        RobotoTextView robotoTextView = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_title);
                        RobotoTextView robotoTextView2 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_remain_chars);
                        robotoTextView2.setVisibility(0);
                        this.f73858I0 = (CustomEditText) inflate.findViewById(AbstractC6918a0.et_content);
                        Button button = (Button) inflate.findViewById(AbstractC6918a0.confirm_btn_no);
                        Button button2 = (Button) inflate.findViewById(AbstractC6918a0.confirm_btn_yes);
                        robotoTextView.setTextStyleBold(true);
                        robotoTextView.setText(AbstractC8020f0.str_join_question_dialog_title);
                        robotoTextView.setTextSize(1, 20.0f);
                        robotoTextView.setTextColor(C23212s8.m119607o(getContext(), AbstractC16781w.HeaderFormTitleColor));
                        this.f73858I0.setTextColor(C23212s8.m119607o(getContext(), AbstractC16781w.HeaderFormTitleColor));
                        this.f73858I0.setTextSize(1, 16.0f);
                        this.f73858I0.setMaxLines(3);
                        this.f73858I0.setForceHideClearBtn(true);
                        this.f73858I0.setRawInputType(16384);
                        this.f73858I0.setImeOptions(6);
                        this.f73858I0.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zing.zalo.ui.zviews.bl
                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView, int i12, KeyEvent keyEvent) {
                                boolean m80244bL;
                                m80244bL = GroupMemApprovalView.C14375h.this.m80244bL(textView, i12, keyEvent);
                                return m80244bL;
                            }
                        });
                        C31973j5 m4472f = C0943w.m4462l().m4472f(GroupMemApprovalView.this.f73834U0);
                        if (m4472f == null) {
                            return null;
                        }
                        if (TextUtils.isEmpty(m4472f.m153785t())) {
                            m153785t = "";
                        } else {
                            m153785t = m4472f.m153785t();
                        }
                        this.f73858I0.addTextChangedListener(new a(button2, m153785t, robotoTextView2));
                        robotoTextView2.addTextChangedListener(new b(robotoTextView2));
                        this.f73858I0.setText(m153785t);
                        this.f73858I0.setSelection(m153785t.length());
                        button.setText(AbstractC8020f0.str_cancel);
                        button2.setText(AbstractC8020f0.str_positive_button_join_question_dialog);
                        int m118742r = AbstractC23136l9.m118742r(24.0f);
                        aVar.m43150A(inflate, m118742r, AbstractC23136l9.m118742r(10.0f), m118742r, 0);
                        aVar.m43154c(false);
                        C8009j m43152a = aVar.m43152a();
                        this.f73859J0 = m43152a;
                        m43152a.m92867k().m92890I(37);
                        final KeyEventCallbackC17462c keyEventCallbackC17462c = this.f73859J0;
                        button.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.cl
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                KeyEventCallbackC17462c.this.dismiss();
                            }
                        });
                        button2.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.dl
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                GroupMemApprovalView.C14375h.this.m80246dL(keyEventCallbackC17462c, view);
                            }
                        });
                    }
                } else {
                    int m102827H = C19637j.f97466a.m102827H(GroupMemApprovalView.this.f73834U0);
                    C8009j.a aVar2 = new C8009j.a(this.f88762c0.m92648SI());
                    aVar2.m43159h(4).m43162k(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_reject_all_join_pending_requests), Integer.valueOf(m102827H))).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.al
                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                            GroupMemApprovalView.C14375h.this.m80243aL(interfaceC17463d, i12);
                        }
                    });
                    this.f73859J0 = aVar2.m43152a();
                }
                KeyEventCallbackC17462c keyEventCallbackC17462c2 = this.f73859J0;
                if (keyEventCallbackC17462c2 != null) {
                    keyEventCallbackC17462c2.m92853D(i11);
                }
                return this.f73859J0;
            }
            dismiss();
            return super.mo13885LK(bundle);
        }

        @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.dialog.InterfaceC17463d.e
        /* renamed from: Tv */
        public void mo12457Tv(InterfaceC17463d interfaceC17463d) {
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null && m92642L3.getInt("id") == 1001) {
                try {
                    GroupMemApprovalView groupMemApprovalView = GroupMemApprovalView.this;
                    if (groupMemApprovalView.f73844e1 > groupMemApprovalView.f73829P0.getHeight()) {
                        ((InputMethodManager) GroupMemApprovalView.this.f73829P0.getContext().getSystemService("input_method")).toggleSoftInput(1, 0);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
            super.mo12457Tv(interfaceC17463d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kM */
    public /* synthetic */ void m80218kM() {
        this.f73838Y0.setRefreshing(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public /* synthetic */ void m80219lM(int i11) {
        this.f73830Q0.m35676P(this.f73839Z0, i11);
        this.f73830Q0.m10008p();
    }

    @Override // com.zing.zalo.adapters.GroupMemApprovalAdapter.InterfaceC6957h
    /* renamed from: Er */
    public void mo35686Er() {
        C31973j5 m4472f = C0943w.m4462l().m4472f(this.f73834U0);
        if (m4472f != null && m4472f.m153742T()) {
            m80227rM(1001);
        } else {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_only_group_owner_do_this_action));
        }
    }

    @Override // com.zing.zalo.adapters.GroupMemApprovalAdapter.InterfaceC6957h
    /* renamed from: Fo */
    public void mo35687Fo(Rect rect) {
        ArrayList arrayList = new ArrayList();
        Context m92689tK = m92689tK();
        int i11 = AbstractC8020f0.str_menu_approve_all;
        arrayList.add(new C7145n.b(m92689tK, 5, i11, AbstractC23136l9.m118743r0(i11), ""));
        Context m92689tK2 = m92689tK();
        int i12 = AbstractC8020f0.str_menu_decline_all;
        arrayList.add(new C7145n.b(m92689tK2, 5, i12, AbstractC23136l9.m118743r0(i12), ""));
        SimpleMenuListPopupView m87992ML = SimpleMenuListPopupView.m87992ML(arrayList, new C14371d(), rect, -1);
        m87992ML.m87997PL(true);
        m87992ML.m87998QL(true);
        this.f72421L0.m92649TI().m93060e2(0, m87992ML, "TAG_OPTION_MENU_POPUP", 0, false);
        AbstractC23647d.m123897g("1591038");
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f73833T0 = new C23528a(this.f72421L0.getContext());
        this.f73829P0 = layoutInflater.inflate(AbstractC7409c0.group_members_approval, viewGroup, false);
        m80226qM();
        return this.f73829P0;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C23744a.m124114c().m124117e(this, 52);
        C23744a.m124114c().m124117e(this, 27);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GroupMemApprovalView";
    }

    @Override // com.zing.zalo.adapters.GroupMemApprovalAdapter.InterfaceC6957h
    /* renamed from: i3 */
    public void mo35688i3() {
        if (this.f73837X0) {
            GroupMemApprovalAdapter groupMemApprovalAdapter = this.f73830Q0;
            groupMemApprovalAdapter.f38068z = 1;
            groupMemApprovalAdapter.m10008p();
            m80222mM();
        }
    }

    /* renamed from: iM */
    void m80220iM() {
        this.f73835V0 = 0;
        this.f73839Z0.clear();
        this.f73840a1.clear();
        this.f73837X0 = false;
        this.f73836W0 = 0;
    }

    /* renamed from: jM */
    public void m80221jM() {
        try {
            ZaloView m92996E0 = this.f72421L0.m92649TI().m92996E0("TAG_OPTION_MENU_POPUP");
            if (m92996E0 != null) {
                this.f72421L0.m92649TI().mo92702G1(m92996E0, m92996E0.f88756W);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.adapters.GroupMemApprovalAdapter.InterfaceC6957h
    /* renamed from: jz */
    public void mo35689jz(ArrayList arrayList) {
        if (arrayList != null && arrayList.size() != 0) {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14370c(arrayList));
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C32174x5 c32174x5 = (C32174x5) it.next();
                if (c32174x5 != null) {
                    this.f73840a1.remove(c32174x5.f148356a);
                    arrayList2.add(c32174x5.f148356a);
                }
            }
            if (arrayList2.size() > 0) {
                c0766k.mo1624db(this.f73834U0, arrayList2);
            }
        }
    }

    @Override // com.zing.zalo.adapters.GroupMemApprovalAdapter.InterfaceC6957h
    /* renamed from: kE */
    public void mo35690kE(C21696f c21696f, boolean z11) {
        C31973j5 m4472f = C0943w.m4462l().m4472f(this.f73834U0);
        if (m4472f != null && m4472f.m153742T()) {
            if (!z11 && m4472f.m153713E() > 0) {
                m80227rM(1000);
                return;
            } else {
                m80230uM(m4472f.m153781r(), z11);
                return;
            }
        }
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_only_group_owner_do_this_action));
    }

    /* renamed from: mM */
    void m80222mM() {
        if (this.f73843d1) {
            return;
        }
        this.f73843d1 = true;
        if (this.f73835V0 == 0) {
            this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.vk
                @Override // java.lang.Runnable
                public final void run() {
                    GroupMemApprovalView.this.m80218kM();
                }
            });
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14373f());
        if (this.f73839Z0.size() == 0) {
            this.f73835V0 = 0;
        } else {
            ArrayList arrayList = this.f73839Z0;
            this.f73836W0 = Integer.parseInt(((C32174x5) arrayList.get(arrayList.size() - 1)).f148356a);
        }
        c0766k.mo1546U4(this.f73834U0, this.f73835V0, this.f73836W0);
    }

    /* renamed from: nM */
    boolean m80223nM() {
        C31973j5 m4472f = C0943w.m4462l().m4472f(this.f73834U0);
        if (m4472f != null && m4472f.m153755d0()) {
            return true;
        }
        return false;
    }

    /* renamed from: oM */
    void m80224oM(JSONArray jSONArray, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, ArrayList arrayList9) {
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                ArrayList arrayList10 = new ArrayList();
                JSONArray jSONArray2 = jSONObject.getJSONArray("uIds");
                for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                    arrayList10.add(jSONArray2.getString(i12));
                }
                if (arrayList != null && jSONObject.optInt("errorCode") == 17033) {
                    arrayList.addAll(arrayList10);
                } else if (arrayList2 != null && jSONObject.optInt("errorCode") == 18004) {
                    arrayList2.addAll(arrayList10);
                } else if (arrayList3 != null && jSONObject.optInt("errorCode") == 18002) {
                    arrayList3.addAll(arrayList10);
                } else if (arrayList4 != null && jSONObject.optInt("errorCode") == 17013) {
                    f73828g1 = jSONObject.optInt("limit");
                    arrayList4.addAll(arrayList10);
                } else if (arrayList5 != null && jSONObject.optInt("errorCode") == 19517) {
                    arrayList5.addAll(arrayList10);
                } else if (arrayList6 != null && jSONObject.optInt("errorCode") == 19516) {
                    arrayList6.addAll(arrayList10);
                } else if (arrayList7 != null && jSONObject.optInt("errorCode") == 19522) {
                    arrayList7.addAll(arrayList10);
                } else if (arrayList8 != null && jSONObject.optInt("errorCode") == 19530) {
                    arrayList8.addAll(arrayList10);
                } else if (arrayList9 != null) {
                    arrayList9.addAll(arrayList10);
                }
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C23744a.m124114c().m124115b(this, 52);
        C23744a.m124114c().m124115b(this, 27);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pM */
    public void m80225pM() {
        if (m80223nM()) {
            m80220iM();
            m80222mM();
        } else {
            this.f73838Y0.setRefreshing(false);
        }
    }

    /* renamed from: qM */
    void m80226qM() {
        RecyclerView recyclerView = (RecyclerView) this.f73829P0.findViewById(AbstractC6918a0.recycle_view);
        this.f73831R0 = recyclerView;
        recyclerView.m9826E(new C14368a());
        this.f73832S0 = new LinearLayoutManager(this.f72421L0.getContext());
        this.f73830Q0 = new GroupMemApprovalAdapter(this.f72421L0.getContext(), this.f73833T0, this);
        this.f73831R0.setLayoutManager(this.f73832S0);
        this.f73831R0.setAdapter(this.f73830Q0);
        this.f73830Q0.m10008p();
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f73829P0.findViewById(AbstractC6918a0.swipe_refresh_layout);
        this.f73838Y0 = swipeRefreshLayout;
        swipeRefreshLayout.setColorSchemeColors(C23212s8.m119607o(getContext(), AbstractC16781w.AppPrimaryColor));
        this.f73838Y0.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: com.zing.zalo.ui.zviews.wk
            @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
            /* renamed from: a */
            public final void mo12137a() {
                GroupMemApprovalView.this.m80225pM();
            }
        });
    }

    /* renamed from: rM */
    public void m80227rM(int i11) {
        try {
            this.f73844e1 = this.f73829P0.getHeight();
            C14375h c14375h = new C14375h();
            c14375h.f73857H0 = this;
            Bundle bundle = new Bundle();
            bundle.putInt("id", i11);
            c14375h.mo60305zK(bundle);
            if (c14375h.m92687sJ()) {
                c14375h.dismiss();
            }
            c14375h.mo83093TK(this.f72421L0.m92649TI());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: sM */
    void m80228sM(String str, String str2) {
        if (this.f73845f1) {
            return;
        }
        this.f73845f1 = true;
        this.f72421L0.mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14374g(str2));
        c0766k.mo1614c9(str, str2);
    }

    /* renamed from: tM */
    void m80229tM(final int i11) {
        this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.uk
            @Override // java.lang.Runnable
            public final void run() {
                GroupMemApprovalView.this.m80219lM(i11);
            }
        });
    }

    /* renamed from: uM */
    void m80230uM(String str, boolean z11) {
        try {
            C31973j5 m4472f = C0943w.m4462l().m4472f(str);
            if (m4472f == null || this.f73842c1) {
                return;
            }
            this.f73842c1 = true;
            this.f72421L0.mo46829Y();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14372e(z11));
            c0766k.mo1412D7(m4472f.m153781r(), 6, z11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.adapters.GroupMemApprovalAdapter.InterfaceC6957h
    /* renamed from: v1 */
    public void mo35691v1(String str) {
        AbstractC23211s7.m119562B(str, this.f72421L0.m92662fJ(), this.f73834U0, C32002l4.m154265h(ZMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM, 14));
    }

    /* renamed from: vM */
    void m80231vM(JSONObject jSONObject) {
        if (jSONObject.has("requestCount")) {
            C19637j.f97466a.m102865r0(this.f73834U0, jSONObject.optInt("requestCount"));
            C23744a.m124114c().m124116d(62, new Object[0]);
            AbstractC2364o0.m12369l(this.f72421L0.m92676n2(), this.f73830Q0);
        }
    }

    /* renamed from: wM */
    boolean m80232wM(JSONObject jSONObject, ArrayList arrayList) {
        boolean z11;
        if (jSONObject != null && arrayList != null) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("wrongMembers");
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                m80224oM(jSONArray, arrayList3, arrayList2, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9, arrayList10);
                if (arrayList5.size() > 0) {
                    return true;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C32174x5 c32174x5 = (C32174x5) it.next();
                    c32174x5.f148365j = 1;
                    c32174x5.f148366k = "";
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (c32174x5.f148356a.equals((String) it2.next())) {
                                c32174x5.f148365j = 3;
                                z11 = true;
                                break;
                            }
                        } else {
                            z11 = false;
                            break;
                        }
                    }
                    if (!z11) {
                        Iterator it3 = arrayList3.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            if (c32174x5.f148356a.equals((String) it3.next())) {
                                c32174x5.f148365j = 4;
                                z11 = true;
                                break;
                            }
                        }
                    }
                    if (!z11) {
                        Iterator it4 = arrayList4.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            if (c32174x5.f148356a.equals((String) it4.next())) {
                                c32174x5.f148365j = 5;
                                z11 = true;
                                break;
                            }
                        }
                    }
                    if (!z11) {
                        Iterator it5 = arrayList6.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                break;
                            }
                            if (c32174x5.f148356a.equals((String) it5.next())) {
                                c32174x5.f148365j = 7;
                                z11 = true;
                                break;
                            }
                        }
                    }
                    if (!z11) {
                        Iterator it6 = arrayList7.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                break;
                            }
                            if (c32174x5.f148356a.equals((String) it6.next())) {
                                c32174x5.f148365j = 8;
                                z11 = true;
                                break;
                            }
                        }
                    }
                    if (!z11) {
                        Iterator it7 = arrayList8.iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                break;
                            }
                            if (c32174x5.f148356a.equals((String) it7.next())) {
                                c32174x5.f148365j = 9;
                                z11 = true;
                                break;
                            }
                        }
                    }
                    if (!z11) {
                        Iterator it8 = arrayList9.iterator();
                        while (it8.hasNext()) {
                            if (c32174x5.f148356a.equals((String) it8.next())) {
                                c32174x5.f148365j = 12;
                                break;
                            }
                        }
                    }
                    if (!z11) {
                        Iterator it9 = arrayList10.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                if (c32174x5.f148356a.equals((String) it9.next())) {
                                    c32174x5.f148365j = 10;
                                    break;
                                }
                            }
                        }
                    }
                }
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 != 27) {
            if (i11 == 52 && AbstractC23184q2.m119459q(this.f73834U0, i11, objArr)) {
                finish();
                return;
            }
            return;
        }
        if (objArr.length >= 3) {
            String str = (String) objArr[0];
            if (((Integer) objArr[1]).intValue() != 0 && str.equals(this.f73834U0)) {
                C31973j5 m4472f = C0943w.m4462l().m4472f(str);
                if (m4472f != null && m4472f.m153742T()) {
                    m80229tM(0);
                } else {
                    finish();
                }
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f73841b1 = m92642L3.getString("STR_SOURCE_START_VIEW", "");
            String string = m92642L3.getString("extra_group_id");
            this.f73834U0 = string;
            this.f73830Q0.m35675O(string);
            this.f73830Q0.m35676P(null, 0);
            m80225pM();
            C0815e1.m2075D().m2100V(new C23648e(5, this.f73841b1, 1, "gr_member_requests", "2"), false);
        }
    }

    @Override // com.zing.zalo.adapters.GroupMemApprovalAdapter.InterfaceC6957h
    /* renamed from: yj */
    public void mo35692yj(ArrayList arrayList) {
        if (arrayList != null && arrayList.size() != 0) {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14369b(arrayList));
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C32174x5 c32174x5 = (C32174x5) it.next();
                if (c32174x5.f148365j != 1) {
                    c32174x5.f148365j = 11;
                    arrayList2.add(c32174x5.f148356a);
                }
            }
            this.f73830Q0.m10008p();
            if (arrayList2.size() > 0) {
                c0766k.mo1678l4(this.f73834U0, arrayList2);
            }
        }
    }
}
