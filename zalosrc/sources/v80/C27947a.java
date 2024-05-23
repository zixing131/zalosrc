package v80;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import au.EnumC2369r;
import b90.C2665b;
import b90.C2666c;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.mediastore.common.MediaStoreItemYearDivider;
import com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView;
import com.zing.zalo.p077ui.mycloud.filetab.MyCloudFileItemView;
import com.zing.zalo.p077ui.mycloud.gridtab.ContactGridChatItemView;
import com.zing.zalo.p077ui.mycloud.gridtab.FileGridChatItemView;
import com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase;
import com.zing.zalo.p077ui.mycloud.gridtab.LinkGridChatItemView;
import com.zing.zalo.p077ui.mycloud.gridtab.LocationGridChatItemView;
import com.zing.zalo.p077ui.mycloud.gridtab.PhotoGridChatItemView;
import com.zing.zalo.p077ui.mycloud.gridtab.TextGridChatItemView;
import com.zing.zalo.p077ui.mycloud.gridtab.VideoGridChatItemView;
import com.zing.zalo.p077ui.mycloud.gridtab.VoiceGridChatItemView;
import com.zing.zalo.p077ui.mycloud.linktab.MyCloudLinkItemView;
import com.zing.zalo.p077ui.mycloud.mediatab.MyCloudMediaItemView;
import com.zing.zalo.p077ui.mycloud.mediatab.MyCloudMediaTabView;
import com.zing.zalo.p077ui.mycloud.model.MyCloudItem;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.p077ui.mycloud.textmsgtab.MyCloudTextItemView;
import com.zing.zalo.p077ui.mycloud.widget.HeaderItemView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zview.ZaloView;
import dj.C17945a0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.AbstractC19646n0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23211s7;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23250w4;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import p279jw.C21373a;
import p365nk.C23805a;
import p542ub.InterfaceC27218a;
import p716zh.C31950hc;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25378x;
import u80.InterfaceC27158o2;
import v80.C27947a;

/* renamed from: v80.a */
/* loaded from: classes6.dex */
public final class C27947a extends RecyclerView.AbstractC1880g {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private boolean f130266A;

    /* renamed from: B */
    private boolean f130267B;

    /* renamed from: C */
    private boolean f130268C;

    /* renamed from: D */
    private ZaloView f130269D;

    /* renamed from: E */
    private int f130270E;

    /* renamed from: F */
    private int f130271F;

    /* renamed from: G */
    private int f130272G;

    /* renamed from: H */
    private int f130273H;

    /* renamed from: I */
    private Spanned f130274I;

    /* renamed from: r */
    private final C23805a.d f130275r;

    /* renamed from: s */
    private C23805a.e f130276s;

    /* renamed from: t */
    private final InterfaceC24854k f130277t;

    /* renamed from: u */
    private final InterfaceC24854k f130278u;

    /* renamed from: v */
    private final SparseIntArray f130279v;

    /* renamed from: w */
    private SparseArray f130280w;

    /* renamed from: x */
    private BaseMyCloudTabView.AbstractC12510b f130281x;

    /* renamed from: y */
    private InterfaceC27158o2 f130282y;

    /* renamed from: z */
    private int f130283z;

    /* renamed from: v80.a$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: v80.a$b */
    /* loaded from: classes6.dex */
    public static final class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private int f130284I;

        /* renamed from: J */
        private GridChatItemViewBase f130285J;

        /* renamed from: K */
        private HeaderItemView f130286K;

        /* renamed from: L */
        private MyCloudTextItemView f130287L;

        /* renamed from: M */
        private MyCloudMediaItemView f130288M;

        /* renamed from: N */
        private MyCloudFileItemView f130289N;

        /* renamed from: O */
        private MyCloudLinkItemView f130290O;

        /* renamed from: P */
        private AppCompatImageView f130291P;

        /* renamed from: Q */
        private RobotoTextView f130292Q;

        /* renamed from: R */
        private RecyclingImageView f130293R;

        /* renamed from: S */
        private RobotoTextView f130294S;

        /* renamed from: T */
        private RobotoTextView f130295T;

        /* renamed from: U */
        private RobotoTextView f130296U;

        /* renamed from: V */
        private TextView f130297V;

        /* renamed from: W */
        private MediaStoreItemYearDivider f130298W;

        /* renamed from: v80.a$b$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f130299a;

            static {
                int[] iArr = new int[C23805a.d.values().length];
                try {
                    iArr[C23805a.d.f115057q.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[C23805a.d.f115058r.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[C23805a.d.f115056p.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[C23805a.d.f115060t.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[C23805a.d.f115059s.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f130299a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view, int i11) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            this.f130284I = i11;
            switch (i11) {
                case 2:
                    this.f130286K = (HeaderItemView) view;
                    return;
                case 3:
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 11:
                    this.f130285J = (GridChatItemViewBase) view;
                    return;
                case 7:
                    this.f130287L = view instanceof MyCloudTextItemView ? (MyCloudTextItemView) view : null;
                    return;
                case 12:
                    this.f130293R = (RecyclingImageView) view.findViewById(AbstractC6918a0.imvEmpty);
                    this.f130292Q = (RobotoTextView) view.findViewById(AbstractC6918a0.tvEmpty);
                    this.f130294S = (RobotoTextView) view.findViewById(AbstractC6918a0.tvEmptyMedium);
                    this.f130295T = (RobotoTextView) view.findViewById(AbstractC6918a0.tvEmptyDesc);
                    this.f130296U = (RobotoTextView) view.findViewById(AbstractC6918a0.btn_go_to_my_cloud);
                    return;
                case 13:
                    this.f130291P = (AppCompatImageView) view.findViewById(AbstractC6918a0.icn_search_error);
                    this.f130292Q = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_search_error);
                    return;
                case 14:
                    this.f130297V = (TextView) view;
                    return;
                case 15:
                    this.f130288M = view instanceof MyCloudMediaItemView ? (MyCloudMediaItemView) view : null;
                    return;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    this.f130289N = view instanceof MyCloudFileItemView ? (MyCloudFileItemView) view : null;
                    return;
                case 17:
                    this.f130290O = view instanceof MyCloudLinkItemView ? (MyCloudLinkItemView) view : null;
                    return;
                case 18:
                    MediaStoreItemYearDivider mediaStoreItemYearDivider = (MediaStoreItemYearDivider) view.findViewById(AbstractC6918a0.mediaStoreItemYearDivider);
                    this.f130298W = mediaStoreItemYearDivider;
                    if (mediaStoreItemYearDivider != null) {
                        mediaStoreItemYearDivider.m69464a();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }

        /* renamed from: k0 */
        public static final void m140856k0(ZaloView zaloView, View view) {
            InterfaceC27218a interfaceC27218a;
            if (zaloView != null) {
                interfaceC27218a = zaloView.m92676n2();
            } else {
                interfaceC27218a = null;
            }
            AbstractC23211s7.m119572e("204278670", interfaceC27218a, "csc_attach_mycloud");
        }

        /* renamed from: r0 */
        private final int m140857r0(C23805a.d dVar) {
            int i11 = a.f130299a[dVar.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                return AbstractC16803z.empty_file;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        return AbstractC16803z.empty_link;
                    }
                    return AbstractC16803z.illus_empty_photos;
                }
                if (C23212s8.m119603k()) {
                    return AbstractC16803z.ic_illus_text_msg_light;
                }
                return AbstractC16803z.ic_illus_text_msg_dark;
            }
            if (C23212s8.m119603k()) {
                return AbstractC16803z.ic_illus_all_msg_light;
            }
            return AbstractC16803z.ic_illus_all_msg_dark;
        }

        /* renamed from: s0 */
        private final String m140858s0(C23805a.d dVar) {
            int i11 = a.f130299a[dVar.ordinal()];
            if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        return "";
                    }
                    String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_no_file_yet_desc, C21373a.f104231a.m110805u());
                    AbstractC19074t.m100207e(m118746s0, "getString(...)");
                    return m118746s0;
                }
                String m118746s02 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_no_link_yet_desc, C21373a.f104231a.m110805u());
                AbstractC19074t.m100207e(m118746s02, "getString(...)");
                return m118746s02;
            }
            String m118746s03 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_no_photo_yet_desc, C21373a.f104231a.m110805u());
            AbstractC19074t.m100207e(m118746s03, "getString(...)");
            return m118746s03;
        }

        /* renamed from: t0 */
        private final int m140859t0(C23805a.d dVar) {
            int i11 = a.f130299a[dVar.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                return AbstractC8020f0.str_empty_stored_media_sendtome_file_2;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        return AbstractC8020f0.str_empty_stored_media_sendtome_link_2;
                    }
                    return AbstractC8020f0.str_empty_stored_media_sendtome_media_2;
                }
                return AbstractC8020f0.str_empty_my_cloud_text_msg_tab;
            }
            return AbstractC8020f0.str_empty_my_cloud_grid_tab;
        }

        /* renamed from: w0 */
        private final boolean m140860w0(MyCloudItem myCloudItem) {
            if (myCloudItem == null || myCloudItem.m71021e() == -100 || myCloudItem.m71021e() == -700) {
                return false;
            }
            return true;
        }

        /* renamed from: x0 */
        private final boolean m140861x0(MyCloudItem myCloudItem) {
            if (myCloudItem == null || myCloudItem.m71021e() != -100) {
                return false;
            }
            return true;
        }

        /* renamed from: j0 */
        public final void m140862j0(MyCloudItem myCloudItem, BaseMyCloudTabView.AbstractC12510b abstractC12510b, InterfaceC27158o2 interfaceC27158o2, boolean z11, boolean z12, int i11, int i12, int i13, int i14, C23805a.d dVar, MyCloudItem myCloudItem2, boolean z13, ZaloView zaloView) {
            GridChatItemViewBase gridChatItemViewBase;
            Context context;
            int i15;
            AbstractC19074t.m100208f(myCloudItem, "data");
            AbstractC19074t.m100208f(dVar, "dataMode");
            switch (this.f130284I) {
                case 2:
                    HeaderItemView headerItemView = this.f130286K;
                    if (headerItemView != null) {
                        headerItemView.m71072Y(myCloudItem, z11);
                    }
                    HeaderItemView headerItemView2 = this.f130286K;
                    if (headerItemView2 == null) {
                        return;
                    }
                    headerItemView2.setSelectEventListener(interfaceC27158o2);
                    return;
                case 3:
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 11:
                    GridChatItemViewBase gridChatItemViewBase2 = this.f130285J;
                    if (gridChatItemViewBase2 != null) {
                        gridChatItemViewBase2.setDelegate(abstractC12510b);
                    }
                    GridChatItemViewBase gridChatItemViewBase3 = this.f130285J;
                    if (gridChatItemViewBase3 != null) {
                        gridChatItemViewBase3.setSelectEventListener(interfaceC27158o2);
                    }
                    GridChatItemViewBase gridChatItemViewBase4 = this.f130285J;
                    if (gridChatItemViewBase4 != null) {
                        gridChatItemViewBase4.setEnableMultiSelection(z11);
                    }
                    if (!(myCloudItem instanceof MyCloudMessageItem) || (gridChatItemViewBase = this.f130285J) == null) {
                        return;
                    }
                    gridChatItemViewBase.mo70893x0((MyCloudMessageItem) myCloudItem, m9929A(), i11, i12);
                    return;
                case 7:
                    MyCloudTextItemView myCloudTextItemView = this.f130287L;
                    if (myCloudTextItemView != null) {
                        myCloudTextItemView.m71066k0(myCloudItem, m9929A(), z11);
                        return;
                    }
                    return;
                case 12:
                    RecyclingImageView recyclingImageView = this.f130293R;
                    if (recyclingImageView != null) {
                        recyclingImageView.setImageDrawable(AbstractC23136l9.m118665N(this.f7784p.getContext(), m140857r0(dVar)));
                    }
                    if (z13) {
                        RobotoTextView robotoTextView = this.f130292Q;
                        if (robotoTextView != null) {
                            robotoTextView.setVisibility(8);
                        }
                        RobotoTextView robotoTextView2 = this.f130294S;
                        if (robotoTextView2 != null) {
                            robotoTextView2.setVisibility(0);
                        }
                        RobotoTextView robotoTextView3 = this.f130295T;
                        if (robotoTextView3 != null) {
                            robotoTextView3.setVisibility(0);
                        }
                        RobotoTextView robotoTextView4 = this.f130294S;
                        if (robotoTextView4 != null) {
                            robotoTextView4.setText(this.f7784p.getContext().getString(m140859t0(dVar)));
                        }
                        RobotoTextView robotoTextView5 = this.f130295T;
                        if (robotoTextView5 != null) {
                            robotoTextView5.setText(m140858s0(dVar));
                        }
                        RobotoTextView robotoTextView6 = this.f130296U;
                        if (robotoTextView6 != null) {
                            robotoTextView6.setVisibility(0);
                        }
                        RobotoTextView robotoTextView7 = this.f130296U;
                        if (robotoTextView7 != null) {
                            robotoTextView7.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_go_to_my_cloud, C21373a.f104231a.m110805u()));
                        }
                    } else {
                        RobotoTextView robotoTextView8 = this.f130292Q;
                        if (robotoTextView8 != null) {
                            robotoTextView8.setVisibility(0);
                        }
                        RobotoTextView robotoTextView9 = this.f130294S;
                        if (robotoTextView9 != null) {
                            robotoTextView9.setVisibility(8);
                        }
                        RobotoTextView robotoTextView10 = this.f130295T;
                        if (robotoTextView10 != null) {
                            robotoTextView10.setVisibility(8);
                        }
                        RobotoTextView robotoTextView11 = this.f130292Q;
                        if (robotoTextView11 != null) {
                            robotoTextView11.setText(this.f7784p.getContext().getString(m140859t0(dVar)));
                        }
                    }
                    RobotoTextView robotoTextView12 = this.f130296U;
                    if (robotoTextView12 != null) {
                        robotoTextView12.setOnClickListener(new View.OnClickListener() { // from class: v80.b
                            public /* synthetic */ ViewOnClickListenerC27948b() {
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C27947a.b.m140856k0(ZaloView.this, view);
                            }
                        });
                        return;
                    }
                    return;
                case 13:
                    if (C23212s8.m119603k()) {
                        context = this.f7784p.getContext();
                        i15 = AbstractC16803z.ic_illus_search_light;
                    } else {
                        context = this.f7784p.getContext();
                        i15 = AbstractC16803z.ic_illus_search_dark;
                    }
                    Drawable m118665N = AbstractC23136l9.m118665N(context, i15);
                    AppCompatImageView appCompatImageView = this.f130291P;
                    if (appCompatImageView != null) {
                        appCompatImageView.setImageDrawable(m118665N);
                    }
                    RobotoTextView robotoTextView13 = this.f130292Q;
                    if (robotoTextView13 == null) {
                        return;
                    }
                    robotoTextView13.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no_results_search_my_cloud_title));
                    return;
                case 14:
                default:
                    return;
                case 15:
                    MyCloudMediaItemView myCloudMediaItemView = this.f130288M;
                    if (myCloudMediaItemView != null) {
                        myCloudMediaItemView.setDelegate(abstractC12510b);
                        myCloudMediaItemView.setSelectEventListener(interfaceC27158o2);
                        myCloudMediaItemView.setEnableMultiSelection(z11);
                        if (myCloudItem instanceof MyCloudMessageItem) {
                            myCloudMediaItemView.m71007h0((MyCloudMessageItem) myCloudItem, m9929A(), i13, i14);
                            return;
                        }
                        return;
                    }
                    return;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    MyCloudFileItemView myCloudFileItemView = this.f130289N;
                    if (myCloudFileItemView != null) {
                        myCloudFileItemView.setDelegate(abstractC12510b);
                        myCloudFileItemView.setSelectEventListener(interfaceC27158o2);
                        if (myCloudItem instanceof MyCloudMessageItem) {
                            myCloudFileItemView.m70803m0((MyCloudMessageItem) myCloudItem, m9929A(), z11);
                        }
                        myCloudFileItemView.m70802N0(m140860w0(myCloudItem2), m140861x0(myCloudItem2));
                        return;
                    }
                    return;
                case 17:
                    MyCloudLinkItemView myCloudLinkItemView = this.f130290O;
                    if (myCloudLinkItemView != null) {
                        myCloudLinkItemView.setDelegate(abstractC12510b);
                        myCloudLinkItemView.setSelectEventListener(interfaceC27158o2);
                        if (myCloudItem instanceof MyCloudMessageItem) {
                            myCloudLinkItemView.m70986d0((MyCloudMessageItem) myCloudItem, m9929A(), z11, z12);
                        }
                        myCloudLinkItemView.m70987s0(m140860w0(myCloudItem2), m140861x0(myCloudItem2));
                        return;
                    }
                    return;
                case 18:
                    MediaStoreItemYearDivider mediaStoreItemYearDivider = this.f130298W;
                    if (mediaStoreItemYearDivider != null) {
                        mediaStoreItemYearDivider.setYearData(myCloudItem.m71020d());
                        return;
                    }
                    return;
            }
        }

        /* renamed from: l0 */
        public final MyCloudFileItemView m140863l0() {
            return this.f130289N;
        }

        /* renamed from: m0 */
        public final GridChatItemViewBase m140864m0() {
            return this.f130285J;
        }

        /* renamed from: n0 */
        public final HeaderItemView m140865n0() {
            return this.f130286K;
        }

        /* renamed from: o0 */
        public final MyCloudLinkItemView m140866o0() {
            return this.f130290O;
        }

        /* renamed from: p0 */
        public final TextView m140867p0() {
            return this.f130297V;
        }

        /* renamed from: q0 */
        public final MyCloudMediaItemView m140868q0() {
            return this.f130288M;
        }

        /* renamed from: u0 */
        public final MyCloudTextItemView m140869u0() {
            return this.f130287L;
        }

        /* renamed from: v0 */
        public final int m140870v0() {
            return this.f130284I;
        }
    }

    /* renamed from: v80.a$c */
    /* loaded from: classes6.dex */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f130300a;

        static {
            int[] iArr = new int[C23805a.d.values().length];
            try {
                iArr[C23805a.d.f115058r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C23805a.d.f115060t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f130300a = iArr;
        }
    }

    /* renamed from: v80.a$d */
    /* loaded from: classes6.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final d f130301q = new d();

        d() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(MyCloudItem myCloudItem) {
            boolean z11;
            AbstractC19074t.m100208f(myCloudItem, "it");
            if (myCloudItem.m71021e() != -400 && myCloudItem.m71021e() != -300) {
                z11 = false;
            } else {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v80.a$e */
    /* loaded from: classes6.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f130302q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C2665b mo12V4() {
            return new C2665b(0, false, null, 7, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v80.a$f */
    /* loaded from: classes6.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final f f130303q = new f();

        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final List mo12V4() {
            return new ArrayList();
        }
    }

    public C27947a(Context context, boolean z11, C23805a.d dVar, C23805a.e eVar) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        int m116580c;
        AbstractC19074t.m100208f(dVar, "dataMode");
        AbstractC19074t.m100208f(eVar, "viewMode");
        this.f130275r = dVar;
        this.f130276s = eVar;
        m129210a = AbstractC24856m.m129210a(e.f130302q);
        this.f130277t = m129210a;
        m129210a2 = AbstractC24856m.m129210a(f.f130303q);
        this.f130278u = m129210a2;
        this.f130279v = new SparseIntArray();
        this.f130280w = new SparseArray();
        int m118728m0 = ((AbstractC23136l9.m118728m0(context, z11) - (AbstractC23136l9.m118655I(AbstractC16802y.margin_grid_chat_view) * 2)) - AbstractC23136l9.m118655I(AbstractC16802y.item_space_grid_chat_view)) / 2;
        this.f130270E = m118728m0;
        m116580c = AbstractC22543l.m116580c(AbstractC23222t7.f112519D0, m118728m0);
        this.f130271F = m116580c;
        int m118728m02 = (AbstractC23136l9.m118728m0(context, z11) - (MyCloudMediaTabView.Companion.m71018a() * 2)) / 3;
        this.f130272G = m118728m02;
        this.f130273H = m118728m02;
    }

    /* renamed from: M */
    private final void m140829M() {
        synchronized (m140833N()) {
            C23250w4 c23250w4 = C23250w4.f112644a;
            int m13089h = m140833N().m13089h();
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_desc_item_footer_tab_grid_chat_view);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            this.f130274I = c23250w4.m119847w(m13089h, m118743r0);
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: P */
    private final int m140830P() {
        return this.f130283z == 0 ? 0 : 1;
    }

    /* renamed from: X */
    private final boolean m140831X(long j11, long j12) {
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar.setTimeInMillis(j11);
            calendar2.setTimeInMillis(j12);
            if (calendar.get(1) == calendar2.get(1)) {
                return true;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return true;
        }
    }

    /* renamed from: L */
    public final void m140832L(C17945a0 c17945a0) {
        boolean m131542D;
        int i11;
        MyCloudItem myCloudItem;
        int m131209i0;
        int m116580c;
        AbstractC19074t.m100208f(c17945a0, "item");
        synchronized (m140833N()) {
            try {
                List<MyCloudItem> m140836R = m140836R();
                if (!(m140836R instanceof Collection) || !m140836R.isEmpty()) {
                    for (MyCloudItem myCloudItem2 : m140836R) {
                        if ((myCloudItem2 instanceof MyCloudMessageItem) && ((MyCloudMessageItem) myCloudItem2).m71033m().m95135f9(c17945a0.m95029V3())) {
                            return;
                        }
                    }
                }
                m131542D = AbstractC25378x.m131542D(m140836R(), d.f130301q);
                if (m131542D) {
                    m10017y(m140830P());
                }
                MyCloudMessageItem myCloudMessageItem = new MyCloudMessageItem(c17945a0);
                myCloudMessageItem.m71024h(AbstractC23160o0.m119182A0(c17945a0.m95313z4()));
                int i12 = 0;
                if (!m140833N().m13088g().containsKey(Long.valueOf(myCloudMessageItem.m71020d()))) {
                    C2666c c2666c = new C2666c(null, 0L, null, 7, null);
                    c2666c.m13101f(C23250w4.m119785D(myCloudMessageItem.m71020d(), EnumC2369r.f9911q, true));
                    c2666c.m13102g(myCloudMessageItem.m71020d());
                    m140833N().m13088g().put(Long.valueOf(myCloudMessageItem.m71020d()), c2666c);
                    if (m140836R().size() > m140830P()) {
                        MyCloudItem myCloudItem3 = (MyCloudItem) m140836R().get(m140830P());
                        C23805a.d dVar = this.f130275r;
                        if ((dVar == C23805a.d.f115056p || dVar == C23805a.d.f115059s || dVar == C23805a.d.f115060t) && !m140831X(myCloudItem3.m71020d(), c2666c.m13100e())) {
                            List m140836R2 = m140836R();
                            int m140830P = m140830P();
                            MyCloudItem myCloudItem4 = new MyCloudItem(-700);
                            myCloudItem4.m71024h(myCloudItem3.m71020d());
                            C24848g0 c24848g0 = C24848g0.f119245a;
                            m140836R2.add(m140830P, myCloudItem4);
                        }
                    }
                    m140836R().add(m140830P(), c2666c.m13099d());
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                C2666c c2666c2 = (C2666c) m140833N().m13088g().get(Long.valueOf(myCloudMessageItem.m71020d()));
                if (c2666c2 != null) {
                    c2666c2.m13096a(myCloudMessageItem);
                }
                List m140836R3 = m140836R();
                C2666c c2666c3 = (C2666c) m140833N().m13088g().get(Long.valueOf(myCloudMessageItem.m71020d()));
                if (c2666c3 != null) {
                    myCloudItem = c2666c3.m13099d();
                } else {
                    myCloudItem = null;
                }
                m131209i0 = AbstractC25332a0.m131209i0(m140836R3, myCloudItem);
                m116580c = AbstractC22543l.m116580c(m131209i0, m140830P());
                int i13 = m116580c + 1;
                m140836R().add(i13, myCloudMessageItem);
                if (i11 == 0) {
                    i12 = i13;
                } else {
                    m10009q(m116580c);
                }
                m10015w(i12, i11 + 1);
                m140829M();
                List m140836R4 = m140836R();
                if (!(m140836R4 instanceof Collection) || !m140836R4.isEmpty()) {
                    Iterator it = m140836R4.iterator();
                    while (it.hasNext()) {
                        if (((MyCloudItem) it.next()).m71021e() == -600) {
                            m10009q(m140836R().size() - 1);
                            C24848g0 c24848g02 = C24848g0.f119245a;
                            break;
                        }
                    }
                }
                m140836R().add(new MyCloudItem(-600));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: N */
    public final C2665b m140833N() {
        return (C2665b) this.f130277t.getValue();
    }

    /* renamed from: O */
    public final boolean m140834O() {
        return this.f130266A;
    }

    /* renamed from: Q */
    public final MyCloudItem m140835Q(int i11) {
        if (i11 >= 0 && i11 < m140836R().size()) {
            return (MyCloudItem) m140836R().get(i11);
        }
        return null;
    }

    /* renamed from: R */
    public final List m140836R() {
        return (List) this.f130278u.getValue();
    }

    /* renamed from: S */
    public final ArrayList m140837S() {
        ArrayList arrayList = new ArrayList();
        try {
            this.f130279v.clear();
            this.f130280w.clear();
            int size = m140836R().size();
            for (int i11 = 0; i11 < size; i11++) {
                MyCloudItem myCloudItem = (MyCloudItem) m140836R().get(i11);
                if (myCloudItem instanceof MyCloudMessageItem) {
                    if (!((MyCloudMessageItem) myCloudItem).m71033m().m94871D7() && !((MyCloudMessageItem) myCloudItem).m71033m().m95306y8() && !((MyCloudMessageItem) myCloudItem).m71033m().m95120e6() && !((MyCloudMessageItem) myCloudItem).m71033m().m94890F7()) {
                    }
                    ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
                    itemAlbumMobile.m40515Z(((MyCloudMessageItem) myCloudItem).m71033m());
                    if (!TextUtils.isEmpty(itemAlbumMobile.f42607x) || !TextUtils.isEmpty(itemAlbumMobile.f42609y)) {
                        arrayList.add(itemAlbumMobile);
                        this.f130279v.append(arrayList.size() - 1, i11);
                        this.f130280w.append(arrayList.size() - 1, ((MyCloudMessageItem) myCloudItem).m71033m().m95029V3());
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return arrayList;
    }

    /* renamed from: T */
    public final SparseIntArray m140838T() {
        return this.f130279v;
    }

    /* renamed from: U */
    public final SparseArray m140839U() {
        return this.f130280w;
    }

    /* renamed from: V */
    public final boolean m140840V() {
        synchronized (m140833N()) {
            try {
                if (m140833N().m13088g().isEmpty()) {
                    return true;
                }
                if (C31950hc.f146830a.m153634E()) {
                    Iterator it = m140833N().m13088g().values().iterator();
                    int i11 = 0;
                    while (it.hasNext()) {
                        i11 += ((C2666c) it.next()).m13098c().size();
                    }
                    if (i11 != C31950hc.f146830a.m153643v()) {
                        return false;
                    }
                } else {
                    Iterator it2 = m140833N().m13088g().values().iterator();
                    while (it2.hasNext()) {
                        if (!((C2666c) it2.next()).m13098c().isEmpty()) {
                            return false;
                        }
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: W */
    public final boolean m140841W() {
        return this.f130267B;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Y */
    public void mo9990A(b bVar, int i11) {
        int i12;
        AbstractC19074t.m100208f(bVar, "holder");
        int m140870v0 = bVar.m140870v0();
        if (m140870v0 != 1) {
            if (m140870v0 != 14) {
                bVar.m140862j0((MyCloudItem) m140836R().get(i11), this.f130281x, this.f130282y, this.f130266A, this.f130267B, this.f130270E, this.f130271F, this.f130272G, this.f130273H, this.f130275r, m140835Q(i11 + 1), this.f130268C, this.f130269D);
                return;
            }
            TextView m140867p0 = bVar.m140867p0();
            if (m140867p0 != null) {
                m140867p0.setText(this.f130274I);
                if (this.f130266A) {
                    i12 = 0;
                } else {
                    i12 = 62;
                }
                m140867p0.setPadding(32, 16, 32, AbstractC23136l9.m118742r(i12));
                return;
            }
            return;
        }
        if (this.f130283z != 0) {
            bVar.f7784p.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f130283z));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Z */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        View view;
        RecyclerView.LayoutParams layoutParams;
        AbstractC19074t.m100208f(viewGroup, "parent");
        switch (i11) {
            case 0:
                view = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.layout_media_store_footer, viewGroup, false);
                break;
            case 1:
                view = new LinearLayout(viewGroup.getContext());
                break;
            case 2:
                Context context = viewGroup.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                view = new HeaderItemView(context);
                break;
            case 3:
                Context context2 = viewGroup.getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                view = new VideoGridChatItemView(context2);
                break;
            case 4:
                Context context3 = viewGroup.getContext();
                AbstractC19074t.m100207e(context3, "getContext(...)");
                view = new LinkGridChatItemView(context3);
                break;
            case 5:
                Context context4 = viewGroup.getContext();
                AbstractC19074t.m100207e(context4, "getContext(...)");
                view = new FileGridChatItemView(context4);
                break;
            case 6:
                view = new TextGridChatItemView(viewGroup.getContext());
                break;
            case 7:
                MyCloudTextItemView myCloudTextItemView = new MyCloudTextItemView(viewGroup.getContext());
                myCloudTextItemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                myCloudTextItemView.setDelegate(this.f130281x);
                myCloudTextItemView.setSelectEventListener(this.f130282y);
                view = myCloudTextItemView;
                break;
            case 8:
                view = new LocationGridChatItemView(viewGroup.getContext());
                break;
            case 9:
                view = new VoiceGridChatItemView(viewGroup.getContext());
                break;
            case 10:
                view = new ContactGridChatItemView(viewGroup.getContext());
                break;
            case 11:
                Context context5 = viewGroup.getContext();
                AbstractC19074t.m100207e(context5, "getContext(...)");
                view = new PhotoGridChatItemView(context5);
                break;
            case 12:
                view = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.layout_empty_media_store_state, viewGroup, false);
                break;
            case 13:
                view = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.media_store_search_empty_layout, viewGroup, false);
                break;
            case 14:
                Context context6 = viewGroup.getContext();
                AbstractC19074t.m100207e(context6, "getContext(...)");
                RobotoTextView robotoTextView = new RobotoTextView(context6);
                robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                robotoTextView.setGravity(17);
                robotoTextView.setTextSize(1, 14.0f);
                robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC21196a.TextColor2));
                view = robotoTextView;
                break;
            case 15:
                Context context7 = viewGroup.getContext();
                AbstractC19074t.m100207e(context7, "getContext(...)");
                view = new MyCloudMediaItemView(context7);
                break;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                Context context8 = viewGroup.getContext();
                AbstractC19074t.m100207e(context8, "getContext(...)");
                view = new MyCloudFileItemView(context8, this.f130266A, false, 4, null);
                break;
            case 17:
                Context context9 = viewGroup.getContext();
                AbstractC19074t.m100207e(context9, "getContext(...)");
                view = new MyCloudLinkItemView(context9, this.f130266A);
                break;
            case 18:
                view = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.media_store_item_year_divider, viewGroup, false);
                break;
            default:
                view = new View(viewGroup.getContext());
                break;
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2 && i11 != 18) {
                    switch (i11) {
                        case 12:
                        case 13:
                            view.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                            break;
                        case 14:
                            break;
                        default:
                            if (this.f130275r == C23805a.d.f115057q) {
                                layoutParams = new RecyclerView.LayoutParams(this.f130270E, this.f130271F);
                            } else {
                                layoutParams = new RecyclerView.LayoutParams(-1, -2);
                            }
                            view.setLayoutParams(layoutParams);
                            break;
                    }
                }
            } else {
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f130283z));
            }
            AbstractC19074t.m100205c(view);
            return new b(view, i11);
        }
        view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        AbstractC19074t.m100205c(view);
        return new b(view, i11);
    }

    /* renamed from: a0 */
    public final void m140844a0(MessageId messageId) {
        MyCloudMessageItem myCloudMessageItem;
        C17945a0 m71033m;
        AbstractC19074t.m100208f(messageId, "messageId");
        try {
            Iterator it = m140836R().iterator();
            int i11 = 0;
            while (true) {
                if (it.hasNext()) {
                    MyCloudItem myCloudItem = (MyCloudItem) it.next();
                    if (myCloudItem instanceof MyCloudMessageItem) {
                        myCloudMessageItem = (MyCloudMessageItem) myCloudItem;
                    } else {
                        myCloudMessageItem = null;
                    }
                    if (myCloudMessageItem != null && (m71033m = myCloudMessageItem.m71033m()) != null && m71033m.m95135f9(messageId)) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                m10009q(i11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x002e, code lost:            if (r12.f130275r == p365nk.C23805a.d.f115057q) goto L107;     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x000a, B:8:0x001e, B:11:0x0030, B:12:0x003e, B:13:0x0059, B:15:0x005f, B:18:0x007d, B:20:0x008a, B:21:0x0098, B:23:0x009e, B:26:0x00a6, B:29:0x00b4, B:35:0x00b8, B:37:0x00c1, B:39:0x00c7, B:45:0x00d4, B:47:0x00da, B:49:0x00de, B:51:0x00e2, B:54:0x00ee, B:56:0x0105, B:57:0x0110, B:59:0x0116, B:60:0x012b, B:63:0x011e, B:66:0x0131, B:68:0x013b, B:73:0x014a, B:76:0x0152, B:77:0x0161, B:78:0x0170, B:79:0x0026, B:81:0x002a), top: B:5:0x000a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013b A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x000a, B:8:0x001e, B:11:0x0030, B:12:0x003e, B:13:0x0059, B:15:0x005f, B:18:0x007d, B:20:0x008a, B:21:0x0098, B:23:0x009e, B:26:0x00a6, B:29:0x00b4, B:35:0x00b8, B:37:0x00c1, B:39:0x00c7, B:45:0x00d4, B:47:0x00da, B:49:0x00de, B:51:0x00e2, B:54:0x00ee, B:56:0x0105, B:57:0x0110, B:59:0x0116, B:60:0x012b, B:63:0x011e, B:66:0x0131, B:68:0x013b, B:73:0x014a, B:76:0x0152, B:77:0x0161, B:78:0x0170, B:79:0x0026, B:81:0x002a), top: B:5:0x000a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014a A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x000a, B:8:0x001e, B:11:0x0030, B:12:0x003e, B:13:0x0059, B:15:0x005f, B:18:0x007d, B:20:0x008a, B:21:0x0098, B:23:0x009e, B:26:0x00a6, B:29:0x00b4, B:35:0x00b8, B:37:0x00c1, B:39:0x00c7, B:45:0x00d4, B:47:0x00da, B:49:0x00de, B:51:0x00e2, B:54:0x00ee, B:56:0x0105, B:57:0x0110, B:59:0x0116, B:60:0x012b, B:63:0x011e, B:66:0x0131, B:68:0x013b, B:73:0x014a, B:76:0x0152, B:77:0x0161, B:78:0x0170, B:79:0x0026, B:81:0x002a), top: B:5:0x000a, outer: #1 }] */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m140845b0(C2665b c2665b, boolean z11) {
        List m131176D0;
        Iterator it;
        C23805a.d dVar;
        AbstractC19074t.m100208f(c2665b, "inputData");
        try {
            synchronized (m140833N()) {
                try {
                    m140833N().m13084c(c2665b);
                    m140836R().clear();
                    C23805a.e eVar = this.f130276s;
                    if (eVar == C23805a.e.f115064q) {
                        if (this.f130283z <= 0) {
                        }
                        m140836R().add(new MyCloudItem(-500));
                        m131176D0 = AbstractC25332a0.m131176D0(m140833N().m13088g().keySet());
                        it = m131176D0.iterator();
                        long j11 = 0;
                        while (it.hasNext()) {
                            C2666c c2666c = (C2666c) m140833N().m13088g().get(Long.valueOf(((Number) it.next()).longValue()));
                            if (c2666c != null) {
                                ArrayList arrayList = new ArrayList();
                                C31950hc c31950hc = C31950hc.f146830a;
                                if (c31950hc.m153634E()) {
                                    List m153642t = c31950hc.m153642t();
                                    for (MyCloudMessageItem myCloudMessageItem : c2666c.m13098c()) {
                                        if (m153642t != null && !m153642t.contains(myCloudMessageItem.m71033m().m95029V3())) {
                                            arrayList.add(myCloudMessageItem);
                                        }
                                    }
                                }
                                C31950hc c31950hc2 = C31950hc.f146830a;
                                boolean z12 = true;
                                if (c31950hc2.m153634E() && (!c31950hc2.m153634E() || !(!arrayList.isEmpty()))) {
                                    z12 = false;
                                }
                                if (j11 != 0 && (((dVar = this.f130275r) == C23805a.d.f115056p || dVar == C23805a.d.f115059s || dVar == C23805a.d.f115060t) && !m140831X(j11, c2666c.m13100e()) && z12)) {
                                    List m140836R = m140836R();
                                    MyCloudItem myCloudItem = new MyCloudItem(-700);
                                    myCloudItem.m71024h(c2666c.m13100e());
                                    m140836R.add(myCloudItem);
                                }
                                if (z12) {
                                    m140836R().add(c2666c.m13099d());
                                }
                                if (c31950hc2.m153634E()) {
                                    m140836R().addAll(arrayList);
                                } else {
                                    m140836R().addAll(c2666c.m13098c());
                                }
                                j11 = c2666c.m13100e();
                            }
                        }
                        if (!m140833N().m13085d()) {
                            m140836R().add(new MyCloudItem(-200));
                        } else if (m140840V()) {
                            if (z11) {
                                m140836R().add(new MyCloudItem(-400));
                            } else {
                                m140836R().add(new MyCloudItem(-300));
                            }
                        } else {
                            m140829M();
                            m140836R().add(new MyCloudItem(-600));
                        }
                    }
                    if (eVar == C23805a.e.f115063p) {
                    }
                    m131176D0 = AbstractC25332a0.m131176D0(m140833N().m13088g().keySet());
                    it = m131176D0.iterator();
                    long j112 = 0;
                    while (it.hasNext()) {
                    }
                    if (!m140833N().m13085d()) {
                    }
                } finally {
                }
            }
            m10008p();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: c0 */
    public final void m140846c0(BaseMyCloudTabView.AbstractC12510b abstractC12510b) {
        this.f130281x = abstractC12510b;
    }

    /* renamed from: d0 */
    public final void m140847d0(boolean z11) {
        this.f130266A = z11;
    }

    /* renamed from: e0 */
    public final void m140848e0(int i11) {
        this.f130283z = i11;
    }

    /* renamed from: f0 */
    public final void m140849f0(boolean z11) {
        this.f130268C = z11;
    }

    /* renamed from: g0 */
    public final void m140850g0(boolean z11) {
        this.f130267B = z11;
    }

    /* renamed from: h0 */
    public final void m140851h0(InterfaceC27158o2 interfaceC27158o2) {
        this.f130282y = interfaceC27158o2;
    }

    /* renamed from: i0 */
    public final void m140852i0(C23805a.e eVar) {
        AbstractC19074t.m100208f(eVar, "<set-?>");
        this.f130276s = eVar;
    }

    /* renamed from: j0 */
    public final void m140853j0(ZaloView zaloView) {
        this.f130269D = zaloView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return m140836R().size();
    }

    /* renamed from: k0 */
    public final void m140854k0(boolean z11) {
        m140836R().clear();
        if (this.f130283z > 0) {
            m140836R().add(new MyCloudItem(-500));
        }
        if (z11) {
            m140836R().add(new MyCloudItem(-400));
        } else {
            m140836R().add(new MyCloudItem(-300));
        }
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0058 A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo10005m(int i11) {
        MyCloudItem myCloudItem = (MyCloudItem) m140836R().get(i11);
        int m71021e = myCloudItem.m71021e();
        if (m71021e != -700) {
            if (m71021e != -600) {
                if (m71021e == -500) {
                    return 1;
                }
                if (m71021e != -400) {
                    if (m71021e != -300) {
                        if (m71021e != -200) {
                            if (m71021e != -100) {
                                if (m71021e == 0 && (myCloudItem instanceof MyCloudMessageItem)) {
                                    MyCloudMessageItem myCloudMessageItem = (MyCloudMessageItem) myCloudItem;
                                    int m95041W4 = myCloudMessageItem.m71033m().m95041W4();
                                    if (AbstractC19646n0.m103044x1(m95041W4)) {
                                        int i12 = c.f130300a[this.f130275r.ordinal()];
                                        if (i12 != 1) {
                                            if (i12 != 2) {
                                                return 6;
                                            }
                                            return 17;
                                        }
                                        return 7;
                                    }
                                    if (AbstractC19646n0.m103031t1(m95041W4) | AbstractC19646n0.m102995k1(m95041W4)) {
                                        if (this.f130275r == C23805a.d.f115057q) {
                                            return 11;
                                        }
                                    } else if (AbstractC19646n0.m102886D1(m95041W4)) {
                                        if (this.f130275r == C23805a.d.f115057q) {
                                            return 3;
                                        }
                                    } else {
                                        if (AbstractC19646n0.m103011o1(myCloudMessageItem.m71033m())) {
                                            C23805a.d dVar = this.f130275r;
                                            if (dVar != C23805a.d.f115058r) {
                                                if (dVar != C23805a.d.f115060t) {
                                                    if (myCloudMessageItem.m71033m().m94929K2().f91011p.length() == 0) {
                                                        return 4;
                                                    }
                                                }
                                                return 17;
                                            }
                                            return 7;
                                        }
                                        if (AbstractC19646n0.m103003m1(m95041W4)) {
                                            if (this.f130275r == C23805a.d.f115057q) {
                                                return 5;
                                            }
                                            return 16;
                                        }
                                        if (AbstractC19646n0.m103015p1(m95041W4)) {
                                            return 8;
                                        }
                                        if (AbstractC19646n0.m102889E1(m95041W4)) {
                                            return 9;
                                        }
                                        if (AbstractC19646n0.m103047y1(myCloudMessageItem.m71033m()) || AbstractC19646n0.m103027s1(myCloudMessageItem.m71033m())) {
                                            return 10;
                                        }
                                    }
                                    return 15;
                                }
                                return -1;
                            }
                            return 2;
                        }
                        return 0;
                    }
                    return 12;
                }
                return 13;
            }
            return 14;
        }
        return 18;
    }
}
