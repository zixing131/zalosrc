package ag0;

import ae.C0766k;
import ag0.C0856z;
import am.AbstractC0939u;
import am.C0927o;
import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import b40.C2526d;
import bn.C2852a1;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import me0.AbstractC23089h6;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import me0.AbstractC23244v8;
import me0.C23055e5;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p185gc.AbstractC19378b;
import p227i3.C20217u;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.C23648e;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p495rx.C25994h;
import p716zh.C31931g8;
import p716zh.C31973j5;
import pm0.C24848g0;
import qm0.AbstractC25368s;
import wd0.C28931k;

/* renamed from: ag0.z */
/* loaded from: classes6.dex */
public final class C0856z {
    public static final a Companion = new a(null);

    /* renamed from: d */
    private static int f3107d;

    /* renamed from: a */
    private final Object f3108a = new Object();

    /* renamed from: b */
    private final Map f3109b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    private volatile boolean f3110c;

    /* renamed from: ag0.z$a */
    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: ag0.z$a$a */
        /* loaded from: classes6.dex */
        public static final class C32619a {

            /* renamed from: a */
            public static final C32619a f3111a = new C32619a();

            /* renamed from: b */
            private static final C0856z f3112b = new C0856z();

            private C32619a() {
            }

            /* renamed from: a */
            public final C0856z m2419a() {
                return f3112b;
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final long m2415a() {
            long currentTimeMillis = System.currentTimeMillis();
            int m2417c = m2417c();
            m2418d(m2417c + 1);
            return currentTimeMillis + m2417c;
        }

        /* renamed from: b */
        public final C0856z m2416b() {
            return C32619a.f3111a.m2419a();
        }

        /* renamed from: c */
        public final int m2417c() {
            return C0856z.f3107d;
        }

        /* renamed from: d */
        public final void m2418d(int i11) {
            C0856z.f3107d = i11;
        }
    }

    /* renamed from: ag0.z$b */
    /* loaded from: classes6.dex */
    public interface b {
        /* renamed from: eg */
        void mo2420eg(int i11, C31931g8 c31931g8, boolean z11);
    }

    /* renamed from: ag0.z$c */
    /* loaded from: classes6.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ boolean f3113a;

        /* renamed from: b */
        final /* synthetic */ C0856z f3114b;

        /* renamed from: c */
        final /* synthetic */ C31931g8 f3115c;

        /* renamed from: d */
        final /* synthetic */ boolean f3116d;

        /* renamed from: e */
        final /* synthetic */ b f3117e;

        /* renamed from: f */
        final /* synthetic */ int f3118f;

        c(boolean z11, C0856z c0856z, C31931g8 c31931g8, boolean z12, b bVar, int i11) {
            this.f3113a = z11;
            this.f3114b = c0856z;
            this.f3115c = c31931g8;
            this.f3116d = z12;
            this.f3117e = bVar;
            this.f3118f = i11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                try {
                    int m104491c = c20096c.m104491c();
                    String m104492d = c20096c.m104492d();
                    if (m104491c != -803) {
                        if (m104491c == -801) {
                            AbstractC23309i.m121059Iq(0L);
                        }
                    } else {
                        if (this.f3114b.f3109b.size() != AbstractC23309i.m122570x8()) {
                            AbstractC23309i.m121059Iq(0L);
                        }
                        b bVar = this.f3117e;
                        if (bVar != null) {
                            bVar.mo2420eg(-1, this.f3115c, true);
                        }
                    }
                    if (this.f3117e != null) {
                        ToastUtils.showMess(m104492d);
                    }
                    b bVar2 = this.f3117e;
                    if (bVar2 != null) {
                        bVar2.mo2420eg(3, this.f3115c, this.f3113a);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                this.f3114b.f3110c = false;
            } catch (Throwable th2) {
                this.f3114b.f3110c = false;
                throw th2;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x009f, code lost:            if (r6 != null) goto L72;     */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00a1, code lost:            r6.mo2420eg(3, r5.f3115c, r5.f3113a);     */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:            r5.f3114b.f3110c = false;     */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00b6, code lost:            return;     */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00b3, code lost:            if (r6 == null) goto L73;     */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            b bVar;
            int i11;
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                try {
                    int i12 = ((JSONObject) obj).getInt("error_code");
                    if (i12 == 0) {
                        if (this.f3113a) {
                            this.f3114b.m2396f(this.f3115c, true);
                            HashSet hashSet = new HashSet();
                            hashSet.add(this.f3115c.m153439k());
                            this.f3114b.m2401k(hashSet);
                        } else {
                            this.f3114b.m2409u(this.f3115c);
                        }
                        if (this.f3116d) {
                            C19669z.Companion.m103232a().m103198O0();
                        }
                        b bVar2 = this.f3117e;
                        if (bVar2 != null) {
                            bVar2.mo2420eg(2, this.f3115c, this.f3113a);
                        }
                    } else if (this.f3117e != null) {
                        C19067n0 c19067n0 = C19067n0.f94947a;
                        Context m35500c = MainApplication.Companion.m35500c();
                        if (this.f3113a) {
                            i11 = AbstractC8020f0.str_pin_msg_pin_error;
                        } else {
                            i11 = AbstractC8020f0.str_pin_msg_unpin_error;
                        }
                        String string = m35500c.getString(i11);
                        AbstractC19074t.m100207e(string, "getString(...)");
                        String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i12)}, 1));
                        AbstractC19074t.m100207e(format, "format(...)");
                        ToastUtils.showMess(format);
                    }
                    this.f3114b.m2395A(this.f3113a, this.f3115c.m153439k(), this.f3118f);
                    bVar = this.f3117e;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    bVar = this.f3117e;
                }
            } catch (Throwable th2) {
                b bVar3 = this.f3117e;
                if (bVar3 != null) {
                    bVar3.mo2420eg(3, this.f3115c, this.f3113a);
                }
                this.f3114b.f3110c = false;
                throw th2;
            }
        }
    }

    /* renamed from: ag0.z$d */
    /* loaded from: classes6.dex */
    public static final class d extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ Conversation f3119a;

        /* renamed from: b */
        final /* synthetic */ C17945a0 f3120b;

        d(Conversation conversation, C17945a0 c17945a0) {
            this.f3119a = conversation;
            this.f3120b = c17945a0;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C28931k m120612Q1 = AbstractC23306f.m120612Q1();
            AbstractC19074t.m100207e(m120612Q1, "provideUpdateLastMsgUseCase(...)");
            AbstractC19378b.m101499c(m120612Q1, new C28931k.b(this.f3119a, this.f3120b, C28931k.d.Companion.m144587c()), null, 2, null);
        }
    }

    /* renamed from: ag0.z$e */
    /* loaded from: classes6.dex */
    public static final class e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC20094a f3121a;

        e(InterfaceC20094a interfaceC20094a) {
            this.f3121a = interfaceC20094a;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            this.f3121a.mo926a(c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            this.f3121a.mo927b(obj);
        }
    }

    /* renamed from: ag0.z$f */
    /* loaded from: classes6.dex */
    public static final class f implements b {

        /* renamed from: p */
        final /* synthetic */ WeakReference f3122p;

        /* renamed from: q */
        final /* synthetic */ ContactProfile f3123q;

        f(WeakReference weakReference, ContactProfile contactProfile) {
            this.f3122p = weakReference;
            this.f3123q = contactProfile;
        }

        /* renamed from: b */
        public static final void m2422b(WeakReference weakReference, int i11, int i12, ContactProfile contactProfile) {
            AbstractC19074t.m100208f(weakReference, "$zvWeakRef");
            ZaloView zaloView = (ZaloView) weakReference.get();
            if (i11 != -1) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3 && (zaloView instanceof BaseZaloView)) {
                            ((BaseZaloView) zaloView).mo49315c4();
                            return;
                        }
                        return;
                    }
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_pin_msg_success);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    String format = String.format(m118743r0, Arrays.copyOf(new Object[]{AbstractC23089h6.m118437e(contactProfile.f42434r)}, 1));
                    AbstractC19074t.m100207e(format, "format(...)");
                    Spanned m119746j = AbstractC23244v8.m119746j(format);
                    AbstractC19074t.m100207e(m119746j, "getSpannedFromStrHtml(...)");
                    if (!TextUtils.isEmpty(m119746j)) {
                        ToastUtils.showMess(false, (CharSequence) m119746j);
                        return;
                    }
                    return;
                }
                if (zaloView instanceof BaseZaloView) {
                    ((BaseZaloView) zaloView).mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
                    return;
                }
                return;
            }
            ToastUtils.showMess(MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_pin_msg_fail_max_pin, Integer.valueOf(i12)));
        }

        @Override // ag0.C0856z.b
        /* renamed from: eg */
        public void mo2420eg(int i11, C31931g8 c31931g8, boolean z11) {
            AbstractC19074t.m100208f(c31931g8, "item");
            AbstractC19444a.m101695c(new Runnable() { // from class: ag0.a0

                /* renamed from: p */
                public final /* synthetic */ WeakReference f2769p;

                /* renamed from: q */
                public final /* synthetic */ int f2770q;

                /* renamed from: r */
                public final /* synthetic */ int f2771r;

                /* renamed from: s */
                public final /* synthetic */ ContactProfile f2772s;

                public /* synthetic */ RunnableC0802a0(WeakReference weakReference, int i112, int i12, ContactProfile contactProfile) {
                    r1 = weakReference;
                    r2 = i112;
                    r3 = i12;
                    r4 = contactProfile;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C0856z.f.m2422b(r1, r2, r3, r4);
                }
            });
        }
    }

    /* renamed from: ag0.z$g */
    /* loaded from: classes6.dex */
    public static final class g extends AbstractC0939u {
        g() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                C0856z.this.m2411w();
                HashMap m42082C6 = C7960e.m41971c6().m42082C6();
                if (m42082C6 != null) {
                    Collection values = m42082C6.values();
                    AbstractC19074t.m100207e(values, "<get-values>(...)");
                    if (!values.isEmpty()) {
                        Iterator it = values.iterator();
                        while (it.hasNext()) {
                            C0856z.this.m2396f((C31931g8) it.next(), false);
                        }
                        C0856z.this.m2407r();
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("PinMsg", e11);
            }
        }
    }

    /* renamed from: ag0.z$h */
    /* loaded from: classes6.dex */
    public static final class h implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f3125a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC20094a f3126b;

        h(String str, InterfaceC20094a interfaceC20094a) {
            this.f3125a = str;
            this.f3126b = interfaceC20094a;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            this.f3126b.mo926a(c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                if (((JSONObject) obj).optJSONObject("data") != null) {
                    AbstractC23184q2.m119438C(this.f3125a);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            this.f3126b.mo927b(obj);
        }
    }

    /* renamed from: ag0.z$i */
    /* loaded from: classes6.dex */
    public static final class i extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ JSONArray f3127a;

        /* renamed from: b */
        final /* synthetic */ C0856z f3128b;

        i(JSONArray jSONArray, C0856z c0856z) {
            this.f3127a = jSONArray;
            this.f3128b = c0856z;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                int length = this.f3127a.length();
                if (length > 0) {
                    this.f3128b.m2411w();
                    this.f3128b.m2410v();
                }
                for (int i11 = length - 1; -1 < i11; i11--) {
                    this.f3128b.m2396f(new C31931g8(this.f3127a.get(i11).toString()), true);
                }
                if (this.f3128b.f3109b.keySet().size() > 0) {
                    C0856z c0856z = this.f3128b;
                    c0856z.m2401k(c0856z.m2399i());
                }
                this.f3128b.m2407r();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("PinMsg", e11);
            }
        }
    }

    /* renamed from: m */
    public static final C0856z m2393m() {
        return Companion.m2416b();
    }

    /* renamed from: s */
    public static final void m2394s() {
        try {
            C19669z.Companion.m103232a().m103198O0();
            C23744a.Companion.m124119a().m124116d(125, new Object[0]);
            C2852a1.m13746d();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: A */
    public final void m2395A(boolean z11, String str, int i11) {
        ArrayList m131500h;
        String str2;
        String str3;
        AbstractC19074t.m100208f(str, "uid");
        String m12674A = C2526d.f10270a.m12674A(str);
        ArrayList arrayList = new ArrayList();
        m131500h = AbstractC25368s.m131500h(m12674A, str);
        arrayList.addAll(m131500h);
        switch (i11) {
            case 1:
            case 4:
                str2 = "conv_pinboard";
                break;
            case 2:
            case 5:
                str2 = "chats_list";
                break;
            case 3:
            case 6:
                str2 = "rmenu";
                break;
            default:
                str2 = "";
                break;
        }
        String str4 = str2;
        if (z11) {
            str3 = "chat_pin";
        } else {
            str3 = "chat_unpin";
        }
        String str5 = str3;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        C0815e1.m2075D().m2100V(new C23648e(1, str4, 0, str5, (String[]) Arrays.copyOf(strArr, strArr.length)), false);
    }

    /* renamed from: f */
    public final boolean m2396f(C31931g8 c31931g8, boolean z11) {
        boolean z12;
        if (c31931g8 == null) {
            return false;
        }
        try {
            String m153439k = c31931g8.m153439k();
            Map map = this.f3109b;
            AbstractC19074t.m100207e(map, "mapMsgPinned");
            synchronized (map) {
                try {
                    if (!this.f3109b.containsKey(m153439k)) {
                        Map map2 = this.f3109b;
                        AbstractC19074t.m100207e(map2, "mapMsgPinned");
                        map2.put(m153439k, c31931g8);
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
            if (z11 && z12) {
                C7960e.m41971c6().m42231P8(c31931g8);
            }
            return true;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
    }

    /* renamed from: g */
    public final void m2397g(boolean z11, C31931g8 c31931g8, b bVar, boolean z12, int i11) {
        if (this.f3110c || c31931g8 == null || !C23055e5.m118272g(true)) {
            return;
        }
        if (z11) {
            if (this.f3109b.size() >= AbstractC23309i.m122570x8()) {
                if (bVar != null) {
                    bVar.mo2420eg(-1, c31931g8, true);
                }
                this.f3110c = false;
                return;
            }
        }
        if (bVar != null) {
            bVar.mo2420eg(1, c31931g8, z11);
        }
        this.f3110c = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new c(z11, this, c31931g8, z12, bVar, i11));
        c0766k.mo1428F7(AbstractC23089h6.m118438f(c31931g8), Long.parseLong(c31931g8.m153435f()), z11, i11);
    }

    /* renamed from: h */
    public final List m2398h() {
        ArrayList arrayList;
        Map map = this.f3109b;
        AbstractC19074t.m100207e(map, "mapMsgPinned");
        synchronized (map) {
            arrayList = new ArrayList(this.f3109b.values());
        }
        return arrayList;
    }

    /* renamed from: i */
    public final Set m2399i() {
        HashSet hashSet;
        Map map = this.f3109b;
        AbstractC19074t.m100207e(map, "mapMsgPinned");
        synchronized (map) {
            hashSet = new HashSet(this.f3109b.keySet());
        }
        return hashSet;
    }

    /* renamed from: j */
    public final boolean m2400j(String str) {
        AbstractC19074t.m100208f(str, "uidProfile");
        return this.f3109b.containsKey(str);
    }

    /* renamed from: k */
    public final void m2401k(Set set) {
        Set set2 = set;
        if (set2 != null && !set2.isEmpty()) {
            synchronized (this.f3108a) {
                try {
                    try {
                        C19669z.b bVar = C19669z.Companion;
                        bVar.m103232a().m103229t0();
                        HashSet hashSet = new HashSet();
                        hashSet.add("m1");
                        for (Conversation conversation : bVar.m103232a().m103212Y0()) {
                            if (m2400j(conversation.f42893q)) {
                                hashSet.add(conversation.f42893q);
                            }
                        }
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            if (!hashSet.contains(str)) {
                                Conversation conversation2 = new Conversation(str, null, null, null, 14, null);
                                MessageId.C7932a c7932a = MessageId.Companion;
                                String m103086b = AbstractC23306f.m120599M0().m103086b();
                                String str2 = CoreUtility.f89233i;
                                AbstractC19074t.m100207e(str2, "currentUserUid");
                                C17945a0 m95365a = new C17945a0.w(c7932a.m41064b(m103086b, "", str, str2), 0).m95382r(MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_conversation_has_no_message)).m95359K(0L).m95365a();
                                AbstractC19074t.m100207e(m95365a, "build(...)");
                                m95365a.m94951M9();
                                C0824j.m2153b(new d(conversation2, m95365a));
                            }
                        }
                    } catch (Exception e11) {
                        AbstractC20110a.f98889a.mo104552e(e11);
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: l */
    public final void m2402l(String str, C7904b c7904b, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(interfaceC20094a, "callback");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new e(interfaceC20094a));
        if (AbstractC25495a.m132079d(str)) {
            c0766k.mo1717q5(AbstractC25495a.m132088m(str), c7904b, true, "");
            return;
        }
        C25994h c25994h = C25994h.f124017a;
        AbstractC19074t.m100205c(str);
        c0766k.mo1406C9(str, c25994h.m133919h(str).m133961m(), c7904b);
    }

    /* renamed from: n */
    public final C31931g8 m2403n(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return (C31931g8) this.f3109b.get(str);
    }

    /* renamed from: o */
    public final int m2404o() {
        return this.f3109b.size();
    }

    /* renamed from: p */
    public final void m2405p(ZaloView zaloView, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("thread");
        AbstractC19074t.m100205c(optString);
        C31931g8 c31931g8 = new C31931g8(optString);
        String m118439g = AbstractC23089h6.m118439g(c31931g8);
        ContactProfile m118435c = AbstractC23089h6.m118435c(c31931g8);
        if (m118435c != null && !TextUtils.isEmpty(c31931g8.m153434e()) && !TextUtils.isEmpty(c31931g8.m153435f())) {
            if (AbstractC19074t.m100204b(C20217u.f99970o, c31931g8.m153434e()) && (AbstractC21935u.m114515E(m118439g) || m118435c.m40387S0())) {
                ToastUtils.m89266n(AbstractC8020f0.str_pin_msg_fail_general_error, new Object[0]);
                return;
            }
            if (C21927m.m114302u().m114345m(m118439g)) {
                ToastUtils.m89266n(AbstractC8020f0.str_pin_msg_fail_thread_hidden, new Object[0]);
                return;
            }
            AbstractC19074t.m100205c(m118439g);
            if (m2400j(m118439g)) {
                C19067n0 c19067n0 = C19067n0.f94947a;
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_pin_msg_success);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                String format = String.format(m118743r0, Arrays.copyOf(new Object[]{AbstractC23089h6.m118437e(m118435c.f42434r)}, 1));
                AbstractC19074t.m100207e(format, "format(...)");
                Spanned m119746j = AbstractC23244v8.m119746j(format);
                AbstractC19074t.m100207e(m119746j, "getSpannedFromStrHtml(...)");
                if (!TextUtils.isEmpty(m119746j)) {
                    ToastUtils.showMess(false, (CharSequence) m119746j);
                    return;
                }
            }
            m2397g(true, c31931g8, new f(new WeakReference(zaloView), m118435c), true, 7);
            return;
        }
        ToastUtils.m89266n(AbstractC8020f0.str_pin_msg_fail_general_error, new Object[0]);
    }

    /* renamed from: q */
    public final void m2406q() {
        try {
            C0824j.m2153b(new g());
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: r */
    public final void m2407r() {
        AbstractC19444a.m101695c(new Runnable() { // from class: ag0.y
            @Override // java.lang.Runnable
            public final void run() {
                C0856z.m2394s();
            }
        });
    }

    /* renamed from: t */
    public final void m2408t(String str, String str2, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(interfaceC20094a, "callback");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new h(str, interfaceC20094a));
        c0766k.mo1476L6(str, 3, str2);
    }

    /* renamed from: u */
    public final void m2409u(C31931g8 c31931g8) {
        if (c31931g8 == null) {
            return;
        }
        try {
            this.f3109b.remove(c31931g8.m153439k());
            C7960e.m41971c6().m42565vc(c31931g8);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: v */
    public final void m2410v() {
        try {
            C7960e.m41971c6().m42076Bb();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: w */
    public final void m2411w() {
        try {
            this.f3109b.clear();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: x */
    public final void m2412x(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("listMsg");
            if (optJSONArray != null && optJSONArray.length() != 0) {
                C0824j.m2153b(new i(optJSONArray, this));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: y */
    public final void m2413y(ContactProfile contactProfile) {
        if (contactProfile == null) {
            return;
        }
        Map map = this.f3109b;
        AbstractC19074t.m100207e(map, "mapMsgPinned");
        synchronized (map) {
            try {
                C31931g8 c31931g8 = (C31931g8) this.f3109b.get(contactProfile.f42434r);
                if (c31931g8 != null) {
                    c31931g8.f146707d = contactProfile;
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: z */
    public final void m2414z(C31973j5 c31973j5) {
        if (c31973j5 == null) {
            return;
        }
        Map map = this.f3109b;
        AbstractC19074t.m100207e(map, "mapMsgPinned");
        synchronized (map) {
            try {
                C31931g8 c31931g8 = (C31931g8) this.f3109b.get(c31973j5.m153781r());
                if (c31931g8 != null) {
                    c31931g8.f146708e = c31973j5;
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
