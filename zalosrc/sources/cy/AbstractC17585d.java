package cy;

import com.zing.zalo.productcatalog.utils.AddCatalogSource;
import com.zing.zalo.productcatalog.utils.AddProductSource;
import com.zing.zalo.productcatalog.utils.DeleteCatalogSource;
import com.zing.zalo.productcatalog.utils.DeleteProductSource;
import com.zing.zalo.productcatalog.utils.EditCatalogSource;
import com.zing.zalo.productcatalog.utils.EditProductSource;
import com.zing.zalo.productcatalog.utils.MoveProductSource;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: cy.d */
/* loaded from: classes4.dex */
public abstract class AbstractC17585d {
    /* renamed from: a */
    public static final String m93637a(AddCatalogSource addCatalogSource) {
        AbstractC19074t.m100208f(addCatalogSource, "source");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("src", addCatalogSource.m48909a());
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    /* renamed from: b */
    public static final String m93638b(AddProductSource addProductSource) {
        AbstractC19074t.m100208f(addProductSource, "source");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("src", addProductSource.m48918a());
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    /* renamed from: c */
    public static final String m93639c(DeleteCatalogSource deleteCatalogSource) {
        AbstractC19074t.m100208f(deleteCatalogSource, "source");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("src", deleteCatalogSource.m48931a());
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    /* renamed from: d */
    public static final String m93640d(DeleteProductSource deleteProductSource) {
        AbstractC19074t.m100208f(deleteProductSource, "source");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("src", deleteProductSource.m48938a());
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    /* renamed from: e */
    public static final String m93641e(EditCatalogSource editCatalogSource, C17582a c17582a) {
        AbstractC19074t.m100208f(editCatalogSource, "source");
        AbstractC19074t.m100208f(c17582a, "changedData");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("src", editCatalogSource.m48947a());
        jSONObject.put("name_edited", c17582a.m93622a());
        jSONObject.put("photo_edited", c17582a.m93623b());
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    /* renamed from: f */
    public static final String m93642f(EditProductSource editProductSource, C17583b c17583b) {
        AbstractC19074t.m100208f(editProductSource, "source");
        AbstractC19074t.m100208f(c17583b, "changedData");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("src", editProductSource.m48954a());
        jSONObject.put("image_edited", c17583b.m93626b());
        jSONObject.put("name_edited", c17583b.m93627c());
        jSONObject.put("price_edited", c17583b.m93628d());
        jSONObject.put("desc_edited", c17583b.m93625a());
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    /* renamed from: g */
    public static final String m93643g(MoveProductSource moveProductSource) {
        AbstractC19074t.m100208f(moveProductSource, "source");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("src", moveProductSource.m48959a());
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }
}
