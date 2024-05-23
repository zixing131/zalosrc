package p654xq;

import ae.C0766k;
import am.C0927o;
import com.zing.zalo.feed.mvp.realtimelikecomment.model.ExceptionGetRealTimeLikeComment;
import com.zing.zalo.feed.mvp.realtimelikecomment.model.ExceptionRealTimeLikeCommentErrorNetwork;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import me0.C23055e5;
import org.json.JSONObject;
import p509sp.InterfaceC26357f;
import p618wq.C29190a;
import p618wq.C29192c;
import p725zq.C32543a;
import p725zq.C32544b;
import pm0.AbstractC24862s;
import pm0.C24861r;
import qm0.AbstractC25332a0;
import um0.C27317h;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* renamed from: xq.d */
/* loaded from: classes4.dex */
public final class C30194d implements InterfaceC30191a {

    /* renamed from: a */
    private final InterfaceC26357f f140234a;

    /* renamed from: xq.d$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ C29192c f140236b;

        /* renamed from: c */
        final /* synthetic */ Continuation f140237c;

        /* renamed from: xq.d$a$a */
        /* loaded from: classes4.dex */
        static final class C33050a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Object f140238q;

            /* renamed from: r */
            final /* synthetic */ C29192c f140239r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C33050a(Object obj, C29192c c29192c) {
                super(0);
                this.f140238q = obj;
                this.f140239r = c29192c;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final String mo12V4() {
                return "[Result] Success: " + this.f140238q + " - [Request] Feed ids: " + this.f140239r;
            }
        }

        /* renamed from: xq.d$a$b */
        /* loaded from: classes4.dex */
        static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ C20096c f140240q;

            /* renamed from: r */
            final /* synthetic */ C29192c f140241r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C20096c c20096c, C29192c c29192c) {
                super(0);
                this.f140240q = c20096c;
                this.f140241r = c29192c;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final String mo12V4() {
                return "[Result] Error: " + this.f140240q + " - [Request] Feed ids: " + this.f140241r;
            }
        }

        a(C29192c c29192c, Continuation continuation) {
            this.f140236b = c29192c;
            this.f140237c = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            C30194d.this.f140234a.mo135685a("REAL_TIME_LIKE_COMMENT", "API_GET_FEED_REAL_TIME_LIKE_COMMENT", new b(c20096c, this.f140236b));
            Continuation continuation = this.f140237c;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionGetRealTimeLikeComment.f46923p)));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            List m131187O0;
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            C30194d.this.f140234a.mo135685a("REAL_TIME_LIKE_COMMENT", "API_GET_FEED_REAL_TIME_LIKE_COMMENT", new C33050a(obj, this.f140236b));
            m131187O0 = AbstractC25332a0.m131187O0(C32544b.f150395a.m157602b((JSONObject) obj));
            for (String str : this.f140236b.m145750a()) {
                List list = m131187O0;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (AbstractC19074t.m100204b(((C29190a) it.next()).m145737a(), str)) {
                            break;
                        }
                    }
                }
                m131187O0.add(new C29190a(str, null, 0, C32543a.f150389a.m157591c(), 0L, 22, null));
            }
            this.f140237c.mo112492g(C24861r.m129218b(m131187O0));
        }
    }

    /* renamed from: xq.d$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C29192c f140242q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C29192c c29192c) {
            super(0);
            this.f140242q = c29192c;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            return "Start request: " + this.f140242q.m145750a() + " - Detail: " + this.f140242q;
        }
    }

    public C30194d(InterfaceC26357f interfaceC26357f) {
        AbstractC19074t.m100208f(interfaceC26357f, "logFlow");
        this.f140234a = interfaceC26357f;
    }

    @Override // p654xq.InterfaceC30191a
    /* renamed from: a */
    public Object mo148861a(C29192c c29192c, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionRealTimeLikeCommentErrorNetwork.f46924p)));
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new a(c29192c, c27317h));
            this.f140234a.mo135685a("REAL_TIME_LIKE_COMMENT", "API_GET_FEED_REAL_TIME_LIKE_COMMENT", new b(c29192c));
            c0766k.mo1547U5(c29192c);
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }
}
