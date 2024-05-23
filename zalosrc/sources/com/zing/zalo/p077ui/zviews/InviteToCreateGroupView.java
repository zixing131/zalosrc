package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.AbstractC0837p0;
import ag0.C0815e1;
import am.AbstractC0906d0;
import am.C0943w;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.C7005a5;
import com.zing.zalo.adapters.C7061f3;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactMask;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.StencilSwitch;
import com.zing.zalo.p077ui.zviews.InviteToCreateGroupView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import ed0.AbstractC18391a;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import me0.AbstractC23056e6;
import me0.AbstractC23126l;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import me0.AbstractC23262x6;
import me0.C23212s8;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18635e;
import p142ey.C18644n;
import p262jb.AbstractC21196a;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p716zh.C31901e8;
import p716zh.C31916f8;
import p716zh.C31934gb;
import p716zh.C31973j5;
import p716zh.C31986k3;
import p716zh.C32076q5;
import p720zl.C32223a;
import th.C26691l;
import vg.AbstractC28034c7;
import vg.C28146o3;
import vg.C28203u6;
import zc0.C31784b;

@SuppressLint({"InflateParams"})
/* loaded from: classes6.dex */
public class InviteToCreateGroupView extends BaseInviteGroupMemberView implements C23744a.c, View.OnClickListener, InterfaceC17463d.d, InterfaceC0733x {

    /* renamed from: W1 */
    static final String f74426W1 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_alphabe);

    /* renamed from: X0 */
    EditText f74449X0;

    /* renamed from: Y0 */
    ImageButton f74450Y0;

    /* renamed from: Z0 */
    TextView f74451Z0;

    /* renamed from: a1 */
    ListView f74452a1;

    /* renamed from: b1 */
    View f74453b1;

    /* renamed from: c1 */
    View f74454c1;

    /* renamed from: d1 */
    View f74455d1;

    /* renamed from: e1 */
    LinearLayout f74456e1;

    /* renamed from: f1 */
    AppCompatImageView f74457f1;

    /* renamed from: g1 */
    LinearLayout f74458g1;

    /* renamed from: h1 */
    RecyclerView f74459h1;

    /* renamed from: i1 */
    C7005a5 f74460i1;

    /* renamed from: j1 */
    MultiStateView f74461j1;

    /* renamed from: k1 */
    KeyboardAwareLinearLayout f74462k1;

    /* renamed from: l1 */
    View f74463l1;

    /* renamed from: m1 */
    View f74464m1;

    /* renamed from: n1 */
    View f74465n1;

    /* renamed from: o1 */
    StencilSwitch f74466o1;

    /* renamed from: p1 */
    RobotoTextView f74467p1;

    /* renamed from: r1 */
    int f74469r1;

    /* renamed from: s1 */
    String f74470s1;

    /* renamed from: t1 */
    String f74471t1;

    /* renamed from: v1 */
    int f74473v1;

    /* renamed from: w1 */
    int f74474w1;

    /* renamed from: y1 */
    C7061f3 f74476y1;

    /* renamed from: q1 */
    boolean f74468q1 = false;

    /* renamed from: u1 */
    Boolean f74472u1 = Boolean.FALSE;

    /* renamed from: x1 */
    int f74475x1 = 0;

    /* renamed from: z1 */
    final HashSet f74477z1 = new HashSet();

    /* renamed from: A1 */
    boolean f74427A1 = false;

    /* renamed from: B1 */
    volatile ArrayList f74428B1 = new ArrayList();

    /* renamed from: C1 */
    volatile C32223a f74429C1 = new C32223a();

    /* renamed from: D1 */
    ArrayList f74430D1 = new ArrayList();

    /* renamed from: E1 */
    HashSet f74431E1 = new HashSet();

    /* renamed from: F1 */
    String f74432F1 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_group_tab_suggest);

    /* renamed from: G1 */
    boolean f74433G1 = false;

    /* renamed from: H1 */
    final C32223a f74434H1 = new C32223a();

    /* renamed from: I1 */
    final HashSet f74435I1 = new HashSet();

    /* renamed from: J1 */
    String f74436J1 = "";

    /* renamed from: K1 */
    boolean f74437K1 = false;

    /* renamed from: L1 */
    String f74438L1 = "";

    /* renamed from: M1 */
    String f74439M1 = "0";

    /* renamed from: N1 */
    boolean f74440N1 = false;

    /* renamed from: O1 */
    private final TextWatcher f74441O1 = new C14482b();

    /* renamed from: P1 */
    InterfaceC0765j f74442P1 = new C0766k();

    /* renamed from: Q1 */
    InterfaceC20094a f74443Q1 = new C14485e();

    /* renamed from: R1 */
    boolean f74444R1 = false;

    /* renamed from: S1 */
    ArrayList f74445S1 = null;

    /* renamed from: T1 */
    C32223a f74446T1 = new C32223a();

    /* renamed from: U1 */
    int f74447U1 = 0;

    /* renamed from: V1 */
    C28146o3 f74448V1 = null;

    /* renamed from: com.zing.zalo.ui.zviews.InviteToCreateGroupView$a */
    /* loaded from: classes6.dex */
    class C14481a extends ZdsActionBar.AbstractC16987c {
        C14481a() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            AbstractC2379w.m12430d(InviteToCreateGroupView.this.f74449X0);
            InviteToCreateGroupView.this.finish();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.InviteToCreateGroupView$b */
    /* loaded from: classes6.dex */
    class C14482b extends AbstractC18391a {
        C14482b() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            EditText editText = InviteToCreateGroupView.this.f74449X0;
            if (editText != null && editText.getText() != null) {
                String trim = InviteToCreateGroupView.this.f74449X0.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    InviteToCreateGroupView.this.m80957mN(true);
                    InviteToCreateGroupView.this.f74450Y0.setVisibility(0);
                    InviteToCreateGroupView.this.m80955jN(0);
                } else {
                    InviteToCreateGroupView.this.m80957mN(false);
                    InviteToCreateGroupView.this.f74450Y0.setVisibility(8);
                    InviteToCreateGroupView.this.m80955jN(8);
                }
                InviteToCreateGroupView.this.m80944GM(trim);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.InviteToCreateGroupView$c */
    /* loaded from: classes6.dex */
    public class ViewTreeObserverOnGlobalLayoutListenerC14483c implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC14483c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (InviteToCreateGroupView.this.f74458g1.getHeight() > 0) {
                InviteToCreateGroupView.this.f74458g1.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                InviteToCreateGroupView.this.m80958nN();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.InviteToCreateGroupView$d */
    /* loaded from: classes6.dex */
    public class C14484d implements InterfaceC20094a {
        C14484d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m80963e() {
            InviteToCreateGroupView.this.f72421L0.mo49315c4();
            InviteToCreateGroupView.this.f72357R0 = C0943w.m4462l().m4472f(InviteToCreateGroupView.this.f74470s1);
            InviteToCreateGroupView inviteToCreateGroupView = InviteToCreateGroupView.this;
            C31973j5 c31973j5 = inviteToCreateGroupView.f72357R0;
            if (c31973j5 != null) {
                inviteToCreateGroupView.f74466o1.setChecked(c31973j5.m153751b0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m80964f(C20096c c20096c) {
            boolean z11;
            InviteToCreateGroupView.this.f72421L0.mo49315c4();
            if (c20096c != null) {
                C31973j5 m4472f = C0943w.m4462l().m4472f(InviteToCreateGroupView.this.f74470s1);
                if (m4472f != null && m4472f.m153747Y()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ToastUtils.m89261i(c20096c, z11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            try {
                InviteToCreateGroupView.this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.xr
                    @Override // java.lang.Runnable
                    public final void run() {
                        InviteToCreateGroupView.C14484d.this.m80964f(c20096c);
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                InviteToCreateGroupView.this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.yr
                    @Override // java.lang.Runnable
                    public final void run() {
                        InviteToCreateGroupView.C14484d.this.m80963e();
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.InviteToCreateGroupView$e */
    /* loaded from: classes6.dex */
    class C14485e implements InterfaceC20094a {
        C14485e() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            InviteToCreateGroupView.this.f74444R1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C32076q5 c32076q5;
            InviteToCreateGroupView.this.f74444R1 = false;
            try {
                JSONObject jSONObject = new JSONObject(obj.toString());
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (!jSONObject.isNull("error_code") && jSONObject.getInt("error_code") == 0) {
                    InviteToCreateGroupView.this.f74431E1.clear();
                    InviteToCreateGroupView.this.f74430D1.clear();
                    boolean z11 = !TextUtils.isEmpty(AbstractC23309i.m122303q0());
                    JSONArray optJSONArray = jSONObject2.optJSONArray("suggestMembers");
                    if (optJSONArray != null) {
                        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                            try {
                                JSONObject jSONObject3 = (JSONObject) optJSONArray.get(i11);
                                String optString = jSONObject3.optString("uid");
                                if (!z11 || !C21927m.m114302u().m114345m(optString)) {
                                    String optString2 = jSONObject3.optString("dpn");
                                    String optString3 = jSONObject3.optString("avt");
                                    ContactProfile m141811g = C28203u6.f131407a.m141811g(optString);
                                    if (m141811g != null) {
                                        optString2 = m141811g.m40383Q(true, false);
                                    }
                                    if (InviteToCreateGroupView.this.f72357R0 != null) {
                                        c32076q5 = C0943w.m4462l().m4476k(InviteToCreateGroupView.this.f72357R0.m153781r());
                                    } else {
                                        c32076q5 = null;
                                    }
                                    if (InviteToCreateGroupView.this.m80940CM(optString, c32076q5)) {
                                        InviteContactProfile inviteContactProfile = new InviteContactProfile(optString, optString3, optString2);
                                        inviteContactProfile.f42373R0 = 1;
                                        InviteToCreateGroupView.this.f74431E1.add(optString);
                                        InviteToCreateGroupView.this.f74430D1.add(inviteContactProfile);
                                    }
                                }
                            } catch (Exception e11) {
                                AbstractC23350e.m122778h(e11);
                            }
                        }
                        if (InviteToCreateGroupView.this.f74430D1.size() > 0) {
                            ArrayList arrayList = InviteToCreateGroupView.this.f74430D1;
                            ((InviteContactProfile) arrayList.get(arrayList.size() - 1)).f42405d1 = true;
                            InviteToCreateGroupView.this.m80921dN();
                        }
                    }
                }
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.InviteToCreateGroupView$f */
    /* loaded from: classes6.dex */
    public class C14486f extends AbstractC28034c7 {
        C14486f() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            try {
                if (i11 == 0) {
                    C7061f3 c7061f3 = InviteToCreateGroupView.this.f74476y1;
                    c7061f3.f38582r = false;
                    c7061f3.notifyDataSetChanged();
                } else {
                    InviteToCreateGroupView inviteToCreateGroupView = InviteToCreateGroupView.this;
                    inviteToCreateGroupView.f74476y1.f38582r = true;
                    AbstractC2379w.m12430d(inviteToCreateGroupView.f74449X0);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.InviteToCreateGroupView$g */
    /* loaded from: classes6.dex */
    public class C14487g implements C28146o3.b {
        C14487g() {
        }

        @Override // vg.C28146o3.b
        /* renamed from: a */
        public void mo40211a() {
            if (TextUtils.isEmpty(InviteToCreateGroupView.this.f74449X0.getText().toString().trim())) {
                InviteToCreateGroupView.this.m80921dN();
            }
        }

        @Override // vg.C28146o3.b
        /* renamed from: b */
        public void mo40212b(boolean z11, String str, ArrayList arrayList, int i11) {
            ListView listView;
            try {
                if (str.equals(InviteToCreateGroupView.this.f74449X0.getText().toString().trim())) {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
                            if (inviteContactProfile.m40381O0()) {
                                if (InviteToCreateGroupView.this.f72360U0.containsKey(inviteContactProfile.f42434r)) {
                                    arrayList3.add(inviteContactProfile);
                                } else {
                                    arrayList4.add(inviteContactProfile);
                                }
                            } else if (AbstractC21935u.m114556w(inviteContactProfile.f42434r)) {
                                arrayList2.add(inviteContactProfile);
                            } else {
                                arrayList3.add(inviteContactProfile);
                            }
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(arrayList2.size() + arrayList3.size() + arrayList4.size());
                    arrayList5.addAll(arrayList2);
                    arrayList5.addAll(arrayList3);
                    arrayList5.addAll(arrayList4);
                    InviteToCreateGroupView.this.f74428B1 = arrayList5;
                    InviteToCreateGroupView inviteToCreateGroupView = InviteToCreateGroupView.this;
                    inviteToCreateGroupView.f74475x1 = i11;
                    if (z11 || (inviteToCreateGroupView.f74428B1 != null && !InviteToCreateGroupView.this.f74428B1.isEmpty())) {
                        InviteToCreateGroupView.this.m80953hN(false);
                    }
                    InviteToCreateGroupView.this.f74451Z0.setText("");
                    if (arrayList5.size() == 1) {
                        InviteToCreateGroupView.this.f74451Z0.setPadding(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(0.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(125.0f));
                        if (arrayList3.size() == 1) {
                            C32076q5 m4476k = C0943w.m4462l().m4476k(InviteToCreateGroupView.this.f74470s1);
                            if (m4476k != null && !m4476k.m154725n(((InviteContactProfile) arrayList3.get(0)).f42434r) && !InviteToCreateGroupView.this.f74472u1.booleanValue()) {
                                InviteToCreateGroupView.this.f74451Z0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_result_stranger));
                            }
                        } else if (arrayList4.size() == 1) {
                            InviteToCreateGroupView.this.f74451Z0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_result_nonzalo));
                        }
                    } else if (arrayList5.size() == 0) {
                        InviteToCreateGroupView.this.f74451Z0.setPadding(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(32.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(125.0f));
                        InviteToCreateGroupView.this.f74451Z0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_empty_search_result));
                    }
                    InviteToCreateGroupView inviteToCreateGroupView2 = InviteToCreateGroupView.this;
                    inviteToCreateGroupView2.f74476y1.m36062a(inviteToCreateGroupView2.f74428B1);
                    if (InviteToCreateGroupView.this.f74428B1 != null && !InviteToCreateGroupView.this.f74428B1.isEmpty() && (listView = InviteToCreateGroupView.this.f74452a1) != null) {
                        listView.setSelection(0);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.InviteToCreateGroupView$h */
    /* loaded from: classes6.dex */
    public class C14488h implements InterfaceC20094a {
        C14488h() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            InviteToCreateGroupView.this.f72421L0.mo49315c4();
            if (c20096c != null) {
                ToastUtils.showMess(c20096c.m104492d());
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                InviteToCreateGroupView.this.f72421L0.mo49315c4();
                JSONObject jSONObject = new JSONObject(obj.toString()).getJSONObject("data");
                if (jSONObject.optInt("enable") == 1) {
                    String optString = jSONObject.optString("link");
                    C31973j5 m4472f = C0943w.m4462l().m4472f(InviteToCreateGroupView.this.f74470s1);
                    if (m4472f != null) {
                        m4472f.m153714E0(optString);
                        C0943w.m4462l().m4483w(m4472f);
                    }
                }
                ToastUtils.m89266n(AbstractC8020f0.str_create_group_link_success, new Object[0]);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: EM */
    public static String m80904EM(String str, ArrayList arrayList) {
        C32076q5 m4476k = C0943w.m4462l().m4476k(str);
        if (arrayList == null || m4476k == null) {
            return "";
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (m4476k.m154725n(((ContactProfile) arrayList.get(size)).f42434r)) {
                arrayList.remove(size);
            }
        }
        if (arrayList.size() == 0) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ContactProfile contactProfile = (ContactProfile) it.next();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", contactProfile.f42434r);
                jSONObject2.put("dName", contactProfile.f42437s);
                jSONObject2.put("avatar", contactProfile.f42446v);
                jSONArray.put(jSONObject2);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("memberList", jSONArray);
            jSONObject.put("suggestGroupMember", jSONObject3);
            return jSONObject.toString();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return "";
        }
    }

    /* renamed from: NM */
    private void m80905NM() {
        JSONObject optJSONObject;
        C32076q5 c32076q5;
        ContactProfile m141811g;
        try {
            try {
                this.f74430D1.clear();
                this.f74431E1.clear();
                if (!TextUtils.isEmpty(this.f74436J1)) {
                    JSONObject jSONObject = new JSONObject(this.f74436J1);
                    boolean z11 = !TextUtils.isEmpty(AbstractC23309i.m122303q0());
                    if (jSONObject.has("suggestGroupMember") && (optJSONObject = jSONObject.optJSONObject("suggestGroupMember")) != null) {
                        JSONArray optJSONArray = optJSONObject.optJSONArray("memberList");
                        if (optJSONArray != null) {
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                JSONObject jSONObject2 = (JSONObject) optJSONArray.get(i11);
                                String optString = jSONObject2.optString("id");
                                if (!z11 || !C21927m.m114302u().m114345m(optString)) {
                                    if (this.f72357R0 != null) {
                                        c32076q5 = C0943w.m4462l().m4476k(this.f72357R0.m153781r());
                                    } else {
                                        c32076q5 = null;
                                    }
                                    if (m80940CM(optString, c32076q5)) {
                                        String optString2 = jSONObject2.optString("dName");
                                        String optString3 = jSONObject2.optString("avatar");
                                        if ((TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString3)) && (m141811g = C28203u6.f131407a.m141811g(optString)) != null) {
                                            optString2 = m141811g.m40383Q(true, false);
                                            optString3 = m141811g.f42446v;
                                        }
                                        InviteContactProfile inviteContactProfile = new InviteContactProfile(optString, optString3, optString2);
                                        inviteContactProfile.f42373R0 = 1;
                                        this.f74431E1.add(optString);
                                        this.f74430D1.add(inviteContactProfile);
                                    }
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(optJSONObject.optString("sectionLabel"))) {
                            this.f74432F1 = optJSONObject.optString("sectionLabel");
                        }
                        if (optJSONObject.optInt("autoSelect") == 1) {
                            Iterator it = this.f74430D1.iterator();
                            while (it.hasNext()) {
                                m80951fN((InviteContactProfile) it.next());
                            }
                        }
                    }
                    if (this.f74430D1.size() > 0) {
                        ArrayList arrayList = this.f74430D1;
                        ((InviteContactProfile) arrayList.get(arrayList.size() - 1)).f42405d1 = true;
                    }
                }
                if (this.f74430D1.size() == 0) {
                    m80946IM(this.f74470s1);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            this.f74433G1 = true;
        } catch (Throwable th2) {
            this.f74433G1 = true;
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OM */
    public /* synthetic */ void m80906OM() {
        try {
            this.f74459h1.mo9854S1(this.f72362W0.m155397k() - 1);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PM */
    public /* synthetic */ void m80907PM(AdapterView adapterView, View view, int i11, long j11) {
        InviteContactProfile inviteContactProfile;
        try {
            this.f74469r1 = i11 - this.f74452a1.getHeaderViewsCount();
            C7061f3 c7061f3 = this.f74476y1;
            if (c7061f3 != null && c7061f3.getCount() > 0 && (inviteContactProfile = (InviteContactProfile) this.f74476y1.getItem(this.f74469r1)) != null) {
                boolean m114554u = AbstractC21935u.m114554u(inviteContactProfile.f42434r);
                if (this.f72362W0.m155391e(inviteContactProfile)) {
                    m80945HM(false, inviteContactProfile);
                    return;
                }
                if (inviteContactProfile.m40381O0()) {
                    if (m80941DM() >= this.f74474w1) {
                        this.f72421L0.showDialog(3);
                        return;
                    } else {
                        m80945HM(true, inviteContactProfile);
                        return;
                    }
                }
                if (!m114554u) {
                    C31973j5 c31973j5 = this.f72357R0;
                    if (c31973j5 != null && TextUtils.isEmpty(c31973j5.m153773n())) {
                        this.f72421L0.showDialog(2);
                        return;
                    }
                    if (m80941DM() >= this.f74474w1) {
                        this.f72421L0.showDialog(3);
                        return;
                    }
                    InviteContactMask inviteContactMask = inviteContactProfile.f42540d2;
                    if (inviteContactMask != null && inviteContactMask.f42537s == 3) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_empty_contact_result));
                        AbstractC23647d.m123897g("10300124");
                        return;
                    }
                }
                m80945HM(true, inviteContactProfile);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QM */
    public static /* synthetic */ int m80908QM(ContactProfile contactProfile, ContactProfile contactProfile2) {
        return contactProfile.f42440t.compareToIgnoreCase(contactProfile2.f42440t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RM */
    public /* synthetic */ void m80909RM() {
        if (this.f74476y1 != null) {
            synchronized (this.f74477z1) {
                this.f74476y1.m36063b(new HashSet(this.f74477z1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SM */
    public /* synthetic */ void m80910SM() {
        try {
            try {
                C32076q5 m4476k = C0943w.m4462l().m4476k(this.f72357R0.m153781r());
                synchronized (this.f74477z1) {
                    try {
                        this.f74477z1.clear();
                        if (m4476k != null) {
                            this.f74477z1.addAll(m4476k.m154718g());
                        }
                    } finally {
                    }
                }
                AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.kr
                    @Override // java.lang.Runnable
                    public final void run() {
                        InviteToCreateGroupView.this.m80909RM();
                    }
                });
                synchronized (this.f74477z1) {
                    this.f74427A1 = false;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                synchronized (this.f74477z1) {
                    this.f74427A1 = false;
                }
            }
        } catch (Throwable th2) {
            synchronized (this.f74477z1) {
                this.f74427A1 = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TM */
    public /* synthetic */ void m80911TM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        m80959oN(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UM */
    public /* synthetic */ void m80912UM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        m80959oN(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VM */
    public /* synthetic */ void m80913VM() {
        KeyboardAwareLinearLayout keyboardAwareLinearLayout = this.f74462k1;
        if (keyboardAwareLinearLayout != null) {
            keyboardAwareLinearLayout.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: WM */
    public /* synthetic */ void m80914WM(ArrayList arrayList) {
        int i11;
        this.f74428B1.clear();
        this.f74428B1.addAll(arrayList);
        m80922eN();
        this.f74460i1.m35846M(this.f72362W0.m155392f());
        this.f74460i1.m10008p();
        m80923kN();
        if (this.f74475x1 > 0) {
            TextView textView = this.f74451Z0;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_refix_number_of_friend);
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(this.f74475x1);
            if (this.f74475x1 > 1) {
                i11 = AbstractC8020f0.str_more_s;
            } else {
                i11 = AbstractC8020f0.str_single_form;
            }
            objArr[1] = AbstractC23136l9.m118743r0(i11);
            textView.setText(String.format(m118743r0, objArr));
        }
        m80952gN(AbstractC8020f0.invitetalk01);
        m80953hN(false);
        this.f74476y1.m36062a(this.f74428B1);
        m80958nN();
        this.f74429C1.m155389c();
        this.f74429C1.m155388b(this.f74428B1);
        try {
            if (!TextUtils.isEmpty(AbstractC23309i.m122303q0()) && C21927m.m114302u().m114358t().size() > 0) {
                C18635e mo98465a = C18644n.m98531l().mo98465a(null, false);
                int size = mo98465a.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ContactProfile contactProfile = (ContactProfile) mo98465a.get(i12);
                    if (contactProfile != null && C21927m.m114302u().m114345m(contactProfile.f42434r)) {
                        this.f74429C1.m155387a(new InviteContactProfile(contactProfile));
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XM */
    public /* synthetic */ void m80915XM() {
        Runnable runnable;
        final ArrayList arrayList = new ArrayList();
        try {
            try {
                C32223a c32223a = this.f74434H1;
                if (c32223a != null && !c32223a.m155395i()) {
                    InviteContactProfile inviteContactProfile = new InviteContactProfile();
                    inviteContactProfile.f42434r = "STRANGER_SECTION_HEADER_ID";
                    inviteContactProfile.f42437s = AbstractC23136l9.m118743r0(AbstractC8020f0.str_invite_to_group_stranger_section_header);
                    inviteContactProfile.m40403e1(false);
                    arrayList.add(inviteContactProfile);
                    arrayList.addAll(this.f74434H1.m155392f());
                }
                if (!this.f74433G1) {
                    m80905NM();
                }
                ArrayList arrayList2 = this.f74430D1;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    InviteContactProfile inviteContactProfile2 = new InviteContactProfile();
                    inviteContactProfile2.f42434r = "SUGGEST_SECTION_HEADER_ID";
                    inviteContactProfile2.f42437s = this.f74432F1;
                    inviteContactProfile2.m40403e1(false);
                    inviteContactProfile2.f42407e1 = true;
                    arrayList.add(inviteContactProfile2);
                    arrayList.addAll(this.f74430D1);
                }
                m80950MM();
                InviteContactProfile inviteContactProfile3 = new InviteContactProfile();
                inviteContactProfile3.f42434r = "FROM_NATIVE_PHONEBOOK_SECTION_HEADER_ID";
                inviteContactProfile3.f42437s = AbstractC23136l9.m118743r0(AbstractC8020f0.str_from_phonebook);
                inviteContactProfile3.m40403e1(false);
                if (this.f74447U1 <= AbstractC23309i.m121447T7()) {
                    if (!this.f74446T1.m155395i()) {
                        arrayList.add(inviteContactProfile3);
                        arrayList.addAll(this.f74446T1.m155392f());
                    }
                    arrayList.addAll(this.f74445S1);
                } else {
                    arrayList.addAll(this.f74445S1);
                    if (!this.f74446T1.m155395i()) {
                        arrayList.add(inviteContactProfile3);
                        arrayList.addAll(this.f74446T1.m155392f());
                    }
                }
                this.f74475x1 = this.f74447U1 + this.f74434H1.m155392f().size() + this.f74430D1.size() + this.f74446T1.m155397k();
                runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.mr
                    @Override // java.lang.Runnable
                    public final void run() {
                        InviteToCreateGroupView.this.m80914WM(arrayList);
                    }
                };
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.mr
                    @Override // java.lang.Runnable
                    public final void run() {
                        InviteToCreateGroupView.this.m80914WM(arrayList);
                    }
                };
            }
            AbstractC19444a.m101695c(runnable);
        } catch (Throwable th2) {
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.mr
                @Override // java.lang.Runnable
                public final void run() {
                    InviteToCreateGroupView.this.m80914WM(arrayList);
                }
            });
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YM */
    public /* synthetic */ boolean m80916YM(TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 == 3) {
            AbstractC2379w.m12430d(this.f74449X0);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZM */
    public /* synthetic */ void m80917ZM(RecyclerView recyclerView, int i11, View view) {
        try {
            InviteContactProfile inviteContactProfile = (InviteContactProfile) this.f72362W0.m155392f().get(i11);
            if (this.f72362W0.m155391e(inviteContactProfile)) {
                m80945HM(false, inviteContactProfile);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aN */
    public /* synthetic */ void m80918aN(View view) {
        C31973j5 c31973j5 = this.f72357R0;
        if (c31973j5 == null) {
            return;
        }
        if (c31973j5.m153742T()) {
            if (this.f72357R0.m153751b0()) {
                showDialog(4);
                this.f74466o1.setChecked(true);
                return;
            } else {
                showDialog(5);
                this.f74466o1.setChecked(false);
                return;
            }
        }
        ToastUtils.m89268p(AbstractC23136l9.m118743r0(AbstractC8020f0.str_not_perform_action));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bN */
    public /* synthetic */ void m80919bN() {
        if (C31986k3.f147083a.m154108R1(this.f72357R0.m153730N())) {
            this.f74467p1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_e2ee_msg_history_not_available));
            this.f74467p1.setGravity(8388627);
            this.f74466o1.setVisibility(8);
            return;
        }
        if (this.f72357R0.m153742T()) {
            this.f74466o1.setVisibility(0);
            this.f74467p1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_chat_history_v2));
        } else {
            this.f74466o1.setVisibility(8);
            if (this.f72357R0.m153751b0()) {
                this.f74467p1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_chat_history_v2));
            } else {
                this.f74467p1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_chat_history_v2_normal_member));
            }
        }
        this.f74467p1.setGravity(8388627);
        this.f74466o1.setChecked(this.f72357R0.m153751b0());
    }

    /* renamed from: cN */
    private void m80920cN() {
        if (this.f72357R0 != null) {
            this.f74427A1 = true;
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.ur
                @Override // java.lang.Runnable
                public final void run() {
                    InviteToCreateGroupView.this.m80910SM();
                }
            });
        } else {
            this.f74427A1 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dN */
    public void m80921dN() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.wr
            @Override // java.lang.Runnable
            public final void run() {
                InviteToCreateGroupView.this.m80915XM();
            }
        });
    }

    /* renamed from: eN */
    private void m80922eN() {
        if (this.f74435I1.isEmpty()) {
            return;
        }
        Iterator it = this.f74428B1.iterator();
        while (it.hasNext()) {
            InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
            if (this.f74435I1.contains(inviteContactProfile.f42434r)) {
                this.f72362W0.m155387a(inviteContactProfile);
            }
        }
        this.f74435I1.clear();
    }

    /* renamed from: kN */
    private void m80923kN() {
        if (m87077NK() != null) {
            m87077NK().setMiddleSubtitle(AbstractC23136l9.m118746s0(AbstractC8020f0.str_selected_num, Integer.valueOf(this.f72362W0.m155397k())));
        }
    }

    /* renamed from: qN */
    private void m80929qN() {
        C31973j5 m4472f = C0943w.m4462l().m4472f(this.f74470s1);
        this.f72357R0 = m4472f;
        if (m4472f == null) {
            return;
        }
        AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.vr
            @Override // java.lang.Runnable
            public final void run() {
                InviteToCreateGroupView.this.m80919bN();
            }
        });
    }

    /* renamed from: BM */
    boolean m80939BM(InviteContactProfile inviteContactProfile) {
        if (inviteContactProfile != null && !this.f74431E1.contains(inviteContactProfile.f42434r)) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        boolean z11;
        try {
            super.mo37111CJ(bundle);
            m92637BK(true);
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null) {
                this.f74471t1 = m92642L3.getString("STR_EXTRA_GROUP_NAME", "");
                this.f74470s1 = m92642L3.getString("extra_group_id", "");
                this.f72358S0 = m92642L3.getBoolean("BOL_EXTRA_FROM_CHAT", false);
                this.f72359T0 = m92642L3.getBoolean("BOL_EXTRA_FROM_GROUP_MEMEBER", false);
                this.f72356Q0 = m92642L3.getInt("INT_EXTRA_TRACKING_SOURCE", 0);
                this.f74436J1 = m92642L3.getString("extra_preload_data", "");
                this.f74438L1 = m92642L3.getString("STR_SOURCE_START_VIEW", "");
                this.f74439M1 = m92642L3.getString("STR_LOG_CHAT_TYPE", "0");
                this.f74440N1 = m92642L3.getBoolean("BOL_EXTRA_HAS_TIP", false);
                if (!TextUtils.isEmpty(this.f74436J1)) {
                    String string = m92642L3.getString("extra_preload_data");
                    if (!TextUtils.isEmpty(string)) {
                        JSONObject jSONObject = new JSONObject(string);
                        if (jSONObject.has("groupId")) {
                            this.f74470s1 = jSONObject.getString("groupId");
                        }
                    }
                }
                if (!TextUtils.isEmpty(this.f74470s1)) {
                    C31973j5 m4472f = C0943w.m4462l().m4472f(this.f74470s1);
                    this.f72357R0 = m4472f;
                    if (m4472f != null) {
                        this.f74437K1 = m4472f.m153751b0();
                    }
                    C31973j5 c31973j5 = this.f72357R0;
                    if (c31973j5 != null && c31973j5.m153747Y()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f74472u1 = Boolean.valueOf(z11);
                    m80920cN();
                }
            }
            this.f74473v1 = AbstractC23309i.m122599y0();
            this.f74474w1 = AbstractC23309i.m121078J8();
            this.f74435I1.clear();
            this.f74434H1.m155389c();
            if (bundle != null) {
                try {
                    if (bundle.containsKey("arrItemSeltected")) {
                        this.f74435I1.addAll(bundle.getStringArrayList("arrItemSeltected"));
                    }
                    if (bundle.containsKey("arrStrangerContacts")) {
                        JSONArray jSONArray = new JSONArray(bundle.getString("arrStrangerContacts"));
                        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                            this.f74434H1.m155387a(new InviteContactProfile(jSONArray.getJSONObject(i11)));
                        }
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
            C0815e1.m2075D().m2100V(new C23648e(5, this.f74438L1, 1, "gr_add_member", this.f74439M1, C0815e1.m2075D().m2125z(this.f74439M1, this.f74470s1)), false);
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
        }
    }

    /* renamed from: CM */
    boolean m80940CM(String str, C32076q5 c32076q5) {
        if (!CoreUtility.f89233i.equals(str) && !AbstractC21935u.m114515E(str) && !AbstractC21935u.m114536c(str) && c32076q5 != null && !c32076q5.m154725n(str)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        return super.mo39014DJ(i11);
                    }
                    View inflate = LayoutInflater.from(this.f72421L0.getContext()).inflate(AbstractC7409c0.custom_title_dialog_confirm_on_off_history_msg, (ViewGroup) null);
                    RobotoTextView robotoTextView = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_custom_subtitle);
                    if (this.f74472u1.booleanValue()) {
                        i15 = AbstractC8020f0.str_dialog_desc_confirm_enable_community_history_msg_v2;
                    } else {
                        i15 = AbstractC8020f0.str_dialog_desc_confirm_enable_history_msg_v2;
                    }
                    robotoTextView.setText(AbstractC23136l9.m118743r0(i15));
                    C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                    aVar.m43159h(4).m43177z(inflate).m43164m(AbstractC8020f0.str_cancel, new InterfaceC17463d.b()).m43169r(AbstractC8020f0.str_btn_agree, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.pr
                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i16) {
                            InviteToCreateGroupView.this.m80912UM(interfaceC17463d, i16);
                        }
                    });
                    return aVar.m43152a();
                }
                View inflate2 = LayoutInflater.from(this.f72421L0.getContext()).inflate(AbstractC7409c0.custom_title_dialog_confirm_on_off_history_msg, (ViewGroup) null);
                RobotoTextView robotoTextView2 = (RobotoTextView) inflate2.findViewById(AbstractC6918a0.tv_custom_subtitle);
                if (this.f74472u1.booleanValue()) {
                    i14 = AbstractC8020f0.str_dialog_desc_confirm_disable_community_history_msg_v2;
                } else {
                    i14 = AbstractC8020f0.str_dialog_desc_confirm_disable_history_msg_v2;
                }
                robotoTextView2.setText(AbstractC23136l9.m118743r0(i14));
                C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
                aVar2.m43159h(4).m43177z(inflate2).m43164m(AbstractC8020f0.str_cancel, new InterfaceC17463d.b()).m43169r(AbstractC8020f0.str_btn_agree, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.or
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i16) {
                        InviteToCreateGroupView.this.m80911TM(interfaceC17463d, i16);
                    }
                });
                return aVar2.m43152a();
            }
            C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
            aVar3.m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_group_add_too_much_strangers)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), this);
            return aVar3.m43152a();
        }
        C8009j.a aVar4 = new C8009j.a(this.f72421L0.m92648SI());
        aVar4.m43159h(4);
        C31973j5 c31973j5 = this.f72357R0;
        if (c31973j5 != null && c31973j5.m153778p0()) {
            if (this.f74472u1.booleanValue()) {
                i13 = AbstractC8020f0.str_error_community_add_stranger_no_link_for_owner;
            } else {
                i13 = AbstractC8020f0.str_error_group_add_stranger_no_link_for_owner;
            }
            aVar4.m43162k(AbstractC23136l9.m118743r0(i13)).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_action_reactivate_group_link), this);
        } else {
            if (this.f74472u1.booleanValue()) {
                i12 = AbstractC8020f0.str_error_community_add_stranger_no_link_for_member;
            } else {
                i12 = AbstractC8020f0.str_error_group_add_stranger_no_link_for_member;
            }
            aVar4.m43162k(AbstractC23136l9.m118743r0(i12)).m43170s(null, this);
        }
        aVar4.m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), this);
        return aVar4.m43152a();
    }

    /* renamed from: DM */
    int m80941DM() {
        ArrayList m155392f = this.f74434H1.m155392f();
        Iterator it = this.f72362W0.m155392f().iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
            if (inviteContactProfile.m40381O0()) {
                i12++;
            } else if (m155392f.contains(inviteContactProfile)) {
                i11++;
            }
        }
        return i11 + i12;
    }

    /* renamed from: EI */
    void m80942EI() {
        EditText editText = this.f74449X0;
        if (editText != null && !TextUtils.isEmpty(editText.getEditableText().toString())) {
            this.f74449X0.setText("");
        }
    }

    /* renamed from: FM */
    void m80943FM() {
        if (!TextUtils.isEmpty(this.f74470s1)) {
            this.f72421L0.mo46829Y();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14488h());
            c0766k.mo1411D6(this.f74470s1, true);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f74462k1 = (KeyboardAwareLinearLayout) layoutInflater.inflate(AbstractC7409c0.invite_to_create_group_view, viewGroup, false);
        m80956lN();
        return this.f74462k1;
    }

    /* renamed from: GM */
    void m80944GM(String str) {
        C28146o3 c28146o3 = this.f74448V1;
        if (c28146o3 != null) {
            c28146o3.m141659d();
        }
        if (this.f74428B1.isEmpty()) {
            m80953hN(false);
        }
        C28146o3 c28146o32 = new C28146o3(str, AbstractC23184q2.m119445c(), this.f74429C1.m155392f(), this.f74446T1, new C14487g());
        this.f74448V1 = c28146o32;
        c28146o32.start();
    }

    /* renamed from: HM */
    void m80945HM(boolean z11, InviteContactProfile inviteContactProfile) {
        if (inviteContactProfile == null) {
            return;
        }
        synchronized (this.f74477z1) {
            try {
                if (this.f74477z1.contains(inviteContactProfile.f42434r)) {
                    return;
                }
                if (z11) {
                    int m155397k = this.f72362W0.m155397k();
                    int i11 = this.f74473v1;
                    if (m155397k < i11) {
                        InviteContactMask inviteContactMask = inviteContactProfile.f42540d2;
                        if (inviteContactMask != null) {
                            inviteContactMask.f42534p = false;
                        }
                        this.f72362W0.m155387a(inviteContactProfile);
                        this.f74460i1.m35846M(this.f72362W0.m155392f());
                        this.f74460i1.m10008p();
                        this.f74476y1.notifyDataSetChanged();
                        this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.lr
                            @Override // java.lang.Runnable
                            public final void run() {
                                InviteToCreateGroupView.this.m80906OM();
                            }
                        });
                        if (!AbstractC21935u.m114554u(inviteContactProfile.f42434r) && !this.f74434H1.m155391e(inviteContactProfile) && m80939BM(inviteContactProfile)) {
                            inviteContactProfile.f42540d2 = null;
                            this.f74434H1.m155387a(inviteContactProfile);
                        }
                        m80942EI();
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_warning_limit_member_to_invite, Integer.valueOf(i11)));
                    }
                } else {
                    this.f72362W0.m155396j(inviteContactProfile);
                    this.f74460i1.m35846M(this.f72362W0.m155392f());
                    this.f74460i1.m10008p();
                    this.f74476y1.notifyDataSetChanged();
                    C7061f3 c7061f3 = this.f74476y1;
                    if (c7061f3 != null && c7061f3.f38581q.equals(inviteContactProfile.f42434r)) {
                        this.f74476y1.f38581q = "";
                        this.f74460i1.m35847N("");
                        this.f74460i1.m10008p();
                    }
                }
                m80923kN();
                m80958nN();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: IM */
    void m80946IM(String str) {
        if (TextUtils.isEmpty(str) || this.f74444R1) {
            return;
        }
        this.f74444R1 = true;
        this.f74442P1.mo1704o8(this.f74443Q1);
        this.f74442P1.mo1617d4(this.f74470s1, 0, 0, (byte) 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: JM */
    void m80947JM() {
        InviteContactProfile inviteContactProfile;
        String str;
        boolean z11 = !TextUtils.isEmpty(AbstractC23309i.m122303q0());
        C18635e mo98465a = C18644n.m98531l().mo98465a(null, false);
        int size = mo98465a.size();
        int i11 = -1;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            try {
                ContactProfile contactProfile = (ContactProfile) mo98465a.get(i13);
                if (contactProfile != null) {
                    if (contactProfile instanceof InviteContactProfile) {
                        inviteContactProfile = (InviteContactProfile) contactProfile;
                    } else {
                        inviteContactProfile = new InviteContactProfile(contactProfile);
                    }
                    if (!inviteContactProfile.f42434r.equals(CoreUtility.f89233i) && !AbstractC25495a.m132086k(inviteContactProfile.f42434r) && !inviteContactProfile.m40372J0() && !C21927m.m114302u().m114312J().m153137g(inviteContactProfile.f42434r) && m80939BM(inviteContactProfile) && (!z11 || !C21927m.m114302u().m114345m(inviteContactProfile.f42434r))) {
                        String str2 = "" + inviteContactProfile.f42440t.trim().charAt(0);
                        Locale locale = Locale.ENGLISH;
                        char charAt = str2.toUpperCase(locale).charAt(0);
                        i11++;
                        if (i11 != 0) {
                            try {
                                char charAt2 = ("" + ((ContactProfile) mo98465a.get(i12)).f42440t.trim().charAt(0)).toUpperCase(locale).charAt(0);
                                String str3 = f74426W1;
                                if (str3.indexOf(charAt2) != -1) {
                                    if (charAt > charAt2) {
                                        if (str3.indexOf(charAt) != -1) {
                                            InviteContactProfile inviteContactProfile2 = new InviteContactProfile();
                                            inviteContactProfile2.f42437s = "" + charAt;
                                            inviteContactProfile2.m40403e1(false);
                                            int size2 = this.f74445S1.size();
                                            if (size2 > 0) {
                                                int i14 = size2 - 1;
                                                if (((InviteContactProfile) this.f74445S1.get(i14)).m40366G0()) {
                                                    ((InviteContactProfile) this.f74445S1.get(i14)).f42405d1 = true;
                                                }
                                            }
                                            this.f74445S1.add(inviteContactProfile2);
                                        } else {
                                            InviteContactProfile inviteContactProfile3 = new InviteContactProfile();
                                            if (str3.indexOf(charAt) == -1) {
                                                str = "##";
                                            } else {
                                                str = "" + charAt;
                                            }
                                            inviteContactProfile3.f42437s = str;
                                            inviteContactProfile3.m40403e1(false);
                                            inviteContactProfile3.f42403c1 = false;
                                            this.f74445S1.add(inviteContactProfile3);
                                        }
                                    }
                                } else if (str3.indexOf(charAt) != -1) {
                                    InviteContactProfile inviteContactProfile4 = new InviteContactProfile();
                                    inviteContactProfile4.f42437s = "" + charAt;
                                    inviteContactProfile4.m40403e1(false);
                                    int size3 = this.f74445S1.size();
                                    if (size3 > 0) {
                                        int i15 = size3 - 1;
                                        if (((InviteContactProfile) this.f74445S1.get(i15)).m40366G0()) {
                                            ((InviteContactProfile) this.f74445S1.get(i15)).f42405d1 = true;
                                        }
                                    }
                                    this.f74445S1.add(inviteContactProfile4);
                                }
                            } catch (Exception e11) {
                                AbstractC20110a.m104539h(e11);
                            }
                        } else {
                            InviteContactProfile inviteContactProfile5 = new InviteContactProfile();
                            if (f74426W1.indexOf(charAt) == -1) {
                                inviteContactProfile5.f42437s = "#";
                            } else {
                                inviteContactProfile5.f42437s = "" + charAt;
                            }
                            inviteContactProfile5.m40403e1(false);
                            this.f74445S1.add(inviteContactProfile5);
                        }
                        inviteContactProfile.f42399a1.clear();
                        this.f74445S1.add(inviteContactProfile);
                        this.f74447U1++;
                        i12 = i13;
                    }
                }
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
            }
        }
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        int mo92862f = interfaceC17463d.mo92862f();
        if (mo92862f != 2) {
            if (mo92862f == 3) {
                interfaceC17463d.dismiss();
            }
        } else if (i11 == -1) {
            m80943FM();
        } else if (i11 == -2) {
            interfaceC17463d.dismiss();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 27);
    }

    /* renamed from: KM */
    void m80948KM() {
        int i11;
        int i12;
        if (C26691l.m137131d() == 1) {
            i11 = AbstractC8020f0.str_qr_share_group_title;
            i12 = AbstractC16803z.ic_qr_line_24;
        } else {
            if (this.f74472u1.booleanValue()) {
                i11 = AbstractC8020f0.str_invite_to_community_via_link;
            } else {
                i11 = AbstractC8020f0.str_open_group_link;
            }
            i12 = AbstractC16803z.ic_link;
        }
        View inflate = LayoutInflater.from(this.f72421L0.m92648SI()).inflate(AbstractC7409c0.invite_group_header_func_layout, (ViewGroup) null);
        this.f74453b1 = inflate.findViewById(AbstractC6918a0.header_separate);
        this.f74454c1 = inflate.findViewById(AbstractC6918a0.header_main_layout);
        this.f74455d1 = inflate.findViewById(AbstractC6918a0.header_hint_invite_to_community_layout);
        this.f74452a1.addHeaderView(inflate);
        if (this.f74472u1.booleanValue()) {
            this.f74455d1.setVisibility(0);
        }
        this.f74453b1.setVisibility(0);
        this.f74454c1.setVisibility(0);
        this.f74454c1.setOnClickListener(this);
        ImageView imageView = (ImageView) inflate.findViewById(AbstractC6918a0.header_icon);
        TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.header_title_tv);
        imageView.setImageResource(i12);
        textView.setText(i11);
    }

    /* renamed from: LM */
    void m80949LM() {
        HashSet hashSet;
        try {
            this.f74461j1.setEnableLoadingText(true);
            m80952gN(AbstractC8020f0.empty_list);
            m80954iN(AbstractC8020f0.str_tv_findingFriend);
            this.f74449X0.addTextChangedListener(this.f74441O1);
            this.f74452a1.addFooterView(this.f74463l1);
            this.f74452a1.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.zing.zalo.ui.zviews.qr
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
                    InviteToCreateGroupView.this.m80907PM(adapterView, view, i11, j11);
                }
            });
            this.f74452a1.setOnScrollListener(new C14486f());
            synchronized (this.f74477z1) {
                hashSet = new HashSet(this.f74477z1);
            }
            C7061f3 c7061f3 = new C7061f3(this.f72421L0.m92648SI(), this.f74428B1, this.f72362W0.m155394h(), hashSet, this.f72360U0);
            this.f74476y1 = c7061f3;
            this.f74452a1.setAdapter((ListAdapter) c7061f3);
            m80953hN(true);
            m80923kN();
            m80921dN();
        } catch (Exception e11) {
            AbstractC23350e.m122774d("InviteToCreateGroupView", e11.toString());
        }
    }

    /* renamed from: MM */
    void m80950MM() {
        String m118746s0;
        C31934gb c31934gb;
        C31901e8 m2800f;
        if (this.f74445S1 == null) {
            this.f74445S1 = new ArrayList();
            this.f72360U0.clear();
            if (AbstractC23309i.m120998H2() && AbstractC23184q2.m119445c()) {
                List m2802h = AbstractC0906d0.m2802h(this.f72421L0.m92648SI().getApplicationContext());
                List<C31934gb> m42570w5 = C7960e.m41971c6().m42570w5();
                HashMap hashMap = new HashMap();
                for (C31934gb c31934gb2 : m42570w5) {
                    hashMap.put(c31934gb2.f146730b, c31934gb2);
                }
                ArrayList arrayList = new ArrayList();
                C31916f8 c31916f8 = new C31916f8();
                for (int i11 = 0; i11 < m2802h.size(); i11++) {
                    C31901e8 c31901e8 = (C31901e8) m2802h.get(i11);
                    InviteContactProfile inviteContactProfile = new InviteContactProfile();
                    String m153295h = c31901e8.m153295h();
                    inviteContactProfile.f42437s = m153295h;
                    inviteContactProfile.f42440t = AbstractC23262x6.m120002o(m153295h);
                    String m153298m = c31901e8.m153298m();
                    inviteContactProfile.f42455y = m153298m;
                    inviteContactProfile.f42539c2 = m153298m;
                    inviteContactProfile.f42446v = C23302b.f113247a.m120521a();
                    inviteContactProfile.f42434r = ContactProfile.m40353g0(inviteContactProfile.f42539c2);
                    if (TextUtils.isEmpty(inviteContactProfile.f42455y)) {
                        m118746s0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_from_phonebook);
                    } else {
                        m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_search_result_from_phonebook, inviteContactProfile.f42455y);
                    }
                    inviteContactProfile.f42541e2 = m118746s0;
                    try {
                        m2800f = AbstractC0906d0.m2800f(this.f72421L0.m92648SI().getApplicationContext(), c31901e8.m153298m());
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                    if (m2800f != null && m2800f.m153300r() > 0) {
                        String valueOf = String.valueOf(m2800f.m153300r());
                        if (!AbstractC21935u.m114556w(valueOf)) {
                            ContactProfile m141811g = C28203u6.f131407a.m141811g(valueOf);
                            if (m141811g != null) {
                                inviteContactProfile.f42446v = m141811g.f42446v;
                            }
                            arrayList.add(inviteContactProfile);
                            this.f72360U0.put(inviteContactProfile.f42434r, valueOf);
                        }
                    } else {
                        if (c31901e8.m153301s()) {
                            if (c31901e8.m153298m().equals(AbstractC23304d.f113394i0)) {
                            }
                        }
                        if (!inviteContactProfile.f42539c2.trim().equals("")) {
                            if (!inviteContactProfile.f42539c2.trim().equalsIgnoreCase(AbstractC23056e6.f112062a)) {
                                if (c31916f8.m153376g(inviteContactProfile.f42539c2)) {
                                }
                                if (hashMap.containsKey(inviteContactProfile.f42539c2) && (c31934gb = (C31934gb) hashMap.get(inviteContactProfile.f42539c2)) != null) {
                                    String str = c31934gb.f146729a;
                                    inviteContactProfile.f42434r = str;
                                    inviteContactProfile.f42446v = c31934gb.f146733e;
                                    this.f72360U0.put(str, str);
                                }
                                arrayList.add(inviteContactProfile);
                            }
                        }
                    }
                }
                if (arrayList.size() <= AbstractC23309i.m120930F8()) {
                    Collections.sort(arrayList, new Comparator() { // from class: com.zing.zalo.ui.zviews.nr
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            int m80908QM;
                            m80908QM = InviteToCreateGroupView.m80908QM((ContactProfile) obj, (ContactProfile) obj2);
                            return m80908QM;
                        }
                    });
                    this.f74446T1.m155388b(arrayList);
                }
            }
            m80947JM();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        if (m87077NK() != null) {
            m87077NK().setLeadingFunctionCallback(new C14481a());
            if (this.f74472u1.booleanValue()) {
                m87077NK().setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_invite_to_community));
            }
        }
        m80923kN();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        try {
            if (this.f72362W0.m155397k() > 0) {
                bundle.putStringArrayList("arrItemSeltected", new ArrayList<>(this.f72362W0.m155394h()));
            }
            if (!this.f74434H1.m155395i()) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f74434H1.m155392f().iterator();
                while (it.hasNext()) {
                    jSONArray.put(((InviteContactProfile) it.next()).m40488x1());
                }
                bundle.putString("arrStrangerContacts", jSONArray.toString());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("InviteToCreateGroupView", e11);
        }
        super.mo37118SJ(bundle);
    }

    /* renamed from: fN */
    public void m80951fN(InviteContactProfile inviteContactProfile) {
        InviteContactMask inviteContactMask = inviteContactProfile.f42540d2;
        if (inviteContactMask != null) {
            inviteContactMask.f42534p = false;
        }
        this.f72362W0.m155387a(inviteContactProfile);
    }

    /* renamed from: gN */
    void m80952gN(int i11) {
        MultiStateView multiStateView = this.f74461j1;
        if (multiStateView != null) {
            multiStateView.setEmptyViewString(AbstractC23136l9.m118743r0(i11));
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "InviteToCreateGroupView";
    }

    /* renamed from: hN */
    void m80953hN(boolean z11) {
        this.f74451Z0.setVisibility(0);
        if (z11) {
            this.f74451Z0.setVisibility(8);
            this.f74452a1.setVisibility(8);
            this.f74461j1.setVisibility(0);
            this.f74461j1.setState(MultiStateView.EnumC15914e.LOADING);
            return;
        }
        this.f74451Z0.setVisibility(0);
        this.f74461j1.setVisibility(8);
        this.f74452a1.setVisibility(0);
    }

    /* renamed from: iN */
    void m80954iN(int i11) {
        MultiStateView multiStateView = this.f74461j1;
        if (multiStateView != null) {
            multiStateView.setLoadingString(AbstractC23136l9.m118743r0(i11));
        }
    }

    /* renamed from: jN */
    void m80955jN(int i11) {
        if (i11 == 0) {
            this.f74449X0.setPadding(AbstractC23136l9.m118742r(10.0f), AbstractC23136l9.m118742r(6.0f), AbstractC23136l9.m118742r(40.0f), AbstractC23136l9.m118742r(8.0f));
        } else if (i11 == 8) {
            this.f74449X0.setPadding(AbstractC23136l9.m118742r(10.0f), AbstractC23136l9.m118742r(6.0f), AbstractC23136l9.m118742r(10.0f), AbstractC23136l9.m118742r(8.0f));
        }
    }

    /* renamed from: lN */
    void m80956lN() {
        if (this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().getWindow() != null) {
            this.f72421L0.m92676n2().mo35554O(18);
            this.f74462k1.setEnableMeasureKeyboard(false);
        }
        this.f74452a1 = (ListView) this.f74462k1.findViewById(AbstractC6918a0.phoneList);
        this.f74461j1 = (MultiStateView) this.f74462k1.findViewById(AbstractC6918a0.multi_state);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC23136l9.m118742r(32.0f), AbstractC23136l9.m118742r(32.0f));
        layoutParams.addRule(14);
        layoutParams.setMargins(0, AbstractC23136l9.m118742r(16.0f), 0, AbstractC23136l9.m118742r(16.0f));
        this.f74461j1.setLayoutParamsPbLoading(layoutParams);
        this.f74456e1 = (LinearLayout) this.f74462k1.findViewById(AbstractC6918a0.section_footer);
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.f74462k1.findViewById(AbstractC6918a0.btn_done_invite_to_group);
        this.f74457f1 = appCompatImageView;
        appCompatImageView.setOnClickListener(this);
        LinearLayout linearLayout = (LinearLayout) this.f74462k1.findViewById(AbstractC6918a0.content_section_footer);
        this.f74458g1 = linearLayout;
        linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC14483c());
        EditText editText = (EditText) this.f74462k1.findViewById(AbstractC6918a0.search_input_text);
        this.f74449X0 = editText;
        editText.setImeOptions(3);
        this.f74449X0.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zing.zalo.ui.zviews.rr
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean m80916YM;
                m80916YM = InviteToCreateGroupView.this.m80916YM(textView, i11, keyEvent);
                return m80916YM;
            }
        });
        this.f74449X0.setSingleLine(true);
        m80955jN(0);
        this.f74450Y0 = (ImageButton) this.f74462k1.findViewById(AbstractC6918a0.btn_input_type);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f74462k1.findViewById(AbstractC6918a0.search_input_layout).getLayoutParams();
        if (AbstractC23184q2.m119445c()) {
            this.f74450Y0.setVisibility(0);
            this.f74450Y0.setOnClickListener(this);
            this.f74449X0.setHint(AbstractC8020f0.hint_search_create_group);
        } else {
            this.f74450Y0.setVisibility(8);
            this.f74450Y0.setOnClickListener(null);
            marginLayoutParams.rightMargin = AbstractC23136l9.m118655I(AbstractC16802y.msg_item_padding_l_r);
            this.f74449X0.setHint(AbstractC8020f0.hint_search_by_name);
        }
        View inflate = LayoutInflater.from(this.f72421L0.m92648SI()).inflate(AbstractC7409c0.friend_count_row, (ViewGroup) null, false);
        this.f74463l1 = inflate;
        TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.num_friend);
        this.f74451Z0 = textView;
        textView.setTextColor(C23212s8.m119607o(textView.getContext(), AbstractC21196a.TextColor2));
        this.f74451Z0.setPadding(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(0.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(125.0f));
        this.f74464m1 = this.f74463l1.findViewById(AbstractC6918a0.padding_view);
        RecyclerView recyclerView = (RecyclerView) this.f74462k1.findViewById(AbstractC6918a0.rv_bubbles);
        this.f74459h1 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f72421L0.m92648SI(), 0, false));
        C7005a5 c7005a5 = new C7005a5();
        this.f74460i1 = c7005a5;
        c7005a5.f38321u = true;
        c7005a5.f38320t = false;
        this.f74459h1.setAdapter(c7005a5);
        C31784b.m152808a(this.f74459h1).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.sr
            @Override // zc0.C31784b.d
            /* renamed from: i0 */
            public final void mo17458i0(RecyclerView recyclerView2, int i11, View view) {
                InviteToCreateGroupView.this.m80917ZM(recyclerView2, i11, view);
            }
        });
        this.f74465n1 = this.f74462k1.findViewById(AbstractC6918a0.section_enable_history_msg);
        this.f74466o1 = (StencilSwitch) this.f74462k1.findViewById(AbstractC6918a0.toggle_enable_history_msg);
        this.f74467p1 = (RobotoTextView) this.f74462k1.findViewById(AbstractC6918a0.toggle_enable_history_msg_title);
        if (this.f72357R0 == null) {
            this.f72357R0 = C0943w.m4462l().m4472f(this.f74470s1);
        }
        this.f74466o1.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.tr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InviteToCreateGroupView.this.m80918aN(view);
            }
        });
        if (this.f72357R0 != null && C26691l.m137130c() == 1) {
            m80948KM();
        }
        m80929qN();
        m80958nN();
        AbstractC23126l.m118627a("InviteToCreateGroupView");
    }

    /* renamed from: mN */
    void m80957mN(boolean z11) {
        int i11;
        View view = this.f74453b1;
        int i12 = 8;
        if (view != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
        View view2 = this.f74454c1;
        if (view2 != null) {
            if (z11) {
                i12 = 0;
            }
            view2.setVisibility(i12);
        }
    }

    /* renamed from: nN */
    void m80958nN() {
        try {
            if (this.f72362W0.m155397k() > 0) {
                this.f74456e1.setVisibility(0);
                this.f74458g1.setOnClickListener(null);
            } else {
                this.f74456e1.setVisibility(8);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: oN */
    void m80959oN(boolean z11) {
        try {
            this.f72421L0.mo46829Y();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14484d());
            c0766k.mo1412D7(this.f74470s1, 5, z11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.header_main_layout) {
            if (!TextUtils.isEmpty(this.f74470s1)) {
                Bundle bundle = new Bundle();
                bundle.putString("extra_group_id", this.f74470s1);
                bundle.putBoolean("BOL_EXTRA_HAVE_ADMIN_ROLE", this.f72357R0.m153742T());
                bundle.putBoolean("EXTRA_IS_COMMUNITY", this.f72357R0.m153747Y());
                this.f72421L0.m92662fJ().m93069k2(ManageGroupLinkView.class, bundle, 1, true);
                AbstractC23647d.m123897g("10300101");
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.btn_input_type) {
            this.f74468q1 = !this.f74468q1;
            m80960pN();
            AbstractC2379w.m12432f(this.f74449X0);
        } else if (id2 == AbstractC6918a0.btn_done_invite_to_group) {
            AbstractC2379w.m12430d(this.f74449X0);
            m78433lM(this.f74470s1, this.f72356Q0);
            C0815e1.m2075D().m2100V(new C23648e(5, this.f74438L1, 0, "gr_add_member_done", this.f74439M1, C0815e1.m2075D().m2123x(this.f74439M1, this.f74470s1, this.f74440N1)), false);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        try {
            this.f72827B0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.jr
                @Override // java.lang.Runnable
                public final void run() {
                    InviteToCreateGroupView.this.m80913VM();
                }
            }, 200L);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: pN */
    public void m80960pN() {
        EditText editText = this.f74449X0;
        if (editText != null && this.f74450Y0 != null) {
            if (this.f74468q1) {
                editText.setInputType(3);
                this.f74450Y0.setImageResource(AbstractC16803z.login_abc);
            } else {
                editText.setInputType(180224);
                this.f74450Y0.setImageResource(AbstractC16803z.login_123);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        int i12;
        if (i11 == 27 && objArr != null && objArr.length >= 3) {
            String str = (String) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            boolean contains = new ArrayList(Arrays.asList(TextUtils.split((String) objArr[2], ";"))).contains(CoreUtility.f89233i);
            if (this.f74470s1.equals(str)) {
                if (intValue != 1 && intValue != 2) {
                    if (intValue != 4) {
                        if (intValue != 5) {
                            switch (intValue) {
                                case 9:
                                    C31973j5 c31973j5 = this.f72357R0;
                                    if (c31973j5 != null && c31973j5.m153751b0() != this.f74437K1) {
                                        if (this.f72357R0.m153751b0()) {
                                            i12 = AbstractC8020f0.str_msg_toast_enable_history_msg;
                                        } else {
                                            i12 = AbstractC8020f0.str_msg_toast_disable_history_msg;
                                        }
                                        ToastUtils.m89268p(AbstractC23136l9.m118743r0(i12));
                                        this.f74437K1 = this.f72357R0.m153751b0();
                                    }
                                    m80929qN();
                                    return;
                                case 10:
                                    break;
                                case 11:
                                    break;
                                default:
                                    return;
                            }
                        }
                    }
                    if (contains) {
                        finish();
                        return;
                    }
                    return;
                }
                if (contains || intValue == 11) {
                    m80929qN();
                }
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            m80905NM();
            m80949LM();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 27);
    }
}
