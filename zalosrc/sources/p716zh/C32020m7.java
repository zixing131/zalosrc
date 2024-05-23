package p716zh;

import ck.C3561b;
import com.zing.zalo.control.ContactProfile;
import java.util.ArrayList;
import org.json.JSONObject;
import p692ys.C31070a;

/* renamed from: zh.m7 */
/* loaded from: classes3.dex */
public class C32020m7 {

    /* renamed from: a */
    public int f147410a;

    /* renamed from: b */
    public ContactProfile f147411b;

    /* renamed from: c */
    public C31874cb f147412c;

    /* renamed from: d */
    public C31973j5 f147413d;

    /* renamed from: e */
    public C3561b f147414e;

    /* renamed from: f */
    public boolean f147415f;

    /* renamed from: g */
    public boolean f147416g;

    /* renamed from: h */
    public ArrayList f147417h;

    /* renamed from: i */
    public C31070a f147418i;

    /* renamed from: j */
    public C32058p1 f147419j;

    /* renamed from: k */
    public int f147420k;

    /* renamed from: l */
    public int f147421l;

    /* renamed from: m */
    public int f147422m;

    /* renamed from: n */
    public boolean f147423n;

    /* renamed from: o */
    public JSONObject f147424o;

    /* renamed from: p */
    public String f147425p;

    /* renamed from: q */
    public boolean f147426q;

    /* renamed from: r */
    public boolean f147427r;

    /* renamed from: s */
    public String f147428s;

    /* renamed from: t */
    public String f147429t;

    /* renamed from: u */
    public int f147430u;

    public C32020m7(int i11) {
        this.f147414e = null;
        this.f147415f = false;
        this.f147416g = false;
        this.f147420k = -1;
        this.f147421l = -1;
        this.f147422m = 0;
        this.f147423n = false;
        this.f147426q = false;
        this.f147430u = 0;
        this.f147410a = i11;
    }

    /* renamed from: a */
    public String m154394a() {
        ContactProfile contactProfile = this.f147411b;
        if (contactProfile == null) {
            if (this.f147413d == null) {
                return "";
            }
            return "group_" + this.f147413d.m153781r();
        }
        return contactProfile.f42434r;
    }

    public String toString() {
        return "MsgItemInfo{profileData=" + this.f147411b + '}';
    }

    public C32020m7(ContactProfile contactProfile) {
        this.f147410a = 1;
        this.f147414e = null;
        this.f147415f = false;
        this.f147416g = false;
        this.f147420k = -1;
        this.f147421l = -1;
        this.f147422m = 0;
        this.f147423n = false;
        this.f147426q = false;
        this.f147430u = 0;
        this.f147411b = contactProfile;
    }
}
