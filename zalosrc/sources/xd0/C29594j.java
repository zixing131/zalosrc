package xd0;

import android.text.TextUtils;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import mm0.AbstractC23350e;
import p019aj.C0872f;
import p019aj.C0876j;
import p056cj.C3535c;
import p056cj.InterfaceC3534b;
import p185gc.AbstractC19378b;
import p185gc.AbstractC19384h;
import p348mi.AbstractC23306f;
import vg.C28081h4;
import vg.C28203u6;
import wd0.C28931k;

/* renamed from: xd0.j */
/* loaded from: classes4.dex */
public final class C29594j extends AbstractC19384h {

    /* renamed from: a */
    private final C0872f f136598a;

    /* renamed from: b */
    private final C0876j f136599b;

    /* renamed from: c */
    private final C28203u6 f136600c;

    /* renamed from: d */
    private final C28931k f136601d;

    /* renamed from: xd0.j$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f136602a;

        /* renamed from: b */
        private final String f136603b;

        /* renamed from: c */
        private final List f136604c;

        /* renamed from: d */
        private final InterfaceC3534b f136605d;

        /* renamed from: e */
        private final List f136606e;

        /* renamed from: f */
        private final boolean f136607f;

        /* renamed from: g */
        private final boolean f136608g;

        /* renamed from: h */
        private final C28931k.d f136609h;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, List list, InterfaceC3534b interfaceC3534b) {
            this(str, str2, list, interfaceC3534b, null, false, false, null, 240, null);
            AbstractC19074t.m100208f(str, "currentUserUid");
            AbstractC19074t.m100208f(str2, "ownerId");
            AbstractC19074t.m100208f(list, "msgList");
            AbstractC19074t.m100208f(interfaceC3534b, "entry");
        }

        /* renamed from: a */
        public final List m147061a() {
            return this.f136606e;
        }

        /* renamed from: b */
        public final String m147062b() {
            return this.f136602a;
        }

        /* renamed from: c */
        public final InterfaceC3534b m147063c() {
            return this.f136605d;
        }

        /* renamed from: d */
        public final List m147064d() {
            return this.f136604c;
        }

        /* renamed from: e */
        public final String m147065e() {
            return this.f136603b;
        }

        /* renamed from: f */
        public final boolean m147066f() {
            return this.f136608g;
        }

        /* renamed from: g */
        public final boolean m147067g() {
            return this.f136607f;
        }

        /* renamed from: h */
        public final C28931k.d m147068h() {
            return this.f136609h;
        }

        public a(String str, String str2, List list, InterfaceC3534b interfaceC3534b, List list2, boolean z11, boolean z12, C28931k.d dVar) {
            AbstractC19074t.m100208f(str, "currentUserUid");
            AbstractC19074t.m100208f(str2, "ownerId");
            AbstractC19074t.m100208f(list, "msgList");
            AbstractC19074t.m100208f(interfaceC3534b, "entry");
            AbstractC19074t.m100208f(dVar, "updateLastMsgRule");
            this.f136602a = str;
            this.f136603b = str2;
            this.f136604c = list;
            this.f136605d = interfaceC3534b;
            this.f136606e = list2;
            this.f136607f = z11;
            this.f136608g = z12;
            this.f136609h = dVar;
        }

        public /* synthetic */ a(String str, String str2, List list, InterfaceC3534b interfaceC3534b, List list2, boolean z11, boolean z12, C28931k.d dVar, int i11, AbstractC19060k abstractC19060k) {
            this(str, str2, list, interfaceC3534b, (i11 & 16) != 0 ? null : list2, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? true : z12, (i11 & 128) != 0 ? C28931k.d.Companion.m144585a() : dVar);
        }
    }

    /* renamed from: xd0.j$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final List f136610a;

        /* renamed from: b */
        private final boolean f136611b;

        public b(List list, boolean z11) {
            AbstractC19074t.m100208f(list, "msgList");
            this.f136610a = list;
            this.f136611b = z11;
        }

        /* renamed from: a */
        public final boolean m147069a() {
            return this.f136611b;
        }

        /* renamed from: b */
        public final List m147070b() {
            return this.f136610a;
        }
    }

    public C29594j(C0872f c0872f, C0876j c0876j, C28203u6 c28203u6, C28931k c28931k) {
        AbstractC19074t.m100208f(c0872f, "chatRepo");
        AbstractC19074t.m100208f(c0876j, "messageRepo");
        AbstractC19074t.m100208f(c28203u6, "profileManager");
        AbstractC19074t.m100208f(c28931k, "updateLastMsgUseCase");
        this.f136598a = c0872f;
        this.f136599b = c0876j;
        this.f136600c = c28203u6;
        this.f136601d = c28931k;
    }

    /* renamed from: c */
    private final void m147056c(String str, List list) {
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((C17945a0) it.next()).m95032V6()) {
                    this.f136598a.m2540i(str);
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    private final boolean m147057d(String str, List list, InterfaceC3534b interfaceC3534b, boolean z11) {
        boolean z12 = false;
        if (!m147058e(interfaceC3534b)) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17945a0 c17945a0 = (C17945a0) it.next();
            C3535c m2634q = this.f136599b.m2634q(str);
            if (m2634q != null && m2634q.m136048N() && m2634q.m136058b(c17945a0, z11)) {
                z12 = true;
            }
        }
        return z12;
    }

    /* renamed from: e */
    private final boolean m147058e(InterfaceC3534b interfaceC3534b) {
        return !AbstractC19074t.m100204b(interfaceC3534b, InterfaceC3534b.a.f14894a);
    }

    /* renamed from: f */
    private final void m147059f(String str, List list, C28931k.d dVar) {
        Conversation m103201R = AbstractC23306f.m120572D0().m103201R(str);
        if (m103201R == null) {
            m103201R = new Conversation(str, null, null, null, 14, null);
        }
        AbstractC19378b.m101499c(this.f136601d, new C28931k.b(m103201R, list, dVar), null, 2, null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17945a0 c17945a0 = (C17945a0) it.next();
            if (c17945a0.m95032V6() && m103201R.m41013q() && c17945a0.m95029V3().m41052p() && !c17945a0.m95161i7() && !c17945a0.m95109d6() && !c17945a0.m95219o8() && !c17945a0.m95091b6() && !c17945a0.m95178k6()) {
                C28081h4.m141541d().m141545f(c17945a0.mo95039W2(), c17945a0.m95029V3().m41045i());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19384h
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public b mo13388b(a aVar) {
        boolean z11;
        AbstractC19074t.m100208f(aVar, "params");
        String m147062b = aVar.m147062b();
        String m147065e = aVar.m147065e();
        List m147064d = aVar.m147064d();
        InterfaceC3534b m147063c = aVar.m147063c();
        List m147061a = aVar.m147061a();
        boolean m147067g = aVar.m147067g();
        boolean m147066f = aVar.m147066f();
        C28931k.d m147068h = aVar.m147068h();
        if (TextUtils.isEmpty(m147065e) || m147064d.isEmpty() || !AbstractC19074t.m100204b(CoreUtility.f89233i, m147062b)) {
            return null;
        }
        m147056c(m147065e, m147064d);
        try {
            List m41541h0 = C7956b.Companion.m41573b().m41541h0(m147064d, m147063c, m147061a);
            if (!m147067g && m147057d(m147065e, m41541h0, m147063c, m147066f)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (m147063c instanceof InterfaceC3534b.d) {
                m147059f(m147065e, m41541h0, m147068h);
            }
            return new b(m41541h0, z11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }
}
