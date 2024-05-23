package me0;

import af0.C0774b;
import ag0.AbstractC0837p0;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.SensitiveDataException;
import com.zing.zalo.utils.ToastUtils;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import hu.C20131e;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import me0.ClipboardManagerOnPrimaryClipChangedListenerC23245w;
import mm0.AbstractC23350e;
import oe0.C24243b;
import oe0.C24244c;
import on0.AbstractC24342w;
import p006a0.C0012a;
import p056cj.C3542j;
import p716zh.C32205z8;
import qm0.AbstractC25332a0;
import th.AbstractC26681b;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: me0.w */
/* loaded from: classes4.dex */
public final class ClipboardManagerOnPrimaryClipChangedListenerC23245w implements ClipboardManager.OnPrimaryClipChangedListener {

    /* renamed from: a */
    public static final ClipboardManagerOnPrimaryClipChangedListenerC23245w f112633a = new ClipboardManagerOnPrimaryClipChangedListenerC23245w();

    /* renamed from: b */
    private static Uri f112634b;

    /* renamed from: c */
    private static C0012a f112635c;

    /* renamed from: me0.w$a */
    /* loaded from: classes4.dex */
    public static final class a extends Enum {

        /* renamed from: p */
        public static final a f112636p = new a("INVALID_PATH", 0);

        /* renamed from: q */
        public static final a f112637q = new a("UNKNOWN", 1);

        /* renamed from: r */
        public static final a f112638r = new a("SEM", 2);

        /* renamed from: s */
        private static final /* synthetic */ a[] f112639s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f112640t;

        static {
            a[] m119778b = m119778b();
            f112639s = m119778b;
            f112640t = AbstractC30166b.m148796a(m119778b);
        }

        private a(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ a[] m119778b() {
            return new a[]{f112636p, f112637q, f112638r};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f112639s.clone();
        }
    }

    /* renamed from: me0.w$b */
    /* loaded from: classes4.dex */
    public interface b {
        /* renamed from: a */
        void mo119779a(a aVar, String str, boolean z11);

        /* renamed from: b */
        void mo119780b(boolean z11);
    }

    /* renamed from: me0.w$c */
    /* loaded from: classes4.dex */
    public static final class c implements b {

        /* renamed from: a */
        final /* synthetic */ Context f112641a;

        c(Context context) {
            this.f112641a = context;
        }

        @Override // me0.ClipboardManagerOnPrimaryClipChangedListenerC23245w.b
        /* renamed from: a */
        public void mo119779a(a aVar, String str, boolean z11) {
            AbstractC19074t.m100208f(aVar, "errorType");
            AbstractC19074t.m100208f(str, "errorMsg");
            if (z11) {
                ToastUtils.showMess(this.f112641a.getString(AbstractC8020f0.str_copy_failed));
            }
            AbstractC20110a.f98889a.m104564x("ClipboardUtils").mo104551d(str, new Object[0]);
        }

        @Override // me0.ClipboardManagerOnPrimaryClipChangedListenerC23245w.b
        /* renamed from: b */
        public void mo119780b(boolean z11) {
            if (z11 && AbstractC26681b.f126359d) {
                ToastUtils.showMess(this.f112641a.getString(AbstractC8020f0.str_copy_success));
            }
        }
    }

    private ClipboardManagerOnPrimaryClipChangedListenerC23245w() {
    }

    /* renamed from: c */
    private final void m119764c(Context context, String str, int i11, b bVar) {
        AbstractC0837p0.Companion.m2239h().mo2040a(new Runnable() { // from class: me0.v

            /* renamed from: p */
            public final /* synthetic */ String f112619p;

            /* renamed from: q */
            public final /* synthetic */ ClipboardManagerOnPrimaryClipChangedListenerC23245w.b f112620q;

            /* renamed from: r */
            public final /* synthetic */ Context f112621r;

            /* renamed from: s */
            public final /* synthetic */ int f112622s;

            public /* synthetic */ RunnableC23235v(String str2, ClipboardManagerOnPrimaryClipChangedListenerC23245w.b bVar2, Context context2, int i112) {
                r1 = str2;
                r2 = bVar2;
                r3 = context2;
                r4 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119765d(r1, r2, r3, r4);
            }
        });
    }

    /* renamed from: d */
    public static final void m119765d(String str, b bVar, Context context, int i11) {
        AbstractC19074t.m100208f(str, "$path");
        AbstractC19074t.m100208f(bVar, "$listener");
        AbstractC19074t.m100208f(context, "$context");
        try {
            if (!C0774b.f2680a.m1928q(str)) {
                bVar.mo119779a(a.f112636p, "Path not exist", true);
                return;
            }
            ClipboardManagerOnPrimaryClipChangedListenerC23245w clipboardManagerOnPrimaryClipChangedListenerC23245w = f112633a;
            if (clipboardManagerOnPrimaryClipChangedListenerC23245w.m119773l(context, str, bVar)) {
                return;
            }
            clipboardManagerOnPrimaryClipChangedListenerC23245w.m119766e(context, str, i11, bVar);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: e */
    private final void m119766e(Context context, String str, int i11, b bVar) {
        C0774b c0774b = C0774b.f2680a;
        Uri m1925l = c0774b.m1925l(context, str);
        if (m1925l != null && c0774b.m1920f(m1925l)) {
            try {
                C0012a m119770i = m119770i(new SensitiveData("clipboard_copy_image", "comm_csc", null, 4, null));
                if (m119770i == null) {
                    bVar.mo119779a(a.f112637q, "Clipboard Manager not available", true);
                    return;
                }
                int i12 = Build.VERSION.SDK_INT;
                if (i12 == 26 || i12 == 27) {
                    m119772k(m1925l);
                }
                m119770i.m16c(m119769h(m1925l, str, i11));
                bVar.mo119780b(true);
                return;
            } catch (Exception e11) {
                e11.printStackTrace();
                a aVar = a.f112637q;
                String message = e11.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                bVar.mo119779a(aVar, message, true);
                return;
            }
        }
        bVar.mo119779a(a.f112636p, "Path is not an image", true);
    }

    /* renamed from: f */
    public static final void m119767f(Context context, CharSequence charSequence, SensitiveData sensitiveData) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(charSequence, "text");
        AbstractC19074t.m100208f(sensitiveData, "sensitiveData");
        m119768g(context, charSequence, sensitiveData, true);
    }

    /* renamed from: g */
    public static final void m119768g(Context context, CharSequence charSequence, SensitiveData sensitiveData, boolean z11) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(charSequence, "text");
        AbstractC19074t.m100208f(sensitiveData, "sensitiveData");
        try {
            if (charSequence.length() > 0) {
                Object systemService = context.getSystemService("clipboard");
                AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                new C0012a((ClipboardManager) systemService, sensitiveData).m16c(new ClipData("", new String[]{"text/plain"}, new ClipData.Item(charSequence)));
                if (z11 && AbstractC26681b.f126359d) {
                    ToastUtils.showMess(context.getString(AbstractC8020f0.str_copied));
                }
            }
        } catch (SensitiveDataException unused) {
            if (z11 && AbstractC26681b.f126359d) {
                ToastUtils.showMess(context.getString(AbstractC8020f0.str_sensitive_clipboard_block_title));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: h */
    private final ClipData m119769h(Uri uri, String str, int i11) {
        ClipData.Item item = new ClipData.Item(uri);
        return new ClipData(new C3542j(i11, str).toString(), new String[]{"image/jpg"}, item);
    }

    /* renamed from: i */
    private final C0012a m119770i(SensitiveData sensitiveData) {
        ClipboardManager clipboardManager;
        C0012a c0012a = f112635c;
        if (c0012a == null) {
            try {
                Object systemService = MainApplication.Companion.m35500c().getSystemService("clipboard");
                if (systemService instanceof ClipboardManager) {
                    clipboardManager = (ClipboardManager) systemService;
                } else {
                    clipboardManager = null;
                }
                if (clipboardManager == null) {
                    return null;
                }
                C0012a c0012a2 = new C0012a(clipboardManager, sensitiveData);
                c0012a2.m14a(this);
                f112635c = c0012a2;
                return c0012a2;
            } catch (Exception unused) {
                return null;
            }
        }
        return c0012a;
    }

    /* renamed from: j */
    public static final String m119771j(Context context, SensitiveData sensitiveData) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(sensitiveData, "sensitiveData");
        try {
            Object systemService = context.getSystemService("clipboard");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ClipData m15b = new C0012a((ClipboardManager) systemService, sensitiveData).m15b();
            if (m15b != null && m15b.getItemCount() > 0) {
                return m15b.getItemAt(0).getText().toString();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return "";
    }

    /* renamed from: k */
    private final void m119772k(Uri uri) {
        List<PackageInfo> installedPackages = MainApplication.Companion.m35500c().getPackageManager().getInstalledPackages(0);
        AbstractC19074t.m100207e(installedPackages, "getInstalledPackages(...)");
        Iterator<PackageInfo> it = installedPackages.iterator();
        while (it.hasNext()) {
            MainApplication.Companion.m35500c().grantUriPermission(it.next().packageName, uri, 1);
        }
        f112634b = uri;
    }

    /* renamed from: l */
    private final boolean m119773l(Context context, String str, b bVar) {
        int i11;
        List m127132B0;
        Object m131216p0;
        C24244c c24244c = C24244c.f117098a;
        if (c24244c.m126578a() && (i11 = Build.VERSION.SDK_INT) > 28 && i11 < 31 && c24244c.m126579b()) {
            String str2 = File.separator;
            AbstractC19074t.m100207e(str2, "separator");
            m127132B0 = AbstractC24342w.m127132B0(str, new String[]{str2}, false, 0, 6, null);
            m131216p0 = AbstractC25332a0.m131216p0(m127132B0);
            String str3 = C20131e.f99303a.m104926F() + "/" + ((String) m131216p0);
            if (C0774b.f2680a.m1926m(str, str3)) {
                return C24243b.f117090a.m126576h(context, str3, bVar);
            }
            bVar.mo119779a(a.f112638r, "Cannot copy path to internal folder", true);
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private final void m119774o() {
        if (f112634b == null) {
            return;
        }
        try {
            try {
                MainApplication.Companion.m35500c().revokeUriPermission(f112634b, 1);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } finally {
            f112634b = null;
        }
    }

    /* renamed from: b */
    public final void m119775b(Context context, String str, int i11) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "path");
        if (str.length() == 0) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_must_download_file));
        } else {
            m119764c(context, str, i11, new c(context));
        }
    }

    /* renamed from: m */
    public final boolean m119776m(C32205z8.c cVar) {
        AbstractC19074t.m100208f(cVar, "uriInfo");
        C0774b c0774b = C0774b.f2680a;
        if (c0774b.m1920f(cVar.m155304b())) {
            return true;
        }
        return c0774b.m1919e(cVar.m155303a(), cVar.m155304b());
    }

    /* renamed from: n */
    public final boolean m119777n(C32205z8.c cVar) {
        AbstractC19074t.m100208f(cVar, "uriInfo");
        C0774b c0774b = C0774b.f2680a;
        if (c0774b.m1922h(cVar.m155304b())) {
            return true;
        }
        return c0774b.m1921g(cVar.m155303a());
    }

    @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
    public void onPrimaryClipChanged() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 == 26 || i11 == 27) {
            m119774o();
        }
    }
}
