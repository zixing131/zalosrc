package dj;

import android.text.TextUtils;
import com.zing.zalo.control.C7907e;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import gw.AbstractC19646n0;
import me0.AbstractC23008a2;
import nh0.C23793c;
import org.json.JSONObject;
import p471r3.C25630b;

/* renamed from: dj.r1 */
/* loaded from: classes3.dex */
public class C17997r1 {

    /* renamed from: a */
    private final MessageId f91155a;

    /* renamed from: b */
    private int f91156b;

    /* renamed from: c */
    private String f91157c = "";

    /* renamed from: d */
    private String f91158d = "";

    /* renamed from: e */
    private String f91159e = "";

    /* renamed from: f */
    private String f91160f = "";

    /* renamed from: g */
    private String f91161g = "";

    /* renamed from: h */
    private C17969i0 f91162h;

    /* renamed from: i */
    private C25630b f91163i;

    /* renamed from: j */
    private long f91164j;

    /* renamed from: k */
    private long f91165k;

    public C17997r1(MessageId messageId) {
        this.f91155a = messageId;
    }

    /* renamed from: a */
    public static C17997r1 m95684a(C17945a0 c17945a0) {
        C25630b m95397g;
        String str;
        String str2;
        C17997r1 c17997r1 = new C17997r1(c17945a0.m95029V3());
        c17997r1.m95705v(c17945a0.m94862C4());
        c17997r1.m95704u(c17945a0.m94854B4());
        c17997r1.m95708y(c17945a0.m94974P4());
        c17997r1.m95707x(c17945a0.m95030V4());
        C7907e m95011T3 = c17945a0.m95011T3();
        int m95041W4 = c17945a0.m95041W4();
        if (m95041W4 != 0) {
            if (m95041W4 != 6) {
                String str3 = "";
                if (m95041W4 != 10) {
                    if (m95041W4 != 12) {
                        if (m95041W4 != 2) {
                            if (m95041W4 != 3 && m95041W4 != 4) {
                                if (m95041W4 != 18) {
                                    if (m95041W4 != 19) {
                                        if (m95041W4 != 31) {
                                            if (m95041W4 != 32) {
                                                switch (m95041W4) {
                                                    case 22:
                                                        c17997r1.m95700q(46);
                                                        C17990p0 c17990p0 = new C17990p0(c17945a0.m94929K2().f91011p, c17945a0.m94929K2().f91012q, c17945a0.m94929K2().f91013r, c17945a0.m94929K2().f91014s, c17945a0.m94929K2().f91015t, c17945a0.m94929K2().f91016u, c17945a0.m94929K2().f91017v);
                                                        c17997r1.m95699p(c17990p0.mo95393c());
                                                        c17997r1.m95702s(c17990p0);
                                                        break;
                                                    case 23:
                                                        c17997r1.m95700q(49);
                                                        C17993q0 c17993q0 = new C17993q0(c17945a0.m94929K2().f91011p, c17945a0.m94929K2().f91012q, c17945a0.m94929K2().f91013r, c17945a0.m94929K2().f91014s, c17945a0.m94929K2().f91015t, c17945a0.m94929K2().f91016u, c17945a0.m94929K2().f91017v);
                                                        c17997r1.m95699p(c17993q0.mo95393c());
                                                        c17997r1.m95702s(c17993q0);
                                                        break;
                                                    case 24:
                                                        c17997r1.m95700q(52);
                                                        C17969i0 m94929K2 = c17945a0.m94929K2();
                                                        if (m94929K2 instanceof C17967h1) {
                                                            C17967h1 c17967h1 = (C17967h1) m94929K2;
                                                            c17997r1.m95699p(c17967h1.mo95393c());
                                                            c17997r1.m95701r(c17967h1.m95579j());
                                                            break;
                                                        }
                                                        break;
                                                }
                                            } else {
                                                c17997r1.m95700q(59);
                                                c17997r1.m95701r(c17945a0.m95019U3());
                                            }
                                        }
                                    } else {
                                        c17997r1.m95700q(44);
                                        if (c17945a0.m94929K2().f91011p == null) {
                                            str2 = "";
                                        } else {
                                            str2 = c17945a0.m94929K2().f91011p;
                                        }
                                        try {
                                            if (c17945a0.m94929K2() != null && (c17945a0.m94929K2() instanceof C17961f1)) {
                                                str3 = ((C17961f1) c17945a0.m94929K2()).m95491n();
                                            }
                                        } catch (Exception e11) {
                                            e11.printStackTrace();
                                        }
                                        C17969i0 c17969i0 = new C17969i0(str2, c17945a0.m94929K2().f91012q, c17945a0.m95131f5(), c17945a0.m95090b5(), "", "", str3);
                                        c17969i0.f91018w = m95011T3;
                                        if (c17945a0.m95288w8()) {
                                            c17997r1.m95699p(c17969i0.m95596d());
                                        } else {
                                            c17997r1.m95699p(c17969i0.mo95393c());
                                        }
                                        c17997r1.m95702s(c17969i0);
                                    }
                                } else {
                                    c17997r1.m95700q(43);
                                    C17993q0 c17993q02 = new C17993q0(c17945a0.m94929K2().f91011p, c17945a0.m94929K2().f91012q, c17945a0.m94929K2().f91013r, c17945a0.m94929K2().f91014s, c17945a0.m94929K2().f91015t, c17945a0.m94929K2().f91016u, c17945a0.m94929K2().f91017v);
                                    c17997r1.m95699p(c17993q02.mo95393c());
                                    c17997r1.m95702s(c17993q02);
                                }
                            }
                            c17997r1.m95700q(32);
                            if (c17945a0.m94929K2() instanceof C18009w0) {
                                str3 = ((C18009w0) c17945a0.m94929K2()).m95784r();
                            }
                            String str4 = str3;
                            C17969i0 m94929K22 = c17945a0.m94929K2();
                            if (!TextUtils.isEmpty(m94929K22.f91013r)) {
                                str = m94929K22.f91013r;
                            } else {
                                str = m94929K22.f91014s;
                            }
                            C17969i0 c17969i02 = new C17969i0(m94929K22.f91011p, m94929K22.f91012q, str, m94929K22.f91014s, m94929K22.f91015t, m94929K22.f91016u, str4);
                            c17969i02.f91018w = m95011T3;
                            c17997r1.m95699p(c17969i02.mo95393c());
                            c17997r1.m95702s(c17969i02);
                        } else {
                            c17997r1.m95700q(37);
                            C17969i0 c17969i03 = new C17969i0("", 0, c17945a0.m95131f5(), c17945a0.m95090b5(), "", "", "");
                            c17997r1.m95702s(c17969i03);
                            c17997r1.m95699p(c17969i03.mo95393c());
                        }
                    } else {
                        c17997r1.m95700q(38);
                        C18013y0 c18013y0 = new C18013y0(c17945a0.m94929K2().f91011p, c17945a0.m94929K2().f91012q, c17945a0.m94929K2().f91013r, c17945a0.m94929K2().f91014s, c17945a0.m94929K2().f91015t, c17945a0.m94929K2().f91016u, c17945a0.m94929K2().f91017v);
                        c18013y0.f91018w = m95011T3;
                        c17997r1.m95699p(c18013y0.mo95393c());
                        c17997r1.m95702s(c18013y0);
                    }
                } else {
                    c17997r1.m95700q(36);
                    if ((c17945a0.m94929K2() instanceof C17949b1) && (m95397g = ((C17949b1) c17945a0.m94929K2()).m95397g()) != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, m95397g.m132434l());
                            jSONObject.put("id", m95397g.m132429g());
                            jSONObject.put("catId", m95397g.m132427f());
                            str3 = jSONObject.toString();
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                        c17997r1.m95706w(m95397g);
                    }
                    c17997r1.m95699p(str3);
                }
            } else {
                c17997r1.m95700q(31);
                C17969i0 c17969i04 = new C17969i0("", 0, c17945a0.m95131f5(), c17945a0.m95090b5(), "", "", "");
                c17997r1.m95699p(c17969i04.mo95393c());
                c17997r1.m95702s(c17969i04);
            }
        } else {
            c17997r1.m95700q(1);
            c17997r1.m95701r(c17945a0.m95019U3());
            if (m95011T3 != null && m95011T3.m40861l() > 0) {
                C17969i0 c17969i05 = new C17969i0("", 0, "", "", "", "", "");
                c17969i05.f91018w = m95011T3;
                c17997r1.m95699p(c17969i05.mo95393c());
                c17997r1.m95702s(c17969i05);
            }
        }
        if (c17997r1.m95690g() != null) {
            c17997r1.m95690g().f91021z = AbstractC23008a2.m117934c(c17945a0.m94929K2());
        }
        return c17997r1;
    }

    /* renamed from: b */
    public static C17997r1 m95685b(JSONObject jSONObject, String str) {
        C17997r1 c17997r1 = null;
        try {
            MessageId m41037d = MessageId.m41037d(jSONObject.optLong("cliMsgId"), jSONObject.optLong("globalMsgId"), str, jSONObject.optString("ownerId"));
            if (m41037d == null) {
                return null;
            }
            C17997r1 c17997r12 = new C17997r1(m41037d);
            try {
                c17997r12.f91156b = jSONObject.optInt("cliMsgType");
                c17997r12.f91157c = jSONObject.optString("ownerId");
                c17997r12.f91158d = jSONObject.optString("gOwnerId");
                c17997r12.f91159e = jSONObject.optString("fromD");
                c17997r12.f91164j = jSONObject.optLong("ts");
                c17997r12.f91160f = jSONObject.optString("msg");
                c17997r12.f91161g = jSONObject.optString("attach");
                c17997r12.f91165k = jSONObject.optLong("ttl");
                if (c17997r12.f91161g.equalsIgnoreCase("null")) {
                    c17997r12.f91161g = "";
                }
                c17997r12.m95697n();
                return c17997r12;
            } catch (Exception e11) {
                e = e11;
                c17997r1 = c17997r12;
                e.printStackTrace();
                return c17997r1;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: c */
    public String m95686c() {
        return this.f91161g;
    }

    /* renamed from: d */
    public int m95687d() {
        return this.f91156b;
    }

    /* renamed from: e */
    public String m95688e() {
        return this.f91160f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C17997r1) && this.f91155a.equals(((C17997r1) obj).m95689f())) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public MessageId m95689f() {
        return this.f91155a;
    }

    /* renamed from: g */
    public C17969i0 m95690g() {
        return this.f91162h;
    }

    /* renamed from: h */
    public String m95691h() {
        return this.f91158d;
    }

    /* renamed from: i */
    public String m95692i() {
        return this.f91159e;
    }

    /* renamed from: j */
    public String m95693j() {
        return this.f91157c;
    }

    /* renamed from: k */
    public C25630b m95694k() {
        return this.f91163i;
    }

    /* renamed from: l */
    public long m95695l() {
        return this.f91165k;
    }

    /* renamed from: m */
    public long m95696m() {
        return this.f91164j;
    }

    /* renamed from: n */
    public void m95697n() {
        try {
            int i11 = this.f91156b;
            if (i11 != 1 && i11 != 41) {
                if (i11 != 46) {
                    if (i11 != 49) {
                        if (i11 != 52) {
                            if (i11 != 31) {
                                if (i11 != 32) {
                                    if (i11 != 43) {
                                        if (i11 != 44) {
                                            switch (i11) {
                                                case 36:
                                                    if (!TextUtils.isEmpty(this.f91161g)) {
                                                        this.f91163i = new C25630b(new JSONObject(this.f91161g));
                                                        break;
                                                    }
                                                    break;
                                                case 38:
                                                    if (!TextUtils.isEmpty(this.f91161g)) {
                                                        this.f91162h = new C18013y0(new JSONObject(this.f91161g));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        } else if (!TextUtils.isEmpty(this.f91161g)) {
                                            this.f91162h = new C17961f1(new JSONObject(this.f91161g));
                                        }
                                    }
                                } else if (!TextUtils.isEmpty(this.f91161g)) {
                                    JSONObject m102968d2 = AbstractC19646n0.m102968d2(new JSONObject(this.f91161g));
                                    this.f91161g = m102968d2.toString();
                                    this.f91162h = new C18009w0(m102968d2);
                                }
                            }
                        } else if (!TextUtils.isEmpty(this.f91161g)) {
                            this.f91162h = new C17967h1(new JSONObject(this.f91161g));
                        }
                    } else if (!TextUtils.isEmpty(this.f91161g)) {
                        this.f91162h = new C17993q0(new JSONObject(this.f91161g));
                    }
                } else if (!TextUtils.isEmpty(this.f91161g)) {
                    this.f91162h = new C17990p0(new JSONObject(this.f91161g));
                }
            }
            if (!TextUtils.isEmpty(this.f91161g)) {
                this.f91162h = new C17969i0(new JSONObject(this.f91161g));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: o */
    public boolean m95698o() {
        if (this.f91165k > 0 && C23793c.m124316k().mo124314i() - this.f91164j >= this.f91165k) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public void m95699p(String str) {
        this.f91161g = str;
    }

    /* renamed from: q */
    public void m95700q(int i11) {
        this.f91156b = i11;
    }

    /* renamed from: r */
    public void m95701r(String str) {
        this.f91160f = str;
    }

    /* renamed from: s */
    public void m95702s(C17969i0 c17969i0) {
        this.f91162h = c17969i0;
    }

    /* renamed from: t */
    public void m95703t(String str) {
        this.f91158d = str;
    }

    public String toString() {
        Object sb2;
        try {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("replySenderUid=");
            if (this.f91157c == null) {
                sb2 = 0;
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(Long.valueOf(this.f91157c));
                sb4.append(" replySenderGlobalUid=");
                sb4.append(this.f91158d);
                sb4.append(" replyClientMsgId=");
                sb4.append(m95689f().m41044h());
                sb4.append(" replyGlobalMsgId=");
                sb4.append(m95689f().m41046j());
                sb4.append(" replyTs=");
                sb4.append(this.f91164j);
                sb4.append(" replyMsgType=");
                sb4.append(this.f91156b);
                sb4.append(" TTL=");
                sb4.append(this.f91165k);
                sb4.append(" replyMsg=");
                String str = this.f91160f;
                if (str == null) {
                    str = "";
                }
                sb4.append(str);
                sb4.append(" replyAtt=");
                String str2 = this.f91161g;
                if (str2 == null) {
                    str2 = "";
                }
                sb4.append(str2);
                sb2 = sb4.toString();
            }
            sb3.append(sb2);
            return sb3.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: u */
    public void m95704u(String str) {
        this.f91159e = str;
    }

    /* renamed from: v */
    public void m95705v(String str) {
        this.f91157c = str;
    }

    /* renamed from: w */
    public void m95706w(C25630b c25630b) {
        this.f91163i = c25630b;
    }

    /* renamed from: x */
    public void m95707x(long j11) {
        this.f91165k = j11;
    }

    /* renamed from: y */
    public void m95708y(long j11) {
        this.f91164j = j11;
    }

    /* renamed from: z */
    public JSONObject m95709z() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cliMsgType", this.f91156b);
            jSONObject.put("cliMsgId", this.f91155a.m41045i());
            jSONObject.put("globalMsgId", this.f91155a.m41047k());
            jSONObject.put("ownerId", this.f91157c);
            if (!TextUtils.isEmpty(this.f91158d)) {
                jSONObject.put("gOwnerId", this.f91158d);
            }
            jSONObject.put("fromD", this.f91159e);
            jSONObject.put("ts", this.f91164j);
            jSONObject.put("msg", this.f91160f);
            jSONObject.put("attach", this.f91161g);
            jSONObject.put("ttl", this.f91165k);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }
}
