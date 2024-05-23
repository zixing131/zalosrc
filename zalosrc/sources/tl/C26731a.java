package tl;

import androidx.work.AbstractC2144f;
import ch0.AbstractC3488c;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.data.zalocloud.model.api.CloudMediaItemResponse;
import com.zing.zalo.data.zalocloud.model.api.ExtInfo;
import com.zing.zalo.data.zalocloud.model.api.Msg;
import com.zing.zalo.data.zalocloud.model.api.MsgInfo;
import com.zing.zalo.zalocloud.configs.C16805b;
import dg0.AbstractC17930e;
import dh0.C17933b;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import nh0.InterfaceC23792b;
import nl.C23870a;
import on0.AbstractC24341v;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p487rl.C25821b;
import p579vl.C28290a;
import p620wt.AbstractC29233h;
import p620wt.AbstractC29235j;
import p620wt.C29234i;
import p620wt.InterfaceC29232g;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;
import qm0.AbstractC25370t;
import tg0.C26675a;
import tg0.C26676b;
import tl.C26731a;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: tl.a */
/* loaded from: classes3.dex */
public final class C26731a {
    public static final c Companion = new c(null);

    /* renamed from: g */
    private static final InterfaceC24854k f126773g;

    /* renamed from: h */
    private static final AtomicInteger f126774h;

    /* renamed from: a */
    private final C23870a f126775a;

    /* renamed from: b */
    private final C16805b f126776b;

    /* renamed from: c */
    private final InterfaceC23792b f126777c;

    /* renamed from: d */
    private final InterfaceC27315f f126778d;

    /* renamed from: e */
    private final C29234i f126779e;

    /* renamed from: f */
    private final InterfaceC29232g f126780f;

    /* renamed from: tl.a$a */
    /* loaded from: classes3.dex */
    public static abstract class a {

        /* renamed from: tl.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C32984a extends a {

            /* renamed from: a */
            private final String f126781a;

            /* renamed from: b */
            private final C25821b f126782b;

            /* renamed from: c */
            private final boolean f126783c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C32984a(String str, C25821b c25821b, boolean z11) {
                super(null);
                AbstractC19074t.m100208f(str, "noiseId");
                AbstractC19074t.m100208f(c25821b, "item");
                this.f126781a = str;
                this.f126782b = c25821b;
                this.f126783c = z11;
            }

            /* renamed from: a */
            public final C25821b m137510a() {
                return this.f126782b;
            }

            /* renamed from: b */
            public final boolean m137511b() {
                return this.f126783c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C32984a)) {
                    return false;
                }
                C32984a c32984a = (C32984a) obj;
                return AbstractC19074t.m100204b(this.f126781a, c32984a.f126781a) && AbstractC19074t.m100204b(this.f126782b, c32984a.f126782b) && this.f126783c == c32984a.f126783c;
            }

            public int hashCode() {
                return (((this.f126781a.hashCode() * 31) + this.f126782b.hashCode()) * 31) + AbstractC2144f.m11520a(this.f126783c);
            }

            public String toString() {
                return "Add(noiseId=" + this.f126781a + ", item=" + this.f126782b + ", isPendingVerifying=" + this.f126783c + ")";
            }
        }

        /* renamed from: tl.a$a$b */
        /* loaded from: classes3.dex */
        public static final class b extends a {

            /* renamed from: a */
            private final List f126784a;

            /* renamed from: b */
            private final String f126785b;

            /* renamed from: c */
            private final String f126786c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(List list, String str, String str2) {
                super(null);
                AbstractC19074t.m100208f(list, "listMsgToDelete");
                AbstractC19074t.m100208f(str, "ownerId");
                AbstractC19074t.m100208f(str2, "senderUid");
                this.f126784a = list;
                this.f126785b = str;
                this.f126786c = str2;
            }

            /* renamed from: a */
            public final List m137512a() {
                return this.f126784a;
            }

            /* renamed from: b */
            public final String m137513b() {
                return this.f126785b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return AbstractC19074t.m100204b(this.f126784a, bVar.f126784a) && AbstractC19074t.m100204b(this.f126785b, bVar.f126785b) && AbstractC19074t.m100204b(this.f126786c, bVar.f126786c);
            }

            public int hashCode() {
                return (((this.f126784a.hashCode() * 31) + this.f126785b.hashCode()) * 31) + this.f126786c.hashCode();
            }

            public String toString() {
                return "Delete(listMsgToDelete=" + this.f126784a + ", ownerId=" + this.f126785b + ", senderUid=" + this.f126786c + ")";
            }
        }

        /* renamed from: tl.a$a$c */
        /* loaded from: classes3.dex */
        public static final class c extends a {

            /* renamed from: a */
            private final MsgInfo f126787a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(MsgInfo msgInfo) {
                super(null);
                AbstractC19074t.m100208f(msgInfo, "msgInfo");
                this.f126787a = msgInfo;
            }

            /* renamed from: a */
            public final MsgInfo m137514a() {
                return this.f126787a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && AbstractC19074t.m100204b(this.f126787a, ((c) obj).f126787a);
            }

            public int hashCode() {
                return this.f126787a.hashCode();
            }

            public String toString() {
                return "DeleteThread(msgInfo=" + this.f126787a + ")";
            }
        }

        /* renamed from: tl.a$a$d */
        /* loaded from: classes3.dex */
        public static final class d extends a {

            /* renamed from: a */
            public static final d f126788a = new d();

            private d() {
                super(null);
            }
        }

        /* renamed from: tl.a$a$e */
        /* loaded from: classes3.dex */
        public static final class e extends a {

            /* renamed from: a */
            private final String f126789a;

            /* renamed from: b */
            private final MsgInfo f126790b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String str, MsgInfo msgInfo) {
                super(null);
                AbstractC19074t.m100208f(str, "noiseId");
                AbstractC19074t.m100208f(msgInfo, "msgInfo");
                this.f126789a = str;
                this.f126790b = msgInfo;
            }

            /* renamed from: a */
            public final MsgInfo m137515a() {
                return this.f126790b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return AbstractC19074t.m100204b(this.f126789a, eVar.f126789a) && AbstractC19074t.m100204b(this.f126790b, eVar.f126790b);
            }

            public int hashCode() {
                return (this.f126789a.hashCode() * 31) + this.f126790b.hashCode();
            }

            public String toString() {
                return "ResetCloud(noiseId=" + this.f126789a + ", msgInfo=" + this.f126790b + ")";
            }
        }

        /* renamed from: tl.a$a$f */
        /* loaded from: classes3.dex */
        public static final class f extends a {

            /* renamed from: a */
            private final MsgInfo f126791a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(MsgInfo msgInfo) {
                super(null);
                AbstractC19074t.m100208f(msgInfo, "msgInfo");
                this.f126791a = msgInfo;
            }

            /* renamed from: a */
            public final MsgInfo m137516a() {
                return this.f126791a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && AbstractC19074t.m100204b(this.f126791a, ((f) obj).f126791a);
            }

            public int hashCode() {
                return this.f126791a.hashCode();
            }

            public String toString() {
                return "Temp(msgInfo=" + this.f126791a + ")";
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: tl.a$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f126792q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C26731a mo12V4() {
            return d.f126793a.m137519a();
        }
    }

    /* renamed from: tl.a$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C26731a m137518a() {
            return (C26731a) C26731a.f126773g.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tl.a$d */
    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a */
        public static final d f126793a = new d();

        /* renamed from: b */
        private static final C26731a f126794b;

        static {
            C23870a m120679j2 = AbstractC23306f.m120679j2();
            AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
            C16805b m120633X1 = AbstractC23306f.m120633X1();
            AbstractC19074t.m100207e(m120633X1, "provideZaloCloudConfigs(...)");
            InterfaceC23792b m120579F1 = AbstractC23306f.m120579F1();
            AbstractC19074t.m100207e(m120579F1, "provideTimeProvider(...)");
            f126794b = new C26731a(m120679j2, m120633X1, m120579F1, null, 8, null);
        }

        private d() {
        }

        /* renamed from: a */
        public final C26731a m137519a() {
            return f126794b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tl.a$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        Object f126795A;

        /* renamed from: B */
        int f126796B;

        /* renamed from: C */
        final /* synthetic */ List f126797C;

        /* renamed from: D */
        final /* synthetic */ boolean f126798D;

        /* renamed from: E */
        final /* synthetic */ C26731a f126799E;

        /* renamed from: t */
        Object f126800t;

        /* renamed from: u */
        Object f126801u;

        /* renamed from: v */
        Object f126802v;

        /* renamed from: w */
        Object f126803w;

        /* renamed from: x */
        Object f126804x;

        /* renamed from: y */
        Object f126805y;

        /* renamed from: z */
        Object f126806z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(List list, boolean z11, C26731a c26731a, Continuation continuation) {
            super(2, continuation);
            this.f126797C = list;
            this.f126798D = z11;
            this.f126799E = c26731a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public static final void m137521t() {
            C23744a.Companion.m124119a().m124116d(150801, new Object[0]);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f126797C, this.f126798D, this.f126799E, continuation);
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0376  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x039e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x039f  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0348  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x02e2  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0317  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x033e  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x02a2  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x025f  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0292  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x022e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x028f -> B:52:0x0290). Please report as a decompilation issue!!! */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            boolean z11;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            ArrayList arrayList8;
            ArrayList arrayList9;
            ArrayList arrayList10;
            ArrayList arrayList11;
            Iterator it;
            ArrayList arrayList12;
            C26731a c26731a;
            e eVar;
            C26731a c26731a2;
            Iterator it2;
            ArrayList arrayList13;
            ArrayList arrayList14;
            ArrayList arrayList15;
            C26731a c26731a3;
            Iterator it3;
            e eVar2;
            ArrayList arrayList16;
            ArrayList arrayList17;
            ArrayList arrayList18;
            ArrayList arrayList19;
            ArrayList arrayList20;
            C23870a c23870a;
            ArrayList arrayList21;
            m142578e = AbstractC28298d.m142578e();
            switch (this.f126796B) {
                case 0:
                    AbstractC24862s.m129228b(obj);
                    C26676b.m136960j("SMLZCloudItemProcessor", "persistDB(): " + this.f126797C.size() + " item(s)");
                    ArrayList arrayList22 = new ArrayList();
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList();
                    arrayList3 = new ArrayList();
                    arrayList4 = new ArrayList();
                    ArrayList arrayList23 = new ArrayList();
                    ArrayList arrayList24 = new ArrayList();
                    for (a aVar : this.f126797C) {
                        if (aVar instanceof a.C32984a) {
                            a.C32984a c32984a = (a.C32984a) aVar;
                            C25821b m137510a = c32984a.m137510a();
                            arrayList22.add(m137510a);
                            if (this.f126798D && !m137510a.m133156s()) {
                                arrayList23.add(m137510a.m133141d());
                            }
                            if (c32984a.m137511b()) {
                                arrayList24.add(m137510a.m133141d());
                            }
                        } else if (aVar instanceof a.b) {
                            a.b bVar = (a.b) aVar;
                            for (Msg msg : bVar.m137512a()) {
                                arrayList.add(MessageId.C7932a.m41060c(MessageId.Companion, msg.m41358a(), msg.m41359b(), bVar.m137513b(), null, 8, null));
                            }
                        } else if (aVar instanceof a.c) {
                            arrayList2.add(((a.c) aVar).m137514a());
                        } else if (aVar instanceof a.f) {
                            arrayList3.add(((a.f) aVar).m137516a());
                        } else if (aVar instanceof a.e) {
                            arrayList4.add(aVar);
                        } else {
                            AbstractC19074t.m100204b(aVar, a.d.f126788a);
                        }
                    }
                    C26676b.m136957g("SMLZCloudItemProcessor", "persistDB(): ADD=" + arrayList22.size() + ", DELETE=" + arrayList.size() + ", DELETE_THREAD=" + arrayList2.size(), null, 4, null);
                    z11 = true;
                    if (!arrayList22.isEmpty()) {
                        C23870a c23870a2 = this.f126799E.f126775a;
                        this.f126800t = arrayList;
                        this.f126801u = arrayList2;
                        this.f126802v = arrayList3;
                        this.f126803w = arrayList4;
                        this.f126804x = arrayList23;
                        this.f126805y = arrayList24;
                        this.f126796B = 1;
                        if (c23870a2.m124776K0(arrayList22, this) == m142578e) {
                            return m142578e;
                        }
                    }
                    arrayList5 = arrayList23;
                    arrayList6 = arrayList24;
                    if (arrayList.isEmpty() ^ z11) {
                        C23870a c23870a3 = this.f126799E.f126775a;
                        this.f126800t = arrayList;
                        this.f126801u = arrayList2;
                        this.f126802v = arrayList3;
                        this.f126803w = arrayList4;
                        this.f126804x = arrayList5;
                        this.f126805y = arrayList6;
                        this.f126796B = 2;
                        if (c23870a3.m124764E(arrayList, this) == m142578e) {
                            return m142578e;
                        }
                    }
                    C26731a c26731a4 = this.f126799E;
                    Iterator it4 = arrayList2.iterator();
                    arrayList7 = arrayList2;
                    arrayList8 = arrayList;
                    arrayList9 = arrayList4;
                    arrayList10 = arrayList3;
                    arrayList11 = arrayList6;
                    it = it4;
                    arrayList12 = arrayList5;
                    c26731a = c26731a4;
                    eVar = this;
                    if (it.hasNext()) {
                        MsgInfo msgInfo = (MsgInfo) it.next();
                        C23870a c23870a4 = c26731a.f126775a;
                        String m17485h = AbstractC3488c.m17485h(msgInfo);
                        C26731a c26731a5 = c26731a;
                        long m41368h = msgInfo.m41368h();
                        eVar.f126800t = arrayList8;
                        eVar.f126801u = arrayList7;
                        eVar.f126802v = arrayList10;
                        eVar.f126803w = arrayList9;
                        eVar.f126804x = arrayList12;
                        eVar.f126805y = arrayList11;
                        eVar.f126806z = c26731a5;
                        eVar.f126795A = it;
                        eVar.f126796B = 3;
                        if (c23870a4.m124770H(m17485h, m41368h, eVar) == m142578e) {
                            return m142578e;
                        }
                        c26731a = c26731a5;
                        if (it.hasNext()) {
                            c26731a2 = eVar.f126799E;
                            it2 = arrayList10.iterator();
                            arrayList13 = arrayList7;
                            arrayList14 = arrayList8;
                            while (it2.hasNext()) {
                                MsgInfo msgInfo2 = (MsgInfo) it2.next();
                                C23870a c23870a5 = c26731a2.f126775a;
                                String valueOf = String.valueOf(msgInfo2.m41361a());
                                eVar.f126800t = arrayList14;
                                eVar.f126801u = arrayList13;
                                eVar.f126802v = arrayList9;
                                eVar.f126803w = arrayList12;
                                eVar.f126804x = arrayList11;
                                eVar.f126805y = c26731a2;
                                eVar.f126806z = it2;
                                eVar.f126795A = null;
                                eVar.f126796B = 4;
                                if (c23870a5.m124825q(valueOf, eVar) == m142578e) {
                                    return m142578e;
                                }
                            }
                            arrayList15 = arrayList14;
                            e eVar3 = eVar;
                            c26731a3 = eVar.f126799E;
                            it3 = arrayList9.iterator();
                            eVar2 = eVar3;
                            while (it3.hasNext()) {
                                a.e eVar4 = (a.e) it3.next();
                                C23870a c23870a6 = c26731a3.f126775a;
                                long m41368h2 = eVar4.m137515a().m41368h();
                                eVar2.f126800t = arrayList15;
                                eVar2.f126801u = arrayList13;
                                eVar2.f126802v = arrayList12;
                                eVar2.f126803w = arrayList11;
                                eVar2.f126804x = c26731a3;
                                eVar2.f126805y = it3;
                                eVar2.f126806z = null;
                                eVar2.f126795A = null;
                                eVar2.f126796B = 5;
                                if (c23870a6.m124805c1(m41368h2, eVar2) == m142578e) {
                                    return m142578e;
                                }
                            }
                            if (!arrayList12.isEmpty()) {
                                C23870a c23870a7 = eVar2.f126799E.f126775a;
                                eVar2.f126800t = arrayList15;
                                eVar2.f126801u = arrayList13;
                                eVar2.f126802v = arrayList11;
                                eVar2.f126803w = null;
                                eVar2.f126804x = null;
                                eVar2.f126805y = null;
                                eVar2.f126806z = null;
                                eVar2.f126795A = null;
                                eVar2.f126796B = 6;
                                if (c23870a7.m124782N0(arrayList12, eVar2) == m142578e) {
                                    return m142578e;
                                }
                                arrayList18 = arrayList11;
                                arrayList19 = arrayList13;
                                arrayList11 = arrayList18;
                                arrayList17 = arrayList19;
                                arrayList16 = arrayList15;
                                if (!arrayList11.isEmpty()) {
                                    C23870a c23870a8 = eVar2.f126799E.f126775a;
                                    eVar2.f126800t = arrayList16;
                                    eVar2.f126801u = arrayList17;
                                    eVar2.f126802v = null;
                                    eVar2.f126803w = null;
                                    eVar2.f126804x = null;
                                    eVar2.f126805y = null;
                                    eVar2.f126806z = null;
                                    eVar2.f126795A = null;
                                    eVar2.f126796B = 7;
                                    if (c23870a8.m124780M0(arrayList11, eVar2) == m142578e) {
                                        return m142578e;
                                    }
                                }
                                arrayList20 = arrayList17;
                                if (!(!arrayList16.isEmpty()) || (!arrayList20.isEmpty())) {
                                    c23870a = eVar2.f126799E.f126775a;
                                    eVar2.f126800t = arrayList16;
                                    eVar2.f126801u = arrayList20;
                                    eVar2.f126802v = null;
                                    eVar2.f126803w = null;
                                    eVar2.f126804x = null;
                                    eVar2.f126805y = null;
                                    eVar2.f126806z = null;
                                    eVar2.f126795A = null;
                                    eVar2.f126796B = 8;
                                    if (c23870a.m124801a1(eVar2) != m142578e) {
                                        return m142578e;
                                    }
                                    arrayList21 = arrayList16;
                                    arrayList16 = arrayList21;
                                }
                                if (!(!arrayList16.isEmpty()) || (!arrayList20.isEmpty())) {
                                    AbstractC23306f.m120695n2().m136692D(true);
                                    AbstractC17930e.Companion.m94551d().mo94530d("PUSH_EVENT_CLOUD_ITEM_DELETED", new Runnable() { // from class: tl.b
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C26731a.e.m137521t();
                                        }
                                    }, 1000L);
                                }
                                return C24848g0.f119245a;
                            }
                            arrayList16 = arrayList15;
                            arrayList17 = arrayList13;
                            if (!arrayList11.isEmpty()) {
                            }
                            arrayList20 = arrayList17;
                            if (!(!arrayList16.isEmpty())) {
                            }
                            c23870a = eVar2.f126799E.f126775a;
                            eVar2.f126800t = arrayList16;
                            eVar2.f126801u = arrayList20;
                            eVar2.f126802v = null;
                            eVar2.f126803w = null;
                            eVar2.f126804x = null;
                            eVar2.f126805y = null;
                            eVar2.f126806z = null;
                            eVar2.f126795A = null;
                            eVar2.f126796B = 8;
                            if (c23870a.m124801a1(eVar2) != m142578e) {
                            }
                        }
                    }
                    break;
                case 1:
                    arrayList6 = (ArrayList) this.f126805y;
                    arrayList5 = (ArrayList) this.f126804x;
                    arrayList4 = (ArrayList) this.f126803w;
                    arrayList3 = (ArrayList) this.f126802v;
                    arrayList2 = (ArrayList) this.f126801u;
                    arrayList = (ArrayList) this.f126800t;
                    AbstractC24862s.m129228b(obj);
                    z11 = true;
                    if (arrayList.isEmpty() ^ z11) {
                    }
                    C26731a c26731a42 = this.f126799E;
                    Iterator it42 = arrayList2.iterator();
                    arrayList7 = arrayList2;
                    arrayList8 = arrayList;
                    arrayList9 = arrayList4;
                    arrayList10 = arrayList3;
                    arrayList11 = arrayList6;
                    it = it42;
                    arrayList12 = arrayList5;
                    c26731a = c26731a42;
                    eVar = this;
                    if (it.hasNext()) {
                    }
                    break;
                case 2:
                    arrayList6 = (ArrayList) this.f126805y;
                    arrayList5 = (ArrayList) this.f126804x;
                    arrayList4 = (ArrayList) this.f126803w;
                    arrayList3 = (ArrayList) this.f126802v;
                    arrayList2 = (ArrayList) this.f126801u;
                    arrayList = (ArrayList) this.f126800t;
                    AbstractC24862s.m129228b(obj);
                    C26731a c26731a422 = this.f126799E;
                    Iterator it422 = arrayList2.iterator();
                    arrayList7 = arrayList2;
                    arrayList8 = arrayList;
                    arrayList9 = arrayList4;
                    arrayList10 = arrayList3;
                    arrayList11 = arrayList6;
                    it = it422;
                    arrayList12 = arrayList5;
                    c26731a = c26731a422;
                    eVar = this;
                    if (it.hasNext()) {
                    }
                    break;
                case 3:
                    it = (Iterator) this.f126795A;
                    c26731a = (C26731a) this.f126806z;
                    arrayList11 = (ArrayList) this.f126805y;
                    arrayList12 = (ArrayList) this.f126804x;
                    arrayList9 = (ArrayList) this.f126803w;
                    arrayList10 = (ArrayList) this.f126802v;
                    arrayList7 = (ArrayList) this.f126801u;
                    arrayList8 = (ArrayList) this.f126800t;
                    AbstractC24862s.m129228b(obj);
                    eVar = this;
                    if (it.hasNext()) {
                    }
                    break;
                case 4:
                    it2 = (Iterator) this.f126806z;
                    c26731a2 = (C26731a) this.f126805y;
                    arrayList11 = (ArrayList) this.f126804x;
                    arrayList12 = (ArrayList) this.f126803w;
                    arrayList9 = (ArrayList) this.f126802v;
                    arrayList13 = (ArrayList) this.f126801u;
                    arrayList14 = (ArrayList) this.f126800t;
                    AbstractC24862s.m129228b(obj);
                    eVar = this;
                    while (it2.hasNext()) {
                    }
                    arrayList15 = arrayList14;
                    e eVar32 = eVar;
                    c26731a3 = eVar.f126799E;
                    it3 = arrayList9.iterator();
                    eVar2 = eVar32;
                    while (it3.hasNext()) {
                    }
                    if (!arrayList12.isEmpty()) {
                    }
                    break;
                case 5:
                    it3 = (Iterator) this.f126805y;
                    c26731a3 = (C26731a) this.f126804x;
                    ArrayList arrayList25 = (ArrayList) this.f126803w;
                    ArrayList arrayList26 = (ArrayList) this.f126802v;
                    ArrayList arrayList27 = (ArrayList) this.f126801u;
                    ArrayList arrayList28 = (ArrayList) this.f126800t;
                    AbstractC24862s.m129228b(obj);
                    eVar2 = this;
                    arrayList13 = arrayList27;
                    arrayList12 = arrayList26;
                    arrayList11 = arrayList25;
                    arrayList15 = arrayList28;
                    while (it3.hasNext()) {
                    }
                    if (!arrayList12.isEmpty()) {
                    }
                    break;
                case 6:
                    arrayList18 = (ArrayList) this.f126802v;
                    arrayList19 = (ArrayList) this.f126801u;
                    arrayList15 = (ArrayList) this.f126800t;
                    AbstractC24862s.m129228b(obj);
                    eVar2 = this;
                    arrayList11 = arrayList18;
                    arrayList17 = arrayList19;
                    arrayList16 = arrayList15;
                    if (!arrayList11.isEmpty()) {
                    }
                    arrayList20 = arrayList17;
                    if (!(!arrayList16.isEmpty())) {
                    }
                    c23870a = eVar2.f126799E.f126775a;
                    eVar2.f126800t = arrayList16;
                    eVar2.f126801u = arrayList20;
                    eVar2.f126802v = null;
                    eVar2.f126803w = null;
                    eVar2.f126804x = null;
                    eVar2.f126805y = null;
                    eVar2.f126806z = null;
                    eVar2.f126795A = null;
                    eVar2.f126796B = 8;
                    if (c23870a.m124801a1(eVar2) != m142578e) {
                    }
                    break;
                case 7:
                    arrayList17 = (ArrayList) this.f126801u;
                    arrayList16 = (ArrayList) this.f126800t;
                    AbstractC24862s.m129228b(obj);
                    eVar2 = this;
                    arrayList20 = arrayList17;
                    if (!(!arrayList16.isEmpty())) {
                    }
                    c23870a = eVar2.f126799E.f126775a;
                    eVar2.f126800t = arrayList16;
                    eVar2.f126801u = arrayList20;
                    eVar2.f126802v = null;
                    eVar2.f126803w = null;
                    eVar2.f126804x = null;
                    eVar2.f126805y = null;
                    eVar2.f126806z = null;
                    eVar2.f126795A = null;
                    eVar2.f126796B = 8;
                    if (c23870a.m124801a1(eVar2) != m142578e) {
                    }
                    break;
                case 8:
                    arrayList20 = (ArrayList) this.f126801u;
                    arrayList21 = (ArrayList) this.f126800t;
                    AbstractC24862s.m129228b(obj);
                    arrayList16 = arrayList21;
                    if (!(!arrayList16.isEmpty())) {
                        break;
                    }
                    AbstractC23306f.m120695n2().m136692D(true);
                    AbstractC17930e.Companion.m94551d().mo94530d("PUSH_EVENT_CLOUD_ITEM_DELETED", new Runnable() { // from class: tl.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            C26731a.e.m137521t();
                        }
                    }, 1000L);
                    return C24848g0.f119245a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: tl.a$f */
    /* loaded from: classes3.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: tl.a$f$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            Object f126808t;

            /* renamed from: u */
            Object f126809u;

            /* renamed from: v */
            int f126810v;

            /* renamed from: w */
            final /* synthetic */ Channel f126811w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Channel channel, Continuation continuation) {
                super(2, continuation);
                this.f126811w = channel;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f126811w, continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x004a A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[Catch: all -> 0x006f, TryCatch #2 {all -> 0x006f, blocks: (B:16:0x0050, B:18:0x0058, B:22:0x0072), top: B:15:0x0050 }] */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0072 A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #2 {all -> 0x006f, blocks: (B:16:0x0050, B:18:0x0058, B:22:0x0072), top: B:15:0x0050 }] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006b -> B:10:0x003e). Please report as a decompilation issue!!! */
            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo239o(Object obj) {
                Object m142578e;
                ReceiveChannel receiveChannel;
                ChannelIterator it;
                a aVar;
                Object mo113028a;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f126810v;
                try {
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                ChannelIterator channelIterator = (ChannelIterator) this.f126809u;
                                receiveChannel = (ReceiveChannel) this.f126808t;
                                AbstractC24862s.m129228b(obj);
                                it = channelIterator;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ChannelIterator channelIterator2 = (ChannelIterator) this.f126809u;
                            ReceiveChannel receiveChannel2 = (ReceiveChannel) this.f126808t;
                            AbstractC24862s.m129228b(obj);
                            ReceiveChannel receiveChannel3 = receiveChannel2;
                            a aVar2 = this;
                            try {
                                if (!((Boolean) obj).booleanValue()) {
                                    Job job = (Job) channelIterator2.next();
                                    aVar2.f126808t = receiveChannel3;
                                    aVar2.f126809u = channelIterator2;
                                    aVar2.f126810v = 2;
                                    if (job.mo112736c0(aVar2) == m142578e) {
                                        return m142578e;
                                    }
                                    it = channelIterator2;
                                    aVar = aVar2;
                                    receiveChannel = receiveChannel3;
                                    aVar.f126808t = receiveChannel;
                                    aVar.f126809u = it;
                                    aVar.f126810v = 1;
                                    mo113028a = it.mo113028a(aVar);
                                    if (mo113028a != m142578e) {
                                        return m142578e;
                                    }
                                    a aVar3 = aVar;
                                    channelIterator2 = it;
                                    obj = mo113028a;
                                    receiveChannel3 = receiveChannel;
                                    aVar2 = aVar3;
                                    if (!((Boolean) obj).booleanValue()) {
                                        C24848g0 c24848g0 = C24848g0.f119245a;
                                        ChannelsKt.m113108b(receiveChannel3, null);
                                        return C24848g0.f119245a;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                receiveChannel = receiveChannel3;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    ChannelsKt.m113108b(receiveChannel, th);
                                    throw th3;
                                }
                            }
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        receiveChannel = this.f126811w;
                        it = receiveChannel.iterator();
                    }
                    aVar = this;
                    aVar.f126808t = receiveChannel;
                    aVar.f126809u = it;
                    aVar.f126810v = 1;
                    mo113028a = it.mo113028a(aVar);
                    if (mo113028a != m142578e) {
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Channel mo12V4() {
            Channel m113079b = ChannelKt.m113079b(Integer.MAX_VALUE, null, null, 6, null);
            BuildersKt__Builders_commonKt.m112540d(C26731a.this.m137497l(), null, null, new a(m113079b, null), 3, null);
            return m113079b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tl.a$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f126812t;

        /* renamed from: u */
        final /* synthetic */ int f126813u;

        /* renamed from: v */
        final /* synthetic */ C26731a f126814v;

        /* renamed from: w */
        final /* synthetic */ List f126815w;

        /* renamed from: x */
        final /* synthetic */ boolean f126816x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i11, C26731a c26731a, List list, boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f126813u = i11;
            this.f126814v = c26731a;
            this.f126815w = list;
            this.f126816x = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new g(this.f126813u, this.f126814v, this.f126815w, this.f126816x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f126812t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C26676b.m136952b("SMLZCloudItemProcessor", "Calling persistDb() #" + this.f126813u);
                C26731a c26731a = this.f126814v;
                List list = this.f126815w;
                boolean z11 = this.f126816x;
                this.f126812t = 1;
                if (c26731a.m137503r(list, z11, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tl.a$h */
    /* loaded from: classes3.dex */
    public static final class h extends AbstractC29096d {

        /* renamed from: s */
        Object f126817s;

        /* renamed from: t */
        Object f126818t;

        /* renamed from: u */
        boolean f126819u;

        /* renamed from: v */
        int f126820v;

        /* renamed from: w */
        /* synthetic */ Object f126821w;

        /* renamed from: y */
        int f126823y;

        h(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f126821w = obj;
            this.f126823y |= Integer.MIN_VALUE;
            return C26731a.this.m137509u(null, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tl.a$i */
    /* loaded from: classes3.dex */
    public static final class i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f126824t;

        /* renamed from: u */
        private /* synthetic */ Object f126825u;

        /* renamed from: v */
        final /* synthetic */ List f126826v;

        /* renamed from: w */
        final /* synthetic */ C26731a f126827w;

        /* renamed from: x */
        final /* synthetic */ boolean f126828x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: tl.a$i$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f126829t;

            /* renamed from: u */
            final /* synthetic */ C26731a f126830u;

            /* renamed from: v */
            final /* synthetic */ CloudMediaItemResponse f126831v;

            /* renamed from: w */
            final /* synthetic */ boolean f126832w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C26731a c26731a, CloudMediaItemResponse cloudMediaItemResponse, boolean z11, Continuation continuation) {
                super(2, continuation);
                this.f126830u = c26731a;
                this.f126831v = cloudMediaItemResponse;
                this.f126832w = z11;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f126830u, this.f126831v, this.f126832w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f126829t == 0) {
                    AbstractC24862s.m129228b(obj);
                    return this.f126830u.m137505v(this.f126831v, this.f126832w);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(List list, C26731a c26731a, boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f126826v = list;
            this.f126827w = c26731a;
            this.f126828x = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            i iVar = new i(this.f126826v, this.f126827w, this.f126828x, continuation);
            iVar.f126825u = obj;
            return iVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int m131511r;
            Deferred m112538b;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f126824t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f126825u;
                List list = this.f126826v;
                C26731a c26731a = this.f126827w;
                boolean z11 = this.f126828x;
                m131511r = AbstractC25370t.m131511r(list, 10);
                ArrayList arrayList = new ArrayList(m131511r);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    m112538b = BuildersKt__Builders_commonKt.m112538b(coroutineScope, c26731a.f126778d, null, new a(c26731a, (CloudMediaItemResponse) it.next(), z11, null), 2, null);
                    arrayList.add(m112538b);
                }
                this.f126824t = 1;
                obj = AwaitKt.m112521a(arrayList, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(b.f126792q);
        f126773g = m129210a;
        f126774h = new AtomicInteger(0);
    }

    public C26731a(C23870a c23870a, C16805b c16805b, InterfaceC23792b interfaceC23792b, InterfaceC27315f interfaceC27315f) {
        AbstractC19074t.m100208f(c23870a, "zaloCloudRepo");
        AbstractC19074t.m100208f(c16805b, "zaloCloudConfigs");
        AbstractC19074t.m100208f(interfaceC23792b, "timeProvider");
        AbstractC19074t.m100208f(interfaceC27315f, "ioDispatcher");
        this.f126775a = c23870a;
        this.f126776b = c16805b;
        this.f126777c = interfaceC23792b;
        this.f126778d = interfaceC27315f;
        C29234i m145994a = AbstractC29235j.m145994a();
        this.f126779e = m145994a;
        this.f126780f = AbstractC29233h.m145991b(m145994a, new f());
    }

    /* renamed from: g */
    private final void m137494g(CloudMediaItemResponse cloudMediaItemResponse) {
        long mo124314i = this.f126777c.mo124314i() - cloudMediaItemResponse.m41298f();
        if (mo124314i < this.f126776b.m89799e().m89745c()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("source", 1);
        jSONObject.put("noiseId", cloudMediaItemResponse.m41297e());
        jSONObject.put("diff", mo124314i);
        C26675a.m136890L(C26675a.f126213a, 1504214, -1, null, jSONObject, 0L, 0L, 52, null);
    }

    /* renamed from: j */
    public static final C26731a m137495j() {
        return Companion.m137518a();
    }

    /* renamed from: k */
    private final Channel m137496k() {
        return (Channel) this.f126780f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final CoroutineScope m137497l() {
        return C17933b.f90533a.m94579d();
    }

    /* renamed from: m */
    private final a m137498m(CloudMediaItemResponse cloudMediaItemResponse) {
        C26676b.m136957g("SMLZCloudItemProcessor", "handleActionResetCloud(): " + cloudMediaItemResponse, null, 4, null);
        return new a.e(cloudMediaItemResponse.m41297e(), cloudMediaItemResponse.m41296d());
    }

    /* renamed from: n */
    private final a m137499n(CloudMediaItemResponse cloudMediaItemResponse, boolean z11) {
        return new a.C32984a(cloudMediaItemResponse.m41297e(), AbstractC3488c.m17492o(cloudMediaItemResponse), !z11);
    }

    /* renamed from: o */
    private final a m137500o(CloudMediaItemResponse cloudMediaItemResponse) {
        List m41345b;
        ExtInfo m41364d = cloudMediaItemResponse.m41296d().m41364d();
        if (m41364d != null && (m41345b = m41364d.m41345b()) != null) {
            return new a.b(m41345b, AbstractC3488c.m17485h(cloudMediaItemResponse.m41296d()), String.valueOf(cloudMediaItemResponse.m41296d().m41367g()));
        }
        return a.d.f126788a;
    }

    /* renamed from: p */
    private final a m137501p(CloudMediaItemResponse cloudMediaItemResponse) {
        C26676b.m136957g("SMLZCloudItemProcessor", "handleDeleteThreadCloudMedia(): " + cloudMediaItemResponse, null, 4, null);
        return new a.c(cloudMediaItemResponse.m41296d());
    }

    /* renamed from: q */
    private final a m137502q(CloudMediaItemResponse cloudMediaItemResponse) {
        C26676b.m136957g("SMLZCloudItemProcessor", "handleTempCloudMedia(): " + cloudMediaItemResponse, null, 4, null);
        return new a.f(cloudMediaItemResponse.m41296d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final Object m137503r(List list, boolean z11, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(this.f126778d, new e(list, z11, this, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: s */
    private final Object m137504s(List list, boolean z11, Continuation continuation) {
        Job m112540d;
        String str;
        m112540d = BuildersKt__Builders_commonKt.m112540d(m137497l(), null, CoroutineStart.LAZY, new g(f126774h.addAndGet(1), this, list, z11, null), 1, null);
        Object mo112912p = m137496k().mo112912p(m112540d);
        if (mo112912p instanceof ChannelResult.Failed) {
            Throwable m113084e = ChannelResult.m113084e(mo112912p);
            if (m113084e != null) {
                str = m113084e.getMessage();
            } else {
                str = null;
            }
            C26676b.m136955e("SMLZCloudItemProcessor", "Error while sending persist db job into channel: " + str, C26676b.b.f126335t);
        }
        return C24848g0.f119245a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public final a m137505v(CloudMediaItemResponse cloudMediaItemResponse, boolean z11) {
        if (!z11) {
            m137494g(cloudMediaItemResponse);
        }
        try {
            int m41293a = cloudMediaItemResponse.m41293a();
            if (m41293a != 1) {
                if (m41293a != 2) {
                    if (m41293a != 3) {
                        if (m41293a != 4) {
                            if (m41293a == 5) {
                                return m137498m(cloudMediaItemResponse);
                            }
                            throw new IllegalStateException("Invalid Cloud Queue action: " + cloudMediaItemResponse.m41293a());
                        }
                        return m137502q(cloudMediaItemResponse);
                    }
                    return m137501p(cloudMediaItemResponse);
                }
                return m137500o(cloudMediaItemResponse);
            }
            return m137499n(cloudMediaItemResponse, z11);
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudItemProcessor", e11);
            return a.d.f126788a;
        }
    }

    /* renamed from: h */
    public final void m137506h() {
        C26676b.m136957g("SMLZCloudItemProcessor", "clearAllMemCache()", null, 4, null);
        SendChannel.DefaultImpls.m113195a(m137496k(), null, 1, null);
        this.f126779e.m145993b();
        f126774h.set(0);
    }

    /* renamed from: i */
    public final void m137507i() {
        String m127130z;
        String m127130z2;
        m127130z = AbstractC24341v.m127130z("─", 27);
        boolean m124786P0 = this.f126775a.m124786P0();
        String m124834u0 = this.f126775a.m124834u0();
        m127130z2 = AbstractC24341v.m127130z("─", 50);
        AbstractC20110a.f98889a.m104564x("SMLZCloudItemProcessor").mo104556o(8, m127130z + "\nCloudQueueVerified: " + m124786P0 + ", LastVerifiedNoiseId: " + m124834u0 + "\n" + m127130z2, new Object[0]);
    }

    /* renamed from: t */
    public final Object m137508t(CloudMediaItemResponse cloudMediaItemResponse, boolean z11, Continuation continuation) {
        List m131496e;
        Object m142578e;
        m131496e = AbstractC25366r.m131496e(cloudMediaItemResponse);
        Object m137509u = m137509u(m131496e, z11, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m137509u == m142578e) {
            return m137509u;
        }
        return C24848g0.f119245a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r13v11, types: [int] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00dd -> B:11:0x0038). Please report as a decompilation issue!!! */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m137509u(List list, boolean z11, Continuation continuation) {
        h hVar;
        Object m142578e;
        int i11;
        boolean z12;
        List m131195U;
        Iterator it;
        C26731a c26731a;
        int i12;
        C26731a c26731a2;
        Iterator it2;
        List list2;
        boolean z13;
        ?? r13;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i13 = hVar.f126823y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f126823y = i13 - Integer.MIN_VALUE;
                Object obj = hVar.f126821w;
                m142578e = AbstractC28298d.m142578e();
                i11 = hVar.f126823y;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            i12 = hVar.f126820v;
                            z11 = hVar.f126819u;
                            it2 = (Iterator) hVar.f126818t;
                            c26731a2 = (C26731a) hVar.f126817s;
                            AbstractC24862s.m129228b(obj);
                            r13 = i12;
                            it = it2;
                            c26731a = c26731a2;
                            if (!it.hasNext()) {
                                i iVar = new i((List) it.next(), c26731a, z11, null);
                                hVar.f126817s = c26731a;
                                hVar.f126818t = it;
                                hVar.f126819u = z11;
                                hVar.f126820v = r13;
                                hVar.f126823y = 1;
                                Object m112640d = CoroutineScopeKt.m112640d(iVar, hVar);
                                if (m112640d == m142578e) {
                                    return m142578e;
                                }
                                C26731a c26731a3 = c26731a;
                                it2 = it;
                                i12 = r13;
                                obj = m112640d;
                                c26731a2 = c26731a3;
                                list2 = (List) obj;
                                if (i12 == 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                hVar.f126817s = c26731a2;
                                hVar.f126818t = it2;
                                hVar.f126819u = z11;
                                hVar.f126820v = i12;
                                hVar.f126823y = 2;
                                if (c26731a2.m137504s(list2, z13, hVar) == m142578e) {
                                    return m142578e;
                                }
                                r13 = i12;
                                it = it2;
                                c26731a = c26731a2;
                                if (!it.hasNext()) {
                                    C28290a.m142547m(C28290a.f131979a, false, 1, null);
                                    return C24848g0.f119245a;
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        i12 = hVar.f126820v;
                        z11 = hVar.f126819u;
                        it2 = (Iterator) hVar.f126818t;
                        c26731a2 = (C26731a) hVar.f126817s;
                        AbstractC24862s.m129228b(obj);
                        list2 = (List) obj;
                        if (i12 == 0) {
                        }
                        hVar.f126817s = c26731a2;
                        hVar.f126818t = it2;
                        hVar.f126819u = z11;
                        hVar.f126820v = i12;
                        hVar.f126823y = 2;
                        if (c26731a2.m137504s(list2, z13, hVar) == m142578e) {
                        }
                        r13 = i12;
                        it = it2;
                        c26731a = c26731a2;
                        if (!it.hasNext()) {
                        }
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (this.f126776b.m89804l().m89773b() == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    C26676b.m136960j("SMLZCloudItemProcessor", "process(): data=" + list.size() + ", verified=" + z11 + ", resyncE2eeEnabled=" + z12);
                    m131195U = AbstractC25332a0.m131195U(list, 50);
                    it = m131195U.iterator();
                    c26731a = this;
                    r13 = z12;
                    if (!it.hasNext()) {
                    }
                }
            }
        }
        hVar = new h(continuation);
        Object obj2 = hVar.f126821w;
        m142578e = AbstractC28298d.m142578e();
        i11 = hVar.f126823y;
        if (i11 == 0) {
        }
    }

    public /* synthetic */ C26731a(C23870a c23870a, C16805b c16805b, InterfaceC23792b interfaceC23792b, InterfaceC27315f interfaceC27315f, int i11, AbstractC19060k abstractC19060k) {
        this(c23870a, c16805b, interfaceC23792b, (i11 & 8) != 0 ? Dispatchers.m112680b() : interfaceC27315f);
    }
}
