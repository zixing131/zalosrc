package ik0;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: ik0.l */
/* loaded from: classes7.dex */
public final class C20589l {

    /* renamed from: a */
    private final String f101269a;

    /* renamed from: b */
    private final int f101270b;

    /* renamed from: c */
    private final JSONObject f101271c;

    public C20589l(String str, int i11, JSONObject jSONObject) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        this.f101269a = str;
        this.f101270b = i11;
        this.f101271c = jSONObject;
    }

    /* renamed from: a */
    public final JSONObject m107137a() {
        return this.f101271c;
    }

    /* renamed from: b */
    public final int m107138b() {
        return this.f101270b;
    }

    /* renamed from: c */
    public final String m107139c() {
        return this.f101269a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20589l)) {
            return false;
        }
        C20589l c20589l = (C20589l) obj;
        return AbstractC19074t.m100204b(this.f101269a, c20589l.f101269a) && this.f101270b == c20589l.f101270b && AbstractC19074t.m100204b(this.f101271c, c20589l.f101271c);
    }

    public int hashCode() {
        int hashCode = ((this.f101269a.hashCode() * 31) + this.f101270b) * 31;
        JSONObject jSONObject = this.f101271c;
        return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        return "ResourceHolder(url=" + this.f101269a + ", type=" + this.f101270b + ", config=" + this.f101271c + ')';
    }
}
