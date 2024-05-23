package gw;

import dj.C17945a0;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23008a2;
import org.json.JSONObject;
import p348mi.AbstractC23304d;
import p716zh.C32012m;

/* renamed from: gw.k */
/* loaded from: classes4.dex */
public final class C19639k {

    /* renamed from: a */
    public static final C19639k f97504a = new C19639k();

    private C19639k() {
    }

    /* renamed from: a */
    public final String m102873a(int i11, int i12) {
        String str;
        String str2 = "";
        if (i11 != 1) {
            if (i11 != 2) {
                str = "";
            } else {
                str = "SYNC";
            }
        } else {
            str = "CLOUD";
        }
        if (str.length() > 0) {
            str = str + "|";
        }
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            str2 = "HTTP";
                        }
                    } else {
                        str2 = "OFFLINE";
                    }
                } else {
                    str2 = "HCM";
                }
            } else {
                str2 = "FCM";
            }
        } else {
            str2 = "ONLINE";
        }
        return str + str2;
    }

    /* renamed from: b */
    public final void m102874b(C17945a0 c17945a0, int i11, int i12) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        try {
            JSONObject m117933b = AbstractC23008a2.m117933b(c17945a0.m95267u3(), false, 1, null);
            if (m117933b == null) {
                m117933b = new JSONObject();
            }
            if (AbstractC23304d.m120544o()) {
                m117933b.put("cloud", i11);
                m117933b.put("firebase", i12);
            }
            c17945a0.m95299xa(m117933b.toString());
            c17945a0.m95181ka(new C32012m(c17945a0.m95267u3()));
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
