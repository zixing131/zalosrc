package tj;

import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import org.json.JSONObject;

/* renamed from: tj.c */
/* loaded from: classes3.dex */
public class C26711c {

    /* renamed from: a */
    public String f126653a;

    /* renamed from: b */
    public MessageId f126654b;

    /* renamed from: c */
    public int f126655c;

    /* renamed from: d */
    public String f126656d;

    /* renamed from: e */
    public String f126657e;

    /* renamed from: f */
    public long f126658f;

    /* renamed from: g */
    public int f126659g;

    public C26711c() {
        this.f126653a = "";
        this.f126654b = null;
        this.f126655c = 0;
        this.f126656d = "";
        this.f126657e = "";
    }

    /* renamed from: a */
    public boolean m137330a() {
        int i11 = this.f126659g;
        return i11 == 3 || i11 == 4;
    }

    /* renamed from: b */
    public boolean m137331b() {
        int i11 = this.f126659g;
        return i11 == 1 || i11 == 2;
    }

    /* renamed from: c */
    public boolean m137332c() {
        int i11 = this.f126659g;
        return i11 == 2 || i11 == 4;
    }

    public String toString() {
        return "MessageDelete{ownerId='" + this.f126657e + "', delMessageId='" + this.f126654b + "', msgType='" + this.f126655c + "'}";
    }

    public C26711c(JSONObject jSONObject) {
        this.f126653a = "";
        this.f126654b = null;
        this.f126655c = 0;
        this.f126656d = "";
        this.f126657e = "";
        try {
            this.f126659g = jSONObject.getInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
            this.f126656d = jSONObject.getString("uidFrom");
            String string = jSONObject.getString("uidTo");
            if (m137330a()) {
                this.f126657e = "group_" + string;
            } else if (this.f126656d.equals(CoreUtility.f89233i)) {
                this.f126657e = string;
            } else {
                this.f126657e = this.f126656d;
            }
            this.f126654b = MessageId.m41038e(jSONObject.optString("clientDelMsgId"), jSONObject.optString("globalDelMsgId"), this.f126657e, this.f126656d);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
