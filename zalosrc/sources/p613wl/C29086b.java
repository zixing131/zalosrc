package p613wl;

import android.net.Uri;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.zalocloud.utils.AbstractC16893a;
import dj.C17945a0;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import nl.C23870a;
import p348mi.AbstractC23306f;
import p487rl.C25821b;
import p550ul.C27301g;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qg0.AbstractC25270e;
import sg0.AbstractC26246b;
import sg0.C26245a;
import tg0.C26676b;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: wl.b */
/* loaded from: classes3.dex */
public final class C29086b {

    /* renamed from: a */
    public static final C29086b f134896a = new C29086b();

    /* renamed from: b */
    private static final InterfaceC24854k f134897b;

    /* renamed from: wl.b$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        Object f134898s;

        /* renamed from: t */
        /* synthetic */ Object f134899t;

        /* renamed from: v */
        int f134901v;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f134899t = obj;
            this.f134901v |= Integer.MIN_VALUE;
            return C29086b.this.m145327c(null, this);
        }
    }

    /* renamed from: wl.b$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f134902s;

        /* renamed from: u */
        int f134904u;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f134902s = obj;
            this.f134904u |= Integer.MIN_VALUE;
            return C29086b.this.m145326b(null, this);
        }
    }

    /* renamed from: wl.b$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f134905t;

        /* renamed from: u */
        final /* synthetic */ MessageId f134906u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(MessageId messageId, Continuation continuation) {
            super(2, continuation);
            this.f134906u = messageId;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f134906u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f134905t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C29086b c29086b = C29086b.f134896a;
                MessageId messageId = this.f134906u;
                this.f134905t = 1;
                obj = c29086b.m145326b(messageId, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: wl.b$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f134907t;

        /* renamed from: u */
        final /* synthetic */ C25821b f134908u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C25821b c25821b, Continuation continuation) {
            super(2, continuation);
            this.f134908u = c25821b;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f134908u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f134907t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C29086b c29086b = C29086b.f134896a;
                C25821b c25821b = this.f134908u;
                this.f134907t = 1;
                obj = c29086b.m145327c(c25821b, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: wl.b$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f134909t;

        /* renamed from: u */
        final /* synthetic */ MessageId f134910u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(MessageId messageId, Continuation continuation) {
            super(2, continuation);
            this.f134910u = messageId;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f134910u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f134909t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C29086b c29086b = C29086b.f134896a;
                MessageId messageId = this.f134910u;
                this.f134909t = 1;
                obj = c29086b.m145328f(messageId, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: wl.b$f */
    /* loaded from: classes3.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final f f134911q = new f();

        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C23870a mo12V4() {
            return AbstractC23306f.m120679j2();
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(f.f134911q);
        f134897b = m129210a;
    }

    private C29086b() {
    }

    /* renamed from: d */
    public static final String m145319d(MessageId messageId) {
        Object m112536b;
        AbstractC19074t.m100208f(messageId, "msgId");
        m112536b = BuildersKt__BuildersKt.m112536b(null, new c(messageId, null), 1, null);
        return (String) m112536b;
    }

    /* renamed from: e */
    public static final String m145320e(C25821b c25821b) {
        Object m112536b;
        AbstractC19074t.m100208f(c25821b, "cloudMediaItem");
        m112536b = BuildersKt__BuildersKt.m112536b(null, new d(c25821b, null), 1, null);
        return (String) m112536b;
    }

    /* renamed from: g */
    public static final C25821b m145321g(MessageId messageId) {
        Object m112536b;
        AbstractC19074t.m100208f(messageId, "msgId");
        m112536b = BuildersKt__BuildersKt.m112536b(null, new e(messageId, null), 1, null);
        return (C25821b) m112536b;
    }

    /* renamed from: h */
    private final C23870a m145322h() {
        return (C23870a) f134897b.getValue();
    }

    /* renamed from: i */
    public static final boolean m145323i(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "msgId");
        if (m145321g(messageId) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static final boolean m145324j(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        MessageId m95029V3 = c17945a0.m95029V3();
        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
        if (m145321g(m95029V3) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final Object m145325a(C25821b c25821b, Continuation continuation) {
        return m145322h().m124777L(c25821b.m133141d(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m145326b(MessageId messageId, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        C25821b c25821b;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f134904u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f134904u = i12 - Integer.MIN_VALUE;
                Object obj = bVar.f134902s;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f134904u;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return (String) obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    bVar.f134904u = 1;
                    obj = m145328f(messageId, bVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                c25821b = (C25821b) obj;
                if (c25821b == null) {
                    C29086b c29086b = f134896a;
                    bVar.f134904u = 2;
                    obj = c29086b.m145327c(c25821b, bVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    return (String) obj;
                }
                return null;
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f134902s;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f134904u;
        if (i11 == 0) {
        }
        c25821b = (C25821b) obj2;
        if (c25821b == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m145327c(C25821b c25821b, Continuation continuation) {
        a aVar;
        Object m142578e;
        int i11;
        String str;
        String str2;
        int i12;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i13 = aVar.f134901v;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f134901v = i13 - Integer.MIN_VALUE;
                Object obj = aVar.f134899t;
                m142578e = AbstractC28298d.m142578e();
                i11 = aVar.f134901v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c25821b = (C25821b) aVar.f134898s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    aVar.f134898s = c25821b;
                    aVar.f134901v = 1;
                    obj = m145325a(c25821b, aVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                str = (String) obj;
                if (str != null) {
                    return null;
                }
                AbstractC25270e m90325b = AbstractC16893a.m90325b(c25821b);
                if (m90325b != null) {
                    str2 = C26245a.m134942u(C26245a.f124654a, m90325b.mo130787b(), 0, 2, null);
                } else {
                    str2 = "null";
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("fetchVideoCloudDownloadUrl(): ");
                sb2.append("msgId=" + c25821b.m133146i() + ", ");
                sb2.append("encryptionKeyHash=" + str2 + ", ");
                if (m90325b != null) {
                    i12 = m90325b.m130786a();
                } else {
                    i12 = -1;
                }
                sb2.append("encryptionAlgoVer=" + i12);
                String sb3 = sb2.toString();
                AbstractC19074t.m100207e(sb3, "toString(...)");
                C26676b.m136957g("SMLZCloudMessageUtils", sb3, null, 4, null);
                Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("viewerKey", C27301g.Companion.m139821a().m139819b());
                if (m90325b != null) {
                    appendQueryParameter.appendQueryParameter("cloudSession", AbstractC26246b.m134963b(m90325b.mo130787b()));
                    appendQueryParameter.appendQueryParameter("version", String.valueOf(m90325b.m130786a()));
                } else {
                    appendQueryParameter.appendQueryParameter("cloudSession", "");
                }
                return appendQueryParameter.toString();
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f134899t;
        m142578e = AbstractC28298d.m142578e();
        i11 = aVar.f134901v;
        if (i11 == 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
    }

    /* renamed from: f */
    public final Object m145328f(MessageId messageId, Continuation continuation) {
        return m145322h().m124794V(messageId, continuation);
    }
}
