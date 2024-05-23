package p585vs;

import ag0.C0824j;
import am.AbstractC0939u;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7959d;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import i60.C20343i;
import java.util.ArrayList;
import java.util.Iterator;
import mm0.AbstractC23350e;
import p056cj.C3535c;
import p348mi.AbstractC23306f;
import ws.C29210k;

/* renamed from: vs.b */
/* loaded from: classes4.dex */
public final class C28610b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private C3535c f132640a;

    /* renamed from: b */
    private int f132641b;

    /* renamed from: c */
    private long f132642c;

    /* renamed from: d */
    private long f132643d;

    /* renamed from: e */
    private C28611c f132644e;

    /* renamed from: f */
    private MessageId f132645f;

    /* renamed from: g */
    private C20343i f132646g;

    /* renamed from: h */
    private MessageId f132647h;

    /* renamed from: i */
    private boolean f132648i;

    /* renamed from: j */
    private boolean f132649j;

    /* renamed from: k */
    private boolean f132650k;

    /* renamed from: vs.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C28610b m143066a(String str, boolean z11, boolean z12) {
            AbstractC19074t.m100208f(str, "threadId");
            C28610b c28610b = new C28610b(AbstractC23306f.m120584H0().m2640w(str), 10, 0L, 0L);
            c28610b.m143046M(z11);
            c28610b.m143045L(z12);
            return c28610b;
        }

        /* renamed from: b */
        public final C28610b m143067b(C3535c c3535c, MessageId messageId, C20343i c20343i) {
            AbstractC19074t.m100208f(c3535c, "chat");
            AbstractC19074t.m100208f(messageId, "jumpMsgId");
            C28610b c28610b = new C28610b(c3535c, 9, 0L, 0L);
            c28610b.m143044K(messageId);
            c28610b.m143043J(c20343i);
            return c28610b;
        }

        /* renamed from: c */
        public final C28610b m143068c(C3535c c3535c, MessageId messageId) {
            AbstractC19074t.m100208f(c3535c, "chat");
            AbstractC19074t.m100208f(messageId, "loadFromMsgId");
            C28610b c28610b = new C28610b(c3535c, 7, 0L, 0L);
            c28610b.f132645f = messageId;
            return c28610b;
        }
    }

    /* renamed from: vs.b$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C28611c f132651a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f132652b;

        b(C28611c c28611c, ArrayList arrayList) {
            this.f132651a = c28611c;
            this.f132652b = arrayList;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7959d.a aVar = C7959d.Companion;
            C7959d m41850e = aVar.m41850e();
            C28611c c28611c = this.f132651a;
            m41850e.m41839y0(c28611c.f132658a, c28611c.f132659b, c28611c.f132661d, c28611c.f132662e);
            aVar.m41850e().m41735P1(this.f132652b);
        }
    }

    public C28610b(C3535c c3535c, int i11, long j11, long j12) {
        AbstractC19074t.m100208f(c3535c, "currentChat");
        this.f132640a = c3535c;
        this.f132641b = i11;
        this.f132642c = j11;
        this.f132643d = j12;
    }

    /* renamed from: b */
    private final C28611c m143027b(ArrayList arrayList) {
        if (arrayList.size() > 0) {
            return (C28611c) arrayList.get(arrayList.size() - 1);
        }
        return null;
    }

    /* renamed from: c */
    private final C28611c m143028c(ArrayList arrayList, long j11, long j12) {
        if (!arrayList.isEmpty()) {
            Object obj = arrayList.get(arrayList.size() - 1);
            AbstractC19074t.m100207e(obj, "get(...)");
            C28611c c28611c = (C28611c) obj;
            long j13 = c28611c.f132659b;
            if (j11 > j13 || j13 > j12) {
                long j14 = c28611c.f132661d;
                if (j11 > j14 || j14 > j12) {
                    return null;
                }
            }
            return c28611c;
        }
        return null;
    }

    /* renamed from: d */
    private final C28611c m143029d(ArrayList arrayList) {
        C28609a m145892x = C29210k.Companion.m145896a().m145892x(this.f132640a.m17944I0());
        int i11 = 0;
        if (m145892x.m143025b()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C28611c c28611c = (C28611c) it.next();
                long j11 = m145892x.f132637d;
                if (j11 <= 0 || (j11 > c28611c.f132661d && j11 >= c28611c.f132659b)) {
                    long j12 = m145892x.f132638e;
                    if (j12 <= 0 || j12 > c28611c.f132662e) {
                        i11++;
                    }
                }
                if (j11 > 0 && j11 < c28611c.f132659b && j11 > c28611c.f132661d) {
                    C28611c c28611c2 = new C28611c(c28611c.f132658a, c28611c.f132659b, m145892x.f132637d, 0L);
                    C28611c c28611c3 = new C28611c(c28611c.f132658a, m145892x.f132637d, c28611c.f132661d, c28611c.f132662e);
                    arrayList.remove(i11);
                    ArrayList arrayList2 = new ArrayList();
                    if (c28611c2.m143074f()) {
                        arrayList.add(i11, c28611c2);
                        arrayList2.add(c28611c2);
                    }
                    if (c28611c3.m143074f()) {
                        arrayList.add(i11, c28611c3);
                        arrayList2.add(c28611c3);
                    }
                    C0824j.m2153b(new b(c28611c, arrayList2));
                    C29210k.Companion.m145896a().m145848S0(c28611c.f132658a, arrayList);
                    return c28611c2;
                }
                return c28611c;
            }
            return null;
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        return (C28611c) arrayList.get(0);
    }

    /* renamed from: f */
    private final C28611c m143030f() {
        long j11;
        long j12;
        MessageId messageId = this.f132645f;
        if (messageId != null) {
            j11 = messageId.m41047k();
            j12 = messageId.m41045i();
        } else {
            j11 = 0;
            j12 = 0;
        }
        return new C28611c(this.f132640a.m17944I0(), j11, j12, C28611c.f132654j, 0L);
    }

    /* renamed from: g */
    private final C28611c m143031g(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            return (C28611c) arrayList.get(arrayList.size() - 1);
        }
        return null;
    }

    /* renamed from: j */
    private final ArrayList m143032j(ArrayList arrayList, long j11, long j12) {
        ArrayList arrayList2 = new ArrayList();
        if (j11 > 0 && j12 > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C28611c c28611c = (C28611c) it.next();
                long j13 = c28611c.f132659b;
                if (j11 > j13 || j13 > j12) {
                    long j14 = c28611c.f132661d;
                    if (j11 <= j14 && j14 <= j12) {
                    }
                }
                arrayList2.add(c28611c);
            }
        }
        return arrayList2;
    }

    /* renamed from: k */
    private final C28611c m143033k() {
        long j11;
        long j12;
        MessageId m17939D0 = this.f132640a.m17939D0();
        if (m17939D0 != null) {
            j11 = m17939D0.m41047k();
            j12 = m17939D0.m41045i();
        } else {
            j11 = 0;
            j12 = 0;
        }
        return new C28611c(this.f132640a.m17944I0(), j11, j12, C28611c.f132653i, 0L);
    }

    /* renamed from: A */
    public final boolean m143034A() {
        return this.f132641b == 7;
    }

    /* renamed from: B */
    public final boolean m143035B() {
        return this.f132641b == 5;
    }

    /* renamed from: C */
    public final boolean m143036C() {
        int i11 = this.f132641b;
        return i11 == 3 || i11 == 4 || i11 == 0;
    }

    /* renamed from: D */
    public final boolean m143037D() {
        int i11 = this.f132641b;
        return (i11 == 2 || i11 == 6 || i11 == 7 || i11 == 10) ? false : true;
    }

    /* renamed from: E */
    public final boolean m143038E() {
        int i11 = this.f132641b;
        return i11 == 0 || i11 == 2 || i11 == 5 || i11 == 1 || i11 == 4 || i11 == 3;
    }

    /* renamed from: F */
    public final boolean m143039F() {
        return this.f132641b == 6;
    }

    /* renamed from: G */
    public final boolean m143040G() {
        boolean z11;
        int i11 = this.f132641b;
        boolean z12 = true;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                if (i11 == 3) {
                    return true;
                }
                if (i11 != 5) {
                    if (i11 == 8 || i11 == 9) {
                        return true;
                    }
                }
            }
            C28611c c28611c = this.f132644e;
            if (c28611c != null) {
                long j11 = c28611c.f132659b;
                long j12 = this.f132642c;
                if (j11 < j12) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AbstractC23350e.m122780j("PullMsgOffline isUpdateMsgTop = " + z11 + " fromId: " + j11 + " topIdVisible: " + j12 + " bottomGlobalId: " + this.f132643d, new Object[0]);
                if (c28611c.f132659b < this.f132642c) {
                    return true;
                }
            }
        } else {
            C28611c c28611c2 = this.f132644e;
            if (c28611c2 != null) {
                long j13 = this.f132642c;
                long j14 = this.f132643d;
                long j15 = c28611c2.f132659b;
                if (j13 > j15 || j15 > j14) {
                    long j16 = c28611c2.f132661d;
                    if (j13 > j16 || j16 > j14) {
                        z12 = false;
                    }
                }
                AbstractC23350e.m122780j("PullMsgOffline isUpdateMsgTop = " + z12 + " fromId: " + j15 + " topIdVisible: " + j13 + " bottomGlobalId: " + j14, new Object[0]);
                return z12;
            }
        }
        return false;
    }

    /* renamed from: H */
    public final void m143041H(long j11) {
        this.f132643d = j11;
    }

    /* renamed from: I */
    public final void m143042I(boolean z11) {
        this.f132648i = z11;
    }

    /* renamed from: J */
    public final void m143043J(C20343i c20343i) {
        this.f132646g = c20343i;
    }

    /* renamed from: K */
    public final void m143044K(MessageId messageId) {
        this.f132647h = messageId;
    }

    /* renamed from: L */
    public final void m143045L(boolean z11) {
        this.f132650k = z11;
    }

    /* renamed from: M */
    public final void m143046M(boolean z11) {
        this.f132649j = z11;
    }

    /* renamed from: N */
    public final void m143047N(long j11) {
        this.f132642c = j11;
    }

    /* renamed from: e */
    public final C3535c m143048e() {
        return this.f132640a;
    }

    /* renamed from: h */
    public final C20343i m143049h() {
        return this.f132646g;
    }

    /* renamed from: i */
    public final MessageId m143050i() {
        return this.f132647h;
    }

    /* renamed from: l */
    public final String m143051l() {
        switch (this.f132641b) {
            case 0:
                return "pull start chat";
            case 1:
                return "pull unread";
            case 2:
                return "pull auto load";
            case 3:
                return "pull load top";
            case 4:
                return "pull load bottom";
            case 5:
                return "pull new msg";
            case 6:
                return "";
            case 7:
                return "load more from media store";
            case 8:
                return "load cloud";
            default:
                return "pull offline";
        }
    }

    /* renamed from: m */
    public final boolean m143052m() {
        return this.f132650k;
    }

    /* renamed from: n */
    public final boolean m143053n() {
        return this.f132649j;
    }

    /* renamed from: o */
    public final int m143054o() {
        switch (this.f132641b) {
            case 0:
            case 7:
                return 4;
            case 1:
            case 5:
                return 3;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 6:
            case 10:
                return 0;
            case 8:
                return 5;
            case 9:
                return 6;
            default:
                return -1;
        }
    }

    /* renamed from: p */
    public final C28611c m143055p() {
        return this.f132644e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: q */
    public final C28611c m143056q(ArrayList arrayList) {
        C28611c m143028c;
        AbstractC19074t.m100208f(arrayList, "listJob");
        if (arrayList.isEmpty() && !m143039F() && !m143034A() && !m143065z()) {
            return null;
        }
        long j11 = this.f132642c;
        long j12 = this.f132643d;
        switch (this.f132641b) {
            case 0:
                m143028c = m143028c(arrayList, j11, j12);
                break;
            case 1:
                m143028c = m143029d(arrayList);
                break;
            case 2:
            case 5:
                m143028c = m143027b(arrayList);
                break;
            case 3:
                ArrayList m143032j = m143032j(arrayList, j11, j12);
                if (m143032j.size() > 0) {
                    m143028c = (C28611c) m143032j.get(m143032j.size() - 1);
                    break;
                }
                m143028c = null;
                break;
            case 4:
                ArrayList m143032j2 = m143032j(arrayList, j11, j12);
                if (m143032j2.size() > 0) {
                    m143028c = (C28611c) m143032j2.get(0);
                    break;
                }
                m143028c = null;
                break;
            case 6:
                m143028c = m143031g(arrayList);
                break;
            case 7:
                m143028c = m143030f();
                break;
            case 8:
                m143028c = m143033k();
                break;
            default:
                m143028c = null;
                break;
        }
        this.f132644e = m143028c;
        if (m143028c != null && this.f132641b != 6 && m143028c.m143073e()) {
            this.f132644e = null;
        }
        return this.f132644e;
    }

    /* renamed from: r */
    public final int m143057r() {
        return this.f132641b;
    }

    /* renamed from: s */
    public final boolean m143058s() {
        return this.f132648i;
    }

    /* renamed from: t */
    public final boolean m143059t() {
        int i11 = this.f132641b;
        return i11 == 0 || i11 == 2 || i11 == 3 || i11 == 6 || i11 == 7 || i11 == 8;
    }

    public String toString() {
        return "PullMsgCommand{triggerType=" + this.f132641b + ", priority=" + m143054o() + ", topGlobalIdVisible=" + this.f132642c + ", bottomGlobalIdVisible=" + this.f132643d + "}";
    }

    /* renamed from: u */
    public final boolean m143060u() {
        int i11 = this.f132641b;
        return i11 == 3 || i11 == 4;
    }

    /* renamed from: v */
    public final boolean m143061v() {
        int i11 = this.f132641b;
        return i11 == 0 || i11 == 1 || i11 == 2 || i11 == 3 || i11 == 8 || i11 == 9;
    }

    /* renamed from: w */
    public final boolean m143062w() {
        return this.f132641b == 2;
    }

    /* renamed from: x */
    public final boolean m143063x() {
        return this.f132641b == 10;
    }

    /* renamed from: y */
    public final boolean m143064y() {
        return this.f132641b == 9;
    }

    /* renamed from: z */
    public final boolean m143065z() {
        return this.f132641b == 8;
    }
}
