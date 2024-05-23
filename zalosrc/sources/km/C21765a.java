package km;

import ag0.C0815e1;
import am.AbstractC0924m0;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fk.C18987a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.C19669z;
import hu.C20128b;
import i30.C20222a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jm.AbstractC21289a;
import k30.C21459a;
import me0.AbstractC23138m0;
import me0.AbstractC23179p8;
import me0.C23055e5;
import mm0.AbstractC23350e;
import nh0.InterfaceC23792b;
import org.json.JSONObject;
import p019aj.C0876j;
import p133ek.AbstractC18459b;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23306f;
import p405ov.C24561c;
import p461qu.AbstractC25495a;
import p620wt.AbstractC29231f;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25370t;

/* renamed from: km.a */
/* loaded from: classes3.dex */
public final class C21765a {

    /* renamed from: a */
    public static final C21765a f105662a = new C21765a();

    /* renamed from: b */
    private static final InterfaceC24854k f105663b;

    /* renamed from: c */
    private static final InterfaceC24854k f105664c;

    /* renamed from: d */
    private static final InterfaceC24854k f105665d;

    /* renamed from: e */
    private static final InterfaceC24854k f105666e;

    /* renamed from: f */
    private static final InterfaceC24854k f105667f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: km.a$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final long f105668a;

        /* renamed from: b */
        private final List f105669b;

        /* renamed from: c */
        private final List f105670c;

        /* renamed from: d */
        private final List f105671d;

        /* renamed from: e */
        private final List f105672e;

        /* renamed from: f */
        private final List f105673f;

        /* renamed from: g */
        private final List f105674g;

        /* renamed from: h */
        private final List f105675h;

        /* renamed from: i */
        private final List f105676i;

        public a(long j11, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8) {
            AbstractC19074t.m100208f(list, "singleMsgCounts");
            AbstractC19074t.m100208f(list2, "singleStorageCounts");
            AbstractC19074t.m100208f(list3, "groupMsgCounts");
            AbstractC19074t.m100208f(list4, "groupStorageCounts");
            AbstractC19074t.m100208f(list5, "oaMsgCounts");
            AbstractC19074t.m100208f(list6, "oaStorageCounts");
            AbstractC19074t.m100208f(list7, "myCloudMsgCounts");
            AbstractC19074t.m100208f(list8, "myCloudStorageCounts");
            this.f105668a = j11;
            this.f105669b = list;
            this.f105670c = list2;
            this.f105671d = list3;
            this.f105672e = list4;
            this.f105673f = list5;
            this.f105674g = list6;
            this.f105675h = list7;
            this.f105676i = list8;
        }

        /* renamed from: a */
        public final String m112276a() {
            int m131511r;
            int m131511r2;
            int m131511r3;
            int m131511r4;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("time_load", this.f105668a);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("1-1", this.f105669b);
                jSONObject2.put("group", this.f105671d);
                jSONObject2.put("OA", this.f105673f);
                jSONObject2.put("my_cloud", this.f105675h);
                C24848g0 c24848g0 = C24848g0.f119245a;
                jSONObject.put("msg", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                List list = this.f105670c;
                m131511r = AbstractC25370t.m131511r(list, 10);
                ArrayList arrayList = new ArrayList(m131511r);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(C21459a.m111035c(((Number) it.next()).longValue())));
                }
                jSONObject3.put("1-1", arrayList);
                List list2 = this.f105672e;
                m131511r2 = AbstractC25370t.m131511r(list2, 10);
                ArrayList arrayList2 = new ArrayList(m131511r2);
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Double.valueOf(C21459a.m111035c(((Number) it2.next()).longValue())));
                }
                jSONObject3.put("group", arrayList2);
                List list3 = this.f105674g;
                m131511r3 = AbstractC25370t.m131511r(list3, 10);
                ArrayList arrayList3 = new ArrayList(m131511r3);
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(Double.valueOf(C21459a.m111035c(((Number) it3.next()).longValue())));
                }
                jSONObject3.put("OA", arrayList3);
                List list4 = this.f105676i;
                m131511r4 = AbstractC25370t.m131511r(list4, 10);
                ArrayList arrayList4 = new ArrayList(m131511r4);
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(Double.valueOf(C21459a.m111035c(((Number) it4.next()).longValue())));
                }
                jSONObject3.put("my_cloud", arrayList4);
                C24848g0 c24848g02 = C24848g0.f119245a;
                jSONObject.put("storage", jSONObject3);
                String jSONObject4 = jSONObject.toString();
                AbstractC19074t.m100207e(jSONObject4, "toString(...)");
                return jSONObject4;
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DeviceLog", e11);
                return "";
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f105668a == aVar.f105668a && AbstractC19074t.m100204b(this.f105669b, aVar.f105669b) && AbstractC19074t.m100204b(this.f105670c, aVar.f105670c) && AbstractC19074t.m100204b(this.f105671d, aVar.f105671d) && AbstractC19074t.m100204b(this.f105672e, aVar.f105672e) && AbstractC19074t.m100204b(this.f105673f, aVar.f105673f) && AbstractC19074t.m100204b(this.f105674g, aVar.f105674g) && AbstractC19074t.m100204b(this.f105675h, aVar.f105675h) && AbstractC19074t.m100204b(this.f105676i, aVar.f105676i);
        }

        public int hashCode() {
            return (((((((((((((((AbstractC2147g0.m11521a(this.f105668a) * 31) + this.f105669b.hashCode()) * 31) + this.f105670c.hashCode()) * 31) + this.f105671d.hashCode()) * 31) + this.f105672e.hashCode()) * 31) + this.f105673f.hashCode()) * 31) + this.f105674g.hashCode()) * 31) + this.f105675h.hashCode()) * 31) + this.f105676i.hashCode();
        }

        public String toString() {
            return "BigSmallThreadInfo(execTime=" + this.f105668a + ", singleMsgCounts=" + this.f105669b + ", singleStorageCounts=" + this.f105670c + ", groupMsgCounts=" + this.f105671d + ", groupStorageCounts=" + this.f105672e + ", oaMsgCounts=" + this.f105673f + ", oaStorageCounts=" + this.f105674g + ", myCloudMsgCounts=" + this.f105675h + ", myCloudStorageCounts=" + this.f105676i + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: km.a$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final long f105677a;

        /* renamed from: b */
        private final double f105678b;

        /* renamed from: c */
        private final double f105679c;

        /* renamed from: d */
        private final double f105680d;

        /* renamed from: e */
        private final double f105681e;

        /* renamed from: f */
        private final String f105682f;

        /* renamed from: g */
        private final String f105683g;

        /* renamed from: h */
        private final String f105684h;

        /* renamed from: i */
        private final double f105685i;

        public b(long j11, double d11, double d12, double d13, double d14, String str, String str2, String str3, double d15) {
            AbstractC19074t.m100208f(str, "model");
            AbstractC19074t.m100208f(str2, "manufacture");
            AbstractC19074t.m100208f(str3, "osVersion");
            this.f105677a = j11;
            this.f105678b = d11;
            this.f105679c = d12;
            this.f105680d = d13;
            this.f105681e = d14;
            this.f105682f = str;
            this.f105683g = str2;
            this.f105684h = str3;
            this.f105685i = d15;
        }

        /* renamed from: a */
        public final String m112277a() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time_load", this.f105677a);
            jSONObject.put("device_storage", this.f105678b);
            jSONObject.put("free_storage", this.f105679c);
            jSONObject.put("zalo_size", this.f105680d);
            jSONObject.put("total_memory", this.f105681e);
            jSONObject.put("model_code", this.f105682f);
            jSONObject.put("manufacture", this.f105683g);
            jSONObject.put("os_version", this.f105684h);
            jSONObject.put("cache_size", this.f105685i);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            return jSONObject2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f105677a == bVar.f105677a && Double.compare(this.f105678b, bVar.f105678b) == 0 && Double.compare(this.f105679c, bVar.f105679c) == 0 && Double.compare(this.f105680d, bVar.f105680d) == 0 && Double.compare(this.f105681e, bVar.f105681e) == 0 && AbstractC19074t.m100204b(this.f105682f, bVar.f105682f) && AbstractC19074t.m100204b(this.f105683g, bVar.f105683g) && AbstractC19074t.m100204b(this.f105684h, bVar.f105684h) && Double.compare(this.f105685i, bVar.f105685i) == 0;
        }

        public int hashCode() {
            return (((((((((((((((AbstractC2147g0.m11521a(this.f105677a) * 31) + AbstractC18459b.m97786a(this.f105678b)) * 31) + AbstractC18459b.m97786a(this.f105679c)) * 31) + AbstractC18459b.m97786a(this.f105680d)) * 31) + AbstractC18459b.m97786a(this.f105681e)) * 31) + this.f105682f.hashCode()) * 31) + this.f105683g.hashCode()) * 31) + this.f105684h.hashCode()) * 31) + AbstractC18459b.m97786a(this.f105685i);
        }

        public String toString() {
            return "DeviceStorageInfo(executionTime=" + this.f105677a + ", deviceStorage=" + this.f105678b + ", freeStorage=" + this.f105679c + ", zaloSize=" + this.f105680d + ", totalMemory=" + this.f105681e + ", model=" + this.f105682f + ", manufacture=" + this.f105683g + ", osVersion=" + this.f105684h + ", cacheSize=" + this.f105685i + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: km.a$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        private final long f105686a;

        /* renamed from: b */
        private final int f105687b;

        /* renamed from: c */
        private final Map f105688c;

        /* renamed from: d */
        private final int f105689d;

        /* renamed from: e */
        private final Map f105690e;

        public c(long j11, int i11, Map map, int i12, Map map2) {
            AbstractC19074t.m100208f(map, "orphanStorageCounts");
            AbstractC19074t.m100208f(map2, "switchStorageCount");
            this.f105686a = j11;
            this.f105687b = i11;
            this.f105688c = map;
            this.f105689d = i12;
            this.f105690e = map2;
        }

        /* renamed from: a */
        public final String m112278a() {
            int m131511r;
            int m131511r2;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("time_load", this.f105686a);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("account_num", this.f105687b);
                Collection values = this.f105688c.values();
                m131511r = AbstractC25370t.m131511r(values, 10);
                ArrayList arrayList = new ArrayList(m131511r);
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(C21459a.m111035c(((Number) it.next()).longValue())));
                }
                jSONObject2.put("account_size", arrayList);
                C24848g0 c24848g0 = C24848g0.f119245a;
                jSONObject.put("orphan", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("account_num", this.f105689d);
                Collection values2 = this.f105690e.values();
                m131511r2 = AbstractC25370t.m131511r(values2, 10);
                ArrayList arrayList2 = new ArrayList(m131511r2);
                Iterator it2 = values2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Double.valueOf(C21459a.m111035c(((Number) it2.next()).longValue())));
                }
                jSONObject3.put("account_size", arrayList2);
                C24848g0 c24848g02 = C24848g0.f119245a;
                jSONObject.put("switch", jSONObject3);
                String jSONObject4 = jSONObject.toString();
                AbstractC19074t.m100205c(jSONObject4);
                return jSONObject4;
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DeviceLog", e11);
                return "";
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f105686a == cVar.f105686a && this.f105687b == cVar.f105687b && AbstractC19074t.m100204b(this.f105688c, cVar.f105688c) && this.f105689d == cVar.f105689d && AbstractC19074t.m100204b(this.f105690e, cVar.f105690e);
        }

        public int hashCode() {
            return (((((((AbstractC2147g0.m11521a(this.f105686a) * 31) + this.f105687b) * 31) + this.f105688c.hashCode()) * 31) + this.f105689d) * 31) + this.f105690e.hashCode();
        }

        public String toString() {
            return "OtherAccountInfo(executionTime=" + this.f105686a + ", orphanCount=" + this.f105687b + ", orphanStorageCounts=" + this.f105688c + ", switchCount=" + this.f105689d + ", switchStorageCount=" + this.f105690e + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: km.a$d */
    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a */
        private final long f105691a;

        /* renamed from: b */
        private final long f105692b;

        /* renamed from: c */
        private final a f105693c;

        /* renamed from: d */
        private final a f105694d;

        /* renamed from: e */
        private final a f105695e;

        /* renamed from: f */
        private final a f105696f;

        /* renamed from: km.a$d$a */
        /* loaded from: classes3.dex */
        public static final class a {

            /* renamed from: a */
            private int f105697a;

            /* renamed from: b */
            private long f105698b;

            /* renamed from: c */
            private int f105699c;

            /* renamed from: d */
            private long f105700d;

            /* renamed from: e */
            private int f105701e;

            /* renamed from: f */
            private int f105702f;

            /* renamed from: g */
            private long f105703g;

            /* renamed from: h */
            private int f105704h;

            /* renamed from: i */
            private int f105705i;

            /* renamed from: j */
            private long f105706j;

            /* renamed from: k */
            private int f105707k;

            /* renamed from: l */
            private int f105708l;

            /* renamed from: m */
            private long f105709m;

            /* renamed from: n */
            private int f105710n;

            /* renamed from: o */
            private int f105711o;

            /* renamed from: p */
            private long f105712p;

            public a(int i11, long j11, int i12, long j12, int i13, int i14, long j13, int i15, int i16, long j14, int i17, int i18, long j15, int i19, int i21, long j16) {
                this.f105697a = i11;
                this.f105698b = j11;
                this.f105699c = i12;
                this.f105700d = j12;
                this.f105701e = i13;
                this.f105702f = i14;
                this.f105703g = j13;
                this.f105704h = i15;
                this.f105705i = i16;
                this.f105706j = j14;
                this.f105707k = i17;
                this.f105708l = i18;
                this.f105709m = j15;
                this.f105710n = i19;
                this.f105711o = i21;
                this.f105712p = j16;
            }

            /* renamed from: a */
            public final void m112281a(int i11, C18987a c18987a) {
                if (c18987a == null) {
                    return;
                }
                this.f105697a++;
                this.f105698b += c18987a.m99677l();
                this.f105699c += i11;
                this.f105700d += c18987a.m99666a();
                this.f105701e += c18987a.m99673h();
                this.f105702f += c18987a.m99674i();
                this.f105703g += c18987a.m99675j();
                this.f105704h += c18987a.m99679n();
                this.f105705i += c18987a.m99680o();
                this.f105706j += c18987a.m99681p();
                this.f105707k += c18987a.m99682q();
                this.f105708l += c18987a.m99683r();
                this.f105709m += c18987a.m99684s();
                this.f105710n += c18987a.m99667b();
                this.f105711o += c18987a.m99668c();
                this.f105712p += c18987a.m99669d();
            }

            /* renamed from: b */
            public final long m112282b() {
                return this.f105698b;
            }

            /* renamed from: c */
            public final int m112283c() {
                return (((this.f105699c - this.f105701e) - this.f105704h) - this.f105707k) - this.f105710n;
            }

            /* renamed from: d */
            public final JSONObject m112284d() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    AbstractC29231f.m145988f(jSONObject, "t_thread", this.f105697a);
                    AbstractC29231f.m145988f(jSONObject, "t_photo", this.f105701e);
                    AbstractC29231f.m145988f(jSONObject, "t_video", this.f105704h);
                    AbstractC29231f.m145988f(jSONObject, "t_voice", this.f105707k);
                    AbstractC29231f.m145988f(jSONObject, "t_file", this.f105710n);
                    AbstractC29231f.m145988f(jSONObject, "t_others", m112283c());
                    AbstractC29231f.m145988f(jSONObject, "td_photo", this.f105702f);
                    AbstractC29231f.m145988f(jSONObject, "td_video", this.f105705i);
                    AbstractC29231f.m145988f(jSONObject, "td_voice", this.f105708l);
                    AbstractC29231f.m145988f(jSONObject, "td_file", this.f105711o);
                    AbstractC29231f.m145987e(jSONObject, "sz_db", C21459a.m111035c(this.f105700d));
                    AbstractC29231f.m145987e(jSONObject, "sz_photo", C21459a.m111035c(this.f105703g));
                    AbstractC29231f.m145987e(jSONObject, "sz_video", C21459a.m111035c(this.f105706j));
                    AbstractC29231f.m145987e(jSONObject, "sz_voice", C21459a.m111035c(this.f105709m));
                    AbstractC29231f.m145987e(jSONObject, "sz_file", C21459a.m111035c(this.f105712p));
                    return jSONObject;
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("DeviceLog", e11);
                    return new JSONObject();
                }
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f105697a == aVar.f105697a && this.f105698b == aVar.f105698b && this.f105699c == aVar.f105699c && this.f105700d == aVar.f105700d && this.f105701e == aVar.f105701e && this.f105702f == aVar.f105702f && this.f105703g == aVar.f105703g && this.f105704h == aVar.f105704h && this.f105705i == aVar.f105705i && this.f105706j == aVar.f105706j && this.f105707k == aVar.f105707k && this.f105708l == aVar.f105708l && this.f105709m == aVar.f105709m && this.f105710n == aVar.f105710n && this.f105711o == aVar.f105711o && this.f105712p == aVar.f105712p;
            }

            public int hashCode() {
                return (((((((((((((((((((((((((((((this.f105697a * 31) + AbstractC2147g0.m11521a(this.f105698b)) * 31) + this.f105699c) * 31) + AbstractC2147g0.m11521a(this.f105700d)) * 31) + this.f105701e) * 31) + this.f105702f) * 31) + AbstractC2147g0.m11521a(this.f105703g)) * 31) + this.f105704h) * 31) + this.f105705i) * 31) + AbstractC2147g0.m11521a(this.f105706j)) * 31) + this.f105707k) * 31) + this.f105708l) * 31) + AbstractC2147g0.m11521a(this.f105709m)) * 31) + this.f105710n) * 31) + this.f105711o) * 31) + AbstractC2147g0.m11521a(this.f105712p);
            }

            public String toString() {
                return "Detail(totalConversationCount=" + this.f105697a + ", totalConversationSize=" + this.f105698b + ", totalMsgCount=" + this.f105699c + ", textMsgSize=" + this.f105700d + ", photoMsgCount=" + this.f105701e + ", photoResCount=" + this.f105702f + ", photoResSize=" + this.f105703g + ", videoMsgCount=" + this.f105704h + ", videoResCount=" + this.f105705i + ", videoResSize=" + this.f105706j + ", voiceMsgCount=" + this.f105707k + ", voiceResCount=" + this.f105708l + ", voiceResSize=" + this.f105709m + ", fileMsgCount=" + this.f105710n + ", fileResCount=" + this.f105711o + ", fileResSize=" + this.f105712p + ")";
            }

            public /* synthetic */ a(int i11, long j11, int i12, long j12, int i13, int i14, long j13, int i15, int i16, long j14, int i17, int i18, long j15, int i19, int i21, long j16, int i22, AbstractC19060k abstractC19060k) {
                this((i22 & 1) != 0 ? 0 : i11, (i22 & 2) != 0 ? 0L : j11, (i22 & 4) != 0 ? 0 : i12, (i22 & 8) != 0 ? 0L : j12, (i22 & 16) != 0 ? 0 : i13, (i22 & 32) != 0 ? 0 : i14, (i22 & 64) != 0 ? 0L : j13, (i22 & 128) != 0 ? 0 : i15, (i22 & 256) != 0 ? 0 : i16, (i22 & 512) != 0 ? 0L : j14, (i22 & 1024) != 0 ? 0 : i17, (i22 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? 0 : i18, (i22 & 4096) != 0 ? 0L : j15, (i22 & 8192) != 0 ? 0 : i19, (i22 & 16384) != 0 ? 0 : i21, (i22 & 32768) != 0 ? 0L : j16);
            }
        }

        public d(long j11, long j12, a aVar, a aVar2, a aVar3, a aVar4) {
            AbstractC19074t.m100208f(aVar, "singleDetail");
            AbstractC19074t.m100208f(aVar2, "groupDetail");
            AbstractC19074t.m100208f(aVar3, "oaDetail");
            AbstractC19074t.m100208f(aVar4, "myCloudDetail");
            this.f105691a = j11;
            this.f105692b = j12;
            this.f105693c = aVar;
            this.f105694d = aVar2;
            this.f105695e = aVar3;
            this.f105696f = aVar4;
        }

        /* renamed from: a */
        public final double m112279a() {
            return C21459a.m111035c(this.f105693c.m112282b() + this.f105694d.m112282b() + this.f105695e.m112282b() + this.f105696f.m112282b());
        }

        /* renamed from: b */
        public final String m112280b() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("time_load", this.f105691a);
                jSONObject.put("conversation_size", m112279a());
                jSONObject.put("cache_size", C21459a.m111035c(this.f105692b));
                jSONObject.put("1-1", this.f105693c.m112284d());
                jSONObject.put("group", this.f105694d.m112284d());
                jSONObject.put("OA", this.f105695e.m112284d());
                jSONObject.put("my_cloud", this.f105696f.m112284d());
                String jSONObject2 = jSONObject.toString();
                AbstractC19074t.m100205c(jSONObject2);
                return jSONObject2;
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DeviceLog", e11);
                return "";
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f105691a == dVar.f105691a && this.f105692b == dVar.f105692b && AbstractC19074t.m100204b(this.f105693c, dVar.f105693c) && AbstractC19074t.m100204b(this.f105694d, dVar.f105694d) && AbstractC19074t.m100204b(this.f105695e, dVar.f105695e) && AbstractC19074t.m100204b(this.f105696f, dVar.f105696f);
        }

        public int hashCode() {
            return (((((((((AbstractC2147g0.m11521a(this.f105691a) * 31) + AbstractC2147g0.m11521a(this.f105692b)) * 31) + this.f105693c.hashCode()) * 31) + this.f105694d.hashCode()) * 31) + this.f105695e.hashCode()) * 31) + this.f105696f.hashCode();
        }

        public String toString() {
            return "UserStorageInfo(execTime=" + this.f105691a + ", totalCacheSize=" + this.f105692b + ", singleDetail=" + this.f105693c + ", groupDetail=" + this.f105694d + ", oaDetail=" + this.f105695e + ", myCloudDetail=" + this.f105696f + ")";
        }
    }

    /* renamed from: km.a$e */
    /* loaded from: classes3.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f105713q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C20222a mo12V4() {
            return AbstractC23306f.m120586I();
        }
    }

    /* renamed from: km.a$f */
    /* loaded from: classes3.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final f f105714q = new f();

        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C19669z mo12V4() {
            return AbstractC23306f.m120572D0();
        }
    }

    /* renamed from: km.a$g */
    /* loaded from: classes3.dex */
    static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final g f105715q = new g();

        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0876j mo12V4() {
            return AbstractC23306f.m120584H0();
        }
    }

    /* renamed from: km.a$h */
    /* loaded from: classes3.dex */
    static final class h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final h f105716q = new h();

        h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC23792b mo12V4() {
            return AbstractC23306f.m120579F1();
        }
    }

    /* renamed from: km.a$i */
    /* loaded from: classes3.dex */
    static final class i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final i f105717q = new i();

        i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0815e1 mo12V4() {
            return C0815e1.m2075D();
        }
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        m129210a = AbstractC24856m.m129210a(h.f105716q);
        f105663b = m129210a;
        m129210a2 = AbstractC24856m.m129210a(i.f105717q);
        f105664c = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(e.f105713q);
        f105665d = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(f.f105714q);
        f105666e = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(g.f105715q);
        f105667f = m129210a5;
    }

    private C21765a() {
    }

    /* renamed from: a */
    private final a m112257a(int i11) {
        List m131179G0;
        long j11;
        m112267k().m103229t0();
        m131179G0 = AbstractC25332a0.m131179G0(m112267k().m103200Q(), i11);
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        Iterator it = m131179G0.iterator();
        while (it.hasNext()) {
            Conversation conversation = (Conversation) it.next();
            String str = conversation.f42893q;
            C21765a c21765a = f105662a;
            Iterator it2 = it;
            List list = m131179G0;
            int m2633p = (int) c21765a.m112268l().m2633p(str);
            if (m2633p != 0) {
                C20222a m112266j = c21765a.m112266j();
                String str2 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str2, "currentUserUid");
                C18987a m105681f = m112266j.m105681f(str2, str);
                if (m105681f != null) {
                    j11 = m105681f.m99677l();
                } else {
                    j11 = 0;
                }
                if (AbstractC25495a.m132078c(str)) {
                    arrayList7.add(Integer.valueOf(m2633p));
                    arrayList8.add(Long.valueOf(j11));
                } else if (AbstractC21935u.m114518H(str)) {
                    arrayList5.add(Integer.valueOf(m2633p));
                    arrayList6.add(Long.valueOf(j11));
                } else if (conversation.m41013q()) {
                    arrayList3.add(Integer.valueOf(m2633p));
                    arrayList4.add(Long.valueOf(j11));
                } else {
                    arrayList.add(Integer.valueOf(m2633p));
                    arrayList2.add(Long.valueOf(j11));
                }
            }
            it = it2;
            m131179G0 = list;
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        C24561c.m127942b("DeviceLog", "calculateBigSmallThreadInfo(" + i11 + "): Calculated " + m131179G0.size() + " conversation(s) in " + currentTimeMillis2 + " ms");
        return new a(currentTimeMillis2, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8);
    }

    /* renamed from: b */
    private final b m112258b() {
        long currentTimeMillis = System.currentTimeMillis();
        return new b(System.currentTimeMillis() - currentTimeMillis, C21459a.m111035c(C20128b.m104766m()), C21459a.m111035c(C20128b.m104764k()), C21459a.m111035c(C20128b.m104778y()), C21459a.m111035c(C20128b.m104773t()), C20128b.m104768o(), C20128b.m104767n(), C20128b.m104771r(), C21459a.m111035c(C20128b.m104775v()));
    }

    /* renamed from: c */
    private final c m112259c() {
        int m131511r;
        long j11;
        long currentTimeMillis = System.currentTimeMillis();
        List<String> m41710I0 = C7959d.Companion.m41850e().m41710I0();
        List m119419e = AbstractC23179p8.m119419e();
        AbstractC19074t.m100207e(m119419e, "getListAccount(...)");
        List list = m119419e;
        m131511r = AbstractC25370t.m131511r(list, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ContactProfile) it.next()).mo2478b());
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (String str : m41710I0) {
            Iterator it2 = C7959d.Companion.m41850e().m41713J0(str).iterator();
            long j12 = 0;
            while (it2.hasNext()) {
                C18987a m105681f = f105662a.m112266j().m105681f(str, (String) it2.next());
                if (m105681f != null) {
                    j11 = m105681f.m99677l();
                } else {
                    j11 = 0;
                }
                j12 += j11;
            }
            if (arrayList.contains(str)) {
                hashMap2.put(str, Long.valueOf(j12));
            } else {
                hashMap.put(str, Long.valueOf(j12));
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        C24561c.m127942b("DeviceLog", "calculateOtherAccountInfo(): Calculated " + m41710I0.size() + " account(s) in " + currentTimeMillis2 + " ms");
        return new c(currentTimeMillis2, hashMap.size(), hashMap, hashMap2.size(), hashMap2);
    }

    /* renamed from: d */
    private final d m112260d() {
        List<Conversation> m131185M0;
        d.a aVar;
        m112267k().m103229t0();
        m131185M0 = AbstractC25332a0.m131185M0(m112267k().m103200Q());
        long currentTimeMillis = System.currentTimeMillis();
        d.a aVar2 = r15;
        d.a aVar3 = new d.a(0, 0L, 0, 0L, 0, 0, 0L, 0, 0, 0L, 0, 0, 0L, 0, 0, 0L, 65535, null);
        int i11 = 0;
        long j11 = 0;
        int i12 = 0;
        long j12 = 0;
        int i13 = 0;
        int i14 = 0;
        long j13 = 0;
        int i15 = 0;
        int i16 = 0;
        long j14 = 0;
        int i17 = 0;
        int i18 = 0;
        long j15 = 0;
        int i19 = 0;
        int i21 = 0;
        long j16 = 0;
        int i22 = 65535;
        AbstractC19060k abstractC19060k = null;
        d.a aVar4 = new d.a(i11, j11, i12, j12, i13, i14, j13, i15, i16, j14, i17, i18, j15, i19, i21, j16, i22, abstractC19060k);
        d.a aVar5 = new d.a(0, 0L, 0, 0L, 0, 0, 0L, 0, 0, 0L, 0, 0, 0L, 0, 0, 0L, 65535, null);
        d.a aVar6 = new d.a(i11, j11, i12, j12, i13, i14, j13, i15, i16, j14, i17, i18, j15, i19, i21, j16, i22, abstractC19060k);
        for (Conversation conversation : m131185M0) {
            String str = conversation.f42893q;
            C21765a c21765a = f105662a;
            int m2633p = (int) c21765a.m112268l().m2633p(str);
            if (m2633p != 0) {
                C20222a m112266j = c21765a.m112266j();
                String str2 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str2, "currentUserUid");
                C18987a m105681f = m112266j.m105681f(str2, str);
                if (AbstractC25495a.m132078c(str)) {
                    aVar6.m112281a(m2633p, m105681f);
                } else if (AbstractC21935u.m114518H(str)) {
                    aVar5.m112281a(m2633p, m105681f);
                } else if (conversation.m41013q()) {
                    aVar4.m112281a(m2633p, m105681f);
                } else {
                    aVar = aVar2;
                    aVar.m112281a(m2633p, m105681f);
                    aVar2 = aVar;
                }
            }
            aVar = aVar2;
            aVar2 = aVar;
        }
        long m104775v = C20128b.m104775v();
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        C24561c.m127942b("DeviceLog", "calculateUserStorageInfo(): Calculated " + m131185M0.size() + " conversation(s) in " + currentTimeMillis2 + " ms");
        return new d(currentTimeMillis2, m104775v, aVar2, aVar4, aVar5, aVar6);
    }

    /* renamed from: e */
    public static final void m112261e(int i11) {
        try {
            C21765a c21765a = f105662a;
            a m112257a = c21765a.m112257a(i11);
            c21765a.m112271o(m112257a);
            C24561c.m127942b("DeviceLog", "Submit log Big Small Thread: " + m112257a.m112276a());
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DeviceLog", e11);
        }
    }

    /* renamed from: f */
    public static final void m112262f() {
        try {
            C21765a c21765a = f105662a;
            long mo124314i = c21765a.m112269m().mo124314i();
            if (mo124314i - AbstractC0924m0.m3010E2() < 86400000) {
                return;
            }
            b m112258b = c21765a.m112258b();
            c21765a.m112272p(m112258b);
            C24561c.m127942b("DeviceLog", "Submit log Device Storage Info: " + m112258b.m112277a());
            AbstractC0924m0.m2969Cj(mo124314i);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DeviceLog", e11);
        }
    }

    /* renamed from: g */
    public static final void m112263g() {
        try {
            C21765a c21765a = f105662a;
            c m112259c = c21765a.m112259c();
            c21765a.m112273q(m112259c);
            C24561c.m127942b("DeviceLog", "Submit log Other Account Info: " + m112259c.m112278a());
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DeviceLog", e11);
        }
    }

    /* renamed from: h */
    public static final void m112264h() {
        AbstractC23138m0.a aVar = AbstractC23138m0.Companion;
        if (!aVar.m118777d() || !C23055e5.m118272g(false)) {
            return;
        }
        try {
            C21765a c21765a = f105662a;
            long mo124314i = c21765a.m112269m().mo124314i();
            if (mo124314i <= 0 || mo124314i - AbstractC0924m0.m3068G2() < 604800000) {
                return;
            }
            long m118776c = aVar.m118776c();
            if (m118776c <= 0) {
                return;
            }
            long j11 = mo124314i - m118776c;
            if (j11 < 604800000) {
                return;
            }
            long days = TimeUnit.MILLISECONDS.toDays(j11);
            AbstractC21289a.a aVar2 = AbstractC21289a.Companion;
            boolean m110249c = aVar2.m110249c();
            c21765a.m112274r(days, m110249c);
            if (m110249c) {
                aVar2.m110250d();
            }
            AbstractC0924m0.m3027Ej(mo124314i);
            C24561c.m127942b("DeviceLog", "Submit log Stable Device: [" + C20128b.m104768o() + "] isNewDevice=" + m110249c + ", stayInDays=" + days + ", currTime=" + mo124314i + ", loginTime=" + m118776c + ", stayTime=" + j11);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DeviceLog", e11);
        }
    }

    /* renamed from: i */
    public static final void m112265i() {
        try {
            C21765a c21765a = f105662a;
            d m112260d = c21765a.m112260d();
            c21765a.m112275s(m112260d);
            C24561c.m127942b("DeviceLog", "Submit log User Storage: " + m112260d.m112280b());
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DeviceLog", e11);
        }
    }

    /* renamed from: j */
    private final C20222a m112266j() {
        return (C20222a) f105665d.getValue();
    }

    /* renamed from: k */
    private final C19669z m112267k() {
        return (C19669z) f105666e.getValue();
    }

    /* renamed from: l */
    private final C0876j m112268l() {
        return (C0876j) f105667f.getValue();
    }

    /* renamed from: m */
    private final InterfaceC23792b m112269m() {
        return (InterfaceC23792b) f105663b.getValue();
    }

    /* renamed from: n */
    private final C0815e1 m112270n() {
        return (C0815e1) f105664c.getValue();
    }

    /* renamed from: o */
    private final void m112271o(a aVar) {
        C0815e1.m2075D().m2099U(3, 1, 22, "", "11", aVar.m112276a());
    }

    /* renamed from: p */
    private final void m112272p(b bVar) {
        C0815e1.m2075D().m2099U(3, 1, 22, "", "8", bVar.m112277a());
    }

    /* renamed from: q */
    private final void m112273q(c cVar) {
        C0815e1.m2075D().m2099U(3, 1, 22, "", "10", cVar.m112278a());
    }

    /* renamed from: r */
    private final void m112274r(long j11, boolean z11) {
        String str;
        C0815e1 m112270n = m112270n();
        String[] strArr = new String[3];
        strArr[0] = "";
        strArr[1] = String.valueOf(j11);
        if (z11) {
            str = "1";
        } else {
            str = "0";
        }
        strArr[2] = str;
        m112270n.m2099U(3, 1, 43, strArr);
    }

    /* renamed from: s */
    private final void m112275s(d dVar) {
        C0815e1.m2075D().m2099U(3, 1, 22, "", "9", dVar.m112280b());
    }
}
