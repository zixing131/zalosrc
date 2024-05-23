package p232i8;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import p153f8.C18821f;
import p259j8.C21089c;
import p259j8.C21095i;
import p292k8.AbstractC21569b0;
import p292k8.C21571c0;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p342m6.InterfaceC22874c;
import p359n8.C23618e;
import p359n8.C23620g;
import p383o8.C24113b;
import p418p8.InterfaceC24673i;
import p440q8.InterfaceC25160d;
import p565v2.AbstractC27450f;

/* renamed from: i8.l0 */
/* loaded from: classes.dex */
public class C20404l0 {

    /* renamed from: a */
    private final C20409o f100510a;

    /* renamed from: b */
    private final C23618e f100511b;

    /* renamed from: c */
    private final C24113b f100512c;

    /* renamed from: d */
    private final C21089c f100513d;

    /* renamed from: e */
    private final C21095i f100514e;

    C20404l0(C20409o c20409o, C23618e c23618e, C24113b c24113b, C21089c c21089c, C21095i c21095i) {
        this.f100510a = c20409o;
        this.f100511b = c23618e;
        this.f100512c = c24113b;
        this.f100513d = c21089c;
        this.f100514e = c21095i;
    }

    /* renamed from: c */
    private AbstractC21569b0.e.d m106308c(AbstractC21569b0.e.d dVar) {
        return m106309d(dVar, this.f100513d, this.f100514e);
    }

    /* renamed from: d */
    private AbstractC21569b0.e.d m106309d(AbstractC21569b0.e.d dVar, C21089c c21089c, C21095i c21095i) {
        AbstractC21569b0.e.d.b mo111379g = dVar.mo111379g();
        String m109559c = c21089c.m109559c();
        if (m109559c != null) {
            mo111379g.mo111460d(AbstractC21569b0.e.d.AbstractC32868d.m111477a().mo111480b(m109559c).mo111479a());
        } else {
            C18821f.m98795f().m98802i("No log data to include with this event.");
        }
        List m106314k = m106314k(c21095i.m109614e());
        List m106314k2 = m106314k(c21095i.m109615f());
        if (!m106314k.isEmpty() || !m106314k2.isEmpty()) {
            mo111379g.mo111458b(dVar.mo111374b().mo111386g().mo111389c(C21571c0.m111495d(m106314k)).mo111391e(C21571c0.m111495d(m106314k2)).mo111387a());
        }
        return mo111379g.mo111457a();
    }

    /* renamed from: e */
    private static AbstractC21569b0.a m106310e(ApplicationExitInfo applicationExitInfo) {
        String applicationExitInfo2;
        int importance;
        String processName;
        int reason;
        long timestamp;
        int pid;
        long pss;
        long rss;
        InputStream traceInputStream;
        String str = null;
        try {
            traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = m106311f(traceInputStream);
            }
        } catch (IOException e11) {
            C18821f m98795f = C18821f.m98795f();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not get input trace in application exit info: ");
            applicationExitInfo2 = applicationExitInfo.toString();
            sb2.append(applicationExitInfo2);
            sb2.append(" Error: ");
            sb2.append(e11);
            m98795f.m98804k(sb2.toString());
        }
        AbstractC21569b0.a.b m111263a = AbstractC21569b0.a.m111263a();
        importance = applicationExitInfo.getImportance();
        AbstractC21569b0.a.b mo111283c = m111263a.mo111283c(importance);
        processName = applicationExitInfo.getProcessName();
        AbstractC21569b0.a.b mo111285e = mo111283c.mo111285e(processName);
        reason = applicationExitInfo.getReason();
        AbstractC21569b0.a.b mo111287g = mo111285e.mo111287g(reason);
        timestamp = applicationExitInfo.getTimestamp();
        AbstractC21569b0.a.b mo111289i = mo111287g.mo111289i(timestamp);
        pid = applicationExitInfo.getPid();
        AbstractC21569b0.a.b mo111284d = mo111289i.mo111284d(pid);
        pss = applicationExitInfo.getPss();
        AbstractC21569b0.a.b mo111286f = mo111284d.mo111286f(pss);
        rss = applicationExitInfo.getRss();
        return mo111286f.mo111288h(rss).mo111290j(str).mo111281a();
    }

    /* renamed from: f */
    public static String m106311f(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
        }
    }

    /* renamed from: g */
    public static C20404l0 m106312g(Context context, C20422w c20422w, C23620g c23620g, C20381a c20381a, C21089c c21089c, C21095i c21095i, InterfaceC25160d interfaceC25160d, InterfaceC24673i interfaceC24673i, C20384b0 c20384b0) {
        return new C20404l0(new C20409o(context, c20422w, c20381a, interfaceC25160d, interfaceC24673i), new C23618e(c23620g, interfaceC24673i), C24113b.m125993b(context, interfaceC24673i, c20384b0), c21089c, c21095i);
    }

    /* renamed from: j */
    private ApplicationExitInfo m106313j(String str, List list) {
        long timestamp;
        int reason;
        long m123808q = this.f100511b.m123808q(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo m140489a = AbstractC27450f.m140489a(it.next());
            timestamp = m140489a.getTimestamp();
            if (timestamp >= m123808q) {
                reason = m140489a.getReason();
                if (reason == 6) {
                    return m140489a;
                }
            } else {
                return null;
            }
        }
        return null;
    }

    /* renamed from: k */
    private static List m106314k(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(AbstractC21569b0.c.m111291a().mo111295b((String) entry.getKey()).mo111296c((String) entry.getValue()).mo111294a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: i8.j0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m106315m;
                m106315m = C20404l0.m106315m((AbstractC21569b0.c) obj, (AbstractC21569b0.c) obj2);
                return m106315m;
            }
        });
        return arrayList;
    }

    /* renamed from: m */
    public static /* synthetic */ int m106315m(AbstractC21569b0.c cVar, AbstractC21569b0.c cVar2) {
        return cVar.mo111292b().compareTo(cVar2.mo111292b());
    }

    /* renamed from: p */
    public boolean m106316p(AbstractC22888j abstractC22888j) {
        if (abstractC22888j.mo117588q()) {
            AbstractC20411p abstractC20411p = (AbstractC20411p) abstractC22888j.mo117584m();
            C18821f.m98795f().m98796b("Crashlytics report successfully enqueued to DataTransport: " + abstractC20411p.mo106173d());
            File mo106172c = abstractC20411p.mo106172c();
            if (mo106172c.delete()) {
                C18821f.m98795f().m98796b("Deleted report file: " + mo106172c.getPath());
                return true;
            }
            C18821f.m98795f().m98804k("Crashlytics could not delete report file: " + mo106172c.getPath());
            return true;
        }
        C18821f.m98795f().m98805l("Crashlytics report could not be enqueued to DataTransport", abstractC22888j.mo117583l());
        return false;
    }

    /* renamed from: q */
    private void m106317q(Throwable th2, Thread thread, String str, String str2, long j11, boolean z11) {
        this.f100511b.m123811y(m106308c(this.f100510a.m106382d(th2, thread, str2, j11, 4, 8, z11)), str, str2.equals("crash"));
    }

    /* renamed from: h */
    public void m106318h(String str, List list, AbstractC21569b0.a aVar) {
        C18821f.m98795f().m98796b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC21569b0.d.b mo106191a = ((InterfaceC20425z) it.next()).mo106191a();
            if (mo106191a != null) {
                arrayList.add(mo106191a);
            }
        }
        this.f100511b.m123806l(str, AbstractC21569b0.d.m111297a().mo111301b(C21571c0.m111495d(arrayList)).mo111300a(), aVar);
    }

    /* renamed from: i */
    public void m106319i(long j11, String str) {
        this.f100511b.m123805k(str, j11);
    }

    /* renamed from: l */
    public boolean m106320l() {
        return this.f100511b.m123809r();
    }

    /* renamed from: n */
    public SortedSet m106321n() {
        return this.f100511b.m123807p();
    }

    /* renamed from: o */
    public void m106322o(String str, long j11) {
        this.f100511b.m123812z(this.f100510a.m106383e(str, j11));
    }

    /* renamed from: r */
    public void m106323r(Throwable th2, Thread thread, String str, long j11) {
        C18821f.m98795f().m98802i("Persisting fatal event for session " + str);
        m106317q(th2, thread, str, "crash", j11, true);
    }

    /* renamed from: s */
    public void m106324s(Throwable th2, Thread thread, String str, long j11) {
        C18821f.m98795f().m98802i("Persisting non-fatal event for session " + str);
        m106317q(th2, thread, str, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, j11, false);
    }

    /* renamed from: t */
    public void m106325t(String str, List list, C21089c c21089c, C21095i c21095i) {
        ApplicationExitInfo m106313j = m106313j(str, list);
        if (m106313j == null) {
            C18821f.m98795f().m98802i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        AbstractC21569b0.e.d m106381c = this.f100510a.m106381c(m106310e(m106313j));
        C18821f.m98795f().m98796b("Persisting anr for session " + str);
        this.f100511b.m123811y(m106309d(m106381c, c21089c, c21095i), str, true);
    }

    /* renamed from: u */
    public void m106326u() {
        this.f100511b.m123804i();
    }

    /* renamed from: v */
    public AbstractC22888j m106327v(Executor executor) {
        return m106328w(executor, null);
    }

    /* renamed from: w */
    public AbstractC22888j m106328w(Executor executor, String str) {
        boolean z11;
        List<AbstractC20411p> m123810w = this.f100511b.m123810w();
        ArrayList arrayList = new ArrayList();
        for (AbstractC20411p abstractC20411p : m123810w) {
            if (str == null || str.equals(abstractC20411p.mo106173d())) {
                C24113b c24113b = this.f100512c;
                if (str != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                arrayList.add(c24113b.m125996c(abstractC20411p, z11).mo117579h(executor, new InterfaceC22874c() { // from class: i8.k0
                    public /* synthetic */ C20402k0() {
                    }

                    @Override // p342m6.InterfaceC22874c
                    /* renamed from: a */
                    public final Object mo27439a(AbstractC22888j abstractC22888j) {
                        boolean m106316p;
                        m106316p = C20404l0.this.m106316p(abstractC22888j);
                        return Boolean.valueOf(m106316p);
                    }
                }));
            }
        }
        return AbstractC22894m.m117605g(arrayList);
    }
}
