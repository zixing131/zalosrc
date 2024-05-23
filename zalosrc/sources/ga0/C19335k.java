package ga0;

import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0824j;
import am.AbstractC0939u;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.adtima.Adtima;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
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
import com.zing.zalo.p077ui.toolstorage.overview.ToolStorageView;
import com.zing.zalo.p077ui.toolstoragev1.summary.StorageSummaryView;
import com.zing.zalo.p077ui.zalocloud.home.ZCloudHomeView;
import com.zing.zalo.p077ui.zviews.AutoReplyListingView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.ChangePasswordView;
import com.zing.zalo.p077ui.zviews.ChangePhoneNumberView;
import com.zing.zalo.p077ui.zviews.NotChangePhoneNumberView;
import com.zing.zalo.p077ui.zviews.QuickMessageListingFullView;
import com.zing.zalo.p077ui.zviews.SettingFontSizeView;
import com.zing.zalo.p077ui.zviews.SettingGroupView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalocore.CoreUtility;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import fn0.AbstractC19074t;
import ga0.C19335k;
import gg0.AbstractC19444a;
import ha0.C19955h;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import j30.C20912a;
import java.util.Map;
import me0.AbstractC23136l9;
import me0.AbstractC23181q;
import me0.AbstractC23216t1;
import me0.C23024b7;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p304ks.C21927m;
import p320ld.C22438j;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import p542ub.InterfaceC27218a;
import p612wk.AbstractC29069a;
import p716zh.C31965ic;
import p716zh.C32017m4;
import p716zh.C32178x9;
import pm0.C24848g0;
import v50.C27870vb;
import vg.C28203u6;
import za0.C31747a;

/* renamed from: ga0.k */
/* loaded from: classes6.dex */
public final class C19335k extends AbstractRunnableC19355q1 {

    /* renamed from: s */
    private final C18316b f96056s;

    /* renamed from: t */
    private final String f96057t;

    /* renamed from: u */
    private C18316b f96058u;

    /* renamed from: ga0.k$a */
    /* loaded from: classes6.dex */
    public static final class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C19325g1 f96059a;

        /* renamed from: b */
        final /* synthetic */ BaseZaloView f96060b;

        /* renamed from: c */
        final /* synthetic */ C19335k f96061c;

        /* renamed from: ga0.k$a$a */
        /* loaded from: classes6.dex */
        public static final class C32824a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f96062a;

            C32824a(ContactProfile contactProfile) {
                this.f96062a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42349b8(this.f96062a);
            }
        }

        a(C19325g1 c19325g1, BaseZaloView baseZaloView, C19335k c19335k) {
            this.f96059a = c19325g1;
            this.f96060b = baseZaloView;
            this.f96061c = c19335k;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                try {
                    ToastUtils.m89264l(c20096c);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                this.f96059a.m101210e0(false);
                this.f96060b.mo78960q3();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x011e A[Catch: all -> 0x0060, Exception -> 0x0063, TryCatch #1 {Exception -> 0x0063, blocks: (B:3:0x000c, B:5:0x0014, B:7:0x001a, B:9:0x002f, B:11:0x0035, B:13:0x003b, B:15:0x0041, B:17:0x0047, B:18:0x006a, B:20:0x007b, B:21:0x007d, B:23:0x0083, B:24:0x008a, B:26:0x0094, B:28:0x00ae, B:29:0x00c2, B:31:0x00dc, B:33:0x0101, B:34:0x0103, B:36:0x0109, B:37:0x0112, B:39:0x011e, B:40:0x0131, B:42:0x014a, B:43:0x014f), top: B:2:0x000c, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x014a A[Catch: all -> 0x0060, Exception -> 0x0063, TryCatch #1 {Exception -> 0x0063, blocks: (B:3:0x000c, B:5:0x0014, B:7:0x001a, B:9:0x002f, B:11:0x0035, B:13:0x003b, B:15:0x0041, B:17:0x0047, B:18:0x006a, B:20:0x007b, B:21:0x007d, B:23:0x0083, B:24:0x008a, B:26:0x0094, B:28:0x00ae, B:29:0x00c2, B:31:0x00dc, B:33:0x0101, B:34:0x0103, B:36:0x0109, B:37:0x0112, B:39:0x011e, B:40:0x0131, B:42:0x014a, B:43:0x014f), top: B:2:0x000c, outer: #0 }] */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            String str;
            String str2;
            int i11;
            ContactProfile contactProfile;
            C31965ic c31965ic;
            JSONObject optJSONObject;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("error_code") && jSONObject.has("data")) {
                        String string = jSONObject.getString("error_code");
                        AbstractC19074t.m100207e(string, "getString(...)");
                        int parseInt = Integer.parseInt(string);
                        ContactProfile m101239t = this.f96059a.m101239t();
                        if (m101239t != null) {
                            C19335k c19335k = this.f96061c;
                            BaseZaloView baseZaloView = this.f96060b;
                            if (parseInt == 0) {
                                if (jSONObject.has("data") && !jSONObject.isNull("data") && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                                    i11 = optJSONObject.optInt("action", 0);
                                    str = optJSONObject.optString("alias");
                                    AbstractC19074t.m100207e(str, "optString(...)");
                                    str2 = optJSONObject.optString("desc");
                                    AbstractC19074t.m100207e(str2, "optString(...)");
                                } else {
                                    str = "";
                                    str2 = "";
                                    i11 = 0;
                                }
                                int i12 = m101239t.f42352K0;
                                m101239t.f42447v0 = i12;
                                m101239t.f42352K0 = i12;
                                m101239t.f42441t0 = true;
                                m101239t.f42456y0 = i11;
                                if (!TextUtils.isEmpty(str)) {
                                    m101239t.f42442t1 = str;
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    m101239t.f42436r1 = new SpannableStringBuilder(str2);
                                }
                                if (C21927m.m114302u().m114357s() != null) {
                                    if (!C21927m.m114302u().m114357s().m153137g(AbstractC23306f.m120583H().m110204g().m116322n())) {
                                        C21927m.m114302u().m114357s().add(m101239t);
                                        C0824j.m2153b(new C32824a(m101239t));
                                    } else if (C21927m.m114302u().m114357s().m153138j(AbstractC23306f.m120583H().m110204g().m116322n()) != null) {
                                        contactProfile = C21927m.m114302u().m114357s().m153138j(AbstractC23306f.m120583H().m110204g().m116322n());
                                        AbstractC19074t.m100207e(contactProfile, "get(...)");
                                        contactProfile.f42456y0 = i11;
                                        if (!TextUtils.isEmpty(str)) {
                                            contactProfile.f42442t1 = str;
                                        }
                                        if (!TextUtils.isEmpty(str2)) {
                                            contactProfile.f42436r1 = new SpannableStringBuilder(str2);
                                        }
                                        Map map = AbstractC23304d.f113405l;
                                        c31965ic = (C31965ic) map.get(CoreUtility.f89233i);
                                        if (c31965ic != null) {
                                            int m153681a = c31965ic.m153681a() + 1;
                                            Object obj2 = map.get(CoreUtility.f89233i);
                                            AbstractC19074t.m100205c(obj2);
                                            ((C31965ic) obj2).m153684d(m153681a);
                                        }
                                        C28203u6.f131407a.m141806D(AbstractC23306f.m120583H().m110204g().m116322n(), false);
                                        if (!TextUtils.isEmpty(contactProfile.f42434r)) {
                                            AbstractC23181q.m119431d(contactProfile.f42434r, true);
                                        }
                                        c19335k.m101271B(m101239t, baseZaloView);
                                    }
                                }
                                contactProfile = m101239t;
                                Map map2 = AbstractC23304d.f113405l;
                                c31965ic = (C31965ic) map2.get(CoreUtility.f89233i);
                                if (c31965ic != null) {
                                }
                                C28203u6.f131407a.m141806D(AbstractC23306f.m120583H().m110204g().m116322n(), false);
                                if (!TextUtils.isEmpty(contactProfile.f42434r)) {
                                }
                                c19335k.m101271B(m101239t, baseZaloView);
                            }
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                this.f96059a.m101210e0(false);
                this.f96060b.mo78960q3();
            }
        }
    }

    /* renamed from: ga0.k$b */
    /* loaded from: classes6.dex */
    public static final class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C19325g1 f96063a;

        /* renamed from: b */
        final /* synthetic */ BaseZaloView f96064b;

        b(C19325g1 c19325g1, BaseZaloView baseZaloView) {
            this.f96063a = c19325g1;
            this.f96064b = baseZaloView;
        }

        /* renamed from: e */
        public static final void m101292e(BaseZaloView baseZaloView, boolean z11, boolean z12, boolean z13, JSONArray jSONArray) {
            AbstractC19074t.m100208f(baseZaloView, "$zaloView");
            try {
                if (!baseZaloView.m92677nJ() && !baseZaloView.m92681pJ()) {
                    if (z11) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("SHOW_WITH_FLAGS", 33554432);
                        bundle.putBoolean("is_unmap_profile", z12);
                        bundle.putBoolean("is_bypass_password", z13);
                        bundle.putInt("source_type_change_phone", 1);
                        InterfaceC27218a m92676n2 = baseZaloView.m92676n2();
                        if (m92676n2 != null) {
                            m92676n2.mo35573l4(ChangePhoneNumberView.class, bundle, 1, true);
                            return;
                        }
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("SHOW_WITH_FLAGS", 33554432);
                    if (jSONArray != null) {
                        bundle2.putString("EXTRA_VALID_ERROR", jSONArray.toString());
                    }
                    C17487o0 m92662fJ = baseZaloView.m92662fJ();
                    if (m92662fJ != null) {
                        m92662fJ.m93069k2(NotChangePhoneNumberView.class, bundle2, 1, true);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: f */
        public static final void m101293f(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                Object m101231p = this.f96063a.m101231p();
                C19325g1 c19325g1 = this.f96063a;
                BaseZaloView baseZaloView = this.f96064b;
                synchronized (m101231p) {
                    c19325g1.m101220j0(false);
                    baseZaloView.mo49315c4();
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
                if (this.f96064b.m92677nJ() || this.f96064b.m92681pJ() || AbstractC23216t1.m119643h(this.f96064b, c20096c, new AbstractC23216t1.d() { // from class: ga0.m
                    @Override // me0.AbstractC23216t1.d
                    /* renamed from: a */
                    public final void mo68088a(String str) {
                        C19335k.b.m101293f(str);
                    }
                })) {
                    return;
                }
                ToastUtils.m89263k(c20096c);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: ga0.l.<init>(com.zing.zalo.ui.zviews.BaseZaloView, boolean, boolean, boolean, org.json.JSONArray):void, class status: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
            	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
            */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.String r0 = "entity"
                fn0.AbstractC19074t.m100208f(r11, r0)
                ga0.g1 r0 = r10.f96063a     // Catch: java.lang.Exception -> L7d
                java.lang.Object r0 = r0.m101231p()     // Catch: java.lang.Exception -> L7d
                ga0.g1 r1 = r10.f96063a     // Catch: java.lang.Exception -> L7d
                com.zing.zalo.ui.zviews.BaseZaloView r2 = r10.f96064b     // Catch: java.lang.Exception -> L7d
                monitor-enter(r0)     // Catch: java.lang.Exception -> L7d
                r3 = 0
                r1.m101220j0(r3)     // Catch: java.lang.Throwable -> L7f
                r2.mo49315c4()     // Catch: java.lang.Throwable -> L7f
                pm0.g0 r1 = pm0.C24848g0.f119245a     // Catch: java.lang.Throwable -> L7f
                monitor-exit(r0)     // Catch: java.lang.Exception -> L7d
                org.json.JSONObject r11 = (org.json.JSONObject) r11     // Catch: java.lang.Exception -> L7d
                java.lang.String r0 = "data"
                org.json.JSONObject r0 = r11.optJSONObject(r0)     // Catch: java.lang.Exception -> L7d
                java.lang.String r1 = "error_code"
                r2 = -999(0xfffffffffffffc19, float:NaN)
                int r11 = r11.optInt(r1, r2)     // Catch: java.lang.Exception -> L7d
                if (r11 != 0) goto L85
                if (r0 == 0) goto L85
                java.lang.String r11 = "isset_pwd"
                boolean r11 = r0.optBoolean(r11)     // Catch: java.lang.Exception -> L7d
                r1 = 1
                p348mi.AbstractC23304d.f113346X0 = r11     // Catch: java.lang.Exception -> L7d
                p348mi.AbstractC23309i.m122550wp(r11)     // Catch: java.lang.Exception -> L7d
                java.lang.String r11 = "allow_change_phonenumber"
                int r11 = r0.optInt(r11, r3)     // Catch: java.lang.Exception -> L7d
                if (r11 != r1) goto L44
                r6 = 1
                goto L45
            L44:
                r6 = 0
            L45:
                java.lang.String r11 = "unmap_profile"
                int r11 = r0.optInt(r11, r3)     // Catch: java.lang.Exception -> L7d
                if (r11 != r1) goto L4f
                r7 = 1
                goto L50
            L4f:
                r7 = 0
            L50:
                java.lang.String r11 = "bypass_verify_pwd"
                int r11 = r0.optInt(r11, r3)     // Catch: java.lang.Exception -> L7d
                if (r11 != r1) goto L5a
                r8 = 1
                goto L5b
            L5a:
                r8 = 0
            L5b:
                java.lang.String r11 = "valid_error"
                org.json.JSONArray r9 = r0.optJSONArray(r11)     // Catch: java.lang.Exception -> L7d
                com.zing.zalo.ui.zviews.BaseZaloView r11 = r10.f96064b     // Catch: java.lang.Exception -> L7d
                ub.a r11 = r11.m92676n2()     // Catch: java.lang.Exception -> L7d
                if (r11 == 0) goto L85
                com.zing.zalo.ui.zviews.BaseZaloView r11 = r10.f96064b     // Catch: java.lang.Exception -> L7d
                ub.a r11 = r11.m92676n2()     // Catch: java.lang.Exception -> L7d
                if (r11 == 0) goto L85
                com.zing.zalo.ui.zviews.BaseZaloView r5 = r10.f96064b     // Catch: java.lang.Exception -> L7d
                ga0.l r0 = new ga0.l     // Catch: java.lang.Exception -> L7d
                r4 = r0
                r4.<init>()     // Catch: java.lang.Exception -> L7d
                r11.runOnUiThread(r0)     // Catch: java.lang.Exception -> L7d
                goto L85
            L7d:
                r11 = move-exception
                goto L82
            L7f:
                r11 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Exception -> L7d
                throw r11     // Catch: java.lang.Exception -> L7d
            L82:
                r11.printStackTrace()
            L85:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ga0.C19335k.b.mo927b(java.lang.Object):void");
        }
    }

    /* renamed from: ga0.k$c */
    /* loaded from: classes6.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ BaseZaloView f96065a;

        /* renamed from: b */
        final /* synthetic */ C19325g1 f96066b;

        /* renamed from: c */
        final /* synthetic */ C19335k f96067c;

        /* renamed from: ga0.k$c$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f96068a;

            a(ContactProfile contactProfile) {
                this.f96068a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42221O7(this.f96068a, true);
            }
        }

        c(BaseZaloView baseZaloView, C19325g1 c19325g1, C19335k c19335k) {
            this.f96065a = baseZaloView;
            this.f96066b = c19325g1;
            this.f96067c = c19335k;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            this.f96065a.mo78960q3();
            ToastUtils.m89264l(new C20096c(ZMediaPlayer.ZPLAYER_UNSUPPORTED_PROTOCOL, ""));
            this.f96066b.m101214g0(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                try {
                    this.f96066b.m101230o0(new ContactProfile((JSONObject) obj));
                    ContactProfile m101239t = this.f96066b.m101239t();
                    if (m101239t != null) {
                        m101239t.f42330D = System.currentTimeMillis();
                    }
                    ContactProfile m101239t2 = this.f96066b.m101239t();
                    if (m101239t2 != null) {
                        C19335k c19335k = this.f96067c;
                        C19325g1 c19325g1 = this.f96066b;
                        BaseZaloView baseZaloView = this.f96065a;
                        C0824j.m2153b(new a(m101239t2));
                        c19335k.m101288t(c19325g1, Integer.parseInt(AbstractC23306f.m120583H().m110204g().m116322n()), baseZaloView);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("SearchSettingView", e11);
                }
            } finally {
                this.f96066b.m101214g0(false);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19335k(InterfaceC18319c interfaceC18319c, C18316b c18316b, String str) {
        super(interfaceC18319c);
        AbstractC19074t.m100208f(interfaceC18319c, "host");
        AbstractC19074t.m100208f(c18316b, "action");
        AbstractC19074t.m100208f(str, "query");
        this.f96056s = c18316b;
        this.f96057t = str;
    }

    /* renamed from: A */
    public static final void m101270A(C19335k c19335k) {
        AbstractC19074t.m100208f(c19335k, "this$0");
        c19335k.mo205i9(new C18316b("Search.RefreshRecentSearch", null, null, null, 14, null));
    }

    /* renamed from: B */
    public final void m101271B(ContactProfile contactProfile, ZaloView zaloView) {
        try {
            if (!TextUtils.isEmpty(contactProfile.f42434r)) {
                String mo2478b = contactProfile.mo2478b();
                AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                Bundle m140776b = new C27870vb(mo2478b).m140780g(contactProfile).m140776b();
                Intent intent = new Intent();
                intent.putExtras(m140776b);
                intent.putExtra("SHOW_WITH_FLAGS", 33554432);
                InterfaceC27218a m92676n2 = zaloView.m92676n2();
                if (m92676n2 != null) {
                    m92676n2.mo35573l4(ChatView.class, intent.getExtras(), 1, true);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: C */
    public static final void m101272C(BaseZaloView baseZaloView, View view) {
        AbstractC19074t.m100208f(baseZaloView, "$zaloView");
        baseZaloView.removeDialog(2);
        AbstractC23647d.m123897g("199720");
    }

    /* renamed from: D */
    public static final void m101273D(BaseZaloView baseZaloView, C19335k c19335k, C19325g1 c19325g1, View view) {
        AbstractC19074t.m100208f(baseZaloView, "$zaloView");
        AbstractC19074t.m100208f(c19335k, "this$0");
        AbstractC19074t.m100208f(c19325g1, "$sessionData");
        baseZaloView.removeDialog(2);
        c19335k.m101284u(c19325g1, baseZaloView);
        AbstractC23647d.m123897g("199719");
    }

    /* renamed from: E */
    public static final void m101274E(BaseZaloView baseZaloView, View view) {
        AbstractC19074t.m100208f(baseZaloView, "$zaloView");
        baseZaloView.removeDialog(2);
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 33554432);
        bundle.putString("EXTRA_WEB_URL", AbstractC23306f.m120583H().m110204g().f110080o);
        ZaloWebView.C15403a c15403a = ZaloWebView.Companion;
        InterfaceC27218a m92692wK = baseZaloView.m92692wK();
        AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
        c15403a.m87171F(m92692wK, AbstractC23306f.m120583H().m110204g().f110080o, bundle);
        AbstractC23647d.m123897g("199718");
    }

    /* renamed from: F */
    public static final void m101275F(BaseZaloView baseZaloView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(baseZaloView, "$zaloView");
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 33554432);
        bundle.putInt("password_mode", 1);
        C17487o0 m92662fJ = baseZaloView.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(ChangePasswordView.class, bundle, 1, true);
        }
    }

    /* renamed from: s */
    private final void m101283s(C19325g1 c19325g1, BaseZaloView baseZaloView) {
        try {
            if (C21927m.m114302u().m114357s().m153137g(AbstractC23306f.m120583H().m110204g().m116322n())) {
                if (c19325g1.m101239t() == null && C21927m.m114302u().m114318P(AbstractC23306f.m120583H().m110204g().m116322n())) {
                    c19325g1.m101230o0(C21927m.m114302u().m114357s().m153138j("153426290"));
                    if (c19325g1.m101239t() == null) {
                        c19325g1.m101230o0(C7960e.m41971c6().m42228P5(AbstractC23306f.m120583H().m110204g().m116322n()));
                    }
                }
                ContactProfile m101239t = c19325g1.m101239t();
                if (m101239t != null) {
                    m101271B(m101239t, baseZaloView);
                    return;
                }
                return;
            }
            m101285x(c19325g1, AbstractC23306f.m120583H().m110204g().m116322n(), baseZaloView);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: u */
    private final void m101284u(C19325g1 c19325g1, BaseZaloView baseZaloView) {
        try {
            synchronized (c19325g1.m101231p()) {
                if (c19325g1.m101227n()) {
                    baseZaloView.mo46829Y();
                    return;
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                synchronized (c19325g1.m101231p()) {
                    c19325g1.m101220j0(true);
                    baseZaloView.mo46829Y();
                }
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new b(c19325g1, baseZaloView));
                c0766k.mo1743t7(1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: x */
    private final void m101285x(C19325g1 c19325g1, String str, BaseZaloView baseZaloView) {
        int i11;
        try {
            c19325g1.m101230o0(C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null));
            ContactProfile m101239t = c19325g1.m101239t();
            if (m101239t != null) {
                i11 = m101239t.f42385V0;
            } else {
                i11 = 0;
            }
            ContactProfile m101239t2 = c19325g1.m101239t();
            if (m101239t2 != null) {
                if (C21927m.m114302u().m114357s().m153137g(AbstractC23306f.m120583H().m110204g().m116322n())) {
                    m101271B(m101239t2, baseZaloView);
                    return;
                } else {
                    m101288t(c19325g1, Integer.parseInt(AbstractC23306f.m120583H().m110204g().m116322n()), baseZaloView);
                    return;
                }
            }
            if (!c19325g1.m101185K()) {
                baseZaloView.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new c(baseZaloView, c19325g1, this));
                c19325g1.m101214g0(true);
                c0766k.mo1514Q4(str, i11, new TrackingSource((short) 1027));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            baseZaloView.mo49315c4();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: y */
    private final void m101286y(C19325g1 c19325g1, AbstractC29069a.v vVar, int i11, BaseZaloView baseZaloView) {
        C19335k c19335k;
        C19325g1 c19325g12;
        C17487o0 mo35579p;
        C32178x9 m145222b = vVar.m145222b();
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 33554432);
        switch (m145222b.f148384r) {
            case 1:
                c19335k = this;
                c19325g12 = c19325g1;
                C17487o0 m92662fJ = baseZaloView.m92662fJ();
                if (m92662fJ != null) {
                    m92662fJ.m93069k2(SettingPrivateV2View.class, bundle, 1, true);
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
                C32017m4.m154326S().m154359e0("37000");
                break;
            case 2:
                c19335k = this;
                c19325g12 = c19325g1;
                C17487o0 m92662fJ2 = baseZaloView.m92662fJ();
                if (m92662fJ2 != null) {
                    m92662fJ2.m93069k2(SettingAccountAndSecurityV2View.class, bundle, 1, true);
                    C24848g0 c24848g02 = C24848g0.f119245a;
                }
                C32017m4.m154326S().m154359e0("37100");
                break;
            case 3:
                c19335k = this;
                c19325g12 = c19325g1;
                C22438j.m115953v(baseZaloView.m92662fJ(), bundle);
                AbstractC23647d.m123906p("37802");
                AbstractC23647d.m123893c();
                break;
            case 4:
                c19325g12 = c19325g1;
                c19335k = this;
                C17487o0 m92662fJ3 = baseZaloView.m92662fJ();
                if (m92662fJ3 != null) {
                    m92662fJ3.m93069k2(SettingNotificationV2View.class, bundle, 1, true);
                    C24848g0 c24848g03 = C24848g0.f119245a;
                }
                AbstractC23647d.m123906p("37200");
                AbstractC23647d.m123893c();
                break;
            case 5:
                c19335k = this;
                c19325g12 = c19325g1;
                C17487o0 m92662fJ4 = baseZaloView.m92662fJ();
                if (m92662fJ4 != null) {
                    m92662fJ4.m93069k2(SettingMessageV2View.class, bundle, 1, true);
                    C24848g0 c24848g04 = C24848g0.f119245a;
                }
                AbstractC23647d.m123906p("37300");
                AbstractC23647d.m123893c();
                break;
            case 6:
                c19335k = this;
                c19325g12 = c19325g1;
                C17487o0 m92662fJ5 = baseZaloView.m92662fJ();
                if (m92662fJ5 != null) {
                    m92662fJ5.m93069k2(SettingCallV2View.class, bundle, 1, true);
                    C24848g0 c24848g05 = C24848g0.f119245a;
                }
                AbstractC23647d.m123906p("37900");
                AbstractC23647d.m123893c();
                break;
            case 7:
                c19335k = this;
                c19325g12 = c19325g1;
                C17487o0 m92662fJ6 = baseZaloView.m92662fJ();
                if (m92662fJ6 != null) {
                    m92662fJ6.m93069k2(SettingTimelineV2View.class, bundle, 1, true);
                    C24848g0 c24848g06 = C24848g0.f119245a;
                }
                AbstractC23647d.m123906p("37400");
                AbstractC23647d.m123893c();
                break;
            case 8:
                c19335k = this;
                c19325g12 = c19325g1;
                C17487o0 m92662fJ7 = baseZaloView.m92662fJ();
                if (m92662fJ7 != null) {
                    m92662fJ7.m93069k2(SettingContactView.class, null, 1, true);
                    C24848g0 c24848g07 = C24848g0.f119245a;
                }
                AbstractC23647d.m123906p("37500");
                AbstractC23647d.m123893c();
                break;
            case 9:
                c19335k = this;
                c19325g12 = c19325g1;
                C17487o0 m92662fJ8 = baseZaloView.m92662fJ();
                if (m92662fJ8 != null) {
                    m92662fJ8.m93069k2(SettingThemeV2View.class, null, 1, true);
                    C24848g0 c24848g08 = C24848g0.f119245a;
                }
                AbstractC23647d.m123906p("37600");
                AbstractC23647d.m123893c();
                break;
            case 10:
                c19335k = this;
                c19325g12 = c19325g1;
                C17487o0 m92662fJ9 = baseZaloView.m92662fJ();
                if (m92662fJ9 != null) {
                    m92662fJ9.m93069k2(AboutView.class, bundle, 1, true);
                    C24848g0 c24848g09 = C24848g0.f119245a;
                }
                AbstractC23647d.m123906p("37700");
                AbstractC23647d.m123893c();
                break;
            case 11:
                c19335k = this;
                c19325g12 = c19325g1;
                InterfaceC27218a m92676n2 = baseZaloView.m92676n2();
                if (m92676n2 != null) {
                    m92676n2.mo35573l4(SwitchAccountView.class, bundle, 1, true);
                    C24848g0 c24848g010 = C24848g0.f119245a;
                    break;
                }
                break;
            case 12:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 48);
                InterfaceC27218a m92676n22 = baseZaloView.m92676n2();
                if (m92676n22 != null) {
                    m92676n22.mo35573l4(SettingV2View.class, bundle, 1, true);
                    C24848g0 c24848g011 = C24848g0.f119245a;
                    break;
                }
                break;
            case 13:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 77);
                C17487o0 m92662fJ10 = baseZaloView.m92662fJ();
                if (m92662fJ10 != null) {
                    m92662fJ10.m93069k2(SettingContactView.class, bundle, 1, true);
                    C24848g0 c24848g012 = C24848g0.f119245a;
                    break;
                }
                break;
            case 14:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 102);
                C17487o0 m92662fJ11 = baseZaloView.m92662fJ();
                if (m92662fJ11 != null) {
                    m92662fJ11.m93069k2(SettingContactView.class, bundle, 1, true);
                    C24848g0 c24848g013 = C24848g0.f119245a;
                    break;
                }
                break;
            case 15:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 28);
                C17487o0 m92662fJ12 = baseZaloView.m92662fJ();
                if (m92662fJ12 != null) {
                    m92662fJ12.m93069k2(SettingContactView.class, bundle, 1, true);
                    C24848g0 c24848g014 = C24848g0.f119245a;
                    break;
                }
                break;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 24);
                C17487o0 m92662fJ13 = baseZaloView.m92662fJ();
                if (m92662fJ13 != null) {
                    m92662fJ13.m93069k2(SettingPrivateV2View.class, bundle, 1, true);
                    C24848g0 c24848g015 = C24848g0.f119245a;
                    break;
                }
                break;
            case 17:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 49);
                C17487o0 m92662fJ14 = baseZaloView.m92662fJ();
                if (m92662fJ14 != null) {
                    m92662fJ14.m93069k2(SettingPrivateV2View.class, bundle, 1, true);
                    C24848g0 c24848g016 = C24848g0.f119245a;
                    break;
                }
                break;
            case 18:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 5);
                C17487o0 m92662fJ15 = baseZaloView.m92662fJ();
                if (m92662fJ15 != null) {
                    m92662fJ15.m93069k2(SettingPrivateV2View.class, bundle, 1, true);
                    C24848g0 c24848g017 = C24848g0.f119245a;
                    break;
                }
                break;
            case 19:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 23);
                C17487o0 m92662fJ16 = baseZaloView.m92662fJ();
                if (m92662fJ16 != null) {
                    m92662fJ16.m93069k2(SettingPrivateV2View.class, bundle, 1, true);
                    C24848g0 c24848g018 = C24848g0.f119245a;
                    break;
                }
                break;
            case 20:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 6);
                C17487o0 m92662fJ17 = baseZaloView.m92662fJ();
                if (m92662fJ17 != null) {
                    m92662fJ17.m93069k2(SettingFeedPrivacyView.class, bundle, 1, true);
                    C24848g0 c24848g019 = C24848g0.f119245a;
                    break;
                }
                break;
            case 21:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 7);
                C17487o0 m92662fJ18 = baseZaloView.m92662fJ();
                if (m92662fJ18 != null) {
                    m92662fJ18.m93069k2(SettingFeedPrivacyView.class, bundle, 1, true);
                    C24848g0 c24848g020 = C24848g0.f119245a;
                    break;
                }
                break;
            case 22:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 8);
                C17487o0 m92662fJ19 = baseZaloView.m92662fJ();
                if (m92662fJ19 != null) {
                    m92662fJ19.m93069k2(SettingFeedPrivacyView.class, bundle, 1, true);
                    C24848g0 c24848g021 = C24848g0.f119245a;
                    break;
                }
                break;
            case 23:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 25);
                C17487o0 m92662fJ20 = baseZaloView.m92662fJ();
                if (m92662fJ20 != null) {
                    m92662fJ20.m93069k2(SettingPrivateV2View.class, bundle, 1, true);
                    C24848g0 c24848g022 = C24848g0.f119245a;
                    break;
                }
                break;
            case 24:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 9);
                C17487o0 m92662fJ21 = baseZaloView.m92662fJ();
                if (m92662fJ21 != null) {
                    m92662fJ21.m93069k2(SettingPrivateV2View.class, bundle, 1, true);
                    C24848g0 c24848g023 = C24848g0.f119245a;
                    break;
                }
                break;
            case 25:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 53);
                C17487o0 m92662fJ22 = baseZaloView.m92662fJ();
                if (m92662fJ22 != null) {
                    m92662fJ22.m93069k2(SettingAccountAndSecurityV2View.class, bundle, 1, true);
                    C24848g0 c24848g024 = C24848g0.f119245a;
                    break;
                }
                break;
            case 26:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 51);
                C17487o0 m92662fJ23 = baseZaloView.m92662fJ();
                if (m92662fJ23 != null) {
                    m92662fJ23.m93069k2(SettingAccountAndSecurityV2View.class, bundle, 1, true);
                    C24848g0 c24848g025 = C24848g0.f119245a;
                    break;
                }
                break;
            case 27:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 54);
                C17487o0 m92662fJ24 = baseZaloView.m92662fJ();
                if (m92662fJ24 != null) {
                    m92662fJ24.m93069k2(SettingAccountAndSecurityV2View.class, bundle, 1, true);
                    C24848g0 c24848g026 = C24848g0.f119245a;
                    break;
                }
                break;
            case 28:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 55);
                C17487o0 m92662fJ25 = baseZaloView.m92662fJ();
                if (m92662fJ25 != null) {
                    m92662fJ25.m93069k2(SettingAccountAndSecurityV2View.class, bundle, 1, true);
                    C24848g0 c24848g027 = C24848g0.f119245a;
                    break;
                }
                break;
            case 29:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 90);
                C17487o0 m92662fJ26 = baseZaloView.m92662fJ();
                if (m92662fJ26 != null) {
                    m92662fJ26.m93069k2(SettingPrivateV2View.class, bundle, 1, true);
                    C24848g0 c24848g028 = C24848g0.f119245a;
                    break;
                }
                break;
            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                c19335k = this;
                c19325g12 = c19325g1;
                InterfaceC27218a m92676n23 = baseZaloView.m92676n2();
                if (m92676n23 != null) {
                    m92676n23.mo35573l4(SwitchAccountView.class, bundle, 1, true);
                    C24848g0 c24848g029 = C24848g0.f119245a;
                    break;
                }
                break;
            case 31:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 57);
                C17487o0 m92662fJ27 = baseZaloView.m92662fJ();
                if (m92662fJ27 != null) {
                    m92662fJ27.m93069k2(SettingAccountAndSecurityV2View.class, bundle, 1, true);
                    C24848g0 c24848g030 = C24848g0.f119245a;
                    break;
                }
                break;
            case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 52);
                C17487o0 m92662fJ28 = baseZaloView.m92662fJ();
                if (m92662fJ28 != null) {
                    m92662fJ28.m93069k2(SettingAccountAndSecurityV2View.class, bundle, 1, true);
                    C24848g0 c24848g031 = C24848g0.f119245a;
                    break;
                }
                break;
            case 33:
            case 34:
            case 35:
            case 36:
            case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
            case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
            case 68:
            case 69:
            case 70:
            case 74:
            case 107:
            case 118:
            case 121:
            case ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422 /* 122 */:
            default:
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 37:
                c19325g12 = c19325g1;
                c19335k = this;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 10);
                C17487o0 m92662fJ29 = baseZaloView.m92662fJ();
                if (m92662fJ29 != null) {
                    m92662fJ29.m93069k2(SettingNotificationV2View.class, bundle, 1, true);
                    C24848g0 c24848g032 = C24848g0.f119245a;
                    break;
                }
                break;
            case 38:
                c19325g12 = c19325g1;
                c19335k = this;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 11);
                C17487o0 m92662fJ30 = baseZaloView.m92662fJ();
                if (m92662fJ30 != null) {
                    m92662fJ30.m93069k2(SettingNotificationV2View.class, bundle, 1, true);
                    C24848g0 c24848g033 = C24848g0.f119245a;
                    break;
                }
                break;
            case 39:
                c19335k = this;
                c19325g12 = c19325g1;
                C17487o0 m92662fJ31 = baseZaloView.m92662fJ();
                if (m92662fJ31 != null) {
                    m92662fJ31.m93069k2(SettingGroupView.class, bundle, 1, true);
                    C24848g0 c24848g034 = C24848g0.f119245a;
                    break;
                }
                break;
            case 40:
                c19325g12 = c19325g1;
                c19335k = this;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 62);
                C17487o0 m92662fJ32 = baseZaloView.m92662fJ();
                if (m92662fJ32 != null) {
                    m92662fJ32.m93069k2(SettingNotificationV2View.class, bundle, 1, true);
                    C24848g0 c24848g035 = C24848g0.f119245a;
                    break;
                }
                break;
            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                c19325g12 = c19325g1;
                c19335k = this;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 12);
                C17487o0 m92662fJ33 = baseZaloView.m92662fJ();
                if (m92662fJ33 != null) {
                    m92662fJ33.m93069k2(SettingNotificationV2View.class, bundle, 1, true);
                    C24848g0 c24848g036 = C24848g0.f119245a;
                    break;
                }
                break;
            case 42:
                c19325g12 = c19325g1;
                c19335k = this;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 13);
                C17487o0 m92662fJ34 = baseZaloView.m92662fJ();
                if (m92662fJ34 != null) {
                    m92662fJ34.m93069k2(SettingNotificationV2View.class, bundle, 1, true);
                    C24848g0 c24848g037 = C24848g0.f119245a;
                    break;
                }
                break;
            case 43:
                c19325g12 = c19325g1;
                c19335k = this;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 14);
                C17487o0 m92662fJ35 = baseZaloView.m92662fJ();
                if (m92662fJ35 != null) {
                    m92662fJ35.m93069k2(SettingNotificationV2View.class, bundle, 1, true);
                    C24848g0 c24848g038 = C24848g0.f119245a;
                    break;
                }
                break;
            case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                c19325g12 = c19325g1;
                c19335k = this;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 63);
                C17487o0 m92662fJ36 = baseZaloView.m92662fJ();
                if (m92662fJ36 != null) {
                    m92662fJ36.m93069k2(SettingNotificationV2View.class, bundle, 1, true);
                    C24848g0 c24848g039 = C24848g0.f119245a;
                    break;
                }
                break;
            case 45:
                c19335k = this;
                c19325g12 = c19325g1;
                Intent intent = new Intent();
                if (Build.VERSION.SDK_INT >= 26) {
                    intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                    intent.putExtra("android.provider.extra.APP_PACKAGE", MainApplication.Companion.m35500c().getPackageName());
                } else {
                    intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                    MainApplication.C6895a c6895a = MainApplication.Companion;
                    intent.putExtra("app_package", c6895a.m35500c().getPackageName());
                    intent.putExtra("app_uid", c6895a.m35500c().getApplicationInfo().uid);
                }
                InterfaceC27218a m92676n24 = baseZaloView.m92676n2();
                if (m92676n24 != null) {
                    m92676n24.startActivity(intent);
                    C24848g0 c24848g040 = C24848g0.f119245a;
                    break;
                }
                break;
            case 46:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 15);
                C17487o0 m92662fJ37 = baseZaloView.m92662fJ();
                if (m92662fJ37 != null) {
                    m92662fJ37.m93069k2(SettingMessageV2View.class, bundle, 1, true);
                    C24848g0 c24848g041 = C24848g0.f119245a;
                    break;
                }
                break;
            case 47:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 22);
                C17487o0 m92662fJ38 = baseZaloView.m92662fJ();
                if (m92662fJ38 != null) {
                    m92662fJ38.m93069k2(SettingMessageV2View.class, bundle, 1, true);
                    C24848g0 c24848g042 = C24848g0.f119245a;
                    break;
                }
                break;
            case 48:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 16);
                C17487o0 m92662fJ39 = baseZaloView.m92662fJ();
                if (m92662fJ39 != null) {
                    m92662fJ39.m93069k2(SettingMessageV2View.class, bundle, 1, true);
                    C24848g0 c24848g043 = C24848g0.f119245a;
                    break;
                }
                break;
            case 49:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 92);
                C17487o0 m92662fJ40 = baseZaloView.m92662fJ();
                if (m92662fJ40 != null) {
                    m92662fJ40.m93069k2(SettingMessageV2View.class, bundle, 1, true);
                    C24848g0 c24848g044 = C24848g0.f119245a;
                    break;
                }
                break;
            case 50:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 67);
                C17487o0 m92662fJ41 = baseZaloView.m92662fJ();
                if (m92662fJ41 != null) {
                    m92662fJ41.m93069k2(SettingMessageV2View.class, bundle, 1, true);
                    C24848g0 c24848g045 = C24848g0.f119245a;
                    break;
                }
                break;
            case 51:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 68);
                C17487o0 m92662fJ42 = baseZaloView.m92662fJ();
                if (m92662fJ42 != null) {
                    m92662fJ42.m93069k2(SettingBlockAndHideView.class, bundle, 1, true);
                    C24848g0 c24848g046 = C24848g0.f119245a;
                    break;
                }
                break;
            case 52:
                c19335k = this;
                c19325g12 = c19325g1;
                C17487o0 m92662fJ43 = baseZaloView.m92662fJ();
                if (m92662fJ43 != null) {
                    m92662fJ43.m93069k2(SettingHiddenChatView.class, bundle, 1, true);
                    C24848g0 c24848g047 = C24848g0.f119245a;
                    break;
                }
                break;
            case 53:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 20);
                C17487o0 m92662fJ44 = baseZaloView.m92662fJ();
                if (m92662fJ44 != null) {
                    m92662fJ44.m93069k2(SettingCallV2View.class, bundle, 1, true);
                    C24848g0 c24848g048 = C24848g0.f119245a;
                    break;
                }
                break;
            case 54:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 94);
                C17487o0 m92662fJ45 = baseZaloView.m92662fJ();
                if (m92662fJ45 != null) {
                    m92662fJ45.m93069k2(SettingCallV2View.class, bundle, 1, true);
                    C24848g0 c24848g049 = C24848g0.f119245a;
                    break;
                }
                break;
            case 55:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 95);
                C17487o0 m92662fJ46 = baseZaloView.m92662fJ();
                if (m92662fJ46 != null) {
                    m92662fJ46.m93069k2(SettingCallV2View.class, bundle, 1, true);
                    C24848g0 c24848g050 = C24848g0.f119245a;
                    break;
                }
                break;
            case 56:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 149);
                C17487o0 m92662fJ47 = baseZaloView.m92662fJ();
                if (m92662fJ47 != null) {
                    m92662fJ47.m93069k2(SettingCallV2View.class, bundle, 1, true);
                    C24848g0 c24848g051 = C24848g0.f119245a;
                    break;
                }
                break;
            case 57:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 73);
                C17487o0 m92662fJ48 = baseZaloView.m92662fJ();
                if (m92662fJ48 != null) {
                    m92662fJ48.m93069k2(SettingTimelineV2View.class, bundle, 1, true);
                    C24848g0 c24848g052 = C24848g0.f119245a;
                    break;
                }
                break;
            case 58:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 103);
                C17487o0 m92662fJ49 = baseZaloView.m92662fJ();
                if (m92662fJ49 != null) {
                    m92662fJ49.m93069k2(SettingTimelineV2View.class, bundle, 1, true);
                    C24848g0 c24848g053 = C24848g0.f119245a;
                    break;
                }
                break;
            case 59:
            case 82:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 117);
                C17487o0 m92662fJ50 = baseZaloView.m92662fJ();
                if (m92662fJ50 != null) {
                    m92662fJ50.m93069k2(SettingBlockAndHideView.class, bundle, 1, true);
                    C24848g0 c24848g054 = C24848g0.f119245a;
                    break;
                }
                break;
            case 60:
            case 83:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 118);
                C17487o0 m92662fJ51 = baseZaloView.m92662fJ();
                if (m92662fJ51 != null) {
                    m92662fJ51.m93069k2(SettingBlockAndHideView.class, bundle, 1, true);
                    C24848g0 c24848g055 = C24848g0.f119245a;
                    break;
                }
                break;
            case 61:
            case 84:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 119);
                C17487o0 m92662fJ52 = baseZaloView.m92662fJ();
                if (m92662fJ52 != null) {
                    m92662fJ52.m93069k2(SettingBlockAndHideView.class, bundle, 1, true);
                    C24848g0 c24848g056 = C24848g0.f119245a;
                    break;
                }
                break;
            case 62:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 79);
                C17487o0 m92662fJ53 = baseZaloView.m92662fJ();
                if (m92662fJ53 != null) {
                    m92662fJ53.m93069k2(SettingThemeV2View.class, bundle, 1, true);
                    C24848g0 c24848g057 = C24848g0.f119245a;
                    break;
                }
                break;
            case 63:
                c19335k = this;
                c19325g12 = c19325g1;
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 80);
                C17487o0 m92662fJ54 = baseZaloView.m92662fJ();
                if (m92662fJ54 != null) {
                    m92662fJ54.m93069k2(SettingThemeV2View.class, bundle, 1, true);
                    C24848g0 c24848g058 = C24848g0.f119245a;
                    break;
                }
                break;
            case 64:
                c19335k = this;
                c19325g12 = c19325g1;
                InterfaceC27218a m92676n25 = baseZaloView.m92676n2();
                if (m92676n25 != null && (mo35579p = m92676n25.mo35579p()) != null) {
                    mo35579p.m93069k2(SettingFontSizeView.class, bundle, 1, true);
                    C24848g0 c24848g059 = C24848g0.f119245a;
                    break;
                }
                break;
            case 65:
                c19335k = this;
                c19325g12 = c19325g1;
                ZaloWebView.Companion.m87168C(baseZaloView.m92676n2(), AbstractC23306f.m120583H().m110204g().m116318j());
                break;
            case 71:
            case 102:
                c19335k = this;
                c19325g12 = c19325g1;
                c19335k.m101283s(c19325g12, baseZaloView);
                break;
            case 72:
            case 73:
            case ZVideoUtilMetadata.FF_PROFILE_H264_MAIN /* 77 */:
            case 78:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 78);
                C17487o0 m92662fJ55 = baseZaloView.m92662fJ();
                if (m92662fJ55 != null) {
                    m92662fJ55.m93069k2(SettingThemeV2View.class, bundle, 1, true);
                    C24848g0 c24848g060 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 75:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 70);
                C17487o0 m92662fJ56 = baseZaloView.m92662fJ();
                if (m92662fJ56 != null) {
                    m92662fJ56.m93069k2(SettingHiddenChatView.class, bundle, 1, true);
                    C24848g0 c24848g061 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 76:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 71);
                C17487o0 m92662fJ57 = baseZaloView.m92662fJ();
                if (m92662fJ57 != null) {
                    m92662fJ57.m93069k2(SettingHiddenChatView.class, bundle, 1, true);
                    C24848g0 c24848g062 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 79:
                if (C20912a.Companion.m109411a().m109405l()) {
                    InterfaceC27218a m92676n26 = baseZaloView.m92676n2();
                    if (m92676n26 != null) {
                        m92676n26.mo35573l4(ToolStorageView.class, bundle, 1, true);
                        C24848g0 c24848g063 = C24848g0.f119245a;
                    }
                } else {
                    InterfaceC27218a m92676n27 = baseZaloView.m92676n2();
                    if (m92676n27 != null) {
                        m92676n27.mo35573l4(StorageSummaryView.class, bundle, 1, true);
                        C24848g0 c24848g064 = C24848g0.f119245a;
                    }
                }
                C31747a.m152721t("global_search");
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 80:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 108);
                C17487o0 m92662fJ58 = baseZaloView.m92662fJ();
                if (m92662fJ58 != null) {
                    m92662fJ58.m93069k2(SettingPrivateV2View.class, bundle, 1, true);
                    C24848g0 c24848g065 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 81:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 114);
                C17487o0 m92662fJ59 = baseZaloView.m92662fJ();
                if (m92662fJ59 != null) {
                    m92662fJ59.m93069k2(SettingMessageV2View.class, bundle, 1, true);
                    C24848g0 c24848g066 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 85:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 120);
                C17487o0 m92662fJ60 = baseZaloView.m92662fJ();
                if (m92662fJ60 != null) {
                    m92662fJ60.m93069k2(SettingUtilitiesView.class, bundle, 1, true);
                    C24848g0 c24848g067 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 86:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 121);
                C17487o0 m92662fJ61 = baseZaloView.m92662fJ();
                if (m92662fJ61 != null) {
                    m92662fJ61.m93069k2(SettingAccountAndSecurityV2View.class, bundle, 1, true);
                    C24848g0 c24848g068 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 87:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 115);
                C17487o0 m92662fJ62 = baseZaloView.m92662fJ();
                if (m92662fJ62 != null) {
                    m92662fJ62.m93069k2(SettingFeedPrivacyView.class, bundle, 1, true);
                    C24848g0 c24848g069 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 88:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 124);
                C17487o0 m92662fJ63 = baseZaloView.m92662fJ();
                if (m92662fJ63 != null) {
                    m92662fJ63.m93069k2(SettingCallV2View.class, bundle, 1, true);
                    C24848g0 c24848g070 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 89:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 126);
                C17487o0 m92662fJ64 = baseZaloView.m92662fJ();
                if (m92662fJ64 != null) {
                    m92662fJ64.m93069k2(SettingAccountAndSecurityV2View.class, bundle, 1, true);
                    C24848g0 c24848g071 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 90:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 129);
                C17487o0 m92662fJ65 = baseZaloView.m92662fJ();
                if (m92662fJ65 != null) {
                    m92662fJ65.m93069k2(SettingCallV2View.class, bundle, 1, true);
                    C24848g0 c24848g072 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 91:
                bundle.putString("STR_SOURCE_START_VIEW", "setting");
                C17487o0 m92662fJ66 = baseZaloView.m92662fJ();
                if (m92662fJ66 != null) {
                    m92662fJ66.m93069k2(QuickMessageListingFullView.class, bundle, 1, true);
                    C24848g0 c24848g073 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 92:
                bundle.putString("STR_SOURCE_START_VIEW", "setting");
                C17487o0 m92662fJ67 = baseZaloView.m92662fJ();
                if (m92662fJ67 != null) {
                    m92662fJ67.m93069k2(AutoReplyListingView.class, bundle, 1, true);
                    C24848g0 c24848g074 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 93:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 131);
                C17487o0 m92662fJ68 = baseZaloView.m92662fJ();
                if (m92662fJ68 != null) {
                    m92662fJ68.m93069k2(SettingNotificationV2View.class, bundle, 1, true);
                    C24848g0 c24848g075 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 94:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 132);
                C17487o0 m92662fJ69 = baseZaloView.m92662fJ();
                if (m92662fJ69 != null) {
                    m92662fJ69.m93069k2(SettingNotificationV2View.class, bundle, 1, true);
                    C24848g0 c24848g076 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 95:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 128);
                C22438j.m115953v(baseZaloView.m92662fJ(), bundle);
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 96:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 133);
                C17487o0 m92662fJ70 = baseZaloView.m92662fJ();
                if (m92662fJ70 != null) {
                    m92662fJ70.m93069k2(SettingPrivateV2View.class, bundle, 1, true);
                    C24848g0 c24848g077 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 97:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 134);
                C17487o0 m92662fJ71 = baseZaloView.m92662fJ();
                if (m92662fJ71 != null) {
                    m92662fJ71.m93069k2(SettingPrivateV2View.class, bundle, 1, true);
                    C24848g0 c24848g078 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 98:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 135);
                C17487o0 m92662fJ72 = baseZaloView.m92662fJ();
                if (m92662fJ72 != null) {
                    m92662fJ72.m93069k2(SettingPrivateV2View.class, bundle, 1, true);
                    C24848g0 c24848g079 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 99:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 0);
                C17487o0 m92662fJ73 = baseZaloView.m92662fJ();
                if (m92662fJ73 != null) {
                    m92662fJ73.m93069k2(SettingManageSourceFriendView.class, bundle, 1, true);
                    C24848g0 c24848g080 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 100:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4);
                C17487o0 m92662fJ74 = baseZaloView.m92662fJ();
                if (m92662fJ74 != null) {
                    m92662fJ74.m93069k2(SettingManageSourceFriendView.class, bundle, 1, true);
                    C24848g0 c24848g081 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 101:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 136);
                C17487o0 m92662fJ75 = baseZaloView.m92662fJ();
                if (m92662fJ75 != null) {
                    m92662fJ75.m93069k2(SettingUtilitiesView.class, bundle, 1, true);
                    C24848g0 c24848g082 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 103:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 138);
                C17487o0 m92662fJ76 = baseZaloView.m92662fJ();
                if (m92662fJ76 != null) {
                    m92662fJ76.m93069k2(SettingMessageV2View.class, bundle, 1, true);
                    C24848g0 c24848g083 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 104:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 139);
                C17487o0 m92662fJ77 = baseZaloView.m92662fJ();
                if (m92662fJ77 != null) {
                    m92662fJ77.m93069k2(SettingMessageV2View.class, bundle, 1, true);
                    C24848g0 c24848g084 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 105:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 140);
                C17487o0 m92662fJ78 = baseZaloView.m92662fJ();
                if (m92662fJ78 != null) {
                    m92662fJ78.m93069k2(SettingMessageV2View.class, bundle, 1, true);
                    C24848g0 c24848g085 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 106:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 93);
                C17487o0 m92662fJ79 = baseZaloView.m92662fJ();
                if (m92662fJ79 != null) {
                    m92662fJ79.m93069k2(SettingMessageV2View.class, bundle, 1, true);
                    C24848g0 c24848g086 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 108:
                bundle.putString("STR_SOURCE_START_VIEW", "setting");
                C17487o0 m92662fJ80 = baseZaloView.m92662fJ();
                if (m92662fJ80 != null) {
                    m92662fJ80.m93069k2(ManageConversationLabelSetting.class, bundle, 1, true);
                    C24848g0 c24848g087 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 109:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 117);
                C17487o0 m92662fJ81 = baseZaloView.m92662fJ();
                if (m92662fJ81 != null) {
                    m92662fJ81.m93069k2(SettingTimelineV2View.class, bundle, 1, true);
                    C24848g0 c24848g088 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10 /* 110 */:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 81);
                C17487o0 m92662fJ82 = baseZaloView.m92662fJ();
                if (m92662fJ82 != null) {
                    m92662fJ82.m93069k2(AboutView.class, bundle, 1, true);
                    C24848g0 c24848g089 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 111:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 88);
                C17487o0 m92662fJ83 = baseZaloView.m92662fJ();
                if (m92662fJ83 != null) {
                    m92662fJ83.m93069k2(AboutView.class, bundle, 1, true);
                    C24848g0 c24848g090 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 112:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 85);
                C17487o0 m92662fJ84 = baseZaloView.m92662fJ();
                if (m92662fJ84 != null) {
                    m92662fJ84.m93069k2(AboutView.class, bundle, 1, true);
                    C24848g0 c24848g091 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 113:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 141);
                bundle.putInt("EXTRA_SOURCE_FROM", 8);
                C17487o0 m92662fJ85 = baseZaloView.m92662fJ();
                if (m92662fJ85 != null) {
                    m92662fJ85.m93069k2(SettingTimelineV2View.class, bundle, 1, true);
                    C24848g0 c24848g092 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 114:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 143);
                C17487o0 m92662fJ86 = baseZaloView.m92662fJ();
                if (m92662fJ86 != null) {
                    m92662fJ86.m93069k2(SettingUtilitiesView.class, bundle, 1, true);
                    C24848g0 c24848g093 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 115:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444);
                C17487o0 m92662fJ87 = baseZaloView.m92662fJ();
                if (m92662fJ87 != null) {
                    m92662fJ87.m93069k2(SettingAccountAndSecurityV2View.class, bundle, 1, true);
                    C24848g0 c24848g094 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 116:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP);
                C17487o0 m92662fJ88 = baseZaloView.m92662fJ();
                if (m92662fJ88 != null) {
                    m92662fJ88.m93069k2(SettingBirthday.class, bundle, 1, true);
                    C24848g0 c24848g095 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 117:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 141);
                C17487o0 m92662fJ89 = baseZaloView.m92662fJ();
                if (m92662fJ89 != null) {
                    m92662fJ89.m93069k2(SettingBlockAndHideView.class, bundle, 1, true);
                    C24848g0 c24848g096 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 119:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 147);
                C17487o0 m92662fJ90 = baseZaloView.m92662fJ();
                if (m92662fJ90 != null) {
                    m92662fJ90.m93069k2(SettingBirthday.class, bundle, 1, true);
                    C24848g0 c24848g097 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 120:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 148);
                C17487o0 m92662fJ91 = baseZaloView.m92662fJ();
                if (m92662fJ91 != null) {
                    m92662fJ91.m93069k2(SettingAccountAndSecurityV2View.class, bundle, 1, true);
                    C24848g0 c24848g098 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
            case 123:
                bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 125);
                C17487o0 m92662fJ92 = baseZaloView.m92662fJ();
                if (m92662fJ92 != null) {
                    m92662fJ92.m93069k2(ZCloudHomeView.class, bundle, 1, true);
                    C24848g0 c24848g099 = C24848g0.f119245a;
                }
                c19335k = this;
                c19325g12 = c19325g1;
                break;
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ga0.i

            /* renamed from: q */
            public final /* synthetic */ AbstractC29069a.v f96045q;

            /* renamed from: r */
            public final /* synthetic */ int f96046r;

            /* renamed from: s */
            public final /* synthetic */ C19335k f96047s;

            public /* synthetic */ RunnableC19329i(AbstractC29069a.v vVar2, int i112, C19335k c19335k2) {
                r2 = vVar2;
                r3 = i112;
                r4 = c19335k2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19335k.m101287z(C19325g1.this, r2, r3, r4);
            }
        });
    }

    /* renamed from: z */
    public static final void m101287z(C19325g1 c19325g1, AbstractC29069a.v vVar, int i11, C19335k c19335k) {
        AbstractC19074t.m100208f(c19325g1, "$sessionData");
        AbstractC19074t.m100208f(vVar, "$data");
        AbstractC19074t.m100208f(c19335k, "this$0");
        C7960e m41971c6 = C7960e.m41971c6();
        m41971c6.m42211N7(vVar.m145222b().mo2478b(), System.currentTimeMillis());
        m41971c6.m42423i8(c19335k.f96057t, vVar.m145222b().mo2478b(), vVar.m145222b().f148372A, vVar.m145222b().f148373B);
        C23024b7.f111993a.m118075x(c19325g1);
        AbstractC19444a.m101695c(new Runnable() { // from class: ga0.j
            public /* synthetic */ RunnableC19332j() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19335k.m101270A(C19335k.this);
            }
        });
        C19955h.f98250a.m103730s(c19325g1, vVar, i11, 1);
    }

    @Override // ga0.AbstractRunnableC19355q1, java.lang.Runnable
    public void run() {
        Object obj;
        C19325g1 c19325g1;
        Object obj2;
        BaseZaloView baseZaloView;
        C18316b c18316b;
        C18316b c18316b2;
        InterfaceC18319c m101438e = m101438e();
        if (m101438e != null && (c18316b2 = (C18316b) m101438e.mo205i9(new C18316b("Search.GetSearchSessionData", null, null, null, 14, null))) != null) {
            obj = c18316b2.m97245a();
        } else {
            obj = null;
        }
        if (obj instanceof C19325g1) {
            c19325g1 = (C19325g1) obj;
        } else {
            c19325g1 = null;
        }
        if (c19325g1 == null) {
            return;
        }
        InterfaceC18319c m101438e2 = m101438e();
        if (m101438e2 != null && (c18316b = (C18316b) m101438e2.mo205i9(new C18316b("GET_BOUND_ZALO_VIEW", null, null, null, 14, null))) != null) {
            obj2 = c18316b.m97245a();
        } else {
            obj2 = null;
        }
        if (obj2 instanceof BaseZaloView) {
            baseZaloView = (BaseZaloView) obj2;
        } else {
            baseZaloView = null;
        }
        if (baseZaloView == null) {
            return;
        }
        String m97246b = this.f96056s.m97246b();
        if (AbstractC19074t.m100204b(m97246b, "Search.Result.ClickItem")) {
            if ((this.f96056s.m97245a() instanceof AbstractC29069a.v) && (this.f96056s.m97247c() instanceof Integer)) {
                m101286y(c19325g1, (AbstractC29069a.v) this.f96056s.m97245a(), ((Number) this.f96056s.m97247c()).intValue(), baseZaloView);
                return;
            }
            return;
        }
        if (AbstractC19074t.m100204b(m97246b, "ACTION_ON_CREATE_DIALOG_SETTING")) {
            Object m97245a = this.f96056s.m97245a();
            if (AbstractC19074t.m100204b(m97245a, 2)) {
                C8009j.a aVar = new C8009j.a(baseZaloView.m92648SI());
                View inflate = LayoutInflater.from(baseZaloView.getContext()).inflate(AbstractC7409c0.content_dialog_unmap, (ViewGroup) null, false);
                aVar.m43177z(inflate);
                if (!TextUtils.isEmpty(c19325g1.m101205c())) {
                    View findViewById = inflate.findViewById(AbstractC6918a0.tvContent);
                    AbstractC19074t.m100206d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
                    ((TextView) findViewById).setText(c19325g1.m101205c());
                }
                inflate.findViewById(AbstractC6918a0.btn_close).setOnClickListener(new View.OnClickListener() { // from class: ga0.e
                    public /* synthetic */ ViewOnClickListenerC19317e() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C19335k.m101272C(BaseZaloView.this, view);
                    }
                });
                inflate.findViewById(AbstractC6918a0.btn_change_phone).setOnClickListener(new View.OnClickListener() { // from class: ga0.f

                    /* renamed from: q */
                    public final /* synthetic */ C19335k f95935q;

                    /* renamed from: r */
                    public final /* synthetic */ C19325g1 f95936r;

                    public /* synthetic */ ViewOnClickListenerC19320f(C19335k this, C19325g1 c19325g12) {
                        r2 = this;
                        r3 = c19325g12;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C19335k.m101273D(BaseZaloView.this, r2, r3, view);
                    }
                });
                inflate.findViewById(AbstractC6918a0.see_more).setOnClickListener(new View.OnClickListener() { // from class: ga0.g
                    public /* synthetic */ ViewOnClickListenerC19323g() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C19335k.m101274E(BaseZaloView.this, view);
                    }
                });
                this.f96058u = new C18316b("RETURN_RESULT", aVar.m43152a(), null, null, 12, null);
                return;
            }
            if (AbstractC19074t.m100204b(m97245a, 1)) {
                C8009j.a aVar2 = new C8009j.a(baseZaloView.m92648SI());
                aVar2.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_deactive_account)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), new InterfaceC17463d.d() { // from class: ga0.h
                    public /* synthetic */ C19326h() {
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                        C19335k.m101275F(BaseZaloView.this, interfaceC17463d, i11);
                    }
                });
                this.f96058u = new C18316b("RETURN_RESULT", aVar2.m43152a(), null, null, 12, null);
            }
        }
    }

    /* renamed from: t */
    public final void m101288t(C19325g1 c19325g1, int i11, BaseZaloView baseZaloView) {
        AbstractC19074t.m100208f(c19325g1, "<this>");
        AbstractC19074t.m100208f(baseZaloView, "zaloView");
        try {
            if (c19325g1.m101183I()) {
                return;
            }
            baseZaloView.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new a(c19325g1, baseZaloView, this));
            c19325g1.m101210e0(true);
            TrackingSource m114310H = C21927m.m114302u().m114310H(String.valueOf(i11));
            if (m114310H == null) {
                m114310H = new TrackingSource(-1);
            }
            c0766k.mo1578Y4(i11, m114310H);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: w */
    public final C18316b m101289w() {
        return this.f96058u;
    }
}
