package com.zing.zalo.p077ui.settings;

import ae.C0766k;
import ag0.C0824j;
import am.AbstractC0939u;
import am.C0927o;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import b50.AbstractC2557e;
import b50.C2556d;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2810d;
import ch0.AbstractC3489d;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.bottomsheet.LogoutConfirmView;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.settings.SettingV2View;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.toolstorage.overview.ToolStorageView;
import com.zing.zalo.p077ui.toolstoragev1.summary.StorageSummaryView;
import com.zing.zalo.p077ui.zalocloud.home.ZCloudHomeView;
import com.zing.zalo.p077ui.zalocloud.restore.C13958c;
import com.zing.zalo.p077ui.zviews.ChangePasswordView;
import com.zing.zalo.p077ui.zviews.SearchSettingView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.register.StartUpNewView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zdesign.component.Badge;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.C16974f;
import com.zing.zalo.zdesign.component.EnumC16991i;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import j30.C20912a;
import java.util.Map;
import la0.C22229g7;
import me0.AbstractC23136l9;
import me0.AbstractC23138m0;
import me0.AbstractC23148n;
import me0.AbstractC23179p8;
import me0.AbstractC23181q;
import me0.AbstractC23216t1;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p128ed.C18389d;
import p248iy.AbstractC20887g;
import p304ks.C21927m;
import p320ld.C22436h;
import p320ld.C22438j;
import p320ld.C22447s;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import p649xl.C29912lc;
import p716zh.C31965ic;
import pm0.C24848g0;
import r00.AbstractC25598c;
import s00.AbstractC26084s;
import sa0.C26209i;
import tb0.C26626l;
import ui0.C27280g;
import v50.C27870vb;
import vg.AbstractC28025b8;
import vg.C28203u6;
import vg.C28212v6;
import za0.C31747a;

/* loaded from: classes6.dex */
public final class SettingV2View extends BaseSettingView {
    public static final C13180a Companion = new C13180a(null);

    /* renamed from: T0 */
    public C29912lc f67988T0;

    /* renamed from: U0 */
    private ContactProfile f67989U0;

    /* renamed from: V0 */
    private ActionBarMenuItem f67990V0;

    /* renamed from: W0 */
    private C13306b f67991W0;

    /* renamed from: Z0 */
    private boolean f67994Z0;

    /* renamed from: a1 */
    private boolean f67995a1;

    /* renamed from: b1 */
    private boolean f67996b1;

    /* renamed from: X0 */
    private C13306b.c f67992X0 = new C13184e();

    /* renamed from: Y0 */
    private String f67993Y0 = "";

    /* renamed from: c1 */
    private final Object f67997c1 = new Object();

    /* renamed from: com.zing.zalo.ui.settings.SettingV2View$a */
    /* loaded from: classes6.dex */
    public static final class C13180a {
        private C13180a() {
        }

        public /* synthetic */ C13180a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingV2View$b */
    /* loaded from: classes6.dex */
    public static final class C13181b implements InterfaceC20094a {
        C13181b() {
        }

        /* renamed from: h */
        public static final void m74248h(SettingV2View settingV2View) {
            AbstractC19074t.m100208f(settingV2View, "this$0");
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("password_mode", 0);
                bundle.putBoolean("logout_case", true);
                C17487o0 m92662fJ = settingV2View.m92662fJ();
                if (m92662fJ != null) {
                    m92662fJ.m93066i2(ChangePasswordView.class, bundle, 3231, 1, true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: i */
        public static final void m74249i(SettingV2View settingV2View) {
            AbstractC19074t.m100208f(settingV2View, "this$0");
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_dialog_unmap);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            settingV2View.m74234EN(m118743r0);
            settingV2View.showDialog(1);
        }

        /* renamed from: j */
        public static final void m74250j(SettingV2View settingV2View) {
            AbstractC19074t.m100208f(settingV2View, "this$0");
            try {
                Bundle bundle = new Bundle();
                bundle.putBoolean("BOL_EXTRA_LOGOUT_GET_FLOW_LOGIN", true);
                bundle.putInt("SHOW_WITH_FLAGS", 67108864);
                C17487o0 m92662fJ = settingV2View.m92662fJ();
                if (m92662fJ != null) {
                    m92662fJ.m93069k2(StartUpNewView.class, bundle, 2, true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: k */
        public static final void m74251k(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        /* renamed from: l */
        public static final void m74252l(SettingV2View settingV2View) {
            AbstractC19074t.m100208f(settingV2View, "this$0");
            try {
                Bundle bundle = new Bundle();
                bundle.putBoolean("BOL_EXTRA_LOGOUT_GET_FLOW_LOGIN", true);
                bundle.putInt("SHOW_WITH_FLAGS", 67108864);
                C17487o0 m92662fJ = settingV2View.m92662fJ();
                if (m92662fJ != null) {
                    m92662fJ.m93069k2(StartUpNewView.class, bundle, 2, true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo926a(C20096c c20096c) {
            Object obj;
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                try {
                } catch (Exception e11) {
                    e11.printStackTrace();
                    obj = SettingV2View.this.f67997c1;
                    SettingV2View settingV2View = SettingV2View.this;
                    synchronized (obj) {
                        settingV2View.f67996b1 = false;
                        settingV2View.f72421L0.mo49315c4();
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    }
                }
                if (AbstractC23216t1.m119643h(SettingV2View.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: la0.c7
                    @Override // me0.AbstractC23216t1.d
                    /* renamed from: a */
                    public final void mo68088a(String str) {
                        SettingV2View.C13181b.m74251k(str);
                    }
                })) {
                    Object obj2 = SettingV2View.this.f67997c1;
                    SettingV2View settingV2View2 = SettingV2View.this;
                    synchronized (obj2) {
                        settingV2View2.f67996b1 = false;
                        settingV2View2.f72421L0.mo49315c4();
                        C24848g0 c24848g02 = C24848g0.f119245a;
                    }
                    return;
                }
                int m104491c = c20096c.m104491c();
                if (m104491c != 2020 && m104491c != 2028) {
                    switch (m104491c) {
                        case ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4 /* 2001 */:
                        case ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP /* 2002 */:
                        case ZAbstractBase.ZVU_PROCESS_VIDEO_TO_SEQUENCE_IMAGE /* 2003 */:
                        case ZAbstractBase.ZVU_PROCESS_HLS_TO_MP4 /* 2004 */:
                            break;
                        default:
                            ToastUtils.m89263k(c20096c);
                            break;
                    }
                    obj = SettingV2View.this.f67997c1;
                    SettingV2View settingV2View3 = SettingV2View.this;
                    synchronized (obj) {
                        settingV2View3.f67996b1 = false;
                        settingV2View3.f72421L0.mo49315c4();
                        C24848g0 c24848g03 = C24848g0.f119245a;
                        return;
                    }
                }
                AbstractC23179p8.m119426l(CoreUtility.f89233i);
                String str = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str, "currentUserUid");
                AbstractC20887g.m109232j(str, 9015, "", 0L, 9021, CoreUtility.f89236l);
                AbstractC23148n.m118852z();
                AbstractC23138m0.Companion.m118779f(false);
                InterfaceC27218a m92676n2 = SettingV2View.this.m92676n2();
                if (m92676n2 != null) {
                    m92676n2.runOnUiThread(new Runnable() { // from class: la0.d7
                        public /* synthetic */ RunnableC22202d7() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            SettingV2View.C13181b.m74252l(SettingV2View.this);
                        }
                    });
                }
                obj = SettingV2View.this.f67997c1;
                SettingV2View settingV2View32 = SettingV2View.this;
                synchronized (obj) {
                }
            } catch (Throwable th2) {
                Object obj3 = SettingV2View.this.f67997c1;
                SettingV2View settingV2View4 = SettingV2View.this;
                synchronized (obj3) {
                    settingV2View4.f67996b1 = false;
                    settingV2View4.f72421L0.mo49315c4();
                    C24848g0 c24848g04 = C24848g0.f119245a;
                    throw th2;
                }
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            Object obj2;
            int i11;
            int i12;
            SettingV2View settingV2View;
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                try {
                    JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                    if (optJSONObject != null) {
                        i12 = optJSONObject.optInt("unmap_profile", 0);
                        i11 = optJSONObject.optInt("is_set", 1);
                    } else {
                        i11 = 1;
                        i12 = 0;
                    }
                    if (i11 == 0) {
                        SettingV2View settingV2View2 = SettingV2View.this;
                        settingV2View2.mo70710wy(new Runnable() { // from class: la0.z6
                            public /* synthetic */ RunnableC22387z6() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingV2View.C13181b.m74248h(SettingV2View.this);
                            }
                        });
                    } else if (i12 == 1) {
                        SettingV2View settingV2View3 = SettingV2View.this;
                        settingV2View3.mo70710wy(new Runnable() { // from class: la0.a7
                            public /* synthetic */ RunnableC22175a7() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingV2View.C13181b.m74249i(SettingV2View.this);
                            }
                        });
                    } else {
                        AbstractC23179p8.m119426l(CoreUtility.f89233i);
                        String str = CoreUtility.f89233i;
                        AbstractC19074t.m100207e(str, "currentUserUid");
                        AbstractC20887g.m109232j(str, 9015, "", 0L, 9021, CoreUtility.f89236l);
                        AbstractC23148n.m118852z();
                        AbstractC23138m0.Companion.m118779f(false);
                        SettingV2View settingV2View4 = SettingV2View.this;
                        settingV2View4.mo70710wy(new Runnable() { // from class: la0.b7
                            public /* synthetic */ RunnableC22184b7() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingV2View.C13181b.m74250j(SettingV2View.this);
                            }
                        });
                    }
                    obj2 = SettingV2View.this.f67997c1;
                    settingV2View = SettingV2View.this;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    obj2 = SettingV2View.this.f67997c1;
                    SettingV2View settingV2View5 = SettingV2View.this;
                    synchronized (obj2) {
                        settingV2View5.f67996b1 = false;
                        settingV2View5.f72421L0.mo49315c4();
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    }
                }
                synchronized (obj2) {
                    settingV2View.f67996b1 = false;
                    settingV2View.f72421L0.mo49315c4();
                    C24848g0 c24848g02 = C24848g0.f119245a;
                }
            } catch (Throwable th2) {
                Object obj3 = SettingV2View.this.f67997c1;
                SettingV2View settingV2View6 = SettingV2View.this;
                synchronized (obj3) {
                    settingV2View6.f67996b1 = false;
                    settingV2View6.f72421L0.mo49315c4();
                    C24848g0 c24848g03 = C24848g0.f119245a;
                    throw th2;
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingV2View$c */
    /* loaded from: classes6.dex */
    public static final class C13182c implements InterfaceC20094a {

        /* renamed from: com.zing.zalo.ui.settings.SettingV2View$c$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f68000a;

            a(ContactProfile contactProfile) {
                this.f68000a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42349b8(this.f68000a);
            }
        }

        C13182c() {
        }

        /* renamed from: d */
        public static final void m74254d(SettingV2View settingV2View) {
            AbstractC19074t.m100208f(settingV2View, "this$0");
            settingV2View.m74242bN();
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
                SettingV2View.this.m74235FN(false);
                SettingV2View.this.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str;
            String str2;
            int i11;
            JSONObject optJSONObject;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("error_code") && jSONObject.has("data")) {
                        String string = jSONObject.getString("error_code");
                        AbstractC19074t.m100207e(string, "getString(...)");
                        if (Integer.parseInt(string) == 0 && SettingV2View.this.m74240YM() != null) {
                            ContactProfile m74240YM = SettingV2View.this.m74240YM();
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
                            AbstractC19074t.m100205c(m74240YM);
                            ContactProfile m74240YM2 = SettingV2View.this.m74240YM();
                            AbstractC19074t.m100205c(m74240YM2);
                            m74240YM.f42447v0 = m74240YM2.f42352K0;
                            m74240YM.f42441t0 = true;
                            m74240YM.f42456y0 = i11;
                            if (!TextUtils.isEmpty(str)) {
                                m74240YM.f42442t1 = str;
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                m74240YM.f42436r1 = new SpannableStringBuilder(str2);
                            }
                            if (C21927m.m114302u().m114357s() != null) {
                                if (!C21927m.m114302u().m114357s().m153137g(AbstractC23306f.m120583H().m110204g().m116322n())) {
                                    C21927m.m114302u().m114357s().add(m74240YM);
                                    C0824j.m2153b(new a(m74240YM));
                                } else if (C21927m.m114302u().m114357s().m153138j(AbstractC23306f.m120583H().m110204g().m116322n()) != null) {
                                    m74240YM = C21927m.m114302u().m114357s().m153138j(AbstractC23306f.m120583H().m110204g().m116322n());
                                    m74240YM.f42456y0 = i11;
                                    if (!TextUtils.isEmpty(str)) {
                                        m74240YM.f42442t1 = str;
                                    }
                                    if (!TextUtils.isEmpty(str2)) {
                                        m74240YM.f42436r1 = new SpannableStringBuilder(str2);
                                    }
                                }
                            }
                            Map map = AbstractC23304d.f113405l;
                            C31965ic c31965ic = (C31965ic) map.get(CoreUtility.f89233i);
                            if (c31965ic != null) {
                                int m153681a = c31965ic.m153681a() + 1;
                                Object obj2 = map.get(CoreUtility.f89233i);
                                AbstractC19074t.m100205c(obj2);
                                ((C31965ic) obj2).m153684d(m153681a);
                            }
                            C28203u6.f131407a.m141806D(AbstractC23306f.m120583H().m110204g().m116322n(), false);
                            AbstractC19074t.m100205c(m74240YM);
                            if (!TextUtils.isEmpty(m74240YM.f42434r)) {
                                AbstractC23181q.m119431d(m74240YM.f42434r, true);
                            }
                            SettingV2View settingV2View = SettingV2View.this;
                            settingV2View.mo70710wy(new Runnable() { // from class: la0.e7
                                public /* synthetic */ RunnableC22211e7() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    SettingV2View.C13182c.m74254d(SettingV2View.this);
                                }
                            });
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                SettingV2View.this.m74235FN(false);
                SettingV2View.this.f72421L0.mo78960q3();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingV2View$d */
    /* loaded from: classes6.dex */
    public static final class C13183d implements InterfaceC20094a {

        /* renamed from: com.zing.zalo.ui.settings.SettingV2View$d$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f68002a;

            a(ContactProfile contactProfile) {
                this.f68002a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42221O7(this.f68002a, true);
            }
        }

        C13183d() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            SettingV2View.this.f72421L0.mo78960q3();
            ToastUtils.m89264l(new C20096c(ZMediaPlayer.ZPLAYER_UNSUPPORTED_PROTOCOL, ""));
            SettingV2View.this.m74236GN(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            if (obj != null) {
                try {
                    try {
                        SettingV2View.this.m74237HN(new ContactProfile((JSONObject) obj));
                        ContactProfile m74240YM = SettingV2View.this.m74240YM();
                        AbstractC19074t.m100205c(m74240YM);
                        m74240YM.f42330D = System.currentTimeMillis();
                        if (SettingV2View.this.m74240YM() != null) {
                            C0824j.m2153b(new a(SettingV2View.this.m74240YM()));
                            SettingV2View.this.m74238WM(Integer.parseInt(AbstractC23306f.m120583H().m110204g().m116322n()));
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122776f(AboutView.Companion.m73531a(), e11);
                    }
                } finally {
                    SettingV2View.this.m74236GN(false);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingV2View$e */
    /* loaded from: classes6.dex */
    public static final class C13184e extends C13306b.c {
        C13184e() {
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: b */
        public void mo74255b(C26209i c26209i, String str, C28212v6 c28212v6) {
            boolean z11;
            ActionBarMenuItem m74241ZM;
            if (c28212v6 != null && c28212v6.m142167f() && c28212v6.f131580f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (AbstractC19074t.m100204b(str, "tip.suggestion.search.setting") && (m74241ZM = SettingV2View.this.m74241ZM()) != null) {
                m74241ZM.setEnableNoti(z11);
            }
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: f */
        public String[] mo66902f() {
            return new String[]{"tip.suggestion.search.setting"};
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: h */
        public C26209i mo66903h(String str) {
            AbstractC19074t.m100208f(str, "tipCat");
            if (AbstractC19074t.m100204b(str, "tip.suggestion.search.setting")) {
                return new C26209i(SettingV2View.this.m74241ZM());
            }
            return null;
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingV2View$f */
    /* loaded from: classes6.dex */
    public static final class C13185f extends AbstractC19075u implements InterfaceC18505l {
        C13185f() {
            super(1);
        }

        /* renamed from: a */
        public final void m74256a(long j11) {
            C26626l.m136659W(C26626l.Companion.m136712a(), SettingV2View.this.m92693xK(), SettingV2View.this.m92692wK(), j11, true, false, false, 48, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m74256a(((Number) obj).longValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingV2View$g */
    /* loaded from: classes6.dex */
    public static final class C13186g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13186g f68005q = new C13186g();

        C13186g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m74257a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m74257a() {
            C22438j.m115954w(C13958c.b.f71928t);
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingV2View$h */
    /* loaded from: classes6.dex */
    public static final class C13187h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13187h f68006q = new C13187h();

        C13187h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m74258a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m74258a() {
            C26626l.m136689z(C26626l.Companion.m136712a(), true, false, 2, null);
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingV2View$i */
    /* loaded from: classes6.dex */
    public static final class C13188i extends AbstractC19075u implements InterfaceC18494a {
        C13188i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m74259a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m74259a() {
            C17487o0 m92662fJ = SettingV2View.this.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.mo89694j2(ZCloudHomeView.class, new Bundle(), 0, "SMLZCloudHome", 1, true);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingV2View$j */
    /* loaded from: classes6.dex */
    public static final class C13189j extends ZdsActionBar.AbstractC16987c {
        C13189j() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            SettingV2View.this.finish();
        }
    }

    /* renamed from: AN */
    public static final void m74181AN(SettingV2View settingV2View, View view) {
        AbstractC19074t.m100208f(settingV2View, "this$0");
        settingV2View.removeDialog(1);
        InterfaceC27218a m92676n2 = settingV2View.m92676n2();
        if (m92676n2 != null) {
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_WEB_URL", AbstractC23306f.m120583H().m110204g().f110080o);
            ZaloWebView.Companion.m87171F(m92676n2, AbstractC23306f.m120583H().m110204g().f110080o, bundle);
            AbstractC23647d.m123897g("199718");
        }
    }

    /* renamed from: BN */
    private final void m74183BN(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                String str = SettingView.f68009r1;
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_SOURCE_ACTION", -1);
            C22438j.m115953v(m92662fJ(), bundle);
            return;
        }
        AbstractC23647d.m123897g("37801");
        m74204VM();
    }

    /* renamed from: CN */
    public static final void m74185CN(SettingV2View settingV2View, View view) {
        AbstractC19074t.m100208f(settingV2View, "this$0");
        AbstractC23647d.m123897g("800000");
        C17487o0 m92662fJ = settingV2View.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(SearchSettingView.class, null, 1, true);
        }
        AbstractC28025b8.m141442M("tip.suggestion.search.setting");
    }

    /* renamed from: UM */
    public static final void m74203UM(SettingV2View settingV2View) {
        AbstractC19074t.m100208f(settingV2View, "this$0");
        settingV2View.mo73553lM();
    }

    /* renamed from: VM */
    private final void m74204VM() {
        synchronized (this.f67997c1) {
            if (this.f67996b1) {
                this.f72421L0.mo49282B8(null, false);
                return;
            }
            this.f67996b1 = true;
            this.f72421L0.mo49282B8(null, false);
            C24848g0 c24848g0 = C24848g0.f119245a;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C13181b());
            c0766k.mo1436G7();
        }
    }

    /* renamed from: aN */
    private final void m74205aN(String str) {
        int i11;
        try {
            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
            this.f67989U0 = m141798e;
            if (m141798e != null) {
                AbstractC19074t.m100205c(m141798e);
                i11 = m141798e.f42385V0;
            } else {
                i11 = 0;
            }
            if (this.f67989U0 != null) {
                if (C21927m.m114302u().m114357s().m153137g(AbstractC23306f.m120583H().m110204g().m116322n())) {
                    m74242bN();
                    return;
                } else {
                    m74238WM(Integer.parseInt(AbstractC23306f.m120583H().m110204g().m116322n()));
                    return;
                }
            }
            if (this.f67994Z0) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C13183d());
            this.f67994Z0 = true;
            c0766k.mo1514Q4(str, i11, new TrackingSource((short) 1027));
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f72421L0.mo49315c4();
        }
    }

    /* renamed from: cN */
    private final void m74206cN() {
        try {
            if (m74239XM().f138612t.getTag() != null) {
                Object tag = m74239XM().f138612t.getTag();
                AbstractC19074t.m100206d(tag, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) tag).intValue();
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 3) {
                            if (intValue == 4) {
                                C2556d.m12981o().m13007x(4);
                            }
                        } else {
                            C18389d.m97403c();
                        }
                    } else {
                        C22436h.f109760a.m115915G();
                    }
                } else {
                    AbstractC26084s.m134269q(0, 39);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: dN */
    private final void m74207dN() {
        if (AbstractC23306f.m120676j().m128396M() && !AbstractC3489d.m17513u()) {
            m74239XM().f138612t.setVisibility(0);
        } else {
            m74239XM().f138612t.setVisibility(8);
        }
    }

    /* renamed from: eN */
    private final void m74208eN() {
        int i11;
        ListItemSetting listItemSetting = m74239XM().f138607F;
        if (AbstractC23306f.m120636Y1().m128520b()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        listItemSetting.setVisibility(i11);
    }

    /* renamed from: fN */
    private final void m74209fN() {
        C20912a.b bVar = C20912a.Companion;
        if (!bVar.m109411a().m109406m()) {
            m74239XM().f138618z.setVisibility(8);
            return;
        }
        if (bVar.m109411a().m109409p() && AbstractC23306f.m120567B1().m99704i()) {
            AppCompatImageView appCompatImageView = new AppCompatImageView(m74239XM().f138618z.getContext());
            Context context = m74239XM().f138618z.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            appCompatImageView.setImageDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_warning_solid_16, AbstractC2807a.support_warning));
            m74239XM().f138618z.getLlRight().addView(appCompatImageView);
        }
    }

    /* renamed from: gN */
    public static final void m74210gN(SettingV2View settingV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingV2View.m74226wN(listItemSetting);
    }

    /* renamed from: hN */
    public static final void m74211hN(SettingV2View settingV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingV2View.m74226wN(listItemSetting);
    }

    /* renamed from: iN */
    public static final void m74212iN(SettingV2View settingV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingV2View.m74226wN(listItemSetting);
    }

    /* renamed from: jN */
    public static final void m74213jN(SettingV2View settingV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingV2View.m74226wN(listItemSetting);
    }

    /* renamed from: kN */
    public static final void m74214kN(SettingV2View settingV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingV2View.m74226wN(listItemSetting);
    }

    /* renamed from: lN */
    public static final void m74215lN(SettingV2View settingV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingV2View.m74226wN(listItemSetting);
    }

    /* renamed from: mN */
    public static final void m74216mN(SettingV2View settingV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingV2View.m74226wN(listItemSetting);
    }

    /* renamed from: nN */
    public static final void m74217nN(SettingV2View settingV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingV2View.m74226wN(listItemSetting);
    }

    /* renamed from: oN */
    public static final void m74218oN(SettingV2View settingV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingV2View.m74226wN(listItemSetting);
    }

    /* renamed from: pN */
    public static final void m74219pN(SettingV2View settingV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingV2View.m74226wN(listItemSetting);
    }

    /* renamed from: qN */
    public static final void m74220qN(SettingV2View settingV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingV2View.m74226wN(listItemSetting);
    }

    /* renamed from: rN */
    public static final void m74221rN(SettingV2View settingV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingV2View.m74226wN(listItemSetting);
    }

    /* renamed from: sN */
    public static final void m74222sN(SettingV2View settingV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingV2View.m74226wN(listItemSetting);
    }

    /* renamed from: tN */
    public static final void m74223tN(SettingV2View settingV2View, Button button, View view) {
        AbstractC19074t.m100208f(settingV2View, "this$0");
        AbstractC19074t.m100208f(button, "$this_apply");
        settingV2View.m74226wN(button);
    }

    /* renamed from: uN */
    public static final void m74224uN(SettingV2View settingV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingV2View.m74226wN(listItemSetting);
    }

    /* renamed from: vN */
    public static final void m74225vN(SettingV2View settingV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingV2View.m74226wN(listItemSetting);
    }

    /* renamed from: wN */
    private final void m74226wN(View view) {
        if (AbstractC19074t.m100204b(view, m74239XM().f138611s)) {
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(SettingAccountAndSecurityV2View.class, null, 1, true);
            }
        } else if (AbstractC19074t.m100204b(view, m74239XM().f138617y)) {
            C17487o0 m92662fJ2 = m92662fJ();
            if (m92662fJ2 != null) {
                m92662fJ2.m93069k2(SettingPrivateV2View.class, null, 1, true);
            }
        } else if (AbstractC19074t.m100204b(view, m74239XM().f138618z)) {
            if (C20912a.Companion.m109411a().m109405l()) {
                C17487o0 m92662fJ3 = m92662fJ();
                if (m92662fJ3 != null) {
                    m92662fJ3.m93069k2(ToolStorageView.class, null, 1, true);
                }
            } else {
                C17487o0 m92662fJ4 = m92662fJ();
                if (m92662fJ4 != null) {
                    m92662fJ4.m93069k2(StorageSummaryView.class, null, 1, true);
                }
            }
            AbstractC23647d.m123897g("711220");
            C31747a.m152721t("setting");
        } else if (AbstractC19074t.m100204b(view, m74239XM().f138607F)) {
            m74228xN();
        } else if (AbstractC19074t.m100204b(view, m74239XM().f138612t)) {
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_SOURCE_ACTION", C2556d.m12981o().m12999m() ? 1 : 0);
            C22438j.m115953v(m92662fJ(), bundle);
            m74206cN();
        } else if (AbstractC19074t.m100204b(view, m74239XM().f138616x)) {
            C17487o0 m92662fJ5 = m92662fJ();
            if (m92662fJ5 != null) {
                m92662fJ5.m93069k2(SettingNotificationV2View.class, null, 1, true);
            }
        } else if (AbstractC19074t.m100204b(view, m74239XM().f138615w)) {
            C17487o0 m92662fJ6 = m92662fJ();
            if (m92662fJ6 != null) {
                m92662fJ6.m93069k2(SettingMessageV2View.class, null, 1, true);
            }
        } else if (AbstractC19074t.m100204b(view, m74239XM().f138613u)) {
            C17487o0 m92662fJ7 = m92662fJ();
            if (m92662fJ7 != null) {
                m92662fJ7.m93069k2(SettingCallV2View.class, null, 1, true);
            }
        } else if (AbstractC19074t.m100204b(view, m74239XM().f138605D)) {
            C17487o0 m92662fJ8 = m92662fJ();
            if (m92662fJ8 != null) {
                m92662fJ8.m93069k2(SettingTimelineV2View.class, null, 1, true);
            }
        } else if (AbstractC19074t.m100204b(view, m74239XM().f138614v)) {
            C17487o0 m92662fJ9 = m92662fJ();
            if (m92662fJ9 != null) {
                m92662fJ9.m93069k2(SettingContactView.class, null, 1, true);
            }
        } else if (AbstractC19074t.m100204b(view, m74239XM().f138604C)) {
            C17487o0 m92662fJ10 = m92662fJ();
            if (m92662fJ10 != null) {
                m92662fJ10.m93069k2(SettingThemeV2View.class, null, 1, true);
            }
        } else if (AbstractC19074t.m100204b(view, m74239XM().f138610r)) {
            C17487o0 m92662fJ11 = m92662fJ();
            if (m92662fJ11 != null) {
                m92662fJ11.m93069k2(AboutView.class, null, 1, true);
            }
        } else if (AbstractC19074t.m100204b(view, m74239XM().f138602A)) {
            if (this.f67989U0 == null && C21927m.m114302u().m114318P(AbstractC23306f.m120583H().m110204g().m116322n())) {
                ContactProfile m153138j = C21927m.m114302u().m114357s().m153138j("153426290");
                this.f67989U0 = m153138j;
                if (m153138j == null) {
                    this.f67989U0 = C7960e.m41971c6().m42228P5(AbstractC23306f.m120583H().m110204g().m116322n());
                }
            }
            if (C21927m.m114302u().m114357s().m153137g(AbstractC23306f.m120583H().m110204g().m116322n())) {
                if (this.f67989U0 != null) {
                    m74242bN();
                }
            } else {
                m74205aN(AbstractC23306f.m120583H().m110204g().m116322n());
            }
        } else if (AbstractC19074t.m100204b(view, m74239XM().f138603B)) {
            C17487o0 m92662fJ12 = m92662fJ();
            if (m92662fJ12 != null) {
                m92662fJ12.m93069k2(SwitchAccountView.class, null, 1, true);
            }
        } else if (AbstractC19074t.m100204b(view, m74239XM().f138609q)) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("SHOW_WITH_FLAGS", 16777216);
            C17487o0 m92662fJ13 = m92662fJ();
            if (m92662fJ13 != null) {
                m92662fJ13.mo89694j2(LogoutConfirmView.class, bundle2, 2212, "LogoutConfirmView", 2, true);
            }
            AbstractC23647d.m123897g("37800");
        }
        m73556pM().mo74383a6(view);
    }

    /* renamed from: xN */
    private final void m74228xN() {
        C26626l.Companion.m136712a().m136705k0(new C13185f(), C13186g.f68005q, C13187h.f68006q, new C13188i());
    }

    /* renamed from: yN */
    public static final void m74230yN(SettingV2View settingV2View, View view) {
        AbstractC19074t.m100208f(settingV2View, "this$0");
        settingV2View.removeDialog(1);
        AbstractC23647d.m123897g("199720");
    }

    /* renamed from: zN */
    public static final void m74232zN(SettingV2View settingV2View, View view) {
        AbstractC19074t.m100208f(settingV2View, "this$0");
        settingV2View.removeDialog(1);
        settingV2View.m73556pM().mo74384a7();
        AbstractC23647d.m123897g("199719");
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            return null;
        }
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        View inflate = LayoutInflater.from(this.f72421L0.getContext()).inflate(AbstractC7409c0.content_dialog_unmap, (ViewGroup) null, false);
        aVar.m43177z(inflate);
        if (!TextUtils.isEmpty(this.f67993Y0)) {
            View findViewById = inflate.findViewById(AbstractC6918a0.tvContent);
            AbstractC19074t.m100206d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) findViewById).setText(this.f67993Y0);
        }
        inflate.findViewById(AbstractC6918a0.btn_close).setOnClickListener(new View.OnClickListener() { // from class: la0.p6
            public /* synthetic */ ViewOnClickListenerC22307p6() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingV2View.m74230yN(SettingV2View.this, view);
            }
        });
        inflate.findViewById(AbstractC6918a0.btn_change_phone).setOnClickListener(new View.OnClickListener() { // from class: la0.r6
            public /* synthetic */ ViewOnClickListenerC22323r6() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingV2View.m74232zN(SettingV2View.this, view);
            }
        });
        inflate.findViewById(AbstractC6918a0.see_more).setOnClickListener(new View.OnClickListener() { // from class: la0.s6
            public /* synthetic */ ViewOnClickListenerC22331s6() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingV2View.m74181AN(SettingV2View.this, view);
            }
        });
        return aVar.m43152a();
    }

    /* renamed from: DN */
    public final void m74233DN(C29912lc c29912lc) {
        AbstractC19074t.m100208f(c29912lc, "<set-?>");
        this.f67988T0 = c29912lc;
    }

    /* renamed from: EN */
    public final void m74234EN(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f67993Y0 = str;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        AbstractC19074t.m100208f(actionBarMenu, "menu");
        super.mo37482FJ(actionBarMenu);
        if (AbstractC23309i.m121011Hf()) {
            actionBarMenu.m92750r();
            C13306b c13306b = this.f67991W0;
            if (c13306b != null) {
                c13306b.m74714z("tip.suggestion.search.setting", 200);
            }
        }
    }

    /* renamed from: FN */
    public final void m74235FN(boolean z11) {
        this.f67995a1 = z11;
    }

    /* renamed from: GN */
    public final void m74236GN(boolean z11) {
        this.f67994Z0 = z11;
    }

    /* renamed from: HN */
    public final void m74237HN(ContactProfile contactProfile) {
        this.f67989U0 = contactProfile;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_title);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m87077NK.setMiddleTitle(m118743r0);
                Context m92689tK = m92689tK();
                AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                Drawable m139658a = C27280g.m139658a(m92689tK, AbstractC23322a.zds_ic_search_line_24);
                if (m139658a != null) {
                    m87077NK.setEnableTrailingButton(true);
                    m87077NK.setTrailingIconButton(m139658a);
                    m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: la0.e6
                        public /* synthetic */ ViewOnClickListenerC22210e6() {
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            SettingV2View.m74185CN(SettingV2View.this, view);
                        }
                    });
                }
                m87077NK.setLeadingFunctionCallback(new C13189j());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView, com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C13306b c13306b = this.f67991W0;
        if (c13306b != null) {
            c13306b.m74709u();
        }
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 6003);
        bVar.m124119a().m124115b(this, 6024);
        bVar.m124119a().m124115b(this, 6026);
        bVar.m124119a().m124115b(this, 6025);
        C13306b c13306b = this.f67991W0;
        if (c13306b != null) {
            c13306b.m74697c(this.f67992X0);
        }
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 6003);
        bVar.m124119a().m124117e(this, 6024);
        bVar.m124119a().m124117e(this, 6025);
        bVar.m124119a().m124117e(this, 6026);
        C13306b c13306b = this.f67991W0;
        if (c13306b != null) {
            c13306b.m74701i();
        }
    }

    /* renamed from: WM */
    public final void m74238WM(int i11) {
        try {
            if (this.f67995a1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C13182c());
            this.f67995a1 = true;
            TrackingSource m114310H = C21927m.m114302u().m114310H(String.valueOf(i11));
            if (m114310H == null) {
                m114310H = new TrackingSource(-1);
            }
            c0766k.mo1578Y4(i11, m114310H);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: XM */
    public final C29912lc m74239XM() {
        C29912lc c29912lc = this.f67988T0;
        if (c29912lc != null) {
            return c29912lc;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: YM */
    public final ContactProfile m74240YM() {
        return this.f67989U0;
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        C13306b c13306b = new C13306b(m92648SI());
        this.f67991W0 = c13306b;
        c13306b.m74687C((ViewGroup) m92656bJ());
    }

    /* renamed from: ZM */
    public final ActionBarMenuItem m74241ZM() {
        return this.f67990V0;
    }

    /* renamed from: bN */
    public final void m74242bN() {
        String str;
        try {
            ContactProfile contactProfile = this.f67989U0;
            if (contactProfile != null && (str = contactProfile.f42434r) != null && str.length() != 0) {
                String str2 = contactProfile.f42434r;
                AbstractC19074t.m100207e(str2, "uid");
                Bundle m140776b = new C27870vb(str2).m140780g(contactProfile).m140776b();
                Intent intent = new Intent();
                intent.putExtras(m140776b);
                InterfaceC27218a m92676n2 = m92676n2();
                if (m92676n2 != null) {
                    m92676n2.mo35573l4(ChatView.class, intent.getExtras(), 1, true);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return SettingView.f68009r1;
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: lM */
    public void mo73553lM() {
        boolean z11;
        super.mo73553lM();
        try {
            if (AbstractC26084s.m134251H(m74239XM().f138612t, 39) != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (AbstractC26084s.m134251H(m74239XM().f138610r, 46) == null) {
                AbstractC25598c.a aVar = AbstractC25598c.Companion;
                ListItemSetting listItemSetting = m74239XM().f138610r;
                AbstractC19074t.m100207e(listItemSetting, "itemAbout");
                aVar.m132231b(listItemSetting, AbstractC6918a0.icon_setting_reminder);
            }
            if (z11) {
                m74239XM().f138612t.setTag(1);
                return;
            }
            ListItemSetting listItemSetting2 = m74239XM().f138612t;
            AbstractC19074t.m100207e(listItemSetting2, "itemBackupAndRestore");
            if (C22447s.m116040j(listItemSetting2, AbstractC6918a0.icon_setting_reminder) >= 0) {
                m74239XM().f138612t.setTag(2);
                return;
            }
            if (C22436h.f109760a.m115922r()) {
                m74239XM().f138612t.setTag(null);
                return;
            }
            ListItemSetting listItemSetting3 = m74239XM().f138612t;
            AbstractC19074t.m100207e(listItemSetting3, "itemBackupAndRestore");
            if (C22447s.m116036h(listItemSetting3, AbstractC6918a0.icon_setting_reminder) >= 0) {
                m74239XM().f138612t.setTag(3);
                return;
            }
            if (C18389d.m97401a()) {
                m74239XM().f138612t.setTag(null);
            } else if (AbstractC2557e.m13010b(m74239XM().f138612t, AbstractC6918a0.icon_setting_reminder) >= 0) {
                m74239XM().f138612t.setTag(4);
            } else {
                m74239XM().f138612t.setTag(null);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(SettingView.f68009r1, e11);
        }
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: mM */
    public int mo73522mM() {
        return 36;
    }

    @Override // la0.InterfaceC22275m
    /* renamed from: od */
    public C22229g7[] mo73523od() {
        ListItemSetting listItemSetting = m74239XM().f138611s;
        AbstractC19074t.m100207e(listItemSetting, "itemAccountAndSecurity");
        ListItemSetting listItemSetting2 = m74239XM().f138617y;
        AbstractC19074t.m100207e(listItemSetting2, "itemPrivacy");
        ListItemSetting listItemSetting3 = m74239XM().f138618z;
        AbstractC19074t.m100207e(listItemSetting3, "itemStorage");
        ListItemSetting listItemSetting4 = m74239XM().f138612t;
        AbstractC19074t.m100207e(listItemSetting4, "itemBackupAndRestore");
        ListItemSetting listItemSetting5 = m74239XM().f138616x;
        AbstractC19074t.m100207e(listItemSetting5, "itemNotification");
        ListItemSetting listItemSetting6 = m74239XM().f138615w;
        AbstractC19074t.m100207e(listItemSetting6, "itemMessage");
        ListItemSetting listItemSetting7 = m74239XM().f138613u;
        AbstractC19074t.m100207e(listItemSetting7, "itemCall");
        ListItemSetting listItemSetting8 = m74239XM().f138605D;
        AbstractC19074t.m100207e(listItemSetting8, "itemTimeline");
        ListItemSetting listItemSetting9 = m74239XM().f138614v;
        AbstractC19074t.m100207e(listItemSetting9, "itemContact");
        ListItemSetting listItemSetting10 = m74239XM().f138604C;
        AbstractC19074t.m100207e(listItemSetting10, "itemTheme");
        ListItemSetting listItemSetting11 = m74239XM().f138610r;
        AbstractC19074t.m100207e(listItemSetting11, "itemAbout");
        ListItemSetting listItemSetting12 = m74239XM().f138602A;
        AbstractC19074t.m100207e(listItemSetting12, "itemSupport");
        ListItemSetting listItemSetting13 = m74239XM().f138603B;
        AbstractC19074t.m100207e(listItemSetting13, "itemSwitchAccount");
        FrameLayout frameLayout = m74239XM().f138606E;
        AbstractC19074t.m100207e(frameLayout, "layoutBtnLogout");
        ListItemSetting listItemSetting14 = m74239XM().f138607F;
        AbstractC19074t.m100207e(listItemSetting14, "zCloud");
        return new C22229g7[]{new C22229g7(listItemSetting, 38), new C22229g7(listItemSetting2, 37), new C22229g7(listItemSetting3, 109), new C22229g7(listItemSetting4, 39), new C22229g7(listItemSetting5, 40), new C22229g7(listItemSetting6, 41), new C22229g7(listItemSetting7, 42), new C22229g7(listItemSetting8, 43), new C22229g7(listItemSetting9, 44), new C22229g7(listItemSetting10, 104), new C22229g7(listItemSetting11, 46), new C22229g7(listItemSetting12, 83), new C22229g7(listItemSetting13, 47), new C22229g7(frameLayout, 48), new C22229g7(listItemSetting14, 125)};
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        try {
            if (i11 != 2212) {
                if (i11 != 3231) {
                    super.onActivityResult(i11, i12, intent);
                } else if (i12 == -1) {
                    m74204VM();
                }
            } else {
                m74183BN(i12);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4 && this.f67996b1) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C13306b c13306b = this.f67991W0;
        if (c13306b != null) {
            c13306b.m74710v();
        }
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: qM */
    public void mo73524qM() {
        ListItemSetting listItemSetting = m74239XM().f138611s;
        AbstractC19074t.m100205c(listItemSetting);
        ListItemSetting.m74603F(listItemSetting, AbstractC23322a.zds_ic_shield_star_line_24, null, AbstractC2808b.f150821b60, 2, null);
        listItemSetting.setShowChevronRight(true);
        listItemSetting.setOnClickListener(new View.OnClickListener() { // from class: la0.u6

            /* renamed from: q */
            public final /* synthetic */ ListItemSetting f109545q;

            public /* synthetic */ ViewOnClickListenerC22347u6(ListItemSetting listItemSetting2) {
                r2 = listItemSetting2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingV2View.m74210gN(SettingV2View.this, r2, view);
            }
        });
        ListItemSetting listItemSetting2 = m74239XM().f138617y;
        AbstractC19074t.m100205c(listItemSetting2);
        ListItemSetting.m74603F(listItemSetting2, AbstractC23322a.zds_ic_lock_line_24, null, AbstractC2808b.f150821b60, 2, null);
        listItemSetting2.setShowChevronRight(true);
        int i11 = 0;
        listItemSetting2.m90592m(false);
        listItemSetting2.setOnClickListener(new View.OnClickListener() { // from class: la0.h6

            /* renamed from: q */
            public final /* synthetic */ ListItemSetting f109384q;

            public /* synthetic */ ViewOnClickListenerC22237h6(ListItemSetting listItemSetting22) {
                r2 = listItemSetting22;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingV2View.m74221rN(SettingV2View.this, r2, view);
            }
        });
        ListItemSetting listItemSetting3 = m74239XM().f138618z;
        AbstractC19074t.m100205c(listItemSetting3);
        ListItemSetting.m74603F(listItemSetting3, AbstractC23322a.zds_ic_storage_line_24, null, AbstractC2808b.f150821b60, 2, null);
        listItemSetting3.setShowChevronRight(true);
        listItemSetting3.setOnClickListener(new View.OnClickListener() { // from class: la0.i6

            /* renamed from: q */
            public final /* synthetic */ ListItemSetting f109396q;

            public /* synthetic */ ViewOnClickListenerC22246i6(ListItemSetting listItemSetting32) {
                r2 = listItemSetting32;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingV2View.m74224uN(SettingV2View.this, r2, view);
            }
        });
        listItemSetting32.m90592m(AbstractC3489d.m17505m());
        ListItemSetting listItemSetting4 = m74239XM().f138607F;
        C16805b.b bVar = C16805b.Companion;
        boolean m89808w = bVar.m89811a().m89808w();
        AbstractC19074t.m100205c(listItemSetting4);
        ListItemSetting.m74603F(listItemSetting4, AbstractC23322a.zds_ic_zcloud_line_24, null, AbstractC2808b.f150821b60, 2, null);
        listItemSetting4.setShowChevronRight(true);
        listItemSetting4.setTitle(bVar.m89811a().m89800f());
        listItemSetting4.setOnClickListener(new View.OnClickListener() { // from class: la0.j6

            /* renamed from: q */
            public final /* synthetic */ ListItemSetting f109408q;

            public /* synthetic */ ViewOnClickListenerC22255j6(ListItemSetting listItemSetting42) {
                r2 = listItemSetting42;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingV2View.m74225vN(SettingV2View.this, r2, view);
            }
        });
        if (m89808w) {
            Badge badgeTitle = listItemSetting42.getBadgeTitle();
            Context context = listItemSetting42.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            C16974f c16974f = new C16974f(context);
            c16974f.m90974x(EnumC16991i.NEW_TEXT);
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_beta_badge);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            c16974f.m90972v(m118743r0);
            badgeTitle.m90493g(c16974f);
            listItemSetting42.getBadgeTitle().setVisibility(0);
        } else {
            listItemSetting42.getBadgeTitle().setVisibility(8);
        }
        ListItemSetting listItemSetting5 = m74239XM().f138612t;
        AbstractC19074t.m100205c(listItemSetting5);
        ListItemSetting.m74603F(listItemSetting5, AbstractC23322a.zds_ic_auto_counter_clockwise_line_24, null, AbstractC2808b.f150821b60, 2, null);
        listItemSetting5.setShowChevronRight(true);
        listItemSetting5.m90592m(false);
        listItemSetting5.setOnClickListener(new View.OnClickListener() { // from class: la0.k6

            /* renamed from: q */
            public final /* synthetic */ ListItemSetting f109422q;

            public /* synthetic */ ViewOnClickListenerC22264k6(ListItemSetting listItemSetting52) {
                r2 = listItemSetting52;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingV2View.m74211hN(SettingV2View.this, r2, view);
            }
        });
        ListItemSetting listItemSetting6 = m74239XM().f138616x;
        AbstractC19074t.m100205c(listItemSetting6);
        ListItemSetting.m74603F(listItemSetting6, AbstractC23322a.zds_ic_notif_line_24, null, AbstractC2808b.f150821b60, 2, null);
        listItemSetting6.setShowChevronRight(true);
        listItemSetting6.setOnClickListener(new View.OnClickListener() { // from class: la0.l6

            /* renamed from: q */
            public final /* synthetic */ ListItemSetting f109434q;

            public /* synthetic */ ViewOnClickListenerC22273l6(ListItemSetting listItemSetting62) {
                r2 = listItemSetting62;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingV2View.m74212iN(SettingV2View.this, r2, view);
            }
        });
        ListItemSetting listItemSetting7 = m74239XM().f138615w;
        AbstractC19074t.m100205c(listItemSetting7);
        ListItemSetting.m74603F(listItemSetting7, AbstractC23322a.zds_ic_chat_line_24, null, AbstractC2808b.f150821b60, 2, null);
        listItemSetting7.setShowChevronRight(true);
        listItemSetting7.setOnClickListener(new View.OnClickListener() { // from class: la0.m6

            /* renamed from: q */
            public final /* synthetic */ ListItemSetting f109448q;

            public /* synthetic */ ViewOnClickListenerC22282m6(ListItemSetting listItemSetting72) {
                r2 = listItemSetting72;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingV2View.m74213jN(SettingV2View.this, r2, view);
            }
        });
        ListItemSetting listItemSetting8 = m74239XM().f138605D;
        AbstractC19074t.m100205c(listItemSetting8);
        ListItemSetting.m74603F(listItemSetting8, AbstractC23322a.zds_ic_clock_2_line_24, null, AbstractC2808b.f150821b60, 2, null);
        listItemSetting8.setShowChevronRight(true);
        listItemSetting8.setOnClickListener(new View.OnClickListener() { // from class: la0.n6

            /* renamed from: q */
            public final /* synthetic */ ListItemSetting f109465q;

            public /* synthetic */ ViewOnClickListenerC22291n6(ListItemSetting listItemSetting82) {
                r2 = listItemSetting82;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingV2View.m74214kN(SettingV2View.this, r2, view);
            }
        });
        ListItemSetting listItemSetting9 = m74239XM().f138613u;
        AbstractC19074t.m100205c(listItemSetting9);
        ListItemSetting.m74603F(listItemSetting9, AbstractC23322a.zds_ic_call_line_24, null, AbstractC2808b.f150821b60, 2, null);
        listItemSetting9.setShowChevronRight(true);
        listItemSetting9.setOnClickListener(new View.OnClickListener() { // from class: la0.o6

            /* renamed from: q */
            public final /* synthetic */ ListItemSetting f109475q;

            public /* synthetic */ ViewOnClickListenerC22299o6(ListItemSetting listItemSetting92) {
                r2 = listItemSetting92;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingV2View.m74215lN(SettingV2View.this, r2, view);
            }
        });
        ListItemSetting listItemSetting10 = m74239XM().f138605D;
        AbstractC19074t.m100205c(listItemSetting10);
        ListItemSetting.m74603F(listItemSetting10, AbstractC2810d.zds_ic_clock_2_line_24, null, AbstractC2808b.f150821b60, 2, null);
        listItemSetting10.setShowChevronRight(true);
        listItemSetting10.setOnClickListener(new View.OnClickListener() { // from class: la0.q6

            /* renamed from: q */
            public final /* synthetic */ ListItemSetting f109499q;

            public /* synthetic */ ViewOnClickListenerC22315q6(ListItemSetting listItemSetting102) {
                r2 = listItemSetting102;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingV2View.m74216mN(SettingV2View.this, r2, view);
            }
        });
        ListItemSetting listItemSetting11 = m74239XM().f138614v;
        AbstractC19074t.m100205c(listItemSetting11);
        ListItemSetting.m74603F(listItemSetting11, AbstractC23322a.zds_ic_contact_list_line_24, null, AbstractC2808b.f150821b60, 2, null);
        listItemSetting11.setShowChevronRight(true);
        listItemSetting11.setOnClickListener(new View.OnClickListener() { // from class: la0.v6

            /* renamed from: q */
            public final /* synthetic */ ListItemSetting f109556q;

            public /* synthetic */ ViewOnClickListenerC22355v6(ListItemSetting listItemSetting112) {
                r2 = listItemSetting112;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingV2View.m74217nN(SettingV2View.this, r2, view);
            }
        });
        ListItemSetting listItemSetting12 = m74239XM().f138604C;
        AbstractC19074t.m100205c(listItemSetting12);
        ListItemSetting.m74603F(listItemSetting12, AbstractC23322a.zds_ic_wallpaper_line_24, null, AbstractC2808b.f150821b60, 2, null);
        listItemSetting12.setShowChevronRight(true);
        listItemSetting12.m90592m(false);
        listItemSetting12.setOnClickListener(new View.OnClickListener() { // from class: la0.w6

            /* renamed from: q */
            public final /* synthetic */ ListItemSetting f109570q;

            public /* synthetic */ ViewOnClickListenerC22363w6(ListItemSetting listItemSetting122) {
                r2 = listItemSetting122;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingV2View.m74218oN(SettingV2View.this, r2, view);
            }
        });
        ListItemSetting listItemSetting13 = m74239XM().f138610r;
        AbstractC19074t.m100205c(listItemSetting13);
        ListItemSetting.m74603F(listItemSetting13, AbstractC23322a.zds_ic_info_circle_line_24, null, AbstractC2808b.f150821b60, 2, null);
        listItemSetting13.setShowChevronRight(true);
        listItemSetting13.setOnClickListener(new View.OnClickListener() { // from class: la0.x6

            /* renamed from: q */
            public final /* synthetic */ ListItemSetting f109585q;

            public /* synthetic */ ViewOnClickListenerC22371x6(ListItemSetting listItemSetting132) {
                r2 = listItemSetting132;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingV2View.m74219pN(SettingV2View.this, r2, view);
            }
        });
        ListItemSetting listItemSetting14 = m74239XM().f138602A;
        AbstractC19074t.m100205c(listItemSetting14);
        ListItemSetting.m74603F(listItemSetting14, AbstractC23322a.zds_ic_help_circle_line_24, null, AbstractC2808b.f150821b60, 2, null);
        listItemSetting14.setShowChevronRight(false);
        listItemSetting14.m90592m(false);
        RecyclingImageView recyclingImageView = new RecyclingImageView(listItemSetting14.getContext());
        Context context2 = listItemSetting14.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        recyclingImageView.setImageDrawable(C27280g.m139660c(context2, AbstractC2810d.zds_ic_chat_line_16, AbstractC2807a.icon_01));
        recyclingImageView.setBackgroundResource(AbstractC16803z.bg_icon_circle);
        int m118742r = AbstractC23136l9.m118742r(8.0f);
        recyclingImageView.setPadding(m118742r, m118742r, m118742r, m118742r);
        listItemSetting14.getLlRight().addView(recyclingImageView);
        listItemSetting14.setOnClickListener(new View.OnClickListener() { // from class: la0.y6

            /* renamed from: q */
            public final /* synthetic */ ListItemSetting f109599q;

            public /* synthetic */ ViewOnClickListenerC22379y6(ListItemSetting listItemSetting142) {
                r2 = listItemSetting142;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingV2View.m74220qN(SettingV2View.this, r2, view);
            }
        });
        ListItemSetting listItemSetting15 = m74239XM().f138603B;
        AbstractC19074t.m100205c(listItemSetting15);
        ListItemSetting.m74603F(listItemSetting15, AbstractC23322a.zds_ic_switch_users_line_24, null, AbstractC2808b.f150821b60, 2, null);
        listItemSetting15.setShowChevronRight(true);
        listItemSetting15.setOnClickListener(new View.OnClickListener() { // from class: la0.f6

            /* renamed from: q */
            public final /* synthetic */ ListItemSetting f109361q;

            public /* synthetic */ ViewOnClickListenerC22219f6(ListItemSetting listItemSetting152) {
                r2 = listItemSetting152;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingV2View.m74222sN(SettingV2View.this, r2, view);
            }
        });
        Button button = m74239XM().f138609q;
        button.setSupportiveIcon(C27280g.m139660c(MainApplication.Companion.m35500c(), AbstractC23322a.zds_ic_leave_line_24, AbstractC2807a.icon_01));
        button.setOnClickListener(new View.OnClickListener() { // from class: la0.g6

            /* renamed from: q */
            public final /* synthetic */ Button f109372q;

            public /* synthetic */ ViewOnClickListenerC22228g6(Button button2) {
                r2 = button2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingV2View.m74223tN(SettingV2View.this, r2, view);
            }
        });
        ListItemSetting listItemSetting16 = m74239XM().f138603B;
        if (!AbstractC23309i.m121529Vf()) {
            i11 = 8;
        }
        listItemSetting16.setVisibility(i11);
        m74209fN();
        m74208eN();
        m74207dN();
        m73556pM().mo74380Vx();
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: rM */
    public View mo73525rM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        m92637BK(true);
        C29912lc m148214b = C29912lc.m148214b(layoutInflater, viewGroup);
        AbstractC19074t.m100207e(m148214b, "inflate(...)");
        m74233DN(m148214b);
        View root = m74239XM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: uM */
    public void mo73526uM() {
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView, com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 != 6000 && i11 != 6003) {
            switch (i11) {
                case 6024:
                case 6025:
                case 6026:
                    break;
                default:
                    return;
            }
        }
        mo70710wy(new Runnable() { // from class: la0.t6
            public /* synthetic */ RunnableC22339t6() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SettingV2View.m74203UM(SettingV2View.this);
            }
        });
    }
}
