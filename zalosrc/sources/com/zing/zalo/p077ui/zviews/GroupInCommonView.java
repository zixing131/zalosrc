package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0815e1;
import am.C0943w;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2368q0;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.C7189r;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.zviews.GroupInCommonView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import gg0.AbstractC19444a;
import gw.C19637j;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import me0.AbstractC23211s7;
import me0.AbstractC23262x6;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p692ys.C31070a;
import p716zh.C31973j5;
import p716zh.C32020m7;
import p716zh.C32076q5;
import rs.C25976a;
import v50.C27870vb;
import vg.C28203u6;
import zc0.C31784b;

/* loaded from: classes6.dex */
public class GroupInCommonView extends RemoveGroupMemberBaseView implements ZaloView.InterfaceC17421f, C23744a.c, InterfaceC0733x {

    /* renamed from: A1 */
    C32020m7 f73733A1;

    /* renamed from: C1 */
    EditText f73735C1;

    /* renamed from: D1 */
    ActionBarMenuItem f73736D1;

    /* renamed from: o1 */
    C25976a f73745o1;

    /* renamed from: p1 */
    RecyclerView f73746p1;

    /* renamed from: q1 */
    LinearLayoutManager f73747q1;

    /* renamed from: r1 */
    MultiStateView f73748r1;

    /* renamed from: s1 */
    C23528a f73749s1;

    /* renamed from: t1 */
    String f73750t1;

    /* renamed from: u1 */
    String f73751u1;

    /* renamed from: v1 */
    String f73752v1;

    /* renamed from: w1 */
    View f73753w1;

    /* renamed from: x1 */
    String f73754x1;

    /* renamed from: j1 */
    LinkedList f73740j1 = new LinkedList();

    /* renamed from: k1 */
    LinkedList f73741k1 = new LinkedList();

    /* renamed from: l1 */
    LinkedList f73742l1 = new LinkedList();

    /* renamed from: m1 */
    String f73743m1 = "";

    /* renamed from: n1 */
    HashMap f73744n1 = new HashMap();

    /* renamed from: y1 */
    boolean f73755y1 = false;

    /* renamed from: z1 */
    String f73756z1 = "";

    /* renamed from: B1 */
    Runnable f73734B1 = new Runnable() { // from class: com.zing.zalo.ui.zviews.wj
        public /* synthetic */ RunnableC16304wj() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            GroupInCommonView.this.m80128gN();
        }
    };

    /* renamed from: E1 */
    ActionBarMenuItem.C17435d f73737E1 = new C14345c();

    /* renamed from: F1 */
    boolean f73738F1 = false;

    /* renamed from: G1 */
    private final Comparator f73739G1 = new C14347e();

    /* renamed from: com.zing.zalo.ui.zviews.GroupInCommonView$a */
    /* loaded from: classes6.dex */
    class C14343a implements C25976a.a {
        C14343a() {
        }

        @Override // rs.C25976a.a
        /* renamed from: Gq */
        public void mo67804Gq(String str, String str2) {
            GroupInCommonView groupInCommonView = GroupInCommonView.this;
            groupInCommonView.f73743m1 = str2;
            groupInCommonView.f72421L0.showDialog(ZAbstractBase.ZVU_BLEND_PERCENTAGE);
        }

        @Override // rs.C25976a.a
        /* renamed from: Va */
        public void mo67809Va(C31070a c31070a, String str, String str2, TrackingSource trackingSource) {
        }

        @Override // rs.C25976a.a
        /* renamed from: tl */
        public void mo67819tl(C31973j5 c31973j5) {
            AbstractC23211s7.m119577j(c31973j5, GroupInCommonView.this.f72421L0.m92676n2(), false);
        }

        @Override // rs.C25976a.a
        /* renamed from: uG */
        public void mo67820uG(Rect rect) {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupInCommonView$b */
    /* loaded from: classes6.dex */
    class C14344b extends RecyclerView.AbstractC1892s {
        C14344b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            if (i11 == 0) {
                C25976a c25976a = GroupInCommonView.this.f73745o1;
                c25976a.f123935s = false;
                c25976a.m10008p();
                return;
            }
            GroupInCommonView.this.f73745o1.f123935s = true;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupInCommonView$c */
    /* loaded from: classes6.dex */
    class C14345c extends ActionBarMenuItem.C17435d {
        C14345c() {
        }

        @Override // com.zing.zalo.zview.actionbar.ActionBarMenuItem.C17435d
        /* renamed from: f */
        public void mo65079f(EditText editText) {
            new C14348f(editText.getText().toString()).start();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupInCommonView$d */
    /* loaded from: classes6.dex */
    public class C14346d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f73760a;

        C14346d(String str) {
            this.f73760a = str;
        }

        /* renamed from: d */
        public /* synthetic */ void m80150d() {
            GroupInCommonView.this.m80144vN();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            GroupInCommonView.this.f73738F1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            GroupInCommonView groupInCommonView = GroupInCommonView.this;
            groupInCommonView.f73738F1 = false;
            try {
                groupInCommonView.f73744n1.clear();
                JSONObject jSONObject = new JSONObject(obj.toString());
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (!jSONObject.isNull("error_code") && jSONObject.getInt("error_code") == 0) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("suggestGroup");
                    int length = jSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        int i12 = jSONArray.getInt(i11);
                        C31973j5 m4472f = C0943w.m4462l().m4472f("" + i12);
                        C32076q5 m4476k = C0943w.m4462l().m4476k("" + i12);
                        if (m4472f != null && m4476k != null && !m4476k.m154725n(this.f73760a) && !GroupInCommonView.this.f73744n1.containsKey(m4472f.m153781r())) {
                            C32020m7 c32020m7 = new C32020m7(31);
                            ContactProfile contactProfile = new ContactProfile(1, m4472f.m153781r());
                            c32020m7.f147413d = m4472f;
                            contactProfile.f42437s = m4472f.m153793y();
                            contactProfile.f42440t = m4472f.m153795z();
                            c32020m7.f147411b = contactProfile;
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("STR_EXTRA_CONTACT_UID", GroupInCommonView.this.f73750t1);
                            c32020m7.f147424o = jSONObject3;
                            GroupInCommonView.this.f73742l1.add(c32020m7);
                            GroupInCommonView.this.f73744n1.put(m4472f.m153781r(), c32020m7);
                        }
                    }
                    if (GroupInCommonView.this.f73742l1.size() > 0) {
                        GroupInCommonView.this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ak
                            public /* synthetic */ RunnableC15440ak() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                GroupInCommonView.C14346d.this.m80150d();
                            }
                        });
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupInCommonView$e */
    /* loaded from: classes6.dex */
    class C14347e implements Comparator {
        C14347e() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C32020m7 c32020m7, C32020m7 c32020m72) {
            int i11;
            C31973j5 m40388T = c32020m72.f147411b.m40388T(false);
            C31973j5 m40388T2 = c32020m7.f147411b.m40388T(false);
            if (m40388T == null) {
                return -1;
            }
            if (m40388T2 == null) {
                return 1;
            }
            int i12 = 4;
            if (m40388T.m153778p0()) {
                i11 = 6;
            } else if (m40388T.m153743U()) {
                i11 = 4;
            } else {
                i11 = 1;
            }
            if (m40388T.m153744V(GroupInCommonView.this.f73750t1)) {
                i11--;
            } else if (m40388T.m153780q0(GroupInCommonView.this.f73750t1)) {
                i11 -= 2;
            }
            if (m40388T2.m153778p0()) {
                i12 = 6;
            } else if (!m40388T2.m153743U()) {
                i12 = 1;
            }
            if (m40388T2.m153744V(GroupInCommonView.this.f73750t1)) {
                i12--;
            } else if (m40388T2.m153780q0(GroupInCommonView.this.f73750t1)) {
                i12 -= 2;
            }
            if (i11 > i12) {
                return 1;
            }
            if (i11 < i12) {
                return -1;
            }
            return AbstractC2368q0.m12386a(c32020m7.f147411b.f42437s, c32020m72.f147411b.f42437s);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupInCommonView$f */
    /* loaded from: classes6.dex */
    public class C14348f extends Thread {

        /* renamed from: p */
        final String f73763p;

        public C14348f(String str) {
            super("Z:GroupInCommon-Search");
            this.f73763p = str;
        }

        /* renamed from: c */
        public /* synthetic */ void m80154c() {
            if (TextUtils.isEmpty(GroupInCommonView.this.f73735C1.getText().toString().trim())) {
                GroupInCommonView.this.m80144vN();
            }
        }

        /* renamed from: d */
        public /* synthetic */ void m80155d(LinkedList linkedList) {
            try {
                if (this.f73763p.equals(GroupInCommonView.this.f73735C1.getText().toString().trim())) {
                    GroupInCommonView groupInCommonView = GroupInCommonView.this;
                    groupInCommonView.f73740j1 = linkedList;
                    groupInCommonView.m80145wN(AbstractC23136l9.m118743r0(AbstractC8020f0.str_emptyResult));
                    GroupInCommonView.this.m80146xN(false);
                    GroupInCommonView groupInCommonView2 = GroupInCommonView.this;
                    C25976a c25976a = groupInCommonView2.f73745o1;
                    if (c25976a != null) {
                        c25976a.m133803P(groupInCommonView2.f73740j1);
                        GroupInCommonView.this.f73745o1.m10008p();
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z11;
            try {
                LinkedList linkedList = new LinkedList();
                if (TextUtils.isEmpty(this.f73763p)) {
                    GroupInCommonView.this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.bk
                        public /* synthetic */ RunnableC15477bk() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupInCommonView.C14348f.this.m80154c();
                        }
                    });
                    return;
                }
                String m120002o = AbstractC23262x6.m120002o(this.f73763p);
                int size = GroupInCommonView.this.f73741k1.size();
                for (int i11 = 0; i11 < size; i11++) {
                    C32020m7 c32020m7 = (C32020m7) GroupInCommonView.this.f73741k1.get(i11);
                    ContactProfile contactProfile = c32020m7.f147411b;
                    if (contactProfile != null) {
                        String str = contactProfile.f42440t;
                        if (!TextUtils.isEmpty(str) && str.contains(m120002o)) {
                            c32020m7.f147411b.f42399a1.clear();
                            int indexOf = str.indexOf(m120002o);
                            if (indexOf != -1) {
                                int length = m120002o.length() + indexOf;
                                c32020m7.f147411b.f42399a1.add(Integer.valueOf(indexOf));
                                c32020m7.f147411b.f42399a1.add(Integer.valueOf(length));
                            }
                            linkedList.add(c32020m7);
                        }
                    }
                }
                int size2 = linkedList.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    C32020m7 c32020m72 = (C32020m7) linkedList.get(i12);
                    if (i12 == size2 - 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c32020m72.f147415f = z11;
                }
                GroupInCommonView.this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ck

                    /* renamed from: q */
                    public final /* synthetic */ LinkedList f80032q;

                    public /* synthetic */ RunnableC15513ck(LinkedList linkedList2) {
                        r2 = linkedList2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupInCommonView.C14348f.this.m80155d(r2);
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: AN */
    private void m80110AN(int i11) {
        C32020m7 c32020m7 = (C32020m7) this.f73744n1.get(this.f73743m1);
        if (c32020m7 != null && i11 != 0) {
            if (i11 != 17007 && i11 != 17032) {
                if (i11 != 17053 && i11 != 18002 && i11 != 18005) {
                    c32020m7.f147429t = AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_invite_error_undefine);
                } else {
                    c32020m7.f147429t = AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_invite_error_send_group_invitation);
                }
            } else {
                c32020m7.f147429t = AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_invite_error_in_approval_list);
            }
            this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.xj
                public /* synthetic */ RunnableC16341xj() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    GroupInCommonView.this.m80144vN();
                }
            });
        }
    }

    /* renamed from: cN */
    private boolean m80124cN() {
        boolean m122193n2 = AbstractC23309i.m122193n2();
        boolean m153137g = C21927m.m114302u().m114312J().m153137g(this.f73750t1);
        if (m122193n2 && !AbstractC21935u.m114515E(this.f73750t1) && !m153137g) {
            return true;
        }
        return false;
    }

    /* renamed from: dN */
    private boolean m80125dN() {
        int m121041I8 = AbstractC23309i.m121041I8();
        boolean m153137g = C21927m.m114302u().m114312J().m153137g(this.f73750t1);
        if (AbstractC23309i.m121035I2() && m121041I8 > 0 && !m153137g && !AbstractC21935u.m114515E(this.f73750t1)) {
            return true;
        }
        return false;
    }

    /* renamed from: eN */
    public /* synthetic */ void m80126eN(LinkedList linkedList) {
        int i11;
        this.f73741k1 = linkedList;
        ActionBarMenuItem actionBarMenuItem = this.f73736D1;
        if (!linkedList.isEmpty()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        actionBarMenuItem.setVisibility(i11);
        C32020m7 c32020m7 = this.f73733A1;
        if (c32020m7 != null && c32020m7.f147411b != null) {
            Iterator it = this.f73741k1.iterator();
            while (true) {
                if (it.hasNext()) {
                    ContactProfile contactProfile = ((C32020m7) it.next()).f147411b;
                    if (contactProfile != null && TextUtils.equals(contactProfile.f42434r, this.f73733A1.f147411b.f42434r)) {
                        break;
                    }
                } else {
                    this.f73733A1 = null;
                    removeDialog(1000);
                    break;
                }
            }
        }
        if (!TextUtils.isEmpty(this.f73754x1)) {
            if (this.f72421L0.m92646QI() != null) {
                this.f72421L0.m92646QI().m92723u(this.f73754x1);
            }
            this.f73754x1 = "";
        } else if (!TextUtils.isEmpty(this.f73735C1.getText().toString().trim())) {
            new C14348f(this.f73735C1.getText().toString()).start();
        } else {
            m80144vN();
        }
    }

    /* renamed from: fN */
    public /* synthetic */ void m80127fN() {
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.pj

            /* renamed from: q */
            public final /* synthetic */ LinkedList f81604q;

            public /* synthetic */ RunnableC16021pj(LinkedList linkedList) {
                r2 = linkedList;
            }

            @Override // java.lang.Runnable
            public final void run() {
                GroupInCommonView.this.m80126eN(r2);
            }
        });
    }

    /* renamed from: gN */
    public /* synthetic */ void m80128gN() {
        if (m92674mJ()) {
            mo46829Y();
        }
    }

    /* renamed from: hN */
    public /* synthetic */ void m80129hN(RecyclerView recyclerView, int i11, View view) {
        try {
            C25976a c25976a = this.f73745o1;
            if (c25976a != null && i11 >= 0 && c25976a.mo10003k() > i11) {
                C32020m7 m133799L = this.f73745o1.m133799L(i11);
                this.f73733A1 = m133799L;
                int i12 = m133799L.f147410a;
                if (i12 != 26) {
                    if (i12 != 27) {
                        if (i12 != 30) {
                            if (i12 == 33) {
                                m80143uN();
                            }
                        } else {
                            m80142tN();
                        }
                    } else {
                        m80148zN();
                    }
                } else {
                    m80141sN();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: iN */
    public /* synthetic */ void m80130iN(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        AbstractC23184q2.m119464v(this.f72421L0);
    }

    /* renamed from: jN */
    public /* synthetic */ void m80131jN(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        this.f72359T0 = true;
        this.f72358S0 = false;
        this.f72356Q0 = 1;
        m78433lM(this.f73743m1, 1);
    }

    /* renamed from: kN */
    public /* synthetic */ void m80132kN(C7189r c7189r, C31973j5 c31973j5, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        int intValue = ((Integer) ((HashMap) c7189r.getItem(i11)).get("id")).intValue();
        if (intValue == AbstractC8020f0.str_open_group_chat_v2) {
            try {
                AbstractC23211s7.m119583p(this.f72421L0.m92676n2(), new C27870vb(this.f73733A1.f147411b.mo2478b()).m140780g(this.f73733A1.f147411b).m140776b(), this.f73733A1.f147411b);
                return;
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
                return;
            }
        }
        if (intValue == AbstractC8020f0.str_remove_user_from_group) {
            m83605LM(c31973j5.m153781r(), this.f73750t1);
            return;
        }
        if (intValue == AbstractC8020f0.str_group_in_common_contact_owner) {
            try {
                if (c31973j5.m153758f() != null) {
                    AbstractC23211s7.m119583p(this.f72421L0.m92676n2(), new C27870vb(c31973j5.m153758f()).m140776b(), C28203u6.f131407a.m141809c(c31973j5.m153758f()));
                    return;
                }
                return;
            } catch (Exception e13) {
                AbstractC23350e.m122778h(e13);
                return;
            }
        }
        return;
        AbstractC23350e.m122778h(e11);
    }

    /* renamed from: lN */
    public /* synthetic */ void m80133lN(View view) {
        AbstractC2379w.m12432f(this.f73735C1);
    }

    /* renamed from: mN */
    public /* synthetic */ void m80134mN() {
        try {
            m80145wN(AbstractC23136l9.m118743r0(AbstractC8020f0.str_emptyResult));
            m80146xN(false);
            this.f88760a0.setTitle(AbstractC23136l9.m118746s0(AbstractC8020f0.str_group_in_common_title_with_count, Integer.valueOf(this.f73741k1.size())));
            C25976a c25976a = this.f73745o1;
            if (c25976a != null) {
                c25976a.m133803P(this.f73740j1);
                this.f73745o1.m10008p();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: nN */
    public /* synthetic */ void m80135nN() {
        String m118743r0;
        try {
            this.f73745o1.m133803P(this.f73740j1);
            ActionBar actionBar = this.f88760a0;
            if (this.f73741k1.size() > 0) {
                m118743r0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_group_in_common_title_with_count, Integer.valueOf(this.f73741k1.size()));
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_in_common_title_v3);
            }
            actionBar.setTitle(m118743r0);
            m80146xN(false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: oN */
    public /* synthetic */ void m80136oN(View view) {
        m80141sN();
    }

    /* renamed from: pN */
    public /* synthetic */ void m80137pN(C32076q5 c32076q5) {
        AbstractC19444a.m101696d(this.f73734B1);
        if (c32076q5 != null && c32076q5.m154725n(this.f73750t1)) {
            showDialog(1000);
            return;
        }
        this.f73733A1 = null;
        ToastUtils.showMess(true, AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_in_common_error));
        m80139rN();
    }

    /* renamed from: qN */
    public /* synthetic */ void m80138qN() {
        AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.qj

            /* renamed from: q */
            public final /* synthetic */ C32076q5 f81717q;

            public /* synthetic */ RunnableC16058qj(C32076q5 c32076q5) {
                r2 = c32076q5;
            }

            @Override // java.lang.Runnable
            public final void run() {
                GroupInCommonView.this.m80137pN(r2);
            }
        });
    }

    /* renamed from: rN */
    private void m80139rN() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.rj
            public /* synthetic */ RunnableC16095rj() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                GroupInCommonView.this.m80127fN();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0162 A[Catch: Exception -> 0x0148, TryCatch #0 {Exception -> 0x0148, blocks: (B:9:0x0115, B:11:0x011b, B:14:0x0121, B:16:0x013d, B:20:0x014c, B:22:0x0153, B:26:0x015c, B:28:0x0162, B:29:0x0167, B:31:0x017e, B:33:0x018f, B:34:0x0194, B:35:0x01d1, B:37:0x01d9, B:38:0x01de, B:41:0x01f3, B:43:0x0221, B:44:0x0224, B:46:0x022e, B:48:0x0234, B:49:0x023a, B:52:0x01dc, B:53:0x0192, B:55:0x0165, B:56:0x01a8, B:58:0x01ae, B:59:0x01b3, B:60:0x01b1), top: B:8:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017e A[Catch: Exception -> 0x0148, TryCatch #0 {Exception -> 0x0148, blocks: (B:9:0x0115, B:11:0x011b, B:14:0x0121, B:16:0x013d, B:20:0x014c, B:22:0x0153, B:26:0x015c, B:28:0x0162, B:29:0x0167, B:31:0x017e, B:33:0x018f, B:34:0x0194, B:35:0x01d1, B:37:0x01d9, B:38:0x01de, B:41:0x01f3, B:43:0x0221, B:44:0x0224, B:46:0x022e, B:48:0x0234, B:49:0x023a, B:52:0x01dc, B:53:0x0192, B:55:0x0165, B:56:0x01a8, B:58:0x01ae, B:59:0x01b3, B:60:0x01b1), top: B:8:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d9 A[Catch: Exception -> 0x0148, TryCatch #0 {Exception -> 0x0148, blocks: (B:9:0x0115, B:11:0x011b, B:14:0x0121, B:16:0x013d, B:20:0x014c, B:22:0x0153, B:26:0x015c, B:28:0x0162, B:29:0x0167, B:31:0x017e, B:33:0x018f, B:34:0x0194, B:35:0x01d1, B:37:0x01d9, B:38:0x01de, B:41:0x01f3, B:43:0x0221, B:44:0x0224, B:46:0x022e, B:48:0x0234, B:49:0x023a, B:52:0x01dc, B:53:0x0192, B:55:0x0165, B:56:0x01a8, B:58:0x01ae, B:59:0x01b3, B:60:0x01b1), top: B:8:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f3 A[Catch: Exception -> 0x0148, TryCatch #0 {Exception -> 0x0148, blocks: (B:9:0x0115, B:11:0x011b, B:14:0x0121, B:16:0x013d, B:20:0x014c, B:22:0x0153, B:26:0x015c, B:28:0x0162, B:29:0x0167, B:31:0x017e, B:33:0x018f, B:34:0x0194, B:35:0x01d1, B:37:0x01d9, B:38:0x01de, B:41:0x01f3, B:43:0x0221, B:44:0x0224, B:46:0x022e, B:48:0x0234, B:49:0x023a, B:52:0x01dc, B:53:0x0192, B:55:0x0165, B:56:0x01a8, B:58:0x01ae, B:59:0x01b3, B:60:0x01b1), top: B:8:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01dc A[Catch: Exception -> 0x0148, TryCatch #0 {Exception -> 0x0148, blocks: (B:9:0x0115, B:11:0x011b, B:14:0x0121, B:16:0x013d, B:20:0x014c, B:22:0x0153, B:26:0x015c, B:28:0x0162, B:29:0x0167, B:31:0x017e, B:33:0x018f, B:34:0x0194, B:35:0x01d1, B:37:0x01d9, B:38:0x01de, B:41:0x01f3, B:43:0x0221, B:44:0x0224, B:46:0x022e, B:48:0x0234, B:49:0x023a, B:52:0x01dc, B:53:0x0192, B:55:0x0165, B:56:0x01a8, B:58:0x01ae, B:59:0x01b3, B:60:0x01b1), top: B:8:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0165 A[Catch: Exception -> 0x0148, TryCatch #0 {Exception -> 0x0148, blocks: (B:9:0x0115, B:11:0x011b, B:14:0x0121, B:16:0x013d, B:20:0x014c, B:22:0x0153, B:26:0x015c, B:28:0x0162, B:29:0x0167, B:31:0x017e, B:33:0x018f, B:34:0x0194, B:35:0x01d1, B:37:0x01d9, B:38:0x01de, B:41:0x01f3, B:43:0x0221, B:44:0x0224, B:46:0x022e, B:48:0x0234, B:49:0x023a, B:52:0x01dc, B:53:0x0192, B:55:0x0165, B:56:0x01a8, B:58:0x01ae, B:59:0x01b3, B:60:0x01b1), top: B:8:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ae A[Catch: Exception -> 0x0148, TryCatch #0 {Exception -> 0x0148, blocks: (B:9:0x0115, B:11:0x011b, B:14:0x0121, B:16:0x013d, B:20:0x014c, B:22:0x0153, B:26:0x015c, B:28:0x0162, B:29:0x0167, B:31:0x017e, B:33:0x018f, B:34:0x0194, B:35:0x01d1, B:37:0x01d9, B:38:0x01de, B:41:0x01f3, B:43:0x0221, B:44:0x0224, B:46:0x022e, B:48:0x0234, B:49:0x023a, B:52:0x01dc, B:53:0x0192, B:55:0x0165, B:56:0x01a8, B:58:0x01ae, B:59:0x01b3, B:60:0x01b1), top: B:8:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b1 A[Catch: Exception -> 0x0148, TryCatch #0 {Exception -> 0x0148, blocks: (B:9:0x0115, B:11:0x011b, B:14:0x0121, B:16:0x013d, B:20:0x014c, B:22:0x0153, B:26:0x015c, B:28:0x0162, B:29:0x0167, B:31:0x017e, B:33:0x018f, B:34:0x0194, B:35:0x01d1, B:37:0x01d9, B:38:0x01de, B:41:0x01f3, B:43:0x0221, B:44:0x0224, B:46:0x022e, B:48:0x0234, B:49:0x023a, B:52:0x01dc, B:53:0x0192, B:55:0x0165, B:56:0x01a8, B:58:0x01ae, B:59:0x01b3, B:60:0x01b1), top: B:8:0x0115 }] */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        boolean z11;
        int i12;
        String str;
        int i13;
        int i14;
        ContactProfile m118084d;
        int i15;
        switch (i11) {
            case 1000:
                try {
                    C32020m7 c32020m7 = this.f73733A1;
                    C31973j5 c31973j5 = c32020m7.f147413d;
                    if (c31973j5 != null && c32020m7.f147411b != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(AbstractC23184q2.m119451i(AbstractC23136l9.m118743r0(AbstractC8020f0.str_open_group_chat_v2), AbstractC8020f0.str_open_group_chat_v2));
                        if (!c31973j5.m153744V(this.f73750t1) && !c31973j5.m153780q0(this.f73750t1)) {
                            z11 = false;
                            if (!c31973j5.m153778p0() && (!c31973j5.m153743U() || z11)) {
                                if (!c31973j5.m153747Y()) {
                                    i14 = AbstractC8020f0.str_btn_contact_community_owner;
                                } else {
                                    i14 = AbstractC8020f0.str_group_in_common_contact_owner;
                                }
                                arrayList.add(AbstractC23184q2.m119451i(AbstractC23136l9.m118743r0(i14), AbstractC8020f0.str_group_in_common_contact_owner));
                                m118084d = AbstractC23028c0.m118084d(c31973j5.m153758f());
                                if (m118084d != null) {
                                    String m118085e = AbstractC23028c0.m118085e(m118084d, false, AbstractC8020f0.str_me);
                                    StringBuilder sb2 = new StringBuilder();
                                    if (c31973j5.m153747Y()) {
                                        i15 = AbstractC8020f0.str_community_owner_role;
                                    } else {
                                        i15 = AbstractC8020f0.str_owner_role;
                                    }
                                    sb2.append(AbstractC23136l9.m118743r0(i15));
                                    sb2.append(": ");
                                    sb2.append(m118085e);
                                    str = sb2.toString();
                                    if (c31973j5.m153747Y()) {
                                        i13 = AbstractC8020f0.str_prefix_community_dpn;
                                    } else {
                                        i13 = AbstractC8020f0.str_prefix_group_dpn;
                                    }
                                    StringBuilder sb3 = new StringBuilder(AbstractC23136l9.m118743r0(i13));
                                    sb3.append(c31973j5.m153793y());
                                    if (arrayList.size() != 0) {
                                        C7189r c7189r = new C7189r(this.f72421L0.m92648SI(), arrayList);
                                        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                                        View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.popup_mention_title_view, (ViewGroup) null);
                                        TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.tv_title);
                                        if (textView != null) {
                                            textView.setText(sb3);
                                        }
                                        TextView textView2 = (TextView) inflate.findViewById(AbstractC6918a0.tv_message);
                                        if (textView2 != null && !TextUtils.isEmpty(str)) {
                                            textView2.setVisibility(0);
                                            textView2.setText(str);
                                        }
                                        aVar.m43158g(inflate);
                                        aVar.m43155d(true);
                                        aVar.m43153b(c7189r, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.sj

                                            /* renamed from: q */
                                            public final /* synthetic */ C7189r f82104q;

                                            /* renamed from: r */
                                            public final /* synthetic */ C31973j5 f82105r;

                                            public /* synthetic */ C16156sj(C7189r c7189r2, C31973j5 c31973j52) {
                                                r2 = c7189r2;
                                                r3 = c31973j52;
                                            }

                                            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                                            /* renamed from: K8 */
                                            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i16) {
                                                GroupInCommonView.this.m80132kN(r2, r3, interfaceC17463d, i16);
                                            }
                                        });
                                        return aVar.m43152a();
                                    }
                                    break;
                                }
                                str = null;
                                if (c31973j52.m153747Y()) {
                                }
                                StringBuilder sb32 = new StringBuilder(AbstractC23136l9.m118743r0(i13));
                                sb32.append(c31973j52.m153793y());
                                if (arrayList.size() != 0) {
                                }
                            }
                            if (!c31973j52.m153747Y()) {
                                i12 = AbstractC8020f0.str_community_common_remove_member;
                            } else {
                                i12 = AbstractC8020f0.str_group_common_remove_member;
                            }
                            arrayList.add(AbstractC23184q2.m119452j(AbstractC23136l9.m118746s0(i12, this.f73751u1), AbstractC8020f0.str_remove_user_from_group, AbstractC23136l9.m118641B(getContext(), AbstractC16801x.cNotify1)));
                            str = null;
                            if (c31973j52.m153747Y()) {
                            }
                            StringBuilder sb322 = new StringBuilder(AbstractC23136l9.m118743r0(i13));
                            sb322.append(c31973j52.m153793y());
                            if (arrayList.size() != 0) {
                            }
                        }
                        z11 = true;
                        if (!c31973j52.m153778p0()) {
                            if (!c31973j52.m153747Y()) {
                            }
                            arrayList.add(AbstractC23184q2.m119451i(AbstractC23136l9.m118743r0(i14), AbstractC8020f0.str_group_in_common_contact_owner));
                            m118084d = AbstractC23028c0.m118084d(c31973j52.m153758f());
                            if (m118084d != null) {
                            }
                            str = null;
                            if (c31973j52.m153747Y()) {
                            }
                            StringBuilder sb3222 = new StringBuilder(AbstractC23136l9.m118743r0(i13));
                            sb3222.append(c31973j52.m153793y());
                            if (arrayList.size() != 0) {
                            }
                        }
                        if (!c31973j52.m153747Y()) {
                        }
                        arrayList.add(AbstractC23184q2.m119452j(AbstractC23136l9.m118746s0(i12, this.f73751u1), AbstractC8020f0.str_remove_user_from_group, AbstractC23136l9.m118641B(getContext(), AbstractC16801x.cNotify1)));
                        str = null;
                        if (c31973j52.m153747Y()) {
                        }
                        StringBuilder sb32222 = new StringBuilder(AbstractC23136l9.m118743r0(i13));
                        sb32222.append(c31973j52.m153793y());
                        if (arrayList.size() != 0) {
                        }
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    break;
                }
                break;
            case 1001:
                C8009j.a aVar2 = new C8009j.a(m92648SI());
                aVar2.m43159h(4).m43162k(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_msg_user_join_over_max_groups), Integer.valueOf(C19637j.f97466a.m102831L()))).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_choose_group_to_leave), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.tj
                    public /* synthetic */ C16193tj() {
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i16) {
                        GroupInCommonView.this.m80130iN(interfaceC17463d, i16);
                    }
                });
                return aVar2.m43152a();
            case ZAbstractBase.ZVU_BLEND_PERCENTAGE /* 1002 */:
                try {
                    this.f72362W0.m155389c();
                    ContactProfile m141811g = C28203u6.f131407a.m141811g(this.f73750t1);
                    m141811g.f42373R0 = 1;
                    this.f72362W0.m155387a(new InviteContactProfile(m141811g));
                    this.f72357R0 = C0943w.m4462l().m4472f(this.f73743m1);
                    String m40383Q = m141811g.m40383Q(true, false);
                    if (m40383Q.length() > 20) {
                        m40383Q = m40383Q.substring(0, 20) + "...";
                    }
                    String m153793y = this.f72357R0.m153793y();
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_dialog_msg_confirm_invite_to_group);
                    int indexOf = m118743r0.indexOf("%1$s");
                    String replace = m118743r0.replace("%1$s", m40383Q);
                    int indexOf2 = replace.indexOf("%2$s");
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace.replace("%2$s", m153793y));
                    spannableStringBuilder.setSpan(new StyleSpan(1), indexOf, m40383Q.length() + indexOf, 33);
                    spannableStringBuilder.setSpan(new StyleSpan(1), indexOf2, m153793y.length() + indexOf2, 33);
                    C8009j.a aVar3 = new C8009j.a(m92648SI());
                    aVar3.m43159h(4).m43162k(spannableStringBuilder).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_add), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.uj
                        public /* synthetic */ C16230uj() {
                        }

                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i16) {
                            GroupInCommonView.this.m80131jN(interfaceC17463d, i16);
                        }
                    });
                    return aVar3.m43152a();
                } catch (Exception e12) {
                    AbstractC23350e.m122778h(e12);
                    break;
                }
        }
        return super.mo39014DJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        try {
            super.mo37482FJ(actionBarMenu);
            actionBarMenu.m92750r();
            ActionBarMenuItem m92738e = actionBarMenu.m92738e(AbstractC6918a0.menu_item_search, AbstractC16803z.icn_header_search);
            this.f73736D1 = m92738e;
            m92738e.m92768B(true, true, AbstractC16803z.icn_header_close_white, AbstractC16803z.search_cursor_white);
            this.f73736D1.m92767A(this.f73737E1);
            EditText searchField = this.f73736D1.getSearchField();
            this.f73735C1 = searchField;
            if (searchField != null) {
                searchField.setEllipsize(TextUtils.TruncateAt.END);
                EditText editText = this.f73735C1;
                editText.setHintTextColor(AbstractC23136l9.m118641B(editText.getContext(), AbstractC16801x.white_50));
                EditText editText2 = this.f73735C1;
                editText2.setTextColor(AbstractC23136l9.m118641B(editText2.getContext(), AbstractC16801x.white));
                this.f73735C1.setHint(AbstractC23136l9.m118743r0(AbstractC8020f0.hint_default_search));
                this.f73735C1.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.zj
                    public /* synthetic */ ViewOnClickListenerC16415zj() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        GroupInCommonView.this.m80133lN(view);
                    }
                });
                if (this.f73735C1.getParent() != null) {
                    ((View) this.f73735C1.getParent()).setBackgroundResource(AbstractC16803z.stencil_edit_text_focused_no_space_white);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f73753w1 = layoutInflater.inflate(AbstractC7409c0.group_in_common_view, viewGroup, false);
        m92637BK(true);
        this.f73748r1 = (MultiStateView) this.f73753w1.findViewById(AbstractC6918a0.multi_state);
        this.f73746p1 = (RecyclerView) this.f73753w1.findViewById(AbstractC6918a0.groupRecyclerView);
        m80145wN(AbstractC23136l9.m118743r0(AbstractC8020f0.empty_list));
        m80147yN(AbstractC8020f0.str_tv_loadingGroupList);
        C19637j.f97466a.m102840X();
        return this.f73753w1;
    }

    @Override // com.zing.zalo.p077ui.zviews.RemoveGroupMemberBaseView
    /* renamed from: HM */
    public void mo78398HM() {
        LinkedList linkedList;
        if (!TextUtils.isEmpty(this.f76928X0) && (linkedList = this.f73741k1) != null) {
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((C32020m7) it.next()) == this.f73733A1) {
                        it.remove();
                        break;
                    }
                }
            }
            LinkedList linkedList2 = this.f73740j1;
            if (linkedList2 != null) {
                Iterator it2 = linkedList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((C32020m7) it2.next()) == this.f73733A1) {
                        it2.remove();
                        break;
                    }
                }
            }
        }
        this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.vj
            public /* synthetic */ RunnableC16267vj() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                GroupInCommonView.this.m80134mN();
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 65);
        C23744a.m124114c().m124117e(this, 27);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            try {
                AbstractC2379w.m12430d(this.f73735C1);
                finish();
                return true;
            } catch (Exception unused) {
                return super.mo37491QJ(i11);
            }
        }
        return true;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        try {
            bundle.putBoolean("BUNDLE_SAVE_KEY_IS_SEARCH_MODE", this.f72421L0.m92646QI().m92719n());
            bundle.putString("BUNDLE_SAVE_KEY_CURRENT_SEARCH_TEXT", this.f73735C1.getText().toString().trim());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        super.mo37118SJ(bundle);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
                this.f88760a0.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_in_common_title_v3));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: bN */
    void m80140bN(String str) {
        if (this.f73738F1) {
            return;
        }
        this.f73738F1 = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14346d(str));
        c0766k.mo1789z4(str, (byte) 0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        Intent intent = m92676n2().getIntent();
        intent.putExtra("group_size", this.f73741k1.size());
        intent.putExtra("uid", this.f73750t1);
        mo50035CK(-1, intent);
        super.finish();
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseInviteGroupMemberView
    /* renamed from: gM */
    public void mo78429gM(int i11, ArrayList arrayList) {
        if (i11 == 0) {
            if (!TextUtils.isEmpty(this.f73743m1)) {
                ToastUtils.m89268p(AbstractC23136l9.m118746s0(AbstractC8020f0.str_msg_toast_add_user_to_suggest_group_success, C28203u6.f131407a.m141811g(this.f73750t1).m40383Q(true, true)));
                if (this.f73744n1.containsKey(this.f73743m1)) {
                    this.f73742l1.remove(this.f73744n1.remove(this.f73743m1));
                    m80139rN();
                    return;
                }
                return;
            }
            return;
        }
        m80110AN(i11);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GroupInCommonView";
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseInviteGroupMemberView
    /* renamed from: iM */
    public int mo78430iM(boolean z11, JSONObject jSONObject) {
        if (z11) {
            try {
                String optString = jSONObject.optString("wrong_members", "");
                if (!TextUtils.isEmpty(optString)) {
                    JSONArray jSONArray = new JSONArray(optString);
                    if (jSONArray.length() > 0) {
                        return jSONArray.getJSONObject(0).getInt("errorCode");
                    }
                }
                String optString2 = jSONObject.optString("wrong_phones", "");
                if (!TextUtils.isEmpty(optString2)) {
                    JSONArray jSONArray2 = new JSONArray(optString2);
                    if (jSONArray2.length() > 0) {
                        return jSONArray2.getJSONObject(0).getInt("errorCode");
                    }
                }
                if (Integer.parseInt(jSONObject.optString("isPendingList")) > 0) {
                    return 17007;
                }
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        return 0;
    }

    /* renamed from: sN */
    void m80141sN() {
        if (C19637j.f97466a.m102834Q()) {
            AbstractC23647d.m123897g("27405");
            Bundle bundle = new Bundle();
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(this.f73750t1);
            bundle.putShort("SHORT_EXTRA_CREATE_SOURCE", (short) 9);
            bundle.putStringArrayList("STR_EXTRA_SELECTED_UIDS", arrayList);
            bundle.putString("extra_preload_data", QuickCreateGroupView.m83234GM(1, AbstractC23136l9.m118743r0(AbstractC8020f0.str_new_group_title_select_member)));
            m92662fJ().m93069k2(QuickCreateGroupView.class, bundle, 1, true);
            return;
        }
        try {
            this.f72421L0.showDialog(1001);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: tN */
    void m80142tN() {
        AbstractC23647d.m123897g("1591064");
        Bundle bundle = new Bundle();
        bundle.putString("extra_conversation_id", this.f73750t1);
        bundle.putString("extra_display_name", this.f73751u1);
        bundle.putString("STR_SOURCE_START_VIEW", this.f73756z1);
        m92662fJ().m93069k2(InviteToMultiGroupView.class, bundle, 1, true);
    }

    /* renamed from: uN */
    void m80143uN() {
        this.f73755y1 = true;
        m80144vN();
    }

    /* renamed from: vN */
    public void m80144vN() {
        int size;
        Collection subList;
        boolean z11;
        this.f73740j1.clear();
        C32020m7 c32020m7 = new C32020m7(26);
        if (m80124cN()) {
            c32020m7.f147428s = AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_group_common_with) + " " + this.f73751u1;
            this.f73740j1.add(c32020m7);
        }
        C32020m7 c32020m72 = new C32020m7(30);
        if (m80125dN()) {
            c32020m72.f147428s = AbstractC23136l9.m118746s0(AbstractC8020f0.str_invite_to_multi_group, this.f73751u1);
            this.f73740j1.add(c32020m72);
        }
        if (this.f73741k1.size() > 5) {
            size = 5;
        } else {
            size = this.f73741k1.size();
        }
        LinkedList linkedList = this.f73740j1;
        if (this.f73755y1) {
            subList = this.f73741k1;
        } else {
            subList = this.f73741k1.subList(0, size);
        }
        linkedList.addAll(subList);
        if (!this.f73755y1 && this.f73741k1.size() > 5) {
            C32020m7 c32020m73 = new C32020m7(33);
            c32020m73.f147428s = AbstractC23136l9.m118743r0(AbstractC8020f0.btn_see_more);
            this.f73740j1.add(c32020m73);
        }
        int size2 = this.f73740j1.size();
        for (int i11 = 0; i11 < size2; i11++) {
            C32020m7 c32020m74 = (C32020m7) this.f73740j1.get(i11);
            ContactProfile contactProfile = c32020m74.f147411b;
            if (contactProfile != null) {
                contactProfile.f42399a1.clear();
            }
            if (i11 == size2 - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            c32020m74.f147415f = z11;
        }
        if (this.f73742l1.size() > 0) {
            C32020m7 c32020m75 = new C32020m7(32);
            c32020m75.f147428s = AbstractC23136l9.m118746s0(AbstractC8020f0.str_title_section_group_suggestion, C28203u6.f131407a.m141811g(this.f73750t1).m40383Q(true, false));
            this.f73740j1.add(c32020m75);
            this.f73740j1.addAll(this.f73742l1);
        }
        this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.yj
            public /* synthetic */ RunnableC16378yj() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                GroupInCommonView.this.m80135nN();
            }
        });
    }

    /* renamed from: wN */
    void m80145wN(String str) {
        MultiStateView multiStateView = this.f73748r1;
        if (multiStateView != null) {
            multiStateView.setEmptyViewString(str);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        try {
            if (i11 != 27) {
                if (i11 == 65) {
                    m80144vN();
                    return;
                }
                return;
            }
            if (objArr != null && objArr.length >= 3) {
                String str = (String) objArr[0];
                int intValue = ((Integer) objArr[1]).intValue();
                ArrayList arrayList = new ArrayList(Arrays.asList(TextUtils.split((String) objArr[2], ";")));
                boolean contains = arrayList.contains(CoreUtility.f89233i);
                boolean contains2 = arrayList.contains(this.f73750t1);
                if (!arrayList.isEmpty()) {
                    if (intValue != 3) {
                        if ((intValue == 4 || intValue == 10) && contains) {
                            if (this.f73744n1.containsKey(str)) {
                                this.f73742l1.remove(this.f73744n1.remove(str));
                            }
                            m80139rN();
                            return;
                        }
                        return;
                    }
                    if (contains2) {
                        if (this.f73744n1.containsKey(str)) {
                            C32020m7 c32020m7 = (C32020m7) this.f73744n1.remove(str);
                            this.f73742l1.remove(c32020m7);
                            ToastUtils.m89268p(AbstractC23136l9.m118746s0(AbstractC8020f0.str_be_kickout_group_3, this.f73751u1, c32020m7.f147413d.m153793y()));
                        }
                        m80139rN();
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            this.f73749s1 = new C23528a(this.f72421L0.m92648SI());
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null) {
                this.f73750t1 = m92642L3.getString("extra_conversation_id", "");
                String string = m92642L3.getString("extra_display_name", "");
                this.f73751u1 = string;
                this.f73752v1 = string;
                ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f73750t1);
                if (m141809c != null) {
                    this.f73751u1 = m141809c.m40383Q(true, false);
                }
                if (this.f73751u1.length() > 10) {
                    this.f73751u1 = this.f73751u1.substring(0, 10) + "...";
                }
                this.f73756z1 = m92642L3.getString("STR_SOURCE_START_VIEW", "");
            }
            if (bundle != null) {
                try {
                    if (bundle.containsKey("BUNDLE_SAVE_KEY_IS_SEARCH_MODE") && bundle.getBoolean("BUNDLE_SAVE_KEY_IS_SEARCH_MODE") && bundle.containsKey("BUNDLE_SAVE_KEY_CURRENT_SEARCH_TEXT")) {
                        this.f73754x1 = bundle.getString("BUNDLE_SAVE_KEY_CURRENT_SEARCH_TEXT");
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
            C31784b.m152808a(this.f73746p1).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.mj
                public /* synthetic */ C15896mj() {
                }

                @Override // zc0.C31784b.d
                /* renamed from: i0 */
                public final void mo17458i0(RecyclerView recyclerView, int i11, View view) {
                    GroupInCommonView.this.m80129hN(recyclerView, i11, view);
                }
            });
            C25976a c25976a = new C25976a(this.f73749s1, new C14343a());
            this.f73745o1 = c25976a;
            c25976a.m9999J(true);
            this.f73746p1.setAdapter(this.f73745o1);
            this.f73746p1.setHasFixedSize(true);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f72421L0.m92648SI());
            this.f73747q1 = linearLayoutManager;
            this.f73746p1.setLayoutManager(linearLayoutManager);
            this.f73746p1.setItemAnimator(null);
            this.f73746p1.m9826E(new C14344b());
            m80144vN();
            m80146xN(true);
            if (!TextUtils.isEmpty(this.f73750t1)) {
                m80139rN();
                if (!AbstractC21935u.m114515E(this.f73750t1) && !AbstractC21935u.m114536c(this.f73750t1)) {
                    m80140bN(this.f73750t1);
                }
            }
            C0815e1.m2075D().m2100V(new C23648e(5, this.f73756z1, 1, "gr_incommon", "1"), false);
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
        }
    }

    /* renamed from: xN */
    void m80146xN(boolean z11) {
        if (z11) {
            this.f73748r1.setVisibility(0);
            this.f73748r1.setState(MultiStateView.EnumC15914e.LOADING);
            return;
        }
        if (this.f73741k1.size() <= 0 && this.f73742l1.size() <= 0) {
            this.f73748r1.setVisibility(0);
            if (this.f73741k1.isEmpty()) {
                this.f73748r1.setEnableBtnEmpty(false);
                this.f73748r1.setEmptyOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.oj
                    public /* synthetic */ ViewOnClickListenerC15984oj() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        GroupInCommonView.this.m80136oN(view);
                    }
                });
                this.f73748r1.setState(MultiStateView.EnumC15914e.EMPTY);
                m80145wN(AbstractC23136l9.m118746s0(AbstractC8020f0.str_empty_state_group_in_common, this.f73752v1));
                this.f73748r1.setEmptyImageResourceId(AbstractC16803z.illus_emptystate_list);
                this.f73748r1.m87366h(AbstractC23136l9.m118742r(25.0f), AbstractC23136l9.m118742r(10.0f), AbstractC23136l9.m118742r(25.0f), AbstractC23136l9.m118742r(10.0f));
                this.f73748r1.setBtnEmptyString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_createGroup));
                return;
            }
            this.f73748r1.setEmptyImageResourceId(AbstractC16803z.illus_empty);
            this.f73748r1.setState(MultiStateView.EnumC15914e.EMPTY);
            return;
        }
        this.f73748r1.setVisibility(8);
        this.f73746p1.setVisibility(0);
    }

    /* renamed from: yN */
    void m80147yN(int i11) {
        MultiStateView multiStateView = this.f73748r1;
        if (multiStateView != null) {
            multiStateView.setEmptyViewString(AbstractC23136l9.m118743r0(i11));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 65);
        C23744a.m124114c().m124115b(this, 27);
    }

    /* renamed from: zN */
    void m80148zN() {
        if (this.f73733A1 == null) {
            return;
        }
        AbstractC19444a.m101694b(this.f73734B1, 1000L);
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.nj
            public /* synthetic */ RunnableC15946nj() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                GroupInCommonView.this.m80138qN();
            }
        });
    }
}
