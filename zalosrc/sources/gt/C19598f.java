package gt;

import cg.C3459g;
import et.C18596c;
import gt.AbstractC19593a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.json.JSONArray;
import org.json.JSONObject;
import p575vf.C27998a;

/* renamed from: gt.f */
/* loaded from: classes4.dex */
public class C19598f extends AbstractC19593a {

    /* renamed from: c */
    public final String f97354c;

    /* renamed from: d */
    public C18596c f97355d;

    /* renamed from: e */
    public C27998a f97356e;

    /* renamed from: f */
    public FloatBuffer f97357f;

    public C19598f(JSONObject jSONObject, C3459g c3459g) {
        super(jSONObject);
        this.f97340b = AbstractC19593a.a.FILTER;
        this.f97354c = jSONObject.getString("coordinate_name");
        if (jSONObject.has("coordinate_value")) {
            JSONArray jSONArray = jSONObject.getJSONArray("coordinate_value");
            if (jSONArray.length() >= 8) {
                this.f97357f = ByteBuffer.allocateDirect(256).order(ByteOrder.nativeOrder()).asFloatBuffer();
                for (int i11 = 0; i11 < 8; i11++) {
                    this.f97357f.put((float) jSONArray.getDouble(i11));
                }
            }
        }
        this.f97355d = C18596c.m98205n(jSONObject.getJSONArray("filter_chain"), c3459g);
    }
}
