package p366nm;

import android.database.Cursor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: nm.a */
/* loaded from: classes3.dex */
public class C23881a {

    /* renamed from: a */
    private String f115456a;

    /* renamed from: b */
    private long f115457b;

    /* renamed from: c */
    private JSONObject f115458c;

    public C23881a(String str, long j11, JSONObject jSONObject) {
        this.f115456a = str;
        this.f115457b = j11;
        this.f115458c = jSONObject;
    }

    /* renamed from: a */
    public String m124941a() {
        return this.f115456a;
    }

    /* renamed from: b */
    public JSONObject m124942b() {
        return this.f115458c;
    }

    /* renamed from: c */
    public long m124943c() {
        return this.f115457b;
    }

    public C23881a(Cursor cursor) {
        this.f115457b = Long.parseLong(cursor.getString(0));
        this.f115456a = cursor.getString(1);
        try {
            this.f115458c = new JSONObject(cursor.getString(2));
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }
}
