package com.zing.zalo.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import au.C2370r0;
import au.EnumC2363o;
import au.EnumC2381y;
import au.EnumC2382z;
import b40.C2526d;
import ci.AbstractC3498e;
import ci.AbstractC3527v;
import ci.C3499e0;
import ci.C3503g0;
import ci.C3508j;
import ci.C3509j0;
import ci.C3521p0;
import ci.C3526u;
import ci.C3528w;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7226u3;
import com.zing.zalo.control.C7905c;
import com.zing.zalo.control.C7906d;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.custom.AbstractC11859g;
import com.zing.zalo.p077ui.mediastore.common.MediaStoreItemYearDivider;
import com.zing.zalo.p077ui.mediastore.common.MediaStoreMediaHeaderView;
import com.zing.zalo.p077ui.mediastore.common.MediaStoreMediaSectionView;
import com.zing.zalo.p077ui.mediastore.common.MediaStoreMediaSkeletonView;
import com.zing.zalo.p077ui.mediastore.file.MediaStoreItemFileModuleView;
import com.zing.zalo.p077ui.mediastore.link.MediaStoreItemLinkModuleView;
import com.zing.zalo.p077ui.mediastore.media.MediaStoreMediaModulesView;
import com.zing.zalo.p077ui.mediastore.search.MediaStoreAlbumItemDualView;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.animation.AnimationTarget;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import i40.C20275e;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23222t7;
import me0.AbstractC23244v8;
import me0.C23055e5;
import me0.C23212s8;
import me0.C23250w4;
import mm0.AbstractC23350e;
import p227i3.C20218v;
import p239ih.C20556f;
import p262jb.AbstractC21196a;
import p279jw.C21373a;
import p348mi.AbstractC23306f;
import p461qu.AbstractC25495a;
import p542ub.InterfaceC27218a;
import p716zh.C31950hc;
import pm0.C24848g0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import th.AbstractC26687h;
import vc0.InterfaceC27963b;
import vc0.InterfaceC27967f;
import vc0.InterfaceC27968g;

/* renamed from: com.zing.zalo.adapters.u3 */
/* loaded from: classes3.dex */
public final class C7226u3 extends RecyclerView.AbstractC1880g implements AbstractC11859g.c, InterfaceC27963b {

    /* renamed from: A */
    private boolean f39614A;

    /* renamed from: B */
    private boolean f39615B;

    /* renamed from: C */
    private boolean f39616C;

    /* renamed from: D */
    private int f39617D;

    /* renamed from: E */
    private final List f39618E;

    /* renamed from: F */
    private final SparseIntArray f39619F;

    /* renamed from: G */
    private final SparseIntArray f39620G;

    /* renamed from: H */
    private CharSequence f39621H;

    /* renamed from: I */
    private int f39622I;

    /* renamed from: J */
    private View.OnLayoutChangeListener f39623J;

    /* renamed from: K */
    private MediaStoreMediaSectionView.InterfaceC12356a f39624K;

    /* renamed from: L */
    private boolean f39625L;

    /* renamed from: M */
    private C3521p0.c f39626M;

    /* renamed from: N */
    private C20275e f39627N;

    /* renamed from: O */
    private boolean f39628O;

    /* renamed from: P */
    private boolean f39629P;

    /* renamed from: r */
    private final Context f39630r;

    /* renamed from: s */
    private final ZaloView f39631s;

    /* renamed from: t */
    private final b f39632t;

    /* renamed from: u */
    private final LayoutInflater f39633u;

    /* renamed from: v */
    private d f39634v;

    /* renamed from: w */
    private a f39635w;

    /* renamed from: x */
    private c f39636x;

    /* renamed from: y */
    private RecyclerView f39637y;

    /* renamed from: z */
    private boolean f39638z;

    /* renamed from: com.zing.zalo.adapters.u3$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: b */
        void mo36822b();

        /* renamed from: c */
        void mo36823c(MediaStoreItem mediaStoreItem);

        /* renamed from: d */
        void mo36824d(MediaStoreItem mediaStoreItem, AnimationTarget animationTarget, int i11, C20275e c20275e);
    }

    /* renamed from: com.zing.zalo.adapters.u3$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final String f39639a;

        /* renamed from: b */
        private final EnumC2382z f39640b;

        /* renamed from: c */
        private final EnumC2363o f39641c;

        /* renamed from: d */
        private String f39642d;

        public b(String str, EnumC2382z enumC2382z, EnumC2363o enumC2363o, String str2) {
            AbstractC19074t.m100208f(str, "conversationId");
            AbstractC19074t.m100208f(enumC2382z, "mediaType");
            AbstractC19074t.m100208f(enumC2363o, "filterMode");
            AbstractC19074t.m100208f(str2, "logChatType");
            this.f39639a = str;
            this.f39640b = enumC2382z;
            this.f39641c = enumC2363o;
            this.f39642d = str2;
        }

        /* renamed from: a */
        public final String m36825a() {
            return this.f39639a;
        }

        /* renamed from: b */
        public final EnumC2363o m36826b() {
            return this.f39641c;
        }

        /* renamed from: c */
        public final String m36827c() {
            return this.f39642d;
        }

        /* renamed from: d */
        public final EnumC2382z m36828d() {
            return this.f39640b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f39639a, bVar.f39639a) && this.f39640b == bVar.f39640b && this.f39641c == bVar.f39641c && AbstractC19074t.m100204b(this.f39642d, bVar.f39642d);
        }

        public int hashCode() {
            return (((((this.f39639a.hashCode() * 31) + this.f39640b.hashCode()) * 31) + this.f39641c.hashCode()) * 31) + this.f39642d.hashCode();
        }

        public String toString() {
            return "CreateMSPageAdapterParams(conversationId=" + this.f39639a + ", mediaType=" + this.f39640b + ", filterMode=" + this.f39641c + ", logChatType=" + this.f39642d + ")";
        }

        public /* synthetic */ b(String str, EnumC2382z enumC2382z, EnumC2363o enumC2363o, String str2, int i11, AbstractC19060k abstractC19060k) {
            this(str, enumC2382z, (i11 & 4) != 0 ? EnumC2363o.f9889p : enumC2363o, (i11 & 8) != 0 ? "" : str2);
        }
    }

    /* renamed from: com.zing.zalo.adapters.u3$c */
    /* loaded from: classes3.dex */
    public interface c {
        /* renamed from: a */
        void mo36829a(MediaStoreItem mediaStoreItem, boolean z11, int i11);

        /* renamed from: b */
        void mo36830b();

        /* renamed from: c */
        void mo36831c(MediaStoreItem mediaStoreItem);

        /* renamed from: d */
        void mo36832d(EnumC2382z enumC2382z, MediaStoreItem mediaStoreItem);

        /* renamed from: e */
        void mo36833e(MediaStoreItem mediaStoreItem);

        /* renamed from: f */
        void mo36834f(MediaStoreItem mediaStoreItem, boolean z11, boolean z12, C3521p0.c cVar);

        /* renamed from: g */
        void mo36835g(C7906d c7906d, boolean z11, int i11);

        /* renamed from: h */
        void mo36836h(C20556f c20556f);

        /* renamed from: i */
        void mo36837i(int i11, MediaStoreItem mediaStoreItem);

        /* renamed from: j */
        void mo36838j(MediaStoreItem mediaStoreItem, AnimationTarget animationTarget, int i11, C20275e c20275e, String str);

        /* renamed from: k */
        void mo36839k(MediaStoreItem mediaStoreItem);
    }

    /* renamed from: com.zing.zalo.adapters.u3$d */
    /* loaded from: classes3.dex */
    public interface d {
        /* renamed from: H0 */
        void mo36840H0();

        /* renamed from: I0 */
        void mo36841I0(EnumC2382z enumC2382z);

        /* renamed from: a */
        void mo36842a(C3508j c3508j);
    }

    /* renamed from: com.zing.zalo.adapters.u3$e */
    /* loaded from: classes3.dex */
    public final class e extends RecyclerView.AbstractC1876c0 implements InterfaceC27967f {

        /* renamed from: I */
        private int f39643I;

        /* renamed from: J */
        private MediaStoreMediaModulesView f39644J;

        /* renamed from: K */
        private MediaStoreMediaHeaderView f39645K;

        /* renamed from: L */
        private MediaStoreItemYearDivider f39646L;

        /* renamed from: M */
        private MediaStoreItemLinkModuleView f39647M;

        /* renamed from: N */
        private MediaStoreItemFileModuleView f39648N;

        /* renamed from: O */
        private LinearLayout f39649O;

        /* renamed from: P */
        private LinearLayout f39650P;

        /* renamed from: Q */
        private RecyclingImageView f39651Q;

        /* renamed from: R */
        private AppCompatImageView f39652R;

        /* renamed from: S */
        private RobotoTextView f39653S;

        /* renamed from: T */
        private RobotoTextView f39654T;

        /* renamed from: U */
        private RobotoTextView f39655U;

        /* renamed from: V */
        private RobotoButton f39656V;

        /* renamed from: W */
        private AppCompatImageView f39657W;

        /* renamed from: X */
        private RobotoTextView f39658X;

        /* renamed from: Y */
        private RobotoButton f39659Y;

        /* renamed from: Z */
        private RobotoTextView f39660Z;

        /* renamed from: a0 */
        private TextView f39661a0;

        /* renamed from: b0 */
        private MediaStoreMediaSkeletonView f39662b0;

        /* renamed from: c0 */
        private MediaStoreMediaSectionView f39663c0;

        /* renamed from: d0 */
        private MediaStoreAlbumItemDualView f39664d0;

        /* renamed from: e0 */
        private boolean f39665e0;

        /* renamed from: f0 */
        final /* synthetic */ C7226u3 f39666f0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C7226u3 c7226u3, View view, int i11) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            this.f39666f0 = c7226u3;
            this.f39643I = i11;
            this.f39665e0 = true;
            m36846B0(view, i11);
        }

        /* renamed from: C0 */
        public static final void m36843C0(C7226u3 c7226u3, View view) {
            AbstractC19074t.m100208f(c7226u3, "this$0");
            c m36813i0 = c7226u3.m36813i0();
            if (m36813i0 != null) {
                m36813i0.mo36830b();
            }
            c m36813i02 = c7226u3.m36813i0();
            if (m36813i02 != null) {
                m36813i02.mo36830b();
            }
        }

        /* renamed from: A0 */
        public final RobotoTextView m36845A0() {
            return this.f39658X;
        }

        /* renamed from: B0 */
        public final void m36846B0(View view, int i11) {
            AbstractC19074t.m100208f(view, "itemView");
            switch (i11) {
                case 1:
                    this.f39645K = (MediaStoreMediaHeaderView) view;
                    return;
                case 2:
                    this.f39644J = (MediaStoreMediaModulesView) view;
                    return;
                case 3:
                case 4:
                    this.f39649O = (LinearLayout) view.findViewById(AbstractC6918a0.layout_loading);
                    this.f39650P = (LinearLayout) view.findViewById(AbstractC6918a0.layout_error);
                    return;
                case 5:
                    this.f39651Q = (RecyclingImageView) view.findViewById(AbstractC6918a0.imvEmpty);
                    this.f39653S = (RobotoTextView) view.findViewById(AbstractC6918a0.tvEmpty);
                    this.f39654T = (RobotoTextView) view.findViewById(AbstractC6918a0.tvEmptyMedium);
                    this.f39660Z = (RobotoTextView) view.findViewById(AbstractC6918a0.tvEmptyDesc);
                    return;
                case 6:
                    MediaStoreItemYearDivider mediaStoreItemYearDivider = (MediaStoreItemYearDivider) view.findViewById(AbstractC6918a0.mediaStoreItemYearDivider);
                    this.f39646L = mediaStoreItemYearDivider;
                    if (mediaStoreItemYearDivider != null) {
                        mediaStoreItemYearDivider.m69464a();
                        return;
                    }
                    return;
                case 7:
                    this.f39652R = (AppCompatImageView) view.findViewById(AbstractC6918a0.icn_search_error);
                    this.f39655U = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_search_error);
                    this.f39656V = (RobotoButton) view.findViewById(AbstractC6918a0.btn_retry);
                    return;
                case 8:
                    this.f39647M = (MediaStoreItemLinkModuleView) view;
                    return;
                case 9:
                    this.f39648N = (MediaStoreItemFileModuleView) view;
                    return;
                case 10:
                    this.f39661a0 = (TextView) view;
                    return;
                case 11:
                    this.f39662b0 = (MediaStoreMediaSkeletonView) view;
                    return;
                case 12:
                    this.f39657W = (AppCompatImageView) view.findViewById(AbstractC6918a0.image_error);
                    this.f39658X = (RobotoTextView) view.findViewById(AbstractC6918a0.error_title);
                    RobotoButton robotoButton = (RobotoButton) view.findViewById(AbstractC6918a0.btn_refresh);
                    this.f39659Y = robotoButton;
                    if (robotoButton != null) {
                        robotoButton.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.v3
                            public /* synthetic */ ViewOnClickListenerC7237v3() {
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                C7226u3.e.m36843C0(C7226u3.this, view2);
                            }
                        });
                        return;
                    }
                    return;
                case 13:
                default:
                    return;
                case 14:
                    this.f39664d0 = (MediaStoreAlbumItemDualView) view;
                    return;
                case 15:
                    this.f39663c0 = (MediaStoreMediaSectionView) view;
                    return;
            }
        }

        /* renamed from: D0 */
        public final void m36847D0(boolean z11) {
            this.f39665e0 = z11;
        }

        @Override // vc0.InterfaceC27967f
        /* renamed from: d */
        public InterfaceC27968g mo36848d() {
            int i11 = this.f39643I;
            return i11 != 8 ? i11 != 9 ? this.f39644J : this.f39648N : this.f39647M;
        }

        /* renamed from: j0 */
        public final RecyclingImageView m36849j0() {
            return this.f39651Q;
        }

        /* renamed from: k0 */
        public final AppCompatImageView m36850k0() {
            return this.f39652R;
        }

        /* renamed from: l0 */
        public final LinearLayout m36851l0() {
            return this.f39650P;
        }

        /* renamed from: m0 */
        public final LinearLayout m36852m0() {
            return this.f39649O;
        }

        /* renamed from: n0 */
        public final RobotoButton m36853n0() {
            return this.f39656V;
        }

        /* renamed from: o0 */
        public final MediaStoreMediaSkeletonView m36854o0() {
            return this.f39662b0;
        }

        /* renamed from: p0 */
        public final RobotoTextView m36855p0() {
            return this.f39655U;
        }

        /* renamed from: q0 */
        public final TextView m36856q0() {
            return this.f39661a0;
        }

        /* renamed from: r0 */
        public final MediaStoreAlbumItemDualView m36857r0() {
            return this.f39664d0;
        }

        /* renamed from: s0 */
        public final MediaStoreItemFileModuleView m36858s0() {
            return this.f39648N;
        }

        /* renamed from: t0 */
        public final MediaStoreItemLinkModuleView m36859t0() {
            return this.f39647M;
        }

        /* renamed from: u0 */
        public final MediaStoreItemYearDivider m36860u0() {
            return this.f39646L;
        }

        /* renamed from: v0 */
        public final MediaStoreMediaSectionView m36861v0() {
            return this.f39663c0;
        }

        /* renamed from: w0 */
        public final MediaStoreMediaModulesView m36862w0() {
            return this.f39644J;
        }

        /* renamed from: x0 */
        public final boolean m36863x0() {
            return this.f39665e0;
        }

        /* renamed from: y0 */
        public final MediaStoreMediaHeaderView m36864y0() {
            return this.f39645K;
        }

        /* renamed from: z0 */
        public final RobotoTextView m36865z0() {
            return this.f39653S;
        }
    }

    /* renamed from: com.zing.zalo.adapters.u3$f */
    /* loaded from: classes3.dex */
    public /* synthetic */ class f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39667a;

        static {
            int[] iArr = new int[EnumC2382z.values().length];
            try {
                iArr[EnumC2382z.f9948u.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2382z.f9945r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2382z.f9946s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC2382z.f9947t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f39667a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.adapters.u3$g */
    /* loaded from: classes3.dex */
    public static final class g implements MediaStoreMediaSectionView.InterfaceC12356a {
        g() {
        }

        @Override // com.zing.zalo.p077ui.mediastore.common.MediaStoreMediaSectionView.InterfaceC12356a
        /* renamed from: a */
        public void mo36866a(C3503g0 c3503g0) {
        }

        @Override // com.zing.zalo.p077ui.mediastore.common.MediaStoreMediaSectionView.InterfaceC12356a
        /* renamed from: b */
        public void mo36867b(C3503g0 c3503g0) {
            Integer num;
            d m36815m0;
            if (c3503g0 != null) {
                num = Integer.valueOf(c3503g0.m17670d());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 1) {
                d m36815m02 = C7226u3.this.m36815m0();
                if (m36815m02 != null) {
                    m36815m02.mo36841I0(EnumC2382z.f9948u);
                    return;
                }
                return;
            }
            if (num != null && num.intValue() == 2) {
                d m36815m03 = C7226u3.this.m36815m0();
                if (m36815m03 != null) {
                    m36815m03.mo36841I0(EnumC2382z.f9945r);
                    return;
                }
                return;
            }
            if (num != null && num.intValue() == 3) {
                d m36815m04 = C7226u3.this.m36815m0();
                if (m36815m04 != null) {
                    m36815m04.mo36841I0(EnumC2382z.f9946s);
                    return;
                }
                return;
            }
            if (num != null && num.intValue() == 4 && (m36815m0 = C7226u3.this.m36815m0()) != null) {
                m36815m0.mo36841I0(EnumC2382z.f9947t);
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.u3$h */
    /* loaded from: classes3.dex */
    public static final class h implements View.OnLayoutChangeListener {

        /* renamed from: p */
        private int f39669p;

        h() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            AbstractC19074t.m100208f(view, "view");
            try {
                C7226u3.this.m36798H0(view.getMeasuredWidth());
                if (this.f39669p != C7226u3.this.m36814j0()) {
                    this.f39669p = C7226u3.this.m36814j0();
                    C7226u3.this.m10008p();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.u3$i */
    /* loaded from: classes3.dex */
    public static final class i implements C3521p0.c {
        i() {
        }

        /* renamed from: f */
        public static final void m36870f(C7226u3 c7226u3, MediaStoreItem mediaStoreItem, boolean z11) {
            AbstractC19074t.m100208f(c7226u3, "this$0");
            AbstractC19074t.m100208f(mediaStoreItem, "$mediaStoreItem");
            try {
                int size = c7226u3.f39618E.size();
                boolean z12 = false;
                MediaStoreItem mediaStoreItem2 = null;
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    C7905c c7905c = (C7905c) c7226u3.f39618E.get(i11);
                    if (c7905c.m40798q() == 9) {
                        mediaStoreItem2 = c7905c.m40788g();
                        if (mediaStoreItem2 != null && AbstractC19074t.m100204b(mediaStoreItem2.m40571M(), mediaStoreItem.m40571M())) {
                            z12 = true;
                            break;
                        }
                    } else {
                        mediaStoreItem2 = null;
                    }
                    i11++;
                }
                if (z12) {
                    c7226u3.m10008p();
                    if (z11 && mediaStoreItem2 != null && !TextUtils.isEmpty(mediaStoreItem2.m40599m().m94983Q3())) {
                        ToastUtils.showMess(MainApplication.Companion.m35500c().getString(AbstractC8020f0.browser_download_notification_download_complete));
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* renamed from: g */
        public static final void m36871g(C7226u3 c7226u3, C20556f c20556f) {
            AbstractC19074t.m100208f(c7226u3, "this$0");
            AbstractC19074t.m100208f(c20556f, "$file");
            c m36813i0 = c7226u3.m36813i0();
            if (m36813i0 != null) {
                m36813i0.mo36836h(c20556f);
            }
        }

        @Override // ci.C3521p0.c
        /* renamed from: a */
        public void mo17800a(MediaStoreItem mediaStoreItem, C20556f c20556f) {
            AbstractC19074t.m100208f(mediaStoreItem, "mediaStoreItem");
            AbstractC19074t.m100208f(c20556f, "file");
            AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.adapters.w3

                /* renamed from: q */
                public final /* synthetic */ C20556f f39778q;

                public /* synthetic */ RunnableC7248w3(C20556f c20556f2) {
                    r2 = c20556f2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C7226u3.i.m36871g(C7226u3.this, r2);
                }
            });
        }

        @Override // ci.C3521p0.c
        /* renamed from: b */
        public void mo17801b(MediaStoreItem mediaStoreItem, boolean z11) {
            AbstractC19074t.m100208f(mediaStoreItem, "mediaStoreItem");
            AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.adapters.x3

                /* renamed from: q */
                public final /* synthetic */ MediaStoreItem f39834q;

                /* renamed from: r */
                public final /* synthetic */ boolean f39835r;

                public /* synthetic */ RunnableC7259x3(MediaStoreItem mediaStoreItem2, boolean z112) {
                    r2 = mediaStoreItem2;
                    r3 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C7226u3.i.m36870f(C7226u3.this, r2, r3);
                }
            });
        }

        @Override // ci.C3521p0.c
        /* renamed from: c */
        public String mo17802c() {
            return C7226u3.this.m36782e0();
        }
    }

    /* renamed from: com.zing.zalo.adapters.u3$j */
    /* loaded from: classes3.dex */
    public static final class j implements MediaStoreMediaHeaderView.InterfaceC12353a {
        j() {
        }

        @Override // com.zing.zalo.p077ui.mediastore.common.MediaStoreMediaHeaderView.InterfaceC12353a
        /* renamed from: a */
        public void mo36872a(C7906d c7906d, boolean z11, int i11) {
            AbstractC19074t.m100208f(c7906d, "albumItem");
            c m36813i0 = C7226u3.this.m36813i0();
            if (m36813i0 != null) {
                m36813i0.mo36835g(c7906d, z11, i11);
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.u3$k */
    /* loaded from: classes3.dex */
    public static final class k implements MediaStoreMediaModulesView.InterfaceC12379b {
        k() {
        }

        @Override // com.zing.zalo.p077ui.mediastore.media.MediaStoreMediaModulesView.InterfaceC12379b
        /* renamed from: a */
        public void mo36873a(MediaStoreItem mediaStoreItem, boolean z11, int i11) {
            AbstractC19074t.m100208f(mediaStoreItem, "item");
            c m36813i0 = C7226u3.this.m36813i0();
            if (m36813i0 != null) {
                m36813i0.mo36829a(mediaStoreItem, z11, i11);
            }
        }

        @Override // com.zing.zalo.p077ui.mediastore.media.MediaStoreMediaModulesView.InterfaceC12379b
        /* renamed from: b */
        public void mo36874b(MediaStoreItem mediaStoreItem, int i11) {
            AbstractC19074t.m100208f(mediaStoreItem, "item");
            c m36813i0 = C7226u3.this.m36813i0();
            if (m36813i0 != null) {
                m36813i0.mo36837i(i11, mediaStoreItem);
            }
        }

        @Override // com.zing.zalo.p077ui.mediastore.media.MediaStoreMediaModulesView.InterfaceC12379b
        /* renamed from: c */
        public void mo36875c(AnimationTarget animationTarget, MediaStoreItem mediaStoreItem, C16719g c16719g, int i11) {
            AbstractC19074t.m100208f(animationTarget, "animationTarget");
            AbstractC19074t.m100208f(mediaStoreItem, "item");
            AbstractC19074t.m100208f(c16719g, "module");
            RecyclerView recyclerView = C7226u3.this.f39637y;
            if (recyclerView != null) {
                C7226u3.this.m36771R0(mediaStoreItem, animationTarget, recyclerView, i11);
            }
            C2526d.f10270a.m12703a0(mediaStoreItem, C7226u3.this.m36782e0(), C7226u3.this.f39632t.m36827c());
        }
    }

    /* renamed from: com.zing.zalo.adapters.u3$l */
    /* loaded from: classes3.dex */
    public static final class l implements MediaStoreItemLinkModuleView.InterfaceC12373a {
        l() {
        }

        @Override // com.zing.zalo.p077ui.mediastore.link.MediaStoreItemLinkModuleView.InterfaceC12373a
        /* renamed from: a */
        public void mo36876a(MediaStoreItem mediaStoreItem, boolean z11, int i11) {
            AbstractC19074t.m100208f(mediaStoreItem, "item");
            c m36813i0 = C7226u3.this.m36813i0();
            if (m36813i0 != null) {
                m36813i0.mo36829a(mediaStoreItem, z11, i11);
            }
        }

        @Override // com.zing.zalo.p077ui.mediastore.link.MediaStoreItemLinkModuleView.InterfaceC12373a
        /* renamed from: b */
        public void mo36877b(View view, MediaStoreItem mediaStoreItem) {
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            AbstractC19074t.m100208f(mediaStoreItem, "item");
            c m36813i0 = C7226u3.this.m36813i0();
            if (m36813i0 != null) {
                m36813i0.mo36832d(EnumC2382z.f9946s, mediaStoreItem);
            }
        }

        @Override // com.zing.zalo.p077ui.mediastore.link.MediaStoreItemLinkModuleView.InterfaceC12373a
        /* renamed from: c */
        public void mo36878c(MediaStoreItemLinkModuleView mediaStoreItemLinkModuleView, MediaStoreItem mediaStoreItem) {
            AbstractC19074t.m100208f(mediaStoreItemLinkModuleView, C20218v.f100059b);
            AbstractC19074t.m100208f(mediaStoreItem, "item");
            c m36813i0 = C7226u3.this.m36813i0();
            if (m36813i0 != null) {
                m36813i0.mo36839k(mediaStoreItem);
            }
            C2526d.f10270a.m12703a0(mediaStoreItem, C7226u3.this.m36782e0(), C7226u3.this.f39632t.m36827c());
        }

        @Override // com.zing.zalo.p077ui.mediastore.link.MediaStoreItemLinkModuleView.InterfaceC12373a
        /* renamed from: d */
        public void mo36879d(View view, MediaStoreItem mediaStoreItem, int i11) {
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            AbstractC19074t.m100208f(mediaStoreItem, "item");
            c m36813i0 = C7226u3.this.m36813i0();
            if (m36813i0 != null) {
                m36813i0.mo36837i(i11, mediaStoreItem);
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.u3$m */
    /* loaded from: classes3.dex */
    public static final class m implements MediaStoreItemFileModuleView.InterfaceC12362a {
        m() {
        }

        @Override // com.zing.zalo.p077ui.mediastore.file.MediaStoreItemFileModuleView.InterfaceC12362a
        /* renamed from: a */
        public void mo36880a(MediaStoreItem mediaStoreItem, boolean z11, int i11) {
            AbstractC19074t.m100208f(mediaStoreItem, "item");
            c m36813i0 = C7226u3.this.m36813i0();
            if (m36813i0 != null) {
                m36813i0.mo36829a(mediaStoreItem, z11, i11);
            }
        }

        @Override // com.zing.zalo.p077ui.mediastore.file.MediaStoreItemFileModuleView.InterfaceC12362a
        /* renamed from: b */
        public void mo36881b(MediaStoreItem mediaStoreItem) {
            AbstractC19074t.m100208f(mediaStoreItem, "item");
            mediaStoreItem.m40592h(C7226u3.this.f39626M);
        }

        @Override // com.zing.zalo.p077ui.mediastore.file.MediaStoreItemFileModuleView.InterfaceC12362a
        /* renamed from: c */
        public void mo36882c(MediaStoreItem mediaStoreItem) {
            AbstractC19074t.m100208f(mediaStoreItem, "item");
            c m36813i0 = C7226u3.this.m36813i0();
            if (m36813i0 != null) {
                m36813i0.mo36833e(mediaStoreItem);
            }
        }

        @Override // com.zing.zalo.p077ui.mediastore.file.MediaStoreItemFileModuleView.InterfaceC12362a
        /* renamed from: d */
        public void mo36883d(MediaStoreItem mediaStoreItem) {
            AbstractC19074t.m100208f(mediaStoreItem, "item");
            c m36813i0 = C7226u3.this.m36813i0();
            if (m36813i0 != null) {
                m36813i0.mo36832d(EnumC2382z.f9947t, mediaStoreItem);
            }
        }

        @Override // com.zing.zalo.p077ui.mediastore.file.MediaStoreItemFileModuleView.InterfaceC12362a
        /* renamed from: e */
        public void mo36884e(MediaStoreItemFileModuleView mediaStoreItemFileModuleView, MediaStoreItem mediaStoreItem) {
            String str;
            AbstractC19074t.m100208f(mediaStoreItemFileModuleView, C20218v.f100059b);
            AbstractC19074t.m100208f(mediaStoreItem, "item");
            try {
                if (!mediaStoreItem.m40596j0() && !AbstractC26687h.m137061b(mediaStoreItem)) {
                    AbstractC23306f.m120573D1().m109954R(mediaStoreItem.m40599m());
                    if (!C7226u3.this.m36811g0()) {
                        C7226u3.m36776Y(C7226u3.this, mediaStoreItem, true, false, 4, null);
                        mediaStoreItemFileModuleView.m69520A0();
                        C3509j0.m17721g(C7226u3.this.f39632t.m36825a(), 3, 1);
                        return;
                    }
                    return;
                }
                c m36813i0 = C7226u3.this.m36813i0();
                if (m36813i0 != null) {
                    m36813i0.mo36833e(mediaStoreItem);
                }
                C2526d c2526d = C2526d.f10270a;
                MessageId m40571M = mediaStoreItem.m40571M();
                C3521p0.c cVar = C7226u3.this.f39626M;
                if (cVar == null || (str = cVar.mo17802c()) == null) {
                    str = "";
                }
                String mo95039W2 = mediaStoreItem.m40599m().mo95039W2();
                AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                c2526d.m12729v(m40571M, -1, str, c2526d.m12733y(mo95039W2));
                c2526d.m12690N(mediaStoreItem, true, false, false);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // com.zing.zalo.p077ui.mediastore.file.MediaStoreItemFileModuleView.InterfaceC12362a
        /* renamed from: f */
        public void mo36885f(MediaStoreItem mediaStoreItem, int i11) {
            AbstractC19074t.m100208f(mediaStoreItem, "item");
            c m36813i0 = C7226u3.this.m36813i0();
            if (m36813i0 != null) {
                m36813i0.mo36837i(i11, mediaStoreItem);
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.u3$n */
    /* loaded from: classes3.dex */
    public static final class n implements MediaStoreAlbumItemDualView.InterfaceC12385a {
        n() {
        }

        @Override // com.zing.zalo.p077ui.mediastore.search.MediaStoreAlbumItemDualView.InterfaceC12385a
        /* renamed from: a */
        public void mo36886a(C3508j c3508j) {
            d m36815m0;
            if (!C7226u3.this.m36811g0() && c3508j != null && (m36815m0 = C7226u3.this.m36815m0()) != null) {
                m36815m0.mo36842a(c3508j);
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.u3$o */
    /* loaded from: classes3.dex */
    public static final class o extends C20275e {
        o() {
        }

        @Override // i40.C20275e
        /* renamed from: h */
        public int mo36887h(int i11) {
            return i11;
        }

        @Override // i40.C20275e
        /* renamed from: s */
        public boolean mo36888s() {
            return true;
        }
    }

    public C7226u3(Context context, ZaloView zaloView, b bVar) {
        AbstractC19074t.m100208f(context, "mContext");
        AbstractC19074t.m100208f(bVar, "createAdapterParams");
        this.f39630r = context;
        this.f39631s = zaloView;
        this.f39632t = bVar;
        Object systemService = context.getSystemService("layout_inflater");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f39633u = (LayoutInflater) systemService;
        this.f39616C = AbstractC25495a.m132079d(bVar.m36825a());
        this.f39618E = new ArrayList();
        this.f39619F = new SparseIntArray();
        this.f39620G = new SparseIntArray();
        this.f39621H = "";
        this.f39623J = new h();
        this.f39624K = new g();
        this.f39626M = new i();
        m9999J(true);
    }

    /* renamed from: N0 */
    public static /* synthetic */ void m36765N0(C7226u3 c7226u3, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        c7226u3.m36803M0(z11, z12);
    }

    /* renamed from: P0 */
    public static /* synthetic */ void m36768P0(C7226u3 c7226u3, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        c7226u3.m36804O0(z11, z12);
    }

    /* renamed from: R0 */
    public final void m36771R0(MediaStoreItem mediaStoreItem, AnimationTarget animationTarget, ViewGroup viewGroup, int i11) {
        try {
            if (mediaStoreItem.m40596j0()) {
                c cVar = this.f39636x;
                if (cVar != null) {
                    cVar.mo36831c(mediaStoreItem);
                }
                a aVar = this.f39635w;
                if (aVar != null) {
                    aVar.mo36823c(mediaStoreItem);
                }
                C2526d.f10270a.m12703a0(mediaStoreItem, m36782e0(), this.f39632t.m36827c());
                return;
            }
            m36786q0();
            o oVar = new o();
            oVar.m105861G(new C2370r0(viewGroup));
            oVar.m105857C(this.f39619F);
            oVar.m105858D(this.f39620G);
            this.f39627N = oVar;
            c cVar2 = this.f39636x;
            if (cVar2 != null) {
                cVar2.mo36838j(mediaStoreItem, animationTarget, i11, oVar, this.f39632t.m36827c());
            }
            a aVar2 = this.f39635w;
            if (aVar2 != null) {
                aVar2.mo36824d(mediaStoreItem, animationTarget, i11, oVar);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: V */
    private final boolean m36774V(int i11, int i12) {
        try {
            C7905c m36812h0 = m36812h0(i11 + 1);
            if (m36812h0 != null) {
                if (m36812h0.m40798q() == i12) {
                    return true;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return false;
    }

    /* renamed from: W */
    private final C7905c m36775W(EnumC2382z enumC2382z) {
        C7905c c7905c = new C7905c(13, null, null, 6, null);
        c7905c.m40801t(-2006L);
        c7905c.m40806y(1);
        int i11 = f.f39667a[enumC2382z.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3 || i11 == 4) {
                    c7905c.m40807z(6);
                }
            } else {
                c7905c.m40807z(7);
            }
        } else {
            c7905c.m40807z(5);
        }
        return c7905c;
    }

    /* renamed from: Y */
    public static /* synthetic */ void m36776Y(C7226u3 c7226u3, MediaStoreItem mediaStoreItem, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        c7226u3.m36807X(mediaStoreItem, z11, z12);
    }

    /* renamed from: Z */
    public static final void m36777Z(C7226u3 c7226u3) {
        AbstractC19074t.m100208f(c7226u3, "this$0");
        c7226u3.f39625L = false;
    }

    /* renamed from: a0 */
    private final List m36778a0(List list, boolean z11) {
        C7906d.b m40819h;
        C7906d.b m40819h2;
        ArrayList arrayList = new ArrayList();
        try {
            List list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                Calendar m119848y = C23250w4.f112644a.m119848y();
                int size = list.size();
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    C7906d c7906d = null;
                    if (i11 >= size) {
                        break;
                    }
                    C7906d c7906d2 = (C7906d) list.get(i11);
                    i12 += c7906d2.m40824m();
                    int i16 = i11 + 1;
                    if (i16 < list.size()) {
                        c7906d = (C7906d) list.get(i16);
                    }
                    List<List> m40822k = c7906d2.m40822k();
                    if (!m40822k.isEmpty()) {
                        if (c7906d2.m40826o()) {
                            arrayList.add(new C7905c(1, c7906d2, new ArrayList()));
                        }
                        for (List list3 : m40822k) {
                            C7905c c7905c = new C7905c(2, c7906d2, list3);
                            arrayList.add(c7905c);
                            c7905c.m40803v(i15);
                            i15 += list3.size();
                        }
                    }
                    if (!C23250w4.m119792T(c7906d2, c7906d)) {
                        arrayList.add(new C7905c(6, c7906d, new ArrayList()));
                    }
                    if (i11 == 0 && (m40819h2 = c7906d2.m40819h()) != null) {
                        m119848y.setTimeInMillis(m40819h2.m40842b());
                        i13 = m119848y.get(1);
                    }
                    if (i11 == list.size() - 1 && (m40819h = c7906d2.m40819h()) != null) {
                        m119848y.setTimeInMillis(m40819h.m40842b());
                        i14 = m119848y.get(1);
                    }
                    i11 = i16;
                }
                if (i12 > 0 && i13 > 0 && i14 > 0 && z11) {
                    C7905c m40808a = C7905c.Companion.m40808a(EnumC2382z.f9945r);
                    m40808a.m40802u(C23250w4.m119816x(C23250w4.f112644a, i12, null, 2, null));
                    arrayList.add(m40808a);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return arrayList;
    }

    /* renamed from: b0 */
    static /* synthetic */ List m36779b0(C7226u3 c7226u3, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return c7226u3.m36778a0(list, z11);
    }

    /* renamed from: c0 */
    private final List m36780c0(EnumC2382z enumC2382z, List list, int i11, boolean z11, boolean z12, EnumC2381y enumC2381y) {
        int i12;
        int i13;
        C7906d c7906d;
        int i14;
        List m131506n;
        List m131506n2;
        int i15;
        C7906d.b m40819h;
        C7906d.b m40819h2;
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (z11) {
            C7905c c7905c = new C7905c(11, null, null, 6, null);
            c7905c.m40807z(2);
            arrayList.add(c7905c);
            return arrayList;
        }
        if (!list.isEmpty() && (!C31950hc.f146830a.m153634E() || i11 != 0)) {
            Calendar m119848y = C23250w4.f112644a.m119848y();
            if (!list2.isEmpty()) {
                int size = list.size();
                int i16 = 0;
                int i17 = 0;
                i13 = 0;
                int i18 = 0;
                while (i16 < size) {
                    C7906d c7906d2 = (C7906d) list2.get(i16);
                    int i19 = i16 + 1;
                    if (i19 < list.size()) {
                        c7906d = (C7906d) list2.get(i19);
                    } else {
                        c7906d = null;
                    }
                    List<List> arrayList2 = new ArrayList();
                    if (enumC2382z == EnumC2382z.f9945r) {
                        c7906d2.m40832u(enumC2381y);
                        arrayList2 = c7906d2.m40822k();
                    } else {
                        for (MediaStoreItem mediaStoreItem : c7906d2.m40823l()) {
                            C31950hc c31950hc = C31950hc.f146830a;
                            if (c31950hc.m153634E()) {
                                List m153642t = c31950hc.m153642t();
                                if (m153642t != null) {
                                    i14 = i19;
                                    if (!m153642t.contains(mediaStoreItem.m40571M())) {
                                        m131506n2 = AbstractC25368s.m131506n(mediaStoreItem);
                                        arrayList2.add(m131506n2);
                                    }
                                } else {
                                    i14 = i19;
                                }
                            } else {
                                i14 = i19;
                                m131506n = AbstractC25368s.m131506n(mediaStoreItem);
                                arrayList2.add(m131506n);
                            }
                            i19 = i14;
                        }
                    }
                    int i21 = i19;
                    if (c7906d2.m40826o() && (!arrayList2.isEmpty())) {
                        i15 = size;
                        arrayList.add(new C7905c(1, c7906d2, new ArrayList()));
                    } else {
                        i15 = size;
                    }
                    if (!arrayList2.isEmpty()) {
                        for (List list3 : arrayList2) {
                            C7905c c7905c2 = new C7905c(C23250w4.f112644a.m119825M(enumC2382z), c7906d2, list3);
                            arrayList.add(c7905c2);
                            c7905c2.m40803v(i18);
                            i18 += list3.size();
                        }
                    }
                    if (!C23250w4.m119792T(c7906d2, c7906d)) {
                        arrayList.add(new C7905c(6, c7906d, new ArrayList()));
                    }
                    if (i16 == 0 && (m40819h2 = c7906d2.m40819h()) != null) {
                        m119848y.setTimeInMillis(m40819h2.m40842b());
                        i17 = m119848y.get(1);
                    }
                    if (i16 == list.size() - 1 && (m40819h = c7906d2.m40819h()) != null) {
                        m119848y.setTimeInMillis(m40819h.m40842b());
                        i13 = m119848y.get(1);
                    }
                    list2 = list;
                    size = i15;
                    i16 = i21;
                }
                i12 = i17;
            } else {
                i12 = 0;
                i13 = 0;
            }
            if (i11 > 0 && i12 > 0 && i13 > 0) {
                this.f39621H = C23250w4.m119816x(C23250w4.f112644a, i11, null, 2, null);
                if (!z12) {
                    C7905c m40808a = C7905c.Companion.m40808a(enumC2382z);
                    m40808a.m40802u(this.f39621H);
                    arrayList.add(m40808a);
                }
            }
            if (this.f39628O) {
                arrayList.add(new C7905c(3, null, null, 6, null));
            }
            if (this.f39629P) {
                arrayList.add(new C7905c(4, null, null, 6, null));
            }
            return arrayList;
        }
        arrayList.add(new C7905c(5, null, null, 6, null));
        return arrayList;
    }

    /* renamed from: d0 */
    private final List m36781d0(List list, EnumC2382z enumC2382z) {
        long j11;
        List m131506n;
        ArrayList arrayList = new ArrayList();
        int i11 = 1;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C7906d c7906d = (C7906d) it.next();
                if (((c7906d.m40823l().isEmpty() ? 1 : 0) ^ i11) != 0) {
                    C7906d.b m40819h = c7906d.m40819h();
                    if (m40819h != null) {
                        j11 = m40819h.m40842b();
                    } else {
                        j11 = 0;
                    }
                    C7905c c7905c = new C7905c(1, null, null, 6, null);
                    c7905c.m40801t(j11);
                    c7905c.m40805x(c7906d);
                    arrayList.add(c7905c);
                    List<List> arrayList2 = new ArrayList();
                    if (enumC2382z == EnumC2382z.f9945r) {
                        C23250w4 c23250w4 = C23250w4.f112644a;
                        List m40823l = c7906d.m40823l();
                        C3499e0.a aVar = C3499e0.Companion;
                        c23250w4.m119838j0(m40823l, aVar.m17646b());
                        c7906d.m40832u(aVar.m17646b());
                        arrayList2 = c7906d.m40822k();
                    } else {
                        for (MediaStoreItem mediaStoreItem : c7906d.m40823l()) {
                            if (!mediaStoreItem.m40599m().m94904H3()) {
                                MediaStoreItem[] mediaStoreItemArr = new MediaStoreItem[i11];
                                mediaStoreItemArr[0] = mediaStoreItem;
                                m131506n = AbstractC25368s.m131506n(mediaStoreItemArr);
                                arrayList2.add(m131506n);
                            }
                        }
                    }
                    if (((arrayList2.isEmpty() ? 1 : 0) ^ i11) != 0) {
                        long j12 = j11 + 1;
                        for (List list2 : arrayList2) {
                            C7905c c7905c2 = new C7905c(m36784l0(enumC2382z), null, null, 6, null);
                            c7905c2.m40801t(j12);
                            c7905c2.m40805x(c7906d);
                            c7905c2.m40789h().clear();
                            c7905c2.m40789h().addAll(list2);
                            arrayList.add(c7905c2);
                            j12++;
                            i11 = 1;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e0 */
    public final String m36782e0() {
        return "chat_storedmedia";
    }

    /* renamed from: k0 */
    private final int m36783k0(EnumC2382z enumC2382z) {
        int i11 = f.f39667a[enumC2382z.ordinal()];
        if (i11 != 3) {
            if (i11 != 4) {
                return AbstractC16803z.illus_empty_photos;
            }
            return AbstractC16803z.empty_file;
        }
        return AbstractC16803z.empty_link;
    }

    /* renamed from: l0 */
    private final int m36784l0(EnumC2382z enumC2382z) {
        int i11 = f.f39667a[enumC2382z.ordinal()];
        if (i11 != 3) {
            if (i11 != 4) {
                return 2;
            }
            return 9;
        }
        return 8;
    }

    /* renamed from: o0 */
    private final String m36785o0(Context context, EnumC2382z enumC2382z, EnumC2363o enumC2363o) {
        boolean z11;
        int i11;
        String string;
        String string2 = context.getString(AbstractC8020f0.str_empty_media_stored_media);
        AbstractC19074t.m100207e(string2, "getString(...)");
        if (!this.f39616C && !AbstractC25495a.m132078c(this.f39632t.m36825a())) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (enumC2363o == EnumC2363o.f9891r) {
            i11 = AbstractC8020f0.str_empty_stored_media_video;
        } else {
            i11 = AbstractC8020f0.str_empty_stored_media_sendtome_media_2;
        }
        String string3 = context.getString(i11);
        AbstractC19074t.m100205c(string3);
        int i12 = f.f39667a[enumC2382z.ordinal()];
        if (i12 != 2) {
            if (i12 != 3) {
                if (i12 == 4) {
                    if (z11) {
                        string = context.getString(AbstractC8020f0.str_empty_stored_media_sendtome_file_2);
                        AbstractC19074t.m100207e(string, "getString(...)");
                    } else {
                        if (this.f39616C) {
                            string = context.getString(AbstractC8020f0.str_empty_stored_media_sendtome_file_2);
                        } else if (C21373a.f104231a.m110802n()) {
                            string = context.getString(AbstractC8020f0.str_empty_stored_media_sendtome_file_2);
                        } else {
                            string = context.getString(AbstractC8020f0.str_empty_stored_media_sendtome_file);
                        }
                        AbstractC19074t.m100205c(string);
                    }
                } else {
                    return string2;
                }
            } else if (z11) {
                string = context.getString(AbstractC8020f0.str_empty_stored_media_sendtome_link_2);
                AbstractC19074t.m100207e(string, "getString(...)");
            } else {
                if (this.f39616C) {
                    string = context.getString(AbstractC8020f0.str_empty_stored_media_sendtome_link_2);
                } else if (C21373a.f104231a.m110802n()) {
                    string = context.getString(AbstractC8020f0.str_empty_stored_media_sendtome_link_2);
                } else {
                    string = context.getString(AbstractC8020f0.str_empty_stored_media_sendtome_link);
                }
                AbstractC19074t.m100205c(string);
            }
        } else {
            if (z11 || this.f39616C || C21373a.f104231a.m110802n()) {
                return string3;
            }
            string = context.getString(AbstractC8020f0.str_empty_stored_media_sendtome_media);
            AbstractC19074t.m100205c(string);
        }
        return string;
    }

    /* renamed from: q0 */
    private final void m36786q0() {
        try {
            this.f39619F.clear();
            this.f39620G.clear();
            ArrayList arrayList = new ArrayList();
            int size = this.f39618E.size();
            for (int i11 = 0; i11 < size; i11++) {
                C7905c m36812h0 = m36812h0(i11);
                if (m36812h0 != null && m36812h0.m40798q() == 2) {
                    int size2 = m36812h0.m40789h().size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        arrayList.add((MediaStoreItem) m36812h0.m40789h().get(i12));
                        this.f39619F.put(arrayList.size() - 1, i11);
                        if (i12 == 0) {
                            this.f39620G.put(i11, arrayList.size() - 1);
                        }
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: r0 */
    private final boolean m36787r0() {
        InterfaceC27218a m92676n2;
        ZaloView zaloView = this.f39631s;
        if (zaloView == null || (m92676n2 = zaloView.m92676n2()) == null || !m92676n2.mo35576n3()) {
            return false;
        }
        return true;
    }

    /* renamed from: s0 */
    private final boolean m36788s0(int i11) {
        Iterator it = this.f39618E.iterator();
        while (it.hasNext()) {
            if (((C7905c) it.next()).m40798q() == i11) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v0 */
    public static final void m36789v0(C7226u3 c7226u3, View view) {
        AbstractC19074t.m100208f(c7226u3, "this$0");
        c cVar = c7226u3.f39636x;
        if (cVar != null) {
            cVar.mo36830b();
        }
        a aVar = c7226u3.f39635w;
        if (aVar != null) {
            aVar.mo36822b();
        }
        c cVar2 = c7226u3.f39636x;
        if (cVar2 != null) {
            cVar2.mo36830b();
        }
        c cVar3 = c7226u3.f39636x;
        if (cVar3 != null) {
            cVar3.mo36830b();
        }
    }

    /* renamed from: w0 */
    public static final void m36790w0(C7226u3 c7226u3, View view) {
        AbstractC19074t.m100208f(c7226u3, "this$0");
        d dVar = c7226u3.f39634v;
        if (dVar != null) {
            dVar.mo36840H0();
        }
    }

    /* renamed from: A0 */
    public final void m36791A0(a aVar) {
        this.f39635w = aVar;
    }

    /* renamed from: B0 */
    public final void m36792B0(List list) {
        AbstractC19074t.m100208f(list, "lstAlbums");
        try {
            this.f39618E.clear();
            this.f39618E.addAll(m36779b0(this, list, false, 2, null));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: C0 */
    public final void m36793C0(EnumC2382z enumC2382z, List list, int i11, boolean z11, boolean z12, EnumC2381y enumC2381y) {
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        AbstractC19074t.m100208f(list, "sectionList");
        AbstractC19074t.m100208f(enumC2381y, "mediaLayoutMode");
        this.f39618E.clear();
        this.f39618E.addAll(m36780c0(enumC2382z, list, i11, z11, z12, enumC2381y));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: D */
    public void mo9993D(RecyclerView recyclerView) {
        AbstractC19074t.m100208f(recyclerView, "recyclerView");
        super.mo9993D(recyclerView);
        recyclerView.removeOnLayoutChangeListener(this.f39623J);
    }

    /* renamed from: D0 */
    public final void m36794D0(boolean z11) {
        this.f39638z = z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0168, code lost:            r13.f39618E.add(m36775W(r15));     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:            return;     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0114 A[Catch: Exception -> 0x0042, TryCatch #1 {Exception -> 0x0042, blocks: (B:3:0x0005, B:5:0x000f, B:13:0x0023, B:16:0x010b, B:20:0x0114, B:23:0x012a, B:27:0x0136, B:29:0x013a, B:31:0x013e, B:34:0x0142, B:36:0x0148, B:38:0x0152, B:43:0x0168, B:45:0x0172, B:47:0x0045, B:48:0x0064, B:49:0x0083, B:50:0x008c, B:64:0x00ad, B:65:0x00ae, B:68:0x00b6, B:70:0x00bc, B:72:0x00d0, B:73:0x00d7, B:75:0x00dc, B:76:0x00e3, B:78:0x00eb, B:80:0x00f3, B:82:0x00fa, B:91:0x0104, B:92:0x0105, B:52:0x008d, B:53:0x0095, B:55:0x009b, B:58:0x00a5, B:63:0x00ab), top: B:2:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0136 A[Catch: Exception -> 0x0042, TryCatch #1 {Exception -> 0x0042, blocks: (B:3:0x0005, B:5:0x000f, B:13:0x0023, B:16:0x010b, B:20:0x0114, B:23:0x012a, B:27:0x0136, B:29:0x013a, B:31:0x013e, B:34:0x0142, B:36:0x0148, B:38:0x0152, B:43:0x0168, B:45:0x0172, B:47:0x0045, B:48:0x0064, B:49:0x0083, B:50:0x008c, B:64:0x00ad, B:65:0x00ae, B:68:0x00b6, B:70:0x00bc, B:72:0x00d0, B:73:0x00d7, B:75:0x00dc, B:76:0x00e3, B:78:0x00eb, B:80:0x00f3, B:82:0x00fa, B:91:0x0104, B:92:0x0105, B:52:0x008d, B:53:0x0095, B:55:0x009b, B:58:0x00a5, B:63:0x00ab), top: B:2:0x0005, inners: #0 }] */
    /* renamed from: E0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m36795E0(C3526u c3526u, EnumC2382z enumC2382z) {
        boolean z11;
        long j11;
        C3508j c3508j;
        AbstractC19074t.m100208f(enumC2382z, "typeSearch");
        try {
            this.f39618E.clear();
            int i11 = 2;
            if (c3526u != null) {
                int i12 = f.f39667a[enumC2382z.ordinal()];
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 4) {
                                EnumC2382z enumC2382z2 = EnumC2382z.f9947t;
                                ArrayList arrayList = new ArrayList(c3526u.m17851j(enumC2382z2));
                                z11 = !arrayList.isEmpty();
                                this.f39618E.addAll(m36781d0(arrayList, enumC2382z2));
                            }
                        } else {
                            EnumC2382z enumC2382z3 = EnumC2382z.f9946s;
                            ArrayList arrayList2 = new ArrayList(c3526u.m17851j(enumC2382z3));
                            z11 = !arrayList2.isEmpty();
                            this.f39618E.addAll(m36781d0(arrayList2, enumC2382z3));
                        }
                    } else {
                        EnumC2382z enumC2382z4 = EnumC2382z.f9945r;
                        ArrayList arrayList3 = new ArrayList(c3526u.m17851j(enumC2382z4));
                        z11 = !arrayList3.isEmpty();
                        this.f39618E.addAll(m36781d0(arrayList3, enumC2382z4));
                    }
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    synchronized (c3526u.m17848g()) {
                        try {
                            Iterator it = c3526u.m17848g().iterator();
                            while (it.hasNext()) {
                                C3508j c3508j2 = ((C3528w) it.next()).f14830b;
                                if (c3508j2 != null) {
                                    arrayList4.add(c3508j2);
                                }
                            }
                            C24848g0 c24848g0 = C24848g0.f119245a;
                        } finally {
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        for (int i13 = 0; i13 < arrayList4.size(); i13 += 2) {
                            C3508j c3508j3 = (C3508j) arrayList4.get(i13);
                            C7905c c7905c = new C7905c(14, null, null, 6, null);
                            if (c3508j3 != null) {
                                j11 = c3508j3.m17711w0();
                            } else {
                                j11 = 0;
                            }
                            c7905c.m40801t(j11);
                            if (c3508j3 != null) {
                                c7905c.m40782a().add(c3508j3);
                            }
                            int i14 = i13 + 1;
                            if (i14 < arrayList4.size() && (c3508j = (C3508j) arrayList4.get(i14)) != null) {
                                c7905c.m40782a().add(c3508j);
                            }
                            this.f39618E.add(c7905c);
                        }
                        z11 = true;
                    }
                }
                if (c3526u != null && !c3526u.m17856p(enumC2382z)) {
                    if (z11) {
                        List list = this.f39618E;
                        C7905c c7905c2 = new C7905c(7, null, null, 6, null);
                        if (C23055e5.m118273h(false, 1, null)) {
                            i11 = 1;
                        }
                        c7905c2.m40800s(i11);
                        c7905c2.m40801t(-2007L);
                        list.add(c7905c2);
                        return;
                    }
                    if ((enumC2382z == EnumC2382z.f9945r || enumC2382z == EnumC2382z.f9946s || enumC2382z == EnumC2382z.f9947t) && c3526u.m17850i() != null && c3526u.m17846e(enumC2382z).m17556i()) {
                        List list2 = this.f39618E;
                        C7905c c7905c3 = new C7905c(3, null, null, 6, null);
                        c7905c3.m40801t(-2006L);
                        list2.add(c7905c3);
                        return;
                    }
                    return;
                }
                List list3 = this.f39618E;
                C7905c c7905c4 = new C7905c(3, null, null, 6, null);
                c7905c4.m40801t(-2006L);
                list3.add(c7905c4);
            }
            z11 = false;
            if (c3526u != null) {
                if (z11) {
                }
            }
            List list32 = this.f39618E;
            C7905c c7905c42 = new C7905c(3, null, null, 6, null);
            c7905c42.m40801t(-2006L);
            list32.add(c7905c42);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: F0 */
    public final void m36796F0(boolean z11) {
        this.f39615B = z11;
    }

    /* renamed from: G0 */
    public final void m36797G0(c cVar) {
        this.f39636x = cVar;
    }

    /* renamed from: H0 */
    public final void m36798H0(int i11) {
        this.f39622I = i11;
    }

    /* renamed from: I0 */
    public final void m36799I0(boolean z11) {
        this.f39614A = z11;
    }

    /* renamed from: J0 */
    public final void m36800J0(C3526u c3526u) {
        boolean z11;
        boolean z12;
        int m131511r;
        boolean z13;
        C3508j c3508j;
        this.f39618E.clear();
        if (c3526u != null) {
            List arrayList = new ArrayList();
            synchronized (c3526u.m17848g()) {
                try {
                    Iterator it = c3526u.m17848g().iterator();
                    while (it.hasNext()) {
                        C3508j c3508j2 = ((C3528w) it.next()).f14830b;
                        if (c3508j2 != null) {
                            arrayList.add(c3508j2);
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!arrayList.isEmpty()) {
                if (arrayList.size() > 4) {
                    arrayList = arrayList.subList(0, 4);
                    z13 = true;
                } else {
                    z13 = false;
                }
                List list = this.f39618E;
                C7905c c7905c = new C7905c(15, null, null, 6, null);
                c7905c.m40801t(-2000L);
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_store_album_section_title_new);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                String m118743r02 = z13 ? AbstractC23136l9.m118743r0(AbstractC8020f0.btn_see_more) : "";
                AbstractC19074t.m100205c(m118743r02);
                c7905c.m40804w(new C3503g0(1, m118743r0, "", m118743r02, 0));
                list.add(c7905c);
                int i11 = 0;
                while (true) {
                    List list2 = arrayList;
                    if (i11 >= list2.size()) {
                        break;
                    }
                    C3508j c3508j3 = (C3508j) list2.get(i11);
                    List list3 = this.f39618E;
                    C7905c c7905c2 = new C7905c(14, null, null, 6, null);
                    c7905c2.m40801t(c3508j3 != null ? c3508j3.m17711w0() : 0L);
                    if (c3508j3 != null) {
                        c7905c2.m40782a().add(c3508j3);
                    }
                    int i12 = i11 + 1;
                    if (i12 < list2.size() && (c3508j = (C3508j) list2.get(i12)) != null) {
                        c7905c2.m40782a().add(c3508j);
                    }
                    list3.add(c7905c2);
                    i11 += 2;
                }
                z12 = true;
            } else {
                z12 = false;
            }
            EnumC2382z enumC2382z = EnumC2382z.f9945r;
            AbstractC3498e m17846e = c3526u.m17846e(enumC2382z);
            if (!m17846e.m17559l().isEmpty()) {
                if (z12) {
                    List list4 = this.f39618E;
                    C7905c c7905c3 = new C7905c(16, null, null, 6, null);
                    c7905c3.m40801t(-2008L);
                    list4.add(c7905c3);
                } else {
                    z12 = true;
                }
                boolean z14 = c3526u.m17846e(enumC2382z).m17556i() || m17846e.mo17564q() > AbstractC3527v.m17873a(enumC2382z);
                List list5 = this.f39618E;
                C7905c c7905c4 = new C7905c(15, null, null, 6, null);
                c7905c4.m40801t(-2004L);
                String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_photo_search_section);
                AbstractC19074t.m100207e(m118743r03, "getString(...)");
                String m118743r04 = z14 ? AbstractC23136l9.m118743r0(AbstractC8020f0.btn_see_more) : "";
                AbstractC19074t.m100205c(m118743r04);
                c7905c4.m40804w(new C3503g0(2, m118743r03, "", m118743r04, 0));
                list5.add(c7905c4);
                C7906d c7906d = new C7906d(null);
                if (C31950hc.f146830a.m153634E()) {
                    for (MediaStoreItem mediaStoreItem : m17846e.mo17561n()) {
                        if (!mediaStoreItem.m40599m().m94904H3()) {
                            c7906d.m40823l().add(new MediaStoreItem(mediaStoreItem.m40599m()));
                        }
                    }
                } else {
                    List m40823l = c7906d.m40823l();
                    List mo17561n = m17846e.mo17561n();
                    m131511r = AbstractC25370t.m131511r(mo17561n, 10);
                    ArrayList arrayList2 = new ArrayList(m131511r);
                    Iterator it2 = mo17561n.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new MediaStoreItem(((MediaStoreItem) it2.next()).m40599m()));
                    }
                    m40823l.addAll(arrayList2);
                }
                C23250w4 c23250w4 = C23250w4.f112644a;
                List m40823l2 = c7906d.m40823l();
                C3499e0.a aVar = C3499e0.Companion;
                c23250w4.m119838j0(m40823l2, aVar.m17646b());
                c7906d.m40832u(aVar.m17646b());
                long m40818g = c7906d.m40818g();
                int i13 = 2;
                for (List list6 : c7906d.m40822k()) {
                    List list7 = this.f39618E;
                    C7905c c7905c5 = new C7905c(2, null, null, 6, null);
                    long j11 = 1 + m40818g;
                    c7905c5.m40801t(m40818g);
                    c7905c5.m40789h().clear();
                    c7905c5.m40789h().addAll(list6);
                    list7.add(c7905c5);
                    i13--;
                    if (i13 <= 0) {
                        break;
                    } else {
                        m40818g = j11;
                    }
                }
            }
            List<MediaStoreItem> arrayList3 = new ArrayList();
            AbstractC3498e m17846e2 = c3526u.m17846e(EnumC2382z.f9947t);
            synchronized (m17846e2) {
                try {
                    if (C31950hc.f146830a.m153634E()) {
                        Iterator it3 = m17846e2.m17559l().iterator();
                        while (it3.hasNext()) {
                            for (MediaStoreItem mediaStoreItem2 : ((C7906d) it3.next()).m40823l()) {
                                if (!mediaStoreItem2.m40599m().m94904H3()) {
                                    arrayList3.add(mediaStoreItem2);
                                }
                            }
                        }
                    } else {
                        Iterator it4 = m17846e2.m17559l().iterator();
                        while (it4.hasNext()) {
                            arrayList3.addAll(((C7906d) it4.next()).m40823l());
                        }
                    }
                    C24848g0 c24848g02 = C24848g0.f119245a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (!arrayList3.isEmpty()) {
                if (z12) {
                    List list8 = this.f39618E;
                    C7905c c7905c6 = new C7905c(16, null, null, 6, null);
                    c7905c6.m40801t(-2008L);
                    list8.add(c7905c6);
                } else {
                    z12 = true;
                }
                EnumC2382z enumC2382z2 = EnumC2382z.f9947t;
                boolean m17556i = c3526u.m17846e(enumC2382z2).m17556i();
                if (arrayList3.size() > AbstractC3527v.m17873a(enumC2382z2)) {
                    arrayList3 = arrayList3.subList(0, 4);
                    m17556i = true;
                }
                List list9 = this.f39618E;
                C7905c c7905c7 = new C7905c(15, null, null, 6, null);
                c7905c7.m40801t(-2010L);
                String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_file_search_section);
                AbstractC19074t.m100207e(m118743r05, "getString(...)");
                String m118743r06 = m17556i ? AbstractC23136l9.m118743r0(AbstractC8020f0.btn_see_more) : "";
                AbstractC19074t.m100205c(m118743r06);
                c7905c7.m40804w(new C3503g0(4, m118743r05, "", m118743r06, 0));
                list9.add(c7905c7);
                for (MediaStoreItem mediaStoreItem3 : arrayList3) {
                    List list10 = this.f39618E;
                    C7905c c7905c8 = new C7905c(9, null, null, 6, null);
                    c7905c8.m40801t(mediaStoreItem3.m40617z());
                    c7905c8.m40789h().clear();
                    c7905c8.m40789h().add(mediaStoreItem3);
                    list10.add(c7905c8);
                }
            }
            List<MediaStoreItem> arrayList4 = new ArrayList();
            AbstractC3498e m17846e3 = c3526u.m17846e(EnumC2382z.f9946s);
            synchronized (m17846e3) {
                try {
                    if (C31950hc.f146830a.m153634E()) {
                        Iterator it5 = m17846e3.m17559l().iterator();
                        while (it5.hasNext()) {
                            for (MediaStoreItem mediaStoreItem4 : ((C7906d) it5.next()).m40823l()) {
                                if (!mediaStoreItem4.m40599m().m94904H3()) {
                                    arrayList4.add(mediaStoreItem4);
                                }
                            }
                        }
                    } else {
                        Iterator it6 = m17846e3.m17559l().iterator();
                        while (it6.hasNext()) {
                            arrayList4.addAll(((C7906d) it6.next()).m40823l());
                        }
                    }
                    C24848g0 c24848g03 = C24848g0.f119245a;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            if (!arrayList4.isEmpty()) {
                if (z12) {
                    List list11 = this.f39618E;
                    C7905c c7905c9 = new C7905c(16, null, null, 6, null);
                    c7905c9.m40801t(-2008L);
                    list11.add(c7905c9);
                    z11 = z12;
                } else {
                    z11 = true;
                }
                EnumC2382z enumC2382z3 = EnumC2382z.f9946s;
                boolean m17556i2 = c3526u.m17846e(enumC2382z3).m17556i();
                if (arrayList4.size() > AbstractC3527v.m17873a(enumC2382z3)) {
                    arrayList4 = arrayList4.subList(0, 4);
                    m17556i2 = true;
                }
                C7905c c7905c10 = new C7905c(15, null, null, 6, null);
                c7905c10.m40801t(-2009L);
                String m118743r07 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_link_search_section);
                AbstractC19074t.m100207e(m118743r07, "getString(...)");
                String m118743r08 = m17556i2 ? AbstractC23136l9.m118743r0(AbstractC8020f0.btn_see_more) : "";
                AbstractC19074t.m100205c(m118743r08);
                c7905c10.m40804w(new C3503g0(3, m118743r07, "", m118743r08, 0));
                this.f39618E.add(c7905c10);
                for (MediaStoreItem mediaStoreItem5 : arrayList4) {
                    List list12 = this.f39618E;
                    C7905c c7905c11 = new C7905c(8, null, null, 6, null);
                    c7905c11.m40801t(mediaStoreItem5.m40617z());
                    c7905c11.m40789h().clear();
                    c7905c11.m40789h().add(mediaStoreItem5);
                    list12.add(c7905c11);
                }
            } else {
                z11 = z12;
            }
        } else {
            z11 = false;
        }
        if (c3526u == null || (c3526u.m17855o() && !z11)) {
            C7905c c7905c12 = new C7905c(13, null, null, 6, null);
            c7905c12.m40801t(-2006L);
            c7905c12.m40807z(8);
            c7905c12.m40806y(1);
            this.f39618E.add(c7905c12);
            return;
        }
        if (z11) {
            return;
        }
        C7905c c7905c13 = new C7905c(7, null, null, 6, null);
        c7905c13.m40800s(!C23055e5.m118273h(false, 1, null) ? 2 : 1);
        c7905c13.m40801t(-2007L);
        this.f39618E.add(c7905c13);
    }

    /* renamed from: K0 */
    public final void m36801K0(d dVar) {
        this.f39634v = dVar;
    }

    /* renamed from: L0 */
    public final void m36802L0(int i11) {
        this.f39617D = i11;
    }

    /* renamed from: M0 */
    public final void m36803M0(boolean z11, boolean z12) {
        try {
            this.f39629P = z11;
            if (z11) {
                if (m36788s0(4)) {
                    return;
                }
                this.f39618E.add(new C7905c(4, null, null, 6, null));
                if (z12) {
                    m10011s(this.f39618E.size() - 1);
                    return;
                }
                return;
            }
            int mo10003k = mo10003k();
            int i11 = 0;
            while (true) {
                if (i11 < mo10003k) {
                    C7905c m36812h0 = m36812h0(i11);
                    if (m36812h0 != null && m36812h0.m40798q() == 4) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 != -1) {
                this.f39618E.remove(i11);
                if (z12) {
                    m10017y(i11);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: O0 */
    public final void m36804O0(boolean z11, boolean z12) {
        try {
            this.f39628O = z11;
            if (z11) {
                if (m36788s0(3)) {
                    return;
                }
                this.f39618E.add(new C7905c(3, null, null, 6, null));
                if (z12) {
                    m10011s(this.f39618E.size() - 1);
                    return;
                }
                return;
            }
            int mo10003k = mo10003k();
            int i11 = 0;
            while (true) {
                if (i11 < mo10003k) {
                    C7905c m36812h0 = m36812h0(i11);
                    if (m36812h0 != null && m36812h0.m40798q() == 3) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 != -1) {
                this.f39618E.remove(i11);
                if (z12) {
                    m10017y(i11);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: Q0 */
    public final void m36805Q0() {
        m36786q0();
        C20275e c20275e = this.f39627N;
        if (c20275e != null) {
            c20275e.m105857C(this.f39619F);
            c20275e.m105858D(this.f39620G);
        }
    }

    /* renamed from: U */
    public final boolean m36806U() {
        return !this.f39629P;
    }

    /* renamed from: X */
    public final void m36807X(MediaStoreItem mediaStoreItem, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(mediaStoreItem, "item");
        try {
            if (this.f39625L) {
                return;
            }
            this.f39625L = true;
            AbstractC19444a.m101694b(new Runnable() { // from class: com.zing.zalo.adapters.t3
                public /* synthetic */ RunnableC7215t3() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C7226u3.m36777Z(C7226u3.this);
                }
            }, 500L);
            mediaStoreItem.m40610t0(false);
            c cVar = this.f39636x;
            if (cVar != null) {
                cVar.mo36834f(mediaStoreItem, z11, z12, this.f39626M);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // vc0.InterfaceC27963b
    /* renamed from: f */
    public List mo36808f(int i11) {
        C7905c m36812h0 = m36812h0(i11);
        if ((m36812h0 != null && m36812h0.m40798q() == 2) || ((m36812h0 != null && m36812h0.m40798q() == 8) || (m36812h0 != null && m36812h0.m40798q() == 9))) {
            return m36812h0.m40789h();
        }
        return new ArrayList();
    }

    /* renamed from: f0 */
    public final List m36809f0() {
        return this.f39618E;
    }

    @Override // com.zing.zalo.p077ui.custom.AbstractC11859g.c
    /* renamed from: g */
    public String mo36810g(int i11) {
        String str;
        C7906d m40794m = ((C7905c) this.f39618E.get(i11)).m40794m();
        if (m40794m != null && m40794m.m40825n()) {
            str = AbstractC23160o0.m119305y0(m40794m.m40818g());
        } else {
            str = "";
        }
        String m119738b = AbstractC23244v8.m119738b(str);
        AbstractC19074t.m100207e(m119738b, "capitalize(...)");
        return m119738b;
    }

    /* renamed from: g0 */
    public final boolean m36811g0() {
        return this.f39638z;
    }

    /* renamed from: h0 */
    public final C7905c m36812h0(int i11) {
        if (i11 >= 0 && i11 < this.f39618E.size()) {
            return (C7905c) this.f39618E.get(i11);
        }
        return null;
    }

    /* renamed from: i0 */
    public final c m36813i0() {
        return this.f39636x;
    }

    /* renamed from: j0 */
    public final int m36814j0() {
        return this.f39622I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f39618E.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        C7905c m36812h0 = m36812h0(i11);
        if (m36812h0 != null && m36812h0.m40790i() != 0) {
            return m36812h0.m40790i();
        }
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        try {
            C7905c m36812h0 = m36812h0(i11);
            if (m36812h0 == null) {
                return 0;
            }
            return m36812h0.m40798q();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return 0;
        }
    }

    /* renamed from: m0 */
    public final d m36815m0() {
        return this.f39634v;
    }

    /* renamed from: p0 */
    public final int m36816p0() {
        return this.f39617D;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x02f0, code lost:            if (r0.m40798q() == 3) goto L381;     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: t0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo9990A(e eVar, int i11) {
        long j11;
        Context context;
        int i12;
        boolean z11;
        MediaStoreItem m40788g;
        boolean z12;
        int i13;
        CharSequence charSequence;
        int i14;
        CharSequence charSequence2;
        AbstractC19074t.m100208f(eVar, "holder");
        C7905c m36812h0 = m36812h0(i11);
        try {
            int i15 = 2;
            C7906d c7906d = null;
            C3503g0 c3503g0 = null;
            C3508j c3508j = null;
            CharSequence m118743r0 = null;
            EnumC2382z enumC2382z = null;
            boolean z13 = true;
            switch (mo10005m(i11)) {
                case 1:
                    MediaStoreMediaHeaderView m36864y0 = eVar.m36864y0();
                    if (m36864y0 != null) {
                        if (m36812h0 != null) {
                            c7906d = m36812h0.m40794m();
                        }
                        m36864y0.m69469X(c7906d, this.f39638z, i11);
                        break;
                    }
                    break;
                case 2:
                    MediaStoreMediaModulesView m36862w0 = eVar.m36862w0();
                    if (m36862w0 != null) {
                        m36862w0.setMWidth(this.f39617D);
                        m36862w0.setEnableDrawItemBorder(false);
                        m36862w0.m69583c0(m36812h0, i11, m36787r0(), this.f39638z);
                        m36862w0.requestLayout();
                        m36862w0.setHarassing(this.f39615B);
                        m36862w0.m69584h0(m36812h0, this.f39614A);
                        break;
                    }
                    break;
                case 3:
                    LinearLayout m36852m0 = eVar.m36852m0();
                    if (m36852m0 != null) {
                        m36852m0.setVisibility(0);
                    }
                    LinearLayout m36851l0 = eVar.m36851l0();
                    if (m36851l0 != null) {
                        m36851l0.setVisibility(8);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    LinearLayout m36851l02 = eVar.m36851l0();
                    if (m36851l02 != null) {
                        m36851l02.setVisibility(0);
                    }
                    LinearLayout m36852m02 = eVar.m36852m0();
                    if (m36852m02 != null) {
                        m36852m02.setVisibility(8);
                    }
                    LinearLayout m36851l03 = eVar.m36851l0();
                    if (m36851l03 != null) {
                        m36851l03.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.r3
                            public /* synthetic */ ViewOnClickListenerC7193r3() {
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C7226u3.m36789v0(C7226u3.this, view);
                            }
                        });
                        break;
                    }
                    break;
                case 5:
                    RecyclingImageView m36849j0 = eVar.m36849j0();
                    if (m36849j0 != null) {
                        m36849j0.setImageDrawable(AbstractC23136l9.m118665N(this.f39630r, m36783k0(this.f39632t.m36828d())));
                    }
                    RobotoTextView m36865z0 = eVar.m36865z0();
                    if (m36865z0 != null) {
                        m36865z0.setVisibility(0);
                    }
                    RobotoTextView m36865z02 = eVar.m36865z0();
                    if (m36865z02 != null) {
                        m36865z02.setText(m36785o0(this.f39630r, this.f39632t.m36828d(), this.f39632t.m36826b()));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    MediaStoreItemYearDivider m36860u0 = eVar.m36860u0();
                    if (m36860u0 != null) {
                        if (m36812h0 != null) {
                            j11 = m36812h0.m40783b();
                        } else {
                            j11 = 0;
                        }
                        m36860u0.setYearData(j11);
                        break;
                    }
                    break;
                case 7:
                    if (m36812h0 != null && m36812h0.m40785d() == 2) {
                        AppCompatImageView m36850k0 = eVar.m36850k0();
                        if (m36850k0 != null) {
                            m36850k0.setImageDrawable(AbstractC23136l9.m118665N(this.f39630r, AbstractC16803z.im_network_err));
                        }
                        RobotoTextView m36855p0 = eVar.m36855p0();
                        if (m36855p0 != null) {
                            m36855p0.setText(AbstractC8020f0.empty_text_network_error);
                        }
                        RobotoButton m36853n0 = eVar.m36853n0();
                        if (m36853n0 != null) {
                            m36853n0.setVisibility(0);
                        }
                        RobotoButton m36853n02 = eVar.m36853n0();
                        if (m36853n02 != null) {
                            m36853n02.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.s3
                                public /* synthetic */ ViewOnClickListenerC7204s3() {
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C7226u3.m36790w0(C7226u3.this, view);
                                }
                            });
                            break;
                        }
                    } else {
                        if (C23212s8.m119603k()) {
                            context = this.f39630r;
                            i12 = AbstractC16803z.ic_illus_search_light;
                        } else {
                            context = this.f39630r;
                            i12 = AbstractC16803z.ic_illus_search_dark;
                        }
                        Drawable m118665N = AbstractC23136l9.m118665N(context, i12);
                        AppCompatImageView m36850k02 = eVar.m36850k0();
                        if (m36850k02 != null) {
                            m36850k02.setImageDrawable(m118665N);
                        }
                        RobotoTextView m36855p02 = eVar.m36855p0();
                        if (m36855p02 != null) {
                            m36855p02.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no_results_search_my_cloud_title) + "\n");
                        }
                        RobotoButton m36853n03 = eVar.m36853n0();
                        if (m36853n03 != null) {
                            m36853n03.setVisibility(8);
                            break;
                        } else {
                            break;
                        }
                    }
                    break;
                case 8:
                    MediaStoreItemLinkModuleView m36859t0 = eVar.m36859t0();
                    if (m36859t0 != null) {
                        m36859t0.setEnableMultiSelect(this.f39638z);
                        m36859t0.m69563f0(m36812h0, i11, this.f39614A);
                        if (m36812h0 != null && m36812h0.m40795n() && !m36774V(i11, 1) && !m36774V(i11, 6)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        m36859t0.setVisibilityCline(z11);
                        m36859t0.setPaddingTopLayoutLinkFile(AbstractC23136l9.m118742r(10.0f));
                        break;
                    }
                    break;
                case 9:
                    if (m36812h0 != null && (m40788g = m36812h0.m40788g()) != null) {
                        MediaStoreItemFileModuleView m36858s0 = eVar.m36858s0();
                        if (m36858s0 != null) {
                            m36858s0.setEnableMultiSelect(this.f39638z);
                            m36858s0.m69525r0(m36812h0, i11, this.f39626M);
                            if (m36812h0.m40795n() && !m36774V(i11, 1) && !m36774V(i11, 6)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            m36858s0.setVisibilityCline(z12);
                            m36858s0.setPaddingTopLayoutLinkFile(AbstractC23136l9.m118742r(10.0f));
                            m36858s0.setTag(m40788g.m40614x());
                            break;
                        }
                    }
                    return;
                case 10:
                    if (eVar.m36856q0() != null) {
                        TextView m36856q0 = eVar.m36856q0();
                        if (m36856q0 != null) {
                            if (m36812h0 != null) {
                                charSequence = m36812h0.m40791j();
                            } else {
                                charSequence = null;
                            }
                            m36856q0.setText(charSequence);
                            int i16 = AbstractC23222t7.f112566j;
                            m36856q0.setPadding(i16, i16, i16, i16);
                        }
                        if (m36812h0 != null) {
                            enumC2382z = m36812h0.m40784c();
                        }
                        if (enumC2382z == null) {
                            i13 = -1;
                        } else {
                            i13 = f.f39667a[enumC2382z.ordinal()];
                        }
                        if (i13 != 2) {
                            if (i13 != 3) {
                                if (i13 == 4) {
                                    eVar.f7784p.setId(AbstractC6918a0.txt_file_tab_total_item);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                eVar.f7784p.setId(AbstractC6918a0.txt_link_tab_total_item);
                                break;
                            }
                        } else {
                            eVar.f7784p.setId(AbstractC6918a0.txt_photo_tab_total_item);
                            break;
                        }
                    }
                    break;
                case 11:
                    MediaStoreMediaSkeletonView m36854o0 = eVar.m36854o0();
                    if (m36854o0 != null) {
                        if (m36812h0 != null) {
                            i15 = m36812h0.m40797p();
                        }
                        if (m36812h0 != null) {
                            i14 = m36812h0.m40796o();
                        } else {
                            i14 = 1;
                        }
                        m36854o0.m69487m(i15, i14);
                        break;
                    }
                    break;
                case 12:
                    RobotoTextView m36845A0 = eVar.m36845A0();
                    if (m36845A0 == null) {
                        break;
                    } else {
                        if (m36812h0 != null) {
                            charSequence2 = m36812h0.m40786e();
                        } else {
                            charSequence2 = null;
                        }
                        if (!TextUtils.isEmpty(charSequence2)) {
                            if (m36812h0 != null) {
                                m118743r0 = m36812h0.m40786e();
                            }
                        } else {
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.unknown_error);
                        }
                        m36845A0.setText(m118743r0);
                        break;
                    }
                case 14:
                    if (m36812h0 == null) {
                        return;
                    }
                    MediaStoreAlbumItemDualView m36857r0 = eVar.m36857r0();
                    if (m36857r0 != null) {
                        m36857r0.setEnabled(!this.f39638z);
                        C3508j c3508j2 = (C3508j) m36812h0.m40782a().get(0);
                        if (m36812h0.m40782a().size() == 2) {
                            c3508j = (C3508j) m36812h0.m40782a().get(1);
                        }
                        m36857r0.m69625c(c3508j2, c3508j, this.f39638z);
                        break;
                    }
                    break;
                case 15:
                    MediaStoreMediaSectionView m36861v0 = eVar.m36861v0();
                    if (m36861v0 != null) {
                        if (m36812h0 != null) {
                            c3503g0 = m36812h0.m40793l();
                        }
                        m36861v0.m69474b(c3503g0, !this.f39638z);
                        break;
                    }
                    break;
            }
            if (m36812h0 != null) {
                if (m36812h0.m40798q() == 15) {
                    z13 = false;
                    eVar.m36847D0(z13);
                }
            }
            if (m36812h0 != null) {
                if (m36812h0.m40798q() == 16) {
                    z13 = false;
                    eVar.m36847D0(z13);
                }
            }
            if (m36812h0 != null) {
                if (m36812h0.m40798q() == 13) {
                    z13 = false;
                    eVar.m36847D0(z13);
                }
            }
            if (m36812h0 != null) {
                if (m36812h0.m40798q() == 10) {
                    z13 = false;
                    eVar.m36847D0(z13);
                }
            }
            if (m36812h0 != null) {
            }
            eVar.m36847D0(z13);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: u0 */
    public void mo9991B(e eVar, int i11, List list) {
        MediaStoreMediaModulesView m36862w0;
        MediaStoreItemFileModuleView m36858s0;
        AbstractC19074t.m100208f(eVar, "holder");
        AbstractC19074t.m100208f(list, "payloads");
        try {
            if (!list.isEmpty()) {
                int mo10005m = mo10005m(i11);
                Boolean bool = null;
                MediaStoreItem mediaStoreItem = null;
                boolean z11 = false;
                if (mo10005m != 1) {
                    if (mo10005m != 2) {
                        if (mo10005m != 8) {
                            if (mo10005m == 9 && (m36858s0 = eVar.m36858s0()) != null) {
                                m36858s0.m69521B0(true);
                                return;
                            }
                            return;
                        }
                        MediaStoreItemLinkModuleView m36859t0 = eVar.m36859t0();
                        if (m36859t0 != null) {
                            m36859t0.m69564m0(true);
                            return;
                        }
                        return;
                    }
                    Object obj = list.get(0);
                    if (obj instanceof MediaStoreItem) {
                        mediaStoreItem = (MediaStoreItem) obj;
                    }
                    if (mediaStoreItem != null && (m36862w0 = eVar.m36862w0()) != null) {
                        m36862w0.m69586p0(mediaStoreItem, true);
                        return;
                    }
                    return;
                }
                Object obj2 = list.get(0);
                if (obj2 instanceof Boolean) {
                    bool = (Boolean) obj2;
                }
                if (bool != null) {
                    z11 = bool.booleanValue();
                }
                MediaStoreMediaHeaderView m36864y0 = eVar.m36864y0();
                if (m36864y0 != null) {
                    m36864y0.m69470a0(this.f39638z, z11);
                    return;
                }
                return;
            }
            super.mo9991B(eVar, i11, list);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: x0 */
    public e mo9992C(ViewGroup viewGroup, int i11) {
        View view;
        AbstractC19074t.m100208f(viewGroup, "parent");
        switch (i11) {
            case 1:
                MediaStoreMediaHeaderView mediaStoreMediaHeaderView = new MediaStoreMediaHeaderView(this.f39630r);
                mediaStoreMediaHeaderView.setUseTitle(this.f39616C);
                mediaStoreMediaHeaderView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                mediaStoreMediaHeaderView.setHeaderListener(new j());
                view = mediaStoreMediaHeaderView;
                break;
            case 2:
                MediaStoreMediaModulesView mediaStoreMediaModulesView = new MediaStoreMediaModulesView(this.f39630r, 3);
                mediaStoreMediaModulesView.setModuleViewItemListener(new k());
                view = mediaStoreMediaModulesView;
                break;
            case 3:
            case 4:
                View inflate = this.f39633u.inflate(AbstractC7409c0.layout_media_store_footer, viewGroup, false);
                AbstractC19074t.m100207e(inflate, "inflate(...)");
                view = inflate;
                break;
            case 5:
                View inflate2 = this.f39633u.inflate(AbstractC7409c0.layout_empty_media_store_state, viewGroup, false);
                AbstractC19074t.m100207e(inflate2, "inflate(...)");
                view = inflate2;
                break;
            case 6:
                View inflate3 = this.f39633u.inflate(AbstractC7409c0.media_store_item_year_divider, viewGroup, false);
                AbstractC19074t.m100207e(inflate3, "inflate(...)");
                view = inflate3;
                break;
            case 7:
                View inflate4 = this.f39633u.inflate(AbstractC7409c0.media_store_search_empty_layout, viewGroup, false);
                AbstractC19074t.m100207e(inflate4, "inflate(...)");
                view = inflate4;
                break;
            case 8:
                MediaStoreItemLinkModuleView mediaStoreItemLinkModuleView = new MediaStoreItemLinkModuleView(this.f39630r, this.f39638z);
                mediaStoreItemLinkModuleView.setLinkListener(new l());
                view = mediaStoreItemLinkModuleView;
                break;
            case 9:
                MediaStoreItemFileModuleView mediaStoreItemFileModuleView = new MediaStoreItemFileModuleView(this.f39630r, this.f39638z, false, 4, null);
                mediaStoreItemFileModuleView.setFileListener(new m());
                view = mediaStoreItemFileModuleView;
                break;
            case 10:
                RobotoTextView robotoTextView = new RobotoTextView(this.f39630r);
                robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                robotoTextView.setGravity(17);
                robotoTextView.setTextSize(1, 14.0f);
                robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC21196a.TextColor2));
                view = robotoTextView;
                break;
            case 11:
            case 13:
                View mediaStoreMediaSkeletonView = new MediaStoreMediaSkeletonView(this.f39630r);
                mediaStoreMediaSkeletonView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                view = mediaStoreMediaSkeletonView;
                break;
            case 12:
                View inflate5 = this.f39633u.inflate(AbstractC7409c0.layout_error_state, viewGroup, false);
                AbstractC19074t.m100207e(inflate5, "inflate(...)");
                view = inflate5;
                break;
            case 14:
                MediaStoreAlbumItemDualView mediaStoreAlbumItemDualView = new MediaStoreAlbumItemDualView(this.f39630r);
                mediaStoreAlbumItemDualView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                mediaStoreAlbumItemDualView.setListener(new n());
                view = mediaStoreAlbumItemDualView;
                break;
            case 15:
                MediaStoreMediaSectionView mediaStoreMediaSectionView = new MediaStoreMediaSectionView(this.f39630r);
                mediaStoreMediaSectionView.setSectionListener(this.f39624K);
                mediaStoreMediaSectionView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                view = mediaStoreMediaSectionView;
                break;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                View view2 = new View(this.f39630r);
                view2.setLayoutParams(new ViewGroup.LayoutParams(-1, AbstractC23136l9.m118742r(8.0f)));
                view2.setBackgroundColor(C23212s8.m119607o(this.f39630r, AbstractC16781w.SecondaryBackgroundColor));
                view = view2;
                break;
            default:
                View inflate6 = this.f39633u.inflate(AbstractC7409c0.feed_item_unsupport, viewGroup, false);
                AbstractC19074t.m100207e(inflate6, "inflate(...)");
                view = inflate6;
                break;
        }
        return new e(this, view, i11);
    }

    /* renamed from: y0 */
    public final void m36820y0() {
        this.f39626M = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: z */
    public void mo10018z(RecyclerView recyclerView) {
        AbstractC19074t.m100208f(recyclerView, "recyclerView");
        super.mo10018z(recyclerView);
        this.f39637y = recyclerView;
        recyclerView.addOnLayoutChangeListener(this.f39623J);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: z0 */
    public void mo9997H(e eVar) {
        AbstractC19074t.m100208f(eVar, "holder");
        super.mo9997H(eVar);
        MediaStoreMediaModulesView m36862w0 = eVar.m36862w0();
        if (m36862w0 != null) {
            m36862w0.m69585n0();
        }
        MediaStoreItemLinkModuleView m36859t0 = eVar.m36859t0();
        if (m36859t0 != null) {
            m36859t0.m69562e0();
        }
    }
}
