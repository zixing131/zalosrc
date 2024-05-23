package p537u4;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p092d5.C17737a;
import p669y4.AbstractC30286c;
import p669y4.AbstractC30287d;
import p704z4.C31236k;

/* renamed from: u4.e */
/* loaded from: classes2.dex */
public final class RunnableC27012e implements Runnable {

    /* renamed from: r */
    private static final C17737a f127661r = new C17737a("RevokeAccessOperation", new String[0]);

    /* renamed from: p */
    private final String f127662p;

    /* renamed from: q */
    private final C31236k f127663q = new C31236k(null);

    private RunnableC27012e(String str) {
        this.f127662p = AbstractC4205o.m19718g(str);
    }

    /* renamed from: a */
    public static AbstractC30286c m139159a(String str) {
        if (str == null) {
            return AbstractC30287d.m149434a(new Status(4), null);
        }
        RunnableC27012e runnableC27012e = new RunnableC27012e(str);
        new Thread(runnableC27012e).start();
        return runnableC27012e.f127663q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        String str3;
        Status status = Status.f16169x;
        try {
            String valueOf = String.valueOf(this.f127662p);
            if (valueOf.length() != 0) {
                str3 = "https://accounts.google.com/o/oauth2/revoke?token=".concat(valueOf);
            } else {
                str3 = new String("https://accounts.google.com/o/oauth2/revoke?token=");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str3).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f16167v;
            } else {
                f127661r.m93899b("Unable to revoke access!", new Object[0]);
            }
            C17737a c17737a = f127661r;
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append("Response Code: ");
            sb2.append(responseCode);
            c17737a.m93898a(sb2.toString(), new Object[0]);
        } catch (IOException e11) {
            C17737a c17737a2 = f127661r;
            String valueOf2 = String.valueOf(e11.toString());
            if (valueOf2.length() != 0) {
                str2 = "IOException when revoking access: ".concat(valueOf2);
            } else {
                str2 = new String("IOException when revoking access: ");
            }
            c17737a2.m93899b(str2, new Object[0]);
        } catch (Exception e12) {
            C17737a c17737a3 = f127661r;
            String valueOf3 = String.valueOf(e12.toString());
            if (valueOf3.length() != 0) {
                str = "Exception when revoking access: ".concat(valueOf3);
            } else {
                str = new String("Exception when revoking access: ");
            }
            c17737a3.m93899b(str, new Object[0]);
        }
        this.f127663q.m19283h(status);
    }
}
