package p716zh;

import am.C0943w;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.control.C7907e;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gw.AbstractC19646n0;
import gw.C19637j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ln0.AbstractC22543l;
import me0.AbstractC23244v8;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p656xs.AbstractC30200a;
import pm0.C24848g0;
import qm0.AbstractC25368s;
import qm0.AbstractC25376w;

/* renamed from: zh.j5 */
/* loaded from: classes3.dex */
public final class C31973j5 {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private int f146943A;

    /* renamed from: B */
    private C7904b f146944B;

    /* renamed from: C */
    private boolean f146945C;

    /* renamed from: D */
    private final List f146946D;

    /* renamed from: E */
    private List f146947E;

    /* renamed from: F */
    private String f146948F;

    /* renamed from: G */
    private String f146949G;

    /* renamed from: H */
    private String f146950H;

    /* renamed from: I */
    private String f146951I;

    /* renamed from: J */
    private String f146952J;

    /* renamed from: K */
    private String f146953K;

    /* renamed from: L */
    private String f146954L;

    /* renamed from: M */
    private ArrayList f146955M;

    /* renamed from: N */
    private C7907e f146956N;

    /* renamed from: O */
    private int f146957O;

    /* renamed from: P */
    private ArrayList f146958P;

    /* renamed from: Q */
    private int f146959Q;

    /* renamed from: R */
    private long f146960R;

    /* renamed from: S */
    private int f146961S;

    /* renamed from: T */
    private int f146962T;

    /* renamed from: U */
    private int f146963U;

    /* renamed from: V */
    private int f146964V;

    /* renamed from: W */
    private String f146965W;

    /* renamed from: X */
    private String f146966X;

    /* renamed from: Y */
    private long f146967Y;

    /* renamed from: Z */
    private String f146968Z;

    /* renamed from: a */
    private String f146969a;

    /* renamed from: a0 */
    private boolean f146970a0;

    /* renamed from: b */
    private String f146971b;

    /* renamed from: b0 */
    private boolean f146972b0;

    /* renamed from: c */
    private String f146973c;

    /* renamed from: c0 */
    private final List f146974c0;

    /* renamed from: d */
    private String f146975d;

    /* renamed from: d0 */
    private final List f146976d0;

    /* renamed from: e */
    private String f146977e;

    /* renamed from: f */
    private String f146978f;

    /* renamed from: g */
    private String f146979g;

    /* renamed from: h */
    private String f146980h;

    /* renamed from: i */
    private int f146981i;

    /* renamed from: j */
    private String f146982j;

    /* renamed from: k */
    private int f146983k;

    /* renamed from: l */
    private int f146984l;

    /* renamed from: m */
    private HashMap f146985m;

    /* renamed from: n */
    private int f146986n;

    /* renamed from: o */
    private boolean f146987o;

    /* renamed from: p */
    private boolean f146988p;

    /* renamed from: q */
    private boolean f146989q;

    /* renamed from: r */
    private boolean f146990r;

    /* renamed from: s */
    private boolean f146991s;

    /* renamed from: t */
    private boolean f146992t;

    /* renamed from: u */
    private boolean f146993u;

    /* renamed from: v */
    private boolean f146994v;

    /* renamed from: w */
    private boolean f146995w;

    /* renamed from: x */
    private boolean f146996x;

    /* renamed from: y */
    private boolean f146997y;

    /* renamed from: z */
    private int f146998z;

    /* renamed from: zh.j5$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final String m153797a() {
            return C23302b.f113247a.m120522b();
        }

        /* renamed from: b */
        public final boolean m153798b(String str) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            return C23302b.f113247a.m120524e(str);
        }
    }

    /* renamed from: zh.j5$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final String f146999a;

        /* renamed from: b */
        private final String f147000b;

        /* renamed from: c */
        private final String f147001c;

        /* renamed from: d */
        private final int f147002d;

        public b(String str, String str2, String str3, int i11) {
            AbstractC19074t.m100208f(str, "uid");
            AbstractC19074t.m100208f(str2, "displayName");
            AbstractC19074t.m100208f(str3, "avatar");
            this.f146999a = str;
            this.f147000b = str2;
            this.f147001c = str3;
            this.f147002d = i11;
        }

        /* renamed from: a */
        public final String m153799a() {
            return this.f147001c;
        }

        /* renamed from: b */
        public final String m153800b() {
            return this.f147000b;
        }

        /* renamed from: c */
        public final int m153801c() {
            return this.f147002d;
        }

        /* renamed from: d */
        public final String m153802d() {
            return this.f146999a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f146999a, bVar.f146999a) && AbstractC19074t.m100204b(this.f147000b, bVar.f147000b) && AbstractC19074t.m100204b(this.f147001c, bVar.f147001c) && this.f147002d == bVar.f147002d;
        }

        public int hashCode() {
            return (((((this.f146999a.hashCode() * 31) + this.f147000b.hashCode()) * 31) + this.f147001c.hashCode()) * 31) + this.f147002d;
        }

        public String toString() {
            return "GroupMemberProfile(uid=" + this.f146999a + ", displayName=" + this.f147000b + ", avatar=" + this.f147001c + ", typeContact=" + this.f147002d + ")";
        }
    }

    public C31973j5(JSONObject jSONObject) {
        String str;
        AbstractC19074t.m100208f(jSONObject, "item");
        this.f146969a = "";
        this.f146971b = "";
        this.f146973c = "";
        this.f146975d = "";
        String str2 = "0";
        this.f146982j = "0";
        boolean z11 = true;
        this.f146998z = 1;
        this.f146943A = 1;
        this.f146945C = true;
        this.f146946D = new ArrayList();
        this.f146948F = "";
        this.f146950H = "";
        this.f146951I = "";
        this.f146952J = "";
        this.f146958P = new ArrayList();
        this.f146964V = -1;
        this.f146965W = "";
        this.f146966X = "";
        this.f146968Z = "0";
        this.f146974c0 = new ArrayList();
        this.f146976d0 = new ArrayList();
        try {
            this.f146962T = 0;
            String optString = jSONObject.optString("groupId");
            AbstractC19074t.m100207e(optString, "optString(...)");
            m153700F0(optString);
            String optString2 = jSONObject.optString("name");
            AbstractC19074t.m100207e(optString2, "optString(...)");
            this.f146973c = optString2;
            this.f146979g = jSONObject.optString("desc");
            this.f146983k = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
            this.f146984l = jSONObject.optInt("subType");
            this.f146980h = jSONObject.optString("creatorId");
            String optString3 = jSONObject.optString("createTime");
            AbstractC19074t.m100207e(optString3, "optString(...)");
            this.f146982j = optString3;
            this.f146977e = jSONObject.optString("avt");
            this.f146978f = jSONObject.optString("fullAvt");
            this.f146963U = jSONObject.optInt("requestCount");
            this.f146964V = jSONObject.optInt("poolType");
            JSONArray optJSONArray = jSONObject.optJSONArray("cateIds");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    this.f146958P.add(Integer.valueOf(optJSONArray.getInt(i11)));
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("admins");
            if (optJSONArray2 != null) {
                m153704x0(this.f146974c0, optJSONArray2);
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("currentMems");
            if (optJSONArray3 != null) {
                m153704x0(this.f146976d0, optJSONArray3);
            }
            this.f146981i = jSONObject.optInt("totalMembers");
            m153794y0(jSONObject.optJSONObject("setting"));
            m153703v0(jSONObject.optJSONObject("extraInfo"));
            this.f146957O = jSONObject.optInt("isOnline");
            this.f146959Q = jSONObject.optInt("visibility");
            int optInt = jSONObject.optInt("isPendingList", 0);
            this.f146961S = optInt;
            if (optInt == 1) {
                this.f146962T = 2;
            }
            String optString4 = jSONObject.optString("joinQuestion", "");
            AbstractC19074t.m100207e(optString4, "optString(...)");
            this.f146966X = optString4;
            this.f146960R = jSONObject.optLong("lastActive");
            C31973j5 m4472f = C0943w.f3447a.m4472f(this.f146969a);
            if (m4472f != null && (str = m4472f.f146968Z) != null) {
                str2 = str;
            }
            this.f146968Z = str2;
            if (jSONObject.optInt("isE2ee") != 1) {
                z11 = false;
            }
            this.f146970a0 = z11;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: F0 */
    private final void m153700F0(String str) {
        this.f146969a = str;
        this.f146971b = "group_" + str;
    }

    /* renamed from: b */
    private final List m153701b() {
        int m116584g;
        synchronized (this) {
            try {
                ArrayList arrayList = new ArrayList();
                try {
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
                if (!this.f146946D.isEmpty()) {
                    m116584g = AbstractC22543l.m116584g(this.f146946D.size(), 4);
                    String str = CoreUtility.f89233i;
                    boolean z11 = false;
                    for (int i11 = 0; i11 < m116584g; i11++) {
                        String str2 = (String) this.f146946D.get(i11);
                        if (!AbstractC19074t.m100204b(str2, str)) {
                            arrayList.add(str2);
                        } else {
                            z11 = true;
                        }
                    }
                    if (z11) {
                        arrayList.add(str);
                    }
                    if (this.f146981i > 4 && arrayList.size() == 3) {
                        arrayList.add(String.valueOf(this.f146981i));
                    }
                    if (arrayList.size() == 1) {
                        arrayList.add("1");
                    } else if (arrayList.size() == 4) {
                        int i12 = this.f146981i;
                        if (i12 > 100) {
                            arrayList.add("99+");
                        } else if (i12 != 4) {
                            arrayList.add(String.valueOf(i12));
                        }
                    }
                    return arrayList;
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: i */
    public static final String m153702i() {
        return Companion.m153797a();
    }

    /* renamed from: v0 */
    private final void m153703v0(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f146998z = jSONObject.optInt("media", 1);
                this.f146943A = jSONObject.optInt("mentionAll");
                JSONObject optJSONObject = jSONObject.optJSONObject("groupLinkInfo");
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("link");
                    AbstractC19074t.m100207e(optString, "optString(...)");
                    this.f146948F = optString;
                }
                m153791w0(jSONObject);
                JSONObject optJSONObject2 = jSONObject.optJSONObject("customMsg");
                if (optJSONObject2 != null && optJSONObject2.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE) <= 0) {
                    JSONArray optJSONArray = optJSONObject2.optJSONArray("highlights");
                    if (optJSONArray != null) {
                        this.f146955M = new ArrayList();
                        this.f146956N = new C7907e();
                        int length = optJSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            Object obj = optJSONArray.get(i11);
                            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                            JSONObject jSONObject2 = (JSONObject) obj;
                            String optString2 = jSONObject2.optString("uid");
                            if (AbstractC19074t.m100204b(optString2, CoreUtility.f89233i)) {
                                break;
                            }
                            String optString3 = jSONObject2.optString("dpn");
                            ArrayList arrayList = this.f146955M;
                            AbstractC19074t.m100205c(arrayList);
                            arrayList.add(new C32118t5(optString2, optString3, false));
                        }
                    }
                    this.f146949G = optJSONObject2.toString();
                    String optString4 = optJSONObject2.optString("icon");
                    AbstractC19074t.m100207e(optString4, "optString(...)");
                    this.f146951I = optString4;
                    String optString5 = optJSONObject2.optString("msg");
                    AbstractC19646n0.m102903J0(this.f146950H, this.f146955M, this.f146956N);
                    ArrayList arrayList2 = this.f146955M;
                    AbstractC19074t.m100205c(arrayList2);
                    ArrayList arrayList3 = new ArrayList(arrayList2.size());
                    ArrayList arrayList4 = this.f146955M;
                    AbstractC19074t.m100205c(arrayList4);
                    int size = arrayList4.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ArrayList arrayList5 = this.f146955M;
                        AbstractC19074t.m100205c(arrayList5);
                        arrayList3.add(((C32118t5) arrayList5.get(i12)).f148056b);
                    }
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    AbstractC19074t.m100205c(optString5);
                    String[] strArr = (String[]) arrayList3.toArray(new String[0]);
                    Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
                    String format = String.format(optString5, Arrays.copyOf(copyOf, copyOf.length));
                    AbstractC19074t.m100207e(format, "format(...)");
                    this.f146950H = format;
                    this.f146954L = "";
                    this.f146953K = optJSONObject2.optString("actionType");
                    String optString6 = optJSONObject2.optString("actionLabel");
                    AbstractC19074t.m100207e(optString6, "optString(...)");
                    this.f146952J = optString6;
                }
                String optString7 = jSONObject.optString("summary");
                AbstractC19074t.m100207e(optString7, "optString(...)");
                this.f146965W = optString7;
                this.f146986n = jSONObject.optInt("ownerType", 0);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: x0 */
    private final void m153704x0(List list, JSONArray jSONArray) {
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            try {
                Object obj = jSONArray.get(i11);
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                String optString = jSONObject.optString("id");
                String optString2 = jSONObject.optString("dName");
                String optString3 = jSONObject.optString("avatar");
                int optInt = jSONObject.optInt("typeContact", 0);
                if (!TextUtils.isEmpty(optString)) {
                    AbstractC19074t.m100205c(optString);
                    if (optString2 == null) {
                        optString2 = "";
                    }
                    if (optString3 == null) {
                        optString3 = "";
                    }
                    list.add(new b(optString, optString2, optString3, optInt));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: A */
    public final String m153705A(String str) {
        AbstractC19074t.m100208f(str, "uid");
        HashMap hashMap = this.f146985m;
        if (hashMap == null) {
            return null;
        }
        AbstractC19074t.m100205c(hashMap);
        return (String) hashMap.get(str);
    }

    /* renamed from: A0 */
    public final void m153706A0(int i11) {
        this.f146962T = i11;
    }

    /* renamed from: B */
    public final String m153707B(String str, String str2) {
        AbstractC19074t.m100208f(str, "uid");
        if (AbstractC23309i.m121740b3() == 1) {
            String m153705A = m153705A(str);
            if (!TextUtils.isEmpty(m153705A)) {
                return m153705A;
            }
            return str2;
        }
        return str2;
    }

    /* renamed from: B0 */
    public final void m153708B0(String str, String str2) {
        this.f146977e = str;
        this.f146978f = str2;
    }

    /* renamed from: C */
    public final int m153709C() {
        return this.f146986n;
    }

    /* renamed from: C0 */
    public final void m153710C0(String str) {
        this.f146980h = str;
    }

    /* renamed from: D */
    public final int m153711D() {
        return this.f146964V;
    }

    /* renamed from: D0 */
    public final void m153712D0(String str) {
        this.f146979g = str;
    }

    /* renamed from: E */
    public final int m153713E() {
        return this.f146963U;
    }

    /* renamed from: E0 */
    public final void m153714E0(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f146948F = str;
    }

    /* renamed from: F */
    public final String m153715F() {
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append("{");
            sb2.append(JSONObject.quote("blockName"));
            sb2.append(":");
            sb2.append(this.f146987o ? 1 : 0);
            sb2.append(",");
            sb2.append(JSONObject.quote("signAdminMsg"));
            sb2.append(":");
            sb2.append(this.f146988p ? 1 : 0);
            sb2.append(",");
            sb2.append(JSONObject.quote("addMemberOnly"));
            sb2.append(":");
            sb2.append(this.f146989q ? 1 : 0);
            sb2.append(",");
            sb2.append(JSONObject.quote("setTopicOnly"));
            sb2.append(":");
            sb2.append(this.f146990r ? 1 : 0);
            sb2.append(",");
            sb2.append(JSONObject.quote("lockCreatePost"));
            sb2.append(":");
            sb2.append(this.f146991s ? 1 : 0);
            sb2.append(",");
            sb2.append(JSONObject.quote("lockCreatePoll"));
            sb2.append(":");
            sb2.append(this.f146992t ? 1 : 0);
            sb2.append(",");
            sb2.append(JSONObject.quote("enableMsgHistory"));
            sb2.append(":");
            sb2.append(this.f146995w ? 1 : 0);
            sb2.append(",");
            sb2.append(JSONObject.quote("joinAppr"));
            sb2.append(":");
            sb2.append(this.f146996x ? 1 : 0);
            sb2.append(",");
            sb2.append(JSONObject.quote("lockSendMsg"));
            sb2.append(":");
            sb2.append(this.f146994v ? 1 : 0);
            sb2.append(",");
            sb2.append(JSONObject.quote("lockSetNickname"));
            sb2.append(":");
            sb2.append(this.f146993u ? 1 : 0);
            sb2.append(",");
            sb2.append(JSONObject.quote("lockViewMember"));
            sb2.append(":");
            sb2.append(this.f146997y ? 1 : 0);
            sb2.append("}");
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: G */
    public final int m153716G() {
        return this.f146984l;
    }

    /* renamed from: G0 */
    public final void m153717G0(long j11) {
        this.f146967Y = j11;
    }

    /* renamed from: H */
    public final String m153718H() {
        return this.f146952J;
    }

    /* renamed from: H0 */
    public final void m153719H0(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f146966X = str;
    }

    /* renamed from: I */
    public final String m153720I() {
        return this.f146953K;
    }

    /* renamed from: I0 */
    public final void m153721I0(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f146973c = str;
    }

    /* renamed from: J */
    public final String m153722J() {
        return this.f146951I;
    }

    /* renamed from: J0 */
    public final void m153723J0(boolean z11) {
        this.f146945C = z11;
    }

    /* renamed from: K */
    public final String m153724K() {
        return this.f146950H;
    }

    /* renamed from: K0 */
    public final void m153725K0(int i11) {
        this.f146963U = i11;
    }

    /* renamed from: L */
    public final String m153726L() {
        return this.f146954L;
    }

    /* renamed from: L0 */
    public final void m153727L0(int i11) {
        this.f146984l = i11;
    }

    /* renamed from: M */
    public final String m153728M() {
        return this.f146965W;
    }

    /* renamed from: M0 */
    public final void m153729M0(String str) {
        this.f146954L = str;
    }

    /* renamed from: N */
    public final String m153730N() {
        return this.f146971b;
    }

    /* renamed from: N0 */
    public final void m153731N0(int i11) {
        this.f146981i = i11;
    }

    /* renamed from: O */
    public final int m153732O() {
        return this.f146981i;
    }

    /* renamed from: O0 */
    public final void m153733O0(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f146968Z = str;
    }

    /* renamed from: P */
    public final String m153734P() {
        return this.f146982j;
    }

    /* renamed from: P0 */
    public final void m153735P0(int i11) {
        this.f146983k = i11;
    }

    /* renamed from: Q */
    public final String m153736Q() {
        return this.f146968Z;
    }

    /* renamed from: Q0 */
    public final void m153737Q0(int i11) {
        this.f146959Q = i11;
    }

    /* renamed from: R */
    public final int m153738R() {
        return this.f146983k;
    }

    /* renamed from: R0 */
    public final void m153739R0(List list) {
        AbstractC19074t.m100208f(list, "listUid");
        synchronized (this) {
            this.f146946D.clear();
            this.f146946D.addAll(list);
            this.f146947E = null;
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: S */
    public final int m153740S() {
        return this.f146959Q;
    }

    /* renamed from: S0 */
    public final void m153741S0(String str) {
        AbstractC19074t.m100208f(str, "nameNoSign");
        this.f146975d = str;
    }

    /* renamed from: T */
    public final boolean m153742T() {
        if (!m153743U() && !m153778p0()) {
            return false;
        }
        return true;
    }

    /* renamed from: U */
    public final boolean m153743U() {
        return C0943w.f3447a.m4479q(this.f146969a);
    }

    /* renamed from: V */
    public final boolean m153744V(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return C0943w.f3447a.m4480r(this.f146969a, str);
    }

    /* renamed from: W */
    public final boolean m153745W() {
        int i11 = this.f146983k;
        if (i11 == 0) {
            if (this.f146981i <= AbstractC30200a.m148946e()) {
                return false;
            }
        } else if (i11 != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: X */
    public final boolean m153746X() {
        if (m153747Y() && AbstractC30200a.m148945d()) {
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    public final boolean m153747Y() {
        if (m153745W() && AbstractC30200a.m148947f()) {
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    public final boolean m153748Z() {
        return this.f146972b0;
    }

    /* renamed from: a */
    public final boolean m153749a(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "hashTags");
        ArrayList m119748l = AbstractC23244v8.m119748l(this.f146979g);
        AbstractC19074t.m100207e(m119748l, "getUniqueHashTags(...)");
        if (m119748l.size() == arrayList.size()) {
            AbstractC25376w.m131533v(m119748l);
            AbstractC25376w.m131533v(arrayList);
            int size = m119748l.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (!AbstractC19074t.m100204b(m119748l.get(i11), arrayList.get(i11))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    public final boolean m153750a0() {
        return this.f146970a0;
    }

    /* renamed from: b0 */
    public final boolean m153751b0() {
        return this.f146995w;
    }

    /* renamed from: c */
    public final int m153752c() {
        return this.f146962T;
    }

    /* renamed from: c0 */
    public final boolean m153753c0() {
        return this.f146988p;
    }

    /* renamed from: d */
    public final List m153754d() {
        return this.f146974c0;
    }

    /* renamed from: d0 */
    public final boolean m153755d0() {
        return this.f146996x;
    }

    /* renamed from: e */
    public final String m153756e() {
        return this.f146977e;
    }

    /* renamed from: e0 */
    public final boolean m153757e0() {
        return this.f146992t;
    }

    /* renamed from: f */
    public final String m153758f() {
        return this.f146980h;
    }

    /* renamed from: f0 */
    public final boolean m153759f0() {
        return this.f146991s;
    }

    /* renamed from: g */
    public final List m153760g() {
        return this.f146976d0;
    }

    /* renamed from: g0 */
    public final boolean m153761g0() {
        return this.f146987o;
    }

    /* renamed from: h */
    public final List m153762h() {
        List list;
        synchronized (this) {
            try {
                if (this.f146947E == null) {
                    this.f146947E = m153701b();
                }
                list = this.f146947E;
                if (list == null) {
                    list = AbstractC25368s.m131502j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return list;
    }

    /* renamed from: h0 */
    public final boolean m153763h0() {
        return this.f146990r;
    }

    /* renamed from: i0 */
    public final boolean m153764i0() {
        return this.f146994v;
    }

    /* renamed from: j */
    public final String m153765j() {
        return this.f146979g;
    }

    /* renamed from: j0 */
    public final boolean m153766j0() {
        return this.f146993u;
    }

    /* renamed from: k */
    public final List m153767k() {
        return this.f146946D;
    }

    /* renamed from: k0 */
    public final boolean m153768k0() {
        return this.f146997y;
    }

    /* renamed from: l */
    public final String m153769l() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("media", this.f146998z);
            jSONObject.put("mentionAll", this.f146943A);
            if (!TextUtils.isEmpty(this.f146948F)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("link", this.f146948F);
                jSONObject.put("groupLinkInfo", jSONObject2);
            }
            String str = this.f146949G;
            if (str != null && str.length() != 0) {
                String str2 = this.f146949G;
                AbstractC19074t.m100205c(str2);
                jSONObject.put("customMsg", new JSONObject(str2));
            }
            HashMap hashMap = this.f146985m;
            if (hashMap != null) {
                AbstractC19074t.m100205c(hashMap);
                if (hashMap.size() > 0) {
                    try {
                        JSONArray jSONArray = new JSONArray();
                        HashMap hashMap2 = this.f146985m;
                        AbstractC19074t.m100205c(hashMap2);
                        Object clone = hashMap2.clone();
                        AbstractC19074t.m100206d(clone, "null cannot be cast to non-null type java.util.HashMap<*, *>");
                        Iterator it = ((HashMap) clone).entrySet().iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            AbstractC19074t.m100206d(next, "null cannot be cast to non-null type kotlin.collections.Map.Entry<*, *>");
                            Map.Entry entry = (Map.Entry) next;
                            JSONObject jSONObject3 = new JSONObject();
                            Object key = entry.getKey();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(key);
                            jSONObject3.put("uid", Long.parseLong(sb2.toString()));
                            jSONObject3.put("nickName", entry.getValue());
                            jSONArray.put(jSONObject3);
                            it.remove();
                        }
                        jSONObject.put("customNickname", jSONArray);
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                }
            }
            if (!TextUtils.isEmpty(this.f146965W)) {
                jSONObject.put("summary", this.f146965W);
            }
            jSONObject.put("ownerType", this.f146986n);
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
        }
        String jSONObject4 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject4, "toString(...)");
        return jSONObject4;
    }

    /* renamed from: l0 */
    public final boolean m153770l0() {
        return this.f146998z == 1;
    }

    /* renamed from: m */
    public final String m153771m() {
        if (!TextUtils.isEmpty(this.f146978f)) {
            a aVar = Companion;
            String str = this.f146978f;
            AbstractC19074t.m100205c(str);
            if (!aVar.m153798b(str)) {
                return this.f146978f;
            }
        }
        return this.f146977e;
    }

    /* renamed from: m0 */
    public final boolean m153772m0() {
        return this.f146984l != 0;
    }

    /* renamed from: n */
    public final String m153773n() {
        return this.f146948F;
    }

    /* renamed from: n0 */
    public final boolean m153774n0() {
        return this.f146983k == 1;
    }

    /* renamed from: o */
    public final C7904b m153775o() {
        return this.f146944B;
    }

    /* renamed from: o0 */
    public final int m153776o0() {
        return this.f146957O;
    }

    /* renamed from: p */
    public final String m153777p() {
        int i11 = this.f146959Q;
        if (i11 != 1) {
            if (i11 != 2) {
                String string = MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_private);
                AbstractC19074t.m100207e(string, "getString(...)");
                return string;
            }
            String string2 = MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_anyone);
            AbstractC19074t.m100207e(string2, "getString(...)");
            return string2;
        }
        String string3 = MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_friends_only);
        AbstractC19074t.m100207e(string3, "getString(...)");
        return string3;
    }

    /* renamed from: p0 */
    public final boolean m153778p0() {
        return AbstractC19074t.m100204b(this.f146980h, CoreUtility.f89233i);
    }

    /* renamed from: q */
    public final C7907e m153779q() {
        return this.f146956N;
    }

    /* renamed from: q0 */
    public final boolean m153780q0(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return AbstractC19074t.m100204b(this.f146980h, str);
    }

    /* renamed from: r */
    public final String m153781r() {
        return this.f146969a;
    }

    /* renamed from: r0 */
    public final int m153782r0() {
        return this.f146961S;
    }

    /* renamed from: s */
    public final long m153783s() {
        return this.f146967Y;
    }

    /* renamed from: s0 */
    public final boolean m153784s0() {
        return this.f146945C;
    }

    /* renamed from: t */
    public final String m153785t() {
        return this.f146966X;
    }

    /* renamed from: t0 */
    public final boolean m153786t0() {
        if (!TextUtils.isEmpty(this.f146977e)) {
            a aVar = Companion;
            String str = this.f146977e;
            AbstractC19074t.m100205c(str);
            if (!aVar.m153798b(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: u */
    public final long m153787u() {
        return this.f146960R;
    }

    /* renamed from: u0 */
    public final void m153788u0() {
        this.f146972b0 = true;
        this.f146994v = true;
    }

    /* renamed from: v */
    public final HashMap m153789v() {
        return this.f146985m;
    }

    /* renamed from: w */
    public final int m153790w() {
        return this.f146998z;
    }

    /* renamed from: w0 */
    public final void m153791w0(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsExtraInfo");
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("customNickname");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.f146985m = new HashMap();
                int length = optJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                    String string = jSONObject2.getString("uid");
                    String string2 = jSONObject2.getString("nickName");
                    if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                        HashMap hashMap = this.f146985m;
                        AbstractC19074t.m100205c(hashMap);
                        AbstractC19074t.m100205c(string);
                        AbstractC19074t.m100205c(string2);
                        hashMap.put(string, string2);
                    }
                }
                return;
            }
            this.f146985m = null;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: x */
    public final int m153792x() {
        return this.f146943A;
    }

    /* renamed from: y */
    public final String m153793y() {
        return this.f146973c;
    }

    /* renamed from: y0 */
    public final void m153794y0(JSONObject jSONObject) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z21;
        if (jSONObject != null) {
            boolean z22 = false;
            if (jSONObject.optInt("blockName") == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f146987o = z11;
            if (jSONObject.optInt("signAdminMsg") == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f146988p = z12;
            if (jSONObject.optInt("addMemberOnly") == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f146989q = z13;
            if (jSONObject.optInt("setTopicOnly") == 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f146990r = z14;
            if (jSONObject.optInt("lockCreatePost") == 1) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.f146991s = z15;
            if (jSONObject.optInt("lockCreatePoll") == 1) {
                z16 = true;
            } else {
                z16 = false;
            }
            this.f146992t = z16;
            if (jSONObject.optInt("enableMsgHistory") == 1) {
                z17 = true;
            } else {
                z17 = false;
            }
            this.f146995w = z17;
            if (jSONObject.optInt("joinAppr") == 1) {
                z18 = true;
            } else {
                z18 = false;
            }
            this.f146996x = z18;
            if (jSONObject.optInt("lockSetNickname") == 1) {
                z19 = true;
            } else {
                z19 = false;
            }
            this.f146993u = z19;
            if (jSONObject.optInt("lockSendMsg") == 1) {
                z21 = true;
            } else {
                z21 = false;
            }
            this.f146994v = z21;
            if (jSONObject.optInt("lockViewMember") == 1) {
                z22 = true;
            }
            this.f146997y = z22;
        }
    }

    /* renamed from: z */
    public final String m153795z() {
        return this.f146975d;
    }

    /* renamed from: z0 */
    public final void m153796z0(String str, String str2) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "nickname");
        try {
            if (this.f146985m == null) {
                this.f146985m = new HashMap();
            }
            if (!TextUtils.isEmpty(str)) {
                HashMap hashMap = this.f146985m;
                AbstractC19074t.m100205c(hashMap);
                hashMap.put(str, str2);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00bb, code lost:            if (r27.length() != 0) goto L44;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00be, code lost:            m153703v0(new org.json.JSONObject(r27));     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C31973j5(String str, String str2, String str3, String str4, String str5, String str6, List list, int i11, String str7, int i12, int i13, String str8, long j11, int i14, String str9, String str10, String str11) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "name");
        AbstractC19074t.m100208f(str5, "ts");
        AbstractC19074t.m100208f(list, "avtMembers");
        AbstractC19074t.m100208f(str10, "joinQuestion");
        AbstractC19074t.m100208f(str11, "tsJoinGroup");
        this.f146969a = "";
        this.f146971b = "";
        this.f146973c = "";
        this.f146975d = "";
        this.f146982j = "0";
        this.f146998z = 1;
        this.f146943A = 1;
        this.f146945C = true;
        ArrayList arrayList = new ArrayList();
        this.f146946D = arrayList;
        this.f146948F = "";
        this.f146950H = "";
        this.f146951I = "";
        this.f146952J = "";
        this.f146958P = new ArrayList();
        this.f146964V = -1;
        this.f146965W = "";
        this.f146966X = "";
        this.f146968Z = "0";
        this.f146974c0 = new ArrayList();
        this.f146976d0 = new ArrayList();
        try {
            m153700F0(str);
            this.f146973c = str2;
            this.f146979g = str3;
            this.f146980h = str4;
            arrayList.addAll(list);
            this.f146981i = i11;
            this.f146977e = str6;
            this.f146982j = str5;
            this.f146983k = i12;
            this.f146984l = i13;
            if (i11 == 0) {
                this.f146981i = arrayList.size();
            }
            if (str7 != null && str7.length() != 0) {
                m153794y0(new JSONObject(str7));
            }
            this.f146998z = 1;
            this.f146960R = j11;
            this.f146959Q = i14;
            this.f146978f = str9;
            this.f146966X = str10;
            this.f146968Z = str11;
            C19637j.m102803N(this);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C31973j5(String str, String str2, String str3, String str4, String str5, String str6, List list, int i11, String str7, int i12, int i13, String str8, String str9) {
        this(str, str2, str3, str4, str5, str6, list, i11, str7, i12, i13, str8, 0L, 0, str6, str9, "");
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "name");
        AbstractC19074t.m100208f(str5, "ts");
        AbstractC19074t.m100208f(list, "avatarMembers");
        AbstractC19074t.m100208f(str9, "joinQuestion");
    }

    public C31973j5(String str, String str2, String str3, List list, int i11) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "name");
        AbstractC19074t.m100208f(list, "avatarByMember");
        this.f146969a = "";
        this.f146971b = "";
        this.f146973c = "";
        this.f146975d = "";
        this.f146982j = "0";
        this.f146998z = 1;
        this.f146943A = 1;
        this.f146945C = true;
        this.f146946D = new ArrayList();
        this.f146948F = "";
        this.f146950H = "";
        this.f146951I = "";
        this.f146952J = "";
        this.f146958P = new ArrayList();
        this.f146964V = -1;
        this.f146965W = "";
        this.f146966X = "";
        this.f146968Z = "0";
        this.f146974c0 = new ArrayList();
        this.f146976d0 = new ArrayList();
        m153700F0(str);
        this.f146973c = str2;
        this.f146977e = str3;
        this.f146983k = i11;
        synchronized (this) {
            this.f146947E = list;
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }
}
