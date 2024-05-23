package me0;

import android.content.Context;
import android.text.TextUtils;
import cg.C3459g;
import com.zing.zalo.cameradecor.filter.CocosFilterConfig;
import et.C18596c;
import java.io.File;
import mm0.AbstractC23350e;
import org.json.JSONObject;

/* renamed from: me0.s */
/* loaded from: classes4.dex */
public abstract class AbstractC23203s {
    /* renamed from: a */
    public static C18596c m119548a(Context context, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (!jSONObject.has("color_filter")) {
                return null;
            }
            String string = jSONObject.getString("color_filter");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            C3459g m17426b = C3459g.m17426b(context);
            m17426b.m17427a(AbstractC23041d2.m118205d(str, string));
            m17426b.m17432g(true);
            String m17430e = m17426b.m17430e("filter_config.script");
            if (m17430e == null) {
                return null;
            }
            return C18596c.m98206o(new JSONObject(m17430e), m17426b);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: b */
    public static JSONObject m119549b(String str) {
        try {
            File file = new File(str, CocosFilterConfig.f41821y);
            if (!file.exists()) {
                return null;
            }
            return new JSONObject(AbstractC23041d2.m118196C(file.getPath()));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }
}
