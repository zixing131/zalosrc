package me.zalo.startuphelper;

import android.os.AsyncTask;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import jh0.AbstractC21254a;
import kh0.C21726b;
import org.json.JSONObject;

/* renamed from: me.zalo.startuphelper.e */
/* loaded from: classes7.dex */
public class AsyncTaskC23001e extends AsyncTask {

    /* renamed from: a */
    private final b f111860a;

    /* renamed from: b */
    private final String f111861b;

    /* renamed from: c */
    private final String f111862c;

    /* renamed from: d */
    private final String f111863d;

    /* renamed from: e */
    private final String f111864e;

    /* renamed from: f */
    private final boolean f111865f;

    /* renamed from: g */
    private final a f111866g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me.zalo.startuphelper.e$a */
    /* loaded from: classes7.dex */
    public interface a {
        /* renamed from: a */
        void mo117842a(boolean z11);
    }

    /* renamed from: me.zalo.startuphelper.e$b */
    /* loaded from: classes7.dex */
    public enum b {
        OPEN_APP,
        NOTIF,
        WAKE_UP
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AsyncTaskC23001e(C23003g c23003g, a aVar) {
        this.f111860a = c23003g.f111873a;
        this.f111861b = c23003g.f111874b;
        this.f111863d = c23003g.f111875c;
        this.f111862c = c23003g.f111876d;
        this.f111866g = aVar;
        this.f111864e = c23003g.f111877e.name();
        this.f111865f = c23003g.f111878f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Boolean] */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean doInBackground(Void... voidArr) {
        String m112136h;
        String str = "SubmitFirebaseTokenAsyncTask";
        try {
            b bVar = this.f111860a;
            if (bVar == b.NOTIF) {
                m112136h = C21726b.m112130b().m112136h("centralized_http_s", "/firebase/submit/notification");
            } else if (bVar == b.WAKE_UP) {
                m112136h = C21726b.m112130b().m112136h("centralized_http_s", "/firebase/submit/wakeup");
            } else {
                m112136h = C21726b.m112130b().m112136h("centralized_http_s", "/firebase/submit/openapp");
            }
            String str2 = "";
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(m112136h).openConnection()));
            httpURLConnection.setReadTimeout(120000);
            httpURLConnection.setConnectTimeout(120000);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            String str3 = "ext=" + URLEncoder.encode(this.f111864e, "UTF-8") + "&firebaseToken=" + URLEncoder.encode(this.f111863d, "UTF-8") + "&deviceData=" + URLEncoder.encode(this.f111861b, "UTF-8") + "&";
            if (this.f111862c != null) {
                str3 = str3 + "sourceFrom=" + URLEncoder.encode(this.f111862c, "UTF-8") + "&";
            }
            bufferedWriter.write(str3);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
            if (httpURLConnection.getResponseCode() == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        str2 = str2 + readLine;
                    } else {
                        try {
                            break;
                        } catch (Exception e11) {
                            AbstractC21254a.m110062d("SubmitFirebaseTokenAsyncTask", e11);
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject(str2);
                if (jSONObject.has(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR) && jSONObject.getInt(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR) == 1) {
                    str = Boolean.TRUE;
                    return str;
                }
            }
            return Boolean.FALSE;
        } catch (Exception e12) {
            AbstractC21254a.m110062d(str, e12);
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Boolean bool) {
        super.onPostExecute(bool);
        a aVar = this.f111866g;
        if (aVar != null) {
            aVar.mo117842a(bool.booleanValue());
        }
    }
}
