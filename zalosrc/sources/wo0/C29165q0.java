package wo0;

import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0815e1;
import am.C0943w;
import android.text.TextUtils;
import ap0.C2280b;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import ep0.C18557q;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import i70.C20380b;
import io0.C20644a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import ko0.C21789d;
import me0.AbstractC23057e7;
import me0.AbstractC23136l9;
import me0.AbstractC23262x6;
import me0.C23055e5;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18635e;
import p142ey.C18644n;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19968g;
import p207he.C20024r;
import p304ks.C21927m;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.C23648e;
import p461qu.AbstractC25495a;
import p656xs.C30202c;
import p716zh.C31973j5;
import to0.InterfaceC26858c;
import to0.InterfaceC26859d;
import vg.C28203u6;
import wo0.C29165q0;

/* renamed from: wo0.q0 */
/* loaded from: classes7.dex */
public class C29165q0 extends AbstractC19962a implements InterfaceC26858c {

    /* renamed from: A */
    private boolean f135129A;

    /* renamed from: B */
    private final int f135130B;

    /* renamed from: C */
    private boolean f135131C;

    /* renamed from: D */
    public final String f135132D;

    /* renamed from: E */
    private final InterfaceC0765j f135133E;

    /* renamed from: F */
    private int f135134F;

    /* renamed from: G */
    private int f135135G;

    /* renamed from: H */
    private int f135136H;

    /* renamed from: I */
    private String f135137I;

    /* renamed from: J */
    private long f135138J;

    /* renamed from: K */
    private C31973j5 f135139K;

    /* renamed from: L */
    private final InterfaceC20094a f135140L;

    /* renamed from: t */
    private final C18557q f135141t;

    /* renamed from: u */
    private ArrayList f135142u;

    /* renamed from: v */
    private final ArrayList f135143v;

    /* renamed from: w */
    private final C18557q f135144w;

    /* renamed from: x */
    private final ArrayList f135145x;

    /* renamed from: y */
    private int f135146y;

    /* renamed from: z */
    private boolean f135147z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wo0.q0$a */
    /* loaded from: classes7.dex */
    public class a implements InterfaceC20094a {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m145670e() {
            ((InterfaceC26859d) C29165q0.this.m103742Dp()).mo138216N5(C29165q0.this.f135136H);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ int m145671f(C21789d c21789d, C21789d c21789d2) {
            String str;
            int i11 = c21789d.f105759d;
            int i12 = c21789d2.f105759d;
            if (i11 > i12) {
                return -1;
            }
            if (i11 < i12) {
                return 1;
            }
            if (c21789d.f105757b) {
                return -1;
            }
            if (c21789d2.f105757b) {
                return 1;
            }
            ContactProfile contactProfile = c21789d.f105756a;
            String str2 = "";
            if (contactProfile == null) {
                str = "";
            } else {
                str = contactProfile.f42440t;
            }
            ContactProfile contactProfile2 = c21789d2.f105756a;
            if (contactProfile2 != null) {
                str2 = contactProfile2.f42440t;
            }
            boolean z11 = c21789d.f105758c;
            if (z11 && c21789d2.f105758c) {
                return str.compareToIgnoreCase(str2);
            }
            if (z11) {
                return -1;
            }
            if (c21789d2.f105758c) {
                return 1;
            }
            return str.compareToIgnoreCase(str2);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                ((InterfaceC26859d) C29165q0.this.m103742Dp()).mo138223df(c20096c);
                C29165q0.this.f135147z = false;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            ContactProfile contactProfile;
            try {
                JSONObject jSONObject = new JSONObject(obj.toString());
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (!jSONObject.isNull("error_code")) {
                    i11 = jSONObject.getInt("error_code");
                } else {
                    i11 = -999;
                }
                C29165q0.this.f135139K = new C31973j5(jSONObject2);
                if (i11 == 0) {
                    C29165q0.this.f135143v.clear();
                    C29165q0.this.f135137I = jSONObject2.optString("creatorId");
                    JSONArray optJSONArray = jSONObject2.optJSONArray("admins");
                    if (optJSONArray != null) {
                        for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                            try {
                                JSONObject jSONObject3 = (JSONObject) optJSONArray.get(i12);
                                String optString = jSONObject3.optString("id");
                                String optString2 = jSONObject3.optString("dName");
                                String optString3 = jSONObject3.optString("avatar");
                                if (!optString.equals(CoreUtility.f89233i) && !TextUtils.isEmpty(optString)) {
                                    C21789d c21789d = new C21789d(optString, 0);
                                    if (C29165q0.this.f135137I.equals(optString)) {
                                        c21789d.f105757b = true;
                                    } else {
                                        c21789d.f105758c = true;
                                    }
                                    c21789d.f105756a = C29165q0.this.m145654nq(optString, optString2, optString3);
                                    C29165q0.this.f135143v.add(c21789d);
                                }
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("currentMems");
                    if (optJSONArray2 != null) {
                        for (int i13 = 0; i13 < optJSONArray2.length(); i13++) {
                            JSONObject jSONObject4 = (JSONObject) optJSONArray2.get(i13);
                            String optString4 = jSONObject4.optString("id");
                            String optString5 = jSONObject4.optString("dName");
                            String optString6 = jSONObject4.optString("avatar");
                            if (!optString4.equals(CoreUtility.f89233i) && !TextUtils.isEmpty(optString4)) {
                                boolean equals = C29165q0.this.f135137I.equals(optString4);
                                if (C29165q0.this.f135139K.m153742T() || equals || C29165q0.this.f135139K == null || !C30202c.f140315a.m148952c(C29165q0.this.f135139K) || !C29165q0.this.f135139K.m153768k0()) {
                                    C21789d c21789d2 = new C21789d(optString4, 0);
                                    c21789d2.f105757b = equals;
                                    c21789d2.f105756a = C29165q0.this.m145654nq(optString4, optString5, optString6);
                                    C29165q0.this.f135143v.add(c21789d2);
                                }
                            }
                        }
                    }
                    Iterator it = C29165q0.this.f135143v.iterator();
                    while (it.hasNext()) {
                        C21789d c21789d3 = (C21789d) it.next();
                        if (c21789d3.f105759d == 0) {
                            if (CoreUtility.f89233i.equals(c21789d3.f105756a.f42434r)) {
                                c21789d3.f105756a.f42440t = AbstractC23262x6.m120002o(AbstractC23136l9.m118743r0(AbstractC8020f0.str_you)).trim();
                            } else {
                                ContactProfile contactProfile2 = c21789d3.f105756a;
                                contactProfile2.f42440t = AbstractC23262x6.m120002o(contactProfile2.m40383Q(true, false)).trim();
                            }
                        }
                    }
                    C29165q0.this.f135136H = jSONObject2.optInt("totalMembers");
                    C29165q0.this.f135136H--;
                    ((InterfaceC26859d) C29165q0.this.m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.o0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C29165q0.a.this.m145670e();
                        }
                    });
                    Collections.sort(C29165q0.this.f135143v, new Comparator() { // from class: wo0.p0
                        @Override // java.util.Comparator
                        public final int compare(Object obj2, Object obj3) {
                            int m145671f;
                            m145671f = C29165q0.a.m145671f((C21789d) obj2, (C21789d) obj3);
                            return m145671f;
                        }
                    });
                    if (!C29165q0.this.f135143v.isEmpty() && C29165q0.this.f135143v.size() < AbstractC23309i.m121262O7() && C29165q0.this.f135131C) {
                        C29165q0.this.f135131C = false;
                        C29165q0.this.f135141t.m97962b();
                        Iterator it2 = C29165q0.this.f135143v.iterator();
                        while (it2.hasNext()) {
                            C21789d c21789d4 = (C21789d) it2.next();
                            if (c21789d4 != null && (contactProfile = c21789d4.f105756a) != null && contactProfile.m40366G0() && !C29165q0.this.f135141t.m97963c(contactProfile) && !contactProfile.f42434r.equals(CoreUtility.f89233i)) {
                                C29165q0.this.mo138200P(contactProfile);
                            }
                        }
                    }
                    ((InterfaceC26859d) C29165q0.this.m103742Dp()).mo138228rr(C29165q0.this.f135141t.m97969j());
                }
                C29165q0.this.f135147z = false;
                C29165q0.this.m145625Eq();
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    /* renamed from: wo0.q0$b */
    /* loaded from: classes7.dex */
    class b implements InterfaceC20094a {
        b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C29165q0.this.f135129A = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            JSONArray optJSONArray;
            try {
                try {
                    jSONObject = new JSONObject(obj.toString());
                } catch (Exception e11) {
                    AbstractC23350e.m122774d("CreateGCallPresenter", e11.toString());
                }
                if (jSONObject.isNull("data")) {
                    return;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (!jSONObject2.isNull("onlines") && (optJSONArray = jSONObject2.optJSONArray("onlines")) != null) {
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        try {
                            String optString = optJSONArray.getJSONObject(i11).optString("userId");
                            if (!CoreUtility.f89233i.equals(optString) && !C21927m.m114302u().m114312J().m153137g(optString)) {
                                C29165q0.this.f135145x.add(optString);
                            }
                        } catch (Exception e12) {
                            AbstractC23350e.m122774d("CreateGCallPresenter", e12.toString());
                        }
                    }
                }
            } finally {
                C29165q0.this.f135129A = false;
                C29165q0.this.m145625Eq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wo0.q0$c */
    /* loaded from: classes7.dex */
    public class c extends Thread {

        /* renamed from: p */
        final String f135150p;

        c(String str) {
            super("Z:CreateGCall-Search");
            this.f135150p = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m145674c() {
            if (TextUtils.isEmpty(((InterfaceC26859d) C29165q0.this.m103742Dp()).mo138212E2().trim())) {
                C29165q0.this.m145665Bq();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m145675d(ArrayList arrayList) {
            try {
                if (TextUtils.equals(((InterfaceC26859d) C29165q0.this.m103742Dp()).mo138212E2().trim(), this.f135150p)) {
                    C29165q0.this.f135142u = arrayList;
                    ((InterfaceC26859d) C29165q0.this.m103742Dp()).mo138220Vc(C29165q0.this.f135142u);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ContactProfile contactProfile;
            try {
                final ArrayList arrayList = new ArrayList();
                if (TextUtils.isEmpty(this.f135150p)) {
                    ((InterfaceC26859d) C29165q0.this.m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.r0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C29165q0.c.this.m145674c();
                        }
                    });
                    return;
                }
                String m120002o = AbstractC23262x6.m120002o(this.f135150p);
                Iterator it = C29165q0.this.f135143v.iterator();
                while (it.hasNext()) {
                    C21789d c21789d = (C21789d) it.next();
                    if (c21789d.f105759d == 0 && (contactProfile = c21789d.f105756a) != null) {
                        String str = contactProfile.f42440t;
                        if (!TextUtils.isEmpty(str) && str.contains(m120002o)) {
                            c21789d.f105756a.f42399a1.clear();
                            int indexOf = str.indexOf(m120002o);
                            if (indexOf != -1) {
                                int length = m120002o.length() + indexOf;
                                c21789d.f105756a.f42399a1.add(Integer.valueOf(indexOf));
                                c21789d.f105756a.f42399a1.add(Integer.valueOf(length));
                            }
                            arrayList.add(c21789d);
                        }
                    }
                }
                ((InterfaceC26859d) C29165q0.this.m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.s0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C29165q0.c.this.m145675d(arrayList);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C29165q0(InterfaceC26859d interfaceC26859d) {
        super(interfaceC26859d);
        this.f135141t = new C18557q();
        this.f135142u = new ArrayList();
        this.f135143v = new ArrayList();
        this.f135144w = new C18557q();
        this.f135145x = new ArrayList();
        this.f135146y = 9;
        this.f135147z = false;
        this.f135129A = false;
        this.f135130B = 5;
        this.f135131C = true;
        this.f135132D = AbstractC23136l9.m118743r0(AbstractC8020f0.str_alphabe);
        this.f135133E = new C0766k();
        this.f135135G = 0;
        this.f135136H = 0;
        this.f135137I = "";
        this.f135138J = 0L;
        this.f135139K = null;
        this.f135140L = new b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Aq */
    private void m145622Aq() {
        this.f135144w.m97962b();
        C18635e mo98465a = C18644n.m98531l().mo98465a(null, true);
        int m122127lb = AbstractC23309i.m122127lb();
        int size = mo98465a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                ContactProfile contactProfile = (ContactProfile) mo98465a.get(i11);
                if (!contactProfile.f42434r.equals(CoreUtility.f89233i) && !AbstractC25495a.m132086k(contactProfile.f42434r) && !AbstractC25495a.m132078c(contactProfile.f42434r) && (m122127lb != 1 || contactProfile.f42382U0 != 0)) {
                    contactProfile.f42399a1.clear();
                    this.f135144w.m97961a(contactProfile);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        m145653mq();
    }

    /* renamed from: Cq */
    private void m145623Cq() {
        Iterator it = this.f135141t.m97964d().iterator();
        while (it.hasNext()) {
            ContactProfile contactProfile = (ContactProfile) it.next();
            if (!this.f135144w.m97963c(contactProfile)) {
                this.f135141t.m97967g(contactProfile);
            }
        }
        final ArrayList m97964d = this.f135141t.m97964d();
        ((InterfaceC26859d) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.i0
            @Override // java.lang.Runnable
            public final void run() {
                C29165q0.this.m145663xq(m97964d);
            }
        });
    }

    /* renamed from: Dq */
    private void m145624Dq(C20644a c20644a) {
        this.f135134F = c20644a.f101569b;
        try {
            this.f135135G = Integer.parseInt(c20644a.f101568a);
        } catch (NumberFormatException unused) {
            this.f135135G = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Eq */
    public void m145625Eq() {
        ContactProfile contactProfile;
        if (!this.f135129A && !this.f135147z) {
            try {
                Iterator it = this.f135143v.iterator();
                while (it.hasNext()) {
                    C21789d c21789d = (C21789d) it.next();
                    if (c21789d != null && (contactProfile = c21789d.f105756a) != null && this.f135145x.contains(contactProfile.f42434r)) {
                        c21789d.f105756a.f42430p1 = true;
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (this.f135135G > 0) {
                this.f135143v.add(0, new C21789d(2, false, AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_groupcall_select_list_title_in_group) + " (" + this.f135136H + ")"));
                m145651kq(this.f135143v, 1, this.f135139K);
            } else {
                this.f135143v.add(0, new C21789d(2, false, AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_groupcall_select_list_title) + " (" + this.f135136H + ")"));
            }
            m145665Bq();
        }
    }

    /* renamed from: kq */
    private void m145651kq(ArrayList arrayList, int i11, C31973j5 c31973j5) {
        if (c31973j5 != null && C30202c.f140315a.m148952c(c31973j5) && c31973j5.m153768k0()) {
            C21789d c21789d = new C21789d(1);
            if (c31973j5.m153742T()) {
                c21789d.f105763h = AbstractC23136l9.m118743r0(AbstractC8020f0.str_view_members_for_admins);
            } else {
                ZaloView mo138226k = ((InterfaceC26859d) m103742Dp()).mo138226k();
                c21789d.f105763h = C20380b.m106164c(mo138226k.m92689tK(), mo138226k, AbstractC23136l9.m118743r0(AbstractC8020f0.str_hide_members_group_call_for_other), "gr_call_member_list", null);
            }
            arrayList.add(i11, c21789d);
        }
    }

    /* renamed from: lq */
    private void m145652lq(ArrayList arrayList) {
        try {
            Iterator it = arrayList.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (this.f135141t.m97965e().contains(str)) {
                    this.f135141t.m97968h(str);
                    z11 = true;
                }
            }
            if (z11) {
                final ArrayList m97964d = this.f135141t.m97964d();
                ((InterfaceC26859d) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C29165q0.this.m145656qq(m97964d);
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mq */
    private void m145653mq() {
        this.f135143v.clear();
        this.f135136H = 0;
        Iterator it = this.f135144w.m97964d().iterator();
        while (it.hasNext()) {
            ContactProfile contactProfile = (ContactProfile) it.next();
            if (contactProfile != null && contactProfile.m40366G0()) {
                C21789d c21789d = new C21789d(contactProfile.f42434r, 0);
                c21789d.f105757b = false;
                c21789d.f105758c = false;
                c21789d.f105756a = contactProfile;
                this.f135143v.add(c21789d);
                this.f135136H++;
            } else if (contactProfile != null && !contactProfile.m40366G0()) {
                this.f135143v.add(new C21789d(5, contactProfile.f42407e1, contactProfile.f42437s));
            }
        }
        m145625Eq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nq */
    public ContactProfile m145654nq(String str, String str2, String str3) {
        ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
        if (m141809c == null || TextUtils.isEmpty(m141809c.f42437s) || TextUtils.isEmpty(m141809c.f42446v)) {
            m141809c = new ContactProfile(str);
            m141809c.f42437s = str2;
            m141809c.f42446v = str3;
            m141809c.f42330D = System.currentTimeMillis();
            C7960e.m41971c6().m42221O7(m141809c, false);
        }
        if (CoreUtility.f89233i.equals(str)) {
            ContactProfile contactProfile = new ContactProfile(str);
            contactProfile.f42437s = str2;
            contactProfile.f42446v = str3;
            contactProfile.f42330D = System.currentTimeMillis();
            return contactProfile;
        }
        return m141809c;
    }

    /* renamed from: oq */
    private void m145655oq() {
        if (this.f135129A) {
            return;
        }
        this.f135129A = true;
        this.f135133E.mo1704o8(this.f135140L);
        this.f135133E.mo1598a9();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qq */
    public /* synthetic */ void m145656qq(ArrayList arrayList) {
        ((InterfaceC26859d) m103742Dp()).mo138230tv(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rq */
    public /* synthetic */ void m145657rq() {
        if (this.f135141t.m97969j() > 0) {
            ((InterfaceC26859d) m103742Dp()).mo138229rt();
        } else {
            ((InterfaceC26859d) m103742Dp()).mo138218Td();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sq */
    public /* synthetic */ void m145658sq() {
        ((InterfaceC26859d) m103742Dp()).mo138222ct();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tq */
    public /* synthetic */ void m145659tq(ArrayList arrayList) {
        ((InterfaceC26859d) m103742Dp()).mo138230tv(arrayList);
        ((InterfaceC26859d) m103742Dp()).mo138221Xx(arrayList.size() - 1);
        ((InterfaceC26859d) m103742Dp()).mo138213EI();
        ((InterfaceC26859d) m103742Dp()).mo138227pl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uq */
    public /* synthetic */ void m145660uq() {
        ((InterfaceC26859d) m103742Dp()).mo138231xC(this.f135146y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vq */
    public /* synthetic */ void m145661vq(int i11, ArrayList arrayList) {
        if (i11 < this.f135146y) {
            ((InterfaceC26859d) m103742Dp()).mo138227pl();
        }
        ((InterfaceC26859d) m103742Dp()).mo138230tv(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wq */
    public /* synthetic */ void m145662wq() {
        ((InterfaceC26859d) m103742Dp()).mo138219Ut(this.f135142u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xq */
    public /* synthetic */ void m145663xq(ArrayList arrayList) {
        ((InterfaceC26859d) m103742Dp()).mo138230tv(arrayList);
    }

    /* renamed from: yq */
    private void m145664yq() {
        String m153756e;
        String str = "";
        try {
            if (!AbstractC23057e7.m118300g(MainApplication.getAppContext())) {
                if (C23055e5.m118272g(true)) {
                    if (C20024r.m103941j()) {
                        ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_warning_make_newcall_while_calling));
                        return;
                    }
                    if (!((InterfaceC26859d) m103742Dp()).mo138224di()) {
                        ((InterfaceC26859d) m103742Dp()).mo138214Ep();
                        return;
                    }
                    ((InterfaceC26859d) m103742Dp()).mo138215M9();
                    C31973j5 m4472f = C0943w.m4462l().m4472f(this.f135135G + "");
                    if (m4472f != null && m4472f.m153716G() != 0) {
                        str = m4472f.m153793y();
                    }
                    String str2 = str;
                    if (m4472f == null) {
                        m153756e = C31973j5.m153702i();
                    } else {
                        m153756e = m4472f.m153756e();
                    }
                    AbstractC23306f.m120725x0().m101508a(new C2280b.a(this.f135141t.m97964d(), this.f135135G, str2, m153756e, this.f135134F, null));
                    return;
                }
                return;
            }
            ((InterfaceC26859d) m103742Dp()).mo138225ii();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // to0.InterfaceC26858c
    /* renamed from: Ak */
    public void mo138195Ak() {
        try {
            if (C23055e5.m118271f()) {
                if (this.f135135G > 0) {
                    m145666pq();
                }
            } else {
                ((InterfaceC26859d) m103742Dp()).mo138217Ql();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Bq */
    public void m145665Bq() {
        try {
            try {
                this.f135142u.clear();
                int size = this.f135143v.size();
                for (int i11 = 0; i11 < size; i11++) {
                    try {
                        ContactProfile contactProfile = ((C21789d) this.f135143v.get(i11)).f105756a;
                        if (contactProfile != null) {
                            contactProfile.f42399a1.clear();
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                this.f135142u.addAll(this.f135143v);
                ((InterfaceC26859d) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.g0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C29165q0.this.m145662wq();
                    }
                });
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        } finally {
            mo138203Yc();
        }
    }

    @Override // to0.InterfaceC26858c
    /* renamed from: Ec */
    public void mo138196Ec() {
        try {
            String str = "";
            int i11 = this.f135134F;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            if (i11 != 8) {
                                if (i11 == 9) {
                                    str = "csc_msg_footer";
                                }
                            } else {
                                str = "quick_action";
                            }
                        } else {
                            str = "chats_list_button_plus";
                        }
                    } else {
                        str = "chats_list_header";
                    }
                } else {
                    str = "csc_attach";
                }
            } else {
                str = "csc_topbar_icon";
            }
            C0815e1.m2075D().m2100V(new C23648e(24, str, 1, "gr_call_select_member", String.valueOf(this.f135135G), String.valueOf(System.currentTimeMillis() - this.f135138J)), false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // to0.InterfaceC26858c
    /* renamed from: I6 */
    public void mo138197I6() {
        m145664yq();
    }

    @Override // to0.InterfaceC26858c
    /* renamed from: Ji */
    public void mo138198Ji() {
        C18557q c18557q = this.f135141t;
        if (c18557q != null && c18557q.m97969j() > 0) {
            m145664yq();
        }
        try {
            C0815e1.m2075D().m2100V(new C23648e(24, "gr_call_select_member", 0, "gr_call_start", String.valueOf(this.f135135G)), false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // to0.InterfaceC26858c
    /* renamed from: Nm */
    public ArrayList mo138199Nm() {
        return this.f135142u;
    }

    @Override // to0.InterfaceC26858c
    /* renamed from: P */
    public void mo138200P(ContactProfile contactProfile) {
        if (contactProfile == null) {
            return;
        }
        ((InterfaceC26859d) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.k0
            @Override // java.lang.Runnable
            public final void run() {
                C29165q0.this.m145658sq();
            }
        });
        if (!this.f135141t.m97963c(contactProfile)) {
            if (this.f135141t.m97969j() < this.f135146y) {
                this.f135141t.m97961a(contactProfile);
                final ArrayList m97964d = this.f135141t.m97964d();
                ((InterfaceC26859d) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C29165q0.this.m145659tq(m97964d);
                    }
                });
            } else {
                ((InterfaceC26859d) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.m0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C29165q0.this.m145660uq();
                    }
                });
            }
        } else {
            this.f135141t.m97967g(contactProfile);
            final int m97969j = this.f135141t.m97969j();
            final ArrayList m97964d2 = this.f135141t.m97964d();
            ((InterfaceC26859d) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.n0
                @Override // java.lang.Runnable
                public final void run() {
                    C29165q0.this.m145661vq(m97969j, m97964d2);
                }
            });
        }
        ((InterfaceC26859d) m103742Dp()).mo138228rr(this.f135141t.m97969j());
        mo138203Yc();
    }

    @Override // to0.InterfaceC26858c
    /* renamed from: Sm */
    public void mo138201Sm() {
        ((InterfaceC26859d) m103742Dp()).mo138222ct();
        ((InterfaceC26859d) m103742Dp()).mo138215M9();
    }

    @Override // to0.InterfaceC26858c
    /* renamed from: T5 */
    public void mo138202T5() {
        this.f135138J = System.currentTimeMillis();
    }

    @Override // to0.InterfaceC26858c
    /* renamed from: Yc */
    public void mo138203Yc() {
        ((InterfaceC26859d) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.h0
            @Override // java.lang.Runnable
            public final void run() {
                C29165q0.this.m145657rq();
            }
        });
    }

    @Override // to0.InterfaceC26858c
    /* renamed from: c4 */
    public void mo138204c4(Object... objArr) {
        C31973j5 m4472f;
        if (objArr != null && objArr.length >= 3) {
            String str = (String) objArr[0];
            if (TextUtils.equals(this.f135135G + "", str)) {
                int intValue = ((Integer) objArr[1]).intValue();
                ArrayList arrayList = new ArrayList(Arrays.asList(TextUtils.split((String) objArr[2], ";")));
                boolean contains = arrayList.contains(CoreUtility.f89233i);
                C31973j5 c31973j5 = this.f135139K;
                if (!arrayList.isEmpty()) {
                    if (intValue != 1) {
                        if (intValue != 2) {
                            if (intValue != 3) {
                                if (intValue != 4 && intValue != 10) {
                                    if (intValue != 11) {
                                        return;
                                    }
                                } else {
                                    if (contains) {
                                        ((InterfaceC26859d) m103742Dp()).mo138215M9();
                                        return;
                                    }
                                    m145652lq(arrayList);
                                    if (!this.f135147z) {
                                        m145666pq();
                                        return;
                                    }
                                    return;
                                }
                            }
                        } else {
                            if (c31973j5 != null && C30202c.f140315a.m148952c(c31973j5) && c31973j5.m153768k0()) {
                                if (contains) {
                                    this.f135131C = true;
                                } else if (!c31973j5.m153742T()) {
                                    m145652lq(arrayList);
                                }
                            }
                            if (!this.f135147z) {
                                m145666pq();
                                return;
                            }
                            return;
                        }
                    }
                    if (!this.f135147z) {
                        m145666pq();
                        return;
                    }
                    return;
                }
                if (intValue == 9 && (m4472f = C0943w.m4462l().m4472f(str)) != null && c31973j5 != null && m4472f.m153768k0() != c31973j5.m153768k0()) {
                    if (C30202c.f140315a.m148952c(c31973j5) && !c31973j5.m153742T()) {
                        this.f135131C = true;
                    }
                    if (!this.f135147z) {
                        m145666pq();
                    }
                }
            }
        }
    }

    @Override // to0.InterfaceC26858c
    /* renamed from: cj */
    public boolean mo138205cj(int i11) {
        if (i11 == 3) {
            ((InterfaceC26859d) m103742Dp()).mo138222ct();
            return true;
        }
        return false;
    }

    @Override // to0.InterfaceC26858c
    /* renamed from: d */
    public void mo138206d() {
        try {
            m145655oq();
            mo138203Yc();
            if (this.f135135G > 0) {
                m145666pq();
            } else {
                m145622Aq();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // to0.InterfaceC26858c
    /* renamed from: ea */
    public int mo138207ea() {
        return this.f135146y;
    }

    @Override // to0.InterfaceC26858c
    /* renamed from: ik */
    public HashSet mo138208ik() {
        return this.f135141t.m97965e();
    }

    @Override // to0.InterfaceC26858c
    /* renamed from: jp */
    public void mo138209jp(String str) {
        new c(str).start();
    }

    /* renamed from: pq */
    public void m145666pq() {
        if (this.f135147z) {
            return;
        }
        this.f135147z = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new a());
        c0766k.mo1387A6(this.f135135G + "");
    }

    @Override // to0.InterfaceC26858c
    /* renamed from: q7 */
    public void mo138210q7(ContactProfile contactProfile) {
        if (contactProfile != null && this.f135141t.m97963c(contactProfile)) {
            mo138200P(contactProfile);
        }
    }

    @Override // to0.InterfaceC26858c
    /* renamed from: t1 */
    public void mo138211t1() {
        if (this.f135135G <= 0) {
            mo138206d();
            m145623Cq();
        }
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: zq, reason: merged with bridge method [inline-methods] */
    public void mo995Nd(C20644a c20644a, InterfaceC19968g interfaceC19968g) {
        super.mo995Nd(c20644a, interfaceC19968g);
        this.f135146y = AbstractC23309i.m121262O7() - 1;
        m145624Dq(c20644a);
    }
}
