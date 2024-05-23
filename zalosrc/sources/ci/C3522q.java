package ci;

import ae.C0766k;
import am.C0927o;
import am.C0943w;
import android.text.TextUtils;
import au.EnumC2382z;
import ci.C3521p0;
import ci.C3522q;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.control.mediastore.CreateMediaStoreParam;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import eg0.AbstractC18428c;
import fe0.C18896e;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gw.AbstractC19646n0;
import gw.C19610a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23047d8;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.C23250w4;
import mg.C23288a;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONObject;
import p241ij.C20568e;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p461qu.AbstractC25495a;
import p716zh.C31973j5;
import p716zh.C31986k3;
import qm0.AbstractC25366r;
import qm0.AbstractC25370t;
import tj.C26709a;
import tj.C26711c;
import xd0.C29602r;

/* renamed from: ci.q */
/* loaded from: classes3.dex */
public final class C3522q {

    /* renamed from: a */
    public static final C3522q f14777a = new C3522q();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ci.q$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        long mo17822a();

        /* renamed from: b */
        String mo17823b();

        /* renamed from: c */
        MessageId mo17824c();
    }

    /* renamed from: ci.q$b */
    /* loaded from: classes3.dex */
    private static final class b implements a {

        /* renamed from: a */
        private final ItemAlbumMobile f14778a;

        public b(ItemAlbumMobile itemAlbumMobile) {
            AbstractC19074t.m100208f(itemAlbumMobile, "itemAlbumMobile");
            this.f14778a = itemAlbumMobile;
        }

        @Override // ci.C3522q.a
        /* renamed from: a */
        public long mo17822a() {
            return this.f14778a.f42564O;
        }

        @Override // ci.C3522q.a
        /* renamed from: b */
        public String mo17823b() {
            String str = this.f14778a.f42593q;
            AbstractC19074t.m100207e(str, "ownerid");
            return str;
        }

        @Override // ci.C3522q.a
        /* renamed from: c */
        public MessageId mo17824c() {
            return this.f14778a.m40496C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ci.q$c */
    /* loaded from: classes3.dex */
    public static final class c implements a {

        /* renamed from: a */
        private final MediaStoreItem f14779a;

        public c(MediaStoreItem mediaStoreItem) {
            AbstractC19074t.m100208f(mediaStoreItem, "mediaStoreItem");
            this.f14779a = mediaStoreItem;
        }

        @Override // ci.C3522q.a
        /* renamed from: a */
        public long mo17822a() {
            return this.f14779a.m40599m().m95313z4();
        }

        @Override // ci.C3522q.a
        /* renamed from: b */
        public String mo17823b() {
            String m94862C4 = this.f14779a.m40599m().m94862C4();
            AbstractC19074t.m100207e(m94862C4, "getSenderUid(...)");
            return m94862C4;
        }

        @Override // ci.C3522q.a
        /* renamed from: c */
        public MessageId mo17824c() {
            return this.f14779a.m40571M();
        }
    }

    /* renamed from: ci.q$d */
    /* loaded from: classes3.dex */
    public interface d {
        /* renamed from: E */
        void mo17825E(String str);

        /* renamed from: F */
        void mo17826F(boolean z11);

        /* renamed from: G */
        void mo17827G(MessageId messageId, boolean z11);
    }

    /* renamed from: ci.q$e */
    /* loaded from: classes3.dex */
    public static final class e implements a {

        /* renamed from: a */
        final /* synthetic */ C17945a0 f14780a;

        e(C17945a0 c17945a0) {
            this.f14780a = c17945a0;
        }

        @Override // ci.C3522q.a
        /* renamed from: a */
        public long mo17822a() {
            return this.f14780a.m94974P4();
        }

        @Override // ci.C3522q.a
        /* renamed from: b */
        public String mo17823b() {
            String m94862C4 = this.f14780a.m94862C4();
            AbstractC19074t.m100207e(m94862C4, "getSenderUid(...)");
            return m94862C4;
        }

        @Override // ci.C3522q.a
        /* renamed from: c */
        public MessageId mo17824c() {
            MessageId m95029V3 = this.f14780a.m95029V3();
            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
            return m95029V3;
        }
    }

    /* renamed from: ci.q$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C3499e0 f14781a;

        /* renamed from: b */
        final /* synthetic */ C17945a0 f14782b;

        /* renamed from: c */
        final /* synthetic */ a f14783c;

        /* renamed from: d */
        final /* synthetic */ EnumC2382z f14784d;

        /* renamed from: e */
        final /* synthetic */ d f14785e;

        f(C3499e0 c3499e0, C17945a0 c17945a0, a aVar, EnumC2382z enumC2382z, d dVar) {
            this.f14781a = c3499e0;
            this.f14782b = c17945a0;
            this.f14783c = aVar;
            this.f14784d = enumC2382z;
            this.f14785e = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m17829d(Object obj, C17945a0 c17945a0, a aVar, C3499e0 c3499e0, EnumC2382z enumC2382z, d dVar) {
            List m131496e;
            AbstractC19074t.m100208f(obj, "$o");
            AbstractC19074t.m100208f(c17945a0, "$chatContentOfDeletedItem");
            AbstractC19074t.m100208f(aVar, "$item");
            AbstractC19074t.m100208f(c3499e0, "$mediaStore");
            AbstractC19074t.m100208f(enumC2382z, "$mediaType");
            boolean z11 = false;
            try {
                try {
                    try {
                        JSONObject optJSONObject = new JSONObject(obj.toString()).optJSONObject("data");
                        if (optJSONObject != null && new C26709a(optJSONObject).m137325f()) {
                            AbstractC23306f.m120603N1().m101508a(new C29602r.b(c17945a0, true, null, 4, null));
                        } else {
                            z11 = true;
                        }
                        if (z11 && aVar.mo17824c() != null) {
                            C23250w4 c23250w4 = C23250w4.f112644a;
                            MessageId mo17824c = aVar.mo17824c();
                            AbstractC19074t.m100205c(mo17824c);
                            m131496e = AbstractC25366r.m131496e(mo17824c);
                            c23250w4.m119842o(m131496e, c3499e0.m17608M());
                        }
                        C20096c m17797b = C3521p0.Companion.m17797b();
                        ArrayList arrayList = new ArrayList();
                        MessageId mo17824c2 = aVar.mo17824c();
                        if (mo17824c2 != null) {
                            arrayList.add(mo17824c2);
                            if (dVar != null) {
                                dVar.mo17827G(mo17824c2, true);
                            }
                        }
                        c3499e0.m17638t(enumC2382z, m17797b, arrayList);
                    } catch (Throwable th2) {
                        try {
                            C20096c m17798c = C3521p0.Companion.m17798c();
                            ArrayList arrayList2 = new ArrayList();
                            MessageId mo17824c3 = aVar.mo17824c();
                            if (mo17824c3 != null) {
                                arrayList2.add(mo17824c3);
                                if (dVar != null) {
                                    dVar.mo17827G(mo17824c3, false);
                                }
                            }
                            c3499e0.m17638t(enumC2382z, m17798c, arrayList2);
                        } catch (Exception e11) {
                            AbstractC23350e.m122778h(e11);
                        }
                        throw th2;
                    }
                } catch (Exception e12) {
                    AbstractC23350e.m122778h(e12);
                    C20096c m17798c2 = C3521p0.Companion.m17798c();
                    ArrayList arrayList3 = new ArrayList();
                    MessageId mo17824c4 = aVar.mo17824c();
                    if (mo17824c4 != null) {
                        arrayList3.add(mo17824c4);
                        if (dVar != null) {
                            dVar.mo17827G(mo17824c4, false);
                        }
                    }
                    c3499e0.m17638t(enumC2382z, m17798c2, arrayList3);
                }
            } catch (Exception e13) {
                AbstractC23350e.m122778h(e13);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            ArrayList arrayList = new ArrayList();
            MessageId mo17824c = this.f14783c.mo17824c();
            if (mo17824c != null) {
                d dVar = this.f14785e;
                arrayList.add(mo17824c);
                if (dVar != null) {
                    dVar.mo17827G(mo17824c, false);
                } else {
                    ToastUtils.m89266n(AbstractC8020f0.str_can_not_delete_message, new Object[0]);
                }
            }
            this.f14781a.m17638t(this.f14784d, c20096c, arrayList);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(final Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            C23288a c23288a = C23288a.f113033a;
            String m17608M = this.f14781a.m17608M();
            final C17945a0 c17945a0 = this.f14782b;
            final a aVar = this.f14783c;
            final C3499e0 c3499e0 = this.f14781a;
            final EnumC2382z enumC2382z = this.f14784d;
            final d dVar = this.f14785e;
            AbstractC18428c.m97659b(c23288a, m17608M, 0, new Runnable() { // from class: ci.r
                @Override // java.lang.Runnable
                public final void run() {
                    C3522q.f.m17829d(obj, c17945a0, aVar, c3499e0, enumC2382z, dVar);
                }
            }, 2, null);
        }
    }

    /* renamed from: ci.q$g */
    /* loaded from: classes3.dex */
    public static final class g implements C23250w4.a {

        /* renamed from: a */
        final /* synthetic */ d f14786a;

        /* renamed from: b */
        final /* synthetic */ C17945a0 f14787b;

        /* renamed from: c */
        final /* synthetic */ a f14788c;

        /* renamed from: d */
        final /* synthetic */ C3499e0 f14789d;

        /* renamed from: e */
        final /* synthetic */ EnumC2382z f14790e;

        g(d dVar, C17945a0 c17945a0, a aVar, C3499e0 c3499e0, EnumC2382z enumC2382z) {
            this.f14786a = dVar;
            this.f14787b = c17945a0;
            this.f14788c = aVar;
            this.f14789d = c3499e0;
            this.f14790e = enumC2382z;
        }

        @Override // me0.C23250w4.a
        /* renamed from: E */
        public void mo17830E(String str) {
            d dVar = this.f14786a;
            if (dVar != null) {
                String string = MainApplication.Companion.m35500c().getResources().getString(AbstractC8020f0.str_reply_msg_not_found);
                AbstractC19074t.m100207e(string, "getString(...)");
                dVar.mo17825E(string);
                return;
            }
            ToastUtils.showMess(str);
        }

        @Override // me0.C23250w4.a
        /* renamed from: F */
        public void mo17831F(boolean z11) {
            d dVar = this.f14786a;
            if (dVar != null) {
                dVar.mo17826F(z11);
            }
        }

        @Override // me0.C23250w4.a
        /* renamed from: a */
        public void mo17832a(boolean z11) {
            C20096c m17798c;
            C3521p0.a aVar = C3521p0.Companion;
            if (z11) {
                m17798c = aVar.m17797b();
            } else {
                m17798c = aVar.m17798c();
            }
            if (z11) {
                MessageId m95029V3 = this.f14787b.m95029V3();
                AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                String mo95039W2 = this.f14787b.mo95039W2();
                AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                C20568e c20568e = new C20568e(m95029V3, mo95039W2, this.f14787b.m95041W4(), true, false, false, null, 64, null);
                C18896e m120662f1 = AbstractC23306f.m120662f1();
                C17945a0 c17945a0 = this.f14787b;
                m120662f1.m101508a(new C18896e.a(c17945a0, c17945a0.m95029V3(), c20568e));
            }
            ArrayList arrayList = new ArrayList();
            MessageId mo17824c = this.f14788c.mo17824c();
            if (mo17824c != null) {
                d dVar = this.f14786a;
                arrayList.add(mo17824c);
                if (dVar != null) {
                    dVar.mo17827G(mo17824c, z11);
                }
            }
            this.f14789d.m17638t(this.f14790e, m17798c, arrayList);
        }
    }

    private C3522q() {
    }

    /* renamed from: b */
    private final boolean m17806b(String str, a aVar) {
        if (!m17812h(str, aVar.mo17823b(), aVar.mo17822a())) {
            String m119211P = AbstractC23160o0.m119211P(AbstractC19646n0.m102894G0(str, aVar.mo17823b()) * 1000);
            AbstractC19074t.m100207e(m119211P, "getDateTimeString(...)");
            C19067n0 c19067n0 = C19067n0.f94947a;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_timeout_delete_msg_for_everyone);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{m119211P}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            ToastUtils.showMess(format);
            return false;
        }
        if (C23250w4.m119789O(str, aVar.mo17823b())) {
            return true;
        }
        ToastUtils.m89266n(AbstractC8020f0.str_not_perform_action, new Object[0]);
        return false;
    }

    /* renamed from: c */
    private final boolean m17807c(String str, a aVar) {
        if (!m17813i(aVar.mo17822a())) {
            String m119211P = AbstractC23160o0.m119211P(AbstractC23309i.m121708a9() * 1000);
            AbstractC19074t.m100207e(m119211P, "getDateTimeString(...)");
            C19067n0 c19067n0 = C19067n0.f94947a;
            String string = MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_timeout_recall_msg);
            AbstractC19074t.m100207e(string, "getString(...)");
            String format = String.format(string, Arrays.copyOf(new Object[]{m119211P}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            ToastUtils.showMess(format);
            return false;
        }
        if (C23250w4.m119789O(str, aVar.mo17823b())) {
            return true;
        }
        ToastUtils.m89266n(AbstractC8020f0.str_not_perform_action, new Object[0]);
        return false;
    }

    /* renamed from: d */
    public static final C3524s m17808d(String str, List list) {
        int m131511r;
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(list, "items");
        List list2 = list;
        m131511r = AbstractC25370t.m131511r(list2, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new c((MediaStoreItem) it.next()));
        }
        return f14777a.m17811g(str, arrayList);
    }

    /* renamed from: e */
    public static final C3524s m17809e(String str, List list) {
        int m131511r;
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(list, "items");
        List list2 = list;
        m131511r = AbstractC25370t.m131511r(list2, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new b((ItemAlbumMobile) it.next()));
        }
        return f14777a.m17811g(str, arrayList);
    }

    /* renamed from: f */
    public static final C3524s m17810f(String str, List list) {
        int m131511r;
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(list, "items");
        List list2 = list;
        m131511r = AbstractC25370t.m131511r(list2, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new e((C17945a0) it.next()));
        }
        return f14777a.m17811g(str, arrayList);
    }

    /* renamed from: g */
    private final C3524s m17811g(String str, List list) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = false;
        if (!AbstractC25495a.m132078c(str)) {
            if (AbstractC25495a.m132079d(str)) {
                C31973j5 m4472f = C0943w.f3447a.m4472f(str);
                if (m4472f != null) {
                    z11 = m4472f.m153778p0();
                } else {
                    z11 = false;
                }
                if (m4472f != null) {
                    z12 = m4472f.m153743U();
                } else {
                    z12 = false;
                }
                if (AbstractC23309i.m121010He()) {
                    Iterator it = list.iterator();
                    boolean z15 = true;
                    z13 = false;
                    while (it.hasNext()) {
                        a aVar = (a) it.next();
                        if (!C23250w4.f112644a.m119827P(aVar.mo17823b(), true, m4472f, z11, z12)) {
                            z15 = false;
                        }
                        if (!z13 && !TextUtils.equals(CoreUtility.f89233i, aVar.mo17823b())) {
                            z13 = true;
                        }
                    }
                    z14 = z15;
                    return new C3524s(true, z14, z13);
                }
            } else {
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        a aVar2 = (a) it2.next();
                        if (!m17813i(aVar2.mo17822a()) || !C23250w4.m119789O(str, aVar2.mo17823b())) {
                            break;
                        }
                    } else {
                        z14 = true;
                        break;
                    }
                }
            }
        }
        z13 = false;
        return new C3524s(true, z14, z13);
    }

    /* renamed from: h */
    private final boolean m17812h(String str, String str2, long j11) {
        return AbstractC19646n0.m102877A1(j11, str, str2);
    }

    /* renamed from: i */
    private final boolean m17813i(long j11) {
        if (C23793c.Companion.m124321a().mo124314i() - j11 <= AbstractC23309i.m121708a9() * 1000) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private final void m17814j(C3499e0 c3499e0, EnumC2382z enumC2382z, a aVar, C17945a0 c17945a0, d dVar) {
        int i11;
        c3499e0.m17640u(enumC2382z);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new f(c3499e0, c17945a0, aVar, enumC2382z, dVar));
        if (c17945a0.m94847A6()) {
            i11 = 3;
        } else {
            i11 = 1;
        }
        C26711c m102638h = C19610a.m102633j().m102638h(c17945a0, i11);
        List singletonList = Collections.singletonList(m102638h);
        C31986k3 c31986k3 = C31986k3.f147083a;
        String str = m102638h.f126657e;
        AbstractC19074t.m100207e(str, "ownerId");
        c0766k.mo1648gb(singletonList, true, c31986k3.m154105P1(str));
    }

    /* renamed from: k */
    private final void m17815k(C3499e0 c3499e0, EnumC2382z enumC2382z, a aVar, C17945a0 c17945a0, d dVar) {
        c3499e0.m17640u(enumC2382z);
        C23250w4.f112644a.m119841l0(c3499e0.m17608M(), c17945a0, new g(dVar, c17945a0, aVar, c3499e0, enumC2382z));
    }

    /* renamed from: m */
    private final boolean m17816m(C3499e0 c3499e0, EnumC2382z enumC2382z, MediaStoreItem mediaStoreItem, boolean z11) {
        return m17818o(this, c3499e0, enumC2382z, new c(mediaStoreItem), z11, null, 16, null);
    }

    /* renamed from: n */
    private final boolean m17817n(final C3499e0 c3499e0, final EnumC2382z enumC2382z, final a aVar, boolean z11, final d dVar) {
        if (z11) {
            if (AbstractC23047d8.m118256h(c3499e0.m17608M())) {
                if (!m17807c(c3499e0.m17608M(), aVar)) {
                    return false;
                }
                C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r(aVar.mo17824c());
                if (m2635r != null) {
                    m17815k(c3499e0, enumC2382z, aVar, m2635r, dVar);
                    return true;
                }
                if (dVar != null) {
                    String string = MainApplication.Companion.m35500c().getResources().getString(AbstractC8020f0.str_reply_msg_not_found);
                    AbstractC19074t.m100207e(string, "getString(...)");
                    dVar.mo17825E(string);
                    return true;
                }
                ToastUtils.m89266n(AbstractC8020f0.str_reply_msg_not_found, new Object[0]);
                return true;
            }
            if (!m17806b(c3499e0.m17608M(), aVar)) {
                return false;
            }
            MessageId mo17824c = aVar.mo17824c();
            if (mo17824c != null) {
                C17945a0 m2635r2 = AbstractC23306f.m120584H0().m2635r(mo17824c);
                if (m2635r2 == null) {
                    m2635r2 = new C17945a0.w(mo17824c, 0).m95365a();
                }
                m17814j(c3499e0, enumC2382z, aVar, m2635r2, dVar);
                return true;
            }
            return true;
        }
        c3499e0.m17640u(enumC2382z);
        AbstractC18428c.m97659b(C23288a.f113033a, c3499e0.m17608M(), 0, new Runnable() { // from class: ci.p
            @Override // java.lang.Runnable
            public final void run() {
                C3522q.m17819p(C3522q.a.this, c3499e0, enumC2382z, dVar);
            }
        }, 2, null);
        return true;
    }

    /* renamed from: o */
    static /* synthetic */ boolean m17818o(C3522q c3522q, C3499e0 c3499e0, EnumC2382z enumC2382z, a aVar, boolean z11, d dVar, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            dVar = null;
        }
        return c3522q.m17817n(c3499e0, enumC2382z, aVar, z11, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m17819p(a aVar, C3499e0 c3499e0, EnumC2382z enumC2382z, d dVar) {
        List m131496e;
        AbstractC19074t.m100208f(aVar, "$item");
        AbstractC19074t.m100208f(c3499e0, "$mediaStore");
        AbstractC19074t.m100208f(enumC2382z, "$mediaType");
        try {
            C20096c m17797b = C3521p0.Companion.m17797b();
            ArrayList arrayList = new ArrayList();
            MessageId mo17824c = aVar.mo17824c();
            if (mo17824c != null) {
                C23250w4 c23250w4 = C23250w4.f112644a;
                MessageId mo17824c2 = aVar.mo17824c();
                AbstractC19074t.m100205c(mo17824c2);
                m131496e = AbstractC25366r.m131496e(mo17824c2);
                c23250w4.m119842o(m131496e, c3499e0.m17608M());
                arrayList.add(mo17824c);
                if (dVar != null) {
                    dVar.mo17827G(mo17824c, true);
                }
            }
            c3499e0.m17638t(enumC2382z, m17797b, arrayList);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: l */
    public final boolean m17820l(C3521p0 c3521p0, String str, EnumC2382z enumC2382z, ItemAlbumMobile itemAlbumMobile, boolean z11, d dVar) {
        AbstractC19074t.m100208f(c3521p0, "msManager");
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        AbstractC19074t.m100208f(itemAlbumMobile, "item");
        return m17817n(c3521p0.m17791p(new CreateMediaStoreParam(str, null, null, 6, null)), enumC2382z, new b(itemAlbumMobile), z11, dVar);
    }

    /* renamed from: q */
    public final boolean m17821q(C3499e0 c3499e0, EnumC2382z enumC2382z, List list, boolean z11) {
        AbstractC19074t.m100208f(c3499e0, "mediaStore");
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        AbstractC19074t.m100208f(list, "items");
        Iterator it = list.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            if (m17816m(c3499e0, enumC2382z, (MediaStoreItem) it.next(), z11)) {
                z12 = true;
            }
        }
        return z12;
    }
}
