package p716zh;

import com.zing.zalo.control.C7904b;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalocore.CoreUtility;
import org.json.JSONObject;

/* renamed from: zh.k5 */
/* loaded from: classes3.dex */
public class C31988k5 {

    /* renamed from: a */
    public int f147200a;

    /* renamed from: b */
    public C7904b f147201b;

    /* renamed from: c */
    public C31961i8 f147202c;

    public C31988k5(int i11) {
        this.f147200a = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000c, code lost:            if (r0 != 4) goto L17;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m154217a() {
        int i11 = this.f147200a;
        if (i11 != 1 && i11 != 2) {
            if (i11 == 3) {
                C31961i8 c31961i8 = this.f147202c;
                if (c31961i8 != null) {
                    return c31961i8.f146880a;
                }
            }
            return "0";
        }
        C7904b c7904b = this.f147201b;
        if (c7904b != null) {
            return c7904b.f42715C;
        }
        return "0";
    }

    /* renamed from: b */
    public String m154218b() {
        return String.format("%d_%s", Integer.valueOf(this.f147200a), m154217a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000c, code lost:            if (r0 != 4) goto L25;     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m154219c() {
        InviteContactProfile inviteContactProfile;
        String str;
        int i11 = this.f147200a;
        if (i11 != 1 && i11 != 2) {
            if (i11 == 3) {
                C31961i8 c31961i8 = this.f147202c;
                if (c31961i8 != null && (str = c31961i8.f146884e) != null && CoreUtility.f89233i.equals(str)) {
                    return true;
                }
            }
            return false;
        }
        C7904b c7904b = this.f147201b;
        if (c7904b != null && (inviteContactProfile = c7904b.f42719G) != null && CoreUtility.f89233i.equals(inviteContactProfile.f42434r)) {
            return true;
        }
        return false;
    }

    public C31988k5(JSONObject jSONObject, String str) {
        try {
            int optInt = jSONObject.optInt("boardType");
            this.f147200a = optInt;
            if (optInt != 1 && optInt != 2) {
                if (optInt == 3) {
                    this.f147202c = new C31961i8(jSONObject);
                } else if (optInt != 4) {
                }
            }
            this.f147201b = new C7904b(jSONObject, "group_" + str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
