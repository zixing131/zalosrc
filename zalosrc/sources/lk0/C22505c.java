package lk0;

import android.text.TextUtils;
import com.zing.zalo.zinstant.exception.ZinstantException;
import com.zing.zalo.zinstant.utils.AbstractC17201m;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import ik0.EnumC20598u;
import org.json.JSONObject;

/* renamed from: lk0.c */
/* loaded from: classes7.dex */
public class C22505c implements InterfaceC22508f {

    /* renamed from: a */
    public String f110141a;

    /* renamed from: b */
    public String f110142b;

    /* renamed from: c */
    public int f110143c;

    /* renamed from: d */
    public long f110144d;

    /* renamed from: e */
    public long f110145e;

    /* renamed from: f */
    public int f110146f;

    /* renamed from: g */
    public String f110147g;

    /* renamed from: h */
    public String f110148h;

    /* renamed from: i */
    private int f110149i;

    public C22505c(int i11, JSONObject jSONObject) {
        this.f110146f = 0;
        this.f110149i = 0;
        if (jSONObject != null) {
            this.f110149i = i11;
            String optString = jSONObject.optString("zinstantdata_id");
            this.f110142b = optString;
            if (!TextUtils.isEmpty(optString)) {
                this.f110141a = jSONObject.getString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                this.f110143c = jSONObject.optInt("socketCmd");
                if (TextUtils.isEmpty(this.f110141a) && this.f110143c <= 0) {
                    throw new ZinstantException(101, "Config API was invalid");
                }
                long optLong = jSONObject.optLong("expiredTime");
                this.f110147g = jSONObject.optString("data_extras");
                this.f110146f = jSONObject.optInt("httpType", 0);
                if (optLong > 0) {
                    this.f110144d = optLong;
                }
                this.f110148h = jSONObject.optString("bundle_data");
                return;
            }
            throw new ZinstantException(102, "zinstantdata_id was empty");
        }
        throw new ZinstantException(100, "Json data was null");
    }

    @Override // lk0.InterfaceC22508f
    /* renamed from: a */
    public JSONObject mo116351a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, this.f110141a);
        jSONObject.put("zinstantdata_id", this.f110142b);
        jSONObject.put("socketCmd", this.f110143c);
        jSONObject.put("httpType", this.f110146f);
        jSONObject.put("data_extras", this.f110147g);
        jSONObject.put("bundle_data", this.f110148h);
        long j11 = this.f110144d;
        if (j11 > 0) {
            jSONObject.put("expiredTime", j11);
        }
        return jSONObject;
    }

    @Override // lk0.InterfaceC22508f
    /* renamed from: b */
    public boolean mo116352b(EnumC20598u enumC20598u) {
        if (this.f110145e + this.f110144d < System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    @Override // lk0.InterfaceC22508f
    /* renamed from: c */
    public String mo116353c() {
        return this.f110148h;
    }

    /* renamed from: d */
    public String m116357d() {
        return this.f110147g;
    }

    /* renamed from: e */
    public int m116358e() {
        return this.f110146f;
    }

    public boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22505c)) {
            return false;
        }
        C22505c c22505c = (C22505c) obj;
        String str2 = this.f110141a;
        if (str2 != null && str2.equals(c22505c.f110141a) && (str = this.f110142b) != null && str.equals(c22505c.f110142b) && this.f110143c == c22505c.f110143c && this.f110146f == c22505c.f110146f && TextUtils.equals(this.f110147g, c22505c.f110147g) && TextUtils.equals(this.f110148h, c22505c.f110148h)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m116359f() {
        return this.f110143c;
    }

    /* renamed from: g */
    public String m116360g() {
        return this.f110141a;
    }

    @Override // lk0.InterfaceC22508f
    public int getFeatureType() {
        return this.f110149i;
    }

    @Override // lk0.InterfaceC22508f
    public String getZinstantDataId() {
        return this.f110142b;
    }

    public int hashCode() {
        return AbstractC17201m.m91818j(this.f110141a, this.f110142b, Integer.valueOf(this.f110143c), Integer.valueOf(this.f110146f), this.f110147g, this.f110148h);
    }

    public String toString() {
        return this.f110141a + " " + this.f110142b + " " + this.f110143c;
    }
}
