package mf0;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import java.io.File;
import java.net.URLConnection;
import lf0.AbstractC22474d;
import lf0.C22472b;
import lf0.InterfaceC22471a;
import on0.AbstractC24341v;
import org.json.JSONObject;
import p307kv.C21944a;

/* renamed from: mf0.a */
/* loaded from: classes5.dex */
public final class C23287a implements InterfaceC22471a {

    /* renamed from: a */
    private final C22472b f113029a;

    /* renamed from: b */
    private final String f113030b;

    /* renamed from: c */
    private final String f113031c;

    /* renamed from: d */
    private final String f113032d;

    public C23287a(C22472b c22472b, String str, String str2) {
        AbstractC19074t.m100208f(c22472b, "lfsManager");
        AbstractC19074t.m100208f(str, "maSchemeResourcePath");
        AbstractC19074t.m100208f(str2, "digestAlgorithm");
        this.f113029a = c22472b;
        this.f113030b = str;
        this.f113031c = str2;
        this.f113032d = C23287a.class.getSimpleName();
    }

    @Override // lf0.InterfaceC22471a
    /* renamed from: d */
    public void mo116169d() {
        boolean m127120J;
        File file;
        if (this.f113029a.m116185e(this.f113030b)) {
            m127120J = AbstractC24341v.m127120J(this.f113030b, "miniappres://files", false, 2, null);
            if (m127120J) {
                file = new File(AbstractC22474d.m116216d(this.f113030b, this.f113029a.m116195t()));
            } else {
                file = new File(AbstractC22474d.m116215c(this.f113030b, this.f113029a.m116194s()));
            }
            if (file.exists()) {
                C22472b.m116178x(this.f113029a, new JSONObject().put("size", file.length()).put("digest", C21944a.f108045a.m114584a(file.getName() + file.length(), this.f113031c)).put(ZinstantMetaConstant.IMPRESSION_META_TYPE, URLConnection.guessContentTypeFromName(file.getName())), null, 2, null);
                return;
            }
            this.f113029a.m116196u(-302, "File does not exist");
            C22472b c22472b = this.f113029a;
            String str = this.f113032d;
            String str2 = this.f113030b;
            c22472b.m116198y(str + ": file does not exist: " + str2 + " -> " + AbstractC22474d.m116216d(str2, c22472b.m116195t()));
            return;
        }
        C22472b.m116177v(this.f113029a, -302, null, 2, null);
        this.f113029a.m116198y(this.f113032d + ": Invalid MA resource path " + this.f113030b);
    }
}
