package p728zt;

import android.content.Context;
import android.os.Build;
import com.zing.zalo.utils.NativeLoader;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import java.io.File;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23190q8;
import mm0.AbstractC23356k;
import org.json.JSONObject;

/* renamed from: zt.a */
/* loaded from: classes4.dex */
public class C32552a {

    /* renamed from: a */
    public String f150430a;

    /* renamed from: b */
    public int f150431b;

    /* renamed from: c */
    public String f150432c;

    /* renamed from: d */
    public String f150433d;

    /* renamed from: e */
    public String f150434e;

    /* renamed from: f */
    public long f150435f;

    /* renamed from: g */
    public String f150436g;

    /* renamed from: h */
    public int f150437h;

    /* renamed from: i */
    public JSONObject f150438i;

    /* renamed from: j */
    private boolean f150439j = false;

    /* renamed from: k */
    private Object f150440k = new Object();

    /* renamed from: l */
    public final AtomicBoolean f150441l = new AtomicBoolean(false);

    public C32552a(JSONObject jSONObject) {
        this.f150430a = jSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        this.f150432c = jSONObject.optString("checksum_zip");
        this.f150433d = jSONObject.optString("checksum_inside");
        this.f150431b = jSONObject.optInt("version");
        this.f150435f = jSONObject.optLong("fileSize", -1L);
        this.f150437h = jSONObject.optInt("minVersion");
    }

    /* renamed from: d */
    public static C32552a m157628d(String str, JSONObject jSONObject) {
        JSONObject optJSONObject;
        String str2 = "x86";
        try {
            JSONObject optJSONObject2 = jSONObject.optJSONObject(str);
            if (optJSONObject2 != null) {
                String[] strArr = Build.SUPPORTED_ABIS;
                if (strArr.length > 0) {
                    int length = strArr.length;
                    int i11 = 0;
                    optJSONObject = null;
                    while (true) {
                        if (i11 < length) {
                            String str3 = strArr[i11];
                            JSONObject optJSONObject3 = optJSONObject2.optJSONObject(str3);
                            if (optJSONObject3 != null) {
                                str2 = str3;
                                optJSONObject = optJSONObject3;
                                break;
                            }
                            i11++;
                            optJSONObject = optJSONObject3;
                        } else {
                            str2 = null;
                            break;
                        }
                    }
                } else {
                    String m119489a = AbstractC23190q8.m119489a(CoreUtility.getAppContext(), "ro.product.cpu.abi");
                    if (!"x86".equalsIgnoreCase(m119489a) && !"i686".equalsIgnoreCase(m119489a) && !"x86_64".equalsIgnoreCase(m119489a)) {
                        str2 = Build.CPU_ABI;
                        optJSONObject = optJSONObject2.optJSONObject(str2);
                    }
                    optJSONObject = optJSONObject2.optJSONObject("x86");
                }
                if (optJSONObject != null) {
                    C32552a c32552a = new C32552a(optJSONObject);
                    c32552a.f150436g = str2;
                    c32552a.f150434e = str;
                    c32552a.f150438i = optJSONObject2.optJSONObject("static");
                    return c32552a;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return null;
    }

    /* renamed from: a */
    public String m157629a() {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update((this.f150430a + this.f150431b + this.f150432c + this.f150434e + this.f150435f + this.f150437h).getBytes());
            return AbstractC23356k.m122799e(messageDigest.digest());
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public File m157630b(Context context) {
        File m89234m = NativeLoader.m89234m(context, this.f150434e);
        if (m89234m != null) {
            File file = new File(m89234m, "assets");
            file.mkdirs();
            return file;
        }
        return m89234m;
    }

    /* renamed from: c */
    public boolean m157631c() {
        boolean z11;
        synchronized (this.f150440k) {
            z11 = this.f150439j;
        }
        return z11;
    }

    /* renamed from: e */
    public boolean m157632e(boolean z11) {
        boolean z12;
        synchronized (this.f150440k) {
            boolean z13 = this.f150439j;
            this.f150439j = z11;
            z12 = !z13;
        }
        return z12;
    }
}
