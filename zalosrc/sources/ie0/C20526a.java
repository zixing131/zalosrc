package ie0;

import ag0.AbstractC0826k;
import ag0.C0843s0;
import am.C0943w;
import android.os.SystemClock;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import fn0.AbstractC19074t;
import fn0.C19059j0;
import gw.C19669z;
import ho0.AbstractC20110a;
import i30.C20222a;
import org.json.JSONObject;
import p185gc.AbstractC19378b;
import p371nv.C23952g;
import p461qu.AbstractC25495a;
import p716zh.C31973j5;
import vg.C28203u6;

/* renamed from: ie0.a */
/* loaded from: classes4.dex */
public final class C20526a extends AbstractC19378b {

    /* renamed from: a */
    private final C20222a f100821a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ie0.a$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo106633a(ThreadStorageInfo threadStorageInfo);

        /* renamed from: b */
        void mo106634b();
    }

    /* renamed from: ie0.a$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final String f100822a;

        public b(String str) {
            AbstractC19074t.m100208f(str, "ownerId");
            this.f100822a = str;
        }

        /* renamed from: a */
        public final String m106635a() {
            return this.f100822a;
        }
    }

    /* renamed from: ie0.a$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a */
        private boolean f100823a;

        /* renamed from: b */
        private final ThreadStorageInfo f100824b;

        public c(boolean z11, ThreadStorageInfo threadStorageInfo) {
            AbstractC19074t.m100208f(threadStorageInfo, "threadStorageInfo");
            this.f100823a = z11;
            this.f100824b = threadStorageInfo;
        }

        /* renamed from: a */
        public final ThreadStorageInfo m106636a() {
            return this.f100824b;
        }

        /* renamed from: b */
        public final boolean m106637b() {
            return this.f100823a;
        }

        /* renamed from: c */
        public final void m106638c(boolean z11) {
            this.f100823a = z11;
        }
    }

    /* renamed from: ie0.a$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC0826k.c {

        /* renamed from: d */
        final /* synthetic */ String f100825d;

        /* renamed from: e */
        final /* synthetic */ C19059j0 f100826e;

        /* renamed from: f */
        final /* synthetic */ C19059j0 f100827f;

        /* renamed from: g */
        final /* synthetic */ C19059j0 f100828g;

        /* renamed from: h */
        final /* synthetic */ a f100829h;

        /* renamed from: i */
        final /* synthetic */ long f100830i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, TrackingSource trackingSource, C19059j0 c19059j0, C19059j0 c19059j02, C19059j0 c19059j03, a aVar, long j11) {
            super(str, trackingSource);
            this.f100825d = str;
            this.f100826e = c19059j0;
            this.f100827f = c19059j02;
            this.f100828g = c19059j03;
            this.f100829h = aVar;
            this.f100830i = j11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ag0.AbstractC0826k.c, ag0.AbstractC0826k
        /* renamed from: a */
        public void mo2158a(Object obj) {
            ContactProfile contactProfile;
            super.mo2158a(obj);
            try {
                C19059j0 c19059j0 = this.f100826e;
                if (obj != null) {
                    contactProfile = new ContactProfile((JSONObject) obj);
                } else {
                    contactProfile = null;
                }
                c19059j0.f94941p = contactProfile;
                Object obj2 = this.f100826e.f94941p;
                if (obj2 != null) {
                    C19059j0 c19059j02 = this.f100827f;
                    AbstractC19074t.m100205c(obj2);
                    String m40385R = ((ContactProfile) obj2).m40385R(true, false, true);
                    AbstractC19074t.m100207e(m40385R, "getDpnPhoneContact(...)");
                    c19059j02.f94941p = m40385R;
                    C19059j0 c19059j03 = this.f100828g;
                    Object obj3 = this.f100826e.f94941p;
                    AbstractC19074t.m100205c(obj3);
                    String str = ((ContactProfile) obj3).f42446v;
                    AbstractC19074t.m100207e(str, "avt");
                    c19059j03.f94941p = str;
                    this.f100829h.mo106633a(ThreadStorageInfo.Companion.m74823a(this.f100825d, (String) this.f100827f.f94941p, (String) this.f100828g.f94941p, this.f100830i));
                    return;
                }
                this.f100829h.mo106634b();
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                this.f100829h.mo106634b();
            }
        }
    }

    /* renamed from: ie0.a$e */
    /* loaded from: classes4.dex */
    public static final class e implements a {

        /* renamed from: a */
        final /* synthetic */ AbstractC19378b.a f100831a;

        /* renamed from: b */
        final /* synthetic */ C20526a f100832b;

        /* renamed from: c */
        final /* synthetic */ String f100833c;

        e(AbstractC19378b.a aVar, C20526a c20526a, String str) {
            this.f100831a = aVar;
            this.f100832b = c20526a;
            this.f100833c = str;
        }

        @Override // ie0.C20526a.a
        /* renamed from: a */
        public void mo106633a(ThreadStorageInfo threadStorageInfo) {
            AbstractC19074t.m100208f(threadStorageInfo, "threadStorageInfo");
            c cVar = new c(true, threadStorageInfo);
            AbstractC19378b.a aVar = this.f100831a;
            if (aVar != null) {
                aVar.onSuccess(cVar);
            }
            this.f100832b.m106630f(this.f100833c, threadStorageInfo);
            cVar.m106638c(false);
            AbstractC19378b.a aVar2 = this.f100831a;
            if (aVar2 != null) {
                aVar2.onSuccess(cVar);
            }
        }

        @Override // ie0.C20526a.a
        /* renamed from: b */
        public void mo106634b() {
            AbstractC19378b.a aVar = this.f100831a;
            if (aVar != null) {
                aVar.mo1004b();
            }
        }
    }

    public C20526a(C20222a c20222a) {
        AbstractC19074t.m100208f(c20222a, "conversationStorageAnalyzer");
        this.f100821a = c20222a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final void m106630f(String str, ThreadStorageInfo threadStorageInfo) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            this.f100821a.m105679b(threadStorageInfo);
            String str2 = "loadStorageUsage of " + str + " takes: " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms. Conversation size: " + threadStorageInfo.m74777O() + " bytes";
            AbstractC20110a.f98889a.m104564x("Tool Storage").mo104548a(str2, new Object[0]);
            C23952g.m125345j("Tool Storage", str2);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: g */
    private final void m106631g(String str, a aVar) {
        long j11;
        C19669z.b bVar = C19669z.Companion;
        bVar.m103232a().m103229t0();
        Conversation m103202S = bVar.m103232a().m103202S(str);
        C19059j0 c19059j0 = new C19059j0();
        C19059j0 c19059j02 = new C19059j0();
        if (m103202S != null) {
            j11 = m103202S.m41008l();
        } else {
            j11 = 0;
        }
        long j12 = j11;
        if (!AbstractC25495a.m132079d(str)) {
            C19059j0 c19059j03 = new C19059j0();
            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
            c19059j03.f94941p = m141798e;
            if (m141798e != null) {
                String m40385R = m141798e.m40385R(true, false, true);
                AbstractC19074t.m100207e(m40385R, "getDpnPhoneContact(...)");
                c19059j0.f94941p = m40385R;
                String str2 = ((ContactProfile) c19059j03.f94941p).f42446v;
                AbstractC19074t.m100207e(str2, "avt");
                c19059j02.f94941p = str2;
                aVar.mo106633a(ThreadStorageInfo.Companion.m74823a(str, (String) c19059j0.f94941p, str2, j12));
                return;
            }
            C0843s0.m2286r().m2294e(new d(str, new TrackingSource(1049), c19059j03, c19059j0, c19059j02, aVar, j12));
            return;
        }
        C31973j5 m4472f = C0943w.f3447a.m4472f(str);
        if (m4472f != null) {
            ThreadStorageInfo.C13327a c13327a = ThreadStorageInfo.Companion;
            String m153793y = m4472f.m153793y();
            String m153756e = m4472f.m153756e();
            if (m153756e == null) {
                m153756e = "";
            }
            aVar.mo106633a(c13327a.m74823a(str, m153793y, m153756e, j12));
            return;
        }
        aVar.mo106634b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19378b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo1884d(b bVar, AbstractC19378b.a aVar) {
        AbstractC19074t.m100208f(bVar, "params");
        String m106635a = bVar.m106635a();
        m106631g(m106635a, new e(aVar, this, m106635a));
    }
}
