package bb0;

import ag0.AbstractC0837p0;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import com.zing.zalo.p077ui.toolstoragev1.list.C13466a;
import dg0.AbstractC17930e;
import eg0.C18427b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import me0.AbstractC23136l9;
import me0.AbstractC23262x6;
import mg.C23288a;
import mm0.AbstractC23350e;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19968g;
import p213hl.C20086b;
import p361nb.AbstractC23647d;
import p371nv.C23952g;
import wd0.C28923c;
import za0.C31747a;

/* renamed from: bb0.k */
/* loaded from: classes6.dex */
public class C2701k extends AbstractC19962a implements InterfaceC2692b {

    /* renamed from: t */
    private volatile boolean f10771t;

    /* renamed from: u */
    private final C20086b f10772u;

    /* renamed from: v */
    private final C28923c f10773v;

    /* renamed from: w */
    private Future f10774w;

    /* renamed from: x */
    private long f10775x;

    /* renamed from: y */
    private long f10776y;

    public C2701k(InterfaceC2693c interfaceC2693c, C20086b c20086b, C28923c c28923c) {
        super(interfaceC2693c);
        this.f10771t = false;
        this.f10772u = c20086b;
        this.f10773v = c28923c;
        AbstractC23647d.m123897g("711228");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Rp */
    public /* synthetic */ void m13196Rp(String str) {
        if (str.equals("")) {
            ((InterfaceC2693c) m103742Dp()).mo13187rs(this.f10772u.m104431b(), str);
            return;
        }
        ArrayList arrayList = new ArrayList();
        List m104432c = this.f10772u.m104432c();
        int size = m104432c.size();
        HashSet hashSet = new HashSet(size);
        boolean z11 = false;
        int i11 = 0;
        while (i11 < size) {
            ArrayList arrayList2 = new ArrayList();
            ThreadStorageInfo threadStorageInfo = (ThreadStorageInfo) m104432c.get(i11);
            String[] m119971F = AbstractC23262x6.m119971F(threadStorageInfo.m74779R(), z11);
            ContactProfile contactProfile = new ContactProfile(threadStorageInfo.m74822z());
            contactProfile.f42437s = threadStorageInfo.m74779R();
            int i12 = i11;
            AbstractC23262x6.m119998k(str, m119971F, contactProfile, arrayList2, false, false, new ArrayList(), false, false);
            if (contactProfile.f42387W > 0.0f && !hashSet.contains(threadStorageInfo.m74822z())) {
                threadStorageInfo.m74788a0(arrayList2);
                arrayList.add(threadStorageInfo);
                hashSet.add(threadStorageInfo.m74822z());
            }
            i11 = i12 + 1;
            z11 = false;
        }
        ((InterfaceC2693c) m103742Dp()).mo13187rs(arrayList, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Sp */
    public /* synthetic */ void m13197Sp(ThreadStorageInfo threadStorageInfo) {
        try {
            long m74777O = threadStorageInfo.m74777O();
            this.f10772u.m104444o(m74777O);
            this.f10772u.m104441l();
            C23952g.m125345j("Tool Storage", " deleted from list: " + m74777O + " bytes.");
            this.f10773v.m101508a(new C28923c.b(threadStorageInfo.m74822z(), "StorageUsagePresenter"));
        } catch (Exception e11) {
            AbstractC23350e.m122776f("StorageUsagePresenter", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Tp */
    public /* synthetic */ void m13198Tp(List list) {
        ((InterfaceC2693c) m103742Dp()).mo59032jx(AbstractC8020f0.str_storage_usage_storage_cleared);
        if (!((InterfaceC2693c) m103742Dp()).mo78963ru()) {
            return;
        }
        ((InterfaceC2693c) m103742Dp()).mo13188w8(false);
        ((InterfaceC2693c) m103742Dp()).mo13186iI(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Wp */
    public /* synthetic */ void m13199Wp(List list) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f10772u.m104442m(list.size());
        Iterator it = list.iterator();
        long j11 = 0;
        while (it.hasNext()) {
            final ThreadStorageInfo threadStorageInfo = (ThreadStorageInfo) it.next();
            String m74822z = threadStorageInfo.m74822z();
            j11 += threadStorageInfo.m74777O();
            m13203bq(threadStorageInfo.m74822z());
            C23288a.f113033a.mo13474a(new C18427b(m74822z, new Runnable() { // from class: bb0.g
                @Override // java.lang.Runnable
                public final void run() {
                    C2701k.this.m13197Sp(threadStorageInfo);
                }
            }));
        }
        C31747a.m152707f(list, list.size(), this.f10775x, this.f10776y, j11, false, System.currentTimeMillis() - currentTimeMillis);
        final List m104432c = this.f10772u.m104432c();
        ((InterfaceC2693c) m103742Dp()).mo70710wy(new Runnable() { // from class: bb0.h
            @Override // java.lang.Runnable
            public final void run() {
                C2701k.this.m13198Tp(m104432c);
            }
        });
        this.f10771t = false;
        ((InterfaceC2693c) m103742Dp()).mo49315c4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Xp */
    public /* synthetic */ void m13200Xp(int i11, List list) {
        String m118743r0;
        if (i11 > 1) {
            m118743r0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_storage_delete_list_conversation_photo_video, Integer.valueOf(i11));
        } else {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_storage_delete_conversation_photo_video);
        }
        ((InterfaceC2693c) m103742Dp()).mo78936E(m118743r0);
        if (((InterfaceC2693c) m103742Dp()).mo78963ru()) {
            ((InterfaceC2693c) m103742Dp()).mo13188w8(false);
            ((InterfaceC2693c) m103742Dp()).mo13186iI(list);
            this.f10771t = false;
            ((InterfaceC2693c) m103742Dp()).mo49315c4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0157  */
    /* renamed from: Yp */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m13201Yp(String str, ThreadStorageInfo threadStorageInfo, long[] jArr, int[] iArr, final int i11, long j11, List list) {
        long j12;
        int i12;
        long currentTimeMillis;
        long j13;
        long j14;
        long j15;
        int i13;
        try {
            this.f10773v.m101508a(new C28923c.b(str, "StorageUsagePresenter", true, true, true));
            j12 = threadStorageInfo.m74776N();
        } catch (Exception e11) {
            e = e11;
            j12 = 0;
        } catch (Throwable th2) {
            th = th2;
            j12 = 0;
            C23952g.m125345j("Tool Storage", " deleted media only from list: " + j12 + " bytes.");
            this.f10772u.m104444o(j12);
            jArr[0] = jArr[0] + j12;
            i12 = iArr[0] + 1;
            iArr[0] = i12;
            if (i12 == i11) {
            }
            throw th;
        }
        try {
            try {
                threadStorageInfo.m74790e();
                C23952g.m125345j("Tool Storage", " deleted media only from list: " + j12 + " bytes.");
                this.f10772u.m104444o(j12);
                jArr[0] = jArr[0] + j12;
                i13 = iArr[0] + 1;
                iArr[0] = i13;
            } catch (Throwable th3) {
                th = th3;
                C23952g.m125345j("Tool Storage", " deleted media only from list: " + j12 + " bytes.");
                this.f10772u.m104444o(j12);
                jArr[0] = jArr[0] + j12;
                i12 = iArr[0] + 1;
                iArr[0] = i12;
                if (i12 == i11) {
                    C23952g.m125345j("Tool Storage", "deleted media only from list, totalSize=" + jArr[0] + " bytes, total time=" + (System.currentTimeMillis() - j11) + " ms.");
                    this.f10772u.m104450u();
                    final List m104432c = this.f10772u.m104432c();
                    ((InterfaceC2693c) m103742Dp()).mo70710wy(new Runnable() { // from class: bb0.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2701k.this.m13200Xp(i11, m104432c);
                        }
                    });
                    C31747a.m152707f(list, i11, this.f10775x, this.f10776y, jArr[0], true, System.currentTimeMillis() - j11);
                }
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            AbstractC23350e.m122776f("StorageUsagePresenter", e);
            C23952g.m125345j("Tool Storage", " deleted media only from list: " + j12 + " bytes.");
            this.f10772u.m104444o(j12);
            jArr[0] = jArr[0] + j12;
            int i14 = iArr[0] + 1;
            iArr[0] = i14;
            if (i14 == i11) {
                C23952g.m125345j("Tool Storage", "deleted media only from list, totalSize=" + jArr[0] + " bytes, total time=" + (System.currentTimeMillis() - j11) + " ms.");
                this.f10772u.m104450u();
                final List m104432c2 = this.f10772u.m104432c();
                ((InterfaceC2693c) m103742Dp()).mo70710wy(new Runnable() { // from class: bb0.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2701k.this.m13200Xp(i11, m104432c2);
                    }
                });
                currentTimeMillis = System.currentTimeMillis() - j11;
                j13 = this.f10775x;
                j14 = this.f10776y;
                j15 = jArr[0];
                C31747a.m152707f(list, i11, j13, j14, j15, true, currentTimeMillis);
            }
            return;
        }
        if (i13 == i11) {
            C23952g.m125345j("Tool Storage", "deleted media only from list, totalSize=" + jArr[0] + " bytes, total time=" + (System.currentTimeMillis() - j11) + " ms.");
            this.f10772u.m104450u();
            final List m104432c3 = this.f10772u.m104432c();
            ((InterfaceC2693c) m103742Dp()).mo70710wy(new Runnable() { // from class: bb0.j
                @Override // java.lang.Runnable
                public final void run() {
                    C2701k.this.m13200Xp(i11, m104432c3);
                }
            });
            currentTimeMillis = System.currentTimeMillis() - j11;
            j13 = this.f10775x;
            j14 = this.f10776y;
            j15 = jArr[0];
            C31747a.m152707f(list, i11, j13, j14, j15, true, currentTimeMillis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Zp */
    public /* synthetic */ void m13202Zp(final List list) {
        long currentTimeMillis = System.currentTimeMillis();
        int size = list.size();
        int[] iArr = {0};
        long[] jArr = {0};
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final ThreadStorageInfo threadStorageInfo = (ThreadStorageInfo) it.next();
            final String m74822z = threadStorageInfo.m74822z();
            final long[] jArr2 = jArr;
            final int[] iArr2 = iArr;
            final int i11 = size;
            final long j11 = currentTimeMillis;
            C23288a.f113033a.mo13474a(new C18427b(m74822z, new Runnable() { // from class: bb0.i
                @Override // java.lang.Runnable
                public final void run() {
                    C2701k.this.m13201Yp(m74822z, threadStorageInfo, jArr2, iArr2, i11, j11, list);
                }
            }));
            iArr = iArr;
            size = size;
            jArr = jArr;
            currentTimeMillis = currentTimeMillis;
        }
    }

    /* renamed from: bq */
    private void m13203bq(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f10772u.m104443n(str);
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: F2 */
    public void mo994F2() {
        super.mo994F2();
        Future future = this.f10774w;
        if (future != null && !future.isDone()) {
            this.f10774w.cancel(true);
        }
    }

    @Override // bb0.InterfaceC2692b
    /* renamed from: I3 */
    public void mo13172I3(String str) {
        String trim = str.toLowerCase().trim();
        ((InterfaceC2693c) m103742Dp()).mo13182M4(!trim.isEmpty());
        m13204Qp(trim);
    }

    @Override // bb0.InterfaceC2692b
    /* renamed from: Ke */
    public void mo13173Ke(ThreadStorageInfo threadStorageInfo) {
        if (threadStorageInfo != null && !TextUtils.isEmpty(threadStorageInfo.m74822z())) {
            C23952g.m125345j("Tool Storage", " onResultViewDetail removeConversationLoaded, uid: " + threadStorageInfo.m74822z());
            this.f10772u.m104443n(threadStorageInfo.m74822z());
            mo13174Sa();
        }
    }

    /* renamed from: Qp */
    public void m13204Qp(final String str) {
        this.f10774w = AbstractC17930e.m94545d().mo94528b(new Runnable() { // from class: bb0.d
            @Override // java.lang.Runnable
            public final void run() {
                C2701k.this.m13196Rp(str);
            }
        });
    }

    @Override // bb0.InterfaceC2692b
    /* renamed from: Sa */
    public void mo13174Sa() {
        ((InterfaceC2693c) m103742Dp()).mo13186iI(this.f10772u.m104432c());
    }

    @Override // bb0.InterfaceC2692b
    /* renamed from: Tf */
    public void mo13175Tf(final List list) {
        if (this.f10771t) {
            return;
        }
        this.f10771t = true;
        ((InterfaceC2693c) m103742Dp()).mo49282B8(AbstractC23136l9.m118743r0(AbstractC8020f0.PROCESSING), false);
        AbstractC23647d.m123897g(String.format("711239%03d", Integer.valueOf(list.size())));
        C31747a.m152714m(C31747a.a.f145822s, list, true);
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: bb0.f
            @Override // java.lang.Runnable
            public final void run() {
                C2701k.this.m13202Zp(list);
            }
        });
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: aq, reason: merged with bridge method [inline-methods] */
    public void mo995Nd(C13466a c13466a, InterfaceC19968g interfaceC19968g) {
        super.mo995Nd(c13466a, interfaceC19968g);
        if (c13466a != null) {
            this.f10775x = c13466a.m75524b();
            this.f10776y = c13466a.m75523a();
        }
        C31747a.m152712k();
    }

    @Override // bb0.InterfaceC2692b
    /* renamed from: m7 */
    public void mo13176m7(int i11) {
        ((InterfaceC2693c) m103742Dp()).mo13181Cp();
        AbstractC23647d.m123897g(String.format("711240%03d", Integer.valueOf(i11)));
    }

    @Override // bb0.InterfaceC2692b
    /* renamed from: sn */
    public void mo13177sn(ThreadStorageInfo threadStorageInfo, String str) {
        if (threadStorageInfo == null) {
            return;
        }
        ((InterfaceC2693c) m103742Dp()).mo13183P6(threadStorageInfo, this.f10775x, this.f10776y);
        ((InterfaceC2693c) m103742Dp()).mo13180C();
        if (!TextUtils.isEmpty(str)) {
            AbstractC23647d.m123897g("711226");
        }
        AbstractC23647d.m123897g("711232");
    }

    @Override // bb0.InterfaceC2692b
    /* renamed from: ug */
    public void mo13178ug(final List list) {
        if (this.f10771t) {
            return;
        }
        this.f10771t = true;
        ((InterfaceC2693c) m103742Dp()).mo46829Y();
        AbstractC23647d.m123897g(String.format("711239%03d", Integer.valueOf(list.size())));
        C31747a.m152714m(C31747a.a.f145822s, list, false);
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: bb0.e
            @Override // java.lang.Runnable
            public final void run() {
                C2701k.this.m13199Wp(list);
            }
        });
    }

    @Override // bb0.InterfaceC2692b
    /* renamed from: yh */
    public void mo13179yh(int i11) {
        if (i11 == 1) {
            ((InterfaceC2693c) m103742Dp()).mo13185Zy();
        } else {
            ((InterfaceC2693c) m103742Dp()).mo13184Yr();
        }
        AbstractC23647d.m123897g(String.format("711238%03d", Integer.valueOf(i11)));
    }
}
