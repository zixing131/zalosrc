package com.zing.zalo.p077ui.mediastore;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.AbstractC1388a;
import androidx.core.graphics.C1421e;
import androidx.lifecycle.InterfaceC1801w;
import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import au.AbstractC2379w;
import au.EnumC2344e0;
import au.EnumC2363o;
import au.EnumC2382z;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import ci.C3508j;
import ci.C3526u;
import com.zing.p058v4.view.ViewPager;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7281z3;
import com.zing.zalo.control.mediastore.CreateMediaStoreParam;
import com.zing.zalo.control.mediastore.MSFilterData;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.mediastore.MediaStoreBasePage;
import com.zing.zalo.p077ui.mediastore.MediaStoreHeaderContainerView;
import com.zing.zalo.p077ui.mediastore.MediaStoreView;
import com.zing.zalo.p077ui.mediastore.NestedScrollViewParent;
import com.zing.zalo.p077ui.mediastore.TabViewLayout;
import com.zing.zalo.p077ui.mediastore.collection.MediaStoreCollectionListView;
import com.zing.zalo.p077ui.mediastore.search.MediaStoreQuickSearchListView;
import com.zing.zalo.p077ui.mediastore.search.MediaStoreSearchPage;
import com.zing.zalo.p077ui.mediastore.search.MediaStoreSuggestSearchView;
import com.zing.zalo.p077ui.widget.CustomRelativeLayout;
import com.zing.zalo.p077ui.widget.EditTextWithContextMenu;
import com.zing.zalo.p077ui.widget.InterfaceC13567b1;
import com.zing.zalo.p077ui.widget.QuickActionViewLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.uicontrol.MultiSelectMenuBottomView;
import com.zing.zalo.utils.systemui.AbstractC16768f;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import p175g0.AbstractC19182e;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p396ol.C24302e;
import p396ol.EnumC24298a;
import p542ub.InterfaceC27218a;
import p558uu.InterfaceC27367c;
import p649xl.C30064u5;
import p716zh.C31862c;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25370t;
import ui0.C27280g;
import v50.C27870vb;
import vg.AbstractC28207v1;
import x70.InterfaceC29445q;

/* loaded from: classes6.dex */
public final class MediaStoreView extends SlidableZaloView implements C23744a.c, InterfaceC12361f {
    public static final C12326a Companion = new C12326a(null);

    /* renamed from: P0 */
    private C30064u5 f64116P0;

    /* renamed from: Q0 */
    private MediaStoreQuickSearchListView f64117Q0;

    /* renamed from: R0 */
    private FrameLayout f64118R0;

    /* renamed from: S0 */
    private View f64119S0;

    /* renamed from: T0 */
    private RobotoTextView f64120T0;

    /* renamed from: U0 */
    private C7281z3 f64121U0;

    /* renamed from: V0 */
    private MediaStoreMultiSelectionBottomView f64122V0;

    /* renamed from: W0 */
    private MediaStoreSearchPage f64123W0;

    /* renamed from: X0 */
    private MediaStoreSearchPage f64124X0;

    /* renamed from: Y0 */
    private MediaStoreSuggestSearchView f64125Y0;

    /* renamed from: Z0 */
    private EditText f64126Z0;

    /* renamed from: a1 */
    private View f64127a1;

    /* renamed from: b1 */
    private ActionBarMenuItem f64128b1;

    /* renamed from: c1 */
    private View f64129c1;

    /* renamed from: d1 */
    private View f64130d1;

    /* renamed from: e1 */
    private ActionBarMenuItem f64131e1;

    /* renamed from: f1 */
    private final InterfaceC24854k f64132f1;

    /* renamed from: g1 */
    private boolean f64133g1;

    /* renamed from: h1 */
    private Handler.Callback f64134h1;

    /* loaded from: classes6.dex */
    public static final class MediaStoreMultiSelectionBottomView extends MultiSelectMenuBottomView {

        /* renamed from: A */
        private final InterfaceC24854k f64135A;

        /* renamed from: B */
        private final InterfaceC24854k f64136B;

        /* renamed from: C */
        private final InterfaceC24854k f64137C;

        /* renamed from: D */
        private final int f64138D;

        /* renamed from: E */
        private InterfaceC12317a f64139E;

        /* renamed from: s */
        private TextView f64140s;

        /* renamed from: t */
        private TextView f64141t;

        /* renamed from: u */
        private TextView f64142u;

        /* renamed from: v */
        private final InterfaceC24854k f64143v;

        /* renamed from: w */
        private final InterfaceC24854k f64144w;

        /* renamed from: x */
        private final InterfaceC24854k f64145x;

        /* renamed from: y */
        private final InterfaceC24854k f64146y;

        /* renamed from: z */
        private final InterfaceC24854k f64147z;

        /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreView$MediaStoreMultiSelectionBottomView$a */
        /* loaded from: classes6.dex */
        public interface InterfaceC12317a {
            /* renamed from: a */
            void mo69099a();

            /* renamed from: b */
            void mo69100b();

            /* renamed from: c */
            void mo69101c();
        }

        /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreView$MediaStoreMultiSelectionBottomView$b */
        /* loaded from: classes6.dex */
        static final class C12318b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Context f64148q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12318b(Context context) {
                super(0);
                this.f64148q = context;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Drawable mo12V4() {
                return C27280g.m139660c(this.f64148q, AbstractC23322a.zds_ic_delete_line_24, AbstractC2807a.icon_03);
            }
        }

        /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreView$MediaStoreMultiSelectionBottomView$c */
        /* loaded from: classes6.dex */
        static final class C12319c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Context f64149q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12319c(Context context) {
                super(0);
                this.f64149q = context;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Drawable mo12V4() {
                return C27280g.m139660c(this.f64149q, AbstractC23322a.zds_ic_share_line_24, AbstractC2807a.icon_03);
            }
        }

        /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreView$MediaStoreMultiSelectionBottomView$d */
        /* loaded from: classes6.dex */
        static final class C12320d extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Context f64150q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12320d(Context context) {
                super(0);
                this.f64150q = context;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer mo12V4() {
                return Integer.valueOf(C23212s8.m119607o(this.f64150q, AbstractC2807a.text_03));
            }
        }

        /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreView$MediaStoreMultiSelectionBottomView$e */
        /* loaded from: classes6.dex */
        static final class C12321e extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Context f64151q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12321e(Context context) {
                super(0);
                this.f64151q = context;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Drawable mo12V4() {
                return C27280g.m139660c(this.f64151q, AbstractC23322a.zds_ic_jump_to_original_line_24, AbstractC2807a.icon_03);
            }
        }

        /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreView$MediaStoreMultiSelectionBottomView$f */
        /* loaded from: classes6.dex */
        static final class C12322f extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Context f64152q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12322f(Context context) {
                super(0);
                this.f64152q = context;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Drawable mo12V4() {
                return C27280g.m139659b(this.f64152q, AbstractC23322a.zds_ic_delete_line_24, AbstractC2808b.f150830r60);
            }
        }

        /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreView$MediaStoreMultiSelectionBottomView$g */
        /* loaded from: classes6.dex */
        static final class C12323g extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Context f64153q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12323g(Context context) {
                super(0);
                this.f64153q = context;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Drawable mo12V4() {
                return C27280g.m139659b(this.f64153q, AbstractC23322a.zds_ic_share_line_24, AbstractC2808b.f150820b50);
            }
        }

        /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreView$MediaStoreMultiSelectionBottomView$h */
        /* loaded from: classes6.dex */
        static final class C12324h extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Context f64154q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12324h(Context context) {
                super(0);
                this.f64154q = context;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer mo12V4() {
                return Integer.valueOf(C23212s8.m119607o(this.f64154q, AbstractC2807a.text_01));
            }
        }

        /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreView$MediaStoreMultiSelectionBottomView$i */
        /* loaded from: classes6.dex */
        static final class C12325i extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Context f64155q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12325i(Context context) {
                super(0);
                this.f64155q = context;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Drawable mo12V4() {
                return C27280g.m139659b(this.f64155q, AbstractC23322a.zds_ic_jump_to_original_line_24, AbstractC2808b.skb60);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaStoreMultiSelectionBottomView(Context context) {
            super(context);
            InterfaceC24854k m129210a;
            InterfaceC24854k m129210a2;
            InterfaceC24854k m129210a3;
            InterfaceC24854k m129210a4;
            InterfaceC24854k m129210a5;
            InterfaceC24854k m129210a6;
            InterfaceC24854k m129210a7;
            InterfaceC24854k m129210a8;
            AbstractC19074t.m100208f(context, "context");
            m129210a = AbstractC24856m.m129210a(new C12323g(context));
            this.f64143v = m129210a;
            m129210a2 = AbstractC24856m.m129210a(new C12319c(context));
            this.f64144w = m129210a2;
            m129210a3 = AbstractC24856m.m129210a(new C12325i(context));
            this.f64145x = m129210a3;
            m129210a4 = AbstractC24856m.m129210a(new C12321e(context));
            this.f64146y = m129210a4;
            m129210a5 = AbstractC24856m.m129210a(new C12322f(context));
            this.f64147z = m129210a5;
            m129210a6 = AbstractC24856m.m129210a(new C12318b(context));
            this.f64135A = m129210a6;
            m129210a7 = AbstractC24856m.m129210a(new C12324h(context));
            this.f64136B = m129210a7;
            m129210a8 = AbstractC24856m.m129210a(new C12320d(context));
            this.f64137C = m129210a8;
            this.f64138D = AbstractC23309i.m120819C8();
            m69387j();
        }

        private final Drawable getDisableDeleteDrawable() {
            return (Drawable) this.f64135A.getValue();
        }

        private final Drawable getDisableForwardDrawable() {
            return (Drawable) this.f64144w.getValue();
        }

        private final int getDisableTextColor() {
            return ((Number) this.f64137C.getValue()).intValue();
        }

        private final Drawable getDisableViewOriginalMsgDrawable() {
            return (Drawable) this.f64146y.getValue();
        }

        private final Drawable getEnableDeleteDrawable() {
            return (Drawable) this.f64147z.getValue();
        }

        private final Drawable getEnableForwardDrawable() {
            return (Drawable) this.f64143v.getValue();
        }

        private final int getEnableTextColor() {
            return ((Number) this.f64136B.getValue()).intValue();
        }

        private final Drawable getEnableViewOriginalMsgDrawable() {
            return (Drawable) this.f64145x.getValue();
        }

        /* renamed from: k */
        private final void m69382k() {
            TextView textView = this.f64140s;
            if (textView != null) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: x70.r1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MediaStoreView.MediaStoreMultiSelectionBottomView.m69383l(MediaStoreView.MediaStoreMultiSelectionBottomView.this, view);
                    }
                });
            }
            TextView textView2 = this.f64142u;
            if (textView2 != null) {
                textView2.setOnClickListener(new View.OnClickListener() { // from class: x70.s1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MediaStoreView.MediaStoreMultiSelectionBottomView.m69384m(MediaStoreView.MediaStoreMultiSelectionBottomView.this, view);
                    }
                });
            }
            TextView textView3 = this.f64141t;
            if (textView3 != null) {
                textView3.setOnClickListener(new View.OnClickListener() { // from class: x70.t1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MediaStoreView.MediaStoreMultiSelectionBottomView.m69385n(MediaStoreView.MediaStoreMultiSelectionBottomView.this, view);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public static final void m69383l(MediaStoreMultiSelectionBottomView mediaStoreMultiSelectionBottomView, View view) {
            AbstractC19074t.m100208f(mediaStoreMultiSelectionBottomView, "this$0");
            InterfaceC12317a interfaceC12317a = mediaStoreMultiSelectionBottomView.f64139E;
            if (interfaceC12317a != null) {
                interfaceC12317a.mo69100b();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public static final void m69384m(MediaStoreMultiSelectionBottomView mediaStoreMultiSelectionBottomView, View view) {
            AbstractC19074t.m100208f(mediaStoreMultiSelectionBottomView, "this$0");
            InterfaceC12317a interfaceC12317a = mediaStoreMultiSelectionBottomView.f64139E;
            if (interfaceC12317a != null) {
                interfaceC12317a.mo69101c();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public static final void m69385n(MediaStoreMultiSelectionBottomView mediaStoreMultiSelectionBottomView, View view) {
            AbstractC19074t.m100208f(mediaStoreMultiSelectionBottomView, "this$0");
            InterfaceC12317a interfaceC12317a = mediaStoreMultiSelectionBottomView.f64139E;
            if (interfaceC12317a != null) {
                interfaceC12317a.mo69099a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public static final void m69386q(int i11, MediaStoreMultiSelectionBottomView mediaStoreMultiSelectionBottomView, boolean z11, boolean z12) {
            boolean z13;
            Drawable disableViewOriginalMsgDrawable;
            int disableTextColor;
            boolean z14;
            Drawable disableForwardDrawable;
            int disableTextColor2;
            Drawable disableDeleteDrawable;
            int disableTextColor3;
            AbstractC19074t.m100208f(mediaStoreMultiSelectionBottomView, "this$0");
            boolean z15 = false;
            if (i11 == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                disableViewOriginalMsgDrawable = mediaStoreMultiSelectionBottomView.getEnableViewOriginalMsgDrawable();
            } else {
                disableViewOriginalMsgDrawable = mediaStoreMultiSelectionBottomView.getDisableViewOriginalMsgDrawable();
            }
            TextView textView = mediaStoreMultiSelectionBottomView.f64141t;
            if (textView != null) {
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, disableViewOriginalMsgDrawable, (Drawable) null, (Drawable) null);
            }
            if (z13) {
                disableTextColor = mediaStoreMultiSelectionBottomView.getEnableTextColor();
            } else {
                disableTextColor = mediaStoreMultiSelectionBottomView.getDisableTextColor();
            }
            TextView textView2 = mediaStoreMultiSelectionBottomView.f64141t;
            if (textView2 != null) {
                textView2.setTextColor(disableTextColor);
            }
            if (1 <= i11 && i11 <= mediaStoreMultiSelectionBottomView.f64138D && !z11) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                disableForwardDrawable = mediaStoreMultiSelectionBottomView.getEnableForwardDrawable();
            } else {
                disableForwardDrawable = mediaStoreMultiSelectionBottomView.getDisableForwardDrawable();
            }
            TextView textView3 = mediaStoreMultiSelectionBottomView.f64140s;
            if (textView3 != null) {
                textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, disableForwardDrawable, (Drawable) null, (Drawable) null);
            }
            if (z14) {
                disableTextColor2 = mediaStoreMultiSelectionBottomView.getEnableTextColor();
            } else {
                disableTextColor2 = mediaStoreMultiSelectionBottomView.getDisableTextColor();
            }
            TextView textView4 = mediaStoreMultiSelectionBottomView.f64140s;
            if (textView4 != null) {
                textView4.setTextColor(disableTextColor2);
            }
            if (1 <= i11 && i11 <= mediaStoreMultiSelectionBottomView.f64138D && z12) {
                z15 = true;
            }
            if (z15) {
                disableDeleteDrawable = mediaStoreMultiSelectionBottomView.getEnableDeleteDrawable();
            } else {
                disableDeleteDrawable = mediaStoreMultiSelectionBottomView.getDisableDeleteDrawable();
            }
            TextView textView5 = mediaStoreMultiSelectionBottomView.f64142u;
            if (textView5 != null) {
                textView5.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, disableDeleteDrawable, (Drawable) null, (Drawable) null);
            }
            if (z15) {
                disableTextColor3 = mediaStoreMultiSelectionBottomView.getEnableTextColor();
            } else {
                disableTextColor3 = mediaStoreMultiSelectionBottomView.getDisableTextColor();
            }
            TextView textView6 = mediaStoreMultiSelectionBottomView.f64142u;
            if (textView6 != null) {
                textView6.setTextColor(disableTextColor3);
            }
        }

        public final InterfaceC12317a getListener() {
            return this.f64139E;
        }

        /* renamed from: j */
        public final void m69387j() {
            setMinHeight(AbstractC23222t7.f112567j0);
            setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            setMinimumHeight(getMinHeight() + AbstractC23222t7.f112556e);
            setBackground(AbstractC23136l9.m118663M(AbstractC16803z.bg_top_shadow_4));
            setPadding(getPaddingLeft(), AbstractC23222t7.f112556e, getPaddingRight(), getPaddingBottom());
            m87774b();
            int i11 = AbstractC6918a0.media_store_bottom_menu_share;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.share);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            TextView m87773a = m87773a(i11, m118743r0, getDisableForwardDrawable());
            this.f64140s = m87773a;
            if (m87773a != null) {
                m87773a.setTextColor(getEnableTextColor());
            }
            int i12 = AbstractC6918a0.media_store_bottom_menu_view_original_msg;
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_store_jum_to_original_message);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            TextView m87773a2 = m87773a(i12, m118743r02, getDisableViewOriginalMsgDrawable());
            this.f64141t = m87773a2;
            if (m87773a2 != null) {
                m87773a2.setTextColor(getEnableTextColor());
            }
            int i13 = AbstractC6918a0.media_store_bottom_menu_delete;
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.delete);
            AbstractC19074t.m100207e(m118743r03, "getString(...)");
            TextView m87773a3 = m87773a(i13, m118743r03, getDisableDeleteDrawable());
            this.f64142u = m87773a3;
            if (m87773a3 != null) {
                m87773a3.setTextColor(getEnableTextColor());
            }
            m69382k();
        }

        /* renamed from: p */
        public final void m69388p(final int i11, final boolean z11, final boolean z12) {
            AbstractC19444a.m101697e(new Runnable() { // from class: x70.u1
                @Override // java.lang.Runnable
                public final void run() {
                    MediaStoreView.MediaStoreMultiSelectionBottomView.m69386q(i11, this, z12, z11);
                }
            });
        }

        public final void setListener(InterfaceC12317a interfaceC12317a) {
            this.f64139E = interfaceC12317a;
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreView$a */
    /* loaded from: classes6.dex */
    public static final class C12326a {
        private C12326a() {
        }

        public /* synthetic */ C12326a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreView$b */
    /* loaded from: classes6.dex */
    public static final class C12327b {

        /* renamed from: a */
        private final EnumC2382z f64156a;

        /* renamed from: b */
        private final MediaStoreSearchPage.EnumC12391a f64157b;

        /* renamed from: c */
        private final CreateMediaStoreParam f64158c;

        /* renamed from: d */
        private final C3526u f64159d;

        /* renamed from: e */
        private final MediaStoreBasePage.InterfaceC12275b f64160e;

        /* renamed from: f */
        private final MediaStoreBasePage.InterfaceC12276c f64161f;

        public C12327b(EnumC2382z enumC2382z, MediaStoreSearchPage.EnumC12391a enumC12391a, CreateMediaStoreParam createMediaStoreParam, C3526u c3526u, MediaStoreBasePage.InterfaceC12275b interfaceC12275b, MediaStoreBasePage.InterfaceC12276c interfaceC12276c) {
            AbstractC19074t.m100208f(enumC2382z, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            AbstractC19074t.m100208f(enumC12391a, "modeSearch");
            this.f64156a = enumC2382z;
            this.f64157b = enumC12391a;
            this.f64158c = createMediaStoreParam;
            this.f64159d = c3526u;
            this.f64160e = interfaceC12275b;
            this.f64161f = interfaceC12276c;
        }

        /* renamed from: a */
        public final CreateMediaStoreParam m69397a() {
            return this.f64158c;
        }

        /* renamed from: b */
        public final MediaStoreSearchPage.EnumC12391a m69398b() {
            return this.f64157b;
        }

        /* renamed from: c */
        public final MediaStoreBasePage.InterfaceC12275b m69399c() {
            return this.f64160e;
        }

        /* renamed from: d */
        public final MediaStoreBasePage.InterfaceC12276c m69400d() {
            return this.f64161f;
        }

        /* renamed from: e */
        public final EnumC2382z m69401e() {
            return this.f64156a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12327b)) {
                return false;
            }
            C12327b c12327b = (C12327b) obj;
            return this.f64156a == c12327b.f64156a && this.f64157b == c12327b.f64157b && AbstractC19074t.m100204b(this.f64158c, c12327b.f64158c) && AbstractC19074t.m100204b(this.f64159d, c12327b.f64159d) && AbstractC19074t.m100204b(this.f64160e, c12327b.f64160e) && AbstractC19074t.m100204b(this.f64161f, c12327b.f64161f);
        }

        public int hashCode() {
            int hashCode = ((this.f64156a.hashCode() * 31) + this.f64157b.hashCode()) * 31;
            CreateMediaStoreParam createMediaStoreParam = this.f64158c;
            int hashCode2 = (hashCode + (createMediaStoreParam == null ? 0 : createMediaStoreParam.hashCode())) * 31;
            C3526u c3526u = this.f64159d;
            int hashCode3 = (hashCode2 + (c3526u == null ? 0 : c3526u.hashCode())) * 31;
            MediaStoreBasePage.InterfaceC12275b interfaceC12275b = this.f64160e;
            int hashCode4 = (hashCode3 + (interfaceC12275b == null ? 0 : interfaceC12275b.hashCode())) * 31;
            MediaStoreBasePage.InterfaceC12276c interfaceC12276c = this.f64161f;
            return hashCode4 + (interfaceC12276c != null ? interfaceC12276c.hashCode() : 0);
        }

        public String toString() {
            return "ShowSearchPageParams(type=" + this.f64156a + ", modeSearch=" + this.f64157b + ", createMediaStoreParam=" + this.f64158c + ", searchResult=" + this.f64159d + ", pageDelegate=" + this.f64160e + ", pageEventListener=" + this.f64161f + ")";
        }

        public /* synthetic */ C12327b(EnumC2382z enumC2382z, MediaStoreSearchPage.EnumC12391a enumC12391a, CreateMediaStoreParam createMediaStoreParam, C3526u c3526u, MediaStoreBasePage.InterfaceC12275b interfaceC12275b, MediaStoreBasePage.InterfaceC12276c interfaceC12276c, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? EnumC2382z.f9944q : enumC2382z, (i11 & 2) != 0 ? MediaStoreSearchPage.EnumC12391a.f64469p : enumC12391a, (i11 & 4) != 0 ? null : createMediaStoreParam, (i11 & 8) != 0 ? null : c3526u, (i11 & 16) != 0 ? null : interfaceC12275b, (i11 & 32) == 0 ? interfaceC12276c : null);
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreView$c */
    /* loaded from: classes6.dex */
    public static final class C12328c {

        /* renamed from: a */
        private final boolean f64162a;

        /* renamed from: b */
        private final String f64163b;

        /* renamed from: c */
        private final long f64164c;

        /* renamed from: d */
        private final long f64165d;

        /* renamed from: e */
        private final boolean f64166e;

        /* renamed from: f */
        private final MediaStoreSuggestSearchView.InterfaceC12401d f64167f;

        public C12328c(boolean z11, String str, long j11, long j12, boolean z12, MediaStoreSuggestSearchView.InterfaceC12401d interfaceC12401d) {
            AbstractC19074t.m100208f(str, "conversationId");
            this.f64162a = z11;
            this.f64163b = str;
            this.f64164c = j11;
            this.f64165d = j12;
            this.f64166e = z12;
            this.f64167f = interfaceC12401d;
        }

        /* renamed from: a */
        public final String m69402a() {
            return this.f64163b;
        }

        /* renamed from: b */
        public final boolean m69403b() {
            return this.f64162a;
        }

        /* renamed from: c */
        public final long m69404c() {
            return this.f64165d;
        }

        /* renamed from: d */
        public final long m69405d() {
            return this.f64164c;
        }

        /* renamed from: e */
        public final MediaStoreSuggestSearchView.InterfaceC12401d m69406e() {
            return this.f64167f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12328c)) {
                return false;
            }
            C12328c c12328c = (C12328c) obj;
            return this.f64162a == c12328c.f64162a && AbstractC19074t.m100204b(this.f64163b, c12328c.f64163b) && this.f64164c == c12328c.f64164c && this.f64165d == c12328c.f64165d && this.f64166e == c12328c.f64166e && AbstractC19074t.m100204b(this.f64167f, c12328c.f64167f);
        }

        /* renamed from: f */
        public final boolean m69407f() {
            return this.f64166e;
        }

        public int hashCode() {
            int m11520a = ((((((((AbstractC2144f.m11520a(this.f64162a) * 31) + this.f64163b.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f64164c)) * 31) + AbstractC2147g0.m11521a(this.f64165d)) * 31) + AbstractC2144f.m11520a(this.f64166e)) * 31;
            MediaStoreSuggestSearchView.InterfaceC12401d interfaceC12401d = this.f64167f;
            return m11520a + (interfaceC12401d == null ? 0 : interfaceC12401d.hashCode());
        }

        public String toString() {
            return "ShowSuggestSearchViewParams(fromCustomView=" + this.f64162a + ", conversationId=" + this.f64163b + ", searchStartTime=" + this.f64164c + ", searchEndTime=" + this.f64165d + ", isInSearchTimeMode=" + this.f64166e + ", suggestSearchViewListener=" + this.f64167f + ")";
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreView$d */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C12329d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f64168a;

        static {
            int[] iArr = new int[EnumC2344e0.values().length];
            try {
                iArr[EnumC2344e0.f9852q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2344e0.f9854s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2344e0.f9853r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f64168a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreView$e */
    /* loaded from: classes6.dex */
    public static final class C12330e implements TabViewLayout.InterfaceC12338a {
        C12330e() {
        }

        @Override // com.zing.zalo.p077ui.mediastore.TabViewLayout.InterfaceC12338a
        /* renamed from: a */
        public void mo69408a(int i11) {
            MediaStoreView.this.m69306xM().mo69264h(i11, MediaStoreView.this.m69304vM());
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreView$f */
    /* loaded from: classes6.dex */
    public static final class C12331f implements MediaStoreHeaderContainerView.InterfaceC12289a {
        C12331f() {
        }

        @Override // com.zing.zalo.p077ui.mediastore.MediaStoreHeaderContainerView.InterfaceC12289a
        /* renamed from: a */
        public void mo68964a(int i11, int i12) {
            C30064u5 c30064u5 = MediaStoreView.this.f64116P0;
            C30064u5 c30064u52 = null;
            if (c30064u5 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c30064u5 = null;
            }
            int measuredHeight = c30064u5.f139543s.getMeasuredHeight();
            C30064u5 c30064u53 = MediaStoreView.this.f64116P0;
            if (c30064u53 == null) {
                AbstractC19074t.m100223u("viewBinding");
            } else {
                c30064u52 = c30064u53;
            }
            c30064u52.f139546v.setMaxHeight(i11 - measuredHeight);
            MediaStoreView.this.m69289JM();
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreView$g */
    /* loaded from: classes6.dex */
    public static final class C12332g implements NestedScrollViewParent.InterfaceC12337a {
        C12332g() {
        }

        @Override // com.zing.zalo.p077ui.mediastore.NestedScrollViewParent.InterfaceC12337a
        /* renamed from: a */
        public void mo69409a(int i11) {
            MediaStoreView.this.m69306xM().mo69262f(i11);
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreView$h */
    /* loaded from: classes6.dex */
    public static final class C12333h extends ViewPager.C6879n {
        C12333h() {
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrolled(int i11, float f11, int i12) {
            super.onPageScrolled(i11, f11, i12);
            MediaStoreView.this.m69306xM().mo69260d(i11);
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            super.onPageSelected(i11);
            MediaStoreView.this.m69306xM().onPageSelected(i11);
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreView$i */
    /* loaded from: classes6.dex */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC12334i implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC12334i() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            C30064u5 c30064u5 = MediaStoreView.this.f64116P0;
            C30064u5 c30064u52 = null;
            if (c30064u5 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c30064u5 = null;
            }
            ViewTreeObserver viewTreeObserver = c30064u5.f139549y.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            C30064u5 c30064u53 = MediaStoreView.this.f64116P0;
            if (c30064u53 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c30064u53 = null;
            }
            SwipeRefreshLayout swipeRefreshLayout = c30064u53.f139548x;
            int i11 = AbstractC23222t7.f112553c0;
            C30064u5 c30064u54 = MediaStoreView.this.f64116P0;
            if (c30064u54 == null) {
                AbstractC19074t.m100223u("viewBinding");
            } else {
                c30064u52 = c30064u54;
            }
            swipeRefreshLayout.m35370r(false, i11 + c30064u52.f139549y.getTop());
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreView$j */
    /* loaded from: classes6.dex */
    public static final class C12335j implements InterfaceC13567b1.a {
        C12335j() {
        }

        @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1.a
        /* renamed from: B5 */
        public void mo36332B5(C31862c c31862c, String str, String str2, int i11) {
            AbstractC19074t.m100208f(c31862c, "actionItemInfo");
            AbstractC19074t.m100208f(str, "actionType");
            AbstractC19074t.m100208f(str2, "actionData");
            MediaStoreView.this.m69306xM().mo69257a(c31862c, str, str2);
        }

        @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1.a
        /* renamed from: P1 */
        public void mo36333P1(QuickActionViewLayout quickActionViewLayout, C31862c c31862c) {
            AbstractC19074t.m100208f(quickActionViewLayout, "view");
            AbstractC19074t.m100208f(c31862c, "actionItemInfo");
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.MediaStoreView$k */
    /* loaded from: classes6.dex */
    static final class C12336k extends AbstractC19075u implements InterfaceC18494a {
        C12336k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC29445q mo12V4() {
            MediaStorePresenter mediaStorePresenter = new MediaStorePresenter(MediaStoreView.this);
            MediaStoreView.this.getLifecycle().mo9335a(mediaStorePresenter);
            return mediaStorePresenter.m69244vr();
        }
    }

    public MediaStoreView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C12336k());
        this.f64132f1 = m129210a;
        this.f64133g1 = true;
        this.f64134h1 = new Handler.Callback() { // from class: x70.h1
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m69284EM;
                m69284EM = MediaStoreView.m69284EM(MediaStoreView.this, message);
                return m69284EM;
            }
        };
    }

    /* renamed from: AM */
    private final void m69280AM() {
        View findViewById;
        if (this.f64119S0 == null) {
            C30064u5 c30064u5 = this.f64116P0;
            RobotoTextView robotoTextView = null;
            if (c30064u5 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c30064u5 = null;
            }
            View inflate = c30064u5.f139547w.inflate();
            this.f64119S0 = inflate;
            if (inflate != null) {
                robotoTextView = (RobotoTextView) inflate.findViewById(AbstractC6918a0.desc_num);
            }
            this.f64120T0 = robotoTextView;
            View view = this.f64119S0;
            if (view != null && (findViewById = view.findViewById(AbstractC6918a0.btn_close)) != null) {
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: x70.q1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        MediaStoreView.m69281BM(MediaStoreView.this, view2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public static final void m69281BM(MediaStoreView mediaStoreView, View view) {
        AbstractC19074t.m100208f(mediaStoreView, "this$0");
        mediaStoreView.mo69360mI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public static final void m69282CM(MediaStoreView mediaStoreView, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        AbstractC19074t.m100208f(mediaStoreView, "this$0");
        if (i12 != i16 || i14 != i18) {
            mediaStoreView.m69289JM();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public static final void m69283DM(MediaStoreView mediaStoreView) {
        int i11;
        AbstractC19074t.m100208f(mediaStoreView, "this$0");
        C7281z3 c7281z3 = mediaStoreView.f64121U0;
        if (c7281z3 != null) {
            i11 = c7281z3.mo35335g();
        } else {
            i11 = 0;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            mediaStoreView.m69369uM(i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public static final boolean m69284EM(MediaStoreView mediaStoreView, Message message) {
        AbstractC19074t.m100208f(mediaStoreView, "this$0");
        AbstractC19074t.m100208f(message, "msg");
        try {
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 == 2) {
                    InterfaceC29445q m69306xM = mediaStoreView.m69306xM();
                    Object obj = message.obj;
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
                    m69306xM.mo69266j((String) obj);
                }
            } else {
                InterfaceC29445q m69306xM2 = mediaStoreView.m69306xM();
                String str = (String) message.obj;
                if (str == null) {
                    str = "";
                }
                m69306xM2.mo69255I3(str);
            }
            return false;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public static final void m69285FM(MediaStoreView mediaStoreView, C1421e c1421e) {
        AbstractC19074t.m100208f(mediaStoreView, "this$0");
        AbstractC19074t.m100208f(c1421e, "it");
        C30064u5 c30064u5 = mediaStoreView.f64116P0;
        if (c30064u5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u5 = null;
        }
        CustomRelativeLayout root = c30064u5.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        root.setPadding(root.getPaddingLeft(), root.getPaddingTop(), root.getPaddingRight(), c1421e.f6233d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public static final void m69286GM(MediaStoreView mediaStoreView, View view) {
        AbstractC19074t.m100208f(mediaStoreView, "this$0");
        mediaStoreView.mo69346bc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public static final void m69287HM(boolean z11, MediaStoreView mediaStoreView) {
        int i11;
        float f11;
        AbstractC19074t.m100208f(mediaStoreView, "this$0");
        if (z11) {
            mediaStoreView.m69280AM();
        }
        View view = mediaStoreView.f64119S0;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(view, i11);
        MediaStoreQuickSearchListView mediaStoreQuickSearchListView = mediaStoreView.f64117Q0;
        if (mediaStoreQuickSearchListView != null) {
            mediaStoreQuickSearchListView.setEnable(!z11);
        }
        C30064u5 c30064u5 = mediaStoreView.f64116P0;
        if (c30064u5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u5 = null;
        }
        int mNumberTab = c30064u5.f139543s.getMNumberTab();
        for (int i12 = 0; i12 < mNumberTab; i12++) {
            C30064u5 c30064u52 = mediaStoreView.f64116P0;
            if (c30064u52 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c30064u52 = null;
            }
            View m69415b = c30064u52.f139543s.m69415b(i12);
            if (m69415b != null) {
                if (z11) {
                    f11 = 0.3f;
                } else {
                    f11 = 1.0f;
                }
                m69415b.setAlpha(f11);
                m69415b.setClickable(!z11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public static final void m69288IM(boolean z11, MediaStoreView mediaStoreView, C31862c c31862c) {
        int i11;
        AbstractC19074t.m100208f(mediaStoreView, "this$0");
        if (z11) {
            QuickActionViewLayout quickActionViewLayout = null;
            if (mediaStoreView.f64118R0 == null) {
                C30064u5 c30064u5 = mediaStoreView.f64116P0;
                if (c30064u5 == null) {
                    AbstractC19074t.m100223u("viewBinding");
                    c30064u5 = null;
                }
                View inflate = c30064u5.f139550z.inflate();
                AbstractC19074t.m100206d(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
                mediaStoreView.f64118R0 = (FrameLayout) inflate;
            }
            FrameLayout frameLayout = mediaStoreView.f64118R0;
            if (frameLayout == null) {
                return;
            }
            if (frameLayout.getVisibility() == 0 && frameLayout.getChildCount() > 0) {
                View childAt = frameLayout.getChildAt(0);
                if (childAt instanceof QuickActionViewLayout) {
                    quickActionViewLayout = (QuickActionViewLayout) childAt;
                }
                if (quickActionViewLayout != null && quickActionViewLayout.getActionItemInfo() != null && quickActionViewLayout.getActionItemInfo().m153159l(c31862c)) {
                    return;
                }
            }
            frameLayout.setVisibility(0);
            frameLayout.removeAllViews();
            Context context = frameLayout.getContext();
            if (c31862c != null) {
                i11 = c31862c.f146309b;
            } else {
                i11 = -1;
            }
            QuickActionViewLayout quickActionViewLayout2 = new QuickActionViewLayout(context, i11);
            quickActionViewLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            quickActionViewLayout2.setId(AbstractC6918a0.view_quick_action_top);
            quickActionViewLayout2.m75818b(c31862c, new C12335j());
            frameLayout.addView(quickActionViewLayout2);
            return;
        }
        AbstractC23136l9.m118744r1(mediaStoreView.f64118R0, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public final void m69289JM() {
        C30064u5 c30064u5 = this.f64116P0;
        C30064u5 c30064u52 = null;
        if (c30064u5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u5 = null;
        }
        int measuredHeight = c30064u5.f139543s.getMeasuredHeight();
        C30064u5 c30064u53 = this.f64116P0;
        if (c30064u53 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u53 = null;
        }
        int measuredHeight2 = c30064u53.f139548x.getMeasuredHeight();
        C30064u5 c30064u54 = this.f64116P0;
        if (c30064u54 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u54 = null;
        }
        ViewGroup.LayoutParams layoutParams = c30064u54.f139549y.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = measuredHeight2 - measuredHeight;
        }
        C30064u5 c30064u55 = this.f64116P0;
        if (c30064u55 == null) {
            AbstractC19074t.m100223u("viewBinding");
        } else {
            c30064u52 = c30064u55;
        }
        c30064u52.f139549y.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public final int m69304vM() {
        C30064u5 c30064u5 = this.f64116P0;
        if (c30064u5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u5 = null;
        }
        return c30064u5.f139549y.getCurrentItem();
    }

    /* renamed from: wM */
    private final ZaloView m69305wM() {
        MediaStoreSearchPage mediaStoreSearchPage = this.f64124X0;
        if (mediaStoreSearchPage != null) {
            return mediaStoreSearchPage;
        }
        MediaStoreSearchPage mediaStoreSearchPage2 = this.f64123W0;
        if (mediaStoreSearchPage2 != null) {
            return mediaStoreSearchPage2;
        }
        C7281z3 c7281z3 = this.f64121U0;
        if (c7281z3 != null) {
            return c7281z3.m93128x(m69304vM());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public final InterfaceC29445q m69306xM() {
        return (InterfaceC29445q) this.f64132f1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public static final boolean m69307yM(MediaStoreView mediaStoreView, TextView textView, int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(mediaStoreView, "this$0");
        return mediaStoreView.m69306xM().mo69259c(i11, mediaStoreView.mo69331O5());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public static final boolean m69308zM(MediaStoreView mediaStoreView, View view, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(mediaStoreView, "this$0");
        mediaStoreView.m69306xM().mo69270m();
        return false;
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: B7 */
    public void mo69309B7() {
        MediaStoreBasePage mediaStoreBasePage;
        ZaloView m69305wM = m69305wM();
        if (m69305wM instanceof MediaStoreBasePage) {
            mediaStoreBasePage = (MediaStoreBasePage) m69305wM;
        } else {
            mediaStoreBasePage = null;
        }
        if (mediaStoreBasePage != null) {
            mediaStoreBasePage.m68856B7();
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: Bb */
    public void mo69310Bb(boolean z11, ActionBarMenuItem.C17435d c17435d) {
        ActionBarMenuItem actionBarMenuItem;
        int i11;
        AbstractC19074t.m100208f(c17435d, "listener");
        if (this.f64131e1 != null) {
            return;
        }
        ActionBarMenu actionBarMenu = this.f88763d0;
        EditTextWithContextMenu editTextWithContextMenu = null;
        if (actionBarMenu != null) {
            actionBarMenuItem = actionBarMenu.m92738e(AbstractC6918a0.menu_item_search, AbstractC16803z.ic_search_line_24);
        } else {
            actionBarMenuItem = null;
        }
        this.f64131e1 = actionBarMenuItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.m92768B(true, true, AbstractC16803z.icn_header_close_white, AbstractC16803z.search_cursor_white);
            actionBarMenuItem.f88838J = false;
            actionBarMenuItem.m92767A(c17435d);
            EditText searchField = actionBarMenuItem.getSearchField();
            this.f64126Z0 = searchField;
            if (searchField != null) {
                searchField.setEllipsize(TextUtils.TruncateAt.END);
                searchField.setHintTextColor(AbstractC1388a.m6961c(this.f72421L0.m92686rK(), AbstractC16801x.white_50));
                if (z11) {
                    i11 = AbstractC8020f0.str_ms_search_by_time_hint;
                } else {
                    i11 = AbstractC8020f0.str_hint_search_media;
                }
                searchField.setHint(AbstractC23136l9.m118743r0(i11));
                searchField.setTextColor(AbstractC1388a.m6961c(this.f72421L0.m92686rK(), AbstractC16801x.white));
                searchField.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: x70.n1
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView, int i12, KeyEvent keyEvent) {
                        boolean m69307yM;
                        m69307yM = MediaStoreView.m69307yM(MediaStoreView.this, textView, i12, keyEvent);
                        return m69307yM;
                    }
                });
                Object parent = searchField.getParent();
                AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.view.View");
                ((View) parent).setBackgroundResource(AbstractC16803z.stencil_edit_text_focused_no_space_white);
                searchField.setOnTouchListener(new View.OnTouchListener() { // from class: x70.o1
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        boolean m69308zM;
                        m69308zM = MediaStoreView.m69308zM(MediaStoreView.this, view, motionEvent);
                        return m69308zM;
                    }
                });
            }
            EditText editText = this.f64126Z0;
            if (editText instanceof EditTextWithContextMenu) {
                editTextWithContextMenu = (EditTextWithContextMenu) editText;
            }
            if (editTextWithContextMenu != null) {
                editTextWithContextMenu.setMaxScaledTextSize(AbstractC23222t7.f112590v);
            }
            EditText editText2 = this.f64126Z0;
            if (editText2 != null) {
                editText2.setTextSize(1, 16.0f);
            }
            View clearButton = actionBarMenuItem.getClearButton();
            this.f64127a1 = clearButton;
            if (clearButton != null) {
                clearButton.setVisibility(8);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: Bd */
    public void mo69311Bd(CreateMediaStoreParam createMediaStoreParam, List list, MediaStoreBasePage.InterfaceC12276c interfaceC12276c, MediaStoreBasePage.InterfaceC12275b interfaceC12275b) {
        AbstractC19074t.m100208f(createMediaStoreParam, "createMediaStoreParam");
        AbstractC19074t.m100208f(list, "tabItems");
        AbstractC19074t.m100208f(interfaceC12276c, "pageEventListener");
        AbstractC19074t.m100208f(interfaceC12275b, "pageDelegate");
        C7281z3 c7281z3 = new C7281z3(this.f72421L0.m92649TI(), createMediaStoreParam, list);
        c7281z3.m37045E(interfaceC12276c);
        c7281z3.m37044D(interfaceC12275b);
        this.f64121U0 = c7281z3;
        C30064u5 c30064u5 = this.f64116P0;
        C30064u5 c30064u52 = null;
        if (c30064u5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u5 = null;
        }
        c30064u5.f139549y.setSwipeEnabled(false);
        C30064u5 c30064u53 = this.f64116P0;
        if (c30064u53 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u53 = null;
        }
        c30064u53.f139549y.addOnPageChangeListener(new C12333h());
        C30064u5 c30064u54 = this.f64116P0;
        if (c30064u54 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u54 = null;
        }
        c30064u54.f139549y.setPageMargin(AbstractC23136l9.m118655I(AbstractC16802y.page_margin_width));
        C30064u5 c30064u55 = this.f64116P0;
        if (c30064u55 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u55 = null;
        }
        c30064u55.f139549y.setOffscreenPageLimit(2);
        C30064u5 c30064u56 = this.f64116P0;
        if (c30064u56 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u56 = null;
        }
        c30064u56.f139549y.setAdapter(this.f64121U0);
        C30064u5 c30064u57 = this.f64116P0;
        if (c30064u57 == null) {
            AbstractC19074t.m100223u("viewBinding");
        } else {
            c30064u52 = c30064u57;
        }
        ViewTreeObserver viewTreeObserver = c30064u52.f139549y.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC12334i());
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: Bm */
    public void mo69312Bm(C3508j c3508j, String str) {
        C17487o0 mo35579p;
        AbstractC19074t.m100208f(c3508j, "albumItem");
        AbstractC19074t.m100208f(str, "conversationId");
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_CONVERSATION_ID", str);
        bundle.putInt("EXTRA_INT_COLLECTION_SUBTYPE", c3508j.m17713y0().ordinal());
        bundle.putInt("SHOW_WITH_FLAGS", 134217728);
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
            mo35579p.m93069k2(MediaStoreCollectionListView.class, bundle, 1, true);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: C4 */
    public void mo69313C4(final boolean z11) {
        AbstractC19444a.m101697e(new Runnable() { // from class: x70.l1
            @Override // java.lang.Runnable
            public final void run() {
                MediaStoreView.m69287HM(z11, this);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f72827B0 = new Handler(Looper.getMainLooper(), this.f64134h1);
        m92637BK(true);
        m69306xM().mo69265i(C12368g.Companion.m69535a(m92642L3()), bundle);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: Dq */
    public void mo69314Dq(final boolean z11, final C31862c c31862c) {
        AbstractC19444a.m101697e(new Runnable() { // from class: x70.p1
            @Override // java.lang.Runnable
            public final void run() {
                MediaStoreView.m69288IM(z11, this, c31862c);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: Dt */
    public boolean mo69315Dt(int i11) {
        MediaStoreBasePage mediaStoreBasePage;
        ZaloView m69305wM = m69305wM();
        if (m69305wM instanceof MediaStoreBasePage) {
            mediaStoreBasePage = (MediaStoreBasePage) m69305wM;
        } else {
            mediaStoreBasePage = null;
        }
        if (mediaStoreBasePage == null || !mediaStoreBasePage.m68872Jy(i11)) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: ED */
    public void mo69316ED(boolean z11) {
        int i11;
        View view = this.f64127a1;
        if (view != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: Ek */
    public void mo69317Ek(C3508j c3508j, String str) {
        C17487o0 mo35579p;
        AbstractC19074t.m100208f(c3508j, "albumItem");
        AbstractC19074t.m100208f(str, "conversationId");
        Bundle bundle = new Bundle();
        CreateMediaStoreParam createMediaStoreParam = new CreateMediaStoreParam(str, null, null, 6, null);
        if (c3508j.m17713y0() == C3508j.b.f14700q) {
            createMediaStoreParam.m40912e(EnumC2363o.f9891r);
        } else if (c3508j.m17713y0() == C3508j.b.f14701r) {
            createMediaStoreParam.m40912e(EnumC2363o.f9890q);
        }
        createMediaStoreParam.m40911d(new MSFilterData(String.valueOf(c3508j.m17711w0()), String.valueOf(c3508j.m17694G0())));
        createMediaStoreParam.m40913f(bundle);
        bundle.putInt("SHOW_WITH_FLAGS", 134217728);
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
            mo35579p.mo89694j2(MediaStoreView.class, bundle, 1000, null, 1, true);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: Ez */
    public void mo69318Ez(int i11) {
        C30064u5 c30064u5 = this.f64116P0;
        if (c30064u5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u5 = null;
        }
        c30064u5.f139543s.m69419g(i11);
        C7281z3 c7281z3 = this.f64121U0;
        if (c7281z3 != null) {
            c7281z3.m37046F(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: F3 */
    public void mo69319F3(boolean z11) {
        C30064u5 c30064u5 = this.f64116P0;
        if (c30064u5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u5 = null;
        }
        c30064u5.f139548x.setEnabled(z11);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: FE */
    public void mo69320FE(String str, MessageId messageId) {
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(messageId, "targetMsgId");
        Bundle m140776b = new C27870vb(str).m140781h(messageId).m140776b();
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35573l4(ChatView.class, m140776b, 1, true);
        }
        finish();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        AbstractC19074t.m100208f(actionBarMenu, "menu");
        super.mo37482FJ(actionBarMenu);
        m69306xM().mo69272y3();
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: G5 */
    public void mo69321G5() {
        try {
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            MediaStoreMultiSelectionBottomView mediaStoreMultiSelectionBottomView = new MediaStoreMultiSelectionBottomView(m92689tK);
            this.f64122V0 = mediaStoreMultiSelectionBottomView;
            mediaStoreMultiSelectionBottomView.setVisibility(4);
            C30064u5 c30064u5 = this.f64116P0;
            if (c30064u5 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c30064u5 = null;
            }
            c30064u5.f139541q.addView(this.f64122V0);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: GB */
    public void mo69322GB(C12327b c12327b) {
        AbstractC19074t.m100208f(c12327b, "showSearchPageParams");
        MediaStoreSearchPage mediaStoreSearchPage = this.f64123W0;
        if (mediaStoreSearchPage != null) {
            mediaStoreSearchPage.m68907eN(c12327b.m69400d());
            mediaStoreSearchPage.m68891Vh(c12327b.m69399c());
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30064u5 m148566c = C30064u5.m148566c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148566c, "inflate(...)");
        this.f64116P0 = m148566c;
        m69306xM().mo69261e();
        C30064u5 c30064u5 = this.f64116P0;
        C30064u5 c30064u52 = null;
        if (c30064u5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u5 = null;
        }
        CustomRelativeLayout root = c30064u5.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        AbstractC16768f.m89489a(root).m89430n(new InterfaceC27367c() { // from class: x70.i1
            @Override // p558uu.InterfaceC27367c
            /* renamed from: b */
            public final void mo87294b(C1421e c1421e) {
                MediaStoreView.m69285FM(MediaStoreView.this, c1421e);
            }
        });
        C30064u5 c30064u53 = this.f64116P0;
        if (c30064u53 == null) {
            AbstractC19074t.m100223u("viewBinding");
        } else {
            c30064u52 = c30064u53;
        }
        CustomRelativeLayout root2 = c30064u52.getRoot();
        AbstractC19074t.m100207e(root2, "getRoot(...)");
        return root2;
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: IG */
    public void mo69323IG(boolean z11, C12327b c12327b) {
        AbstractC19074t.m100208f(c12327b, "showSearchPageParams");
        if (z11) {
            if (this.f64123W0 == null) {
                this.f64123W0 = new MediaStoreSearchPage();
                mo69322GB(c12327b);
                Bundle bundle = new Bundle();
                CreateMediaStoreParam m69397a = c12327b.m69397a();
                if (m69397a != null) {
                    m69397a.m40913f(bundle);
                }
                bundle.putInt("EXTRA_MODE_SEARCH", c12327b.m69398b().ordinal());
                bundle.putInt("extra_current_type", EnumC2382z.f9944q.m12438c());
                this.f72421L0.m92649TI().mo93055b2(AbstractC6918a0.media_store_container, this.f64123W0, bundle, 0, "MediaStoreSearchPage", 0, false);
            }
            MediaStoreSearchPage.EnumC12391a m69398b = c12327b.m69398b();
            MediaStoreSearchPage mediaStoreSearchPage = this.f64123W0;
            if (mediaStoreSearchPage != null) {
                mediaStoreSearchPage.m69634mN(m69398b);
                return;
            }
            return;
        }
        if (this.f64123W0 != null) {
            this.f72421L0.m92649TI().mo92702G1(this.f64123W0, 0);
            this.f64123W0 = null;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        C24302e.Companion.m126919j().m126902h(EnumC24298a.f117299r);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: Ij */
    public void mo69324Ij(String str, String str2) {
        AbstractC19074t.m100208f(str, "actionType");
        AbstractC19074t.m100208f(str2, "actionData");
        AbstractC28207v1.m141994i3(str, 4, this.f72421L0.m92676n2(), this, str2, null);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: Jj */
    public void mo69325Jj() {
        ActionBarMenuItem actionBarMenuItem = this.f64131e1;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.m92779x();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 52);
        bVar.m124119a().m124117e(this, 6020);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: Ki */
    public void mo69326Ki(List list, Map map) {
        int m131511r;
        AbstractC19074t.m100208f(list, "tabItems");
        AbstractC19074t.m100208f(map, "tabNameMap");
        C30064u5 c30064u5 = this.f64116P0;
        C30064u5 c30064u52 = null;
        if (c30064u5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u5 = null;
        }
        TabViewLayout tabViewLayout = c30064u5.f139543s;
        List list2 = list;
        m131511r = AbstractC25370t.m131511r(list2, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((EnumC2344e0) it.next()).m12311c());
        }
        tabViewLayout.m69418f(arrayList, map);
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = C12329d.f64168a[((EnumC2344e0) list.get(i11)).ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        C30064u5 c30064u53 = this.f64116P0;
                        if (c30064u53 == null) {
                            AbstractC19074t.m100223u("viewBinding");
                            c30064u53 = null;
                        }
                        RobotoTextView robotoTextView = c30064u53.f139543s.getMTabViewArr()[i11];
                        if (robotoTextView != null) {
                            robotoTextView.setId(AbstractC6918a0.stored_media_link_tab);
                        }
                    }
                } else {
                    C30064u5 c30064u54 = this.f64116P0;
                    if (c30064u54 == null) {
                        AbstractC19074t.m100223u("viewBinding");
                        c30064u54 = null;
                    }
                    RobotoTextView robotoTextView2 = c30064u54.f139543s.getMTabViewArr()[i11];
                    if (robotoTextView2 != null) {
                        robotoTextView2.setId(AbstractC6918a0.stored_media_file_tab);
                    }
                }
            } else {
                C30064u5 c30064u55 = this.f64116P0;
                if (c30064u55 == null) {
                    AbstractC19074t.m100223u("viewBinding");
                    c30064u55 = null;
                }
                RobotoTextView robotoTextView3 = c30064u55.f139543s.getMTabViewArr()[i11];
                if (robotoTextView3 != null) {
                    robotoTextView3.setId(AbstractC6918a0.stored_media_photo_tab);
                }
            }
        }
        C30064u5 c30064u56 = this.f64116P0;
        if (c30064u56 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u56 = null;
        }
        c30064u56.f139543s.setOnTabViewEventListener(new C12330e());
        C30064u5 c30064u57 = this.f64116P0;
        if (c30064u57 == null) {
            AbstractC19074t.m100223u("viewBinding");
        } else {
            c30064u52 = c30064u57;
        }
        c30064u52.f139542r.setHeaderContainerEventListener(new C12331f());
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: Kq */
    public void mo69327Kq(String str) {
        AbstractC19074t.m100208f(str, "timeKeySearch");
        this.f72827B0.removeMessages(2);
        Handler handler = this.f72827B0;
        handler.sendMessageDelayed(handler.obtainMessage(2, str), 300L);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: LG */
    public void mo69328LG(boolean z11, MediaStoreSuggestSearchView.InterfaceC12401d interfaceC12401d) {
        ZaloView zaloView;
        MediaStoreSuggestSearchView.EnumC12400c enumC12400c;
        AbstractC19074t.m100208f(interfaceC12401d, "suggestSearchViewListener");
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            zaloView = m92662fJ.m92996E0("MediaStoreInputSearchTimePage");
        } else {
            zaloView = null;
        }
        if (zaloView instanceof MediaStoreSuggestSearchView) {
            MediaStoreSuggestSearchView mediaStoreSuggestSearchView = (MediaStoreSuggestSearchView) zaloView;
            if (z11) {
                enumC12400c = MediaStoreSuggestSearchView.EnumC12400c.f64505q;
            } else {
                enumC12400c = MediaStoreSuggestSearchView.EnumC12400c.f64504p;
            }
            mediaStoreSuggestSearchView.m69674DM(enumC12400c);
            mediaStoreSuggestSearchView.m69675EM(interfaceC12401d);
            this.f64125Y0 = mediaStoreSuggestSearchView;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        if (!super.mo37488Li() || !this.f64133g1) {
            return false;
        }
        C30064u5 c30064u5 = this.f64116P0;
        MediaStoreBasePage mediaStoreBasePage = null;
        if (c30064u5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u5 = null;
        }
        if (c30064u5.f139549y.getCurrentItem() != 0 || (m69305wM() instanceof MediaStoreSearchPage)) {
            return false;
        }
        ZaloView m69305wM = m69305wM();
        if (m69305wM instanceof MediaStoreBasePage) {
            mediaStoreBasePage = (MediaStoreBasePage) m69305wM;
        }
        if (mediaStoreBasePage != null && !mediaStoreBasePage.m68927xh()) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: M3 */
    public NestedScrollViewParent mo69329M3() {
        C30064u5 c30064u5 = this.f64116P0;
        if (c30064u5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u5 = null;
        }
        NestedScrollViewParent nestedScrollViewParent = c30064u5.f139546v;
        AbstractC19074t.m100207e(nestedScrollViewParent, "scrollView");
        return nestedScrollViewParent;
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: MC */
    public void mo69330MC(String str) {
        AbstractC19074t.m100208f(str, "newTitle");
        RobotoTextView robotoTextView = this.f64120T0;
        if (robotoTextView != null) {
            robotoTextView.setText(str);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: O5 */
    public String mo69331O5() {
        Editable editable;
        EditText editText = this.f64126Z0;
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        return String.valueOf(editable);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: O8 */
    public void mo69332O8() {
        C30064u5 c30064u5 = this.f64116P0;
        if (c30064u5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u5 = null;
        }
        c30064u5.f139546v.m69412q0();
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: OD */
    public View mo69333OD() {
        MediaStoreBasePage mediaStoreBasePage;
        ZaloView m69305wM = m69305wM();
        if (m69305wM instanceof MediaStoreBasePage) {
            mediaStoreBasePage = (MediaStoreBasePage) m69305wM;
        } else {
            mediaStoreBasePage = null;
        }
        if (mediaStoreBasePage == null) {
            return null;
        }
        return mediaStoreBasePage.m68924vM(0);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: P8 */
    public void mo69334P8(int i11, String str) {
        MediaStoreBasePage mediaStoreBasePage;
        InterfaceC1801w interfaceC1801w;
        AbstractC19074t.m100208f(str, "currentSearchText");
        ZaloView m69305wM = m69305wM();
        MediaStoreBasePage mediaStoreBasePage2 = null;
        if (m69305wM instanceof MediaStoreBasePage) {
            mediaStoreBasePage = (MediaStoreBasePage) m69305wM;
        } else {
            mediaStoreBasePage = null;
        }
        if (mediaStoreBasePage != null) {
            mediaStoreBasePage.m68925wM();
        }
        C30064u5 c30064u5 = this.f64116P0;
        if (c30064u5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u5 = null;
        }
        c30064u5.f139549y.setCurrentItem(i11);
        C30064u5 c30064u52 = this.f64116P0;
        if (c30064u52 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u52 = null;
        }
        if (c30064u52.f139546v.getMaxHeight() != 0) {
            C30064u5 c30064u53 = this.f64116P0;
            if (c30064u53 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c30064u53 = null;
            }
            int scrollY = c30064u53.f139546v.getScrollY();
            C30064u5 c30064u54 = this.f64116P0;
            if (c30064u54 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c30064u54 = null;
            }
            if (scrollY < c30064u54.f139546v.getMaxHeight()) {
                C7281z3 c7281z3 = this.f64121U0;
                if (c7281z3 != null) {
                    interfaceC1801w = c7281z3.m93128x(i11);
                } else {
                    interfaceC1801w = null;
                }
                if (interfaceC1801w instanceof MediaStoreBasePage) {
                    mediaStoreBasePage2 = (MediaStoreBasePage) interfaceC1801w;
                }
                if (mediaStoreBasePage2 != null) {
                    mediaStoreBasePage2.m68902bN();
                }
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        m69306xM().mo69258b(m92642L3());
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (m69306xM().mo69269l(i11)) {
            return true;
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: Rb */
    public int mo69335Rb() {
        C30064u5 c30064u5 = this.f64116P0;
        if (c30064u5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u5 = null;
        }
        return c30064u5.f139546v.getMaxHeight();
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: Rx */
    public void mo69336Rx() {
        ActionBarMenuItem actionBarMenuItem;
        if (this.f64128b1 == null) {
            ActionBarMenu m92647RI = m92647RI();
            if (m92647RI != null) {
                actionBarMenuItem = m92647RI.m92738e(AbstractC6918a0.action_bar_menu_more, AbstractC19182e.abc_ic_menu_overflow_material);
            } else {
                actionBarMenuItem = null;
            }
            this.f64128b1 = actionBarMenuItem;
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: S3 */
    public void mo69337S3(boolean z11) {
        C30064u5 c30064u5 = this.f64116P0;
        if (c30064u5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u5 = null;
        }
        c30064u5.f139548x.setRefreshing(z11);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: SE */
    public void mo69338SE() {
        ZaloView m92996E0 = this.f72421L0.m92649TI().m92996E0("MediaStoreSearchPage");
        if (m92996E0 instanceof MediaStoreSearchPage) {
            this.f64123W0 = (MediaStoreSearchPage) m92996E0;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        m69306xM().mo69267j3(bundle);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        m69306xM().mo69268k();
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: Uu */
    public int mo69339Uu() {
        MediaStoreMultiSelectionBottomView mediaStoreMultiSelectionBottomView = this.f64122V0;
        if (mediaStoreMultiSelectionBottomView != null) {
            return mediaStoreMultiSelectionBottomView.getContainerHeight();
        }
        return 0;
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: WH */
    public void mo69340WH() {
        C30064u5 c30064u5 = this.f64116P0;
        C30064u5 c30064u52 = null;
        if (c30064u5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u5 = null;
        }
        c30064u5.f139546v.setOnScrollListener(new C12332g());
        C30064u5 c30064u53 = this.f64116P0;
        if (c30064u53 == null) {
            AbstractC19074t.m100223u("viewBinding");
        } else {
            c30064u52 = c30064u53;
        }
        c30064u52.f139546v.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: x70.k1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                MediaStoreView.m69282CM(MediaStoreView.this, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: X5 */
    public void mo69341X5(boolean z11) {
        MediaStoreBasePage mediaStoreBasePage;
        try {
            MediaStoreMultiSelectionBottomView mediaStoreMultiSelectionBottomView = this.f64122V0;
            if (mediaStoreMultiSelectionBottomView != null) {
                MultiSelectMenuBottomView.m87772e(mediaStoreMultiSelectionBottomView, z11, false, null, 6, null);
            }
            MediaStoreMultiSelectionBottomView.InterfaceC12317a interfaceC12317a = null;
            if (z11) {
                MediaStoreMultiSelectionBottomView mediaStoreMultiSelectionBottomView2 = this.f64122V0;
                if (mediaStoreMultiSelectionBottomView2 != null) {
                    ZaloView m69305wM = m69305wM();
                    if (m69305wM instanceof MediaStoreBasePage) {
                        mediaStoreBasePage = (MediaStoreBasePage) m69305wM;
                    } else {
                        mediaStoreBasePage = null;
                    }
                    if (mediaStoreBasePage != null) {
                        interfaceC12317a = mediaStoreBasePage.m68913iB();
                    }
                    mediaStoreMultiSelectionBottomView2.setListener(interfaceC12317a);
                    return;
                }
                return;
            }
            MediaStoreMultiSelectionBottomView mediaStoreMultiSelectionBottomView3 = this.f64122V0;
            if (mediaStoreMultiSelectionBottomView3 != null) {
                mediaStoreMultiSelectionBottomView3.setListener(null);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        m69306xM().mo69256T(z11, z12);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: Xz */
    public void mo69342Xz(String str) {
        AbstractC19074t.m100208f(str, "text");
        EditText editText = this.f64126Z0;
        if (editText != null) {
            editText.setText(str);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: Z5 */
    public void mo69343Z5(String str) {
        AbstractC19074t.m100208f(str, "textKeySearch");
        this.f72827B0.removeMessages(1);
        Handler handler = this.f72827B0;
        handler.sendMessageDelayed(handler.obtainMessage(1, str), 300L);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: ab */
    public void mo69344ab() {
        View view;
        Context context = getContext();
        if (context != null && this.f64130d1 == null) {
            ActionBarMenuItem actionBarMenuItem = this.f64128b1;
            if (actionBarMenuItem != null) {
                view = actionBarMenuItem.m92774j(AbstractC23136l9.m118724l(context, AbstractC6918a0.menu_change_layout_sub, AbstractC8020f0.str_album_change_photo_layout));
            } else {
                view = null;
            }
            this.f64130d1 = view;
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: ap */
    public void mo69345ap() {
        View view;
        Context context = getContext();
        if (context != null && this.f64129c1 == null) {
            ActionBarMenuItem actionBarMenuItem = this.f64128b1;
            if (actionBarMenuItem != null) {
                view = actionBarMenuItem.m92774j(AbstractC23136l9.m118724l(context, AbstractC6918a0.menu_multi_select, AbstractC8020f0.str_media_store_media_setting_item_select));
            } else {
                view = null;
            }
            this.f64129c1 = view;
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: bc */
    public void mo69346bc() {
        MediaStoreBasePage mediaStoreBasePage;
        ZaloView m69305wM = m69305wM();
        if (m69305wM instanceof MediaStoreBasePage) {
            mediaStoreBasePage = (MediaStoreBasePage) m69305wM;
        } else {
            mediaStoreBasePage = null;
        }
        if (mediaStoreBasePage != null) {
            mediaStoreBasePage.m68904cN();
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: da */
    public void mo69347da(boolean z11) {
        EditText editText = this.f64126Z0;
        if (editText != null) {
            if (z11) {
                editText.requestFocus();
                AbstractC2379w.m12432f(editText);
            } else {
                AbstractC2379w.m12430d(editText);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: dn */
    public void mo69348dn() {
        MediaStoreSearchPage mediaStoreSearchPage = this.f64123W0;
        if (mediaStoreSearchPage != null) {
            mediaStoreSearchPage.m69635r4();
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: eb */
    public void mo69349eb(List list, MediaStoreQuickSearchListView.InterfaceC12387a interfaceC12387a, boolean z11) {
        AbstractC19074t.m100208f(list, "quickSearchItems");
        AbstractC19074t.m100208f(interfaceC12387a, "listener");
        C30064u5 c30064u5 = this.f64116P0;
        C30064u5 c30064u52 = null;
        if (c30064u5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u5 = null;
        }
        c30064u5.f139545u.removeAllViews();
        Context context = getContext();
        if (context != null && this.f64117Q0 == null) {
            MediaStoreQuickSearchListView mediaStoreQuickSearchListView = new MediaStoreQuickSearchListView(context);
            mediaStoreQuickSearchListView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            mediaStoreQuickSearchListView.setQuickSearchItemEventListener(interfaceC12387a);
            this.f64117Q0 = mediaStoreQuickSearchListView;
        }
        MediaStoreQuickSearchListView mediaStoreQuickSearchListView2 = this.f64117Q0;
        if (mediaStoreQuickSearchListView2 != null) {
            mediaStoreQuickSearchListView2.m69631d(list, !z11);
        }
        C30064u5 c30064u53 = this.f64116P0;
        if (c30064u53 == null) {
            AbstractC19074t.m100223u("viewBinding");
        } else {
            c30064u52 = c30064u53;
        }
        c30064u52.f139545u.addView(this.f64117Q0);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: fe */
    public void mo69350fe(boolean z11) {
        int i11;
        ActionBarMenuItem actionBarMenuItem = this.f64131e1;
        if (actionBarMenuItem != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            actionBarMenuItem.setVisibility(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: g */
    public void mo69351g() {
        finish();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "MediaStoreView";
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: if */
    public void mo69352if() {
        MediaStoreBasePage mediaStoreBasePage;
        ZaloView m69305wM = m69305wM();
        if (m69305wM instanceof MediaStoreBasePage) {
            mediaStoreBasePage = (MediaStoreBasePage) m69305wM;
        } else {
            mediaStoreBasePage = null;
        }
        if (mediaStoreBasePage != null) {
            mediaStoreBasePage.m68878MM();
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: ip */
    public void mo69353ip(boolean z11, C12327b c12327b) {
        AbstractC19074t.m100208f(c12327b, "showSearchPageParams");
        if (z11) {
            if (this.f64124X0 == null) {
                MediaStoreSearchPage mediaStoreSearchPage = new MediaStoreSearchPage();
                mediaStoreSearchPage.m68907eN(c12327b.m69400d());
                mediaStoreSearchPage.m68891Vh(c12327b.m69399c());
                this.f64124X0 = mediaStoreSearchPage;
                Bundle bundle = new Bundle();
                CreateMediaStoreParam m69397a = c12327b.m69397a();
                if (m69397a != null) {
                    m69397a.m40913f(bundle);
                }
                bundle.putInt("EXTRA_MODE_SEARCH", c12327b.m69398b().ordinal());
                bundle.putInt("extra_current_type", c12327b.m69401e().m12438c());
                this.f72421L0.m92649TI().mo93055b2(AbstractC6918a0.media_store_container, this.f64124X0, bundle, 0, null, 0, false);
                return;
            }
            return;
        }
        if (this.f64124X0 != null) {
            this.f72421L0.m92649TI().mo92702G1(this.f64124X0, 0);
            this.f64124X0 = null;
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: iw */
    public void mo69354iw(boolean z11) {
        int i11;
        View view = this.f64129c1;
        if (view != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: jF */
    public void mo69355jF() {
        C30064u5 c30064u5 = this.f64116P0;
        if (c30064u5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u5 = null;
        }
        c30064u5.f139548x.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: x70.m1
            @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
            /* renamed from: a */
            public final void mo12137a() {
                MediaStoreView.m69283DM(MediaStoreView.this);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: jq */
    public void mo69356jq(boolean z11) {
        EditText editText = this.f64126Z0;
        if (editText != null) {
            editText.setEnabled(z11);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: ju */
    public int mo69357ju() {
        C30064u5 c30064u5 = this.f64116P0;
        if (c30064u5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u5 = null;
        }
        return c30064u5.f139543s.getHeight();
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: kG */
    public void mo69358kG(boolean z11) {
        int i11;
        ActionBarMenuItem actionBarMenuItem = this.f64128b1;
        if (actionBarMenuItem != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            actionBarMenuItem.setVisibility(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: l9 */
    public void mo69359l9(String str) {
        RobotoTextView robotoTextView;
        AbstractC19074t.m100208f(str, "title");
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
            actionBar.setTitle(str);
            actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            TextView titleTextView = actionBar.getTitleTextView();
            if (titleTextView != null) {
                titleTextView.setOnClickListener(new View.OnClickListener() { // from class: x70.j1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MediaStoreView.m69286GM(MediaStoreView.this, view);
                    }
                });
            }
            TextView titleTextView2 = actionBar.getTitleTextView();
            if (titleTextView2 instanceof RobotoTextView) {
                robotoTextView = (RobotoTextView) titleTextView2;
            } else {
                robotoTextView = null;
            }
            if (robotoTextView != null) {
                robotoTextView.mo75850g(true);
            }
            TextView titleTextView3 = actionBar.getTitleTextView();
            if (titleTextView3 != null) {
                titleTextView3.setTextSize(1, 16.0f);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: mI */
    public boolean mo69360mI() {
        MediaStoreBasePage mediaStoreBasePage;
        ZaloView m69305wM = m69305wM();
        if (m69305wM instanceof MediaStoreBasePage) {
            mediaStoreBasePage = (MediaStoreBasePage) m69305wM;
        } else {
            mediaStoreBasePage = null;
        }
        if (mediaStoreBasePage != null) {
            return mediaStoreBasePage.m68857BH();
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: n4 */
    public void mo69361n4(int i11, boolean z11, boolean z12) {
        MediaStoreMultiSelectionBottomView mediaStoreMultiSelectionBottomView = this.f64122V0;
        if (mediaStoreMultiSelectionBottomView != null) {
            mediaStoreMultiSelectionBottomView.m69388p(i11, z11, z12);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: nd */
    public void mo69362nd(String str) {
        AbstractC19074t.m100208f(str, "hint");
        EditText editText = this.f64126Z0;
        if (editText != null) {
            editText.setHint(str);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: o8 */
    public void mo69363o8(boolean z11) {
        int i11;
        View view = this.f64130d1;
        if (view != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        m69306xM().onActivityResult(i11, i12, intent);
        this.f72421L0.m92643OI(i11, i12, intent);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(keyEvent, "event");
        if (m69306xM().mo69263g(i11)) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 52);
        bVar.m124119a().m124115b(this, 6020);
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35554O(34);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: pE */
    public int mo69364pE() {
        return m69304vM();
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: qf */
    public void mo69365qf(int i11, int i12) {
        C30064u5 c30064u5 = this.f64116P0;
        if (c30064u5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u5 = null;
        }
        c30064u5.f139546v.scrollBy(i11, i12);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: rk */
    public void mo69366rk(boolean z11, boolean z12, String str, boolean z13) {
        int i11;
        ActionBar actionBar = this.f88760a0;
        if (actionBar == null) {
            return;
        }
        if (z11) {
            actionBar.m92723u(str);
        } else {
            actionBar.m92708c();
        }
        mo69347da(z12);
        EditText editText = this.f64126Z0;
        if (editText != null) {
            if (z13) {
                i11 = AbstractC8020f0.str_ms_search_by_time_hint;
            } else {
                i11 = AbstractC8020f0.str_hint_search_media;
            }
            editText.setHint(AbstractC23136l9.m118743r0(i11));
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: sc */
    public MediaStoreSuggestSearchView.EnumC12400c mo69367sc() {
        MediaStoreSuggestSearchView mediaStoreSuggestSearchView = this.f64125Y0;
        if (mediaStoreSuggestSearchView != null) {
            return mediaStoreSuggestSearchView.m69676sM();
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: tj */
    public void mo69368tj(String str) {
        AbstractC19074t.m100208f(str, "title");
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setTitle(str);
        }
    }

    /* renamed from: uM */
    public void m69369uM(int i11) {
        ZaloView zaloView;
        C7281z3 c7281z3 = this.f64121U0;
        if (c7281z3 != null) {
            zaloView = c7281z3.m93128x(i11);
        } else {
            zaloView = null;
        }
        if (zaloView instanceof MediaStoreBasePage) {
            ((MediaStoreBasePage) zaloView).m68906dg();
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: us */
    public void mo69370us() {
        AbstractC23136l9.m118744r1(this.f64118R0, 8);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        m69306xM().mo69271x(i11, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: yA */
    public MediaStoreSearchPage.EnumC12391a mo69371yA() {
        MediaStoreSearchPage.EnumC12391a m69632kN;
        MediaStoreSearchPage mediaStoreSearchPage = this.f64123W0;
        if (mediaStoreSearchPage == null || (m69632kN = mediaStoreSearchPage.m69632kN()) == null) {
            return MediaStoreSearchPage.EnumC12391a.f64469p;
        }
        return m69632kN;
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: yl */
    public void mo69372yl(boolean z11) {
        this.f64133g1 = z11;
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: ym */
    public void mo69373ym() {
        C7281z3 c7281z3 = this.f64121U0;
        if (c7281z3 != null) {
            c7281z3.m37043B(m69304vM());
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: z9 */
    public void mo69374z9(boolean z11) {
        int i11;
        C30064u5 c30064u5 = this.f64116P0;
        if (c30064u5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u5 = null;
        }
        TabViewLayout tabViewLayout = c30064u5.f139543s;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(tabViewLayout, i11);
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: zA */
    public void mo69375zA(String str) {
        TextView textView;
        AbstractC19074t.m100208f(str, "title");
        View view = this.f64129c1;
        if (view instanceof TextView) {
            textView = (TextView) view;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: zH */
    public int mo69376zH() {
        C30064u5 c30064u5 = this.f64116P0;
        if (c30064u5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30064u5 = null;
        }
        return c30064u5.f139545u.getBottom();
    }

    @Override // com.zing.zalo.p077ui.mediastore.InterfaceC12361f
    /* renamed from: zm */
    public void mo69377zm(boolean z11, C12328c c12328c) {
        MediaStoreSuggestSearchView.EnumC12400c enumC12400c;
        AbstractC19074t.m100208f(c12328c, "showSuggestSearchViewParams");
        if (z11) {
            if (this.f64125Y0 == null) {
                MediaStoreSuggestSearchView mediaStoreSuggestSearchView = new MediaStoreSuggestSearchView();
                MediaStoreSuggestSearchView.InterfaceC12401d m69406e = c12328c.m69406e();
                if (m69406e != null) {
                    mediaStoreSuggestSearchView.m69675EM(m69406e);
                }
                this.f64125Y0 = mediaStoreSuggestSearchView;
                Bundle bundle = new Bundle();
                bundle.putString("conversation_id", c12328c.m69402a());
                if (c12328c.m69403b()) {
                    bundle.putBoolean("show_custom_time_view", true);
                    bundle.putLong("start_time", c12328c.m69405d());
                    bundle.putLong("end_time", c12328c.m69404c());
                }
                if (c12328c.m69407f()) {
                    enumC12400c = MediaStoreSuggestSearchView.EnumC12400c.f64505q;
                } else {
                    enumC12400c = MediaStoreSuggestSearchView.EnumC12400c.f64504p;
                }
                bundle.putSerializable("suggest_mode", enumC12400c);
                this.f72421L0.m92649TI().mo93055b2(AbstractC6918a0.media_store_container, this.f64125Y0, bundle, 0, "MediaStoreInputSearchTimePage", 0, false);
                return;
            }
            return;
        }
        if (this.f64125Y0 != null) {
            this.f72421L0.m92649TI().mo92702G1(this.f64125Y0, 0);
            this.f64125Y0 = null;
        }
    }
}
