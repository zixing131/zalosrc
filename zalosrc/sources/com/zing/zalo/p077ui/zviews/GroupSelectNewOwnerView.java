package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.GroupFullMemberAdapter;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.GroupSelectNewOwnerView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import me0.AbstractC23126l;
import me0.AbstractC23136l9;
import me0.AbstractC23244v8;
import me0.AbstractC23262x6;
import me0.C23212s8;
import mm0.AbstractC23350e;
import on0.AbstractC24342w;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p262jb.AbstractC21196a;
import p304ks.C21927m;
import p716zh.C31973j5;
import zc0.C31784b;

/* loaded from: classes6.dex */
public final class GroupSelectNewOwnerView extends BaseGroupMemberView implements InterfaceC0733x {
    public static final C14447a Companion = new C14447a(null);

    /* renamed from: G1 */
    private boolean f74247G1;

    /* renamed from: H1 */
    private ActionBarMenuItem f74248H1;

    /* renamed from: I1 */
    private boolean f74249I1;

    /* renamed from: J1 */
    private boolean f74250J1;

    /* renamed from: K1 */
    private String f74251K1 = "";

    /* renamed from: L1 */
    private ActionBarMenuItem.C17435d f74252L1 = new C14451e();

    /* renamed from: M1 */
    private InterfaceC0765j f74253M1 = new C0766k();

    /* renamed from: N1 */
    private InterfaceC20094a f74254N1 = new C14450d();

    /* renamed from: O1 */
    private ContactProfile f74255O1;

    /* renamed from: com.zing.zalo.ui.zviews.GroupSelectNewOwnerView$a */
    /* loaded from: classes6.dex */
    public static final class C14447a {
        private C14447a() {
        }

        public /* synthetic */ C14447a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Bundle m80670a(String str) {
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("extra_activity_title", str);
            }
            return bundle;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupSelectNewOwnerView$b */
    /* loaded from: classes6.dex */
    public final class C14448b extends Thread {

        /* renamed from: p */
        private final String f74256p;

        /* renamed from: q */
        final /* synthetic */ GroupSelectNewOwnerView f74257q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14448b(GroupSelectNewOwnerView groupSelectNewOwnerView, String str) {
            super("Z:GroupSelectNewOwner-Search");
            AbstractC19074t.m100208f(str, "textSearch");
            this.f74257q = groupSelectNewOwnerView;
            this.f74256p = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m80673c(GroupSelectNewOwnerView groupSelectNewOwnerView) {
            String str;
            Editable text;
            String obj;
            int i11;
            boolean z11;
            AbstractC19074t.m100208f(groupSelectNewOwnerView, "this$0");
            EditText editText = groupSelectNewOwnerView.f72332m1;
            if (editText != null && (text = editText.getText()) != null && (obj = text.toString()) != null) {
                int length = obj.length() - 1;
                int i12 = 0;
                boolean z12 = false;
                while (i12 <= length) {
                    if (!z12) {
                        i11 = i12;
                    } else {
                        i11 = length;
                    }
                    if (AbstractC19074t.m100209g(obj.charAt(i11), 32) <= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z12) {
                        if (!z11) {
                            z12 = true;
                        } else {
                            i12++;
                        }
                    } else if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                }
                str = obj.subSequence(i12, length + 1).toString();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                groupSelectNewOwnerView.mo78416pN();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m80674d(C14448b c14448b, GroupSelectNewOwnerView groupSelectNewOwnerView, ArrayList arrayList) {
            String str;
            Editable text;
            AbstractC19074t.m100208f(c14448b, "this$0");
            AbstractC19074t.m100208f(groupSelectNewOwnerView, "this$1");
            AbstractC19074t.m100208f(arrayList, "$result");
            try {
                String str2 = c14448b.f74256p;
                EditText editText = groupSelectNewOwnerView.f72332m1;
                if (editText != null && (text = editText.getText()) != null) {
                    str = text.toString();
                } else {
                    str = null;
                }
                if (AbstractC19074t.m100204b(str2, str)) {
                    groupSelectNewOwnerView.f72336q1 = arrayList;
                    groupSelectNewOwnerView.m78421xN(AbstractC8020f0.str_emptyResult);
                    groupSelectNewOwnerView.mo78422yN(false);
                    GroupFullMemberAdapter groupFullMemberAdapter = groupSelectNewOwnerView.f72331l1;
                    if (groupFullMemberAdapter != null) {
                        groupFullMemberAdapter.m35635P(groupSelectNewOwnerView.f72336q1);
                        groupFullMemberAdapter.m10008p();
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ContactProfile contactProfile;
            boolean m127149O;
            int m127173b0;
            int i11;
            boolean z11;
            try {
                final ArrayList arrayList = new ArrayList();
                if (TextUtils.isEmpty(this.f74256p)) {
                    final GroupSelectNewOwnerView groupSelectNewOwnerView = this.f74257q;
                    groupSelectNewOwnerView.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.dp
                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupSelectNewOwnerView.C14448b.m80673c(GroupSelectNewOwnerView.this);
                        }
                    });
                    return;
                }
                String m120002o = AbstractC23262x6.m120002o(this.f74256p);
                AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
                int length = m120002o.length() - 1;
                int i12 = 0;
                boolean z12 = false;
                while (i12 <= length) {
                    if (!z12) {
                        i11 = i12;
                    } else {
                        i11 = length;
                    }
                    if (AbstractC19074t.m100209g(m120002o.charAt(i11), 32) <= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z12) {
                        if (!z11) {
                            z12 = true;
                        } else {
                            i12++;
                        }
                    } else if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                }
                String obj = m120002o.subSequence(i12, length + 1).toString();
                Iterator it = this.f74257q.f72337r1.iterator();
                while (it.hasNext()) {
                    GroupFullMemberAdapter.C6938b c6938b = (GroupFullMemberAdapter.C6938b) it.next();
                    if (c6938b.f38021a == 0 && (contactProfile = c6938b.f38022b) != null) {
                        String str = contactProfile.f42440t;
                        if (!TextUtils.isEmpty(str)) {
                            AbstractC19074t.m100205c(str);
                            m127149O = AbstractC24342w.m127149O(str, obj, false, 2, null);
                            if (m127149O) {
                                contactProfile.f42399a1.clear();
                                m127173b0 = AbstractC24342w.m127173b0(str, obj, 0, false, 6, null);
                                if (m127173b0 != -1) {
                                    int length2 = obj.length() + m127173b0;
                                    contactProfile.f42399a1.add(Integer.valueOf(m127173b0));
                                    contactProfile.f42399a1.add(Integer.valueOf(length2));
                                }
                                arrayList.add(c6938b);
                            }
                        }
                    }
                }
                final GroupSelectNewOwnerView groupSelectNewOwnerView2 = this.f74257q;
                groupSelectNewOwnerView2.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ep
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupSelectNewOwnerView.C14448b.m80674d(GroupSelectNewOwnerView.C14448b.this, groupSelectNewOwnerView2, arrayList);
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupSelectNewOwnerView$c */
    /* loaded from: classes6.dex */
    public static final class C14449c implements InterfaceC20094a {
        C14449c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m80677e(GroupSelectNewOwnerView groupSelectNewOwnerView, Object obj) {
            boolean z11;
            AbstractC19074t.m100208f(groupSelectNewOwnerView, "this$0");
            AbstractC19074t.m100208f(obj, "$entity");
            groupSelectNewOwnerView.m78953iL();
            try {
                int i11 = new JSONObject(obj.toString()).getInt("error_code");
                if (i11 == 0) {
                    groupSelectNewOwnerView.f72421L0.finish();
                    return;
                }
                C31973j5 c31973j5 = groupSelectNewOwnerView.f72357R0;
                if (c31973j5 != null) {
                    z11 = c31973j5.m153747Y();
                } else {
                    z11 = false;
                }
                ToastUtils.m89260h(i11, z11);
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m80678f(GroupSelectNewOwnerView groupSelectNewOwnerView, C20096c c20096c) {
            boolean z11;
            AbstractC19074t.m100208f(groupSelectNewOwnerView, "this$0");
            AbstractC19074t.m100208f(c20096c, "$errorMessage");
            groupSelectNewOwnerView.m78953iL();
            C31973j5 c31973j5 = groupSelectNewOwnerView.f72357R0;
            if (c31973j5 != null) {
                z11 = c31973j5.m153747Y();
            } else {
                z11 = false;
            }
            ToastUtils.m89261i(c20096c, z11);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            final GroupSelectNewOwnerView groupSelectNewOwnerView = GroupSelectNewOwnerView.this;
            groupSelectNewOwnerView.f72355P0 = false;
            groupSelectNewOwnerView.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.fp
                @Override // java.lang.Runnable
                public final void run() {
                    GroupSelectNewOwnerView.C14449c.m80678f(GroupSelectNewOwnerView.this, c20096c);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(final Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            final GroupSelectNewOwnerView groupSelectNewOwnerView = GroupSelectNewOwnerView.this;
            groupSelectNewOwnerView.f72355P0 = false;
            groupSelectNewOwnerView.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.gp
                @Override // java.lang.Runnable
                public final void run() {
                    GroupSelectNewOwnerView.C14449c.m80677e(GroupSelectNewOwnerView.this, obj);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupSelectNewOwnerView$d */
    /* loaded from: classes6.dex */
    public static final class C14450d implements InterfaceC20094a {
        C14450d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m80681e(GroupSelectNewOwnerView groupSelectNewOwnerView) {
            AbstractC19074t.m100208f(groupSelectNewOwnerView, "this$0");
            ActionBar m92646QI = groupSelectNewOwnerView.f72421L0.m92646QI();
            if (m92646QI != null) {
                m92646QI.m92723u(groupSelectNewOwnerView.m80664YN());
            }
            groupSelectNewOwnerView.m80666fO("");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m80682f(C20096c c20096c, GroupSelectNewOwnerView groupSelectNewOwnerView) {
            MultiStateView.EnumC15915f enumC15915f;
            int i11;
            AbstractC19074t.m100208f(c20096c, "$errorMessage");
            AbstractC19074t.m100208f(groupSelectNewOwnerView, "this$0");
            try {
                int m104491c = c20096c.m104491c();
                groupSelectNewOwnerView.mo78422yN(false);
                MultiStateView multiStateView = groupSelectNewOwnerView.m78410hN().f137468t;
                multiStateView.setState(MultiStateView.EnumC15914e.ERROR);
                if (m104491c == 50001) {
                    enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                } else {
                    enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                }
                multiStateView.setErrorType(enumC15915f);
                if (m104491c == 50001) {
                    i11 = AbstractC8020f0.NETWORK_ERROR_MSG;
                } else {
                    i11 = AbstractC8020f0.str_tv_loadingMemberList_error;
                }
                multiStateView.setErrorTitleString(AbstractC23136l9.m118743r0(i11));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            GroupSelectNewOwnerView.this.m78418sN();
            try {
                final GroupSelectNewOwnerView groupSelectNewOwnerView = GroupSelectNewOwnerView.this;
                groupSelectNewOwnerView.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ip
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupSelectNewOwnerView.C14450d.m80682f(C20096c.this, groupSelectNewOwnerView);
                    }
                });
                GroupSelectNewOwnerView.this.f72325C1 = false;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            ContactProfile contactProfile;
            String obj2;
            int i11;
            boolean z11;
            int i12;
            boolean z12;
            JSONArray jSONArray;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject jSONObject = new JSONObject(obj.toString());
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (!jSONObject.isNull("error_code") && jSONObject.getInt("error_code") == 0) {
                    GroupSelectNewOwnerView.this.f72337r1.clear();
                    GroupSelectNewOwnerView.this.f72330k1.clear();
                    GroupSelectNewOwnerView groupSelectNewOwnerView = GroupSelectNewOwnerView.this;
                    int optInt = jSONObject2.optInt("creatorId");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(optInt);
                    groupSelectNewOwnerView.f72342w1 = sb2.toString();
                    JSONArray optJSONArray = jSONObject2.optJSONArray("admins");
                    if (optJSONArray != null) {
                        GroupSelectNewOwnerView groupSelectNewOwnerView2 = GroupSelectNewOwnerView.this;
                        int length = optJSONArray.length();
                        int i13 = 0;
                        while (i13 < length) {
                            Object obj3 = optJSONArray.get(i13);
                            AbstractC19074t.m100206d(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                            JSONObject jSONObject3 = (JSONObject) obj3;
                            int optInt2 = jSONObject3.optInt("id");
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(optInt2);
                            String sb4 = sb3.toString();
                            String optString = jSONObject3.optString("dName");
                            String optString2 = jSONObject3.optString("avatar");
                            int optInt3 = jSONObject3.optInt("typeContact");
                            if (!TextUtils.isEmpty(sb4) && !C21927m.m114302u().m114357s().m153137g(sb4) && optInt3 <= 0 && !groupSelectNewOwnerView2.f72330k1.containsKey(sb4)) {
                                jSONArray = optJSONArray;
                                GroupFullMemberAdapter.C6938b c6938b = new GroupFullMemberAdapter.C6938b(0);
                                if (AbstractC19074t.m100204b(groupSelectNewOwnerView2.f72342w1, sb4)) {
                                    c6938b.f38025e = true;
                                } else {
                                    c6938b.f38027g = true;
                                }
                                c6938b.f38022b = groupSelectNewOwnerView2.m78411iN(sb4, optString, optString2, optInt3);
                                if (!c6938b.f38025e) {
                                    groupSelectNewOwnerView2.f72337r1.add(c6938b);
                                    groupSelectNewOwnerView2.f72330k1.put(sb4, c6938b);
                                }
                            } else {
                                jSONArray = optJSONArray;
                            }
                            i13++;
                            optJSONArray = jSONArray;
                        }
                    }
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("currentMems");
                    if (optJSONArray2 != null) {
                        GroupSelectNewOwnerView groupSelectNewOwnerView3 = GroupSelectNewOwnerView.this;
                        int length2 = optJSONArray2.length();
                        for (int i14 = 0; i14 < length2; i14++) {
                            Object obj4 = optJSONArray2.get(i14);
                            AbstractC19074t.m100206d(obj4, "null cannot be cast to non-null type org.json.JSONObject");
                            JSONObject jSONObject4 = (JSONObject) obj4;
                            int optInt4 = jSONObject4.optInt("id");
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(optInt4);
                            String sb6 = sb5.toString();
                            String optString3 = jSONObject4.optString("dName");
                            String optString4 = jSONObject4.optString("avatar");
                            int optInt5 = jSONObject4.optInt("typeContact");
                            if (!TextUtils.isEmpty(sb6) && !C21927m.m114302u().m114357s().m153137g(sb6) && optInt5 <= 0 && !groupSelectNewOwnerView3.f72330k1.containsKey(sb6)) {
                                GroupFullMemberAdapter.C6938b c6938b2 = new GroupFullMemberAdapter.C6938b(0);
                                c6938b2.f38025e = AbstractC19074t.m100204b(groupSelectNewOwnerView3.f72342w1, sb6);
                                c6938b2.f38022b = groupSelectNewOwnerView3.m78411iN(sb6, optString3, optString4, optInt5);
                                if (!c6938b2.f38025e) {
                                    groupSelectNewOwnerView3.f72337r1.add(c6938b2);
                                    groupSelectNewOwnerView3.f72330k1.put(sb6, c6938b2);
                                }
                            }
                        }
                    }
                    Iterator it = GroupSelectNewOwnerView.this.f72337r1.iterator();
                    while (it.hasNext()) {
                        GroupFullMemberAdapter.C6938b c6938b3 = (GroupFullMemberAdapter.C6938b) it.next();
                        if (c6938b3.f38021a == 0 && (contactProfile = c6938b3.f38022b) != null) {
                            if (AbstractC19074t.m100204b(CoreUtility.f89233i, contactProfile.f42434r)) {
                                String m120002o = AbstractC23262x6.m120002o(AbstractC23136l9.m118743r0(AbstractC8020f0.str_you));
                                AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
                                int length3 = m120002o.length() - 1;
                                int i15 = 0;
                                boolean z13 = false;
                                while (i15 <= length3) {
                                    if (!z13) {
                                        i12 = i15;
                                    } else {
                                        i12 = length3;
                                    }
                                    if (AbstractC19074t.m100209g(m120002o.charAt(i12), 32) <= 0) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (!z13) {
                                        if (!z12) {
                                            z13 = true;
                                        } else {
                                            i15++;
                                        }
                                    } else if (!z12) {
                                        break;
                                    } else {
                                        length3--;
                                    }
                                }
                                obj2 = m120002o.subSequence(i15, length3 + 1).toString();
                            } else {
                                String m120002o2 = AbstractC23262x6.m120002o(contactProfile.m40383Q(true, false));
                                AbstractC19074t.m100207e(m120002o2, "convertSignToNoSign(...)");
                                int length4 = m120002o2.length() - 1;
                                int i16 = 0;
                                boolean z14 = false;
                                while (i16 <= length4) {
                                    if (!z14) {
                                        i11 = i16;
                                    } else {
                                        i11 = length4;
                                    }
                                    if (AbstractC19074t.m100209g(m120002o2.charAt(i11), 32) <= 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (!z14) {
                                        if (!z11) {
                                            z14 = true;
                                        } else {
                                            i16++;
                                        }
                                    } else if (!z11) {
                                        break;
                                    } else {
                                        length4--;
                                    }
                                }
                                obj2 = m120002o2.subSequence(i16, length4 + 1).toString();
                            }
                            contactProfile.f42440t = obj2;
                        }
                    }
                    GroupSelectNewOwnerView groupSelectNewOwnerView4 = GroupSelectNewOwnerView.this;
                    Collections.sort(groupSelectNewOwnerView4.f72337r1, groupSelectNewOwnerView4.f72343x1);
                    if (GroupSelectNewOwnerView.this.m80665ZN()) {
                        final GroupSelectNewOwnerView groupSelectNewOwnerView5 = GroupSelectNewOwnerView.this;
                        groupSelectNewOwnerView5.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.hp
                            @Override // java.lang.Runnable
                            public final void run() {
                                GroupSelectNewOwnerView.C14450d.m80681e(GroupSelectNewOwnerView.this);
                            }
                        });
                    } else {
                        GroupSelectNewOwnerView.this.mo78416pN();
                    }
                }
                GroupSelectNewOwnerView.this.f72325C1 = false;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                GroupSelectNewOwnerView.this.m78418sN();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupSelectNewOwnerView$e */
    /* loaded from: classes6.dex */
    public static final class C14451e extends ActionBarMenuItem.C17435d {
        C14451e() {
        }

        @Override // com.zing.zalo.zview.actionbar.ActionBarMenuItem.C17435d
        /* renamed from: c */
        public void mo65077c() {
            super.mo65077c();
            GroupSelectNewOwnerView.this.m80667gO(false);
            GroupSelectNewOwnerView.this.m80669jO();
        }

        @Override // com.zing.zalo.zview.actionbar.ActionBarMenuItem.C17435d
        /* renamed from: d */
        public void mo65078d() {
            super.mo65078d();
            GroupSelectNewOwnerView.this.m80667gO(true);
            GroupSelectNewOwnerView.this.m80668hO(true);
            GroupSelectNewOwnerView.this.m80669jO();
        }

        @Override // com.zing.zalo.zview.actionbar.ActionBarMenuItem.C17435d
        /* renamed from: f */
        public void mo65079f(EditText editText) {
            AbstractC19074t.m100208f(editText, "editText");
            new C14448b(GroupSelectNewOwnerView.this, editText.getText().toString()).start();
        }
    }

    /* renamed from: XN */
    public static final Bundle m80656XN(String str) {
        return Companion.m80670a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aO */
    public static final void m80657aO(GroupSelectNewOwnerView groupSelectNewOwnerView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(groupSelectNewOwnerView, "this$0");
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        Intent intent = new Intent();
        ContactProfile contactProfile = groupSelectNewOwnerView.f74255O1;
        AbstractC19074t.m100205c(contactProfile);
        intent.putExtra("EXTRA_SELECTED_UID", contactProfile.f42434r);
        intent.putExtra("extra_group_id", groupSelectNewOwnerView.f72339t1);
        groupSelectNewOwnerView.f72421L0.mo50035CK(-1, intent);
        groupSelectNewOwnerView.f72421L0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bO */
    public static final void m80658bO(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cO */
    public static final void m80659cO(GroupSelectNewOwnerView groupSelectNewOwnerView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(groupSelectNewOwnerView, "this$0");
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        String str = groupSelectNewOwnerView.f72339t1;
        ContactProfile contactProfile = groupSelectNewOwnerView.f74255O1;
        AbstractC19074t.m100205c(contactProfile);
        groupSelectNewOwnerView.m80663WN(str, contactProfile.f42434r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dO */
    public static final boolean m80660dO(GroupSelectNewOwnerView groupSelectNewOwnerView, TextView textView, int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(groupSelectNewOwnerView, "this$0");
        if (i11 == 3) {
            AbstractC2379w.m12430d(groupSelectNewOwnerView.f72332m1);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eO */
    public static final void m80661eO(GroupSelectNewOwnerView groupSelectNewOwnerView, EditText editText, View view) {
        AbstractC19074t.m100208f(groupSelectNewOwnerView, "this$0");
        groupSelectNewOwnerView.f74249I1 = true;
        AbstractC2379w.m12432f(editText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iO */
    public static final void m80662iO(GroupSelectNewOwnerView groupSelectNewOwnerView, RecyclerView recyclerView, int i11, View view) {
        GroupFullMemberAdapter.C6938b m35631L;
        AbstractC19074t.m100208f(groupSelectNewOwnerView, "this$0");
        try {
            groupSelectNewOwnerView.f72334o1 = i11;
            GroupFullMemberAdapter groupFullMemberAdapter = groupSelectNewOwnerView.f72331l1;
            if (groupFullMemberAdapter != null && (m35631L = groupFullMemberAdapter.m35631L(i11)) != null) {
                groupSelectNewOwnerView.f74255O1 = m35631L.f38022b;
                if (groupSelectNewOwnerView.f74247G1) {
                    groupSelectNewOwnerView.f72421L0.showDialog(1005);
                } else {
                    groupSelectNewOwnerView.f72421L0.showDialog(ZAbstractBase.ZVU_BLEND_GEN_THUMB);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null && m92642L3.containsKey("BOL_EXTRA_LEAVE_GROUP_AFTER_SELECTED_NEW_GROUP_OWNER")) {
            this.f74247G1 = !m92642L3.getBoolean("BOL_EXTRA_LEAVE_GROUP_AFTER_SELECTED_NEW_GROUP_OWNER", true);
        }
        if (bundle != null) {
            try {
                if (bundle.containsKey("BUNDLE_SAVE_KEY_IS_SEARCH_MODE")) {
                    boolean z11 = bundle.getBoolean("BUNDLE_SAVE_KEY_IS_SEARCH_MODE");
                    this.f74250J1 = z11;
                    if (z11 && bundle.containsKey("BUNDLE_SAVE_KEY_CURRENT_SEARCH_TEXT")) {
                        this.f74251K1 = bundle.getString("BUNDLE_SAVE_KEY_CURRENT_SEARCH_TEXT");
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView
    /* renamed from: CN */
    public void mo78394CN() {
        boolean z11;
        int i11;
        super.mo78394CN();
        try {
            C31973j5 c31973j5 = this.f72357R0;
            if (c31973j5 != null && c31973j5.m153747Y()) {
                z11 = true;
            } else {
                z11 = false;
            }
            Context m92686rK = this.f72421L0.m92686rK();
            AbstractC19074t.m100207e(m92686rK, "requireActivity(...)");
            this.f72331l1 = new GroupFullMemberAdapter(m92686rK, this.f72336q1, this.f72335p1, this.f72344y1, 3, null, z11, 32, null);
            m78410hN().f137465q.setAdapter(this.f72331l1);
            if (this.f74247G1) {
                m78410hN().f137466r.setVisibility(8);
            } else {
                m78410hN().f137466r.setVisibility(0);
                RobotoTextView robotoTextView = m78410hN().f137467s;
                if (z11) {
                    i11 = AbstractC8020f0.str_assign_new_community_owner_view_desc;
                } else {
                    i11 = AbstractC8020f0.str_assign_new_group_owner_view_desc;
                }
                robotoTextView.setText(i11);
                GroupFullMemberAdapter groupFullMemberAdapter = this.f72331l1;
                if (groupFullMemberAdapter != null) {
                    groupFullMemberAdapter.f38011x = true;
                }
            }
            C31784b.m152808a(m78410hN().f137465q).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.xo
                @Override // zc0.C31784b.d
                /* renamed from: i0 */
                public final void mo17458i0(RecyclerView recyclerView, int i12, View view) {
                    GroupSelectNewOwnerView.m80662iO(GroupSelectNewOwnerView.this, recyclerView, i12, view);
                }
            });
            AbstractC23126l.m118627a("GroupSelectNewOwnerView");
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView, com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        if (i11 != 1003) {
            if (i11 != 1005) {
                return super.mo39014DJ(i11);
            }
            if (this.f74255O1 == null) {
                return null;
            }
            if (this.f72357R0.m153747Y()) {
                i14 = AbstractC8020f0.str_msg_confirm_change_community_owner;
            } else {
                i14 = AbstractC8020f0.str_msg_confirm_change_group_owner;
            }
            ContactProfile contactProfile = this.f74255O1;
            AbstractC19074t.m100205c(contactProfile);
            SpannableString m119745i = AbstractC23244v8.m119745i(m92689tK(), m92653YI(i14, contactProfile.m40383Q(true, false)), C23212s8.m119610r(AbstractC21196a.TextColor1), 1);
            AbstractC19074t.m100207e(m119745i, "getHighlightString(...)");
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            C8009j.a m43159h = aVar.m43159h(7);
            if (this.f72357R0.m153747Y()) {
                i15 = AbstractC8020f0.str_title_change_community_owner;
            } else {
                i15 = AbstractC8020f0.str_title_change_group_owner;
            }
            ContactProfile contactProfile2 = this.f74255O1;
            AbstractC19074t.m100205c(contactProfile2);
            m43159h.m43172u(AbstractC23136l9.m118746s0(i15, contactProfile2.m40383Q(true, false))).m43173v(2).m43162k(m119745i).m43165n(m92652XI(AbstractC8020f0.str_cancel), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.zo
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i16) {
                    GroupSelectNewOwnerView.m80658bO(interfaceC17463d, i16);
                }
            }).m43170s(m92652XI(AbstractC8020f0.str_btn_change_group_owner), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.ap
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i16) {
                    GroupSelectNewOwnerView.m80659cO(GroupSelectNewOwnerView.this, interfaceC17463d, i16);
                }
            });
            return aVar.m43152a();
        }
        if (this.f74255O1 == null) {
            return null;
        }
        if (this.f72357R0.m153747Y()) {
            i12 = AbstractC8020f0.str_msg_confirm_assign_new_community_owner;
        } else {
            i12 = AbstractC8020f0.str_msg_confirm_assign_new_group_owner_v2;
        }
        ContactProfile contactProfile3 = this.f74255O1;
        AbstractC19074t.m100205c(contactProfile3);
        SpannableString m119745i2 = AbstractC23244v8.m119745i(m92689tK(), m92653YI(i12, contactProfile3.m40383Q(true, false)), C23212s8.m119610r(AbstractC21196a.TextColor1), 1);
        AbstractC19074t.m100207e(m119745i2, "getHighlightString(...)");
        C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
        C8009j.a m43165n = aVar2.m43159h(7).m43162k(m119745i2).m43165n(m92652XI(AbstractC8020f0.str_cancel), new InterfaceC17463d.b());
        if (this.f72357R0.m153747Y()) {
            i13 = AbstractC8020f0.str_leave_community;
        } else {
            i13 = AbstractC8020f0.str_btn_assign_and_leave_group;
        }
        m43165n.m43170s(m92652XI(i13), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.yo
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i16) {
                GroupSelectNewOwnerView.m80657aO(GroupSelectNewOwnerView.this, interfaceC17463d, i16);
            }
        });
        return aVar2.m43152a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        AbstractC19074t.m100208f(actionBarMenu, "menu");
        try {
            super.mo37482FJ(actionBarMenu);
            actionBarMenu.m92750r();
            ActionBarMenuItem m92738e = actionBarMenu.m92738e(AbstractC6918a0.menu_item_search, AbstractC16803z.icn_header_search);
            m92738e.m92768B(true, true, AbstractC16803z.icn_header_close_white, AbstractC16803z.search_cursor_white);
            m92738e.m92767A(this.f74252L1);
            final EditText searchField = m92738e.getSearchField();
            searchField.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zing.zalo.ui.zviews.bp
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                    boolean m80660dO;
                    m80660dO = GroupSelectNewOwnerView.m80660dO(GroupSelectNewOwnerView.this, textView, i11, keyEvent);
                    return m80660dO;
                }
            });
            searchField.setEllipsize(TextUtils.TruncateAt.END);
            searchField.setHintTextColor(AbstractC23136l9.m118641B(searchField.getContext(), AbstractC16801x.white_50));
            searchField.setTextColor(AbstractC23136l9.m118641B(searchField.getContext(), AbstractC16801x.white));
            searchField.setHint(AbstractC23136l9.m118743r0(AbstractC8020f0.hint_default_search));
            searchField.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.cp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupSelectNewOwnerView.m80661eO(GroupSelectNewOwnerView.this, searchField, view);
                }
            });
            if (searchField.getParent() != null) {
                Object parent = searchField.getParent();
                AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.view.View");
                ((View) parent).setBackgroundResource(AbstractC16803z.stencil_edit_text_focused_no_space_white);
            }
            this.f72332m1 = searchField;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView, com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        m92637BK(true);
        mo78394CN();
        mo78415mN();
        LinearLayout root = m78410hN().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            try {
                AbstractC2379w.m12430d(this.f72332m1);
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
        boolean z11;
        int i11;
        boolean z12;
        AbstractC19074t.m100208f(bundle, "outState");
        try {
            ActionBar m92646QI = this.f72421L0.m92646QI();
            if (m92646QI != null) {
                z11 = m92646QI.m92719n();
            } else {
                z11 = false;
            }
            bundle.putBoolean("BUNDLE_SAVE_KEY_IS_SEARCH_MODE", z11);
            EditText editText = this.f72332m1;
            AbstractC19074t.m100205c(editText);
            String obj = editText.getText().toString();
            int length = obj.length() - 1;
            int i12 = 0;
            boolean z13 = false;
            while (i12 <= length) {
                if (!z13) {
                    i11 = i12;
                } else {
                    i11 = length;
                }
                if (AbstractC19074t.m100209g(obj.charAt(i11), 32) <= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z13) {
                    if (!z12) {
                        z13 = true;
                    } else {
                        i12++;
                    }
                } else if (!z12) {
                    break;
                } else {
                    length--;
                }
            }
            bundle.putString("BUNDLE_SAVE_KEY_CURRENT_SEARCH_TEXT", obj.subSequence(i12, length + 1).toString());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        super.mo37118SJ(bundle);
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView, com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setTitle(this.f72338s1);
        }
    }

    /* renamed from: WN */
    public final void m80663WN(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || this.f72355P0) {
            return;
        }
        this.f72355P0 = true;
        m78944ZL();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14449c());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("srcType", 0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        c0766k.mo1492N6(jSONObject.toString(), str, str2);
    }

    /* renamed from: YN */
    public final String m80664YN() {
        return this.f74251K1;
    }

    /* renamed from: ZN */
    public final boolean m80665ZN() {
        return this.f74250J1;
    }

    /* renamed from: fO */
    public final void m80666fO(String str) {
        this.f74251K1 = str;
    }

    /* renamed from: gO */
    public final void m80667gO(boolean z11) {
        this.f74250J1 = z11;
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GroupSelectNewOwnerView";
    }

    /* renamed from: hO */
    public final void m80668hO(boolean z11) {
        this.f74249I1 = z11;
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView
    /* renamed from: jN */
    public void mo78412jN() {
        if (TextUtils.isEmpty(this.f72339t1) || this.f72325C1) {
            return;
        }
        this.f72325C1 = true;
        this.f74253M1.mo1704o8(this.f74254N1);
        this.f74253M1.mo1387A6(this.f72339t1);
    }

    /* renamed from: jO */
    public final void m80669jO() {
        int i11;
        ActionBarMenuItem actionBarMenuItem = this.f74248H1;
        if (actionBarMenuItem != null) {
            if (this.f74250J1) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            actionBarMenuItem.setVisibility(i11);
        }
    }
}
