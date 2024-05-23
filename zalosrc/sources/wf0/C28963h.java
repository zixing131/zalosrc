package wf0;

import ag0.AbstractC0837p0;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.webview.Helpers;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import hu.AbstractC20130d;
import in.C20627a;
import in.InterfaceC20630d;
import java.io.File;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Random;
import lu.C22652b;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.AbstractC23204s0;
import me0.AbstractC23238v2;
import me0.AbstractC23280z4;
import me0.C23055e5;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p307kv.AbstractC21954k;
import vg.AbstractC28207v1;
import vg.C28023b6;
import vu.C28630a;

/* renamed from: wf0.h */
/* loaded from: classes5.dex */
public final class C28963h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final InterfaceC28960e f134051a;

    /* renamed from: c */
    private int f134053c;

    /* renamed from: d */
    private C20627a f134054d;

    /* renamed from: e */
    private InterfaceC20630d f134055e;

    /* renamed from: g */
    private String f134057g;

    /* renamed from: h */
    private String f134058h;

    /* renamed from: b */
    private final String f134052b = String.valueOf(new Random().nextInt());

    /* renamed from: f */
    private final int f134056f = new Random().nextInt();

    /* renamed from: i */
    private final C28964i f134059i = C28964i.Companion.m144662a();

    /* renamed from: wf0.h$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: wf0.h$b */
    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC20630d {

        /* renamed from: b */
        final /* synthetic */ int f134061b;

        /* renamed from: c */
        final /* synthetic */ String f134062c;

        /* renamed from: d */
        final /* synthetic */ String f134063d;

        /* renamed from: e */
        final /* synthetic */ String f134064e;

        /* renamed from: f */
        final /* synthetic */ String f134065f;

        b(int i11, String str, String str2, String str3, String str4) {
            this.f134061b = i11;
            this.f134062c = str;
            this.f134063d = str2;
            this.f134064e = str3;
            this.f134065f = str4;
        }

        @Override // in.InterfaceC20630d
        /* renamed from: a */
        public void mo91783a(String str, boolean z11) {
            if (str != null) {
                C28963h.this.m144649r(str, this.f134061b, this.f134062c, this.f134063d);
            }
        }

        @Override // in.InterfaceC20630d
        /* renamed from: b */
        public void mo91784b(int i11, boolean z11) {
            C28963h.this.m144648q(this.f134062c, this.f134063d, i11, AbstractC23136l9.m118743r0(AbstractC8020f0.unknown_error));
        }

        @Override // in.InterfaceC20630d
        /* renamed from: c */
        public void mo91785c(long j11, String str) {
            int i11 = (int) j11;
            if (i11 > C28963h.this.m144654p()) {
                if (i11 == 100 || i11 > C28963h.this.m144654p() + 5) {
                    C28963h.this.m144655s(i11);
                    C28023b6.m141250h0().m141380s2(C28963h.this.m144653l(), C28963h.this.f134052b, null, null, this.f134064e, C28963h.this.m144654p());
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, this.f134065f);
                    jSONObject.put("progress", C28963h.this.m144654p());
                    String str2 = this.f134062c;
                    if (str2 != null) {
                        jSONObject.put("callback", str2);
                    }
                    jSONObject.put("action", this.f134063d);
                    InterfaceC28960e interfaceC28960e = C28963h.this.f134051a;
                    if (interfaceC28960e != null) {
                        interfaceC28960e.mo142109b(jSONObject);
                    }
                }
            }
        }
    }

    public C28963h(InterfaceC28960e interfaceC28960e) {
        this.f134051a = interfaceC28960e;
    }

    /* renamed from: g */
    private final void m144641g(String str, String str2) {
        m144648q(str, str2, -101, AbstractC23136l9.m118743r0(AbstractC8020f0.str_webview_mime_type_not_supported));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:            if (r1 != false) goto L15;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:            m144641g(r19, r20);     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:            if (r1 == false) goto L19;     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void m144642h(String str, int i11, String str2, String str3) {
        boolean m127118H;
        boolean m127118H2;
        this.f134054d = new C20627a(false);
        String m144647o = m144647o(str);
        if (m144647o == null) {
            m144641g(str2, str3);
            return;
        }
        if (AbstractC19074t.m100204b(str3, "action.save.image.gallery")) {
            m127118H2 = AbstractC24341v.m127118H(m144647o, "image", true);
        }
        if (AbstractC19074t.m100204b(str3, "action.save.video.gallery")) {
            m127118H = AbstractC24341v.m127118H(m144647o, "video", true);
        }
        String m144646n = m144646n(this, str, null, m144647o, 2, null);
        this.f134053c = 0;
        b bVar = new b(i11, str2, str3, new File(m144646n).getName(), str);
        this.f134055e = bVar;
        C20627a c20627a = this.f134054d;
        if (c20627a != null) {
            c20627a.m107419g0(bVar);
        }
        C20627a c20627a2 = this.f134054d;
        if (c20627a2 != null) {
            c20627a2.m107420h0(m144646n);
        }
        C28023b6.m141250h0().m141395x1(this.f134056f, this.f134052b, C28023b6.m141261q0(m144646n), m144646n, null);
        C20627a c20627a3 = this.f134054d;
        if (c20627a3 != null) {
            c20627a3.m107488m(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m144643j(String str, C28963h c28963h, String str2, int i11, String str3, String str4) {
        AbstractC19074t.m100208f(c28963h, "this$0");
        AbstractC19074t.m100208f(str4, "$action");
        if (!URLUtil.isNetworkUrl(str)) {
            String m144645m = c28963h.m144645m(str, str2, null);
            C28023b6.m141250h0().m141395x1(c28963h.f134056f, c28963h.f134052b, C28023b6.m141261q0(m144645m), m144645m, null);
            File file = new File(m144645m);
            if (file.exists()) {
                file.delete();
            }
            String m114608I = AbstractC21954k.Companion.m114608I(str, file);
            if (m114608I != null) {
                c28963h.m144649r(m114608I, i11, str3, str4);
                return;
            } else {
                c28963h.m144641g(str3, str4);
                return;
            }
        }
        c28963h.m144642h(str, i11, str3, str4);
    }

    /* renamed from: k */
    private final String m144644k(String str) {
        if (Build.VERSION.SDK_INT < 29) {
            return AbstractC20130d.m104855S() + AbstractC19646n0.m102978g0(str, null, String.valueOf(System.currentTimeMillis()));
        }
        return AbstractC20130d.f99272c + File.separator + AbstractC19646n0.m102978g0(str, null, String.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: m */
    private final String m144645m(String str, String str2, String str3) {
        String path;
        String guessFileName = URLUtil.guessFileName(str, str2, str3);
        if (guessFileName != null) {
            try {
                if (guessFileName.length() != 0) {
                    path = new File(AbstractC23204s0.m119555f(), guessFileName).getPath();
                    AbstractC19074t.m100205c(path);
                    return path;
                }
            } catch (Exception unused) {
                String path2 = new File(AbstractC23204s0.m119555f(), String.valueOf(System.currentTimeMillis())).getPath();
                AbstractC19074t.m100205c(path2);
                return path2;
            }
        }
        path = Helpers.m89628d(str);
        AbstractC19074t.m100205c(path);
        return path;
    }

    /* renamed from: n */
    static /* synthetic */ String m144646n(C28963h c28963h, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        return c28963h.m144645m(str, str2, str3);
    }

    /* renamed from: o */
    private final String m144647o(String str) {
        boolean m127149O;
        try {
            String m120353t = AbstractC23280z4.m120353t(Uri.parse(str));
            if (m120353t == null) {
                m120353t = ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection())).getHeaderField("Content-Type");
            }
            if (m120353t == null) {
                return null;
            }
            Iterator it = C28630a.f132728u.iterator();
            while (it.hasNext()) {
                m127149O = AbstractC24342w.m127149O(m120353t, (String) it.next(), false, 2, null);
                if (m127149O) {
                    return null;
                }
            }
            return m120353t;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final void m144648q(String str, String str2, int i11, String str3) {
        Integer num;
        InterfaceC28960e interfaceC28960e;
        Integer num2;
        String str4 = this.f134057g;
        if (str4 != null) {
            this.f134059i.m144661f(str4);
        }
        if (str3 != null) {
            m144650t(str3, str);
        }
        C20627a c20627a = this.f134054d;
        Integer num3 = null;
        if (c20627a != null) {
            num = Integer.valueOf(c20627a.m107411Y());
        } else {
            num = null;
        }
        String m117235b = C22652b.m117235b(num);
        if (str != null && str2 != null && (interfaceC28960e = this.f134051a) != null) {
            C20627a c20627a2 = this.f134054d;
            if (c20627a2 != null) {
                num2 = Integer.valueOf(c20627a2.m107409W());
            } else {
                num2 = null;
            }
            C20627a c20627a3 = this.f134054d;
            if (c20627a3 != null) {
                num3 = Integer.valueOf(c20627a3.m107411Y());
            }
            String m141899N0 = AbstractC28207v1.m141899N0(i11, str3 + ". " + m117235b + " (" + num2 + ", " + num3 + ")", str2);
            AbstractC19074t.m100207e(m141899N0, "genJsonErrorSpecific(...)");
            interfaceC28960e.mo142110c(str, m141899N0);
        }
        C28023b6.m141250h0().m141301M(this.f134052b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00cb, code lost:            if (r9 == false) goto L24;     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m144649r(String str, int i11, String str2, String str3) {
        boolean z11;
        boolean z12;
        String m120300L;
        long length;
        InterfaceC28960e interfaceC28960e;
        String m120353t;
        boolean m127149O;
        boolean m127149O2;
        boolean m127120J;
        String str4 = this.f134057g;
        if (str4 != null) {
            this.f134059i.m144661f(str4);
        }
        if (i11 != 0) {
            InterfaceC28960e interfaceC28960e2 = this.f134051a;
            if (interfaceC28960e2 != null) {
                interfaceC28960e2.mo142108a(str, i11, this.f134052b);
                return;
            }
            return;
        }
        File file = new File(str);
        String m104842L0 = AbstractC20130d.m104842L0();
        AbstractC19074t.m100207e(m104842L0, "getZaloExternalStorageDirectory(...)");
        String m144644k = m144644k(file.getName());
        File file2 = new File(m144644k);
        int i12 = Build.VERSION.SDK_INT;
        SensitiveData sensitiveData = null;
        if (i12 >= 29) {
            m127120J = AbstractC24341v.m127120J(m144644k, m104842L0, false, 2, null);
            if (!m127120J) {
                z11 = false;
                if (str3 != null) {
                    switch (str3.hashCode()) {
                        case -1575298667:
                            if (str3.equals("action.save.file") && (m120353t = AbstractC23280z4.m120353t(Uri.fromFile(file))) != null) {
                                m127149O = AbstractC24342w.m127149O(m120353t, "image", false, 2, null);
                                if (!m127149O) {
                                    m127149O2 = AbstractC24342w.m127149O(m120353t, "video", false, 2, null);
                                    break;
                                }
                            }
                            break;
                        case -1270769434:
                            if (str3.equals("action.save.video.gallery")) {
                                sensitiveData = new SensitiveData("gallery_action_save_video_gallery", "action_common", null, 4, null);
                                z12 = true;
                                break;
                            }
                            break;
                        case 362368454:
                            if (str3.equals("action.save.image.gallery")) {
                                sensitiveData = new SensitiveData("gallery_action_save_image_gallery", "action_common", null, 4, null);
                                z12 = true;
                                break;
                            }
                            break;
                        case 1845870048:
                            if (str3.equals("action.webview.save.file")) {
                                sensitiveData = new SensitiveData("gallery_action_webview_save_file", "action_common", null, 4, null);
                                z12 = true;
                                break;
                            }
                            break;
                    }
                    if (z11) {
                        AbstractC23238v2.m119718c(file, file2);
                        if (z12) {
                            AbstractC23280z4.m120300L(m144644k, file2.getName(), true, sensitiveData);
                        }
                        m120300L = file2.getPath();
                    } else {
                        m120300L = AbstractC23280z4.m120300L(file.getAbsolutePath(), file.getName(), true, sensitiveData);
                    }
                    if (TextUtils.isEmpty(m120300L)) {
                        m144648q(str2, str3, -1, AbstractC23136l9.m118743r0(AbstractC8020f0.unknown_error));
                    } else {
                        if (str2 != null && str3 != null && (interfaceC28960e = this.f134051a) != null) {
                            String m141919S0 = AbstractC28207v1.m141919S0(str3, JSONObject.quote(m120300L));
                            AbstractC19074t.m100207e(m141919S0, "genJsonSuccess(...)");
                            interfaceC28960e.mo142110c(str2, m141919S0);
                        }
                        if (i12 < 29) {
                            length = file2.length();
                        } else {
                            length = file.length();
                        }
                        long j11 = length;
                        String str5 = this.f134058h;
                        if (str5 == null) {
                            str5 = AbstractC23136l9.m118746s0(AbstractC8020f0.browser_download_message_download_finished, m144644k);
                            AbstractC19074t.m100207e(str5, "getString(...)");
                        }
                        m144650t(str5, str2);
                        C28023b6.m141250h0().m141373q1(this.f134056f, this.f134052b, C28023b6.m141261q0(m120300L), str5, j11);
                    }
                    if (file.exists() && !AbstractC19074t.m100204b(file, file2)) {
                        file.delete();
                        return;
                    }
                    return;
                }
                z12 = false;
                if (z11) {
                }
                if (TextUtils.isEmpty(m120300L)) {
                }
                if (file.exists()) {
                    return;
                } else {
                    return;
                }
            }
        }
        z11 = true;
        if (str3 != null) {
        }
        z12 = false;
        if (z11) {
        }
        if (TextUtils.isEmpty(m120300L)) {
        }
        if (file.exists()) {
        }
    }

    /* renamed from: t */
    private final void m144650t(final String str, String str2) {
        if (str2 != null) {
            return;
        }
        AbstractC19444a.m101697e(new Runnable() { // from class: wf0.g
            @Override // java.lang.Runnable
            public final void run() {
                C28963h.m144651u(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final void m144651u(String str) {
        AbstractC19074t.m100208f(str, "$msg");
        ToastUtils.showMess(str);
    }

    /* renamed from: i */
    public final void m144652i(final String str, final int i11, final String str2, final String str3, final String str4, String str5) {
        AbstractC19074t.m100208f(str4, "action");
        this.f134058h = str5;
        if (str == null) {
            m144648q(str3, str4, -1, AbstractC23136l9.m118743r0(AbstractC8020f0.unknown_error));
            return;
        }
        if (!C23055e5.m118272g(true)) {
            return;
        }
        if (!AbstractC23238v2.m119726k()) {
            ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
            return;
        }
        if (Build.VERSION.SDK_INT <= 29 && !AbstractC23034c6.m118121G()) {
            InterfaceC28960e interfaceC28960e = this.f134051a;
            if (interfaceC28960e != null) {
                interfaceC28960e.mo142111t2();
                return;
            }
            return;
        }
        if (this.f134059i.m144658c(str)) {
            m144648q(str3, str4, -102, AbstractC23136l9.m118743r0(AbstractC8020f0.str_webview_file_is_being_downloaded));
        } else {
            this.f134057g = str;
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: wf0.f
                @Override // java.lang.Runnable
                public final void run() {
                    C28963h.m144643j(str, this, str2, i11, str3, str4);
                }
            });
        }
    }

    /* renamed from: l */
    public final int m144653l() {
        return this.f134056f;
    }

    /* renamed from: p */
    public final int m144654p() {
        return this.f134053c;
    }

    /* renamed from: s */
    public final void m144655s(int i11) {
        this.f134053c = i11;
    }
}
