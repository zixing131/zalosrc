package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import am.C0943w;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.GroupFullNicknameAdapter;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.SetNicknamePopupView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.NicknameInGroupView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.C23055e5;
import me0.C23212s8;
import org.json.JSONArray;
import org.json.JSONObject;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p716zh.C31973j5;
import vg.C28203u6;
import zc0.C31784b;

/* loaded from: classes6.dex */
public class NicknameInGroupView extends SlidableZaloView implements C23744a.c, InterfaceC0733x {

    /* renamed from: P0 */
    View f75614P0;

    /* renamed from: Q0 */
    RecyclerView f75615Q0;

    /* renamed from: R0 */
    LinearLayoutManager f75616R0;

    /* renamed from: S0 */
    MultiStateView f75617S0;

    /* renamed from: T0 */
    RobotoTextView f75618T0;

    /* renamed from: U0 */
    C23528a f75619U0;

    /* renamed from: V0 */
    String f75620V0;

    /* renamed from: W0 */
    C31973j5 f75621W0;

    /* renamed from: c1 */
    GroupFullNicknameAdapter f75627c1;

    /* renamed from: d1 */
    String f75628d1;

    /* renamed from: e1 */
    boolean f75629e1;

    /* renamed from: X0 */
    ArrayList f75622X0 = new ArrayList();

    /* renamed from: Y0 */
    ArrayList f75623Y0 = new ArrayList();

    /* renamed from: Z0 */
    Set f75624Z0 = new HashSet();

    /* renamed from: a1 */
    boolean f75625a1 = false;

    /* renamed from: b1 */
    String f75626b1 = "";

    /* renamed from: f1 */
    InterfaceC14696f f75630f1 = new InterfaceC14696f() { // from class: com.zing.zalo.ui.zviews.a20
        @Override // com.zing.zalo.p077ui.zviews.NicknameInGroupView.InterfaceC14696f
        /* renamed from: a */
        public final void mo82345a(ContactProfile contactProfile) {
            NicknameInGroupView.this.m82322uM(contactProfile);
        }
    };

    /* renamed from: g1 */
    boolean f75631g1 = false;

    /* renamed from: h1 */
    InterfaceC0765j f75632h1 = new C0766k();

    /* renamed from: i1 */
    InterfaceC20094a f75633i1 = new C14692b();

    /* renamed from: j1 */
    boolean f75634j1 = false;

    /* renamed from: k1 */
    int f75635k1 = 0;

    /* renamed from: l1 */
    boolean f75636l1 = false;

    /* renamed from: m1 */
    boolean f75637m1 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.NicknameInGroupView$a */
    /* loaded from: classes6.dex */
    public class C14691a extends RecyclerView.AbstractC1892s {
        C14691a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            try {
                if (i11 == 0) {
                    NicknameInGroupView.this.f75627c1.m35668Q(false);
                    NicknameInGroupView.this.f75627c1.m10008p();
                    if (NicknameInGroupView.this.f75616R0.m9745c2() >= NicknameInGroupView.this.f75616R0.m10127i() - 2) {
                        NicknameInGroupView nicknameInGroupView = NicknameInGroupView.this;
                        if (!nicknameInGroupView.f75636l1 && nicknameInGroupView.f75634j1) {
                            nicknameInGroupView.m82336pM();
                        }
                    }
                } else {
                    NicknameInGroupView.this.f75627c1.m35668Q(true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.NicknameInGroupView$b */
    /* loaded from: classes6.dex */
    public class C14692b implements InterfaceC20094a {
        C14692b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ int m82341e(GroupFullNicknameAdapter.C6945c c6945c, GroupFullNicknameAdapter.C6945c c6945c2) {
            String str;
            ContactProfile contactProfile = c6945c.f38051b;
            if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r) && c6945c.f38051b.f42434r.equals(CoreUtility.f89233i)) {
                return -1;
            }
            ContactProfile contactProfile2 = c6945c2.f38051b;
            if (contactProfile2 != null && !TextUtils.isEmpty(contactProfile2.f42434r) && c6945c2.f38051b.f42434r.equals(CoreUtility.f89233i)) {
                return 1;
            }
            if (c6945c.f38052c) {
                return -1;
            }
            if (c6945c2.f38052c) {
                return 1;
            }
            ContactProfile contactProfile3 = c6945c.f38051b;
            String str2 = "";
            if (contactProfile3 == null) {
                str = "";
            } else {
                str = contactProfile3.f42440t;
            }
            ContactProfile contactProfile4 = c6945c2.f38051b;
            if (contactProfile4 != null) {
                str2 = contactProfile4.f42440t;
            }
            boolean z11 = c6945c.f38053d;
            if (z11 && c6945c2.f38053d) {
                return str.compareToIgnoreCase(str2);
            }
            if (z11) {
                return -1;
            }
            if (c6945c2.f38053d) {
                return 1;
            }
            return str.compareToIgnoreCase(str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m82342f(C20096c c20096c) {
            MultiStateView.EnumC15915f enumC15915f;
            int i11;
            try {
                int m104491c = c20096c.m104491c();
                NicknameInGroupView.this.m82329CM(false);
                NicknameInGroupView.this.f75617S0.setState(MultiStateView.EnumC15914e.ERROR);
                MultiStateView multiStateView = NicknameInGroupView.this.f75617S0;
                if (m104491c == 50001) {
                    enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                } else {
                    enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                }
                multiStateView.setErrorType(enumC15915f);
                MultiStateView multiStateView2 = NicknameInGroupView.this.f75617S0;
                if (m104491c == 50001) {
                    i11 = AbstractC8020f0.NETWORK_ERROR_MSG;
                } else {
                    i11 = AbstractC8020f0.str_tv_loadingMemberList_error;
                }
                multiStateView2.setErrorTitleString(AbstractC23136l9.m118743r0(i11));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            if (c20096c != null) {
                try {
                    NicknameInGroupView.this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.d20
                        @Override // java.lang.Runnable
                        public final void run() {
                            NicknameInGroupView.C14692b.this.m82342f(c20096c);
                        }
                    });
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            NicknameInGroupView.this.f75636l1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11;
            try {
                JSONObject jSONObject = new JSONObject(obj.toString());
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (!jSONObject.isNull("error_code") && jSONObject.getInt("error_code") == 0) {
                    NicknameInGroupView nicknameInGroupView = NicknameInGroupView.this;
                    if (nicknameInGroupView.f75635k1 == 0) {
                        nicknameInGroupView.f75623Y0.clear();
                        NicknameInGroupView.this.f75624Z0.clear();
                        NicknameInGroupView.this.f75626b1 = jSONObject2.optString("creatorId");
                    }
                    NicknameInGroupView nicknameInGroupView2 = NicknameInGroupView.this;
                    if (jSONObject2.optInt("hasMore") == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    nicknameInGroupView2.f75634j1 = z11;
                    NicknameInGroupView nicknameInGroupView3 = NicknameInGroupView.this;
                    nicknameInGroupView3.f75625a1 = CoreUtility.f89233i.equals(nicknameInGroupView3.f75626b1);
                    JSONArray optJSONArray = jSONObject2.optJSONArray("admins");
                    if (optJSONArray != null) {
                        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                            try {
                                JSONObject jSONObject3 = (JSONObject) optJSONArray.get(i11);
                                String optString = jSONObject3.optString("id");
                                String optString2 = jSONObject3.optString("dName");
                                String optString3 = jSONObject3.optString("avatar");
                                if (!TextUtils.isEmpty(optString)) {
                                    NicknameInGroupView.this.f75624Z0.add(optString);
                                    GroupFullNicknameAdapter.C6945c c6945c = new GroupFullNicknameAdapter.C6945c(0);
                                    if (NicknameInGroupView.this.f75626b1.equals(optString)) {
                                        c6945c.f38052c = true;
                                    } else {
                                        c6945c.f38053d = true;
                                    }
                                    c6945c.f38051b = NicknameInGroupView.this.m82335oM(optString, optString2, optString3);
                                    if (optString.equals(CoreUtility.f89233i)) {
                                        NicknameInGroupView nicknameInGroupView4 = NicknameInGroupView.this;
                                        if (!nicknameInGroupView4.f75631g1) {
                                            nicknameInGroupView4.f75631g1 = true;
                                            nicknameInGroupView4.f75623Y0.add(c6945c);
                                        }
                                    } else {
                                        NicknameInGroupView.this.f75623Y0.add(c6945c);
                                    }
                                }
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("currentMems");
                    if (optJSONArray2 != null) {
                        for (int i12 = 0; i12 < optJSONArray2.length(); i12++) {
                            JSONObject jSONObject4 = (JSONObject) optJSONArray2.get(i12);
                            String optString4 = jSONObject4.optString("id");
                            String optString5 = jSONObject4.optString("dName");
                            String optString6 = jSONObject4.optString("avatar");
                            if (!TextUtils.isEmpty(optString4)) {
                                GroupFullNicknameAdapter.C6945c c6945c2 = new GroupFullNicknameAdapter.C6945c(0);
                                c6945c2.f38052c = NicknameInGroupView.this.f75626b1.equals(optString4);
                                c6945c2.f38051b = NicknameInGroupView.this.m82335oM(optString4, optString5, optString6);
                                if (optString4.equals(CoreUtility.f89233i)) {
                                    NicknameInGroupView nicknameInGroupView5 = NicknameInGroupView.this;
                                    if (!nicknameInGroupView5.f75631g1) {
                                        nicknameInGroupView5.f75631g1 = true;
                                        nicknameInGroupView5.f75623Y0.add(c6945c2);
                                    }
                                } else {
                                    NicknameInGroupView.this.f75623Y0.add(c6945c2);
                                }
                            }
                        }
                    }
                    NicknameInGroupView nicknameInGroupView6 = NicknameInGroupView.this;
                    if (nicknameInGroupView6.f75635k1 == 0) {
                        if (!nicknameInGroupView6.f75631g1 && AbstractC23304d.f113368c0 != null) {
                            GroupFullNicknameAdapter.C6945c c6945c3 = new GroupFullNicknameAdapter.C6945c(0);
                            c6945c3.f38051b = AbstractC23304d.f113368c0;
                            NicknameInGroupView.this.f75623Y0.add(c6945c3);
                            NicknameInGroupView.this.f75631g1 = true;
                        }
                        Collections.sort(NicknameInGroupView.this.f75623Y0, new Comparator() { // from class: com.zing.zalo.ui.zviews.e20
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                int m82341e;
                                m82341e = NicknameInGroupView.C14692b.m82341e((GroupFullNicknameAdapter.C6945c) obj2, (GroupFullNicknameAdapter.C6945c) obj3);
                                return m82341e;
                            }
                        });
                    }
                    NicknameInGroupView nicknameInGroupView7 = NicknameInGroupView.this;
                    if (nicknameInGroupView7.f75634j1) {
                        nicknameInGroupView7.f75635k1++;
                    }
                    nicknameInGroupView7.m82327AM();
                }
                NicknameInGroupView.this.f75636l1 = false;
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.NicknameInGroupView$c */
    /* loaded from: classes6.dex */
    public class C14693c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f75640a;

        /* renamed from: b */
        final /* synthetic */ String f75641b;

        C14693c(String str, String str2) {
            this.f75640a = str;
            this.f75641b = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m82344d() {
            GroupFullNicknameAdapter groupFullNicknameAdapter = NicknameInGroupView.this.f75627c1;
            if (groupFullNicknameAdapter != null) {
                groupFullNicknameAdapter.m10008p();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            NicknameInGroupView.this.mo49315c4();
            boolean z11 = true;
            if (c20096c != null && c20096c.m104491c() == 17029) {
                ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f75640a);
                if (m141809c != null) {
                    ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_user_no_longer_member_of_group, m141809c.m40383Q(true, false)));
                }
                NicknameInGroupView nicknameInGroupView = NicknameInGroupView.this;
                nicknameInGroupView.f75635k1 = 0;
                nicknameInGroupView.m82336pM();
                return;
            }
            C31973j5 c31973j5 = NicknameInGroupView.this.f75621W0;
            if (c31973j5 == null || !c31973j5.m153747Y()) {
                z11 = false;
            }
            AbstractC23161o1.m119321f(c20096c, z11);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            NicknameInGroupView.this.mo49315c4();
            C31973j5 c31973j5 = NicknameInGroupView.this.f75621W0;
            if (c31973j5 != null) {
                c31973j5.m153796z0(this.f75640a, this.f75641b);
                NicknameInGroupView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.f20
                    @Override // java.lang.Runnable
                    public final void run() {
                        NicknameInGroupView.C14693c.this.m82344d();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.NicknameInGroupView$d */
    /* loaded from: classes6.dex */
    public class C14694d extends ClickableSpan {
        C14694d() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            try {
                String str = AbstractC23306f.m120583H().m110204g().f110079n;
                Bundle bundle = new Bundle();
                bundle.putString("EXTRA_WEB_URL", str);
                bundle.putInt("EXTRA_SOURCE_LINK", 0);
                ZaloWebView.m87105iS(NicknameInGroupView.this.f72421L0.m92676n2(), str, bundle);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(C23212s8.m119607o(NicknameInGroupView.this.getContext(), AbstractC16781w.LinkColor));
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.NicknameInGroupView$e */
    /* loaded from: classes6.dex */
    public class C14695e implements InterfaceC20094a {
        C14695e() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            boolean z11;
            C31973j5 c31973j5 = NicknameInGroupView.this.f75621W0;
            if (c31973j5 != null && c31973j5.m153747Y()) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC23161o1.m119321f(c20096c, z11);
            NicknameInGroupView.this.f72421L0.mo49315c4();
            NicknameInGroupView.this.f75637m1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            NicknameInGroupView.this.f72421L0.mo49315c4();
            NicknameInGroupView.this.f75637m1 = false;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.NicknameInGroupView$f */
    /* loaded from: classes6.dex */
    public interface InterfaceC14696f {
        /* renamed from: a */
        void mo82345a(ContactProfile contactProfile);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public /* synthetic */ void m82319rM() {
        this.f75627c1.m10008p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public /* synthetic */ void m82320sM() {
        this.f75627c1.m10008p();
        m82328BM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public /* synthetic */ void m82321tM(RecyclerView recyclerView, int i11, View view) {
        try {
            GroupFullNicknameAdapter groupFullNicknameAdapter = this.f75627c1;
            if (groupFullNicknameAdapter != null) {
                GroupFullNicknameAdapter.C6945c m35663L = groupFullNicknameAdapter.m35663L(i11);
                int i12 = m35663L.f38050a;
                if (i12 != 0) {
                    if (i12 == 2) {
                        showDialog(1);
                    }
                } else {
                    if (this.f75621W0.m153766j0() && !this.f75621W0.m153742T()) {
                        AbstractC23647d.m123897g("10060008");
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_nickname_no_permission_set));
                    }
                    AbstractC23647d.m123897g("10060004");
                    ContactProfile contactProfile = m35663L.f38051b;
                    if (contactProfile != null) {
                        m82338zM(contactProfile);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public /* synthetic */ void m82322uM(ContactProfile contactProfile) {
        AbstractC23647d.m123897g("10060002");
        if (contactProfile != null) {
            m82338zM(contactProfile);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public /* synthetic */ void m82323vM(SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        int intValue;
        boolean z11;
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        HashMap hashMap = (HashMap) simpleAdapter.getItem(i11);
        if (hashMap.get("id") == null) {
            intValue = -1;
        } else {
            intValue = ((Integer) hashMap.get("id")).intValue();
        }
        if (intValue == -1) {
            return;
        }
        if (intValue != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f75629e1 != z11) {
            this.f75629e1 = z11;
            m82327AM();
            m82334HM(this.f75629e1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public /* synthetic */ void m82324wM(View view) {
        if (m92662fJ() != null) {
            Bundle bundle = new Bundle();
            bundle.putString("extra_group_id", this.f75620V0);
            m92662fJ().m93066i2(SettingNicknameInGroupView.class, bundle, 0, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public /* synthetic */ void m82325xM() {
        try {
            m82332FM(AbstractC8020f0.str_emptyResult);
            m82329CM(false);
            GroupFullNicknameAdapter groupFullNicknameAdapter = this.f75627c1;
            if (groupFullNicknameAdapter != null) {
                groupFullNicknameAdapter.m35666O(this.f75622X0);
                this.f75627c1.m10008p();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public /* synthetic */ void m82326yM() {
        if (C23055e5.m118271f()) {
            m82336pM();
            return;
        }
        m82329CM(false);
        this.f75617S0.setState(MultiStateView.EnumC15914e.ERROR);
        this.f75617S0.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG));
        this.f75617S0.setErrorType(MultiStateView.EnumC15915f.NETWORK_ERROR);
    }

    /* renamed from: AM */
    public synchronized void m82327AM() {
        try {
            try {
                this.f75622X0.clear();
                C31973j5 c31973j5 = this.f75621W0;
                if (c31973j5 != null && c31973j5.m153778p0()) {
                    this.f75622X0.add(new GroupFullNicknameAdapter.C6948f(this.f75629e1));
                }
                this.f75622X0.addAll(this.f75623Y0);
                if (this.f75634j1) {
                    this.f75622X0.add(new GroupFullNicknameAdapter.C6945c(1));
                }
                this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.c20
                    @Override // java.lang.Runnable
                    public final void run() {
                        NicknameInGroupView.this.m82325xM();
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: BM */
    void m82328BM() {
        if (this.f75621W0 != null && this.f75618T0 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!this.f75621W0.m153766j0()) {
                spannableStringBuilder.append((CharSequence) AbstractC23136l9.m118743r0(AbstractC8020f0.str_nickname_in_group_hint_non_lock)).append((CharSequence) " ");
            }
            spannableStringBuilder.append((CharSequence) AbstractC23136l9.m118743r0(AbstractC8020f0.str_nickname_in_group_hint_header)).append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_merge_learn_more));
            spannableStringBuilder.setSpan(new C14694d(), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new StyleSpan(1), length, spannableStringBuilder.length(), 33);
            this.f75618T0.setText(spannableStringBuilder);
            this.f75618T0.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f75619U0 = new C23528a(this.f72421L0.m92648SI());
    }

    /* renamed from: CM */
    void m82329CM(boolean z11) {
        if (z11) {
            this.f75617S0.setVisibility(0);
            this.f75617S0.setState(MultiStateView.EnumC15914e.LOADING);
        } else if (this.f75622X0.size() > 0) {
            this.f75617S0.setVisibility(8);
        } else {
            this.f75617S0.setVisibility(0);
            this.f75617S0.setState(MultiStateView.EnumC15914e.EMPTY);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        int i12;
        int i13;
        if (i11 == 1) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            hashMap.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_admin_permission_v2));
            hashMap.put("id", 1);
            if (!this.f75629e1) {
                i12 = AbstractC16803z.btn_radio_off_holo_light;
            } else {
                i12 = AbstractC16803z.btn_radio_on_holo_light;
            }
            hashMap.put("icon", Integer.valueOf(i12));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_everone_permission_v2));
            hashMap2.put("id", 0);
            if (this.f75629e1) {
                i13 = AbstractC16803z.btn_radio_off_holo_light;
            } else {
                i13 = AbstractC16803z.btn_radio_on_holo_light;
            }
            hashMap2.put("icon", Integer.valueOf(i13));
            arrayList.add(hashMap);
            arrayList.add(hashMap2);
            if (!arrayList.isEmpty()) {
                final SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name", "icon"}, new int[]{AbstractC6918a0.tv_active_time_passcode, AbstractC6918a0.ic_choose_or_not});
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                aVar.m43171t(AbstractC8020f0.str_set_nickname_permission);
                aVar.m43173v(3);
                aVar.m43155d(true);
                aVar.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.y10
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i14) {
                        NicknameInGroupView.this.m82323vM(simpleAdapter, interfaceC17463d, i14);
                    }
                });
                return aVar.m43152a();
            }
        }
        return super.mo39014DJ(i11);
    }

    /* renamed from: DM */
    void m82330DM(int i11) {
        MultiStateView multiStateView = this.f75617S0;
        if (multiStateView != null) {
            multiStateView.setLoadingString(AbstractC23136l9.m118743r0(i11));
        }
    }

    /* renamed from: EM */
    void m82331EM(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14693c(str, str2));
        c0766k.mo1399Ba(this.f75620V0, str, str2);
    }

    /* renamed from: FM */
    void m82332FM(int i11) {
        MultiStateView multiStateView = this.f75617S0;
        if (multiStateView != null) {
            multiStateView.setEmptyViewString(AbstractC23136l9.m118743r0(i11));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f75614P0 = layoutInflater.inflate(AbstractC7409c0.nickname_in_group_layout, viewGroup, false);
        m82333GM();
        return this.f75614P0;
    }

    /* renamed from: GM */
    void m82333GM() {
        MultiStateView multiStateView = (MultiStateView) this.f75614P0.findViewById(AbstractC6918a0.multi_state);
        this.f75617S0 = multiStateView;
        multiStateView.setEnableLoadingText(true);
        m82332FM(AbstractC8020f0.empty_list);
        m82330DM(AbstractC8020f0.str_tv_loading);
        this.f75618T0 = (RobotoTextView) this.f75614P0.findViewById(AbstractC6918a0.header_hint);
        this.f75615Q0 = (RecyclerView) this.f75614P0.findViewById(AbstractC6918a0.nicknames_recycle_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f72421L0.m92648SI());
        this.f75616R0 = linearLayoutManager;
        this.f75615Q0.setLayoutManager(linearLayoutManager);
        this.f75615Q0.m9826E(new C14691a());
        m82329CM(true);
        this.f75617S0.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.x10
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                NicknameInGroupView.this.m82326yM();
            }
        });
    }

    /* renamed from: HM */
    void m82334HM(boolean z11) {
        if (this.f75637m1) {
            return;
        }
        this.f75637m1 = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14695e());
        c0766k.mo1412D7(this.f75620V0, 9, z11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 112);
        C23744a.m124114c().m124117e(this, 113);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            Button trailingButton = m87077NK.getTrailingButton();
            if (trailingButton != null) {
                trailingButton.setVisibility(8);
            }
            m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.z10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NicknameInGroupView.this.m82324wM(view);
                }
            });
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        if (!TextUtils.isEmpty(this.f75628d1)) {
            bundle.putString("selectUid", this.f75628d1);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "NicknameInGroupView";
    }

    /* renamed from: oM */
    ContactProfile m82335oM(String str, String str2, String str3) {
        ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
        if (m141809c == null || TextUtils.isEmpty(m141809c.f42437s) || TextUtils.isEmpty(m141809c.f42446v)) {
            m141809c = new ContactProfile(str);
            m141809c.f42437s = str2;
            m141809c.f42446v = str3;
            m141809c.f42330D = System.currentTimeMillis();
            C7960e.m41971c6().m42221O7(m141809c, false);
        }
        if (CoreUtility.f89233i.equals(str)) {
            ContactProfile contactProfile = new ContactProfile(str);
            contactProfile.f42437s = str2;
            contactProfile.f42446v = str3;
            contactProfile.f42330D = System.currentTimeMillis();
            return contactProfile;
        }
        return m141809c;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 1000 && i12 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("nickname");
            String m153705A = this.f75621W0.m153705A(this.f75628d1);
            if ((!TextUtils.isEmpty(m153705A) && !m153705A.equals(stringExtra)) || (TextUtils.isEmpty(m153705A) && !TextUtils.isEmpty(stringExtra))) {
                m82331EM(this.f75628d1, stringExtra);
            }
        }
        super.onActivityResult(i11, i12, intent);
    }

    /* renamed from: pM */
    void m82336pM() {
        if (TextUtils.isEmpty(this.f75620V0) || this.f75636l1) {
            return;
        }
        this.f75636l1 = true;
        this.f75632h1.mo1704o8(this.f75633i1);
        this.f75632h1.mo1680l6(this.f75620V0, this.f75635k1);
    }

    /* renamed from: qM */
    void m82337qM() {
        C31973j5 m4472f = C0943w.m4462l().m4472f(this.f75620V0);
        this.f75621W0 = m4472f;
        if (m4472f != null) {
            GroupFullNicknameAdapter groupFullNicknameAdapter = new GroupFullNicknameAdapter(this.f72421L0.m92648SI(), this.f75622X0, this.f75619U0, this.f75621W0);
            this.f75627c1 = groupFullNicknameAdapter;
            this.f75615Q0.setAdapter(groupFullNicknameAdapter);
            m82336pM();
            m82328BM();
            this.f75627c1.m35667P(this.f75630f1);
            C31784b.m152808a(this.f75615Q0).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.b20
                @Override // zc0.C31784b.d
                /* renamed from: i0 */
                public final void mo17458i0(RecyclerView recyclerView, int i11, View view) {
                    NicknameInGroupView.this.m82321tM(recyclerView, i11, view);
                }
            });
            this.f75629e1 = this.f75621W0.m153766j0();
            return;
        }
        this.f75617S0.setState(MultiStateView.EnumC15914e.ERROR);
        this.f75617S0.setErrorType(MultiStateView.EnumC15915f.UNKNOWN_ERROR);
        this.f75617S0.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_loadingMemberList_error));
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        try {
            if (i11 != 112) {
                if (i11 == 113) {
                    if (TextUtils.equals((String) objArr[0], this.f75620V0)) {
                        this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.w10
                            @Override // java.lang.Runnable
                            public final void run() {
                                NicknameInGroupView.this.m82320sM();
                            }
                        });
                    }
                }
            } else if (TextUtils.equals((String) objArr[0], this.f75620V0)) {
                this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.v10
                    @Override // java.lang.Runnable
                    public final void run() {
                        NicknameInGroupView.this.m82319rM();
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        this.f75620V0 = this.f72421L0.m92642L3().getString("extra_group_id", "");
        if (bundle != null && bundle.containsKey("selectUid")) {
            this.f75628d1 = bundle.getString("selectUid");
        }
        m82337qM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 112);
        C23744a.m124114c().m124115b(this, 113);
    }

    /* renamed from: zM */
    void m82338zM(ContactProfile contactProfile) {
        try {
            this.f75628d1 = contactProfile.f42434r;
            String m118085e = AbstractC23028c0.m118085e(contactProfile, false, AbstractC8020f0.str_me);
            m92662fJ().mo89692g2(SetNicknamePopupView.m56957OK(AbstractC23136l9.m118746s0(AbstractC8020f0.str_set_nickname_for_user_hint, m118085e), AbstractC23136l9.m118743r0(AbstractC8020f0.str_nickname_in_group_hint_dlg), this.f75621W0.m153705A(this.f75628d1), m118085e, 40), 1000, 2, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
