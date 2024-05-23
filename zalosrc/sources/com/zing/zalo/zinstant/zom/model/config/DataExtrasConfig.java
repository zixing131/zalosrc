package com.zing.zalo.zinstant.zom.model.config;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class DataExtrasConfig {
    public static final String APP_CONFIG = "app_config";
    public static final Companion Companion = new Companion(null);
    public static final String I18N = "i18n";
    public static final String RECHECK_SRC = "recheckSrc";
    public JSONObject mAppConfig;
    public JSONObject mI18n;
    public boolean mRecheckSrc;

    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public DataExtrasConfig(String str) {
        AbstractC19074t.m100208f(str, "dataExtras");
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(I18N)) {
                this.mI18n = jSONObject.optJSONObject(I18N);
            }
            if (jSONObject.has(APP_CONFIG)) {
                this.mAppConfig = new JSONObject(jSONObject.getString(APP_CONFIG));
            }
            if (jSONObject.has(RECHECK_SRC)) {
                this.mRecheckSrc = jSONObject.optBoolean(RECHECK_SRC, false);
            }
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
