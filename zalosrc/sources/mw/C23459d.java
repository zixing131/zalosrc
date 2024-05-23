package mw;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.ZaloBubbleActivity;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.mycloud.collection.CollectionDetailView;
import com.zing.zalo.p077ui.mycloud.collection.PopupAddItemsToCollection;
import com.zing.zalo.p077ui.zviews.BottomPickerView;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import me0.AbstractC23136l9;
import me0.AbstractC23211s7;
import me0.AbstractC23222t7;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import p161fg.C18922m;
import p209hg.C20052c;
import p279jw.C21373a;
import p348mi.AbstractC23306f;
import p542ub.InterfaceC27218a;
import pk.C24799c;
import ui0.C27280g;

/* renamed from: mw.d */
/* loaded from: classes4.dex */
public final class C23459d {

    /* renamed from: a */
    public static final C23459d f113954a = new C23459d();

    private C23459d() {
    }

    /* renamed from: f */
    public static /* synthetic */ void m123159f(C23459d c23459d, ZaloView zaloView, ArrayList arrayList, String str, String str2, boolean z11, int i11, Object obj) {
        boolean z12;
        if ((i11 & 16) != 0) {
            z12 = false;
        } else {
            z12 = z11;
        }
        c23459d.m123166e(zaloView, arrayList, str, str2, z12);
    }

    /* renamed from: h */
    public static /* synthetic */ void m123160h(C23459d c23459d, ZaloView zaloView, C24799c c24799c, byte b11, boolean z11, int i11, CharSequence charSequence, boolean z12, int i12, Object obj) {
        boolean z13;
        if ((i12 & 64) != 0) {
            z13 = false;
        } else {
            z13 = z12;
        }
        c23459d.m123167g(zaloView, c24799c, b11, z11, i11, charSequence, z13);
    }

    /* renamed from: i */
    public static final void m123161i(C24799c c24799c, ZaloView zaloView, View view) {
        C17487o0 mo35579p;
        AbstractC19074t.m100208f(c24799c, "$collectionInfo");
        AbstractC19074t.m100208f(zaloView, "$finalZaloView");
        try {
            Bundle bundle = new Bundle();
            bundle.putLong("extra_collection_id", c24799c.m128824d());
            InterfaceC27218a m92676n2 = zaloView.m92676n2();
            if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
                mo35579p.m93069k2(CollectionDetailView.class, bundle, 1, true);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: l */
    public static /* synthetic */ void m123162l(C23459d c23459d, ZaloView zaloView, ArrayList arrayList, String str, String str2, boolean z11, int i11, Object obj) {
        boolean z12;
        if ((i11 & 16) != 0) {
            z12 = false;
        } else {
            z12 = z11;
        }
        c23459d.m123169k(zaloView, arrayList, str, str2, z12);
    }

    /* renamed from: m */
    public static final void m123163m(boolean z11, ZaloView zaloView, ArrayList arrayList, String str, String str2, boolean z12, View view) {
        AbstractC19074t.m100208f(zaloView, "$finalZaloView");
        AbstractC19074t.m100208f(arrayList, "$listMsgId");
        AbstractC19074t.m100208f(str, "$entryPoint");
        AbstractC19074t.m100208f(str2, "$jsDataLog");
        if (z11) {
            f113954a.m123166e(zaloView, arrayList, str, str2, z12);
        } else {
            AbstractC23211s7.m119572e("204278670", zaloView.m92676n2(), str);
        }
    }

    /* renamed from: c */
    public final ZaloView m123164c() {
        C17487o0 mo35579p;
        C17487o0 mo35579p2;
        C17487o0 mo35579p3;
        ZaloBubbleActivity.C10966a c10966a = ZaloBubbleActivity.Companion;
        if (c10966a.m57054h()) {
            ZaloBubbleActivity m57051c = c10966a.m57051c();
            if (m57051c == null || (mo35579p3 = m57051c.mo35579p()) == null) {
                return null;
            }
            return mo35579p3.m93012K0();
        }
        if (C18922m.m99141t().m99164y() && C18922m.m99141t().m99165z()) {
            C20052c m99159s = C18922m.m99141t().m99159s();
            if (m99159s == null || (mo35579p2 = m99159s.mo35579p()) == null) {
                return null;
            }
            return mo35579p2.m93012K0();
        }
        InterfaceC27218a m57112d = ZaloLauncherActivity.Companion.m57112d();
        if (m57112d == null || (mo35579p = m57112d.mo35579p()) == null) {
            return null;
        }
        return mo35579p.m93012K0();
    }

    /* renamed from: d */
    public final void m123165d(ZaloView zaloView, ArrayList arrayList, String str, String str2) {
        AbstractC19074t.m100208f(arrayList, "listMsgId");
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "jsDataLog");
        m123159f(this, zaloView, arrayList, str, str2, false, 16, null);
    }

    /* renamed from: e */
    public final void m123166e(ZaloView zaloView, ArrayList arrayList, String str, String str2, boolean z11) {
        ZaloView m123164c;
        AbstractC19074t.m100208f(arrayList, "listMsgId");
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "jsDataLog");
        if (zaloView == null) {
            try {
                m123164c = m123164c();
                if (m123164c == null) {
                    return;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        } else {
            m123164c = zaloView;
        }
        if (!m123164c.m92672lJ() || !m123164c.m92687sJ() || arrayList.size() == 0) {
            return;
        }
        Bundle m78535kL = BottomPickerView.m78535kL();
        m78535kL.putParcelableArrayList("listMsgId", arrayList);
        m78535kL.putString("entryPoint", str);
        m78535kL.putString("jsDataLog", str2);
        m78535kL.putBoolean("forceShowIcon", z11);
        C17487o0 m92662fJ = m123164c.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.mo89694j2(PopupAddItemsToCollection.class, m78535kL, 0, null, 0, true);
        }
    }

    /* renamed from: g */
    public final void m123167g(final ZaloView zaloView, final C24799c c24799c, byte b11, boolean z11, int i11, CharSequence charSequence, boolean z12) {
        View m92656bJ;
        Snackbar snackbar;
        Snackbar m90669d;
        AbstractC19074t.m100208f(c24799c, "collectionInfo");
        if (zaloView == null) {
            try {
                zaloView = m123164c();
                if (zaloView == null) {
                    return;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        if (zaloView.m92672lJ() && zaloView.m92687sJ() && (m92656bJ = zaloView.m92656bJ()) != null) {
            if (b11 == 0) {
                if (i11 == 0) {
                    if (z11) {
                        Snackbar.C16925c c16925c = Snackbar.Companion;
                        String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_msg_snack_bar_add_item_to_collection_success, c24799c.m128821a());
                        AbstractC19074t.m100207e(m118746s0, "getString(...)");
                        m90669d = c16925c.m90669d(m92656bJ, m118746s0, -1);
                        m90669d.setIdTracking("btn_action_snack_bar_my_cloud_collection");
                        m90669d.m90636A(AbstractC23136l9.m118743r0(AbstractC8020f0.str_view), new View.OnClickListener() { // from class: mw.c
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C23459d.m123161i(C24799c.this, zaloView, view);
                            }
                        });
                    } else {
                        Snackbar.C16925c c16925c2 = Snackbar.Companion;
                        String m118746s02 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_add_item_collection_success, c24799c.m128821a());
                        AbstractC19074t.m100207e(m118746s02, "getString(...)");
                        m90669d = c16925c2.m90669d(m92656bJ, m118746s02, -1);
                    }
                    if (z12 || !z11) {
                        Context m92689tK = zaloView.m92689tK();
                        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                        m90669d.m90644J(C27280g.m139659b(m92689tK, AbstractC23322a.zds_ic_check_circle_solid_24, AbstractC2808b.gr60));
                    }
                } else {
                    Snackbar.C16925c c16925c3 = Snackbar.Companion;
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    m90669d = c16925c3.m90669d(m92656bJ, charSequence, -1);
                    Context m92689tK2 = zaloView.m92689tK();
                    AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
                    m90669d.m90644J(C27280g.m139659b(m92689tK2, AbstractC23322a.zds_ic_warning_solid_24, AbstractC2808b.f150830r60));
                }
                m90669d.m90645K(AbstractC23222t7.f112557e0);
                m90669d.m90648N();
                return;
            }
            if (b11 == 1) {
                if (i11 == 0) {
                    Snackbar.C16925c c16925c4 = Snackbar.Companion;
                    String m118746s03 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_remove_item_collection_success, c24799c.m128821a());
                    AbstractC19074t.m100207e(m118746s03, "getString(...)");
                    snackbar = c16925c4.m90669d(m92656bJ, m118746s03, -1);
                } else {
                    Snackbar.C16925c c16925c5 = Snackbar.Companion;
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    Snackbar m90669d2 = c16925c5.m90669d(m92656bJ, charSequence, -1);
                    Context m92689tK3 = zaloView.m92689tK();
                    AbstractC19074t.m100207e(m92689tK3, "requireContext(...)");
                    m90669d2.m90644J(C27280g.m139659b(m92689tK3, AbstractC23322a.zds_ic_warning_solid_24, AbstractC2808b.f150830r60));
                    snackbar = m90669d2;
                }
                snackbar.m90645K(AbstractC23222t7.f112557e0);
                snackbar.m90648N();
            }
        }
    }

    /* renamed from: j */
    public final void m123168j(ZaloView zaloView, ArrayList arrayList, String str, String str2) {
        AbstractC19074t.m100208f(arrayList, "listMsgId");
        AbstractC19074t.m100208f(str, "jsDataLog");
        AbstractC19074t.m100208f(str2, "entryPoint");
        m123162l(this, zaloView, arrayList, str, str2, false, 16, null);
    }

    /* renamed from: k */
    public final void m123169k(ZaloView zaloView, final ArrayList arrayList, final String str, final String str2, final boolean z11) {
        View m92656bJ;
        int i11;
        AbstractC19074t.m100208f(arrayList, "listMsgId");
        AbstractC19074t.m100208f(str, "jsDataLog");
        AbstractC19074t.m100208f(str2, "entryPoint");
        if ((zaloView == null && (zaloView = m123164c()) == null) || !zaloView.m92672lJ() || !zaloView.m92687sJ() || (m92656bJ = zaloView.m92656bJ()) == null) {
            return;
        }
        if (AbstractC23306f.m120602N0().m109048C0().isEmpty()) {
            AbstractC23306f.m120602N0().m109089v1(true);
        }
        try {
            Snackbar.C16925c c16925c = Snackbar.Companion;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_save_msg_successfully_snackbar_msg);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            Snackbar m90669d = c16925c.m90669d(m92656bJ, m118743r0, -1);
            m90669d.setIdTracking("btn_action_snack_bar_my_cloud_collection");
            final boolean m110825b = C21373a.f104231a.m110807w().m110825b();
            if (m110825b) {
                i11 = AbstractC8020f0.str_btn_add_item_to_collection;
            } else {
                i11 = AbstractC8020f0.str_view;
            }
            String m118743r02 = AbstractC23136l9.m118743r0(i11);
            AbstractC19074t.m100205c(m118743r02);
            final ZaloView zaloView2 = zaloView;
            m90669d.m90636A(m118743r02, new View.OnClickListener() { // from class: mw.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C23459d.m123163m(m110825b, zaloView2, arrayList, str2, str, z11, view);
                }
            });
            m90669d.m90645K(AbstractC23222t7.f112557e0);
            if (z11) {
                Context m92689tK = zaloView.m92689tK();
                AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                m90669d.m90644J(C27280g.m139659b(m92689tK, AbstractC23322a.zds_ic_check_circle_solid_24, AbstractC2808b.gr60));
            }
            m90669d.m90648N();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: n */
    public final void m123170n(ZaloView zaloView, int i11, CharSequence charSequence, CharSequence charSequence2) {
        View m92656bJ;
        Snackbar m90669d;
        if (zaloView == null) {
            try {
                zaloView = m123164c();
                if (zaloView == null) {
                    return;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        if (zaloView.m92672lJ() && zaloView.m92687sJ() && (m92656bJ = zaloView.m92656bJ()) != null) {
            if (i11 == 0) {
                Snackbar.C16925c c16925c = Snackbar.Companion;
                if (charSequence == null) {
                    charSequence = "";
                }
                m90669d = c16925c.m90669d(m92656bJ, charSequence, -1);
                Context m92689tK = zaloView.m92689tK();
                AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                m90669d.m90644J(C27280g.m139659b(m92689tK, AbstractC23322a.zds_ic_check_circle_solid_24, AbstractC2808b.gr60));
            } else {
                Snackbar.C16925c c16925c2 = Snackbar.Companion;
                if (charSequence2 == null) {
                    charSequence2 = "";
                }
                m90669d = c16925c2.m90669d(m92656bJ, charSequence2, -1);
                Context m92689tK2 = zaloView.m92689tK();
                AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
                m90669d.m90644J(C27280g.m139659b(m92689tK2, AbstractC23322a.zds_ic_warning_solid_24, AbstractC2808b.f150830r60));
            }
            m90669d.m90648N();
        }
    }
}
