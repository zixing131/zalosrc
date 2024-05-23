package v30;

import android.text.TextUtils;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import f30.InterfaceC18712a;
import ho0.AbstractC20110a;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import nh0.InterfaceC23792b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p348mi.AbstractC23309i;

/* renamed from: v30.a */
/* loaded from: classes5.dex */
public class C27510a implements InterfaceC18712a {

    /* renamed from: a */
    private float f129418a;

    /* renamed from: b */
    private final long f129419b;

    /* renamed from: c */
    private final float[] f129420c;

    /* renamed from: d */
    private final float[] f129421d;

    /* renamed from: e */
    private final float[] f129422e;

    /* renamed from: f */
    private float[] f129423f;

    /* renamed from: g */
    private final HashMap f129424g;

    /* renamed from: h */
    private final String[] f129425h;

    /* renamed from: i */
    private int f129426i;

    /* renamed from: j */
    private final InterfaceC23792b f129427j;

    /* renamed from: k */
    private float f129428k;

    /* renamed from: l */
    private final int f129429l;

    /* renamed from: m */
    private final String[] f129430m;

    public C27510a(String str, InterfaceC23792b interfaceC23792b) {
        int length;
        this.f129427j = interfaceC23792b;
        JSONObject jSONObject = new JSONObject(m140657n(str));
        float optDouble = (float) jSONObject.optDouble("delta", 0.01d);
        this.f129418a = optDouble;
        if (optDouble < 0.0f) {
            this.f129418a = 0.01f;
        }
        this.f129419b = jSONObject.optLong("resetTime", 86400000L);
        int optInt = jSONObject.optInt("minimumWordCount", 3);
        this.f129426i = optInt;
        if (optInt < 3) {
            this.f129426i = 3;
        }
        float optDouble2 = (float) jSONObject.optDouble("keepThreshold", 0.3d);
        this.f129428k = optDouble2;
        if (optDouble2 < 0.0f) {
            this.f129428k = 0.3f;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("labels");
        if (optJSONObject == null) {
            length = 0;
        } else {
            length = optJSONObject.length();
        }
        this.f129420c = new float[length];
        this.f129422e = new float[length];
        this.f129421d = new float[length];
        this.f129425h = new String[length];
        this.f129424g = new HashMap();
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            int i11 = 0;
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray jSONArray = (JSONArray) optJSONObject.get(next);
                this.f129420c[i11] = (float) jSONArray.getDouble(1);
                this.f129421d[i11] = (float) jSONArray.getDouble(0);
                this.f129422e[i11] = (float) jSONArray.getDouble(2);
                this.f129425h[i11] = next;
                this.f129424g.put(next, Integer.valueOf(i11));
                i11++;
            }
        }
        this.f129423f = m140656l();
        this.f129429l = jSONObject.optInt("maxLen", 30);
        JSONArray jSONArray2 = jSONObject.getJSONArray("modelNames");
        this.f129430m = new String[jSONArray2.length()];
        for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
            this.f129430m[i12] = jSONArray2.getString(i12);
        }
    }

    /* renamed from: l */
    private synchronized float[] m140656l() {
        String m121625Y0 = AbstractC23309i.m121625Y0();
        if (TextUtils.isEmpty(m121625Y0)) {
            return (float[]) this.f129420c.clone();
        }
        try {
            JSONArray jSONArray = new JSONArray(m121625Y0);
            int length = jSONArray.length();
            float[] fArr = this.f129420c;
            if (length == fArr.length) {
                float[] fArr2 = new float[fArr.length];
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    fArr2[i11] = Float.parseFloat(jSONArray.optString(i11));
                }
                return fArr2;
            }
            throw new IllegalArgumentException("Local data not match length");
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return (float[]) this.f129420c.clone();
        }
    }

    /* renamed from: n */
    private String m140657n(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[ZVideoUtilMetadata.FF_PROFILE_H264_INTRA];
                while (true) {
                    int read = fileInputStream.read(bArr, 0, ZVideoUtilMetadata.FF_PROFILE_H264_INTRA);
                    if (read >= 0) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
                        fileInputStream.close();
                        return byteArrayOutputStream2;
                    }
                }
            } finally {
            }
        } catch (IOException e11) {
            AbstractC20110a.m104539h(e11);
            return "";
        }
    }

    @Override // f30.InterfaceC18712a
    /* renamed from: a */
    public synchronized void mo98683a() {
        try {
            AbstractC23309i.m122133lh(new JSONArray(this.f129423f).toString());
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    @Override // f30.InterfaceC18712a
    /* renamed from: b */
    public int mo98684b() {
        return this.f129426i;
    }

    @Override // f30.InterfaceC18712a
    /* renamed from: c */
    public float mo98685c() {
        return this.f129428k;
    }

    @Override // f30.InterfaceC18712a
    /* renamed from: d */
    public synchronized void mo98686d(int i11) {
        float[] fArr = this.f129423f;
        fArr[i11] = Math.min(fArr[i11] + this.f129418a, this.f129422e[i11]);
    }

    @Override // f30.InterfaceC18712a
    /* renamed from: e */
    public int mo98687e() {
        return this.f129429l;
    }

    @Override // f30.InterfaceC18712a
    /* renamed from: f */
    public synchronized void mo98688f(int i11) {
        float[] fArr = this.f129423f;
        fArr[i11] = Math.max(fArr[i11] - this.f129418a, this.f129421d[i11]);
    }

    @Override // f30.InterfaceC18712a
    /* renamed from: g */
    public synchronized void mo98689g() {
        long mo124314i = this.f129427j.mo124314i();
        if (mo124314i - AbstractC23309i.m122604y5() > this.f129419b) {
            AbstractC23309i.m121136Kt(mo124314i);
            AbstractC23309i.m122133lh("");
            this.f129423f = (float[]) this.f129420c.clone();
        }
    }

    @Override // f30.InterfaceC18712a
    /* renamed from: h */
    public int mo98690h(String str) {
        Integer num = (Integer) this.f129424g.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // f30.InterfaceC18712a
    /* renamed from: i */
    public String mo98691i(int i11) {
        return this.f129425h[i11];
    }

    @Override // f30.InterfaceC18712a
    /* renamed from: j */
    public int mo98692j() {
        return this.f129425h.length;
    }

    @Override // f30.InterfaceC18712a
    /* renamed from: k */
    public float mo98693k(int i11) {
        return this.f129423f[i11];
    }

    /* renamed from: m */
    public String[] m140658m() {
        return this.f129430m;
    }
}
