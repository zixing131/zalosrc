package p609wh;

import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import java.net.HttpURLConnection;
import jm0.InterfaceC21299i;

/* renamed from: wh.v0 */
/* loaded from: classes3.dex */
public final class C29041v0 extends C29037t0 {
    public static final a Companion = new a(null);

    /* renamed from: wh.v0$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C29041v0(InterfaceC21299i interfaceC21299i) {
        super(interfaceC21299i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p609wh.C29037t0, jm0.AbstractC21298h
    /* renamed from: T */
    public void mo82640T(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.setRequestProperty("session_key", CoreUtility.f89232h);
            httpURLConnection.setRequestProperty("clientType", "1");
            httpURLConnection.setRequestProperty("clientVersion", String.valueOf(CoreUtility.f89236l));
        }
        super.mo82640T(httpURLConnection);
    }
}
