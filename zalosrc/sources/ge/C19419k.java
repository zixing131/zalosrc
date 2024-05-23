package ge;

import android.os.Bundle;
import android.text.TextUtils;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: ge.k */
/* loaded from: classes3.dex */
public class C19419k {

    /* renamed from: a */
    public String f96343a;

    /* renamed from: b */
    public long f96344b;

    /* renamed from: c */
    public String f96345c;

    /* renamed from: d */
    public String f96346d;

    /* renamed from: e */
    public int f96347e;

    /* renamed from: f */
    public String f96348f;

    /* renamed from: g */
    public int f96349g;

    public C19419k(JSONObject jSONObject) {
        this.f96347e = 0;
        this.f96349g = 0;
        if (jSONObject != null) {
            try {
                this.f96343a = jSONObject.optString("id");
                this.f96344b = jSONObject.optLong("startTime");
                this.f96345c = jSONObject.optString("title");
                this.f96346d = jSONObject.optString("emoji");
                this.f96347e = jSONObject.optInt("calendarType", 0);
                this.f96349g = jSONObject.optInt("openTimePicker", 0);
                JSONArray optJSONArray = jSONObject.optJSONArray("repeat");
                if (optJSONArray != null) {
                    this.f96348f = optJSONArray.toString();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: a */
    public Bundle m101556a() {
        boolean z11;
        Bundle bundle = new Bundle();
        try {
            if (!TextUtils.isEmpty(this.f96343a)) {
                bundle.putString("STR_EXTRA_SUGGESTION_ID", this.f96343a);
            }
            if (!TextUtils.isEmpty(this.f96345c)) {
                bundle.putString("EXTRA_POST_CONTENT", this.f96345c);
            }
            long j11 = this.f96344b;
            if (j11 > 0) {
                bundle.putLong("EXTRA_START_TIME", j11);
            }
            if (!TextUtils.isEmpty(this.f96346d)) {
                bundle.putString("EXTRA_EMOJI", this.f96346d);
            }
            bundle.putInt("INT_EXTRA_CALENDAR_TYPE", this.f96347e);
            if (this.f96349g != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            bundle.putBoolean("BOL_EXTRA_OPEN_TIME_PICKER", z11);
            if (!TextUtils.isEmpty(this.f96348f)) {
                bundle.putString("STR_EXTRA_REPEAT_RULE", this.f96348f);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return bundle;
    }
}
