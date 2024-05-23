package com.zing.zalo.p077ui.zviews;

import ae.C0766k;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.GroupFullMemberAdapter;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.zviews.GroupSearchMemberView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import i70.C20380b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23136l9;
import me0.AbstractC23262x6;
import mm0.AbstractC23350e;
import on0.AbstractC24342w;
import org.json.JSONArray;
import org.json.JSONObject;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p656xs.AbstractC30201b;
import p656xs.C30202c;
import p716zh.C31973j5;
import pm0.C24848g0;
import qm0.AbstractC25368s;

/* loaded from: classes6.dex */
public final class GroupSearchMemberView extends GroupAllMemberView {
    public static final C14443a Companion = new C14443a(null);

    /* renamed from: P1 */
    private ActionBarMenuItem.C17435d f74238P1;

    /* renamed from: R1 */
    private ActionBarMenuItem f74240R1;

    /* renamed from: S1 */
    private ActionBarMenuItem f74241S1;

    /* renamed from: O1 */
    private AtomicBoolean f74237O1 = new AtomicBoolean(false);

    /* renamed from: Q1 */
    private final AtomicBoolean f74239Q1 = new AtomicBoolean(false);

    /* renamed from: T1 */
    private String f74242T1 = "";

    /* renamed from: com.zing.zalo.ui.zviews.GroupSearchMemberView$a */
    /* loaded from: classes6.dex */
    public static final class C14443a {
        private C14443a() {
        }

        public /* synthetic */ C14443a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Bundle m80642a(String str) {
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("extra_activity_title", str);
            }
            return bundle;
        }

        /* renamed from: b */
        public final GroupSearchMemberView m80643b(Bundle bundle) {
            GroupSearchMemberView groupSearchMemberView = new GroupSearchMemberView();
            groupSearchMemberView.mo60305zK(bundle);
            return groupSearchMemberView;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupSearchMemberView$b */
    /* loaded from: classes6.dex */
    public final class C14444b extends Thread {

        /* renamed from: p */
        private final String f74243p;

        /* renamed from: q */
        final /* synthetic */ GroupSearchMemberView f74244q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14444b(GroupSearchMemberView groupSearchMemberView, String str) {
            super("Z:GroupAllMember-Search");
            AbstractC19074t.m100208f(str, "textSearch");
            this.f74244q = groupSearchMemberView;
            this.f74243p = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m80646c(GroupSearchMemberView groupSearchMemberView, ArrayList arrayList) {
            String str;
            Editable text;
            String obj;
            int i11;
            boolean z11;
            AbstractC19074t.m100208f(groupSearchMemberView, "this$0");
            AbstractC19074t.m100208f(arrayList, "$result");
            try {
                GroupFullMemberAdapter groupFullMemberAdapter = groupSearchMemberView.f72331l1;
                if (groupFullMemberAdapter != null) {
                    EditText editText = groupSearchMemberView.f72332m1;
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
                        groupSearchMemberView.f72336q1.clear();
                        groupSearchMemberView.f72336q1.addAll(groupSearchMemberView.mo78408fN(arrayList));
                        if (groupSearchMemberView.f74237O1.get()) {
                            groupSearchMemberView.m78406bN(0);
                        } else {
                            groupSearchMemberView.m78418sN();
                        }
                        groupFullMemberAdapter.m35635P(groupSearchMemberView.f72336q1);
                        groupFullMemberAdapter.m10008p();
                        if (groupSearchMemberView.f72337r1.size() > 0) {
                            groupSearchMemberView.mo78422yN(false);
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m80647d(C14444b c14444b, GroupSearchMemberView groupSearchMemberView, ArrayList arrayList) {
            String str;
            Editable text;
            AbstractC19074t.m100208f(c14444b, "this$0");
            AbstractC19074t.m100208f(groupSearchMemberView, "this$1");
            AbstractC19074t.m100208f(arrayList, "$result");
            try {
                String str2 = c14444b.f74243p;
                EditText editText = groupSearchMemberView.f72332m1;
                if (editText != null && (text = editText.getText()) != null) {
                    str = text.toString();
                } else {
                    str = null;
                }
                if (AbstractC19074t.m100204b(str2, str)) {
                    groupSearchMemberView.f72336q1.clear();
                    groupSearchMemberView.f72336q1.addAll(groupSearchMemberView.mo78408fN(arrayList));
                    if (groupSearchMemberView.f74237O1.get()) {
                        groupSearchMemberView.m78406bN(0);
                    } else {
                        groupSearchMemberView.m78418sN();
                    }
                    groupSearchMemberView.m78421xN(AbstractC8020f0.str_emptyResult);
                    groupSearchMemberView.mo78422yN(false);
                    GroupFullMemberAdapter groupFullMemberAdapter = groupSearchMemberView.f72331l1;
                    if (groupFullMemberAdapter != null) {
                        groupFullMemberAdapter.m35635P(groupSearchMemberView.f72336q1);
                        groupFullMemberAdapter.m10008p();
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean m127149O;
            int m127173b0;
            int i11;
            boolean z11;
            try {
                final ArrayList arrayList = new ArrayList();
                if (TextUtils.isEmpty(this.f74243p)) {
                    Iterator it = this.f74244q.f72337r1.iterator();
                    while (it.hasNext()) {
                        GroupFullMemberAdapter.C6938b c6938b = (GroupFullMemberAdapter.C6938b) it.next();
                        int i12 = c6938b.f38021a;
                        if (i12 != 0) {
                            if (i12 == 5) {
                                arrayList.add(c6938b);
                            }
                        } else {
                            ContactProfile contactProfile = c6938b.f38022b;
                            if (contactProfile != null) {
                                contactProfile.f42399a1.clear();
                                arrayList.add(c6938b);
                            }
                        }
                    }
                    final GroupSearchMemberView groupSearchMemberView = this.f74244q;
                    groupSearchMemberView.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.uo
                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupSearchMemberView.C14444b.m80646c(GroupSearchMemberView.this, arrayList);
                        }
                    });
                    return;
                }
                if (this.f74244q.m80635KO()) {
                    this.f74244q.m80636LO();
                }
                String m120002o = AbstractC23262x6.m120002o(this.f74243p);
                AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
                int length = m120002o.length() - 1;
                int i13 = 0;
                boolean z12 = false;
                while (i13 <= length) {
                    if (!z12) {
                        i11 = i13;
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
                            i13++;
                        }
                    } else if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                }
                String obj = m120002o.subSequence(i13, length + 1).toString();
                Iterator it2 = this.f74244q.f72337r1.iterator();
                while (it2.hasNext()) {
                    GroupFullMemberAdapter.C6938b c6938b2 = (GroupFullMemberAdapter.C6938b) it2.next();
                    int i14 = c6938b2.f38021a;
                    if (i14 != 0) {
                        if (i14 == 5) {
                            arrayList.add(c6938b2);
                        }
                    } else {
                        ContactProfile contactProfile2 = c6938b2.f38022b;
                        if (contactProfile2 != null) {
                            String str = contactProfile2.f42440t;
                            if (!TextUtils.isEmpty(str)) {
                                AbstractC19074t.m100205c(str);
                                m127149O = AbstractC24342w.m127149O(str, obj, false, 2, null);
                                if (m127149O) {
                                    contactProfile2.f42399a1.clear();
                                    m127173b0 = AbstractC24342w.m127173b0(str, obj, 0, false, 6, null);
                                    if (m127173b0 != -1) {
                                        int length2 = obj.length() + m127173b0;
                                        contactProfile2.f42399a1.add(Integer.valueOf(m127173b0));
                                        contactProfile2.f42399a1.add(Integer.valueOf(length2));
                                    }
                                    arrayList.add(c6938b2);
                                }
                            }
                        }
                    }
                }
                final GroupSearchMemberView groupSearchMemberView2 = this.f74244q;
                groupSearchMemberView2.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.vo
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupSearchMemberView.C14444b.m80647d(GroupSearchMemberView.C14444b.this, groupSearchMemberView2, arrayList);
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupSearchMemberView$c */
    /* loaded from: classes6.dex */
    public static final class C14445c implements InterfaceC20094a {
        C14445c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m80649d(GroupSearchMemberView groupSearchMemberView, C20096c c20096c) {
            MultiStateView.EnumC15915f enumC15915f;
            int i11;
            AbstractC19074t.m100208f(groupSearchMemberView, "this$0");
            AbstractC19074t.m100208f(c20096c, "$errorMessage");
            groupSearchMemberView.m78418sN();
            GroupFullMemberAdapter groupFullMemberAdapter = groupSearchMemberView.f72331l1;
            if (groupFullMemberAdapter != null) {
                groupFullMemberAdapter.m35635P(groupSearchMemberView.f72336q1);
                groupFullMemberAdapter.m10008p();
            }
            if (groupSearchMemberView.f72337r1.size() == 0 && (groupSearchMemberView.m78410hN().f137468t.getVisibility() == 8 || groupSearchMemberView.m78410hN().f137468t.getState() != MultiStateView.EnumC15914e.ERROR)) {
                groupSearchMemberView.mo78422yN(false);
                MultiStateView multiStateView = groupSearchMemberView.m78410hN().f137468t;
                multiStateView.setState(MultiStateView.EnumC15914e.ERROR);
                if (c20096c.m104491c() == 50001) {
                    enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                } else {
                    enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                }
                multiStateView.setErrorType(enumC15915f);
                if (c20096c.m104491c() == 50001) {
                    i11 = AbstractC8020f0.NETWORK_ERROR_MSG;
                } else {
                    i11 = AbstractC8020f0.str_tv_loadingMemberList_error;
                }
                multiStateView.setErrorTitleString(AbstractC23136l9.m118743r0(i11));
                return;
            }
            groupSearchMemberView.mo78422yN(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            GroupSearchMemberView.this.f74237O1.set(false);
            GroupSearchMemberView.this.f74239Q1.set(false);
            final GroupSearchMemberView groupSearchMemberView = GroupSearchMemberView.this;
            groupSearchMemberView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.wo
                @Override // java.lang.Runnable
                public final void run() {
                    GroupSearchMemberView.C14445c.m80649d(GroupSearchMemberView.this, c20096c);
                }
            });
        }

        /* JADX WARN: Code restructure failed: missing block: B:147:0x023b, code lost:            if (r2 == null) goto L113;     */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            String str;
            Editable text;
            String obj2;
            int i11;
            boolean z11;
            ContactProfile contactProfile;
            String obj3;
            int i12;
            boolean z12;
            int i13;
            boolean z13;
            JSONArray jSONArray;
            AbstractC19074t.m100208f(obj, "entity");
            GroupSearchMemberView.this.f74237O1.set(false);
            GroupSearchMemberView.this.f74239Q1.set(true);
            GroupSearchMemberView.this.m78418sN();
            try {
                JSONObject jSONObject = new JSONObject(obj.toString());
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (!jSONObject.isNull("error_code") && jSONObject.getInt("error_code") == 0) {
                    JSONArray optJSONArray = jSONObject2.optJSONArray("admins");
                    if (optJSONArray != null) {
                        GroupSearchMemberView groupSearchMemberView = GroupSearchMemberView.this;
                        int length = optJSONArray.length();
                        int i14 = 0;
                        while (i14 < length) {
                            try {
                                Object obj4 = optJSONArray.get(i14);
                                AbstractC19074t.m100206d(obj4, "null cannot be cast to non-null type org.json.JSONObject");
                                JSONObject jSONObject3 = (JSONObject) obj4;
                                int optInt = jSONObject3.optInt("id");
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(optInt);
                                String sb3 = sb2.toString();
                                String optString = jSONObject3.optString("dName");
                                String optString2 = jSONObject3.optString("avatar");
                                int optInt2 = jSONObject3.optInt("typeContact");
                                if (!TextUtils.isEmpty(sb3) && !groupSearchMemberView.f72330k1.containsKey(sb3)) {
                                    jSONArray = optJSONArray;
                                    try {
                                        GroupFullMemberAdapter.C6938b c6938b = new GroupFullMemberAdapter.C6938b(0);
                                        if (AbstractC19074t.m100204b(groupSearchMemberView.f72342w1, sb3)) {
                                            c6938b.f38025e = true;
                                        } else {
                                            c6938b.f38027g = true;
                                        }
                                        ContactProfile m78411iN = groupSearchMemberView.m78411iN(sb3, optString, optString2, optInt2);
                                        c6938b.f38022b = m78411iN;
                                        c6938b.f38026f = AbstractC30201b.m148949b(groupSearchMemberView.f72357R0, m78411iN);
                                        groupSearchMemberView.f72337r1.add(c6938b);
                                        groupSearchMemberView.f72330k1.put(sb3, c6938b);
                                    } catch (Exception e11) {
                                        e = e11;
                                        AbstractC23350e.m122778h(e);
                                        i14++;
                                        optJSONArray = jSONArray;
                                    }
                                } else {
                                    jSONArray = optJSONArray;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                jSONArray = optJSONArray;
                            }
                            i14++;
                            optJSONArray = jSONArray;
                        }
                    }
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("currentMems");
                    if (optJSONArray2 != null) {
                        GroupSearchMemberView groupSearchMemberView2 = GroupSearchMemberView.this;
                        int length2 = optJSONArray2.length();
                        for (int i15 = 0; i15 < length2; i15++) {
                            Object obj5 = optJSONArray2.get(i15);
                            AbstractC19074t.m100206d(obj5, "null cannot be cast to non-null type org.json.JSONObject");
                            JSONObject jSONObject4 = (JSONObject) obj5;
                            int optInt3 = jSONObject4.optInt("id");
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(optInt3);
                            String sb5 = sb4.toString();
                            String optString3 = jSONObject4.optString("dName");
                            String optString4 = jSONObject4.optString("avatar");
                            int optInt4 = jSONObject4.optInt("typeContact");
                            if (!TextUtils.isEmpty(sb5) && !groupSearchMemberView2.f72330k1.containsKey(sb5)) {
                                GroupFullMemberAdapter.C6938b c6938b2 = new GroupFullMemberAdapter.C6938b(0);
                                c6938b2.f38025e = AbstractC19074t.m100204b(groupSearchMemberView2.f72342w1, sb5);
                                ContactProfile m78411iN2 = groupSearchMemberView2.m78411iN(sb5, optString3, optString4, optInt4);
                                c6938b2.f38022b = m78411iN2;
                                c6938b2.f38026f = AbstractC30201b.m148949b(groupSearchMemberView2.f72357R0, m78411iN2);
                                groupSearchMemberView2.f72337r1.add(c6938b2);
                                groupSearchMemberView2.f72330k1.put(sb5, c6938b2);
                            }
                        }
                    }
                    Iterator it = GroupSearchMemberView.this.f72337r1.iterator();
                    while (it.hasNext()) {
                        GroupFullMemberAdapter.C6938b c6938b3 = (GroupFullMemberAdapter.C6938b) it.next();
                        if (c6938b3.f38021a == 0 && (contactProfile = c6938b3.f38022b) != null) {
                            if (AbstractC19074t.m100204b(CoreUtility.f89233i, contactProfile.f42434r)) {
                                String m120002o = AbstractC23262x6.m120002o(AbstractC23136l9.m118743r0(AbstractC8020f0.str_you));
                                AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
                                int length3 = m120002o.length() - 1;
                                boolean z14 = false;
                                int i16 = 0;
                                while (i16 <= length3) {
                                    if (!z14) {
                                        i13 = i16;
                                    } else {
                                        i13 = length3;
                                    }
                                    if (AbstractC19074t.m100209g(m120002o.charAt(i13), 32) <= 0) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (!z14) {
                                        if (!z13) {
                                            z14 = true;
                                        } else {
                                            i16++;
                                        }
                                    } else if (!z13) {
                                        break;
                                    } else {
                                        length3--;
                                    }
                                }
                                obj3 = m120002o.subSequence(i16, length3 + 1).toString();
                            } else {
                                String m120002o2 = AbstractC23262x6.m120002o(contactProfile.m40383Q(true, false));
                                AbstractC19074t.m100207e(m120002o2, "convertSignToNoSign(...)");
                                int length4 = m120002o2.length() - 1;
                                int i17 = 0;
                                boolean z15 = false;
                                while (i17 <= length4) {
                                    if (!z15) {
                                        i12 = i17;
                                    } else {
                                        i12 = length4;
                                    }
                                    if (AbstractC19074t.m100209g(m120002o2.charAt(i12), 32) <= 0) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (!z15) {
                                        if (!z12) {
                                            z15 = true;
                                        } else {
                                            i17++;
                                        }
                                    } else if (!z12) {
                                        break;
                                    } else {
                                        length4--;
                                    }
                                }
                                obj3 = m120002o2.subSequence(i17, length4 + 1).toString();
                            }
                            contactProfile.f42440t = obj3;
                        }
                    }
                    GroupSearchMemberView groupSearchMemberView3 = GroupSearchMemberView.this;
                    EditText editText = groupSearchMemberView3.f72332m1;
                    if (editText != null && (text = editText.getText()) != null && (obj2 = text.toString()) != null) {
                        int length5 = obj2.length() - 1;
                        int i18 = 0;
                        boolean z16 = false;
                        while (i18 <= length5) {
                            if (!z16) {
                                i11 = i18;
                            } else {
                                i11 = length5;
                            }
                            if (AbstractC19074t.m100209g(obj2.charAt(i11), 32) <= 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z16) {
                                if (!z11) {
                                    z16 = true;
                                } else {
                                    i18++;
                                }
                            } else if (!z11) {
                                break;
                            } else {
                                length5--;
                            }
                        }
                        str = obj2.subSequence(i18, length5 + 1).toString();
                    }
                    str = "";
                    new C14444b(groupSearchMemberView3, str).start();
                }
            } catch (Exception e13) {
                AbstractC23350e.m122778h(e13);
                GroupSearchMemberView.this.f74239Q1.set(false);
                GroupSearchMemberView.this.f74237O1.set(false);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupSearchMemberView$d */
    /* loaded from: classes6.dex */
    public static final class C14446d extends ActionBarMenuItem.C17435d {
        C14446d() {
        }

        @Override // com.zing.zalo.zview.actionbar.ActionBarMenuItem.C17435d
        /* renamed from: c */
        public void mo65077c() {
            super.mo65077c();
            GroupSearchMemberView.this.f72421L0.finish();
        }

        @Override // com.zing.zalo.zview.actionbar.ActionBarMenuItem.C17435d
        /* renamed from: d */
        public void mo65078d() {
            super.mo65078d();
            GroupSearchMemberView groupSearchMemberView = GroupSearchMemberView.this;
            groupSearchMemberView.f73550I1 = true;
            ActionBarMenuItem actionBarMenuItem = groupSearchMemberView.f74240R1;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(8);
            }
        }

        @Override // com.zing.zalo.zview.actionbar.ActionBarMenuItem.C17435d
        /* renamed from: f */
        public void mo65079f(EditText editText) {
            AbstractC19074t.m100208f(editText, "editText");
            new C14444b(GroupSearchMemberView.this, editText.getText().toString()).start();
        }
    }

    /* renamed from: JO */
    private final void m80634JO(GroupFullMemberAdapter.C6938b c6938b, boolean z11, boolean z12) {
        CharSequence charSequence = "";
        c6938b.f38031k = "";
        if (z12) {
            if (z11) {
                charSequence = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_member_hide_members_title_for_admins);
                AbstractC19074t.m100205c(charSequence);
            } else {
                Context m92689tK = m92689tK();
                AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_member_hide_members_title_for_other);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                charSequence = C20380b.m106165d(m92689tK, this, m118743r0, "gr_search_member", null, 16, null);
            }
        }
        c6938b.f38032l = charSequence;
        c6938b.f38033m = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KO */
    public final boolean m80635KO() {
        C31973j5 c31973j5;
        if (!this.f74239Q1.get() && this.f72345z1 && (c31973j5 = this.f72357R0) != null && c31973j5.m153732O() < GroupAllMemberView.Companion.m79918a()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LO */
    public final void m80636LO() {
        C0766k c0766k = new C0766k();
        if (!TextUtils.isEmpty(this.f72339t1) && !this.f74237O1.get()) {
            this.f74237O1.set(true);
            c0766k.mo1704o8(new C14445c());
            c0766k.mo1387A6(this.f72339t1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MO */
    public static final boolean m80637MO(GroupSearchMemberView groupSearchMemberView, TextView textView, int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(groupSearchMemberView, "this$0");
        if (i11 == 3) {
            AbstractC2379w.m12430d(groupSearchMemberView.f72332m1);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NO */
    public static final void m80638NO(GroupSearchMemberView groupSearchMemberView, View view) {
        AbstractC19074t.m100208f(groupSearchMemberView, "this$0");
        groupSearchMemberView.f73550I1 = true;
        AbstractC2379w.m12432f(groupSearchMemberView.f72332m1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OO */
    public static final void m80639OO(GroupSearchMemberView groupSearchMemberView) {
        String str;
        int i11;
        boolean z11;
        Editable text;
        AbstractC19074t.m100208f(groupSearchMemberView, "this$0");
        try {
            ActionBar actionBar = groupSearchMemberView.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(null);
            }
            groupSearchMemberView.m78421xN(AbstractC8020f0.str_emptyResult);
            groupSearchMemberView.mo78422yN(false);
            EditText editText = groupSearchMemberView.f72332m1;
            if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
                str = "";
            }
            int length = str.length() - 1;
            int i12 = 0;
            boolean z12 = false;
            while (i12 <= length) {
                if (!z12) {
                    i11 = i12;
                } else {
                    i11 = length;
                }
                if (AbstractC19074t.m100209g(str.charAt(i11), 32) <= 0) {
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
            if (!TextUtils.isEmpty(str.subSequence(i12, length + 1).toString())) {
                EditText editText2 = groupSearchMemberView.f72332m1;
                if (editText2 != null) {
                    editText2.setText(str);
                    editText2.setSelection(str.length());
                    return;
                }
                return;
            }
            GroupFullMemberAdapter groupFullMemberAdapter = groupSearchMemberView.f72331l1;
            if (groupFullMemberAdapter != null) {
                groupFullMemberAdapter.m35635P(groupSearchMemberView.f72336q1);
                groupFullMemberAdapter.m10008p();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: PO */
    private final void m80640PO(Bundle bundle) {
        if (bundle != null) {
            try {
                if (bundle.containsKey("BUNDLE_SAVE_KEY_CURRENT_SEARCH_TEXT")) {
                    this.f74242T1 = bundle.getString("BUNDLE_SAVE_KEY_CURRENT_SEARCH_TEXT");
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QO */
    public static final void m80641QO(GroupSearchMemberView groupSearchMemberView) {
        AbstractC19074t.m100208f(groupSearchMemberView, "this$0");
        ActionBar m92646QI = groupSearchMemberView.f72421L0.m92646QI();
        if (m92646QI != null) {
            m92646QI.m92723u(groupSearchMemberView.f74242T1);
        }
        groupSearchMemberView.f74242T1 = "";
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        ContactProfile contactProfile;
        String obj;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        super.mo37111CJ(bundle);
        m80640PO(bundle);
        try {
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null) {
                if (m92642L3.containsKey("EXTRA_CURRENT_PAGE_LOAD")) {
                    this.f72323A1 = m92642L3.getInt("EXTRA_CURRENT_PAGE_LOAD");
                }
                if (m92642L3.containsKey("EXTRA_CAN_LOAD_MORE")) {
                    this.f72345z1 = m92642L3.getBoolean("EXTRA_CAN_LOAD_MORE");
                }
                if (m92642L3.containsKey("EXTRA_LAST_UID_LOAD_MORE")) {
                    this.f72324B1 = m92642L3.getInt("EXTRA_LAST_UID_LOAD_MORE");
                }
                if (m92642L3.containsKey("EXTRA_PRELOAD_DATA_SEARCH") && m92642L3.containsKey("EXTRA_PRELOAD_DATA_SEARCH_INVITE_INFO")) {
                    ArrayList parcelableArrayList = m92642L3.getParcelableArrayList("EXTRA_PRELOAD_DATA_SEARCH");
                    if (parcelableArrayList == null) {
                        parcelableArrayList = new ArrayList();
                    } else {
                        AbstractC19074t.m100205c(parcelableArrayList);
                    }
                    ArrayList parcelableArrayList2 = m92642L3.getParcelableArrayList("EXTRA_PRELOAD_DATA_SEARCH_INVITE_INFO");
                    if (parcelableArrayList2 == null) {
                        parcelableArrayList2 = new ArrayList();
                    } else {
                        AbstractC19074t.m100205c(parcelableArrayList2);
                    }
                    ArrayList arrayList = new ArrayList();
                    int i13 = 0;
                    for (Object obj2 : parcelableArrayList) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            AbstractC25368s.m131509q();
                        }
                        ContactProfile contactProfile2 = (ContactProfile) obj2;
                        if (!this.f72330k1.containsKey(contactProfile2.f42434r)) {
                            GroupFullMemberAdapter.C6938b c6938b = new GroupFullMemberAdapter.C6938b(0);
                            c6938b.f38022b = contactProfile2;
                            c6938b.f38023c = (ContactProfile) parcelableArrayList2.get(i13);
                            C31973j5 c31973j5 = this.f72357R0;
                            if (c31973j5 != null) {
                                AbstractC19074t.m100205c(c31973j5);
                                String str = contactProfile2.f42434r;
                                AbstractC19074t.m100207e(str, "uid");
                                if (c31973j5.m153780q0(str)) {
                                    c6938b.f38025e = true;
                                    c6938b.f38026f = AbstractC30201b.m148949b(this.f72357R0, c6938b.f38022b);
                                    String str2 = contactProfile2.f42434r;
                                    AbstractC19074t.m100207e(str2, "uid");
                                    this.f72342w1 = str2;
                                } else {
                                    String str3 = contactProfile2.f42434r;
                                    AbstractC19074t.m100207e(str3, "uid");
                                    if (c31973j5.m153744V(str3)) {
                                        c6938b.f38027g = true;
                                    }
                                }
                            }
                            this.f72337r1.add(c6938b);
                            HashMap hashMap = this.f72330k1;
                            String str4 = contactProfile2.f42434r;
                            AbstractC19074t.m100207e(str4, "uid");
                            hashMap.put(str4, c6938b);
                        }
                        arrayList.add(obj2);
                        i13 = i14;
                    }
                }
            }
            Iterator it = this.f72337r1.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC19074t.m100207e(next, "next(...)");
                GroupFullMemberAdapter.C6938b c6938b2 = (GroupFullMemberAdapter.C6938b) next;
                if (c6938b2.f38021a == 0 && (contactProfile = c6938b2.f38022b) != null) {
                    if (AbstractC19074t.m100204b(CoreUtility.f89233i, contactProfile.f42434r)) {
                        String m120002o = AbstractC23262x6.m120002o(AbstractC23136l9.m118743r0(AbstractC8020f0.str_you));
                        AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
                        int length = m120002o.length() - 1;
                        int i15 = 0;
                        boolean z13 = false;
                        while (i15 <= length) {
                            if (!z13) {
                                i12 = i15;
                            } else {
                                i12 = length;
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
                                length--;
                            }
                        }
                        obj = m120002o.subSequence(i15, length + 1).toString();
                    } else {
                        String m120002o2 = AbstractC23262x6.m120002o(contactProfile.m40383Q(true, false));
                        AbstractC19074t.m100207e(m120002o2, "convertSignToNoSign(...)");
                        int length2 = m120002o2.length() - 1;
                        int i16 = 0;
                        boolean z14 = false;
                        while (i16 <= length2) {
                            if (!z14) {
                                i11 = i16;
                            } else {
                                i11 = length2;
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
                                length2--;
                            }
                        }
                        obj = m120002o2.subSequence(i16, length2 + 1).toString();
                    }
                    contactProfile.f42440t = obj;
                }
            }
            this.f74238P1 = new C14446d();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zing.zalo.p077ui.zviews.GroupAllMemberView, com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        AbstractC19074t.m100208f(actionBarMenu, "menu");
        try {
            actionBarMenu.m92750r();
            super.mo37482FJ(actionBarMenu);
            this.f74240R1 = actionBarMenu.m92738e(0, AbstractC16803z.icn_header_add_member_white);
            ActionBarMenuItem m92738e = actionBarMenu.m92738e(AbstractC6918a0.menu_item_search, AbstractC16803z.icn_header_search);
            this.f74241S1 = m92738e;
            EditText editText = null;
            ActionBarMenuItem.C17435d c17435d = null;
            if (m92738e != null) {
                m92738e.m92768B(true, true, AbstractC16803z.icn_header_close_white, AbstractC16803z.search_cursor_white);
                ActionBarMenuItem.C17435d c17435d2 = this.f74238P1;
                if (c17435d2 == null) {
                    AbstractC19074t.m100223u("searchListener");
                } else {
                    c17435d = c17435d2;
                }
                m92738e.m92767A(c17435d);
                editText = m92738e.getSearchField();
            }
            this.f72332m1 = editText;
            if (editText != null) {
                editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zing.zalo.ui.zviews.ro
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                        boolean m80637MO;
                        m80637MO = GroupSearchMemberView.m80637MO(GroupSearchMemberView.this, textView, i11, keyEvent);
                        return m80637MO;
                    }
                });
                editText.setEllipsize(TextUtils.TruncateAt.END);
                editText.setHintTextColor(AbstractC23136l9.m118641B(editText.getContext(), AbstractC16801x.white_50));
                editText.setTextColor(AbstractC23136l9.m118641B(editText.getContext(), AbstractC16801x.white));
                editText.setHint(AbstractC23136l9.m118743r0(AbstractC8020f0.hint_default_search));
                editText.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.so
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        GroupSearchMemberView.m80638NO(GroupSearchMemberView.this, view);
                    }
                });
                ViewParent parent = editText.getParent();
                AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.view.View");
                ((View) parent).setBackgroundResource(AbstractC16803z.stencil_edit_text_focused_no_space_white);
                String str = this.f74242T1;
                if (str != null) {
                    ActionBar actionBar = this.f88760a0;
                    if (actionBar != null) {
                        actionBar.m92723u(str);
                    }
                    EditText editText2 = this.f72332m1;
                    if (editText2 != null) {
                        editText2.setSelection(str.length());
                    }
                }
            }
            String str2 = this.f74242T1;
            if (str2 != null) {
                ActionBar actionBar2 = this.f88760a0;
                if (actionBar2 != null) {
                    actionBar2.m92723u(str2);
                }
                EditText editText3 = this.f72332m1;
                if (editText3 != null) {
                    editText3.setSelection(str2.length());
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.GroupAllMemberView, com.zing.zalo.p077ui.zviews.BaseGroupMemberView, com.zing.zalo.zview.ZaloView
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

    @Override // com.zing.zalo.p077ui.zviews.GroupAllMemberView, com.zing.zalo.p077ui.zviews.BaseGroupMemberView, com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        C23744a.Companion.m124119a().m124117e(this, 27);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:            if (r1 == null) goto L29;     */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo37118SJ(Bundle bundle) {
        String str;
        Editable text;
        String obj;
        int i11;
        boolean z11;
        AbstractC19074t.m100208f(bundle, "outState");
        try {
            EditText editText = this.f72332m1;
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
            }
            str = "";
            bundle.putString("BUNDLE_SAVE_KEY_CURRENT_SEARCH_TEXT", str);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        super.mo37118SJ(bundle);
    }

    @Override // com.zing.zalo.p077ui.zviews.GroupAllMemberView, com.zing.zalo.p077ui.zviews.BaseGroupMemberView
    /* renamed from: fN */
    public List mo78408fN(List list) {
        AbstractC19074t.m100208f(list, "data");
        ArrayList arrayList = new ArrayList(list);
        C31973j5 c31973j5 = this.f72357R0;
        if (c31973j5 != null) {
            Iterator it = arrayList.iterator();
            AbstractC19074t.m100207e(it, "iterator(...)");
            while (it.hasNext()) {
                if (((GroupFullMemberAdapter.C6938b) it.next()).f38021a != 0) {
                    it.remove();
                }
            }
            boolean m148952c = C30202c.f140315a.m148952c(c31973j5);
            if (m148952c) {
                GroupFullMemberAdapter.C6938b c6938b = new GroupFullMemberAdapter.C6938b(5);
                m80634JO(c6938b, c31973j5.m153742T(), c31973j5.m153768k0());
                C24848g0 c24848g0 = C24848g0.f119245a;
                arrayList.add(0, c6938b);
            }
            if (m148952c && !c31973j5.m153742T() && c31973j5.m153768k0()) {
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                AbstractC19074t.m100207e(listIterator, "listIterator(...)");
                while (listIterator.hasPrevious()) {
                    GroupFullMemberAdapter.C6938b c6938b2 = (GroupFullMemberAdapter.C6938b) listIterator.previous();
                    if (c6938b2.f38021a == 0 && !c6938b2.f38025e && !c6938b2.f38027g) {
                        listIterator.remove();
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView
    /* renamed from: mN */
    public void mo78415mN() {
        if (this.f72345z1 && this.f72323A1 == 0) {
            mo78412jN();
        } else {
            mo78416pN();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:            if (r0 == null) goto L30;     */
    @Override // com.zing.zalo.p077ui.zviews.GroupAllMemberView
    /* renamed from: nO */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void mo79912nO() {
        String str;
        Editable text;
        String obj;
        int i11;
        boolean z11;
        ActionBar m92646QI = m92646QI();
        if (m92646QI != null && m92646QI.m92719n()) {
            EditText editText = this.f72332m1;
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
            }
            str = "";
            this.f74242T1 = str;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.GroupAllMemberView, com.zing.zalo.p077ui.zviews.BaseGroupMemberView
    /* renamed from: pN */
    public synchronized void mo78416pN() {
        ArrayList arrayList;
        try {
            try {
                this.f72336q1.clear();
                Iterator it = this.f72337r1.iterator();
                while (it.hasNext()) {
                    ContactProfile contactProfile = ((GroupFullMemberAdapter.C6938b) it.next()).f38022b;
                    if (contactProfile != null && (arrayList = contactProfile.f42399a1) != null) {
                        arrayList.clear();
                    }
                }
                this.f72336q1.addAll(mo78408fN(this.f72337r1));
                this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.qo
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupSearchMemberView.m80639OO(GroupSearchMemberView.this);
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.GroupAllMemberView
    /* renamed from: vO */
    protected void mo79914vO() {
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.to
            @Override // java.lang.Runnable
            public final void run() {
                GroupSearchMemberView.m80641QO(GroupSearchMemberView.this);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.GroupAllMemberView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        ActionBarMenuItem actionBarMenuItem;
        super.mo37135xJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && m92642L3.getBoolean("EXTRA_IS_SHOW_SEARCH_MODE", false) && (actionBarMenuItem = this.f74241S1) != null) {
            actionBarMenuItem.m92779x();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView
    /* renamed from: yN */
    public void mo78422yN(boolean z11) {
        if (z11) {
            m78410hN().f137465q.setVisibility(8);
            MultiStateView multiStateView = m78410hN().f137468t;
            multiStateView.setVisibility(0);
            multiStateView.setState(MultiStateView.EnumC15914e.LOADING);
            return;
        }
        if (this.f72336q1.size() > 0) {
            if (this.f72336q1.size() == 1 && ((GroupFullMemberAdapter.C6938b) this.f72336q1.get(0)).f38021a == 5) {
                m78410hN().f137465q.setVisibility(0);
                MultiStateView multiStateView2 = m78410hN().f137468t;
                multiStateView2.setVisibility(0);
                multiStateView2.setState(MultiStateView.EnumC15914e.EMPTY);
                return;
            }
            m78410hN().f137468t.setVisibility(8);
            m78410hN().f137465q.setVisibility(0);
            return;
        }
        m78410hN().f137465q.setVisibility(8);
        MultiStateView multiStateView3 = m78410hN().f137468t;
        multiStateView3.setVisibility(0);
        multiStateView3.setState(MultiStateView.EnumC15914e.EMPTY);
    }

    @Override // com.zing.zalo.p077ui.zviews.GroupAllMemberView
    /* renamed from: yO */
    protected void mo79916yO() {
        Editable editable;
        EditText editText = this.f72332m1;
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        if (!TextUtils.isEmpty(editable)) {
            AbstractC23647d.m123897g("1591121");
        } else {
            AbstractC23647d.m123897g("1591122");
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView, com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        C23744a.Companion.m124119a().m124115b(this, 27);
    }

    @Override // com.zing.zalo.p077ui.zviews.GroupAllMemberView
    /* renamed from: zO */
    protected void mo79917zO() {
        Editable editable;
        EditText editText = this.f72332m1;
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        if (!TextUtils.isEmpty(editable)) {
            AbstractC23647d.m123897g("1591121");
        } else {
            AbstractC23647d.m123897g("1591101");
        }
    }
}
