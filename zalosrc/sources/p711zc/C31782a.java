package p711zc;

import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.zing.zalo.backuprestore.media.exception.BackupRestoreMediaException;
import com.zing.zalo.p062db.C7959d;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import im0.AbstractC20626a;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import lu.C22652b;
import me0.C23055e5;
import p543uc.C27225c;
import vi.C28255a;

/* renamed from: zc.a */
/* loaded from: classes3.dex */
public final class C31782a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f145918a;

    /* renamed from: b */
    private final C28255a f145919b;

    /* renamed from: c */
    private final String f145920c;

    /* renamed from: zc.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C31782a(String str, C28255a c28255a) {
        AbstractC19074t.m100208f(c28255a, "fileNeedDelete");
        this.f145918a = str;
        this.f145919b = c28255a;
        this.f145920c = "https://www.googleapis.com/drive/v3/files/" + c28255a.m142266e();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00b1 -> B:21:0x00c2). Please report as a decompilation issue!!! */
    /* renamed from: a */
    public final void m152807a() {
        HttpURLConnection httpURLConnection;
        if (TextUtils.isEmpty(this.f145919b.m142266e())) {
            return;
        }
        HttpURLConnection httpURLConnection2 = null;
        try {
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        if (C23055e5.m118273h(false, 1, null)) {
            try {
                try {
                    URL url = new URL(this.f145920c);
                    C22652b.m117234a(this.f145920c);
                    URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                    AbstractC19074t.m100206d(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                    httpURLConnection = (HttpURLConnection) uRLConnection;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e12) {
                e = e12;
            }
            try {
                try {
                    int m107385a = AbstractC20626a.m107385a(1);
                    httpURLConnection.setConnectTimeout(m107385a);
                    httpURLConnection.setReadTimeout(m107385a);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setRequestMethod("DELETE");
                    httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
                    httpURLConnection.setRequestProperty("Authorization", "Bearer " + this.f145918a);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.connect();
                    int responseCode = httpURLConnection.getResponseCode();
                    AbstractC20110a.f98889a.mo104548a("Response code: %d", Integer.valueOf(responseCode));
                    if (responseCode != 200 && responseCode != 204 && responseCode != 404) {
                        C27225c.m139331f("SMLDrive-Delete", 6, responseCode, httpURLConnection);
                    } else {
                        try {
                            C7959d.Companion.m41850e().m41808n0(this.f145919b.m142266e());
                        } catch (Exception e13) {
                            AbstractC20110a.f98889a.mo104552e(e13);
                        }
                    }
                    httpURLConnection.disconnect();
                } catch (Exception e14) {
                    e = e14;
                    httpURLConnection2 = httpURLConnection;
                    C27225c.m139330e("SMLDrive-Delete", 6, e);
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    try {
                        httpURLConnection2.disconnect();
                    } catch (Exception e15) {
                        AbstractC20110a.f98889a.mo104552e(e15);
                    }
                }
                throw th;
            }
        }
        throw new BackupRestoreMediaException(6, 2006, "[SMLDrive-Delete] Network not available!");
    }
}
