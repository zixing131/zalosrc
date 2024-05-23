package com.zing.zalo;

import android.content.Context;
import android.content.res.Resources;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import org.json.JSONObject;

/* renamed from: com.zing.zalo.b */
/* loaded from: classes.dex */
public abstract class AbstractC7306b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    public static String f40031a = "null";

    /* renamed from: b */
    public static String f40032b = "null";

    /* renamed from: c */
    public static String f40033c = "null";

    /* renamed from: d */
    public static String f40034d = "null";

    /* renamed from: e */
    public static String f40035e = "null";

    /* renamed from: f */
    public static String f40036f = "null";

    /* renamed from: com.zing.zalo.b$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        private final String m37257a(Resources resources, int i11) {
            try {
                String string = resources.getString(i11);
                AbstractC19074t.m100205c(string);
                return string;
            } catch (Exception unused) {
                return "null";
            }
        }

        /* renamed from: b */
        public final void m37258b(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            jSONObject.put("BUILD_ID", AbstractC7306b.f40031a);
            jSONObject.put("BUILD_TIME", AbstractC7306b.f40032b);
            jSONObject.put("GIT_BRANCH", AbstractC7306b.f40033c);
            jSONObject.put("GIT_COMMIT", AbstractC7306b.f40034d);
            jSONObject.put("BUILDER", AbstractC7306b.f40035e);
            jSONObject.put("CI_PIPELINE_ID", AbstractC7306b.f40036f);
        }

        /* renamed from: c */
        public final void m37259c(Context context) {
            AbstractC19074t.m100208f(context, "context");
            long currentTimeMillis = System.currentTimeMillis();
            Resources resources = context.getResources();
            AbstractC19074t.m100205c(resources);
            AbstractC7306b.f40031a = m37257a(resources, AbstractC8020f0.BUILD_ID);
            AbstractC7306b.f40032b = m37257a(resources, AbstractC8020f0.BUILD_TIME);
            AbstractC7306b.f40033c = m37257a(resources, AbstractC8020f0.GIT_BRANCH);
            AbstractC7306b.f40034d = m37257a(resources, AbstractC8020f0.GIT_COMMIT);
            AbstractC7306b.f40035e = m37257a(resources, AbstractC8020f0.BUILDER);
            AbstractC7306b.f40036f = m37257a(resources, AbstractC8020f0.CI_PIPELINE_ID);
            JSONObject jSONObject = new JSONObject();
            m37258b(jSONObject);
            AbstractC20110a.f98889a.mo104548a("BuildConfig (in " + (System.currentTimeMillis() - currentTimeMillis) + "ms): " + jSONObject, new Object[0]);
        }
    }
}
