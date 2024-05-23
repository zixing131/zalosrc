package lg0;

import com.zing.zalo.data.entity.chat.message.MessageId;
import dj.C17945a0;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import vi.C28255a;
import vi.C28262h;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;

/* renamed from: lg0.c */
/* loaded from: classes7.dex */
public final class C22479c extends C22482f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lg0.c$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        Object f109923s;

        /* renamed from: t */
        Object f109924t;

        /* renamed from: u */
        /* synthetic */ Object f109925u;

        /* renamed from: w */
        int f109927w;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f109925u = obj;
            this.f109927w |= Integer.MIN_VALUE;
            return C22479c.this.m116232d(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lg0.c$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f109928s;

        /* renamed from: t */
        Object f109929t;

        /* renamed from: u */
        /* synthetic */ Object f109930u;

        /* renamed from: w */
        int f109932w;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f109930u = obj;
            this.f109932w |= Integer.MIN_VALUE;
            return C22479c.this.m116231c(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22479c(InterfaceC22477a interfaceC22477a) {
        super(interfaceC22477a);
        AbstractC19074t.m100208f(interfaceC22477a, "repository");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0067 A[PHI: r7
  0x0067: PHI (r7v6 java.lang.Object) = (r7v5 java.lang.Object), (r7v1 java.lang.Object) binds: [B:17:0x0064, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116231c(MessageId messageId, Continuation continuation) {
        b bVar;
        Object obj;
        Object m142578e;
        int i11;
        C22479c c22479c;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f109932w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f109932w = i12 - Integer.MIN_VALUE;
                obj = bVar.f109930u;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f109932w;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    messageId = (MessageId) bVar.f109929t;
                    c22479c = (C22479c) bVar.f109928s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC22477a m116236a = m116236a();
                    bVar.f109928s = this;
                    bVar.f109929t = messageId;
                    bVar.f109932w = 1;
                    if (AbstractC22478b.m116229a(m116236a, bVar) == m142578e) {
                        return m142578e;
                    }
                    c22479c = this;
                }
                InterfaceC22477a m116236a2 = c22479c.m116236a();
                bVar.f109928s = null;
                bVar.f109929t = null;
                bVar.f109932w = 2;
                obj = m116236a2.mo116228f(messageId, bVar);
                if (obj != m142578e) {
                    return m142578e;
                }
                return obj;
            }
        }
        bVar = new b(continuation);
        obj = bVar.f109930u;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f109932w;
        if (i11 == 0) {
        }
        InterfaceC22477a m116236a22 = c22479c.m116236a();
        bVar.f109928s = null;
        bVar.f109929t = null;
        bVar.f109932w = 2;
        obj = m116236a22.mo116228f(messageId, bVar);
        if (obj != m142578e) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116232d(C17945a0 c17945a0, Continuation continuation) {
        a aVar;
        Object m142578e;
        int i11;
        C22479c c22479c;
        C28262h c28262h;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i12 = aVar.f109927w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f109927w = i12 - Integer.MIN_VALUE;
                Object obj = aVar.f109925u;
                m142578e = AbstractC28298d.m142578e();
                i11 = aVar.f109927w;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return (C28255a) obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c17945a0 = (C17945a0) aVar.f109924t;
                    c22479c = (C22479c) aVar.f109923s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    MessageId m95029V3 = c17945a0.m95029V3();
                    AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                    aVar.f109923s = this;
                    aVar.f109924t = c17945a0;
                    aVar.f109927w = 1;
                    obj = m116231c(m95029V3, aVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c22479c = this;
                }
                c28262h = (C28262h) obj;
                if (c28262h != null) {
                    String m95090b5 = c17945a0.m95090b5();
                    AbstractC19074t.m100205c(m95090b5);
                    if (m95090b5.length() <= 0) {
                        m95090b5 = null;
                    }
                    if (m95090b5 == null) {
                        return null;
                    }
                    aVar.f109923s = null;
                    aVar.f109924t = null;
                    aVar.f109927w = 2;
                    obj = super.m116237b(m95090b5, aVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    return (C28255a) obj;
                }
                return c28262h;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f109925u;
        m142578e = AbstractC28298d.m142578e();
        i11 = aVar.f109927w;
        if (i11 == 0) {
        }
        c28262h = (C28262h) obj2;
        if (c28262h != null) {
        }
    }
}
