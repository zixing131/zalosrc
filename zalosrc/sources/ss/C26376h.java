package ss;

import com.zing.zalo.AbstractC8020f0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import ge.C19424p;
import ge.C19425q;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import me0.AbstractC23136l9;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18644n;
import qm0.AbstractC25368s;

/* renamed from: ss.h */
/* loaded from: classes4.dex */
public final class C26376h {

    /* renamed from: a */
    private long f125327a;

    /* renamed from: b */
    private long f125328b;

    /* renamed from: c */
    private boolean f125329c;

    /* renamed from: d */
    private long f125330d;

    /* renamed from: e */
    private long f125331e;

    /* renamed from: f */
    private ArrayList f125332f;

    /* renamed from: g */
    private String f125333g;

    /* renamed from: h */
    private a f125334h;

    /* renamed from: i */
    private int f125335i;

    /* renamed from: j */
    private C19425q f125336j;

    /* renamed from: ss.h$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static final C32972a Companion = new C32972a(null);

        /* renamed from: a */
        private byte f125337a;

        /* renamed from: b */
        private ArrayList f125338b;

        /* renamed from: ss.h$a$a */
        /* loaded from: classes4.dex */
        public static final class C32972a {
            private C32972a() {
            }

            public /* synthetic */ C32972a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        public a(byte b11, ArrayList arrayList) {
            this.f125337a = b11;
            this.f125338b = arrayList;
        }

        /* renamed from: a */
        public final String m135898a() {
            ArrayList arrayList = this.f125338b;
            int i11 = 0;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    i11 += ((Number) it.next()).intValue();
                }
            }
            return ((int) this.f125337a) + "_" + i11;
        }

        /* renamed from: b */
        public final byte m135899b() {
            return this.f125337a;
        }

        /* renamed from: c */
        public final String m135900c() {
            int i11;
            int i12;
            byte b11 = this.f125337a;
            if (b11 == 0) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_receiver_option_all);
                AbstractC19074t.m100205c(m118743r0);
                return m118743r0;
            }
            if (b11 == 1) {
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_receiver_option_strangers);
                AbstractC19074t.m100205c(m118743r02);
                return m118743r02;
            }
            String str = "";
            if (b11 == 2) {
                ArrayList arrayList = this.f125338b;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    i12 = 0;
                    while (it.hasNext()) {
                        if (C18644n.m98531l().m98558u(String.valueOf(((Number) it.next()).intValue()))) {
                            i12++;
                        }
                    }
                } else {
                    i12 = 0;
                }
                C19067n0 c19067n0 = C19067n0.f94947a;
                String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_friends_include_desc);
                AbstractC19074t.m100207e(m118743r03, "getString(...)");
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(i12);
                if (i12 >= 2) {
                    str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
                }
                objArr[1] = str;
                String format = String.format(m118743r03, Arrays.copyOf(objArr, 2));
                AbstractC19074t.m100207e(format, "format(...)");
                return format;
            }
            if (b11 == 3) {
                ArrayList arrayList2 = this.f125338b;
                if (arrayList2 != null) {
                    Iterator it2 = arrayList2.iterator();
                    i11 = 0;
                    while (it2.hasNext()) {
                        if (C18644n.m98531l().m98558u(String.valueOf(((Number) it2.next()).intValue()))) {
                            i11++;
                        }
                    }
                } else {
                    i11 = 0;
                }
                C19067n0 c19067n02 = C19067n0.f94947a;
                String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_friends_exclude_desc);
                AbstractC19074t.m100207e(m118743r04, "getString(...)");
                Object[] objArr2 = new Object[2];
                objArr2[0] = Integer.valueOf(i11);
                if (i11 >= 2) {
                    str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
                }
                objArr2[1] = str;
                String format2 = String.format(m118743r04, Arrays.copyOf(objArr2, 2));
                AbstractC19074t.m100207e(format2, "format(...)");
                return format2;
            }
            return "OTHER";
        }

        /* renamed from: d */
        public final ArrayList m135901d() {
            return this.f125338b;
        }

        /* renamed from: e */
        public final void m135902e(byte b11) {
            this.f125337a = b11;
        }

        /* renamed from: f */
        public final void m135903f(ArrayList arrayList) {
            this.f125338b = arrayList;
        }

        /* renamed from: g */
        public final JSONObject m135904g() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scope", Byte.valueOf(this.f125337a));
            if (this.f125338b != null) {
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = this.f125338b;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((Number) it.next()).intValue());
                    }
                }
                jSONObject.put("uids", jSONArray);
            }
            return jSONObject;
        }

        public /* synthetic */ a(byte b11, ArrayList arrayList, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? (byte) -1 : b11, (i11 & 2) != 0 ? null : arrayList);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(JSONObject jSONObject) {
            this(r0, r1);
            ArrayList arrayList;
            AbstractC19074t.m100208f(jSONObject, "json");
            byte optInt = (byte) jSONObject.optInt("scope", -1);
            JSONArray optJSONArray = jSONObject.optJSONArray("uids");
            if (optJSONArray != null) {
                arrayList = new ArrayList();
                int length = optJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    arrayList.add(Integer.valueOf(optJSONArray.optInt(i11)));
                }
            } else {
                arrayList = null;
            }
        }
    }

    public C26376h(long j11, long j12, boolean z11, long j13, long j14, ArrayList arrayList, String str, a aVar, int i11) {
        AbstractC19074t.m100208f(str, "content");
        AbstractC19074t.m100208f(aVar, "customScope");
        this.f125327a = j11;
        this.f125328b = j12;
        this.f125329c = z11;
        this.f125330d = j13;
        this.f125331e = j14;
        this.f125332f = arrayList;
        this.f125333g = str;
        this.f125334h = aVar;
        this.f125335i = i11;
        m135872t();
    }

    /* renamed from: j */
    private final JSONArray m135871j() {
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = this.f125332f;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
        }
        return jSONArray;
    }

    /* renamed from: t */
    private final void m135872t() {
        this.f125336j = new C19425q(m135883k(), 0);
    }

    /* renamed from: A */
    public final JSONObject m135873A() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.f125327a);
        jSONObject.put("weight", this.f125328b);
        jSONObject.put("enable", this.f125329c);
        jSONObject.put("startTime", this.f125330d);
        jSONObject.put("endTime", this.f125331e);
        jSONObject.put("recurrence", m135871j());
        jSONObject.put("content", this.f125333g);
        jSONObject.put("customScope", this.f125334h.m135904g());
        jSONObject.put("promoteId", this.f125335i);
        return jSONObject;
    }

    /* renamed from: a */
    public final C26376h m135874a() {
        ArrayList arrayList;
        long j11 = this.f125327a;
        long j12 = this.f125328b;
        boolean z11 = this.f125329c;
        long j13 = this.f125330d;
        long j14 = this.f125331e;
        ArrayList arrayList2 = this.f125332f;
        ArrayList arrayList3 = null;
        if (arrayList2 != null) {
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = null;
        }
        String str = this.f125333g;
        byte m135884l = m135884l();
        ArrayList m135886n = m135886n();
        if (m135886n != null) {
            arrayList3 = new ArrayList(m135886n);
        }
        return new C26376h(j11, j12, z11, j13, j14, arrayList, str, new a(m135884l, arrayList3), this.f125335i);
    }

    /* renamed from: b */
    public final void m135875b(C26376h c26376h) {
        AbstractC19074t.m100208f(c26376h, "cloneItem");
        this.f125327a = c26376h.f125327a;
        this.f125328b = c26376h.f125328b;
        this.f125329c = c26376h.f125329c;
        this.f125330d = c26376h.f125330d;
        this.f125331e = c26376h.f125331e;
        this.f125332f = c26376h.f125332f;
        m135872t();
        this.f125333g = c26376h.f125333g;
        this.f125334h = c26376h.f125334h;
        this.f125335i = c26376h.f125335i;
    }

    /* renamed from: c */
    public final String m135876c() {
        return this.f125333g;
    }

    /* renamed from: d */
    public final a m135877d() {
        return this.f125334h;
    }

    /* renamed from: e */
    public final boolean m135878e() {
        return this.f125329c;
    }

    /* renamed from: f */
    public final long m135879f() {
        return this.f125331e;
    }

    /* renamed from: g */
    public final long m135880g() {
        return this.f125327a;
    }

    /* renamed from: h */
    public final int m135881h() {
        return this.f125335i;
    }

    /* renamed from: i */
    public final ArrayList m135882i() {
        return this.f125332f;
    }

    /* renamed from: k */
    public final String m135883k() {
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = this.f125332f;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
        }
        String jSONArray2 = m135871j().toString();
        AbstractC19074t.m100207e(jSONArray2, "toString(...)");
        return jSONArray2;
    }

    /* renamed from: l */
    public final byte m135884l() {
        return this.f125334h.m135899b();
    }

    /* renamed from: m */
    public final String m135885m() {
        return this.f125334h.m135900c();
    }

    /* renamed from: n */
    public final ArrayList m135886n() {
        return this.f125334h.m135901d();
    }

    /* renamed from: o */
    public final ArrayList m135887o() {
        ArrayList arrayList = new ArrayList();
        ArrayList m135886n = m135886n();
        if (m135886n != null) {
            Iterator it = m135886n.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (C18644n.m98531l().m98558u(String.valueOf(intValue))) {
                    arrayList.add(Integer.valueOf(intValue));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: p */
    public final long m135888p() {
        return this.f125330d;
    }

    /* renamed from: q */
    public final String m135889q(boolean z11) {
        long j11 = this.f125330d;
        long j12 = this.f125331e;
        String str = "";
        if (j11 >= j12) {
            return "";
        }
        if (j12 - j11 >= 86400000 && m135891s()) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_time_option_all_day);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            return m118743r0;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.ENGLISH);
        if (z11) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.f125330d);
            int i11 = calendar.get(5);
            calendar.setTimeInMillis(this.f125331e);
            if (i11 != calendar.get(5)) {
                str = " " + AbstractC23136l9.m118743r0(AbstractC8020f0.str_next_day);
            }
        }
        return simpleDateFormat.format(Long.valueOf(this.f125330d)) + " - " + simpleDateFormat.format(Long.valueOf(this.f125331e)) + str;
    }

    /* renamed from: r */
    public final long m135890r() {
        return this.f125328b;
    }

    /* renamed from: s */
    public final boolean m135891s() {
        C19424p c19424p;
        C19425q c19425q = this.f125336j;
        if (c19425q == null || (c19424p = c19425q.f96376a) == null || c19424p.f96370a != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public final void m135892u(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f125333g = str;
    }

    /* renamed from: v */
    public final void m135893v(a aVar) {
        AbstractC19074t.m100208f(aVar, "<set-?>");
        this.f125334h = aVar;
    }

    /* renamed from: w */
    public final void m135894w(long j11) {
        this.f125331e = j11;
    }

    /* renamed from: x */
    public final void m135895x(byte b11) {
        this.f125334h.m135902e(b11);
    }

    /* renamed from: y */
    public final void m135896y(ArrayList arrayList) {
        this.f125334h.m135903f(arrayList);
    }

    /* renamed from: z */
    public final void m135897z(long j11) {
        this.f125330d = j11;
    }

    public /* synthetic */ C26376h(long j11, long j12, boolean z11, long j13, long j14, ArrayList arrayList, String str, a aVar, int i11, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? -1L : j11, (i12 & 2) != 0 ? 0L : j12, (i12 & 4) != 0 ? true : z11, (i12 & 8) != 0 ? 0L : j13, (i12 & 16) == 0 ? j14 : 0L, (i12 & 32) != 0 ? AbstractC25368s.m131500h("RRULE:FREQ=DAILY") : arrayList, (i12 & 64) != 0 ? "" : str, (i12 & 128) != 0 ? new a((byte) 0, null, 3, null) : aVar, (i12 & 256) == 0 ? i11 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C26376h(JSONObject jSONObject) {
        this(r3, r5, r7, r8, r10, r13, r1, r14, jSONObject.optInt("promoteId", r15));
        ArrayList arrayList;
        int i11;
        a aVar;
        AbstractC19074t.m100208f(jSONObject, "json");
        long optLong = jSONObject.optLong("id");
        long optLong2 = jSONObject.optLong("weight");
        boolean optBoolean = jSONObject.optBoolean("enable");
        long optLong3 = jSONObject.optLong("startTime");
        long optLong4 = jSONObject.optLong("endTime");
        JSONArray optJSONArray = jSONObject.optJSONArray("recurrence");
        if (optJSONArray != null) {
            arrayList = new ArrayList();
            int length = optJSONArray.length();
            if (length >= 0) {
                int i12 = 0;
                while (true) {
                    arrayList.add(optJSONArray.optString(i12));
                    if (i12 == length) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        } else {
            arrayList = null;
        }
        String optString = jSONObject.optString("content");
        AbstractC19074t.m100207e(optString, "optString(...)");
        JSONObject optJSONObject = jSONObject.optJSONObject("customScope");
        if (optJSONObject != null) {
            aVar = new a(optJSONObject);
            i11 = 0;
        } else {
            i11 = 0;
            aVar = new a((byte) 0, null, 3, null);
        }
    }
}
