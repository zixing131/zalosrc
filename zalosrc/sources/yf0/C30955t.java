package yf0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiNetworkSuggestion;
import android.os.Build;
import android.os.Parcelable;
import android.provider.Settings;
import androidx.core.content.AbstractC1388a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.SensitiveDataException;
import com.zing.zalo.p077ui.zviews.MiniDialogWifiInfo;
import com.zing.zalo.p077ui.zviews.MiniProgramDialog;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23046d7;
import on0.C24329j;
import org.json.JSONObject;
import p087d0.C17686c;
import p140ev.C18616e;
import p363nh.C23744a;
import p483rh.InterfaceC25792a;
import p542ub.InterfaceC27218a;
import qm0.AbstractC25366r;
import vg.AbstractC28207v1;
import wf0.AbstractC28957b;
import yf0.C30955t;

/* renamed from: yf0.t */
/* loaded from: classes5.dex */
public final class C30955t {
    public static final a Companion = new a(null);

    /* renamed from: f */
    private static C30955t f142850f;

    /* renamed from: a */
    private WifiManager f142851a;

    /* renamed from: b */
    private C18616e f142852b;

    /* renamed from: c */
    private final C23744a.c f142853c;

    /* renamed from: d */
    private boolean f142854d;

    /* renamed from: e */
    private C17686c f142855e;

    /* renamed from: yf0.t$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C30955t m150567a() {
            if (C30955t.f142850f == null) {
                C30955t.f142850f = new C30955t();
            }
            C30955t c30955t = C30955t.f142850f;
            AbstractC19074t.m100205c(c30955t);
            return c30955t;
        }
    }

    /* renamed from: yf0.t$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        void mo150540a(InterfaceC27218a interfaceC27218a, boolean z11);
    }

    /* renamed from: yf0.t$c */
    /* loaded from: classes5.dex */
    public interface c {
        /* renamed from: a */
        void mo49354a();

        /* renamed from: b */
        void mo49355b();

        /* renamed from: c */
        void mo49356c(C18616e c18616e, b bVar);
    }

    /* renamed from: yf0.t$d */
    /* loaded from: classes5.dex */
    public static final class d implements c {

        /* renamed from: b */
        final /* synthetic */ InterfaceC25792a.c f142857b;

        /* renamed from: c */
        final /* synthetic */ String f142858c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC27218a f142859d;

        /* renamed from: yf0.t$d$a */
        /* loaded from: classes5.dex */
        public static final class a implements MiniProgramDialog.InterfaceC14633b {

            /* renamed from: a */
            final /* synthetic */ C30955t f142860a;

            /* renamed from: b */
            final /* synthetic */ b f142861b;

            /* renamed from: c */
            final /* synthetic */ InterfaceC27218a f142862c;

            /* renamed from: d */
            final /* synthetic */ InterfaceC25792a.c f142863d;

            /* renamed from: e */
            final /* synthetic */ String f142864e;

            a(C30955t c30955t, b bVar, InterfaceC27218a interfaceC27218a, InterfaceC25792a.c cVar, String str) {
                this.f142860a = c30955t;
                this.f142861b = bVar;
                this.f142862c = interfaceC27218a;
                this.f142863d = cVar;
                this.f142864e = str;
            }

            @Override // com.zing.zalo.p077ui.zviews.MiniProgramDialog.InterfaceC14633b
            /* renamed from: a */
            public void mo81419a(boolean z11) {
                String m141899N0;
                this.f142860a.f142854d = false;
                this.f142861b.mo150540a(this.f142862c, z11);
                if (z11) {
                    m141899N0 = AbstractC28207v1.m141923T0("action.mp.join.wifi", "0", null);
                    AbstractC19074t.m100205c(m141899N0);
                } else {
                    m141899N0 = AbstractC28207v1.m141899N0(-101, "User rejected", "action.mp.join.wifi");
                    AbstractC19074t.m100205c(m141899N0);
                }
                this.f142860a.m150557s(this.f142863d, m141899N0, this.f142864e);
            }
        }

        d(InterfaceC25792a.c cVar, String str, InterfaceC27218a interfaceC27218a) {
            this.f142857b = cVar;
            this.f142858c = str;
            this.f142859d = interfaceC27218a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m150569e(C30955t c30955t, InterfaceC27218a interfaceC27218a, MiniDialogWifiInfo miniDialogWifiInfo, b bVar, InterfaceC25792a.c cVar, String str) {
            AbstractC19074t.m100208f(c30955t, "this$0");
            AbstractC19074t.m100208f(miniDialogWifiInfo, "$miniDialogWifiInfo");
            AbstractC19074t.m100208f(bVar, "$delegate");
            if (!c30955t.f142854d) {
                c30955t.f142854d = true;
                MiniProgramDialog.C14632a c14632a = MiniProgramDialog.Companion;
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_dialog_connect_wifi_title);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_dialog_connect_wifi_content);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                c14632a.m81864a(interfaceC27218a, m118743r0, m118743r02, new a(c30955t, bVar, interfaceC27218a, cVar, str), miniDialogWifiInfo, AbstractC23136l9.m118665N(interfaceC27218a.getContext(), AbstractC16803z.ic_mp_request_join_wifi), true, AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_dialog_connect_wifi_button), AbstractC23136l9.m118743r0(AbstractC8020f0.cancel), null, "mp_accept_join_wifi", "mp_cancel_join_wifi");
            }
        }

        @Override // yf0.C30955t.c
        /* renamed from: a */
        public void mo49354a() {
            C30955t.this.m150557s(this.f142857b, AbstractC28207v1.m141899N0(-1400, "Missing required argument SSID", "action.mp.join.wifi"), this.f142858c);
        }

        @Override // yf0.C30955t.c
        /* renamed from: b */
        public void mo49355b() {
            C30955t.this.m150557s(this.f142857b, AbstractC28207v1.m141899N0(-1401, "Invalid password", "action.mp.join.wifi"), this.f142858c);
        }

        @Override // yf0.C30955t.c
        /* renamed from: c */
        public void mo49356c(C18616e c18616e, final b bVar) {
            AbstractC19074t.m100208f(c18616e, "wifiConfig");
            AbstractC19074t.m100208f(bVar, "delegate");
            Context context = this.f142859d.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            final MiniDialogWifiInfo miniDialogWifiInfo = new MiniDialogWifiInfo(context);
            miniDialogWifiInfo.setWifiConfig(c18616e);
            final C30955t c30955t = C30955t.this;
            final InterfaceC27218a interfaceC27218a = this.f142859d;
            final InterfaceC25792a.c cVar = this.f142857b;
            final String str = this.f142858c;
            AbstractC19444a.m101697e(new Runnable() { // from class: yf0.u
                @Override // java.lang.Runnable
                public final void run() {
                    C30955t.d.m150569e(C30955t.this, interfaceC27218a, miniDialogWifiInfo, bVar, cVar, str);
                }
            });
        }
    }

    /* renamed from: yf0.t$e */
    /* loaded from: classes5.dex */
    public static final class e implements C23744a.c {
        e() {
        }

        @Override // p363nh.C23744a.c
        /* renamed from: x */
        public void mo17795x(int i11, Object... objArr) {
            AbstractC19074t.m100208f(objArr, "args");
            Object obj = objArr[0];
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            if (i11 == 134 && intValue == 6868) {
                C30955t.this.m150562x();
            }
        }
    }

    public C30955t() {
        Object systemService = MainApplication.Companion.m35500c().getApplicationContext().getSystemService("wifi");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        this.f142851a = (WifiManager) systemService;
        this.f142853c = new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m150549k(Context context) {
        AbstractC19074t.m100208f(context, "$context");
        C23046d7.m118245h(context).mo13822K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m150550l(C30955t c30955t, Context context, C18616e c18616e, InterfaceC27218a interfaceC27218a, boolean z11) {
        AbstractC19074t.m100208f(c30955t, "this$0");
        AbstractC19074t.m100208f(context, "$context");
        AbstractC19074t.m100208f(c18616e, "$wifiConfig");
        AbstractC19074t.m100208f(interfaceC27218a, "activity");
        if (z11) {
            if (c30955t.m150560v()) {
                c30955t.m150553o(context, c18616e);
                return;
            }
            if (Build.VERSION.SDK_INT < 29) {
                c30955t.m150558t();
                c30955t.m150553o(context, c18616e);
            } else {
                c30955t.f142852b = c18616e;
                Intent intent = new Intent("android.settings.panel.action.WIFI");
                C23744a.Companion.m124119a().m124115b(c30955t.f142853c, 134);
                interfaceC27218a.startActivityForResult(intent, 6868);
            }
        }
    }

    /* renamed from: m */
    private final WifiConfiguration m150551m(C18616e c18616e) {
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        wifiConfiguration.SSID = "\"" + c18616e.m98376e() + "\"";
        m150563y(wifiConfiguration, c18616e.m98375d(), c18616e.m98374c());
        wifiConfiguration.priority = Integer.MAX_VALUE;
        return wifiConfiguration;
    }

    /* renamed from: n */
    private final boolean m150552n(ContentResolver contentResolver) {
        C17686c c17686c = this.f142855e;
        C17686c c17686c2 = null;
        if (c17686c == null) {
            AbstractC19074t.m100223u("sensitiveWifiManager");
            c17686c = null;
        }
        List m93677d = c17686c.m93677d();
        if (m93677d == null) {
            return false;
        }
        AbstractC28957b.Companion.m144624d(m93677d);
        int i11 = Settings.Secure.getInt(contentResolver, "wifi_num_open_networks_kept", 10);
        int size = m93677d.size() - 1;
        if (size >= 0) {
            int i12 = 0;
            boolean z11 = false;
            while (true) {
                int i13 = size - 1;
                WifiConfiguration wifiConfiguration = (WifiConfiguration) m93677d.get(size);
                if (AbstractC19074t.m100204b("open", AbstractC28957b.Companion.m144623c(wifiConfiguration)) && (i12 = i12 + 1) >= i11) {
                    C17686c c17686c3 = this.f142855e;
                    if (c17686c3 == null) {
                        AbstractC19074t.m100223u("sensitiveWifiManager");
                        c17686c3 = null;
                    }
                    c17686c3.m93681h(wifiConfiguration.networkId);
                    z11 = true;
                }
                if (i13 < 0) {
                    break;
                }
                size = i13;
            }
            if (z11) {
                C17686c c17686c4 = this.f142855e;
                if (c17686c4 == null) {
                    AbstractC19074t.m100223u("sensitiveWifiManager");
                } else {
                    c17686c2 = c17686c4;
                }
                if (!c17686c2.m93683j()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: o */
    private final void m150553o(Context context, C18616e c18616e) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 27 || AbstractC1388a.m6959a(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            C17686c c17686c = this.f142855e;
            String str = null;
            if (c17686c == null) {
                AbstractC19074t.m100223u("sensitiveWifiManager");
                c17686c = null;
            }
            WifiInfo m93678e = c17686c.m93678e();
            if (m93678e != null) {
                str = m93678e.getSSID();
            }
            if (AbstractC19074t.m100204b(str, c18616e.m98376e())) {
                m150564z(c18616e.m98376e() + " has already connected");
                return;
            }
        }
        if (i11 < 29) {
            m150556r(context, c18616e);
        } else if (i11 == 29) {
            m150554p(c18616e);
        } else {
            m150555q(context, c18616e);
        }
    }

    /* renamed from: p */
    private final void m150554p(C18616e c18616e) {
        WifiNetworkSuggestion.Builder ssid;
        WifiNetworkSuggestion.Builder priority;
        WifiNetworkSuggestion build;
        List m131496e;
        List m131496e2;
        ssid = AbstractC30947l.m150534a().setSsid(c18616e.m98376e());
        priority = ssid.setPriority(Integer.MAX_VALUE);
        AbstractC19074t.m100207e(priority, "setPriority(...)");
        String m98374c = c18616e.m98374c();
        String m98375d = c18616e.m98375d();
        if (!AbstractC19074t.m100204b(m98375d, "open")) {
            if (AbstractC19074t.m100204b(m98375d, "wpa_wpa2")) {
                if (m98374c != null) {
                    priority.setWpa2Passphrase(m98374c);
                }
            } else {
                m150564z("Invalid security type: " + c18616e.m98375d());
            }
        }
        priority.setIsHiddenSsid(c18616e.m98373b());
        build = priority.build();
        AbstractC19074t.m100207e(build, "build(...)");
        C17686c c17686c = this.f142855e;
        C17686c c17686c2 = null;
        if (c17686c == null) {
            AbstractC19074t.m100223u("sensitiveWifiManager");
            c17686c = null;
        }
        m131496e = AbstractC25366r.m131496e(build);
        c17686c.m93682i(m131496e);
        C17686c c17686c3 = this.f142855e;
        if (c17686c3 == null) {
            AbstractC19074t.m100223u("sensitiveWifiManager");
        } else {
            c17686c2 = c17686c3;
        }
        m131496e2 = AbstractC25366r.m131496e(build);
        if (c17686c2.m93675b(m131496e2) == 0) {
            m150564z("Added suggestion: " + m150561w(c18616e));
        }
    }

    /* renamed from: q */
    private final void m150555q(Context context, C18616e c18616e) {
        WifiNetworkSuggestion.Builder ssid;
        WifiNetworkSuggestion.Builder isHiddenSsid;
        WifiNetworkSuggestion build;
        ssid = AbstractC30947l.m150534a().setSsid(c18616e.m98376e());
        AbstractC19074t.m100207e(ssid, "setSsid(...)");
        String m98374c = c18616e.m98374c();
        String m98375d = c18616e.m98375d();
        if (!AbstractC19074t.m100204b(m98375d, "open")) {
            if (AbstractC19074t.m100204b(m98375d, "wpa_wpa2")) {
                if (m98374c != null) {
                    ssid.setWpa2Passphrase(m98374c);
                }
            } else {
                m150564z("Invalid security type: " + c18616e.m98375d());
            }
        }
        isHiddenSsid = ssid.setIsHiddenSsid(c18616e.m98373b());
        build = isHiddenSsid.build();
        AbstractC19074t.m100207e(build, "build(...)");
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        arrayList.add(build);
        Intent intent = new Intent("android.settings.WIFI_ADD_NETWORKS");
        intent.putParcelableArrayListExtra("android.provider.extra.WIFI_NETWORK_LIST", arrayList);
        m150564z("Showed dialog to suggest : " + m150561w(c18616e));
        context.startActivity(intent);
    }

    /* renamed from: r */
    private final void m150556r(Context context, C18616e c18616e) {
        WifiConfiguration m150551m = m150551m(c18616e);
        int m150559u = m150559u("\"" + c18616e.m98376e() + "\"");
        C17686c c17686c = null;
        if (m150559u == -1) {
            ContentResolver contentResolver = context.getContentResolver();
            AbstractC19074t.m100207e(contentResolver, "getContentResolver(...)");
            m150552n(contentResolver);
        } else {
            C17686c c17686c2 = this.f142855e;
            if (c17686c2 == null) {
                AbstractC19074t.m100223u("sensitiveWifiManager");
                c17686c2 = null;
            }
            c17686c2.m93681h(m150559u);
        }
        m150551m.hiddenSSID = c18616e.m98373b();
        C17686c c17686c3 = this.f142855e;
        if (c17686c3 == null) {
            AbstractC19074t.m100223u("sensitiveWifiManager");
            c17686c3 = null;
        }
        int m93674a = c17686c3.m93674a(m150551m);
        C17686c c17686c4 = this.f142855e;
        if (c17686c4 == null) {
            AbstractC19074t.m100223u("sensitiveWifiManager");
        } else {
            c17686c = c17686c4;
        }
        c17686c.m93676c(m93674a, true);
        m150564z("Connect to " + m150561w(c18616e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final void m150557s(InterfaceC25792a.c cVar, String str, String str2) {
        if (cVar != null) {
            cVar.mo39930a(str, str2);
        }
    }

    /* renamed from: t */
    private final boolean m150558t() {
        C17686c c17686c = this.f142855e;
        if (c17686c == null) {
            AbstractC19074t.m100223u("sensitiveWifiManager");
            c17686c = null;
        }
        return c17686c.m93684k(true);
    }

    /* renamed from: u */
    private final int m150559u(String str) {
        C17686c c17686c = this.f142855e;
        if (c17686c == null) {
            AbstractC19074t.m100223u("sensitiveWifiManager");
            c17686c = null;
        }
        List<WifiConfiguration> m93677d = c17686c.m93677d();
        if (m93677d != null) {
            for (WifiConfiguration wifiConfiguration : m93677d) {
                if (AbstractC19074t.m100204b(wifiConfiguration.SSID, str)) {
                    return wifiConfiguration.networkId;
                }
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: v */
    private final boolean m150560v() {
        C17686c c17686c = this.f142855e;
        if (c17686c == null) {
            AbstractC19074t.m100223u("sensitiveWifiManager");
            c17686c = null;
        }
        return c17686c.m93680g();
    }

    /* renamed from: w */
    private final String m150561w(C18616e c18616e) {
        return "Wifi : '" + c18616e.m98376e() + "' - '" + c18616e.m98375d() + "' - '" + c18616e.m98373b() + "' - '" + c18616e.m98374c() + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public final void m150562x() {
        C18616e c18616e = this.f142852b;
        if (c18616e != null && m150560v()) {
            m150553o(MainApplication.Companion.m35500c(), c18616e);
        }
        this.f142852b = null;
        C23744a.Companion.m124119a().m124117e(this.f142853c, 134);
    }

    /* renamed from: y */
    private final void m150563y(WifiConfiguration wifiConfiguration, String str, String str2) {
        wifiConfiguration.allowedAuthAlgorithms.clear();
        wifiConfiguration.allowedGroupCiphers.clear();
        wifiConfiguration.allowedKeyManagement.clear();
        wifiConfiguration.allowedPairwiseCiphers.clear();
        wifiConfiguration.allowedProtocols.clear();
        m150564z("Setting up security " + str);
        if (AbstractC19074t.m100204b(str, "open")) {
            wifiConfiguration.allowedKeyManagement.set(0);
            wifiConfiguration.allowedProtocols.set(1);
            wifiConfiguration.allowedProtocols.set(0);
            wifiConfiguration.allowedPairwiseCiphers.set(2);
            wifiConfiguration.allowedPairwiseCiphers.set(1);
            wifiConfiguration.allowedGroupCiphers.set(0);
            wifiConfiguration.allowedGroupCiphers.set(1);
            wifiConfiguration.allowedGroupCiphers.set(3);
            wifiConfiguration.allowedGroupCiphers.set(2);
            return;
        }
        if (AbstractC19074t.m100204b(str, "wpa_wpa2")) {
            wifiConfiguration.allowedProtocols.set(1);
            wifiConfiguration.allowedProtocols.set(0);
            wifiConfiguration.allowedKeyManagement.set(1);
            wifiConfiguration.allowedPairwiseCiphers.set(2);
            wifiConfiguration.allowedPairwiseCiphers.set(1);
            wifiConfiguration.allowedGroupCiphers.set(0);
            wifiConfiguration.allowedGroupCiphers.set(1);
            wifiConfiguration.allowedGroupCiphers.set(3);
            wifiConfiguration.allowedGroupCiphers.set(2);
            if (str2 != null) {
                if (new C24329j("[0-9A-Fa-f]{64}").m127018f(str2)) {
                    wifiConfiguration.preSharedKey = str2;
                    return;
                } else {
                    wifiConfiguration.preSharedKey = AbstractC28957b.Companion.m144622b(str2);
                    return;
                }
            }
            throw new Exception("PSK security password cannot be null");
        }
        m150564z("Invalid security type: " + str);
    }

    /* renamed from: z */
    private final void m150564z(String str) {
        AbstractC20110a.f98889a.mo104551d(str, new Object[0]);
    }

    /* renamed from: i */
    public final void m150565i(final Context context, c cVar, JSONObject jSONObject, SensitiveData sensitiveData) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(cVar, "subject");
        AbstractC19074t.m100208f(jSONObject, "item");
        AbstractC19074t.m100208f(sensitiveData, "sensitiveData");
        final C18616e c18616e = new C18616e(jSONObject);
        if (AbstractC19074t.m100204b(c18616e.m98376e(), "")) {
            cVar.mo49354a();
            return;
        }
        String m98374c = c18616e.m98374c();
        if (m98374c != null && !AbstractC19074t.m100204b(m98374c, "") && !StandardCharsets.US_ASCII.newEncoder().canEncode(m98374c)) {
            cVar.mo49355b();
            return;
        }
        try {
            this.f142855e = new C17686c(this.f142851a, sensitiveData);
            new MiniDialogWifiInfo(context).setWifiConfig(c18616e);
            cVar.mo49356c(c18616e, new b() { // from class: yf0.s
                @Override // yf0.C30955t.b
                /* renamed from: a */
                public final void mo150540a(InterfaceC27218a interfaceC27218a, boolean z11) {
                    C30955t.m150550l(C30955t.this, context, c18616e, interfaceC27218a, z11);
                }
            });
        } catch (SensitiveDataException unused) {
            AbstractC19444a.m101695c(new Runnable() { // from class: yf0.r
                @Override // java.lang.Runnable
                public final void run() {
                    C30955t.m150549k(context);
                }
            });
        }
    }

    /* renamed from: j */
    public final void m150566j(InterfaceC27218a interfaceC27218a, JSONObject jSONObject, String str, InterfaceC25792a.c cVar, SensitiveData sensitiveData) {
        AbstractC19074t.m100208f(sensitiveData, "sensitiveData");
        if (interfaceC27218a != null && jSONObject != null) {
            d dVar = new d(cVar, str, interfaceC27218a);
            Context context = interfaceC27218a.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            m150565i(context, dVar, jSONObject, sensitiveData);
        }
    }
}
