package com.zing.zalo.p077ui.settings.subsettings;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.settings.subsettings.BlockCallView;
import com.zing.zalo.p077ui.settings.widget.ItemContactView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.avatar.C16948d;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.C23212s8;
import p304ks.C21914b;
import p649xl.C29810g0;
import p716zh.C31991k8;
import p716zh.C32002l4;

/* loaded from: classes6.dex */
public final class BlockCallView extends SlidableZaloView {

    /* renamed from: P0 */
    public C29810g0 f68165P0;

    /* renamed from: Q0 */
    private C13245a f68166Q0;

    /* renamed from: R0 */
    private ContactProfile f68167R0;

    /* renamed from: S0 */
    private boolean f68168S0;

    /* renamed from: T0 */
    private final int f68169T0 = 1;

    /* renamed from: com.zing.zalo.ui.settings.subsettings.BlockCallView$a */
    /* loaded from: classes6.dex */
    public static final class C13245a extends BaseAdapter {

        /* renamed from: p */
        private List f68170p = new ArrayList();

        /* renamed from: q */
        private a f68171q;

        /* renamed from: r */
        private boolean f68172r;

        /* renamed from: com.zing.zalo.ui.settings.subsettings.BlockCallView$a$a */
        /* loaded from: classes6.dex */
        public interface a {
            /* renamed from: a */
            void mo74434a(ContactProfile contactProfile);

            /* renamed from: w */
            void mo74435w(ContactProfile contactProfile);
        }

        public C13245a(a aVar) {
            this.f68171q = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m74429d(C13245a c13245a, ContactProfile contactProfile, View view) {
            AbstractC19074t.m100208f(c13245a, "this$0");
            AbstractC19074t.m100208f(contactProfile, "$contact");
            a aVar = c13245a.f68171q;
            if (aVar != null) {
                aVar.mo74434a(contactProfile);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m74430e(C13245a c13245a, ContactProfile contactProfile, View view) {
            AbstractC19074t.m100208f(c13245a, "this$0");
            AbstractC19074t.m100208f(contactProfile, "$contact");
            a aVar = c13245a.f68171q;
            if (aVar != null) {
                aVar.mo74435w(contactProfile);
            }
        }

        @Override // android.widget.Adapter
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public ContactProfile getItem(int i11) {
            return (ContactProfile) this.f68170p.get(i11);
        }

        /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:            r1 = qm0.AbstractC25332a0.m131187O0(r1);     */
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m74432f(List list) {
            List arrayList;
            if (list == null || arrayList == null) {
                arrayList = new ArrayList();
            }
            this.f68170p = arrayList;
        }

        /* renamed from: g */
        public final void m74433g(boolean z11) {
            this.f68172r = z11;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f68170p.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i11) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int i11, View view, ViewGroup viewGroup) {
            ItemContactView itemContactView;
            boolean z11;
            AbstractC19074t.m100208f(viewGroup, "parent");
            try {
                if (view != null) {
                    itemContactView = (ItemContactView) view;
                } else {
                    Context context = viewGroup.getContext();
                    AbstractC19074t.m100207e(context, "getContext(...)");
                    itemContactView = new ItemContactView(context);
                    itemContactView.setIdTracking("ITEM_BLOCK_LIST");
                    itemContactView.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
                }
                itemContactView.getAvatar().setImageDrawable(C23212s8.m119609q(itemContactView.getAvatar().getContext(), AbstractC16781w.default_avatar));
                final ContactProfile contactProfile = (ContactProfile) this.f68170p.get(i11);
                if (i11 < this.f68170p.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                itemContactView.m90592m(z11);
                String m40383Q = contactProfile.m40383Q(true, false);
                AbstractC19074t.m100207e(m40383Q, "getDpnPhoneContact(...)");
                itemContactView.setTitle(m40383Q);
                itemContactView.getAvatar().setScrollingMode(this.f68172r);
                Avatar avatar = itemContactView.getAvatar();
                C16948d m40361D = contactProfile.m40361D();
                AbstractC19074t.m100207e(m40361D, "getAvatarProperties(...)");
                avatar.m90478m(m40361D);
                itemContactView.getBtnAction().setText(MainApplication.Companion.m35500c().getString(AbstractC8020f0.btn_func_Unblock));
                itemContactView.getBtnAction().setOnClickListener(new View.OnClickListener() { // from class: oa0.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        BlockCallView.C13245a.m74429d(BlockCallView.C13245a.this, contactProfile, view2);
                    }
                });
                itemContactView.getRootView().setOnClickListener(new View.OnClickListener() { // from class: oa0.d
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        BlockCallView.C13245a.m74430e(BlockCallView.C13245a.this, contactProfile, view2);
                    }
                });
                return itemContactView;
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return new View(viewGroup.getContext());
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.subsettings.BlockCallView$b */
    /* loaded from: classes6.dex */
    public static final class C13246b implements InterfaceC20094a {
        C13246b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m74438e(BlockCallView blockCallView) {
            AbstractC19074t.m100208f(blockCallView, "this$0");
            blockCallView.m74422pM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m74439f(BlockCallView blockCallView, C20096c c20096c) {
            Integer num;
            int i11;
            MultiStateView.EnumC15915f enumC15915f;
            AbstractC19074t.m100208f(blockCallView, "this$0");
            try {
                blockCallView.m74425sM(false);
                if (c20096c != null) {
                    num = Integer.valueOf(c20096c.m104491c());
                } else {
                    num = null;
                }
                if (blockCallView.m74420lM() != null) {
                    C13245a m74420lM = blockCallView.m74420lM();
                    AbstractC19074t.m100205c(m74420lM);
                    if (m74420lM.getCount() == 0) {
                        blockCallView.m74419kM().f137830r.setVisibility(0);
                        MultiStateView multiStateView = blockCallView.m74419kM().f137830r;
                        if (num != null && num.intValue() == 50001) {
                            i11 = AbstractC8020f0.NETWORK_ERROR_MSG;
                            multiStateView.setErrorTitleString(AbstractC23136l9.m118743r0(i11));
                            blockCallView.m74419kM().f137830r.setState(MultiStateView.EnumC15914e.ERROR);
                            MultiStateView multiStateView2 = blockCallView.m74419kM().f137830r;
                            if (num != null && num.intValue() == 50001) {
                                enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                                multiStateView2.setErrorType(enumC15915f);
                            }
                            enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                            multiStateView2.setErrorType(enumC15915f);
                        }
                        i11 = AbstractC8020f0.str_error_loadingList;
                        multiStateView.setErrorTitleString(AbstractC23136l9.m118743r0(i11));
                        blockCallView.m74419kM().f137830r.setState(MultiStateView.EnumC15914e.ERROR);
                        MultiStateView multiStateView22 = blockCallView.m74419kM().f137830r;
                        if (num != null) {
                            enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                            multiStateView22.setErrorType(enumC15915f);
                        }
                        enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                        multiStateView22.setErrorType(enumC15915f);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            final BlockCallView blockCallView = BlockCallView.this;
            blockCallView.mo70710wy(new Runnable() { // from class: oa0.f
                @Override // java.lang.Runnable
                public final void run() {
                    BlockCallView.C13246b.m74439f(BlockCallView.this, c20096c);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            final BlockCallView blockCallView = BlockCallView.this;
            blockCallView.mo70710wy(new Runnable() { // from class: oa0.e
                @Override // java.lang.Runnable
                public final void run() {
                    BlockCallView.C13246b.m74438e(BlockCallView.this);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.subsettings.BlockCallView$c */
    /* loaded from: classes6.dex */
    public static final class C13247c implements C13245a.a {
        C13247c() {
        }

        @Override // com.zing.zalo.p077ui.settings.subsettings.BlockCallView.C13245a.a
        /* renamed from: a */
        public void mo74434a(ContactProfile contactProfile) {
            AbstractC19074t.m100208f(contactProfile, "cp");
            BlockCallView.this.m74424rM(contactProfile);
            BlockCallView blockCallView = BlockCallView.this;
            blockCallView.showDialog(blockCallView.f68169T0);
        }

        @Override // com.zing.zalo.p077ui.settings.subsettings.BlockCallView.C13245a.a
        /* renamed from: w */
        public void mo74435w(ContactProfile contactProfile) {
            AbstractC19074t.m100208f(contactProfile, "cp");
            C31991k8 c31991k8 = new C31991k8(contactProfile.f42434r, false, C32002l4.Companion.m154288b(ZMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM, 14));
            c31991k8.f147213i = contactProfile;
            AbstractC23152n3.m119060o0(BlockCallView.this.m92662fJ(), c31991k8, 0, 1);
            BlockCallView.this.m74426tM(true);
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.subsettings.BlockCallView$d */
    /* loaded from: classes6.dex */
    public static final class C13248d implements AbsListView.OnScrollListener {
        C13248d() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
            AbstractC19074t.m100208f(absListView, "view");
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            AbstractC19074t.m100208f(absListView, "view");
            if (i11 == 0) {
                if (BlockCallView.this.m74420lM() != null) {
                    C13245a m74420lM = BlockCallView.this.m74420lM();
                    if (m74420lM != null) {
                        m74420lM.m74433g(false);
                    }
                    C13245a m74420lM2 = BlockCallView.this.m74420lM();
                    if (m74420lM2 != null) {
                        m74420lM2.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
                C13245a m74420lM3 = BlockCallView.this.m74420lM();
                if (m74420lM3 != null) {
                    m74420lM3.m74433g(true);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.subsettings.BlockCallView$e */
    /* loaded from: classes6.dex */
    public static final class C13249e implements InterfaceC20094a {
        C13249e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m74441d(BlockCallView blockCallView) {
            AbstractC19074t.m100208f(blockCallView, "this$0");
            blockCallView.m74422pM();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            final BlockCallView blockCallView = BlockCallView.this;
            blockCallView.mo70710wy(new Runnable() { // from class: oa0.g
                @Override // java.lang.Runnable
                public final void run() {
                    BlockCallView.C13249e.m74441d(BlockCallView.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public static final void m74416nM(BlockCallView blockCallView) {
        AbstractC19074t.m100208f(blockCallView, "this$0");
        blockCallView.m74425sM(true);
        blockCallView.m74418jM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public static final void m74417oM(BlockCallView blockCallView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(blockCallView, "this$0");
        interfaceC17463d.dismiss();
        ContactProfile contactProfile = blockCallView.f68167R0;
        if (contactProfile != null) {
            C21914b c21914b = C21914b.f107731a;
            String str = contactProfile.f42434r;
            AbstractC19074t.m100207e(str, "uid");
            c21914b.m114202m(str, 2, new C13249e());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == this.f68169T0) {
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43159h(1).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_remove_from_ignorelist)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), new InterfaceC17463d.d() { // from class: oa0.a
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    BlockCallView.m74417oM(BlockCallView.this, interfaceC17463d, i12);
                }
            });
            return aVar.m43152a();
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29810g0 m147970c = C29810g0.m147970c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m147970c, "inflate(...)");
        m74423qM(m147970c);
        m74421mM();
        return m74419kM().getRoot();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.title_setting_block_call);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            m87077NK.setMiddleTitle(m118743r0);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "BlockCallView";
    }

    /* renamed from: jM */
    public final void m74418jM() {
        C21914b.f107731a.m114196f(true, new C13246b());
    }

    /* renamed from: kM */
    public final C29810g0 m74419kM() {
        C29810g0 c29810g0 = this.f68165P0;
        if (c29810g0 != null) {
            return c29810g0;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: lM */
    public final C13245a m74420lM() {
        return this.f68166Q0;
    }

    /* renamed from: mM */
    public final void m74421mM() {
        this.f68166Q0 = new C13245a(new C13247c());
        m74419kM().f137829q.setAdapter((ListAdapter) this.f68166Q0);
        m74419kM().f137829q.setOnScrollListener(new C13248d());
        m74419kM().f137830r.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: oa0.b
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                BlockCallView.m74416nM(BlockCallView.this);
            }
        });
        m74419kM().f137830r.setEmptyViewString(AbstractC23136l9.m118743r0(AbstractC8020f0.ignorelist_empty_v2));
        m74419kM().f137830r.setLoadingString(AbstractC23136l9.m118743r0(AbstractC8020f0.loading));
        m74425sM(true);
        m74418jM();
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (this.f68168S0) {
            m74422pM();
        }
        this.f68168S0 = false;
    }

    /* renamed from: pM */
    public final void m74422pM() {
        C13245a c13245a = this.f68166Q0;
        if (c13245a != null) {
            c13245a.m74432f(C21914b.f107731a.m114198i());
        }
        C13245a c13245a2 = this.f68166Q0;
        if (c13245a2 != null) {
            c13245a2.notifyDataSetChanged();
        }
        m74425sM(false);
    }

    /* renamed from: qM */
    public final void m74423qM(C29810g0 c29810g0) {
        AbstractC19074t.m100208f(c29810g0, "<set-?>");
        this.f68165P0 = c29810g0;
    }

    /* renamed from: rM */
    public final void m74424rM(ContactProfile contactProfile) {
        this.f68167R0 = contactProfile;
    }

    /* renamed from: sM */
    public final void m74425sM(boolean z11) {
        try {
            if (z11) {
                m74419kM().f137830r.setVisibility(0);
                m74419kM().f137830r.setState(MultiStateView.EnumC15914e.LOADING);
                m74419kM().f137829q.setVisibility(8);
            } else {
                C13245a c13245a = this.f68166Q0;
                if (c13245a != null) {
                    AbstractC19074t.m100205c(c13245a);
                    if (c13245a.getCount() > 0) {
                        m74419kM().f137830r.setVisibility(8);
                        m74419kM().f137829q.setVisibility(0);
                    }
                }
                m74419kM().f137830r.setVisibility(0);
                m74419kM().f137829q.setVisibility(8);
                m74419kM().f137830r.setEmptyImageResourceId(AbstractC16803z.zillus_block_friend);
                m74419kM().f137830r.setState(MultiStateView.EnumC15914e.EMPTY);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: tM */
    public final void m74426tM(boolean z11) {
        this.f68168S0 = z11;
    }
}
