package p576vh;

import fn0.AbstractC19074t;
import ln0.AbstractC22543l;
import org.json.JSONObject;

/* renamed from: vh.c */
/* loaded from: classes.dex */
public final class C28253c extends C28252b {

    /* renamed from: m */
    private int f131745m = 100;

    @Override // p576vh.C28252b
    /* renamed from: e */
    public int mo142242e() {
        return this.f131745m;
    }

    @Override // p576vh.C28252b
    /* renamed from: m */
    public void mo142260m(JSONObject jSONObject) {
        int m116588k;
        AbstractC19074t.m100208f(jSONObject, "jsonObj");
        super.mo142260m(jSONObject);
        m116588k = AbstractC22543l.m116588k(jSONObject.optInt("outputVideoHdMaxSize", 100), 20, 200);
        mo142252q(m116588k);
    }

    @Override // p576vh.C28252b
    /* renamed from: n */
    public void mo142261n(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObj");
        mo142238a().m137175p(jSONObject.optJSONObject("compress_config_hd"));
        mo142240c().m40342q(jSONObject.optJSONObject("nativeCompressConfigHd"));
    }

    @Override // p576vh.C28252b
    /* renamed from: q */
    protected void mo142252q(int i11) {
        this.f131745m = i11;
    }
}
