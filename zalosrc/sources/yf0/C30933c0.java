package yf0;

import ae.C0766k;
import ag0.AbstractC0837p0;
import aj0.C0880c;
import am.AbstractC0924m0;
import am.C0903c0;
import am.C0923m;
import am.C0927o;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.core.content.AbstractC1388a;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import au.AbstractC2373t;
import bv.EnumC3143a;
import bv.EnumC3144b;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.WebAppInterface;
import com.zing.zalo.p077ui.zviews.C15923mx;
import com.zing.zalo.p077ui.zviews.WebBaseView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import im0.AbstractC20626a;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jj0.EnumC21276a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import lf0.C22472b;
import lv.InterfaceC22657e;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mm0.AbstractC23349d;
import on0.AbstractC24341v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p023av.C2385c;
import p023av.EnumC2383a;
import p111du.AbstractC18069a;
import p133ek.AbstractC18458a;
import p140ev.C18613b;
import p140ev.C18614c;
import p140ev.C18615d;
import p140ev.C18617f;
import p140ev.C18619h;
import p140ev.C18620i;
import p140ev.C18623l;
import p140ev.C18624m;
import p140ev.C18625n;
import p170fv.AbstractC19147a;
import p170fv.C19149c;
import p170fv.C19153g;
import p170fv.C19156j;
import p170fv.C19157k;
import p170fv.C19158l;
import p170fv.C19159m;
import p170fv.InterfaceC19148b;
import p189gv.C19602a;
import p189gv.C19603b;
import p189gv.C19604c;
import p189gv.C19605d;
import p189gv.C19606e;
import p189gv.C19607f;
import p189gv.C19608g;
import p189gv.C19609h;
import p218hv.C20132a;
import p278jv.C21367a;
import p278jv.C21368b;
import p278jv.C21369c;
import p278jv.C21371e;
import p278jv.C21372f;
import p278jv.InterfaceC21370d;
import p307kv.AbstractC21954k;
import p454qn.AbstractC25384a;
import p542ub.InterfaceC27218a;
import p693yu.C31083a;
import p693yu.InterfaceC31084b;
import p716zh.C31936gd;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import vg.AbstractC28127m2;
import vg.AbstractC28207v1;
import vg.C28136n2;
import vg.C28145o2;
import vg.C28154p2;
import vm0.AbstractC28298d;
import vu.C28630a;
import wf0.AbstractC28959d;
import wm0.AbstractC29104l;
import x30.C29313h;
import xi0.C29673d;
import yf0.AbstractC30936e;
import yf0.C30933c0;
import yf0.C30939f0;
import zi0.C32216b;
import zi0.C32217c;
import zi0.InterfaceC32215a;

/* renamed from: yf0.c0 */
/* loaded from: classes5.dex */
public final class C30933c0 extends AbstractC1796t0 implements InterfaceC22657e, AbstractC30936e.b {
    public static final c Companion = new c(null);

    /* renamed from: V */
    private static final String f142653V = C30933c0.class.getSimpleName();

    /* renamed from: W */
    private static final long[] f142654W = {3000, 30000};

    /* renamed from: B */
    private final C31083a f142656B;

    /* renamed from: D */
    private final InterfaceC31084b f142658D;

    /* renamed from: E */
    private String f142659E;

    /* renamed from: F */
    private boolean f142660F;

    /* renamed from: G */
    private boolean f142661G;

    /* renamed from: H */
    private boolean f142662H;

    /* renamed from: I */
    private C19609h f142663I;

    /* renamed from: K */
    private final InterfaceC24854k f142665K;

    /* renamed from: L */
    private C30940g f142666L;

    /* renamed from: M */
    private C29673d f142667M;

    /* renamed from: N */
    private final long f142668N;

    /* renamed from: O */
    private boolean f142669O;

    /* renamed from: P */
    private b f142670P;

    /* renamed from: Q */
    private C18620i f142671Q;

    /* renamed from: R */
    private Integer f142672R;

    /* renamed from: S */
    private long f142673S;

    /* renamed from: T */
    private final InterfaceC24854k f142674T;

    /* renamed from: U */
    private boolean f142675U;

    /* renamed from: z */
    private int f142683z;

    /* renamed from: s */
    private final C21371e f142676s = new C21371e(new C21367a(false, false, false, false, false, false, false, false, false, false, false, false, false, null, null, false, 65535, null));

    /* renamed from: t */
    private final C1761c0 f142677t = new C1761c0();

    /* renamed from: u */
    private final C1761c0 f142678u = new C1761c0();

    /* renamed from: v */
    private final C21371e f142679v = new C21371e(new C21368b());

    /* renamed from: w */
    private final C21371e f142680w = new C21371e(new C19158l());

    /* renamed from: x */
    private final C19603b f142681x = new C19603b();

    /* renamed from: y */
    private C18614c f142682y = new C18614c("");

    /* renamed from: A */
    private HashMap f142655A = new HashMap();

    /* renamed from: C */
    private boolean f142657C = true;

    /* renamed from: J */
    private String f142664J = "";

    /* renamed from: yf0.c0$a */
    /* loaded from: classes5.dex */
    public static abstract class a {

        /* renamed from: yf0.c0$a$a */
        /* loaded from: classes5.dex */
        public static final class C33053a extends a {

            /* renamed from: a */
            private final EnumC3144b f142684a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C33053a(EnumC3144b enumC3144b) {
                super(null);
                AbstractC19074t.m100208f(enumC3144b, "startupEvent");
                this.f142684a = enumC3144b;
            }

            /* renamed from: a */
            public final EnumC3144b m150370a() {
                return this.f142684a;
            }
        }

        /* renamed from: yf0.c0$a$a0 */
        /* loaded from: classes5.dex */
        public static final class a0 extends a {

            /* renamed from: a */
            public static final a0 f142685a = new a0();

            private a0() {
                super(null);
            }
        }

        /* renamed from: yf0.c0$a$b */
        /* loaded from: classes5.dex */
        public static final class b extends a {

            /* renamed from: a */
            private final String f142686a;

            public b(String str) {
                super(null);
                this.f142686a = str;
            }

            /* renamed from: a */
            public final String m150371a() {
                return this.f142686a;
            }
        }

        /* renamed from: yf0.c0$a$b0 */
        /* loaded from: classes5.dex */
        public static final class b0 extends a {

            /* renamed from: a */
            public static final b0 f142687a = new b0();

            private b0() {
                super(null);
            }
        }

        /* renamed from: yf0.c0$a$c */
        /* loaded from: classes5.dex */
        public static final class c extends a {

            /* renamed from: a */
            private final String f142688a;

            public c(String str) {
                super(null);
                this.f142688a = str;
            }

            /* renamed from: a */
            public final String m150372a() {
                return this.f142688a;
            }
        }

        /* renamed from: yf0.c0$a$c0 */
        /* loaded from: classes5.dex */
        public static final class c0 extends a {

            /* renamed from: a */
            private final String f142689a;

            /* renamed from: b */
            private final String f142690b;

            /* renamed from: c */
            private final JsResult f142691c;

            public c0(String str, String str2, JsResult jsResult) {
                super(null);
                this.f142689a = str;
                this.f142690b = str2;
                this.f142691c = jsResult;
            }

            /* renamed from: a */
            public final String m150373a() {
                return this.f142690b;
            }

            /* renamed from: b */
            public final JsResult m150374b() {
                return this.f142691c;
            }
        }

        /* renamed from: yf0.c0$a$d */
        /* loaded from: classes5.dex */
        public static final class d extends a {

            /* renamed from: a */
            private final C18625n f142692a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(C18625n c18625n) {
                super(null);
                AbstractC19074t.m100208f(c18625n, "webSettingConfig");
                this.f142692a = c18625n;
            }

            /* renamed from: a */
            public final C18625n m150375a() {
                return this.f142692a;
            }
        }

        /* renamed from: yf0.c0$a$d0 */
        /* loaded from: classes5.dex */
        public static final class d0 extends a {

            /* renamed from: a */
            private final String f142693a;

            /* renamed from: b */
            private final String f142694b;

            /* renamed from: c */
            private final JsResult f142695c;

            public d0(String str, String str2, JsResult jsResult) {
                super(null);
                this.f142693a = str;
                this.f142694b = str2;
                this.f142695c = jsResult;
            }

            /* renamed from: a */
            public final String m150376a() {
                return this.f142694b;
            }

            /* renamed from: b */
            public final JsResult m150377b() {
                return this.f142695c;
            }
        }

        /* renamed from: yf0.c0$a$e */
        /* loaded from: classes5.dex */
        public static final class e extends a {

            /* renamed from: a */
            private final EnumC3143a f142696a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(EnumC3143a enumC3143a) {
                super(null);
                AbstractC19074t.m100208f(enumC3143a, "source");
                this.f142696a = enumC3143a;
            }

            /* renamed from: a */
            public final EnumC3143a m150378a() {
                return this.f142696a;
            }
        }

        /* renamed from: yf0.c0$a$e0 */
        /* loaded from: classes5.dex */
        public static final class e0 extends a {

            /* renamed from: a */
            private final String f142697a;

            /* renamed from: b */
            private final String f142698b;

            /* renamed from: c */
            private final String f142699c;

            /* renamed from: d */
            private final JsPromptResult f142700d;

            public e0(String str, String str2, String str3, JsPromptResult jsPromptResult) {
                super(null);
                this.f142697a = str;
                this.f142698b = str2;
                this.f142699c = str3;
                this.f142700d = jsPromptResult;
            }

            /* renamed from: a */
            public final String m150379a() {
                return this.f142699c;
            }

            /* renamed from: b */
            public final String m150380b() {
                return this.f142698b;
            }

            /* renamed from: c */
            public final JsPromptResult m150381c() {
                return this.f142700d;
            }

            /* renamed from: d */
            public final String m150382d() {
                return this.f142697a;
            }
        }

        /* renamed from: yf0.c0$a$f */
        /* loaded from: classes5.dex */
        public static final class f extends a {

            /* renamed from: a */
            public static final f f142701a = new f();

            private f() {
                super(null);
            }
        }

        /* renamed from: yf0.c0$a$f0 */
        /* loaded from: classes5.dex */
        public static final class f0 extends a {

            /* renamed from: a */
            private final String f142702a;

            public f0(String str) {
                super(null);
                this.f142702a = str;
            }

            /* renamed from: a */
            public final String m150383a() {
                return this.f142702a;
            }
        }

        /* renamed from: yf0.c0$a$g */
        /* loaded from: classes5.dex */
        public static final class g extends a {

            /* renamed from: a */
            private final byte[] f142703a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(byte[] bArr) {
                super(null);
                AbstractC19074t.m100208f(bArr, "script");
                this.f142703a = bArr;
            }

            /* renamed from: a */
            public final byte[] m150384a() {
                return this.f142703a;
            }
        }

        /* renamed from: yf0.c0$a$g0 */
        /* loaded from: classes5.dex */
        public static final class g0 extends a {

            /* renamed from: a */
            private final String f142704a;

            /* renamed from: b */
            private final Bitmap f142705b;

            public g0(String str, Bitmap bitmap) {
                super(null);
                this.f142704a = str;
                this.f142705b = bitmap;
            }

            /* renamed from: a */
            public final Bitmap m150385a() {
                return this.f142705b;
            }

            /* renamed from: b */
            public final String m150386b() {
                return this.f142704a;
            }
        }

        /* renamed from: yf0.c0$a$h */
        /* loaded from: classes5.dex */
        public static final class h extends a {

            /* renamed from: a */
            public static final h f142706a = new h();

            private h() {
                super(null);
            }
        }

        /* renamed from: yf0.c0$a$h0 */
        /* loaded from: classes5.dex */
        public static final class h0 extends a {

            /* renamed from: a */
            private final PermissionRequest f142707a;

            public h0(PermissionRequest permissionRequest) {
                super(null);
                this.f142707a = permissionRequest;
            }

            /* renamed from: a */
            public final PermissionRequest m150387a() {
                return this.f142707a;
            }
        }

        /* renamed from: yf0.c0$a$i */
        /* loaded from: classes5.dex */
        public static final class i extends a {

            /* renamed from: a */
            private final String f142708a;

            /* renamed from: b */
            private final String f142709b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(String str, String str2) {
                super(null);
                AbstractC19074t.m100208f(str, "extUrl");
                AbstractC19074t.m100208f(str2, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                this.f142708a = str;
                this.f142709b = str2;
            }

            /* renamed from: a */
            public final String m150388a() {
                return this.f142708a;
            }

            /* renamed from: b */
            public final String m150389b() {
                return this.f142709b;
            }
        }

        /* renamed from: yf0.c0$a$i0 */
        /* loaded from: classes5.dex */
        public static final class i0 extends a {

            /* renamed from: a */
            private final int f142710a;

            /* renamed from: b */
            private final String f142711b;

            /* renamed from: c */
            private final String f142712c;

            public i0(int i11, String str, String str2) {
                super(null);
                this.f142710a = i11;
                this.f142711b = str;
                this.f142712c = str2;
            }

            /* renamed from: a */
            public final String m150390a() {
                return this.f142711b;
            }

            /* renamed from: b */
            public final int m150391b() {
                return this.f142710a;
            }

            /* renamed from: c */
            public final String m150392c() {
                return this.f142712c;
            }
        }

        /* renamed from: yf0.c0$a$j */
        /* loaded from: classes5.dex */
        public static final class j extends a {

            /* renamed from: a */
            private final String f142713a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(String str) {
                super(null);
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                this.f142713a = str;
            }

            /* renamed from: a */
            public final String m150393a() {
                return this.f142713a;
            }
        }

        /* renamed from: yf0.c0$a$j0 */
        /* loaded from: classes5.dex */
        public static final class j0 extends a {

            /* renamed from: a */
            private final HttpAuthHandler f142714a;

            /* renamed from: b */
            private final String f142715b;

            /* renamed from: c */
            private final String f142716c;

            public j0(HttpAuthHandler httpAuthHandler, String str, String str2) {
                super(null);
                this.f142714a = httpAuthHandler;
                this.f142715b = str;
                this.f142716c = str2;
            }

            /* renamed from: a */
            public final HttpAuthHandler m150394a() {
                return this.f142714a;
            }

            /* renamed from: b */
            public final String m150395b() {
                return this.f142715b;
            }

            /* renamed from: c */
            public final String m150396c() {
                return this.f142716c;
            }
        }

        /* renamed from: yf0.c0$a$k */
        /* loaded from: classes5.dex */
        public static final class k extends a {

            /* renamed from: a */
            private final String f142717a;

            public k(String str) {
                super(null);
                this.f142717a = str;
            }

            /* renamed from: a */
            public final String m150397a() {
                return this.f142717a;
            }
        }

        /* renamed from: yf0.c0$a$k0 */
        /* loaded from: classes5.dex */
        public static final class k0 extends a {

            /* renamed from: a */
            public static final k0 f142718a = new k0();

            private k0() {
                super(null);
            }
        }

        /* renamed from: yf0.c0$a$l */
        /* loaded from: classes5.dex */
        public static final class l extends a {

            /* renamed from: a */
            private final String f142719a;

            /* renamed from: b */
            private final boolean f142720b;

            public l(String str, boolean z11) {
                super(null);
                this.f142719a = str;
                this.f142720b = z11;
            }

            /* renamed from: a */
            public final String m150398a() {
                return this.f142719a;
            }

            /* renamed from: b */
            public final boolean m150399b() {
                return this.f142720b;
            }
        }

        /* renamed from: yf0.c0$a$l0 */
        /* loaded from: classes5.dex */
        public static final class l0 extends a {

            /* renamed from: a */
            private final View f142721a;

            /* renamed from: b */
            private final int f142722b;

            /* renamed from: c */
            private final WebChromeClient.CustomViewCallback f142723c;

            public l0(View view, int i11, WebChromeClient.CustomViewCallback customViewCallback) {
                super(null);
                this.f142721a = view;
                this.f142722b = i11;
                this.f142723c = customViewCallback;
            }

            /* renamed from: a */
            public final WebChromeClient.CustomViewCallback m150400a() {
                return this.f142723c;
            }

            /* renamed from: b */
            public final int m150401b() {
                return this.f142722b;
            }

            /* renamed from: c */
            public final View m150402c() {
                return this.f142721a;
            }
        }

        /* renamed from: yf0.c0$a$m */
        /* loaded from: classes5.dex */
        public static final class m extends a {

            /* renamed from: a */
            public static final m f142724a = new m();

            private m() {
                super(null);
            }
        }

        /* renamed from: yf0.c0$a$m0 */
        /* loaded from: classes5.dex */
        public static final class m0 extends a {

            /* renamed from: a */
            private final boolean f142725a;

            /* renamed from: b */
            private final long f142726b;

            public m0(boolean z11, long j11) {
                super(null);
                this.f142725a = z11;
                this.f142726b = j11;
            }

            /* renamed from: a */
            public final boolean m150403a() {
                return this.f142725a;
            }

            /* renamed from: b */
            public final long m150404b() {
                return this.f142726b;
            }
        }

        /* renamed from: yf0.c0$a$n */
        /* loaded from: classes5.dex */
        public static final class n extends a {

            /* renamed from: a */
            private final String f142727a;

            /* renamed from: b */
            private final String f142728b;

            /* renamed from: c */
            private final int f142729c;

            /* renamed from: d */
            private final String f142730d;

            /* renamed from: e */
            private final String f142731e;

            /* renamed from: f */
            private final String f142732f;

            public n(String str, String str2, int i11, String str3, String str4, String str5) {
                super(null);
                this.f142727a = str;
                this.f142728b = str2;
                this.f142729c = i11;
                this.f142730d = str3;
                this.f142731e = str4;
                this.f142732f = str5;
            }

            /* renamed from: a */
            public final String m150405a() {
                return this.f142730d;
            }

            /* renamed from: b */
            public final String m150406b() {
                return this.f142731e;
            }

            /* renamed from: c */
            public final String m150407c() {
                return this.f142728b;
            }

            /* renamed from: d */
            public final String m150408d() {
                return this.f142732f;
            }

            /* renamed from: e */
            public final int m150409e() {
                return this.f142729c;
            }

            /* renamed from: f */
            public final String m150410f() {
                return this.f142727a;
            }
        }

        /* renamed from: yf0.c0$a$n0 */
        /* loaded from: classes5.dex */
        public static final class n0 extends a {

            /* renamed from: a */
            private final SslErrorHandler f142733a;

            /* renamed from: b */
            private final SslError f142734b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n0(SslErrorHandler sslErrorHandler, SslError sslError) {
                super(null);
                AbstractC19074t.m100208f(sslErrorHandler, "handler");
                AbstractC19074t.m100208f(sslError, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
                this.f142733a = sslErrorHandler;
                this.f142734b = sslError;
            }

            /* renamed from: a */
            public final SslError m150411a() {
                return this.f142734b;
            }

            /* renamed from: b */
            public final SslErrorHandler m150412b() {
                return this.f142733a;
            }
        }

        /* renamed from: yf0.c0$a$o */
        /* loaded from: classes5.dex */
        public static final class o extends a {

            /* renamed from: a */
            public static final o f142735a = new o();

            private o() {
                super(null);
            }
        }

        /* renamed from: yf0.c0$a$o0 */
        /* loaded from: classes5.dex */
        public static final class o0 extends a {

            /* renamed from: a */
            private final C18613b f142736a;

            /* renamed from: b */
            private final boolean f142737b;

            /* renamed from: c */
            private final String f142738c;

            public o0(C18613b c18613b, boolean z11, String str) {
                super(null);
                this.f142736a = c18613b;
                this.f142737b = z11;
                this.f142738c = str;
            }
        }

        /* renamed from: yf0.c0$a$p */
        /* loaded from: classes5.dex */
        public static final class p extends a {

            /* renamed from: a */
            private final List f142739a;

            /* renamed from: b */
            private final int f142740b;

            /* renamed from: c */
            private final int f142741c;

            /* renamed from: d */
            private final String f142742d;

            /* renamed from: e */
            private final String f142743e;

            /* renamed from: f */
            private final String f142744f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public p(List list, int i11, int i12, String str, String str2, String str3) {
                super(null);
                AbstractC19074t.m100208f(list, "filePath");
                this.f142739a = list;
                this.f142740b = i11;
                this.f142741c = i12;
                this.f142742d = str;
                this.f142743e = str2;
                this.f142744f = str3;
            }

            /* renamed from: a */
            public final String m150413a() {
                return this.f142742d;
            }

            /* renamed from: b */
            public final String m150414b() {
                return this.f142743e;
            }

            /* renamed from: c */
            public final List m150415c() {
                return this.f142739a;
            }

            /* renamed from: d */
            public final int m150416d() {
                return this.f142740b;
            }

            /* renamed from: e */
            public final int m150417e() {
                return this.f142741c;
            }
        }

        /* renamed from: yf0.c0$a$p0 */
        /* loaded from: classes5.dex */
        public static final class p0 extends a {

            /* renamed from: a */
            private final String f142745a;

            /* renamed from: b */
            private final JSONObject f142746b;

            /* renamed from: c */
            private final String f142747c;

            public p0(String str, JSONObject jSONObject, String str2) {
                super(null);
                this.f142745a = str;
                this.f142746b = jSONObject;
                this.f142747c = str2;
            }

            /* renamed from: a */
            public final String m150418a() {
                return this.f142745a;
            }

            /* renamed from: b */
            public final String m150419b() {
                return this.f142747c;
            }

            /* renamed from: c */
            public final JSONObject m150420c() {
                return this.f142746b;
            }
        }

        /* renamed from: yf0.c0$a$q */
        /* loaded from: classes5.dex */
        public static final class q extends a {

            /* renamed from: a */
            private final String f142748a;

            public q(String str) {
                super(null);
                this.f142748a = str;
            }

            /* renamed from: a */
            public final String m150421a() {
                return this.f142748a;
            }
        }

        /* renamed from: yf0.c0$a$q0 */
        /* loaded from: classes5.dex */
        public static final class q0 extends a {

            /* renamed from: a */
            private final String[] f142749a;

            /* renamed from: b */
            private final String f142750b;

            /* renamed from: c */
            private final GeolocationPermissions.Callback f142751c;

            public q0(String[] strArr, String str, GeolocationPermissions.Callback callback) {
                super(null);
                this.f142749a = strArr;
                this.f142750b = str;
                this.f142751c = callback;
            }

            /* renamed from: a */
            public final GeolocationPermissions.Callback m150422a() {
                return this.f142751c;
            }

            /* renamed from: b */
            public final String m150423b() {
                return this.f142750b;
            }

            /* renamed from: c */
            public final String[] m150424c() {
                return this.f142749a;
            }
        }

        /* renamed from: yf0.c0$a$r */
        /* loaded from: classes5.dex */
        public static final class r extends a {

            /* renamed from: a */
            private final String f142752a;

            public r(String str) {
                super(null);
                this.f142752a = str;
            }

            /* renamed from: a */
            public final String m150425a() {
                return this.f142752a;
            }
        }

        /* renamed from: yf0.c0$a$r0 */
        /* loaded from: classes5.dex */
        public static final class r0 extends a {

            /* renamed from: a */
            public static final r0 f142753a = new r0();

            private r0() {
                super(null);
            }
        }

        /* renamed from: yf0.c0$a$s */
        /* loaded from: classes5.dex */
        public static final class s extends a {

            /* renamed from: a */
            private final int f142754a;

            /* renamed from: b */
            private final String f142755b;

            /* renamed from: c */
            private final String f142756c;

            /* renamed from: d */
            private final String f142757d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public s(int i11, String str, String str2, String str3) {
                super(null);
                AbstractC19074t.m100208f(str, "androidInfo");
                AbstractC19074t.m100208f(str2, "extUrl");
                AbstractC19074t.m100208f(str3, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                this.f142754a = i11;
                this.f142755b = str;
                this.f142756c = str2;
                this.f142757d = str3;
            }

            /* renamed from: a */
            public final String m150426a() {
                return this.f142755b;
            }

            /* renamed from: b */
            public final String m150427b() {
                return this.f142756c;
            }

            /* renamed from: c */
            public final int m150428c() {
                return this.f142754a;
            }

            /* renamed from: d */
            public final String m150429d() {
                return this.f142757d;
            }
        }

        /* renamed from: yf0.c0$a$s0 */
        /* loaded from: classes5.dex */
        public static final class s0 extends a {

            /* renamed from: a */
            private final MultiStateView.EnumC15914e f142758a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public s0(MultiStateView.EnumC15914e enumC15914e) {
                super(null);
                AbstractC19074t.m100208f(enumC15914e, "state");
                this.f142758a = enumC15914e;
            }

            /* renamed from: a */
            public final MultiStateView.EnumC15914e m150430a() {
                return this.f142758a;
            }
        }

        /* renamed from: yf0.c0$a$t */
        /* loaded from: classes5.dex */
        public static final class t extends a {

            /* renamed from: a */
            public static final t f142759a = new t();

            private t() {
                super(null);
            }
        }

        /* renamed from: yf0.c0$a$t0 */
        /* loaded from: classes5.dex */
        public static final class t0 extends a {

            /* renamed from: a */
            private final String f142760a;

            public t0(String str) {
                super(null);
                this.f142760a = str;
            }

            /* renamed from: a */
            public final String m150431a() {
                return this.f142760a;
            }
        }

        /* renamed from: yf0.c0$a$u */
        /* loaded from: classes5.dex */
        public static final class u extends a {

            /* renamed from: a */
            public static final u f142761a = new u();

            private u() {
                super(null);
            }
        }

        /* renamed from: yf0.c0$a$u0 */
        /* loaded from: classes5.dex */
        public static final class u0 extends a {

            /* renamed from: a */
            private final String f142762a;

            /* renamed from: b */
            private final JSONObject f142763b;

            /* renamed from: c */
            private final String f142764c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public u0(String str, JSONObject jSONObject, String str2) {
                super(null);
                AbstractC19074t.m100208f(str, "action");
                AbstractC19074t.m100208f(jSONObject, "options");
                this.f142762a = str;
                this.f142763b = jSONObject;
                this.f142764c = str2;
            }

            /* renamed from: a */
            public final String m150432a() {
                return this.f142762a;
            }

            /* renamed from: b */
            public final String m150433b() {
                return this.f142764c;
            }

            /* renamed from: c */
            public final JSONObject m150434c() {
                return this.f142763b;
            }
        }

        /* renamed from: yf0.c0$a$v */
        /* loaded from: classes5.dex */
        public static final class v extends a {

            /* renamed from: a */
            private final boolean f142765a;

            public v(boolean z11) {
                super(null);
                this.f142765a = z11;
            }

            /* renamed from: a */
            public final boolean m150435a() {
                return this.f142765a;
            }
        }

        /* renamed from: yf0.c0$a$v0 */
        /* loaded from: classes5.dex */
        public static final class v0 extends a {

            /* renamed from: a */
            private final int f142766a;

            /* renamed from: b */
            private final C15923mx f142767b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public v0(int i11, C15923mx c15923mx) {
                super(null);
                AbstractC19074t.m100208f(c15923mx, "miniAppAwarenessData");
                this.f142766a = i11;
                this.f142767b = c15923mx;
            }

            /* renamed from: a */
            public final C15923mx m150436a() {
                return this.f142767b;
            }

            /* renamed from: b */
            public final int m150437b() {
                return this.f142766a;
            }
        }

        /* renamed from: yf0.c0$a$w */
        /* loaded from: classes5.dex */
        public static final class w extends a {

            /* renamed from: a */
            private final C29673d f142768a;

            /* renamed from: b */
            private final String f142769b;

            /* renamed from: c */
            private final String f142770c;

            /* renamed from: d */
            private final JSONObject f142771d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public w(C29673d c29673d, String str, String str2, JSONObject jSONObject) {
                super(null);
                AbstractC19074t.m100208f(c29673d, "billingManager");
                AbstractC19074t.m100208f(str, "action");
                AbstractC19074t.m100208f(str2, "callback");
                AbstractC19074t.m100208f(jSONObject, "data");
                this.f142768a = c29673d;
                this.f142769b = str;
                this.f142770c = str2;
                this.f142771d = jSONObject;
            }

            /* renamed from: a */
            public final C29673d m150438a() {
                return this.f142768a;
            }

            /* renamed from: b */
            public final String m150439b() {
                return this.f142770c;
            }

            /* renamed from: c */
            public final JSONObject m150440c() {
                return this.f142771d;
            }
        }

        /* renamed from: yf0.c0$a$w0 */
        /* loaded from: classes5.dex */
        public static final class w0 extends a {

            /* renamed from: a */
            private final boolean f142772a;

            public w0(boolean z11) {
                super(null);
                this.f142772a = z11;
            }

            /* renamed from: a */
            public final boolean m150441a() {
                return this.f142772a;
            }
        }

        /* renamed from: yf0.c0$a$x */
        /* loaded from: classes5.dex */
        public static final class x extends a {

            /* renamed from: a */
            private final String f142773a;

            /* renamed from: b */
            private final String f142774b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public x(String str, String str2) {
                super(null);
                AbstractC19074t.m100208f(str, "result");
                this.f142773a = str;
                this.f142774b = str2;
            }

            /* renamed from: a */
            public final String m150442a() {
                return this.f142774b;
            }

            /* renamed from: b */
            public final String m150443b() {
                return this.f142773a;
            }
        }

        /* renamed from: yf0.c0$a$x0 */
        /* loaded from: classes5.dex */
        public static final class x0 extends a {

            /* renamed from: a */
            private final C19609h f142775a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public x0(C19609h c19609h) {
                super(null);
                AbstractC19074t.m100208f(c19609h, "info");
                this.f142775a = c19609h;
            }

            /* renamed from: a */
            public final C19609h m150444a() {
                return this.f142775a;
            }
        }

        /* renamed from: yf0.c0$a$y */
        /* loaded from: classes5.dex */
        public static final class y extends a {

            /* renamed from: a */
            private final String f142776a;

            /* renamed from: b */
            private final String f142777b;

            /* renamed from: c */
            private final String f142778c;

            /* renamed from: d */
            private final String f142779d;

            /* renamed from: e */
            private final String f142780e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public y(String str, String str2, String str3, String str4, String str5) {
                super(null);
                AbstractC19074t.m100208f(str, "baseUrl");
                AbstractC19074t.m100208f(str2, "data");
                AbstractC19074t.m100208f(str3, "mimeType");
                AbstractC19074t.m100208f(str4, "encoding");
                AbstractC19074t.m100208f(str5, "historyUrl");
                this.f142776a = str;
                this.f142777b = str2;
                this.f142778c = str3;
                this.f142779d = str4;
                this.f142780e = str5;
            }

            /* renamed from: a */
            public final String m150445a() {
                return this.f142776a;
            }

            /* renamed from: b */
            public final String m150446b() {
                return this.f142777b;
            }

            /* renamed from: c */
            public final String m150447c() {
                return this.f142779d;
            }

            /* renamed from: d */
            public final String m150448d() {
                return this.f142780e;
            }

            /* renamed from: e */
            public final String m150449e() {
                return this.f142778c;
            }
        }

        /* renamed from: yf0.c0$a$z */
        /* loaded from: classes5.dex */
        public static final class z extends a {

            /* renamed from: a */
            private final String f142781a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public z(String str) {
                super(null);
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                this.f142781a = str;
            }

            /* renamed from: a */
            public final String m150450a() {
                return this.f142781a;
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: yf0.c0$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        void mo86844a(a aVar);
    }

    /* renamed from: yf0.c0$c */
    /* loaded from: classes5.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: yf0.c0$d */
    /* loaded from: classes5.dex */
    public /* synthetic */ class d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f142782a;

        static {
            int[] iArr = new int[EnumC21276a.values().length];
            try {
                iArr[EnumC21276a.DEVICE_SUPPORTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC21276a.DEVICE_UNSUPPORTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f142782a = iArr;
        }
    }

    /* renamed from: yf0.c0$e */
    /* loaded from: classes5.dex */
    public static final class e implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ boolean f142784b;

        e(boolean z11) {
            this.f142784b = z11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            int i11;
            AbstractC20110a.f98889a.mo104551d(String.valueOf(c20096c), new Object[0]);
            if (this.f142784b) {
                i11 = AbstractC8020f0.str_mini_app_cannot_add_to_favorite;
            } else {
                i11 = AbstractC8020f0.str_mini_app_cannot_remove_from_favorite;
            }
            ToastUtils.m89268p(AbstractC23136l9.m118743r0(i11));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            try {
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.has("error_code") && jSONObject.getInt("error_code") == 0) {
                    C30933c0.this.m150317Y0().mo9221n(Boolean.valueOf(this.f142784b));
                    C30933c0.this.m150315X1(new a.w0(this.f142784b));
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104551d(e11.toString(), new Object[0]);
                if (this.f142784b) {
                    i11 = AbstractC8020f0.str_mini_app_cannot_add_to_favorite;
                } else {
                    i11 = AbstractC8020f0.str_mini_app_cannot_remove_from_favorite;
                }
                ToastUtils.m89268p(AbstractC23136l9.m118743r0(i11));
            }
        }
    }

    /* renamed from: yf0.c0$f */
    /* loaded from: classes5.dex */
    public static final class f implements InterfaceC20094a {
        f() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC20110a.f98889a.mo104551d(String.valueOf(c20096c), new Object[0]);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            boolean z11;
            try {
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.has("error_code")) {
                    i11 = jSONObject.getInt("error_code");
                } else {
                    i11 = -1;
                }
                C1761c0 m150317Y0 = C30933c0.this.m150317Y0();
                if (i11 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                m150317Y0.mo9221n(Boolean.valueOf(z11));
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104551d(e11.toString(), new Object[0]);
            }
        }
    }

    /* renamed from: yf0.c0$g */
    /* loaded from: classes5.dex */
    public static final class g implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f142787b;

        g(String str) {
            this.f142787b = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            C30933c0.this.m150259W1(124207);
            C30933c0 c30933c0 = C30933c0.this;
            String m141899N0 = AbstractC28207v1.m141899N0(c20096c.m104491c(), c20096c.m104492d(), "action.prompt.authentication");
            AbstractC19074t.m100207e(m141899N0, "genJsonErrorSpecific(...)");
            c30933c0.m150315X1(new a.x(m141899N0, this.f142787b));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            C30933c0.this.m150259W1(124208);
            C30933c0 c30933c0 = C30933c0.this;
            String m141919S0 = AbstractC28207v1.m141919S0("action.prompt.authentication", ((JSONObject) obj).toString());
            AbstractC19074t.m100207e(m141919S0, "genJsonSuccess(...)");
            c30933c0.m150315X1(new a.x(m141919S0, this.f142787b));
        }
    }

    /* renamed from: yf0.c0$h */
    /* loaded from: classes5.dex */
    public static final class h implements InterfaceC20094a {
        h() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC20110a.f98889a.mo104551d(String.valueOf(c20096c), new Object[0]);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.has("error_code") && jSONObject.getInt("error_code") == 0 && jSONObject.has("data")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
                C30933c0.this.m150283E0().m102583d(new C19603b(jSONObject2).m102580a());
            }
        }
    }

    /* renamed from: yf0.c0$i */
    /* loaded from: classes5.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final i f142789q = new i();

        i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final InterfaceC32215a mo12V4() {
            C32217c c32217c = C32217c.f148612a;
            c32217c.m155342c();
            return c32217c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yf0.c0$j */
    /* loaded from: classes5.dex */
    public static final class j extends AbstractC19075u implements InterfaceC18494a {
        j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C22472b mo12V4() {
            return new C22472b(MainApplication.Companion.m35500c(), C30933c0.this, new C2385c(), C30933c0.this.m150291J0());
        }
    }

    /* renamed from: yf0.c0$k */
    /* loaded from: classes5.dex */
    public static final class k implements C31083a.b {
        k() {
        }

        @Override // p693yu.C31083a.b
        /* renamed from: a */
        public void mo81394a() {
            C30933c0.this.m150315X1(new a.e(EnumC3143a.f13270w));
            C30933c0.this.m150315X1(a.h.f142706a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yf0.c0$l */
    /* loaded from: classes5.dex */
    public static final class l extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f142792t;

        /* renamed from: v */
        final /* synthetic */ C0880c f142794v;

        /* renamed from: w */
        final /* synthetic */ boolean f142795w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(C0880c c0880c, boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f142794v = c0880c;
            this.f142795w = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new l(this.f142794v, this.f142795w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f142792t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C29673d c29673d = C30933c0.this.f142667M;
                C0880c c0880c = this.f142794v;
                boolean z11 = this.f142795w;
                this.f142792t = 1;
                if (c29673d.m147575t0(c0880c, z11, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: yf0.c0$m */
    /* loaded from: classes5.dex */
    public static final class m implements InterfaceC30942h {
        m() {
        }

        @Override // yf0.InterfaceC30942h
        /* renamed from: a */
        public void mo150454a(String str, String str2) {
            AbstractC19074t.m100208f(str, "data");
            C30933c0.this.m150315X1(new a.x(str, str2));
        }

        @Override // yf0.InterfaceC30942h
        /* renamed from: b */
        public String mo150455b() {
            String m102616j;
            C19609h m150291J0 = C30933c0.this.m150291J0();
            if (m150291J0 == null || (m102616j = m150291J0.m102616j()) == null) {
                return "";
            }
            return m102616j;
        }
    }

    /* renamed from: yf0.c0$n */
    /* loaded from: classes5.dex */
    public static final class n extends AbstractC30932c {

        /* renamed from: b */
        final /* synthetic */ String f142798b;

        /* renamed from: c */
        final /* synthetic */ boolean f142799c;

        /* renamed from: d */
        final /* synthetic */ Context f142800d;

        n(String str, boolean z11, Context context) {
            this.f142798b = str;
            this.f142799c = z11;
            this.f142800d = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0060 A[Catch: Exception -> 0x0084, TryCatch #0 {Exception -> 0x0084, blocks: (B:3:0x0005, B:5:0x001f, B:7:0x002f, B:8:0x0046, B:10:0x004f, B:14:0x0059, B:16:0x0060, B:17:0x0074, B:19:0x0078, B:21:0x0080, B:28:0x0034), top: B:2:0x0005 }] */
        @Override // lv.InterfaceC22656d
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo117236a(JSONObject jSONObject) {
            JSONObject jSONObject2;
            boolean z11;
            String str;
            C18617f m98397a;
            AbstractC19074t.m100208f(jSONObject, "data");
            try {
                C30933c0.this.m150315X1(new a.s0(MultiStateView.EnumC15914e.CONTENT));
                if (AbstractC19074t.m100204b(C30933c0.this.m150361v0(), C18613b.f93604w) && C30933c0.this.m150363w0().m98356g().length() > 0) {
                    jSONObject2 = jSONObject.getJSONObject("data");
                } else {
                    jSONObject2 = jSONObject.getJSONObject(String.valueOf(C30933c0.this.m150363w0().m98357h()));
                }
                C30933c0 c30933c0 = C30933c0.this;
                AbstractC19074t.m100205c(jSONObject2);
                String str2 = this.f142798b;
                if (str2 != null && str2.length() != 0) {
                    z11 = true;
                    c30933c0.m150268h1(jSONObject2, z11);
                    str = this.f142798b;
                    if (str != null) {
                        C30933c0 c30933c02 = C30933c0.this;
                        String m141919S0 = AbstractC28207v1.m141919S0("action.jump.login", jSONObject2.toString());
                        AbstractC19074t.m100207e(m141919S0, "genJsonSuccess(...)");
                        c30933c02.m150338k0(str, m141919S0);
                    }
                    if (!this.f142799c && (m98397a = C18617f.Companion.m98397a()) != null) {
                        m98397a.m98388k();
                        return;
                    }
                }
                z11 = false;
                c30933c0.m150268h1(jSONObject2, z11);
                str = this.f142798b;
                if (str != null) {
                }
                if (!this.f142799c) {
                }
            } catch (Exception unused) {
                mo117237b(new C20096c(-1, "JumpFailed - Parse data jump"));
            }
        }

        @Override // yf0.AbstractC30932c, lv.InterfaceC22656d
        /* renamed from: b */
        public void mo117237b(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                if (this.f142799c) {
                    JSONObject m150235c = C30930b.Companion.m150239a().m150235c(this.f142800d, C30933c0.this.m150363w0().m98361l(), C30933c0.this.m150363w0().m98360k());
                    if (m150235c != null) {
                        m150235c.put("isCached", 1);
                        C30933c0 c30933c0 = C30933c0.this;
                        String str = this.f142798b;
                        AbstractC19074t.m100205c(str);
                        String m141919S0 = AbstractC28207v1.m141919S0("action.jump.login", m150235c.toString());
                        AbstractC19074t.m100207e(m141919S0, "genJsonSuccess(...)");
                        c30933c0.m150338k0(str, m141919S0);
                    } else {
                        C30933c0 c30933c02 = C30933c0.this;
                        String str2 = this.f142798b;
                        AbstractC19074t.m100205c(str2);
                        String m141899N0 = AbstractC28207v1.m141899N0(-102, "Not found data jump in cache and sever", "action.jump.login");
                        AbstractC19074t.m100207e(m141899N0, "genJsonErrorSpecific(...)");
                        c30933c02.m150338k0(str2, m141899N0);
                    }
                    C18617f m98397a = C18617f.Companion.m98397a();
                    if (m98397a != null) {
                        m98397a.m98388k();
                        return;
                    }
                    return;
                }
                C30933c0.this.m150367y0().mo9221n(new C21369c(false, 0, true, 0, 8, null));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yf0.c0$o */
    /* loaded from: classes5.dex */
    public static final class o extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: yf0.c0$o$a */
        /* loaded from: classes5.dex */
        public static final class a implements C29313h.a {

            /* renamed from: a */
            final /* synthetic */ C30933c0 f142802a;

            a(C30933c0 c30933c0) {
                this.f142802a = c30933c0;
            }

            @Override // x30.C29313h.a
            /* renamed from: a */
            public void mo146454a(String str) {
                AbstractC19074t.m100208f(str, "info");
                AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                String str2 = C30933c0.f142653V;
                AbstractC19074t.m100207e(str2, "access$getTAG$cp(...)");
                aVar.m104564x(str2).mo104548a("WebAdsRequestListener.onReceiveInfo: " + str, new Object[0]);
                this.f142802a.m150315X1(new a.z(str));
            }

            @Override // x30.C29313h.a
            /* renamed from: b */
            public boolean mo146455b() {
                return this.f142802a.f142661G;
            }
        }

        o() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C30958w mo12V4() {
            return new C30958w(new a(C30933c0.this));
        }
    }

    public C30933c0() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(new o());
        this.f142665K = m129210a;
        this.f142667M = C29673d.f136989d;
        this.f142668N = AbstractC21954k.Companion.m114623r();
        m129210a2 = AbstractC24856m.m129210a(new j());
        this.f142674T = m129210a2;
        this.f142675U = true;
        C31936gd c31936gd = new C31936gd(this);
        this.f142658D = c31936gd;
        this.f142656B = new C31083a(c31936gd);
        m150255U0();
    }

    /* renamed from: D0 */
    private final C15923mx m150241D0(int i11) {
        boolean m102582c;
        C19608g m102600d;
        String m102605b;
        C19607f m102599c;
        String m102602b;
        C19604c m102598b;
        String m102588b;
        C19604c m102598b2;
        C19607f m102599c2;
        C19608g m102600d2;
        C19606e m102580a = this.f142681x.m102580a();
        if (m102580a == null || !m102580a.m102597a()) {
            return null;
        }
        if (i11 == 1) {
            m102582c = this.f142681x.m102581b();
        } else {
            m102582c = this.f142681x.m102582c();
        }
        if (!m102582c || this.f142681x.m102580a() == null) {
            return null;
        }
        boolean m100204b = AbstractC19074t.m100204b(AbstractC18458a.f93019a, "en");
        C19606e m102580a2 = this.f142681x.m102580a();
        if (m100204b) {
            if (m102580a2 != null && (m102600d2 = m102580a2.m102600d()) != null) {
                m102605b = m102600d2.m102604a();
            }
            m102605b = null;
        } else {
            if (m102580a2 != null && (m102600d = m102580a2.m102600d()) != null) {
                m102605b = m102600d.m102605b();
            }
            m102605b = null;
        }
        if (m100204b) {
            C19606e m102580a3 = this.f142681x.m102580a();
            if (m102580a3 != null && (m102599c2 = m102580a3.m102599c()) != null) {
                m102602b = m102599c2.m102601a();
            }
            m102602b = null;
        } else {
            C19606e m102580a4 = this.f142681x.m102580a();
            if (m102580a4 != null && (m102599c = m102580a4.m102599c()) != null) {
                m102602b = m102599c.m102602b();
            }
            m102602b = null;
        }
        if (C23212s8.m119601h() == 1) {
            C19606e m102580a5 = this.f142681x.m102580a();
            if (m102580a5 != null && (m102598b2 = m102580a5.m102598b()) != null) {
                m102588b = m102598b2.m102587a();
            }
            m102588b = null;
        } else {
            C19606e m102580a6 = this.f142681x.m102580a();
            if (m102580a6 != null && (m102598b = m102580a6.m102598b()) != null) {
                m102588b = m102598b.m102588b();
            }
            m102588b = null;
        }
        if (m102605b == null || m102602b == null || m102588b == null) {
            return null;
        }
        return new C15923mx(m102605b, m102602b, m102588b);
    }

    /* renamed from: F0 */
    private final void m150242F0(String str) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new h());
        c0766k.m1822P(Long.parseLong(str));
    }

    /* renamed from: L1 */
    private final void m150243L1() {
    }

    /* renamed from: P1 */
    public static /* synthetic */ void m150248P1(C30933c0 c30933c0, JSONObject jSONObject, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        c30933c0.m150301O1(jSONObject, str);
    }

    /* renamed from: R0 */
    private final C30958w m150251R0() {
        return (C30958w) this.f142665K.getValue();
    }

    /* renamed from: U0 */
    private final void m150255U0() {
        C32216b.f148610a.m155341b(i.f142789q);
        this.f142667M.m147560V();
    }

    /* renamed from: U1 */
    public static /* synthetic */ void m150256U1(C30933c0 c30933c0, Context context, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        c30933c0.m150309T1(context, str);
    }

    /* renamed from: V0 */
    private final void m150258V0() {
        this.f142679v.mo9224q(new C21368b());
        this.f142676s.mo9224q(new C21367a(false, false, false, false, false, false, false, false, false, false, false, false, false, this.f142682y.m98361l(), null, false, 57343, null));
        this.f142677t.mo9224q(new C21369c(false, 0, false, 0, 15, null));
    }

    /* renamed from: W1 */
    public final void m150259W1(int i11) {
        m150350o2(false, true, i11, 124200, 0, 0L, "", 0L, 0L);
    }

    /* renamed from: Y1 */
    public static final void m150260Y1(C30933c0 c30933c0, a aVar) {
        AbstractC19074t.m100208f(c30933c0, "this$0");
        AbstractC19074t.m100208f(aVar, "$command");
        b bVar = c30933c0.f142670P;
        if (bVar != null) {
            bVar.mo86844a(aVar);
        }
    }

    /* renamed from: a0 */
    private final void m150261a0() {
        if (this.f142663I == null) {
            return;
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new f());
        C19609h c19609h = this.f142663I;
        AbstractC19074t.m100205c(c19609h);
        c0766k.m1830X(Long.parseLong(c19609h.m102616j()));
    }

    /* renamed from: b1 */
    public static final void m150262b1(C30933c0 c30933c0) {
        AbstractC19074t.m100208f(c30933c0, "this$0");
        c30933c0.m150315X1(a.r0.f142753a);
    }

    /* renamed from: d1 */
    public static /* synthetic */ void m150263d1(C30933c0 c30933c0, Context context, C18614c c18614c, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        if ((i11 & 8) != 0) {
            z12 = false;
        }
        c30933c0.m150325c1(context, c18614c, z11, z12);
    }

    /* renamed from: e1 */
    public static final void m150264e1(Context context, C18614c c18614c, String str, C30933c0 c30933c0, boolean z11) {
        AbstractC19074t.m100208f(context, "$context");
        AbstractC19074t.m100208f(c18614c, "$jumpInput");
        AbstractC19074t.m100208f(c30933c0, "this$0");
        AbstractC19444a.m101695c(new Runnable() { // from class: yf0.b0

            /* renamed from: p */
            public final /* synthetic */ String f142648p;

            /* renamed from: q */
            public final /* synthetic */ JSONObject f142649q;

            /* renamed from: r */
            public final /* synthetic */ C30933c0 f142650r;

            /* renamed from: s */
            public final /* synthetic */ Context f142651s;

            /* renamed from: t */
            public final /* synthetic */ boolean f142652t;

            public /* synthetic */ RunnableC30931b0(String str2, JSONObject jSONObject, C30933c0 c30933c02, Context context2, boolean z112) {
                r1 = str2;
                r2 = jSONObject;
                r3 = c30933c02;
                r4 = context2;
                r5 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C30933c0.m150265f1(r1, r2, r3, r4, r5);
            }
        });
    }

    /* renamed from: f1 */
    public static final void m150265f1(String str, JSONObject jSONObject, C30933c0 c30933c0, Context context, boolean z11) {
        AbstractC19074t.m100208f(c30933c0, "this$0");
        AbstractC19074t.m100208f(context, "$context");
        String str2 = null;
        if (C28630a.Companion.m143192b(str) && jSONObject != null) {
            C18617f m98397a = C18617f.Companion.m98397a();
            if (m98397a != null) {
                m98397a.m98389l();
            }
            m150269i1(c30933c0, jSONObject, false, 2, null);
            return;
        }
        if (z11) {
            str2 = "isReCreate";
        }
        c30933c0.m150309T1(context, str2);
    }

    /* renamed from: g0 */
    private final Map m150266g0(JSONArray jSONArray) {
        JSONObject jSONObject;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                Object obj = jSONArray.get(i11);
                if (obj instanceof JSONObject) {
                    jSONObject = (JSONObject) obj;
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    String optString = jSONObject.optString("action");
                    AbstractC19074t.m100205c(optString);
                    if (optString.length() > 0) {
                        linkedHashMap.put(optString, new C20132a(optString, jSONObject.optInt("limitRequest", 0), 0, jSONObject.optBoolean("clientHandle", true)));
                    }
                }
            }
        }
        AbstractC20110a.f98889a.mo104548a("Dynamic APIs: dynamicApisData: " + linkedHashMap, new Object[0]);
        return linkedHashMap;
    }

    /* renamed from: h0 */
    private final void m150267h0(JSONObject jSONObject, String str) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new g(str));
        try {
            String optString = jSONObject.optString("secret_data", "");
            String optString2 = jSONObject.optString("app_id", "");
            String m12409g = AbstractC2373t.m12409g();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("bio_state", AbstractC0924m0.m2980D1());
            c0766k.m1869t(optString, optString2, m12409g, jSONObject2.toString());
        } catch (Exception unused) {
            m150259W1(124203);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01db  */
    /* renamed from: h1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m150268h1(JSONObject jSONObject, boolean z11) {
        JSONArray jSONArray;
        boolean z12;
        boolean z13;
        int i11;
        int i12;
        String optString;
        int optInt;
        JSONObject optJSONObject;
        String m96089h;
        C21367a c21367a;
        Object obj;
        C18615d m110748f;
        C18615d m110748f2;
        C18615d m110748f3;
        C18615d m110748f4;
        C18615d m110748f5;
        String string;
        ArrayList arrayList;
        HashMap hashMap;
        String str;
        int i13;
        String str2;
        String str3;
        int i14;
        HashMap hashMap2;
        ArrayList arrayList2;
        String str4;
        JSONObject optJSONObject2;
        Iterator<String> keys;
        int i15;
        String str5;
        JSONObject optJSONObject3;
        String optString2;
        String str6;
        String str7;
        JSONObject jSONObject2;
        int i16;
        C19609h c19609h;
        C0923m m2889a;
        C21367a c21367a2;
        C21367a c21367a3;
        int parseColor;
        AbstractC19147a m110743a;
        String str8 = "";
        C21368b c21368b = (C21368b) this.f142679v.mo9215f();
        if (c21368b == null) {
            c21368b = new C21368b();
        }
        AbstractC20110a.f98889a.mo104548a("DataJump: %s", jSONObject);
        ArrayList arrayList3 = new ArrayList();
        Map linkedHashMap = new LinkedHashMap();
        try {
            z12 = jSONObject.optInt("offline", 0) == 1;
            try {
                if (jSONObject.has("configFeatures")) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject("configFeatures");
                    z13 = jSONObject3.optInt("enablePlayVideoInline", 0) == 1;
                    try {
                        c21368b.m110752j(jSONObject3.optInt("autoRotate", 0));
                        c21368b.m110755m(jSONObject3.optInt("hideProgressLoading", 0) == 1);
                        c21368b.m110758p(jSONObject3.optInt("swipeBackGestureDisabled", 0) == 1);
                        if (!z11) {
                            JSONObject optJSONObject4 = jSONObject3.optJSONObject("actionbarConfig");
                            if (optJSONObject4 != null) {
                                c21368b.m110751i(AbstractC19147a.Companion.m100489c(optJSONObject4));
                            } else {
                                boolean z14 = jSONObject3.optInt("hideActionBar", 0) == 1;
                                boolean z15 = jSONObject3.optInt("showMiniActionbar", 0) == 1;
                                if (z14) {
                                    c21368b.m110751i(AbstractC19147a.Companion.m100488b(c21368b.m110743a(), AbstractC19061k0.m100169b(C19153g.class)) ? c21368b.m110743a() : new C19153g(null));
                                } else if (z15) {
                                    c21368b.m110751i(AbstractC19147a.Companion.m100488b(c21368b.m110743a(), AbstractC19061k0.m100169b(C19156j.class)) ? c21368b.m110743a() : new C19156j(null));
                                } else {
                                    c21368b.m110751i(AbstractC19147a.Companion.m100488b(c21368b.m110743a(), AbstractC19061k0.m100169b(C19157k.class)) ? c21368b.m110743a() : new C19157k(null));
                                }
                                try {
                                    String optString3 = jSONObject3.optString("customColorHeader", "");
                                    if (optString3 != null && optString3.length() != 0 && (parseColor = Color.parseColor(optString3)) != 0 && (m110743a = c21368b.m110743a()) != null) {
                                        m110743a.m100479k(parseColor);
                                        C24848g0 c24848g0 = C24848g0.f119245a;
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        }
                    } catch (JSONException e11) {
                        e = e11;
                        jSONArray = null;
                        e.printStackTrace();
                        C18625n c18625n = new C18625n();
                        c18625n.m98432d(z12);
                        c18625n.m98431c(z13);
                        m150315X1(new a.d(c18625n));
                        i11 = jSONObject.getInt("action");
                        i12 = jSONObject.getInt("inApp");
                        optString = jSONObject.optString("webTitle", "");
                        if (optString != null) {
                        }
                        optInt = jSONObject.optInt("featureId");
                        if (C18613b.Companion.m98349a(optInt)) {
                        }
                        optJSONObject = jSONObject.optJSONObject("mpData");
                        if (optJSONObject != null) {
                        }
                        m96089h = AbstractC18069a.m96089h(jSONObject, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                        AbstractC19074t.m100207e(m96089h, "getJSONValue(...)");
                        C21371e c21371e = this.f142676s;
                        c21367a = (C21367a) c21371e.mo9215f();
                        if (c21367a == null) {
                        }
                        c21371e.mo9221n(obj);
                        c21368b.m110756n(new C18615d());
                        m110748f = c21368b.m110748f();
                        if (m110748f != null) {
                        }
                        m110748f2 = c21368b.m110748f();
                        if (m110748f2 != null) {
                        }
                        m110748f3 = c21368b.m110748f();
                        if (m110748f3 != null) {
                        }
                        m110748f4 = c21368b.m110748f();
                        if (m110748f4 != null) {
                        }
                        m110748f5 = c21368b.m110748f();
                        if (m110748f5 != null) {
                        }
                        c21368b.m110744b().m98409a();
                        String m114617i = AbstractC21954k.Companion.m114617i(this.f142663I, m96089h);
                        if (!jSONObject.has("jsToken")) {
                        }
                        arrayList = new ArrayList();
                        hashMap = new HashMap();
                        if (jSONObject.has("actionPermission")) {
                        }
                        str = str8;
                        if (jSONObject.has("cookiesIdLogins")) {
                        }
                        if (jSONObject.has("cookiesOAuthLogins")) {
                        }
                        str6 = AbstractC18458a.f93019a;
                        if (str6 == null) {
                        }
                        int i17 = CoreUtility.f89236l;
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(i17);
                            String sb3 = sb2.toString();
                            i14 = i12;
                            str3 = m96089h;
                            hashMap2 = hashMap;
                            str2 = ZMediaPlayer.OnNativeInvokeListener.ARG_URL;
                            arrayList2 = arrayList;
                            i13 = i11;
                            str4 = string;
                            arrayList2.add(new C18624m("zversion", sb3, "/", m114617i, "18000000"));
                            arrayList2.add(new C18624m("ztype", "1", "/", m114617i, "18000000"));
                            arrayList2.add(new C18624m("zlanguage", str, "/", m114617i, "18000000"));
                            int m98348a = m150361v0().m98348a();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(m98348a);
                            arrayList2.add(new C18624m("fid", sb4.toString(), "/", m114617i, "18000000"));
                            int m107392h = AbstractC20626a.m107392h();
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(m107392h);
                            arrayList2.add(new C18624m("znetwork", sb5.toString(), "/", m114617i, "18000000"));
                            int m122766d = AbstractC23349d.m122766d();
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(m122766d);
                            arrayList2.add(new C18624m("zoperator", sb6.toString(), "/", m114617i, "18000000"));
                            arrayList2.add(new C18624m("ztheme", C23212s8.m119601h() != 1 ? "dark" : "light", "/", m114617i, "18000000"));
                        } catch (Exception e12) {
                            e = e12;
                            i13 = i11;
                            str3 = m96089h;
                            i14 = i12;
                            str4 = string;
                            hashMap2 = hashMap;
                            str2 = ZMediaPlayer.OnNativeInvokeListener.ARG_URL;
                            arrayList2 = arrayList;
                        }
                        c21368b.m110744b().m98414f(m114617i, str4, arrayList2);
                        c21368b.m110744b().m98413e();
                        c21368b.m110744b().m98415g(hashMap2);
                        c21368b.m110757o(true);
                        this.f142679v.mo9221n(c21368b);
                        optJSONObject2 = jSONObject.optJSONObject("injectJsUrls");
                        if (optJSONObject2 == null) {
                        }
                        keys = optJSONObject2.keys();
                        AbstractC19074t.m100207e(keys, "keys(...)");
                        while (keys.hasNext()) {
                        }
                        if (i13 != 0) {
                        }
                    }
                } else {
                    z13 = false;
                }
                if (jSONObject.has("miniProgramConfig")) {
                    JSONObject jSONObject4 = jSONObject.getJSONObject("miniProgramConfig");
                    c21368b.m110754l(jSONObject4.optBoolean("enableKeepInstance", false));
                    jSONArray = jSONObject4.has("permissionList") ? jSONObject4.getJSONArray("permissionList") : null;
                    try {
                        linkedHashMap = m150266g0(jSONObject4.optJSONArray("dynamicApis"));
                    } catch (JSONException e13) {
                        e = e13;
                        e.printStackTrace();
                        C18625n c18625n2 = new C18625n();
                        c18625n2.m98432d(z12);
                        c18625n2.m98431c(z13);
                        m150315X1(new a.d(c18625n2));
                        i11 = jSONObject.getInt("action");
                        i12 = jSONObject.getInt("inApp");
                        optString = jSONObject.optString("webTitle", "");
                        if (optString != null) {
                            c21367a2 = (C21367a) this.f142676s.mo9215f();
                            if (c21367a2 != null) {
                            }
                            c21367a3 = (C21367a) this.f142676s.mo9215f();
                            if (c21367a3 != null) {
                            }
                        }
                        optInt = jSONObject.optInt("featureId");
                        if (C18613b.Companion.m98349a(optInt)) {
                            m150323b2(new C18613b(optInt));
                        }
                        optJSONObject = jSONObject.optJSONObject("mpData");
                        if (optJSONObject != null) {
                        }
                        m96089h = AbstractC18069a.m96089h(jSONObject, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                        AbstractC19074t.m100207e(m96089h, "getJSONValue(...)");
                        C21371e c21371e2 = this.f142676s;
                        c21367a = (C21367a) c21371e2.mo9215f();
                        if (c21367a == null) {
                        }
                        c21371e2.mo9221n(obj);
                        c21368b.m110756n(new C18615d());
                        m110748f = c21368b.m110748f();
                        if (m110748f != null) {
                        }
                        m110748f2 = c21368b.m110748f();
                        if (m110748f2 != null) {
                        }
                        m110748f3 = c21368b.m110748f();
                        if (m110748f3 != null) {
                        }
                        m110748f4 = c21368b.m110748f();
                        if (m110748f4 != null) {
                        }
                        m110748f5 = c21368b.m110748f();
                        if (m110748f5 != null) {
                        }
                        c21368b.m110744b().m98409a();
                        String m114617i2 = AbstractC21954k.Companion.m114617i(this.f142663I, m96089h);
                        if (!jSONObject.has("jsToken")) {
                        }
                        arrayList = new ArrayList();
                        hashMap = new HashMap();
                        if (jSONObject.has("actionPermission")) {
                        }
                        str = str8;
                        if (jSONObject.has("cookiesIdLogins")) {
                        }
                        if (jSONObject.has("cookiesOAuthLogins")) {
                        }
                        str6 = AbstractC18458a.f93019a;
                        if (str6 == null) {
                        }
                        int i172 = CoreUtility.f89236l;
                        StringBuilder sb22 = new StringBuilder();
                        sb22.append(i172);
                        String sb32 = sb22.toString();
                        i14 = i12;
                        str3 = m96089h;
                        hashMap2 = hashMap;
                        str2 = ZMediaPlayer.OnNativeInvokeListener.ARG_URL;
                        arrayList2 = arrayList;
                        i13 = i11;
                        str4 = string;
                        arrayList2.add(new C18624m("zversion", sb32, "/", m114617i2, "18000000"));
                        arrayList2.add(new C18624m("ztype", "1", "/", m114617i2, "18000000"));
                        arrayList2.add(new C18624m("zlanguage", str, "/", m114617i2, "18000000"));
                        int m98348a2 = m150361v0().m98348a();
                        StringBuilder sb42 = new StringBuilder();
                        sb42.append(m98348a2);
                        arrayList2.add(new C18624m("fid", sb42.toString(), "/", m114617i2, "18000000"));
                        int m107392h2 = AbstractC20626a.m107392h();
                        StringBuilder sb52 = new StringBuilder();
                        sb52.append(m107392h2);
                        arrayList2.add(new C18624m("znetwork", sb52.toString(), "/", m114617i2, "18000000"));
                        int m122766d2 = AbstractC23349d.m122766d();
                        StringBuilder sb62 = new StringBuilder();
                        sb62.append(m122766d2);
                        arrayList2.add(new C18624m("zoperator", sb62.toString(), "/", m114617i2, "18000000"));
                        arrayList2.add(new C18624m("ztheme", C23212s8.m119601h() != 1 ? "dark" : "light", "/", m114617i2, "18000000"));
                        c21368b.m110744b().m98414f(m114617i2, str4, arrayList2);
                        c21368b.m110744b().m98413e();
                        c21368b.m110744b().m98415g(hashMap2);
                        c21368b.m110757o(true);
                        this.f142679v.mo9221n(c21368b);
                        optJSONObject2 = jSONObject.optJSONObject("injectJsUrls");
                        if (optJSONObject2 == null) {
                        }
                        keys = optJSONObject2.keys();
                        AbstractC19074t.m100207e(keys, "keys(...)");
                        while (keys.hasNext()) {
                        }
                        if (i13 != 0) {
                        }
                    }
                } else {
                    jSONArray = null;
                }
            } catch (JSONException e14) {
                e = e14;
                jSONArray = null;
                z13 = false;
                e.printStackTrace();
                C18625n c18625n22 = new C18625n();
                c18625n22.m98432d(z12);
                c18625n22.m98431c(z13);
                m150315X1(new a.d(c18625n22));
                i11 = jSONObject.getInt("action");
                i12 = jSONObject.getInt("inApp");
                optString = jSONObject.optString("webTitle", "");
                if (optString != null) {
                }
                optInt = jSONObject.optInt("featureId");
                if (C18613b.Companion.m98349a(optInt)) {
                }
                optJSONObject = jSONObject.optJSONObject("mpData");
                if (optJSONObject != null) {
                }
                m96089h = AbstractC18069a.m96089h(jSONObject, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100207e(m96089h, "getJSONValue(...)");
                C21371e c21371e22 = this.f142676s;
                c21367a = (C21367a) c21371e22.mo9215f();
                if (c21367a == null) {
                }
                c21371e22.mo9221n(obj);
                c21368b.m110756n(new C18615d());
                m110748f = c21368b.m110748f();
                if (m110748f != null) {
                }
                m110748f2 = c21368b.m110748f();
                if (m110748f2 != null) {
                }
                m110748f3 = c21368b.m110748f();
                if (m110748f3 != null) {
                }
                m110748f4 = c21368b.m110748f();
                if (m110748f4 != null) {
                }
                m110748f5 = c21368b.m110748f();
                if (m110748f5 != null) {
                }
                c21368b.m110744b().m98409a();
                String m114617i22 = AbstractC21954k.Companion.m114617i(this.f142663I, m96089h);
                if (!jSONObject.has("jsToken")) {
                }
                arrayList = new ArrayList();
                hashMap = new HashMap();
                if (jSONObject.has("actionPermission")) {
                }
                str = str8;
                if (jSONObject.has("cookiesIdLogins")) {
                }
                if (jSONObject.has("cookiesOAuthLogins")) {
                }
                str6 = AbstractC18458a.f93019a;
                if (str6 == null) {
                }
                int i1722 = CoreUtility.f89236l;
                StringBuilder sb222 = new StringBuilder();
                sb222.append(i1722);
                String sb322 = sb222.toString();
                i14 = i12;
                str3 = m96089h;
                hashMap2 = hashMap;
                str2 = ZMediaPlayer.OnNativeInvokeListener.ARG_URL;
                arrayList2 = arrayList;
                i13 = i11;
                str4 = string;
                arrayList2.add(new C18624m("zversion", sb322, "/", m114617i22, "18000000"));
                arrayList2.add(new C18624m("ztype", "1", "/", m114617i22, "18000000"));
                arrayList2.add(new C18624m("zlanguage", str, "/", m114617i22, "18000000"));
                int m98348a22 = m150361v0().m98348a();
                StringBuilder sb422 = new StringBuilder();
                sb422.append(m98348a22);
                arrayList2.add(new C18624m("fid", sb422.toString(), "/", m114617i22, "18000000"));
                int m107392h22 = AbstractC20626a.m107392h();
                StringBuilder sb522 = new StringBuilder();
                sb522.append(m107392h22);
                arrayList2.add(new C18624m("znetwork", sb522.toString(), "/", m114617i22, "18000000"));
                int m122766d22 = AbstractC23349d.m122766d();
                StringBuilder sb622 = new StringBuilder();
                sb622.append(m122766d22);
                arrayList2.add(new C18624m("zoperator", sb622.toString(), "/", m114617i22, "18000000"));
                arrayList2.add(new C18624m("ztheme", C23212s8.m119601h() != 1 ? "dark" : "light", "/", m114617i22, "18000000"));
                c21368b.m110744b().m98414f(m114617i22, str4, arrayList2);
                c21368b.m110744b().m98413e();
                c21368b.m110744b().m98415g(hashMap2);
                c21368b.m110757o(true);
                this.f142679v.mo9221n(c21368b);
                optJSONObject2 = jSONObject.optJSONObject("injectJsUrls");
                if (optJSONObject2 == null) {
                }
                keys = optJSONObject2.keys();
                AbstractC19074t.m100207e(keys, "keys(...)");
                while (keys.hasNext()) {
                }
                if (i13 != 0) {
                }
            }
        } catch (JSONException e15) {
            e = e15;
            jSONArray = null;
            z12 = false;
        }
        C18625n c18625n222 = new C18625n();
        c18625n222.m98432d(z12);
        c18625n222.m98431c(z13);
        m150315X1(new a.d(c18625n222));
        i11 = jSONObject.getInt("action");
        i12 = jSONObject.getInt("inApp");
        optString = jSONObject.optString("webTitle", "");
        if (optString != null && optString.length() != 0) {
            c21367a2 = (C21367a) this.f142676s.mo9215f();
            if (c21367a2 != null) {
                AbstractC19074t.m100205c(optString);
                c21367a2.m110741h(optString);
            }
            c21367a3 = (C21367a) this.f142676s.mo9215f();
            if (c21367a3 != null) {
                c21367a3.m110742i(false);
            }
        }
        optInt = jSONObject.optInt("featureId");
        if (C18613b.Companion.m98349a(optInt) && m150361v0().m98348a() != optInt) {
            m150323b2(new C18613b(optInt));
        }
        optJSONObject = jSONObject.optJSONObject("mpData");
        if (optJSONObject != null) {
            C19609h c19609h2 = new C19609h(optJSONObject);
            c19609h2.m102625s(arrayList3);
            c19609h2.m102624r(linkedHashMap);
            c19609h2.m102623q(optJSONObject.optString("baseUrl"));
            this.f142663I = c19609h2;
            C19605d.a aVar = C19605d.Companion;
            String m102596b = aVar.m102596b(this.f142682y.m98361l());
            if (m102596b != null) {
                aVar.m102595a().m102594e(m102596b, c19609h2);
                C24848g0 c24848g02 = C24848g0.f119245a;
            }
            m150261a0();
            m150315X1(new a.x0(c19609h2));
            if (m150270i2()) {
                m150242F0(c19609h2.m102616j());
            }
            if (jSONArray != null && this.f142663I != null) {
                ArrayList arrayList4 = new ArrayList();
                int length = jSONArray.length();
                int i18 = 0;
                while (i18 < length) {
                    JSONObject jSONObject5 = jSONArray.getJSONObject(i18);
                    String string2 = jSONObject5.getString("permisionId");
                    if (string2 == null) {
                        break;
                    }
                    int i19 = jSONObject5.getInt("consent_type");
                    boolean z16 = jSONObject5.getBoolean("clientHandle");
                    JSONArray jSONArray2 = jSONArray;
                    C19609h c19609h3 = this.f142663I;
                    AbstractC19074t.m100205c(c19609h3);
                    arrayList4.add(new C0903c0(c19609h3.m102616j(), string2, i19, z16 ? 1 : 0));
                    arrayList3.add(string2);
                    i18++;
                    jSONArray = jSONArray2;
                }
                if (arrayList4.size() > 0 && (c19609h = this.f142663I) != null && (m2889a = C0923m.Companion.m2889a()) != null) {
                    C0923m.m2885i(m2889a, c19609h.m102616j(), arrayList4, false, 4, null);
                    C24848g0 c24848g03 = C24848g0.f119245a;
                }
            }
            if (optJSONObject.has("config")) {
                JSONObject jSONObject6 = optJSONObject.getJSONObject("config");
                if (jSONObject6.has("zaloAppId")) {
                    this.f142673S = jSONObject6.optLong("zaloAppId");
                }
                C18620i c18620i = this.f142671Q;
                if (c18620i != null && !C18620i.Companion.m98407d(c18620i) && jSONObject6.has("sourceId") && (i16 = jSONObject6.getInt("sourceId")) != 0) {
                    this.f142671Q = new C18620i(i16);
                }
                if (jSONObject6.has("srcType")) {
                    this.f142672R = Integer.valueOf(jSONObject6.getInt("srcType"));
                }
            }
        }
        m96089h = AbstractC18069a.m96089h(jSONObject, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100207e(m96089h, "getJSONValue(...)");
        C21371e c21371e222 = this.f142676s;
        c21367a = (C21367a) c21371e222.mo9215f();
        if (c21367a == null) {
            obj = c21367a.m110735a((r34 & 1) != 0 ? c21367a.f104198a : false, (r34 & 2) != 0 ? c21367a.f104199b : false, (r34 & 4) != 0 ? c21367a.f104200c : false, (r34 & 8) != 0 ? c21367a.f104201d : false, (r34 & 16) != 0 ? c21367a.f104202e : false, (r34 & 32) != 0 ? c21367a.f104203f : false, (r34 & 64) != 0 ? c21367a.f104204g : false, (r34 & 128) != 0 ? c21367a.f104205h : false, (r34 & 256) != 0 ? c21367a.f104206i : false, (r34 & 512) != 0 ? c21367a.f104207j : false, (r34 & 1024) != 0 ? c21367a.f104208k : false, (r34 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? c21367a.f104209l : false, (r34 & 4096) != 0 ? c21367a.f104210m : false, (r34 & 8192) != 0 ? c21367a.f104211n : m96089h, (r34 & 16384) != 0 ? c21367a.f104212o : null, (r34 & 32768) != 0 ? c21367a.f104213p : false);
        } else {
            obj = null;
        }
        c21371e222.mo9221n(obj);
        c21368b.m110756n(new C18615d());
        m110748f = c21368b.m110748f();
        if (m110748f != null) {
            m110748f.m98369e(m96089h);
        }
        m110748f2 = c21368b.m110748f();
        if (m110748f2 != null) {
            m110748f2.m98368d(m96089h);
        }
        m110748f3 = c21368b.m110748f();
        if (m110748f3 != null) {
            m110748f3.m98365a(i11);
        }
        m110748f4 = c21368b.m110748f();
        if (m110748f4 != null) {
            m110748f4.m98366b(m150361v0());
        }
        m110748f5 = c21368b.m110748f();
        if (m110748f5 != null) {
            m110748f5.m98367c(AbstractC21954k.Companion.m114623r());
        }
        c21368b.m110744b().m98409a();
        String m114617i222 = AbstractC21954k.Companion.m114617i(this.f142663I, m96089h);
        string = !jSONObject.has("jsToken") ? jSONObject.getString("jsToken") : "";
        arrayList = new ArrayList();
        hashMap = new HashMap();
        if (jSONObject.has("actionPermission")) {
            JSONObject jSONObject7 = jSONObject.getJSONObject("actionPermission");
            Iterator<String> keys2 = jSONObject7.keys();
            while (keys2.hasNext()) {
                String next = keys2.next();
                try {
                    C18623l.a aVar2 = C18623l.Companion;
                    str7 = str8;
                    try {
                        JSONObject jSONObject8 = jSONObject7.getJSONObject(next);
                        jSONObject2 = jSONObject7;
                        try {
                            AbstractC19074t.m100207e(jSONObject8, "getJSONObject(...)");
                            C18623l m98424a = aVar2.m98424a(jSONObject8);
                            AbstractC19074t.m100205c(next);
                            hashMap.put(next, m98424a);
                        } catch (Exception e16) {
                            e = e16;
                            AbstractC20110a.f98889a.mo104551d(e.toString(), new Object[0]);
                            str8 = str7;
                            jSONObject7 = jSONObject2;
                        }
                    } catch (Exception e17) {
                        e = e17;
                        jSONObject2 = jSONObject7;
                        AbstractC20110a.f98889a.mo104551d(e.toString(), new Object[0]);
                        str8 = str7;
                        jSONObject7 = jSONObject2;
                    }
                } catch (Exception e18) {
                    e = e18;
                    str7 = str8;
                }
                str8 = str7;
                jSONObject7 = jSONObject2;
            }
        }
        str = str8;
        if (jSONObject.has("cookiesIdLogins")) {
            JSONArray jSONArray3 = jSONObject.getJSONArray("cookiesIdLogins");
            int length2 = jSONArray3.length();
            for (int i21 = 0; i21 < length2; i21++) {
                JSONObject jSONObject9 = jSONArray3.getJSONObject(i21);
                AbstractC19074t.m100205c(jSONObject9);
                arrayList.add(new C18624m(jSONObject9));
            }
        }
        if (jSONObject.has("cookiesOAuthLogins")) {
            JSONArray jSONArray4 = jSONObject.getJSONArray("cookiesOAuthLogins");
            int length3 = jSONArray4.length();
            for (int i22 = 0; i22 < length3; i22++) {
                JSONObject jSONObject10 = jSONArray4.getJSONObject(i22);
                AbstractC19074t.m100205c(jSONObject10);
                arrayList.add(new C18624m(jSONObject10));
            }
        }
        try {
            str6 = AbstractC18458a.f93019a;
            if (str6 == null) {
                str = str6;
            }
            int i17222 = CoreUtility.f89236l;
            StringBuilder sb2222 = new StringBuilder();
            sb2222.append(i17222);
            String sb3222 = sb2222.toString();
            i14 = i12;
            str3 = m96089h;
            hashMap2 = hashMap;
            str2 = ZMediaPlayer.OnNativeInvokeListener.ARG_URL;
            arrayList2 = arrayList;
            i13 = i11;
            str4 = string;
        } catch (Exception e19) {
            e = e19;
            i13 = i11;
            str2 = ZMediaPlayer.OnNativeInvokeListener.ARG_URL;
            str3 = m96089h;
            i14 = i12;
            hashMap2 = hashMap;
            arrayList2 = arrayList;
            str4 = string;
        }
        try {
            arrayList2.add(new C18624m("zversion", sb3222, "/", m114617i222, "18000000"));
            arrayList2.add(new C18624m("ztype", "1", "/", m114617i222, "18000000"));
            arrayList2.add(new C18624m("zlanguage", str, "/", m114617i222, "18000000"));
            int m98348a222 = m150361v0().m98348a();
            StringBuilder sb4222 = new StringBuilder();
            sb4222.append(m98348a222);
            arrayList2.add(new C18624m("fid", sb4222.toString(), "/", m114617i222, "18000000"));
            int m107392h222 = AbstractC20626a.m107392h();
            StringBuilder sb5222 = new StringBuilder();
            sb5222.append(m107392h222);
            arrayList2.add(new C18624m("znetwork", sb5222.toString(), "/", m114617i222, "18000000"));
            int m122766d222 = AbstractC23349d.m122766d();
            StringBuilder sb6222 = new StringBuilder();
            sb6222.append(m122766d222);
            arrayList2.add(new C18624m("zoperator", sb6222.toString(), "/", m114617i222, "18000000"));
            arrayList2.add(new C18624m("ztheme", C23212s8.m119601h() != 1 ? "dark" : "light", "/", m114617i222, "18000000"));
        } catch (Exception e21) {
            e = e21;
            e.printStackTrace();
            c21368b.m110744b().m98414f(m114617i222, str4, arrayList2);
            c21368b.m110744b().m98413e();
            c21368b.m110744b().m98415g(hashMap2);
            c21368b.m110757o(true);
            this.f142679v.mo9221n(c21368b);
            optJSONObject2 = jSONObject.optJSONObject("injectJsUrls");
            if (optJSONObject2 == null) {
            }
            keys = optJSONObject2.keys();
            AbstractC19074t.m100207e(keys, "keys(...)");
            while (keys.hasNext()) {
            }
            if (i13 != 0) {
            }
        }
        c21368b.m110744b().m98414f(m114617i222, str4, arrayList2);
        c21368b.m110744b().m98413e();
        c21368b.m110744b().m98415g(hashMap2);
        c21368b.m110757o(true);
        this.f142679v.mo9221n(c21368b);
        optJSONObject2 = jSONObject.optJSONObject("injectJsUrls");
        if (optJSONObject2 == null) {
            optJSONObject2 = new JSONObject();
        }
        keys = optJSONObject2.keys();
        AbstractC19074t.m100207e(keys, "keys(...)");
        while (keys.hasNext()) {
            String next2 = keys.next();
            JSONArray jSONArray5 = optJSONObject2.getJSONArray(next2);
            ArrayList arrayList5 = new ArrayList();
            int length4 = jSONArray5.length();
            for (int i23 = 0; i23 < length4; i23++) {
                arrayList5.add(jSONArray5.getString(i23));
            }
            HashMap hashMap3 = this.f142655A;
            AbstractC19074t.m100205c(next2);
            hashMap3.put(next2, arrayList5);
        }
        if (i13 != 0) {
            int i24 = i13;
            if (i24 == 1) {
                String string3 = jSONObject.getString("html");
                try {
                    String string4 = jSONObject.getString(str2);
                    AbstractC19074t.m100205c(string4);
                    AbstractC19074t.m100205c(string3);
                    m150315X1(new a.y(string4, string3, "text/html", "utf-8", string4));
                } catch (Exception e22) {
                    e22.printStackTrace();
                }
            } else if (i24 != 2) {
                throw new IllegalArgumentException("Invalid action: " + i24);
            }
            C24848g0 c24848g04 = C24848g0.f119245a;
            return;
        }
        if (jSONObject.has("extOpen")) {
            JSONObject jSONObject11 = jSONObject.getJSONObject("extOpen");
            int optInt2 = jSONObject11.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, 1);
            String optString4 = jSONObject11.optString("extUrl");
            if (optInt2 == 2 && optString4 != null && optString4.length() != 0) {
                AbstractC19074t.m100205c(optString4);
                m150315X1(new a.i(optString4, str3));
                return;
            }
            str5 = str3;
            if (optInt2 == 1 && (optJSONObject3 = jSONObject11.optJSONObject("data")) != null && (optString2 = optJSONObject3.optString("android")) != null && optString2.length() != 0) {
                AbstractC19074t.m100205c(optString2);
                AbstractC19074t.m100205c(optString4);
                m150315X1(new a.s(i14, optString2, optString4, str5));
                return;
            }
            i15 = i14;
        } else {
            i15 = i14;
            str5 = str3;
        }
        if (i15 != 1) {
            m150315X1(new a.j(str5));
        } else if (!z11) {
            try {
                m150315X1(new a.C33053a(EnumC3144b.f13278t));
                C18617f m98397a = C18617f.Companion.m98397a();
                if (m98397a != null) {
                    m98397a.m98389l();
                    C24848g0 c24848g05 = C24848g0.f119245a;
                }
                AbstractC21954k.Companion.m114607G(new Runnable() { // from class: yf0.z

                    /* renamed from: q */
                    public final /* synthetic */ String f142888q;

                    public /* synthetic */ RunnableC30961z(String str52) {
                        r2 = str52;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C30933c0.m150271j1(C30933c0.this, r2);
                    }
                });
            } catch (Exception e23) {
                e23.printStackTrace();
            }
        }
        C24848g0 c24848g06 = C24848g0.f119245a;
    }

    /* renamed from: i1 */
    static /* synthetic */ void m150269i1(C30933c0 c30933c0, JSONObject jSONObject, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        c30933c0.m150268h1(jSONObject, z11);
    }

    /* renamed from: i2 */
    private final boolean m150270i2() {
        boolean m150272j2 = m150272j2(2);
        boolean m150272j22 = m150272j2(1);
        this.f142681x.m102584e(m150272j22);
        this.f142681x.m102585f(m150272j2);
        if (m150272j2 || m150272j22) {
            return true;
        }
        return false;
    }

    /* renamed from: j1 */
    public static final void m150271j1(C30933c0 c30933c0, String str) {
        AbstractC19074t.m100208f(c30933c0, "this$0");
        AbstractC19074t.m100208f(str, "$url");
        c30933c0.m150315X1(new a.z(str));
    }

    /* renamed from: j2 */
    private final boolean m150272j2(int i11) {
        int m3071G5;
        int m3100H5;
        C18620i c18620i;
        if (i11 == 1 && (c18620i = this.f142671Q) != null && !C18620i.Companion.m98408e(c18620i)) {
            return false;
        }
        if (i11 == 1) {
            m3071G5 = AbstractC0924m0.m3013E5();
        } else {
            m3071G5 = AbstractC0924m0.m3071G5();
        }
        if (i11 == 1) {
            m3100H5 = AbstractC0924m0.m3042F5();
        } else {
            m3100H5 = AbstractC0924m0.m3100H5();
        }
        if (m3071G5 >= m3100H5) {
            return false;
        }
        return true;
    }

    /* renamed from: m0 */
    public static /* synthetic */ void m150273m0(C30933c0 c30933c0, int i11, String str, String str2, String str3, String str4, int i12, Object obj) {
        int i13;
        if ((i12 & 1) != 0) {
            i13 = 0;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            str = "successful";
        }
        String str5 = str;
        if ((i12 & 8) != 0) {
            str3 = "{}";
        }
        c30933c0.m150341l0(i13, str5, str2, str3, str4);
    }

    /* renamed from: o0 */
    public static /* synthetic */ void m150274o0(C30933c0 c30933c0, int i11, String str, String str2, Object obj, String str3, int i12, Object obj2) {
        int i13;
        if ((i12 & 1) != 0) {
            i13 = 0;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            str = "successful";
        }
        String str4 = str;
        if ((i12 & 8) != 0) {
            obj = "{}";
        }
        c30933c0.m150346n0(i13, str4, str2, obj, str3);
    }

    /* renamed from: z0 */
    private final C22472b m150275z0() {
        return (C22472b) this.f142674T.getValue();
    }

    /* renamed from: A0 */
    public final InputStream m150276A0(String str) {
        AbstractC19074t.m100208f(str, "maSchemeFilesPath");
        return m150275z0().m116193p(str);
    }

    /* renamed from: A1 */
    public final void m150277A1() {
        m150315X1(a.u.f142761a);
    }

    @Override // lv.InterfaceC22657e
    /* renamed from: B */
    public void mo117238B(WebView webView, String str, Bitmap bitmap) {
        C21369c c21369c;
        C1761c0 c1761c0 = this.f142677t;
        C21369c c21369c2 = (C21369c) c1761c0.mo9215f();
        if (c21369c2 != null) {
            c21369c = C21369c.m110759b(c21369c2, false, 0, false, 0, 3, null);
        } else {
            c21369c = null;
        }
        c1761c0.mo9224q(c21369c);
        m150315X1(new a.g0(str, bitmap));
        if (str != null) {
            try {
                m150243L1();
            } catch (Throwable th2) {
                AbstractC20110a.f98889a.mo104552e(th2);
            }
        }
    }

    /* renamed from: B0 */
    public final String m150278B0(String str) {
        AbstractC19074t.m100208f(str, "maSchemesFilePath");
        return m150275z0().m116192o(str);
    }

    /* renamed from: B1 */
    public final void m150279B1(String str) {
        m150315X1(new a.c(str));
    }

    @Override // lv.InterfaceC22657e
    /* renamed from: C */
    public void mo117239C() {
        m150315X1(a.b0.f142687a);
    }

    /* renamed from: C0 */
    public final StateFlow m150280C0() {
        return this.f142667M.m147559T();
    }

    /* renamed from: C1 */
    public final void m150281C1(boolean z11) {
        m150315X1(new a.v(z11));
    }

    @Override // lv.InterfaceC22657e
    /* renamed from: D */
    public void mo117240D(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC28959d.m144631d(20104);
        b bVar = this.f142670P;
        if (bVar != null) {
            bVar.mo86844a(a.k0.f142718a);
        }
    }

    /* renamed from: D1 */
    public final void m150282D1(C18613b c18613b, boolean z11, String str) {
        m150315X1(new a.o0(c18613b, z11, str));
    }

    @Override // lv.InterfaceC22657e
    /* renamed from: E */
    public boolean mo117241E(String str, String str2, JsResult jsResult) {
        m150315X1(new a.d0(str, str2, jsResult));
        return true;
    }

    /* renamed from: E0 */
    public final C19603b m150283E0() {
        return this.f142681x;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0026. Please report as an issue. */
    /* renamed from: E1 */
    public final void m150284E1(String str, String str2) {
        boolean z11;
        int i11;
        AbstractC19147a abstractC19147a;
        Boolean bool;
        if (str != null) {
            try {
                if (str.length() != 0 && str2 != null && str2.length() != 0) {
                    AbstractC19147a abstractC19147a2 = null;
                    switch (str.hashCode()) {
                        case -2093246566:
                            if (!str.equals("action.open.adtima.ads")) {
                                return;
                            }
                            m150251R0().m150576a(str, str2);
                            return;
                        case -2053921536:
                            if (!str.equals("action.open.adtima.ads.interstitial")) {
                                return;
                            }
                            m150251R0().m150576a(str, str2);
                            return;
                        case -1864225257:
                            if (str.equals("action.change.actionbar")) {
                                try {
                                    JSONObject jSONObject = new JSONObject(str2);
                                    if (jSONObject.has("actionbarType")) {
                                        abstractC19147a2 = AbstractC19147a.Companion.m100489c(jSONObject);
                                    }
                                    if (abstractC19147a2 != null) {
                                        C21368b c21368b = (C21368b) this.f142679v.mo9215f();
                                        if (c21368b != null) {
                                            c21368b.m110751i(abstractC19147a2);
                                        }
                                        C21371e c21371e = this.f142679v;
                                        c21371e.mo9221n(c21371e.mo9215f());
                                    }
                                    if (jSONObject.has("statusbarType")) {
                                        C19158l c19158l = new C19158l();
                                        c19158l.m100501b(jSONObject.getInt("statusbarType"));
                                        this.f142680w.mo9221n(c19158l);
                                        return;
                                    }
                                    return;
                                } catch (Exception e11) {
                                    AbstractC20110a.f98889a.mo104552e(e11);
                                    return;
                                }
                            }
                            return;
                        case -126667720:
                            if (str.equals("action.change.actionbar.leftbutton.type")) {
                                try {
                                    if (str2.length() == 0) {
                                        return;
                                    }
                                    JSONObject jSONObject2 = new JSONObject(str2);
                                    int optInt = jSONObject2.optInt("buttonType");
                                    C21368b c21368b2 = (C21368b) this.f142679v.mo9215f();
                                    if (c21368b2 != null) {
                                        abstractC19147a2 = c21368b2.m110743a();
                                    }
                                    if (abstractC19147a2 instanceof InterfaceC19148b) {
                                        ((InterfaceC19148b) abstractC19147a2).mo100490a(AbstractC19147a.Companion.m100487a(optInt));
                                    }
                                    if (jSONObject2.has("dataConfig")) {
                                        JSONObject jSONObject3 = jSONObject2.getJSONObject("dataConfig");
                                        if (abstractC19147a2 != null) {
                                            abstractC19147a2.m100482n(jSONObject3.optInt("confirmToExit", 0));
                                            abstractC19147a2.m100484p(jSONObject3.optString("dialogMessage", ""));
                                        }
                                    }
                                    if (jSONObject2.has("homeConfig")) {
                                        JSONObject jSONObject4 = jSONObject2.getJSONObject("homeConfig");
                                        if (abstractC19147a2 instanceof C19156j) {
                                            ((C19156j) abstractC19147a2).m100499u(new C19159m(jSONObject4));
                                        }
                                    }
                                    C21368b c21368b3 = (C21368b) this.f142679v.mo9215f();
                                    if (c21368b3 != null) {
                                        c21368b3.m110751i(abstractC19147a2);
                                    }
                                    C21371e c21371e2 = this.f142679v;
                                    c21371e2.mo9221n(c21371e2.mo9215f());
                                    return;
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                    return;
                                }
                            }
                            return;
                        case 377065986:
                            if (str.equals("action.change.bottombar")) {
                                try {
                                    JSONObject jSONObject5 = new JSONObject(str2);
                                    C21368b c21368b4 = (C21368b) this.f142679v.mo9215f();
                                    if (c21368b4 != null) {
                                        c21368b4.m110753k(C19149c.Companion.m100493a(jSONObject5));
                                    }
                                    C21371e c21371e3 = this.f142679v;
                                    c21371e3.mo9221n(c21371e3.mo9215f());
                                    return;
                                } catch (Exception e13) {
                                    AbstractC20110a.f98889a.mo104552e(e13);
                                    return;
                                }
                            }
                            return;
                        case 506207171:
                            if (str.equals("action.change.button.header")) {
                                m150315X1(new a.b(str2));
                                return;
                            }
                            return;
                        case 855046617:
                            if (str.equals("action.config.floatingmenu")) {
                                try {
                                    JSONObject jSONObject6 = new JSONObject(str2);
                                    if (jSONObject6.optInt("hide", 0) == 1) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    long optLong = jSONObject6.optLong("time", 0L);
                                    long[] jArr = f142654W;
                                    long j11 = jArr[0];
                                    if (optLong >= j11) {
                                        j11 = jArr[1];
                                        if (optLong > j11) {
                                        }
                                        m150315X1(new a.m0(z11, optLong));
                                        return;
                                    }
                                    optLong = j11;
                                    m150315X1(new a.m0(z11, optLong));
                                    return;
                                } catch (JSONException e14) {
                                    e14.printStackTrace();
                                    return;
                                }
                            }
                            return;
                        case 986552080:
                            if (str.equals("action.change.autorotate")) {
                                JSONObject jSONObject7 = new JSONObject(str2);
                                C21368b c21368b5 = (C21368b) this.f142679v.mo9215f();
                                if (c21368b5 != null) {
                                    c21368b5.m110752j(jSONObject7.optInt("autoRotate", 0));
                                }
                                C21371e c21371e4 = this.f142679v;
                                c21371e4.mo9221n(c21371e4.mo9215f());
                                return;
                            }
                            return;
                        case 1184806787:
                            if (str.equals("action.webview.checkResError")) {
                                try {
                                    this.f142660F = new JSONObject(str2).optBoolean("setting_check_loading_res_error");
                                    return;
                                } catch (JSONException e15) {
                                    e15.printStackTrace();
                                    return;
                                }
                            }
                            return;
                        case 1390222540:
                            if (str.equals("action.change.actionbar.color")) {
                                try {
                                    JSONObject jSONObject8 = new JSONObject(str2);
                                    if (jSONObject8.has("data")) {
                                        i11 = Color.parseColor(jSONObject8.optString("data", ""));
                                    } else {
                                        i11 = Integer.MIN_VALUE;
                                    }
                                    C21368b c21368b6 = (C21368b) this.f142679v.mo9215f();
                                    if (c21368b6 != null) {
                                        abstractC19147a = c21368b6.m110743a();
                                    } else {
                                        abstractC19147a = null;
                                    }
                                    if (abstractC19147a != null) {
                                        if (jSONObject8.has("textColor")) {
                                            bool = Boolean.valueOf(AbstractC19074t.m100204b(jSONObject8.optString("textColor"), "white"));
                                        } else {
                                            bool = null;
                                        }
                                        abstractC19147a.m100483o(bool);
                                    }
                                    C21368b c21368b7 = (C21368b) this.f142679v.mo9215f();
                                    if (c21368b7 != null) {
                                        abstractC19147a2 = c21368b7.m110743a();
                                    }
                                    if (abstractC19147a2 != null) {
                                        abstractC19147a2.m100481m(Integer.valueOf(i11));
                                    }
                                    C21371e c21371e5 = this.f142679v;
                                    c21371e5.mo9221n(c21371e5.mo9215f());
                                    return;
                                } catch (Exception e16) {
                                    AbstractC20110a.f98889a.mo104552e(e16);
                                    return;
                                }
                            }
                            return;
                        case 1614341938:
                            if (str.equals("action.window.close")) {
                                m150315X1(new a.e(EnumC3143a.f13272y));
                                m150315X1(a.h.f142706a);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
            } catch (Exception e17) {
                e17.printStackTrace();
            }
        }
    }

    /* renamed from: F1 */
    public final void m150285F1(Bundle bundle) {
        String str;
        if (bundle == null || (str = bundle.getString("CURRENT_ACTION_LIST_TASK_ID")) == null) {
            str = this.f142659E;
        }
        this.f142659E = str;
    }

    /* renamed from: G0 */
    public final String m150286G0() {
        C19609h c19609h = this.f142663I;
        if (c19609h != null) {
            return c19609h.m102616j();
        }
        return null;
    }

    /* renamed from: G1 */
    public final void m150287G1(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        bundle.putString("CURRENT_ACTION_LIST_TASK_ID", this.f142659E);
    }

    /* renamed from: H1 */
    public final void m150288H1(String str) {
        m150315X1(new a.t0(str));
    }

    /* renamed from: I0 */
    public final C0903c0 m150289I0(String str) {
        String m102616j;
        C0923m m2889a;
        AbstractC19074t.m100208f(str, "permissionId");
        C19609h c19609h = this.f142663I;
        if (c19609h == null || (m102616j = c19609h.m102616j()) == null || (m2889a = C0923m.Companion.m2889a()) == null) {
            return null;
        }
        return m2889a.m2886d(m102616j, str);
    }

    /* renamed from: I1 */
    public final void m150290I1(Context context, String str) {
        C18614c m98351a;
        AbstractC19074t.m100208f(context, "context");
        if (str != null) {
            this.f142679v.mo9224q(new C21368b());
            m98351a = r8.m98351a((r24 & 1) != 0 ? r8.f93609a : str, (r24 & 2) != 0 ? r8.f93610b : null, (r24 & 4) != 0 ? r8.f93611c : 0, (r24 & 8) != 0 ? r8.f93612d : null, (r24 & 16) != 0 ? r8.f93613e : null, (r24 & 32) != 0 ? r8.f93614f : 0L, (r24 & 64) != 0 ? r8.f93615g : false, (r24 & 128) != 0 ? r8.f93616h : null, (r24 & 256) != 0 ? r8.f93617i : null, (r24 & 512) != 0 ? this.f142682y.f93618j : 0);
            this.f142682y = m98351a;
            m150263d1(this, context, m98351a, true, false, 8, null);
        }
    }

    /* renamed from: J0 */
    public final C19609h m150291J0() {
        return this.f142663I;
    }

    /* renamed from: J1 */
    public final void m150292J1(C0880c c0880c, boolean z11) {
        AbstractC19074t.m100208f(c0880c, "billingItem");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new l(c0880c, z11, null), 3, null);
    }

    /* renamed from: K0 */
    public final boolean m150293K0() {
        return this.f142669O;
    }

    /* renamed from: K1 */
    public final void m150294K1(String str) {
        if (str == null) {
            return;
        }
        String str2 = this.f142659E;
        if (str2 != null && !AbstractC19074t.m100204b(str2, str)) {
            AbstractC28127m2.a.m141609d().m141615g(this.f142659E);
        }
        this.f142659E = str;
    }

    /* renamed from: L0 */
    public final int m150295L0() {
        return this.f142683z;
    }

    /* renamed from: M0 */
    public final C18620i m150296M0() {
        return this.f142671Q;
    }

    /* renamed from: M1 */
    public final void m150297M1(String str, JSONObject jSONObject, String str2) {
        AbstractC19074t.m100208f(str, "action");
        AbstractC19074t.m100208f(jSONObject, "data");
        m150275z0().m116179A(str, jSONObject, str2);
    }

    /* renamed from: N0 */
    public final Integer m150298N0() {
        return this.f142672R;
    }

    /* renamed from: N1 */
    public final void m150299N1(String str, JSONObject jSONObject, String str2, EnumC2383a enumC2383a) {
        AbstractC19074t.m100208f(str, "action");
        AbstractC19074t.m100208f(jSONObject, "resultJson");
        AbstractC19074t.m100208f(enumC2383a, "compressLevel");
        m150275z0().m116180B(str, jSONObject, str2, enumC2383a);
    }

    /* renamed from: O0 */
    public final C21371e m150300O0() {
        return this.f142680w;
    }

    /* renamed from: O1 */
    public final void m150301O1(JSONObject jSONObject, String str) {
        AbstractC19074t.m100208f(jSONObject, "data");
        if (this.f142666L == null) {
            AbstractC21954k.a aVar = AbstractC21954k.Companion;
            long m114623r = aVar.m114623r();
            C18617f.a aVar2 = C18617f.Companion;
            C18617f m98397a = aVar2.m98397a();
            if (m98397a != null) {
                m98397a.m98395r();
            }
            this.f142666L = new C30940g(new m());
            C18617f m98397a2 = aVar2.m98397a();
            if (m98397a2 != null) {
                m98397a2.m98390m(aVar.m114623r() - m114623r);
            }
        }
        C30940g c30940g = this.f142666L;
        if (c30940g != null) {
            c30940g.m150489e(jSONObject, str);
        }
    }

    /* renamed from: P0 */
    public final int m150302P0() {
        return WebBaseView.Companion.m86838l();
    }

    /* renamed from: Q0 */
    public final InterfaceC31084b m150303Q0() {
        return this.f142658D;
    }

    /* renamed from: Q1 */
    public final void m150304Q1() {
        m150275z0().m116181C();
    }

    /* renamed from: R1 */
    public final void m150305R1(String str) {
        AbstractC19074t.m100208f(str, "eventId");
        this.f142656B.m151015c(str);
    }

    /* renamed from: S0 */
    public final long m150306S0() {
        return this.f142673S;
    }

    /* renamed from: S1 */
    public final void m150307S1(String str, JSONObject jSONObject, String str2) {
        m150315X1(new a.p0(str, jSONObject, str2));
    }

    /* renamed from: T0 */
    public final void m150308T0() {
        m150315X1(a.t.f142759a);
    }

    /* renamed from: T1 */
    public final void m150309T1(Context context, String str) {
        boolean z11;
        AbstractC19074t.m100208f(context, "context");
        if (str != null && str.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean z12 = !z11;
        if (z12) {
            m150315X1(new a.C33053a(EnumC3144b.f13282x));
            C18617f m98397a = C18617f.Companion.m98397a();
            if (m98397a != null) {
                m98397a.m98394q();
            }
        }
        n nVar = new n(str, z12, context);
        JSONObject m131571b = AbstractC25384a.m131571b(this.f142682y.m98352c());
        if (m131571b == null) {
            m131571b = new JSONObject();
        }
        m131571b.put("ma_session_id", this.f142683z);
        C18614c c18614c = this.f142682y;
        String jSONObject = m131571b.toString();
        AbstractC19074t.m100207e(jSONObject, "toString(...)");
        c18614c.m98362m(jSONObject);
        if (AbstractC19074t.m100204b(this.f142682y.m98353d(), C18613b.f93604w) && this.f142682y.m98356g().length() > 0) {
            C30938f.Companion.m150466a().m150464d(this.f142682y, nVar);
        } else {
            C30938f.Companion.m150466a().m150463c(context, this.f142682y, z11, nVar);
        }
    }

    /* renamed from: V1 */
    public final void m150310V1(C19602a c19602a) {
        AbstractC19074t.m100208f(c19602a, "eventInfo");
        this.f142656B.m151016d(c19602a);
    }

    /* renamed from: W */
    public final void m150311W() {
        int i11;
        Boolean bool = (Boolean) this.f142678u.mo9215f();
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        boolean z11 = !bool.booleanValue();
        if (this.f142663I == null) {
            if (z11) {
                i11 = AbstractC8020f0.str_mini_app_cannot_add_to_favorite;
            } else {
                i11 = AbstractC8020f0.str_mini_app_cannot_remove_from_favorite;
            }
            ToastUtils.m89268p(AbstractC23136l9.m118743r0(i11));
            return;
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new e(z11));
        C19609h c19609h = this.f142663I;
        AbstractC19074t.m100205c(c19609h);
        c0766k.m1839d(z11, Long.parseLong(c19609h.m102616j()));
    }

    /* renamed from: W0 */
    public final boolean m150312W0(String str) {
        C20132a m102615i;
        AbstractC19074t.m100208f(str, "h5Action");
        C19609h c19609h = this.f142663I;
        if (c19609h != null && (m102615i = c19609h.m102615i(str)) != null) {
            return m102615i.m105058a();
        }
        return true;
    }

    /* renamed from: X */
    public final void m150313X(String str, int i11, JSONObject jSONObject, String str2) {
        AbstractC19074t.m100208f(str, "action");
        AbstractC19074t.m100208f(jSONObject, "data");
        if (AbstractC19074t.m100204b(str, "action.prompt.authentication")) {
            if (i11 != -109 && i11 != -108) {
                if (i11 != -1) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            switch (i11) {
                                case -102:
                                case WebAppInterface.ERROR_PURCHASE_USER_CANCELED /* -100 */:
                                    break;
                                case -101:
                                    m150259W1(124204);
                                    return;
                                default:
                                    m150259W1(124203);
                                    return;
                            }
                        } else {
                            m150259W1(124201);
                            return;
                        }
                    } else {
                        m150259W1(124205);
                        m150267h0(jSONObject, str2);
                        return;
                    }
                } else {
                    m150259W1(124202);
                    return;
                }
            }
            m150259W1(124203);
        }
    }

    /* renamed from: X0 */
    public final boolean m150314X0(String str) {
        C20132a c20132a;
        AbstractC19074t.m100208f(str, "action");
        C19609h c19609h = this.f142663I;
        if (c19609h != null) {
            c20132a = c19609h.m102615i(str);
        } else {
            c20132a = null;
        }
        if (c20132a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: X1 */
    public final synchronized void m150315X1(a aVar) {
        AbstractC19074t.m100208f(aVar, "command");
        AbstractC21954k.Companion.m114607G(new Runnable() { // from class: yf0.y

            /* renamed from: q */
            public final /* synthetic */ C30933c0.a f142886q;

            public /* synthetic */ RunnableC30960y(C30933c0.a aVar2) {
                r2 = aVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C30933c0.m150260Y1(C30933c0.this, r2);
            }
        });
    }

    /* renamed from: Y */
    public final String m150316Y(Context context) {
        AbstractC19074t.m100208f(context, "context");
        int m6959a = AbstractC1388a.m6959a(context, "android.permission.CAMERA");
        if (m6959a != -1) {
            if (m6959a != 0) {
                return "undefine";
            }
            return "grant";
        }
        return "deny";
    }

    /* renamed from: Y0 */
    public final C1761c0 m150317Y0() {
        return this.f142678u;
    }

    /* renamed from: Z */
    public final boolean m150318Z(InterfaceC27218a interfaceC27218a) {
        return WebBaseView.Companion.m86833f(interfaceC27218a);
    }

    /* renamed from: Z0 */
    public final boolean m150319Z0(String str) {
        C19609h c19609h;
        if (str != null && str.length() != 0 && (c19609h = this.f142663I) != null && c19609h.m102621o(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: Z1 */
    public final void m150320Z1(b bVar) {
        AbstractC19074t.m100208f(bVar, "commandListener");
        this.f142670P = bVar;
    }

    /* renamed from: a1 */
    public final void m150321a1(String str, String str2, String str3) {
        AbstractC19074t.m100208f(str2, "eventName");
        if (str == null) {
            return;
        }
        this.f142656B.m151015c(str);
        if (AbstractC19074t.m100204b("h5.event.action.close", str2)) {
            if (str3 != null) {
                try {
                    if (str3.length() != 0) {
                        if (new JSONObject(str3).optInt("handle_h5") != 0) {
                            AbstractC19444a.m101694b(new Runnable() { // from class: yf0.a0
                                public /* synthetic */ RunnableC30929a0() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C30933c0.m150262b1(C30933c0.this);
                                }
                            }, 1000L);
                            return;
                        }
                    }
                } catch (JSONException e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
            m150315X1(new a.e(EnumC3143a.f13271x));
            m150315X1(a.h.f142706a);
        }
    }

    @Override // lv.InterfaceC22657e
    /* renamed from: b */
    public void mo117242b() {
        m150315X1(a.a0.f142685a);
    }

    /* renamed from: b0 */
    public final void m150322b0(String str, String str2) {
        String m141915R0;
        int i11 = d.f142782a[this.f142667M.m147563Y().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                m141915R0 = AbstractC28207v1.m141899N0(-2, "Device unsupported!", str);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            m141915R0 = AbstractC28207v1.m141915R0(str);
        }
        AbstractC19074t.m100205c(m141915R0);
        m150315X1(new a.x(m141915R0, str2));
    }

    /* renamed from: b2 */
    public final void m150323b2(C18613b c18613b) {
        AbstractC19074t.m100208f(c18613b, "featureId");
        this.f142682y.m98363n(c18613b);
    }

    @Override // lv.InterfaceC22657e
    /* renamed from: c */
    public void mo117243c(int i11) {
        boolean z11;
        if (1 <= i11 && i11 < 100) {
            z11 = true;
        } else {
            z11 = false;
        }
        C21369c c21369c = (C21369c) this.f142677t.mo9215f();
        if (c21369c == null || c21369c.m110762d() == i11) {
            return;
        }
        this.f142677t.mo9224q(C21369c.m110759b(c21369c, z11, i11, false, 0, 12, null));
    }

    /* renamed from: c0 */
    public final boolean m150324c0(String str) {
        AbstractC19074t.m100208f(str, "maSchemesFilePath");
        return m150275z0().m116187g(str);
    }

    /* renamed from: c1 */
    public final void m150325c1(Context context, C18614c c18614c, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c18614c, "jumpInput");
        String m98361l = this.f142682y.m98361l();
        if (z11) {
            this.f142669O = z11;
        }
        m150258V0();
        C30939f0.a aVar = C30939f0.Companion;
        aVar.m150481g(context, c18614c.m98361l());
        String m114620m = AbstractC21954k.Companion.m114620m(m98361l);
        if (m98361l.length() > 0 && (m114620m == null || m114620m.length() == 0)) {
            this.f142676s.mo9224q(new C21367a(false, false, false, false, false, false, false, false, false, false, false, false, false, m98361l, null, false, 57343, null));
            m150315X1(new a.z(m98361l));
        } else {
            if (aVar.m150480f(context, c18614c.m98361l())) {
                this.f142660F = false;
            }
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: yf0.x

                /* renamed from: p */
                public final /* synthetic */ Context f142880p;

                /* renamed from: q */
                public final /* synthetic */ C18614c f142881q;

                /* renamed from: r */
                public final /* synthetic */ String f142882r;

                /* renamed from: s */
                public final /* synthetic */ C30933c0 f142883s;

                /* renamed from: t */
                public final /* synthetic */ boolean f142884t;

                public /* synthetic */ RunnableC30959x(Context context2, C18614c c18614c2, String m114620m2, C30933c0 this, boolean z122) {
                    r1 = context2;
                    r2 = c18614c2;
                    r3 = m114620m2;
                    r4 = this;
                    r5 = z122;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C30933c0.m150264e1(r1, r2, r3, r4, r5);
                }
            });
        }
    }

    /* renamed from: c2 */
    public final void m150326c2(C18620i c18620i) {
        AbstractC19074t.m100208f(c18620i, "source");
        this.f142671Q = c18620i;
    }

    @Override // yf0.AbstractC30936e.b
    /* renamed from: d */
    public void mo150327d(byte[] bArr) {
        if (bArr != null) {
            m150315X1(new a.g(bArr));
        }
    }

    /* renamed from: d2 */
    public final void m150328d2(boolean z11) {
        this.f142675U = z11;
    }

    @Override // lv.InterfaceC22657e
    /* renamed from: e */
    public boolean mo117244e(String str, String str2, String str3, JsPromptResult jsPromptResult) {
        m150315X1(new a.e0(str, str2, str3, jsPromptResult));
        return true;
    }

    /* renamed from: e0 */
    public final void m150329e0() {
        m150315X1(a.f.f142701a);
    }

    /* renamed from: e2 */
    public final void m150330e2(C19609h c19609h) {
        this.f142663I = c19609h;
    }

    /* renamed from: f0 */
    public final void m150331f0() {
        this.f142667M.m147553D();
    }

    /* renamed from: f2 */
    public final void m150332f2(boolean z11) {
        this.f142669O = z11;
    }

    @Override // lv.InterfaceC22657e
    /* renamed from: g */
    public void mo117245g(PermissionRequest permissionRequest) {
        m150315X1(new a.h0(permissionRequest));
    }

    /* renamed from: g1 */
    public final void m150333g1(String str, String str2, JSONObject jSONObject) {
        AbstractC19074t.m100208f(str, "action");
        AbstractC19074t.m100208f(str2, "callback");
        AbstractC19074t.m100208f(jSONObject, "data");
        m150315X1(new a.w(this.f142667M, str, str2, jSONObject));
    }

    /* renamed from: g2 */
    public final void m150334g2(int i11) {
        this.f142683z = i11;
    }

    /* renamed from: h2 */
    public final void m150335h2(String str) {
        if (this.f142664J.length() > 0) {
            AbstractC28127m2.a.m141609d().m141613e(this.f142664J).f131146b = str;
        }
    }

    /* renamed from: i0 */
    public final void m150336i0(C19602a c19602a) {
        AbstractC19074t.m100208f(c19602a, "event");
        this.f142656B.m151014a(c19602a, this.f142675U);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    @Override // lv.InterfaceC22657e
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo117246j(String str, WebView webView) {
        C21367a c21367a;
        C21367a c21367a2;
        C21367a c21367a3;
        C19605d.a aVar;
        String m102596b;
        String str2;
        C18614c m98351a;
        WebBackForwardList webBackForwardList;
        if (str != null && (m102596b = (aVar = C19605d.Companion).m102596b(str)) != null) {
            C21367a c21367a4 = (C21367a) this.f142676s.mo9215f();
            if (c21367a4 != null) {
                str2 = c21367a4.m110739f();
            } else {
                str2 = null;
            }
            String m102596b2 = aVar.m102596b(str2);
            if (m102596b2 != null && !AbstractC19074t.m100204b(m102596b, m102596b2)) {
                m98351a = r1.m98351a((r24 & 1) != 0 ? r1.f93609a : str, (r24 & 2) != 0 ? r1.f93610b : null, (r24 & 4) != 0 ? r1.f93611c : 0, (r24 & 8) != 0 ? r1.f93612d : null, (r24 & 16) != 0 ? r1.f93613e : null, (r24 & 32) != 0 ? r1.f93614f : 0L, (r24 & 64) != 0 ? r1.f93615g : false, (r24 & 128) != 0 ? r1.f93616h : null, (r24 & 256) != 0 ? r1.f93617i : null, (r24 & 512) != 0 ? this.f142682y.f93618j : 0);
                this.f142682y = m98351a;
                this.f142663I = aVar.m102595a().m102592c(str);
                C19605d m102595a = aVar.m102595a();
                if (webView != null) {
                    webBackForwardList = webView.copyBackForwardList();
                } else {
                    webBackForwardList = null;
                }
                m102595a.m102593d(webBackForwardList);
                if (this.f142663I == null && webView != null) {
                    Context context = webView.getContext();
                    AbstractC19074t.m100207e(context, "getContext(...)");
                    c21367a = null;
                    m150256U1(this, context, null, 2, null);
                } else {
                    c21367a = null;
                }
                C21371e c21371e = this.f142676s;
                c21367a2 = (C21367a) c21371e.mo9215f();
                if (c21367a2 == null) {
                    AbstractC19074t.m100205c(str);
                    c21367a3 = c21367a2.m110735a((r34 & 1) != 0 ? c21367a2.f104198a : false, (r34 & 2) != 0 ? c21367a2.f104199b : false, (r34 & 4) != 0 ? c21367a2.f104200c : false, (r34 & 8) != 0 ? c21367a2.f104201d : false, (r34 & 16) != 0 ? c21367a2.f104202e : false, (r34 & 32) != 0 ? c21367a2.f104203f : false, (r34 & 64) != 0 ? c21367a2.f104204g : false, (r34 & 128) != 0 ? c21367a2.f104205h : false, (r34 & 256) != 0 ? c21367a2.f104206i : false, (r34 & 512) != 0 ? c21367a2.f104207j : false, (r34 & 1024) != 0 ? c21367a2.f104208k : false, (r34 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? c21367a2.f104209l : false, (r34 & 4096) != 0 ? c21367a2.f104210m : false, (r34 & 8192) != 0 ? c21367a2.f104211n : str, (r34 & 16384) != 0 ? c21367a2.f104212o : null, (r34 & 32768) != 0 ? c21367a2.f104213p : false);
                    c21371e = c21371e;
                } else {
                    c21367a3 = c21367a;
                }
                c21371e.mo9224q(c21367a3);
                m150342l1(new C21372f(new WeakReference(webView)));
            }
        }
        c21367a = null;
        C21371e c21371e2 = this.f142676s;
        c21367a2 = (C21367a) c21371e2.mo9215f();
        if (c21367a2 == null) {
        }
        c21371e2.mo9224q(c21367a3);
        m150342l1(new C21372f(new WeakReference(webView)));
    }

    /* renamed from: j0 */
    public final void m150337j0(String str) {
        AbstractC19074t.m100208f(str, "data");
        C31083a.m151013b(this.f142656B, new C19602a("h5.event.connection.changed", str), false, 2, null);
    }

    @Override // lv.InterfaceC22657e
    /* renamed from: k */
    public void mo117247k(WebView webView, String str) {
        boolean m127126v;
        boolean m127124t;
        boolean m127126v2;
        m150315X1(new a.f0(str));
        m150251R0().m150577d();
        String m114620m = AbstractC21954k.Companion.m114620m(str);
        if (m114620m == null) {
            m114620m = "";
        }
        for (String str2 : this.f142655A.keySet()) {
            List<String> list = (List) this.f142655A.get(str2);
            if (list == null) {
                list = new ArrayList();
            }
            for (String str3 : list) {
                m127126v = AbstractC24341v.m127126v(m114620m, str3, true);
                if (!m127126v) {
                    m127124t = AbstractC24341v.m127124t(m114620m, "." + str3, true);
                    if (!m127124t) {
                        m127126v2 = AbstractC24341v.m127126v(str3, "all", true);
                        if (m127126v2) {
                        }
                    }
                }
                AbstractC30936e.a aVar = AbstractC30936e.Companion;
                AbstractC19074t.m100205c(str2);
                aVar.m150459b(str2, this);
            }
        }
    }

    /* renamed from: k0 */
    public final void m150338k0(String str, String str2) {
        AbstractC19074t.m100208f(str, "callback");
        AbstractC19074t.m100208f(str2, "data");
        m150315X1(new a.z("javascript: " + str + " ('" + str2 + "')"));
    }

    /* renamed from: k1 */
    public final void m150339k1(Context context, Bundle bundle, boolean z11) {
        String str;
        String str2;
        String str3;
        int i11;
        String str4;
        String str5;
        String str6;
        String string;
        C21367a c21367a;
        AbstractC19074t.m100208f(context, "context");
        if (bundle != null && bundle.containsKey("EXTRA_AUTO_PERMISSION")) {
            this.f142662H = bundle.getBoolean("EXTRA_AUTO_PERMISSION");
        }
        if (bundle != null && bundle.containsKey("use_subtitle") && (c21367a = (C21367a) this.f142676s.mo9215f()) != null) {
            c21367a.m110742i(bundle.getBoolean("use_subtitle"));
        }
        String str7 = null;
        if (bundle != null) {
            str = bundle.getString("EXTRA_ACTION_LIST_TASK_ID");
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        this.f142664J = str;
        if (bundle == null || (str2 = bundle.getString("extra_param_info")) == null) {
            str2 = "";
        }
        String m86834g = WebBaseView.Companion.m86834g(m150361v0(), bundle, str2);
        if (bundle == null || (string = bundle.getString("EXTRA_WEB_URL")) == null) {
            str3 = "";
        } else {
            str3 = string;
        }
        int i12 = 0;
        if (bundle != null) {
            i11 = bundle.getInt("EXTRA_SOURCE_LINK");
        } else {
            i11 = 0;
        }
        if (bundle != null) {
            str4 = bundle.getString("EXTRA_SOURCE_PARAM");
        } else {
            str4 = null;
        }
        if (!AbstractC19074t.m100204b(m150361v0(), C18613b.f93604w)) {
            str5 = "";
        } else {
            if (bundle != null) {
                str7 = bundle.getString("id_oa_profile");
            }
            if (str7 == null) {
                str7 = "";
            }
            str5 = str7;
        }
        C18613b m150361v0 = m150361v0();
        if (str4 == null) {
            str6 = "";
        } else {
            str6 = str4;
        }
        C18614c c18614c = new C18614c(str3, m150361v0, i11, str6, m86834g, 0L, true, "", str5, 0, 512, null);
        this.f142682y = c18614c;
        C18620i c18620i = this.f142671Q;
        if (c18620i != null) {
            i12 = c18620i.m98403a();
        }
        c18614c.m98364o(i12);
        m150263d1(this, context, this.f142682y, false, z11, 4, null);
    }

    /* renamed from: k2 */
    public final boolean m150340k2(String str, String str2) {
        C20132a m102615i;
        AbstractC19074t.m100208f(str, "action");
        C19609h c19609h = this.f142663I;
        if (c19609h != null && (m102615i = c19609h.m102615i(str)) != null) {
            if (m102615i.m105060c() < m102615i.m105059b()) {
                m102615i.m105061d(m102615i.m105060c() + 1);
                return true;
            }
            m150273m0(this, WebAppInterface.ERROR_CODE_EXCEEDED_LIMIT_REQUEST, "Exceeded maximum request! Maximum request is " + m102615i.m105059b() + ", but received " + (m102615i.m105060c() + 1), str, null, str2, 8, null);
        }
        return false;
    }

    @Override // lv.InterfaceC22657e
    /* renamed from: l */
    public void mo117248l(HttpAuthHandler httpAuthHandler, String str, String str2) {
        m150315X1(new a.j0(httpAuthHandler, str, str2));
    }

    /* renamed from: l0 */
    public final void m150341l0(int i11, String str, String str2, String str3, String str4) {
        AbstractC19074t.m100208f(str, "errorMessage");
        AbstractC19074t.m100208f(str2, "action");
        String jSONObject = new JSONObject().put("error_code", i11).put("error_message", str).put("data", str3).put("action", str2).toString();
        AbstractC19074t.m100207e(jSONObject, "toString(...)");
        m150315X1(new a.x(jSONObject, str4));
    }

    /* renamed from: l1 */
    public void m150342l1(InterfaceC21370d interfaceC21370d) {
        C21367a c21367a;
        AbstractC19074t.m100208f(interfaceC21370d, "newWebNavigationState");
        C21371e c21371e = this.f142676s;
        C21367a c21367a2 = (C21367a) c21371e.mo9215f();
        if (c21367a2 != null) {
            c21367a = c21367a2.m110735a((r34 & 1) != 0 ? c21367a2.f104198a : false, (r34 & 2) != 0 ? c21367a2.f104199b : false, (r34 & 4) != 0 ? c21367a2.f104200c : false, (r34 & 8) != 0 ? c21367a2.f104201d : false, (r34 & 16) != 0 ? c21367a2.f104202e : false, (r34 & 32) != 0 ? c21367a2.f104203f : false, (r34 & 64) != 0 ? c21367a2.f104204g : false, (r34 & 128) != 0 ? c21367a2.f104205h : false, (r34 & 256) != 0 ? c21367a2.f104206i : false, (r34 & 512) != 0 ? c21367a2.f104207j : interfaceC21370d.mo110766b(), (r34 & 1024) != 0 ? c21367a2.f104208k : interfaceC21370d.mo110765a(), (r34 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? c21367a2.f104209l : false, (r34 & 4096) != 0 ? c21367a2.f104210m : false, (r34 & 8192) != 0 ? c21367a2.f104211n : null, (r34 & 16384) != 0 ? c21367a2.f104212o : null, (r34 & 32768) != 0 ? c21367a2.f104213p : false);
        } else {
            c21367a = null;
        }
        c21371e.mo9224q(c21367a);
    }

    /* renamed from: l2 */
    public final boolean m150343l2() {
        C15923mx m150241D0 = m150241D0(1);
        if (m150241D0 == null) {
            return false;
        }
        m150315X1(new a.v0(1, m150241D0));
        AbstractC0924m0.m3524Vn(AbstractC0924m0.m3013E5() + 1);
        this.f142681x.m102584e(m150272j2(1));
        return true;
    }

    @Override // lv.InterfaceC22657e
    /* renamed from: m */
    public void mo117249m(WebView webView, String str, boolean z11) {
        C21371e c21371e;
        String str2;
        if (str != null) {
            C21367a c21367a = null;
            if (!z11) {
                C21367a c21367a2 = (C21367a) this.f142676s.mo9215f();
                if (c21367a2 != null) {
                    str2 = c21367a2.m110738e();
                } else {
                    str2 = null;
                }
                if (str2 != null && str2.length() != 0) {
                    return;
                }
            }
            C21371e c21371e2 = this.f142676s;
            C21367a c21367a3 = (C21367a) c21371e2.mo9215f();
            if (c21367a3 != null) {
                c21367a = c21367a3.m110735a((r34 & 1) != 0 ? c21367a3.f104198a : false, (r34 & 2) != 0 ? c21367a3.f104199b : false, (r34 & 4) != 0 ? c21367a3.f104200c : false, (r34 & 8) != 0 ? c21367a3.f104201d : false, (r34 & 16) != 0 ? c21367a3.f104202e : false, (r34 & 32) != 0 ? c21367a3.f104203f : false, (r34 & 64) != 0 ? c21367a3.f104204g : false, (r34 & 128) != 0 ? c21367a3.f104205h : false, (r34 & 256) != 0 ? c21367a3.f104206i : false, (r34 & 512) != 0 ? c21367a3.f104207j : false, (r34 & 1024) != 0 ? c21367a3.f104208k : false, (r34 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? c21367a3.f104209l : false, (r34 & 4096) != 0 ? c21367a3.f104210m : false, (r34 & 8192) != 0 ? c21367a3.f104211n : null, (r34 & 16384) != 0 ? c21367a3.f104212o : str, (r34 & 32768) != 0 ? c21367a3.f104213p : false);
                c21371e = c21371e2;
            } else {
                c21371e = c21371e2;
            }
            c21371e.mo9221n(c21367a);
        }
    }

    /* renamed from: m1 */
    public final boolean m150344m1(String str) {
        String str2;
        AbstractC21954k.a aVar = AbstractC21954k.Companion;
        C21367a c21367a = (C21367a) this.f142676s.mo9215f();
        if (c21367a != null) {
            str2 = c21367a.m110739f();
        } else {
            str2 = null;
        }
        return C28630a.Companion.m143194d(str, aVar.m114620m(str2));
    }

    /* renamed from: m2 */
    public final boolean m150345m2() {
        C15923mx m150241D0 = m150241D0(2);
        if (m150241D0 == null) {
            return false;
        }
        m150315X1(new a.v0(2, m150241D0));
        AbstractC0924m0.m3582Xn(AbstractC0924m0.m3071G5() + 1);
        this.f142681x.m102585f(m150272j2(2));
        return true;
    }

    @Override // lv.InterfaceC22657e
    /* renamed from: n */
    public boolean mo117250n() {
        boolean z11 = this.f142669O;
        if (z11) {
            this.f142669O = false;
        }
        return z11;
    }

    /* renamed from: n0 */
    public final void m150346n0(int i11, String str, String str2, Object obj, String str3) {
        AbstractC19074t.m100208f(str, "errorMessage");
        AbstractC19074t.m100208f(str2, "action");
        String jSONObject = new JSONObject().put("error_code", i11).put("error_message", str).put("data", obj).put("action", str2).toString();
        AbstractC19074t.m100207e(jSONObject, "toString(...)");
        m150315X1(new a.x(jSONObject, str3));
    }

    /* renamed from: n1 */
    public final void m150347n1() {
        C31083a.m151013b(this.f142656B, new C19602a("h5.event.action.close", ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE, new k()), false, 2, null);
    }

    /* renamed from: n2 */
    public final void m150348n2(String str, JSONObject jSONObject, String str2) {
        AbstractC19074t.m100208f(str, "action");
        AbstractC19074t.m100208f(jSONObject, "options");
        m150315X1(new a.u0(str, jSONObject, str2));
    }

    @Override // lv.InterfaceC22657e
    /* renamed from: o */
    public void mo117251o(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int i11;
        Uri uri;
        if (webResourceResponse != null) {
            i11 = webResourceResponse.getStatusCode();
        } else {
            i11 = -1;
        }
        if (webResourceRequest != null) {
            uri = webResourceRequest.getUrl();
        } else {
            uri = null;
        }
        mo117253r(i11, "onReceivedHttpError", String.valueOf(uri));
    }

    /* renamed from: o1 */
    public final void m150349o1() {
        this.f142661G = false;
        this.f142667M.m147554F();
        C30940g c30940g = this.f142666L;
        if (c30940g != null) {
            c30940g.m150488c();
        }
    }

    /* renamed from: o2 */
    public final void m150350o2(boolean z11, boolean z12, int i11, int i12, int i13, long j11, String str, long j12, long j13) {
        AbstractC28959d.m144634g(z11, z12, i11, i12, i13, j11, str, j12, j13);
    }

    public final void onPause() {
        C31083a.m151013b(this.f142656B, new C19602a("h5.event.paused"), false, 2, null);
    }

    public final void onResume() {
        String m127114D;
        this.f142661G = true;
        try {
            if (this.f142659E != null) {
                AbstractC28127m2 m141614f = AbstractC28127m2.a.m141609d().m141614f(this.f142659E);
                if (m141614f instanceof C28154p2) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", ((C28154p2) m141614f).f131226e);
                    jSONObject.put("uid_to_size", ((C28154p2) m141614f).f131228g.size());
                    jSONObject.put("share_type", ((C28154p2) m141614f).f131227f);
                    String m141919S0 = AbstractC28207v1.m141919S0(m141614f.f131145a, jSONObject.toString());
                    AbstractC19074t.m100205c(m141919S0);
                    m150315X1(new a.x(m141919S0, m141614f.f131147c));
                } else if (m141614f instanceof C28145o2) {
                    JSONObject jSONObject2 = new JSONObject();
                    String str = ((C28145o2) m141614f).f131200e;
                    AbstractC19074t.m100207e(str, "mContent");
                    m127114D = AbstractC24341v.m127114D(str, "\"", "\\\"", false, 4, null);
                    jSONObject2.put("content", m127114D);
                    String m141919S02 = AbstractC28207v1.m141919S0(m141614f.f131145a, jSONObject2.toString());
                    AbstractC19074t.m100205c(m141919S02);
                    m150315X1(new a.x(m141919S02, m141614f.f131147c));
                } else if (m141614f instanceof C28136n2) {
                    this.f142656B.m151014a(new C19602a("h5.event.webview.result", m141614f.f131146b), this.f142675U);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104551d(e11.toString(), new Object[0]);
        }
        C31083a.m151013b(this.f142656B, new C19602a("h5.event.resumed"), false, 2, null);
    }

    @Override // lv.InterfaceC22657e
    /* renamed from: p */
    public boolean mo117252p(String str, String str2, JsResult jsResult) {
        m150315X1(new a.c0(str, str2, jsResult));
        return true;
    }

    /* renamed from: p0 */
    public final void m150351p0(AbstractC19147a abstractC19147a) {
        AbstractC19074t.m100208f(abstractC19147a, "actionBarConfig");
        C21368b c21368b = (C21368b) this.f142679v.mo9215f();
        if (c21368b != null) {
            c21368b.m110751i(abstractC19147a);
        }
        C21371e c21371e = this.f142679v;
        c21371e.mo9221n(c21371e.mo9215f());
    }

    /* renamed from: p2 */
    public final void m150352p2(C18614c c18614c) {
        AbstractC19074t.m100208f(c18614c, "dataJump");
        this.f142682y = c18614c;
    }

    /* renamed from: q0 */
    public final boolean m150353q0() {
        return this.f142662H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:            if (r11 == (-2)) goto L106;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:            if (fn0.AbstractC19074t.m100204b(r0, r13) != false) goto L67;     */
    @Override // lv.InterfaceC22657e
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo117253r(int i11, String str, String str2) {
        boolean z11;
        String str3;
        String str4;
        String str5;
        String str6;
        AbstractC20110a.f98889a.mo104551d("failing url: " + str2, new Object[0]);
        C21369c c21369c = null;
        if (!this.f142660F) {
            C21367a c21367a = (C21367a) this.f142676s.mo9215f();
            if (c21367a != null) {
                str6 = c21367a.m110739f();
            } else {
                str6 = null;
            }
        }
        if (AbstractC19074t.m100204b(m150361v0(), C18613b.f93598q)) {
            C21367a c21367a2 = (C21367a) this.f142676s.mo9215f();
            if (c21367a2 != null) {
                str5 = c21367a2.m110739f();
            } else {
                str5 = null;
            }
            if (AbstractC19074t.m100204b(str5, str2)) {
                if (i11 != -6) {
                    if (i11 != -8) {
                    }
                }
                C1761c0 c1761c0 = this.f142677t;
                C21369c c21369c2 = (C21369c) c1761c0.mo9215f();
                if (c21369c2 != null) {
                    c21369c = C21369c.m110759b(c21369c2, false, 0, true, i11, 3, null);
                }
                c1761c0.mo9224q(c21369c);
            }
        } else {
            if (i11 != -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            try {
                if (this.f142657C) {
                    C21367a c21367a3 = (C21367a) this.f142676s.mo9215f();
                    if (c21367a3 != null) {
                        str3 = c21367a3.m110739f();
                    } else {
                        str3 = null;
                    }
                    if (str3 != null && str3.length() != 0) {
                        C21367a c21367a4 = (C21367a) this.f142676s.mo9215f();
                        if (c21367a4 != null) {
                            str4 = c21367a4.m110739f();
                        } else {
                            str4 = null;
                        }
                        AbstractC28959d.m144633f(new C18619h(str4, 0, 0L, m150361v0()), i11, str2);
                        this.f142657C = false;
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        m150315X1(new a.i0(i11, str, str2));
        m150315X1(new a.i0(i11, str, str2));
    }

    /* renamed from: r0 */
    public final C21371e m150354r0() {
        return this.f142676s;
    }

    @Override // lv.InterfaceC22657e
    /* renamed from: s */
    public void mo117254s(String[] strArr, String str, GeolocationPermissions.Callback callback) {
        m150315X1(new a.q0(strArr, str, callback));
    }

    /* renamed from: s0 */
    public final void m150355s0(String str) {
        long m114623r = AbstractC21954k.Companion.m114623r() - this.f142668N;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m114623r);
        m150315X1(new a.x(sb2.toString(), str));
    }

    /* renamed from: s1 */
    public final void m150356s1(String str) {
        m150315X1(new a.k(str));
    }

    /* renamed from: t0 */
    public final int m150357t0() {
        return WebBaseView.Companion.m86835h();
    }

    /* renamed from: t1 */
    public final void m150358t1(String str, boolean z11) {
        m150315X1(new a.l(str, z11));
    }

    /* renamed from: u0 */
    public final String m150359u0() {
        String str;
        AbstractC21954k.a aVar = AbstractC21954k.Companion;
        C21367a c21367a = (C21367a) this.f142676s.mo9215f();
        if (c21367a == null || (str = c21367a.m110739f()) == null) {
            str = "";
        }
        return aVar.m114620m(str);
    }

    /* renamed from: u1 */
    public final void m150360u1() {
        m150315X1(a.m.f142724a);
    }

    /* renamed from: v0 */
    public final C18613b m150361v0() {
        return this.f142682y.m98353d();
    }

    /* renamed from: v1 */
    public final void m150362v1(String str, String str2, String str3, String str4, String str5) {
        m150315X1(new a.n(str, str2, 2, str3, str4, str5));
    }

    @Override // lv.InterfaceC22657e
    /* renamed from: w */
    public void mo117255w(SslErrorHandler sslErrorHandler, SslError sslError) {
        AbstractC19074t.m100208f(sslErrorHandler, "handler");
        AbstractC19074t.m100208f(sslError, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        m150315X1(new a.n0(sslErrorHandler, sslError));
    }

    /* renamed from: w0 */
    public final C18614c m150363w0() {
        return this.f142682y;
    }

    /* renamed from: w1 */
    public final void m150364w1() {
        m150315X1(a.o.f142735a);
    }

    /* renamed from: x0 */
    public final C21371e m150365x0() {
        return this.f142679v;
    }

    /* renamed from: x1 */
    public final void m150366x1(List list, int i11, String str, String str2, String str3) {
        AbstractC19074t.m100208f(list, "filePaths");
        m150315X1(new a.p(list, i11, 2, str, str2, str3));
    }

    /* renamed from: y0 */
    public final C1761c0 m150367y0() {
        return this.f142677t;
    }

    /* renamed from: y1 */
    public final void m150368y1(String str) {
        m150315X1(new a.q(str));
    }

    @Override // lv.InterfaceC22657e
    /* renamed from: z */
    public void mo117256z(View view, int i11, WebChromeClient.CustomViewCallback customViewCallback) {
        m150315X1(new a.l0(view, i11, customViewCallback));
    }

    /* renamed from: z1 */
    public final void m150369z1(String str) {
        m150315X1(new a.r(str));
    }
}
