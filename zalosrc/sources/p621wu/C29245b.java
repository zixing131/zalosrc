package p621wu;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.VideoView;
import com.zing.zalo.libwebview.browser.p067ui.ZaloSystemWebView;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import lv.InterfaceC22653a;
import lv.InterfaceC22654b;
import lv.InterfaceC22657e;
import on0.AbstractC24341v;
import p307kv.AbstractC21954k;
import pm0.AbstractC24845f;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;

/* renamed from: wu.b */
/* loaded from: classes4.dex */
public final class C29245b {
    public static final b Companion = new b(null);

    /* renamed from: p */
    private static final String f135436p = "javaClass";

    /* renamed from: a */
    private final ZaloSystemWebView f135437a;

    /* renamed from: b */
    private final InterfaceC22653a f135438b;

    /* renamed from: c */
    private ValueCallback f135439c;

    /* renamed from: d */
    private WebChromeClient.FileChooserParams f135440d;

    /* renamed from: e */
    private String f135441e;

    /* renamed from: f */
    private final e f135442f;

    /* renamed from: g */
    private final d f135443g;

    /* renamed from: h */
    private FrameLayout f135444h;

    /* renamed from: i */
    private View f135445i;

    /* renamed from: j */
    private int f135446j;

    /* renamed from: k */
    private boolean f135447k;

    /* renamed from: l */
    private boolean f135448l;

    /* renamed from: m */
    private VideoView f135449m;

    /* renamed from: n */
    private final InterfaceC24854k f135450n;

    /* renamed from: o */
    private WebChromeClient.CustomViewCallback f135451o;

    /* renamed from: wu.b$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC22654b {
        a() {
        }

        @Override // lv.InterfaceC22654b
        public void onDownloadStart(String str, String str2, String str3, String str4, long j11) {
            C29245b.this.m146011a().mo81379Sc(str, str3);
        }
    }

    /* renamed from: wu.b$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: wu.b$c */
    /* loaded from: classes4.dex */
    public final class c implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener {
        public c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            AbstractC19074t.m100208f(mediaPlayer, "mp");
            C29245b.this.m146013d();
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i11, int i12) {
            AbstractC19074t.m100208f(mediaPlayer, "mp");
            return false;
        }
    }

    /* renamed from: wu.b$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC29244a {
        d() {
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            return C29245b.this.m146011a().mo86771g8();
        }

        @Override // android.webkit.WebChromeClient
        public View getVideoLoadingProgressView() {
            return C29245b.this.m146011a().mo86725Fs();
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            try {
                onShowCustomView(view, C29245b.this.m146011a().getRequestedOrientation(), customViewCallback);
                WebChromeClient m146005a = m146005a();
                if (m146005a != null) {
                    m146005a.onShowCustomView(view, customViewCallback);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            return C29245b.this.m146015f(webView, valueCallback, fileChooserParams);
        }
    }

    /* renamed from: wu.b$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC29248e {

        /* renamed from: wu.b$e$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC19075u implements InterfaceC18509p {

            /* renamed from: q */
            final /* synthetic */ C19059j0 f135456q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C19059j0 c19059j0) {
                super(2);
                this.f135456q = c19059j0;
            }

            /* renamed from: a */
            public final void m146019a(String str, InputStream inputStream) {
                if (inputStream != null) {
                    this.f135456q.f94941p = new WebResourceResponse(str, null, inputStream);
                }
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: pC */
            public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
                m146019a((String) obj, (InputStream) obj2);
                return C24848g0.f119245a;
            }
        }

        e() {
        }

        @Override // p621wu.AbstractC29248e, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            String m129183b;
            Uri uri;
            C19059j0 c19059j0 = new C19059j0();
            c19059j0.f94941p = super.shouldInterceptRequest(webView, webResourceRequest);
            try {
                InterfaceC22653a m146011a = C29245b.this.m146011a();
                if (webResourceRequest != null) {
                    uri = webResourceRequest.getUrl();
                } else {
                    uri = null;
                }
                m146011a.mo81391ow(String.valueOf(uri), new a(c19059j0));
            } catch (Exception e11) {
                AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                String simpleName = e.class.getSimpleName();
                AbstractC19074t.m100207e(simpleName, "getSimpleName(...)");
                AbstractC20110a.b m104564x = aVar.m104564x(simpleName);
                m129183b = AbstractC24845f.m129183b(e11);
                m104564x.mo104556o(8, "shouldInterceptRequest: " + m129183b, new Object[0]);
            }
            return (WebResourceResponse) c19059j0.f94941p;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            try {
                WebViewClient m146023a = m146023a();
                if (m146023a != null) {
                    m146023a.shouldOverrideUrlLoading(webView, str);
                }
                if (str == null) {
                    return false;
                }
                if (!C29245b.this.m146011a().mo86736Ow(str)) {
                    return false;
                }
                return true;
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        }
    }

    /* renamed from: wu.b$f */
    /* loaded from: classes4.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {
        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c mo12V4() {
            return new c();
        }
    }

    public C29245b(ZaloSystemWebView zaloSystemWebView, InterfaceC22653a interfaceC22653a) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(zaloSystemWebView, "zaloSystemWebView");
        AbstractC19074t.m100208f(interfaceC22653a, "mHandlerListener");
        this.f135437a = zaloSystemWebView;
        this.f135438b = interfaceC22653a;
        e eVar = new e();
        this.f135442f = eVar;
        d dVar = new d();
        this.f135443g = dVar;
        m129210a = AbstractC24856m.m129210a(new f());
        this.f135450n = m129210a;
        m146009i(eVar, dVar);
        zaloSystemWebView.setDownloadListener(new a());
    }

    /* renamed from: b */
    private final c m146007b() {
        return (c) this.f135450n.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m146008h(String str) {
        Intent[] intentArr;
        String str2;
        File file;
        Intent intent = null;
        if (AbstractC19074t.m100204b(str, "*/*") && this.f135438b.mo86749X7(new String[]{"android.permission.CAMERA"})) {
            Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
            if (intent2.resolveActivity(this.f135437a.getContext().getPackageManager()) != null) {
                try {
                    file = AbstractC21954k.Companion.m114614f();
                    try {
                        intent2.putExtra("PhotoPath", this.f135441e);
                    } catch (IOException e11) {
                        e = e11;
                        AbstractC20110a.f98889a.mo104553f(e, "Unable to create Image File", new Object[0]);
                        if (file != null) {
                        }
                        Intent intent3 = new Intent("android.intent.action.GET_CONTENT");
                        intent3.addCategory("android.intent.category.OPENABLE");
                        intent3.setType(str);
                        if (intent == null) {
                        }
                        Intent intent4 = new Intent("android.intent.action.CHOOSER");
                        if (!AbstractC19074t.m100204b(str, "*/*")) {
                        }
                        intent4.putExtra("android.intent.extra.INTENT", intent3);
                        intent4.putExtra("android.intent.extra.TITLE", str2);
                        intent4.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
                        this.f135438b.startActivityForResult(intent4, 51426);
                    }
                } catch (IOException e12) {
                    e = e12;
                    file = null;
                }
                if (file != null) {
                    this.f135441e = "file:" + file.getAbsolutePath();
                    intent2.putExtra("output", Uri.fromFile(file));
                }
            }
            intent = intent2;
        }
        Intent intent32 = new Intent("android.intent.action.GET_CONTENT");
        intent32.addCategory("android.intent.category.OPENABLE");
        intent32.setType(str);
        if (intent == null) {
            intentArr = new Intent[]{intent};
        } else {
            intentArr = new Intent[0];
        }
        Intent intent42 = new Intent("android.intent.action.CHOOSER");
        if (!AbstractC19074t.m100204b(str, "*/*")) {
            str2 = "Image Chooser";
        } else {
            str2 = "File Chooser";
        }
        intent42.putExtra("android.intent.extra.INTENT", intent32);
        intent42.putExtra("android.intent.extra.TITLE", str2);
        intent42.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
        this.f135438b.startActivityForResult(intent42, 51426);
    }

    /* renamed from: i */
    private final void m146009i(AbstractC29248e abstractC29248e, AbstractC29244a abstractC29244a) {
        this.f135437a.setWebChromeClient(abstractC29244a);
        this.f135437a.setWebViewClient(abstractC29248e);
    }

    /* renamed from: l */
    private final void m146010l(boolean z11, boolean z12) {
        this.f135447k = z11;
        this.f135448l = z12;
        Window window = this.f135438b.getWindow();
        if (window == null) {
            return;
        }
        View decorView = window.getDecorView();
        AbstractC19074t.m100206d(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) decorView;
        if (z11) {
            window.setFlags(1024, 1024);
            if (z12) {
                viewGroup.setSystemUiVisibility(5894);
                return;
            }
            return;
        }
        window.clearFlags(1024);
        viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() & (-4103));
    }

    /* renamed from: a */
    public final InterfaceC22653a m146011a() {
        return this.f135438b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m146012c(int i11, int i12, Intent intent) {
        Uri[] uriArr;
        ValueCallback valueCallback;
        if (i11 == 51426) {
            if (i12 == -1) {
                if (this.f135439c != null) {
                    if (intent != null) {
                        if (this.f135440d != null) {
                            uriArr = WebChromeClient.FileChooserParams.parseResult(i12, intent);
                            valueCallback = this.f135439c;
                            if (valueCallback != null) {
                                valueCallback.onReceiveValue(uriArr);
                            }
                        } else {
                            Uri parse = Uri.parse(intent.getDataString());
                            AbstractC19074t.m100207e(parse, "parse(...)");
                            uriArr = new Uri[]{parse};
                        }
                    } else {
                        String str = this.f135441e;
                        if (str != null) {
                            Uri parse2 = Uri.parse(str);
                            AbstractC19074t.m100207e(parse2, "parse(...)");
                            uriArr = new Uri[]{parse2};
                        }
                        uriArr = null;
                        valueCallback = this.f135439c;
                        if (valueCallback != null) {
                        }
                    }
                    valueCallback = this.f135439c;
                    if (valueCallback != null) {
                    }
                }
            } else {
                ValueCallback valueCallback2 = this.f135439c;
                if (valueCallback2 != null && valueCallback2 != null) {
                    valueCallback2.onReceiveValue(null);
                }
            }
            this.f135439c = null;
            this.f135441e = null;
        }
    }

    /* renamed from: d */
    public final void m146013d() {
        View view;
        if (this.f135445i != null && this.f135451o != null) {
            this.f135437a.setVisibility(0);
            m146010l(false, false);
            try {
                View view2 = this.f135445i;
                if (view2 != null) {
                    view2.setKeepScreenOn(false);
                }
            } catch (SecurityException unused) {
                AbstractC20110a.f98889a.mo104551d("WebView is not allowed to keep the screen on", new Object[0]);
            }
            Window window = this.f135438b.getWindow();
            if (window != null) {
                view = window.getDecorView();
            } else {
                view = null;
            }
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout != null) {
                frameLayout.removeView(this.f135444h);
            }
            this.f135444h = null;
            this.f135445i = null;
            VideoView videoView = this.f135449m;
            if (videoView != null) {
                videoView.setOnErrorListener(null);
                videoView.setOnCompletionListener(null);
            }
            this.f135449m = null;
            this.f135438b.setRequestedOrientation(this.f135446j);
        }
    }

    /* renamed from: e */
    public final void m146014e(View view, int i11, WebChromeClient.CustomViewCallback customViewCallback) {
        View view2;
        if (view == null) {
            return;
        }
        if (this.f135445i != null && customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            return;
        }
        if (this.f135438b.mo86746W7() == null) {
            return;
        }
        try {
            view.setKeepScreenOn(true);
        } catch (SecurityException unused) {
            AbstractC20110a.f98889a.mo104551d("WebView is not allowed to keep the screen on", new Object[0]);
        }
        int requestedOrientation = this.f135438b.getRequestedOrientation();
        this.f135446j = requestedOrientation;
        if (requestedOrientation != i11) {
            this.f135438b.setRequestedOrientation(i11);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 16);
        this.f135445i = view;
        Window window = this.f135438b.getWindow();
        if (window != null) {
            view2 = window.getDecorView();
        } else {
            view2 = null;
        }
        AbstractC19074t.m100206d(view2, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) view2;
        Context mo86746W7 = this.f135438b.mo86746W7();
        AbstractC19074t.m100205c(mo86746W7);
        FrameLayout frameLayout2 = new FrameLayout(mo86746W7);
        this.f135444h = frameLayout2;
        frameLayout2.setBackgroundColor(-16777216);
        FrameLayout frameLayout3 = this.f135444h;
        if (frameLayout3 != null) {
            frameLayout3.addView(this.f135445i, layoutParams);
        }
        if (view instanceof FrameLayout) {
            View focusedChild = ((FrameLayout) view).getFocusedChild();
            if (focusedChild instanceof VideoView) {
                VideoView videoView = (VideoView) focusedChild;
                this.f135449m = videoView;
                if (videoView != null) {
                    videoView.setOnErrorListener(m146007b());
                }
                VideoView videoView2 = this.f135449m;
                if (videoView2 != null) {
                    videoView2.setOnCompletionListener(m146007b());
                }
                VideoView videoView3 = this.f135449m;
                if (videoView3 != null) {
                    videoView3.start();
                }
            }
        }
        frameLayout.addView(this.f135444h, layoutParams);
        m146010l(true, true);
        this.f135437a.setVisibility(8);
        this.f135451o = customViewCallback;
    }

    /* renamed from: f */
    public boolean m146015f(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        boolean m127120J;
        boolean m127120J2;
        String str = "*/*";
        int i11 = 0;
        if (fileChooserParams != null) {
            try {
                String[] acceptTypes = fileChooserParams.getAcceptTypes();
                AbstractC19074t.m100207e(acceptTypes, "getAcceptTypes(...)");
                int i12 = 0;
                for (String str2 : acceptTypes) {
                    if (str2 != null) {
                        m127120J = AbstractC24341v.m127120J(str2, "image", false, 2, null);
                        if (!m127120J) {
                            m127120J2 = AbstractC24341v.m127120J(str2, "video", false, 2, null);
                            if (m127120J2) {
                                i12 |= 2;
                            } else if (AbstractC19074t.m100204b(str2, "zcamera/photo-backfacing")) {
                                i12 |= 4;
                            } else if (AbstractC19074t.m100204b(str2, "zcamera/photo-frontfacing")) {
                                i12 |= 8;
                            } else {
                                if (!AbstractC19074t.m100204b(str2, ".zip") && !AbstractC19074t.m100204b(str2, "application/zip")) {
                                }
                                str = "application/zip";
                            }
                        } else {
                            i12 |= 1;
                        }
                    }
                }
                i11 = i12;
            } catch (Exception e11) {
                e11.printStackTrace();
                return true;
            }
        }
        if (i11 != 0) {
            this.f135438b.mo86784oI(webView, valueCallback, i11);
            return true;
        }
        ValueCallback valueCallback2 = this.f135439c;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        this.f135439c = valueCallback;
        this.f135440d = fileChooserParams;
        m146008h(str);
        return true;
    }

    /* renamed from: g */
    public void m146016g(boolean z11) {
        if (z11) {
            m146010l(this.f135447k, this.f135448l);
        }
    }

    /* renamed from: j */
    public final void m146017j(InterfaceC22657e interfaceC22657e) {
        AbstractC19074t.m100208f(interfaceC22657e, "webViewClientListener");
        this.f135443g.m146006b(interfaceC22657e);
        this.f135442f.m146025c(interfaceC22657e);
    }

    /* renamed from: k */
    public final void m146018k(WebViewClient webViewClient) {
        this.f135442f.m146024b(webViewClient);
    }
}
