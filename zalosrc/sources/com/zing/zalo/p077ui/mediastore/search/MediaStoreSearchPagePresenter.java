package com.zing.zalo.p077ui.mediastore.search;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.InterfaceC1801w;
import au.EnumC2363o;
import au.EnumC2382z;
import ci.AbstractC3501f0;
import ci.C3499e0;
import ci.C3508j;
import ci.C3521p0;
import ci.C3526u;
import com.zing.zalo.adapters.C7226u3;
import com.zing.zalo.control.C7906d;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.control.mediastore.CreateMediaStoreParam;
import com.zing.zalo.control.mediastore.MSFilterData;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.mediastore.C12369h;
import com.zing.zalo.p077ui.mediastore.InterfaceC12371j;
import com.zing.zalo.p077ui.mediastore.MediaStoreBasePage;
import com.zing.zalo.p077ui.mediastore.MediaStorePagePresenter;
import com.zing.zalo.p077ui.mediastore.search.MediaStoreSearchPage;
import com.zing.zalo.p077ui.mediastore.search.MediaStoreSearchPagePresenter;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import dg0.AbstractC17930e;
import en0.InterfaceC18494a;
import fe0.C18898g;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import me0.C23250w4;
import mm0.AbstractC23350e;
import p348mi.AbstractC23306f;
import p361nb.EnumC23663t;
import p363nh.C23744a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes6.dex */
public class MediaStoreSearchPagePresenter extends MediaStorePagePresenter implements InterfaceC12404a {

    /* renamed from: Q */
    private EnumC2382z f64473Q;

    /* renamed from: R */
    private ArrayList f64474R;

    /* renamed from: S */
    private MediaStoreSearchPage.EnumC12391a f64475S;

    /* renamed from: T */
    private final InterfaceC24854k f64476T;

    /* renamed from: U */
    private final InterfaceC24854k f64477U;

    /* renamed from: V */
    private C3521p0.d f64478V;

    /* renamed from: com.zing.zalo.ui.mediastore.search.MediaStoreSearchPagePresenter$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C12393a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f64479a;

        static {
            int[] iArr = new int[EnumC2382z.values().length];
            try {
                iArr[EnumC2382z.f9944q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2382z.f9945r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2382z.f9947t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC2382z.f9946s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f64479a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.search.MediaStoreSearchPagePresenter$b */
    /* loaded from: classes6.dex */
    public static final class C12394b implements C7226u3.d {
        C12394b() {
        }

        @Override // com.zing.zalo.adapters.C7226u3.d
        /* renamed from: H0 */
        public void mo36840H0() {
            MediaStoreBasePage.InterfaceC12275b m69040Cq = MediaStoreSearchPagePresenter.this.m69040Cq();
            if (m69040Cq != null) {
                m69040Cq.mo68944s4(MediaStoreSearchPagePresenter.this.f64473Q);
            }
        }

        @Override // com.zing.zalo.adapters.C7226u3.d
        /* renamed from: I0 */
        public void mo36841I0(EnumC2382z enumC2382z) {
            AbstractC19074t.m100208f(enumC2382z, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            MediaStoreBasePage.InterfaceC12275b m69040Cq = MediaStoreSearchPagePresenter.this.m69040Cq();
            if (m69040Cq != null) {
                m69040Cq.mo68936I0(enumC2382z);
            }
        }

        @Override // com.zing.zalo.adapters.C7226u3.d
        /* renamed from: a */
        public void mo36842a(C3508j c3508j) {
            AbstractC19074t.m100208f(c3508j, "albumItem");
            Bundle bundle = new Bundle();
            CreateMediaStoreParam createMediaStoreParam = new CreateMediaStoreParam(MediaStoreSearchPagePresenter.this.m69045Iq().m17608M(), null, null, 6, null);
            if (c3508j.m17713y0() == C3508j.b.f14700q) {
                createMediaStoreParam.m40912e(EnumC2363o.f9891r);
            } else if (c3508j.m17713y0() == C3508j.b.f14701r) {
                createMediaStoreParam.m40912e(EnumC2363o.f9890q);
            }
            createMediaStoreParam.m40911d(new MSFilterData(String.valueOf(c3508j.m17711w0()), String.valueOf(c3508j.m17694G0())));
            createMediaStoreParam.m40913f(bundle);
            bundle.putInt("SHOW_WITH_FLAGS", 134217728);
            ((InterfaceC12371j) MediaStoreSearchPagePresenter.this.m103742Dp()).mo68874KA(bundle);
            MediaStoreBasePage.InterfaceC12275b m69040Cq = MediaStoreSearchPagePresenter.this.m69040Cq();
            if (m69040Cq != null) {
                m69040Cq.mo68942q4(false);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.search.MediaStoreSearchPagePresenter$c */
    /* loaded from: classes6.dex */
    public static final class C12395c implements C3521p0.d {

        /* renamed from: b */
        final /* synthetic */ InterfaceC12371j f64482b;

        C12395c(InterfaceC12371j interfaceC12371j) {
            this.f64482b = interfaceC12371j;
        }

        /* renamed from: d */
        public static final void m69648d(InterfaceC12371j interfaceC12371j, C3499e0 c3499e0, MediaStoreSearchPagePresenter mediaStoreSearchPagePresenter) {
            AbstractC19074t.m100208f(interfaceC12371j, "$mvpView");
            AbstractC19074t.m100208f(c3499e0, "$mediaStore");
            AbstractC19074t.m100208f(mediaStoreSearchPagePresenter, "this$0");
            AbstractC19444a.m101697e(new Runnable() { // from class: d80.d

                /* renamed from: q */
                public final /* synthetic */ C3499e0 f90099q;

                /* renamed from: r */
                public final /* synthetic */ MediaStoreSearchPagePresenter f90100r;

                public /* synthetic */ RunnableC17832d(C3499e0 c3499e02, MediaStoreSearchPagePresenter mediaStoreSearchPagePresenter2) {
                    r2 = c3499e02;
                    r3 = mediaStoreSearchPagePresenter2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MediaStoreSearchPagePresenter.C12395c.m69649e(InterfaceC12371j.this, r2, r3);
                }
            });
        }

        /* renamed from: e */
        public static final void m69649e(InterfaceC12371j interfaceC12371j, C3499e0 c3499e0, MediaStoreSearchPagePresenter mediaStoreSearchPagePresenter) {
            AbstractC19074t.m100208f(interfaceC12371j, "$mvpView");
            AbstractC19074t.m100208f(c3499e0, "$mediaStore");
            AbstractC19074t.m100208f(mediaStoreSearchPagePresenter, "this$0");
            interfaceC12371j.mo68928yF(8, MultiStateView.EnumC15914e.LOADING);
            interfaceC12371j.mo68879Ms(c3499e0.m17610O(), mediaStoreSearchPagePresenter.f64473Q);
            interfaceC12371j.mo68854Aa();
        }

        @Override // ci.C3521p0.d
        /* renamed from: a */
        public void mo17803a(C3499e0 c3499e0, EnumC2382z enumC2382z) {
            String str;
            AbstractC19074t.m100208f(c3499e0, "mediaStore");
            AbstractC19074t.m100208f(enumC2382z, "mediaType");
            C3526u m17610O = c3499e0.m17610O();
            if (m17610O != null && MediaStoreSearchPagePresenter.this.m69040Cq() != null) {
                String str2 = m17610O.f14803a;
                MediaStoreBasePage.InterfaceC12275b m69040Cq = MediaStoreSearchPagePresenter.this.m69040Cq();
                if (m69040Cq != null) {
                    str = m69040Cq.mo68946u4();
                } else {
                    str = null;
                }
                if (TextUtils.equals(str2, str)) {
                    AbstractC17930e.Companion.m94550a().mo94530d("MS_SEARCH_RESULT_CHANGED" + m17610O.f14803a + "_" + MediaStoreSearchPagePresenter.this.f64473Q, new Runnable() { // from class: d80.c

                        /* renamed from: q */
                        public final /* synthetic */ C3499e0 f90096q;

                        /* renamed from: r */
                        public final /* synthetic */ MediaStoreSearchPagePresenter f90097r;

                        public /* synthetic */ RunnableC17831c(C3499e0 c3499e02, MediaStoreSearchPagePresenter mediaStoreSearchPagePresenter) {
                            r2 = c3499e02;
                            r3 = mediaStoreSearchPagePresenter;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            MediaStoreSearchPagePresenter.C12395c.m69648d(InterfaceC12371j.this, r2, r3);
                        }
                    }, 250L);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mediastore.search.MediaStoreSearchPagePresenter$d */
    /* loaded from: classes6.dex */
    public static final class C12396d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12396d f64483q = new C12396d();

        /* renamed from: com.zing.zalo.ui.mediastore.search.MediaStoreSearchPagePresenter$d$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC3501f0 {
            a() {
            }
        }

        C12396d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final a mo12V4() {
            return new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mediastore.search.MediaStoreSearchPagePresenter$e */
    /* loaded from: classes6.dex */
    public static final class C12397e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12397e f64484q = new C12397e();

        C12397e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C18898g mo12V4() {
            return AbstractC23306f.m120682k1();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaStoreSearchPagePresenter(InterfaceC12371j interfaceC12371j) {
        super(interfaceC12371j);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(interfaceC12371j, "mvpView");
        this.f64473Q = EnumC2382z.f9944q;
        this.f64474R = new ArrayList();
        this.f64475S = MediaStoreSearchPage.EnumC12391a.f64469p;
        m129210a = AbstractC24856m.m129210a(C12397e.f64484q);
        this.f64476T = m129210a;
        m129210a2 = AbstractC24856m.m129210a(C12396d.f64483q);
        this.f64477U = m129210a2;
        this.f64478V = new C12395c(interfaceC12371j);
    }

    /* renamed from: Ir */
    private final C18898g m69640Ir() {
        return (C18898g) this.f64476T.getValue();
    }

    /* renamed from: Jr */
    private final void m69641Jr(EnumC2382z enumC2382z) {
        C3526u m17610O = m69045Iq().m17610O();
        if (m17610O != null) {
            m69640Ir().m101508a(new C18898g.a(m69045Iq(), m17610O, enumC2382z, this.f64475S, 0L, 0L, true, 48, null));
        }
    }

    /* renamed from: Lr */
    private final void m69642Lr(boolean z11) {
        if (z11) {
            m69045Iq().m17626l0(this.f64478V);
        } else {
            m69045Iq().m17635r0(this.f64478V);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStorePagePresenter, com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: Aj */
    public void mo69036Aj() {
        ((InterfaceC12371j) m103742Dp()).mo68923ui();
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStorePagePresenter
    /* renamed from: Br */
    public void mo69038Br() {
        super.mo69038Br();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 174);
        bVar.m124119a().m124117e(this, 175);
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStorePagePresenter
    /* renamed from: Jq */
    public AbstractC3501f0 mo69046Jq() {
        return (AbstractC3501f0) this.f64477U.getValue();
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStorePagePresenter, com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: L */
    public void mo69050L() {
        super.mo69050L();
        ((InterfaceC12371j) m103742Dp()).mo68879Ms(m69045Iq().m17610O(), this.f64473Q);
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStorePagePresenter, com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: Lk */
    public void mo69051Lk(C12369h c12369h, Bundle bundle) {
        AbstractC19074t.m100208f(c12369h, "viewArgs");
        super.mo69051Lk(c12369h, bundle);
        this.f64473Q = c12369h.m69537b();
        MediaStoreSearchPage.EnumC12391a m69538c = c12369h.m69538c();
        if (m69538c == null) {
            m69538c = MediaStoreSearchPage.EnumC12391a.f64469p;
        }
        this.f64475S = m69538c;
        m69045Iq().m17610O();
        m69642Lr(true);
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStorePagePresenter
    /* renamed from: Lq */
    public EnumC23663t mo69053Lq() {
        if (this.f64475S == MediaStoreSearchPage.EnumC12391a.f64469p) {
            return EnumC23663t.f114625r;
        }
        return EnumC23663t.f114628u;
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStorePagePresenter
    /* renamed from: N1 */
    public List mo69054N1() {
        List m17852k;
        C3526u m17610O = m69045Iq().m17610O();
        if (m17610O == null || (m17852k = m17610O.m17852k()) == null) {
            return new ArrayList();
        }
        return m17852k;
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStorePagePresenter
    /* renamed from: Nq */
    public List mo69055Nq() {
        ArrayList arrayList = new ArrayList();
        C3526u m17610O = m69045Iq().m17610O();
        if (m17610O != null) {
            int i11 = C12393a.f64479a[this.f64473Q.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            arrayList.addAll(m17610O.m17851j(EnumC2382z.f9946s));
                        }
                    } else {
                        arrayList.addAll(m17610O.m17851j(EnumC2382z.f9947t));
                    }
                } else {
                    arrayList.addAll(m17610O.m17851j(EnumC2382z.f9945r));
                }
            } else {
                arrayList.addAll(m17610O.m17851j(EnumC2382z.f9945r));
                arrayList.addAll(m17610O.m17851j(EnumC2382z.f9947t));
                arrayList.addAll(m17610O.m17851j(EnumC2382z.f9946s));
            }
        }
        return arrayList;
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStorePagePresenter, androidx.lifecycle.InterfaceC1767f
    /* renamed from: Ro */
    public void mo8646Ro(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8646Ro(interfaceC1801w);
        MediaStoreBasePage.InterfaceC12276c m69042Gq = m69042Gq();
        if (m69042Gq != null) {
            m69042Gq.mo68948b(mo69054N1());
        }
        if (m69075nr() != mo69068fj()) {
            m69078tr(mo69068fj());
            MediaStoreBasePage.InterfaceC12275b m69040Cq = m69040Cq();
            if (m69040Cq != null) {
                m69040Cq.mo68940o4(m69075nr());
            }
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStorePagePresenter
    /* renamed from: Uq */
    public void mo69059Uq(int i11, MediaStoreItem mediaStoreItem) {
        AbstractC19074t.m100208f(mediaStoreItem, "item");
        if (this.f64473Q == EnumC2382z.f9944q) {
            m69072kq(C23250w4.f112644a.m119823J(mediaStoreItem.m40599m()), mediaStoreItem);
        } else {
            super.mo69059Uq(i11, mediaStoreItem);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.search.InterfaceC12404a
    /* renamed from: Ve */
    public void mo69643Ve(MediaStoreSearchPage.EnumC12391a enumC12391a) {
        AbstractC19074t.m100208f(enumC12391a, "modeSearch");
        this.f64475S = enumC12391a;
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStorePagePresenter, androidx.lifecycle.InterfaceC1767f
    /* renamed from: Xy */
    public void mo8647Xy(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8647Xy(interfaceC1801w);
        m69642Lr(false);
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStorePagePresenter, com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: b3 */
    public void mo69063b3() {
        super.mo69063b3();
        if (this.f64473Q != EnumC2382z.f9944q) {
            ((InterfaceC12371j) m103742Dp()).mo68928yF(8, MultiStateView.EnumC15914e.LOADING);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStorePagePresenter, com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: gv */
    public void mo69070gv() {
        EnumC2382z enumC2382z = this.f64473Q;
        if (enumC2382z != EnumC2382z.f9944q) {
            m69641Jr(enumC2382z);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.search.InterfaceC12404a
    /* renamed from: jD */
    public C7226u3.d mo69644jD() {
        return new C12394b();
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStorePagePresenter
    /* renamed from: lr */
    protected boolean mo69074lr(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "messageId");
        Iterator it = mo69055Nq().iterator();
        while (it.hasNext()) {
            List m40823l = ((C7906d) it.next()).m40823l();
            if (!(m40823l instanceof Collection) || !m40823l.isEmpty()) {
                Iterator it2 = m40823l.iterator();
                while (it2.hasNext()) {
                    if (AbstractC19074t.m100204b(((MediaStoreItem) it2.next()).m40571M(), messageId)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStorePagePresenter
    /* renamed from: oq */
    public void mo69076oq() {
        this.f64474R.clear();
        C3526u m17610O = m69045Iq().m17610O();
        if (m17610O != null) {
            m17610O.m17843b();
        }
        for (C7906d c7906d : mo69055Nq()) {
            c7906d.m40833v(false);
            Iterator it = c7906d.m40823l().iterator();
            while (it.hasNext()) {
                ((MediaStoreItem) it.next()).m40558A0(false);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.search.InterfaceC12404a
    /* renamed from: uF */
    public MediaStoreSearchPage.EnumC12391a mo69645uF() {
        return this.f64475S;
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStorePagePresenter
    /* renamed from: uq */
    public void mo69080uq(boolean z11) {
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStorePagePresenter
    /* renamed from: vq */
    public void mo69083vq(MediaStoreItem mediaStoreItem, boolean z11) {
        AbstractC19074t.m100208f(mediaStoreItem, "item");
        C3526u m17610O = m69045Iq().m17610O();
        if (m17610O != null) {
            boolean contains = this.f64474R.contains(mediaStoreItem.m40616y());
            if (z11) {
                if (!contains) {
                    this.f64474R.add(mediaStoreItem.m40616y());
                }
            } else if (contains) {
                this.f64474R.remove(mediaStoreItem.m40616y());
            }
            m17610O.m17858s(mediaStoreItem, z11);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStorePagePresenter, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
        if (i11 == 174 || i11 == 175) {
            try {
                ((InterfaceC12371j) m103742Dp()).mo68879Ms(m69045Iq().m17610O(), this.f64473Q);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZCF-55", e11);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStorePagePresenter
    /* renamed from: zr */
    public void mo69085zr() {
        super.mo69085zr();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 174);
        bVar.m124119a().m124115b(this, 175);
    }
}
