package p372nw;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.RouteInfo;
import android.os.Build;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: nw.a */
/* loaded from: classes4.dex */
public class C23953a {

    /* renamed from: b */
    private static final String[] f115936b = {"8.8.8.8", "8.8.4.4"};

    /* renamed from: a */
    private Context f115937a;

    public C23953a(Context context) {
        this.f115937a = context;
    }

    /* renamed from: b */
    private String[] m125355b() {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f115937a.getSystemService("connectivity");
            if (connectivityManager != null) {
                for (Network network : connectivityManager.getAllNetworks()) {
                    if (connectivityManager.getNetworkInfo(network).isConnected()) {
                        LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
                        List<InetAddress> dnsServers = linkProperties.getDnsServers();
                        if (m125358e(linkProperties)) {
                            Iterator<InetAddress> it = dnsServers.iterator();
                            while (it.hasNext()) {
                                arrayList.add(it.next().getHostAddress());
                            }
                        } else {
                            Iterator<InetAddress> it2 = dnsServers.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(it2.next().getHostAddress());
                            }
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(arrayList2);
            }
            if (arrayList.size() > 0) {
                return (String[]) arrayList.toArray(new String[0]);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    private String[] m125356c() {
        try {
            Set m125359f = m125359f(new LineNumberReader(new InputStreamReader(Runtime.getRuntime().exec("getprop").getInputStream())));
            if (m125359f != null && m125359f.size() > 0) {
                return (String[]) m125359f.toArray(new String[0]);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    private String[] m125357d() {
        if (Build.VERSION.SDK_INT < 26) {
            ArrayList arrayList = new ArrayList();
            try {
                Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
                String[] strArr = {"net.dns1", "net.dns2", "net.dns3", "net.dns4"};
                for (int i11 = 0; i11 < 4; i11++) {
                    String str = (String) method.invoke(null, strArr[i11]);
                    if (str != null && ((str.matches("^\\d+(\\.\\d+){3}$") || str.matches("^[0-9a-f]+(:[0-9a-f]*)+:[0-9a-f]+$")) && !arrayList.contains(str))) {
                        arrayList.add(str);
                    }
                }
                if (arrayList.size() > 0) {
                    return (String[]) arrayList.toArray(new String[0]);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    private boolean m125358e(LinkProperties linkProperties) {
        Iterator<RouteInfo> it = linkProperties.getRoutes().iterator();
        while (it.hasNext()) {
            if (it.next().isDefaultRoute()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private Set m125359f(BufferedReader bufferedReader) {
        String hostAddress;
        HashSet hashSet = new HashSet(10);
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                int indexOf = readLine.indexOf("]: [");
                if (indexOf != -1) {
                    String substring = readLine.substring(1, indexOf);
                    int i11 = indexOf + 4;
                    int length = readLine.length() - 1;
                    if (length < i11) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Malformed property detected: \"");
                        sb2.append(readLine);
                        sb2.append('\"');
                    } else {
                        String substring2 = readLine.substring(i11, length);
                        if (!substring2.isEmpty() && (substring.endsWith(".dns") || substring.endsWith(".dns1") || substring.endsWith(".dns2") || substring.endsWith(".dns3") || substring.endsWith(".dns4"))) {
                            InetAddress byName = InetAddress.getByName(substring2);
                            if (byName != null && (hostAddress = byName.getHostAddress()) != null && hostAddress.length() != 0) {
                                hashSet.add(hostAddress);
                            }
                        }
                    }
                }
            } else {
                return hashSet;
            }
        }
    }

    /* renamed from: a */
    public String[] m125360a() {
        String[] m125357d = m125357d();
        if (m125357d != null && m125357d.length > 0) {
            return m125357d;
        }
        String[] m125355b = m125355b();
        if (m125355b != null && m125355b.length > 0) {
            return m125355b;
        }
        String[] m125356c = m125356c();
        if (m125356c != null && m125356c.length > 0) {
            return m125356c;
        }
        return f115936b;
    }
}
