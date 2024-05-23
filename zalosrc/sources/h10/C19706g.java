package h10;

import com.zing.zalo.shortvideo.data.remote.ws.response.BlockUserCommentByOwner;
import com.zing.zalo.shortvideo.data.remote.ws.response.DeleteCommentByOwner;
import com.zing.zalo.shortvideo.data.remote.ws.response.GetCommentLiveRes;
import com.zing.zalo.shortvideo.data.remote.ws.response.GetStatLivestreamRes;
import com.zing.zalo.shortvideo.data.remote.ws.response.StreamData;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p10.AbstractC24599c;
import p10.C24597a;
import p10.C24598b;
import p10.C24605i;
import p10.C24606j;
import p10.EnumC24604h;
import qm0.AbstractC25332a0;
import qm0.AbstractC25370t;

/* renamed from: h10.g */
/* loaded from: classes5.dex */
public final class C19706g {

    /* renamed from: a */
    private InterfaceC19708i f97739a;

    /* renamed from: b */
    private InterfaceC19713n f97740b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m103387g(InterfaceC19713n interfaceC19713n, GetStatLivestreamRes getStatLivestreamRes) {
        String str;
        long j11;
        long j12;
        AbstractC19074t.m100208f(interfaceC19713n, "$streamListener");
        AbstractC19074t.m100208f(getStatLivestreamRes, "$data");
        Long m51659c = getStatLivestreamRes.m51659c();
        if (m51659c == null || (str = m51659c.toString()) == null) {
            str = "";
        }
        String str2 = str;
        Long m51658b = getStatLivestreamRes.m51658b();
        if (m51658b != null) {
            j11 = m51658b.longValue();
        } else {
            j11 = 0;
        }
        long j13 = j11;
        Long m51657a = getStatLivestreamRes.m51657a();
        if (m51657a != null) {
            j12 = m51657a.longValue();
        } else {
            j12 = 2;
        }
        interfaceC19713n.mo53271g(str2, j13, j12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m103388h(InterfaceC19713n interfaceC19713n, StreamData streamData) {
        AbstractC19074t.m100208f(interfaceC19713n, "$streamListener");
        AbstractC19074t.m100208f(streamData, "$data");
        interfaceC19713n.mo53272j(C19700a.Companion.m103380a(streamData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m103389i(InterfaceC19713n interfaceC19713n, BlockUserCommentByOwner blockUserCommentByOwner) {
        String str;
        AbstractC19074t.m100208f(interfaceC19713n, "$streamListener");
        AbstractC19074t.m100208f(blockUserCommentByOwner, "$data");
        Long m51623b = blockUserCommentByOwner.m51623b();
        if (m51623b != null) {
            str = m51623b.toString();
        } else {
            str = null;
        }
        interfaceC19713n.mo53266b(str, blockUserCommentByOwner.m51622a(), blockUserCommentByOwner.m51624c(), blockUserCommentByOwner.m51625d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m103390j(InterfaceC19713n interfaceC19713n, DeleteCommentByOwner deleteCommentByOwner, List list) {
        List m131187O0;
        AbstractC19074t.m100208f(interfaceC19713n, "$streamListener");
        AbstractC19074t.m100208f(deleteCommentByOwner, "$data");
        AbstractC19074t.m100208f(list, "$items");
        String m51629c = deleteCommentByOwner.m51629c();
        m131187O0 = AbstractC25332a0.m131187O0(list);
        interfaceC19713n.mo53268d(m51629c, m131187O0);
    }

    /* renamed from: e */
    public final AbstractC19711l m103391e(List list) {
        Object m131206f0;
        List m131187O0;
        GetCommentLiveRes.CommentData commentData;
        AbstractC19074t.m100208f(list, "events");
        InterfaceC19708i interfaceC19708i = this.f97739a;
        if (interfaceC19708i != null) {
            m131206f0 = AbstractC25332a0.m131206f0(list);
            AbstractC19711l abstractC19711l = (AbstractC19711l) m131206f0;
            if (abstractC19711l == null) {
                return null;
            }
            if (abstractC19711l instanceof C19701b) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC19711l abstractC19711l2 = (AbstractC19711l) it.next();
                    if (abstractC19711l2 instanceof C19701b) {
                        commentData = ((C19701b) abstractC19711l2).m103381d();
                    } else {
                        commentData = null;
                    }
                    if (commentData != null) {
                        arrayList.add(commentData);
                    }
                }
                m131187O0 = AbstractC25332a0.m131187O0(arrayList);
                interfaceC19708i.mo53273k(m131187O0);
            } else if (abstractC19711l instanceof C19710k) {
                if (abstractC19711l.mo103449c() == EnumC24604h.f118389t) {
                    interfaceC19708i.mo53276m(abstractC19711l.m103451b(), ((C19710k) abstractC19711l).m103450d());
                } else {
                    interfaceC19708i.mo53269e(abstractC19711l.m103451b(), ((C19710k) abstractC19711l).m103450d());
                }
            }
            return abstractC19711l;
        }
        return null;
    }

    /* renamed from: f */
    public final void m103392f(AbstractC24599c abstractC24599c) {
        final DeleteCommentByOwner m128087c;
        List m51628b;
        int m131511r;
        AbstractC19074t.m100208f(abstractC24599c, "event");
        final InterfaceC19713n interfaceC19713n = this.f97740b;
        if (interfaceC19713n == null) {
            return;
        }
        if (abstractC24599c instanceof C24605i) {
            final GetStatLivestreamRes m128096c = ((C24605i) abstractC24599c).m128096c();
            if (m128096c == null) {
                return;
            }
            AbstractC19444a.m101697e(new Runnable() { // from class: h10.c
                @Override // java.lang.Runnable
                public final void run() {
                    C19706g.m103387g(InterfaceC19713n.this, m128096c);
                }
            });
            return;
        }
        if (abstractC24599c instanceof C24606j) {
            final StreamData m128097c = ((C24606j) abstractC24599c).m128097c();
            if (m128097c == null) {
                return;
            }
            AbstractC19444a.m101697e(new Runnable() { // from class: h10.d
                @Override // java.lang.Runnable
                public final void run() {
                    C19706g.m103388h(InterfaceC19713n.this, m128097c);
                }
            });
            return;
        }
        if (abstractC24599c instanceof C24597a) {
            final BlockUserCommentByOwner m128086c = ((C24597a) abstractC24599c).m128086c();
            if (m128086c == null) {
                return;
            }
            AbstractC19444a.m101697e(new Runnable() { // from class: h10.e
                @Override // java.lang.Runnable
                public final void run() {
                    C19706g.m103389i(InterfaceC19713n.this, m128086c);
                }
            });
            return;
        }
        if ((abstractC24599c instanceof C24598b) && (m128087c = ((C24598b) abstractC24599c).m128087c()) != null && (m51628b = m128087c.m51628b()) != null) {
            List list = m51628b;
            m131511r = AbstractC25370t.m131511r(list, 10);
            final ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
            }
            AbstractC19444a.m101697e(new Runnable() { // from class: h10.f
                @Override // java.lang.Runnable
                public final void run() {
                    C19706g.m103390j(InterfaceC19713n.this, m128087c, arrayList);
                }
            });
        }
    }

    /* renamed from: k */
    public final void m103393k(InterfaceC19708i interfaceC19708i) {
        this.f97739a = interfaceC19708i;
    }

    /* renamed from: l */
    public final void m103394l(InterfaceC19713n interfaceC19713n) {
        this.f97740b = interfaceC19713n;
    }
}
