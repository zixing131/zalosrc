package p207he;

import ag0.C0829l0;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import bf0.C2793a;
import bp0.AbstractC3082b0;
import bp0.AbstractC3096i0;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17522a;
import com.zing.zalocore.connection.socket.RequestPacket;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.C20096c;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import jm0.InterfaceC21299i;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import me0.C23055e5;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p348mi.AbstractC23304d;
import p609wh.C29037t0;
import p681yh.EnumC30982b;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import um0.AbstractC27310a;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import zm.voip.service.C32257b4;

/* renamed from: he.n */
/* loaded from: classes3.dex */
public final class C20020n {

    /* renamed from: f */
    private static volatile C20020n f98404f;

    /* renamed from: a */
    private final CoroutineExceptionHandler f98406a;

    /* renamed from: b */
    private final CoroutineScope f98407b;

    /* renamed from: c */
    private boolean f98408c;

    /* renamed from: d */
    private boolean f98409d;

    /* renamed from: e */
    private Handler f98410e;
    public static final a Companion = new a(null);

    /* renamed from: g */
    private static final Map f98405g = new LinkedHashMap();

    /* renamed from: he.n$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C20020n m103917a() {
            C20020n c20020n = C20020n.f98404f;
            if (c20020n == null) {
                synchronized (this) {
                    c20020n = new C20020n();
                    C20020n.f98404f = c20020n;
                }
            }
            return c20020n;
        }

        /* renamed from: b */
        public final Map m103918b() {
            return C20020n.f98405g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: he.n$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f98411t;

        /* renamed from: u */
        final /* synthetic */ EnumC30982b f98412u;

        /* renamed from: v */
        final /* synthetic */ C20020n f98413v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(EnumC30982b enumC30982b, C20020n c20020n, Continuation continuation) {
            super(2, continuation);
            this.f98412u = enumC30982b;
            this.f98413v = c20020n;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f98412u, this.f98413v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f98411t == 0) {
                AbstractC24862s.m129228b(obj);
                if (this.f98412u == EnumC30982b.CONNECTED) {
                    this.f98413v.m103907l(true);
                } else {
                    Iterator it = C20020n.Companion.m103918b().entrySet().iterator();
                    while (it.hasNext()) {
                        ((C20007a) ((Map.Entry) it.next()).getValue()).m103832j(0);
                    }
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: he.n$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f98414t;

        /* renamed from: u */
        final /* synthetic */ boolean f98415u;

        /* renamed from: v */
        final /* synthetic */ C20020n f98416v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z11, C20020n c20020n, Continuation continuation) {
            super(2, continuation);
            this.f98415u = z11;
            this.f98416v = c20020n;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f98415u, this.f98416v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f98414t == 0) {
                AbstractC24862s.m129228b(obj);
                try {
                    boolean z11 = this.f98415u;
                    a aVar = C20020n.Companion;
                    AbstractC3082b0.m15424f("VoIPFinishManager", "checkFinishVoIPNotSend " + z11 + " " + aVar.m103918b().size());
                    this.f98416v.m103910q();
                    C20007a c20007a = new C20007a(0, 0, 0, 0, 0, 0, 0, 0, null, 0L, 1023, null);
                    Iterator it = aVar.m103918b().entrySet().iterator();
                    if (it.hasNext()) {
                        c20007a = (C20007a) ((Map.Entry) it.next()).getValue();
                    }
                    if (c20007a != null) {
                        C20020n c20020n = this.f98416v;
                        boolean z12 = this.f98415u;
                        if (c20007a.m103823a() > 0) {
                            AbstractC3082b0.m15424f("VoIPFinishManager", "checkFinishVoIPNotSend " + c20007a.m103823a());
                            c20020n.m103909o(c20007a, z12);
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: he.n$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC21299i {

        /* renamed from: b */
        final /* synthetic */ C20007a f98418b;

        /* renamed from: he.n$d$a */
        /* loaded from: classes3.dex */
        static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f98419t;

            /* renamed from: u */
            final /* synthetic */ C20020n f98420u;

            /* renamed from: v */
            final /* synthetic */ C20007a f98421v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C20020n c20020n, C20007a c20007a, Continuation continuation) {
                super(2, continuation);
                this.f98420u = c20020n;
                this.f98421v = c20007a;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f98420u, this.f98421v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f98419t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f98420u.f98408c = false;
                    this.f98421v.m103832j(AbstractC23304d.f113299L1);
                    this.f98420u.m103911s(this.f98421v.m103833k());
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        d(C20007a c20007a) {
            this.f98418b = c20007a;
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            AbstractC3082b0.m15424f("VoIPFinishManager", "sendFinishCallInfoZRTP Fail " + c20096c.m104492d());
            C20020n.this.f98408c = false;
            C20007a c20007a = this.f98418b;
            c20007a.m103832j(c20007a.m103828f() + 1);
            C20020n.this.m103913n().sendEmptyMessageDelayed(3000, 3000L);
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public void mo1343f(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "object");
            try {
                AbstractC3082b0.m15424f("VoIPFinishManager", "sendFinishCallInfoZRTP Success callID = " + this.f98418b.m103823a() + " receiverID = " + this.f98418b.m103827e() + " retry = " + this.f98418b.m103828f());
                BuildersKt__Builders_commonKt.m112540d(C20020n.this.f98407b, null, null, new a(C20020n.this, this.f98418b, null), 3, null);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: he.n$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f98422t;

        /* renamed from: u */
        final /* synthetic */ C20007a f98423u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C20007a c20007a, Continuation continuation) {
            super(2, continuation);
            this.f98423u = c20007a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f98423u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f98422t == 0) {
                AbstractC24862s.m129228b(obj);
                try {
                    if (AbstractC23304d.f113299L1 > 0) {
                        C7960e.m41971c6().m42340a8(this.f98423u.m103833k());
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: he.n$f */
    /* loaded from: classes3.dex */
    public static final class f extends Handler {
        f(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC19074t.m100208f(message, "msg");
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 == 3000) {
                    C20020n.this.m103907l(false);
                }
            } else {
                Object obj = message.obj;
                if (obj != null) {
                    C20020n.this.m103906k((EnumC30982b) obj);
                }
            }
            super.handleMessage(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: he.n$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f98425t;

        /* renamed from: u */
        final /* synthetic */ C20015i f98426u;

        /* renamed from: v */
        final /* synthetic */ C20020n f98427v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C20015i c20015i, C20020n c20020n, Continuation continuation) {
            super(2, continuation);
            this.f98426u = c20015i;
            this.f98427v = c20020n;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new g(this.f98426u, this.f98427v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f98425t == 0) {
                AbstractC24862s.m129228b(obj);
                try {
                    a aVar = C20020n.Companion;
                    aVar.m103918b().remove(AbstractC29094b.m145341c(this.f98426u.m103881a()));
                    if (AbstractC23304d.f113303M1) {
                        C7960e.m41971c6().m42598yd(String.valueOf(this.f98426u.m103883c()), String.valueOf(this.f98426u.m103881a()), this.f98426u.m103884d());
                    }
                    C7960e.m41971c6().m42333Zb(String.valueOf(this.f98426u.m103883c()), String.valueOf(this.f98426u.m103881a()));
                    AbstractC3082b0.m15424f("VoIPFinishManager", "removeAndCheckFinishVoIPInfo " + this.f98426u.m103881a() + " " + aVar.m103918b().size() + " " + aVar.m103918b().containsKey(AbstractC29094b.m145341c(this.f98426u.m103881a())) + " " + AbstractC23304d.f113303M1 + " " + this.f98426u.m103883c());
                    this.f98427v.m103913n().removeMessages(3000);
                    this.f98427v.m103913n().sendEmptyMessage(3000);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: he.n$h */
    /* loaded from: classes3.dex */
    static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f98428t;

        /* renamed from: u */
        final /* synthetic */ C20007a f98429u;

        /* renamed from: v */
        final /* synthetic */ C20020n f98430v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C20007a c20007a, C20020n c20020n, Continuation continuation) {
            super(2, continuation);
            this.f98429u = c20007a;
            this.f98430v = c20020n;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h(this.f98429u, this.f98430v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            a aVar;
            AbstractC28298d.m142578e();
            if (this.f98428t == 0) {
                AbstractC24862s.m129228b(obj);
                try {
                    aVar = C20020n.Companion;
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (aVar.m103918b().containsKey(AbstractC29094b.m145341c(this.f98429u.m103823a()))) {
                    return C24848g0.f119245a;
                }
                aVar.m103918b().put(AbstractC29094b.m145341c(this.f98429u.m103823a()), this.f98429u);
                this.f98430v.m103909o(this.f98429u, true);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: he.n$i */
    /* loaded from: classes3.dex */
    public static final class i extends AbstractC27310a implements CoroutineExceptionHandler {
        public i(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        /* renamed from: G */
        public void mo35525G(InterfaceC27315f interfaceC27315f, Throwable th2) {
            AbstractC23350e.m122774d("VoIPFinishVoIPManager", "Failed " + th2.getMessage());
        }
    }

    public C20020n() {
        i iVar = new i(CoroutineExceptionHandler.f105837l);
        this.f98406a = iVar;
        this.f98407b = CoroutineScopeKt.m112637a(SupervisorKt.m112864b(null, 1, null).mo112823d0(Dispatchers.m112680b()).mo112823d0(iVar));
        this.f98410e = new f(C2793a.f11144a.m13457b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final Job m103906k(EnumC30982b enumC30982b) {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(this.f98407b, null, null, new b(enumC30982b, this, null), 3, null);
        return m112540d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final synchronized Job m103907l(boolean z11) {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(this.f98407b, null, null, new c(z11, this, null), 3, null);
        return m112540d;
    }

    /* renamed from: m */
    public static final C20020n m103908m() {
        return Companion.m103917a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final synchronized void m103909o(C20007a c20007a, boolean z11) {
        try {
            AbstractC3082b0.m15424f("VoIPFinishManager", "handleFinishVoIP SEND " + c20007a.m103823a() + " " + c20007a.m103828f() + " " + z11);
            if (!this.f98408c && !TextUtils.isEmpty(CoreUtility.f89233i)) {
                if (c20007a.m103828f() >= 3 && !z11) {
                    m103914p(c20007a);
                }
                this.f98408c = true;
                m103912t(c20007a, new d(c20007a));
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final void m103910q() {
        if (!(!f98405g.isEmpty()) && !this.f98409d && AbstractC23304d.f113299L1 > 0) {
            this.f98409d = true;
            ArrayList<C20015i> m42377e5 = C7960e.m41971c6().m42377e5();
            AbstractC19074t.m100207e(m42377e5, "getAllFinishVoIPInfoWithUid(...)");
            for (C20015i c20015i : m42377e5) {
                C20007a m103889i = c20015i.m103889i();
                if (m103889i.m103828f() < AbstractC23304d.f113299L1) {
                    f98405g.put(Integer.valueOf(c20015i.m103881a()), m103889i);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final Job m103911s(C20015i c20015i) {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(this.f98407b, null, null, new g(c20015i, this, null), 3, null);
        return m112540d;
    }

    /* renamed from: t */
    private final void m103912t(C20007a c20007a, InterfaceC21299i interfaceC21299i) {
        C29037t0 c29037t0 = new C29037t0(interfaceC21299i);
        c29037t0.f103775r = 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            String m103825c = c20007a.m103825c();
            Charset charset = StandardCharsets.UTF_8;
            AbstractC19074t.m100207e(charset, "UTF_8");
            byte[] bytes = m103825c.getBytes(charset);
            AbstractC19074t.m100207e(bytes, "getBytes(...)");
            byteArrayOutputStream.write(AbstractC17522a.m93344g(c20007a.m103827e()));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(c20007a.m103830h()));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(c20007a.m103824b()));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(c20007a.m103823a()));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(c20007a.m103826d()));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(c20007a.m103829g()));
            byteArrayOutputStream.write(AbstractC17522a.m93344g(bytes.length));
            byteArrayOutputStream.write(bytes);
            byteArrayOutputStream.write(AbstractC17522a.m93346i(c20007a.m103831i()));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        RequestPacket requestPacket = new RequestPacket();
        boolean z11 = true;
        requestPacket.m93301w((byte) 1);
        requestPacket.m93302x((byte) 0);
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        requestPacket.m93273D(Integer.parseInt(str));
        requestPacket.m93274E((byte) 3);
        requestPacket.m93295q((short) 406);
        requestPacket.m93275F((byte) 3);
        requestPacket.m93303y(byteArrayOutputStream.toByteArray());
        c29037t0.m110313i0(requestPacket);
        if (C32257b4.m155726m().m155737l().m117076X() && AbstractC3096i0.f13167k == 3 && C32257b4.m155726m().m155737l().m117035J0()) {
            z11 = false;
        }
        if (C23055e5.m118272g(z11)) {
            C0829l0.m2174c(c29037t0);
        } else {
            c29037t0.mo51554n();
        }
    }

    /* renamed from: n */
    public final Handler m103913n() {
        return this.f98410e;
    }

    /* renamed from: p */
    public final Job m103914p(C20007a c20007a) {
        Job m112540d;
        AbstractC19074t.m100208f(c20007a, "info");
        m112540d = BuildersKt__Builders_commonKt.m112540d(this.f98407b, null, null, new e(c20007a, null), 3, null);
        return m112540d;
    }

    /* renamed from: r */
    public final void m103915r(EnumC30982b enumC30982b) {
        AbstractC19074t.m100208f(enumC30982b, "networkState");
        this.f98410e.removeMessages(1);
        Message message = new Message();
        message.what = 1;
        message.obj = enumC30982b;
        this.f98410e.sendMessageDelayed(message, 2000L);
    }

    /* renamed from: u */
    public final synchronized Job m103916u(C20007a c20007a) {
        Job m112540d;
        AbstractC19074t.m100208f(c20007a, "info");
        m112540d = BuildersKt__Builders_commonKt.m112540d(this.f98407b, null, null, new h(c20007a, this, null), 3, null);
        return m112540d;
    }
}
