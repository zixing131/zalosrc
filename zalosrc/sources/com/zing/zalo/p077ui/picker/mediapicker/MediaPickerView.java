package com.zing.zalo.p077ui.picker.mediapicker;

import ac.InterfaceC0733x;
import am.AbstractC0924m0;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.databinding.AbstractC1673g;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.AbstractC1803x;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1801w;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.adapters.ViewOnClickListenerC7267y0;
import com.zing.zalo.data.mediapicker.model.FolderItem;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.p077ui.ZaloBubbleActivity;
import com.zing.zalo.p077ui.custom.AbstractC11859g;
import com.zing.zalo.p077ui.picker.QuickPickerView;
import com.zing.zalo.p077ui.picker.mediapicker.C12839a;
import com.zing.zalo.p077ui.picker.mediapicker.MediaPickerView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.textview.RoundedRobotoTextView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.uicontrol.MenuListPopupView;
import com.zing.zalo.uicontrol.ScrollControlGridLayoutManager;
import com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView;
import com.zing.zalo.zdesign.component.CheckCircle;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.animation.AnimationTarget;
import dg0.AbstractC17927b;
import dg0.AbstractC17930e;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import f90.C18826a;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import fn0.C19078x;
import g90.C19303d;
import hk.InterfaceC20079a;
import ho0.AbstractC20110a;
import i40.C20275e;
import in0.C20634a;
import in0.InterfaceC20636c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import l90.C22164j;
import l90.C22165k;
import m90.EnumC22962a;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.AbstractC23280z4;
import me0.C23081g9;
import me0.C23212s8;
import mm0.AbstractC23350e;
import mn0.InterfaceC23370h;
import o90.AbstractC24138a;
import p205hc.C19965d;
import p227i3.C20218v;
import p270jk.C21280a;
import p348mi.AbstractC23306f;
import p405ov.C24559a;
import p458qr.C25470c;
import p458qr.C25471d;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import p649xl.AbstractC30151z7;
import p649xl.C29939n3;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import vc0.C27962a;
import vc0.C27966e;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import zl0.AbstractC32226c;

/* loaded from: classes6.dex */
public final class MediaPickerView extends BaseZaloView implements C12839a.c, View.OnClickListener, InterfaceC0733x {

    /* renamed from: t1 */
    private static int f66525t1;

    /* renamed from: M0 */
    private final InterfaceC20079a f66526M0;

    /* renamed from: N0 */
    private final InterfaceC24854k f66527N0;

    /* renamed from: O0 */
    private int f66528O0;

    /* renamed from: P0 */
    private final InterfaceC24854k f66529P0;

    /* renamed from: Q0 */
    private final InterfaceC29232g f66530Q0;

    /* renamed from: R0 */
    private RecyclerView.AbstractC1887n f66531R0;

    /* renamed from: S0 */
    private boolean f66532S0;

    /* renamed from: T0 */
    private MenuListPopupView f66533T0;

    /* renamed from: U0 */
    private InterfaceC12793e f66534U0;

    /* renamed from: V0 */
    private QuickPickerView.InterfaceC12654p f66535V0;

    /* renamed from: W0 */
    private InterfaceC12790d f66536W0;

    /* renamed from: X0 */
    private InterfaceC12787c f66537X0;

    /* renamed from: Y0 */
    private QuickPickerView.InterfaceC12655q f66538Y0;

    /* renamed from: Z0 */
    private QuickPickerView.InterfaceC12659u f66539Z0;

    /* renamed from: a1 */
    private InterfaceC12784b f66540a1;

    /* renamed from: b1 */
    private C27966e f66541b1;

    /* renamed from: c1 */
    private C27962a f66542c1;

    /* renamed from: d1 */
    private AbstractC30151z7 f66543d1;

    /* renamed from: e1 */
    private C29939n3 f66544e1;

    /* renamed from: f1 */
    private final InterfaceC20636c f66545f1;

    /* renamed from: g1 */
    private boolean f66546g1;

    /* renamed from: h1 */
    private boolean f66547h1;

    /* renamed from: i1 */
    private boolean f66548i1;

    /* renamed from: j1 */
    private boolean f66549j1;

    /* renamed from: k1 */
    private final Handler f66550k1;

    /* renamed from: l1 */
    private final long f66551l1;

    /* renamed from: m1 */
    private final AtomicBoolean f66552m1;

    /* renamed from: n1 */
    private final AtomicBoolean f66553n1;

    /* renamed from: o1 */
    private final AtomicBoolean f66554o1;

    /* renamed from: p1 */
    private final InterfaceC24854k f66555p1;

    /* renamed from: q1 */
    private final InterfaceC24854k f66556q1;

    /* renamed from: r1 */
    private boolean f66557r1;

    /* renamed from: s1 */
    static final /* synthetic */ InterfaceC23370h[] f66524s1 = {AbstractC19061k0.m100171d(new C19078x(MediaPickerView.class, "mCurrentPermission", "getMCurrentPermission()Z", 0))};
    public static final C12781a Companion = new C12781a(null);

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$a */
    /* loaded from: classes6.dex */
    public static final class C12781a {
        private C12781a() {
        }

        public /* synthetic */ C12781a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m72256a() {
            return MediaPickerView.f66525t1;
        }

        /* renamed from: b */
        public final Bundle m72257b(int i11, EnumC22962a enumC22962a, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, ArrayList arrayList, int i12, String str, SensitiveData sensitiveData) {
            AbstractC19074t.m100208f(enumC22962a, "mediaPickerSource");
            AbstractC19074t.m100208f(arrayList, "externalSelectedItems");
            AbstractC19074t.m100208f(str, "messageReachLimit");
            Bundle bundle = new Bundle();
            bundle.putInt("extraPhotoType", i11);
            bundle.putInt("extraMaxSelectItems", i12);
            bundle.putString("extraMessageReachLimit", str);
            bundle.putSerializable("extraMediaPickerSource", enumC22962a);
            bundle.putBoolean("extraEnableInlineBanner", z11);
            bundle.putBoolean("extraOpenFromCamera", z12);
            bundle.putBoolean("extraIsShowFull", z13);
            bundle.putBoolean("extraSupportLiveCameraPicker", z14);
            bundle.putBoolean("extraIsCheckedHq", z15);
            bundle.putParcelableArrayList("extraExternalSelectedItems", arrayList);
            bundle.putParcelable("EXTRA_SENSITIVE_DATA", sensitiveData);
            return bundle;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$a0 */
    /* loaded from: classes6.dex */
    public static final class C12782a0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66558t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$a0$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66560p;

            a(MediaPickerView mediaPickerView) {
                this.f66560p = mediaPickerView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(List list, Continuation continuation) {
                QuickPickerView.InterfaceC12655q m72227cN = this.f66560p.m72227cN();
                if (m72227cN != null) {
                    m72227cN.mo71299a(list);
                }
                return C24848g0.f119245a;
            }
        }

        C12782a0(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66558t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                StateFlow m115709k1 = MediaPickerView.this.m72168tN().m115709k1();
                a aVar = new a(MediaPickerView.this);
                this.f66558t = 1;
                if (m115709k1.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72258r(Continuation continuation) {
            return new C12782a0(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12782a0) m72258r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$a1 */
    /* loaded from: classes6.dex */
    static final class C12783a1 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66561t;

        C12783a1(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f66561t == 0) {
                AbstractC24862s.m129228b(obj);
                MediaPickerView.this.m72232hP();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: r */
        public final Continuation m72261r(Continuation continuation) {
            return new C12783a1(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12783a1) m72261r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC12784b {
        /* renamed from: a */
        void mo71306a(String str);

        /* renamed from: b */
        void mo71307b(MediaItem mediaItem, AnimationTarget animationTarget, int i11, C20275e c20275e, String str, String str2);

        /* renamed from: c */
        void mo71308c(List list);

        /* renamed from: d */
        void mo71309d(View view);

        /* renamed from: e */
        void mo71310e(MediaItem mediaItem, AnimationTarget animationTarget, int i11, C20275e c20275e);
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$b0 */
    /* loaded from: classes6.dex */
    public static final class C12785b0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66563t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$b0$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66565p;

            a(MediaPickerView mediaPickerView) {
                this.f66565p = mediaPickerView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(MediaItem mediaItem, Continuation continuation) {
                QuickPickerView.InterfaceC12659u m72238lN = this.f66565p.m72238lN();
                if (m72238lN != null) {
                    m72238lN.mo45270O(mediaItem);
                }
                return C24848g0.f119245a;
            }
        }

        C12785b0(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66563t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow m115711l1 = MediaPickerView.this.m72168tN().m115711l1();
                a aVar = new a(MediaPickerView.this);
                this.f66563t = 1;
                if (m115711l1.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72263r(Continuation continuation) {
            return new C12785b0(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12785b0) m72263r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$b1 */
    /* loaded from: classes6.dex */
    public static final class C12786b1 implements ContentPickerPopupView.InterfaceC16568b {
        C12786b1() {
        }

        @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView.InterfaceC16568b
        /* renamed from: a */
        public void mo60387a() {
        }

        @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView.InterfaceC16568b
        public void onDismiss() {
            InterfaceC12793e m72236kN = MediaPickerView.this.m72236kN();
            if (m72236kN != null) {
                m72236kN.mo71312b();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC12787c {
        /* renamed from: a */
        void mo71512a(MediaItem mediaItem);
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$c0 */
    /* loaded from: classes6.dex */
    public static final class C12788c0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66567t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$c0$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66569p;

            a(MediaPickerView mediaPickerView) {
                this.f66569p = mediaPickerView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(C21280a c21280a, Continuation continuation) {
                InterfaceC12784b m72220YM = this.f66569p.m72220YM();
                if (m72220YM != null) {
                    m72220YM.mo71310e(c21280a.m110224c(), c21280a.m110223b(), c21280a.m110227f(), c21280a.m110222a());
                }
                return C24848g0.f119245a;
            }
        }

        C12788c0(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66567t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow m115713m1 = MediaPickerView.this.m72168tN().m115713m1();
                a aVar = new a(MediaPickerView.this);
                this.f66567t = 1;
                if (m115713m1.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72266r(Continuation continuation) {
            return new C12788c0(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12788c0) m72266r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$c1 */
    /* loaded from: classes6.dex */
    public static final class C12789c1 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f66570q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12789c1(ZaloView zaloView) {
            super(0);
            this.f66570q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ZaloView mo12V4() {
            return this.f66570q;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$d */
    /* loaded from: classes6.dex */
    public interface InterfaceC12790d {
        /* renamed from: a */
        void mo71493a();
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$d0 */
    /* loaded from: classes6.dex */
    public static final class C12791d0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66571t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$d0$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66573p;

            a(MediaPickerView mediaPickerView) {
                this.f66573p = mediaPickerView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(List list, Continuation continuation) {
                InterfaceC12784b m72220YM;
                if ((!list.isEmpty()) && (m72220YM = this.f66573p.m72220YM()) != null) {
                    m72220YM.mo71308c(list);
                }
                return C24848g0.f119245a;
            }
        }

        C12791d0(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66571t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow m115716n1 = MediaPickerView.this.m72168tN().m115716n1();
                a aVar = new a(MediaPickerView.this);
                this.f66571t = 1;
                if (m115716n1.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72270r(Continuation continuation) {
            return new C12791d0(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12791d0) m72270r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$d1 */
    /* loaded from: classes6.dex */
    public static final class C12792d1 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f66574q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12792d1(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f66574q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f66574q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$e */
    /* loaded from: classes6.dex */
    public interface InterfaceC12793e {
        /* renamed from: a */
        void mo71311a();

        /* renamed from: b */
        void mo71312b();
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$e0 */
    /* loaded from: classes6.dex */
    public static final class C12794e0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66575t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$e0$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66577p;

            a(MediaPickerView mediaPickerView) {
                this.f66577p = mediaPickerView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(List list, Continuation continuation) {
                QuickPickerView.InterfaceC12659u m72238lN = this.f66577p.m72238lN();
                if (m72238lN != null) {
                    m72238lN.mo45271m(list);
                }
                return C24848g0.f119245a;
            }
        }

        C12794e0(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66575t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow m115719o1 = MediaPickerView.this.m72168tN().m115719o1();
                a aVar = new a(MediaPickerView.this);
                this.f66575t = 1;
                if (m115719o1.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72274r(Continuation continuation) {
            return new C12794e0(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12794e0) m72274r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$e1 */
    /* loaded from: classes6.dex */
    public static final class C12795e1 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$e1$a */
        /* loaded from: classes6.dex */
        public static final class a extends ContentObserver {

            /* renamed from: a */
            final /* synthetic */ MediaPickerView f66579a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MediaPickerView mediaPickerView, Handler handler) {
                super(handler);
                this.f66579a = mediaPickerView;
            }

            /* renamed from: b */
            public static final void m72279b(MediaPickerView mediaPickerView) {
                AbstractC19074t.m100208f(mediaPickerView, "this$0");
                mediaPickerView.f66552m1.compareAndSet(false, true);
                mediaPickerView.f66554o1.compareAndSet(false, true);
                if (mediaPickerView.m92674mJ() && mediaPickerView.m92672lJ()) {
                    mediaPickerView.m72098JM();
                }
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z11, Uri uri) {
                AbstractC17930e.Companion.m94550a().mo94530d("DEBOUNCE_PROCESS_CONTENT_CHANGE_MEDIA_PICKER", new Runnable() { // from class: l90.i
                    public /* synthetic */ RunnableC22163i() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaPickerView.C12795e1.a.m72279b(MediaPickerView.this);
                    }
                }, this.f66579a.f66551l1);
            }
        }

        C12795e1() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final a mo12V4() {
            return new a(MediaPickerView.this, MediaPickerView.this.f66550k1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$f */
    /* loaded from: classes6.dex */
    public static final class C12796f extends AbstractC19075u implements InterfaceC18494a {
        C12796f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C12839a mo12V4() {
            Context m92686rK = MediaPickerView.this.m92686rK();
            AbstractC19074t.m100207e(m92686rK, "requireActivity(...)");
            return new C12839a(m92686rK, null, 2, null);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$f0 */
    /* loaded from: classes6.dex */
    public static final class C12797f0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66581t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$f0$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66583p;

            a(MediaPickerView mediaPickerView) {
                this.f66583p = mediaPickerView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(String str, Continuation continuation) {
                InterfaceC12784b m72220YM = this.f66583p.m72220YM();
                if (m72220YM != null) {
                    m72220YM.mo71306a(str);
                }
                return C24848g0.f119245a;
            }
        }

        C12797f0(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66581t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                StateFlow m115725s1 = MediaPickerView.this.m72168tN().m115725s1();
                a aVar = new a(MediaPickerView.this);
                this.f66581t = 1;
                if (m115725s1.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72281r(Continuation continuation) {
            return new C12797f0(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12797f0) m72281r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$f1 */
    /* loaded from: classes6.dex */
    public static final class C12798f1 extends AbstractC19075u implements InterfaceC18494a {
        C12798f1() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C1802w0.b mo12V4() {
            return new C22165k(MediaPickerView.this.m72241nN(), MediaPickerView.this, null, 4, null);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$g */
    /* loaded from: classes6.dex */
    public static final class C12799g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ int f66586r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12799g(int i11) {
            super(0);
            this.f66586r = i11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m72285a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m72285a() {
            if (!MediaPickerView.this.m72203QN() && !MediaPickerView.this.m72185IN()) {
                if (this.f66586r != 0 || !MediaPickerView.this.m72195NN()) {
                    MediaPickerView.this.m72198OO(this.f66586r);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$g0 */
    /* loaded from: classes6.dex */
    public static final class C12800g0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66587t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$g0$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66589p;

            a(MediaPickerView mediaPickerView) {
                this.f66589p = mediaPickerView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(C21280a c21280a, Continuation continuation) {
                InterfaceC12784b m72220YM = this.f66589p.m72220YM();
                if (m72220YM != null) {
                    m72220YM.mo71307b(c21280a.m110224c(), c21280a.m110223b(), c21280a.m110227f(), c21280a.m110222a(), c21280a.m110225d(), c21280a.m110226e());
                }
                return C24848g0.f119245a;
            }
        }

        C12800g0(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66587t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow m115728t1 = MediaPickerView.this.m72168tN().m115728t1();
                a aVar = new a(MediaPickerView.this);
                this.f66587t = 1;
                if (m115728t1.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72286r(Continuation continuation) {
            return new C12800g0(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12800g0) m72286r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$h */
    /* loaded from: classes6.dex */
    public static final class C12801h extends AbstractC19075u implements InterfaceC18494a {
        C12801h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m72289a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m72289a() {
            AbstractC23034c6.m118119E0(MediaPickerView.this.m92692wK(), 153);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$h0 */
    /* loaded from: classes6.dex */
    public static final class C12802h0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66591t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$h0$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66593p;

            a(MediaPickerView mediaPickerView) {
                this.f66593p = mediaPickerView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(List list, Continuation continuation) {
                if (!this.f66593p.m72168tN().m115652I2()) {
                    this.f66593p.m72110UM().m72414r0(list);
                    this.f66593p.m72110UM().m10008p();
                    this.f66593p.m72102LM();
                    InterfaceC12790d m72235jN = this.f66593p.m72235jN();
                    if (m72235jN != null) {
                        m72235jN.mo71493a();
                    }
                }
                return C24848g0.f119245a;
            }
        }

        C12802h0(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66591t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                StateFlow m115732w1 = MediaPickerView.this.m72168tN().m115732w1();
                a aVar = new a(MediaPickerView.this);
                this.f66591t = 1;
                if (m115732w1.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72290r(Continuation continuation) {
            return new C12802h0(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12802h0) m72290r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$i */
    /* loaded from: classes6.dex */
    public static final class C12803i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$i$a */
        /* loaded from: classes6.dex */
        public static final class a extends ContentObserver {

            /* renamed from: a */
            final /* synthetic */ MediaPickerView f66595a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MediaPickerView mediaPickerView, Handler handler) {
                super(handler);
                this.f66595a = mediaPickerView;
            }

            /* renamed from: b */
            public static final void m72295b(MediaPickerView mediaPickerView) {
                AbstractC19074t.m100208f(mediaPickerView, "this$0");
                mediaPickerView.f66552m1.compareAndSet(false, true);
                mediaPickerView.f66553n1.compareAndSet(false, true);
                if (mediaPickerView.m92674mJ() && mediaPickerView.m92672lJ()) {
                    mediaPickerView.m72098JM();
                }
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z11, Uri uri) {
                AbstractC17930e.Companion.m94550a().mo94530d("DEBOUNCE_PROCESS_CONTENT_CHANGE_MEDIA_PICKER", new Runnable() { // from class: l90.h
                    public /* synthetic */ RunnableC22162h() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaPickerView.C12803i.a.m72295b(MediaPickerView.this);
                    }
                }, this.f66595a.f66551l1);
            }
        }

        C12803i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final a mo12V4() {
            return new a(MediaPickerView.this, MediaPickerView.this.f66550k1);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$i0 */
    /* loaded from: classes6.dex */
    public static final class C12804i0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66596t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$i0$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66598p;

            a(MediaPickerView mediaPickerView) {
                this.f66598p = mediaPickerView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(C24860q c24860q, Continuation continuation) {
                this.f66598p.m72110UM().m72414r0((List) c24860q.m129216d());
                this.f66598p.m72110UM().m10008p();
                this.f66598p.m72102LM();
                InterfaceC12790d m72235jN = this.f66598p.m72235jN();
                if (m72235jN != null) {
                    m72235jN.mo71493a();
                }
                return C24848g0.f119245a;
            }
        }

        C12804i0(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66596t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                MediaPickerView.this.m72098JM();
                StateFlow m115734x1 = MediaPickerView.this.m72168tN().m115734x1();
                a aVar = new a(MediaPickerView.this);
                this.f66596t = 1;
                if (m115734x1.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72296r(Continuation continuation) {
            return new C12804i0(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12804i0) m72296r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$j */
    /* loaded from: classes6.dex */
    public static final class C12805j implements C27966e.b {

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$j$a */
        /* loaded from: classes6.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ MediaPickerView f66600q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MediaPickerView mediaPickerView) {
                super(0);
                this.f66600q = mediaPickerView;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m72299a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m72299a() {
                this.f66600q.m72168tN().m115677U2();
            }
        }

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$j$b */
        /* loaded from: classes6.dex */
        static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ MediaPickerView f66601q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(MediaPickerView mediaPickerView) {
                super(0);
                this.f66601q = mediaPickerView;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m72300a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m72300a() {
                this.f66601q.m72168tN().m115680V2();
            }
        }

        C12805j() {
        }

        @Override // vc0.C27966e.b
        /* renamed from: a */
        public void mo68951a(int i11) {
            MediaPickerView mediaPickerView = MediaPickerView.this;
            mediaPickerView.m72105NO(new a(mediaPickerView));
        }

        @Override // vc0.C27966e.b
        /* renamed from: b */
        public void mo68952b(int i11) {
            MediaPickerView mediaPickerView = MediaPickerView.this;
            mediaPickerView.m72105NO(new b(mediaPickerView));
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$j0 */
    /* loaded from: classes6.dex */
    public static final class C12806j0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66602t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$j0$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66604p;

            /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$j0$a$a */
            /* loaded from: classes6.dex */
            public static final class C32770a extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                final /* synthetic */ MediaPickerView f66605q;

                /* renamed from: r */
                final /* synthetic */ List f66606r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32770a(MediaPickerView mediaPickerView, List list) {
                    super(0);
                    this.f66605q = mediaPickerView;
                    this.f66606r = list;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public /* bridge */ /* synthetic */ Object mo12V4() {
                    m72304a();
                    return C24848g0.f119245a;
                }

                /* renamed from: a */
                public final void m72304a() {
                    this.f66605q.m72168tN().m115682W1(this.f66606r);
                }
            }

            a(MediaPickerView mediaPickerView) {
                this.f66604p = mediaPickerView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(List list, Continuation continuation) {
                MediaPickerView mediaPickerView = this.f66604p;
                mediaPickerView.m72105NO(new C32770a(mediaPickerView, list));
                return C24848g0.f119245a;
            }
        }

        C12806j0(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66602t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow mo104360k = MediaPickerView.this.m72241nN().mo104360k();
                a aVar = new a(MediaPickerView.this);
                this.f66602t = 1;
                if (mo104360k.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72301r(Continuation continuation) {
            return new C12806j0(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12806j0) m72301r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$k */
    /* loaded from: classes6.dex */
    public static final class C12807k extends AbstractC11859g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12807k(RecyclerView recyclerView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            super(recyclerView, (StateListDrawable) drawable, drawable2, (StateListDrawable) drawable3, drawable4);
            AbstractC19074t.m100206d(drawable, "null cannot be cast to non-null type android.graphics.drawable.StateListDrawable");
            AbstractC19074t.m100206d(drawable3, "null cannot be cast to non-null type android.graphics.drawable.StateListDrawable");
        }

        @Override // com.zing.zalo.p077ui.custom.AbstractC11859g
        /* renamed from: f0 */
        protected void mo46066f0() {
            MediaPickerView.this.m72110UM().m10008p();
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$k0 */
    /* loaded from: classes6.dex */
    public static final class C12808k0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66608t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$k0$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66610p;

            /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$k0$a$a */
            /* loaded from: classes6.dex */
            public static final class C32771a extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                final /* synthetic */ MediaPickerView f66611q;

                /* renamed from: r */
                final /* synthetic */ List f66612r;

                /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$k0$a$a$a */
                /* loaded from: classes6.dex */
                public static final class C32772a extends AbstractC29104l implements InterfaceC18509p {

                    /* renamed from: t */
                    int f66613t;

                    /* renamed from: u */
                    final /* synthetic */ List f66614u;

                    /* renamed from: v */
                    final /* synthetic */ MediaPickerView f66615v;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C32772a(List list, MediaPickerView mediaPickerView, Continuation continuation) {
                        super(2, continuation);
                        this.f66614u = list;
                        this.f66615v = mediaPickerView;
                    }

                    @Override // wm0.AbstractC29093a
                    /* renamed from: a */
                    public final Continuation mo238a(Object obj, Continuation continuation) {
                        return new C32772a(this.f66614u, this.f66615v, continuation);
                    }

                    @Override // wm0.AbstractC29093a
                    /* renamed from: o */
                    public final Object mo239o(Object obj) {
                        Object m142578e;
                        m142578e = AbstractC28298d.m142578e();
                        int i11 = this.f66613t;
                        if (i11 != 0) {
                            if (i11 == 1) {
                                AbstractC24862s.m129228b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC24862s.m129228b(obj);
                            CoroutineDispatcher m112679a = Dispatchers.m112679a();
                            List list = this.f66614u;
                            this.f66613t = 1;
                            obj = AbstractC24138a.m126111a(m112679a, list, this);
                            if (obj == m142578e) {
                                return m142578e;
                            }
                        }
                        this.f66615v.m72168tN().m115685X1((List) obj);
                        return C24848g0.f119245a;
                    }

                    @Override // en0.InterfaceC18509p
                    /* renamed from: r */
                    public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                        return ((C32772a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32771a(MediaPickerView mediaPickerView, List list) {
                    super(0);
                    this.f66611q = mediaPickerView;
                    this.f66612r = list;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public /* bridge */ /* synthetic */ Object mo12V4() {
                    m72308a();
                    return C24848g0.f119245a;
                }

                /* renamed from: a */
                public final void m72308a() {
                    BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(this.f66611q), null, null, new C32772a(this.f66612r, this.f66611q, null), 3, null);
                }
            }

            a(MediaPickerView mediaPickerView) {
                this.f66610p = mediaPickerView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(List list, Continuation continuation) {
                MediaPickerView mediaPickerView = this.f66610p;
                mediaPickerView.m72105NO(new C32771a(mediaPickerView, list));
                return C24848g0.f119245a;
            }
        }

        C12808k0(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66608t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow mo104369t = MediaPickerView.this.m72241nN().mo104369t();
                a aVar = new a(MediaPickerView.this);
                this.f66608t = 1;
                if (mo104369t.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72305r(Continuation continuation) {
            return new C12808k0(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12808k0) m72305r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$l */
    /* loaded from: classes6.dex */
    public static final class C12809l implements C12839a.b {
        C12809l() {
        }

        @Override // com.zing.zalo.p077ui.picker.mediapicker.C12839a.b
        /* renamed from: a */
        public boolean mo72310a() {
            AbstractC11859g abstractC11859g;
            RecyclerView.AbstractC1887n abstractC1887n = MediaPickerView.this.f66531R0;
            if (abstractC1887n instanceof AbstractC11859g) {
                abstractC11859g = (AbstractC11859g) abstractC1887n;
            } else {
                abstractC11859g = null;
            }
            if (abstractC11859g != null) {
                return abstractC11859g.m114868x();
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$l0 */
    /* loaded from: classes6.dex */
    public static final class C12810l0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66617t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$l0$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66619p;

            a(MediaPickerView mediaPickerView) {
                this.f66619p = mediaPickerView;
            }

            /* renamed from: a */
            public final Object m72313a(int i11, Continuation continuation) {
                this.f66619p.m72099KM(i11);
                return C24848g0.f119245a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            public /* bridge */ /* synthetic */ Object mo12109b(Object obj, Continuation continuation) {
                return m72313a(((Number) obj).intValue(), continuation);
            }
        }

        C12810l0(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66617t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow m115736y1 = MediaPickerView.this.m72168tN().m115736y1();
                a aVar = new a(MediaPickerView.this);
                this.f66617t = 1;
                if (m115736y1.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72311r(Continuation continuation) {
            return new C12810l0(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12810l0) m72311r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$m */
    /* loaded from: classes6.dex */
    public static final class C12811m extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        private final int[] f66620a = new int[2];

        C12811m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
            MediaPickerView.this.m72092FO(i11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo10176d(recyclerView, i11, i12);
            MediaPickerView.this.m72095GO(this.f66620a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$m0 */
    /* loaded from: classes6.dex */
    public static final class C12812m0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66622t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$m0$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66624p;

            a(MediaPickerView mediaPickerView) {
                this.f66624p = mediaPickerView;
            }

            /* renamed from: a */
            public final Object m72316a(long j11, Continuation continuation) {
                int i11;
                if (this.f66624p.m72168tN().m115641A2()) {
                    i11 = 2;
                } else {
                    i11 = 0;
                }
                AbstractC23280z4.m120360w0(this.f66624p.getContext(), j11, i11);
                return C24848g0.f119245a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            public /* bridge */ /* synthetic */ Object mo12109b(Object obj, Continuation continuation) {
                return m72316a(((Number) obj).longValue(), continuation);
            }
        }

        C12812m0(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66622t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow m115661N1 = MediaPickerView.this.m72168tN().m115661N1();
                a aVar = new a(MediaPickerView.this);
                this.f66622t = 1;
                if (m115661N1.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72314r(Continuation continuation) {
            return new C12812m0(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12812m0) m72314r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$n */
    /* loaded from: classes6.dex */
    public static final class C12813n extends RecyclerView.AbstractC1887n {
        C12813n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            int m9817A0 = recyclerView.m9817A0(view);
            if (MediaPickerView.this.m72110UM().m72406e0(m9817A0)) {
                return;
            }
            boolean m72405d0 = MediaPickerView.this.m72110UM().m72405d0();
            if (m9817A0 < MediaPickerView.this.f66528O0 + (m72405d0 ? 1 : 0)) {
                rect.top = 0;
            } else {
                rect.top = MediaPickerView.Companion.m72256a();
            }
            int i11 = m9817A0 - (m72405d0 ? 1 : 0);
            if (i11 % MediaPickerView.this.f66528O0 == 0) {
                rect.left = 0;
                rect.right = MediaPickerView.Companion.m72256a() / 2;
            } else if (i11 % MediaPickerView.this.f66528O0 == MediaPickerView.this.f66528O0 - 1) {
                rect.left = MediaPickerView.Companion.m72256a() / 2;
                rect.right = 0;
            } else {
                C12781a c12781a = MediaPickerView.Companion;
                rect.left = c12781a.m72256a() / 2;
                rect.right = c12781a.m72256a() / 2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$n0 */
    /* loaded from: classes6.dex */
    public static final class C12814n0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66626t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$n0$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66628p;

            a(MediaPickerView mediaPickerView) {
                this.f66628p = mediaPickerView;
            }

            /* renamed from: a */
            public final Object m72319a(boolean z11, Continuation continuation) {
                this.f66628p.m72126dP(z11);
                return C24848g0.f119245a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            public /* bridge */ /* synthetic */ Object mo12109b(Object obj, Continuation continuation) {
                return m72319a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        C12814n0(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66626t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                StateFlow m115655L1 = MediaPickerView.this.m72168tN().m115655L1();
                a aVar = new a(MediaPickerView.this);
                this.f66626t = 1;
                if (m115655L1.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72317r(Continuation continuation) {
            return new C12814n0(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12814n0) m72317r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$o */
    /* loaded from: classes6.dex */
    public static final class C12815o extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$o$a */
        /* loaded from: classes6.dex */
        public static final class a extends GridLayoutManager.AbstractC1865b {

            /* renamed from: e */
            final /* synthetic */ MediaPickerView f66630e;

            a(MediaPickerView mediaPickerView) {
                this.f66630e = mediaPickerView;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1865b
            /* renamed from: f */
            public int mo9682f(int i11) {
                if (this.f66630e.m72110UM().m72406e0(i11)) {
                    return this.f66630e.f66528O0;
                }
                return 1;
            }
        }

        C12815o() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ScrollControlGridLayoutManager mo12V4() {
            ScrollControlGridLayoutManager scrollControlGridLayoutManager = new ScrollControlGridLayoutManager(MediaPickerView.this.getContext(), MediaPickerView.this.f66528O0, 1, false);
            MediaPickerView mediaPickerView = MediaPickerView.this;
            scrollControlGridLayoutManager.m87991h3(mediaPickerView.m72168tN().m115733w2());
            scrollControlGridLayoutManager.m9671f3(new a(mediaPickerView));
            return scrollControlGridLayoutManager;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$o0 */
    /* loaded from: classes6.dex */
    public static final class C12816o0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66631t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$o0$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66633p;

            a(MediaPickerView mediaPickerView) {
                this.f66633p = mediaPickerView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(MediaItem mediaItem, Continuation continuation) {
                if (this.f66633p.m92648SI() != null && this.f66633p.m92672lJ()) {
                    new C19303d(mediaItem).m92602UK(this.f66633p.m92649TI(), "VideoBigSizeDialog");
                }
                return C24848g0.f119245a;
            }
        }

        C12816o0(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66631t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow m115657M1 = MediaPickerView.this.m72168tN().m115657M1();
                a aVar = new a(MediaPickerView.this);
                this.f66631t = 1;
                if (m115657M1.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72321r(Continuation continuation) {
            return new C12816o0(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12816o0) m72321r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$p */
    /* loaded from: classes6.dex */
    public static final class C12817p extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f66634t;

        /* renamed from: v */
        final /* synthetic */ InterfaceC18505l f66636v;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$p$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f66637t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18505l f66638u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC18505l interfaceC18505l, Continuation continuation) {
                super(2, continuation);
                this.f66638u = interfaceC18505l;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f66638u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f66637t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC18505l interfaceC18505l = this.f66638u;
                    this.f66637t = 1;
                    if (interfaceC18505l.mo205i9(this) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12817p(InterfaceC18505l interfaceC18505l, Continuation continuation) {
            super(2, continuation);
            this.f66636v = interfaceC18505l;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C12817p(this.f66636v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66634t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC1801w m92657cJ = MediaPickerView.this.m92657cJ();
                AbstractC19074t.m100207e(m92657cJ, "getViewLifecycleOwner(...)");
                AbstractC1785o.b bVar = AbstractC1785o.b.STARTED;
                a aVar = new a(this.f66636v, null);
                this.f66634t = 1;
                if (RepeatOnLifecycleKt.m9234b(m92657cJ, bVar, aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C12817p) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$p0 */
    /* loaded from: classes6.dex */
    public static final class C12818p0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66639t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$p0$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66641p;

            a(MediaPickerView mediaPickerView) {
                this.f66641p = mediaPickerView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(C24848g0 c24848g0, Continuation continuation) {
                this.f66641p.m72232hP();
                return C24848g0.f119245a;
            }
        }

        C12818p0(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66639t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow m115664O1 = MediaPickerView.this.m72168tN().m115664O1();
                a aVar = new a(MediaPickerView.this);
                this.f66639t = 1;
                if (m115664O1.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72326r(Continuation continuation) {
            return new C12818p0(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12818p0) m72326r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$q */
    /* loaded from: classes6.dex */
    public static final class C12819q extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ int f66643r;

        /* renamed from: s */
        final /* synthetic */ SensitiveData f66644s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12819q(int i11, SensitiveData sensitiveData) {
            super(0);
            this.f66643r = i11;
            this.f66644s = sensitiveData;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m72329a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m72329a() {
            MediaPickerView.this.m72168tN().m115662N2(this.f66643r, this.f66644s);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$q0 */
    /* loaded from: classes6.dex */
    public static final class C12820q0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66645t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$q0$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66647p;

            a(MediaPickerView mediaPickerView) {
                this.f66647p = mediaPickerView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(C24848g0 c24848g0, Continuation continuation) {
                QuickPickerView.InterfaceC12659u m72238lN = this.f66647p.m72238lN();
                if (m72238lN != null) {
                    m72238lN.mo45272n(this.f66647p.m72254yN(), this.f66647p.m72190LN());
                }
                return C24848g0.f119245a;
            }
        }

        C12820q0(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66645t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow m115665P1 = MediaPickerView.this.m72168tN().m115665P1();
                a aVar = new a(MediaPickerView.this);
                this.f66645t = 1;
                if (m115665P1.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72330r(Continuation continuation) {
            return new C12820q0(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12820q0) m72330r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$r */
    /* loaded from: classes6.dex */
    public static final class C12821r extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66648t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$r$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66650p;

            a(MediaPickerView mediaPickerView) {
                this.f66650p = mediaPickerView;
            }

            /* renamed from: a */
            public final Object m72335a(boolean z11, Continuation continuation) {
                this.f66650p.m72110UM().m72411o0(z11);
                return C24848g0.f119245a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            public /* bridge */ /* synthetic */ Object mo12109b(Object obj, Continuation continuation) {
                return m72335a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        C12821r(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66648t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow m115684X0 = MediaPickerView.this.m72168tN().m115684X0();
                a aVar = new a(MediaPickerView.this);
                this.f66648t = 1;
                if (m115684X0.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72333r(Continuation continuation) {
            return new C12821r(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12821r) m72333r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$r0 */
    /* loaded from: classes6.dex */
    public static final class C12822r0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66651t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$r0$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66653p;

            a(MediaPickerView mediaPickerView) {
                this.f66653p = mediaPickerView;
            }

            /* renamed from: a */
            public final Object m72338a(boolean z11, Continuation continuation) {
                this.f66653p.m72144jP(z11);
                return C24848g0.f119245a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            public /* bridge */ /* synthetic */ Object mo12109b(Object obj, Continuation continuation) {
                return m72338a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        C12822r0(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66651t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow m115668Q1 = MediaPickerView.this.m72168tN().m115668Q1();
                a aVar = new a(MediaPickerView.this);
                this.f66651t = 1;
                if (m115668Q1.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72336r(Continuation continuation) {
            return new C12822r0(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12822r0) m72336r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$s */
    /* loaded from: classes6.dex */
    public static final class C12823s extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66654t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$s$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66656p;

            a(MediaPickerView mediaPickerView) {
                this.f66656p = mediaPickerView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(C24848g0 c24848g0, Continuation continuation) {
                C27962a c27962a = this.f66656p.f66542c1;
                if (c27962a == null) {
                    AbstractC19074t.m100223u("dragSelectTouchListener");
                    c27962a = null;
                }
                c27962a.m140936i();
                return C24848g0.f119245a;
            }
        }

        C12823s(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66654t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow m115689a1 = MediaPickerView.this.m72168tN().m115689a1();
                a aVar = new a(MediaPickerView.this);
                this.f66654t = 1;
                if (m115689a1.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72339r(Continuation continuation) {
            return new C12823s(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12823s) m72339r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$s0 */
    /* loaded from: classes6.dex */
    public static final class C12824s0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66657t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$s0$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66659p;

            a(MediaPickerView mediaPickerView) {
                this.f66659p = mediaPickerView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(C24848g0 c24848g0, Continuation continuation) {
                AbstractC11859g abstractC11859g;
                RecyclerView.AbstractC1887n abstractC1887n = this.f66659p.f66531R0;
                if (abstractC1887n instanceof AbstractC11859g) {
                    abstractC11859g = (AbstractC11859g) abstractC1887n;
                } else {
                    abstractC11859g = null;
                }
                if (abstractC11859g != null) {
                    abstractC11859g.m114859H(AbstractC23222t7.f112544W, AbstractC23222t7.f112539R);
                }
                this.f66659p.m72112WM().f140116Z.m9853S0();
                return C24848g0.f119245a;
            }
        }

        C12824s0(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66657t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow m115670R1 = MediaPickerView.this.m72168tN().m115670R1();
                a aVar = new a(MediaPickerView.this);
                this.f66657t = 1;
                if (m115670R1.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72342r(Continuation continuation) {
            return new C12824s0(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12824s0) m72342r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$t */
    /* loaded from: classes6.dex */
    public static final class C12825t extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66660t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$t$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66662p;

            a(MediaPickerView mediaPickerView) {
                this.f66662p = mediaPickerView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(C24848g0 c24848g0, Continuation continuation) {
                this.f66662p.m72076AN();
                return C24848g0.f119245a;
            }
        }

        C12825t(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66660t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow m115690b1 = MediaPickerView.this.m72168tN().m115690b1();
                a aVar = new a(MediaPickerView.this);
                this.f66660t = 1;
                if (m115690b1.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72345r(Continuation continuation) {
            return new C12825t(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12825t) m72345r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$t0 */
    /* loaded from: classes6.dex */
    public static final class C12826t0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66663t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$t0$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66665p;

            a(MediaPickerView mediaPickerView) {
                this.f66665p = mediaPickerView;
            }

            /* renamed from: a */
            public final Object m72350a(int i11, Continuation continuation) {
                this.f66665p.m72149lP(i11);
                return C24848g0.f119245a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            public /* bridge */ /* synthetic */ Object mo12109b(Object obj, Continuation continuation) {
                return m72350a(((Number) obj).intValue(), continuation);
            }
        }

        C12826t0(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66663t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow m115672S1 = MediaPickerView.this.m72168tN().m115672S1();
                a aVar = new a(MediaPickerView.this);
                this.f66663t = 1;
                if (m115672S1.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72348r(Continuation continuation) {
            return new C12826t0(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12826t0) m72348r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$u */
    /* loaded from: classes6.dex */
    public static final class C12827u extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66666t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$u$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66668p;

            a(MediaPickerView mediaPickerView) {
                this.f66668p = mediaPickerView;
            }

            /* renamed from: a */
            public final Object m72353a(boolean z11, Continuation continuation) {
                int i11;
                ProgressBar progressBar = this.f66668p.m72112WM().f140112V;
                int i12 = 8;
                if (z11) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                progressBar.setVisibility(i11);
                RecyclerView recyclerView = this.f66668p.m72112WM().f140116Z;
                if (!z11) {
                    i12 = 0;
                }
                recyclerView.setVisibility(i12);
                if (Build.VERSION.SDK_INT >= 34) {
                    this.f66668p.m72103MM(!z11);
                }
                return C24848g0.f119245a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            public /* bridge */ /* synthetic */ Object mo12109b(Object obj, Continuation continuation) {
                return m72353a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        C12827u(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66666t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow m115712l2 = MediaPickerView.this.m72168tN().m115712l2();
                a aVar = new a(MediaPickerView.this);
                this.f66666t = 1;
                if (m115712l2.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72351r(Continuation continuation) {
            return new C12827u(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12827u) m72351r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$u0 */
    /* loaded from: classes6.dex */
    public static final class C12828u0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66669t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$u0$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66671p;

            a(MediaPickerView mediaPickerView) {
                this.f66671p = mediaPickerView;
            }

            /* renamed from: a */
            public final Object m72356a(int i11, Continuation continuation) {
                this.f66671p.m72110UM().m72415s0(i11);
                return C24848g0.f119245a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            public /* bridge */ /* synthetic */ Object mo12109b(Object obj, Continuation continuation) {
                return m72356a(((Number) obj).intValue(), continuation);
            }
        }

        C12828u0(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66669t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow m115674T1 = MediaPickerView.this.m72168tN().m115674T1();
                a aVar = new a(MediaPickerView.this);
                this.f66669t = 1;
                if (m115674T1.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72354r(Continuation continuation) {
            return new C12828u0(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12828u0) m72354r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$v */
    /* loaded from: classes6.dex */
    public static final class C12829v extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66672t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$v$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66674p;

            a(MediaPickerView mediaPickerView) {
                this.f66674p = mediaPickerView;
            }

            /* renamed from: a */
            public final Object m72359a(boolean z11, Continuation continuation) {
                this.f66674p.m72128eN().m87991h3(z11);
                return C24848g0.f119245a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            public /* bridge */ /* synthetic */ Object mo12109b(Object obj, Continuation continuation) {
                return m72359a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        C12829v(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66672t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                StateFlow m115735x2 = MediaPickerView.this.m72168tN().m115735x2();
                a aVar = new a(MediaPickerView.this);
                this.f66672t = 1;
                if (m115735x2.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72357r(Continuation continuation) {
            return new C12829v(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12829v) m72357r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$v0 */
    /* loaded from: classes6.dex */
    public static final class C12830v0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66675t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$v0$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66677p;

            a(MediaPickerView mediaPickerView) {
                this.f66677p = mediaPickerView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(List list, Continuation continuation) {
                this.f66677p.m72097IM(list);
                return C24848g0.f119245a;
            }
        }

        C12830v0(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66675t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                StateFlow m115676U1 = MediaPickerView.this.m72168tN().m115676U1();
                a aVar = new a(MediaPickerView.this);
                this.f66675t = 1;
                if (m115676U1.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72360r(Continuation continuation) {
            return new C12830v0(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12830v0) m72360r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$w */
    /* loaded from: classes6.dex */
    public static final class C12831w extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66678t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$w$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66680p;

            a(MediaPickerView mediaPickerView) {
                this.f66680p = mediaPickerView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(C24848g0 c24848g0, Continuation continuation) {
                this.f66680p.m72202Pq();
                return C24848g0.f119245a;
            }
        }

        C12831w(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66678t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow m115699f1 = MediaPickerView.this.m72168tN().m115699f1();
                a aVar = new a(MediaPickerView.this);
                this.f66678t = 1;
                if (m115699f1.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72363r(Continuation continuation) {
            return new C12831w(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12831w) m72363r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$w0 */
    /* loaded from: classes6.dex */
    public static final class C12832w0 extends AbstractC19075u implements InterfaceC18505l {
        C12832w0() {
            super(1);
        }

        /* renamed from: a */
        public final void m72366a(List list) {
            AbstractC19074t.m100208f(list, "it");
            MediaPickerView.this.m72097IM(list);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m72366a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$x */
    /* loaded from: classes6.dex */
    public static final class C12833x extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66682t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$x$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66684p;

            a(MediaPickerView mediaPickerView) {
                this.f66684p = mediaPickerView;
            }

            /* renamed from: a */
            public final Object m72369a(int i11, Continuation continuation) {
                this.f66684p.m72214VN(i11);
                return C24848g0.f119245a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            public /* bridge */ /* synthetic */ Object mo12109b(Object obj, Continuation continuation) {
                return m72369a(((Number) obj).intValue(), continuation);
            }
        }

        C12833x(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66682t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow m115700g1 = MediaPickerView.this.m72168tN().m115700g1();
                a aVar = new a(MediaPickerView.this);
                this.f66682t = 1;
                if (m115700g1.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72367r(Continuation continuation) {
            return new C12833x(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12833x) m72367r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$x0 */
    /* loaded from: classes6.dex */
    public static final class C12834x0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66685t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$x0$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66687p;

            /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$x0$a$a */
            /* loaded from: classes6.dex */
            public static final class C32773a extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                final /* synthetic */ MediaPickerView f66688q;

                /* renamed from: r */
                final /* synthetic */ List f66689r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32773a(MediaPickerView mediaPickerView, List list) {
                    super(0);
                    this.f66688q = mediaPickerView;
                    this.f66689r = list;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public /* bridge */ /* synthetic */ Object mo12V4() {
                    m72373a();
                    return C24848g0.f119245a;
                }

                /* renamed from: a */
                public final void m72373a() {
                    this.f66688q.m72168tN().m115693c2(this.f66689r);
                }
            }

            a(MediaPickerView mediaPickerView) {
                this.f66687p = mediaPickerView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(List list, Continuation continuation) {
                MediaPickerView mediaPickerView = this.f66687p;
                mediaPickerView.m72105NO(new C32773a(mediaPickerView, list));
                return C24848g0.f119245a;
            }
        }

        C12834x0(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66685t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow mo104364o = MediaPickerView.this.m72241nN().mo104364o();
                a aVar = new a(MediaPickerView.this);
                this.f66685t = 1;
                if (mo104364o.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72370r(Continuation continuation) {
            return new C12834x0(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12834x0) m72370r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$y */
    /* loaded from: classes6.dex */
    public static final class C12835y extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66690t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$y$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66692p;

            a(MediaPickerView mediaPickerView) {
                this.f66692p = mediaPickerView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(C24848g0 c24848g0, Continuation continuation) {
                this.f66692p.m72113WN();
                return C24848g0.f119245a;
            }
        }

        C12835y(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66690t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow m115702h1 = MediaPickerView.this.m72168tN().m115702h1();
                a aVar = new a(MediaPickerView.this);
                this.f66690t = 1;
                if (m115702h1.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72374r(Continuation continuation) {
            return new C12835y(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12835y) m72374r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$y0 */
    /* loaded from: classes6.dex */
    static final class C12836y0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ MediaItem f66694r;

        /* renamed from: s */
        final /* synthetic */ boolean f66695s;

        /* renamed from: t */
        final /* synthetic */ int f66696t;

        /* renamed from: u */
        final /* synthetic */ boolean f66697u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12836y0(MediaItem mediaItem, boolean z11, int i11, boolean z12) {
            super(0);
            this.f66694r = mediaItem;
            this.f66695s = z11;
            this.f66696t = i11;
            this.f66697u = z12;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m72377a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m72377a() {
            if (MediaPickerView.this.m92672lJ()) {
                MediaPickerView.this.m72168tN().m115649G0(this.f66694r, this.f66695s, this.f66696t, this.f66697u);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$z */
    /* loaded from: classes6.dex */
    public static final class C12837z extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f66698t;

        /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$z$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MediaPickerView f66700p;

            a(MediaPickerView mediaPickerView) {
                this.f66700p = mediaPickerView;
            }

            /* renamed from: a */
            public final Object m72380a(boolean z11, Continuation continuation) {
                QuickPickerView.InterfaceC12655q m72227cN = this.f66700p.m72227cN();
                if (m72227cN != null) {
                    m72227cN.mo71300b(z11);
                }
                return C24848g0.f119245a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            public /* bridge */ /* synthetic */ Object mo12109b(Object obj, Continuation continuation) {
                return m72380a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        C12837z(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f66698t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                StateFlow m115707j1 = MediaPickerView.this.m72168tN().m115707j1();
                a aVar = new a(MediaPickerView.this);
                this.f66698t = 1;
                if (m115707j1.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        /* renamed from: r */
        public final Continuation m72378r(Continuation continuation) {
            return new C12837z(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((C12837z) m72378r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerView$z0 */
    /* loaded from: classes6.dex */
    static final class C12838z0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ MediaItem f66702r;

        /* renamed from: s */
        final /* synthetic */ int f66703s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12838z0(MediaItem mediaItem, int i11) {
            super(0);
            this.f66702r = mediaItem;
            this.f66703s = i11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m72381a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m72381a() {
            if (MediaPickerView.this.m92672lJ()) {
                MediaPickerView.this.m72168tN().m115649G0(this.f66702r, true, this.f66703s, true);
            }
        }
    }

    public MediaPickerView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC20079a m120566B0 = AbstractC23306f.m120566B0();
        AbstractC19074t.m100207e(m120566B0, "provideMediaPickerRepository(...)");
        this.f66526M0 = m120566B0;
        this.f66527N0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C22164j.class), new C12792d1(new C12789c1(this)), new C12798f1());
        this.f66528O0 = 3;
        m129210a = AbstractC24856m.m129210a(new C12796f());
        this.f66529P0 = m129210a;
        this.f66530Q0 = AbstractC29233h.m145990a(new C12815o());
        this.f66545f1 = C20634a.f101535a.m107534a();
        this.f66546g1 = true;
        this.f66549j1 = true;
        this.f66550k1 = new Handler(Looper.getMainLooper());
        this.f66551l1 = 400L;
        this.f66552m1 = new AtomicBoolean(false);
        this.f66553n1 = new AtomicBoolean(false);
        this.f66554o1 = new AtomicBoolean(false);
        m129210a2 = AbstractC24856m.m129210a(new C12803i());
        this.f66555p1 = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C12795e1());
        this.f66556q1 = m129210a3;
        this.f66557r1 = true;
    }

    /* renamed from: AN */
    public final void m72076AN() {
        MenuListPopupView menuListPopupView = this.f66533T0;
        if (menuListPopupView != null) {
            menuListPopupView.dismiss();
        }
    }

    /* renamed from: AO */
    private final void m72077AO() {
        m72108RN(new C12826t0(null));
    }

    /* renamed from: BN */
    private final void m72079BN() {
        C27962a c27962a = new C27962a();
        C27966e c27966e = this.f66541b1;
        if (c27966e == null) {
            AbstractC19074t.m100223u("dragSelectionProcessor");
            c27966e = null;
        }
        C27962a m140946z = c27962a.m140946z(c27966e);
        AbstractC19074t.m100207e(m140946z, "withSelectListener(...)");
        this.f66542c1 = m140946z;
    }

    /* renamed from: BO */
    private final void m72080BO() {
        m72108RN(new C12828u0(null));
    }

    /* renamed from: CN */
    private final void m72082CN() {
        this.f66541b1 = new C27966e(new C27966e.a() { // from class: l90.e
            public /* synthetic */ C22159e() {
            }

            @Override // vc0.C27966e.a
            /* renamed from: a */
            public final void mo115544a(int i11, int i12, float f11, float f12, boolean z11, int i13) {
                MediaPickerView.m72085DN(MediaPickerView.this, i11, i12, f11, f12, z11, i13);
            }
        }, new C12805j());
    }

    /* renamed from: CO */
    private final void m72083CO() {
        m72108RN(new C12830v0(null));
        m72168tN().m115687Z0().m9219j(this, new C19965d(new C12832w0()));
    }

    /* renamed from: DN */
    public static final void m72085DN(MediaPickerView mediaPickerView, int i11, int i12, float f11, float f12, boolean z11, int i13) {
        AbstractC19074t.m100208f(mediaPickerView, "this$0");
        mediaPickerView.m72110UM().m72408k0(i11, i12, z11, i13);
    }

    /* renamed from: DO */
    private final void m72086DO() {
        m72108RN(new C12834x0(null));
    }

    /* renamed from: EN */
    private final void m72088EN() {
        C12839a m72110UM = m72110UM();
        m72110UM.m72410m0(m72168tN().m115681W0());
        m72110UM.m72417u0(m72168tN().m115737y2());
        m72110UM.m72418v0(m72168tN().m115647E2());
        m72110UM.m72415s0(m72168tN().m115731v1());
        AbstractC20110a.a aVar = AbstractC20110a.f98889a;
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("[MediaPicker] Start query with PhotoType: %s", Arrays.copyOf(new Object[]{Integer.valueOf(m72110UM.m72401Z())}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        aVar.mo104556o(8, format, new Object[0]);
        if (m72168tN().m115739z2()) {
            m72110UM.m72413q0(1);
        } else if (m72168tN().m115641A2()) {
            m72110UM.m72413q0(3);
        }
        m72110UM.m72412p0(this);
        m72110UM.m72409l0(new C12809l());
    }

    /* renamed from: EO */
    public static final void m72089EO(MediaPickerView mediaPickerView, MediaItem mediaItem, AnimationTarget animationTarget, int i11, C20275e c20275e) {
        AbstractC19074t.m100208f(mediaPickerView, "this$0");
        AbstractC19074t.m100208f(mediaItem, "$it");
        mediaPickerView.m72168tN().m115679V1(new C21280a(mediaItem, animationTarget, i11, c20275e, "", ""));
    }

    /* renamed from: FN */
    private final void m72091FN() {
        int i11;
        f66525t1 = AbstractC23136l9.m118659K(AbstractC16802y.multi_picker_spacing);
        C22164j m72168tN = m72168tN();
        if (m72168tN.m115714m2()) {
            i11 = AbstractC8020f0.str_upload_photo_video_reach_limit;
        } else {
            i11 = AbstractC8020f0.str_uploadphoto_reachlimit;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(i11);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        m72168tN.m115653I3(m118743r0);
        m72168tN.m115654K3();
        m72111UO(m72100KN());
    }

    /* renamed from: FO */
    public final void m72092FO(int i11) {
        try {
            if (i11 == 0) {
                m72110UM().m72416t0(false);
                m72110UM().m10008p();
            } else {
                m72110UM().m72416t0(true);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: GN */
    private final void m72094GN() {
        int i11;
        this.f66530Q0.reset();
        m72088EN();
        C27962a c27962a = null;
        m72112WM().f140116Z.setItemAnimator(null);
        m72112WM().f140116Z.setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.PrimaryBackgroundColor));
        m72112WM().f140116Z.setLayoutManager(m72128eN());
        m72112WM().f140116Z.setOverScrollMode(2);
        m72112WM().f140116Z.setAdapter(m72110UM());
        m72112WM().f140116Z.m9826E(new C12811m());
        m72112WM().f140116Z.m9816A(new C12813n());
        m72139i2();
        m72082CN();
        m72079BN();
        RecyclerView recyclerView = m72112WM().f140116Z;
        C27962a c27962a2 = this.f66542c1;
        if (c27962a2 == null) {
            AbstractC19074t.m100223u("dragSelectTouchListener");
        } else {
            c27962a = c27962a2;
        }
        recyclerView.m9825D(c27962a);
        m72112WM().f140109S.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.fab_sendphoto_disable));
        m72112WM().f140114X.setRadius(AbstractC23222t7.f112570l);
        m72112WM().f140114X.setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.AppPrimaryColor));
        m72112WM().f140111U.setOnClickListener(this);
        m72112WM().f140110T.setOnClickListener(this);
        boolean m115641A2 = m72168tN().m115641A2();
        RecyclingImageView recyclingImageView = m72112WM().f140109S;
        int i12 = 8;
        if (m115641A2) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        recyclingImageView.setVisibility(i11);
        RecyclingImageView recyclingImageView2 = m72112WM().f140108R;
        if (m115641A2) {
            i12 = 0;
        }
        recyclingImageView2.setVisibility(i12);
        if (m72168tN().m115739z2() && m72112WM().f140107Q.getVisibility() != 0) {
            m72112WM().f140107Q.setVisibility(0);
        }
    }

    /* renamed from: GO */
    public final void m72095GO(int[] iArr) {
        if (!m72168tN().m115647E2()) {
            return;
        }
        boolean m72405d0 = m72110UM().m72405d0();
        int m9740Y1 = m72128eN().m9740Y1();
        if (m9740Y1 != 0 && (!m72405d0 || m9740Y1 != 1)) {
            QuickPickerView.InterfaceC12654p interfaceC12654p = this.f66535V0;
            if (interfaceC12654p != null) {
                interfaceC12654p.mo71303a();
                return;
            }
            return;
        }
        m72228fN(iArr);
    }

    /* renamed from: HO */
    private final void m72096HO() {
        try {
            m72168tN().m115688Z2(this.f66557r1, false);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("MediaPickerView isResumed:" + m92685rJ() + ", isRemoving:" + m92681pJ()).mo104552e(e11);
        }
    }

    /* renamed from: IM */
    public final void m72097IM(List list) {
        if (m72168tN().m115652I2()) {
            m72110UM().m72414r0(list);
            m72110UM().m10008p();
            m72102LM();
            InterfaceC12790d interfaceC12790d = this.f66536W0;
            if (interfaceC12790d != null) {
                interfaceC12790d.mo71493a();
            }
        }
    }

    /* renamed from: JM */
    public final void m72098JM() {
        try {
            if (this.f66552m1.get()) {
                SensitiveData sensitiveData = new SensitiveData("gallery_observe_change", "auto_scan", null, 4, null);
                if (this.f66553n1.get()) {
                    m72168tN().m115694c3(false, true, sensitiveData);
                }
                if (this.f66554o1.get()) {
                    m72168tN().m115704h3(false, true, sensitiveData);
                }
                m72168tN().m115698e3(false, true, sensitiveData);
                this.f66553n1.compareAndSet(true, false);
                this.f66554o1.compareAndSet(true, false);
                this.f66552m1.compareAndSet(true, false);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: KM */
    public final void m72099KM(int i11) {
        m72105NO(new C12799g(i11));
    }

    /* renamed from: KN */
    private final boolean m72100KN() {
        if (m72168tN().m115714m2()) {
            return AbstractC23034c6.m118128N();
        }
        if (m72168tN().m115652I2()) {
            return AbstractC23034c6.m118129O();
        }
        return AbstractC23034c6.m118127M();
    }

    /* renamed from: KO */
    public static /* synthetic */ void m72101KO(MediaPickerView mediaPickerView, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = null;
        }
        mediaPickerView.m72189JO(list);
    }

    /* renamed from: LM */
    public final void m72102LM() {
        if (!m72168tN().m115733w2()) {
            m72099KM(0);
        }
    }

    /* renamed from: MM */
    public final void m72103MM(boolean z11) {
        MediaPickerPermissionBanner mediaPickerPermissionBanner = m72112WM().f140115Y;
        AbstractC19074t.m100207e(mediaPickerPermissionBanner, "permissionBanner");
        boolean m118124J = AbstractC23034c6.m118124J(m92689tK());
        if (z11 && m118124J) {
            mediaPickerPermissionBanner.m72074j(new C12801h());
            mediaPickerPermissionBanner.setVisibility(0);
            mediaPickerPermissionBanner.setOnClickListener(this);
        } else {
            mediaPickerPermissionBanner.setVisibility(8);
            mediaPickerPermissionBanner.setOnClickListener(null);
        }
    }

    /* renamed from: NM */
    private final void m72104NM() {
        AbstractC23280z4.m120317b(this);
        m72168tN().m115723q3(true);
        m72168tN().m115671R2();
    }

    /* renamed from: NO */
    public final void m72105NO(InterfaceC18494a interfaceC18494a) {
        if (this.f66546g1) {
            interfaceC18494a.mo12V4();
        }
    }

    /* renamed from: OM */
    private final void m72106OM(boolean z11, boolean z12) {
        if ((z12 && !(getContext() instanceof ZaloBubbleActivity) && !this.f66549j1) || Build.VERSION.SDK_INT < 29 || ((!z12 && (getContext() instanceof ZaloBubbleActivity)) || this.f66549j1)) {
            this.f66546g1 = z11;
            if (z11) {
                m72096HO();
            }
        }
    }

    /* renamed from: QM */
    public static /* synthetic */ void m72107QM(MediaPickerView mediaPickerView, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = null;
        }
        mediaPickerView.m72199PM(list);
    }

    /* renamed from: RN */
    private final void m72108RN(InterfaceC18505l interfaceC18505l) {
        InterfaceC1801w m92657cJ = m92657cJ();
        AbstractC19074t.m100207e(m92657cJ, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(m92657cJ), null, null, new C12817p(interfaceC18505l, null), 3, null);
    }

    /* renamed from: SM */
    public static /* synthetic */ void m72109SM(MediaPickerView mediaPickerView, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = null;
        }
        mediaPickerView.m72205RM(list);
    }

    /* renamed from: UM */
    public final C12839a m72110UM() {
        return (C12839a) this.f66529P0.getValue();
    }

    /* renamed from: UO */
    private final void m72111UO(boolean z11) {
        this.f66545f1.mo107535a(this, f66524s1[0], Boolean.valueOf(z11));
    }

    /* renamed from: WM */
    public final AbstractC30151z7 m72112WM() {
        AbstractC30151z7 abstractC30151z7 = this.f66543d1;
        AbstractC19074t.m100205c(abstractC30151z7);
        return abstractC30151z7;
    }

    /* renamed from: WN */
    public final void m72113WN() {
        this.f66550k1.post(new Runnable() { // from class: l90.d
            public /* synthetic */ RunnableC22158d() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                MediaPickerView.m72114XN(MediaPickerView.this);
            }
        });
    }

    /* renamed from: XN */
    public static final void m72114XN(MediaPickerView mediaPickerView) {
        AbstractC19074t.m100208f(mediaPickerView, "this$0");
        int m9740Y1 = mediaPickerView.m72128eN().m9740Y1();
        mediaPickerView.m72110UM().m10013u(m9740Y1, (mediaPickerView.m72128eN().m9745c2() - m9740Y1) + 4);
    }

    /* renamed from: YN */
    private final void m72115YN() {
        m72108RN(new C12821r(null));
    }

    /* renamed from: ZM */
    private final C29939n3 m72116ZM() {
        C29939n3 c29939n3 = this.f66544e1;
        AbstractC19074t.m100205c(c29939n3);
        return c29939n3;
    }

    /* renamed from: ZN */
    private final void m72117ZN() {
        m72108RN(new C12823s(null));
    }

    /* renamed from: aO */
    private final void m72118aO() {
        m72108RN(new C12825t(null));
    }

    /* renamed from: bO */
    private final void m72119bO() {
        m72108RN(new C12827u(null));
    }

    /* renamed from: bP */
    private final void m72120bP(ActionBar actionBar) {
        try {
            List m115695d1 = m72168tN().m115695d1();
            if (m115695d1.isEmpty()) {
                return;
            }
            MenuListPopupView m87746pL = MenuListPopupView.m87746pL(actionBar, m115695d1, new ViewOnClickListenerC7267y0.a() { // from class: l90.f
                public /* synthetic */ C22160f() {
                }

                @Override // com.zing.zalo.adapters.ViewOnClickListenerC7267y0.a
                /* renamed from: a */
                public final void mo37023a(FolderItem folderItem, int i11) {
                    MediaPickerView.m72122cP(MediaPickerView.this, folderItem, i11);
                }
            }, m72168tN().m115640A1());
            this.f66533T0 = m87746pL;
            if (m87746pL != null && m92648SI() != null) {
                m87746pL.m88275hL(new C12786b1());
                m87746pL.m92602UK(m92662fJ(), m87746pL.m87764wL());
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: cO */
    private final void m72121cO() {
        m72108RN(new C12829v(null));
    }

    /* renamed from: cP */
    public static final void m72122cP(MediaPickerView mediaPickerView, FolderItem folderItem, int i11) {
        AbstractC19074t.m100208f(mediaPickerView, "this$0");
        mediaPickerView.m72168tN().m115669Q2(i11);
    }

    /* renamed from: dN */
    private final ContentObserver m72124dN() {
        return (ContentObserver) this.f66555p1.getValue();
    }

    /* renamed from: dO */
    private final void m72125dO() {
        m72108RN(new C12831w(null));
    }

    /* renamed from: dP */
    public final void m72126dP(boolean z11) {
        if (z11) {
            m72112WM().f140106P.setVisibility(0);
            m72112WM().f140118b0.setVisibility(0);
        } else {
            m72112WM().f140106P.setVisibility(8);
            m72112WM().f140118b0.setVisibility(8);
        }
    }

    /* renamed from: eN */
    public final ScrollControlGridLayoutManager m72128eN() {
        return (ScrollControlGridLayoutManager) this.f66530Q0.getValue();
    }

    /* renamed from: eO */
    private final void m72129eO() {
        m72108RN(new C12833x(null));
    }

    /* renamed from: eP */
    private final void m72130eP() {
        if (m72168tN().m115641A2()) {
            m72163rO();
            m72086DO();
        } else if (m72168tN().m115714m2()) {
            m72160qO();
        } else if (m72168tN().m115652I2()) {
            m72086DO();
        } else {
            m72163rO();
        }
    }

    /* renamed from: fO */
    private final void m72132fO() {
        m72108RN(new C12835y(null));
    }

    /* renamed from: fP */
    private final void m72133fP() {
        m72115YN();
        m72119bO();
        m72125dO();
        m72175wO();
        m72181zO();
        m72118aO();
        m72171uO();
        m72117ZN();
        m72173vO();
        m72129eO();
        m72132fO();
        m72080BO();
        m72166sO();
        m72077AO();
        m72169tO();
        if (m72168tN().m115739z2()) {
            m72179yO();
            m72138hO();
            m72136gO();
            m72177xO();
        }
        m72141iO();
        m72148lO();
        m72143jO();
        m72153nO();
        m72146kO();
        m72151mO();
        m72121cO();
        if (m72168tN().m115641A2()) {
            m72156oO();
            m72083CO();
        } else if (m72168tN().m115714m2()) {
            m72158pO();
        } else if (m72168tN().m115652I2()) {
            m72083CO();
        } else {
            m72156oO();
        }
    }

    /* renamed from: gN */
    private final boolean m72135gN() {
        return ((Boolean) this.f66545f1.mo107536b(this, f66524s1[0])).booleanValue();
    }

    /* renamed from: gO */
    private final void m72136gO() {
        m72108RN(new C12837z(null));
    }

    /* renamed from: hO */
    private final void m72138hO() {
        m72108RN(new C12782a0(null));
    }

    /* renamed from: i2 */
    private final void m72139i2() {
        C12807k c12807k = new C12807k(m72112WM().f140116Z, AbstractC23136l9.m118665N(getContext(), AbstractC16803z.thumb_drawable), AbstractC23136l9.m118665N(getContext(), AbstractC17466e.transparent), AbstractC23136l9.m118665N(getContext(), AbstractC16803z.thumb_drawable), AbstractC23136l9.m118665N(getContext(), AbstractC17466e.transparent));
        c12807k.m65929g0(m72116ZM().f138754q);
        c12807k.m114844Y(this.f66528O0);
        this.f66531R0 = c12807k;
    }

    /* renamed from: iO */
    private final void m72141iO() {
        m72108RN(new C12785b0(null));
    }

    /* renamed from: jO */
    private final void m72143jO() {
        m72108RN(new C12788c0(null));
    }

    /* renamed from: jP */
    public final void m72144jP(boolean z11) {
        m72112WM().f140111U.setChecked(z11);
    }

    /* renamed from: kO */
    private final void m72146kO() {
        m72108RN(new C12791d0(null));
    }

    /* renamed from: lO */
    private final void m72148lO() {
        m72108RN(new C12794e0(null));
    }

    /* renamed from: lP */
    public final void m72149lP(int i11) {
        boolean z11;
        Drawable m118665N;
        int i12;
        boolean z12;
        int m3769e3;
        String m92653YI;
        int i13;
        if (i11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        m72112WM().f140109S.setEnabled(z11);
        m72112WM().f140108R.setEnabled(z11);
        int i14 = 8;
        if (m72168tN().m115641A2()) {
            RecyclingImageView recyclingImageView = m72112WM().f140108R;
            if (z11) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            recyclingImageView.setVisibility(i13);
        } else {
            if (z11) {
                m118665N = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.fab_sendphoto_active);
            } else {
                m118665N = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.fab_sendphoto_disable);
            }
            m72112WM().f140109S.setImageDrawable(m118665N);
        }
        m72112WM().f140114X.setText(String.valueOf(i11));
        RoundedRobotoTextView roundedRobotoTextView = m72112WM().f140114X;
        if (z11) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        roundedRobotoTextView.setVisibility(i12);
        if (z11 && !m72168tN().m115739z2() && !m72168tN().m115641A2()) {
            z12 = true;
        } else {
            z12 = false;
        }
        RobotoTextView robotoTextView = m72112WM().f140117a0;
        if (z12) {
            i14 = 0;
        }
        robotoTextView.setVisibility(i14);
        RobotoTextView robotoTextView2 = m72112WM().f140117a0;
        if (m72168tN().m115739z2()) {
            m92653YI = m92653YI(AbstractC8020f0.str_selected_photo_count_unlimit, Integer.valueOf(i11));
        } else {
            int i15 = AbstractC8020f0.str_selected_photo_count;
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(i11);
            if (m72168tN().m115726s2()) {
                m3769e3 = 20;
            } else {
                m3769e3 = AbstractC0924m0.m3769e3();
            }
            objArr[1] = Integer.valueOf(m3769e3);
            m92653YI = m92653YI(i15, objArr);
        }
        robotoTextView2.setText(m92653YI);
    }

    /* renamed from: mO */
    private final void m72151mO() {
        m72108RN(new C12797f0(null));
    }

    /* renamed from: nO */
    private final void m72153nO() {
        m72108RN(new C12800g0(null));
    }

    /* renamed from: oN */
    private final C22164j m72155oN() {
        if (m92662fJ() != null) {
            return m72168tN();
        }
        C24559a.m127933c("CommonZaloview", "View model is called while zaloViewManager is null");
        return null;
    }

    /* renamed from: oO */
    private final void m72156oO() {
        m72108RN(new C12802h0(null));
    }

    /* renamed from: pO */
    private final void m72158pO() {
        m72108RN(new C12804i0(null));
    }

    /* renamed from: qO */
    private final void m72160qO() {
        m72108RN(new C12806j0(null));
    }

    /* renamed from: rN */
    public static final Bundle m72162rN(int i11, EnumC22962a enumC22962a, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, ArrayList arrayList, int i12, String str, SensitiveData sensitiveData) {
        return Companion.m72257b(i11, enumC22962a, z11, z12, z13, z14, z15, arrayList, i12, str, sensitiveData);
    }

    /* renamed from: rO */
    private final void m72163rO() {
        m72108RN(new C12808k0(null));
    }

    /* renamed from: sN */
    private final ContentObserver m72165sN() {
        return (ContentObserver) this.f66556q1.getValue();
    }

    /* renamed from: sO */
    private final void m72166sO() {
        m72108RN(new C12810l0(null));
    }

    /* renamed from: tN */
    public final C22164j m72168tN() {
        return (C22164j) this.f66527N0.getValue();
    }

    /* renamed from: tO */
    private final void m72169tO() {
        m72108RN(new C12812m0(null));
    }

    /* renamed from: uO */
    private final void m72171uO() {
        m72108RN(new C12814n0(null));
    }

    /* renamed from: vO */
    private final void m72173vO() {
        m72108RN(new C12816o0(null));
    }

    /* renamed from: wO */
    private final void m72175wO() {
        m72108RN(new C12818p0(null));
    }

    /* renamed from: xO */
    private final void m72177xO() {
        m72108RN(new C12820q0(null));
    }

    /* renamed from: yO */
    private final void m72179yO() {
        m72108RN(new C12822r0(null));
    }

    /* renamed from: zO */
    private final void m72181zO() {
        m72108RN(new C12824s0(null));
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        int i11;
        C25470c m131954b;
        super.mo37111CJ(bundle);
        if (bundle != null && (i11 = bundle.getInt("SAVE_MEDIA_PICKER_VIEW_DATA_RETAIN", -1)) != -1 && (m131954b = C25471d.m131951c().m131954b(i11)) != null) {
            C22164j m72168tN = m72168tN();
            AbstractC19074t.m100205c(m131954b);
            m72168tN.m115673S2(m131954b);
        }
        m72168tN().m115683W2(C12840b.Companion.m72450a(m92642L3()));
        MainApplication.C6895a c6895a = MainApplication.Companion;
        c6895a.m35500c().getContentResolver().registerContentObserver(C18826a.f94117c, true, m72124dN());
        c6895a.m35500c().getContentResolver().registerContentObserver(C18826a.f94118d, true, m72165sN());
        this.f66557r1 = true;
        this.f66549j1 = true;
        m72091FN();
    }

    @Override // com.zing.zalo.p077ui.picker.mediapicker.C12839a.c
    /* renamed from: En */
    public void mo72182En(MediaItem mediaItem, AnimationTarget animationTarget, int i11, C20275e c20275e) {
        if (mediaItem != null && m92672lJ()) {
            AbstractC17927b.Companion.m94536b().mo94527a("IS_PROCESSING_PHOTO_CLICKED", new Runnable() { // from class: l90.g

                /* renamed from: q */
                public final /* synthetic */ MediaItem f109087q;

                /* renamed from: r */
                public final /* synthetic */ AnimationTarget f109088r;

                /* renamed from: s */
                public final /* synthetic */ int f109089s;

                /* renamed from: t */
                public final /* synthetic */ C20275e f109090t;

                public /* synthetic */ RunnableC22161g(MediaItem mediaItem2, AnimationTarget animationTarget2, int i112, C20275e c20275e2) {
                    r2 = mediaItem2;
                    r3 = animationTarget2;
                    r4 = i112;
                    r5 = c20275e2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MediaPickerView.m72089EO(MediaPickerView.this, r2, r3, r4, r5);
                }
            }, 500L);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        this.f66543d1 = (AbstractC30151z7) AbstractC1673g.m8554e(layoutInflater, AbstractC7409c0.media_picker_view, viewGroup, false);
        this.f66544e1 = C29939n3.m148269a(m72112WM().getRoot());
        m72112WM().m8503J(this);
        m72112WM().mo147724Q(m72168tN());
        m72094GN();
        View root = m72112WM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: HM */
    public final void m72183HM(MediaItem mediaItem) {
        AbstractC19074t.m100208f(mediaItem, "item");
        m72168tN().m115639A0(mediaItem);
    }

    /* renamed from: HN */
    public final boolean m72184HN() {
        return m72168tN().m115701g2();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        MainApplication.C6895a c6895a = MainApplication.Companion;
        c6895a.m35500c().getContentResolver().unregisterContentObserver(m72124dN());
        c6895a.m35500c().getContentResolver().unregisterContentObserver(m72165sN());
    }

    /* renamed from: IN */
    public final boolean m72185IN() {
        return this.f66548i1;
    }

    /* renamed from: IO */
    public final void m72186IO(MediaItem mediaItem) {
        AbstractC19074t.m100208f(mediaItem, "deletedItem");
        m72168tN().m115710k3(mediaItem);
    }

    @Override // com.zing.zalo.p077ui.picker.mediapicker.C12839a.c
    /* renamed from: J6 */
    public void mo72187J6(int[] iArr) {
        QuickPickerView.InterfaceC12654p interfaceC12654p = this.f66535V0;
        if (interfaceC12654p != null) {
            interfaceC12654p.mo71304b(iArr);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        this.f66543d1 = null;
        this.f66544e1 = null;
        this.f66532S0 = false;
    }

    /* renamed from: JN */
    public final boolean m72188JN(ArrayList arrayList) {
        if (this.f66546g1 && m72168tN().m115706i2(arrayList)) {
            return true;
        }
        return false;
    }

    /* renamed from: JO */
    public final void m72189JO(List list) {
        C22164j m72155oN = m72155oN();
        if (m72155oN != null) {
            m72155oN.m115715m3(list);
        }
    }

    /* renamed from: LN */
    public final boolean m72190LN() {
        C22164j m72155oN = m72155oN();
        if (m72155oN != null) {
            return m72155oN.m115703h2();
        }
        return false;
    }

    /* renamed from: LO */
    public final void m72191LO() {
        m72168tN().m115720o3();
    }

    /* renamed from: MN */
    public final boolean m72192MN() {
        if (m92662fJ() != null && m72128eN().m9737T1() == 0 && !m72110UM().m72403b0() && !m72110UM().m72402a0()) {
            return true;
        }
        return false;
    }

    /* renamed from: MO */
    public final void m72193MO() {
        m72168tN().m115721p3();
    }

    @Override // com.zing.zalo.p077ui.picker.mediapicker.C12839a.c
    /* renamed from: Md */
    public void mo72194Md(MediaItem mediaItem, boolean z11, int i11, boolean z12) {
        AbstractC19074t.m100208f(mediaItem, "mediaItem");
        m72105NO(new C12836y0(mediaItem, z11, i11, z12));
    }

    /* renamed from: NN */
    public final boolean m72195NN() {
        return m72110UM().m72407f0();
    }

    /* renamed from: Nf */
    public final void m72196Nf(List list) {
        AbstractC19074t.m100208f(list, "externalSelectedItems");
        m72168tN().m115738z0(list);
    }

    /* renamed from: ON */
    public final boolean m72197ON(MediaItem mediaItem) {
        AbstractC19074t.m100208f(mediaItem, "photo");
        return m72168tN().m115722q2(mediaItem);
    }

    /* renamed from: OO */
    public final void m72198OO(int i11) {
        m72112WM().f140116Z.m9837K1(i11);
    }

    /* renamed from: PM */
    public final void m72199PM(List list) {
        C22164j m72155oN = m72155oN();
        if (m72155oN != null) {
            m72155oN.m115660N0(list);
        }
    }

    /* renamed from: PN */
    public final boolean m72200PN() {
        MenuListPopupView menuListPopupView = this.f66533T0;
        if (menuListPopupView != null) {
            return menuListPopupView.m92687sJ();
        }
        return false;
    }

    /* renamed from: PO */
    public final void m72201PO(boolean z11) {
        this.f66548i1 = z11;
    }

    /* renamed from: Pq */
    public final void m72202Pq() {
        m72110UM().m10008p();
    }

    /* renamed from: QN */
    public final boolean m72203QN() {
        return this.f66547h1;
    }

    /* renamed from: QO */
    public final void m72204QO(QuickPickerView.InterfaceC12654p interfaceC12654p) {
        this.f66535V0 = interfaceC12654p;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        this.f66557r1 = false;
        m72106OM(false, false);
    }

    /* renamed from: RM */
    public final void m72205RM(List list) {
        C22164j m72155oN = m72155oN();
        if (m72155oN != null) {
            m72155oN.m115663O0(list);
        }
    }

    /* renamed from: RO */
    public final void m72206RO(boolean z11) {
        m72168tN().m115723q3(z11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        bundle.putInt("SAVE_MEDIA_PICKER_VIEW_DATA_RETAIN", C25471d.m131951c().m131953a(m72168tN().m115675T2()));
        m72255zN();
    }

    /* renamed from: SN */
    public final void m72207SN(int i11, SensitiveData sensitiveData) {
        AbstractC19074t.m100208f(sensitiveData, "sensitiveData");
        m72168tN().m115656L2(i11, sensitiveData);
    }

    /* renamed from: SO */
    public final void m72208SO(InterfaceC12784b interfaceC12784b) {
        this.f66540a1 = interfaceC12784b;
    }

    /* renamed from: TM */
    public final List m72209TM() {
        List m131502j;
        List m115667Q0;
        C22164j m72155oN = m72155oN();
        if (m72155oN == null || (m115667Q0 = m72155oN.m115667Q0()) == null) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        return m115667Q0;
    }

    /* renamed from: TN */
    public final void m72210TN(int i11, SensitiveData sensitiveData) {
        AbstractC19074t.m100208f(sensitiveData, "sensitiveData");
        m72168tN().m115658M2(i11, sensitiveData);
    }

    /* renamed from: TO */
    public final void m72211TO(QuickPickerView.InterfaceC12655q interfaceC12655q) {
        this.f66538Y0 = interfaceC12655q;
    }

    /* renamed from: UN */
    public final void m72212UN(int i11, SensitiveData sensitiveData) {
        AbstractC19074t.m100208f(sensitiveData, "sensitiveData");
        m72105NO(new C12819q(i11, sensitiveData));
    }

    /* renamed from: VM */
    public final List m72213VM() {
        List m131502j;
        List m115678V0;
        C22164j m72155oN = m72155oN();
        if (m72155oN == null || (m115678V0 = m72155oN.m115678V0()) == null) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        return m115678V0;
    }

    /* renamed from: VN */
    public final void m72214VN(int i11) {
        m72110UM().m10009q(i11);
    }

    /* renamed from: VO */
    public final void m72215VO(InterfaceC12787c interfaceC12787c) {
        this.f66537X0 = interfaceC12787c;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: WJ */
    public void mo72216WJ(boolean z11) {
        super.mo72216WJ(z11);
        m72106OM(z11, true);
    }

    /* renamed from: WO */
    public final void m72217WO(InterfaceC12790d interfaceC12790d) {
        this.f66536W0 = interfaceC12790d;
    }

    /* renamed from: XM */
    public final View m72218XM() {
        try {
            if (m72168tN().m115701g2()) {
                View childAt = m72112WM().f140116Z.getChildAt(0);
                if ((childAt instanceof ViewGroup) && m72112WM().f140116Z.m9817A0(childAt) == 0) {
                    return ((ViewGroup) childAt).getChildAt(0);
                }
                return null;
            }
            return null;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return null;
        }
    }

    /* renamed from: XO */
    public final void m72219XO(InterfaceC12793e interfaceC12793e) {
        this.f66534U0 = interfaceC12793e;
    }

    /* renamed from: YM */
    public final InterfaceC12784b m72220YM() {
        return this.f66540a1;
    }

    /* renamed from: YO */
    public final void m72221YO(QuickPickerView.InterfaceC12659u interfaceC12659u) {
        this.f66539Z0 = interfaceC12659u;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        this.f66532S0 = true;
        m72130eP();
        m72133fP();
        m72108RN(new C12783a1(null));
    }

    /* renamed from: ZO */
    public final void m72222ZO(boolean z11) {
        m72168tN().m115643B3(z11);
    }

    /* renamed from: aN */
    public final String m72223aN() {
        return m72168tN().m115686Y0();
    }

    /* renamed from: aP */
    public final void m72224aP(boolean z11) {
        this.f66547h1 = z11;
    }

    /* renamed from: bN */
    public final View m72225bN() {
        CheckCircle checkCircle = m72112WM().f140111U;
        AbstractC19074t.m100207e(checkCircle, "hdToggle");
        return checkCircle;
    }

    /* renamed from: bd */
    public final void m72226bd() {
        m72168tN().m115718n3();
    }

    /* renamed from: cN */
    public final QuickPickerView.InterfaceC12655q m72227cN() {
        return this.f66538Y0;
    }

    /* renamed from: fN */
    public final void m72228fN(int[] iArr) {
        if (!m72168tN().m115647E2()) {
            return;
        }
        RecyclerView.AbstractC1876c0 m9900t0 = m72112WM().f140116Z.m9900t0(m72110UM().m72405d0() ? 1 : 0);
        if (m9900t0 instanceof C12839a.d) {
            ((C12839a.d) m9900t0).f7784p.getLocationInWindow(iArr);
            QuickPickerView.InterfaceC12654p interfaceC12654p = this.f66535V0;
            if (interfaceC12654p != null) {
                interfaceC12654p.mo71305c(iArr);
            }
        }
    }

    /* renamed from: gP */
    public final void m72229gP(ActionBar actionBar) {
        AbstractC19074t.m100208f(actionBar, "actionBar");
        try {
            MenuListPopupView menuListPopupView = this.f66533T0;
            if (menuListPopupView != null && menuListPopupView.m87763vL() > 0 && System.currentTimeMillis() - menuListPopupView.m87763vL() < 300) {
                menuListPopupView.m87753BL();
                return;
            }
            MenuListPopupView menuListPopupView2 = this.f66533T0;
            if (menuListPopupView2 != null) {
                AbstractC19074t.m100205c(menuListPopupView2);
                if (menuListPopupView2.m92687sJ()) {
                    m72076AN();
                    return;
                }
            }
            InterfaceC12793e interfaceC12793e = this.f66534U0;
            if (interfaceC12793e != null) {
                interfaceC12793e.mo71311a();
            }
            m72120bP(actionBar);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "MediaPickerView";
    }

    /* renamed from: gt */
    public final void m72230gt(int i11) {
        m72168tN().m115727s3(i11);
    }

    /* renamed from: hN */
    public final MediaItem m72231hN(String str) {
        return m72110UM().m72400Y(str);
    }

    /* renamed from: hP */
    public final void m72232hP() {
        if (this.f66532S0) {
            m72168tN().m115648F3();
        }
    }

    /* renamed from: iN */
    public final int m72233iN() {
        return m72168tN().m115705i1();
    }

    /* renamed from: iP */
    public final void m72234iP(boolean z11) {
        m72168tN().m115650G3(z11);
    }

    /* renamed from: jN */
    public final InterfaceC12790d m72235jN() {
        return this.f66536W0;
    }

    /* renamed from: kN */
    public final InterfaceC12793e m72236kN() {
        return this.f66534U0;
    }

    /* renamed from: kP */
    public final void m72237kP(MediaItem mediaItem) {
        AbstractC19074t.m100208f(mediaItem, "mediaItem");
        m72168tN().m115651H3(mediaItem);
    }

    /* renamed from: lN */
    public final QuickPickerView.InterfaceC12659u m72238lN() {
        return this.f66539Z0;
    }

    /* renamed from: mN */
    public final int m72239mN() {
        return m72168tN().m115729u1();
    }

    /* renamed from: mP */
    public final void m72240mP(boolean z11) {
        if (z11) {
            m72104NM();
        } else {
            m72168tN().m115723q3(false);
        }
    }

    /* renamed from: nN */
    public final InterfaceC20079a m72241nN() {
        return this.f66526M0;
    }

    /* renamed from: nP */
    public final void m72242nP(List list, List list2) {
        AbstractC19074t.m100208f(list, "selectedList");
        AbstractC19074t.m100208f(list2, "modifiedList");
        m72168tN().m115659M3(list, list2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.hd_text) {
            m72144jP(!m72112WM().f140111U.isChecked());
            m72240mP(m72112WM().f140111U.isChecked());
        } else if (id2 == AbstractC6918a0.hd_toggle) {
            m72240mP(m72112WM().f140111U.isChecked());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        AbstractC19074t.m100208f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        m72076AN();
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(iArr, "grantResults");
        if (i11 == 153 && m72100KN()) {
            C22164j.m115594a3(m72168tN(), false, true, 1, null);
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m72076AN();
        boolean m72100KN = m72100KN();
        if (m72100KN != m72135gN() && m72100KN) {
            C22164j.m115594a3(m72168tN(), false, true, 1, null);
        }
        m72111UO(m72100KN);
        if (getContext() instanceof ZaloBubbleActivity) {
            Context context = getContext();
            AbstractC19074t.m100205c(context);
            int m118766z = AbstractC23136l9.m118766z(context);
            Context context2 = getContext();
            AbstractC19074t.m100205c(context2);
            int m118763y = AbstractC23136l9.m118763y(context2);
            int i11 = 3;
            if (m118766z * m118763y != 0 && m118763y <= m118766z) {
                i11 = (m118766z * 3) / m118763y;
            }
            this.f66528O0 = i11;
            m72128eN().m9670e3(this.f66528O0);
            m72110UM().m10008p();
        }
        m72106OM(true, false);
        if (this.f66549j1) {
            this.f66549j1 = false;
        }
    }

    /* renamed from: pN */
    public final MediaItem m72243pN(String str) {
        AbstractC19074t.m100208f(str, "path");
        return m72168tN().m115642B1(str);
    }

    @Override // com.zing.zalo.p077ui.picker.mediapicker.C12839a.c
    /* renamed from: q7 */
    public void mo72244q7(MediaItem mediaItem, AnimationTarget animationTarget, int i11, C20275e c20275e) {
        if (mediaItem != null) {
            m72168tN().m115691b2(new C21280a(mediaItem, animationTarget, i11, c20275e, "", ""));
        }
    }

    /* renamed from: qN */
    public final List m72245qN() {
        List m131502j;
        List m115644C1;
        C22164j m72155oN = m72155oN();
        if (m72155oN == null || (m115644C1 = m72155oN.m115644C1()) == null) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        return m115644C1;
    }

    @Override // com.zing.zalo.p077ui.picker.mediapicker.C12839a.c
    /* renamed from: t2 */
    public void mo72246t2() {
        boolean z11;
        String[] m118189y;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            z11 = AbstractC23034c6.m118124J(m92689tK());
        } else {
            z11 = false;
        }
        if (!z11 && m72100KN()) {
            return;
        }
        if (i11 >= 34 && z11) {
            m118189y = AbstractC23034c6.m118187x();
        } else {
            m118189y = AbstractC23034c6.m118189y();
        }
        AbstractC23034c6.m118184v0(this, m118189y, 153);
    }

    /* renamed from: uN */
    public final void m72247uN() {
        int i11;
        if (m72168tN().m115646D2()) {
            int dimensionPixelSize = m92651WI().getDimensionPixelSize(AbstractC17454d.action_bar_default_height);
            if (m72168tN().m115724r2()) {
                if (!m92692wK().mo35576n3()) {
                    i11 = AbstractC32226c.m155411j(m92676n2()).top;
                    dimensionPixelSize += i11;
                }
                m72112WM().f140113W.setPadding(0, dimensionPixelSize, 0, 0);
            }
            if (AbstractC32226c.m155414m(this)) {
                i11 = AbstractC32226c.m155411j(m92676n2()).top;
                dimensionPixelSize += i11;
            }
            m72112WM().f140113W.setPadding(0, dimensionPixelSize, 0, 0);
        }
    }

    /* renamed from: vN */
    public final void m72248vN(MediaItem mediaItem) {
        AbstractC19074t.m100208f(mediaItem, "videoItem");
        InterfaceC12787c interfaceC12787c = this.f66537X0;
        if (interfaceC12787c != null) {
            interfaceC12787c.mo71512a(mediaItem);
        }
    }

    @Override // com.zing.zalo.p077ui.picker.mediapicker.C12839a.c
    /* renamed from: w1 */
    public void mo72249w1(View view) {
        InterfaceC12784b interfaceC12784b;
        if (m72168tN().m115701g2() && (interfaceC12784b = this.f66540a1) != null) {
            interfaceC12784b.mo71309d(view);
        }
    }

    @Override // com.zing.zalo.p077ui.picker.mediapicker.C12839a.c
    /* renamed from: wH */
    public int mo72250wH(MediaItem mediaItem) {
        AbstractC19074t.m100208f(mediaItem, "mediaItem");
        return m72168tN().m115692c1(mediaItem);
    }

    /* renamed from: wN */
    public final boolean m72251wN() {
        return m72110UM().m72404c0();
    }

    @Override // com.zing.zalo.p077ui.picker.mediapicker.C12839a.c
    /* renamed from: xG */
    public void mo72252xG(MediaItem mediaItem, int i11) {
        AbstractC19074t.m100208f(mediaItem, "mediaItem");
        if (m72168tN().m115717n2()) {
            return;
        }
        C23081g9.m118410g(30L);
        m72105NO(new C12838z0(mediaItem, i11));
        C27962a c27962a = this.f66542c1;
        if (c27962a == null) {
            AbstractC19074t.m100223u("dragSelectTouchListener");
            c27962a = null;
        }
        c27962a.m140943w(m72112WM().f140116Z.getHeight());
        c27962a.m140935A(AbstractC23136l9.m118712h(m92689tK(), 50.0f));
        c27962a.m140940r(i11);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            m72247uN();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: xN */
    public final boolean m72253xN() {
        return m72168tN().m115696d2();
    }

    /* renamed from: yN */
    public final boolean m72254yN() {
        C22164j m72155oN = m72155oN();
        if (m72155oN != null) {
            return m72155oN.m115697e2();
        }
        return false;
    }

    /* renamed from: zN */
    public final void m72255zN() {
        AbstractC11859g abstractC11859g;
        RecyclerView.AbstractC1887n abstractC1887n = this.f66531R0;
        if (abstractC1887n != null) {
            if (abstractC1887n instanceof AbstractC11859g) {
                abstractC11859g = (AbstractC11859g) abstractC1887n;
            } else {
                abstractC11859g = null;
            }
            if (abstractC11859g != null) {
                abstractC11859g.mo65930u();
            }
        }
    }
}
