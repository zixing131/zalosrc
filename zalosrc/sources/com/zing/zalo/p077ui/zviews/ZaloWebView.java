package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0762g;
import am.AbstractC0900b0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.GeolocationPermissions;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.text.AbstractC1463b;
import c30.C3245i;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.libwebview.browser.p067ui.ZaloSystemWebView;
import com.zing.zalo.p077ui.WebViewMPActivity;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.custom.floating.MiniMenuFloatingView;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.webview.AbstractC16795m;
import com.zing.zalo.webview.C16793k;
import com.zing.zalo.webview.C16794l;
import com.zing.zalo.webview.ZWebView;
import com.zing.zalo.webview.miniapp.webview_bottomsheet.p079ui.WebViewBottomSheet;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.AbstractC17468f;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.actionbar.MinimizableActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kd0.C21691a;
import kd0.C21697g;
import ly.C22688w;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.C23055e5;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import on0.C24329j;
import org.json.JSONObject;
import p140ev.C18613b;
import p140ev.C18620i;
import p170fv.AbstractC19147a;
import p170fv.C19150d;
import p170fv.C19153g;
import p170fv.C19156j;
import p170fv.C19159m;
import p170fv.InterfaceC19148b;
import p189gv.C19602a;
import p189gv.C19609h;
import p227i3.C20218v;
import p262jb.AbstractC21196a;
import p278jv.C21368b;
import p278jv.C21369c;
import p307kv.AbstractC21954k;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p454qn.AbstractC25384a;
import p483rh.InterfaceC25792a;
import p530tx.AbstractC26903a;
import p542ub.InterfaceC27218a;
import p645xh.C29628e;
import p716zh.C31944h6;
import pm0.C24848g0;
import th.AbstractC26684e;
import vf0.C28005e;

/* loaded from: classes6.dex */
public class ZaloWebView extends WebBaseView implements InterfaceC0733x {
    public static final C15403a Companion = new C15403a(null);

    /* renamed from: g2 */
    private static UUID f79680g2;

    /* renamed from: S1 */
    private boolean f79681S1;

    /* renamed from: T1 */
    private int f79682T1;

    /* renamed from: U1 */
    private C28005e f79683U1;

    /* renamed from: V1 */
    private C8009j f79684V1;

    /* renamed from: Y1 */
    private ActionBarMenuItem f79687Y1;

    /* renamed from: a2 */
    private MiniMenuFloatingView f79689a2;

    /* renamed from: b2 */
    private MinimizableActionBar f79690b2;

    /* renamed from: c2 */
    private Handler f79691c2;

    /* renamed from: f2 */
    private ValueAnimator f79694f2;

    /* renamed from: W1 */
    private AtomicBoolean f79685W1 = new AtomicBoolean(false);

    /* renamed from: X1 */
    private int f79686X1 = -1;

    /* renamed from: Z1 */
    private final C15408f f79688Z1 = new C15408f();

    /* renamed from: d2 */
    private int f79692d2 = 2;

    /* renamed from: e2 */
    private boolean f79693e2 = true;

    /* renamed from: com.zing.zalo.ui.zviews.ZaloWebView$a */
    /* loaded from: classes6.dex */
    public static final class C15403a {

        /* renamed from: com.zing.zalo.ui.zviews.ZaloWebView$a$a */
        /* loaded from: classes6.dex */
        public static final class a implements InterfaceC20094a {

            /* renamed from: a */
            final /* synthetic */ InterfaceC27218a f79695a;

            /* renamed from: b */
            final /* synthetic */ Bundle f79696b;

            /* renamed from: c */
            final /* synthetic */ String f79697c;

            /* renamed from: d */
            final /* synthetic */ int f79698d;

            a(InterfaceC27218a interfaceC27218a, Bundle bundle, String str, int i11) {
                this.f79695a = interfaceC27218a;
                this.f79696b = bundle;
                this.f79697c = str;
                this.f79698d = i11;
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: a */
            public void mo926a(C20096c c20096c) {
                C15403a.m87157l(ZaloWebView.Companion, this.f79695a, this.f79696b, null, 4, null);
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: b */
            public void mo927b(Object obj) {
                JSONObject jSONObject;
                String obj2;
                JSONObject m131571b;
                if (obj != null && (obj2 = obj.toString()) != null && (m131571b = AbstractC25384a.m131571b(obj2)) != null) {
                    jSONObject = m131571b.optJSONObject("data");
                } else {
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    C15403a.m87157l(ZaloWebView.Companion, this.f79695a, this.f79696b, null, 4, null);
                    return;
                }
                int optInt = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                JSONObject optJSONObject = jSONObject.optJSONObject("item");
                if (optInt == 1) {
                    BTSSuggestOpenApp.Companion.m78272d(this.f79695a, this.f79696b, optJSONObject, this.f79697c, this.f79698d);
                } else {
                    C15403a.m87157l(ZaloWebView.Companion, this.f79695a, this.f79696b, null, 4, null);
                }
            }
        }

        /* renamed from: com.zing.zalo.ui.zviews.ZaloWebView$a$b */
        /* loaded from: classes6.dex */
        public static final class b extends C22688w.b {

            /* renamed from: f */
            final /* synthetic */ InterfaceC27218a f79699f;

            /* renamed from: g */
            final /* synthetic */ C22688w f79700g;

            /* renamed from: h */
            final /* synthetic */ Bundle f79701h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC27218a interfaceC27218a, C22688w c22688w, Bundle bundle) {
                super(null, interfaceC27218a, false);
                this.f79699f = interfaceC27218a;
                this.f79700g = c22688w;
                this.f79701h = bundle;
            }

            /* renamed from: s0 */
            public static final void m87183s0(C22688w c22688w, InterfaceC27218a interfaceC27218a, Bundle bundle) {
                AbstractC19074t.m100208f(c22688w, "$zaloQrCodeParser");
                AbstractC19074t.m100208f(interfaceC27218a, "$act");
                try {
                    if (c22688w.m117348f(ZaloWebView.f79680g2)) {
                        ZaloWebView.f79680g2 = null;
                        interfaceC27218a.mo35581q(ZaloWebView.class, bundle, -1, 1, true);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }

            /* renamed from: t0 */
            public static final void m87184t0(InterfaceC27218a interfaceC27218a, C19609h c19609h, Bundle bundle, C18620i c18620i) {
                AbstractC19074t.m100208f(interfaceC27218a, "$act");
                AbstractC19074t.m100208f(c19609h, "$miniProgramInfo");
                WebBaseView.Companion.m86843s(interfaceC27218a, c19609h, bundle, c18620i);
            }

            /* renamed from: u0 */
            public static final void m87185u0(C22688w c22688w, Bundle bundle, Bundle bundle2, InterfaceC27218a interfaceC27218a, Class cls, int i11) {
                AbstractC19074t.m100208f(c22688w, "$zaloQrCodeParser");
                AbstractC19074t.m100208f(bundle2, "$data");
                AbstractC19074t.m100208f(interfaceC27218a, "$act");
                AbstractC19074t.m100208f(cls, "$cls");
                try {
                    if (c22688w.m117348f(ZaloWebView.f79680g2)) {
                        ZaloWebView.f79680g2 = null;
                        Bundle bundle3 = new Bundle();
                        if (bundle != null) {
                            bundle2.putAll(ZaloWebView.Companion.m87156j(bundle, bundle2));
                            bundle3.putAll(bundle2);
                        }
                        interfaceC27218a.mo35581q(cls, bundle3, i11, 1, true);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }

            @Override // ly.InterfaceC22668c
            /* renamed from: a */
            public void mo49370a(int i11) {
            }

            @Override // ly.C22688w.b, ly.InterfaceC22668c
            /* renamed from: e */
            public void mo49372e(C20096c c20096c) {
                AbstractC19074t.m100208f(c20096c, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
                AbstractC21954k.Companion.m114607G(new Runnable() { // from class: com.zing.zalo.ui.zviews.y71

                    /* renamed from: q */
                    public final /* synthetic */ InterfaceC27218a f82720q;

                    /* renamed from: r */
                    public final /* synthetic */ Bundle f82721r;

                    public /* synthetic */ y71(InterfaceC27218a interfaceC27218a, Bundle bundle) {
                        r2 = interfaceC27218a;
                        r3 = bundle;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZaloWebView.C15403a.b.m87183s0(C22688w.this, r2, r3);
                    }
                });
            }

            @Override // ly.InterfaceC22668c
            /* renamed from: f */
            public void mo49373f(C19609h c19609h, C18620i c18620i) {
                AbstractC19074t.m100208f(c19609h, "miniProgramInfo");
                AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.x71

                    /* renamed from: q */
                    public final /* synthetic */ C19609h f82608q;

                    /* renamed from: r */
                    public final /* synthetic */ Bundle f82609r;

                    /* renamed from: s */
                    public final /* synthetic */ C18620i f82610s;

                    public /* synthetic */ x71(C19609h c19609h2, Bundle bundle, C18620i c18620i2) {
                        r2 = c19609h2;
                        r3 = bundle;
                        r4 = c18620i2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZaloWebView.C15403a.b.m87184t0(InterfaceC27218a.this, r2, r3, r4);
                    }
                });
            }

            @Override // ly.InterfaceC22668c
            /* renamed from: u */
            public void mo49386u(Class cls, Bundle bundle, int i11) {
                AbstractC19074t.m100208f(cls, "cls");
                AbstractC19074t.m100208f(bundle, "data");
                AbstractC21954k.Companion.m114607G(new Runnable() { // from class: com.zing.zalo.ui.zviews.z71

                    /* renamed from: q */
                    public final /* synthetic */ Bundle f82821q;

                    /* renamed from: r */
                    public final /* synthetic */ Bundle f82822r;

                    /* renamed from: s */
                    public final /* synthetic */ InterfaceC27218a f82823s;

                    /* renamed from: t */
                    public final /* synthetic */ Class f82824t;

                    /* renamed from: u */
                    public final /* synthetic */ int f82825u;

                    public /* synthetic */ z71(Bundle bundle2, Bundle bundle3, InterfaceC27218a interfaceC27218a, Class cls2, int i112) {
                        r2 = bundle2;
                        r3 = bundle3;
                        r4 = interfaceC27218a;
                        r5 = cls2;
                        r6 = i112;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZaloWebView.C15403a.b.m87185u0(C22688w.this, r2, r3, r4, r5, r6);
                    }
                });
            }
        }

        private C15403a() {
        }

        public /* synthetic */ C15403a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: A */
        public static final void m87143A(InterfaceC27218a interfaceC27218a, Bundle bundle) {
            AbstractC19074t.m100208f(interfaceC27218a, "$act");
            interfaceC27218a.mo35573l4(ZaloWebView.class, bundle, 1, true);
        }

        /* renamed from: I */
        public static /* synthetic */ void m87144I(C15403a c15403a, InterfaceC27218a interfaceC27218a, String str, Bundle bundle, boolean z11, int i11, InterfaceC25792a.c cVar, int i12, Object obj) {
            if ((i12 & 32) != 0) {
                cVar = null;
            }
            c15403a.m87173H(interfaceC27218a, str, bundle, z11, i11, cVar);
        }

        /* renamed from: J */
        public static final void m87145J(C17487o0 c17487o0, Bundle bundle) {
            if (c17487o0 != null) {
                c17487o0.m93069k2(ZaloWebView.class, bundle, 1, true);
            }
        }

        /* renamed from: K */
        public static final void m87146K(InterfaceC27218a interfaceC27218a, Bundle bundle) {
            AbstractC19074t.m100208f(interfaceC27218a, "$act");
            AbstractC19074t.m100208f(bundle, "$bundle");
            interfaceC27218a.mo35573l4(ZaloWebView.class, bundle, 1, true);
        }

        /* renamed from: i */
        private final boolean m87155i(String str) {
            List list = AbstractC26684e.f126418k;
            AbstractC19074t.m100207e(list, "JUMPLINK_DOMAIN_REQUIRED");
            return m87160r(str, list);
        }

        /* renamed from: j */
        public final Bundle m87156j(Bundle bundle, Bundle bundle2) {
            if (bundle2.containsKey("EXTRA_WEB_URL") && bundle.containsKey("EXTRA_WEB_URL")) {
                bundle.remove("EXTRA_WEB_URL");
            }
            Serializable serializable = bundle2.getSerializable("EXTRA_FEATURE_ID");
            if (serializable != null && (serializable instanceof C18613b) && ((C18613b) serializable).m98348a() == 4) {
                int i11 = bundle.getInt("EXTRA_OPEN_LINK_SOURCE", 0);
                bundle.remove("EXTRA_OPEN_LINK_SOURCE");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("open_source", TrackingSource.m40664c(i11));
                bundle.putString("extra_param_info", jSONObject.toString());
            }
            return bundle;
        }

        /* renamed from: l */
        public static /* synthetic */ void m87157l(C15403a c15403a, InterfaceC27218a interfaceC27218a, Bundle bundle, String str, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                bundle = null;
            }
            if ((i11 & 4) != 0) {
                str = null;
            }
            c15403a.m87174k(interfaceC27218a, bundle, str);
        }

        /* renamed from: m */
        public static final void m87158m(Bundle bundle, String str, InterfaceC27218a interfaceC27218a) {
            AbstractC19074t.m100208f(interfaceC27218a, "$act");
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            if (str != null && str.length() != 0) {
                bundle2.putString("EXTRA_WEB_URL", str);
            }
            interfaceC27218a.mo35581q(ZaloWebView.class, bundle2, -1, 1, true);
        }

        /* renamed from: o */
        private final boolean m87159o(InterfaceC27218a interfaceC27218a, Bundle bundle, InterfaceC25792a.c cVar) {
            WebViewBottomSheet.C16797a c16797a = WebViewBottomSheet.Companion;
            Bundle m89726d = c16797a.m89726d(bundle.getString("BUNDLE_ALL_H5_DATA"), bundle, cVar);
            if (m89726d != null) {
                C17487o0 mo35579p = interfaceC27218a.mo35579p();
                AbstractC19074t.m100207e(mo35579p, "getZaloViewManager(...)");
                c16797a.m89725b(mo35579p, m89726d);
                return true;
            }
            return false;
        }

        /* renamed from: r */
        private final boolean m87160r(String str, List list) {
            boolean m127126v;
            try {
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                int length = str2.length();
                if (str.length() >= length) {
                    String substring = str.substring(str.length() - length);
                    AbstractC19074t.m100207e(substring, "substring(...)");
                    m127126v = AbstractC24341v.m127126v(substring, str2, true);
                    if (m127126v) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: t */
        private final boolean m87161t(String str) {
            List list = AbstractC26684e.f126416i;
            AbstractC19074t.m100207e(list, "JUMPLINK_DOMAIN_901");
            return m87160r(str, list);
        }

        /* renamed from: v */
        private final void m87162v(InterfaceC27218a interfaceC27218a, String str, Bundle bundle, int i11) {
            if (!C23055e5.m118273h(false, 1, null)) {
                AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.v71

                    /* renamed from: q */
                    public final /* synthetic */ Bundle f82393q;

                    public /* synthetic */ v71(Bundle bundle2) {
                        r2 = bundle2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZaloWebView.C15403a.m87163w(InterfaceC27218a.this, r2);
                    }
                });
                return;
            }
            C0762g c0762g = new C0762g();
            c0762g.m1341j(new a(interfaceC27218a, bundle2, str, i11));
            c0762g.m1377p(str, i11);
        }

        /* renamed from: w */
        public static final void m87163w(InterfaceC27218a interfaceC27218a, Bundle bundle) {
            AbstractC19074t.m100208f(interfaceC27218a, "$act");
            interfaceC27218a.mo35581q(ZaloWebView.class, bundle, -1, 1, true);
        }

        /* renamed from: x */
        private final void m87164x(InterfaceC27218a interfaceC27218a, String str, Bundle bundle, int i11) {
            boolean m127126v;
            boolean m127126v2;
            boolean m127126v3;
            try {
                if (!C23055e5.m118273h(false, 1, null)) {
                    AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.s71

                        /* renamed from: q */
                        public final /* synthetic */ Bundle f81905q;

                        public /* synthetic */ s71(Bundle bundle2) {
                            r2 = bundle2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ZaloWebView.C15403a.m87165y(InterfaceC27218a.this, r2);
                        }
                    });
                    return;
                }
                if (str != null) {
                    URI uri = new URI(str);
                    AbstractC20110a.f98889a.mo104548a(WebBaseView.Companion.m86836j(), "dataString:" + str);
                    m127126v = AbstractC24341v.m127126v("zalo", uri.getScheme(), true);
                    if (!m127126v) {
                        m127126v2 = AbstractC24341v.m127126v("http", uri.getScheme(), true);
                        if (!m127126v2) {
                            m127126v3 = AbstractC24341v.m127126v("https", uri.getScheme(), true);
                            if (!m127126v3) {
                                str = null;
                            }
                        }
                    } else {
                        str = new C24329j("zalo://").m127020h(str, "http://");
                    }
                    if (!TextUtils.isEmpty(str)) {
                        AbstractC21954k.Companion.m114607G(new Runnable() { // from class: com.zing.zalo.ui.zviews.t71

                            /* renamed from: p */
                            public final /* synthetic */ String f82180p;

                            /* renamed from: q */
                            public final /* synthetic */ int f82181q;

                            /* renamed from: r */
                            public final /* synthetic */ InterfaceC27218a f82182r;

                            /* renamed from: s */
                            public final /* synthetic */ Bundle f82183s;

                            public /* synthetic */ t71(String str2, int i112, InterfaceC27218a interfaceC27218a2, Bundle bundle2) {
                                r1 = str2;
                                r2 = i112;
                                r3 = interfaceC27218a2;
                                r4 = bundle2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ZaloWebView.C15403a.m87166z(r1, r2, r3, r4);
                            }
                        });
                    } else {
                        AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.u71

                            /* renamed from: q */
                            public final /* synthetic */ Bundle f82277q;

                            public /* synthetic */ u71(Bundle bundle2) {
                                r2 = bundle2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ZaloWebView.C15403a.m87143A(InterfaceC27218a.this, r2);
                            }
                        });
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: y */
        public static final void m87165y(InterfaceC27218a interfaceC27218a, Bundle bundle) {
            AbstractC19074t.m100208f(interfaceC27218a, "$act");
            interfaceC27218a.mo35581q(ZaloWebView.class, bundle, -1, 1, true);
        }

        /* renamed from: z */
        public static final void m87166z(String str, int i11, InterfaceC27218a interfaceC27218a, Bundle bundle) {
            AbstractC19074t.m100208f(interfaceC27218a, "$act");
            UUID randomUUID = UUID.randomUUID();
            ZaloWebView.f79680g2 = randomUUID;
            C22688w c22688w = new C22688w();
            c22688w.m117351i(randomUUID);
            c22688w.mo117295a(new b(interfaceC27218a, c22688w, bundle));
            c22688w.m117350h(str, i11);
        }

        /* renamed from: B */
        public final void m87167B(C17487o0 c17487o0, String str) {
            m87169D(c17487o0, str, new Bundle());
        }

        /* renamed from: C */
        public final void m87168C(InterfaceC27218a interfaceC27218a, String str) {
            if (interfaceC27218a != null) {
                m87171F(interfaceC27218a, str, new Bundle());
            }
        }

        /* renamed from: D */
        public final void m87169D(C17487o0 c17487o0, String str, Bundle bundle) {
            m87170E(c17487o0, str, bundle, false);
        }

        /* renamed from: E */
        public final void m87170E(C17487o0 c17487o0, String str, Bundle bundle, boolean z11) {
            if (bundle != null) {
                bundle.putString("EXTRA_WEB_URL", str);
                if (z11) {
                    bundle.putInt("SHOW_WITH_FLAGS", 134217728);
                }
            }
            AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.w71

                /* renamed from: q */
                public final /* synthetic */ Bundle f82494q;

                public /* synthetic */ w71(Bundle bundle2) {
                    r2 = bundle2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZaloWebView.C15403a.m87145J(C17487o0.this, r2);
                }
            });
        }

        /* renamed from: F */
        public final void m87171F(InterfaceC27218a interfaceC27218a, String str, Bundle bundle) {
            AbstractC19074t.m100208f(interfaceC27218a, "act");
            AbstractC19074t.m100208f(bundle, "bundle");
            m87144I(this, interfaceC27218a, str, bundle, false, 0, null, 32, null);
        }

        /* renamed from: G */
        public final void m87172G(InterfaceC27218a interfaceC27218a, String str, Bundle bundle, int i11) {
            AbstractC19074t.m100208f(interfaceC27218a, "act");
            AbstractC19074t.m100208f(bundle, "bundle");
            m87144I(this, interfaceC27218a, str, bundle, false, i11, null, 32, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:            if (m87161t(r0) != false) goto L64;     */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
        /* renamed from: H */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m87173H(InterfaceC27218a interfaceC27218a, String str, Bundle bundle, boolean z11, int i11, InterfaceC25792a.c cVar) {
            boolean z12;
            URI uri;
            AbstractC19074t.m100208f(interfaceC27218a, "act");
            AbstractC19074t.m100208f(bundle, "bundle");
            if (bundle.getBoolean("EXTRA_OPEN_FROM_MINI_APP")) {
                bundle.putString("EXTRA_WEB_URL", str);
                if (m87159o(interfaceC27218a, bundle, cVar)) {
                    return;
                }
            }
            boolean z13 = false;
            try {
                uri = new URI(str);
                z12 = true;
            } catch (URISyntaxException e11) {
                e11.printStackTrace();
            }
            if (uri.getHost() != null) {
                String host = uri.getHost();
                AbstractC19074t.m100207e(host, "getHost(...)");
                List list = AbstractC26684e.f126417j;
                AbstractC19074t.m100207e(list, "DOMAINS_NEED_JUMP_1265");
                if (m87160r(host, list)) {
                    z13 = true;
                    z12 = false;
                    bundle.putString("EXTRA_WEB_URL", str);
                    if (z11 && (bundle.getInt("SHOW_WITH_FLAGS") & 134217728) == 0) {
                        bundle.putInt("SHOW_WITH_FLAGS", bundle.getInt("SHOW_WITH_FLAGS") ^ 134217728);
                    }
                    if (i11 == 0) {
                        i11 = C22688w.Companion.m117352a(bundle.getInt("EXTRA_SOURCE_LINK"));
                    }
                    if (!z13 && str != null) {
                        m87162v(interfaceC27218a, str, bundle, i11);
                        return;
                    } else if (!z12) {
                        m87164x(interfaceC27218a, str, bundle, i11);
                        return;
                    } else {
                        AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.q71

                            /* renamed from: q */
                            public final /* synthetic */ Bundle f81681q;

                            public /* synthetic */ q71(Bundle bundle2) {
                                r2 = bundle2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ZaloWebView.C15403a.m87146K(InterfaceC27218a.this, r2);
                            }
                        });
                        return;
                    }
                }
            }
            if (uri.getHost() != null) {
                String host2 = uri.getHost();
                AbstractC19074t.m100207e(host2, "getHost(...)");
            }
            z12 = false;
            bundle2.putString("EXTRA_WEB_URL", str);
            if (z11) {
                bundle2.putInt("SHOW_WITH_FLAGS", bundle2.getInt("SHOW_WITH_FLAGS") ^ 134217728);
            }
            if (i11 == 0) {
            }
            if (!z13) {
            }
            if (!z12) {
            }
        }

        /* renamed from: k */
        public final void m87174k(InterfaceC27218a interfaceC27218a, Bundle bundle, String str) {
            AbstractC19074t.m100208f(interfaceC27218a, "act");
            AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.r71

                /* renamed from: p */
                public final /* synthetic */ Bundle f81789p;

                /* renamed from: q */
                public final /* synthetic */ String f81790q;

                /* renamed from: r */
                public final /* synthetic */ InterfaceC27218a f81791r;

                public /* synthetic */ r71(Bundle bundle2, String str2, InterfaceC27218a interfaceC27218a2) {
                    r1 = bundle2;
                    r2 = str2;
                    r3 = interfaceC27218a2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZaloWebView.C15403a.m87158m(r1, r2, r3);
                }
            });
        }

        /* renamed from: n */
        public final Uri m87175n(Uri uri) {
            AbstractC19074t.m100208f(uri, "uri");
            try {
                String m121931g5 = AbstractC23309i.m121931g5();
                if (TextUtils.isEmpty(m121931g5)) {
                    return uri;
                }
                String uri2 = uri.toString();
                AbstractC19074t.m100207e(uri2, "toString(...)");
                String encode = URLEncoder.encode(uri2, "utf-8");
                String str = m121931g5 + encode;
                WebBaseView.Companion.m86836j();
                C19067n0 c19067n0 = C19067n0.f94947a;
                AbstractC19074t.m100207e(String.format("\nBase url:%s\nEncoded url:%s\nFinal url:%s", Arrays.copyOf(new Object[]{uri2, encode, str}, 3)), "format(...)");
                return Uri.parse(str);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(WebBaseView.Companion.m86836j(), e11);
                return uri;
            }
        }

        /* renamed from: p */
        public final boolean m87176p(String str) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            String m153552r = C31944h6.m153552r(str);
            if (m153552r != null && m153552r.length() != 0) {
                List list = AbstractC26684e.f126417j;
                AbstractC19074t.m100207e(list, "DOMAINS_NEED_JUMP_1265");
                if (m87160r(m153552r, list)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: q */
        public final boolean m87177q(String str) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            String m153552r = C31944h6.m153552r(str);
            if (m153552r != null && m153552r.length() != 0 && m87161t(m153552r)) {
                return true;
            }
            return false;
        }

        /* renamed from: s */
        public final boolean m87178s(String str) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            String m153552r = C31944h6.m153552r(str);
            if (m153552r != null && m153552r.length() != 0 && m87155i(m153552r)) {
                return true;
            }
            return false;
        }

        /* renamed from: u */
        public final Bundle m87179u(String str) {
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_WEB_URL", str);
            return bundle;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZaloWebView$b */
    /* loaded from: classes6.dex */
    public static final class HandlerC15404b extends Handler {
        HandlerC15404b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC19074t.m100208f(message, "msg");
            try {
                int i11 = message.what;
                if (i11 == 1) {
                    ZaloWebView.this.m87082DR(true);
                } else if (i11 == 2) {
                    ZaloWebView.this.m87082DR(false);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZaloWebView$c */
    /* loaded from: classes6.dex */
    public static final class C15405c extends AnimatorListenerAdapter {

        /* renamed from: q */
        final /* synthetic */ int f79704q;

        C15405c(int i11) {
            this.f79704q = i11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            View view = ZaloWebView.this.f79690b2;
            if (view != null || (view = ZaloWebView.this.f88760a0) != null) {
                view.setBackgroundColor(this.f79704q);
            }
            ZaloWebView.this.m87094YR(this.f79704q);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZaloWebView$d */
    /* loaded from: classes6.dex */
    public static final class C15406d extends AnimatorListenerAdapter {

        /* renamed from: q */
        final /* synthetic */ AbstractC19147a f79706q;

        C15406d(AbstractC19147a abstractC19147a) {
            this.f79706q = abstractC19147a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            ZaloWebView.this.m87092WR(this.f79706q);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZaloWebView$e */
    /* loaded from: classes6.dex */
    public static final class C15407e extends AnimatorListenerAdapter {

        /* renamed from: q */
        final /* synthetic */ ActionBarMenu f79708q;

        C15407e(ActionBarMenu actionBarMenu) {
            this.f79708q = actionBarMenu;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            ZaloWebView.this.m87093XR(this.f79708q);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZaloWebView$f */
    /* loaded from: classes6.dex */
    public static final class C15408f implements C28005e.d {
        C15408f() {
        }

        @Override // vf0.C28005e.d
        /* renamed from: a */
        public void mo87186a(int i11) {
            ActionBarMenuItem actionBarMenuItem = ZaloWebView.this.f79687Y1;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.m92776l();
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        ZaloWebView.this.m86777hQ();
                        return;
                    }
                    return;
                }
                ZaloWebView.this.m86804uP();
                return;
            }
            ZaloWebView.this.m86799ra();
        }
    }

    /* renamed from: CR */
    private final void m87081CR(boolean z11) {
        if (z11) {
            m86741TN();
            return;
        }
        AbstractC19147a m86760bO = m86760bO();
        if (m86760bO != null) {
            if (m86760bO.m100474f() == 1) {
                C8009j c8009j = this.f79684V1;
                if (c8009j != null && !c8009j.m92868m()) {
                    c8009j.mo13822K();
                    return;
                }
            } else if (m86760bO.m100474f() == 2) {
                m86775gR();
                return;
            }
        }
        m86741TN();
    }

    /* renamed from: DR */
    public final void m87082DR(boolean z11) {
        MiniMenuFloatingView miniMenuFloatingView;
        MiniMenuFloatingView miniMenuFloatingView2;
        MiniMenuFloatingView miniMenuFloatingView3 = this.f79689a2;
        if (miniMenuFloatingView3 != null) {
            if (z11) {
                if (miniMenuFloatingView3 != null && miniMenuFloatingView3.getVisibility() == 0 && (miniMenuFloatingView2 = this.f79689a2) != null) {
                    miniMenuFloatingView2.setVisibility(4);
                    return;
                }
                return;
            }
            if ((miniMenuFloatingView3 == null || miniMenuFloatingView3.getVisibility() != 0) && (miniMenuFloatingView = this.f79689a2) != null) {
                miniMenuFloatingView.setVisibility(0);
            }
        }
    }

    /* renamed from: ER */
    public static final void m87083ER(ZaloWebView zaloWebView) {
        AbstractC19074t.m100208f(zaloWebView, "this$0");
        try {
            if (C23055e5.m118273h(false, 1, null) && C29628e.m147249E0().m93432x()) {
                if (zaloWebView.m86719CO() != null && (zaloWebView.m86719CO() instanceof ZaloSystemWebView)) {
                    View m86719CO = zaloWebView.m86719CO();
                    AbstractC19074t.m100206d(m86719CO, "null cannot be cast to non-null type com.zing.zalo.libwebview.browser.ui.ZaloSystemWebView");
                    ((ZaloSystemWebView) m86719CO).getSettings().setCacheMode(-1);
                }
            }
            if (zaloWebView.m86719CO() != null && (zaloWebView.m86719CO() instanceof ZaloSystemWebView)) {
                View m86719CO2 = zaloWebView.m86719CO();
                AbstractC19074t.m100206d(m86719CO2, "null cannot be cast to non-null type com.zing.zalo.libwebview.browser.ui.ZaloSystemWebView");
                ((ZaloSystemWebView) m86719CO2).getSettings().setCacheMode(1);
            }
        } catch (Exception e11) {
            AbstractC0900b0.m2788d("ZaloWebView", e11);
        }
    }

    /* renamed from: FR */
    public static final Uri m87084FR(Uri uri) {
        return Companion.m87175n(uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00af A[Catch: Exception -> 0x0022, TRY_LEAVE, TryCatch #1 {Exception -> 0x0022, blocks: (B:2:0x0000, B:4:0x0007, B:6:0x000d, B:8:0x0011, B:10:0x0019, B:11:0x0025, B:14:0x002c, B:16:0x0032, B:17:0x003c, B:20:0x0044, B:22:0x004a, B:23:0x005b, B:25:0x0055, B:28:0x0060, B:37:0x00aa, B:39:0x00af, B:44:0x00a0, B:46:0x00a6, B:47:0x0092, B:49:0x0099, B:50:0x0079, B:57:0x0085, B:58:0x006b, B:60:0x0072, B:54:0x0080), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* renamed from: GR */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m87085GR(boolean z11) {
        String str;
        String m118743r0;
        String m100475g;
        CharSequence m127168X0;
        String m100475g2;
        CharSequence m127168X02;
        try {
            AbstractC19147a m86760bO = m86760bO();
            if (m86760bO != null && m86760bO.m100474f() == 1 && this.f79684V1 == null) {
                C8009j m87090SR = m87090SR();
                this.f79684V1 = m87090SR;
                if (m87090SR != null) {
                    m87090SR.m92855F(new InterfaceC17463d.e() { // from class: com.zing.zalo.ui.zviews.p71
                        public /* synthetic */ p71() {
                        }

                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
                        /* renamed from: Tv */
                        public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                            ZaloWebView.m87086HR(ZaloWebView.this, interfaceC17463d);
                        }
                    });
                }
            }
            C8009j c8009j = this.f79684V1;
            Integer num = null;
            if (c8009j != null) {
                if (m86760bO != null && (m100475g2 = m86760bO.m100475g()) != null) {
                    m127168X02 = AbstractC24342w.m127168X0(m100475g2);
                    str = m127168X02.toString();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    if (m86760bO != null && (m100475g = m86760bO.m100475g()) != null) {
                        m127168X0 = AbstractC24342w.m127168X0(m100475g);
                        m118743r0 = m127168X0.toString();
                    } else {
                        m118743r0 = null;
                    }
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_exit_confirm_webview);
                }
                c8009j.m43149L(m118743r0);
            }
            if (m86760bO != null) {
                num = Integer.valueOf(m86760bO.m100477i());
            }
            if (num != null && num.intValue() == 4) {
                m87135MR();
                if (z11) {
                    invalidateOptionsMenu();
                    return;
                }
                return;
            }
            if (num.intValue() == 3) {
                try {
                    m87134KR();
                } catch (Exception e11) {
                    e11.printStackTrace();
                    m87138PR();
                    m87140UR();
                }
                if (z11) {
                }
            }
            if (num != null && num.intValue() == 2) {
                m87136NR();
                if (z11) {
                }
            }
            if (num.intValue() == 1) {
                m87137OR();
                if (z11) {
                }
            }
            m87138PR();
            if (z11) {
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: HR */
    public static final void m87086HR(ZaloWebView zaloWebView, InterfaceC17463d interfaceC17463d) {
        AbstractC19074t.m100208f(zaloWebView, "this$0");
        zaloWebView.f79685W1.set(false);
    }

    /* renamed from: IR */
    private final void m87087IR() {
        Integer num;
        Integer num2;
        if (this.f88760a0 == null) {
            return;
        }
        try {
            AbstractC19147a m86760bO = m86760bO();
            C24848g0 c24848g0 = null;
            if (m86760bO != null) {
                num2 = m86760bO.m100473e();
                num = m86760bO.m100476h();
            } else {
                num = null;
                num2 = null;
            }
            if (num2 != null) {
                if (num2.intValue() == this.f79682T1) {
                    return;
                }
                this.f79682T1 = num2.intValue();
                if (!AbstractC19074t.m100204b(num2, num)) {
                    m87109kS(num2.intValue(), 200);
                    return;
                }
                MinimizableActionBar minimizableActionBar = this.f79690b2;
                if (minimizableActionBar != null) {
                    minimizableActionBar.setBackgroundColor(num2.intValue());
                    c24848g0 = C24848g0.f119245a;
                }
                if (c24848g0 == null) {
                    this.f88760a0.setBackgroundColor(num2.intValue());
                }
                m87094YR(num2.intValue());
                return;
            }
            m87141VR();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: LR */
    public static final void m87088LR(ZaloWebView zaloWebView, View view) {
        AbstractC19074t.m100208f(zaloWebView, "this$0");
        zaloWebView.m87081CR(false);
    }

    /* renamed from: QR */
    public static final Bundle m87089QR(String str) {
        return Companion.m87179u(str);
    }

    /* renamed from: SR */
    private final synchronized C8009j m87090SR() {
        C8009j m43152a;
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43159h(3).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_exit_confirm_webview)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.a()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.f71
            public /* synthetic */ f71() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ZaloWebView.m87091TR(ZaloWebView.this, interfaceC17463d, i11);
            }
        });
        m43152a = aVar.m43152a();
        AbstractC19074t.m100207e(m43152a, "create(...)");
        return m43152a;
    }

    /* renamed from: TR */
    public static final void m87091TR(ZaloWebView zaloWebView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(zaloWebView, "this$0");
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        zaloWebView.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x009c  */
    /* renamed from: WR */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m87092WR(AbstractC19147a abstractC19147a) {
        boolean z11;
        ImageView imageView;
        ImageView imageView2;
        int i11;
        int i12;
        RecyclingImageView recyclingImageView;
        C19159m c19159m;
        int i13;
        int i14;
        int i15;
        if (this.f88760a0 == null) {
            return;
        }
        boolean canGoBack = canGoBack();
        if (abstractC19147a instanceof InterfaceC19148b) {
            this.f79692d2 = ((InterfaceC19148b) abstractC19147a).mo100491b();
        }
        int i16 = this.f79692d2;
        int i17 = 0;
        if (i16 != 0) {
            if (i16 == 1) {
                canGoBack = true;
                z11 = false;
                View m92715j = this.f88760a0.m92715j(AbstractC6918a0.web_view_action_bar_close_btn);
                AbstractC19074t.m100206d(m92715j, "null cannot be cast to non-null type android.widget.ImageView");
                imageView = (ImageView) m92715j;
                View m92715j2 = this.f88760a0.m92715j(AbstractC17468f.home);
                AbstractC19074t.m100206d(m92715j2, "null cannot be cast to non-null type android.widget.ImageView");
                imageView2 = (ImageView) m92715j2;
                if (!z11) {
                    if (m86766dP()) {
                        if (!m86761bP() && (m86745VO() || !AbstractC19074t.m100204b(m86768eO(), C18613b.f93598q) || C23212s8.m119601h() != 0)) {
                            i15 = AbstractC16803z.icn_browser_back_white_mini;
                        } else {
                            i15 = AbstractC16803z.icn_browser_back_black_mini;
                        }
                        imageView2.setImageResource(i15);
                    } else {
                        if (!m86761bP() && (m86745VO() || !AbstractC19074t.m100204b(m86768eO(), C18613b.f93598q) || C23212s8.m119601h() != 0)) {
                            i14 = AbstractC16803z.stencils_ic_head_back_white;
                        } else {
                            i14 = AbstractC16803z.stencils_ic_head_back_black;
                        }
                        imageView2.setImageResource(i14);
                    }
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                if (imageView2.getVisibility() != i11) {
                    imageView2.setVisibility(i11);
                }
                if (!canGoBack) {
                    if (!m86761bP() && (m86745VO() || !AbstractC19074t.m100204b(m86768eO(), C18613b.f93598q) || C23212s8.m119601h() != 0)) {
                        i13 = AbstractC16803z.icn_close_white;
                    } else {
                        i13 = AbstractC16803z.icn_close_black;
                    }
                    imageView.setImageResource(i13);
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                if (this.f79692d2 == 2) {
                    if (canGoBack()) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                }
                if (imageView.getVisibility() != i12) {
                    imageView.setVisibility(i12);
                }
                View m92715j3 = this.f88760a0.m92715j(AbstractC6918a0.id_btn_home_web);
                AbstractC19074t.m100206d(m92715j3, "null cannot be cast to non-null type com.androidquery.util.RecyclingImageView");
                recyclingImageView = (RecyclingImageView) m92715j3;
                if (!(abstractC19147a instanceof C19156j)) {
                    c19159m = ((C19156j) abstractC19147a).m100498t();
                } else {
                    c19159m = null;
                }
                if (c19159m == null && c19159m.m100502a() == 1) {
                    int i18 = AbstractC16803z.icn_header_home_light;
                    if (m86761bP() || (!m86745VO() && AbstractC19074t.m100204b(m86768eO(), C18613b.f93598q) && C23212s8.m119601h() == 0)) {
                        i18 = AbstractC16803z.icn_header_home_dark;
                    }
                    C23528a c23528a = (C23528a) new C23528a(getContext()).m123612r(recyclingImageView);
                    String m100503b = c19159m.m100503b();
                    C23278z2 c23278z2 = C23278z2.f112845a;
                    Context m92689tK = m92689tK();
                    AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                    c23528a.m123618x(m100503b, c23278z2.m120168g(m92689tK, i18));
                } else {
                    i17 = 8;
                }
                if (recyclingImageView.getVisibility() == i17) {
                    recyclingImageView.setVisibility(i17);
                    return;
                }
                return;
            }
        } else {
            canGoBack = false;
        }
        z11 = true;
        View m92715j4 = this.f88760a0.m92715j(AbstractC6918a0.web_view_action_bar_close_btn);
        AbstractC19074t.m100206d(m92715j4, "null cannot be cast to non-null type android.widget.ImageView");
        imageView = (ImageView) m92715j4;
        View m92715j22 = this.f88760a0.m92715j(AbstractC17468f.home);
        AbstractC19074t.m100206d(m92715j22, "null cannot be cast to non-null type android.widget.ImageView");
        imageView2 = (ImageView) m92715j22;
        if (!z11) {
        }
        if (imageView2.getVisibility() != i11) {
        }
        if (!canGoBack) {
        }
        if (this.f79692d2 == 2) {
        }
        if (imageView.getVisibility() != i12) {
        }
        View m92715j32 = this.f88760a0.m92715j(AbstractC6918a0.id_btn_home_web);
        AbstractC19074t.m100206d(m92715j32, "null cannot be cast to non-null type com.androidquery.util.RecyclingImageView");
        recyclingImageView = (RecyclingImageView) m92715j32;
        if (!(abstractC19147a instanceof C19156j)) {
        }
        if (c19159m == null) {
        }
        i17 = 8;
        if (recyclingImageView.getVisibility() == i17) {
        }
    }

    /* renamed from: XR */
    public final void m87093XR(ActionBarMenu actionBarMenu) {
        ActionBarMenuItem m92738e;
        AtomicBoolean m141141i;
        C16794l m141144l;
        C28005e c28005e = this.f79683U1;
        if (c28005e != null && (m141141i = c28005e.m141141i()) != null && !m141141i.get()) {
            if (AbstractC19074t.m100204b(m86768eO(), C18613b.f93600s)) {
                if (!m86766dP()) {
                    if (m86745VO() && !m86757aP()) {
                        if (!m86757aP()) {
                            this.f79687Y1 = actionBarMenu.m92738e(2, AbstractC16803z.icn_header_settings_dark);
                            return;
                        }
                        return;
                    }
                    this.f79687Y1 = actionBarMenu.m92738e(2, AbstractC16803z.icn_header_settings);
                    return;
                }
                return;
            }
            if (AbstractC19074t.m100204b(m86768eO(), C18613b.f93601t)) {
                if (!m86766dP()) {
                    C28005e c28005e2 = this.f79683U1;
                    if (c28005e2 != null && (m141144l = c28005e2.m141144l()) != null) {
                        if (m141144l.f85226c) {
                            int i11 = m141144l.f85225b;
                            if (i11 != 1) {
                                if (i11 == 2) {
                                    View m92744k = actionBarMenu.m92744k(ZAbstractBase.ZVU_BLEND_PERCENTAGE, AbstractC7409c0.action_bar_menu_item_add);
                                    AbstractC19074t.m100206d(m92744k, "null cannot be cast to non-null type android.widget.Button");
                                    Button button = (Button) m92744k;
                                    button.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_item_web_share));
                                    if (m86745VO() && !m86757aP()) {
                                        if (!m86757aP()) {
                                            button.setTextColor(AbstractC23136l9.m118641B(m92689tK(), AbstractC16801x.Light_TextColor1));
                                            return;
                                        }
                                        return;
                                    }
                                    button.setTextColor(AbstractC23136l9.m118641B(m92689tK(), AbstractC16801x.Dark_TextColor1));
                                    return;
                                }
                                return;
                            }
                            if (m86745VO() && !m86757aP()) {
                                if (!m86757aP()) {
                                    ActionBarMenuItem m92738e2 = actionBarMenu.m92738e(1001, AbstractC16803z.icn_header_settings_dark);
                                    this.f79687Y1 = m92738e2;
                                    if (m92738e2 != null) {
                                        m92738e2.setId(AbstractC6918a0.btn_sticker_store_setting);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            ActionBarMenuItem m92738e3 = actionBarMenu.m92738e(1001, AbstractC16803z.icn_header_settings);
                            this.f79687Y1 = m92738e3;
                            if (m92738e3 != null) {
                                m92738e3.setId(AbstractC6918a0.btn_sticker_store_setting);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    Bundle m92642L3 = m92642L3();
                    if (m92642L3 != null && m92642L3.containsKey(StickerManageView.f77866g1) && m92642L3.getBoolean(StickerManageView.f77866g1)) {
                        return;
                    }
                    if (m86745VO() && !m86757aP()) {
                        if (!m86757aP()) {
                            this.f79687Y1 = actionBarMenu.m92738e(1, AbstractC16803z.icn_header_settings_dark);
                            return;
                        }
                        return;
                    }
                    this.f79687Y1 = actionBarMenu.m92738e(1, AbstractC16803z.icn_header_settings);
                    return;
                }
                return;
            }
        }
        if (!m86761bP() && (m86745VO() || !AbstractC19074t.m100204b(m86768eO(), C18613b.f93598q) || C23212s8.m119601h() != 0)) {
            if (m86766dP()) {
                m92738e = actionBarMenu.m92738e(3, AbstractC16803z.ic_browser_menu_more_light);
            } else if (AbstractC19074t.m100204b(m86768eO(), C18613b.f93598q)) {
                m92738e = actionBarMenu.m92738e(3, AbstractC16803z.icn_header_menu_more_white);
            } else {
                m92738e = actionBarMenu.m92738e(3, AbstractC16803z.icn_header_menu_white);
            }
        } else if (m86766dP()) {
            m92738e = actionBarMenu.m92738e(3, AbstractC16803z.ic_browser_menu_more_dark);
        } else if (AbstractC19074t.m100204b(m86768eO(), C18613b.f93598q)) {
            m92738e = actionBarMenu.m92738e(3, AbstractC16803z.icn_header_menu_more_black);
        } else {
            m92738e = actionBarMenu.m92738e(3, AbstractC16803z.ic_icn_header_menu_white);
        }
        this.f79687Y1 = m92738e;
        if (m92738e != null) {
            m92738e.setPadding(AbstractC23136l9.m118742r(5.0f), m92738e.getPaddingTop(), AbstractC23136l9.m118742r(5.0f), m92738e.getPaddingBottom());
            ViewGroup.LayoutParams layoutParams = m92738e.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = AbstractC23136l9.m118742r(36.0f);
            layoutParams2.rightMargin = AbstractC23136l9.m118742r(4.0f);
            m92738e.setLayoutParams(layoutParams2);
            C28005e c28005e3 = this.f79683U1;
            if (c28005e3 != null) {
                c28005e3.m141145s(m92738e);
            }
        }
    }

    /* renamed from: YR */
    public final void m87094YR(int i11) {
        if (this.f88760a0 == null) {
            return;
        }
        if (AbstractC21954k.Companion.m114624s(Integer.valueOf(i11))) {
            TextView titleTextView = this.f88760a0.getTitleTextView();
            if (titleTextView != null) {
                titleTextView.setTextColor(AbstractC23136l9.m118641B(m92689tK(), AbstractC16801x.Dark_TextColor1));
            }
            TextView subtitleTextView = this.f88760a0.getSubtitleTextView();
            if (subtitleTextView != null) {
                subtitleTextView.setTextColor(AbstractC23136l9.m118641B(m92689tK(), AbstractC16801x.Dark_TextColor2));
                return;
            }
            return;
        }
        TextView titleTextView2 = this.f88760a0.getTitleTextView();
        if (titleTextView2 != null) {
            titleTextView2.setTextColor(AbstractC23136l9.m118641B(m92689tK(), AbstractC16801x.Light_TextColor1));
        }
        TextView subtitleTextView2 = this.f88760a0.getSubtitleTextView();
        if (subtitleTextView2 != null) {
            subtitleTextView2.setTextColor(AbstractC23136l9.m118641B(m92689tK(), AbstractC16801x.Light_TextColor2));
        }
    }

    /* renamed from: aS */
    private final void m87095aS() {
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setBackButtonImage(0);
                MinimizableActionBar minimizableActionBar = this.f79690b2;
                if (minimizableActionBar != null) {
                    minimizableActionBar.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                    minimizableActionBar.getActionBar().setBackButtonImage(0);
                } else {
                    this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                }
                LinearLayout linearLayout = new LinearLayout(m92648SI());
                linearLayout.setOrientation(0);
                linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                Context m92689tK = m92689tK();
                AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                int m118742r = AbstractC23136l9.m118742r(5.0f);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC23136l9.m118742r(36.0f), -1);
                layoutParams.gravity = 8388627;
                View inflate = LayoutInflater.from(m92689tK).inflate(AbstractC7409c0.action_menu_item_layout, (ViewGroup) null);
                AbstractC19074t.m100206d(inflate, "null cannot be cast to non-null type android.widget.ImageView");
                ImageView imageView = (ImageView) inflate;
                imageView.setId(AbstractC17468f.home);
                ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
                imageView.setScaleType(scaleType);
                imageView.setPadding(m118742r, imageView.getPaddingTop(), m118742r, imageView.getPaddingBottom());
                linearLayout.addView(imageView, layoutParams);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.i71
                    public /* synthetic */ i71() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ZaloWebView.m87096bS(ZaloWebView.this, view);
                    }
                });
                View inflate2 = LayoutInflater.from(m92689tK).inflate(AbstractC7409c0.action_menu_item_layout, (ViewGroup) null);
                AbstractC19074t.m100206d(inflate2, "null cannot be cast to non-null type android.widget.ImageView");
                ImageView imageView2 = (ImageView) inflate2;
                imageView2.setScaleType(scaleType);
                imageView2.setId(AbstractC6918a0.web_view_action_bar_close_btn);
                imageView2.setPadding(m118742r, imageView2.getPaddingTop(), m118742r, imageView2.getPaddingBottom());
                linearLayout.addView(imageView2, layoutParams);
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.j71
                    public /* synthetic */ j71() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ZaloWebView.m87097cS(ZaloWebView.this, view);
                    }
                });
                View inflate3 = LayoutInflater.from(m92689tK).inflate(AbstractC7409c0.action_menu_item_layout, (ViewGroup) null);
                AbstractC19074t.m100206d(inflate3, "null cannot be cast to non-null type android.widget.ImageView");
                ImageView imageView3 = (ImageView) inflate3;
                imageView3.setScaleType(scaleType);
                imageView3.setId(AbstractC6918a0.id_btn_home_web);
                imageView3.setPadding(m118742r, imageView3.getPaddingTop(), m118742r, imageView3.getPaddingBottom());
                linearLayout.addView(imageView3, layoutParams);
                imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.k71
                    public /* synthetic */ k71() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ZaloWebView.m87098dS(ZaloWebView.this, view);
                    }
                });
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
                layoutParams2.setMarginStart(AbstractC23136l9.m118742r(9.0f));
                this.f88760a0.m92707b(linearLayout, layoutParams2);
                m87133JR();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: bS */
    public static final void m87096bS(ZaloWebView zaloWebView, View view) {
        AbstractC19074t.m100208f(zaloWebView, "this$0");
        if (zaloWebView.canGoBack()) {
            zaloWebView.m86799ra();
        } else if (zaloWebView.f79685W1.get()) {
            zaloWebView.m87081CR(true);
        } else {
            zaloWebView.f79685W1.set(true);
            zaloWebView.m87081CR(false);
        }
    }

    /* renamed from: cS */
    public static final void m87097cS(ZaloWebView zaloWebView, View view) {
        AbstractC19074t.m100208f(zaloWebView, "this$0");
        if (zaloWebView.f79685W1.get()) {
            zaloWebView.m87081CR(true);
        } else {
            zaloWebView.f79685W1.set(true);
            zaloWebView.m87081CR(false);
        }
    }

    /* renamed from: dS */
    public static final void m87098dS(ZaloWebView zaloWebView, View view) {
        AbstractC19074t.m100208f(zaloWebView, "this$0");
        zaloWebView.m86774gQ();
    }

    /* renamed from: eS */
    public static final void m87099eS(C21691a c21691a, C16719g c16719g) {
        AbstractC19074t.m100208f(c21691a, "$allowRetainCheckbox");
        c21691a.mo89091D0(!c21691a.m89141i0());
    }

    /* renamed from: fS */
    public static final void m87100fS(GeolocationPermissions.Callback callback, String str, C21691a c21691a, ZaloWebView zaloWebView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(c21691a, "$allowRetainCheckbox");
        AbstractC19074t.m100208f(zaloWebView, "this$0");
        callback.invoke(str, true, c21691a.m89141i0());
        zaloWebView.m86805uQ(null);
        zaloWebView.m86803tQ(null);
    }

    /* renamed from: gS */
    public static final void m87101gS(GeolocationPermissions.Callback callback, String str, C21691a c21691a, ZaloWebView zaloWebView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(c21691a, "$allowRetainCheckbox");
        AbstractC19074t.m100208f(zaloWebView, "this$0");
        callback.invoke(str, false, c21691a.m89141i0());
        zaloWebView.m86805uQ(null);
        zaloWebView.m86803tQ(null);
    }

    /* renamed from: hS */
    public static final void m87103hS(InterfaceC27218a interfaceC27218a, String str) {
        Companion.m87168C(interfaceC27218a, str);
    }

    /* renamed from: iS */
    public static final void m87105iS(InterfaceC27218a interfaceC27218a, String str, Bundle bundle) {
        Companion.m87171F(interfaceC27218a, str, bundle);
    }

    /* renamed from: jS */
    public static final void m87107jS(InterfaceC27218a interfaceC27218a, String str, Bundle bundle, int i11) {
        Companion.m87172G(interfaceC27218a, str, bundle, i11);
    }

    /* renamed from: kS */
    private final void m87109kS(int i11, int i12) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.f79694f2;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.f79694f2) != null) {
            valueAnimator.cancel();
        }
        if (this.f79694f2 == null) {
            this.f79694f2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        }
        ValueAnimator valueAnimator3 = this.f79694f2;
        if (valueAnimator3 != null) {
            valueAnimator3.setDuration(i12);
        }
        ValueAnimator valueAnimator4 = this.f79694f2;
        if (valueAnimator4 != null) {
            valueAnimator4.setRepeatMode(2);
        }
        ValueAnimator valueAnimator5 = this.f79694f2;
        if (valueAnimator5 != null) {
            valueAnimator5.setRepeatCount(1);
        }
        ValueAnimator valueAnimator6 = this.f79694f2;
        if (valueAnimator6 != null) {
            valueAnimator6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.zviews.g71
                public /* synthetic */ g71() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator7) {
                    ZaloWebView.m87111lS(ZaloWebView.this, valueAnimator7);
                }
            });
        }
        ValueAnimator valueAnimator7 = this.f79694f2;
        if (valueAnimator7 != null) {
            valueAnimator7.addListener(new C15405c(i11));
        }
        ValueAnimator valueAnimator8 = this.f79694f2;
        if (valueAnimator8 != null) {
            valueAnimator8.start();
        }
    }

    /* renamed from: lS */
    public static final void m87111lS(ZaloWebView zaloWebView, ValueAnimator valueAnimator) {
        Drawable drawable;
        AbstractC19074t.m100208f(zaloWebView, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        if (zaloWebView.f88760a0 != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            MinimizableActionBar minimizableActionBar = zaloWebView.f79690b2;
            Drawable drawable2 = null;
            if (minimizableActionBar != null) {
                drawable = minimizableActionBar.getBackground();
            } else {
                drawable = null;
            }
            if (drawable != null) {
                MinimizableActionBar minimizableActionBar2 = zaloWebView.f79690b2;
                if (minimizableActionBar2 != null) {
                    drawable2 = minimizableActionBar2.getBackground();
                }
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (255 * floatValue));
                }
            } else {
                zaloWebView.f88760a0.getBackground().setAlpha((int) (255 * floatValue));
            }
            TextView titleTextView = zaloWebView.f88760a0.getTitleTextView();
            if (titleTextView != null) {
                titleTextView.setAlpha(floatValue);
            }
            TextView subtitleTextView = zaloWebView.f88760a0.getSubtitleTextView();
            if (subtitleTextView != null) {
                subtitleTextView.setAlpha(floatValue);
            }
        }
    }

    /* renamed from: mS */
    private final void m87113mS(AbstractC19147a abstractC19147a, int i11) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(i11);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(1);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.zviews.o71
            public /* synthetic */ o71() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ZaloWebView.m87115nS(ZaloWebView.this, valueAnimator);
            }
        });
        ofFloat.addListener(new C15406d(abstractC19147a));
        ofFloat.start();
    }

    /* renamed from: nS */
    public static final void m87115nS(ZaloWebView zaloWebView, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(zaloWebView, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        if (zaloWebView.f88760a0 != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            View m92715j = zaloWebView.f88760a0.m92715j(AbstractC6918a0.web_view_action_bar_close_btn);
            AbstractC19074t.m100206d(m92715j, "null cannot be cast to non-null type android.widget.ImageView");
            View m92715j2 = zaloWebView.f88760a0.m92715j(AbstractC17468f.home);
            AbstractC19074t.m100206d(m92715j2, "null cannot be cast to non-null type android.widget.ImageView");
            ((ImageView) m92715j2).setAlpha(floatValue);
            ((ImageView) m92715j).setAlpha(floatValue);
        }
    }

    /* renamed from: oS */
    private final void m87117oS(ActionBarMenu actionBarMenu, int i11) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(i11);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(1);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.zviews.h71
            public /* synthetic */ h71() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ZaloWebView.m87119pS(ZaloWebView.this, valueAnimator);
            }
        });
        ofFloat.addListener(new C15407e(actionBarMenu));
        ofFloat.start();
    }

    /* renamed from: pS */
    public static final void m87119pS(ZaloWebView zaloWebView, ValueAnimator valueAnimator) {
        ActionBarMenuItem actionBarMenuItem;
        AbstractC19074t.m100208f(zaloWebView, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        ActionBarMenuItem actionBarMenuItem2 = zaloWebView.f79687Y1;
        if (actionBarMenuItem2 != null && actionBarMenuItem2.getVisibility() == 0 && (actionBarMenuItem = zaloWebView.f79687Y1) != null) {
            actionBarMenuItem.setAlpha(floatValue);
        }
    }

    /* renamed from: qS */
    private final void m87121qS(String str) {
        CharSequence charSequence;
        if (m86776hP()) {
            try {
                URL url = new URL(str);
                ActionBar actionBar = this.f88760a0;
                if (actionBar != null && actionBar.getSubtitleTextView() != null) {
                    TextView subtitleTextView = this.f88760a0.getSubtitleTextView();
                    if (subtitleTextView != null) {
                        charSequence = subtitleTextView.getText();
                    } else {
                        charSequence = null;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        TextView subtitleTextView2 = this.f88760a0.getSubtitleTextView();
                        if (subtitleTextView2 != null) {
                            subtitleTextView2.setCompoundDrawablePadding(AbstractC26903a.m138660a(4));
                        }
                        int m89711b = C16793k.m89710a().m89711b(url);
                        TextView subtitleTextView3 = this.f88760a0.getSubtitleTextView();
                        if (subtitleTextView3 != null) {
                            subtitleTextView3.setCompoundDrawablesWithIntrinsicBounds(m89711b, 0, 0, 0);
                        }
                    }
                }
            } catch (MalformedURLException e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: rS */
    private final boolean m87123rS(String str) {
        String str2;
        String str3;
        if (this.f88760a0 == null) {
            return false;
        }
        if (str != null && m86776hP()) {
            try {
                str2 = new URL(str).getHost();
                AbstractC19074t.m100207e(str2, "getHost(...)");
            } catch (MalformedURLException e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                str2 = "";
            }
            if (!TextUtils.isEmpty(str2)) {
                ActionBar actionBar = this.f88760a0;
                if (actionBar != null) {
                    str3 = actionBar.getSubTitle();
                } else {
                    str3 = null;
                }
                if (AbstractC19074t.m100204b(str2, str3)) {
                    return false;
                }
                this.f88760a0.setSubtitle(str2);
                m87121qS(m86721DO());
                TextView subtitleTextView = this.f88760a0.getSubtitleTextView();
                if (subtitleTextView != null) {
                    subtitleTextView.setVisibility(0);
                }
                return true;
            }
            mo86818zP();
            return false;
        }
        mo86818zP();
        return true;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: BJ */
    public boolean mo87132BJ(MenuItem menuItem) {
        Bundle bundle;
        AbstractC19074t.m100208f(menuItem, "item");
        try {
            Intent intent = menuItem.getIntent();
            if (intent != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            if (bundle != null) {
                switch (menuItem.getItemId()) {
                    case 11:
                    case 12:
                        String string = bundle.getString("EXTRA_ID_URL");
                        if (string == null) {
                            return true;
                        }
                        m86808vP(string);
                        return true;
                    case 13:
                        WebBaseView.m86628PN(this, bundle.getString("EXTRA_ID_URL"), null, null, null, null, 30, null);
                        return true;
                    case 14:
                        AbstractC16795m.m89712a(m92648SI(), bundle.getString("EXTRA_ID_URL"), AbstractC23136l9.m118743r0(AbstractC8020f0.browser_url_copy_toast_message));
                        return true;
                    case 15:
                    default:
                        return super.mo87132BJ(menuItem);
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                        if (!bundle.getBoolean("EXTRA_SHARE_URL_IMAGE")) {
                            AbstractC23152n3.m119015P0(this.f72421L0.m92676n2(), bundle.getString("EXTRA_ID_URL"), "", true, true, "webview_menu");
                            return true;
                        }
                        m86737QN(bundle.getString("EXTRA_ID_URL"));
                        return true;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return super.mo87132BJ(menuItem);
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView, com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f79681S1 = !AbstractC19074t.m100204b(m86768eO(), C18613b.f93598q);
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: DQ */
    public void mo81366DQ(String str, GeolocationPermissions.Callback callback) {
        C8009j m86769fO;
        if (!TextUtils.isEmpty(str) && callback != null) {
            Context context = getContext();
            C19067n0 c19067n0 = C19067n0.f94947a;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_webview_geolocation_permission);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{str}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            C21697g c21697g = new C21697g(context);
            c21697g.m111959G1(AbstractC1463b.m7440a(format, 0));
            c21697g.mo111964L1(AbstractC23136l9.m118759w1(16));
            c21697g.m111962J1(C23212s8.m119606n(AbstractC21196a.TextColor1));
            C16716d c16716d = new C16716d(getContext());
            C16718f m89023G = c16716d.m89106L().m89042Z(30, 20, 10, 10).m89023G(c21697g);
            Boolean bool = Boolean.TRUE;
            m89023G.m89073z(bool);
            C21691a c21691a = new C21691a(context);
            c21691a.m89106L().m89073z(bool);
            c21691a.m111906k1(AbstractC23136l9.m118665N(context, AbstractC16803z.checkbox_share_hd_photo));
            c21691a.m111905j1(AbstractC23136l9.m118665N(context, AbstractC16803z.checkbox_share_hd_photo));
            C21697g c21697g2 = new C21697g(context);
            c21697g2.m111958F1(AbstractC8020f0.str_webview_geolocation_permission_allow_retain);
            c21697g2.mo111964L1(AbstractC23136l9.m118759w1(15));
            c21697g2.m111962J1(C23212s8.m119606n(AbstractC21196a.TextColor2));
            c21697g2.m89106L().m89054h0(c21691a).m89042Z(10, 0, 0, 0);
            c21697g2.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.zviews.l71
                public /* synthetic */ l71() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    ZaloWebView.m87099eS(C21691a.this, c16719g);
                }
            });
            ModulesView modulesView = new ModulesView(context);
            modulesView.setPadding(30, 20, 30, 0);
            modulesView.mo69681L(c21697g);
            c16716d.m89001g1(c21691a);
            c16716d.m89001g1(c21697g2);
            modulesView.mo69681L(c16716d);
            m86798rQ(new C8009j.a(context).m43169r(AbstractC8020f0.f43842ok, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.m71

                /* renamed from: p */
                public final /* synthetic */ GeolocationPermissions.Callback f81106p;

                /* renamed from: q */
                public final /* synthetic */ String f81107q;

                /* renamed from: r */
                public final /* synthetic */ C21691a f81108r;

                /* renamed from: s */
                public final /* synthetic */ ZaloWebView f81109s;

                public /* synthetic */ m71(GeolocationPermissions.Callback callback2, String str2, C21691a c21691a2, ZaloWebView this) {
                    r1 = callback2;
                    r2 = str2;
                    r3 = c21691a2;
                    r4 = this;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ZaloWebView.m87100fS(r1, r2, r3, r4, interfaceC17463d, i11);
                }
            }).m43164m(AbstractC8020f0.str_webview_geolocation_permission_deny, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.n71

                /* renamed from: p */
                public final /* synthetic */ GeolocationPermissions.Callback f81323p;

                /* renamed from: q */
                public final /* synthetic */ String f81324q;

                /* renamed from: r */
                public final /* synthetic */ C21691a f81325r;

                /* renamed from: s */
                public final /* synthetic */ ZaloWebView f81326s;

                public /* synthetic */ n71(GeolocationPermissions.Callback callback2, String str2, C21691a c21691a2, ZaloWebView this) {
                    r1 = callback2;
                    r2 = str2;
                    r3 = c21691a2;
                    r4 = this;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ZaloWebView.m87101gS(r1, r2, r3, r4, interfaceC17463d, i11);
                }
            }).m43177z(modulesView).m43155d(false).m43152a());
            if (m92674mJ() && !m92681pJ() && (m86769fO = m86769fO()) != null) {
                m86769fO.mo13822K();
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        AbstractC19074t.m100208f(actionBarMenu, "menu");
        if (!m86815yN() && m92648SI() != null && this.f72421L0.m92674mJ() && !m92681pJ()) {
            actionBarMenu.m92750r();
            C28005e c28005e = this.f79683U1;
            if (c28005e != null && c28005e.m141138f()) {
                AbstractC19147a m86760bO = m86760bO();
                if (m87139RR()) {
                    m87117oS(actionBarMenu, 200);
                } else {
                    m87093XR(actionBarMenu);
                }
                if (m86760bO != null) {
                    m86760bO.m100485q(m86760bO.m100473e());
                }
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: FN */
    public void mo86723FN(String str) {
        super.mo86723FN(str);
        C28005e c28005e = this.f79683U1;
        if (c28005e != null) {
            c28005e.m141137C(str);
        }
        invalidateOptionsMenu();
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Drawable drawable;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        View mo37483GJ = super.mo37483GJ(layoutInflater, viewGroup, bundle);
        if (this.f79693e2) {
            m92637BK(true);
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            this.f79683U1 = new C28005e(m92689tK, m86768eO(), this.f79688Z1);
            MinimizableActionBar minimizableActionBar = new MinimizableActionBar(getContext());
            minimizableActionBar.setId(AbstractC6918a0.zalo_action_bar_minimizable);
            Context context = getContext();
            if (context != null) {
                drawable = context.getDrawable(AbstractC16803z.stencil_bg_action_bar);
            } else {
                drawable = null;
            }
            minimizableActionBar.setBackground(drawable);
            m86772gO().addView(minimizableActionBar, new ViewGroup.LayoutParams(-1, -2));
        }
        return mo37483GJ;
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: GN */
    public void mo86726GN(String str) {
        super.mo86726GN(str);
        C28005e c28005e = this.f79683U1;
        if (c28005e != null) {
            c28005e.m141139g(str);
        }
        invalidateOptionsMenu();
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView, com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        ValueAnimator valueAnimator;
        super.mo39024IJ();
        ValueAnimator valueAnimator2 = this.f79694f2;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.f79694f2) != null) {
            valueAnimator.cancel();
        }
        C23744a.Companion.m124119a().m124116d(9009, new C19602a("h5.event.webview.close"));
    }

    /* renamed from: JR */
    public void m87133JR() {
        if (this.f88760a0 == null) {
            return;
        }
        AbstractC19147a m86760bO = m86760bO();
        if (m87139RR()) {
            m87113mS(m86760bO, 200);
        } else {
            m87092WR(m86760bO);
        }
    }

    /* renamed from: KR */
    public void m87134KR() {
        RelativeLayout m86790pO;
        MiniMenuFloatingView miniMenuFloatingView;
        RelativeLayout m86813xO;
        RelativeLayout m86813xO2;
        AbstractC19147a m86760bO = m86760bO();
        if (m86760bO instanceof C19150d) {
            C19150d c19150d = (C19150d) m86760bO;
            if (m86813xO() != null && (((m86813xO = m86813xO()) == null || m86813xO.getVisibility() != 8) && (m86813xO2 = m86813xO()) != null)) {
                m86813xO2.setVisibility(8);
            }
            Integer m100473e = c19150d.m100473e();
            m86792pQ(true);
            ViewParent viewParent = null;
            if (this.f79689a2 == null) {
                if (m100473e != null) {
                    miniMenuFloatingView = new MiniMenuFloatingView(getContext(), m100473e.intValue(), c19150d.m100494s());
                } else {
                    miniMenuFloatingView = null;
                }
                this.f79689a2 = miniMenuFloatingView;
                if (miniMenuFloatingView != null) {
                    miniMenuFloatingView.setButtonCloseClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.e71
                        public /* synthetic */ e71() {
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ZaloWebView.m87088LR(ZaloWebView.this, view);
                        }
                    });
                }
            }
            MiniMenuFloatingView miniMenuFloatingView2 = this.f79689a2;
            if (miniMenuFloatingView2 != null) {
                viewParent = miniMenuFloatingView2.getParent();
            }
            if (viewParent == null && (m86790pO = m86790pO()) != null) {
                m86790pO.addView(this.f79689a2);
                return;
            }
            return;
        }
        throw new Exception("Invalid FloatingActionBarConfig");
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: LP */
    public void mo49858LP(String str) {
        int i11;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        super.mo49858LP(str);
        C28005e c28005e = this.f79683U1;
        if (c28005e != null) {
            int i12 = 3;
            int[] iArr = new int[3];
            iArr[0] = 2;
            if (!canGoBack()) {
                i12 = 4;
            }
            iArr[1] = i12;
            if (m86720DN()) {
                i11 = 5;
            } else {
                i11 = 6;
            }
            iArr[2] = i11;
            c28005e.m141136B(iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: MP */
    public void mo81373MP(String str, Bitmap bitmap) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        super.mo81373MP(str, bitmap);
        C28005e c28005e = this.f79683U1;
        if (c28005e != null) {
            int i11 = 6;
            int i12 = 4;
            if (c28005e.m141148z()) {
                c28005e.m141143k().add(1);
                List m141143k = c28005e.m141143k();
                if (canGoBack()) {
                    i12 = 3;
                }
                m141143k.add(Integer.valueOf(i12));
                List m141143k2 = c28005e.m141143k();
                if (m86720DN()) {
                    i11 = 5;
                }
                m141143k2.add(Integer.valueOf(i11));
            } else {
                int[] iArr = new int[3];
                iArr[0] = 1;
                if (canGoBack()) {
                    i12 = 3;
                }
                iArr[1] = i12;
                if (m86720DN()) {
                    i11 = 5;
                }
                iArr[2] = i11;
                c28005e.m141136B(iArr);
            }
        }
        if (AbstractC19074t.m100204b(m86768eO(), C18613b.f93598q) || AbstractC19074t.m100204b(m86768eO(), C18613b.f93603v)) {
            m87123rS(str);
        }
    }

    /* renamed from: MR */
    public void m87135MR() {
        RelativeLayout m86813xO;
        m87140UR();
        if (m86813xO() != null) {
            RelativeLayout m86813xO2 = m86813xO();
            if ((m86813xO2 == null || m86813xO2.getVisibility() != 8) && (m86813xO = m86813xO()) != null) {
                m86813xO.setVisibility(8);
            }
        }
    }

    /* renamed from: NR */
    public void m87136NR() {
        RelativeLayout m86813xO;
        m87140UR();
        RelativeLayout m86813xO2 = m86813xO();
        if ((m86813xO2 == null || m86813xO2.getVisibility() != 0) && (m86813xO = m86813xO()) != null) {
            m86813xO.setVisibility(0);
        }
        if (this.f88760a0 == null) {
            return;
        }
        if (m86760bO() instanceof C19153g) {
            if (this.f88760a0.getVisibility() != 8) {
                this.f88760a0.setVisibility(8);
            }
            m87087IR();
            return;
        }
        m87087IR();
    }

    /* renamed from: OR */
    public void m87137OR() {
        RelativeLayout m86813xO;
        TextView subtitleTextView;
        if (this.f88760a0 == null) {
            return;
        }
        m87140UR();
        RelativeLayout m86813xO2 = m86813xO();
        if ((m86813xO2 == null || m86813xO2.getVisibility() != 0) && (m86813xO = m86813xO()) != null) {
            m86813xO.setVisibility(0);
        }
        if (this.f88760a0.getVisibility() != 0) {
            this.f88760a0.setVisibility(0);
        }
        if (this.f88760a0.getTitleTextView() != null) {
            TextView titleTextView = this.f88760a0.getTitleTextView();
            if (titleTextView != null) {
                titleTextView.setVisibility(8);
            }
            if (this.f88760a0.getSubtitleTextView() != null && !TextUtils.isEmpty(this.f88760a0.getSubTitle()) && (subtitleTextView = this.f88760a0.getSubtitleTextView()) != null) {
                subtitleTextView.setVisibility(8);
            }
        }
        this.f88760a0.setActionBarHeight(m92651WI().getDimensionPixelSize(AbstractC16802y.action_bar_min));
        m87133JR();
        m87087IR();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        MultiStateView m86781lO;
        super.mo39032PJ();
        if (this.f79681S1 && (m86781lO = m86781lO()) != null) {
            m86781lO.setState(MultiStateView.EnumC15914e.LOADING);
        }
    }

    /* renamed from: PR */
    public void m87138PR() {
        RelativeLayout m86813xO;
        TextView subtitleTextView;
        TextView subtitleTextView2;
        TextView subtitleTextView3;
        TextView subtitleTextView4;
        TextView titleTextView;
        TextView titleTextView2;
        if (this.f88760a0 == null) {
            return;
        }
        m87140UR();
        if (this.f88760a0.getVisibility() != 0) {
            this.f88760a0.setVisibility(0);
        }
        RelativeLayout m86813xO2 = m86813xO();
        if ((m86813xO2 == null || m86813xO2.getVisibility() != 0) && (m86813xO = m86813xO()) != null) {
            m86813xO.setVisibility(0);
        }
        if (this.f88760a0.getTitleTextView() != null && (((titleTextView = this.f88760a0.getTitleTextView()) == null || titleTextView.getVisibility() != 0) && (titleTextView2 = this.f88760a0.getTitleTextView()) != null)) {
            titleTextView2.setVisibility(0);
        }
        if (m86776hP() && this.f88760a0.getSubtitleTextView() != null && (((subtitleTextView3 = this.f88760a0.getSubtitleTextView()) == null || subtitleTextView3.getVisibility() != 0) && (subtitleTextView4 = this.f88760a0.getSubtitleTextView()) != null)) {
            subtitleTextView4.setVisibility(0);
        }
        if (this.f88760a0.getSubtitleTextView() != null && (subtitleTextView = this.f88760a0.getSubtitleTextView()) != null && subtitleTextView.getVisibility() == 0 && this.f88760a0.getSubtitleTextView() != null && (subtitleTextView2 = this.f88760a0.getSubtitleTextView()) != null) {
            subtitleTextView2.setTextSize(1, 12.0f);
        }
        TextView titleTextView3 = this.f88760a0.getTitleTextView();
        if (titleTextView3 != null) {
            titleTextView3.setTextSize(1, 16.0f);
        }
        this.f88760a0.setActionBarHeight(m86752ZN());
        m87133JR();
        m87087IR();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        C28005e c28005e;
        C28005e.b m141142j;
        C16794l m141144l;
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    m86758aQ();
                }
                C28005e c28005e2 = this.f79683U1;
                if (c28005e2 != null && (m141144l = c28005e2.m141144l()) != null && i11 / 1000 == 1) {
                    int i12 = i11 % 1000;
                    if (i12 != 1) {
                        if (i12 == 2) {
                            JSONObject optJSONObject = m141144l.f85227d.optJSONObject("cateDetailsInfo");
                            if (optJSONObject != null) {
                                C3245i c3245i = new C3245i(optJSONObject);
                                if (!TextUtils.isEmpty(c3245i.m16464f()) && !TextUtils.isEmpty(c3245i.f13859g)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("bol_share_in_app", true);
                                    bundle.putString("contentNeedToShare", c3245i.m16461c());
                                    C17487o0 m92662fJ = m92662fJ();
                                    if (m92662fJ != null) {
                                        m92662fJ.m93069k2(ShareView.class, bundle, 0, true);
                                    }
                                }
                            }
                            return true;
                        }
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt(StickerManageView.f77867h1, this.f79686X1);
                        bundle2.putInt(StickerManageView.f77869j1, m86765dO());
                        C17487o0 m92662fJ2 = m92662fJ();
                        if (m92662fJ2 != null) {
                            m92662fJ2.m93066i2(StickerManageView.class, bundle2, 1, 1, true);
                        }
                        return true;
                    }
                }
                if (i11 / ZAbstractBase.ZVU_PROCESS_FLUSH == 1 && (c28005e = this.f79683U1) != null && (m141142j = c28005e.m141142j(i11)) != null) {
                    String m141149a = m141142j.m141149a();
                    switch (m141149a.hashCode()) {
                        case -2003015340:
                            if (m141149a.equals("zalo.web.internal.save.to.mycloud")) {
                                m86802tN();
                                break;
                            }
                            m86767dQ(m141142j.m141149a(), m141142j.m141150b(), m141142j.m141151c());
                            break;
                        case -1999853349:
                            if (m141149a.equals("zalo.web.internal.action.copy.url")) {
                                m86785oN();
                                break;
                            } else {
                                m86767dQ(m141142j.m141149a(), m141142j.m141150b(), m141142j.m141151c());
                                break;
                            }
                        case -1853986255:
                            if (m141149a.equals("zalo.web.internal.postfeed")) {
                                m86793qN();
                                break;
                            } else {
                                m86767dQ(m141142j.m141149a(), m141142j.m141150b(), m141142j.m141151c());
                                break;
                            }
                        case -1508203887:
                            if (m141149a.equals("zalo.web.internal.action.open.url.outapp")) {
                                m86789pN();
                                break;
                            } else {
                                m86767dQ(m141142j.m141149a(), m141142j.m141150b(), m141142j.m141151c());
                                break;
                            }
                        case 823652839:
                            if (m141149a.equals("zalo.web.internal.report")) {
                                m86796rN();
                                break;
                            } else {
                                m86767dQ(m141142j.m141149a(), m141142j.m141150b(), m141142j.m141151c());
                                break;
                            }
                        case 1106914323:
                            if (m141149a.equals("zalo.web.internal.sharesheet")) {
                                m86806vN();
                                break;
                            } else {
                                m86767dQ(m141142j.m141149a(), m141142j.m141150b(), m141142j.m141151c());
                                break;
                            }
                        default:
                            m86767dQ(m141142j.m141149a(), m141142j.m141150b(), m141142j.m141151c());
                            break;
                    }
                    return true;
                }
                return false;
            }
            AbstractC23647d.m123906p("550052");
            C17487o0 m92662fJ3 = m92662fJ();
            if (m92662fJ3 != null) {
                m92662fJ3.m93066i2(GameManageView.class, null, 3, 1, true);
            }
            AbstractC23647d.m123893c();
            return true;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putInt(StickerManageView.f77867h1, this.f79686X1);
        bundle3.putInt(StickerManageView.f77869j1, m86765dO());
        C17487o0 m92662fJ4 = m92662fJ();
        if (m92662fJ4 != null) {
            m92662fJ4.m93066i2(StickerManageView.class, bundle3, 1, 1, true);
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView, com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        if (this.f79681S1) {
            try {
                C23744a.Companion.m124119a().m124117e(this, 6071);
                m86748WO(true);
                return;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (!(m92676n2() instanceof WebViewMPActivity)) {
            AbstractC23136l9.m118750t1(m92676n2(), true);
        }
    }

    /* renamed from: RR */
    public boolean m87139RR() {
        AbstractC19147a m86760bO = m86760bO();
        if (m86760bO == null) {
            return false;
        }
        int i11 = this.f79682T1;
        Integer m100473e = m86760bO.m100473e();
        if (m100473e != null && i11 == m100473e.intValue()) {
            return false;
        }
        if (m86760bO.m100476h() != null) {
            if (m86760bO.m100473e() == null) {
                return false;
            }
            AbstractC21954k.a aVar = AbstractC21954k.Companion;
            if (aVar.m114624s(m86760bO.m100473e()) == aVar.m114624s(m86760bO.m100476h())) {
                return false;
            }
            return true;
        }
        if (m86760bO.m100473e() == null) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        if (m86815yN()) {
            return;
        }
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitleAlignCenter(true);
                MinimizableActionBar minimizableActionBar = this.f79690b2;
                if (minimizableActionBar != null) {
                    if (minimizableActionBar != null) {
                        minimizableActionBar.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                    }
                } else {
                    this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                }
            }
            m87095aS();
            m87141VR();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: TP */
    public void mo81380TP() {
        ToastUtils.showMess(m92652XI(AbstractC8020f0.str_webview_loading_fail));
        finish();
    }

    /* renamed from: UR */
    public void m87140UR() {
        if (this.f79689a2 != null) {
            RelativeLayout m86790pO = m86790pO();
            if (m86790pO != null) {
                m86790pO.removeView(this.f79689a2);
            }
            m86744VN(false);
            this.f79689a2 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: VR */
    protected void m87141VR() {
        C24848g0 c24848g0;
        TextView subtitleTextView;
        ColorStateList colorStateList;
        TextView titleTextView;
        if (this.f88760a0 == null) {
            return;
        }
        ColorStateList colorStateList2 = null;
        if (AbstractC19074t.m100204b(m86768eO(), C18613b.f93598q)) {
            MinimizableActionBar minimizableActionBar = this.f79690b2;
            if (minimizableActionBar != null) {
                if (minimizableActionBar != null) {
                    minimizableActionBar.setBackgroundColor(C23212s8.m119606n(AbstractC16781w.ActionBarInAppBrowserColor));
                }
            } else {
                this.f88760a0.setBackgroundColor(C23212s8.m119606n(AbstractC16781w.ActionBarInAppBrowserColor));
            }
            if (this.f88760a0.getTitleTextView() != null) {
                int m119606n = C23212s8.m119606n(AbstractC21196a.TextColor1);
                ColorStateList valueOf = ColorStateList.valueOf(m119606n);
                TextView titleTextView2 = this.f88760a0.getTitleTextView();
                if (titleTextView2 != null) {
                    colorStateList = titleTextView2.getTextColors();
                } else {
                    colorStateList = null;
                }
                if (valueOf != colorStateList && (titleTextView = this.f88760a0.getTitleTextView()) != null) {
                    titleTextView.setTextColor(m119606n);
                }
            } else {
                this.f88760a0.setTitleColor(C23212s8.m119606n(AbstractC21196a.TextColor1));
            }
            if (this.f88760a0.getSubtitleTextView() != null) {
                ColorStateList valueOf2 = ColorStateList.valueOf(C23212s8.m119606n(AbstractC21196a.TextColor2));
                TextView subtitleTextView2 = this.f88760a0.getSubtitleTextView();
                if (subtitleTextView2 != null) {
                    colorStateList2 = subtitleTextView2.getTextColors();
                }
                if (valueOf2 != colorStateList2 && (subtitleTextView = this.f88760a0.getSubtitleTextView()) != null) {
                    subtitleTextView.setTextColor(C23212s8.m119606n(AbstractC21196a.TextColor2));
                }
            } else {
                this.f88760a0.setSubTitleColor(C23212s8.m119606n(AbstractC21196a.TextColor2));
            }
        } else {
            MinimizableActionBar minimizableActionBar2 = this.f79690b2;
            if (minimizableActionBar2 != null) {
                minimizableActionBar2.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                c24848g0 = C24848g0.f119245a;
            } else {
                c24848g0 = null;
            }
            if (c24848g0 == null) {
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
            }
            TextView titleTextView3 = this.f88760a0.getTitleTextView();
            if (titleTextView3 != null) {
                if (ColorStateList.valueOf(-1) != titleTextView3.getTextColors()) {
                    titleTextView3.setTextColor(-1);
                }
            } else {
                titleTextView3 = null;
            }
            if (titleTextView3 == null) {
                this.f88760a0.setTitleColor(-1);
            }
            TextView subtitleTextView3 = this.f88760a0.getSubtitleTextView();
            if (subtitleTextView3 != 0) {
                if (ColorStateList.valueOf(-1258291201) != subtitleTextView3.getTextColors()) {
                    subtitleTextView3.setTextColor(-1258291201);
                }
                colorStateList2 = subtitleTextView3;
            }
            if (colorStateList2 == null) {
                this.f88760a0.setSubTitleColor(-1258291201);
            }
        }
        m87075LK();
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: YQ */
    public void mo81383YQ(C21368b c21368b) {
        AbstractC19074t.m100208f(c21368b, "jumpViewState");
        super.mo81383YQ(c21368b);
        C28005e c28005e = this.f79683U1;
        if (c28005e != null) {
            c28005e.m141147y(m86768eO());
        }
        m87085GR(true);
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView, com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        View view2;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m84416fM(true);
        ZWebView m86724FO = m86724FO();
        if (m86724FO != null) {
            m86724FO.setOnCreateContextMenuListener(this);
        }
        invalidateOptionsMenu();
        RelativeLayout m86790pO = m86790pO();
        if (m86790pO != null) {
            view2 = m86790pO.findViewById(AbstractC6918a0.zalo_action_bar_minimizable);
        } else {
            view2 = null;
        }
        if (view2 instanceof MinimizableActionBar) {
            this.f79690b2 = (MinimizableActionBar) view2;
        }
        this.f79691c2 = new HandlerC15404b(Looper.getMainLooper());
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: ZP */
    public void mo86753ZP(boolean z11, long j11) {
        if (z11) {
            m87082DR(true);
            Handler handler = this.f79691c2;
            if (handler == null) {
                AbstractC19074t.m100223u("mUIHandler");
                handler = null;
            }
            handler.sendEmptyMessageDelayed(2, j11);
            return;
        }
        m87082DR(false);
    }

    /* renamed from: ZR */
    public final void m87142ZR(boolean z11) {
        this.f79693e2 = z11;
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: aR */
    public void mo86759aR(C21369c c21369c) {
        ProgressBar m86786oO;
        AbstractC19074t.m100208f(c21369c, "loadingViewState");
        super.mo86759aR(c21369c);
        if (m86786oO() != null) {
            if (!c21369c.m110764f()) {
                ProgressBar m86786oO2 = m86786oO();
                if ((m86786oO2 == null || m86786oO2.getVisibility() != 8) && (m86786oO = m86786oO()) != null) {
                    m86786oO.setVisibility(8);
                }
            } else {
                ProgressBar m86786oO3 = m86786oO();
                if (m86786oO3 != null) {
                    m86786oO3.setVisibility(0);
                }
                ProgressBar m86786oO4 = m86786oO();
                if (m86786oO4 != null) {
                    m86786oO4.setProgress(c21369c.m110762d());
                    return;
                }
                return;
            }
        }
        if (!c21369c.m110764f()) {
            m87133JR();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: cR */
    public void mo81385cR(C19609h c19609h) {
        super.mo81385cR(c19609h);
        ToastUtils.m89266n(AbstractC8020f0.str_link_not_support, new Object[0]);
        finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:            if (m87123rS(m86721DO()) != false) goto L62;     */
    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: fQ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo81389fQ() {
        m86731NO();
        String m86810wO = m86810wO();
        if (m86810wO.length() == 0) {
            m86810wO = AbstractC23136l9.m118743r0(AbstractC8020f0.app_name);
            AbstractC19074t.m100207e(m86810wO, "getString(...)");
        }
        boolean z11 = false;
        if (this.f88760a0 == null) {
            return false;
        }
        if (m86800sO() < 0 || m86800sO() >= 400) {
            m86810wO = AbstractC23136l9.m118743r0(AbstractC8020f0.app_name);
            AbstractC19074t.m100207e(m86810wO, "getString(...)");
        }
        if (!TextUtils.isEmpty(m86810wO)) {
            Locale locale = Locale.ROOT;
            AbstractC19074t.m100207e(locale, "ROOT");
            String lowerCase = m86810wO.toLowerCase(locale);
            AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
            if (!AbstractC19074t.m100204b("about:blank", lowerCase)) {
                if (!TextUtils.isEmpty(m86810wO)) {
                    AbstractC19074t.m100207e(locale, "ROOT");
                    String lowerCase2 = m86810wO.toLowerCase(locale);
                    AbstractC19074t.m100207e(lowerCase2, "toLowerCase(...)");
                    String m86782mO = m86782mO();
                    AbstractC19074t.m100207e(locale, "ROOT");
                    String lowerCase3 = m86782mO.toLowerCase(locale);
                    AbstractC19074t.m100207e(lowerCase3, "toLowerCase(...)");
                    if (!AbstractC19074t.m100204b(lowerCase2, lowerCase3)) {
                        m86817yQ(m86810wO);
                        ActionBar actionBar = this.f88760a0;
                        if (actionBar != null) {
                            actionBar.setTitle(m86810wO);
                        }
                    }
                }
                m86809vQ(m86810wO);
                z11 = true;
                if (!m86776hP()) {
                    mo86818zP();
                }
                m87085GR(true);
            }
        }
        return z11;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        C17487o0 m92662fJ;
        if (m92648SI() instanceof Activity) {
            Context m92648SI = m92648SI();
            AbstractC19074t.m100206d(m92648SI, "null cannot be cast to non-null type android.app.Activity");
            if (((Activity) m92648SI).isTaskRoot() && (m92662fJ = m92662fJ()) != null && m92662fJ.m93018M0() == 1) {
                if (m92648SI() instanceof ZaloLauncherActivity) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("SHOW_WITH_FLAGS", 67108864);
                    bundle.putBoolean("UPDATE_NAVIGATION_BAR_FLAGSUPDATE_NAVIGATION_BAR_FLAGS", true);
                    C17487o0 m92662fJ2 = m92662fJ();
                    if (m92662fJ2 != null) {
                        m92662fJ2.m93069k2(MainTabView.class, bundle, 0, true);
                        return;
                    }
                    return;
                }
                Intent m119018R = AbstractC23152n3.m119018R(MainTabView.class, null);
                AbstractC19074t.m100207e(m119018R, "makeIntentShowZaloViewClearStack(...)");
                Context m92648SI2 = m92648SI();
                AbstractC19074t.m100206d(m92648SI2, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) m92648SI2).finish();
                Context m92648SI3 = m92648SI();
                if (m92648SI3 != null) {
                    m92648SI3.startActivity(m119018R);
                    return;
                }
                return;
            }
        }
        m86738RO(true, false);
        super.finish();
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ZaloWebView";
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView, com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (this.f79681S1) {
            try {
                if (i11 != 1) {
                    if (i11 == 3 && i12 == -1) {
                        if (AbstractC19074t.m100204b(m86768eO(), C18613b.f93600s)) {
                            m86716AQ(0);
                            m86742TO();
                        }
                    }
                } else if (i12 == -1) {
                    if (AbstractC19074t.m100204b(m86768eO(), C18613b.f93601t)) {
                        m86716AQ(0);
                        m86742TO();
                        this.f72421L0.mo50035CK(-1, intent);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        super.onActivityResult(i11, i12, intent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:            if (android.webkit.URLUtil.isNetworkUrl(r11.getExtra()) != false) goto L58;     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:4:0x0010, B:8:0x0017, B:17:0x002f, B:23:0x0094, B:25:0x00c6, B:31:0x0042), top: B:3:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6 A[Catch: Exception -> 0x003f, TRY_LEAVE, TryCatch #0 {Exception -> 0x003f, blocks: (B:4:0x0010, B:8:0x0017, B:17:0x002f, B:23:0x0094, B:25:0x00c6, B:31:0x0042), top: B:3:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // com.zing.zalo.zview.ZaloView, android.view.View.OnCreateContextMenuListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        boolean z11;
        boolean z12;
        AbstractC19074t.m100208f(contextMenu, "menu");
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        if (!this.f79681S1) {
            try {
                WebView.HitTestResult m86722EO = m86722EO();
                if (m86722EO == null) {
                    return;
                }
                int type = m86722EO.getType();
                if (type != 4) {
                    if (type != 5) {
                        if (type != 7) {
                            if (type == 8) {
                            }
                        }
                        z12 = true;
                        z11 = false;
                        if (z12) {
                            Intent intent = new Intent();
                            intent.putExtra("EXTRA_ID_URL", m86722EO.getExtra());
                            contextMenu.add(0, 11, 0, AbstractC8020f0.browser_menu_link_open).setIntent(intent);
                            contextMenu.add(0, 14, 0, AbstractC8020f0.browser_menu_link_copy_url).setIntent(intent);
                            contextMenu.add(0, 16, 0, AbstractC8020f0.share).setIntent(intent);
                            contextMenu.setHeaderTitle(m86722EO.getExtra());
                        }
                        if (z11) {
                            Intent intent2 = new Intent();
                            intent2.putExtra("EXTRA_ID_URL", m86722EO.getExtra());
                            intent2.putExtra("EXTRA_SHARE_URL_IMAGE", true);
                            MenuItem add = contextMenu.add(0, 14, 0, AbstractC8020f0.browser_menu_image_copy_image_url);
                            AbstractC19074t.m100207e(add, "add(...)");
                            add.setIntent(intent2);
                            MenuItem add2 = contextMenu.add(0, 13, 0, AbstractC8020f0.browser_menu_image_download_image);
                            AbstractC19074t.m100207e(add2, "add(...)");
                            add2.setIntent(intent2);
                            MenuItem add3 = contextMenu.add(0, 16, 0, AbstractC8020f0.share);
                            AbstractC19074t.m100207e(add3, "add(...)");
                            add3.setIntent(intent2);
                            contextMenu.setHeaderTitle(m86722EO.getExtra());
                            return;
                        }
                        return;
                    }
                    z12 = false;
                    z11 = true;
                    if (z12) {
                    }
                    if (z11) {
                    }
                } else {
                    Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse("mailto:" + m86722EO.getExtra()));
                    intent3.setFlags(268435456);
                    contextMenu.add(0, 15, 0, AbstractC8020f0.browser_menu_email_send_email).setIntent(intent3);
                    Intent intent4 = new Intent();
                    intent4.putExtra("EXTRA_ID_URL", m86722EO.getExtra());
                    contextMenu.add(0, 14, 0, AbstractC8020f0.browser_menu_email_copy_email_url).setIntent(intent4);
                    contextMenu.setHeaderTitle(m86722EO.getExtra());
                }
                z12 = false;
                z11 = false;
                if (z12) {
                }
                if (z11) {
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView, com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (this.f79681S1) {
            C23744a.Companion.m124119a().m124115b(this, 6071);
        } else if (!(m92676n2() instanceof WebViewMPActivity)) {
            AbstractC23136l9.m118750t1(m92676n2(), !m86764cP());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: qQ */
    public void mo86795qQ() {
        super.mo86795qQ();
        this.f79685W1.set(false);
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView, com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
        if (i11 == 6071) {
            AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.d71
                public /* synthetic */ d71() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZaloWebView.m87083ER(ZaloWebView.this);
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        ProgressBar m86786oO;
        super.mo37135xJ(bundle);
        if (!this.f79681S1 && (m86786oO = m86786oO()) != null) {
            m86786oO.setProgressDrawable(AbstractC23136l9.m118665N(m92689tK(), AbstractC16803z.web_progress_bar_blue));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: zN */
    public boolean mo81393zN() {
        if (!canGoBack()) {
            m87081CR(false);
            return true;
        }
        m86799ra();
        return true;
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: zP */
    public void mo86818zP() {
        TextView subtitleTextView = this.f88760a0.getSubtitleTextView();
        if (subtitleTextView != null) {
            subtitleTextView.setVisibility(8);
        }
    }
}
