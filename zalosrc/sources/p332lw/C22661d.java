package p332lw;

import ae.C0766k;
import ag0.AbstractC0837p0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17961f1;
import dj.C17969i0;
import dj.C18009w0;
import dj.C18013y0;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23112j7;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONObject;
import p185gc.AbstractC19378b;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23306f;
import p716zh.C32098s;
import p716zh.C32204z7;
import pk.C24798b;
import qm0.AbstractC25370t;
import tj.C26713e;
import vg.C28203u6;
import xd0.C29599o;

/* renamed from: lw.d */
/* loaded from: classes4.dex */
public final class C22661d {

    /* renamed from: a */
    private ZaloView f111078a;

    /* renamed from: b */
    private JSONObject f111079b;

    /* renamed from: c */
    private List f111080c = new ArrayList();

    /* renamed from: lw.d$a */
    /* loaded from: classes4.dex */
    public static final class a implements C32204z7.h {

        /* renamed from: a */
        final /* synthetic */ C24798b f111081a;

        /* renamed from: b */
        final /* synthetic */ C22661d f111082b;

        /* renamed from: c */
        final /* synthetic */ JSONArray f111083c;

        /* renamed from: d */
        final /* synthetic */ String f111084d;

        /* renamed from: e */
        final /* synthetic */ int f111085e;

        /* renamed from: f */
        final /* synthetic */ String f111086f;

        a(C24798b c24798b, C22661d c22661d, JSONArray jSONArray, String str, int i11, String str2) {
            this.f111081a = c24798b;
            this.f111082b = c22661d;
            this.f111083c = jSONArray;
            this.f111084d = str;
            this.f111085e = i11;
            this.f111086f = str2;
        }

        @Override // p716zh.C32204z7.h
        /* renamed from: a */
        public void mo64439a(String str, int i11) {
            this.f111081a.m128820i(1);
            C24798b c24798b = this.f111081a;
            c24798b.m128819h(c24798b.m128817f());
            this.f111082b.m117278h().add(this.f111081a);
            this.f111082b.m117266k(this.f111083c, this.f111084d, this.f111085e + 1, this.f111086f);
        }

        @Override // p716zh.C32204z7.h
        /* renamed from: b */
        public void mo64440b(String str, C18013y0 c18013y0) {
            AbstractC19074t.m100208f(str, "input");
            AbstractC19074t.m100208f(c18013y0, "data");
            this.f111081a.m128818g(c18013y0);
            this.f111082b.m117278h().add(this.f111081a);
            this.f111082b.m117266k(this.f111083c, this.f111084d, this.f111085e + 1, this.f111086f);
        }

        @Override // p716zh.C32204z7.h
        /* renamed from: c */
        public void mo64441c(String str, String str2) {
            AbstractC19074t.m100208f(str, "input");
            AbstractC19074t.m100208f(str2, "thumbPath");
        }
    }

    /* renamed from: lw.d$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC20094a {
        b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C22661d.this.m117264i(false);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            boolean z11;
            ContactProfile contactProfile;
            if (obj != null) {
                try {
                    contactProfile = new ContactProfile((JSONObject) obj);
                    if (C7960e.m41971c6() != null) {
                        String str = contactProfile.f42434r;
                        AbstractC19074t.m100207e(str, "uid");
                        if (str.length() > 0 && !AbstractC19074t.m100204b(contactProfile.f42434r, "null")) {
                            C7960e.m41971c6().m42221O7(contactProfile, AbstractC21935u.m114558y(contactProfile.f42434r));
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    z11 = false;
                } catch (Throwable th2) {
                    th = th2;
                    z11 = false;
                }
                try {
                    C22661d c22661d = C22661d.this;
                    JSONObject m117277g = c22661d.m117277g();
                    AbstractC19074t.m100205c(m117277g);
                    c22661d.m117273r(m117277g, contactProfile.f42434r);
                    return;
                } catch (Exception e12) {
                    e = e12;
                    z11 = true;
                    try {
                        AbstractC23350e.m122778h(e);
                        if (z11) {
                            return;
                        }
                        C22661d.this.m117264i(false);
                    } catch (Throwable th3) {
                        th = th3;
                        if (!z11) {
                            C22661d.this.m117264i(false);
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    z11 = true;
                    if (!z11) {
                    }
                    throw th;
                }
            }
            C22661d.this.m117264i(false);
        }
    }

    public C22661d(ZaloView zaloView, JSONObject jSONObject) {
        this.f111078a = zaloView;
        this.f111079b = jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final void m117264i(final boolean z11) {
        AbstractC19444a.m101697e(new Runnable() { // from class: lw.c
            @Override // java.lang.Runnable
            public final void run() {
                C22661d.m117265j(C22661d.this, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m117265j(C22661d c22661d, boolean z11) {
        AbstractC19074t.m100208f(c22661d, "this$0");
        ZaloView zaloView = c22661d.f111078a;
        if (zaloView instanceof BaseZaloView) {
            AbstractC19074t.m100206d(zaloView, "null cannot be cast to non-null type com.zing.zalo.ui.zviews.BaseZaloView");
            ((BaseZaloView) zaloView).mo49315c4();
        }
        if (z11) {
            ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_save_msg_successfully, AbstractC21935u.m114547n()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final void m117266k(JSONArray jSONArray, String str, int i11, String str2) {
        try {
            if (i11 == jSONArray.length()) {
                if (str2.length() > 0) {
                    List list = this.f111080c;
                    C24798b c24798b = new C24798b(0, null, null, null, null, null, false, 0, 0, 0L, null, 0L, 0, null, null, null, 65535, null);
                    c24798b.m128820i(1);
                    c24798b.m128819h(str2);
                    list.add(c24798b);
                }
                m117274s(str);
                return;
            }
            C24798b c24798b2 = new C24798b(jSONArray.getJSONObject(i11));
            int m128816e = c24798b2.m128816e();
            if (m128816e != 1 && m128816e != 32) {
                if (m128816e != 38) {
                    if (m128816e != 44 && m128816e != 46) {
                        return;
                    }
                } else {
                    C32204z7.Companion.m155281c().m155277x(c24798b2.m128817f(), false, false, 0, new a(c24798b2, this, jSONArray, str, i11, str2));
                    return;
                }
            }
            this.f111080c.add(c24798b2);
            m117266k(jSONArray, str, i11 + 1, str2);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            m117264i(false);
        }
    }

    /* renamed from: l */
    private final void m117267l(String str, C24798b c24798b) {
        if (str != null && str.length() != 0 && c24798b != null) {
            AbstractC23112j7.m118552r0(str, c24798b.m128812a(), -1, null, "chat_send", C23793c.Companion.m124321a().mo124319c());
        }
    }

    /* renamed from: m */
    private final void m117268m(String str, List list) {
        int m131511r;
        if (str != null && str.length() != 0 && !list.isEmpty()) {
            long currentTimeMillis = System.currentTimeMillis();
            C29599o m120694n1 = AbstractC23306f.m120694n1();
            AbstractC19074t.m100207e(m120694n1, "provideSendMessageUseCase(...)");
            List list2 = list;
            m131511r = AbstractC25370t.m131511r(list2, 10);
            ArrayList<C17945a0> arrayList = new ArrayList(m131511r);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((C24798b) it.next()).m128812a());
            }
            int i11 = 0;
            for (C17945a0 c17945a0 : arrayList) {
                if (c17945a0.m95306y8()) {
                    C17969i0 m94929K2 = c17945a0.m94929K2();
                    AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentVideo");
                    C17961f1 c17961f1 = (C17961f1) m94929K2;
                    c17961f1.m95474d0(currentTimeMillis);
                    c17961f1.m95475e0(list.size());
                    c17961f1.m95480h0(i11);
                    c17961f1.m95467U(true);
                } else if (c17945a0.m94871D7()) {
                    C17969i0 m94929K22 = c17945a0.m94929K2();
                    AbstractC19074t.m100206d(m94929K22, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentPhoto");
                    C18009w0 c18009w0 = (C18009w0) m94929K22;
                    c18009w0.m95754T(currentTimeMillis);
                    c18009w0.m95755U(list.size());
                    c18009w0.m95760Z(i11);
                    c18009w0.m95746K(true);
                }
                AbstractC19378b.m101499c(m120694n1, new C29599o.a(str, c17945a0, false, null, 12, null), null, 2, null);
                i11++;
            }
        }
    }

    /* renamed from: n */
    private final void m117269n(String str, C24798b c24798b) {
        C26713e c26713e;
        C32098s c32098s;
        if (str != null && str.length() != 0 && c24798b != null) {
            MessageId.C7932a c7932a = MessageId.Companion;
            String m103086b = AbstractC23306f.m120599M0().m103086b();
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            C17945a0.w m95368d = new C17945a0.w(c7932a.m41064b(m103086b, "", str, str2), 12).m95382r(c24798b.m128815d()).m95368d(c24798b.m128813b());
            C18013y0 m128813b = c24798b.m128813b();
            if (m128813b != null && (c32098s = m128813b.f91251B) != null) {
                c26713e = c32098s.f147968r;
            } else {
                c26713e = null;
            }
            C17945a0 m95365a = m95368d.m95383s(c26713e).m95365a();
            AbstractC19074t.m100207e(m95365a, "build(...)");
            m95365a.m94951M9();
            C29599o m120694n1 = AbstractC23306f.m120694n1();
            AbstractC19074t.m100207e(m120694n1, "provideSendMessageUseCase(...)");
            AbstractC19378b.m101499c(m120694n1, new C29599o.a(str, m95365a, false, null, 12, null), null, 2, null);
        }
    }

    /* renamed from: o */
    private final void m117270o(String str, C24798b c24798b) {
        if (str != null && str.length() != 0 && c24798b != null) {
            C29599o m120694n1 = AbstractC23306f.m120694n1();
            AbstractC19074t.m100207e(m120694n1, "provideSendMessageUseCase(...)");
            AbstractC19378b.m101499c(m120694n1, new C29599o.a(str, c24798b.m128812a(), false, null, 12, null), null, 2, null);
        }
    }

    /* renamed from: p */
    private final void m117271p(String str, C24798b c24798b) {
        if (str != null && str.length() != 0 && c24798b != null) {
            AbstractC23112j7.m118532h0(str, c24798b.m128815d());
        }
    }

    /* renamed from: q */
    private final void m117272q(String str, C24798b c24798b) {
        if (str != null && str.length() != 0 && c24798b != null) {
            C29599o m120694n1 = AbstractC23306f.m120694n1();
            AbstractC19074t.m100207e(m120694n1, "provideSendMessageUseCase(...)");
            AbstractC19378b.m101499c(m120694n1, new C29599o.a(str, c24798b.m128812a(), false, null, 12, null), null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final void m117273r(JSONObject jSONObject, String str) {
        String str2;
        JSONArray optJSONArray;
        boolean z11 = false;
        try {
            try {
                if (jSONObject.has("caption")) {
                    str2 = jSONObject.optString("caption");
                } else {
                    str2 = "";
                }
                if (jSONObject.has("items") && (optJSONArray = jSONObject.optJSONArray("items")) != null) {
                    if (optJSONArray.length() > 0) {
                        try {
                            AbstractC19074t.m100205c(str2);
                            m117266k(optJSONArray, str, 0, str2);
                            return;
                        } catch (Exception e11) {
                            e = e11;
                            z11 = true;
                            AbstractC23350e.m122778h(e);
                            if (z11) {
                                return;
                            }
                            m117264i(true);
                        } catch (Throwable th2) {
                            th = th2;
                            z11 = true;
                            if (!z11) {
                                m117264i(true);
                            }
                            throw th;
                        }
                    }
                }
            } catch (Exception e12) {
                e = e12;
            }
            m117264i(true);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: s */
    private final void m117274s(String str) {
        if (str != null && str.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (C24798b c24798b : this.f111080c) {
                int m128816e = c24798b.m128816e();
                if (m128816e != 1) {
                    if (m128816e != 32) {
                        if (m128816e != 38) {
                            if (m128816e != 44) {
                                if (m128816e == 46) {
                                    if (true ^ arrayList.isEmpty()) {
                                        m117268m(str, arrayList);
                                        arrayList.clear();
                                    }
                                    m117267l(str, c24798b);
                                }
                            } else if (c24798b.m128814c()) {
                                arrayList.add(c24798b);
                            } else {
                                if (true ^ arrayList.isEmpty()) {
                                    m117268m(str, arrayList);
                                    arrayList.clear();
                                }
                                m117272q(str, c24798b);
                            }
                        } else {
                            if (true ^ arrayList.isEmpty()) {
                                m117268m(str, arrayList);
                                arrayList.clear();
                            }
                            m117269n(str, c24798b);
                        }
                    } else if (c24798b.m128814c()) {
                        arrayList.add(c24798b);
                    } else {
                        if (true ^ arrayList.isEmpty()) {
                            m117268m(str, arrayList);
                            arrayList.clear();
                        }
                        m117270o(str, c24798b);
                    }
                } else {
                    if (true ^ arrayList.isEmpty()) {
                        m117268m(str, arrayList);
                        arrayList.clear();
                    }
                    m117271p(str, c24798b);
                }
            }
            if (!arrayList.isEmpty()) {
                m117268m(str, arrayList);
                arrayList.clear();
            }
            m117264i(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final void m117275u(C22661d c22661d) {
        AbstractC19074t.m100208f(c22661d, "this$0");
        ZaloView zaloView = c22661d.f111078a;
        if (zaloView instanceof BaseZaloView) {
            AbstractC19074t.m100206d(zaloView, "null cannot be cast to non-null type com.zing.zalo.ui.zviews.BaseZaloView");
            ((BaseZaloView) zaloView).mo46829Y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m117276v(C22661d c22661d) {
        AbstractC19074t.m100208f(c22661d, "this$0");
        ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, "204278670", null, 2, null);
        if (m141798e == null) {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new b());
            c0766k.mo1514Q4("204278670", 0, new TrackingSource((short) 1025));
        } else {
            JSONObject jSONObject = c22661d.f111079b;
            AbstractC19074t.m100205c(jSONObject);
            c22661d.m117273r(jSONObject, m141798e.f42434r);
        }
    }

    /* renamed from: g */
    public final JSONObject m117277g() {
        return this.f111079b;
    }

    /* renamed from: h */
    public final List m117278h() {
        return this.f111080c;
    }

    /* renamed from: t */
    public final void m117279t() {
        if (this.f111079b == null) {
            return;
        }
        AbstractC19444a.m101697e(new Runnable() { // from class: lw.a
            @Override // java.lang.Runnable
            public final void run() {
                C22661d.m117275u(C22661d.this);
            }
        });
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: lw.b
            @Override // java.lang.Runnable
            public final void run() {
                C22661d.m117276v(C22661d.this);
            }
        });
    }
}
