package com.zing.zalo.p077ui.mediastore;

import ac.C0697c0;
import am.C0943w;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1765e;
import androidx.lifecycle.InterfaceC1801w;
import au.EnumC2381y;
import au.EnumC2382z;
import b40.C2526d;
import ci.AbstractC3498e;
import ci.AbstractC3501f0;
import ci.C3490a;
import ci.C3499e0;
import ci.C3509j0;
import ci.C3521p0;
import ci.C3522q;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7226u3;
import com.zing.zalo.control.C7905c;
import com.zing.zalo.control.C7906d;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.control.mediastore.CreateMediaStoreParam;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.mediastore.C12340b;
import com.zing.zalo.p077ui.mediastore.InterfaceC12371j;
import com.zing.zalo.p077ui.mediastore.MediaStoreBasePage;
import com.zing.zalo.p077ui.mediastore.MediaStorePagePresenter;
import com.zing.zalo.p077ui.mediastore.MediaStoreView;
import com.zing.zalo.p077ui.mediastore.search.MediaStoreSearchPagePresenter;
import com.zing.zalo.p077ui.picker.mycloud.model.SelectedItemData;
import com.zing.zalo.p077ui.zviews.RolledMediaBottomSheet;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.animation.AnimationTarget;
import e80.C18298c;
import e80.C18303h;
import eg0.AbstractC18428c;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import hm0.C20096c;
import i40.C20275e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ln0.AbstractC22543l;
import me0.AbstractC23034c6;
import me0.AbstractC23047d8;
import me0.AbstractC23136l9;
import me0.C23055e5;
import me0.C23081g9;
import me0.C23250w4;
import mg.C23288a;
import mm0.AbstractC23350e;
import nh0.C23793c;
import on0.C24329j;
import org.json.JSONObject;
import p205hc.AbstractC19962a;
import p239ih.C20556f;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p361nb.C23662s;
import p361nb.EnumC23654k;
import p361nb.EnumC23663t;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p681yh.EnumC30982b;
import p716zh.C31944h6;
import p716zh.C31950hc;
import p716zh.C31973j5;
import p716zh.C31986k3;
import p716zh.C32002l4;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import th.AbstractC26687h;
import vc0.AbstractC27964c;
import vc0.InterfaceC27965d;

/* loaded from: classes6.dex */
public class MediaStorePagePresenter extends AbstractC19962a implements InterfaceC12370i, C23744a.c {
    public static final C12290a Companion = new C12290a(null);

    /* renamed from: A */
    private MediaStoreItem f63998A;

    /* renamed from: B */
    private MediaStoreItem f63999B;

    /* renamed from: C */
    private final List f64000C;

    /* renamed from: D */
    private final Object f64001D;

    /* renamed from: E */
    protected C3499e0 f64002E;

    /* renamed from: F */
    private MediaStoreBasePage.InterfaceC12275b f64003F;

    /* renamed from: G */
    private boolean f64004G;

    /* renamed from: H */
    private final List f64005H;

    /* renamed from: I */
    private boolean f64006I;

    /* renamed from: J */
    private MediaStoreItem f64007J;

    /* renamed from: K */
    private boolean f64008K;

    /* renamed from: L */
    private C3521p0.c f64009L;

    /* renamed from: M */
    private final InterfaceC24854k f64010M;

    /* renamed from: N */
    private final InterfaceC24854k f64011N;

    /* renamed from: O */
    private final InterfaceC24854k f64012O;

    /* renamed from: P */
    private final InterfaceC24854k f64013P;

    /* renamed from: t */
    private final C3521p0 f64014t;

    /* renamed from: u */
    private EnumC2382z f64015u;

    /* renamed from: v */
    private MediaStoreBasePage.InterfaceC12276c f64016v;

    /* renamed from: w */
    private boolean f64017w;

    /* renamed from: x */
    private boolean f64018x;

    /* renamed from: y */
    private boolean f64019y;

    /* renamed from: z */
    private final int f64020z;

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePagePresenter$a */
    /* loaded from: classes6.dex */
    public static final class C12290a {
        private C12290a() {
        }

        public /* synthetic */ C12290a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePagePresenter$b */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C12291b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f64021a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f64022b;

        static {
            int[] iArr = new int[EnumC2382z.values().length];
            try {
                iArr[EnumC2382z.f9945r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2382z.f9946s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2382z.f9947t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f64021a = iArr;
            int[] iArr2 = new int[EnumC2381y.values().length];
            try {
                iArr2[EnumC2381y.f9939p.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC2381y.f9940q.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC2381y.f9941r.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f64022b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePagePresenter$c */
    /* loaded from: classes6.dex */
    public static final class C12292c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePagePresenter$c$a */
        /* loaded from: classes6.dex */
        public static final class a implements C12340b.b {

            /* renamed from: a */
            final /* synthetic */ MediaStorePagePresenter f64024a;

            a(MediaStorePagePresenter mediaStorePagePresenter) {
                this.f64024a = mediaStorePagePresenter;
            }

            @Override // com.zing.zalo.p077ui.mediastore.C12340b.b
            /* renamed from: a */
            public void mo69087a(List list) {
                int m131511r;
                AbstractC19074t.m100208f(list, "items");
                List list2 = list;
                m131511r = AbstractC25370t.m131511r(list2, 10);
                ArrayList arrayList = new ArrayList(m131511r);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((MediaStoreItem) it.next()).m40599m());
                }
                C31950hc.f146830a.m153638L("chat_storedmedia", 0, "msg_chat_delete_withdraw", arrayList, null);
            }

            @Override // com.zing.zalo.p077ui.mediastore.C12340b.b
            /* renamed from: b */
            public void mo69088b(String str, List list, boolean z11) {
                AbstractC19074t.m100208f(str, "conversationId");
                AbstractC19074t.m100208f(list, "items");
                try {
                    if (AbstractC19074t.m100204b(str, this.f64024a.m69045Iq().m17608M()) && (!list.isEmpty())) {
                        this.f64024a.m69023rr(list, z11);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }

        C12292c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final a mo12V4() {
            return new a(MediaStorePagePresenter.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePagePresenter$d */
    /* loaded from: classes6.dex */
    public static final class C12293d extends AbstractC19075u implements InterfaceC18494a {
        C12293d() {
            super(0);
        }

        /* renamed from: c */
        public static final void m69090c(MediaStorePagePresenter mediaStorePagePresenter, InterfaceC27965d interfaceC27965d, int i11, boolean z11) {
            AbstractC19074t.m100208f(mediaStorePagePresenter, "this$0");
            if (interfaceC27965d instanceof MediaStoreItem) {
                mediaStorePagePresenter.m68985Qq((MediaStoreItem) interfaceC27965d, z11, i11);
            }
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: b */
        public final AbstractC27964c.a mo12V4() {
            return new AbstractC27964c.a() { // from class: com.zing.zalo.ui.mediastore.k
                public /* synthetic */ C12372k() {
                }

                @Override // vc0.AbstractC27964c.a
                /* renamed from: a */
                public final void mo69546a(InterfaceC27965d interfaceC27965d, int i11, boolean z11) {
                    MediaStorePagePresenter.C12293d.m69090c(MediaStorePagePresenter.this, interfaceC27965d, i11, z11);
                }
            };
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePagePresenter$e */
    /* loaded from: classes6.dex */
    public static final class C12294e implements C18298c.b {
        C12294e() {
        }

        @Override // e80.C18298c.b
        /* renamed from: a */
        public boolean mo69092a() {
            if (!((InterfaceC12371j) MediaStorePagePresenter.this.m103742Dp()).mo68858Bo() && ((InterfaceC12371j) MediaStorePagePresenter.this.m103742Dp()).mo68926x0()) {
                return true;
            }
            return false;
        }

        @Override // e80.C18298c.b
        /* renamed from: b */
        public void mo69093b(boolean z11) {
            ((InterfaceC12371j) MediaStorePagePresenter.this.m103742Dp()).mo68903c3(z11);
        }

        @Override // e80.C18298c.b
        /* renamed from: c */
        public void mo69094c(List list) {
            AbstractC19074t.m100208f(list, "mediaStoreItems");
            MediaStorePagePresenter.this.m69034zq(list);
            AbstractC23647d.m123897g("1001525");
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePagePresenter$f */
    /* loaded from: classes6.dex */
    public static final class C12295f implements C18303h.b {
        C12295f() {
        }

        @Override // e80.C18303h.b
        /* renamed from: a */
        public boolean mo69095a() {
            if (!((InterfaceC12371j) MediaStorePagePresenter.this.m103742Dp()).mo68858Bo() && ((InterfaceC12371j) MediaStorePagePresenter.this.m103742Dp()).mo68926x0()) {
                return true;
            }
            return false;
        }

        @Override // e80.C18303h.b
        /* renamed from: b */
        public void mo69096b(boolean z11) {
            ((InterfaceC12371j) MediaStorePagePresenter.this.m103742Dp()).mo68903c3(z11);
        }

        @Override // e80.C18303h.b
        /* renamed from: c */
        public void mo69097c(List list) {
            AbstractC19074t.m100208f(list, "mediaItems");
            try {
                MediaStorePagePresenter.this.m69034zq(list);
                C3509j0.m17720f(MediaStorePagePresenter.this.m69045Iq().m17608M(), 1, EnumC2382z.f9945r, list.size());
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePagePresenter$g */
    /* loaded from: classes6.dex */
    public static final class C12296g implements C7226u3.c {
        C12296g() {
        }

        @Override // com.zing.zalo.adapters.C7226u3.c
        /* renamed from: a */
        public void mo36829a(MediaStoreItem mediaStoreItem, boolean z11, int i11) {
            AbstractC19074t.m100208f(mediaStoreItem, "item");
            MediaStorePagePresenter.this.m68985Qq(mediaStoreItem, z11, i11);
        }

        @Override // com.zing.zalo.adapters.C7226u3.c
        /* renamed from: b */
        public void mo36830b() {
            MediaStorePagePresenter.this.m68996Yq();
        }

        @Override // com.zing.zalo.adapters.C7226u3.c
        /* renamed from: c */
        public void mo36831c(MediaStoreItem mediaStoreItem) {
            AbstractC19074t.m100208f(mediaStoreItem, "item");
            MediaStorePagePresenter.this.m69073kr(mediaStoreItem);
        }

        @Override // com.zing.zalo.adapters.C7226u3.c
        /* renamed from: d */
        public void mo36832d(EnumC2382z enumC2382z, MediaStoreItem mediaStoreItem) {
            AbstractC19074t.m100208f(enumC2382z, "mediaType");
            AbstractC19074t.m100208f(mediaStoreItem, "item");
            MediaStorePagePresenter.this.m69072kq(enumC2382z, mediaStoreItem);
        }

        @Override // com.zing.zalo.adapters.C7226u3.c
        /* renamed from: e */
        public void mo36833e(MediaStoreItem mediaStoreItem) {
            AbstractC19074t.m100208f(mediaStoreItem, "item");
            MediaStorePagePresenter.this.m69073kr(mediaStoreItem);
        }

        @Override // com.zing.zalo.adapters.C7226u3.c
        /* renamed from: f */
        public void mo36834f(MediaStoreItem mediaStoreItem, boolean z11, boolean z12, C3521p0.c cVar) {
            AbstractC19074t.m100208f(mediaStoreItem, "mediaStoreItem");
            MediaStorePagePresenter.this.m68983Pq(mediaStoreItem, z11, z12, cVar);
        }

        @Override // com.zing.zalo.adapters.C7226u3.c
        /* renamed from: g */
        public void mo36835g(C7906d c7906d, boolean z11, int i11) {
            AbstractC19074t.m100208f(c7906d, "item");
            MediaStorePagePresenter.this.m69014jr(c7906d, z11, i11);
        }

        @Override // com.zing.zalo.adapters.C7226u3.c
        /* renamed from: h */
        public void mo36836h(C20556f c20556f) {
            AbstractC19074t.m100208f(c20556f, "file");
            MediaStorePagePresenter.this.m69010hr(c20556f);
        }

        @Override // com.zing.zalo.adapters.C7226u3.c
        /* renamed from: i */
        public void mo36837i(int i11, MediaStoreItem mediaStoreItem) {
            AbstractC19074t.m100208f(mediaStoreItem, "item");
            MediaStorePagePresenter.this.mo69059Uq(i11, mediaStoreItem);
        }

        @Override // com.zing.zalo.adapters.C7226u3.c
        /* renamed from: j */
        public void mo36838j(MediaStoreItem mediaStoreItem, AnimationTarget animationTarget, int i11, C20275e c20275e, String str) {
            AbstractC19074t.m100208f(mediaStoreItem, "item");
            AbstractC19074t.m100208f(animationTarget, "animationTarget");
            AbstractC19074t.m100208f(c20275e, "imageViewerAnimationController");
            AbstractC19074t.m100208f(str, "logChatType");
            MediaStorePagePresenter.this.m69077pr(mediaStoreItem, animationTarget, c20275e);
        }

        @Override // com.zing.zalo.adapters.C7226u3.c
        /* renamed from: k */
        public void mo36839k(MediaStoreItem mediaStoreItem) {
            AbstractC19074t.m100208f(mediaStoreItem, "item");
            MediaStorePagePresenter.this.m68994Xq(mediaStoreItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePagePresenter$h */
    /* loaded from: classes6.dex */
    public static final class C12297h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ InterfaceC12371j f64030r;

        /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePagePresenter$h$a */
        /* loaded from: classes6.dex */
        public static final class a implements MediaStoreView.MediaStoreMultiSelectionBottomView.InterfaceC12317a {

            /* renamed from: a */
            final /* synthetic */ MediaStorePagePresenter f64031a;

            /* renamed from: b */
            final /* synthetic */ InterfaceC12371j f64032b;

            /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePagePresenter$h$a$a */
            /* loaded from: classes6.dex */
            public /* synthetic */ class C32768a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f64033a;

                static {
                    int[] iArr = new int[EnumC2382z.values().length];
                    try {
                        iArr[EnumC2382z.f9946s.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC2382z.f9947t.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnumC2382z.f9945r.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f64033a = iArr;
                }
            }

            a(MediaStorePagePresenter mediaStorePagePresenter, InterfaceC12371j interfaceC12371j) {
                this.f64031a = mediaStorePagePresenter;
                this.f64032b = interfaceC12371j;
            }

            @Override // com.zing.zalo.ui.mediastore.MediaStoreView.MediaStoreMultiSelectionBottomView.InterfaceC12317a
            /* renamed from: a */
            public void mo69099a() {
                String str;
                if (this.f64031a.mo69054N1().isEmpty()) {
                    InterfaceC12371j interfaceC12371j = this.f64032b;
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_no_selected_item);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    interfaceC12371j.mo78936E(m118743r0);
                    return;
                }
                if (this.f64031a.mo69054N1().size() > 1) {
                    InterfaceC12371j interfaceC12371j2 = this.f64032b;
                    String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_do_not_jump_to_original_multi_item);
                    AbstractC19074t.m100207e(m118743r02, "getString(...)");
                    interfaceC12371j2.mo78936E(m118743r02);
                    return;
                }
                MediaStoreBasePage.InterfaceC12275b m69040Cq = this.f64031a.m69040Cq();
                if (m69040Cq != null) {
                    m69040Cq.mo68943r4((MediaStoreItem) this.f64031a.mo69054N1().get(0));
                }
                int i11 = C32768a.f64033a[this.f64031a.m69048Kq().ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        str = "1001500";
                    } else {
                        str = "1001520";
                    }
                } else {
                    str = "1001510";
                }
                AbstractC23647d.m123906p(str);
                AbstractC23647d.m123893c();
                this.f64031a.mo69076oq();
            }

            @Override // com.zing.zalo.ui.mediastore.MediaStoreView.MediaStoreMultiSelectionBottomView.InterfaceC12317a
            /* renamed from: b */
            public void mo69100b() {
                if (this.f64031a.mo69054N1().isEmpty()) {
                    InterfaceC12371j interfaceC12371j = this.f64032b;
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_no_selected_item);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    interfaceC12371j.mo78936E(m118743r0);
                    return;
                }
                if (this.f64031a.mo69054N1().size() > 50) {
                    InterfaceC12371j interfaceC12371j2 = this.f64032b;
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_store_limit_count_multi_select);
                    AbstractC19074t.m100207e(m118743r02, "getString(...)");
                    String format = String.format(m118743r02, Arrays.copyOf(new Object[]{50}, 1));
                    AbstractC19074t.m100207e(format, "format(...)");
                    interfaceC12371j2.mo78936E(format);
                    return;
                }
                MediaStorePagePresenter mediaStorePagePresenter = this.f64031a;
                if (mediaStorePagePresenter.m68978Mq(mediaStorePagePresenter.mo69054N1()) > 0) {
                    InterfaceC12371j interfaceC12371j3 = this.f64032b;
                    String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_cannot_forward_rolled_msg);
                    AbstractC19074t.m100207e(m118743r03, "getString(...)");
                    interfaceC12371j3.mo78936E(m118743r03);
                    return;
                }
                if (this.f64031a.m69048Kq() == EnumC2382z.f9945r) {
                    MediaStorePagePresenter mediaStorePagePresenter2 = this.f64031a;
                    mediaStorePagePresenter2.m68965Aq(mediaStorePagePresenter2.mo69054N1());
                    return;
                }
                MediaStorePagePresenter mediaStorePagePresenter3 = this.f64031a;
                mediaStorePagePresenter3.m69034zq(mediaStorePagePresenter3.mo69054N1());
                AbstractC23647d.m123897g("1001525");
                EnumC2382z m69048Kq = this.f64031a.m69048Kq();
                EnumC2382z enumC2382z = EnumC2382z.f9946s;
                if (m69048Kq == enumC2382z) {
                    C3509j0.m17720f(this.f64031a.m69045Iq().m17608M(), 2, enumC2382z, 1);
                } else {
                    EnumC2382z m69048Kq2 = this.f64031a.m69048Kq();
                    EnumC2382z enumC2382z2 = EnumC2382z.f9947t;
                    if (m69048Kq2 == enumC2382z2) {
                        C3509j0.m17720f(this.f64031a.m69045Iq().m17608M(), 3, enumC2382z2, 1);
                    }
                }
                AbstractC23647d.m123897g("10015057");
            }

            @Override // com.zing.zalo.ui.mediastore.MediaStoreView.MediaStoreMultiSelectionBottomView.InterfaceC12317a
            /* renamed from: c */
            public void mo69101c() {
                if (this.f64031a.mo69054N1().isEmpty()) {
                    InterfaceC12371j interfaceC12371j = this.f64032b;
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_no_selected_item);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    interfaceC12371j.mo78936E(m118743r0);
                    return;
                }
                if (this.f64031a.mo69054N1().size() > 100) {
                    InterfaceC12371j interfaceC12371j2 = this.f64032b;
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_store_limit_count_multi_select);
                    AbstractC19074t.m100207e(m118743r02, "getString(...)");
                    String format = String.format(m118743r02, Arrays.copyOf(new Object[]{100}, 1));
                    AbstractC19074t.m100207e(format, "format(...)");
                    interfaceC12371j2.mo78936E(format);
                } else {
                    this.f64031a.f64000C.clear();
                    if (AbstractC23047d8.m118256h(this.f64031a.m69045Iq().m17608M())) {
                        this.f64031a.f64000C.addAll(this.f64031a.mo69054N1());
                    } else {
                        Iterator it = this.f64031a.mo69054N1().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            MediaStoreItem mediaStoreItem = (MediaStoreItem) it.next();
                            String m17608M = this.f64031a.m69045Iq().m17608M();
                            List singletonList = Collections.singletonList(mediaStoreItem);
                            AbstractC19074t.m100207e(singletonList, "singletonList(...)");
                            if (C3522q.m17808d(m17608M, singletonList).m17833a()) {
                                this.f64031a.f64000C.add(mediaStoreItem);
                            } else {
                                this.f64031a.f64000C.clear();
                                break;
                            }
                        }
                    }
                    if (this.f64031a.f64000C.size() > 0) {
                        this.f64032b.mo68888Tb();
                        this.f64032b.mo68883Op(this.f64031a.m69045Iq().m17608M(), this.f64031a.f64000C, this.f64031a.m68969Dq());
                    } else if (C23250w4.f112644a.m119828Q(AbstractC25495a.m132088m(this.f64031a.m69045Iq().m17608M()), this.f64031a.m69045Iq().m17608M())) {
                        InterfaceC12371j interfaceC12371j3 = this.f64032b;
                        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_store_confirm_delete_multi_item_as_admin_title);
                        AbstractC19074t.m100207e(m118743r03, "getString(...)");
                        interfaceC12371j3.mo78936E(m118743r03);
                    } else {
                        InterfaceC12371j interfaceC12371j4 = this.f64032b;
                        String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_delete_multi_item_media_as_member_title);
                        AbstractC19074t.m100207e(m118743r04, "getString(...)");
                        interfaceC12371j4.mo78936E(m118743r04);
                    }
                }
                AbstractC23647d.m123897g("10015059");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12297h(InterfaceC12371j interfaceC12371j) {
            super(0);
            this.f64030r = interfaceC12371j;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final a mo12V4() {
            return new a(MediaStorePagePresenter.this, this.f64030r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePagePresenter$i */
    /* loaded from: classes6.dex */
    public static final class C12298i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ InterfaceC12371j f64035r;

        /* renamed from: com.zing.zalo.ui.mediastore.MediaStorePagePresenter$i$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC3501f0 {

            /* renamed from: a */
            final /* synthetic */ MediaStorePagePresenter f64036a;

            /* renamed from: b */
            final /* synthetic */ InterfaceC12371j f64037b;

            a(MediaStorePagePresenter mediaStorePagePresenter, InterfaceC12371j interfaceC12371j) {
                this.f64036a = mediaStorePagePresenter;
                this.f64037b = interfaceC12371j;
            }

            @Override // ci.AbstractC3501f0
            /* renamed from: b */
            public void mo17660b(String str, EnumC2382z enumC2382z, List list, boolean z11) {
                AbstractC19074t.m100208f(str, "conversationId");
                AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
                AbstractC19074t.m100208f(list, "deletedMsgIds");
                this.f64036a.m69058Sq(str, enumC2382z, list, z11);
            }

            @Override // ci.AbstractC3501f0
            /* renamed from: c */
            public void mo17661c(String str, EnumC2382z enumC2382z, List list) {
                AbstractC19074t.m100208f(str, "conversationId");
                AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
                AbstractC19074t.m100208f(list, "rolledIds");
                this.f64036a.m69061Vq(str, enumC2382z);
            }

            @Override // ci.AbstractC3501f0
            /* renamed from: d */
            public void mo17662d(String str, EnumC2382z enumC2382z, boolean z11, C20096c c20096c) {
                AbstractC19074t.m100208f(str, "conversationId");
                AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
                this.f64036a.m69062Zq(str, z11, c20096c);
            }

            @Override // ci.AbstractC3501f0
            /* renamed from: e */
            public void mo17663e(String str, EnumC2382z enumC2382z, boolean z11) {
                AbstractC19074t.m100208f(str, "conversationId");
                AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
                this.f64036a.m69064br(str, enumC2382z, z11);
            }

            @Override // ci.AbstractC3501f0
            /* renamed from: f */
            public void mo17664f() {
                this.f64037b.mo68915ks();
            }

            @Override // ci.AbstractC3501f0
            /* renamed from: g */
            public void mo17665g(String str, EnumC2382z enumC2382z, C20096c c20096c, List list) {
                AbstractC19074t.m100208f(str, "conversationId");
                AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
                this.f64036a.m69067dr(str, enumC2382z, c20096c, list);
            }

            @Override // ci.AbstractC3501f0
            /* renamed from: h */
            public void mo17666h(String str, EnumC2382z enumC2382z) {
                AbstractC19074t.m100208f(str, "conversationId");
                AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
                this.f64036a.m69069fr(str, enumC2382z);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12298i(InterfaceC12371j interfaceC12371j) {
            super(0);
            this.f64035r = interfaceC12371j;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final a mo12V4() {
            return new a(MediaStorePagePresenter.this, this.f64035r);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaStorePagePresenter(InterfaceC12371j interfaceC12371j) {
        super(interfaceC12371j);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        AbstractC19074t.m100208f(interfaceC12371j, "mvpView");
        C3521p0 m120569C0 = AbstractC23306f.m120569C0();
        AbstractC19074t.m100207e(m120569C0, "provideMediaStoresManager(...)");
        this.f64014t = m120569C0;
        this.f64015u = EnumC2382z.f9945r;
        this.f64020z = AbstractC23309i.m120819C8();
        this.f64000C = new ArrayList();
        this.f64001D = new Object();
        this.f64005H = new ArrayList();
        m129210a = AbstractC24856m.m129210a(new C12298i(interfaceC12371j));
        this.f64010M = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C12293d());
        this.f64011N = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C12292c());
        this.f64012O = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new C12297h(interfaceC12371j));
        this.f64013P = m129210a4;
    }

    /* renamed from: Aq */
    public final void m68965Aq(List list) {
        new C18303h(list, ((InterfaceC12371j) m103742Dp()).mo68859C2(), new C12295f()).m97213k();
        AbstractC23647d.m123897g("10015041");
    }

    /* renamed from: Ar */
    private final void m68966Ar() {
        C23744a.Companion.m124119a().m124115b(this, 177);
    }

    /* renamed from: Bq */
    private final void m68967Bq(MediaStoreItem mediaStoreItem) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("bol_extra_is_forwarding", true);
        bundle.putParcelable("forwardMessageId", mediaStoreItem.m40571M());
        bundle.putString("forwardMessageOwnerUid", m69045Iq().m17608M());
        bundle.putBoolean("bol_share_in_app", true);
        bundle.putString("STR_SOURCE_START_VIEW", m68972Fq());
        bundle.putString("STR_LOG_CHAT_TYPE", m69057S2());
        InterfaceC12371j.a.m69543a((InterfaceC12371j) m103742Dp(), bundle, 0, 2, null);
    }

    /* renamed from: Cr */
    private final void m68968Cr() {
        C23744a.Companion.m124119a().m124117e(this, 177);
    }

    /* renamed from: Dq */
    public final C12292c.a m68969Dq() {
        return (C12292c.a) this.f64012O.getValue();
    }

    /* renamed from: Dr */
    private final void m68970Dr() {
        boolean z11;
        try {
            if (!this.f64017w) {
                if (this.f64018x) {
                    this.f64018x = false;
                    MediaStoreBasePage.InterfaceC12275b interfaceC12275b = this.f64003F;
                    if (interfaceC12275b != null) {
                        interfaceC12275b.mo68940o4(false);
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z12 = true;
            if (!this.f64018x) {
                this.f64018x = true;
                MediaStoreBasePage.InterfaceC12275b interfaceC12275b2 = this.f64003F;
                if (interfaceC12275b2 != null) {
                    interfaceC12275b2.mo68940o4(true);
                }
            }
            MediaStoreBasePage.InterfaceC12276c interfaceC12276c = this.f64016v;
            if (interfaceC12276c != null) {
                interfaceC12276c.mo68948b(mo69054N1());
            }
            if (m68978Mq(mo69054N1()) > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!AbstractC23047d8.m118256h(m69045Iq().m17608M())) {
                for (MediaStoreItem mediaStoreItem : mo69054N1()) {
                    String m17608M = m69045Iq().m17608M();
                    List singletonList = Collections.singletonList(mediaStoreItem);
                    AbstractC19074t.m100207e(singletonList, "singletonList(...)");
                    if (!C3522q.m17808d(m17608M, singletonList).m17833a()) {
                        z12 = false;
                    }
                }
            }
            int size = mo69054N1().size();
            MediaStoreBasePage.InterfaceC12275b interfaceC12275b3 = this.f64003F;
            if (interfaceC12275b3 != null) {
                interfaceC12275b3.mo68939n4(size, z12, z11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: Eq */
    private final AbstractC27964c.a m68971Eq() {
        return (AbstractC27964c.a) this.f64011N.getValue();
    }

    /* renamed from: Fq */
    private final String m68972Fq() {
        return "chat_storedmedia";
    }

    /* renamed from: Hq */
    private final C12297h.a m68973Hq() {
        return (C12297h.a) this.f64013P.getValue();
    }

    /* renamed from: Mq */
    public final int m68978Mq(List list) {
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (((MediaStoreItem) it.next()).m40596j0()) {
                i11++;
            }
        }
        return i11;
    }

    /* renamed from: Oq */
    private final int m68981Oq() {
        int i11;
        int m116580c;
        AbstractC3498e m17615T = m69045Iq().m17615T(this.f64015u);
        if (m17615T != null) {
            i11 = m17615T.mo17564q();
        } else {
            i11 = 0;
        }
        if (this.f64004G) {
            m116580c = AbstractC22543l.m116580c(i11 - C31950hc.f146830a.m153643v(), 0);
            return m116580c;
        }
        return i11;
    }

    /* renamed from: Pq */
    public final void m68983Pq(MediaStoreItem mediaStoreItem, boolean z11, boolean z12, C3521p0.c cVar) {
        if (!z12 && AbstractC26687h.m137065f(mediaStoreItem.m40599m().mo95039W2(), mediaStoreItem.m40599m().m95238r3())) {
            m69073kr(mediaStoreItem);
        } else {
            m69026tq(mediaStoreItem, z11, z12, cVar);
        }
    }

    /* renamed from: Qq */
    public final void m68985Qq(MediaStoreItem mediaStoreItem, boolean z11, int i11) {
        try {
            if (mediaStoreItem.m40597k0() == z11) {
                return;
            }
            SelectedItemData m119809l = C23250w4.m119809l(C23250w4.f112644a, mediaStoreItem, null, 2, null);
            int i12 = 0;
            if (z11 && !m69013jq(this, m119809l, false, 2, null)) {
                return;
            }
            ((InterfaceC12371j) m103742Dp()).mo68852AC(mediaStoreItem, z11);
            mo69083vq(mediaStoreItem, z11);
            ((InterfaceC12371j) m103742Dp()).mo68861Cz(mediaStoreItem, i11);
            m69030xq(mediaStoreItem, z11, i11);
            m68970Dr();
            Iterator it = mo69054N1().iterator();
            while (it.hasNext()) {
                if (((MediaStoreItem) it.next()).m40596j0()) {
                    i12++;
                }
            }
            if (z11 && i12 == 1) {
                InterfaceC12371j interfaceC12371j = (InterfaceC12371j) m103742Dp();
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_cannot_forward_rolled_msg);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                interfaceC12371j.mo78936E(m118743r0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: Rq */
    static /* synthetic */ void m68987Rq(MediaStorePagePresenter mediaStorePagePresenter, MediaStoreItem mediaStoreItem, boolean z11, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 4) != 0) {
                i11 = -1;
            }
            mediaStorePagePresenter.m68985Qq(mediaStoreItem, z11, i11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleOnItemCheckBoxClicked");
    }

    /* renamed from: Tq */
    public static final void m68990Tq(List list, MediaStorePagePresenter mediaStorePagePresenter) {
        AbstractC19074t.m100208f(list, "$deletedMsgIds");
        AbstractC19074t.m100208f(mediaStorePagePresenter, "this$0");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessageId messageId = (MessageId) it.next();
            if (messageId != null) {
                mediaStorePagePresenter.m69018or(messageId);
            }
        }
        mediaStorePagePresenter.mo69036Aj();
        mediaStorePagePresenter.m68970Dr();
    }

    /* renamed from: Wq */
    public static final void m68992Wq(MediaStorePagePresenter mediaStorePagePresenter) {
        AbstractC19074t.m100208f(mediaStorePagePresenter, "this$0");
        mediaStorePagePresenter.mo69036Aj();
        mediaStorePagePresenter.m68970Dr();
    }

    /* renamed from: Xq */
    public final void m68994Xq(MediaStoreItem mediaStoreItem) {
        String str;
        int i11;
        try {
            if (!TextUtils.isEmpty(mediaStoreItem.m40579W())) {
                AbstractC23647d.m123906p("1001511");
                if (new C24329j("(?i)^(http://|https://).*").m127018f(mediaStoreItem.m40579W())) {
                    str = mediaStoreItem.m40579W();
                } else {
                    str = "https://" + mediaStoreItem.m40579W();
                }
                if (C31944h6.m153518C(C31986k3.f147083a.m154105P1(m69045Iq().m17608M())) && !C31944h6.m153543i(str)) {
                    ((InterfaceC12371j) m103742Dp()).mo68855An(str, m69057S2(), m68972Fq());
                    C2526d.f10270a.m12723o0(m68972Fq(), m69057S2());
                } else {
                    int m40668g = TrackingSource.m40668g(m69045Iq().m17608M());
                    String m40670i = TrackingSource.m40670i(m40668g, m69045Iq().m17608M());
                    AbstractC19074t.m100207e(m40670i, "genSourceParamMediaStore(...)");
                    if (AbstractC25495a.m132079d(m69045Iq().m17608M())) {
                        i11 = 7;
                    } else {
                        i11 = 6;
                    }
                    ((InterfaceC12371j) m103742Dp()).mo68909g6(str, m40668g, m40670i, i11);
                }
                AbstractC23647d.m123893c();
                C3509j0.m17723i(m69045Iq().m17608M(), 2, 1);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: Yq */
    public final void m68996Yq() {
        boolean z11 = true;
        try {
            if (C23055e5.m118272g(true)) {
                if (m68981Oq() <= 0) {
                    z11 = false;
                }
                m69045Iq().m17623g0(new C3490a(this.f64015u, z11));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: ar */
    public static final void m68999ar(MediaStorePagePresenter mediaStorePagePresenter, C20096c c20096c, boolean z11) {
        int i11;
        MultiStateView.EnumC15915f enumC15915f;
        AbstractC19074t.m100208f(mediaStorePagePresenter, "this$0");
        try {
            mediaStorePagePresenter.mo69036Aj();
            mediaStorePagePresenter.m68970Dr();
            boolean z12 = false;
            if (c20096c != null && c20096c.m104491c() == 0) {
                MediaStoreBasePage.InterfaceC12275b interfaceC12275b = mediaStorePagePresenter.f64003F;
                if (interfaceC12275b != null) {
                    interfaceC12275b.mo68938S3(false);
                }
                ((InterfaceC12371j) mediaStorePagePresenter.m103742Dp()).mo68893W9(MultiStateView.EnumC15915f.NON_ERROR, mediaStorePagePresenter.m68981Oq());
                InterfaceC12371j.a.m69545c((InterfaceC12371j) mediaStorePagePresenter.m103742Dp(), false, false, false, 4, null);
                ((InterfaceC12371j) mediaStorePagePresenter.m103742Dp()).mo68887Sw();
                if (!z11) {
                    mediaStorePagePresenter.m69021qr();
                    return;
                }
                return;
            }
            if (mediaStorePagePresenter.m68981Oq() == 0) {
                if (c20096c != null && c20096c.m104491c() == 50001) {
                    z12 = true;
                }
                InterfaceC12371j interfaceC12371j = (InterfaceC12371j) mediaStorePagePresenter.m103742Dp();
                if (z12) {
                    i11 = AbstractC8020f0.NETWORK_ERROR_MSG;
                } else {
                    i11 = AbstractC8020f0.unknown_error;
                }
                String m118743r0 = AbstractC23136l9.m118743r0(i11);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                interfaceC12371j.mo68897Wj(m118743r0);
                if (z12) {
                    enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                } else {
                    enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                }
                ((InterfaceC12371j) mediaStorePagePresenter.m103742Dp()).mo68893W9(enumC15915f, mediaStorePagePresenter.m68981Oq());
                return;
            }
            InterfaceC12371j.a.m69545c((InterfaceC12371j) mediaStorePagePresenter.m103742Dp(), false, !mediaStorePagePresenter.m69045Iq().m17622g(mediaStorePagePresenter.f64015u), false, 4, null);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: cr */
    public static final void m69002cr(boolean z11, MediaStorePagePresenter mediaStorePagePresenter) {
        AbstractC19074t.m100208f(mediaStorePagePresenter, "this$0");
        if (!z11) {
            mediaStorePagePresenter.mo69036Aj();
        } else {
            ((InterfaceC12371j) mediaStorePagePresenter.m103742Dp()).mo68865Ed(true, false, true);
        }
    }

    /* renamed from: er */
    public static final void m69005er(MediaStorePagePresenter mediaStorePagePresenter, C20096c c20096c, List list) {
        List list2;
        AbstractC19074t.m100208f(mediaStorePagePresenter, "this$0");
        boolean z11 = true;
        InterfaceC12371j.a.m69544b((InterfaceC12371j) mediaStorePagePresenter.m103742Dp(), 0L, 1, null);
        if (c20096c == null || c20096c.m104491c() != 0 || (list2 = list) == null || list2.isEmpty()) {
            z11 = false;
        }
        if (((InterfaceC12371j) mediaStorePagePresenter.m103742Dp()).mo68918on()) {
            if (z11) {
                InterfaceC12371j interfaceC12371j = (InterfaceC12371j) mediaStorePagePresenter.m103742Dp();
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.suggestfriend_success_delete);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                interfaceC12371j.mo78936E(m118743r0);
                mediaStorePagePresenter.mo69036Aj();
                return;
            }
            if (c20096c != null && c20096c.m104491c() == 50001) {
                InterfaceC12371j interfaceC12371j2 = (InterfaceC12371j) mediaStorePagePresenter.m103742Dp();
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.location_no_network);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                interfaceC12371j2.mo78936E(m118743r02);
                return;
            }
            InterfaceC12371j interfaceC12371j3 = (InterfaceC12371j) mediaStorePagePresenter.m103742Dp();
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_general);
            AbstractC19074t.m100207e(m118743r03, "getString(...)");
            interfaceC12371j3.mo78936E(m118743r03);
        }
    }

    /* renamed from: gr */
    public static final void m69008gr(MediaStorePagePresenter mediaStorePagePresenter) {
        AbstractC19074t.m100208f(mediaStorePagePresenter, "this$0");
        if (((InterfaceC12371j) mediaStorePagePresenter.m103742Dp()).mo68918on()) {
            ((InterfaceC12371j) mediaStorePagePresenter.m103742Dp()).mo68900Yj(500L);
        }
    }

    /* renamed from: hq */
    private final void m69009hq(List list, boolean z11) {
        EnumC23654k enumC23654k;
        int i11;
        if (!z11) {
            enumC23654k = EnumC23654k.f114595q;
        } else if (AbstractC25495a.m132079d(m69045Iq().m17608M())) {
            enumC23654k = EnumC23654k.f114597s;
        } else {
            enumC23654k = EnumC23654k.f114596r;
        }
        C31973j5 m4473g = C0943w.f3447a.m4473g(AbstractC25495a.m132088m(m69045Iq().m17608M()));
        EnumC23663t mo69053Lq = mo69053Lq();
        if (m4473g != null) {
            i11 = m4473g.m153732O();
        } else {
            i11 = 0;
        }
        C2526d.m12660i0(C2526d.f10270a, list, null, new C23662s(mo69053Lq, enumC23654k, i11), m69057S2(), 2, null);
    }

    /* renamed from: hr */
    public final void m69010hr(C20556f c20556f) {
        try {
            AbstractC23647d.m123906p("1001521");
            ((InterfaceC12371j) m103742Dp()).mo68892W(c20556f);
            AbstractC23647d.m123893c();
        } catch (Exception e11) {
            AbstractC23350e.m122776f(MediaStoreBasePage.Companion.m68934a(), e11);
        }
    }

    /* renamed from: iq */
    private final boolean m69011iq(SelectedItemData selectedItemData, boolean z11) {
        boolean z12;
        synchronized (mo69054N1()) {
            try {
                List mo69054N1 = mo69054N1();
                if (!(mo69054N1 instanceof Collection) || !mo69054N1.isEmpty()) {
                    Iterator it = mo69054N1.iterator();
                    while (it.hasNext()) {
                        if (AbstractC19074t.m100204b(((MediaStoreItem) it.next()).m40571M(), selectedItemData.m72576a().m95029V3())) {
                            break;
                        }
                    }
                }
                if (mo69054N1().size() >= this.f64020z) {
                    z12 = false;
                    if (!z12 && z11) {
                        InterfaceC12371j interfaceC12371j = (InterfaceC12371j) m103742Dp();
                        String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_select_max_messages_prompt, Integer.valueOf(this.f64020z));
                        AbstractC19074t.m100207e(m118746s0, "getString(...)");
                        interfaceC12371j.mo78949ch(true, m118746s0);
                        ((InterfaceC12371j) m103742Dp()).mo68914k1();
                    }
                }
                z12 = true;
                if (!z12) {
                    InterfaceC12371j interfaceC12371j2 = (InterfaceC12371j) m103742Dp();
                    String m118746s02 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_select_max_messages_prompt, Integer.valueOf(this.f64020z));
                    AbstractC19074t.m100207e(m118746s02, "getString(...)");
                    interfaceC12371j2.mo78949ch(true, m118746s02);
                    ((InterfaceC12371j) m103742Dp()).mo68914k1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z12;
    }

    /* renamed from: ir */
    private final void m69012ir(int i11, Intent intent) {
        Bundle extras;
        if (i11 != -1 || intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        ArrayList<String> stringArrayList = extras.getStringArrayList("deletedPhoto");
        if (stringArrayList != null) {
            if (stringArrayList.isEmpty()) {
                return;
            }
            mo69036Aj();
            ((InterfaceC12371j) m103742Dp()).mo68911gb();
        }
        if (intent.getBooleanExtra("EXTRA_SHOW_SNACKBAR_UNDO_DELETING_ITEM_FROM_VIEWFULL", false)) {
            m69029wr(true, C31950hc.f146830a.m153646y());
            mo69036Aj();
        }
    }

    /* renamed from: jq */
    static /* synthetic */ boolean m69013jq(MediaStorePagePresenter mediaStorePagePresenter, SelectedItemData selectedItemData, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                z11 = true;
            }
            return mediaStorePagePresenter.m69011iq(selectedItemData, z11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkIfValidToSelectItem");
    }

    /* renamed from: jr */
    public final void m69014jr(C7906d c7906d, boolean z11, int i11) {
        m69015lq(c7906d, z11);
        m69028wq(c7906d, z11, i11, true);
        ((InterfaceC12371j) m103742Dp()).mo68919pI(c7906d, i11);
        m68970Dr();
    }

    /* renamed from: lq */
    private final void m69015lq(C7906d c7906d, boolean z11) {
        ArrayList<MediaStoreItem> arrayList;
        if (c7906d != null) {
            try {
                c7906d.m40834w(z11);
                if (c7906d.m40824m() > 0) {
                    synchronized (c7906d.m40823l()) {
                        arrayList = new ArrayList(c7906d.m40823l());
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    }
                    for (MediaStoreItem mediaStoreItem : arrayList) {
                        SelectedItemData m119809l = C23250w4.m119809l(C23250w4.f112644a, mediaStoreItem, null, 2, null);
                        if (!z11 || m69013jq(this, m119809l, false, 2, null)) {
                            mo69083vq(mediaStoreItem, z11);
                        } else {
                            return;
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: mq */
    private final void m69016mq(MediaStoreItem mediaStoreItem) {
        List m131496e;
        ((InterfaceC12371j) m103742Dp()).mo68888Tb();
        this.f63999B = mediaStoreItem;
        InterfaceC12371j interfaceC12371j = (InterfaceC12371j) m103742Dp();
        String m17608M = m69045Iq().m17608M();
        m131496e = AbstractC25366r.m131496e(mediaStoreItem);
        interfaceC12371j.mo68883Op(m17608M, m131496e, m68969Dq());
    }

    /* renamed from: nq */
    private final void m69017nq() {
        if (!this.f64019y) {
            this.f64019y = true;
            C23081g9.m118410g(30L);
        }
    }

    /* renamed from: or */
    private final void m69018or(MessageId messageId) {
        MessageId messageId2;
        MessageId messageId3;
        try {
            MediaStoreItem mediaStoreItem = this.f63998A;
            if (mediaStoreItem != null) {
                messageId2 = mediaStoreItem.m40571M();
            } else {
                messageId2 = null;
            }
            if (AbstractC19074t.m100204b(messageId2, messageId)) {
                ((InterfaceC12371j) m103742Dp()).mo68864Eb();
                this.f63998A = null;
            }
            MediaStoreItem mediaStoreItem2 = this.f63999B;
            if (mediaStoreItem2 != null) {
                if (mediaStoreItem2 != null) {
                    messageId3 = mediaStoreItem2.m40571M();
                } else {
                    messageId3 = null;
                }
                if (AbstractC19074t.m100204b(messageId3, messageId)) {
                    this.f63999B = null;
                }
                if (this.f63999B == null) {
                    ((InterfaceC12371j) m103742Dp()).mo68888Tb();
                }
            }
            if (!this.f64000C.isEmpty()) {
                Iterator it = this.f64000C.iterator();
                while (it.hasNext()) {
                    if (AbstractC19074t.m100204b(((MediaStoreItem) it.next()).m40571M(), messageId)) {
                        it.remove();
                    }
                }
                if (this.f64000C.isEmpty()) {
                    ((InterfaceC12371j) m103742Dp()).mo68888Tb();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: pq */
    private final ArrayList m69019pq() {
        ArrayList arrayList = new ArrayList();
        int size = mo69055Nq().size();
        for (int i11 = 0; i11 < size; i11++) {
            C7906d c7906d = (C7906d) mo69055Nq().get(i11);
            synchronized (c7906d.m40823l()) {
                try {
                    int size2 = c7906d.m40823l().size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        MediaStoreItem mediaStoreItem = (MediaStoreItem) c7906d.m40823l().get(i12);
                        if (!mediaStoreItem.m40596j0() && (mediaStoreItem.m40599m().m94871D7() || mediaStoreItem.m40599m().m95306y8() || mediaStoreItem.m40599m().m95120e6())) {
                            ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
                            itemAlbumMobile.m40512W(mediaStoreItem, m69045Iq().m17608M(), true);
                            arrayList.add(itemAlbumMobile);
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: qq */
    public static final void m69020qq(Object[] objArr, MediaStorePagePresenter mediaStorePagePresenter) {
        AbstractC19074t.m100208f(objArr, "$args");
        AbstractC19074t.m100208f(mediaStorePagePresenter, "this$0");
        try {
            Object obj = objArr[0];
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.connection.state.ConnectionState");
            if (((EnumC30982b) obj) == EnumC30982b.CONNECTED) {
                ((InterfaceC12371j) mediaStorePagePresenter.m103742Dp()).mo68923ui();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: qr */
    private final void m69021qr() {
        MediaStoreItem mediaStoreItem = this.f63998A;
        if (mediaStoreItem == null && this.f63999B == null) {
            return;
        }
        if (mediaStoreItem != null) {
            try {
                if (!mo69074lr(mediaStoreItem.m40571M())) {
                    ((InterfaceC12371j) m103742Dp()).mo68864Eb();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        MediaStoreItem mediaStoreItem2 = this.f63999B;
        if (mediaStoreItem2 != null) {
            if (!mo69074lr(mediaStoreItem2.m40571M())) {
                this.f63999B = null;
            }
            if (this.f63999B == null) {
                ((InterfaceC12371j) m103742Dp()).mo68888Tb();
            }
        }
    }

    /* renamed from: rq */
    public static final void m69022rq(MediaStorePagePresenter mediaStorePagePresenter) {
        AbstractC19074t.m100208f(mediaStorePagePresenter, "this$0");
        mediaStorePagePresenter.mo69036Aj();
    }

    /* renamed from: rr */
    public final void m69023rr(List list, boolean z11) {
        int m131511r;
        String str;
        int m131511r2;
        try {
            List list2 = list;
            m131511r = AbstractC25370t.m131511r(list2, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((MediaStoreItem) it.next()).m40599m());
            }
            JSONObject jSONObject = new JSONObject();
            if (z11) {
                str = "all";
            } else {
                str = "me";
            }
            try {
                jSONObject.put("delete_for", str);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZCF-55", e11);
            }
            C31950hc c31950hc = C31950hc.f146830a;
            c31950hc.m153638L("chat_storedmedia", 0, "msg_chat_delete", arrayList, jSONObject.toString());
            if (!z11 && c31950hc.m153644w()) {
                AbstractC18428c.m97659b(C23288a.f113033a, m69045Iq().m17608M(), 0, new Runnable() { // from class: x70.b0

                    /* renamed from: q */
                    public final /* synthetic */ List f135950q;

                    public /* synthetic */ RunnableC29401b0(List arrayList2) {
                        r2 = arrayList2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaStorePagePresenter.m69025sr(MediaStorePagePresenter.this, r2);
                    }
                }, 2, null);
                m69029wr(true, arrayList2);
                mo69037BH();
            }
            if (C3522q.f14777a.m17821q(m69045Iq(), this.f64015u, list, z11)) {
                List list3 = list;
                m131511r2 = AbstractC25370t.m131511r(list3, 10);
                ArrayList arrayList2 = new ArrayList(m131511r2);
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((MediaStoreItem) it2.next()).m40599m());
                }
                m69009hq(arrayList2, z11);
            }
            mo69037BH();
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
        }
    }

    /* renamed from: sq */
    public static final void m69024sq(MediaStorePagePresenter mediaStorePagePresenter) {
        AbstractC19074t.m100208f(mediaStorePagePresenter, "this$0");
        mediaStorePagePresenter.mo69066dg();
    }

    /* renamed from: sr */
    public static final void m69025sr(MediaStorePagePresenter mediaStorePagePresenter, List list) {
        AbstractC19074t.m100208f(mediaStorePagePresenter, "this$0");
        AbstractC19074t.m100208f(list, "$chatContentsList");
        C31950hc.f146830a.m153637J(mediaStorePagePresenter.m69045Iq().m17608M(), list);
    }

    /* renamed from: tq */
    private final void m69026tq(MediaStoreItem mediaStoreItem, boolean z11, boolean z12, C3521p0.c cVar) {
        if (z12 && !AbstractC23034c6.m118118E()) {
            ((InterfaceC12371j) m103742Dp()).mo68869Ib();
            this.f64007J = mediaStoreItem;
            this.f64008K = z11;
            this.f64009L = cVar;
            return;
        }
        mediaStoreItem.m40595j(z11, z12, cVar);
    }

    /* renamed from: vr */
    private final void m69027vr(String str) {
        if (AbstractC25495a.m132079d(m69045Iq().m17608M())) {
            C0697c0.b bVar = C0697c0.Companion;
            bVar.m1054h(str, ZinstantMetaConstant.IMPRESSION_META_TYPE, "group");
            bVar.m1054h(str, "threadId", AbstractC25495a.m132089n(m69045Iq().m17608M()));
        } else {
            C0697c0.b bVar2 = C0697c0.Companion;
            bVar2.m1054h(str, ZinstantMetaConstant.IMPRESSION_META_TYPE, "1_1");
            bVar2.m1054h(str, "threadId", m69045Iq().m17608M());
        }
    }

    /* renamed from: wq */
    private final void m69028wq(C7906d c7906d, boolean z11, int i11, boolean z12) {
        boolean z13;
        if (z11 && c7906d.m40828q()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c7906d.m40829r() == z13) {
            return;
        }
        c7906d.m40833v(z13);
        ((InterfaceC12371j) m103742Dp()).mo68871Jw(c7906d, z11, i11, z12);
    }

    /* renamed from: wr */
    private final void m69029wr(boolean z11, List list) {
        ((InterfaceC12371j) m103742Dp()).mo68931z(z11, list);
    }

    /* renamed from: xq */
    private final void m69030xq(MediaStoreItem mediaStoreItem, boolean z11, int i11) {
        Object obj;
        Iterator it = mo69055Nq().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C7906d) obj).m40816e(mediaStoreItem)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C7906d c7906d = (C7906d) obj;
        if (c7906d != null) {
            m69028wq(c7906d, z11, i11, false);
        }
    }

    /* renamed from: xr */
    private final void m69031xr(MediaStoreItem mediaStoreItem) {
        AbstractC23647d.m123897g("1001503");
        if (AbstractC25495a.m132079d(m69045Iq().m17608M())) {
            long mo124311f = C23793c.Companion.m124321a().mo124311f() - mediaStoreItem.m40599m().m95313z4();
            if (mo124311f <= 604800000) {
                AbstractC23647d.m123897g("10015013");
            } else if (mo124311f <= 2592000000L) {
                AbstractC23647d.m123897g("10015014");
            } else if (mo124311f <= 31536000000L) {
                AbstractC23647d.m123897g("10015015");
            } else {
                AbstractC23647d.m123897g("10015016");
            }
            int i11 = C12291b.f64022b[m69045Iq().m17616U().ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        AbstractC23647d.m123897g("10015019");
                        return;
                    }
                    return;
                }
                AbstractC23647d.m123897g("10015018");
                return;
            }
            AbstractC23647d.m123897g("10015017");
        }
    }

    /* renamed from: yq */
    private final void m69032yq(List list) {
        new C18298c(list, m69045Iq().m17608M(), new C12294e()).m97213k();
    }

    /* renamed from: yr */
    private final void m69033yr(EnumC2382z enumC2382z) {
        int i11 = C12291b.f64021a[enumC2382z.ordinal()];
        String str = "1001501";
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    str = "1001523";
                }
            } else {
                str = "1001512";
            }
        }
        AbstractC23647d.m123897g(str);
    }

    /* renamed from: zq */
    public final void m69034zq(List list) {
        int m131511r;
        int i11;
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_BOOLEAN_FORWARD_MULTI_MESSAGES", true);
        List list2 = list;
        m131511r = AbstractC25370t.m131511r(list2, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((MediaStoreItem) it.next()).m40571M());
        }
        bundle.putParcelableArrayList("EXTRA_LIST_MESSAGE_ID_FORWARDING", new ArrayList<>(arrayList));
        bundle.putString("forwardMessageOwnerUid", m69045Iq().m17608M());
        bundle.putBoolean("bol_share_in_app", true);
        bundle.putString("STR_SOURCE_START_VIEW", m68972Fq());
        bundle.putString("STR_LOG_CHAT_TYPE", m69057S2());
        if (AbstractC25495a.m132079d(m69045Iq().m17608M())) {
            i11 = 9;
        } else {
            i11 = 7;
        }
        bundle.putString("extra_tracking_source_feed", new TrackingSource(i11).m40686z());
        ((InterfaceC12371j) m103742Dp()).mo68920q8(bundle, 100);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: A */
    public void mo69035A() {
        if (!this.f64005H.isEmpty()) {
            if (!this.f64006I && C31950hc.f146830a.m153636I(this.f64005H)) {
                ToastUtils.m89266n(AbstractC8020f0.str_unable_perform_action, new Object[0]);
            }
            this.f64005H.clear();
            this.f64006I = false;
        }
        C31950hc.f146830a.m153639l();
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: Aj */
    public void mo69036Aj() {
        boolean z11;
        try {
            AbstractC3498e m17615T = m69045Iq().m17615T(this.f64015u);
            if (m17615T == null) {
                return;
            }
            if (mo69055Nq().isEmpty() && m17615T.m17567u()) {
                z11 = true;
            } else {
                z11 = false;
            }
            ((InterfaceC12371j) m103742Dp()).mo68894WB(this.f64015u, mo69055Nq(), m68981Oq(), z11, m69045Iq().m17618c0(this.f64015u), m69045Iq().m17617a0());
            ((InterfaceC12371j) m103742Dp()).mo68885S9();
            ((InterfaceC12371j) m103742Dp()).mo68854Aa();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: BH */
    public boolean mo69037BH() {
        try {
            mo69076oq();
            if (!this.f64017w) {
                return false;
            }
            MediaStoreBasePage.InterfaceC12276c interfaceC12276c = this.f64016v;
            if (interfaceC12276c != null) {
                interfaceC12276c.mo68949c(false);
            }
            this.f64017w = false;
            MediaStoreBasePage.InterfaceC12275b interfaceC12275b = this.f64003F;
            if (interfaceC12275b != null) {
                interfaceC12275b.mo68935F3(true);
            }
            this.f64019y = false;
            ((InterfaceC12371j) m103742Dp()).mo68873K1(false);
            m68970Dr();
            return true;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return false;
        }
    }

    /* renamed from: Br */
    public void mo69038Br() {
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 73);
        bVar.m124119a().m124117e(this, 174);
        bVar.m124119a().m124117e(this, 175);
        bVar.m124119a().m124117e(this, 176);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: CA */
    public void mo69039CA(MediaStoreBasePage.InterfaceC12276c interfaceC12276c) {
        this.f64016v = interfaceC12276c;
    }

    /* renamed from: Cq */
    public final MediaStoreBasePage.InterfaceC12275b m69040Cq() {
        return this.f64003F;
    }

    @Override // androidx.lifecycle.InterfaceC1767f
    /* renamed from: D5 */
    public void mo8645D5(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        AbstractC1765e.m9272a(this, interfaceC1801w);
        mo69085zr();
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: DG */
    public void mo69041DG(Object obj) {
        HashMap hashMap;
        MediaStoreItem mediaStoreItem;
        List m131506n;
        List m131496e;
        AbstractC19074t.m100208f(obj, "which");
        Integer num = null;
        if (obj instanceof HashMap) {
            hashMap = (HashMap) obj;
        } else {
            hashMap = null;
        }
        if (hashMap == null || (mediaStoreItem = this.f63998A) == null) {
            return;
        }
        C23250w4 c23250w4 = C23250w4.f112644a;
        EnumC2382z m119823J = c23250w4.m119823J(mediaStoreItem.m40599m());
        Object obj2 = hashMap.get("id");
        if (obj2 instanceof Integer) {
            num = (Integer) obj2;
        }
        int i11 = AbstractC8020f0.share;
        if (num != null && num.intValue() == i11) {
            int i12 = C12291b.f64021a[m119823J.ordinal()];
            if (i12 == 1) {
                m131506n = AbstractC25368s.m131506n(mediaStoreItem);
                m68965Aq(m131506n);
                AbstractC23647d.m123897g("10015057");
            } else if (i12 != 2) {
                if (i12 == 3) {
                    m131496e = AbstractC25366r.m131496e(mediaStoreItem);
                    m69032yq(m131496e);
                }
            } else {
                m68967Bq(mediaStoreItem);
                AbstractC23647d.m123897g("1001514");
            }
            EnumC2382z enumC2382z = EnumC2382z.f9946s;
            if (m119823J == enumC2382z) {
                C3509j0.m17720f(m69045Iq().m17608M(), 2, enumC2382z, 1);
                return;
            }
            EnumC2382z enumC2382z2 = EnumC2382z.f9947t;
            if (m119823J == enumC2382z2) {
                C3509j0.m17720f(m69045Iq().m17608M(), 3, enumC2382z2, 1);
                return;
            }
            return;
        }
        int i13 = AbstractC8020f0.str_media_store_copy_link;
        if (num != null && num.intValue() == i13) {
            ((InterfaceC12371j) m103742Dp()).mo68884RA(mediaStoreItem.m40576T());
            AbstractC23647d.m123897g("1001515");
            C2526d.f10270a.m12676F(mediaStoreItem, "chat_storedmedia", m69057S2());
            return;
        }
        int m119819C = c23250w4.m119819C(mediaStoreItem.m40599m());
        if (num != null && num.intValue() == m119819C) {
            ((InterfaceC12371j) m103742Dp()).mo68876LB(mediaStoreItem, false);
            return;
        }
        int i14 = AbstractC8020f0.str_view_original_msg;
        if (num != null && num.intValue() == i14) {
            MediaStoreBasePage.InterfaceC12275b interfaceC12275b = this.f64003F;
            if (interfaceC12275b != null) {
                interfaceC12275b.mo68943r4(mediaStoreItem);
            }
            int i15 = C12291b.f64021a[m119823J.ordinal()];
            String str = "1001500";
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 == 3) {
                        str = "1001520";
                    }
                } else {
                    str = "1001510";
                }
            }
            AbstractC23647d.m123906p(str);
            AbstractC23647d.m123893c();
            return;
        }
        int i16 = AbstractC8020f0.delete;
        if (num != null && num.intValue() == i16) {
            m69016mq(mediaStoreItem);
        }
    }

    /* renamed from: Gq */
    public final MediaStoreBasePage.InterfaceC12276c m69042Gq() {
        return this.f64016v;
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: H0 */
    public void mo69043H0() {
        mo69080uq(false);
        ((InterfaceC12371j) m103742Dp()).mo68921rD();
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: Hi */
    public C7226u3.c mo69044Hi() {
        return new C12296g();
    }

    /* renamed from: Iq */
    public final C3499e0 m69045Iq() {
        C3499e0 c3499e0 = this.f64002E;
        if (c3499e0 != null) {
            return c3499e0;
        }
        AbstractC19074t.m100223u("mediaStore");
        return null;
    }

    /* renamed from: Jq */
    public AbstractC3501f0 mo69046Jq() {
        return (AbstractC3501f0) this.f64010M.getValue();
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: Jy */
    public boolean mo69047Jy(int i11) {
        return true;
    }

    /* renamed from: Kq */
    protected final EnumC2382z m69048Kq() {
        return this.f64015u;
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: Kr */
    public void mo69049Kr(boolean z11) {
        this.f64004G = z11;
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: L */
    public void mo69050L() {
        try {
            MediaStoreBasePage.InterfaceC12276c interfaceC12276c = this.f64016v;
            if (interfaceC12276c != null) {
                interfaceC12276c.mo68947a();
            }
            ((InterfaceC12371j) m103742Dp()).mo68882Oi();
            m69045Iq().m17627m0(mo69046Jq());
            mo69080uq(false);
            m69027vr(getTrackingKey());
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZCF-55", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: Lk */
    public void mo69051Lk(C12369h c12369h, Bundle bundle) {
        AbstractC19074t.m100208f(c12369h, "viewArgs");
        this.f64015u = c12369h.m69537b();
        CreateMediaStoreParam m69536a = c12369h.m69536a();
        if (m69536a != null) {
            m69081ur(this.f64014t.m17791p(m69536a));
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: Lo */
    public void mo69052Lo(boolean z11) {
        try {
            MediaStoreBasePage.InterfaceC12276c interfaceC12276c = this.f64016v;
            if (interfaceC12276c != null) {
                interfaceC12276c.mo68949c(true);
            }
            MediaStoreBasePage.InterfaceC12276c interfaceC12276c2 = this.f64016v;
            if (interfaceC12276c2 != null) {
                interfaceC12276c2.mo68948b(mo69054N1());
            }
            this.f64017w = true;
            if (z11) {
                m69017nq();
            }
            MediaStoreBasePage.InterfaceC12275b interfaceC12275b = this.f64003F;
            if (interfaceC12275b != null) {
                interfaceC12275b.mo68935F3(false);
            }
            ((InterfaceC12371j) m103742Dp()).mo68873K1(true);
            m68970Dr();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: Lq */
    public EnumC23663t mo69053Lq() {
        return C23250w4.f112644a.m119824K(m69045Iq().m17612Q());
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:            r0 = qm0.AbstractC25332a0.m131187O0(r0);     */
    /* renamed from: N1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List mo69054N1() {
        List m131187O0;
        AbstractC3498e m17615T = m69045Iq().m17615T(this.f64015u);
        if (m17615T == null || (r0 = m17615T.m17563p()) == null || m131187O0 == null) {
            return new ArrayList();
        }
        return m131187O0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:            r0 = qm0.AbstractC25332a0.m131187O0(r0);     */
    /* renamed from: Nq */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List mo69055Nq() {
        List m131187O0;
        AbstractC3498e m17615T = m69045Iq().m17615T(this.f64015u);
        if (m17615T == null || (r0 = m17615T.m17559l()) == null || m131187O0 == null) {
            return new ArrayList();
        }
        return m131187O0;
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: RE */
    public void mo69056RE() {
        this.f64005H.clear();
    }

    @Override // androidx.lifecycle.InterfaceC1767f
    /* renamed from: Ro */
    public void mo8646Ro(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        mo69036Aj();
        m68970Dr();
    }

    /* renamed from: S2 */
    public final String m69057S2() {
        return C23250w4.f112644a.m119822I(m69045Iq().m17608M());
    }

    /* renamed from: Sq */
    public final void m69058Sq(String str, EnumC2382z enumC2382z, List list, boolean z11) {
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
        AbstractC19074t.m100208f(list, "deletedMsgIds");
        if (TextUtils.equals(str, m69045Iq().m17608M()) && enumC2382z == this.f64015u) {
            this.f64005H.addAll(list);
            this.f64006I = z11;
            AbstractC19444a.m101697e(new Runnable() { // from class: x70.x

                /* renamed from: p */
                public final /* synthetic */ List f136118p;

                /* renamed from: q */
                public final /* synthetic */ MediaStorePagePresenter f136119q;

                public /* synthetic */ RunnableC29465x(List list2, MediaStorePagePresenter this) {
                    r1 = list2;
                    r2 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MediaStorePagePresenter.m68990Tq(r1, r2);
                }
            });
        }
    }

    /* renamed from: Uq */
    public void mo69059Uq(int i11, MediaStoreItem mediaStoreItem) {
        AbstractC19074t.m100208f(mediaStoreItem, "item");
        try {
            if (!this.f64017w) {
                AbstractC23647d.m123897g("10015055");
                AbstractC23647d.m123897g("10015054");
            }
            ((InterfaceC12371j) m103742Dp()).mo68916l1(i11);
            mo69052Lo(true);
            m68987Rq(this, mediaStoreItem, true, 0, 4, null);
            ((InterfaceC12371j) m103742Dp()).mo68922s2(i11);
            for (C7906d c7906d : mo69055Nq()) {
                if (c7906d.m40816e(mediaStoreItem)) {
                    if (c7906d.m40828q()) {
                        c7906d.m40833v(true);
                    }
                    ((InterfaceC12371j) m103742Dp()).mo68917nz(c7906d, false);
                    return;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: Vh */
    public void mo69060Vh(MediaStoreBasePage.InterfaceC12275b interfaceC12275b) {
        this.f64003F = interfaceC12275b;
    }

    /* renamed from: Vq */
    public final void m69061Vq(String str, EnumC2382z enumC2382z) {
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
        if (TextUtils.equals(str, m69045Iq().m17608M()) && enumC2382z == this.f64015u) {
            AbstractC19444a.m101697e(new Runnable() { // from class: x70.v
                public /* synthetic */ RunnableC29460v() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MediaStorePagePresenter.m68992Wq(MediaStorePagePresenter.this);
                }
            });
        }
    }

    @Override // androidx.lifecycle.InterfaceC1767f
    /* renamed from: Xy */
    public void mo8647Xy(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        int i11 = C12291b.f64021a[this.f64015u.ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                i12 = 3;
                if (i11 != 3) {
                    i12 = 0;
                }
            }
        }
        ((InterfaceC12371j) m103742Dp()).mo68880NF(m69045Iq().m17608M(), this.f64015u, i12);
        m69045Iq().m17637s0(mo69046Jq());
        mo69038Br();
    }

    /* renamed from: Zq */
    public final void m69062Zq(String str, boolean z11, C20096c c20096c) {
        AbstractC19074t.m100208f(str, "conversationId");
        if (!TextUtils.equals(str, m69045Iq().m17608M())) {
            return;
        }
        AbstractC19444a.m101697e(new Runnable() { // from class: x70.y

            /* renamed from: q */
            public final /* synthetic */ C20096c f136122q;

            /* renamed from: r */
            public final /* synthetic */ boolean f136123r;

            public /* synthetic */ RunnableC29467y(C20096c c20096c2, boolean z112) {
                r2 = c20096c2;
                r3 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MediaStorePagePresenter.m68999ar(MediaStorePagePresenter.this, r2, r3);
            }
        });
    }

    @Override // androidx.lifecycle.InterfaceC1767f
    /* renamed from: Zv */
    public void mo8648Zv(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        AbstractC1765e.m9277f(this, interfaceC1801w);
        m68968Cr();
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: b3 */
    public void mo69063b3() {
        ((InterfaceC12371j) m103742Dp()).mo68912ge(m68971Eq(), new C7226u3.b(m69045Iq().m17608M(), this.f64015u, m69045Iq().m17612Q(), m69057S2()));
    }

    /* renamed from: br */
    public final void m69064br(String str, EnumC2382z enumC2382z, boolean z11) {
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
        if (TextUtils.equals(str, m69045Iq().m17608M()) && enumC2382z == this.f64015u) {
            AbstractC19444a.m101697e(new Runnable() { // from class: x70.w

                /* renamed from: p */
                public final /* synthetic */ boolean f136115p;

                /* renamed from: q */
                public final /* synthetic */ MediaStorePagePresenter f136116q;

                public /* synthetic */ RunnableC29463w(boolean z112, MediaStorePagePresenter this) {
                    r1 = z112;
                    r2 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MediaStorePagePresenter.m69002cr(r1, r2);
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: bx */
    public void mo69065bx() {
        mo69080uq(true);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: dg */
    public void mo69066dg() {
        mo69080uq(false);
    }

    /* renamed from: dr */
    public final void m69067dr(String str, EnumC2382z enumC2382z, C20096c c20096c, List list) {
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
        try {
            if (TextUtils.equals(str, m69045Iq().m17608M()) && enumC2382z == this.f64015u) {
                AbstractC19444a.m101697e(new Runnable() { // from class: x70.a0

                    /* renamed from: q */
                    public final /* synthetic */ C20096c f135943q;

                    /* renamed from: r */
                    public final /* synthetic */ List f135944r;

                    public /* synthetic */ RunnableC29398a0(C20096c c20096c2, List list2) {
                        r2 = c20096c2;
                        r3 = list2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaStorePagePresenter.m69005er(MediaStorePagePresenter.this, r2, r3);
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: fj */
    public boolean mo69068fj() {
        return this.f64017w;
    }

    /* renamed from: fr */
    public final void m69069fr(String str, EnumC2382z enumC2382z) {
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
        if (TextUtils.equals(str, m69045Iq().m17608M()) && enumC2382z == this.f64015u) {
            AbstractC19444a.m101697e(new Runnable() { // from class: x70.z
                public /* synthetic */ RunnableC29469z() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MediaStorePagePresenter.m69008gr(MediaStorePagePresenter.this);
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    public String getTrackingKey() {
        int i11 = C12291b.f64021a[this.f64015u.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return "MediaStorePage";
                }
                return "MediaStoreFile";
            }
            return "MediaStoreLink";
        }
        return "MediaStoreMedia";
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: gv */
    public void mo69070gv() {
        if (m68981Oq() > 0 && m69045Iq().m17618c0(this.f64015u) && ((InterfaceC12371j) m103742Dp()).mo68898Wv()) {
            mo69080uq(true);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: iB */
    public MediaStoreView.MediaStoreMultiSelectionBottomView.InterfaceC12317a mo69071iB() {
        return m68973Hq();
    }

    /* renamed from: kq */
    public final void m69072kq(EnumC2382z enumC2382z, MediaStoreItem mediaStoreItem) {
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        AbstractC19074t.m100208f(mediaStoreItem, "item");
        m69033yr(enumC2382z);
        List m119835f = C23250w4.f112644a.m119835f(enumC2382z, false, m69045Iq().m17608M(), mediaStoreItem.m40599m());
        if (!m119835f.isEmpty()) {
            this.f63998A = mediaStoreItem;
            ((InterfaceC12371j) m103742Dp()).mo68932z6(m119835f);
        }
    }

    /* renamed from: kr */
    protected final void m69073kr(MediaStoreItem mediaStoreItem) {
        AbstractC19074t.m100208f(mediaStoreItem, "mediaStoreItem");
        Bundle m83781a = RolledMediaBottomSheet.Companion.m83781a(mediaStoreItem, m69045Iq().m17609N());
        m83781a.putString("CONVERSATION_ID", mediaStoreItem.m40599m().mo95039W2());
        ((InterfaceC12371j) m103742Dp()).mo68867H8(m83781a);
    }

    /* renamed from: lr */
    protected boolean mo69074lr(MessageId messageId) {
        List mo17561n;
        AbstractC19074t.m100208f(messageId, "messageId");
        AbstractC3498e m17615T = m69045Iq().m17615T(this.f64015u);
        if (m17615T == null || (mo17561n = m17615T.mo17561n()) == null) {
            return false;
        }
        List list = mo17561n;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (AbstractC19074t.m100204b(((MediaStoreItem) it.next()).m40571M(), messageId)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.lifecycle.InterfaceC1767f
    /* renamed from: mr */
    public /* synthetic */ void mo8649mr(InterfaceC1801w interfaceC1801w) {
        AbstractC1765e.m9274c(this, interfaceC1801w);
    }

    /* renamed from: nr */
    public final boolean m69075nr() {
        return this.f64018x;
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    public void onActivityResult(int i11, int i12, Intent intent) {
        try {
            if (i11 != 100) {
                if (i11 == 10000) {
                    m69012ir(i12, intent);
                }
            } else if (intent != null) {
                mo69076oq();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        MediaStoreItem mediaStoreItem;
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(iArr, "grantResults");
        if (i11 != 155 || !AbstractC23034c6.m118118E() || (mediaStoreItem = this.f64007J) == null) {
            return;
        }
        m69026tq(mediaStoreItem, this.f64008K, true, this.f64009L);
    }

    /* renamed from: oq */
    public void mo69076oq() {
        AbstractC3498e m17615T = m69045Iq().m17615T(this.f64015u);
        if (m17615T != null) {
            m17615T.m17552e();
        }
    }

    /* renamed from: pr */
    public final void m69077pr(MediaStoreItem mediaStoreItem, AnimationTarget animationTarget, C20275e c20275e) {
        String str;
        AbstractC19074t.m100208f(mediaStoreItem, "itemSelected");
        AbstractC19074t.m100208f(c20275e, "imageViewerAnimationController");
        try {
            ArrayList<? extends Parcelable> m69019pq = m69019pq();
            Iterator<? extends Parcelable> it = m69019pq.iterator();
            int i11 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (AbstractC19074t.m100204b(((ItemAlbumMobile) it.next()).m40496C(), mediaStoreItem.m40571M())) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            boolean m132079d = AbstractC25495a.m132079d(m69045Iq().m17608M());
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("medialist", m69019pq);
            bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 3);
            bundle.putString("EXTRA_STR_CONVERSATION_ID", m69045Iq().m17608M());
            bundle.putBoolean("extra_is_group", m132079d);
            bundle.putBoolean("EXTRA_BOL_ENABLE_REACTION", true);
            bundle.putInt("currentIndex", i11);
            bundle.putInt("EXTRA_MEDIA_STORE_ZALO_TRACKING_SOURCE", 1);
            boolean z11 = this instanceof MediaStoreSearchPagePresenter;
            bundle.putBoolean("EXTRA_FROM_SEARCH_MODE", z11);
            bundle.putString("STR_LOG_CHAT_TYPE", m69057S2());
            if (z11) {
                str = "ms_search_view";
            } else {
                str = "ms_home_page";
            }
            bundle.putString("STR_SOURCE_START_VIEW", str);
            if (m132079d) {
                bundle.putString("extra_entry_point_flow", C32002l4.Companion.m154287a(ZMediaPlayer.FFP_PROP_INT64_VIDEO_DECODER).m154277l());
            } else {
                bundle.putString("extra_entry_point_flow", C32002l4.Companion.m154287a(ZMediaPlayer.FFP_PROP_INT64_AUDIO_DECODER).m154277l());
            }
            bundle.putInt("EXTRA_MSG_REMOVE_SUB_ENTRYPOINT", mo69053Lq().m123986c());
            c20275e.m105865K(i11);
            c20275e.m105882u(((InterfaceC12371j) m103742Dp()).mo68896Wi());
            ((InterfaceC12371j) m103742Dp()).mo68866H2(animationTarget, mediaStoreItem.m40580X(), bundle, c20275e, 10000);
            m69031xr(mediaStoreItem);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: tr */
    public final void m69078tr(boolean z11) {
        this.f64018x = z11;
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: uD */
    public void mo69079uD(boolean z11, C7905c c7905c, int i11) {
        C7906d m40794m;
        synchronized (this.f64001D) {
            if (c7905c != null) {
                try {
                    C7906d m40794m2 = c7905c.m40794m();
                    if (m40794m2 != null && m40794m2.m40826o() && (m40794m = c7905c.m40794m()) != null) {
                        m69014jr(m40794m, z11, i11);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: uq */
    public void mo69080uq(boolean z11) {
        m69045Iq().m17623g0(new C3490a(this.f64015u, z11));
    }

    /* renamed from: ur */
    protected final void m69081ur(C3499e0 c3499e0) {
        AbstractC19074t.m100208f(c3499e0, "<set-?>");
        this.f64002E = c3499e0;
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: v */
    public List mo69082v() {
        List m131185M0;
        m131185M0 = AbstractC25332a0.m131185M0(mo69054N1());
        return m131185M0;
    }

    /* renamed from: vq */
    public void mo69083vq(MediaStoreItem mediaStoreItem, boolean z11) {
        AbstractC19074t.m100208f(mediaStoreItem, "item");
        AbstractC3498e m17615T = m69045Iq().m17615T(this.f64015u);
        if (m17615T != null) {
            m17615T.m17546C(mediaStoreItem, z11);
        }
    }

    @Override // androidx.lifecycle.InterfaceC1767f
    /* renamed from: wC */
    public void mo8650wC(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        AbstractC1765e.m9276e(this, interfaceC1801w);
        m68966Ar();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000b. Please report as an issue. */
    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        boolean z11;
        boolean z12;
        AbstractC19074t.m100208f(objArr, "args");
        try {
            if (i11 != 73) {
                switch (i11) {
                    case 174:
                        AbstractC19444a.m101697e(new Runnable() { // from class: x70.t
                            public /* synthetic */ RunnableC29454t() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                MediaStorePagePresenter.m69022rq(MediaStorePagePresenter.this);
                            }
                        });
                        break;
                    case 175:
                        AbstractC19444a.m101697e(new Runnable() { // from class: x70.u
                            public /* synthetic */ RunnableC29457u() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                MediaStorePagePresenter.m69024sq(MediaStorePagePresenter.this);
                            }
                        });
                        break;
                    case 176:
                        if (objArr.length == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            Object obj = objArr[0];
                            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                            this.f64004G = ((Boolean) obj).booleanValue();
                            break;
                        }
                        break;
                    case 177:
                        if (objArr.length == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            Object obj2 = objArr[0];
                            AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.collections.List<com.zing.zalo.data.chat.model.message.ChatContent>");
                            m69009hq((List) obj2, false);
                            break;
                        }
                        break;
                    default:
                        return;
                }
            } else {
                AbstractC19444a.m101697e(new Runnable() { // from class: x70.s

                    /* renamed from: p */
                    public final /* synthetic */ Object[] f136092p;

                    /* renamed from: q */
                    public final /* synthetic */ MediaStorePagePresenter f136093q;

                    public /* synthetic */ RunnableC29451s(Object[] objArr2, MediaStorePagePresenter this) {
                        r1 = objArr2;
                        r2 = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaStorePagePresenter.m69020qq(r1, r2);
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: xh */
    public boolean mo69084xh() {
        return !this.f64017w;
    }

    /* renamed from: zr */
    public void mo69085zr() {
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 73);
        bVar.m124119a().m124115b(this, 174);
        bVar.m124119a().m124115b(this, 175);
        bVar.m124119a().m124115b(this, 176);
    }
}
