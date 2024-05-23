package hm0;

import android.os.Build;
import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import im0.AbstractC20626a;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.net.ssl.HttpsURLConnection;
import jm0.AbstractC21309s;
import org.json.JSONObject;

/* renamed from: hm0.d */
/* loaded from: classes7.dex */
public class C20097d {

    /* renamed from: a */
    public HttpURLConnection f98841a = null;

    /* renamed from: b */
    public long f98842b = 0;

    /* renamed from: c */
    public int f98843c = 0;

    /* renamed from: d */
    public long f98844d = 0;

    /* renamed from: e */
    public String f98845e = "";

    /* renamed from: f */
    public boolean f98846f = false;

    /* renamed from: g */
    public InterfaceC20098e f98847g;

    /* renamed from: hm0.d$a */
    /* loaded from: classes7.dex */
    public class a implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ String f98848p;

        /* renamed from: q */
        public final /* synthetic */ byte[] f98849q;

        /* renamed from: r */
        public final /* synthetic */ String f98850r;

        /* renamed from: s */
        public final /* synthetic */ String f98851s;

        /* renamed from: t */
        public final /* synthetic */ String f98852t;

        /* renamed from: u */
        public final /* synthetic */ int f98853u;

        public a(String str, byte[] bArr, String str2, String str3, String str4, int i11) {
            this.f98848p = str;
            this.f98849q = bArr;
            this.f98850r = str2;
            this.f98851s = str3;
            this.f98852t = str4;
            this.f98853u = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            C20097d.this.m104499e(this.f98848p, this.f98849q, null, this.f98850r, this.f98851s, this.f98852t, this.f98853u);
        }
    }

    /* renamed from: a */
    public final InputStream m104495a() {
        this.f98844d = this.f98841a.getContentLength();
        this.f98843c = this.f98841a.getResponseCode();
        this.f98845e = this.f98841a.getResponseMessage();
        if (this.f98843c == 200) {
            return this.f98841a.getInputStream();
        }
        throw new IOException("HTTP connection to URL: '" + this.f98841a.getURL() + "' returned response: " + this.f98843c + " " + this.f98845e);
    }

    /* renamed from: b */
    public final String m104496b(String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer("");
        stringBuffer.append("--ZiNgMeEmAiL\r\n");
        stringBuffer.append("Content-Disposition: form-data; name=\"file\"; filename=\"");
        stringBuffer.append(str);
        stringBuffer.append("\"\r\nContent-Type: ");
        stringBuffer.append(str2);
        stringBuffer.append("\r\n\r\n");
        return stringBuffer.toString();
    }

    /* renamed from: c */
    public final String m104497c(Hashtable hashtable, boolean z11) {
        StringBuffer stringBuffer = new StringBuffer();
        if (hashtable != null) {
            try {
                if (hashtable.size() > 0) {
                    Enumeration keys = hashtable.keys();
                    while (keys.hasMoreElements()) {
                        String str = (String) keys.nextElement();
                        String str2 = (String) hashtable.get(str);
                        stringBuffer.append("--ZiNgMeEmAiL\r\n");
                        stringBuffer.append("Content-Disposition: form-data; name=\"");
                        stringBuffer.append(str);
                        stringBuffer.append("\"\r\n\r\n");
                        stringBuffer.append(str2);
                        stringBuffer.append("\r\n");
                    }
                    if (z11) {
                        stringBuffer.append("--ZiNgMeEmAiL--\r\n");
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104546o(e11);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: d */
    public void m104498d(String str, String str2, Hashtable hashtable, String str3, String str4, String str5) {
        HttpURLConnection httpURLConnection;
        String str6;
        String substring;
        String substring2;
        File file;
        try {
            try {
                str6 = Build.MODEL;
                substring = str2.substring(str2.lastIndexOf("/") + 1);
                substring2 = str2.substring(str2.lastIndexOf(".") + 1);
                file = new File(str2);
            } catch (Exception e11) {
                InterfaceC20098e interfaceC20098e = this.f98847g;
                if (interfaceC20098e != null) {
                    interfaceC20098e.mo2128a(new C20096c(502, AbstractC20095b.f98832d));
                }
                AbstractC20110a.m104546o(e11);
                httpURLConnection = this.f98841a;
                if (httpURLConnection == null) {
                    return;
                }
            }
            if (file.length() > 10485760) {
                InterfaceC20098e interfaceC20098e2 = this.f98847g;
                if (interfaceC20098e2 != null) {
                    interfaceC20098e2.mo2128a(new C20096c(19002, "File too big"));
                }
                HttpURLConnection httpURLConnection2 = this.f98841a;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                    return;
                }
                return;
            }
            Hashtable hashtable2 = new Hashtable();
            if (hashtable != null && hashtable.size() > 0) {
                Enumeration keys = hashtable.keys();
                while (keys.hasMoreElements()) {
                    String str7 = (String) keys.nextElement();
                    hashtable2.put(str7, (String) hashtable.get(str7));
                }
            }
            hashtable2.put("session_key", str3);
            hashtable2.put("device", str6);
            hashtable2.put("description", "");
            hashtable2.put("api_key", str4);
            hashtable2.put("sig", AbstractC21309s.m110339c(hashtable2));
            String m104497c = m104497c(hashtable2, false);
            byte[] bytes = m104496b(substring, substring2).getBytes();
            byte[] bytes2 = m104497c.getBytes("UTF-8");
            long length = bytes2.length + bytes.length + file.length() + "\r\n--ZiNgMeEmAiL--\r\n".getBytes().length;
            HttpURLConnection httpURLConnection3 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
            this.f98841a = httpURLConnection3;
            httpURLConnection3.setConnectTimeout(10000);
            this.f98841a.setDefaultUseCaches(false);
            this.f98841a.setUseCaches(false);
            this.f98841a.setDoInput(true);
            this.f98841a.setDoOutput(true);
            this.f98841a.setFixedLengthStreamingMode((int) length);
            this.f98841a.setRequestMethod("POST");
            this.f98841a.setRequestProperty("Connection", "Keep-Alive");
            this.f98841a.setRequestProperty("ENCTYPE", "multipart/form-data");
            this.f98841a.setRequestProperty("Content-Type", "multipart/form-data; boundary=ZiNgMeEmAiL");
            this.f98841a.setRequestProperty("MIME-version", "1.0");
            this.f98841a.setRequestProperty("User-Agent", System.getProperties().getProperty("http.agent"));
            this.f98841a.setRequestProperty("X-Data", AbstractC20626a.m107389e());
            this.f98841a.setRequestProperty("X-Oper", AbstractC20626a.m107386b());
            this.f98841a.connect();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(this.f98841a.getOutputStream());
            bufferedOutputStream.write(bytes2);
            bufferedOutputStream.write(bytes);
            long length2 = file.length();
            FileInputStream fileInputStream = new FileInputStream(file);
            int i11 = 0;
            while (true) {
                try {
                    int available = fileInputStream.available();
                    if (available <= 0 || this.f98846f) {
                        break;
                    }
                    int min = Math.min(available, 4096);
                    byte[] bArr = new byte[min];
                    bufferedOutputStream.write(bArr, 0, fileInputStream.read(bArr, 0, min));
                    i11 += min;
                    long j11 = (i11 * 100) / length2;
                    InterfaceC20098e interfaceC20098e3 = this.f98847g;
                    if (interfaceC20098e3 != null) {
                        interfaceC20098e3.mo2130c(j11, j11 + "%");
                    }
                } finally {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            if (this.f98846f) {
                HttpURLConnection httpURLConnection4 = this.f98841a;
                if (httpURLConnection4 != null) {
                    httpURLConnection4.disconnect();
                }
                fileInputStream.close();
                HttpURLConnection httpURLConnection5 = this.f98841a;
                if (httpURLConnection5 != null) {
                    httpURLConnection5.disconnect();
                    return;
                }
                return;
            }
            bufferedOutputStream.write("\r\n".getBytes());
            bufferedOutputStream.write("--ZiNgMeEmAiL--\r\n".getBytes());
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            fileInputStream.close();
            StringBuilder sb2 = new StringBuilder();
            InputStream m104495a = m104495a();
            if (m104495a != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(m104495a));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else {
                        sb2.append(readLine);
                    }
                }
                bufferedReader.close();
                m104495a.close();
            }
            String sb3 = sb2.toString();
            if (sb3 != null) {
                JSONObject jSONObject = new JSONObject(sb3);
                int i12 = jSONObject.getInt("error_code");
                if (i12 == 0) {
                    InterfaceC20098e interfaceC20098e4 = this.f98847g;
                    if (interfaceC20098e4 != null) {
                        interfaceC20098e4.mo2129b(sb3);
                    }
                } else if (i12 != 324 && i12 != 102) {
                    String string = jSONObject.getString("error_message");
                    InterfaceC20098e interfaceC20098e5 = this.f98847g;
                    if (interfaceC20098e5 != null) {
                        interfaceC20098e5.mo2128a(new C20096c(i12, string));
                    }
                } else {
                    String string2 = jSONObject.getString("error_message");
                    InterfaceC20098e interfaceC20098e6 = this.f98847g;
                    if (interfaceC20098e6 != null) {
                        interfaceC20098e6.mo2128a(new C20096c(i12, string2));
                    }
                }
            } else {
                InterfaceC20098e interfaceC20098e7 = this.f98847g;
                if (interfaceC20098e7 != null) {
                    interfaceC20098e7.mo2128a(new C20096c(502, AbstractC20095b.f98832d));
                }
            }
            httpURLConnection = this.f98841a;
            if (httpURLConnection == null) {
                return;
            }
            httpURLConnection.disconnect();
        } catch (Throwable th3) {
            HttpURLConnection httpURLConnection6 = this.f98841a;
            if (httpURLConnection6 != null) {
                httpURLConnection6.disconnect();
            }
            throw th3;
        }
    }

    /* renamed from: e */
    public void m104499e(String str, byte[] bArr, Hashtable hashtable, String str2, String str3, String str4, int i11) {
        HttpURLConnection httpURLConnection;
        ByteArrayInputStream byteArrayInputStream;
        BufferedOutputStream bufferedOutputStream;
        try {
            try {
                String str5 = Build.MODEL;
                byte[] bytes = m104496b("", "").getBytes();
                long length = bytes.length + bArr.length + "\r\n--ZiNgMeEmAiL--\r\n".getBytes().length;
                byteArrayInputStream = new ByteArrayInputStream(bArr);
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
                this.f98841a = httpURLConnection2;
                httpURLConnection2.setConnectTimeout(10000);
                this.f98841a.setDefaultUseCaches(false);
                this.f98841a.setUseCaches(false);
                this.f98841a.setDoInput(true);
                this.f98841a.setDoOutput(true);
                this.f98841a.setFixedLengthStreamingMode((int) length);
                this.f98841a.setRequestMethod("POST");
                this.f98841a.setRequestProperty("Connection", "Keep-Alive");
                this.f98841a.setRequestProperty("ENCTYPE", "multipart/form-data");
                this.f98841a.setRequestProperty("Content-Type", "multipart/form-data; boundary=ZiNgMeEmAiL");
                this.f98841a.setRequestProperty("MIME-version", "1.0");
                this.f98841a.setRequestProperty("User-Agent", System.getProperties().getProperty("http.agent"));
                this.f98841a.setRequestProperty("X-Data", AbstractC20626a.m107389e());
                this.f98841a.setRequestProperty("X-Oper", AbstractC20626a.m107386b());
                int m107387c = AbstractC20626a.m107387c();
                this.f98841a.setRequestProperty("version", "1");
                this.f98841a.setRequestProperty("device", str5);
                this.f98841a.setRequestProperty("description", "");
                this.f98841a.setRequestProperty("clientType", "1");
                this.f98841a.setRequestProperty("clientVersion", String.valueOf(CoreUtility.f89236l));
                this.f98841a.setRequestProperty("dataVersion", "1");
                this.f98841a.setRequestProperty("networkType", String.valueOf(m107387c));
                this.f98841a.setRequestProperty("requestId", String.valueOf(System.currentTimeMillis()));
                this.f98841a.setRequestProperty("frameSize", String.valueOf(i11));
                HttpURLConnection httpURLConnection3 = this.f98841a;
                if (httpURLConnection3 instanceof HttpsURLConnection) {
                    httpURLConnection3.setRequestProperty("session_key", CoreUtility.f89232h);
                }
                this.f98841a.setRequestProperty("viewer-key", str2);
                this.f98841a.connect();
                bufferedOutputStream = new BufferedOutputStream(this.f98841a.getOutputStream());
                bufferedOutputStream.write(bytes);
                long length2 = bArr.length;
                int i12 = 0;
                while (true) {
                    int available = byteArrayInputStream.available();
                    if (available <= 0 || this.f98846f) {
                        break;
                    }
                    int min = Math.min(available, 4096);
                    byte[] bArr2 = new byte[min];
                    bufferedOutputStream.write(bArr2, 0, byteArrayInputStream.read(bArr2, 0, min));
                    i12 += min;
                    long j11 = (i12 * 100) / length2;
                    InterfaceC20098e interfaceC20098e = this.f98847g;
                    if (interfaceC20098e != null) {
                        interfaceC20098e.mo2130c(j11, j11 + "%");
                    }
                }
            } catch (Exception e11) {
                InterfaceC20098e interfaceC20098e2 = this.f98847g;
                if (interfaceC20098e2 != null) {
                    interfaceC20098e2.mo2128a(new C20096c(112, AbstractC20095b.f98833e, -1, e11.getMessage()));
                }
                AbstractC20110a.m104546o(e11);
                httpURLConnection = this.f98841a;
                if (httpURLConnection == null) {
                    return;
                }
            }
            if (this.f98846f) {
                HttpURLConnection httpURLConnection4 = this.f98841a;
                if (httpURLConnection4 != null) {
                    httpURLConnection4.disconnect();
                }
                HttpURLConnection httpURLConnection5 = this.f98841a;
                if (httpURLConnection5 != null) {
                    httpURLConnection5.disconnect();
                    return;
                }
                return;
            }
            bufferedOutputStream.write("\r\n".getBytes());
            bufferedOutputStream.write("--ZiNgMeEmAiL--\r\n".getBytes());
            byteArrayInputStream.close();
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            StringBuilder sb2 = new StringBuilder();
            InputStream m104495a = m104495a();
            if (m104495a != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(m104495a));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else {
                        sb2.append(readLine);
                    }
                }
                bufferedReader.close();
                m104495a.close();
            }
            String sb3 = sb2.toString();
            if (sb3 != null) {
                JSONObject jSONObject = new JSONObject(sb3);
                int i13 = jSONObject.getInt("error_code");
                if (i13 == 0) {
                    InterfaceC20098e interfaceC20098e3 = this.f98847g;
                    if (interfaceC20098e3 != null) {
                        interfaceC20098e3.mo2129b(sb3);
                    }
                } else if (i13 != 324 && i13 != 102) {
                    String string = jSONObject.getString("error_message");
                    InterfaceC20098e interfaceC20098e4 = this.f98847g;
                    if (interfaceC20098e4 != null) {
                        interfaceC20098e4.mo2128a(new C20096c(i13, string));
                    }
                } else {
                    String string2 = jSONObject.getString("error_message");
                    InterfaceC20098e interfaceC20098e5 = this.f98847g;
                    if (interfaceC20098e5 != null) {
                        interfaceC20098e5.mo2128a(new C20096c(i13, string2));
                    }
                }
            } else {
                InterfaceC20098e interfaceC20098e6 = this.f98847g;
                if (interfaceC20098e6 != null) {
                    interfaceC20098e6.mo2128a(new C20096c(502, AbstractC20095b.f98832d));
                }
            }
            httpURLConnection = this.f98841a;
            if (httpURLConnection == null) {
                return;
            }
            httpURLConnection.disconnect();
        } catch (Throwable th2) {
            HttpURLConnection httpURLConnection6 = this.f98841a;
            if (httpURLConnection6 != null) {
                httpURLConnection6.disconnect();
            }
            throw th2;
        }
    }

    /* renamed from: f */
    public void m104500f(InterfaceC20098e interfaceC20098e) {
        this.f98847g = interfaceC20098e;
    }

    /* renamed from: g */
    public void m104501g(String str, byte[] bArr, InterfaceC20098e interfaceC20098e, String str2, String str3, String str4, int i11) {
        if (!TextUtils.isEmpty(str)) {
            this.f98847g = interfaceC20098e;
            new Thread(new a(str, bArr, str2, str3, str4, i11)).start();
        }
    }
}
