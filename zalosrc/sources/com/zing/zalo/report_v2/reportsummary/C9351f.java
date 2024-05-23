package com.zing.zalo.report_v2.reportsummary;

import ag0.AbstractC0837p0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.report_v2.model.ReportInfoCollected;
import com.zing.zalo.report_v2.reportsummary.AbstractC9350e;
import com.zing.zalo.report_v2.reportsummary.C9351f;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import km0.EnumC21773h;
import km0.InterfaceC21769d;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import mz.C23493c;
import nz.AbstractC23968e;
import nz.C23966c;
import p133ek.AbstractC18458a;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19968g;
import p405ov.C24561c;
import p409oz.C24585b;
import qm0.AbstractC25368s;
import sz.InterfaceC26425b;

/* renamed from: com.zing.zalo.report_v2.reportsummary.f */
/* loaded from: classes4.dex */
public final class C9351f extends AbstractC19962a implements InterfaceC9349d {

    /* renamed from: A */
    private ReportInfoCollected f49508A;

    /* renamed from: B */
    private AbstractC9350e.f f49509B;

    /* renamed from: C */
    private boolean f49510C;

    /* renamed from: D */
    private volatile boolean f49511D;

    /* renamed from: t */
    private final C24585b f49512t;

    /* renamed from: u */
    private AbstractC9350e.e f49513u;

    /* renamed from: v */
    private AbstractC9350e.a f49514v;

    /* renamed from: w */
    private String f49515w;

    /* renamed from: x */
    private String f49516x;

    /* renamed from: y */
    private C23966c f49517y;

    /* renamed from: z */
    private AbstractC23968e.b f49518z;

    /* renamed from: com.zing.zalo.report_v2.reportsummary.f$a */
    /* loaded from: classes4.dex */
    public static final class a implements C24585b.d {
        a() {
        }

        @Override // p409oz.C24585b.d
        /* renamed from: l */
        public void mo50383l() {
            C9351f.this.m50373bq();
        }
    }

    /* renamed from: com.zing.zalo.report_v2.reportsummary.f$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC21769d {

        /* renamed from: a */
        final /* synthetic */ long f49520a;

        /* renamed from: b */
        final /* synthetic */ C9351f f49521b;

        /* renamed from: c */
        final /* synthetic */ ReportInfoCollected f49522c;

        b(long j11, C9351f c9351f, ReportInfoCollected reportInfoCollected) {
            this.f49520a = j11;
            this.f49521b = c9351f;
            this.f49522c = reportInfoCollected;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m50385d(C9351f c9351f, ReportInfoCollected reportInfoCollected) {
            AbstractC19074t.m100208f(c9351f, "this$0");
            AbstractC19074t.m100208f(reportInfoCollected, "$reportInfoCollected");
            ((InterfaceC26425b) c9351f.m103742Dp()).mo50308YD(reportInfoCollected.m50184g(), reportInfoCollected.m50182e());
        }

        @Override // km0.InterfaceC21769d
        /* renamed from: a */
        public void mo13651a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMessage");
            try {
                try {
                    C24561c.m127942b("[REPORT_V2]", "submitReport - onRequestError: totalTime=" + (System.currentTimeMillis() - this.f49520a) + ", errorCode=" + i11 + ", errorMessage=" + str);
                    if (i11 == 50001) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG));
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("[REPORT_V2]", e11);
                }
                this.f49521b.m50382hq(false);
                ((InterfaceC26425b) this.f49521b.m103742Dp()).mo78960q3();
            } catch (Throwable th2) {
                this.f49521b.m50382hq(false);
                ((InterfaceC26425b) this.f49521b.m103742Dp()).mo78960q3();
                throw th2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r4v9, types: [hc.i, sz.b] */
        @Override // km0.InterfaceC21769d
        /* renamed from: b */
        public void mo13652b(EnumC21773h enumC21773h, Object obj) {
            AbstractC19074t.m100208f(enumC21773h, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            AbstractC19074t.m100208f(obj, "result");
            boolean z11 = 0;
            z11 = 0;
            try {
                try {
                    InterfaceC26425b interfaceC26425b = (InterfaceC26425b) this.f49521b.m103742Dp();
                    final C9351f c9351f = this.f49521b;
                    final ReportInfoCollected reportInfoCollected = this.f49522c;
                    interfaceC26425b.mo70710wy(new Runnable() { // from class: sz.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            C9351f.b.m50385d(C9351f.this, reportInfoCollected);
                        }
                    });
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("[REPORT_V2]", e11);
                }
            } finally {
                this.f49521b.m50382hq(z11);
                ((InterfaceC26425b) this.f49521b.m103742Dp()).mo78960q3();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9351f(InterfaceC26425b interfaceC26425b, C24585b c24585b) {
        super(interfaceC26425b);
        AbstractC19074t.m100208f(interfaceC26425b, "mvpView");
        AbstractC19074t.m100208f(c24585b, "reportRepo");
        this.f49512t = c24585b;
        this.f49513u = new AbstractC9350e.e("");
        this.f49514v = new AbstractC9350e.a("");
    }

    /* renamed from: Mp */
    private final List m50361Mp(List list) {
        boolean z11;
        List m131506n;
        C23966c c23966c;
        String str;
        if (this.f49510C) {
            this.f49510C = false;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC9350e abstractC9350e = (AbstractC9350e) it.next();
                if (abstractC9350e instanceof AbstractC9350e.f) {
                    AbstractC9350e.f fVar = (AbstractC9350e.f) abstractC9350e;
                    String m125430a = fVar.m50346c().m125430a();
                    ReportInfoCollected reportInfoCollected = this.f49508A;
                    if (reportInfoCollected != null) {
                        str = reportInfoCollected.m50183f();
                    } else {
                        str = null;
                    }
                    if (AbstractC19074t.m100204b(m125430a, str)) {
                        m50378gq(fVar);
                    }
                }
            }
            AbstractC9350e.f fVar2 = this.f49509B;
            if (fVar2 != null && (fVar2 instanceof AbstractC9350e.f.b)) {
                AbstractC9350e.f.b bVar = (AbstractC9350e.f.b) fVar2;
                ReportInfoCollected reportInfoCollected2 = this.f49508A;
                if (reportInfoCollected2 != null && reportInfoCollected2.m50185h()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar.m50357n(z11);
                if (!bVar.m50354k() || (c23966c = this.f49517y) == null || !c23966c.m125425d()) {
                    m50367Sp(bVar, false);
                    C23966c c23966c2 = this.f49517y;
                    if (c23966c2 != null && c23966c2.m125425d()) {
                        m131506n = AbstractC25368s.m131506n(fVar2);
                        return m131506n;
                    }
                    return list;
                }
                return list;
            }
            return list;
        }
        return list;
    }

    /* renamed from: Np */
    private final AbstractC23968e.b m50362Np(AbstractC23968e.b bVar, String str) {
        if (str != null && str.length() != 0) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(bVar);
            while (!linkedList.isEmpty()) {
                AbstractC23968e abstractC23968e = (AbstractC23968e) linkedList.remove();
                if (abstractC23968e instanceof AbstractC23968e.b) {
                    AbstractC23968e.b bVar2 = (AbstractC23968e.b) abstractC23968e;
                    for (AbstractC23968e abstractC23968e2 : bVar2.m125437h()) {
                        if (AbstractC19074t.m100204b(abstractC23968e2.m125430a(), str)) {
                            return bVar2;
                        }
                        linkedList.add(abstractC23968e2);
                    }
                }
            }
        }
        return bVar;
    }

    /* renamed from: Op */
    private final int m50363Op() {
        C9348c c9348c = (C9348c) m103744Fp();
        if (c9348c != null) {
            return c9348c.m50330d();
        }
        return 0;
    }

    /* renamed from: Pp */
    private final String m50364Pp(int i11) {
        if (i11 > 1) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            return m118743r0;
        }
        return "";
    }

    /* renamed from: Qp */
    private final String m50365Qp() {
        String str;
        int i11;
        int i12;
        ReportInfoCollected reportInfoCollected = this.f49508A;
        if (reportInfoCollected != null) {
            List m50179b = reportInfoCollected.m50179b();
            if (m50179b != null) {
                i11 = m50179b.size();
            } else {
                i11 = 0;
            }
            List m50180c = reportInfoCollected.m50180c();
            if (m50180c != null) {
                i12 = m50180c.size();
            } else {
                i12 = 0;
            }
            if (i11 > 0 && i12 > 0) {
                str = AbstractC23136l9.m118746s0(AbstractC8020f0.str_report_summary_result_attachment, Integer.valueOf(i12), m50364Pp(i12), Integer.valueOf(i11), m50364Pp(i11));
            } else if (i11 > 0) {
                str = AbstractC23136l9.m118746s0(AbstractC8020f0.str_report_summary_result_attachment_msg, Integer.valueOf(i11), m50364Pp(i11));
            } else if (i12 <= 0) {
                str = "";
            } else {
                str = AbstractC23136l9.m118746s0(AbstractC8020f0.str_report_summary_result_attachment_photo, Integer.valueOf(i12), m50364Pp(i12));
            }
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: Rp */
    private final void m50366Rp() {
        boolean z11;
        ReportInfoCollected reportInfoCollected;
        String m50178a;
        if (this.f49509B != null && (!m50372Zp() || ((reportInfoCollected = this.f49508A) != null && (m50178a = reportInfoCollected.m50178a()) != null && m50178a.length() > 0))) {
            z11 = true;
        } else {
            z11 = false;
        }
        ((InterfaceC26425b) m103742Dp()).mo50302Bw(z11);
    }

    /* renamed from: Sp */
    private final void m50367Sp(AbstractC9350e.f.b bVar, boolean z11) {
        String m50178a;
        String m50178a2;
        C23966c c23966c = this.f49517y;
        String str = "";
        if (c23966c != null && c23966c.m125425d()) {
            bVar.m50349f(false);
            bVar.m50357n(false);
            bVar.m50356m(true);
            ReportInfoCollected reportInfoCollected = this.f49508A;
            if (reportInfoCollected != null && (m50178a2 = reportInfoCollected.m50178a()) != null) {
                str = m50178a2;
            }
            bVar.m50355l(str);
            if (z11) {
                m50369Wp(bVar);
                return;
            }
            return;
        }
        bVar.m50357n(true);
        bVar.m50356m(true);
        ReportInfoCollected reportInfoCollected2 = this.f49508A;
        if (reportInfoCollected2 != null && (m50178a = reportInfoCollected2.m50178a()) != null) {
            str = m50178a;
        }
        bVar.m50355l(str);
        if (z11) {
            ((InterfaceC26425b) m103742Dp()).mo50307Pq();
        }
    }

    /* renamed from: Tp */
    static /* synthetic */ void m50368Tp(C9351f c9351f, AbstractC9350e.f.b bVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        c9351f.m50367Sp(bVar, z11);
    }

    /* renamed from: Wp */
    private final void m50369Wp(AbstractC9350e.f.b bVar) {
        boolean z11;
        String m125431b;
        boolean z12;
        boolean z13;
        String str;
        ArrayList arrayList = new ArrayList();
        AbstractC9350e.e eVar = this.f49513u;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_report_title_select_reason);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        eVar.m50343b(m118743r0);
        arrayList.add(eVar);
        ArrayList arrayList2 = new ArrayList();
        if (bVar != null) {
            arrayList2.add(bVar);
        } else {
            AbstractC23968e.b bVar2 = this.f49518z;
            if (bVar2 == null) {
                return;
            }
            int size = bVar2.m125437h().size();
            for (int i11 = 0; i11 < size; i11++) {
                AbstractC23968e abstractC23968e = (AbstractC23968e) bVar2.m125437h().get(i11);
                if (i11 == bVar2.m125437h().size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (AbstractC19074t.m100204b("vi", AbstractC18458a.f93019a)) {
                    m125431b = abstractC23968e.m125432c();
                } else {
                    m125431b = abstractC23968e.m125431b();
                }
                if (abstractC23968e.m125434e() && (abstractC23968e instanceof AbstractC23968e.c)) {
                    AbstractC9350e.f.b bVar3 = new AbstractC9350e.f.b((AbstractC23968e.c) abstractC23968e, m125431b);
                    C23966c c23966c = this.f49517y;
                    if (c23966c != null && !c23966c.m125425d()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    bVar3.m50350g(z12);
                    C23966c c23966c2 = this.f49517y;
                    if (c23966c2 != null && c23966c2.m125425d()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    bVar3.m50349f(z13);
                    bVar3.m50351h(z11);
                    bVar3.m50357n(true);
                    bVar3.m50356m(false);
                    ReportInfoCollected reportInfoCollected = this.f49508A;
                    if (reportInfoCollected == null || (str = reportInfoCollected.m50178a()) == null) {
                        str = "";
                    }
                    bVar3.m50355l(str);
                    arrayList2.add(bVar3);
                } else {
                    AbstractC9350e.f.a aVar = new AbstractC9350e.f.a(abstractC23968e, m125431b);
                    aVar.m50350g(abstractC23968e instanceof AbstractC23968e.c);
                    aVar.m50349f(abstractC23968e instanceof AbstractC23968e.b);
                    aVar.m50351h(z11);
                    arrayList2.add(aVar);
                }
            }
        }
        arrayList.addAll(m50361Mp(arrayList2));
        arrayList.add(AbstractC9350e.d.f49498b);
        if (this.f49512t.m128027A()) {
            AbstractC9350e.a aVar2 = this.f49514v;
            aVar2.m50341b(m50365Qp());
            arrayList.add(aVar2);
            arrayList.add(AbstractC9350e.b.f49497b);
        }
        ((InterfaceC26425b) m103742Dp()).mo50309Zw(arrayList);
    }

    /* renamed from: Xp */
    static /* synthetic */ void m50370Xp(C9351f c9351f, AbstractC9350e.f.b bVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bVar = null;
        }
        c9351f.m50369Wp(bVar);
    }

    /* renamed from: Yp */
    private final boolean m50371Yp() {
        String str;
        C24585b c24585b = this.f49512t;
        String str2 = this.f49516x;
        if (str2 == null) {
            AbstractC19074t.m100223u("reportObjectName");
            str2 = null;
        }
        C23966c m128035k = c24585b.m128035k(str2);
        if (m128035k == null) {
            return false;
        }
        this.f49517y = m128035k;
        if (this.f49508A == null) {
            String str3 = this.f49515w;
            if (str3 == null) {
                AbstractC19074t.m100223u("reportUid");
                str = null;
            } else {
                str = str3;
            }
            this.f49508A = new ReportInfoCollected(str, m128035k.m125423b(), null, null, null, null, null, false, 252, null);
            return true;
        }
        return true;
    }

    /* renamed from: Zp */
    private final boolean m50372Zp() {
        return this.f49509B instanceof AbstractC9350e.f.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bq */
    public final void m50373bq() {
        ((InterfaceC26425b) m103742Dp()).mo70710wy(new Runnable() { // from class: sz.d
            @Override // java.lang.Runnable
            public final void run() {
                C9351f.m50374cq(C9351f.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cq */
    public static final void m50374cq(C9351f c9351f) {
        AbstractC23968e abstractC23968e;
        String str;
        AbstractC19074t.m100208f(c9351f, "this$0");
        if (!((InterfaceC26425b) c9351f.m103742Dp()).mo78963ru()) {
            return;
        }
        if (!c9351f.m50371Yp()) {
            ((InterfaceC26425b) c9351f.m103742Dp()).mo50304I();
            return;
        }
        C23966c c23966c = c9351f.f49517y;
        String str2 = null;
        if (c23966c != null) {
            abstractC23968e = c23966c.m125424c();
        } else {
            abstractC23968e = null;
        }
        if (!(abstractC23968e instanceof AbstractC23968e.b)) {
            ((InterfaceC26425b) c9351f.m103742Dp()).mo50304I();
            return;
        }
        InterfaceC26425b interfaceC26425b = (InterfaceC26425b) c9351f.m103742Dp();
        C23493c c23493c = C23493c.f114055a;
        C23966c c23966c2 = c9351f.f49517y;
        if (c23966c2 == null || (str = c23966c2.m125423b()) == null) {
            str = "";
        }
        interfaceC26425b.mo50306Nc(c23493c.m123321i(str));
        if (c9351f.f49510C) {
            AbstractC23968e.b bVar = (AbstractC23968e.b) abstractC23968e;
            ReportInfoCollected reportInfoCollected = c9351f.f49508A;
            if (reportInfoCollected != null) {
                str2 = reportInfoCollected.m50183f();
            }
            abstractC23968e = c9351f.m50362Np(bVar, str2);
        }
        c9351f.m50377fq((AbstractC23968e.b) abstractC23968e);
        ((InterfaceC26425b) c9351f.m103742Dp()).mo50310up(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dq */
    public static final void m50375dq(C9351f c9351f, ReportInfoCollected reportInfoCollected) {
        AbstractC19074t.m100208f(c9351f, "this$0");
        AbstractC19074t.m100208f(reportInfoCollected, "$reportInfoCollected");
        c9351f.m50376eq(reportInfoCollected);
    }

    /* renamed from: eq */
    private final void m50376eq(ReportInfoCollected reportInfoCollected) {
        HashMap hashMap;
        int i11;
        long currentTimeMillis = System.currentTimeMillis();
        List m50180c = reportInfoCollected.m50180c();
        if (m50180c != null) {
            hashMap = C23493c.f114055a.m123324q(m50180c, this.f49512t.m128043v(), this.f49512t.m128044w());
        } else {
            hashMap = null;
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (hashMap != null) {
            i11 = hashMap.size();
        } else {
            i11 = 0;
        }
        C24561c.m127942b("[REPORT_V2]", "prepareAndSubmitReportAsync - Prepare: time=" + currentTimeMillis2 + ", cnt_photo=" + i11);
        this.f49512t.m128031M(reportInfoCollected, hashMap, new b(currentTimeMillis, this, reportInfoCollected), m50363Op());
    }

    /* renamed from: fq */
    private final void m50377fq(AbstractC23968e.b bVar) {
        this.f49518z = bVar;
        m50370Xp(this, null, 1, null);
    }

    /* renamed from: gq */
    private final void m50378gq(AbstractC9350e.f fVar) {
        ReportInfoCollected reportInfoCollected;
        this.f49509B = fVar;
        if (fVar != null && (reportInfoCollected = this.f49508A) != null) {
            reportInfoCollected.m50189l(fVar.m50346c().m125430a());
        }
        m50366Rp();
    }

    /* renamed from: iq */
    private final void m50379iq() {
        AbstractC9350e.f fVar = this.f49509B;
        if (fVar instanceof AbstractC9350e.f.b) {
            ((AbstractC9350e.f.b) fVar).m50356m(false);
        }
    }

    @Override // com.zing.zalo.report_v2.reportsummary.InterfaceC9349d
    /* renamed from: D0 */
    public void mo50332D0() {
        final ReportInfoCollected reportInfoCollected;
        if (this.f49511D || (reportInfoCollected = this.f49508A) == null) {
            return;
        }
        this.f49511D = true;
        ((InterfaceC26425b) m103742Dp()).mo49282B8(null, false);
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: sz.c
            @Override // java.lang.Runnable
            public final void run() {
                C9351f.m50375dq(C9351f.this, reportInfoCollected);
            }
        });
    }

    @Override // com.zing.zalo.report_v2.reportsummary.InterfaceC9349d
    /* renamed from: V2 */
    public void mo50333V2(AbstractC9350e.f.b bVar, String str) {
        AbstractC19074t.m100208f(bVar, "itemData");
        AbstractC19074t.m100208f(str, "contentReasonOther");
        ReportInfoCollected reportInfoCollected = this.f49508A;
        if (reportInfoCollected != null) {
            reportInfoCollected.m50186i(str);
        }
        bVar.m50355l(str);
        m50366Rp();
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: aq, reason: merged with bridge method [inline-methods] */
    public void mo995Nd(C9348c c9348c, InterfaceC19968g interfaceC19968g) {
        ReportInfoCollected m50328b;
        String str;
        super.mo995Nd(c9348c, interfaceC19968g);
        if (c9348c == null) {
            ((InterfaceC26425b) m103742Dp()).mo50304I();
            return;
        }
        String m50329c = c9348c.m50329c();
        String m50327a = c9348c.m50327a();
        if ((m50329c == null || m50329c.length() == 0 || m50327a == null || m50327a.length() == 0) && (m50328b = c9348c.m50328b()) != null) {
            m50329c = m50328b.m50184g();
            m50327a = m50328b.m50182e();
            this.f49508A = m50328b;
            this.f49510C = true;
        }
        if (interfaceC19968g != null && (interfaceC19968g instanceof C9346a)) {
            C9346a c9346a = (C9346a) interfaceC19968g;
            this.f49508A = c9346a.m50316a();
            ReportInfoCollected m50316a = c9346a.m50316a();
            if (m50316a != null) {
                str = m50316a.m50184g();
            } else {
                str = null;
            }
            ReportInfoCollected m50316a2 = c9346a.m50316a();
            if (m50316a2 != null) {
                m50327a = m50316a2.m50182e();
            } else {
                m50327a = null;
            }
            this.f49510C = true;
            m50329c = str;
        }
        if (m50329c != null && m50329c.length() != 0 && m50327a != null && m50327a.length() != 0) {
            this.f49515w = String.valueOf(m50329c);
            this.f49516x = String.valueOf(m50327a);
        } else {
            ((InterfaceC26425b) m103742Dp()).mo50304I();
        }
    }

    @Override // com.zing.zalo.report_v2.reportsummary.InterfaceC9349d
    /* renamed from: d */
    public void mo50334d() {
        ((InterfaceC26425b) m103742Dp()).mo50310up(true);
        this.f49512t.m128028B(new a());
    }

    @Override // p205hc.InterfaceC19966e
    /* renamed from: fi */
    public InterfaceC19968g mo50381fi() {
        C9346a c9346a = new C9346a();
        ReportInfoCollected reportInfoCollected = this.f49508A;
        if (reportInfoCollected != null) {
            AbstractC9350e.f fVar = this.f49509B;
            boolean z11 = false;
            if (fVar != null && (fVar instanceof AbstractC9350e.f.b) && ((AbstractC9350e.f.b) fVar).m50354k()) {
                z11 = true;
            }
            reportInfoCollected.m50190m(z11);
        }
        c9346a.m50317b(this.f49508A);
        return c9346a;
    }

    /* renamed from: hq */
    public final void m50382hq(boolean z11) {
        this.f49511D = z11;
    }

    @Override // com.zing.zalo.report_v2.reportsummary.InterfaceC9349d
    /* renamed from: ip */
    public void mo50335ip(ReportInfoCollected reportInfoCollected) {
        AbstractC19074t.m100208f(reportInfoCollected, "reportInfoCollected");
        this.f49508A = reportInfoCollected;
        this.f49514v.m50341b(m50365Qp());
        ((InterfaceC26425b) m103742Dp()).mo50307Pq();
    }

    @Override // com.zing.zalo.report_v2.reportsummary.InterfaceC9349d
    /* renamed from: kb */
    public void mo50336kb() {
        ReportInfoCollected reportInfoCollected = this.f49508A;
        if (reportInfoCollected == null) {
            return;
        }
        AbstractC9350e.f fVar = this.f49509B;
        boolean z11 = false;
        if (fVar != null && (fVar instanceof AbstractC9350e.f.b) && ((AbstractC9350e.f.b) fVar).m50354k()) {
            z11 = true;
        }
        reportInfoCollected.m50190m(z11);
        ((InterfaceC26425b) m103742Dp()).mo50305JG(reportInfoCollected, m50363Op());
    }

    @Override // com.zing.zalo.report_v2.reportsummary.InterfaceC9349d
    /* renamed from: m1 */
    public boolean mo50337m1(AbstractC9350e.f fVar) {
        String str;
        AbstractC23968e m50346c;
        AbstractC19074t.m100208f(fVar, "itemReason");
        AbstractC9350e.f fVar2 = this.f49509B;
        if (fVar2 != null && (m50346c = fVar2.m50346c()) != null) {
            str = m50346c.m125430a();
        } else {
            str = null;
        }
        return AbstractC19074t.m100204b(str, fVar.m50346c().m125430a());
    }

    @Override // com.zing.zalo.report_v2.reportsummary.InterfaceC9349d
    /* renamed from: pc */
    public void mo50338pc(AbstractC9350e.f fVar) {
        C23966c c23966c;
        AbstractC19074t.m100208f(fVar, "itemReason");
        if ((fVar instanceof AbstractC9350e.f.b) && (((c23966c = this.f49517y) != null && !c23966c.m125425d()) || ((AbstractC9350e.f.b) fVar).m50354k())) {
            m50378gq(fVar);
            m50368Tp(this, (AbstractC9350e.f.b) fVar, false, 2, null);
            return;
        }
        if (fVar instanceof AbstractC9350e.f.a) {
            if (this.f49509B instanceof AbstractC9350e.f.b) {
                ((InterfaceC26425b) m103742Dp()).mo50303C();
            }
            AbstractC23968e m50346c = fVar.m50346c();
            if (m50346c instanceof AbstractC23968e.b) {
                this.f49518z = (AbstractC23968e.b) m50346c;
                m50370Xp(this, null, 1, null);
            } else if (m50346c instanceof AbstractC23968e.c) {
                m50379iq();
                m50378gq(fVar);
                ((InterfaceC26425b) m103742Dp()).mo50307Pq();
            }
        }
    }

    @Override // com.zing.zalo.report_v2.reportsummary.InterfaceC9349d
    /* renamed from: w9 */
    public boolean mo50339w9() {
        C23966c c23966c;
        AbstractC9350e.f.b bVar;
        AbstractC9350e.f.b bVar2;
        AbstractC23968e.b bVar3 = this.f49518z;
        if (bVar3 == null) {
            return false;
        }
        if (bVar3.m125433d() instanceof AbstractC23968e.b) {
            AbstractC23968e m125433d = bVar3.m125433d();
            AbstractC19074t.m100206d(m125433d, "null cannot be cast to non-null type com.zing.zalo.report_v2.model.ReportReason.GroupReason");
            this.f49518z = (AbstractC23968e.b) m125433d;
            m50370Xp(this, null, 1, null);
            return true;
        }
        if ((this.f49509B instanceof AbstractC9350e.f.b) && (c23966c = this.f49517y) != null && c23966c.m125425d()) {
            AbstractC9350e.f fVar = this.f49509B;
            if (fVar instanceof AbstractC9350e.f.b) {
                bVar = (AbstractC9350e.f.b) fVar;
            } else {
                bVar = null;
            }
            if (bVar != null && !bVar.m50354k()) {
                AbstractC9350e.f fVar2 = this.f49509B;
                if (fVar2 instanceof AbstractC9350e.f.b) {
                    bVar2 = (AbstractC9350e.f.b) fVar2;
                } else {
                    bVar2 = null;
                }
                if (bVar2 != null) {
                    bVar2.m50357n(true);
                }
                m50370Xp(this, null, 1, null);
                return true;
            }
        }
        return false;
    }
}
