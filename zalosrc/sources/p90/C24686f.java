package p90;

import ag0.AbstractC0837p0;
import ag0.C0815e1;
import android.content.Intent;
import android.os.Parcelable;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.picker.mycloud.C12869a;
import com.zing.zalo.p077ui.picker.mycloud.model.SelectedItemData;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.showcase.ShowcaseView;
import com.zing.zalo.utils.ToastUtils;
import dj.C17945a0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import mw.EnumC23460e;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19968g;
import p279jw.C21373a;
import p361nb.C23648e;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25378x;
import sa0.C26203c;
import sa0.C26209i;
import vg.C28212v6;

/* renamed from: p90.f */
/* loaded from: classes6.dex */
public final class C24686f extends AbstractC19962a implements InterfaceC24681a {

    /* renamed from: t */
    private final List f118637t;

    /* renamed from: u */
    private final InterfaceC24854k f118638u;

    /* renamed from: v */
    private final int f118639v;

    /* renamed from: w */
    private final List f118640w;

    /* renamed from: x */
    private final Map f118641x;

    /* renamed from: p90.f$a */
    /* loaded from: classes6.dex */
    public static final class a extends C13306b.c {
        a() {
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: a */
        public boolean mo66900a(C28212v6 c28212v6) {
            String str;
            if (c28212v6 != null) {
                str = c28212v6.f131577c;
            } else {
                str = null;
            }
            if (AbstractC19074t.m100204b(str, "tip.mycloud.attachment.flow3.step2")) {
                return C21373a.f104231a.m110797i();
            }
            if (AbstractC19074t.m100204b(str, "tip.mycloud.attachment.flow4.step3")) {
                return C21373a.f104231a.m110796h();
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: d */
        public void mo66901d(String str, C28212v6 c28212v6, C26203c c26203c) {
            super.mo66901d(str, c28212v6, c26203c);
            if ((AbstractC19074t.m100204b(str, "tip.mycloud.attachment.flow3.step2") || AbstractC19074t.m100204b(str, "tip.mycloud.attachment.flow4.step3")) && c26203c != null) {
                c26203c.f124513d = AbstractC23222t7.f112566j;
            }
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: f */
        public String[] mo66902f() {
            return new String[]{"tip.mycloud.attachment.flow3.step2", "tip.mycloud.attachment.flow4.step3"};
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: h */
        public C26209i mo66903h(String str) {
            if (AbstractC19074t.m100204b(str, "tip.mycloud.attachment.flow3.step2") || AbstractC19074t.m100204b(str, "tip.mycloud.attachment.flow4.step3")) {
                return new C26209i(((InterfaceC24682b) C24686f.this.m103742Dp()).getRootView());
            }
            return null;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: i */
        public boolean mo66904i() {
            return ((InterfaceC24682b) C24686f.this.m103742Dp()).mo72541eG();
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: k */
        public void mo74719k(ShowcaseView showcaseView, C28212v6 c28212v6, int i11, boolean z11) {
            String str;
            String str2 = null;
            if (c28212v6 != null) {
                str = c28212v6.f131577c;
            } else {
                str = null;
            }
            if (AbstractC19074t.m100204b(str, "tip.mycloud.attachment.flow3.step2")) {
                C21373a c21373a = C21373a.f104231a;
                c21373a.m110787J(false);
                c21373a.m110790M();
                return;
            }
            if (c28212v6 != null) {
                str2 = c28212v6.f131577c;
            }
            if (AbstractC19074t.m100204b(str2, "tip.mycloud.attachment.flow4.step3")) {
                C21373a c21373a2 = C21373a.f104231a;
                c21373a2.m110786I(false);
                c21373a2.m110791N();
            }
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: m */
        public void mo66905m(ShowcaseView showcaseView, C28212v6 c28212v6) {
            super.mo66905m(showcaseView, c28212v6);
            C24686f.this.m128261Xp(c28212v6);
        }
    }

    /* renamed from: p90.f$b */
    /* loaded from: classes6.dex */
    static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ SelectedItemData f118643q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(SelectedItemData selectedItemData) {
            super(1);
            this.f118643q = selectedItemData;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(SelectedItemData selectedItemData) {
            AbstractC19074t.m100208f(selectedItemData, "it");
            return Boolean.valueOf(AbstractC19074t.m100204b(selectedItemData, this.f118643q));
        }
    }

    /* renamed from: p90.f$c */
    /* loaded from: classes6.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f118644q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap mo12V4() {
            return new HashMap();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24686f(InterfaceC24682b interfaceC24682b) {
        super(interfaceC24682b);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(interfaceC24682b, "mvpView");
        this.f118637t = new ArrayList();
        m129210a = AbstractC24856m.m129210a(c.f118644q);
        this.f118638u = m129210a;
        this.f118639v = C21373a.f104231a.m110806v();
        this.f118640w = new ArrayList();
        this.f118641x = new HashMap();
    }

    /* renamed from: Mp */
    private final void m128250Mp() {
        final String str;
        final String str2;
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f118637t);
        C12869a c12869a = (C12869a) m103744Fp();
        if (c12869a == null || (str = c12869a.m72564a()) == null) {
            str = "";
        }
        C12869a c12869a2 = (C12869a) m103744Fp();
        if (c12869a2 == null || (str2 = c12869a2.m72565b()) == null) {
            str2 = "0";
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: p90.e
            @Override // java.lang.Runnable
            public final void run() {
                C24686f.m128251Np(arrayList, str2, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Np */
    public static final void m128251Np(List list, String str, String str2) {
        AbstractC19074t.m100208f(list, "$selectedList");
        AbstractC19074t.m100208f(str, "$logChatType");
        AbstractC19074t.m100208f(str2, "$conversationId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = list.iterator();
        while (true) {
            int i11 = 0;
            if (it.hasNext()) {
                SelectedItemData selectedItemData = (SelectedItemData) it.next();
                int m102878B = AbstractC19646n0.m102878B(selectedItemData.m72576a().m95041W4(), false);
                Integer num = (Integer) linkedHashMap.get(Integer.valueOf(m102878B));
                if (num != null) {
                    i11 = num.intValue();
                }
                linkedHashMap.put(Integer.valueOf(m102878B), Integer.valueOf(i11 + 1));
                if (selectedItemData.m72576a().m94974P4() < currentTimeMillis) {
                    currentTimeMillis = selectedItemData.m72576a().m94974P4();
                }
            } else {
                C0815e1.m2075D().m2100V(new C23648e(1, "csc_attach", 0, "chat_send_mycloud_done", str, C0815e1.m2075D().m2124y(str, str2, currentTimeMillis, linkedHashMap)), false);
                return;
            }
        }
    }

    /* renamed from: Op */
    private final void m128252Op(String str) {
        String str2;
        C12869a c12869a = (C12869a) m103744Fp();
        if (c12869a == null || (str2 = c12869a.m72565b()) == null) {
            str2 = "0";
        }
        C0815e1.m2075D().m2100V(new C23648e(1, "csc_attach", 1, str, str2), false);
    }

    /* renamed from: Pp */
    private final Map m128253Pp() {
        return (Map) this.f118638u.getValue();
    }

    /* renamed from: Qp */
    private final String m128254Qp(String str, int i11) {
        String str2;
        if (i11 <= 0) {
            str2 = "";
        } else {
            str2 = " " + i11;
        }
        if (AbstractC19074t.m100204b(str, EnumC23460e.f113956r.m123172c())) {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_tab_message) + str2;
        }
        if (AbstractC19074t.m100204b(str, EnumC23460e.f113957s.m123172c())) {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_photo_lowercase) + str2;
        }
        if (AbstractC19074t.m100204b(str, EnumC23460e.f113959u.m123172c())) {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_link_lowercase) + str2;
        }
        if (!AbstractC19074t.m100204b(str, EnumC23460e.f113958t.m123172c())) {
            return "";
        }
        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_document) + str2;
    }

    /* renamed from: Rp */
    private final void m128255Rp(int i11, boolean z11) {
        ((InterfaceC24682b) m103742Dp()).mo72537Jq(i11);
        if (z11 && i11 == 1) {
            ((InterfaceC24682b) m103742Dp()).mo72539Sf(true);
        } else if (!z11 && i11 == 0) {
            ((InterfaceC24682b) m103742Dp()).mo72539Sf(false);
        }
    }

    /* renamed from: Sp */
    private final void m128256Sp() {
        this.f118640w.clear();
        this.f118640w.add(EnumC23460e.f113956r);
        this.f118640w.add(EnumC23460e.f113957s);
        this.f118640w.add(EnumC23460e.f113958t);
        this.f118640w.add(EnumC23460e.f113959u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Wp */
    public static final void m128257Wp() {
        ToastUtils.m89266n(AbstractC8020f0.profile_share_vip_success, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Yp */
    public static final void m128258Yp(C24686f c24686f) {
        AbstractC19074t.m100208f(c24686f, "this$0");
        C21373a c21373a = C21373a.f104231a;
        if (c21373a.m110797i()) {
            ((InterfaceC24682b) c24686f.m103742Dp()).mo72538O6("tip.mycloud.attachment.flow3.step2", 0);
        } else if (c21373a.m110796h()) {
            ((InterfaceC24682b) c24686f.m103742Dp()).mo72538O6("tip.mycloud.attachment.flow4.step3", 0);
        }
    }

    /* renamed from: Zp */
    private final void m128259Zp(String str, boolean z11) {
        int i11;
        int i12;
        Integer num = (Integer) m128253Pp().get(str);
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = 0;
        }
        if (z11) {
            i12 = i11 + 1;
        } else {
            i12 = i11 - 1;
        }
        m128253Pp().put(str, Integer.valueOf(i12));
        ((InterfaceC24682b) m103742Dp()).mo72540Yq(str, m128254Qp(str, i12));
    }

    @Override // p90.InterfaceC24681a
    /* renamed from: J */
    public void mo128238J() {
        C21373a c21373a = C21373a.f104231a;
        if (c21373a.m110797i()) {
            c21373a.m110787J(false);
            c21373a.m110790M();
        } else if (c21373a.m110796h()) {
            c21373a.m110786I(false);
            c21373a.m110791N();
        }
    }

    @Override // p90.InterfaceC24681a
    /* renamed from: N1 */
    public List mo128239N1() {
        return this.f118637t;
    }

    @Override // p90.InterfaceC24681a
    /* renamed from: O1 */
    public boolean mo128240O1(SelectedItemData selectedItemData, boolean z11) {
        MessageId messageId;
        C17945a0 m72576a;
        boolean z12;
        List mo128239N1 = mo128239N1();
        List list = mo128239N1;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MessageId m95029V3 = ((SelectedItemData) it.next()).m72576a().m95029V3();
                if (selectedItemData != null && (m72576a = selectedItemData.m72576a()) != null) {
                    messageId = m72576a.m95029V3();
                } else {
                    messageId = null;
                }
                if (AbstractC19074t.m100204b(m95029V3, messageId)) {
                    break;
                }
            }
        }
        if (mo128239N1.size() >= this.f118639v) {
            z12 = false;
            if (!z12 && z11) {
                ToastUtils.m89268p(AbstractC23136l9.m118746s0(AbstractC8020f0.str_share_my_cloud_max_msg_toast, Integer.valueOf(this.f118639v)));
            }
            return z12;
        }
        z12 = true;
        if (!z12) {
            ToastUtils.m89268p(AbstractC23136l9.m118746s0(AbstractC8020f0.str_share_my_cloud_max_msg_toast, Integer.valueOf(this.f118639v)));
        }
        return z12;
    }

    @Override // p90.InterfaceC24681a
    /* renamed from: T */
    public void mo128241T(boolean z11, boolean z12) {
        if (z11) {
            ((InterfaceC24682b) m103742Dp()).mo78955kl(new Runnable() { // from class: p90.c
                @Override // java.lang.Runnable
                public final void run() {
                    C24686f.m128258Yp(C24686f.this);
                }
            }, 500L);
        }
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: Tp, reason: merged with bridge method [inline-methods] */
    public void mo995Nd(C12869a c12869a, InterfaceC19968g interfaceC19968g) {
        String str;
        super.mo995Nd(c12869a, interfaceC19968g);
        if (c12869a == null || (str = c12869a.m72565b()) == null) {
            str = "0";
        }
        C0815e1.m2075D().m2100V(new C23648e(10, "csc_attach", 0, "chat_send_mycloud", str), false);
    }

    /* renamed from: Xp */
    public final void m128261Xp(C28212v6 c28212v6) {
        String str;
        String str2 = null;
        if (c28212v6 != null) {
            str = c28212v6.f131577c;
        } else {
            str = null;
        }
        if (AbstractC19074t.m100204b(str, "tip.mycloud.attachment.flow3.step2")) {
            m128252Op("mycloud_attach_onboarding_3_3");
            return;
        }
        if (c28212v6 != null) {
            str2 = c28212v6.f131577c;
        }
        if (AbstractC19074t.m100204b(str2, "tip.mycloud.attachment.flow4.step3")) {
            m128252Op("mycloud_attach_onboarding_4_3");
        }
    }

    @Override // p90.InterfaceC24681a
    /* renamed from: a0 */
    public List mo128242a0() {
        if (this.f118640w.isEmpty()) {
            m128256Sp();
        }
        return this.f118640w;
    }

    @Override // p90.InterfaceC24681a
    /* renamed from: bc */
    public void mo128243bc() {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it = mo128239N1().iterator();
        while (it.hasNext()) {
            arrayList.add((SelectedItemData) it.next());
        }
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("SELECTED_LIST", arrayList);
        ((InterfaceC24682b) m103742Dp()).mo72542md(intent);
        AbstractC19444a.m101694b(new Runnable() { // from class: p90.d
            @Override // java.lang.Runnable
            public final void run() {
                C24686f.m128257Wp();
            }
        }, 150L);
        m128250Mp();
    }

    @Override // p90.InterfaceC24681a
    /* renamed from: mc */
    public Map mo128244mc() {
        if (this.f118641x.isEmpty()) {
            for (EnumC23460e enumC23460e : mo128242a0()) {
                this.f118641x.put(enumC23460e.m123172c(), m128254Qp(enumC23460e.m123172c(), 0));
            }
        }
        return this.f118641x;
    }

    @Override // p90.InterfaceC24681a
    /* renamed from: po */
    public C13306b.c mo128245po() {
        return new a();
    }

    @Override // p90.InterfaceC24681a
    /* renamed from: v1 */
    public void mo128246v1(SelectedItemData selectedItemData, boolean z11) {
        boolean m131542D;
        AbstractC19074t.m100208f(selectedItemData, "selectedItemData");
        if (!z11) {
            m131542D = AbstractC25378x.m131542D(this.f118637t, new b(selectedItemData));
            if (m131542D) {
                m128255Rp(this.f118637t.size(), false);
                m128259Zp(selectedItemData.m72577b(), false);
                return;
            }
            return;
        }
        List list = this.f118637t;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC19074t.m100204b((SelectedItemData) it.next(), selectedItemData)) {
                    return;
                }
            }
        }
        this.f118637t.add(selectedItemData);
        m128255Rp(this.f118637t.size(), true);
        m128259Zp(selectedItemData.m72577b(), true);
    }
}
