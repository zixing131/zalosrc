package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.AbstractC0857z0;
import ag0.C0815e1;
import ag0.C0824j;
import am.AbstractC0939u;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.content.AbstractC1388a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7251w6;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.settings.AboutView;
import com.zing.zalo.p077ui.settings.ManageConversationLabelSetting;
import com.zing.zalo.p077ui.settings.SettingAccountAndSecurityV2View;
import com.zing.zalo.p077ui.settings.SettingBirthday;
import com.zing.zalo.p077ui.settings.SettingCallV2View;
import com.zing.zalo.p077ui.settings.SettingContactView;
import com.zing.zalo.p077ui.settings.SettingMessageV2View;
import com.zing.zalo.p077ui.settings.SettingNotificationV2View;
import com.zing.zalo.p077ui.settings.SettingPrivateV2View;
import com.zing.zalo.p077ui.settings.SettingThemeV2View;
import com.zing.zalo.p077ui.settings.SettingTimelineV2View;
import com.zing.zalo.p077ui.settings.SettingV2View;
import com.zing.zalo.p077ui.settings.SwitchAccountView;
import com.zing.zalo.p077ui.settings.subsettings.SettingBlockAndHideView;
import com.zing.zalo.p077ui.settings.subsettings.SettingFeedPrivacyView;
import com.zing.zalo.p077ui.settings.subsettings.SettingHiddenChatView;
import com.zing.zalo.p077ui.settings.subsettings.SettingManageSourceFriendView;
import com.zing.zalo.p077ui.settings.subsettings.SettingUtilitiesView;
import com.zing.zalo.p077ui.settings.widget.SearchSettingTextInputLayout;
import com.zing.zalo.p077ui.toolstorage.overview.ToolStorageView;
import com.zing.zalo.p077ui.toolstoragev1.summary.StorageSummaryView;
import com.zing.zalo.p077ui.zalocloud.home.ZCloudHomeView;
import com.zing.zalo.p077ui.zalocloud.restore.C13958c;
import com.zing.zalo.p077ui.zviews.SearchSettingView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import j30.C20912a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import me0.AbstractC23136l9;
import me0.AbstractC23148n;
import me0.AbstractC23181q;
import me0.AbstractC23210s6;
import me0.AbstractC23216t1;
import me0.AbstractC23262x6;
import me0.C23024b7;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p133ek.AbstractC18458a;
import p304ks.C21927m;
import p320ld.C22438j;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p716zh.C31965ic;
import p716zh.C32017m4;
import p716zh.C32178x9;
import pm0.C24848g0;
import tb0.C26626l;
import v50.C27870vb;
import vg.C28203u6;
import za0.C31747a;
import zc0.C31784b;

/* loaded from: classes6.dex */
public class SearchSettingView extends SlidableZaloView implements C7251w6.c, View.OnClickListener, InterfaceC0733x {

    /* renamed from: P0 */
    RecyclerView f77314P0;

    /* renamed from: Q0 */
    MultiStateView f77315Q0;

    /* renamed from: R0 */
    EditText f77316R0;

    /* renamed from: S0 */
    View f77317S0;

    /* renamed from: T0 */
    C7251w6 f77318T0;

    /* renamed from: V0 */
    C15013j f77320V0;

    /* renamed from: X0 */
    private int f77322X0;

    /* renamed from: e1 */
    ContactProfile f77329e1;

    /* renamed from: U0 */
    public BaseZaloView f77319U0 = this;

    /* renamed from: W0 */
    ArrayList f77321W0 = new ArrayList();

    /* renamed from: Y0 */
    boolean f77323Y0 = true;

    /* renamed from: Z0 */
    String f77324Z0 = "";

    /* renamed from: a1 */
    boolean f77325a1 = false;

    /* renamed from: b1 */
    boolean f77326b1 = false;

    /* renamed from: c1 */
    final Object f77327c1 = new Object();

    /* renamed from: d1 */
    boolean f77328d1 = false;

    /* renamed from: f1 */
    boolean f77330f1 = false;

    /* renamed from: g1 */
    boolean f77331g1 = false;

    /* renamed from: com.zing.zalo.ui.zviews.SearchSettingView$a */
    /* loaded from: classes6.dex */
    class C15004a implements TextWatcher {
        C15004a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            int i14;
            EditText editText;
            float f11;
            String str = "";
            if (SearchSettingView.this.f77316R0 != null) {
                if (charSequence.toString().equals("")) {
                    editText = SearchSettingView.this.f77316R0;
                    f11 = 0.6f;
                } else {
                    editText = SearchSettingView.this.f77316R0;
                    f11 = 1.0f;
                }
                editText.setAlpha(f11);
                str = SearchSettingView.this.f77316R0.getText().toString();
            }
            View view = SearchSettingView.this.f77317S0;
            if (view != null) {
                if (TextUtils.isEmpty(str)) {
                    i14 = 8;
                } else {
                    i14 = 0;
                }
                view.setVisibility(i14);
            }
            C15013j c15013j = SearchSettingView.this.f77320V0;
            if (c15013j != null) {
                c15013j.m83991c();
            }
            SearchSettingView.this.f77320V0 = new C15013j(str);
            SearchSettingView searchSettingView = SearchSettingView.this;
            if (searchSettingView.f77323Y0) {
                searchSettingView.f77323Y0 = false;
                AbstractC23647d.m123897g("800003");
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SearchSettingView$b */
    /* loaded from: classes6.dex */
    class C15005b extends RecyclerView.AbstractC1892s {
        C15005b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            EditText editText = SearchSettingView.this.f77316R0;
            if (editText != null) {
                AbstractC2379w.m12430d(editText);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchSettingView$c */
    /* loaded from: classes6.dex */
    public class C15006c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C32178x9 f77334a;

        C15006c(C32178x9 c32178x9) {
            this.f77334a = c32178x9;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42285U8(String.valueOf(this.f77334a.f148384r), System.currentTimeMillis());
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SearchSettingView$d */
    /* loaded from: classes6.dex */
    class C15007d extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C32178x9 f77336a;

        C15007d(C32178x9 c32178x9) {
            this.f77336a = c32178x9;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42386f4(String.valueOf(this.f77336a.f148384r));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchSettingView$e */
    /* loaded from: classes6.dex */
    public class C15008e implements InterfaceC20094a {
        C15008e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m83982e(boolean z11, boolean z12, boolean z13, JSONArray jSONArray) {
            try {
                if (!SearchSettingView.this.f77319U0.m92677nJ() && !SearchSettingView.this.f77319U0.m92681pJ()) {
                    if (z11) {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("is_unmap_profile", z12);
                        bundle.putBoolean("is_bypass_password", z13);
                        bundle.putInt("source_type_change_phone", 1);
                        SearchSettingView.this.f77319U0.m92676n2().mo35573l4(ChangePhoneNumberView.class, bundle, 1, true);
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    if (jSONArray != null) {
                        bundle2.putString("EXTRA_VALID_ERROR", jSONArray.toString());
                    }
                    SearchSettingView.this.f77319U0.m92662fJ().m93069k2(NotChangePhoneNumberView.class, bundle2, 1, true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ void m83983f(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                synchronized (SearchSettingView.this.f77327c1) {
                    SearchSettingView searchSettingView = SearchSettingView.this;
                    searchSettingView.f77328d1 = false;
                    searchSettingView.f77319U0.mo49315c4();
                }
                if (SearchSettingView.this.f77319U0.m92677nJ() || SearchSettingView.this.f77319U0.m92681pJ() || AbstractC23216t1.m119643h(SearchSettingView.this.f77319U0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.eg0
                    @Override // me0.AbstractC23216t1.d
                    /* renamed from: a */
                    public final void mo68088a(String str) {
                        SearchSettingView.C15008e.m83983f(str);
                    }
                })) {
                    return;
                }
                ToastUtils.m89263k(c20096c);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            final boolean z11;
            final boolean z12;
            final boolean z13;
            try {
                synchronized (SearchSettingView.this.f77327c1) {
                    SearchSettingView searchSettingView = SearchSettingView.this;
                    searchSettingView.f77328d1 = false;
                    searchSettingView.f77319U0.mo49315c4();
                }
                if (obj != null) {
                    JSONObject jSONObject = (JSONObject) obj;
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    if (jSONObject.optInt("error_code", -999) == 0 && optJSONObject != null) {
                        boolean optBoolean = optJSONObject.optBoolean("isset_pwd");
                        AbstractC23304d.f113346X0 = optBoolean ? 1 : 0;
                        AbstractC23309i.m122550wp(optBoolean ? 1 : 0);
                        if (optJSONObject.optInt("allow_change_phonenumber", 0) == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (optJSONObject.optInt("unmap_profile", 0) == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (optJSONObject.optInt("bypass_verify_pwd", 0) == 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        final JSONArray optJSONArray = optJSONObject.optJSONArray("valid_error");
                        if (SearchSettingView.this.f77319U0.m92676n2() != null) {
                            SearchSettingView.this.f77319U0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.fg0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    SearchSettingView.C15008e.this.m83982e(z11, z12, z13, optJSONArray);
                                }
                            });
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchSettingView$f */
    /* loaded from: classes6.dex */
    public class C15009f implements InterfaceC20094a {

        /* renamed from: com.zing.zalo.ui.zviews.SearchSettingView$f$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f77340a;

            a(ContactProfile contactProfile) {
                this.f77340a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42221O7(this.f77340a, true);
            }
        }

        C15009f() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            SearchSettingView.this.f77319U0.mo78960q3();
            ToastUtils.m89264l(new C20096c(ZMediaPlayer.ZPLAYER_UNSUPPORTED_PROTOCOL, ""));
            SearchSettingView.this.f77330f1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            if (obj != null) {
                try {
                    try {
                        SearchSettingView.this.f77329e1 = new ContactProfile((JSONObject) obj);
                        SearchSettingView.this.f77329e1.f42330D = System.currentTimeMillis();
                        ContactProfile contactProfile = SearchSettingView.this.f77329e1;
                        if (contactProfile != null) {
                            C0824j.m2153b(new a(contactProfile));
                            SearchSettingView.this.m83977sM(Integer.parseInt(AbstractC23306f.m120583H().m110204g().m116322n()));
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122776f("SearchSettingView", e11);
                    }
                } finally {
                    SearchSettingView.this.f77330f1 = false;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchSettingView$g */
    /* loaded from: classes6.dex */
    public class C15010g implements InterfaceC20094a {

        /* renamed from: com.zing.zalo.ui.zviews.SearchSettingView$g$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f77343a;

            a(ContactProfile contactProfile) {
                this.f77343a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42349b8(this.f77343a);
            }
        }

        C15010g() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            SearchSettingView searchSettingView;
            try {
                try {
                    ToastUtils.m89264l(c20096c);
                    searchSettingView = SearchSettingView.this;
                    searchSettingView.f77331g1 = false;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    SearchSettingView.this.f77331g1 = false;
                    searchSettingView = SearchSettingView.this;
                }
                searchSettingView.f77319U0.mo78960q3();
            } catch (Throwable th2) {
                SearchSettingView searchSettingView2 = SearchSettingView.this;
                searchSettingView2.f77331g1 = false;
                searchSettingView2.f77319U0.mo78960q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            ContactProfile contactProfile;
            String str;
            String str2;
            int i11;
            JSONObject optJSONObject;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("error_code") && jSONObject.has("data") && Integer.parseInt(jSONObject.getString("error_code")) == 0 && (contactProfile = SearchSettingView.this.f77329e1) != null) {
                        if (jSONObject.has("data") && !jSONObject.isNull("data") && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                            i11 = optJSONObject.optInt("action", 0);
                            str = optJSONObject.optString("alias");
                            str2 = optJSONObject.optString("desc");
                        } else {
                            str = "";
                            str2 = "";
                            i11 = 0;
                        }
                        int i12 = SearchSettingView.this.f77329e1.f42352K0;
                        contactProfile.f42447v0 = i12;
                        contactProfile.f42352K0 = i12;
                        contactProfile.f42441t0 = true;
                        contactProfile.f42456y0 = i11;
                        if (!TextUtils.isEmpty(str)) {
                            contactProfile.f42442t1 = str;
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            contactProfile.f42436r1 = new SpannableStringBuilder(str2);
                        }
                        if (C21927m.m114302u().m114357s() != null) {
                            if (!C21927m.m114302u().m114357s().m153137g(AbstractC23306f.m120583H().m110204g().m116322n())) {
                                C21927m.m114302u().m114357s().add(contactProfile);
                                C0824j.m2153b(new a(contactProfile));
                            } else if (C21927m.m114302u().m114357s().m153138j(AbstractC23306f.m120583H().m110204g().m116322n()) != null) {
                                contactProfile = C21927m.m114302u().m114357s().m153138j(AbstractC23306f.m120583H().m110204g().m116322n());
                                contactProfile.f42456y0 = i11;
                                if (!TextUtils.isEmpty(str)) {
                                    contactProfile.f42442t1 = str;
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    contactProfile.f42436r1 = new SpannableStringBuilder(str2);
                                }
                            }
                        }
                        Map map = AbstractC23304d.f113405l;
                        C31965ic c31965ic = (C31965ic) map.get(CoreUtility.f89233i);
                        if (c31965ic != null) {
                            ((C31965ic) map.get(CoreUtility.f89233i)).m153684d(c31965ic.m153681a() + 1);
                        }
                        C28203u6.f131407a.m141806D(AbstractC23306f.m120583H().m110204g().m116322n(), false);
                        if (!TextUtils.isEmpty(contactProfile.f42434r)) {
                            AbstractC23181q.m119431d(contactProfile.f42434r, true);
                        }
                        SearchSettingView.this.m83979uM();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                SearchSettingView searchSettingView = SearchSettingView.this;
                searchSettingView.f77331g1 = false;
                searchSettingView.f77319U0.mo78960q3();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SearchSettingView$h */
    /* loaded from: classes6.dex */
    public static class C15011h {

        /* renamed from: a */
        public boolean f77345a = false;

        /* renamed from: a */
        public boolean m83984a() {
            return this.f77345a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SearchSettingView$i */
    /* loaded from: classes6.dex */
    public class C15012i extends AbstractC0857z0 {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.zviews.SearchSettingView$i$a */
        /* loaded from: classes6.dex */
        public class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ int f77347a;

            a(int i11) {
                this.f77347a = i11;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42386f4(String.valueOf(this.f77347a));
            }
        }

        public C15012i() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // ag0.AbstractC0857z0
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public ArrayList mo2432g(Void... voidArr) {
            ArrayList arrayList = new ArrayList();
            AbstractC23148n.m118838l();
            ArrayList m42141H6 = C7960e.m41971c6().m42141H6();
            C32178x9 c32178x9 = new C32178x9(-1);
            c32178x9.f148385s = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_recent_searches);
            if (m42141H6 != null && !m42141H6.isEmpty()) {
                arrayList.add(c32178x9);
                Iterator it = m42141H6.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    C32178x9 c32178x92 = (C32178x9) it.next();
                    if (C23024b7.m118030B(c32178x92.f148384r)) {
                        C0824j.m2153b(new a(c32178x92.f148384r));
                    } else {
                        for (int i12 = 0; i12 < AbstractC23304d.f113372d.size(); i12++) {
                            if (AbstractC23304d.f113372d.get(i12) != 0 && c32178x92.f148384r == ((C32178x9) AbstractC23304d.f113372d.get(i12)).f148384r) {
                                C32178x9 c32178x93 = new C32178x9(((C32178x9) AbstractC23304d.f113372d.get(i12)).f148384r);
                                c32178x93.f148388v = ((C32178x9) AbstractC23304d.f113372d.get(i12)).f148388v;
                                c32178x93.f148389w = ((C32178x9) AbstractC23304d.f113372d.get(i12)).f148389w;
                                c32178x93.f148390x = ((C32178x9) AbstractC23304d.f113372d.get(i12)).f148390x;
                                c32178x93.f148391y = ((C32178x9) AbstractC23304d.f113372d.get(i12)).f148391y;
                                c32178x93.f148392z = ((C32178x9) AbstractC23304d.f113372d.get(i12)).f148392z;
                                c32178x93.f148376E = ((C32178x9) AbstractC23304d.f113372d.get(i12)).f148376E;
                                c32178x93.f148379H = true;
                                c32178x93.f148378G = true;
                                int i13 = c32178x93.f148388v;
                                if (i13 == AbstractC8020f0.str_title_website_app) {
                                    c32178x93.f148385s = AbstractC23136l9.m118746s0(i13, AbstractC23306f.m120583H().m110204g().m116324p());
                                } else if (i13 == AbstractC8020f0.str_title_email_app) {
                                    c32178x93.f148385s = AbstractC23136l9.m118746s0(i13, AbstractC23306f.m120583H().m110204g().m116316h());
                                } else if (i13 == AbstractC8020f0.str_zcloud_branding) {
                                    c32178x93.f148385s = AbstractC23136l9.m118746s0(i13, C16805b.m89786h().m89800f());
                                } else {
                                    c32178x93.f148385s = AbstractC23136l9.m118675S(new Locale(AbstractC18458a.f93019a), c32178x93.f148388v);
                                }
                                arrayList.add(c32178x93);
                                i11++;
                            }
                        }
                    }
                }
                if (i11 == 0 && arrayList.size() == 1) {
                    arrayList.remove(0);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ag0.AbstractC0857z0
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public void mo2438n(ArrayList arrayList) {
            try {
                SearchSettingView searchSettingView = SearchSettingView.this;
                searchSettingView.f77321W0 = arrayList;
                EditText editText = searchSettingView.f77316R0;
                if (editText != null && TextUtils.isEmpty(editText.getText().toString().trim())) {
                    SearchSettingView.this.m83957HM(false, null);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SearchSettingView$j */
    /* loaded from: classes6.dex */
    public class C15013j extends Thread {

        /* renamed from: p */
        final String f77349p;

        /* renamed from: q */
        ArrayList f77350q;

        /* renamed from: r */
        C15011h f77351r;

        public C15013j(String str) {
            super("Z:SearchSetting-Search");
            this.f77350q = new ArrayList();
            this.f77351r = new C15011h();
            this.f77349p = str;
            start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m83989e() {
            try {
                EditText editText = SearchSettingView.this.f77316R0;
                if (editText != null && TextUtils.isEmpty(editText.getText().toString())) {
                    SearchSettingView.this.m83957HM(false, new ArrayList());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m83990f() {
            try {
                EditText editText = SearchSettingView.this.f77316R0;
                if (editText != null && this.f77349p.equals(editText.getText().toString())) {
                    SearchSettingView.this.m83957HM(false, this.f77350q);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: c */
        public void m83991c() {
            this.f77351r.f77345a = true;
        }

        /* renamed from: d */
        int m83992d(String str) {
            ArrayList arrayList = new ArrayList();
            SearchSettingView.this.m83974IM(str, arrayList, this.f77351r);
            if (!arrayList.isEmpty()) {
                HashSet hashSet = new HashSet();
                int i11 = ((C32178x9) arrayList.get(0)).f148383q;
                hashSet.add(Integer.valueOf(i11));
                while (i11 > 0) {
                    Iterator it = arrayList.iterator();
                    boolean z11 = true;
                    while (it.hasNext()) {
                        C32178x9 c32178x9 = (C32178x9) it.next();
                        if (c32178x9.f148383q == i11) {
                            this.f77350q.add(c32178x9);
                            if (z11) {
                                c32178x9.f148390x = AbstractC23148n.m118831e(i11);
                                z11 = false;
                            } else {
                                c32178x9.f148390x = 0;
                            }
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            C32178x9 c32178x92 = (C32178x9) it2.next();
                            if (!hashSet.contains(Integer.valueOf(c32178x92.f148383q))) {
                                i11 = c32178x92.f148383q;
                                hashSet.add(Integer.valueOf(i11));
                                break;
                            }
                        } else {
                            i11 = -1;
                            break;
                        }
                    }
                }
                if (this.f77350q.size() > 0) {
                    ArrayList arrayList2 = this.f77350q;
                    ((C32178x9) arrayList2.get(arrayList2.size() - 1)).f148379H = false;
                }
            }
            return 1;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SearchTask=");
                sb2.append(this.f77349p);
                if (TextUtils.isEmpty(this.f77349p)) {
                    SearchSettingView.this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.gg0
                        @Override // java.lang.Runnable
                        public final void run() {
                            SearchSettingView.C15013j.this.m83989e();
                        }
                    });
                } else {
                    new ArrayList();
                    AbstractC23148n.m118838l();
                    m83992d(this.f77349p);
                    SearchSettingView.this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.hg0
                        @Override // java.lang.Runnable
                        public final void run() {
                            SearchSettingView.C15013j.this.m83990f();
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public static /* synthetic */ C24848g0 m83950AM() {
        C26626l.m136687v().m136709x(true);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public /* synthetic */ C24848g0 m83951BM() {
        this.f77319U0.m92662fJ().m93069k2(ZCloudHomeView.class, new Bundle(), 1, true);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public /* synthetic */ void m83952CM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putInt("password_mode", 1);
        this.f77319U0.m92662fJ().m93069k2(ChangePasswordView.class, bundle, 1, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public /* synthetic */ void m83953DM(View view) {
        AbstractC2379w.m12432f(this.f77316R0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public /* synthetic */ boolean m83954EM(TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 3) {
            if (keyEvent != null) {
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        AbstractC2379w.m12430d(this.f77316R0);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public /* synthetic */ void m83955FM() {
        EditText editText;
        if (!this.f77319U0.m92677nJ() && !this.f77319U0.m92681pJ() && (editText = this.f77316R0) != null) {
            AbstractC2379w.m12432f(editText);
        }
    }

    /* renamed from: GM */
    private void m83956GM() {
        C26626l.m136687v().m136705k0(new InterfaceC18505l() { // from class: com.zing.zalo.ui.zviews.ag0
            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public final Object mo205i9(Object obj) {
                C24848g0 m83972yM;
                m83972yM = SearchSettingView.this.m83972yM((Long) obj);
                return m83972yM;
            }
        }, new InterfaceC18494a() { // from class: com.zing.zalo.ui.zviews.bg0
            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public final Object mo12V4() {
                C24848g0 m83973zM;
                m83973zM = SearchSettingView.m83973zM();
                return m83973zM;
            }
        }, new InterfaceC18494a() { // from class: com.zing.zalo.ui.zviews.cg0
            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public final Object mo12V4() {
                C24848g0 m83950AM;
                m83950AM = SearchSettingView.m83950AM();
                return m83950AM;
            }
        }, new InterfaceC18494a() { // from class: com.zing.zalo.ui.zviews.dg0
            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public final Object mo12V4() {
                C24848g0 m83951BM;
                m83951BM = SearchSettingView.this.m83951BM();
                return m83951BM;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public void m83957HM(boolean z11, ArrayList arrayList) {
        try {
            if (z11) {
                this.f77322X0 = 0;
            } else {
                EditText editText = this.f77316R0;
                if (editText != null && TextUtils.isEmpty(editText.getText().toString())) {
                    ArrayList arrayList2 = this.f77321W0;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        this.f77322X0 = 1;
                        C7251w6 c7251w6 = this.f77318T0;
                        if (c7251w6 != null) {
                            c7251w6.m36962P(this.f77321W0);
                        }
                    } else {
                        this.f77318T0.m36962P(new ArrayList());
                        this.f77322X0 = 3;
                    }
                } else if (arrayList != null && !arrayList.isEmpty()) {
                    this.f77322X0 = 2;
                    C7251w6 c7251w62 = this.f77318T0;
                    if (c7251w62 != null) {
                        c7251w62.m36962P(arrayList);
                    }
                } else if (arrayList != null && arrayList.isEmpty()) {
                    this.f77318T0.m36962P(new ArrayList());
                    this.f77322X0 = 3;
                }
            }
            int i11 = this.f77322X0;
            if (i11 != 0) {
                if (i11 != 1 && i11 != 2) {
                    if (i11 == 3) {
                        this.f77314P0.setVisibility(8);
                        this.f77315Q0.setVisibility(0);
                        this.f77315Q0.setState(MultiStateView.EnumC15914e.EMPTY);
                        EditText editText2 = this.f77316R0;
                        if (editText2 != null && !TextUtils.isEmpty(editText2.getText().toString().trim())) {
                            this.f77315Q0.setEmptyViewString(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_search_result_not_found));
                            return;
                        } else {
                            this.f77315Q0.setEmptyViewString(AbstractC23136l9.m118746s0(AbstractC8020f0.setting_search_empty_recent, AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_setting_private), AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_account_title), AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_notification_title)));
                            return;
                        }
                    }
                    return;
                }
                this.f77314P0.setVisibility(0);
                this.f77315Q0.setVisibility(8);
                return;
            }
            this.f77314P0.setVisibility(8);
            this.f77315Q0.setVisibility(0);
            this.f77315Q0.setState(MultiStateView.EnumC15914e.LOADING);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: vM */
    private void m83969vM(View view) {
        this.f77314P0 = (RecyclerView) view.findViewById(AbstractC6918a0.ss_recyclerview);
        MultiStateView multiStateView = (MultiStateView) view.findViewById(AbstractC6918a0.ss_multi_state_layout);
        this.f77315Q0 = multiStateView;
        multiStateView.setEnableBtnEmpty(false);
        this.f77315Q0.setEnableLoadingText(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public /* synthetic */ void m83970wM() {
        m83957HM(false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public /* synthetic */ void m83971xM(RecyclerView recyclerView, int i11, View view) {
        C32178x9 m36958L;
        C32178x9 c32178x9;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onItemClicked, position=");
        sb2.append(i11);
        try {
            C7251w6 c7251w6 = this.f77318T0;
            if (c7251w6 != null && (m36958L = c7251w6.m36958L(i11)) != null && m36958L.f148384r > 0) {
                C0824j.m2153b(new C15006c(m36958L));
                Bundle bundle = new Bundle();
                C32178x9 c32178x92 = m36958L;
                switch (m36958L.f148384r) {
                    case 1:
                        this.f77319U0.m92662fJ().m93069k2(SettingPrivateV2View.class, bundle, 1, true);
                        C32017m4.m154326S().m154359e0("37000");
                        break;
                    case 2:
                        this.f77319U0.m92662fJ().m93069k2(SettingAccountAndSecurityV2View.class, bundle, 1, true);
                        C32017m4.m154326S().m154359e0("37100");
                        break;
                    case 3:
                        C22438j.m115953v(this.f77319U0.m92662fJ(), null);
                        AbstractC23647d.m123906p("37802");
                        AbstractC23647d.m123893c();
                        break;
                    case 4:
                        this.f77319U0.m92662fJ().m93069k2(SettingNotificationV2View.class, bundle, 1, true);
                        AbstractC23647d.m123906p("37200");
                        AbstractC23647d.m123893c();
                        break;
                    case 5:
                        this.f77319U0.m92662fJ().m93069k2(SettingMessageV2View.class, bundle, 1, true);
                        AbstractC23647d.m123906p("37300");
                        AbstractC23647d.m123893c();
                        break;
                    case 6:
                        this.f77319U0.m92662fJ().m93069k2(SettingCallV2View.class, bundle, 1, true);
                        AbstractC23647d.m123906p("37900");
                        AbstractC23647d.m123893c();
                        break;
                    case 7:
                        this.f77319U0.m92662fJ().m93069k2(SettingTimelineV2View.class, bundle, 1, true);
                        AbstractC23647d.m123906p("37400");
                        AbstractC23647d.m123893c();
                        break;
                    case 8:
                        this.f77319U0.m92662fJ().m93069k2(SettingContactView.class, null, 1, true);
                        AbstractC23647d.m123906p("37500");
                        AbstractC23647d.m123893c();
                        break;
                    case 9:
                        this.f77319U0.m92662fJ().m93069k2(SettingThemeV2View.class, bundle, 1, true);
                        AbstractC23647d.m123906p("37600");
                        AbstractC23647d.m123893c();
                        break;
                    case 10:
                        this.f77319U0.m92662fJ().m93069k2(AboutView.class, bundle, 1, true);
                        AbstractC23647d.m123906p("37700");
                        AbstractC23647d.m123893c();
                        break;
                    case 11:
                        this.f77319U0.m92676n2().mo35573l4(SwitchAccountView.class, null, 1, true);
                        break;
                    case 12:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 48);
                        this.f77319U0.m92676n2().mo35573l4(SettingV2View.class, bundle, 1, true);
                        break;
                    case 13:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 77);
                        this.f77319U0.m92662fJ().m93069k2(SettingContactView.class, bundle, 1, true);
                        break;
                    case 14:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 102);
                        this.f77319U0.m92662fJ().m93069k2(SettingContactView.class, bundle, 1, true);
                        break;
                    case 15:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 28);
                        this.f77319U0.m92662fJ().m93069k2(SettingContactView.class, bundle, 1, true);
                        break;
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 24);
                        this.f77319U0.m92662fJ().m93069k2(SettingPrivateV2View.class, bundle, 1, true);
                        break;
                    case 17:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 49);
                        this.f77319U0.m92662fJ().m93069k2(SettingPrivateV2View.class, bundle, 1, true);
                        break;
                    case 18:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 5);
                        this.f77319U0.m92662fJ().m93069k2(SettingPrivateV2View.class, bundle, 1, true);
                        break;
                    case 19:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 23);
                        this.f77319U0.m92662fJ().m93069k2(SettingPrivateV2View.class, bundle, 1, true);
                        break;
                    case 20:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 6);
                        this.f77319U0.m92662fJ().m93069k2(SettingFeedPrivacyView.class, bundle, 1, true);
                        break;
                    case 21:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 7);
                        this.f77319U0.m92662fJ().m93069k2(SettingFeedPrivacyView.class, bundle, 1, true);
                        break;
                    case 22:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 8);
                        this.f77319U0.m92662fJ().m93069k2(SettingFeedPrivacyView.class, bundle, 1, true);
                        break;
                    case 23:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 25);
                        this.f77319U0.m92662fJ().m93069k2(SettingPrivateV2View.class, bundle, 1, true);
                        break;
                    case 24:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 9);
                        this.f77319U0.m92662fJ().m93069k2(SettingPrivateV2View.class, bundle, 1, true);
                        break;
                    case 25:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 53);
                        this.f77319U0.m92662fJ().m93069k2(SettingAccountAndSecurityV2View.class, bundle, 1, true);
                        break;
                    case 26:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 51);
                        this.f77319U0.m92662fJ().m93069k2(SettingAccountAndSecurityV2View.class, bundle, 1, true);
                        break;
                    case 27:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 54);
                        this.f77319U0.m92662fJ().m93069k2(SettingAccountAndSecurityV2View.class, bundle, 1, true);
                        break;
                    case 28:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 55);
                        this.f77319U0.m92662fJ().m93069k2(SettingAccountAndSecurityV2View.class, bundle, 1, true);
                        break;
                    case 29:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 90);
                        this.f77319U0.m92662fJ().m93069k2(SettingPrivateV2View.class, bundle, 1, true);
                        break;
                    case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                        this.f77319U0.m92676n2().mo35573l4(SwitchAccountView.class, null, 1, true);
                        break;
                    case 31:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 57);
                        this.f77319U0.m92662fJ().m93069k2(SettingAccountAndSecurityV2View.class, bundle, 1, true);
                        break;
                    case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 52);
                        this.f77319U0.m92662fJ().m93069k2(SettingAccountAndSecurityV2View.class, bundle, 1, true);
                        break;
                    case 37:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 10);
                        this.f77319U0.m92662fJ().m93069k2(SettingNotificationV2View.class, bundle, 1, true);
                        break;
                    case 38:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 11);
                        this.f77319U0.m92662fJ().m93069k2(SettingNotificationV2View.class, bundle, 1, true);
                        break;
                    case 39:
                        this.f77319U0.m92662fJ().m93069k2(SettingGroupView.class, null, 1, true);
                        break;
                    case 40:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 62);
                        this.f77319U0.m92662fJ().m93069k2(SettingNotificationV2View.class, bundle, 1, true);
                        break;
                    case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 12);
                        this.f77319U0.m92662fJ().m93069k2(SettingNotificationV2View.class, bundle, 1, true);
                        break;
                    case 42:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 13);
                        this.f77319U0.m92662fJ().m93069k2(SettingNotificationV2View.class, bundle, 1, true);
                        break;
                    case 43:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 14);
                        this.f77319U0.m92662fJ().m93069k2(SettingNotificationV2View.class, bundle, 1, true);
                        break;
                    case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 63);
                        this.f77319U0.m92662fJ().m93069k2(SettingNotificationV2View.class, bundle, 1, true);
                        break;
                    case 45:
                        Intent intent = new Intent();
                        if (Build.VERSION.SDK_INT >= 26) {
                            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                            intent.putExtra("android.provider.extra.APP_PACKAGE", MainApplication.getAppContext().getPackageName());
                        } else {
                            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                            intent.putExtra("app_package", MainApplication.getAppContext().getPackageName());
                            intent.putExtra("app_uid", MainApplication.getAppContext().getApplicationInfo().uid);
                        }
                        m92676n2().startActivity(intent);
                        break;
                    case 46:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 15);
                        this.f77319U0.m92662fJ().m93069k2(SettingMessageV2View.class, bundle, 1, true);
                        break;
                    case 47:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 22);
                        this.f77319U0.m92662fJ().m93069k2(SettingMessageV2View.class, bundle, 1, true);
                        break;
                    case 48:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 16);
                        this.f77319U0.m92662fJ().m93069k2(SettingMessageV2View.class, bundle, 1, true);
                        break;
                    case 49:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 92);
                        this.f77319U0.m92662fJ().m93069k2(SettingMessageV2View.class, bundle, 1, true);
                        break;
                    case 50:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 67);
                        this.f77319U0.m92662fJ().m93069k2(SettingMessageV2View.class, bundle, 1, true);
                        break;
                    case 51:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 68);
                        this.f77319U0.m92662fJ().m93069k2(SettingBlockAndHideView.class, bundle, 1, true);
                        break;
                    case 52:
                        this.f77319U0.m92662fJ().m93069k2(SettingHiddenChatView.class, null, 1, true);
                        break;
                    case 53:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 20);
                        this.f77319U0.m92662fJ().m93069k2(SettingCallV2View.class, bundle, 1, true);
                        break;
                    case 54:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 94);
                        this.f77319U0.m92662fJ().m93069k2(SettingCallV2View.class, bundle, 1, true);
                        break;
                    case 55:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 95);
                        this.f77319U0.m92662fJ().m93069k2(SettingCallV2View.class, bundle, 1, true);
                        break;
                    case 56:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 149);
                        this.f77319U0.m92662fJ().m93069k2(SettingCallV2View.class, bundle, 1, true);
                        break;
                    case 57:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 73);
                        this.f77319U0.m92662fJ().m93069k2(SettingTimelineV2View.class, bundle, 1, true);
                        break;
                    case 58:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 103);
                        this.f77319U0.m92662fJ().m93069k2(SettingTimelineV2View.class, bundle, 1, true);
                        break;
                    case 59:
                    case 82:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 117);
                        this.f77319U0.m92662fJ().m93069k2(SettingBlockAndHideView.class, bundle, 1, true);
                        break;
                    case 60:
                    case 83:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 118);
                        this.f77319U0.m92662fJ().m93069k2(SettingBlockAndHideView.class, bundle, 1, true);
                        break;
                    case 61:
                    case 84:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 119);
                        this.f77319U0.m92662fJ().m93069k2(SettingBlockAndHideView.class, bundle, 1, true);
                        break;
                    case 62:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 79);
                        this.f77319U0.m92662fJ().m93069k2(SettingThemeV2View.class, bundle, 1, true);
                        break;
                    case 63:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 80);
                        this.f77319U0.m92662fJ().m93069k2(SettingThemeV2View.class, bundle, 1, true);
                        break;
                    case 64:
                        this.f77319U0.m92676n2().mo35579p().m93069k2(SettingFontSizeView.class, null, 1, true);
                        break;
                    case 65:
                        ZaloWebView.m87103hS(this.f77319U0.m92676n2(), AbstractC23306f.m120583H().m110204g().m116318j());
                        break;
                    case 71:
                    case 102:
                        m83976rM();
                        break;
                    case 72:
                    case 73:
                    case ZVideoUtilMetadata.FF_PROFILE_H264_MAIN /* 77 */:
                    case 78:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 78);
                        this.f77319U0.m92662fJ().m93069k2(SettingThemeV2View.class, bundle, 1, true);
                        break;
                    case 75:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 70);
                        this.f77319U0.m92662fJ().m93069k2(SettingHiddenChatView.class, bundle, 1, true);
                        break;
                    case 76:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 71);
                        this.f77319U0.m92662fJ().m93069k2(SettingHiddenChatView.class, bundle, 1, true);
                        break;
                    case 79:
                        if (C20912a.m109395e().m109405l()) {
                            this.f77319U0.m92676n2().mo35573l4(ToolStorageView.class, null, 1, true);
                        } else {
                            this.f77319U0.m92676n2().mo35573l4(StorageSummaryView.class, null, 1, true);
                        }
                        C31747a.m152721t("search_setting");
                        break;
                    case 80:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 108);
                        this.f77319U0.m92662fJ().m93069k2(SettingPrivateV2View.class, bundle, 1, true);
                        break;
                    case 81:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 114);
                        this.f77319U0.m92662fJ().m93069k2(SettingMessageV2View.class, bundle, 1, true);
                        break;
                    case 85:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 120);
                        this.f77319U0.m92662fJ().m93069k2(SettingUtilitiesView.class, bundle, 1, true);
                        break;
                    case 86:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 121);
                        this.f77319U0.m92662fJ().m93069k2(SettingAccountAndSecurityV2View.class, bundle, 1, true);
                        break;
                    case 87:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 115);
                        this.f77319U0.m92662fJ().m93069k2(SettingFeedPrivacyView.class, bundle, 1, true);
                        break;
                    case 88:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 124);
                        this.f77319U0.m92662fJ().m93069k2(SettingCallV2View.class, bundle, 1, true);
                        break;
                    case 89:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 126);
                        this.f77319U0.m92662fJ().m93069k2(SettingAccountAndSecurityV2View.class, bundle, 1, true);
                        break;
                    case 90:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 129);
                        this.f77319U0.m92662fJ().m93069k2(SettingCallV2View.class, bundle, 1, true);
                        break;
                    case 91:
                        bundle.putString("STR_SOURCE_START_VIEW", "setting");
                        this.f77319U0.m92662fJ().m93069k2(QuickMessageListingFullView.class, null, 1, true);
                        break;
                    case 92:
                        bundle.putString("STR_SOURCE_START_VIEW", "setting");
                        this.f77319U0.m92662fJ().m93069k2(AutoReplyListingView.class, null, 1, true);
                        break;
                    case 93:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 131);
                        this.f77319U0.m92662fJ().m93069k2(SettingNotificationV2View.class, bundle, 1, true);
                        break;
                    case 94:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 132);
                        this.f77319U0.m92662fJ().m93069k2(SettingNotificationV2View.class, bundle, 1, true);
                        break;
                    case 95:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 128);
                        C22438j.m115953v(this.f77319U0.m92662fJ(), bundle);
                        break;
                    case 96:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 133);
                        this.f77319U0.m92662fJ().m93069k2(SettingPrivateV2View.class, bundle, 1, true);
                        break;
                    case 97:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 134);
                        this.f77319U0.m92662fJ().m93069k2(SettingPrivateV2View.class, bundle, 1, true);
                        break;
                    case 98:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 135);
                        this.f77319U0.m92662fJ().m93069k2(SettingPrivateV2View.class, bundle, 1, true);
                        break;
                    case 99:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 0);
                        this.f77319U0.m92662fJ().m93069k2(SettingManageSourceFriendView.class, bundle, 1, true);
                        break;
                    case 100:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4);
                        this.f77319U0.m92662fJ().m93069k2(SettingManageSourceFriendView.class, bundle, 1, true);
                        break;
                    case 101:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 136);
                        this.f77319U0.m92662fJ().m93069k2(SettingUtilitiesView.class, bundle, 1, true);
                        break;
                    case 103:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 138);
                        this.f77319U0.m92662fJ().m93069k2(SettingMessageV2View.class, bundle, 1, true);
                        break;
                    case 104:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 139);
                        this.f77319U0.m92662fJ().m93069k2(SettingMessageV2View.class, bundle, 1, true);
                        break;
                    case 105:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 140);
                        this.f77319U0.m92662fJ().m93069k2(SettingMessageV2View.class, bundle, 1, true);
                        break;
                    case 106:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 93);
                        this.f77319U0.m92662fJ().m93069k2(SettingMessageV2View.class, bundle, 1, true);
                        break;
                    case 107:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 113);
                        this.f77319U0.m92662fJ().m93069k2(SettingMessageV2View.class, bundle, 1, true);
                        break;
                    case 108:
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("STR_SOURCE_START_VIEW", "setting");
                        if (this.f77319U0.m92662fJ() != null) {
                            this.f77319U0.m92662fJ().m93069k2(ManageConversationLabelSetting.class, bundle2, 1, true);
                            break;
                        }
                        break;
                    case 109:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 117);
                        this.f77319U0.m92662fJ().m93069k2(SettingTimelineV2View.class, bundle, 1, true);
                        break;
                    case ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10 /* 110 */:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 81);
                        this.f77319U0.m92662fJ().m93069k2(AboutView.class, bundle, 1, true);
                        break;
                    case 111:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 88);
                        this.f77319U0.m92662fJ().m93069k2(AboutView.class, bundle, 1, true);
                        break;
                    case 112:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 85);
                        this.f77319U0.m92662fJ().m93069k2(AboutView.class, bundle, 1, true);
                        break;
                    case 113:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 141);
                        bundle.putInt("EXTRA_SOURCE_FROM", 8);
                        this.f77319U0.m92662fJ().m93069k2(SettingTimelineV2View.class, bundle, 1, true);
                        break;
                    case 114:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 143);
                        this.f77319U0.m92662fJ().m93069k2(SettingUtilitiesView.class, bundle, 1, true);
                        break;
                    case 115:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444);
                        this.f77319U0.m92662fJ().m93069k2(SettingAccountAndSecurityV2View.class, bundle, 1, true);
                        break;
                    case 116:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP);
                        this.f77319U0.m92662fJ().m93069k2(SettingBirthday.class, bundle, 1, true);
                        break;
                    case 117:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 141);
                        this.f77319U0.m92662fJ().m93069k2(SettingBlockAndHideView.class, bundle, 1, true);
                        break;
                    case 119:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 147);
                        this.f77319U0.m92662fJ().m93069k2(SettingBirthday.class, bundle, 1, true);
                        break;
                    case 120:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 148);
                        this.f77319U0.m92662fJ().m93069k2(SettingAccountAndSecurityV2View.class, bundle, 1, true);
                        break;
                    case 123:
                        bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 125);
                        m83956GM();
                        break;
                }
                if (this.f77321W0.isEmpty()) {
                    C32178x9 c32178x93 = new C32178x9(-1);
                    c32178x93.f148385s = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_recent_searches);
                    this.f77321W0.add(c32178x93);
                }
                int i12 = 0;
                while (true) {
                    if (i12 < this.f77321W0.size()) {
                        c32178x9 = c32178x92;
                        if (((C32178x9) this.f77321W0.get(i12)).f148384r == c32178x9.f148384r) {
                            this.f77321W0.remove(i12);
                        } else {
                            i12++;
                            c32178x92 = c32178x9;
                        }
                    } else {
                        c32178x9 = c32178x92;
                    }
                }
                C32178x9 m155171f = C32178x9.m155171f(c32178x9);
                m155171f.f148378G = true;
                m155171f.f148379H = true;
                this.f77321W0.add(1, m155171f);
                if (this.f77321W0.size() > 6) {
                    ArrayList arrayList = this.f77321W0;
                    arrayList.remove(arrayList.size() - 1);
                }
                EditText editText = this.f77316R0;
                if (editText == null || TextUtils.isEmpty(editText.getText())) {
                    this.f77316R0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.zf0
                        @Override // java.lang.Runnable
                        public final void run() {
                            SearchSettingView.this.m83970wM();
                        }
                    }, 300L);
                    AbstractC23647d.m123897g("800001");
                    C0815e1.m2079N(c32178x9.f148392z, 2, 0, i11, this.f77318T0.mo10003k() - 1);
                } else if (this.f77318T0 != null) {
                    int i13 = i11 + 1;
                    AbstractC23647d.m123897g(String.format("8%03d%02d%02d%02d", Integer.valueOf(c32178x9.f148392z), Integer.valueOf(this.f77316R0.length()), Integer.valueOf(i13), Integer.valueOf(this.f77318T0.mo10003k())));
                    C0815e1.m2079N(c32178x9.f148392z, 2, this.f77316R0.length(), i13, this.f77318T0.mo10003k());
                }
            }
            EditText editText2 = this.f77316R0;
            if (editText2 != null) {
                editText2.clearFocus();
                AbstractC2379w.m12430d(this.f77316R0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public /* synthetic */ C24848g0 m83972yM(Long l11) {
        C26626l.m136687v().m136699U(this.f77319U0.m92662fJ(), null, l11.longValue(), true);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public static /* synthetic */ C24848g0 m83973zM() {
        C22438j.m115954w(C13958c.b.f71928t);
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                return null;
            }
            C8009j.a aVar = new C8009j.a(this.f77319U0.m92648SI());
            View inflate = LayoutInflater.from(this.f77319U0.getContext()).inflate(AbstractC7409c0.content_dialog_unmap, (ViewGroup) null, false);
            aVar.m43177z(inflate);
            if (!TextUtils.isEmpty(this.f77324Z0)) {
                ((TextView) inflate.findViewById(AbstractC6918a0.tvContent)).setText(this.f77324Z0);
            }
            inflate.findViewById(AbstractC6918a0.btn_close).setOnClickListener(this);
            inflate.findViewById(AbstractC6918a0.btn_change_phone).setOnClickListener(this);
            inflate.findViewById(AbstractC6918a0.see_more).setOnClickListener(this);
            return aVar.m43152a();
        }
        C8009j.a aVar2 = new C8009j.a(this.f77319U0.m92648SI());
        aVar2.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_deactive_account)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.wf0
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                SearchSettingView.this.m83952CM(interfaceC17463d, i12);
            }
        });
        return aVar2.m43152a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.search_setting_view, viewGroup, false);
        m83969vM(inflate);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ae A[Catch: all -> 0x0044, Exception -> 0x0049, TRY_LEAVE, TryCatch #4 {Exception -> 0x0049, all -> 0x0044, blocks: (B:3:0x0008, B:4:0x0028, B:6:0x002e, B:9:0x004f, B:12:0x0059, B:15:0x005f, B:20:0x0082, B:25:0x009a, B:27:0x00b9, B:29:0x00bf, B:31:0x00c3, B:35:0x0190, B:39:0x01ae, B:113:0x00cf, B:116:0x00d4, B:118:0x00d9, B:120:0x00df, B:123:0x0177, B:124:0x0112, B:126:0x0118, B:127:0x0146, B:129:0x014a, B:132:0x017f), top: B:2:0x0008 }] */
    /* renamed from: IM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m83974IM(String str, ArrayList arrayList, C15011h c15011h) {
        long j11;
        StringBuilder sb2;
        int i11;
        String[] strArr;
        int i12;
        String[] strArr2;
        int i13;
        String[] strArr3;
        int i14;
        C32178x9 c32178x9;
        ArrayList arrayList2;
        String str2;
        String str3;
        String str4;
        ContactProfile contactProfile;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                Map synchronizedMap = Collections.synchronizedMap(new HashMap());
                ArrayList arrayList3 = new ArrayList();
                String[] stringArray = this.f77319U0.m92651WI().getStringArray(AbstractC16775v.array_language_as_code);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C32178x9 c32178x92 = (C32178x9) it.next();
                    synchronizedMap.put(String.valueOf(c32178x92.f148384r), String.valueOf(c32178x92.f148384r));
                }
                int i15 = 0;
                while (i15 < AbstractC23304d.f113372d.size()) {
                    if (c15011h != null && c15011h.m83984a()) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("hello   Cancel .......: ");
                        sb3.append(System.currentTimeMillis() - currentTimeMillis);
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("hello: ");
                        sb4.append(System.currentTimeMillis() - currentTimeMillis);
                        return;
                    }
                    if (!C23024b7.m118030B(((C32178x9) AbstractC23304d.f113372d.get(i15)).f148384r)) {
                        C32178x9 m155171f = C32178x9.m155171f((C32178x9) AbstractC23304d.f113372d.get(i15));
                        ContactProfile contactProfile2 = new ContactProfile(String.valueOf(m155171f.f148384r));
                        if (!TextUtils.isEmpty(contactProfile2.f42434r)) {
                            int i16 = m155171f.f148388v;
                            if (i16 != AbstractC8020f0.str_title_website_app) {
                                if (i16 != AbstractC8020f0.str_title_email_app) {
                                    if (i16 == AbstractC8020f0.str_zcloud_branding) {
                                    }
                                    i11 = i15;
                                    strArr = stringArray;
                                    String str5 = (String) m155171f.f148376E.get(AbstractC18458a.f93019a);
                                    contactProfile2.f42437s = str5;
                                    m155171f.f148385s = str5;
                                    if (synchronizedMap.containsKey(contactProfile2.f42434r)) {
                                        i13 = i11;
                                        strArr3 = strArr;
                                        j11 = currentTimeMillis;
                                    } else {
                                        contactProfile2.f42405d1 = false;
                                        contactProfile2.f42387W = 0.0f;
                                        String[] m119971F = AbstractC23262x6.m119971F(contactProfile2.f42437s, false);
                                        arrayList3.clear();
                                        ArrayList arrayList4 = new ArrayList();
                                        i13 = i11;
                                        String[] strArr4 = strArr;
                                        j11 = currentTimeMillis;
                                        boolean z11 = false;
                                        try {
                                            AbstractC23262x6.m119998k(str, m119971F, contactProfile2, arrayList3, false, false, arrayList4, false, false);
                                            StringBuilder sb5 = new StringBuilder();
                                            ContactProfile contactProfile3 = contactProfile2;
                                            String str6 = "Total: ";
                                            String str7 = " - ";
                                            String str8 = ": ";
                                            float f11 = 0.0f;
                                            if (contactProfile3.f42387W > 0.0f && !synchronizedMap.containsKey(contactProfile3.f42434r)) {
                                                if (AbstractC23210s6.f112470b) {
                                                    int i17 = 0;
                                                    while (i17 < arrayList4.size()) {
                                                        ArrayList arrayList5 = arrayList4;
                                                        f11 += ((Float) arrayList5.get(i17)).floatValue();
                                                        sb5.append(i17);
                                                        sb5.append(": ");
                                                        sb5.append(arrayList5.get(i17));
                                                        sb5.append(" - ");
                                                        i17++;
                                                        arrayList4 = arrayList5;
                                                    }
                                                    sb5.append("Total: ");
                                                    sb5.append(f11);
                                                    sb5.append(" - priority: ");
                                                    sb5.append(contactProfile3.f42387W);
                                                }
                                                m155171f.f148377F.clear();
                                                int size = arrayList3.size();
                                                for (int i18 = 0; i18 < size; i18++) {
                                                    m155171f.f148377F.add(Integer.valueOf(((Integer) arrayList3.get(i18)).intValue()));
                                                }
                                                arrayList3.clear();
                                                if (AbstractC23210s6.f112470b) {
                                                    contactProfile3.m40401d1(sb5.toString());
                                                }
                                                m155171f.f148379H = true;
                                                if (AbstractC23210s6.f112470b) {
                                                    m155171f.f148374C = sb5.toString();
                                                }
                                                m155171f.f148375D = contactProfile3.f42387W;
                                                arrayList.add(m155171f);
                                                String str9 = contactProfile3.f42434r;
                                                synchronizedMap.put(str9, str9);
                                                strArr3 = strArr4;
                                            } else {
                                                ArrayList arrayList6 = arrayList4;
                                                C32178x9 c32178x93 = m155171f;
                                                int i19 = 0;
                                                while (true) {
                                                    if (i19 >= strArr4.length) {
                                                        strArr3 = strArr4;
                                                        break;
                                                    }
                                                    if (!strArr4[i19].equals(AbstractC18458a.f93019a)) {
                                                        contactProfile3.f42437s = (String) c32178x93.f148376E.get(strArr4[i19]);
                                                        if (!synchronizedMap.containsKey(contactProfile3.f42434r)) {
                                                            contactProfile3.f42405d1 = z11;
                                                            contactProfile3.f42387W = 0.0f;
                                                            String[] m119971F2 = AbstractC23262x6.m119971F(contactProfile3.f42437s, z11);
                                                            arrayList3.clear();
                                                            i14 = i19;
                                                            c32178x9 = c32178x93;
                                                            ArrayList arrayList7 = arrayList6;
                                                            String str10 = str8;
                                                            String str11 = str7;
                                                            String str12 = str6;
                                                            strArr3 = strArr4;
                                                            contactProfile = contactProfile3;
                                                            AbstractC23262x6.m119998k(str, m119971F2, contactProfile3, arrayList3, false, false, arrayList7, false, false);
                                                            if (contactProfile.f42387W <= 0.0f || synchronizedMap.containsKey(contactProfile.f42434r)) {
                                                                arrayList2 = arrayList7;
                                                                str2 = str10;
                                                                str3 = str11;
                                                                str4 = str12;
                                                                str7 = str3;
                                                                str6 = str4;
                                                                contactProfile3 = contactProfile;
                                                                strArr4 = strArr3;
                                                                c32178x93 = c32178x9;
                                                                arrayList6 = arrayList2;
                                                                i19 = i14 + 1;
                                                                z11 = false;
                                                                str8 = str2;
                                                            } else {
                                                                c32178x9.f148386t = contactProfile.f42437s;
                                                                if (AbstractC23210s6.f112470b) {
                                                                    float f12 = 0.0f;
                                                                    int i21 = 0;
                                                                    while (i21 < arrayList7.size()) {
                                                                        ArrayList arrayList8 = arrayList7;
                                                                        f12 += ((Float) arrayList8.get(i21)).floatValue();
                                                                        sb5.append(i21);
                                                                        String str13 = str10;
                                                                        sb5.append(str13);
                                                                        sb5.append(arrayList8.get(i21));
                                                                        String str14 = str11;
                                                                        sb5.append(str14);
                                                                        i21++;
                                                                        arrayList7 = arrayList8;
                                                                        str10 = str13;
                                                                        str11 = str14;
                                                                    }
                                                                    sb5.append(str12);
                                                                    sb5.append(f12);
                                                                    sb5.append("priority: ");
                                                                    sb5.append(contactProfile.f42387W);
                                                                }
                                                                c32178x9.f148377F.clear();
                                                                int size2 = arrayList3.size();
                                                                for (int i22 = 0; i22 < size2; i22++) {
                                                                    c32178x9.f148377F.add(Integer.valueOf(((Integer) arrayList3.get(i22)).intValue()));
                                                                }
                                                                arrayList3.clear();
                                                                if (AbstractC23210s6.f112470b) {
                                                                    contactProfile.m40401d1(sb5.toString());
                                                                }
                                                                c32178x9.f148379H = true;
                                                                if (AbstractC23210s6.f112470b) {
                                                                    c32178x9.f148374C = sb5.toString();
                                                                }
                                                                c32178x9.f148375D = contactProfile.f42387W;
                                                                arrayList.add(c32178x9);
                                                                String str15 = contactProfile.f42434r;
                                                                synchronizedMap.put(str15, str15);
                                                            }
                                                        }
                                                    }
                                                    i14 = i19;
                                                    c32178x9 = c32178x93;
                                                    arrayList2 = arrayList6;
                                                    str2 = str8;
                                                    str3 = str7;
                                                    str4 = str6;
                                                    strArr3 = strArr4;
                                                    contactProfile = contactProfile3;
                                                    str7 = str3;
                                                    str6 = str4;
                                                    contactProfile3 = contactProfile;
                                                    strArr4 = strArr3;
                                                    c32178x93 = c32178x9;
                                                    arrayList6 = arrayList2;
                                                    i19 = i14 + 1;
                                                    z11 = false;
                                                    str8 = str2;
                                                }
                                                arrayList3.clear();
                                            }
                                        } catch (Exception e11) {
                                            e = e11;
                                            e.printStackTrace();
                                            sb2 = new StringBuilder();
                                            sb2.append("hello: ");
                                            sb2.append(System.currentTimeMillis() - j11);
                                        }
                                    }
                                    i15 = i13 + 1;
                                    currentTimeMillis = j11;
                                    stringArray = strArr3;
                                }
                            }
                            if (AbstractC23304d.f113367c != null) {
                                int i23 = 0;
                                while (true) {
                                    String[] strArr5 = AbstractC23304d.f113367c;
                                    if (i23 >= strArr5.length) {
                                        break;
                                    }
                                    int i24 = m155171f.f148388v;
                                    if (i24 == AbstractC8020f0.str_title_website_app) {
                                        i12 = i15;
                                        m155171f.f148376E.put(strArr5[i23], String.format(AbstractC23136l9.m118675S(new Locale(AbstractC23304d.f113367c[i23]), m155171f.f148388v), AbstractC23306f.m120583H().m110204g().m116324p()));
                                    } else {
                                        i12 = i15;
                                        if (i24 == AbstractC8020f0.str_title_email_app) {
                                            m155171f.f148376E.put(strArr5[i23], String.format(AbstractC23136l9.m118675S(new Locale(AbstractC23304d.f113367c[i23]), m155171f.f148388v), AbstractC23306f.m120583H().m110204g().m116316h()));
                                        } else if (i24 == AbstractC8020f0.str_zcloud_branding) {
                                            strArr2 = stringArray;
                                            m155171f.f148376E.put(AbstractC23304d.f113367c[i23], String.format(AbstractC23136l9.m118675S(new Locale(AbstractC23304d.f113367c[i23]), m155171f.f148388v), AbstractC23306f.m120633X1().m89800f()));
                                            i23++;
                                            i15 = i12;
                                            stringArray = strArr2;
                                        }
                                    }
                                    strArr2 = stringArray;
                                    i23++;
                                    i15 = i12;
                                    stringArray = strArr2;
                                }
                                i11 = i15;
                                strArr = stringArray;
                                m155171f.f148385s = (String) m155171f.f148376E.get(AbstractC18458a.f93019a);
                                String str52 = (String) m155171f.f148376E.get(AbstractC18458a.f93019a);
                                contactProfile2.f42437s = str52;
                                m155171f.f148385s = str52;
                                if (synchronizedMap.containsKey(contactProfile2.f42434r)) {
                                }
                                i15 = i13 + 1;
                                currentTimeMillis = j11;
                                stringArray = strArr3;
                            }
                            i11 = i15;
                            strArr = stringArray;
                            String str522 = (String) m155171f.f148376E.get(AbstractC18458a.f93019a);
                            contactProfile2.f42437s = str522;
                            m155171f.f148385s = str522;
                            if (synchronizedMap.containsKey(contactProfile2.f42434r)) {
                            }
                            i15 = i13 + 1;
                            currentTimeMillis = j11;
                            stringArray = strArr3;
                        }
                    }
                    j11 = currentTimeMillis;
                    i13 = i15;
                    strArr3 = stringArray;
                    i15 = i13 + 1;
                    currentTimeMillis = j11;
                    stringArray = strArr3;
                }
                j11 = currentTimeMillis;
                Collections.sort(arrayList, C32178x9.f148371K);
                sb2 = new StringBuilder();
            } catch (Exception e12) {
                e = e12;
                j11 = currentTimeMillis;
            } catch (Throwable th2) {
                th = th2;
                long j12 = currentTimeMillis;
                StringBuilder sb6 = new StringBuilder();
                sb6.append("hello: ");
                sb6.append(System.currentTimeMillis() - j12);
                throw th;
            }
            sb2.append("hello: ");
            sb2.append(System.currentTimeMillis() - j11);
        } catch (Throwable th3) {
            th = th3;
            StringBuilder sb62 = new StringBuilder();
            sb62.append("hello: ");
            sb62.append(System.currentTimeMillis() - j12);
            throw th;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        try {
            EditText editText = this.f77316R0;
            if (editText != null) {
                editText.clearFocus();
                AbstractC2379w.m12430d(this.f77316R0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo37484JJ();
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                SearchSettingTextInputLayout searchSettingTextInputLayout = new SearchSettingTextInputLayout(m87077NK.getContext());
                m87077NK.setCustomMiddleItem(searchSettingTextInputLayout);
                this.f77317S0 = searchSettingTextInputLayout.getClearButton();
                EditText searchField = searchSettingTextInputLayout.getSearchField();
                this.f77316R0 = searchField;
                if (searchField != null) {
                    searchField.setEllipsize(TextUtils.TruncateAt.END);
                    this.f77316R0.setHintTextColor(AbstractC1388a.m6961c(this.f77319U0.m92648SI(), AbstractC16801x.white_50));
                    this.f77316R0.setTextColor(AbstractC1388a.m6961c(this.f77319U0.m92648SI(), AbstractC16801x.white));
                    this.f77316R0.setHint(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_search_option));
                    this.f77316R0.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.xf0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            SearchSettingView.this.m83953DM(view);
                        }
                    });
                    this.f77316R0.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zing.zalo.ui.zviews.yf0
                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                            boolean m83954EM;
                            m83954EM = SearchSettingView.this.m83954EM(textView, i11, keyEvent);
                            return m83954EM;
                        }
                    });
                    this.f77316R0.addTextChangedListener(new C15004a());
                    EditText editText = this.f77316R0;
                    if (editText != null && editText.getParent() != null) {
                        ((View) this.f77316R0.getParent()).setBackgroundResource(AbstractC16803z.stencil_edit_text_focused_no_space_white);
                    }
                }
                if (this.f77317S0 != null) {
                    EditText editText2 = this.f77316R0;
                    if (editText2 != null && !TextUtils.isEmpty(editText2.getText())) {
                        this.f77317S0.setVisibility(0);
                        return;
                    }
                    this.f77317S0.setVisibility(8);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        EditText editText;
        if (i11 == 16908332 && (editText = this.f77316R0) != null) {
            AbstractC2379w.m12430d(editText);
        }
        return super.mo37491QJ(i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        Handler handler;
        super.mo37122XJ(z11, z12);
        if (z11) {
            if ((!z12 || this.f77319U0.m92683qJ() || !this.f77319U0.mo60294yp()) && (handler = this.f72827B0) != null) {
                handler.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.vf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SearchSettingView.this.m83955FM();
                    }
                }, 100L);
            }
        }
    }

    /* renamed from: a7 */
    void m83975a7() {
        try {
            synchronized (this.f77327c1) {
                try {
                    if (this.f77328d1) {
                        this.f77319U0.mo46829Y();
                        return;
                    }
                    synchronized (this.f77327c1) {
                        this.f77328d1 = true;
                        this.f77319U0.mo46829Y();
                    }
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C15008e());
                    c0766k.mo1743t7(1);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.adapters.C7251w6.c
    /* renamed from: as */
    public boolean mo36964as() {
        return this.f77318T0.m36959M();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SearchSettingView";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.btn_change_phone) {
                this.f77319U0.removeDialog(2);
                m83975a7();
                AbstractC23647d.m123897g("199719");
            } else if (id2 == AbstractC6918a0.btn_close) {
                this.f77319U0.removeDialog(2);
                AbstractC23647d.m123897g("199720");
            } else if (id2 == AbstractC6918a0.see_more) {
                this.f77319U0.removeDialog(2);
                Bundle bundle = new Bundle();
                bundle.putString("EXTRA_WEB_URL", AbstractC23306f.m120583H().m110204g().f110080o);
                ZaloWebView.m87105iS(this.f77319U0.m92676n2(), AbstractC23306f.m120583H().m110204g().f110080o, bundle);
                AbstractC23647d.m123897g("199718");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: rM */
    void m83976rM() {
        try {
            if (C21927m.m114302u().m114357s().m153137g(AbstractC23306f.m120583H().m110204g().m116322n())) {
                if (this.f77329e1 == null && C21927m.m114302u().m114318P(AbstractC23306f.m120583H().m110204g().m116322n())) {
                    ContactProfile m153138j = C21927m.m114302u().m114357s().m153138j("153426290");
                    this.f77329e1 = m153138j;
                    if (m153138j == null) {
                        this.f77329e1 = C7960e.m41971c6().m42228P5(AbstractC23306f.m120583H().m110204g().m116322n());
                    }
                }
                if (this.f77329e1 != null) {
                    m83979uM();
                    return;
                }
                return;
            }
            m83978tM(AbstractC23306f.m120583H().m110204g().m116322n());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: sM */
    void m83977sM(int i11) {
        try {
            if (this.f77331g1) {
                return;
            }
            this.f77319U0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C15010g());
            this.f77331g1 = true;
            TrackingSource m114310H = C21927m.m114302u().m114310H(String.valueOf(i11));
            if (m114310H == null) {
                m114310H = new TrackingSource(-1);
            }
            c0766k.mo1578Y4(i11, m114310H);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.adapters.C7251w6.c
    /* renamed from: sj */
    public void mo36965sj(C32178x9 c32178x9) {
        try {
            AbstractC23647d.m123897g("800002");
            ArrayList arrayList = this.f77321W0;
            if (arrayList != null && arrayList.size() > 0) {
                for (int size = this.f77321W0.size() - 1; size >= 0; size--) {
                    if (((C32178x9) this.f77321W0.get(size)).f148384r == c32178x9.f148384r) {
                        this.f77321W0.remove(size);
                    }
                }
                ArrayList arrayList2 = this.f77321W0;
                if (arrayList2 != null && arrayList2.size() == 1 && ((C32178x9) this.f77321W0.get(0)).f148384r == -1) {
                    this.f77321W0.remove(0);
                }
            }
            EditText editText = this.f77316R0;
            if (editText != null && TextUtils.isEmpty(editText.getText().toString().trim())) {
                m83957HM(false, null);
            }
            C0824j.m2153b(new C15007d(c32178x9));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: tM */
    public void m83978tM(String str) {
        int i11;
        try {
            ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
            this.f77329e1 = m141809c;
            if (m141809c != null) {
                i11 = m141809c.f42385V0;
            } else {
                i11 = 0;
            }
            if (m141809c != null) {
                if (C21927m.m114302u().m114357s().m153137g(AbstractC23306f.m120583H().m110204g().m116322n())) {
                    m83979uM();
                    return;
                } else {
                    m83977sM(Integer.parseInt(AbstractC23306f.m120583H().m110204g().m116322n()));
                    return;
                }
            }
            if (this.f77330f1) {
                return;
            }
            this.f77319U0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C15009f());
            this.f77330f1 = true;
            c0766k.mo1514Q4(str, i11, new TrackingSource((short) 1027));
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f77319U0.mo49315c4();
        }
    }

    /* renamed from: uM */
    void m83979uM() {
        try {
            ContactProfile contactProfile = this.f77329e1;
            if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
                Bundle m140776b = new C27870vb(this.f77329e1.mo2478b()).m140780g(this.f77329e1).m140776b();
                Intent intent = new Intent();
                intent.putExtras(m140776b);
                this.f77319U0.m92676n2().mo35573l4(ChatView.class, intent.getExtras(), 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            C7251w6 c7251w6 = new C7251w6(this.f77321W0, this);
            this.f77318T0 = c7251w6;
            c7251w6.m9999J(true);
            this.f77314P0.setLayoutManager(new LinearLayoutManager(m92648SI()));
            this.f77314P0.setItemAnimator(null);
            this.f77314P0.setAdapter(this.f77318T0);
            this.f77314P0.m9826E(new C15005b());
            C31784b.m152808a(this.f77314P0).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.uf0
                @Override // zc0.C31784b.d
                /* renamed from: i0 */
                public final void mo17458i0(RecyclerView recyclerView, int i11, View view) {
                    SearchSettingView.this.m83971xM(recyclerView, i11, view);
                }
            });
            m83957HM(true, null);
            new C15012i().m2434i(AbstractC0837p0.m2225f(), new Void[0]);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
