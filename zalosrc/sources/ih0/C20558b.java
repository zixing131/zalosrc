package ih0;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fh0.AbstractC18937b;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import jh0.AbstractC21254a;
import org.json.JSONException;
import org.json.JSONObject;
import p327lm.C22523c;

/* renamed from: ih0.b */
/* loaded from: classes7.dex */
public class C20558b {

    /* renamed from: a */
    public int f100930a;

    /* renamed from: b */
    private a f100931b;

    /* renamed from: c */
    private String f100932c;

    /* renamed from: f */
    private String f100935f;

    /* renamed from: g */
    private String f100936g;

    /* renamed from: h */
    private byte[] f100937h;

    /* renamed from: e */
    private Map f100934e = new HashMap();

    /* renamed from: d */
    private Map f100933d = new HashMap();

    /* renamed from: ih0.b$a */
    /* loaded from: classes7.dex */
    public enum a {
        GET,
        POST,
        POST_MULIIPART
    }

    public C20558b(a aVar, String str) {
        this.f100931b = aVar;
        this.f100932c = str;
        m106849a("SDK-Source", "ZaloSDK-4.24.0301");
        m106849a("extInfo", C22523c.m116498g().m116510o().toString());
    }

    /* renamed from: d */
    private String m106848d() {
        StringBuilder sb2 = new StringBuilder("");
        Map map = this.f100933d;
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    sb2.append(URLEncoder.encode(str, "UTF-8"));
                    sb2.append("=");
                    sb2.append(URLEncoder.encode((String) this.f100933d.get(str), "UTF-8"));
                    sb2.append("&");
                } catch (Exception e11) {
                    AbstractC21254a.m110071m(e11.toString());
                }
            }
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public void m106849a(String str, String str2) {
        this.f100934e.put(str, str2);
    }

    /* renamed from: b */
    public void m106850b(String str, String str2) {
        this.f100933d.put(str, str2);
    }

    /* renamed from: c */
    public JSONObject m106851c() {
        String str = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(m106852e()));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                    sb2.append("\n");
                } else {
                    bufferedReader.close();
                    str = sb2.toString();
                    AbstractC21254a.m110068j("getJSON() from: " + this.f100932c + "=" + str);
                    JSONObject jSONObject = new JSONObject(str);
                    int optInt = jSONObject.optInt(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
                    jSONObject.put(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, AbstractC18937b.m99236a(optInt));
                    jSONObject.put("extCode", optInt);
                    return jSONObject;
                }
            }
        } catch (Exception e11) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("errorMsg", str + "  " + e11.toString());
                return jSONObject2;
            } catch (JSONException e12) {
                e12.printStackTrace();
                AbstractC21254a.m110071m(e11.toString());
                return null;
            }
        }
    }

    /* renamed from: e */
    public InputStream m106852e() {
        String str;
        OutputStream outputStream;
        a aVar = this.f100931b;
        if (aVar == a.POST) {
            AbstractC21254a.m110068j("connect server : " + this.f100932c + " : " + m106848d());
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.f100932c).openConnection()));
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Accept-Charset", "UTF-8");
            for (String str2 : this.f100934e.keySet()) {
                httpURLConnection.setRequestProperty(str2, (String) this.f100934e.get(str2));
            }
            if (this.f100937h != null) {
                outputStream = httpURLConnection.getOutputStream();
                outputStream.write(this.f100937h);
            } else {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
                outputStream = httpURLConnection.getOutputStream();
                outputStream.write(m106848d().getBytes("UTF-8"));
            }
            outputStream.flush();
            outputStream.close();
            this.f100930a = httpURLConnection.getResponseCode();
            AbstractC21254a.m110068j("connect server POST " + this.f100930a);
            return httpURLConnection.getInputStream();
        }
        if (aVar == a.POST_MULIIPART) {
            AbstractC21254a.m110068j("connect server : " + this.f100932c + " : " + m106848d());
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.f100932c).openConnection()));
            httpURLConnection2.setDoInput(true);
            httpURLConnection2.setDoOutput(true);
            boolean z11 = false;
            httpURLConnection2.setUseCaches(false);
            httpURLConnection2.setConnectTimeout(120000);
            httpURLConnection2.setRequestMethod("POST");
            httpURLConnection2.setRequestProperty("Connection", "Keep-Alive");
            httpURLConnection2.setRequestProperty("ENCTYPE", "multipart/form-data");
            httpURLConnection2.setRequestProperty("Content-Type", "multipart/form-data;boundary=*****");
            String str3 = this.f100935f;
            if (str3 != null) {
                httpURLConnection2.setRequestProperty("uploaded_file", str3);
            }
            for (String str4 : this.f100934e.keySet()) {
                httpURLConnection2.setRequestProperty(str4, (String) this.f100934e.get(str4));
            }
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
            for (String str5 : this.f100933d.keySet()) {
                dataOutputStream.writeBytes("--*****\r\n");
                dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"" + str5 + "\"\r\n");
                dataOutputStream.writeBytes("Content-Type: text/plain; charset=UTF-8\r\n");
                dataOutputStream.writeBytes("\r\n");
                dataOutputStream.write(((String) this.f100933d.get(str5)).getBytes("UTF-8"));
                dataOutputStream.writeBytes("\r\n");
            }
            if (this.f100937h != null && this.f100935f != null && this.f100936g != null) {
                dataOutputStream.writeBytes("--*****\r\n");
                dataOutputStream.writeBytes("Content-Disposition: form-data; name=" + this.f100936g + ";filename=" + this.f100935f + "\r\n");
                dataOutputStream.writeBytes("\r\n");
                dataOutputStream.write(this.f100937h);
            }
            dataOutputStream.writeBytes("\r\n");
            dataOutputStream.writeBytes("--*****--\r\n");
            dataOutputStream.flush();
            dataOutputStream.close();
            int responseCode = httpURLConnection2.getResponseCode();
            AbstractC21254a.m110068j("connect server POST_MULTIPART " + responseCode);
            this.f100930a = httpURLConnection2.getResponseCode();
            if (responseCode >= 300) {
                String property = System.getProperty("line.separator");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection2.getErrorStream()));
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        if (!z11) {
                            str = "";
                        } else {
                            str = property;
                        }
                        sb2.append(str);
                        sb2.append(readLine);
                        z11 = true;
                    } else {
                        AbstractC21254a.m110068j(sb2.toString());
                        return null;
                    }
                }
            } else {
                return httpURLConnection2.getInputStream();
            }
        } else {
            StringBuilder sb3 = new StringBuilder(this.f100932c);
            if (sb3.toString().contains("?")) {
                sb3.append("&platform=android");
            } else {
                sb3.append("?platform=android");
            }
            for (String str6 : this.f100933d.keySet()) {
                try {
                    sb3.append("&");
                    sb3.append(URLEncoder.encode(str6, "UTF-8"));
                    sb3.append("=");
                    if (this.f100933d.get(str6) != null) {
                        sb3.append(URLEncoder.encode((String) this.f100933d.get(str6), "UTF-8").replace("+", "%20"));
                    } else {
                        sb3.append(URLEncoder.encode("", "UTF-8"));
                    }
                } catch (Exception e11) {
                    AbstractC21254a.m110071m(e11.toString());
                }
            }
            AbstractC21254a.m110068j("connect server GET : " + sb3.toString());
            HttpURLConnection httpURLConnection3 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(sb3.toString()).openConnection()));
            for (String str7 : this.f100934e.keySet()) {
                httpURLConnection3.setRequestProperty(str7, (String) this.f100934e.get(str7));
            }
            this.f100930a = httpURLConnection3.getResponseCode();
            return httpURLConnection3.getInputStream();
        }
    }

    /* renamed from: f */
    public String m106853f() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(m106852e()));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    if (sb2.length() > 0) {
                        sb2.append("\n");
                    }
                    sb2.append(readLine);
                } else {
                    bufferedReader.close();
                    return sb2.toString();
                }
            }
        } catch (Exception e11) {
            AbstractC21254a.m110071m(e11.toString());
            return null;
        }
    }
}
