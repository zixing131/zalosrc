package nf0;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.File;
import java.net.URLConnection;
import lf0.AbstractC22474d;
import lf0.C22472b;
import lf0.InterfaceC22471a;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: nf0.a */
/* loaded from: classes5.dex */
public final class C23741a implements InterfaceC22471a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C22472b f114844a;

    /* renamed from: nf0.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C23741a(C22472b c22472b) {
        AbstractC19074t.m100208f(c22472b, "lfsManager");
        this.f114844a = c22472b;
    }

    @Override // lf0.InterfaceC22471a
    /* renamed from: d */
    public void mo116169d() {
        if (this.f114844a.m116190m().exists()) {
            File[] listFiles = new File(this.f114844a.m116191n()).listFiles();
            JSONArray jSONArray = new JSONArray();
            if (listFiles != null) {
                for (File file : listFiles) {
                    JSONObject jSONObject = new JSONObject();
                    String absolutePath = file.getAbsolutePath();
                    AbstractC19074t.m100207e(absolutePath, "getAbsolutePath(...)");
                    jSONArray.put(jSONObject.put("file_path", AbstractC22474d.m116214b(absolutePath, this.f114844a.m116195t())).put("create_time", file.lastModified()).put("size", file.length()).put(ZinstantMetaConstant.IMPRESSION_META_TYPE, URLConnection.guessContentTypeFromName(file.getName())));
                }
            }
            C22472b.m116178x(this.f114844a, jSONArray, null, 2, null);
            return;
        }
        this.f114844a.m116196u(-302, "MA data folder does not exist");
    }
}
