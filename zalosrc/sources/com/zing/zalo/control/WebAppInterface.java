package com.zing.zalo.control;

import ae.C0766k;
import am.C0927o;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.SensitiveExtraData;
import com.zing.zalo.control.WebAppInterface;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.webview.AbstractC16795m;
import com.zing.zalo.webview.EnumC16799o;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.ZaloView;
import fg0.ThreadFactoryC18928a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import me0.AbstractC23152n3;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p023av.EnumC2383a;
import p140ev.C18613b;
import p140ev.C18620i;
import p140ev.C18621j;
import p140ev.C18623l;
import p307kv.AbstractC21954k;
import p369ns.AbstractC23933a;
import p454qn.AbstractC25384a;
import p483rh.InterfaceC25792a;
import p542ub.InterfaceC27218a;
import p658xu.EnumC30205a;
import p693yu.InterfaceC31084b;
import p693yu.InterfaceC31085c;
import p716zh.C31877d;
import v50.C27870vb;
import vg.AbstractC28127m2;
import vg.AbstractC28207v1;
import vg.AbstractC28248z6;
import vg.C28136n2;
import vg.C28145o2;
import vg.C28154p2;
import vg.C28239y6;

/* loaded from: classes3.dex */
public final class WebAppInterface {
    public static final C7895a Companion = new C7895a(null);
    public static final boolean DEBUG = true;
    public static final int ERROR = -1;
    public static final int ERROR_CODE_CLIENT_NOT_SUPPORT = -5;
    public static final int ERROR_CODE_DECODE_OPTIONS = -4;
    public static final int ERROR_CODE_EXCEEDED_LIMIT_REQUEST = -203;
    public static final int ERROR_CODE_INVALID_TOKEN = -2;
    public static final int ERROR_CODE_NO_PERMISSION = -3;
    public static final int ERROR_CODE_PARSED_DATA_FAILED = -204;
    public static final int ERROR_CODE_USER_REJECTED_REQUEST = -201;
    public static final int ERROR_CODE_USER_REJECTED_REQUEST_NO_ASK_AGAIN = -202;
    public static final int ERROR_PURCHASE_USER_CANCELED = -100;
    public static final int SUCCESS = 0;
    private static final String TAG;
    private final Executor mJSExecutor;
    private final InterfaceC31084b mListener;
    private final InterfaceC31085c uiListener;

    /* renamed from: com.zing.zalo.control.WebAppInterface$a */
    /* loaded from: classes3.dex */
    public static final class C7895a {
        private C7895a() {
        }

        public /* synthetic */ C7895a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final String m40705a() {
            return WebAppInterface.TAG;
        }
    }

    /* renamed from: com.zing.zalo.control.WebAppInterface$b */
    /* loaded from: classes3.dex */
    public final class RunnableC7896b implements Runnable {

        /* renamed from: p */
        private final String f42692p;

        /* renamed from: q */
        private final String f42693q;

        /* renamed from: r */
        private final String f42694r;

        /* renamed from: s */
        private final String f42695s;

        /* renamed from: t */
        final /* synthetic */ WebAppInterface f42696t;

        /* renamed from: com.zing.zalo.control.WebAppInterface$b$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC28207v1.g0 {

            /* renamed from: a */
            final /* synthetic */ WebAppInterface f42697a;

            /* renamed from: b */
            final /* synthetic */ RunnableC7896b f42698b;

            a(WebAppInterface webAppInterface, RunnableC7896b runnableC7896b) {
                this.f42697a = webAppInterface;
                this.f42698b = runnableC7896b;
            }

            /* renamed from: H */
            public static final void m40717H(WebAppInterface webAppInterface, String str) {
                AbstractC19074t.m100208f(webAppInterface, "this$0");
                try {
                    webAppInterface.getMListener().mo151021E(str, false);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }

            /* renamed from: I */
            public static final void m40718I(WebAppInterface webAppInterface, String str) {
                AbstractC19074t.m100208f(webAppInterface, "this$0");
                try {
                    webAppInterface.getMListener().mo151059u(str);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }

            /* renamed from: J */
            public static final void m40719J(WebAppInterface webAppInterface, String str) {
                AbstractC19074t.m100208f(webAppInterface, "this$0");
                try {
                    webAppInterface.getMListener().mo151021E(str, true);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }

            /* renamed from: K */
            public static final void m40720K(WebAppInterface webAppInterface) {
                AbstractC19074t.m100208f(webAppInterface, "this$0");
                try {
                    webAppInterface.getMListener().mo151053o();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }

            /* renamed from: L */
            public static final void m40721L(WebAppInterface webAppInterface) {
                AbstractC19074t.m100208f(webAppInterface, "this$0");
                try {
                    webAppInterface.getMListener().mo151063y();
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }

            /* renamed from: M */
            public static final void m40722M(WebAppInterface webAppInterface, List list, int i11, RunnableC7896b runnableC7896b) {
                AbstractC19074t.m100208f(webAppInterface, "this$0");
                AbstractC19074t.m100208f(list, "$arrSavedPaths");
                AbstractC19074t.m100208f(runnableC7896b, "this$1");
                try {
                    webAppInterface.getMListener().mo151047i(list, i11, runnableC7896b.m40706a(), runnableC7896b.m40709d(), null);
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }

            /* renamed from: N */
            public static final void m40723N(WebAppInterface webAppInterface, String str, String str2, RunnableC7896b runnableC7896b, String str3) {
                AbstractC19074t.m100208f(webAppInterface, "this$0");
                AbstractC19074t.m100208f(runnableC7896b, "this$1");
                try {
                    webAppInterface.getMListener().mo151049k(str, str2, runnableC7896b.m40706a(), runnableC7896b.m40709d(), str3);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }

            /* renamed from: O */
            public static final void m40724O(WebAppInterface webAppInterface, String str, String str2) {
                AbstractC19074t.m100208f(webAppInterface, "this$0");
                try {
                    webAppInterface.getMListener().mo151043e(str, str2);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }

            /* renamed from: P */
            public static final void m40725P(WebAppInterface webAppInterface, RunnableC7896b runnableC7896b) {
                AbstractC19074t.m100208f(webAppInterface, "this$0");
                AbstractC19074t.m100208f(runnableC7896b, "this$1");
                try {
                    webAppInterface.getMListener().mo151060v(runnableC7896b.m40709d());
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }

            /* renamed from: Q */
            public static final void m40726Q(WebAppInterface webAppInterface, String str) {
                AbstractC19074t.m100208f(webAppInterface, "this$0");
                try {
                    webAppInterface.getMListener().mo151037U(str);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }

            /* renamed from: R */
            public static final void m40727R(WebAppInterface webAppInterface) {
                AbstractC19074t.m100208f(webAppInterface, "this$0");
                try {
                    webAppInterface.getMListener().mo151037U(null);
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }

            /* renamed from: S */
            public static final void m40728S(WebAppInterface webAppInterface, String str, RunnableC7896b runnableC7896b) {
                AbstractC19074t.m100208f(webAppInterface, "this$0");
                AbstractC19074t.m100208f(runnableC7896b, "this$1");
                try {
                    webAppInterface.getMListener().mo151054p(str, runnableC7896b.m40706a(), runnableC7896b.m40709d(), runnableC7896b.m40707b());
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }

            /* renamed from: T */
            public static final void m40729T(WebAppInterface webAppInterface, String str, JSONObject jSONObject, String str2) {
                AbstractC19074t.m100208f(webAppInterface, "this$0");
                try {
                    webAppInterface.getMListener().mo151041c(str, jSONObject, str2);
                } catch (Exception e11) {
                    e11.printStackTrace();
                    webAppInterface.dispatchResultErrorOnUIThread(-100, "Unknown error", str2);
                }
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: a */
            public boolean mo40736a(String str) {
                return this.f42697a.getMListener().mo151039a(str);
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: b */
            public void mo40737b(JSONObject jSONObject) {
                this.f42697a.getMListener().mo151041c("UPDATE_DOWNLOAD_PROGRESS", jSONObject, null);
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: c */
            public void mo40738c(final String str, final JSONObject jSONObject, final String str2) {
                AbstractC21954k.a aVar = AbstractC21954k.Companion;
                final WebAppInterface webAppInterface = this.f42697a;
                aVar.m114607G(new Runnable() { // from class: zh.zc
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebAppInterface.RunnableC7896b.a.m40729T(WebAppInterface.this, str, jSONObject, str2);
                    }
                });
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: d */
            public int mo40739d() {
                return this.f42697a.getFeatureId();
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: e */
            public void mo40740e(final String str, final String str2) {
                AbstractC21954k.a aVar = AbstractC21954k.Companion;
                final WebAppInterface webAppInterface = this.f42697a;
                aVar.m114607G(new Runnable() { // from class: zh.xc
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebAppInterface.RunnableC7896b.a.m40724O(WebAppInterface.this, str, str2);
                    }
                });
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: f */
            public void mo40741f(String str, int i11, JSONObject jSONObject, String str2) {
                AbstractC19074t.m100208f(str, "action");
                AbstractC19074t.m100208f(jSONObject, "data");
                this.f42697a.getMListener().mo151044f(str, i11, jSONObject, str2);
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: g */
            public void mo40742g() {
                AbstractC21954k.a aVar = AbstractC21954k.Companion;
                final WebAppInterface webAppInterface = this.f42697a;
                aVar.m114607G(new Runnable() { // from class: zh.cd
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebAppInterface.RunnableC7896b.a.m40721L(WebAppInterface.this);
                    }
                });
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: h */
            public void mo40743h() {
                AbstractC21954k.a aVar = AbstractC21954k.Companion;
                final WebAppInterface webAppInterface = this.f42697a;
                aVar.m114607G(new Runnable() { // from class: zh.yc
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebAppInterface.RunnableC7896b.a.m40720K(WebAppInterface.this);
                    }
                });
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: i */
            public void mo40744i() {
                AbstractC21954k.a aVar = AbstractC21954k.Companion;
                final WebAppInterface webAppInterface = this.f42697a;
                aVar.m114607G(new Runnable() { // from class: zh.uc
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebAppInterface.RunnableC7896b.a.m40727R(WebAppInterface.this);
                    }
                });
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: j */
            public void mo40745j(final String str) {
                AbstractC21954k.a aVar = AbstractC21954k.Companion;
                final WebAppInterface webAppInterface = this.f42697a;
                aVar.m114607G(new Runnable() { // from class: zh.vc
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebAppInterface.RunnableC7896b.a.m40726Q(WebAppInterface.this, str);
                    }
                });
            }

            @Override // vg.AbstractC28207v1.g0, vg.AbstractC28207v1.f0
            /* renamed from: k */
            public C18620i mo40746k() {
                return this.f42697a.getOpenSourceFromWeb();
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: l */
            public boolean mo40747l(String str) {
                if (str != null) {
                    return this.f42697a.checkValidAction(str, this.f42698b.m40707b(), this.f42698b.m40708c());
                }
                return false;
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: m */
            public void mo40748m(final String str) {
                AbstractC21954k.a aVar = AbstractC21954k.Companion;
                final WebAppInterface webAppInterface = this.f42697a;
                aVar.m114607G(new Runnable() { // from class: zh.bd
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebAppInterface.RunnableC7896b.a.m40717H(WebAppInterface.this, str);
                    }
                });
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: n */
            public void mo40749n(final List list, final int i11) {
                AbstractC19074t.m100208f(list, "arrSavedPaths");
                AbstractC21954k.a aVar = AbstractC21954k.Companion;
                final WebAppInterface webAppInterface = this.f42697a;
                final RunnableC7896b runnableC7896b = this.f42698b;
                aVar.m114607G(new Runnable() { // from class: com.zing.zalo.control.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebAppInterface.RunnableC7896b.a.m40722M(WebAppInterface.this, list, i11, runnableC7896b);
                    }
                });
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: o */
            public void mo40750o() {
                AbstractC21954k.a aVar = AbstractC21954k.Companion;
                final WebAppInterface webAppInterface = this.f42697a;
                final RunnableC7896b runnableC7896b = this.f42698b;
                aVar.m114607G(new Runnable() { // from class: com.zing.zalo.control.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebAppInterface.RunnableC7896b.a.m40725P(WebAppInterface.this, runnableC7896b);
                    }
                });
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: p */
            public void mo40751p(final String str) {
                if (!AbstractC19074t.m100204b("action.open.sharesheet", this.f42698b.m40706a()) && !AbstractC19074t.m100204b("action.open.postfeed", this.f42698b.m40706a())) {
                    if (AbstractC19074t.m100204b("action.open.qr", this.f42698b.m40706a())) {
                        AbstractC28127m2.a.m141609d().m141610a(str, new C28145o2(this.f42698b.m40706a(), this.f42698b.m40709d(), this.f42698b.m40707b()));
                    } else if (AbstractC19074t.m100204b("action.open.mp", this.f42698b.m40706a()) || AbstractC19074t.m100204b("action.open.inapp", this.f42698b.m40706a())) {
                        AbstractC28127m2.a.m141609d().m141610a(str, new C28136n2(this.f42698b.m40706a(), "", this.f42698b.m40707b()));
                    }
                } else {
                    AbstractC28127m2.a.m141609d().m141610a(str, new C28154p2(this.f42698b.m40706a(), this.f42698b.m40709d(), this.f42698b.m40707b()));
                }
                AbstractC21954k.a aVar = AbstractC21954k.Companion;
                final WebAppInterface webAppInterface = this.f42697a;
                final RunnableC7896b runnableC7896b = this.f42698b;
                aVar.m114607G(new Runnable() { // from class: com.zing.zalo.control.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebAppInterface.RunnableC7896b.a.m40728S(WebAppInterface.this, str, runnableC7896b);
                    }
                });
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: q */
            public void mo40752q(final String str) {
                AbstractC21954k.a aVar = AbstractC21954k.Companion;
                final WebAppInterface webAppInterface = this.f42697a;
                aVar.m114607G(new Runnable() { // from class: zh.wc
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebAppInterface.RunnableC7896b.a.m40718I(WebAppInterface.this, str);
                    }
                });
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: r */
            public void mo40753r(final String str, final String str2, final String str3) {
                AbstractC21954k.a aVar = AbstractC21954k.Companion;
                final WebAppInterface webAppInterface = this.f42697a;
                final RunnableC7896b runnableC7896b = this.f42698b;
                aVar.m114607G(new Runnable() { // from class: com.zing.zalo.control.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebAppInterface.RunnableC7896b.a.m40723N(WebAppInterface.this, str2, str, runnableC7896b, str3);
                    }
                });
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: s */
            public void mo40754s(final String str) {
                AbstractC21954k.a aVar = AbstractC21954k.Companion;
                final WebAppInterface webAppInterface = this.f42697a;
                aVar.m114607G(new Runnable() { // from class: zh.ad
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebAppInterface.RunnableC7896b.a.m40719J(WebAppInterface.this, str);
                    }
                });
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: t */
            public void mo40755t(String str, String str2, String str3) {
                AbstractC19074t.m100208f(str, "action");
                this.f42697a.handleJavaScripCall(str, str2, str3, this.f42698b.m40708c());
            }
        }

        public RunnableC7896b(WebAppInterface webAppInterface, String str, String str2, String str3, String str4) {
            AbstractC19074t.m100208f(str, "action");
            this.f42696t = webAppInterface;
            this.f42692p = str;
            this.f42693q = str2;
            this.f42694r = str3;
            this.f42695s = str4;
        }

        /* renamed from: a */
        public final String m40706a() {
            return this.f42692p;
        }

        /* renamed from: b */
        public final String m40707b() {
            return this.f42694r;
        }

        /* renamed from: c */
        public final String m40708c() {
            return this.f42695s;
        }

        /* renamed from: d */
        public final String m40709d() {
            return this.f42693q;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:2|3)|(7:(11:7|8|9|10|(7:14|15|16|17|(3:19|(1:21)|22)|23|25)|32|16|17|(0)|23|25)|(8:12|14|15|16|17|(0)|23|25)|16|17|(0)|23|25)|35|9|10|32|(1:(0))) */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006f A[Catch: Exception -> 0x0079, TryCatch #1 {Exception -> 0x0079, blocks: (B:17:0x0059, B:19:0x006f, B:21:0x0073, B:22:0x007b, B:23:0x0089), top: B:16:0x0059 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            InterfaceC27218a interfaceC27218a;
            ZaloView zaloView;
            try {
                if (this.f42696t.getUiListener().mo86814xr() != null && this.f42696t.getUiListener().mo86814xr() != null) {
                    InterfaceC27218a mo86814xr = this.f42696t.getUiListener().mo86814xr();
                    AbstractC19074t.m100206d(mo86814xr, "null cannot be cast to non-null type com.zing.zalo.activity.IZaloActivity");
                    interfaceC27218a = mo86814xr;
                    if (this.f42696t.getUiListener().mo86733O9() != null && (this.f42696t.getUiListener().mo86733O9() instanceof ZaloView)) {
                        Object mo86733O9 = this.f42696t.getUiListener().mo86733O9();
                        AbstractC19074t.m100206d(mo86733O9, "null cannot be cast to non-null type com.zing.zalo.zview.ZaloView");
                        zaloView = (ZaloView) mo86733O9;
                        C31877d c31877d = new C31877d(new TrackingSource(260));
                        if (AbstractC19074t.m100204b("action.open.mp", this.f42692p)) {
                            Bundle bundle = c31877d.f146417c;
                            if (bundle == null) {
                                bundle = new Bundle();
                            }
                            bundle.putSerializable("EXTRA_SOURCE_OPEN_MA", this.f42696t.getOpenSourceFromWeb());
                            c31877d.m153185d(bundle);
                        }
                        String str = this.f42692p;
                        String str2 = this.f42693q;
                        AbstractC28207v1.m141979f3(str, 2, interfaceC27218a, zaloView, str2, this.f42696t.createActionCommonResultListener(str, str2, this.f42694r), this.f42694r, new a(this.f42696t, this), c31877d);
                        return;
                    }
                    zaloView = null;
                    C31877d c31877d2 = new C31877d(new TrackingSource(260));
                    if (AbstractC19074t.m100204b("action.open.mp", this.f42692p)) {
                    }
                    String str3 = this.f42692p;
                    String str22 = this.f42693q;
                    AbstractC28207v1.m141979f3(str3, 2, interfaceC27218a, zaloView, str22, this.f42696t.createActionCommonResultListener(str3, str22, this.f42694r), this.f42694r, new a(this.f42696t, this), c31877d2);
                    return;
                }
                if (this.f42696t.getUiListener().mo86733O9() != null) {
                    Object mo86733O92 = this.f42696t.getUiListener().mo86733O9();
                    AbstractC19074t.m100206d(mo86733O92, "null cannot be cast to non-null type com.zing.zalo.zview.ZaloView");
                    zaloView = (ZaloView) mo86733O92;
                    C31877d c31877d22 = new C31877d(new TrackingSource(260));
                    if (AbstractC19074t.m100204b("action.open.mp", this.f42692p)) {
                    }
                    String str32 = this.f42692p;
                    String str222 = this.f42693q;
                    AbstractC28207v1.m141979f3(str32, 2, interfaceC27218a, zaloView, str222, this.f42696t.createActionCommonResultListener(str32, str222, this.f42694r), this.f42694r, new a(this.f42696t, this), c31877d22);
                    return;
                }
                C31877d c31877d222 = new C31877d(new TrackingSource(260));
                if (AbstractC19074t.m100204b("action.open.mp", this.f42692p)) {
                }
                String str322 = this.f42692p;
                String str2222 = this.f42693q;
                AbstractC28207v1.m141979f3(str322, 2, interfaceC27218a, zaloView, str2222, this.f42696t.createActionCommonResultListener(str322, str2222, this.f42694r), this.f42694r, new a(this.f42696t, this), c31877d222);
                return;
            } catch (Exception e11) {
                AbstractC23350e.m122776f(WebAppInterface.Companion.m40705a(), e11);
                return;
            }
            interfaceC27218a = null;
            zaloView = null;
        }
    }

    /* renamed from: com.zing.zalo.control.WebAppInterface$c */
    /* loaded from: classes3.dex */
    public static final class C7897c implements InterfaceC25792a.c {

        /* renamed from: a */
        final /* synthetic */ String f42699a;

        /* renamed from: b */
        final /* synthetic */ String f42700b;

        /* renamed from: c */
        final /* synthetic */ WebAppInterface f42701c;

        /* renamed from: d */
        final /* synthetic */ String f42702d;

        C7897c(String str, String str2, WebAppInterface webAppInterface, String str3) {
            this.f42699a = str;
            this.f42700b = str2;
            this.f42701c = webAppInterface;
            this.f42702d = str3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:105:0x01ca, code lost:            if (r14.getBoolean("isReload") != false) goto L406;     */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:            if (r14.getBoolean("isCache") != false) goto L414;     */
        @Override // p483rh.InterfaceC25792a.c
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo39930a(String str, String str2) {
            Integer num;
            int i11;
            JSONObject jSONObject;
            String str3;
            Map hashMap;
            int i12;
            String str4;
            JSONObject m131571b = AbstractC25384a.m131571b(this.f42699a);
            if (!TextUtils.isEmpty(this.f42700b)) {
                String str5 = this.f42700b;
                if (str5 != null) {
                    boolean z11 = true;
                    String str6 = "";
                    int i13 = 0;
                    switch (str5.hashCode()) {
                        case -2054176710:
                            if (str5.equals("action.zbrowser.mpds")) {
                                try {
                                    this.f42701c.getMListener().mo151051m(new JSONObject(str), this.f42702d);
                                    return;
                                } catch (Exception unused) {
                                    this.f42701c.dispatchResultErrorOnUIThread(-102, "Action data invalid", this.f42702d);
                                    return;
                                }
                            }
                            break;
                        case -1856231627:
                            if (str5.equals("action.open.inapprw")) {
                                this.f42701c.dispatchOpenInappReusedWebviewOnUIThread(str2);
                                return;
                            }
                            break;
                        case -817957719:
                            if (str5.equals("action.change.title.header")) {
                                if (str2 != null) {
                                    this.f42701c.dispatchTitleWebView(str2);
                                }
                                this.f42701c.dispatchResultOnUIThread(str, this.f42702d);
                                return;
                            }
                            break;
                        case -360003850:
                            if (str5.equals("action.webview.set.result")) {
                                this.f42701c.getMListener().mo151018B(str);
                                this.f42701c.dispatchResultOnUIThread(AbstractC28207v1.m141915R0(this.f42700b), this.f42702d);
                                return;
                            }
                            break;
                        case -292076913:
                            if (str5.equals("action.pick.media")) {
                                if (str != null && str.length() != 0) {
                                    if (m131571b != null) {
                                        num = Integer.valueOf(m131571b.optInt("featureFlag"));
                                    } else {
                                        num = null;
                                    }
                                    int m148968c = EnumC30205a.f140320q.m148968c();
                                    if (num != null && num.intValue() == m148968c) {
                                        this.f42701c.getMListener().mo151050l(this.f42700b, str, this.f42702d, EnumC2383a.Companion.m12443a(m131571b.optInt("compressLevel", EnumC2383a.f9954u.m12440c())));
                                        return;
                                    }
                                    String quote = JSONObject.quote(str);
                                    WebAppInterface webAppInterface = this.f42701c;
                                    AbstractC19074t.m100205c(quote);
                                    String substring = quote.substring(1, quote.length() - 1);
                                    AbstractC19074t.m100207e(substring, "substring(...)");
                                    webAppInterface.dispatchResultOnUIThread(substring, this.f42702d);
                                    return;
                                }
                                this.f42701c.dispatchResultOnUIThread(AbstractC28207v1.m141915R0(this.f42700b), this.f42702d);
                                return;
                            }
                            break;
                        case -70284645:
                            if (str5.equals("action.webview.isvisible")) {
                                try {
                                    if (TextUtils.isEmpty(str)) {
                                        JSONObject jSONObject2 = new JSONObject(str2);
                                        if (!TextUtils.isEmpty(str2)) {
                                            jSONObject2.put("isVisible", this.f42701c.dispatchWebViewIsVisible());
                                            this.f42701c.dispatchResultOnUIThread(AbstractC28207v1.m141927U0(this.f42700b, jSONObject2.toString(), "isVisible successful!"), this.f42702d);
                                        } else {
                                            jSONObject2.put("isVisible", false);
                                            this.f42701c.dispatchResultOnUIThread(AbstractC28207v1.m141903O0(-1, "isVisible false", jSONObject2.toString(), this.f42700b), this.f42702d);
                                        }
                                    }
                                    return;
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                    this.f42701c.dispatchResultOnUIThread(AbstractC28207v1.m141903O0(-1, "isVisible false", str2, this.f42700b), this.f42702d);
                                    return;
                                }
                            }
                            break;
                        case 80990294:
                            if (str5.equals("action.iap.isSupported")) {
                                this.f42701c.dispatchCheckIapIsSupported(this.f42700b, this.f42702d);
                                return;
                            }
                            break;
                        case 272623640:
                            if (str5.equals("action.mp.close.loadingview")) {
                                this.f42701c.getMListener().mo151038V();
                                this.f42701c.dispatchResultOnUIThread(AbstractC28207v1.m141915R0(this.f42700b), this.f42702d);
                                return;
                            }
                            break;
                        case 290719370:
                            if (str5.equals("action.prompt.authentication")) {
                                if (new JSONObject(str).optInt("error_code", -1) != 0) {
                                    this.f42701c.dispatchResultOnUIThread(str, this.f42702d);
                                    return;
                                }
                                return;
                            }
                            break;
                        case 660228386:
                            if (str5.equals("action.webview.clearcache")) {
                                if (str2 != null) {
                                    try {
                                        jSONObject = new JSONObject(str2);
                                        if (jSONObject.isNull("featureId")) {
                                            str3 = "";
                                        } else {
                                            str3 = jSONObject.optString("featureId");
                                        }
                                        AbstractC19074t.m100205c(str3);
                                        i11 = Integer.parseInt(str3);
                                    } catch (Exception e12) {
                                        e = e12;
                                    }
                                    try {
                                        if (!jSONObject.isNull("isReload")) {
                                            break;
                                        }
                                        z11 = false;
                                    } catch (Exception e13) {
                                        e = e13;
                                        i13 = i11;
                                        z11 = false;
                                        AbstractC20110a.f98889a.mo104552e(e);
                                        i11 = i13;
                                        this.f42701c.dispatchReloadWebviewOnUIThread(new C18613b(i11), z11, str6);
                                        return;
                                    }
                                    try {
                                        if (!jSONObject.isNull(ZMediaPlayer.OnNativeInvokeListener.ARG_URL)) {
                                            String string = jSONObject.getString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                                            AbstractC19074t.m100207e(string, "getString(...)");
                                            str6 = string;
                                        }
                                    } catch (Exception e14) {
                                        e = e14;
                                        i13 = i11;
                                        AbstractC20110a.f98889a.mo104552e(e);
                                        i11 = i13;
                                        this.f42701c.dispatchReloadWebviewOnUIThread(new C18613b(i11), z11, str6);
                                        return;
                                    }
                                    this.f42701c.dispatchReloadWebviewOnUIThread(new C18613b(i11), z11, str6);
                                    return;
                                }
                                return;
                            }
                            break;
                        case 924959085:
                            if (str5.equals("action.get.supported.actions")) {
                                C18621j mo151064z = this.f42701c.getMListener().mo151064z();
                                if (mo151064z == null || (hashMap = mo151064z.m98411c()) == null) {
                                    hashMap = new HashMap();
                                }
                                JSONArray jSONArray = new JSONArray();
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (AbstractC28207v1.m141992i1((String) entry.getKey())) {
                                        jSONArray.put(entry.getKey());
                                    }
                                }
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("actions", jSONArray);
                                this.f42701c.dispatchResultOnUIThread(AbstractC28207v1.m141919S0("action.get.supported.actions", jSONObject3.toString()), this.f42702d);
                                return;
                            }
                            break;
                        case 1062549601:
                            if (str5.equals("action.jump.login")) {
                                try {
                                    this.f42701c.getMListener().mo151058t(this.f42701c.getUiListener().mo86755a3(), this.f42702d, new JSONObject(str).optBoolean("cache_first"));
                                    return;
                                } catch (Exception unused2) {
                                    this.f42701c.dispatchResultErrorOnUIThread(-101, "Parse action data failed", this.f42702d);
                                    return;
                                }
                            }
                            break;
                        case 1298571685:
                            if (str5.equals("action.iap.requestpayment")) {
                                JSONObject m131571b2 = AbstractC25384a.m131571b(str2);
                                String str7 = this.f42702d;
                                if (str7 != null && m131571b2 != null) {
                                    this.f42701c.dispatchPurchaseFlow(this.f42700b, str7, m131571b2);
                                    return;
                                }
                                return;
                            }
                            break;
                        case 1651444393:
                            if (str5.equals("action.create.options.menu")) {
                                this.f42701c.dispatchWebAppInvalidateOptionsMenuOnUIThread(str2);
                                this.f42701c.dispatchResultOnUIThread(str, this.f42702d);
                                return;
                            }
                            break;
                        case 1690943293:
                            if (str5.equals("action.keep.screen")) {
                                try {
                                    WebAppInterface webAppInterface2 = this.f42701c;
                                    AbstractC19074t.m100205c(str2);
                                    webAppInterface2.dispatchResultKeepScreen(Integer.parseInt(str2));
                                    this.f42701c.dispatchResultOnUIThread(AbstractC28207v1.m141915R0(this.f42700b), this.f42702d);
                                    return;
                                } catch (Exception e15) {
                                    e15.printStackTrace();
                                    this.f42701c.dispatchResultOnUIThread(AbstractC28207v1.m141907P0(this.f42700b), this.f42702d);
                                    return;
                                }
                            }
                            break;
                        case 2073012559:
                            if (str5.equals("action.webview.confirmcache")) {
                                if (!TextUtils.isEmpty(str2)) {
                                    try {
                                        JSONObject jSONObject4 = new JSONObject(str2);
                                        if (jSONObject4.isNull("featureId")) {
                                            str4 = "";
                                        } else {
                                            str4 = jSONObject4.optString("featureId");
                                        }
                                        AbstractC19074t.m100205c(str4);
                                        i12 = Integer.parseInt(str4);
                                        try {
                                            if (!jSONObject4.isNull("isCache")) {
                                                break;
                                            }
                                            z11 = false;
                                        } catch (Exception e16) {
                                            e = e16;
                                            i13 = i12;
                                            z11 = false;
                                            AbstractC20110a.f98889a.mo104552e(e);
                                            i12 = i13;
                                            this.f42701c.dispatchConfirmCacheWebview(new C18613b(i12), str6, z11);
                                            return;
                                        }
                                        try {
                                            if (!jSONObject4.isNull(ZMediaPlayer.OnNativeInvokeListener.ARG_URL)) {
                                                String string2 = jSONObject4.getString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                                                AbstractC19074t.m100207e(string2, "getString(...)");
                                                str6 = string2;
                                            }
                                        } catch (Exception e17) {
                                            e = e17;
                                            i13 = i12;
                                            AbstractC20110a.f98889a.mo104552e(e);
                                            i12 = i13;
                                            this.f42701c.dispatchConfirmCacheWebview(new C18613b(i12), str6, z11);
                                            return;
                                        }
                                    } catch (Exception e18) {
                                        e = e18;
                                    }
                                    this.f42701c.dispatchConfirmCacheWebview(new C18613b(i12), str6, z11);
                                    return;
                                }
                                return;
                            }
                            break;
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    this.f42701c.dispatchResultOnUIThread(str, this.f42702d);
                } else {
                    this.f42701c.dispatchResultOnUIThread(AbstractC28207v1.m141915R0(this.f42700b), this.f42702d);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.control.WebAppInterface$d */
    /* loaded from: classes3.dex */
    public static final class C7898d implements InterfaceC20094a {
        C7898d() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
        }
    }

    /* renamed from: com.zing.zalo.control.WebAppInterface$e */
    /* loaded from: classes3.dex */
    public static final class C7899e extends AbstractC28248z6.f {

        /* renamed from: b */
        final /* synthetic */ String f42704b;

        C7899e(String str) {
            this.f42704b = str;
        }

        /* renamed from: c */
        public static final void m40757c(WebAppInterface webAppInterface, Location location, String str) {
            AbstractC19074t.m100208f(webAppInterface, "this$0");
            AbstractC19074t.m100208f(str, "$callbackFunction");
            try {
                webAppInterface.getMListener().mo151036T(webAppInterface.buildJsonStringGetLocationResult(0, location), str);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // vg.AbstractC28248z6.f
        /* renamed from: a */
        public void mo40758a(final Location location, int i11) {
            AbstractC21954k.a aVar = AbstractC21954k.Companion;
            final WebAppInterface webAppInterface = WebAppInterface.this;
            final String str = this.f42704b;
            aVar.m114607G(new Runnable() { // from class: zh.dd
                @Override // java.lang.Runnable
                public final void run() {
                    WebAppInterface.C7899e.m40757c(WebAppInterface.this, location, str);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.control.WebAppInterface$f */
    /* loaded from: classes3.dex */
    public static final class C7900f implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f42706b;

        /* renamed from: c */
        final /* synthetic */ String f42707c;

        /* renamed from: d */
        final /* synthetic */ String f42708d;

        C7900f(String str, String str2, String str3) {
            this.f42706b = str;
            this.f42707c = str2;
            this.f42708d = str3;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            WebAppInterface.this.dispatchResultErrorOnUIThread(-4, "failed to decode action data", this.f42706b, this.f42707c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str;
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.optInt("error_code", -1) == 0) {
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject == null || (str = optJSONObject.toString()) == null) {
                    str = "{}";
                }
                WebAppInterface.this.handleJavaScripCall(this.f42706b, str, this.f42707c, this.f42708d);
            }
        }
    }

    /* renamed from: com.zing.zalo.control.WebAppInterface$g */
    /* loaded from: classes3.dex */
    public static final class C7901g implements InterfaceC20094a {
        C7901g() {
        }

        /* renamed from: d */
        public static final void m40760d(Object obj, WebAppInterface webAppInterface) {
            AbstractC19074t.m100208f(obj, "$entity");
            AbstractC19074t.m100208f(webAppInterface, "this$0");
            try {
                String string = ((JSONObject) obj).getJSONObject("data").getString("decodedId");
                if (!TextUtils.isEmpty(string)) {
                    AbstractC19074t.m100205c(string);
                    webAppInterface.getUiListener().mo86755a3().startActivity(AbstractC23152n3.m119002J(new C27870vb(string).m140776b()));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            AbstractC23350e.m122774d(WebAppInterface.Companion.m40705a(), "Can not get decodedId!");
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(final Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            AbstractC21954k.a aVar = AbstractC21954k.Companion;
            final WebAppInterface webAppInterface = WebAppInterface.this;
            aVar.m114607G(new Runnable() { // from class: zh.ed
                @Override // java.lang.Runnable
                public final void run() {
                    WebAppInterface.C7901g.m40760d(obj, webAppInterface);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.control.WebAppInterface$h */
    /* loaded from: classes3.dex */
    public static final class C7902h implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f42711b;

        C7902h(String str) {
            this.f42711b = str;
        }

        /* renamed from: d */
        public static final void m40762d(Object obj, WebAppInterface webAppInterface, String str) {
            AbstractC19074t.m100208f(obj, "$entity");
            AbstractC19074t.m100208f(webAppInterface, "this$0");
            AbstractC19074t.m100208f(str, "$callbackFunction");
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (!TextUtils.isEmpty(jSONObject.toString())) {
                    webAppInterface.getMListener().mo151024H(jSONObject.toString(), str);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            AbstractC23350e.m122774d(WebAppInterface.Companion.m40705a(), "Can not get reNewToken!");
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(final Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            AbstractC21954k.a aVar = AbstractC21954k.Companion;
            final WebAppInterface webAppInterface = WebAppInterface.this;
            final String str = this.f42711b;
            aVar.m114607G(new Runnable() { // from class: zh.fd
                @Override // java.lang.Runnable
                public final void run() {
                    WebAppInterface.C7902h.m40762d(obj, webAppInterface, str);
                }
            });
        }
    }

    static {
        String simpleName = WebAppInterface.class.getSimpleName();
        AbstractC19074t.m100207e(simpleName, "getSimpleName(...)");
        TAG = simpleName;
    }

    public WebAppInterface(InterfaceC31085c interfaceC31085c, InterfaceC31084b interfaceC31084b) {
        AbstractC19074t.m100208f(interfaceC31085c, "uiListener");
        AbstractC19074t.m100208f(interfaceC31084b, "mListener");
        this.uiListener = interfaceC31085c;
        this.mListener = interfaceC31084b;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(new ThreadFactoryC18928a("WebAppInterface"));
        AbstractC19074t.m100207e(newCachedThreadPool, "newCachedThreadPool(...)");
        this.mJSExecutor = newCachedThreadPool;
    }

    private final String buildJsonStringAppInstalledResult(List<Boolean> list, int i11) {
        try {
            JSONArray jSONArray = new JSONArray();
            int i12 = 0;
            while (i12 < i11) {
                JSONObject jSONObject = new JSONObject();
                int i13 = i12 + 1;
                jSONObject.put("app_" + i13, list.get(i12));
                jSONArray.put(jSONObject);
                i12 = i13;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("apps", jSONArray);
            String jSONObject3 = jSONObject2.toString();
            AbstractC19074t.m100207e(jSONObject3, "toString(...)");
            return jSONObject3;
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    private final boolean checkCurrentTokenKey(String str) {
        C18621j mo151064z = this.mListener.mo151064z();
        if (mo151064z == null) {
            return false;
        }
        return AbstractC19074t.m100204b(mo151064z.m98410b(), str);
    }

    private final boolean checkPermission(String str) {
        C18623l m98412d;
        Boolean m98421b;
        C18621j mo151064z = this.mListener.mo151064z();
        if (mo151064z == null || (m98412d = mo151064z.m98412d(str)) == null || (m98421b = m98412d.m98421b()) == null) {
            return false;
        }
        return m98421b.booleanValue();
    }

    public final boolean checkValidAction(String str, String str2, String str3) {
        if (needJsToken(str) && !checkCurrentTokenKey(str3)) {
            dispatchResultErrorOnUIThread(-2, "JsToken  is invalid", str, str2);
            return false;
        }
        if (needPermission(str) && !checkPermission(str)) {
            dispatchResultErrorOnUIThread(-3, "Permission is invalid", str, str2);
            return false;
        }
        if (!this.mListener.mo151039a(str) && !this.mListener.mo151028L(str) && !AbstractC28207v1.m141992i1(str)) {
            dispatchResultErrorOnUIThread(-5, "Client is not support", str, str2);
            return false;
        }
        return true;
    }

    public final InterfaceC25792a.c createActionCommonResultListener(String str, String str2, String str3) {
        return new C7897c(str2, str, this, str3);
    }

    public static final void dispatchConfirmCacheWebview$lambda$9(WebAppInterface webAppInterface, C18613b c18613b, String str, boolean z11) {
        AbstractC19074t.m100208f(webAppInterface, "this$0");
        try {
            webAppInterface.mListener.mo151022F(c18613b, str, z11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public static final void dispatchOpenInappReusedWebviewOnUIThread$lambda$11(WebAppInterface webAppInterface, String str) {
        AbstractC19074t.m100208f(webAppInterface, "this$0");
        try {
            webAppInterface.mListener.mo151035S(webAppInterface.uiListener.mo86755a3(), str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public static final void dispatchReloadWebviewOnUIThread$lambda$10(WebAppInterface webAppInterface, C18613b c18613b, boolean z11, String str) {
        AbstractC19074t.m100208f(webAppInterface, "this$0");
        try {
            webAppInterface.mListener.mo151029M(c18613b, z11, str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public static final void dispatchResultKeepScreen$lambda$6(WebAppInterface webAppInterface, int i11) {
        AbstractC19074t.m100208f(webAppInterface, "this$0");
        try {
            InterfaceC31084b interfaceC31084b = webAppInterface.mListener;
            boolean z11 = true;
            if (i11 != 1) {
                z11 = false;
            }
            interfaceC31084b.mo151034R(z11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public static final void dispatchResultOnUIThread$lambda$5(WebAppInterface webAppInterface, String str, String str2) {
        AbstractC19074t.m100208f(webAppInterface, "this$0");
        try {
            webAppInterface.mListener.mo151026J(str, str2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public static final void dispatchTitleWebView$lambda$7(WebAppInterface webAppInterface, String str) {
        AbstractC19074t.m100208f(webAppInterface, "this$0");
        AbstractC19074t.m100208f(str, "$title");
        webAppInterface.mListener.mo151033Q(str);
    }

    public static final void dispatchWebAppInvalidateOptionsMenuOnUIThread$lambda$8(WebAppInterface webAppInterface, String str) {
        AbstractC19074t.m100208f(webAppInterface, "this$0");
        try {
            webAppInterface.mListener.mo151030N(str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public static final void getDeltaTimeFromCreateWebView$lambda$0(WebAppInterface webAppInterface, String str) {
        AbstractC19074t.m100208f(webAppInterface, "this$0");
        webAppInterface.mListener.mo151020D(str);
    }

    public final C18620i getOpenSourceFromWeb() {
        C18620i c18620i = C18620i.f93673P;
        String mo151062x = this.mListener.mo151062x();
        if (mo151062x != null && AbstractC19074t.m100204b(mo151062x, "1604978607252151272")) {
            return C18620i.f93677T;
        }
        return c18620i;
    }

    public final void handleJavaScripCall(String str, String str2, String str3, String str4) {
        if (this.mListener.mo151028L(str)) {
            if (this.mListener.mo151048j(str, str3)) {
                InterfaceC31084b interfaceC31084b = this.mListener;
                if (str2 == null) {
                    str2 = "{}";
                }
                interfaceC31084b.mo151031O(str, new JSONObject(str2), str3);
                return;
            }
            return;
        }
        processJavaScriptCall(str, str2, str3, str4);
    }

    private final boolean needDecode(String str) {
        C18623l m98412d;
        Boolean m98420a;
        C18621j mo151064z = this.mListener.mo151064z();
        if (mo151064z == null || (m98412d = mo151064z.m98412d(str)) == null || (m98420a = m98412d.m98420a()) == null) {
            return false;
        }
        return m98420a.booleanValue();
    }

    private final boolean needJsToken(String str) {
        return this.mListener.mo151040b(str);
    }

    private final boolean needPermission(String str) {
        return needJsToken(str);
    }

    public static final void openNativeShareStickerWindow$lambda$3(WebAppInterface webAppInterface, String str) {
        AbstractC19074t.m100208f(webAppInterface, "this$0");
        AbstractC19074t.m100208f(str, "$cateDetailsInfo");
        try {
            webAppInterface.mListener.mo151057s(str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public static /* synthetic */ void processJavaScriptCall$default(WebAppInterface webAppInterface, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str4 = null;
        }
        webAppInterface.processJavaScriptCall(str, str2, str3, str4);
    }

    public final String buildJsonStringGetLocationResult(int i11, Location location) {
        Double d11;
        Double d12;
        try {
            JSONObject jSONObject = new JSONObject();
            if (i11 == 0) {
                JSONObject jSONObject2 = new JSONObject();
                String str = null;
                if (location != null) {
                    d11 = Double.valueOf(location.getLongitude());
                } else {
                    d11 = null;
                }
                jSONObject2.put("longitude", String.valueOf(d11));
                if (location != null) {
                    d12 = Double.valueOf(location.getLatitude());
                } else {
                    d12 = null;
                }
                jSONObject2.put("latitude", String.valueOf(d12));
                jSONObject2.put("timestamp", String.valueOf(System.currentTimeMillis()));
                if (location != null) {
                    str = location.getProvider();
                }
                jSONObject2.put("provider", str);
                jSONObject.put("error_code", 0);
                jSONObject.put("data", jSONObject2);
                String jSONObject3 = jSONObject.toString();
                AbstractC19074t.m100205c(jSONObject3);
                return jSONObject3;
            }
            jSONObject.put("error_code", -1);
            jSONObject.put("data", new JSONObject());
            String jSONObject4 = jSONObject.toString();
            AbstractC19074t.m100205c(jSONObject4);
            return jSONObject4;
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    @JavascriptInterface
    public final String checkCameraPermission() {
        return this.mListener.mo151052n(this.uiListener.mo86814xr());
    }

    @JavascriptInterface
    public final boolean checkCutouts() {
        return this.mListener.mo151055q(this.uiListener.mo86814xr());
    }

    @JavascriptInterface
    public final void copyLink(String str, String str2, String str3) {
        AbstractC19074t.m100208f(str, "token");
        AbstractC19074t.m100208f(str2, "stickerWebLink");
        AbstractC19074t.m100208f(str3, "callbackFunction");
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("copyLink: token=");
            sb2.append(str);
            sb2.append("; stickerWebLink=");
            sb2.append(str2);
            sb2.append("; callback=");
            sb2.append(str3);
            if (!checkCurrentTokenKey(str)) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("error_code", -2);
                    dispatchResultOnUIThread(jSONObject.toString(), str3);
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            if (!checkPermission(EnumC16799o.ACTION_COPY_LINK_CATE_STICKER)) {
                dispatchResultErrorOnUIThread(-3, "web has no permission", str3);
            } else {
                if (!TextUtils.isEmpty(str2)) {
                    AbstractC16795m.m89712a(this.uiListener.mo86755a3(), str2, "");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("error_code", 0);
                    dispatchResultOnUIThread(jSONObject2.toString(), str3);
                    return;
                }
                throw new IllegalArgumentException("Invalid web link".toString());
            }
        } catch (Exception e12) {
            e12.printStackTrace();
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("error_code", -9);
                dispatchResultOnUIThread(jSONObject3.toString(), str3);
            } catch (Exception e13) {
                AbstractC20110a.f98889a.mo104552e(e13);
            }
        }
    }

    public final void dispatchCheckIapIsSupported(String str, String str2) {
        this.mListener.mo151056r(str, str2);
    }

    public final void dispatchConfirmCacheWebview(final C18613b c18613b, final String str, final boolean z11) {
        AbstractC21954k.Companion.m114607G(new Runnable() { // from class: zh.lc
            @Override // java.lang.Runnable
            public final void run() {
                WebAppInterface.dispatchConfirmCacheWebview$lambda$9(WebAppInterface.this, c18613b, str, z11);
            }
        });
    }

    public final void dispatchOpenInappReusedWebviewOnUIThread(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC21954k.Companion.m114607G(new Runnable() { // from class: zh.oc
            @Override // java.lang.Runnable
            public final void run() {
                WebAppInterface.dispatchOpenInappReusedWebviewOnUIThread$lambda$11(WebAppInterface.this, str);
            }
        });
    }

    public final void dispatchPurchaseFlow(String str, String str2, JSONObject jSONObject) {
        AbstractC19074t.m100208f(str, "action");
        AbstractC19074t.m100208f(str2, "callback");
        AbstractC19074t.m100208f(jSONObject, "data");
        this.mListener.mo151046h(str, str2, jSONObject);
    }

    public final void dispatchReloadWebviewOnUIThread(final C18613b c18613b, final boolean z11, final String str) {
        AbstractC21954k.Companion.m114607G(new Runnable() { // from class: zh.tc
            @Override // java.lang.Runnable
            public final void run() {
                WebAppInterface.dispatchReloadWebviewOnUIThread$lambda$10(WebAppInterface.this, c18613b, z11, str);
            }
        });
    }

    public final void dispatchResultErrorOnUIThread(int i11, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_code", i11);
            if (str == null) {
                str = "";
            }
            jSONObject.put("error_message", str);
            dispatchResultOnUIThread(jSONObject.toString(), str2);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(TAG, e11);
        }
    }

    public final void dispatchResultKeepScreen(final int i11) {
        try {
            AbstractC21954k.Companion.m114607G(new Runnable() { // from class: zh.nc
                @Override // java.lang.Runnable
                public final void run() {
                    WebAppInterface.dispatchResultKeepScreen$lambda$6(WebAppInterface.this, i11);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public final void dispatchResultOnUIThread(final String str, final String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            AbstractC21954k.Companion.m114607G(new Runnable() { // from class: zh.sc
                @Override // java.lang.Runnable
                public final void run() {
                    WebAppInterface.dispatchResultOnUIThread$lambda$5(WebAppInterface.this, str, str2);
                }
            });
        }
    }

    public final void dispatchTitleWebView(final String str) {
        AbstractC19074t.m100208f(str, "title");
        AbstractC21954k.Companion.m114607G(new Runnable() { // from class: zh.qc
            @Override // java.lang.Runnable
            public final void run() {
                WebAppInterface.dispatchTitleWebView$lambda$7(WebAppInterface.this, str);
            }
        });
    }

    public final void dispatchWebAppInvalidateOptionsMenuOnUIThread(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC21954k.Companion.m114607G(new Runnable() { // from class: zh.mc
            @Override // java.lang.Runnable
            public final void run() {
                WebAppInterface.dispatchWebAppInvalidateOptionsMenuOnUIThread$lambda$8(WebAppInterface.this, str);
            }
        });
    }

    public final boolean dispatchWebViewIsVisible() {
        try {
            return this.uiListener.mo86763cB();
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    @JavascriptInterface
    public final void exit(String str) {
        AbstractC19074t.m100208f(str, "currentToken");
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("exit: token=");
            sb2.append(str);
            if (checkCurrentTokenKey(str)) {
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C7898d());
                c0766k.mo1586Z4(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @JavascriptInterface
    public final void getDeltaTimeFromCreateWebView(final String str) {
        AbstractC19444a.m101697e(new Runnable() { // from class: zh.rc
            @Override // java.lang.Runnable
            public final void run() {
                WebAppInterface.getDeltaTimeFromCreateWebView$lambda$0(WebAppInterface.this, str);
            }
        });
    }

    @JavascriptInterface
    public final int getDeviceScreenHeight() {
        return this.mListener.mo151027K();
    }

    public final int getFeatureId() {
        return this.mListener.mo151042d();
    }

    @JavascriptInterface
    public final void getLocation(String str, String str2) {
        AbstractC19074t.m100208f(str, "token");
        AbstractC19074t.m100208f(str2, "callbackFunction");
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getLocation: token=");
            sb2.append(str);
            sb2.append("; callback=");
            sb2.append(str2);
            if (!checkPermission(EnumC16799o.ACTION_GET_LOCATION)) {
                dispatchResultErrorOnUIThread(-3, "web has no permission", str2);
                return;
            }
            if (checkCurrentTokenKey(str)) {
                C7899e c7899e = new C7899e(str2);
                C28239y6 c28239y6 = new C28239y6();
                SensitiveExtraData sensitiveExtraData = new SensitiveExtraData();
                String mo151061w = this.mListener.mo151061w();
                if (mo151061w != null) {
                    sensitiveExtraData.m35535d("domain", mo151061w);
                }
                String mo151062x = this.mListener.mo151062x();
                if (mo151062x != null && mo151062x.length() != 0) {
                    sensitiveExtraData.m35535d("app_id", mo151062x);
                }
                if (!c28239y6.m142225f(this.uiListener.mo86755a3(), c7899e, new SensitiveData("web_location", "web_view", sensitiveExtraData))) {
                    this.mListener.mo151036T(buildJsonStringGetLocationResult(-1, null), str2);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public final InterfaceC31084b getMListener() {
        return this.mListener;
    }

    @JavascriptInterface
    public final int getStatusBarHeight() {
        return this.mListener.mo151032P();
    }

    public final TrackingSource getTrackingSourceOpenProfile(int i11, int i12) {
        try {
            TrackingSource trackingSource = new TrackingSource(i11);
            trackingSource.m40677a("idx", Integer.valueOf(i12));
            return trackingSource;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public final InterfaceC31085c getUiListener() {
        return this.uiListener;
    }

    @JavascriptInterface
    public final void hideKeyboard(String str) {
        try {
            if (checkPermission(EnumC16799o.ACTION_HIDE_KEYBOARD) && checkCurrentTokenKey(str)) {
                this.mListener.mo151019C();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @JavascriptInterface
    public final void hideSubtitleToolbar() {
        this.mListener.mo151045g();
    }

    @JavascriptInterface
    public final void isAppInstalled(String str, String str2, String str3) {
        AbstractC19074t.m100208f(str, "token");
        AbstractC19074t.m100208f(str2, "params");
        AbstractC19074t.m100208f(str3, "callbackFunction");
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("isAppInstalled: token=");
            sb2.append(str);
            sb2.append("; params=");
            sb2.append(str2);
            sb2.append("; callbackfunction=");
            sb2.append(str3);
            if (!checkPermission(EnumC16799o.ACTION_CHECK_APP_INSTALLED)) {
                dispatchResultErrorOnUIThread(-3, "web has no permission", str3);
                return;
            }
            if (checkCurrentTokenKey(str)) {
                ArrayList arrayList = new ArrayList();
                JSONObject jSONObject = new JSONObject(str2);
                int i11 = jSONObject.getInt("totalApp");
                JSONArray jSONArray = jSONObject.getJSONArray("apps");
                int length = jSONArray.length();
                int i12 = 0;
                while (i12 < length) {
                    int i13 = i12 + 1;
                    arrayList.add(i12, Boolean.valueOf(AbstractC23933a.m125288c(jSONArray.getJSONObject(i12).getString("app_" + i13))));
                    i12 = i13;
                }
                this.mListener.mo151023G(buildJsonStringAppInstalledResult(arrayList, i11), str3);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @JavascriptInterface
    public final void jsCall(String str, String str2, String str3, String str4, String str5) {
        AbstractC19074t.m100208f(str2, "action");
        AbstractC20110a.a aVar = AbstractC20110a.f98889a;
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("jsCall: action:%s -- options:%s -- callback:%s -- jsToken:%s -- accessToken:%s", Arrays.copyOf(new Object[]{str2, str4, str5, str, str3}, 5));
        AbstractC19074t.m100207e(format, "format(...)");
        aVar.mo104548a(format, new Object[0]);
        if (!checkValidAction(str2, str5, str)) {
            return;
        }
        if (needDecode(str2)) {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C7900f(str2, str5, str));
            c0766k.mo1484M6(str, str3, str2, str4);
            return;
        }
        handleJavaScripCall(str2, str4, str5, str);
    }

    @JavascriptInterface
    public final void jsH5EventCallback(String str, String str2, String str3) {
        AbstractC19074t.m100208f(str, "eventId");
        AbstractC19074t.m100208f(str2, "eventName");
        this.mListener.mo151017A(str, str2, str3);
    }

    @JavascriptInterface
    public final void jump(String str) {
        this.mListener.mo151035S(this.uiListener.mo86755a3(), str);
    }

    @JavascriptInterface
    public final void openAppStore(String str, String str2) {
        AbstractC19074t.m100208f(str, "token");
        AbstractC19074t.m100208f(str2, "packageName");
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("openAppStore: token=");
            sb2.append(str);
            sb2.append("; packageName=");
            sb2.append(str2);
            if (checkPermission(EnumC16799o.ACTION_OPEN_APP_STORE) && checkCurrentTokenKey(str)) {
                AbstractC23152n3.m119044g0(this.uiListener.mo86755a3(), str2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @JavascriptInterface
    public final void openChatWindow(String str, String str2, int i11, String str3) {
        AbstractC19074t.m100208f(str, "token");
        AbstractC19074t.m100208f(str2, "zaloId_noised");
        AbstractC19074t.m100208f(str3, "appId_noised");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("openChatWindow: token=");
        sb2.append(str);
        sb2.append("; zaloIdNoised=");
        sb2.append(str2);
        sb2.append("; appIdNoised=");
        sb2.append(str3);
        if (checkPermission(EnumC16799o.ACTION_OPEN_CHAT) && checkCurrentTokenKey(str)) {
            try {
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C7901g());
                c0766k.mo1442H4(str2, i11, str3);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @JavascriptInterface
    public final void openLink(String str, String str2) {
        AbstractC19074t.m100208f(str, "token");
        AbstractC19074t.m100208f(str2, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("openLink: token=");
            sb2.append(str);
            sb2.append("; url=");
            sb2.append(str2);
            if (checkPermission(EnumC16799o.ACTION_OPEN_OUT_APP) && checkCurrentTokenKey(str) && !TextUtils.isEmpty(str2)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(268435456);
                intent.setData(Uri.parse(str2));
                this.uiListener.mo86755a3().startActivity(intent);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @JavascriptInterface
    public final void openNativeApp(String str, String str2) {
        AbstractC19074t.m100208f(str, "token");
        AbstractC19074t.m100208f(str2, "packageName");
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("openNativeApp: token=");
            sb2.append(str);
            sb2.append("; packageName=");
            sb2.append(str2);
            if (!checkPermission(EnumC16799o.ACTION_OPEN_APP)) {
                return;
            }
            if (checkCurrentTokenKey(str)) {
                PackageManager packageManager = this.uiListener.mo86755a3().getPackageManager();
                AbstractC19074t.m100207e(packageManager, "getPackageManager(...)");
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str2);
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.addFlags(268435456);
                    this.uiListener.mo86755a3().startActivity(launchIntentForPackage);
                } else {
                    AbstractC23152n3.m119044g0(this.uiListener.mo86755a3(), str2);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @JavascriptInterface
    public final void openNativeShareStickerWindow(String str, final String str2) {
        AbstractC19074t.m100208f(str, "token");
        AbstractC19074t.m100208f(str2, "cateDetailsInfo");
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("openNativeShareStickerWindow: token=");
            sb2.append(str);
            sb2.append("; cateId=");
            sb2.append(str2);
            if (checkCurrentTokenKey(str) && !TextUtils.isEmpty(str2)) {
                if (!checkPermission(EnumC16799o.ACTION_OPEN_SHARE_STICKER)) {
                    return;
                }
                AbstractC21954k.Companion.m114607G(new Runnable() { // from class: zh.pc
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebAppInterface.openNativeShareStickerWindow$lambda$3(WebAppInterface.this, str2);
                    }
                });
                return;
            }
            throw new IllegalArgumentException("Invalid token".toString());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public final void processJavaScriptCall(String str, String str2, String str3, String str4) {
        AbstractC19074t.m100208f(str, "action");
        this.mJSExecutor.execute(new RunnableC7896b(this, str, str2, str3, str4));
    }

    @JavascriptInterface
    public final void reNewToken(String str, String str2) {
        AbstractC19074t.m100208f(str, "currentToken");
        AbstractC19074t.m100208f(str2, "callbackFunction");
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("renewToken: currentToken=");
            sb2.append(str);
            sb2.append("; callback=");
            sb2.append(str2);
            if (checkCurrentTokenKey(str)) {
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C7902h(str2));
                c0766k.mo1499O5(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @JavascriptInterface
    public final void showToast(String str, String str2) {
        AbstractC19074t.m100208f(str, "token");
        AbstractC19074t.m100208f(str2, "msg");
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("showToast: token=");
            sb2.append(str);
            sb2.append("; msg=");
            sb2.append(str2);
            if (checkPermission(EnumC16799o.ACTION_SHOW_TOAST) && checkCurrentTokenKey(str)) {
                ToastUtils.showMess(str2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    private final boolean checkPermission(EnumC16799o enumC16799o) {
        return checkPermission(enumC16799o.m89732c());
    }

    public final void dispatchResultErrorOnUIThread(int i11, String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_code", i11);
            if (str == null) {
                str = "";
            }
            jSONObject.put("error_message", str);
            jSONObject.put("action", str2);
            dispatchResultOnUIThread(jSONObject.toString(), str3);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(TAG, e11);
        }
    }
}
