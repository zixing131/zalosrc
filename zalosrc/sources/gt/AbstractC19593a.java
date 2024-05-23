package gt;

import cg.C3459g;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import org.json.JSONObject;

/* renamed from: gt.a */
/* loaded from: classes4.dex */
public abstract class AbstractC19593a {

    /* renamed from: a */
    public String f97339a;

    /* renamed from: b */
    protected a f97340b;

    /* renamed from: gt.a$a */
    /* loaded from: classes4.dex */
    public enum a {
        INT("int"),
        FLOAT("float"),
        VECTOR("vector"),
        MATRIX("matrix"),
        TEXTURE("texture"),
        INPUT("input"),
        FILTER("filter");


        /* renamed from: p */
        final String f97349p;

        a(String str) {
            this.f97349p = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC19593a(String str) {
        this.f97339a = str;
    }

    /* renamed from: a */
    public static AbstractC19593a m102566a(JSONObject jSONObject, C3459g c3459g) {
        String string = jSONObject.getString(ZinstantMetaConstant.IMPRESSION_META_TYPE);
        if (a.INT.f97349p.equals(string)) {
            return new C19596d(jSONObject);
        }
        if (a.FLOAT.f97349p.equals(string)) {
            return new C19594b(jSONObject);
        }
        if (a.VECTOR.f97349p.equals(string)) {
            return new C19600h(jSONObject);
        }
        if (a.MATRIX.f97349p.equals(string)) {
            return new C19597e(jSONObject);
        }
        if (a.TEXTURE.f97349p.equals(string)) {
            return new C19599g(jSONObject, c3459g);
        }
        if (a.INPUT.f97349p.equals(string)) {
            return new C19595c(jSONObject);
        }
        if (a.FILTER.f97349p.equals(string)) {
            return new C19598f(jSONObject, c3459g);
        }
        throw new Exception("filter param invalid");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC19593a(JSONObject jSONObject) {
        this.f97339a = jSONObject.getString("name");
    }
}
