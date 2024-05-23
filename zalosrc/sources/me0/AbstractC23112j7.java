package me0;

import ag0.AbstractC0837p0;
import ag0.C0814e0;
import am.C0943w;
import android.os.Bundle;
import android.text.TextUtils;
import b40.C2526d;
import bo.C3000l0;
import bo.C3020p0;
import c30.C3245i;
import c30.C3255n;
import cg.AbstractC3460h;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.data.mediapicker.model.VideoItem;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.pojo.ShareLinkInfo;
import com.zing.zalo.productcatalog.utils.AbstractC9183a;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17949b1;
import dj.C17961f1;
import dj.C17967h1;
import dj.C17969i0;
import dj.C17976k1;
import dj.C17979l1;
import dj.C17981m0;
import dj.C17990p0;
import dj.C17993q0;
import dj.C17994q1;
import dj.C18002t0;
import dj.C18009w0;
import dj.C18013y0;
import eg0.C18427b;
import gw.AbstractC19646n0;
import gw.AbstractC19656s0;
import ho0.AbstractC20110a;
import ig0.AbstractC20550a;
import im.C20612c;
import im.C20614e;
import im.C20617h;
import im.C20618i;
import im.C20620k;
import is.AbstractC20826v0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import mg.C23288a;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import mw.AbstractC23463h;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p056cj.C3535c;
import p185gc.AbstractC19378b;
import p239ih.C20551a;
import p239ih.C20556f;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p348mi.C23307g;
import p363nh.C23744a;
import p386ob.EnumC24193d;
import p386ob.EnumC24194e;
import p461qu.AbstractC25495a;
import p471r3.C25630b;
import p485rj.C25809a;
import p485rj.C25810b;
import p485rj.C25811c;
import p559uv.C27373c;
import p611wj.C29058f;
import p716zh.C31849b1;
import p716zh.C31944h6;
import p716zh.C31973j5;
import p716zh.C31986k3;
import p716zh.C32024mb;
import p716zh.C32027n;
import p716zh.C32042o;
import p716zh.C32080q9;
import p716zh.C32094r9;
import p716zh.C32098s;
import p716zh.C32107s8;
import p716zh.C32121t8;
import p716zh.C32122t9;
import sx.C26399a;
import sx.C26404f;
import sx.C26405g;
import sx.C26406h;
import sx.EnumC26407i;
import td0.C26639b;
import th.AbstractC26689j;
import th.C26680a;
import tj.C26713e;
import tv.AbstractC26897a;
import ve.AbstractC27985d;
import vg.C28203u6;
import wg0.C28989l;
import xd0.C29585a;
import xd0.C29599o;
import yd0.C30912e;

/* renamed from: me0.j7 */
/* loaded from: classes4.dex */
public abstract class AbstractC23112j7 {

    /* renamed from: a */
    private static EnumC26407i f112197a = EnumC26407i.f125522x;

    /* renamed from: b */
    private static final HashMap f112198b = new HashMap();

    /* renamed from: c */
    private static final HashMap f112199c = new HashMap();

    /* renamed from: d */
    private static final HashMap f112200d = new HashMap();

    /* renamed from: me0.j7$a */
    /* loaded from: classes4.dex */
    public class a implements AbstractC19378b.a {

        /* renamed from: a */
        final /* synthetic */ String f112201a;

        /* renamed from: b */
        final /* synthetic */ C17945a0 f112202b;

        /* renamed from: c */
        final /* synthetic */ boolean f112203c;

        /* renamed from: d */
        final /* synthetic */ boolean f112204d;

        a(String str, C17945a0 c17945a0, boolean z11, boolean z12) {
            this.f112201a = str;
            this.f112202b = c17945a0;
            this.f112203c = z11;
            this.f112204d = z12;
        }

        @Override // p185gc.AbstractC19378b.a
        /* renamed from: a */
        public void onSuccess(C29599o.b bVar) {
        }

        @Override // p185gc.AbstractC19378b.a
        /* renamed from: b */
        public void mo1004b() {
            AbstractC23112j7.m118509S(this.f112201a, this.f112202b, this.f112203c, this.f112204d, C30912e.c.a.f142555a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:            if (th.AbstractC26689j.m137087N() == false) goto L106;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006e, code lost:            gw.AbstractC19646n0.m102964c2(r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:            m118561w(r16, r3, r8, 48, 49, r9);     */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m118489A(String str, C26404f c26404f) {
        int i11;
        long j11;
        List<C17945a0> m136152e = c26404f.m136152e();
        boolean z11 = c26404f.f125460p;
        String m136150c = c26404f.m136150c();
        long j12 = c26404f.f125439U;
        try {
            if (!ContactProfile.m40346R0(CoreUtility.f89233i) || !ContactProfile.m40346R0(str) || m118568z0(str)) {
                return;
            }
            Collections.sort(m136152e, new Comparator() { // from class: me0.i7
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m118505O;
                    m118505O = AbstractC23112j7.m118505O((C17945a0) obj, (C17945a0) obj2);
                    return m118505O;
                }
            });
            long j13 = 0;
            LinkedList linkedList = null;
            for (C17945a0 c17945a0 : m136152e) {
                if (c17945a0.m94954N0()) {
                    if (c17945a0.m94969O6()) {
                        if (linkedList != null && j13 == c17945a0.mo95204n()) {
                            linkedList.add(c17945a0);
                            j11 = j13;
                        }
                        linkedList = new LinkedList();
                        linkedList.add(c17945a0);
                        j13 = c17945a0.mo95204n();
                        j11 = j13;
                    } else {
                        if (linkedList != null) {
                            if (AbstractC26689j.m137087N()) {
                                AbstractC19646n0.m102964c2(linkedList);
                            }
                            m118561w(str, linkedList, z11, 48, 49, m136150c);
                            m118490A0();
                        }
                        if (c17945a0.m94871D7()) {
                            i11 = 48;
                        } else if (c17945a0.m95306y8()) {
                            i11 = 49;
                        } else if (c17945a0.m95276v6()) {
                            i11 = 6;
                        } else {
                            i11 = -1;
                        }
                        C26404f m87542qN = ShareView.m87542qN(c17945a0, z11, i11);
                        if (m87542qN != null) {
                            m87542qN.f125439U = j12;
                            m87542qN.f125454j = c26404f.f125454j;
                            m118513W(str, m87542qN);
                        }
                        j11 = 0;
                        linkedList = null;
                    }
                    m118490A0();
                    j13 = j11;
                }
            }
            if (linkedList != null) {
                if (AbstractC26689j.m137087N()) {
                    AbstractC19646n0.m102964c2(linkedList);
                }
                m118561w(str, linkedList, z11, 48, 49, m136150c);
                m118490A0();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: A0 */
    private static void m118490A0() {
        m118492B0(10L);
    }

    /* renamed from: B */
    public static void m118491B(String str, C17945a0 c17945a0, C18009w0 c18009w0, boolean z11, C26406h c26406h, String str2, EnumC24194e enumC24194e) {
        boolean z12;
        int i11;
        try {
            if (!ContactProfile.m40346R0(CoreUtility.f89233i) || !ContactProfile.m40346R0(str) || m118568z0(str)) {
                return;
            }
            if (c26406h == null) {
                c26406h = new C26406h();
            }
            if (!TextUtils.isEmpty(c17945a0.m94983Q3()) && AbstractC23041d2.m118194A(c17945a0.m94983Q3()) && c18009w0 != null) {
                if (C20551a.m106806a(c17945a0.m94983Q3())) {
                    if (c17945a0.m94929K2() instanceof C18009w0) {
                        c18009w0.m95753S(c17945a0.m94983Q3());
                        c18009w0.m95778m0();
                        MessageId m41036c = MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str, CoreUtility.f89233i);
                        C32094r9 c32094r9 = new C32094r9();
                        c32094r9.m154889g0(enumC24194e);
                        if (AbstractC3489d.m17501i() && C28989l.m144746p().m144767w()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        c32094r9.m154923y0(z12);
                        if (z11) {
                            i11 = 4;
                        } else {
                            i11 = 3;
                        }
                        C17945a0.w m95350B = new C17945a0.w(m41036c, i11).m95382r(c17945a0.m94983Q3()).m95368d(c18009w0).m95353E(new C32094r9()).m95357I(C23793c.m124316k().mo124319c()).m95363O(c18009w0.f91014s).m95364P(c18009w0.f91013r).m95379o(c17945a0.m94983Q3()).m95385u(c26406h.m136186j()).m95350B(c26406h.m136187k());
                        C26713e m136184h = c26406h.m136184h();
                        if (m136184h != null && m136184h.m137356a()) {
                            m95350B.m95383s(m136184h);
                        }
                        if (c26406h.m136181e() != null) {
                            c26406h.m136181e().m107264F(C20620k.m107330a().m107370u(c18009w0.m95787u()).m107356g(c18009w0.m95785s()).m107363n(c17945a0.m94983Q3()).m107350a());
                            m95350B.m95384t(new C17976k1(c26406h.m136181e().m107293q()));
                        }
                        m95350B.m95380p(c17945a0.m95002S3());
                        m95350B.m95366b(c26406h.m136180d());
                        C17945a0 m95365a = m95350B.m95365a();
                        m95365a.m94951M9();
                        if (c17945a0.m95132f6()) {
                            m95365a.m94915I5();
                        }
                        AbstractC23306f.m120694n1().m101500a(new C29599o.a(str, m95365a, true, str2));
                        return;
                    }
                    throw new IllegalArgumentException("invalid original rich content. Must be ChatRichContentPhoto");
                }
                ToastUtils.m89273u();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: B0 */
    private static void m118492B0(long j11) {
        try {
            Thread.sleep(j11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: C */
    public static void m118493C(String str, C17945a0 c17945a0, C18009w0 c18009w0, C26406h c26406h, String str2) {
        C26406h c26406h2;
        try {
            if (!ContactProfile.m40346R0(CoreUtility.f89233i) || !ContactProfile.m40346R0(str) || m118568z0(str)) {
                return;
            }
            if (c17945a0.m94929K2() instanceof C18009w0) {
                if (c26406h == null) {
                    c26406h2 = new C26406h();
                } else {
                    c26406h2 = c26406h;
                }
                C17945a0.w m95385u = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str, CoreUtility.f89233i), 31).m95382r(c17945a0.m94983Q3()).m95368d(c18009w0).m95363O(c18009w0.f91014s).m95364P(c18009w0.f91013r).m95379o(c17945a0.m94983Q3()).m95385u(c26406h2.m136186j());
                if (c17945a0.m95071Z3() != null && c17945a0.m95071Z3().m137356a()) {
                    m95385u.m95383s(c17945a0.m95071Z3());
                }
                m95385u.m95350B(c26406h2.m136187k());
                if (c26406h2.m136181e() != null) {
                    c26406h2.m136181e().m107264F(C20620k.m107330a().m107370u(c18009w0.m95787u()).m107356g(c18009w0.m95785s()).m107363n(c17945a0.m94983Q3()).m107350a());
                    m95385u.m95384t(new C17976k1(c26406h2.m136181e().m107293q()));
                }
                m95385u.m95366b(c26406h2.m136180d());
                C17945a0 m95365a = m95385u.m95365a();
                m95365a.m94951M9();
                AbstractC23306f.m120694n1().m101500a(new C29599o.a(str, m95365a, true, str2));
                C3255n.m16562n().m16576s(new C25811c(c18009w0.f91013r, c18009w0.f91014s, c18009w0.m95787u(), c18009w0.m95785s(), c18009w0.m95774k(), c18009w0.m95742G(), c18009w0.m95786t(), c18009w0.m95736A(), c18009w0.m95792z()));
                return;
            }
            throw new IllegalArgumentException("invalid original rich content. Must be ChatRichContentPhoto");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: D */
    public static void m118494D(C17945a0 c17945a0, int i11) {
        C26404f m87542qN = ShareView.m87542qN(c17945a0, true, i11);
        if (m87542qN == null) {
            return;
        }
        String m118557u = m118557u(c17945a0.m94929K2());
        if (!TextUtils.isEmpty(m118557u)) {
            m87542qN.m136172y(m118557u);
        }
        m87542qN.f125461q = c17945a0.m94876E2();
        m118513W("204278670", m87542qN);
    }

    /* renamed from: E */
    public static void m118495E(String str, String str2, C17969i0 c17969i0, String str3, boolean z11, C26406h c26406h, String str4, boolean z12, EnumC24194e enumC24194e) {
        boolean z13;
        C17976k1 c17976k1;
        try {
            if (!ContactProfile.m40346R0(CoreUtility.f89233i) || !ContactProfile.m40346R0(str) || !(c17969i0 instanceof C17961f1) || m118568z0(str)) {
                return;
            }
            if (c26406h == null) {
                c26406h = new C26406h();
            }
            C17961f1 c17961f1 = new C17961f1((C17961f1) c17969i0);
            if (str3 == null) {
                str3 = "";
            }
            c17961f1.f91011p = str3;
            c17961f1.m95467U(z11);
            MessageId m41036c = MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str, CoreUtility.f89233i);
            C32094r9 c32094r9 = new C32094r9();
            c32094r9.m154889g0(enumC24194e);
            if (AbstractC3489d.m17501i() && C28989l.m144746p().m144767w()) {
                z13 = true;
            } else {
                z13 = false;
            }
            c32094r9.m154923y0(z13);
            C17945a0.w m95357I = new C17945a0.w(m41036c, 19).m95368d(c17961f1).m95353E(c32094r9).m95357I(C23793c.m124316k().mo124319c());
            if (AbstractC23309i.m120974Gf()) {
                c17961f1.m95515z0(c17969i0.f91014s);
                c17961f1.m95482i0(c17969i0.f91013r);
                c17961f1.f91014s = "";
                c17961f1.f91013r = "";
            } else {
                m95357I.m95363O(c17969i0.f91014s);
                m95357I.m95364P(c17969i0.f91013r);
            }
            c17961f1.m95449D0();
            if (c26406h.m136181e() != null) {
                C20620k.a m107364o = C20620k.m107330a().m107370u(((C17961f1) c17969i0).m95456J()).m107356g(((C17961f1) c17969i0).m95514z()).m107353d("mp4").m107366q(c17961f1.m95506v()).m107365p(c17961f1.m95502t()).m107367r(c17961f1.m95512y()).m107369t(c17961f1.m95450E()).m107368s(c17961f1.m95444B()).m107364o(c17961f1.m95508w() / 1000);
                if (!TextUtils.isEmpty(str2)) {
                    m107364o.m107363n(str2);
                } else {
                    m107364o.m107362m(c17961f1.m95453G());
                }
                c26406h.m136181e().m107264F(m107364o.m107350a());
                c17976k1 = new C17976k1(c26406h.m136181e().m107293q());
            } else {
                c17976k1 = null;
            }
            m95357I.m95379o(str2);
            m95357I.m95385u(c26406h.m136186j());
            m95357I.m95384t(c17976k1);
            if (c26406h.m136184h() != null && c26406h.m136184h().m137356a()) {
                m95357I.m95383s(c26406h.m136184h());
            }
            m95357I.m95350B(c26406h.m136187k());
            m95357I.m95366b(c26406h.m136180d());
            C17945a0 m95365a = m95357I.m95365a();
            m95365a.m94951M9();
            if (z12) {
                m95365a.m94915I5();
            }
            AbstractC23306f.m120694n1().m101500a(new C29599o.a(str, m95365a, true, str4));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: F */
    private static C17945a0 m118496F(C32122t9 c32122t9, EnumC24194e enumC24194e) {
        try {
            if (!ContactProfile.m40346R0(CoreUtility.f89233i) || !ContactProfile.m40346R0(c32122t9.m155025c()) || m118568z0(c32122t9.m155025c())) {
                return null;
            }
            C26406h m155027e = c32122t9.m155027e();
            boolean z11 = false;
            if (!TextUtils.isEmpty(c32122t9.m155026d()) && !C20551a.m106806a(c32122t9.m155026d())) {
                if (c32122t9.m155024b() == 19) {
                    ToastUtils.m89266n(AbstractC8020f0.str_support_file_video, new Object[0]);
                } else {
                    ToastUtils.m89273u();
                }
                return null;
            }
            String str = "";
            if (c32122t9.m155024b() == 19 && (c32122t9.m155023a() instanceof C17961f1)) {
                ((C17961f1) c32122t9.m155023a()).m95504u();
                if (m155027e != null && m155027e.m136186j() != null && m155027e.m136186j().f91060c == 1003) {
                    c32122t9.m155028f("");
                }
            }
            C17945a0.w wVar = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", c32122t9.m155025c(), CoreUtility.f89233i), c32122t9.m155024b());
            if (c32122t9.m155024b() != 12) {
                str = c32122t9.m155026d();
            }
            C17945a0.w m95379o = wVar.m95382r(str).m95368d(c32122t9.m155023a()).m95386v(1).m95379o(c32122t9.m155026d());
            if (AbstractC19656s0.m103053B(c32122t9.m155024b())) {
                C32094r9 c32094r9 = new C32094r9();
                c32094r9.m154889g0(enumC24194e);
                if (AbstractC3489d.m17501i() && C28989l.m144746p().m144767w()) {
                    z11 = true;
                }
                c32094r9.m154923y0(z11);
                m95379o.m95353E(c32094r9).m95357I(C23793c.m124316k().mo124319c());
            }
            if (m155027e != null) {
                m95379o.m95385u(m155027e.m136186j());
                m95379o.m95384t(m155027e.m136185i());
                m95379o.m95350B(m155027e.m136187k());
                if (m155027e.m136184h() != null && m155027e.m136184h().m137356a()) {
                    m95379o.m95383s(m155027e.m136184h());
                }
                m95379o.m95366b(m155027e.m136180d());
            }
            C17945a0 m95365a = m95379o.m95365a();
            m95365a.m94951M9();
            if (m95365a.m94871D7() && !TextUtils.isEmpty(c32122t9.m155026d())) {
                ((C18009w0) m95365a.m94929K2()).m95753S(c32122t9.m155026d());
                ((C18009w0) m95365a.m94929K2()).m95778m0();
            }
            return m95365a;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: G */
    public static C32027n m118497G(ItemAlbumMobile itemAlbumMobile) {
        if (itemAlbumMobile == null) {
            return null;
        }
        MediaStoreItem mediaStoreItem = itemAlbumMobile.f42598s0;
        if (mediaStoreItem != null) {
            return m118498H(mediaStoreItem);
        }
        if (TextUtils.isEmpty(itemAlbumMobile.f42579d0)) {
            return null;
        }
        return m118541m(itemAlbumMobile.f42579d0, itemAlbumMobile.f42593q, itemAlbumMobile.m40496C(), itemAlbumMobile.f42564O);
    }

    /* renamed from: H */
    public static C32027n m118498H(MediaStoreItem mediaStoreItem) {
        return m118499I(mediaStoreItem.m40599m());
    }

    /* renamed from: I */
    public static C32027n m118499I(C17945a0 c17945a0) {
        if (c17945a0.m94897G5()) {
            return m118543n(c17945a0, c17945a0.m95239r4().f91143e);
        }
        return m118541m(c17945a0.mo95039W2(), c17945a0.m94862C4(), c17945a0.m95029V3(), c17945a0.m94974P4());
    }

    /* renamed from: J */
    public static EnumC26407i m118500J() {
        return f112197a;
    }

    /* renamed from: K */
    public static List m118501K(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() != 0) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                MediaItem mediaItem = (MediaItem) list.get(i11);
                if (mediaItem instanceof VideoItem) {
                    arrayList.add(mediaItem);
                } else if (!TextUtils.isEmpty(mediaItem.mo41081Q()) && m118503M(mediaItem)) {
                    arrayList.add(mediaItem);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: L */
    public static boolean m118502L(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.equals("android.intent.action.VIEW")) {
            return false;
        }
        if (!str2.equals(C31849b1.f146224h) && !str2.equals(C31849b1.f146225i) && !str2.equals(C31849b1.f146226j)) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    private static boolean m118503M(MediaItem mediaItem) {
        String mo41081Q;
        if (mediaItem != null) {
            try {
                if (!TextUtils.isEmpty(mediaItem.m41113N())) {
                    mo41081Q = mediaItem.m41113N();
                } else {
                    mo41081Q = mediaItem.mo41081Q();
                }
                if (TextUtils.isEmpty(mo41081Q) || !AbstractC23041d2.m118194A(mo41081Q)) {
                    return false;
                }
                if (!C20551a.m106806a(mo41081Q)) {
                    return false;
                }
                return true;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: O */
    public static /* synthetic */ int m118505O(C17945a0 c17945a0, C17945a0 c17945a02) {
        return (int) (c17945a0.m94974P4() - c17945a02.m94974P4());
    }

    /* renamed from: P */
    public static /* synthetic */ void m118506P(C3535c c3535c, C17945a0 c17945a0, String str) {
        try {
            C17945a0 m17970x0 = c3535c.m17970x0(c17945a0.m95029V3());
            if (m17970x0 == null) {
                return;
            }
            Conversation m17971y0 = c3535c.m17971y0();
            m17971y0.m40993D(m17970x0.m95089b4());
            m17971y0.m40991B(m17970x0.m95107d3());
            m17970x0.m95016Ta(1);
            C0814e0.m2056b(m17970x0);
            C23744a.m124114c().m124116d(32, str);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: R */
    private static void m118508R(String str, C17945a0 c17945a0, boolean z11, C30912e.c cVar) {
        if (!z11) {
            AbstractC23306f.m120623U0().m101500a(new C30912e.d(str, c17945a0, "chat_forward", cVar));
        }
    }

    /* renamed from: S */
    public static void m118509S(String str, C17945a0 c17945a0, boolean z11, boolean z12, C30912e.c cVar) {
        if (z12 && C26680a.f126349a.m137034l(str)) {
            m118508R(str, c17945a0, z11, cVar);
        }
    }

    /* renamed from: T */
    public static void m118510T(String str, C17945a0 c17945a0, boolean z11, String str2, C26406h c26406h, String str3) {
        if (!ContactProfile.m40346R0(CoreUtility.f89233i) || !ContactProfile.m40346R0(str) || m118568z0(str)) {
            return;
        }
        if (c26406h == null) {
            c26406h = new C26406h();
        }
        if (c17945a0 != null && (c17945a0.m94929K2() instanceof C17993q0)) {
            if (c17945a0.m94876E2() != null) {
                c26406h.m136189m(c17945a0.m94876E2());
            }
            C17945a0.w wVar = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str, CoreUtility.f89233i), 23);
            C17993q0 c17993q0 = (C17993q0) c17945a0.m94929K2();
            wVar.m95363O(c17993q0.f91014s);
            String str4 = c17993q0.f91017v;
            if (!TextUtils.isEmpty(str4)) {
                try {
                    JSONObject jSONObject = new JSONObject(str4);
                    if (z11) {
                        jSONObject.put("tracking", c26406h.m136182f());
                    }
                    jSONObject.put("contentId", str2);
                    c17993q0.f91017v = jSONObject.toString();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            wVar.m95368d(new C17993q0(c17993q0.f91011p, c17993q0.f91012q, c17993q0.f91013r, c17993q0.f91014s, c17993q0.f91015t, c17993q0.f91016u, c17993q0.f91017v));
            if (c17945a0.m95071Z3() != null && c17945a0.m95071Z3().m137356a()) {
                wVar.m95383s(c17945a0.m95071Z3());
            }
            wVar.m95350B(c26406h.m136187k());
            wVar.m95366b(c26406h.m136180d());
            wVar.m95384t(m118539l(c26406h));
            C17945a0 m95365a = wVar.m95365a();
            m95365a.m94951M9();
            AbstractC23306f.m120694n1().m101500a(new C29599o.a(str, m95365a, true, str3));
            C3255n.m16562n().m16575r(new C25809a(c17993q0.mo95597e(), c17993q0.f91014s, c17993q0.f91134B, c17993q0.f91135C, c17993q0.f91136D, str2));
        }
    }

    /* renamed from: U */
    public static void m118511U(String str, String str2, String str3, String str4, int i11, int i12, String str5, String str6, boolean z11, C26406h c26406h, String str7) {
        C26406h c26406h2;
        String str8 = "";
        try {
            if (!ContactProfile.m40346R0(CoreUtility.f89233i) || !ContactProfile.m40346R0(str) || m118568z0(str)) {
                return;
            }
            if (c26406h == null) {
                c26406h2 = new C26406h();
            } else {
                c26406h2 = c26406h;
            }
            C17945a0.w wVar = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str, CoreUtility.f89233i), 23);
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("width", i11);
                    try {
                        jSONObject.put("height", i12);
                        if (z11) {
                            Object m136182f = c26406h2.m136182f();
                            if (m136182f == null) {
                                m136182f = "";
                            }
                            jSONObject.put("tracking", m136182f);
                        }
                        try {
                            jSONObject.put("small", str6);
                            try {
                                jSONObject.put("contentId", str5);
                                str8 = jSONObject.toString();
                            } catch (Exception e11) {
                                e = e11;
                                e.printStackTrace();
                                String str9 = str8;
                                wVar.m95363O(str2);
                                wVar.m95368d(new C17993q0("", 0, str3, str2, "", "", str9));
                                wVar.m95350B(c26406h2.m136187k());
                                wVar.m95366b(c26406h2.m136180d());
                                wVar.m95384t(m118539l(c26406h2));
                                C17945a0 m95365a = wVar.m95365a();
                                m95365a.m94951M9();
                                AbstractC23306f.m120694n1().m101500a(new C29599o.a(str, m95365a, true, str7));
                                C3255n.m16562n().m16575r(new C25809a(str3, str2, i11, i12, str6, str5));
                            }
                        } catch (Exception e12) {
                            e = e12;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        e.printStackTrace();
                        String str92 = str8;
                        wVar.m95363O(str2);
                        wVar.m95368d(new C17993q0("", 0, str3, str2, "", "", str92));
                        wVar.m95350B(c26406h2.m136187k());
                        wVar.m95366b(c26406h2.m136180d());
                        wVar.m95384t(m118539l(c26406h2));
                        C17945a0 m95365a2 = wVar.m95365a();
                        m95365a2.m94951M9();
                        AbstractC23306f.m120694n1().m101500a(new C29599o.a(str, m95365a2, true, str7));
                        C3255n.m16562n().m16575r(new C25809a(str3, str2, i11, i12, str6, str5));
                    }
                } catch (Exception e14) {
                    e = e14;
                    e.printStackTrace();
                    String str922 = str8;
                    wVar.m95363O(str2);
                    wVar.m95368d(new C17993q0("", 0, str3, str2, "", "", str922));
                    wVar.m95350B(c26406h2.m136187k());
                    wVar.m95366b(c26406h2.m136180d());
                    wVar.m95384t(m118539l(c26406h2));
                    C17945a0 m95365a22 = wVar.m95365a();
                    m95365a22.m94951M9();
                    AbstractC23306f.m120694n1().m101500a(new C29599o.a(str, m95365a22, true, str7));
                    C3255n.m16562n().m16575r(new C25809a(str3, str2, i11, i12, str6, str5));
                }
            } catch (Exception e15) {
                e = e15;
            }
            String str9222 = str8;
            wVar.m95363O(str2);
            wVar.m95368d(new C17993q0("", 0, str3, str2, "", "", str9222));
            wVar.m95350B(c26406h2.m136187k());
            wVar.m95366b(c26406h2.m136180d());
            wVar.m95384t(m118539l(c26406h2));
            C17945a0 m95365a222 = wVar.m95365a();
            m95365a222.m94951M9();
            AbstractC23306f.m120694n1().m101500a(new C29599o.a(str, m95365a222, true, str7));
            C3255n.m16562n().m16575r(new C25809a(str3, str2, i11, i12, str6, str5));
        } catch (Exception e16) {
            e16.printStackTrace();
        }
    }

    /* renamed from: V */
    public static void m118512V(String str, C25810b c25810b, C26406h c26406h, String str2) {
        if (c25810b != null) {
            try {
                if (!c25810b.m133086a() || !ContactProfile.m40346R0(CoreUtility.f89233i) || !ContactProfile.m40346R0(str) || m118568z0(str)) {
                    return;
                }
                if (c26406h == null) {
                    c26406h = new C26406h();
                }
                C17979l1 m136186j = c26406h.m136186j();
                if (m136186j == null) {
                    m136186j = new C17979l1();
                }
                m136186j.f91060c = 3;
                String str3 = c25810b.f123105a;
                C18009w0 c18009w0 = new C18009w0("", str3, str3, "", c25810b.f123106b, c25810b.f123107c);
                c18009w0.m95778m0();
                C17945a0.w m95350B = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str, CoreUtility.f89233i), 31).m95382r(c25810b.f123105a).m95368d(c18009w0).m95363O(c25810b.f123105a).m95364P(c25810b.f123105a).m95385u(c26406h.m136186j()).m95383s(c26406h.m136184h()).m95350B(c26406h.m136187k());
                C20612c c20612c = new C20612c(0, 20);
                c20612c.m107276R(c25810b.f123106b);
                c20612c.m107260B(c25810b.f123107c);
                m95350B.m95384t(new C17976k1(c20612c.m107293q()));
                C17945a0 m95365a = m95350B.m95365a();
                m95365a.m94951M9();
                AbstractC23306f.m120694n1().m101500a(new C29599o.a(str, m95365a, true, str2));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x0504 A[Catch: Exception -> 0x0028, TryCatch #1 {Exception -> 0x0028, blocks: (B:3:0x0006, B:5:0x000f, B:7:0x0024, B:8:0x002b, B:10:0x003c, B:12:0x0044, B:14:0x004c, B:16:0x0052, B:18:0x0058, B:19:0x005b, B:22:0x0074, B:25:0x0079, B:27:0x007e, B:29:0x008b, B:32:0x0097, B:34:0x009b, B:35:0x009f, B:37:0x00a5, B:39:0x00be, B:41:0x00c8, B:44:0x00d4, B:47:0x00fe, B:49:0x0105, B:51:0x011a, B:53:0x00e6, B:56:0x00f1, B:61:0x012f, B:63:0x013b, B:65:0x0143, B:67:0x0150, B:68:0x0167, B:70:0x0182, B:75:0x0164, B:76:0x018e, B:77:0x0193, B:78:0x0194, B:80:0x01a9, B:82:0x01c4, B:85:0x01d0, B:87:0x01fa, B:90:0x0206, B:92:0x0217, B:95:0x0223, B:97:0x0235, B:98:0x0260, B:100:0x026a, B:103:0x0244, B:104:0x0276, B:106:0x027a, B:108:0x028c, B:111:0x029a, B:112:0x02c7, B:114:0x02d1, B:117:0x02ab, B:119:0x02b5, B:120:0x02dd, B:122:0x02e1, B:124:0x02fb, B:128:0x0307, B:130:0x030b, B:132:0x0311, B:133:0x0334, B:135:0x033e, B:139:0x034a, B:141:0x0352, B:142:0x0367, B:144:0x036d, B:145:0x0374, B:147:0x037e, B:150:0x0355, B:152:0x0359, B:154:0x035f, B:155:0x038a, B:157:0x039d, B:160:0x03a9, B:162:0x03ad, B:164:0x03b3, B:166:0x03c1, B:168:0x03cf, B:170:0x03e1, B:173:0x03ef, B:175:0x03f7, B:177:0x0403, B:179:0x040f, B:182:0x041d, B:184:0x0439, B:185:0x0440, B:187:0x0458, B:189:0x0462, B:195:0x046e, B:197:0x0474, B:200:0x0483, B:202:0x047f, B:204:0x04a8, B:206:0x04b2, B:208:0x04b8, B:211:0x04c1, B:213:0x04cb, B:215:0x04f3, B:220:0x04ff, B:222:0x0504, B:226:0x04d0, B:228:0x04da, B:230:0x04e0, B:231:0x04e8, B:233:0x04ee, B:237:0x050c, B:239:0x0516, B:241:0x0520, B:243:0x0557, B:248:0x0563, B:250:0x056d, B:252:0x0573, B:253:0x0578, B:254:0x0592, B:256:0x059c, B:259:0x05a8, B:261:0x05b6, B:263:0x05be, B:265:0x05dc, B:266:0x05e9, B:268:0x060b, B:269:0x0610, B:270:0x0611), top: B:2:0x0006, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:? A[RETURN, SYNTHETIC] */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m118513W(String str, C26404f c26404f) {
        boolean z11;
        int i11;
        int i12;
        try {
            C26406h c26406h = new C26406h();
            C32027n c32027n = c26404f.f125443Y;
            if (c32027n != null) {
                c26406h.m136196t(new C17994q1(3, c32027n.m154459M().toString()));
                C26399a c26399a = c26404f.f125461q;
                if (c26399a != null) {
                    c26406h.m136189m(c26399a);
                }
            }
            c26406h.m136197u(c26404f.f125444Z);
            if (c26404f.m136159l() != 19 && c26404f.m136159l() != 14 && c26404f.m136159l() != 21 && c26404f.m136159l() != 17 && c26404f.m136159l() != 16) {
                m118535j(c26404f, c26406h);
            }
            boolean z12 = true;
            String str2 = "";
            switch (c26404f.m136159l()) {
                case 1:
                    String m136149b = c26404f.m136149b();
                    String m136160m = c26404f.m136160m();
                    boolean z13 = c26404f.f125462r;
                    C17945a0 c17945a0 = c26404f.f125452h;
                    if (c17945a0 != null) {
                        if (c17945a0.m94929K2() instanceof C18009w0) {
                            C18009w0 c18009w0 = (C18009w0) c17945a0.m94929K2();
                            C18009w0 c18009w02 = new C18009w0((C18009w0) c26404f.f125452h.m94929K2());
                            c18009w02.f91011p = m136160m;
                            c18009w02.m95746K(false);
                            if (AbstractC23309i.m120937Ff()) {
                                c18009w02.m95767g0(c18009w0.f91014s, c18009w0.mo95598f());
                                c18009w02.f91014s = "";
                                c18009w02.f91013r = "";
                            }
                            c18009w02.m95778m0();
                            c26406h.m136195s(c26404f.m136154g());
                            c26406h.m136193q(c26404f.f125458n);
                            m118491B(str, c26404f.f125452h, c18009w02, z13, c26406h, c26404f.m136150c(), c26404f.m136158k());
                            return;
                        }
                        throw new IllegalArgumentException("invalid original rich content. Must be ChatRichContentPhoto");
                    }
                    c26406h.m136195s(c26404f.m136154g());
                    c26406h.m136193q(c26404f.f125458n);
                    m118524d0(str, m136149b, m136160m, c26404f.f125463s, z13, c26406h, c26404f.m136150c(), c26404f.m136158k());
                    return;
                case 2:
                    String m136155h = c26404f.m136155h();
                    if (!TextUtils.isEmpty(m136155h)) {
                        C17979l1 m136154g = c26404f.m136154g();
                        if (m136154g == null) {
                            m136154g = new C17979l1();
                        }
                        m136154g.f91067j = c26404f.f125453i;
                        c26406h.m136195s(m136154g);
                        c26406h.m136193q(c26404f.f125458n);
                        m118536j0(str, m136155h, c26404f.f125451g, c26406h, c26404f.m136150c(), c26404f.f125454j);
                    }
                    if (TextUtils.isEmpty(c26404f.m136160m())) {
                        return;
                    }
                    m118490A0();
                    m118538k0(str, c26404f.m136160m(), c26406h);
                    return;
                case 3:
                    if (TextUtils.isEmpty(c26404f.m136149b()) || !AbstractC23041d2.m118194A(c26404f.m136149b())) {
                        return;
                    }
                    c26406h.m136195s(c26404f.m136154g());
                    c26406h.m136193q(c26404f.f125458n);
                    c26406h.m136194r(m118539l(c26406h));
                    m118546o0(new C32122t9(str, c26404f.m136149b(), 6, null, c26406h), c26404f.m136150c(), c26404f.m136158k());
                    if (TextUtils.isEmpty(c26404f.m136160m())) {
                        return;
                    }
                    m118490A0();
                    m118538k0(str, c26404f.m136160m(), c26406h);
                    return;
                case 4:
                    C26404f m136148a = c26404f.m136148a();
                    C26405g m136157j = m136148a.m136157j();
                    boolean z14 = m136157j != null && (m136157j.f125488k == 10 || m136157j.f125497t == 11);
                    String m136160m2 = m136148a.m136160m();
                    if (C31944h6.m153557x(m136160m2)) {
                        m136148a.m136172y("");
                    } else {
                        String m153548n = C31944h6.m153548n(m136160m2);
                        if (!m153548n.isEmpty()) {
                            if (!TextUtils.equals(m153548n.replaceFirst("https?://", ""), m136157j != null ? m136157j.f125481d.replaceFirst("https?://", "") : "")) {
                                m136148a.m136172y("");
                            }
                        }
                        z11 = false;
                        if (!TextUtils.isEmpty(m136160m2) || (!z14 && !z11)) {
                            z12 = false;
                        }
                        m118516Z(str, m136148a, c26406h);
                        if (z12) {
                            return;
                        }
                        m118490A0();
                        m118538k0(str, m136160m2, c26406h);
                        return;
                    }
                    z11 = true;
                    if (!TextUtils.isEmpty(m136160m2)) {
                    }
                    z12 = false;
                    m118516Z(str, m136148a, c26406h);
                    if (z12) {
                    }
                    break;
                case 5:
                    C17945a0 c17945a02 = c26404f.f125452h;
                    if (c17945a02 != null && c17945a02.m94929K2() != null && !TextUtils.isEmpty(c26404f.f125452h.m94929K2().f91014s) && !TextUtils.isEmpty(c26404f.f125452h.m94929K2().f91013r)) {
                        int m137115x = AbstractC26689j.m137115x(0);
                        if (c26404f.f125452h.m95170j6() == C31986k3.f147083a.m154108R1(str) || c26404f.f125452h.m95159i5() <= m137115x * 1048576) {
                            if (c26404f.f125452h.m95051X3() == null || (c26404f.f125452h.m95051X3().f91060c != 1000 && c26404f.f125452h.m95051X3().f91060c != 1002 && c26404f.f125452h.m95051X3().f91060c != 1001)) {
                                z12 = false;
                            }
                            c26406h.m136195s(c26404f.f125452h.m95051X3());
                            c26406h.m136193q(c26404f.f125458n);
                            m118495E(str, c26404f.f125452h.m95195m3(), c26404f.f125452h.m94929K2(), !z12 ? c26404f.m136160m() : "", false, c26406h, c26404f.m136150c(), c26404f.f125452h.m95132f6(), c26404f.m136158k());
                            if (!z12 || TextUtils.isEmpty(c26404f.m136160m())) {
                                return;
                            }
                            m118490A0();
                            m118538k0(str, c26404f.m136160m(), c26406h);
                            return;
                        }
                        return;
                    }
                    if (c26404f.m136161n() != null) {
                        C27373c m136161n = c26404f.m136161n();
                        if (c26404f.m136160m() != null) {
                            str2 = c26404f.m136160m();
                        }
                        m136161n.m140225J(str2);
                        c26406h.m136195s(c26404f.m136154g());
                        c26406h.m136193q(c26404f.f125458n);
                        m118564x0(str, c26404f.m136161n(), c26404f.f125462r, c26406h, c26404f.m136150c(), c26404f.m136158k());
                        return;
                    }
                    return;
                case 6:
                    m118550q0(str, c26404f.f125452h, c26406h, c26404f.m136150c());
                    if (TextUtils.isEmpty(c26404f.m136160m())) {
                        return;
                    }
                    m118490A0();
                    m118538k0(str, c26404f.m136160m(), c26406h);
                    return;
                case 7:
                    if (!TextUtils.isEmpty(c26404f.f125424F)) {
                        str2 = c26404f.f125424F;
                    } else {
                        C17945a0 c17945a03 = c26404f.f125452h;
                        if (c17945a03 != null && c17945a03.m94929K2() != null) {
                            str2 = c26404f.f125452h.m94929K2().f91017v;
                        }
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        m118560v0(str, str2, c26406h, c26404f.m136150c());
                    }
                    if (TextUtils.isEmpty(c26404f.m136160m())) {
                        return;
                    }
                    m118490A0();
                    m118538k0(str, c26404f.m136160m(), c26406h);
                    return;
                case 8:
                    C25630b c25630b = c26404f.f125464t;
                    if (c25630b != null) {
                        if (c25630b.m132400H()) {
                            c26406h.m136195s(c26404f.m136154g());
                            c26406h.m136193q(c26404f.f125458n);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("source", 2);
                            jSONObject.put("keyword", "");
                            c26406h.m136191o(jSONObject);
                            m118530g0(str, c26404f.f125464t, c26406h, c26404f.m136150c());
                        }
                        if (TextUtils.isEmpty(c26404f.m136160m())) {
                            return;
                        }
                        m118490A0();
                        m118538k0(str, c26404f.m136160m(), c26406h);
                        return;
                    }
                    return;
                case 9:
                    if (c26404f.f125456l != null) {
                        c26406h.m136193q(c26404f.f125458n);
                        m118548p0(str, c26404f.f125456l, c26404f.f125435Q, c26406h, c26404f.m136150c());
                        if (TextUtils.isEmpty(c26404f.m136160m())) {
                            return;
                        }
                        m118490A0();
                        m118538k0(str, c26404f.m136160m(), c26406h);
                        return;
                    }
                    return;
                case 10:
                    if (c26404f.f125452h != null) {
                        int m121231Nd = AbstractC23309i.m121231Nd();
                        if (c26404f.f125452h.m95170j6() != C31986k3.f147083a.m154105P1(str) && c26404f.f125452h.m95238r3() > m121231Nd * 1048576) {
                            return;
                        } else {
                            m118552r0(str, c26404f.f125452h, c26404f.f125429K, c26406h, c26404f.m136150c(), c26404f.f125439U);
                        }
                    } else if (!TextUtils.isEmpty(c26404f.m136149b())) {
                        m118554s0(str, c26404f.m136149b(), c26404f.f125429K, c26406h, c26404f.m136150c(), c26404f.f125439U);
                    }
                    if (TextUtils.isEmpty(c26404f.m136160m())) {
                        return;
                    }
                    m118490A0();
                    m118538k0(str, c26404f.m136160m(), c26406h);
                    return;
                case 11:
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("source", 8);
                    jSONObject2.put("keyword", "");
                    c26406h.m136191o(jSONObject2);
                    C17945a0 c17945a04 = c26404f.f125452h;
                    if (c17945a04 != null) {
                        m118510T(str, c17945a04, c26404f.f125428J, c26404f.f125470z, c26406h, c26404f.m136150c());
                    } else {
                        m118511U(str, c26404f.f125465u, c26404f.f125466v, c26404f.m136149b(), c26404f.f125467w, c26404f.f125468x, c26404f.f125470z, c26404f.f125469y, c26404f.f125428J, c26406h, c26404f.m136150c());
                    }
                    if (TextUtils.isEmpty(c26404f.m136160m())) {
                        return;
                    }
                    m118490A0();
                    m118538k0(str, c26404f.m136160m(), c26406h);
                    return;
                case 12:
                    m118556t0(str, c26404f, c26406h, c26404f.m136150c());
                    if (TextUtils.isEmpty(c26404f.m136160m())) {
                        return;
                    }
                    m118490A0();
                    m118538k0(str, c26404f.m136160m(), c26406h);
                    return;
                case 13:
                    String m136149b2 = c26404f.m136149b();
                    String m136160m3 = c26404f.m136160m();
                    c26406h.m136195s(c26404f.m136154g());
                    c26406h.m136193q(c26404f.f125458n);
                    m118514X(str, m136149b2, m136160m3, c26404f.f125451g, c26406h, c26404f.m136150c());
                    if (TextUtils.isEmpty(c26404f.m136160m())) {
                        return;
                    }
                    m118490A0();
                    m118538k0(str, c26404f.m136160m(), c26406h);
                    return;
                case 14:
                    m118561w(str, c26404f.m136152e(), c26404f.f125460p, 4, 5, c26404f.m136150c());
                    if (TextUtils.isEmpty(c26404f.m136160m())) {
                        return;
                    }
                    m118490A0();
                    m118538k0(str, c26404f.m136160m(), c26406h);
                    return;
                case 15:
                    String m136149b3 = c26404f.m136149b();
                    String m136160m4 = c26404f.m136160m();
                    C17945a0 c17945a05 = c26404f.f125452h;
                    if (c17945a05 != null) {
                        if (c17945a05.m94929K2() instanceof C18009w0) {
                            C18009w0 c18009w03 = new C18009w0((C18009w0) c26404f.f125452h.m94929K2());
                            try {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("source", 2);
                                jSONObject3.put("keyword", "");
                                c18009w03.m95766f0(jSONObject3.toString());
                            } catch (JSONException e11) {
                                AbstractC23350e.m122778h(e11);
                            }
                            c18009w03.f91011p = "";
                            c18009w03.m95778m0();
                            c26406h.m136195s(c26404f.m136154g());
                            m118493C(str, c26404f.f125452h, c18009w03, c26406h, c26404f.m136150c());
                            if (TextUtils.isEmpty(m136160m4)) {
                                return;
                            }
                            m118490A0();
                            m118538k0(str, c26404f.m136160m(), c26406h);
                            return;
                        }
                        throw new IllegalArgumentException("invalid original rich content. Must be ChatRichContentPhoto");
                    }
                    c26406h.m136195s(c26404f.m136154g());
                    c26406h.m136193q(c26404f.f125458n);
                    m118526e0(str, m136149b3, m136160m4, c26406h, c26404f.m136150c());
                    return;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    ArrayList arrayList = new ArrayList();
                    if (c26404f.f125433O) {
                        i11 = 34;
                        i12 = 35;
                    } else if (c26404f.f125432N) {
                        i11 = 8;
                        i12 = 9;
                    } else {
                        int i13 = c26404f.f125429K;
                        i11 = i13 == 55 ? i13 : 16;
                        i12 = 17;
                    }
                    arrayList.add(str);
                    if (c26404f.f125432N) {
                        m118563x(arrayList, c26404f.m136153f(), c26404f.m136160m(), i11, i12, c26404f.m136150c(), c26404f.m136158k());
                        return;
                    } else {
                        m118542m0(arrayList, c26404f.m136153f(), c26404f.m136160m(), i11, i12, c26404f.m136150c(), c26404f.m136158k());
                        return;
                    }
                case 17:
                    List list = c26404f.f125442X;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            m118554s0(str, (String) it.next(), c26404f.f125429K, c26406h, c26404f.m136150c(), c26404f.f125439U);
                            m118490A0();
                        }
                    }
                    if (TextUtils.isEmpty(c26404f.m136160m())) {
                        return;
                    }
                    m118490A0();
                    m118532h0(str, c26404f.m136160m());
                    return;
                case 18:
                default:
                    return;
                case 19:
                    m118489A(str, c26404f);
                    if (TextUtils.isEmpty(c26404f.m136160m())) {
                        return;
                    }
                    m118490A0();
                    m118538k0(str, c26404f.m136160m(), c26406h);
                    return;
                case 20:
                    m118558u0(str, c26404f, c26406h);
                    return;
                case 21:
                    m118544n0(str, c26404f, c26406h);
                    return;
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        e12.printStackTrace();
    }

    /* renamed from: X */
    public static void m118514X(String str, String str2, String str3, C17969i0 c17969i0, C26406h c26406h, String str4) {
        if (c26406h == null) {
            try {
                c26406h = new C26406h();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        C26406h c26406h2 = c26406h;
        c26406h2.m136194r(m118539l(c26406h2));
        if (!TextUtils.isEmpty(str2) && AbstractC23041d2.m118194A(str2)) {
            if (C20551a.m106806a(str2)) {
                m118546o0(new C32122t9(str, str2, 2, c17969i0, c26406h2), str4, null);
            } else {
                ToastUtils.m89273u();
            }
        }
    }

    /* renamed from: Y */
    public static void m118515Y(ContactProfile contactProfile, C18013y0 c18013y0, C26406h c26406h, String str) {
        String str2;
        if (c18013y0 == null || contactProfile == null || !ContactProfile.m40346R0(CoreUtility.f89233i) || !ContactProfile.m40346R0(contactProfile.f42434r) || m118568z0(contactProfile.f42434r)) {
            return;
        }
        if (c26406h != null) {
            c26406h.m136194r(m118539l(c26406h));
        }
        String str3 = contactProfile.f42434r;
        C32098s c32098s = c18013y0.f91251B;
        if (c32098s != null) {
            str2 = c32098s.m154934d();
        } else {
            str2 = "";
        }
        m118546o0(new C32122t9(str3, str2, 12, c18013y0, c26406h), str, null);
    }

    /* renamed from: Z */
    public static void m118516Z(String str, C26404f c26404f, C26406h c26406h) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        C26404f c26404f2;
        C26713e c26713e;
        C26406h c26406h2;
        C17976k1 c17976k1;
        if (c26404f != null) {
            try {
                if (c26404f.m136157j() == null || !ContactProfile.m40346R0(CoreUtility.f89233i) || !ContactProfile.m40346R0(str) || m118568z0(str)) {
                    return;
                }
                C26405g m136157j = c26404f.m136157j();
                String m136160m = c26404f.m136160m();
                String str12 = m136157j.f125480c;
                if (str12 == null) {
                    str2 = "";
                } else {
                    str2 = str12;
                }
                String str13 = m136157j.f125481d;
                if (str13 == null) {
                    str3 = "";
                } else {
                    str3 = str13;
                }
                String str14 = m136157j.f125479b;
                if (str14 == null) {
                    str4 = "";
                } else {
                    str4 = str14;
                }
                String str15 = m136157j.f125482e;
                if (str15 == null) {
                    str5 = "";
                } else {
                    str5 = str15;
                }
                String str16 = m136157j.f125484g;
                if (str16 == null) {
                    str6 = "";
                } else {
                    str6 = str16;
                }
                int i11 = m136157j.f125488k;
                String str17 = m136157j.f125487j;
                if (str17 == null) {
                    str7 = "";
                } else {
                    str7 = str17;
                }
                String str18 = m136157j.f125485h;
                if (str18 == null) {
                    str8 = "";
                } else {
                    str8 = str18;
                }
                String str19 = m136157j.f125486i;
                String str20 = m136157j.f125483f;
                if (str20 == null) {
                    str9 = "";
                } else {
                    str9 = str20;
                }
                String str21 = m136157j.f125489l;
                if (str21 == null) {
                    str10 = "";
                } else {
                    str10 = str21;
                }
                String str22 = m136157j.f125490m;
                if (str22 == null) {
                    str11 = "";
                } else {
                    str11 = str22;
                }
                String str23 = m136157j.f125499v;
                C32107s8 c32107s8 = m136157j.f125498u;
                int i12 = m136157j.f125503z;
                String str24 = str2;
                long j11 = m136157j.f125500w;
                C32121t8 c32121t8 = m136157j.f125501x;
                C23307g c23307g = m136157j.f125502y;
                int i13 = m136157j.f125497t;
                int i14 = m136157j.f125492o;
                int i15 = m136157j.f125493p;
                int i16 = m136157j.f125494q;
                String str25 = m136157j.f125495r;
                String str26 = m136157j.f125496s;
                String str27 = str11;
                C18013y0 c18013y0 = new C18013y0(m136160m, 0, str24, str3, str4, "recommened.link", "");
                C32098s c32098s = new C32098s(str27, str5, str6, str7, i11, i13, str8, str9, str10, i14, i15, i16, str25, str26);
                c18013y0.f91251B = c32098s;
                c32098s.m154949u(m136157j.f125476F);
                c18013y0.f91251B.m154947s(m136157j.f125477G);
                C32098s c32098s2 = c18013y0.f91251B;
                c32098s2.f147963m = str23;
                c32098s2.f147962l = c32107s8;
                c32098s2.f147964n = j11;
                c32098s2.f147958h = str19;
                c32098s2.f147967q = i12;
                c32098s2.f147951a = str27;
                c32098s2.f147969s = str3;
                c32098s2.f147965o = c32121t8;
                c32098s2.f147966p = c23307g;
                C26713e c26713e2 = m136157j.f125491n;
                if (c26713e2 != null) {
                    c26713e = c26713e2;
                    c26404f2 = c26404f;
                } else {
                    c26404f2 = c26404f;
                    c26713e = c26404f2.f125458n;
                }
                c32098s2.f147968r = c26713e;
                c32098s2.f147975y = m136157j.f125471A;
                c32098s2.m154948t(m136157j.f125472B);
                c18013y0.f91251B.m154946r(m136157j.f125473C);
                c18013y0.f91251B.m154945q(m136157j.f125474D);
                if (c18013y0.f91251B.m154942l()) {
                    c18013y0.f91011p = "";
                }
                if (!TextUtils.isEmpty(str3)) {
                    String m106804a = AbstractC20550a.m106804a(str3);
                    if (!TextUtils.isEmpty(m106804a)) {
                        c18013y0.f91251B.f147961k = m106804a;
                    }
                }
                c18013y0.f91017v = c18013y0.f91251B.m154935e();
                if (c26406h == null) {
                    c26406h2 = new C26406h();
                } else {
                    c26406h2 = c26406h;
                }
                if (c18013y0.f91251B.m154940j()) {
                    c17976k1 = AbstractC9183a.m49002j(c18013y0.f91014s, str);
                } else {
                    c17976k1 = null;
                }
                C17976k1 m118527f = m118527f(c17976k1, c26406h2);
                c26406h2.m136195s(c26404f.m136154g());
                c26406h2.m136193q(c26404f2.f125458n);
                c26406h2.m136194r(m118527f);
                m118546o0(new C32122t9(str, c18013y0.f91251B.m154934d(), 12, c18013y0, c26406h2), c26404f.m136150c(), c26404f.m136158k());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: a0 */
    public static void m118518a0(String str, String str2, String str3) {
        try {
            if (str2.trim().equals("") || !ContactProfile.m40346R0(CoreUtility.f89233i) || !ContactProfile.m40346R0(str) || TextUtils.isEmpty(str3)) {
                return;
            }
            C17945a0 m95365a = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str, CoreUtility.f89233i), 41).m95382r(str2).m95386v(1).m95358J(str3).m95365a();
            m95365a.m94951M9();
            C3535c m2640w = AbstractC23306f.m120584H0().m2640w("livestream_" + str3);
            m2640w.m17963o0(m95365a);
            C23288a.f113033a.mo13474a(new C18427b(m2640w.m17944I0(), 5, new Runnable() { // from class: me0.h7

                /* renamed from: q */
                public final /* synthetic */ C17945a0 f112151q;

                /* renamed from: r */
                public final /* synthetic */ String f112152r;

                public /* synthetic */ RunnableC23090h7(C17945a0 m95365a2, String str32) {
                    r2 = m95365a2;
                    r3 = str32;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC23112j7.m118506P(C3535c.this, r2, r3);
                }
            }));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b0 */
    public static C17945a0 m118520b0(List list, String str, boolean z11, String str2, int i11, int i12, String str3) {
        C17976k1 c17976k1;
        int i13;
        try {
            if (!TextUtils.isEmpty(str) && AbstractC23041d2.m118194A(str)) {
                if (C20551a.m106806a(str)) {
                    C23307g m118367a = AbstractC23067f6.m118367a(str);
                    if (list.size() > 0) {
                        String str4 = (String) list.get(0);
                        C18009w0 c18009w0 = new C18009w0(m118367a.f113474a, m118367a.f113475b);
                        c18009w0.m95773j0(null);
                        c18009w0.m95778m0();
                        if (!TextUtils.isEmpty(str2)) {
                            c17976k1 = new C17976k1(str2);
                        } else {
                            C20612c c20612c = new C20612c(i11, i12, C20620k.m107330a().m107370u(m118367a.f113474a).m107356g(m118367a.f113475b).m107357h(m118367a.f113476c).m107358i(m118367a.f113477d).m107352c(m118367a.f113478e).m107363n(str).m107355f(m118367a.f113481h).m107360k(AbstractC23009a3.m117960k(str)).m107350a());
                            c20612c.m107266H(z11);
                            c17976k1 = new C17976k1(c20612c.m107293q());
                        }
                        C26406h c26406h = new C26406h();
                        c26406h.m136194r(c17976k1);
                        if (z11) {
                            i13 = 4;
                        } else {
                            i13 = 3;
                        }
                        C17945a0 m118546o0 = m118546o0(new C32122t9(str4, str, i13, c18009w0, c26406h), str3, C32094r9.m154848q(C31986k3.f147083a.m154105P1(str4)));
                        m118492B0(20L);
                        return m118546o0;
                    }
                } else {
                    ToastUtils.m89273u();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return null;
    }

    /* renamed from: c0 */
    public static void m118522c0(String str, String str2, String str3, String str4, boolean z11, String str5, String str6, long j11, EnumC24194e enumC24194e) {
        String str7;
        int i11;
        try {
            C26406h c26406h = new C26406h();
            if (!TextUtils.isEmpty(str2) && AbstractC23041d2.m118194A(str2)) {
                if (C20551a.m106806a(str2)) {
                    C23307g m118367a = AbstractC23067f6.m118367a(str2);
                    C18009w0 c18009w0 = new C18009w0(str3, str4, str4, "", m118367a.f113474a, m118367a.f113475b);
                    c18009w0.f91239d0 = C23793c.m124316k().mo124319c() - j11;
                    if (AbstractC23309i.m120937Ff() && !TextUtils.isEmpty(str4)) {
                        c18009w0.m95767g0(str4, str4);
                        c18009w0.f91014s = "";
                        c18009w0.f91013r = "";
                    }
                    c18009w0.m95778m0();
                    if (TextUtils.isEmpty(str5)) {
                        C20612c c20612c = new C20612c(0, 1, C20620k.m107330a().m107370u(m118367a.f113474a).m107356g(m118367a.f113475b).m107357h(m118367a.f113476c).m107358i(m118367a.f113477d).m107352c(m118367a.f113478e).m107363n(str2).m107355f(m118367a.f113481h).m107360k(AbstractC23009a3.m117960k(str2)).m107350a());
                        c20612c.m107266H(z11);
                        str7 = c20612c.m107293q();
                    } else {
                        str7 = str5;
                    }
                    c26406h.m136194r(new C17976k1(str7));
                    if (z11) {
                        i11 = 4;
                    } else {
                        i11 = 3;
                    }
                    m118546o0(new C32122t9(str, str2, i11, c18009w0, c26406h), str6, enumC24194e);
                    return;
                }
                ToastUtils.m89273u();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d0 */
    public static void m118524d0(String str, String str2, String str3, String str4, boolean z11, C26406h c26406h, String str5, EnumC24194e enumC24194e) {
        C26406h c26406h2;
        C17976k1 c17976k1;
        int i11;
        if (c26406h == null) {
            try {
                c26406h2 = new C26406h();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        } else {
            c26406h2 = c26406h;
        }
        if (!TextUtils.isEmpty(str2) && AbstractC23041d2.m118194A(str2)) {
            if (C20551a.m106806a(str2)) {
                C23307g m118367a = AbstractC23067f6.m118367a(str2);
                C18009w0 c18009w0 = new C18009w0(str3, str4, str4, "", m118367a.f113474a, m118367a.f113475b);
                if (AbstractC23309i.m120937Ff() && !TextUtils.isEmpty(str4)) {
                    c18009w0.m95767g0(str4, str4);
                    c18009w0.f91014s = "";
                    c18009w0.f91013r = "";
                }
                c18009w0.m95778m0();
                if (c26406h2.m136181e() != null) {
                    c26406h2.m136181e().m107264F(C20620k.m107330a().m107370u(m118367a.f113474a).m107356g(m118367a.f113475b).m107357h(m118367a.f113476c).m107358i(m118367a.f113477d).m107352c(m118367a.f113478e).m107363n(str2).m107355f(m118367a.f113481h).m107360k(AbstractC23009a3.m117960k(str2)).m107350a());
                    c17976k1 = new C17976k1(c26406h2.m136181e().m107293q());
                } else {
                    c17976k1 = null;
                }
                c26406h2.m136194r(c17976k1);
                if (z11) {
                    i11 = 4;
                } else {
                    i11 = 3;
                }
                m118546o0(new C32122t9(str, str2, i11, c18009w0, c26406h2), str5, enumC24194e);
                return;
            }
            ToastUtils.m89273u();
        }
    }

    /* renamed from: e0 */
    public static void m118526e0(String str, String str2, String str3, C26406h c26406h, String str4) {
        C26406h c26406h2;
        C17976k1 c17976k1;
        if (c26406h == null) {
            try {
                c26406h2 = new C26406h();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        } else {
            c26406h2 = c26406h;
        }
        if (!TextUtils.isEmpty(str2) && AbstractC23041d2.m118194A(str2)) {
            if (C20551a.m106806a(str2)) {
                C23307g m118367a = AbstractC23067f6.m118367a(str2);
                C18009w0 c18009w0 = new C18009w0(str3, "", "", "", m118367a.f113474a, m118367a.f113475b);
                c18009w0.m95778m0();
                if (c26406h2.m136181e() != null) {
                    c26406h2.m136181e().m107264F(C20620k.m107330a().m107370u(m118367a.f113474a).m107356g(m118367a.f113475b).m107363n(str2).m107350a());
                    c17976k1 = new C17976k1(c26406h2.m136181e().m107293q());
                } else {
                    c17976k1 = null;
                }
                C17979l1 m136186j = c26406h2.m136186j();
                if (m136186j == null) {
                    m136186j = new C17979l1();
                }
                m136186j.f91060c = 3;
                c26406h2.m136195s(m136186j);
                c26406h2.m136194r(c17976k1);
                m118546o0(new C32122t9(str, str2, 31, c18009w0, c26406h2), str4, null);
                return;
            }
            ToastUtils.m89273u();
        }
    }

    /* renamed from: f */
    private static C17976k1 m118527f(C17976k1 c17976k1, C26406h c26406h) {
        JSONObject jSONObject;
        C20612c m136181e = c26406h.m136181e();
        if (c17976k1 == null && m136181e == null) {
            return null;
        }
        if (c17976k1 != null) {
            try {
                jSONObject = new JSONObject(c17976k1.f91049c);
            } catch (JSONException e11) {
                AbstractC20110a.m104539h(e11);
                return c17976k1;
            }
        } else {
            jSONObject = new JSONObject();
        }
        if (m136181e != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(m136181e.m107293q());
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject2.get(next));
                }
            } catch (JSONException e12) {
                AbstractC20110a.m104539h(e12);
            }
        }
        if (jSONObject.length() == 0) {
            return null;
        }
        return new C17976k1(jSONObject.toString());
    }

    /* renamed from: f0 */
    public static void m118528f0(String str, C29058f c29058f, String str2, C26406h c26406h, String str3) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (c26406h == null) {
                c26406h = new C26406h();
            }
            C25810b m145130b = c29058f.m145130b();
            String str4 = m145130b.f123105a;
            C18009w0 c18009w0 = new C18009w0(str2, str4, str4, "", m145130b.f123106b, m145130b.f123107c);
            c18009w0.m95778m0();
            new C17979l1().f91060c = 3;
            C17945a0.w m95350B = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str, CoreUtility.f89233i), 31).m95382r(m145130b.f123105a).m95368d(c18009w0).m95363O(m145130b.f123105a).m95364P(m145130b.f123105a).m95385u(c26406h.m136186j()).m95383s(c26406h.m136184h()).m95350B(c26406h.m136187k());
            C20620k m107350a = C20620k.m107330a().m107370u(m145130b.f123106b).m107356g(m145130b.f123107c).m107350a();
            C20612c m136181e = c26406h.m136181e();
            if (m136181e == null) {
                m136181e = new C20612c(-1, 8, m107350a);
            }
            m95350B.m95384t(new C17976k1(m136181e.m107293q()));
            C17945a0 m95365a = m95350B.m95365a();
            m95365a.m94951M9();
            AbstractC23306f.m120694n1().m101500a(new C29599o.a(str, m95365a, true, str3));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    private static void m118529g(C32027n c32027n, String str, String str2, MessageId messageId, long j11) {
        long parseLong;
        int i11;
        long j12;
        long j13;
        boolean m132079d = AbstractC25495a.m132079d(str);
        if (m132079d) {
            parseLong = Long.parseLong(AbstractC25495a.m132088m(str));
        } else {
            parseLong = Long.parseLong(str);
        }
        int i12 = 0;
        int i13 = 0;
        i12 = 0;
        if (m132079d) {
            C31973j5 m4473g = C0943w.m4462l().m4473g(str);
            if (m4473g != null) {
                i13 = m4473g.m153745W();
            }
            i11 = 6;
            i12 = i13;
        } else if (!AbstractC25495a.m132078c(str) && AbstractC21935u.m114519I(str)) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        c32027n.m154454H(parseLong);
        c32027n.m154455I(i11);
        c32027n.m154481v(i12);
        ContactProfile m141809c = C28203u6.f131407a.m141809c(str2);
        if (m141809c != null) {
            j12 = Long.parseLong(m141809c.f42434r);
        } else {
            j12 = 0;
        }
        c32027n.m154453G(j12);
        String str3 = CoreUtility.f89233i;
        if (!TextUtils.isEmpty(str3)) {
            j13 = Long.parseLong(str3);
        } else {
            j13 = 0;
        }
        if (i11 == 3 && !AbstractC25495a.m132078c(str) && j12 != 0 && j13 != 0 && j12 != j13) {
            parseLong = j13;
        }
        c32027n.m154456J(parseLong);
        if (messageId != null) {
            c32027n.m154480u(messageId.m41045i());
            c32027n.m154483x(messageId.m41047k());
        }
        c32027n.m154458L(j11);
        EnumC26407i enumC26407i = f112197a;
        if (enumC26407i != null) {
            c32027n.m154457K(enumC26407i);
        }
    }

    /* renamed from: g0 */
    public static void m118530g0(String str, C25630b c25630b, C26406h c26406h, String str2) {
        int i11;
        String str3;
        if (c25630b != null) {
            try {
                if (!c25630b.m132400H() || !ContactProfile.m40346R0(CoreUtility.f89233i) || !ContactProfile.m40346R0(str) || m118568z0(str)) {
                    return;
                }
                if (c26406h == null) {
                    c26406h = new C26406h();
                }
                C17945a0 m94704Q1 = C17945a0.m94704Q1(c25630b, null, str);
                m94704Q1.m94989Qa(c26406h.m136186j());
                C32024mb m95400j = ((C17949b1) m94704Q1.m94929K2()).m95400j();
                if (c26406h.m136182f() != null) {
                    i11 = c26406h.m136182f().optInt("source");
                } else {
                    i11 = -1;
                }
                m95400j.m154415u(i11);
                if (c26406h.m136182f() != null) {
                    str3 = c26406h.m136182f().optString("keyword");
                } else {
                    str3 = "";
                }
                m95400j.m154414t(str3);
                C26713e m136184h = c26406h.m136184h();
                if (m136184h != null && m136184h.m137356a()) {
                    m94704Q1.m95008Sa(m136184h);
                }
                m94704Q1.m95103cb(c26406h.m136187k());
                AbstractC23306f.m120644b().m101509a(new C29585a.a(m94704Q1));
                m94704Q1.m95145ga(c26406h.m136180d());
                m94704Q1.m94979Pa(m118539l(c26406h));
                AbstractC23306f.m120694n1().m101500a(new C29599o.a(str, m94704Q1, true, str2));
                if (!c25630b.m132398F()) {
                    C3255n.m16562n().m16578v(c25630b);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: h */
    public static void m118531h(C26399a c26399a) {
        f112200d.put(c26399a.m136119b(), c26399a);
    }

    /* renamed from: h0 */
    public static C17945a0 m118532h0(String str, String str2) {
        return m118536j0(str, str2, null, null, "chat_send", false);
    }

    /* renamed from: i */
    private static void m118533i(C17945a0 c17945a0, C26406h c26406h, int i11, int i12) {
        C20612c c20612c;
        boolean z11;
        if (c17945a0.m94871D7()) {
            c20612c = new C20612c(0, i11);
            if (c17945a0.m95041W4() == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            c20612c.m107266H(z11);
        } else if (c17945a0.m95306y8()) {
            C20612c c20612c2 = new C20612c(0, i12);
            c20612c2.m107273O(c17945a0.m94870D6());
            c20612c = c20612c2;
        } else {
            c20612c = null;
        }
        C17994q1 m136187k = c26406h.m136187k();
        if (m136187k != null && m136187k.f91143e != null) {
            if (c20612c == null) {
                c20612c = new C20612c(0, -1);
            }
            m118537k(c20612c, m136187k.f91143e);
        }
        c26406h.m136190n(c20612c);
    }

    /* renamed from: i0 */
    public static C17945a0 m118534i0(String str, String str2, C17969i0 c17969i0, C26406h c26406h, String str3) {
        return m118536j0(str, str2, c17969i0, c26406h, str3, false);
    }

    /* renamed from: j */
    private static void m118535j(C26404f c26404f, C26406h c26406h) {
        C20612c m118549q;
        int m136159l = c26404f.m136159l();
        if (m136159l != 1) {
            if (m136159l != 5) {
                if (m136159l != 15) {
                    m118549q = null;
                } else {
                    m118549q = m118551r(c26404f);
                }
            } else {
                m118549q = m118553s(c26404f);
            }
        } else {
            m118549q = m118549q(c26404f);
        }
        C17994q1 m136187k = c26406h.m136187k();
        if (m136187k != null && m136187k.f91143e != null) {
            if (m118549q == null) {
                m118549q = new C20612c(0, c26404f.f125429K);
            }
            m118537k(m118549q, m136187k.f91143e);
        }
        c26406h.m136190n(m118549q);
    }

    /* renamed from: j0 */
    public static C17945a0 m118536j0(String str, String str2, C17969i0 c17969i0, C26406h c26406h, String str3, boolean z11) {
        boolean z12;
        try {
            if (str2.trim().equals("") || !ContactProfile.m40346R0(CoreUtility.f89233i) || !ContactProfile.m40346R0(str) || m118568z0(str)) {
                return null;
            }
            if (c26406h == null) {
                c26406h = new C26406h();
            }
            if (c17969i0 == null) {
                c17969i0 = new C17969i0();
            }
            boolean z13 = false;
            C17945a0 m95365a = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str, CoreUtility.f89233i), 0).m95382r(str2).m95381q(c26406h.m136183g()).m95385u(c26406h.m136186j()).m95350B(c26406h.m136187k()).m95384t(m118539l(c26406h)).m95368d(c17969i0).m95365a();
            m95365a.m94951M9();
            boolean m121258O3 = AbstractC23309i.m121258O3();
            int m121939gc = AbstractC23309i.m121939gc();
            if (m121258O3 && m121939gc != 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean m121221N3 = AbstractC23309i.m121221N3();
            int m121901fc = AbstractC23309i.m121901fc();
            if (m121221N3 && m121901fc != 1) {
                z13 = true;
            }
            if (z12 || z13) {
                m95365a.m95078a2(z12, z13);
            }
            C26713e m136184h = c26406h.m136184h();
            if (m136184h != null && m136184h.m137356a()) {
                m95365a.m95008Sa(m136184h);
            }
            AbstractC23306f.m120644b().m101509a(new C29585a.a(m95365a));
            boolean m136188l = c26406h.m136188l();
            m95365a.m95145ga(c26406h.m136180d());
            m118509S(str, m95365a, m136188l, z11, C30912e.c.b.f142556a);
            AbstractC23306f.m120694n1().m101501b(new C29599o.a(str, m95365a, true, str3), new a(str, m95365a, m136188l, z11));
            return m95365a;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: k */
    private static void m118537k(C20612c c20612c, C32027n c32027n) {
        try {
            c20612c.m107259A(new C20618i(new C20617h(m118547p(c32027n.m154474o(), c32027n.m154477r(), c32027n.m154473n()), c32027n.m154476q(), "" + c32027n.m154472m() + c32027n.m154460a() + c32027n.m154475p()), new C20617h(m118547p(c32027n.m154469j(), c32027n.m154466g(), c32027n.m154468i()), c32027n.m154471l(), "" + c32027n.m154467h() + c32027n.m154464e() + c32027n.m154470k()), c32027n.m154461b()));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: k0 */
    public static void m118538k0(String str, String str2, C26406h c26406h) {
        m118534i0(str, str2, null, c26406h, "chat_send");
    }

    /* renamed from: l */
    private static C17976k1 m118539l(C26406h c26406h) {
        JSONObject jSONObject;
        C17976k1 m136185i = c26406h.m136185i();
        C20612c m136181e = c26406h.m136181e();
        if (m136185i == null && m136181e == null) {
            return null;
        }
        if (m136185i != null) {
            try {
                jSONObject = new JSONObject(m136185i.f91049c);
            } catch (JSONException e11) {
                AbstractC20110a.m104539h(e11);
                return m136185i;
            }
        } else {
            jSONObject = new JSONObject();
        }
        if (m136181e != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(m136181e.m107293q());
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject2.get(next));
                }
            } catch (JSONException e12) {
                AbstractC20110a.m104539h(e12);
            }
        }
        if (jSONObject.length() == 0) {
            return null;
        }
        return new C17976k1(jSONObject.toString());
    }

    /* renamed from: l0 */
    public static void m118540l0(String str, String str2, C3020p0 c3020p0) {
        C17994q1 c17994q1;
        if (c3020p0 != null) {
            try {
                C3000l0 c3000l0 = new C3000l0();
                c3000l0.f11899s.add(0, c3020p0);
                JSONObject m108827p = AbstractC20826v0.m108827p(c3000l0);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("feed", m108827p);
                c17994q1 = new C17994q1(0, jSONObject.toString());
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            m118538k0(str, str2, C26406h.m136179c(c17994q1));
        }
        c17994q1 = null;
        m118538k0(str, str2, C26406h.m136179c(c17994q1));
    }

    /* renamed from: m */
    private static C32027n m118541m(String str, String str2, MessageId messageId, long j11) {
        C32027n c32027n = new C32027n();
        try {
            m118529g(c32027n, str, str2, messageId, j11);
            c32027n.m154449C(c32027n.m154473n());
            c32027n.m154450D(c32027n.m154474o());
            c32027n.m154447A(c32027n.m154477r());
            c32027n.m154448B(c32027n.m154472m());
            c32027n.m154484y(c32027n.m154460a());
            c32027n.m154485z(c32027n.m154463d());
            c32027n.m154451E(c32027n.m154475p());
            c32027n.m154452F(c32027n.m154476q());
            c32027n.m154482w(1);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return c32027n;
    }

    /* renamed from: m0 */
    public static void m118542m0(List list, List list2, String str, int i11, int i12, String str2, EnumC24194e enumC24194e) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: me0.f7

                /* renamed from: p */
                public final /* synthetic */ List f112105p;

                /* renamed from: q */
                public final /* synthetic */ List f112106q;

                /* renamed from: r */
                public final /* synthetic */ String f112107r;

                /* renamed from: s */
                public final /* synthetic */ int f112108s;

                /* renamed from: t */
                public final /* synthetic */ int f112109t;

                /* renamed from: u */
                public final /* synthetic */ String f112110u;

                /* renamed from: v */
                public final /* synthetic */ EnumC24194e f112111v;

                public /* synthetic */ RunnableC23068f7(List list3, List list22, String str3, int i112, int i122, String str22, EnumC24194e enumC24194e2) {
                    r1 = list3;
                    r2 = list22;
                    r3 = str3;
                    r4 = i112;
                    r5 = i122;
                    r6 = str22;
                    r7 = enumC24194e2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC23112j7.m118555t(r1, r2, r3, r4, r5, r6, r7);
                }
            });
        }
    }

    /* renamed from: n */
    private static C32027n m118543n(C17945a0 c17945a0, C32027n c32027n) {
        C32027n c32027n2 = new C32027n();
        try {
            m118529g(c32027n2, c17945a0.mo95039W2(), c17945a0.m94862C4(), c17945a0.m95029V3(), c17945a0.m94974P4());
            c32027n2.m154449C(c32027n.m154468i());
            c32027n2.m154450D(c32027n.m154469j());
            c32027n2.m154447A(c32027n.m154466g());
            c32027n2.m154448B(c32027n.m154467h());
            c32027n2.m154484y(c32027n.m154464e());
            c32027n2.m154485z(c32027n.m154465f());
            c32027n2.m154451E(c32027n.m154470k());
            c32027n2.m154452F(c32027n.m154471l());
            c32027n2.m154482w(c32027n.m154461b() + 1);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return c32027n2;
    }

    /* renamed from: n0 */
    public static void m118544n0(String str, C26404f c26404f, C26406h c26406h) {
        for (ShareLinkInfo shareLinkInfo : c26404f.f125434P) {
            if (shareLinkInfo.m48435b() == 1 && shareLinkInfo.m48436c() != null) {
                C26404f c26404f2 = new C26404f(4);
                c26404f2.m136170w(shareLinkInfo.m48436c());
                m118516Z(str, c26404f2, c26406h);
            } else {
                m118538k0(str, shareLinkInfo.m48434a(), c26406h);
            }
        }
        if (!TextUtils.isEmpty(c26404f.m136160m())) {
            m118490A0();
            m118538k0(str, c26404f.m136160m(), c26406h);
        }
    }

    /* renamed from: o */
    public static C32027n m118545o(C17945a0 c17945a0) {
        int i11;
        C32027n c32027n = new C32027n();
        try {
            String m94853B3 = c17945a0.m94853B3();
            boolean z11 = !m94853B3.isEmpty();
            if (!z11) {
                m94853B3 = c17945a0.mo95039W2();
            }
            long parseLong = Long.parseLong(m94853B3);
            if (z11) {
                i11 = 6;
            } else {
                i11 = 3;
            }
            c32027n.m154454H(parseLong);
            c32027n.m154455I(i11);
            c32027n.m154453G(Long.parseLong(c17945a0.m94862C4()));
            EnumC26407i enumC26407i = EnumC26407i.f125521w;
            if (c17945a0.m94846A4().equals("share_inapp_browser")) {
                enumC26407i = EnumC26407i.f125524z;
            } else {
                EnumC26407i enumC26407i2 = f112197a;
                EnumC26407i enumC26407i3 = EnumC26407i.f125523y;
                if (enumC26407i2 == enumC26407i3 || AbstractC23463h.m123182j(c17945a0.mo95039W2())) {
                    enumC26407i = enumC26407i3;
                }
            }
            c32027n.m154457K(enumC26407i);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return c32027n;
    }

    /* renamed from: o0 */
    private static C17945a0 m118546o0(C32122t9 c32122t9, String str, EnumC24194e enumC24194e) {
        try {
            C17945a0 m118496F = m118496F(c32122t9, enumC24194e);
            if (m118496F != null) {
                AbstractC23306f.m120694n1().m101500a(new C29599o.a(c32122t9.m155025c(), m118496F, true, str));
                return m118496F;
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: p */
    private static int m118547p(int i11, int i12, long j11) {
        if ((j11 + "").equals("204278670")) {
            return 5;
        }
        if (i11 == 5) {
            return 4;
        }
        if (i11 == 6) {
            if (i12 == 1) {
                return 3;
            }
            return 2;
        }
        if (i11 == 3) {
            return 1;
        }
        return 0;
    }

    /* renamed from: p0 */
    public static void m118548p0(String str, ContactProfile contactProfile, String str2, C26406h c26406h, String str3) {
        C17945a0.w m95368d;
        if (contactProfile == null) {
            return;
        }
        try {
            if (!ContactProfile.m40346R0(CoreUtility.f89233i) || !ContactProfile.m40346R0(str) || m118568z0(str)) {
                return;
            }
            if (!contactProfile.m40387S0() && !C21927m.m114302u().m114318P(contactProfile.f42434r)) {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("phone", str2);
                }
                m95368d = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str, CoreUtility.f89233i), 12).m95382r(contactProfile.m40383Q(true, false)).m95368d(new C18013y0(contactProfile.f42437s, 0, contactProfile.f42446v, AbstractC23306f.m120583H().m110204g().m116324p(), jSONObject.toString(), "recommened.user", contactProfile.f42434r)).m95386v(1);
                if (c26406h.m136184h() != null && c26406h.m136184h().m137356a()) {
                    m95368d.m95383s(c26406h.m136184h());
                }
                m95368d.m95350B(c26406h.m136187k());
                m95368d.m95366b(c26406h.m136180d());
                m95368d.m95384t(m118539l(c26406h));
                C17945a0 m95365a = m95368d.m95365a();
                m95365a.m94951M9();
                AbstractC23306f.m120694n1().m101500a(new C29599o.a(str, m95365a, true, str3));
            }
            m95368d = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str, CoreUtility.f89233i), 12).m95382r(contactProfile.f42437s).m95368d(new C18013y0(contactProfile.f42437s, 0, contactProfile.f42446v, AbstractC23306f.m120583H().m110204g().m116324p(), contactProfile.f42458z, "recommened.vip", contactProfile.f42434r));
            if (c26406h.m136184h() != null) {
                m95368d.m95383s(c26406h.m136184h());
            }
            m95368d.m95350B(c26406h.m136187k());
            m95368d.m95366b(c26406h.m136180d());
            m95368d.m95384t(m118539l(c26406h));
            C17945a0 m95365a2 = m95368d.m95365a();
            m95365a2.m94951M9();
            AbstractC23306f.m120694n1().m101500a(new C29599o.a(str, m95365a2, true, str3));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q */
    private static C20612c m118549q(C26404f c26404f) {
        try {
            C20612c c20612c = new C20612c(0, c26404f.f125429K);
            c20612c.m107266H(c26404f.f125462r);
            c20612c.m107268J(c26404f.m136156i());
            return c20612c;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: q0 */
    public static void m118550q0(String str, C17945a0 c17945a0, C26406h c26406h, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && c17945a0 != null) {
                C17945a0.w m95385u = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str, CoreUtility.f89233i), 12).m95382r(c17945a0.m95019U3()).m95368d(c17945a0.m94929K2()).m95385u(c17945a0.m95051X3());
                if (c17945a0.m95071Z3() != null && c17945a0.m95071Z3().m137356a()) {
                    m95385u.m95383s(c17945a0.m95071Z3());
                }
                m95385u.m95350B(c26406h.m136187k());
                m95385u.m95366b(c26406h.m136180d());
                m95385u.m95384t(m118539l(c26406h));
                C17945a0 m95365a = m95385u.m95365a();
                m95365a.m94951M9();
                AbstractC23306f.m120694n1().m101500a(new C29599o.a(str, m95365a, true, str2));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: r */
    private static C20612c m118551r(C26404f c26404f) {
        try {
            C17945a0 c17945a0 = c26404f.f125452h;
            int i11 = 20;
            if (c17945a0 != null) {
                if (c17945a0.m94929K2() instanceof C18009w0) {
                    if (new C18009w0((C18009w0) c26404f.f125452h.m94929K2()).m95742G() != null) {
                        i11 = 52;
                    }
                    return new C20612c(0, i11);
                }
                return null;
            }
            int i12 = c26404f.f125429K;
            if (i12 != -1) {
                i11 = i12;
            }
            return new C20612c(0, i11);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: r0 */
    public static void m118552r0(String str, C17945a0 c17945a0, int i11, C26406h c26406h, String str2, long j11) {
        C17990p0 c17990p0;
        try {
            if (!TextUtils.isEmpty(str) && ContactProfile.m40346R0(CoreUtility.f89233i) && ContactProfile.m40346R0(str) && !m118568z0(str) && c17945a0 != null && (c17945a0.m94929K2() instanceof C17990p0) && (c17990p0 = (C17990p0) c17945a0.m94929K2()) != null && !TextUtils.isEmpty(c17990p0.f91014s)) {
                MessageId m41036c = MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str, CoreUtility.f89233i);
                C32094r9 c32094r9 = new C32094r9();
                if (c17945a0.m95050X2() != null) {
                    c32094r9.m154895j0(c17945a0.m95050X2().m132091a());
                    c32094r9.m154899l0(c17945a0.m95050X2().m132092b());
                    if (!c17945a0.m95050X2().m132093c()) {
                        c32094r9.m154888g().add(Integer.valueOf(EnumC24193d.f116770v.m126133c()));
                    }
                }
                c32094r9.m154883d0(Math.max(0L, C23793c.m124316k().mo124319c() - j11));
                C17945a0.w m95357I = new C17945a0.w(m41036c, 22).m95382r(c17945a0.m95019U3()).m95385u(c17945a0.m95051X3()).m95353E(c32094r9).m95357I(C23793c.m124316k().mo124319c());
                if (!TextUtils.isEmpty(c17945a0.m94983Q3()) && AbstractC23041d2.m118194A(c17945a0.m94983Q3())) {
                    m95357I.m95371g(5);
                    m95357I.m95379o(c17945a0.m94983Q3());
                } else {
                    m95357I.m95371g(2);
                }
                if (AbstractC23309i.m120900Ef()) {
                    C17990p0 c17990p02 = new C17990p0(c17990p0.f91011p, c17990p0.f91012q, "", "", c17990p0.f91015t, c17990p0.f91016u, c17990p0.f91017v);
                    c17990p02.f91118G = c17990p0.f91014s;
                    c17990p02.f91119H = c17990p0.f91013r;
                    C26639b.m136740D("mFileUrlToRenew " + c17990p0.f91014s);
                    C26639b.m136740D("mThumbUrlToRenew " + c17990p0.f91013r);
                    c17990p02.m95671m();
                    m95357I.m95368d(c17990p02);
                } else {
                    m95357I.m95368d(new C17990p0(c17990p0.f91011p, c17990p0.f91012q, c17990p0.f91013r, c17990p0.f91014s, c17990p0.f91015t, c17990p0.f91016u, c17990p0.f91017v));
                    m95357I.m95363O(c17990p0.f91014s);
                    m95357I.m95364P(c17990p0.f91013r);
                }
                m95357I.m95384t(new C17976k1(C20614e.m107305c(i11, AbstractC23041d2.m118194A(c17945a0.m94983Q3()))));
                if (c17945a0.m95071Z3() != null && c17945a0.m95071Z3().m137356a()) {
                    m95357I.m95383s(c17945a0.m95071Z3());
                }
                if (c26406h != null) {
                    m95357I.m95350B(c26406h.m136187k());
                    m95357I.m95366b(c26406h.m136180d());
                    m95357I.m95384t(m118539l(c26406h));
                }
                C17945a0 m95365a = m95357I.m95365a();
                m95365a.m94951M9();
                if (c17945a0.m95132f6()) {
                    m95365a.m94915I5();
                }
                AbstractC23306f.m120694n1().m101500a(new C29599o.a(str, m95365a, true, str2));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: s */
    private static C20612c m118553s(C26404f c26404f) {
        try {
            C17945a0 c17945a0 = c26404f.f125452h;
            if (c17945a0 != null && c17945a0.m94929K2() != null && !TextUtils.isEmpty(c26404f.f125452h.m94929K2().f91014s) && !TextUtils.isEmpty(c26404f.f125452h.m94929K2().f91013r)) {
                C20612c c20612c = new C20612c(0, c26404f.f125429K);
                if (c26404f.f125452h.m94929K2() instanceof C17961f1) {
                    c20612c.m107273O(((C17961f1) c26404f.f125452h.m94929K2()).m95465S());
                }
                return c20612c;
            }
            if (c26404f.m136161n() == null) {
                return null;
            }
            int i11 = c26404f.f125429K;
            if (i11 == -1) {
                i11 = 17;
            }
            C20612c c20612c2 = new C20612c(0, i11);
            c20612c2.m107273O(c26404f.f125462r);
            return c20612c2;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: s0 */
    public static void m118554s0(String str, String str2, int i11, C26406h c26406h, String str3, long j11) {
        C26406h c26406h2;
        try {
            if (ContactProfile.m40346R0(CoreUtility.f89233i) && ContactProfile.m40346R0(str) && !m118568z0(str) && !TextUtils.isEmpty(str2) && AbstractC23041d2.m118194A(str2)) {
                if (c26406h == null) {
                    c26406h2 = new C26406h();
                } else {
                    c26406h2 = c26406h;
                }
                File file = new File(str2);
                String name = file.getName();
                C17990p0 c17990p0 = new C17990p0(name, 0, "", "", "", "", "");
                c17990p0.f91113B = file.length();
                c17990p0.f91115D = AbstractC23041d2.m118217p(name);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("fileSize", c17990p0.f91113B);
                jSONObject.put("fileExt", c17990p0.f91115D);
                c17990p0.f91017v = jSONObject.toString();
                String string = MainApplication.getAppContext().getString(AbstractC8020f0.str_type_msg_file);
                if (!TextUtils.isEmpty(name)) {
                    string = string + " " + name;
                }
                C32094r9 c32094r9 = new C32094r9();
                c32094r9.m154883d0(Math.max(C23793c.m124316k().mo124319c() - j11, 0L));
                C17945a0 m95365a = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str, CoreUtility.f89233i), 22).m95382r(string).m95368d(c17990p0).m95379o(str2).m95384t(m118527f(new C17976k1(C20614e.m107305c(i11, true)), c26406h2)).m95350B(c26406h2.m136187k()).m95366b(c26406h2.m136180d()).m95353E(c32094r9).m95357I(C23793c.m124316k().mo124319c()).m95365a();
                m95365a.m94951M9();
                AbstractC23306f.m120694n1().m101500a(new C29599o.a(str, m95365a, true, str3));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: t */
    public static void m118555t(List list, List list2, String str, int i11, int i12, String str2, EnumC24194e enumC24194e) {
        String str3;
        Iterator it;
        int i13;
        MediaItem mediaItem;
        boolean z11;
        boolean z12;
        String str4;
        C27373c c27373c;
        int i14;
        C17976k1 c17976k1;
        C17976k1 c17976k12;
        String str5;
        C17976k1 c17976k13;
        C17979l1 c17979l1;
        C27373c c27373c2;
        C17976k1 c17976k14;
        C17979l1 c17979l12;
        C17961f1 c17961f1;
        C17994q1 c17994q1;
        String mo41081Q;
        C17976k1 c17976k15;
        C17994q1 c17994q12;
        int i15;
        try {
            int size = m118501K(list2).size();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str6 = (String) it2.next();
                int i16 = 0;
                while (i16 < list2.size()) {
                    try {
                        mediaItem = (MediaItem) list2.get(i16);
                        z11 = mediaItem instanceof VideoItem;
                        if (mediaItem != null && mediaItem.m41163p0()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        str4 = "";
                    } catch (Exception e11) {
                        e = e11;
                    }
                    if (!z11 && !z12) {
                        if (mediaItem != null) {
                            try {
                                if (!TextUtils.isEmpty(mediaItem.mo41081Q())) {
                                    if (mediaItem.m41100F() != null) {
                                        str4 = mediaItem.m41100F();
                                    }
                                    String str7 = str4;
                                    if (!TextUtils.isEmpty(mediaItem.m41113N())) {
                                        mo41081Q = mediaItem.m41113N();
                                    } else {
                                        mo41081Q = mediaItem.mo41081Q();
                                    }
                                    String str8 = mo41081Q;
                                    if (!TextUtils.isEmpty(str8) && AbstractC23041d2.m118194A(str8)) {
                                        if (C20551a.m106806a(str8)) {
                                            C23307g m118367a = AbstractC23067f6.m118367a(str8);
                                            C18009w0 c18009w0 = new C18009w0(str7, "", "", "", m118367a.f113474a, m118367a.f113475b);
                                            c18009w0.m95773j0(mediaItem.m41150j0());
                                            if (size > 1) {
                                                c18009w0.m95754T(currentTimeMillis);
                                                c18009w0.m95755U(size);
                                                c18009w0.m95760Z(i16);
                                                c18009w0.m95746K(true);
                                            }
                                            if (mediaItem.m41165q() != -1) {
                                                c18009w0.m95747M(mediaItem.m41156m());
                                                c18009w0.m95748N(mediaItem.m41165q());
                                            }
                                            c18009w0.m95778m0();
                                            if (!TextUtils.isEmpty(mediaItem.m41175w())) {
                                                c17976k15 = new C17976k1(mediaItem.m41175w());
                                            } else {
                                                C20612c c20612c = new C20612c(0, i11, C20620k.m107330a().m107370u(m118367a.f113474a).m107356g(m118367a.f113475b).m107357h(m118367a.f113476c).m107358i(m118367a.f113477d).m107352c(m118367a.f113478e).m107363n(str8).m107355f(m118367a.f113481h).m107350a());
                                                c20612c.m107266H(mediaItem.m41166q0());
                                                c17976k15 = new C17976k1(c20612c.m107293q());
                                            }
                                            C32027n m41115O = mediaItem.m41115O();
                                            if (m41115O != null) {
                                                c17994q12 = new C17994q1(3, m41115O.m154459M().toString());
                                            } else {
                                                c17994q12 = null;
                                            }
                                            C26406h c26406h = new C26406h();
                                            c26406h.m136194r(c17976k15);
                                            c26406h.m136196t(c17994q12);
                                            if (mediaItem.m41166q0()) {
                                                i15 = 4;
                                            } else {
                                                i15 = 3;
                                            }
                                            m118546o0(new C32122t9(str6, str8, i15, c18009w0, c26406h), str2, enumC24194e);
                                        } else {
                                            ToastUtils.m89273u();
                                        }
                                        i13 = i16;
                                        str3 = str6;
                                        it = it2;
                                    }
                                }
                            } catch (Exception e12) {
                                e = e12;
                                i13 = i16;
                                str3 = str6;
                                it = it2;
                                e.printStackTrace();
                                m118492B0(20L);
                                i16 = i13 + 1;
                                str6 = str3;
                                it2 = it;
                            }
                        }
                        i13 = i16;
                        str3 = str6;
                        it = it2;
                    } else {
                        if (z11) {
                            c27373c = (C27373c) ((VideoItem) mediaItem).m41217x1();
                        } else {
                            c27373c = null;
                        }
                        if (c27373c == null) {
                            c27373c = new C27373c();
                            c27373c.m140250e0(mediaItem.mo41081Q());
                            c27373c.f128949V = z12;
                            if (z11) {
                                c27373c.f128942O = false;
                                c27373c.f128943P = false;
                                c27373c.f128944Q = false;
                                AbstractC26897a.m138622h(c27373c);
                                if (c27373c.m140255i() == 0) {
                                    c27373c.m140226K(AbstractC3460h.m17442j(c27373c.m140220E()));
                                }
                            } else if (z12) {
                                AbstractC26897a.m138619e(c27373c);
                            }
                            mediaItem.m41099E0("");
                        }
                        C20556f c20556f = new C20556f(c27373c.m140220E());
                        if (!c20556f.m106830b() || c20556f.m106845r() == 0) {
                            i13 = i16;
                            str3 = str6;
                            it = it2;
                            if (z12) {
                                i14 = AbstractC8020f0.str_invalid_gif;
                            } else {
                                i14 = AbstractC8020f0.str_invalid_video;
                            }
                            try {
                                ToastUtils.m89266n(i14, new Object[0]);
                            } catch (Exception e13) {
                                e = e13;
                                e.printStackTrace();
                                m118492B0(20L);
                                i16 = i13 + 1;
                                str6 = str3;
                                it2 = it;
                            }
                            i16 = i13 + 1;
                            str6 = str3;
                            it2 = it;
                        } else {
                            if (z11) {
                                try {
                                    if (!TextUtils.isEmpty(mediaItem.m41175w())) {
                                        c17976k1 = new C17976k1(mediaItem.m41175w());
                                    } else {
                                        C20612c c20612c2 = new C20612c(0, i12, C20620k.m107330a().m107370u(c27373c.m140221F()).m107356g(c27373c.m140272z()).m107357h(c27373c.m140258l()).m107358i(c27373c.m140259m()).m107352c(c27373c.m140251f()).m107363n(c27373c.m140220E()).m107353d("mp4").m107364o(c27373c.m140255i() / 1000).m107350a());
                                        c20612c2.m107273O(mediaItem.m41166q0());
                                        c17976k1 = new C17976k1(c20612c2.m107293q(), c20612c2);
                                    }
                                    c17976k12 = c17976k1;
                                } catch (Exception e14) {
                                    e = e14;
                                    i13 = i16;
                                    str3 = str6;
                                    it = it2;
                                    e.printStackTrace();
                                    m118492B0(20L);
                                    i16 = i13 + 1;
                                    str6 = str3;
                                    it2 = it;
                                }
                            } else {
                                c17976k12 = null;
                            }
                            C27373c m140242a = c27373c.m140242a();
                            String m140268v = m140242a.m140268v();
                            String str9 = "";
                            if (TextUtils.isEmpty(m140268v)) {
                                m140242a.m140237V(AbstractC27985d.m140995l(System.currentTimeMillis()));
                                c17976k13 = c17976k12;
                                str5 = str6;
                            } else {
                                File file = new File(m140268v);
                                if (file.exists()) {
                                    try {
                                        if (file.length() > 0) {
                                            String parent = file.getParent();
                                            c17976k13 = c17976k12;
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("SEND_");
                                            str5 = str6;
                                            sb2.append(file.getName());
                                            File file2 = new File(parent, sb2.toString());
                                            AbstractC23238v2.m119718c(file, file2);
                                            m140242a.m140237V(file2.getPath());
                                        }
                                    } catch (Exception e15) {
                                        e = e15;
                                        str5 = str6;
                                        i13 = i16;
                                        it = it2;
                                        str3 = str5;
                                        e.printStackTrace();
                                        m118492B0(20L);
                                        i16 = i13 + 1;
                                        str6 = str3;
                                        it2 = it;
                                    }
                                }
                                c17976k13 = c17976k12;
                                str5 = str6;
                                m140242a.m140237V(AbstractC27985d.m140995l(System.currentTimeMillis()));
                            }
                            VideoBlendingParam videoBlendingParam = m140242a.f128947T;
                            if (videoBlendingParam != null) {
                                try {
                                    String str10 = videoBlendingParam.f48279s;
                                    if (!TextUtils.isEmpty(str10)) {
                                        File file3 = new File(str10);
                                        File file4 = new File(file3.getParent(), "SEND_" + file3.getName());
                                        AbstractC23238v2.m119718c(file3, file4);
                                        m140242a.f128947T.f48279s = file4.getPath();
                                    }
                                } catch (Exception e16) {
                                    e = e16;
                                    i13 = i16;
                                    it = it2;
                                    str3 = str5;
                                    e.printStackTrace();
                                    m118492B0(20L);
                                    i16 = i13 + 1;
                                    str6 = str3;
                                    it2 = it;
                                }
                            }
                            if (m140242a.f128948U > 0) {
                                c17979l1 = new C17979l1();
                                c17979l1.f91060c = m140242a.f128948U;
                            } else {
                                c17979l1 = null;
                            }
                            if (z12) {
                                c17979l1 = new C17979l1();
                                c17979l1.f91060c = ZAbstractBase.ZVU_BLEND_GEN_THUMB;
                            }
                            C17979l1 c17979l13 = c17979l1;
                            if (!TextUtils.isEmpty(mediaItem.m41100F())) {
                                str9 = mediaItem.m41100F();
                            }
                            if (size > 1) {
                                c27373c2 = m140242a;
                                int i17 = i16;
                                c17976k14 = c17976k13;
                                it = it2;
                                str3 = str5;
                                c17979l12 = c17979l13;
                                try {
                                    c17961f1 = new C17961f1(str9, 0, "", "", "", "", C17961f1.m95438A(m140242a, true, currentTimeMillis, size, i16, mediaItem.m41165q(), mediaItem.m41156m()), c27373c2);
                                    c17961f1.m95474d0(currentTimeMillis);
                                    c17961f1.m95475e0(size);
                                    i13 = i17;
                                    try {
                                        c17961f1.m95480h0(i13);
                                        c17961f1.m95467U(true);
                                    } catch (Exception e17) {
                                        e = e17;
                                        e.printStackTrace();
                                        m118492B0(20L);
                                        i16 = i13 + 1;
                                        str6 = str3;
                                        it2 = it;
                                    }
                                } catch (Exception e18) {
                                    e = e18;
                                    i13 = i17;
                                }
                            } else {
                                c27373c2 = m140242a;
                                i13 = i16;
                                c17976k14 = c17976k13;
                                str3 = str5;
                                it = it2;
                                c17979l12 = c17979l13;
                                c17961f1 = new C17961f1(str9, 0, "", "", "", "", C17961f1.m95438A(c27373c2, false, 0L, 0, 0, mediaItem.m41165q(), mediaItem.m41156m()), c27373c2);
                            }
                            C17961f1 c17961f12 = c17961f1;
                            if (mediaItem.m41165q() != -1) {
                                c17961f12.m95468Y(mediaItem.m41156m());
                                c17961f12.m95469Z(mediaItem.m41165q());
                            }
                            c17961f12.m95476f0(mediaItem.m41166q0());
                            C32027n m41115O2 = mediaItem.m41115O();
                            if (m41115O2 != null) {
                                c17994q1 = new C17994q1(3, m41115O2.m154459M().toString());
                            } else {
                                c17994q1 = null;
                            }
                            C26406h c26406h2 = new C26406h();
                            c26406h2.m136195s(c17979l12);
                            c26406h2.m136194r(c17976k14);
                            c26406h2.m136196t(c17994q1);
                            m118546o0(new C32122t9(str3, c27373c2.m140220E(), 19, c17961f12, c26406h2), str2, enumC24194e);
                        }
                    }
                    m118492B0(20L);
                    i16 = i13 + 1;
                    str6 = str3;
                    it2 = it;
                }
                String str11 = str6;
                Iterator it3 = it2;
                if (!TextUtils.isEmpty(str)) {
                    m118490A0();
                    m118532h0(str11, str);
                }
                it2 = it3;
            }
        } catch (Exception e19) {
            e19.printStackTrace();
        }
    }

    /* renamed from: t0 */
    public static void m118556t0(String str, C26404f c26404f, C26406h c26406h, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        if (c26404f == null) {
            return;
        }
        try {
            if (c26404f.f125420B == 0.0d || c26404f.f125421C == 0.0d || !ContactProfile.m40346R0(CoreUtility.f89233i) || !ContactProfile.m40346R0(str) || m118568z0(str)) {
                return;
            }
            String str7 = c26404f.f125422D;
            if (str7 == null) {
                str3 = "";
            } else {
                str3 = str7;
            }
            String str8 = c26404f.f125423E;
            if (str8 == null) {
                str4 = "";
            } else {
                str4 = str8;
            }
            double d11 = c26404f.f125421C;
            double d12 = c26404f.f125420B;
            C17969i0 c17969i0 = c26404f.f125451g;
            if (!(c17969i0 instanceof C18002t0)) {
                str5 = "";
            } else {
                str5 = ((C18002t0) c17969i0).f91183D;
            }
            if (!(c17969i0 instanceof C18002t0)) {
                str6 = "";
            } else {
                str6 = ((C18002t0) c17969i0).f91182C;
            }
            C17945a0.w m95384t = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str, CoreUtility.f89233i), 18).m95368d(new C18002t0(str3, 0, "", "", str4, "", C18002t0.m95713g(d11, d12, str5, str6, false))).m95385u(c26404f.m136154g()).m95350B(c26406h.m136187k()).m95366b(c26406h.m136180d()).m95384t(m118539l(c26406h));
            C26713e c26713e = c26404f.f125458n;
            if (c26713e != null && c26713e.m137356a()) {
                m95384t.m95383s(c26404f.f125458n);
            }
            C17945a0 m95365a = m95384t.m95365a();
            m95365a.m94951M9();
            AbstractC23306f.m120694n1().m101500a(new C29599o.a(str, m95365a, true, str2));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: u */
    private static String m118557u(C17969i0 c17969i0) {
        if (!(c17969i0 instanceof C18009w0) && !(c17969i0 instanceof C17961f1) && !(c17969i0 instanceof C17981m0)) {
            if (c17969i0 instanceof C18013y0) {
                C18013y0 c18013y0 = (C18013y0) c17969i0;
                if ("recommened.link".equals(c18013y0.f91016u)) {
                    return c18013y0.f91011p;
                }
                return "";
            }
            return "";
        }
        return c17969i0.f91011p;
    }

    /* renamed from: u0 */
    private static void m118558u0(String str, C26404f c26404f, C26406h c26406h) {
        C17244x0 c17244x0;
        if (c26404f.f125440V == null || (c17244x0 = c26404f.f125441W) == null || c17244x0.m92064b() == null || !ContactProfile.m40346R0(CoreUtility.f89233i) || !ContactProfile.m40346R0(str) || m118568z0(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("zinstantConfig", c26404f.f125441W.m92066d());
            jSONObject.put("featureType", c26404f.f125441W.m92064b().getFeatureType());
            jSONObject.put("layoutType", 2);
            jSONObject.put("customMsg", c26404f.f125440V.optJSONObject("previewMsgText"));
            if (jSONObject.optJSONObject("customMsg") != null && jSONObject.getJSONObject("customMsg").optJSONObject("highLightsV2") == null) {
                jSONObject.getJSONObject("customMsg").put("highLightsV2", new JSONArray());
            }
            if (c26404f.f125440V.optInt("enableReactions", 1) == 1) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put("reactions");
                jSONObject.put("anchors", jSONArray);
            }
            jSONObject.put("canUndo", 1);
            jSONObject.put("maxWidth", 0.77d);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("params", jSONObject);
            C17967h1 c17967h1 = new C17967h1(jSONObject2);
            C17945a0 m95365a = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str, CoreUtility.f89233i), 24).m95382r(c17967h1.m95579j()).m95368d(c17967h1).m95385u(c26406h.m136186j()).m95383s(c26406h.m136184h()).m95350B(c26406h.m136187k()).m95384t(m118539l(c26406h)).m95366b(c26406h.m136180d()).m95365a();
            m95365a.m94951M9();
            AbstractC23306f.m120694n1().m101500a(new C29599o.a(str, m95365a));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: v */
    public static void m118559v(C26404f c26404f, Bundle bundle) {
        if (c26404f != null) {
            try {
                if (c26404f.f125443Y == null && bundle.containsKey("original_message_reference")) {
                    C32027n c32027n = new C32027n(new JSONObject(bundle.getString("original_message_reference")));
                    c32027n.m154457K(EnumC26407i.f125522x);
                    c26404f.f125443Y = c32027n;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: v0 */
    public static void m118560v0(String str, String str2, C26406h c26406h, String str3) {
        if (str2 != null) {
            try {
                if (str2.length() == 0 || !ContactProfile.m40346R0(CoreUtility.f89233i) || !ContactProfile.m40346R0(str) || m118568z0(str)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(str2);
                C3245i c3245i = new C3245i(jSONObject);
                C17945a0 m95365a = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str, CoreUtility.f89233i), 12).m95382r(MainApplication.getAppContext().getString(AbstractC8020f0.str_StickerDetails_shareMes) + " " + c3245i.m16464f()).m95368d(new C17969i0(c3245i.m16464f(), 0, c3245i.f13859g, AbstractC23306f.m120583H().m110204g().m116324p(), "", "recommened.stickerset", jSONObject.toString())).m95385u(c26406h.m136186j()).m95383s(c26406h.m136184h()).m95350B(c26406h.m136187k()).m95384t(m118539l(c26406h)).m95365a();
                m95365a.m94951M9();
                AbstractC23306f.m120694n1().m101500a(new C29599o.a(str, m95365a, true, str3));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: w */
    public static void m118561w(String str, List list, boolean z11, int i11, int i12, String str2) {
        boolean z12;
        boolean z13;
        boolean z14;
        C26406h c26406h;
        boolean z15;
        String str3;
        try {
            if (!ContactProfile.m40346R0(CoreUtility.f89233i) || !ContactProfile.m40346R0(str) || m118568z0(str)) {
                return;
            }
            int size = list.size();
            long currentTimeMillis = System.currentTimeMillis();
            boolean z16 = true;
            if (size > 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            C2526d.f10270a.m12702a(currentTimeMillis, new C32080q9(currentTimeMillis, size));
            int i13 = 0;
            while (i13 < list.size()) {
                C17945a0 c17945a0 = (C17945a0) list.get(i13);
                C26406h c26406h2 = new C26406h();
                c26406h2.m136195s(c17945a0.m95051X3());
                c26406h2.m136193q(c17945a0.m95071Z3());
                if (c17945a0.m94876E2() != null) {
                    c26406h2.m136189m(c17945a0.m94876E2());
                }
                c26406h2.m136196t(new C17994q1(3, m118499I(c17945a0).m154459M().toString()));
                m118533i(c17945a0, c26406h2, i11, i12);
                if (c17945a0.m94871D7()) {
                    if (c17945a0.m95041W4() == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z15 && c17945a0.m95041W4() == 3) {
                        C17969i0 m94929K2 = c17945a0.m94929K2();
                        if (m94929K2 instanceof C18009w0) {
                            z15 = TextUtils.isEmpty(m94929K2.mo95598f()) ^ z16;
                        }
                    }
                    boolean z17 = z15;
                    if (c17945a0.m94929K2() instanceof C18009w0) {
                        C18009w0 c18009w0 = (C18009w0) c17945a0.m94929K2();
                        String str4 = c18009w0.f91014s;
                        String mo95598f = c18009w0.mo95598f();
                        if (!z11) {
                            str3 = "";
                        } else {
                            str3 = m118557u(c18009w0);
                        }
                        C18009w0 c18009w02 = new C18009w0(c18009w0);
                        c18009w02.f91011p = str3;
                        c18009w02.m95754T(currentTimeMillis);
                        c18009w02.m95755U(size);
                        c18009w02.m95760Z(i13);
                        c18009w02.m95746K(z12);
                        if (AbstractC23309i.m120937Ff()) {
                            c18009w02.m95767g0(str4, mo95598f);
                            c18009w02.f91014s = "";
                            c18009w02.f91013r = "";
                        }
                        c18009w02.m95778m0();
                        m118491B(str, c17945a0, c18009w02, z17, c26406h2, str2, C32094r9.m154848q(C31986k3.f147083a.m154105P1(c17945a0.mo95039W2())));
                    } else {
                        i13++;
                        z16 = true;
                    }
                } else if (c17945a0.m95306y8()) {
                    if (c17945a0.m94929K2() != null && !TextUtils.isEmpty(c17945a0.m94929K2().f91014s)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c17945a0.m94929K2() != null && !TextUtils.isEmpty(c17945a0.m94929K2().f91013r)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean m154105P1 = C31986k3.f147083a.m154105P1(c17945a0.mo95039W2());
                    if (z13 && z14) {
                        if (c17945a0.m94929K2() instanceof C17961f1) {
                            C17961f1 c17961f1 = new C17961f1((C17961f1) c17945a0.m94929K2());
                            if (z11) {
                                c17961f1.f91011p = m118557u(c17945a0.m94929K2());
                            }
                            c17961f1.m95474d0(currentTimeMillis);
                            c17961f1.m95475e0(size);
                            c17961f1.m95480h0(i13);
                            c17961f1.m95467U(z12);
                            c17961f1.m95449D0();
                            m118495E(str, c17945a0.m94983Q3(), c17961f1, c17961f1.f91011p, true, c26406h2, str2, c17945a0.m95132f6(), C32094r9.m154848q(m154105P1));
                        }
                    } else if (!TextUtils.isEmpty(c17945a0.m94983Q3()) && AbstractC23041d2.m118194A(c17945a0.m94983Q3())) {
                        C27373c c27373c = new C27373c();
                        c27373c.m140250e0(c17945a0.m94983Q3());
                        c27373c.m140237V(c17945a0.m94947M4());
                        c27373c.f128942O = false;
                        c27373c.f128943P = false;
                        c27373c.f128944Q = false;
                        C17961f1 c17961f12 = new C17961f1("", 0, "", "", "", "", C17961f1.m95438A(c27373c, z12, currentTimeMillis, size, i13, -1L, -1), c27373c);
                        if (z11) {
                            c17961f12.f91011p = m118557u(c17945a0.m94929K2());
                        }
                        c17961f12.m95474d0(currentTimeMillis);
                        c17961f12.m95475e0(size);
                        c17961f12.m95480h0(i13);
                        c17961f12.m95467U(z12);
                        if (c17945a0.m94929K2() instanceof C17961f1) {
                            c17961f12.m95476f0(((C17961f1) c17945a0.m94929K2()).m95465S());
                        }
                        C17976k1 m136185i = c26406h2.m136185i();
                        if (m136185i != null) {
                            m136185i.f91048b.m107264F(C20620k.m107330a().m107370u(c27373c.m140221F()).m107356g(c27373c.m140272z()).m107363n(c17945a0.m94983Q3()).m107353d("mp4").m107350a());
                            c26406h = c26406h2;
                            c26406h.m136194r(new C17976k1(m136185i.f91048b.m107293q()));
                        } else {
                            c26406h = c26406h2;
                        }
                        m118546o0(new C32122t9(str, c17945a0.m94983Q3(), 19, c17961f12, c26406h), str2, C32094r9.m154848q(m154105P1));
                        m118492B0(20L);
                        i13++;
                        z16 = true;
                    }
                }
                m118492B0(20L);
                i13++;
                z16 = true;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: w0 */
    public static void m118562w0(String str, C27373c c27373c, String str2, String str3, long j11) {
        String m140253g;
        String str4;
        try {
            C26406h c26406h = new C26406h();
            String m140220E = c27373c.m140220E();
            if (!TextUtils.isEmpty(m140220E) && AbstractC23041d2.m118194A(m140220E)) {
                if (TextUtils.isEmpty(c27373c.m140253g())) {
                    m140253g = "";
                } else {
                    m140253g = c27373c.m140253g();
                }
                C17961f1 c17961f1 = new C17961f1(m140253g, 0, "", "", "", "", C17961f1.m95438A(c27373c, false, 0L, 0, 0, -1L, -1), c27373c);
                c17961f1.f90956o0 = C23793c.m124316k().mo124319c() - j11;
                if (TextUtils.isEmpty(str2)) {
                    AbstractC26897a.m138621g(c27373c, false);
                    C20612c c20612c = new C20612c(0, 3, C20620k.m107330a().m107370u(c27373c.m140221F()).m107356g(c27373c.m140272z()).m107357h(c27373c.m140258l()).m107358i(c27373c.m140259m()).m107352c(c27373c.m140251f()).m107363n(c27373c.m140220E()).m107353d("mp4").m107366q(c27373c.m140270x()).m107365p(c27373c.m140269w()).m107367r(c27373c.m140271y()).m107369t(c27373c.m140219D()).m107368s(c27373c.m140216A()).m107350a());
                    c20612c.m107273O(AbstractC23078g6.Companion.m118394i(c27373c));
                    str4 = c20612c.m107293q();
                } else {
                    str4 = str2;
                }
                c26406h.m136194r(new C17976k1(str4));
                m118546o0(new C32122t9(str, m140220E, 19, c17961f1, c26406h), str3, C32094r9.m154848q(C31986k3.f147083a.m154105P1(str)));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: x */
    public static void m118563x(List list, List list2, String str, int i11, int i12, String str2, EnumC24194e enumC24194e) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: me0.g7

            /* renamed from: p */
            public final /* synthetic */ List f112127p;

            /* renamed from: q */
            public final /* synthetic */ List f112128q;

            /* renamed from: r */
            public final /* synthetic */ String f112129r;

            /* renamed from: s */
            public final /* synthetic */ int f112130s;

            /* renamed from: t */
            public final /* synthetic */ int f112131t;

            /* renamed from: u */
            public final /* synthetic */ String f112132u;

            /* renamed from: v */
            public final /* synthetic */ EnumC24194e f112133v;

            public /* synthetic */ RunnableC23079g7(List list3, List list22, String str3, int i112, int i122, String str22, EnumC24194e enumC24194e2) {
                r1 = list3;
                r2 = list22;
                r3 = str3;
                r4 = i112;
                r5 = i122;
                r6 = str22;
                r7 = enumC24194e2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC23112j7.m118565y(r1, r2, r3, r4, r5, r6, r7);
            }
        });
    }

    /* renamed from: x0 */
    public static void m118564x0(String str, C27373c c27373c, boolean z11, C26406h c26406h, String str2, EnumC24194e enumC24194e) {
        C26406h c26406h2;
        String m140253g;
        C17976k1 c17976k1;
        if (c26406h == null) {
            try {
                c26406h2 = new C26406h();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        } else {
            c26406h2 = c26406h;
        }
        String m140220E = c27373c.m140220E();
        if (!TextUtils.isEmpty(m140220E) && AbstractC23041d2.m118194A(m140220E)) {
            if (TextUtils.isEmpty(c27373c.m140253g())) {
                m140253g = "";
            } else {
                m140253g = c27373c.m140253g();
            }
            C17961f1 c17961f1 = new C17961f1(m140253g, 0, "", "", "", "", C17961f1.m95438A(c27373c, false, 0L, 0, 0, -1L, -1), c27373c);
            c17961f1.m95476f0(z11);
            C20612c m136181e = c26406h2.m136181e();
            if (m136181e != null) {
                AbstractC26897a.m138621g(c27373c, false);
                m136181e.m107264F(C20620k.m107330a().m107370u(c27373c.m140221F()).m107356g(c27373c.m140272z()).m107357h(c27373c.m140258l()).m107358i(c27373c.m140259m()).m107352c(c27373c.m140251f()).m107363n(c27373c.m140220E()).m107353d("mp4").m107366q(c27373c.m140270x()).m107365p(c27373c.m140269w()).m107367r(c27373c.m140271y()).m107369t(c27373c.m140219D()).m107368s(c27373c.m140216A()).m107364o(c27373c.m140255i() / 1000).m107350a());
                m136181e.m107272N(AbstractC3460h.m17452t(z11 ? 1 : 0, c27373c.m140221F(), c27373c.m140272z(), c27373c.m140271y(), c27373c.m140269w(), c27373c.m140247d(), c27373c.m140270x(), c27373c.m140219D(), c27373c.m140216A(), c27373c.m140256j()));
                c17976k1 = new C17976k1(m136181e.m107293q());
            } else {
                c17976k1 = null;
            }
            c26406h2.m136194r(c17976k1);
            m118546o0(new C32122t9(str, m140220E, 19, c17961f1, c26406h2), str2, enumC24194e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01bb A[Catch: Exception -> 0x015c, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x015c, blocks: (B:123:0x0155, B:98:0x01a0, B:100:0x01aa, B:103:0x01bb, B:105:0x0219, B:107:0x0229, B:109:0x022f, B:110:0x0240, B:114:0x0206, B:18:0x0267, B:21:0x0279, B:23:0x028d, B:26:0x0296, B:28:0x02a0, B:29:0x02ad, B:77:0x0273), top: B:122:0x0155 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c7 A[Catch: Exception -> 0x0257, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x0257, blocks: (B:96:0x016a, B:101:0x01b1, B:112:0x01c7), top: B:95:0x016a }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x014d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00ec A[Catch: Exception -> 0x025c, TryCatch #3 {Exception -> 0x025c, blocks: (B:83:0x00e3, B:86:0x00f2, B:89:0x0136, B:129:0x00ec), top: B:82:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0114 A[Catch: Exception -> 0x00ae, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ae, blocks: (B:143:0x00a6, B:144:0x00be, B:146:0x00c8, B:88:0x0114, B:91:0x013c, B:147:0x00d0), top: B:142:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013c A[Catch: Exception -> 0x00ae, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ae, blocks: (B:143:0x00a6, B:144:0x00be, B:146:0x00c8, B:88:0x0114, B:91:0x013c, B:147:0x00d0), top: B:142:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0168  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m118565y(List list, List list2, String str, int i11, int i12, String str2, EnumC24194e enumC24194e) {
        int i13;
        long j11;
        Iterator it;
        int i14;
        boolean z11;
        int i15;
        C27373c c27373c;
        String m41100F;
        C17945a0.w m95357I;
        C17976k1 c17976k1;
        C17945a0 m95365a;
        C32027n m41115O;
        String m41100F2;
        boolean z12;
        C17976k1 c17976k12;
        int i16;
        try {
            int size = list2.size();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                boolean z13 = false;
                int i17 = 0;
                while (i17 < list2.size()) {
                    try {
                        C32094r9 c32094r9 = new C32094r9();
                        c32094r9.m154889g0(enumC24194e);
                        if (AbstractC3489d.m17501i() && C28989l.m144746p().m144767w()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        c32094r9.m154923y0(z11);
                        MediaItem mediaItem = (MediaItem) list2.get(i17);
                        if (mediaItem instanceof VideoItem) {
                            try {
                                VideoItem videoItem = (VideoItem) mediaItem;
                                try {
                                    try {
                                        if (!TextUtils.isEmpty(mediaItem.mo41081Q())) {
                                            try {
                                                C20556f c20556f = new C20556f(mediaItem.mo41081Q());
                                                if (c20556f.m106830b() && c20556f.m106845r() > 0) {
                                                    c27373c = new C27373c();
                                                    c27373c.m140250e0(mediaItem.mo41081Q());
                                                    c27373c.f128942O = z13;
                                                    c27373c.f128943P = z13;
                                                    c27373c.f128944Q = z13;
                                                    AbstractC26897a.m138622h(c27373c);
                                                    if (c27373c.m140255i() == 0) {
                                                        i15 = i17;
                                                        try {
                                                            c27373c.m140226K(AbstractC3460h.m17442j(c27373c.m140220E()));
                                                        } catch (Exception e11) {
                                                            e = e11;
                                                            i13 = size;
                                                            it = it2;
                                                            i14 = i15;
                                                            j11 = currentTimeMillis;
                                                            AbstractC23350e.m122778h(e);
                                                            m118492B0(20L);
                                                            i17 = i14 + 1;
                                                            size = i13;
                                                            currentTimeMillis = j11;
                                                            it2 = it;
                                                            z13 = false;
                                                        }
                                                    } else {
                                                        i15 = i17;
                                                    }
                                                    if (!TextUtils.isEmpty(videoItem.m41141e0())) {
                                                        c27373c.m140237V(videoItem.m41141e0());
                                                    } else {
                                                        c27373c.m140237V(AbstractC27985d.m140996m(AbstractC23352g.m122788d(c27373c.m140220E())));
                                                    }
                                                    if (mediaItem.m41100F() != null) {
                                                        m41100F = "";
                                                    } else {
                                                        m41100F = mediaItem.m41100F();
                                                    }
                                                    C17961f1 c17961f1 = new C17961f1(m41100F, 0, mediaItem.m41134Z(), mediaItem.m41148i0(), "", "", "", c27373c);
                                                    c17961f1.m95476f0(mediaItem.m41166q0());
                                                    if (c27373c == null) {
                                                        c17961f1.m95490m0(((VideoItem) mediaItem).m41213t1());
                                                        c17961f1.m95443A0(mediaItem.getWidth());
                                                        c17961f1.m95498q0(mediaItem.getHeight());
                                                        c17961f1.m95507v0(((VideoItem) mediaItem).m41216w1());
                                                    }
                                                    if (AbstractC23309i.m120974Gf()) {
                                                        c17961f1.m95515z0(c17961f1.f91014s);
                                                        c17961f1.m95482i0(c17961f1.f91013r);
                                                        c17961f1.f91014s = "";
                                                        c17961f1.f91013r = "";
                                                    }
                                                    if (size <= 1) {
                                                        try {
                                                            c17961f1.m95474d0(currentTimeMillis);
                                                            c17961f1.m95475e0(size);
                                                            i14 = i15;
                                                        } catch (Exception e12) {
                                                            e = e12;
                                                            i14 = i15;
                                                            i13 = size;
                                                            j11 = currentTimeMillis;
                                                            it = it2;
                                                            AbstractC23350e.m122778h(e);
                                                            m118492B0(20L);
                                                            i17 = i14 + 1;
                                                            size = i13;
                                                            currentTimeMillis = j11;
                                                            it2 = it;
                                                            z13 = false;
                                                        }
                                                        try {
                                                            c17961f1.m95480h0(i14);
                                                            c17961f1.m95467U(true);
                                                        } catch (Exception e13) {
                                                            e = e13;
                                                            i13 = size;
                                                            j11 = currentTimeMillis;
                                                            it = it2;
                                                            AbstractC23350e.m122778h(e);
                                                            m118492B0(20L);
                                                            i17 = i14 + 1;
                                                            size = i13;
                                                            currentTimeMillis = j11;
                                                            it2 = it;
                                                            z13 = false;
                                                        }
                                                    } else {
                                                        i14 = i15;
                                                    }
                                                    c17961f1.m95449D0();
                                                    m95357I = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str3, CoreUtility.f89233i), 19).m95368d(c17961f1).m95353E(c32094r9).m95357I(C23793c.m124316k().mo124319c());
                                                    if (!TextUtils.isEmpty(mediaItem.mo41081Q()) && AbstractC23041d2.m118194A(mediaItem.mo41081Q())) {
                                                        m95357I.m95379o(mediaItem.mo41081Q());
                                                    }
                                                    if (TextUtils.isEmpty(mediaItem.m41175w())) {
                                                        c17976k1 = new C17976k1(mediaItem.m41175w());
                                                    } else {
                                                        C20612c c20612c = new C20612c(0, i12, C20620k.m107330a().m107370u(mediaItem.getWidth()).m107356g(mediaItem.getHeight()).m107352c(mediaItem.m41097D()).m107363n(mediaItem.m41148i0()).m107353d("mp4").m107364o(((VideoItem) mediaItem).m41213t1()).m107350a());
                                                        c20612c.m107273O(mediaItem.m41166q0());
                                                        c17976k1 = new C17976k1(c20612c.m107293q(), c20612c);
                                                    }
                                                    m95357I.m95384t(c17976k1);
                                                    m95365a = m95357I.m95365a();
                                                    m95365a.m94951M9();
                                                    m41115O = mediaItem.m41115O();
                                                    if (m41115O != null && m95365a.m95239r4() == null) {
                                                        m95365a.m95103cb(new C17994q1(3, m41115O.m154459M().toString()));
                                                    }
                                                    AbstractC23306f.m120694n1().m101500a(new C29599o.a(str3, m95365a, true, str2));
                                                    i13 = size;
                                                    j11 = currentTimeMillis;
                                                    it = it2;
                                                }
                                            } catch (Exception e14) {
                                                e = e14;
                                                i15 = i17;
                                            }
                                        }
                                        c17961f1.m95449D0();
                                        m95357I = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str3, CoreUtility.f89233i), 19).m95368d(c17961f1).m95353E(c32094r9).m95357I(C23793c.m124316k().mo124319c());
                                        if (!TextUtils.isEmpty(mediaItem.mo41081Q())) {
                                            m95357I.m95379o(mediaItem.mo41081Q());
                                        }
                                        if (TextUtils.isEmpty(mediaItem.m41175w())) {
                                        }
                                        m95357I.m95384t(c17976k1);
                                        m95365a = m95357I.m95365a();
                                        m95365a.m94951M9();
                                        m41115O = mediaItem.m41115O();
                                        if (m41115O != null) {
                                            m95365a.m95103cb(new C17994q1(3, m41115O.m154459M().toString()));
                                        }
                                        AbstractC23306f.m120694n1().m101500a(new C29599o.a(str3, m95365a, true, str2));
                                        i13 = size;
                                        j11 = currentTimeMillis;
                                        it = it2;
                                    } catch (Exception e15) {
                                        e = e15;
                                        i13 = size;
                                        j11 = currentTimeMillis;
                                        it = it2;
                                        AbstractC23350e.m122778h(e);
                                        m118492B0(20L);
                                        i17 = i14 + 1;
                                        size = i13;
                                        currentTimeMillis = j11;
                                        it2 = it;
                                        z13 = false;
                                    }
                                    if (mediaItem.m41100F() != null) {
                                    }
                                    C17961f1 c17961f12 = new C17961f1(m41100F, 0, mediaItem.m41134Z(), mediaItem.m41148i0(), "", "", "", c27373c);
                                    c17961f12.m95476f0(mediaItem.m41166q0());
                                    if (c27373c == null) {
                                    }
                                    if (AbstractC23309i.m120974Gf()) {
                                    }
                                    if (size <= 1) {
                                    }
                                } catch (Exception e16) {
                                    e = e16;
                                }
                                i15 = i17;
                                c27373c = null;
                            } catch (Exception e17) {
                                e = e17;
                                i14 = i17;
                            }
                        } else {
                            i14 = i17;
                            if (mediaItem.m41100F() == null) {
                                m41100F2 = "";
                            } else {
                                m41100F2 = mediaItem.m41100F();
                            }
                            String m118204c = AbstractC23041d2.m118204c(mediaItem.mo41081Q(), C32042o.f147549a.m154588d(str3));
                            if (!TextUtils.isEmpty(m118204c) && AbstractC23041d2.m118194A(m118204c)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            int width = mediaItem.getWidth();
                            int height = mediaItem.getHeight();
                            if (z12) {
                                C23307g m118367a = AbstractC23067f6.m118367a(m118204c);
                                int i18 = m118367a.f113474a;
                                height = m118367a.f113475b;
                                width = i18;
                            }
                            boolean z14 = !TextUtils.isEmpty(mediaItem.m41102H());
                            it = it2;
                            try {
                                C18009w0 c18009w0 = new C18009w0(m41100F2, mediaItem.m41134Z(), mediaItem.m41148i0(), mediaItem.m41102H(), width, height);
                                if (AbstractC23309i.m120937Ff()) {
                                    c18009w0.m95767g0(mediaItem.m41148i0(), mediaItem.m41102H());
                                    c18009w0.f91014s = "";
                                    c18009w0.f91013r = "";
                                }
                                if (size > 1) {
                                    c18009w0.m95754T(currentTimeMillis);
                                    c18009w0.m95755U(size);
                                    c18009w0.m95760Z(i14);
                                    c18009w0.m95746K(true);
                                }
                                c18009w0.m95778m0();
                                if (!TextUtils.isEmpty(mediaItem.m41175w())) {
                                    i13 = size;
                                    j11 = currentTimeMillis;
                                    c17976k12 = new C17976k1(mediaItem.m41175w());
                                } else {
                                    C20620k.a m107356g = C20620k.m107330a().m107370u(width).m107356g(height);
                                    i13 = size;
                                    j11 = currentTimeMillis;
                                    try {
                                        C20612c c20612c2 = new C20612c(0, i11, m107356g.m107357h(mediaItem.m41106J()).m107358i(mediaItem.m41108K()).m107352c(mediaItem.m41097D()).m107363n(m118204c).m107350a());
                                        c20612c2.m107266H(mediaItem.m41166q0());
                                        c17976k12 = new C17976k1(c20612c2.m107293q());
                                    } catch (Exception e18) {
                                        e = e18;
                                        AbstractC23350e.m122778h(e);
                                        m118492B0(20L);
                                        i17 = i14 + 1;
                                        size = i13;
                                        currentTimeMillis = j11;
                                        it2 = it;
                                        z13 = false;
                                    }
                                }
                                MessageId m41036c = MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str3, CoreUtility.f89233i);
                                if (z14) {
                                    i16 = 4;
                                } else {
                                    i16 = 3;
                                }
                                try {
                                    C17945a0.w m95357I2 = new C17945a0.w(m41036c, i16).m95368d(c18009w0).m95353E(c32094r9).m95357I(C23793c.m124316k().mo124319c());
                                    if (z12) {
                                        m95357I2.m95379o(m118204c);
                                    }
                                    m95357I2.m95384t(c17976k12);
                                    C17945a0 m95365a2 = m95357I2.m95365a();
                                    m95365a2.m94951M9();
                                    m95365a2.m95166j1(null);
                                    C32027n m41115O2 = mediaItem.m41115O();
                                    if (m41115O2 != null && m95365a2.m95239r4() == null) {
                                        m95365a2.m95103cb(new C17994q1(3, m41115O2.m154459M().toString()));
                                    }
                                    AbstractC23306f.m120694n1().m101500a(new C29599o.a(str3, m95365a2, true, str2));
                                } catch (Exception e19) {
                                    e = e19;
                                    AbstractC23350e.m122778h(e);
                                    m118492B0(20L);
                                    i17 = i14 + 1;
                                    size = i13;
                                    currentTimeMillis = j11;
                                    it2 = it;
                                    z13 = false;
                                }
                            } catch (Exception e21) {
                                e = e21;
                                i13 = size;
                                j11 = currentTimeMillis;
                                AbstractC23350e.m122778h(e);
                                m118492B0(20L);
                                i17 = i14 + 1;
                                size = i13;
                                currentTimeMillis = j11;
                                it2 = it;
                                z13 = false;
                            }
                        }
                    } catch (Exception e22) {
                        e = e22;
                        i13 = size;
                        j11 = currentTimeMillis;
                        it = it2;
                        i14 = i17;
                    }
                    m118492B0(20L);
                    i17 = i14 + 1;
                    size = i13;
                    currentTimeMillis = j11;
                    it2 = it;
                    z13 = false;
                }
                int i19 = size;
                long j12 = currentTimeMillis;
                Iterator it3 = it2;
                if (!TextUtils.isEmpty(str)) {
                    m118532h0(str3, str);
                    m118490A0();
                }
                size = i19;
                currentTimeMillis = j12;
                it2 = it3;
            }
        } catch (Exception e23) {
            AbstractC23350e.m122778h(e23);
        }
    }

    /* renamed from: y0 */
    public static void m118566y0(EnumC26407i enumC26407i) {
        f112197a = enumC26407i;
    }

    /* renamed from: z */
    public static void m118567z(String str, List list, String str2, EnumC24194e enumC24194e) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaItem m119812n = C23250w4.m119812n((MediaStoreItem) it.next());
            if (m119812n != null) {
                arrayList.add(m119812n);
            }
        }
        C26404f c26404f = new C26404f(arrayList);
        c26404f.f125432N = true;
        C26406h c26406h = new C26406h();
        C32027n c32027n = c26404f.f125443Y;
        if (c32027n != null) {
            c26406h.m136196t(new C17994q1(3, c32027n.m154459M().toString()));
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(str);
        m118565y(arrayList2, c26404f.m136153f(), c26404f.m136160m(), 8, 9, str2, enumC24194e);
    }

    /* renamed from: z0 */
    private static boolean m118568z0(String str) {
        if (C28203u6.f131407a.m141819r(str)) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cannot_perform_action));
            return true;
        }
        return false;
    }
}
