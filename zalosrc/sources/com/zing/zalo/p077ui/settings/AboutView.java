package com.zing.zalo.p077ui.settings;

import ac.C0708i;
import ac.C0732w;
import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0815e1;
import ag0.C0824j;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.FileProvider;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2814h;
import com.androidquery.util.RecyclingImageView;
import com.google.android.play.core.appupdate.AbstractC6474c;
import com.google.android.play.core.appupdate.C6470a;
import com.google.android.play.core.appupdate.InterfaceC6472b;
import com.google.android.play.core.install.AbstractC6501a;
import com.google.android.play.core.install.InterfaceC6502b;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.location.AbstractC8955a;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.settings.AboutView;
import com.zing.zalo.p077ui.settings.devtool.BuildInfoView;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.p077ui.zviews.PolicyZView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Badge;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zinstant.AbstractC17148f0;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.ZaloZinstantLayout;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalocore.CoreUtility;
import dk0.C18020c;
import en0.InterfaceC18505l;
import fm0.AbstractC19026c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import hk0.InterfaceC20083a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import ik0.InterfaceC20578a0;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import la0.C22229g7;
import lk0.InterfaceC22508f;
import me0.AbstractC23126l;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23181q;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import mx.C23476m;
import org.json.JSONObject;
import p171fx.AbstractC19164e;
import p227i3.C20218v;
import p248iy.C20882b;
import p304ks.C21927m;
import p342m6.AbstractC22888j;
import p342m6.InterfaceC22880f;
import p342m6.InterfaceC22882g;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p405ov.AbstractC24560b;
import p405ov.C24564f;
import p453qm.AbstractC25330a;
import p488rm.AbstractC25834a;
import p542ub.InterfaceC27218a;
import p551um.AbstractC27309b;
import p614wm.AbstractC29092a;
import p649xl.C29701a;
import p650xm.AbstractC30164a;
import p686ym.AbstractC31019a;
import p716zh.C31965ic;
import pj0.InterfaceC24775a;
import pm0.C24848g0;
import r00.C25596a;
import rh0.AbstractC25803k;
import s00.AbstractC26084s;
import tm.AbstractC26734a;
import ui0.C27276c;
import ui0.C27280g;
import v50.C27870vb;
import vg.C28203u6;
import zm.AbstractC32236a;

/* loaded from: classes6.dex */
public final class AboutView extends BaseSettingView implements View.OnClickListener {
    public static final C13104a Companion = new C13104a(null);

    /* renamed from: d1 */
    private static final String f67529d1 = AboutView.class.getSimpleName();

    /* renamed from: e1 */
    private static final AtomicBoolean f67530e1 = new AtomicBoolean(false);

    /* renamed from: T0 */
    private ContactProfile f67531T0;

    /* renamed from: U0 */
    private long f67532U0;

    /* renamed from: V0 */
    private int f67533V0;

    /* renamed from: W0 */
    public Button f67534W0;

    /* renamed from: X0 */
    public C29701a f67535X0;

    /* renamed from: Y0 */
    private Snackbar f67536Y0;

    /* renamed from: Z0 */
    private boolean f67537Z0;

    /* renamed from: a1 */
    private boolean f67538a1;

    /* renamed from: b1 */
    private InterfaceC20094a f67539b1 = new C13108e();

    /* renamed from: c1 */
    private InterfaceC6502b f67540c1 = new InterfaceC6502b() { // from class: la0.b
        @Override // p152f7.InterfaceC18798a
        /* renamed from: a */
        public final void mo33367a(Object obj) {
            AboutView.m73499iN(AboutView.this, (AbstractC6501a) obj);
        }
    };

    /* renamed from: com.zing.zalo.ui.settings.AboutView$a */
    /* loaded from: classes6.dex */
    public static final class C13104a {
        private C13104a() {
        }

        public /* synthetic */ C13104a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final String m73531a() {
            return AboutView.f67529d1;
        }

        /* renamed from: b */
        public final void m73532b(Context context) {
            Uri uri;
            try {
                AbstractC20110a.f98889a.mo104548a("sendEmailFeedBack", new Object[0]);
                C18020c.m95817m().m95840z();
                String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.subject_feedback, CoreUtility.f89234j);
                AbstractC19074t.m100207e(m118746s0, "getString(...)");
                String str = m118746s0 + " [" + AbstractC23309i.m121738b1() + "]";
                Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.SUBJECT", str);
                intent.putExtra("android.intent.extra.EMAIL", new String[]{AbstractC23306f.m120583H().m110204g().m116316h()});
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (File file : C24564f.m127953i()) {
                    if (file.exists() && file.length() > 0) {
                        if (context != null) {
                            uri = FileProvider.m6950f(context, "com.zing.zalo.provider", file);
                        } else {
                            uri = null;
                        }
                        if (uri != null) {
                            arrayList.add(uri);
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                }
                intent.addFlags(268435456);
                intent.addFlags(1);
                AbstractC20110a.f98889a.mo104548a("sendEmailFeedBack startActivity", new Object[0]);
                if (context != null) {
                    context.startActivity(AbstractC23152n3.m119053l(context, intent, AbstractC23136l9.m118746s0(AbstractC8020f0.str_title_email_app, "")));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.AboutView$b */
    /* loaded from: classes6.dex */
    public static final class C13105b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C25596a f67542r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13105b(C25596a c25596a) {
            super(1);
            this.f67542r = c25596a;
        }

        /* renamed from: a */
        public final void m73533a(C6470a c6470a) {
            if (c6470a.m33329e() == 2) {
                AboutView.this.m73494dN();
                return;
            }
            if (c6470a.m33326b() == 2) {
                AboutView.this.m73492bN();
            } else if (c6470a.m33326b() == 11) {
                AboutView.this.m73491aN();
            } else {
                AboutView.this.m73493cN(this.f67542r);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m73533a((C6470a) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.AboutView$c */
    /* loaded from: classes6.dex */
    public static final class C13106c implements InterfaceC20094a {

        /* renamed from: com.zing.zalo.ui.settings.AboutView$c$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f67544a;

            a(ContactProfile contactProfile) {
                this.f67544a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42221O7(this.f67544a, true);
            }
        }

        C13106c() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            AboutView.this.f72421L0.mo78960q3();
            ToastUtils.m89264l(new C20096c(ZMediaPlayer.ZPLAYER_UNSUPPORTED_PROTOCOL, ""));
            AboutView.this.m73530zN(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            if (obj != null) {
                try {
                    try {
                        AboutView.this.f67531T0 = new ContactProfile((JSONObject) obj);
                        ContactProfile contactProfile = AboutView.this.f67531T0;
                        if (contactProfile != null) {
                            contactProfile.f42330D = System.currentTimeMillis();
                        }
                        if (AboutView.this.f67531T0 != null) {
                            C0824j.m2153b(new a(AboutView.this.f67531T0));
                            AboutView.this.m73517UM(Integer.parseInt(AbstractC23306f.m120583H().m110204g().m116322n()));
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122776f(AboutView.Companion.m73531a(), e11);
                    }
                } finally {
                    AboutView.this.m73530zN(false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.AboutView$d */
    /* loaded from: classes6.dex */
    public static final class C13107d extends AbstractC19075u implements InterfaceC18505l {
        C13107d() {
            super(1);
        }

        /* renamed from: a */
        public final void m73534a(C6470a c6470a) {
            AbstractC19074t.m100208f(c6470a, "appUpdateInfo");
            if (c6470a.m33326b() == 11) {
                ZaloLauncherActivity.C10971a c10971a = ZaloLauncherActivity.Companion;
                InterfaceC6472b m57111c = c10971a.m57111c();
                if (m57111c != null) {
                    m57111c.mo33340e(AboutView.this.m73520XM());
                }
                InterfaceC6472b m57111c2 = c10971a.m57111c();
                if (m57111c2 != null) {
                    m57111c2.mo33336a();
                    return;
                }
                return;
            }
            if (c6470a.m33329e() != 2 || !c6470a.m33327c(0)) {
                AboutView.this.m73509sN();
                return;
            }
            try {
                InterfaceC6472b m57111c3 = ZaloLauncherActivity.Companion.m57111c();
                if (m57111c3 != null) {
                    Object m92676n2 = AboutView.this.f72421L0.m92676n2();
                    AbstractC19074t.m100206d(m92676n2, "null cannot be cast to non-null type android.app.Activity");
                    m57111c3.mo33339d(c6470a, 0, (Activity) m92676n2, 100);
                }
                C0732w m1189a = C0732w.Companion.m1189a();
                C0708i c0708i = new C0708i();
                c0708i.m1072c("current_version", CoreUtility.f89236l);
                c0708i.m1072c("update_version", c6470a.m33325a());
                C24848g0 c24848g0 = C24848g0.f119245a;
                C0732w.m1177r(m1189a, "inapp_update", "", c0708i, null, 8, null);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(AboutView.Companion.m73531a(), e11);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m73534a((C6470a) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.AboutView$e */
    /* loaded from: classes6.dex */
    public static final class C13108e implements InterfaceC20094a {

        /* renamed from: com.zing.zalo.ui.settings.AboutView$e$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f67547a;

            a(ContactProfile contactProfile) {
                this.f67547a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42349b8(this.f67547a);
            }
        }

        C13108e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m73536d(AboutView aboutView) {
            AbstractC19074t.m100208f(aboutView, "this$0");
            aboutView.m73521ZM();
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
                AboutView.this.m73529yN(false);
                AboutView.this.f72421L0.mo78960q3();
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
                        if (Integer.parseInt(string) == 0 && AboutView.this.f67531T0 != null) {
                            ContactProfile contactProfile = AboutView.this.f67531T0;
                            AbstractC19074t.m100205c(contactProfile);
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
                            ContactProfile contactProfile2 = AboutView.this.f67531T0;
                            AbstractC19074t.m100205c(contactProfile2);
                            contactProfile.f42447v0 = contactProfile2.f42352K0;
                            ContactProfile contactProfile3 = AboutView.this.f67531T0;
                            AbstractC19074t.m100205c(contactProfile3);
                            contactProfile.f42352K0 = contactProfile3.f42352K0;
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
                                    AbstractC19074t.m100207e(contactProfile, "get(...)");
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
                                int m153681a = c31965ic.m153681a() + 1;
                                C31965ic c31965ic2 = (C31965ic) map.get(CoreUtility.f89233i);
                                if (c31965ic2 != null) {
                                    c31965ic2.m153684d(m153681a);
                                }
                            }
                            C28203u6.f131407a.m141806D(AbstractC23306f.m120583H().m110204g().m116322n(), false);
                            if (!TextUtils.isEmpty(contactProfile.f42434r)) {
                                AbstractC23181q.m119431d(contactProfile.f42434r, true);
                            }
                            final AboutView aboutView = AboutView.this;
                            aboutView.mo70710wy(new Runnable() { // from class: la0.i
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AboutView.C13108e.m73536d(AboutView.this);
                                }
                            });
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                AboutView.this.m73529yN(false);
                AboutView.this.f72421L0.mo78960q3();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.AboutView$f */
    /* loaded from: classes6.dex */
    public static final class C13109f implements InterfaceC24775a {
        C13109f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final void m73538b(AboutView aboutView) {
            AbstractC19074t.m100208f(aboutView, "this$0");
            aboutView.m73472DN(false);
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            AbstractC19074t.m100208f(exc, "exception");
            final AboutView aboutView = AboutView.this;
            AbstractC19444a.m101697e(new Runnable() { // from class: la0.j
                @Override // java.lang.Runnable
                public final void run() {
                    AboutView.C13109f.m73538b(AboutView.this);
                }
            });
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            AboutView.this.m73472DN(true);
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.AboutView$g */
    /* loaded from: classes6.dex */
    public static final class C13110g implements InterfaceC20083a {

        /* renamed from: b */
        final /* synthetic */ InterfaceC22508f f67550b;

        C13110g(InterfaceC22508f interfaceC22508f) {
            this.f67550b = interfaceC22508f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m73541d(AboutView aboutView, InterfaceC20578a0 interfaceC20578a0, InterfaceC22508f interfaceC22508f) {
            AbstractC19074t.m100208f(aboutView, "this$0");
            AbstractC19074t.m100208f(interfaceC20578a0, "$zinstantTree");
            AbstractC19074t.m100208f(interfaceC22508f, "$dataModel");
            aboutView.m73510tN(interfaceC20578a0, interfaceC22508f);
        }

        @Override // hk0.InterfaceC20083a
        /* renamed from: a */
        public void mo15331a(final InterfaceC20578a0 interfaceC20578a0) {
            AbstractC19074t.m100208f(interfaceC20578a0, "zinstantTree");
            final AboutView aboutView = AboutView.this;
            final InterfaceC22508f interfaceC22508f = this.f67550b;
            AbstractC19444a.m101697e(new Runnable() { // from class: la0.k
                @Override // java.lang.Runnable
                public final void run() {
                    AboutView.C13110g.m73541d(AboutView.this, interfaceC20578a0, interfaceC22508f);
                }
            });
        }

        @Override // hk0.InterfaceC20083a
        /* renamed from: c */
        public void mo15332c(Exception exc) {
            AbstractC19074t.m100208f(exc, "exception");
            AboutView.this.m73472DN(false);
        }
    }

    /* renamed from: AN */
    private final void m73466AN() {
        if (m92676n2() != null) {
            BuildInfoView.C13214a c13214a = BuildInfoView.Companion;
            InterfaceC27218a m92676n2 = m92676n2();
            AbstractC19074t.m100205c(m92676n2);
            c13214a.m74412a(m92676n2);
        }
        this.f67532U0 = 0L;
        this.f67533V0 = 0;
    }

    /* renamed from: BN */
    private final void m73468BN() {
        try {
            Activity activity = (Activity) getContext();
            if (activity != null && !activity.isFinishing()) {
                Snackbar snackbar = this.f67536Y0;
                if (snackbar != null) {
                    AbstractC19074t.m100205c(snackbar);
                    if (!snackbar.m90661t()) {
                        Snackbar snackbar2 = this.f67536Y0;
                        AbstractC19074t.m100205c(snackbar2);
                        snackbar2.m90648N();
                    }
                }
                View findViewById = activity.getWindow().getDecorView().findViewById(R.id.content);
                Snackbar.C16925c c16925c = Snackbar.Companion;
                AbstractC19074t.m100205c(findViewById);
                String string = activity.getString(AbstractC8020f0.str_message_install_downloaded_update);
                AbstractC19074t.m100207e(string, "getString(...)");
                Snackbar m90636A = c16925c.m90669d(findViewById, string, 0).m90645K(C27276c.m139649b(activity, 40)).m90641G(true).m90636A(activity.getString(AbstractC8020f0.str_action_install_downloaded_update), new View.OnClickListener() { // from class: la0.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AboutView.m73470CN(AboutView.this, view);
                    }
                });
                this.f67536Y0 = m90636A;
                if (m90636A != null) {
                    m90636A.m90648N();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122772b(f67529d1, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CN */
    public static final void m73470CN(AboutView aboutView, View view) {
        AbstractC19074t.m100208f(aboutView, "this$0");
        ZaloLauncherActivity.C10971a c10971a = ZaloLauncherActivity.Companion;
        InterfaceC6472b m57111c = c10971a.m57111c();
        if (m57111c != null) {
            m57111c.mo33340e(aboutView.f67540c1);
        }
        InterfaceC6472b m57111c2 = c10971a.m57111c();
        if (m57111c2 != null) {
            m57111c2.mo33336a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DN */
    public final void m73472DN(final boolean z11) {
        AbstractC19444a.m101697e(new Runnable() { // from class: la0.h
            @Override // java.lang.Runnable
            public final void run() {
                AboutView.m73474EN(AboutView.this, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EN */
    public static final void m73474EN(AboutView aboutView, boolean z11) {
        int i11;
        AbstractC19074t.m100208f(aboutView, "this$0");
        ZaloZinstantLayout zaloZinstantLayout = aboutView.m73518VM().f137165H;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        zaloZinstantLayout.setVisibility(i11);
        aboutView.m73518VM().f137160C.m90592m(z11);
    }

    /* renamed from: FN */
    private final void m73476FN(C25596a c25596a) {
        InterfaceC22508f m92064b;
        try {
            if (c25596a.m132208f() && c25596a.m132217p() != null) {
                C17244x0 m132217p = c25596a.m132217p();
                AbstractC19074t.m100205c(m132217p);
                if (m132217p.m92064b() != null) {
                    C17244x0 m132217p2 = c25596a.m132217p();
                    if (m132217p2 != null && (m92064b = m132217p2.m92064b()) != null) {
                        AbstractC17148f0.m91694m(m92064b, AbstractC23136l9.m118722k0(), new C13110g(m92064b));
                        return;
                    }
                    return;
                }
            }
            m73472DN(false);
        } catch (Exception unused) {
            m73472DN(false);
        }
    }

    /* renamed from: PM */
    private final void m73486PM() {
        AbstractC22888j abstractC22888j;
        final C25596a m132219a = C25596a.Companion.m132219a();
        ZaloLauncherActivity.C10971a c10971a = ZaloLauncherActivity.Companion;
        InterfaceC6472b m57111c = c10971a.m57111c();
        if (m57111c != null) {
            abstractC22888j = m57111c.mo33337b();
        } else {
            abstractC22888j = null;
        }
        InterfaceC6472b m57111c2 = c10971a.m57111c();
        if (m57111c2 != null) {
            m57111c2.mo33338c(this.f67540c1);
        }
        if (abstractC22888j != null) {
            final C13105b c13105b = new C13105b(m132219a);
            abstractC22888j.mo117578g(new InterfaceC22882g() { // from class: la0.c
                @Override // p342m6.InterfaceC22882g
                public final void onSuccess(Object obj) {
                    AboutView.m73487QM(InterfaceC18505l.this, obj);
                }
            });
        }
        if (abstractC22888j != null) {
            abstractC22888j.mo117576e(new InterfaceC22880f() { // from class: la0.d
                @Override // p342m6.InterfaceC22880f
                /* renamed from: b */
                public final void mo839b(Exception exc) {
                    AboutView.m73488RM(C25596a.this, this, exc);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QM */
    public static final void m73487QM(InterfaceC18505l interfaceC18505l, Object obj) {
        AbstractC19074t.m100208f(interfaceC18505l, "$tmp0");
        interfaceC18505l.mo205i9(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RM */
    public static final void m73488RM(C25596a c25596a, AboutView aboutView, Exception exc) {
        AbstractC19074t.m100208f(c25596a, "$settingLatestVersionItem");
        AbstractC19074t.m100208f(aboutView, "this$0");
        AbstractC19074t.m100208f(exc, "it");
        if (c25596a.m132215n() % 100000 > CoreUtility.f89236l % 100000) {
            aboutView.m73494dN();
        } else {
            aboutView.m73493cN(c25596a);
        }
    }

    /* renamed from: SM */
    private final void m73489SM() {
        if (C25596a.Companion.m132219a().m132214m() == 1 && AbstractC8955a.m47863a()) {
            m73519WM().setText(m92652XI(AbstractC8020f0.str_downloading_new_version));
            m73519WM().setEnabled(false);
            m73495eN();
            return;
        }
        m73509sN();
    }

    /* renamed from: YM */
    private final void m73490YM(String str) {
        int i11;
        try {
            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
            this.f67531T0 = m141798e;
            if (m141798e != null) {
                AbstractC19074t.m100205c(m141798e);
                i11 = m141798e.f42385V0;
            } else {
                i11 = 0;
            }
            if (this.f67531T0 != null) {
                if (C21927m.m114302u().m114357s().m153137g(AbstractC23306f.m120583H().m110204g().m116322n())) {
                    m73521ZM();
                    return;
                } else {
                    m73517UM(Integer.parseInt(AbstractC23306f.m120583H().m110204g().m116322n()));
                    return;
                }
            }
            if (this.f67537Z0) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C13106c());
            this.f67537Z0 = true;
            c0766k.mo1514Q4(str, i11, new TrackingSource((short) 1027));
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f72421L0.mo49315c4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aN */
    public final void m73491aN() {
        ListItemSetting listItemSetting = m73518VM().f137162E;
        String m92652XI = m92652XI(AbstractC8020f0.str_current_version_old);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        listItemSetting.setSubtitle(m92652XI);
        m73519WM().setVisibility(8);
        m73518VM().f137165H.setVisibility(8);
        m73468BN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bN */
    public final void m73492bN() {
        m73518VM().f137162E.getBadgeTitle().setVisibility(8);
        ListItemSetting listItemSetting = m73518VM().f137162E;
        String m92652XI = m92652XI(AbstractC8020f0.str_current_version_old);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        listItemSetting.setSubtitle(m92652XI);
        m73519WM().setText(m92652XI(AbstractC8020f0.str_downloading_new_version));
        m73519WM().setVisibility(0);
        m73519WM().setEnabled(false);
        m73518VM().f137165H.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cN */
    public final void m73493cN(C25596a c25596a) {
        m73519WM().setVisibility(8);
        ListItemSetting listItemSetting = m73518VM().f137162E;
        String m92652XI = m92652XI(AbstractC8020f0.str_current_version_new);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        listItemSetting.setSubtitle(m92652XI);
        Badge badgeTitle = m73518VM().f137162E.getBadgeTitle();
        Context context = getContext();
        AbstractC19074t.m100205c(context);
        badgeTitle.setBackground(C27280g.m139659b(context, AbstractC23322a.zds_ic_check_circle_solid_16, AbstractC2808b.gr70));
        m73518VM().f137162E.getBadgeTitle().setVisibility(0);
        m73476FN(c25596a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dN */
    public final void m73494dN() {
        ListItemSetting listItemSetting = m73518VM().f137162E;
        String m92652XI = m92652XI(AbstractC8020f0.str_current_version_old);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        listItemSetting.setSubtitle(m92652XI);
        m73519WM().setText(m92652XI(AbstractC8020f0.str_download_new_version));
        m73519WM().setVisibility(0);
        m73519WM().setOnClickListener(this);
        m73518VM().f137165H.setVisibility(8);
    }

    /* renamed from: eN */
    private final void m73495eN() {
        ZaloLauncherActivity.C10971a c10971a = ZaloLauncherActivity.Companion;
        if (c10971a.m57111c() == null) {
            m73509sN();
            return;
        }
        InterfaceC6472b m57111c = c10971a.m57111c();
        AbstractC19074t.m100205c(m57111c);
        AbstractC22888j mo33337b = m57111c.mo33337b();
        AbstractC19074t.m100207e(mo33337b, "getAppUpdateInfo(...)");
        InterfaceC6472b m57111c2 = c10971a.m57111c();
        AbstractC19074t.m100205c(m57111c2);
        m57111c2.mo33338c(this.f67540c1);
        final C13107d c13107d = new C13107d();
        mo33337b.mo117578g(new InterfaceC22882g() { // from class: la0.f
            @Override // p342m6.InterfaceC22882g
            public final void onSuccess(Object obj) {
                AboutView.m73496fN(InterfaceC18505l.this, obj);
            }
        });
        mo33337b.mo117576e(new InterfaceC22880f() { // from class: la0.g
            @Override // p342m6.InterfaceC22880f
            /* renamed from: b */
            public final void mo839b(Exception exc) {
                AboutView.m73497gN(AboutView.this, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fN */
    public static final void m73496fN(InterfaceC18505l interfaceC18505l, Object obj) {
        AbstractC19074t.m100208f(interfaceC18505l, "$tmp0");
        interfaceC18505l.mo205i9(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gN */
    public static final void m73497gN(AboutView aboutView, Exception exc) {
        AbstractC19074t.m100208f(aboutView, "this$0");
        AbstractC19074t.m100208f(exc, "it");
        aboutView.m73509sN();
    }

    /* renamed from: hN */
    private final boolean m73498hN() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iN */
    public static final void m73499iN(AboutView aboutView, AbstractC6501a abstractC6501a) {
        AbstractC19074t.m100208f(aboutView, "this$0");
        AbstractC19074t.m100208f(abstractC6501a, "state");
        if (abstractC6501a.mo33371c() == 11) {
            aboutView.m73468BN();
        }
    }

    /* renamed from: jN */
    private final void m73500jN() {
        AbstractC25330a.a aVar = AbstractC25330a.Companion;
        InterfaceC27218a m92692wK = m92692wK();
        AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
        aVar.m131171a(m92692wK);
    }

    /* renamed from: kN */
    private final void m73501kN() {
        AbstractC25834a.a aVar = AbstractC25834a.Companion;
        InterfaceC27218a m92692wK = m92692wK();
        AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
        aVar.m133202a(m92692wK);
    }

    /* renamed from: lN */
    private final void m73502lN() {
        AbstractC26734a.a aVar = AbstractC26734a.Companion;
        InterfaceC27218a m92692wK = m92692wK();
        AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
        aVar.m137529a(m92692wK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mN */
    public static final void m73503mN(AboutView aboutView) {
        AtomicBoolean atomicBoolean;
        AbstractC19074t.m100208f(aboutView, "this$0");
        try {
            try {
                AbstractC24560b.m127938c();
                AbstractC24560b.m127940e();
                AbstractC24560b.m127936a();
                AbstractC24560b.m127937b();
                AbstractC24560b.m127939d();
                C20882b.Companion.m109143a();
                Companion.m73532b(aboutView.f72421L0.m92648SI());
                AbstractC19026c.m100084b(MainApplication.Companion.m35500c(), 0L);
                if (C23476m.m123246d() && !AbstractC19164e.m100528n()) {
                    AbstractC25803k.m132966f(true);
                }
                atomicBoolean = f67530e1;
            } catch (Exception e11) {
                e11.printStackTrace();
                atomicBoolean = f67530e1;
                synchronized (atomicBoolean) {
                    try {
                        atomicBoolean.set(false);
                        if (aboutView.f72421L0.m92672lJ()) {
                            aboutView.f72421L0.mo78960q3();
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            synchronized (atomicBoolean) {
                try {
                    atomicBoolean.set(false);
                    if (aboutView.f72421L0.m92672lJ()) {
                        aboutView.f72421L0.mo78960q3();
                    }
                    C24848g0 c24848g02 = C24848g0.f119245a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            AtomicBoolean atomicBoolean2 = f67530e1;
            synchronized (atomicBoolean2) {
                try {
                    atomicBoolean2.set(false);
                    if (aboutView.f72421L0.m92672lJ()) {
                        aboutView.f72421L0.mo78960q3();
                    }
                    C24848g0 c24848g03 = C24848g0.f119245a;
                    throw th4;
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }
    }

    /* renamed from: nN */
    private final void m73504nN() {
        boolean m155475a = AbstractC32236a.m155475a();
        AbstractC32236a.m155479e(!m155475a);
        if (m155475a) {
            mo59032jx(AbstractC8020f0.str_dev_tools_disabled);
            m73518VM().f137163F.setVisibility(8);
        }
        this.f67533V0 = 0;
    }

    /* renamed from: oN */
    private final void m73505oN() {
        AbstractC27309b.a aVar = AbstractC27309b.Companion;
        InterfaceC27218a m92692wK = m92692wK();
        AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
        aVar.m139839a(m92692wK);
    }

    /* renamed from: pN */
    private final void m73506pN() {
        AbstractC29092a.a aVar = AbstractC29092a.Companion;
        InterfaceC27218a m92692wK = m92692wK();
        AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
        aVar.m145337a(m92692wK);
    }

    /* renamed from: qN */
    private final void m73507qN() {
        AbstractC30164a.a aVar = AbstractC30164a.Companion;
        InterfaceC27218a m92692wK = m92692wK();
        AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
        aVar.m148795a(m92692wK);
    }

    /* renamed from: rN */
    private final void m73508rN() {
        AbstractC31019a.a aVar = AbstractC31019a.Companion;
        InterfaceC27218a m92692wK = m92692wK();
        AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
        aVar.m150823a(m92692wK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sN */
    public final void m73509sN() {
        String str;
        ZaloWebView.C15403a c15403a = ZaloWebView.Companion;
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        int i11 = AbstractC8020f0.str_ratezalo_url;
        Object[] objArr = new Object[1];
        Context m92648SI = this.f72421L0.m92648SI();
        if (m92648SI != null) {
            str = m92648SI.getPackageName();
        } else {
            str = null;
        }
        objArr[0] = str;
        c15403a.m87168C(m92676n2, AbstractC23136l9.m118746s0(i11, objArr));
        C0815e1.m2079N(98, 1, 0, 0, 0);
        InterfaceC6472b m57111c = ZaloLauncherActivity.Companion.m57111c();
        if (m57111c != null) {
            m57111c.mo33340e(this.f67540c1);
        }
        m73519WM().setText(m92652XI(AbstractC8020f0.str_download_new_version));
        m73519WM().setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tN */
    public final void m73510tN(InterfaceC20578a0 interfaceC20578a0, InterfaceC22508f interfaceC22508f) {
        m73518VM().f137165H.m91447b1(interfaceC22508f, interfaceC20578a0);
        m73518VM().f137165H.m91446Z0(new C13109f());
    }

    /* renamed from: uN */
    public static final void m73511uN(Context context) {
        Companion.m73532b(context);
    }

    /* renamed from: xN */
    private final void m73513xN() {
        Context m35500c = MainApplication.Companion.m35500c();
        ListItemSetting listItemSetting = m73518VM().f137162E;
        m73528wN(new Button(m35500c));
        m73519WM().setIdTracking("about_version_update");
        m73519WM().m90539c(AbstractC2814h.ButtonSmall_Secondary);
        m73519WM().setVisibility(8);
        listItemSetting.setIdTracking("about_version");
        listItemSetting.getLlRight().addView(m73519WM());
        listItemSetting.setTitleMaxLine(2);
        String string = m35500c.getString(AbstractC8020f0.str_current_version, CoreUtility.f89234j);
        AbstractC19074t.m100207e(string, "getString(...)");
        listItemSetting.setTitle(string);
        listItemSetting.m90592m(false);
        listItemSetting.setOnClickListener(this);
        ListItemSetting listItemSetting2 = m73518VM().f137176z;
        RecyclingImageView recyclingImageView = new RecyclingImageView(m35500c);
        recyclingImageView.setImageDrawable(C27280g.m139660c(m35500c, AbstractC23322a.zds_ic_open_out_app_line_16, AbstractC2807a.icon_01));
        recyclingImageView.setBackgroundResource(AbstractC16803z.bg_icon_circle);
        int m118742r = AbstractC23136l9.m118742r(8.0f);
        recyclingImageView.setPadding(m118742r, m118742r, m118742r, m118742r);
        listItemSetting2.setIdTracking("about_feature");
        listItemSetting2.getLlRight().addView(recyclingImageView);
        String string2 = m35500c.getString(AbstractC8020f0.str_feature_instruction);
        AbstractC19074t.m100207e(string2, "getString(...)");
        listItemSetting2.setTitle(string2);
        listItemSetting2.setOnClickListener(this);
        ListItemSetting listItemSetting3 = m73518VM().f137158A;
        RecyclingImageView recyclingImageView2 = new RecyclingImageView(m35500c);
        recyclingImageView2.setImageDrawable(C27280g.m139660c(m35500c, AbstractC23322a.zds_ic_chat_line_16, AbstractC2807a.icon_01));
        recyclingImageView2.setBackgroundResource(AbstractC16803z.bg_icon_circle);
        int m118742r2 = AbstractC23136l9.m118742r(8.0f);
        recyclingImageView2.setPadding(m118742r2, m118742r2, m118742r2, m118742r2);
        listItemSetting3.setIdTracking("about_contact");
        listItemSetting3.getLlRight().addView(recyclingImageView2);
        String string3 = m35500c.getString(AbstractC8020f0.str_contact_page_support);
        AbstractC19074t.m100207e(string3, "getString(...)");
        listItemSetting3.setTitle(string3);
        listItemSetting3.setOnClickListener(this);
        ListItemSetting listItemSetting4 = m73518VM().f137161D;
        listItemSetting4.setIdTracking("about_feedback");
        String string4 = m35500c.getString(AbstractC8020f0.str_send_qos_log);
        AbstractC19074t.m100207e(string4, "getString(...)");
        listItemSetting4.setTitle(string4);
        listItemSetting4.m90592m(false);
        listItemSetting4.setOnClickListener(this);
        ListItemSetting listItemSetting5 = m73518VM().f137160C;
        listItemSetting5.setIdTracking("about_policy");
        String string5 = m35500c.getString(AbstractC8020f0.str_terms_of_service);
        AbstractC19074t.m100207e(string5, "getString(...)");
        listItemSetting5.setTitle(string5);
        listItemSetting5.setOnClickListener(this);
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        ZaloLauncherActivity.C10971a c10971a = ZaloLauncherActivity.Companion;
        if (c10971a.m57111c() == null) {
            c10971a.m57119k(AbstractC6474c.m33341a(MainApplication.Companion.m35500c()));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        ZaloLauncherActivity.C10971a c10971a = ZaloLauncherActivity.Companion;
        InterfaceC6472b m57111c = c10971a.m57111c();
        if (m57111c != null) {
            m57111c.mo33340e(this.f67540c1);
        }
        c10971a.m57119k(null);
        super.mo39024IJ();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_about_us_title);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m87077NK.setMiddleTitle(m118743r0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: TM */
    public final void m73516TM() {
        try {
            if (C21927m.m114302u().m114357s().m153137g(AbstractC23306f.m120583H().m110204g().m116322n())) {
                if (this.f67531T0 != null) {
                    m73521ZM();
                }
            } else {
                m73490YM(AbstractC23306f.m120583H().m110204g().m116322n());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        AbstractC0924m0.m3814fi(true);
    }

    /* renamed from: UM */
    public final void m73517UM(int i11) {
        try {
            if (this.f67538a1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(this.f67539b1);
            this.f67538a1 = true;
            TrackingSource m114310H = C21927m.m114302u().m114310H(String.valueOf(i11));
            if (m114310H == null) {
                m114310H = new TrackingSource(-1);
            }
            c0766k.mo1578Y4(i11, m114310H);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: VM */
    public final C29701a m73518VM() {
        C29701a c29701a = this.f67535X0;
        if (c29701a != null) {
            return c29701a;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: WM */
    public final Button m73519WM() {
        Button button = this.f67534W0;
        if (button != null) {
            return button;
        }
        AbstractC19074t.m100223u("buttonUpdate");
        return null;
    }

    /* renamed from: XM */
    public final InterfaceC6502b m73520XM() {
        return this.f67540c1;
    }

    /* renamed from: ZM */
    public final void m73521ZM() {
        try {
            ContactProfile contactProfile = this.f67531T0;
            if (contactProfile != null) {
                AbstractC19074t.m100205c(contactProfile);
                if (!TextUtils.isEmpty(contactProfile.f42434r)) {
                    ContactProfile contactProfile2 = this.f67531T0;
                    AbstractC19074t.m100205c(contactProfile2);
                    String mo2478b = contactProfile2.mo2478b();
                    AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                    Bundle m140776b = new C27870vb(mo2478b).m140780g(this.f67531T0).m140776b();
                    Intent intent = new Intent();
                    intent.putExtras(m140776b);
                    InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
                    if (m92676n2 != null) {
                        m92676n2.mo35573l4(ChatView.class, intent.getExtras(), 1, true);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "AboutView";
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: mM */
    public int mo73522mM() {
        return 46;
    }

    @Override // la0.InterfaceC22275m
    /* renamed from: od */
    public C22229g7[] mo73523od() {
        ListItemSetting listItemSetting = m73518VM().f137162E;
        AbstractC19074t.m100207e(listItemSetting, "rlVersion");
        ListItemSetting listItemSetting2 = m73518VM().f137176z;
        AbstractC19074t.m100207e(listItemSetting2, "rlAllFeature");
        ListItemSetting listItemSetting3 = m73518VM().f137158A;
        AbstractC19074t.m100207e(listItemSetting3, "rlContactSupport");
        ListItemSetting listItemSetting4 = m73518VM().f137161D;
        AbstractC19074t.m100207e(listItemSetting4, "rlSendEmail");
        ListItemSetting listItemSetting5 = m73518VM().f137160C;
        AbstractC19074t.m100207e(listItemSetting5, "rlPolicyAbout");
        return new C22229g7[]{new C22229g7(listItemSetting, 81), new C22229g7(listItemSetting2, 84), new C22229g7(listItemSetting3, 83), new C22229g7(listItemSetting4, 88), new C22229g7(listItemSetting5, 85)};
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 100 && i12 != -1) {
            InterfaceC6472b m57111c = ZaloLauncherActivity.Companion.m57111c();
            if (m57111c != null) {
                m57111c.mo33340e(this.f67540c1);
            }
            m73519WM().setText(m92652XI(AbstractC8020f0.str_download_new_version));
            m73519WM().setEnabled(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0110 A[Catch: Exception -> 0x0054, TryCatch #1 {Exception -> 0x0054, blocks: (B:3:0x0005, B:5:0x0013, B:6:0x001e, B:12:0x004c, B:13:0x004d, B:14:0x01a9, B:21:0x0057, B:22:0x0058, B:23:0x0059, B:25:0x0065, B:26:0x006f, B:28:0x007b, B:29:0x0099, B:31:0x00a5, B:33:0x00ad, B:34:0x00b3, B:35:0x00ba, B:37:0x00c6, B:39:0x00ce, B:41:0x00d4, B:43:0x00df, B:45:0x00e3, B:48:0x00ea, B:50:0x00f2, B:53:0x00fe, B:54:0x0106, B:56:0x0110, B:57:0x0113, B:58:0x0101, B:59:0x011a, B:61:0x0124, B:62:0x0129, B:64:0x0135, B:65:0x013a, B:67:0x0146, B:68:0x014a, B:70:0x0156, B:71:0x015a, B:73:0x0166, B:74:0x016a, B:76:0x0176, B:77:0x017a, B:79:0x0186, B:80:0x018a, B:82:0x0196, B:83:0x019a, B:85:0x01a6, B:8:0x001f, B:10:0x0025, B:11:0x004a, B:18:0x0034), top: B:2:0x0005, inners: #0 }] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        try {
            if (AbstractC19074t.m100204b(view, m73518VM().f137161D)) {
                AbstractC20110a.f98889a.mo104548a("click send email qos", new Object[0]);
                AtomicBoolean atomicBoolean = f67530e1;
                synchronized (atomicBoolean) {
                    try {
                        if (atomicBoolean.get()) {
                            ToastUtils.m89266n(AbstractC8020f0.waiting, new Object[0]);
                            this.f72421L0.mo46829Y();
                        } else {
                            atomicBoolean.set(true);
                            this.f72421L0.mo46829Y();
                            AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: la0.a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AboutView.m73503mN(AboutView.this);
                                }
                            });
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } finally {
                    }
                }
                C0815e1.m2079N(100, 1, 0, 0, 0);
            } else if (AbstractC19074t.m100204b(view, m73518VM().f137158A)) {
                m73516TM();
                C0815e1.m2079N(83, 1, 0, 0, 0);
            } else if (AbstractC19074t.m100204b(view, m73518VM().f137176z)) {
                ZaloWebView.Companion.m87168C(this.f72421L0.m92676n2(), AbstractC23306f.m120583H().m110204g().m116318j());
                C0815e1.m2079N(84, 1, 0, 0, 0);
            } else if (AbstractC19074t.m100204b(view, m73518VM().f137160C)) {
                C17487o0 m92662fJ = this.f72421L0.m92662fJ();
                if (m92662fJ != null) {
                    m92662fJ.m93069k2(PolicyZView.class, null, 1, true);
                }
                C0815e1.m2079N(85, 1, 0, 0, 0);
            } else if (AbstractC19074t.m100204b(view, m73518VM().f137162E)) {
                if (m73498hN() && AbstractC32236a.m155475a() && System.currentTimeMillis() - this.f67532U0 > 1000) {
                    m73466AN();
                    return;
                }
                if (this.f67533V0 >= 10) {
                    return;
                }
                if (this.f67532U0 != 0 && System.currentTimeMillis() - this.f67532U0 >= 1000) {
                    this.f67533V0 = 0;
                    this.f67532U0 = System.currentTimeMillis();
                    if (this.f67533V0 == 10) {
                        m73466AN();
                    }
                    C0815e1.m2079N(81, 1, 0, 0, 0);
                }
                this.f67533V0++;
                this.f67532U0 = System.currentTimeMillis();
                if (this.f67533V0 == 10) {
                }
                C0815e1.m2079N(81, 1, 0, 0, 0);
            } else if (AbstractC19074t.m100204b(view, m73519WM())) {
                m73489SM();
            } else if (AbstractC19074t.m100204b(view, m73518VM().f137167q)) {
                m73504nN();
            } else if (AbstractC19074t.m100204b(view, m73518VM().f137172v)) {
                m73505oN();
            } else if (AbstractC19074t.m100204b(view, m73518VM().f137171u)) {
                m73502lN();
            } else if (AbstractC19074t.m100204b(view, m73518VM().f137174x)) {
                m73507qN();
            } else if (AbstractC19074t.m100204b(view, m73518VM().f137170t)) {
                m73501kN();
            } else if (AbstractC19074t.m100204b(view, m73518VM().f137169s)) {
                m73500jN();
            } else if (AbstractC19074t.m100204b(view, m73518VM().f137173w)) {
                m73506pN();
            } else if (AbstractC19074t.m100204b(view, m73518VM().f137175y)) {
                m73508rN();
            }
            AbstractC26084s.m134258f(0, this, view.getId());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        this.f72421L0.mo49315c4();
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: qM */
    public void mo73524qM() {
        m73513xN();
        m73498hN();
        if (C21927m.m114302u().m114318P(AbstractC23306f.m120583H().m110204g().m116322n())) {
            ContactProfile m153138j = C21927m.m114302u().m114357s().m153138j("153426290");
            this.f67531T0 = m153138j;
            if (m153138j == null) {
                this.f67531T0 = C7960e.m41971c6().m42228P5(AbstractC23306f.m120583H().m110204g().m116322n());
            }
        }
        m73486PM();
        AbstractC23126l.m118627a(f67529d1);
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: rM */
    public View mo73525rM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        C29701a m147698b = C29701a.m147698b(layoutInflater, viewGroup);
        AbstractC19074t.m100207e(m147698b, "inflate(...)");
        m73527vN(m147698b);
        View root = m73518VM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: uM */
    public void mo73526uM() {
    }

    /* renamed from: vN */
    public final void m73527vN(C29701a c29701a) {
        AbstractC19074t.m100208f(c29701a, "<set-?>");
        this.f67535X0 = c29701a;
    }

    /* renamed from: wN */
    public final void m73528wN(Button button) {
        AbstractC19074t.m100208f(button, "<set-?>");
        this.f67534W0 = button;
    }

    /* renamed from: yN */
    public final void m73529yN(boolean z11) {
        this.f67538a1 = z11;
    }

    /* renamed from: zN */
    public final void m73530zN(boolean z11) {
        this.f67537Z0 = z11;
    }
}
