package p125e8;

import android.os.Bundle;
import java.util.Locale;
import p014a8.InterfaceC0650a;
import p153f8.C18821f;
import p183g8.InterfaceC19292b;

/* renamed from: e8.e */
/* loaded from: classes.dex */
class C18293e implements InterfaceC0650a.b {

    /* renamed from: a */
    private InterfaceC19292b f92566a;

    /* renamed from: b */
    private InterfaceC19292b f92567b;

    /* renamed from: b */
    private static void m97178b(InterfaceC19292b interfaceC19292b, String str, Bundle bundle) {
        if (interfaceC19292b == null) {
            return;
        }
        interfaceC19292b.mo101007R(str, bundle);
    }

    /* renamed from: c */
    private void m97179c(String str, Bundle bundle) {
        InterfaceC19292b interfaceC19292b;
        if ("clx".equals(bundle.getString("_o"))) {
            interfaceC19292b = this.f92566a;
        } else {
            interfaceC19292b = this.f92567b;
        }
        m97178b(interfaceC19292b, str, bundle);
    }

    @Override // p014a8.InterfaceC0650a.b
    /* renamed from: a */
    public void mo937a(int i11, Bundle bundle) {
        String string;
        C18821f.m98795f().m98802i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i11), bundle));
        if (bundle != null && (string = bundle.getString("name")) != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            m97179c(string, bundle2);
        }
    }

    /* renamed from: d */
    public void m97180d(InterfaceC19292b interfaceC19292b) {
        this.f92567b = interfaceC19292b;
    }

    /* renamed from: e */
    public void m97181e(InterfaceC19292b interfaceC19292b) {
        this.f92566a = interfaceC19292b;
    }
}
