package gt;

import gt.AbstractC19593a;
import org.json.JSONObject;

/* renamed from: gt.c */
/* loaded from: classes4.dex */
public class C19595c extends AbstractC19593a {

    /* renamed from: c */
    public final String f97351c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C19595c(JSONObject jSONObject) {
        super(jSONObject);
        this.f97340b = AbstractC19593a.a.INPUT;
        this.f97351c = jSONObject.getString("coordinate_name");
    }

    public C19595c(String str, String str2) {
        super(str);
        this.f97340b = AbstractC19593a.a.INPUT;
        this.f97351c = str2;
    }
}
