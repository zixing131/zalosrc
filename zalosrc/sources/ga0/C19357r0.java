package ga0;

import ae.C0766k;
import android.text.SpannableStringBuilder;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import pm0.C24848g0;
import qe0.AbstractC25251g;
import qm0.AbstractC25356m;
import qm0.AbstractC25376w;
import sm0.AbstractC26327c;

/* renamed from: ga0.r0 */
/* loaded from: classes6.dex */
public final class C19357r0 {

    /* renamed from: a */
    public static final C19357r0 f96152a = new C19357r0();

    /* renamed from: b */
    private static final a[] f96153b = new a[5];

    /* renamed from: ga0.r0$a */
    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a */
        private final List f96154a;

        /* renamed from: b */
        private final long f96155b;

        /* renamed from: c */
        private final long f96156c;

        public a(List list, long j11, long j12) {
            AbstractC19074t.m100208f(list, "data");
            this.f96154a = list;
            this.f96155b = j11;
            this.f96156c = j12;
        }

        /* renamed from: a */
        public final List m101451a() {
            return this.f96154a;
        }

        /* renamed from: b */
        public final long m101452b() {
            return this.f96156c;
        }

        /* renamed from: c */
        public final long m101453c() {
            return this.f96155b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ga0.r0$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ int f96157q;

        /* renamed from: r */
        final /* synthetic */ InterfaceC18505l f96158r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11, InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f96157q = i11;
            this.f96158r = interfaceC18505l;
        }

        /* renamed from: a */
        public final void m101454a(a aVar) {
            AbstractC19074t.m100208f(aVar, "it");
            C19357r0.f96153b[this.f96157q] = aVar;
            this.f96158r.mo205i9(aVar.m101451a());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m101454a((a) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ga0.r0$c */
    /* loaded from: classes6.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C0766k f96159a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC18505l f96160b;

        public c(C0766k c0766k, InterfaceC18505l interfaceC18505l) {
            this.f96159a = c0766k;
            this.f96160b = interfaceC18505l;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C24848g0 c24848g0;
            C19357r0 c19357r0 = C19357r0.f96152a;
            a m101449h = c19357r0.m101449h(obj);
            if (m101449h != null) {
                this.f96160b.mo205i9(m101449h);
                c24848g0 = C24848g0.f119245a;
            } else {
                c24848g0 = null;
            }
            if (c24848g0 == null) {
                this.f96160b.mo205i9(c19357r0.m101446e());
            }
        }
    }

    /* renamed from: ga0.r0$d */
    /* loaded from: classes6.dex */
    public static final class d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18505l f96161a;

        public d(InterfaceC18505l interfaceC18505l) {
            this.f96161a = interfaceC18505l;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            this.f96161a.mo205i9(C19357r0.f96152a.m101446e());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
        }
    }

    /* renamed from: ga0.r0$e */
    /* loaded from: classes6.dex */
    public static final class e implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Integer.valueOf(((ContactProfile) obj).f42353K1), Integer.valueOf(((ContactProfile) obj2).f42353K1));
            return m135478b;
        }
    }

    private C19357r0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final a m101446e() {
        return new a(new ArrayList(), 0L, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m101447f(int i11, InterfaceC18505l interfaceC18505l) {
        int i12;
        long m101452b;
        long currentTimeMillis;
        long j11;
        AbstractC19074t.m100208f(interfaceC18505l, "action");
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    i12 = -1;
                } else {
                    i12 = 4;
                }
            } else {
                i12 = 3;
            }
        } else {
            i12 = 1;
        }
        if (i12 == -1) {
            interfaceC18505l.mo205i9(new ArrayList());
            return;
        }
        a aVar = f96153b[i11];
        if (aVar != null) {
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3 && i11 != 4) {
                    j11 = 0;
                    if (j11 > 0) {
                        interfaceC18505l.mo205i9(aVar.m101451a());
                        return;
                    }
                } else {
                    m101452b = aVar.m101453c();
                    currentTimeMillis = System.currentTimeMillis();
                }
            } else {
                m101452b = aVar.m101452b();
                currentTimeMillis = System.currentTimeMillis();
            }
            j11 = m101452b - currentTimeMillis;
            if (j11 > 0) {
            }
        }
        f96152a.m101448g(i12, new b(i11, interfaceC18505l));
    }

    /* renamed from: g */
    private final void m101448g(int i11, InterfaceC18505l interfaceC18505l) {
        C0766k c0766k = new C0766k();
        AbstractC25251g.m130681a(c0766k, new c(c0766k, interfaceC18505l));
        AbstractC25251g.m130681a(c0766k, new d(interfaceC18505l));
        c0766k.mo1637f8(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* renamed from: h */
    public final a m101449h(Object obj) {
        JSONObject jSONObject;
        JSONObject optJSONObject;
        JSONArray jSONArray;
        int i11;
        int i12;
        int i13;
        String str;
        if (obj instanceof JSONObject) {
            jSONObject = (JSONObject) obj;
        } else {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        int i14 = -1;
        if (jSONObject.optInt("error_code", -1) != 0 || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
            return null;
        }
        long j11 = 1000;
        long currentTimeMillis = System.currentTimeMillis() + (optJSONObject.optInt("search_expired_time", 15) * j11);
        long currentTimeMillis2 = System.currentTimeMillis() + (j11 * optJSONObject.optInt("media_expired_time", 15));
        JSONArray optJSONArray = optJSONObject.optJSONArray("ads");
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        int i15 = 0;
        while (i15 < length) {
            try {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i15);
                int i16 = optJSONObject2.getInt("pos") - 1;
                JSONObject jSONObject2 = optJSONObject2.getJSONObject("item");
                String optString = jSONObject2.optString("oaid");
                String optString2 = jSONObject2.optString("avatar");
                String optString3 = jSONObject2.optString("displayName");
                int optInt = jSONObject2.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                String optString4 = jSONObject2.optString("desc");
                JSONObject optJSONObject3 = jSONObject2.optJSONObject("track_ads");
                if (optJSONObject3 != null) {
                    i12 = optJSONObject3.optInt("campid", i14);
                } else {
                    i12 = -1;
                }
                if (optJSONObject3 != null) {
                    jSONArray = optJSONArray;
                    try {
                        i13 = optJSONObject3.optInt("srcidx", 0);
                    } catch (Exception e11) {
                        e = e11;
                        i11 = length;
                        e.printStackTrace();
                        i15++;
                        optJSONArray = jSONArray;
                        length = i11;
                        i14 = -1;
                    }
                } else {
                    jSONArray = optJSONArray;
                    i13 = 0;
                }
                String str2 = "";
                if (optJSONObject3 != null) {
                    i11 = length;
                    try {
                        str = optJSONObject3.optString("distribute_id", "");
                    } catch (Exception e12) {
                        e = e12;
                        e.printStackTrace();
                        i15++;
                        optJSONArray = jSONArray;
                        length = i11;
                        i14 = -1;
                    }
                } else {
                    i11 = length;
                    str = null;
                }
                if (str != null) {
                    str2 = str;
                }
                ContactProfile contactProfile = new ContactProfile();
                contactProfile.f42434r = optString;
                contactProfile.f42437s = optString3;
                contactProfile.f42446v = optString2;
                contactProfile.f42352K0 = optInt;
                contactProfile.f42436r1 = new SpannableStringBuilder(optString4);
                contactProfile.f42353K1 = i16;
                contactProfile.f42350J1 = i12;
                contactProfile.f42376S0 = i13;
                contactProfile.f42422m0 = str2;
                contactProfile.f42370Q0 = true;
                arrayList.add(contactProfile);
            } catch (Exception e13) {
                e = e13;
                jSONArray = optJSONArray;
            }
            i15++;
            optJSONArray = jSONArray;
            length = i11;
            i14 = -1;
        }
        if (arrayList.size() > 1) {
            AbstractC25376w.m131534w(arrayList, new e());
        }
        return new a(arrayList, currentTimeMillis, currentTimeMillis2);
    }

    /* renamed from: d */
    public final void m101450d() {
        a[] aVarArr = f96153b;
        synchronized (aVarArr) {
            AbstractC25356m.m131331n(aVarArr, null, 0, 0, 6, null);
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }
}
