package p466qz;

import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.report_v2.model.ReportInfoCollected;
import com.zing.zalo.report_v2.model.ReportMessageAttachment;
import com.zing.zalo.report_v2.model.ReportPhotoAttachment;
import com.zing.zalo.report_v2.reportattachment.C9335a;
import com.zing.zalo.report_v2.reportsummary.C9346a;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23280z4;
import mz.C23493c;
import nh0.C23793c;
import nz.AbstractC23968e;
import p133ek.AbstractC18458a;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19968g;
import p409oz.C24585b;
import vg.C28203u6;

/* renamed from: qz.c */
/* loaded from: classes4.dex */
public final class C25569c extends AbstractC19962a implements InterfaceC25567a {

    /* renamed from: t */
    private final C24585b f122251t;

    /* renamed from: u */
    private ReportInfoCollected f122252u;

    /* renamed from: v */
    private ReportInfoCollected f122253v;

    /* renamed from: w */
    private boolean f122254w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25569c(InterfaceC25568b interfaceC25568b, C24585b c24585b) {
        super(interfaceC25568b);
        AbstractC19074t.m100208f(interfaceC25568b, "mvpView");
        AbstractC19074t.m100208f(c24585b, "reportRepo");
        this.f122251t = c24585b;
    }

    /* renamed from: Ip */
    private final boolean m132117Ip(int i11) {
        if (i11 < this.f122251t.m128038p()) {
            return true;
        }
        return false;
    }

    /* renamed from: Jp */
    private final int m132118Jp() {
        ReportInfoCollected reportInfoCollected = this.f122252u;
        if (reportInfoCollected == null) {
            AbstractC19074t.m100223u("reportInfoCollected");
            reportInfoCollected = null;
        }
        List m50179b = reportInfoCollected.m50179b();
        if (m50179b != null) {
            return m50179b.size();
        }
        return 0;
    }

    /* renamed from: Kp */
    private final int m132119Kp() {
        ReportInfoCollected reportInfoCollected = this.f122252u;
        if (reportInfoCollected == null) {
            AbstractC19074t.m100223u("reportInfoCollected");
            reportInfoCollected = null;
        }
        List m50180c = reportInfoCollected.m50180c();
        if (m50180c != null) {
            return m50180c.size();
        }
        return 0;
    }

    /* renamed from: Mp */
    private final ArrayList m132120Mp() {
        ArrayList arrayList = new ArrayList();
        ReportInfoCollected reportInfoCollected = this.f122252u;
        if (reportInfoCollected == null) {
            AbstractC19074t.m100223u("reportInfoCollected");
            reportInfoCollected = null;
        }
        List m50180c = reportInfoCollected.m50180c();
        if (m50180c != null) {
            Iterator it = m50180c.iterator();
            while (it.hasNext()) {
                arrayList.add(((ReportPhotoAttachment) it.next()).m50200c());
            }
        }
        return arrayList;
    }

    /* renamed from: Np */
    private final ArrayList m132121Np(String str) {
        ReportInfoCollected reportInfoCollected = this.f122252u;
        ArrayList arrayList = null;
        if (reportInfoCollected == null) {
            AbstractC19074t.m100223u("reportInfoCollected");
            reportInfoCollected = null;
        }
        List<ReportMessageAttachment> m50179b = reportInfoCollected.m50179b();
        if (m50179b != null) {
            for (ReportMessageAttachment reportMessageAttachment : m50179b) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                MessageId m41062g = MessageId.C7932a.m41062g(MessageId.Companion, "", String.valueOf(reportMessageAttachment.m50194a()), str, null, 8, null);
                if (m41062g != null) {
                    arrayList.add(m41062g);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: Op */
    private final int m132122Op() {
        C9335a c9335a = (C9335a) m103744Fp();
        if (c9335a != null) {
            return c9335a.m50257c();
        }
        return 0;
    }

    /* renamed from: Pp */
    private final void m132123Pp() {
        boolean z11;
        if (this.f122251t.m128037o() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ((InterfaceC25568b) m103742Dp()).mo50236X4(z11);
        if (z11) {
            ((InterfaceC25568b) m103742Dp()).mo50239fc(m132118Jp(), this.f122251t.m128037o());
        }
    }

    /* renamed from: Qp */
    private final void m132124Qp() {
        boolean z11;
        if (this.f122251t.m128038p() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ((InterfaceC25568b) m103742Dp()).mo50228Cj(z11);
        if (z11) {
            int m132119Kp = m132119Kp();
            ((InterfaceC25568b) m103742Dp()).mo50232JI(m132119Kp, this.f122251t.m128038p());
            InterfaceC25568b interfaceC25568b = (InterfaceC25568b) m103742Dp();
            ReportInfoCollected reportInfoCollected = this.f122252u;
            if (reportInfoCollected == null) {
                AbstractC19074t.m100223u("reportInfoCollected");
                reportInfoCollected = null;
            }
            interfaceC25568b.mo50243rb(reportInfoCollected.m50180c(), m132117Ip(m132119Kp));
        }
    }

    /* renamed from: Rp */
    private final void m132125Rp() {
        if (!this.f122254w && m132118Jp() <= 0 && m132119Kp() <= 0) {
            ((InterfaceC25568b) m103742Dp()).mo50231JD(false);
        } else {
            ((InterfaceC25568b) m103742Dp()).mo50231JD(true);
        }
    }

    /* renamed from: Sp */
    private final boolean m132126Sp() {
        return this.f122252u != null;
    }

    /* renamed from: Wp */
    private final void m132127Wp(List list) {
        ReportInfoCollected reportInfoCollected = this.f122252u;
        if (reportInfoCollected == null) {
            AbstractC19074t.m100223u("reportInfoCollected");
            reportInfoCollected = null;
        }
        if (reportInfoCollected.m50180c() == null) {
            reportInfoCollected.m50188k(new ArrayList());
        }
        List m50180c = reportInfoCollected.m50180c();
        if (m50180c != null) {
            m50180c.clear();
            m50180c.addAll(list);
        }
        m132124Qp();
        m132125Rp();
    }

    @Override // p466qz.InterfaceC25567a
    /* renamed from: Cm */
    public ArrayList mo132107Cm() {
        ArrayList arrayList = new ArrayList();
        if (!m132126Sp()) {
            return arrayList;
        }
        ReportInfoCollected reportInfoCollected = this.f122252u;
        if (reportInfoCollected == null) {
            AbstractC19074t.m100223u("reportInfoCollected");
            reportInfoCollected = null;
        }
        List<ReportPhotoAttachment> m50180c = reportInfoCollected.m50180c();
        if (m50180c != null) {
            for (ReportPhotoAttachment reportPhotoAttachment : m50180c) {
                ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
                itemAlbumMobile.f42548C = reportPhotoAttachment.m50199b();
                itemAlbumMobile.f42609y = reportPhotoAttachment.m50199b();
                arrayList.add(itemAlbumMobile);
            }
        }
        return arrayList;
    }

    @Override // p466qz.InterfaceC25567a
    /* renamed from: De */
    public void mo132108De() {
        if (m132126Sp() && m132117Ip(m132119Kp())) {
            ((InterfaceC25568b) m103742Dp()).mo50238av(this.f122251t.m128038p(), m132120Mp());
        }
    }

    @Override // p466qz.InterfaceC25567a
    /* renamed from: Eh */
    public void mo132109Eh() {
        String m128039r = C24585b.Companion.m128049a().m128039r();
        if (m128039r.length() > 0) {
            ((InterfaceC25568b) m103742Dp()).mo50240he(m128039r);
        } else {
            ((InterfaceC25568b) m103742Dp()).mo50235UH();
        }
    }

    @Override // p466qz.InterfaceC25567a
    /* renamed from: Gb */
    public void mo132110Gb() {
        if (!m132126Sp()) {
            return;
        }
        ReportInfoCollected reportInfoCollected = this.f122252u;
        ReportInfoCollected reportInfoCollected2 = null;
        if (reportInfoCollected == null) {
            AbstractC19074t.m100223u("reportInfoCollected");
            reportInfoCollected = null;
        }
        String m50184g = reportInfoCollected.m50184g();
        if (m50184g.length() == 0) {
            ((InterfaceC25568b) m103742Dp()).mo50230I();
            return;
        }
        ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, m50184g, false, 2, null);
        if (m141800i == null) {
            m141800i = new ContactProfile(m50184g);
        }
        String valueOf = String.valueOf(C23793c.Companion.m124321a().mo124314i());
        C24585b m128049a = C24585b.Companion.m128049a();
        ReportInfoCollected reportInfoCollected3 = this.f122253v;
        if (reportInfoCollected3 == null) {
            AbstractC19074t.m100223u("reportInfoCollectedOrigin");
            reportInfoCollected3 = null;
        }
        ReportInfoCollected reportInfoCollected4 = this.f122252u;
        if (reportInfoCollected4 == null) {
            AbstractC19074t.m100223u("reportInfoCollected");
        } else {
            reportInfoCollected2 = reportInfoCollected4;
        }
        m128049a.m128030L(valueOf, reportInfoCollected3, reportInfoCollected2, m132122Op());
        ((InterfaceC25568b) m103742Dp()).mo50229D4(m141800i, valueOf, m132121Np(m50184g));
    }

    @Override // p466qz.InterfaceC25567a
    /* renamed from: J5 */
    public void mo132111J5() {
        if (!((InterfaceC25568b) m103742Dp()).mo50234MF()) {
            InterfaceC25568b interfaceC25568b = (InterfaceC25568b) m103742Dp();
            ReportInfoCollected reportInfoCollected = this.f122253v;
            if (reportInfoCollected == null) {
                AbstractC19074t.m100223u("reportInfoCollectedOrigin");
                reportInfoCollected = null;
            }
            interfaceC25568b.mo50237aj(reportInfoCollected, m132122Op());
            return;
        }
        ((InterfaceC25568b) m103742Dp()).mo50233KE();
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: Tp, reason: merged with bridge method [inline-methods] */
    public void mo995Nd(C9335a c9335a, InterfaceC19968g interfaceC19968g) {
        ReportInfoCollected reportInfoCollected;
        boolean z11;
        super.mo995Nd(c9335a, interfaceC19968g);
        ReportInfoCollected reportInfoCollected2 = null;
        if (c9335a != null) {
            reportInfoCollected = c9335a.m50255a();
        } else {
            reportInfoCollected = null;
        }
        if (c9335a != null) {
            reportInfoCollected2 = c9335a.m50256b();
        }
        if (interfaceC19968g != null && (interfaceC19968g instanceof C9346a)) {
            reportInfoCollected2 = ((C9346a) interfaceC19968g).m50316a();
        }
        if (reportInfoCollected == null) {
            ((InterfaceC25568b) m103742Dp()).mo50230I();
            return;
        }
        ReportInfoCollected.C9327a c9327a = ReportInfoCollected.Companion;
        if (reportInfoCollected2 == null) {
            reportInfoCollected2 = reportInfoCollected;
        }
        this.f122252u = c9327a.m50191a(reportInfoCollected2);
        this.f122253v = reportInfoCollected;
        if (m132118Jp() <= 0 && m132119Kp() <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f122254w = z11;
    }

    @Override // p466qz.InterfaceC25567a
    /* renamed from: d */
    public void mo132112d() {
        if (!m132126Sp()) {
            return;
        }
        C23493c c23493c = C23493c.f114055a;
        ReportInfoCollected reportInfoCollected = this.f122252u;
        String str = null;
        if (reportInfoCollected == null) {
            AbstractC19074t.m100223u("reportInfoCollected");
            reportInfoCollected = null;
        }
        String m50182e = reportInfoCollected.m50182e();
        ReportInfoCollected reportInfoCollected2 = this.f122252u;
        if (reportInfoCollected2 == null) {
            AbstractC19074t.m100223u("reportInfoCollected");
            reportInfoCollected2 = null;
        }
        ((InterfaceC25568b) m103742Dp()).mo50244vh(C23493c.m123311g(c23493c, m50182e, reportInfoCollected2.m50184g(), null, 4, null));
        C24585b c24585b = this.f122251t;
        ReportInfoCollected reportInfoCollected3 = this.f122252u;
        if (reportInfoCollected3 == null) {
            AbstractC19074t.m100223u("reportInfoCollected");
            reportInfoCollected3 = null;
        }
        AbstractC23968e m128045x = c24585b.m128045x(reportInfoCollected3.m50183f());
        if (AbstractC19074t.m100204b("vi", AbstractC18458a.f93019a)) {
            if (m128045x != null) {
                str = m128045x.m125432c();
            }
        } else if (m128045x != null) {
            str = m128045x.m125431b();
        }
        InterfaceC25568b interfaceC25568b = (InterfaceC25568b) m103742Dp();
        if (str == null) {
            str = "";
        }
        interfaceC25568b.mo50242pF(str);
        m132125Rp();
        m132123Pp();
        m132124Qp();
    }

    @Override // p205hc.InterfaceC19966e
    /* renamed from: fi */
    public InterfaceC19968g mo50381fi() {
        C9346a c9346a = new C9346a();
        ReportInfoCollected reportInfoCollected = this.f122252u;
        if (reportInfoCollected == null) {
            AbstractC19074t.m100223u("reportInfoCollected");
            reportInfoCollected = null;
        }
        c9346a.m50317b(reportInfoCollected);
        return c9346a;
    }

    @Override // p466qz.InterfaceC25567a
    /* renamed from: vk */
    public void mo132113vk(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "listMediaItem");
        if (arrayList.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MediaItem mediaItem = (MediaItem) it.next();
                String m120361x = AbstractC23280z4.m120361x(mediaItem);
                AbstractC19074t.m100207e(m120361x, "getPhotoPathCache(...)");
                if (m120361x.length() > 0) {
                    AbstractC19074t.m100205c(mediaItem);
                    arrayList2.add(new ReportPhotoAttachment(mediaItem));
                }
            }
            m132127Wp(arrayList2);
        }
    }

    @Override // p466qz.InterfaceC25567a
    /* renamed from: xp */
    public void mo132114xp(ReportPhotoAttachment reportPhotoAttachment) {
        AbstractC19074t.m100208f(reportPhotoAttachment, "photoAttachment");
        if (!m132126Sp()) {
            return;
        }
        ReportInfoCollected reportInfoCollected = this.f122252u;
        if (reportInfoCollected == null) {
            AbstractC19074t.m100223u("reportInfoCollected");
            reportInfoCollected = null;
        }
        List m50180c = reportInfoCollected.m50180c();
        if (m50180c != null) {
            m50180c.remove(reportPhotoAttachment);
        }
        m132124Qp();
        m132125Rp();
    }

    @Override // p466qz.InterfaceC25567a
    /* renamed from: yj */
    public void mo132115yj(ArrayList arrayList) {
        if (m132126Sp()) {
            ReportInfoCollected reportInfoCollected = this.f122252u;
            if (reportInfoCollected == null) {
                AbstractC19074t.m100223u("reportInfoCollected");
                reportInfoCollected = null;
            }
            reportInfoCollected.m50187j(arrayList);
            mo132112d();
        }
    }

    @Override // p466qz.InterfaceC25567a
    /* renamed from: zg */
    public void mo132116zg() {
        if (!m132126Sp()) {
            return;
        }
        ReportInfoCollected reportInfoCollected = null;
        if (!((InterfaceC25568b) m103742Dp()).mo50234MF()) {
            InterfaceC25568b interfaceC25568b = (InterfaceC25568b) m103742Dp();
            ReportInfoCollected reportInfoCollected2 = this.f122252u;
            if (reportInfoCollected2 == null) {
                AbstractC19074t.m100223u("reportInfoCollected");
            } else {
                reportInfoCollected = reportInfoCollected2;
            }
            interfaceC25568b.mo50237aj(reportInfoCollected, m132122Op());
            return;
        }
        InterfaceC25568b interfaceC25568b2 = (InterfaceC25568b) m103742Dp();
        ReportInfoCollected reportInfoCollected3 = this.f122252u;
        if (reportInfoCollected3 == null) {
            AbstractC19074t.m100223u("reportInfoCollected");
        } else {
            reportInfoCollected = reportInfoCollected3;
        }
        interfaceC25568b2.mo50241p8(reportInfoCollected);
    }
}
