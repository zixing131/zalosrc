package com.zing.zalo.p077ui.mediastore;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.EnumC2363o;
import au.EnumC2382z;
import ci.AbstractC3498e;
import ci.AbstractC3501f0;
import ci.C3490a;
import ci.C3499e0;
import ci.C3521p0;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.C7226u3;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.control.C7905c;
import com.zing.zalo.control.C7906d;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.control.mediastore.CreateMediaStoreParam;
import com.zing.zalo.p077ui.custom.AbstractC11859g;
import com.zing.zalo.p077ui.imageviewer.C12063c;
import com.zing.zalo.p077ui.mediastore.MediaStoreAvatarPickerView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.animation.AnimationTarget;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import hm0.C20096c;
import i40.C20275e;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23041d2;
import me0.AbstractC23078g6;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import me0.AbstractC23258x2;
import me0.C23250w4;
import me0.C23278z2;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import p322lf.AbstractC22470k;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p354n3.C23528a;
import p363nh.C23744a;
import p379o3.C23995f;
import p379o3.C23999j;
import p461qu.AbstractC25495a;
import p471r3.EnumC25629a;
import p542ub.InterfaceC27218a;
import p698yz.AbstractC31125u;
import p716zh.AbstractC32146v5;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import x70.AbstractC29417g1;
import zl0.AbstractC32232i;

/* loaded from: classes6.dex */
public class MediaStoreAvatarPickerView extends SlidableZaloView implements C23744a.c {
    public static final C12265a Companion = new C12265a(null);

    /* renamed from: P0 */
    private View f63925P0;

    /* renamed from: Q0 */
    private RecyclerView f63926Q0;

    /* renamed from: R0 */
    private C7226u3 f63927R0;

    /* renamed from: S0 */
    private MultiStateView f63928S0;

    /* renamed from: T0 */
    private LinearLayoutManager f63929T0;

    /* renamed from: U0 */
    private AbstractC11859g f63930U0;

    /* renamed from: V0 */
    private RobotoTextView f63931V0;

    /* renamed from: W0 */
    private AppCompatImageView f63932W0;

    /* renamed from: X0 */
    private View f63933X0;

    /* renamed from: Y0 */
    private boolean f63934Y0;

    /* renamed from: Z0 */
    private boolean f63935Z0;

    /* renamed from: b1 */
    private String f63937b1;

    /* renamed from: d1 */
    private boolean f63939d1;

    /* renamed from: e1 */
    private final InterfaceC24854k f63940e1;

    /* renamed from: f1 */
    public C3499e0 f63941f1;

    /* renamed from: g1 */
    private C23528a f63942g1;

    /* renamed from: h1 */
    private List f63943h1;

    /* renamed from: i1 */
    private ZdsActionBar f63944i1;

    /* renamed from: j1 */
    private AbstractC3501f0 f63945j1;

    /* renamed from: k1 */
    private boolean f63946k1;

    /* renamed from: l1 */
    private String f63947l1;

    /* renamed from: m1 */
    private OverScroller f63948m1;

    /* renamed from: a1 */
    private int f63936a1 = -1;

    /* renamed from: c1 */
    private String f63938c1 = "";

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreAvatarPickerView$a */
    /* loaded from: classes6.dex */
    public static final class C12265a {
        private C12265a() {
        }

        public /* synthetic */ C12265a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreAvatarPickerView$b */
    /* loaded from: classes6.dex */
    public static final class C12266b extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ C12063c.f f63949l1;

        /* renamed from: m1 */
        final /* synthetic */ C12063c.d.a f63950m1;

        /* renamed from: n1 */
        final /* synthetic */ int f63951n1;

        C12266b(C12063c.f fVar, C12063c.d.a aVar, int i11) {
            this.f63949l1 = fVar;
            this.f63950m1 = aVar;
            this.f63951n1 = i11;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0059 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:3:0x0014, B:5:0x001c, B:7:0x0024, B:10:0x002f, B:11:0x0055, B:13:0x0059, B:18:0x0035, B:20:0x003b, B:23:0x0043, B:25:0x004a), top: B:2:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            C12063c.d.a aVar;
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "imageview");
            AbstractC19074t.m100208f(c3979l, "bd");
            AbstractC19074t.m100208f(c23995f, "status");
            try {
                int i11 = 3;
                if (this.f63949l1.f62952c != 2 || (c23995f.m125658i() != 301 && c23995f.m125658i() != 302)) {
                    if ((c23995f.m125666q() == 3 && c23995f.m125657h() == -103) || (c23995f.m125666q() == 1 && c23995f.m125657h() == 404)) {
                        i11 = 7;
                    } else {
                        i11 = 0;
                    }
                    aVar = this.f63950m1;
                    if (aVar == null) {
                        aVar.mo67298a(this.f63949l1, this.f63951n1, c3979l, i11);
                        return;
                    }
                    return;
                }
                AbstractC23304d.f113361a3.add(str);
                aVar = this.f63950m1;
                if (aVar == null) {
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreAvatarPickerView$c */
    /* loaded from: classes6.dex */
    public static final class C12267c extends AbstractC11859g {

        /* renamed from: U */
        final /* synthetic */ MediaStoreAvatarPickerView f63952U;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12267c(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, MediaStoreAvatarPickerView mediaStoreAvatarPickerView, RecyclerView recyclerView) {
            super(recyclerView, stateListDrawable, drawable, stateListDrawable2, drawable2);
            this.f63952U = mediaStoreAvatarPickerView;
        }

        @Override // com.zing.zalo.p077ui.custom.AbstractC11859g
        /* renamed from: f0 */
        protected void mo46066f0() {
            C7226u3 c7226u3 = this.f63952U.f63927R0;
            if (c7226u3 == null) {
                AbstractC19074t.m100223u("mAdapter");
                c7226u3 = null;
            }
            c7226u3.m10008p();
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreAvatarPickerView$d */
    /* loaded from: classes6.dex */
    public static final class C12268d implements C7226u3.a {
        C12268d() {
        }

        @Override // com.zing.zalo.adapters.C7226u3.a
        /* renamed from: b */
        public void mo36822b() {
            MediaStoreAvatarPickerView.this.m68802EM(true);
        }

        @Override // com.zing.zalo.adapters.C7226u3.a
        /* renamed from: c */
        public void mo36823c(MediaStoreItem mediaStoreItem) {
            AbstractC19074t.m100208f(mediaStoreItem, "item");
            Context m92689tK = MediaStoreAvatarPickerView.this.m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            ToastUtils.showMess(AbstractC31125u.m151164V(m92689tK, mediaStoreItem));
        }

        @Override // com.zing.zalo.adapters.C7226u3.a
        /* renamed from: d */
        public void mo36824d(MediaStoreItem mediaStoreItem, AnimationTarget animationTarget, int i11, C20275e c20275e) {
            AbstractC19074t.m100208f(mediaStoreItem, "item");
            AbstractC19074t.m100208f(animationTarget, "animationTarget");
            AbstractC19074t.m100208f(c20275e, "imageViewerAnimationController");
            MediaStoreAvatarPickerView.this.m68805JM(mediaStoreItem, i11);
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreAvatarPickerView$e */
    /* loaded from: classes6.dex */
    public static final class C12269e extends RecyclerView.AbstractC1887n {
        C12269e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            rect.bottom = (int) (2 * ((AbstractC23136l9.m118722k0() * 1.0f) / 320));
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreAvatarPickerView$f */
    /* loaded from: classes6.dex */
    public static final class C12270f extends RecyclerView.AbstractC1892s {
        C12270f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
            C7226u3 c7226u3 = null;
            try {
                if (i11 == 0) {
                    C7226u3 c7226u32 = MediaStoreAvatarPickerView.this.f63927R0;
                    if (c7226u32 == null) {
                        AbstractC19074t.m100223u("mAdapter");
                        c7226u32 = null;
                    }
                    c7226u32.m36799I0(false);
                    C7226u3 c7226u33 = MediaStoreAvatarPickerView.this.f63927R0;
                    if (c7226u33 == null) {
                        AbstractC19074t.m100223u("mAdapter");
                    } else {
                        c7226u3 = c7226u33;
                    }
                    c7226u3.m10008p();
                    return;
                }
                C7226u3 c7226u34 = MediaStoreAvatarPickerView.this.f63927R0;
                if (c7226u34 == null) {
                    AbstractC19074t.m100223u("mAdapter");
                } else {
                    c7226u3 = c7226u34;
                }
                c7226u3.m36799I0(true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo10176d(recyclerView, i11, i12);
            try {
                LinearLayoutManager linearLayoutManager = MediaStoreAvatarPickerView.this.f63929T0;
                LinearLayoutManager linearLayoutManager2 = null;
                if (linearLayoutManager == null) {
                    AbstractC19074t.m100223u("mLinearLayoutManager");
                    linearLayoutManager = null;
                }
                int m9745c2 = linearLayoutManager.m9745c2();
                LinearLayoutManager linearLayoutManager3 = MediaStoreAvatarPickerView.this.f63929T0;
                if (linearLayoutManager3 == null) {
                    AbstractC19074t.m100223u("mLinearLayoutManager");
                } else {
                    linearLayoutManager2 = linearLayoutManager3;
                }
                int m10127i = linearLayoutManager2.m10127i();
                if (m9745c2 >= m10127i - 3) {
                    MediaStoreAvatarPickerView.this.m68801CM();
                }
                MediaStoreAvatarPickerView.this.f63936a1 = (m10127i - 1) - m9745c2;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreAvatarPickerView$g */
    /* loaded from: classes6.dex */
    public static final class C12271g extends RecyclerView.AbstractC1890q {
        C12271g() {
        }

        /* renamed from: c */
        public static final void m68810c(MediaStoreAvatarPickerView mediaStoreAvatarPickerView) {
            AbstractC19074t.m100208f(mediaStoreAvatarPickerView, "this$0");
            mediaStoreAvatarPickerView.m68772UM();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1890q
        /* renamed from: a */
        public boolean mo10175a(int i11, int i12) {
            AbstractC19444a.m101695c(new Runnable() { // from class: x70.g
                public /* synthetic */ RunnableC29415g() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MediaStoreAvatarPickerView.C12271g.m68810c(MediaStoreAvatarPickerView.this);
                }
            });
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreAvatarPickerView$h */
    /* loaded from: classes6.dex */
    public static final class C12272h extends AbstractC3501f0 {
        C12272h() {
        }

        /* renamed from: l */
        public static final void m68814l(MediaStoreAvatarPickerView mediaStoreAvatarPickerView) {
            AbstractC19074t.m100208f(mediaStoreAvatarPickerView, "this$0");
            mediaStoreAvatarPickerView.m68759BM();
        }

        /* renamed from: m */
        public static final void m68815m(C20096c c20096c, MediaStoreAvatarPickerView mediaStoreAvatarPickerView, EnumC2382z enumC2382z) {
            boolean z11;
            AbstractC11859g abstractC11859g;
            boolean z12;
            MultiStateView.EnumC15915f enumC15915f;
            int i11;
            AbstractC19074t.m100208f(mediaStoreAvatarPickerView, "this$0");
            AbstractC19074t.m100208f(enumC2382z, "$mediaStoreType");
            boolean z13 = false;
            boolean z14 = true;
            if (c20096c != null) {
                try {
                    if (c20096c.m104491c() == 0) {
                        if (mediaStoreAvatarPickerView.m68804HM().m17618c0(EnumC2382z.f9945r)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        mediaStoreAvatarPickerView.f63934Y0 = z11;
                        mediaStoreAvatarPickerView.m68777aN(MultiStateView.EnumC15915f.NON_ERROR);
                        mediaStoreAvatarPickerView.m68775YM(false, false);
                        mediaStoreAvatarPickerView.m68759BM();
                        if (mediaStoreAvatarPickerView.f63936a1 >= 0 && (abstractC11859g = mediaStoreAvatarPickerView.f63930U0) != null && abstractC11859g.m114868x()) {
                            LinearLayoutManager linearLayoutManager = mediaStoreAvatarPickerView.f63929T0;
                            LinearLayoutManager linearLayoutManager2 = null;
                            if (linearLayoutManager == null) {
                                AbstractC19074t.m100223u("mLinearLayoutManager");
                                linearLayoutManager = null;
                            }
                            int m10127i = linearLayoutManager.m10127i();
                            LinearLayoutManager linearLayoutManager3 = mediaStoreAvatarPickerView.f63929T0;
                            if (linearLayoutManager3 == null) {
                                AbstractC19074t.m100223u("mLinearLayoutManager");
                            } else {
                                linearLayoutManager2 = linearLayoutManager3;
                            }
                            linearLayoutManager2.mo9756v1((m10127i - 1) - mediaStoreAvatarPickerView.f63936a1);
                            return;
                        }
                        return;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            if (mediaStoreAvatarPickerView.f63943h1.isEmpty()) {
                if (c20096c != null && c20096c.m104491c() == 50001) {
                    z13 = true;
                }
                MultiStateView multiStateView = mediaStoreAvatarPickerView.f63928S0;
                if (multiStateView != null) {
                    if (z13) {
                        i11 = AbstractC8020f0.NETWORK_ERROR_MSG;
                    } else {
                        i11 = AbstractC8020f0.unknown_error;
                    }
                    multiStateView.setErrorTitleString(AbstractC23136l9.m118743r0(i11));
                }
                if (z13) {
                    enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                } else {
                    enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                }
                mediaStoreAvatarPickerView.m68777aN(enumC15915f);
            } else {
                AbstractC3498e m17615T = mediaStoreAvatarPickerView.m68804HM().m17615T(enumC2382z);
                if (m17615T != null) {
                    if (m17615T.mo17564q() > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    mediaStoreAvatarPickerView.f63935Z0 = z12;
                }
                if (m17615T != null && mediaStoreAvatarPickerView.m68804HM().m17618c0(EnumC2382z.f9945r)) {
                    z14 = false;
                }
                mediaStoreAvatarPickerView.m68775YM(false, z14);
            }
            mediaStoreAvatarPickerView.m68759BM();
        }

        /* renamed from: n */
        public static final void m68816n(boolean z11, MediaStoreAvatarPickerView mediaStoreAvatarPickerView) {
            AbstractC19074t.m100208f(mediaStoreAvatarPickerView, "this$0");
            if (!z11) {
                mediaStoreAvatarPickerView.m68759BM();
            } else {
                mediaStoreAvatarPickerView.m68775YM(true, false);
            }
        }

        @Override // ci.AbstractC3501f0
        /* renamed from: b */
        public void mo17660b(String str, EnumC2382z enumC2382z, List list, boolean z11) {
            AbstractC19074t.m100208f(str, "conversationId");
            AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
            AbstractC19074t.m100208f(list, "deletedMsgIds");
            if (TextUtils.equals(str, MediaStoreAvatarPickerView.this.m68804HM().m17608M()) && enumC2382z == EnumC2382z.f9945r) {
                MediaStoreAvatarPickerView.this.m68773VM();
                AbstractC19444a.m101697e(new Runnable() { // from class: x70.i
                    public /* synthetic */ RunnableC29421i() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaStoreAvatarPickerView.C12272h.m68814l(MediaStoreAvatarPickerView.this);
                    }
                });
            }
        }

        @Override // ci.AbstractC3501f0
        /* renamed from: d */
        public void mo17662d(String str, EnumC2382z enumC2382z, boolean z11, C20096c c20096c) {
            AbstractC19074t.m100208f(str, "conversationId");
            AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
            if (TextUtils.equals(str, MediaStoreAvatarPickerView.this.m68804HM().m17608M())) {
                MediaStoreAvatarPickerView.this.m68773VM();
                AbstractC19444a.m101697e(new Runnable() { // from class: x70.j

                    /* renamed from: q */
                    public final /* synthetic */ MediaStoreAvatarPickerView f135991q;

                    /* renamed from: r */
                    public final /* synthetic */ EnumC2382z f135992r;

                    public /* synthetic */ RunnableC29424j(MediaStoreAvatarPickerView mediaStoreAvatarPickerView, EnumC2382z enumC2382z2) {
                        r2 = mediaStoreAvatarPickerView;
                        r3 = enumC2382z2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaStoreAvatarPickerView.C12272h.m68815m(C20096c.this, r2, r3);
                    }
                });
            }
        }

        @Override // ci.AbstractC3501f0
        /* renamed from: e */
        public void mo17663e(String str, EnumC2382z enumC2382z, boolean z11) {
            boolean z12;
            AbstractC19074t.m100208f(str, "conversationId");
            AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
            if (TextUtils.equals(str, MediaStoreAvatarPickerView.this.m68804HM().m17608M()) && enumC2382z == EnumC2382z.f9945r) {
                AbstractC3498e m17615T = MediaStoreAvatarPickerView.this.m68804HM().m17615T(enumC2382z);
                if (m17615T != null) {
                    MediaStoreAvatarPickerView mediaStoreAvatarPickerView = MediaStoreAvatarPickerView.this;
                    if (m17615T.mo17564q() > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    mediaStoreAvatarPickerView.f63935Z0 = z12;
                }
                MediaStoreAvatarPickerView.this.m68773VM();
                AbstractC19444a.m101697e(new Runnable() { // from class: x70.h

                    /* renamed from: p */
                    public final /* synthetic */ boolean f135980p;

                    /* renamed from: q */
                    public final /* synthetic */ MediaStoreAvatarPickerView f135981q;

                    public /* synthetic */ RunnableC29418h(boolean z112, MediaStoreAvatarPickerView mediaStoreAvatarPickerView2) {
                        r1 = z112;
                        r2 = mediaStoreAvatarPickerView2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaStoreAvatarPickerView.C12272h.m68816n(r1, r2);
                    }
                });
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreAvatarPickerView$i */
    /* loaded from: classes6.dex */
    static final class C12273i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12273i f63957q = new C12273i();

        C12273i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C3521p0 mo12V4() {
            return AbstractC23306f.m120569C0();
        }
    }

    public MediaStoreAvatarPickerView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(C12273i.f63957q);
        this.f63940e1 = m129210a;
        this.f63943h1 = new ArrayList();
        this.f63945j1 = new C12272h();
    }

    /* renamed from: BM */
    public final void m68759BM() {
        try {
            m68800AM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: DM */
    private final C7226u3 m68760DM() {
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C7226u3 c7226u3 = new C7226u3(m92689tK, this, new C7226u3.b(this.f63938c1, EnumC2382z.f9945r, null, null, 12, null));
        c7226u3.m36794D0(false);
        return c7226u3;
    }

    /* renamed from: FM */
    private final void m68761FM(C12063c.f fVar, int i11, C12063c.d.a aVar) {
        boolean z11;
        if (fVar == null) {
            return;
        }
        try {
            RecyclingImageView recyclingImageView = new RecyclingImageView(getContext());
            C23528a c23528a = null;
            if (!TextUtils.isEmpty(fVar.f62951b)) {
                if (fVar.f62952c == 2 && AbstractC23304d.f113361a3.contains(fVar.f62951b)) {
                    if (aVar != null) {
                        aVar.mo67298a(fVar, i11, null, 3);
                        return;
                    }
                    return;
                }
                C12266b c12266b = new C12266b(fVar, aVar, i11);
                c12266b.m125773e3(true);
                C23528a c23528a2 = this.f63942g1;
                if (c23528a2 == null) {
                    AbstractC19074t.m100223u("mAQ");
                } else {
                    c23528a = c23528a2;
                }
                C23528a c23528a3 = (C23528a) c23528a.m123612r(recyclingImageView);
                String str = fVar.f62951b;
                int i12 = fVar.f62953d;
                EnumC25629a m120110a = C23278z2.m120110a();
                if (fVar.f62952c < 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c23528a3.m123586J(str, false, true, i12, 0, c12266b, false, m120110a, z11);
                return;
            }
            if (aVar != null) {
                aVar.mo67298a(fVar, i11, null, 1);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: IM */
    private final C3521p0 m68762IM() {
        return (C3521p0) this.f63940e1.getValue();
    }

    /* renamed from: KM */
    public static final void m68763KM(MediaStoreAvatarPickerView mediaStoreAvatarPickerView, C12063c.f fVar, int i11, C3979l c3979l, int i12) {
        AbstractC19074t.m100208f(mediaStoreAvatarPickerView, "this$0");
        AbstractC19074t.m100208f(fVar, "photoLoadingData");
        InterfaceC27218a m92676n2 = mediaStoreAvatarPickerView.f72421L0.m92676n2();
        if (m92676n2 != null) {
            m92676n2.runOnUiThread(new Runnable() { // from class: x70.d

                /* renamed from: q */
                public final /* synthetic */ C12063c.f f135959q;

                /* renamed from: r */
                public final /* synthetic */ int f135960r;

                public /* synthetic */ RunnableC29406d(C12063c.f fVar2, int i122) {
                    r2 = fVar2;
                    r3 = i122;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MediaStoreAvatarPickerView.m68764LM(MediaStoreAvatarPickerView.this, r2, r3);
                }
            });
        }
    }

    /* renamed from: LM */
    public static final void m68764LM(MediaStoreAvatarPickerView mediaStoreAvatarPickerView, C12063c.f fVar, int i11) {
        AbstractC19074t.m100208f(mediaStoreAvatarPickerView, "this$0");
        AbstractC19074t.m100208f(fVar, "$photoLoadingData");
        try {
            mediaStoreAvatarPickerView.f72421L0.mo49315c4();
            File m68803GM = mediaStoreAvatarPickerView.m68803GM(fVar.f62951b);
            if (m68803GM != null && AbstractC23258x2.m119958q(m68803GM.getPath())) {
                mediaStoreAvatarPickerView.m68769RM(m68803GM.getAbsolutePath());
            } else {
                mediaStoreAvatarPickerView.f63946k1 = false;
                if (i11 != 3 && i11 != 7) {
                    ToastUtils.m89266n(AbstractC8020f0.download_photo_not_cached_message, new Object[0]);
                } else {
                    ToastUtils.m89266n(AbstractC8020f0.str_tv_imgnoexist, new Object[0]);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            mediaStoreAvatarPickerView.f63946k1 = false;
        }
    }

    /* renamed from: NM */
    private final void m68765NM() {
        this.f63948m1 = AbstractC29417g1.m146573a(this.f63926Q0);
    }

    /* renamed from: OM */
    private final void m68766OM() {
        View view = this.f63925P0;
        if (view != null) {
            this.f63926Q0 = (RecyclerView) view.findViewById(AbstractC6918a0.recycle_view);
            NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(m92648SI());
            this.f63929T0 = noPredictiveItemAnimLinearLayoutMngr;
            noPredictiveItemAnimLinearLayoutMngr.m9723C2(1);
            C7226u3 m68760DM = m68760DM();
            this.f63927R0 = m68760DM;
            ZdsActionBar zdsActionBar = null;
            if (m68760DM == null) {
                AbstractC19074t.m100223u("mAdapter");
                m68760DM = null;
            }
            m68760DM.m36791A0(new C12268d());
            RecyclerView recyclerView = this.f63926Q0;
            if (recyclerView != null) {
                LinearLayoutManager linearLayoutManager = this.f63929T0;
                if (linearLayoutManager == null) {
                    AbstractC19074t.m100223u("mLinearLayoutManager");
                    linearLayoutManager = null;
                }
                recyclerView.setLayoutManager(linearLayoutManager);
                C7226u3 c7226u3 = this.f63927R0;
                if (c7226u3 == null) {
                    AbstractC19074t.m100223u("mAdapter");
                    c7226u3 = null;
                }
                recyclerView.setAdapter(c7226u3);
                recyclerView.m9816A(new C12269e());
                recyclerView.setOverScrollMode(2);
                recyclerView.m9826E(new C12270f());
                recyclerView.setOnFlingListener(new C12271g());
            }
            MultiStateView multiStateView = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state);
            this.f63928S0 = multiStateView;
            if (multiStateView != null) {
                multiStateView.setEnableSwapStateAnim(false);
            }
            MultiStateView multiStateView2 = this.f63928S0;
            if (multiStateView2 != null) {
                multiStateView2.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: x70.a
                    public /* synthetic */ C29397a() {
                    }

                    @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
                    /* renamed from: a */
                    public final void mo12138a() {
                        MediaStoreAvatarPickerView.m68767PM(MediaStoreAvatarPickerView.this);
                    }
                });
            }
            RobotoTextView robotoTextView = (RobotoTextView) view.findViewById(AbstractC6918a0.tvDesc);
            this.f63931V0 = robotoTextView;
            if (robotoTextView != null) {
                C19067n0 c19067n0 = C19067n0.f94947a;
                String format = String.format("%s %s", Arrays.copyOf(new Object[]{AbstractC23136l9.m118743r0(AbstractC8020f0.str_no_photo_to_add), AbstractC23136l9.m118743r0(AbstractC8020f0.str_album_add_photo_from_gallery)}, 2));
                AbstractC19074t.m100207e(format, "format(...)");
                robotoTextView.setText(format);
            }
            this.f63932W0 = (AppCompatImageView) view.findViewById(AbstractC6918a0.iv_empty);
            this.f63933X0 = view.findViewById(AbstractC6918a0.view_empty_store);
            View findViewById = view.findViewById(AbstractC6918a0.zds_action_bar);
            AbstractC19074t.m100207e(findViewById, "findViewById(...)");
            ZdsActionBar zdsActionBar2 = (ZdsActionBar) findViewById;
            this.f63944i1 = zdsActionBar2;
            if (this.f63939d1) {
                if (zdsActionBar2 == null) {
                    AbstractC19074t.m100223u("zdsActionBar");
                } else {
                    zdsActionBar = zdsActionBar2;
                }
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_change_community_avatar);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                zdsActionBar.setMiddleTitle(m118743r0);
            }
        }
        m68781i2();
    }

    /* renamed from: PM */
    public static final void m68767PM(MediaStoreAvatarPickerView mediaStoreAvatarPickerView) {
        AbstractC19074t.m100208f(mediaStoreAvatarPickerView, "this$0");
        mediaStoreAvatarPickerView.m68802EM(false);
    }

    /* renamed from: QM */
    private final boolean m68768QM() {
        if (this.f63943h1.size() > 0) {
            Iterator it = this.f63943h1.iterator();
            while (it.hasNext()) {
                if (((C7906d) it.next()).m40823l().size() > 0) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: RM */
    private final void m68769RM(String str) {
        if (!this.f72421L0.m92677nJ() && this.f72421L0.m92687sJ() && str != null && str.length() != 0 && AbstractC23041d2.m118194A(str)) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: x70.e

                /* renamed from: p */
                public final /* synthetic */ String f135965p;

                /* renamed from: q */
                public final /* synthetic */ MediaStoreAvatarPickerView f135966q;

                public /* synthetic */ RunnableC29409e(String str2, MediaStoreAvatarPickerView this) {
                    r1 = str2;
                    r2 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MediaStoreAvatarPickerView.m68770SM(r1, r2);
                }
            });
        } else {
            this.f63946k1 = false;
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
        }
    }

    /* renamed from: SM */
    public static final void m68770SM(String str, MediaStoreAvatarPickerView mediaStoreAvatarPickerView) {
        AbstractC19074t.m100208f(mediaStoreAvatarPickerView, "this$0");
        try {
            CameraInputParams m39202l = CameraInputParams.m39202l(AbstractC23078g6.Companion.m118386a(str));
            AbstractC19074t.m100207e(m39202l, "newCropGroupAvatarInputParams(...)");
            AbstractC19444a.m101697e(new Runnable() { // from class: x70.f

                /* renamed from: q */
                public final /* synthetic */ CameraInputParams f135971q;

                public /* synthetic */ RunnableC29412f(CameraInputParams m39202l2) {
                    r2 = m39202l2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MediaStoreAvatarPickerView.m68771TM(MediaStoreAvatarPickerView.this, r2);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: TM */
    public static final void m68771TM(MediaStoreAvatarPickerView mediaStoreAvatarPickerView, CameraInputParams cameraInputParams) {
        AbstractC19074t.m100208f(mediaStoreAvatarPickerView, "this$0");
        AbstractC19074t.m100208f(cameraInputParams, "$inputParams");
        AbstractC22470k.m116167s(mediaStoreAvatarPickerView.f72421L0.m92676n2(), ZAbstractBase.ZVU_BLEND_PERCENTAGE, 1, cameraInputParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* renamed from: UM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m68772UM() {
        int i11;
        boolean z11;
        Context context;
        boolean z12;
        C7905c c7905c;
        try {
            if (this.f63948m1 != null) {
                C7226u3 c7226u3 = this.f63927R0;
                if (c7226u3 == null) {
                    AbstractC19074t.m100223u("mAdapter");
                    c7226u3 = null;
                }
                List m36809f0 = c7226u3.m36809f0();
                OverScroller overScroller = this.f63948m1;
                int i12 = 0;
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
                LinearLayoutManager linearLayoutManager = this.f63929T0;
                if (linearLayoutManager == null) {
                    AbstractC19074t.m100223u("mLinearLayoutManager");
                    linearLayoutManager = null;
                }
                int m9740Y1 = linearLayoutManager.m9740Y1();
                int size = m36809f0.size();
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
                int i13 = -1;
                if (z11) {
                    while (m9740Y1 < size) {
                        C7905c c7905c2 = (C7905c) m36809f0.get(m9740Y1);
                        if (c7905c2.m40798q() == 2) {
                            i12 += (int) (c7905c2.m40787f() * m118728m0);
                        } else if (c7905c2.m40798q() == 1) {
                            i12 += m155453a;
                        }
                        if (i12 >= abs) {
                            i13 = m9740Y1;
                            break;
                        }
                        m9740Y1++;
                    }
                    if (!z11) {
                        if (i13 >= 0) {
                            if (i13 >= size - 10) {
                                m68802EM(true);
                                return;
                            }
                            return;
                        } else {
                            if (1 <= i12 && i12 < abs) {
                                m68802EM(true);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                m9740Y1--;
                while (-1 < m9740Y1) {
                    if (m9740Y1 < m36809f0.size()) {
                        c7905c = (C7905c) m36809f0.get(m9740Y1);
                    } else {
                        c7905c = null;
                    }
                    if (c7905c != null) {
                        if (c7905c.m40798q() == 2) {
                            i12 += (int) (c7905c.m40787f() * m118728m0);
                        } else if (c7905c.m40798q() == 1) {
                            i12 += m155453a;
                        }
                        if (i12 >= abs) {
                            i13 = m9740Y1;
                            break;
                        }
                    }
                    m9740Y1--;
                }
                if (!z11) {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:            r1 = qm0.AbstractC25332a0.m131185M0(r1);     */
    /* renamed from: VM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m68773VM() {
        List m131502j;
        this.f63943h1.clear();
        List list = this.f63943h1;
        AbstractC3498e m17615T = m68804HM().m17615T(EnumC2382z.f9945r);
        if (m17615T == null || (r1 = m17615T.m17559l()) == null || m131502j == null) {
            m131502j = AbstractC25368s.m131502j();
        }
        list.addAll(m131502j);
        Iterator it = this.f63943h1.iterator();
        while (it.hasNext()) {
            C7906d c7906d = (C7906d) it.next();
            if (c7906d.m40823l().size() == 0) {
                it.remove();
            } else {
                C23250w4.f112644a.m119845t(c7906d);
            }
        }
    }

    /* renamed from: XM */
    private final void m68774XM(String str) {
        Intent intent = new Intent();
        intent.putExtra("PHOTO_PATH_PICKED", str);
        this.f72421L0.mo50035CK(-1, intent);
    }

    /* renamed from: YM */
    public final void m68775YM(boolean z11, boolean z12) {
        try {
            AbstractC19444a.m101697e(new Runnable() { // from class: x70.b

                /* renamed from: q */
                public final /* synthetic */ boolean f135947q;

                /* renamed from: r */
                public final /* synthetic */ boolean f135948r;

                public /* synthetic */ RunnableC29400b(boolean z112, boolean z122) {
                    r2 = z112;
                    r3 = z122;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MediaStoreAvatarPickerView.m68776ZM(MediaStoreAvatarPickerView.this, r2, r3);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: ZM */
    public static final void m68776ZM(MediaStoreAvatarPickerView mediaStoreAvatarPickerView, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(mediaStoreAvatarPickerView, "this$0");
        C7226u3 c7226u3 = mediaStoreAvatarPickerView.f63927R0;
        if (c7226u3 == null) {
            AbstractC19074t.m100223u("mAdapter");
            c7226u3 = null;
        }
        C7226u3.m36768P0(c7226u3, z11, false, 2, null);
        C7226u3 c7226u32 = mediaStoreAvatarPickerView.f63927R0;
        if (c7226u32 == null) {
            AbstractC19074t.m100223u("mAdapter");
            c7226u32 = null;
        }
        C7226u3.m36765N0(c7226u32, z12, false, 2, null);
    }

    /* renamed from: aN */
    public final void m68777aN(MultiStateView.EnumC15915f enumC15915f) {
        try {
            MultiStateView multiStateView = this.f63928S0;
            boolean z11 = false;
            if (multiStateView != null) {
                if (!m68768QM()) {
                    if (MultiStateView.EnumC15915f.NON_ERROR == enumC15915f) {
                        AbstractC3498e m17615T = m68804HM().m17615T(EnumC2382z.f9945r);
                        if (m17615T != null) {
                            if (m17615T.m17567u()) {
                                multiStateView.setVisibility(0);
                                multiStateView.setState(MultiStateView.EnumC15914e.LOADING);
                            } else if (!this.f63934Y0) {
                                multiStateView.setVisibility(8);
                                z11 = true;
                            }
                        }
                    } else {
                        multiStateView.setVisibility(0);
                        multiStateView.setState(MultiStateView.EnumC15914e.ERROR);
                        multiStateView.setErrorType(enumC15915f);
                    }
                    RecyclerView recyclerView = this.f63926Q0;
                    if (recyclerView != null) {
                        recyclerView.setVisibility(8);
                    }
                } else {
                    multiStateView.setVisibility(8);
                    RecyclerView recyclerView2 = this.f63926Q0;
                    if (recyclerView2 != null) {
                        recyclerView2.setVisibility(0);
                    }
                }
            }
            m68778bN(z11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: bN */
    private final void m68778bN(boolean z11) {
        int i11;
        int i12 = AbstractC16803z.illus_empty_photos;
        RobotoTextView robotoTextView = this.f63931V0;
        if (robotoTextView != null) {
            robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_stored_media_no_photo_to_pick_avatar));
        }
        AppCompatImageView appCompatImageView = this.f63932W0;
        if (appCompatImageView != null) {
            appCompatImageView.setImageDrawable(AbstractC23136l9.m118665N(getContext(), i12));
        }
        View view = this.f63933X0;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(view, i11);
    }

    /* renamed from: i2 */
    private final void m68781i2() {
        Drawable m118665N = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.thumb_drawable);
        AbstractC19074t.m100206d(m118665N, "null cannot be cast to non-null type android.graphics.drawable.StateListDrawable");
        StateListDrawable stateListDrawable = (StateListDrawable) m118665N;
        Drawable m118665N2 = AbstractC23136l9.m118665N(getContext(), AbstractC17466e.transparent);
        Drawable m118665N3 = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.thumb_drawable);
        AbstractC19074t.m100206d(m118665N3, "null cannot be cast to non-null type android.graphics.drawable.StateListDrawable");
        C12267c c12267c = new C12267c(stateListDrawable, m118665N2, (StateListDrawable) m118665N3, AbstractC23136l9.m118665N(getContext(), AbstractC17466e.transparent), this, this.f63926Q0);
        View view = this.f63925P0;
        if (view != null) {
            c12267c.m65929g0((RobotoTextView) view.findViewById(AbstractC6918a0.bubble_date));
        }
        this.f63930U0 = c12267c;
    }

    /* renamed from: AM */
    public final void m68800AM() {
        C7226u3 c7226u3 = this.f63927R0;
        C7226u3 c7226u32 = null;
        if (c7226u3 == null) {
            AbstractC19074t.m100223u("mAdapter");
            c7226u3 = null;
        }
        c7226u3.m36792B0(this.f63943h1);
        C7226u3 c7226u33 = this.f63927R0;
        if (c7226u33 == null) {
            AbstractC19074t.m100223u("mAdapter");
        } else {
            c7226u32 = c7226u33;
        }
        c7226u32.m10008p();
        m68777aN(MultiStateView.EnumC15915f.NON_ERROR);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f63942g1 = new C23528a(getContext());
        m68806MM();
    }

    /* renamed from: CM */
    public final void m68801CM() {
        m68802EM(true);
    }

    /* renamed from: EM */
    public final void m68802EM(boolean z11) {
        try {
            m68804HM().m17623g0(new C3490a(EnumC2382z.f9945r, z11));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        this.f63925P0 = layoutInflater.inflate(AbstractC7409c0.layout_media_store_item_picker_page, viewGroup, false);
        m68766OM();
        return this.f63925P0;
    }

    /* renamed from: GM */
    public final File m68803GM(String str) {
        try {
            C23528a c23528a = this.f63942g1;
            if (c23528a == null) {
                AbstractC19074t.m100223u("mAQ");
                c23528a = null;
            }
            return c23528a.m123603i(str);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: HM */
    public final C3499e0 m68804HM() {
        C3499e0 c3499e0 = this.f63941f1;
        if (c3499e0 != null) {
            return c3499e0;
        }
        AbstractC19074t.m100223u("mMediaStore");
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        m68804HM().m17637s0(this.f63945j1);
    }

    /* renamed from: JM */
    public final void m68805JM(MediaStoreItem mediaStoreItem, int i11) {
        boolean m127120J;
        try {
            if (!this.f63946k1 && mediaStoreItem != null) {
                this.f63946k1 = true;
                String m95090b5 = mediaStoreItem.m40599m().m95090b5();
                AbstractC19074t.m100207e(m95090b5, "getUrl(...)");
                if (!TextUtils.isEmpty(this.f63937b1)) {
                    this.f63947l1 = this.f63937b1;
                } else if (!TextUtils.isEmpty(mediaStoreItem.m40599m().m94862C4())) {
                    this.f63947l1 = mediaStoreItem.m40599m().m94862C4();
                } else {
                    this.f63946k1 = false;
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
                    return;
                }
                if (AbstractC25495a.m132079d(this.f63947l1)) {
                    this.f63947l1 = AbstractC25495a.m132088m(this.f63947l1);
                }
                if (!TextUtils.isEmpty(this.f63947l1) && !TextUtils.isEmpty(m95090b5)) {
                    File m68803GM = m68803GM(m95090b5);
                    if (m68803GM == null || !AbstractC23258x2.m119958q(m68803GM.getPath())) {
                        m127120J = AbstractC24341v.m127120J(m95090b5, "http", false, 2, null);
                        if (m127120J) {
                            mo46829Y();
                            m68761FM(AbstractC32146v5.m155118a(m95090b5, 1), i11, new C12063c.d.a() { // from class: x70.c
                                public /* synthetic */ C29403c() {
                                }

                                @Override // com.zing.zalo.p077ui.imageviewer.C12063c.d.a
                                /* renamed from: a */
                                public final void mo67298a(C12063c.f fVar, int i12, C3979l c3979l, int i13) {
                                    MediaStoreAvatarPickerView.m68763KM(MediaStoreAvatarPickerView.this, fVar, i12, c3979l, i13);
                                }
                            });
                            return;
                        } else {
                            ToastUtils.m89266n(AbstractC8020f0.str_tv_imgnoexist, new Object[0]);
                            this.f63946k1 = false;
                            return;
                        }
                    }
                    m68769RM(m68803GM.getAbsolutePath());
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            this.f63946k1 = false;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.Companion.m124119a().m124117e(this, 52);
    }

    /* renamed from: MM */
    public final void m68806MM() {
        String str;
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            if (m92642L3.containsKey("extra_create_album_group_id")) {
                str = m92642L3.getString("extra_create_album_group_id");
            } else {
                str = "0";
            }
            this.f63937b1 = str;
            this.f63939d1 = m92642L3.getBoolean("EXTRA_IS_COMMUNITY", false);
            this.f63938c1 = "group_" + this.f63937b1;
            m68808WM(m68762IM().m17791p(new CreateMediaStoreParam(this.f63938c1, EnumC2363o.f9892s, null, 4, null)));
            m68804HM().m17627m0(this.f63945j1);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview
    /* renamed from: SL */
    public void mo68807SL() {
        super.mo68807SL();
        this.f63946k1 = false;
    }

    /* renamed from: WM */
    public final void m68808WM(C3499e0 c3499e0) {
        AbstractC19074t.m100208f(c3499e0, "<set-?>");
        this.f63941f1 = c3499e0;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m68765NM();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "MediaStoreAvatarPickerView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        String str;
        try {
            this.f72421L0.invalidateOptionsMenu();
            if (i11 == 1002) {
                if (i12 == -1 && intent != null && intent.getExtras() != null) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        str = extras.getString("extra_result_output_path");
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str) && AbstractC23041d2.m118194A(str) && !TextUtils.isEmpty(this.f63947l1)) {
                        m68774XM(str);
                        this.f72421L0.finish();
                        return;
                    } else {
                        this.f63946k1 = false;
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
                        return;
                    }
                }
                this.f63946k1 = false;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 52) {
            try {
                if (AbstractC23184q2.m119459q(this.f63937b1, i11, Arrays.copyOf(objArr, objArr.length))) {
                    finish();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m68802EM(false);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.Companion.m124119a().m124115b(this, 52);
    }
}
