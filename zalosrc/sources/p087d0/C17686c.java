package p087d0;

import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.zing.zalo.C8937j0;
import com.zing.zalo.C8939k0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.SensitiveDataException;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.List;
import pm0.C24848g0;

/* renamed from: d0.c */
/* loaded from: classes2.dex */
public final class C17686c {

    /* renamed from: c */
    public static final a f89687c = new a(null);

    /* renamed from: a */
    private WifiManager f89688a;

    /* renamed from: b */
    private SensitiveData f89689b;

    /* renamed from: d0.c$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C17686c(WifiManager wifiManager, SensitiveData sensitiveData) {
        AbstractC19074t.m100208f(wifiManager, "manager");
        this.f89688a = wifiManager;
        this.f89689b = sensitiveData;
        m93672l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:            if (r0.m35528c().length() == 0) goto L25;     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m93672l() {
        String str;
        SensitiveData sensitiveData = this.f89689b;
        if (sensitiveData != null) {
            AbstractC19074t.m100205c(sensitiveData);
        }
        AbstractC20110a.a aVar = AbstractC20110a.f98889a;
        new Exception("Access sensitive Wi-Fi data without defining sourceId").printStackTrace();
        aVar.mo104551d(String.valueOf(C24848g0.f119245a), new Object[0]);
        this.f89689b = new SensitiveData("unknown", "unknown", null, 4, null);
        SensitiveData sensitiveData2 = this.f89689b;
        String str2 = null;
        if (sensitiveData2 != null) {
            str = sensitiveData2.m35528c();
        } else {
            str = null;
        }
        if (!C8937j0.m47663l(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SourceId ");
            SensitiveData sensitiveData3 = this.f89689b;
            if (sensitiveData3 != null) {
                str2 = sensitiveData3.m35528c();
            }
            sb2.append(str2);
            sb2.append(" does not have permission to access sensitive Wi-Fi data");
            throw new SensitiveDataException(sb2.toString());
        }
    }

    /* renamed from: m */
    private final boolean m93673m() {
        m93672l();
        SensitiveData sensitiveData = this.f89689b;
        if (sensitiveData != null) {
            C8939k0.Companion.m47671a().m47669b(sensitiveData);
            return true;
        }
        return true;
    }

    /* renamed from: a */
    public final int m93674a(WifiConfiguration wifiConfiguration) {
        AbstractC19074t.m100208f(wifiConfiguration, "config");
        return this.f89688a.addNetwork(wifiConfiguration);
    }

    /* renamed from: b */
    public final int m93675b(List list) {
        int addNetworkSuggestions;
        AbstractC19074t.m100208f(list, "networkSuggestions");
        if (m93673m()) {
            addNetworkSuggestions = this.f89688a.addNetworkSuggestions(list);
            return addNetworkSuggestions;
        }
        return 1;
    }

    /* renamed from: c */
    public final boolean m93676c(int i11, boolean z11) {
        return this.f89688a.enableNetwork(i11, z11);
    }

    /* renamed from: d */
    public final List m93677d() {
        if (!m93673m()) {
            return null;
        }
        return this.f89688a.getConfiguredNetworks();
    }

    /* renamed from: e */
    public final WifiInfo m93678e() {
        if (!m93673m()) {
            return null;
        }
        return this.f89688a.getConnectionInfo();
    }

    /* renamed from: f */
    public final List m93679f() {
        if (!m93673m()) {
            return null;
        }
        return this.f89688a.getScanResults();
    }

    /* renamed from: g */
    public final boolean m93680g() {
        return this.f89688a.isWifiEnabled();
    }

    /* renamed from: h */
    public final boolean m93681h(int i11) {
        return this.f89688a.removeNetwork(i11);
    }

    /* renamed from: i */
    public final void m93682i(List list) {
        AbstractC19074t.m100208f(list, "networkSuggestions");
        if (m93673m()) {
            this.f89688a.removeNetworkSuggestions(list);
        }
    }

    /* renamed from: j */
    public final boolean m93683j() {
        return this.f89688a.saveConfiguration();
    }

    /* renamed from: k */
    public final boolean m93684k(boolean z11) {
        return this.f89688a.setWifiEnabled(z11);
    }
}
