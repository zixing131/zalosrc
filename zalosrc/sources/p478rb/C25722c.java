package p478rb;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import ho0.AbstractC20110a;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import lu.C22652b;
import me0.AbstractC23041d2;
import org.json.JSONObject;

/* renamed from: rb.c */
/* loaded from: classes3.dex */
public class C25722c {

    /* renamed from: i */
    private static Context f122756i;

    /* renamed from: j */
    private static final char[] f122757j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    private HttpURLConnection f122758a = null;

    /* renamed from: b */
    private long f122759b = 0;

    /* renamed from: c */
    private int f122760c = 0;

    /* renamed from: d */
    private long f122761d = 0;

    /* renamed from: e */
    private String f122762e = "";

    /* renamed from: f */
    private boolean f122763f = false;

    /* renamed from: g */
    private a f122764g;

    /* renamed from: h */
    private int f122765h;

    /* renamed from: rb.c$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo123909a(C25720a c25720a);

        /* renamed from: b */
        void mo123910b(Object obj);

        /* renamed from: c */
        void mo123911c(long j11, String str);
    }

    /* renamed from: rb.c$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        private Vector f122766a = new Vector();

        /* renamed from: a */
        public void m132644a(String str) {
            this.f122766a.addElement(str);
        }

        /* renamed from: b */
        public String m132645b(int i11) {
            return (String) this.f122766a.elementAt(i11);
        }

        /* renamed from: c */
        public int m132646c() {
            return this.f122766a.size();
        }

        /* renamed from: d */
        public void m132647d() {
            boolean z11;
            do {
                int i11 = 0;
                z11 = true;
                while (i11 < this.f122766a.size() - 1) {
                    String str = (String) this.f122766a.elementAt(i11);
                    int i12 = i11 + 1;
                    String str2 = (String) this.f122766a.elementAt(i12);
                    if (str.compareTo(str2) > 0) {
                        this.f122766a.setElementAt(str2, i11);
                        this.f122766a.setElementAt(str, i12);
                        z11 = false;
                    }
                    i11 = i12;
                }
            } while (!z11);
        }
    }

    public C25722c(Context context, int i11) {
        f122756i = context;
        this.f122765h = i11;
    }

    /* renamed from: c */
    public static synchronized String m132630c(Hashtable hashtable, String str) {
        int i11;
        synchronized (C25722c.class) {
            try {
                String str2 = "";
                if (hashtable.size() == 0) {
                    return "";
                }
                b bVar = new b();
                Enumeration keys = hashtable.keys();
                while (keys.hasMoreElements()) {
                    String str3 = (String) keys.nextElement();
                    bVar.m132644a(str3 + "=" + ((String) hashtable.get(str3)));
                }
                bVar.m132647d();
                String str4 = "";
                for (int i12 = 0; i12 < bVar.m132646c(); i12++) {
                    str4 = str4 + bVar.m132645b(i12);
                }
                String str5 = str4 + str;
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    byte[] bArr = null;
                    try {
                        bArr = str5.getBytes("UTF-8");
                        messageDigest.update(bArr, 0, bArr.length);
                    } catch (UnsupportedEncodingException e11) {
                        e11.printStackTrace();
                    }
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        try {
                            i11 = messageDigest.digest(bArr2, 0, length);
                        } catch (DigestException e12) {
                            AbstractC20110a.m104539h(e12);
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            str2 = m132641n(bArr2, 0, i11);
                        }
                    }
                    return str2;
                } catch (NoSuchAlgorithmException unused) {
                    return "";
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    private static Context m132631d() {
        return f122756i;
    }

    /* renamed from: e */
    private String m132632e(String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer("");
        stringBuffer.append("--ZiNgMeEmAiL\r\n");
        stringBuffer.append("Content-Disposition: form-data; name=\"file\"; filename=\"");
        stringBuffer.append(str);
        stringBuffer.append("\"\r\nContent-Type: ");
        stringBuffer.append(str2);
        stringBuffer.append("\r\n\r\n");
        return stringBuffer.toString();
    }

    /* renamed from: f */
    public static String m132633f() {
        try {
            return ((TelephonyManager) m132631d().getSystemService("phone")).getNetworkOperatorName().toUpperCase();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return "UNKNOWN";
        }
    }

    /* renamed from: g */
    private String m132634g(Hashtable hashtable, boolean z11) {
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
                e11.printStackTrace();
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: h */
    public static String m132635h() {
        ConnectivityManager connectivityManager;
        try {
            connectivityManager = (ConnectivityManager) m132631d().getSystemService("connectivity");
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        if (connectivityManager == null) {
            return "UNKOWN";
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "UNKNOWN";
        }
        if (activeNetworkInfo.getType() == 1) {
            return "WIFI";
        }
        if (activeNetworkInfo.getType() == 6) {
            return "WIMAX";
        }
        if (activeNetworkInfo.getType() == 0) {
            return m132636i();
        }
        return "UNKNOWN";
    }

    /* renamed from: i */
    public static String m132636i() {
        try {
            switch (((TelephonyManager) m132631d().getSystemService("phone")).getNetworkType()) {
                case 0:
                    return "MOBILE UNKNOWN";
                case 1:
                    return "GPRS";
                case 2:
                    return "EDGE";
                case 3:
                    return "UMTS";
                case 4:
                    return "CDMA";
                case 5:
                    return "EVDO rev. 0";
                case 6:
                    return "EVDO rev. A";
                case 7:
                    return "1xRTT";
                case 8:
                    return "HSDPA";
                case 9:
                    return "HSUPA";
                case 10:
                    return "HSPA";
                case 11:
                    return "iDen";
                case 12:
                    return "EVDO rev. B";
                case 13:
                    return "LTE";
                case 14:
                    return "eHRPD";
                case 15:
                    return "HSPA+";
                default:
                    return "MOBILE UNKNOWN";
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return "MOBILE UNKNOWN";
        }
    }

    /* renamed from: j */
    private int m132637j() {
        return this.f122765h;
    }

    /* renamed from: l */
    private InputStream m132639l() {
        this.f122761d = this.f122758a.getContentLength();
        this.f122760c = this.f122758a.getResponseCode();
        this.f122762e = this.f122758a.getResponseMessage();
        if (this.f122760c == 200) {
            return this.f122758a.getInputStream();
        }
        throw new IOException("HTTP connection to URL: '" + this.f122758a.getURL() + "' returned response: " + this.f122760c + " " + this.f122762e);
    }

    /* renamed from: m */
    public static String m132640m(byte b11) {
        StringBuffer stringBuffer = new StringBuffer("");
        char[] cArr = f122757j;
        stringBuffer.append(cArr[(b11 & 255) >> 4]);
        stringBuffer.append(cArr[b11 & 15]);
        return stringBuffer.toString();
    }

    /* renamed from: n */
    public static String m132641n(byte[] bArr, int i11, int i12) {
        if (bArr != null && bArr.length != 0 && i12 <= bArr.length && i11 + i12 <= bArr.length) {
            StringBuffer stringBuffer = new StringBuffer(i12 * 2);
            while (i11 < i12) {
                stringBuffer.append(m132640m(bArr[i11]));
                i11++;
            }
            return stringBuffer.toString();
        }
        return "";
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m132638k(String str, String str2, String str3, String str4, String str5) {
        HttpURLConnection httpURLConnection;
        String str6;
        String substring;
        String m118221t;
        File file;
        try {
            try {
                str6 = Build.MODEL;
                substring = str2.substring(str2.lastIndexOf("/") + 1);
                m118221t = AbstractC23041d2.m118221t(str2, false);
                file = new File(str2);
            } catch (Exception e11) {
                a aVar = this.f122764g;
                if (aVar != null) {
                    aVar.mo123909a(new C25720a(502, "Đường truyền không ổn định.\nVui lòng thử lại."));
                }
                e11.printStackTrace();
                httpURLConnection = this.f122758a;
                if (httpURLConnection == null) {
                    return;
                }
            }
            if (file.length() > 10485760) {
                a aVar2 = this.f122764g;
                if (aVar2 != null) {
                    aVar2.mo123909a(new C25720a(19002, "File too big"));
                }
                HttpURLConnection httpURLConnection2 = this.f122758a;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                    return;
                }
                return;
            }
            Hashtable hashtable = new Hashtable();
            hashtable.put("session_key", str3);
            hashtable.put("client_type", String.valueOf(1));
            hashtable.put("version", String.valueOf(m132637j()));
            hashtable.put("model", str6);
            hashtable.put("api_key", str4);
            hashtable.put("sig", m132630c(hashtable, str5));
            String m132634g = m132634g(hashtable, false);
            byte[] bytes = m132632e(substring, m118221t).getBytes();
            byte[] bytes2 = m132634g.getBytes("UTF-8");
            long length = bytes2.length + bytes.length + file.length() + "\r\n--ZiNgMeEmAiL--\r\n".getBytes().length;
            URL url = new URL(str);
            C22652b.m117234a(str);
            HttpURLConnection httpURLConnection3 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            this.f122758a = httpURLConnection3;
            httpURLConnection3.setConnectTimeout(10000);
            this.f122758a.setDefaultUseCaches(false);
            this.f122758a.setUseCaches(false);
            this.f122758a.setDoInput(true);
            this.f122758a.setDoOutput(true);
            this.f122758a.setFixedLengthStreamingMode((int) length);
            this.f122758a.setRequestMethod("POST");
            this.f122758a.setRequestProperty("Connection", "Keep-Alive");
            this.f122758a.setRequestProperty("ENCTYPE", "multipart/form-data");
            this.f122758a.setRequestProperty("Content-Type", "multipart/form-data; boundary=ZiNgMeEmAiL");
            this.f122758a.setRequestProperty("MIME-version", "1.0");
            this.f122758a.setRequestProperty("User-Agent", System.getProperties().getProperty("http.agent"));
            this.f122758a.setRequestProperty("X-Data", m132635h());
            this.f122758a.setRequestProperty("X-Oper", m132633f());
            this.f122758a.connect();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(this.f122758a.getOutputStream());
            bufferedOutputStream.write(bytes2);
            bufferedOutputStream.write(bytes);
            long length2 = file.length();
            FileInputStream fileInputStream = new FileInputStream(file);
            int i11 = 0;
            while (true) {
                try {
                    int available = fileInputStream.available();
                    if (available <= 0 || this.f122763f) {
                        break;
                    }
                    int min = Math.min(available, 4096);
                    byte[] bArr = new byte[min];
                    bufferedOutputStream.write(bArr, 0, fileInputStream.read(bArr, 0, min));
                    i11 += min;
                    long j11 = (i11 * 100) / length2;
                    a aVar3 = this.f122764g;
                    if (aVar3 != null) {
                        aVar3.mo123911c(j11, j11 + "%");
                    }
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            if (this.f122763f) {
                HttpURLConnection httpURLConnection4 = this.f122758a;
                if (httpURLConnection4 != null) {
                    httpURLConnection4.disconnect();
                }
                fileInputStream.close();
                HttpURLConnection httpURLConnection5 = this.f122758a;
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
            InputStream m132639l = m132639l();
            if (m132639l != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(m132639l));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else {
                        sb2.append(readLine);
                    }
                }
                bufferedReader.close();
                m132639l.close();
            }
            String sb3 = sb2.toString();
            if (sb3 != null) {
                JSONObject jSONObject = new JSONObject(sb3);
                int i12 = jSONObject.getInt("error_code");
                if (i12 == 0) {
                    a aVar4 = this.f122764g;
                    if (aVar4 != null) {
                        aVar4.mo123910b(sb3);
                    }
                } else if (i12 != 324 && i12 != 102) {
                    String string = jSONObject.getString("error_message");
                    a aVar5 = this.f122764g;
                    if (aVar5 != null) {
                        aVar5.mo123909a(new C25720a(i12, string));
                    }
                } else {
                    String string2 = jSONObject.getString("error_message");
                    a aVar6 = this.f122764g;
                    if (aVar6 != null) {
                        aVar6.mo123909a(new C25720a(i12, string2));
                    }
                }
            } else {
                a aVar7 = this.f122764g;
                if (aVar7 != null) {
                    aVar7.mo123909a(new C25720a(502, "Đường truyền không ổn định.\nVui lòng thử lại."));
                }
            }
            httpURLConnection = this.f122758a;
            if (httpURLConnection == null) {
                return;
            }
            httpURLConnection.disconnect();
        } catch (Throwable th4) {
            HttpURLConnection httpURLConnection6 = this.f122758a;
            if (httpURLConnection6 != null) {
                httpURLConnection6.disconnect();
            }
            throw th4;
        }
    }

    /* renamed from: o */
    public void m132643o(final String str, final String str2, a aVar, final String str3, final String str4, final String str5) {
        this.f122764g = aVar;
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: rb.b
            @Override // java.lang.Runnable
            public final void run() {
                C25722c.this.m132638k(str, str2, str3, str4, str5);
            }
        });
    }
}
