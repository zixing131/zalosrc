package p716zh;

import ae.C0766k;
import ag0.C0824j;
import am.AbstractC0939u;
import android.text.TextUtils;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import gi.EnumC19449b;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p105dn.EnumC18030a;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p611wj.C29059g;

/* renamed from: zh.t6 */
/* loaded from: classes3.dex */
public class C32119t6 {

    /* renamed from: h */
    private static C32119t6 f148058h;

    /* renamed from: d */
    private boolean f148062d;

    /* renamed from: e */
    private boolean f148063e;

    /* renamed from: f */
    private boolean f148064f;

    /* renamed from: g */
    private boolean f148065g;

    /* renamed from: b */
    Map f148060b = Collections.synchronizedMap(new a(ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE, 0.75f, true));

    /* renamed from: a */
    private List f148059a = new ArrayList();

    /* renamed from: c */
    Map f148061c = Collections.synchronizedMap(new b(ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE));

    /* renamed from: zh.t6$a */
    /* loaded from: classes3.dex */
    class a extends LinkedHashMap {
        a(int i11, float f11, boolean z11) {
            super(i11, f11, z11);
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            if (size() > 500) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: zh.t6$b */
    /* loaded from: classes3.dex */
    class b extends LinkedHashMap {
        b(int i11) {
            super(i11);
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            if (size() > 500) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: zh.t6$c */
    /* loaded from: classes3.dex */
    class c extends AbstractC0939u {
        c() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42098Db();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zh.t6$d */
    /* loaded from: classes3.dex */
    public class d extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f148069a;

        /* renamed from: b */
        final /* synthetic */ String f148070b;

        /* renamed from: c */
        final /* synthetic */ f f148071c;

        /* renamed from: d */
        final /* synthetic */ C31887d9 f148072d;

        /* renamed from: e */
        final /* synthetic */ int f148073e;

        /* renamed from: f */
        final /* synthetic */ int f148074f;

        /* renamed from: g */
        final /* synthetic */ int f148075g;

        /* renamed from: h */
        final /* synthetic */ int f148076h;

        /* renamed from: i */
        final /* synthetic */ int f148077i;

        /* renamed from: j */
        final /* synthetic */ int f148078j;

        /* renamed from: k */
        final /* synthetic */ int f148079k;

        /* renamed from: l */
        final /* synthetic */ String f148080l;

        /* renamed from: zh.t6$d$a */
        /* loaded from: classes3.dex */
        class a implements InterfaceC20094a {
            a() {
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: a */
            public void mo926a(C20096c c20096c) {
                C31917f9 c31917f9;
                d dVar = d.this;
                if (C32119t6.this.m155017h(dVar.f148069a)) {
                    d dVar2 = d.this;
                    c31917f9 = (C31917f9) C32119t6.this.f148060b.get(dVar2.f148070b);
                } else {
                    c31917f9 = null;
                }
                if (c31917f9 != null && c31917f9.f146629a.size() > 0) {
                    d dVar3 = d.this;
                    dVar3.f148071c.mo64480a(0, dVar3.f148069a, c31917f9);
                } else {
                    d dVar4 = d.this;
                    dVar4.f148071c.mo64480a(-1, dVar4.f148069a, null);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0099 A[Catch: Exception -> 0x00fc, TryCatch #0 {Exception -> 0x00fc, blocks: (B:3:0x0006, B:5:0x003b, B:7:0x0041, B:8:0x004b, B:10:0x0051, B:12:0x0060, B:14:0x0066, B:15:0x0071, B:17:0x0077, B:19:0x0087, B:20:0x008d, B:22:0x0099, B:24:0x00c7, B:28:0x00d3, B:31:0x00f4, B:32:0x00fb), top: B:2:0x0006 }] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
            @Override // hm0.InterfaceC20094a
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void mo927b(Object obj) {
                List list;
                d dVar;
                int i11;
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    long j11 = jSONObject2.getLong("expired_time");
                    long currentTimeMillis = System.currentTimeMillis();
                    List m155010k = C32119t6.m155010k(jSONObject2.getJSONArray("content"));
                    EnumC19449b m101745c = EnumC19449b.m101745c(jSONObject2.optInt("layoutType", -1));
                    d dVar2 = d.this;
                    if (C32119t6.this.m155017h(dVar2.f148069a)) {
                        if (jSONObject2.has("trending_keyword")) {
                            JSONArray jSONArray = jSONObject2.getJSONArray("trending_keyword");
                            ArrayList arrayList = new ArrayList();
                            for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                                arrayList.add(new C29059g(jSONArray.getJSONObject(i12)));
                            }
                            if (arrayList.size() > 0) {
                                d dVar3 = d.this;
                                C32119t6.this.f148061c.put(dVar3.f148070b, arrayList);
                            }
                        }
                        if (m155010k.size() == 0) {
                            d dVar4 = d.this;
                            C31917f9 c31917f9 = (C31917f9) C32119t6.this.f148060b.get(dVar4.f148070b);
                            if (c31917f9 != null) {
                                list = c31917f9.f146629a;
                            } else {
                                list = null;
                            }
                            dVar = d.this;
                            if (C32119t6.this.m155018i(dVar.f148069a)) {
                                C7960e m41971c6 = C7960e.m41971c6();
                                String str = d.this.f148072d.m153213c() + d.this.f148069a;
                                String jSONObject3 = jSONObject.toString();
                                i11 = 0;
                                m41971c6.m42553u8(str, jSONObject3, currentTimeMillis, j11);
                            } else {
                                i11 = 0;
                            }
                            if (list == null && list.size() != 0 && j11 >= 0) {
                                C31917f9 c31917f92 = new C31917f9(list, m101745c, currentTimeMillis, j11);
                                d dVar5 = d.this;
                                C32119t6.this.f148060b.put(dVar5.f148070b, c31917f92);
                                d dVar6 = d.this;
                                dVar6.f148071c.mo64480a(i11, dVar6.f148069a, c31917f92);
                                return;
                            }
                            throw new IllegalStateException("Data is invalid");
                        }
                    }
                    list = m155010k;
                    dVar = d.this;
                    if (C32119t6.this.m155018i(dVar.f148069a)) {
                    }
                    if (list == null) {
                    }
                    throw new IllegalStateException("Data is invalid");
                } catch (Exception unused) {
                    d dVar7 = d.this;
                    dVar7.f148071c.mo64480a(-1, dVar7.f148069a, null);
                }
            }
        }

        d(String str, String str2, f fVar, C31887d9 c31887d9, int i11, int i12, int i13, int i14, int i15, int i16, int i17, String str3) {
            this.f148069a = str;
            this.f148070b = str2;
            this.f148071c = fVar;
            this.f148072d = c31887d9;
            this.f148073e = i11;
            this.f148074f = i12;
            this.f148075g = i13;
            this.f148076h = i14;
            this.f148077i = i15;
            this.f148078j = i16;
            this.f148079k = i17;
            this.f148080l = str3;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C31917f9 c31917f9;
            if (!C32119t6.this.m155018i(this.f148069a)) {
                c31917f9 = C7960e.m41971c6().m42551u6(this.f148070b);
            } else {
                c31917f9 = null;
            }
            if (c31917f9 != null && c31917f9.f146629a.size() > 0) {
                C32119t6.this.f148060b.put(this.f148070b, c31917f9);
                this.f148071c.mo64480a(0, this.f148069a, c31917f9);
            } else {
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new a());
                c0766k.mo1639fa(this.f148072d.m153214d(), this.f148069a, this.f148073e, this.f148074f, this.f148075g, this.f148076h, this.f148077i, this.f148078j, this.f148079k, this.f148080l);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zh.t6$e */
    /* loaded from: classes3.dex */
    public class e extends AbstractC0939u {
        e() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42287Ub();
        }
    }

    /* renamed from: zh.t6$f */
    /* loaded from: classes3.dex */
    public interface f {
        /* renamed from: a */
        void mo64480a(int i11, String str, C31917f9 c31917f9);
    }

    private C32119t6() {
    }

    /* renamed from: c */
    public static C32119t6 m155009c() {
        if (f148058h == null) {
            synchronized (C32119t6.class) {
                f148058h = new C32119t6();
            }
        }
        return f148058h;
    }

    /* renamed from: k */
    public static List m155010k(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                C31902e9 c31902e9 = new C31902e9(System.nanoTime() + i11, jSONArray.getJSONObject(i11));
                if (c31902e9.m153322n() != -1) {
                    arrayList.add(c31902e9);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void m155011a() {
        this.f148060b.clear();
        C0824j.m2153b(new c());
    }

    /* renamed from: b */
    public String m155012b(C31887d9 c31887d9, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(c31887d9.m153213c())) {
            str2 = c31887d9.m153213c();
        } else {
            str2 = "";
        }
        sb2.append(str2);
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        if (m155017h(str)) {
            sb2.append(i11);
            sb2.append("_");
            sb2.append(i12);
            sb2.append("_");
            sb2.append(i13);
            sb2.append("_");
            sb2.append(i14);
            sb2.append("_");
            sb2.append(i15);
            sb2.append("_");
            sb2.append(i16);
            sb2.append("_");
            sb2.append(i17);
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public List m155013d(EnumC18030a enumC18030a) {
        ArrayList arrayList;
        synchronized (this) {
            try {
                arrayList = new ArrayList();
                if (enumC18030a != EnumC18030a.SINGLE_USER && enumC18030a != EnumC18030a.SINGLE_PAGE) {
                    if (enumC18030a == EnumC18030a.GROUP) {
                        for (C31887d9 c31887d9 : this.f148059a) {
                            if (c31887d9.m153221k() != 0 && c31887d9.m153221k() != 2) {
                            }
                            arrayList.add(c31887d9);
                        }
                    }
                }
                for (C31887d9 c31887d92 : this.f148059a) {
                    if (c31887d92.m153221k() == 0 || c31887d92.m153221k() == 1) {
                        arrayList.add(c31887d92);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public C31887d9 m155014e(int i11) {
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        synchronized (this) {
            try {
                List list = this.f148059a;
                if (list != null && list.size() != 0) {
                    for (int i12 = 0; i12 < this.f148059a.size(); i12++) {
                        if (((C31887d9) this.f148059a.get(i12)).m153214d() == i11) {
                            return (C31887d9) this.f148059a.get(i12);
                        }
                    }
                    return null;
                }
                return null;
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:            if (r2 != false) goto L31;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [zh.t6$f] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m155015f(C31887d9 c31887d9, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, String str2, f fVar) {
        ?? r15;
        C32119t6 c32119t6 = this;
        try {
            try {
                if (!TextUtils.isEmpty(str)) {
                    String m155012b = m155012b(c31887d9, str, i11, i12, i13, i14, i15, i16, i17);
                    if (c32119t6.m155018i(str)) {
                        boolean z11 = true;
                        if (c31887d9.m153214d() == 1) {
                            z11 = true ^ c32119t6.f148062d;
                            c32119t6.f148062d = false;
                        }
                        if (c31887d9.m153214d() == 2) {
                            if (c32119t6.f148063e) {
                                z11 = false;
                            }
                            c32119t6.f148063e = false;
                        }
                        if (c31887d9.m153214d() == 0) {
                            if (c32119t6.f148064f) {
                                z11 = false;
                            }
                            c32119t6.f148064f = false;
                        }
                        if (c31887d9.m153214d() == 3) {
                            if (c32119t6.f148065g) {
                                z11 = false;
                            }
                            c32119t6.f148065g = false;
                        }
                    }
                    C31917f9 c31917f9 = (C31917f9) c32119t6.f148060b.get(m155012b);
                    if (c31917f9 != null && !c31917f9.m153378a() && c31917f9.f146629a.size() > 0) {
                        fVar.mo64480a(0, str, c31917f9);
                        return;
                    }
                    C0824j.m2153b(new d(str, m155012b, fVar, c31887d9, i11, i12, i13, i14, i15, i16, i17, str2));
                    return;
                }
                throw new IllegalStateException("invalid keyword!");
            } catch (Exception e11) {
                e = e11;
                r15 = c32119t6;
                AbstractC20110a.m104539h(e);
                r15.mo64480a(-1, str, null);
            }
        } catch (Exception e12) {
            e = e12;
            r15 = fVar;
        }
    }

    /* renamed from: g */
    public List m155016g(String str) {
        return (List) this.f148061c.get(str);
    }

    /* renamed from: h */
    public boolean m155017h(String str) {
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (C31887d9 c31887d9 : this.f148059a) {
            if (c31887d9.m153214d() == 1 && str.equals(c31887d9.m153216f())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public boolean m155018i(String str) {
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator it = this.f148059a.iterator();
        while (it.hasNext()) {
            if (str.equals(((C31887d9) it.next()).m153216f())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public void m155019j() {
        try {
            String m122240ob = AbstractC23309i.m122240ob(MainApplication.getAppContext());
            if (!TextUtils.isEmpty(m122240ob)) {
                JSONArray jSONArray = new JSONArray(m122240ob);
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    arrayList.add(new C31887d9(jSONArray.getJSONObject(i11)));
                }
                synchronized (this) {
                    this.f148059a = arrayList;
                }
                C23744a.m124114c().m124116d(6015, new Object[0]);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: l */
    public void m155020l() {
        this.f148062d = true;
        this.f148063e = true;
        this.f148064f = true;
        this.f148065g = true;
    }

    /* renamed from: m */
    public void m155021m() {
        try {
            if (System.currentTimeMillis() - AbstractC23309i.m121337Q8() > 604800000) {
                C0824j.m2153b(new e());
                AbstractC23309i.m122517vt(System.currentTimeMillis());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
