package com.zing.zalo.p077ui.mediastore.media;

import ac.InterfaceC0733x;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.adapters.C7226u3;
import com.zing.zalo.control.C7905c;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.mediastore.InterfaceC12370i;
import com.zing.zalo.p077ui.mediastore.MediaStoreBasePage;
import com.zing.zalo.p077ui.mediastore.common.MediaStoreLinearLayoutManager;
import com.zing.zalo.p077ui.mediastore.media.MediaStoreMediaPage;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.C23250w4;
import mm0.AbstractC23350e;
import p542ub.InterfaceC27218a;
import qm0.AbstractC25368s;
import vc0.AbstractC27964c;
import x70.AbstractC29417g1;
import zl0.AbstractC32232i;

/* loaded from: classes6.dex */
public class MediaStoreMediaPage extends MediaStoreBasePage<InterfaceC12370i> implements InterfaceC0733x {

    /* renamed from: q1 */
    private OverScroller f64446q1;

    /* renamed from: com.zing.zalo.ui.mediastore.media.MediaStoreMediaPage$a */
    /* loaded from: classes6.dex */
    public static final class C12384a extends RecyclerView.AbstractC1890q {
        C12384a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m69619c(MediaStoreMediaPage mediaStoreMediaPage) {
            AbstractC19074t.m100208f(mediaStoreMediaPage, "this$0");
            mediaStoreMediaPage.m69616oN();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1890q
        /* renamed from: a */
        public boolean mo10175a(int i11, int i12) {
            try {
                final MediaStoreMediaPage mediaStoreMediaPage = MediaStoreMediaPage.this;
                mediaStoreMediaPage.mo70710wy(new Runnable() { // from class: c80.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaStoreMediaPage.C12384a.m69619c(MediaStoreMediaPage.this);
                    }
                });
                return false;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return false;
            }
        }
    }

    /* renamed from: mN */
    private final MessageId m69614mN() {
        List m131502j;
        int i11;
        int m116580c;
        int m116584g;
        C7226u3 m68868IM = m68868IM();
        if (m68868IM == null || (m131502j = m68868IM.m36809f0()) == null) {
            m131502j = AbstractC25368s.m131502j();
        }
        try {
            int m68853AM = m68853AM();
            MediaStoreLinearLayoutManager m68860CM = m68860CM();
            if (m68860CM != null) {
                i11 = m68860CM.m9737T1();
            } else {
                i11 = 0;
            }
            m116580c = AbstractC22543l.m116580c(i11, m68853AM);
            m116584g = AbstractC22543l.m116584g(m131502j.size() - 1, m116580c);
            if (m68853AM <= m116584g) {
                while (true) {
                    C7905c c7905c = (C7905c) m131502j.get(m116584g);
                    if (c7905c.m40798q() == 2 && (!c7905c.m40789h().isEmpty())) {
                        return ((MediaStoreItem) c7905c.m40789h().get(0)).m40571M();
                    }
                    if (m116584g == m68853AM) {
                        break;
                    }
                    m116584g--;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return null;
    }

    /* renamed from: nN */
    private final void m69615nN() {
        this.f64446q1 = AbstractC29417g1.m146573a(m68870JM().f139658r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* renamed from: oN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m69616oN() {
        int i11;
        boolean z11;
        int i12;
        List arrayList;
        Context context;
        boolean z12;
        C7905c c7905c;
        C7226u3 m68868IM;
        C7226u3 m68868IM2;
        OverScroller overScroller = this.f64446q1;
        if (overScroller != null) {
            int i13 = 0;
            if (overScroller != null) {
                i11 = overScroller.getFinalY();
            } else {
                i11 = 0;
            }
            if (i11 == 0) {
                return;
            }
            int abs = Math.abs(i11);
            if (i11 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            MediaStoreLinearLayoutManager m68860CM = m68860CM();
            if (m68860CM != null) {
                i12 = m68860CM.m9740Y1();
            } else {
                i12 = 0;
            }
            C7226u3 m68868IM3 = m68868IM();
            if (m68868IM3 == null || (arrayList = m68868IM3.m36809f0()) == null) {
                arrayList = new ArrayList();
            }
            int size = arrayList.size();
            int m155453a = AbstractC32232i.m155453a(48.0f);
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null) {
                context = m92676n2.getContext();
            } else {
                context = null;
            }
            InterfaceC27218a m92676n22 = m92676n2();
            if (m92676n22 != null) {
                z12 = m92676n22.mo35576n3();
            } else {
                z12 = false;
            }
            float m118728m0 = (AbstractC23136l9.m118728m0(context, z12) * 1.0f) / 320;
            int i14 = -1;
            if (z11) {
                while (i12 < size) {
                    C7905c c7905c2 = (C7905c) arrayList.get(i12);
                    if (c7905c2.m40798q() == 2) {
                        i13 += (int) (c7905c2.m40787f() * m118728m0);
                    } else if (c7905c2.m40798q() == 1) {
                        i13 += m155453a;
                    }
                    if (i13 >= abs) {
                        i14 = i12;
                        break;
                    }
                    i12++;
                }
                if (!z11) {
                    if (i14 >= 0) {
                        if (i14 >= size - 10 && (m68868IM2 = m68868IM()) != null && m68868IM2.m36806U()) {
                            m68863EM().mo69065bx();
                            return;
                        }
                        return;
                    }
                    if (1 <= i13 && i13 < abs && (m68868IM = m68868IM()) != null && m68868IM.m36806U()) {
                        m68863EM().mo69065bx();
                        return;
                    }
                    return;
                }
                return;
            }
            i12--;
            while (-1 < i12) {
                if (i12 < arrayList.size()) {
                    c7905c = (C7905c) arrayList.get(i12);
                } else {
                    c7905c = null;
                }
                if (c7905c != null) {
                    if (c7905c.m40798q() == 2) {
                        i13 += (int) (c7905c.m40787f() * m118728m0);
                    } else if (c7905c.m40798q() == 1) {
                        i13 += m155453a;
                    }
                    if (i13 >= abs) {
                        i14 = i12;
                        break;
                    }
                }
                i12--;
            }
            if (!z11) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:4:0x0012, B:6:0x0018, B:9:0x0025, B:10:0x002b, B:12:0x0031, B:14:0x003e, B:16:0x0048, B:21:0x0052, B:22:0x0056, B:24:0x005c, B:29:0x006f, B:20:0x0069, B:39:0x0021), top: B:3:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f A[Catch: Exception -> 0x001f, TRY_LEAVE, TryCatch #0 {Exception -> 0x001f, blocks: (B:4:0x0012, B:6:0x0018, B:9:0x0025, B:10:0x002b, B:12:0x0031, B:14:0x003e, B:16:0x0048, B:21:0x0052, B:22:0x0056, B:24:0x005c, B:29:0x006f, B:20:0x0069, B:39:0x0021), top: B:3:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c A[SYNTHETIC] */
    /* renamed from: pN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m69617pN(MediaStoreMediaPage mediaStoreMediaPage) {
        List m131502j;
        Iterator it;
        int i11;
        AbstractC19074t.m100208f(mediaStoreMediaPage, "this$0");
        MessageId m69614mN = mediaStoreMediaPage.m69614mN();
        mediaStoreMediaPage.m68863EM().mo69036Aj();
        if (m69614mN != null) {
            try {
                C7226u3 m68868IM = mediaStoreMediaPage.m68868IM();
                if (m68868IM != null) {
                    m131502j = m68868IM.m36809f0();
                    if (m131502j == null) {
                    }
                    it = m131502j.iterator();
                    i11 = 0;
                    loop0: while (true) {
                        if (!it.hasNext()) {
                            C7905c c7905c = (C7905c) it.next();
                            if (c7905c.m40798q() == 2) {
                                List m40789h = c7905c.m40789h();
                                if (!(m40789h instanceof Collection) || !m40789h.isEmpty()) {
                                    Iterator it2 = m40789h.iterator();
                                    while (it2.hasNext()) {
                                        if (((MediaStoreItem) it2.next()).m40604o0(m69614mN)) {
                                            break loop0;
                                        }
                                    }
                                }
                            }
                            i11++;
                        } else {
                            i11 = -1;
                            break;
                        }
                    }
                    if (i11 < 0) {
                        mediaStoreMediaPage.m68877ME(i11, 0);
                        return;
                    }
                    return;
                }
                m131502j = AbstractC25368s.m131502j();
                it = m131502j.iterator();
                i11 = 0;
                loop0: while (true) {
                    if (!it.hasNext()) {
                    }
                    i11++;
                }
                if (i11 < 0) {
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage
    /* renamed from: KM */
    public void mo68875KM(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        int i11;
        AbstractC19074t.m100208f(rect, "outRect");
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(recyclerView, "parent");
        AbstractC19074t.m100208f(c1899z, "state");
        int m9817A0 = recyclerView.m9817A0(view);
        int m10253b = c1899z.m10253b();
        if (m10253b > 0 && m9817A0 == m10253b - 1) {
            MediaStoreBasePage.InterfaceC12275b m68929yM = m68929yM();
            if (m68929yM != null) {
                i11 = m68929yM.mo68941p4();
            } else {
                i11 = 0;
            }
            rect.bottom = i11;
            return;
        }
        rect.bottom = (int) (2 * ((AbstractC23136l9.m118725l0(getContext()) * 1.0f) / 320));
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        if (super.mo37488Li() && m92650VI() == null) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage
    /* renamed from: NM */
    public C7226u3 mo68881NM(C7226u3.b bVar) {
        AbstractC19074t.m100208f(bVar, "createMSPageAdapterParams");
        C7226u3 mo68881NM = super.mo68881NM(bVar);
        C23250w4.f112644a.m119833e(mo68881NM, m68870JM().getRoot());
        return mo68881NM;
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage
    /* renamed from: UM */
    public InterfaceC12370i mo68889UM() {
        return new MediaStoreMediaPagePresenter(this);
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage
    /* renamed from: VM */
    public void mo68890VM(AbstractC27964c.a aVar, C7226u3.b bVar) {
        AbstractC19074t.m100208f(aVar, "dragSelectionListener");
        AbstractC19074t.m100208f(bVar, "createMSPageAdapterParams");
        super.mo68890VM(aVar, bVar);
        m68870JM().f139658r.setOnFlingListener(new C12384a());
        m69615nN();
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage, com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: ks */
    public void mo68915ks() {
        AbstractC19444a.m101697e(new Runnable() { // from class: c80.d
            @Override // java.lang.Runnable
            public final void run() {
                MediaStoreMediaPage.m69617pN(MediaStoreMediaPage.this);
            }
        });
    }
}
