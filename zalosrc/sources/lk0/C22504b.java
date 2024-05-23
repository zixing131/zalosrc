package lk0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.zing.zalo.zinstant.exception.ZinstantException;
import com.zing.zalo.zinstant.utils.AbstractC17201m;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import ho0.AbstractC20110a;
import ik0.EnumC20598u;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONObject;

/* renamed from: lk0.b */
/* loaded from: classes7.dex */
public class C22504b implements InterfaceC22508f {

    /* renamed from: o */
    public static long f110126o = 86400000;

    /* renamed from: a */
    public String f110127a;

    /* renamed from: b */
    public String f110128b;

    /* renamed from: c */
    public String f110129c;

    /* renamed from: d */
    public String f110130d;

    /* renamed from: e */
    public int f110131e;

    /* renamed from: f */
    public long f110132f;

    /* renamed from: g */
    public long f110133g;

    /* renamed from: h */
    public long f110134h;

    /* renamed from: i */
    public int f110135i;

    /* renamed from: j */
    public String f110136j;

    /* renamed from: k */
    public String f110137k;

    /* renamed from: l */
    public String f110138l;

    /* renamed from: m */
    public String f110139m;

    /* renamed from: n */
    public String f110140n;

    public C22504b(int i11, JSONObject jSONObject) {
        String optString = jSONObject.optString("checksum");
        Locale locale = Locale.US;
        this.f110129c = optString.toLowerCase(locale);
        this.f110128b = jSONObject.optString("zinstantdata_id");
        this.f110140n = jSONObject.optString("bundle_data");
        if (TextUtils.isEmpty(this.f110128b)) {
            AbstractC20110a.m104543l("ZinstantData").mo104552e(new ZinstantException(201, "zinstantdata_id was empty"));
        }
        if (!TextUtils.isEmpty(this.f110129c)) {
            this.f110131e = i11;
            int optInt = jSONObject.optInt("data_type");
            this.f110135i = optInt;
            if (optInt == 2) {
                String string = jSONObject.getString("data_url");
                this.f110130d = string;
                if (TextUtils.isEmpty(string)) {
                    throw new ZinstantException(203, "Data url was empty");
                }
            } else {
                if (optInt != 1 && optInt != 3) {
                    throw new ZinstantException(203, "Invalid data_type " + this.f110135i);
                }
                String string2 = jSONObject.getString("data_base64");
                this.f110136j = string2;
                m116356g(string2, this.f110135i, this.f110129c, i11);
                this.f110130d = null;
            }
            if (jSONObject.optJSONObject("skeleton") != null) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("skeleton");
                try {
                    String optString2 = jSONObject2.optString("cs");
                    this.f110137k = optString2;
                    if (!TextUtils.equals(optString2, "")) {
                        this.f110137k = this.f110137k.toLowerCase(locale);
                    }
                    if (!jSONObject2.isNull("b64") && !TextUtils.equals(jSONObject2.optString("b64"), "")) {
                        String optString3 = jSONObject2.optString("b64");
                        this.f110139m = optString3;
                        m116356g(optString3, 3, this.f110137k, i11);
                        this.f110138l = null;
                        return;
                    }
                    if (jSONObject2.isNull(ZMediaPlayer.OnNativeInvokeListener.ARG_URL) || TextUtils.equals(jSONObject2.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL), "")) {
                        return;
                    }
                    this.f110138l = jSONObject2.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                    return;
                } catch (Exception e11) {
                    this.f110137k = null;
                    e11.printStackTrace();
                    return;
                }
            }
            return;
        }
        throw new ZinstantException(202, "Checksum was empty");
    }

    /* renamed from: e */
    private long m116350e(SQLiteDatabase sQLiteDatabase, ContentValues contentValues) {
        int update = sQLiteDatabase.update("zinstant_data", contentValues, C22509g.m116379i("key"), new String[]{this.f110127a});
        if (update <= 0) {
            return sQLiteDatabase.insert("zinstant_data", "", contentValues);
        }
        return update;
    }

    @Override // lk0.InterfaceC22508f
    /* renamed from: a */
    public JSONObject mo116351a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("checksum", this.f110129c);
        jSONObject.put("feature_type", this.f110131e);
        jSONObject.put("zinstantdata_id", this.f110128b);
        if (this.f110130d != null) {
            jSONObject.put("data_type", 2);
            jSONObject.put("data_url", this.f110130d);
        } else {
            jSONObject.put("data_type", 1);
            jSONObject.put("data_base64", this.f110136j);
        }
        String str = this.f110140n;
        if (str != null && !str.isEmpty()) {
            jSONObject.put("bundle_data", this.f110140n);
        }
        return jSONObject;
    }

    @Override // lk0.InterfaceC22508f
    /* renamed from: b */
    public boolean mo116352b(EnumC20598u enumC20598u) {
        long currentTimeMillis = System.currentTimeMillis();
        if (enumC20598u == EnumC20598u.LIMIT) {
            long j11 = this.f110133g;
            if (j11 <= 0) {
                j11 = f110126o;
            }
            long j12 = this.f110134h;
            if (j11 + j12 < currentTimeMillis || currentTimeMillis < j12) {
                return true;
            }
            return false;
        }
        long j13 = this.f110133g;
        if (0 < j13 && this.f110134h + j13 < currentTimeMillis) {
            return true;
        }
        return false;
    }

    @Override // lk0.InterfaceC22508f
    /* renamed from: c */
    public String mo116353c() {
        return this.f110140n;
    }

    /* renamed from: d */
    public boolean m116354d() {
        if (!TextUtils.isEmpty(this.f110128b) && !TextUtils.isEmpty(this.f110129c)) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22504b)) {
            return false;
        }
        C22504b c22504b = (C22504b) obj;
        if (Objects.equals(this.f110127a, c22504b.f110127a) && Objects.equals(this.f110128b, c22504b.f110128b) && Objects.equals(this.f110129c, c22504b.f110129c) && Objects.equals(this.f110130d, c22504b.f110130d) && this.f110131e == c22504b.f110131e && Objects.equals(this.f110137k, c22504b.f110137k) && Objects.equals(this.f110138l, c22504b.f110138l) && Objects.equals(this.f110139m, c22504b.f110139m) && Objects.equals(this.f110140n, c22504b.f110140n)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public long m116355f(SQLiteDatabase sQLiteDatabase, EnumC20598u enumC20598u) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", this.f110127a);
        contentValues.put("zinstant_data_id", this.f110128b);
        contentValues.put("data_raw_checksum", this.f110129c);
        contentValues.put("resource_url", this.f110130d);
        contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("feature_type", Integer.valueOf(this.f110131e));
        if (enumC20598u == EnumC20598u.DEFAULT || this.f110133g > 0) {
            contentValues.put("config_expiration_time", Long.valueOf(this.f110133g));
        }
        contentValues.put("config_pull_time", Long.valueOf(this.f110134h));
        contentValues.put("skeleton_raw_checksum", this.f110137k);
        contentValues.put("skeleton_url", this.f110138l);
        contentValues.put("bundle_data", this.f110140n);
        return m116350e(sQLiteDatabase, contentValues);
    }

    /* renamed from: g */
    public void m116356g(String str, int i11, String str2, int i12) {
        AbstractC22506d.m116362b(str, i11, str2, i12);
    }

    @Override // lk0.InterfaceC22508f
    public int getFeatureType() {
        return this.f110131e;
    }

    @Override // lk0.InterfaceC22508f
    public String getZinstantDataId() {
        return this.f110128b;
    }

    public int hashCode() {
        return AbstractC17201m.m91818j(this.f110127a, this.f110128b, this.f110129c, this.f110130d, Integer.valueOf(this.f110131e), this.f110137k, this.f110138l, this.f110139m, this.f110140n);
    }

    public String toString() {
        return this.f110129c + " " + this.f110128b;
    }

    public C22504b(int i11) {
        this.f110131e = i11;
    }

    public C22504b(Cursor cursor) {
        this.f110127a = cursor.getString(cursor.getColumnIndex("key"));
        this.f110128b = cursor.getString(cursor.getColumnIndex("zinstant_data_id"));
        this.f110129c = cursor.getString(cursor.getColumnIndex("data_raw_checksum"));
        this.f110130d = cursor.getString(cursor.getColumnIndex("resource_url"));
        this.f110132f = cursor.getLong(cursor.getColumnIndex("time"));
        this.f110131e = cursor.getInt(cursor.getColumnIndex("feature_type"));
        this.f110133g = cursor.getLong(cursor.getColumnIndex("config_expiration_time"));
        this.f110134h = cursor.getLong(cursor.getColumnIndex("config_pull_time"));
        this.f110137k = cursor.getString(cursor.getColumnIndex("skeleton_raw_checksum"));
        this.f110138l = cursor.getString(cursor.getColumnIndex("skeleton_url"));
        this.f110140n = cursor.getString(cursor.getColumnIndex("bundle_data"));
    }
}
