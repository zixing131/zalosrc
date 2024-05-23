package vg;

import ae.C0766k;
import android.telephony.PhoneNumberUtils;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.core.content.AbstractC1388a;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactMask;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalocore.CoreUtility;
import gg0.AbstractC19444a;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me0.AbstractC23006a0;
import me0.AbstractC23056e6;
import me0.AbstractC23136l9;
import me0.AbstractC23148n;
import me0.AbstractC23217t2;
import me0.AbstractC23262x6;
import me0.C23024b7;
import org.json.JSONArray;
import org.json.JSONObject;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p461qu.AbstractC25495a;
import p716zh.C32093r8;
import p720zl.C32223a;

/* renamed from: vg.o3 */
/* loaded from: classes3.dex */
public class C28146o3 extends Thread {

    /* renamed from: A */
    final WeakReference f131201A;

    /* renamed from: B */
    final b f131202B;

    /* renamed from: C */
    final C32223a f131203C;

    /* renamed from: p */
    final String f131204p;

    /* renamed from: q */
    final String f131205q;

    /* renamed from: r */
    final boolean f131206r;

    /* renamed from: s */
    int f131207s;

    /* renamed from: t */
    boolean f131208t;

    /* renamed from: u */
    boolean f131209u;

    /* renamed from: v */
    boolean f131210v;

    /* renamed from: w */
    Map f131211w;

    /* renamed from: x */
    final ArrayList f131212x;

    /* renamed from: y */
    HashSet f131213y;

    /* renamed from: z */
    final ArrayList f131214z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vg.o3$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f131215a;

        a(String str) {
            this.f131215a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C28146o3 c28146o3 = C28146o3.this;
            c28146o3.f131209u = true;
            c28146o3.m141662j();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            ForegroundColorSpan foregroundColorSpan;
            SpannableStringBuilder spannableStringBuilder;
            HashMap hashMap = new HashMap();
            Iterator it = C28146o3.this.f131212x.iterator();
            while (it.hasNext()) {
                try {
                    ContactProfile contactProfile = (ContactProfile) it.next();
                    hashMap.put(contactProfile.f42434r, contactProfile);
                } catch (Throwable th2) {
                    C28146o3 c28146o3 = C28146o3.this;
                    c28146o3.f131209u = true;
                    c28146o3.m141662j();
                    throw th2;
                }
            }
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                JSONArray optJSONArray = optJSONObject.optJSONArray("phoneSearchRS");
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("uNameSearchRS");
                int i11 = 0;
                optJSONObject.optInt("search_phone_empty", 0);
                ArrayList arrayList = new ArrayList();
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                        try {
                            JSONObject jSONObject = optJSONArray.getJSONObject(i12);
                            String optString = jSONObject.optString("uid");
                            if (!hashMap.containsKey(optString)) {
                                String optString2 = jSONObject.optString("avt");
                                String optString3 = jSONObject.optString("dpn");
                                InviteContactProfile inviteContactProfile = new InviteContactProfile();
                                inviteContactProfile.f42434r = optString;
                                inviteContactProfile.f42446v = optString2;
                                inviteContactProfile.f42437s = optString3;
                                inviteContactProfile.f42373R0 = 85;
                                C21927m.m114302u().m114330e0(optString, new TrackingSource(85));
                                inviteContactProfile.f42436r1.append((CharSequence) this.f131215a);
                                ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(AbstractC1388a.m6961c(MainApplication.getAppContext(), AbstractC16801x.cM4));
                                SpannableStringBuilder spannableStringBuilder2 = inviteContactProfile.f42436r1;
                                spannableStringBuilder2.setSpan(foregroundColorSpan2, 0, spannableStringBuilder2.length(), 33);
                                if (!AbstractC21935u.m114554u(inviteContactProfile.f42434r)) {
                                    InviteContactMask inviteContactMask = new InviteContactMask(1, C28146o3.this.f131204p);
                                    inviteContactMask.f42536r = inviteContactProfile.f42436r1;
                                    inviteContactProfile.f42540d2 = inviteContactMask;
                                }
                                arrayList.add(inviteContactProfile);
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                if (optJSONArray2 != null && optJSONArray2.length() > 0 && AbstractC23148n.m118841o()) {
                    int i13 = 0;
                    while (i13 < optJSONArray2.length()) {
                        try {
                            JSONObject jSONObject2 = optJSONArray2.getJSONObject(i13);
                            String optString4 = jSONObject2.optString("uid");
                            if (!hashMap.containsKey(optString4)) {
                                String optString5 = jSONObject2.optString("avt");
                                String optString6 = jSONObject2.optString("dpn");
                                String optString7 = jSONObject2.optString("uname");
                                jSONObject2.optInt("src", i11);
                                int optInt = jSONObject2.optInt("srcType", -1);
                                InviteContactProfile inviteContactProfile2 = new InviteContactProfile();
                                inviteContactProfile2.f42434r = optString4;
                                inviteContactProfile2.f42446v = optString5;
                                inviteContactProfile2.f42437s = optString6;
                                inviteContactProfile2.f42460z1 = optString7;
                                inviteContactProfile2.f42376S0 = optInt;
                                inviteContactProfile2.f42373R0 = 86;
                                C21927m.m114302u().m114330e0(optString4, new TrackingSource(86));
                                String[] m119967B = AbstractC23262x6.m119967B(this.f131215a);
                                if (!TextUtils.isEmpty(optString7)) {
                                    String string = MainApplication.getAppContext().getString(AbstractC8020f0.prefix_username);
                                    Object[] objArr = new Object[1];
                                    try {
                                        objArr[0] = AbstractC23217t2.m119654f(inviteContactProfile2.f42460z1, new ArrayList(Arrays.asList(m119967B)));
                                        inviteContactProfile2.f42439s1 = new SpannableStringBuilder(String.format(string, objArr));
                                        foregroundColorSpan = new ForegroundColorSpan(AbstractC23136l9.m118639A(AbstractC16801x.cM4));
                                        spannableStringBuilder = inviteContactProfile2.f42439s1;
                                    } catch (Exception e12) {
                                        e = e12;
                                        e.printStackTrace();
                                        i13++;
                                        i11 = 0;
                                    }
                                    try {
                                        spannableStringBuilder.setSpan(foregroundColorSpan, 0, spannableStringBuilder.length(), 33);
                                    } catch (Exception e13) {
                                        e = e13;
                                        e.printStackTrace();
                                        i13++;
                                        i11 = 0;
                                    }
                                }
                                if (!AbstractC21935u.m114554u(inviteContactProfile2.f42434r)) {
                                    InviteContactMask inviteContactMask2 = new InviteContactMask(2, C28146o3.this.f131204p);
                                    inviteContactMask2.f42536r = inviteContactProfile2.f42439s1;
                                    inviteContactProfile2.f42540d2 = inviteContactMask2;
                                }
                                arrayList2.add(inviteContactProfile2);
                            }
                        } catch (Exception e14) {
                            e = e14;
                        }
                        i13++;
                        i11 = 0;
                    }
                }
                if (arrayList.size() == 0) {
                    if (PhoneNumberUtils.isGlobalPhoneNumber(this.f131215a) && C28146o3.this.f131203C != null) {
                        InviteContactProfile m155393g = C28146o3.this.f131203C.m155393g(ContactProfile.m40353g0(AbstractC23056e6.m118285k(this.f131215a)));
                        if (m155393g != null) {
                            ArrayList arrayList3 = new ArrayList(1);
                            arrayList3.add(m155393g);
                            C28146o3.this.m141658c(arrayList3);
                        }
                    }
                } else {
                    C28146o3.this.m141658c(arrayList);
                }
                C28146o3.this.m141658c(arrayList2);
            } catch (Exception e15) {
                e15.printStackTrace();
            }
            C28146o3 c28146o32 = C28146o3.this;
            c28146o32.f131209u = true;
            c28146o32.m141662j();
        }
    }

    /* renamed from: vg.o3$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo40211a();

        /* renamed from: b */
        void mo40212b(boolean z11, String str, ArrayList arrayList, int i11);
    }

    public C28146o3(String str, boolean z11, List list, C32223a c32223a, b bVar) {
        super("Z:ContactSearchTask");
        this.f131207s = 0;
        this.f131208t = false;
        this.f131209u = false;
        this.f131210v = false;
        this.f131211w = Collections.synchronizedMap(new HashMap());
        this.f131212x = new ArrayList();
        this.f131213y = new HashSet();
        this.f131214z = new ArrayList();
        this.f131204p = str;
        this.f131206r = z11;
        this.f131201A = new WeakReference(bVar);
        this.f131202B = bVar;
        this.f131205q = AbstractC23262x6.m120002o(str);
        this.f131203C = c32223a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ContactProfile contactProfile = (ContactProfile) it.next();
                if (contactProfile.m40366G0()) {
                    this.f131214z.add(contactProfile);
                }
            }
        }
    }

    /* renamed from: e */
    public static boolean m141655e(ContactProfile contactProfile, boolean z11) {
        try {
            if (!contactProfile.f42434r.equals(CoreUtility.f89233i) && !AbstractC25495a.m132086k(contactProfile.f42434r) && !contactProfile.m40372J0()) {
                if (!z11) {
                    if (C21927m.m114302u().m114312J().m153137g(contactProfile.f42434r)) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m141656g() {
        b bVar = this.f131202B;
        if (bVar != null) {
            bVar.mo40212b(this.f131209u, this.f131204p, this.f131212x, this.f131207s);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m141657h() {
        b bVar = this.f131202B;
        if (bVar != null) {
            bVar.mo40211a();
        }
    }

    /* renamed from: c */
    void m141658c(List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            InviteContactProfile inviteContactProfile = (InviteContactProfile) list.get(i11);
            if (inviteContactProfile != null && m141655e(inviteContactProfile, this.f131210v) && !this.f131213y.contains(inviteContactProfile.f42434r)) {
                this.f131213y.add(inviteContactProfile.f42434r);
                this.f131212x.add(inviteContactProfile);
                this.f131207s++;
            }
        }
    }

    /* renamed from: d */
    public void m141659d() {
        this.f131208t = true;
    }

    /* renamed from: f */
    void m141660f() {
        String str = this.f131204p;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new a(str));
        c0766k.mo1677ka(this.f131204p, AbstractC23006a0.m117905e(), 1, 50, 2, 88);
    }

    /* renamed from: i */
    void m141661i() {
        ArrayList arrayList;
        String[] m119967B = AbstractC23262x6.m119967B(this.f131205q);
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (!this.f131211w.containsKey(this.f131205q)) {
            for (Map.Entry entry : AbstractC23304d.f113429r.entrySet()) {
                String[] m119970E = AbstractC23262x6.m119970E((String) entry.getKey());
                ArrayList arrayList4 = (ArrayList) entry.getValue();
                float m120001n = AbstractC23262x6.m120001n(m119967B, m119970E);
                if (m120001n > 0.0f) {
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        C32093r8 c32093r8 = new C32093r8();
                        c32093r8.f147887d = ((C32093r8) arrayList4.get(i11)).f147887d;
                        c32093r8.f147884a = ((C32093r8) arrayList4.get(i11)).f147884a;
                        c32093r8.f147886c = ((C32093r8) arrayList4.get(i11)).f147886c;
                        c32093r8.f147890g = m120001n;
                        c32093r8.f147885b = ((C32093r8) arrayList4.get(i11)).f147885b;
                        c32093r8.f147893j = ((C32093r8) arrayList4.get(i11)).f147893j;
                        arrayList2.add(c32093r8);
                    }
                    this.f131211w.put(this.f131205q, arrayList2);
                }
            }
        } else {
            arrayList2 = (ArrayList) this.f131211w.get(this.f131205q);
        }
        ArrayList arrayList5 = arrayList2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TimeCheckTopHit: ");
        sb2.append(System.currentTimeMillis() - currentTimeMillis);
        ArrayList arrayList6 = this.f131214z;
        if (arrayList6 != null && !arrayList6.isEmpty()) {
            arrayList = arrayList3;
            C23024b7.m118043O(this.f131205q, this.f131214z, arrayList3, false, true, C19669z.f97573U, arrayList5, AbstractC23148n.m118841o(), false, true, null);
        } else {
            arrayList = arrayList3;
        }
        m141658c(arrayList);
        if (!this.f131206r) {
            this.f131209u = true;
        }
        m141662j();
    }

    /* renamed from: j */
    void m141662j() {
        AbstractC19444a.m101695c(new Runnable() { // from class: vg.n3
            @Override // java.lang.Runnable
            public final void run() {
                C28146o3.this.m141656g();
            }
        });
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            String str = this.f131204p;
            if (str != null && !str.equals("")) {
                m141661i();
                if (this.f131206r) {
                    Thread.sleep(300L);
                    if (!this.f131208t) {
                        m141660f();
                        return;
                    }
                    return;
                }
                return;
            }
            AbstractC19444a.m101695c(new Runnable() { // from class: vg.m3
                @Override // java.lang.Runnable
                public final void run() {
                    C28146o3.this.m141657h();
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
