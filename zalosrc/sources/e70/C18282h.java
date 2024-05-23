package e70;

import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0815e1;
import am.C0943w;
import android.os.Bundle;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.utils.ToastUtils;
import e70.C18282h;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import gw.C19637j;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23262x6;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p205hc.AbstractC19962a;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p461qu.AbstractC25495a;
import p716zh.C31973j5;
import p716zh.C32020m7;
import p716zh.C32076q5;
import vg.C28203u6;

/* renamed from: e70.h */
/* loaded from: classes5.dex */
public class C18282h extends AbstractC19962a implements InterfaceC18276b {

    /* renamed from: A */
    private final ArrayList f92529A;

    /* renamed from: B */
    private final ArrayList f92530B;

    /* renamed from: C */
    private d f92531C;

    /* renamed from: D */
    private HashMap f92532D;

    /* renamed from: E */
    private ArrayList f92533E;

    /* renamed from: F */
    private final int f92534F;

    /* renamed from: G */
    private boolean f92535G;

    /* renamed from: H */
    boolean f92536H;

    /* renamed from: t */
    private final C0943w f92537t;

    /* renamed from: u */
    private final C19637j f92538u;

    /* renamed from: v */
    private final C18275a f92539v;

    /* renamed from: w */
    private final ArrayList f92540w;

    /* renamed from: x */
    private boolean f92541x;

    /* renamed from: y */
    private final LinkedList f92542y;

    /* renamed from: z */
    private final HashMap f92543z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e70.h$a */
    /* loaded from: classes5.dex */
    public class a implements Runnable {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m97149b() {
            ((InterfaceC18277c) C18282h.this.m103742Dp()).mo81005pv(true, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            try {
                synchronized (this) {
                    try {
                        if (C18282h.this.f92540w.isEmpty()) {
                            AbstractC19444a.m101697e(new Runnable() { // from class: e70.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C18282h.a.this.m97149b();
                                }
                            });
                        }
                        C18282h.this.f92529A.clear();
                        ArrayList arrayList = C18282h.this.f92529A;
                        C18282h c18282h = C18282h.this;
                        arrayList.addAll(c18282h.m97140eq(c18282h.f92539v.f92521a));
                        C18282h.this.f92540w.clear();
                        C18282h.this.f92540w.addAll(C18282h.this.f92542y);
                        C18282h.this.f92540w.addAll(C18282h.this.f92529A);
                    } finally {
                    }
                }
                C18282h.this.m97145jq();
                if (!C18282h.this.f92535G) {
                    String str2 = C18282h.this.f92539v.f92523c;
                    if (C18282h.this.f92529A.size() > 0) {
                        str = "gr_add_multiplegr";
                    } else {
                        str = "gr_add_multiplegr_empty";
                    }
                    C0815e1.m2075D().m2100V(new C23648e(5, str2, 1, str, "1"), false);
                    C18282h.this.f92535G = true;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e70.h$b */
    /* loaded from: classes5.dex */
    public class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f92545a;

        b(String str) {
            this.f92545a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C18282h.this.f92541x = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C18282h.this.f92541x = false;
            try {
                JSONObject jSONObject = new JSONObject(obj.toString());
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (!jSONObject.isNull("error_code") && jSONObject.getInt("error_code") == 0) {
                    synchronized (C18282h.this) {
                        try {
                            C18282h.this.f92542y.clear();
                            C18282h.this.f92543z.clear();
                            JSONArray jSONArray = jSONObject2.getJSONArray("suggestGroup");
                            int length = jSONArray.length();
                            for (int i11 = 0; i11 < length; i11++) {
                                int i12 = jSONArray.getInt(i11);
                                C31973j5 m4472f = C0943w.m4462l().m4472f("" + i12);
                                C32076q5 m4476k = C0943w.m4462l().m4476k("" + i12);
                                if (m4472f != null && m4476k != null && !m4476k.m154725n(this.f92545a) && !C18282h.this.f92543z.containsKey(m4472f.m153781r())) {
                                    C32020m7 c32020m7 = new C32020m7(28);
                                    ContactProfile contactProfile = new ContactProfile(1, m4472f.m153781r());
                                    contactProfile.f42373R0 = 1;
                                    c32020m7.f147413d = m4472f;
                                    contactProfile.f42437s = m4472f.m153793y();
                                    contactProfile.f42440t = m4472f.m153795z();
                                    c32020m7.f147411b = contactProfile;
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put("invitee_uid", C18282h.this.f92539v.f92521a);
                                    jSONObject3.put("invitee_is_group_member", false);
                                    c32020m7.f147424o = jSONObject3;
                                    C18282h.this.f92542y.add(c32020m7);
                                    C18282h.this.f92543z.put(m4472f.m153781r(), c32020m7);
                                }
                            }
                            if (C18282h.this.f92542y.size() > 0) {
                                C32020m7 c32020m72 = new C32020m7(37);
                                c32020m72.f147428s = AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_group_tab_suggest);
                                C18282h.this.f92542y.add(0, c32020m72);
                                C18282h.this.mo97112Lg();
                            }
                        } finally {
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e70.h$c */
    /* loaded from: classes5.dex */
    public class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ArrayList f92547a;

        /* renamed from: b */
        final /* synthetic */ String f92548b;

        c(ArrayList arrayList, String str) {
            this.f92547a = arrayList;
            this.f92548b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m97154g() {
            ((InterfaceC18277c) C18282h.this.m103742Dp()).mo81007zd(C18282h.this.f92539v.f92521a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m97155h() {
            ((InterfaceC18277c) C18282h.this.m103742Dp()).mo81001g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m97156i() {
            ((InterfaceC18277c) C18282h.this.m103742Dp()).mo81003pG();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m97157j() {
            ((InterfaceC18277c) C18282h.this.m103742Dp()).mo81007zd(C18282h.this.f92539v.f92521a);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C18282h c18282h = C18282h.this;
            c18282h.f92536H = false;
            c18282h.m97146kq(false);
            if (c20096c.m104491c() == 50001) {
                ToastUtils.m89268p(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG));
                return;
            }
            if (c20096c.m104491c() == 17053) {
                AbstractC19444a.m101695c(new Runnable() { // from class: e70.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18282h.c.this.m97156i();
                    }
                });
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new InviteContactProfile(C28203u6.f131407a.m141809c(C18282h.this.f92539v.f92521a)));
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < this.f92547a.size(); i11++) {
                String str = ((InviteContactProfile) this.f92547a.get(i11)).f42434r;
                arrayList2.add(str);
                C18282h.this.m97138cq(c20096c.m104491c(), arrayList, str);
            }
            AbstractC19646n0.m102998l0(C18282h.this.f92539v.f92521a, this.f92547a, arrayList2);
            AbstractC19444a.m101695c(new Runnable() { // from class: e70.j
                @Override // java.lang.Runnable
                public final void run() {
                    C18282h.c.this.m97157j();
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            JSONArray jSONArray;
            C18282h c18282h = C18282h.this;
            c18282h.f92536H = false;
            try {
                c18282h.m97146kq(false);
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                ArrayList arrayList = new ArrayList();
                if (optJSONObject != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new InviteContactProfile(C28203u6.f131407a.m141809c(C18282h.this.f92539v.f92521a)));
                    JSONArray jSONArray2 = new JSONArray(optJSONObject.optString("wrong_members", "[]"));
                    if (jSONArray2.length() > 0) {
                        for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                            JSONObject jSONObject = jSONArray2.getJSONObject(i12);
                            if (jSONObject.has("errorCode")) {
                                i11 = jSONObject.getInt("errorCode");
                            } else {
                                i11 = 0;
                            }
                            if (jSONObject.has("uIds")) {
                                jSONArray = jSONObject.getJSONArray("uIds");
                            } else {
                                jSONArray = new JSONArray();
                            }
                            for (int i13 = 0; i13 < jSONArray.length(); i13++) {
                                String str = "group_" + jSONArray.get(i13);
                                arrayList.add(str);
                                C18282h.this.m97138cq(i11, arrayList2, str);
                            }
                        }
                    }
                }
                AbstractC19646n0.m102998l0(C18282h.this.f92539v.f92521a, this.f92547a, arrayList);
                AbstractC19444a.m101695c(new Runnable() { // from class: e70.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18282h.c.this.m97154g();
                    }
                });
                if ("711370".equals(this.f92548b)) {
                    AbstractC19444a.m101694b(new Runnable() { // from class: e70.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            C18282h.c.this.m97155h();
                        }
                    }, 200L);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e70.h$d */
    /* loaded from: classes5.dex */
    public class d {

        /* renamed from: a */
        final String f92550a;

        /* renamed from: b */
        boolean f92551b = false;

        public d(String str) {
            this.f92550a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public void m97162e() {
            synchronized (this) {
                this.f92551b = true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m97163f() {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: e70.m
                @Override // java.lang.Runnable
                public final void run() {
                    C18282h.d.this.m97165h();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m97164g() {
            if (this.f92551b) {
                return;
            }
            ((InterfaceC18277c) C18282h.this.m103742Dp()).mo81002pD(this.f92550a, C18282h.this.f92530B);
            ((InterfaceC18277c) C18282h.this.m103742Dp()).mo81005pv(false, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m97165h() {
            ContactProfile contactProfile;
            try {
                if (this.f92551b) {
                    return;
                }
                synchronized (C18282h.this) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        if (TextUtils.isEmpty(this.f92550a)) {
                            for (int i11 = 0; i11 < C18282h.this.f92529A.size(); i11++) {
                                if (C18282h.this.f92529A.get(i11) != null && ((C32020m7) C18282h.this.f92529A.get(i11)).f147411b != null) {
                                    ((C32020m7) C18282h.this.f92529A.get(i11)).f147411b.f42399a1.clear();
                                }
                            }
                            arrayList.addAll(C18282h.this.f92540w);
                        } else {
                            String m120002o = AbstractC23262x6.m120002o(this.f92550a);
                            Iterator it = C18282h.this.f92529A.iterator();
                            while (it.hasNext()) {
                                C32020m7 c32020m7 = (C32020m7) it.next();
                                if (c32020m7 != null && (contactProfile = c32020m7.f147411b) != null) {
                                    contactProfile.f42399a1.clear();
                                    if (c32020m7.f147410a == 28) {
                                        String m120002o2 = AbstractC23262x6.m120002o(c32020m7.f147411b.f42437s);
                                        if (!TextUtils.isEmpty(m120002o2) && m120002o2.contains(m120002o)) {
                                            int indexOf = m120002o2.indexOf(m120002o);
                                            if (indexOf != -1) {
                                                int length = m120002o.length() + indexOf;
                                                c32020m7.f147411b.f42399a1.add(Integer.valueOf(indexOf));
                                                c32020m7.f147411b.f42399a1.add(Integer.valueOf(length));
                                            }
                                            arrayList.add(c32020m7);
                                        }
                                    }
                                }
                            }
                        }
                        C18282h.this.f92530B.clear();
                        C18282h.this.f92530B.addAll(arrayList);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                AbstractC19444a.m101697e(new Runnable() { // from class: e70.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18282h.d.this.m97164g();
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    public C18282h(InterfaceC18277c interfaceC18277c, C0943w c0943w, C19637j c19637j, C18275a c18275a) {
        super(interfaceC18277c);
        this.f92540w = new ArrayList();
        this.f92541x = false;
        this.f92542y = new LinkedList();
        this.f92543z = new HashMap();
        this.f92529A = new ArrayList();
        this.f92530B = new ArrayList();
        this.f92531C = null;
        this.f92532D = new HashMap();
        this.f92533E = new ArrayList();
        this.f92535G = false;
        this.f92536H = false;
        this.f92537t = c0943w;
        this.f92538u = c19637j;
        this.f92539v = c18275a;
        this.f92534F = AbstractC23309i.m121041I8();
    }

    /* renamed from: bq */
    private C31973j5 m97137bq(C31973j5 c31973j5) {
        if (c31973j5 == null) {
            return null;
        }
        return new C31973j5(c31973j5.m153781r(), c31973j5.m153793y(), c31973j5.m153765j(), c31973j5.m153758f(), c31973j5.m153734P(), c31973j5.m153756e(), c31973j5.m153767k(), c31973j5.m153732O(), c31973j5.m153715F(), c31973j5.m153738R(), c31973j5.m153716G(), c31973j5.m153769l(), c31973j5.m153785t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cq */
    public void m97138cq(int i11, ArrayList arrayList, String str) {
        C31973j5 m4472f = this.f92537t.m4472f(str);
        if (m4472f == null) {
            return;
        }
        if (i11 != 17007) {
            if (i11 != 17016) {
                if (i11 != 17032) {
                    if (i11 != 17050) {
                        if (i11 != 18007) {
                            if (i11 != 18008) {
                                if (i11 != 19516) {
                                    if (i11 != 19517) {
                                        switch (i11) {
                                            case 17041:
                                                AbstractC19646n0.m102908L(arrayList, m4472f);
                                                return;
                                            case 17042:
                                                AbstractC19646n0.m102917O(arrayList, m4472f);
                                                return;
                                            case 17043:
                                                AbstractC19646n0.m102926R(m4472f);
                                                return;
                                            case 17044:
                                                AbstractC19646n0.m102923Q(arrayList, m4472f);
                                                return;
                                            case 17045:
                                                AbstractC19646n0.m102932T(arrayList, m4472f);
                                                return;
                                            case 17046:
                                                AbstractC19646n0.m102929S(arrayList, m4472f);
                                                return;
                                            case 17047:
                                                AbstractC19646n0.m102935U(arrayList, m4472f);
                                                return;
                                            default:
                                                switch (i11) {
                                                    case 18002:
                                                        AbstractC19646n0.m102963c1(arrayList, m4472f);
                                                        return;
                                                    case 18003:
                                                        AbstractC19646n0.m102911M(arrayList, m4472f);
                                                        return;
                                                    case 18004:
                                                        AbstractC19646n0.m102914N(arrayList, m4472f);
                                                        return;
                                                    case 18005:
                                                        AbstractC19646n0.m102905K(arrayList, m4472f);
                                                        return;
                                                    default:
                                                        AbstractC19646n0.m102944X(arrayList, m4472f);
                                                        return;
                                                }
                                        }
                                    }
                                    AbstractC19646n0.m102941W(arrayList, m4472f);
                                    return;
                                }
                                AbstractC19646n0.m102938V(arrayList, m4472f);
                                return;
                            }
                            AbstractC19646n0.m102920P(arrayList, m4472f);
                            return;
                        }
                        AbstractC19646n0.m102947Y(arrayList, m4472f);
                        return;
                    }
                    AbstractC19646n0.m102988i2(arrayList, m4472f);
                    return;
                }
                AbstractC19646n0.m102902J(arrayList, m4472f);
                return;
            }
            AbstractC19646n0.m102944X(arrayList, m4472f);
            return;
        }
        if (!m4472f.m153742T() && m4472f.m153755d0() && arrayList.size() > 0) {
            AbstractC19646n0.m102987i1(arrayList, m4472f);
        }
    }

    /* renamed from: dq */
    private String m97139dq(List list) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
                JSONObject jSONObject2 = new JSONObject();
                String str2 = inviteContactProfile.f42434r;
                if (AbstractC25495a.m132079d(str2)) {
                    str2 = AbstractC25495a.m132088m(str2);
                }
                jSONObject2.put("gid", str2);
                jSONObject2.put("src", inviteContactProfile.f42373R0);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("srcGroup", jSONArray);
            str = jSONObject.toString();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            str = "";
        }
        AbstractC20110a.m104541j("genTrackingSourceInviteMultiGroup: %s", str);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9 A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:5:0x0019, B:7:0x002b, B:8:0x003c, B:10:0x0054, B:12:0x0064, B:15:0x006d, B:18:0x0080, B:20:0x008e, B:21:0x0090, B:22:0x00a4, B:24:0x0093, B:25:0x00a2, B:47:0x00d3, B:49:0x00d9, B:53:0x00f3, B:54:0x0116, B:56:0x00fc, B:57:0x0105, B:58:0x010e, B:65:0x00d0, B:40:0x00ad, B:60:0x00bc, B:61:0x00c4, B:62:0x00ca), top: B:4:0x0019, inners: #1 }] */
    /* renamed from: eq */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayList m97140eq(String str) {
        int m102828I;
        C31973j5 c31973j5;
        boolean z11;
        ArrayList arrayList = new ArrayList(this.f92538u.m102871x());
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        boolean z12 = false;
        for (int i11 = 0; i11 < size; i11++) {
            try {
                C32020m7 c32020m7 = (C32020m7) arrayList.get(i11);
                C32020m7 c32020m72 = new C32020m7(c32020m7.f147411b);
                C32076q5 c32076q5 = null;
                if (c32020m7.f147411b != null) {
                    c31973j5 = C0943w.m4462l().m4472f(c32020m7.f147411b.f42434r);
                } else {
                    c31973j5 = null;
                }
                c32020m72.f147413d = m97137bq(c31973j5);
                c32020m72.f147410a = 28;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("invitee_uid", str);
                if (c32020m72.f147413d != null) {
                    c32076q5 = C0943w.m4462l().m4476k(c32020m72.f147413d.m153781r());
                }
                if (c32076q5 != null && c32076q5.m154725n(str)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                jSONObject.put("invitee_is_group_member", z11);
                if (this.f92532D.containsKey(c32020m72.f147411b.f42434r)) {
                    if (!z11) {
                        C32020m7 c32020m73 = (C32020m7) this.f92532D.get(c32020m72.f147411b.f42434r);
                        if (c32020m73 != null) {
                            jSONObject = c32020m73.f147424o;
                        }
                        c32020m72.f147424o = jSONObject;
                    } else {
                        m97147lq(false, c32020m72);
                        ((InterfaceC18277c) m103742Dp()).mo81006ug();
                        c32020m72.f147424o = jSONObject;
                    }
                } else {
                    c32020m72.f147424o = jSONObject;
                }
                arrayList2.add(c32020m72);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        try {
            m102828I = this.f92538u.m102828I();
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
        }
        if (m102828I != 0) {
            if (m102828I != 1) {
                if (m102828I != 2) {
                    if (m102828I != 3) {
                    }
                } else {
                    Collections.sort(arrayList2, C19637j.f97459A);
                }
            } else {
                Collections.sort(arrayList2, C19637j.f97491z);
            }
            if (arrayList2.size() > 0) {
                C32020m7 c32020m74 = new C32020m7(7);
                c32020m74.f147428s = AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_info);
                int m102828I2 = this.f92538u.m102828I();
                if (m102828I2 != 1) {
                    if (m102828I2 != 2) {
                        if (m102828I2 != 3) {
                            c32020m74.f147429t = AbstractC23136l9.m118743r0(AbstractC8020f0.str_item_menu_filter);
                        } else {
                            c32020m74.f147429t = AbstractC23136l9.m118743r0(AbstractC8020f0.str_sort_by_group_recent_activity);
                        }
                    } else {
                        c32020m74.f147429t = AbstractC23136l9.m118743r0(AbstractC8020f0.str_sort_by_group_manage);
                    }
                } else {
                    c32020m74.f147429t = AbstractC23136l9.m118743r0(AbstractC8020f0.str_sort_by_group_name);
                }
                arrayList2.add(0, c32020m74);
            }
            InterfaceC18277c interfaceC18277c = (InterfaceC18277c) m103742Dp();
            if (size == 0) {
                z12 = true;
            }
            interfaceC18277c.mo80999Wx(z12);
            return arrayList2;
        }
        Collections.sort(arrayList2, C19637j.f97490y);
        if (arrayList2.size() > 0) {
        }
        InterfaceC18277c interfaceC18277c2 = (InterfaceC18277c) m103742Dp();
        if (size == 0) {
        }
        interfaceC18277c2.mo80999Wx(z12);
        return arrayList2;
    }

    /* renamed from: fq */
    private void m97141fq() {
        String str = this.f92539v.f92521a;
        if (AbstractC21935u.m114515E(str) || AbstractC21935u.m114536c(str) || this.f92541x) {
            return;
        }
        this.f92541x = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new b(str));
        c0766k.mo1789z4(str, (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gq */
    public /* synthetic */ void m97142gq() {
        ((InterfaceC18277c) m103742Dp()).mo80998ND();
        ((InterfaceC18277c) m103742Dp()).mo81006ug();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hq */
    public /* synthetic */ void m97143hq() {
        ((InterfaceC18277c) m103742Dp()).mo81006ug();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iq */
    public /* synthetic */ void m97144iq(boolean z11) {
        ((InterfaceC18277c) m103742Dp()).mo81000c3(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jq */
    public void m97145jq() {
        try {
            mo97119v9(((InterfaceC18277c) m103742Dp()).mo80995E2());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kq */
    public void m97146kq(final boolean z11) {
        AbstractC19444a.m101697e(new Runnable() { // from class: e70.f
            @Override // java.lang.Runnable
            public final void run() {
                C18282h.this.m97144iq(z11);
            }
        });
    }

    /* renamed from: lq */
    private void m97147lq(boolean z11, C32020m7 c32020m7) {
        if (z11) {
            this.f92532D.put(c32020m7.f147411b.f42434r, c32020m7);
            this.f92533E.add(new InviteContactProfile(c32020m7.f147411b));
            return;
        }
        this.f92532D.remove(c32020m7.f147411b.f42434r);
        for (int i11 = 0; i11 < this.f92533E.size(); i11++) {
            if (((InviteContactProfile) this.f92533E.get(i11)).f42434r.equals(c32020m7.f147411b.f42434r)) {
                this.f92533E.remove(i11);
                return;
            }
        }
    }

    @Override // e70.InterfaceC18276b
    /* renamed from: Fo */
    public void mo97109Fo(int i11) {
        if (i11 >= 0) {
            try {
                synchronized (this) {
                    try {
                        InviteContactProfile inviteContactProfile = (InviteContactProfile) this.f92533E.get(i11);
                        C32020m7 c32020m7 = (C32020m7) this.f92532D.get(inviteContactProfile.f42434r);
                        if (c32020m7 == null) {
                            return;
                        }
                        JSONObject jSONObject = c32020m7.f147424o;
                        jSONObject.put("is_selected", false);
                        c32020m7.f147424o = jSONObject;
                        this.f92532D.remove(inviteContactProfile.f42434r);
                        this.f92533E.remove(i11);
                        AbstractC19444a.m101697e(new Runnable() { // from class: e70.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                C18282h.this.m97143hq();
                            }
                        });
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    @Override // e70.InterfaceC18276b
    /* renamed from: G8 */
    public List mo97110G8() {
        return this.f92530B;
    }

    @Override // e70.InterfaceC18276b
    /* renamed from: Kg */
    public void mo97111Kg() {
        String str;
        String str2 = this.f92539v.f92521a;
        int size = this.f92530B.size();
        if (size < 10) {
            str = "159106600" + size;
        } else if (size < 100) {
            str = "15910660" + size;
        } else {
            str = "1591066" + size;
        }
        AbstractC23647d.m123897g(str);
        AbstractC23647d.m123897g("1591067");
        if (AbstractC21935u.m114515E(str2)) {
            ((InterfaceC18277c) m103742Dp()).mo81003pG();
        } else if (AbstractC21935u.m114536c(str2)) {
            ToastUtils.m89268p(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_error_inviter_block_invitee));
        } else {
            ((InterfaceC18277c) m103742Dp()).mo81004ph();
        }
    }

    @Override // e70.InterfaceC18276b
    /* renamed from: Lg */
    public void mo97112Lg() {
        AbstractC0837p0.m2225f().mo2040a(new a());
    }

    @Override // e70.InterfaceC18276b
    /* renamed from: Ym */
    public String mo97113Ym() {
        return AbstractC23136l9.m118746s0(AbstractC8020f0.str_selected_num_group, Integer.valueOf(this.f92533E.size()), Integer.valueOf(this.f92534F));
    }

    @Override // e70.InterfaceC18276b
    /* renamed from: d */
    public void mo97114d() {
        this.f92538u.m102840X();
        m97141fq();
        mo97112Lg();
    }

    @Override // e70.InterfaceC18276b
    /* renamed from: ha */
    public void mo97115ha(String str) {
        if (this.f92536H) {
            return;
        }
        m97146kq(true);
        this.f92536H = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f92533E);
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            String str2 = ((InviteContactProfile) arrayList2.get(i11)).f42434r;
            if (AbstractC25495a.m132079d(str2)) {
                str2 = AbstractC25495a.m132088m(str2);
            }
            arrayList.add(str2);
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new c(arrayList2, str));
        c0766k.mo1621d8(arrayList, this.f92539v.f92521a, (byte) 0, m97139dq(arrayList2));
    }

    @Override // e70.InterfaceC18276b
    /* renamed from: j3 */
    public void mo97116j3(Bundle bundle) {
        try {
            synchronized (this) {
                try {
                    if (this.f92533E.size() > 0) {
                        JSONArray jSONArray = new JSONArray();
                        JSONArray jSONArray2 = new JSONArray();
                        Iterator it = this.f92533E.iterator();
                        while (it.hasNext()) {
                            InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
                            C32020m7 c32020m7 = (C32020m7) this.f92532D.get(inviteContactProfile.f42434r);
                            if (c32020m7 != null) {
                                jSONArray.put(inviteContactProfile.m40488x1());
                                jSONArray2.put(c32020m7.f147424o);
                            }
                        }
                        bundle.putString("arrItemSelected", jSONArray.toString());
                        bundle.putString("arrItemSelectedExtraData", jSONArray2.toString());
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // e70.InterfaceC18276b
    /* renamed from: pj */
    public void mo97117pj(Bundle bundle) {
        if (bundle != null) {
            try {
                synchronized (this) {
                    try {
                        this.f92533E = new ArrayList();
                        if (bundle.containsKey("arrItemSelected")) {
                            JSONArray jSONArray = new JSONArray(bundle.getString("arrItemSelected"));
                            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                this.f92533E.add(new InviteContactProfile(jSONArray.getJSONObject(i11)));
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        if (bundle.containsKey("arrItemSelectedExtraData")) {
                            JSONArray jSONArray2 = new JSONArray(bundle.getString("arrItemSelectedExtraData"));
                            for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                                arrayList.add(jSONArray2.getJSONObject(i12));
                            }
                        }
                        this.f92532D = new HashMap();
                        for (int i13 = 0; i13 < this.f92533E.size(); i13++) {
                            ContactProfile contactProfile = (ContactProfile) this.f92533E.get(i13);
                            C32020m7 c32020m7 = new C32020m7(contactProfile);
                            c32020m7.f147413d = m97137bq(C0943w.m4462l().m4472f(contactProfile.f42434r));
                            c32020m7.f147410a = 28;
                            c32020m7.f147424o = (JSONObject) arrayList.get(i13);
                            this.f92532D.put(contactProfile.f42434r, c32020m7);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    @Override // e70.InterfaceC18276b
    /* renamed from: v */
    public List mo97118v() {
        return this.f92533E;
    }

    @Override // e70.InterfaceC18276b
    /* renamed from: v9 */
    public void mo97119v9(String str) {
        d dVar = this.f92531C;
        if (dVar != null) {
            dVar.m97162e();
        }
        d dVar2 = new d(str);
        this.f92531C = dVar2;
        dVar2.m97163f();
    }

    @Override // e70.InterfaceC18276b
    /* renamed from: y6 */
    public void mo97120y6(int i11) {
        C32076q5 c32076q5;
        boolean z11;
        try {
            synchronized (this) {
                try {
                    C32020m7 c32020m7 = (C32020m7) this.f92530B.get(i11);
                    if (c32020m7.f147413d != null) {
                        c32076q5 = C0943w.m4462l().m4476k(c32020m7.f147413d.m153781r());
                    } else {
                        c32076q5 = null;
                    }
                    if (c32076q5 != null && !c32076q5.m154725n(this.f92539v.f92521a)) {
                        JSONObject jSONObject = c32020m7.f147424o;
                        if (jSONObject.has("is_selected") && jSONObject.getBoolean("is_selected")) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        boolean z12 = !z11;
                        if (z12) {
                            int size = this.f92533E.size();
                            int i12 = this.f92534F;
                            if (size >= i12) {
                                ToastUtils.m89268p(AbstractC23136l9.m118746s0(AbstractC8020f0.str_msg_limit_invite_multi_group_per_time, Integer.valueOf(i12)));
                                return;
                            }
                        }
                        jSONObject.put("is_selected", z12);
                        c32020m7.f147424o = jSONObject;
                        Iterator it = this.f92540w.iterator();
                        while (it.hasNext()) {
                            C32020m7 c32020m72 = (C32020m7) it.next();
                            C31973j5 c31973j5 = c32020m72.f147413d;
                            if (c31973j5 != null && c32020m7.f147413d != null && c31973j5.m153781r().equals(c32020m7.f147413d.m153781r())) {
                                c32020m72.f147424o = jSONObject;
                            }
                        }
                        m97147lq(z12, c32020m7);
                        AbstractC19444a.m101697e(new Runnable() { // from class: e70.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                C18282h.this.m97142gq();
                            }
                        });
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
