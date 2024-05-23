package id;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.zing.zalo.backuprestore.media.exception.DriveAuthException;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import im0.AbstractC20626a;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import ln0.AbstractC22543l;
import org.json.JSONObject;
import p185gc.AbstractC19384h;
import p543uc.C27224b;
import p543uc.C27225c;
import p620wt.AbstractC29237l;

/* renamed from: id.c */
/* loaded from: classes3.dex */
public final class C20513c extends AbstractC19384h {
    public static final a Companion = new a(null);

    /* renamed from: id.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: id.c$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final String f100791a;

        public b(String str) {
            AbstractC19074t.m100208f(str, "token");
            this.f100791a = str;
        }

        /* renamed from: a */
        public final String m106573a() {
            return this.f100791a;
        }
    }

    /* renamed from: id.c$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        private final long f100792a;

        public c(long j11) {
            this.f100792a = j11;
        }

        /* renamed from: a */
        public final long m106574a() {
            return this.f100792a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p185gc.AbstractC19384h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c mo13388b(b bVar) {
        HttpURLConnection httpURLConnection;
        Throwable th2;
        BufferedReader bufferedReader;
        c cVar;
        JSONObject optJSONObject;
        long m116581d;
        AbstractC19074t.m100208f(bVar, "params");
        if (bVar.m106573a().length() != 0) {
            BufferedReader bufferedReader2 = null;
            try {
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(C27224b.f127988a.m139325e()).openConnection());
                AbstractC19074t.m100206d(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                httpURLConnection = (HttpURLConnection) uRLConnection;
                try {
                    int m107385a = AbstractC20626a.m107385a(3);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setConnectTimeout(m107385a);
                    httpURLConnection.setReadTimeout(m107385a);
                    httpURLConnection.setRequestProperty("Authorization", "Bearer " + bVar.m106573a());
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                        try {
                            try {
                                String str = "";
                                StringBuilder sb2 = new StringBuilder();
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine != null) {
                                        str = readLine;
                                    } else {
                                        readLine = null;
                                    }
                                    if (readLine == null) {
                                        break;
                                    }
                                    sb2.append(str);
                                }
                                if (sb2.length() > 0 && (optJSONObject = new JSONObject(sb2.toString()).optJSONObject("storageQuota")) != null) {
                                    m116581d = AbstractC22543l.m116581d(optJSONObject.optLong("limit") - optJSONObject.optLong("usage"), 0L);
                                    cVar = new c(m116581d);
                                } else {
                                    cVar = null;
                                }
                                bufferedReader2 = bufferedReader;
                            } catch (Throwable th3) {
                                th2 = th3;
                                if (httpURLConnection != null) {
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (Exception e11) {
                                        AbstractC20110a.f98889a.mo104552e(e11);
                                    }
                                }
                                AbstractC29237l.m145996a(bufferedReader);
                                throw th2;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            AbstractC20110a.f98889a.mo104552e(e);
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Exception e13) {
                                    AbstractC20110a.f98889a.mo104552e(e13);
                                }
                            }
                            AbstractC29237l.m145996a(bufferedReader);
                            return null;
                        }
                    } else {
                        C27225c.m139331f("SMLGetStorageQuotaFromDrive", 6, responseCode, httpURLConnection);
                        cVar = null;
                    }
                    try {
                        httpURLConnection.disconnect();
                    } catch (Exception e14) {
                        AbstractC20110a.f98889a.mo104552e(e14);
                    }
                    AbstractC29237l.m145996a(bufferedReader2);
                    return cVar;
                } catch (Exception e15) {
                    e = e15;
                    bufferedReader = null;
                } catch (Throwable th4) {
                    th2 = th4;
                    bufferedReader = null;
                    if (httpURLConnection != null) {
                    }
                    AbstractC29237l.m145996a(bufferedReader);
                    throw th2;
                }
            } catch (Exception e16) {
                e = e16;
                bufferedReader = null;
                httpURLConnection = null;
            } catch (Throwable th5) {
                httpURLConnection = null;
                th2 = th5;
                bufferedReader = null;
            }
        } else {
            throw new DriveAuthException(6, ZAbstractBase.ZVU_PROCESS_VIDEO_TO_SEQUENCE_IMAGE, "Get quota Drive failed: invalid token");
        }
    }
}
