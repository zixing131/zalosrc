package p547uh;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19074t;
import ln0.AbstractC22543l;
import org.json.JSONObject;

/* renamed from: uh.b */
/* loaded from: classes.dex */
public final class C27261b extends C27260a {

    /* renamed from: h */
    private int f128195h = ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;

    /* renamed from: i */
    private int f128196i = 10485760;

    @Override // p547uh.C27260a
    /* renamed from: b */
    public int mo139532b() {
        return this.f128196i;
    }

    @Override // p547uh.C27260a
    /* renamed from: f */
    public int mo139536f() {
        return this.f128195h;
    }

    @Override // p547uh.C27260a
    /* renamed from: i */
    public void mo139539i(JSONObject jSONObject) {
        int m116588k;
        double m116586i;
        double m116586i2;
        double m116586i3;
        int m116588k2;
        AbstractC19074t.m100208f(jSONObject, "jsonObj");
        m116588k = AbstractC22543l.m116588k(jSONObject.optInt("photoHDSize", ZVideoUtilMetadata.FF_PROFILE_H264_INTRA), 1024, 4096);
        mo139545o(m116588k);
        double d11 = 100;
        m116586i = AbstractC22543l.m116586i(jSONObject.optDouble("hd_jpeg_quality", 0.9d) * d11, 50.0d, 100.0d);
        m139540j((int) m116586i);
        m116586i2 = AbstractC22543l.m116586i(jSONObject.optDouble("screenshot_hd_jpeg_quality", 0.9d) * d11, 50.0d, 100.0d);
        m139546p((int) m116586i2);
        m116586i3 = AbstractC22543l.m116586i(jSONObject.optDouble("panorama_hd_jpeg_quality", 0.9d) * d11, 50.0d, 100.0d);
        m139542l((int) m116586i3);
        m116588k2 = AbstractC22543l.m116588k(jSONObject.optInt("maxHDSize", 10485760), 5242880, 10485760);
        mo139541k(m116588k2);
    }

    @Override // p547uh.C27260a
    /* renamed from: k */
    protected void mo139541k(int i11) {
        this.f128196i = i11;
    }

    @Override // p547uh.C27260a
    /* renamed from: o */
    protected void mo139545o(int i11) {
        this.f128195h = i11;
    }
}
