package com.zing.zalo.p077ui.toolstorage.detail;

import ac.C0697c0;
import am.AbstractC0924m0;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.AbstractC1803x;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import au.AbstractC2379w;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import com.showingphotolib.view.SimpleAnimationTarget;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC7921d0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.imageviewer.ToolStorageImageViewer;
import com.zing.zalo.p077ui.mycloud.MyCloudQuotaOnBoardBottomSheet;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import com.zing.zalo.p077ui.toolstorage.bottomsheet.ToolStorageDetailFilterBottomSheet;
import com.zing.zalo.p077ui.toolstorage.detail.C13380a;
import com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailPage;
import com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailTabViewLayout;
import com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailView;
import com.zing.zalo.p077ui.toolstoragev1.detail.C13463a;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zalocloud.home.ZcloudManagementMultiSelectBottomView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.uicontrol.ViewPagerCustomSwipeable;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import dj.C17945a0;
import ed0.AbstractC18391a;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import gg0.AbstractC19444a;
import i40.C20275e;
import i60.C20338d;
import j30.C20912a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k30.C21459a;
import kc0.C21680s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import ln0.AbstractC22543l;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23160o0;
import me0.AbstractC23244v8;
import me0.C23055e5;
import me0.C23212s8;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import mw.C23459d;
import on0.AbstractC24341v;
import p239ih.C20556f;
import p241ij.C20568e;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23304d;
import p363nh.C23744a;
import p396ol.C24302e;
import p396ol.EnumC24298a;
import p487rl.C25821b;
import p542ub.InterfaceC27218a;
import p649xl.AbstractC29763d7;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import qm0.C25345g0;
import ta0.AbstractC26611a;
import ta0.C26612b;
import tg0.C26676b;
import ti0.C26705d;
import ti0.C26708g;
import u80.C27114d2;
import ui0.C27280g;
import v50.C27870vb;
import vm0.AbstractC28298d;
import wa0.C28897w;
import wm0.AbstractC29104l;
import za0.C31747a;

/* loaded from: classes6.dex */
public final class ToolStorageDetailView extends SlidableZaloView {
    public static final C13349a Companion = new C13349a(null);

    /* renamed from: P0 */
    private AbstractC29763d7 f68511P0;

    /* renamed from: Q0 */
    private Snackbar f68512Q0;

    /* renamed from: R0 */
    private ZcloudManagementMultiSelectBottomView f68513R0;

    /* renamed from: S0 */
    private int f68514S0;

    /* renamed from: T0 */
    private ToolStorageDetailPage f68515T0;

    /* renamed from: U0 */
    private C16972e0 f68516U0;

    /* renamed from: V0 */
    private C13463a f68517V0;

    /* renamed from: W0 */
    private ToolStorageDetailPage.EnumC13333a f68518W0 = ToolStorageDetailPage.EnumC13333a.f68483q;

    /* renamed from: X0 */
    private ArrayList f68519X0 = new ArrayList();

    /* renamed from: Y0 */
    private final ArrayList f68520Y0 = new ArrayList();

    /* renamed from: Z0 */
    private final InterfaceC24854k f68521Z0;

    /* renamed from: a1 */
    private final List f68522a1;

    /* renamed from: b1 */
    private final List f68523b1;

    /* renamed from: c1 */
    private C13385f f68524c1;

    /* renamed from: d1 */
    private final InterfaceC24854k f68525d1;

    /* renamed from: e1 */
    private final AbstractC18391a f68526e1;

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$a */
    /* loaded from: classes6.dex */
    public static final class C13349a {
        private C13349a() {
        }

        public /* synthetic */ C13349a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$b */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C13350b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f68527a;

        static {
            int[] iArr = new int[ToolStorageDetailPage.EnumC13333a.values().length];
            try {
                iArr[ToolStorageDetailPage.EnumC13333a.f68483q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToolStorageDetailPage.EnumC13333a.f68484r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToolStorageDetailPage.EnumC13333a.f68485s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f68527a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$c */
    /* loaded from: classes6.dex */
    public static final class C13351c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ String f68529r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13351c(String str) {
            super(0);
            this.f68529r = str;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m74998a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m74998a() {
            ToolStorageDetailView.this.m74916EN();
            C23459d c23459d = C23459d.f113954a;
            ToolStorageDetailView toolStorageDetailView = ToolStorageDetailView.this;
            c23459d.m123170n(toolStorageDetailView, 0, AbstractC23244v8.m119746j(toolStorageDetailView.m92653YI(AbstractC8020f0.str_tool_storage_overview_clear_cache_snackbar, this.f68529r)), null);
            ToolStorageDetailPage toolStorageDetailPage = ToolStorageDetailView.this.f68515T0;
            if (toolStorageDetailPage != null) {
                toolStorageDetailPage.m74881KM(false);
            }
            ToolStorageDetailView.this.m74946WM().m136607y0(false);
            if (ToolStorageDetailView.this.m74946WM() instanceof C21680s) {
                AbstractC26611a m74946WM = ToolStorageDetailView.this.m74946WM();
                AbstractC19074t.m100206d(m74946WM, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.viewmodels.ZCloudManagementViewModel");
                ((C21680s) m74946WM).m111800X0();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$d */
    /* loaded from: classes6.dex */
    public static final class C13352d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ boolean f68530q;

        /* renamed from: r */
        final /* synthetic */ ToolStorageDetailView f68531r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13352d(boolean z11, ToolStorageDetailView toolStorageDetailView) {
            super(0);
            this.f68530q = z11;
            this.f68531r = toolStorageDetailView;
        }

        /* renamed from: c */
        public static final void m75000c(ToolStorageDetailView toolStorageDetailView) {
            AbstractC19074t.m100208f(toolStorageDetailView, "this$0");
            ToolStorageDetailPage toolStorageDetailPage = toolStorageDetailView.f68515T0;
            if (toolStorageDetailPage != null) {
                toolStorageDetailPage.m74878GM();
            }
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m75001b();
            return C24848g0.f119245a;
        }

        /* renamed from: b */
        public final void m75001b() {
            if (this.f68530q) {
                ToastUtils.showMess(this.f68531r.m92652XI(AbstractC8020f0.str_msg_deleted));
            }
            this.f68531r.m74916EN();
            AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.toolstorage.detail.e
                public /* synthetic */ RunnableC13384e() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ToolStorageDetailView.C13352d.m75000c(ToolStorageDetailView.this);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$e */
    /* loaded from: classes6.dex */
    public static final class C13353e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f68532t;

        /* renamed from: v */
        final /* synthetic */ C13380a f68534v;

        /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$e$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f68535a;

            static {
                int[] iArr = new int[ToolStorageDetailPage.EnumC13333a.values().length];
                try {
                    iArr[ToolStorageDetailPage.EnumC13333a.f68485s.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f68535a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13353e(C13380a c13380a, Continuation continuation) {
            super(2, continuation);
            this.f68534v = c13380a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C13353e(this.f68534v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            List m131502j;
            int m116580c;
            int m116584g;
            int hashCode;
            boolean m100204b;
            String str;
            AbstractC28298d.m142578e();
            if (this.f68532t == 0) {
                AbstractC24862s.m129228b(obj);
                ArrayList arrayList = new ArrayList();
                String m136584V = ToolStorageDetailView.this.m74946WM().m136584V();
                ToolStorageDetailPage toolStorageDetailPage = ToolStorageDetailView.this.f68515T0;
                if (toolStorageDetailPage == null || (m131502j = toolStorageDetailPage.m74883wM()) == null) {
                    m131502j = AbstractC25368s.m131502j();
                }
                ToolStorageDetailView toolStorageDetailView = ToolStorageDetailView.this;
                C13380a c13380a = this.f68534v;
                Iterator it = m131502j.iterator();
                int i11 = 0;
                while (true) {
                    if (it.hasNext()) {
                        C13380a c13380a2 = (C13380a) it.next();
                        if (a.f68535a[toolStorageDetailView.f68518W0.ordinal()] == 1) {
                            C25821b m75082d = c13380a2.m75082d();
                            String str2 = null;
                            if (m75082d != null) {
                                str = m75082d.m133141d();
                            } else {
                                str = null;
                            }
                            C25821b m75082d2 = c13380a.m75082d();
                            if (m75082d2 != null) {
                                str2 = m75082d2.m133141d();
                            }
                            m100204b = AbstractC19074t.m100204b(str, str2);
                        } else {
                            m100204b = AbstractC19074t.m100204b(c13380a2.m75081a(), c13380a.m75081a());
                        }
                        if (m100204b) {
                            break;
                        }
                        i11++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                m116580c = AbstractC22543l.m116580c(0, i11 - 100);
                m116584g = AbstractC22543l.m116584g(m131502j.size(), i11 + 100);
                List subList = m131502j.subList(m116580c, m116584g);
                try {
                    hashCode = m136584V.hashCode();
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("CommonZaloview", e11);
                }
                if (hashCode != -1905167199) {
                    if (hashCode != -1732810888) {
                        if (hashCode == 65921 && m136584V.equals("All")) {
                            ItemAlbumMobile m40514Y = new ItemAlbumMobile().m40514Y(this.f68534v, ToolStorageDetailView.this.f68518W0);
                            if (m40514Y != null) {
                                arrayList.add(m40514Y);
                            }
                            return arrayList;
                        }
                    } else if (m136584V.equals("Videos")) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : subList) {
                            if (((C13380a) obj2).m75075E()) {
                                arrayList2.add(obj2);
                            }
                        }
                        ToolStorageDetailView toolStorageDetailView2 = ToolStorageDetailView.this;
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ItemAlbumMobile m40514Y2 = new ItemAlbumMobile().m40514Y((C13380a) it2.next(), toolStorageDetailView2.f68518W0);
                            if (m40514Y2 != null) {
                                arrayList.add(m40514Y2);
                            }
                        }
                        return arrayList;
                    }
                } else if (m136584V.equals("Photos")) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : subList) {
                        C13380a c13380a3 = (C13380a) obj3;
                        if (c13380a3.m75071A() || c13380a3.m75097s()) {
                            arrayList3.add(obj3);
                        }
                    }
                    ToolStorageDetailView toolStorageDetailView3 = ToolStorageDetailView.this;
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        ItemAlbumMobile m40514Y3 = new ItemAlbumMobile().m40514Y((C13380a) it3.next(), toolStorageDetailView3.f68518W0);
                        if (m40514Y3 != null) {
                            arrayList.add(m40514Y3);
                        }
                    }
                    return arrayList;
                }
                ToolStorageDetailView toolStorageDetailView4 = ToolStorageDetailView.this;
                Iterator it4 = subList.iterator();
                while (it4.hasNext()) {
                    ItemAlbumMobile m40514Y4 = new ItemAlbumMobile().m40514Y((C13380a) it4.next(), toolStorageDetailView4.f68518W0);
                    if (m40514Y4 != null) {
                        arrayList.add(m40514Y4);
                    }
                }
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C13353e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$f */
    /* loaded from: classes6.dex */
    public static final class C13354f implements C13380a.b {

        /* renamed from: b */
        final /* synthetic */ C13380a f68537b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC18505l f68538c;

        C13354f(C13380a c13380a, InterfaceC18505l interfaceC18505l) {
            this.f68537b = c13380a;
            this.f68538c = interfaceC18505l;
        }

        @Override // com.zing.zalo.p077ui.toolstorage.detail.C13380a.b
        /* renamed from: a */
        public void mo75003a() {
            ToolStorageDetailView.this.m74975pN();
        }

        @Override // com.zing.zalo.p077ui.toolstorage.detail.C13380a.b
        /* renamed from: b */
        public void mo75004b(long j11) {
        }

        @Override // com.zing.zalo.p077ui.toolstorage.detail.C13380a.b
        /* renamed from: c */
        public void mo75005c() {
            ToolStorageDetailView.this.m74979rN(this.f68537b, this.f68538c);
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$g */
    /* loaded from: classes6.dex */
    public static final class C13355g extends AbstractC19075u implements InterfaceC18505l {
        C13355g() {
            super(1);
        }

        /* renamed from: a */
        public final void m75006a(ThreadStorageInfo threadStorageInfo) {
            ToolStorageDetailView toolStorageDetailView = ToolStorageDetailView.this;
            AbstractC19074t.m100205c(threadStorageInfo);
            toolStorageDetailView.m74943SM(threadStorageInfo);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m75006a((ThreadStorageInfo) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$h */
    /* loaded from: classes6.dex */
    public static final class C13356h extends AbstractC19075u implements InterfaceC18505l {
        C13356h() {
            super(1);
        }

        /* renamed from: a */
        public final void m75007a(ThreadStorageInfo threadStorageInfo) {
            ToolStorageDetailView toolStorageDetailView = ToolStorageDetailView.this;
            AbstractC19074t.m100205c(threadStorageInfo);
            toolStorageDetailView.m74943SM(threadStorageInfo);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m75007a((ThreadStorageInfo) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$i */
    /* loaded from: classes6.dex */
    public static final class C13357i extends AbstractC19075u implements InterfaceC18505l {
        C13357i() {
            super(1);
        }

        /* renamed from: a */
        public final void m75008a(Boolean bool) {
            AbstractC29763d7 abstractC29763d7 = ToolStorageDetailView.this.f68511P0;
            if (abstractC29763d7 == null) {
                AbstractC19074t.m100223u("mBinding");
                abstractC29763d7 = null;
            }
            abstractC29763d7.f137497R.setEnabled(!bool.booleanValue());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m75008a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$j */
    /* loaded from: classes6.dex */
    public static final class C13358j extends AbstractC19075u implements InterfaceC18505l {
        C13358j() {
            super(1);
        }

        /* renamed from: a */
        public final void m75009a(C17945a0 c17945a0) {
            ToolStorageDetailView.this.m74952cN(c17945a0);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m75009a((C17945a0) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$k */
    /* loaded from: classes6.dex */
    public static final class C13359k extends AbstractC19075u implements InterfaceC18505l {
        C13359k() {
            super(1);
        }

        /* renamed from: a */
        public final void m75010a(C24860q c24860q) {
            int intValue = ((Number) c24860q.m129213a()).intValue();
            String str = (String) c24860q.m129214b();
            RobotoTextView robotoTextView = (RobotoTextView) ToolStorageDetailView.this.m74948YM().findViewById(3000);
            if (intValue > 0) {
                int size = ToolStorageDetailView.this.f68523b1.size();
                for (int i11 = 0; i11 < size; i11++) {
                    AbstractC29763d7 abstractC29763d7 = ToolStorageDetailView.this.f68511P0;
                    if (abstractC29763d7 == null) {
                        AbstractC19074t.m100223u("mBinding");
                        abstractC29763d7 = null;
                    }
                    View m74902c = abstractC29763d7.f137500U.m74902c(i11);
                    if (m74902c != null) {
                        m74902c.setAlpha(0.3f);
                    }
                    AbstractC29763d7 abstractC29763d72 = ToolStorageDetailView.this.f68511P0;
                    if (abstractC29763d72 == null) {
                        AbstractC19074t.m100223u("mBinding");
                        abstractC29763d72 = null;
                    }
                    View m74902c2 = abstractC29763d72.f137500U.m74902c(i11);
                    if (m74902c2 != null) {
                        m74902c2.setClickable(false);
                    }
                }
                robotoTextView.setText(ToolStorageDetailView.this.m92689tK().getResources().getQuantityString(AbstractC7921d0.str_selection_count, intValue, Integer.valueOf(intValue), "(" + str + ")"));
            } else {
                int size2 = ToolStorageDetailView.this.f68523b1.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    AbstractC29763d7 abstractC29763d73 = ToolStorageDetailView.this.f68511P0;
                    if (abstractC29763d73 == null) {
                        AbstractC19074t.m100223u("mBinding");
                        abstractC29763d73 = null;
                    }
                    View m74902c3 = abstractC29763d73.f137500U.m74902c(i12);
                    if (m74902c3 != null) {
                        m74902c3.setAlpha(1.0f);
                    }
                    AbstractC29763d7 abstractC29763d74 = ToolStorageDetailView.this.f68511P0;
                    if (abstractC29763d74 == null) {
                        AbstractC19074t.m100223u("mBinding");
                        abstractC29763d74 = null;
                    }
                    View m74902c4 = abstractC29763d74.f137500U.m74902c(i12);
                    if (m74902c4 != null) {
                        m74902c4.setClickable(true);
                    }
                }
                robotoTextView.setText(ToolStorageDetailView.this.m92689tK().getResources().getQuantityString(AbstractC7921d0.str_selection_count, 1, 0, ""));
            }
            ToolStorageDetailView.this.m74941QN();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m75010a((C24860q) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$l */
    /* loaded from: classes6.dex */
    public static final class C13360l extends AbstractC19075u implements InterfaceC18505l {
        C13360l() {
            super(1);
        }

        /* renamed from: a */
        public final void m75011a(String str) {
            AbstractC29763d7 abstractC29763d7 = ToolStorageDetailView.this.f68511P0;
            if (abstractC29763d7 == null) {
                AbstractC19074t.m100223u("mBinding");
                abstractC29763d7 = null;
            }
            RobotoTextView robotoTextView = abstractC29763d7.f137506a0;
            ToolStorageDetailFilterBottomSheet.C13332a c13332a = ToolStorageDetailFilterBottomSheet.Companion;
            Context m92689tK = ToolStorageDetailView.this.m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            AbstractC19074t.m100205c(str);
            robotoTextView.setText(c13332a.m74844a(m92689tK, str));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m75011a((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$m */
    /* loaded from: classes6.dex */
    public static final class C13361m implements ToolStorageDetailPage.InterfaceC13335c {
        C13361m() {
        }

        @Override // com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailPage.InterfaceC13335c
        /* renamed from: a */
        public void mo74888a(int i11, String str) {
            AbstractC19074t.m100208f(str, "tabType");
            if (AbstractC19074t.m100204b(str, ToolStorageDetailView.this.f68523b1.get(ToolStorageDetailView.this.f68514S0))) {
                ToolStorageDetailView.this.m74941QN();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$n */
    /* loaded from: classes6.dex */
    public static final class C13362n extends ViewPager.C6879n {
        C13362n() {
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            ZaloView zaloView;
            try {
                C13385f c13385f = ToolStorageDetailView.this.f68524c1;
                ZaloView zaloView2 = null;
                if (c13385f != null) {
                    zaloView = c13385f.m93128x(ToolStorageDetailView.this.f68514S0);
                } else {
                    zaloView = null;
                }
                if (zaloView instanceof ToolStorageDetailPage) {
                    zaloView2 = zaloView;
                }
                if (zaloView2 != null) {
                    ToolStorageDetailView toolStorageDetailView = ToolStorageDetailView.this;
                    toolStorageDetailView.f68515T0 = (ToolStorageDetailPage) zaloView2;
                    ToolStorageDetailPage toolStorageDetailPage = toolStorageDetailView.f68515T0;
                    if (toolStorageDetailPage != null) {
                        toolStorageDetailPage.m74878GM();
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            if (ToolStorageDetailView.this.f68518W0 == ToolStorageDetailPage.EnumC13333a.f68485s) {
                AbstractC26611a m74946WM = ToolStorageDetailView.this.m74946WM();
                AbstractC19074t.m100206d(m74946WM, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.viewmodels.ZCloudManagementViewModel");
                ((C21680s) m74946WM).mo111804o0((String) ToolStorageDetailView.this.f68523b1.get(ToolStorageDetailView.this.f68514S0));
                return;
            }
            ToolStorageDetailView.this.m74946WM().mo111804o0((String) ToolStorageDetailView.this.f68523b1.get(ToolStorageDetailView.this.f68514S0));
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$o */
    /* loaded from: classes6.dex */
    public static final class C13363o implements ToolStorageDetailTabViewLayout.InterfaceC13348b {
        C13363o() {
        }

        @Override // com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailTabViewLayout.InterfaceC13348b
        /* renamed from: a */
        public void mo74907a(int i11) {
            ToolStorageDetailView.this.m74914DN(i11);
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$p */
    /* loaded from: classes6.dex */
    public static final class C13364p implements ZcloudManagementMultiSelectBottomView.InterfaceC13917b {

        /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$p$a */
        /* loaded from: classes6.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ ToolStorageDetailView f68549q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ToolStorageDetailView toolStorageDetailView) {
                super(0);
                this.f68549q = toolStorageDetailView;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final ToolStorageDetailPage mo12V4() {
                ZaloView m93128x;
                C13385f c13385f = this.f68549q.f68524c1;
                if (c13385f == null || (m93128x = c13385f.m93128x(this.f68549q.f68514S0)) == null) {
                    return null;
                }
                if (!(m93128x instanceof ToolStorageDetailPage)) {
                    m93128x = null;
                }
                if (m93128x == null) {
                    return null;
                }
                ToolStorageDetailPage toolStorageDetailPage = (ToolStorageDetailPage) m93128x;
                this.f68549q.f68515T0 = toolStorageDetailPage;
                toolStorageDetailPage.m74881KM(false);
                return toolStorageDetailPage;
            }
        }

        /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$p$b */
        /* loaded from: classes6.dex */
        static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ ToolStorageDetailView f68550q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ToolStorageDetailView toolStorageDetailView) {
                super(1);
                this.f68550q = toolStorageDetailView;
            }

            /* renamed from: a */
            public final void m75019a(C13380a c13380a) {
                AbstractC19074t.m100208f(c13380a, "it");
                this.f68550q.m74953dN(c13380a);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m75019a((C13380a) obj);
                return C24848g0.f119245a;
            }
        }

        /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$p$c */
        /* loaded from: classes6.dex */
        static final class c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ ToolStorageDetailView f68551q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(ToolStorageDetailView toolStorageDetailView) {
                super(0);
                this.f68551q = toolStorageDetailView;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final ToolStorageDetailPage mo12V4() {
                ZaloView m93128x;
                C13385f c13385f = this.f68551q.f68524c1;
                if (c13385f == null || (m93128x = c13385f.m93128x(this.f68551q.f68514S0)) == null) {
                    return null;
                }
                if (!(m93128x instanceof ToolStorageDetailPage)) {
                    m93128x = null;
                }
                if (m93128x == null) {
                    return null;
                }
                ToolStorageDetailPage toolStorageDetailPage = (ToolStorageDetailPage) m93128x;
                this.f68551q.f68515T0 = toolStorageDetailPage;
                toolStorageDetailPage.m74881KM(true);
                return toolStorageDetailPage;
            }
        }

        C13364p() {
        }

        @Override // com.zing.zalo.p077ui.zalocloud.home.ZcloudManagementMultiSelectBottomView.InterfaceC13917b
        /* renamed from: a */
        public void mo75012a() {
            if (ToolStorageDetailView.this.f68518W0 != ToolStorageDetailPage.EnumC13333a.f68483q) {
                ToolStorageDetailView.this.m74923HN();
            } else {
                ToolStorageDetailView.this.m74929KN();
            }
        }

        @Override // com.zing.zalo.p077ui.zalocloud.home.ZcloudManagementMultiSelectBottomView.InterfaceC13917b
        /* renamed from: b */
        public void mo75013b() {
            ToolStorageDetailView.this.m74912CN();
        }

        @Override // com.zing.zalo.p077ui.zalocloud.home.ZcloudManagementMultiSelectBottomView.InterfaceC13917b
        /* renamed from: c */
        public void mo75014c() {
            C13380a c13380a = (C13380a) new ArrayList(ToolStorageDetailView.this.m74946WM().m136590b0()).get(0);
            ToolStorageDetailView toolStorageDetailView = ToolStorageDetailView.this;
            AbstractC19074t.m100205c(c13380a);
            toolStorageDetailView.m74951bN(c13380a, new b(ToolStorageDetailView.this));
        }

        @Override // com.zing.zalo.p077ui.zalocloud.home.ZcloudManagementMultiSelectBottomView.InterfaceC13917b
        /* renamed from: d */
        public void mo75015d() {
            ToolStorageDetailPage toolStorageDetailPage = ToolStorageDetailView.this.f68515T0;
            if (toolStorageDetailPage != null) {
                toolStorageDetailPage.m74881KM(false);
                C24848g0 c24848g0 = C24848g0.f119245a;
            } else {
                new a(ToolStorageDetailView.this);
            }
        }

        @Override // com.zing.zalo.p077ui.zalocloud.home.ZcloudManagementMultiSelectBottomView.InterfaceC13917b
        /* renamed from: e */
        public void mo75016e() {
            ToolStorageDetailView.this.m74946WM().m136598k0();
        }

        @Override // com.zing.zalo.p077ui.zalocloud.home.ZcloudManagementMultiSelectBottomView.InterfaceC13917b
        /* renamed from: f */
        public void mo75017f() {
            ToolStorageDetailPage toolStorageDetailPage = ToolStorageDetailView.this.f68515T0;
            if (toolStorageDetailPage != null) {
                toolStorageDetailPage.m74881KM(true);
                C24848g0 c24848g0 = C24848g0.f119245a;
            } else {
                new c(ToolStorageDetailView.this);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$q */
    /* loaded from: classes6.dex */
    static final class C13365q extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$q$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f68553a;

            static {
                int[] iArr = new int[ToolStorageDetailPage.EnumC13333a.values().length];
                try {
                    iArr[ToolStorageDetailPage.EnumC13333a.f68483q.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ToolStorageDetailPage.EnumC13333a.f68484r.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ToolStorageDetailPage.EnumC13333a.f68485s.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f68553a = iArr;
            }
        }

        C13365q() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final AbstractC26611a mo12V4() {
            int i11 = a.f68553a[ToolStorageDetailView.this.f68518W0.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        return (AbstractC26611a) new C1802w0(ToolStorageDetailView.this, C26612b.Companion.m136634a()).m9378a(C21680s.class);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return (AbstractC26611a) new C1802w0(ToolStorageDetailView.this, C26612b.Companion.m136634a()).m9378a(C27114d2.class);
            }
            return (AbstractC26611a) new C1802w0(ToolStorageDetailView.this, C26612b.Companion.m136634a()).m9378a(C28897w.class);
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$r */
    /* loaded from: classes6.dex */
    static final class C13366r extends AbstractC19075u implements InterfaceC18494a {
        C13366r() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final LinearLayout mo12V4() {
            LinearLayout linearLayout = new LinearLayout(ToolStorageDetailView.this.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setGravity(16);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            Context context = linearLayout.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            RobotoTextView robotoTextView = new RobotoTextView(context);
            robotoTextView.setId(ZAbstractBase.ZVU_PROCESS_FLUSH);
            Context context2 = robotoTextView.getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            new C26708g(robotoTextView).m137319a(C26705d.m137293a(context2, AbstractC2814h.header_text_title));
            robotoTextView.setTextColor(C23212s8.m119606n(AbstractC2807a.text_01));
            linearLayout.addView(robotoTextView);
            Context context3 = linearLayout.getContext();
            AbstractC19074t.m100207e(context3, "getContext(...)");
            RobotoTextView robotoTextView2 = new RobotoTextView(context3);
            robotoTextView2.setId(3000);
            Context context4 = robotoTextView2.getContext();
            AbstractC19074t.m100207e(context4, "getContext(...)");
            new C26708g(robotoTextView2).m137319a(C26705d.m137293a(context4, AbstractC2814h.header_text_subtitle));
            robotoTextView2.setTextColor(C23212s8.m119607o(robotoTextView2.getContext(), AbstractC2807a.header_white_subtitle));
            linearLayout.addView(robotoTextView2);
            return linearLayout;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$s */
    /* loaded from: classes6.dex */
    public static final class C13367s extends AbstractC19075u implements InterfaceC18505l {
        C13367s() {
            super(1);
        }

        /* renamed from: a */
        public final void m75023a(Boolean bool) {
            AbstractC19074t.m100205c(bool);
            if (bool.booleanValue()) {
                ToolStorageDetailView.this.mo49282B8(null, false);
            } else {
                ToolStorageDetailView.this.mo49315c4();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m75023a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$t */
    /* loaded from: classes6.dex */
    public static final class C13368t extends SimpleAnimationTarget {
        C13368t() {
        }

        @Override // com.showingphotolib.view.SimpleAnimationTarget, com.zing.zalo.zview.animation.AnimationTarget
        public Rect getAnimTargetLocationOnScreen() {
            return new Rect(0, 0, 0, 0);
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$u */
    /* loaded from: classes6.dex */
    public static final class C13369u implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f68556p;

        C13369u(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f68556p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f68556p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f68556p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$v */
    /* loaded from: classes6.dex */
    public static final class C13370v extends AbstractC19075u implements InterfaceC18494a {
        C13370v() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m75024a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m75024a() {
            ToolStorageDetailView toolStorageDetailView = ToolStorageDetailView.this;
            Snackbar.C16925c c16925c = Snackbar.Companion;
            View m92691vK = toolStorageDetailView.m92691vK();
            AbstractC19074t.m100207e(m92691vK, "requireView(...)");
            ToolStorageDetailView toolStorageDetailView2 = ToolStorageDetailView.this;
            String m92653YI = toolStorageDetailView2.m92653YI(AbstractC8020f0.str_tool_storage_usage_detail_saving_count_items, toolStorageDetailView2.m74946WM().m136589a0().m129215c());
            AbstractC19074t.m100207e(m92653YI, "getString(...)");
            Snackbar m90669d = c16925c.m90669d(m92691vK, m92653YI, -2);
            m90669d.m90646L(true, false);
            m90669d.m90648N();
            toolStorageDetailView.f68512Q0 = m90669d;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$w */
    /* loaded from: classes6.dex */
    public static final class C13371w extends AbstractC19075u implements InterfaceC18509p {
        C13371w() {
            super(2);
        }

        /* renamed from: a */
        public final void m75025a(int i11, int i12) {
            float f11 = (i12 / i11) * 100.0f;
            Snackbar snackbar = ToolStorageDetailView.this.f68512Q0;
            if (snackbar != null) {
                snackbar.m90651R(f11);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m75025a(((Number) obj).intValue(), ((Number) obj2).intValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$x */
    /* loaded from: classes6.dex */
    public static final class C13372x extends AbstractC19075u implements InterfaceC18505l {
        C13372x() {
            super(1);
        }

        /* renamed from: a */
        public final void m75026a(int i11) {
            String m92653YI;
            Snackbar snackbar = ToolStorageDetailView.this.f68512Q0;
            if (snackbar != null) {
                ToolStorageDetailView toolStorageDetailView = ToolStorageDetailView.this;
                snackbar.m90646L(false, false);
                Context m92689tK = toolStorageDetailView.m92689tK();
                AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                snackbar.m90644J(C27280g.m139659b(m92689tK, AbstractC23322a.zds_ic_check_circle_solid_24, AbstractC2808b.gr60));
                if (i11 == 1) {
                    m92653YI = toolStorageDetailView.m92653YI(AbstractC8020f0.str_tool_storage_usage_detail_saved_count_item, Integer.valueOf(i11));
                } else {
                    m92653YI = toolStorageDetailView.m92653YI(AbstractC8020f0.str_tool_storage_usage_detail_saved_count_items, Integer.valueOf(i11));
                }
                AbstractC19074t.m100205c(m92653YI);
                snackbar.m90647M(m92653YI);
                snackbar.m90642H(-1);
                snackbar.m90648N();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m75026a(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$y */
    /* loaded from: classes6.dex */
    public static final class C13373y extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f68560t;

        /* renamed from: v */
        final /* synthetic */ C13380a f68562v;

        /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$y$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f68563t;

            /* renamed from: u */
            final /* synthetic */ ToolStorageDetailView f68564u;

            /* renamed from: v */
            final /* synthetic */ Bundle f68565v;

            /* renamed from: w */
            final /* synthetic */ int f68566w;

            /* renamed from: x */
            final /* synthetic */ String f68567x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ToolStorageDetailView toolStorageDetailView, Bundle bundle, int i11, String str, Continuation continuation) {
                super(2, continuation);
                this.f68564u = toolStorageDetailView;
                this.f68565v = bundle;
                this.f68566w = i11;
                this.f68567x = str;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f68564u, this.f68565v, this.f68566w, this.f68567x, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f68563t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f68564u.mo49315c4();
                    this.f68564u.m74993yN(this.f68565v, this.f68566w, this.f68567x);
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$y$b */
        /* loaded from: classes6.dex */
        public /* synthetic */ class b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f68568a;

            static {
                int[] iArr = new int[ToolStorageDetailPage.EnumC13333a.values().length];
                try {
                    iArr[ToolStorageDetailPage.EnumC13333a.f68485s.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f68568a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13373y(C13380a c13380a, Continuation continuation) {
            super(2, continuation);
            this.f68562v = c13380a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C13373y(this.f68562v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Iterable m131194T0;
            Object obj2;
            String m75088j;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f68560t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                ToolStorageDetailView toolStorageDetailView = ToolStorageDetailView.this;
                C13380a c13380a = this.f68562v;
                this.f68560t = 1;
                obj = toolStorageDetailView.m74947XM(c13380a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            ArrayList<? extends Parcelable> arrayList = (ArrayList) obj;
            m131194T0 = AbstractC25332a0.m131194T0(arrayList);
            ToolStorageDetailView toolStorageDetailView2 = ToolStorageDetailView.this;
            C13380a c13380a2 = this.f68562v;
            Iterator it = m131194T0.iterator();
            while (true) {
                obj2 = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String str = ((ItemAlbumMobile) ((C25345g0) next).m131264b()).f42595r;
                if (b.f68568a[toolStorageDetailView2.f68518W0.ordinal()] == 1) {
                    C25821b m75082d = c13380a2.m75082d();
                    if (m75082d != null) {
                        obj2 = m75082d.m133141d();
                    }
                } else {
                    obj2 = c13380a2.m75081a();
                }
                if (AbstractC19074t.m100204b(str, obj2)) {
                    obj2 = next;
                    break;
                }
            }
            C25345g0 c25345g0 = (C25345g0) obj2;
            if (c25345g0 != null) {
                int m131263a = c25345g0.m131263a();
                Bundle bundle = new Bundle();
                C13380a c13380a3 = this.f68562v;
                ToolStorageDetailView toolStorageDetailView3 = ToolStorageDetailView.this;
                bundle.putParcelableArrayList("medialist", arrayList);
                bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 10);
                bundle.putInt("currentIndex", m131263a);
                bundle.putString("EXTRA_STR_CONVERSATION_ID", c13380a3.m75091m());
                bundle.putBoolean("EXTRA_BOL_HIDE_LAYOUT_BOTTOM", true);
                bundle.putBoolean("extra_is_group", c13380a3.m75101w());
                bundle.putBoolean("EXTRA_BOL_IS_ENABLE_SNAPSHOT", false);
                bundle.putInt("EXTRA_INT_SUB_TITLE_MODE", 1);
                bundle.putSerializable("EXTRA_ACCESS_FLOW", toolStorageDetailView3.f68518W0);
                C17945a0 m75089k = this.f68562v.m75089k();
                if (m75089k != null && m75089k.m95306y8()) {
                    m75088j = this.f68562v.m75089k().m95266u2();
                } else {
                    m75088j = this.f68562v.m75088j();
                }
                String str2 = m75088j;
                AbstractC19074t.m100205c(str2);
                MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                a aVar = new a(ToolStorageDetailView.this, bundle, m131263a, str2, null);
                this.f68560t = 2;
                if (BuildersKt.m112534g(m112681c, aVar, this) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }
            ToolStorageDetailView.this.mo49315c4();
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C13373y) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView$z */
    /* loaded from: classes6.dex */
    public static final class C13374z extends AbstractC18391a {
        C13374z() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    public ToolStorageDetailView() {
        InterfaceC24854k m129210a;
        List m131505m;
        ArrayList m131500h;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(new C13365q());
        this.f68521Z0 = m129210a;
        m131505m = AbstractC25368s.m131505m("Largest", "Newest", "Oldest");
        this.f68522a1 = m131505m;
        m131500h = AbstractC25368s.m131500h("All", "Photos", "Videos", "File");
        this.f68523b1 = m131500h;
        m129210a2 = AbstractC24856m.m129210a(new C13366r());
        this.f68525d1 = m129210a2;
        this.f68526e1 = new C13374z();
    }

    /* renamed from: BN */
    private final void m74910BN(String str, String str2) {
        C26676b.m136957g("CommonZaloview", "Open local file with path: " + str, null, 4, null);
        try {
            AbstractC23152n3.m119038d0(m92689tK(), new C20556f(str), str2);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: CN */
    public final void m74912CN() {
        if (!AbstractC23034c6.m118118E()) {
            AbstractC23034c6.m118184v0(this, AbstractC23034c6.f112029f, 154);
        } else {
            m74946WM().m136600n0(m74949ZM(), new C13370v(), new C13371w(), new C13372x());
        }
    }

    /* renamed from: DN */
    public final void m74914DN(int i11) {
        ThreadStorageInfo threadStorageInfo;
        this.f68514S0 = i11;
        AbstractC29763d7 abstractC29763d7 = this.f68511P0;
        String str = null;
        if (abstractC29763d7 == null) {
            AbstractC19074t.m100223u("mBinding");
            abstractC29763d7 = null;
        }
        if (abstractC29763d7.f137507b0.getCurrentItem() != i11) {
            m74917Ez(i11);
            AbstractC29763d7 abstractC29763d72 = this.f68511P0;
            if (abstractC29763d72 == null) {
                AbstractC19074t.m100223u("mBinding");
                abstractC29763d72 = null;
            }
            abstractC29763d72.f137507b0.setCurrentItem(i11);
            if (this.f68518W0 == ToolStorageDetailPage.EnumC13333a.f68485s) {
                C26676b c26676b = C26676b.f126324a;
                C13463a c13463a = this.f68517V0;
                if (c13463a != null && (threadStorageInfo = c13463a.f68922c) != null) {
                    str = threadStorageInfo.m74822z();
                }
                c26676b.m136997j0(TextUtils.isEmpty(str), (String) this.f68523b1.get(i11));
            }
        }
    }

    /* renamed from: EN */
    public final void m74916EN() {
        Intent intent = new Intent();
        intent.putExtra("need_reload", true);
        mo50035CK(-1, intent);
    }

    /* renamed from: Ez */
    private final void m74917Ez(int i11) {
        try {
            AbstractC29763d7 abstractC29763d7 = this.f68511P0;
            if (abstractC29763d7 == null) {
                AbstractC19074t.m100223u("mBinding");
                abstractC29763d7 = null;
            }
            abstractC29763d7.f137500U.m74906i(i11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: FN */
    private final void m74919FN() {
        String m74945VM;
        String str;
        ThreadStorageInfo threadStorageInfo;
        int i11 = C13350b.f68527a[this.f68518W0.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    C13463a c13463a = this.f68517V0;
                    if (c13463a != null && (threadStorageInfo = c13463a.f68922c) != null) {
                        str = threadStorageInfo.m74822z();
                    } else {
                        str = null;
                    }
                    if (TextUtils.isEmpty(str)) {
                        m74945VM = m74945VM("DATE_FIRST_TIME_VISIT_ZCLOUD_MANAGE_ALL");
                    } else {
                        m74945VM = m74945VM("DATE_FIRST_TIME_VISIT_ZCLOUD_MANAGE_THREAD");
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                m74945VM = m74945VM("FIRST_TIME_VISIT_QUOTA_CLEANER");
            }
            C0697c0.Companion.m1052f(this, "first_time", m74945VM);
        }
    }

    /* renamed from: GN */
    private final void m74921GN() {
        try {
            m92693xK().mo89694j2(MyCloudQuotaOnBoardBottomSheet.class, new Bundle(), 1000, MyCloudQuotaOnBoardBottomSheet.Companion.m70262a(), 1, true);
            AbstractC0924m0.m3847gl(true);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: wa0.t.<init>(com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView, java.lang.String):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: HN */
    public final void m74923HN() {
        /*
            r11 = this;
            ta0.a r0 = r11.m74946WM()     // Catch: java.lang.Exception -> L58
            pm0.q r0 = r0.m136589a0()     // Catch: java.lang.Exception -> L58
            java.lang.Object r1 = r0.m129216d()     // Catch: java.lang.Exception -> L58
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L58
            java.lang.Object r0 = r0.m129215c()     // Catch: java.lang.Exception -> L58
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Exception -> L58
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L58
            com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailPage$a r2 = r11.f68518W0     // Catch: java.lang.Exception -> L58
            com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailPage$a r3 = com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailPage.EnumC13333a.f68484r     // Catch: java.lang.Exception -> L58
            java.lang.String r4 = "getQuantityString(...)"
            r5 = 0
            java.lang.String r6 = "getString(...)"
            r7 = 1
            if (r2 != r3) goto L5b
            android.content.res.Resources r2 = r11.m92651WI()     // Catch: java.lang.Exception -> L58
            int r3 = com.zing.zalo.AbstractC7921d0.str_delete_my_cloud_item_title     // Catch: java.lang.Exception -> L58
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L58
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L58
            r8[r5] = r9     // Catch: java.lang.Exception -> L58
            java.lang.String r0 = r2.getQuantityString(r3, r0, r8)     // Catch: java.lang.Exception -> L58
            fn0.AbstractC19074t.m100207e(r0, r4)     // Catch: java.lang.Exception -> L58
            android.content.res.Resources r2 = r11.m92651WI()     // Catch: java.lang.Exception -> L58
            int r3 = com.zing.zalo.AbstractC8020f0.str_delete_my_cloud_item_desc     // Catch: java.lang.Exception -> L58
            java.lang.String r2 = r2.getString(r3)     // Catch: java.lang.Exception -> L58
            fn0.AbstractC19074t.m100207e(r2, r6)     // Catch: java.lang.Exception -> L58
            android.content.res.Resources r3 = r11.m92651WI()     // Catch: java.lang.Exception -> L58
            int r4 = com.zing.zalo.AbstractC8020f0.str_delete_my_cloud_btn_delete     // Catch: java.lang.Exception -> L58
            java.lang.String r3 = r3.getString(r4)     // Catch: java.lang.Exception -> L58
            fn0.AbstractC19074t.m100207e(r3, r6)     // Catch: java.lang.Exception -> L58
            java.lang.String r4 = ""
            r5 = r4
            r6 = r5
            goto Laf
        L58:
            r0 = move-exception
            goto Lf6
        L5b:
            android.content.res.Resources r2 = r11.m92651WI()     // Catch: java.lang.Exception -> L58
            int r3 = com.zing.zalo.AbstractC7921d0.str_delete_zcloud_item_title     // Catch: java.lang.Exception -> L58
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L58
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L58
            r8[r5] = r9     // Catch: java.lang.Exception -> L58
            java.lang.String r0 = r2.getQuantityString(r3, r0, r8)     // Catch: java.lang.Exception -> L58
            fn0.AbstractC19074t.m100207e(r0, r4)     // Catch: java.lang.Exception -> L58
            android.content.res.Resources r2 = r11.m92651WI()     // Catch: java.lang.Exception -> L58
            int r3 = com.zing.zalo.AbstractC8020f0.str_delete_zcloud_item_desc     // Catch: java.lang.Exception -> L58
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L58
            r4[r5] = r1     // Catch: java.lang.Exception -> L58
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Exception -> L58
            fn0.AbstractC19074t.m100207e(r2, r6)     // Catch: java.lang.Exception -> L58
            android.content.res.Resources r3 = r11.m92651WI()     // Catch: java.lang.Exception -> L58
            int r4 = com.zing.zalo.AbstractC8020f0.str_delete     // Catch: java.lang.Exception -> L58
            java.lang.String r3 = r3.getString(r4)     // Catch: java.lang.Exception -> L58
            fn0.AbstractC19074t.m100207e(r3, r6)     // Catch: java.lang.Exception -> L58
            com.zing.zalo.ui.toolstoragev1.detail.a r4 = r11.f68517V0     // Catch: java.lang.Exception -> L58
            if (r4 == 0) goto L9b
            com.zing.zalo.ui.toolstorage.ThreadStorageInfo r4 = r4.f68922c     // Catch: java.lang.Exception -> L58
            if (r4 == 0) goto L9b
            java.lang.String r4 = r4.m74822z()     // Catch: java.lang.Exception -> L58
            goto L9c
        L9b:
            r4 = 0
        L9c:
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L58
            if (r4 == 0) goto La9
            java.lang.String r4 = "zcloud_manage_all_confirm_delete_dialog"
            java.lang.String r5 = "zcloud_manage_all_confirm_delete_yes"
            java.lang.String r6 = "zcloud_manage_all_confirm_delete_cancel"
            goto Laf
        La9:
            java.lang.String r4 = "zcloud_manage_thread_confirm_delete_dialog"
            java.lang.String r5 = "zcloud_manage_thread_confirm_delete_yes"
            java.lang.String r6 = "zcloud_manage_thread_confirm_delete_cancel"
        Laf:
            com.zing.zalo.zdesign.component.e0$a r8 = new com.zing.zalo.zdesign.component.e0$a     // Catch: java.lang.Exception -> L58
            android.content.Context r9 = r11.m92689tK()     // Catch: java.lang.Exception -> L58
            java.lang.String r10 = "requireContext(...)"
            fn0.AbstractC19074t.m100207e(r9, r10)     // Catch: java.lang.Exception -> L58
            r8.<init>(r9)     // Catch: java.lang.Exception -> L58
            com.zing.zalo.zdesign.component.e0$b r9 = com.zing.zalo.zdesign.component.C16972e0.b.DIALOG_INFORMATION     // Catch: java.lang.Exception -> L58
            com.zing.zalo.zdesign.component.e0$a r8 = r8.m90932i(r9)     // Catch: java.lang.Exception -> L58
            com.zing.zalo.zdesign.component.e0$a r0 = r8.m90918B(r0)     // Catch: java.lang.Exception -> L58
            com.zing.zalo.zdesign.component.e0$a r0 = r0.m90949z(r2)     // Catch: java.lang.Exception -> L58
            com.zing.zalo.zdesign.component.e0$a r0 = r0.m90921E(r7)     // Catch: java.lang.Exception -> L58
            com.zing.zalo.zdesign.component.e0$a r0 = r0.m90931h(r4)     // Catch: java.lang.Exception -> L58
            com.zing.zalo.zdesign.component.e0$a r0 = r0.m90947x(r5)     // Catch: java.lang.Exception -> L58
            wa0.t r2 = new wa0.t     // Catch: java.lang.Exception -> L58
            r2.<init>()     // Catch: java.lang.Exception -> L58
            com.zing.zalo.zdesign.component.e0$a r0 = r0.m90943t(r3, r2)     // Catch: java.lang.Exception -> L58
            com.zing.zalo.zdesign.component.e0$a r0 = r0.m90937n(r6)     // Catch: java.lang.Exception -> L58
            int r1 = com.zing.zalo.AbstractC8020f0.str_cancel     // Catch: java.lang.Exception -> L58
            wa0.u r2 = new wa0.u     // Catch: java.lang.Exception -> L58
            r2.<init>()     // Catch: java.lang.Exception -> L58
            com.zing.zalo.zdesign.component.e0$a r0 = r0.m90933j(r1, r2)     // Catch: java.lang.Exception -> L58
            com.zing.zalo.zdesign.component.e0 r0 = r0.m90923G()     // Catch: java.lang.Exception -> L58
            r11.f68516U0 = r0     // Catch: java.lang.Exception -> L58
            goto Lfb
        Lf6:
            java.lang.String r1 = "CommonZaloview"
            mm0.AbstractC23350e.m122776f(r1, r0)
        Lfb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailView.m74923HN():void");
    }

    /* renamed from: IN */
    public static final void m74925IN(ToolStorageDetailView toolStorageDetailView, String str, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(toolStorageDetailView, "this$0");
        AbstractC19074t.m100208f(str, "$totalItemSize");
        try {
            toolStorageDetailView.m74944TM(str);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommonZaloview", e11);
        }
    }

    /* renamed from: JN */
    public static final void m74927JN(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: wa0.v.<init>(com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView, java.lang.String):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: KN */
    public final void m74929KN() {
        /*
            r7 = this;
            ta0.a r0 = r7.m74946WM()     // Catch: java.lang.Exception -> L23
            pm0.q r0 = r0.m136589a0()     // Catch: java.lang.Exception -> L23
            java.lang.Object r1 = r0.m129215c()     // Catch: java.lang.Exception -> L23
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Exception -> L23
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L23
            java.lang.Object r0 = r0.m129216d()     // Catch: java.lang.Exception -> L23
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L23
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L26
            int r1 = com.zing.zalo.AbstractC8020f0.str_confirm_delete_multi_item_media_title2_single     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = r7.m92652XI(r1)     // Catch: java.lang.Exception -> L23
            goto L34
        L23:
            r0 = move-exception
            goto Lb3
        L26:
            int r4 = com.zing.zalo.AbstractC8020f0.str_tool_storage_usage_detail_delete_items_popup     // Catch: java.lang.Exception -> L23
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L23
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L23
            r5[r2] = r1     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = r7.m92653YI(r4, r5)     // Catch: java.lang.Exception -> L23
        L34:
            int r4 = com.zing.zalo.AbstractC8020f0.str_tool_storage_overview_free_up_storage     // Catch: java.lang.Exception -> L23
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L23
            r5[r2] = r0     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = r7.m92653YI(r4, r5)     // Catch: java.lang.Exception -> L23
            int r4 = com.zing.zalo.AbstractC8020f0.str_tool_storage_detail_warning_delete_referred_files     // Catch: java.lang.Exception -> L23
            java.lang.String r4 = r7.m92652XI(r4)     // Catch: java.lang.Exception -> L23
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23
            r5.<init>()     // Catch: java.lang.Exception -> L23
            r5.append(r2)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = "<br><br>"
            r5.append(r2)     // Catch: java.lang.Exception -> L23
            r5.append(r4)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Exception -> L23
            com.zing.zalo.zdesign.component.e0$a r4 = new com.zing.zalo.zdesign.component.e0$a     // Catch: java.lang.Exception -> L23
            android.content.Context r5 = r7.m92689tK()     // Catch: java.lang.Exception -> L23
            java.lang.String r6 = "requireContext(...)"
            fn0.AbstractC19074t.m100207e(r5, r6)     // Catch: java.lang.Exception -> L23
            r4.<init>(r5)     // Catch: java.lang.Exception -> L23
            com.zing.zalo.zdesign.component.e0$b r5 = com.zing.zalo.zdesign.component.C16972e0.b.DIALOG_INFORMATION     // Catch: java.lang.Exception -> L23
            com.zing.zalo.zdesign.component.e0$a r4 = r4.m90932i(r5)     // Catch: java.lang.Exception -> L23
            fn0.AbstractC19074t.m100205c(r1)     // Catch: java.lang.Exception -> L23
            com.zing.zalo.zdesign.component.e0$a r1 = r4.m90918B(r1)     // Catch: java.lang.Exception -> L23
            android.text.Spanned r2 = me0.AbstractC23244v8.m119746j(r2)     // Catch: java.lang.Exception -> L23
            java.lang.String r4 = "getSpannedFromStrHtml(...)"
            fn0.AbstractC19074t.m100207e(r2, r4)     // Catch: java.lang.Exception -> L23
            com.zing.zalo.zdesign.component.e0$a r1 = r1.m90949z(r2)     // Catch: java.lang.Exception -> L23
            com.zing.zalo.zdesign.component.e0$a r1 = r1.m90921E(r3)     // Catch: java.lang.Exception -> L23
            int r2 = com.zing.zalo.AbstractC8020f0.str_delete     // Catch: java.lang.Exception -> L23
            wa0.v r3 = new wa0.v     // Catch: java.lang.Exception -> L23
            r3.<init>()     // Catch: java.lang.Exception -> L23
            com.zing.zalo.zdesign.component.e0$a r0 = r1.m90942s(r2, r3)     // Catch: java.lang.Exception -> L23
            int r1 = com.zing.zalo.AbstractC8020f0.cancel     // Catch: java.lang.Exception -> L23
            wa0.k r2 = new wa0.k     // Catch: java.lang.Exception -> L23
            r2.<init>()     // Catch: java.lang.Exception -> L23
            com.zing.zalo.zdesign.component.e0$a r0 = r0.m90933j(r1, r2)     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = "delete_data_dialog"
            com.zing.zalo.zdesign.component.e0$a r0 = r0.m90931h(r1)     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = "delete_only_media_button"
            com.zing.zalo.zdesign.component.e0$a r0 = r0.m90947x(r1)     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = "close_dialog_button"
            com.zing.zalo.zdesign.component.e0$a r0 = r0.m90937n(r1)     // Catch: java.lang.Exception -> L23
            com.zing.zalo.zdesign.component.e0 r0 = r0.m90923G()     // Catch: java.lang.Exception -> L23
            r7.f68516U0 = r0     // Catch: java.lang.Exception -> L23
            goto Lb8
        Lb3:
            java.lang.String r1 = "CommonZaloview"
            mm0.AbstractC23350e.m122776f(r1, r0)
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailView.m74929KN():void");
    }

    /* renamed from: LN */
    public static final void m74931LN(ToolStorageDetailView toolStorageDetailView, String str, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(toolStorageDetailView, "this$0");
        AbstractC19074t.m100208f(str, "$totalItemSize");
        toolStorageDetailView.m74944TM(str);
    }

    /* renamed from: MN */
    public static final void m74933MN(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    /* renamed from: NN */
    private final void m74935NN() {
        try {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("EXTRA_PARAM_LIST_FILTER", new ArrayList<>(this.f68522a1));
            bundle.putInt("EXTRA_PARAM_SELECTED_POS", this.f68522a1.indexOf(m74946WM().m136586X()));
            m92693xK().mo89694j2(ToolStorageDetailFilterBottomSheet.class, bundle, 1000, ToolStorageDetailFilterBottomSheet.Companion.m74845b(), 1, true);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: ON */
    private final void m74937ON(C13380a c13380a) {
        mo49282B8(null, false);
        BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(this), null, null, new C13373y(c13380a, null), 3, null);
    }

    /* renamed from: PN */
    private final void m74939PN(C13380a c13380a) {
        List m74950aN = m74950aN(c13380a);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("voice_list", new ArrayList<>(m74950aN));
        Iterator it = m74950aN.iterator();
        int i11 = 0;
        while (true) {
            if (it.hasNext()) {
                if (AbstractC19074t.m100204b(((VoiceViewerItem) it.next()).m75063e(), c13380a.m75090l())) {
                    break;
                } else {
                    i11++;
                }
            } else {
                i11 = -1;
                break;
            }
        }
        bundle.putInt("select_pos", i11);
        bundle.putString("EXTRA_TYPE", this.f68518W0.m74885c());
        m74995zN(bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* renamed from: QN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m74941QN() {
        ZaloView m93128x;
        boolean m74877DM;
        ToolStorageDetailPage toolStorageDetailPage = this.f68515T0;
        ZcloudManagementMultiSelectBottomView zcloudManagementMultiSelectBottomView = null;
        if (toolStorageDetailPage != null) {
            m74877DM = toolStorageDetailPage.m74877DM();
        } else {
            C13385f c13385f = this.f68524c1;
            if (c13385f != null && (m93128x = c13385f.m93128x(this.f68514S0)) != null) {
                if (!(m93128x instanceof ToolStorageDetailPage)) {
                    m93128x = null;
                }
                if (m93128x != null) {
                    ToolStorageDetailPage toolStorageDetailPage2 = (ToolStorageDetailPage) m93128x;
                    this.f68515T0 = toolStorageDetailPage2;
                    m74877DM = toolStorageDetailPage2.m74877DM();
                }
            }
            if (m74946WM().m136590b0().size() < 2) {
                ZcloudManagementMultiSelectBottomView zcloudManagementMultiSelectBottomView2 = this.f68513R0;
                if (zcloudManagementMultiSelectBottomView2 == null) {
                    AbstractC19074t.m100223u("multiSelectBottomView");
                } else {
                    zcloudManagementMultiSelectBottomView = zcloudManagementMultiSelectBottomView2;
                }
                zcloudManagementMultiSelectBottomView.m77425w();
                return;
            }
            if (m74946WM().m136590b0().size() > 0) {
                ZcloudManagementMultiSelectBottomView zcloudManagementMultiSelectBottomView3 = this.f68513R0;
                if (zcloudManagementMultiSelectBottomView3 == null) {
                    AbstractC19074t.m100223u("multiSelectBottomView");
                    zcloudManagementMultiSelectBottomView3 = null;
                }
                zcloudManagementMultiSelectBottomView3.setEnableAllBtn(true);
                ZcloudManagementMultiSelectBottomView zcloudManagementMultiSelectBottomView4 = this.f68513R0;
                if (zcloudManagementMultiSelectBottomView4 == null) {
                    AbstractC19074t.m100223u("multiSelectBottomView");
                } else {
                    zcloudManagementMultiSelectBottomView = zcloudManagementMultiSelectBottomView4;
                }
                zcloudManagementMultiSelectBottomView.m77423u();
                return;
            }
            ZcloudManagementMultiSelectBottomView zcloudManagementMultiSelectBottomView5 = this.f68513R0;
            if (zcloudManagementMultiSelectBottomView5 == null) {
                AbstractC19074t.m100223u("multiSelectBottomView");
                zcloudManagementMultiSelectBottomView5 = null;
            }
            zcloudManagementMultiSelectBottomView5.setEnableAllBtn(false);
            ZcloudManagementMultiSelectBottomView zcloudManagementMultiSelectBottomView6 = this.f68513R0;
            if (zcloudManagementMultiSelectBottomView6 == null) {
                AbstractC19074t.m100223u("multiSelectBottomView");
            } else {
                zcloudManagementMultiSelectBottomView = zcloudManagementMultiSelectBottomView6;
            }
            zcloudManagementMultiSelectBottomView.m77423u();
            return;
        }
        if (m74877DM && m74946WM().m136590b0().size() >= 2) {
            ZcloudManagementMultiSelectBottomView zcloudManagementMultiSelectBottomView7 = this.f68513R0;
            if (zcloudManagementMultiSelectBottomView7 == null) {
                AbstractC19074t.m100223u("multiSelectBottomView");
            } else {
                zcloudManagementMultiSelectBottomView = zcloudManagementMultiSelectBottomView7;
            }
            zcloudManagementMultiSelectBottomView.m77424v();
            return;
        }
        if (m74946WM().m136590b0().size() < 2) {
        }
    }

    /* renamed from: SM */
    public final void m74943SM(ThreadStorageInfo threadStorageInfo) {
        String m118743r0;
        String m118743r02;
        String m118743r03;
        String m118743r04;
        String m118743r05;
        AbstractC29763d7 abstractC29763d7 = this.f68511P0;
        if (abstractC29763d7 == null) {
            AbstractC19074t.m100223u("mBinding");
            abstractC29763d7 = null;
        }
        RobotoTextView m74904f = abstractC29763d7.f137500U.m74904f("All");
        if (m74904f != null) {
            long m74768C = threadStorageInfo.m74768C() + threadStorageInfo.m74781T() + threadStorageInfo.m74816t() + threadStorageInfo.m74783V();
            if (m74768C > 0) {
                m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tool_storage_usage_detail_tab_all) + " (" + C21459a.m111038f(m74768C, 0, 2, null) + ")";
            } else {
                m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tool_storage_usage_detail_tab_all);
            }
            m74904f.setText(m118743r05);
        }
        AbstractC29763d7 abstractC29763d72 = this.f68511P0;
        if (abstractC29763d72 == null) {
            AbstractC19074t.m100223u("mBinding");
            abstractC29763d72 = null;
        }
        RobotoTextView m74904f2 = abstractC29763d72.f137500U.m74904f("Photos");
        if (m74904f2 != null) {
            if (threadStorageInfo.m74768C() > 0) {
                String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tool_storage_usage_detail_tab_photo_with_size);
                AbstractC19074t.m100207e(m118743r06, "getString(...)");
                m118743r04 = String.format(m118743r06, Arrays.copyOf(new Object[]{C21459a.m111038f(threadStorageInfo.m74768C(), 0, 2, null)}, 1));
                AbstractC19074t.m100207e(m118743r04, "format(...)");
            } else {
                m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tool_storage_usage_detail_tab_photo);
            }
            m74904f2.setText(m118743r04);
        }
        AbstractC29763d7 abstractC29763d73 = this.f68511P0;
        if (abstractC29763d73 == null) {
            AbstractC19074t.m100223u("mBinding");
            abstractC29763d73 = null;
        }
        RobotoTextView m74904f3 = abstractC29763d73.f137500U.m74904f("Videos");
        if (m74904f3 != null) {
            if (threadStorageInfo.m74781T() > 0) {
                String m118743r07 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tool_storage_usage_detail_tab_video_with_size);
                AbstractC19074t.m100207e(m118743r07, "getString(...)");
                m118743r03 = String.format(m118743r07, Arrays.copyOf(new Object[]{C21459a.m111038f(threadStorageInfo.m74781T(), 0, 2, null)}, 1));
                AbstractC19074t.m100207e(m118743r03, "format(...)");
            } else {
                m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tool_storage_usage_detail_tab_video);
            }
            m74904f3.setText(m118743r03);
        }
        AbstractC29763d7 abstractC29763d74 = this.f68511P0;
        if (abstractC29763d74 == null) {
            AbstractC19074t.m100223u("mBinding");
            abstractC29763d74 = null;
        }
        RobotoTextView m74904f4 = abstractC29763d74.f137500U.m74904f("File");
        if (m74904f4 != null) {
            if (threadStorageInfo.m74816t() > 0) {
                String m118743r08 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tool_storage_usage_detail_tab_files_with_size);
                AbstractC19074t.m100207e(m118743r08, "getString(...)");
                m118743r02 = String.format(m118743r08, Arrays.copyOf(new Object[]{C21459a.m111038f(threadStorageInfo.m74816t(), 0, 2, null)}, 1));
                AbstractC19074t.m100207e(m118743r02, "format(...)");
            } else {
                m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tool_storage_usage_detail_tab_files);
            }
            m74904f4.setText(m118743r02);
        }
        AbstractC29763d7 abstractC29763d75 = this.f68511P0;
        if (abstractC29763d75 == null) {
            AbstractC19074t.m100223u("mBinding");
            abstractC29763d75 = null;
        }
        RobotoTextView m74904f5 = abstractC29763d75.f137500U.m74904f("Voice message");
        if (m74904f5 != null) {
            if (threadStorageInfo.m74783V() > 0) {
                String m118743r09 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tool_storage_usage_detail_tab_voice_message_with_size);
                AbstractC19074t.m100207e(m118743r09, "getString(...)");
                m118743r0 = String.format(m118743r09, Arrays.copyOf(new Object[]{C21459a.m111038f(threadStorageInfo.m74783V(), 0, 2, null)}, 1));
                AbstractC19074t.m100207e(m118743r0, "format(...)");
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tool_storage_usage_detail_tab_voice_message);
            }
            m74904f5.setText(m118743r0);
        }
    }

    /* renamed from: TM */
    private final void m74944TM(String str) {
        try {
            m74946WM().m136583U(m74949ZM(), new C13351c(str));
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommonZaloview", e11);
        }
    }

    /* renamed from: VM */
    private final String m74945VM(String str) {
        String m4126q0;
        int hashCode = str.hashCode();
        if (hashCode != -1655087112) {
            if (hashCode != -798341978) {
                if (hashCode == 2032607333 && str.equals("DATE_FIRST_TIME_VISIT_ZCLOUD_MANAGE_ALL")) {
                    m4126q0 = AbstractC0924m0.m4216t0();
                }
                m4126q0 = "";
            } else {
                if (str.equals("DATE_FIRST_TIME_VISIT_ZCLOUD_MANAGE_THREAD")) {
                    m4126q0 = AbstractC0924m0.m4245u0();
                }
                m4126q0 = "";
            }
        } else {
            if (str.equals("FIRST_TIME_VISIT_QUOTA_CLEANER")) {
                m4126q0 = AbstractC0924m0.m4126q0();
            }
            m4126q0 = "";
        }
        if (TextUtils.isEmpty(m4126q0)) {
            m4126q0 = AbstractC23160o0.m119264k0();
            int hashCode2 = str.hashCode();
            if (hashCode2 != -1655087112) {
                if (hashCode2 != -798341978) {
                    if (hashCode2 == 2032607333 && str.equals("DATE_FIRST_TIME_VISIT_ZCLOUD_MANAGE_ALL")) {
                        AbstractC0924m0.m3841gf(m4126q0);
                    }
                } else if (str.equals("DATE_FIRST_TIME_VISIT_ZCLOUD_MANAGE_THREAD")) {
                    AbstractC0924m0.m3871hf(m4126q0);
                }
            } else if (str.equals("FIRST_TIME_VISIT_QUOTA_CLEANER")) {
                AbstractC0924m0.m3751df(m4126q0);
            }
            AbstractC19074t.m100205c(m4126q0);
        } else {
            AbstractC19074t.m100205c(m4126q0);
        }
        return m4126q0;
    }

    /* renamed from: WM */
    public final AbstractC26611a m74946WM() {
        return (AbstractC26611a) this.f68521Z0.getValue();
    }

    /* renamed from: XM */
    public final Object m74947XM(C13380a c13380a, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new C13353e(c13380a, null), continuation);
    }

    /* renamed from: YM */
    public final LinearLayout m74948YM() {
        return (LinearLayout) this.f68525d1.getValue();
    }

    /* renamed from: ZM */
    private final C31747a.a m74949ZM() {
        ThreadStorageInfo threadStorageInfo;
        int i11 = C13350b.f68527a[this.f68518W0.ordinal()];
        Boolean bool = null;
        r2 = null;
        String str = null;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    C13463a c13463a = this.f68517V0;
                    if (c13463a != null && (threadStorageInfo = c13463a.f68922c) != null) {
                        str = threadStorageInfo.m74822z();
                    }
                    if (TextUtils.isEmpty(str)) {
                        return C31747a.a.f145824u;
                    }
                    return C31747a.a.f145825v;
                }
                throw new NoWhenBranchMatchedException();
            }
            return C31747a.a.f145823t;
        }
        C13463a c13463a2 = this.f68517V0;
        if (c13463a2 != null) {
            bool = Boolean.valueOf(c13463a2.m75478f());
        }
        if (AbstractC19074t.m100204b(bool, Boolean.TRUE)) {
            return C31747a.a.f145820q;
        }
        return C31747a.a.f145821r;
    }

    /* renamed from: aN */
    private final List m74950aN(C13380a c13380a) {
        ArrayList arrayList = new ArrayList();
        String m136584V = m74946WM().m136584V();
        List<C13380a> m136587Y = m74946WM().m136587Y();
        if (AbstractC19074t.m100204b(m136584V, "All")) {
            if ((c13380a.m75089k() != null || c13380a.m75082d() != null) && c13380a.m75076F()) {
                arrayList.add(new VoiceViewerItem(null, null, null, 0L, null, 0L, 63, null).m75066h(c13380a));
            }
        } else {
            for (C13380a c13380a2 : m136587Y) {
                if (c13380a2.m75089k() != null || c13380a2.m75082d() != null) {
                    if (c13380a2.m75076F()) {
                        arrayList.add(new VoiceViewerItem(null, null, null, 0L, null, 0L, 63, null).m75066h(c13380a2));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: bN */
    public final void m74951bN(C13380a c13380a, InterfaceC18505l interfaceC18505l) {
        List m131496e;
        ArrayList arrayList = AbstractC23304d.f113413n;
        if (arrayList.size() > 0) {
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                if (AbstractC19074t.m100204b(((C20568e) it.next()).m107018b(), c13380a.m75090l())) {
                    m131496e = AbstractC25366r.m131496e(c13380a.m75084f(this.f68518W0));
                    m74997UM(m131496e, true);
                    return;
                }
            }
        }
        C13354f c13354f = new C13354f(c13380a, interfaceC18505l);
        if (!c13380a.m75071A() && !c13380a.m75097s() && !c13380a.m75075E()) {
            c13380a.m75080J(c13354f);
            ToolStorageDetailPage toolStorageDetailPage = this.f68515T0;
            if (toolStorageDetailPage != null) {
                toolStorageDetailPage.m74878GM();
                return;
            }
            return;
        }
        if (!C23055e5.m118272g(true)) {
            if (c13380a.m75099u()) {
                c13354f.mo75005c();
                return;
            }
            return;
        }
        c13354f.mo75005c();
    }

    /* renamed from: cN */
    public final void m74952cN(C17945a0 c17945a0) {
        if (c17945a0 != null) {
            try {
                String mo95039W2 = c17945a0.mo95039W2();
                AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                Bundle m140776b = new C27870vb(mo95039W2).m140781h(c17945a0.m95029V3()).m140776b();
                InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
                if (m92676n2 != null) {
                    m92676n2.mo35573l4(ChatView.class, m140776b, 1, true);
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                C24848g0 c24848g02 = C24848g0.f119245a;
            }
        }
    }

    /* renamed from: dN */
    public final void m74953dN(C13380a c13380a) {
        if (!c13380a.m75071A() && !c13380a.m75097s() && !c13380a.m75075E()) {
            if (c13380a.m75100v()) {
                m74910BN(c13380a.m75088j(), c13380a.m75085g());
                return;
            } else {
                m74939PN(c13380a);
                return;
            }
        }
        m74937ON(c13380a);
    }

    /* renamed from: eN */
    private final void m74954eN() {
        String str;
        ThreadStorageInfo threadStorageInfo;
        ThreadStorageInfo threadStorageInfo2;
        String m127114D;
        AbstractC29763d7 abstractC29763d7 = this.f68511P0;
        AbstractC29763d7 abstractC29763d72 = null;
        if (abstractC29763d7 == null) {
            AbstractC19074t.m100223u("mBinding");
            abstractC29763d7 = null;
        }
        abstractC29763d7.f137508c0.setCustomMiddleItem(m74948YM());
        RobotoTextView robotoTextView = (RobotoTextView) m74948YM().findViewById(ZAbstractBase.ZVU_PROCESS_FLUSH);
        RobotoTextView robotoTextView2 = (RobotoTextView) m74948YM().findViewById(3000);
        C13463a c13463a = this.f68517V0;
        if (c13463a != null && c13463a.m75478f()) {
            String m92653YI = m92653YI(AbstractC8020f0.str_tool_storage_overview_media_larger_than, C21459a.m111038f(C20912a.Companion.m109411a().m109401f(), 0, 2, null));
            AbstractC19074t.m100207e(m92653YI, "getString(...)");
            m127114D = AbstractC24341v.m127114D(m92653YI, "•", "", false, 4, null);
            robotoTextView.setText(m127114D);
        } else {
            ToolStorageDetailPage.EnumC13333a enumC13333a = this.f68518W0;
            if (enumC13333a == ToolStorageDetailPage.EnumC13333a.f68484r) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_clean_view_action_bar);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                String format = String.format(m118743r0, Arrays.copyOf(new Object[]{AbstractC21935u.m114547n()}, 1));
                AbstractC19074t.m100207e(format, "format(...)");
                robotoTextView.setText(format);
                AbstractC29763d7 abstractC29763d73 = this.f68511P0;
                if (abstractC29763d73 == null) {
                    AbstractC19074t.m100223u("mBinding");
                    abstractC29763d73 = null;
                }
                ZdsActionBar zdsActionBar = abstractC29763d73.f137508c0;
                Context m92689tK = m92689tK();
                AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                Drawable m139658a = C27280g.m139658a(m92689tK, AbstractC2810d.zds_ic_help_circle_line_24);
                if (m139658a == null) {
                    return;
                }
                zdsActionBar.setTrailingIconButton(m139658a);
                zdsActionBar.setTrailingButton1Color(C23212s8.m119607o(m92689tK(), AbstractC2807a.icon_01));
                zdsActionBar.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: wa0.s
                    public /* synthetic */ ViewOnClickListenerC28893s() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ToolStorageDetailView.m74955fN(ToolStorageDetailView.this, view);
                    }
                });
            } else if (enumC13333a == ToolStorageDetailPage.EnumC13333a.f68485s) {
                C13463a c13463a2 = this.f68517V0;
                if (c13463a2 != null && (threadStorageInfo2 = c13463a2.f68922c) != null) {
                    if (TextUtils.isEmpty(threadStorageInfo2.m74822z())) {
                        robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cloud_media_clean_by_media_type));
                    } else {
                        robotoTextView.setText(threadStorageInfo2.m74779R());
                    }
                }
            } else {
                C13463a c13463a3 = this.f68517V0;
                if (c13463a3 != null && (threadStorageInfo = c13463a3.f68922c) != null) {
                    str = threadStorageInfo.m74779R();
                } else {
                    str = null;
                }
                robotoTextView.setText(str);
            }
        }
        robotoTextView2.setText(m92689tK().getResources().getQuantityString(AbstractC7921d0.str_selection_count, 1, 0, ""));
        AbstractC29763d7 abstractC29763d74 = this.f68511P0;
        if (abstractC29763d74 == null) {
            AbstractC19074t.m100223u("mBinding");
        } else {
            abstractC29763d72 = abstractC29763d74;
        }
        abstractC29763d72.f137508c0.setLeadingButton1Color(C23212s8.m119607o(getContext(), AbstractC2807a.button_tertiary_neutral_icon));
    }

    /* renamed from: fN */
    public static final void m74955fN(ToolStorageDetailView toolStorageDetailView, View view) {
        AbstractC19074t.m100208f(toolStorageDetailView, "this$0");
        toolStorageDetailView.m74921GN();
    }

    /* renamed from: gN */
    private final void m74957gN() {
        ThreadStorageInfo threadStorageInfo;
        String str;
        ThreadStorageInfo threadStorageInfo2;
        AbstractC26611a m74946WM = m74946WM();
        if (m74946WM instanceof C28897w) {
            AbstractC26611a m74946WM2 = m74946WM();
            AbstractC19074t.m100206d(m74946WM2, "null cannot be cast to non-null type com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailViewModel");
            C28897w c28897w = (C28897w) m74946WM2;
            C13463a c13463a = this.f68517V0;
            if (c13463a == null || (threadStorageInfo2 = c13463a.f68922c) == null || (str = threadStorageInfo2.m74822z()) == null) {
                str = "";
            }
            c28897w.m144344z0(str);
            return;
        }
        if (m74946WM instanceof C27114d2) {
            AbstractC26611a m74946WM3 = m74946WM();
            AbstractC19074t.m100206d(m74946WM3, "null cannot be cast to non-null type com.zing.zalo.ui.mycloud.MyCloudQuotaManagementViewModel");
            C27114d2 c27114d2 = (C27114d2) m74946WM3;
            c27114d2.m139230J0().m9219j(m92657cJ(), new C13369u(new C13355g()));
            c27114d2.m139229G0();
            return;
        }
        if (m74946WM instanceof C21680s) {
            AbstractC26611a m74946WM4 = m74946WM();
            AbstractC19074t.m100206d(m74946WM4, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.viewmodels.ZCloudManagementViewModel");
            C21680s c21680s = (C21680s) m74946WM4;
            c21680s.m111802d1().m9219j(m92657cJ(), new C13369u(new C13356h()));
            C13463a c13463a2 = this.f68517V0;
            if (c13463a2 != null && (threadStorageInfo = c13463a2.f68922c) != null) {
                String m74822z = threadStorageInfo.m74822z();
                if (m74822z.length() == 0) {
                    m74822z = "ALL";
                }
                C26676b.m136958h("initData(): " + ((Object) m74822z), null, 2, null);
                c21680s.m111799V0(threadStorageInfo, this.f68519X0);
            }
            c21680s.m136593f0().m9219j(m92657cJ(), new C13369u(new C13357i()));
        }
    }

    /* renamed from: hN */
    private final void m74959hN() {
        m74946WM().m136588Z().m9219j(m92657cJ(), new C13369u(new C13358j()));
        m74946WM().m136591c0().m9219j(m92657cJ(), new C13369u(new C13359k()));
        m74946WM().m136585W().m9219j(m92657cJ(), new C13369u(new C13360l()));
    }

    /* renamed from: iN */
    private final void m74961iN() {
        int i11;
        AbstractC29763d7 abstractC29763d7 = this.f68511P0;
        if (abstractC29763d7 == null) {
            AbstractC19074t.m100223u("mBinding");
            abstractC29763d7 = null;
        }
        if (C23212s8.m119603k()) {
            i11 = AbstractC2808b.light_icon_01;
        } else {
            i11 = AbstractC2808b.dark_icon_01;
        }
        CustomEditText customEditText = abstractC29763d7.f137498S;
        customEditText.f83177K = true;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        customEditText.setClearDrawable(C27280g.m139659b(m92689tK, AbstractC23322a.zds_ic_close_circle_solid_16, i11));
        customEditText.addTextChangedListener(this.f68526e1);
    }

    /* renamed from: jN */
    private final void m74963jN() {
        C13463a c13463a = this.f68517V0;
        if (c13463a == null || !c13463a.m75478f() || this.f68518W0 != ToolStorageDetailPage.EnumC13333a.f68483q) {
            this.f68523b1.add("Voice message");
        }
    }

    /* renamed from: kN */
    private final void m74965kN() {
        C13385f c13385f = new C13385f(m92649TI(), this.f68523b1, this.f68518W0);
        this.f68524c1 = c13385f;
        c13385f.m75147A(new C13361m());
        AbstractC29763d7 abstractC29763d7 = this.f68511P0;
        AbstractC29763d7 abstractC29763d72 = null;
        if (abstractC29763d7 == null) {
            AbstractC19074t.m100223u("mBinding");
            abstractC29763d7 = null;
        }
        ViewPagerCustomSwipeable viewPagerCustomSwipeable = abstractC29763d7.f137507b0;
        viewPagerCustomSwipeable.setSwipeEnabled(false);
        viewPagerCustomSwipeable.addOnPageChangeListener(new C13362n());
        viewPagerCustomSwipeable.setOnTouchListener(new View.OnTouchListener() { // from class: wa0.o
            public /* synthetic */ ViewOnTouchListenerC28889o() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m74967lN;
                m74967lN = ToolStorageDetailView.m74967lN(ViewPagerCustomSwipeable.this, view, motionEvent);
                return m74967lN;
            }
        });
        viewPagerCustomSwipeable.setPageMargin(viewPagerCustomSwipeable.getResources().getDimensionPixelSize(AbstractC16802y.page_margin_width));
        viewPagerCustomSwipeable.setOffscreenPageLimit(4);
        viewPagerCustomSwipeable.setAdapter(this.f68524c1);
        AbstractC29763d7 abstractC29763d73 = this.f68511P0;
        if (abstractC29763d73 == null) {
            AbstractC19074t.m100223u("mBinding");
            abstractC29763d73 = null;
        }
        abstractC29763d73.f137500U.setTabViewList(this.f68523b1);
        AbstractC29763d7 abstractC29763d74 = this.f68511P0;
        if (abstractC29763d74 == null) {
            AbstractC19074t.m100223u("mBinding");
            abstractC29763d74 = null;
        }
        abstractC29763d74.f137500U.setOnTabViewEventListener(new C13363o());
        m74917Ez(this.f68514S0);
        AbstractC29763d7 abstractC29763d75 = this.f68511P0;
        if (abstractC29763d75 == null) {
            AbstractC19074t.m100223u("mBinding");
        } else {
            abstractC29763d72 = abstractC29763d75;
        }
        abstractC29763d72.f137507b0.setCurrentItem(this.f68514S0);
    }

    /* renamed from: lN */
    public static final boolean m74967lN(ViewPagerCustomSwipeable viewPagerCustomSwipeable, View view, MotionEvent motionEvent) {
        ViewParent parent;
        AbstractC19074t.m100208f(viewPagerCustomSwipeable, "$this_apply");
        if (motionEvent != null) {
            try {
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            if (motionEvent.getAction() == 0 && viewPagerCustomSwipeable.getCurrentItem() > 0) {
                ViewParent parent2 = viewPagerCustomSwipeable.getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                }
                return false;
            }
        }
        if (motionEvent != null && ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || motionEvent.getAction() == 6) && (parent = viewPagerCustomSwipeable.getParent()) != null)) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }

    /* renamed from: mN */
    private final void m74969mN() {
        boolean z11;
        m74954eN();
        m74965kN();
        m74961iN();
        m74959hN();
        AbstractC29763d7 abstractC29763d7 = this.f68511P0;
        AbstractC29763d7 abstractC29763d72 = null;
        if (abstractC29763d7 == null) {
            AbstractC19074t.m100223u("mBinding");
            abstractC29763d7 = null;
        }
        abstractC29763d7.f137497R.setOnClickListener(new View.OnClickListener() { // from class: wa0.n
            public /* synthetic */ ViewOnClickListenerC28888n() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToolStorageDetailView.m74971nN(ToolStorageDetailView.this, view);
            }
        });
        AbstractC29763d7 abstractC29763d73 = this.f68511P0;
        if (abstractC29763d73 == null) {
            AbstractC19074t.m100223u("mBinding");
        } else {
            abstractC29763d72 = abstractC29763d73;
        }
        RelativeLayout relativeLayout = abstractC29763d72.f137495P;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        if (this.f68518W0 == ToolStorageDetailPage.EnumC13333a.f68483q) {
            z11 = true;
        } else {
            z11 = false;
        }
        ZcloudManagementMultiSelectBottomView zcloudManagementMultiSelectBottomView = new ZcloudManagementMultiSelectBottomView(m92689tK, z11, new C13364p());
        zcloudManagementMultiSelectBottomView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f68513R0 = zcloudManagementMultiSelectBottomView;
        relativeLayout.addView(zcloudManagementMultiSelectBottomView);
    }

    /* renamed from: nN */
    public static final void m74971nN(ToolStorageDetailView toolStorageDetailView, View view) {
        AbstractC19074t.m100208f(toolStorageDetailView, "this$0");
        toolStorageDetailView.m74935NN();
    }

    /* renamed from: oN */
    private final void m74973oN() {
        m74946WM().m136592e0().m9219j(m92657cJ(), new C13369u(new C13367s()));
    }

    /* renamed from: pN */
    public final void m74975pN() {
        AbstractC19444a.m101697e(new Runnable() { // from class: wa0.m
            public /* synthetic */ RunnableC28886m() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ToolStorageDetailView.m74977qN(ToolStorageDetailView.this);
            }
        });
    }

    /* renamed from: qN */
    public static final void m74977qN(ToolStorageDetailView toolStorageDetailView) {
        AbstractC19074t.m100208f(toolStorageDetailView, "this$0");
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_unable_to_access_this_item));
        ToolStorageDetailPage toolStorageDetailPage = toolStorageDetailView.f68515T0;
        if (toolStorageDetailPage != null) {
            toolStorageDetailPage.m74878GM();
        }
    }

    /* renamed from: rN */
    public final void m74979rN(C13380a c13380a, InterfaceC18505l interfaceC18505l) {
        AbstractC19444a.m101697e(new Runnable() { // from class: wa0.l

            /* renamed from: q */
            public final /* synthetic */ ToolStorageDetailView f133753q;

            /* renamed from: r */
            public final /* synthetic */ InterfaceC18505l f133754r;

            public /* synthetic */ RunnableC28884l(ToolStorageDetailView this, InterfaceC18505l interfaceC18505l2) {
                r2 = this;
                r3 = interfaceC18505l2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ToolStorageDetailView.m74981sN(C13380a.this, r2, r3);
            }
        });
    }

    /* renamed from: sN */
    public static final void m74981sN(C13380a c13380a, ToolStorageDetailView toolStorageDetailView, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(c13380a, "$storageUsageDetailItem");
        AbstractC19074t.m100208f(toolStorageDetailView, "this$0");
        AbstractC19074t.m100208f(interfaceC18505l, "$doSomething");
        C23744a.Companion.m124119a().m124116d(150805, c13380a);
        interfaceC18505l.mo205i9(c13380a);
        ToolStorageDetailPage toolStorageDetailPage = toolStorageDetailView.f68515T0;
        if (toolStorageDetailPage != null) {
            toolStorageDetailPage.m74878GM();
        }
    }

    /* renamed from: tN */
    private final void m74983tN(boolean z11) {
        AbstractC29763d7 abstractC29763d7 = this.f68511P0;
        AbstractC29763d7 abstractC29763d72 = null;
        if (abstractC29763d7 == null) {
            AbstractC19074t.m100223u("mBinding");
            abstractC29763d7 = null;
        }
        abstractC29763d7.f137496Q.setOnClickListener(new View.OnClickListener() { // from class: wa0.p
            public /* synthetic */ ViewOnClickListenerC28890p() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToolStorageDetailView.m74985uN(ToolStorageDetailView.this, view);
            }
        });
        if (z11) {
            AbstractC29763d7 abstractC29763d73 = this.f68511P0;
            if (abstractC29763d73 == null) {
                AbstractC19074t.m100223u("mBinding");
                abstractC29763d73 = null;
            }
            LinearLayout linearLayout = abstractC29763d73.f137503X;
            AbstractC19074t.m100207e(linearLayout, "searchContainer");
            linearLayout.setVisibility(0);
            AbstractC29763d7 abstractC29763d74 = this.f68511P0;
            if (abstractC29763d74 == null) {
                AbstractC19074t.m100223u("mBinding");
            } else {
                abstractC29763d72 = abstractC29763d74;
            }
            abstractC29763d72.f137503X.requestFocus();
            this.f72827B0.postDelayed(new Runnable() { // from class: wa0.q
                public /* synthetic */ RunnableC28891q() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ToolStorageDetailView.m74987vN(ToolStorageDetailView.this);
                }
            }, 500L);
            return;
        }
        AbstractC29763d7 abstractC29763d75 = this.f68511P0;
        if (abstractC29763d75 == null) {
            AbstractC19074t.m100223u("mBinding");
            abstractC29763d75 = null;
        }
        LinearLayout linearLayout2 = abstractC29763d75.f137503X;
        AbstractC19074t.m100207e(linearLayout2, "searchContainer");
        linearLayout2.setVisibility(8);
        AbstractC29763d7 abstractC29763d76 = this.f68511P0;
        if (abstractC29763d76 == null) {
            AbstractC19074t.m100223u("mBinding");
        } else {
            abstractC29763d72 = abstractC29763d76;
        }
        abstractC29763d72.f137498S.setText("");
        this.f72827B0.postDelayed(new Runnable() { // from class: wa0.r
            public /* synthetic */ RunnableC28892r() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ToolStorageDetailView.m74989wN(ToolStorageDetailView.this);
            }
        }, 500L);
    }

    /* renamed from: uN */
    public static final void m74985uN(ToolStorageDetailView toolStorageDetailView, View view) {
        AbstractC19074t.m100208f(toolStorageDetailView, "this$0");
        toolStorageDetailView.m74983tN(false);
    }

    /* renamed from: vN */
    public static final void m74987vN(ToolStorageDetailView toolStorageDetailView) {
        AbstractC19074t.m100208f(toolStorageDetailView, "this$0");
        AbstractC29763d7 abstractC29763d7 = toolStorageDetailView.f68511P0;
        if (abstractC29763d7 == null) {
            AbstractC19074t.m100223u("mBinding");
            abstractC29763d7 = null;
        }
        AbstractC2379w.m12432f(abstractC29763d7.f137498S);
    }

    /* renamed from: wN */
    public static final void m74989wN(ToolStorageDetailView toolStorageDetailView) {
        AbstractC19074t.m100208f(toolStorageDetailView, "this$0");
        AbstractC29763d7 abstractC29763d7 = toolStorageDetailView.f68511P0;
        if (abstractC29763d7 == null) {
            AbstractC19074t.m100223u("mBinding");
            abstractC29763d7 = null;
        }
        AbstractC2379w.m12430d(abstractC29763d7.f137498S);
    }

    /* renamed from: xN */
    public static final void m74991xN(ToolStorageDetailView toolStorageDetailView) {
        AbstractC19074t.m100208f(toolStorageDetailView, "this$0");
        toolStorageDetailView.m74921GN();
    }

    /* renamed from: yN */
    public final void m74993yN(Bundle bundle, int i11, String str) {
        if (m92676n2() != null) {
            C13368t c13368t = new C13368t();
            C20275e c20275e = new C20275e();
            c20275e.m105865K(i11);
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null) {
                m92676n2.mo35551H2(c13368t, str, bundle, c20275e, 10000);
            }
        }
    }

    /* renamed from: zN */
    private final void m74995zN(Bundle bundle) {
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(ToolStorageVoiceViewer.class, bundle, 10007, 1, true);
        }
    }

    /* renamed from: AN */
    public final void m74996AN(C17945a0 c17945a0) {
        String str;
        AbstractC19074t.m100208f(c17945a0, "message");
        try {
            List m136587Y = m74946WM().m136587Y();
            Iterator it = m136587Y.iterator();
            int i11 = 0;
            while (true) {
                if (it.hasNext()) {
                    C17945a0 m75089k = ((C13380a) it.next()).m75089k();
                    if (m75089k != null && m75089k.m95135f9(c17945a0.m95029V3())) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            C13380a c13380a = (C13380a) m136587Y.get(i11);
            if (c17945a0.m95316z8()) {
                m74939PN(c13380a);
                return;
            }
            if (c17945a0.m95276v6()) {
                C17945a0 m75089k2 = c13380a.m75089k();
                if (m75089k2 != null) {
                    str = m75089k2.m94983Q3();
                } else {
                    str = null;
                }
                String m95223p3 = c17945a0.m95223p3();
                AbstractC19074t.m100207e(m95223p3, "getFileExt(...)");
                m74910BN(str, m95223p3);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m92637BK(true);
        C13463a m75485a = C13463a.Companion.m75485a(m92642L3());
        this.f68518W0 = m75485a.m75473a();
        this.f68519X0 = m75485a.m75474b();
        this.f68517V0 = m75485a;
        m74963jN();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        AbstractC29763d7 m147850Q = AbstractC29763d7.m147850Q(layoutInflater.inflate(AbstractC7409c0.layout_storage_usage_detail, viewGroup, false));
        AbstractC19074t.m100207e(m147850Q, "bind(...)");
        this.f68511P0 = m147850Q;
        if (bundle != null && bundle.containsKey("current_page_pos")) {
            this.f68514S0 = bundle.getInt("current_page_pos");
        }
        m74969mN();
        m74957gN();
        m74919FN();
        AbstractC29763d7 abstractC29763d7 = this.f68511P0;
        if (abstractC29763d7 == null) {
            AbstractC19074t.m100223u("mBinding");
            abstractC29763d7 = null;
        }
        View root = abstractC29763d7.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        C24302e.Companion.m126919j().m126902h(EnumC24298a.f117297p);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        C16972e0 c16972e0 = this.f68516U0;
        if (c16972e0 != null && c16972e0.m92868m()) {
            c16972e0.dismiss();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 9);
        bVar.m124119a().m124117e(this, 6);
        bVar.m124119a().m124117e(this, 89);
        bVar.m124119a().m124117e(this, 150805);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        if (m74946WM().m136596i0()) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 1) {
            m74983tN(true);
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        bundle.putInt("current_page_pos", this.f68514S0);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        m74973oN();
    }

    /* renamed from: UM */
    public final void m74997UM(List list, boolean z11) {
        AbstractC19074t.m100208f(list, "ids");
        m74946WM().m136582T(m74949ZM(), list, this.f68518W0, new C13352d(z11, this));
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        if (this.f68518W0 == ToolStorageDetailPage.EnumC13333a.f68484r && !AbstractC0924m0.m3927jb()) {
            AbstractC29763d7 abstractC29763d7 = this.f68511P0;
            if (abstractC29763d7 == null) {
                AbstractC19074t.m100223u("mBinding");
                abstractC29763d7 = null;
            }
            abstractC29763d7.f137507b0.postDelayed(new Runnable() { // from class: wa0.j
                public /* synthetic */ RunnableC28880j() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ToolStorageDetailView.m74991xN(ToolStorageDetailView.this);
                }
            }, 200L);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        String str;
        ThreadStorageInfo threadStorageInfo;
        ToolStorageDetailPage.EnumC13333a enumC13333a = this.f68518W0;
        if (enumC13333a == ToolStorageDetailPage.EnumC13333a.f68484r) {
            return "mycloud_cleaner";
        }
        if (enumC13333a == ToolStorageDetailPage.EnumC13333a.f68485s) {
            C13463a c13463a = this.f68517V0;
            if (c13463a != null && (threadStorageInfo = c13463a.f68922c) != null) {
                str = threadStorageInfo.m74822z();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                return "ZCloudManageAllItems";
            }
            return "ZCloudManageThreadItems";
        }
        C13463a c13463a2 = this.f68517V0;
        if (c13463a2 != null && c13463a2.m75478f()) {
            return "ToolStorageReviewOldBigFile";
        }
        return "ToolStorageThreadDetail";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        ArrayList<String> stringArrayListExtra;
        String str;
        ThreadStorageInfo threadStorageInfo;
        if (i11 == 10000 && i12 == -1 && intent != null) {
            try {
                ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("deletedPhoto");
                if (stringArrayListExtra2 != null && !stringArrayListExtra2.isEmpty()) {
                    m74997UM(stringArrayListExtra2, false);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CommonZaloview", e11);
            }
        }
        if (i11 == 1000 && i12 == -1 && intent != null) {
            String str2 = (String) this.f68522a1.get(intent.getIntExtra("EXTRA_PARAM_SELECTED_POS", 0));
            m74946WM().mo111805q0(str2);
            C31747a.m152718q(m74949ZM(), str2);
            if (this.f68518W0 == ToolStorageDetailPage.EnumC13333a.f68485s) {
                C26676b c26676b = C26676b.f126324a;
                C13463a c13463a = this.f68517V0;
                if (c13463a != null && (threadStorageInfo = c13463a.f68922c) != null) {
                    str = threadStorageInfo.m74822z();
                } else {
                    str = null;
                }
                boolean isEmpty = TextUtils.isEmpty(str);
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
                c26676b.m136998k0(isEmpty, lowerCase);
            }
        }
        if (i11 == 10007 && i12 == -1 && intent != null && (stringArrayListExtra = intent.getStringArrayListExtra("deleted_voices")) != null && !stringArrayListExtra.isEmpty()) {
            m74997UM(stringArrayListExtra, false);
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(iArr, "grantResults");
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (i11 == 154 && AbstractC23034c6.m118118E()) {
            m74912CN();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        Object obj;
        super.onResume();
        if (!this.f68520Y0.isEmpty()) {
            mo49282B8(null, false);
            ArrayList<MessageId> arrayList = this.f68520Y0;
            ArrayList arrayList2 = new ArrayList();
            for (MessageId messageId : arrayList) {
                Iterator it = m74946WM().m136587Y().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC19074t.m100204b(((C13380a) obj).m75090l(), messageId)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                C13380a c13380a = (C13380a) obj;
                if (c13380a != null) {
                    arrayList2.add(c13380a);
                }
            }
            m74946WM().m136602r0(m74946WM().mo111806w0(arrayList2));
            m74916EN();
            this.f68520Y0.clear();
            mo49315c4();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        int i12;
        ZaloView zaloView;
        ToolStorageDetailPage toolStorageDetailPage;
        boolean z11;
        ZaloView zaloView2;
        ZaloView zaloView3;
        C13380a c13380a;
        int i13;
        ZaloView zaloView4;
        ToolStorageDetailPage toolStorageDetailPage2;
        AbstractC19074t.m100208f(objArr, "args");
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
        ZaloView zaloView5 = null;
        int i14 = 0;
        if (i11 != 6) {
            if (i11 != 9) {
                if (i11 != 89) {
                    if (i11 != 150805 || this.f68518W0 != ToolStorageDetailPage.EnumC13333a.f68485s || (c13380a = (C13380a) objArr[0]) == null) {
                        return;
                    }
                    C13385f c13385f = this.f68524c1;
                    if (c13385f != null) {
                        i13 = c13385f.mo35335g();
                    } else {
                        i13 = 0;
                    }
                    if (i13 < 0) {
                        return;
                    }
                    while (true) {
                        C13385f c13385f2 = this.f68524c1;
                        if (c13385f2 != null) {
                            zaloView4 = c13385f2.m93128x(i14);
                        } else {
                            zaloView4 = null;
                        }
                        if ((zaloView4 == null || (zaloView4 instanceof ToolStorageDetailPage)) && (toolStorageDetailPage2 = (ToolStorageDetailPage) zaloView4) != null) {
                            C25821b m75082d = c13380a.m75082d();
                            if (m75082d == null) {
                                return;
                            } else {
                                toolStorageDetailPage2.m74880JM(m75082d);
                            }
                        }
                        if (i14 != i13) {
                            i14++;
                        } else {
                            return;
                        }
                    }
                } else {
                    C17945a0 c17945a0 = (C17945a0) objArr[1];
                    if (c17945a0 == null) {
                        return;
                    }
                    m74996AN(c17945a0);
                }
            } else {
                if (objArr.length == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    C17487o0 m92662fJ = m92662fJ();
                    if (m92662fJ != null) {
                        zaloView2 = m92662fJ.m93012K0();
                    } else {
                        zaloView2 = null;
                    }
                    if (!(zaloView2 instanceof ToolStorageDetailView)) {
                        C17487o0 m92662fJ2 = m92662fJ();
                        if (m92662fJ2 != null) {
                            zaloView3 = m92662fJ2.m93012K0();
                        } else {
                            zaloView3 = null;
                        }
                        if (!(zaloView3 instanceof ToolStorageVoiceViewer)) {
                            C17487o0 m92662fJ3 = m92662fJ();
                            if (m92662fJ3 != null) {
                                zaloView5 = m92662fJ3.m93012K0();
                            }
                            if (!(zaloView5 instanceof ToolStorageImageViewer)) {
                                Object obj = objArr[0];
                                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.ui.chat.transfer.EventMessageUndoParam");
                                C20338d c20338d = (C20338d) obj;
                                c20338d.m106043a();
                                MessageId m106044b = c20338d.m106044b();
                                c20338d.m106045c();
                                ArrayList arrayList = this.f68520Y0;
                                if (m106044b == null) {
                                    return;
                                }
                                arrayList.add(m106044b);
                            }
                        }
                    }
                }
            }
        } else {
            MessageId messageId = (MessageId) objArr[0];
            if (messageId == null) {
                return;
            }
            C13385f c13385f3 = this.f68524c1;
            if (c13385f3 != null) {
                i12 = c13385f3.mo35335g();
            } else {
                i12 = 0;
            }
            if (i12 < 0) {
                return;
            }
            while (true) {
                C13385f c13385f4 = this.f68524c1;
                if (c13385f4 != null) {
                    zaloView = c13385f4.m93128x(i14);
                } else {
                    zaloView = null;
                }
                if ((zaloView == null || (zaloView instanceof ToolStorageDetailPage)) && (toolStorageDetailPage = (ToolStorageDetailPage) zaloView) != null) {
                    toolStorageDetailPage.m74879IM(messageId);
                }
                if (i14 != i12) {
                    i14++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 9);
        bVar.m124119a().m124115b(this, 6);
        bVar.m124119a().m124115b(this, 89);
        bVar.m124119a().m124115b(this, 150805);
    }
}
